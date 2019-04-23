// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text;

import android.os.*;
import com.google.android.exoplayer.*;
import com.google.android.exoplayer.util.Assertions;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.text:
//			SubtitleParser, TextRenderer, PlayableSubtitle, SubtitleParserHelper

public final class TextTrackRenderer extends SampleSourceTrackRenderer
	implements android.os.Handler.Callback
{

	public transient TextTrackRenderer(SampleSource samplesource, TextRenderer textrenderer, Looper looper, SubtitleParser asubtitleparser[])
	{
		this(new SampleSource[] {
			samplesource
		}, textrenderer, looper, asubtitleparser);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       SampleSource[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:aload_2         
	//    8   10:aload_3         
	//    9   11:aload           4
	//   10   13:invokespecial   #80  <Method void TextTrackRenderer(SampleSource[], TextRenderer, Looper, SubtitleParser[])>
	//   11   16:return          
	}

	public transient TextTrackRenderer(SampleSource asamplesource[], TextRenderer textrenderer, Looper looper, SubtitleParser asubtitleparser[])
	{
label0:
		{
			super(asamplesource);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method void SampleSourceTrackRenderer(SampleSource[])>
			textRenderer = (TextRenderer)Assertions.checkNotNull(((Object) (textrenderer)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokestatic    #93  <Method Object Assertions.checkNotNull(Object)>
	//    6   10:checkcast       #95  <Class TextRenderer>
	//    7   13:putfield        #97  <Field TextRenderer textRenderer>
			if(looper == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       25
				asamplesource = null;
	//   10   20:aconst_null     
	//   11   21:astore_1        
			else
	//*  12   22:goto            35
				asamplesource = ((SampleSource []) (new Handler(looper, ((android.os.Handler.Callback) (this)))));
	//   13   25:new             #99  <Class Handler>
	//   14   28:dup             
	//   15   29:aload_3         
	//   16   30:aload_0         
	//   17   31:invokespecial   #102 <Method void Handler(Looper, android.os.Handler$Callback)>
	//   18   34:astore_1        
			textRendererHandler = ((Handler) (asamplesource));
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:putfield        #104 <Field Handler textRendererHandler>
			if(asubtitleparser != null)
	//*  22   40:aload           4
	//*  23   42:ifnull          54
			{
				asamplesource = ((SampleSource []) (asubtitleparser));
	//   24   45:aload           4
	//   25   47:astore_1        
				if(asubtitleparser.length != 0)
					break label0;
	//   26   48:aload           4
	//   27   50:arraylength     
	//   28   51:ifne            134
			}
			textrenderer = ((TextRenderer) (new SubtitleParser[DEFAULT_PARSER_CLASSES.size()]));
	//   29   54:getstatic       #45  <Field List DEFAULT_PARSER_CLASSES>
	//   30   57:invokeinterface #108 <Method int List.size()>
	//   31   62:anewarray       SubtitleParser[]
	//   32   65:astore_2        
			int i = 0;
	//   33   66:iconst_0        
	//   34   67:istore          5
			do
			{
				asamplesource = ((SampleSource []) (textrenderer));
	//   35   69:aload_2         
	//   36   70:astore_1        
				if(i >= textrenderer.length)
					break;
	//   37   71:iload           5
	//   38   73:aload_2         
	//   39   74:arraylength     
	//   40   75:icmpge          134
				try
				{
					textrenderer[i] = ((/*<invalid signature>*/java.lang.Object) ((SubtitleParser)((Class)DEFAULT_PARSER_CLASSES.get(i)).newInstance()));
	//   41   78:aload_2         
	//   42   79:iload           5
	//   43   81:getstatic       #45  <Field List DEFAULT_PARSER_CLASSES>
	//   44   84:iload           5
	//   45   86:invokeinterface #112 <Method Object List.get(int)>
	//   46   91:checkcast       #49  <Class Class>
	//   47   94:invokevirtual   #116 <Method Object Class.newInstance()>
	//   48   97:checkcast       #55  <Class SubtitleParser>
	//   49  100:aastore         
				}
	//*  50  101:iload           5
	//*  51  103:iconst_1        
	//*  52  104:iadd            
	//*  53  105:istore          5
	//*  54  107:goto            69
	//*  55  110:astore_1        
	//*  56  111:new             #118 <Class IllegalStateException>
	//*  57  114:dup             
	//*  58  115:ldc1            #120 <String "Unexpected error creating default parser">
	//*  59  117:aload_1         
	//*  60  118:invokespecial   #123 <Method void IllegalStateException(String, Throwable)>
	//*  61  121:athrow          
				// Misplaced declaration of an exception variable
				catch(SampleSource asamplesource[])
	//*  62  122:astore_1        
				{
					throw new IllegalStateException("Unexpected error creating default parser", ((Throwable) (asamplesource)));
	//   63  123:new             #118 <Class IllegalStateException>
	//   64  126:dup             
	//   65  127:ldc1            #120 <String "Unexpected error creating default parser">
	//   66  129:aload_1         
	//   67  130:invokespecial   #123 <Method void IllegalStateException(String, Throwable)>
	//   68  133:athrow          
				}
				// Misplaced declaration of an exception variable
				catch(SampleSource asamplesource[])
				{
					throw new IllegalStateException("Unexpected error creating default parser", ((Throwable) (asamplesource)));
				}
				i++;
			} while(true);
		}
		subtitleParsers = ((SubtitleParser []) (asamplesource));
	//   69  134:aload_0         
	//   70  135:aload_1         
	//   71  136:putfield        #125 <Field SubtitleParser[] subtitleParsers>
		formatHolder = new MediaFormatHolder();
	//   72  139:aload_0         
	//   73  140:new             #127 <Class MediaFormatHolder>
	//   74  143:dup             
	//   75  144:invokespecial   #128 <Method void MediaFormatHolder()>
	//   76  147:putfield        #130 <Field MediaFormatHolder formatHolder>
	//   77  150:return          
	}

	private void clearTextRenderer()
	{
		updateTextRenderer(Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:invokestatic    #137 <Method List Collections.emptyList()>
	//    2    4:invokespecial   #141 <Method void updateTextRenderer(List)>
	//    3    7:return          
	}

	private long getNextEventTime()
	{
		int i = nextSubtitleEventIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field int nextSubtitleEventIndex>
	//    2    4:istore_1        
		if(i != -1 && i < subtitle.getEventTimeCount())
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          36
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #147 <Field PlayableSubtitle subtitle>
	//*   9   15:invokevirtual   #152 <Method int PlayableSubtitle.getEventTimeCount()>
	//*  10   18:icmplt          24
	//*  11   21:goto            36
			return subtitle.getEventTime(nextSubtitleEventIndex);
	//   12   24:aload_0         
	//   13   25:getfield        #147 <Field PlayableSubtitle subtitle>
	//   14   28:aload_0         
	//   15   29:getfield        #145 <Field int nextSubtitleEventIndex>
	//   16   32:invokevirtual   #156 <Method long PlayableSubtitle.getEventTime(int)>
	//   17   35:lreturn         
		else
			return 0xffffffffL;
	//   18   36:ldc2w           #157 <Long 0xffffffffL>
	//   19   39:lreturn         
	}

	private int getParserIndex(MediaFormat mediaformat)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		do
		{
			SubtitleParser asubtitleparser[] = subtitleParsers;
	//    2    2:aload_0         
	//    3    3:getfield        #125 <Field SubtitleParser[] subtitleParsers>
	//    4    6:astore_3        
			if(i < asubtitleparser.length)
	//*   5    7:iload_2         
	//*   6    8:aload_3         
	//*   7    9:arraylength     
	//*   8   10:icmpge          37
			{
				if(asubtitleparser[i].canParse(mediaformat.mimeType))
	//*   9   13:aload_3         
	//*  10   14:iload_2         
	//*  11   15:aaload          
	//*  12   16:aload_1         
	//*  13   17:getfield        #166 <Field String MediaFormat.mimeType>
	//*  14   20:invokeinterface #170 <Method boolean SubtitleParser.canParse(String)>
	//*  15   25:ifeq            30
					return i;
	//   16   28:iload_2         
	//   17   29:ireturn         
				i++;
	//   18   30:iload_2         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_2        
			} else
	//*  22   34:goto            2
			{
				return -1;
	//   23   37:iconst_m1       
	//   24   38:ireturn         
			}
		} while(true);
	}

	private void invokeRendererInternalCues(List list)
	{
		textRenderer.onCues(list);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TextRenderer textRenderer>
	//    2    4:aload_1         
	//    3    5:invokeinterface #174 <Method void TextRenderer.onCues(List)>
	//    4   10:return          
	}

	private void updateTextRenderer(List list)
	{
		Handler handler = textRendererHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Handler textRendererHandler>
	//    2    4:astore_2        
		if(handler != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          19
		{
			handler.obtainMessage(0, ((Object) (list))).sendToTarget();
	//    5    9:aload_2         
	//    6   10:iconst_0        
	//    7   11:aload_1         
	//    8   12:invokevirtual   #180 <Method Message Handler.obtainMessage(int, Object)>
	//    9   15:invokevirtual   #185 <Method void Message.sendToTarget()>
			return;
	//   10   18:return          
		} else
		{
			invokeRendererInternalCues(list);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #187 <Method void invokeRendererInternalCues(List)>
			return;
	//   14   24:return          
		}
	}

	protected void doSomeWork(long l, long l1, boolean flag)
		throws ExoPlaybackException
	{
		if(nextSubtitle == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field PlayableSubtitle nextSubtitle>
	//*   2    4:ifnonnull       33
			try
			{
				nextSubtitle = parserHelper.getAndClearResult();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #197 <Field SubtitleParserHelper parserHelper>
	//    6   12:invokevirtual   #203 <Method PlayableSubtitle SubtitleParserHelper.getAndClearResult()>
	//    7   15:putfield        #195 <Field PlayableSubtitle nextSubtitle>
			}
	//*   8   18:goto            33
			catch(IOException ioexception)
	//*   9   21:astore          8
			{
				throw new ExoPlaybackException(((Throwable) (ioexception)));
	//   10   23:new             #191 <Class ExoPlaybackException>
	//   11   26:dup             
	//   12   27:aload           8
	//   13   29:invokespecial   #206 <Method void ExoPlaybackException(Throwable)>
	//   14   32:athrow          
			}
		if(getState() != 3)
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #209 <Method int getState()>
	//*  17   37:iconst_3        
	//*  18   38:icmpeq          42
			return;
	//   19   41:return          
		boolean flag1 = false;
	//   20   42:iconst_0        
	//   21   43:istore          6
		boolean flag2 = false;
	//   22   45:iconst_0        
	//   23   46:istore          7
		if(subtitle != null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #147 <Field PlayableSubtitle subtitle>
	//*  26   52:ifnull          91
		{
			l1 = getNextEventTime();
	//   27   55:aload_0         
	//   28   56:invokespecial   #211 <Method long getNextEventTime()>
	//   29   59:lstore_3        
			for(flag1 = flag2; l1 <= l; flag1 = true)
	//*  30   60:iload           7
	//*  31   62:istore          6
	//*  32   64:lload_3         
	//*  33   65:lload_1         
	//*  34   66:lcmp            
	//*  35   67:ifgt            91
			{
				nextSubtitleEventIndex = nextSubtitleEventIndex + 1;
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:getfield        #145 <Field int nextSubtitleEventIndex>
	//   39   75:iconst_1        
	//   40   76:iadd            
	//   41   77:putfield        #145 <Field int nextSubtitleEventIndex>
				l1 = getNextEventTime();
	//   42   80:aload_0         
	//   43   81:invokespecial   #211 <Method long getNextEventTime()>
	//   44   84:lstore_3        
			}

	//   45   85:iconst_1        
	//   46   86:istore          6
		}
	//*  47   88:goto            64
		PlayableSubtitle playablesubtitle = nextSubtitle;
	//   48   91:aload_0         
	//   49   92:getfield        #195 <Field PlayableSubtitle nextSubtitle>
	//   50   95:astore          8
		flag2 = flag1;
	//   51   97:iload           6
	//   52   99:istore          7
		if(playablesubtitle != null)
	//*  53  101:aload           8
	//*  54  103:ifnull          148
		{
			flag2 = flag1;
	//   55  106:iload           6
	//   56  108:istore          7
			if(playablesubtitle.startTimeUs <= l)
	//*  57  110:aload           8
	//*  58  112:getfield        #215 <Field long PlayableSubtitle.startTimeUs>
	//*  59  115:lload_1         
	//*  60  116:lcmp            
	//*  61  117:ifgt            148
			{
				subtitle = nextSubtitle;
	//   62  120:aload_0         
	//   63  121:aload_0         
	//   64  122:getfield        #195 <Field PlayableSubtitle nextSubtitle>
	//   65  125:putfield        #147 <Field PlayableSubtitle subtitle>
				nextSubtitle = null;
	//   66  128:aload_0         
	//   67  129:aconst_null     
	//   68  130:putfield        #195 <Field PlayableSubtitle nextSubtitle>
				nextSubtitleEventIndex = subtitle.getNextEventTimeIndex(l);
	//   69  133:aload_0         
	//   70  134:aload_0         
	//   71  135:getfield        #147 <Field PlayableSubtitle subtitle>
	//   72  138:lload_1         
	//   73  139:invokevirtual   #219 <Method int PlayableSubtitle.getNextEventTimeIndex(long)>
	//   74  142:putfield        #145 <Field int nextSubtitleEventIndex>
				flag2 = true;
	//   75  145:iconst_1        
	//   76  146:istore          7
			}
		}
		if(flag2)
	//*  77  148:iload           7
	//*  78  150:ifeq            165
			updateTextRenderer(subtitle.getCues(l));
	//   79  153:aload_0         
	//   80  154:aload_0         
	//   81  155:getfield        #147 <Field PlayableSubtitle subtitle>
	//   82  158:lload_1         
	//   83  159:invokevirtual   #223 <Method List PlayableSubtitle.getCues(long)>
	//   84  162:invokespecial   #141 <Method void updateTextRenderer(List)>
		if(!inputStreamEnded && nextSubtitle == null && !parserHelper.isParsing())
	//*  85  165:aload_0         
	//*  86  166:getfield        #225 <Field boolean inputStreamEnded>
	//*  87  169:ifne            264
	//*  88  172:aload_0         
	//*  89  173:getfield        #195 <Field PlayableSubtitle nextSubtitle>
	//*  90  176:ifnonnull       264
	//*  91  179:aload_0         
	//*  92  180:getfield        #197 <Field SubtitleParserHelper parserHelper>
	//*  93  183:invokevirtual   #229 <Method boolean SubtitleParserHelper.isParsing()>
	//*  94  186:ifne            264
		{
			SampleHolder sampleholder = parserHelper.getSampleHolder();
	//   95  189:aload_0         
	//   96  190:getfield        #197 <Field SubtitleParserHelper parserHelper>
	//   97  193:invokevirtual   #233 <Method SampleHolder SubtitleParserHelper.getSampleHolder()>
	//   98  196:astore          8
			sampleholder.clearData();
	//   99  198:aload           8
	//  100  200:invokevirtual   #238 <Method void SampleHolder.clearData()>
			int i = readSource(l, formatHolder, sampleholder);
	//  101  203:aload_0         
	//  102  204:lload_1         
	//  103  205:aload_0         
	//  104  206:getfield        #130 <Field MediaFormatHolder formatHolder>
	//  105  209:aload           8
	//  106  211:invokevirtual   #242 <Method int readSource(long, MediaFormatHolder, SampleHolder)>
	//  107  214:istore          6
			if(i == -4)
	//* 108  216:iload           6
	//* 109  218:bipush          -4
	//* 110  220:icmpne          238
			{
				parserHelper.setFormat(formatHolder.format);
	//  111  223:aload_0         
	//  112  224:getfield        #197 <Field SubtitleParserHelper parserHelper>
	//  113  227:aload_0         
	//  114  228:getfield        #130 <Field MediaFormatHolder formatHolder>
	//  115  231:getfield        #246 <Field MediaFormat MediaFormatHolder.format>
	//  116  234:invokevirtual   #250 <Method void SubtitleParserHelper.setFormat(MediaFormat)>
				return;
	//  117  237:return          
			}
			if(i == -3)
	//* 118  238:iload           6
	//* 119  240:bipush          -3
	//* 120  242:icmpne          253
			{
				parserHelper.startParseOperation();
	//  121  245:aload_0         
	//  122  246:getfield        #197 <Field SubtitleParserHelper parserHelper>
	//  123  249:invokevirtual   #253 <Method void SubtitleParserHelper.startParseOperation()>
				return;
	//  124  252:return          
			}
			if(i == -1)
	//* 125  253:iload           6
	//* 126  255:iconst_m1       
	//* 127  256:icmpne          264
				inputStreamEnded = true;
	//  128  259:aload_0         
	//  129  260:iconst_1        
	//  130  261:putfield        #225 <Field boolean inputStreamEnded>
		}
	//  131  264:return          
	}

	protected long getBufferedPositionUs()
	{
		return -3L;
	//    0    0:ldc2w           #256 <Long -3L>
	//    1    3:lreturn         
	}

	public boolean handleMessage(Message message)
	{
		if(message.what != 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #262 <Field int Message.what>
	//*   2    4:ifeq            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			invokeRendererInternalCues((List)message.obj);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #266 <Field Object Message.obj>
	//    8   14:checkcast       #61  <Class List>
	//    9   17:invokespecial   #187 <Method void invokeRendererInternalCues(List)>
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		}
	}

	protected boolean handlesTrack(MediaFormat mediaformat)
	{
		return getParserIndex(mediaformat) != -1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #270 <Method int getParserIndex(MediaFormat)>
	//    3    5:iconst_m1       
	//    4    6:icmpeq          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	protected boolean isEnded()
	{
		return inputStreamEnded && (subtitle == null || getNextEventTime() == 0xffffffffL);
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field boolean inputStreamEnded>
	//    2    4:ifeq            27
	//    3    7:aload_0         
	//    4    8:getfield        #147 <Field PlayableSubtitle subtitle>
	//    5   11:ifnull          25
	//    6   14:aload_0         
	//    7   15:invokespecial   #211 <Method long getNextEventTime()>
	//    8   18:ldc2w           #157 <Long 0xffffffffL>
	//    9   21:lcmp            
	//   10   22:ifne            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	protected boolean isReady()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void onDisabled()
		throws ExoPlaybackException
	{
		subtitle = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #147 <Field PlayableSubtitle subtitle>
		nextSubtitle = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #195 <Field PlayableSubtitle nextSubtitle>
		parserThread.quit();
	//    6   10:aload_0         
	//    7   11:getfield        #275 <Field HandlerThread parserThread>
	//    8   14:invokevirtual   #280 <Method boolean HandlerThread.quit()>
	//    9   17:pop             
		parserThread = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #275 <Field HandlerThread parserThread>
		parserHelper = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #197 <Field SubtitleParserHelper parserHelper>
		clearTextRenderer();
	//   16   28:aload_0         
	//   17   29:invokespecial   #282 <Method void clearTextRenderer()>
		super.onDisabled();
	//   18   32:aload_0         
	//   19   33:invokespecial   #284 <Method void SampleSourceTrackRenderer.onDisabled()>
	//   20   36:return          
	}

	protected void onDiscontinuity(long l)
	{
		inputStreamEnded = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #225 <Field boolean inputStreamEnded>
		subtitle = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #147 <Field PlayableSubtitle subtitle>
		nextSubtitle = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #195 <Field PlayableSubtitle nextSubtitle>
		clearTextRenderer();
	//    9   15:aload_0         
	//   10   16:invokespecial   #282 <Method void clearTextRenderer()>
		SubtitleParserHelper subtitleparserhelper = parserHelper;
	//   11   19:aload_0         
	//   12   20:getfield        #197 <Field SubtitleParserHelper parserHelper>
	//   13   23:astore_3        
		if(subtitleparserhelper != null)
	//*  14   24:aload_3         
	//*  15   25:ifnull          32
			subtitleparserhelper.flush();
	//   16   28:aload_3         
	//   17   29:invokevirtual   #289 <Method void SubtitleParserHelper.flush()>
	//   18   32:return          
	}

	protected void onEnabled(int i, long l, boolean flag)
		throws ExoPlaybackException
	{
		super.onEnabled(i, l, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:iload           4
	//    4    5:invokespecial   #293 <Method void SampleSourceTrackRenderer.onEnabled(int, long, boolean)>
		parserIndex = getParserIndex(getFormat(i));
	//    5    8:aload_0         
	//    6    9:aload_0         
	//    7   10:aload_0         
	//    8   11:iload_1         
	//    9   12:invokevirtual   #297 <Method MediaFormat getFormat(int)>
	//   10   15:invokespecial   #270 <Method int getParserIndex(MediaFormat)>
	//   11   18:putfield        #299 <Field int parserIndex>
		parserThread = new HandlerThread("textParser");
	//   12   21:aload_0         
	//   13   22:new             #277 <Class HandlerThread>
	//   14   25:dup             
	//   15   26:ldc2            #301 <String "textParser">
	//   16   29:invokespecial   #304 <Method void HandlerThread(String)>
	//   17   32:putfield        #275 <Field HandlerThread parserThread>
		parserThread.start();
	//   18   35:aload_0         
	//   19   36:getfield        #275 <Field HandlerThread parserThread>
	//   20   39:invokevirtual   #307 <Method void HandlerThread.start()>
		parserHelper = new SubtitleParserHelper(parserThread.getLooper(), subtitleParsers[parserIndex]);
	//   21   42:aload_0         
	//   22   43:new             #199 <Class SubtitleParserHelper>
	//   23   46:dup             
	//   24   47:aload_0         
	//   25   48:getfield        #275 <Field HandlerThread parserThread>
	//   26   51:invokevirtual   #311 <Method Looper HandlerThread.getLooper()>
	//   27   54:aload_0         
	//   28   55:getfield        #125 <Field SubtitleParser[] subtitleParsers>
	//   29   58:aload_0         
	//   30   59:getfield        #299 <Field int parserIndex>
	//   31   62:aaload          
	//   32   63:invokespecial   #314 <Method void SubtitleParserHelper(Looper, SubtitleParser)>
	//   33   66:putfield        #197 <Field SubtitleParserHelper parserHelper>
	//   34   69:return          
	}

	private static final List DEFAULT_PARSER_CLASSES;
	private static final int MSG_UPDATE_OVERLAY = 0;
	private final MediaFormatHolder formatHolder;
	private boolean inputStreamEnded;
	private PlayableSubtitle nextSubtitle;
	private int nextSubtitleEventIndex;
	private SubtitleParserHelper parserHelper;
	private int parserIndex;
	private HandlerThread parserThread;
	private PlayableSubtitle subtitle;
	private final SubtitleParser subtitleParsers[];
	private final TextRenderer textRenderer;
	private final Handler textRendererHandler;

	static 
	{
		DEFAULT_PARSER_CLASSES = ((List) (new ArrayList()));
	//    0    0:new             #40  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void ArrayList()>
	//    3    7:putstatic       #45  <Field List DEFAULT_PARSER_CLASSES>
		try
		{
			DEFAULT_PARSER_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.text.webvtt.WebvttParser").asSubclass(com/google/android/exoplayer/text/SubtitleParser))));
	//    4   10:getstatic       #45  <Field List DEFAULT_PARSER_CLASSES>
	//    5   13:ldc1            #47  <String "com.google.android.exoplayer.text.webvtt.WebvttParser">
	//    6   15:invokestatic    #53  <Method Class Class.forName(String)>
	//    7   18:ldc1            #55  <Class SubtitleParser>
	//    8   20:invokevirtual   #59  <Method Class Class.asSubclass(Class)>
	//    9   23:invokeinterface #65  <Method boolean List.add(Object)>
	//   10   28:pop             
		}
	//*  11   29:getstatic       #45  <Field List DEFAULT_PARSER_CLASSES>
	//*  12   32:ldc1            #67  <String "com.google.android.exoplayer.text.ttml.TtmlParser">
	//*  13   34:invokestatic    #53  <Method Class Class.forName(String)>
	//*  14   37:ldc1            #55  <Class SubtitleParser>
	//*  15   39:invokevirtual   #59  <Method Class Class.asSubclass(Class)>
	//*  16   42:invokeinterface #65  <Method boolean List.add(Object)>
	//*  17   47:pop             
	//*  18   48:getstatic       #45  <Field List DEFAULT_PARSER_CLASSES>
	//*  19   51:ldc1            #69  <String "com.google.android.exoplayer.text.webvtt.Mp4WebvttParser">
	//*  20   53:invokestatic    #53  <Method Class Class.forName(String)>
	//*  21   56:ldc1            #55  <Class SubtitleParser>
	//*  22   58:invokevirtual   #59  <Method Class Class.asSubclass(Class)>
	//*  23   61:invokeinterface #65  <Method boolean List.add(Object)>
	//*  24   66:pop             
	//*  25   67:getstatic       #45  <Field List DEFAULT_PARSER_CLASSES>
	//*  26   70:ldc1            #71  <String "com.google.android.exoplayer.text.subrip.SubripParser">
	//*  27   72:invokestatic    #53  <Method Class Class.forName(String)>
	//*  28   75:ldc1            #55  <Class SubtitleParser>
	//*  29   77:invokevirtual   #59  <Method Class Class.asSubclass(Class)>
	//*  30   80:invokeinterface #65  <Method boolean List.add(Object)>
	//*  31   85:pop             
	//*  32   86:getstatic       #45  <Field List DEFAULT_PARSER_CLASSES>
	//*  33   89:ldc1            #73  <String "com.google.android.exoplayer.text.tx3g.Tx3gParser">
	//*  34   91:invokestatic    #53  <Method Class Class.forName(String)>
	//*  35   94:ldc1            #55  <Class SubtitleParser>
	//*  36   96:invokevirtual   #59  <Method Class Class.asSubclass(Class)>
	//*  37   99:invokeinterface #65  <Method boolean List.add(Object)>
	//*  38  104:pop             
	//*  39  105:return          
		catch(ClassNotFoundException classnotfoundexception) { }
	//   40  106:astore_0        
		try
		{
			DEFAULT_PARSER_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.text.ttml.TtmlParser").asSubclass(com/google/android/exoplayer/text/SubtitleParser))));
		}
	//*  41  107:goto            29
		catch(ClassNotFoundException classnotfoundexception1) { }
	//   42  110:astore_0        
		try
		{
			DEFAULT_PARSER_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.text.webvtt.Mp4WebvttParser").asSubclass(com/google/android/exoplayer/text/SubtitleParser))));
		}
	//*  43  111:goto            48
		catch(ClassNotFoundException classnotfoundexception2) { }
	//   44  114:astore_0        
		try
		{
			DEFAULT_PARSER_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.text.subrip.SubripParser").asSubclass(com/google/android/exoplayer/text/SubtitleParser))));
		}
	//*  45  115:goto            67
		catch(ClassNotFoundException classnotfoundexception3) { }
	//   46  118:astore_0        
		try
		{
			DEFAULT_PARSER_CLASSES.add(((Object) (Class.forName("com.google.android.exoplayer.text.tx3g.Tx3gParser").asSubclass(com/google/android/exoplayer/text/SubtitleParser))));
		}
	//*  47  119:goto            86
		catch(ClassNotFoundException classnotfoundexception4) { }
	//   48  122:astore_0        
	//*  49  123:return          
	}
}
