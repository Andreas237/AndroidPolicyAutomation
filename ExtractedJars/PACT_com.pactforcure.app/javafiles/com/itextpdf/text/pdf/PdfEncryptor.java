// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.PrivateKey;
import java.util.HashMap;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.RecipientInformation;
import org.spongycastle.cms.jcajce.JceKeyTransEnvelopedRecipient;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStamper, PdfReader

public final class PdfEncryptor
{

	private PdfEncryptor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void encrypt(PdfReader pdfreader, OutputStream outputstream, int i, String s, String s1, int j)
		throws DocumentException, IOException
	{
		pdfreader = ((PdfReader) (new PdfStamper(pdfreader, outputstream)));
	//    0    0:new             #17  <Class PdfStamper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #20  <Method void PdfStamper(PdfReader, OutputStream)>
	//    5    9:astore_0        
		((PdfStamper) (pdfreader)).setEncryption(i, s, s1, j);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:iload           5
	//   11   17:invokevirtual   #24  <Method void PdfStamper.setEncryption(int, String, String, int)>
		((PdfStamper) (pdfreader)).close();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #27  <Method void PdfStamper.close()>
	//   14   24:return          
	}

	public static void encrypt(PdfReader pdfreader, OutputStream outputstream, int i, String s, String s1, int j, HashMap hashmap)
		throws DocumentException, IOException
	{
		pdfreader = ((PdfReader) (new PdfStamper(pdfreader, outputstream)));
	//    0    0:new             #17  <Class PdfStamper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #20  <Method void PdfStamper(PdfReader, OutputStream)>
	//    5    9:astore_0        
		((PdfStamper) (pdfreader)).setEncryption(i, s, s1, j);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:iload           5
	//   11   17:invokevirtual   #24  <Method void PdfStamper.setEncryption(int, String, String, int)>
		((PdfStamper) (pdfreader)).setMoreInfo(((java.util.Map) (hashmap)));
	//   12   20:aload_0         
	//   13   21:aload           6
	//   14   23:invokevirtual   #33  <Method void PdfStamper.setMoreInfo(java.util.Map)>
		((PdfStamper) (pdfreader)).close();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #27  <Method void PdfStamper.close()>
	//   17   30:return          
	}

	public static void encrypt(PdfReader pdfreader, OutputStream outputstream, boolean flag, String s, String s1, int i)
		throws DocumentException, IOException
	{
		pdfreader = ((PdfReader) (new PdfStamper(pdfreader, outputstream)));
	//    0    0:new             #17  <Class PdfStamper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #20  <Method void PdfStamper(PdfReader, OutputStream)>
	//    5    9:astore_0        
		((PdfStamper) (pdfreader)).setEncryption(flag, s, s1, i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:iload           5
	//   11   17:invokevirtual   #39  <Method void PdfStamper.setEncryption(boolean, String, String, int)>
		((PdfStamper) (pdfreader)).close();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #27  <Method void PdfStamper.close()>
	//   14   24:return          
	}

	public static void encrypt(PdfReader pdfreader, OutputStream outputstream, boolean flag, String s, String s1, int i, HashMap hashmap)
		throws DocumentException, IOException
	{
		pdfreader = ((PdfReader) (new PdfStamper(pdfreader, outputstream)));
	//    0    0:new             #17  <Class PdfStamper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #20  <Method void PdfStamper(PdfReader, OutputStream)>
	//    5    9:astore_0        
		((PdfStamper) (pdfreader)).setEncryption(flag, s, s1, i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:iload           5
	//   11   17:invokevirtual   #39  <Method void PdfStamper.setEncryption(boolean, String, String, int)>
		((PdfStamper) (pdfreader)).setMoreInfo(((java.util.Map) (hashmap)));
	//   12   20:aload_0         
	//   13   21:aload           6
	//   14   23:invokevirtual   #33  <Method void PdfStamper.setMoreInfo(java.util.Map)>
		((PdfStamper) (pdfreader)).close();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #27  <Method void PdfStamper.close()>
	//   17   30:return          
	}

	public static void encrypt(PdfReader pdfreader, OutputStream outputstream, byte abyte0[], byte abyte1[], int i, boolean flag)
		throws DocumentException, IOException
	{
		pdfreader = ((PdfReader) (new PdfStamper(pdfreader, outputstream)));
	//    0    0:new             #17  <Class PdfStamper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #20  <Method void PdfStamper(PdfReader, OutputStream)>
	//    5    9:astore_0        
		((PdfStamper) (pdfreader)).setEncryption(abyte0, abyte1, i, flag);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:iload           4
	//   10   15:iload           5
	//   11   17:invokevirtual   #45  <Method void PdfStamper.setEncryption(byte[], byte[], int, boolean)>
		((PdfStamper) (pdfreader)).close();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #27  <Method void PdfStamper.close()>
	//   14   24:return          
	}

	public static void encrypt(PdfReader pdfreader, OutputStream outputstream, byte abyte0[], byte abyte1[], int i, boolean flag, HashMap hashmap)
		throws DocumentException, IOException
	{
		pdfreader = ((PdfReader) (new PdfStamper(pdfreader, outputstream)));
	//    0    0:new             #17  <Class PdfStamper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #20  <Method void PdfStamper(PdfReader, OutputStream)>
	//    5    9:astore_0        
		((PdfStamper) (pdfreader)).setEncryption(abyte0, abyte1, i, flag);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:iload           4
	//   10   15:iload           5
	//   11   17:invokevirtual   #45  <Method void PdfStamper.setEncryption(byte[], byte[], int, boolean)>
		((PdfStamper) (pdfreader)).setMoreInfo(((java.util.Map) (hashmap)));
	//   12   20:aload_0         
	//   13   21:aload           6
	//   14   23:invokevirtual   #33  <Method void PdfStamper.setMoreInfo(java.util.Map)>
		((PdfStamper) (pdfreader)).close();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #27  <Method void PdfStamper.close()>
	//   17   30:return          
	}

	public static byte[] getContent(RecipientInformation recipientinformation, PrivateKey privatekey, String s)
		throws CMSException
	{
		return recipientinformation.getContent(((org.spongycastle.cms.Recipient) ((new JceKeyTransEnvelopedRecipient(privatekey)).setProvider(s))));
	//    0    0:aload_0         
	//    1    1:new             #53  <Class JceKeyTransEnvelopedRecipient>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #56  <Method void JceKeyTransEnvelopedRecipient(PrivateKey)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #60  <Method org.spongycastle.cms.jcajce.JceKeyTransRecipient JceKeyTransEnvelopedRecipient.setProvider(String)>
	//    7   13:invokevirtual   #65  <Method byte[] RecipientInformation.getContent(org.spongycastle.cms.Recipient)>
	//    8   16:areturn         
	}

	public static String getPermissionsVerbose(int i)
	{
		StringBuffer stringbuffer = new StringBuffer("Allowed:");
	//    0    0:new             #69  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:ldc1            #71  <String "Allowed:">
	//    3    6:invokespecial   #74  <Method void StringBuffer(String)>
	//    4    9:astore_1        
		if((i & 0x804) == 2052)
	//*   5   10:iload_0         
	//*   6   11:sipush          2052
	//*   7   14:iand            
	//*   8   15:sipush          2052
	//*   9   18:icmpne          28
			stringbuffer.append(" Printing");
	//   10   21:aload_1         
	//   11   22:ldc1            #76  <String " Printing">
	//   12   24:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   13   27:pop             
		if((i & 8) == 8)
	//*  14   28:iload_0         
	//*  15   29:bipush          8
	//*  16   31:iand            
	//*  17   32:bipush          8
	//*  18   34:icmpne          44
			stringbuffer.append(" Modify contents");
	//   19   37:aload_1         
	//   20   38:ldc1            #82  <String " Modify contents">
	//   21   40:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   22   43:pop             
		if((i & 0x10) == 16)
	//*  23   44:iload_0         
	//*  24   45:bipush          16
	//*  25   47:iand            
	//*  26   48:bipush          16
	//*  27   50:icmpne          60
			stringbuffer.append(" Copy");
	//   28   53:aload_1         
	//   29   54:ldc1            #84  <String " Copy">
	//   30   56:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   31   59:pop             
		if((i & 0x20) == 32)
	//*  32   60:iload_0         
	//*  33   61:bipush          32
	//*  34   63:iand            
	//*  35   64:bipush          32
	//*  36   66:icmpne          76
			stringbuffer.append(" Modify annotations");
	//   37   69:aload_1         
	//   38   70:ldc1            #86  <String " Modify annotations">
	//   39   72:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   40   75:pop             
		if((i & 0x100) == 256)
	//*  41   76:iload_0         
	//*  42   77:sipush          256
	//*  43   80:iand            
	//*  44   81:sipush          256
	//*  45   84:icmpne          94
			stringbuffer.append(" Fill in");
	//   46   87:aload_1         
	//   47   88:ldc1            #88  <String " Fill in">
	//   48   90:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   49   93:pop             
		if((i & 0x200) == 512)
	//*  50   94:iload_0         
	//*  51   95:sipush          512
	//*  52   98:iand            
	//*  53   99:sipush          512
	//*  54  102:icmpne          112
			stringbuffer.append(" Screen readers");
	//   55  105:aload_1         
	//   56  106:ldc1            #90  <String " Screen readers">
	//   57  108:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   58  111:pop             
		if((i & 0x400) == 1024)
	//*  59  112:iload_0         
	//*  60  113:sipush          1024
	//*  61  116:iand            
	//*  62  117:sipush          1024
	//*  63  120:icmpne          130
			stringbuffer.append(" Assembly");
	//   64  123:aload_1         
	//   65  124:ldc1            #92  <String " Assembly">
	//   66  126:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   67  129:pop             
		if((i & 4) == 4)
	//*  68  130:iload_0         
	//*  69  131:iconst_4        
	//*  70  132:iand            
	//*  71  133:iconst_4        
	//*  72  134:icmpne          144
			stringbuffer.append(" Degraded printing");
	//   73  137:aload_1         
	//   74  138:ldc1            #94  <String " Degraded printing">
	//   75  140:invokevirtual   #80  <Method StringBuffer StringBuffer.append(String)>
	//   76  143:pop             
		return stringbuffer.toString();
	//   77  144:aload_1         
	//   78  145:invokevirtual   #98  <Method String StringBuffer.toString()>
	//   79  148:areturn         
	}

	public static boolean isAssemblyAllowed(int i)
	{
		return (i & 0x400) == 1024;
	//    0    0:iload_0         
	//    1    1:sipush          1024
	//    2    4:iand            
	//    3    5:sipush          1024
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean isCopyAllowed(int i)
	{
		return (i & 0x10) == 16;
	//    0    0:iload_0         
	//    1    1:bipush          16
	//    2    3:iand            
	//    3    4:bipush          16
	//    4    6:icmpne          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public static boolean isDegradedPrintingAllowed(int i)
	{
		return (i & 4) == 4;
	//    0    0:iload_0         
	//    1    1:iconst_4        
	//    2    2:iand            
	//    3    3:iconst_4        
	//    4    4:icmpne          9
	//    5    7:iconst_1        
	//    6    8:ireturn         
	//    7    9:iconst_0        
	//    8   10:ireturn         
	}

	public static boolean isFillInAllowed(int i)
	{
		return (i & 0x100) == 256;
	//    0    0:iload_0         
	//    1    1:sipush          256
	//    2    4:iand            
	//    3    5:sipush          256
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean isModifyAnnotationsAllowed(int i)
	{
		return (i & 0x20) == 32;
	//    0    0:iload_0         
	//    1    1:bipush          32
	//    2    3:iand            
	//    3    4:bipush          32
	//    4    6:icmpne          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public static boolean isModifyContentsAllowed(int i)
	{
		return (i & 8) == 8;
	//    0    0:iload_0         
	//    1    1:bipush          8
	//    2    3:iand            
	//    3    4:bipush          8
	//    4    6:icmpne          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public static boolean isPrintingAllowed(int i)
	{
		return (i & 0x804) == 2052;
	//    0    0:iload_0         
	//    1    1:sipush          2052
	//    2    4:iand            
	//    3    5:sipush          2052
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static boolean isScreenReadersAllowed(int i)
	{
		return (i & 0x200) == 512;
	//    0    0:iload_0         
	//    1    1:sipush          512
	//    2    4:iand            
	//    3    5:sipush          512
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}
}
