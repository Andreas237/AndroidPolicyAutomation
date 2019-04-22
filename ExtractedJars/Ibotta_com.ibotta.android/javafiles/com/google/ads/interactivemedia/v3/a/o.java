// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;

import android.content.Context;
import android.media.*;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.ads.interactivemedia.v3.a.b.b;
import com.google.ads.interactivemedia.v3.a.f.i;
import com.google.ads.interactivemedia.v3.a.f.p;
import com.google.ads.interactivemedia.v3.a.f.q;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			m, x, f, c, 
//			q, p, l, t

public class o extends m
{
	public static interface a
		extends m.b
	{

		public abstract void a(int i1, int j1, int k1, float f1);

		public abstract void a(int i1, long l1);

		public abstract void a(Surface surface);
	}


	public o(Context context, t t1, l l1, int i1, long l2, Handler handler, 
			a a1, int j1)
	{
		this(context, t1, l1, i1, l2, ((b) (null)), false, handler, a1, j1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:lload           5
	//    6    8:aconst_null     
	//    7    9:iconst_0        
	//    8   10:aload           7
	//    9   12:aload           8
	//   10   14:iload           9
	//   11   16:invokespecial   #50  <Method void o(Context, t, l, int, long, b, boolean, Handler, o$a, int)>
	//   12   19:return          
	}

	public o(Context context, t t1, l l1, int i1, long l2, b b1, 
			boolean flag, Handler handler, a a1, int j1)
	{
		super(t1, l1, b1, flag, handler, ((m.b) (a1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           7
	//    4    5:iload           8
	//    5    7:aload           9
	//    6    9:aload           10
	//    7   11:invokespecial   #54  <Method void m(t, l, b, boolean, Handler, m$b)>
		c = new x(context);
	//    8   14:aload_0         
	//    9   15:new             #56  <Class x>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #59  <Method void x(Context)>
	//   13   23:putfield        #61  <Field x c>
		f = i1;
	//   14   26:aload_0         
	//   15   27:iload           4
	//   16   29:putfield        #63  <Field int f>
		e = 1000L * l2;
	//   17   32:aload_0         
	//   18   33:ldc2w           #64  <Long 1000L>
	//   19   36:lload           5
	//   20   38:lmul            
	//   21   39:putfield        #67  <Field long e>
		d = a1;
	//   22   42:aload_0         
	//   23   43:aload           10
	//   24   45:putfield        #69  <Field o$a d>
		g = j1;
	//   25   48:aload_0         
	//   26   49:iload           11
	//   27   51:putfield        #71  <Field int g>
		k = -1L;
	//   28   54:aload_0         
	//   29   55:ldc2w           #72  <Long -1L>
	//   30   58:putfield        #75  <Field long k>
		q = -1;
	//   31   61:aload_0         
	//   32   62:iconst_m1       
	//   33   63:putfield        #77  <Field int q>
		r = -1;
	//   34   66:aload_0         
	//   35   67:iconst_m1       
	//   36   68:putfield        #79  <Field int r>
		t = -1F;
	//   37   71:aload_0         
	//   38   72:ldc1            #80  <Float -1F>
	//   39   74:putfield        #82  <Field float t>
		p = -1F;
	//   40   77:aload_0         
	//   41   78:ldc1            #80  <Float -1F>
	//   42   80:putfield        #84  <Field float p>
		u = -1;
	//   43   83:aload_0         
	//   44   84:iconst_m1       
	//   45   85:putfield        #86  <Field int u>
		v = -1;
	//   46   88:aload_0         
	//   47   89:iconst_m1       
	//   48   90:putfield        #88  <Field int v>
		x = -1F;
	//   49   93:aload_0         
	//   50   94:ldc1            #80  <Float -1F>
	//   51   96:putfield        #90  <Field float x>
	//   52   99:return          
	}

	private void A()
	{
		if(b != null && d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field Handler b>
	//*   2    4:ifnull          69
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field o$a d>
	//*   5   11:ifnull          69
		{
			if(m == 0)
	//*   6   14:aload_0         
	//*   7   15:getfield        #100 <Field int m>
	//*   8   18:ifne            22
			{
				return;
	//    9   21:return          
			} else
			{
				long l1 = SystemClock.elapsedRealtime();
	//   10   22:invokestatic    #106 <Method long SystemClock.elapsedRealtime()>
	//   11   25:lstore_2        
				int i1 = m;
	//   12   26:aload_0         
	//   13   27:getfield        #100 <Field int m>
	//   14   30:istore_1        
				long l2 = l;
	//   15   31:aload_0         
	//   16   32:getfield        #108 <Field long l>
	//   17   35:lstore          4
				b.post(new Runnable(i1, l1 - l2) {

					public void run()
					{
						o.a(c).a(a, b);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field o c>
					//    2    4:invokestatic    #32  <Method o$a o.a(o)>
					//    3    7:aload_0         
					//    4    8:getfield        #23  <Field int a>
					//    5   11:aload_0         
					//    6   12:getfield        #25  <Field long b>
					//    7   15:invokeinterface #37  <Method void o$a.a(int, long)>
					//    8   20:return          
					}

					final int a;
					final long b;
					final o c;

			
			{
				c = o.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field o c>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int a>
				b = l1;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #25  <Field long b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   18   37:aload_0         
	//   19   38:getfield        #98  <Field Handler b>
	//   20   41:new             #10  <Class o$3>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:iload_1         
	//   24   47:lload_2         
	//   25   48:lload           4
	//   26   50:lsub            
	//   27   51:invokespecial   #111 <Method void o$3(o, int, long)>
	//   28   54:invokevirtual   #117 <Method boolean Handler.post(Runnable)>
	//   29   57:pop             
				m = 0;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #100 <Field int m>
				l = l1;
	//   33   63:aload_0         
	//   34   64:lload_2         
	//   35   65:putfield        #108 <Field long l>
				return;
	//   36   68:return          
			}
		} else
		{
			return;
	//   37   69:return          
		}
	}

	static a a(o o1)
	{
		return o1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field o$a d>
	//    2    4:areturn         
	}

	private void a()
	{
		if(b != null && d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field Handler b>
	//*   2    4:ifnull          124
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field o$a d>
	//*   5   11:ifnull          124
		{
			if(u == q && v == r && w == s && x == t)
	//*   6   14:aload_0         
	//*   7   15:getfield        #86  <Field int u>
	//*   8   18:aload_0         
	//*   9   19:getfield        #77  <Field int q>
	//*  10   22:icmpne          60
	//*  11   25:aload_0         
	//*  12   26:getfield        #88  <Field int v>
	//*  13   29:aload_0         
	//*  14   30:getfield        #79  <Field int r>
	//*  15   33:icmpne          60
	//*  16   36:aload_0         
	//*  17   37:getfield        #120 <Field int w>
	//*  18   40:aload_0         
	//*  19   41:getfield        #122 <Field int s>
	//*  20   44:icmpne          60
	//*  21   47:aload_0         
	//*  22   48:getfield        #90  <Field float x>
	//*  23   51:aload_0         
	//*  24   52:getfield        #82  <Field float t>
	//*  25   55:fcmpl           
	//*  26   56:ifne            60
			{
				return;
	//   27   59:return          
			} else
			{
				int i1 = q;
	//   28   60:aload_0         
	//   29   61:getfield        #77  <Field int q>
	//   30   64:istore_2        
				int j1 = r;
	//   31   65:aload_0         
	//   32   66:getfield        #79  <Field int r>
	//   33   69:istore_3        
				int k1 = s;
	//   34   70:aload_0         
	//   35   71:getfield        #122 <Field int s>
	//   36   74:istore          4
				float f1 = t;
	//   37   76:aload_0         
	//   38   77:getfield        #82  <Field float t>
	//   39   80:fstore_1        
				b.post(new Runnable(i1, j1, k1, f1) {

					public void run()
					{
						o.a(e).a(a, b, c, d);
					//    0    0:aload_0         
					//    1    1:getfield        #22  <Field o e>
					//    2    4:invokestatic    #37  <Method o$a o.a(o)>
					//    3    7:aload_0         
					//    4    8:getfield        #24  <Field int a>
					//    5   11:aload_0         
					//    6   12:getfield        #26  <Field int b>
					//    7   15:aload_0         
					//    8   16:getfield        #28  <Field int c>
					//    9   19:aload_0         
					//   10   20:getfield        #30  <Field float d>
					//   11   23:invokeinterface #42  <Method void o$a.a(int, int, int, float)>
					//   12   28:return          
					}

					final int a;
					final int b;
					final int c;
					final float d;
					final o e;

			
			{
				e = o.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field o e>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #24  <Field int a>
				b = j1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field int b>
				c = k1;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #28  <Field int c>
				d = f1;
			//   12   21:aload_0         
			//   13   22:fload           5
			//   14   24:putfield        #30  <Field float d>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #32  <Method void Object()>
			//   17   31:return          
			}
				}
);
	//   40   81:aload_0         
	//   41   82:getfield        #98  <Field Handler b>
	//   42   85:new             #6   <Class o$1>
	//   43   88:dup             
	//   44   89:aload_0         
	//   45   90:iload_2         
	//   46   91:iload_3         
	//   47   92:iload           4
	//   48   94:fload_1         
	//   49   95:invokespecial   #125 <Method void o$1(o, int, int, int, float)>
	//   50   98:invokevirtual   #117 <Method boolean Handler.post(Runnable)>
	//   51  101:pop             
				u = i1;
	//   52  102:aload_0         
	//   53  103:iload_2         
	//   54  104:putfield        #86  <Field int u>
				v = j1;
	//   55  107:aload_0         
	//   56  108:iload_3         
	//   57  109:putfield        #88  <Field int v>
				w = k1;
	//   58  112:aload_0         
	//   59  113:iload           4
	//   60  115:putfield        #120 <Field int w>
				x = f1;
	//   61  118:aload_0         
	//   62  119:fload_1         
	//   63  120:putfield        #90  <Field float x>
				return;
	//   64  123:return          
			}
		} else
		{
			return;
	//   65  124:return          
		}
	}

	private void a(MediaFormat mediaformat, boolean flag)
	{
		if(mediaformat.containsKey("max-input-size"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #130 <String "max-input-size">
	//*   2    3:invokevirtual   #136 <Method boolean MediaFormat.containsKey(String)>
	//*   3    6:ifeq            10
			return;
	//    4    9:return          
		int i1 = mediaformat.getInteger("height");
	//    5   10:aload_1         
	//    6   11:ldc1            #138 <String "height">
	//    7   13:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//    8   16:istore_3        
		int j1 = i1;
	//    9   17:iload_3         
	//   10   18:istore          4
		if(flag)
	//*  11   20:iload_2         
	//*  12   21:ifeq            48
		{
			j1 = i1;
	//   13   24:iload_3         
	//   14   25:istore          4
			if(mediaformat.containsKey("max-height"))
	//*  15   27:aload_1         
	//*  16   28:ldc1            #144 <String "max-height">
	//*  17   30:invokevirtual   #136 <Method boolean MediaFormat.containsKey(String)>
	//*  18   33:ifeq            48
				j1 = Math.max(i1, mediaformat.getInteger("max-height"));
	//   19   36:iload_3         
	//   20   37:aload_1         
	//   21   38:ldc1            #144 <String "max-height">
	//   22   40:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//   23   43:invokestatic    #150 <Method int Math.max(int, int)>
	//   24   46:istore          4
		}
		i1 = mediaformat.getInteger("width");
	//   25   48:aload_1         
	//   26   49:ldc1            #152 <String "width">
	//   27   51:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//   28   54:istore_3        
		int k1 = i1;
	//   29   55:iload_3         
	//   30   56:istore          5
		if(flag)
	//*  31   58:iload_2         
	//*  32   59:ifeq            87
		{
			k1 = i1;
	//   33   62:iload_3         
	//   34   63:istore          5
			if(mediaformat.containsKey("max-width"))
	//*  35   65:aload_1         
	//*  36   66:ldc1            #154 <String "max-width">
	//*  37   68:invokevirtual   #136 <Method boolean MediaFormat.containsKey(String)>
	//*  38   71:ifeq            87
				k1 = Math.max(j1, mediaformat.getInteger("max-width"));
	//   39   74:iload           4
	//   40   76:aload_1         
	//   41   77:ldc1            #154 <String "max-width">
	//   42   79:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//   43   82:invokestatic    #150 <Method int Math.max(int, int)>
	//   44   85:istore          5
		}
		String s1 = mediaformat.getString("mime");
	//   45   87:aload_1         
	//   46   88:ldc1            #156 <String "mime">
	//   47   90:invokevirtual   #160 <Method String MediaFormat.getString(String)>
	//   48   93:astore          8
		i1 = -1;
	//   49   95:iconst_m1       
	//   50   96:istore_3        
		int l1 = s1.hashCode();
	//   51   97:aload           8
	//   52   99:invokevirtual   #166 <Method int String.hashCode()>
	//   53  102:istore          7
		byte byte0 = 4;
	//   54  104:iconst_4        
	//   55  105:istore          6
		switch(l1)
	//*  56  107:iload           7
		{
	//*  57  109:lookupswitch    6: default 168
	//	               -1664118616: 246
	//	               -1662541442: 231
	//	               1187890754: 216
	//	               1331836730: 201
	//	               1599127256: 186
	//	               1599127257: 171
	//*  58  168:goto            258
		case 1599127257: 
			if(s1.equals("video/x-vnd.on2.vp9"))
	//*  59  171:aload           8
	//*  60  173:ldc1            #168 <String "video/x-vnd.on2.vp9">
	//*  61  175:invokevirtual   #172 <Method boolean String.equals(Object)>
	//*  62  178:ifeq            258
				i1 = 5;
	//   63  181:iconst_5        
	//   64  182:istore_3        
			break;

	//*  65  183:goto            258
		case 1599127256: 
			if(s1.equals("video/x-vnd.on2.vp8"))
	//*  66  186:aload           8
	//*  67  188:ldc1            #174 <String "video/x-vnd.on2.vp8">
	//*  68  190:invokevirtual   #172 <Method boolean String.equals(Object)>
	//*  69  193:ifeq            258
				i1 = 3;
	//   70  196:iconst_3        
	//   71  197:istore_3        
			break;

	//*  72  198:goto            258
		case 1331836730: 
			if(s1.equals("video/avc"))
	//*  73  201:aload           8
	//*  74  203:ldc1            #176 <String "video/avc">
	//*  75  205:invokevirtual   #172 <Method boolean String.equals(Object)>
	//*  76  208:ifeq            258
				i1 = 2;
	//   77  211:iconst_2        
	//   78  212:istore_3        
			break;

	//*  79  213:goto            258
		case 1187890754: 
			if(s1.equals("video/mp4v-es"))
	//*  80  216:aload           8
	//*  81  218:ldc1            #178 <String "video/mp4v-es">
	//*  82  220:invokevirtual   #172 <Method boolean String.equals(Object)>
	//*  83  223:ifeq            258
				i1 = 1;
	//   84  226:iconst_1        
	//   85  227:istore_3        
			break;

	//*  86  228:goto            258
		case -1662541442: 
			if(s1.equals("video/hevc"))
	//*  87  231:aload           8
	//*  88  233:ldc1            #180 <String "video/hevc">
	//*  89  235:invokevirtual   #172 <Method boolean String.equals(Object)>
	//*  90  238:ifeq            258
				i1 = 4;
	//   91  241:iconst_4        
	//   92  242:istore_3        
			break;

	//*  93  243:goto            258
		case -1664118616: 
			if(s1.equals("video/3gpp"))
	//*  94  246:aload           8
	//*  95  248:ldc1            #182 <String "video/3gpp">
	//*  96  250:invokevirtual   #172 <Method boolean String.equals(Object)>
	//*  97  253:ifeq            258
				i1 = 0;
	//   98  256:iconst_0        
	//   99  257:istore_3        
			break;
		}
		switch(i1)
	//* 100  258:iload_3         
		{
	//* 101  259:tableswitch     0 5: default 296
	//	               0 364
	//	               1 364
	//	               2 322
	//	               3 310
	//	               4 297
	//	               5 297
		default:
			return;
	//  102  296:return          

		case 4: // '\004'
		case 5: // '\005'
			i1 = k1 * j1;
	//  103  297:iload           5
	//  104  299:iload           4
	//  105  301:imul            
	//  106  302:istore_3        
			j1 = ((int) (byte0));
	//  107  303:iload           6
	//  108  305:istore          4
			break;
	//  109  307:goto            373

		case 3: // '\003'
			i1 = k1 * j1;
	//  110  310:iload           5
	//  111  312:iload           4
	//  112  314:imul            
	//  113  315:istore_3        
			j1 = 2;
	//  114  316:iconst_2        
	//  115  317:istore          4
			break;
	//  116  319:goto            373

		case 2: // '\002'
			if("BRAVIA 4K 2015".equals(((Object) (q.d))))
	//* 117  322:ldc1            #184 <String "BRAVIA 4K 2015">
	//* 118  324:getstatic       #189 <Field String q.d>
	//* 119  327:invokevirtual   #172 <Method boolean String.equals(Object)>
	//* 120  330:ifeq            334
				return;
	//  121  333:return          
			i1 = ((k1 + 15) / 16) * ((j1 + 15) / 16) * 16 * 16;
	//  122  334:iload           5
	//  123  336:bipush          15
	//  124  338:iadd            
	//  125  339:bipush          16
	//  126  341:idiv            
	//  127  342:iload           4
	//  128  344:bipush          15
	//  129  346:iadd            
	//  130  347:bipush          16
	//  131  349:idiv            
	//  132  350:imul            
	//  133  351:bipush          16
	//  134  353:imul            
	//  135  354:bipush          16
	//  136  356:imul            
	//  137  357:istore_3        
			j1 = 2;
	//  138  358:iconst_2        
	//  139  359:istore          4
			break;

	//* 140  361:goto            373
		case 0: // '\0'
		case 1: // '\001'
			i1 = k1 * j1;
	//  141  364:iload           5
	//  142  366:iload           4
	//  143  368:imul            
	//  144  369:istore_3        
			j1 = 2;
	//  145  370:iconst_2        
	//  146  371:istore          4
			break;
		}
		mediaformat.setInteger("max-input-size", (i1 * 3) / (j1 * 2));
	//  147  373:aload_1         
	//  148  374:ldc1            #130 <String "max-input-size">
	//  149  376:iload_3         
	//  150  377:iconst_3        
	//  151  378:imul            
	//  152  379:iload           4
	//  153  381:iconst_2        
	//  154  382:imul            
	//  155  383:idiv            
	//  156  384:invokevirtual   #193 <Method void MediaFormat.setInteger(String, int)>
	//  157  387:return          
	}

	private void a(Surface surface)
		throws f
	{
		if(h == surface)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field Surface h>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		h = surface;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #199 <Field Surface h>
		i = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #201 <Field boolean i>
		int i1 = v();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #203 <Method int v()>
	//   13   23:istore_2        
		if(i1 == 2 || i1 == 3)
	//*  14   24:iload_2         
	//*  15   25:iconst_2        
	//*  16   26:icmpeq          34
	//*  17   29:iload_2         
	//*  18   30:iconst_3        
	//*  19   31:icmpne          42
		{
			m();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #205 <Method void m()>
			j();
	//   22   38:aload_0         
	//   23   39:invokevirtual   #207 <Method void j()>
		}
	//   24   42:return          
	}

	private void i()
	{
		if(b != null && d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field Handler b>
	//*   2    4:ifnull          50
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field o$a d>
	//*   5   11:ifnull          50
		{
			if(i)
	//*   6   14:aload_0         
	//*   7   15:getfield        #201 <Field boolean i>
	//*   8   18:ifeq            22
			{
				return;
	//    9   21:return          
			} else
			{
				Surface surface = h;
	//   10   22:aload_0         
	//   11   23:getfield        #199 <Field Surface h>
	//   12   26:astore_1        
				b.post(new Runnable(surface) {

					public void run()
					{
						o.a(b).a(a);
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field o b>
					//    2    4:invokestatic    #28  <Method o$a o.a(o)>
					//    3    7:aload_0         
					//    4    8:getfield        #21  <Field Surface a>
					//    5   11:invokeinterface #33  <Method void o$a.a(Surface)>
					//    6   16:return          
					}

					final Surface a;
					final o b;

			
			{
				b = o.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field o b>
				a = surface;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Surface a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   13   27:aload_0         
	//   14   28:getfield        #98  <Field Handler b>
	//   15   31:new             #8   <Class o$2>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #211 <Method void o$2(o, Surface)>
	//   20   40:invokevirtual   #117 <Method boolean Handler.post(Runnable)>
	//   21   43:pop             
				i = true;
	//   22   44:aload_0         
	//   23   45:iconst_1        
	//   24   46:putfield        #201 <Field boolean i>
				return;
	//   25   49:return          
			}
		} else
		{
			return;
	//   26   50:return          
		}
	}

	protected void a(int i1, long l1, boolean flag)
		throws f
	{
		super.a(i1, l1, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:iload           4
	//    4    5:invokespecial   #214 <Method void m.a(int, long, boolean)>
		if(flag && e > 0L)
	//*   5    8:iload           4
	//*   6   10:ifeq            38
	//*   7   13:aload_0         
	//*   8   14:getfield        #67  <Field long e>
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifle            38
			k = SystemClock.elapsedRealtime() * 1000L + e;
	//   12   22:aload_0         
	//   13   23:invokestatic    #106 <Method long SystemClock.elapsedRealtime()>
	//   14   26:ldc2w           #64  <Long 1000L>
	//   15   29:lmul            
	//   16   30:aload_0         
	//   17   31:getfield        #67  <Field long e>
	//   18   34:ladd            
	//   19   35:putfield        #75  <Field long k>
		c.a();
	//   20   38:aload_0         
	//   21   39:getfield        #61  <Field x c>
	//   22   42:invokevirtual   #216 <Method void x.a()>
	//   23   45:return          
	}

	public void a(int i1, Object obj)
		throws f
	{
		if(i1 == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          14
		{
			a((Surface)obj);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:checkcast       #219 <Class Surface>
	//    6   10:invokespecial   #221 <Method void a(Surface)>
			return;
	//    7   13:return          
		} else
		{
			super.a(i1, obj);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #223 <Method void m.a(int, Object)>
			return;
	//   12   20:return          
		}
	}

	protected void a(long l1)
		throws f
	{
		super.a(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #226 <Method void m.a(long)>
		j = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #228 <Field boolean j>
		n = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #230 <Field int n>
		k = -1L;
	//    9   15:aload_0         
	//   10   16:ldc2w           #72  <Long -1L>
	//   11   19:putfield        #75  <Field long k>
	//   12   22:return          
	}

	protected void a(MediaCodec mediacodec, int i1)
	{
		com.google.ads.interactivemedia.v3.a.f.p.a("skipVideoBuffer");
	//    0    0:ldc1            #233 <String "skipVideoBuffer">
	//    1    2:invokestatic    #238 <Method void p.a(String)>
		mediacodec.releaseOutputBuffer(i1, false);
	//    2    5:aload_1         
	//    3    6:iload_2         
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #244 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		com.google.ads.interactivemedia.v3.a.f.p.a();
	//    6   11:invokestatic    #245 <Method void p.a()>
		mediacodec = ((MediaCodec) (a));
	//    7   14:aload_0         
	//    8   15:getfield        #248 <Field c a>
	//    9   18:astore_1        
		mediacodec.g = ((c) (mediacodec)).g + 1;
	//   10   19:aload_1         
	//   11   20:aload_1         
	//   12   21:getfield        #251 <Field int c.g>
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:putfield        #251 <Field int c.g>
	//   16   29:return          
	}

	protected void a(MediaCodec mediacodec, int i1, long l1)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #254 <Method void a()>
		com.google.ads.interactivemedia.v3.a.f.p.a("releaseOutputBuffer");
	//    2    4:ldc1            #255 <String "releaseOutputBuffer">
	//    3    6:invokestatic    #238 <Method void p.a(String)>
		mediacodec.releaseOutputBuffer(i1, l1);
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:lload_3         
	//    7   12:invokevirtual   #258 <Method void MediaCodec.releaseOutputBuffer(int, long)>
		com.google.ads.interactivemedia.v3.a.f.p.a();
	//    8   15:invokestatic    #245 <Method void p.a()>
		mediacodec = ((MediaCodec) (a));
	//    9   18:aload_0         
	//   10   19:getfield        #248 <Field c a>
	//   11   22:astore_1        
		mediacodec.f = ((c) (mediacodec)).f + 1;
	//   12   23:aload_1         
	//   13   24:aload_1         
	//   14   25:getfield        #259 <Field int c.f>
	//   15   28:iconst_1        
	//   16   29:iadd            
	//   17   30:putfield        #259 <Field int c.f>
		j = true;
	//   18   33:aload_0         
	//   19   34:iconst_1        
	//   20   35:putfield        #228 <Field boolean j>
		i();
	//   21   38:aload_0         
	//   22   39:invokespecial   #261 <Method void i()>
	//   23   42:return          
	}

	protected void a(MediaCodec mediacodec, MediaFormat mediaformat)
	{
		boolean flag;
		if(mediaformat.containsKey("crop-right") && mediaformat.containsKey("crop-left") && mediaformat.containsKey("crop-bottom") && mediaformat.containsKey("crop-top"))
	//*   0    0:aload_2         
	//*   1    1:ldc2            #264 <String "crop-right">
	//*   2    4:invokevirtual   #136 <Method boolean MediaFormat.containsKey(String)>
	//*   3    7:ifeq            45
	//*   4   10:aload_2         
	//*   5   11:ldc2            #266 <String "crop-left">
	//*   6   14:invokevirtual   #136 <Method boolean MediaFormat.containsKey(String)>
	//*   7   17:ifeq            45
	//*   8   20:aload_2         
	//*   9   21:ldc2            #268 <String "crop-bottom">
	//*  10   24:invokevirtual   #136 <Method boolean MediaFormat.containsKey(String)>
	//*  11   27:ifeq            45
	//*  12   30:aload_2         
	//*  13   31:ldc2            #270 <String "crop-top">
	//*  14   34:invokevirtual   #136 <Method boolean MediaFormat.containsKey(String)>
	//*  15   37:ifeq            45
			flag = true;
	//   16   40:iconst_1        
	//   17   41:istore_3        
		else
	//*  18   42:goto            47
			flag = false;
	//   19   45:iconst_0        
	//   20   46:istore_3        
		int l1;
		if(flag)
	//*  21   47:iload_3         
	//*  22   48:ifeq            73
			l1 = (mediaformat.getInteger("crop-right") - mediaformat.getInteger("crop-left")) + 1;
	//   23   51:aload_2         
	//   24   52:ldc2            #264 <String "crop-right">
	//   25   55:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//   26   58:aload_2         
	//   27   59:ldc2            #266 <String "crop-left">
	//   28   62:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//   29   65:isub            
	//   30   66:iconst_1        
	//   31   67:iadd            
	//   32   68:istore          4
		else
	//*  33   70:goto            81
			l1 = mediaformat.getInteger("width");
	//   34   73:aload_2         
	//   35   74:ldc1            #152 <String "width">
	//   36   76:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//   37   79:istore          4
		q = l1;
	//   38   81:aload_0         
	//   39   82:iload           4
	//   40   84:putfield        #77  <Field int q>
		int i1;
		if(flag)
	//*  41   87:iload_3         
	//*  42   88:ifeq            112
			i1 = (mediaformat.getInteger("crop-bottom") - mediaformat.getInteger("crop-top")) + 1;
	//   43   91:aload_2         
	//   44   92:ldc2            #268 <String "crop-bottom">
	//   45   95:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//   46   98:aload_2         
	//   47   99:ldc2            #270 <String "crop-top">
	//   48  102:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//   49  105:isub            
	//   50  106:iconst_1        
	//   51  107:iadd            
	//   52  108:istore_3        
		else
	//*  53  109:goto            119
			i1 = mediaformat.getInteger("height");
	//   54  112:aload_2         
	//   55  113:ldc1            #138 <String "height">
	//   56  115:invokevirtual   #142 <Method int MediaFormat.getInteger(String)>
	//   57  118:istore_3        
		r = i1;
	//   58  119:aload_0         
	//   59  120:iload_3         
	//   60  121:putfield        #79  <Field int r>
		t = p;
	//   61  124:aload_0         
	//   62  125:aload_0         
	//   63  126:getfield        #84  <Field float p>
	//   64  129:putfield        #82  <Field float t>
		if(q.a >= 21)
	//*  65  132:getstatic       #272 <Field int q.a>
	//*  66  135:bipush          21
	//*  67  137:icmplt          189
		{
			int j1 = o;
	//   68  140:aload_0         
	//   69  141:getfield        #274 <Field int o>
	//   70  144:istore_3        
			if(j1 == 90 || j1 == 270)
	//*  71  145:iload_3         
	//*  72  146:bipush          90
	//*  73  148:icmpeq          158
	//*  74  151:iload_3         
	//*  75  152:sipush          270
	//*  76  155:icmpne          197
			{
				int k1 = q;
	//   77  158:aload_0         
	//   78  159:getfield        #77  <Field int q>
	//   79  162:istore_3        
				q = r;
	//   80  163:aload_0         
	//   81  164:aload_0         
	//   82  165:getfield        #79  <Field int r>
	//   83  168:putfield        #77  <Field int q>
				r = k1;
	//   84  171:aload_0         
	//   85  172:iload_3         
	//   86  173:putfield        #79  <Field int r>
				t = 1.0F / t;
	//   87  176:aload_0         
	//   88  177:fconst_1        
	//   89  178:aload_0         
	//   90  179:getfield        #82  <Field float t>
	//   91  182:fdiv            
	//   92  183:putfield        #82  <Field float t>
			}
		} else
	//*  93  186:goto            197
		{
			s = o;
	//   94  189:aload_0         
	//   95  190:aload_0         
	//   96  191:getfield        #274 <Field int o>
	//   97  194:putfield        #122 <Field int s>
		}
		mediacodec.setVideoScalingMode(f);
	//   98  197:aload_1         
	//   99  198:aload_0         
	//  100  199:getfield        #63  <Field int f>
	//  101  202:invokevirtual   #278 <Method void MediaCodec.setVideoScalingMode(int)>
	//  102  205:return          
	}

	protected void a(MediaCodec mediacodec, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto)
	{
		a(mediaformat, flag);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:iload_2         
	//    3    3:invokespecial   #281 <Method void a(MediaFormat, boolean)>
		mediacodec.configure(mediaformat, h, mediacrypto, 0);
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:aload_0         
	//    7    9:getfield        #199 <Field Surface h>
	//    8   12:aload           4
	//    9   14:iconst_0        
	//   10   15:invokevirtual   #285 <Method void MediaCodec.configure(MediaFormat, Surface, MediaCrypto, int)>
	//   11   18:return          
	}

	protected void a(com.google.ads.interactivemedia.v3.a.q q1)
		throws f
	{
		super.a(q1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #288 <Method void m.a(com.google.ads.interactivemedia.v3.a.q)>
		float f1;
		if(q1.a.m == -1F)
	//*   3    5:aload_1         
	//*   4    6:getfield        #293 <Field com.google.ads.interactivemedia.v3.a.p q.a>
	//*   5    9:getfield        #297 <Field float p.m>
	//*   6   12:ldc1            #80  <Float -1F>
	//*   7   14:fcmpl           
	//*   8   15:ifne            23
			f1 = 1.0F;
	//    9   18:fconst_1        
	//   10   19:fstore_2        
		else
	//*  11   20:goto            31
			f1 = q1.a.m;
	//   12   23:aload_1         
	//   13   24:getfield        #293 <Field com.google.ads.interactivemedia.v3.a.p q.a>
	//   14   27:getfield        #297 <Field float p.m>
	//   15   30:fstore_2        
		p = f1;
	//   16   31:aload_0         
	//   17   32:fload_2         
	//   18   33:putfield        #84  <Field float p>
		int i1;
		if(q1.a.l == -1)
	//*  19   36:aload_1         
	//*  20   37:getfield        #293 <Field com.google.ads.interactivemedia.v3.a.p q.a>
	//*  21   40:getfield        #299 <Field int p.l>
	//*  22   43:iconst_m1       
	//*  23   44:icmpne          52
			i1 = 0;
	//   24   47:iconst_0        
	//   25   48:istore_3        
		else
	//*  26   49:goto            60
			i1 = q1.a.l;
	//   27   52:aload_1         
	//   28   53:getfield        #293 <Field com.google.ads.interactivemedia.v3.a.p q.a>
	//   29   56:getfield        #299 <Field int p.l>
	//   30   59:istore_3        
		o = i1;
	//   31   60:aload_0         
	//   32   61:iload_3         
	//   33   62:putfield        #274 <Field int o>
	//   34   65:return          
	}

	protected boolean a(long l1, long l2)
	{
		return l1 < -30000L;
	//    0    0:lload_1         
	//    1    1:ldc2w           #301 <Long -30000L>
	//    2    4:lcmp            
	//    3    5:ifge            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
			int i1, boolean flag)
	{
		if(flag)
	//*   0    0:iload           9
	//*   1    2:ifeq            20
		{
			a(mediacodec, i1);
	//    2    5:aload_0         
	//    3    6:aload           5
	//    4    8:iload           8
	//    5   10:invokevirtual   #307 <Method void a(MediaCodec, int)>
			n = 0;
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:putfield        #230 <Field int n>
			return true;
	//    9   18:iconst_1        
	//   10   19:ireturn         
		}
		if(!j)
	//*  11   20:aload_0         
	//*  12   21:getfield        #228 <Field boolean j>
	//*  13   24:ifne            64
		{
			if(q.a >= 21)
	//*  14   27:getstatic       #272 <Field int q.a>
	//*  15   30:bipush          21
	//*  16   32:icmplt          49
				a(mediacodec, i1, System.nanoTime());
	//   17   35:aload_0         
	//   18   36:aload           5
	//   19   38:iload           8
	//   20   40:invokestatic    #312 <Method long System.nanoTime()>
	//   21   43:invokevirtual   #314 <Method void a(MediaCodec, int, long)>
			else
	//*  22   46:goto            57
				c(mediacodec, i1);
	//   23   49:aload_0         
	//   24   50:aload           5
	//   25   52:iload           8
	//   26   54:invokevirtual   #316 <Method void c(MediaCodec, int)>
			n = 0;
	//   27   57:aload_0         
	//   28   58:iconst_0        
	//   29   59:putfield        #230 <Field int n>
			return true;
	//   30   62:iconst_1        
	//   31   63:ireturn         
		}
		if(v() != 3)
	//*  32   64:aload_0         
	//*  33   65:invokevirtual   #203 <Method int v()>
	//*  34   68:iconst_3        
	//*  35   69:icmpeq          74
			return false;
	//   36   72:iconst_0        
	//   37   73:ireturn         
		long l4 = SystemClock.elapsedRealtime();
	//   38   74:invokestatic    #106 <Method long SystemClock.elapsedRealtime()>
	//   39   77:lstore          12
		long l5 = bufferinfo.presentationTimeUs;
	//   40   79:aload           7
	//   41   81:getfield        #321 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//   42   84:lstore          14
		long l3 = System.nanoTime();
	//   43   86:invokestatic    #312 <Method long System.nanoTime()>
	//   44   89:lstore          10
		l1 = c.a(bufferinfo.presentationTimeUs, (l5 - l1 - (l4 * 1000L - l2)) * 1000L + l3);
	//   45   91:aload_0         
	//   46   92:getfield        #61  <Field x c>
	//   47   95:aload           7
	//   48   97:getfield        #321 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//   49  100:lload           14
	//   50  102:lload_1         
	//   51  103:lsub            
	//   52  104:lload           12
	//   53  106:ldc2w           #64  <Long 1000L>
	//   54  109:lmul            
	//   55  110:lload_3         
	//   56  111:lsub            
	//   57  112:lsub            
	//   58  113:ldc2w           #64  <Long 1000L>
	//   59  116:lmul            
	//   60  117:lload           10
	//   61  119:ladd            
	//   62  120:invokevirtual   #324 <Method long x.a(long, long)>
	//   63  123:lstore_1        
		l3 = (l1 - l3) / 1000L;
	//   64  124:lload_1         
	//   65  125:lload           10
	//   66  127:lsub            
	//   67  128:ldc2w           #64  <Long 1000L>
	//   68  131:ldiv            
	//   69  132:lstore          10
		if(a(l3, l2))
	//*  70  134:aload_0         
	//*  71  135:lload           10
	//*  72  137:lload_3         
	//*  73  138:invokevirtual   #326 <Method boolean a(long, long)>
	//*  74  141:ifeq            154
		{
			b(mediacodec, i1);
	//   75  144:aload_0         
	//   76  145:aload           5
	//   77  147:iload           8
	//   78  149:invokevirtual   #328 <Method void b(MediaCodec, int)>
			return true;
	//   79  152:iconst_1        
	//   80  153:ireturn         
		}
		if(q.a >= 21)
	//*  81  154:getstatic       #272 <Field int q.a>
	//*  82  157:bipush          21
	//*  83  159:icmplt          189
			if(l3 < 50000L)
	//*  84  162:lload           10
	//*  85  164:ldc2w           #329 <Long 50000L>
	//*  86  167:lcmp            
	//*  87  168:ifge            187
			{
				a(mediacodec, i1, l1);
	//   88  171:aload_0         
	//   89  172:aload           5
	//   90  174:iload           8
	//   91  176:lload_1         
	//   92  177:invokevirtual   #314 <Method void a(MediaCodec, int, long)>
				n = 0;
	//   93  180:aload_0         
	//   94  181:iconst_0        
	//   95  182:putfield        #230 <Field int n>
				return true;
	//   96  185:iconst_1        
	//   97  186:ireturn         
			} else
			{
				return false;
	//   98  187:iconst_0        
	//   99  188:ireturn         
			}
		if(l3 < 30000L)
	//* 100  189:lload           10
	//* 101  191:ldc2w           #331 <Long 30000L>
	//* 102  194:lcmp            
	//* 103  195:ifge            244
		{
			if(l3 > 11000L)
	//* 104  198:lload           10
	//* 105  200:ldc2w           #333 <Long 11000L>
	//* 106  203:lcmp            
	//* 107  204:ifle            229
				try
				{
					Thread.sleep((l3 - 10000L) / 1000L);
	//  108  207:lload           10
	//  109  209:ldc2w           #335 <Long 10000L>
	//  110  212:lsub            
	//  111  213:ldc2w           #64  <Long 1000L>
	//  112  216:ldiv            
	//  113  217:invokestatic    #341 <Method void Thread.sleep(long)>
				}
	//* 114  220:goto            229
	//* 115  223:invokestatic    #345 <Method Thread Thread.currentThread()>
	//* 116  226:invokevirtual   #348 <Method void Thread.interrupt()>
	//* 117  229:aload_0         
	//* 118  230:aload           5
	//* 119  232:iload           8
	//* 120  234:invokevirtual   #316 <Method void c(MediaCodec, int)>
	//* 121  237:aload_0         
	//* 122  238:iconst_0        
	//* 123  239:putfield        #230 <Field int n>
	//* 124  242:iconst_1        
	//* 125  243:ireturn         
	//* 126  244:iconst_0        
	//* 127  245:ireturn         
				// Misplaced declaration of an exception variable
				catch(ByteBuffer bytebuffer)
				{
					Thread.currentThread().interrupt();
				}
			c(mediacodec, i1);
			n = 0;
			return true;
		} else
		{
			return false;
		}
	//* 128  246:astore          6
	//* 129  248:goto            223
	}

	protected boolean a(MediaCodec mediacodec, boolean flag, com.google.ads.interactivemedia.v3.a.p p1, com.google.ads.interactivemedia.v3.a.p p2)
	{
		return p2.b.equals(((Object) (p1.b))) && (flag || p1.h == p2.h && p1.i == p2.i);
	//    0    0:aload           4
	//    1    2:getfield        #351 <Field String com.google.ads.interactivemedia.v3.a.p.b>
	//    2    5:aload_3         
	//    3    6:getfield        #351 <Field String com.google.ads.interactivemedia.v3.a.p.b>
	//    4    9:invokevirtual   #172 <Method boolean String.equals(Object)>
	//    5   12:ifeq            45
	//    6   15:iload_2         
	//    7   16:ifne            43
	//    8   19:aload_3         
	//    9   20:getfield        #353 <Field int p.h>
	//   10   23:aload           4
	//   11   25:getfield        #353 <Field int p.h>
	//   12   28:icmpne          45
	//   13   31:aload_3         
	//   14   32:getfield        #355 <Field int com.google.ads.interactivemedia.v3.a.p.i>
	//   15   35:aload           4
	//   16   37:getfield        #355 <Field int com.google.ads.interactivemedia.v3.a.p.i>
	//   17   40:icmpne          45
	//   18   43:iconst_1        
	//   19   44:ireturn         
	//   20   45:iconst_0        
	//   21   46:ireturn         
	}

	protected boolean a(l l1, com.google.ads.interactivemedia.v3.a.p p1)
		throws n.b
	{
		boolean flag;
label0:
		{
			p1 = ((com.google.ads.interactivemedia.v3.a.p) (p1.b));
	//    0    0:aload_2         
	//    1    1:getfield        #351 <Field String com.google.ads.interactivemedia.v3.a.p.b>
	//    2    4:astore_2        
			boolean flag2 = com.google.ads.interactivemedia.v3.a.f.i.b(((String) (p1)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #362 <Method boolean i.b(String)>
	//    5    9:istore          5
			boolean flag1 = false;
	//    6   11:iconst_0        
	//    7   12:istore          4
			flag = flag1;
	//    8   14:iload           4
	//    9   16:istore_3        
			if(!flag2)
				break label0;
	//   10   17:iload           5
	//   11   19:ifeq            48
			if(!"video/x-unknown".equals(((Object) (p1))))
	//*  12   22:ldc2            #364 <String "video/x-unknown">
	//*  13   25:aload_2         
	//*  14   26:invokevirtual   #172 <Method boolean String.equals(Object)>
	//*  15   29:ifne            46
			{
				flag = flag1;
	//   16   32:iload           4
	//   17   34:istore_3        
				if(l1.a(((String) (p1)), false) == null)
					break label0;
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:iconst_0        
	//   21   38:invokeinterface #369 <Method e l.a(String, boolean)>
	//   22   43:ifnull          48
			}
			flag = true;
	//   23   46:iconst_1        
	//   24   47:istore_3        
		}
		return flag;
	//   25   48:iload_3         
	//   26   49:ireturn         
	}

	protected void b(MediaCodec mediacodec, int i1)
	{
		com.google.ads.interactivemedia.v3.a.f.p.a("dropVideoBuffer");
	//    0    0:ldc2            #371 <String "dropVideoBuffer">
	//    1    3:invokestatic    #238 <Method void p.a(String)>
		mediacodec.releaseOutputBuffer(i1, false);
	//    2    6:aload_1         
	//    3    7:iload_2         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #244 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		com.google.ads.interactivemedia.v3.a.f.p.a();
	//    6   12:invokestatic    #245 <Method void p.a()>
		mediacodec = ((MediaCodec) (a));
	//    7   15:aload_0         
	//    8   16:getfield        #248 <Field c a>
	//    9   19:astore_1        
		mediacodec.h = ((c) (mediacodec)).h + 1;
	//   10   20:aload_1         
	//   11   21:aload_1         
	//   12   22:getfield        #372 <Field int c.h>
	//   13   25:iconst_1        
	//   14   26:iadd            
	//   15   27:putfield        #372 <Field int c.h>
		m = m + 1;
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #100 <Field int m>
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #100 <Field int m>
		n = n + 1;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #230 <Field int n>
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:putfield        #230 <Field int n>
		a.i = Math.max(n, a.i);
	//   28   50:aload_0         
	//   29   51:getfield        #248 <Field c a>
	//   30   54:aload_0         
	//   31   55:getfield        #230 <Field int n>
	//   32   58:aload_0         
	//   33   59:getfield        #248 <Field c a>
	//   34   62:getfield        #373 <Field int com.google.ads.interactivemedia.v3.a.c.i>
	//   35   65:invokestatic    #150 <Method int Math.max(int, int)>
	//   36   68:putfield        #373 <Field int com.google.ads.interactivemedia.v3.a.c.i>
		if(m == g)
	//*  37   71:aload_0         
	//*  38   72:getfield        #100 <Field int m>
	//*  39   75:aload_0         
	//*  40   76:getfield        #71  <Field int g>
	//*  41   79:icmpne          86
			A();
	//   42   82:aload_0         
	//   43   83:invokespecial   #375 <Method void A()>
	//   44   86:return          
	}

	protected void c()
	{
		super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #377 <Method void m.c()>
		m = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #100 <Field int m>
		l = SystemClock.elapsedRealtime();
	//    5    9:aload_0         
	//    6   10:invokestatic    #106 <Method long SystemClock.elapsedRealtime()>
	//    7   13:putfield        #108 <Field long l>
	//    8   16:return          
	}

	protected void c(MediaCodec mediacodec, int i1)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #254 <Method void a()>
		com.google.ads.interactivemedia.v3.a.f.p.a("releaseOutputBuffer");
	//    2    4:ldc1            #255 <String "releaseOutputBuffer">
	//    3    6:invokestatic    #238 <Method void p.a(String)>
		mediacodec.releaseOutputBuffer(i1, true);
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #244 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		com.google.ads.interactivemedia.v3.a.f.p.a();
	//    8   15:invokestatic    #245 <Method void p.a()>
		mediacodec = ((MediaCodec) (a));
	//    9   18:aload_0         
	//   10   19:getfield        #248 <Field c a>
	//   11   22:astore_1        
		mediacodec.f = ((c) (mediacodec)).f + 1;
	//   12   23:aload_1         
	//   13   24:aload_1         
	//   14   25:getfield        #259 <Field int c.f>
	//   15   28:iconst_1        
	//   16   29:iadd            
	//   17   30:putfield        #259 <Field int c.f>
		j = true;
	//   18   33:aload_0         
	//   19   34:iconst_1        
	//   20   35:putfield        #228 <Field boolean j>
		i();
	//   21   38:aload_0         
	//   22   39:invokespecial   #261 <Method void i()>
	//   23   42:return          
	}

	protected void d()
	{
		k = -1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #72  <Long -1L>
	//    2    4:putfield        #75  <Field long k>
		A();
	//    3    7:aload_0         
	//    4    8:invokespecial   #375 <Method void A()>
		super.d();
	//    5   11:aload_0         
	//    6   12:invokespecial   #379 <Method void m.d()>
	//    7   15:return          
	}

	protected boolean f()
	{
		if(super.f() && (j || !l() || o() == 2))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #382 <Method boolean m.f()>
	//*   2    4:ifeq            38
	//*   3    7:aload_0         
	//*   4    8:getfield        #228 <Field boolean j>
	//*   5   11:ifne            29
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #384 <Method boolean l()>
	//*   8   18:ifeq            29
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #386 <Method int o()>
	//*  11   25:iconst_2        
	//*  12   26:icmpne          38
		{
			k = -1L;
	//   13   29:aload_0         
	//   14   30:ldc2w           #72  <Long -1L>
	//   15   33:putfield        #75  <Field long k>
			return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
		}
		if(k == -1L)
	//*  18   38:aload_0         
	//*  19   39:getfield        #75  <Field long k>
	//*  20   42:ldc2w           #72  <Long -1L>
	//*  21   45:lcmp            
	//*  22   46:ifne            51
			return false;
	//   23   49:iconst_0        
	//   24   50:ireturn         
		if(SystemClock.elapsedRealtime() * 1000L < k)
	//*  25   51:invokestatic    #106 <Method long SystemClock.elapsedRealtime()>
	//*  26   54:ldc2w           #64  <Long 1000L>
	//*  27   57:lmul            
	//*  28   58:aload_0         
	//*  29   59:getfield        #75  <Field long k>
	//*  30   62:lcmp            
	//*  31   63:ifge            68
		{
			return true;
	//   32   66:iconst_1        
	//   33   67:ireturn         
		} else
		{
			k = -1L;
	//   34   68:aload_0         
	//   35   69:ldc2w           #72  <Long -1L>
	//   36   72:putfield        #75  <Field long k>
			return false;
	//   37   75:iconst_0        
	//   38   76:ireturn         
		}
	}

	protected void g()
		throws f
	{
		q = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #77  <Field int q>
		r = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #79  <Field int r>
		t = -1F;
	//    6   10:aload_0         
	//    7   11:ldc1            #80  <Float -1F>
	//    8   13:putfield        #82  <Field float t>
		p = -1F;
	//    9   16:aload_0         
	//   10   17:ldc1            #80  <Float -1F>
	//   11   19:putfield        #84  <Field float p>
		u = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #86  <Field int u>
		v = -1;
	//   15   27:aload_0         
	//   16   28:iconst_m1       
	//   17   29:putfield        #88  <Field int v>
		x = -1F;
	//   18   32:aload_0         
	//   19   33:ldc1            #80  <Float -1F>
	//   20   35:putfield        #90  <Field float x>
		c.b();
	//   21   38:aload_0         
	//   22   39:getfield        #61  <Field x c>
	//   23   42:invokevirtual   #388 <Method void com.google.ads.interactivemedia.v3.a.x.b()>
		super.g();
	//   24   45:aload_0         
	//   25   46:invokespecial   #390 <Method void m.g()>
	//   26   49:return          
	}

	protected boolean k()
	{
		if(super.k())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #392 <Method boolean m.k()>
	//*   2    4:ifeq            25
		{
			Surface surface = h;
	//    3    7:aload_0         
	//    4    8:getfield        #199 <Field Surface h>
	//    5   11:astore_1        
			if(surface != null && surface.isValid())
	//*   6   12:aload_1         
	//*   7   13:ifnull          25
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #395 <Method boolean Surface.isValid()>
	//*  10   20:ifeq            25
				return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		}
		return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private final x c;
	private final a d;
	private final long e;
	private final int f;
	private final int g;
	private Surface h;
	private boolean i;
	private boolean j;
	private long k;
	private long l;
	private int m;
	private int n;
	private int o;
	private float p;
	private int q;
	private int r;
	private int s;
	private float t;
	private int u;
	private int v;
	private int w;
	private float x;
}
