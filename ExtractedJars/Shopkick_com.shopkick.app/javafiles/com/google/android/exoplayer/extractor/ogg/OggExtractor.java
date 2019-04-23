// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			StreamReader, OggUtil, FlacReader, VorbisReader

public class OggExtractor
	implements Extractor
{

	public OggExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		com.google.android.exoplayer.extractor.TrackOutput trackoutput = extractoroutput.track(0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokeinterface #21  <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//    3    7:astore_2        
		extractoroutput.endTracks();
	//    4    8:aload_1         
	//    5    9:invokeinterface #24  <Method void ExtractorOutput.endTracks()>
		streamReader.init(extractoroutput, trackoutput);
	//    6   14:aload_0         
	//    7   15:getfield        #26  <Field StreamReader streamReader>
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokevirtual   #31  <Method void StreamReader.init(ExtractorOutput, com.google.android.exoplayer.extractor.TrackOutput)>
	//   11   23:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		return streamReader.read(extractorinput, positionholder);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field StreamReader streamReader>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method int StreamReader.read(ExtractorInput, PositionHolder)>
	//    5    9:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		streamReader.seek();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field StreamReader streamReader>
	//    2    4:invokevirtual   #44  <Method void StreamReader.seek()>
	//    3    7:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		ParsableByteArray parsablebytearray;
		OggUtil.PageHeader pageheader;
		parsablebytearray = new ParsableByteArray(new byte[27], 0);
	//    0    0:new             #50  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:bipush          27
	//    3    6:newarray        byte[]
	//    4    8:iconst_0        
	//    5    9:invokespecial   #53  <Method void ParsableByteArray(byte[], int)>
	//    6   12:astore_2        
		pageheader = new OggUtil.PageHeader();
	//    7   13:new             #55  <Class OggUtil$PageHeader>
	//    8   16:dup             
	//    9   17:invokespecial   #56  <Method void OggUtil$PageHeader()>
	//   10   20:astore_3        
		if(!OggUtil.populatePageHeader(extractorinput, pageheader, parsablebytearray, true) || (pageheader.type & 2) != 2)
			break MISSING_BLOCK_LABEL_115;
	//   11   21:aload_1         
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:iconst_1        
	//   15   25:invokestatic    #62  <Method boolean OggUtil.populatePageHeader(ExtractorInput, OggUtil$PageHeader, ParsableByteArray, boolean)>
	//   16   28:ifeq            115
	//   17   31:aload_3         
	//   18   32:getfield        #66  <Field int OggUtil$PageHeader.type>
	//   19   35:iconst_2        
	//   20   36:iand            
	//   21   37:iconst_2        
	//   22   38:icmpne          115
		if(pageheader.bodySize < 7)
	//*  23   41:aload_3         
	//*  24   42:getfield        #69  <Field int OggUtil$PageHeader.bodySize>
	//*  25   45:bipush          7
	//*  26   47:icmpge          52
			return false;
	//   27   50:iconst_0        
	//   28   51:ireturn         
		parsablebytearray.reset();
	//   29   52:aload_2         
	//   30   53:invokevirtual   #72  <Method void ParsableByteArray.reset()>
		extractorinput.peekFully(parsablebytearray.data, 0, 7);
	//   31   56:aload_1         
	//   32   57:aload_2         
	//   33   58:getfield        #76  <Field byte[] ParsableByteArray.data>
	//   34   61:iconst_0        
	//   35   62:bipush          7
	//   36   64:invokeinterface #82  <Method void ExtractorInput.peekFully(byte[], int, int)>
		if(!FlacReader.verifyBitstreamType(parsablebytearray))
			break MISSING_BLOCK_LABEL_89;
	//   37   69:aload_2         
	//   38   70:invokestatic    #88  <Method boolean FlacReader.verifyBitstreamType(ParsableByteArray)>
	//   39   73:ifeq            89
		streamReader = ((StreamReader) (new FlacReader()));
	//   40   76:aload_0         
	//   41   77:new             #84  <Class FlacReader>
	//   42   80:dup             
	//   43   81:invokespecial   #89  <Method void FlacReader()>
	//   44   84:putfield        #26  <Field StreamReader streamReader>
		return true;
	//   45   87:iconst_1        
	//   46   88:ireturn         
label0:
		{
			try
			{
				parsablebytearray.reset();
	//   47   89:aload_2         
	//   48   90:invokevirtual   #72  <Method void ParsableByteArray.reset()>
				if(!VorbisReader.verifyBitstreamType(parsablebytearray))
					break label0;
	//   49   93:aload_2         
	//   50   94:invokestatic    #92  <Method boolean VorbisReader.verifyBitstreamType(ParsableByteArray)>
	//   51   97:ifeq            113
				streamReader = ((StreamReader) (new VorbisReader()));
	//   52  100:aload_0         
	//   53  101:new             #91  <Class VorbisReader>
	//   54  104:dup             
	//   55  105:invokespecial   #93  <Method void VorbisReader()>
	//   56  108:putfield        #26  <Field StreamReader streamReader>
			}
	//*  57  111:iconst_1        
	//*  58  112:ireturn         
	//*  59  113:iconst_0        
	//*  60  114:ireturn         
	//*  61  115:iconst_0        
	//*  62  116:ireturn         
	//*  63  117:astore_1        
	//*  64  118:aload_1         
	//*  65  119:athrow          
			// Misplaced declaration of an exception variable
			catch(ExtractorInput extractorinput)
	//*  66  120:astore_1        
			{
				return false;
	//   67  121:iconst_0        
	//   68  122:ireturn         
			}
			return true;
		}
		return false;
		return false;
		extractorinput;
		throw extractorinput;
	}

	private StreamReader streamReader;
}
