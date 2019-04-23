// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.*;
import javax.crypto.Mac;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ajd, apf

public final class apq
	implements ajd
{

	public apq(String s, Key key, int i)
	{
label0:
		{
label1:
			{
label2:
				{
					super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
					if(i < 10)
						break label0;
	//    2    4:iload_3         
	//    3    5:bipush          10
	//    4    7:icmplt          245
					byte byte0 = -1;
	//    5   10:iconst_m1       
	//    6   11:istore          4
					int j = s.hashCode();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #25  <Method int String.hashCode()>
	//    9   17:istore          5
					if(j != 0x9356698c)
	//*  10   19:iload           5
	//*  11   21:ldc1            #26  <Int 0x9356698c>
	//*  12   23:icmpeq          73
					{
						if(j != 0x176240ee)
	//*  13   26:iload           5
	//*  14   28:ldc1            #27  <Int 0x176240ee>
	//*  15   30:icmpeq          58
						{
							if(j == 0x17624bb1 && s.equals("HMACSHA512"))
	//*  16   33:iload           5
	//*  17   35:ldc1            #28  <Int 0x17624bb1>
	//*  18   37:icmpeq          43
	//*  19   40:goto            85
	//*  20   43:aload_1         
	//*  21   44:ldc1            #30  <String "HMACSHA512">
	//*  22   46:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  23   49:ifeq            85
								byte0 = 2;
	//   24   52:iconst_2        
	//   25   53:istore          4
						} else
	//*  26   55:goto            85
						if(s.equals("HMACSHA256"))
	//*  27   58:aload_1         
	//*  28   59:ldc1            #36  <String "HMACSHA256">
	//*  29   61:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  30   64:ifeq            85
							byte0 = 1;
	//   31   67:iconst_1        
	//   32   68:istore          4
					} else
	//*  33   70:goto            85
					if(s.equals("HMACSHA1"))
	//*  34   73:aload_1         
	//*  35   74:ldc1            #38  <String "HMACSHA1">
	//*  36   76:invokevirtual   #34  <Method boolean String.equals(Object)>
	//*  37   79:ifeq            85
						byte0 = 0;
	//   38   82:iconst_0        
	//   39   83:istore          4
					switch(byte0)
	//*  40   85:iload           4
					{
	//*  41   87:tableswitch     0 2: default 112
	//	               0 172
	//	               1 153
	//	               2 134
					default:
						s = String.valueOf(((Object) (s)));
	//   42  112:aload_1         
	//   43  113:invokestatic    #42  <Method String String.valueOf(Object)>
	//   44  116:astore_1        
						if(s.length() != 0)
	//*  45  117:aload_1         
	//*  46  118:invokevirtual   #45  <Method int String.length()>
	//*  47  121:ifeq            226
							s = "unknown Hmac algorithm: ".concat(s);
	//   48  124:ldc1            #47  <String "unknown Hmac algorithm: ">
	//   49  126:aload_1         
	//   50  127:invokevirtual   #51  <Method String String.concat(String)>
	//   51  130:astore_1        
						else
	//*  52  131:goto            236
	//*  53  134:iload_3         
	//*  54  135:bipush          64
	//*  55  137:icmpgt          143
	//*  56  140:goto            178
	//*  57  143:new             #53  <Class InvalidAlgorithmParameterException>
	//*  58  146:dup             
	//*  59  147:ldc1            #55  <String "tag size too big">
	//*  60  149:invokespecial   #58  <Method void InvalidAlgorithmParameterException(String)>
	//*  61  152:athrow          
	//*  62  153:iload_3         
	//*  63  154:bipush          32
	//*  64  156:icmpgt          162
	//*  65  159:goto            178
	//*  66  162:new             #53  <Class InvalidAlgorithmParameterException>
	//*  67  165:dup             
	//*  68  166:ldc1            #55  <String "tag size too big">
	//*  69  168:invokespecial   #58  <Method void InvalidAlgorithmParameterException(String)>
	//*  70  171:athrow          
	//*  71  172:iload_3         
	//*  72  173:bipush          20
	//*  73  175:icmpgt          216
	//*  74  178:aload_0         
	//*  75  179:aload_1         
	//*  76  180:putfield        #60  <Field String c>
	//*  77  183:aload_0         
	//*  78  184:iload_3         
	//*  79  185:putfield        #62  <Field int b>
	//*  80  188:aload_0         
	//*  81  189:aload_2         
	//*  82  190:putfield        #64  <Field Key d>
	//*  83  193:aload_0         
	//*  84  194:getstatic       #69  <Field apf apf.b>
	//*  85  197:aload_1         
	//*  86  198:invokevirtual   #72  <Method Object apf.a(String)>
	//*  87  201:checkcast       #74  <Class Mac>
	//*  88  204:putfield        #76  <Field Mac a>
	//*  89  207:aload_0         
	//*  90  208:getfield        #76  <Field Mac a>
	//*  91  211:aload_2         
	//*  92  212:invokevirtual   #80  <Method void Mac.init(Key)>
	//*  93  215:return          
	//*  94  216:new             #53  <Class InvalidAlgorithmParameterException>
	//*  95  219:dup             
	//*  96  220:ldc1            #55  <String "tag size too big">
	//*  97  222:invokespecial   #58  <Method void InvalidAlgorithmParameterException(String)>
	//*  98  225:athrow          
							s = new String("unknown Hmac algorithm: ");
	//   99  226:new             #21  <Class String>
	//  100  229:dup             
	//  101  230:ldc1            #47  <String "unknown Hmac algorithm: ">
	//  102  232:invokespecial   #81  <Method void String(String)>
	//  103  235:astore_1        
						break label1;

					case 2: // '\002'
						if(i > 64)
							throw new InvalidAlgorithmParameterException("tag size too big");
						break;

					case 1: // '\001'
						if(i > 32)
							throw new InvalidAlgorithmParameterException("tag size too big");
						break;

					case 0: // '\0'
						if(i > 20)
							break label2;
						break;
					}
					c = s;
					b = i;
					d = key;
					a = (Mac)apf.b.a(s);
					a.init(key);
					return;
				}
				throw new InvalidAlgorithmParameterException("tag size too big");
			}
			throw new NoSuchAlgorithmException(s);
	//  104  236:new             #83  <Class NoSuchAlgorithmException>
	//  105  239:dup             
	//  106  240:aload_1         
	//  107  241:invokespecial   #84  <Method void NoSuchAlgorithmException(String)>
	//  108  244:athrow          
		}
		throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
	//  109  245:new             #53  <Class InvalidAlgorithmParameterException>
	//  110  248:dup             
	//  111  249:ldc1            #86  <String "tag size too small, need at least 10 bytes">
	//  112  251:invokespecial   #58  <Method void InvalidAlgorithmParameterException(String)>
	//  113  254:athrow          
	}

	public final byte[] a(byte abyte0[])
	{
		CloneNotSupportedException clonenotsupportedexception;
		Mac mac;
		try
		{
			mac = (Mac)a.clone();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Mac a>
	//    2    4:invokevirtual   #94  <Method Object Mac.clone()>
	//    3    7:checkcast       #74  <Class Mac>
	//    4   10:astore_2        
		}
	//*   5   11:goto            36
	//*   6   14:getstatic       #69  <Field apf apf.b>
	//*   7   17:aload_0         
	//*   8   18:getfield        #60  <Field String c>
	//*   9   21:invokevirtual   #72  <Method Object apf.a(String)>
	//*  10   24:checkcast       #74  <Class Mac>
	//*  11   27:astore_2        
	//*  12   28:aload_2         
	//*  13   29:aload_0         
	//*  14   30:getfield        #64  <Field Key d>
	//*  15   33:invokevirtual   #80  <Method void Mac.init(Key)>
	//*  16   36:aload_2         
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #98  <Method void Mac.update(byte[])>
	//*  19   41:aload_0         
	//*  20   42:getfield        #62  <Field int b>
	//*  21   45:newarray        byte[]
	//*  22   47:astore_1        
	//*  23   48:aload_2         
	//*  24   49:invokevirtual   #102 <Method byte[] Mac.doFinal()>
	//*  25   52:iconst_0        
	//*  26   53:aload_1         
	//*  27   54:iconst_0        
	//*  28   55:aload_0         
	//*  29   56:getfield        #62  <Field int b>
	//*  30   59:invokestatic    #108 <Method void System.arraycopy(Object, int, Object, int, int)>
	//*  31   62:aload_1         
	//*  32   63:areturn         
		// Misplaced declaration of an exception variable
		catch(CloneNotSupportedException clonenotsupportedexception)
		{
			mac = (Mac)apf.b.a(c);
			mac.init(d);
		}
		mac.update(abyte0);
		abyte0 = new byte[b];
		System.arraycopy(((Object) (mac.doFinal())), 0, ((Object) (abyte0)), 0, b);
		return abyte0;
	//*  33   64:astore_2        
	//*  34   65:goto            14
	}

	private Mac a;
	private final int b;
	private final String c;
	private final Key d;
}
