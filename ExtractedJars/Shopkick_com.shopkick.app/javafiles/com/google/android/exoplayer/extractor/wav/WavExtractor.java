// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.wav;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.wav:
//			WavHeader, WavHeaderReader

public final class WavExtractor
	implements Extractor, SeekMap
{

	public WavExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public long getPosition(long l)
	{
		return wavHeader.getPosition(l);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field WavHeader wavHeader>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #32  <Method long WavHeader.getPosition(long)>
	//    4    8:lreturn         
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field ExtractorOutput extractorOutput>
		trackOutput = extractoroutput.track(0);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:invokeinterface #42  <Method TrackOutput ExtractorOutput.track(int)>
	//    7   13:putfield        #44  <Field TrackOutput trackOutput>
		wavHeader = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #28  <Field WavHeader wavHeader>
		extractoroutput.endTracks();
	//   11   21:aload_1         
	//   12   22:invokeinterface #47  <Method void ExtractorOutput.endTracks()>
	//   13   27:return          
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		if(wavHeader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field WavHeader wavHeader>
	//*   2    4:ifnonnull       45
		{
			wavHeader = WavHeaderReader.peek(extractorinput);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #61  <Method WavHeader WavHeaderReader.peek(ExtractorInput)>
	//    6   12:putfield        #28  <Field WavHeader wavHeader>
			positionholder = ((PositionHolder) (wavHeader));
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field WavHeader wavHeader>
	//    9   19:astore_2        
			if(positionholder != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          35
				bytesPerFrame = ((WavHeader) (positionholder)).getBytesPerFrame();
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #65  <Method int WavHeader.getBytesPerFrame()>
	//   15   29:putfield        #67  <Field int bytesPerFrame>
			else
	//*  16   32:goto            45
				throw new ParserException("Error initializing WavHeader. Did you sniff first?");
	//   17   35:new             #69  <Class ParserException>
	//   18   38:dup             
	//   19   39:ldc1            #71  <String "Error initializing WavHeader. Did you sniff first?">
	//   20   41:invokespecial   #74  <Method void ParserException(String)>
	//   21   44:athrow          
		}
		if(!wavHeader.hasDataBounds())
	//*  22   45:aload_0         
	//*  23   46:getfield        #28  <Field WavHeader wavHeader>
	//*  24   49:invokevirtual   #77  <Method boolean WavHeader.hasDataBounds()>
	//*  25   52:ifne            127
		{
			WavHeaderReader.skipToData(extractorinput, wavHeader);
	//   26   55:aload_1         
	//   27   56:aload_0         
	//   28   57:getfield        #28  <Field WavHeader wavHeader>
	//   29   60:invokestatic    #81  <Method void WavHeaderReader.skipToData(ExtractorInput, WavHeader)>
			trackOutput.format(MediaFormat.createAudioFormat(((String) (null)), "audio/raw", wavHeader.getBitrate(), 32768, wavHeader.getDurationUs(), wavHeader.getNumChannels(), wavHeader.getSampleRateHz(), ((java.util.List) (null)), ((String) (null)), wavHeader.getEncoding()));
	//   30   63:aload_0         
	//   31   64:getfield        #44  <Field TrackOutput trackOutput>
	//   32   67:aconst_null     
	//   33   68:ldc1            #83  <String "audio/raw">
	//   34   70:aload_0         
	//   35   71:getfield        #28  <Field WavHeader wavHeader>
	//   36   74:invokevirtual   #86  <Method int WavHeader.getBitrate()>
	//   37   77:ldc1            #11  <Int 32768>
	//   38   79:aload_0         
	//   39   80:getfield        #28  <Field WavHeader wavHeader>
	//   40   83:invokevirtual   #90  <Method long WavHeader.getDurationUs()>
	//   41   86:aload_0         
	//   42   87:getfield        #28  <Field WavHeader wavHeader>
	//   43   90:invokevirtual   #93  <Method int WavHeader.getNumChannels()>
	//   44   93:aload_0         
	//   45   94:getfield        #28  <Field WavHeader wavHeader>
	//   46   97:invokevirtual   #96  <Method int WavHeader.getSampleRateHz()>
	//   47  100:aconst_null     
	//   48  101:aconst_null     
	//   49  102:aload_0         
	//   50  103:getfield        #28  <Field WavHeader wavHeader>
	//   51  106:invokevirtual   #99  <Method int WavHeader.getEncoding()>
	//   52  109:invokestatic    #105 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, java.util.List, String, int)>
	//   53  112:invokeinterface #111 <Method void TrackOutput.format(MediaFormat)>
			extractorOutput.seekMap(((SeekMap) (this)));
	//   54  117:aload_0         
	//   55  118:getfield        #36  <Field ExtractorOutput extractorOutput>
	//   56  121:aload_0         
	//   57  122:invokeinterface #115 <Method void ExtractorOutput.seekMap(SeekMap)>
		}
		int i = trackOutput.sampleData(extractorinput, 32768 - pendingBytes, true);
	//   58  127:aload_0         
	//   59  128:getfield        #44  <Field TrackOutput trackOutput>
	//   60  131:aload_1         
	//   61  132:ldc1            #11  <Int 32768>
	//   62  134:aload_0         
	//   63  135:getfield        #117 <Field int pendingBytes>
	//   64  138:isub            
	//   65  139:iconst_1        
	//   66  140:invokeinterface #121 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//   67  145:istore_3        
		if(i != -1)
	//*  68  146:iload_3         
	//*  69  147:iconst_m1       
	//*  70  148:icmpeq          161
			pendingBytes = pendingBytes + i;
	//   71  151:aload_0         
	//   72  152:aload_0         
	//   73  153:getfield        #117 <Field int pendingBytes>
	//   74  156:iload_3         
	//   75  157:iadd            
	//   76  158:putfield        #117 <Field int pendingBytes>
		int j = pendingBytes;
	//   77  161:aload_0         
	//   78  162:getfield        #117 <Field int pendingBytes>
	//   79  165:istore          4
		int k = bytesPerFrame;
	//   80  167:aload_0         
	//   81  168:getfield        #67  <Field int bytesPerFrame>
	//   82  171:istore          5
		j = (j / k) * k;
	//   83  173:iload           4
	//   84  175:iload           5
	//   85  177:idiv            
	//   86  178:iload           5
	//   87  180:imul            
	//   88  181:istore          4
		if(j > 0)
	//*  89  183:iload           4
	//*  90  185:ifle            245
		{
			long l1 = extractorinput.getPosition();
	//   91  188:aload_1         
	//   92  189:invokeinterface #125 <Method long ExtractorInput.getPosition()>
	//   93  194:lstore          6
			int l = pendingBytes;
	//   94  196:aload_0         
	//   95  197:getfield        #117 <Field int pendingBytes>
	//   96  200:istore          5
			long l2 = l;
	//   97  202:iload           5
	//   98  204:i2l             
	//   99  205:lstore          8
			pendingBytes = l - j;
	//  100  207:aload_0         
	//  101  208:iload           5
	//  102  210:iload           4
	//  103  212:isub            
	//  104  213:putfield        #117 <Field int pendingBytes>
			trackOutput.sampleMetadata(wavHeader.getTimeUs(l1 - l2), 1, j, pendingBytes, ((byte []) (null)));
	//  105  216:aload_0         
	//  106  217:getfield        #44  <Field TrackOutput trackOutput>
	//  107  220:aload_0         
	//  108  221:getfield        #28  <Field WavHeader wavHeader>
	//  109  224:lload           6
	//  110  226:lload           8
	//  111  228:lsub            
	//  112  229:invokevirtual   #128 <Method long WavHeader.getTimeUs(long)>
	//  113  232:iconst_1        
	//  114  233:iload           4
	//  115  235:aload_0         
	//  116  236:getfield        #117 <Field int pendingBytes>
	//  117  239:aconst_null     
	//  118  240:invokeinterface #132 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
		}
		return i != -1 ? 0 : -1;
	//  119  245:iload_3         
	//  120  246:iconst_m1       
	//  121  247:icmpne          252
	//  122  250:iconst_m1       
	//  123  251:ireturn         
	//  124  252:iconst_0        
	//  125  253:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		pendingBytes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #117 <Field int pendingBytes>
	//    3    5:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return WavHeaderReader.peek(extractorinput) != null;
	//    0    0:aload_1         
	//    1    1:invokestatic    #61  <Method WavHeader WavHeaderReader.peek(ExtractorInput)>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static final int MAX_INPUT_SIZE = 32768;
	private int bytesPerFrame;
	private ExtractorOutput extractorOutput;
	private int pendingBytes;
	private TrackOutput trackOutput;
	private WavHeader wavHeader;
}
