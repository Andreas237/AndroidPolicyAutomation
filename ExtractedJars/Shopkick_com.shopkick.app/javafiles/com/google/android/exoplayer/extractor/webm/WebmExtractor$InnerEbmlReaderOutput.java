// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.ExtractorInput;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//			EbmlReaderOutput, WebmExtractor

private final class WebmExtractor$InnerEbmlReaderOutput
	implements EbmlReaderOutput
{

	public void binaryElement(int i, int j, ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		WebmExtractor.this.binaryElement(i, j, extractorinput);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field WebmExtractor this$0>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #30  <Method void WebmExtractor.binaryElement(int, int, ExtractorInput)>
	//    6   10:return          
	}

	public void endMasterElement(int i)
		throws ParserException
	{
		WebmExtractor.this.endMasterElement(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field WebmExtractor this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #37  <Method void WebmExtractor.endMasterElement(int)>
	//    4    8:return          
	}

	public void floatElement(int i, double d)
		throws ParserException
	{
		WebmExtractor.this.floatElement(i, d);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field WebmExtractor this$0>
	//    2    4:iload_1         
	//    3    5:dload_2         
	//    4    6:invokevirtual   #41  <Method void WebmExtractor.floatElement(int, double)>
	//    5    9:return          
	}

	public int getElementType(int i)
	{
		return WebmExtractor.this.getElementType(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field WebmExtractor this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #45  <Method int WebmExtractor.getElementType(int)>
	//    4    8:ireturn         
	}

	public void integerElement(int i, long l)
		throws ParserException
	{
		WebmExtractor.this.integerElement(i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field WebmExtractor this$0>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #49  <Method void WebmExtractor.integerElement(int, long)>
	//    5    9:return          
	}

	public boolean isLevel1Element(int i)
	{
		return WebmExtractor.this.isLevel1Element(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field WebmExtractor this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #53  <Method boolean WebmExtractor.isLevel1Element(int)>
	//    4    8:ireturn         
	}

	public void startMasterElement(int i, long l, long l1)
		throws ParserException
	{
		WebmExtractor.this.startMasterElement(i, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field WebmExtractor this$0>
	//    2    4:iload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #57  <Method void WebmExtractor.startMasterElement(int, long, long)>
	//    6   11:return          
	}

	public void stringElement(int i, String s)
		throws ParserException
	{
		WebmExtractor.this.stringElement(i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field WebmExtractor this$0>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #61  <Method void WebmExtractor.stringElement(int, String)>
	//    5    9:return          
	}

	final WebmExtractor this$0;

	private WebmExtractor$InnerEbmlReaderOutput()
	{
		this$0 = WebmExtractor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field WebmExtractor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	WebmExtractor$InnerEbmlReaderOutput(WebmExtractor._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void WebmExtractor$InnerEbmlReaderOutput(WebmExtractor)>
	//    3    5:return          
	}
}
