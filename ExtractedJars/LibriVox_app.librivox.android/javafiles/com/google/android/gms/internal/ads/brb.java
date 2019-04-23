// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqw, bra

public final class brb extends bqw
{

	public brb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void bqw()>
	//    2    4:return          
	}

	public final byte[] a(String s)
	{
		byte byte0;
		String as[] = s.split(" ");
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String " ">
	//    2    3:invokevirtual   #22  <Method String[] String.split(String)>
	//    3    6:astore          6
		int i = as.length;
	//    4    8:aload           6
	//    5   10:arraylength     
	//    6   11:istore_2        
		byte0 = 4;
	//    7   12:iconst_4        
	//    8   13:istore_3        
		if(i == 1)
	//*   9   14:iload_2         
	//*  10   15:iconst_1        
	//*  11   16:icmpne          54
		{
			int j = bra.a(as[0]);
	//   12   19:aload           6
	//   13   21:iconst_0        
	//   14   22:aaload          
	//   15   23:invokestatic    #27  <Method int bra.a(String)>
	//   16   26:istore_2        
			s = ((String) (ByteBuffer.allocate(4)));
	//   17   27:iconst_4        
	//   18   28:invokestatic    #33  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   19   31:astore_1        
			((ByteBuffer) (s)).order(ByteOrder.LITTLE_ENDIAN);
	//   20   32:aload_1         
	//   21   33:getstatic       #39  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   22   36:invokevirtual   #43  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   23   39:pop             
			((ByteBuffer) (s)).putInt(j);
	//   24   40:aload_1         
	//   25   41:iload_2         
	//   26   42:invokevirtual   #46  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   27   45:pop             
			s = ((String) (((ByteBuffer) (s)).array()));
	//   28   46:aload_1         
	//   29   47:invokevirtual   #50  <Method byte[] ByteBuffer.array()>
	//   30   50:astore_1        
		} else
	//*  31   51:goto            225
		if(as.length < 5)
	//*  32   54:aload           6
	//*  33   56:arraylength     
	//*  34   57:iconst_5        
	//*  35   58:icmpge          153
		{
			byte abyte0[] = new byte[as.length << 1];
	//   36   61:aload           6
	//   37   63:arraylength     
	//   38   64:iconst_1        
	//   39   65:ishl            
	//   40   66:newarray        byte[]
	//   41   68:astore          5
			int k = 0;
	//   42   70:iconst_0        
	//   43   71:istore_2        
			do
			{
				s = ((String) (abyte0));
	//   44   72:aload           5
	//   45   74:astore_1        
				if(k >= as.length)
					break;
	//   46   75:iload_2         
	//   47   76:aload           6
	//   48   78:arraylength     
	//   49   79:icmpge          225
				int j1 = bra.a(as[k]);
	//   50   82:aload           6
	//   51   84:iload_2         
	//   52   85:aaload          
	//   53   86:invokestatic    #27  <Method int bra.a(String)>
	//   54   89:istore          4
				j1 = j1 >> 16 ^ 0xffff & j1;
	//   55   91:iload           4
	//   56   93:bipush          16
	//   57   95:ishr            
	//   58   96:ldc1            #51  <Int 65535>
	//   59   98:iload           4
	//   60  100:iand            
	//   61  101:ixor            
	//   62  102:istore          4
				s = ((String) (new byte[2]));
	//   63  104:iconst_2        
	//   64  105:newarray        byte[]
	//   65  107:astore_1        
				s[0] = (byte)j1;
	//   66  108:aload_1         
	//   67  109:iconst_0        
	//   68  110:iload           4
	//   69  112:int2byte        
	//   70  113:bastore         
				s[1] = (byte)(j1 >> 8);
	//   71  114:aload_1         
	//   72  115:iconst_1        
	//   73  116:iload           4
	//   74  118:bipush          8
	//   75  120:ishr            
	//   76  121:int2byte        
	//   77  122:bastore         
				j1 = k << 1;
	//   78  123:iload_2         
	//   79  124:iconst_1        
	//   80  125:ishl            
	//   81  126:istore          4
				abyte0[j1] = s[0];
	//   82  128:aload           5
	//   83  130:iload           4
	//   84  132:aload_1         
	//   85  133:iconst_0        
	//   86  134:baload          
	//   87  135:bastore         
				abyte0[j1 + 1] = s[1];
	//   88  136:aload           5
	//   89  138:iload           4
	//   90  140:iconst_1        
	//   91  141:iadd            
	//   92  142:aload_1         
	//   93  143:iconst_1        
	//   94  144:baload          
	//   95  145:bastore         
				k++;
	//   96  146:iload_2         
	//   97  147:iconst_1        
	//   98  148:iadd            
	//   99  149:istore_2        
			} while(true);
	//  100  150:goto            72
		} else
		{
			byte abyte1[] = new byte[as.length];
	//  101  153:aload           6
	//  102  155:arraylength     
	//  103  156:newarray        byte[]
	//  104  158:astore          5
			int l = 0;
	//  105  160:iconst_0        
	//  106  161:istore_2        
			do
			{
				s = ((String) (abyte1));
	//  107  162:aload           5
	//  108  164:astore_1        
				if(l >= as.length)
					break;
	//  109  165:iload_2         
	//  110  166:aload           6
	//  111  168:arraylength     
	//  112  169:icmpge          225
				int k1 = bra.a(as[l]);
	//  113  172:aload           6
	//  114  174:iload_2         
	//  115  175:aaload          
	//  116  176:invokestatic    #27  <Method int bra.a(String)>
	//  117  179:istore          4
				abyte1[l] = (byte)(k1 >> 24 ^ (k1 & 0xff ^ k1 >> 8 & 0xff ^ k1 >> 16 & 0xff));
	//  118  181:aload           5
	//  119  183:iload_2         
	//  120  184:iload           4
	//  121  186:bipush          24
	//  122  188:ishr            
	//  123  189:iload           4
	//  124  191:sipush          255
	//  125  194:iand            
	//  126  195:iload           4
	//  127  197:bipush          8
	//  128  199:ishr            
	//  129  200:sipush          255
	//  130  203:iand            
	//  131  204:ixor            
	//  132  205:iload           4
	//  133  207:bipush          16
	//  134  209:ishr            
	//  135  210:sipush          255
	//  136  213:iand            
	//  137  214:ixor            
	//  138  215:ixor            
	//  139  216:int2byte        
	//  140  217:bastore         
				l++;
	//  141  218:iload_2         
	//  142  219:iconst_1        
	//  143  220:iadd            
	//  144  221:istore_2        
			} while(true);
	//  145  222:goto            162
		}
		b = ((bqw)this).a();
	//  146  225:aload_0         
	//  147  226:aload_0         
	//  148  227:invokevirtual   #54  <Method MessageDigest bqw.a()>
	//  149  230:putfield        #56  <Field MessageDigest b>
		Object obj = a;
	//  150  233:aload_0         
	//  151  234:getfield        #59  <Field Object a>
	//  152  237:astore          5
		obj;
	//  153  239:aload           5
		JVM INSTR monitorenter ;
	//  154  241:monitorenter    
		if(b == null)
	//* 155  242:aload_0         
	//* 156  243:getfield        #56  <Field MessageDigest b>
	//* 157  246:ifnonnull       256
	//* 158  249:aload           5
			return new byte[0];
	//  159  251:monitorexit     
	//  160  252:iconst_0        
	//  161  253:newarray        byte[]
	//  162  255:areturn         
		b.reset();
	//  163  256:aload_0         
	//  164  257:getfield        #56  <Field MessageDigest b>
	//  165  260:invokevirtual   #64  <Method void MessageDigest.reset()>
		b.update(((byte []) (s)));
	//  166  263:aload_0         
	//  167  264:getfield        #56  <Field MessageDigest b>
	//  168  267:aload_1         
	//  169  268:invokevirtual   #68  <Method void MessageDigest.update(byte[])>
		s = ((String) (b.digest()));
	//  170  271:aload_0         
	//  171  272:getfield        #56  <Field MessageDigest b>
	//  172  275:invokevirtual   #71  <Method byte[] MessageDigest.digest()>
	//  173  278:astore_1        
		int i1;
		if(s.length > 4)
	//* 174  279:aload_1         
	//* 175  280:arraylength     
	//* 176  281:iconst_4        
	//* 177  282:icmple          290
		{
			i1 = ((int) (byte0));
	//  178  285:iload_3         
	//  179  286:istore_2        
			break MISSING_BLOCK_LABEL_293;
	//  180  287:goto            293
		}
		i1 = s.length;
	//  181  290:aload_1         
	//  182  291:arraylength     
	//  183  292:istore_2        
		byte abyte2[];
		abyte2 = new byte[i1];
	//  184  293:iload_2         
	//  185  294:newarray        byte[]
	//  186  296:astore          6
		System.arraycopy(((Object) (s)), 0, ((Object) (abyte2)), 0, abyte2.length);
	//  187  298:aload_1         
	//  188  299:iconst_0        
	//  189  300:aload           6
	//  190  302:iconst_0        
	//  191  303:aload           6
	//  192  305:arraylength     
	//  193  306:invokestatic    #77  <Method void System.arraycopy(Object, int, Object, int, int)>
		obj;
	//  194  309:aload           5
		JVM INSTR monitorexit ;
	//  195  311:monitorexit     
		return abyte2;
	//  196  312:aload           6
	//  197  314:areturn         
		s;
	//  198  315:astore_1        
		obj;
	//  199  316:aload           5
		JVM INSTR monitorexit ;
	//  200  318:monitorexit     
		throw s;
	//  201  319:aload_1         
	//  202  320:athrow          
	}

	private MessageDigest b;
}
