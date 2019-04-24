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
//			PdfCopyFormsImp, PdfReader, SequenceList, PdfEncodings, 
//			PdfName, PdfObject, PdfWriter

public class PdfCopyForms
	implements PdfViewerPreferences, PdfEncryptionSettings
{

	public PdfCopyForms(OutputStream outputstream)
		throws DocumentException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		fc = new PdfCopyFormsImp(outputstream);
	//    2    4:aload_0         
	//    3    5:new             #19  <Class PdfCopyFormsImp>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #21  <Method void PdfCopyFormsImp(OutputStream)>
	//    7   13:putfield        #23  <Field PdfCopyFormsImp fc>
	//    8   16:return          
	}

	public void addDocument(PdfReader pdfreader)
		throws DocumentException, IOException
	{
		fc.addDocument(pdfreader);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method void PdfCopyFormsImp.addDocument(PdfReader)>
	//    4    8:return          
	}

	public void addDocument(PdfReader pdfreader, String s)
		throws DocumentException, IOException
	{
		fc.addDocument(pdfreader, SequenceList.expand(s, pdfreader.getNumberOfPages()));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #38  <Method int PdfReader.getNumberOfPages()>
	//    6   10:invokestatic    #44  <Method List SequenceList.expand(String, int)>
	//    7   13:invokevirtual   #47  <Method void PdfCopyFormsImp.addDocument(PdfReader, List)>
	//    8   16:return          
	}

	public void addDocument(PdfReader pdfreader, List list)
		throws DocumentException, IOException
	{
		fc.addDocument(pdfreader, list);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #47  <Method void PdfCopyFormsImp.addDocument(PdfReader, List)>
	//    5    9:return          
	}

	public void addJavaScript(String s)
	{
		PdfCopyFormsImp pdfcopyformsimp = fc;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:astore_3        
		boolean flag;
		if(!PdfEncodings.isPdfDocEncoding(s))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #57  <Method boolean PdfEncodings.isPdfDocEncoding(String)>
	//*   5    9:ifne            21
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:aload_3         
	//*   9   15:aload_1         
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #60  <Method void PdfCopyFormsImp.addJavaScript(String, boolean)>
	//*  12   20:return          
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		pdfcopyformsimp.addJavaScript(s, flag);
	//*  15   23:goto            14
	}

	public void addViewerPreference(PdfName pdfname, PdfObject pdfobject)
	{
		fc.addViewerPreference(pdfname, pdfobject);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #64  <Method void PdfCopyFormsImp.addViewerPreference(PdfName, PdfObject)>
	//    5    9:return          
	}

	public void close()
	{
		fc.close();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:invokevirtual   #67  <Method void PdfCopyFormsImp.close()>
	//    3    7:return          
	}

	public void copyDocumentFields(PdfReader pdfreader)
		throws DocumentException
	{
		fc.copyDocumentFields(pdfreader);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #70  <Method void PdfCopyFormsImp.copyDocumentFields(PdfReader)>
	//    4    8:return          
	}

	public PdfWriter getWriter()
	{
		return ((PdfWriter) (fc));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:areturn         
	}

	public boolean isFullCompression()
	{
		return fc.isFullCompression();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:invokevirtual   #76  <Method boolean PdfCopyFormsImp.isFullCompression()>
	//    3    7:ireturn         
	}

	public void open()
	{
		fc.openDoc();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:invokevirtual   #80  <Method void PdfCopyFormsImp.openDoc()>
	//    3    7:return          
	}

	public void setEncryption(boolean flag, String s, String s1, int i)
		throws DocumentException
	{
		setEncryption(DocWriter.getISOBytes(s), DocWriter.getISOBytes(s1), i, flag);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #88  <Method byte[] DocWriter.getISOBytes(String)>
	//    3    5:aload_3         
	//    4    6:invokestatic    #88  <Method byte[] DocWriter.getISOBytes(String)>
	//    5    9:iload           4
	//    6   11:iload_1         
	//    7   12:invokevirtual   #91  <Method void setEncryption(byte[], byte[], int, boolean)>
	//    8   15:return          
	}

	public void setEncryption(byte abyte0[], byte abyte1[], int i, int j)
		throws DocumentException
	{
		fc.setEncryption(abyte0, abyte1, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #94  <Method void PdfCopyFormsImp.setEncryption(byte[], byte[], int, int)>
	//    7   12:return          
	}

	public void setEncryption(byte abyte0[], byte abyte1[], int i, boolean flag)
		throws DocumentException
	{
		PdfCopyFormsImp pdfcopyformsimp = fc;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
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
	//*  12   21:invokevirtual   #94  <Method void PdfCopyFormsImp.setEncryption(byte[], byte[], int, int)>
	//*  13   24:return          
			j = 0;
	//   14   25:iconst_0        
	//   15   26:istore          5
		pdfcopyformsimp.setEncryption(abyte0, abyte1, i, j);
	//*  16   28:goto            14
	}

	public void setEncryption(Certificate acertificate[], int ai[], int i)
		throws DocumentException
	{
		fc.setEncryption(acertificate, ai, i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #97  <Method void PdfCopyFormsImp.setEncryption(Certificate[], int[], int)>
	//    6   10:return          
	}

	public void setFullCompression()
		throws DocumentException
	{
		fc.setFullCompression();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:invokevirtual   #100 <Method void PdfCopyFormsImp.setFullCompression()>
	//    3    7:return          
	}

	public void setOutlines(List list)
	{
		fc.setOutlines(list);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #104 <Method void PdfCopyFormsImp.setOutlines(List)>
	//    4    8:return          
	}

	public void setViewerPreferences(int i)
	{
		fc.setViewerPreferences(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field PdfCopyFormsImp fc>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #109 <Method void PdfCopyFormsImp.setViewerPreferences(int)>
	//    4    8:return          
	}

	private PdfCopyFormsImp fc;
}
