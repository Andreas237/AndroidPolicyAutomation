// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.media.*;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcq, bnw, bnf, bhq, 
//			bfc, bdg, bcs, bex, 
//			zzfs, bff, bnl, bey, 
//			bfb, bfh, bhv, bnu, 
//			bhm, bho

public abstract class bhn extends bcq
{

	public bhn(int i1, bhq bhq1, bfh bfh1, boolean flag)
	{
		super(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #77  <Method void bcq(int)>
		boolean flag1;
		if(bnw.a >= 16)
	//*   3    5:getstatic       #79  <Field int bnw.a>
	//*   4    8:bipush          16
	//*   5   10:icmplt          19
			flag1 = true;
	//    6   13:iconst_1        
	//    7   14:istore          5
		else
	//*   8   16:goto            22
			flag1 = false;
	//    9   19:iconst_0        
	//   10   20:istore          5
		bnf.b(flag1);
	//   11   22:iload           5
	//   12   24:invokestatic    #84  <Method void bnf.b(boolean)>
		c = (bhq)bnf.a(((Object) (bhq1)));
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokestatic    #87  <Method Object bnf.a(Object)>
	//   16   32:checkcast       #89  <Class bhq>
	//   17   35:putfield        #91  <Field bhq c>
		d = bfh1;
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:putfield        #93  <Field bfh d>
		e = flag;
	//   21   43:aload_0         
	//   22   44:iload           4
	//   23   46:putfield        #95  <Field boolean e>
	//   24   49:aload_0         
	//   25   50:new             #97  <Class bfc>
	//   26   53:dup             
	//   27   54:iconst_0        
	//   28   55:invokespecial   #98  <Method void bfc(int)>
	//   29   58:putfield        #100 <Field bfc f>
	//   30   61:aload_0         
	//   31   62:new             #97  <Class bfc>
	//   32   65:dup             
	//   33   66:iconst_0        
	//   34   67:invokespecial   #98  <Method void bfc(int)>
	//   35   70:putfield        #102 <Field bfc g>
	//   36   73:aload_0         
	//   37   74:new             #104 <Class bdg>
	//   38   77:dup             
	//   39   78:invokespecial   #106 <Method void bdg()>
	//   40   81:putfield        #108 <Field bdg h>
	//   41   84:aload_0         
	//   42   85:new             #110 <Class ArrayList>
	//   43   88:dup             
	//   44   89:invokespecial   #111 <Method void ArrayList()>
	//   45   92:putfield        #113 <Field List i>
	//   46   95:aload_0         
	//   47   96:new             #115 <Class android.media.MediaCodec$BufferInfo>
	//   48   99:dup             
	//   49  100:invokespecial   #116 <Method void android.media.MediaCodec$BufferInfo()>
	//   50  103:putfield        #118 <Field android.media.MediaCodec$BufferInfo j>
		F = 0;
	//   51  106:aload_0         
	//   52  107:iconst_0        
	//   53  108:putfield        #120 <Field int F>
		G = 0;
	//   54  111:aload_0         
	//   55  112:iconst_0        
	//   56  113:putfield        #122 <Field int G>
	//   57  116:return          
	}

	private final void a(bho bho1)
	{
		throw bcs.a(((Exception) (bho1)), ((bcq)this).r());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #126 <Method int bcq.r()>
	//    3    5:invokestatic    #131 <Method bcs bcs.a(Exception, int)>
	//    4    8:athrow          
	}

	private final boolean b(long l1, long l2)
	{
		IllegalStateException illegalstateexception;
label0:
		{
			int i1;
label1:
			{
				boolean flag;
label2:
				{
					if(C >= 0)
						break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int C>
	//    2    4:ifge            407
					if(u && I)
	//*   3    7:aload_0         
	//*   4    8:getfield        #138 <Field boolean u>
	//*   5   11:ifeq            57
	//*   6   14:aload_0         
	//*   7   15:getfield        #140 <Field boolean I>
	//*   8   18:ifeq            57
						try
						{
							C = n.dequeueOutputBuffer(j, 0L);
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #142 <Field MediaCodec n>
	//   12   26:aload_0         
	//   13   27:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//   14   30:lconst_0        
	//   15   31:invokevirtual   #148 <Method int MediaCodec.dequeueOutputBuffer(android.media.MediaCodec$BufferInfo, long)>
	//   16   34:putfield        #136 <Field int C>
						}
	//*  17   37:goto            73
	//*  18   40:aload_0         
	//*  19   41:invokespecial   #150 <Method void w()>
	//*  20   44:aload_0         
	//*  21   45:getfield        #152 <Field boolean K>
	//*  22   48:ifeq            55
	//*  23   51:aload_0         
	//*  24   52:invokevirtual   #154 <Method void C()>
	//*  25   55:iconst_0        
	//*  26   56:ireturn         
	//*  27   57:aload_0         
	//*  28   58:aload_0         
	//*  29   59:getfield        #142 <Field MediaCodec n>
	//*  30   62:aload_0         
	//*  31   63:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//*  32   66:lconst_0        
	//*  33   67:invokevirtual   #148 <Method int MediaCodec.dequeueOutputBuffer(android.media.MediaCodec$BufferInfo, long)>
	//*  34   70:putfield        #136 <Field int C>
	//*  35   73:aload_0         
	//*  36   74:getfield        #136 <Field int C>
	//*  37   77:istore          5
	//*  38   79:iload           5
	//*  39   81:iflt            278
	//*  40   84:aload_0         
	//*  41   85:getfield        #156 <Field boolean x>
	//*  42   88:ifeq            113
	//*  43   91:aload_0         
	//*  44   92:iconst_0        
	//*  45   93:putfield        #156 <Field boolean x>
	//*  46   96:aload_0         
	//*  47   97:getfield        #142 <Field MediaCodec n>
	//*  48  100:iload           5
	//*  49  102:iconst_0        
	//*  50  103:invokevirtual   #160 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
	//*  51  106:aload_0         
	//*  52  107:iconst_m1       
	//*  53  108:putfield        #136 <Field int C>
	//*  54  111:iconst_1        
	//*  55  112:ireturn         
	//*  56  113:aload_0         
	//*  57  114:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//*  58  117:getfield        #163 <Field int android.media.MediaCodec$BufferInfo.flags>
	//*  59  120:iconst_4        
	//*  60  121:iand            
	//*  61  122:ifeq            136
	//*  62  125:aload_0         
	//*  63  126:invokespecial   #150 <Method void w()>
	//*  64  129:aload_0         
	//*  65  130:iconst_m1       
	//*  66  131:putfield        #136 <Field int C>
	//*  67  134:iconst_0        
	//*  68  135:ireturn         
	//*  69  136:aload_0         
	//*  70  137:getfield        #165 <Field ByteBuffer[] z>
	//*  71  140:aload_0         
	//*  72  141:getfield        #136 <Field int C>
	//*  73  144:aaload          
	//*  74  145:astore          10
	//*  75  147:aload           10
	//*  76  149:ifnull          186
	//*  77  152:aload           10
	//*  78  154:aload_0         
	//*  79  155:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//*  80  158:getfield        #168 <Field int android.media.MediaCodec$BufferInfo.offset>
	//*  81  161:invokevirtual   #174 <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  82  164:pop             
	//*  83  165:aload           10
	//*  84  167:aload_0         
	//*  85  168:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//*  86  171:getfield        #168 <Field int android.media.MediaCodec$BufferInfo.offset>
	//*  87  174:aload_0         
	//*  88  175:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//*  89  178:getfield        #177 <Field int android.media.MediaCodec$BufferInfo.size>
	//*  90  181:iadd            
	//*  91  182:invokevirtual   #180 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//*  92  185:pop             
	//*  93  186:aload_0         
	//*  94  187:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//*  95  190:getfield        #183 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//*  96  193:lstore          7
	//*  97  195:aload_0         
	//*  98  196:getfield        #113 <Field List i>
	//*  99  199:invokeinterface #187 <Method int List.size()>
	//* 100  204:istore          6
	//* 101  206:iconst_0        
	//* 102  207:istore          5
	//* 103  209:iload           5
	//* 104  211:iload           6
	//* 105  213:icmpge          266
	//* 106  216:aload_0         
	//* 107  217:getfield        #113 <Field List i>
	//* 108  220:iload           5
	//* 109  222:invokeinterface #191 <Method Object List.get(int)>
	//* 110  227:checkcast       #193 <Class Long>
	//* 111  230:invokevirtual   #197 <Method long Long.longValue()>
	//* 112  233:lload           7
	//* 113  235:lcmp            
	//* 114  236:ifne            257
	//* 115  239:aload_0         
	//* 116  240:getfield        #113 <Field List i>
	//* 117  243:iload           5
	//* 118  245:invokeinterface #200 <Method Object List.remove(int)>
	//* 119  250:pop             
	//* 120  251:iconst_1        
	//* 121  252:istore          9
	//* 122  254:goto            269
	//* 123  257:iload           5
	//* 124  259:iconst_1        
	//* 125  260:iadd            
	//* 126  261:istore          5
	//* 127  263:goto            209
	//* 128  266:iconst_0        
	//* 129  267:istore          9
	//* 130  269:aload_0         
	//* 131  270:iload           9
	//* 132  272:putfield        #202 <Field boolean D>
	//* 133  275:goto            407
	//* 134  278:iload           5
	//* 135  280:bipush          -2
	//* 136  282:icmpne          359
	//* 137  285:aload_0         
	//* 138  286:getfield        #142 <Field MediaCodec n>
	//* 139  289:invokevirtual   #206 <Method MediaFormat MediaCodec.getOutputFormat()>
	//* 140  292:astore          10
	//* 141  294:aload_0         
	//* 142  295:getfield        #208 <Field boolean r>
	//* 143  298:ifeq            332
	//* 144  301:aload           10
	//* 145  303:ldc1            #210 <String "width">
	//* 146  305:invokevirtual   #216 <Method int MediaFormat.getInteger(String)>
	//* 147  308:bipush          32
	//* 148  310:icmpne          332
	//* 149  313:aload           10
	//* 150  315:ldc1            #218 <String "height">
	//* 151  317:invokevirtual   #216 <Method int MediaFormat.getInteger(String)>
	//* 152  320:bipush          32
	//* 153  322:icmpne          332
	//* 154  325:aload_0         
	//* 155  326:iconst_1        
	//* 156  327:putfield        #156 <Field boolean x>
	//* 157  330:iconst_1        
	//* 158  331:ireturn         
	//* 159  332:aload_0         
	//* 160  333:getfield        #220 <Field boolean v>
	//* 161  336:ifeq            347
	//* 162  339:aload           10
	//* 163  341:ldc1            #222 <String "channel-count">
	//* 164  343:iconst_1        
	//* 165  344:invokevirtual   #226 <Method void MediaFormat.setInteger(String, int)>
	//* 166  347:aload_0         
	//* 167  348:aload_0         
	//* 168  349:getfield        #142 <Field MediaCodec n>
	//* 169  352:aload           10
	//* 170  354:invokevirtual   #229 <Method void a(MediaCodec, MediaFormat)>
	//* 171  357:iconst_1        
	//* 172  358:ireturn         
	//* 173  359:iload           5
	//* 174  361:bipush          -3
	//* 175  363:icmpne          379
	//* 176  366:aload_0         
	//* 177  367:aload_0         
	//* 178  368:getfield        #142 <Field MediaCodec n>
	//* 179  371:invokevirtual   #233 <Method ByteBuffer[] MediaCodec.getOutputBuffers()>
	//* 180  374:putfield        #165 <Field ByteBuffer[] z>
	//* 181  377:iconst_1        
	//* 182  378:ireturn         
	//* 183  379:aload_0         
	//* 184  380:getfield        #235 <Field boolean s>
	//* 185  383:ifeq            405
	//* 186  386:aload_0         
	//* 187  387:getfield        #237 <Field boolean J>
	//* 188  390:ifne            401
	//* 189  393:aload_0         
	//* 190  394:getfield        #122 <Field int G>
	//* 191  397:iconst_2        
	//* 192  398:icmpne          405
	//* 193  401:aload_0         
	//* 194  402:invokespecial   #150 <Method void w()>
	//* 195  405:iconst_0        
	//* 196  406:ireturn         
	//* 197  407:aload_0         
	//* 198  408:getfield        #138 <Field boolean u>
	//* 199  411:ifeq            484
	//* 200  414:aload_0         
	//* 201  415:getfield        #140 <Field boolean I>
	//* 202  418:ifeq            484
	//* 203  421:aload_0         
	//* 204  422:lload_1         
	//* 205  423:lload_3         
	//* 206  424:aload_0         
	//* 207  425:getfield        #142 <Field MediaCodec n>
	//* 208  428:aload_0         
	//* 209  429:getfield        #165 <Field ByteBuffer[] z>
	//* 210  432:aload_0         
	//* 211  433:getfield        #136 <Field int C>
	//* 212  436:aaload          
	//* 213  437:aload_0         
	//* 214  438:getfield        #136 <Field int C>
	//* 215  441:aload_0         
	//* 216  442:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//* 217  445:getfield        #163 <Field int android.media.MediaCodec$BufferInfo.flags>
	//* 218  448:aload_0         
	//* 219  449:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//* 220  452:getfield        #183 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//* 221  455:aload_0         
	//* 222  456:getfield        #202 <Field boolean D>
	//* 223  459:invokevirtual   #240 <Method boolean a(long, long, MediaCodec, ByteBuffer, int, int, long, boolean)>
	//* 224  462:istore          9
	//* 225  464:goto            537
	//* 226  467:aload_0         
	//* 227  468:invokespecial   #150 <Method void w()>
	//* 228  471:aload_0         
	//* 229  472:getfield        #152 <Field boolean K>
	//* 230  475:ifeq            482
	//* 231  478:aload_0         
	//* 232  479:invokevirtual   #154 <Method void C()>
	//* 233  482:iconst_0        
	//* 234  483:ireturn         
	//* 235  484:aload_0         
	//* 236  485:getfield        #142 <Field MediaCodec n>
	//* 237  488:astore          10
	//* 238  490:aload_0         
	//* 239  491:getfield        #165 <Field ByteBuffer[] z>
	//* 240  494:astore          11
	//* 241  496:aload_0         
	//* 242  497:getfield        #136 <Field int C>
	//* 243  500:istore          5
	//* 244  502:aload_0         
	//* 245  503:lload_1         
	//* 246  504:lload_3         
	//* 247  505:aload           10
	//* 248  507:aload           11
	//* 249  509:iload           5
	//* 250  511:aaload          
	//* 251  512:iload           5
	//* 252  514:aload_0         
	//* 253  515:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//* 254  518:getfield        #163 <Field int android.media.MediaCodec$BufferInfo.flags>
	//* 255  521:aload_0         
	//* 256  522:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//* 257  525:getfield        #183 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//* 258  528:aload_0         
	//* 259  529:getfield        #202 <Field boolean D>
	//* 260  532:invokevirtual   #240 <Method boolean a(long, long, MediaCodec, ByteBuffer, int, int, long, boolean)>
	//* 261  535:istore          9
	//* 262  537:iload           9
	//* 263  539:ifeq            557
	//* 264  542:aload_0         
	//* 265  543:getfield        #118 <Field android.media.MediaCodec$BufferInfo j>
	//* 266  546:getfield        #183 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//* 267  549:lstore_1        
	//* 268  550:aload_0         
	//* 269  551:iconst_m1       
	//* 270  552:putfield        #136 <Field int C>
	//* 271  555:iconst_1        
	//* 272  556:ireturn         
	//* 273  557:iconst_0        
	//* 274  558:ireturn         
						// Misplaced declaration of an exception variable
						catch(IllegalStateException illegalstateexception)
						{
							w();
							if(K)
								C();
							return false;
						}
					else
						C = n.dequeueOutputBuffer(j, 0L);
					i1 = C;
					if(i1 < 0)
						break label1;
					if(x)
					{
						x = false;
						n.releaseOutputBuffer(i1, false);
						C = -1;
						return true;
					}
					if((j.flags & 4) != 0)
					{
						w();
						C = -1;
						return false;
					}
					ByteBuffer bytebuffer = z[C];
					if(bytebuffer != null)
					{
						bytebuffer.position(j.offset);
						bytebuffer.limit(j.offset + j.size);
					}
					long l3 = j.presentationTimeUs;
					int k1 = i.size();
					i1 = 0;
					do
					{
						if(i1 >= k1)
							break;
						if(((Long)i.get(i1)).longValue() == l3)
						{
							i.remove(i1);
							flag = true;
							break label2;
						}
						i1++;
					} while(true);
					flag = false;
				}
				D = flag;
				break label0;
			}
			if(i1 == -2)
			{
				MediaFormat mediaformat = n.getOutputFormat();
				if(r && mediaformat.getInteger("width") == 32 && mediaformat.getInteger("height") == 32)
				{
					x = true;
					return true;
				}
				if(v)
					mediaformat.setInteger("channel-count", 1);
				a(n, mediaformat);
				return true;
			}
			if(i1 == -3)
			{
				z = n.getOutputBuffers();
				return true;
			}
			if(s && (J || G == 2))
				w();
			return false;
		}
		boolean flag1;
		if(u && I)
		{
			try
			{
				flag1 = a(l1, l2, n, z[C], C, j.flags, j.presentationTimeUs, D);
			}
	//* 275  559:astore          10
	//* 276  561:goto            40
			// Misplaced declaration of an exception variable
			catch(IllegalStateException illegalstateexception)
			{
				w();
				if(K)
					C();
				return false;
			}
		} else
		{
			MediaCodec mediacodec = n;
			ByteBuffer abytebuffer[] = z;
			int j1 = C;
			flag1 = a(l1, l2, mediacodec, abytebuffer[j1], j1, j.flags, j.presentationTimeUs, D);
		}
		if(flag1)
		{
			l1 = j.presentationTimeUs;
			C = -1;
			return true;
		} else
		{
			return false;
		}
	//* 277  564:astore          10
	//* 278  566:goto            467
	}

	private final boolean v()
	{
		int j1;
		boolean flag;
		boolean flag1;
label0:
		{
			Object obj = ((Object) (n));
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field MediaCodec n>
	//    2    4:astore          7
			if(obj == null || G == 2)
				break MISSING_BLOCK_LABEL_806;
	//    3    6:aload           7
	//    4    8:ifnull          806
	//    5   11:aload_0         
	//    6   12:getfield        #122 <Field int G>
	//    7   15:iconst_2        
	//    8   16:icmpeq          806
			if(J)
	//*   9   19:aload_0         
	//*  10   20:getfield        #237 <Field boolean J>
	//*  11   23:ifeq            28
				return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
			if(B < 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #245 <Field int B>
	//*  16   32:ifge            78
			{
				B = ((MediaCodec) (obj)).dequeueInputBuffer(0L);
	//   17   35:aload_0         
	//   18   36:aload           7
	//   19   38:lconst_0        
	//   20   39:invokevirtual   #249 <Method int MediaCodec.dequeueInputBuffer(long)>
	//   21   42:putfield        #245 <Field int B>
				int i1 = B;
	//   22   45:aload_0         
	//   23   46:getfield        #245 <Field int B>
	//   24   49:istore_1        
				if(i1 < 0)
	//*  25   50:iload_1         
	//*  26   51:ifge            56
					return false;
	//   27   54:iconst_0        
	//   28   55:ireturn         
				obj = ((Object) (f));
	//   29   56:aload_0         
	//   30   57:getfield        #100 <Field bfc f>
	//   31   60:astore          7
				obj.b = y[i1];
	//   32   62:aload           7
	//   33   64:aload_0         
	//   34   65:getfield        #251 <Field ByteBuffer[] y>
	//   35   68:iload_1         
	//   36   69:aaload          
	//   37   70:putfield        #254 <Field ByteBuffer bfc.b>
				((bex) (obj)).a();
	//   38   73:aload           7
	//   39   75:invokevirtual   #258 <Method void bex.a()>
			}
			if(G == 1)
	//*  40   78:aload_0         
	//*  41   79:getfield        #122 <Field int G>
	//*  42   82:iconst_1        
	//*  43   83:icmpne          125
			{
				if(!s)
	//*  44   86:aload_0         
	//*  45   87:getfield        #235 <Field boolean s>
	//*  46   90:ifne            118
				{
					I = true;
	//   47   93:aload_0         
	//   48   94:iconst_1        
	//   49   95:putfield        #140 <Field boolean I>
					n.queueInputBuffer(B, 0, 0, 0L, 4);
	//   50   98:aload_0         
	//   51   99:getfield        #142 <Field MediaCodec n>
	//   52  102:aload_0         
	//   53  103:getfield        #245 <Field int B>
	//   54  106:iconst_0        
	//   55  107:iconst_0        
	//   56  108:lconst_0        
	//   57  109:iconst_4        
	//   58  110:invokevirtual   #262 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
					B = -1;
	//   59  113:aload_0         
	//   60  114:iconst_m1       
	//   61  115:putfield        #245 <Field int B>
				}
				G = 2;
	//   62  118:aload_0         
	//   63  119:iconst_2        
	//   64  120:putfield        #122 <Field int G>
				return false;
	//   65  123:iconst_0        
	//   66  124:ireturn         
			}
			if(w)
	//*  67  125:aload_0         
	//*  68  126:getfield        #264 <Field boolean w>
	//*  69  129:ifeq            181
			{
				w = false;
	//   70  132:aload_0         
	//   71  133:iconst_0        
	//   72  134:putfield        #264 <Field boolean w>
				f.b.put(b);
	//   73  137:aload_0         
	//   74  138:getfield        #100 <Field bfc f>
	//   75  141:getfield        #254 <Field ByteBuffer bfc.b>
	//   76  144:getstatic       #71  <Field byte[] b>
	//   77  147:invokevirtual   #268 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   78  150:pop             
				n.queueInputBuffer(B, 0, b.length, 0L, 0);
	//   79  151:aload_0         
	//   80  152:getfield        #142 <Field MediaCodec n>
	//   81  155:aload_0         
	//   82  156:getfield        #245 <Field int B>
	//   83  159:iconst_0        
	//   84  160:getstatic       #71  <Field byte[] b>
	//   85  163:arraylength     
	//   86  164:lconst_0        
	//   87  165:iconst_0        
	//   88  166:invokevirtual   #262 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
				B = -1;
	//   89  169:aload_0         
	//   90  170:iconst_m1       
	//   91  171:putfield        #245 <Field int B>
				H = true;
	//   92  174:aload_0         
	//   93  175:iconst_1        
	//   94  176:putfield        #270 <Field boolean H>
				return true;
	//   95  179:iconst_1        
	//   96  180:ireturn         
			}
			int k1;
			if(L)
	//*  97  181:aload_0         
	//*  98  182:getfield        #272 <Field boolean L>
	//*  99  185:ifeq            196
			{
				k1 = -4;
	//  100  188:bipush          -4
	//  101  190:istore_2        
				j1 = 0;
	//  102  191:iconst_0        
	//  103  192:istore_1        
			} else
	//* 104  193:goto            290
			{
				if(F == 1)
	//* 105  196:aload_0         
	//* 106  197:getfield        #120 <Field int F>
	//* 107  200:iconst_1        
	//* 108  201:icmpne          265
				{
					for(j1 = 0; j1 < k.g.size(); j1++)
	//* 109  204:iconst_0        
	//* 110  205:istore_1        
	//* 111  206:iload_1         
	//* 112  207:aload_0         
	//* 113  208:getfield        #274 <Field zzfs k>
	//* 114  211:getfield        #278 <Field List zzfs.g>
	//* 115  214:invokeinterface #187 <Method int List.size()>
	//* 116  219:icmpge          260
					{
						byte abyte0[] = (byte[])k.g.get(j1);
	//  117  222:aload_0         
	//  118  223:getfield        #274 <Field zzfs k>
	//  119  226:getfield        #278 <Field List zzfs.g>
	//  120  229:iload_1         
	//  121  230:invokeinterface #191 <Method Object List.get(int)>
	//  122  235:checkcast       #279 <Class byte[]>
	//  123  238:astore          7
						f.b.put(abyte0);
	//  124  240:aload_0         
	//  125  241:getfield        #100 <Field bfc f>
	//  126  244:getfield        #254 <Field ByteBuffer bfc.b>
	//  127  247:aload           7
	//  128  249:invokevirtual   #268 <Method ByteBuffer ByteBuffer.put(byte[])>
	//  129  252:pop             
					}

	//  130  253:iload_1         
	//  131  254:iconst_1        
	//  132  255:iadd            
	//  133  256:istore_1        
	//* 134  257:goto            206
					F = 2;
	//  135  260:aload_0         
	//  136  261:iconst_2        
	//  137  262:putfield        #120 <Field int F>
				}
				j1 = f.b.position();
	//  138  265:aload_0         
	//  139  266:getfield        #100 <Field bfc f>
	//  140  269:getfield        #254 <Field ByteBuffer bfc.b>
	//  141  272:invokevirtual   #281 <Method int ByteBuffer.position()>
	//  142  275:istore_1        
				k1 = ((bcq)this).a(h, f, false);
	//  143  276:aload_0         
	//  144  277:aload_0         
	//  145  278:getfield        #108 <Field bdg h>
	//  146  281:aload_0         
	//  147  282:getfield        #100 <Field bfc f>
	//  148  285:iconst_0        
	//  149  286:invokevirtual   #284 <Method int bcq.a(bdg, bfc, boolean)>
	//  150  289:istore_2        
			}
			if(k1 == -3)
	//* 151  290:iload_2         
	//* 152  291:bipush          -3
	//* 153  293:icmpne          298
				return false;
	//  154  296:iconst_0        
	//  155  297:ireturn         
			if(k1 == -5)
	//* 156  298:iload_2         
	//* 157  299:bipush          -5
	//* 158  301:icmpne          337
			{
				if(F == 2)
	//* 159  304:aload_0         
	//* 160  305:getfield        #120 <Field int F>
	//* 161  308:iconst_2        
	//* 162  309:icmpne          324
				{
					((bex) (f)).a();
	//  163  312:aload_0         
	//  164  313:getfield        #100 <Field bfc f>
	//  165  316:invokevirtual   #258 <Method void bex.a()>
					F = 1;
	//  166  319:aload_0         
	//  167  320:iconst_1        
	//  168  321:putfield        #120 <Field int F>
				}
				b(h.a);
	//  169  324:aload_0         
	//  170  325:aload_0         
	//  171  326:getfield        #108 <Field bdg h>
	//  172  329:getfield        #286 <Field zzfs bdg.a>
	//  173  332:invokevirtual   #289 <Method void b(zzfs)>
				return true;
	//  174  335:iconst_1        
	//  175  336:ireturn         
			}
			if(((bex) (f)).c())
	//* 176  337:aload_0         
	//* 177  338:getfield        #100 <Field bfc f>
	//* 178  341:invokevirtual   #291 <Method boolean bex.c()>
	//* 179  344:ifeq            431
			{
				if(F == 2)
	//* 180  347:aload_0         
	//* 181  348:getfield        #120 <Field int F>
	//* 182  351:iconst_2        
	//* 183  352:icmpne          367
				{
					((bex) (f)).a();
	//  184  355:aload_0         
	//  185  356:getfield        #100 <Field bfc f>
	//  186  359:invokevirtual   #258 <Method void bex.a()>
					F = 1;
	//  187  362:aload_0         
	//  188  363:iconst_1        
	//  189  364:putfield        #120 <Field int F>
				}
				J = true;
	//  190  367:aload_0         
	//  191  368:iconst_1        
	//  192  369:putfield        #237 <Field boolean J>
				if(!H)
	//* 193  372:aload_0         
	//* 194  373:getfield        #270 <Field boolean H>
	//* 195  376:ifne            385
				{
					w();
	//  196  379:aload_0         
	//  197  380:invokespecial   #150 <Method void w()>
					return false;
	//  198  383:iconst_0        
	//  199  384:ireturn         
				}
				try
				{
					if(!s)
	//* 200  385:aload_0         
	//* 201  386:getfield        #235 <Field boolean s>
	//* 202  389:ifne            417
					{
						I = true;
	//  203  392:aload_0         
	//  204  393:iconst_1        
	//  205  394:putfield        #140 <Field boolean I>
						n.queueInputBuffer(B, 0, 0, 0L, 4);
	//  206  397:aload_0         
	//  207  398:getfield        #142 <Field MediaCodec n>
	//  208  401:aload_0         
	//  209  402:getfield        #245 <Field int B>
	//  210  405:iconst_0        
	//  211  406:iconst_0        
	//  212  407:lconst_0        
	//  213  408:iconst_4        
	//  214  409:invokevirtual   #262 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
						B = -1;
	//  215  412:aload_0         
	//  216  413:iconst_m1       
	//  217  414:putfield        #245 <Field int B>
					}
				}
	//* 218  417:iconst_0        
	//* 219  418:ireturn         
				catch(android.media.MediaCodec.CryptoException cryptoexception)
	//* 220  419:astore          7
				{
					throw bcs.a(((Exception) (cryptoexception)), ((bcq)this).r());
	//  221  421:aload           7
	//  222  423:aload_0         
	//  223  424:invokevirtual   #126 <Method int bcq.r()>
	//  224  427:invokestatic    #131 <Method bcs bcs.a(Exception, int)>
	//  225  430:athrow          
				}
				return false;
			}
			if(M && !((bex) (f)).d())
	//* 226  431:aload_0         
	//* 227  432:getfield        #293 <Field boolean M>
	//* 228  435:ifeq            470
	//* 229  438:aload_0         
	//* 230  439:getfield        #100 <Field bfc f>
	//* 231  442:invokevirtual   #295 <Method boolean bex.d()>
	//* 232  445:ifne            470
			{
				((bex) (f)).a();
	//  233  448:aload_0         
	//  234  449:getfield        #100 <Field bfc f>
	//  235  452:invokevirtual   #258 <Method void bex.a()>
				if(F == 2)
	//* 236  455:aload_0         
	//* 237  456:getfield        #120 <Field int F>
	//* 238  459:iconst_2        
	//* 239  460:icmpne          468
					F = 1;
	//  240  463:aload_0         
	//  241  464:iconst_1        
	//  242  465:putfield        #120 <Field int F>
				return true;
	//  243  468:iconst_1        
	//  244  469:ireturn         
			}
			M = false;
	//  245  470:aload_0         
	//  246  471:iconst_0        
	//  247  472:putfield        #293 <Field boolean M>
			flag1 = f.e();
	//  248  475:aload_0         
	//  249  476:getfield        #100 <Field bfc f>
	//  250  479:invokevirtual   #297 <Method boolean bfc.e()>
	//  251  482:istore          4
			cryptoexception = ((android.media.MediaCodec.CryptoException) (l));
	//  252  484:aload_0         
	//  253  485:getfield        #299 <Field bff l>
	//  254  488:astore          7
			if(cryptoexception != null)
	//* 255  490:aload           7
	//* 256  492:ifnull          546
			{
				int l1 = ((bff) (cryptoexception)).a();
	//  257  495:aload           7
	//  258  497:invokeinterface #303 <Method int bff.a()>
	//  259  502:istore_2        
				if(l1 != 0)
	//* 260  503:iload_2         
	//* 261  504:ifeq            529
				{
					if(l1 != 4 && (flag1 || !e))
	//* 262  507:iload_2         
	//* 263  508:iconst_4        
	//* 264  509:icmpeq          546
	//* 265  512:iload           4
	//* 266  514:ifne            524
	//* 267  517:aload_0         
	//* 268  518:getfield        #95  <Field boolean e>
	//* 269  521:ifne            546
					{
						flag = true;
	//  270  524:iconst_1        
	//  271  525:istore_3        
						break label0;
	//  272  526:goto            548
					}
				} else
				{
					throw bcs.a(((Exception) (l.c())), ((bcq)this).r());
	//  273  529:aload_0         
	//  274  530:getfield        #299 <Field bff l>
	//  275  533:invokeinterface #306 <Method bfg bff.c()>
	//  276  538:aload_0         
	//  277  539:invokevirtual   #126 <Method int bcq.r()>
	//  278  542:invokestatic    #131 <Method bcs bcs.a(Exception, int)>
	//  279  545:athrow          
				}
			}
			flag = false;
	//  280  546:iconst_0        
	//  281  547:istore_3        
		}
		L = flag;
	//  282  548:aload_0         
	//  283  549:iload_3         
	//  284  550:putfield        #272 <Field boolean L>
		if(L)
	//* 285  553:aload_0         
	//* 286  554:getfield        #272 <Field boolean L>
	//* 287  557:ifeq            562
			return false;
	//  288  560:iconst_0        
	//  289  561:ireturn         
		if(p && !flag1)
	//* 290  562:aload_0         
	//* 291  563:getfield        #308 <Field boolean p>
	//* 292  566:ifeq            604
	//* 293  569:iload           4
	//* 294  571:ifne            604
		{
			bnl.a(f.b);
	//  295  574:aload_0         
	//  296  575:getfield        #100 <Field bfc f>
	//  297  578:getfield        #254 <Field ByteBuffer bfc.b>
	//  298  581:invokestatic    #313 <Method void bnl.a(ByteBuffer)>
			if(f.b.position() == 0)
	//* 299  584:aload_0         
	//* 300  585:getfield        #100 <Field bfc f>
	//* 301  588:getfield        #254 <Field ByteBuffer bfc.b>
	//* 302  591:invokevirtual   #281 <Method int ByteBuffer.position()>
	//* 303  594:ifne            599
				return true;
	//  304  597:iconst_1        
	//  305  598:ireturn         
			p = false;
	//  306  599:aload_0         
	//  307  600:iconst_0        
	//  308  601:putfield        #308 <Field boolean p>
		}
		long l2;
		Object obj1;
		int ai[];
		try
		{
			l2 = f.c;
	//  309  604:aload_0         
	//  310  605:getfield        #100 <Field bfc f>
	//  311  608:getfield        #315 <Field long bfc.c>
	//  312  611:lstore          5
			if(((bex) (f)).b())
	//* 313  613:aload_0         
	//* 314  614:getfield        #100 <Field bfc f>
	//* 315  617:invokevirtual   #317 <Method boolean bex.b()>
	//* 316  620:ifeq            638
				i.add(((Object) (Long.valueOf(l2))));
	//  317  623:aload_0         
	//  318  624:getfield        #113 <Field List i>
	//  319  627:lload           5
	//  320  629:invokestatic    #321 <Method Long Long.valueOf(long)>
	//  321  632:invokeinterface #325 <Method boolean List.add(Object)>
	//  322  637:pop             
			f.b.flip();
	//  323  638:aload_0         
	//  324  639:getfield        #100 <Field bfc f>
	//  325  642:getfield        #254 <Field ByteBuffer bfc.b>
	//  326  645:invokevirtual   #329 <Method java.nio.Buffer ByteBuffer.flip()>
	//  327  648:pop             
			a(f);
	//  328  649:aload_0         
	//  329  650:aload_0         
	//  330  651:getfield        #100 <Field bfc f>
	//  331  654:invokevirtual   #332 <Method void a(bfc)>
		}
	//* 332  657:iload           4
	//* 333  659:ifeq            734
	//* 334  662:aload_0         
	//* 335  663:getfield        #100 <Field bfc f>
	//* 336  666:getfield        #335 <Field bey bfc.a>
	//* 337  669:invokevirtual   #340 <Method android.media.MediaCodec$CryptoInfo bey.a()>
	//* 338  672:astore          7
	//* 339  674:iload_1         
	//* 340  675:ifne            681
	//* 341  678:goto            714
	//* 342  681:aload           7
	//* 343  683:getfield        #346 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
	//* 344  686:ifnonnull       697
	//* 345  689:aload           7
	//* 346  691:iconst_1        
	//* 347  692:newarray        int[]
	//* 348  694:putfield        #346 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
	//* 349  697:aload           7
	//* 350  699:getfield        #346 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
	//* 351  702:astore          8
	//* 352  704:aload           8
	//* 353  706:iconst_0        
	//* 354  707:aload           8
	//* 355  709:iconst_0        
	//* 356  710:iaload          
	//* 357  711:iload_1         
	//* 358  712:iadd            
	//* 359  713:iastore         
	//* 360  714:aload_0         
	//* 361  715:getfield        #142 <Field MediaCodec n>
	//* 362  718:aload_0         
	//* 363  719:getfield        #245 <Field int B>
	//* 364  722:iconst_0        
	//* 365  723:aload           7
	//* 366  725:lload           5
	//* 367  727:iconst_0        
	//* 368  728:invokevirtual   #350 <Method void MediaCodec.queueSecureInputBuffer(int, int, android.media.MediaCodec$CryptoInfo, long, int)>
	//* 369  731:goto            759
	//* 370  734:aload_0         
	//* 371  735:getfield        #142 <Field MediaCodec n>
	//* 372  738:aload_0         
	//* 373  739:getfield        #245 <Field int B>
	//* 374  742:iconst_0        
	//* 375  743:aload_0         
	//* 376  744:getfield        #100 <Field bfc f>
	//* 377  747:getfield        #254 <Field ByteBuffer bfc.b>
	//* 378  750:invokevirtual   #352 <Method int ByteBuffer.limit()>
	//* 379  753:lload           5
	//* 380  755:iconst_0        
	//* 381  756:invokevirtual   #262 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
	//* 382  759:aload_0         
	//* 383  760:iconst_m1       
	//* 384  761:putfield        #245 <Field int B>
	//* 385  764:aload_0         
	//* 386  765:iconst_1        
	//* 387  766:putfield        #270 <Field boolean H>
	//* 388  769:aload_0         
	//* 389  770:iconst_0        
	//* 390  771:putfield        #120 <Field int F>
	//* 391  774:aload_0         
	//* 392  775:getfield        #354 <Field bfb a>
	//* 393  778:astore          7
	//* 394  780:aload           7
	//* 395  782:aload           7
	//* 396  784:getfield        #358 <Field int bfb.c>
	//* 397  787:iconst_1        
	//* 398  788:iadd            
	//* 399  789:putfield        #358 <Field int bfb.c>
	//* 400  792:iconst_1        
	//* 401  793:ireturn         
		catch(android.media.MediaCodec.CryptoException cryptoexception1)
	//* 402  794:astore          7
		{
			throw bcs.a(((Exception) (cryptoexception1)), ((bcq)this).r());
	//  403  796:aload           7
	//  404  798:aload_0         
	//  405  799:invokevirtual   #126 <Method int bcq.r()>
	//  406  802:invokestatic    #131 <Method bcs bcs.a(Exception, int)>
	//  407  805:athrow          
		}
		if(!flag1)
			break MISSING_BLOCK_LABEL_734;
		obj1 = ((Object) (f.a.a()));
		if(j1 == 0)
			break MISSING_BLOCK_LABEL_714;
		if(((android.media.MediaCodec.CryptoInfo) (obj1)).numBytesOfClearData == null)
			obj1.numBytesOfClearData = new int[1];
		ai = ((android.media.MediaCodec.CryptoInfo) (obj1)).numBytesOfClearData;
		ai[0] = ai[0] + j1;
		n.queueSecureInputBuffer(B, 0, ((android.media.MediaCodec.CryptoInfo) (obj1)), l2, 0);
		break MISSING_BLOCK_LABEL_759;
		n.queueInputBuffer(B, 0, f.b.limit(), l2, 0);
		B = -1;
		H = true;
		F = 0;
		obj1 = ((Object) (a));
		obj1.c = ((bfb) (obj1)).c + 1;
		return true;
		return false;
	//  408  806:iconst_0        
	//  409  807:ireturn         
	}

	private final void w()
	{
		if(G == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field int G>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          17
		{
			C();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #154 <Method void C()>
			z();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #360 <Method void z()>
			return;
	//    8   16:return          
		} else
		{
			K = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #152 <Field boolean K>
			y();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #362 <Method void y()>
			return;
	//   14   26:return          
		}
	}

	protected final MediaCodec A()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field MediaCodec n>
	//    2    4:areturn         
	}

	protected final bhm B()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #366 <Field bhm o>
	//    2    4:areturn         
	}

	protected void C()
	{
		A = 0x1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #367 <Long 0x1L>
	//    2    4:putfield        #370 <Field long A>
		B = -1;
	//    3    7:aload_0         
	//    4    8:iconst_m1       
	//    5    9:putfield        #245 <Field int B>
		C = -1;
	//    6   12:aload_0         
	//    7   13:iconst_m1       
	//    8   14:putfield        #136 <Field int C>
		L = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #272 <Field boolean L>
		D = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #202 <Field boolean D>
		i.clear();
	//   15   27:aload_0         
	//   16   28:getfield        #113 <Field List i>
	//   17   31:invokeinterface #373 <Method void List.clear()>
		y = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #251 <Field ByteBuffer[] y>
		z = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #165 <Field ByteBuffer[] z>
		o = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #366 <Field bhm o>
		E = false;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #375 <Field boolean E>
		H = false;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #270 <Field boolean H>
		p = false;
	//   33   61:aload_0         
	//   34   62:iconst_0        
	//   35   63:putfield        #308 <Field boolean p>
		q = false;
	//   36   66:aload_0         
	//   37   67:iconst_0        
	//   38   68:putfield        #377 <Field boolean q>
		r = false;
	//   39   71:aload_0         
	//   40   72:iconst_0        
	//   41   73:putfield        #208 <Field boolean r>
		s = false;
	//   42   76:aload_0         
	//   43   77:iconst_0        
	//   44   78:putfield        #235 <Field boolean s>
		t = false;
	//   45   81:aload_0         
	//   46   82:iconst_0        
	//   47   83:putfield        #379 <Field boolean t>
		v = false;
	//   48   86:aload_0         
	//   49   87:iconst_0        
	//   50   88:putfield        #220 <Field boolean v>
		w = false;
	//   51   91:aload_0         
	//   52   92:iconst_0        
	//   53   93:putfield        #264 <Field boolean w>
		x = false;
	//   54   96:aload_0         
	//   55   97:iconst_0        
	//   56   98:putfield        #156 <Field boolean x>
		I = false;
	//   57  101:aload_0         
	//   58  102:iconst_0        
	//   59  103:putfield        #140 <Field boolean I>
		F = 0;
	//   60  106:aload_0         
	//   61  107:iconst_0        
	//   62  108:putfield        #120 <Field int F>
		G = 0;
	//   63  111:aload_0         
	//   64  112:iconst_0        
	//   65  113:putfield        #122 <Field int G>
		f.b = null;
	//   66  116:aload_0         
	//   67  117:getfield        #100 <Field bfc f>
	//   68  120:aconst_null     
	//   69  121:putfield        #254 <Field ByteBuffer bfc.b>
		if(n == null)
			break MISSING_BLOCK_LABEL_367;
	//   70  124:aload_0         
	//   71  125:getfield        #142 <Field MediaCodec n>
	//   72  128:ifnull          367
		bfb bfb1 = a;
	//   73  131:aload_0         
	//   74  132:getfield        #354 <Field bfb a>
	//   75  135:astore_1        
		bfb1.b = bfb1.b + 1;
	//   76  136:aload_1         
	//   77  137:aload_1         
	//   78  138:getfield        #381 <Field int bfb.b>
	//   79  141:iconst_1        
	//   80  142:iadd            
	//   81  143:putfield        #381 <Field int bfb.b>
		n.stop();
	//   82  146:aload_0         
	//   83  147:getfield        #142 <Field MediaCodec n>
	//   84  150:invokevirtual   #384 <Method void MediaCodec.stop()>
		n.release();
	//   85  153:aload_0         
	//   86  154:getfield        #142 <Field MediaCodec n>
	//   87  157:invokevirtual   #387 <Method void MediaCodec.release()>
		bff bff1;
		n = null;
	//   88  160:aload_0         
	//   89  161:aconst_null     
	//   90  162:putfield        #142 <Field MediaCodec n>
		bff1 = l;
	//   91  165:aload_0         
	//   92  166:getfield        #299 <Field bff l>
	//   93  169:astore_1        
		if(bff1 == null || m == bff1)
			break MISSING_BLOCK_LABEL_206;
	//   94  170:aload_1         
	//   95  171:ifnull          206
	//   96  174:aload_0         
	//   97  175:getfield        #389 <Field bff m>
	//   98  178:aload_1         
	//   99  179:if_acmpeq       206
		d.a(bff1);
	//  100  182:aload_0         
	//  101  183:getfield        #93  <Field bfh d>
	//  102  186:aload_1         
	//  103  187:invokeinterface #394 <Method void bfh.a(bff)>
		l = null;
	//  104  192:aload_0         
	//  105  193:aconst_null     
	//  106  194:putfield        #299 <Field bff l>
		return;
	//  107  197:return          
		Exception exception;
		exception;
	//  108  198:astore_1        
		l = null;
	//  109  199:aload_0         
	//  110  200:aconst_null     
	//  111  201:putfield        #299 <Field bff l>
		throw exception;
	//  112  204:aload_1         
	//  113  205:athrow          
		return;
	//  114  206:return          
		exception;
	//  115  207:astore_1        
		bff bff2;
		n = null;
	//  116  208:aload_0         
	//  117  209:aconst_null     
	//  118  210:putfield        #142 <Field MediaCodec n>
		bff2 = l;
	//  119  213:aload_0         
	//  120  214:getfield        #299 <Field bff l>
	//  121  217:astore_2        
		if(bff2 == null || m == bff2)
			break MISSING_BLOCK_LABEL_256;
	//  122  218:aload_2         
	//  123  219:ifnull          256
	//  124  222:aload_0         
	//  125  223:getfield        #389 <Field bff m>
	//  126  226:aload_2         
	//  127  227:if_acmpeq       256
		d.a(bff2);
	//  128  230:aload_0         
	//  129  231:getfield        #93  <Field bfh d>
	//  130  234:aload_2         
	//  131  235:invokeinterface #394 <Method void bfh.a(bff)>
		l = null;
	//  132  240:aload_0         
	//  133  241:aconst_null     
	//  134  242:putfield        #299 <Field bff l>
		break MISSING_BLOCK_LABEL_256;
	//  135  245:goto            256
		exception;
	//  136  248:astore_1        
		l = null;
	//  137  249:aload_0         
	//  138  250:aconst_null     
	//  139  251:putfield        #299 <Field bff l>
		throw exception;
	//  140  254:aload_1         
	//  141  255:athrow          
		throw exception;
	//  142  256:aload_1         
	//  143  257:athrow          
		exception;
	//  144  258:astore_1        
		n.release();
	//  145  259:aload_0         
	//  146  260:getfield        #142 <Field MediaCodec n>
	//  147  263:invokevirtual   #387 <Method void MediaCodec.release()>
		n = null;
	//  148  266:aload_0         
	//  149  267:aconst_null     
	//  150  268:putfield        #142 <Field MediaCodec n>
		bff2 = l;
	//  151  271:aload_0         
	//  152  272:getfield        #299 <Field bff l>
	//  153  275:astore_2        
		if(bff2 == null || m == bff2)
			break MISSING_BLOCK_LABEL_314;
	//  154  276:aload_2         
	//  155  277:ifnull          314
	//  156  280:aload_0         
	//  157  281:getfield        #389 <Field bff m>
	//  158  284:aload_2         
	//  159  285:if_acmpeq       314
		d.a(bff2);
	//  160  288:aload_0         
	//  161  289:getfield        #93  <Field bfh d>
	//  162  292:aload_2         
	//  163  293:invokeinterface #394 <Method void bfh.a(bff)>
		l = null;
	//  164  298:aload_0         
	//  165  299:aconst_null     
	//  166  300:putfield        #299 <Field bff l>
		break MISSING_BLOCK_LABEL_314;
	//  167  303:goto            314
		exception;
	//  168  306:astore_1        
		l = null;
	//  169  307:aload_0         
	//  170  308:aconst_null     
	//  171  309:putfield        #299 <Field bff l>
		throw exception;
	//  172  312:aload_1         
	//  173  313:athrow          
		throw exception;
	//  174  314:aload_1         
	//  175  315:athrow          
		exception;
	//  176  316:astore_1        
		n = null;
	//  177  317:aload_0         
	//  178  318:aconst_null     
	//  179  319:putfield        #142 <Field MediaCodec n>
		bff2 = l;
	//  180  322:aload_0         
	//  181  323:getfield        #299 <Field bff l>
	//  182  326:astore_2        
		if(bff2 == null || m == bff2)
			break MISSING_BLOCK_LABEL_365;
	//  183  327:aload_2         
	//  184  328:ifnull          365
	//  185  331:aload_0         
	//  186  332:getfield        #389 <Field bff m>
	//  187  335:aload_2         
	//  188  336:if_acmpeq       365
		d.a(bff2);
	//  189  339:aload_0         
	//  190  340:getfield        #93  <Field bfh d>
	//  191  343:aload_2         
	//  192  344:invokeinterface #394 <Method void bfh.a(bff)>
		l = null;
	//  193  349:aload_0         
	//  194  350:aconst_null     
	//  195  351:putfield        #299 <Field bff l>
		break MISSING_BLOCK_LABEL_365;
	//  196  354:goto            365
		exception;
	//  197  357:astore_1        
		l = null;
	//  198  358:aload_0         
	//  199  359:aconst_null     
	//  200  360:putfield        #299 <Field bff l>
		throw exception;
	//  201  363:aload_1         
	//  202  364:athrow          
		throw exception;
	//  203  365:aload_1         
	//  204  366:athrow          
	//  205  367:return          
	}

	protected abstract int a(bhq bhq1, zzfs zzfs1);

	public final int a(zzfs zzfs1)
	{
		int i1;
		try
		{
			i1 = a(c, zzfs1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #91  <Field bhq c>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #400 <Method int a(bhq, zzfs)>
	//    5    9:istore_2        
		}
	//*   6   10:iload_2         
	//*   7   11:ireturn         
		// Misplaced declaration of an exception variable
		catch(zzfs zzfs1)
	//*   8   12:astore_1        
		{
			throw bcs.a(((Exception) (zzfs1)), ((bcq)this).r());
	//    9   13:aload_1         
	//   10   14:aload_0         
	//   11   15:invokevirtual   #126 <Method int bcq.r()>
	//   12   18:invokestatic    #131 <Method bcs bcs.a(Exception, int)>
	//   13   21:athrow          
		}
		return i1;
	}

	protected bhm a(bhq bhq1, zzfs zzfs1, boolean flag)
	{
		return bhq1.a(zzfs1.e, flag);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getfield        #404 <Field String zzfs.e>
	//    3    5:iload_3         
	//    4    6:invokeinterface #407 <Method bhm bhq.a(String, boolean)>
	//    5   11:areturn         
	}

	public final void a(long l1, long l2)
	{
		if(K)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field boolean K>
	//*   2    4:ifeq            12
		{
			y();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #362 <Method void y()>
			return;
	//    5   11:return          
		}
		if(k == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #274 <Field zzfs k>
	//*   8   16:ifnonnull       90
		{
			((bex) (g)).a();
	//    9   19:aload_0         
	//   10   20:getfield        #102 <Field bfc g>
	//   11   23:invokevirtual   #258 <Method void bex.a()>
			int i1 = ((bcq)this).a(h, g, true);
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #108 <Field bdg h>
	//   15   31:aload_0         
	//   16   32:getfield        #102 <Field bfc g>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #284 <Method int bcq.a(bdg, bfc, boolean)>
	//   19   39:istore          5
			if(i1 == -5)
	//*  20   41:iload           5
	//*  21   43:bipush          -5
	//*  22   45:icmpne          62
				b(h.a);
	//   23   48:aload_0         
	//   24   49:aload_0         
	//   25   50:getfield        #108 <Field bdg h>
	//   26   53:getfield        #286 <Field zzfs bdg.a>
	//   27   56:invokevirtual   #289 <Method void b(zzfs)>
			else
	//*  28   59:goto            90
			if(i1 == -4)
	//*  29   62:iload           5
	//*  30   64:bipush          -4
	//*  31   66:icmpne          89
			{
				bnf.b(((bex) (g)).c());
	//   32   69:aload_0         
	//   33   70:getfield        #102 <Field bfc g>
	//   34   73:invokevirtual   #291 <Method boolean bex.c()>
	//   35   76:invokestatic    #84  <Method void bnf.b(boolean)>
				J = true;
	//   36   79:aload_0         
	//   37   80:iconst_1        
	//   38   81:putfield        #237 <Field boolean J>
				w();
	//   39   84:aload_0         
	//   40   85:invokespecial   #150 <Method void w()>
				return;
	//   41   88:return          
			} else
			{
				return;
	//   42   89:return          
			}
		}
		z();
	//   43   90:aload_0         
	//   44   91:invokevirtual   #360 <Method void z()>
		if(n != null)
	//*  45   94:aload_0         
	//*  46   95:getfield        #142 <Field MediaCodec n>
	//*  47   98:ifnull          129
		{
			bnu.a("drainAndFeed");
	//   48  101:ldc2            #410 <String "drainAndFeed">
	//   49  104:invokestatic    #415 <Method void bnu.a(String)>
			while(b(l1, l2)) ;
	//   50  107:aload_0         
	//   51  108:lload_1         
	//   52  109:lload_3         
	//   53  110:invokespecial   #417 <Method boolean b(long, long)>
	//   54  113:ifne            107
			while(v()) ;
	//   55  116:aload_0         
	//   56  117:invokespecial   #419 <Method boolean v()>
	//   57  120:ifne            116
			bnu.a();
	//   58  123:invokestatic    #420 <Method void bnu.a()>
		} else
	//*  59  126:goto            203
		{
			((bcq)this).b(l1);
	//   60  129:aload_0         
	//   61  130:lload_1         
	//   62  131:invokevirtual   #423 <Method void bcq.b(long)>
			((bex) (g)).a();
	//   63  134:aload_0         
	//   64  135:getfield        #102 <Field bfc g>
	//   65  138:invokevirtual   #258 <Method void bex.a()>
			int j1 = ((bcq)this).a(h, g, false);
	//   66  141:aload_0         
	//   67  142:aload_0         
	//   68  143:getfield        #108 <Field bdg h>
	//   69  146:aload_0         
	//   70  147:getfield        #102 <Field bfc g>
	//   71  150:iconst_0        
	//   72  151:invokevirtual   #284 <Method int bcq.a(bdg, bfc, boolean)>
	//   73  154:istore          5
			if(j1 == -5)
	//*  74  156:iload           5
	//*  75  158:bipush          -5
	//*  76  160:icmpne          177
				b(h.a);
	//   77  163:aload_0         
	//   78  164:aload_0         
	//   79  165:getfield        #108 <Field bdg h>
	//   80  168:getfield        #286 <Field zzfs bdg.a>
	//   81  171:invokevirtual   #289 <Method void b(zzfs)>
			else
	//*  82  174:goto            203
			if(j1 == -4)
	//*  83  177:iload           5
	//*  84  179:bipush          -4
	//*  85  181:icmpne          203
			{
				bnf.b(((bex) (g)).c());
	//   86  184:aload_0         
	//   87  185:getfield        #102 <Field bfc g>
	//   88  188:invokevirtual   #291 <Method boolean bex.c()>
	//   89  191:invokestatic    #84  <Method void bnf.b(boolean)>
				J = true;
	//   90  194:aload_0         
	//   91  195:iconst_1        
	//   92  196:putfield        #237 <Field boolean J>
				w();
	//   93  199:aload_0         
	//   94  200:invokespecial   #150 <Method void w()>
			}
		}
		a.a();
	//   95  203:aload_0         
	//   96  204:getfield        #354 <Field bfb a>
	//   97  207:invokevirtual   #424 <Method void bfb.a()>
	//   98  210:return          
	}

	protected void a(long l1, boolean flag)
	{
		J = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #237 <Field boolean J>
		K = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #152 <Field boolean K>
		if(n != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #142 <Field MediaCodec n>
	//*   8   14:ifnull          152
		{
			A = 0x1L;
	//    9   17:aload_0         
	//   10   18:ldc2w           #367 <Long 0x1L>
	//   11   21:putfield        #370 <Field long A>
			B = -1;
	//   12   24:aload_0         
	//   13   25:iconst_m1       
	//   14   26:putfield        #245 <Field int B>
			C = -1;
	//   15   29:aload_0         
	//   16   30:iconst_m1       
	//   17   31:putfield        #136 <Field int C>
			M = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #293 <Field boolean M>
			L = false;
	//   21   39:aload_0         
	//   22   40:iconst_0        
	//   23   41:putfield        #272 <Field boolean L>
			D = false;
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:putfield        #202 <Field boolean D>
			i.clear();
	//   27   49:aload_0         
	//   28   50:getfield        #113 <Field List i>
	//   29   53:invokeinterface #373 <Method void List.clear()>
			w = false;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #264 <Field boolean w>
			x = false;
	//   33   63:aload_0         
	//   34   64:iconst_0        
	//   35   65:putfield        #156 <Field boolean x>
			if(!q && (!t || !I))
	//*  36   68:aload_0         
	//*  37   69:getfield        #377 <Field boolean q>
	//*  38   72:ifne            125
	//*  39   75:aload_0         
	//*  40   76:getfield        #379 <Field boolean t>
	//*  41   79:ifeq            92
	//*  42   82:aload_0         
	//*  43   83:getfield        #140 <Field boolean I>
	//*  44   86:ifeq            92
	//*  45   89:goto            125
			{
				if(G != 0)
	//*  46   92:aload_0         
	//*  47   93:getfield        #122 <Field int G>
	//*  48   96:ifeq            110
				{
					C();
	//   49   99:aload_0         
	//   50  100:invokevirtual   #154 <Method void C()>
					z();
	//   51  103:aload_0         
	//   52  104:invokevirtual   #360 <Method void z()>
				} else
	//*  53  107:goto            133
				{
					n.flush();
	//   54  110:aload_0         
	//   55  111:getfield        #142 <Field MediaCodec n>
	//   56  114:invokevirtual   #428 <Method void MediaCodec.flush()>
					H = false;
	//   57  117:aload_0         
	//   58  118:iconst_0        
	//   59  119:putfield        #270 <Field boolean H>
				}
			} else
	//*  60  122:goto            133
			{
				C();
	//   61  125:aload_0         
	//   62  126:invokevirtual   #154 <Method void C()>
				z();
	//   63  129:aload_0         
	//   64  130:invokevirtual   #360 <Method void z()>
			}
			if(E && k != null)
	//*  65  133:aload_0         
	//*  66  134:getfield        #375 <Field boolean E>
	//*  67  137:ifeq            152
	//*  68  140:aload_0         
	//*  69  141:getfield        #274 <Field zzfs k>
	//*  70  144:ifnull          152
				F = 1;
	//   71  147:aload_0         
	//   72  148:iconst_1        
	//   73  149:putfield        #120 <Field int F>
		}
	//   74  152:return          
	}

	protected void a(MediaCodec mediacodec, MediaFormat mediaformat)
	{
	//    0    0:return          
	}

	protected void a(bfc bfc1)
	{
	//    0    0:return          
	}

	protected abstract void a(bhm bhm1, MediaCodec mediacodec, zzfs zzfs1, MediaCrypto mediacrypto);

	protected void a(String s1, long l1, long l2)
	{
	//    0    0:return          
	}

	protected void a(boolean flag)
	{
		a = new bfb();
	//    0    0:aload_0         
	//    1    1:new             #356 <Class bfb>
	//    2    4:dup             
	//    3    5:invokespecial   #431 <Method void bfb()>
	//    4    8:putfield        #354 <Field bfb a>
	//    5   11:return          
	}

	protected abstract boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, int i1, 
			int j1, long l3, boolean flag);

	protected boolean a(MediaCodec mediacodec, boolean flag, zzfs zzfs1, zzfs zzfs2)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected boolean a(bhm bhm1)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void b(zzfs zzfs1)
	{
		zzfs zzfs2 = k;
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field zzfs k>
	//    2    4:astore          4
		k = zzfs1;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #274 <Field zzfs k>
		zzhp zzhp = k.h;
	//    6   11:aload_0         
	//    7   12:getfield        #274 <Field zzfs k>
	//    8   15:getfield        #436 <Field zzhp zzfs.h>
	//    9   18:astore          5
		if(zzfs2 == null)
	//*  10   20:aload           4
	//*  11   22:ifnonnull       30
			zzfs1 = null;
	//   12   25:aconst_null     
	//   13   26:astore_1        
		else
	//*  14   27:goto            36
			zzfs1 = ((zzfs) (zzfs2.h));
	//   15   30:aload           4
	//   16   32:getfield        #436 <Field zzhp zzfs.h>
	//   17   35:astore_1        
		boolean flag1 = bnw.a(((Object) (zzhp)), ((Object) (zzfs1)));
	//   18   36:aload           5
	//   19   38:aload_1         
	//   20   39:invokestatic    #439 <Method boolean bnw.a(Object, Object)>
	//   21   42:istore_3        
		boolean flag = true;
	//   22   43:iconst_1        
	//   23   44:istore_2        
		if(flag1 ^ true)
	//*  24   45:iload_3         
	//*  25   46:iconst_1        
	//*  26   47:ixor            
	//*  27   48:ifeq            139
			if(k.h != null)
	//*  28   51:aload_0         
	//*  29   52:getfield        #274 <Field zzfs k>
	//*  30   55:getfield        #436 <Field zzhp zzfs.h>
	//*  31   58:ifnull          134
			{
				zzfs1 = ((zzfs) (d));
	//   32   61:aload_0         
	//   33   62:getfield        #93  <Field bfh d>
	//   34   65:astore_1        
				if(zzfs1 != null)
	//*  35   66:aload_1         
	//*  36   67:ifnull          116
				{
					m = ((bfh) (zzfs1)).a(Looper.myLooper(), k.h);
	//   37   70:aload_0         
	//   38   71:aload_1         
	//   39   72:invokestatic    #445 <Method Looper Looper.myLooper()>
	//   40   75:aload_0         
	//   41   76:getfield        #274 <Field zzfs k>
	//   42   79:getfield        #436 <Field zzhp zzfs.h>
	//   43   82:invokeinterface #448 <Method bff bfh.a(Looper, zzhp)>
	//   44   87:putfield        #389 <Field bff m>
					zzfs1 = ((zzfs) (m));
	//   45   90:aload_0         
	//   46   91:getfield        #389 <Field bff m>
	//   47   94:astore_1        
					if(zzfs1 == l)
	//*  48   95:aload_1         
	//*  49   96:aload_0         
	//*  50   97:getfield        #299 <Field bff l>
	//*  51  100:if_acmpne       139
						d.a(((bff) (zzfs1)));
	//   52  103:aload_0         
	//   53  104:getfield        #93  <Field bfh d>
	//   54  107:aload_1         
	//   55  108:invokeinterface #394 <Method void bfh.a(bff)>
				} else
	//*  56  113:goto            139
				{
					throw bcs.a(((Exception) (new IllegalStateException("Media requires a DrmSessionManager"))), ((bcq)this).r());
	//   57  116:new             #134 <Class IllegalStateException>
	//   58  119:dup             
	//   59  120:ldc2            #450 <String "Media requires a DrmSessionManager">
	//   60  123:invokespecial   #452 <Method void IllegalStateException(String)>
	//   61  126:aload_0         
	//   62  127:invokevirtual   #126 <Method int bcq.r()>
	//   63  130:invokestatic    #131 <Method bcs bcs.a(Exception, int)>
	//   64  133:athrow          
				}
			} else
			{
				m = null;
	//   65  134:aload_0         
	//   66  135:aconst_null     
	//   67  136:putfield        #389 <Field bff m>
			}
		if(m == l)
	//*  68  139:aload_0         
	//*  69  140:getfield        #389 <Field bff m>
	//*  70  143:aload_0         
	//*  71  144:getfield        #299 <Field bff l>
	//*  72  147:if_acmpne       238
		{
			zzfs1 = ((zzfs) (n));
	//   73  150:aload_0         
	//   74  151:getfield        #142 <Field MediaCodec n>
	//   75  154:astore_1        
			if(zzfs1 != null && a(((MediaCodec) (zzfs1)), o.b, zzfs2, k))
	//*  76  155:aload_1         
	//*  77  156:ifnull          238
	//*  78  159:aload_0         
	//*  79  160:aload_1         
	//*  80  161:aload_0         
	//*  81  162:getfield        #366 <Field bhm o>
	//*  82  165:getfield        #456 <Field boolean bhm.b>
	//*  83  168:aload           4
	//*  84  170:aload_0         
	//*  85  171:getfield        #274 <Field zzfs k>
	//*  86  174:invokevirtual   #458 <Method boolean a(MediaCodec, boolean, zzfs, zzfs)>
	//*  87  177:ifeq            238
			{
				E = true;
	//   88  180:aload_0         
	//   89  181:iconst_1        
	//   90  182:putfield        #375 <Field boolean E>
				F = 1;
	//   91  185:aload_0         
	//   92  186:iconst_1        
	//   93  187:putfield        #120 <Field int F>
				if(!r || k.i != zzfs2.i || k.j != zzfs2.j)
	//*  94  190:aload_0         
	//*  95  191:getfield        #208 <Field boolean r>
	//*  96  194:ifeq            230
	//*  97  197:aload_0         
	//*  98  198:getfield        #274 <Field zzfs k>
	//*  99  201:getfield        #460 <Field int zzfs.i>
	//* 100  204:aload           4
	//* 101  206:getfield        #460 <Field int zzfs.i>
	//* 102  209:icmpne          230
	//* 103  212:aload_0         
	//* 104  213:getfield        #274 <Field zzfs k>
	//* 105  216:getfield        #462 <Field int zzfs.j>
	//* 106  219:aload           4
	//* 107  221:getfield        #462 <Field int zzfs.j>
	//* 108  224:icmpne          230
	//* 109  227:goto            232
					flag = false;
	//  110  230:iconst_0        
	//  111  231:istore_2        
				w = flag;
	//  112  232:aload_0         
	//  113  233:iload_2         
	//  114  234:putfield        #264 <Field boolean w>
				return;
	//  115  237:return          
			}
		}
		if(H)
	//* 116  238:aload_0         
	//* 117  239:getfield        #270 <Field boolean H>
	//* 118  242:ifeq            251
		{
			G = 1;
	//  119  245:aload_0         
	//  120  246:iconst_1        
	//  121  247:putfield        #122 <Field int G>
			return;
	//  122  250:return          
		} else
		{
			C();
	//  123  251:aload_0         
	//  124  252:invokevirtual   #154 <Method void C()>
			z();
	//  125  255:aload_0         
	//  126  256:invokevirtual   #360 <Method void z()>
			return;
	//  127  259:return          
		}
	}

	public final int m()
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	protected void n()
	{
	//    0    0:return          
	}

	protected void o()
	{
	//    0    0:return          
	}

	protected void p()
	{
		k = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #274 <Field zzfs k>
		C();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #154 <Method void C()>
		if(l != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #299 <Field bff l>
	//*   7   13:ifnull          29
			d.a(l);
	//    8   16:aload_0         
	//    9   17:getfield        #93  <Field bfh d>
	//   10   20:aload_0         
	//   11   21:getfield        #299 <Field bff l>
	//   12   24:invokeinterface #394 <Method void bfh.a(bff)>
		if(m != null && m != l)
	//*  13   29:aload_0         
	//*  14   30:getfield        #389 <Field bff m>
	//*  15   33:ifnull          60
	//*  16   36:aload_0         
	//*  17   37:getfield        #389 <Field bff m>
	//*  18   40:aload_0         
	//*  19   41:getfield        #299 <Field bff l>
	//*  20   44:if_acmpeq       60
			d.a(m);
	//   21   47:aload_0         
	//   22   48:getfield        #93  <Field bfh d>
	//   23   51:aload_0         
	//   24   52:getfield        #389 <Field bff m>
	//   25   55:invokeinterface #394 <Method void bfh.a(bff)>
		l = null;
	//   26   60:aload_0         
	//   27   61:aconst_null     
	//   28   62:putfield        #299 <Field bff l>
		m = null;
	//   29   65:aload_0         
	//   30   66:aconst_null     
	//   31   67:putfield        #389 <Field bff m>
		return;
	//   32   70:return          
		Exception exception;
		exception;
	//   33   71:astore_1        
		l = null;
	//   34   72:aload_0         
	//   35   73:aconst_null     
	//   36   74:putfield        #299 <Field bff l>
		m = null;
	//   37   77:aload_0         
	//   38   78:aconst_null     
	//   39   79:putfield        #389 <Field bff m>
		throw exception;
	//   40   82:aload_1         
	//   41   83:athrow          
		exception;
	//   42   84:astore_1        
		if(m != null && m != l)
	//*  43   85:aload_0         
	//*  44   86:getfield        #389 <Field bff m>
	//*  45   89:ifnull          116
	//*  46   92:aload_0         
	//*  47   93:getfield        #389 <Field bff m>
	//*  48   96:aload_0         
	//*  49   97:getfield        #299 <Field bff l>
	//*  50  100:if_acmpeq       116
			d.a(m);
	//   51  103:aload_0         
	//   52  104:getfield        #93  <Field bfh d>
	//   53  107:aload_0         
	//   54  108:getfield        #389 <Field bff m>
	//   55  111:invokeinterface #394 <Method void bfh.a(bff)>
		l = null;
	//   56  116:aload_0         
	//   57  117:aconst_null     
	//   58  118:putfield        #299 <Field bff l>
		m = null;
	//   59  121:aload_0         
	//   60  122:aconst_null     
	//   61  123:putfield        #389 <Field bff m>
		throw exception;
	//   62  126:aload_1         
	//   63  127:athrow          
		exception;
	//   64  128:astore_1        
		l = null;
	//   65  129:aload_0         
	//   66  130:aconst_null     
	//   67  131:putfield        #299 <Field bff l>
		m = null;
	//   68  134:aload_0         
	//   69  135:aconst_null     
	//   70  136:putfield        #389 <Field bff m>
		throw exception;
	//   71  139:aload_1         
	//   72  140:athrow          
		exception;
	//   73  141:astore_1        
		if(l != null)
	//*  74  142:aload_0         
	//*  75  143:getfield        #299 <Field bff l>
	//*  76  146:ifnull          162
			d.a(l);
	//   77  149:aload_0         
	//   78  150:getfield        #93  <Field bfh d>
	//   79  153:aload_0         
	//   80  154:getfield        #299 <Field bff l>
	//   81  157:invokeinterface #394 <Method void bfh.a(bff)>
		if(m != null && m != l)
	//*  82  162:aload_0         
	//*  83  163:getfield        #389 <Field bff m>
	//*  84  166:ifnull          193
	//*  85  169:aload_0         
	//*  86  170:getfield        #389 <Field bff m>
	//*  87  173:aload_0         
	//*  88  174:getfield        #299 <Field bff l>
	//*  89  177:if_acmpeq       193
			d.a(m);
	//   90  180:aload_0         
	//   91  181:getfield        #93  <Field bfh d>
	//   92  184:aload_0         
	//   93  185:getfield        #389 <Field bff m>
	//   94  188:invokeinterface #394 <Method void bfh.a(bff)>
		l = null;
	//   95  193:aload_0         
	//   96  194:aconst_null     
	//   97  195:putfield        #299 <Field bff l>
		m = null;
	//   98  198:aload_0         
	//   99  199:aconst_null     
	//  100  200:putfield        #389 <Field bff m>
		throw exception;
	//  101  203:aload_1         
	//  102  204:athrow          
		exception;
	//  103  205:astore_1        
		l = null;
	//  104  206:aload_0         
	//  105  207:aconst_null     
	//  106  208:putfield        #299 <Field bff l>
		m = null;
	//  107  211:aload_0         
	//  108  212:aconst_null     
	//  109  213:putfield        #389 <Field bff m>
		throw exception;
	//  110  216:aload_1         
	//  111  217:athrow          
		exception;
	//  112  218:astore_1        
		if(m != null && m != l)
	//* 113  219:aload_0         
	//* 114  220:getfield        #389 <Field bff m>
	//* 115  223:ifnull          250
	//* 116  226:aload_0         
	//* 117  227:getfield        #389 <Field bff m>
	//* 118  230:aload_0         
	//* 119  231:getfield        #299 <Field bff l>
	//* 120  234:if_acmpeq       250
			d.a(m);
	//  121  237:aload_0         
	//  122  238:getfield        #93  <Field bfh d>
	//  123  241:aload_0         
	//  124  242:getfield        #389 <Field bff m>
	//  125  245:invokeinterface #394 <Method void bfh.a(bff)>
		l = null;
	//  126  250:aload_0         
	//  127  251:aconst_null     
	//  128  252:putfield        #299 <Field bff l>
		m = null;
	//  129  255:aload_0         
	//  130  256:aconst_null     
	//  131  257:putfield        #389 <Field bff m>
		throw exception;
	//  132  260:aload_1         
	//  133  261:athrow          
		exception;
	//  134  262:astore_1        
		l = null;
	//  135  263:aload_0         
	//  136  264:aconst_null     
	//  137  265:putfield        #299 <Field bff l>
		m = null;
	//  138  268:aload_0         
	//  139  269:aconst_null     
	//  140  270:putfield        #389 <Field bff m>
		throw exception;
	//  141  273:aload_1         
	//  142  274:athrow          
	}

	public boolean t()
	{
		return k != null && !L && (((bcq)this).s() || C >= 0 || A != 0x1L && SystemClock.elapsedRealtime() < A);
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field zzfs k>
	//    2    4:ifnull          52
	//    3    7:aload_0         
	//    4    8:getfield        #272 <Field boolean L>
	//    5   11:ifne            52
	//    6   14:aload_0         
	//    7   15:invokevirtual   #464 <Method boolean bcq.s()>
	//    8   18:ifne            50
	//    9   21:aload_0         
	//   10   22:getfield        #136 <Field int C>
	//   11   25:ifge            50
	//   12   28:aload_0         
	//   13   29:getfield        #370 <Field long A>
	//   14   32:ldc2w           #367 <Long 0x1L>
	//   15   35:lcmp            
	//   16   36:ifeq            52
	//   17   39:invokestatic    #469 <Method long SystemClock.elapsedRealtime()>
	//   18   42:aload_0         
	//   19   43:getfield        #370 <Field long A>
	//   20   46:lcmp            
	//   21   47:ifge            52
	//   22   50:iconst_1        
	//   23   51:ireturn         
	//   24   52:iconst_0        
	//   25   53:ireturn         
	}

	public boolean u()
	{
		return K;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field boolean K>
	//    2    4:ireturn         
	}

	protected void y()
	{
	//    0    0:return          
	}

	protected final void z()
	{
		String s2;
		if(n != null)
			break MISSING_BLOCK_LABEL_857;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field MediaCodec n>
	//    2    4:ifnonnull       857
		Object obj = ((Object) (k));
	//    3    7:aload_0         
	//    4    8:getfield        #274 <Field zzfs k>
	//    5   11:astore          7
		if(obj == null)
	//*   6   13:aload           7
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		l = m;
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #389 <Field bff m>
	//   12   24:putfield        #299 <Field bff l>
		obj = ((Object) (((zzfs) (obj)).e));
	//   13   27:aload           7
	//   14   29:getfield        #404 <Field String zzfs.e>
	//   15   32:astore          7
		obj = ((Object) (l));
	//   16   34:aload_0         
	//   17   35:getfield        #299 <Field bff l>
	//   18   38:astore          7
		if(obj != null)
	//*  19   40:aload           7
	//*  20   42:ifnull          103
		{
			int i1 = ((bff) (obj)).a();
	//   21   45:aload           7
	//   22   47:invokeinterface #303 <Method int bff.a()>
	//   23   52:istore_1        
			if(i1 != 0)
	//*  24   53:iload_1         
	//*  25   54:ifeq            86
			{
				if(i1 != 3 && i1 != 4)
	//*  26   57:iload_1         
	//*  27   58:iconst_3        
	//*  28   59:icmpeq          68
	//*  29   62:iload_1         
	//*  30   63:iconst_4        
	//*  31   64:icmpeq          68
				{
					return;
	//   32   67:return          
				} else
				{
					l.b();
	//   33   68:aload_0         
	//   34   69:getfield        #299 <Field bff l>
	//   35   72:invokeinterface #474 <Method bfi bff.b()>
	//   36   77:pop             
					throw new NoSuchMethodError();
	//   37   78:new             #476 <Class NoSuchMethodError>
	//   38   81:dup             
	//   39   82:invokespecial   #477 <Method void NoSuchMethodError()>
	//   40   85:athrow          
				}
			} else
			{
				throw bcs.a(((Exception) (l.c())), ((bcq)this).r());
	//   41   86:aload_0         
	//   42   87:getfield        #299 <Field bff l>
	//   43   90:invokeinterface #306 <Method bfg bff.c()>
	//   44   95:aload_0         
	//   45   96:invokevirtual   #126 <Method int bcq.r()>
	//   46   99:invokestatic    #131 <Method bcs bcs.a(Exception, int)>
	//   47  102:athrow          
			}
		}
		if(o == null)
	//*  48  103:aload_0         
	//*  49  104:getfield        #366 <Field bhm o>
	//*  50  107:ifnonnull       180
		{
			try
			{
				o = a(c, k, false);
	//   51  110:aload_0         
	//   52  111:aload_0         
	//   53  112:aload_0         
	//   54  113:getfield        #91  <Field bhq c>
	//   55  116:aload_0         
	//   56  117:getfield        #274 <Field zzfs k>
	//   57  120:iconst_0        
	//   58  121:invokevirtual   #479 <Method bhm a(bhq, zzfs, boolean)>
	//   59  124:putfield        #366 <Field bhm o>
			}
	//*  60  127:goto            153
			catch(bhv bhv1)
	//*  61  130:astore          7
			{
				a(new bho(k, ((Throwable) (bhv1)), false, -49998));
	//   62  132:aload_0         
	//   63  133:new             #481 <Class bho>
	//   64  136:dup             
	//   65  137:aload_0         
	//   66  138:getfield        #274 <Field zzfs k>
	//   67  141:aload           7
	//   68  143:iconst_0        
	//   69  144:ldc2            #482 <Int -49998>
	//   70  147:invokespecial   #485 <Method void bho(zzfs, Throwable, boolean, int)>
	//   71  150:invokespecial   #487 <Method void a(bho)>
			}
			if(o == null)
	//*  72  153:aload_0         
	//*  73  154:getfield        #366 <Field bhm o>
	//*  74  157:ifnonnull       180
				a(new bho(k, ((Throwable) (null)), false, -49999));
	//   75  160:aload_0         
	//   76  161:new             #481 <Class bho>
	//   77  164:dup             
	//   78  165:aload_0         
	//   79  166:getfield        #274 <Field zzfs k>
	//   80  169:aconst_null     
	//   81  170:iconst_0        
	//   82  171:ldc2            #488 <Int -49999>
	//   83  174:invokespecial   #485 <Method void bho(zzfs, Throwable, boolean, int)>
	//   84  177:invokespecial   #487 <Method void a(bho)>
		}
		if(!a(o))
	//*  85  180:aload_0         
	//*  86  181:aload_0         
	//*  87  182:getfield        #366 <Field bhm o>
	//*  88  185:invokevirtual   #490 <Method boolean a(bhm)>
	//*  89  188:ifne            192
			return;
	//   90  191:return          
		s2 = o.a;
	//   91  192:aload_0         
	//   92  193:getfield        #366 <Field bhm o>
	//   93  196:getfield        #492 <Field String bhm.a>
	//   94  199:astore          8
		bhv1 = ((bhv) (k));
	//   95  201:aload_0         
	//   96  202:getfield        #274 <Field zzfs k>
	//   97  205:astore          7
		boolean flag;
		if(bnw.a < 21 && ((zzfs) (bhv1)).g.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(((Object) (s2))))
	//*  98  207:getstatic       #79  <Field int bnw.a>
	//*  99  210:bipush          21
	//* 100  212:icmpge          244
	//* 101  215:aload           7
	//* 102  217:getfield        #278 <Field List zzfs.g>
	//* 103  220:invokeinterface #495 <Method boolean List.isEmpty()>
	//* 104  225:ifeq            244
	//* 105  228:ldc2            #497 <String "OMX.MTK.VIDEO.DECODER.AVC">
	//* 106  231:aload           8
	//* 107  233:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 108  236:ifeq            244
			flag = true;
	//  109  239:iconst_1        
	//  110  240:istore_2        
		else
	//* 111  241:goto            246
			flag = false;
	//  112  244:iconst_0        
	//  113  245:istore_2        
		p = flag;
	//  114  246:aload_0         
	//  115  247:iload_2         
	//  116  248:putfield        #308 <Field boolean p>
		if(bnw.a >= 18 && (bnw.a != 18 || !"OMX.SEC.avc.dec".equals(((Object) (s2))) && !"OMX.SEC.avc.dec.secure".equals(((Object) (s2)))) && (bnw.a != 19 || !bnw.d.startsWith("SM-G800") || !"OMX.Exynos.avc.dec".equals(((Object) (s2))) && !"OMX.Exynos.avc.dec.secure".equals(((Object) (s2)))))
	//* 117  251:getstatic       #79  <Field int bnw.a>
	//* 118  254:bipush          18
	//* 119  256:icmplt          339
	//* 120  259:getstatic       #79  <Field int bnw.a>
	//* 121  262:bipush          18
	//* 122  264:icmpne          289
	//* 123  267:ldc2            #504 <String "OMX.SEC.avc.dec">
	//* 124  270:aload           8
	//* 125  272:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 126  275:ifne            339
	//* 127  278:ldc2            #506 <String "OMX.SEC.avc.dec.secure">
	//* 128  281:aload           8
	//* 129  283:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 130  286:ifne            339
	//* 131  289:getstatic       #79  <Field int bnw.a>
	//* 132  292:bipush          19
	//* 133  294:icmpne          334
	//* 134  297:getstatic       #508 <Field String bnw.d>
	//* 135  300:ldc2            #510 <String "SM-G800">
	//* 136  303:invokevirtual   #514 <Method boolean String.startsWith(String)>
	//* 137  306:ifeq            334
	//* 138  309:ldc2            #516 <String "OMX.Exynos.avc.dec">
	//* 139  312:aload           8
	//* 140  314:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 141  317:ifne            339
	//* 142  320:ldc2            #518 <String "OMX.Exynos.avc.dec.secure">
	//* 143  323:aload           8
	//* 144  325:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 145  328:ifeq            334
	//* 146  331:goto            339
			flag = false;
	//  147  334:iconst_0        
	//  148  335:istore_2        
		else
	//* 149  336:goto            341
			flag = true;
	//  150  339:iconst_1        
	//  151  340:istore_2        
		q = flag;
	//  152  341:aload_0         
	//  153  342:iload_2         
	//  154  343:putfield        #377 <Field boolean q>
		if(bnw.a < 24 && ("OMX.Nvidia.h264.decode".equals(((Object) (s2))) || "OMX.Nvidia.h264.decode.secure".equals(((Object) (s2)))) && ("flounder".equals(((Object) (bnw.b))) || "flounder_lte".equals(((Object) (bnw.b))) || "grouper".equals(((Object) (bnw.b))) || "tilapia".equals(((Object) (bnw.b)))))
	//* 155  346:getstatic       #79  <Field int bnw.a>
	//* 156  349:bipush          24
	//* 157  351:icmpge          429
	//* 158  354:ldc2            #520 <String "OMX.Nvidia.h264.decode">
	//* 159  357:aload           8
	//* 160  359:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 161  362:ifne            376
	//* 162  365:ldc2            #522 <String "OMX.Nvidia.h264.decode.secure">
	//* 163  368:aload           8
	//* 164  370:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 165  373:ifeq            429
	//* 166  376:ldc2            #524 <String "flounder">
	//* 167  379:getstatic       #526 <Field String bnw.b>
	//* 168  382:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 169  385:ifne            424
	//* 170  388:ldc2            #528 <String "flounder_lte">
	//* 171  391:getstatic       #526 <Field String bnw.b>
	//* 172  394:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 173  397:ifne            424
	//* 174  400:ldc2            #530 <String "grouper">
	//* 175  403:getstatic       #526 <Field String bnw.b>
	//* 176  406:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 177  409:ifne            424
	//* 178  412:ldc2            #532 <String "tilapia">
	//* 179  415:getstatic       #526 <Field String bnw.b>
	//* 180  418:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 181  421:ifeq            429
			flag = true;
	//  182  424:iconst_1        
	//  183  425:istore_2        
		else
	//* 184  426:goto            431
			flag = false;
	//  185  429:iconst_0        
	//  186  430:istore_2        
		r = flag;
	//  187  431:aload_0         
	//  188  432:iload_2         
	//  189  433:putfield        #208 <Field boolean r>
		if(bnw.a <= 17 && ("OMX.rk.video_decoder.avc".equals(((Object) (s2))) || "OMX.allwinner.video.decoder.avc".equals(((Object) (s2)))))
	//* 190  436:getstatic       #79  <Field int bnw.a>
	//* 191  439:bipush          17
	//* 192  441:icmpgt          471
	//* 193  444:ldc2            #534 <String "OMX.rk.video_decoder.avc">
	//* 194  447:aload           8
	//* 195  449:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 196  452:ifne            466
	//* 197  455:ldc2            #536 <String "OMX.allwinner.video.decoder.avc">
	//* 198  458:aload           8
	//* 199  460:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 200  463:ifeq            471
			flag = true;
	//  201  466:iconst_1        
	//  202  467:istore_2        
		else
	//* 203  468:goto            473
			flag = false;
	//  204  471:iconst_0        
	//  205  472:istore_2        
		s = flag;
	//  206  473:aload_0         
	//  207  474:iload_2         
	//  208  475:putfield        #235 <Field boolean s>
		if(bnw.a <= 23 && "OMX.google.vorbis.decoder".equals(((Object) (s2))) || bnw.a <= 19 && "hb2000".equals(((Object) (bnw.b))) && ("OMX.amlogic.avc.decoder.awesome".equals(((Object) (s2))) || "OMX.amlogic.avc.decoder.awesome.secure".equals(((Object) (s2)))))
	//* 209  478:getstatic       #79  <Field int bnw.a>
	//* 210  481:bipush          23
	//* 211  483:icmpgt          497
	//* 212  486:ldc2            #538 <String "OMX.google.vorbis.decoder">
	//* 213  489:aload           8
	//* 214  491:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 215  494:ifne            539
	//* 216  497:getstatic       #79  <Field int bnw.a>
	//* 217  500:bipush          19
	//* 218  502:icmpgt          544
	//* 219  505:ldc2            #540 <String "hb2000">
	//* 220  508:getstatic       #526 <Field String bnw.b>
	//* 221  511:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 222  514:ifeq            544
	//* 223  517:ldc2            #542 <String "OMX.amlogic.avc.decoder.awesome">
	//* 224  520:aload           8
	//* 225  522:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 226  525:ifne            539
	//* 227  528:ldc2            #544 <String "OMX.amlogic.avc.decoder.awesome.secure">
	//* 228  531:aload           8
	//* 229  533:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 230  536:ifeq            544
			flag = true;
	//  231  539:iconst_1        
	//  232  540:istore_2        
		else
	//* 233  541:goto            546
			flag = false;
	//  234  544:iconst_0        
	//  235  545:istore_2        
		t = flag;
	//  236  546:aload_0         
	//  237  547:iload_2         
	//  238  548:putfield        #379 <Field boolean t>
		if(bnw.a == 21 && "OMX.google.aac.decoder".equals(((Object) (s2))))
	//* 239  551:getstatic       #79  <Field int bnw.a>
	//* 240  554:bipush          21
	//* 241  556:icmpne          575
	//* 242  559:ldc2            #546 <String "OMX.google.aac.decoder">
	//* 243  562:aload           8
	//* 244  564:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 245  567:ifeq            575
			flag = true;
	//  246  570:iconst_1        
	//  247  571:istore_2        
		else
	//* 248  572:goto            577
			flag = false;
	//  249  575:iconst_0        
	//  250  576:istore_2        
		u = flag;
	//  251  577:aload_0         
	//  252  578:iload_2         
	//  253  579:putfield        #138 <Field boolean u>
		bhv1 = ((bhv) (k));
	//  254  582:aload_0         
	//  255  583:getfield        #274 <Field zzfs k>
	//  256  586:astore          7
		if(bnw.a <= 18 && ((zzfs) (bhv1)).n == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(((Object) (s2))))
	//* 257  588:getstatic       #79  <Field int bnw.a>
	//* 258  591:bipush          18
	//* 259  593:icmpgt          621
	//* 260  596:aload           7
	//* 261  598:getfield        #548 <Field int zzfs.n>
	//* 262  601:iconst_1        
	//* 263  602:icmpne          621
	//* 264  605:ldc2            #550 <String "OMX.MTK.AUDIO.DECODER.MP3">
	//* 265  608:aload           8
	//* 266  610:invokevirtual   #502 <Method boolean String.equals(Object)>
	//* 267  613:ifeq            621
			flag = true;
	//  268  616:iconst_1        
	//  269  617:istore_2        
		else
	//* 270  618:goto            623
			flag = false;
	//  271  621:iconst_0        
	//  272  622:istore_2        
		v = flag;
	//  273  623:aload_0         
	//  274  624:iload_2         
	//  275  625:putfield        #220 <Field boolean v>
		long l1;
		String s1;
		l1 = SystemClock.elapsedRealtime();
	//  276  628:invokestatic    #469 <Method long SystemClock.elapsedRealtime()>
	//  277  631:lstore_3        
		s1 = String.valueOf(((Object) (s2)));
	//  278  632:aload           8
	//  279  634:invokestatic    #553 <Method String String.valueOf(Object)>
	//  280  637:astore          7
		if(s1.length() != 0)
	//* 281  639:aload           7
	//* 282  641:invokevirtual   #556 <Method int String.length()>
	//* 283  644:ifeq            660
		{
			s1 = "createCodec:".concat(s1);
	//  284  647:ldc2            #558 <String "createCodec:">
	//  285  650:aload           7
	//  286  652:invokevirtual   #562 <Method String String.concat(String)>
	//  287  655:astore          7
			break MISSING_BLOCK_LABEL_672;
	//  288  657:goto            672
		}
		s1 = new String("createCodec:");
	//  289  660:new             #499 <Class String>
	//  290  663:dup             
	//  291  664:ldc2            #558 <String "createCodec:">
	//  292  667:invokespecial   #563 <Method void String(String)>
	//  293  670:astore          7
		bnu.a(s1);
	//  294  672:aload           7
	//  295  674:invokestatic    #415 <Method void bnu.a(String)>
		n = MediaCodec.createByCodecName(s2);
	//  296  677:aload_0         
	//  297  678:aload           8
	//  298  680:invokestatic    #567 <Method MediaCodec MediaCodec.createByCodecName(String)>
	//  299  683:putfield        #142 <Field MediaCodec n>
		bnu.a();
	//  300  686:invokestatic    #420 <Method void bnu.a()>
		bnu.a("configureCodec");
	//  301  689:ldc2            #569 <String "configureCodec">
	//  302  692:invokestatic    #415 <Method void bnu.a(String)>
		a(o, n, k, ((MediaCrypto) (null)));
	//  303  695:aload_0         
	//  304  696:aload_0         
	//  305  697:getfield        #366 <Field bhm o>
	//  306  700:aload_0         
	//  307  701:getfield        #142 <Field MediaCodec n>
	//  308  704:aload_0         
	//  309  705:getfield        #274 <Field zzfs k>
	//  310  708:aconst_null     
	//  311  709:invokevirtual   #571 <Method void a(bhm, MediaCodec, zzfs, MediaCrypto)>
		bnu.a();
	//  312  712:invokestatic    #420 <Method void bnu.a()>
		bnu.a("startCodec");
	//  313  715:ldc2            #573 <String "startCodec">
	//  314  718:invokestatic    #415 <Method void bnu.a(String)>
		n.start();
	//  315  721:aload_0         
	//  316  722:getfield        #142 <Field MediaCodec n>
	//  317  725:invokevirtual   #576 <Method void MediaCodec.start()>
		bnu.a();
	//  318  728:invokestatic    #420 <Method void bnu.a()>
		long l3 = SystemClock.elapsedRealtime();
	//  319  731:invokestatic    #469 <Method long SystemClock.elapsedRealtime()>
	//  320  734:lstore          5
		a(s2, l3, l3 - l1);
	//  321  736:aload_0         
	//  322  737:aload           8
	//  323  739:lload           5
	//  324  741:lload           5
	//  325  743:lload_3         
	//  326  744:lsub            
	//  327  745:invokevirtual   #578 <Method void a(String, long, long)>
		y = n.getInputBuffers();
	//  328  748:aload_0         
	//  329  749:aload_0         
	//  330  750:getfield        #142 <Field MediaCodec n>
	//  331  753:invokevirtual   #581 <Method ByteBuffer[] MediaCodec.getInputBuffers()>
	//  332  756:putfield        #251 <Field ByteBuffer[] y>
		z = n.getOutputBuffers();
	//  333  759:aload_0         
	//  334  760:aload_0         
	//  335  761:getfield        #142 <Field MediaCodec n>
	//  336  764:invokevirtual   #233 <Method ByteBuffer[] MediaCodec.getOutputBuffers()>
	//  337  767:putfield        #165 <Field ByteBuffer[] z>
		break MISSING_BLOCK_LABEL_795;
	//  338  770:goto            795
		Exception exception;
		exception;
	//  339  773:astore          7
		a(new bho(k, ((Throwable) (exception)), false, s2));
	//  340  775:aload_0         
	//  341  776:new             #481 <Class bho>
	//  342  779:dup             
	//  343  780:aload_0         
	//  344  781:getfield        #274 <Field zzfs k>
	//  345  784:aload           7
	//  346  786:iconst_0        
	//  347  787:aload           8
	//  348  789:invokespecial   #584 <Method void bho(zzfs, Throwable, boolean, String)>
	//  349  792:invokespecial   #487 <Method void a(bho)>
		long l2;
		if(((bcq)this).d() == 2)
	//* 350  795:aload_0         
	//* 351  796:invokevirtual   #586 <Method int bcq.d()>
	//* 352  799:iconst_2        
	//* 353  800:icmpne          814
			l2 = SystemClock.elapsedRealtime() + 1000L;
	//  354  803:invokestatic    #469 <Method long SystemClock.elapsedRealtime()>
	//  355  806:ldc2w           #587 <Long 1000L>
	//  356  809:ladd            
	//  357  810:lstore_3        
		else
	//* 358  811:goto            818
			l2 = 0x1L;
	//  359  814:ldc2w           #367 <Long 0x1L>
	//  360  817:lstore_3        
		A = l2;
	//  361  818:aload_0         
	//  362  819:lload_3         
	//  363  820:putfield        #370 <Field long A>
		B = -1;
	//  364  823:aload_0         
	//  365  824:iconst_m1       
	//  366  825:putfield        #245 <Field int B>
		C = -1;
	//  367  828:aload_0         
	//  368  829:iconst_m1       
	//  369  830:putfield        #136 <Field int C>
		M = true;
	//  370  833:aload_0         
	//  371  834:iconst_1        
	//  372  835:putfield        #293 <Field boolean M>
		bfb bfb1 = a;
	//  373  838:aload_0         
	//  374  839:getfield        #354 <Field bfb a>
	//  375  842:astore          7
		bfb1.a = bfb1.a + 1;
	//  376  844:aload           7
	//  377  846:aload           7
	//  378  848:getfield        #589 <Field int bfb.a>
	//  379  851:iconst_1        
	//  380  852:iadd            
	//  381  853:putfield        #589 <Field int bfb.a>
		return;
	//  382  856:return          
	//  383  857:return          
	}

	private static final byte b[] = bnw.g("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
	private long A;
	private int B;
	private int C;
	private boolean D;
	private boolean E;
	private int F;
	private int G;
	private boolean H;
	private boolean I;
	private boolean J;
	private boolean K;
	private boolean L;
	private boolean M;
	protected bfb a;
	private final bhq c;
	private final bfh d;
	private final boolean e;
	private final bfc f = new bfc(0);
	private final bfc g = new bfc(0);
	private final bdg h = new bdg();
	private final List i = new ArrayList();
	private final android.media.MediaCodec.BufferInfo j = new android.media.MediaCodec.BufferInfo();
	private zzfs k;
	private bff l;
	private bff m;
	private MediaCodec n;
	private bhm o;
	private boolean p;
	private boolean q;
	private boolean r;
	private boolean s;
	private boolean t;
	private boolean u;
	private boolean v;
	private boolean w;
	private boolean x;
	private ByteBuffer y[];
	private ByteBuffer z[];

	static 
	{
	//    0    0:ldc1            #64  <String "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78">
	//    1    2:invokestatic    #69  <Method byte[] bnw.g(String)>
	//    2    5:putstatic       #71  <Field byte[] b>
	//*   3    8:return          
	}
}
