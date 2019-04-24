// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.*;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

// Referenced classes of package com.google.android.exoplayer2.util:
//			Util

public class EventLogger
	implements AnalyticsListener
{

	public EventLogger(MappingTrackSelector mappingtrackselector)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		trackSelector = mappingtrackselector;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #58  <Field MappingTrackSelector trackSelector>
	//    5    9:aload_0         
	//    6   10:new             #60  <Class com.google.android.exoplayer2.Timeline$Window>
	//    7   13:dup             
	//    8   14:invokespecial   #61  <Method void com.google.android.exoplayer2.Timeline$Window()>
	//    9   17:putfield        #63  <Field com.google.android.exoplayer2.Timeline$Window window>
	//   10   20:aload_0         
	//   11   21:new             #65  <Class com.google.android.exoplayer2.Timeline$Period>
	//   12   24:dup             
	//   13   25:invokespecial   #66  <Method void com.google.android.exoplayer2.Timeline$Period()>
	//   14   28:putfield        #68  <Field com.google.android.exoplayer2.Timeline$Period period>
	//   15   31:aload_0         
	//   16   32:invokestatic    #74  <Method long SystemClock.elapsedRealtime()>
	//   17   35:putfield        #76  <Field long startTimeMs>
	//   18   38:return          
	}

	private static String getAdaptiveSupportString(int i, int j)
	{
		if(i < 2)
	//*   0    0:iload_0         
	//*   1    1:iconst_2        
	//*   2    2:icmpge          8
			return "N/A";
	//    3    5:ldc1            #81  <String "N/A">
	//    4    7:areturn         
		if(j != 0)
	//*   5    8:iload_1         
	//*   6    9:ifeq            33
		{
			if(j != 8)
	//*   7   12:iload_1         
	//*   8   13:bipush          8
	//*   9   15:icmpeq          30
			{
				if(j != 16)
	//*  10   18:iload_1         
	//*  11   19:bipush          16
	//*  12   21:icmpeq          27
					return "?";
	//   13   24:ldc1            #83  <String "?">
	//   14   26:areturn         
				else
					return "YES";
	//   15   27:ldc1            #85  <String "YES">
	//   16   29:areturn         
			} else
			{
				return "YES_NOT_SEAMLESS";
	//   17   30:ldc1            #87  <String "YES_NOT_SEAMLESS">
	//   18   32:areturn         
			}
		} else
		{
			return "NO";
	//   19   33:ldc1            #89  <String "NO">
	//   20   35:areturn         
		}
	}

	private static String getDiscontinuityReasonString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 51
	//	               1 48
	//	               2 45
	//	               3 42
	//	               4 39
		default:
			return "?";
	//    2   36:ldc1            #83  <String "?">
	//    3   38:areturn         

		case 4: // '\004'
			return "INTERNAL";
	//    4   39:ldc1            #93  <String "INTERNAL">
	//    5   41:areturn         

		case 3: // '\003'
			return "AD_INSERTION";
	//    6   42:ldc1            #95  <String "AD_INSERTION">
	//    7   44:areturn         

		case 2: // '\002'
			return "SEEK_ADJUSTMENT";
	//    8   45:ldc1            #97  <String "SEEK_ADJUSTMENT">
	//    9   47:areturn         

		case 1: // '\001'
			return "SEEK";
	//   10   48:ldc1            #99  <String "SEEK">
	//   11   50:areturn         

		case 0: // '\0'
			return "PERIOD_TRANSITION";
	//   12   51:ldc1            #101 <String "PERIOD_TRANSITION">
	//   13   53:areturn         
		}
	}

	private String getEventString(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(" [");
	//    8   14:aload_3         
	//    9   15:ldc1            #112 <String " [">
	//   10   17:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(getEventTimeString(eventtime));
	//   12   21:aload_3         
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:invokespecial   #116 <Method String getEventTimeString(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime)>
	//   16   27:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
		stringbuilder.append("]");
	//   18   31:aload_3         
	//   19   32:ldc1            #118 <String "]">
	//   20   34:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             
		return stringbuilder.toString();
	//   22   38:aload_3         
	//   23   39:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   24   42:areturn         
	}

	private String getEventString(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(s);
	//    4    9:aload           4
	//    5   11:aload_2         
	//    6   12:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(" [");
	//    8   16:aload           4
	//    9   18:ldc1            #112 <String " [">
	//   10   20:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(getEventTimeString(eventtime));
	//   12   24:aload           4
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokespecial   #116 <Method String getEventTimeString(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime)>
	//   16   31:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		stringbuilder.append(", ");
	//   18   35:aload           4
	//   19   37:ldc1            #125 <String ", ">
	//   20   39:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		stringbuilder.append(s1);
	//   22   43:aload           4
	//   23   45:aload_3         
	//   24   46:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append("]");
	//   26   50:aload           4
	//   27   52:ldc1            #118 <String "]">
	//   28   54:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
		return stringbuilder.toString();
	//   30   58:aload           4
	//   31   60:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   32   63:areturn         
	}

	private String getEventTimeString(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("window=");
	//    4    8:aload_2         
	//    5    9:ldc1            #127 <String "window=">
	//    6   11:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(eventtime.windowIndex);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:getfield        #132 <Field int com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.windowIndex>
	//   11   20:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		Object obj1 = ((Object) (((StringBuilder) (obj)).toString()));
	//   13   24:aload_2         
	//   14   25:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   15   28:astore_3        
		obj = obj1;
	//   16   29:aload_3         
	//   17   30:astore_2        
		if(eventtime.mediaPeriodId != null)
	//*  18   31:aload_1         
	//*  19   32:getfield        #139 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.mediaPeriodId>
	//*  20   35:ifnull          164
		{
			obj = ((Object) (new StringBuilder()));
	//   21   38:new             #105 <Class StringBuilder>
	//   22   41:dup             
	//   23   42:invokespecial   #106 <Method void StringBuilder()>
	//   24   45:astore_2        
			((StringBuilder) (obj)).append(((String) (obj1)));
	//   25   46:aload_2         
	//   26   47:aload_3         
	//   27   48:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   28   51:pop             
			((StringBuilder) (obj)).append(", period=");
	//   29   52:aload_2         
	//   30   53:ldc1            #141 <String ", period=">
	//   31   55:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   32   58:pop             
			((StringBuilder) (obj)).append(eventtime.mediaPeriodId.periodIndex);
	//   33   59:aload_2         
	//   34   60:aload_1         
	//   35   61:getfield        #139 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.mediaPeriodId>
	//   36   64:getfield        #146 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   37   67:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   38   70:pop             
			obj1 = ((Object) (((StringBuilder) (obj)).toString()));
	//   39   71:aload_2         
	//   40   72:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   41   75:astore_3        
			obj = obj1;
	//   42   76:aload_3         
	//   43   77:astore_2        
			if(eventtime.mediaPeriodId.isAd())
	//*  44   78:aload_1         
	//*  45   79:getfield        #139 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.mediaPeriodId>
	//*  46   82:invokevirtual   #150 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*  47   85:ifeq            164
			{
				obj = ((Object) (new StringBuilder()));
	//   48   88:new             #105 <Class StringBuilder>
	//   49   91:dup             
	//   50   92:invokespecial   #106 <Method void StringBuilder()>
	//   51   95:astore_2        
				((StringBuilder) (obj)).append(((String) (obj1)));
	//   52   96:aload_2         
	//   53   97:aload_3         
	//   54   98:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   55  101:pop             
				((StringBuilder) (obj)).append(", adGroup=");
	//   56  102:aload_2         
	//   57  103:ldc1            #152 <String ", adGroup=">
	//   58  105:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   59  108:pop             
				((StringBuilder) (obj)).append(eventtime.mediaPeriodId.adGroupIndex);
	//   60  109:aload_2         
	//   61  110:aload_1         
	//   62  111:getfield        #139 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.mediaPeriodId>
	//   63  114:getfield        #155 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//   64  117:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   65  120:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   66  121:aload_2         
	//   67  122:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   68  125:astore_2        
				obj1 = ((Object) (new StringBuilder()));
	//   69  126:new             #105 <Class StringBuilder>
	//   70  129:dup             
	//   71  130:invokespecial   #106 <Method void StringBuilder()>
	//   72  133:astore_3        
				((StringBuilder) (obj1)).append(((String) (obj)));
	//   73  134:aload_3         
	//   74  135:aload_2         
	//   75  136:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   76  139:pop             
				((StringBuilder) (obj1)).append(", ad=");
	//   77  140:aload_3         
	//   78  141:ldc1            #157 <String ", ad=">
	//   79  143:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   80  146:pop             
				((StringBuilder) (obj1)).append(eventtime.mediaPeriodId.adIndexInAdGroup);
	//   81  147:aload_3         
	//   82  148:aload_1         
	//   83  149:getfield        #139 <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.mediaPeriodId>
	//   84  152:getfield        #160 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//   85  155:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   86  158:pop             
				obj = ((Object) (((StringBuilder) (obj1)).toString()));
	//   87  159:aload_3         
	//   88  160:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   89  163:astore_2        
			}
		}
		obj1 = ((Object) (new StringBuilder()));
	//   90  164:new             #105 <Class StringBuilder>
	//   91  167:dup             
	//   92  168:invokespecial   #106 <Method void StringBuilder()>
	//   93  171:astore_3        
		((StringBuilder) (obj1)).append(getTimeString(eventtime.realtimeMs - startTimeMs));
	//   94  172:aload_3         
	//   95  173:aload_1         
	//   96  174:getfield        #163 <Field long com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.realtimeMs>
	//   97  177:aload_0         
	//   98  178:getfield        #76  <Field long startTimeMs>
	//   99  181:lsub            
	//  100  182:invokestatic    #167 <Method String getTimeString(long)>
	//  101  185:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  102  188:pop             
		((StringBuilder) (obj1)).append(", ");
	//  103  189:aload_3         
	//  104  190:ldc1            #125 <String ", ">
	//  105  192:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  106  195:pop             
		((StringBuilder) (obj1)).append(getTimeString(eventtime.currentPlaybackPositionMs));
	//  107  196:aload_3         
	//  108  197:aload_1         
	//  109  198:getfield        #170 <Field long com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.currentPlaybackPositionMs>
	//  110  201:invokestatic    #167 <Method String getTimeString(long)>
	//  111  204:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  112  207:pop             
		((StringBuilder) (obj1)).append(", ");
	//  113  208:aload_3         
	//  114  209:ldc1            #125 <String ", ">
	//  115  211:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  116  214:pop             
		((StringBuilder) (obj1)).append(((String) (obj)));
	//  117  215:aload_3         
	//  118  216:aload_2         
	//  119  217:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  120  220:pop             
		return ((StringBuilder) (obj1)).toString();
	//  121  221:aload_3         
	//  122  222:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  123  225:areturn         
	}

	private static String getFormatSupportString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 51
	//	               1 48
	//	               2 45
	//	               3 42
	//	               4 39
		default:
			return "?";
	//    2   36:ldc1            #83  <String "?">
	//    3   38:areturn         

		case 4: // '\004'
			return "YES";
	//    4   39:ldc1            #85  <String "YES">
	//    5   41:areturn         

		case 3: // '\003'
			return "NO_EXCEEDS_CAPABILITIES";
	//    6   42:ldc1            #173 <String "NO_EXCEEDS_CAPABILITIES">
	//    7   44:areturn         

		case 2: // '\002'
			return "NO_UNSUPPORTED_DRM";
	//    8   45:ldc1            #175 <String "NO_UNSUPPORTED_DRM">
	//    9   47:areturn         

		case 1: // '\001'
			return "NO_UNSUPPORTED_TYPE";
	//   10   48:ldc1            #177 <String "NO_UNSUPPORTED_TYPE">
	//   11   50:areturn         

		case 0: // '\0'
			return "NO";
	//   12   51:ldc1            #89  <String "NO">
	//   13   53:areturn         
		}
	}

	private static String getRepeatModeString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 37
	//	               1 34
	//	               2 31
		default:
			return "?";
	//    2   28:ldc1            #83  <String "?">
	//    3   30:areturn         

		case 2: // '\002'
			return "ALL";
	//    4   31:ldc1            #180 <String "ALL">
	//    5   33:areturn         

		case 1: // '\001'
			return "ONE";
	//    6   34:ldc1            #182 <String "ONE">
	//    7   36:areturn         

		case 0: // '\0'
			return "OFF";
	//    8   37:ldc1            #184 <String "OFF">
	//    9   39:areturn         
		}
	}

	private static String getStateString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 4: default 32
	//	               1 44
	//	               2 41
	//	               3 38
	//	               4 35
		default:
			return "?";
	//    2   32:ldc1            #83  <String "?">
	//    3   34:areturn         

		case 4: // '\004'
			return "ENDED";
	//    4   35:ldc1            #187 <String "ENDED">
	//    5   37:areturn         

		case 3: // '\003'
			return "READY";
	//    6   38:ldc1            #189 <String "READY">
	//    7   40:areturn         

		case 2: // '\002'
			return "BUFFERING";
	//    8   41:ldc1            #191 <String "BUFFERING">
	//    9   43:areturn         

		case 1: // '\001'
			return "IDLE";
	//   10   44:ldc1            #193 <String "IDLE">
	//   11   46:areturn         
		}
	}

	private static String getTimeString(long l)
	{
		if(l == 0x1L)
	//*   0    0:lload_0         
	//*   1    1:ldc2w           #194 <Long 0x1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            11
			return "?";
	//    4    8:ldc1            #83  <String "?">
	//    5   10:areturn         
		else
			return TIME_FORMAT.format((float)l / 1000F);
	//    6   11:getstatic       #40  <Field NumberFormat TIME_FORMAT>
	//    7   14:lload_0         
	//    8   15:l2f             
	//    9   16:ldc1            #196 <Float 1000F>
	//   10   18:fdiv            
	//   11   19:f2d             
	//   12   20:invokevirtual   #200 <Method String NumberFormat.format(double)>
	//   13   23:areturn         
	}

	private static String getTimelineChangeReasonString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 37
	//	               1 34
	//	               2 31
		default:
			return "?";
	//    2   28:ldc1            #83  <String "?">
	//    3   30:areturn         

		case 2: // '\002'
			return "DYNAMIC";
	//    4   31:ldc1            #203 <String "DYNAMIC">
	//    5   33:areturn         

		case 1: // '\001'
			return "RESET";
	//    6   34:ldc1            #205 <String "RESET">
	//    7   36:areturn         

		case 0: // '\0'
			return "PREPARED";
	//    8   37:ldc1            #207 <String "PREPARED">
	//    9   39:areturn         
		}
	}

	private static String getTrackStatusString(TrackSelection trackselection, TrackGroup trackgroup, int i)
	{
		boolean flag;
		if(trackselection != null && trackselection.getTrackGroup() == trackgroup && trackselection.indexOf(i) != -1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          30
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #215 <Method TrackGroup TrackSelection.getTrackGroup()>
	//*   4   10:aload_1         
	//*   5   11:if_acmpne       30
	//*   6   14:aload_0         
	//*   7   15:iload_2         
	//*   8   16:invokeinterface #219 <Method int TrackSelection.indexOf(int)>
	//*   9   21:iconst_m1       
	//*  10   22:icmpeq          30
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_3        
		else
	//*  13   27:goto            32
			flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_3        
		return getTrackStatusString(flag);
	//   16   32:iload_3         
	//   17   33:invokestatic    #222 <Method String getTrackStatusString(boolean)>
	//   18   36:areturn         
	}

	private static String getTrackStatusString(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            7
			return "[X]";
	//    2    4:ldc1            #224 <String "[X]">
	//    3    6:areturn         
		else
			return "[ ]";
	//    4    7:ldc1            #226 <String "[ ]">
	//    5    9:areturn         
	}

	private static String getTrackTypeString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 5: default 40
	//	               0 95
	//	               1 92
	//	               2 89
	//	               3 86
	//	               4 83
	//	               5 80
		default:
			if(i >= 10000)
	//*   2   40:iload_0         
	//*   3   41:sipush          10000
	//*   4   44:icmplt          98
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   47:new             #105 <Class StringBuilder>
	//    6   50:dup             
	//    7   51:invokespecial   #106 <Method void StringBuilder()>
	//    8   54:astore_1        
				stringbuilder.append("custom (");
	//    9   55:aload_1         
	//   10   56:ldc1            #229 <String "custom (">
	//   11   58:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   12   61:pop             
				stringbuilder.append(i);
	//   13   62:aload_1         
	//   14   63:iload_0         
	//   15   64:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   16   67:pop             
				stringbuilder.append(")");
	//   17   68:aload_1         
	//   18   69:ldc1            #231 <String ")">
	//   19   71:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   20   74:pop             
				return stringbuilder.toString();
	//   21   75:aload_1         
	//   22   76:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   23   79:areturn         
			} else
	//*  24   80:ldc1            #233 <String "none">
	//*  25   82:areturn         
	//*  26   83:ldc1            #235 <String "metadata">
	//*  27   85:areturn         
	//*  28   86:ldc1            #237 <String "text">
	//*  29   88:areturn         
	//*  30   89:ldc1            #239 <String "video">
	//*  31   91:areturn         
	//*  32   92:ldc1            #241 <String "audio">
	//*  33   94:areturn         
	//*  34   95:ldc1            #243 <String "default">
	//*  35   97:areturn         
			{
				return "?";
	//   36   98:ldc1            #83  <String "?">
	//   37  100:areturn         
			}

		case 5: // '\005'
			return "none";

		case 4: // '\004'
			return "metadata";

		case 3: // '\003'
			return "text";

		case 2: // '\002'
			return "video";

		case 1: // '\001'
			return "audio";

		case 0: // '\0'
			return "default";
		}
	}

	private void logd(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, String s)
	{
		logd(getEventString(eventtime, s));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #247 <Method String getEventString(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    5    7:invokevirtual   #250 <Method void logd(String)>
	//    6   10:return          
	}

	private void logd(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, String s, String s1)
	{
		logd(getEventString(eventtime, s, s1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #253 <Method String getEventString(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6    8:invokevirtual   #250 <Method void logd(String)>
	//    7   11:return          
	}

	private void loge(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, String s, String s1, Throwable throwable)
	{
		loge(getEventString(eventtime, s, s1), throwable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #253 <Method String getEventString(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6    8:aload           4
	//    7   10:invokevirtual   #258 <Method void loge(String, Throwable)>
	//    8   13:return          
	}

	private void loge(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, String s, Throwable throwable)
	{
		loge(getEventString(eventtime, s), throwable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #247 <Method String getEventString(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    5    7:aload_3         
	//    6    8:invokevirtual   #258 <Method void loge(String, Throwable)>
	//    7   11:return          
	}

	private void printInternalError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, String s, Exception exception)
	{
		loge(eventtime, "internalError", s, ((Throwable) (exception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #263 <String "internalError">
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #265 <Method void loge(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String, Throwable)>
	//    6   10:return          
	}

	private void printMetadata(Metadata metadata, String s)
	{
		for(int i = 0; i < metadata.length(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #273 <Method int Metadata.length()>
	//*   5    7:icmpge          53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #105 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #106 <Method void StringBuilder()>
	//    9   17:astore          4
			stringbuilder.append(s);
	//   10   19:aload           4
	//   11   21:aload_2         
	//   12   22:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			stringbuilder.append(((Object) (metadata.get(i))));
	//   14   26:aload           4
	//   15   28:aload_1         
	//   16   29:iload_3         
	//   17   30:invokevirtual   #277 <Method com.google.android.exoplayer2.metadata.Metadata$Entry Metadata.get(int)>
	//   18   33:invokevirtual   #280 <Method StringBuilder StringBuilder.append(Object)>
	//   19   36:pop             
			logd(stringbuilder.toString());
	//   20   37:aload_0         
	//   21   38:aload           4
	//   22   40:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   23   43:invokevirtual   #250 <Method void logd(String)>
		}

	//   24   46:iload_3         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_3        
	//*  28   50:goto            2
	//   29   53:return          
	}

	protected void logd(String s)
	{
		Log.d("EventLogger", s);
	//    0    0:ldc1            #13  <String "EventLogger">
	//    1    2:aload_1         
	//    2    3:invokestatic    #286 <Method int Log.d(String, String)>
	//    3    6:pop             
	//    4    7:return          
	}

	protected void loge(String s, Throwable throwable)
	{
		Log.e("EventLogger", s, throwable);
	//    0    0:ldc1            #13  <String "EventLogger">
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokestatic    #290 <Method int Log.e(String, String, Throwable)>
	//    4    7:pop             
	//    5    8:return          
	}

	public void onAudioSessionId(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i)
	{
		logd(eventtime, "audioSessionId", Integer.toString(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #294 <String "audioSessionId">
	//    3    5:iload_2         
	//    4    6:invokestatic    #298 <Method String Integer.toString(int)>
	//    5    9:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6   12:return          
	}

	public void onAudioUnderrun(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i, long l, long l1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore          7
		stringbuilder.append(i);
	//    4    9:aload           7
	//    5   11:iload_2         
	//    6   12:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//    7   15:pop             
		stringbuilder.append(", ");
	//    8   16:aload           7
	//    9   18:ldc1            #125 <String ", ">
	//   10   20:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(l);
	//   12   24:aload           7
	//   13   26:lload_3         
	//   14   27:invokevirtual   #305 <Method StringBuilder StringBuilder.append(long)>
	//   15   30:pop             
		stringbuilder.append(", ");
	//   16   31:aload           7
	//   17   33:ldc1            #125 <String ", ">
	//   18   35:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		stringbuilder.append(l1);
	//   20   39:aload           7
	//   21   41:lload           5
	//   22   43:invokevirtual   #305 <Method StringBuilder StringBuilder.append(long)>
	//   23   46:pop             
		stringbuilder.append("]");
	//   24   47:aload           7
	//   25   49:ldc1            #118 <String "]">
	//   26   51:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		loge(eventtime, "audioTrackUnderrun", stringbuilder.toString(), ((Throwable) (null)));
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:ldc2            #307 <String "audioTrackUnderrun">
	//   31   60:aload           7
	//   32   62:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   33   65:aconst_null     
	//   34   66:invokespecial   #265 <Method void loge(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String, Throwable)>
	//   35   69:return          
	}

	public void onBandwidthEstimate(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i, long l, long l1)
	{
	//    0    0:return          
	}

	public void onDecoderDisabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i, DecoderCounters decodercounters)
	{
		logd(eventtime, "decoderDisabled", getTrackTypeString(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #312 <String "decoderDisabled">
	//    3    5:iload_2         
	//    4    6:invokestatic    #314 <Method String getTrackTypeString(int)>
	//    5    9:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6   12:return          
	}

	public void onDecoderEnabled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i, DecoderCounters decodercounters)
	{
		logd(eventtime, "decoderEnabled", getTrackTypeString(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #317 <String "decoderEnabled">
	//    3    5:iload_2         
	//    4    6:invokestatic    #314 <Method String getTrackTypeString(int)>
	//    5    9:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6   12:return          
	}

	public void onDecoderInitialized(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i, String s, long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append(getTrackTypeString(i));
	//    4    9:aload           6
	//    5   11:iload_2         
	//    6   12:invokestatic    #314 <Method String getTrackTypeString(int)>
	//    7   15:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(", ");
	//    9   19:aload           6
	//   10   21:ldc1            #125 <String ", ">
	//   11   23:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(s);
	//   13   27:aload           6
	//   14   29:aload_3         
	//   15   30:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		logd(eventtime, "decoderInitialized", stringbuilder.toString());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:ldc2            #321 <String "decoderInitialized">
	//   20   39:aload           6
	//   21   41:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   22   44:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//   23   47:return          
	}

	public void onDecoderInputFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i, Format format)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(getTrackTypeString(i));
	//    4    9:aload           4
	//    5   11:iload_2         
	//    6   12:invokestatic    #314 <Method String getTrackTypeString(int)>
	//    7   15:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(", ");
	//    9   19:aload           4
	//   10   21:ldc1            #125 <String ", ">
	//   11   23:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(Format.toLogString(format));
	//   13   27:aload           4
	//   14   29:aload_3         
	//   15   30:invokestatic    #329 <Method String Format.toLogString(Format)>
	//   16   33:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
		logd(eventtime, "decoderInputFormatChanged", stringbuilder.toString());
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc2            #331 <String "decoderInputFormatChanged">
	//   21   42:aload           4
	//   22   44:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   23   47:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//   24   50:return          
	}

	public void onDownstreamFormatChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		logd(eventtime, "downstreamFormatChanged", Format.toLogString(medialoaddata.trackFormat));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #335 <String "downstreamFormatChanged">
	//    3    5:aload_2         
	//    4    6:getfield        #341 <Field Format com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData.trackFormat>
	//    5    9:invokestatic    #329 <Method String Format.toLogString(Format)>
	//    6   12:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    7   15:return          
	}

	public void onDrmKeysLoaded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime)
	{
		logd(eventtime, "drmKeysLoaded");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #345 <String "drmKeysLoaded">
	//    3    5:invokespecial   #347 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    4    8:return          
	}

	public void onDrmKeysRemoved(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime)
	{
		logd(eventtime, "drmKeysRemoved");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #350 <String "drmKeysRemoved">
	//    3    5:invokespecial   #347 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    4    8:return          
	}

	public void onDrmKeysRestored(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime)
	{
		logd(eventtime, "drmKeysRestored");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #353 <String "drmKeysRestored">
	//    3    5:invokespecial   #347 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    4    8:return          
	}

	public void onDrmSessionManagerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, Exception exception)
	{
		printInternalError(eventtime, "drmSessionManagerError", exception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #357 <String "drmSessionManagerError">
	//    3    5:aload_2         
	//    4    6:invokespecial   #359 <Method void printInternalError(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, Exception)>
	//    5    9:return          
	}

	public void onDroppedVideoFrames(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i, long l)
	{
		logd(eventtime, "droppedFrames", Integer.toString(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #363 <String "droppedFrames">
	//    3    5:iload_2         
	//    4    6:invokestatic    #298 <Method String Integer.toString(int)>
	//    5    9:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6   12:return          
	}

	public void onLoadCanceled(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onLoadCompleted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onLoadError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag)
	{
		printInternalError(eventtime, "loadError", ((Exception) (ioexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #370 <String "loadError">
	//    3    5:aload           4
	//    4    7:invokespecial   #359 <Method void printInternalError(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, Exception)>
	//    5   10:return          
	}

	public void onLoadStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
	//    0    0:return          
	}

	public void onLoadingChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, boolean flag)
	{
		logd(eventtime, "loading", Boolean.toString(flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #375 <String "loading">
	//    3    5:iload_2         
	//    4    6:invokestatic    #379 <Method String Boolean.toString(boolean)>
	//    5    9:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6   12:return          
	}

	public void onMediaPeriodCreated(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime)
	{
		logd(eventtime, "mediaPeriodCreated");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #382 <String "mediaPeriodCreated">
	//    3    5:invokespecial   #347 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    4    8:return          
	}

	public void onMediaPeriodReleased(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime)
	{
		logd(eventtime, "mediaPeriodReleased");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #385 <String "mediaPeriodReleased">
	//    3    5:invokespecial   #347 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    4    8:return          
	}

	public void onMetadata(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, Metadata metadata)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("metadata [");
	//    4    8:aload_3         
	//    5    9:ldc2            #389 <String "metadata [">
	//    6   12:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(getEventTimeString(eventtime));
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #116 <Method String getEventTimeString(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime)>
	//   12   22:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(", ");
	//   14   26:aload_3         
	//   15   27:ldc1            #125 <String ", ">
	//   16   29:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		logd(stringbuilder.toString());
	//   18   33:aload_0         
	//   19   34:aload_3         
	//   20   35:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   21   38:invokevirtual   #250 <Method void logd(String)>
		printMetadata(metadata, "  ");
	//   22   41:aload_0         
	//   23   42:aload_2         
	//   24   43:ldc2            #391 <String "  ">
	//   25   46:invokespecial   #393 <Method void printMetadata(Metadata, String)>
		logd("]");
	//   26   49:aload_0         
	//   27   50:ldc1            #118 <String "]">
	//   28   52:invokevirtual   #250 <Method void logd(String)>
	//   29   55:return          
	}

	public void onNetworkTypeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, NetworkInfo networkinfo)
	{
		if(networkinfo == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			networkinfo = "none";
	//    2    4:ldc1            #233 <String "none">
	//    3    6:astore_2        
		else
	//*   4    7:goto            15
			networkinfo = ((NetworkInfo) (networkinfo.toString()));
	//    5   10:aload_2         
	//    6   11:invokevirtual   #398 <Method String NetworkInfo.toString()>
	//    7   14:astore_2        
		logd(eventtime, "networkTypeChanged", ((String) (networkinfo)));
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:ldc2            #400 <String "networkTypeChanged">
	//   11   20:aload_2         
	//   12   21:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//   13   24:return          
	}

	public void onPlaybackParametersChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, PlaybackParameters playbackparameters)
	{
		logd(eventtime, "playbackParameters", Util.formatInvariant("speed=%.2f, pitch=%.2f, skipSilence=%s", new Object[] {
			Float.valueOf(playbackparameters.speed), Float.valueOf(playbackparameters.pitch), Boolean.valueOf(playbackparameters.skipSilence)
		}));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #404 <String "playbackParameters">
	//    3    5:ldc2            #406 <String "speed=%.2f, pitch=%.2f, skipSilence=%s">
	//    4    8:iconst_3        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_2         
	//    9   15:getfield        #412 <Field float PlaybackParameters.speed>
	//   10   18:invokestatic    #418 <Method Float Float.valueOf(float)>
	//   11   21:aastore         
	//   12   22:dup             
	//   13   23:iconst_1        
	//   14   24:aload_2         
	//   15   25:getfield        #421 <Field float PlaybackParameters.pitch>
	//   16   28:invokestatic    #418 <Method Float Float.valueOf(float)>
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_2        
	//   20   34:aload_2         
	//   21   35:getfield        #425 <Field boolean PlaybackParameters.skipSilence>
	//   22   38:invokestatic    #428 <Method Boolean Boolean.valueOf(boolean)>
	//   23   41:aastore         
	//   24   42:invokestatic    #434 <Method String Util.formatInvariant(String, Object[])>
	//   25   45:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//   26   48:return          
	}

	public void onPlayerError(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, ExoPlaybackException exoplaybackexception)
	{
		loge(eventtime, "playerFailed", ((Throwable) (exoplaybackexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #438 <String "playerFailed">
	//    3    5:aload_2         
	//    4    6:invokespecial   #440 <Method void loge(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, Throwable)>
	//    5    9:return          
	}

	public void onPlayerStateChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, boolean flag, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(flag);
	//    4    9:aload           4
	//    5   11:iload_2         
	//    6   12:invokevirtual   #445 <Method StringBuilder StringBuilder.append(boolean)>
	//    7   15:pop             
		stringbuilder.append(", ");
	//    8   16:aload           4
	//    9   18:ldc1            #125 <String ", ">
	//   10   20:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(getStateString(i));
	//   12   24:aload           4
	//   13   26:iload_3         
	//   14   27:invokestatic    #447 <Method String getStateString(int)>
	//   15   30:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		logd(eventtime, "state", stringbuilder.toString());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:ldc2            #449 <String "state">
	//   20   39:aload           4
	//   21   41:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   22   44:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//   23   47:return          
	}

	public void onPositionDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i)
	{
		logd(eventtime, "positionDiscontinuity", getDiscontinuityReasonString(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #452 <String "positionDiscontinuity">
	//    3    5:iload_2         
	//    4    6:invokestatic    #454 <Method String getDiscontinuityReasonString(int)>
	//    5    9:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6   12:return          
	}

	public void onReadingStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime)
	{
		logd(eventtime, "mediaPeriodReadingStarted");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #457 <String "mediaPeriodReadingStarted">
	//    3    5:invokespecial   #347 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    4    8:return          
	}

	public void onRenderedFirstFrame(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, Surface surface)
	{
		logd(eventtime, "renderedFirstFrame", surface.toString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #461 <String "renderedFirstFrame">
	//    3    5:aload_2         
	//    4    6:invokevirtual   #464 <Method String Surface.toString()>
	//    5    9:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6   12:return          
	}

	public void onRepeatModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i)
	{
		logd(eventtime, "repeatMode", getRepeatModeString(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #467 <String "repeatMode">
	//    3    5:iload_2         
	//    4    6:invokestatic    #469 <Method String getRepeatModeString(int)>
	//    5    9:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6   12:return          
	}

	public void onSeekProcessed(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime)
	{
		logd(eventtime, "seekProcessed");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #472 <String "seekProcessed">
	//    3    5:invokespecial   #347 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    4    8:return          
	}

	public void onSeekStarted(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime)
	{
		logd(eventtime, "seekStarted");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #475 <String "seekStarted">
	//    3    5:invokespecial   #347 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String)>
	//    4    8:return          
	}

	public void onShuffleModeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, boolean flag)
	{
		logd(eventtime, "shuffleModeEnabled", Boolean.toString(flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #478 <String "shuffleModeEnabled">
	//    3    5:iload_2         
	//    4    6:invokestatic    #379 <Method String Boolean.toString(boolean)>
	//    5    9:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    6   12:return          
	}

	public void onTimelineChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i)
	{
		int k = eventtime.timeline.getPeriodCount();
	//    0    0:aload_1         
	//    1    1:getfield        #483 <Field Timeline com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.timeline>
	//    2    4:invokevirtual   #488 <Method int Timeline.getPeriodCount()>
	//    3    7:istore          5
		int j = eventtime.timeline.getWindowCount();
	//    4    9:aload_1         
	//    5   10:getfield        #483 <Field Timeline com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.timeline>
	//    6   13:invokevirtual   #491 <Method int Timeline.getWindowCount()>
	//    7   16:istore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    8   18:new             #105 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #106 <Method void StringBuilder()>
	//   11   25:astore          6
		stringbuilder.append("timelineChanged [");
	//   12   27:aload           6
	//   13   29:ldc2            #493 <String "timelineChanged [">
	//   14   32:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:pop             
		stringbuilder.append(getEventTimeString(eventtime));
	//   16   36:aload           6
	//   17   38:aload_0         
	//   18   39:aload_1         
	//   19   40:invokespecial   #116 <Method String getEventTimeString(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime)>
	//   20   43:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
		stringbuilder.append(", periodCount=");
	//   22   47:aload           6
	//   23   49:ldc2            #495 <String ", periodCount=">
	//   24   52:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
		stringbuilder.append(k);
	//   26   56:aload           6
	//   27   58:iload           5
	//   28   60:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   29   63:pop             
		stringbuilder.append(", windowCount=");
	//   30   64:aload           6
	//   31   66:ldc2            #497 <String ", windowCount=">
	//   32   69:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   33   72:pop             
		stringbuilder.append(j);
	//   34   73:aload           6
	//   35   75:iload           4
	//   36   77:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   37   80:pop             
		stringbuilder.append(", reason=");
	//   38   81:aload           6
	//   39   83:ldc2            #499 <String ", reason=">
	//   40   86:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   41   89:pop             
		stringbuilder.append(getTimelineChangeReasonString(i));
	//   42   90:aload           6
	//   43   92:iload_2         
	//   44   93:invokestatic    #501 <Method String getTimelineChangeReasonString(int)>
	//   45   96:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   46   99:pop             
		logd(stringbuilder.toString());
	//   47  100:aload_0         
	//   48  101:aload           6
	//   49  103:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   50  106:invokevirtual   #250 <Method void logd(String)>
		boolean flag = false;
	//   51  109:iconst_0        
	//   52  110:istore_3        
		for(i = 0; i < Math.min(k, 3); i++)
	//*  53  111:iconst_0        
	//*  54  112:istore_2        
	//*  55  113:iload_2         
	//*  56  114:iload           5
	//*  57  116:iconst_3        
	//*  58  117:invokestatic    #507 <Method int Math.min(int, int)>
	//*  59  120:icmpge          194
		{
			eventtime.timeline.getPeriod(i, period);
	//   60  123:aload_1         
	//   61  124:getfield        #483 <Field Timeline com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.timeline>
	//   62  127:iload_2         
	//   63  128:aload_0         
	//   64  129:getfield        #68  <Field com.google.android.exoplayer2.Timeline$Period period>
	//   65  132:invokevirtual   #511 <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period)>
	//   66  135:pop             
			StringBuilder stringbuilder1 = new StringBuilder();
	//   67  136:new             #105 <Class StringBuilder>
	//   68  139:dup             
	//   69  140:invokespecial   #106 <Method void StringBuilder()>
	//   70  143:astore          6
			stringbuilder1.append("  period [");
	//   71  145:aload           6
	//   72  147:ldc2            #513 <String "  period [">
	//   73  150:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   74  153:pop             
			stringbuilder1.append(getTimeString(period.getDurationMs()));
	//   75  154:aload           6
	//   76  156:aload_0         
	//   77  157:getfield        #68  <Field com.google.android.exoplayer2.Timeline$Period period>
	//   78  160:invokevirtual   #516 <Method long com.google.android.exoplayer2.Timeline$Period.getDurationMs()>
	//   79  163:invokestatic    #167 <Method String getTimeString(long)>
	//   80  166:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   81  169:pop             
			stringbuilder1.append("]");
	//   82  170:aload           6
	//   83  172:ldc1            #118 <String "]">
	//   84  174:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   85  177:pop             
			logd(stringbuilder1.toString());
	//   86  178:aload_0         
	//   87  179:aload           6
	//   88  181:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   89  184:invokevirtual   #250 <Method void logd(String)>
		}

	//   90  187:iload_2         
	//   91  188:iconst_1        
	//   92  189:iadd            
	//   93  190:istore_2        
	//*  94  191:goto            113
		i = ((int) (flag));
	//   95  194:iload_3         
	//   96  195:istore_2        
		if(k > 3)
	//*  97  196:iload           5
	//*  98  198:iconst_3        
	//*  99  199:icmple          211
		{
			logd("  ...");
	//  100  202:aload_0         
	//  101  203:ldc2            #518 <String "  ...">
	//  102  206:invokevirtual   #250 <Method void logd(String)>
			i = ((int) (flag));
	//  103  209:iload_3         
	//  104  210:istore_2        
		}
		for(; i < Math.min(j, 3); i++)
	//* 105  211:iload_2         
	//* 106  212:iload           4
	//* 107  214:iconst_3        
	//* 108  215:invokestatic    #507 <Method int Math.min(int, int)>
	//* 109  218:icmpge          334
		{
			eventtime.timeline.getWindow(i, window);
	//  110  221:aload_1         
	//  111  222:getfield        #483 <Field Timeline com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime.timeline>
	//  112  225:iload_2         
	//  113  226:aload_0         
	//  114  227:getfield        #63  <Field com.google.android.exoplayer2.Timeline$Window window>
	//  115  230:invokevirtual   #522 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//  116  233:pop             
			StringBuilder stringbuilder2 = new StringBuilder();
	//  117  234:new             #105 <Class StringBuilder>
	//  118  237:dup             
	//  119  238:invokespecial   #106 <Method void StringBuilder()>
	//  120  241:astore          6
			stringbuilder2.append("  window [");
	//  121  243:aload           6
	//  122  245:ldc2            #524 <String "  window [">
	//  123  248:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  124  251:pop             
			stringbuilder2.append(getTimeString(window.getDurationMs()));
	//  125  252:aload           6
	//  126  254:aload_0         
	//  127  255:getfield        #63  <Field com.google.android.exoplayer2.Timeline$Window window>
	//  128  258:invokevirtual   #525 <Method long com.google.android.exoplayer2.Timeline$Window.getDurationMs()>
	//  129  261:invokestatic    #167 <Method String getTimeString(long)>
	//  130  264:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  131  267:pop             
			stringbuilder2.append(", ");
	//  132  268:aload           6
	//  133  270:ldc1            #125 <String ", ">
	//  134  272:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  135  275:pop             
			stringbuilder2.append(window.isSeekable);
	//  136  276:aload           6
	//  137  278:aload_0         
	//  138  279:getfield        #63  <Field com.google.android.exoplayer2.Timeline$Window window>
	//  139  282:getfield        #528 <Field boolean com.google.android.exoplayer2.Timeline$Window.isSeekable>
	//  140  285:invokevirtual   #445 <Method StringBuilder StringBuilder.append(boolean)>
	//  141  288:pop             
			stringbuilder2.append(", ");
	//  142  289:aload           6
	//  143  291:ldc1            #125 <String ", ">
	//  144  293:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  145  296:pop             
			stringbuilder2.append(window.isDynamic);
	//  146  297:aload           6
	//  147  299:aload_0         
	//  148  300:getfield        #63  <Field com.google.android.exoplayer2.Timeline$Window window>
	//  149  303:getfield        #531 <Field boolean com.google.android.exoplayer2.Timeline$Window.isDynamic>
	//  150  306:invokevirtual   #445 <Method StringBuilder StringBuilder.append(boolean)>
	//  151  309:pop             
			stringbuilder2.append("]");
	//  152  310:aload           6
	//  153  312:ldc1            #118 <String "]">
	//  154  314:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  155  317:pop             
			logd(stringbuilder2.toString());
	//  156  318:aload_0         
	//  157  319:aload           6
	//  158  321:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  159  324:invokevirtual   #250 <Method void logd(String)>
		}

	//  160  327:iload_2         
	//  161  328:iconst_1        
	//  162  329:iadd            
	//  163  330:istore_2        
	//* 164  331:goto            211
		if(j > 3)
	//* 165  334:iload           4
	//* 166  336:iconst_3        
	//* 167  337:icmple          347
			logd("  ...");
	//  168  340:aload_0         
	//  169  341:ldc2            #518 <String "  ...">
	//  170  344:invokevirtual   #250 <Method void logd(String)>
		logd("]");
	//  171  347:aload_0         
	//  172  348:ldc1            #118 <String "]">
	//  173  350:invokevirtual   #250 <Method void logd(String)>
	//  174  353:return          
	}

	public void onTracksChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray)
	{
		if(trackSelector != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field MappingTrackSelector trackSelector>
	//*   2    4:ifnull          18
			trackgrouparray = ((TrackGroupArray) (trackSelector.getCurrentMappedTrackInfo()));
	//    3    7:aload_0         
	//    4    8:getfield        #58  <Field MappingTrackSelector trackSelector>
	//    5   11:invokevirtual   #539 <Method com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo MappingTrackSelector.getCurrentMappedTrackInfo()>
	//    6   14:astore_2        
		else
	//*   7   15:goto            20
			trackgrouparray = null;
	//    8   18:aconst_null     
	//    9   19:astore_2        
		if(trackgrouparray == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       36
		{
			logd(eventtime, "tracksChanged", "[]");
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:ldc2            #541 <String "tracksChanged">
	//   15   29:ldc2            #543 <String "[]">
	//   16   32:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
			return;
	//   17   35:return          
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   18   36:new             #105 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #106 <Method void StringBuilder()>
	//   21   43:astore          8
		stringbuilder.append("tracksChanged [");
	//   22   45:aload           8
	//   23   47:ldc2            #545 <String "tracksChanged [">
	//   24   50:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
		stringbuilder.append(getEventTimeString(eventtime));
	//   26   54:aload           8
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:invokespecial   #116 <Method String getEventTimeString(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime)>
	//   30   61:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		stringbuilder.append(", ");
	//   32   65:aload           8
	//   33   67:ldc1            #125 <String ", ">
	//   34   69:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
		logd(stringbuilder.toString());
	//   36   73:aload_0         
	//   37   74:aload           8
	//   38   76:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   39   79:invokevirtual   #250 <Method void logd(String)>
		int k1 = ((com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo) (trackgrouparray)).getRendererCount();
	//   40   82:aload_2         
	//   41   83:invokevirtual   #550 <Method int com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo.getRendererCount()>
	//   42   86:istore          7
		for(int i = 0; i < k1; i++)
	//*  43   88:iconst_0        
	//*  44   89:istore          4
	//*  45   91:iload           4
	//*  46   93:iload           7
	//*  47   95:icmpge          508
		{
			TrackGroupArray trackgrouparray1 = ((com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo) (trackgrouparray)).getTrackGroups(i);
	//   48   98:aload_2         
	//   49   99:iload           4
	//   50  101:invokevirtual   #554 <Method TrackGroupArray com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo.getTrackGroups(int)>
	//   51  104:astore          8
			eventtime = ((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) (trackselectionarray.get(i)));
	//   52  106:aload_3         
	//   53  107:iload           4
	//   54  109:invokevirtual   #559 <Method TrackSelection TrackSelectionArray.get(int)>
	//   55  112:astore_1        
			if(trackgrouparray1.length <= 0)
				continue;
	//   56  113:aload           8
	//   57  115:getfield        #563 <Field int TrackGroupArray.length>
	//   58  118:ifle            499
			StringBuilder stringbuilder1 = new StringBuilder();
	//   59  121:new             #105 <Class StringBuilder>
	//   60  124:dup             
	//   61  125:invokespecial   #106 <Method void StringBuilder()>
	//   62  128:astore          9
			stringbuilder1.append("  Renderer:");
	//   63  130:aload           9
	//   64  132:ldc2            #565 <String "  Renderer:">
	//   65  135:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
			stringbuilder1.append(i);
	//   67  139:aload           9
	//   68  141:iload           4
	//   69  143:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   70  146:pop             
			stringbuilder1.append(" [");
	//   71  147:aload           9
	//   72  149:ldc1            #112 <String " [">
	//   73  151:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   74  154:pop             
			logd(stringbuilder1.toString());
	//   75  155:aload_0         
	//   76  156:aload           9
	//   77  158:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   78  161:invokevirtual   #250 <Method void logd(String)>
			for(int k = 0; k < trackgrouparray1.length; k++)
	//*  79  164:iconst_0        
	//*  80  165:istore          5
	//*  81  167:iload           5
	//*  82  169:aload           8
	//*  83  171:getfield        #563 <Field int TrackGroupArray.length>
	//*  84  174:icmpge          421
			{
				TrackGroup trackgroup = trackgrouparray1.get(k);
	//   85  177:aload           8
	//   86  179:iload           5
	//   87  181:invokevirtual   #568 <Method TrackGroup TrackGroupArray.get(int)>
	//   88  184:astore          9
				String s1 = getAdaptiveSupportString(trackgroup.length, ((com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo) (trackgrouparray)).getAdaptiveSupport(i, k, false));
	//   89  186:aload           9
	//   90  188:getfield        #571 <Field int TrackGroup.length>
	//   91  191:aload_2         
	//   92  192:iload           4
	//   93  194:iload           5
	//   94  196:iconst_0        
	//   95  197:invokevirtual   #575 <Method int com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo.getAdaptiveSupport(int, int, boolean)>
	//   96  200:invokestatic    #577 <Method String getAdaptiveSupportString(int, int)>
	//   97  203:astore          10
				StringBuilder stringbuilder3 = new StringBuilder();
	//   98  205:new             #105 <Class StringBuilder>
	//   99  208:dup             
	//  100  209:invokespecial   #106 <Method void StringBuilder()>
	//  101  212:astore          11
				stringbuilder3.append("    Group:");
	//  102  214:aload           11
	//  103  216:ldc2            #579 <String "    Group:">
	//  104  219:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  105  222:pop             
				stringbuilder3.append(k);
	//  106  223:aload           11
	//  107  225:iload           5
	//  108  227:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//  109  230:pop             
				stringbuilder3.append(", adaptive_supported=");
	//  110  231:aload           11
	//  111  233:ldc2            #581 <String ", adaptive_supported=">
	//  112  236:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  113  239:pop             
				stringbuilder3.append(s1);
	//  114  240:aload           11
	//  115  242:aload           10
	//  116  244:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  117  247:pop             
				stringbuilder3.append(" [");
	//  118  248:aload           11
	//  119  250:ldc1            #112 <String " [">
	//  120  252:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  121  255:pop             
				logd(stringbuilder3.toString());
	//  122  256:aload_0         
	//  123  257:aload           11
	//  124  259:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  125  262:invokevirtual   #250 <Method void logd(String)>
				for(int j1 = 0; j1 < trackgroup.length; j1++)
	//* 126  265:iconst_0        
	//* 127  266:istore          6
	//* 128  268:iload           6
	//* 129  270:aload           9
	//* 130  272:getfield        #571 <Field int TrackGroup.length>
	//* 131  275:icmpge          405
				{
					String s2 = getTrackStatusString(((TrackSelection) (eventtime)), trackgroup, j1);
	//  132  278:aload_1         
	//  133  279:aload           9
	//  134  281:iload           6
	//  135  283:invokestatic    #583 <Method String getTrackStatusString(TrackSelection, TrackGroup, int)>
	//  136  286:astore          10
					String s3 = getFormatSupportString(((com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo) (trackgrouparray)).getTrackSupport(i, k, j1));
	//  137  288:aload_2         
	//  138  289:iload           4
	//  139  291:iload           5
	//  140  293:iload           6
	//  141  295:invokevirtual   #587 <Method int com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo.getTrackSupport(int, int, int)>
	//  142  298:invokestatic    #589 <Method String getFormatSupportString(int)>
	//  143  301:astore          11
					StringBuilder stringbuilder4 = new StringBuilder();
	//  144  303:new             #105 <Class StringBuilder>
	//  145  306:dup             
	//  146  307:invokespecial   #106 <Method void StringBuilder()>
	//  147  310:astore          12
					stringbuilder4.append("      ");
	//  148  312:aload           12
	//  149  314:ldc2            #591 <String "      ">
	//  150  317:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  151  320:pop             
					stringbuilder4.append(s2);
	//  152  321:aload           12
	//  153  323:aload           10
	//  154  325:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  155  328:pop             
					stringbuilder4.append(" Track:");
	//  156  329:aload           12
	//  157  331:ldc2            #593 <String " Track:">
	//  158  334:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  159  337:pop             
					stringbuilder4.append(j1);
	//  160  338:aload           12
	//  161  340:iload           6
	//  162  342:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//  163  345:pop             
					stringbuilder4.append(", ");
	//  164  346:aload           12
	//  165  348:ldc1            #125 <String ", ">
	//  166  350:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  167  353:pop             
					stringbuilder4.append(Format.toLogString(trackgroup.getFormat(j1)));
	//  168  354:aload           12
	//  169  356:aload           9
	//  170  358:iload           6
	//  171  360:invokevirtual   #597 <Method Format TrackGroup.getFormat(int)>
	//  172  363:invokestatic    #329 <Method String Format.toLogString(Format)>
	//  173  366:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  174  369:pop             
					stringbuilder4.append(", supported=");
	//  175  370:aload           12
	//  176  372:ldc2            #599 <String ", supported=">
	//  177  375:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  178  378:pop             
					stringbuilder4.append(s3);
	//  179  379:aload           12
	//  180  381:aload           11
	//  181  383:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  182  386:pop             
					logd(stringbuilder4.toString());
	//  183  387:aload_0         
	//  184  388:aload           12
	//  185  390:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  186  393:invokevirtual   #250 <Method void logd(String)>
				}

	//  187  396:iload           6
	//  188  398:iconst_1        
	//  189  399:iadd            
	//  190  400:istore          6
	//* 191  402:goto            268
				logd("    ]");
	//  192  405:aload_0         
	//  193  406:ldc2            #601 <String "    ]">
	//  194  409:invokevirtual   #250 <Method void logd(String)>
			}

	//  195  412:iload           5
	//  196  414:iconst_1        
	//  197  415:iadd            
	//  198  416:istore          5
	//* 199  418:goto            167
			if(eventtime != null)
	//* 200  421:aload_1         
	//* 201  422:ifnull          492
			{
				int l = 0;
	//  202  425:iconst_0        
	//  203  426:istore          5
				do
				{
					if(l >= ((TrackSelection) (eventtime)).length())
						break;
	//  204  428:iload           5
	//  205  430:aload_1         
	//  206  431:invokeinterface #602 <Method int TrackSelection.length()>
	//  207  436:icmpge          492
					Metadata metadata = ((TrackSelection) (eventtime)).getFormat(l).metadata;
	//  208  439:aload_1         
	//  209  440:iload           5
	//  210  442:invokeinterface #603 <Method Format TrackSelection.getFormat(int)>
	//  211  447:getfield        #606 <Field Metadata Format.metadata>
	//  212  450:astore          8
					if(metadata != null)
	//* 213  452:aload           8
	//* 214  454:ifnull          483
					{
						logd("    Metadata [");
	//  215  457:aload_0         
	//  216  458:ldc2            #608 <String "    Metadata [">
	//  217  461:invokevirtual   #250 <Method void logd(String)>
						printMetadata(metadata, "      ");
	//  218  464:aload_0         
	//  219  465:aload           8
	//  220  467:ldc2            #591 <String "      ">
	//  221  470:invokespecial   #393 <Method void printMetadata(Metadata, String)>
						logd("    ]");
	//  222  473:aload_0         
	//  223  474:ldc2            #601 <String "    ]">
	//  224  477:invokevirtual   #250 <Method void logd(String)>
						break;
	//  225  480:goto            492
					}
					l++;
	//  226  483:iload           5
	//  227  485:iconst_1        
	//  228  486:iadd            
	//  229  487:istore          5
				} while(true);
	//  230  489:goto            428
			}
			logd("  ]");
	//  231  492:aload_0         
	//  232  493:ldc2            #610 <String "  ]">
	//  233  496:invokevirtual   #250 <Method void logd(String)>
		}

	//  234  499:iload           4
	//  235  501:iconst_1        
	//  236  502:iadd            
	//  237  503:istore          4
	//* 238  505:goto            91
		eventtime = ((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) (((com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo) (trackgrouparray)).getUnmappedTrackGroups()));
	//  239  508:aload_2         
	//  240  509:invokevirtual   #614 <Method TrackGroupArray com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo.getUnmappedTrackGroups()>
	//  241  512:astore_1        
		if(((TrackGroupArray) (eventtime)).length > 0)
	//* 242  513:aload_1         
	//* 243  514:getfield        #563 <Field int TrackGroupArray.length>
	//* 244  517:ifle            730
		{
			logd("  Renderer:None [");
	//  245  520:aload_0         
	//  246  521:ldc2            #616 <String "  Renderer:None [">
	//  247  524:invokevirtual   #250 <Method void logd(String)>
			for(int j = 0; j < ((TrackGroupArray) (eventtime)).length; j++)
	//* 248  527:iconst_0        
	//* 249  528:istore          4
	//* 250  530:iload           4
	//* 251  532:aload_1         
	//* 252  533:getfield        #563 <Field int TrackGroupArray.length>
	//* 253  536:icmpge          723
			{
				trackgrouparray = ((TrackGroupArray) (new StringBuilder()));
	//  254  539:new             #105 <Class StringBuilder>
	//  255  542:dup             
	//  256  543:invokespecial   #106 <Method void StringBuilder()>
	//  257  546:astore_2        
				((StringBuilder) (trackgrouparray)).append("    Group:");
	//  258  547:aload_2         
	//  259  548:ldc2            #579 <String "    Group:">
	//  260  551:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  261  554:pop             
				((StringBuilder) (trackgrouparray)).append(j);
	//  262  555:aload_2         
	//  263  556:iload           4
	//  264  558:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//  265  561:pop             
				((StringBuilder) (trackgrouparray)).append(" [");
	//  266  562:aload_2         
	//  267  563:ldc1            #112 <String " [">
	//  268  565:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  269  568:pop             
				logd(((StringBuilder) (trackgrouparray)).toString());
	//  270  569:aload_0         
	//  271  570:aload_2         
	//  272  571:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  273  574:invokevirtual   #250 <Method void logd(String)>
				trackgrouparray = ((TrackGroupArray) (((TrackGroupArray) (eventtime)).get(j)));
	//  274  577:aload_1         
	//  275  578:iload           4
	//  276  580:invokevirtual   #568 <Method TrackGroup TrackGroupArray.get(int)>
	//  277  583:astore_2        
				for(int i1 = 0; i1 < ((TrackGroup) (trackgrouparray)).length; i1++)
	//* 278  584:iconst_0        
	//* 279  585:istore          5
	//* 280  587:iload           5
	//* 281  589:aload_2         
	//* 282  590:getfield        #571 <Field int TrackGroup.length>
	//* 283  593:icmpge          707
				{
					trackselectionarray = ((TrackSelectionArray) (getTrackStatusString(false)));
	//  284  596:iconst_0        
	//  285  597:invokestatic    #222 <Method String getTrackStatusString(boolean)>
	//  286  600:astore_3        
					String s = getFormatSupportString(0);
	//  287  601:iconst_0        
	//  288  602:invokestatic    #589 <Method String getFormatSupportString(int)>
	//  289  605:astore          8
					StringBuilder stringbuilder2 = new StringBuilder();
	//  290  607:new             #105 <Class StringBuilder>
	//  291  610:dup             
	//  292  611:invokespecial   #106 <Method void StringBuilder()>
	//  293  614:astore          9
					stringbuilder2.append("      ");
	//  294  616:aload           9
	//  295  618:ldc2            #591 <String "      ">
	//  296  621:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  297  624:pop             
					stringbuilder2.append(((String) (trackselectionarray)));
	//  298  625:aload           9
	//  299  627:aload_3         
	//  300  628:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  301  631:pop             
					stringbuilder2.append(" Track:");
	//  302  632:aload           9
	//  303  634:ldc2            #593 <String " Track:">
	//  304  637:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  305  640:pop             
					stringbuilder2.append(i1);
	//  306  641:aload           9
	//  307  643:iload           5
	//  308  645:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//  309  648:pop             
					stringbuilder2.append(", ");
	//  310  649:aload           9
	//  311  651:ldc1            #125 <String ", ">
	//  312  653:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  313  656:pop             
					stringbuilder2.append(Format.toLogString(((TrackGroup) (trackgrouparray)).getFormat(i1)));
	//  314  657:aload           9
	//  315  659:aload_2         
	//  316  660:iload           5
	//  317  662:invokevirtual   #597 <Method Format TrackGroup.getFormat(int)>
	//  318  665:invokestatic    #329 <Method String Format.toLogString(Format)>
	//  319  668:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  320  671:pop             
					stringbuilder2.append(", supported=");
	//  321  672:aload           9
	//  322  674:ldc2            #599 <String ", supported=">
	//  323  677:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  324  680:pop             
					stringbuilder2.append(s);
	//  325  681:aload           9
	//  326  683:aload           8
	//  327  685:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//  328  688:pop             
					logd(stringbuilder2.toString());
	//  329  689:aload_0         
	//  330  690:aload           9
	//  331  692:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  332  695:invokevirtual   #250 <Method void logd(String)>
				}

	//  333  698:iload           5
	//  334  700:iconst_1        
	//  335  701:iadd            
	//  336  702:istore          5
	//* 337  704:goto            587
				logd("    ]");
	//  338  707:aload_0         
	//  339  708:ldc2            #601 <String "    ]">
	//  340  711:invokevirtual   #250 <Method void logd(String)>
			}

	//  341  714:iload           4
	//  342  716:iconst_1        
	//  343  717:iadd            
	//  344  718:istore          4
	//* 345  720:goto            530
			logd("  ]");
	//  346  723:aload_0         
	//  347  724:ldc2            #610 <String "  ]">
	//  348  727:invokevirtual   #250 <Method void logd(String)>
		}
		logd("]");
	//  349  730:aload_0         
	//  350  731:ldc1            #118 <String "]">
	//  351  733:invokevirtual   #250 <Method void logd(String)>
	//  352  736:return          
	}

	public void onUpstreamDiscarded(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		logd(eventtime, "upstreamDiscarded", Format.toLogString(medialoaddata.trackFormat));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #619 <String "upstreamDiscarded">
	//    3    5:aload_2         
	//    4    6:getfield        #341 <Field Format com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData.trackFormat>
	//    5    9:invokestatic    #329 <Method String Format.toLogString(Format)>
	//    6   12:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//    7   15:return          
	}

	public void onVideoSizeChanged(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i, int j, int k, float f)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append(i);
	//    4    9:aload           6
	//    5   11:iload_2         
	//    6   12:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//    7   15:pop             
		stringbuilder.append(", ");
	//    8   16:aload           6
	//    9   18:ldc1            #125 <String ", ">
	//   10   20:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(j);
	//   12   24:aload           6
	//   13   26:iload_3         
	//   14   27:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   15   30:pop             
		logd(eventtime, "videoSizeChanged", stringbuilder.toString());
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:ldc2            #623 <String "videoSizeChanged">
	//   19   36:aload           6
	//   20   38:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   21   41:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//   22   44:return          
	}

	public void onViewportSizeChange(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventtime, int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #105 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #106 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(i);
	//    4    9:aload           4
	//    5   11:iload_2         
	//    6   12:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//    7   15:pop             
		stringbuilder.append(", ");
	//    8   16:aload           4
	//    9   18:ldc1            #125 <String ", ">
	//   10   20:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(j);
	//   12   24:aload           4
	//   13   26:iload_3         
	//   14   27:invokevirtual   #135 <Method StringBuilder StringBuilder.append(int)>
	//   15   30:pop             
		logd(eventtime, "viewportSizeChanged", stringbuilder.toString());
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:ldc2            #627 <String "viewportSizeChanged">
	//   19   36:aload           4
	//   20   38:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   21   41:invokespecial   #300 <Method void logd(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime, String, String)>
	//   22   44:return          
	}

	private static final int MAX_TIMELINE_ITEM_LINES = 3;
	private static final String TAG = "EventLogger";
	private static final NumberFormat TIME_FORMAT;
	private final com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
	private final long startTimeMs = SystemClock.elapsedRealtime();
	private final MappingTrackSelector trackSelector;
	private final com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();

	static 
	{
		TIME_FORMAT = NumberFormat.getInstance(Locale.US);
	//    0    0:getstatic       #32  <Field Locale Locale.US>
	//    1    3:invokestatic    #38  <Method NumberFormat NumberFormat.getInstance(Locale)>
	//    2    6:putstatic       #40  <Field NumberFormat TIME_FORMAT>
		TIME_FORMAT.setMinimumFractionDigits(2);
	//    3    9:getstatic       #40  <Field NumberFormat TIME_FORMAT>
	//    4   12:iconst_2        
	//    5   13:invokevirtual   #44  <Method void NumberFormat.setMinimumFractionDigits(int)>
		TIME_FORMAT.setMaximumFractionDigits(2);
	//    6   16:getstatic       #40  <Field NumberFormat TIME_FORMAT>
	//    7   19:iconst_2        
	//    8   20:invokevirtual   #47  <Method void NumberFormat.setMaximumFractionDigits(int)>
		TIME_FORMAT.setGroupingUsed(false);
	//    9   23:getstatic       #40  <Field NumberFormat TIME_FORMAT>
	//   10   26:iconst_0        
	//   11   27:invokevirtual   #51  <Method void NumberFormat.setGroupingUsed(boolean)>
	//*  12   30:return          
	}
}
