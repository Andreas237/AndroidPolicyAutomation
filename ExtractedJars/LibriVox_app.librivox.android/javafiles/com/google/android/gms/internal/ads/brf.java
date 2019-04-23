// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqw

public final class brf extends bqw
{

	public brf(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void bqw()>
		int k = i / 8;
	//    2    4:iload_1         
	//    3    5:bipush          8
	//    4    7:idiv            
	//    5    8:istore_3        
		int j = k;
	//    6    9:iload_3         
	//    7   10:istore_2        
		if(i % 8 > 0)
	//*   8   11:iload_1         
	//*   9   12:bipush          8
	//*  10   14:irem            
	//*  11   15:ifle            22
			j = k + 1;
	//   12   18:iload_3         
	//   13   19:iconst_1        
	//   14   20:iadd            
	//   15   21:istore_2        
		c = j;
	//   16   22:aload_0         
	//   17   23:iload_2         
	//   18   24:putfield        #18  <Field int c>
		d = i;
	//   19   27:aload_0         
	//   20   28:iload_1         
	//   21   29:putfield        #20  <Field int d>
	//   22   32:return          
	}

	public final byte[] a(String s)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object a>
	//    2    4:astore          8
		obj;
	//    3    6:aload           8
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		MessageDigest messagedigest;
		b = ((bqw)this).a();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #29  <Method MessageDigest bqw.a()>
	//    8   14:putfield        #31  <Field MessageDigest b>
		messagedigest = b;
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field MessageDigest b>
	//   11   21:astore          9
		boolean flag;
		flag = false;
	//   12   23:iconst_0        
	//   13   24:istore_3        
		if(messagedigest != null)
			break MISSING_BLOCK_LABEL_37;
	//   14   25:aload           9
	//   15   27:ifnonnull       37
		obj;
	//   16   30:aload           8
		JVM INSTR monitorexit ;
	//   17   32:monitorexit     
		return new byte[0];
	//   18   33:iconst_0        
	//   19   34:newarray        byte[]
	//   20   36:areturn         
		int i;
		b.reset();
	//   21   37:aload_0         
	//   22   38:getfield        #31  <Field MessageDigest b>
	//   23   41:invokevirtual   #36  <Method void MessageDigest.reset()>
		b.update(s.getBytes(Charset.forName("UTF-8")));
	//   24   44:aload_0         
	//   25   45:getfield        #31  <Field MessageDigest b>
	//   26   48:aload_1         
	//   27   49:ldc1            #38  <String "UTF-8">
	//   28   51:invokestatic    #44  <Method Charset Charset.forName(String)>
	//   29   54:invokevirtual   #50  <Method byte[] String.getBytes(Charset)>
	//   30   57:invokevirtual   #54  <Method void MessageDigest.update(byte[])>
		s = ((String) (b.digest()));
	//   31   60:aload_0         
	//   32   61:getfield        #31  <Field MessageDigest b>
	//   33   64:invokevirtual   #58  <Method byte[] MessageDigest.digest()>
	//   34   67:astore_1        
		if(s.length > c)
	//*  35   68:aload_1         
	//*  36   69:arraylength     
	//*  37   70:aload_0         
	//*  38   71:getfield        #18  <Field int c>
	//*  39   74:icmple          85
		{
			i = c;
	//   40   77:aload_0         
	//   41   78:getfield        #18  <Field int c>
	//   42   81:istore_2        
			break MISSING_BLOCK_LABEL_88;
	//   43   82:goto            88
		}
		i = s.length;
	//   44   85:aload_1         
	//   45   86:arraylength     
	//   46   87:istore_2        
		byte abyte0[];
		abyte0 = new byte[i];
	//   47   88:iload_2         
	//   48   89:newarray        byte[]
	//   49   91:astore          9
		System.arraycopy(((Object) (s)), 0, ((Object) (abyte0)), 0, abyte0.length);
	//   50   93:aload_1         
	//   51   94:iconst_0        
	//   52   95:aload           9
	//   53   97:iconst_0        
	//   54   98:aload           9
	//   55  100:arraylength     
	//   56  101:invokestatic    #64  <Method void System.arraycopy(Object, int, Object, int, int)>
		if(d % 8 <= 0) goto _L2; else goto _L1
	//   57  104:aload_0         
	//   58  105:getfield        #20  <Field int d>
	//   59  108:bipush          8
	//   60  110:irem            
	//   61  111:ifle            169
_L1:
		long l;
		l = 0L;
	//   62  114:lconst_0        
	//   63  115:lstore          4
		i = ((int) (flag));
	//   64  117:iload_3         
	//   65  118:istore_2        
_L6:
		if(i >= abyte0.length) goto _L4; else goto _L3
	//   66  119:iload_2         
	//   67  120:aload           9
	//   68  122:arraylength     
	//   69  123:icmpge          144
	//*  70  126:lload           4
	//*  71  128:lstore          6
	//*  72  130:iload_2         
	//*  73  131:ifle            181
	//*  74  134:lload           4
	//*  75  136:bipush          8
	//*  76  138:lshl            
	//*  77  139:lstore          6
	//*  78  141:goto            181
_L4:
		l >>>= ((long) (8 - d % 8));
	//   79  144:lload           4
	//   80  146:bipush          8
	//   81  148:aload_0         
	//   82  149:getfield        #20  <Field int d>
	//   83  152:bipush          8
	//   84  154:irem            
	//   85  155:isub            
	//   86  156:lushr           
	//   87  157:lstore          4
		i = c - 1;
	//   88  159:aload_0         
	//   89  160:getfield        #18  <Field int c>
	//   90  163:iconst_1        
	//   91  164:isub            
	//   92  165:istore_2        
		break MISSING_BLOCK_LABEL_202;
	//   93  166:goto            202
_L2:
		obj;
	//   94  169:aload           8
		JVM INSTR monitorexit ;
	//   95  171:monitorexit     
		return abyte0;
	//   96  172:aload           9
	//   97  174:areturn         
		s;
	//   98  175:astore_1        
		obj;
	//   99  176:aload           8
		JVM INSTR monitorexit ;
	//  100  178:monitorexit     
		throw s;
	//  101  179:aload_1         
	//  102  180:athrow          
_L3:
		long l1 = l;
		if(i > 0)
			l1 = l << 8;
		l = l1 + (long)(abyte0[i] & 0xff);
	//  103  181:lload           6
	//  104  183:aload           9
	//  105  185:iload_2         
	//  106  186:baload          
	//  107  187:sipush          255
	//  108  190:iand            
	//  109  191:i2l             
	//  110  192:ladd            
	//  111  193:lstore          4
		i++;
	//  112  195:iload_2         
	//  113  196:iconst_1        
	//  114  197:iadd            
	//  115  198:istore_2        
		if(true) goto _L6; else goto _L5
	//  116  199:goto            119
_L5:
		while(i >= 0) 
	//* 117  202:iload_2         
	//* 118  203:iflt            169
		{
			abyte0[i] = (byte)(int)(255L & l);
	//  119  206:aload           9
	//  120  208:iload_2         
	//  121  209:ldc2w           #65  <Long 255L>
	//  122  212:lload           4
	//  123  214:land            
	//  124  215:l2i             
	//  125  216:int2byte        
	//  126  217:bastore         
			l >>>= 8;
	//  127  218:lload           4
	//  128  220:bipush          8
	//  129  222:lushr           
	//  130  223:lstore          4
			i--;
	//  131  225:iload_2         
	//  132  226:iconst_1        
	//  133  227:isub            
	//  134  228:istore_2        
		}
		  goto _L2
	//* 135  229:goto            202
	}

	private MessageDigest b;
	private final int c;
	private final int d;
}
