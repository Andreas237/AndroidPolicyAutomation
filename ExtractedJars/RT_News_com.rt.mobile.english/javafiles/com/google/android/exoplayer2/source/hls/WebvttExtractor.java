// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.webvtt.WebvttParserUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class WebvttExtractor
	implements Extractor
{

	public WebvttExtractor(String s, TimestampAdjuster timestampadjuster)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		language = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field String language>
		timestampAdjuster = timestampadjuster;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #46  <Field TimestampAdjuster timestampAdjuster>
	//    8   14:aload_0         
	//    9   15:new             #48  <Class ParsableByteArray>
	//   10   18:dup             
	//   11   19:invokespecial   #49  <Method void ParsableByteArray()>
	//   12   22:putfield        #51  <Field ParsableByteArray sampleDataWrapper>
		sampleData = new byte[1024];
	//   13   25:aload_0         
	//   14   26:sipush          1024
	//   15   29:newarray        byte[]
	//   16   31:putfield        #53  <Field byte[] sampleData>
	//   17   34:return          
	}

	private TrackOutput buildTrackOutput(long l)
	{
		TrackOutput trackoutput = output.track(0, 3);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ExtractorOutput output>
	//    2    4:iconst_0        
	//    3    5:iconst_3        
	//    4    6:invokeinterface #63  <Method TrackOutput ExtractorOutput.track(int, int)>
	//    5   11:astore_3        
		trackoutput.format(Format.createTextSampleFormat(((String) (null)), "text/vtt", ((String) (null)), -1, 0, language, ((com.google.android.exoplayer2.drm.DrmInitData) (null)), l));
	//    6   12:aload_3         
	//    7   13:aconst_null     
	//    8   14:ldc1            #65  <String "text/vtt">
	//    9   16:aconst_null     
	//   10   17:iconst_m1       
	//   11   18:iconst_0        
	//   12   19:aload_0         
	//   13   20:getfield        #44  <Field String language>
	//   14   23:aconst_null     
	//   15   24:lload_1         
	//   16   25:invokestatic    #71  <Method Format Format.createTextSampleFormat(String, String, String, int, int, String, com.google.android.exoplayer2.drm.DrmInitData, long)>
	//   17   28:invokeinterface #77  <Method void TrackOutput.format(Format)>
		output.endTracks();
	//   18   33:aload_0         
	//   19   34:getfield        #57  <Field ExtractorOutput output>
	//   20   37:invokeinterface #80  <Method void ExtractorOutput.endTracks()>
		return trackoutput;
	//   21   42:aload_3         
	//   22   43:areturn         
	}

	private void processSample()
		throws ParserException
	{
		Object obj1 = ((Object) (new ParsableByteArray(sampleData)));
	//    0    0:new             #48  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field byte[] sampleData>
	//    4    8:invokespecial   #88  <Method void ParsableByteArray(byte[])>
	//    5   11:astore          8
		long l;
		long l1;
		Object obj;
		try
		{
			WebvttParserUtil.validateWebvttHeaderLine(((ParsableByteArray) (obj1)));
	//    6   13:aload           8
	//    7   15:invokestatic    #94  <Method void WebvttParserUtil.validateWebvttHeaderLine(ParsableByteArray)>
		}
	//*   8   18:lconst_0        
	//*   9   19:lstore_1        
	//*  10   20:lload_1         
	//*  11   21:lstore_3        
	//*  12   22:aload           8
	//*  13   24:invokevirtual   #98  <Method String ParsableByteArray.readLine()>
	//*  14   27:astore          7
	//*  15   29:aload           7
	//*  16   31:invokestatic    #104 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   34:ifne            185
	//*  18   37:aload           7
	//*  19   39:ldc1            #106 <String "X-TIMESTAMP-MAP">
	//*  20   41:invokevirtual   #112 <Method boolean String.startsWith(String)>
	//*  21   44:ifeq            22
	//*  22   47:getstatic       #33  <Field Pattern LOCAL_TIMESTAMP>
	//*  23   50:aload           7
	//*  24   52:invokevirtual   #116 <Method Matcher Pattern.matcher(CharSequence)>
	//*  25   55:astore          9
	//*  26   57:aload           9
	//*  27   59:invokevirtual   #122 <Method boolean Matcher.find()>
	//*  28   62:ifne            103
	//*  29   65:new             #124 <Class StringBuilder>
	//*  30   68:dup             
	//*  31   69:invokespecial   #125 <Method void StringBuilder()>
	//*  32   72:astore          8
	//*  33   74:aload           8
	//*  34   76:ldc1            #127 <String "X-TIMESTAMP-MAP doesn't contain local timestamp: ">
	//*  35   78:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  36   81:pop             
	//*  37   82:aload           8
	//*  38   84:aload           7
	//*  39   86:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  40   89:pop             
	//*  41   90:new             #83  <Class ParserException>
	//*  42   93:dup             
	//*  43   94:aload           8
	//*  44   96:invokevirtual   #134 <Method String StringBuilder.toString()>
	//*  45   99:invokespecial   #137 <Method void ParserException(String)>
	//*  46  102:athrow          
	//*  47  103:getstatic       #37  <Field Pattern MEDIA_TIMESTAMP>
	//*  48  106:aload           7
	//*  49  108:invokevirtual   #116 <Method Matcher Pattern.matcher(CharSequence)>
	//*  50  111:astore          10
	//*  51  113:aload           10
	//*  52  115:invokevirtual   #122 <Method boolean Matcher.find()>
	//*  53  118:ifne            159
	//*  54  121:new             #124 <Class StringBuilder>
	//*  55  124:dup             
	//*  56  125:invokespecial   #125 <Method void StringBuilder()>
	//*  57  128:astore          8
	//*  58  130:aload           8
	//*  59  132:ldc1            #139 <String "X-TIMESTAMP-MAP doesn't contain media timestamp: ">
	//*  60  134:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  61  137:pop             
	//*  62  138:aload           8
	//*  63  140:aload           7
	//*  64  142:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//*  65  145:pop             
	//*  66  146:new             #83  <Class ParserException>
	//*  67  149:dup             
	//*  68  150:aload           8
	//*  69  152:invokevirtual   #134 <Method String StringBuilder.toString()>
	//*  70  155:invokespecial   #137 <Method void ParserException(String)>
	//*  71  158:athrow          
	//*  72  159:aload           9
	//*  73  161:iconst_1        
	//*  74  162:invokevirtual   #143 <Method String Matcher.group(int)>
	//*  75  165:invokestatic    #147 <Method long WebvttParserUtil.parseTimestampUs(String)>
	//*  76  168:lstore_3        
	//*  77  169:aload           10
	//*  78  171:iconst_1        
	//*  79  172:invokevirtual   #143 <Method String Matcher.group(int)>
	//*  80  175:invokestatic    #152 <Method long Long.parseLong(String)>
	//*  81  178:invokestatic    #158 <Method long TimestampAdjuster.ptsToUs(long)>
	//*  82  181:lstore_1        
	//*  83  182:goto            22
	//*  84  185:aload           8
	//*  85  187:invokestatic    #162 <Method Matcher WebvttParserUtil.findNextCueHeader(ParsableByteArray)>
	//*  86  190:astore          7
	//*  87  192:aload           7
	//*  88  194:ifnonnull       204
	//*  89  197:aload_0         
	//*  90  198:lconst_0        
	//*  91  199:invokespecial   #164 <Method TrackOutput buildTrackOutput(long)>
	//*  92  202:pop             
	//*  93  203:return          
	//*  94  204:aload           7
	//*  95  206:iconst_1        
	//*  96  207:invokevirtual   #143 <Method String Matcher.group(int)>
	//*  97  210:invokestatic    #147 <Method long WebvttParserUtil.parseTimestampUs(String)>
	//*  98  213:lstore          5
	//*  99  215:aload_0         
	//* 100  216:getfield        #46  <Field TimestampAdjuster timestampAdjuster>
	//* 101  219:lload           5
	//* 102  221:lload_1         
	//* 103  222:ladd            
	//* 104  223:lload_3         
	//* 105  224:lsub            
	//* 106  225:invokestatic    #167 <Method long TimestampAdjuster.usToPts(long)>
	//* 107  228:invokevirtual   #170 <Method long TimestampAdjuster.adjustTsTimestamp(long)>
	//* 108  231:lstore_1        
	//* 109  232:aload_0         
	//* 110  233:lload_1         
	//* 111  234:lload           5
	//* 112  236:lsub            
	//* 113  237:invokespecial   #164 <Method TrackOutput buildTrackOutput(long)>
	//* 114  240:astore          7
	//* 115  242:aload_0         
	//* 116  243:getfield        #51  <Field ParsableByteArray sampleDataWrapper>
	//* 117  246:aload_0         
	//* 118  247:getfield        #53  <Field byte[] sampleData>
	//* 119  250:aload_0         
	//* 120  251:getfield        #172 <Field int sampleSize>
	//* 121  254:invokevirtual   #176 <Method void ParsableByteArray.reset(byte[], int)>
	//* 122  257:aload           7
	//* 123  259:aload_0         
	//* 124  260:getfield        #51  <Field ParsableByteArray sampleDataWrapper>
	//* 125  263:aload_0         
	//* 126  264:getfield        #172 <Field int sampleSize>
	//* 127  267:invokeinterface #179 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
	//* 128  272:aload           7
	//* 129  274:lload_1         
	//* 130  275:iconst_1        
	//* 131  276:aload_0         
	//* 132  277:getfield        #172 <Field int sampleSize>
	//* 133  280:iconst_0        
	//* 134  281:aconst_null     
	//* 135  282:invokeinterface #183 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
	//* 136  287:return          
		catch(SubtitleDecoderException subtitledecoderexception)
	//* 137  288:astore          7
		{
			throw new ParserException(((Throwable) (subtitledecoderexception)));
	//  138  290:new             #83  <Class ParserException>
	//  139  293:dup             
	//  140  294:aload           7
	//  141  296:invokespecial   #186 <Method void ParserException(Throwable)>
	//  142  299:athrow          
		}
		l = 0L;
		l1 = l;
		do
		{
			String s = ((ParsableByteArray) (obj1)).readLine();
			if(TextUtils.isEmpty(((CharSequence) (s))))
				break;
			if(s.startsWith("X-TIMESTAMP-MAP"))
			{
				Matcher matcher = LOCAL_TIMESTAMP.matcher(((CharSequence) (s)));
				if(!matcher.find())
				{
					obj1 = ((Object) (new StringBuilder()));
					((StringBuilder) (obj1)).append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
					((StringBuilder) (obj1)).append(s);
					throw new ParserException(((StringBuilder) (obj1)).toString());
				}
				Matcher matcher1 = MEDIA_TIMESTAMP.matcher(((CharSequence) (s)));
				if(!matcher1.find())
				{
					obj1 = ((Object) (new StringBuilder()));
					((StringBuilder) (obj1)).append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
					((StringBuilder) (obj1)).append(s);
					throw new ParserException(((StringBuilder) (obj1)).toString());
				}
				l1 = WebvttParserUtil.parseTimestampUs(matcher.group(1));
				l = TimestampAdjuster.ptsToUs(Long.parseLong(matcher1.group(1)));
			}
		} while(true);
		obj = ((Object) (WebvttParserUtil.findNextCueHeader(((ParsableByteArray) (obj1)))));
		if(obj == null)
		{
			buildTrackOutput(0L);
			return;
		} else
		{
			long l2 = WebvttParserUtil.parseTimestampUs(((Matcher) (obj)).group(1));
			l = timestampAdjuster.adjustTsTimestamp(TimestampAdjuster.usToPts((l2 + l) - l1));
			obj = ((Object) (buildTrackOutput(l - l2)));
			sampleDataWrapper.reset(sampleData, sampleSize);
			((TrackOutput) (obj)).sampleData(sampleDataWrapper, sampleSize);
			((TrackOutput) (obj)).sampleMetadata(l, 1, sampleSize, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
			return;
		}
	}

	public void init(ExtractorOutput extractoroutput)
	{
		output = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field ExtractorOutput output>
		extractoroutput.seekMap(((com.google.android.exoplayer2.extractor.SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(0x1L))));
	//    3    5:aload_1         
	//    4    6:new             #191 <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//    5    9:dup             
	//    6   10:ldc2w           #192 <Long 0x1L>
	//    7   13:invokespecial   #196 <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//    8   16:invokeinterface #200 <Method void ExtractorOutput.seekMap(com.google.android.exoplayer2.extractor.SeekMap)>
	//    9   21:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		int k = (int)extractorinput.getLength();
	//    0    0:aload_1         
	//    1    1:invokeinterface #212 <Method long ExtractorInput.getLength()>
	//    2    6:l2i             
	//    3    7:istore          4
		if(sampleSize == sampleData.length)
	//*   4    9:aload_0         
	//*   5   10:getfield        #172 <Field int sampleSize>
	//*   6   13:aload_0         
	//*   7   14:getfield        #53  <Field byte[] sampleData>
	//*   8   17:arraylength     
	//*   9   18:icmpne          57
		{
			positionholder = ((PositionHolder) (sampleData));
	//   10   21:aload_0         
	//   11   22:getfield        #53  <Field byte[] sampleData>
	//   12   25:astore_2        
			int i;
			if(k != -1)
	//*  13   26:iload           4
	//*  14   28:iconst_m1       
	//*  15   29:icmpeq          38
				i = k;
	//   16   32:iload           4
	//   17   34:istore_3        
			else
	//*  18   35:goto            44
				i = sampleData.length;
	//   19   38:aload_0         
	//   20   39:getfield        #53  <Field byte[] sampleData>
	//   21   42:arraylength     
	//   22   43:istore_3        
			sampleData = Arrays.copyOf(((byte []) (positionholder)), (i * 3) / 2);
	//   23   44:aload_0         
	//   24   45:aload_2         
	//   25   46:iload_3         
	//   26   47:iconst_3        
	//   27   48:imul            
	//   28   49:iconst_2        
	//   29   50:idiv            
	//   30   51:invokestatic    #218 <Method byte[] Arrays.copyOf(byte[], int)>
	//   31   54:putfield        #53  <Field byte[] sampleData>
		}
		int j = extractorinput.read(sampleData, sampleSize, sampleData.length - sampleSize);
	//   32   57:aload_1         
	//   33   58:aload_0         
	//   34   59:getfield        #53  <Field byte[] sampleData>
	//   35   62:aload_0         
	//   36   63:getfield        #172 <Field int sampleSize>
	//   37   66:aload_0         
	//   38   67:getfield        #53  <Field byte[] sampleData>
	//   39   70:arraylength     
	//   40   71:aload_0         
	//   41   72:getfield        #172 <Field int sampleSize>
	//   42   75:isub            
	//   43   76:invokeinterface #221 <Method int ExtractorInput.read(byte[], int, int)>
	//   44   81:istore_3        
		if(j != -1)
	//*  45   82:iload_3         
	//*  46   83:iconst_m1       
	//*  47   84:icmpeq          114
		{
			sampleSize = sampleSize + j;
	//   48   87:aload_0         
	//   49   88:aload_0         
	//   50   89:getfield        #172 <Field int sampleSize>
	//   51   92:iload_3         
	//   52   93:iadd            
	//   53   94:putfield        #172 <Field int sampleSize>
			if(k == -1 || sampleSize != k)
	//*  54   97:iload           4
	//*  55   99:iconst_m1       
	//*  56  100:icmpeq          112
	//*  57  103:aload_0         
	//*  58  104:getfield        #172 <Field int sampleSize>
	//*  59  107:iload           4
	//*  60  109:icmpeq          114
				return 0;
	//   61  112:iconst_0        
	//   62  113:ireturn         
		}
		processSample();
	//   63  114:aload_0         
	//   64  115:invokespecial   #223 <Method void processSample()>
		return -1;
	//   65  118:iconst_m1       
	//   66  119:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		throw new IllegalStateException();
	//    0    0:new             #228 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #229 <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		throw new IllegalStateException();
	//    0    0:new             #228 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:invokespecial   #229 <Method void IllegalStateException()>
	//    3    7:athrow          
	}

	private static final Pattern LOCAL_TIMESTAMP = Pattern.compile("LOCAL:([^,]+)");
	private static final Pattern MEDIA_TIMESTAMP = Pattern.compile("MPEGTS:(\\d+)");
	private final String language;
	private ExtractorOutput output;
	private byte sampleData[];
	private final ParsableByteArray sampleDataWrapper = new ParsableByteArray();
	private int sampleSize;
	private final TimestampAdjuster timestampAdjuster;

	static 
	{
	//    0    0:ldc1            #25  <String "LOCAL:([^,]+)">
	//    1    2:invokestatic    #31  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #33  <Field Pattern LOCAL_TIMESTAMP>
	//    3    8:ldc1            #35  <String "MPEGTS:(\\d+)">
	//    4   10:invokestatic    #31  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #37  <Field Pattern MEDIA_TIMESTAMP>
	//*   6   16:return          
	}
}
