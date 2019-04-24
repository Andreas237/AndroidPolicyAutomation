// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			OggPageHeader, FlacReader, VorbisReader, OpusReader, 
//			StreamReader

public class OggExtractor
	implements Extractor
{

	public OggExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	private static ParsableByteArray resetPosition(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #36  <Method void ParsableByteArray.setPosition(int)>
		return parsablebytearray;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean sniffInternal(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		Object obj = ((Object) (new OggPageHeader()));
	//    0    0:new             #44  <Class OggPageHeader>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void OggPageHeader()>
	//    3    7:astore_3        
		if(((OggPageHeader) (obj)).populate(extractorinput, true))
	//*   4    8:aload_3         
	//*   5    9:aload_1         
	//*   6   10:iconst_1        
	//*   7   11:invokevirtual   #49  <Method boolean OggPageHeader.populate(ExtractorInput, boolean)>
	//*   8   14:ifeq            131
		{
			if((((OggPageHeader) (obj)).type & 2) != 2)
	//*   9   17:aload_3         
	//*  10   18:getfield        #52  <Field int OggPageHeader.type>
	//*  11   21:iconst_2        
	//*  12   22:iand            
	//*  13   23:iconst_2        
	//*  14   24:icmpeq          29
				return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
			int i = Math.min(((OggPageHeader) (obj)).bodySize, 8);
	//   17   29:aload_3         
	//   18   30:getfield        #55  <Field int OggPageHeader.bodySize>
	//   19   33:bipush          8
	//   20   35:invokestatic    #61  <Method int Math.min(int, int)>
	//   21   38:istore_2        
			obj = ((Object) (new ParsableByteArray(i)));
	//   22   39:new             #32  <Class ParsableByteArray>
	//   23   42:dup             
	//   24   43:iload_2         
	//   25   44:invokespecial   #63  <Method void ParsableByteArray(int)>
	//   26   47:astore_3        
			extractorinput.peekFully(((ParsableByteArray) (obj)).data, 0, i);
	//   27   48:aload_1         
	//   28   49:aload_3         
	//   29   50:getfield        #67  <Field byte[] ParsableByteArray.data>
	//   30   53:iconst_0        
	//   31   54:iload_2         
	//   32   55:invokeinterface #73  <Method void ExtractorInput.peekFully(byte[], int, int)>
			if(FlacReader.verifyBitstreamType(resetPosition(((ParsableByteArray) (obj)))))
	//*  33   60:aload_3         
	//*  34   61:invokestatic    #75  <Method ParsableByteArray resetPosition(ParsableByteArray)>
	//*  35   64:invokestatic    #81  <Method boolean FlacReader.verifyBitstreamType(ParsableByteArray)>
	//*  36   67:ifeq            83
			{
				streamReader = ((StreamReader) (new FlacReader()));
	//   37   70:aload_0         
	//   38   71:new             #77  <Class FlacReader>
	//   39   74:dup             
	//   40   75:invokespecial   #82  <Method void FlacReader()>
	//   41   78:putfield        #84  <Field StreamReader streamReader>
				return true;
	//   42   81:iconst_1        
	//   43   82:ireturn         
			}
			if(VorbisReader.verifyBitstreamType(resetPosition(((ParsableByteArray) (obj)))))
	//*  44   83:aload_3         
	//*  45   84:invokestatic    #75  <Method ParsableByteArray resetPosition(ParsableByteArray)>
	//*  46   87:invokestatic    #87  <Method boolean VorbisReader.verifyBitstreamType(ParsableByteArray)>
	//*  47   90:ifeq            106
			{
				streamReader = ((StreamReader) (new VorbisReader()));
	//   48   93:aload_0         
	//   49   94:new             #86  <Class VorbisReader>
	//   50   97:dup             
	//   51   98:invokespecial   #88  <Method void VorbisReader()>
	//   52  101:putfield        #84  <Field StreamReader streamReader>
				return true;
	//   53  104:iconst_1        
	//   54  105:ireturn         
			}
			if(OpusReader.verifyBitstreamType(resetPosition(((ParsableByteArray) (obj)))))
	//*  55  106:aload_3         
	//*  56  107:invokestatic    #75  <Method ParsableByteArray resetPosition(ParsableByteArray)>
	//*  57  110:invokestatic    #91  <Method boolean OpusReader.verifyBitstreamType(ParsableByteArray)>
	//*  58  113:ifeq            129
			{
				streamReader = ((StreamReader) (new OpusReader()));
	//   59  116:aload_0         
	//   60  117:new             #90  <Class OpusReader>
	//   61  120:dup             
	//   62  121:invokespecial   #92  <Method void OpusReader()>
	//   63  124:putfield        #84  <Field StreamReader streamReader>
				return true;
	//   64  127:iconst_1        
	//   65  128:ireturn         
			} else
			{
				return false;
	//   66  129:iconst_0        
	//   67  130:ireturn         
			}
		} else
		{
			return false;
	//   68  131:iconst_0        
	//   69  132:ireturn         
		}
	}

	public void init(ExtractorOutput extractoroutput)
	{
		output = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field ExtractorOutput output>
	//    3    5:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		if(streamReader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field StreamReader streamReader>
	//*   2    4:ifnonnull       31
		{
			if(!sniffInternal(extractorinput))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #101 <Method boolean sniffInternal(ExtractorInput)>
	//*   6   12:ifne            25
				throw new ParserException("Failed to determine bitstream type");
	//    7   15:new             #103 <Class ParserException>
	//    8   18:dup             
	//    9   19:ldc1            #105 <String "Failed to determine bitstream type">
	//   10   21:invokespecial   #108 <Method void ParserException(String)>
	//   11   24:athrow          
			extractorinput.resetPeekPosition();
	//   12   25:aload_1         
	//   13   26:invokeinterface #111 <Method void ExtractorInput.resetPeekPosition()>
		}
		if(!streamReaderInitialized)
	//*  14   31:aload_0         
	//*  15   32:getfield        #113 <Field boolean streamReaderInitialized>
	//*  16   35:ifne            76
		{
			com.google.android.exoplayer2.extractor.TrackOutput trackoutput = output.track(0, 1);
	//   17   38:aload_0         
	//   18   39:getfield        #97  <Field ExtractorOutput output>
	//   19   42:iconst_0        
	//   20   43:iconst_1        
	//   21   44:invokeinterface #119 <Method com.google.android.exoplayer2.extractor.TrackOutput ExtractorOutput.track(int, int)>
	//   22   49:astore_3        
			output.endTracks();
	//   23   50:aload_0         
	//   24   51:getfield        #97  <Field ExtractorOutput output>
	//   25   54:invokeinterface #122 <Method void ExtractorOutput.endTracks()>
			streamReader.init(output, trackoutput);
	//   26   59:aload_0         
	//   27   60:getfield        #84  <Field StreamReader streamReader>
	//   28   63:aload_0         
	//   29   64:getfield        #97  <Field ExtractorOutput output>
	//   30   67:aload_3         
	//   31   68:invokevirtual   #127 <Method void StreamReader.init(ExtractorOutput, com.google.android.exoplayer2.extractor.TrackOutput)>
			streamReaderInitialized = true;
	//   32   71:aload_0         
	//   33   72:iconst_1        
	//   34   73:putfield        #113 <Field boolean streamReaderInitialized>
		}
		return streamReader.read(extractorinput, positionholder);
	//   35   76:aload_0         
	//   36   77:getfield        #84  <Field StreamReader streamReader>
	//   37   80:aload_1         
	//   38   81:aload_2         
	//   39   82:invokevirtual   #129 <Method int StreamReader.read(ExtractorInput, PositionHolder)>
	//   40   85:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		if(streamReader != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field StreamReader streamReader>
	//*   2    4:ifnull          16
			streamReader.seek(l, l1);
	//    3    7:aload_0         
	//    4    8:getfield        #84  <Field StreamReader streamReader>
	//    5   11:lload_1         
	//    6   12:lload_3         
	//    7   13:invokevirtual   #134 <Method void StreamReader.seek(long, long)>
	//    8   16:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		boolean flag;
		try
		{
			flag = sniffInternal(extractorinput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method boolean sniffInternal(ExtractorInput)>
	//    3    5:istore_2        
		}
	//*   4    6:iload_2         
	//*   5    7:ireturn         
	//*   6    8:iconst_0        
	//*   7    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(ExtractorInput extractorinput)
		{
			return false;
		}
		return flag;
	//*   8   10:astore_1        
	//*   9   11:goto            8
	}

	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new OggExtractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class OggExtractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void OggExtractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	private static final int MAX_VERIFICATION_BYTES = 8;
	private ExtractorOutput output;
	private StreamReader streamReader;
	private boolean streamReaderInitialized;

	static 
	{
	//    0    0:new             #8   <Class OggExtractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void OggExtractor$1()>
	//    3    7:putstatic       #26  <Field ExtractorsFactory FACTORY>
	//*   4   10:return          
	}
}
