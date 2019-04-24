// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.Utilities;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.*;
import org.spongycastle.asn1.*;
import org.spongycastle.asn1.ocsp.OCSPObjectIdentifiers;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			PdfPKCS7, OcspClient, CrlClient

public class LtvVerification
{
	public static final class CertificateInclusion extends Enum
	{

		public static CertificateInclusion valueOf(String s)
		{
			return (CertificateInclusion)Enum.valueOf(com/itextpdf/text/pdf/security/LtvVerification$CertificateInclusion, s);
		//    0    0:ldc1            #2   <Class LtvVerification$CertificateInclusion>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LtvVerification$CertificateInclusion>
		//    4    9:areturn         
		}

		public static CertificateInclusion[] values()
		{
			return (CertificateInclusion[])((CertificateInclusion []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field LtvVerification$CertificateInclusion[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.itextpdf.text.pdf.security.LtvVerification$CertificateInclusion_3B_.clone()>
		//    2    6:checkcast       #38  <Class LtvVerification$CertificateInclusion[]>
		//    3    9:areturn         
		}

		private static final CertificateInclusion $VALUES[];
		public static final CertificateInclusion NO;
		public static final CertificateInclusion YES;

		static 
		{
			YES = new CertificateInclusion("YES", 0);
		//    0    0:new             #2   <Class LtvVerification$CertificateInclusion>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "YES">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void LtvVerification$CertificateInclusion(String, int)>
		//    5   10:putstatic       #22  <Field LtvVerification$CertificateInclusion YES>
			NO = new CertificateInclusion("NO", 1);
		//    6   13:new             #2   <Class LtvVerification$CertificateInclusion>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "NO">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void LtvVerification$CertificateInclusion(String, int)>
		//   11   23:putstatic       #25  <Field LtvVerification$CertificateInclusion NO>
			$VALUES = (new CertificateInclusion[] {
				YES, NO
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       CertificateInclusion[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field LtvVerification$CertificateInclusion YES>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field LtvVerification$CertificateInclusion NO>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field LtvVerification$CertificateInclusion[] $VALUES>
		//*  23   45:return          
		}

		private CertificateInclusion(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class CertificateOption extends Enum
	{

		public static CertificateOption valueOf(String s)
		{
			return (CertificateOption)Enum.valueOf(com/itextpdf/text/pdf/security/LtvVerification$CertificateOption, s);
		//    0    0:ldc1            #2   <Class LtvVerification$CertificateOption>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LtvVerification$CertificateOption>
		//    4    9:areturn         
		}

		public static CertificateOption[] values()
		{
			return (CertificateOption[])((CertificateOption []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field LtvVerification$CertificateOption[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.itextpdf.text.pdf.security.LtvVerification$CertificateOption_3B_.clone()>
		//    2    6:checkcast       #38  <Class LtvVerification$CertificateOption[]>
		//    3    9:areturn         
		}

		private static final CertificateOption $VALUES[];
		public static final CertificateOption SIGNING_CERTIFICATE;
		public static final CertificateOption WHOLE_CHAIN;

		static 
		{
			SIGNING_CERTIFICATE = new CertificateOption("SIGNING_CERTIFICATE", 0);
		//    0    0:new             #2   <Class LtvVerification$CertificateOption>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "SIGNING_CERTIFICATE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void LtvVerification$CertificateOption(String, int)>
		//    5   10:putstatic       #22  <Field LtvVerification$CertificateOption SIGNING_CERTIFICATE>
			WHOLE_CHAIN = new CertificateOption("WHOLE_CHAIN", 1);
		//    6   13:new             #2   <Class LtvVerification$CertificateOption>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "WHOLE_CHAIN">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void LtvVerification$CertificateOption(String, int)>
		//   11   23:putstatic       #25  <Field LtvVerification$CertificateOption WHOLE_CHAIN>
			$VALUES = (new CertificateOption[] {
				SIGNING_CERTIFICATE, WHOLE_CHAIN
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       CertificateOption[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field LtvVerification$CertificateOption SIGNING_CERTIFICATE>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field LtvVerification$CertificateOption WHOLE_CHAIN>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field LtvVerification$CertificateOption[] $VALUES>
		//*  23   45:return          
		}

		private CertificateOption(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class Level extends Enum
	{

		public static Level valueOf(String s)
		{
			return (Level)Enum.valueOf(com/itextpdf/text/pdf/security/LtvVerification$Level, s);
		//    0    0:ldc1            #2   <Class LtvVerification$Level>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LtvVerification$Level>
		//    4    9:areturn         
		}

		public static Level[] values()
		{
			return (Level[])((Level []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field LtvVerification$Level[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.security.LtvVerification$Level_3B_.clone()>
		//    2    6:checkcast       #46  <Class LtvVerification$Level[]>
		//    3    9:areturn         
		}

		private static final Level $VALUES[];
		public static final Level CRL;
		public static final Level OCSP;
		public static final Level OCSP_CRL;
		public static final Level OCSP_OPTIONAL_CRL;

		static 
		{
			OCSP = new Level("OCSP", 0);
		//    0    0:new             #2   <Class LtvVerification$Level>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "OCSP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void LtvVerification$Level(String, int)>
		//    5   10:putstatic       #24  <Field LtvVerification$Level OCSP>
			CRL = new Level("CRL", 1);
		//    6   13:new             #2   <Class LtvVerification$Level>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "CRL">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void LtvVerification$Level(String, int)>
		//   11   23:putstatic       #27  <Field LtvVerification$Level CRL>
			OCSP_CRL = new Level("OCSP_CRL", 2);
		//   12   26:new             #2   <Class LtvVerification$Level>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "OCSP_CRL">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void LtvVerification$Level(String, int)>
		//   17   36:putstatic       #30  <Field LtvVerification$Level OCSP_CRL>
			OCSP_OPTIONAL_CRL = new Level("OCSP_OPTIONAL_CRL", 3);
		//   18   39:new             #2   <Class LtvVerification$Level>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "OCSP_OPTIONAL_CRL">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void LtvVerification$Level(String, int)>
		//   23   49:putstatic       #33  <Field LtvVerification$Level OCSP_OPTIONAL_CRL>
			$VALUES = (new Level[] {
				OCSP, CRL, OCSP_CRL, OCSP_OPTIONAL_CRL
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       Level[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field LtvVerification$Level OCSP>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field LtvVerification$Level CRL>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field LtvVerification$Level OCSP_CRL>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field LtvVerification$Level OCSP_OPTIONAL_CRL>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field LtvVerification$Level[] $VALUES>
		//*  43   83:return          
		}

		private Level(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static class ValidationData
	{

		public List certs;
		public List crls;
		public List ocsps;

		private ValidationData()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			crls = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #18  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void ArrayList()>
		//    6   12:putfield        #21  <Field List crls>
			ocsps = ((List) (new ArrayList()));
		//    7   15:aload_0         
		//    8   16:new             #18  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #19  <Method void ArrayList()>
		//   11   23:putfield        #23  <Field List ocsps>
			certs = ((List) (new ArrayList()));
		//   12   26:aload_0         
		//   13   27:new             #18  <Class ArrayList>
		//   14   30:dup             
		//   15   31:invokespecial   #19  <Method void ArrayList()>
		//   16   34:putfield        #25  <Field List certs>
		//   17   37:return          
		}

	}


	public LtvVerification(PdfStamper pdfstamper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/security/LtvVerification);
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class LtvVerification>
	//    4    7:invokestatic    #44  <Method Logger LoggerFactory.getLogger(Class)>
	//    5   10:putfield        #46  <Field Logger LOGGER>
		validated = ((Map) (new HashMap()));
	//    6   13:aload_0         
	//    7   14:new             #48  <Class HashMap>
	//    8   17:dup             
	//    9   18:invokespecial   #49  <Method void HashMap()>
	//   10   21:putfield        #51  <Field Map validated>
		used = false;
	//   11   24:aload_0         
	//   12   25:iconst_0        
	//   13   26:putfield        #53  <Field boolean used>
		stp = pdfstamper;
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:putfield        #55  <Field PdfStamper stp>
		writer = pdfstamper.getWriter();
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #61  <Method PdfWriter PdfStamper.getWriter()>
	//   20   39:putfield        #63  <Field PdfWriter writer>
		reader = pdfstamper.getReader();
	//   21   42:aload_0         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #67  <Method PdfReader PdfStamper.getReader()>
	//   24   47:putfield        #69  <Field PdfReader reader>
		acroFields = pdfstamper.getAcroFields();
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:invokevirtual   #73  <Method AcroFields PdfStamper.getAcroFields()>
	//   28   55:putfield        #75  <Field AcroFields acroFields>
	//   29   58:return          
	}

	private static byte[] buildOCSPResponse(byte abyte0[])
		throws IOException
	{
		Object obj = ((Object) (new DEROctetString(abyte0)));
	//    0    0:new             #82  <Class DEROctetString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #85  <Method void DEROctetString(byte[])>
	//    4    8:astore_1        
		abyte0 = ((byte []) (new ASN1EncodableVector()));
	//    5    9:new             #87  <Class ASN1EncodableVector>
	//    6   12:dup             
	//    7   13:invokespecial   #88  <Method void ASN1EncodableVector()>
	//    8   16:astore_0        
		((ASN1EncodableVector) (abyte0)).add(((org.spongycastle.asn1.ASN1Encodable) (OCSPObjectIdentifiers.id_pkix_ocsp_basic)));
	//    9   17:aload_0         
	//   10   18:getstatic       #94  <Field org.spongycastle.asn1.ASN1ObjectIdentifier OCSPObjectIdentifiers.id_pkix_ocsp_basic>
	//   11   21:invokevirtual   #98  <Method void ASN1EncodableVector.add(org.spongycastle.asn1.ASN1Encodable)>
		((ASN1EncodableVector) (abyte0)).add(((org.spongycastle.asn1.ASN1Encodable) (obj)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #98  <Method void ASN1EncodableVector.add(org.spongycastle.asn1.ASN1Encodable)>
		obj = ((Object) (new ASN1Enumerated(0)));
	//   15   29:new             #100 <Class ASN1Enumerated>
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:invokespecial   #103 <Method void ASN1Enumerated(int)>
	//   19   37:astore_1        
		ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
	//   20   38:new             #87  <Class ASN1EncodableVector>
	//   21   41:dup             
	//   22   42:invokespecial   #88  <Method void ASN1EncodableVector()>
	//   23   45:astore_2        
		asn1encodablevector.add(((org.spongycastle.asn1.ASN1Encodable) (obj)));
	//   24   46:aload_2         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #98  <Method void ASN1EncodableVector.add(org.spongycastle.asn1.ASN1Encodable)>
		asn1encodablevector.add(((org.spongycastle.asn1.ASN1Encodable) (new DERTaggedObject(true, 0, ((org.spongycastle.asn1.ASN1Encodable) (new DERSequence(((ASN1EncodableVector) (abyte0)))))))));
	//   27   51:aload_2         
	//   28   52:new             #105 <Class DERTaggedObject>
	//   29   55:dup             
	//   30   56:iconst_1        
	//   31   57:iconst_0        
	//   32   58:new             #107 <Class DERSequence>
	//   33   61:dup             
	//   34   62:aload_0         
	//   35   63:invokespecial   #110 <Method void DERSequence(ASN1EncodableVector)>
	//   36   66:invokespecial   #113 <Method void DERTaggedObject(boolean, int, org.spongycastle.asn1.ASN1Encodable)>
	//   37   69:invokevirtual   #98  <Method void ASN1EncodableVector.add(org.spongycastle.asn1.ASN1Encodable)>
		return (new DERSequence(asn1encodablevector)).getEncoded();
	//   38   72:new             #107 <Class DERSequence>
	//   39   75:dup             
	//   40   76:aload_2         
	//   41   77:invokespecial   #110 <Method void DERSequence(ASN1EncodableVector)>
	//   42   80:invokevirtual   #117 <Method byte[] DERSequence.getEncoded()>
	//   43   83:areturn         
	}

	private void createDss()
		throws IOException
	{
		outputDss(new PdfDictionary(), new PdfDictionary(), new PdfArray(), new PdfArray(), new PdfArray());
	//    0    0:aload_0         
	//    1    1:new             #121 <Class PdfDictionary>
	//    2    4:dup             
	//    3    5:invokespecial   #122 <Method void PdfDictionary()>
	//    4    8:new             #121 <Class PdfDictionary>
	//    5   11:dup             
	//    6   12:invokespecial   #122 <Method void PdfDictionary()>
	//    7   15:new             #124 <Class PdfArray>
	//    8   18:dup             
	//    9   19:invokespecial   #125 <Method void PdfArray()>
	//   10   22:new             #124 <Class PdfArray>
	//   11   25:dup             
	//   12   26:invokespecial   #125 <Method void PdfArray()>
	//   13   29:new             #124 <Class PdfArray>
	//   14   32:dup             
	//   15   33:invokespecial   #125 <Method void PdfArray()>
	//   16   36:invokespecial   #129 <Method void outputDss(PdfDictionary, PdfDictionary, PdfArray, PdfArray, PdfArray)>
	//   17   39:return          
	}

	private static void deleteOldReferences(PdfArray pdfarray, PdfArray pdfarray1)
	{
		if(pdfarray != null && pdfarray1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       9
	//*   4    8:return          
		{
			pdfarray1 = ((PdfArray) (pdfarray1.iterator()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #135 <Method Iterator PdfArray.iterator()>
	//    7   13:astore_1        
			while(((Iterator) (pdfarray1)).hasNext()) 
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            8
			{
				Object obj = ((Object) ((PdfObject)((Iterator) (pdfarray1)).next()));
	//   11   23:aload_1         
	//   12   24:invokeinterface #145 <Method Object Iterator.next()>
	//   13   29:checkcast       #147 <Class PdfObject>
	//   14   32:astore          4
				if(((PdfObject) (obj)).isIndirect())
	//*  15   34:aload           4
	//*  16   36:invokevirtual   #150 <Method boolean PdfObject.isIndirect()>
	//*  17   39:ifeq            14
				{
					obj = ((Object) ((PRIndirectReference)obj));
	//   18   42:aload           4
	//   19   44:checkcast       #152 <Class PRIndirectReference>
	//   20   47:astore          4
					int i = 0;
	//   21   49:iconst_0        
	//   22   50:istore_2        
					while(i < pdfarray.size()) 
	//*  23   51:iload_2         
	//*  24   52:aload_0         
	//*  25   53:invokevirtual   #156 <Method int PdfArray.size()>
	//*  26   56:icmpge          14
					{
						Object obj1 = ((Object) (pdfarray.getPdfObject(i)));
	//   27   59:aload_0         
	//   28   60:iload_2         
	//   29   61:invokevirtual   #160 <Method PdfObject PdfArray.getPdfObject(int)>
	//   30   64:astore          5
						int j;
						if(!((PdfObject) (obj1)).isIndirect())
	//*  31   66:aload           5
	//*  32   68:invokevirtual   #150 <Method boolean PdfObject.isIndirect()>
	//*  33   71:ifne            83
						{
							j = i;
	//   34   74:iload_2         
	//   35   75:istore_3        
						} else
	//*  36   76:iload_3         
	//*  37   77:iconst_1        
	//*  38   78:iadd            
	//*  39   79:istore_2        
	//*  40   80:goto            51
						{
							obj1 = ((Object) ((PRIndirectReference)obj1));
	//   41   83:aload           5
	//   42   85:checkcast       #152 <Class PRIndirectReference>
	//   43   88:astore          5
							j = i;
	//   44   90:iload_2         
	//   45   91:istore_3        
							if(((PRIndirectReference) (obj)).getNumber() == ((PRIndirectReference) (obj1)).getNumber())
	//*  46   92:aload           4
	//*  47   94:invokevirtual   #163 <Method int PRIndirectReference.getNumber()>
	//*  48   97:aload           5
	//*  49   99:invokevirtual   #163 <Method int PRIndirectReference.getNumber()>
	//*  50  102:icmpne          76
							{
								pdfarray.remove(i);
	//   51  105:aload_0         
	//   52  106:iload_2         
	//   53  107:invokevirtual   #166 <Method PdfObject PdfArray.remove(int)>
	//   54  110:pop             
								j = i - 1;
	//   55  111:iload_2         
	//   56  112:iconst_1        
	//   57  113:isub            
	//   58  114:istore_3        
							}
						}
						i = j + 1;
					}
				}
			}
		}
	//*  59  115:goto            76
	}

	private X509Certificate getParent(X509Certificate x509certificate, Certificate acertificate[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
_L5:
		if(i >= acertificate.length) goto _L2; else goto _L1
	//    2    2:iload_3         
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:icmpge          52
_L1:
		X509Certificate x509certificate1 = (X509Certificate)acertificate[i];
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:aaload          
	//    9   11:checkcast       #172 <Class X509Certificate>
	//   10   14:astore          4
		if(x509certificate.getIssuerDN().equals(((Object) (x509certificate1.getSubjectDN())))) goto _L4; else goto _L3
	//   11   16:aload_1         
	//   12   17:invokevirtual   #176 <Method Principal X509Certificate.getIssuerDN()>
	//   13   20:aload           4
	//   14   22:invokevirtual   #179 <Method Principal X509Certificate.getSubjectDN()>
	//   15   25:invokeinterface #185 <Method boolean Principal.equals(Object)>
	//   16   30:ifne            40
_L3:
		i++;
	//   17   33:iload_3         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_3        
		  goto _L5
	//*  21   37:goto            2
_L4:
		x509certificate.verify(x509certificate1.getPublicKey());
	//   22   40:aload_1         
	//   23   41:aload           4
	//   24   43:invokevirtual   #189 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   25   46:invokevirtual   #193 <Method void X509Certificate.verify(java.security.PublicKey)>
		return x509certificate1;
	//   26   49:aload           4
	//   27   51:areturn         
_L2:
		return null;
	//   28   52:aconst_null     
	//   29   53:areturn         
		Exception exception;
		exception;
	//   30   54:astore          4
		  goto _L3
	//*  31   56:goto            33
	}

	private PdfName getSignatureHashKey(String s)
		throws NoSuchAlgorithmException, IOException
	{
		PdfDictionary pdfdictionary = acroFields.getSignatureDictionary(s);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field AcroFields acroFields>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #203 <Method PdfDictionary AcroFields.getSignatureDictionary(String)>
	//    4    8:astore_3        
		byte abyte0[] = pdfdictionary.getAsString(PdfName.CONTENTS).getOriginalBytes();
	//    5    9:aload_3         
	//    6   10:getstatic       #209 <Field PdfName PdfName.CONTENTS>
	//    7   13:invokevirtual   #213 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//    8   16:invokevirtual   #218 <Method byte[] PdfString.getOriginalBytes()>
	//    9   19:astore_2        
		s = ((String) (abyte0));
	//   10   20:aload_2         
	//   11   21:astore_1        
		if(PdfName.ETSI_RFC3161.equals(((Object) (PdfReader.getPdfObject(pdfdictionary.get(PdfName.SUBFILTER))))))
	//*  12   22:getstatic       #221 <Field PdfName PdfName.ETSI_RFC3161>
	//*  13   25:aload_3         
	//*  14   26:getstatic       #224 <Field PdfName PdfName.SUBFILTER>
	//*  15   29:invokevirtual   #228 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  16   32:invokestatic    #233 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//*  17   35:invokevirtual   #234 <Method boolean PdfName.equals(Object)>
	//*  18   38:ifeq            63
			s = ((String) ((new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))).readObject().getEncoded()));
	//   19   41:new             #236 <Class ASN1InputStream>
	//   20   44:dup             
	//   21   45:new             #238 <Class ByteArrayInputStream>
	//   22   48:dup             
	//   23   49:aload_2         
	//   24   50:invokespecial   #239 <Method void ByteArrayInputStream(byte[])>
	//   25   53:invokespecial   #242 <Method void ASN1InputStream(java.io.InputStream)>
	//   26   56:invokevirtual   #246 <Method ASN1Primitive ASN1InputStream.readObject()>
	//   27   59:invokevirtual   #249 <Method byte[] ASN1Primitive.getEncoded()>
	//   28   62:astore_1        
		return new PdfName(Utilities.convertToHex(hashBytesSha1(((byte []) (s)))));
	//   29   63:new             #205 <Class PdfName>
	//   30   66:dup             
	//   31   67:aload_1         
	//   32   68:invokestatic    #252 <Method byte[] hashBytesSha1(byte[])>
	//   33   71:invokestatic    #258 <Method String Utilities.convertToHex(byte[])>
	//   34   74:invokespecial   #261 <Method void PdfName(String)>
	//   35   77:areturn         
	}

	private static byte[] hashBytesSha1(byte abyte0[])
		throws NoSuchAlgorithmException
	{
		return MessageDigest.getInstance("SHA1").digest(abyte0);
	//    0    0:ldc2            #263 <String "SHA1">
	//    1    3:invokestatic    #269 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #272 <Method byte[] MessageDigest.digest(byte[])>
	//    4   10:areturn         
	}

	private void outputDss(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1, PdfArray pdfarray, PdfArray pdfarray1, PdfArray pdfarray2)
		throws IOException
	{
		writer.addDeveloperExtension(PdfDeveloperExtension.ESIC_1_7_EXTENSIONLEVEL5);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field PdfWriter writer>
	//    2    4:getstatic       #278 <Field PdfDeveloperExtension PdfDeveloperExtension.ESIC_1_7_EXTENSIONLEVEL5>
	//    3    7:invokevirtual   #284 <Method void PdfWriter.addDeveloperExtension(PdfDeveloperExtension)>
		PdfDictionary pdfdictionary2 = reader.getCatalog();
	//    4   10:aload_0         
	//    5   11:getfield        #69  <Field PdfReader reader>
	//    6   14:invokevirtual   #288 <Method PdfDictionary PdfReader.getCatalog()>
	//    7   17:astore          6
		stp.markUsed(((PdfObject) (pdfdictionary2)));
	//    8   19:aload_0         
	//    9   20:getfield        #55  <Field PdfStamper stp>
	//   10   23:aload           6
	//   11   25:invokevirtual   #292 <Method void PdfStamper.markUsed(PdfObject)>
		PdfName pdfname;
		PdfDictionary pdfdictionary3;
		for(Iterator iterator = validated.keySet().iterator(); iterator.hasNext(); pdfdictionary1.put(pdfname, ((PdfObject) (writer.addToBody(((PdfObject) (pdfdictionary3)), false).getIndirectReference()))))
	//*  12   28:aload_0         
	//*  13   29:getfield        #51  <Field Map validated>
	//*  14   32:invokeinterface #298 <Method Set Map.keySet()>
	//*  15   37:invokeinterface #301 <Method Iterator Set.iterator()>
	//*  16   42:astore          7
	//*  17   44:aload           7
	//*  18   46:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//*  19   51:ifeq            486
		{
			pdfname = (PdfName)iterator.next();
	//   20   54:aload           7
	//   21   56:invokeinterface #145 <Method Object Iterator.next()>
	//   22   61:checkcast       #205 <Class PdfName>
	//   23   64:astore          8
			PdfArray pdfarray3 = new PdfArray();
	//   24   66:new             #124 <Class PdfArray>
	//   25   69:dup             
	//   26   70:invokespecial   #125 <Method void PdfArray()>
	//   27   73:astore          9
			PdfArray pdfarray4 = new PdfArray();
	//   28   75:new             #124 <Class PdfArray>
	//   29   78:dup             
	//   30   79:invokespecial   #125 <Method void PdfArray()>
	//   31   82:astore          10
			PdfArray pdfarray5 = new PdfArray();
	//   32   84:new             #124 <Class PdfArray>
	//   33   87:dup             
	//   34   88:invokespecial   #125 <Method void PdfArray()>
	//   35   91:astore          11
			pdfdictionary3 = new PdfDictionary();
	//   36   93:new             #121 <Class PdfDictionary>
	//   37   96:dup             
	//   38   97:invokespecial   #122 <Method void PdfDictionary()>
	//   39  100:astore          12
			Object obj;
			for(Iterator iterator1 = ((ValidationData)validated.get(((Object) (pdfname)))).crls.iterator(); iterator1.hasNext(); pdfarray1.add(((PdfObject) (obj))))
	//*  40  102:aload_0         
	//*  41  103:getfield        #51  <Field Map validated>
	//*  42  106:aload           8
	//*  43  108:invokeinterface #304 <Method Object Map.get(Object)>
	//*  44  113:checkcast       #17  <Class LtvVerification$ValidationData>
	//*  45  116:getfield        #308 <Field List LtvVerification$ValidationData.crls>
	//*  46  119:invokeinterface #311 <Method Iterator List.iterator()>
	//*  47  124:astore          13
	//*  48  126:aload           13
	//*  49  128:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//*  50  133:ifeq            194
			{
				obj = ((Object) (new PdfStream((byte[])iterator1.next())));
	//   51  136:new             #313 <Class PdfStream>
	//   52  139:dup             
	//   53  140:aload           13
	//   54  142:invokeinterface #145 <Method Object Iterator.next()>
	//   55  147:checkcast       #315 <Class byte[]>
	//   56  150:invokespecial   #316 <Method void PdfStream(byte[])>
	//   57  153:astore          14
				((PdfStream) (obj)).flateCompress();
	//   58  155:aload           14
	//   59  157:invokevirtual   #319 <Method void PdfStream.flateCompress()>
				obj = ((Object) (writer.addToBody(((PdfObject) (obj)), false).getIndirectReference()));
	//   60  160:aload_0         
	//   61  161:getfield        #63  <Field PdfWriter writer>
	//   62  164:aload           14
	//   63  166:iconst_0        
	//   64  167:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//   65  170:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   66  173:astore          14
				pdfarray4.add(((PdfObject) (obj)));
	//   67  175:aload           10
	//   68  177:aload           14
	//   69  179:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//   70  182:pop             
			}

	//   71  183:aload           4
	//   72  185:aload           14
	//   73  187:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//   74  190:pop             
	//*  75  191:goto            126
			Object obj1;
			for(Iterator iterator2 = ((ValidationData)validated.get(((Object) (pdfname)))).ocsps.iterator(); iterator2.hasNext(); pdfarray.add(((PdfObject) (obj1))))
	//*  76  194:aload_0         
	//*  77  195:getfield        #51  <Field Map validated>
	//*  78  198:aload           8
	//*  79  200:invokeinterface #304 <Method Object Map.get(Object)>
	//*  80  205:checkcast       #17  <Class LtvVerification$ValidationData>
	//*  81  208:getfield        #335 <Field List LtvVerification$ValidationData.ocsps>
	//*  82  211:invokeinterface #311 <Method Iterator List.iterator()>
	//*  83  216:astore          13
	//*  84  218:aload           13
	//*  85  220:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//*  86  225:ifeq            285
			{
				obj1 = ((Object) (new PdfStream((byte[])iterator2.next())));
	//   87  228:new             #313 <Class PdfStream>
	//   88  231:dup             
	//   89  232:aload           13
	//   90  234:invokeinterface #145 <Method Object Iterator.next()>
	//   91  239:checkcast       #315 <Class byte[]>
	//   92  242:invokespecial   #316 <Method void PdfStream(byte[])>
	//   93  245:astore          14
				((PdfStream) (obj1)).flateCompress();
	//   94  247:aload           14
	//   95  249:invokevirtual   #319 <Method void PdfStream.flateCompress()>
				obj1 = ((Object) (writer.addToBody(((PdfObject) (obj1)), false).getIndirectReference()));
	//   96  252:aload_0         
	//   97  253:getfield        #63  <Field PdfWriter writer>
	//   98  256:aload           14
	//   99  258:iconst_0        
	//  100  259:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  101  262:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  102  265:astore          14
				pdfarray3.add(((PdfObject) (obj1)));
	//  103  267:aload           9
	//  104  269:aload           14
	//  105  271:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//  106  274:pop             
			}

	//  107  275:aload_3         
	//  108  276:aload           14
	//  109  278:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//  110  281:pop             
	//* 111  282:goto            218
			Object obj2;
			for(Iterator iterator3 = ((ValidationData)validated.get(((Object) (pdfname)))).certs.iterator(); iterator3.hasNext(); pdfarray2.add(((PdfObject) (obj2))))
	//* 112  285:aload_0         
	//* 113  286:getfield        #51  <Field Map validated>
	//* 114  289:aload           8
	//* 115  291:invokeinterface #304 <Method Object Map.get(Object)>
	//* 116  296:checkcast       #17  <Class LtvVerification$ValidationData>
	//* 117  299:getfield        #338 <Field List LtvVerification$ValidationData.certs>
	//* 118  302:invokeinterface #311 <Method Iterator List.iterator()>
	//* 119  307:astore          13
	//* 120  309:aload           13
	//* 121  311:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//* 122  316:ifeq            377
			{
				obj2 = ((Object) (new PdfStream((byte[])iterator3.next())));
	//  123  319:new             #313 <Class PdfStream>
	//  124  322:dup             
	//  125  323:aload           13
	//  126  325:invokeinterface #145 <Method Object Iterator.next()>
	//  127  330:checkcast       #315 <Class byte[]>
	//  128  333:invokespecial   #316 <Method void PdfStream(byte[])>
	//  129  336:astore          14
				((PdfStream) (obj2)).flateCompress();
	//  130  338:aload           14
	//  131  340:invokevirtual   #319 <Method void PdfStream.flateCompress()>
				obj2 = ((Object) (writer.addToBody(((PdfObject) (obj2)), false).getIndirectReference()));
	//  132  343:aload_0         
	//  133  344:getfield        #63  <Field PdfWriter writer>
	//  134  347:aload           14
	//  135  349:iconst_0        
	//  136  350:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  137  353:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  138  356:astore          14
				pdfarray5.add(((PdfObject) (obj2)));
	//  139  358:aload           11
	//  140  360:aload           14
	//  141  362:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//  142  365:pop             
			}

	//  143  366:aload           5
	//  144  368:aload           14
	//  145  370:invokevirtual   #332 <Method boolean PdfArray.add(PdfObject)>
	//  146  373:pop             
	//* 147  374:goto            309
			if(pdfarray3.size() > 0)
	//* 148  377:aload           9
	//* 149  379:invokevirtual   #156 <Method int PdfArray.size()>
	//* 150  382:ifle            406
				pdfdictionary3.put(PdfName.OCSP, ((PdfObject) (writer.addToBody(((PdfObject) (pdfarray3)), false).getIndirectReference())));
	//  151  385:aload           12
	//  152  387:getstatic       #341 <Field PdfName PdfName.OCSP>
	//  153  390:aload_0         
	//  154  391:getfield        #63  <Field PdfWriter writer>
	//  155  394:aload           9
	//  156  396:iconst_0        
	//  157  397:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  158  400:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  159  403:invokevirtual   #345 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(pdfarray4.size() > 0)
	//* 160  406:aload           10
	//* 161  408:invokevirtual   #156 <Method int PdfArray.size()>
	//* 162  411:ifle            435
				pdfdictionary3.put(PdfName.CRL, ((PdfObject) (writer.addToBody(((PdfObject) (pdfarray4)), false).getIndirectReference())));
	//  163  414:aload           12
	//  164  416:getstatic       #348 <Field PdfName PdfName.CRL>
	//  165  419:aload_0         
	//  166  420:getfield        #63  <Field PdfWriter writer>
	//  167  423:aload           10
	//  168  425:iconst_0        
	//  169  426:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  170  429:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  171  432:invokevirtual   #345 <Method void PdfDictionary.put(PdfName, PdfObject)>
			if(pdfarray5.size() > 0)
	//* 172  435:aload           11
	//* 173  437:invokevirtual   #156 <Method int PdfArray.size()>
	//* 174  440:ifle            464
				pdfdictionary3.put(PdfName.CERT, ((PdfObject) (writer.addToBody(((PdfObject) (pdfarray5)), false).getIndirectReference())));
	//  175  443:aload           12
	//  176  445:getstatic       #351 <Field PdfName PdfName.CERT>
	//  177  448:aload_0         
	//  178  449:getfield        #63  <Field PdfWriter writer>
	//  179  452:aload           11
	//  180  454:iconst_0        
	//  181  455:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  182  458:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  183  461:invokevirtual   #345 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}

	//  184  464:aload_2         
	//  185  465:aload           8
	//  186  467:aload_0         
	//  187  468:getfield        #63  <Field PdfWriter writer>
	//  188  471:aload           12
	//  189  473:iconst_0        
	//  190  474:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  191  477:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  192  480:invokevirtual   #345 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 193  483:goto            44
		pdfdictionary.put(PdfName.VRI, ((PdfObject) (writer.addToBody(((PdfObject) (pdfdictionary1)), false).getIndirectReference())));
	//  194  486:aload_1         
	//  195  487:getstatic       #354 <Field PdfName PdfName.VRI>
	//  196  490:aload_0         
	//  197  491:getfield        #63  <Field PdfWriter writer>
	//  198  494:aload_2         
	//  199  495:iconst_0        
	//  200  496:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  201  499:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  202  502:invokevirtual   #345 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdfarray.size() > 0)
	//* 203  505:aload_3         
	//* 204  506:invokevirtual   #156 <Method int PdfArray.size()>
	//* 205  509:ifle            531
			pdfdictionary.put(PdfName.OCSPS, ((PdfObject) (writer.addToBody(((PdfObject) (pdfarray)), false).getIndirectReference())));
	//  206  512:aload_1         
	//  207  513:getstatic       #357 <Field PdfName PdfName.OCSPS>
	//  208  516:aload_0         
	//  209  517:getfield        #63  <Field PdfWriter writer>
	//  210  520:aload_3         
	//  211  521:iconst_0        
	//  212  522:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  213  525:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  214  528:invokevirtual   #345 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdfarray1.size() > 0)
	//* 215  531:aload           4
	//* 216  533:invokevirtual   #156 <Method int PdfArray.size()>
	//* 217  536:ifle            559
			pdfdictionary.put(PdfName.CRLS, ((PdfObject) (writer.addToBody(((PdfObject) (pdfarray1)), false).getIndirectReference())));
	//  218  539:aload_1         
	//  219  540:getstatic       #360 <Field PdfName PdfName.CRLS>
	//  220  543:aload_0         
	//  221  544:getfield        #63  <Field PdfWriter writer>
	//  222  547:aload           4
	//  223  549:iconst_0        
	//  224  550:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  225  553:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  226  556:invokevirtual   #345 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(pdfarray2.size() > 0)
	//* 227  559:aload           5
	//* 228  561:invokevirtual   #156 <Method int PdfArray.size()>
	//* 229  564:ifle            587
			pdfdictionary.put(PdfName.CERTS, ((PdfObject) (writer.addToBody(((PdfObject) (pdfarray2)), false).getIndirectReference())));
	//  230  567:aload_1         
	//  231  568:getstatic       #363 <Field PdfName PdfName.CERTS>
	//  232  571:aload_0         
	//  233  572:getfield        #63  <Field PdfWriter writer>
	//  234  575:aload           5
	//  235  577:iconst_0        
	//  236  578:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  237  581:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  238  584:invokevirtual   #345 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary2.put(PdfName.DSS, ((PdfObject) (writer.addToBody(((PdfObject) (pdfdictionary)), false).getIndirectReference())));
	//  239  587:aload           6
	//  240  589:getstatic       #366 <Field PdfName PdfName.DSS>
	//  241  592:aload_0         
	//  242  593:getfield        #63  <Field PdfWriter writer>
	//  243  596:aload_1         
	//  244  597:iconst_0        
	//  245  598:invokevirtual   #323 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, boolean)>
	//  246  601:invokevirtual   #329 <Method com.itextpdf.text.pdf.PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  247  604:invokevirtual   #345 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//  248  607:return          
	}

	private void updateDss()
		throws IOException
	{
		Object obj = ((Object) (reader.getCatalog()));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field PdfReader reader>
	//    2    4:invokevirtual   #288 <Method PdfDictionary PdfReader.getCatalog()>
	//    3    7:astore_1        
		stp.markUsed(((PdfObject) (obj)));
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field PdfStamper stp>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #292 <Method void PdfStamper.markUsed(PdfObject)>
		PdfDictionary pdfdictionary = ((PdfDictionary) (obj)).getAsDict(PdfName.DSS);
	//    8   16:aload_1         
	//    9   17:getstatic       #366 <Field PdfName PdfName.DSS>
	//   10   20:invokevirtual   #371 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   11   23:astore          5
		PdfArray pdfarray = pdfdictionary.getAsArray(PdfName.OCSPS);
	//   12   25:aload           5
	//   13   27:getstatic       #357 <Field PdfName PdfName.OCSPS>
	//   14   30:invokevirtual   #375 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   15   33:astore_2        
		PdfArray pdfarray1 = pdfdictionary.getAsArray(PdfName.CRLS);
	//   16   34:aload           5
	//   17   36:getstatic       #360 <Field PdfName PdfName.CRLS>
	//   18   39:invokevirtual   #375 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   19   42:astore_3        
		PdfArray pdfarray2 = pdfdictionary.getAsArray(PdfName.CERTS);
	//   20   43:aload           5
	//   21   45:getstatic       #363 <Field PdfName PdfName.CERTS>
	//   22   48:invokevirtual   #375 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   23   51:astore          4
		pdfdictionary.remove(PdfName.OCSPS);
	//   24   53:aload           5
	//   25   55:getstatic       #357 <Field PdfName PdfName.OCSPS>
	//   26   58:invokevirtual   #378 <Method void PdfDictionary.remove(PdfName)>
		pdfdictionary.remove(PdfName.CRLS);
	//   27   61:aload           5
	//   28   63:getstatic       #360 <Field PdfName PdfName.CRLS>
	//   29   66:invokevirtual   #378 <Method void PdfDictionary.remove(PdfName)>
		pdfdictionary.remove(PdfName.CERTS);
	//   30   69:aload           5
	//   31   71:getstatic       #363 <Field PdfName PdfName.CERTS>
	//   32   74:invokevirtual   #378 <Method void PdfDictionary.remove(PdfName)>
		PdfDictionary pdfdictionary1 = pdfdictionary.getAsDict(PdfName.VRI);
	//   33   77:aload           5
	//   34   79:getstatic       #354 <Field PdfName PdfName.VRI>
	//   35   82:invokevirtual   #371 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   36   85:astore          6
		if(pdfdictionary1 != null)
	//*  37   87:aload           6
	//*  38   89:ifnull          191
		{
			obj = ((Object) (pdfdictionary1.getKeys().iterator()));
	//   39   92:aload           6
	//   40   94:invokevirtual   #381 <Method Set PdfDictionary.getKeys()>
	//   41   97:invokeinterface #301 <Method Iterator Set.iterator()>
	//   42  102:astore_1        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   43  103:aload_1         
	//   44  104:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//   45  109:ifeq            191
				Object obj1 = ((Object) ((PdfName)((Iterator) (obj)).next()));
	//   46  112:aload_1         
	//   47  113:invokeinterface #145 <Method Object Iterator.next()>
	//   48  118:checkcast       #205 <Class PdfName>
	//   49  121:astore          7
				if(validated.containsKey(obj1))
	//*  50  123:aload_0         
	//*  51  124:getfield        #51  <Field Map validated>
	//*  52  127:aload           7
	//*  53  129:invokeinterface #384 <Method boolean Map.containsKey(Object)>
	//*  54  134:ifeq            103
				{
					obj1 = ((Object) (pdfdictionary1.getAsDict(((PdfName) (obj1)))));
	//   55  137:aload           6
	//   56  139:aload           7
	//   57  141:invokevirtual   #371 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   58  144:astore          7
					if(obj1 != null)
	//*  59  146:aload           7
	//*  60  148:ifnull          103
					{
						deleteOldReferences(pdfarray, ((PdfDictionary) (obj1)).getAsArray(PdfName.OCSP));
	//   61  151:aload_2         
	//   62  152:aload           7
	//   63  154:getstatic       #341 <Field PdfName PdfName.OCSP>
	//   64  157:invokevirtual   #375 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   65  160:invokestatic    #386 <Method void deleteOldReferences(PdfArray, PdfArray)>
						deleteOldReferences(pdfarray1, ((PdfDictionary) (obj1)).getAsArray(PdfName.CRL));
	//   66  163:aload_3         
	//   67  164:aload           7
	//   68  166:getstatic       #348 <Field PdfName PdfName.CRL>
	//   69  169:invokevirtual   #375 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   70  172:invokestatic    #386 <Method void deleteOldReferences(PdfArray, PdfArray)>
						deleteOldReferences(pdfarray2, ((PdfDictionary) (obj1)).getAsArray(PdfName.CERT));
	//   71  175:aload           4
	//   72  177:aload           7
	//   73  179:getstatic       #351 <Field PdfName PdfName.CERT>
	//   74  182:invokevirtual   #375 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   75  185:invokestatic    #386 <Method void deleteOldReferences(PdfArray, PdfArray)>
					}
				}
			} while(true);
	//   76  188:goto            103
		}
		obj = ((Object) (pdfarray));
	//   77  191:aload_2         
	//   78  192:astore_1        
		if(pdfarray == null)
	//*  79  193:aload_2         
	//*  80  194:ifnonnull       205
			obj = ((Object) (new PdfArray()));
	//   81  197:new             #124 <Class PdfArray>
	//   82  200:dup             
	//   83  201:invokespecial   #125 <Method void PdfArray()>
	//   84  204:astore_1        
		pdfarray = pdfarray1;
	//   85  205:aload_3         
	//   86  206:astore_2        
		if(pdfarray1 == null)
	//*  87  207:aload_3         
	//*  88  208:ifnonnull       219
			pdfarray = new PdfArray();
	//   89  211:new             #124 <Class PdfArray>
	//   90  214:dup             
	//   91  215:invokespecial   #125 <Method void PdfArray()>
	//   92  218:astore_2        
		pdfarray1 = pdfarray2;
	//   93  219:aload           4
	//   94  221:astore_3        
		if(pdfarray2 == null)
	//*  95  222:aload           4
	//*  96  224:ifnonnull       235
			pdfarray1 = new PdfArray();
	//   97  227:new             #124 <Class PdfArray>
	//   98  230:dup             
	//   99  231:invokespecial   #125 <Method void PdfArray()>
	//  100  234:astore_3        
		outputDss(pdfdictionary, pdfdictionary1, ((PdfArray) (obj)), pdfarray, pdfarray1);
	//  101  235:aload_0         
	//  102  236:aload           5
	//  103  238:aload           6
	//  104  240:aload_1         
	//  105  241:aload_2         
	//  106  242:aload_3         
	//  107  243:invokespecial   #129 <Method void outputDss(PdfDictionary, PdfDictionary, PdfArray, PdfArray, PdfArray)>
	//  108  246:return          
	}

	public boolean addVerification(String s, OcspClient ocspclient, CrlClient crlclient, CertificateOption certificateoption, Level level, CertificateInclusion certificateinclusion)
		throws IOException, GeneralSecurityException
	{
		if(used)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean used>
	//*   2    4:ifeq            25
			throw new IllegalStateException(MessageLocalization.getComposedMessage("verification.already.output", new Object[0]));
	//    3    7:new             #392 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #394 <String "verification.already.output">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #401 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		PdfPKCS7 pdfpkcs7 = acroFields.verifySignature(s);
	//   11   25:aload_0         
	//   12   26:getfield        #75  <Field AcroFields acroFields>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #405 <Method PdfPKCS7 AcroFields.verifySignature(String)>
	//   15   33:astore          10
		LOGGER.info((new StringBuilder()).append("Adding verification for ").append(s).toString());
	//   16   35:aload_0         
	//   17   36:getfield        #46  <Field Logger LOGGER>
	//   18   39:new             #407 <Class StringBuilder>
	//   19   42:dup             
	//   20   43:invokespecial   #408 <Method void StringBuilder()>
	//   21   46:ldc2            #410 <String "Adding verification for ">
	//   22   49:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:aload_1         
	//   24   53:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//   25   56:invokevirtual   #418 <Method String StringBuilder.toString()>
	//   26   59:invokeinterface #423 <Method void Logger.info(String)>
		Certificate acertificate[] = pdfpkcs7.getCertificates();
	//   27   64:aload           10
	//   28   66:invokevirtual   #429 <Method Certificate[] PdfPKCS7.getCertificates()>
	//   29   69:astore          12
		X509Certificate x509certificate = pdfpkcs7.getSigningCertificate();
	//   30   71:aload           10
	//   31   73:invokevirtual   #433 <Method X509Certificate PdfPKCS7.getSigningCertificate()>
	//   32   76:astore          13
		ValidationData validationdata = new ValidationData();
	//   33   78:new             #17  <Class LtvVerification$ValidationData>
	//   34   81:dup             
	//   35   82:aconst_null     
	//   36   83:invokespecial   #436 <Method void LtvVerification$ValidationData(LtvVerification$1)>
	//   37   86:astore          14
		int i = 0;
	//   38   88:iconst_0        
	//   39   89:istore          7
		while(i < acertificate.length) 
	//*  40   91:iload           7
	//*  41   93:aload           12
	//*  42   95:arraylength     
	//*  43   96:icmpge          442
		{
			X509Certificate x509certificate1 = (X509Certificate)acertificate[i];
	//   44   99:aload           12
	//   45  101:iload           7
	//   46  103:aaload          
	//   47  104:checkcast       #172 <Class X509Certificate>
	//   48  107:astore          15
			LOGGER.info((new StringBuilder()).append("Certificate: ").append(((Object) (x509certificate1.getSubjectDN()))).toString());
	//   49  109:aload_0         
	//   50  110:getfield        #46  <Field Logger LOGGER>
	//   51  113:new             #407 <Class StringBuilder>
	//   52  116:dup             
	//   53  117:invokespecial   #408 <Method void StringBuilder()>
	//   54  120:ldc2            #438 <String "Certificate: ">
	//   55  123:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//   56  126:aload           15
	//   57  128:invokevirtual   #179 <Method Principal X509Certificate.getSubjectDN()>
	//   58  131:invokevirtual   #441 <Method StringBuilder StringBuilder.append(Object)>
	//   59  134:invokevirtual   #418 <Method String StringBuilder.toString()>
	//   60  137:invokeinterface #423 <Method void Logger.info(String)>
			if(certificateoption != CertificateOption.SIGNING_CERTIFICATE || x509certificate1.equals(((Object) (x509certificate))))
	//*  61  142:aload           4
	//*  62  144:getstatic       #445 <Field LtvVerification$CertificateOption LtvVerification$CertificateOption.SIGNING_CERTIFICATE>
	//*  63  147:if_acmpne       169
	//*  64  150:aload           15
	//*  65  152:aload           13
	//*  66  154:invokevirtual   #446 <Method boolean X509Certificate.equals(Object)>
	//*  67  157:ifne            169
	//*  68  160:iload           7
	//*  69  162:iconst_1        
	//*  70  163:iadd            
	//*  71  164:istore          7
	//*  72  166:goto            91
			{
				Object obj1 = null;
	//   73  169:aconst_null     
	//   74  170:astore          11
				byte abyte0[] = ((byte []) (obj1));
	//   75  172:aload           11
	//   76  174:astore          10
				if(ocspclient != null)
	//*  77  176:aload_2         
	//*  78  177:ifnull          252
				{
					abyte0 = ((byte []) (obj1));
	//   79  180:aload           11
	//   80  182:astore          10
					if(level != Level.CRL)
	//*  81  184:aload           5
	//*  82  186:getstatic       #449 <Field LtvVerification$Level LtvVerification$Level.CRL>
	//*  83  189:if_acmpeq       252
					{
						byte abyte1[] = ocspclient.getEncoded(x509certificate1, getParent(x509certificate1, acertificate), ((String) (null)));
	//   84  192:aload_2         
	//   85  193:aload           15
	//   86  195:aload_0         
	//   87  196:aload           15
	//   88  198:aload           12
	//   89  200:invokespecial   #451 <Method X509Certificate getParent(X509Certificate, Certificate[])>
	//   90  203:aconst_null     
	//   91  204:invokeinterface #456 <Method byte[] OcspClient.getEncoded(X509Certificate, X509Certificate, String)>
	//   92  209:astore          11
						abyte0 = abyte1;
	//   93  211:aload           11
	//   94  213:astore          10
						if(abyte1 != null)
	//*  95  215:aload           11
	//*  96  217:ifnull          252
						{
							validationdata.ocsps.add(((Object) (buildOCSPResponse(abyte1))));
	//   97  220:aload           14
	//   98  222:getfield        #335 <Field List LtvVerification$ValidationData.ocsps>
	//   99  225:aload           11
	//  100  227:invokestatic    #458 <Method byte[] buildOCSPResponse(byte[])>
	//  101  230:invokeinterface #460 <Method boolean List.add(Object)>
	//  102  235:pop             
							LOGGER.info("OCSP added");
	//  103  236:aload_0         
	//  104  237:getfield        #46  <Field Logger LOGGER>
	//  105  240:ldc2            #462 <String "OCSP added">
	//  106  243:invokeinterface #423 <Method void Logger.info(String)>
							abyte0 = abyte1;
	//  107  248:aload           11
	//  108  250:astore          10
						}
					}
				}
				if(crlclient != null && (level == Level.CRL || level == Level.OCSP_CRL || level == Level.OCSP_OPTIONAL_CRL && abyte0 == null))
	//* 109  252:aload_3         
	//* 110  253:ifnull          415
	//* 111  256:aload           5
	//* 112  258:getstatic       #449 <Field LtvVerification$Level LtvVerification$Level.CRL>
	//* 113  261:if_acmpeq       285
	//* 114  264:aload           5
	//* 115  266:getstatic       #465 <Field LtvVerification$Level LtvVerification$Level.OCSP_CRL>
	//* 116  269:if_acmpeq       285
	//* 117  272:aload           5
	//* 118  274:getstatic       #468 <Field LtvVerification$Level LtvVerification$Level.OCSP_OPTIONAL_CRL>
	//* 119  277:if_acmpne       415
	//* 120  280:aload           10
	//* 121  282:ifnonnull       415
				{
					Object obj = ((Object) (crlclient.getEncoded(x509certificate1, ((String) (null)))));
	//  122  285:aload_3         
	//  123  286:aload           15
	//  124  288:aconst_null     
	//  125  289:invokeinterface #473 <Method Collection CrlClient.getEncoded(X509Certificate, String)>
	//  126  294:astore          10
					if(obj != null)
	//* 127  296:aload           10
	//* 128  298:ifnull          415
					{
						obj = ((Object) (((Collection) (obj)).iterator()));
	//  129  301:aload           10
	//  130  303:invokeinterface #476 <Method Iterator Collection.iterator()>
	//  131  308:astore          10
						do
						{
							if(!((Iterator) (obj)).hasNext())
								break;
	//  132  310:aload           10
	//  133  312:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//  134  317:ifeq            415
							byte abyte2[] = (byte[])((Iterator) (obj)).next();
	//  135  320:aload           10
	//  136  322:invokeinterface #145 <Method Object Iterator.next()>
	//  137  327:checkcast       #315 <Class byte[]>
	//  138  330:astore          11
							boolean flag1 = false;
	//  139  332:iconst_0        
	//  140  333:istore          9
							Iterator iterator = validationdata.crls.iterator();
	//  141  335:aload           14
	//  142  337:getfield        #308 <Field List LtvVerification$ValidationData.crls>
	//  143  340:invokeinterface #311 <Method Iterator List.iterator()>
	//  144  345:astore          16
							boolean flag;
							do
							{
								flag = flag1;
	//  145  347:iload           9
	//  146  349:istore          8
								if(!iterator.hasNext())
									break;
	//  147  351:aload           16
	//  148  353:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//  149  358:ifeq            382
								if(!Arrays.equals((byte[])iterator.next(), abyte2))
									continue;
	//  150  361:aload           16
	//  151  363:invokeinterface #145 <Method Object Iterator.next()>
	//  152  368:checkcast       #315 <Class byte[]>
	//  153  371:aload           11
	//  154  373:invokestatic    #481 <Method boolean Arrays.equals(byte[], byte[])>
	//  155  376:ifeq            347
								flag = true;
	//  156  379:iconst_1        
	//  157  380:istore          8
								break;
							} while(true);
							if(!flag)
	//* 158  382:iload           8
	//* 159  384:ifne            310
							{
								validationdata.crls.add(((Object) (abyte2)));
	//  160  387:aload           14
	//  161  389:getfield        #308 <Field List LtvVerification$ValidationData.crls>
	//  162  392:aload           11
	//  163  394:invokeinterface #460 <Method boolean List.add(Object)>
	//  164  399:pop             
								LOGGER.info("CRL added");
	//  165  400:aload_0         
	//  166  401:getfield        #46  <Field Logger LOGGER>
	//  167  404:ldc2            #483 <String "CRL added">
	//  168  407:invokeinterface #423 <Method void Logger.info(String)>
							}
						} while(true);
	//  169  412:goto            310
					}
				}
				if(certificateinclusion == CertificateInclusion.YES)
	//* 170  415:aload           6
	//* 171  417:getstatic       #487 <Field LtvVerification$CertificateInclusion LtvVerification$CertificateInclusion.YES>
	//* 172  420:if_acmpne       160
					validationdata.certs.add(((Object) (x509certificate1.getEncoded())));
	//  173  423:aload           14
	//  174  425:getfield        #338 <Field List LtvVerification$ValidationData.certs>
	//  175  428:aload           15
	//  176  430:invokevirtual   #488 <Method byte[] X509Certificate.getEncoded()>
	//  177  433:invokeinterface #460 <Method boolean List.add(Object)>
	//  178  438:pop             
			}
			i++;
		}
	//* 179  439:goto            160
		if(validationdata.crls.isEmpty() && validationdata.ocsps.isEmpty())
	//* 180  442:aload           14
	//* 181  444:getfield        #308 <Field List LtvVerification$ValidationData.crls>
	//* 182  447:invokeinterface #491 <Method boolean List.isEmpty()>
	//* 183  452:ifeq            470
	//* 184  455:aload           14
	//* 185  457:getfield        #335 <Field List LtvVerification$ValidationData.ocsps>
	//* 186  460:invokeinterface #491 <Method boolean List.isEmpty()>
	//* 187  465:ifeq            470
		{
			return false;
	//  188  468:iconst_0        
	//  189  469:ireturn         
		} else
		{
			validated.put(((Object) (getSignatureHashKey(s))), ((Object) (validationdata)));
	//  190  470:aload_0         
	//  191  471:getfield        #51  <Field Map validated>
	//  192  474:aload_0         
	//  193  475:aload_1         
	//  194  476:invokespecial   #493 <Method PdfName getSignatureHashKey(String)>
	//  195  479:aload           14
	//  196  481:invokeinterface #496 <Method Object Map.put(Object, Object)>
	//  197  486:pop             
			return true;
	//  198  487:iconst_1        
	//  199  488:ireturn         
		}
	}

	public boolean addVerification(String s, Collection collection, Collection collection1, Collection collection2)
		throws IOException, GeneralSecurityException
	{
		if(used)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean used>
	//*   2    4:ifeq            25
			throw new IllegalStateException(MessageLocalization.getComposedMessage("verification.already.output", new Object[0]));
	//    3    7:new             #392 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #394 <String "verification.already.output">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #400 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #401 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		ValidationData validationdata = new ValidationData();
	//   11   25:new             #17  <Class LtvVerification$ValidationData>
	//   12   28:dup             
	//   13   29:aconst_null     
	//   14   30:invokespecial   #436 <Method void LtvVerification$ValidationData(LtvVerification$1)>
	//   15   33:astore          5
		if(collection != null)
	//*  16   35:aload_2         
	//*  17   36:ifnull          85
		{
			byte abyte0[];
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); validationdata.ocsps.add(((Object) (buildOCSPResponse(abyte0)))))
	//*  18   39:aload_2         
	//*  19   40:invokeinterface #476 <Method Iterator Collection.iterator()>
	//*  20   45:astore_2        
	//*  21   46:aload_2         
	//*  22   47:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//*  23   52:ifeq            85
				abyte0 = (byte[])((Iterator) (collection)).next();
	//   24   55:aload_2         
	//   25   56:invokeinterface #145 <Method Object Iterator.next()>
	//   26   61:checkcast       #315 <Class byte[]>
	//   27   64:astore          6

	//   28   66:aload           5
	//   29   68:getfield        #335 <Field List LtvVerification$ValidationData.ocsps>
	//   30   71:aload           6
	//   31   73:invokestatic    #458 <Method byte[] buildOCSPResponse(byte[])>
	//   32   76:invokeinterface #460 <Method boolean List.add(Object)>
	//   33   81:pop             
		}
	//*  34   82:goto            46
		if(collection1 != null)
	//*  35   85:aload_3         
	//*  36   86:ifnull          130
			for(collection = ((Collection) (collection1.iterator())); ((Iterator) (collection)).hasNext(); validationdata.crls.add(((Object) (collection1))))
	//*  37   89:aload_3         
	//*  38   90:invokeinterface #476 <Method Iterator Collection.iterator()>
	//*  39   95:astore_2        
	//*  40   96:aload_2         
	//*  41   97:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//*  42  102:ifeq            130
				collection1 = ((Collection) ((byte[])((Iterator) (collection)).next()));
	//   43  105:aload_2         
	//   44  106:invokeinterface #145 <Method Object Iterator.next()>
	//   45  111:checkcast       #315 <Class byte[]>
	//   46  114:astore_3        

	//   47  115:aload           5
	//   48  117:getfield        #308 <Field List LtvVerification$ValidationData.crls>
	//   49  120:aload_3         
	//   50  121:invokeinterface #460 <Method boolean List.add(Object)>
	//   51  126:pop             
	//*  52  127:goto            96
		if(collection2 != null)
	//*  53  130:aload           4
	//*  54  132:ifnull          177
			for(collection = ((Collection) (collection2.iterator())); ((Iterator) (collection)).hasNext(); validationdata.certs.add(((Object) (collection1))))
	//*  55  135:aload           4
	//*  56  137:invokeinterface #476 <Method Iterator Collection.iterator()>
	//*  57  142:astore_2        
	//*  58  143:aload_2         
	//*  59  144:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//*  60  149:ifeq            177
				collection1 = ((Collection) ((byte[])((Iterator) (collection)).next()));
	//   61  152:aload_2         
	//   62  153:invokeinterface #145 <Method Object Iterator.next()>
	//   63  158:checkcast       #315 <Class byte[]>
	//   64  161:astore_3        

	//   65  162:aload           5
	//   66  164:getfield        #338 <Field List LtvVerification$ValidationData.certs>
	//   67  167:aload_3         
	//   68  168:invokeinterface #460 <Method boolean List.add(Object)>
	//   69  173:pop             
	//*  70  174:goto            143
		validated.put(((Object) (getSignatureHashKey(s))), ((Object) (validationdata)));
	//   71  177:aload_0         
	//   72  178:getfield        #51  <Field Map validated>
	//   73  181:aload_0         
	//   74  182:aload_1         
	//   75  183:invokespecial   #493 <Method PdfName getSignatureHashKey(String)>
	//   76  186:aload           5
	//   77  188:invokeinterface #496 <Method Object Map.put(Object, Object)>
	//   78  193:pop             
		return true;
	//   79  194:iconst_1        
	//   80  195:ireturn         
	}

	public void merge()
		throws IOException
	{
		if(used || validated.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean used>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:getfield        #51  <Field Map validated>
	//*   5   11:invokeinterface #501 <Method boolean Map.isEmpty()>
	//*   6   16:ifeq            20
			return;
	//    7   19:return          
		used = true;
	//    8   20:aload_0         
	//    9   21:iconst_1        
	//   10   22:putfield        #53  <Field boolean used>
		if(reader.getCatalog().get(PdfName.DSS) == null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #69  <Field PdfReader reader>
	//*  13   29:invokevirtual   #288 <Method PdfDictionary PdfReader.getCatalog()>
	//*  14   32:getstatic       #366 <Field PdfName PdfName.DSS>
	//*  15   35:invokevirtual   #228 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  16   38:ifnonnull       46
		{
			createDss();
	//   17   41:aload_0         
	//   18   42:invokespecial   #503 <Method void createDss()>
			return;
	//   19   45:return          
		} else
		{
			updateDss();
	//   20   46:aload_0         
	//   21   47:invokespecial   #505 <Method void updateDss()>
			return;
	//   22   50:return          
		}
	}

	private Logger LOGGER;
	private AcroFields acroFields;
	private PdfReader reader;
	private PdfStamper stp;
	private boolean used;
	private Map validated;
	private PdfWriter writer;
}
