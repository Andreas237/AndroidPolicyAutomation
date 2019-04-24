// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.collection.PdfCollection;
import com.itextpdf.text.pdf.interfaces.PdfEncryptionSettings;
import com.itextpdf.text.pdf.interfaces.PdfViewerPreferences;
import com.itextpdf.text.pdf.security.LtvVerification;
import com.itextpdf.text.xml.xmp.XmpWriter;
import java.io.*;
import java.security.cert.Certificate;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStamperImp, ByteBuffer, PdfSignatureAppearance, PdfReader, 
//			PdfName, PdfDictionary, XmlSignatureAppearance, PdfFileSpecification, 
//			PdfEncodings, PdfAction, PdfDestination, PdfArray, 
//			PdfFormField, PdfAcroForm, PdfException, PdfAnnotation, 
//			FdfReader, PdfObject, AcroFields, PdfImportedPage, 
//			PdfContentByte, PdfWriter, PdfTransition

public class PdfStamper
	implements PdfViewerPreferences, PdfEncryptionSettings
{

	protected PdfStamper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public PdfStamper(PdfReader pdfreader, OutputStream outputstream)
		throws DocumentException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		stamper = new PdfStamperImp(pdfreader, outputstream, '\0', false);
	//    2    4:aload_0         
	//    3    5:new             #33  <Class PdfStamperImp>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:iconst_0        
	//    9   13:invokespecial   #36  <Method void PdfStamperImp(PdfReader, OutputStream, char, boolean)>
	//   10   16:putfield        #38  <Field PdfStamperImp stamper>
	//   11   19:return          
	}

	public PdfStamper(PdfReader pdfreader, OutputStream outputstream, char c)
		throws DocumentException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		stamper = new PdfStamperImp(pdfreader, outputstream, c, false);
	//    2    4:aload_0         
	//    3    5:new             #33  <Class PdfStamperImp>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iconst_0        
	//    9   13:invokespecial   #36  <Method void PdfStamperImp(PdfReader, OutputStream, char, boolean)>
	//   10   16:putfield        #38  <Field PdfStamperImp stamper>
	//   11   19:return          
	}

	public PdfStamper(PdfReader pdfreader, OutputStream outputstream, char c, boolean flag)
		throws DocumentException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		stamper = new PdfStamperImp(pdfreader, outputstream, c, flag);
	//    2    4:aload_0         
	//    3    5:new             #33  <Class PdfStamperImp>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:invokespecial   #36  <Method void PdfStamperImp(PdfReader, OutputStream, char, boolean)>
	//   10   17:putfield        #38  <Field PdfStamperImp stamper>
	//   11   20:return          
	}

	public static PdfStamper createSignature(PdfReader pdfreader, OutputStream outputstream, char c)
		throws DocumentException, IOException
	{
		return createSignature(pdfreader, outputstream, c, ((File) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:invokestatic    #45  <Method PdfStamper createSignature(PdfReader, OutputStream, char, File, boolean)>
	//    6    8:areturn         
	}

	public static PdfStamper createSignature(PdfReader pdfreader, OutputStream outputstream, char c, File file)
		throws DocumentException, IOException
	{
		return createSignature(pdfreader, outputstream, c, file, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #45  <Method PdfStamper createSignature(PdfReader, OutputStream, char, File, boolean)>
	//    6    8:areturn         
	}

	public static PdfStamper createSignature(PdfReader pdfreader, OutputStream outputstream, char c, File file, boolean flag)
		throws DocumentException, IOException
	{
		if(file == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       113
		{
			ByteBuffer bytebuffer = new ByteBuffer();
	//    2    4:new             #48  <Class ByteBuffer>
	//    3    7:dup             
	//    4    8:invokespecial   #49  <Method void ByteBuffer()>
	//    5   11:astore          5
			file = ((File) (new PdfStamper(pdfreader, ((OutputStream) (bytebuffer)), c, flag)));
	//    6   13:new             #2   <Class PdfStamper>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:aload           5
	//   10   20:iload_2         
	//   11   21:iload           4
	//   12   23:invokespecial   #50  <Method void PdfStamper(PdfReader, OutputStream, char, boolean)>
	//   13   26:astore_3        
			file.sigApp = new PdfSignatureAppearance(((PdfStamper) (file)).stamper);
	//   14   27:aload_3         
	//   15   28:new             #52  <Class PdfSignatureAppearance>
	//   16   31:dup             
	//   17   32:aload_3         
	//   18   33:getfield        #38  <Field PdfStamperImp stamper>
	//   19   36:invokespecial   #55  <Method void PdfSignatureAppearance(PdfStamperImp)>
	//   20   39:putfield        #57  <Field PdfSignatureAppearance sigApp>
			((PdfStamper) (file)).sigApp.setSigout(bytebuffer);
	//   21   42:aload_3         
	//   22   43:getfield        #57  <Field PdfSignatureAppearance sigApp>
	//   23   46:aload           5
	//   24   48:invokevirtual   #61  <Method void PdfSignatureAppearance.setSigout(ByteBuffer)>
		} else
	//*  25   51:aload_3         
	//*  26   52:getfield        #57  <Field PdfSignatureAppearance sigApp>
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #65  <Method void PdfSignatureAppearance.setOriginalout(OutputStream)>
	//*  29   59:aload_3         
	//*  30   60:getfield        #57  <Field PdfSignatureAppearance sigApp>
	//*  31   63:aload_3         
	//*  32   64:invokevirtual   #69  <Method void PdfSignatureAppearance.setStamper(PdfStamper)>
	//*  33   67:aload_3         
	//*  34   68:iconst_1        
	//*  35   69:putfield        #71  <Field boolean hasSignature>
	//*  36   72:aload_0         
	//*  37   73:invokevirtual   #77  <Method PdfDictionary PdfReader.getCatalog()>
	//*  38   76:astore_0        
	//*  39   77:aload_0         
	//*  40   78:getstatic       #83  <Field PdfName PdfName.ACROFORM>
	//*  41   81:invokevirtual   #89  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  42   84:aload_0         
	//*  43   85:invokestatic    #93  <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//*  44   88:checkcast       #85  <Class PdfDictionary>
	//*  45   91:astore_0        
	//*  46   92:aload_0         
	//*  47   93:ifnull          111
	//*  48   96:aload_0         
	//*  49   97:getstatic       #96  <Field PdfName PdfName.NEEDAPPEARANCES>
	//*  50  100:invokevirtual   #100 <Method void PdfDictionary.remove(PdfName)>
	//*  51  103:aload_3         
	//*  52  104:getfield        #38  <Field PdfStamperImp stamper>
	//*  53  107:aload_0         
	//*  54  108:invokevirtual   #104 <Method void PdfStamperImp.markUsed(PdfObject)>
	//*  55  111:aload_3         
	//*  56  112:areturn         
		{
			File file1 = file;
	//   57  113:aload_3         
	//   58  114:astore          5
			if(file.isDirectory())
	//*  59  116:aload_3         
	//*  60  117:invokevirtual   #110 <Method boolean File.isDirectory()>
	//*  61  120:ifeq            133
				file1 = File.createTempFile("pdf", ".pdf", file);
	//   62  123:ldc1            #112 <String "pdf">
	//   63  125:ldc1            #114 <String ".pdf">
	//   64  127:aload_3         
	//   65  128:invokestatic    #118 <Method File File.createTempFile(String, String, File)>
	//   66  131:astore          5
			file = ((File) (new PdfStamper(pdfreader, ((OutputStream) (new FileOutputStream(file1))), c, flag)));
	//   67  133:new             #2   <Class PdfStamper>
	//   68  136:dup             
	//   69  137:aload_0         
	//   70  138:new             #120 <Class FileOutputStream>
	//   71  141:dup             
	//   72  142:aload           5
	//   73  144:invokespecial   #123 <Method void FileOutputStream(File)>
	//   74  147:iload_2         
	//   75  148:iload           4
	//   76  150:invokespecial   #50  <Method void PdfStamper(PdfReader, OutputStream, char, boolean)>
	//   77  153:astore_3        
			file.sigApp = new PdfSignatureAppearance(((PdfStamper) (file)).stamper);
	//   78  154:aload_3         
	//   79  155:new             #52  <Class PdfSignatureAppearance>
	//   80  158:dup             
	//   81  159:aload_3         
	//   82  160:getfield        #38  <Field PdfStamperImp stamper>
	//   83  163:invokespecial   #55  <Method void PdfSignatureAppearance(PdfStamperImp)>
	//   84  166:putfield        #57  <Field PdfSignatureAppearance sigApp>
			((PdfStamper) (file)).sigApp.setTempFile(file1);
	//   85  169:aload_3         
	//   86  170:getfield        #57  <Field PdfSignatureAppearance sigApp>
	//   87  173:aload           5
	//   88  175:invokevirtual   #126 <Method void PdfSignatureAppearance.setTempFile(File)>
		}
		((PdfStamper) (file)).sigApp.setOriginalout(outputstream);
		((PdfStamper) (file)).sigApp.setStamper(((PdfStamper) (file)));
		file.hasSignature = true;
		pdfreader = ((PdfReader) (pdfreader.getCatalog()));
		pdfreader = ((PdfReader) ((PdfDictionary)PdfReader.getPdfObject(((PdfDictionary) (pdfreader)).get(PdfName.ACROFORM), ((PdfObject) (pdfreader)))));
		if(pdfreader != null)
		{
			((PdfDictionary) (pdfreader)).remove(PdfName.NEEDAPPEARANCES);
			((PdfStamper) (file)).stamper.markUsed(((PdfObject) (pdfreader)));
		}
		return ((PdfStamper) (file));
	//*  89  178:goto            51
	}

	public static PdfStamper createXmlSignature(PdfReader pdfreader, OutputStream outputstream)
		throws IOException, DocumentException
	{
		pdfreader = ((PdfReader) (new PdfStamper(pdfreader, outputstream)));
	//    0    0:new             #2   <Class PdfStamper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #130 <Method void PdfStamper(PdfReader, OutputStream)>
	//    5    9:astore_0        
		pdfreader.sigXmlApp = new XmlSignatureAppearance(((PdfStamper) (pdfreader)).stamper);
	//    6   10:aload_0         
	//    7   11:new             #132 <Class XmlSignatureAppearance>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #38  <Field PdfStamperImp stamper>
	//   11   19:invokespecial   #133 <Method void XmlSignatureAppearance(PdfStamperImp)>
	//   12   22:putfield        #135 <Field XmlSignatureAppearance sigXmlApp>
		((PdfStamper) (pdfreader)).sigXmlApp.setStamper(((PdfStamper) (pdfreader)));
	//   13   25:aload_0         
	//   14   26:getfield        #135 <Field XmlSignatureAppearance sigXmlApp>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #136 <Method void XmlSignatureAppearance.setStamper(PdfStamper)>
		return ((PdfStamper) (pdfreader));
	//   17   33:aload_0         
	//   18   34:areturn         
	}

	public void addAnnotation(PdfAnnotation pdfannotation, int i)
	{
		stamper.addAnnotation(pdfannotation, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #140 <Method void PdfStamperImp.addAnnotation(PdfAnnotation, int)>
	//    5    9:return          
	}

	public void addComments(FdfReader fdfreader)
		throws IOException
	{
		stamper.addComments(fdfreader);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method void PdfStamperImp.addComments(FdfReader)>
	//    4    8:return          
	}

	public void addFileAttachment(String s, PdfFileSpecification pdffilespecification)
		throws IOException
	{
		stamper.addFileAttachment(s, pdffilespecification);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #148 <Method void PdfStamperImp.addFileAttachment(String, PdfFileSpecification)>
	//    5    9:return          
	}

	public void addFileAttachment(String s, byte abyte0[], String s1, String s2)
		throws IOException
	{
		addFileAttachment(s, PdfFileSpecification.fileEmbedded(((PdfWriter) (stamper)), s1, s2, abyte0));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #38  <Field PdfStamperImp stamper>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload_2         
	//    7   10:invokestatic    #155 <Method PdfFileSpecification PdfFileSpecification.fileEmbedded(PdfWriter, String, String, byte[])>
	//    8   13:invokevirtual   #156 <Method void addFileAttachment(String, PdfFileSpecification)>
	//    9   16:return          
	}

	public void addJavaScript(String s)
	{
		PdfStamperImp pdfstamperimp = stamper;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:astore_3        
		boolean flag;
		if(!PdfEncodings.isPdfDocEncoding(s))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #164 <Method boolean PdfEncodings.isPdfDocEncoding(String)>
	//*   5    9:ifne            21
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:aload_3         
	//*   9   15:aload_1         
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #167 <Method void PdfStamperImp.addJavaScript(String, boolean)>
	//*  12   20:return          
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		pdfstamperimp.addJavaScript(s, flag);
	//*  15   23:goto            14
	}

	public void addJavaScript(String s, String s1)
	{
		PdfStamperImp pdfstamperimp = stamper;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:astore          4
		PdfStamperImp pdfstamperimp1 = stamper;
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field PdfStamperImp stamper>
	//    5   10:astore          5
		boolean flag;
		if(!PdfEncodings.isPdfDocEncoding(s1))
	//*   6   12:aload_2         
	//*   7   13:invokestatic    #164 <Method boolean PdfEncodings.isPdfDocEncoding(String)>
	//*   8   16:ifne            35
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_3        
		else
	//*  11   21:aload           4
	//*  12   23:aload_1         
	//*  13   24:aload_2         
	//*  14   25:aload           5
	//*  15   27:iload_3         
	//*  16   28:invokestatic    #174 <Method PdfAction PdfAction.javaScript(String, PdfWriter, boolean)>
	//*  17   31:invokevirtual   #177 <Method void PdfStamperImp.addJavaScript(String, PdfAction)>
	//*  18   34:return          
			flag = false;
	//   19   35:iconst_0        
	//   20   36:istore_3        
		pdfstamperimp.addJavaScript(s, PdfAction.javaScript(s1, ((PdfWriter) (pdfstamperimp1)), flag));
	//*  21   37:goto            21
	}

	public boolean addNamedDestination(String s, int i, PdfDestination pdfdestination)
		throws IOException
	{
		HashMap hashmap = stamper.getNamedDestinations();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:invokevirtual   #183 <Method HashMap PdfStamperImp.getNamedDestinations()>
	//    3    7:astore          4
		if(getReader().getNamedDestination().containsKey(((Object) (s))))
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #187 <Method PdfReader getReader()>
	//*   6   13:invokevirtual   #190 <Method HashMap PdfReader.getNamedDestination()>
	//*   7   16:aload_1         
	//*   8   17:invokevirtual   #196 <Method boolean HashMap.containsKey(Object)>
	//*   9   20:ifeq            25
		{
			return false;
	//   10   23:iconst_0        
	//   11   24:ireturn         
		} else
		{
			pdfdestination = new PdfDestination(pdfdestination);
	//   12   25:new             #198 <Class PdfDestination>
	//   13   28:dup             
	//   14   29:aload_3         
	//   15   30:invokespecial   #201 <Method void PdfDestination(PdfDestination)>
	//   16   33:astore_3        
			pdfdestination.addPage(((PdfIndirectReference) (getReader().getPageOrigRef(i))));
	//   17   34:aload_3         
	//   18   35:aload_0         
	//   19   36:invokevirtual   #187 <Method PdfReader getReader()>
	//   20   39:iload_2         
	//   21   40:invokevirtual   #205 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
	//   22   43:invokevirtual   #209 <Method boolean PdfDestination.addPage(PdfIndirectReference)>
	//   23   46:pop             
			hashmap.put(((Object) (s)), ((Object) (new PdfArray(((PdfArray) (pdfdestination))))));
	//   24   47:aload           4
	//   25   49:aload_1         
	//   26   50:new             #211 <Class PdfArray>
	//   27   53:dup             
	//   28   54:aload_3         
	//   29   55:invokespecial   #214 <Method void PdfArray(PdfArray)>
	//   30   58:invokevirtual   #218 <Method Object HashMap.put(Object, Object)>
	//   31   61:pop             
			return true;
	//   32   62:iconst_1        
	//   33   63:ireturn         
		}
	}

	public PdfFormField addSignature(String s, int i, float f, float f1, float f2, float f3)
	{
		PdfAcroForm pdfacroform = stamper.getAcroForm();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:invokevirtual   #224 <Method PdfAcroForm PdfStamperImp.getAcroForm()>
	//    3    7:astore          7
		PdfFormField pdfformfield = PdfFormField.createSignature(((PdfWriter) (stamper)));
	//    4    9:aload_0         
	//    5   10:getfield        #38  <Field PdfStamperImp stamper>
	//    6   13:invokestatic    #229 <Method PdfFormField PdfFormField.createSignature(PdfWriter)>
	//    7   16:astore          8
		pdfacroform.setSignatureParams(pdfformfield, s, f, f1, f2, f3);
	//    8   18:aload           7
	//    9   20:aload           8
	//   10   22:aload_1         
	//   11   23:fload_3         
	//   12   24:fload           4
	//   13   26:fload           5
	//   14   28:fload           6
	//   15   30:invokevirtual   #235 <Method void PdfAcroForm.setSignatureParams(PdfFormField, String, float, float, float, float)>
		pdfacroform.drawSignatureAppearences(pdfformfield, f, f1, f2, f3);
	//   16   33:aload           7
	//   17   35:aload           8
	//   18   37:fload_3         
	//   19   38:fload           4
	//   20   40:fload           5
	//   21   42:fload           6
	//   22   44:invokevirtual   #239 <Method void PdfAcroForm.drawSignatureAppearences(PdfFormField, float, float, float, float)>
		addAnnotation(((PdfAnnotation) (pdfformfield)), i);
	//   23   47:aload_0         
	//   24   48:aload           8
	//   25   50:iload_2         
	//   26   51:invokevirtual   #240 <Method void addAnnotation(PdfAnnotation, int)>
		return pdfformfield;
	//   27   54:aload           8
	//   28   56:areturn         
	}

	public void addViewerPreference(PdfName pdfname, PdfObject pdfobject)
	{
		stamper.addViewerPreference(pdfname, pdfobject);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #244 <Method void PdfStamperImp.addViewerPreference(PdfName, PdfObject)>
	//    5    9:return          
	}

	public void close()
		throws DocumentException, IOException
	{
		if(stamper.closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field PdfStamperImp stamper>
	//*   2    4:getfield        #248 <Field boolean PdfStamperImp.closed>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(!hasSignature)
	//*   5   11:aload_0         
	//*   6   12:getfield        #71  <Field boolean hasSignature>
	//*   7   15:ifne            34
		{
			mergeVerification();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #251 <Method void mergeVerification()>
			stamper.close(moreInfo);
	//   10   22:aload_0         
	//   11   23:getfield        #38  <Field PdfStamperImp stamper>
	//   12   26:aload_0         
	//   13   27:getfield        #253 <Field Map moreInfo>
	//   14   30:invokevirtual   #256 <Method void PdfStamperImp.close(Map)>
			return;
	//   15   33:return          
		} else
		{
			throw new DocumentException("Signature defined. Must be closed in PdfSignatureAppearance.");
	//   16   34:new             #29  <Class DocumentException>
	//   17   37:dup             
	//   18   38:ldc2            #258 <String "Signature defined. Must be closed in PdfSignatureAppearance.">
	//   19   41:invokespecial   #260 <Method void DocumentException(String)>
	//   20   44:athrow          
		}
	}

	public void createXmpMetadata()
	{
		stamper.createXmpMetadata();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:invokevirtual   #263 <Method void PdfStamperImp.createXmpMetadata()>
	//    3    7:return          
	}

	public void flush()
	{
		try
		{
			stamper.alterContents();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:invokevirtual   #267 <Method void PdfStamperImp.alterContents()>
			stamper.pagesToContent.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field PdfStamperImp stamper>
	//    5   11:getfield        #271 <Field HashMap PdfStamperImp.pagesToContent>
	//    6   14:invokevirtual   #274 <Method void HashMap.clear()>
			return;
	//    7   17:return          
		}
		catch(IOException ioexception)
	//*   8   18:astore_1        
		{
			throw new ExceptionConverter(((Exception) (ioexception)));
	//    9   19:new             #276 <Class ExceptionConverter>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #279 <Method void ExceptionConverter(Exception)>
	//   13   27:athrow          
		}
	}

	public AcroFields getAcroFields()
	{
		return stamper.getAcroFields();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:invokevirtual   #283 <Method AcroFields PdfStamperImp.getAcroFields()>
	//    3    7:areturn         
	}

	public PdfImportedPage getImportedPage(PdfReader pdfreader, int i)
	{
		return stamper.getImportedPage(pdfreader, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #287 <Method PdfImportedPage PdfStamperImp.getImportedPage(PdfReader, int)>
	//    5    9:areturn         
	}

	public LtvVerification getLtvVerification()
	{
		if(verification == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #291 <Field LtvVerification verification>
	//*   2    4:ifnonnull       19
			verification = new LtvVerification(this);
	//    3    7:aload_0         
	//    4    8:new             #293 <Class LtvVerification>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #295 <Method void LtvVerification(PdfStamper)>
	//    8   16:putfield        #291 <Field LtvVerification verification>
		return verification;
	//    9   19:aload_0         
	//   10   20:getfield        #291 <Field LtvVerification verification>
	//   11   23:areturn         
	}

	public Map getMoreInfo()
	{
		return moreInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field Map moreInfo>
	//    2    4:areturn         
	}

	public PdfContentByte getOverContent(int i)
	{
		return stamper.getOverContent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #303 <Method PdfContentByte PdfStamperImp.getOverContent(int)>
	//    4    8:areturn         
	}

	public Map getPdfLayers()
	{
		return stamper.getPdfLayers();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:invokevirtual   #306 <Method Map PdfStamperImp.getPdfLayers()>
	//    3    7:areturn         
	}

	public PdfReader getReader()
	{
		return stamper.reader;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:getfield        #311 <Field PdfReader PdfStamperImp.reader>
	//    3    7:areturn         
	}

	public PdfSignatureAppearance getSignatureAppearance()
	{
		return sigApp;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field PdfSignatureAppearance sigApp>
	//    2    4:areturn         
	}

	public PdfContentByte getUnderContent(int i)
	{
		return stamper.getUnderContent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #316 <Method PdfContentByte PdfStamperImp.getUnderContent(int)>
	//    4    8:areturn         
	}

	public PdfWriter getWriter()
	{
		return ((PdfWriter) (stamper));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:areturn         
	}

	public XmlSignatureAppearance getXmlSignatureAppearance()
	{
		return sigXmlApp;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field XmlSignatureAppearance sigXmlApp>
	//    2    4:areturn         
	}

	public XmpWriter getXmpWriter()
	{
		return stamper.getXmpWriter();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:invokevirtual   #324 <Method XmpWriter PdfStamperImp.getXmpWriter()>
	//    3    7:areturn         
	}

	public void insertPage(int i, Rectangle rectangle)
	{
		stamper.insertPage(i, rectangle);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #328 <Method void PdfStamperImp.insertPage(int, Rectangle)>
	//    5    9:return          
	}

	public boolean isFullCompression()
	{
		return stamper.isFullCompression();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:invokevirtual   #331 <Method boolean PdfStamperImp.isFullCompression()>
	//    3    7:ireturn         
	}

	public boolean isRotateContents()
	{
		return stamper.isRotateContents();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:invokevirtual   #334 <Method boolean PdfStamperImp.isRotateContents()>
	//    3    7:ireturn         
	}

	public void makePackage(PdfName pdfname)
	{
		PdfCollection pdfcollection = new PdfCollection(0);
	//    0    0:new             #337 <Class PdfCollection>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #340 <Method void PdfCollection(int)>
	//    4    8:astore_2        
		pdfcollection.put(PdfName.VIEW, ((PdfObject) (pdfname)));
	//    5    9:aload_2         
	//    6   10:getstatic       #343 <Field PdfName PdfName.VIEW>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #345 <Method void PdfCollection.put(PdfName, PdfObject)>
		stamper.makePackage(pdfcollection);
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field PdfStamperImp stamper>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #348 <Method void PdfStamperImp.makePackage(PdfCollection)>
	//   13   25:return          
	}

	public void makePackage(PdfCollection pdfcollection)
	{
		stamper.makePackage(pdfcollection);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #348 <Method void PdfStamperImp.makePackage(PdfCollection)>
	//    4    8:return          
	}

	public void markUsed(PdfObject pdfobject)
	{
		stamper.markUsed(pdfobject);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #104 <Method void PdfStamperImp.markUsed(PdfObject)>
	//    4    8:return          
	}

	void mergeVerification()
		throws IOException
	{
		if(verification == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #291 <Field LtvVerification verification>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			verification.merge();
	//    4    8:aload_0         
	//    5    9:getfield        #291 <Field LtvVerification verification>
	//    6   12:invokevirtual   #351 <Method void LtvVerification.merge()>
			return;
	//    7   15:return          
		}
	}

	public boolean partialFormFlattening(String s)
	{
		return stamper.partialFormFlattening(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #354 <Method boolean PdfStamperImp.partialFormFlattening(String)>
	//    4    8:ireturn         
	}

	public void replacePage(PdfReader pdfreader, int i, int j)
	{
		stamper.replacePage(pdfreader, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #358 <Method void PdfStamperImp.replacePage(PdfReader, int, int)>
	//    6   10:return          
	}

	public void setAnnotationFlattening(boolean flag)
	{
		stamper.setFlatAnnotations(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #363 <Method void PdfStamperImp.setFlatAnnotations(boolean)>
	//    4    8:return          
	}

	public void setDuration(int i, int j)
	{
		stamper.setDuration(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #367 <Method void PdfStamperImp.setDuration(int, int)>
	//    5    9:return          
	}

	public void setEncryption(int i, String s, String s1, int j)
		throws DocumentException
	{
		setEncryption(DocWriter.getISOBytes(s), DocWriter.getISOBytes(s1), j, i);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #375 <Method byte[] DocWriter.getISOBytes(String)>
	//    3    5:aload_3         
	//    4    6:invokestatic    #375 <Method byte[] DocWriter.getISOBytes(String)>
	//    5    9:iload           4
	//    6   11:iload_1         
	//    7   12:invokevirtual   #378 <Method void setEncryption(byte[], byte[], int, int)>
	//    8   15:return          
	}

	public void setEncryption(boolean flag, String s, String s1, int i)
		throws DocumentException
	{
		setEncryption(DocWriter.getISOBytes(s), DocWriter.getISOBytes(s1), i, flag);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #375 <Method byte[] DocWriter.getISOBytes(String)>
	//    3    5:aload_3         
	//    4    6:invokestatic    #375 <Method byte[] DocWriter.getISOBytes(String)>
	//    5    9:iload           4
	//    6   11:iload_1         
	//    7   12:invokevirtual   #382 <Method void setEncryption(byte[], byte[], int, boolean)>
	//    8   15:return          
	}

	public void setEncryption(byte abyte0[], byte abyte1[], int i, int j)
		throws DocumentException
	{
		if(stamper.isAppend())
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field PdfStamperImp stamper>
	//*   2    4:invokevirtual   #385 <Method boolean PdfStamperImp.isAppend()>
	//*   3    7:ifeq            28
			throw new DocumentException(MessageLocalization.getComposedMessage("append.mode.does.not.support.changing.the.encryption.status", new Object[0]));
	//    4   10:new             #29  <Class DocumentException>
	//    5   13:dup             
	//    6   14:ldc2            #387 <String "append.mode.does.not.support.changing.the.encryption.status">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #393 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #260 <Method void DocumentException(String)>
	//   11   27:athrow          
		if(stamper.isContentWritten())
	//*  12   28:aload_0         
	//*  13   29:getfield        #38  <Field PdfStamperImp stamper>
	//*  14   32:invokevirtual   #396 <Method boolean PdfStamperImp.isContentWritten()>
	//*  15   35:ifeq            56
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("content.was.already.written.to.the.output", new Object[0]));
	//   16   38:new             #29  <Class DocumentException>
	//   17   41:dup             
	//   18   42:ldc2            #398 <String "content.was.already.written.to.the.output">
	//   19   45:iconst_0        
	//   20   46:anewarray       Object[]
	//   21   49:invokestatic    #393 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   22   52:invokespecial   #260 <Method void DocumentException(String)>
	//   23   55:athrow          
		} else
		{
			stamper.setEncryption(abyte0, abyte1, i, j);
	//   24   56:aload_0         
	//   25   57:getfield        #38  <Field PdfStamperImp stamper>
	//   26   60:aload_1         
	//   27   61:aload_2         
	//   28   62:iload_3         
	//   29   63:iload           4
	//   30   65:invokevirtual   #399 <Method void PdfStamperImp.setEncryption(byte[], byte[], int, int)>
			return;
	//   31   68:return          
		}
	}

	public void setEncryption(byte abyte0[], byte abyte1[], int i, boolean flag)
		throws DocumentException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(stamper.isAppend())
	//*   2    3:aload_0         
	//*   3    4:getfield        #38  <Field PdfStamperImp stamper>
	//*   4    7:invokevirtual   #385 <Method boolean PdfStamperImp.isAppend()>
	//*   5   10:ifeq            31
			throw new DocumentException(MessageLocalization.getComposedMessage("append.mode.does.not.support.changing.the.encryption.status", new Object[0]));
	//    6   13:new             #29  <Class DocumentException>
	//    7   16:dup             
	//    8   17:ldc2            #387 <String "append.mode.does.not.support.changing.the.encryption.status">
	//    9   20:iconst_0        
	//   10   21:anewarray       Object[]
	//   11   24:invokestatic    #393 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   12   27:invokespecial   #260 <Method void DocumentException(String)>
	//   13   30:athrow          
		if(stamper.isContentWritten())
	//*  14   31:aload_0         
	//*  15   32:getfield        #38  <Field PdfStamperImp stamper>
	//*  16   35:invokevirtual   #396 <Method boolean PdfStamperImp.isContentWritten()>
	//*  17   38:ifeq            59
			throw new DocumentException(MessageLocalization.getComposedMessage("content.was.already.written.to.the.output", new Object[0]));
	//   18   41:new             #29  <Class DocumentException>
	//   19   44:dup             
	//   20   45:ldc2            #398 <String "content.was.already.written.to.the.output">
	//   21   48:iconst_0        
	//   22   49:anewarray       Object[]
	//   23   52:invokestatic    #393 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   24   55:invokespecial   #260 <Method void DocumentException(String)>
	//   25   58:athrow          
		PdfStamperImp pdfstamperimp = stamper;
	//   26   59:aload_0         
	//   27   60:getfield        #38  <Field PdfStamperImp stamper>
	//   28   63:astore          6
		if(flag)
	//*  29   65:iload           4
	//*  30   67:ifeq            73
			j = 1;
	//   31   70:iconst_1        
	//   32   71:istore          5
		pdfstamperimp.setEncryption(abyte0, abyte1, i, j);
	//   33   73:aload           6
	//   34   75:aload_1         
	//   35   76:aload_2         
	//   36   77:iload_3         
	//   37   78:iload           5
	//   38   80:invokevirtual   #399 <Method void PdfStamperImp.setEncryption(byte[], byte[], int, int)>
	//   39   83:return          
	}

	public void setEncryption(Certificate acertificate[], int ai[], int i)
		throws DocumentException
	{
		if(stamper.isAppend())
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field PdfStamperImp stamper>
	//*   2    4:invokevirtual   #385 <Method boolean PdfStamperImp.isAppend()>
	//*   3    7:ifeq            28
			throw new DocumentException(MessageLocalization.getComposedMessage("append.mode.does.not.support.changing.the.encryption.status", new Object[0]));
	//    4   10:new             #29  <Class DocumentException>
	//    5   13:dup             
	//    6   14:ldc2            #387 <String "append.mode.does.not.support.changing.the.encryption.status">
	//    7   17:iconst_0        
	//    8   18:anewarray       Object[]
	//    9   21:invokestatic    #393 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   10   24:invokespecial   #260 <Method void DocumentException(String)>
	//   11   27:athrow          
		if(stamper.isContentWritten())
	//*  12   28:aload_0         
	//*  13   29:getfield        #38  <Field PdfStamperImp stamper>
	//*  14   32:invokevirtual   #396 <Method boolean PdfStamperImp.isContentWritten()>
	//*  15   35:ifeq            56
		{
			throw new DocumentException(MessageLocalization.getComposedMessage("content.was.already.written.to.the.output", new Object[0]));
	//   16   38:new             #29  <Class DocumentException>
	//   17   41:dup             
	//   18   42:ldc2            #398 <String "content.was.already.written.to.the.output">
	//   19   45:iconst_0        
	//   20   46:anewarray       Object[]
	//   21   49:invokestatic    #393 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   22   52:invokespecial   #260 <Method void DocumentException(String)>
	//   23   55:athrow          
		} else
		{
			stamper.setEncryption(acertificate, ai, i);
	//   24   56:aload_0         
	//   25   57:getfield        #38  <Field PdfStamperImp stamper>
	//   26   60:aload_1         
	//   27   61:aload_2         
	//   28   62:iload_3         
	//   29   63:invokevirtual   #402 <Method void PdfStamperImp.setEncryption(Certificate[], int[], int)>
			return;
	//   30   66:return          
		}
	}

	public void setFormFlattening(boolean flag)
	{
		stamper.setFormFlattening(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #405 <Method void PdfStamperImp.setFormFlattening(boolean)>
	//    4    8:return          
	}

	public void setFreeTextFlattening(boolean flag)
	{
		stamper.setFreeTextFlattening(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #408 <Method void PdfStamperImp.setFreeTextFlattening(boolean)>
	//    4    8:return          
	}

	public void setFullCompression()
		throws DocumentException
	{
		if(stamper.isAppend())
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field PdfStamperImp stamper>
	//*   2    4:invokevirtual   #385 <Method boolean PdfStamperImp.isAppend()>
	//*   3    7:ifeq            11
		{
			return;
	//    4   10:return          
		} else
		{
			stamper.fullCompression = true;
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field PdfStamperImp stamper>
	//    7   15:iconst_1        
	//    8   16:putfield        #412 <Field boolean PdfStamperImp.fullCompression>
			stamper.setAtLeastPdfVersion('5');
	//    9   19:aload_0         
	//   10   20:getfield        #38  <Field PdfStamperImp stamper>
	//   11   23:bipush          53
	//   12   25:invokevirtual   #416 <Method void PdfStamperImp.setAtLeastPdfVersion(char)>
			return;
	//   13   28:return          
		}
	}

	public void setMoreInfo(Map map)
	{
		moreInfo = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #253 <Field Map moreInfo>
	//    3    5:return          
	}

	public void setOutlines(List list)
	{
		stamper.setOutlines(list);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #422 <Method void PdfStamperImp.setOutlines(List)>
	//    4    8:return          
	}

	public void setPageAction(PdfName pdfname, PdfAction pdfaction, int i)
		throws PdfException
	{
		stamper.setPageAction(pdfname, pdfaction, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #429 <Method void PdfStamperImp.setPageAction(PdfName, PdfAction, int)>
	//    6   10:return          
	}

	public void setRotateContents(boolean flag)
	{
		stamper.setRotateContents(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #432 <Method void PdfStamperImp.setRotateContents(boolean)>
	//    4    8:return          
	}

	public void setThumbnail(Image image, int i)
		throws PdfException, DocumentException
	{
		stamper.setThumbnail(image, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #436 <Method void PdfStamperImp.setThumbnail(Image, int)>
	//    5    9:return          
	}

	public void setTransition(PdfTransition pdftransition, int i)
	{
		stamper.setTransition(pdftransition, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #440 <Method void PdfStamperImp.setTransition(PdfTransition, int)>
	//    5    9:return          
	}

	public void setViewerPreferences(int i)
	{
		stamper.setViewerPreferences(i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #443 <Method void PdfStamperImp.setViewerPreferences(int)>
	//    4    8:return          
	}

	public void setXmpMetadata(byte abyte0[])
	{
		stamper.setXmpMetadata(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamperImp stamper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #447 <Method void PdfStamperImp.setXmpMetadata(byte[])>
	//    4    8:return          
	}

	protected boolean hasSignature;
	private Map moreInfo;
	protected PdfSignatureAppearance sigApp;
	protected XmlSignatureAppearance sigXmlApp;
	protected PdfStamperImp stamper;
	private LtvVerification verification;
}
