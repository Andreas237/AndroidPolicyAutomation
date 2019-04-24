// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;
import java.util.BitSet;

// Referenced classes of package o:
//			im

public final class jn
{

	protected jn(im im1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		e = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "">
	//    4    7:putfield        #21  <Field String e>
		d = null;
	//    5   10:aload_0         
	//    6   11:aconst_null     
	//    7   12:putfield        #23  <Field File d>
		b = im1;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:putfield        #25  <Field im b>
	//   11   20:return          
	}

	protected final void c(long l, byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		d = b.d(l);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #25  <Field im b>
	//    5    7:lload_1         
	//    6    8:invokevirtual   #36  <Method File im.d(long)>
	//    7   11:putfield        #23  <Field File d>
		obj = ((Object) (d));
	//    8   14:aload_0         
	//    9   15:getfield        #23  <Field File d>
	//   10   18:astore          6
		if(obj != null)
			break MISSING_BLOCK_LABEL_28;
	//   11   20:aload           6
	//   12   22:ifnonnull       28
		this;
	//   13   25:aload_0         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		byte abyte1[];
		c = new RandomAccessFile(d, "rw");
	//   16   28:aload_0         
	//   17   29:new             #38  <Class RandomAccessFile>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:getfield        #23  <Field File d>
	//   21   37:ldc1            #40  <String "rw">
	//   22   39:invokespecial   #43  <Method void RandomAccessFile(File, String)>
	//   23   42:putfield        #45  <Field RandomAccessFile c>
		abyte1 = new byte[b.a()];
	//   24   45:aload_0         
	//   25   46:getfield        #25  <Field im b>
	//   26   49:invokevirtual   #49  <Method int im.a()>
	//   27   52:newarray        byte[]
	//   28   54:astore          6
		int i;
		if(c.read(abyte1) == -1)
	//*  29   56:aload_0         
	//*  30   57:getfield        #45  <Field RandomAccessFile c>
	//*  31   60:aload           6
	//*  32   62:invokevirtual   #53  <Method int RandomAccessFile.read(byte[])>
	//*  33   65:iconst_m1       
	//*  34   66:icmpne          75
		{
			i = 0;
	//   35   69:iconst_0        
	//   36   70:istore          4
			break MISSING_BLOCK_LABEL_84;
	//   37   72:goto            84
		}
		i = c.readInt();
	//   38   75:aload_0         
	//   39   76:getfield        #45  <Field RandomAccessFile c>
	//   40   79:invokevirtual   #56  <Method int RandomAccessFile.readInt()>
	//   41   82:istore          4
		int j;
		abyte1 = ((byte []) (im.c(abyte1)));
	//   42   84:aload           6
	//   43   86:invokestatic    #59  <Method BitSet im.c(byte[])>
	//   44   89:astore          6
		j = b.a();
	//   45   91:aload_0         
	//   46   92:getfield        #25  <Field im b>
	//   47   95:invokevirtual   #49  <Method int im.a()>
	//   48   98:istore          5
		if(i < 0)
			break MISSING_BLOCK_LABEL_119;
	//   49  100:iload           4
	//   50  102:iflt            119
		if(i <= b.a() << 3)
			break MISSING_BLOCK_LABEL_156;
	//   51  105:iload           4
	//   52  107:aload_0         
	//   53  108:getfield        #25  <Field im b>
	//   54  111:invokevirtual   #49  <Method int im.a()>
	//   55  114:iconst_3        
	//   56  115:ishl            
	//   57  116:icmple          156
		c.close();
	//   58  119:aload_0         
	//   59  120:getfield        #45  <Field RandomAccessFile c>
	//   60  123:invokevirtual   #62  <Method void RandomAccessFile.close()>
		d.delete();
	//   61  126:aload_0         
	//   62  127:getfield        #23  <Field File d>
	//   63  130:invokevirtual   #68  <Method boolean File.delete()>
	//   64  133:pop             
		abyte0 = ((byte []) (c));
	//   65  134:aload_0         
	//   66  135:getfield        #45  <Field RandomAccessFile c>
	//   67  138:astore_3        
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_153;
	//   68  139:aload_3         
	//   69  140:ifnull          153
		try
		{
			c.close();
	//   70  143:aload_0         
	//   71  144:getfield        #45  <Field RandomAccessFile c>
	//   72  147:invokevirtual   #62  <Method void RandomAccessFile.close()>
		}
	//*  73  150:aload_0         
	//*  74  151:monitorexit     
	//*  75  152:return          
	//*  76  153:aload_0         
	//*  77  154:monitorexit     
	//*  78  155:return          
	//*  79  156:aload_0         
	//*  80  157:getfield        #45  <Field RandomAccessFile c>
	//*  81  160:iload           5
	//*  82  162:iconst_4        
	//*  83  163:iadd            
	//*  84  164:iload           4
	//*  85  166:sipush          1500
	//*  86  169:imul            
	//*  87  170:iadd            
	//*  88  171:i2l             
	//*  89  172:invokevirtual   #72  <Method void RandomAccessFile.seek(long)>
	//*  90  175:aload_3         
	//*  91  176:invokestatic    #75  <Method byte[] im.e(byte[])>
	//*  92  179:astore_3        
	//*  93  180:aload_0         
	//*  94  181:getfield        #45  <Field RandomAccessFile c>
	//*  95  184:aload_3         
	//*  96  185:arraylength     
	//*  97  186:invokevirtual   #79  <Method void RandomAccessFile.writeInt(int)>
	//*  98  189:aload_0         
	//*  99  190:getfield        #45  <Field RandomAccessFile c>
	//* 100  193:lload_1         
	//* 101  194:invokevirtual   #82  <Method void RandomAccessFile.writeLong(long)>
	//* 102  197:aload_0         
	//* 103  198:getfield        #45  <Field RandomAccessFile c>
	//* 104  201:aload_3         
	//* 105  202:invokevirtual   #86  <Method void RandomAccessFile.write(byte[])>
	//* 106  205:aload           6
	//* 107  207:iload           4
	//* 108  209:iconst_1        
	//* 109  210:invokevirtual   #92  <Method void BitSet.set(int, boolean)>
	//* 110  213:aload_0         
	//* 111  214:getfield        #45  <Field RandomAccessFile c>
	//* 112  217:lconst_0        
	//* 113  218:invokevirtual   #72  <Method void RandomAccessFile.seek(long)>
	//* 114  221:aload_0         
	//* 115  222:getfield        #45  <Field RandomAccessFile c>
	//* 116  225:aload           6
	//* 117  227:invokestatic    #95  <Method byte[] im.e(BitSet)>
	//* 118  230:invokevirtual   #86  <Method void RandomAccessFile.write(byte[])>
	//* 119  233:iload           4
	//* 120  235:iconst_1        
	//* 121  236:iadd            
	//* 122  237:istore          5
	//* 123  239:iload           5
	//* 124  241:istore          4
	//* 125  243:iload           5
	//* 126  245:aload_0         
	//* 127  246:getfield        #25  <Field im b>
	//* 128  249:invokevirtual   #49  <Method int im.a()>
	//* 129  252:iconst_3        
	//* 130  253:ishl            
	//* 131  254:icmpne          260
	//* 132  257:iconst_0        
	//* 133  258:istore          4
	//* 134  260:aload_0         
	//* 135  261:getfield        #45  <Field RandomAccessFile c>
	//* 136  264:iload           4
	//* 137  266:invokevirtual   #79  <Method void RandomAccessFile.writeInt(int)>
	//* 138  269:aload_0         
	//* 139  270:getfield        #21  <Field String e>
	//* 140  273:aload_0         
	//* 141  274:getfield        #23  <Field File d>
	//* 142  277:invokevirtual   #99  <Method String File.getName()>
	//* 143  280:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//* 144  283:ifne            297
	//* 145  286:aload_0         
	//* 146  287:aload_0         
	//* 147  288:getfield        #23  <Field File d>
	//* 148  291:invokevirtual   #99  <Method String File.getName()>
	//* 149  294:putfield        #21  <Field String e>
	//* 150  297:aload_0         
	//* 151  298:getfield        #23  <Field File d>
	//* 152  301:invokevirtual   #109 <Method long File.length()>
	//* 153  304:pop2            
	//* 154  305:aload_0         
	//* 155  306:getfield        #45  <Field RandomAccessFile c>
	//* 156  309:astore_3        
	//* 157  310:aload_3         
	//* 158  311:ifnull          394
	//* 159  314:aload_0         
	//* 160  315:getfield        #45  <Field RandomAccessFile c>
	//* 161  318:invokevirtual   #62  <Method void RandomAccessFile.close()>
	//* 162  321:goto            394
	//* 163  324:goto            394
	//* 164  327:astore_3        
	//* 165  328:aload_0         
	//* 166  329:getfield        #45  <Field RandomAccessFile c>
	//* 167  332:astore_3        
	//* 168  333:aload_3         
	//* 169  334:ifnull          394
	//* 170  337:aload_0         
	//* 171  338:getfield        #45  <Field RandomAccessFile c>
	//* 172  341:invokevirtual   #62  <Method void RandomAccessFile.close()>
	//* 173  344:goto            394
	//* 174  347:goto            394
	//* 175  350:astore_3        
	//* 176  351:aload_0         
	//* 177  352:getfield        #45  <Field RandomAccessFile c>
	//* 178  355:astore_3        
	//* 179  356:aload_3         
	//* 180  357:ifnull          394
	//* 181  360:aload_0         
	//* 182  361:getfield        #45  <Field RandomAccessFile c>
	//* 183  364:invokevirtual   #62  <Method void RandomAccessFile.close()>
	//* 184  367:goto            394
	//* 185  370:goto            394
	//* 186  373:astore_3        
	//* 187  374:aload_0         
	//* 188  375:getfield        #45  <Field RandomAccessFile c>
	//* 189  378:astore          6
	//* 190  380:aload           6
	//* 191  382:ifnull          392
	//* 192  385:aload_0         
	//* 193  386:getfield        #45  <Field RandomAccessFile c>
	//* 194  389:invokevirtual   #62  <Method void RandomAccessFile.close()>
	//* 195  392:aload_3         
	//* 196  393:athrow          
	//* 197  394:aload_0         
	//* 198  395:aconst_null     
	//* 199  396:putfield        #23  <Field File d>
	//* 200  399:aload_0         
	//* 201  400:monitorexit     
	//* 202  401:return          
	//* 203  402:astore_3        
	//* 204  403:aload_0         
	//* 205  404:monitorexit     
	//* 206  405:aload_3         
	//* 207  406:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			return;
		}
		this;
		JVM INSTR monitorexit ;
		return;
		c.seek(j + 4 + i * 1500);
		abyte0 = im.e(abyte0);
		c.writeInt(abyte0.length);
		c.writeLong(l);
		c.write(abyte0);
		((BitSet) (abyte1)).set(i, true);
		c.seek(0L);
		c.write(im.e(((BitSet) (abyte1))));
		j = i + 1;
		i = j;
		if(j == b.a() << 3)
			i = 0;
		c.writeInt(i);
		if(!e.equalsIgnoreCase(d.getName()))
			e = d.getName();
		d.length();
		abyte0 = ((byte []) (c));
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_394;
		RandomAccessFile randomaccessfile;
		try
		{
			c.close();
		}
	//* 208  407:astore_3        
	//* 209  408:goto            153
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//  210  411:astore_3        
		break MISSING_BLOCK_LABEL_394;
	//  211  412:goto            324
		abyte0;
		abyte0 = ((byte []) (c));
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_394;
		try
		{
			c.close();
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//  212  415:astore_3        
		break MISSING_BLOCK_LABEL_394;
	//  213  416:goto            347
		abyte0;
		abyte0 = ((byte []) (c));
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_394;
		try
		{
			c.close();
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//  214  419:astore_3        
		break MISSING_BLOCK_LABEL_394;
	//  215  420:goto            370
		abyte0;
		randomaccessfile = c;
		if(randomaccessfile == null)
			break MISSING_BLOCK_LABEL_392;
		try
		{
			c.close();
		}
		catch(IOException ioexception) { }
	//  216  423:astore          6
		throw abyte0;
		d = null;
		this;
		JVM INSTR monitorexit ;
		return;
		abyte0;
		throw abyte0;
	//* 217  425:goto            392
	}

	private im b;
	private RandomAccessFile c;
	private File d;
	private String e;
}
