// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatz, zzazn, zzazk

abstract class zzazo
	implements zzatz
{

	zzazo(byte abyte0[])
		throws InvalidKeyException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		key = (byte[])((byte []) (abyte0)).clone();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method Object _5B_B.clone()>
	//    5    9:checkcast       #19  <Class byte[]>
	//    6   12:putfield        #25  <Field byte[] key>
		zzdor = zzc(abyte0, 1);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #29  <Method zzazn zzc(byte[], int)>
	//   12   22:putfield        #31  <Field zzazn zzdor>
		zzdos = zzc(abyte0, 0);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #29  <Method zzazn zzc(byte[], int)>
	//   18   32:putfield        #33  <Field zzazn zzdos>
	//   19   35:return          
	}

	abstract zzazn zzc(byte abyte0[], int i)
		throws InvalidKeyException;

	public byte[] zzc(byte abyte0[], byte abyte1[])
		throws GeneralSecurityException
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		zzdor.zzaao();
	//    3    3:aload_0         
	//    4    4:getfield        #31  <Field zzazn zzdor>
	//    5    7:invokevirtual   #44  <Method int zzazn.zzaao()>
	//    6   10:pop             
		if(i > 0x7fffffe3)
	//*   7   11:iload_3         
	//*   8   12:ldc1            #45  <Int 0x7fffffe3>
	//*   9   14:icmple          27
			throw new GeneralSecurityException("plaintext too long");
	//   10   17:new             #38  <Class GeneralSecurityException>
	//   11   20:dup             
	//   12   21:ldc1            #47  <String "plaintext too long">
	//   13   23:invokespecial   #50  <Method void GeneralSecurityException(String)>
	//   14   26:athrow          
		ByteBuffer bytebuffer = ByteBuffer.allocate(abyte0.length + zzdor.zzaao() + 16);
	//   15   27:aload_1         
	//   16   28:arraylength     
	//   17   29:aload_0         
	//   18   30:getfield        #31  <Field zzazn zzdor>
	//   19   33:invokevirtual   #44  <Method int zzazn.zzaao()>
	//   20   36:iadd            
	//   21   37:bipush          16
	//   22   39:iadd            
	//   23   40:invokestatic    #56  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   24   43:astore          6
		if(bytebuffer.remaining() < abyte0.length + zzdor.zzaao() + 16)
	//*  25   45:aload           6
	//*  26   47:invokevirtual   #59  <Method int ByteBuffer.remaining()>
	//*  27   50:aload_1         
	//*  28   51:arraylength     
	//*  29   52:aload_0         
	//*  30   53:getfield        #31  <Field zzazn zzdor>
	//*  31   56:invokevirtual   #44  <Method int zzazn.zzaao()>
	//*  32   59:iadd            
	//*  33   60:bipush          16
	//*  34   62:iadd            
	//*  35   63:icmpge          76
			throw new IllegalArgumentException("Given ByteBuffer output is too small");
	//   36   66:new             #61  <Class IllegalArgumentException>
	//   37   69:dup             
	//   38   70:ldc1            #63  <String "Given ByteBuffer output is too small">
	//   39   72:invokespecial   #64  <Method void IllegalArgumentException(String)>
	//   40   75:athrow          
		i = bytebuffer.position();
	//   41   76:aload           6
	//   42   78:invokevirtual   #67  <Method int ByteBuffer.position()>
	//   43   81:istore_3        
		zzdor.zza(bytebuffer, abyte0);
	//   44   82:aload_0         
	//   45   83:getfield        #31  <Field zzazn zzdor>
	//   46   86:aload           6
	//   47   88:aload_1         
	//   48   89:invokevirtual   #71  <Method void zzazn.zza(ByteBuffer, byte[])>
		bytebuffer.position(i);
	//   49   92:aload           6
	//   50   94:iload_3         
	//   51   95:invokevirtual   #74  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   52   98:pop             
		byte abyte2[] = new byte[zzdor.zzaao()];
	//   53   99:aload_0         
	//   54  100:getfield        #31  <Field zzazn zzdor>
	//   55  103:invokevirtual   #44  <Method int zzazn.zzaao()>
	//   56  106:newarray        byte[]
	//   57  108:astore          7
		bytebuffer.get(abyte2);
	//   58  110:aload           6
	//   59  112:aload           7
	//   60  114:invokevirtual   #78  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   61  117:pop             
		bytebuffer.limit(bytebuffer.limit() - 16);
	//   62  118:aload           6
	//   63  120:aload           6
	//   64  122:invokevirtual   #81  <Method int ByteBuffer.limit()>
	//   65  125:bipush          16
	//   66  127:isub            
	//   67  128:invokevirtual   #83  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   68  131:pop             
		abyte0 = abyte1;
	//   69  132:aload_2         
	//   70  133:astore_1        
		if(abyte1 == null)
	//*  71  134:aload_2         
	//*  72  135:ifnonnull       142
			abyte0 = new byte[0];
	//   73  138:iconst_0        
	//   74  139:newarray        byte[]
	//   75  141:astore_1        
		ByteBuffer bytebuffer1 = zzdos.zzb(abyte2, 0);
	//   76  142:aload_0         
	//   77  143:getfield        #33  <Field zzazn zzdos>
	//   78  146:aload           7
	//   79  148:iconst_0        
	//   80  149:invokevirtual   #87  <Method ByteBuffer zzazn.zzb(byte[], int)>
	//   81  152:astore          7
		abyte1 = new byte[32];
	//   82  154:bipush          32
	//   83  156:newarray        byte[]
	//   84  158:astore_2        
		bytebuffer1.get(abyte1);
	//   85  159:aload           7
	//   86  161:aload_2         
	//   87  162:invokevirtual   #78  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   88  165:pop             
		if(abyte0.length % 16 == 0)
	//*  89  166:aload_1         
	//*  90  167:arraylength     
	//*  91  168:bipush          16
	//*  92  170:irem            
	//*  93  171:ifne            180
			i = abyte0.length;
	//   94  174:aload_1         
	//   95  175:arraylength     
	//   96  176:istore_3        
		else
	//*  97  177:goto            192
			i = (abyte0.length + 16) - abyte0.length % 16;
	//   98  180:aload_1         
	//   99  181:arraylength     
	//  100  182:bipush          16
	//  101  184:iadd            
	//  102  185:aload_1         
	//  103  186:arraylength     
	//  104  187:bipush          16
	//  105  189:irem            
	//  106  190:isub            
	//  107  191:istore_3        
		int k = bytebuffer.remaining();
	//  108  192:aload           6
	//  109  194:invokevirtual   #59  <Method int ByteBuffer.remaining()>
	//  110  197:istore          5
		int j = k % 16;
	//  111  199:iload           5
	//  112  201:bipush          16
	//  113  203:irem            
	//  114  204:istore          4
		if(j == 0)
	//* 115  206:iload           4
	//* 116  208:ifne            218
			j = k;
	//  117  211:iload           5
	//  118  213:istore          4
		else
	//* 119  215:goto            228
			j = (k + 16) - j;
	//  120  218:iload           5
	//  121  220:bipush          16
	//  122  222:iadd            
	//  123  223:iload           4
	//  124  225:isub            
	//  125  226:istore          4
		j += i;
	//  126  228:iload           4
	//  127  230:iload_3         
	//  128  231:iadd            
	//  129  232:istore          4
		bytebuffer1 = ByteBuffer.allocate(j + 16).order(ByteOrder.LITTLE_ENDIAN);
	//  130  234:iload           4
	//  131  236:bipush          16
	//  132  238:iadd            
	//  133  239:invokestatic    #56  <Method ByteBuffer ByteBuffer.allocate(int)>
	//  134  242:getstatic       #93  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//  135  245:invokevirtual   #97  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//  136  248:astore          7
		bytebuffer1.put(abyte0);
	//  137  250:aload           7
	//  138  252:aload_1         
	//  139  253:invokevirtual   #100 <Method ByteBuffer ByteBuffer.put(byte[])>
	//  140  256:pop             
		bytebuffer1.position(i);
	//  141  257:aload           7
	//  142  259:iload_3         
	//  143  260:invokevirtual   #74  <Method java.nio.Buffer ByteBuffer.position(int)>
	//  144  263:pop             
		bytebuffer1.put(bytebuffer);
	//  145  264:aload           7
	//  146  266:aload           6
	//  147  268:invokevirtual   #103 <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//  148  271:pop             
		bytebuffer1.position(j);
	//  149  272:aload           7
	//  150  274:iload           4
	//  151  276:invokevirtual   #74  <Method java.nio.Buffer ByteBuffer.position(int)>
	//  152  279:pop             
		bytebuffer1.putLong(abyte0.length);
	//  153  280:aload           7
	//  154  282:aload_1         
	//  155  283:arraylength     
	//  156  284:i2l             
	//  157  285:invokevirtual   #107 <Method ByteBuffer ByteBuffer.putLong(long)>
	//  158  288:pop             
		bytebuffer1.putLong(k);
	//  159  289:aload           7
	//  160  291:iload           5
	//  161  293:i2l             
	//  162  294:invokevirtual   #107 <Method ByteBuffer ByteBuffer.putLong(long)>
	//  163  297:pop             
		abyte0 = zzazk.zze(abyte1, bytebuffer1.array());
	//  164  298:aload_2         
	//  165  299:aload           7
	//  166  301:invokevirtual   #111 <Method byte[] ByteBuffer.array()>
	//  167  304:invokestatic    #116 <Method byte[] zzazk.zze(byte[], byte[])>
	//  168  307:astore_1        
		bytebuffer.limit(bytebuffer.limit() + 16);
	//  169  308:aload           6
	//  170  310:aload           6
	//  171  312:invokevirtual   #81  <Method int ByteBuffer.limit()>
	//  172  315:bipush          16
	//  173  317:iadd            
	//  174  318:invokevirtual   #83  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//  175  321:pop             
		bytebuffer.put(abyte0);
	//  176  322:aload           6
	//  177  324:aload_1         
	//  178  325:invokevirtual   #100 <Method ByteBuffer ByteBuffer.put(byte[])>
	//  179  328:pop             
		return bytebuffer.array();
	//  180  329:aload           6
	//  181  331:invokevirtual   #111 <Method byte[] ByteBuffer.array()>
	//  182  334:areturn         
	}

	private final byte key[];
	private final zzazn zzdor;
	private final zzazn zzdos;
}
