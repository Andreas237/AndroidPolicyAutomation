// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.consent;

import android.text.format.DateFormat;
import com.itextpdf.text.DocumentException;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.pdf.PdfGenerator;
import com.pactforcure.app.studies.Res;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.researchstack.backbone.model.ConsentDocument;

public class ConsentPdfFactory
{

	public ConsentPdfFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static String appendCurrentDate(String s)
	{
		Date date = new Date();
	//    0    0:new             #20  <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Date()>
	//    3    7:astore_1        
		return s.replace("#CURRENT_DATE", ((CharSequence) (DateFormat.getDateFormat(((android.content.Context) (BackboneApplication.get()))).format(date))));
	//    4    8:aload_0         
	//    5    9:ldc1            #23  <String "#CURRENT_DATE">
	//    6   11:invokestatic    #29  <Method BackboneApplication BackboneApplication.get()>
	//    7   14:invokestatic    #35  <Method java.text.DateFormat DateFormat.getDateFormat(android.content.Context)>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #41  <Method String java.text.DateFormat.format(Date)>
	//   10   21:invokevirtual   #47  <Method String String.replace(CharSequence, CharSequence)>
	//   11   24:areturn         
	}

	private static String appendName(String s, String s1)
	{
		return s.replace("#PARTICIPANT_NAME", ((CharSequence) (s1)));
	//    0    0:aload_0         
	//    1    1:ldc1            #51  <String "#PARTICIPANT_NAME">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #47  <Method String String.replace(CharSequence, CharSequence)>
	//    4    7:areturn         
	}

	private static String appendSignature(String s, String s1)
	{
		return s.replace("#PARTICIPANT_SIGNATURE_DATA", ((CharSequence) (s1)));
	//    0    0:aload_0         
	//    1    1:ldc1            #54  <String "#PARTICIPANT_SIGNATURE_DATA">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #47  <Method String String.replace(CharSequence, CharSequence)>
	//    4    7:areturn         
	}

	public static void genConsentPdf(ConsentDocument consentdocument, String s, String s1, String s2)
		throws IOException, DocumentException, CssResolverException
	{
		File file = BackboneApplication.get().getFilesDir();
	//    0    0:invokestatic    #29  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:invokevirtual   #66  <Method File BackboneApplication.getFilesDir()>
	//    2    6:astore          4
		consentdocument = ((ConsentDocument) (consentdocument.getHtmlReviewContent()));
	//    3    8:aload_0         
	//    4    9:invokevirtual   #72  <Method String ConsentDocument.getHtmlReviewContent()>
	//    5   12:astore_0        
		String s3 = Res.getStudySpecificRawAsString(0x7f07000c);
	//    6   13:ldc1            #73  <Int 0x7f07000c>
	//    7   15:invokestatic    #79  <Method String Res.getStudySpecificRawAsString(int)>
	//    8   18:astore          5
		consentdocument = ((ConsentDocument) ((new StringBuilder()).append(((String) (consentdocument))).append(s3).toString()));
	//    9   20:new             #81  <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #82  <Method void StringBuilder()>
	//   12   27:aload_0         
	//   13   28:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload           5
	//   15   33:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   16   36:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   17   39:astore_0        
		s3 = Res.getRegularRawAsString(0x7f07000d);
	//   18   40:ldc1            #90  <Int 0x7f07000d>
	//   19   42:invokestatic    #93  <Method String Res.getRegularRawAsString(int)>
	//   20   45:astore          5
		PdfGenerator.genPdfFromHtmlAndCss(appendCurrentDate(appendSignature(appendName(((String) (consentdocument)), s), s1)), s3, new File(file, s2));
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:invokestatic    #95  <Method String appendName(String, String)>
	//   24   52:aload_2         
	//   25   53:invokestatic    #97  <Method String appendSignature(String, String)>
	//   26   56:invokestatic    #99  <Method String appendCurrentDate(String)>
	//   27   59:aload           5
	//   28   61:new             #101 <Class File>
	//   29   64:dup             
	//   30   65:aload           4
	//   31   67:aload_3         
	//   32   68:invokespecial   #104 <Method void File(File, String)>
	//   33   71:invokestatic    #110 <Method void PdfGenerator.genPdfFromHtmlAndCss(String, String, File)>
	//   34   74:return          
	}

	private static String removeRemoveMeParts(String s)
	{
		return s.replaceAll("<\\w+ class=\"remove_me\">.*</\\w+>", "");
	//    0    0:aload_0         
	//    1    1:ldc1            #114 <String "<\\w+ class=\"remove_me\">.*</\\w+>">
	//    2    3:ldc1            #116 <String "">
	//    3    5:invokevirtual   #119 <Method String String.replaceAll(String, String)>
	//    4    8:areturn         
	}

	public static final String CONSENT_PDF_FILENAME = "general_consent.pdf";
	public static final String DNA_CONSENT_PDF_FILENAME = "dna_consent.pdf";
}
