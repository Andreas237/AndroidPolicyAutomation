// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import com.itextpdf.text.pdf.codec.Base64;
import java.io.*;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.tsp.*;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			TSAClient, BouncyCastleDigest, DigestAlgorithms, TSAInfoBouncyCastle

public class TSAClientBouncyCastle
	implements TSAClient
{

	public TSAClientBouncyCastle(String s)
	{
		this(s, ((String) (null)), ((String) (null)), 4096, "SHA-256");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:sipush          4096
	//    5    7:ldc1            #10  <String "SHA-256">
	//    6    9:invokespecial   #38  <Method void TSAClientBouncyCastle(String, String, String, int, String)>
	//    7   12:return          
	}

	public TSAClientBouncyCastle(String s, String s1, String s2)
	{
		this(s, s1, s2, 4096, "SHA-256");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:sipush          4096
	//    5    7:ldc1            #10  <String "SHA-256">
	//    6    9:invokespecial   #38  <Method void TSAClientBouncyCastle(String, String, String, int, String)>
	//    7   12:return          
	}

	public TSAClientBouncyCastle(String s, String s1, String s2, int i, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		tsaURL = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field String tsaURL>
		tsaUsername = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #45  <Field String tsaUsername>
		tsaPassword = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #47  <Field String tsaPassword>
		tokenSizeEstimate = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #49  <Field int tokenSizeEstimate>
		digestAlgorithm = s3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #51  <Field String digestAlgorithm>
	//   17   31:return          
	}

	public MessageDigest getMessageDigest()
		throws GeneralSecurityException
	{
		return (new BouncyCastleDigest()).getMessageDigest(digestAlgorithm);
	//    0    0:new             #57  <Class BouncyCastleDigest>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void BouncyCastleDigest()>
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field String digestAlgorithm>
	//    5   11:invokevirtual   #61  <Method MessageDigest BouncyCastleDigest.getMessageDigest(String)>
	//    6   14:areturn         
	}

	protected byte[] getTSAResponse(byte abyte0[])
		throws IOException
	{
		Object obj = ((Object) (new URL(tsaURL)));
	//    0    0:new             #68  <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field String tsaURL>
	//    4    8:invokespecial   #70  <Method void URL(String)>
	//    5   11:astore_3        
		Object obj1;
		byte abyte2[];
		try
		{
			obj1 = ((Object) (((URL) (obj)).openConnection()));
	//    6   12:aload_3         
	//    7   13:invokevirtual   #74  <Method URLConnection URL.openConnection()>
	//    8   16:astore          4
		}
	//*   9   18:aload           4
	//*  10   20:iconst_1        
	//*  11   21:invokevirtual   #80  <Method void URLConnection.setDoInput(boolean)>
	//*  12   24:aload           4
	//*  13   26:iconst_1        
	//*  14   27:invokevirtual   #83  <Method void URLConnection.setDoOutput(boolean)>
	//*  15   30:aload           4
	//*  16   32:iconst_0        
	//*  17   33:invokevirtual   #86  <Method void URLConnection.setUseCaches(boolean)>
	//*  18   36:aload           4
	//*  19   38:ldc1            #88  <String "Content-Type">
	//*  20   40:ldc1            #90  <String "application/timestamp-query">
	//*  21   42:invokevirtual   #94  <Method void URLConnection.setRequestProperty(String, String)>
	//*  22   45:aload           4
	//*  23   47:ldc1            #96  <String "Content-Transfer-Encoding">
	//*  24   49:ldc1            #98  <String "binary">
	//*  25   51:invokevirtual   #94  <Method void URLConnection.setRequestProperty(String, String)>
	//*  26   54:aload_0         
	//*  27   55:getfield        #45  <Field String tsaUsername>
	//*  28   58:ifnull          137
	//*  29   61:aload_0         
	//*  30   62:getfield        #45  <Field String tsaUsername>
	//*  31   65:ldc1            #100 <String "">
	//*  32   67:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  33   70:ifne            137
	//*  34   73:new             #108 <Class StringBuilder>
	//*  35   76:dup             
	//*  36   77:invokespecial   #109 <Method void StringBuilder()>
	//*  37   80:aload_0         
	//*  38   81:getfield        #45  <Field String tsaUsername>
	//*  39   84:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  40   87:ldc1            #115 <String ":">
	//*  41   89:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  42   92:aload_0         
	//*  43   93:getfield        #47  <Field String tsaPassword>
	//*  44   96:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  45   99:invokevirtual   #119 <Method String StringBuilder.toString()>
	//*  46  102:astore_3        
	//*  47  103:aload           4
	//*  48  105:ldc1            #121 <String "Authorization">
	//*  49  107:new             #108 <Class StringBuilder>
	//*  50  110:dup             
	//*  51  111:invokespecial   #109 <Method void StringBuilder()>
	//*  52  114:ldc1            #123 <String "Basic ">
	//*  53  116:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  54  119:aload_3         
	//*  55  120:invokevirtual   #127 <Method byte[] String.getBytes()>
	//*  56  123:bipush          8
	//*  57  125:invokestatic    #133 <Method String Base64.encodeBytes(byte[], int)>
	//*  58  128:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//*  59  131:invokevirtual   #119 <Method String StringBuilder.toString()>
	//*  60  134:invokevirtual   #94  <Method void URLConnection.setRequestProperty(String, String)>
	//*  61  137:aload           4
	//*  62  139:invokevirtual   #137 <Method OutputStream URLConnection.getOutputStream()>
	//*  63  142:astore_3        
	//*  64  143:aload_3         
	//*  65  144:aload_1         
	//*  66  145:invokevirtual   #143 <Method void OutputStream.write(byte[])>
	//*  67  148:aload_3         
	//*  68  149:invokevirtual   #146 <Method void OutputStream.close()>
	//*  69  152:aload           4
	//*  70  154:invokevirtual   #150 <Method InputStream URLConnection.getInputStream()>
	//*  71  157:astore_1        
	//*  72  158:new             #152 <Class ByteArrayOutputStream>
	//*  73  161:dup             
	//*  74  162:invokespecial   #153 <Method void ByteArrayOutputStream()>
	//*  75  165:astore_3        
	//*  76  166:sipush          1024
	//*  77  169:newarray        byte[]
	//*  78  171:astore          5
	//*  79  173:aload_1         
	//*  80  174:aload           5
	//*  81  176:iconst_0        
	//*  82  177:aload           5
	//*  83  179:arraylength     
	//*  84  180:invokevirtual   #159 <Method int InputStream.read(byte[], int, int)>
	//*  85  183:istore_2        
	//*  86  184:iload_2         
	//*  87  185:iflt            224
	//*  88  188:aload_3         
	//*  89  189:aload           5
	//*  90  191:iconst_0        
	//*  91  192:iload_2         
	//*  92  193:invokevirtual   #162 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//*  93  196:goto            173
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  94  199:astore_1        
		{
			throw new IOException(MessageLocalization.getComposedMessage("failed.to.get.tsa.response.from.1", new Object[] {
				tsaURL
			}));
	//   95  200:new             #66  <Class IOException>
	//   96  203:dup             
	//   97  204:ldc1            #164 <String "failed.to.get.tsa.response.from.1">
	//   98  206:iconst_1        
	//   99  207:anewarray       Object[]
	//  100  210:dup             
	//  101  211:iconst_0        
	//  102  212:aload_0         
	//  103  213:getfield        #43  <Field String tsaURL>
	//  104  216:aastore         
	//  105  217:invokestatic    #170 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  106  220:invokespecial   #171 <Method void IOException(String)>
	//  107  223:athrow          
		}
		((URLConnection) (obj1)).setDoInput(true);
		((URLConnection) (obj1)).setDoOutput(true);
		((URLConnection) (obj1)).setUseCaches(false);
		((URLConnection) (obj1)).setRequestProperty("Content-Type", "application/timestamp-query");
		((URLConnection) (obj1)).setRequestProperty("Content-Transfer-Encoding", "binary");
		if(tsaUsername != null && !tsaUsername.equals(""))
		{
			obj = ((Object) ((new StringBuilder()).append(tsaUsername).append(":").append(tsaPassword).toString()));
			((URLConnection) (obj1)).setRequestProperty("Authorization", (new StringBuilder()).append("Basic ").append(Base64.encodeBytes(((String) (obj)).getBytes(), 8)).toString());
		}
		obj = ((Object) (((URLConnection) (obj1)).getOutputStream()));
		((OutputStream) (obj)).write(abyte0);
		((OutputStream) (obj)).close();
		abyte0 = ((byte []) (((URLConnection) (obj1)).getInputStream()));
		obj = ((Object) (new ByteArrayOutputStream()));
		abyte2 = new byte[1024];
		do
		{
			int i = ((InputStream) (abyte0)).read(abyte2, 0, abyte2.length);
			if(i < 0)
				break;
			((ByteArrayOutputStream) (obj)).write(abyte2, 0, i);
		} while(true);
		byte abyte1[] = ((ByteArrayOutputStream) (obj)).toByteArray();
	//  108  224:aload_3         
	//  109  225:invokevirtual   #174 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  110  228:astore_3        
		obj1 = ((Object) (((URLConnection) (obj1)).getContentEncoding()));
	//  111  229:aload           4
	//  112  231:invokevirtual   #177 <Method String URLConnection.getContentEncoding()>
	//  113  234:astore          4
		abyte0 = abyte1;
	//  114  236:aload_3         
	//  115  237:astore_1        
		if(obj1 != null)
	//* 116  238:aload           4
	//* 117  240:ifnull          267
		{
			abyte0 = abyte1;
	//  118  243:aload_3         
	//  119  244:astore_1        
			if(((String) (obj1)).equalsIgnoreCase("base64"))
	//* 120  245:aload           4
	//* 121  247:ldc1            #179 <String "base64">
	//* 122  249:invokevirtual   #183 <Method boolean String.equalsIgnoreCase(String)>
	//* 123  252:ifeq            267
				abyte0 = Base64.decode(new String(abyte1));
	//  124  255:new             #102 <Class String>
	//  125  258:dup             
	//  126  259:aload_3         
	//  127  260:invokespecial   #185 <Method void String(byte[])>
	//  128  263:invokestatic    #189 <Method byte[] Base64.decode(String)>
	//  129  266:astore_1        
		}
		return abyte0;
	//  130  267:aload_1         
	//  131  268:areturn         
	}

	public byte[] getTimeStampToken(byte abyte0[])
		throws IOException, TSPException
	{
		Object obj = ((Object) (new TimeStampRequestGenerator()));
	//    0    0:new             #194 <Class TimeStampRequestGenerator>
	//    1    3:dup             
	//    2    4:invokespecial   #195 <Method void TimeStampRequestGenerator()>
	//    3    7:astore_3        
		((TimeStampRequestGenerator) (obj)).setCertReq(true);
	//    4    8:aload_3         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #198 <Method void TimeStampRequestGenerator.setCertReq(boolean)>
		BigInteger biginteger = BigInteger.valueOf(System.currentTimeMillis());
	//    7   13:invokestatic    #204 <Method long System.currentTimeMillis()>
	//    8   16:invokestatic    #210 <Method BigInteger BigInteger.valueOf(long)>
	//    9   19:astore          4
		obj = ((Object) (((TimeStampRequestGenerator) (obj)).generate(new ASN1ObjectIdentifier(DigestAlgorithms.getAllowedDigests(digestAlgorithm)), abyte0, biginteger)));
	//   10   21:aload_3         
	//   11   22:new             #212 <Class ASN1ObjectIdentifier>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:getfield        #51  <Field String digestAlgorithm>
	//   15   30:invokestatic    #218 <Method String DigestAlgorithms.getAllowedDigests(String)>
	//   16   33:invokespecial   #219 <Method void ASN1ObjectIdentifier(String)>
	//   17   36:aload_1         
	//   18   37:aload           4
	//   19   39:invokevirtual   #223 <Method TimeStampRequest TimeStampRequestGenerator.generate(ASN1ObjectIdentifier, byte[], BigInteger)>
	//   20   42:astore_3        
		abyte0 = ((byte []) (new TimeStampResponse(getTSAResponse(((TimeStampRequest) (obj)).getEncoded()))));
	//   21   43:new             #225 <Class TimeStampResponse>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:aload_3         
	//   25   49:invokevirtual   #230 <Method byte[] TimeStampRequest.getEncoded()>
	//   26   52:invokevirtual   #232 <Method byte[] getTSAResponse(byte[])>
	//   27   55:invokespecial   #233 <Method void TimeStampResponse(byte[])>
	//   28   58:astore_1        
		((TimeStampResponse) (abyte0)).validate(((TimeStampRequest) (obj)));
	//   29   59:aload_1         
	//   30   60:aload_3         
	//   31   61:invokevirtual   #237 <Method void TimeStampResponse.validate(TimeStampRequest)>
		obj = ((Object) (((TimeStampResponse) (abyte0)).getFailInfo()));
	//   32   64:aload_1         
	//   33   65:invokevirtual   #241 <Method PKIFailureInfo TimeStampResponse.getFailInfo()>
	//   34   68:astore_3        
		int i;
		if(obj == null)
	//*  35   69:aload_3         
	//*  36   70:ifnonnull       110
			i = 0;
	//   37   73:iconst_0        
	//   38   74:istore_2        
		else
	//*  39   75:iload_2         
	//*  40   76:ifeq            118
	//*  41   79:new             #66  <Class IOException>
	//*  42   82:dup             
	//*  43   83:ldc1            #243 <String "invalid.tsa.1.response.code.2">
	//*  44   85:iconst_2        
	//*  45   86:anewarray       Object[]
	//*  46   89:dup             
	//*  47   90:iconst_0        
	//*  48   91:aload_0         
	//*  49   92:getfield        #43  <Field String tsaURL>
	//*  50   95:aastore         
	//*  51   96:dup             
	//*  52   97:iconst_1        
	//*  53   98:iload_2         
	//*  54   99:invokestatic    #246 <Method String String.valueOf(int)>
	//*  55  102:aastore         
	//*  56  103:invokestatic    #170 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  57  106:invokespecial   #171 <Method void IOException(String)>
	//*  58  109:athrow          
			i = ((PKIFailureInfo) (obj)).intValue();
	//   59  110:aload_3         
	//   60  111:invokevirtual   #252 <Method int PKIFailureInfo.intValue()>
	//   61  114:istore_2        
		if(i != 0)
			throw new IOException(MessageLocalization.getComposedMessage("invalid.tsa.1.response.code.2", new Object[] {
				tsaURL, String.valueOf(i)
			}));
	//*  62  115:goto            75
		obj = ((Object) (((TimeStampResponse) (abyte0)).getTimeStampToken()));
	//   63  118:aload_1         
	//   64  119:invokevirtual   #255 <Method TimeStampToken TimeStampResponse.getTimeStampToken()>
	//   65  122:astore_3        
		if(obj == null)
	//*  66  123:aload_3         
	//*  67  124:ifnonnull       159
			throw new IOException(MessageLocalization.getComposedMessage("tsa.1.failed.to.return.time.stamp.token.2", new Object[] {
				tsaURL, ((TimeStampResponse) (abyte0)).getStatusString()
			}));
	//   68  127:new             #66  <Class IOException>
	//   69  130:dup             
	//   70  131:ldc2            #257 <String "tsa.1.failed.to.return.time.stamp.token.2">
	//   71  134:iconst_2        
	//   72  135:anewarray       Object[]
	//   73  138:dup             
	//   74  139:iconst_0        
	//   75  140:aload_0         
	//   76  141:getfield        #43  <Field String tsaURL>
	//   77  144:aastore         
	//   78  145:dup             
	//   79  146:iconst_1        
	//   80  147:aload_1         
	//   81  148:invokevirtual   #260 <Method String TimeStampResponse.getStatusString()>
	//   82  151:aastore         
	//   83  152:invokestatic    #170 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   84  155:invokespecial   #171 <Method void IOException(String)>
	//   85  158:athrow          
		abyte0 = ((byte []) (((TimeStampToken) (obj)).getTimeStampInfo()));
	//   86  159:aload_3         
	//   87  160:invokevirtual   #266 <Method TimeStampTokenInfo TimeStampToken.getTimeStampInfo()>
	//   88  163:astore_1        
		byte abyte1[] = ((TimeStampToken) (obj)).getEncoded();
	//   89  164:aload_3         
	//   90  165:invokevirtual   #267 <Method byte[] TimeStampToken.getEncoded()>
	//   91  168:astore_3        
		LOGGER.info((new StringBuilder()).append("Timestamp generated: ").append(((Object) (((TimeStampTokenInfo) (abyte0)).getGenTime()))).toString());
	//   92  169:getstatic       #32  <Field Logger LOGGER>
	//   93  172:new             #108 <Class StringBuilder>
	//   94  175:dup             
	//   95  176:invokespecial   #109 <Method void StringBuilder()>
	//   96  179:ldc2            #269 <String "Timestamp generated: ">
	//   97  182:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   98  185:aload_1         
	//   99  186:invokevirtual   #275 <Method java.util.Date TimeStampTokenInfo.getGenTime()>
	//  100  189:invokevirtual   #278 <Method StringBuilder StringBuilder.append(Object)>
	//  101  192:invokevirtual   #119 <Method String StringBuilder.toString()>
	//  102  195:invokeinterface #283 <Method void Logger.info(String)>
		if(tsaInfo != null)
	//* 103  200:aload_0         
	//* 104  201:getfield        #285 <Field TSAInfoBouncyCastle tsaInfo>
	//* 105  204:ifnull          217
			tsaInfo.inspectTimeStampTokenInfo(((TimeStampTokenInfo) (abyte0)));
	//  106  207:aload_0         
	//  107  208:getfield        #285 <Field TSAInfoBouncyCastle tsaInfo>
	//  108  211:aload_1         
	//  109  212:invokeinterface #291 <Method void TSAInfoBouncyCastle.inspectTimeStampTokenInfo(TimeStampTokenInfo)>
		tokenSizeEstimate = abyte1.length + 32;
	//  110  217:aload_0         
	//  111  218:aload_3         
	//  112  219:arraylength     
	//  113  220:bipush          32
	//  114  222:iadd            
	//  115  223:putfield        #49  <Field int tokenSizeEstimate>
		return abyte1;
	//  116  226:aload_3         
	//  117  227:areturn         
	}

	public int getTokenSizeEstimate()
	{
		return tokenSizeEstimate;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int tokenSizeEstimate>
	//    2    4:ireturn         
	}

	public void setTSAInfo(TSAInfoBouncyCastle tsainfobouncycastle)
	{
		tsaInfo = tsainfobouncycastle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #285 <Field TSAInfoBouncyCastle tsaInfo>
	//    3    5:return          
	}

	public static final String DEFAULTHASHALGORITHM = "SHA-256";
	public static final int DEFAULTTOKENSIZE = 4096;
	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/security/TSAClientBouncyCastle);
	protected String digestAlgorithm;
	protected int tokenSizeEstimate;
	protected TSAInfoBouncyCastle tsaInfo;
	protected String tsaPassword;
	protected String tsaURL;
	protected String tsaUsername;

	static 
	{
	//    0    0:ldc1            #2   <Class TSAClientBouncyCastle>
	//    1    2:invokestatic    #30  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #32  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
