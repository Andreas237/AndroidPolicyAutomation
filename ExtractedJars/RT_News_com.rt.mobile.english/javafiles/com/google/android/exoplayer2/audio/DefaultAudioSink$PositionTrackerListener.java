// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.os.SystemClock;
import android.util.Log;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			DefaultAudioSink

private final class DefaultAudioSink$PositionTrackerListener
	implements AudioTrackPositionTracker.Listener
{

	public void onInvalidLatency(long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Ignoring impossibly large audio latency: ");
	//    4    8:aload_3         
	//    5    9:ldc1            #29  <String "Ignoring impossibly large audio latency: ">
	//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(l);
	//    8   15:aload_3         
	//    9   16:lload_1         
	//   10   17:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   11   20:pop             
		Log.w("AudioTrack", stringbuilder.toString());
	//   12   21:ldc1            #38  <String "AudioTrack">
	//   13   23:aload_3         
	//   14   24:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   15   27:invokestatic    #48  <Method int Log.w(String, String)>
	//   16   30:pop             
	//   17   31:return          
	}

	public void onPositionFramesMismatch(long l, long l1, long l2, long l3)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore          9
		((StringBuilder) (obj)).append("Spurious audio timestamp (frame position mismatch): ");
	//    4    9:aload           9
	//    5   11:ldc1            #52  <String "Spurious audio timestamp (frame position mismatch): ">
	//    6   13:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		((StringBuilder) (obj)).append(l);
	//    8   17:aload           9
	//    9   19:lload_1         
	//   10   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   11   23:pop             
		((StringBuilder) (obj)).append(", ");
	//   12   24:aload           9
	//   13   26:ldc1            #54  <String ", ">
	//   14   28:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		((StringBuilder) (obj)).append(l1);
	//   16   32:aload           9
	//   17   34:lload_3         
	//   18   35:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   19   38:pop             
		((StringBuilder) (obj)).append(", ");
	//   20   39:aload           9
	//   21   41:ldc1            #54  <String ", ">
	//   22   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		((StringBuilder) (obj)).append(l2);
	//   24   47:aload           9
	//   25   49:lload           5
	//   26   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   27   54:pop             
		((StringBuilder) (obj)).append(", ");
	//   28   55:aload           9
	//   29   57:ldc1            #54  <String ", ">
	//   30   59:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		((StringBuilder) (obj)).append(l3);
	//   32   63:aload           9
	//   33   65:lload           7
	//   34   67:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   35   70:pop             
		((StringBuilder) (obj)).append(", ");
	//   36   71:aload           9
	//   37   73:ldc1            #54  <String ", ">
	//   38   75:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		((StringBuilder) (obj)).append(DefaultAudioSink.access$600(DefaultAudioSink.this));
	//   40   79:aload           9
	//   41   81:aload_0         
	//   42   82:getfield        #15  <Field DefaultAudioSink this$0>
	//   43   85:invokestatic    #58  <Method long DefaultAudioSink.access$600(DefaultAudioSink)>
	//   44   88:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   45   91:pop             
		((StringBuilder) (obj)).append(", ");
	//   46   92:aload           9
	//   47   94:ldc1            #54  <String ", ">
	//   48   96:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   49   99:pop             
		((StringBuilder) (obj)).append(DefaultAudioSink.access$700(DefaultAudioSink.this));
	//   50  100:aload           9
	//   51  102:aload_0         
	//   52  103:getfield        #15  <Field DefaultAudioSink this$0>
	//   53  106:invokestatic    #61  <Method long DefaultAudioSink.access$700(DefaultAudioSink)>
	//   54  109:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   55  112:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   56  113:aload           9
	//   57  115:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   58  118:astore          9
		if(DefaultAudioSink.failOnSpuriousAudioTimestamp)
	//*  59  120:getstatic       #65  <Field boolean DefaultAudioSink.failOnSpuriousAudioTimestamp>
	//*  60  123:ifeq            137
		{
			throw new mpException(((String) (obj)), ((DefaultAudioSink._cls1) (null)));
	//   61  126:new             #67  <Class DefaultAudioSink$InvalidAudioTrackTimestampException>
	//   62  129:dup             
	//   63  130:aload           9
	//   64  132:aconst_null     
	//   65  133:invokespecial   #70  <Method void DefaultAudioSink$InvalidAudioTrackTimestampException(String, DefaultAudioSink$1)>
	//   66  136:athrow          
		} else
		{
			Log.w("AudioTrack", ((String) (obj)));
	//   67  137:ldc1            #38  <String "AudioTrack">
	//   68  139:aload           9
	//   69  141:invokestatic    #48  <Method int Log.w(String, String)>
	//   70  144:pop             
			return;
	//   71  145:return          
		}
	}

	public void onSystemTimeUsMismatch(long l, long l1, long l2, long l3)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore          9
		((StringBuilder) (obj)).append("Spurious audio timestamp (system clock mismatch): ");
	//    4    9:aload           9
	//    5   11:ldc1            #73  <String "Spurious audio timestamp (system clock mismatch): ">
	//    6   13:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		((StringBuilder) (obj)).append(l);
	//    8   17:aload           9
	//    9   19:lload_1         
	//   10   20:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   11   23:pop             
		((StringBuilder) (obj)).append(", ");
	//   12   24:aload           9
	//   13   26:ldc1            #54  <String ", ">
	//   14   28:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		((StringBuilder) (obj)).append(l1);
	//   16   32:aload           9
	//   17   34:lload_3         
	//   18   35:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   19   38:pop             
		((StringBuilder) (obj)).append(", ");
	//   20   39:aload           9
	//   21   41:ldc1            #54  <String ", ">
	//   22   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		((StringBuilder) (obj)).append(l2);
	//   24   47:aload           9
	//   25   49:lload           5
	//   26   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   27   54:pop             
		((StringBuilder) (obj)).append(", ");
	//   28   55:aload           9
	//   29   57:ldc1            #54  <String ", ">
	//   30   59:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		((StringBuilder) (obj)).append(l3);
	//   32   63:aload           9
	//   33   65:lload           7
	//   34   67:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   35   70:pop             
		((StringBuilder) (obj)).append(", ");
	//   36   71:aload           9
	//   37   73:ldc1            #54  <String ", ">
	//   38   75:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		((StringBuilder) (obj)).append(DefaultAudioSink.access$600(DefaultAudioSink.this));
	//   40   79:aload           9
	//   41   81:aload_0         
	//   42   82:getfield        #15  <Field DefaultAudioSink this$0>
	//   43   85:invokestatic    #58  <Method long DefaultAudioSink.access$600(DefaultAudioSink)>
	//   44   88:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   45   91:pop             
		((StringBuilder) (obj)).append(", ");
	//   46   92:aload           9
	//   47   94:ldc1            #54  <String ", ">
	//   48   96:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   49   99:pop             
		((StringBuilder) (obj)).append(DefaultAudioSink.access$700(DefaultAudioSink.this));
	//   50  100:aload           9
	//   51  102:aload_0         
	//   52  103:getfield        #15  <Field DefaultAudioSink this$0>
	//   53  106:invokestatic    #61  <Method long DefaultAudioSink.access$700(DefaultAudioSink)>
	//   54  109:invokevirtual   #36  <Method StringBuilder StringBuilder.append(long)>
	//   55  112:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   56  113:aload           9
	//   57  115:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   58  118:astore          9
		if(DefaultAudioSink.failOnSpuriousAudioTimestamp)
	//*  59  120:getstatic       #65  <Field boolean DefaultAudioSink.failOnSpuriousAudioTimestamp>
	//*  60  123:ifeq            137
		{
			throw new mpException(((String) (obj)), ((DefaultAudioSink._cls1) (null)));
	//   61  126:new             #67  <Class DefaultAudioSink$InvalidAudioTrackTimestampException>
	//   62  129:dup             
	//   63  130:aload           9
	//   64  132:aconst_null     
	//   65  133:invokespecial   #70  <Method void DefaultAudioSink$InvalidAudioTrackTimestampException(String, DefaultAudioSink$1)>
	//   66  136:athrow          
		} else
		{
			Log.w("AudioTrack", ((String) (obj)));
	//   67  137:ldc1            #38  <String "AudioTrack">
	//   68  139:aload           9
	//   69  141:invokestatic    #48  <Method int Log.w(String, String)>
	//   70  144:pop             
			return;
	//   71  145:return          
		}
	}

	public void onUnderrun(int i, long l)
	{
		if(DefaultAudioSink.access$900(DefaultAudioSink.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field DefaultAudioSink this$0>
	//*   2    4:invokestatic    #79  <Method AudioSink$Listener DefaultAudioSink.access$900(DefaultAudioSink)>
	//*   3    7:ifnull          43
		{
			long l1 = SystemClock.elapsedRealtime();
	//    4   10:invokestatic    #85  <Method long SystemClock.elapsedRealtime()>
	//    5   13:lstore          4
			long l2 = DefaultAudioSink.access$1000(DefaultAudioSink.this);
	//    6   15:aload_0         
	//    7   16:getfield        #15  <Field DefaultAudioSink this$0>
	//    8   19:invokestatic    #88  <Method long DefaultAudioSink.access$1000(DefaultAudioSink)>
	//    9   22:lstore          6
			DefaultAudioSink.access$900(DefaultAudioSink.this).onUnderrun(i, l, l1 - l2);
	//   10   24:aload_0         
	//   11   25:getfield        #15  <Field DefaultAudioSink this$0>
	//   12   28:invokestatic    #79  <Method AudioSink$Listener DefaultAudioSink.access$900(DefaultAudioSink)>
	//   13   31:iload_1         
	//   14   32:lload_2         
	//   15   33:lload           4
	//   16   35:lload           6
	//   17   37:lsub            
	//   18   38:invokeinterface #93  <Method void AudioSink$Listener.onUnderrun(int, long, long)>
		}
	//   19   43:return          
	}

	final DefaultAudioSink this$0;

	private DefaultAudioSink$PositionTrackerListener()
	{
		this$0 = DefaultAudioSink.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field DefaultAudioSink this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	DefaultAudioSink$PositionTrackerListener(DefaultAudioSink._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void DefaultAudioSink$PositionTrackerListener(DefaultAudioSink)>
	//    3    5:return          
	}
}
