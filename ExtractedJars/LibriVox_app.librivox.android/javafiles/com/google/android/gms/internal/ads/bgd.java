// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfm, bge, bfy, bgf, 
//			bgb, bgi, bno, bnl, 
//			bfw, bnw, bdj, bfo, 
//			bgg, bft, bfx, bni, 
//			bfv, bfp, bgh, bfj, 
//			zzhp, bcr, bfq

public final class bgd
	implements bfm
{

	public bgd()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #109 <Method void bgd(int)>
	//    3    5:return          
	}

	public bgd(int i1)
	{
		this(((bgb) (new bfy())), i1);
	//    0    0:aload_0         
	//    1    1:new             #111 <Class bfy>
	//    2    4:dup             
	//    3    5:invokespecial   #112 <Method void bfy()>
	//    4    8:iload_1         
	//    5    9:invokespecial   #115 <Method void bgd(bgb, int)>
	//    6   12:return          
	}

	private bgd(bgb bgb1, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void Object()>
		t = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #117 <Long -1L>
	//    4    8:putfield        #120 <Field long t>
		u = 0x1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #121 <Long 0x1L>
	//    7   15:putfield        #124 <Field long u>
		v = 0x1L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #121 <Long 0x1L>
	//   10   22:putfield        #126 <Field long v>
		w = 0x1L;
	//   11   25:aload_0         
	//   12   26:ldc2w           #121 <Long 0x1L>
	//   13   29:putfield        #128 <Field long w>
		C = -1L;
	//   14   32:aload_0         
	//   15   33:ldc2w           #117 <Long -1L>
	//   16   36:putfield        #130 <Field long C>
		D = -1L;
	//   17   39:aload_0         
	//   18   40:ldc2w           #117 <Long -1L>
	//   19   43:putfield        #132 <Field long D>
		E = 0x1L;
	//   20   46:aload_0         
	//   21   47:ldc2w           #121 <Long 0x1L>
	//   22   50:putfield        #134 <Field long E>
		e = bgb1;
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:putfield        #136 <Field bgb e>
		e.a(((bgc) (new bgf(this, ((bge) (null))))));
	//   26   58:aload_0         
	//   27   59:getfield        #136 <Field bgb e>
	//   28   62:new             #138 <Class bgf>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:aconst_null     
	//   32   68:invokespecial   #141 <Method void bgf(bgd, bge)>
	//   33   71:invokeinterface #146 <Method void bgb.a(bgc)>
		boolean flag = true;
	//   34   76:iconst_1        
	//   35   77:istore_3        
		if((i1 & 1) != 0)
	//*  36   78:iload_2         
	//*  37   79:iconst_1        
	//*  38   80:iand            
	//*  39   81:ifne            87
	//*  40   84:goto            89
			flag = false;
	//   41   87:iconst_0        
	//   42   88:istore_3        
		h = flag;
	//   43   89:aload_0         
	//   44   90:iload_3         
	//   45   91:putfield        #148 <Field boolean h>
		f = new bgi();
	//   46   94:aload_0         
	//   47   95:new             #150 <Class bgi>
	//   48   98:dup             
	//   49   99:invokespecial   #151 <Method void bgi()>
	//   50  102:putfield        #153 <Field bgi f>
		g = new SparseArray();
	//   51  105:aload_0         
	//   52  106:new             #155 <Class SparseArray>
	//   53  109:dup             
	//   54  110:invokespecial   #156 <Method void SparseArray()>
	//   55  113:putfield        #158 <Field SparseArray g>
		k = new bno(4);
	//   56  116:aload_0         
	//   57  117:new             #160 <Class bno>
	//   58  120:dup             
	//   59  121:iconst_4        
	//   60  122:invokespecial   #161 <Method void bno(int)>
	//   61  125:putfield        #163 <Field bno k>
		l = new bno(ByteBuffer.allocate(4).putInt(-1).array());
	//   62  128:aload_0         
	//   63  129:new             #160 <Class bno>
	//   64  132:dup             
	//   65  133:iconst_4        
	//   66  134:invokestatic    #169 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   67  137:iconst_m1       
	//   68  138:invokevirtual   #172 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   69  141:invokevirtual   #176 <Method byte[] ByteBuffer.array()>
	//   70  144:invokespecial   #179 <Method void bno(byte[])>
	//   71  147:putfield        #181 <Field bno l>
		m = new bno(4);
	//   72  150:aload_0         
	//   73  151:new             #160 <Class bno>
	//   74  154:dup             
	//   75  155:iconst_4        
	//   76  156:invokespecial   #161 <Method void bno(int)>
	//   77  159:putfield        #183 <Field bno m>
		i = new bno(bnl.a);
	//   78  162:aload_0         
	//   79  163:new             #160 <Class bno>
	//   80  166:dup             
	//   81  167:getstatic       #187 <Field byte[] bnl.a>
	//   82  170:invokespecial   #179 <Method void bno(byte[])>
	//   83  173:putfield        #189 <Field bno i>
		j = new bno(4);
	//   84  176:aload_0         
	//   85  177:new             #160 <Class bno>
	//   86  180:dup             
	//   87  181:iconst_4        
	//   88  182:invokespecial   #161 <Method void bno(int)>
	//   89  185:putfield        #191 <Field bno j>
		n = new bno();
	//   90  188:aload_0         
	//   91  189:new             #160 <Class bno>
	//   92  192:dup             
	//   93  193:invokespecial   #192 <Method void bno()>
	//   94  196:putfield        #194 <Field bno n>
		o = new bno();
	//   95  199:aload_0         
	//   96  200:new             #160 <Class bno>
	//   97  203:dup             
	//   98  204:invokespecial   #192 <Method void bno()>
	//   99  207:putfield        #196 <Field bno o>
		p = new bno(8);
	//  100  210:aload_0         
	//  101  211:new             #160 <Class bno>
	//  102  214:dup             
	//  103  215:bipush          8
	//  104  217:invokespecial   #161 <Method void bno(int)>
	//  105  220:putfield        #198 <Field bno p>
		q = new bno();
	//  106  223:aload_0         
	//  107  224:new             #160 <Class bno>
	//  108  227:dup             
	//  109  228:invokespecial   #192 <Method void bno()>
	//  110  231:putfield        #200 <Field bno q>
	//  111  234:return          
	}

	static int a(int i1)
	{
		switch(i1)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    78: default 636
	//	               131: 646
	//	               134: 644
	//	               136: 646
	//	               155: 646
	//	               159: 646
	//	               160: 642
	//	               161: 640
	//	               163: 640
	//	               174: 642
	//	               176: 646
	//	               179: 646
	//	               181: 638
	//	               183: 642
	//	               186: 646
	//	               187: 642
	//	               215: 646
	//	               224: 642
	//	               225: 642
	//	               231: 646
	//	               241: 646
	//	               251: 646
	//	               16980: 646
	//	               16981: 640
	//	               17026: 644
	//	               17029: 646
	//	               17143: 646
	//	               17545: 638
	//	               18401: 646
	//	               18402: 640
	//	               18407: 642
	//	               18408: 646
	//	               19899: 642
	//	               20529: 646
	//	               20530: 646
	//	               20532: 642
	//	               20533: 642
	//	               21419: 640
	//	               21420: 646
	//	               21432: 646
	//	               21680: 646
	//	               21682: 646
	//	               21690: 646
	//	               21930: 646
	//	               21936: 642
	//	               21945: 646
	//	               21946: 646
	//	               21947: 646
	//	               21948: 646
	//	               21949: 646
	//	               21968: 642
	//	               21969: 638
	//	               21970: 638
	//	               21971: 638
	//	               21972: 638
	//	               21973: 638
	//	               21974: 638
	//	               21975: 638
	//	               21976: 638
	//	               21977: 638
	//	               21978: 638
	//	               22186: 646
	//	               22203: 646
	//	               25152: 642
	//	               25188: 646
	//	               25506: 640
	//	               28032: 642
	//	               30320: 642
	//	               30322: 640
	//	               2274716: 644
	//	               2352003: 646
	//	               2807729: 646
	//	               290298740: 642
	//	               357149030: 642
	//	               374648427: 642
	//	               408125543: 642
	//	               440786851: 642
	//	               475249515: 642
	//	               524531317: 642
		default:
			return 0;
	//    2  636:iconst_0        
	//    3  637:ireturn         

		case 181: 
		case 17545: 
		case 21969: 
		case 21970: 
		case 21971: 
		case 21972: 
		case 21973: 
		case 21974: 
		case 21975: 
		case 21976: 
		case 21977: 
		case 21978: 
			return 5;
	//    4  638:iconst_5        
	//    5  639:ireturn         

		case 161: 
		case 163: 
		case 16981: 
		case 18402: 
		case 21419: 
		case 25506: 
		case 30322: 
			return 4;
	//    6  640:iconst_4        
	//    7  641:ireturn         

		case 160: 
		case 174: 
		case 183: 
		case 187: 
		case 224: 
		case 225: 
		case 18407: 
		case 19899: 
		case 20532: 
		case 20533: 
		case 21936: 
		case 21968: 
		case 25152: 
		case 28032: 
		case 30320: 
		case 290298740: 
		case 357149030: 
		case 374648427: 
		case 408125543: 
		case 440786851: 
		case 475249515: 
		case 524531317: 
			return 1;
	//    8  642:iconst_1        
	//    9  643:ireturn         

		case 134: 
		case 17026: 
		case 2274716: 
			return 3;
	//   10  644:iconst_3        
	//   11  645:ireturn         

		case 131: 
		case 136: 
		case 155: 
		case 159: 
		case 176: 
		case 179: 
		case 186: 
		case 215: 
		case 231: 
		case 241: 
		case 251: 
		case 16980: 
		case 17029: 
		case 17143: 
		case 18401: 
		case 18408: 
		case 20529: 
		case 20530: 
		case 21420: 
		case 21432: 
		case 21680: 
		case 21682: 
		case 21690: 
		case 21930: 
		case 21945: 
		case 21946: 
		case 21947: 
		case 21948: 
		case 21949: 
		case 22186: 
		case 22203: 
		case 25188: 
		case 2352003: 
		case 2807729: 
			return 2;
	//   12  646:iconst_2        
	//   13  647:ireturn         
		}
	}

	private final int a(bfo bfo1, bfw bfw1, int i1)
	{
		int j1 = n.b();
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field bno n>
	//    2    4:invokevirtual   #205 <Method int bno.b()>
	//    3    7:istore          4
		if(j1 > 0)
	//*   4    9:iload           4
	//*   5   11:ifle            35
		{
			i1 = Math.min(i1, j1);
	//    6   14:iload_3         
	//    7   15:iload           4
	//    8   17:invokestatic    #211 <Method int Math.min(int, int)>
	//    9   20:istore_3        
			bfw1.a(n, i1);
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:getfield        #194 <Field bno n>
	//   13   26:iload_3         
	//   14   27:invokeinterface #216 <Method void bfw.a(bno, int)>
		} else
	//*  15   32:goto            45
		{
			i1 = bfw1.a(bfo1, i1, false);
	//   16   35:aload_2         
	//   17   36:aload_1         
	//   18   37:iload_3         
	//   19   38:iconst_0        
	//   20   39:invokeinterface #219 <Method int bfw.a(bfo, int, boolean)>
	//   21   44:istore_3        
		}
		R = R + i1;
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #221 <Field int R>
	//   25   50:iload_3         
	//   26   51:iadd            
	//   27   52:putfield        #221 <Field int R>
		Z = Z + i1;
	//   28   55:aload_0         
	//   29   56:aload_0         
	//   30   57:getfield        #223 <Field int Z>
	//   31   60:iload_3         
	//   32   61:iadd            
	//   33   62:putfield        #223 <Field int Z>
		return i1;
	//   34   65:iload_3         
	//   35   66:ireturn         
	}

	private final long a(long l1)
	{
		long l2 = u;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field long u>
	//    2    4:lstore_3        
		if(l2 != 0x1L)
	//*   3    5:lload_3         
	//*   4    6:ldc2w           #121 <Long 0x1L>
	//*   5    9:lcmp            
	//*   6   10:ifeq            22
			return bnw.a(l1, l2, 1000L);
	//    7   13:lload_1         
	//    8   14:lload_3         
	//    9   15:ldc2w           #225 <Long 1000L>
	//   10   18:invokestatic    #231 <Method long bnw.a(long, long, long)>
	//   11   21:lreturn         
		else
			throw new bdj("Can't scale timecode prior to timecodeScale being set.");
	//   12   22:new             #233 <Class bdj>
	//   13   25:dup             
	//   14   26:ldc1            #235 <String "Can't scale timecode prior to timecodeScale being set.">
	//   15   28:invokespecial   #238 <Method void bdj(String)>
	//   16   31:athrow          
	}

	static UUID a()
	{
		return d;
	//    0    0:getstatic       #105 <Field UUID d>
	//    1    3:areturn         
	}

	private final void a(bfo bfo1, int i1)
	{
		if(k.c() >= i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field bno k>
	//*   2    4:invokevirtual   #242 <Method int bno.c()>
	//*   3    7:iload_2         
	//*   4    8:icmplt          12
			return;
	//    5   11:return          
		if(k.e() < i1)
	//*   6   12:aload_0         
	//*   7   13:getfield        #163 <Field bno k>
	//*   8   16:invokevirtual   #244 <Method int bno.e()>
	//*   9   19:iload_2         
	//*  10   20:icmpge          60
		{
			bno bno1 = k;
	//   11   23:aload_0         
	//   12   24:getfield        #163 <Field bno k>
	//   13   27:astore_3        
			bno1.a(Arrays.copyOf(bno1.a, Math.max(k.a.length << 1, i1)), k.c());
	//   14   28:aload_3         
	//   15   29:aload_3         
	//   16   30:getfield        #245 <Field byte[] bno.a>
	//   17   33:aload_0         
	//   18   34:getfield        #163 <Field bno k>
	//   19   37:getfield        #245 <Field byte[] bno.a>
	//   20   40:arraylength     
	//   21   41:iconst_1        
	//   22   42:ishl            
	//   23   43:iload_2         
	//   24   44:invokestatic    #248 <Method int Math.max(int, int)>
	//   25   47:invokestatic    #254 <Method byte[] Arrays.copyOf(byte[], int)>
	//   26   50:aload_0         
	//   27   51:getfield        #163 <Field bno k>
	//   28   54:invokevirtual   #242 <Method int bno.c()>
	//   29   57:invokevirtual   #257 <Method void bno.a(byte[], int)>
		}
		bfo1.b(k.a, k.c(), i1 - k.c());
	//   30   60:aload_1         
	//   31   61:aload_0         
	//   32   62:getfield        #163 <Field bno k>
	//   33   65:getfield        #245 <Field byte[] bno.a>
	//   34   68:aload_0         
	//   35   69:getfield        #163 <Field bno k>
	//   36   72:invokevirtual   #242 <Method int bno.c()>
	//   37   75:iload_2         
	//   38   76:aload_0         
	//   39   77:getfield        #163 <Field bno k>
	//   40   80:invokevirtual   #242 <Method int bno.c()>
	//   41   83:isub            
	//   42   84:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
		k.b(i1);
	//   43   89:aload_0         
	//   44   90:getfield        #163 <Field bno k>
	//   45   93:iload_2         
	//   46   94:invokevirtual   #264 <Method void bno.b(int)>
	//   47   97:return          
	}

	private final void a(bfo bfo1, bgg bgg1, int i1)
	{
		if("S_TEXT/UTF8".equals(((Object) (bgg1.a))))
	//*   0    0:ldc2            #267 <String "S_TEXT/UTF8">
	//*   1    3:aload_2         
	//*   2    4:getfield        #272 <Field String bgg.a>
	//*   3    7:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*   4   10:ifeq            86
		{
			int j1 = b.length + i1;
	//    5   13:getstatic       #92  <Field byte[] b>
	//    6   16:arraylength     
	//    7   17:iload_3         
	//    8   18:iadd            
	//    9   19:istore          5
			if(o.e() < j1)
	//*  10   21:aload_0         
	//*  11   22:getfield        #196 <Field bno o>
	//*  12   25:invokevirtual   #244 <Method int bno.e()>
	//*  13   28:iload           5
	//*  14   30:icmpge          50
				o.a = Arrays.copyOf(b, j1 + i1);
	//   15   33:aload_0         
	//   16   34:getfield        #196 <Field bno o>
	//   17   37:getstatic       #92  <Field byte[] b>
	//   18   40:iload           5
	//   19   42:iload_3         
	//   20   43:iadd            
	//   21   44:invokestatic    #254 <Method byte[] Arrays.copyOf(byte[], int)>
	//   22   47:putfield        #245 <Field byte[] bno.a>
			bfo1.b(o.a, b.length, i1);
	//   23   50:aload_1         
	//   24   51:aload_0         
	//   25   52:getfield        #196 <Field bno o>
	//   26   55:getfield        #245 <Field byte[] bno.a>
	//   27   58:getstatic       #92  <Field byte[] b>
	//   28   61:arraylength     
	//   29   62:iload_3         
	//   30   63:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
			o.c(0);
	//   31   68:aload_0         
	//   32   69:getfield        #196 <Field bno o>
	//   33   72:iconst_0        
	//   34   73:invokevirtual   #280 <Method void bno.c(int)>
			o.b(j1);
	//   35   76:aload_0         
	//   36   77:getfield        #196 <Field bno o>
	//   37   80:iload           5
	//   38   82:invokevirtual   #264 <Method void bno.b(int)>
			return;
	//   39   85:return          
		}
		bfw bfw1 = bgg1.N;
	//   40   86:aload_2         
	//   41   87:getfield        #283 <Field bfw bgg.N>
	//   42   90:astore          10
		if(!S)
	//*  43   92:aload_0         
	//*  44   93:getfield        #285 <Field boolean S>
	//*  45   96:ifne            759
		{
			if(bgg1.e)
	//*  46   99:aload_2         
	//*  47  100:getfield        #287 <Field boolean bgg.e>
	//*  48  103:ifeq            731
			{
				Q = Q & 0xbfffffff;
	//   49  106:aload_0         
	//   50  107:aload_0         
	//   51  108:getfield        #289 <Field int Q>
	//   52  111:ldc2            #290 <Int 0xbfffffff>
	//   53  114:iand            
	//   54  115:putfield        #289 <Field int Q>
				boolean flag1 = T;
	//   55  118:aload_0         
	//   56  119:getfield        #292 <Field boolean T>
	//   57  122:istore          9
				char c1 = '\200';
	//   58  124:sipush          128
	//   59  127:istore          6
				if(!flag1)
	//*  60  129:iload           9
	//*  61  131:ifne            210
				{
					bfo1.b(k.a, 0, 1);
	//   62  134:aload_1         
	//   63  135:aload_0         
	//   64  136:getfield        #163 <Field bno k>
	//   65  139:getfield        #245 <Field byte[] bno.a>
	//   66  142:iconst_0        
	//   67  143:iconst_1        
	//   68  144:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
					R = R + 1;
	//   69  149:aload_0         
	//   70  150:aload_0         
	//   71  151:getfield        #221 <Field int R>
	//   72  154:iconst_1        
	//   73  155:iadd            
	//   74  156:putfield        #221 <Field int R>
					if((k.a[0] & 0x80) != 128)
	//*  75  159:aload_0         
	//*  76  160:getfield        #163 <Field bno k>
	//*  77  163:getfield        #245 <Field byte[] bno.a>
	//*  78  166:iconst_0        
	//*  79  167:baload          
	//*  80  168:sipush          128
	//*  81  171:iand            
	//*  82  172:sipush          128
	//*  83  175:icmpeq          199
					{
						W = k.a[0];
	//   84  178:aload_0         
	//   85  179:aload_0         
	//   86  180:getfield        #163 <Field bno k>
	//   87  183:getfield        #245 <Field byte[] bno.a>
	//   88  186:iconst_0        
	//   89  187:baload          
	//   90  188:putfield        #294 <Field byte W>
						T = true;
	//   91  191:aload_0         
	//   92  192:iconst_1        
	//   93  193:putfield        #292 <Field boolean T>
					} else
	//*  94  196:goto            210
					{
						throw new bdj("Extension bit is set in signal byte");
	//   95  199:new             #233 <Class bdj>
	//   96  202:dup             
	//   97  203:ldc2            #296 <String "Extension bit is set in signal byte">
	//   98  206:invokespecial   #238 <Method void bdj(String)>
	//   99  209:athrow          
					}
				}
				byte byte0 = W;
	//  100  210:aload_0         
	//  101  211:getfield        #294 <Field byte W>
	//  102  214:istore          5
				if((byte0 & 1) == 1)
	//* 103  216:iload           5
	//* 104  218:iconst_1        
	//* 105  219:iand            
	//* 106  220:iconst_1        
	//* 107  221:icmpne          754
				{
					boolean flag;
					if((byte0 & 2) == 2)
	//* 108  224:iload           5
	//* 109  226:iconst_2        
	//* 110  227:iand            
	//* 111  228:iconst_2        
	//* 112  229:icmpne          238
						flag = true;
	//  113  232:iconst_1        
	//  114  233:istore          5
					else
	//* 115  235:goto            241
						flag = false;
	//  116  238:iconst_0        
	//  117  239:istore          5
					Q = Q | 0x40000000;
	//  118  241:aload_0         
	//  119  242:aload_0         
	//  120  243:getfield        #289 <Field int Q>
	//  121  246:ldc2            #297 <Int 0x40000000>
	//  122  249:ior             
	//  123  250:putfield        #289 <Field int Q>
					if(!U)
	//* 124  253:aload_0         
	//* 125  254:getfield        #299 <Field boolean U>
	//* 126  257:ifne            384
					{
						bfo1.b(p.a, 0, 8);
	//  127  260:aload_1         
	//  128  261:aload_0         
	//  129  262:getfield        #198 <Field bno p>
	//  130  265:getfield        #245 <Field byte[] bno.a>
	//  131  268:iconst_0        
	//  132  269:bipush          8
	//  133  271:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
						R = R + 8;
	//  134  276:aload_0         
	//  135  277:aload_0         
	//  136  278:getfield        #221 <Field int R>
	//  137  281:bipush          8
	//  138  283:iadd            
	//  139  284:putfield        #221 <Field int R>
						U = true;
	//  140  287:aload_0         
	//  141  288:iconst_1        
	//  142  289:putfield        #299 <Field boolean U>
						byte abyte0[] = k.a;
	//  143  292:aload_0         
	//  144  293:getfield        #163 <Field bno k>
	//  145  296:getfield        #245 <Field byte[] bno.a>
	//  146  299:astore          11
						if(!flag)
	//* 147  301:iload           5
	//* 148  303:ifeq            309
	//* 149  306:goto            312
							c1 = '\0';
	//  150  309:iconst_0        
	//  151  310:istore          6
						abyte0[0] = (byte)(c1 | 8);
	//  152  312:aload           11
	//  153  314:iconst_0        
	//  154  315:iload           6
	//  155  317:bipush          8
	//  156  319:ior             
	//  157  320:int2byte        
	//  158  321:bastore         
						k.c(0);
	//  159  322:aload_0         
	//  160  323:getfield        #163 <Field bno k>
	//  161  326:iconst_0        
	//  162  327:invokevirtual   #280 <Method void bno.c(int)>
						bfw1.a(k, 1);
	//  163  330:aload           10
	//  164  332:aload_0         
	//  165  333:getfield        #163 <Field bno k>
	//  166  336:iconst_1        
	//  167  337:invokeinterface #216 <Method void bfw.a(bno, int)>
						Z = Z + 1;
	//  168  342:aload_0         
	//  169  343:aload_0         
	//  170  344:getfield        #223 <Field int Z>
	//  171  347:iconst_1        
	//  172  348:iadd            
	//  173  349:putfield        #223 <Field int Z>
						p.c(0);
	//  174  352:aload_0         
	//  175  353:getfield        #198 <Field bno p>
	//  176  356:iconst_0        
	//  177  357:invokevirtual   #280 <Method void bno.c(int)>
						bfw1.a(p, 8);
	//  178  360:aload           10
	//  179  362:aload_0         
	//  180  363:getfield        #198 <Field bno p>
	//  181  366:bipush          8
	//  182  368:invokeinterface #216 <Method void bfw.a(bno, int)>
						Z = Z + 8;
	//  183  373:aload_0         
	//  184  374:aload_0         
	//  185  375:getfield        #223 <Field int Z>
	//  186  378:bipush          8
	//  187  380:iadd            
	//  188  381:putfield        #223 <Field int Z>
					}
					if(flag)
	//* 189  384:iload           5
	//* 190  386:ifeq            754
					{
						if(!V)
	//* 191  389:aload_0         
	//* 192  390:getfield        #301 <Field boolean V>
	//* 193  393:ifne            445
						{
							bfo1.b(k.a, 0, 1);
	//  194  396:aload_1         
	//  195  397:aload_0         
	//  196  398:getfield        #163 <Field bno k>
	//  197  401:getfield        #245 <Field byte[] bno.a>
	//  198  404:iconst_0        
	//  199  405:iconst_1        
	//  200  406:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
							R = R + 1;
	//  201  411:aload_0         
	//  202  412:aload_0         
	//  203  413:getfield        #221 <Field int R>
	//  204  416:iconst_1        
	//  205  417:iadd            
	//  206  418:putfield        #221 <Field int R>
							k.c(0);
	//  207  421:aload_0         
	//  208  422:getfield        #163 <Field bno k>
	//  209  425:iconst_0        
	//  210  426:invokevirtual   #280 <Method void bno.c(int)>
							X = k.f();
	//  211  429:aload_0         
	//  212  430:aload_0         
	//  213  431:getfield        #163 <Field bno k>
	//  214  434:invokevirtual   #303 <Method int bno.f()>
	//  215  437:putfield        #305 <Field int X>
							V = true;
	//  216  440:aload_0         
	//  217  441:iconst_1        
	//  218  442:putfield        #301 <Field boolean V>
						}
						int k1 = X << 2;
	//  219  445:aload_0         
	//  220  446:getfield        #305 <Field int X>
	//  221  449:iconst_2        
	//  222  450:ishl            
	//  223  451:istore          5
						k.a(k1);
	//  224  453:aload_0         
	//  225  454:getfield        #163 <Field bno k>
	//  226  457:iload           5
	//  227  459:invokevirtual   #307 <Method void bno.a(int)>
						bfo1.b(k.a, 0, k1);
	//  228  462:aload_1         
	//  229  463:aload_0         
	//  230  464:getfield        #163 <Field bno k>
	//  231  467:getfield        #245 <Field byte[] bno.a>
	//  232  470:iconst_0        
	//  233  471:iload           5
	//  234  473:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
						R = R + k1;
	//  235  478:aload_0         
	//  236  479:aload_0         
	//  237  480:getfield        #221 <Field int R>
	//  238  483:iload           5
	//  239  485:iadd            
	//  240  486:putfield        #221 <Field int R>
						short word0 = (short)(X / 2 + 1);
	//  241  489:aload_0         
	//  242  490:getfield        #305 <Field int X>
	//  243  493:iconst_2        
	//  244  494:idiv            
	//  245  495:iconst_1        
	//  246  496:iadd            
	//  247  497:int2short       
	//  248  498:istore          4
						int j3 = word0 * 6 + 2;
	//  249  500:iload           4
	//  250  502:bipush          6
	//  251  504:imul            
	//  252  505:iconst_2        
	//  253  506:iadd            
	//  254  507:istore          8
						ByteBuffer bytebuffer = r;
	//  255  509:aload_0         
	//  256  510:getfield        #309 <Field ByteBuffer r>
	//  257  513:astore          11
						if(bytebuffer == null || bytebuffer.capacity() < j3)
	//* 258  515:aload           11
	//* 259  517:ifnull          530
	//* 260  520:aload           11
	//* 261  522:invokevirtual   #312 <Method int ByteBuffer.capacity()>
	//* 262  525:iload           8
	//* 263  527:icmpge          539
							r = ByteBuffer.allocate(j3);
	//  264  530:aload_0         
	//  265  531:iload           8
	//  266  533:invokestatic    #169 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  267  536:putfield        #309 <Field ByteBuffer r>
						r.position(0);
	//  268  539:aload_0         
	//  269  540:getfield        #309 <Field ByteBuffer r>
	//  270  543:iconst_0        
	//  271  544:invokevirtual   #316 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  272  547:pop             
						r.putShort(word0);
	//  273  548:aload_0         
	//  274  549:getfield        #309 <Field ByteBuffer r>
	//  275  552:iload           4
	//  276  554:invokevirtual   #320 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  277  557:pop             
						k1 = 0;
	//  278  558:iconst_0        
	//  279  559:istore          5
						int j2 = 0;
	//  280  561:iconst_0        
	//  281  562:istore          6
						int l2;
						do
						{
							l2 = X;
	//  282  564:aload_0         
	//  283  565:getfield        #305 <Field int X>
	//  284  568:istore          7
							if(k1 >= l2)
								break;
	//  285  570:iload           5
	//  286  572:iload           7
	//  287  574:icmpge          636
							l2 = k.o();
	//  288  577:aload_0         
	//  289  578:getfield        #163 <Field bno k>
	//  290  581:invokevirtual   #322 <Method int bno.o()>
	//  291  584:istore          7
							if(k1 % 2 == 0)
	//* 292  586:iload           5
	//* 293  588:iconst_2        
	//* 294  589:irem            
	//* 295  590:ifne            610
								r.putShort((short)(l2 - j2));
	//  296  593:aload_0         
	//  297  594:getfield        #309 <Field ByteBuffer r>
	//  298  597:iload           7
	//  299  599:iload           6
	//  300  601:isub            
	//  301  602:int2short       
	//  302  603:invokevirtual   #320 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  303  606:pop             
							else
	//* 304  607:goto            623
								r.putInt(l2 - j2);
	//  305  610:aload_0         
	//  306  611:getfield        #309 <Field ByteBuffer r>
	//  307  614:iload           7
	//  308  616:iload           6
	//  309  618:isub            
	//  310  619:invokevirtual   #172 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  311  622:pop             
							k1++;
	//  312  623:iload           5
	//  313  625:iconst_1        
	//  314  626:iadd            
	//  315  627:istore          5
							j2 = l2;
	//  316  629:iload           7
	//  317  631:istore          6
						} while(true);
	//  318  633:goto            564
						k1 = i1 - R - j2;
	//  319  636:iload_3         
	//  320  637:aload_0         
	//  321  638:getfield        #221 <Field int R>
	//  322  641:isub            
	//  323  642:iload           6
	//  324  644:isub            
	//  325  645:istore          5
						if(l2 % 2 == 1)
	//* 326  647:iload           7
	//* 327  649:iconst_2        
	//* 328  650:irem            
	//* 329  651:iconst_1        
	//* 330  652:icmpne          668
						{
							r.putInt(k1);
	//  331  655:aload_0         
	//  332  656:getfield        #309 <Field ByteBuffer r>
	//  333  659:iload           5
	//  334  661:invokevirtual   #172 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  335  664:pop             
						} else
	//* 336  665:goto            688
						{
							r.putShort((short)k1);
	//  337  668:aload_0         
	//  338  669:getfield        #309 <Field ByteBuffer r>
	//  339  672:iload           5
	//  340  674:int2short       
	//  341  675:invokevirtual   #320 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  342  678:pop             
							r.putInt(0);
	//  343  679:aload_0         
	//  344  680:getfield        #309 <Field ByteBuffer r>
	//  345  683:iconst_0        
	//  346  684:invokevirtual   #172 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  347  687:pop             
						}
						q.a(r.array(), j3);
	//  348  688:aload_0         
	//  349  689:getfield        #200 <Field bno q>
	//  350  692:aload_0         
	//  351  693:getfield        #309 <Field ByteBuffer r>
	//  352  696:invokevirtual   #176 <Method byte[] ByteBuffer.array()>
	//  353  699:iload           8
	//  354  701:invokevirtual   #257 <Method void bno.a(byte[], int)>
						bfw1.a(q, j3);
	//  355  704:aload           10
	//  356  706:aload_0         
	//  357  707:getfield        #200 <Field bno q>
	//  358  710:iload           8
	//  359  712:invokeinterface #216 <Method void bfw.a(bno, int)>
						Z = Z + j3;
	//  360  717:aload_0         
	//  361  718:aload_0         
	//  362  719:getfield        #223 <Field int Z>
	//  363  722:iload           8
	//  364  724:iadd            
	//  365  725:putfield        #223 <Field int Z>
					}
				}
			} else
	//* 366  728:goto            754
			if(bgg1.f != null)
	//* 367  731:aload_2         
	//* 368  732:getfield        #324 <Field byte[] bgg.f>
	//* 369  735:ifnull          754
				n.a(bgg1.f, bgg1.f.length);
	//  370  738:aload_0         
	//  371  739:getfield        #194 <Field bno n>
	//  372  742:aload_2         
	//  373  743:getfield        #324 <Field byte[] bgg.f>
	//  374  746:aload_2         
	//  375  747:getfield        #324 <Field byte[] bgg.f>
	//  376  750:arraylength     
	//  377  751:invokevirtual   #257 <Method void bno.a(byte[], int)>
			S = true;
	//  378  754:aload_0         
	//  379  755:iconst_1        
	//  380  756:putfield        #285 <Field boolean S>
		}
		i1 += n.c();
	//  381  759:iload_3         
	//  382  760:aload_0         
	//  383  761:getfield        #194 <Field bno n>
	//  384  764:invokevirtual   #242 <Method int bno.c()>
	//  385  767:iadd            
	//  386  768:istore_3        
		if(!"V_MPEG4/ISO/AVC".equals(((Object) (bgg1.a))) && !"V_MPEGH/ISO/HEVC".equals(((Object) (bgg1.a))))
	//* 387  769:ldc2            #326 <String "V_MPEG4/ISO/AVC">
	//* 388  772:aload_2         
	//* 389  773:getfield        #272 <Field String bgg.a>
	//* 390  776:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 391  779:ifne            825
	//* 392  782:ldc2            #328 <String "V_MPEGH/ISO/HEVC">
	//* 393  785:aload_2         
	//* 394  786:getfield        #272 <Field String bgg.a>
	//* 395  789:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 396  792:ifeq            798
	//* 397  795:goto            825
		{
			do
			{
				int l1 = R;
	//  398  798:aload_0         
	//  399  799:getfield        #221 <Field int R>
	//  400  802:istore          5
				if(l1 >= i1)
					break;
	//  401  804:iload           5
	//  402  806:iload_3         
	//  403  807:icmpge          1014
				a(bfo1, bfw1, i1 - l1);
	//  404  810:aload_0         
	//  405  811:aload_1         
	//  406  812:aload           10
	//  407  814:iload_3         
	//  408  815:iload           5
	//  409  817:isub            
	//  410  818:invokespecial   #330 <Method int a(bfo, bfw, int)>
	//  411  821:pop             
			} while(true);
	//  412  822:goto            798
		} else
		{
			byte abyte1[] = j.a;
	//  413  825:aload_0         
	//  414  826:getfield        #191 <Field bno j>
	//  415  829:getfield        #245 <Field byte[] bno.a>
	//  416  832:astore          11
			abyte1[0] = 0;
	//  417  834:aload           11
	//  418  836:iconst_0        
	//  419  837:iconst_0        
	//  420  838:bastore         
			abyte1[1] = 0;
	//  421  839:aload           11
	//  422  841:iconst_1        
	//  423  842:iconst_0        
	//  424  843:bastore         
			abyte1[2] = 0;
	//  425  844:aload           11
	//  426  846:iconst_2        
	//  427  847:iconst_0        
	//  428  848:bastore         
			int i2 = bgg1.O;
	//  429  849:aload_2         
	//  430  850:getfield        #332 <Field int bgg.O>
	//  431  853:istore          5
			int k2 = 4 - bgg1.O;
	//  432  855:iconst_4        
	//  433  856:aload_2         
	//  434  857:getfield        #332 <Field int bgg.O>
	//  435  860:isub            
	//  436  861:istore          6
			while(R < i1) 
	//* 437  863:aload_0         
	//* 438  864:getfield        #221 <Field int R>
	//* 439  867:iload_3         
	//* 440  868:icmpge          1014
			{
				int i3 = Y;
	//  441  871:aload_0         
	//  442  872:getfield        #334 <Field int Y>
	//  443  875:istore          7
				if(i3 == 0)
	//* 444  877:iload           7
	//* 445  879:ifne            995
				{
					i3 = Math.min(i2, n.b());
	//  446  882:iload           5
	//  447  884:aload_0         
	//  448  885:getfield        #194 <Field bno n>
	//  449  888:invokevirtual   #205 <Method int bno.b()>
	//  450  891:invokestatic    #211 <Method int Math.min(int, int)>
	//  451  894:istore          7
					bfo1.b(abyte1, k2 + i3, i2 - i3);
	//  452  896:aload_1         
	//  453  897:aload           11
	//  454  899:iload           6
	//  455  901:iload           7
	//  456  903:iadd            
	//  457  904:iload           5
	//  458  906:iload           7
	//  459  908:isub            
	//  460  909:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
					if(i3 > 0)
	//* 461  914:iload           7
	//* 462  916:ifle            932
						n.a(abyte1, k2, i3);
	//  463  919:aload_0         
	//  464  920:getfield        #194 <Field bno n>
	//  465  923:aload           11
	//  466  925:iload           6
	//  467  927:iload           7
	//  468  929:invokevirtual   #336 <Method void bno.a(byte[], int, int)>
					R = R + i2;
	//  469  932:aload_0         
	//  470  933:aload_0         
	//  471  934:getfield        #221 <Field int R>
	//  472  937:iload           5
	//  473  939:iadd            
	//  474  940:putfield        #221 <Field int R>
					j.c(0);
	//  475  943:aload_0         
	//  476  944:getfield        #191 <Field bno j>
	//  477  947:iconst_0        
	//  478  948:invokevirtual   #280 <Method void bno.c(int)>
					Y = j.o();
	//  479  951:aload_0         
	//  480  952:aload_0         
	//  481  953:getfield        #191 <Field bno j>
	//  482  956:invokevirtual   #322 <Method int bno.o()>
	//  483  959:putfield        #334 <Field int Y>
					i.c(0);
	//  484  962:aload_0         
	//  485  963:getfield        #189 <Field bno i>
	//  486  966:iconst_0        
	//  487  967:invokevirtual   #280 <Method void bno.c(int)>
					bfw1.a(i, 4);
	//  488  970:aload           10
	//  489  972:aload_0         
	//  490  973:getfield        #189 <Field bno i>
	//  491  976:iconst_4        
	//  492  977:invokeinterface #216 <Method void bfw.a(bno, int)>
					Z = Z + 4;
	//  493  982:aload_0         
	//  494  983:aload_0         
	//  495  984:getfield        #223 <Field int Z>
	//  496  987:iconst_4        
	//  497  988:iadd            
	//  498  989:putfield        #223 <Field int Z>
				} else
	//* 499  992:goto            863
				{
					Y = i3 - a(bfo1, bfw1, i3);
	//  500  995:aload_0         
	//  501  996:iload           7
	//  502  998:aload_0         
	//  503  999:aload_1         
	//  504 1000:aload           10
	//  505 1002:iload           7
	//  506 1004:invokespecial   #330 <Method int a(bfo, bfw, int)>
	//  507 1007:isub            
	//  508 1008:putfield        #334 <Field int Y>
				}
			}
		}
	//* 509 1011:goto            863
		if("A_VORBIS".equals(((Object) (bgg1.a))))
	//* 510 1014:ldc2            #338 <String "A_VORBIS">
	//* 511 1017:aload_2         
	//* 512 1018:getfield        #272 <Field String bgg.a>
	//* 513 1021:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 514 1024:ifeq            1057
		{
			l.c(0);
	//  515 1027:aload_0         
	//  516 1028:getfield        #181 <Field bno l>
	//  517 1031:iconst_0        
	//  518 1032:invokevirtual   #280 <Method void bno.c(int)>
			bfw1.a(l, 4);
	//  519 1035:aload           10
	//  520 1037:aload_0         
	//  521 1038:getfield        #181 <Field bno l>
	//  522 1041:iconst_4        
	//  523 1042:invokeinterface #216 <Method void bfw.a(bno, int)>
			Z = Z + 4;
	//  524 1047:aload_0         
	//  525 1048:aload_0         
	//  526 1049:getfield        #223 <Field int Z>
	//  527 1052:iconst_4        
	//  528 1053:iadd            
	//  529 1054:putfield        #223 <Field int Z>
		}
	//  530 1057:return          
	}

	private final void a(bgg bgg1, long l1)
	{
		if("S_TEXT/UTF8".equals(((Object) (bgg1.a))))
	//*   0    0:ldc2            #267 <String "S_TEXT/UTF8">
	//*   1    3:aload_1         
	//*   2    4:getfield        #272 <Field String bgg.a>
	//*   3    7:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*   4   10:ifeq            217
		{
			byte abyte1[] = o.a;
	//    5   13:aload_0         
	//    6   14:getfield        #196 <Field bno o>
	//    7   17:getfield        #245 <Field byte[] bno.a>
	//    8   20:astore          11
			long l2 = K;
	//    9   22:aload_0         
	//   10   23:getfield        #341 <Field long K>
	//   11   26:lstore          8
			byte abyte0[];
			if(l2 == 0x1L)
	//*  12   28:lload           8
	//*  13   30:ldc2w           #121 <Long 0x1L>
	//*  14   33:lcmp            
	//*  15   34:ifne            45
			{
				abyte0 = c;
	//   16   37:getstatic       #94  <Field byte[] c>
	//   17   40:astore          10
			} else
	//*  18   42:goto            163
			{
				int i1 = (int)(l2 / 0xd693a400L);
	//   19   45:lload           8
	//   20   47:ldc2w           #342 <Long 0xd693a400L>
	//   21   50:ldiv            
	//   22   51:l2i             
	//   23   52:istore          4
				l2 -= (long)i1 * 0xd693a400L;
	//   24   54:lload           8
	//   25   56:iload           4
	//   26   58:i2l             
	//   27   59:ldc2w           #342 <Long 0xd693a400L>
	//   28   62:lmul            
	//   29   63:lsub            
	//   30   64:lstore          8
				int j1 = (int)(l2 / 0x3938700L);
	//   31   66:lload           8
	//   32   68:ldc2w           #344 <Long 0x3938700L>
	//   33   71:ldiv            
	//   34   72:l2i             
	//   35   73:istore          5
				l2 -= 0x3938700 * j1;
	//   36   75:lload           8
	//   37   77:ldc2            #346 <Int 0x3938700>
	//   38   80:iload           5
	//   39   82:imul            
	//   40   83:i2l             
	//   41   84:lsub            
	//   42   85:lstore          8
				int k1 = (int)(l2 / 0xf4240L);
	//   43   87:lload           8
	//   44   89:ldc2w           #347 <Long 0xf4240L>
	//   45   92:ldiv            
	//   46   93:l2i             
	//   47   94:istore          6
				int i2 = (int)((l2 - (long)(0xf4240 * k1)) / 1000L);
	//   48   96:lload           8
	//   49   98:ldc2            #349 <Int 0xf4240>
	//   50  101:iload           6
	//   51  103:imul            
	//   52  104:i2l             
	//   53  105:lsub            
	//   54  106:ldc2w           #225 <Long 1000L>
	//   55  109:ldiv            
	//   56  110:l2i             
	//   57  111:istore          7
				abyte0 = bnw.c(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[] {
					Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1), Integer.valueOf(i2)
				}));
	//   58  113:getstatic       #355 <Field Locale Locale.US>
	//   59  116:ldc2            #357 <String "%02d:%02d:%02d,%03d">
	//   60  119:iconst_4        
	//   61  120:anewarray       Object[]
	//   62  123:dup             
	//   63  124:iconst_0        
	//   64  125:iload           4
	//   65  127:invokestatic    #363 <Method Integer Integer.valueOf(int)>
	//   66  130:aastore         
	//   67  131:dup             
	//   68  132:iconst_1        
	//   69  133:iload           5
	//   70  135:invokestatic    #363 <Method Integer Integer.valueOf(int)>
	//   71  138:aastore         
	//   72  139:dup             
	//   73  140:iconst_2        
	//   74  141:iload           6
	//   75  143:invokestatic    #363 <Method Integer Integer.valueOf(int)>
	//   76  146:aastore         
	//   77  147:dup             
	//   78  148:iconst_3        
	//   79  149:iload           7
	//   80  151:invokestatic    #363 <Method Integer Integer.valueOf(int)>
	//   81  154:aastore         
	//   82  155:invokestatic    #367 <Method String String.format(Locale, String, Object[])>
	//   83  158:invokestatic    #370 <Method byte[] bnw.c(String)>
	//   84  161:astore          10
			}
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 19, 12);
	//   85  163:aload           10
	//   86  165:iconst_0        
	//   87  166:aload           11
	//   88  168:bipush          19
	//   89  170:bipush          12
	//   90  172:invokestatic    #376 <Method void System.arraycopy(Object, int, Object, int, int)>
			bfw bfw1 = bgg1.N;
	//   91  175:aload_1         
	//   92  176:getfield        #283 <Field bfw bgg.N>
	//   93  179:astore          10
			bno bno1 = o;
	//   94  181:aload_0         
	//   95  182:getfield        #196 <Field bno o>
	//   96  185:astore          11
			bfw1.a(bno1, bno1.c());
	//   97  187:aload           10
	//   98  189:aload           11
	//   99  191:aload           11
	//  100  193:invokevirtual   #242 <Method int bno.c()>
	//  101  196:invokeinterface #216 <Method void bfw.a(bno, int)>
			Z = Z + o.c();
	//  102  201:aload_0         
	//  103  202:aload_0         
	//  104  203:getfield        #223 <Field int Z>
	//  105  206:aload_0         
	//  106  207:getfield        #196 <Field bno o>
	//  107  210:invokevirtual   #242 <Method int bno.c()>
	//  108  213:iadd            
	//  109  214:putfield        #223 <Field int Z>
		}
		bgg1.N.a(l1, Q, Z, 0, bgg1.g);
	//  110  217:aload_1         
	//  111  218:getfield        #283 <Field bfw bgg.N>
	//  112  221:lload_2         
	//  113  222:aload_0         
	//  114  223:getfield        #289 <Field int Q>
	//  115  226:aload_0         
	//  116  227:getfield        #223 <Field int Z>
	//  117  230:iconst_0        
	//  118  231:aload_1         
	//  119  232:getfield        #379 <Field bfx bgg.g>
	//  120  235:invokeinterface #382 <Method void bfw.a(long, int, int, int, bfx)>
		aa = true;
	//  121  240:aload_0         
	//  122  241:iconst_1        
	//  123  242:putfield        #384 <Field boolean aa>
		b();
	//  124  245:aload_0         
	//  125  246:invokespecial   #386 <Method void b()>
	//  126  249:return          
	}

	private static int[] a(int ai[], int i1)
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return new int[i1];
	//    2    4:iload_1         
	//    3    5:newarray        int[]
	//    4    7:areturn         
		if(ai.length >= i1)
	//*   5    8:aload_0         
	//*   6    9:arraylength     
	//*   7   10:iload_1         
	//*   8   11:icmplt          16
			return ai;
	//    9   14:aload_0         
	//   10   15:areturn         
		else
			return new int[Math.max(ai.length << 1, i1)];
	//   11   16:aload_0         
	//   12   17:arraylength     
	//   13   18:iconst_1        
	//   14   19:ishl            
	//   15   20:iload_1         
	//   16   21:invokestatic    #248 <Method int Math.max(int, int)>
	//   17   24:newarray        int[]
	//   18   26:areturn         
	}

	private final void b()
	{
		R = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #221 <Field int R>
		Z = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #223 <Field int Z>
		Y = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #334 <Field int Y>
		S = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #285 <Field boolean S>
		T = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #292 <Field boolean T>
		V = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #301 <Field boolean V>
		X = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #305 <Field int X>
		W = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #294 <Field byte W>
		U = false;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #299 <Field boolean U>
		n.a();
	//   27   45:aload_0         
	//   28   46:getfield        #194 <Field bno n>
	//   29   49:invokevirtual   #389 <Method void bno.a()>
	//   30   52:return          
	}

	static boolean b(int i1)
	{
		return i1 == 0x1549a966 || i1 == 0x1f43b675 || i1 == 0x1c53bb6b || i1 == 0x1654ae6b;
	//    0    0:iload_0         
	//    1    1:ldc2            #391 <Int 0x1549a966>
	//    2    4:icmpeq          33
	//    3    7:iload_0         
	//    4    8:ldc2            #392 <Int 0x1f43b675>
	//    5   11:icmpeq          33
	//    6   14:iload_0         
	//    7   15:ldc2            #393 <Int 0x1c53bb6b>
	//    8   18:icmpeq          33
	//    9   21:iload_0         
	//   10   22:ldc2            #394 <Int 0x1654ae6b>
	//   11   25:icmpne          31
	//   12   28:goto            33
	//   13   31:iconst_0        
	//   14   32:ireturn         
	//   15   33:iconst_1        
	//   16   34:ireturn         
	}

	public final int a(bfo bfo1, bft bft1)
	{
		aa = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #384 <Field boolean aa>
		boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore          4
label0:
		do
		{
			boolean flag;
			boolean flag2;
label1:
			{
				if(!flag1 || aa)
					break label0;
	//    5    8:iload           4
	//    6   10:ifeq            132
	//    7   13:aload_0         
	//    8   14:getfield        #384 <Field boolean aa>
	//    9   17:ifne            132
				flag2 = e.a(bfo1);
	//   10   20:aload_0         
	//   11   21:getfield        #136 <Field bgb e>
	//   12   24:aload_1         
	//   13   25:invokeinterface #398 <Method boolean bgb.a(bfo)>
	//   14   30:istore          5
				flag1 = flag2;
	//   15   32:iload           5
	//   16   34:istore          4
				if(!flag2)
					continue;
	//   17   36:iload           5
	//   18   38:ifeq            8
				long l1 = bfo1.b();
	//   19   41:aload_1         
	//   20   42:invokeinterface #401 <Method long bfo.b()>
	//   21   47:lstore          6
				if(B)
	//*  22   49:aload_0         
	//*  23   50:getfield        #403 <Field boolean B>
	//*  24   53:ifeq            80
				{
					D = l1;
	//   25   56:aload_0         
	//   26   57:lload           6
	//   27   59:putfield        #132 <Field long D>
					bft1.a = C;
	//   28   62:aload_2         
	//   29   63:aload_0         
	//   30   64:getfield        #130 <Field long C>
	//   31   67:putfield        #407 <Field long bft.a>
					B = false;
	//   32   70:aload_0         
	//   33   71:iconst_0        
	//   34   72:putfield        #403 <Field boolean B>
					flag = true;
	//   35   75:iconst_1        
	//   36   76:istore_3        
					break label1;
	//   37   77:goto            122
				}
				if(y)
	//*  38   80:aload_0         
	//*  39   81:getfield        #409 <Field boolean y>
	//*  40   84:ifeq            120
				{
					long l2 = D;
	//   41   87:aload_0         
	//   42   88:getfield        #132 <Field long D>
	//   43   91:lstore          6
					if(l2 != -1L)
	//*  44   93:lload           6
	//*  45   95:ldc2w           #117 <Long -1L>
	//*  46   98:lcmp            
	//*  47   99:ifeq            120
					{
						bft1.a = l2;
	//   48  102:aload_2         
	//   49  103:lload           6
	//   50  105:putfield        #407 <Field long bft.a>
						D = -1L;
	//   51  108:aload_0         
	//   52  109:ldc2w           #117 <Long -1L>
	//   53  112:putfield        #132 <Field long D>
						flag = true;
	//   54  115:iconst_1        
	//   55  116:istore_3        
						break label1;
	//   56  117:goto            122
					}
				}
				flag = false;
	//   57  120:iconst_0        
	//   58  121:istore_3        
			}
			flag1 = flag2;
	//   59  122:iload           5
	//   60  124:istore          4
			if(flag)
	//*  61  126:iload_3         
	//*  62  127:ifeq            8
				return 1;
	//   63  130:iconst_1        
	//   64  131:ireturn         
		} while(true);
		return !flag1 ? -1 : 0;
	//   65  132:iload           4
	//   66  134:ifeq            139
	//   67  137:iconst_0        
	//   68  138:ireturn         
	//   69  139:iconst_m1       
	//   70  140:ireturn         
	}

	final void a(int i1, double d1)
	{
		if(i1 != 181)
	//*   0    0:iload_1         
	//*   1    1:sipush          181
	//*   2    4:icmpeq          176
		{
			if(i1 != 17545)
	//*   3    7:iload_1         
	//*   4    8:sipush          17545
	//*   5   11:icmpeq          169
			{
				switch(i1)
	//*   6   14:iload_1         
				{
	//*   7   15:tableswitch     21969 21978: default 68
	//	               21969 159
	//	               21970 149
	//	               21971 139
	//	               21972 129
	//	               21973 119
	//	               21974 109
	//	               21975 99
	//	               21976 89
	//	               21977 79
	//	               21978 69
				default:
					return;
	//    8   68:return          

				case 21978: 
					x.F = (float)d1;
	//    9   69:aload_0         
	//   10   70:getfield        #412 <Field bgg x>
	//   11   73:dload_2         
	//   12   74:d2f             
	//   13   75:putfield        #414 <Field float bgg.F>
					return;
	//   14   78:return          

				case 21977: 
					x.E = (float)d1;
	//   15   79:aload_0         
	//   16   80:getfield        #412 <Field bgg x>
	//   17   83:dload_2         
	//   18   84:d2f             
	//   19   85:putfield        #416 <Field float bgg.E>
					return;
	//   20   88:return          

				case 21976: 
					x.D = (float)d1;
	//   21   89:aload_0         
	//   22   90:getfield        #412 <Field bgg x>
	//   23   93:dload_2         
	//   24   94:d2f             
	//   25   95:putfield        #418 <Field float bgg.D>
					return;
	//   26   98:return          

				case 21975: 
					x.C = (float)d1;
	//   27   99:aload_0         
	//   28  100:getfield        #412 <Field bgg x>
	//   29  103:dload_2         
	//   30  104:d2f             
	//   31  105:putfield        #420 <Field float bgg.C>
					return;
	//   32  108:return          

				case 21974: 
					x.B = (float)d1;
	//   33  109:aload_0         
	//   34  110:getfield        #412 <Field bgg x>
	//   35  113:dload_2         
	//   36  114:d2f             
	//   37  115:putfield        #422 <Field float bgg.B>
					return;
	//   38  118:return          

				case 21973: 
					x.A = (float)d1;
	//   39  119:aload_0         
	//   40  120:getfield        #412 <Field bgg x>
	//   41  123:dload_2         
	//   42  124:d2f             
	//   43  125:putfield        #424 <Field float bgg.A>
					return;
	//   44  128:return          

				case 21972: 
					x.z = (float)d1;
	//   45  129:aload_0         
	//   46  130:getfield        #412 <Field bgg x>
	//   47  133:dload_2         
	//   48  134:d2f             
	//   49  135:putfield        #426 <Field float bgg.z>
					return;
	//   50  138:return          

				case 21971: 
					x.y = (float)d1;
	//   51  139:aload_0         
	//   52  140:getfield        #412 <Field bgg x>
	//   53  143:dload_2         
	//   54  144:d2f             
	//   55  145:putfield        #428 <Field float bgg.y>
					return;
	//   56  148:return          

				case 21970: 
					x.x = (float)d1;
	//   57  149:aload_0         
	//   58  150:getfield        #412 <Field bgg x>
	//   59  153:dload_2         
	//   60  154:d2f             
	//   61  155:putfield        #430 <Field float bgg.x>
					return;
	//   62  158:return          

				case 21969: 
					x.w = (float)d1;
	//   63  159:aload_0         
	//   64  160:getfield        #412 <Field bgg x>
	//   65  163:dload_2         
	//   66  164:d2f             
	//   67  165:putfield        #432 <Field float bgg.w>
					return;
	//   68  168:return          
				}
			} else
			{
				v = (long)d1;
	//   69  169:aload_0         
	//   70  170:dload_2         
	//   71  171:d2l             
	//   72  172:putfield        #126 <Field long v>
				return;
	//   73  175:return          
			}
		} else
		{
			x.I = (int)d1;
	//   74  176:aload_0         
	//   75  177:getfield        #412 <Field bgg x>
	//   76  180:dload_2         
	//   77  181:d2i             
	//   78  182:putfield        #434 <Field int bgg.I>
			return;
	//   79  185:return          
		}
	}

	final void a(int i1, int j1, bfo bfo1)
	{
		bgg bgg4;
label0:
		{
label1:
			{
				int k1;
label2:
				{
label3:
					{
						int j2;
						int j3;
label4:
						{
							if(i1 != 161 && i1 != 163)
	//*   0    0:iload_1         
	//*   1    1:sipush          161
	//*   2    4:icmpeq          251
	//*   3    7:iload_1         
	//*   4    8:sipush          163
	//*   5   11:icmpeq          251
								if(i1 != 16981)
	//*   6   14:iload_1         
	//*   7   15:sipush          16981
	//*   8   18:icmpeq          223
								{
									if(i1 != 18402)
	//*   9   21:iload_1         
	//*  10   22:sipush          18402
	//*  11   25:icmpeq          190
									{
										if(i1 != 21419)
	//*  12   28:iload_1         
	//*  13   29:sipush          21419
	//*  14   32:icmpeq          141
										{
											if(i1 != 25506)
	//*  15   35:iload_1         
	//*  16   36:sipush          25506
	//*  17   39:icmpeq          113
											{
												if(i1 == 30322)
	//*  18   42:iload_1         
	//*  19   43:sipush          30322
	//*  20   46:icmpne          77
												{
													bgg bgg1 = x;
	//   21   49:aload_0         
	//   22   50:getfield        #412 <Field bgg x>
	//   23   53:astore          15
													bgg1.o = new byte[j1];
	//   24   55:aload           15
	//   25   57:iload_2         
	//   26   58:newarray        byte[]
	//   27   60:putfield        #437 <Field byte[] bgg.o>
													bfo1.b(bgg1.o, 0, j1);
	//   28   63:aload_3         
	//   29   64:aload           15
	//   30   66:getfield        #437 <Field byte[] bgg.o>
	//   31   69:iconst_0        
	//   32   70:iload_2         
	//   33   71:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
													return;
	//   34   76:return          
												} else
												{
													bfo1 = ((bfo) (new StringBuilder(26)));
	//   35   77:new             #439 <Class StringBuilder>
	//   36   80:dup             
	//   37   81:bipush          26
	//   38   83:invokespecial   #440 <Method void StringBuilder(int)>
	//   39   86:astore_3        
													((StringBuilder) (bfo1)).append("Unexpected id: ");
	//   40   87:aload_3         
	//   41   88:ldc2            #442 <String "Unexpected id: ">
	//   42   91:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   43   94:pop             
													((StringBuilder) (bfo1)).append(i1);
	//   44   95:aload_3         
	//   45   96:iload_1         
	//   46   97:invokevirtual   #449 <Method StringBuilder StringBuilder.append(int)>
	//   47  100:pop             
													throw new bdj(((StringBuilder) (bfo1)).toString());
	//   48  101:new             #233 <Class bdj>
	//   49  104:dup             
	//   50  105:aload_3         
	//   51  106:invokevirtual   #453 <Method String StringBuilder.toString()>
	//   52  109:invokespecial   #238 <Method void bdj(String)>
	//   53  112:athrow          
												}
											} else
											{
												bgg bgg2 = x;
	//   54  113:aload_0         
	//   55  114:getfield        #412 <Field bgg x>
	//   56  117:astore          15
												bgg2.h = new byte[j1];
	//   57  119:aload           15
	//   58  121:iload_2         
	//   59  122:newarray        byte[]
	//   60  124:putfield        #455 <Field byte[] bgg.h>
												bfo1.b(bgg2.h, 0, j1);
	//   61  127:aload_3         
	//   62  128:aload           15
	//   63  130:getfield        #455 <Field byte[] bgg.h>
	//   64  133:iconst_0        
	//   65  134:iload_2         
	//   66  135:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
												return;
	//   67  140:return          
											}
										} else
										{
											Arrays.fill(m.a, (byte)0);
	//   68  141:aload_0         
	//   69  142:getfield        #183 <Field bno m>
	//   70  145:getfield        #245 <Field byte[] bno.a>
	//   71  148:iconst_0        
	//   72  149:invokestatic    #459 <Method void Arrays.fill(byte[], byte)>
											bfo1.b(m.a, 4 - j1, j1);
	//   73  152:aload_3         
	//   74  153:aload_0         
	//   75  154:getfield        #183 <Field bno m>
	//   76  157:getfield        #245 <Field byte[] bno.a>
	//   77  160:iconst_4        
	//   78  161:iload_2         
	//   79  162:isub            
	//   80  163:iload_2         
	//   81  164:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
											m.c(0);
	//   82  169:aload_0         
	//   83  170:getfield        #183 <Field bno m>
	//   84  173:iconst_0        
	//   85  174:invokevirtual   #280 <Method void bno.c(int)>
											z = (int)m.j();
	//   86  177:aload_0         
	//   87  178:aload_0         
	//   88  179:getfield        #183 <Field bno m>
	//   89  182:invokevirtual   #461 <Method long bno.j()>
	//   90  185:l2i             
	//   91  186:putfield        #463 <Field int z>
											return;
	//   92  189:return          
										}
									} else
									{
										byte abyte0[] = new byte[j1];
	//   93  190:iload_2         
	//   94  191:newarray        byte[]
	//   95  193:astore          15
										bfo1.b(abyte0, 0, j1);
	//   96  195:aload_3         
	//   97  196:aload           15
	//   98  198:iconst_0        
	//   99  199:iload_2         
	//  100  200:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
										x.g = new bfx(1, abyte0);
	//  101  205:aload_0         
	//  102  206:getfield        #412 <Field bgg x>
	//  103  209:new             #465 <Class bfx>
	//  104  212:dup             
	//  105  213:iconst_1        
	//  106  214:aload           15
	//  107  216:invokespecial   #468 <Method void bfx(int, byte[])>
	//  108  219:putfield        #379 <Field bfx bgg.g>
										return;
	//  109  222:return          
									}
								} else
								{
									bgg bgg3 = x;
	//  110  223:aload_0         
	//  111  224:getfield        #412 <Field bgg x>
	//  112  227:astore          15
									bgg3.f = new byte[j1];
	//  113  229:aload           15
	//  114  231:iload_2         
	//  115  232:newarray        byte[]
	//  116  234:putfield        #324 <Field byte[] bgg.f>
									bfo1.b(bgg3.f, 0, j1);
	//  117  237:aload_3         
	//  118  238:aload           15
	//  119  240:getfield        #324 <Field byte[] bgg.f>
	//  120  243:iconst_0        
	//  121  244:iload_2         
	//  122  245:invokeinterface #262 <Method void bfo.b(byte[], int, int)>
									return;
	//  123  250:return          
								}
							if(I == 0)
	//* 124  251:aload_0         
	//* 125  252:getfield        #469 <Field int I>
	//* 126  255:ifne            305
							{
								O = (int)f.a(bfo1, false, true, 8);
	//  127  258:aload_0         
	//  128  259:aload_0         
	//  129  260:getfield        #153 <Field bgi f>
	//  130  263:aload_3         
	//  131  264:iconst_0        
	//  132  265:iconst_1        
	//  133  266:bipush          8
	//  134  268:invokevirtual   #472 <Method long bgi.a(bfo, boolean, boolean, int)>
	//  135  271:l2i             
	//  136  272:putfield        #473 <Field int O>
								P = f.b();
	//  137  275:aload_0         
	//  138  276:aload_0         
	//  139  277:getfield        #153 <Field bgi f>
	//  140  280:invokevirtual   #474 <Method int bgi.b()>
	//  141  283:putfield        #476 <Field int P>
								K = 0x1L;
	//  142  286:aload_0         
	//  143  287:ldc2w           #121 <Long 0x1L>
	//  144  290:putfield        #341 <Field long K>
								I = 1;
	//  145  293:aload_0         
	//  146  294:iconst_1        
	//  147  295:putfield        #469 <Field int I>
								k.a();
	//  148  298:aload_0         
	//  149  299:getfield        #163 <Field bno k>
	//  150  302:invokevirtual   #389 <Method void bno.a()>
							}
							bgg4 = (bgg)g.get(O);
	//  151  305:aload_0         
	//  152  306:getfield        #158 <Field SparseArray g>
	//  153  309:aload_0         
	//  154  310:getfield        #473 <Field int O>
	//  155  313:invokevirtual   #480 <Method Object SparseArray.get(int)>
	//  156  316:checkcast       #269 <Class bgg>
	//  157  319:astore          15
							if(bgg4 == null)
	//* 158  321:aload           15
	//* 159  323:ifnonnull       344
							{
								bfo1.b(j1 - P);
	//  160  326:aload_3         
	//  161  327:iload_2         
	//  162  328:aload_0         
	//  163  329:getfield        #476 <Field int P>
	//  164  332:isub            
	//  165  333:invokeinterface #481 <Method void bfo.b(int)>
								I = 0;
	//  166  338:aload_0         
	//  167  339:iconst_0        
	//  168  340:putfield        #469 <Field int I>
								return;
	//  169  343:return          
							}
							if(I != 1)
								break label0;
	//  170  344:aload_0         
	//  171  345:getfield        #469 <Field int I>
	//  172  348:iconst_1        
	//  173  349:icmpne          1217
							a(bfo1, 3);
	//  174  352:aload_0         
	//  175  353:aload_3         
	//  176  354:iconst_3        
	//  177  355:invokespecial   #483 <Method void a(bfo, int)>
							k1 = (k.a[2] & 6) >> 1;
	//  178  358:aload_0         
	//  179  359:getfield        #163 <Field bno k>
	//  180  362:getfield        #245 <Field byte[] bno.a>
	//  181  365:iconst_2        
	//  182  366:baload          
	//  183  367:bipush          6
	//  184  369:iand            
	//  185  370:iconst_1        
	//  186  371:ishr            
	//  187  372:istore          4
							if(k1 == 0)
	//* 188  374:iload           4
	//* 189  376:ifne            413
							{
								M = 1;
	//  190  379:aload_0         
	//  191  380:iconst_1        
	//  192  381:putfield        #485 <Field int M>
								N = a(N, 1);
	//  193  384:aload_0         
	//  194  385:aload_0         
	//  195  386:getfield        #487 <Field int[] N>
	//  196  389:iconst_1        
	//  197  390:invokestatic    #489 <Method int[] a(int[], int)>
	//  198  393:putfield        #487 <Field int[] N>
								N[0] = j1 - P - 3;
	//  199  396:aload_0         
	//  200  397:getfield        #487 <Field int[] N>
	//  201  400:iconst_0        
	//  202  401:iload_2         
	//  203  402:aload_0         
	//  204  403:getfield        #476 <Field int P>
	//  205  406:isub            
	//  206  407:iconst_3        
	//  207  408:isub            
	//  208  409:iastore         
								break label3;
	//  209  410:goto            1015
							}
							if(i1 != 163)
								break label1;
	//  210  413:iload_1         
	//  211  414:sipush          163
	//  212  417:icmpne          1206
							a(bfo1, 4);
	//  213  420:aload_0         
	//  214  421:aload_3         
	//  215  422:iconst_4        
	//  216  423:invokespecial   #483 <Method void a(bfo, int)>
							M = (k.a[3] & 0xff) + 1;
	//  217  426:aload_0         
	//  218  427:aload_0         
	//  219  428:getfield        #163 <Field bno k>
	//  220  431:getfield        #245 <Field byte[] bno.a>
	//  221  434:iconst_3        
	//  222  435:baload          
	//  223  436:sipush          255
	//  224  439:iand            
	//  225  440:iconst_1        
	//  226  441:iadd            
	//  227  442:putfield        #485 <Field int M>
							N = a(N, M);
	//  228  445:aload_0         
	//  229  446:aload_0         
	//  230  447:getfield        #487 <Field int[] N>
	//  231  450:aload_0         
	//  232  451:getfield        #485 <Field int M>
	//  233  454:invokestatic    #489 <Method int[] a(int[], int)>
	//  234  457:putfield        #487 <Field int[] N>
							if(k1 == 2)
	//* 235  460:iload           4
	//* 236  462:iconst_2        
	//* 237  463:icmpne          502
							{
								int l1 = P;
	//  238  466:aload_0         
	//  239  467:getfield        #476 <Field int P>
	//  240  470:istore          5
								k1 = M;
	//  241  472:aload_0         
	//  242  473:getfield        #485 <Field int M>
	//  243  476:istore          4
								j1 = (j1 - l1 - 4) / k1;
	//  244  478:iload_2         
	//  245  479:iload           5
	//  246  481:isub            
	//  247  482:iconst_4        
	//  248  483:isub            
	//  249  484:iload           4
	//  250  486:idiv            
	//  251  487:istore_2        
								Arrays.fill(N, 0, k1, j1);
	//  252  488:aload_0         
	//  253  489:getfield        #487 <Field int[] N>
	//  254  492:iconst_0        
	//  255  493:iload           4
	//  256  495:iload_2         
	//  257  496:invokestatic    #492 <Method void Arrays.fill(int[], int, int, int)>
								break label3;
	//  258  499:goto            1015
							}
							if(k1 == 1)
	//* 259  502:iload           4
	//* 260  504:iconst_1        
	//* 261  505:icmpne          649
							{
								int k2 = 0;
	//  262  508:iconst_0        
	//  263  509:istore          6
								k1 = 4;
	//  264  511:iconst_4        
	//  265  512:istore          4
								int i2 = 0;
	//  266  514:iconst_0        
	//  267  515:istore          5
								int i3;
								do
								{
									i3 = M;
	//  268  517:aload_0         
	//  269  518:getfield        #485 <Field int M>
	//  270  521:istore          7
									if(k2 >= i3 - 1)
										break;
	//  271  523:iload           6
	//  272  525:iload           7
	//  273  527:iconst_1        
	//  274  528:isub            
	//  275  529:icmpge          625
									N[k2] = 0;
	//  276  532:aload_0         
	//  277  533:getfield        #487 <Field int[] N>
	//  278  536:iload           6
	//  279  538:iconst_0        
	//  280  539:iastore         
									i3 = k1;
	//  281  540:iload           4
	//  282  542:istore          7
									int k3;
									int ai[];
									do
									{
										k1 = i3 + 1;
	//  283  544:iload           7
	//  284  546:iconst_1        
	//  285  547:iadd            
	//  286  548:istore          4
										a(bfo1, k1);
	//  287  550:aload_0         
	//  288  551:aload_3         
	//  289  552:iload           4
	//  290  554:invokespecial   #483 <Method void a(bfo, int)>
										k3 = k.a[k1 - 1] & 0xff;
	//  291  557:aload_0         
	//  292  558:getfield        #163 <Field bno k>
	//  293  561:getfield        #245 <Field byte[] bno.a>
	//  294  564:iload           4
	//  295  566:iconst_1        
	//  296  567:isub            
	//  297  568:baload          
	//  298  569:sipush          255
	//  299  572:iand            
	//  300  573:istore          8
										ai = N;
	//  301  575:aload_0         
	//  302  576:getfield        #487 <Field int[] N>
	//  303  579:astore          16
										ai[k2] = ai[k2] + k3;
	//  304  581:aload           16
	//  305  583:iload           6
	//  306  585:aload           16
	//  307  587:iload           6
	//  308  589:iaload          
	//  309  590:iload           8
	//  310  592:iadd            
	//  311  593:iastore         
										i3 = k1;
	//  312  594:iload           4
	//  313  596:istore          7
									} while(k3 == 255);
	//  314  598:iload           8
	//  315  600:sipush          255
	//  316  603:icmpeq          544
									i2 += ai[k2];
	//  317  606:iload           5
	//  318  608:aload           16
	//  319  610:iload           6
	//  320  612:iaload          
	//  321  613:iadd            
	//  322  614:istore          5
									k2++;
	//  323  616:iload           6
	//  324  618:iconst_1        
	//  325  619:iadd            
	//  326  620:istore          6
								} while(true);
	//  327  622:goto            517
								N[i3 - 1] = j1 - P - k1 - i2;
	//  328  625:aload_0         
	//  329  626:getfield        #487 <Field int[] N>
	//  330  629:iload           7
	//  331  631:iconst_1        
	//  332  632:isub            
	//  333  633:iload_2         
	//  334  634:aload_0         
	//  335  635:getfield        #476 <Field int P>
	//  336  638:isub            
	//  337  639:iload           4
	//  338  641:isub            
	//  339  642:iload           5
	//  340  644:isub            
	//  341  645:iastore         
								break label3;
	//  342  646:goto            1015
							}
							if(k1 != 3)
								break label2;
	//  343  649:iload           4
	//  344  651:iconst_3        
	//  345  652:icmpne          1169
							int l2 = 0;
	//  346  655:iconst_0        
	//  347  656:istore          6
							k1 = 4;
	//  348  658:iconst_4        
	//  349  659:istore          4
							j2 = 0;
	//  350  661:iconst_0        
	//  351  662:istore          5
label5:
							do
							{
								long l4;
label6:
								{
									j3 = M;
	//  352  664:aload_0         
	//  353  665:getfield        #485 <Field int M>
	//  354  668:istore          7
									if(l2 >= j3 - 1)
										break label4;
	//  355  670:iload           6
	//  356  672:iload           7
	//  357  674:iconst_1        
	//  358  675:isub            
	//  359  676:icmpge          994
									N[l2] = 0;
	//  360  679:aload_0         
	//  361  680:getfield        #487 <Field int[] N>
	//  362  683:iload           6
	//  363  685:iconst_0        
	//  364  686:iastore         
									j3 = k1 + 1;
	//  365  687:iload           4
	//  366  689:iconst_1        
	//  367  690:iadd            
	//  368  691:istore          7
									a(bfo1, j3);
	//  369  693:aload_0         
	//  370  694:aload_3         
	//  371  695:iload           7
	//  372  697:invokespecial   #483 <Method void a(bfo, int)>
									byte abyte1[] = k.a;
	//  373  700:aload_0         
	//  374  701:getfield        #163 <Field bno k>
	//  375  704:getfield        #245 <Field byte[] bno.a>
	//  376  707:astore          16
									int i4 = j3 - 1;
	//  377  709:iload           7
	//  378  711:iconst_1        
	//  379  712:isub            
	//  380  713:istore          9
									if(abyte1[i4] == 0)
										break label5;
	//  381  715:aload           16
	//  382  717:iload           9
	//  383  719:baload          
	//  384  720:ifeq            983
									k1 = 0;
	//  385  723:iconst_0        
	//  386  724:istore          4
									do
									{
										if(k1 >= 8)
											break;
	//  387  726:iload           4
	//  388  728:bipush          8
	//  389  730:icmpge          888
										int j4 = 1 << 7 - k1;
	//  390  733:iconst_1        
	//  391  734:bipush          7
	//  392  736:iload           4
	//  393  738:isub            
	//  394  739:ishl            
	//  395  740:istore          10
										if((k.a[i4] & j4) != 0)
	//* 396  742:aload_0         
	//* 397  743:getfield        #163 <Field bno k>
	//* 398  746:getfield        #245 <Field byte[] bno.a>
	//* 399  749:iload           9
	//* 400  751:baload          
	//* 401  752:iload           10
	//* 402  754:iand            
	//* 403  755:ifeq            879
										{
											int l3 = j3 + k1;
	//  404  758:iload           7
	//  405  760:iload           4
	//  406  762:iadd            
	//  407  763:istore          8
											a(bfo1, l3);
	//  408  765:aload_0         
	//  409  766:aload_3         
	//  410  767:iload           8
	//  411  769:invokespecial   #483 <Method void a(bfo, int)>
											l4 = k.a[i4] & 0xff & ~j4;
	//  412  772:aload_0         
	//  413  773:getfield        #163 <Field bno k>
	//  414  776:getfield        #245 <Field byte[] bno.a>
	//  415  779:iload           9
	//  416  781:baload          
	//  417  782:sipush          255
	//  418  785:iand            
	//  419  786:iload           10
	//  420  788:iconst_m1       
	//  421  789:ixor            
	//  422  790:iand            
	//  423  791:i2l             
	//  424  792:lstore          11
											for(j3 = i4 + 1; j3 < l3;)
	//* 425  794:iload           9
	//* 426  796:iconst_1        
	//* 427  797:iadd            
	//* 428  798:istore          7
	//* 429  800:iload           7
	//* 430  802:iload           8
	//* 431  804:icmpge          843
											{
												long l5 = k.a[j3] & 0xff;
	//  432  807:aload_0         
	//  433  808:getfield        #163 <Field bno k>
	//  434  811:getfield        #245 <Field byte[] bno.a>
	//  435  814:iload           7
	//  436  816:baload          
	//  437  817:sipush          255
	//  438  820:iand            
	//  439  821:i2l             
	//  440  822:lstore          13
												j3++;
	//  441  824:iload           7
	//  442  826:iconst_1        
	//  443  827:iadd            
	//  444  828:istore          7
												l4 = l4 << 8 | l5;
	//  445  830:lload           11
	//  446  832:bipush          8
	//  447  834:lshl            
	//  448  835:lload           13
	//  449  837:lor             
	//  450  838:lstore          11
											}

	//* 451  840:goto            800
											if(l2 > 0)
	//* 452  843:iload           6
	//* 453  845:ifle            872
											{
												l4 -= (1L << k1 * 7 + 6) - 1L;
	//  454  848:lload           11
	//  455  850:lconst_1        
	//  456  851:iload           4
	//  457  853:bipush          7
	//  458  855:imul            
	//  459  856:bipush          6
	//  460  858:iadd            
	//  461  859:lshl            
	//  462  860:lconst_1        
	//  463  861:lsub            
	//  464  862:lsub            
	//  465  863:lstore          11
												k1 = l3;
	//  466  865:iload           8
	//  467  867:istore          4
											} else
	//* 468  869:goto            895
											{
												k1 = l3;
	//  469  872:iload           8
	//  470  874:istore          4
											}
											break label6;
	//  471  876:goto            895
										}
										k1++;
	//  472  879:iload           4
	//  473  881:iconst_1        
	//  474  882:iadd            
	//  475  883:istore          4
									} while(true);
	//  476  885:goto            726
									l4 = 0L;
	//  477  888:lconst_0        
	//  478  889:lstore          11
									k1 = j3;
	//  479  891:iload           7
	//  480  893:istore          4
								}
								if(l4 >= 0x80000000L && l4 <= 0x7fffffffL)
	//* 481  895:lload           11
	//* 482  897:ldc2w           #493 <Long 0x80000000L>
	//* 483  900:lcmp            
	//* 484  901:iflt            972
	//* 485  904:lload           11
	//* 486  906:ldc2w           #495 <Long 0x7fffffffL>
	//* 487  909:lcmp            
	//* 488  910:ifgt            972
								{
									j3 = (int)l4;
	//  489  913:lload           11
	//  490  915:l2i             
	//  491  916:istore          7
									int ai1[] = N;
	//  492  918:aload_0         
	//  493  919:getfield        #487 <Field int[] N>
	//  494  922:astore          16
									if(l2 != 0)
	//* 495  924:iload           6
	//* 496  926:ifne            932
	//* 497  929:goto            944
										j3 += ai1[l2 - 1];
	//  498  932:iload           7
	//  499  934:aload           16
	//  500  936:iload           6
	//  501  938:iconst_1        
	//  502  939:isub            
	//  503  940:iaload          
	//  504  941:iadd            
	//  505  942:istore          7
									ai1[l2] = j3;
	//  506  944:aload           16
	//  507  946:iload           6
	//  508  948:iload           7
	//  509  950:iastore         
									j2 += N[l2];
	//  510  951:iload           5
	//  511  953:aload_0         
	//  512  954:getfield        #487 <Field int[] N>
	//  513  957:iload           6
	//  514  959:iaload          
	//  515  960:iadd            
	//  516  961:istore          5
									l2++;
	//  517  963:iload           6
	//  518  965:iconst_1        
	//  519  966:iadd            
	//  520  967:istore          6
								} else
	//* 521  969:goto            664
								{
									throw new bdj("EBML lacing sample size out of range.");
	//  522  972:new             #233 <Class bdj>
	//  523  975:dup             
	//  524  976:ldc2            #498 <String "EBML lacing sample size out of range.">
	//  525  979:invokespecial   #238 <Method void bdj(String)>
	//  526  982:athrow          
								}
							} while(true);
							throw new bdj("No valid varint length mask found");
	//  527  983:new             #233 <Class bdj>
	//  528  986:dup             
	//  529  987:ldc2            #500 <String "No valid varint length mask found">
	//  530  990:invokespecial   #238 <Method void bdj(String)>
	//  531  993:athrow          
						}
						N[j3 - 1] = j1 - P - k1 - j2;
	//  532  994:aload_0         
	//  533  995:getfield        #487 <Field int[] N>
	//  534  998:iload           7
	//  535 1000:iconst_1        
	//  536 1001:isub            
	//  537 1002:iload_2         
	//  538 1003:aload_0         
	//  539 1004:getfield        #476 <Field int P>
	//  540 1007:isub            
	//  541 1008:iload           4
	//  542 1010:isub            
	//  543 1011:iload           5
	//  544 1013:isub            
	//  545 1014:iastore         
					}
					j1 = ((int) (k.a[0]));
	//  546 1015:aload_0         
	//  547 1016:getfield        #163 <Field bno k>
	//  548 1019:getfield        #245 <Field byte[] bno.a>
	//  549 1022:iconst_0        
	//  550 1023:baload          
	//  551 1024:istore_2        
					k1 = ((int) (k.a[1]));
	//  552 1025:aload_0         
	//  553 1026:getfield        #163 <Field bno k>
	//  554 1029:getfield        #245 <Field byte[] bno.a>
	//  555 1032:iconst_1        
	//  556 1033:baload          
	//  557 1034:istore          4
					J = E + a(j1 << 8 | k1 & 0xff);
	//  558 1036:aload_0         
	//  559 1037:aload_0         
	//  560 1038:getfield        #134 <Field long E>
	//  561 1041:aload_0         
	//  562 1042:iload_2         
	//  563 1043:bipush          8
	//  564 1045:ishl            
	//  565 1046:iload           4
	//  566 1048:sipush          255
	//  567 1051:iand            
	//  568 1052:ior             
	//  569 1053:i2l             
	//  570 1054:invokespecial   #502 <Method long a(long)>
	//  571 1057:ladd            
	//  572 1058:putfield        #504 <Field long J>
					if((k.a[2] & 8) == 8)
	//* 573 1061:aload_0         
	//* 574 1062:getfield        #163 <Field bno k>
	//* 575 1065:getfield        #245 <Field byte[] bno.a>
	//* 576 1068:iconst_2        
	//* 577 1069:baload          
	//* 578 1070:bipush          8
	//* 579 1072:iand            
	//* 580 1073:bipush          8
	//* 581 1075:icmpne          1084
						k1 = 1;
	//  582 1078:iconst_1        
	//  583 1079:istore          4
					else
	//* 584 1081:goto            1087
						k1 = 0;
	//  585 1084:iconst_0        
	//  586 1085:istore          4
					if(bgg4.c != 2 && (i1 != 163 || (k.a[2] & 0x80) != 128))
	//* 587 1087:aload           15
	//* 588 1089:getfield        #506 <Field int bgg.c>
	//* 589 1092:iconst_2        
	//* 590 1093:icmpeq          1130
	//* 591 1096:iload_1         
	//* 592 1097:sipush          163
	//* 593 1100:icmpne          1125
	//* 594 1103:aload_0         
	//* 595 1104:getfield        #163 <Field bno k>
	//* 596 1107:getfield        #245 <Field byte[] bno.a>
	//* 597 1110:iconst_2        
	//* 598 1111:baload          
	//* 599 1112:sipush          128
	//* 600 1115:iand            
	//* 601 1116:sipush          128
	//* 602 1119:icmpne          1125
	//* 603 1122:goto            1130
						j1 = 0;
	//  604 1125:iconst_0        
	//  605 1126:istore_2        
					else
	//* 606 1127:goto            1132
						j1 = 1;
	//  607 1130:iconst_1        
	//  608 1131:istore_2        
					if(k1 != 0)
	//* 609 1132:iload           4
	//* 610 1134:ifeq            1145
						k1 = 0x80000000;
	//  611 1137:ldc2            #507 <Int 0x80000000>
	//  612 1140:istore          4
					else
	//* 613 1142:goto            1148
						k1 = 0;
	//  614 1145:iconst_0        
	//  615 1146:istore          4
					Q = j1 | k1;
	//  616 1148:aload_0         
	//  617 1149:iload_2         
	//  618 1150:iload           4
	//  619 1152:ior             
	//  620 1153:putfield        #289 <Field int Q>
					I = 2;
	//  621 1156:aload_0         
	//  622 1157:iconst_2        
	//  623 1158:putfield        #469 <Field int I>
					L = 0;
	//  624 1161:aload_0         
	//  625 1162:iconst_0        
	//  626 1163:putfield        #509 <Field int L>
					break label0;
	//  627 1166:goto            1217
				}
				bfo1 = ((bfo) (new StringBuilder(36)));
	//  628 1169:new             #439 <Class StringBuilder>
	//  629 1172:dup             
	//  630 1173:bipush          36
	//  631 1175:invokespecial   #440 <Method void StringBuilder(int)>
	//  632 1178:astore_3        
				((StringBuilder) (bfo1)).append("Unexpected lacing value: ");
	//  633 1179:aload_3         
	//  634 1180:ldc2            #511 <String "Unexpected lacing value: ">
	//  635 1183:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  636 1186:pop             
				((StringBuilder) (bfo1)).append(k1);
	//  637 1187:aload_3         
	//  638 1188:iload           4
	//  639 1190:invokevirtual   #449 <Method StringBuilder StringBuilder.append(int)>
	//  640 1193:pop             
				throw new bdj(((StringBuilder) (bfo1)).toString());
	//  641 1194:new             #233 <Class bdj>
	//  642 1197:dup             
	//  643 1198:aload_3         
	//  644 1199:invokevirtual   #453 <Method String StringBuilder.toString()>
	//  645 1202:invokespecial   #238 <Method void bdj(String)>
	//  646 1205:athrow          
			}
			throw new bdj("Lacing only supported in SimpleBlocks.");
	//  647 1206:new             #233 <Class bdj>
	//  648 1209:dup             
	//  649 1210:ldc2            #513 <String "Lacing only supported in SimpleBlocks.">
	//  650 1213:invokespecial   #238 <Method void bdj(String)>
	//  651 1216:athrow          
		}
		if(i1 == 163)
		{
			do
	//* 652 1217:iload_1         
	//* 653 1218:sipush          163
	//* 654 1221:icmpne          1295
			{
				i1 = L;
	//  655 1224:aload_0         
	//  656 1225:getfield        #509 <Field int L>
	//  657 1228:istore_1        
				if(i1 < M)
	//* 658 1229:iload_1         
	//* 659 1230:aload_0         
	//* 660 1231:getfield        #485 <Field int M>
	//* 661 1234:icmpge          1289
				{
					a(bfo1, bgg4, N[i1]);
	//  662 1237:aload_0         
	//  663 1238:aload_3         
	//  664 1239:aload           15
	//  665 1241:aload_0         
	//  666 1242:getfield        #487 <Field int[] N>
	//  667 1245:iload_1         
	//  668 1246:iaload          
	//  669 1247:invokespecial   #515 <Method void a(bfo, bgg, int)>
					a(bgg4, J + (long)((L * bgg4.d) / 1000));
	//  670 1250:aload_0         
	//  671 1251:aload           15
	//  672 1253:aload_0         
	//  673 1254:getfield        #504 <Field long J>
	//  674 1257:aload_0         
	//  675 1258:getfield        #509 <Field int L>
	//  676 1261:aload           15
	//  677 1263:getfield        #517 <Field int bgg.d>
	//  678 1266:imul            
	//  679 1267:sipush          1000
	//  680 1270:idiv            
	//  681 1271:i2l             
	//  682 1272:ladd            
	//  683 1273:invokespecial   #519 <Method void a(bgg, long)>
					L = L + 1;
	//  684 1276:aload_0         
	//  685 1277:aload_0         
	//  686 1278:getfield        #509 <Field int L>
	//  687 1281:iconst_1        
	//  688 1282:iadd            
	//  689 1283:putfield        #509 <Field int L>
				} else
	//* 690 1286:goto            1224
				{
					I = 0;
	//  691 1289:aload_0         
	//  692 1290:iconst_0        
	//  693 1291:putfield        #469 <Field int I>
					return;
	//  694 1294:return          
				}
			} while(true);
		} else
		{
			a(bfo1, bgg4, N[0]);
	//  695 1295:aload_0         
	//  696 1296:aload_3         
	//  697 1297:aload           15
	//  698 1299:aload_0         
	//  699 1300:getfield        #487 <Field int[] N>
	//  700 1303:iconst_0        
	//  701 1304:iaload          
	//  702 1305:invokespecial   #515 <Method void a(bfo, bgg, int)>
			return;
	//  703 1308:return          
		}
	}

	final void a(int i1, long l1)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
		switch(i1)
	//*   4    6:iload_1         
		{
	//*   5    7:lookupswitch    34: default 288
	//	               131: 1223
	//	               136: 1196
	//	               155: 1186
	//	               159: 1176
	//	               176: 1166
	//	               179: 1153
	//	               186: 1143
	//	               215: 1133
	//	               231: 1123
	//	               241: 1102
	//	               251: 1096
	//	               16980: 1038
	//	               17029: 974
	//	               17143: 918
	//	               18401: 860
	//	               18408: 804
	//	               20529: 748
	//	               20530: 692
	//	               21420: 681
	//	               21432: 608
	//	               21680: 598
	//	               21682: 588
	//	               21690: 578
	//	               21930: 555
	//	               21945: 510
	//	               21946: 435
	//	               21947: 353
	//	               21948: 343
	//	               21949: 333
	//	               22186: 324
	//	               22203: 315
	//	               25188: 305
	//	               2352003: 295
	//	               2807729: 289
		default:
			return;
	//    6  288:return          

		case 2807729: 
			u = l1;
	//    7  289:aload_0         
	//    8  290:lload_2         
	//    9  291:putfield        #124 <Field long u>
			return;
	//   10  294:return          

		case 2352003: 
			x.d = (int)l1;
	//   11  295:aload_0         
	//   12  296:getfield        #412 <Field bgg x>
	//   13  299:lload_2         
	//   14  300:l2i             
	//   15  301:putfield        #517 <Field int bgg.d>
			return;
	//   16  304:return          

		case 25188: 
			x.H = (int)l1;
	//   17  305:aload_0         
	//   18  306:getfield        #412 <Field bgg x>
	//   19  309:lload_2         
	//   20  310:l2i             
	//   21  311:putfield        #522 <Field int bgg.H>
			return;
	//   22  314:return          

		case 22203: 
			x.K = l1;
	//   23  315:aload_0         
	//   24  316:getfield        #412 <Field bgg x>
	//   25  319:lload_2         
	//   26  320:putfield        #523 <Field long bgg.K>
			return;
	//   27  323:return          

		case 22186: 
			x.J = l1;
	//   28  324:aload_0         
	//   29  325:getfield        #412 <Field bgg x>
	//   30  328:lload_2         
	//   31  329:putfield        #524 <Field long bgg.J>
			return;
	//   32  332:return          

		case 21949: 
			x.v = (int)l1;
	//   33  333:aload_0         
	//   34  334:getfield        #412 <Field bgg x>
	//   35  337:lload_2         
	//   36  338:l2i             
	//   37  339:putfield        #526 <Field int bgg.v>
			return;
	//   38  342:return          

		case 21948: 
			x.u = (int)l1;
	//   39  343:aload_0         
	//   40  344:getfield        #412 <Field bgg x>
	//   41  347:lload_2         
	//   42  348:l2i             
	//   43  349:putfield        #528 <Field int bgg.u>
			return;
	//   44  352:return          

		case 21947: 
			bgg bgg1 = x;
	//   45  353:aload_0         
	//   46  354:getfield        #412 <Field bgg x>
	//   47  357:astore          6
			bgg1.q = true;
	//   48  359:aload           6
	//   49  361:iconst_1        
	//   50  362:putfield        #530 <Field boolean bgg.q>
			i1 = (int)l1;
	//   51  365:lload_2         
	//   52  366:l2i             
	//   53  367:istore_1        
			if(i1 != 1)
	//*  54  368:iload_1         
	//*  55  369:iconst_1        
	//*  56  370:icmpeq          428
			{
				if(i1 != 9)
	//*  57  373:iload_1         
	//*  58  374:bipush          9
	//*  59  376:icmpeq          420
				{
					switch(i1)
	//*  60  379:iload_1         
					{
	//*  61  380:tableswitch     4 7: default 412
	//	               4 413
	//	               5 413
	//	               6 413
	//	               7 413
					default:
						return;
	//   62  412:return          

					case 4: // '\004'
					case 5: // '\005'
					case 6: // '\006'
					case 7: // '\007'
						bgg1.r = 2;
	//   63  413:aload           6
	//   64  415:iconst_2        
	//   65  416:putfield        #532 <Field int bgg.r>
						break;
					}
					return;
	//   66  419:return          
				} else
				{
					bgg1.r = 6;
	//   67  420:aload           6
	//   68  422:bipush          6
	//   69  424:putfield        #532 <Field int bgg.r>
					return;
	//   70  427:return          
				}
			} else
			{
				bgg1.r = 1;
	//   71  428:aload           6
	//   72  430:iconst_1        
	//   73  431:putfield        #532 <Field int bgg.r>
				return;
	//   74  434:return          
			}

		case 21946: 
			i1 = (int)l1;
	//   75  435:lload_2         
	//   76  436:l2i             
	//   77  437:istore_1        
			if(i1 != 1)
	//*  78  438:iload_1         
	//*  79  439:iconst_1        
	//*  80  440:icmpeq          501
				if(i1 != 16)
	//*  81  443:iload_1         
	//*  82  444:bipush          16
	//*  83  446:icmpeq          491
				{
					if(i1 != 18)
	//*  84  449:iload_1         
	//*  85  450:bipush          18
	//*  86  452:icmpeq          481
					{
						switch(i1)
	//*  87  455:iload_1         
						{
	//*  88  456:tableswitch     6 7: default 480
	//	               6 501
	//	               7 501
						default:
							return;
	//   89  480:return          

						case 6: // '\006'
						case 7: // '\007'
							break;
						}
					} else
					{
						x.s = 7;
	//   90  481:aload_0         
	//   91  482:getfield        #412 <Field bgg x>
	//   92  485:bipush          7
	//   93  487:putfield        #534 <Field int bgg.s>
						return;
	//   94  490:return          
					}
				} else
				{
					x.s = 6;
	//   95  491:aload_0         
	//   96  492:getfield        #412 <Field bgg x>
	//   97  495:bipush          6
	//   98  497:putfield        #534 <Field int bgg.s>
					return;
	//   99  500:return          
				}
			x.s = 3;
	//  100  501:aload_0         
	//  101  502:getfield        #412 <Field bgg x>
	//  102  505:iconst_3        
	//  103  506:putfield        #534 <Field int bgg.s>
			return;
	//  104  509:return          

		case 21945: 
			switch((int)l1)
	//* 105  510:lload_2         
	//* 106  511:l2i             
			{
	//* 107  512:tableswitch     1 2: default 536
	//	               1 546
	//	               2 537
			default:
				return;
	//  108  536:return          

			case 2: // '\002'
				x.t = 1;
	//  109  537:aload_0         
	//  110  538:getfield        #412 <Field bgg x>
	//  111  541:iconst_1        
	//  112  542:putfield        #536 <Field int bgg.t>
				return;
	//  113  545:return          

			case 1: // '\001'
				x.t = 2;
	//  114  546:aload_0         
	//  115  547:getfield        #412 <Field bgg x>
	//  116  550:iconst_2        
	//  117  551:putfield        #536 <Field int bgg.t>
				return;
	//  118  554:return          
			}

		case 21930: 
			bgg bgg2 = x;
	//  119  555:aload_0         
	//  120  556:getfield        #412 <Field bgg x>
	//  121  559:astore          6
			if(l1 == 1L)
	//* 122  561:lload_2         
	//* 123  562:lconst_1        
	//* 124  563:lcmp            
	//* 125  564:ifne            570
				flag = true;
	//  126  567:iconst_1        
	//  127  568:istore          4
			bgg2.M = flag;
	//  128  570:aload           6
	//  129  572:iload           4
	//  130  574:putfield        #538 <Field boolean bgg.M>
			return;
	//  131  577:return          

		case 21690: 
			x.m = (int)l1;
	//  132  578:aload_0         
	//  133  579:getfield        #412 <Field bgg x>
	//  134  582:lload_2         
	//  135  583:l2i             
	//  136  584:putfield        #540 <Field int bgg.m>
			return;
	//  137  587:return          

		case 21682: 
			x.n = (int)l1;
	//  138  588:aload_0         
	//  139  589:getfield        #412 <Field bgg x>
	//  140  592:lload_2         
	//  141  593:l2i             
	//  142  594:putfield        #542 <Field int bgg.n>
			return;
	//  143  597:return          

		case 21680: 
			x.l = (int)l1;
	//  144  598:aload_0         
	//  145  599:getfield        #412 <Field bgg x>
	//  146  602:lload_2         
	//  147  603:l2i             
	//  148  604:putfield        #544 <Field int bgg.l>
			return;
	//  149  607:return          

		case 21432: 
			i1 = (int)l1;
	//  150  608:lload_2         
	//  151  609:l2i             
	//  152  610:istore_1        
			if(i1 != 3)
	//* 153  611:iload_1         
	//* 154  612:iconst_3        
	//* 155  613:icmpeq          672
			{
				if(i1 != 15)
	//* 156  616:iload_1         
	//* 157  617:bipush          15
	//* 158  619:icmpeq          663
				{
					switch(i1)
	//* 159  622:iload_1         
					{
	//* 160  623:tableswitch     0 1: default 644
	//	               0 654
	//	               1 645
					default:
						return;
	//  161  644:return          

					case 1: // '\001'
						x.p = 2;
	//  162  645:aload_0         
	//  163  646:getfield        #412 <Field bgg x>
	//  164  649:iconst_2        
	//  165  650:putfield        #546 <Field int bgg.p>
						return;
	//  166  653:return          

					case 0: // '\0'
						x.p = 0;
	//  167  654:aload_0         
	//  168  655:getfield        #412 <Field bgg x>
	//  169  658:iconst_0        
	//  170  659:putfield        #546 <Field int bgg.p>
						return;
	//  171  662:return          
					}
				} else
				{
					x.p = 3;
	//  172  663:aload_0         
	//  173  664:getfield        #412 <Field bgg x>
	//  174  667:iconst_3        
	//  175  668:putfield        #546 <Field int bgg.p>
					return;
	//  176  671:return          
				}
			} else
			{
				x.p = 1;
	//  177  672:aload_0         
	//  178  673:getfield        #412 <Field bgg x>
	//  179  676:iconst_1        
	//  180  677:putfield        #546 <Field int bgg.p>
				return;
	//  181  680:return          
			}

		case 21420: 
			A = l1 + t;
	//  182  681:aload_0         
	//  183  682:lload_2         
	//  184  683:aload_0         
	//  185  684:getfield        #120 <Field long t>
	//  186  687:ladd            
	//  187  688:putfield        #548 <Field long A>
			return;
	//  188  691:return          

		case 20530: 
			if(l1 == 1L)
	//* 189  692:lload_2         
	//* 190  693:lconst_1        
	//* 191  694:lcmp            
	//* 192  695:ifne            699
			{
				return;
	//  193  698:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder(55);
	//  194  699:new             #439 <Class StringBuilder>
	//  195  702:dup             
	//  196  703:bipush          55
	//  197  705:invokespecial   #440 <Method void StringBuilder(int)>
	//  198  708:astore          6
				stringbuilder.append("ContentEncodingScope ");
	//  199  710:aload           6
	//  200  712:ldc2            #550 <String "ContentEncodingScope ">
	//  201  715:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  202  718:pop             
				stringbuilder.append(l1);
	//  203  719:aload           6
	//  204  721:lload_2         
	//  205  722:invokevirtual   #553 <Method StringBuilder StringBuilder.append(long)>
	//  206  725:pop             
				stringbuilder.append(" not supported");
	//  207  726:aload           6
	//  208  728:ldc2            #555 <String " not supported">
	//  209  731:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  210  734:pop             
				throw new bdj(stringbuilder.toString());
	//  211  735:new             #233 <Class bdj>
	//  212  738:dup             
	//  213  739:aload           6
	//  214  741:invokevirtual   #453 <Method String StringBuilder.toString()>
	//  215  744:invokespecial   #238 <Method void bdj(String)>
	//  216  747:athrow          
			}

		case 20529: 
			if(l1 == 0L)
	//* 217  748:lload_2         
	//* 218  749:lconst_0        
	//* 219  750:lcmp            
	//* 220  751:ifne            755
			{
				return;
	//  221  754:return          
			} else
			{
				StringBuilder stringbuilder1 = new StringBuilder(55);
	//  222  755:new             #439 <Class StringBuilder>
	//  223  758:dup             
	//  224  759:bipush          55
	//  225  761:invokespecial   #440 <Method void StringBuilder(int)>
	//  226  764:astore          6
				stringbuilder1.append("ContentEncodingOrder ");
	//  227  766:aload           6
	//  228  768:ldc2            #557 <String "ContentEncodingOrder ">
	//  229  771:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  230  774:pop             
				stringbuilder1.append(l1);
	//  231  775:aload           6
	//  232  777:lload_2         
	//  233  778:invokevirtual   #553 <Method StringBuilder StringBuilder.append(long)>
	//  234  781:pop             
				stringbuilder1.append(" not supported");
	//  235  782:aload           6
	//  236  784:ldc2            #555 <String " not supported">
	//  237  787:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  238  790:pop             
				throw new bdj(stringbuilder1.toString());
	//  239  791:new             #233 <Class bdj>
	//  240  794:dup             
	//  241  795:aload           6
	//  242  797:invokevirtual   #453 <Method String StringBuilder.toString()>
	//  243  800:invokespecial   #238 <Method void bdj(String)>
	//  244  803:athrow          
			}

		case 18408: 
			if(l1 == 1L)
	//* 245  804:lload_2         
	//* 246  805:lconst_1        
	//* 247  806:lcmp            
	//* 248  807:ifne            811
			{
				return;
	//  249  810:return          
			} else
			{
				StringBuilder stringbuilder2 = new StringBuilder(56);
	//  250  811:new             #439 <Class StringBuilder>
	//  251  814:dup             
	//  252  815:bipush          56
	//  253  817:invokespecial   #440 <Method void StringBuilder(int)>
	//  254  820:astore          6
				stringbuilder2.append("AESSettingsCipherMode ");
	//  255  822:aload           6
	//  256  824:ldc2            #559 <String "AESSettingsCipherMode ">
	//  257  827:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  258  830:pop             
				stringbuilder2.append(l1);
	//  259  831:aload           6
	//  260  833:lload_2         
	//  261  834:invokevirtual   #553 <Method StringBuilder StringBuilder.append(long)>
	//  262  837:pop             
				stringbuilder2.append(" not supported");
	//  263  838:aload           6
	//  264  840:ldc2            #555 <String " not supported">
	//  265  843:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  266  846:pop             
				throw new bdj(stringbuilder2.toString());
	//  267  847:new             #233 <Class bdj>
	//  268  850:dup             
	//  269  851:aload           6
	//  270  853:invokevirtual   #453 <Method String StringBuilder.toString()>
	//  271  856:invokespecial   #238 <Method void bdj(String)>
	//  272  859:athrow          
			}

		case 18401: 
			if(l1 == 5L)
	//* 273  860:lload_2         
	//* 274  861:ldc2w           #560 <Long 5L>
	//* 275  864:lcmp            
	//* 276  865:ifne            869
			{
				return;
	//  277  868:return          
			} else
			{
				StringBuilder stringbuilder3 = new StringBuilder(49);
	//  278  869:new             #439 <Class StringBuilder>
	//  279  872:dup             
	//  280  873:bipush          49
	//  281  875:invokespecial   #440 <Method void StringBuilder(int)>
	//  282  878:astore          6
				stringbuilder3.append("ContentEncAlgo ");
	//  283  880:aload           6
	//  284  882:ldc2            #563 <String "ContentEncAlgo ">
	//  285  885:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  286  888:pop             
				stringbuilder3.append(l1);
	//  287  889:aload           6
	//  288  891:lload_2         
	//  289  892:invokevirtual   #553 <Method StringBuilder StringBuilder.append(long)>
	//  290  895:pop             
				stringbuilder3.append(" not supported");
	//  291  896:aload           6
	//  292  898:ldc2            #555 <String " not supported">
	//  293  901:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  294  904:pop             
				throw new bdj(stringbuilder3.toString());
	//  295  905:new             #233 <Class bdj>
	//  296  908:dup             
	//  297  909:aload           6
	//  298  911:invokevirtual   #453 <Method String StringBuilder.toString()>
	//  299  914:invokespecial   #238 <Method void bdj(String)>
	//  300  917:athrow          
			}

		case 17143: 
			if(l1 == 1L)
	//* 301  918:lload_2         
	//* 302  919:lconst_1        
	//* 303  920:lcmp            
	//* 304  921:ifne            925
			{
				return;
	//  305  924:return          
			} else
			{
				StringBuilder stringbuilder4 = new StringBuilder(50);
	//  306  925:new             #439 <Class StringBuilder>
	//  307  928:dup             
	//  308  929:bipush          50
	//  309  931:invokespecial   #440 <Method void StringBuilder(int)>
	//  310  934:astore          6
				stringbuilder4.append("EBMLReadVersion ");
	//  311  936:aload           6
	//  312  938:ldc2            #565 <String "EBMLReadVersion ">
	//  313  941:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  314  944:pop             
				stringbuilder4.append(l1);
	//  315  945:aload           6
	//  316  947:lload_2         
	//  317  948:invokevirtual   #553 <Method StringBuilder StringBuilder.append(long)>
	//  318  951:pop             
				stringbuilder4.append(" not supported");
	//  319  952:aload           6
	//  320  954:ldc2            #555 <String " not supported">
	//  321  957:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  322  960:pop             
				throw new bdj(stringbuilder4.toString());
	//  323  961:new             #233 <Class bdj>
	//  324  964:dup             
	//  325  965:aload           6
	//  326  967:invokevirtual   #453 <Method String StringBuilder.toString()>
	//  327  970:invokespecial   #238 <Method void bdj(String)>
	//  328  973:athrow          
			}

		case 17029: 
			if(l1 >= 1L && l1 <= 2L)
	//* 329  974:lload_2         
	//* 330  975:lconst_1        
	//* 331  976:lcmp            
	//* 332  977:iflt            989
	//* 333  980:lload_2         
	//* 334  981:ldc2w           #566 <Long 2L>
	//* 335  984:lcmp            
	//* 336  985:ifgt            989
			{
				return;
	//  337  988:return          
			} else
			{
				StringBuilder stringbuilder5 = new StringBuilder(53);
	//  338  989:new             #439 <Class StringBuilder>
	//  339  992:dup             
	//  340  993:bipush          53
	//  341  995:invokespecial   #440 <Method void StringBuilder(int)>
	//  342  998:astore          6
				stringbuilder5.append("DocTypeReadVersion ");
	//  343 1000:aload           6
	//  344 1002:ldc2            #569 <String "DocTypeReadVersion ">
	//  345 1005:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  346 1008:pop             
				stringbuilder5.append(l1);
	//  347 1009:aload           6
	//  348 1011:lload_2         
	//  349 1012:invokevirtual   #553 <Method StringBuilder StringBuilder.append(long)>
	//  350 1015:pop             
				stringbuilder5.append(" not supported");
	//  351 1016:aload           6
	//  352 1018:ldc2            #555 <String " not supported">
	//  353 1021:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  354 1024:pop             
				throw new bdj(stringbuilder5.toString());
	//  355 1025:new             #233 <Class bdj>
	//  356 1028:dup             
	//  357 1029:aload           6
	//  358 1031:invokevirtual   #453 <Method String StringBuilder.toString()>
	//  359 1034:invokespecial   #238 <Method void bdj(String)>
	//  360 1037:athrow          
			}

		case 16980: 
			if(l1 == 3L)
	//* 361 1038:lload_2         
	//* 362 1039:ldc2w           #570 <Long 3L>
	//* 363 1042:lcmp            
	//* 364 1043:ifne            1047
			{
				return;
	//  365 1046:return          
			} else
			{
				StringBuilder stringbuilder6 = new StringBuilder(50);
	//  366 1047:new             #439 <Class StringBuilder>
	//  367 1050:dup             
	//  368 1051:bipush          50
	//  369 1053:invokespecial   #440 <Method void StringBuilder(int)>
	//  370 1056:astore          6
				stringbuilder6.append("ContentCompAlgo ");
	//  371 1058:aload           6
	//  372 1060:ldc2            #573 <String "ContentCompAlgo ">
	//  373 1063:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  374 1066:pop             
				stringbuilder6.append(l1);
	//  375 1067:aload           6
	//  376 1069:lload_2         
	//  377 1070:invokevirtual   #553 <Method StringBuilder StringBuilder.append(long)>
	//  378 1073:pop             
				stringbuilder6.append(" not supported");
	//  379 1074:aload           6
	//  380 1076:ldc2            #555 <String " not supported">
	//  381 1079:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//  382 1082:pop             
				throw new bdj(stringbuilder6.toString());
	//  383 1083:new             #233 <Class bdj>
	//  384 1086:dup             
	//  385 1087:aload           6
	//  386 1089:invokevirtual   #453 <Method String StringBuilder.toString()>
	//  387 1092:invokespecial   #238 <Method void bdj(String)>
	//  388 1095:athrow          
			}

		case 251: 
			ab = true;
	//  389 1096:aload_0         
	//  390 1097:iconst_1        
	//  391 1098:putfield        #575 <Field boolean ab>
			return;
	//  392 1101:return          

		case 241: 
			if(!H)
	//* 393 1102:aload_0         
	//* 394 1103:getfield        #577 <Field boolean H>
	//* 395 1106:ifne            1233
			{
				G.a(l1);
	//  396 1109:aload_0         
	//  397 1110:getfield        #579 <Field bni G>
	//  398 1113:lload_2         
	//  399 1114:invokevirtual   #584 <Method void bni.a(long)>
				H = true;
	//  400 1117:aload_0         
	//  401 1118:iconst_1        
	//  402 1119:putfield        #577 <Field boolean H>
				return;
	//  403 1122:return          
			} else
	//* 404 1123:aload_0         
	//* 405 1124:aload_0         
	//* 406 1125:lload_2         
	//* 407 1126:invokespecial   #502 <Method long a(long)>
	//* 408 1129:putfield        #134 <Field long E>
	//* 409 1132:return          
	//* 410 1133:aload_0         
	//* 411 1134:getfield        #412 <Field bgg x>
	//* 412 1137:lload_2         
	//* 413 1138:l2i             
	//* 414 1139:putfield        #586 <Field int bgg.b>
	//* 415 1142:return          
	//* 416 1143:aload_0         
	//* 417 1144:getfield        #412 <Field bgg x>
	//* 418 1147:lload_2         
	//* 419 1148:l2i             
	//* 420 1149:putfield        #588 <Field int bgg.k>
	//* 421 1152:return          
	//* 422 1153:aload_0         
	//* 423 1154:getfield        #590 <Field bni F>
	//* 424 1157:aload_0         
	//* 425 1158:lload_2         
	//* 426 1159:invokespecial   #502 <Method long a(long)>
	//* 427 1162:invokevirtual   #584 <Method void bni.a(long)>
	//* 428 1165:return          
	//* 429 1166:aload_0         
	//* 430 1167:getfield        #412 <Field bgg x>
	//* 431 1170:lload_2         
	//* 432 1171:l2i             
	//* 433 1172:putfield        #592 <Field int bgg.j>
	//* 434 1175:return          
	//* 435 1176:aload_0         
	//* 436 1177:getfield        #412 <Field bgg x>
	//* 437 1180:lload_2         
	//* 438 1181:l2i             
	//* 439 1182:putfield        #594 <Field int bgg.G>
	//* 440 1185:return          
	//* 441 1186:aload_0         
	//* 442 1187:aload_0         
	//* 443 1188:lload_2         
	//* 444 1189:invokespecial   #502 <Method long a(long)>
	//* 445 1192:putfield        #341 <Field long K>
	//* 446 1195:return          
	//* 447 1196:aload_0         
	//* 448 1197:getfield        #412 <Field bgg x>
	//* 449 1200:astore          6
	//* 450 1202:iload           5
	//* 451 1204:istore          4
	//* 452 1206:lload_2         
	//* 453 1207:lconst_1        
	//* 454 1208:lcmp            
	//* 455 1209:ifne            1215
	//* 456 1212:iconst_1        
	//* 457 1213:istore          4
	//* 458 1215:aload           6
	//* 459 1217:iload           4
	//* 460 1219:putfield        #596 <Field boolean bgg.L>
	//* 461 1222:return          
	//* 462 1223:aload_0         
	//* 463 1224:getfield        #412 <Field bgg x>
	//* 464 1227:lload_2         
	//* 465 1228:l2i             
	//* 466 1229:putfield        #506 <Field int bgg.c>
	//* 467 1232:return          
			{
				return;
	//  468 1233:return          
			}

		case 231: 
			E = a(l1);
			return;

		case 215: 
			x.b = (int)l1;
			return;

		case 186: 
			x.k = (int)l1;
			return;

		case 179: 
			F.a(a(l1));
			return;

		case 176: 
			x.j = (int)l1;
			return;

		case 159: 
			x.G = (int)l1;
			return;

		case 155: 
			K = a(l1);
			return;

		case 136: 
			bgg bgg3 = x;
			boolean flag1 = flag2;
			if(l1 == 1L)
				flag1 = true;
			bgg3.L = flag1;
			return;

		case 131: 
			x.c = (int)l1;
			return;
		}
	}

	final void a(int i1, long l1, long l2)
	{
		if(i1 != 160)
	//*   0    0:iload_1         
	//*   1    1:sipush          160
	//*   2    4:icmpeq          250
		{
			if(i1 != 174)
	//*   3    7:iload_1         
	//*   4    8:sipush          174
	//*   5   11:icmpeq          237
			{
				if(i1 != 187)
	//*   6   14:iload_1         
	//*   7   15:sipush          187
	//*   8   18:icmpeq          231
				{
					if(i1 != 19899)
	//*   9   21:iload_1         
	//*  10   22:sipush          19899
	//*  11   25:icmpeq          218
					{
						if(i1 != 20533)
	//*  12   28:iload_1         
	//*  13   29:sipush          20533
	//*  14   32:icmpeq          209
						{
							if(i1 != 21968)
	//*  15   35:iload_1         
	//*  16   36:sipush          21968
	//*  17   39:icmpeq          200
							{
								if(i1 != 25152)
	//*  18   42:iload_1         
	//*  19   43:sipush          25152
	//*  20   46:icmpeq          199
								{
									if(i1 != 0x18538067)
	//*  21   49:iload_1         
	//*  22   50:ldc2            #598 <Int 0x18538067>
	//*  23   53:icmpeq          151
									{
										if(i1 != 0x1c53bb6b)
	//*  24   56:iload_1         
	//*  25   57:ldc2            #393 <Int 0x1c53bb6b>
	//*  26   60:icmpeq          128
										{
											if(i1 != 0x1f43b675)
	//*  27   63:iload_1         
	//*  28   64:ldc2            #392 <Int 0x1f43b675>
	//*  29   67:icmpeq          71
												return;
	//   30   70:return          
											if(!y)
	//*  31   71:aload_0         
	//*  32   72:getfield        #409 <Field boolean y>
	//*  33   75:ifne            208
												if(h && C != -1L)
	//*  34   78:aload_0         
	//*  35   79:getfield        #148 <Field boolean h>
	//*  36   82:ifeq            102
	//*  37   85:aload_0         
	//*  38   86:getfield        #130 <Field long C>
	//*  39   89:ldc2w           #117 <Long -1L>
	//*  40   92:lcmp            
	//*  41   93:ifeq            102
												{
													B = true;
	//   42   96:aload_0         
	//   43   97:iconst_1        
	//   44   98:putfield        #403 <Field boolean B>
													return;
	//   45  101:return          
												} else
												{
													ac.a(((bfu) (new bfv(w))));
	//   46  102:aload_0         
	//   47  103:getfield        #600 <Field bfp ac>
	//   48  106:new             #602 <Class bfv>
	//   49  109:dup             
	//   50  110:aload_0         
	//   51  111:getfield        #128 <Field long w>
	//   52  114:invokespecial   #604 <Method void bfv(long)>
	//   53  117:invokeinterface #609 <Method void bfp.a(bfu)>
													y = true;
	//   54  122:aload_0         
	//   55  123:iconst_1        
	//   56  124:putfield        #409 <Field boolean y>
													return;
	//   57  127:return          
												}
										} else
										{
											F = new bni();
	//   58  128:aload_0         
	//   59  129:new             #581 <Class bni>
	//   60  132:dup             
	//   61  133:invokespecial   #610 <Method void bni()>
	//   62  136:putfield        #590 <Field bni F>
											G = new bni();
	//   63  139:aload_0         
	//   64  140:new             #581 <Class bni>
	//   65  143:dup             
	//   66  144:invokespecial   #610 <Method void bni()>
	//   67  147:putfield        #579 <Field bni G>
											return;
	//   68  150:return          
										}
									} else
									{
										long l3 = t;
	//   69  151:aload_0         
	//   70  152:getfield        #120 <Field long t>
	//   71  155:lstore          6
										if(l3 != -1L && l3 != l1)
	//*  72  157:lload           6
	//*  73  159:ldc2w           #117 <Long -1L>
	//*  74  162:lcmp            
	//*  75  163:ifeq            187
	//*  76  166:lload           6
	//*  77  168:lload_2         
	//*  78  169:lcmp            
	//*  79  170:ifne            176
	//*  80  173:goto            187
										{
											throw new bdj("Multiple Segment elements not supported");
	//   81  176:new             #233 <Class bdj>
	//   82  179:dup             
	//   83  180:ldc2            #612 <String "Multiple Segment elements not supported">
	//   84  183:invokespecial   #238 <Method void bdj(String)>
	//   85  186:athrow          
										} else
										{
											t = l1;
	//   86  187:aload_0         
	//   87  188:lload_2         
	//   88  189:putfield        #120 <Field long t>
											s = l2;
	//   89  192:aload_0         
	//   90  193:lload           4
	//   91  195:putfield        #614 <Field long s>
											return;
	//   92  198:return          
										}
									}
								} else
								{
									return;
	//   93  199:return          
								}
							} else
							{
								x.q = true;
	//   94  200:aload_0         
	//   95  201:getfield        #412 <Field bgg x>
	//   96  204:iconst_1        
	//   97  205:putfield        #530 <Field boolean bgg.q>
							}
							return;
	//   98  208:return          
						} else
						{
							x.e = true;
	//   99  209:aload_0         
	//  100  210:getfield        #412 <Field bgg x>
	//  101  213:iconst_1        
	//  102  214:putfield        #287 <Field boolean bgg.e>
							return;
	//  103  217:return          
						}
					} else
					{
						z = -1;
	//  104  218:aload_0         
	//  105  219:iconst_m1       
	//  106  220:putfield        #463 <Field int z>
						A = -1L;
	//  107  223:aload_0         
	//  108  224:ldc2w           #117 <Long -1L>
	//  109  227:putfield        #548 <Field long A>
						return;
	//  110  230:return          
					}
				} else
				{
					H = false;
	//  111  231:aload_0         
	//  112  232:iconst_0        
	//  113  233:putfield        #577 <Field boolean H>
					return;
	//  114  236:return          
				}
			} else
			{
				x = new bgg(((bge) (null)));
	//  115  237:aload_0         
	//  116  238:new             #269 <Class bgg>
	//  117  241:dup             
	//  118  242:aconst_null     
	//  119  243:invokespecial   #617 <Method void bgg(bge)>
	//  120  246:putfield        #412 <Field bgg x>
				return;
	//  121  249:return          
			}
		} else
		{
			ab = false;
	//  122  250:aload_0         
	//  123  251:iconst_0        
	//  124  252:putfield        #575 <Field boolean ab>
			return;
	//  125  255:return          
		}
	}

	final void a(int i1, String s1)
	{
		if(i1 != 134)
	//*   0    0:iload_1         
	//*   1    1:sipush          134
	//*   2    4:icmpeq          106
		{
			if(i1 != 17026)
	//*   3    7:iload_1         
	//*   4    8:sipush          17026
	//*   5   11:icmpeq          32
				if(i1 != 0x22b59c)
	//*   6   14:iload_1         
	//*   7   15:ldc2            #619 <Int 0x22b59c>
	//*   8   18:icmpeq          22
				{
					return;
	//    9   21:return          
				} else
				{
					bgg.a(x, s1);
	//   10   22:aload_0         
	//   11   23:getfield        #412 <Field bgg x>
	//   12   26:aload_2         
	//   13   27:invokestatic    #622 <Method String bgg.a(bgg, String)>
	//   14   30:pop             
					return;
	//   15   31:return          
				}
			if(!"webm".equals(((Object) (s1))))
	//*  16   32:ldc2            #624 <String "webm">
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*  19   39:ifne            105
			{
				if("matroska".equals(((Object) (s1))))
	//*  20   42:ldc2            #626 <String "matroska">
	//*  21   45:aload_2         
	//*  22   46:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*  23   49:ifeq            53
				{
					return;
	//   24   52:return          
				} else
				{
					StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 22);
	//   25   53:new             #439 <Class StringBuilder>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:invokestatic    #629 <Method String String.valueOf(Object)>
	//   29   61:invokevirtual   #632 <Method int String.length()>
	//   30   64:bipush          22
	//   31   66:iadd            
	//   32   67:invokespecial   #440 <Method void StringBuilder(int)>
	//   33   70:astore_3        
					stringbuilder.append("DocType ");
	//   34   71:aload_3         
	//   35   72:ldc2            #634 <String "DocType ">
	//   36   75:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
					stringbuilder.append(s1);
	//   38   79:aload_3         
	//   39   80:aload_2         
	//   40   81:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   41   84:pop             
					stringbuilder.append(" not supported");
	//   42   85:aload_3         
	//   43   86:ldc2            #555 <String " not supported">
	//   44   89:invokevirtual   #446 <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
					throw new bdj(stringbuilder.toString());
	//   46   93:new             #233 <Class bdj>
	//   47   96:dup             
	//   48   97:aload_3         
	//   49   98:invokevirtual   #453 <Method String StringBuilder.toString()>
	//   50  101:invokespecial   #238 <Method void bdj(String)>
	//   51  104:athrow          
				}
			} else
			{
				return;
	//   52  105:return          
			}
		} else
		{
			x.a = s1;
	//   53  106:aload_0         
	//   54  107:getfield        #412 <Field bgg x>
	//   55  110:aload_2         
	//   56  111:putfield        #272 <Field String bgg.a>
			return;
	//   57  114:return          
		}
	}

	public final void a(long l1, long l2)
	{
		E = 0x1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #121 <Long 0x1L>
	//    2    4:putfield        #134 <Field long E>
		I = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #469 <Field int I>
		e.a();
	//    6   12:aload_0         
	//    7   13:getfield        #136 <Field bgb e>
	//    8   16:invokeinterface #635 <Method void bgb.a()>
		f.a();
	//    9   21:aload_0         
	//   10   22:getfield        #153 <Field bgi f>
	//   11   25:invokevirtual   #636 <Method void bgi.a()>
		b();
	//   12   28:aload_0         
	//   13   29:invokespecial   #386 <Method void b()>
	//   14   32:return          
	}

	public final void a(bfp bfp1)
	{
		ac = bfp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #600 <Field bfp ac>
	//    3    5:return          
	}

	public final boolean a(bfo bfo1)
	{
		return (new bgh()).a(bfo1);
	//    0    0:new             #639 <Class bgh>
	//    1    3:dup             
	//    2    4:invokespecial   #640 <Method void bgh()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #641 <Method boolean bgh.a(bfo)>
	//    5   11:ireturn         
	}

	public final void c()
	{
	//    0    0:return          
	}

	final void c(int i1)
	{
label0:
		{
			int j1;
label1:
			{
label2:
				{
label3:
					{
label4:
						{
label5:
							{
label6:
								{
label7:
									{
label8:
										{
											Object obj;
											bfp bfp1;
label9:
											{
												j1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
												boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_3        
												if(i1 == 160)
													break label0;
	//    4    4:iload_1         
	//    5    5:sipush          160
	//    6    8:icmpeq          972
												if(i1 == 174)
													break label1;
	//    7   11:iload_1         
	//    8   12:sipush          174
	//    9   15:icmpeq          603
												if(i1 == 19899)
													break label4;
	//   10   18:iload_1         
	//   11   19:sipush          19899
	//   12   22:icmpeq          552
												if(i1 == 25152)
													break label5;
	//   13   25:iload_1         
	//   14   26:sipush          25152
	//   15   29:icmpeq          476
												if(i1 == 28032)
													break label6;
	//   16   32:iload_1         
	//   17   33:sipush          28032
	//   18   36:icmpeq          444
												if(i1 == 0x1549a966)
													break label7;
	//   19   39:iload_1         
	//   20   40:ldc2            #391 <Int 0x1549a966>
	//   21   43:icmpeq          400
												if(i1 == 0x1654ae6b)
													break label8;
	//   22   46:iload_1         
	//   23   47:ldc2            #394 <Int 0x1654ae6b>
	//   24   50:icmpeq          369
												if(i1 != 0x1c53bb6b)
	//*  25   53:iload_1         
	//*  26   54:ldc2            #393 <Int 0x1c53bb6b>
	//*  27   57:icmpeq          61
													return;
	//   28   60:return          
												if(y)
													break label3;
	//   29   61:aload_0         
	//   30   62:getfield        #409 <Field boolean y>
	//   31   65:ifne            591
												bfp1 = ac;
	//   32   68:aload_0         
	//   33   69:getfield        #600 <Field bfp ac>
	//   34   72:astore          8
												if(t != -1L && w != 0x1L)
	//*  35   74:aload_0         
	//*  36   75:getfield        #120 <Field long t>
	//*  37   78:ldc2w           #117 <Long -1L>
	//*  38   81:lcmp            
	//*  39   82:ifeq            331
	//*  40   85:aload_0         
	//*  41   86:getfield        #128 <Field long w>
	//*  42   89:ldc2w           #121 <Long 0x1L>
	//*  43   92:lcmp            
	//*  44   93:ifeq            331
												{
													obj = ((Object) (F));
	//   45   96:aload_0         
	//   46   97:getfield        #590 <Field bni F>
	//   47  100:astore          7
													if(obj != null && ((bni) (obj)).a() != 0)
	//*  48  102:aload           7
	//*  49  104:ifnull          331
	//*  50  107:aload           7
	//*  51  109:invokevirtual   #643 <Method int bni.a()>
	//*  52  112:ifeq            331
													{
														obj = ((Object) (G));
	//   53  115:aload_0         
	//   54  116:getfield        #579 <Field bni G>
	//   55  119:astore          7
														if(obj != null && ((bni) (obj)).a() == F.a())
	//*  56  121:aload           7
	//*  57  123:ifnull          331
	//*  58  126:aload           7
	//*  59  128:invokevirtual   #643 <Method int bni.a()>
	//*  60  131:aload_0         
	//*  61  132:getfield        #590 <Field bni F>
	//*  62  135:invokevirtual   #643 <Method int bni.a()>
	//*  63  138:icmpeq          144
	//*  64  141:goto            331
														{
															int k1 = F.a();
	//   65  144:aload_0         
	//   66  145:getfield        #590 <Field bni F>
	//   67  148:invokevirtual   #643 <Method int bni.a()>
	//   68  151:istore          4
															int ai[] = new int[k1];
	//   69  153:iload           4
	//   70  155:newarray        int[]
	//   71  157:astore          7
															long al[] = new long[k1];
	//   72  159:iload           4
	//   73  161:newarray        long[]
	//   74  163:astore          9
															long al1[] = new long[k1];
	//   75  165:iload           4
	//   76  167:newarray        long[]
	//   77  169:astore          10
															long al2[] = new long[k1];
	//   78  171:iload           4
	//   79  173:newarray        long[]
	//   80  175:astore          11
															j1 = 0;
	//   81  177:iconst_0        
	//   82  178:istore_2        
															do
															{
																i1 = ((int) (flag));
	//   83  179:iload_3         
	//   84  180:istore_1        
																if(j1 >= k1)
																	break;
	//   85  181:iload_2         
	//   86  182:iload           4
	//   87  184:icmpge          223
																al2[j1] = F.a(j1);
	//   88  187:aload           11
	//   89  189:iload_2         
	//   90  190:aload_0         
	//   91  191:getfield        #590 <Field bni F>
	//   92  194:iload_2         
	//   93  195:invokevirtual   #646 <Method long bni.a(int)>
	//   94  198:lastore         
																al[j1] = t + G.a(j1);
	//   95  199:aload           9
	//   96  201:iload_2         
	//   97  202:aload_0         
	//   98  203:getfield        #120 <Field long t>
	//   99  206:aload_0         
	//  100  207:getfield        #579 <Field bni G>
	//  101  210:iload_2         
	//  102  211:invokevirtual   #646 <Method long bni.a(int)>
	//  103  214:ladd            
	//  104  215:lastore         
																j1++;
	//  105  216:iload_2         
	//  106  217:iconst_1        
	//  107  218:iadd            
	//  108  219:istore_2        
															} while(true);
	//  109  220:goto            179
															do
															{
																j1 = k1 - 1;
	//  110  223:iload           4
	//  111  225:iconst_1        
	//  112  226:isub            
	//  113  227:istore_2        
																if(i1 >= j1)
																	break;
	//  114  228:iload_1         
	//  115  229:iload_2         
	//  116  230:icmpge          269
																j1 = i1 + 1;
	//  117  233:iload_1         
	//  118  234:iconst_1        
	//  119  235:iadd            
	//  120  236:istore_2        
																ai[i1] = (int)(al[j1] - al[i1]);
	//  121  237:aload           7
	//  122  239:iload_1         
	//  123  240:aload           9
	//  124  242:iload_2         
	//  125  243:laload          
	//  126  244:aload           9
	//  127  246:iload_1         
	//  128  247:laload          
	//  129  248:lsub            
	//  130  249:l2i             
	//  131  250:iastore         
																al1[i1] = al2[j1] - al2[i1];
	//  132  251:aload           10
	//  133  253:iload_1         
	//  134  254:aload           11
	//  135  256:iload_2         
	//  136  257:laload          
	//  137  258:aload           11
	//  138  260:iload_1         
	//  139  261:laload          
	//  140  262:lsub            
	//  141  263:lastore         
																i1 = j1;
	//  142  264:iload_2         
	//  143  265:istore_1        
															} while(true);
	//  144  266:goto            223
															ai[j1] = (int)((t + s) - al[j1]);
	//  145  269:aload           7
	//  146  271:iload_2         
	//  147  272:aload_0         
	//  148  273:getfield        #120 <Field long t>
	//  149  276:aload_0         
	//  150  277:getfield        #614 <Field long s>
	//  151  280:ladd            
	//  152  281:aload           9
	//  153  283:iload_2         
	//  154  284:laload          
	//  155  285:lsub            
	//  156  286:l2i             
	//  157  287:iastore         
															al1[j1] = w - al2[j1];
	//  158  288:aload           10
	//  159  290:iload_2         
	//  160  291:aload_0         
	//  161  292:getfield        #128 <Field long w>
	//  162  295:aload           11
	//  163  297:iload_2         
	//  164  298:laload          
	//  165  299:lsub            
	//  166  300:lastore         
															F = null;
	//  167  301:aload_0         
	//  168  302:aconst_null     
	//  169  303:putfield        #590 <Field bni F>
															G = null;
	//  170  306:aload_0         
	//  171  307:aconst_null     
	//  172  308:putfield        #579 <Field bni G>
															ai = ((int []) (new bfj(ai, al, al1, al2)));
	//  173  311:new             #648 <Class bfj>
	//  174  314:dup             
	//  175  315:aload           7
	//  176  317:aload           9
	//  177  319:aload           10
	//  178  321:aload           11
	//  179  323:invokespecial   #651 <Method void bfj(int[], long[], long[], long[])>
	//  180  326:astore          7
															break label9;
	//  181  328:goto            354
														}
													}
												}
												F = null;
	//  182  331:aload_0         
	//  183  332:aconst_null     
	//  184  333:putfield        #590 <Field bni F>
												G = null;
	//  185  336:aload_0         
	//  186  337:aconst_null     
	//  187  338:putfield        #579 <Field bni G>
												ai = ((int []) (new bfv(w)));
	//  188  341:new             #602 <Class bfv>
	//  189  344:dup             
	//  190  345:aload_0         
	//  191  346:getfield        #128 <Field long w>
	//  192  349:invokespecial   #604 <Method void bfv(long)>
	//  193  352:astore          7
											}
											bfp1.a(((bfu) (ai)));
	//  194  354:aload           8
	//  195  356:aload           7
	//  196  358:invokeinterface #609 <Method void bfp.a(bfu)>
											y = true;
	//  197  363:aload_0         
	//  198  364:iconst_1        
	//  199  365:putfield        #409 <Field boolean y>
											return;
	//  200  368:return          
										}
										if(g.size() != 0)
	//* 201  369:aload_0         
	//* 202  370:getfield        #158 <Field SparseArray g>
	//* 203  373:invokevirtual   #654 <Method int SparseArray.size()>
	//* 204  376:ifeq            389
										{
											ac.a();
	//  205  379:aload_0         
	//  206  380:getfield        #600 <Field bfp ac>
	//  207  383:invokeinterface #655 <Method void bfp.a()>
											return;
	//  208  388:return          
										} else
										{
											throw new bdj("No valid tracks were found");
	//  209  389:new             #233 <Class bdj>
	//  210  392:dup             
	//  211  393:ldc2            #657 <String "No valid tracks were found">
	//  212  396:invokespecial   #238 <Method void bdj(String)>
	//  213  399:athrow          
										}
									}
									if(u == 0x1L)
	//* 214  400:aload_0         
	//* 215  401:getfield        #124 <Field long u>
	//* 216  404:ldc2w           #121 <Long 0x1L>
	//* 217  407:lcmp            
	//* 218  408:ifne            418
										u = 0xf4240L;
	//  219  411:aload_0         
	//  220  412:ldc2w           #347 <Long 0xf4240L>
	//  221  415:putfield        #124 <Field long u>
									long l1 = v;
	//  222  418:aload_0         
	//  223  419:getfield        #126 <Field long v>
	//  224  422:lstore          5
									if(l1 != 0x1L)
	//* 225  424:lload           5
	//* 226  426:ldc2w           #121 <Long 0x1L>
	//* 227  429:lcmp            
	//* 228  430:ifeq            591
									{
										w = a(l1);
	//  229  433:aload_0         
	//  230  434:aload_0         
	//  231  435:lload           5
	//  232  437:invokespecial   #502 <Method long a(long)>
	//  233  440:putfield        #128 <Field long w>
										return;
	//  234  443:return          
									}
									break label3;
								}
								if(x.e)
	//* 235  444:aload_0         
	//* 236  445:getfield        #412 <Field bgg x>
	//* 237  448:getfield        #287 <Field boolean bgg.e>
	//* 238  451:ifeq            591
									if(x.f == null)
	//* 239  454:aload_0         
	//* 240  455:getfield        #412 <Field bgg x>
	//* 241  458:getfield        #324 <Field byte[] bgg.f>
	//* 242  461:ifnonnull       465
										return;
	//  243  464:return          
									else
										throw new bdj("Combining encryption and compression is not supported");
	//  244  465:new             #233 <Class bdj>
	//  245  468:dup             
	//  246  469:ldc2            #659 <String "Combining encryption and compression is not supported">
	//  247  472:invokespecial   #238 <Method void bdj(String)>
	//  248  475:athrow          
								break label3;
							}
							if(x.e)
	//* 249  476:aload_0         
	//* 250  477:getfield        #412 <Field bgg x>
	//* 251  480:getfield        #287 <Field boolean bgg.e>
	//* 252  483:ifeq            591
								if(x.g != null)
	//* 253  486:aload_0         
	//* 254  487:getfield        #412 <Field bgg x>
	//* 255  490:getfield        #379 <Field bfx bgg.g>
	//* 256  493:ifnull          541
								{
									x.i = new zzhp(new zzhp.zza[] {
										new zzhp.zza(bcr.b, "video/webm", x.g.b)
									});
	//  257  496:aload_0         
	//  258  497:getfield        #412 <Field bgg x>
	//  259  500:new             #661 <Class zzhp>
	//  260  503:dup             
	//  261  504:iconst_1        
	//  262  505:anewarray       zzhp.zza[]
	//  263  508:dup             
	//  264  509:iconst_0        
	//  265  510:new             #663 <Class zzhp$zza>
	//  266  513:dup             
	//  267  514:getstatic       #667 <Field UUID bcr.b>
	//  268  517:ldc2            #669 <String "video/webm">
	//  269  520:aload_0         
	//  270  521:getfield        #412 <Field bgg x>
	//  271  524:getfield        #379 <Field bfx bgg.g>
	//  272  527:getfield        #670 <Field byte[] bfx.b>
	//  273  530:invokespecial   #673 <Method void zzhp$zza(UUID, String, byte[])>
	//  274  533:aastore         
	//  275  534:invokespecial   #676 <Method void zzhp(zzhp$zza[])>
	//  276  537:putfield        #679 <Field zzhp bgg.i>
									return;
	//  277  540:return          
								} else
								{
									throw new bdj("Encrypted Track found but ContentEncKeyID was not found");
	//  278  541:new             #233 <Class bdj>
	//  279  544:dup             
	//  280  545:ldc2            #681 <String "Encrypted Track found but ContentEncKeyID was not found">
	//  281  548:invokespecial   #238 <Method void bdj(String)>
	//  282  551:athrow          
								}
							break label3;
						}
						i1 = z;
	//  283  552:aload_0         
	//  284  553:getfield        #463 <Field int z>
	//  285  556:istore_1        
						if(i1 == -1)
							break label2;
	//  286  557:iload_1         
	//  287  558:iconst_m1       
	//  288  559:icmpeq          592
						long l2 = A;
	//  289  562:aload_0         
	//  290  563:getfield        #548 <Field long A>
	//  291  566:lstore          5
						if(l2 == -1L)
							break label2;
	//  292  568:lload           5
	//  293  570:ldc2w           #117 <Long -1L>
	//  294  573:lcmp            
	//  295  574:ifeq            592
						if(i1 == 0x1c53bb6b)
	//* 296  577:iload_1         
	//* 297  578:ldc2            #393 <Int 0x1c53bb6b>
	//* 298  581:icmpne          591
						{
							C = l2;
	//  299  584:aload_0         
	//  300  585:lload           5
	//  301  587:putfield        #130 <Field long C>
							return;
	//  302  590:return          
						}
					}
					return;
	//  303  591:return          
				}
				throw new bdj("Mandatory element SeekID or SeekPosition not found");
	//  304  592:new             #233 <Class bdj>
	//  305  595:dup             
	//  306  596:ldc2            #683 <String "Mandatory element SeekID or SeekPosition not found">
	//  307  599:invokespecial   #238 <Method void bdj(String)>
	//  308  602:athrow          
			}
label10:
			{
				String s1 = x.a;
	//  309  603:aload_0         
	//  310  604:getfield        #412 <Field bgg x>
	//  311  607:getfield        #272 <Field String bgg.a>
	//  312  610:astore          7
				if(!"V_VP8".equals(((Object) (s1))) && !"V_VP9".equals(((Object) (s1))) && !"V_MPEG2".equals(((Object) (s1))) && !"V_MPEG4/ISO/SP".equals(((Object) (s1))) && !"V_MPEG4/ISO/ASP".equals(((Object) (s1))) && !"V_MPEG4/ISO/AP".equals(((Object) (s1))) && !"V_MPEG4/ISO/AVC".equals(((Object) (s1))) && !"V_MPEGH/ISO/HEVC".equals(((Object) (s1))) && !"V_MS/VFW/FOURCC".equals(((Object) (s1))) && !"V_THEORA".equals(((Object) (s1))) && !"A_OPUS".equals(((Object) (s1))) && !"A_VORBIS".equals(((Object) (s1))) && !"A_AAC".equals(((Object) (s1))) && !"A_MPEG/L2".equals(((Object) (s1))) && !"A_MPEG/L3".equals(((Object) (s1))) && !"A_AC3".equals(((Object) (s1))) && !"A_EAC3".equals(((Object) (s1))) && !"A_TRUEHD".equals(((Object) (s1))) && !"A_DTS".equals(((Object) (s1))) && !"A_DTS/EXPRESS".equals(((Object) (s1))) && !"A_DTS/LOSSLESS".equals(((Object) (s1))) && !"A_FLAC".equals(((Object) (s1))) && !"A_MS/ACM".equals(((Object) (s1))) && !"A_PCM/INT/LIT".equals(((Object) (s1))) && !"S_TEXT/UTF8".equals(((Object) (s1))) && !"S_VOBSUB".equals(((Object) (s1))) && !"S_HDMV/PGS".equals(((Object) (s1))))
	//* 313  612:ldc2            #685 <String "V_VP8">
	//* 314  615:aload           7
	//* 315  617:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 316  620:ifne            922
	//* 317  623:ldc2            #687 <String "V_VP9">
	//* 318  626:aload           7
	//* 319  628:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 320  631:ifne            922
	//* 321  634:ldc2            #689 <String "V_MPEG2">
	//* 322  637:aload           7
	//* 323  639:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 324  642:ifne            922
	//* 325  645:ldc2            #691 <String "V_MPEG4/ISO/SP">
	//* 326  648:aload           7
	//* 327  650:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 328  653:ifne            922
	//* 329  656:ldc2            #693 <String "V_MPEG4/ISO/ASP">
	//* 330  659:aload           7
	//* 331  661:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 332  664:ifne            922
	//* 333  667:ldc2            #695 <String "V_MPEG4/ISO/AP">
	//* 334  670:aload           7
	//* 335  672:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 336  675:ifne            922
	//* 337  678:ldc2            #326 <String "V_MPEG4/ISO/AVC">
	//* 338  681:aload           7
	//* 339  683:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 340  686:ifne            922
	//* 341  689:ldc2            #328 <String "V_MPEGH/ISO/HEVC">
	//* 342  692:aload           7
	//* 343  694:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 344  697:ifne            922
	//* 345  700:ldc2            #697 <String "V_MS/VFW/FOURCC">
	//* 346  703:aload           7
	//* 347  705:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 348  708:ifne            922
	//* 349  711:ldc2            #699 <String "V_THEORA">
	//* 350  714:aload           7
	//* 351  716:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 352  719:ifne            922
	//* 353  722:ldc2            #701 <String "A_OPUS">
	//* 354  725:aload           7
	//* 355  727:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 356  730:ifne            922
	//* 357  733:ldc2            #338 <String "A_VORBIS">
	//* 358  736:aload           7
	//* 359  738:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 360  741:ifne            922
	//* 361  744:ldc2            #703 <String "A_AAC">
	//* 362  747:aload           7
	//* 363  749:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 364  752:ifne            922
	//* 365  755:ldc2            #705 <String "A_MPEG/L2">
	//* 366  758:aload           7
	//* 367  760:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 368  763:ifne            922
	//* 369  766:ldc2            #707 <String "A_MPEG/L3">
	//* 370  769:aload           7
	//* 371  771:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 372  774:ifne            922
	//* 373  777:ldc2            #709 <String "A_AC3">
	//* 374  780:aload           7
	//* 375  782:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 376  785:ifne            922
	//* 377  788:ldc2            #711 <String "A_EAC3">
	//* 378  791:aload           7
	//* 379  793:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 380  796:ifne            922
	//* 381  799:ldc2            #713 <String "A_TRUEHD">
	//* 382  802:aload           7
	//* 383  804:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 384  807:ifne            922
	//* 385  810:ldc2            #715 <String "A_DTS">
	//* 386  813:aload           7
	//* 387  815:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 388  818:ifne            922
	//* 389  821:ldc2            #717 <String "A_DTS/EXPRESS">
	//* 390  824:aload           7
	//* 391  826:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 392  829:ifne            922
	//* 393  832:ldc2            #719 <String "A_DTS/LOSSLESS">
	//* 394  835:aload           7
	//* 395  837:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 396  840:ifne            922
	//* 397  843:ldc2            #721 <String "A_FLAC">
	//* 398  846:aload           7
	//* 399  848:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 400  851:ifne            922
	//* 401  854:ldc2            #723 <String "A_MS/ACM">
	//* 402  857:aload           7
	//* 403  859:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 404  862:ifne            922
	//* 405  865:ldc2            #725 <String "A_PCM/INT/LIT">
	//* 406  868:aload           7
	//* 407  870:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 408  873:ifne            922
	//* 409  876:ldc2            #267 <String "S_TEXT/UTF8">
	//* 410  879:aload           7
	//* 411  881:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 412  884:ifne            922
	//* 413  887:ldc2            #727 <String "S_VOBSUB">
	//* 414  890:aload           7
	//* 415  892:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 416  895:ifne            922
	//* 417  898:ldc2            #729 <String "S_HDMV/PGS">
	//* 418  901:aload           7
	//* 419  903:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 420  906:ifne            922
				{
					i1 = j1;
	//  421  909:iload_2         
	//  422  910:istore_1        
					if(!"S_DVBSUB".equals(((Object) (s1))))
						break label10;
	//  423  911:ldc2            #731 <String "S_DVBSUB">
	//  424  914:aload           7
	//  425  916:invokevirtual   #278 <Method boolean String.equals(Object)>
	//  426  919:ifeq            924
				}
				i1 = 1;
	//  427  922:iconst_1        
	//  428  923:istore_1        
			}
			if(i1 != 0)
	//* 429  924:iload_1         
	//* 430  925:ifeq            966
			{
				bgg bgg1 = x;
	//  431  928:aload_0         
	//  432  929:getfield        #412 <Field bgg x>
	//  433  932:astore          7
				bgg1.a(ac, bgg1.b);
	//  434  934:aload           7
	//  435  936:aload_0         
	//  436  937:getfield        #600 <Field bfp ac>
	//  437  940:aload           7
	//  438  942:getfield        #586 <Field int bgg.b>
	//  439  945:invokevirtual   #734 <Method void bgg.a(bfp, int)>
				g.put(x.b, ((Object) (x)));
	//  440  948:aload_0         
	//  441  949:getfield        #158 <Field SparseArray g>
	//  442  952:aload_0         
	//  443  953:getfield        #412 <Field bgg x>
	//  444  956:getfield        #586 <Field int bgg.b>
	//  445  959:aload_0         
	//  446  960:getfield        #412 <Field bgg x>
	//  447  963:invokevirtual   #738 <Method void SparseArray.put(int, Object)>
			}
			x = null;
	//  448  966:aload_0         
	//  449  967:aconst_null     
	//  450  968:putfield        #412 <Field bgg x>
			return;
	//  451  971:return          
		}
		if(I != 2)
	//* 452  972:aload_0         
	//* 453  973:getfield        #469 <Field int I>
	//* 454  976:iconst_2        
	//* 455  977:icmpeq          981
			return;
	//  456  980:return          
		if(!ab)
	//* 457  981:aload_0         
	//* 458  982:getfield        #575 <Field boolean ab>
	//* 459  985:ifne            998
			Q = Q | 1;
	//  460  988:aload_0         
	//  461  989:aload_0         
	//  462  990:getfield        #289 <Field int Q>
	//  463  993:iconst_1        
	//  464  994:ior             
	//  465  995:putfield        #289 <Field int Q>
		a((bgg)g.get(O), J);
	//  466  998:aload_0         
	//  467  999:aload_0         
	//  468 1000:getfield        #158 <Field SparseArray g>
	//  469 1003:aload_0         
	//  470 1004:getfield        #473 <Field int O>
	//  471 1007:invokevirtual   #480 <Method Object SparseArray.get(int)>
	//  472 1010:checkcast       #269 <Class bgg>
	//  473 1013:aload_0         
	//  474 1014:getfield        #504 <Field long J>
	//  475 1017:invokespecial   #519 <Method void a(bgg, long)>
		I = 0;
	//  476 1020:aload_0         
	//  477 1021:iconst_0        
	//  478 1022:putfield        #469 <Field int I>
	//  479 1025:return          
	}

	private static final bfq a = new bge();
	private static final byte b[] = {
		49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 
		44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 
		48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 
		48, 10
	};
	private static final byte c[] = {
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 
		32, 32
	};
	private static final UUID d = new UUID(0x1000L, 0x389b71L);
	private long A;
	private boolean B;
	private long C;
	private long D;
	private long E;
	private bni F;
	private bni G;
	private boolean H;
	private int I;
	private long J;
	private long K;
	private int L;
	private int M;
	private int N[];
	private int O;
	private int P;
	private int Q;
	private int R;
	private boolean S;
	private boolean T;
	private boolean U;
	private boolean V;
	private byte W;
	private int X;
	private int Y;
	private int Z;
	private boolean aa;
	private boolean ab;
	private bfp ac;
	private final bgb e;
	private final bgi f;
	private final SparseArray g;
	private final boolean h;
	private final bno i;
	private final bno j;
	private final bno k;
	private final bno l;
	private final bno m;
	private final bno n;
	private final bno o;
	private final bno p;
	private final bno q;
	private ByteBuffer r;
	private long s;
	private long t;
	private long u;
	private long v;
	private long w;
	private bgg x;
	private boolean y;
	private int z;

	static 
	{
	//    0    0:new             #77  <Class bge>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void bge()>
	//    3    7:putstatic       #82  <Field bfq a>
	//    4   10:bipush          32
	//    5   12:newarray        byte[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #83  <Int 49>
	//    9   18:bastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:ldc1            #84  <Int 10>
	//   13   23:bastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:ldc1            #85  <Int 48>
	//   17   28:bastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:ldc1            #85  <Int 48>
	//   21   33:bastore         
	//   22   34:dup             
	//   23   35:iconst_4        
	//   24   36:ldc1            #86  <Int 58>
	//   25   38:bastore         
	//   26   39:dup             
	//   27   40:iconst_5        
	//   28   41:ldc1            #85  <Int 48>
	//   29   43:bastore         
	//   30   44:dup             
	//   31   45:bipush          6
	//   32   47:ldc1            #85  <Int 48>
	//   33   49:bastore         
	//   34   50:dup             
	//   35   51:bipush          7
	//   36   53:ldc1            #86  <Int 58>
	//   37   55:bastore         
	//   38   56:dup             
	//   39   57:bipush          8
	//   40   59:ldc1            #85  <Int 48>
	//   41   61:bastore         
	//   42   62:dup             
	//   43   63:bipush          9
	//   44   65:ldc1            #85  <Int 48>
	//   45   67:bastore         
	//   46   68:dup             
	//   47   69:bipush          10
	//   48   71:ldc1            #87  <Int 44>
	//   49   73:bastore         
	//   50   74:dup             
	//   51   75:bipush          11
	//   52   77:ldc1            #85  <Int 48>
	//   53   79:bastore         
	//   54   80:dup             
	//   55   81:bipush          12
	//   56   83:ldc1            #85  <Int 48>
	//   57   85:bastore         
	//   58   86:dup             
	//   59   87:bipush          13
	//   60   89:ldc1            #85  <Int 48>
	//   61   91:bastore         
	//   62   92:dup             
	//   63   93:bipush          14
	//   64   95:ldc1            #88  <Int 32>
	//   65   97:bastore         
	//   66   98:dup             
	//   67   99:bipush          15
	//   68  101:ldc1            #89  <Int 45>
	//   69  103:bastore         
	//   70  104:dup             
	//   71  105:bipush          16
	//   72  107:ldc1            #89  <Int 45>
	//   73  109:bastore         
	//   74  110:dup             
	//   75  111:bipush          17
	//   76  113:ldc1            #90  <Int 62>
	//   77  115:bastore         
	//   78  116:dup             
	//   79  117:bipush          18
	//   80  119:ldc1            #88  <Int 32>
	//   81  121:bastore         
	//   82  122:dup             
	//   83  123:bipush          19
	//   84  125:ldc1            #85  <Int 48>
	//   85  127:bastore         
	//   86  128:dup             
	//   87  129:bipush          20
	//   88  131:ldc1            #85  <Int 48>
	//   89  133:bastore         
	//   90  134:dup             
	//   91  135:bipush          21
	//   92  137:ldc1            #86  <Int 58>
	//   93  139:bastore         
	//   94  140:dup             
	//   95  141:bipush          22
	//   96  143:ldc1            #85  <Int 48>
	//   97  145:bastore         
	//   98  146:dup             
	//   99  147:bipush          23
	//  100  149:ldc1            #85  <Int 48>
	//  101  151:bastore         
	//  102  152:dup             
	//  103  153:bipush          24
	//  104  155:ldc1            #86  <Int 58>
	//  105  157:bastore         
	//  106  158:dup             
	//  107  159:bipush          25
	//  108  161:ldc1            #85  <Int 48>
	//  109  163:bastore         
	//  110  164:dup             
	//  111  165:bipush          26
	//  112  167:ldc1            #85  <Int 48>
	//  113  169:bastore         
	//  114  170:dup             
	//  115  171:bipush          27
	//  116  173:ldc1            #87  <Int 44>
	//  117  175:bastore         
	//  118  176:dup             
	//  119  177:bipush          28
	//  120  179:ldc1            #85  <Int 48>
	//  121  181:bastore         
	//  122  182:dup             
	//  123  183:bipush          29
	//  124  185:ldc1            #85  <Int 48>
	//  125  187:bastore         
	//  126  188:dup             
	//  127  189:bipush          30
	//  128  191:ldc1            #85  <Int 48>
	//  129  193:bastore         
	//  130  194:dup             
	//  131  195:bipush          31
	//  132  197:ldc1            #84  <Int 10>
	//  133  199:bastore         
	//  134  200:putstatic       #92  <Field byte[] b>
	//  135  203:bipush          12
	//  136  205:newarray        byte[]
	//  137  207:dup             
	//  138  208:iconst_0        
	//  139  209:ldc1            #88  <Int 32>
	//  140  211:bastore         
	//  141  212:dup             
	//  142  213:iconst_1        
	//  143  214:ldc1            #88  <Int 32>
	//  144  216:bastore         
	//  145  217:dup             
	//  146  218:iconst_2        
	//  147  219:ldc1            #88  <Int 32>
	//  148  221:bastore         
	//  149  222:dup             
	//  150  223:iconst_3        
	//  151  224:ldc1            #88  <Int 32>
	//  152  226:bastore         
	//  153  227:dup             
	//  154  228:iconst_4        
	//  155  229:ldc1            #88  <Int 32>
	//  156  231:bastore         
	//  157  232:dup             
	//  158  233:iconst_5        
	//  159  234:ldc1            #88  <Int 32>
	//  160  236:bastore         
	//  161  237:dup             
	//  162  238:bipush          6
	//  163  240:ldc1            #88  <Int 32>
	//  164  242:bastore         
	//  165  243:dup             
	//  166  244:bipush          7
	//  167  246:ldc1            #88  <Int 32>
	//  168  248:bastore         
	//  169  249:dup             
	//  170  250:bipush          8
	//  171  252:ldc1            #88  <Int 32>
	//  172  254:bastore         
	//  173  255:dup             
	//  174  256:bipush          9
	//  175  258:ldc1            #88  <Int 32>
	//  176  260:bastore         
	//  177  261:dup             
	//  178  262:bipush          10
	//  179  264:ldc1            #88  <Int 32>
	//  180  266:bastore         
	//  181  267:dup             
	//  182  268:bipush          11
	//  183  270:ldc1            #88  <Int 32>
	//  184  272:bastore         
	//  185  273:putstatic       #94  <Field byte[] c>
	//  186  276:new             #96  <Class UUID>
	//  187  279:dup             
	//  188  280:ldc2w           #97  <Long 0x1000L>
	//  189  283:ldc2w           #99  <Long 0x389b71L>
	//  190  286:invokespecial   #103 <Method void UUID(long, long)>
	//  191  289:putstatic       #105 <Field UUID d>
	//* 192  292:return          
	}
}
