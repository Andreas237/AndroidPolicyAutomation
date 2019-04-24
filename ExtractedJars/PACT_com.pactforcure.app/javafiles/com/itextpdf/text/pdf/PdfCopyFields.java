// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocWriter;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.interfaces.PdfEncryptionSettings;
import com.itextpdf.text.pdf.interfaces.PdfViewerPreferences;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.Certificate;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfCopyFieldsImp, PdfReader, SequenceList, PdfEncodings, 
//			PdfName, PdfObject, PdfWriter

public class PdfCopyFields
	implements PdfViewerPreferences, PdfEncryptionSettings
{

	public PdfCopyFields(OutputStream outputstream)
		throws DocumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		fc = new PdfCopyFieldsImp(outputstream);
	//    2    4:aload_0         
	//    3    5:new             #20  <Class PdfCopyFieldsImp>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #22  <Method void PdfCopyFieldsImp(OutputStream)>
	//    7   13:putfield        #24  <Field PdfCopyFieldsImp fc>
	//    8   16:return          
	}

	public PdfCopyFields(OutputStream outputstream, char c)
		throws DocumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		fc = new PdfCopyFieldsImp(outputstream, c);
	//    2    4:aload_0         
	//    3    5:new             #20  <Class PdfCopyFieldsImp>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #29  <Method void PdfCopyFieldsImp(OutputStream, char)>
	//    8   14:putfield        #24  <Field PdfCopyFieldsImp fc>
	//    9   17:return          
	}

	public void addDocument(PdfReader pdfreader)
		throws DocumentException, IOException
	{
		fc.addDocument(pdfreader);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method void PdfCopyFieldsImp.addDocument(PdfReader)>
	//    4    8:return          
	}

	public void addDocument(PdfReader pdfreader, String s)
		throws DocumentException, IOException
	{
		fc.addDocument(pdfreader, SequenceList.expand(s, pdfreader.getNumberOfPages()));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #42  <Method int PdfReader.getNumberOfPages()>
	//    6   10:invokestatic    #48  <Method List SequenceList.expand(String, int)>
	//    7   13:invokevirtual   #51  <Method void PdfCopyFieldsImp.addDocument(PdfReader, List)>
	//    8   16:return          
	}

	public void addDocument(PdfReader pdfreader, List list)
		throws DocumentException, IOException
	{
		fc.addDocument(pdfreader, list);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #51  <Method void PdfCopyFieldsImp.addDocument(PdfReader, List)>
	//    5    9:return          
	}

	public void addJavaScript(String s)
	{
		PdfCopyFieldsImp pdfcopyfieldsimp = fc;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:astore_3        
		boolean flag;
		if(!PdfEncodings.isPdfDocEncoding(s))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #61  <Method boolean PdfEncodings.isPdfDocEncoding(String)>
	//*   5    9:ifne            21
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:aload_3         
	//*   9   15:aload_1         
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #64  <Method void PdfCopyFieldsImp.addJavaScript(String, boolean)>
	//*  12   20:return          
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		pdfcopyfieldsimp.addJavaScript(s, flag);
	//*  15   23:goto            14
	}

	public void addViewerPreference(PdfName pdfname, PdfObject pdfobject)
	{
		fc.addViewerPreference(pdfname, pdfobject);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #68  <Method void PdfCopyFieldsImp.addViewerPreference(PdfName, PdfObject)>
	//    5    9:return          
	}

	public void close()
	{
		fc.close();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:invokevirtual   #71  <Method void PdfCopyFieldsImp.close()>
	//    3    7:return          
	}

	public PdfWriter getWriter()
	{
		return ((PdfWriter) (fc));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:areturn         
	}

	public boolean isFullCompression()
	{
		return fc.isFullCompression();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:invokevirtual   #77  <Method boolean PdfCopyFieldsImp.isFullCompression()>
	//    3    7:ireturn         
	}

	public void open()
	{
		fc.openDoc();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:invokevirtual   #81  <Method void PdfCopyFieldsImp.openDoc()>
	//    3    7:return          
	}

	public void setEncryption(boolean flag, String s, String s1, int i)
		throws DocumentException
	{
		setEncryption(DocWriter.getISOBytes(s), DocWriter.getISOBytes(s1), i, flag);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #89  <Method byte[] DocWriter.getISOBytes(String)>
	//    3    5:aload_3         
	//    4    6:invokestatic    #89  <Method byte[] DocWriter.getISOBytes(String)>
	//    5    9:iload           4
	//    6   11:iload_1         
	//    7   12:invokevirtual   #92  <Method void setEncryption(byte[], byte[], int, boolean)>
	//    8   15:return          
	}

	public void setEncryption(byte abyte0[], byte abyte1[], int i, int j)
		throws DocumentException
	{
		fc.setEncryption(abyte0, abyte1, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #95  <Method void PdfCopyFieldsImp.setEncryption(byte[], byte[], int, int)>
	//    7   12:return          
	}

	public void setEncryption(byte abyte0[], byte abyte1[], int i, boolean flag)
		throws DocumentException
	{
		PdfCopyFieldsImp pdfcopyfieldsimp = fc;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:astore          6
		int j;
		if(flag)
	//*   3    6:iload           4
	//*   4    8:ifeq            25
			j = 1;
	//    5   11:iconst_1        
	//    6   12:istore          5
		else
	//*   7   14:aload           6
	//*   8   16:aload_1         
	//*   9   17:aload_2         
	//*  10   18:iload_3         
	//*  11   19:iload           5
	//*  12   21:invokevirtual   #95  <Method void PdfCopyFieldsImp.setEncryption(byte[], byte[], int, int)>
	//*  13   24:return          
			j = 0;
	//   14   25:iconst_0        
	//   15   26:istore          5
		pdfcopyfieldsimp.setEncryption(abyte0, abyte1, i, j);
	//*  16   28:goto            14
	}

	public void setEncryption(Certificate acertificate[], int ai[], int i)
		throws DocumentException
	{
		fc.setEncryption(acertificate, ai, i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #98  <Method void PdfCopyFieldsImp.setEncryption(Certificate[], int[], int)>
	//    6   10:return          
	}

	public void setFullCompression()
		throws DocumentException
	{
		fc.setFullCompression();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:invokevirtual   #101 <Method void PdfCopyFieldsImp.setFullCompression()>
	//    3    7:return          
	}

	public void setOutlines(List list)
	{
		fc.setOutlines(list);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #105 <Method void PdfCopyFieldsImp.setOutlines(List)>
	//    4    8:return          
	}

	public void setViewerPreferences(int i)
	{
		fc.setViewerPreferences(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PdfCopyFieldsImp fc>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #110 <Method void PdfCopyFieldsImp.setViewerPreferences(int)>
	//    4    8:return          
	}

	private PdfCopyFieldsImp fc;
}
