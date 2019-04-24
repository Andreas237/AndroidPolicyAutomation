// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

// Referenced classes of package o:
//			go

public final class gu
{

	public gu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte[] a(String s, String s1)
	{
		String s2;
		String s3;
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		s2 = ((String) (obj));
	//    4    6:aload           7
	//    5    8:astore          5
		s3 = ((String) (obj1));
	//    6   10:aload           8
	//    7   12:astore          6
		int j;
		int k;
		int i;
		java.security.PublicKey publickey;
		byte abyte0[];
		try
		{
			s1 = ((String) (new X509EncodedKeySpec(go.c(s1))));
	//    8   14:new             #17  <Class X509EncodedKeySpec>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokestatic    #23  <Method byte[] go.c(String)>
	//   12   22:invokespecial   #26  <Method void X509EncodedKeySpec(byte[])>
	//   13   25:astore_1        
		}
	//*  14   26:aload           7
	//*  15   28:astore          5
	//*  16   30:aload           8
	//*  17   32:astore          6
	//*  18   34:ldc1            #28  <String "RSA">
	//*  19   36:invokestatic    #34  <Method KeyFactory KeyFactory.getInstance(String)>
	//*  20   39:aload_1         
	//*  21   40:invokevirtual   #38  <Method java.security.PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//*  22   43:astore          9
	//*  23   45:aload           7
	//*  24   47:astore          5
	//*  25   49:aload           8
	//*  26   51:astore          6
	//*  27   53:ldc1            #40  <String "RSA/ECB/PKCS1Padding">
	//*  28   55:invokestatic    #45  <Method Cipher Cipher.getInstance(String)>
	//*  29   58:astore_1        
	//*  30   59:aload           7
	//*  31   61:astore          5
	//*  32   63:aload           8
	//*  33   65:astore          6
	//*  34   67:aload_1         
	//*  35   68:iconst_1        
	//*  36   69:aload           9
	//*  37   71:invokevirtual   #49  <Method void Cipher.init(int, java.security.Key)>
	//*  38   74:aload           7
	//*  39   76:astore          5
	//*  40   78:aload           8
	//*  41   80:astore          6
	//*  42   82:aload_0         
	//*  43   83:ldc1            #51  <String "UTF-8">
	//*  44   85:invokevirtual   #56  <Method byte[] String.getBytes(String)>
	//*  45   88:astore          9
	//*  46   90:aload           7
	//*  47   92:astore          5
	//*  48   94:aload           8
	//*  49   96:astore          6
	//*  50   98:aload_1         
	//*  51   99:invokevirtual   #60  <Method int Cipher.getBlockSize()>
	//*  52  102:istore          4
	//*  53  104:aload           7
	//*  54  106:astore          5
	//*  55  108:aload           8
	//*  56  110:astore          6
	//*  57  112:new             #62  <Class ByteArrayOutputStream>
	//*  58  115:dup             
	//*  59  116:invokespecial   #63  <Method void ByteArrayOutputStream()>
	//*  60  119:astore_0        
	//*  61  120:iconst_0        
	//*  62  121:istore_2        
	//*  63  122:aload_0         
	//*  64  123:astore          5
	//*  65  125:aload_0         
	//*  66  126:astore          6
	//*  67  128:iload_2         
	//*  68  129:aload           9
	//*  69  131:arraylength     
	//*  70  132:icmpge          192
	//*  71  135:aload_0         
	//*  72  136:astore          5
	//*  73  138:aload_0         
	//*  74  139:astore          6
	//*  75  141:aload           9
	//*  76  143:arraylength     
	//*  77  144:iload_2         
	//*  78  145:isub            
	//*  79  146:iload           4
	//*  80  148:icmpge          250
	//*  81  151:aload_0         
	//*  82  152:astore          5
	//*  83  154:aload_0         
	//*  84  155:astore          6
	//*  85  157:aload           9
	//*  86  159:arraylength     
	//*  87  160:iload_2         
	//*  88  161:isub            
	//*  89  162:istore_3        
	//*  90  163:goto            166
	//*  91  166:aload_0         
	//*  92  167:astore          5
	//*  93  169:aload_0         
	//*  94  170:astore          6
	//*  95  172:aload_0         
	//*  96  173:aload_1         
	//*  97  174:aload           9
	//*  98  176:iload_2         
	//*  99  177:iload_3         
	//* 100  178:invokevirtual   #67  <Method byte[] Cipher.doFinal(byte[], int, int)>
	//* 101  181:invokevirtual   #70  <Method void ByteArrayOutputStream.write(byte[])>
	//* 102  184:iload_2         
	//* 103  185:iload           4
	//* 104  187:iadd            
	//* 105  188:istore_2        
	//* 106  189:goto            122
	//* 107  192:aload_0         
	//* 108  193:astore          5
	//* 109  195:aload_0         
	//* 110  196:astore          6
	//* 111  198:aload_0         
	//* 112  199:invokevirtual   #74  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 113  202:astore_1        
	//* 114  203:aload_0         
	//* 115  204:invokevirtual   #77  <Method void ByteArrayOutputStream.close()>
	//* 116  207:aload_1         
	//* 117  208:areturn         
	//* 118  209:aload           6
	//* 119  211:ifnull          234
	//* 120  214:aload           6
	//* 121  216:invokevirtual   #77  <Method void ByteArrayOutputStream.close()>
	//* 122  219:aconst_null     
	//* 123  220:areturn         
	//* 124  221:astore_0        
	//* 125  222:aload           5
	//* 126  224:ifnull          232
	//* 127  227:aload           5
	//* 128  229:invokevirtual   #77  <Method void ByteArrayOutputStream.close()>
	//* 129  232:aload_0         
	//* 130  233:athrow          
	//* 131  234:aconst_null     
	//* 132  235:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			if(s3 != null)
			{
				try
				{
					((ByteArrayOutputStream) (s3)).close();
				}
	//* 133  236:astore_0        
	//* 134  237:goto            209
	//* 135  240:astore_0        
	//* 136  241:aload_1         
	//* 137  242:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//* 138  243:astore_0        
				{
					return null;
	//  139  244:aconst_null     
	//  140  245:areturn         
				}
				return null;
			} else
			{
				return null;
			}
		}
		s2 = ((String) (obj));
		s3 = ((String) (obj1));
		publickey = KeyFactory.getInstance("RSA").generatePublic(((java.security.spec.KeySpec) (s1)));
		s2 = ((String) (obj));
		s3 = ((String) (obj1));
		s1 = ((String) (Cipher.getInstance("RSA/ECB/PKCS1Padding")));
		s2 = ((String) (obj));
		s3 = ((String) (obj1));
		((Cipher) (s1)).init(1, ((java.security.Key) (publickey)));
		s2 = ((String) (obj));
		s3 = ((String) (obj1));
		abyte0 = s.getBytes("UTF-8");
		s2 = ((String) (obj));
		s3 = ((String) (obj1));
		k = ((Cipher) (s1)).getBlockSize();
		s2 = ((String) (obj));
		s3 = ((String) (obj1));
		s = ((String) (new ByteArrayOutputStream()));
		i = 0;
_L3:
		s2 = s;
		s3 = s;
		if(i >= abyte0.length) goto _L2; else goto _L1
_L1:
		s2 = s;
		s3 = s;
		if(abyte0.length - i >= k)
			break MISSING_BLOCK_LABEL_250;
		s2 = s;
		s3 = s;
		j = abyte0.length - i;
_L4:
		s2 = s;
		s3 = s;
		((ByteArrayOutputStream) (s)).write(((Cipher) (s1)).doFinal(abyte0, i, j));
		i += k;
		  goto _L3
_L2:
		s2 = s;
		s3 = s;
		s1 = ((String) (((ByteArrayOutputStream) (s)).toByteArray()));
		try
		{
			((ByteArrayOutputStream) (s)).close();
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return ((byte []) (s1));
		}
		return ((byte []) (s1));
		s;
		if(s2 != null)
			try
			{
				((ByteArrayOutputStream) (s2)).close();
			}
			// Misplaced declaration of an exception variable
			catch(String s1) { }
	//  141  246:astore_1        
		throw s;
	//* 142  247:goto            232
		j = k;
	//  143  250:iload           4
	//  144  252:istore_3        
		  goto _L4
	//* 145  253:goto            166
	}
}
