// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.wav:
//			WavHeaderReader, WavHeader

public final class WavExtractor
	implements Extractor
{

	public WavExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field ExtractorOutput extractorOutput>
		trackOutput = extractoroutput.track(0, 1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:iconst_1        
	//    7    9:invokeinterface #40  <Method TrackOutput ExtractorOutput.track(int, int)>
	//    8   14:putfield        #42  <Field TrackOutput trackOutput>
		wavHeader = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #44  <Field WavHeader wavHeader>
		extractoroutput.endTracks();
	//   12   22:aload_1         
	//   13   23:invokeinterface #47  <Method void ExtractorOutput.endTracks()>
	//   14   28:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		if(wavHeader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field WavHeader wavHeader>
	//*   2    4:ifnonnull       95
		{
			wavHeader = WavHeaderReader.peek(extractorinput);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #59  <Method WavHeader WavHeaderReader.peek(ExtractorInput)>
	//    6   12:putfield        #44  <Field WavHeader wavHeader>
			if(wavHeader == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #44  <Field WavHeader wavHeader>
	//*   9   19:ifnonnull       32
				throw new ParserException("Unsupported or unrecognized wav header.");
	//   10   22:new             #61  <Class ParserException>
	//   11   25:dup             
	//   12   26:ldc1            #63  <String "Unsupported or unrecognized wav header.">
	//   13   28:invokespecial   #66  <Method void ParserException(String)>
	//   14   31:athrow          
			positionholder = ((PositionHolder) (Format.createAudioSampleFormat(((String) (null)), "audio/raw", ((String) (null)), wavHeader.getBitrate(), 32768, wavHeader.getNumChannels(), wavHeader.getSampleRateHz(), wavHeader.getEncoding(), ((java.util.List) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null)))));
	//   15   32:aconst_null     
	//   16   33:ldc1            #68  <String "audio/raw">
	//   17   35:aconst_null     
	//   18   36:aload_0         
	//   19   37:getfield        #44  <Field WavHeader wavHeader>
	//   20   40:invokevirtual   #74  <Method int WavHeader.getBitrate()>
	//   21   43:ldc1            #13  <Int 32768>
	//   22   45:aload_0         
	//   23   46:getfield        #44  <Field WavHeader wavHeader>
	//   24   49:invokevirtual   #77  <Method int WavHeader.getNumChannels()>
	//   25   52:aload_0         
	//   26   53:getfield        #44  <Field WavHeader wavHeader>
	//   27   56:invokevirtual   #80  <Method int WavHeader.getSampleRateHz()>
	//   28   59:aload_0         
	//   29   60:getfield        #44  <Field WavHeader wavHeader>
	//   30   63:invokevirtual   #83  <Method int WavHeader.getEncoding()>
	//   31   66:aconst_null     
	//   32   67:aconst_null     
	//   33   68:iconst_0        
	//   34   69:aconst_null     
	//   35   70:invokestatic    #89  <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String)>
	//   36   73:astore_2        
			trackOutput.format(((Format) (positionholder)));
	//   37   74:aload_0         
	//   38   75:getfield        #42  <Field TrackOutput trackOutput>
	//   39   78:aload_2         
	//   40   79:invokeinterface #95  <Method void TrackOutput.format(Format)>
			bytesPerFrame = wavHeader.getBytesPerFrame();
	//   41   84:aload_0         
	//   42   85:aload_0         
	//   43   86:getfield        #44  <Field WavHeader wavHeader>
	//   44   89:invokevirtual   #98  <Method int WavHeader.getBytesPerFrame()>
	//   45   92:putfield        #100 <Field int bytesPerFrame>
		}
		if(!wavHeader.hasDataBounds())
	//*  46   95:aload_0         
	//*  47   96:getfield        #44  <Field WavHeader wavHeader>
	//*  48   99:invokevirtual   #104 <Method boolean WavHeader.hasDataBounds()>
	//*  49  102:ifne            126
		{
			WavHeaderReader.skipToData(extractorinput, wavHeader);
	//   50  105:aload_1         
	//   51  106:aload_0         
	//   52  107:getfield        #44  <Field WavHeader wavHeader>
	//   53  110:invokestatic    #108 <Method void WavHeaderReader.skipToData(ExtractorInput, WavHeader)>
			extractorOutput.seekMap(((com.google.android.exoplayer2.extractor.SeekMap) (wavHeader)));
	//   54  113:aload_0         
	//   55  114:getfield        #34  <Field ExtractorOutput extractorOutput>
	//   56  117:aload_0         
	//   57  118:getfield        #44  <Field WavHeader wavHeader>
	//   58  121:invokeinterface #112 <Method void ExtractorOutput.seekMap(com.google.android.exoplayer2.extractor.SeekMap)>
		}
		int i = trackOutput.sampleData(extractorinput, 32768 - pendingBytes, true);
	//   59  126:aload_0         
	//   60  127:getfield        #42  <Field TrackOutput trackOutput>
	//   61  130:aload_1         
	//   62  131:ldc1            #13  <Int 32768>
	//   63  133:aload_0         
	//   64  134:getfield        #114 <Field int pendingBytes>
	//   65  137:isub            
	//   66  138:iconst_1        
	//   67  139:invokeinterface #118 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//   68  144:istore_3        
		if(i != -1)
	//*  69  145:iload_3         
	//*  70  146:iconst_m1       
	//*  71  147:icmpeq          160
			pendingBytes = pendingBytes + i;
	//   72  150:aload_0         
	//   73  151:aload_0         
	//   74  152:getfield        #114 <Field int pendingBytes>
	//   75  155:iload_3         
	//   76  156:iadd            
	//   77  157:putfield        #114 <Field int pendingBytes>
		int j = pendingBytes / bytesPerFrame;
	//   78  160:aload_0         
	//   79  161:getfield        #114 <Field int pendingBytes>
	//   80  164:aload_0         
	//   81  165:getfield        #100 <Field int bytesPerFrame>
	//   82  168:idiv            
	//   83  169:istore          4
		if(j > 0)
	//*  84  171:iload           4
	//*  85  173:ifle            236
		{
			long l = wavHeader.getTimeUs(extractorinput.getPosition() - (long)pendingBytes);
	//   86  176:aload_0         
	//   87  177:getfield        #44  <Field WavHeader wavHeader>
	//   88  180:aload_1         
	//   89  181:invokeinterface #124 <Method long ExtractorInput.getPosition()>
	//   90  186:aload_0         
	//   91  187:getfield        #114 <Field int pendingBytes>
	//   92  190:i2l             
	//   93  191:lsub            
	//   94  192:invokevirtual   #128 <Method long WavHeader.getTimeUs(long)>
	//   95  195:lstore          5
			j *= bytesPerFrame;
	//   96  197:iload           4
	//   97  199:aload_0         
	//   98  200:getfield        #100 <Field int bytesPerFrame>
	//   99  203:imul            
	//  100  204:istore          4
			pendingBytes = pendingBytes - j;
	//  101  206:aload_0         
	//  102  207:aload_0         
	//  103  208:getfield        #114 <Field int pendingBytes>
	//  104  211:iload           4
	//  105  213:isub            
	//  106  214:putfield        #114 <Field int pendingBytes>
			trackOutput.sampleMetadata(l, 1, j, pendingBytes, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//  107  217:aload_0         
	//  108  218:getfield        #42  <Field TrackOutput trackOutput>
	//  109  221:lload           5
	//  110  223:iconst_1        
	//  111  224:iload           4
	//  112  226:aload_0         
	//  113  227:getfield        #114 <Field int pendingBytes>
	//  114  230:aconst_null     
	//  115  231:invokeinterface #132 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
		}
		return i != -1 ? 0 : -1;
	//  116  236:iload_3         
	//  117  237:iconst_m1       
	//  118  238:icmpne          243
	//  119  241:iconst_m1       
	//  120  242:ireturn         
	//  121  243:iconst_0        
	//  122  244:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		pendingBytes = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #114 <Field int pendingBytes>
	//    3    5:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return WavHeaderReader.peek(extractorinput) != null;
	//    0    0:aload_1         
	//    1    1:invokestatic    #59  <Method WavHeader WavHeaderReader.peek(ExtractorInput)>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new WavExtractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class WavExtractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void WavExtractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	private static final int MAX_INPUT_SIZE = 32768;
	private int bytesPerFrame;
	private ExtractorOutput extractorOutput;
	private int pendingBytes;
	private TrackOutput trackOutput;
	private WavHeader wavHeader;

	static 
	{
	//    0    0:new             #8   <Class WavExtractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void WavExtractor$1()>
	//    3    7:putstatic       #28  <Field ExtractorsFactory FACTORY>
	//*   4   10:return          
	}
}
