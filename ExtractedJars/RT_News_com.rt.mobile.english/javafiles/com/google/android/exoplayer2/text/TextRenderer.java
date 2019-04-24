// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text;

import android.os.*;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.text:
//			SubtitleDecoderFactory, TextOutput, SubtitleOutputBuffer, SubtitleDecoder, 
//			SubtitleDecoderException, SubtitleInputBuffer

public final class TextRenderer extends BaseRenderer
	implements android.os.Handler.Callback
{
	public static interface Output
		extends TextOutput
	{
	}


	public TextRenderer(TextOutput textoutput, Looper looper)
	{
		this(textoutput, looper, SubtitleDecoderFactory.DEFAULT);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #46  <Field SubtitleDecoderFactory SubtitleDecoderFactory.DEFAULT>
	//    4    6:invokespecial   #49  <Method void TextRenderer(TextOutput, Looper, SubtitleDecoderFactory)>
	//    5    9:return          
	}

	public TextRenderer(TextOutput textoutput, Looper looper, SubtitleDecoderFactory subtitledecoderfactory)
	{
		super(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #53  <Method void BaseRenderer(int)>
		output = (TextOutput)Assertions.checkNotNull(((Object) (textoutput)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #59  <Method Object Assertions.checkNotNull(Object)>
	//    6   10:checkcast       #61  <Class TextOutput>
	//    7   13:putfield        #63  <Field TextOutput output>
		if(looper == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       25
			textoutput = null;
	//   10   20:aconst_null     
	//   11   21:astore_1        
		else
	//*  12   22:goto            35
			textoutput = ((TextOutput) (new Handler(looper, ((android.os.Handler.Callback) (this)))));
	//   13   25:new             #65  <Class Handler>
	//   14   28:dup             
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:invokespecial   #68  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   18   34:astore_1        
		outputHandler = ((Handler) (textoutput));
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #70  <Field Handler outputHandler>
		decoderFactory = subtitledecoderfactory;
	//   22   40:aload_0         
	//   23   41:aload_3         
	//   24   42:putfield        #72  <Field SubtitleDecoderFactory decoderFactory>
		formatHolder = new FormatHolder();
	//   25   45:aload_0         
	//   26   46:new             #74  <Class FormatHolder>
	//   27   49:dup             
	//   28   50:invokespecial   #77  <Method void FormatHolder()>
	//   29   53:putfield        #79  <Field FormatHolder formatHolder>
	//   30   56:return          
	}

	private void clearOutput()
	{
		updateOutput(Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:invokestatic    #86  <Method List Collections.emptyList()>
	//    2    4:invokespecial   #90  <Method void updateOutput(List)>
	//    3    7:return          
	}

	private long getNextEventTime()
	{
		if(nextSubtitleEventIndex != -1 && nextSubtitleEventIndex < subtitle.getEventTimeCount())
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field int nextSubtitleEventIndex>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          37
	//*   4    8:aload_0         
	//*   5    9:getfield        #94  <Field int nextSubtitleEventIndex>
	//*   6   12:aload_0         
	//*   7   13:getfield        #96  <Field SubtitleOutputBuffer subtitle>
	//*   8   16:invokevirtual   #102 <Method int SubtitleOutputBuffer.getEventTimeCount()>
	//*   9   19:icmplt          25
	//*  10   22:goto            37
			return subtitle.getEventTime(nextSubtitleEventIndex);
	//   11   25:aload_0         
	//   12   26:getfield        #96  <Field SubtitleOutputBuffer subtitle>
	//   13   29:aload_0         
	//   14   30:getfield        #94  <Field int nextSubtitleEventIndex>
	//   15   33:invokevirtual   #106 <Method long SubtitleOutputBuffer.getEventTime(int)>
	//   16   36:lreturn         
		else
			return 0xffffffffL;
	//   17   37:ldc2w           #107 <Long 0xffffffffL>
	//   18   40:lreturn         
	}

	private void invokeUpdateOutputInternal(List list)
	{
		output.onCues(list);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field TextOutput output>
	//    2    4:aload_1         
	//    3    5:invokeinterface #112 <Method void TextOutput.onCues(List)>
	//    4   10:return          
	}

	private void releaseBuffers()
	{
		nextInputBuffer = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
		nextSubtitleEventIndex = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #94  <Field int nextSubtitleEventIndex>
		if(subtitle != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #96  <Field SubtitleOutputBuffer subtitle>
	//*   8   14:ifnull          29
		{
			subtitle.release();
	//    9   17:aload_0         
	//   10   18:getfield        #96  <Field SubtitleOutputBuffer subtitle>
	//   11   21:invokevirtual   #120 <Method void SubtitleOutputBuffer.release()>
			subtitle = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #96  <Field SubtitleOutputBuffer subtitle>
		}
		if(nextSubtitle != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
	//*  17   33:ifnull          48
		{
			nextSubtitle.release();
	//   18   36:aload_0         
	//   19   37:getfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
	//   20   40:invokevirtual   #120 <Method void SubtitleOutputBuffer.release()>
			nextSubtitle = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
		}
	//   24   48:return          
	}

	private void releaseDecoder()
	{
		releaseBuffers();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void releaseBuffers()>
		decoder.release();
	//    2    4:aload_0         
	//    3    5:getfield        #127 <Field SubtitleDecoder decoder>
	//    4    8:invokeinterface #130 <Method void SubtitleDecoder.release()>
		decoder = null;
	//    5   13:aload_0         
	//    6   14:aconst_null     
	//    7   15:putfield        #127 <Field SubtitleDecoder decoder>
		decoderReplacementState = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #132 <Field int decoderReplacementState>
	//   11   23:return          
	}

	private void replaceDecoder()
	{
		releaseDecoder();
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void releaseDecoder()>
		decoder = decoderFactory.createDecoder(streamFormat);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field SubtitleDecoderFactory decoderFactory>
	//    5    9:aload_0         
	//    6   10:getfield        #137 <Field Format streamFormat>
	//    7   13:invokeinterface #141 <Method SubtitleDecoder SubtitleDecoderFactory.createDecoder(Format)>
	//    8   18:putfield        #127 <Field SubtitleDecoder decoder>
	//    9   21:return          
	}

	private void updateOutput(List list)
	{
		if(outputHandler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Handler outputHandler>
	//*   2    4:ifnull          20
		{
			outputHandler.obtainMessage(0, ((Object) (list))).sendToTarget();
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field Handler outputHandler>
	//    5   11:iconst_0        
	//    6   12:aload_1         
	//    7   13:invokevirtual   #145 <Method Message Handler.obtainMessage(int, Object)>
	//    8   16:invokevirtual   #150 <Method void Message.sendToTarget()>
			return;
	//    9   19:return          
		} else
		{
			invokeUpdateOutputInternal(list);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokespecial   #152 <Method void invokeUpdateOutputInternal(List)>
			return;
	//   13   25:return          
		}
	}

	public boolean handleMessage(Message message)
	{
		if(message.what != 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #157 <Field int Message.what>
	//*   2    4:ifeq            15
		{
			throw new IllegalStateException();
	//    3    7:new             #159 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:invokespecial   #160 <Method void IllegalStateException()>
	//    6   14:athrow          
		} else
		{
			invokeUpdateOutputInternal((List)message.obj);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #164 <Field Object Message.obj>
	//   10   20:checkcast       #166 <Class List>
	//   11   23:invokespecial   #152 <Method void invokeUpdateOutputInternal(List)>
			return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		}
	}

	public boolean isEnded()
	{
		return outputStreamEnded;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field boolean outputStreamEnded>
	//    2    4:ireturn         
	}

	public boolean isReady()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void onDisabled()
	{
		streamFormat = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #137 <Field Format streamFormat>
		clearOutput();
	//    3    5:aload_0         
	//    4    6:invokespecial   #174 <Method void clearOutput()>
		releaseDecoder();
	//    5    9:aload_0         
	//    6   10:invokespecial   #135 <Method void releaseDecoder()>
	//    7   13:return          
	}

	protected void onPositionReset(long l, boolean flag)
	{
		clearOutput();
	//    0    0:aload_0         
	//    1    1:invokespecial   #174 <Method void clearOutput()>
		inputStreamEnded = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #178 <Field boolean inputStreamEnded>
		outputStreamEnded = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #170 <Field boolean outputStreamEnded>
		if(decoderReplacementState != 0)
	//*   8   14:aload_0         
	//*   9   15:getfield        #132 <Field int decoderReplacementState>
	//*  10   18:ifeq            26
		{
			replaceDecoder();
	//   11   21:aload_0         
	//   12   22:invokespecial   #180 <Method void replaceDecoder()>
			return;
	//   13   25:return          
		} else
		{
			releaseBuffers();
	//   14   26:aload_0         
	//   15   27:invokespecial   #125 <Method void releaseBuffers()>
			decoder.flush();
	//   16   30:aload_0         
	//   17   31:getfield        #127 <Field SubtitleDecoder decoder>
	//   18   34:invokeinterface #183 <Method void SubtitleDecoder.flush()>
			return;
	//   19   39:return          
		}
	}

	protected void onStreamChanged(Format aformat[], long l)
		throws ExoPlaybackException
	{
		streamFormat = aformat[0];
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aaload          
	//    4    4:putfield        #137 <Field Format streamFormat>
		if(decoder != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #127 <Field SubtitleDecoder decoder>
	//*   7   11:ifnull          20
		{
			decoderReplacementState = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #132 <Field int decoderReplacementState>
			return;
	//   11   19:return          
		} else
		{
			decoder = decoderFactory.createDecoder(streamFormat);
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #72  <Field SubtitleDecoderFactory decoderFactory>
	//   15   25:aload_0         
	//   16   26:getfield        #137 <Field Format streamFormat>
	//   17   29:invokeinterface #141 <Method SubtitleDecoder SubtitleDecoderFactory.createDecoder(Format)>
	//   18   34:putfield        #127 <Field SubtitleDecoder decoder>
			return;
	//   19   37:return          
		}
	}

	public void render(long l, long l1)
		throws ExoPlaybackException
	{
		if(outputStreamEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #170 <Field boolean outputStreamEnded>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(nextSubtitle == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
	//*   6   12:ifnonnull       56
		{
			decoder.setPositionUs(l);
	//    7   15:aload_0         
	//    8   16:getfield        #127 <Field SubtitleDecoder decoder>
	//    9   19:lload_1         
	//   10   20:invokeinterface #196 <Method void SubtitleDecoder.setPositionUs(long)>
			try
			{
				nextSubtitle = (SubtitleOutputBuffer)decoder.dequeueOutputBuffer();
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #127 <Field SubtitleDecoder decoder>
	//   14   30:invokeinterface #200 <Method Object SubtitleDecoder.dequeueOutputBuffer()>
	//   15   35:checkcast       #98  <Class SubtitleOutputBuffer>
	//   16   38:putfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
			}
	//*  17   41:goto            56
			catch(SubtitleDecoderException subtitledecoderexception)
	//*  18   44:astore          7
			{
				throw ExoPlaybackException.createForRenderer(((Exception) (subtitledecoderexception)), getIndex());
	//   19   46:aload           7
	//   20   48:aload_0         
	//   21   49:invokevirtual   #203 <Method int getIndex()>
	//   22   52:invokestatic    #207 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//   23   55:athrow          
			}
		}
		if(getState() != 2)
	//*  24   56:aload_0         
	//*  25   57:invokevirtual   #210 <Method int getState()>
	//*  26   60:iconst_2        
	//*  27   61:icmpeq          65
			return;
	//   28   64:return          
		boolean flag;
		if(subtitle != null)
	//*  29   65:aload_0         
	//*  30   66:getfield        #96  <Field SubtitleOutputBuffer subtitle>
	//*  31   69:ifnull          107
		{
			l1 = getNextEventTime();
	//   32   72:aload_0         
	//   33   73:invokespecial   #212 <Method long getNextEventTime()>
	//   34   76:lstore_3        
			for(flag = false; l1 <= l; flag = true)
	//*  35   77:iconst_0        
	//*  36   78:istore          5
	//*  37   80:lload_3         
	//*  38   81:lload_1         
	//*  39   82:lcmp            
	//*  40   83:ifgt            110
			{
				nextSubtitleEventIndex = nextSubtitleEventIndex + 1;
	//   41   86:aload_0         
	//   42   87:aload_0         
	//   43   88:getfield        #94  <Field int nextSubtitleEventIndex>
	//   44   91:iconst_1        
	//   45   92:iadd            
	//   46   93:putfield        #94  <Field int nextSubtitleEventIndex>
				l1 = getNextEventTime();
	//   47   96:aload_0         
	//   48   97:invokespecial   #212 <Method long getNextEventTime()>
	//   49  100:lstore_3        
			}

	//   50  101:iconst_1        
	//   51  102:istore          5
		} else
	//*  52  104:goto            80
		{
			flag = false;
	//   53  107:iconst_0        
	//   54  108:istore          5
		}
		boolean flag1 = flag;
	//   55  110:iload           5
	//   56  112:istore          6
		if(nextSubtitle != null)
	//*  57  114:aload_0         
	//*  58  115:getfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
	//*  59  118:ifnull          248
			if(nextSubtitle.isEndOfStream())
	//*  60  121:aload_0         
	//*  61  122:getfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
	//*  62  125:invokevirtual   #215 <Method boolean SubtitleOutputBuffer.isEndOfStream()>
	//*  63  128:ifeq            190
			{
				flag1 = flag;
	//   64  131:iload           5
	//   65  133:istore          6
				if(!flag)
	//*  66  135:iload           5
	//*  67  137:ifne            248
				{
					flag1 = flag;
	//   68  140:iload           5
	//   69  142:istore          6
					if(getNextEventTime() == 0xffffffffL)
	//*  70  144:aload_0         
	//*  71  145:invokespecial   #212 <Method long getNextEventTime()>
	//*  72  148:ldc2w           #107 <Long 0xffffffffL>
	//*  73  151:lcmp            
	//*  74  152:ifne            248
						if(decoderReplacementState == 2)
	//*  75  155:aload_0         
	//*  76  156:getfield        #132 <Field int decoderReplacementState>
	//*  77  159:iconst_2        
	//*  78  160:icmpne          174
						{
							replaceDecoder();
	//   79  163:aload_0         
	//   80  164:invokespecial   #180 <Method void replaceDecoder()>
							flag1 = flag;
	//   81  167:iload           5
	//   82  169:istore          6
						} else
	//*  83  171:goto            248
						{
							releaseBuffers();
	//   84  174:aload_0         
	//   85  175:invokespecial   #125 <Method void releaseBuffers()>
							outputStreamEnded = true;
	//   86  178:aload_0         
	//   87  179:iconst_1        
	//   88  180:putfield        #170 <Field boolean outputStreamEnded>
							flag1 = flag;
	//   89  183:iload           5
	//   90  185:istore          6
						}
				}
			} else
	//*  91  187:goto            248
			{
				flag1 = flag;
	//   92  190:iload           5
	//   93  192:istore          6
				if(nextSubtitle.timeUs <= l)
	//*  94  194:aload_0         
	//*  95  195:getfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
	//*  96  198:getfield        #219 <Field long SubtitleOutputBuffer.timeUs>
	//*  97  201:lload_1         
	//*  98  202:lcmp            
	//*  99  203:ifgt            248
				{
					if(subtitle != null)
	//* 100  206:aload_0         
	//* 101  207:getfield        #96  <Field SubtitleOutputBuffer subtitle>
	//* 102  210:ifnull          220
						subtitle.release();
	//  103  213:aload_0         
	//  104  214:getfield        #96  <Field SubtitleOutputBuffer subtitle>
	//  105  217:invokevirtual   #120 <Method void SubtitleOutputBuffer.release()>
					subtitle = nextSubtitle;
	//  106  220:aload_0         
	//  107  221:aload_0         
	//  108  222:getfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
	//  109  225:putfield        #96  <Field SubtitleOutputBuffer subtitle>
					nextSubtitle = null;
	//  110  228:aload_0         
	//  111  229:aconst_null     
	//  112  230:putfield        #122 <Field SubtitleOutputBuffer nextSubtitle>
					nextSubtitleEventIndex = subtitle.getNextEventTimeIndex(l);
	//  113  233:aload_0         
	//  114  234:aload_0         
	//  115  235:getfield        #96  <Field SubtitleOutputBuffer subtitle>
	//  116  238:lload_1         
	//  117  239:invokevirtual   #223 <Method int SubtitleOutputBuffer.getNextEventTimeIndex(long)>
	//  118  242:putfield        #94  <Field int nextSubtitleEventIndex>
					flag1 = true;
	//  119  245:iconst_1        
	//  120  246:istore          6
				}
			}
		if(flag1)
	//* 121  248:iload           6
	//* 122  250:ifeq            265
			updateOutput(subtitle.getCues(l));
	//  123  253:aload_0         
	//  124  254:aload_0         
	//  125  255:getfield        #96  <Field SubtitleOutputBuffer subtitle>
	//  126  258:lload_1         
	//  127  259:invokevirtual   #227 <Method List SubtitleOutputBuffer.getCues(long)>
	//  128  262:invokespecial   #90  <Method void updateOutput(List)>
		if(decoderReplacementState == 2)
	//* 129  265:aload_0         
	//* 130  266:getfield        #132 <Field int decoderReplacementState>
	//* 131  269:iconst_2        
	//* 132  270:icmpne          274
			return;
	//  133  273:return          
_L2:
		if(inputStreamEnded)
			break MISSING_BLOCK_LABEL_445;
	//  134  274:aload_0         
	//  135  275:getfield        #178 <Field boolean inputStreamEnded>
	//  136  278:ifne            445
		if(nextInputBuffer == null)
	//* 137  281:aload_0         
	//* 138  282:getfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//* 139  285:ifnonnull       312
		{
			nextInputBuffer = (SubtitleInputBuffer)decoder.dequeueInputBuffer();
	//  140  288:aload_0         
	//  141  289:aload_0         
	//  142  290:getfield        #127 <Field SubtitleDecoder decoder>
	//  143  293:invokeinterface #230 <Method Object SubtitleDecoder.dequeueInputBuffer()>
	//  144  298:checkcast       #232 <Class SubtitleInputBuffer>
	//  145  301:putfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
			if(nextInputBuffer == null)
	//* 146  304:aload_0         
	//* 147  305:getfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//* 148  308:ifnonnull       312
				return;
	//  149  311:return          
		}
		int i;
		try
		{
			if(decoderReplacementState == 1)
	//* 150  312:aload_0         
	//* 151  313:getfield        #132 <Field int decoderReplacementState>
	//* 152  316:iconst_1        
	//* 153  317:icmpne          352
			{
				nextInputBuffer.setFlags(4);
	//  154  320:aload_0         
	//  155  321:getfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//  156  324:iconst_4        
	//  157  325:invokevirtual   #235 <Method void SubtitleInputBuffer.setFlags(int)>
				decoder.queueInputBuffer(((Object) (nextInputBuffer)));
	//  158  328:aload_0         
	//  159  329:getfield        #127 <Field SubtitleDecoder decoder>
	//  160  332:aload_0         
	//  161  333:getfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//  162  336:invokeinterface #239 <Method void SubtitleDecoder.queueInputBuffer(Object)>
				nextInputBuffer = null;
	//  163  341:aload_0         
	//  164  342:aconst_null     
	//  165  343:putfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
				decoderReplacementState = 2;
	//  166  346:aload_0         
	//  167  347:iconst_2        
	//  168  348:putfield        #132 <Field int decoderReplacementState>
				return;
	//  169  351:return          
			}
		}
	//* 170  352:aload_0         
	//* 171  353:aload_0         
	//* 172  354:getfield        #79  <Field FormatHolder formatHolder>
	//* 173  357:aload_0         
	//* 174  358:getfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//* 175  361:iconst_0        
	//* 176  362:invokevirtual   #243 <Method int readSource(FormatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer, boolean)>
	//* 177  365:istore          5
	//* 178  367:iload           5
	//* 179  369:bipush          -4
	//* 180  371:icmpne          437
	//* 181  374:aload_0         
	//* 182  375:getfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//* 183  378:invokevirtual   #244 <Method boolean SubtitleInputBuffer.isEndOfStream()>
	//* 184  381:ifeq            392
	//* 185  384:aload_0         
	//* 186  385:iconst_1        
	//* 187  386:putfield        #178 <Field boolean inputStreamEnded>
	//* 188  389:goto            416
	//* 189  392:aload_0         
	//* 190  393:getfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//* 191  396:aload_0         
	//* 192  397:getfield        #79  <Field FormatHolder formatHolder>
	//* 193  400:getfield        #247 <Field Format FormatHolder.format>
	//* 194  403:getfield        #252 <Field long Format.subsampleOffsetUs>
	//* 195  406:putfield        #253 <Field long SubtitleInputBuffer.subsampleOffsetUs>
	//* 196  409:aload_0         
	//* 197  410:getfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//* 198  413:invokevirtual   #256 <Method void SubtitleInputBuffer.flip()>
	//* 199  416:aload_0         
	//* 200  417:getfield        #127 <Field SubtitleDecoder decoder>
	//* 201  420:aload_0         
	//* 202  421:getfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//* 203  424:invokeinterface #239 <Method void SubtitleDecoder.queueInputBuffer(Object)>
	//* 204  429:aload_0         
	//* 205  430:aconst_null     
	//* 206  431:putfield        #117 <Field SubtitleInputBuffer nextInputBuffer>
	//* 207  434:goto            274
	//* 208  437:iload           5
	//* 209  439:bipush          -3
	//* 210  441:icmpne          274
	//* 211  444:return          
	//* 212  445:return          
		catch(SubtitleDecoderException subtitledecoderexception1)
	//* 213  446:astore          7
		{
			throw ExoPlaybackException.createForRenderer(((Exception) (subtitledecoderexception1)), getIndex());
	//  214  448:aload           7
	//  215  450:aload_0         
	//  216  451:invokevirtual   #203 <Method int getIndex()>
	//  217  454:invokestatic    #207 <Method ExoPlaybackException ExoPlaybackException.createForRenderer(Exception, int)>
	//  218  457:athrow          
		}
		i = readSource(formatHolder, ((com.google.android.exoplayer2.decoder.DecoderInputBuffer) (nextInputBuffer)), false);
		if(i != -4)
			continue; /* Loop/switch isn't completed */
		if(nextInputBuffer.isEndOfStream())
		{
			inputStreamEnded = true;
			break MISSING_BLOCK_LABEL_416;
		}
		nextInputBuffer.subsampleOffsetUs = formatHolder.format.subsampleOffsetUs;
		nextInputBuffer.flip();
		decoder.queueInputBuffer(((Object) (nextInputBuffer)));
		nextInputBuffer = null;
		if(true) goto _L2; else goto _L1
_L1:
		if(i != -3) goto _L2; else goto _L3
_L3:
		return;
	}

	public int supportsFormat(Format format)
	{
		if(decoderFactory.supportsFormat(format))
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SubtitleDecoderFactory decoderFactory>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #261 <Method boolean SubtitleDecoderFactory.supportsFormat(Format)>
	//*   4   10:ifeq            28
			return !supportsFormatDrm(((com.google.android.exoplayer2.drm.DrmSessionManager) (null)), format.drmInitData) ? 2 : 4;
	//    5   13:aconst_null     
	//    6   14:aload_1         
	//    7   15:getfield        #265 <Field com.google.android.exoplayer2.drm.DrmInitData Format.drmInitData>
	//    8   18:invokestatic    #269 <Method boolean supportsFormatDrm(com.google.android.exoplayer2.drm.DrmSessionManager, com.google.android.exoplayer2.drm.DrmInitData)>
	//    9   21:ifeq            26
	//   10   24:iconst_4        
	//   11   25:ireturn         
	//   12   26:iconst_2        
	//   13   27:ireturn         
		return !MimeTypes.isText(format.sampleMimeType) ? 0 : 1;
	//   14   28:aload_1         
	//   15   29:getfield        #273 <Field String Format.sampleMimeType>
	//   16   32:invokestatic    #279 <Method boolean MimeTypes.isText(String)>
	//   17   35:ifeq            40
	//   18   38:iconst_1        
	//   19   39:ireturn         
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	private static final int MSG_UPDATE_OUTPUT = 0;
	private static final int REPLACEMENT_STATE_NONE = 0;
	private static final int REPLACEMENT_STATE_SIGNAL_END_OF_STREAM = 1;
	private static final int REPLACEMENT_STATE_WAIT_END_OF_STREAM = 2;
	private SubtitleDecoder decoder;
	private final SubtitleDecoderFactory decoderFactory;
	private int decoderReplacementState;
	private final FormatHolder formatHolder;
	private boolean inputStreamEnded;
	private SubtitleInputBuffer nextInputBuffer;
	private SubtitleOutputBuffer nextSubtitle;
	private int nextSubtitleEventIndex;
	private final TextOutput output;
	private final Handler outputHandler;
	private boolean outputStreamEnded;
	private Format streamFormat;
	private SubtitleOutputBuffer subtitle;
}
