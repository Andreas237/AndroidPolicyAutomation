// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.*;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bhn, boi, bol, bnw, 
//			bnu, bfb, zzfs, zzqk, 
//			boh, bnk, zzhp, bhq, 
//			bhm, bhs, bcq, bog, 
//			bnf, bdo, bok, bfh, 
//			bfc

public final class boe extends bhn
{

	public boe(Context context, bhq bhq1, long l1, Handler handler, bok bok, int i1)
	{
		this(context, bhq1, 0L, ((bfh) (null)), false, handler, bok, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lconst_0        
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aload           5
	//    7    8:aload           6
	//    8   10:iconst_m1       
	//    9   11:invokespecial   #62  <Method void boe(Context, bhq, long, bfh, boolean, Handler, bok, int)>
	//   10   14:return          
	}

	private boe(Context context, bhq bhq1, long l1, bfh bfh, boolean flag, Handler handler, 
			bok bok, int i1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          10
		super(2, bhq1, ((bfh) (null)), false);
	//    2    3:aload_0         
	//    3    4:iconst_2        
	//    4    5:aload_2         
	//    5    6:aconst_null     
	//    6    7:iconst_0        
	//    7    8:invokespecial   #65  <Method void bhn(int, bhq, bfh, boolean)>
		g = 0L;
	//    8   11:aload_0         
	//    9   12:lconst_0        
	//   10   13:putfield        #67  <Field long g>
		h = -1;
	//   11   16:aload_0         
	//   12   17:iconst_m1       
	//   13   18:putfield        #69  <Field int h>
		d = context.getApplicationContext();
	//   14   21:aload_0         
	//   15   22:aload_1         
	//   16   23:invokevirtual   #75  <Method Context Context.getApplicationContext()>
	//   17   26:putfield        #77  <Field Context d>
		e = new boi(context);
	//   18   29:aload_0         
	//   19   30:new             #79  <Class boi>
	//   20   33:dup             
	//   21   34:aload_1         
	//   22   35:invokespecial   #82  <Method void boi(Context)>
	//   23   38:putfield        #84  <Field boi e>
		f = new bol(handler, bok);
	//   24   41:aload_0         
	//   25   42:new             #86  <Class bol>
	//   26   45:dup             
	//   27   46:aload           7
	//   28   48:aload           8
	//   29   50:invokespecial   #89  <Method void bol(Handler, bok)>
	//   30   53:putfield        #91  <Field bol f>
		flag = flag1;
	//   31   56:iload           10
	//   32   58:istore          6
		if(bnw.a <= 22)
	//*  33   60:getstatic       #96  <Field int bnw.a>
	//*  34   63:bipush          22
	//*  35   65:icmpgt          101
		{
			flag = flag1;
	//   36   68:iload           10
	//   37   70:istore          6
			if("foster".equals(((Object) (bnw.b))))
	//*  38   72:ldc1            #98  <String "foster">
	//*  39   74:getstatic       #101 <Field String bnw.b>
	//*  40   77:invokevirtual   #107 <Method boolean String.equals(Object)>
	//*  41   80:ifeq            101
			{
				flag = flag1;
	//   42   83:iload           10
	//   43   85:istore          6
				if("NVIDIA".equals(((Object) (bnw.c))))
	//*  44   87:ldc1            #109 <String "NVIDIA">
	//*  45   89:getstatic       #111 <Field String bnw.c>
	//*  46   92:invokevirtual   #107 <Method boolean String.equals(Object)>
	//*  47   95:ifeq            101
					flag = true;
	//   48   98:iconst_1        
	//   49   99:istore          6
			}
		}
		i = flag;
	//   50  101:aload_0         
	//   51  102:iload           6
	//   52  104:putfield        #113 <Field boolean i>
		j = new long[10];
	//   53  107:aload_0         
	//   54  108:bipush          10
	//   55  110:newarray        long[]
	//   56  112:putfield        #115 <Field long[] j>
		G = 0x1L;
	//   57  115:aload_0         
	//   58  116:ldc2w           #116 <Long 0x1L>
	//   59  119:putfield        #119 <Field long G>
		q = 0x1L;
	//   60  122:aload_0         
	//   61  123:ldc2w           #116 <Long 0x1L>
	//   62  126:putfield        #121 <Field long q>
		w = -1;
	//   63  129:aload_0         
	//   64  130:iconst_m1       
	//   65  131:putfield        #123 <Field int w>
		x = -1;
	//   66  134:aload_0         
	//   67  135:iconst_m1       
	//   68  136:putfield        #125 <Field int x>
		z = -1F;
	//   69  139:aload_0         
	//   70  140:ldc1            #126 <Float -1F>
	//   71  142:putfield        #128 <Field float z>
		v = -1F;
	//   72  145:aload_0         
	//   73  146:ldc1            #126 <Float -1F>
	//   74  148:putfield        #130 <Field float v>
		o = 1;
	//   75  151:aload_0         
	//   76  152:iconst_1        
	//   77  153:putfield        #132 <Field int o>
		D();
	//   78  156:aload_0         
	//   79  157:invokespecial   #134 <Method void D()>
	//   80  160:return          
	}

	private final void D()
	{
		A = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #136 <Field int A>
		B = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #138 <Field int B>
		D = -1F;
	//    6   10:aload_0         
	//    7   11:ldc1            #126 <Float -1F>
	//    8   13:putfield        #140 <Field float D>
		C = -1;
	//    9   16:aload_0         
	//   10   17:iconst_m1       
	//   11   18:putfield        #142 <Field int C>
	//   12   21:return          
	}

	private final void E()
	{
		if(A != w || B != x || C != y || D != z)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field int A>
	//*   2    4:aload_0         
	//*   3    5:getfield        #123 <Field int w>
	//*   4    8:icmpne          45
	//*   5   11:aload_0         
	//*   6   12:getfield        #138 <Field int B>
	//*   7   15:aload_0         
	//*   8   16:getfield        #125 <Field int x>
	//*   9   19:icmpne          45
	//*  10   22:aload_0         
	//*  11   23:getfield        #142 <Field int C>
	//*  12   26:aload_0         
	//*  13   27:getfield        #144 <Field int y>
	//*  14   30:icmpne          45
	//*  15   33:aload_0         
	//*  16   34:getfield        #140 <Field float D>
	//*  17   37:aload_0         
	//*  18   38:getfield        #128 <Field float z>
	//*  19   41:fcmpl           
	//*  20   42:ifeq            100
		{
			f.a(w, x, y, z);
	//   21   45:aload_0         
	//   22   46:getfield        #91  <Field bol f>
	//   23   49:aload_0         
	//   24   50:getfield        #123 <Field int w>
	//   25   53:aload_0         
	//   26   54:getfield        #125 <Field int x>
	//   27   57:aload_0         
	//   28   58:getfield        #144 <Field int y>
	//   29   61:aload_0         
	//   30   62:getfield        #128 <Field float z>
	//   31   65:invokevirtual   #147 <Method void bol.a(int, int, int, float)>
			A = w;
	//   32   68:aload_0         
	//   33   69:aload_0         
	//   34   70:getfield        #123 <Field int w>
	//   35   73:putfield        #136 <Field int A>
			B = x;
	//   36   76:aload_0         
	//   37   77:aload_0         
	//   38   78:getfield        #125 <Field int x>
	//   39   81:putfield        #138 <Field int B>
			C = y;
	//   40   84:aload_0         
	//   41   85:aload_0         
	//   42   86:getfield        #144 <Field int y>
	//   43   89:putfield        #142 <Field int C>
			D = z;
	//   44   92:aload_0         
	//   45   93:aload_0         
	//   46   94:getfield        #128 <Field float z>
	//   47   97:putfield        #140 <Field float D>
		}
	//   48  100:return          
	}

	private final void F()
	{
		if(A != -1 || B != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field int A>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
	//*   4    8:aload_0         
	//*   5    9:getfield        #138 <Field int B>
	//*   6   12:iconst_m1       
	//*   7   13:icmpeq          39
			f.a(w, x, y, z);
	//    8   16:aload_0         
	//    9   17:getfield        #91  <Field bol f>
	//   10   20:aload_0         
	//   11   21:getfield        #123 <Field int w>
	//   12   24:aload_0         
	//   13   25:getfield        #125 <Field int x>
	//   14   28:aload_0         
	//   15   29:getfield        #144 <Field int y>
	//   16   32:aload_0         
	//   17   33:getfield        #128 <Field float z>
	//   18   36:invokevirtual   #147 <Method void bol.a(int, int, int, float)>
	//   19   39:return          
	}

	private final void G()
	{
		if(s > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field int s>
	//*   2    4:ifle            40
		{
			long l1 = SystemClock.elapsedRealtime();
	//    3    7:invokestatic    #155 <Method long SystemClock.elapsedRealtime()>
	//    4   10:lstore_1        
			long l2 = r;
	//    5   11:aload_0         
	//    6   12:getfield        #157 <Field long r>
	//    7   15:lstore_3        
			f.a(s, l1 - l2);
	//    8   16:aload_0         
	//    9   17:getfield        #91  <Field bol f>
	//   10   20:aload_0         
	//   11   21:getfield        #149 <Field int s>
	//   12   24:lload_1         
	//   13   25:lload_3         
	//   14   26:lsub            
	//   15   27:invokevirtual   #160 <Method void bol.a(int, long)>
			s = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #149 <Field int s>
			r = l1;
	//   19   35:aload_0         
	//   20   36:lload_1         
	//   21   37:putfield        #157 <Field long r>
		}
	//   22   40:return          
	}

	private static int a(String s1, int i1, int j1)
	{
		if(i1 != -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          279
		{
			int k1;
			byte byte0;
label0:
			{
				if(j1 == -1)
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          12
					return -1;
	//    6   10:iconst_m1       
	//    7   11:ireturn         
				k1 = s1.hashCode();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #165 <Method int String.hashCode()>
	//   10   16:istore_3        
				byte0 = 4;
	//   11   17:iconst_4        
	//   12   18:istore          4
				switch(k1)
	//*  13   20:iload_3         
				{
				default:
					break;

	//*  14   21:lookupswitch    6: default 80
	//	               -1664118616: 153
	//	               -1662541442: 139
	//	               1187890754: 125
	//	               1331836730: 111
	//	               1599127256: 97
	//	               1599127257: 83
	//*  15   80:goto            167
				case 1599127257: 
					if(s1.equals("video/x-vnd.on2.vp9"))
	//*  16   83:aload_0         
	//*  17   84:ldc1            #167 <String "video/x-vnd.on2.vp9">
	//*  18   86:invokevirtual   #107 <Method boolean String.equals(Object)>
	//*  19   89:ifeq            167
					{
						k1 = 5;
	//   20   92:iconst_5        
	//   21   93:istore_3        
						break label0;
	//   22   94:goto            169
					}
					break;

				case 1599127256: 
					if(!s1.equals("video/x-vnd.on2.vp8"))
						break;
	//   23   97:aload_0         
	//   24   98:ldc1            #169 <String "video/x-vnd.on2.vp8">
	//   25  100:invokevirtual   #107 <Method boolean String.equals(Object)>
	//   26  103:ifeq            167
					k1 = 3;
	//   27  106:iconst_3        
	//   28  107:istore_3        
					break label0;
	//   29  108:goto            169

				case 1331836730: 
					if(!s1.equals("video/avc"))
						break;
	//   30  111:aload_0         
	//   31  112:ldc1            #171 <String "video/avc">
	//   32  114:invokevirtual   #107 <Method boolean String.equals(Object)>
	//   33  117:ifeq            167
					k1 = 2;
	//   34  120:iconst_2        
	//   35  121:istore_3        
					break label0;
	//   36  122:goto            169

				case 1187890754: 
					if(!s1.equals("video/mp4v-es"))
						break;
	//   37  125:aload_0         
	//   38  126:ldc1            #173 <String "video/mp4v-es">
	//   39  128:invokevirtual   #107 <Method boolean String.equals(Object)>
	//   40  131:ifeq            167
					k1 = 1;
	//   41  134:iconst_1        
	//   42  135:istore_3        
					break label0;
	//   43  136:goto            169

				case -1662541442: 
					if(!s1.equals("video/hevc"))
						break;
	//   44  139:aload_0         
	//   45  140:ldc1            #175 <String "video/hevc">
	//   46  142:invokevirtual   #107 <Method boolean String.equals(Object)>
	//   47  145:ifeq            167
					k1 = 4;
	//   48  148:iconst_4        
	//   49  149:istore_3        
					break label0;
	//   50  150:goto            169

				case -1664118616: 
					if(!s1.equals("video/3gpp"))
						break;
	//   51  153:aload_0         
	//   52  154:ldc1            #177 <String "video/3gpp">
	//   53  156:invokevirtual   #107 <Method boolean String.equals(Object)>
	//   54  159:ifeq            167
					k1 = 0;
	//   55  162:iconst_0        
	//   56  163:istore_3        
					break label0;
	//   57  164:goto            169
				}
				k1 = -1;
	//   58  167:iconst_m1       
	//   59  168:istore_3        
			}
			switch(k1)
	//*  60  169:iload_3         
			{
	//*  61  170:tableswitch     0 5: default 208
	//	               0 265
	//	               1 265
	//	               2 229
	//	               3 220
	//	               4 210
	//	               5 210
			default:
				return -1;
	//   62  208:iconst_m1       
	//   63  209:ireturn         

			case 4: // '\004'
			case 5: // '\005'
				j1 = i1 * j1;
	//   64  210:iload_1         
	//   65  211:iload_2         
	//   66  212:imul            
	//   67  213:istore_2        
				i1 = ((int) (byte0));
	//   68  214:iload           4
	//   69  216:istore_1        
				break;
	//   70  217:goto            271

			case 3: // '\003'
				j1 = i1 * j1;
	//   71  220:iload_1         
	//   72  221:iload_2         
	//   73  222:imul            
	//   74  223:istore_2        
				i1 = 2;
	//   75  224:iconst_2        
	//   76  225:istore_1        
				break;
	//   77  226:goto            271

			case 2: // '\002'
				if("BRAVIA 4K 2015".equals(((Object) (bnw.d))))
	//*  78  229:ldc1            #179 <String "BRAVIA 4K 2015">
	//*  79  231:getstatic       #181 <Field String bnw.d>
	//*  80  234:invokevirtual   #107 <Method boolean String.equals(Object)>
	//*  81  237:ifeq            242
					return -1;
	//   82  240:iconst_m1       
	//   83  241:ireturn         
				j1 = bnw.a(i1, 16) * bnw.a(j1, 16) << 4 << 4;
	//   84  242:iload_1         
	//   85  243:bipush          16
	//   86  245:invokestatic    #184 <Method int bnw.a(int, int)>
	//   87  248:iload_2         
	//   88  249:bipush          16
	//   89  251:invokestatic    #184 <Method int bnw.a(int, int)>
	//   90  254:imul            
	//   91  255:iconst_4        
	//   92  256:ishl            
	//   93  257:iconst_4        
	//   94  258:ishl            
	//   95  259:istore_2        
				i1 = 2;
	//   96  260:iconst_2        
	//   97  261:istore_1        
				break;

	//*  98  262:goto            271
			case 0: // '\0'
			case 1: // '\001'
				j1 = i1 * j1;
	//   99  265:iload_1         
	//  100  266:iload_2         
	//  101  267:imul            
	//  102  268:istore_2        
				i1 = 2;
	//  103  269:iconst_2        
	//  104  270:istore_1        
				break;
			}
			return (j1 * 3) / (i1 * 2);
	//  105  271:iload_2         
	//  106  272:iconst_3        
	//  107  273:imul            
	//  108  274:iload_1         
	//  109  275:iconst_2        
	//  110  276:imul            
	//  111  277:idiv            
	//  112  278:ireturn         
		} else
		{
			return -1;
	//  113  279:iconst_m1       
	//  114  280:ireturn         
		}
	}

	private final void a(MediaCodec mediacodec, int i1, long l1)
	{
		bnu.a("skipVideoBuffer");
	//    0    0:ldc1            #187 <String "skipVideoBuffer">
	//    1    2:invokestatic    #192 <Method void bnu.a(String)>
		mediacodec.releaseOutputBuffer(i1, false);
	//    2    5:aload_1         
	//    3    6:iload_2         
	//    4    7:iconst_0        
	//    5    8:invokevirtual   #198 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		bnu.a();
	//    6   11:invokestatic    #200 <Method void bnu.a()>
		mediacodec = ((MediaCodec) (a));
	//    7   14:aload_0         
	//    8   15:getfield        #203 <Field bfb a>
	//    9   18:astore_1        
		mediacodec.e = ((bfb) (mediacodec)).e + 1;
	//   10   19:aload_1         
	//   11   20:aload_1         
	//   12   21:getfield        #207 <Field int bfb.e>
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:putfield        #207 <Field int bfb.e>
	//   16   29:return          
	}

	private final void a(MediaCodec mediacodec, int i1, long l1, long l2)
	{
		E();
	//    0    0:aload_0         
	//    1    1:invokespecial   #211 <Method void E()>
		bnu.a("releaseOutputBuffer");
	//    2    4:ldc1            #212 <String "releaseOutputBuffer">
	//    3    6:invokestatic    #192 <Method void bnu.a(String)>
		mediacodec.releaseOutputBuffer(i1, l2);
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:lload           5
	//    7   13:invokevirtual   #214 <Method void MediaCodec.releaseOutputBuffer(int, long)>
		bnu.a();
	//    8   16:invokestatic    #200 <Method void bnu.a()>
		mediacodec = ((MediaCodec) (a));
	//    9   19:aload_0         
	//   10   20:getfield        #203 <Field bfb a>
	//   11   23:astore_1        
		mediacodec.d = ((bfb) (mediacodec)).d + 1;
	//   12   24:aload_1         
	//   13   25:aload_1         
	//   14   26:getfield        #216 <Field int bfb.d>
	//   15   29:iconst_1        
	//   16   30:iadd            
	//   17   31:putfield        #216 <Field int bfb.d>
		t = 0;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #218 <Field int t>
		v();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #220 <Method void v()>
	//   23   43:return          
	}

	private static boolean a(boolean flag, zzfs zzfs1, zzfs zzfs2)
	{
		return zzfs1.e.equals(((Object) (zzfs2.e))) && d(zzfs1) == d(zzfs2) && (flag || zzfs1.i == zzfs2.i && zzfs1.j == zzfs2.j);
	//    0    0:aload_1         
	//    1    1:getfield        #226 <Field String zzfs.e>
	//    2    4:aload_2         
	//    3    5:getfield        #226 <Field String zzfs.e>
	//    4    8:invokevirtual   #107 <Method boolean String.equals(Object)>
	//    5   11:ifeq            53
	//    6   14:aload_1         
	//    7   15:invokestatic    #229 <Method int d(zzfs)>
	//    8   18:aload_2         
	//    9   19:invokestatic    #229 <Method int d(zzfs)>
	//   10   22:icmpne          53
	//   11   25:iload_0         
	//   12   26:ifne            51
	//   13   29:aload_1         
	//   14   30:getfield        #231 <Field int zzfs.i>
	//   15   33:aload_2         
	//   16   34:getfield        #231 <Field int zzfs.i>
	//   17   37:icmpne          53
	//   18   40:aload_1         
	//   19   41:getfield        #233 <Field int zzfs.j>
	//   20   44:aload_2         
	//   21   45:getfield        #233 <Field int zzfs.j>
	//   22   48:icmpne          53
	//   23   51:iconst_1        
	//   24   52:ireturn         
	//   25   53:iconst_0        
	//   26   54:ireturn         
	}

	private final void b(MediaCodec mediacodec, int i1, long l1)
	{
		E();
	//    0    0:aload_0         
	//    1    1:invokespecial   #211 <Method void E()>
		bnu.a("releaseOutputBuffer");
	//    2    4:ldc1            #212 <String "releaseOutputBuffer">
	//    3    6:invokestatic    #192 <Method void bnu.a(String)>
		mediacodec.releaseOutputBuffer(i1, true);
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #198 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
		bnu.a();
	//    8   15:invokestatic    #200 <Method void bnu.a()>
		mediacodec = ((MediaCodec) (a));
	//    9   18:aload_0         
	//   10   19:getfield        #203 <Field bfb a>
	//   11   22:astore_1        
		mediacodec.d = ((bfb) (mediacodec)).d + 1;
	//   12   23:aload_1         
	//   13   24:aload_1         
	//   14   25:getfield        #216 <Field int bfb.d>
	//   15   28:iconst_1        
	//   16   29:iadd            
	//   17   30:putfield        #216 <Field int bfb.d>
		t = 0;
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:putfield        #218 <Field int t>
		v();
	//   21   38:aload_0         
	//   22   39:invokevirtual   #220 <Method void v()>
	//   23   42:return          
	}

	private final boolean b(boolean flag)
	{
		return bnw.a >= 23 && !E && (!flag || zzqk.a(d));
	//    0    0:getstatic       #96  <Field int bnw.a>
	//    1    3:bipush          23
	//    2    5:icmplt          31
	//    3    8:aload_0         
	//    4    9:getfield        #236 <Field boolean E>
	//    5   12:ifne            31
	//    6   15:iload_1         
	//    7   16:ifeq            29
	//    8   19:aload_0         
	//    9   20:getfield        #77  <Field Context d>
	//   10   23:invokestatic    #241 <Method boolean zzqk.a(Context)>
	//   11   26:ifeq            31
	//   12   29:iconst_1        
	//   13   30:ireturn         
	//   14   31:iconst_0        
	//   15   32:ireturn         
	}

	private static int c(zzfs zzfs1)
	{
		if(zzfs1.f != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #243 <Field int zzfs.f>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return zzfs1.f;
	//    4    8:aload_0         
	//    5    9:getfield        #243 <Field int zzfs.f>
	//    6   12:ireturn         
		else
			return a(zzfs1.e, zzfs1.i, zzfs1.j);
	//    7   13:aload_0         
	//    8   14:getfield        #226 <Field String zzfs.e>
	//    9   17:aload_0         
	//   10   18:getfield        #231 <Field int zzfs.i>
	//   11   21:aload_0         
	//   12   22:getfield        #233 <Field int zzfs.j>
	//   13   25:invokestatic    #245 <Method int a(String, int, int)>
	//   14   28:ireturn         
	}

	private static boolean c(long l1)
	{
		return l1 < -30000L;
	//    0    0:lload_0         
	//    1    1:ldc2w           #247 <Long -30000L>
	//    2    4:lcmp            
	//    3    5:ifge            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private static int d(zzfs zzfs1)
	{
		if(zzfs1.l == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #250 <Field int zzfs.l>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		else
			return zzfs1.l;
	//    6   10:aload_0         
	//    7   11:getfield        #250 <Field int zzfs.l>
	//    8   14:ireturn         
	}

	private final void w()
	{
		long l1;
		if(g > 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field long g>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            21
			l1 = SystemClock.elapsedRealtime() + g;
	//    5    9:invokestatic    #155 <Method long SystemClock.elapsedRealtime()>
	//    6   12:aload_0         
	//    7   13:getfield        #67  <Field long g>
	//    8   16:ladd            
	//    9   17:lstore_1        
		else
	//*  10   18:goto            25
			l1 = 0x1L;
	//   11   21:ldc2w           #116 <Long 0x1L>
	//   12   24:lstore_1        
		q = l1;
	//   13   25:aload_0         
	//   14   26:lload_1         
	//   15   27:putfield        #121 <Field long q>
	//   16   30:return          
	}

	private final void x()
	{
		p = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #252 <Field boolean p>
		if(bnw.a >= 23 && E)
	//*   3    5:getstatic       #96  <Field int bnw.a>
	//*   4    8:bipush          23
	//*   5   10:icmplt          43
	//*   6   13:aload_0         
	//*   7   14:getfield        #236 <Field boolean E>
	//*   8   17:ifeq            43
		{
			MediaCodec mediacodec = ((bhn)this).A();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #255 <Method MediaCodec bhn.A()>
	//   11   24:astore_1        
			if(mediacodec != null)
	//*  12   25:aload_1         
	//*  13   26:ifnull          43
				b = new boh(this, mediacodec, ((bof) (null)));
	//   14   29:aload_0         
	//   15   30:new             #257 <Class boh>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:aconst_null     
	//   20   37:invokespecial   #260 <Method void boh(boe, MediaCodec, bof)>
	//   21   40:putfield        #262 <Field boh b>
		}
	//   22   43:return          
	}

	protected final void C()
	{
		super.C();
	//    0    0:aload_0         
	//    1    1:invokespecial   #264 <Method void bhn.C()>
		Surface surface = n;
	//    2    4:aload_0         
	//    3    5:getfield        #266 <Field Surface n>
	//    4    8:astore_1        
		if(surface != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          39
		{
			if(m == surface)
	//*   7   13:aload_0         
	//*   8   14:getfield        #268 <Field Surface m>
	//*   9   17:aload_1         
	//*  10   18:if_acmpne       26
				m = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #268 <Field Surface m>
			n.release();
	//   14   26:aload_0         
	//   15   27:getfield        #266 <Field Surface n>
	//   16   30:invokevirtual   #273 <Method void Surface.release()>
			n = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #266 <Field Surface n>
			return;
	//   20   38:return          
		} else
		{
			return;
	//   21   39:return          
		}
		Exception exception;
		exception;
	//   22   40:astore_1        
		Surface surface1 = n;
	//   23   41:aload_0         
	//   24   42:getfield        #266 <Field Surface n>
	//   25   45:astore_2        
		if(surface1 != null)
	//*  26   46:aload_2         
	//*  27   47:ifnull          75
		{
			if(m == surface1)
	//*  28   50:aload_0         
	//*  29   51:getfield        #268 <Field Surface m>
	//*  30   54:aload_2         
	//*  31   55:if_acmpne       63
				m = null;
	//   32   58:aload_0         
	//   33   59:aconst_null     
	//   34   60:putfield        #268 <Field Surface m>
			n.release();
	//   35   63:aload_0         
	//   36   64:getfield        #266 <Field Surface n>
	//   37   67:invokevirtual   #273 <Method void Surface.release()>
			n = null;
	//   38   70:aload_0         
	//   39   71:aconst_null     
	//   40   72:putfield        #266 <Field Surface n>
		}
		throw exception;
	//   41   75:aload_1         
	//   42   76:athrow          
	}

	protected final int a(bhq bhq1, zzfs zzfs1)
	{
		String s1 = zzfs1.e;
	//    0    0:aload_2         
	//    1    1:getfield        #226 <Field String zzfs.e>
	//    2    4:astore          8
		boolean flag = bnk.b(s1);
	//    3    6:aload           8
	//    4    8:invokestatic    #279 <Method boolean bnk.b(String)>
	//    5   11:istore          6
		byte byte1 = 0;
	//    6   13:iconst_0        
	//    7   14:istore          4
		if(!flag)
	//*   8   16:iload           6
	//*   9   18:ifne            23
			return 0;
	//   10   21:iconst_0        
	//   11   22:ireturn         
		zzhp zzhp1 = zzfs1.h;
	//   12   23:aload_2         
	//   13   24:getfield        #282 <Field zzhp zzfs.h>
	//   14   27:astore          9
		boolean flag1;
		if(zzhp1 != null)
	//*  15   29:aload           9
	//*  16   31:ifnull          73
		{
			int i1 = 0;
	//   17   34:iconst_0        
	//   18   35:istore_3        
			flag = false;
	//   19   36:iconst_0        
	//   20   37:istore          6
			do
			{
				flag1 = flag;
	//   21   39:iload           6
	//   22   41:istore          7
				if(i1 >= zzhp1.a)
					break;
	//   23   43:iload_3         
	//   24   44:aload           9
	//   25   46:getfield        #285 <Field int zzhp.a>
	//   26   49:icmpge          76
				flag |= zzhp1.a(i1).a;
	//   27   52:iload           6
	//   28   54:aload           9
	//   29   56:iload_3         
	//   30   57:invokevirtual   #288 <Method zzhp$zza zzhp.a(int)>
	//   31   60:getfield        #292 <Field boolean zzhp$zza.a>
	//   32   63:ior             
	//   33   64:istore          6
				i1++;
	//   34   66:iload_3         
	//   35   67:iconst_1        
	//   36   68:iadd            
	//   37   69:istore_3        
			} while(true);
	//   38   70:goto            39
		} else
		{
			flag1 = false;
	//   39   73:iconst_0        
	//   40   74:istore          7
		}
		bhq1 = ((bhq) (bhq1.a(s1, flag1)));
	//   41   76:aload_1         
	//   42   77:aload           8
	//   43   79:iload           7
	//   44   81:invokeinterface #297 <Method bhm bhq.a(String, boolean)>
	//   45   86:astore_1        
		if(bhq1 == null)
	//*  46   87:aload_1         
	//*  47   88:ifnonnull       93
			return 1;
	//   48   91:iconst_1        
	//   49   92:ireturn         
		flag1 = ((bhm) (bhq1)).b(zzfs1.c);
	//   50   93:aload_1         
	//   51   94:aload_2         
	//   52   95:getfield        #298 <Field String zzfs.c>
	//   53   98:invokevirtual   #301 <Method boolean bhm.b(String)>
	//   54  101:istore          7
		flag = flag1;
	//   55  103:iload           7
	//   56  105:istore          6
		if(flag1)
	//*  57  107:iload           7
	//*  58  109:ifeq            305
		{
			flag = flag1;
	//   59  112:iload           7
	//   60  114:istore          6
			if(zzfs1.i > 0)
	//*  61  116:aload_2         
	//*  62  117:getfield        #231 <Field int zzfs.i>
	//*  63  120:ifle            305
			{
				flag = flag1;
	//   64  123:iload           7
	//   65  125:istore          6
				if(zzfs1.j > 0)
	//*  66  127:aload_2         
	//*  67  128:getfield        #233 <Field int zzfs.j>
	//*  68  131:ifle            305
					if(bnw.a >= 21)
	//*  69  134:getstatic       #96  <Field int bnw.a>
	//*  70  137:bipush          21
	//*  71  139:icmplt          164
					{
						flag = ((bhm) (bhq1)).a(zzfs1.i, zzfs1.j, zzfs1.k);
	//   72  142:aload_1         
	//   73  143:aload_2         
	//   74  144:getfield        #231 <Field int zzfs.i>
	//   75  147:aload_2         
	//   76  148:getfield        #233 <Field int zzfs.j>
	//   77  151:aload_2         
	//   78  152:getfield        #303 <Field float zzfs.k>
	//   79  155:f2d             
	//   80  156:invokevirtual   #306 <Method boolean bhm.a(int, int, double)>
	//   81  159:istore          6
					} else
	//*  82  161:goto            305
					{
						boolean flag2;
						if(zzfs1.i * zzfs1.j <= bhs.b())
	//*  83  164:aload_2         
	//*  84  165:getfield        #231 <Field int zzfs.i>
	//*  85  168:aload_2         
	//*  86  169:getfield        #233 <Field int zzfs.j>
	//*  87  172:imul            
	//*  88  173:invokestatic    #310 <Method int bhs.b()>
	//*  89  176:icmpgt          185
							flag2 = true;
	//   90  179:iconst_1        
	//   91  180:istore          7
						else
	//*  92  182:goto            188
							flag2 = false;
	//   93  185:iconst_0        
	//   94  186:istore          7
						flag = flag2;
	//   95  188:iload           7
	//   96  190:istore          6
						if(!flag2)
	//*  97  192:iload           7
	//*  98  194:ifne            305
						{
							int j1 = zzfs1.i;
	//   99  197:aload_2         
	//  100  198:getfield        #231 <Field int zzfs.i>
	//  101  201:istore_3        
							int k1 = zzfs1.j;
	//  102  202:aload_2         
	//  103  203:getfield        #233 <Field int zzfs.j>
	//  104  206:istore          5
							zzfs1 = ((zzfs) (bnw.e));
	//  105  208:getstatic       #311 <Field String bnw.e>
	//  106  211:astore_2        
							StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (zzfs1))).length() + 56);
	//  107  212:new             #313 <Class StringBuilder>
	//  108  215:dup             
	//  109  216:aload_2         
	//  110  217:invokestatic    #317 <Method String String.valueOf(Object)>
	//  111  220:invokevirtual   #320 <Method int String.length()>
	//  112  223:bipush          56
	//  113  225:iadd            
	//  114  226:invokespecial   #323 <Method void StringBuilder(int)>
	//  115  229:astore          8
							stringbuilder.append("FalseCheck [legacyFrameSize, ");
	//  116  231:aload           8
	//  117  233:ldc2            #325 <String "FalseCheck [legacyFrameSize, ">
	//  118  236:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//  119  239:pop             
							stringbuilder.append(j1);
	//  120  240:aload           8
	//  121  242:iload_3         
	//  122  243:invokevirtual   #332 <Method StringBuilder StringBuilder.append(int)>
	//  123  246:pop             
							stringbuilder.append("x");
	//  124  247:aload           8
	//  125  249:ldc2            #333 <String "x">
	//  126  252:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//  127  255:pop             
							stringbuilder.append(k1);
	//  128  256:aload           8
	//  129  258:iload           5
	//  130  260:invokevirtual   #332 <Method StringBuilder StringBuilder.append(int)>
	//  131  263:pop             
							stringbuilder.append("] [");
	//  132  264:aload           8
	//  133  266:ldc2            #335 <String "] [">
	//  134  269:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//  135  272:pop             
							stringbuilder.append(((String) (zzfs1)));
	//  136  273:aload           8
	//  137  275:aload_2         
	//  138  276:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//  139  279:pop             
							stringbuilder.append("]");
	//  140  280:aload           8
	//  141  282:ldc2            #337 <String "]">
	//  142  285:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//  143  288:pop             
							Log.d("MediaCodecVideoRenderer", stringbuilder.toString());
	//  144  289:ldc2            #339 <String "MediaCodecVideoRenderer">
	//  145  292:aload           8
	//  146  294:invokevirtual   #343 <Method String StringBuilder.toString()>
	//  147  297:invokestatic    #348 <Method int Log.d(String, String)>
	//  148  300:pop             
							flag = flag2;
	//  149  301:iload           7
	//  150  303:istore          6
						}
					}
			}
		}
		byte byte0;
		if(((bhm) (bhq1)).b)
	//* 151  305:aload_1         
	//* 152  306:getfield        #350 <Field boolean bhm.b>
	//* 153  309:ifeq            318
			byte0 = 8;
	//  154  312:bipush          8
	//  155  314:istore_3        
		else
	//* 156  315:goto            320
			byte0 = 4;
	//  157  318:iconst_4        
	//  158  319:istore_3        
		if(((bhm) (bhq1)).c)
	//* 159  320:aload_1         
	//* 160  321:getfield        #352 <Field boolean bhm.c>
	//* 161  324:ifeq            331
			byte1 = 16;
	//  162  327:bipush          16
	//  163  329:istore          4
		byte byte2;
		if(flag)
	//* 164  331:iload           6
	//* 165  333:ifeq            342
			byte2 = 3;
	//  166  336:iconst_3        
	//  167  337:istore          5
		else
	//* 168  339:goto            345
			byte2 = 2;
	//  169  342:iconst_2        
	//  170  343:istore          5
		return byte2 | (byte0 | byte1);
	//  171  345:iload           5
	//  172  347:iload_3         
	//  173  348:iload           4
	//  174  350:ior             
	//  175  351:ior             
	//  176  352:ireturn         
	}

	public final void a(int i1, Object obj)
	{
		if(i1 == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          215
		{
			Surface surface = (Surface)obj;
	//    3    5:aload_2         
	//    4    6:checkcast       #270 <Class Surface>
	//    5    9:astore_3        
			obj = ((Object) (surface));
	//    6   10:aload_3         
	//    7   11:astore_2        
			if(surface == null)
	//*   8   12:aload_3         
	//*   9   13:ifnonnull       76
			{
				obj = ((Object) (n));
	//   10   16:aload_0         
	//   11   17:getfield        #266 <Field Surface n>
	//   12   20:astore_2        
				if(obj == null)
	//*  13   21:aload_2         
	//*  14   22:ifnull          28
	//*  15   25:goto            76
				{
					bhm bhm1 = ((bhn)this).B();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #356 <Method bhm bhn.B()>
	//   18   32:astore          4
					obj = ((Object) (surface));
	//   19   34:aload_3         
	//   20   35:astore_2        
					if(bhm1 != null)
	//*  21   36:aload           4
	//*  22   38:ifnull          76
					{
						obj = ((Object) (surface));
	//   23   41:aload_3         
	//   24   42:astore_2        
						if(b(bhm1.d))
	//*  25   43:aload_0         
	//*  26   44:aload           4
	//*  27   46:getfield        #358 <Field boolean bhm.d>
	//*  28   49:invokespecial   #360 <Method boolean b(boolean)>
	//*  29   52:ifeq            76
						{
							n = ((Surface) (zzqk.a(d, bhm1.d)));
	//   30   55:aload_0         
	//   31   56:aload_0         
	//   32   57:getfield        #77  <Field Context d>
	//   33   60:aload           4
	//   34   62:getfield        #358 <Field boolean bhm.d>
	//   35   65:invokestatic    #363 <Method zzqk zzqk.a(Context, boolean)>
	//   36   68:putfield        #266 <Field Surface n>
							obj = ((Object) (n));
	//   37   71:aload_0         
	//   38   72:getfield        #266 <Field Surface n>
	//   39   75:astore_2        
						}
					}
				}
			}
			if(m != obj)
	//*  40   76:aload_0         
	//*  41   77:getfield        #268 <Field Surface m>
	//*  42   80:aload_2         
	//*  43   81:if_acmpeq       180
			{
				m = ((Surface) (obj));
	//   44   84:aload_0         
	//   45   85:aload_2         
	//   46   86:putfield        #268 <Field Surface m>
				i1 = ((bcq)this).d();
	//   47   89:aload_0         
	//   48   90:invokevirtual   #367 <Method int bcq.d()>
	//   49   93:istore_1        
				if(i1 == 1 || i1 == 2)
	//*  50   94:iload_1         
	//*  51   95:iconst_1        
	//*  52   96:icmpeq          104
	//*  53   99:iload_1         
	//*  54  100:iconst_2        
	//*  55  101:icmpne          141
				{
					MediaCodec mediacodec = ((bhn)this).A();
	//   56  104:aload_0         
	//   57  105:invokevirtual   #255 <Method MediaCodec bhn.A()>
	//   58  108:astore_3        
					if(bnw.a >= 23 && mediacodec != null && obj != null)
	//*  59  109:getstatic       #96  <Field int bnw.a>
	//*  60  112:bipush          23
	//*  61  114:icmplt          133
	//*  62  117:aload_3         
	//*  63  118:ifnull          133
	//*  64  121:aload_2         
	//*  65  122:ifnull          133
					{
						mediacodec.setOutputSurface(((Surface) (obj)));
	//   66  125:aload_3         
	//   67  126:aload_2         
	//   68  127:invokevirtual   #371 <Method void MediaCodec.setOutputSurface(Surface)>
					} else
	//*  69  130:goto            141
					{
						((bhn)this).C();
	//   70  133:aload_0         
	//   71  134:invokevirtual   #264 <Method void bhn.C()>
						((bhn)this).z();
	//   72  137:aload_0         
	//   73  138:invokevirtual   #373 <Method void bhn.z()>
					}
				}
				if(obj != null && obj != n)
	//*  74  141:aload_2         
	//*  75  142:ifnull          171
	//*  76  145:aload_2         
	//*  77  146:aload_0         
	//*  78  147:getfield        #266 <Field Surface n>
	//*  79  150:if_acmpeq       171
				{
					F();
	//   80  153:aload_0         
	//   81  154:invokespecial   #375 <Method void F()>
					x();
	//   82  157:aload_0         
	//   83  158:invokespecial   #377 <Method void x()>
					if(i1 == 2)
	//*  84  161:iload_1         
	//*  85  162:iconst_2        
	//*  86  163:icmpne          179
					{
						w();
	//   87  166:aload_0         
	//   88  167:invokespecial   #379 <Method void w()>
						return;
	//   89  170:return          
					}
				} else
				{
					D();
	//   90  171:aload_0         
	//   91  172:invokespecial   #134 <Method void D()>
					x();
	//   92  175:aload_0         
	//   93  176:invokespecial   #377 <Method void x()>
				}
				return;
	//   94  179:return          
			}
			if(obj != null && obj != n)
	//*  95  180:aload_2         
	//*  96  181:ifnull          214
	//*  97  184:aload_2         
	//*  98  185:aload_0         
	//*  99  186:getfield        #266 <Field Surface n>
	//* 100  189:if_acmpeq       214
			{
				F();
	//  101  192:aload_0         
	//  102  193:invokespecial   #375 <Method void F()>
				if(p)
	//* 103  196:aload_0         
	//* 104  197:getfield        #252 <Field boolean p>
	//* 105  200:ifeq            214
					f.a(m);
	//  106  203:aload_0         
	//  107  204:getfield        #91  <Field bol f>
	//  108  207:aload_0         
	//  109  208:getfield        #268 <Field Surface m>
	//  110  211:invokevirtual   #381 <Method void bol.a(Surface)>
			}
			return;
	//  111  214:return          
		}
		if(i1 == 4)
	//* 112  215:iload_1         
	//* 113  216:iconst_4        
	//* 114  217:icmpne          249
		{
			o = ((Integer)obj).intValue();
	//  115  220:aload_0         
	//  116  221:aload_2         
	//  117  222:checkcast       #383 <Class Integer>
	//  118  225:invokevirtual   #386 <Method int Integer.intValue()>
	//  119  228:putfield        #132 <Field int o>
			obj = ((Object) (((bhn)this).A()));
	//  120  231:aload_0         
	//  121  232:invokevirtual   #255 <Method MediaCodec bhn.A()>
	//  122  235:astore_2        
			if(obj != null)
	//* 123  236:aload_2         
	//* 124  237:ifnull          248
				((MediaCodec) (obj)).setVideoScalingMode(o);
	//  125  240:aload_2         
	//  126  241:aload_0         
	//  127  242:getfield        #132 <Field int o>
	//  128  245:invokevirtual   #389 <Method void MediaCodec.setVideoScalingMode(int)>
			return;
	//  129  248:return          
		} else
		{
			super.a(i1, obj);
	//  130  249:aload_0         
	//  131  250:iload_1         
	//  132  251:aload_2         
	//  133  252:invokespecial   #391 <Method void bhn.a(int, Object)>
			return;
	//  134  255:return          
		}
	}

	protected final void a(long l1, boolean flag)
	{
		super.a(l1, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #394 <Method void bhn.a(long, boolean)>
		x();
	//    4    6:aload_0         
	//    5    7:invokespecial   #377 <Method void x()>
		t = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #218 <Field int t>
		int i1 = H;
	//    9   15:aload_0         
	//   10   16:getfield        #396 <Field int H>
	//   11   19:istore          4
		if(i1 != 0)
	//*  12   21:iload           4
	//*  13   23:ifeq            44
		{
			G = j[i1 - 1];
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #115 <Field long[] j>
	//   17   31:iload           4
	//   18   33:iconst_1        
	//   19   34:isub            
	//   20   35:laload          
	//   21   36:putfield        #119 <Field long G>
			H = 0;
	//   22   39:aload_0         
	//   23   40:iconst_0        
	//   24   41:putfield        #396 <Field int H>
		}
		if(flag)
	//*  25   44:iload_3         
	//*  26   45:ifeq            53
		{
			w();
	//   27   48:aload_0         
	//   28   49:invokespecial   #379 <Method void w()>
			return;
	//   29   52:return          
		} else
		{
			q = 0x1L;
	//   30   53:aload_0         
	//   31   54:ldc2w           #116 <Long 0x1L>
	//   32   57:putfield        #121 <Field long q>
			return;
	//   33   60:return          
		}
	}

	protected final void a(MediaCodec mediacodec, MediaFormat mediaformat)
	{
		boolean flag;
		if(mediaformat.containsKey("crop-right") && mediaformat.containsKey("crop-left") && mediaformat.containsKey("crop-bottom") && mediaformat.containsKey("crop-top"))
	//*   0    0:aload_2         
	//*   1    1:ldc2            #399 <String "crop-right">
	//*   2    4:invokevirtual   #404 <Method boolean MediaFormat.containsKey(String)>
	//*   3    7:ifeq            45
	//*   4   10:aload_2         
	//*   5   11:ldc2            #406 <String "crop-left">
	//*   6   14:invokevirtual   #404 <Method boolean MediaFormat.containsKey(String)>
	//*   7   17:ifeq            45
	//*   8   20:aload_2         
	//*   9   21:ldc2            #408 <String "crop-bottom">
	//*  10   24:invokevirtual   #404 <Method boolean MediaFormat.containsKey(String)>
	//*  11   27:ifeq            45
	//*  12   30:aload_2         
	//*  13   31:ldc2            #410 <String "crop-top">
	//*  14   34:invokevirtual   #404 <Method boolean MediaFormat.containsKey(String)>
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
	//   24   52:ldc2            #399 <String "crop-right">
	//   25   55:invokevirtual   #414 <Method int MediaFormat.getInteger(String)>
	//   26   58:aload_2         
	//   27   59:ldc2            #406 <String "crop-left">
	//   28   62:invokevirtual   #414 <Method int MediaFormat.getInteger(String)>
	//   29   65:isub            
	//   30   66:iconst_1        
	//   31   67:iadd            
	//   32   68:istore          4
		else
	//*  33   70:goto            82
			l1 = mediaformat.getInteger("width");
	//   34   73:aload_2         
	//   35   74:ldc2            #416 <String "width">
	//   36   77:invokevirtual   #414 <Method int MediaFormat.getInteger(String)>
	//   37   80:istore          4
		w = l1;
	//   38   82:aload_0         
	//   39   83:iload           4
	//   40   85:putfield        #123 <Field int w>
		int i1;
		if(flag)
	//*  41   88:iload_3         
	//*  42   89:ifeq            113
			i1 = (mediaformat.getInteger("crop-bottom") - mediaformat.getInteger("crop-top")) + 1;
	//   43   92:aload_2         
	//   44   93:ldc2            #408 <String "crop-bottom">
	//   45   96:invokevirtual   #414 <Method int MediaFormat.getInteger(String)>
	//   46   99:aload_2         
	//   47  100:ldc2            #410 <String "crop-top">
	//   48  103:invokevirtual   #414 <Method int MediaFormat.getInteger(String)>
	//   49  106:isub            
	//   50  107:iconst_1        
	//   51  108:iadd            
	//   52  109:istore_3        
		else
	//*  53  110:goto            121
			i1 = mediaformat.getInteger("height");
	//   54  113:aload_2         
	//   55  114:ldc2            #418 <String "height">
	//   56  117:invokevirtual   #414 <Method int MediaFormat.getInteger(String)>
	//   57  120:istore_3        
		x = i1;
	//   58  121:aload_0         
	//   59  122:iload_3         
	//   60  123:putfield        #125 <Field int x>
		z = v;
	//   61  126:aload_0         
	//   62  127:aload_0         
	//   63  128:getfield        #130 <Field float v>
	//   64  131:putfield        #128 <Field float z>
		if(bnw.a >= 21)
	//*  65  134:getstatic       #96  <Field int bnw.a>
	//*  66  137:bipush          21
	//*  67  139:icmplt          191
		{
			int j1 = u;
	//   68  142:aload_0         
	//   69  143:getfield        #420 <Field int u>
	//   70  146:istore_3        
			if(j1 == 90 || j1 == 270)
	//*  71  147:iload_3         
	//*  72  148:bipush          90
	//*  73  150:icmpeq          160
	//*  74  153:iload_3         
	//*  75  154:sipush          270
	//*  76  157:icmpne          199
			{
				int k1 = w;
	//   77  160:aload_0         
	//   78  161:getfield        #123 <Field int w>
	//   79  164:istore_3        
				w = x;
	//   80  165:aload_0         
	//   81  166:aload_0         
	//   82  167:getfield        #125 <Field int x>
	//   83  170:putfield        #123 <Field int w>
				x = k1;
	//   84  173:aload_0         
	//   85  174:iload_3         
	//   86  175:putfield        #125 <Field int x>
				z = 1.0F / z;
	//   87  178:aload_0         
	//   88  179:fconst_1        
	//   89  180:aload_0         
	//   90  181:getfield        #128 <Field float z>
	//   91  184:fdiv            
	//   92  185:putfield        #128 <Field float z>
			}
		} else
	//*  93  188:goto            199
		{
			y = u;
	//   94  191:aload_0         
	//   95  192:aload_0         
	//   96  193:getfield        #420 <Field int u>
	//   97  196:putfield        #144 <Field int y>
		}
		mediacodec.setVideoScalingMode(o);
	//   98  199:aload_1         
	//   99  200:aload_0         
	//  100  201:getfield        #132 <Field int o>
	//  101  204:invokevirtual   #389 <Method void MediaCodec.setVideoScalingMode(int)>
	//  102  207:return          
	}

	protected final void a(bfc bfc)
	{
		if(bnw.a < 23 && E)
	//*   0    0:getstatic       #96  <Field int bnw.a>
	//*   1    3:bipush          23
	//*   2    5:icmpge          19
	//*   3    8:aload_0         
	//*   4    9:getfield        #236 <Field boolean E>
	//*   5   12:ifeq            19
			v();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #220 <Method void v()>
	//    8   19:return          
	}

	protected final void a(bhm bhm1, MediaCodec mediacodec, zzfs zzfs1, MediaCrypto mediacrypto)
	{
label0:
		{
			int j2;
			int i3;
			int k3;
label1:
			{
				int i1;
				int k1;
				int l1;
label2:
				{
					mediacrypto = ((MediaCrypto) (k));
	//    0    0:aload_0         
	//    1    1:getfield        #424 <Field zzfs[] k>
	//    2    4:astore          4
					l1 = zzfs1.i;
	//    3    6:aload_3         
	//    4    7:getfield        #231 <Field int zzfs.i>
	//    5   10:istore          9
					k1 = zzfs1.j;
	//    6   12:aload_3         
	//    7   13:getfield        #233 <Field int zzfs.j>
	//    8   16:istore          8
					i1 = c(zzfs1);
	//    9   18:aload_3         
	//   10   19:invokestatic    #426 <Method int c(zzfs)>
	//   11   22:istore          7
					if(mediacrypto.length == 1)
	//*  12   24:aload           4
	//*  13   26:arraylength     
	//*  14   27:iconst_1        
	//*  15   28:icmpne          49
					{
						mediacrypto = ((MediaCrypto) (new bog(l1, k1, i1)));
	//   16   31:new             #428 <Class bog>
	//   17   34:dup             
	//   18   35:iload           9
	//   19   37:iload           8
	//   20   39:iload           7
	//   21   41:invokespecial   #431 <Method void bog(int, int, int)>
	//   22   44:astore          4
						break label0;
	//   23   46:goto            695
					}
					int l4 = mediacrypto.length;
	//   24   49:aload           4
	//   25   51:arraylength     
	//   26   52:istore          16
					int k2 = 0;
	//   27   54:iconst_0        
	//   28   55:istore          11
					for(int i2 = 0; i2 < l4;)
	//*  29   57:iconst_0        
	//*  30   58:istore          10
	//*  31   60:iload           10
	//*  32   62:iload           16
	//*  33   64:icmpge          201
					{
						zzfs zzfs2 = ((zzfs) (mediacrypto[i2]));
	//   34   67:aload           4
	//   35   69:iload           10
	//   36   71:aaload          
	//   37   72:astore          19
						int j4 = k2;
	//   38   74:iload           11
	//   39   76:istore          15
						int l3 = l1;
	//   40   78:iload           9
	//   41   80:istore          14
						int j3 = k1;
	//   42   82:iload           8
	//   43   84:istore          13
						int l2 = i1;
	//   44   86:iload           7
	//   45   88:istore          12
						if(a(bhm1.b, zzfs1, zzfs2))
	//*  46   90:aload_1         
	//*  47   91:getfield        #350 <Field boolean bhm.b>
	//*  48   94:aload_3         
	//*  49   95:aload           19
	//*  50   97:invokestatic    #433 <Method boolean a(boolean, zzfs, zzfs)>
	//*  51  100:ifeq            176
						{
							if(zzfs2.i != -1 && zzfs2.j != -1)
	//*  52  103:aload           19
	//*  53  105:getfield        #231 <Field int zzfs.i>
	//*  54  108:iconst_m1       
	//*  55  109:icmpeq          130
	//*  56  112:aload           19
	//*  57  114:getfield        #233 <Field int zzfs.j>
	//*  58  117:iconst_m1       
	//*  59  118:icmpne          124
	//*  60  121:goto            130
								l2 = 0;
	//   61  124:iconst_0        
	//   62  125:istore          12
							else
	//*  63  127:goto            133
								l2 = 1;
	//   64  130:iconst_1        
	//   65  131:istore          12
							j4 = k2 | l2;
	//   66  133:iload           11
	//   67  135:iload           12
	//   68  137:ior             
	//   69  138:istore          15
							l3 = Math.max(l1, zzfs2.i);
	//   70  140:iload           9
	//   71  142:aload           19
	//   72  144:getfield        #231 <Field int zzfs.i>
	//   73  147:invokestatic    #438 <Method int Math.max(int, int)>
	//   74  150:istore          14
							j3 = Math.max(k1, zzfs2.j);
	//   75  152:iload           8
	//   76  154:aload           19
	//   77  156:getfield        #233 <Field int zzfs.j>
	//   78  159:invokestatic    #438 <Method int Math.max(int, int)>
	//   79  162:istore          13
							l2 = Math.max(i1, c(zzfs2));
	//   80  164:iload           7
	//   81  166:aload           19
	//   82  168:invokestatic    #426 <Method int c(zzfs)>
	//   83  171:invokestatic    #438 <Method int Math.max(int, int)>
	//   84  174:istore          12
						}
						i2++;
	//   85  176:iload           10
	//   86  178:iconst_1        
	//   87  179:iadd            
	//   88  180:istore          10
						k2 = j4;
	//   89  182:iload           15
	//   90  184:istore          11
						l1 = l3;
	//   91  186:iload           14
	//   92  188:istore          9
						k1 = j3;
	//   93  190:iload           13
	//   94  192:istore          8
						i1 = l2;
	//   95  194:iload           12
	//   96  196:istore          7
					}

	//*  97  198:goto            60
					k3 = l1;
	//   98  201:iload           9
	//   99  203:istore          13
					i3 = k1;
	//  100  205:iload           8
	//  101  207:istore          12
					j2 = i1;
	//  102  209:iload           7
	//  103  211:istore          10
					if(k2 == 0)
						break label1;
	//  104  213:iload           11
	//  105  215:ifeq            680
					mediacrypto = ((MediaCrypto) (new StringBuilder(66)));
	//  106  218:new             #313 <Class StringBuilder>
	//  107  221:dup             
	//  108  222:bipush          66
	//  109  224:invokespecial   #323 <Method void StringBuilder(int)>
	//  110  227:astore          4
					((StringBuilder) (mediacrypto)).append("Resolutions unknown. Codec max resolution: ");
	//  111  229:aload           4
	//  112  231:ldc2            #440 <String "Resolutions unknown. Codec max resolution: ">
	//  113  234:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//  114  237:pop             
					((StringBuilder) (mediacrypto)).append(l1);
	//  115  238:aload           4
	//  116  240:iload           9
	//  117  242:invokevirtual   #332 <Method StringBuilder StringBuilder.append(int)>
	//  118  245:pop             
					((StringBuilder) (mediacrypto)).append("x");
	//  119  246:aload           4
	//  120  248:ldc2            #333 <String "x">
	//  121  251:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//  122  254:pop             
					((StringBuilder) (mediacrypto)).append(k1);
	//  123  255:aload           4
	//  124  257:iload           8
	//  125  259:invokevirtual   #332 <Method StringBuilder StringBuilder.append(int)>
	//  126  262:pop             
					Log.w("MediaCodecVideoRenderer", ((StringBuilder) (mediacrypto)).toString());
	//  127  263:ldc2            #339 <String "MediaCodecVideoRenderer">
	//  128  266:aload           4
	//  129  268:invokevirtual   #343 <Method String StringBuilder.toString()>
	//  130  271:invokestatic    #442 <Method int Log.w(String, String)>
	//  131  274:pop             
					if(zzfs1.j > zzfs1.i)
	//* 132  275:aload_3         
	//* 133  276:getfield        #233 <Field int zzfs.j>
	//* 134  279:aload_3         
	//* 135  280:getfield        #231 <Field int zzfs.i>
	//* 136  283:icmple          292
						i3 = 1;
	//  137  286:iconst_1        
	//  138  287:istore          12
					else
	//* 139  289:goto            295
						i3 = 0;
	//  140  292:iconst_0        
	//  141  293:istore          12
					if(i3 != 0)
	//* 142  295:iload           12
	//* 143  297:ifeq            309
						j2 = zzfs1.j;
	//  144  300:aload_3         
	//  145  301:getfield        #233 <Field int zzfs.j>
	//  146  304:istore          10
					else
	//* 147  306:goto            315
						j2 = zzfs1.i;
	//  148  309:aload_3         
	//  149  310:getfield        #231 <Field int zzfs.i>
	//  150  313:istore          10
					if(i3 != 0)
	//* 151  315:iload           12
	//* 152  317:ifeq            329
						k2 = zzfs1.i;
	//  153  320:aload_3         
	//  154  321:getfield        #231 <Field int zzfs.i>
	//  155  324:istore          11
					else
	//* 156  326:goto            335
						k2 = zzfs1.j;
	//  157  329:aload_3         
	//  158  330:getfield        #233 <Field int zzfs.j>
	//  159  333:istore          11
					float f1 = (float)k2 / (float)j2;
	//  160  335:iload           11
	//  161  337:i2f             
	//  162  338:iload           10
	//  163  340:i2f             
	//  164  341:fdiv            
	//  165  342:fstore          5
					int ai[] = c;
	//  166  344:getstatic       #56  <Field int[] c>
	//  167  347:astore          19
					int j5 = ai.length;
	//  168  349:aload           19
	//  169  351:arraylength     
	//  170  352:istore          17
					for(k3 = 0; k3 < j5;)
	//* 171  354:iconst_0        
	//* 172  355:istore          13
	//* 173  357:iload           13
	//* 174  359:iload           17
	//* 175  361:icmpge          561
					{
						int i4 = ai[k3];
	//  176  364:aload           19
	//  177  366:iload           13
	//  178  368:iaload          
	//  179  369:istore          14
						int k4 = (int)((float)i4 * f1);
	//  180  371:iload           14
	//  181  373:i2f             
	//  182  374:fload           5
	//  183  376:fmul            
	//  184  377:f2i             
	//  185  378:istore          15
						if(i4 > j2 && k4 > k2)
	//* 186  380:iload           14
	//* 187  382:iload           10
	//* 188  384:icmple          555
	//* 189  387:iload           15
	//* 190  389:iload           11
	//* 191  391:icmpgt          397
	//* 192  394:goto            555
						{
							if(bnw.a >= 21)
	//* 193  397:getstatic       #96  <Field int bnw.a>
	//* 194  400:bipush          21
	//* 195  402:icmplt          472
							{
								int i5;
								if(i3 != 0)
	//* 196  405:iload           12
	//* 197  407:ifeq            417
									i5 = k4;
	//  198  410:iload           15
	//  199  412:istore          16
								else
	//* 200  414:goto            421
									i5 = i4;
	//  201  417:iload           14
	//  202  419:istore          16
								if(i3 == 0)
	//* 203  421:iload           12
	//* 204  423:ifeq            429
	//* 205  426:goto            433
									i4 = k4;
	//  206  429:iload           15
	//  207  431:istore          14
								mediacrypto = ((MediaCrypto) (bhm1.a(i5, i4)));
	//  208  433:aload_1         
	//  209  434:iload           16
	//  210  436:iload           14
	//  211  438:invokevirtual   #445 <Method Point bhm.a(int, int)>
	//  212  441:astore          4
								float f2 = zzfs1.k;
	//  213  443:aload_3         
	//  214  444:getfield        #303 <Field float zzfs.k>
	//  215  447:fstore          6
								if(bhm1.a(((Point) (mediacrypto)).x, ((Point) (mediacrypto)).y, f2))
	//* 216  449:aload_1         
	//* 217  450:aload           4
	//* 218  452:getfield        #448 <Field int Point.x>
	//* 219  455:aload           4
	//* 220  457:getfield        #449 <Field int Point.y>
	//* 221  460:fload           6
	//* 222  462:f2d             
	//* 223  463:invokevirtual   #306 <Method boolean bhm.a(int, int, double)>
	//* 224  466:ifeq            546
									break label2;
	//  225  469:goto            564
							} else
							{
								i4 = bnw.a(i4, 16) << 4;
	//  226  472:iload           14
	//  227  474:bipush          16
	//  228  476:invokestatic    #184 <Method int bnw.a(int, int)>
	//  229  479:iconst_4        
	//  230  480:ishl            
	//  231  481:istore          14
								k4 = bnw.a(k4, 16) << 4;
	//  232  483:iload           15
	//  233  485:bipush          16
	//  234  487:invokestatic    #184 <Method int bnw.a(int, int)>
	//  235  490:iconst_4        
	//  236  491:ishl            
	//  237  492:istore          15
								if(i4 * k4 <= bhs.b())
	//* 238  494:iload           14
	//* 239  496:iload           15
	//* 240  498:imul            
	//* 241  499:invokestatic    #310 <Method int bhs.b()>
	//* 242  502:icmpgt          546
								{
									if(i3 != 0)
	//* 243  505:iload           12
	//* 244  507:ifeq            517
										j2 = k4;
	//  245  510:iload           15
	//  246  512:istore          10
									else
	//* 247  514:goto            521
										j2 = i4;
	//  248  517:iload           14
	//  249  519:istore          10
									if(i3 != 0)
	//* 250  521:iload           12
	//* 251  523:ifeq            530
										k4 = i4;
	//  252  526:iload           14
	//  253  528:istore          15
									mediacrypto = ((MediaCrypto) (new Point(j2, k4)));
	//  254  530:new             #447 <Class Point>
	//  255  533:dup             
	//  256  534:iload           10
	//  257  536:iload           15
	//  258  538:invokespecial   #452 <Method void Point(int, int)>
	//  259  541:astore          4
									break label2;
	//  260  543:goto            564
								}
							}
							k3++;
	//  261  546:iload           13
	//  262  548:iconst_1        
	//  263  549:iadd            
	//  264  550:istore          13
						} else
	//* 265  552:goto            357
						{
							mediacrypto = null;
	//  266  555:aconst_null     
	//  267  556:astore          4
							break label2;
	//  268  558:goto            564
						}
					}

					mediacrypto = null;
	//  269  561:aconst_null     
	//  270  562:astore          4
				}
				k3 = l1;
	//  271  564:iload           9
	//  272  566:istore          13
				i3 = k1;
	//  273  568:iload           8
	//  274  570:istore          12
				j2 = i1;
	//  275  572:iload           7
	//  276  574:istore          10
				if(mediacrypto != null)
	//* 277  576:aload           4
	//* 278  578:ifnull          680
				{
					k3 = Math.max(l1, ((Point) (mediacrypto)).x);
	//  279  581:iload           9
	//  280  583:aload           4
	//  281  585:getfield        #448 <Field int Point.x>
	//  282  588:invokestatic    #438 <Method int Math.max(int, int)>
	//  283  591:istore          13
					i3 = Math.max(k1, ((Point) (mediacrypto)).y);
	//  284  593:iload           8
	//  285  595:aload           4
	//  286  597:getfield        #449 <Field int Point.y>
	//  287  600:invokestatic    #438 <Method int Math.max(int, int)>
	//  288  603:istore          12
					j2 = Math.max(i1, a(zzfs1.e, k3, i3));
	//  289  605:iload           7
	//  290  607:aload_3         
	//  291  608:getfield        #226 <Field String zzfs.e>
	//  292  611:iload           13
	//  293  613:iload           12
	//  294  615:invokestatic    #245 <Method int a(String, int, int)>
	//  295  618:invokestatic    #438 <Method int Math.max(int, int)>
	//  296  621:istore          10
					mediacrypto = ((MediaCrypto) (new StringBuilder(57)));
	//  297  623:new             #313 <Class StringBuilder>
	//  298  626:dup             
	//  299  627:bipush          57
	//  300  629:invokespecial   #323 <Method void StringBuilder(int)>
	//  301  632:astore          4
					((StringBuilder) (mediacrypto)).append("Codec max resolution adjusted to: ");
	//  302  634:aload           4
	//  303  636:ldc2            #454 <String "Codec max resolution adjusted to: ">
	//  304  639:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//  305  642:pop             
					((StringBuilder) (mediacrypto)).append(k3);
	//  306  643:aload           4
	//  307  645:iload           13
	//  308  647:invokevirtual   #332 <Method StringBuilder StringBuilder.append(int)>
	//  309  650:pop             
					((StringBuilder) (mediacrypto)).append("x");
	//  310  651:aload           4
	//  311  653:ldc2            #333 <String "x">
	//  312  656:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//  313  659:pop             
					((StringBuilder) (mediacrypto)).append(i3);
	//  314  660:aload           4
	//  315  662:iload           12
	//  316  664:invokevirtual   #332 <Method StringBuilder StringBuilder.append(int)>
	//  317  667:pop             
					Log.w("MediaCodecVideoRenderer", ((StringBuilder) (mediacrypto)).toString());
	//  318  668:ldc2            #339 <String "MediaCodecVideoRenderer">
	//  319  671:aload           4
	//  320  673:invokevirtual   #343 <Method String StringBuilder.toString()>
	//  321  676:invokestatic    #442 <Method int Log.w(String, String)>
	//  322  679:pop             
				}
			}
			mediacrypto = ((MediaCrypto) (new bog(k3, i3, j2)));
	//  323  680:new             #428 <Class bog>
	//  324  683:dup             
	//  325  684:iload           13
	//  326  686:iload           12
	//  327  688:iload           10
	//  328  690:invokespecial   #431 <Method void bog(int, int, int)>
	//  329  693:astore          4
		}
		l = ((bog) (mediacrypto));
	//  330  695:aload_0         
	//  331  696:aload           4
	//  332  698:putfield        #456 <Field bog l>
		mediacrypto = ((MediaCrypto) (l));
	//  333  701:aload_0         
	//  334  702:getfield        #456 <Field bog l>
	//  335  705:astore          4
		boolean flag = i;
	//  336  707:aload_0         
	//  337  708:getfield        #113 <Field boolean i>
	//  338  711:istore          18
		int j1 = F;
	//  339  713:aload_0         
	//  340  714:getfield        #458 <Field int F>
	//  341  717:istore          7
		zzfs1 = ((zzfs) (zzfs1.b()));
	//  342  719:aload_3         
	//  343  720:invokevirtual   #461 <Method MediaFormat zzfs.b()>
	//  344  723:astore_3        
		((MediaFormat) (zzfs1)).setInteger("max-width", ((bog) (mediacrypto)).a);
	//  345  724:aload_3         
	//  346  725:ldc2            #463 <String "max-width">
	//  347  728:aload           4
	//  348  730:getfield        #464 <Field int bog.a>
	//  349  733:invokevirtual   #468 <Method void MediaFormat.setInteger(String, int)>
		((MediaFormat) (zzfs1)).setInteger("max-height", ((bog) (mediacrypto)).b);
	//  350  736:aload_3         
	//  351  737:ldc2            #470 <String "max-height">
	//  352  740:aload           4
	//  353  742:getfield        #472 <Field int bog.b>
	//  354  745:invokevirtual   #468 <Method void MediaFormat.setInteger(String, int)>
		if(((bog) (mediacrypto)).c != -1)
	//* 355  748:aload           4
	//* 356  750:getfield        #474 <Field int bog.c>
	//* 357  753:iconst_m1       
	//* 358  754:icmpeq          769
			((MediaFormat) (zzfs1)).setInteger("max-input-size", ((bog) (mediacrypto)).c);
	//  359  757:aload_3         
	//  360  758:ldc2            #476 <String "max-input-size">
	//  361  761:aload           4
	//  362  763:getfield        #474 <Field int bog.c>
	//  363  766:invokevirtual   #468 <Method void MediaFormat.setInteger(String, int)>
		if(flag)
	//* 364  769:iload           18
	//* 365  771:ifeq            782
			((MediaFormat) (zzfs1)).setInteger("auto-frc", 0);
	//  366  774:aload_3         
	//  367  775:ldc2            #478 <String "auto-frc">
	//  368  778:iconst_0        
	//  369  779:invokevirtual   #468 <Method void MediaFormat.setInteger(String, int)>
		if(j1 != 0)
	//* 370  782:iload           7
	//* 371  784:ifeq            804
		{
			((MediaFormat) (zzfs1)).setFeatureEnabled("tunneled-playback", true);
	//  372  787:aload_3         
	//  373  788:ldc2            #480 <String "tunneled-playback">
	//  374  791:iconst_1        
	//  375  792:invokevirtual   #484 <Method void MediaFormat.setFeatureEnabled(String, boolean)>
			((MediaFormat) (zzfs1)).setInteger("audio-session-id", j1);
	//  376  795:aload_3         
	//  377  796:ldc2            #486 <String "audio-session-id">
	//  378  799:iload           7
	//  379  801:invokevirtual   #468 <Method void MediaFormat.setInteger(String, int)>
		}
		if(m == null)
	//* 380  804:aload_0         
	//* 381  805:getfield        #268 <Field Surface m>
	//* 382  808:ifnonnull       852
		{
			bnf.b(b(bhm1.d));
	//  383  811:aload_0         
	//  384  812:aload_1         
	//  385  813:getfield        #358 <Field boolean bhm.d>
	//  386  816:invokespecial   #360 <Method boolean b(boolean)>
	//  387  819:invokestatic    #491 <Method void bnf.b(boolean)>
			if(n == null)
	//* 388  822:aload_0         
	//* 389  823:getfield        #266 <Field Surface n>
	//* 390  826:ifnonnull       844
				n = ((Surface) (zzqk.a(d, bhm1.d)));
	//  391  829:aload_0         
	//  392  830:aload_0         
	//  393  831:getfield        #77  <Field Context d>
	//  394  834:aload_1         
	//  395  835:getfield        #358 <Field boolean bhm.d>
	//  396  838:invokestatic    #363 <Method zzqk zzqk.a(Context, boolean)>
	//  397  841:putfield        #266 <Field Surface n>
			m = n;
	//  398  844:aload_0         
	//  399  845:aload_0         
	//  400  846:getfield        #266 <Field Surface n>
	//  401  849:putfield        #268 <Field Surface m>
		}
		mediacodec.configure(((MediaFormat) (zzfs1)), m, ((MediaCrypto) (null)), 0);
	//  402  852:aload_2         
	//  403  853:aload_3         
	//  404  854:aload_0         
	//  405  855:getfield        #268 <Field Surface m>
	//  406  858:aconst_null     
	//  407  859:iconst_0        
	//  408  860:invokevirtual   #495 <Method void MediaCodec.configure(MediaFormat, Surface, MediaCrypto, int)>
		if(bnw.a >= 23 && E)
	//* 409  863:getstatic       #96  <Field int bnw.a>
	//* 410  866:bipush          23
	//* 411  868:icmplt          892
	//* 412  871:aload_0         
	//* 413  872:getfield        #236 <Field boolean E>
	//* 414  875:ifeq            892
			b = new boh(this, mediacodec, ((bof) (null)));
	//  415  878:aload_0         
	//  416  879:new             #257 <Class boh>
	//  417  882:dup             
	//  418  883:aload_0         
	//  419  884:aload_2         
	//  420  885:aconst_null     
	//  421  886:invokespecial   #260 <Method void boh(boe, MediaCodec, bof)>
	//  422  889:putfield        #262 <Field boh b>
	//  423  892:return          
	}

	protected final void a(String s1, long l1, long l2)
	{
		f.a(s1, l1, l2);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field bol f>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #498 <Method void bol.a(String, long, long)>
	//    6   11:return          
	}

	protected final void a(boolean flag)
	{
		super.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #500 <Method void bhn.a(boolean)>
		F = ((bcq)this).q().b;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #503 <Method bdo bcq.q()>
	//    6   10:getfield        #506 <Field int bdo.b>
	//    7   13:putfield        #458 <Field int F>
		if(F != 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #458 <Field int F>
	//*  10   20:ifeq            28
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_1        
		else
	//*  13   25:goto            30
			flag = false;
	//   14   28:iconst_0        
	//   15   29:istore_1        
		E = flag;
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:putfield        #236 <Field boolean E>
		f.a(a);
	//   19   35:aload_0         
	//   20   36:getfield        #91  <Field bol f>
	//   21   39:aload_0         
	//   22   40:getfield        #203 <Field bfb a>
	//   23   43:invokevirtual   #509 <Method void bol.a(bfb)>
		e.a();
	//   24   46:aload_0         
	//   25   47:getfield        #84  <Field boi e>
	//   26   50:invokevirtual   #510 <Method void boi.a()>
	//   27   53:return          
	}

	protected final void a(zzfs azzfs[], long l1)
	{
		k = azzfs;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #424 <Field zzfs[] k>
		if(G == 0x1L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #119 <Field long G>
	//*   5    9:ldc2w           #116 <Long 0x1L>
	//*   6   12:lcmp            
	//*   7   13:ifne            24
		{
			G = l1;
	//    8   16:aload_0         
	//    9   17:lload_2         
	//   10   18:putfield        #119 <Field long G>
		} else
	//*  11   21:goto            116
		{
			int i1 = H;
	//   12   24:aload_0         
	//   13   25:getfield        #396 <Field int H>
	//   14   28:istore          4
			long al[] = j;
	//   15   30:aload_0         
	//   16   31:getfield        #115 <Field long[] j>
	//   17   34:astore          7
			if(i1 == al.length)
	//*  18   36:iload           4
	//*  19   38:aload           7
	//*  20   40:arraylength     
	//*  21   41:icmpne          96
			{
				long l2 = al[i1 - 1];
	//   22   44:aload           7
	//   23   46:iload           4
	//   24   48:iconst_1        
	//   25   49:isub            
	//   26   50:laload          
	//   27   51:lstore          5
				StringBuilder stringbuilder = new StringBuilder(65);
	//   28   53:new             #313 <Class StringBuilder>
	//   29   56:dup             
	//   30   57:bipush          65
	//   31   59:invokespecial   #323 <Method void StringBuilder(int)>
	//   32   62:astore          7
				stringbuilder.append("Too many stream changes, so dropping offset: ");
	//   33   64:aload           7
	//   34   66:ldc2            #513 <String "Too many stream changes, so dropping offset: ">
	//   35   69:invokevirtual   #329 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
				stringbuilder.append(l2);
	//   37   73:aload           7
	//   38   75:lload           5
	//   39   77:invokevirtual   #516 <Method StringBuilder StringBuilder.append(long)>
	//   40   80:pop             
				Log.w("MediaCodecVideoRenderer", stringbuilder.toString());
	//   41   81:ldc2            #339 <String "MediaCodecVideoRenderer">
	//   42   84:aload           7
	//   43   86:invokevirtual   #343 <Method String StringBuilder.toString()>
	//   44   89:invokestatic    #442 <Method int Log.w(String, String)>
	//   45   92:pop             
			} else
	//*  46   93:goto            104
			{
				H = i1 + 1;
	//   47   96:aload_0         
	//   48   97:iload           4
	//   49   99:iconst_1        
	//   50  100:iadd            
	//   51  101:putfield        #396 <Field int H>
			}
			j[H - 1] = l1;
	//   52  104:aload_0         
	//   53  105:getfield        #115 <Field long[] j>
	//   54  108:aload_0         
	//   55  109:getfield        #396 <Field int H>
	//   56  112:iconst_1        
	//   57  113:isub            
	//   58  114:lload_2         
	//   59  115:lastore         
		}
		super.a(azzfs, l1);
	//   60  116:aload_0         
	//   61  117:aload_1         
	//   62  118:lload_2         
	//   63  119:invokespecial   #518 <Method void bhn.a(zzfs[], long)>
	//   64  122:return          
	}

	protected final boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, int i1, 
			int j1, long l3, boolean flag)
	{
		do
		{
			j1 = H;
	//    0    0:aload_0         
	//    1    1:getfield        #396 <Field int H>
	//    2    4:istore          8
			if(j1 == 0)
				break;
	//    3    6:iload           8
	//    4    8:ifeq            59
			bytebuffer = ((ByteBuffer) (j));
	//    5   11:aload_0         
	//    6   12:getfield        #115 <Field long[] j>
	//    7   15:astore          6
			if(l3 < bytebuffer[0])
				break;
	//    8   17:lload           9
	//    9   19:aload           6
	//   10   21:iconst_0        
	//   11   22:laload          
	//   12   23:lcmp            
	//   13   24:iflt            59
			G = bytebuffer[0];
	//   14   27:aload_0         
	//   15   28:aload           6
	//   16   30:iconst_0        
	//   17   31:laload          
	//   18   32:putfield        #119 <Field long G>
			H = j1 - 1;
	//   19   35:aload_0         
	//   20   36:iload           8
	//   21   38:iconst_1        
	//   22   39:isub            
	//   23   40:putfield        #396 <Field int H>
			System.arraycopy(((Object) (bytebuffer)), 1, ((Object) (bytebuffer)), 0, H);
	//   24   43:aload           6
	//   25   45:iconst_1        
	//   26   46:aload           6
	//   27   48:iconst_0        
	//   28   49:aload_0         
	//   29   50:getfield        #396 <Field int H>
	//   30   53:invokestatic    #527 <Method void System.arraycopy(Object, int, Object, int, int)>
		} while(true);
	//   31   56:goto            0
		long l4 = l3 - G;
	//   32   59:lload           9
	//   33   61:aload_0         
	//   34   62:getfield        #119 <Field long G>
	//   35   65:lsub            
	//   36   66:lstore          12
		if(flag)
	//*  37   68:iload           11
	//*  38   70:ifeq            85
		{
			a(mediacodec, i1, l4);
	//   39   73:aload_0         
	//   40   74:aload           5
	//   41   76:iload           7
	//   42   78:lload           12
	//   43   80:invokespecial   #529 <Method void a(MediaCodec, int, long)>
			return true;
	//   44   83:iconst_1        
	//   45   84:ireturn         
		}
		long l5 = l3 - l1;
	//   46   85:lload           9
	//   47   87:lload_1         
	//   48   88:lsub            
	//   49   89:lstore          14
		if(m == n)
	//*  50   91:aload_0         
	//*  51   92:getfield        #268 <Field Surface m>
	//*  52   95:aload_0         
	//*  53   96:getfield        #266 <Field Surface n>
	//*  54   99:if_acmpne       124
			if(c(l5))
	//*  55  102:lload           14
	//*  56  104:invokestatic    #531 <Method boolean c(long)>
	//*  57  107:ifeq            122
			{
				a(mediacodec, i1, l4);
	//   58  110:aload_0         
	//   59  111:aload           5
	//   60  113:iload           7
	//   61  115:lload           12
	//   62  117:invokespecial   #529 <Method void a(MediaCodec, int, long)>
				return true;
	//   63  120:iconst_1        
	//   64  121:ireturn         
			} else
			{
				return false;
	//   65  122:iconst_0        
	//   66  123:ireturn         
			}
		if(!p)
	//*  67  124:aload_0         
	//*  68  125:getfield        #252 <Field boolean p>
	//*  69  128:ifne            166
			if(bnw.a >= 21)
	//*  70  131:getstatic       #96  <Field int bnw.a>
	//*  71  134:bipush          21
	//*  72  136:icmplt          154
			{
				a(mediacodec, i1, l4, System.nanoTime());
	//   73  139:aload_0         
	//   74  140:aload           5
	//   75  142:iload           7
	//   76  144:lload           12
	//   77  146:invokestatic    #534 <Method long System.nanoTime()>
	//   78  149:invokespecial   #536 <Method void a(MediaCodec, int, long, long)>
				return true;
	//   79  152:iconst_1        
	//   80  153:ireturn         
			} else
			{
				b(mediacodec, i1, l4);
	//   81  154:aload_0         
	//   82  155:aload           5
	//   83  157:iload           7
	//   84  159:lload           12
	//   85  161:invokespecial   #538 <Method void b(MediaCodec, int, long)>
				return true;
	//   86  164:iconst_1        
	//   87  165:ireturn         
			}
		if(((bcq)this).d() != 2)
	//*  88  166:aload_0         
	//*  89  167:invokevirtual   #367 <Method int bcq.d()>
	//*  90  170:iconst_2        
	//*  91  171:icmpeq          176
			return false;
	//   92  174:iconst_0        
	//   93  175:ireturn         
		long l6 = SystemClock.elapsedRealtime();
	//   94  176:invokestatic    #155 <Method long SystemClock.elapsedRealtime()>
	//   95  179:lstore          16
		l1 = System.nanoTime();
	//   96  181:invokestatic    #534 <Method long System.nanoTime()>
	//   97  184:lstore_1        
		l2 = e.a(l3, (l5 - (l6 * 1000L - l2)) * 1000L + l1);
	//   98  185:aload_0         
	//   99  186:getfield        #84  <Field boi e>
	//  100  189:lload           9
	//  101  191:lload           14
	//  102  193:lload           16
	//  103  195:ldc2w           #539 <Long 1000L>
	//  104  198:lmul            
	//  105  199:lload_3         
	//  106  200:lsub            
	//  107  201:lsub            
	//  108  202:ldc2w           #539 <Long 1000L>
	//  109  205:lmul            
	//  110  206:lload_1         
	//  111  207:ladd            
	//  112  208:invokevirtual   #543 <Method long boi.a(long, long)>
	//  113  211:lstore_3        
		l1 = (l2 - l1) / 1000L;
	//  114  212:lload_3         
	//  115  213:lload_1         
	//  116  214:lsub            
	//  117  215:ldc2w           #539 <Long 1000L>
	//  118  218:ldiv            
	//  119  219:lstore_1        
		if(c(l1))
	//* 120  220:lload_1         
	//* 121  221:invokestatic    #531 <Method boolean c(long)>
	//* 122  224:ifeq            320
		{
			bnu.a("dropVideoBuffer");
	//  123  227:ldc2            #545 <String "dropVideoBuffer">
	//  124  230:invokestatic    #192 <Method void bnu.a(String)>
			mediacodec.releaseOutputBuffer(i1, false);
	//  125  233:aload           5
	//  126  235:iload           7
	//  127  237:iconst_0        
	//  128  238:invokevirtual   #198 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
			bnu.a();
	//  129  241:invokestatic    #200 <Method void bnu.a()>
			mediacodec = ((MediaCodec) (a));
	//  130  244:aload_0         
	//  131  245:getfield        #203 <Field bfb a>
	//  132  248:astore          5
			mediacodec.f = ((bfb) (mediacodec)).f + 1;
	//  133  250:aload           5
	//  134  252:aload           5
	//  135  254:getfield        #546 <Field int bfb.f>
	//  136  257:iconst_1        
	//  137  258:iadd            
	//  138  259:putfield        #546 <Field int bfb.f>
			s = s + 1;
	//  139  262:aload_0         
	//  140  263:aload_0         
	//  141  264:getfield        #149 <Field int s>
	//  142  267:iconst_1        
	//  143  268:iadd            
	//  144  269:putfield        #149 <Field int s>
			t = t + 1;
	//  145  272:aload_0         
	//  146  273:aload_0         
	//  147  274:getfield        #218 <Field int t>
	//  148  277:iconst_1        
	//  149  278:iadd            
	//  150  279:putfield        #218 <Field int t>
			a.g = Math.max(t, a.g);
	//  151  282:aload_0         
	//  152  283:getfield        #203 <Field bfb a>
	//  153  286:aload_0         
	//  154  287:getfield        #218 <Field int t>
	//  155  290:aload_0         
	//  156  291:getfield        #203 <Field bfb a>
	//  157  294:getfield        #548 <Field int bfb.g>
	//  158  297:invokestatic    #438 <Method int Math.max(int, int)>
	//  159  300:putfield        #548 <Field int bfb.g>
			if(s == h)
	//* 160  303:aload_0         
	//* 161  304:getfield        #149 <Field int s>
	//* 162  307:aload_0         
	//* 163  308:getfield        #69  <Field int h>
	//* 164  311:icmpne          318
				G();
	//  165  314:aload_0         
	//  166  315:invokespecial   #550 <Method void G()>
			return true;
	//  167  318:iconst_1        
	//  168  319:ireturn         
		}
		if(bnw.a >= 21)
	//* 169  320:getstatic       #96  <Field int bnw.a>
	//* 170  323:bipush          21
	//* 171  325:icmplt          349
		{
			if(l1 < 50000L)
	//* 172  328:lload_1         
	//* 173  329:ldc2w           #551 <Long 50000L>
	//* 174  332:lcmp            
	//* 175  333:ifge            398
			{
				a(mediacodec, i1, l4, l2);
	//  176  336:aload_0         
	//  177  337:aload           5
	//  178  339:iload           7
	//  179  341:lload           12
	//  180  343:lload_3         
	//  181  344:invokespecial   #536 <Method void a(MediaCodec, int, long, long)>
				return true;
	//  182  347:iconst_1        
	//  183  348:ireturn         
			}
		} else
		if(l1 < 30000L)
	//* 184  349:lload_1         
	//* 185  350:ldc2w           #553 <Long 30000L>
	//* 186  353:lcmp            
	//* 187  354:ifge            398
		{
			if(l1 > 11000L)
	//* 188  357:lload_1         
	//* 189  358:ldc2w           #555 <Long 11000L>
	//* 190  361:lcmp            
	//* 191  362:ifle            386
				try
				{
					Thread.sleep((l1 - 10000L) / 1000L);
	//  192  365:lload_1         
	//  193  366:ldc2w           #557 <Long 10000L>
	//  194  369:lsub            
	//  195  370:ldc2w           #539 <Long 1000L>
	//  196  373:ldiv            
	//  197  374:invokestatic    #564 <Method void Thread.sleep(long)>
				}
	//* 198  377:goto            386
	//* 199  380:invokestatic    #568 <Method Thread Thread.currentThread()>
	//* 200  383:invokevirtual   #571 <Method void Thread.interrupt()>
	//* 201  386:aload_0         
	//* 202  387:aload           5
	//* 203  389:iload           7
	//* 204  391:lload           12
	//* 205  393:invokespecial   #538 <Method void b(MediaCodec, int, long)>
	//* 206  396:iconst_1        
	//* 207  397:ireturn         
	//* 208  398:iconst_0        
	//* 209  399:ireturn         
				// Misplaced declaration of an exception variable
				catch(ByteBuffer bytebuffer)
				{
					Thread.currentThread().interrupt();
				}
			b(mediacodec, i1, l4);
			return true;
		}
		return false;
	//* 210  400:astore          6
	//* 211  402:goto            380
	}

	protected final boolean a(MediaCodec mediacodec, boolean flag, zzfs zzfs1, zzfs zzfs2)
	{
		return a(flag, zzfs1, zzfs2) && zzfs2.i <= l.a && zzfs2.j <= l.b && zzfs2.f <= l.c;
	//    0    0:iload_2         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokestatic    #433 <Method boolean a(boolean, zzfs, zzfs)>
	//    4    7:ifeq            57
	//    5   10:aload           4
	//    6   12:getfield        #231 <Field int zzfs.i>
	//    7   15:aload_0         
	//    8   16:getfield        #456 <Field bog l>
	//    9   19:getfield        #464 <Field int bog.a>
	//   10   22:icmpgt          57
	//   11   25:aload           4
	//   12   27:getfield        #233 <Field int zzfs.j>
	//   13   30:aload_0         
	//   14   31:getfield        #456 <Field bog l>
	//   15   34:getfield        #472 <Field int bog.b>
	//   16   37:icmpgt          57
	//   17   40:aload           4
	//   18   42:getfield        #243 <Field int zzfs.f>
	//   19   45:aload_0         
	//   20   46:getfield        #456 <Field bog l>
	//   21   49:getfield        #474 <Field int bog.c>
	//   22   52:icmpgt          57
	//   23   55:iconst_1        
	//   24   56:ireturn         
	//   25   57:iconst_0        
	//   26   58:ireturn         
	}

	protected final boolean a(bhm bhm1)
	{
		return m != null || b(bhm1.d);
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field Surface m>
	//    2    4:ifnonnull       23
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:getfield        #358 <Field boolean bhm.d>
	//    6   12:invokespecial   #360 <Method boolean b(boolean)>
	//    7   15:ifeq            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	protected final void b(zzfs zzfs1)
	{
		super.b(zzfs1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #576 <Method void bhn.b(zzfs)>
		f.a(zzfs1);
	//    3    5:aload_0         
	//    4    6:getfield        #91  <Field bol f>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #578 <Method void bol.a(zzfs)>
		float f1;
		if(zzfs1.m == -1F)
	//*   7   13:aload_1         
	//*   8   14:getfield        #580 <Field float zzfs.m>
	//*   9   17:ldc1            #126 <Float -1F>
	//*  10   19:fcmpl           
	//*  11   20:ifne            28
			f1 = 1.0F;
	//   12   23:fconst_1        
	//   13   24:fstore_2        
		else
	//*  14   25:goto            33
			f1 = zzfs1.m;
	//   15   28:aload_1         
	//   16   29:getfield        #580 <Field float zzfs.m>
	//   17   32:fstore_2        
		v = f1;
	//   18   33:aload_0         
	//   19   34:fload_2         
	//   20   35:putfield        #130 <Field float v>
		u = d(zzfs1);
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokestatic    #229 <Method int d(zzfs)>
	//   24   43:putfield        #420 <Field int u>
	//   25   46:return          
	}

	protected final void n()
	{
		super.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #582 <Method void bhn.n()>
		s = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #149 <Field int s>
		r = SystemClock.elapsedRealtime();
	//    5    9:aload_0         
	//    6   10:invokestatic    #155 <Method long SystemClock.elapsedRealtime()>
	//    7   13:putfield        #157 <Field long r>
		q = 0x1L;
	//    8   16:aload_0         
	//    9   17:ldc2w           #116 <Long 0x1L>
	//   10   20:putfield        #121 <Field long q>
	//   11   23:return          
	}

	protected final void o()
	{
		G();
	//    0    0:aload_0         
	//    1    1:invokespecial   #550 <Method void G()>
		super.o();
	//    2    4:aload_0         
	//    3    5:invokespecial   #584 <Method void bhn.o()>
	//    4    8:return          
	}

	protected final void p()
	{
		w = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #123 <Field int w>
		x = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #125 <Field int x>
		z = -1F;
	//    6   10:aload_0         
	//    7   11:ldc1            #126 <Float -1F>
	//    8   13:putfield        #128 <Field float z>
		v = -1F;
	//    9   16:aload_0         
	//   10   17:ldc1            #126 <Float -1F>
	//   11   19:putfield        #130 <Field float v>
		G = 0x1L;
	//   12   22:aload_0         
	//   13   23:ldc2w           #116 <Long 0x1L>
	//   14   26:putfield        #119 <Field long G>
		H = 0;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #396 <Field int H>
		D();
	//   18   34:aload_0         
	//   19   35:invokespecial   #134 <Method void D()>
		x();
	//   20   38:aload_0         
	//   21   39:invokespecial   #377 <Method void x()>
		e.b();
	//   22   42:aload_0         
	//   23   43:getfield        #84  <Field boi e>
	//   24   46:invokevirtual   #586 <Method void boi.b()>
		b = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #262 <Field boh b>
		E = false;
	//   28   54:aload_0         
	//   29   55:iconst_0        
	//   30   56:putfield        #236 <Field boolean E>
		super.p();
	//   31   59:aload_0         
	//   32   60:invokespecial   #588 <Method void bhn.p()>
		a.a();
	//   33   63:aload_0         
	//   34   64:getfield        #203 <Field bfb a>
	//   35   67:invokevirtual   #589 <Method void bfb.a()>
		f.b(a);
	//   36   70:aload_0         
	//   37   71:getfield        #91  <Field bol f>
	//   38   74:aload_0         
	//   39   75:getfield        #203 <Field bfb a>
	//   40   78:invokevirtual   #591 <Method void bol.b(bfb)>
		return;
	//   41   81:return          
		Exception exception;
		exception;
	//   42   82:astore_1        
		a.a();
	//   43   83:aload_0         
	//   44   84:getfield        #203 <Field bfb a>
	//   45   87:invokevirtual   #589 <Method void bfb.a()>
		f.b(a);
	//   46   90:aload_0         
	//   47   91:getfield        #91  <Field bol f>
	//   48   94:aload_0         
	//   49   95:getfield        #203 <Field bfb a>
	//   50   98:invokevirtual   #591 <Method void bol.b(bfb)>
		throw exception;
	//   51  101:aload_1         
	//   52  102:athrow          
	}

	public final boolean t()
	{
label0:
		{
			if(!super.t())
				break label0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #594 <Method boolean bhn.t()>
	//    2    4:ifeq            47
			if(!p)
	//*   3    7:aload_0         
	//*   4    8:getfield        #252 <Field boolean p>
	//*   5   11:ifne            38
			{
				Surface surface = n;
	//    6   14:aload_0         
	//    7   15:getfield        #266 <Field Surface n>
	//    8   18:astore_1        
				if((surface == null || m != surface) && ((bhn)this).A() != null)
					break label0;
	//    9   19:aload_1         
	//   10   20:ifnull          31
	//   11   23:aload_0         
	//   12   24:getfield        #268 <Field Surface m>
	//   13   27:aload_1         
	//   14   28:if_acmpeq       38
	//   15   31:aload_0         
	//   16   32:invokevirtual   #255 <Method MediaCodec bhn.A()>
	//   17   35:ifnonnull       47
			}
			q = 0x1L;
	//   18   38:aload_0         
	//   19   39:ldc2w           #116 <Long 0x1L>
	//   20   42:putfield        #121 <Field long q>
			return true;
	//   21   45:iconst_1        
	//   22   46:ireturn         
		}
		if(q == 0x1L)
	//*  23   47:aload_0         
	//*  24   48:getfield        #121 <Field long q>
	//*  25   51:ldc2w           #116 <Long 0x1L>
	//*  26   54:lcmp            
	//*  27   55:ifne            60
			return false;
	//   28   58:iconst_0        
	//   29   59:ireturn         
		if(SystemClock.elapsedRealtime() < q)
	//*  30   60:invokestatic    #155 <Method long SystemClock.elapsedRealtime()>
	//*  31   63:aload_0         
	//*  32   64:getfield        #121 <Field long q>
	//*  33   67:lcmp            
	//*  34   68:ifge            73
		{
			return true;
	//   35   71:iconst_1        
	//   36   72:ireturn         
		} else
		{
			q = 0x1L;
	//   37   73:aload_0         
	//   38   74:ldc2w           #116 <Long 0x1L>
	//   39   77:putfield        #121 <Field long q>
			return false;
	//   40   80:iconst_0        
	//   41   81:ireturn         
		}
	}

	final void v()
	{
		if(!p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #252 <Field boolean p>
	//*   2    4:ifne            23
		{
			p = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #252 <Field boolean p>
			f.a(m);
	//    6   12:aload_0         
	//    7   13:getfield        #91  <Field bol f>
	//    8   16:aload_0         
	//    9   17:getfield        #268 <Field Surface m>
	//   10   20:invokevirtual   #381 <Method void bol.a(Surface)>
		}
	//   11   23:return          
	}

	private static final int c[] = {
		1920, 1600, 1440, 1280, 960, 854, 640, 540, 480
	};
	private int A;
	private int B;
	private int C;
	private float D;
	private boolean E;
	private int F;
	private long G;
	private int H;
	boh b;
	private final Context d;
	private final boi e;
	private final bol f;
	private final long g;
	private final int h;
	private final boolean i;
	private final long j[];
	private zzfs k[];
	private bog l;
	private Surface m;
	private Surface n;
	private int o;
	private boolean p;
	private long q;
	private long r;
	private int s;
	private int t;
	private int u;
	private float v;
	private int w;
	private int x;
	private int y;
	private float z;

	static 
	{
	//    0    0:bipush          9
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:sipush          1920
	//    5    9:iastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:sipush          1600
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:sipush          1440
	//   13   21:iastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:sipush          1280
	//   17   27:iastore         
	//   18   28:dup             
	//   19   29:iconst_4        
	//   20   30:sipush          960
	//   21   33:iastore         
	//   22   34:dup             
	//   23   35:iconst_5        
	//   24   36:sipush          854
	//   25   39:iastore         
	//   26   40:dup             
	//   27   41:bipush          6
	//   28   43:sipush          640
	//   29   46:iastore         
	//   30   47:dup             
	//   31   48:bipush          7
	//   32   50:sipush          540
	//   33   53:iastore         
	//   34   54:dup             
	//   35   55:bipush          8
	//   36   57:sipush          480
	//   37   60:iastore         
	//   38   61:putstatic       #56  <Field int[] c>
	//*  39   64:return          
	}
}
