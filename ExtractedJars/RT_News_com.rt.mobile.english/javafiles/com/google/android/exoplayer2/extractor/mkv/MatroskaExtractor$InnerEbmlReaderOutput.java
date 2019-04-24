// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.mkv:
//			EbmlReaderOutput, MatroskaExtractor

private final class MatroskaExtractor$InnerEbmlReaderOutput
	implements EbmlReaderOutput
{

	public void binaryElement(int i, int j, ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		MatroskaExtractor.this.binaryElement(i, j, extractorinput);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #30  <Method void MatroskaExtractor.binaryElement(int, int, ExtractorInput)>
	//    6   10:return          
	}

	public void endMasterElement(int i)
		throws ParserException
	{
		MatroskaExtractor.this.endMasterElement(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #37  <Method void MatroskaExtractor.endMasterElement(int)>
	//    4    8:return          
	}

	public void floatElement(int i, double d)
		throws ParserException
	{
		MatroskaExtractor.this.floatElement(i, d);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
	//    2    4:iload_1         
	//    3    5:dload_2         
	//    4    6:invokevirtual   #41  <Method void MatroskaExtractor.floatElement(int, double)>
	//    5    9:return          
	}

	public int getElementType(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    78: default 636
	//	               131: 646
	//	               134: 644
	//	               136: 646
	//	               155: 646
	//	               159: 646
	//	               160: 642
	//	               161: 640
	//	               163: 640
	//	               174: 642
	//	               176: 646
	//	               179: 646
	//	               181: 638
	//	               183: 642
	//	               186: 646
	//	               187: 642
	//	               215: 646
	//	               224: 642
	//	               225: 642
	//	               231: 646
	//	               241: 646
	//	               251: 646
	//	               16980: 646
	//	               16981: 640
	//	               17026: 644
	//	               17029: 646
	//	               17143: 646
	//	               17545: 638
	//	               18401: 646
	//	               18402: 640
	//	               18407: 642
	//	               18408: 646
	//	               19899: 642
	//	               20529: 646
	//	               20530: 646
	//	               20532: 642
	//	               20533: 642
	//	               21419: 640
	//	               21420: 646
	//	               21432: 646
	//	               21680: 646
	//	               21682: 646
	//	               21690: 646
	//	               21930: 646
	//	               21936: 642
	//	               21945: 646
	//	               21946: 646
	//	               21947: 646
	//	               21948: 646
	//	               21949: 646
	//	               21968: 642
	//	               21969: 638
	//	               21970: 638
	//	               21971: 638
	//	               21972: 638
	//	               21973: 638
	//	               21974: 638
	//	               21975: 638
	//	               21976: 638
	//	               21977: 638
	//	               21978: 638
	//	               22186: 646
	//	               22203: 646
	//	               25152: 642
	//	               25188: 646
	//	               25506: 640
	//	               28032: 642
	//	               30320: 642
	//	               30322: 640
	//	               2274716: 644
	//	               2352003: 646
	//	               2807729: 646
	//	               290298740: 642
	//	               357149030: 642
	//	               374648427: 642
	//	               408125543: 642
	//	               440786851: 642
	//	               475249515: 642
	//	               524531317: 642
		default:
			return 0;
	//    2  636:iconst_0        
	//    3  637:ireturn         

		case 181: 
		case 17545: 
		case 21969: 
		case 21970: 
		case 21971: 
		case 21972: 
		case 21973: 
		case 21974: 
		case 21975: 
		case 21976: 
		case 21977: 
		case 21978: 
			return 5;
	//    4  638:iconst_5        
	//    5  639:ireturn         

		case 161: 
		case 163: 
		case 16981: 
		case 18402: 
		case 21419: 
		case 25506: 
		case 30322: 
			return 4;
	//    6  640:iconst_4        
	//    7  641:ireturn         

		case 160: 
		case 174: 
		case 183: 
		case 187: 
		case 224: 
		case 225: 
		case 18407: 
		case 19899: 
		case 20532: 
		case 20533: 
		case 21936: 
		case 21968: 
		case 25152: 
		case 28032: 
		case 30320: 
		case 290298740: 
		case 357149030: 
		case 374648427: 
		case 408125543: 
		case 440786851: 
		case 475249515: 
		case 524531317: 
			return 1;
	//    8  642:iconst_1        
	//    9  643:ireturn         

		case 134: 
		case 17026: 
		case 2274716: 
			return 3;
	//   10  644:iconst_3        
	//   11  645:ireturn         

		case 131: 
		case 136: 
		case 155: 
		case 159: 
		case 176: 
		case 179: 
		case 186: 
		case 215: 
		case 231: 
		case 241: 
		case 251: 
		case 16980: 
		case 17029: 
		case 17143: 
		case 18401: 
		case 18408: 
		case 20529: 
		case 20530: 
		case 21420: 
		case 21432: 
		case 21680: 
		case 21682: 
		case 21690: 
		case 21930: 
		case 21945: 
		case 21946: 
		case 21947: 
		case 21948: 
		case 21949: 
		case 22186: 
		case 22203: 
		case 25188: 
		case 2352003: 
		case 2807729: 
			return 2;
	//   12  646:iconst_2        
	//   13  647:ireturn         
		}
	}

	public void integerElement(int i, long l)
		throws ParserException
	{
		MatroskaExtractor.this.integerElement(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #47  <Method void MatroskaExtractor.integerElement(int, long)>
	//    5    9:return          
	}

	public boolean isLevel1Element(int i)
	{
		return i == 0x1549a966 || i == 0x1f43b675 || i == 0x1c53bb6b || i == 0x1654ae6b;
	//    0    0:iload_1         
	//    1    1:ldc1            #50  <Int 0x1549a966>
	//    2    3:icmpeq          29
	//    3    6:iload_1         
	//    4    7:ldc1            #51  <Int 0x1f43b675>
	//    5    9:icmpeq          29
	//    6   12:iload_1         
	//    7   13:ldc1            #52  <Int 0x1c53bb6b>
	//    8   15:icmpeq          29
	//    9   18:iload_1         
	//   10   19:ldc1            #53  <Int 0x1654ae6b>
	//   11   21:icmpne          27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
	}

	public void startMasterElement(int i, long l, long l1)
		throws ParserException
	{
		MatroskaExtractor.this.startMasterElement(i, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #57  <Method void MatroskaExtractor.startMasterElement(int, long, long)>
	//    6   11:return          
	}

	public void stringElement(int i, String s)
		throws ParserException
	{
		MatroskaExtractor.this.stringElement(i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MatroskaExtractor this$0>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #61  <Method void MatroskaExtractor.stringElement(int, String)>
	//    5    9:return          
	}

	final MatroskaExtractor this$0;

	private MatroskaExtractor$InnerEbmlReaderOutput()
	{
		this$0 = MatroskaExtractor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field MatroskaExtractor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	MatroskaExtractor$InnerEbmlReaderOutput(MatroskaExtractor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void MatroskaExtractor$InnerEbmlReaderOutput(MatroskaExtractor)>
	//    3    5:return          
	}
}
