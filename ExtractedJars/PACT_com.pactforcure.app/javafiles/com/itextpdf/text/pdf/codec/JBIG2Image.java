// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.RandomAccessFileOrArray;

// Referenced classes of package com.itextpdf.text.pdf.codec:
//			JBIG2SegmentReader

public class JBIG2Image
{

	public JBIG2Image()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte[] getGlobalSegment(RandomAccessFileOrArray randomaccessfileorarray)
	{
		try
		{
			randomaccessfileorarray = ((RandomAccessFileOrArray) (new JBIG2SegmentReader(randomaccessfileorarray)));
	//    0    0:new             #15  <Class JBIG2SegmentReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #18  <Method void JBIG2SegmentReader(RandomAccessFileOrArray)>
	//    4    8:astore_0        
			((JBIG2SegmentReader) (randomaccessfileorarray)).read();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #21  <Method void JBIG2SegmentReader.read()>
			randomaccessfileorarray = ((RandomAccessFileOrArray) (((JBIG2SegmentReader) (randomaccessfileorarray)).getGlobal(true)));
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #25  <Method byte[] JBIG2SegmentReader.getGlobal(boolean)>
	//   10   18:astore_0        
		}
	//*  11   19:aload_0         
	//*  12   20:areturn         
		// Misplaced declaration of an exception variable
		catch(RandomAccessFileOrArray randomaccessfileorarray)
	//*  13   21:astore_0        
		{
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		}
		return ((byte []) (randomaccessfileorarray));
	}

	public static Image getJbig2Image(RandomAccessFileOrArray randomaccessfileorarray, int i)
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          22
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.page.number.must.be.gt.eq.1", new Object[0]));
	//    3    5:new             #29  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc1            #31  <String "the.page.number.must.be.gt.eq.1">
	//    6   11:iconst_0        
	//    7   12:anewarray       Object[]
	//    8   15:invokestatic    #37  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   18:invokespecial   #40  <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
		try
		{
			randomaccessfileorarray = ((RandomAccessFileOrArray) (new JBIG2SegmentReader(randomaccessfileorarray)));
	//   11   22:new             #15  <Class JBIG2SegmentReader>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:invokespecial   #18  <Method void JBIG2SegmentReader(RandomAccessFileOrArray)>
	//   15   30:astore_0        
			((JBIG2SegmentReader) (randomaccessfileorarray)).read();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #21  <Method void JBIG2SegmentReader.read()>
			JBIG2SegmentReader.JBIG2Page jbig2page = ((JBIG2SegmentReader) (randomaccessfileorarray)).getPage(i);
	//   18   35:aload_0         
	//   19   36:iload_1         
	//   20   37:invokevirtual   #44  <Method JBIG2SegmentReader$JBIG2Page JBIG2SegmentReader.getPage(int)>
	//   21   40:astore_2        
			randomaccessfileorarray = ((RandomAccessFileOrArray) (new ImgJBIG2(jbig2page.pageBitmapWidth, jbig2page.pageBitmapHeight, jbig2page.getData(true), ((JBIG2SegmentReader) (randomaccessfileorarray)).getGlobal(true))));
	//   22   41:new             #46  <Class ImgJBIG2>
	//   23   44:dup             
	//   24   45:aload_2         
	//   25   46:getfield        #52  <Field int JBIG2SegmentReader$JBIG2Page.pageBitmapWidth>
	//   26   49:aload_2         
	//   27   50:getfield        #55  <Field int JBIG2SegmentReader$JBIG2Page.pageBitmapHeight>
	//   28   53:aload_2         
	//   29   54:iconst_1        
	//   30   55:invokevirtual   #58  <Method byte[] JBIG2SegmentReader$JBIG2Page.getData(boolean)>
	//   31   58:aload_0         
	//   32   59:iconst_1        
	//   33   60:invokevirtual   #25  <Method byte[] JBIG2SegmentReader.getGlobal(boolean)>
	//   34   63:invokespecial   #61  <Method void ImgJBIG2(int, int, byte[], byte[])>
	//   35   66:astore_0        
		}
	//*  36   67:aload_0         
	//*  37   68:areturn         
		// Misplaced declaration of an exception variable
		catch(RandomAccessFileOrArray randomaccessfileorarray)
	//*  38   69:astore_0        
		{
			throw new ExceptionConverter(((Exception) (randomaccessfileorarray)));
	//   39   70:new             #63  <Class ExceptionConverter>
	//   40   73:dup             
	//   41   74:aload_0         
	//   42   75:invokespecial   #66  <Method void ExceptionConverter(Exception)>
	//   43   78:athrow          
		}
		return ((Image) (randomaccessfileorarray));
	}

	public static int getNumberOfPages(RandomAccessFileOrArray randomaccessfileorarray)
	{
		int i;
		try
		{
			randomaccessfileorarray = ((RandomAccessFileOrArray) (new JBIG2SegmentReader(randomaccessfileorarray)));
	//    0    0:new             #15  <Class JBIG2SegmentReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #18  <Method void JBIG2SegmentReader(RandomAccessFileOrArray)>
	//    4    8:astore_0        
			((JBIG2SegmentReader) (randomaccessfileorarray)).read();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #21  <Method void JBIG2SegmentReader.read()>
			i = ((JBIG2SegmentReader) (randomaccessfileorarray)).numberOfPages();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #72  <Method int JBIG2SegmentReader.numberOfPages()>
	//    9   17:istore_1        
		}
	//*  10   18:iload_1         
	//*  11   19:ireturn         
		// Misplaced declaration of an exception variable
		catch(RandomAccessFileOrArray randomaccessfileorarray)
	//*  12   20:astore_0        
		{
			throw new ExceptionConverter(((Exception) (randomaccessfileorarray)));
	//   13   21:new             #63  <Class ExceptionConverter>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:invokespecial   #66  <Method void ExceptionConverter(Exception)>
	//   17   29:athrow          
		}
		return i;
	}
}
