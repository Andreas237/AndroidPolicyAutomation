// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ais, apv, apr

abstract class apw
	implements ais
{

	apw(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = (byte[])((byte []) (abyte0)).clone();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #21  <Method Object _5B_B.clone()>
	//    5    9:checkcast       #17  <Class byte[]>
	//    6   12:putfield        #23  <Field byte[] a>
		b = a(abyte0, 1);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #26  <Method apv a(byte[], int)>
	//   12   22:putfield        #28  <Field apv b>
		c = a(abyte0, 0);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #26  <Method apv a(byte[], int)>
	//   18   32:putfield        #30  <Field apv c>
	//   19   35:return          
	}

	abstract apv a(byte abyte0[], int i);

	public byte[] a(byte abyte0[], byte abyte1[])
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		b.a();
	//    3    3:aload_0         
	//    4    4:getfield        #28  <Field apv b>
	//    5    7:invokevirtual   #37  <Method int apv.a()>
	//    6   10:pop             
		if(i <= 0x7fffffe3)
	//*   7   11:iload_3         
	//*   8   12:ldc1            #38  <Int 0x7fffffe3>
	//*   9   14:icmpgt          325
		{
			ByteBuffer bytebuffer = ByteBuffer.allocate(abyte0.length + b.a() + 16);
	//   10   17:aload_1         
	//   11   18:arraylength     
	//   12   19:aload_0         
	//   13   20:getfield        #28  <Field apv b>
	//   14   23:invokevirtual   #37  <Method int apv.a()>
	//   15   26:iadd            
	//   16   27:bipush          16
	//   17   29:iadd            
	//   18   30:invokestatic    #44  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   19   33:astore          6
			if(bytebuffer.remaining() >= abyte0.length + b.a() + 16)
	//*  20   35:aload           6
	//*  21   37:invokevirtual   #47  <Method int ByteBuffer.remaining()>
	//*  22   40:aload_1         
	//*  23   41:arraylength     
	//*  24   42:aload_0         
	//*  25   43:getfield        #28  <Field apv b>
	//*  26   46:invokevirtual   #37  <Method int apv.a()>
	//*  27   49:iadd            
	//*  28   50:bipush          16
	//*  29   52:iadd            
	//*  30   53:icmplt          315
			{
				int j = bytebuffer.position();
	//   31   56:aload           6
	//   32   58:invokevirtual   #50  <Method int ByteBuffer.position()>
	//   33   61:istore_3        
				b.a(bytebuffer, abyte0);
	//   34   62:aload_0         
	//   35   63:getfield        #28  <Field apv b>
	//   36   66:aload           6
	//   37   68:aload_1         
	//   38   69:invokevirtual   #53  <Method void apv.a(ByteBuffer, byte[])>
				bytebuffer.position(j);
	//   39   72:aload           6
	//   40   74:iload_3         
	//   41   75:invokevirtual   #56  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   42   78:pop             
				byte abyte2[] = new byte[b.a()];
	//   43   79:aload_0         
	//   44   80:getfield        #28  <Field apv b>
	//   45   83:invokevirtual   #37  <Method int apv.a()>
	//   46   86:newarray        byte[]
	//   47   88:astore          7
				bytebuffer.get(abyte2);
	//   48   90:aload           6
	//   49   92:aload           7
	//   50   94:invokevirtual   #60  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   51   97:pop             
				bytebuffer.limit(bytebuffer.limit() - 16);
	//   52   98:aload           6
	//   53  100:aload           6
	//   54  102:invokevirtual   #63  <Method int ByteBuffer.limit()>
	//   55  105:bipush          16
	//   56  107:isub            
	//   57  108:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   58  111:pop             
				abyte0 = abyte1;
	//   59  112:aload_2         
	//   60  113:astore_1        
				if(abyte1 == null)
	//*  61  114:aload_2         
	//*  62  115:ifnonnull       122
					abyte0 = new byte[0];
	//   63  118:iconst_0        
	//   64  119:newarray        byte[]
	//   65  121:astore_1        
				ByteBuffer bytebuffer1 = c.a(abyte2, 0);
	//   66  122:aload_0         
	//   67  123:getfield        #30  <Field apv c>
	//   68  126:aload           7
	//   69  128:iconst_0        
	//   70  129:invokevirtual   #68  <Method ByteBuffer apv.a(byte[], int)>
	//   71  132:astore          7
				abyte1 = new byte[32];
	//   72  134:bipush          32
	//   73  136:newarray        byte[]
	//   74  138:astore_2        
				bytebuffer1.get(abyte1);
	//   75  139:aload           7
	//   76  141:aload_2         
	//   77  142:invokevirtual   #60  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   78  145:pop             
				if(abyte0.length % 16 == 0)
	//*  79  146:aload_1         
	//*  80  147:arraylength     
	//*  81  148:bipush          16
	//*  82  150:irem            
	//*  83  151:ifne            160
					j = abyte0.length;
	//   84  154:aload_1         
	//   85  155:arraylength     
	//   86  156:istore_3        
				else
	//*  87  157:goto            172
					j = (abyte0.length + 16) - abyte0.length % 16;
	//   88  160:aload_1         
	//   89  161:arraylength     
	//   90  162:bipush          16
	//   91  164:iadd            
	//   92  165:aload_1         
	//   93  166:arraylength     
	//   94  167:bipush          16
	//   95  169:irem            
	//   96  170:isub            
	//   97  171:istore_3        
				int l = bytebuffer.remaining();
	//   98  172:aload           6
	//   99  174:invokevirtual   #47  <Method int ByteBuffer.remaining()>
	//  100  177:istore          5
				int k = l % 16;
	//  101  179:iload           5
	//  102  181:bipush          16
	//  103  183:irem            
	//  104  184:istore          4
				if(k == 0)
	//* 105  186:iload           4
	//* 106  188:ifne            198
					k = l;
	//  107  191:iload           5
	//  108  193:istore          4
				else
	//* 109  195:goto            208
					k = (l + 16) - k;
	//  110  198:iload           5
	//  111  200:bipush          16
	//  112  202:iadd            
	//  113  203:iload           4
	//  114  205:isub            
	//  115  206:istore          4
				k += j;
	//  116  208:iload           4
	//  117  210:iload_3         
	//  118  211:iadd            
	//  119  212:istore          4
				bytebuffer1 = ByteBuffer.allocate(k + 16).order(ByteOrder.LITTLE_ENDIAN);
	//  120  214:iload           4
	//  121  216:bipush          16
	//  122  218:iadd            
	//  123  219:invokestatic    #44  <Method ByteBuffer ByteBuffer.allocate(int)>
	//  124  222:getstatic       #74  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//  125  225:invokevirtual   #78  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//  126  228:astore          7
				bytebuffer1.put(abyte0);
	//  127  230:aload           7
	//  128  232:aload_1         
	//  129  233:invokevirtual   #81  <Method ByteBuffer ByteBuffer.put(byte[])>
	//  130  236:pop             
				bytebuffer1.position(j);
	//  131  237:aload           7
	//  132  239:iload_3         
	//  133  240:invokevirtual   #56  <Method java.nio.Buffer ByteBuffer.position(int)>
	//  134  243:pop             
				bytebuffer1.put(bytebuffer);
	//  135  244:aload           7
	//  136  246:aload           6
	//  137  248:invokevirtual   #84  <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//  138  251:pop             
				bytebuffer1.position(k);
	//  139  252:aload           7
	//  140  254:iload           4
	//  141  256:invokevirtual   #56  <Method java.nio.Buffer ByteBuffer.position(int)>
	//  142  259:pop             
				bytebuffer1.putLong(abyte0.length);
	//  143  260:aload           7
	//  144  262:aload_1         
	//  145  263:arraylength     
	//  146  264:i2l             
	//  147  265:invokevirtual   #88  <Method ByteBuffer ByteBuffer.putLong(long)>
	//  148  268:pop             
				bytebuffer1.putLong(l);
	//  149  269:aload           7
	//  150  271:iload           5
	//  151  273:i2l             
	//  152  274:invokevirtual   #88  <Method ByteBuffer ByteBuffer.putLong(long)>
	//  153  277:pop             
				abyte0 = apr.a(abyte1, bytebuffer1.array());
	//  154  278:aload_2         
	//  155  279:aload           7
	//  156  281:invokevirtual   #92  <Method byte[] ByteBuffer.array()>
	//  157  284:invokestatic    #96  <Method byte[] apr.a(byte[], byte[])>
	//  158  287:astore_1        
				bytebuffer.limit(bytebuffer.limit() + 16);
	//  159  288:aload           6
	//  160  290:aload           6
	//  161  292:invokevirtual   #63  <Method int ByteBuffer.limit()>
	//  162  295:bipush          16
	//  163  297:iadd            
	//  164  298:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//  165  301:pop             
				bytebuffer.put(abyte0);
	//  166  302:aload           6
	//  167  304:aload_1         
	//  168  305:invokevirtual   #81  <Method ByteBuffer ByteBuffer.put(byte[])>
	//  169  308:pop             
				return bytebuffer.array();
	//  170  309:aload           6
	//  171  311:invokevirtual   #92  <Method byte[] ByteBuffer.array()>
	//  172  314:areturn         
			} else
			{
				throw new IllegalArgumentException("Given ByteBuffer output is too small");
	//  173  315:new             #98  <Class IllegalArgumentException>
	//  174  318:dup             
	//  175  319:ldc1            #100 <String "Given ByteBuffer output is too small">
	//  176  321:invokespecial   #103 <Method void IllegalArgumentException(String)>
	//  177  324:athrow          
			}
		} else
		{
			throw new GeneralSecurityException("plaintext too long");
	//  178  325:new             #105 <Class GeneralSecurityException>
	//  179  328:dup             
	//  180  329:ldc1            #107 <String "plaintext too long">
	//  181  331:invokespecial   #108 <Method void GeneralSecurityException(String)>
	//  182  334:athrow          
		}
	}

	private final byte a[];
	private final apv b;
	private final apv c;
}
