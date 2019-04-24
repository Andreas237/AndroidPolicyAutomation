// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.RandomAccessSourceFactory;
import com.itextpdf.text.io.StreamUtil;
import com.itextpdf.text.pdf.PRTokeniser;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;
import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			CidLocation

public class CidResource
	implements CidLocation
{

	public CidResource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public PRTokeniser getLocation(String s)
		throws IOException
	{
		s = (new StringBuilder()).append("com/itextpdf/text/pdf/fonts/cmaps/").append(s).toString();
	//    0    0:new             #17  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:ldc1            #20  <String "com/itextpdf/text/pdf/fonts/cmaps/">
	//    4    9:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #28  <Method String StringBuilder.toString()>
	//    8   19:astore_1        
		java.io.InputStream inputstream = StreamUtil.getResourceStream(s);
	//    9   20:aload_1         
	//   10   21:invokestatic    #34  <Method java.io.InputStream StreamUtil.getResourceStream(String)>
	//   11   24:astore_2        
		if(inputstream == null)
	//*  12   25:aload_2         
	//*  13   26:ifnonnull       50
			throw new IOException(MessageLocalization.getComposedMessage("the.cmap.1.was.not.found", new Object[] {
				s
			}));
	//   14   29:new             #15  <Class IOException>
	//   15   32:dup             
	//   16   33:ldc1            #36  <String "the.cmap.1.was.not.found">
	//   17   35:iconst_1        
	//   18   36:anewarray       Object[]
	//   19   39:dup             
	//   20   40:iconst_0        
	//   21   41:aload_1         
	//   22   42:aastore         
	//   23   43:invokestatic    #42  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   24   46:invokespecial   #45  <Method void IOException(String)>
	//   25   49:athrow          
		else
			return new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(inputstream)));
	//   26   50:new             #47  <Class PRTokeniser>
	//   27   53:dup             
	//   28   54:new             #49  <Class RandomAccessFileOrArray>
	//   29   57:dup             
	//   30   58:new             #51  <Class RandomAccessSourceFactory>
	//   31   61:dup             
	//   32   62:invokespecial   #52  <Method void RandomAccessSourceFactory()>
	//   33   65:aload_2         
	//   34   66:invokevirtual   #56  <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createSource(java.io.InputStream)>
	//   35   69:invokespecial   #59  <Method void RandomAccessFileOrArray(com.itextpdf.text.io.RandomAccessSource)>
	//   36   72:invokespecial   #62  <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   37   75:areturn         
	}
}
