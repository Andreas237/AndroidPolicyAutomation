// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.pdf.codec.Base64;
import org.spongycastle.asn1.*;
import org.spongycastle.asn1.esf.*;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			DigestAlgorithms

public class SignaturePolicyInfo
{

	public SignaturePolicyInfo(String s, String s1, String s2, String s3)
	{
		if(s1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          19
			s1 = ((String) (Base64.decode(s1)));
	//    2    4:aload_2         
	//    3    5:invokestatic    #18  <Method byte[] Base64.decode(String)>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:aload_3         
	//*   9   13:aload           4
	//*  10   15:invokespecial   #21  <Method void SignaturePolicyInfo(String, byte[], String, String)>
	//*  11   18:return          
			s1 = null;
	//   12   19:aconst_null     
	//   13   20:astore_2        
		this(s, ((byte []) (s1)), s2, s3);
	//*  14   21:goto            9
	}

	public SignaturePolicyInfo(String s, byte abyte0[], String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		if(s == null || s.length() == 0)
	//*   2    4:aload_1         
	//*   3    5:ifnull          15
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #31  <Method int String.length()>
	//*   6   12:ifne            25
			throw new IllegalArgumentException("Policy identifier cannot be null");
	//    7   15:new             #33  <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc1            #35  <String "Policy identifier cannot be null">
	//   10   21:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
		if(abyte0 == null)
	//*  12   25:aload_2         
	//*  13   26:ifnonnull       39
			throw new IllegalArgumentException("Policy hash cannot be null");
	//   14   29:new             #33  <Class IllegalArgumentException>
	//   15   32:dup             
	//   16   33:ldc1            #40  <String "Policy hash cannot be null">
	//   17   35:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   18   38:athrow          
		if(s1 == null || s1.length() == 0)
	//*  19   39:aload_3         
	//*  20   40:ifnull          50
	//*  21   43:aload_3         
	//*  22   44:invokevirtual   #31  <Method int String.length()>
	//*  23   47:ifne            60
		{
			throw new IllegalArgumentException("Policy digest algorithm cannot be null");
	//   24   50:new             #33  <Class IllegalArgumentException>
	//   25   53:dup             
	//   26   54:ldc1            #42  <String "Policy digest algorithm cannot be null">
	//   27   56:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   28   59:athrow          
		} else
		{
			policyIdentifier = s;
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:putfield        #44  <Field String policyIdentifier>
			policyHash = abyte0;
	//   32   65:aload_0         
	//   33   66:aload_2         
	//   34   67:putfield        #46  <Field byte[] policyHash>
			policyDigestAlgorithm = s1;
	//   35   70:aload_0         
	//   36   71:aload_3         
	//   37   72:putfield        #48  <Field String policyDigestAlgorithm>
			policyUri = s2;
	//   38   75:aload_0         
	//   39   76:aload           4
	//   40   78:putfield        #50  <Field String policyUri>
			return;
	//   41   81:return          
		}
	}

	public String getPolicyDigestAlgorithm()
	{
		return policyDigestAlgorithm;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String policyDigestAlgorithm>
	//    2    4:areturn         
	}

	public byte[] getPolicyHash()
	{
		return policyHash;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field byte[] policyHash>
	//    2    4:areturn         
	}

	public String getPolicyIdentifier()
	{
		return policyIdentifier;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String policyIdentifier>
	//    2    4:areturn         
	}

	public String getPolicyUri()
	{
		return policyUri;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String policyUri>
	//    2    4:areturn         
	}

	SignaturePolicyIdentifier toSignaturePolicyIdentifier()
	{
		String s = DigestAlgorithms.getAllowedDigests(policyDigestAlgorithm);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String policyDigestAlgorithm>
	//    2    4:invokestatic    #64  <Method String DigestAlgorithms.getAllowedDigests(String)>
	//    3    7:astore_3        
		if(s == null || s.length() == 0)
	//*   4    8:aload_3         
	//*   5    9:ifnull          19
	//*   6   12:aload_3         
	//*   7   13:invokevirtual   #31  <Method int String.length()>
	//*   8   16:ifne            29
			throw new IllegalArgumentException("Invalid policy hash algorithm");
	//    9   19:new             #33  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #66  <String "Invalid policy hash algorithm">
	//   12   25:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		Object obj1 = null;
	//   14   29:aconst_null     
	//   15   30:astore_2        
		Object obj = ((Object) (obj1));
	//   16   31:aload_2         
	//   17   32:astore_1        
		if(policyUri != null)
	//*  18   33:aload_0         
	//*  19   34:getfield        #50  <Field String policyUri>
	//*  20   37:ifnull          74
		{
			obj = ((Object) (obj1));
	//   21   40:aload_2         
	//   22   41:astore_1        
			if(policyUri.length() > 0)
	//*  23   42:aload_0         
	//*  24   43:getfield        #50  <Field String policyUri>
	//*  25   46:invokevirtual   #31  <Method int String.length()>
	//*  26   49:ifle            74
				obj = ((Object) (new SigPolicyQualifierInfo(PKCSObjectIdentifiers.id_spq_ets_uri, ((org.spongycastle.asn1.ASN1Encodable) (new DERIA5String(policyUri))))));
	//   27   52:new             #68  <Class SigPolicyQualifierInfo>
	//   28   55:dup             
	//   29   56:getstatic       #74  <Field org.spongycastle.asn1.ASN1ObjectIdentifier PKCSObjectIdentifiers.id_spq_ets_uri>
	//   30   59:new             #76  <Class DERIA5String>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:getfield        #50  <Field String policyUri>
	//   34   67:invokespecial   #77  <Method void DERIA5String(String)>
	//   35   70:invokespecial   #80  <Method void SigPolicyQualifierInfo(org.spongycastle.asn1.ASN1ObjectIdentifier, org.spongycastle.asn1.ASN1Encodable)>
	//   36   73:astore_1        
		}
		obj = ((Object) (new SigPolicyQualifiers(new SigPolicyQualifierInfo[] {
			obj
		})));
	//   37   74:new             #82  <Class SigPolicyQualifiers>
	//   38   77:dup             
	//   39   78:iconst_1        
	//   40   79:anewarray       SigPolicyQualifierInfo[]
	//   41   82:dup             
	//   42   83:iconst_0        
	//   43   84:aload_1         
	//   44   85:aastore         
	//   45   86:invokespecial   #85  <Method void SigPolicyQualifiers(SigPolicyQualifierInfo[])>
	//   46   89:astore_1        
		return new SignaturePolicyIdentifier(new SignaturePolicyId(DERObjectIdentifier.getInstance(((Object) (new DERObjectIdentifier(policyIdentifier.replace("urn:oid:", ""))))), new OtherHashAlgAndValue(new AlgorithmIdentifier(s), ((org.spongycastle.asn1.ASN1OctetString) (new DEROctetString(policyHash)))), ((SigPolicyQualifiers) (obj))));
	//   47   90:new             #87  <Class SignaturePolicyIdentifier>
	//   48   93:dup             
	//   49   94:new             #89  <Class SignaturePolicyId>
	//   50   97:dup             
	//   51   98:new             #91  <Class DERObjectIdentifier>
	//   52  101:dup             
	//   53  102:aload_0         
	//   54  103:getfield        #44  <Field String policyIdentifier>
	//   55  106:ldc1            #93  <String "urn:oid:">
	//   56  108:ldc1            #95  <String "">
	//   57  110:invokevirtual   #99  <Method String String.replace(CharSequence, CharSequence)>
	//   58  113:invokespecial   #100 <Method void DERObjectIdentifier(String)>
	//   59  116:invokestatic    #104 <Method org.spongycastle.asn1.ASN1ObjectIdentifier DERObjectIdentifier.getInstance(Object)>
	//   60  119:new             #106 <Class OtherHashAlgAndValue>
	//   61  122:dup             
	//   62  123:new             #108 <Class AlgorithmIdentifier>
	//   63  126:dup             
	//   64  127:aload_3         
	//   65  128:invokespecial   #109 <Method void AlgorithmIdentifier(String)>
	//   66  131:new             #111 <Class DEROctetString>
	//   67  134:dup             
	//   68  135:aload_0         
	//   69  136:getfield        #46  <Field byte[] policyHash>
	//   70  139:invokespecial   #114 <Method void DEROctetString(byte[])>
	//   71  142:invokespecial   #117 <Method void OtherHashAlgAndValue(AlgorithmIdentifier, org.spongycastle.asn1.ASN1OctetString)>
	//   72  145:aload_1         
	//   73  146:invokespecial   #120 <Method void SignaturePolicyId(org.spongycastle.asn1.ASN1ObjectIdentifier, OtherHashAlgAndValue, SigPolicyQualifiers)>
	//   74  149:invokespecial   #123 <Method void SignaturePolicyIdentifier(SignaturePolicyId)>
	//   75  152:areturn         
	}

	private String policyDigestAlgorithm;
	private byte policyHash[];
	private String policyIdentifier;
	private String policyUri;
}
