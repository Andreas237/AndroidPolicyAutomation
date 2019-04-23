// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text;

import android.os.*;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer.text:
//			SubtitleParser, PlayableSubtitle

final class SubtitleParserHelper
	implements android.os.Handler.Callback
{

	public SubtitleParserHelper(Looper looper, SubtitleParser subtitleparser)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		handler = new Handler(looper, ((android.os.Handler.Callback) (this)));
	//    2    4:aload_0         
	//    3    5:new             #35  <Class Handler>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokespecial   #38  <Method void Handler(Looper, android.os.Handler$Callback)>
	//    8   14:putfield        #40  <Field Handler handler>
		parser = subtitleparser;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #42  <Field SubtitleParser parser>
		flush();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #45  <Method void flush()>
	//   14   26:return          
	}

	private void handleFormat(MediaFormat mediaformat)
	{
		boolean flag;
		if(mediaformat.subsampleOffsetUs == 0xffffffffL)
	//*   0    0:aload_1         
	//*   1    1:getfield        #53  <Field long MediaFormat.subsampleOffsetUs>
	//*   2    4:ldc2w           #54  <Long 0xffffffffL>
	//*   3    7:lcmp            
	//*   4    8:ifne            16
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:goto            18
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		subtitlesAreRelative = flag;
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:putfield        #57  <Field boolean subtitlesAreRelative>
		long l;
		if(subtitlesAreRelative)
	//*  13   23:aload_0         
	//*  14   24:getfield        #57  <Field boolean subtitlesAreRelative>
	//*  15   27:ifeq            35
			l = 0L;
	//   16   30:lconst_0        
	//   17   31:lstore_3        
		else
	//*  18   32:goto            40
			l = mediaformat.subsampleOffsetUs;
	//   19   35:aload_1         
	//   20   36:getfield        #53  <Field long MediaFormat.subsampleOffsetUs>
	//   21   39:lstore_3        
		subtitleOffsetUs = l;
	//   22   40:aload_0         
	//   23   41:lload_3         
	//   24   42:putfield        #59  <Field long subtitleOffsetUs>
	//   25   45:return          
	}

	private void handleSample(long l, SampleHolder sampleholder)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Subtitle subtitle = parser.parse(sampleholder.data.array(), 0, sampleholder.size);
	//    2    3:aload_0         
	//    3    4:getfield        #42  <Field SubtitleParser parser>
	//    4    7:aload_3         
	//    5    8:getfield        #71  <Field ByteBuffer SampleHolder.data>
	//    6   11:invokevirtual   #77  <Method byte[] ByteBuffer.array()>
	//    7   14:iconst_0        
	//    8   15:aload_3         
	//    9   16:getfield        #80  <Field int SampleHolder.size>
	//   10   19:invokeinterface #86  <Method Subtitle SubtitleParser.parse(byte[], int, int)>
	//   11   24:astore          5
		Object obj;
		obj = null;
	//   12   26:aconst_null     
	//   13   27:astore          4
		break MISSING_BLOCK_LABEL_49;
	//   14   29:goto            49
		obj;
	//   15   32:astore          4
		subtitle = null;
	//   16   34:aconst_null     
	//   17   35:astore          5
		break MISSING_BLOCK_LABEL_49;
	//   18   37:goto            49
		obj1;
	//   19   40:astore          6
		subtitle = null;
	//   20   42:aconst_null     
	//   21   43:astore          5
		obj = ((Object) (subtitle));
	//   22   45:aload           5
	//   23   47:astore          4
		this;
	//   24   49:aload_0         
		JVM INSTR monitorenter ;
	//   25   50:monitorenter    
		if(sampleHolder != sampleholder)
	//*  26   51:aload_0         
	//*  27   52:getfield        #88  <Field SampleHolder sampleHolder>
	//*  28   55:aload_3         
	//*  29   56:if_acmpeq       62
			break MISSING_BLOCK_LABEL_101;
	//   30   59:goto            101
		result = new PlayableSubtitle(subtitle, subtitlesAreRelative, l, subtitleOffsetUs);
	//   31   62:aload_0         
	//   32   63:new             #90  <Class PlayableSubtitle>
	//   33   66:dup             
	//   34   67:aload           5
	//   35   69:aload_0         
	//   36   70:getfield        #57  <Field boolean subtitlesAreRelative>
	//   37   73:lload_1         
	//   38   74:aload_0         
	//   39   75:getfield        #59  <Field long subtitleOffsetUs>
	//   40   78:invokespecial   #93  <Method void PlayableSubtitle(Subtitle, boolean, long, long)>
	//   41   81:putfield        #95  <Field PlayableSubtitle result>
		error = ((IOException) (obj1));
	//   42   84:aload_0         
	//   43   85:aload           6
	//   44   87:putfield        #97  <Field IOException error>
		runtimeError = ((RuntimeException) (obj));
	//   45   90:aload_0         
	//   46   91:aload           4
	//   47   93:putfield        #99  <Field RuntimeException runtimeError>
		parsing = false;
	//   48   96:aload_0         
	//   49   97:iconst_0        
	//   50   98:putfield        #101 <Field boolean parsing>
		this;
	//   51  101:aload_0         
		JVM INSTR monitorexit ;
	//   52  102:monitorexit     
		return;
	//   53  103:return          
		sampleholder;
	//   54  104:astore_3        
		this;
	//   55  105:aload_0         
		JVM INSTR monitorexit ;
	//   56  106:monitorexit     
		throw sampleholder;
	//   57  107:aload_3         
	//   58  108:athrow          
	}

	public void flush()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		sampleHolder = new SampleHolder(1);
	//    2    2:aload_0         
	//    3    3:new             #67  <Class SampleHolder>
	//    4    6:dup             
	//    5    7:iconst_1        
	//    6    8:invokespecial   #104 <Method void SampleHolder(int)>
	//    7   11:putfield        #88  <Field SampleHolder sampleHolder>
		parsing = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #101 <Field boolean parsing>
		result = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #95  <Field PlayableSubtitle result>
		error = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #97  <Field IOException error>
		runtimeError = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #99  <Field RuntimeException runtimeError>
		this;
	//   20   34:aload_0         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		return;
	//   22   36:return          
		Exception exception;
		exception;
	//   23   37:astore_1        
	//*  24   38:aload_0         
		throw exception;
	//   25   39:monitorexit     
	//   26   40:aload_1         
	//   27   41:athrow          
	}

	public PlayableSubtitle getAndClearResult()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		PlayableSubtitle playablesubtitle;
		if(error != null)
			break MISSING_BLOCK_LABEL_45;
	//    2    2:aload_0         
	//    3    3:getfield        #97  <Field IOException error>
	//    4    6:ifnonnull       45
		if(runtimeError != null)
			break MISSING_BLOCK_LABEL_40;
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field RuntimeException runtimeError>
	//    7   13:ifnonnull       40
		playablesubtitle = result;
	//    8   16:aload_0         
	//    9   17:getfield        #95  <Field PlayableSubtitle result>
	//   10   20:astore_1        
		result = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #95  <Field PlayableSubtitle result>
		error = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #97  <Field IOException error>
		runtimeError = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #99  <Field RuntimeException runtimeError>
		this;
	//   20   36:aload_0         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		return playablesubtitle;
	//   22   38:aload_1         
	//   23   39:areturn         
		throw runtimeError;
	//   24   40:aload_0         
	//   25   41:getfield        #99  <Field RuntimeException runtimeError>
	//   26   44:athrow          
		throw error;
	//   27   45:aload_0         
	//   28   46:getfield        #97  <Field IOException error>
	//   29   49:athrow          
		Exception exception;
		exception;
	//   30   50:astore_1        
		result = null;
	//   31   51:aload_0         
	//   32   52:aconst_null     
	//   33   53:putfield        #95  <Field PlayableSubtitle result>
		error = null;
	//   34   56:aload_0         
	//   35   57:aconst_null     
	//   36   58:putfield        #97  <Field IOException error>
		runtimeError = null;
	//   37   61:aload_0         
	//   38   62:aconst_null     
	//   39   63:putfield        #99  <Field RuntimeException runtimeError>
		throw exception;
	//   40   66:aload_1         
	//   41   67:athrow          
		exception;
	//   42   68:astore_1        
		this;
	//   43   69:aload_0         
		JVM INSTR monitorexit ;
	//   44   70:monitorexit     
		throw exception;
	//   45   71:aload_1         
	//   46   72:athrow          
	}

	public SampleHolder getSampleHolder()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SampleHolder sampleholder = sampleHolder;
	//    2    2:aload_0         
	//    3    3:getfield        #88  <Field SampleHolder sampleHolder>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return sampleholder;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #118 <Field int Message.what>
		{
	//*   2    4:tableswitch     0 1: default 28
	//	               0 56
	//	               1 31
	//*   3   28:goto            67
		case 1: // '\001'
			handleSample(Util.getLong(message.arg1, message.arg2), (SampleHolder)message.obj);
	//    4   31:aload_0         
	//    5   32:aload_1         
	//    6   33:getfield        #121 <Field int Message.arg1>
	//    7   36:aload_1         
	//    8   37:getfield        #124 <Field int Message.arg2>
	//    9   40:invokestatic    #130 <Method long Util.getLong(int, int)>
	//   10   43:aload_1         
	//   11   44:getfield        #134 <Field Object Message.obj>
	//   12   47:checkcast       #67  <Class SampleHolder>
	//   13   50:invokespecial   #136 <Method void handleSample(long, SampleHolder)>
			break;

	//*  14   53:goto            67
		case 0: // '\0'
			handleFormat((MediaFormat)message.obj);
	//   15   56:aload_0         
	//   16   57:aload_1         
	//   17   58:getfield        #134 <Field Object Message.obj>
	//   18   61:checkcast       #50  <Class MediaFormat>
	//   19   64:invokespecial   #138 <Method void handleFormat(MediaFormat)>
			break;
		}
		return true;
	//   20   67:iconst_1        
	//   21   68:ireturn         
	}

	public boolean isParsing()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = parsing;
	//    2    2:aload_0         
	//    3    3:getfield        #101 <Field boolean parsing>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public void setFormat(MediaFormat mediaformat)
	{
		handler.obtainMessage(0, ((Object) (mediaformat))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Handler handler>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #145 <Method Message Handler.obtainMessage(int, Object)>
	//    5    9:invokevirtual   #148 <Method void Message.sendToTarget()>
	//    6   12:return          
	}

	public void startParseOperation()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		Exception exception;
		if(!parsing)
	//*   2    2:aload_0         
	//*   3    3:getfield        #101 <Field boolean parsing>
	//*   4    6:ifne            81
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_1        
		else
	//*   7   11:goto            14
	//*   8   14:iload_1         
	//*   9   15:invokestatic    #155 <Method void Assertions.checkState(boolean)>
	//*  10   18:aload_0         
	//*  11   19:iconst_1        
	//*  12   20:putfield        #101 <Field boolean parsing>
	//*  13   23:aload_0         
	//*  14   24:aconst_null     
	//*  15   25:putfield        #95  <Field PlayableSubtitle result>
	//*  16   28:aload_0         
	//*  17   29:aconst_null     
	//*  18   30:putfield        #97  <Field IOException error>
	//*  19   33:aload_0         
	//*  20   34:aconst_null     
	//*  21   35:putfield        #99  <Field RuntimeException runtimeError>
	//*  22   38:aload_0         
	//*  23   39:getfield        #40  <Field Handler handler>
	//*  24   42:iconst_1        
	//*  25   43:aload_0         
	//*  26   44:getfield        #88  <Field SampleHolder sampleHolder>
	//*  27   47:getfield        #158 <Field long SampleHolder.timeUs>
	//*  28   50:invokestatic    #162 <Method int Util.getTopInt(long)>
	//*  29   53:aload_0         
	//*  30   54:getfield        #88  <Field SampleHolder sampleHolder>
	//*  31   57:getfield        #158 <Field long SampleHolder.timeUs>
	//*  32   60:invokestatic    #165 <Method int Util.getBottomInt(long)>
	//*  33   63:aload_0         
	//*  34   64:getfield        #88  <Field SampleHolder sampleHolder>
	//*  35   67:invokevirtual   #168 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//*  36   70:invokevirtual   #148 <Method void Message.sendToTarget()>
	//*  37   73:aload_0         
	//*  38   74:monitorexit     
	//*  39   75:return          
	//*  40   76:astore_2        
	//*  41   77:aload_0         
	//*  42   78:monitorexit     
	//*  43   79:aload_2         
	//*  44   80:athrow          
			flag = false;
	//   45   81:iconst_0        
	//   46   82:istore_1        
		Assertions.checkState(flag);
		parsing = true;
		result = null;
		error = null;
		runtimeError = null;
		handler.obtainMessage(1, Util.getTopInt(sampleHolder.timeUs), Util.getBottomInt(sampleHolder.timeUs), ((Object) (sampleHolder))).sendToTarget();
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  47   83:goto            14
	}

	private static final int MSG_FORMAT = 0;
	private static final int MSG_SAMPLE = 1;
	private IOException error;
	private final Handler handler;
	private final SubtitleParser parser;
	private boolean parsing;
	private PlayableSubtitle result;
	private RuntimeException runtimeError;
	private SampleHolder sampleHolder;
	private long subtitleOffsetUs;
	private boolean subtitlesAreRelative;
}
