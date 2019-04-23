// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bct, bnw, bnf, bmf, 
//			bme, bmc, bdp, bds, 
//			bdr, bjo, bdk, bcz, 
//			bdc, bda, bcr, bcu, 
//			bdh, bcs, bde, bmh, 
//			bdl, bdi, bjb, bcw

final class bcy
	implements bct
{

	public bcy(bdl abdl[], bmf bmf1, bdi bdi)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		Object obj = ((Object) (bnw.e));
	//    2    4:getstatic       #59  <Field String bnw.e>
	//    3    7:astore          5
		StringBuilder stringbuilder = new StringBuilder(String.valueOf("Init ExoPlayerLib/2.4.2 [").length() + 1 + String.valueOf(obj).length());
	//    4    9:new             #61  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:ldc1            #63  <String "Init ExoPlayerLib/2.4.2 [">
	//    7   15:invokestatic    #69  <Method String String.valueOf(Object)>
	//    8   18:invokevirtual   #73  <Method int String.length()>
	//    9   21:iconst_1        
	//   10   22:iadd            
	//   11   23:aload           5
	//   12   25:invokestatic    #69  <Method String String.valueOf(Object)>
	//   13   28:invokevirtual   #73  <Method int String.length()>
	//   14   31:iadd            
	//   15   32:invokespecial   #76  <Method void StringBuilder(int)>
	//   16   35:astore          6
		stringbuilder.append("Init ExoPlayerLib/2.4.2 [");
	//   17   37:aload           6
	//   18   39:ldc1            #63  <String "Init ExoPlayerLib/2.4.2 [">
	//   19   41:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(((String) (obj)));
	//   21   45:aload           6
	//   22   47:aload           5
	//   23   49:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
		stringbuilder.append("]");
	//   25   53:aload           6
	//   26   55:ldc1            #82  <String "]">
	//   27   57:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
		Log.i("ExoPlayerImpl", stringbuilder.toString());
	//   29   61:ldc1            #84  <String "ExoPlayerImpl">
	//   30   63:aload           6
	//   31   65:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   32   68:invokestatic    #93  <Method int Log.i(String, String)>
	//   33   71:pop             
		boolean flag;
		if(abdl.length > 0)
	//*  34   72:aload_1         
	//*  35   73:arraylength     
	//*  36   74:ifle            83
			flag = true;
	//   37   77:iconst_1        
	//   38   78:istore          4
		else
	//*  39   80:goto            86
			flag = false;
	//   40   83:iconst_0        
	//   41   84:istore          4
		bnf.b(flag);
	//   42   86:iload           4
	//   43   88:invokestatic    #98  <Method void bnf.b(boolean)>
		a = (bdl[])bnf.a(((Object) (abdl)));
	//   44   91:aload_0         
	//   45   92:aload_1         
	//   46   93:invokestatic    #101 <Method Object bnf.a(Object)>
	//   47   96:checkcast       #102 <Class bdl[]>
	//   48   99:putfield        #104 <Field bdl[] a>
		b = (bmf)bnf.a(((Object) (bmf1)));
	//   49  102:aload_0         
	//   50  103:aload_2         
	//   51  104:invokestatic    #101 <Method Object bnf.a(Object)>
	//   52  107:checkcast       #106 <Class bmf>
	//   53  110:putfield        #108 <Field bmf b>
		j = false;
	//   54  113:aload_0         
	//   55  114:iconst_0        
	//   56  115:putfield        #110 <Field boolean j>
		k = 0;
	//   57  118:aload_0         
	//   58  119:iconst_0        
	//   59  120:putfield        #112 <Field int k>
		l = 1;
	//   60  123:aload_0         
	//   61  124:iconst_1        
	//   62  125:putfield        #114 <Field int l>
	//   63  128:aload_0         
	//   64  129:new             #116 <Class CopyOnWriteArraySet>
	//   65  132:dup             
	//   66  133:invokespecial   #117 <Method void CopyOnWriteArraySet()>
	//   67  136:putfield        #119 <Field CopyOnWriteArraySet f>
		c = new bme(new bmc[abdl.length]);
	//   68  139:aload_0         
	//   69  140:new             #121 <Class bme>
	//   70  143:dup             
	//   71  144:aload_1         
	//   72  145:arraylength     
	//   73  146:anewarray       bmc[]
	//   74  149:invokespecial   #126 <Method void bme(bmc[])>
	//   75  152:putfield        #128 <Field bme c>
		p = bdp.a;
	//   76  155:aload_0         
	//   77  156:getstatic       #132 <Field bdp bdp.a>
	//   78  159:putfield        #134 <Field bdp p>
	//   79  162:aload_0         
	//   80  163:new             #136 <Class bds>
	//   81  166:dup             
	//   82  167:invokespecial   #137 <Method void bds()>
	//   83  170:putfield        #139 <Field bds g>
	//   84  173:aload_0         
	//   85  174:new             #141 <Class bdr>
	//   86  177:dup             
	//   87  178:invokespecial   #142 <Method void bdr()>
	//   88  181:putfield        #144 <Field bdr h>
		r = bjo.a;
	//   89  184:aload_0         
	//   90  185:getstatic       #148 <Field bjo bjo.a>
	//   91  188:putfield        #150 <Field bjo r>
		s = c;
	//   92  191:aload_0         
	//   93  192:aload_0         
	//   94  193:getfield        #128 <Field bme c>
	//   95  196:putfield        #152 <Field bme s>
		t = bdk.a;
	//   96  199:aload_0         
	//   97  200:getstatic       #156 <Field bdk bdk.a>
	//   98  203:putfield        #158 <Field bdk t>
		if(Looper.myLooper() != null)
	//*  99  206:invokestatic    #164 <Method Looper Looper.myLooper()>
	//* 100  209:ifnull          220
			obj = ((Object) (Looper.myLooper()));
	//  101  212:invokestatic    #164 <Method Looper Looper.myLooper()>
	//  102  215:astore          5
		else
	//* 103  217:goto            225
			obj = ((Object) (Looper.getMainLooper()));
	//  104  220:invokestatic    #167 <Method Looper Looper.getMainLooper()>
	//  105  223:astore          5
		d = ((Handler) (new bcz(this, ((Looper) (obj)))));
	//  106  225:aload_0         
	//  107  226:new             #169 <Class bcz>
	//  108  229:dup             
	//  109  230:aload_0         
	//  110  231:aload           5
	//  111  233:invokespecial   #172 <Method void bcz(bcy, Looper)>
	//  112  236:putfield        #174 <Field Handler d>
		u = new bdc(0, 0L);
	//  113  239:aload_0         
	//  114  240:new             #176 <Class bdc>
	//  115  243:dup             
	//  116  244:iconst_0        
	//  117  245:lconst_0        
	//  118  246:invokespecial   #179 <Method void bdc(int, long)>
	//  119  249:putfield        #181 <Field bdc u>
		e = new bda(abdl, bmf1, bdi, j, 0, d, u, ((bct) (this)));
	//  120  252:aload_0         
	//  121  253:new             #183 <Class bda>
	//  122  256:dup             
	//  123  257:aload_1         
	//  124  258:aload_2         
	//  125  259:aload_3         
	//  126  260:aload_0         
	//  127  261:getfield        #110 <Field boolean j>
	//  128  264:iconst_0        
	//  129  265:aload_0         
	//  130  266:getfield        #174 <Field Handler d>
	//  131  269:aload_0         
	//  132  270:getfield        #181 <Field bdc u>
	//  133  273:aload_0         
	//  134  274:invokespecial   #186 <Method void bda(bdl[], bmf, bdi, boolean, int, Handler, bdc, bct)>
	//  135  277:putfield        #188 <Field bda e>
	//  136  280:return          
	}

	private final int i()
	{
		if(!p.a() && m <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field bdp p>
	//*   2    4:invokevirtual   #193 <Method boolean bdp.a()>
	//*   3    7:ifne            42
	//*   4   10:aload_0         
	//*   5   11:getfield        #195 <Field int m>
	//*   6   14:ifle            20
	//*   7   17:goto            42
		{
			p.a(u.a, h, false);
	//    8   20:aload_0         
	//    9   21:getfield        #134 <Field bdp p>
	//   10   24:aload_0         
	//   11   25:getfield        #181 <Field bdc u>
	//   12   28:getfield        #197 <Field int bdc.a>
	//   13   31:aload_0         
	//   14   32:getfield        #144 <Field bdr h>
	//   15   35:iconst_0        
	//   16   36:invokevirtual   #200 <Method bdr bdp.a(int, bdr, boolean)>
	//   17   39:pop             
			return 0;
	//   18   40:iconst_0        
	//   19   41:ireturn         
		} else
		{
			return v;
	//   20   42:aload_0         
	//   21   43:getfield        #202 <Field int v>
	//   22   46:ireturn         
		}
	}

	public final int a()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int l>
	//    2    4:ireturn         
	}

	public final void a(long l1)
	{
		int j1 = i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #205 <Method int i()>
	//    2    4:istore          4
		if(j1 >= 0 && (p.a() || j1 < p.b()))
	//*   3    6:iload           4
	//*   4    8:iflt            300
	//*   5   11:aload_0         
	//*   6   12:getfield        #134 <Field bdp p>
	//*   7   15:invokevirtual   #193 <Method boolean bdp.a()>
	//*   8   18:ifne            33
	//*   9   21:iload           4
	//*  10   23:aload_0         
	//*  11   24:getfield        #134 <Field bdp p>
	//*  12   27:invokevirtual   #207 <Method int bdp.b()>
	//*  13   30:icmpge          300
		{
			m = m + 1;
	//   14   33:aload_0         
	//   15   34:aload_0         
	//   16   35:getfield        #195 <Field int m>
	//   17   38:iconst_1        
	//   18   39:iadd            
	//   19   40:putfield        #195 <Field int m>
			v = j1;
	//   20   43:aload_0         
	//   21   44:iload           4
	//   22   46:putfield        #202 <Field int v>
			if(p.a())
	//*  23   49:aload_0         
	//*  24   50:getfield        #134 <Field bdp p>
	//*  25   53:invokevirtual   #193 <Method boolean bdp.a()>
	//*  26   56:ifeq            67
			{
				w = 0;
	//   27   59:aload_0         
	//   28   60:iconst_0        
	//   29   61:putfield        #209 <Field int w>
			} else
	//*  30   64:goto            210
			{
				p.a(j1, g, false, 0L);
	//   31   67:aload_0         
	//   32   68:getfield        #134 <Field bdp p>
	//   33   71:iload           4
	//   34   73:aload_0         
	//   35   74:getfield        #139 <Field bds g>
	//   36   77:iconst_0        
	//   37   78:lconst_0        
	//   38   79:invokevirtual   #212 <Method bds bdp.a(int, bds, boolean, long)>
	//   39   82:pop             
				long l2;
				if(l1 == 0x1L)
	//*  40   83:lload_1         
	//*  41   84:ldc2w           #213 <Long 0x1L>
	//*  42   87:lcmp            
	//*  43   88:ifne            103
					l2 = g.d;
	//   44   91:aload_0         
	//   45   92:getfield        #139 <Field bds g>
	//   46   95:getfield        #216 <Field long bds.d>
	//   47   98:lstore          5
				else
	//*  48  100:goto            109
					l2 = bcr.b(l1);
	//   49  103:lload_1         
	//   50  104:invokestatic    #221 <Method long bcr.b(long)>
	//   51  107:lstore          5
				long l3 = g.f + l2;
	//   52  109:aload_0         
	//   53  110:getfield        #139 <Field bds g>
	//   54  113:getfield        #223 <Field long bds.f>
	//   55  116:lload           5
	//   56  118:ladd            
	//   57  119:lstore          7
				l2 = p.a(0, h, false).c;
	//   58  121:aload_0         
	//   59  122:getfield        #134 <Field bdp p>
	//   60  125:iconst_0        
	//   61  126:aload_0         
	//   62  127:getfield        #144 <Field bdr h>
	//   63  130:iconst_0        
	//   64  131:invokevirtual   #200 <Method bdr bdp.a(int, bdr, boolean)>
	//   65  134:getfield        #225 <Field long bdr.c>
	//   66  137:lstore          5
				int i1;
				bdp bdp1;
				for(i1 = 0; l2 != 0x1L && l3 >= l2 && i1 < g.c; l2 = bdp1.a(i1, h, false).c)
	//*  67  139:iconst_0        
	//*  68  140:istore_3        
	//*  69  141:lload           5
	//*  70  143:ldc2w           #213 <Long 0x1L>
	//*  71  146:lcmp            
	//*  72  147:ifeq            205
	//*  73  150:lload           7
	//*  74  152:lload           5
	//*  75  154:lcmp            
	//*  76  155:iflt            205
	//*  77  158:iload_3         
	//*  78  159:aload_0         
	//*  79  160:getfield        #139 <Field bds g>
	//*  80  163:getfield        #227 <Field int bds.c>
	//*  81  166:icmpge          205
				{
					l3 -= l2;
	//   82  169:lload           7
	//   83  171:lload           5
	//   84  173:lsub            
	//   85  174:lstore          7
					bdp1 = p;
	//   86  176:aload_0         
	//   87  177:getfield        #134 <Field bdp p>
	//   88  180:astore          9
					i1++;
	//   89  182:iload_3         
	//   90  183:iconst_1        
	//   91  184:iadd            
	//   92  185:istore_3        
				}

	//   93  186:aload           9
	//   94  188:iload_3         
	//   95  189:aload_0         
	//   96  190:getfield        #144 <Field bdr h>
	//   97  193:iconst_0        
	//   98  194:invokevirtual   #200 <Method bdr bdp.a(int, bdr, boolean)>
	//   99  197:getfield        #225 <Field long bdr.c>
	//  100  200:lstore          5
	//* 101  202:goto            141
				w = i1;
	//  102  205:aload_0         
	//  103  206:iload_3         
	//  104  207:putfield        #209 <Field int w>
			}
			if(l1 == 0x1L)
	//* 105  210:lload_1         
	//* 106  211:ldc2w           #213 <Long 0x1L>
	//* 107  214:lcmp            
	//* 108  215:ifne            240
			{
				x = 0L;
	//  109  218:aload_0         
	//  110  219:lconst_0        
	//  111  220:putfield        #229 <Field long x>
				e.a(p, j1, 0x1L);
	//  112  223:aload_0         
	//  113  224:getfield        #188 <Field bda e>
	//  114  227:aload_0         
	//  115  228:getfield        #134 <Field bdp p>
	//  116  231:iload           4
	//  117  233:ldc2w           #213 <Long 0x1L>
	//  118  236:invokevirtual   #232 <Method void bda.a(bdp, int, long)>
				return;
	//  119  239:return          
			}
			x = l1;
	//  120  240:aload_0         
	//  121  241:lload_1         
	//  122  242:putfield        #229 <Field long x>
			e.a(p, j1, bcr.b(l1));
	//  123  245:aload_0         
	//  124  246:getfield        #188 <Field bda e>
	//  125  249:aload_0         
	//  126  250:getfield        #134 <Field bdp p>
	//  127  253:iload           4
	//  128  255:lload_1         
	//  129  256:invokestatic    #221 <Method long bcr.b(long)>
	//  130  259:invokevirtual   #232 <Method void bda.a(bdp, int, long)>
			for(Iterator iterator = f.iterator(); iterator.hasNext(); ((bcu)iterator.next()).g());
	//  131  262:aload_0         
	//  132  263:getfield        #119 <Field CopyOnWriteArraySet f>
	//  133  266:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//  134  269:astore          9
	//  135  271:aload           9
	//  136  273:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//  137  278:ifeq            299
	//  138  281:aload           9
	//  139  283:invokeinterface #245 <Method Object Iterator.next()>
	//  140  288:checkcast       #247 <Class bcu>
	//  141  291:invokeinterface #249 <Method void bcu.g()>
	//* 142  296:goto            271
			return;
	//  143  299:return          
		} else
		{
			throw new bdh(p, j1, l1);
	//  144  300:new             #251 <Class bdh>
	//  145  303:dup             
	//  146  304:aload_0         
	//  147  305:getfield        #134 <Field bdp p>
	//  148  308:iload           4
	//  149  310:lload_1         
	//  150  311:invokespecial   #253 <Method void bdh(bdp, int, long)>
	//  151  314:athrow          
		}
	}

	final void a(Message message)
	{
label0:
		{
label1:
			{
				boolean flag;
label2:
				{
					int i1 = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #259 <Field int Message.what>
	//    2    4:istore_2        
					flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
					switch(i1)
	//*   5    7:iload_2         
					{
	//*   6    8:tableswitch     0 8: default 60
	//	               0 593
	//	               1 542
	//	               2 486
	//	               3 395
	//	               4 326
	//	               5 273
	//	               6 178
	//	               7 115
	//	               8 68
					default:
						throw new IllegalStateException();
	//    7   60:new             #261 <Class IllegalStateException>
	//    8   63:dup             
	//    9   64:invokespecial   #262 <Method void IllegalStateException()>
	//   10   67:athrow          

					case 0: // '\0'
						break label0;

					case 1: // '\001'
						break label1;

					case 2: // '\002'
						break label2;

					case 8: // '\b'
						message = ((Message) ((bcs)message.obj));
	//   11   68:aload_1         
	//   12   69:getfield        #265 <Field Object Message.obj>
	//   13   72:checkcast       #267 <Class bcs>
	//   14   75:astore_1        
						for(Iterator iterator = f.iterator(); iterator.hasNext(); ((bcu)iterator.next()).a(((bcs) (message))));
	//   15   76:aload_0         
	//   16   77:getfield        #119 <Field CopyOnWriteArraySet f>
	//   17   80:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   18   83:astore          4
	//   19   85:aload           4
	//   20   87:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//   21   92:ifeq            114
	//   22   95:aload           4
	//   23   97:invokeinterface #245 <Method Object Iterator.next()>
	//   24  102:checkcast       #247 <Class bcu>
	//   25  105:aload_1         
	//   26  106:invokeinterface #270 <Method void bcu.a(bcs)>
	//*  27  111:goto            85
						return;
	//   28  114:return          

					case 7: // '\007'
						message = ((Message) ((bdk)message.obj));
	//   29  115:aload_1         
	//   30  116:getfield        #265 <Field Object Message.obj>
	//   31  119:checkcast       #154 <Class bdk>
	//   32  122:astore_1        
						if(!t.equals(((Object) (message))))
	//*  33  123:aload_0         
	//*  34  124:getfield        #158 <Field bdk t>
	//*  35  127:aload_1         
	//*  36  128:invokevirtual   #274 <Method boolean bdk.equals(Object)>
	//*  37  131:ifne            485
						{
							t = ((bdk) (message));
	//   38  134:aload_0         
	//   39  135:aload_1         
	//   40  136:putfield        #158 <Field bdk t>
							for(Iterator iterator1 = f.iterator(); iterator1.hasNext(); ((bcu)iterator1.next()).a(((bdk) (message))));
	//   41  139:aload_0         
	//   42  140:getfield        #119 <Field CopyOnWriteArraySet f>
	//   43  143:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   44  146:astore          4
	//   45  148:aload           4
	//   46  150:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//   47  155:ifeq            177
	//   48  158:aload           4
	//   49  160:invokeinterface #245 <Method Object Iterator.next()>
	//   50  165:checkcast       #247 <Class bcu>
	//   51  168:aload_1         
	//   52  169:invokeinterface #277 <Method void bcu.a(bdk)>
	//*  53  174:goto            148
							return;
	//   54  177:return          
						}
						break;

					case 6: // '\006'
						message = ((Message) ((bde)message.obj));
	//   55  178:aload_1         
	//   56  179:getfield        #265 <Field Object Message.obj>
	//   57  182:checkcast       #279 <Class bde>
	//   58  185:astore_1        
						m = m - ((bde) (message)).d;
	//   59  186:aload_0         
	//   60  187:aload_0         
	//   61  188:getfield        #195 <Field int m>
	//   62  191:aload_1         
	//   63  192:getfield        #281 <Field int bde.d>
	//   64  195:isub            
	//   65  196:putfield        #195 <Field int m>
						if(n == 0)
	//*  66  199:aload_0         
	//*  67  200:getfield        #283 <Field int n>
	//*  68  203:ifne            485
						{
							p = ((bde) (message)).a;
	//   69  206:aload_0         
	//   70  207:aload_1         
	//   71  208:getfield        #284 <Field bdp bde.a>
	//   72  211:putfield        #134 <Field bdp p>
							q = ((bde) (message)).b;
	//   73  214:aload_0         
	//   74  215:aload_1         
	//   75  216:getfield        #286 <Field Object bde.b>
	//   76  219:putfield        #288 <Field Object q>
							u = ((bde) (message)).c;
	//   77  222:aload_0         
	//   78  223:aload_1         
	//   79  224:getfield        #290 <Field bdc bde.c>
	//   80  227:putfield        #181 <Field bdc u>
							for(message = ((Message) (f.iterator())); ((Iterator) (message)).hasNext(); ((bcu)((Iterator) (message)).next()).a(p, q));
	//   81  230:aload_0         
	//   82  231:getfield        #119 <Field CopyOnWriteArraySet f>
	//   83  234:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   84  237:astore_1        
	//   85  238:aload_1         
	//   86  239:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//   87  244:ifeq            272
	//   88  247:aload_1         
	//   89  248:invokeinterface #245 <Method Object Iterator.next()>
	//   90  253:checkcast       #247 <Class bcu>
	//   91  256:aload_0         
	//   92  257:getfield        #134 <Field bdp p>
	//   93  260:aload_0         
	//   94  261:getfield        #288 <Field Object q>
	//   95  264:invokeinterface #293 <Method void bcu.a(bdp, Object)>
	//*  96  269:goto            238
							return;
	//   97  272:return          
						}
						break;

					case 5: // '\005'
						if(m != 0)
							break;
	//   98  273:aload_0         
	//   99  274:getfield        #195 <Field int m>
	//  100  277:ifne            485
						u = (bdc)message.obj;
	//  101  280:aload_0         
	//  102  281:aload_1         
	//  103  282:getfield        #265 <Field Object Message.obj>
	//  104  285:checkcast       #176 <Class bdc>
	//  105  288:putfield        #181 <Field bdc u>
						for(message = ((Message) (f.iterator())); ((Iterator) (message)).hasNext(); ((bcu)((Iterator) (message)).next()).g());
	//  106  291:aload_0         
	//  107  292:getfield        #119 <Field CopyOnWriteArraySet f>
	//  108  295:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//  109  298:astore_1        
	//  110  299:aload_1         
	//  111  300:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//  112  305:ifeq            325
	//  113  308:aload_1         
	//  114  309:invokeinterface #245 <Method Object Iterator.next()>
	//  115  314:checkcast       #247 <Class bcu>
	//  116  317:invokeinterface #249 <Method void bcu.g()>
	//* 117  322:goto            299
						return;
	//  118  325:return          

					case 4: // '\004'
						int j1 = m - 1;
	//  119  326:aload_0         
	//  120  327:getfield        #195 <Field int m>
	//  121  330:iconst_1        
	//  122  331:isub            
	//  123  332:istore_2        
						m = j1;
	//  124  333:aload_0         
	//  125  334:iload_2         
	//  126  335:putfield        #195 <Field int m>
						if(j1 != 0)
							break;
	//  127  338:iload_2         
	//  128  339:ifne            485
						u = (bdc)message.obj;
	//  129  342:aload_0         
	//  130  343:aload_1         
	//  131  344:getfield        #265 <Field Object Message.obj>
	//  132  347:checkcast       #176 <Class bdc>
	//  133  350:putfield        #181 <Field bdc u>
						if(message.arg1 == 0)
							break;
	//  134  353:aload_1         
	//  135  354:getfield        #296 <Field int Message.arg1>
	//  136  357:ifeq            485
						for(message = ((Message) (f.iterator())); ((Iterator) (message)).hasNext(); ((bcu)((Iterator) (message)).next()).g());
	//  137  360:aload_0         
	//  138  361:getfield        #119 <Field CopyOnWriteArraySet f>
	//  139  364:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//  140  367:astore_1        
	//  141  368:aload_1         
	//  142  369:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//  143  374:ifeq            394
	//  144  377:aload_1         
	//  145  378:invokeinterface #245 <Method Object Iterator.next()>
	//  146  383:checkcast       #247 <Class bcu>
	//  147  386:invokeinterface #249 <Method void bcu.g()>
	//* 148  391:goto            368
						return;
	//  149  394:return          

					case 3: // '\003'
						if(n != 0)
							break;
	//  150  395:aload_0         
	//  151  396:getfield        #283 <Field int n>
	//  152  399:ifne            485
						message = ((Message) ((bmh)message.obj));
	//  153  402:aload_1         
	//  154  403:getfield        #265 <Field Object Message.obj>
	//  155  406:checkcast       #298 <Class bmh>
	//  156  409:astore_1        
						i = true;
	//  157  410:aload_0         
	//  158  411:iconst_1        
	//  159  412:putfield        #300 <Field boolean i>
						r = ((bmh) (message)).a;
	//  160  415:aload_0         
	//  161  416:aload_1         
	//  162  417:getfield        #301 <Field bjo bmh.a>
	//  163  420:putfield        #150 <Field bjo r>
						s = ((bmh) (message)).b;
	//  164  423:aload_0         
	//  165  424:aload_1         
	//  166  425:getfield        #303 <Field bme bmh.b>
	//  167  428:putfield        #152 <Field bme s>
						b.a(((bmh) (message)).c);
	//  168  431:aload_0         
	//  169  432:getfield        #108 <Field bmf b>
	//  170  435:aload_1         
	//  171  436:getfield        #305 <Field Object bmh.c>
	//  172  439:invokevirtual   #308 <Method void bmf.a(Object)>
						for(message = ((Message) (f.iterator())); ((Iterator) (message)).hasNext(); ((bcu)((Iterator) (message)).next()).a(r, s));
	//  173  442:aload_0         
	//  174  443:getfield        #119 <Field CopyOnWriteArraySet f>
	//  175  446:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//  176  449:astore_1        
	//  177  450:aload_1         
	//  178  451:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//  179  456:ifeq            484
	//  180  459:aload_1         
	//  181  460:invokeinterface #245 <Method Object Iterator.next()>
	//  182  465:checkcast       #247 <Class bcu>
	//  183  468:aload_0         
	//  184  469:getfield        #150 <Field bjo r>
	//  185  472:aload_0         
	//  186  473:getfield        #152 <Field bme s>
	//  187  476:invokeinterface #311 <Method void bcu.a(bjo, bme)>
	//* 188  481:goto            450
						return;
	//  189  484:return          
					}
					return;
	//  190  485:return          
				}
				if(message.arg1 == 0)
	//* 191  486:aload_1         
	//* 192  487:getfield        #296 <Field int Message.arg1>
	//* 193  490:ifeq            496
	//* 194  493:goto            498
					flag = false;
	//  195  496:iconst_0        
	//  196  497:istore_3        
				o = flag;
	//  197  498:aload_0         
	//  198  499:iload_3         
	//  199  500:putfield        #313 <Field boolean o>
				for(message = ((Message) (f.iterator())); ((Iterator) (message)).hasNext(); ((bcu)((Iterator) (message)).next()).a(o));
	//  200  503:aload_0         
	//  201  504:getfield        #119 <Field CopyOnWriteArraySet f>
	//  202  507:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//  203  510:astore_1        
	//  204  511:aload_1         
	//  205  512:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//  206  517:ifeq            541
	//  207  520:aload_1         
	//  208  521:invokeinterface #245 <Method Object Iterator.next()>
	//  209  526:checkcast       #247 <Class bcu>
	//  210  529:aload_0         
	//  211  530:getfield        #313 <Field boolean o>
	//  212  533:invokeinterface #315 <Method void bcu.a(boolean)>
	//* 213  538:goto            511
				return;
	//  214  541:return          
			}
			l = message.arg1;
	//  215  542:aload_0         
	//  216  543:aload_1         
	//  217  544:getfield        #296 <Field int Message.arg1>
	//  218  547:putfield        #114 <Field int l>
			for(message = ((Message) (f.iterator())); ((Iterator) (message)).hasNext(); ((bcu)((Iterator) (message)).next()).a(j, l));
	//  219  550:aload_0         
	//  220  551:getfield        #119 <Field CopyOnWriteArraySet f>
	//  221  554:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//  222  557:astore_1        
	//  223  558:aload_1         
	//  224  559:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//  225  564:ifeq            592
	//  226  567:aload_1         
	//  227  568:invokeinterface #245 <Method Object Iterator.next()>
	//  228  573:checkcast       #247 <Class bcu>
	//  229  576:aload_0         
	//  230  577:getfield        #110 <Field boolean j>
	//  231  580:aload_0         
	//  232  581:getfield        #114 <Field int l>
	//  233  584:invokeinterface #318 <Method void bcu.a(boolean, int)>
	//* 234  589:goto            558
			return;
	//  235  592:return          
		}
		n = n - 1;
	//  236  593:aload_0         
	//  237  594:aload_0         
	//  238  595:getfield        #283 <Field int n>
	//  239  598:iconst_1        
	//  240  599:isub            
	//  241  600:putfield        #283 <Field int n>
	//  242  603:return          
	}

	public final void a(bcu bcu1)
	{
		f.add(((Object) (bcu1)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field CopyOnWriteArraySet f>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #322 <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void a(bjb bjb)
	{
		if(!p.a() || q != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field bdp p>
	//*   2    4:invokevirtual   #193 <Method boolean bdp.a()>
	//*   3    7:ifeq            17
	//*   4   10:aload_0         
	//*   5   11:getfield        #288 <Field Object q>
	//*   6   14:ifnull          71
		{
			p = bdp.a;
	//    7   17:aload_0         
	//    8   18:getstatic       #132 <Field bdp bdp.a>
	//    9   21:putfield        #134 <Field bdp p>
			q = null;
	//   10   24:aload_0         
	//   11   25:aconst_null     
	//   12   26:putfield        #288 <Field Object q>
			for(Iterator iterator = f.iterator(); iterator.hasNext(); ((bcu)iterator.next()).a(p, q));
	//   13   29:aload_0         
	//   14   30:getfield        #119 <Field CopyOnWriteArraySet f>
	//   15   33:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   16   36:astore_2        
	//   17   37:aload_2         
	//   18   38:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//   19   43:ifeq            71
	//   20   46:aload_2         
	//   21   47:invokeinterface #245 <Method Object Iterator.next()>
	//   22   52:checkcast       #247 <Class bcu>
	//   23   55:aload_0         
	//   24   56:getfield        #134 <Field bdp p>
	//   25   59:aload_0         
	//   26   60:getfield        #288 <Field Object q>
	//   27   63:invokeinterface #293 <Method void bcu.a(bdp, Object)>
		}
	//*  28   68:goto            37
		if(i)
	//*  29   71:aload_0         
	//*  30   72:getfield        #300 <Field boolean i>
	//*  31   75:ifeq            148
		{
			i = false;
	//   32   78:aload_0         
	//   33   79:iconst_0        
	//   34   80:putfield        #300 <Field boolean i>
			r = bjo.a;
	//   35   83:aload_0         
	//   36   84:getstatic       #148 <Field bjo bjo.a>
	//   37   87:putfield        #150 <Field bjo r>
			s = c;
	//   38   90:aload_0         
	//   39   91:aload_0         
	//   40   92:getfield        #128 <Field bme c>
	//   41   95:putfield        #152 <Field bme s>
			b.a(((Object) (null)));
	//   42   98:aload_0         
	//   43   99:getfield        #108 <Field bmf b>
	//   44  102:aconst_null     
	//   45  103:invokevirtual   #308 <Method void bmf.a(Object)>
			for(Iterator iterator1 = f.iterator(); iterator1.hasNext(); ((bcu)iterator1.next()).a(r, s));
	//   46  106:aload_0         
	//   47  107:getfield        #119 <Field CopyOnWriteArraySet f>
	//   48  110:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   49  113:astore_2        
	//   50  114:aload_2         
	//   51  115:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//   52  120:ifeq            148
	//   53  123:aload_2         
	//   54  124:invokeinterface #245 <Method Object Iterator.next()>
	//   55  129:checkcast       #247 <Class bcu>
	//   56  132:aload_0         
	//   57  133:getfield        #150 <Field bjo r>
	//   58  136:aload_0         
	//   59  137:getfield        #152 <Field bme s>
	//   60  140:invokeinterface #311 <Method void bcu.a(bjo, bme)>
		}
	//*  61  145:goto            114
		n = n + 1;
	//   62  148:aload_0         
	//   63  149:aload_0         
	//   64  150:getfield        #283 <Field int n>
	//   65  153:iconst_1        
	//   66  154:iadd            
	//   67  155:putfield        #283 <Field int n>
		e.a(bjb, true);
	//   68  158:aload_0         
	//   69  159:getfield        #188 <Field bda e>
	//   70  162:aload_1         
	//   71  163:iconst_1        
	//   72  164:invokevirtual   #326 <Method void bda.a(bjb, boolean)>
	//   73  167:return          
	}

	public final void a(boolean flag)
	{
		if(j != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field boolean j>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          60
		{
			j = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #110 <Field boolean j>
			e.a(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #188 <Field bda e>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #327 <Method void bda.a(boolean)>
			for(Iterator iterator = f.iterator(); iterator.hasNext(); ((bcu)iterator.next()).a(flag, l));
	//   11   21:aload_0         
	//   12   22:getfield        #119 <Field CopyOnWriteArraySet f>
	//   13   25:invokevirtual   #236 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   14   28:astore_2        
	//   15   29:aload_2         
	//   16   30:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//   17   35:ifeq            60
	//   18   38:aload_2         
	//   19   39:invokeinterface #245 <Method Object Iterator.next()>
	//   20   44:checkcast       #247 <Class bcu>
	//   21   47:iload_1         
	//   22   48:aload_0         
	//   23   49:getfield        #114 <Field int l>
	//   24   52:invokeinterface #318 <Method void bcu.a(boolean, int)>
		}
	//*  25   57:goto            29
	//   26   60:return          
	}

	public final transient void a(bcw abcw[])
	{
		e.a(abcw);
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field bda e>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #330 <Method void bda.a(bcw[])>
	//    4    8:return          
	}

	public final void b(bcu bcu1)
	{
		f.remove(((Object) (bcu1)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field CopyOnWriteArraySet f>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #333 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final transient void b(bcw abcw[])
	{
		e.b(abcw);
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field bda e>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #335 <Method void bda.b(bcw[])>
	//    4    8:return          
	}

	public final boolean b()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field boolean j>
	//    2    4:ireturn         
	}

	public final void c()
	{
		e.a();
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field bda e>
	//    2    4:invokevirtual   #337 <Method void bda.a()>
	//    3    7:return          
	}

	public final void d()
	{
		e.b();
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field bda e>
	//    2    4:invokevirtual   #339 <Method void bda.b()>
		d.removeCallbacksAndMessages(((Object) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #174 <Field Handler d>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #344 <Method void Handler.removeCallbacksAndMessages(Object)>
	//    7   15:return          
	}

	public final int e()
	{
		return a.length;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field bdl[] a>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public final long f()
	{
		if(p.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field bdp p>
	//*   2    4:invokevirtual   #193 <Method boolean bdp.a()>
	//*   3    7:ifeq            14
			return 0x1L;
	//    4   10:ldc2w           #213 <Long 0x1L>
	//    5   13:lreturn         
		else
			return bcr.a(p.a(i(), g, false, 0L).e);
	//    6   14:aload_0         
	//    7   15:getfield        #134 <Field bdp p>
	//    8   18:aload_0         
	//    9   19:invokespecial   #205 <Method int i()>
	//   10   22:aload_0         
	//   11   23:getfield        #139 <Field bds g>
	//   12   26:iconst_0        
	//   13   27:lconst_0        
	//   14   28:invokevirtual   #212 <Method bds bdp.a(int, bds, boolean, long)>
	//   15   31:getfield        #347 <Field long bds.e>
	//   16   34:invokestatic    #349 <Method long bcr.a(long)>
	//   17   37:lreturn         
	}

	public final long g()
	{
		if(!p.a() && m <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field bdp p>
	//*   2    4:invokevirtual   #193 <Method boolean bdp.a()>
	//*   3    7:ifne            59
	//*   4   10:aload_0         
	//*   5   11:getfield        #195 <Field int m>
	//*   6   14:ifle            20
	//*   7   17:goto            59
		{
			p.a(u.a, h, false);
	//    8   20:aload_0         
	//    9   21:getfield        #134 <Field bdp p>
	//   10   24:aload_0         
	//   11   25:getfield        #181 <Field bdc u>
	//   12   28:getfield        #197 <Field int bdc.a>
	//   13   31:aload_0         
	//   14   32:getfield        #144 <Field bdr h>
	//   15   35:iconst_0        
	//   16   36:invokevirtual   #200 <Method bdr bdp.a(int, bdr, boolean)>
	//   17   39:pop             
			return h.a() + bcr.a(u.c);
	//   18   40:aload_0         
	//   19   41:getfield        #144 <Field bdr h>
	//   20   44:invokevirtual   #351 <Method long bdr.a()>
	//   21   47:aload_0         
	//   22   48:getfield        #181 <Field bdc u>
	//   23   51:getfield        #352 <Field long bdc.c>
	//   24   54:invokestatic    #349 <Method long bcr.a(long)>
	//   25   57:ladd            
	//   26   58:lreturn         
		} else
		{
			return x;
	//   27   59:aload_0         
	//   28   60:getfield        #229 <Field long x>
	//   29   63:lreturn         
		}
	}

	public final long h()
	{
		if(!p.a() && m <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field bdp p>
	//*   2    4:invokevirtual   #193 <Method boolean bdp.a()>
	//*   3    7:ifne            59
	//*   4   10:aload_0         
	//*   5   11:getfield        #195 <Field int m>
	//*   6   14:ifle            20
	//*   7   17:goto            59
		{
			p.a(u.a, h, false);
	//    8   20:aload_0         
	//    9   21:getfield        #134 <Field bdp p>
	//   10   24:aload_0         
	//   11   25:getfield        #181 <Field bdc u>
	//   12   28:getfield        #197 <Field int bdc.a>
	//   13   31:aload_0         
	//   14   32:getfield        #144 <Field bdr h>
	//   15   35:iconst_0        
	//   16   36:invokevirtual   #200 <Method bdr bdp.a(int, bdr, boolean)>
	//   17   39:pop             
			return h.a() + bcr.a(u.d);
	//   18   40:aload_0         
	//   19   41:getfield        #144 <Field bdr h>
	//   20   44:invokevirtual   #351 <Method long bdr.a()>
	//   21   47:aload_0         
	//   22   48:getfield        #181 <Field bdc u>
	//   23   51:getfield        #353 <Field long bdc.d>
	//   24   54:invokestatic    #349 <Method long bcr.a(long)>
	//   25   57:ladd            
	//   26   58:lreturn         
		} else
		{
			return x;
	//   27   59:aload_0         
	//   28   60:getfield        #229 <Field long x>
	//   29   63:lreturn         
		}
	}

	private final bdl a[];
	private final bmf b;
	private final bme c;
	private final Handler d;
	private final bda e;
	private final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
	private final bds g = new bds();
	private final bdr h = new bdr();
	private boolean i;
	private boolean j;
	private int k;
	private int l;
	private int m;
	private int n;
	private boolean o;
	private bdp p;
	private Object q;
	private bjo r;
	private bme s;
	private bdk t;
	private bdc u;
	private int v;
	private int w;
	private long x;
}
