// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor;

import java.io.EOFException;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor:
//			ExtractorSampleSource, Extractor, ExtractorInput, ExtractorOutput

private static final class ExtractorSampleSource$ExtractorHolder
{

	public void release()
	{
		Extractor extractor1 = extractor;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Extractor extractor>
	//    2    4:astore_1        
		if(extractor1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			extractor1.release();
	//    5    9:aload_1         
	//    6   10:invokeinterface #30  <Method void Extractor.release()>
			extractor = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #26  <Field Extractor extractor>
		}
	//   10   20:return          
	}

	public Extractor selectExtractor(ExtractorInput extractorinput)
		throws tFormatException, IOException, InterruptedException
	{
		int i;
		int j;
		Extractor aextractor[];
		Extractor extractor1 = extractor;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Extractor extractor>
	//    2    4:astore          4
		if(extractor1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          14
			return extractor1;
	//    5   11:aload           4
	//    6   13:areturn         
		aextractor = extractors;
	//    7   14:aload_0         
	//    8   15:getfield        #20  <Field Extractor[] extractors>
	//    9   18:astore          4
		j = aextractor.length;
	//   10   20:aload           4
	//   11   22:arraylength     
	//   12   23:istore_3        
		i = 0;
	//   13   24:iconst_0        
	//   14   25:istore_2        
_L2:
		Extractor extractor2;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   15   26:iload_2         
	//   16   27:iload_3         
	//   17   28:icmpge          87
		extractor2 = aextractor[i];
	//   18   31:aload           4
	//   19   33:iload_2         
	//   20   34:aaload          
	//   21   35:astore          5
		if(!extractor2.sniff(extractorinput))
			break MISSING_BLOCK_LABEL_74;
	//   22   37:aload           5
	//   23   39:aload_1         
	//   24   40:invokeinterface #44  <Method boolean Extractor.sniff(ExtractorInput)>
	//   25   45:ifeq            74
		extractor = extractor2;
	//   26   48:aload_0         
	//   27   49:aload           5
	//   28   51:putfield        #26  <Field Extractor extractor>
		extractorinput.resetPeekPosition();
	//   29   54:aload_1         
	//   30   55:invokeinterface #49  <Method void ExtractorInput.resetPeekPosition()>
		break; /* Loop/switch isn't completed */
	//   31   60:goto            87
		Exception exception;
		exception;
	//   32   63:astore          4
		extractorinput.resetPeekPosition();
	//   33   65:aload_1         
	//   34   66:invokeinterface #49  <Method void ExtractorInput.resetPeekPosition()>
		throw exception;
	//   35   71:aload           4
	//   36   73:athrow          
_L3:
		extractorinput.resetPeekPosition();
	//   37   74:aload_1         
	//   38   75:invokeinterface #49  <Method void ExtractorInput.resetPeekPosition()>
		i++;
	//   39   80:iload_2         
	//   40   81:iconst_1        
	//   41   82:iadd            
	//   42   83:istore_2        
		if(true) goto _L2; else goto _L1
	//   43   84:goto            26
_L1:
		extractorinput = ((ExtractorInput) (extractor));
	//   44   87:aload_0         
	//   45   88:getfield        #26  <Field Extractor extractor>
	//   46   91:astore_1        
		if(extractorinput != null)
	//*  47   92:aload_1         
	//*  48   93:ifnull          111
		{
			((Extractor) (extractorinput)).init(extractorOutput);
	//   49   96:aload_1         
	//   50   97:aload_0         
	//   51   98:getfield        #22  <Field ExtractorOutput extractorOutput>
	//   52  101:invokeinterface #53  <Method void Extractor.init(ExtractorOutput)>
			return extractor;
	//   53  106:aload_0         
	//   54  107:getfield        #26  <Field Extractor extractor>
	//   55  110:areturn         
		} else
		{
			throw new tFormatException(extractors);
	//   56  111:new             #34  <Class ExtractorSampleSource$UnrecognizedInputFormatException>
	//   57  114:dup             
	//   58  115:aload_0         
	//   59  116:getfield        #20  <Field Extractor[] extractors>
	//   60  119:invokespecial   #56  <Method void ExtractorSampleSource$UnrecognizedInputFormatException(Extractor[])>
	//   61  122:athrow          
		}
		EOFException eofexception;
		eofexception;
	//   62  123:astore          5
		  goto _L3
	//*  63  125:goto            74
	}

	private Extractor extractor;
	private final ExtractorOutput extractorOutput;
	private final Extractor extractors[];

	public ExtractorSampleSource$ExtractorHolder(Extractor aextractor[], ExtractorOutput extractoroutput)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		extractors = aextractor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Extractor[] extractors>
		extractorOutput = extractoroutput;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ExtractorOutput extractorOutput>
	//    8   14:return          
	}
}
