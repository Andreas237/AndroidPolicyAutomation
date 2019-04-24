// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ExtractorMediaPeriod, UnrecognizedInputFormatException

private static final class ExtractorMediaPeriod$ExtractorHolder
{

	public void release()
	{
		if(extractor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Extractor extractor>
	//*   2    4:ifnull          21
		{
			extractor.release();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Extractor extractor>
	//    5   11:invokeinterface #30  <Method void Extractor.release()>
			extractor = null;
	//    6   16:aload_0         
	//    7   17:aconst_null     
	//    8   18:putfield        #26  <Field Extractor extractor>
		}
	//    9   21:return          
	}

	public Extractor selectExtractor(ExtractorInput extractorinput, Uri uri)
		throws IOException, InterruptedException
	{
		int i;
		int j;
		Extractor aextractor[];
		if(extractor != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Extractor extractor>
	//*   2    4:ifnull          12
			return extractor;
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Extractor extractor>
	//    5   11:areturn         
		aextractor = extractors;
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field Extractor[] extractors>
	//    8   16:astore          5
		j = aextractor.length;
	//    9   18:aload           5
	//   10   20:arraylength     
	//   11   21:istore          4
		i = 0;
	//   12   23:iconst_0        
	//   13   24:istore_3        
_L2:
		Extractor extractor1;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   14   25:iload_3         
	//   15   26:iload           4
	//   16   28:icmpge          85
		extractor1 = aextractor[i];
	//   17   31:aload           5
	//   18   33:iload_3         
	//   19   34:aaload          
	//   20   35:astore          6
		if(!extractor1.sniff(extractorinput))
			break MISSING_BLOCK_LABEL_72;
	//   21   37:aload           6
	//   22   39:aload_1         
	//   23   40:invokeinterface #42  <Method boolean Extractor.sniff(ExtractorInput)>
	//   24   45:ifeq            72
		extractor = extractor1;
	//   25   48:aload_0         
	//   26   49:aload           6
	//   27   51:putfield        #26  <Field Extractor extractor>
		extractorinput.resetPeekPosition();
	//   28   54:aload_1         
	//   29   55:invokeinterface #47  <Method void ExtractorInput.resetPeekPosition()>
		break; /* Loop/switch isn't completed */
	//   30   60:goto            85
		uri;
	//   31   63:astore_2        
		extractorinput.resetPeekPosition();
	//   32   64:aload_1         
	//   33   65:invokeinterface #47  <Method void ExtractorInput.resetPeekPosition()>
		throw uri;
	//   34   70:aload_2         
	//   35   71:athrow          
_L3:
		extractorinput.resetPeekPosition();
	//   36   72:aload_1         
	//   37   73:invokeinterface #47  <Method void ExtractorInput.resetPeekPosition()>
		i++;
	//   38   78:iload_3         
	//   39   79:iconst_1        
	//   40   80:iadd            
	//   41   81:istore_3        
		if(true) goto _L2; else goto _L1
	//   42   82:goto            25
_L1:
		if(extractor == null)
	//*  43   85:aload_0         
	//*  44   86:getfield        #26  <Field Extractor extractor>
	//*  45   89:ifnonnull       139
		{
			extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   46   92:new             #49  <Class StringBuilder>
	//   47   95:dup             
	//   48   96:invokespecial   #50  <Method void StringBuilder()>
	//   49   99:astore_1        
			((StringBuilder) (extractorinput)).append("None of the available extractors (");
	//   50  100:aload_1         
	//   51  101:ldc1            #52  <String "None of the available extractors (">
	//   52  103:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   53  106:pop             
			((StringBuilder) (extractorinput)).append(Util.getCommaDelimitedSimpleClassNames(((Object []) (extractors))));
	//   54  107:aload_1         
	//   55  108:aload_0         
	//   56  109:getfield        #20  <Field Extractor[] extractors>
	//   57  112:invokestatic    #62  <Method String Util.getCommaDelimitedSimpleClassNames(Object[])>
	//   58  115:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   59  118:pop             
			((StringBuilder) (extractorinput)).append(") could read the stream.");
	//   60  119:aload_1         
	//   61  120:ldc1            #64  <String ") could read the stream.">
	//   62  122:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   63  125:pop             
			throw new UnrecognizedInputFormatException(((StringBuilder) (extractorinput)).toString(), uri);
	//   64  126:new             #66  <Class UnrecognizedInputFormatException>
	//   65  129:dup             
	//   66  130:aload_1         
	//   67  131:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   68  134:aload_2         
	//   69  135:invokespecial   #73  <Method void UnrecognizedInputFormatException(String, Uri)>
	//   70  138:athrow          
		} else
		{
			extractor.init(extractorOutput);
	//   71  139:aload_0         
	//   72  140:getfield        #26  <Field Extractor extractor>
	//   73  143:aload_0         
	//   74  144:getfield        #22  <Field ExtractorOutput extractorOutput>
	//   75  147:invokeinterface #77  <Method void Extractor.init(ExtractorOutput)>
			return extractor;
	//   76  152:aload_0         
	//   77  153:getfield        #26  <Field Extractor extractor>
	//   78  156:areturn         
		}
		EOFException eofexception;
		eofexception;
	//   79  157:astore          6
		  goto _L3
	//*  80  159:goto            72
	}

	private Extractor extractor;
	private final ExtractorOutput extractorOutput;
	private final Extractor extractors[];

	public ExtractorMediaPeriod$ExtractorHolder(Extractor aextractor[], ExtractorOutput extractoroutput)
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
