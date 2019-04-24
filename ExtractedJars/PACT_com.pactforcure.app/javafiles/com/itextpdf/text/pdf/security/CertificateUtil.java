// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.security.cert.*;
import org.spongycastle.asn1.*;
import org.spongycastle.asn1.x509.*;

public class CertificateUtil
{

	public CertificateUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static CRL getCRL(String s)
		throws IOException, CertificateException, CRLException
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			s = ((String) ((new URL(s)).openStream()));
	//    4    6:new             #19  <Class URL>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void URL(String)>
	//    8   14:invokevirtual   #26  <Method java.io.InputStream URL.openStream()>
	//    9   17:astore_0        
			return CertificateFactory.getInstance("X.509").generateCRL(((java.io.InputStream) (s)));
	//   10   18:ldc1            #28  <String "X.509">
	//   11   20:invokestatic    #34  <Method CertificateFactory CertificateFactory.getInstance(String)>
	//   12   23:aload_0         
	//   13   24:invokevirtual   #38  <Method CRL CertificateFactory.generateCRL(java.io.InputStream)>
	//   14   27:areturn         
		}
	}

	public static CRL getCRL(X509Certificate x509certificate)
		throws CertificateException, CRLException, IOException
	{
		return getCRL(getCRLURL(x509certificate));
	//    0    0:aload_0         
	//    1    1:invokestatic    #44  <Method String getCRLURL(X509Certificate)>
	//    2    4:invokestatic    #46  <Method CRL getCRL(String)>
	//    3    7:areturn         
	}

	public static String getCRLURL(X509Certificate x509certificate)
		throws CertificateParsingException
	{
		try
		{
			x509certificate = ((X509Certificate) (getExtensionValue(x509certificate, Extension.cRLDistributionPoints.getId())));
	//    0    0:aload_0         
	//    1    1:getstatic       #54  <Field ASN1ObjectIdentifier Extension.cRLDistributionPoints>
	//    2    4:invokevirtual   #60  <Method String ASN1ObjectIdentifier.getId()>
	//    3    7:invokestatic    #64  <Method ASN1Primitive getExtensionValue(X509Certificate, String)>
	//    4   10:astore_0        
		}
	//*   5   11:aload_0         
	//*   6   12:ifnonnull       23
	//*   7   15:aconst_null     
	//*   8   16:areturn         
		// Misplaced declaration of an exception variable
		catch(X509Certificate x509certificate)
	//*   9   17:astore_0        
		{
			x509certificate = null;
	//   10   18:aconst_null     
	//   11   19:astore_0        
		}
		if(x509certificate == null)
			return null;
	//*  12   20:goto            11
		x509certificate = ((X509Certificate) (CRLDistPoint.getInstance(((Object) (x509certificate))).getDistributionPoints()));
	//   13   23:aload_0         
	//   14   24:invokestatic    #69  <Method CRLDistPoint CRLDistPoint.getInstance(Object)>
	//   15   27:invokevirtual   #73  <Method DistributionPoint[] CRLDistPoint.getDistributionPoints()>
	//   16   30:astore_0        
		int k = x509certificate.length;
	//   17   31:aload_0         
	//   18   32:arraylength     
	//   19   33:istore_3        
		int i = 0;
	//   20   34:iconst_0        
	//   21   35:istore_1        
		while(i < k) 
	//*  22   36:iload_1         
	//*  23   37:iload_3         
	//*  24   38:icmpge          129
		{
			DistributionPointName distributionpointname = ((DistributionPoint) (x509certificate[i])).getDistributionPoint();
	//   25   41:aload_0         
	//   26   42:iload_1         
	//   27   43:aaload          
	//   28   44:invokevirtual   #79  <Method DistributionPointName DistributionPoint.getDistributionPoint()>
	//   29   47:astore          5
			if(distributionpointname.getType() == 0)
	//*  30   49:aload           5
	//*  31   51:invokevirtual   #85  <Method int DistributionPointName.getType()>
	//*  32   54:ifeq            64
	//*  33   57:iload_1         
	//*  34   58:iconst_1        
	//*  35   59:iadd            
	//*  36   60:istore_1        
	//*  37   61:goto            36
			{
				GeneralName ageneralname[] = ((GeneralNames)distributionpointname.getName()).getNames();
	//   38   64:aload           5
	//   39   66:invokevirtual   #89  <Method ASN1Encodable DistributionPointName.getName()>
	//   40   69:checkcast       #91  <Class GeneralNames>
	//   41   72:invokevirtual   #95  <Method GeneralName[] GeneralNames.getNames()>
	//   42   75:astore          5
				int l = ageneralname.length;
	//   43   77:aload           5
	//   44   79:arraylength     
	//   45   80:istore          4
				int j = 0;
	//   46   82:iconst_0        
	//   47   83:istore_2        
				while(j < l) 
	//*  48   84:iload_2         
	//*  49   85:iload           4
	//*  50   87:icmpge          57
				{
					GeneralName generalname = ageneralname[j];
	//   51   90:aload           5
	//   52   92:iload_2         
	//   53   93:aaload          
	//   54   94:astore          6
					if(generalname.getTagNo() != 6)
	//*  55   96:aload           6
	//*  56   98:invokevirtual   #100 <Method int GeneralName.getTagNo()>
	//*  57  101:bipush          6
	//*  58  103:icmpeq          113
						j++;
	//   59  106:iload_2         
	//   60  107:iconst_1        
	//   61  108:iadd            
	//   62  109:istore_2        
					else
	//*  63  110:goto            84
						return DERIA5String.getInstance((ASN1TaggedObject)generalname.toASN1Primitive(), false).getString();
	//   64  113:aload           6
	//   65  115:invokevirtual   #104 <Method ASN1Primitive GeneralName.toASN1Primitive()>
	//   66  118:checkcast       #106 <Class ASN1TaggedObject>
	//   67  121:iconst_0        
	//   68  122:invokestatic    #111 <Method DERIA5String DERIA5String.getInstance(ASN1TaggedObject, boolean)>
	//   69  125:invokevirtual   #114 <Method String DERIA5String.getString()>
	//   70  128:areturn         
				}
			}
			i++;
		}
		return null;
	//   71  129:aconst_null     
	//   72  130:areturn         
	}

	private static ASN1Primitive getExtensionValue(X509Certificate x509certificate, String s)
		throws IOException
	{
		x509certificate = ((X509Certificate) (x509certificate.getExtensionValue(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #119 <Method byte[] X509Certificate.getExtensionValue(String)>
	//    3    5:astore_0        
		if(x509certificate == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return (new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(((ASN1OctetString)(new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(((byte []) (x509certificate))))))).readObject()).getOctets()))))).readObject();
	//    8   12:new             #121 <Class ASN1InputStream>
	//    9   15:dup             
	//   10   16:new             #123 <Class ByteArrayInputStream>
	//   11   19:dup             
	//   12   20:new             #121 <Class ASN1InputStream>
	//   13   23:dup             
	//   14   24:new             #123 <Class ByteArrayInputStream>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:invokespecial   #126 <Method void ByteArrayInputStream(byte[])>
	//   18   32:invokespecial   #129 <Method void ASN1InputStream(java.io.InputStream)>
	//   19   35:invokevirtual   #132 <Method ASN1Primitive ASN1InputStream.readObject()>
	//   20   38:checkcast       #134 <Class ASN1OctetString>
	//   21   41:invokevirtual   #138 <Method byte[] ASN1OctetString.getOctets()>
	//   22   44:invokespecial   #126 <Method void ByteArrayInputStream(byte[])>
	//   23   47:invokespecial   #129 <Method void ASN1InputStream(java.io.InputStream)>
	//   24   50:invokevirtual   #132 <Method ASN1Primitive ASN1InputStream.readObject()>
	//   25   53:areturn         
	}

	public static String getOCSPURL(X509Certificate x509certificate)
	{
		int i;
		Object obj;
		try
		{
			x509certificate = ((X509Certificate) (getExtensionValue(x509certificate, Extension.authorityInfoAccess.getId())));
	//    0    0:aload_0         
	//    1    1:getstatic       #142 <Field ASN1ObjectIdentifier Extension.authorityInfoAccess>
	//    2    4:invokevirtual   #60  <Method String ASN1ObjectIdentifier.getId()>
	//    3    7:invokestatic    #64  <Method ASN1Primitive getExtensionValue(X509Certificate, String)>
	//    4   10:astore_0        
		}
	//*   5   11:aload_0         
	//*   6   12:ifnonnull       17
	//*   7   15:aconst_null     
	//*   8   16:areturn         
	//*   9   17:aload_0         
	//*  10   18:checkcast       #144 <Class ASN1Sequence>
	//*  11   21:astore_0        
	//*  12   22:iconst_0        
	//*  13   23:istore_1        
	//*  14   24:iload_1         
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #147 <Method int ASN1Sequence.size()>
	//*  17   29:icmpge          106
	//*  18   32:aload_0         
	//*  19   33:iload_1         
	//*  20   34:invokevirtual   #151 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  21   37:checkcast       #144 <Class ASN1Sequence>
	//*  22   40:astore_2        
	//*  23   41:aload_2         
	//*  24   42:invokevirtual   #147 <Method int ASN1Sequence.size()>
	//*  25   45:iconst_2        
	//*  26   46:icmpeq          52
	//*  27   49:goto            110
	//*  28   52:aload_2         
	//*  29   53:iconst_0        
	//*  30   54:invokevirtual   #151 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  31   57:instanceof      #56  <Class ASN1ObjectIdentifier>
	//*  32   60:ifeq            110
	//*  33   63:ldc1            #153 <String "1.3.6.1.5.5.7.48.1">
	//*  34   65:aload_2         
	//*  35   66:iconst_0        
	//*  36   67:invokevirtual   #151 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  37   70:checkcast       #56  <Class ASN1ObjectIdentifier>
	//*  38   73:invokevirtual   #60  <Method String ASN1ObjectIdentifier.getId()>
	//*  39   76:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  40   79:ifeq            110
	//*  41   82:aload_2         
	//*  42   83:iconst_1        
	//*  43   84:invokevirtual   #151 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  44   87:checkcast       #161 <Class ASN1Primitive>
	//*  45   90:invokestatic    #165 <Method String getStringFromGeneralName(ASN1Primitive)>
	//*  46   93:astore_2        
	//*  47   94:aload_2         
	//*  48   95:astore_0        
	//*  49   96:aload_2         
	//*  50   97:ifnonnull       108
	//*  51  100:ldc1            #167 <String "">
	//*  52  102:areturn         
		// Misplaced declaration of an exception variable
		catch(X509Certificate x509certificate)
	//*  53  103:astore_0        
		{
			return null;
	//   54  104:aconst_null     
	//   55  105:areturn         
		}
		if(x509certificate == null)
			return null;
		x509certificate = ((X509Certificate) ((ASN1Sequence)x509certificate));
		i = 0;
_L2:
		if(i >= ((ASN1Sequence) (x509certificate)).size())
			break MISSING_BLOCK_LABEL_106;
		obj = ((Object) ((ASN1Sequence)((ASN1Sequence) (x509certificate)).getObjectAt(i)));
		if(((ASN1Sequence) (obj)).size() != 2)
			break MISSING_BLOCK_LABEL_110;
		if(!(((ASN1Sequence) (obj)).getObjectAt(0) instanceof ASN1ObjectIdentifier) || !"1.3.6.1.5.5.7.48.1".equals(((Object) (((ASN1ObjectIdentifier)((ASN1Sequence) (obj)).getObjectAt(0)).getId()))))
			break MISSING_BLOCK_LABEL_110;
		obj = ((Object) (getStringFromGeneralName((ASN1Primitive)((ASN1Sequence) (obj)).getObjectAt(1))));
		x509certificate = ((X509Certificate) (obj));
		if(obj == null)
			return "";
		break MISSING_BLOCK_LABEL_108;
		x509certificate = null;
	//   56  106:aconst_null     
	//   57  107:astore_0        
		return ((String) (x509certificate));
	//   58  108:aload_0         
	//   59  109:areturn         
		i++;
	//   60  110:iload_1         
	//   61  111:iconst_1        
	//   62  112:iadd            
	//   63  113:istore_1        
		if(true) goto _L2; else goto _L1
	//   64  114:goto            24
_L1:
	}

	private static String getStringFromGeneralName(ASN1Primitive asn1primitive)
		throws IOException
	{
		return new String(ASN1OctetString.getInstance((ASN1TaggedObject)asn1primitive, false).getOctets(), "ISO-8859-1");
	//    0    0:new             #155 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:checkcast       #106 <Class ASN1TaggedObject>
	//    4    8:iconst_0        
	//    5    9:invokestatic    #170 <Method ASN1OctetString ASN1OctetString.getInstance(ASN1TaggedObject, boolean)>
	//    6   12:invokevirtual   #138 <Method byte[] ASN1OctetString.getOctets()>
	//    7   15:ldc1            #172 <String "ISO-8859-1">
	//    8   17:invokespecial   #175 <Method void String(byte[], String)>
	//    9   20:areturn         
	}

	public static String getTSAURL(X509Certificate x509certificate)
	{
		x509certificate = ((X509Certificate) (x509certificate.getExtensionValue("1.2.840.113583.1.1.9.1")));
	//    0    0:aload_0         
	//    1    1:ldc1            #178 <String "1.2.840.113583.1.1.9.1">
	//    2    3:invokevirtual   #119 <Method byte[] X509Certificate.getExtensionValue(String)>
	//    3    6:astore_0        
		if(x509certificate == null)
	//*   4    7:aload_0         
	//*   5    8:ifnonnull       13
			return null;
	//    6   11:aconst_null     
	//    7   12:areturn         
		try
		{
			x509certificate = ((X509Certificate) (getStringFromGeneralName(ASN1Sequence.getInstance(((Object) (ASN1Primitive.fromByteArray(((DEROctetString)ASN1Primitive.fromByteArray(((byte []) (x509certificate)))).getOctets())))).getObjectAt(1).toASN1Primitive())));
	//    8   13:aload_0         
	//    9   14:invokestatic    #182 <Method ASN1Primitive ASN1Primitive.fromByteArray(byte[])>
	//   10   17:checkcast       #184 <Class DEROctetString>
	//   11   20:invokevirtual   #185 <Method byte[] DEROctetString.getOctets()>
	//   12   23:invokestatic    #182 <Method ASN1Primitive ASN1Primitive.fromByteArray(byte[])>
	//   13   26:invokestatic    #188 <Method ASN1Sequence ASN1Sequence.getInstance(Object)>
	//   14   29:iconst_1        
	//   15   30:invokevirtual   #151 <Method ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//   16   33:invokeinterface #191 <Method ASN1Primitive ASN1Encodable.toASN1Primitive()>
	//   17   38:invokestatic    #165 <Method String getStringFromGeneralName(ASN1Primitive)>
	//   18   41:astore_0        
		}
	//*  19   42:aload_0         
	//*  20   43:areturn         
		// Misplaced declaration of an exception variable
		catch(X509Certificate x509certificate)
	//*  21   44:astore_0        
		{
			return null;
	//   22   45:aconst_null     
	//   23   46:areturn         
		}
		return ((String) (x509certificate));
	}
}
