// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.text.pdf.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ListIterator;

public class ContentByteUtils
{

	private ContentByteUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte[] getContentBytesForPage(PdfReader pdfreader, int i)
		throws IOException
	{
		pdfreader = ((PdfReader) (pdfreader.getPageN(i).get(PdfName.CONTENTS)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #19  <Method PdfDictionary PdfReader.getPageN(int)>
	//    3    5:getstatic       #25  <Field PdfName PdfName.CONTENTS>
	//    4    8:invokevirtual   #31  <Method PdfObject PdfDictionary.get(PdfName)>
	//    5   11:astore_0        
		if(pdfreader == null)
	//*   6   12:aload_0         
	//*   7   13:ifnonnull       20
			return new byte[0];
	//    8   16:iconst_0        
	//    9   17:newarray        byte[]
	//   10   19:areturn         
		else
			return getContentBytesFromContentObject(((PdfObject) (pdfreader)));
	//   11   20:aload_0         
	//   12   21:invokestatic    #35  <Method byte[] getContentBytesFromContentObject(PdfObject)>
	//   13   24:areturn         
	}

	public static byte[] getContentBytesFromContentObject(PdfObject pdfobject)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream;
		switch(pdfobject.type())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #42  <Method int PdfObject.type()>
		{
	//*   2    4:tableswitch     5 10: default 44
	//	               5 96
	//	               6 44
	//	               7 85
	//	               8 44
	//	               9 44
	//	               10 74
		case 6: // '\006'
		case 8: // '\b'
		case 9: // '\t'
		default:
			throw new IllegalStateException((new StringBuilder()).append("Unable to handle Content of type ").append(((Object) (((Object) (pdfobject)).getClass()))).toString());
	//    3   44:new             #44  <Class IllegalStateException>
	//    4   47:dup             
	//    5   48:new             #46  <Class StringBuilder>
	//    6   51:dup             
	//    7   52:invokespecial   #47  <Method void StringBuilder()>
	//    8   55:ldc1            #49  <String "Unable to handle Content of type ">
	//    9   57:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   10   60:aload_0         
	//   11   61:invokevirtual   #57  <Method Class Object.getClass()>
	//   12   64:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   13   67:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   14   70:invokespecial   #67  <Method void IllegalStateException(String)>
	//   15   73:athrow          

		case 10: // '\n'
			return getContentBytesFromContentObject(PdfReader.getPdfObjectRelease(((PdfObject) ((PRIndirectReference)pdfobject))));
	//   16   74:aload_0         
	//   17   75:checkcast       #69  <Class PRIndirectReference>
	//   18   78:invokestatic    #73  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   19   81:invokestatic    #35  <Method byte[] getContentBytesFromContentObject(PdfObject)>
	//   20   84:areturn         

		case 7: // '\007'
			return PdfReader.getStreamBytes((PRStream)PdfReader.getPdfObjectRelease(pdfobject));
	//   21   85:aload_0         
	//   22   86:invokestatic    #73  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   23   89:checkcast       #75  <Class PRStream>
	//   24   92:invokestatic    #79  <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   25   95:areturn         

		case 5: // '\005'
			bytearrayoutputstream = new ByteArrayOutputStream();
	//   26   96:new             #81  <Class ByteArrayOutputStream>
	//   27   99:dup             
	//   28  100:invokespecial   #82  <Method void ByteArrayOutputStream()>
	//   29  103:astore_1        
			break;
		}
		for(pdfobject = ((PdfObject) (((PdfArray)pdfobject).listIterator())); ((ListIterator) (pdfobject)).hasNext(); bytearrayoutputstream.write(32))
	//*  30  104:aload_0         
	//*  31  105:checkcast       #84  <Class PdfArray>
	//*  32  108:invokevirtual   #88  <Method ListIterator PdfArray.listIterator()>
	//*  33  111:astore_0        
	//*  34  112:aload_0         
	//*  35  113:invokeinterface #94  <Method boolean ListIterator.hasNext()>
	//*  36  118:ifeq            146
			bytearrayoutputstream.write(getContentBytesFromContentObject((PdfObject)((ListIterator) (pdfobject)).next()));
	//   37  121:aload_1         
	//   38  122:aload_0         
	//   39  123:invokeinterface #98  <Method Object ListIterator.next()>
	//   40  128:checkcast       #38  <Class PdfObject>
	//   41  131:invokestatic    #35  <Method byte[] getContentBytesFromContentObject(PdfObject)>
	//   42  134:invokevirtual   #102 <Method void ByteArrayOutputStream.write(byte[])>

	//   43  137:aload_1         
	//   44  138:bipush          32
	//   45  140:invokevirtual   #105 <Method void ByteArrayOutputStream.write(int)>
	//*  46  143:goto            112
		return bytearrayoutputstream.toByteArray();
	//   47  146:aload_1         
	//   48  147:invokevirtual   #109 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   49  150:areturn         
	}
}
