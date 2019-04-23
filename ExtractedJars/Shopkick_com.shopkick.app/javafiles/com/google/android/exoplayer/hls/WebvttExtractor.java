// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import android.text.TextUtils;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.extractor.ts.PtsTimestampAdjuster;
import com.google.android.exoplayer.text.webvtt.WebvttCueParser;
import com.google.android.exoplayer.text.webvtt.WebvttParserUtil;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class WebvttExtractor
	implements Extractor
{

	public WebvttExtractor(PtsTimestampAdjuster ptstimestampadjuster)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		ptsTimestampAdjuster = ptstimestampadjuster;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//    5    9:aload_0         
	//    6   10:new             #44  <Class ParsableByteArray>
	//    7   13:dup             
	//    8   14:invokespecial   #45  <Method void ParsableByteArray()>
	//    9   17:putfield        #47  <Field ParsableByteArray sampleDataWrapper>
		sampleData = new byte[1024];
	//   10   20:aload_0         
	//   11   21:sipush          1024
	//   12   24:newarray        byte[]
	//   13   26:putfield        #49  <Field byte[] sampleData>
	//   14   29:return          
	}

	private TrackOutput buildTrackOutput(long l)
	{
		TrackOutput trackoutput = output.track(0);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ExtractorOutput output>
	//    2    4:iconst_0        
	//    3    5:invokeinterface #59  <Method TrackOutput ExtractorOutput.track(int)>
	//    4   10:astore_3        
		trackoutput.format(MediaFormat.createTextFormat("id", "text/vtt", -1, -1L, "en", l));
	//    5   11:aload_3         
	//    6   12:ldc1            #61  <String "id">
	//    7   14:ldc1            #63  <String "text/vtt">
	//    8   16:iconst_m1       
	//    9   17:ldc2w           #64  <Long -1L>
	//   10   20:ldc1            #67  <String "en">
	//   11   22:lload_1         
	//   12   23:invokestatic    #73  <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String, long)>
	//   13   26:invokeinterface #79  <Method void TrackOutput.format(MediaFormat)>
		output.endTracks();
	//   14   31:aload_0         
	//   15   32:getfield        #53  <Field ExtractorOutput output>
	//   16   35:invokeinterface #82  <Method void ExtractorOutput.endTracks()>
		return trackoutput;
	//   17   40:aload_3         
	//   18   41:areturn         
	}

	private void processSample()
		throws ParserException
	{
		Object obj1 = ((Object) (new ParsableByteArray(sampleData)));
	//    0    0:new             #44  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field byte[] sampleData>
	//    4    8:invokespecial   #88  <Method void ParsableByteArray(byte[])>
	//    5   11:astore          8
		WebvttParserUtil.validateWebvttHeaderLine(((ParsableByteArray) (obj1)));
	//    6   13:aload           8
	//    7   15:invokestatic    #94  <Method void WebvttParserUtil.validateWebvttHeaderLine(ParsableByteArray)>
		long l = 0L;
	//    8   18:lconst_0        
	//    9   19:lstore_1        
		long l1 = l;
	//   10   20:lload_1         
	//   11   21:lstore_3        
		do
		{
			String s = ((ParsableByteArray) (obj1)).readLine();
	//   12   22:aload           8
	//   13   24:invokevirtual   #98  <Method String ParsableByteArray.readLine()>
	//   14   27:astore          7
			if(TextUtils.isEmpty(((CharSequence) (s))))
				break;
	//   15   29:aload           7
	//   16   31:invokestatic    #104 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   17   34:ifne            185
			if(s.startsWith("X-TIMESTAMP-MAP"))
	//*  18   37:aload           7
	//*  19   39:ldc1            #106 <String "X-TIMESTAMP-MAP">
	//*  20   41:invokevirtual   #112 <Method boolean String.startsWith(String)>
	//*  21   44:ifeq            22
			{
				Matcher matcher = LOCAL_TIMESTAMP.matcher(((CharSequence) (s)));
	//   22   47:getstatic       #31  <Field Pattern LOCAL_TIMESTAMP>
	//   23   50:aload           7
	//   24   52:invokevirtual   #116 <Method Matcher Pattern.matcher(CharSequence)>
	//   25   55:astore          9
				if(matcher.find())
	//*  26   57:aload           9
	//*  27   59:invokevirtual   #122 <Method boolean Matcher.find()>
	//*  28   62:ifeq            147
				{
					Matcher matcher1 = MEDIA_TIMESTAMP.matcher(((CharSequence) (s)));
	//   29   65:getstatic       #35  <Field Pattern MEDIA_TIMESTAMP>
	//   30   68:aload           7
	//   31   70:invokevirtual   #116 <Method Matcher Pattern.matcher(CharSequence)>
	//   32   73:astore          10
					if(matcher1.find())
	//*  33   75:aload           10
	//*  34   77:invokevirtual   #122 <Method boolean Matcher.find()>
	//*  35   80:ifeq            109
					{
						l1 = WebvttParserUtil.parseTimestampUs(matcher.group(1));
	//   36   83:aload           9
	//   37   85:iconst_1        
	//   38   86:invokevirtual   #126 <Method String Matcher.group(int)>
	//   39   89:invokestatic    #130 <Method long WebvttParserUtil.parseTimestampUs(String)>
	//   40   92:lstore_3        
						l = PtsTimestampAdjuster.ptsToUs(Long.parseLong(matcher1.group(1)));
	//   41   93:aload           10
	//   42   95:iconst_1        
	//   43   96:invokevirtual   #126 <Method String Matcher.group(int)>
	//   44   99:invokestatic    #135 <Method long Long.parseLong(String)>
	//   45  102:invokestatic    #141 <Method long PtsTimestampAdjuster.ptsToUs(long)>
	//   46  105:lstore_1        
					} else
	//*  47  106:goto            22
					{
						obj1 = ((Object) (new StringBuilder()));
	//   48  109:new             #143 <Class StringBuilder>
	//   49  112:dup             
	//   50  113:invokespecial   #144 <Method void StringBuilder()>
	//   51  116:astore          8
						((StringBuilder) (obj1)).append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
	//   52  118:aload           8
	//   53  120:ldc1            #146 <String "X-TIMESTAMP-MAP doesn't contain media timestamp: ">
	//   54  122:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   55  125:pop             
						((StringBuilder) (obj1)).append(s);
	//   56  126:aload           8
	//   57  128:aload           7
	//   58  130:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   59  133:pop             
						throw new ParserException(((StringBuilder) (obj1)).toString());
	//   60  134:new             #85  <Class ParserException>
	//   61  137:dup             
	//   62  138:aload           8
	//   63  140:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   64  143:invokespecial   #156 <Method void ParserException(String)>
	//   65  146:athrow          
					}
				} else
				{
					obj1 = ((Object) (new StringBuilder()));
	//   66  147:new             #143 <Class StringBuilder>
	//   67  150:dup             
	//   68  151:invokespecial   #144 <Method void StringBuilder()>
	//   69  154:astore          8
					((StringBuilder) (obj1)).append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
	//   70  156:aload           8
	//   71  158:ldc1            #158 <String "X-TIMESTAMP-MAP doesn't contain local timestamp: ">
	//   72  160:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   73  163:pop             
					((StringBuilder) (obj1)).append(s);
	//   74  164:aload           8
	//   75  166:aload           7
	//   76  168:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   77  171:pop             
					throw new ParserException(((StringBuilder) (obj1)).toString());
	//   78  172:new             #85  <Class ParserException>
	//   79  175:dup             
	//   80  176:aload           8
	//   81  178:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   82  181:invokespecial   #156 <Method void ParserException(String)>
	//   83  184:athrow          
				}
			}
		} while(true);
		Object obj = ((Object) (WebvttCueParser.findNextCueHeader(((ParsableByteArray) (obj1)))));
	//   84  185:aload           8
	//   85  187:invokestatic    #164 <Method Matcher WebvttCueParser.findNextCueHeader(ParsableByteArray)>
	//   86  190:astore          7
		if(obj == null)
	//*  87  192:aload           7
	//*  88  194:ifnonnull       204
		{
			buildTrackOutput(0L);
	//   89  197:aload_0         
	//   90  198:lconst_0        
	//   91  199:invokespecial   #166 <Method TrackOutput buildTrackOutput(long)>
	//   92  202:pop             
			return;
	//   93  203:return          
		} else
		{
			long l2 = WebvttParserUtil.parseTimestampUs(((Matcher) (obj)).group(1));
	//   94  204:aload           7
	//   95  206:iconst_1        
	//   96  207:invokevirtual   #126 <Method String Matcher.group(int)>
	//   97  210:invokestatic    #130 <Method long WebvttParserUtil.parseTimestampUs(String)>
	//   98  213:lstore          5
			l = ptsTimestampAdjuster.adjustTimestamp(PtsTimestampAdjuster.usToPts((l + l2) - l1));
	//   99  215:aload_0         
	//  100  216:getfield        #42  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//  101  219:lload_1         
	//  102  220:lload           5
	//  103  222:ladd            
	//  104  223:lload_3         
	//  105  224:lsub            
	//  106  225:invokestatic    #169 <Method long PtsTimestampAdjuster.usToPts(long)>
	//  107  228:invokevirtual   #172 <Method long PtsTimestampAdjuster.adjustTimestamp(long)>
	//  108  231:lstore_1        
			obj = ((Object) (buildTrackOutput(l - l2)));
	//  109  232:aload_0         
	//  110  233:lload_1         
	//  111  234:lload           5
	//  112  236:lsub            
	//  113  237:invokespecial   #166 <Method TrackOutput buildTrackOutput(long)>
	//  114  240:astore          7
			sampleDataWrapper.reset(sampleData, sampleSize);
	//  115  242:aload_0         
	//  116  243:getfield        #47  <Field ParsableByteArray sampleDataWrapper>
	//  117  246:aload_0         
	//  118  247:getfield        #49  <Field byte[] sampleData>
	//  119  250:aload_0         
	//  120  251:getfield        #174 <Field int sampleSize>
	//  121  254:invokevirtual   #178 <Method void ParsableByteArray.reset(byte[], int)>
			((TrackOutput) (obj)).sampleData(sampleDataWrapper, sampleSize);
	//  122  257:aload           7
	//  123  259:aload_0         
	//  124  260:getfield        #47  <Field ParsableByteArray sampleDataWrapper>
	//  125  263:aload_0         
	//  126  264:getfield        #174 <Field int sampleSize>
	//  127  267:invokeinterface #181 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			((TrackOutput) (obj)).sampleMetadata(l, 1, sampleSize, 0, ((byte []) (null)));
	//  128  272:aload           7
	//  129  274:lload_1         
	//  130  275:iconst_1        
	//  131  276:aload_0         
	//  132  277:getfield        #174 <Field int sampleSize>
	//  133  280:iconst_0        
	//  134  281:aconst_null     
	//  135  282:invokeinterface #185 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
			return;
	//  136  287:return          
		}
	}

	public void init(ExtractorOutput extractoroutput)
	{
		output = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field ExtractorOutput output>
		extractoroutput.seekMap(SeekMap.UNSEEKABLE);
	//    3    5:aload_1         
	//    4    6:getstatic       #194 <Field SeekMap SeekMap.UNSEEKABLE>
	//    5    9:invokeinterface #198 <Method void ExtractorOutput.seekMap(SeekMap)>
	//    6   14:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		int j = (int)extractorinput.getLength();
	//    0    0:aload_1         
	//    1    1:invokeinterface #210 <Method long ExtractorInput.getLength()>
	//    2    6:l2i             
	//    3    7:istore          4
		int i = sampleSize;
	//    4    9:aload_0         
	//    5   10:getfield        #174 <Field int sampleSize>
	//    6   13:istore_3        
		positionholder = ((PositionHolder) (sampleData));
	//    7   14:aload_0         
	//    8   15:getfield        #49  <Field byte[] sampleData>
	//    9   18:astore_2        
		if(i == positionholder.length)
	//*  10   19:iload_3         
	//*  11   20:aload_2         
	//*  12   21:arraylength     
	//*  13   22:icmpne          53
		{
			if(j != -1)
	//*  14   25:iload           4
	//*  15   27:iconst_m1       
	//*  16   28:icmpeq          37
				i = j;
	//   17   31:iload           4
	//   18   33:istore_3        
			else
	//*  19   34:goto            40
				i = positionholder.length;
	//   20   37:aload_2         
	//   21   38:arraylength     
	//   22   39:istore_3        
			sampleData = Arrays.copyOf(((byte []) (positionholder)), (i * 3) / 2);
	//   23   40:aload_0         
	//   24   41:aload_2         
	//   25   42:iload_3         
	//   26   43:iconst_3        
	//   27   44:imul            
	//   28   45:iconst_2        
	//   29   46:idiv            
	//   30   47:invokestatic    #216 <Method byte[] Arrays.copyOf(byte[], int)>
	//   31   50:putfield        #49  <Field byte[] sampleData>
		}
		positionholder = ((PositionHolder) (sampleData));
	//   32   53:aload_0         
	//   33   54:getfield        #49  <Field byte[] sampleData>
	//   34   57:astore_2        
		i = sampleSize;
	//   35   58:aload_0         
	//   36   59:getfield        #174 <Field int sampleSize>
	//   37   62:istore_3        
		i = extractorinput.read(((byte []) (positionholder)), i, positionholder.length - i);
	//   38   63:aload_1         
	//   39   64:aload_2         
	//   40   65:iload_3         
	//   41   66:aload_2         
	//   42   67:arraylength     
	//   43   68:iload_3         
	//   44   69:isub            
	//   45   70:invokeinterface #219 <Method int ExtractorInput.read(byte[], int, int)>
	//   46   75:istore_3        
		if(i != -1)
	//*  47   76:iload_3         
	//*  48   77:iconst_m1       
	//*  49   78:icmpeq          108
		{
			sampleSize = sampleSize + i;
	//   50   81:aload_0         
	//   51   82:aload_0         
	//   52   83:getfield        #174 <Field int sampleSize>
	//   53   86:iload_3         
	//   54   87:iadd            
	//   55   88:putfield        #174 <Field int sampleSize>
			if(j == -1 || sampleSize != j)
	//*  56   91:iload           4
	//*  57   93:iconst_m1       
	//*  58   94:icmpeq          106
	//*  59   97:aload_0         
	//*  60   98:getfield        #174 <Field int sampleSize>
	//*  61  101:iload           4
	//*  62  103:icmpeq          108
				return 0;
	//   63  106:iconst_0        
	//   64  107:ireturn         
		}
		processSample();
	//   65  108:aload_0         
	//   66  109:invokespecial   #221 <Method void processSample()>
		return -1;
	//   67  112:iconst_m1       
	//   68  113:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		throw new IllegalStateException();
	//    0    0:new             #225 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #226 <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		throw new IllegalStateException();
	//    0    0:new             #225 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #226 <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	private static final Pattern LOCAL_TIMESTAMP = Pattern.compile("LOCAL:([^,]+)");
	private static final Pattern MEDIA_TIMESTAMP = Pattern.compile("MPEGTS:(\\d+)");
	private ExtractorOutput output;
	private final PtsTimestampAdjuster ptsTimestampAdjuster;
	private byte sampleData[];
	private final ParsableByteArray sampleDataWrapper = new ParsableByteArray();
	private int sampleSize;

	static 
	{
	//    0    0:ldc1            #23  <String "LOCAL:([^,]+)">
	//    1    2:invokestatic    #29  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #31  <Field Pattern LOCAL_TIMESTAMP>
	//    3    8:ldc1            #33  <String "MPEGTS:(\\d+)">
	//    4   10:invokestatic    #29  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #35  <Field Pattern MEDIA_TIMESTAMP>
	//*   6   16:return          
	}
}
