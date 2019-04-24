// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			TSAClient

public class LtvTimestamp
{

	public LtvTimestamp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void timestamp(PdfSignatureAppearance pdfsignatureappearance, TSAClient tsaclient, String s)
		throws IOException, DocumentException, GeneralSecurityException
	{
		int i = tsaclient.getTokenSizeEstimate();
	//    0    0:aload_1         
	//    1    1:invokeinterface #25  <Method int TSAClient.getTokenSizeEstimate()>
	//    2    6:istore_3        
		pdfsignatureappearance.addDeveloperExtension(PdfDeveloperExtension.ESIC_1_7_EXTENSIONLEVEL5);
	//    3    7:aload_0         
	//    4    8:getstatic       #31  <Field PdfDeveloperExtension PdfDeveloperExtension.ESIC_1_7_EXTENSIONLEVEL5>
	//    5   11:invokevirtual   #37  <Method void PdfSignatureAppearance.addDeveloperExtension(PdfDeveloperExtension)>
		pdfsignatureappearance.setVisibleSignature(new Rectangle(0.0F, 0.0F, 0.0F, 0.0F), 1, s);
	//    6   14:aload_0         
	//    7   15:new             #39  <Class Rectangle>
	//    8   18:dup             
	//    9   19:fconst_0        
	//   10   20:fconst_0        
	//   11   21:fconst_0        
	//   12   22:fconst_0        
	//   13   23:invokespecial   #42  <Method void Rectangle(float, float, float, float)>
	//   14   26:iconst_1        
	//   15   27:aload_2         
	//   16   28:invokevirtual   #46  <Method void PdfSignatureAppearance.setVisibleSignature(Rectangle, int, String)>
		s = ((String) (new PdfSignature(PdfName.ADOBE_PPKLITE, PdfName.ETSI_RFC3161)));
	//   17   31:new             #48  <Class PdfSignature>
	//   18   34:dup             
	//   19   35:getstatic       #54  <Field PdfName PdfName.ADOBE_PPKLITE>
	//   20   38:getstatic       #57  <Field PdfName PdfName.ETSI_RFC3161>
	//   21   41:invokespecial   #60  <Method void PdfSignature(PdfName, PdfName)>
	//   22   44:astore_2        
		((PdfSignature) (s)).put(PdfName.TYPE, ((com.itextpdf.text.pdf.PdfObject) (PdfName.DOCTIMESTAMP)));
	//   23   45:aload_2         
	//   24   46:getstatic       #63  <Field PdfName PdfName.TYPE>
	//   25   49:getstatic       #66  <Field PdfName PdfName.DOCTIMESTAMP>
	//   26   52:invokevirtual   #70  <Method void PdfSignature.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		pdfsignatureappearance.setCryptoDictionary(((PdfDictionary) (s)));
	//   27   55:aload_0         
	//   28   56:aload_2         
	//   29   57:invokevirtual   #74  <Method void PdfSignatureAppearance.setCryptoDictionary(PdfDictionary)>
		s = ((String) (new HashMap()));
	//   30   60:new             #76  <Class HashMap>
	//   31   63:dup             
	//   32   64:invokespecial   #77  <Method void HashMap()>
	//   33   67:astore_2        
		((HashMap) (s)).put(((Object) (PdfName.CONTENTS)), ((Object) (new Integer(i * 2 + 2))));
	//   34   68:aload_2         
	//   35   69:getstatic       #80  <Field PdfName PdfName.CONTENTS>
	//   36   72:new             #82  <Class Integer>
	//   37   75:dup             
	//   38   76:iload_3         
	//   39   77:iconst_2        
	//   40   78:imul            
	//   41   79:iconst_2        
	//   42   80:iadd            
	//   43   81:invokespecial   #85  <Method void Integer(int)>
	//   44   84:invokevirtual   #88  <Method Object HashMap.put(Object, Object)>
	//   45   87:pop             
		pdfsignatureappearance.preClose(((HashMap) (s)));
	//   46   88:aload_0         
	//   47   89:aload_2         
	//   48   90:invokevirtual   #92  <Method void PdfSignatureAppearance.preClose(HashMap)>
		s = ((String) (pdfsignatureappearance.getRangeStream()));
	//   49   93:aload_0         
	//   50   94:invokevirtual   #96  <Method InputStream PdfSignatureAppearance.getRangeStream()>
	//   51   97:astore_2        
		MessageDigest messagedigest = tsaclient.getMessageDigest();
	//   52   98:aload_1         
	//   53   99:invokeinterface #100 <Method MessageDigest TSAClient.getMessageDigest()>
	//   54  104:astore          5
		byte abyte0[] = new byte[4096];
	//   55  106:sipush          4096
	//   56  109:newarray        byte[]
	//   57  111:astore          6
		do
		{
			int j = ((InputStream) (s)).read(abyte0);
	//   58  113:aload_2         
	//   59  114:aload           6
	//   60  116:invokevirtual   #106 <Method int InputStream.read(byte[])>
	//   61  119:istore          4
			if(j <= 0)
				break;
	//   62  121:iload           4
	//   63  123:ifle            139
			messagedigest.update(abyte0, 0, j);
	//   64  126:aload           5
	//   65  128:aload           6
	//   66  130:iconst_0        
	//   67  131:iload           4
	//   68  133:invokevirtual   #112 <Method void MessageDigest.update(byte[], int, int)>
		} while(true);
	//   69  136:goto            113
		s = ((String) (messagedigest.digest()));
	//   70  139:aload           5
	//   71  141:invokevirtual   #116 <Method byte[] MessageDigest.digest()>
	//   72  144:astore_2        
		try
		{
			s = ((String) (tsaclient.getTimeStampToken(((byte []) (s)))));
	//   73  145:aload_1         
	//   74  146:aload_2         
	//   75  147:invokeinterface #120 <Method byte[] TSAClient.getTimeStampToken(byte[])>
	//   76  152:astore_2        
		}
	//*  77  153:iload_3         
	//*  78  154:iconst_2        
	//*  79  155:iadd            
	//*  80  156:aload_2         
	//*  81  157:arraylength     
	//*  82  158:icmpge          181
	//*  83  161:new             #13  <Class IOException>
	//*  84  164:dup             
	//*  85  165:ldc1            #122 <String "Not enough space">
	//*  86  167:invokespecial   #125 <Method void IOException(String)>
	//*  87  170:athrow          
		// Misplaced declaration of an exception variable
		catch(PdfSignatureAppearance pdfsignatureappearance)
	//*  88  171:astore_0        
		{
			throw new GeneralSecurityException(((Throwable) (pdfsignatureappearance)));
	//   89  172:new             #17  <Class GeneralSecurityException>
	//   90  175:dup             
	//   91  176:aload_0         
	//   92  177:invokespecial   #128 <Method void GeneralSecurityException(Throwable)>
	//   93  180:athrow          
		}
		if(i + 2 < s.length)
		{
			throw new IOException("Not enough space");
		} else
		{
			tsaclient = ((TSAClient) (new byte[i]));
	//   94  181:iload_3         
	//   95  182:newarray        byte[]
	//   96  184:astore_1        
			System.arraycopy(((Object) (s)), 0, ((Object) (tsaclient)), 0, s.length);
	//   97  185:aload_2         
	//   98  186:iconst_0        
	//   99  187:aload_1         
	//  100  188:iconst_0        
	//  101  189:aload_2         
	//  102  190:arraylength     
	//  103  191:invokestatic    #134 <Method void System.arraycopy(Object, int, Object, int, int)>
			s = ((String) (new PdfDictionary()));
	//  104  194:new             #136 <Class PdfDictionary>
	//  105  197:dup             
	//  106  198:invokespecial   #137 <Method void PdfDictionary()>
	//  107  201:astore_2        
			((PdfDictionary) (s)).put(PdfName.CONTENTS, ((com.itextpdf.text.pdf.PdfObject) ((new PdfString(((byte []) (tsaclient)))).setHexWriting(true))));
	//  108  202:aload_2         
	//  109  203:getstatic       #80  <Field PdfName PdfName.CONTENTS>
	//  110  206:new             #139 <Class PdfString>
	//  111  209:dup             
	//  112  210:aload_1         
	//  113  211:invokespecial   #142 <Method void PdfString(byte[])>
	//  114  214:iconst_1        
	//  115  215:invokevirtual   #146 <Method PdfString PdfString.setHexWriting(boolean)>
	//  116  218:invokevirtual   #147 <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
			pdfsignatureappearance.close(((PdfDictionary) (s)));
	//  117  221:aload_0         
	//  118  222:aload_2         
	//  119  223:invokevirtual   #150 <Method void PdfSignatureAppearance.close(PdfDictionary)>
			return;
	//  120  226:return          
		}
	}
}
