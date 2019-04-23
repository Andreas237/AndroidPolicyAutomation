// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xz, wy, ayu, aac, 
//			abc, acd

public abstract class vx
	implements xz
{

	public vx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		b = ((ThreadLocal) (new wy(this)));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class wy>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #35  <Method void wy(vx)>
	//    7   13:putfield        #37  <Field ThreadLocal b>
	//    8   16:return          
	}

	public final abc a(ayu ayu1, acd acd)
	{
		long l = ayu1.b();
	//    0    0:aload_1         
	//    1    1:invokeinterface #43  <Method long ayu.b()>
	//    2    6:lstore          4
		((ByteBuffer)b.get()).rewind().limit(8);
	//    3    8:aload_0         
	//    4    9:getfield        #37  <Field ThreadLocal b>
	//    5   12:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//    6   15:checkcast       #51  <Class ByteBuffer>
	//    7   18:invokevirtual   #55  <Method Buffer ByteBuffer.rewind()>
	//    8   21:bipush          8
	//    9   23:invokevirtual   #61  <Method Buffer Buffer.limit(int)>
	//   10   26:pop             
		do
		{
			int i = ayu1.a((ByteBuffer)b.get());
	//   11   27:aload_1         
	//   12   28:aload_0         
	//   13   29:getfield        #37  <Field ThreadLocal b>
	//   14   32:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//   15   35:checkcast       #51  <Class ByteBuffer>
	//   16   38:invokeinterface #64  <Method int ayu.a(ByteBuffer)>
	//   17   43:istore_3        
			if(i != 8)
	//*  18   44:iload_3         
	//*  19   45:bipush          8
	//*  20   47:icmpeq          73
			{
				if(i < 0)
	//*  21   50:iload_3         
	//*  22   51:iflt            57
	//*  23   54:goto            27
				{
					ayu1.a(l);
	//   24   57:aload_1         
	//   25   58:lload           4
	//   26   60:invokeinterface #67  <Method void ayu.a(long)>
					throw new EOFException();
	//   27   65:new             #69  <Class EOFException>
	//   28   68:dup             
	//   29   69:invokespecial   #70  <Method void EOFException()>
	//   30   72:athrow          
				}
			} else
			{
				((ByteBuffer)b.get()).rewind();
	//   31   73:aload_0         
	//   32   74:getfield        #37  <Field ThreadLocal b>
	//   33   77:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//   34   80:checkcast       #51  <Class ByteBuffer>
	//   35   83:invokevirtual   #55  <Method Buffer ByteBuffer.rewind()>
	//   36   86:pop             
				long l1 = aac.a((ByteBuffer)b.get());
	//   37   87:aload_0         
	//   38   88:getfield        #37  <Field ThreadLocal b>
	//   39   91:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//   40   94:checkcast       #51  <Class ByteBuffer>
	//   41   97:invokestatic    #75  <Method long aac.a(ByteBuffer)>
	//   42  100:lstore          4
				byte abyte0[] = null;
	//   43  102:aconst_null     
	//   44  103:astore          6
				if(l1 < 8L && l1 > 1L)
	//*  45  105:lload           4
	//*  46  107:ldc2w           #76  <Long 8L>
	//*  47  110:lcmp            
	//*  48  111:ifge            180
	//*  49  114:lload           4
	//*  50  116:lconst_1        
	//*  51  117:lcmp            
	//*  52  118:ifle            180
				{
					ayu1 = ((ayu) (a));
	//   53  121:getstatic       #26  <Field Logger a>
	//   54  124:astore_1        
					acd = ((acd) (Level.SEVERE));
	//   55  125:getstatic       #83  <Field Level Level.SEVERE>
	//   56  128:astore_2        
					abyte0 = ((byte []) (new StringBuilder(80)));
	//   57  129:new             #85  <Class StringBuilder>
	//   58  132:dup             
	//   59  133:bipush          80
	//   60  135:invokespecial   #88  <Method void StringBuilder(int)>
	//   61  138:astore          6
					((StringBuilder) (abyte0)).append("Plausibility check failed: size < 8 (size = ");
	//   62  140:aload           6
	//   63  142:ldc1            #90  <String "Plausibility check failed: size < 8 (size = ">
	//   64  144:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   65  147:pop             
					((StringBuilder) (abyte0)).append(l1);
	//   66  148:aload           6
	//   67  150:lload           4
	//   68  152:invokevirtual   #97  <Method StringBuilder StringBuilder.append(long)>
	//   69  155:pop             
					((StringBuilder) (abyte0)).append("). Stop parsing!");
	//   70  156:aload           6
	//   71  158:ldc1            #99  <String "). Stop parsing!">
	//   72  160:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   73  163:pop             
					((Logger) (ayu1)).logp(((Level) (acd)), "com.coremedia.iso.AbstractBoxParser", "parseBox", ((StringBuilder) (abyte0)).toString());
	//   74  164:aload_1         
	//   75  165:aload_2         
	//   76  166:ldc1            #101 <String "com.coremedia.iso.AbstractBoxParser">
	//   77  168:ldc1            #103 <String "parseBox">
	//   78  170:aload           6
	//   79  172:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   80  175:invokevirtual   #110 <Method void Logger.logp(Level, String, String, String)>
					return null;
	//   81  178:aconst_null     
	//   82  179:areturn         
				}
				String s1 = aac.f((ByteBuffer)b.get());
	//   83  180:aload_0         
	//   84  181:getfield        #37  <Field ThreadLocal b>
	//   85  184:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//   86  187:checkcast       #51  <Class ByteBuffer>
	//   87  190:invokestatic    #114 <Method String aac.f(ByteBuffer)>
	//   88  193:astore          8
				if(l1 == 1L)
	//*  89  195:lload           4
	//*  90  197:lconst_1        
	//*  91  198:lcmp            
	//*  92  199:ifne            273
				{
					((ByteBuffer)b.get()).limit(16);
	//   93  202:aload_0         
	//   94  203:getfield        #37  <Field ThreadLocal b>
	//   95  206:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//   96  209:checkcast       #51  <Class ByteBuffer>
	//   97  212:bipush          16
	//   98  214:invokevirtual   #115 <Method Buffer ByteBuffer.limit(int)>
	//   99  217:pop             
					ayu1.a((ByteBuffer)b.get());
	//  100  218:aload_1         
	//  101  219:aload_0         
	//  102  220:getfield        #37  <Field ThreadLocal b>
	//  103  223:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  104  226:checkcast       #51  <Class ByteBuffer>
	//  105  229:invokeinterface #64  <Method int ayu.a(ByteBuffer)>
	//  106  234:pop             
					((ByteBuffer)b.get()).position(8);
	//  107  235:aload_0         
	//  108  236:getfield        #37  <Field ThreadLocal b>
	//  109  239:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  110  242:checkcast       #51  <Class ByteBuffer>
	//  111  245:bipush          8
	//  112  247:invokevirtual   #118 <Method Buffer ByteBuffer.position(int)>
	//  113  250:pop             
					l1 = aac.c((ByteBuffer)b.get()) - 16L;
	//  114  251:aload_0         
	//  115  252:getfield        #37  <Field ThreadLocal b>
	//  116  255:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  117  258:checkcast       #51  <Class ByteBuffer>
	//  118  261:invokestatic    #121 <Method long aac.c(ByteBuffer)>
	//  119  264:ldc2w           #122 <Long 16L>
	//  120  267:lsub            
	//  121  268:lstore          4
				} else
	//* 122  270:goto            306
				if(l1 == 0L)
	//* 123  273:lload           4
	//* 124  275:lconst_0        
	//* 125  276:lcmp            
	//* 126  277:ifne            298
					l1 = ayu1.a() - ayu1.b();
	//  127  280:aload_1         
	//  128  281:invokeinterface #125 <Method long ayu.a()>
	//  129  286:aload_1         
	//  130  287:invokeinterface #43  <Method long ayu.b()>
	//  131  292:lsub            
	//  132  293:lstore          4
				else
	//* 133  295:goto            306
					l1 -= 8L;
	//  134  298:lload           4
	//  135  300:ldc2w           #76  <Long 8L>
	//  136  303:lsub            
	//  137  304:lstore          4
				if("uuid".equals(((Object) (s1))))
	//* 138  306:ldc1            #127 <String "uuid">
	//* 139  308:aload           8
	//* 140  310:invokevirtual   #133 <Method boolean String.equals(Object)>
	//* 141  313:ifeq            456
				{
					((ByteBuffer)b.get()).limit(((ByteBuffer)b.get()).limit() + 16);
	//  142  316:aload_0         
	//  143  317:getfield        #37  <Field ThreadLocal b>
	//  144  320:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  145  323:checkcast       #51  <Class ByteBuffer>
	//  146  326:aload_0         
	//  147  327:getfield        #37  <Field ThreadLocal b>
	//  148  330:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  149  333:checkcast       #51  <Class ByteBuffer>
	//  150  336:invokevirtual   #136 <Method int ByteBuffer.limit()>
	//  151  339:bipush          16
	//  152  341:iadd            
	//  153  342:invokevirtual   #115 <Method Buffer ByteBuffer.limit(int)>
	//  154  345:pop             
					ayu1.a((ByteBuffer)b.get());
	//  155  346:aload_1         
	//  156  347:aload_0         
	//  157  348:getfield        #37  <Field ThreadLocal b>
	//  158  351:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  159  354:checkcast       #51  <Class ByteBuffer>
	//  160  357:invokeinterface #64  <Method int ayu.a(ByteBuffer)>
	//  161  362:pop             
					abyte0 = new byte[16];
	//  162  363:bipush          16
	//  163  365:newarray        byte[]
	//  164  367:astore          6
					for(int j = ((ByteBuffer)b.get()).position() - 16; j < ((ByteBuffer)b.get()).position(); j++)
	//* 165  369:aload_0         
	//* 166  370:getfield        #37  <Field ThreadLocal b>
	//* 167  373:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//* 168  376:checkcast       #51  <Class ByteBuffer>
	//* 169  379:invokevirtual   #138 <Method int ByteBuffer.position()>
	//* 170  382:bipush          16
	//* 171  384:isub            
	//* 172  385:istore_3        
	//* 173  386:iload_3         
	//* 174  387:aload_0         
	//* 175  388:getfield        #37  <Field ThreadLocal b>
	//* 176  391:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//* 177  394:checkcast       #51  <Class ByteBuffer>
	//* 178  397:invokevirtual   #138 <Method int ByteBuffer.position()>
	//* 179  400:icmpge          445
						abyte0[j - (((ByteBuffer)b.get()).position() - 16)] = ((ByteBuffer)b.get()).get(j);
	//  180  403:aload           6
	//  181  405:iload_3         
	//  182  406:aload_0         
	//  183  407:getfield        #37  <Field ThreadLocal b>
	//  184  410:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  185  413:checkcast       #51  <Class ByteBuffer>
	//  186  416:invokevirtual   #138 <Method int ByteBuffer.position()>
	//  187  419:bipush          16
	//  188  421:isub            
	//  189  422:isub            
	//  190  423:aload_0         
	//  191  424:getfield        #37  <Field ThreadLocal b>
	//  192  427:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  193  430:checkcast       #51  <Class ByteBuffer>
	//  194  433:iload_3         
	//  195  434:invokevirtual   #141 <Method byte ByteBuffer.get(int)>
	//  196  437:bastore         

	//  197  438:iload_3         
	//  198  439:iconst_1        
	//  199  440:iadd            
	//  200  441:istore_3        
	//* 201  442:goto            386
					l1 -= 16L;
	//  202  445:lload           4
	//  203  447:ldc2w           #122 <Long 16L>
	//  204  450:lsub            
	//  205  451:lstore          4
				}
	//* 206  453:goto            456
				String s;
				if(acd instanceof abc)
	//* 207  456:aload_2         
	//* 208  457:instanceof      #143 <Class abc>
	//* 209  460:ifeq            477
					s = ((abc)acd).a();
	//  210  463:aload_2         
	//  211  464:checkcast       #143 <Class abc>
	//  212  467:invokeinterface #145 <Method String abc.a()>
	//  213  472:astore          7
				else
	//* 214  474:goto            481
					s = "";
	//  215  477:ldc1            #147 <String "">
	//  216  479:astore          7
				abc abc1 = a(s1, abyte0, s);
	//  217  481:aload_0         
	//  218  482:aload           8
	//  219  484:aload           6
	//  220  486:aload           7
	//  221  488:invokevirtual   #150 <Method abc a(String, byte[], String)>
	//  222  491:astore          6
				abc1.a(acd);
	//  223  493:aload           6
	//  224  495:aload_2         
	//  225  496:invokeinterface #153 <Method void abc.a(acd)>
				((ByteBuffer)b.get()).rewind();
	//  226  501:aload_0         
	//  227  502:getfield        #37  <Field ThreadLocal b>
	//  228  505:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  229  508:checkcast       #51  <Class ByteBuffer>
	//  230  511:invokevirtual   #55  <Method Buffer ByteBuffer.rewind()>
	//  231  514:pop             
				abc1.a(ayu1, (ByteBuffer)b.get(), l1, ((xz) (this)));
	//  232  515:aload           6
	//  233  517:aload_1         
	//  234  518:aload_0         
	//  235  519:getfield        #37  <Field ThreadLocal b>
	//  236  522:invokevirtual   #49  <Method Object ThreadLocal.get()>
	//  237  525:checkcast       #51  <Class ByteBuffer>
	//  238  528:lload           4
	//  239  530:aload_0         
	//  240  531:invokeinterface #156 <Method void abc.a(ayu, ByteBuffer, long, xz)>
				return abc1;
	//  241  536:aload           6
	//  242  538:areturn         
			}
		} while(true);
	}

	public abstract abc a(String s, byte abyte0[], String s1);

	private static Logger a = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/vx)).getName());
	private ThreadLocal b;

	static 
	{
	//    0    0:ldc1            #2   <Class vx>
	//    1    2:invokevirtual   #18  <Method String Class.getName()>
	//    2    5:invokestatic    #24  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #26  <Field Logger a>
	//*   4   11:return          
	}
}
