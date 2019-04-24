// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.security.XmlLocator;
import com.itextpdf.text.pdf.security.XpathConstructor;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Calendar;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStamper, PdfStamperImp

public class XmlSignatureAppearance
{

	XmlSignatureAppearance(PdfStamperImp pdfstamperimp)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mimeType = "text/xml";
	//    2    4:aload_0         
	//    3    5:ldc1            #26  <String "text/xml">
	//    4    7:putfield        #28  <Field String mimeType>
		writer = pdfstamperimp;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #30  <Field PdfStamperImp writer>
	//    8   15:return          
	}

	public void close()
		throws IOException, DocumentException
	{
		writer.close(stamper.getMoreInfo());
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field PdfStamperImp writer>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field PdfStamper stamper>
	//    4    8:invokevirtual   #44  <Method java.util.Map PdfStamper.getMoreInfo()>
	//    5   11:invokevirtual   #49  <Method void PdfStamperImp.close(java.util.Map)>
	//    6   14:return          
	}

	public Certificate getCertificate()
	{
		return signCertificate;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Certificate signCertificate>
	//    2    4:areturn         
	}

	public String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String description>
	//    2    4:areturn         
	}

	public String getMimeType()
	{
		return mimeType;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String mimeType>
	//    2    4:areturn         
	}

	public Calendar getSignDate()
	{
		if(signDate == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field Calendar signDate>
	//*   2    4:ifnonnull       14
			signDate = Calendar.getInstance();
	//    3    7:aload_0         
	//    4    8:invokestatic    #68  <Method Calendar Calendar.getInstance()>
	//    5   11:putfield        #63  <Field Calendar signDate>
		return signDate;
	//    6   14:aload_0         
	//    7   15:getfield        #63  <Field Calendar signDate>
	//    8   18:areturn         
	}

	public PdfStamper getStamper()
	{
		return stamper;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PdfStamper stamper>
	//    2    4:areturn         
	}

	public PdfStamperImp getWriter()
	{
		return writer;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field PdfStamperImp writer>
	//    2    4:areturn         
	}

	public XmlLocator getXmlLocator()
	{
		return xmlLocator;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field XmlLocator xmlLocator>
	//    2    4:areturn         
	}

	public XpathConstructor getXpathConstructor()
	{
		return xpathConstructor;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field XpathConstructor xpathConstructor>
	//    2    4:areturn         
	}

	public void setCertificate(Certificate certificate)
	{
		signCertificate = certificate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field Certificate signCertificate>
	//    3    5:return          
	}

	public void setDescription(String s)
	{
		description = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String description>
	//    3    5:return          
	}

	public void setMimeType(String s)
	{
		mimeType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String mimeType>
	//    3    5:return          
	}

	public void setSignDate(Calendar calendar)
	{
		signDate = calendar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field Calendar signDate>
	//    3    5:return          
	}

	public void setStamper(PdfStamper pdfstamper)
	{
		stamper = pdfstamper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field PdfStamper stamper>
	//    3    5:return          
	}

	public void setXmlLocator(XmlLocator xmllocator)
	{
		xmlLocator = xmllocator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field XmlLocator xmlLocator>
	//    3    5:return          
	}

	public void setXpathConstructor(XpathConstructor xpathconstructor)
	{
		xpathConstructor = xpathconstructor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field XpathConstructor xpathConstructor>
	//    3    5:return          
	}

	private String description;
	private String mimeType;
	private Certificate signCertificate;
	private Calendar signDate;
	private PdfStamper stamper;
	private PdfStamperImp writer;
	private XmlLocator xmlLocator;
	private XpathConstructor xpathConstructor;
}
