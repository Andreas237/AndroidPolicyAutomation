// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.*;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			ExternalDigest, DigestAlgorithms

public class BouncyCastleDigest
	implements ExternalDigest
{

	public BouncyCastleDigest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public MessageDigest getMessageDigest(String s)
		throws GeneralSecurityException
	{
		String s1 = DigestAlgorithms.getAllowedDigests(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method String DigestAlgorithms.getAllowedDigests(String)>
	//    2    4:astore_2        
		if(s1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       18
			throw new NoSuchAlgorithmException(s);
	//    5    9:new             #23  <Class NoSuchAlgorithmException>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #26  <Method void NoSuchAlgorithmException(String)>
	//    9   17:athrow          
		if(s1.equals("1.2.840.113549.2.2"))
	//*  10   18:aload_2         
	//*  11   19:ldc1            #28  <String "1.2.840.113549.2.2">
	//*  12   21:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  13   24:ifeq            35
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.MD2.Digest()));
	//   14   27:new             #36  <Class org.spongycastle.jcajce.provider.digest.MD2$Digest>
	//   15   30:dup             
	//   16   31:invokespecial   #37  <Method void org.spongycastle.jcajce.provider.digest.MD2$Digest()>
	//   17   34:areturn         
		if(s1.equals("1.2.840.113549.2.5"))
	//*  18   35:aload_2         
	//*  19   36:ldc1            #39  <String "1.2.840.113549.2.5">
	//*  20   38:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  21   41:ifeq            52
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.MD5.Digest()));
	//   22   44:new             #41  <Class org.spongycastle.jcajce.provider.digest.MD5$Digest>
	//   23   47:dup             
	//   24   48:invokespecial   #42  <Method void org.spongycastle.jcajce.provider.digest.MD5$Digest()>
	//   25   51:areturn         
		if(s1.equals("1.3.14.3.2.26"))
	//*  26   52:aload_2         
	//*  27   53:ldc1            #44  <String "1.3.14.3.2.26">
	//*  28   55:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  29   58:ifeq            69
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.SHA1.Digest()));
	//   30   61:new             #46  <Class org.spongycastle.jcajce.provider.digest.SHA1$Digest>
	//   31   64:dup             
	//   32   65:invokespecial   #47  <Method void org.spongycastle.jcajce.provider.digest.SHA1$Digest()>
	//   33   68:areturn         
		if(s1.equals("2.16.840.1.101.3.4.2.4"))
	//*  34   69:aload_2         
	//*  35   70:ldc1            #49  <String "2.16.840.1.101.3.4.2.4">
	//*  36   72:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  37   75:ifeq            86
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.SHA224.Digest()));
	//   38   78:new             #51  <Class org.spongycastle.jcajce.provider.digest.SHA224$Digest>
	//   39   81:dup             
	//   40   82:invokespecial   #52  <Method void org.spongycastle.jcajce.provider.digest.SHA224$Digest()>
	//   41   85:areturn         
		if(s1.equals("2.16.840.1.101.3.4.2.1"))
	//*  42   86:aload_2         
	//*  43   87:ldc1            #54  <String "2.16.840.1.101.3.4.2.1">
	//*  44   89:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  45   92:ifeq            103
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.SHA256.Digest()));
	//   46   95:new             #56  <Class org.spongycastle.jcajce.provider.digest.SHA256$Digest>
	//   47   98:dup             
	//   48   99:invokespecial   #57  <Method void org.spongycastle.jcajce.provider.digest.SHA256$Digest()>
	//   49  102:areturn         
		if(s1.equals("2.16.840.1.101.3.4.2.2"))
	//*  50  103:aload_2         
	//*  51  104:ldc1            #59  <String "2.16.840.1.101.3.4.2.2">
	//*  52  106:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  53  109:ifeq            120
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.SHA384.Digest()));
	//   54  112:new             #61  <Class org.spongycastle.jcajce.provider.digest.SHA384$Digest>
	//   55  115:dup             
	//   56  116:invokespecial   #62  <Method void org.spongycastle.jcajce.provider.digest.SHA384$Digest()>
	//   57  119:areturn         
		if(s1.equals("2.16.840.1.101.3.4.2.3"))
	//*  58  120:aload_2         
	//*  59  121:ldc1            #64  <String "2.16.840.1.101.3.4.2.3">
	//*  60  123:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  61  126:ifeq            137
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.SHA512.Digest()));
	//   62  129:new             #66  <Class org.spongycastle.jcajce.provider.digest.SHA512$Digest>
	//   63  132:dup             
	//   64  133:invokespecial   #67  <Method void org.spongycastle.jcajce.provider.digest.SHA512$Digest()>
	//   65  136:areturn         
		if(s1.equals("1.3.36.3.2.2"))
	//*  66  137:aload_2         
	//*  67  138:ldc1            #69  <String "1.3.36.3.2.2">
	//*  68  140:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  69  143:ifeq            154
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.RIPEMD128.Digest()));
	//   70  146:new             #71  <Class org.spongycastle.jcajce.provider.digest.RIPEMD128$Digest>
	//   71  149:dup             
	//   72  150:invokespecial   #72  <Method void org.spongycastle.jcajce.provider.digest.RIPEMD128$Digest()>
	//   73  153:areturn         
		if(s1.equals("1.3.36.3.2.1"))
	//*  74  154:aload_2         
	//*  75  155:ldc1            #74  <String "1.3.36.3.2.1">
	//*  76  157:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  77  160:ifeq            171
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.RIPEMD160.Digest()));
	//   78  163:new             #76  <Class org.spongycastle.jcajce.provider.digest.RIPEMD160$Digest>
	//   79  166:dup             
	//   80  167:invokespecial   #77  <Method void org.spongycastle.jcajce.provider.digest.RIPEMD160$Digest()>
	//   81  170:areturn         
		if(s1.equals("1.3.36.3.2.3"))
	//*  82  171:aload_2         
	//*  83  172:ldc1            #79  <String "1.3.36.3.2.3">
	//*  84  174:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  85  177:ifeq            188
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.RIPEMD256.Digest()));
	//   86  180:new             #81  <Class org.spongycastle.jcajce.provider.digest.RIPEMD256$Digest>
	//   87  183:dup             
	//   88  184:invokespecial   #82  <Method void org.spongycastle.jcajce.provider.digest.RIPEMD256$Digest()>
	//   89  187:areturn         
		if(s1.equals("1.2.643.2.2.9"))
	//*  90  188:aload_2         
	//*  91  189:ldc1            #84  <String "1.2.643.2.2.9">
	//*  92  191:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  93  194:ifeq            205
			return ((MessageDigest) (new org.spongycastle.jcajce.provider.digest.GOST3411.Digest()));
	//   94  197:new             #86  <Class org.spongycastle.jcajce.provider.digest.GOST3411$Digest>
	//   95  200:dup             
	//   96  201:invokespecial   #87  <Method void org.spongycastle.jcajce.provider.digest.GOST3411$Digest()>
	//   97  204:areturn         
		else
			throw new NoSuchAlgorithmException(s);
	//   98  205:new             #23  <Class NoSuchAlgorithmException>
	//   99  208:dup             
	//  100  209:aload_1         
	//  101  210:invokespecial   #26  <Method void NoSuchAlgorithmException(String)>
	//  102  213:athrow          
	}
}
