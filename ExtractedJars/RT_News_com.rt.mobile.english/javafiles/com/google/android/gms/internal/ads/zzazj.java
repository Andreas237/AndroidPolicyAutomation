// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.*;
import javax.crypto.Mac;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzauk, zzayy

public final class zzazj
	implements zzauk
{

	public zzazj(String s, Key key, int i)
		throws GeneralSecurityException
	{
		byte byte0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		if(i < 10)
	//*   2    4:iload_3         
	//*   3    5:bipush          10
	//*   4    7:icmpge          20
			throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
	//    5   10:new             #23  <Class InvalidAlgorithmParameterException>
	//    6   13:dup             
	//    7   14:ldc1            #25  <String "tag size too small, need at least 10 bytes">
	//    8   16:invokespecial   #28  <Method void InvalidAlgorithmParameterException(String)>
	//    9   19:athrow          
		byte0 = -1;
	//   10   20:iconst_m1       
	//   11   21:istore          4
		int j = s.hashCode();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #34  <Method int String.hashCode()>
	//   14   27:istore          5
		if(j != 0x9356698c)
	//*  15   29:iload           5
	//*  16   31:ldc1            #35  <Int 0x9356698c>
	//*  17   33:icmpeq          83
		{
			if(j != 0x176240ee)
	//*  18   36:iload           5
	//*  19   38:ldc1            #36  <Int 0x176240ee>
	//*  20   40:icmpeq          68
			{
				if(j == 0x17624bb1 && s.equals("HMACSHA512"))
	//*  21   43:iload           5
	//*  22   45:ldc1            #37  <Int 0x17624bb1>
	//*  23   47:icmpeq          53
	//*  24   50:goto            95
	//*  25   53:aload_1         
	//*  26   54:ldc1            #39  <String "HMACSHA512">
	//*  27   56:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  28   59:ifeq            95
					byte0 = 2;
	//   29   62:iconst_2        
	//   30   63:istore          4
			} else
	//*  31   65:goto            95
			if(s.equals("HMACSHA256"))
	//*  32   68:aload_1         
	//*  33   69:ldc1            #45  <String "HMACSHA256">
	//*  34   71:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  35   74:ifeq            95
				byte0 = 1;
	//   36   77:iconst_1        
	//   37   78:istore          4
		} else
	//*  38   80:goto            95
		if(s.equals("HMACSHA1"))
	//*  39   83:aload_1         
	//*  40   84:ldc1            #47  <String "HMACSHA1">
	//*  41   86:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  42   89:ifeq            95
			byte0 = 0;
	//   43   92:iconst_0        
	//   44   93:istore          4
		byte0;
	//   45   95:iload           4
		JVM INSTR tableswitch 0 2: default 124
	//	               0 178
	//	               1 162
	//	               2 146;
	//   46   97:tableswitch     0 2: default 124
	//	               0 178
	//	               1 162
	//	               2 146
		   goto _L1 _L2 _L3 _L4
_L1:
		s = String.valueOf(((Object) (s)));
	//   47  124:aload_1         
	//   48  125:invokestatic    #51  <Method String String.valueOf(Object)>
	//   49  128:astore_1        
		if(s.length() != 0)
	//*  50  129:aload_1         
	//*  51  130:invokevirtual   #54  <Method int String.length()>
	//*  52  133:ifeq            232
			s = "unknown Hmac algorithm: ".concat(s);
	//   53  136:ldc1            #56  <String "unknown Hmac algorithm: ">
	//   54  138:aload_1         
	//   55  139:invokevirtual   #60  <Method String String.concat(String)>
	//   56  142:astore_1        
		else
	//*  57  143:goto            242
	//*  58  146:iload_3         
	//*  59  147:bipush          64
	//*  60  149:icmple          194
	//*  61  152:new             #23  <Class InvalidAlgorithmParameterException>
	//*  62  155:dup             
	//*  63  156:ldc1            #62  <String "tag size too big">
	//*  64  158:invokespecial   #28  <Method void InvalidAlgorithmParameterException(String)>
	//*  65  161:athrow          
	//*  66  162:iload_3         
	//*  67  163:bipush          32
	//*  68  165:icmple          194
	//*  69  168:new             #23  <Class InvalidAlgorithmParameterException>
	//*  70  171:dup             
	//*  71  172:ldc1            #62  <String "tag size too big">
	//*  72  174:invokespecial   #28  <Method void InvalidAlgorithmParameterException(String)>
	//*  73  177:athrow          
	//*  74  178:iload_3         
	//*  75  179:bipush          20
	//*  76  181:icmple          194
	//*  77  184:new             #23  <Class InvalidAlgorithmParameterException>
	//*  78  187:dup             
	//*  79  188:ldc1            #62  <String "tag size too big">
	//*  80  190:invokespecial   #28  <Method void InvalidAlgorithmParameterException(String)>
	//*  81  193:athrow          
	//*  82  194:aload_0         
	//*  83  195:aload_1         
	//*  84  196:putfield        #64  <Field String zzdol>
	//*  85  199:aload_0         
	//*  86  200:iload_3         
	//*  87  201:putfield        #66  <Field int zzdok>
	//*  88  204:aload_0         
	//*  89  205:aload_2         
	//*  90  206:putfield        #68  <Field Key zzdom>
	//*  91  209:aload_0         
	//*  92  210:getstatic       #74  <Field zzayy zzayy.zzdoa>
	//*  93  213:aload_1         
	//*  94  214:invokevirtual   #78  <Method Object zzayy.zzek(String)>
	//*  95  217:checkcast       #80  <Class Mac>
	//*  96  220:putfield        #82  <Field Mac zzdoj>
	//*  97  223:aload_0         
	//*  98  224:getfield        #82  <Field Mac zzdoj>
	//*  99  227:aload_2         
	//* 100  228:invokevirtual   #86  <Method void Mac.init(Key)>
	//* 101  231:return          
			s = new String("unknown Hmac algorithm: ");
	//  102  232:new             #30  <Class String>
	//  103  235:dup             
	//  104  236:ldc1            #56  <String "unknown Hmac algorithm: ">
	//  105  238:invokespecial   #87  <Method void String(String)>
	//  106  241:astore_1        
		break; /* Loop/switch isn't completed */
_L4:
		if(i > 64)
			throw new InvalidAlgorithmParameterException("tag size too big");
		break MISSING_BLOCK_LABEL_194;
_L3:
		if(i > 32)
			throw new InvalidAlgorithmParameterException("tag size too big");
		break MISSING_BLOCK_LABEL_194;
_L2:
		if(i > 20)
			throw new InvalidAlgorithmParameterException("tag size too big");
		zzdol = s;
		zzdok = i;
		zzdom = key;
		zzdoj = (Mac)zzayy.zzdoa.zzek(s);
		zzdoj.init(key);
		return;
		throw new NoSuchAlgorithmException(s);
	//  107  242:new             #89  <Class NoSuchAlgorithmException>
	//  108  245:dup             
	//  109  246:aload_1         
	//  110  247:invokespecial   #90  <Method void NoSuchAlgorithmException(String)>
	//  111  250:athrow          
	}

	public final byte[] zzg(byte abyte0[])
		throws GeneralSecurityException
	{
		CloneNotSupportedException clonenotsupportedexception;
		Mac mac;
		try
		{
			mac = (Mac)zzdoj.clone();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Mac zzdoj>
	//    2    4:invokevirtual   #100 <Method Object Mac.clone()>
	//    3    7:checkcast       #80  <Class Mac>
	//    4   10:astore_2        
		}
	//*   5   11:goto            36
	//*   6   14:getstatic       #74  <Field zzayy zzayy.zzdoa>
	//*   7   17:aload_0         
	//*   8   18:getfield        #64  <Field String zzdol>
	//*   9   21:invokevirtual   #78  <Method Object zzayy.zzek(String)>
	//*  10   24:checkcast       #80  <Class Mac>
	//*  11   27:astore_2        
	//*  12   28:aload_2         
	//*  13   29:aload_0         
	//*  14   30:getfield        #68  <Field Key zzdom>
	//*  15   33:invokevirtual   #86  <Method void Mac.init(Key)>
	//*  16   36:aload_2         
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #104 <Method void Mac.update(byte[])>
	//*  19   41:aload_0         
	//*  20   42:getfield        #66  <Field int zzdok>
	//*  21   45:newarray        byte[]
	//*  22   47:astore_1        
	//*  23   48:aload_2         
	//*  24   49:invokevirtual   #108 <Method byte[] Mac.doFinal()>
	//*  25   52:iconst_0        
	//*  26   53:aload_1         
	//*  27   54:iconst_0        
	//*  28   55:aload_0         
	//*  29   56:getfield        #66  <Field int zzdok>
	//*  30   59:invokestatic    #114 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  31   62:aload_1         
	//*  32   63:areturn         
		// Misplaced declaration of an exception variable
		catch(CloneNotSupportedException clonenotsupportedexception)
		{
			mac = (Mac)zzayy.zzdoa.zzek(zzdol);
			mac.init(zzdom);
		}
		mac.update(abyte0);
		abyte0 = new byte[zzdok];
		System.arraycopy(((Object) (mac.doFinal())), 0, ((Object) (abyte0)), 0, zzdok);
		return abyte0;
	//*  33   64:astore_2        
	//*  34   65:goto            14
	}

	private Mac zzdoj;
	private final int zzdok;
	private final String zzdol;
	private final Key zzdom;
}
