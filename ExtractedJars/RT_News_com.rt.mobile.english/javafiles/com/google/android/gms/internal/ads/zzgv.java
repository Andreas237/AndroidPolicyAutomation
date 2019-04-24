// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgq, zzgu

public final class zzgv extends zzgq
{

	public zzgv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzgq()>
	//    2    4:return          
	}

	public final byte[] zzx(String s)
	{
		byte byte0;
		String as[] = s.split(" ");
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String " ">
	//    2    3:invokevirtual   #22  <Method String[] String.split(String)>
	//    3    6:astore          5
		byte0 = 4;
	//    4    8:iconst_4        
	//    5    9:istore_3        
		if(as.length == 1)
	//*   6   10:aload           5
	//*   7   12:arraylength     
	//*   8   13:iconst_1        
	//*   9   14:icmpne          52
		{
			int i = zzgu.zzz(as[0]);
	//   10   17:aload           5
	//   11   19:iconst_0        
	//   12   20:aaload          
	//   13   21:invokestatic    #28  <Method int zzgu.zzz(String)>
	//   14   24:istore_2        
			s = ((String) (ByteBuffer.allocate(4)));
	//   15   25:iconst_4        
	//   16   26:invokestatic    #34  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   17   29:astore_1        
			((ByteBuffer) (s)).order(ByteOrder.LITTLE_ENDIAN);
	//   18   30:aload_1         
	//   19   31:getstatic       #40  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   20   34:invokevirtual   #44  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   21   37:pop             
			((ByteBuffer) (s)).putInt(i);
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokevirtual   #47  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   25   43:pop             
			s = ((String) (((ByteBuffer) (s)).array()));
	//   26   44:aload_1         
	//   27   45:invokevirtual   #51  <Method byte[] ByteBuffer.array()>
	//   28   48:astore_1        
		} else
	//*  29   49:goto            220
		if(as.length < 5)
	//*  30   52:aload           5
	//*  31   54:arraylength     
	//*  32   55:iconst_5        
	//*  33   56:icmpge          153
		{
			s = ((String) (new byte[as.length << 1]));
	//   34   59:aload           5
	//   35   61:arraylength     
	//   36   62:iconst_1        
	//   37   63:ishl            
	//   38   64:newarray        byte[]
	//   39   66:astore_1        
			for(int j = 0; j < as.length; j++)
	//*  40   67:iconst_0        
	//*  41   68:istore_2        
	//*  42   69:iload_2         
	//*  43   70:aload           5
	//*  44   72:arraylength     
	//*  45   73:icmpge          150
			{
				int i1 = zzgu.zzz(as[j]);
	//   46   76:aload           5
	//   47   78:iload_2         
	//   48   79:aaload          
	//   49   80:invokestatic    #28  <Method int zzgu.zzz(String)>
	//   50   83:istore          4
				i1 = i1 >> 16 ^ 0xffff & i1;
	//   51   85:iload           4
	//   52   87:bipush          16
	//   53   89:ishr            
	//   54   90:ldc1            #52  <Int 65535>
	//   55   92:iload           4
	//   56   94:iand            
	//   57   95:ixor            
	//   58   96:istore          4
				byte abyte0[] = new byte[2];
	//   59   98:iconst_2        
	//   60   99:newarray        byte[]
	//   61  101:astore          6
				abyte0[0] = (byte)i1;
	//   62  103:aload           6
	//   63  105:iconst_0        
	//   64  106:iload           4
	//   65  108:int2byte        
	//   66  109:bastore         
				abyte0[1] = (byte)(i1 >> 8);
	//   67  110:aload           6
	//   68  112:iconst_1        
	//   69  113:iload           4
	//   70  115:bipush          8
	//   71  117:ishr            
	//   72  118:int2byte        
	//   73  119:bastore         
				i1 = j << 1;
	//   74  120:iload_2         
	//   75  121:iconst_1        
	//   76  122:ishl            
	//   77  123:istore          4
				s[i1] = abyte0[0];
	//   78  125:aload_1         
	//   79  126:iload           4
	//   80  128:aload           6
	//   81  130:iconst_0        
	//   82  131:baload          
	//   83  132:bastore         
				s[i1 + 1] = abyte0[1];
	//   84  133:aload_1         
	//   85  134:iload           4
	//   86  136:iconst_1        
	//   87  137:iadd            
	//   88  138:aload           6
	//   89  140:iconst_1        
	//   90  141:baload          
	//   91  142:bastore         
			}

	//   92  143:iload_2         
	//   93  144:iconst_1        
	//   94  145:iadd            
	//   95  146:istore_2        
		} else
	//*  96  147:goto            69
	//*  97  150:goto            220
		{
			s = ((String) (new byte[as.length]));
	//   98  153:aload           5
	//   99  155:arraylength     
	//  100  156:newarray        byte[]
	//  101  158:astore_1        
			for(int k = 0; k < as.length; k++)
	//* 102  159:iconst_0        
	//* 103  160:istore_2        
	//* 104  161:iload_2         
	//* 105  162:aload           5
	//* 106  164:arraylength     
	//* 107  165:icmpge          220
			{
				int j1 = zzgu.zzz(as[k]);
	//  108  168:aload           5
	//  109  170:iload_2         
	//  110  171:aaload          
	//  111  172:invokestatic    #28  <Method int zzgu.zzz(String)>
	//  112  175:istore          4
				s[k] = (byte)(j1 >> 24 ^ (j1 & 0xff ^ j1 >> 8 & 0xff ^ j1 >> 16 & 0xff));
	//  113  177:aload_1         
	//  114  178:iload_2         
	//  115  179:iload           4
	//  116  181:bipush          24
	//  117  183:ishr            
	//  118  184:iload           4
	//  119  186:sipush          255
	//  120  189:iand            
	//  121  190:iload           4
	//  122  192:bipush          8
	//  123  194:ishr            
	//  124  195:sipush          255
	//  125  198:iand            
	//  126  199:ixor            
	//  127  200:iload           4
	//  128  202:bipush          16
	//  129  204:ishr            
	//  130  205:sipush          255
	//  131  208:iand            
	//  132  209:ixor            
	//  133  210:ixor            
	//  134  211:int2byte        
	//  135  212:bastore         
			}

	//  136  213:iload_2         
	//  137  214:iconst_1        
	//  138  215:iadd            
	//  139  216:istore_2        
		}
	//* 140  217:goto            161
		zzaje = ((zzgq)this).zzhg();
	//  141  220:aload_0         
	//  142  221:aload_0         
	//  143  222:invokevirtual   #56  <Method MessageDigest zzgq.zzhg()>
	//  144  225:putfield        #58  <Field MessageDigest zzaje>
		Object obj = mLock;
	//  145  228:aload_0         
	//  146  229:getfield        #62  <Field Object mLock>
	//  147  232:astore          5
		obj;
	//  148  234:aload           5
		JVM INSTR monitorenter ;
	//  149  236:monitorenter    
		if(zzaje == null)
	//* 150  237:aload_0         
	//* 151  238:getfield        #58  <Field MessageDigest zzaje>
	//* 152  241:ifnonnull       251
	//* 153  244:aload           5
			return new byte[0];
	//  154  246:monitorexit     
	//  155  247:iconst_0        
	//  156  248:newarray        byte[]
	//  157  250:areturn         
		zzaje.reset();
	//  158  251:aload_0         
	//  159  252:getfield        #58  <Field MessageDigest zzaje>
	//  160  255:invokevirtual   #67  <Method void MessageDigest.reset()>
		zzaje.update(((byte []) (s)));
	//  161  258:aload_0         
	//  162  259:getfield        #58  <Field MessageDigest zzaje>
	//  163  262:aload_1         
	//  164  263:invokevirtual   #71  <Method void MessageDigest.update(byte[])>
		s = ((String) (zzaje.digest()));
	//  165  266:aload_0         
	//  166  267:getfield        #58  <Field MessageDigest zzaje>
	//  167  270:invokevirtual   #74  <Method byte[] MessageDigest.digest()>
	//  168  273:astore_1        
		int l;
		if(s.length > 4)
	//* 169  274:aload_1         
	//* 170  275:arraylength     
	//* 171  276:iconst_4        
	//* 172  277:icmple          285
		{
			l = ((int) (byte0));
	//  173  280:iload_3         
	//  174  281:istore_2        
			break MISSING_BLOCK_LABEL_288;
	//  175  282:goto            288
		}
		l = s.length;
	//  176  285:aload_1         
	//  177  286:arraylength     
	//  178  287:istore_2        
		byte abyte1[];
		abyte1 = new byte[l];
	//  179  288:iload_2         
	//  180  289:newarray        byte[]
	//  181  291:astore          6
		System.arraycopy(((Object) (s)), 0, ((Object) (abyte1)), 0, abyte1.length);
	//  182  293:aload_1         
	//  183  294:iconst_0        
	//  184  295:aload           6
	//  185  297:iconst_0        
	//  186  298:aload           6
	//  187  300:arraylength     
	//  188  301:invokestatic    #80  <Method void System.arraycopy(Object, int, Object, int, int)>
		obj;
	//  189  304:aload           5
		JVM INSTR monitorexit ;
	//  190  306:monitorexit     
		return abyte1;
	//  191  307:aload           6
	//  192  309:areturn         
		s;
	//  193  310:astore_1        
		obj;
	//  194  311:aload           5
		JVM INSTR monitorexit ;
	//  195  313:monitorexit     
		throw s;
	//  196  314:aload_1         
	//  197  315:athrow          
	}

	private MessageDigest zzaje;
}
