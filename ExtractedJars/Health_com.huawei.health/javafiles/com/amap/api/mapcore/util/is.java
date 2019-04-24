// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			ir, jg, iw, iq, 
//			iu, gy, iv, gt, 
//			ik, io, jj

public final class is
	implements jg.a
{

	public is(Context context, io io1, gy gy1, iw iw1, iw iw2, iw iw3, ik ik1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		d = iw1;
	//    2    4:aload_0         
	//    3    5:aload           4
	//    4    7:putfield        #31  <Field iw d>
		e = iw2;
	//    5   10:aload_0         
	//    6   11:aload           5
	//    7   13:putfield        #33  <Field iw e>
		f = iw3;
	//    8   16:aload_0         
	//    9   17:aload           6
	//   10   19:putfield        #35  <Field iw f>
		g = ik1;
	//   11   22:aload_0         
	//   12   23:aload           7
	//   13   25:putfield        #37  <Field ik g>
		try
		{
			i = context.getApplicationContext();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #43  <Method Context Context.getApplicationContext()>
	//   17   33:putfield        #45  <Field Context i>
			h = gy1;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #47  <Field gy h>
			c = io1;
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:putfield        #49  <Field io c>
			a = ((jj) (new ir(c)));
	//   24   46:aload_0         
	//   25   47:new             #51  <Class ir>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:getfield        #49  <Field io c>
	//   29   55:invokespecial   #54  <Method void ir(io)>
	//   30   58:putfield        #56  <Field jj a>
			b = new jg(a);
	//   31   61:aload_0         
	//   32   62:new             #58  <Class jg>
	//   33   65:dup             
	//   34   66:aload_0         
	//   35   67:getfield        #56  <Field jj a>
	//   36   70:invokespecial   #61  <Method void jg(jj)>
	//   37   73:putfield        #63  <Field jg b>
			return;
	//   38   76:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  39   77:astore_1        
		{
			return;
	//   40   78:return          
		}
	}

	private static boolean a(iw iw1, iw iw2)
	{
		if(iw2 == null || iw2.d() == null || TextUtils.isEmpty(((CharSequence) (iw2.c()))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #70  <Method List iw.d()>
	//*   4    8:ifnull          21
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #73  <Method String iw.c()>
	//*   7   15:invokestatic    #79  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   18:ifeq            23
			return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
		if(iw1 == null || iw1.d() == null || TextUtils.isEmpty(((CharSequence) (iw1.c()))))
	//*  11   23:aload_0         
	//*  12   24:ifnull          44
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #70  <Method List iw.d()>
	//*  15   31:ifnull          44
	//*  16   34:aload_0         
	//*  17   35:invokevirtual   #73  <Method String iw.c()>
	//*  18   38:invokestatic    #79  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   41:ifeq            46
			return true;
	//   20   44:iconst_1        
	//   21   45:ireturn         
		if(iq.a(iw1.c(), iw2.c()) > 0)
	//*  22   46:aload_0         
	//*  23   47:invokevirtual   #73  <Method String iw.c()>
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #73  <Method String iw.c()>
	//*  26   54:invokestatic    #84  <Method int iq.a(String, String)>
	//*  27   57:ifle            62
			return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
		iw1 = ((iw) (iw1.d()));
	//   30   62:aload_0         
	//   31   63:invokevirtual   #70  <Method List iw.d()>
	//   32   66:astore_0        
		iw2 = ((iw) (iw2.d()));
	//   33   67:aload_1         
	//   34   68:invokevirtual   #70  <Method List iw.d()>
	//   35   71:astore_1        
		for(int j = 0; j < ((List) (iw2)).size(); j++)
	//*  36   72:iconst_0        
	//*  37   73:istore_2        
	//*  38   74:iload_2         
	//*  39   75:aload_1         
	//*  40   76:invokeinterface #90  <Method int List.size()>
	//*  41   81:icmpge          168
		{
			iu iu1 = (iu)((List) (iw2)).get(j);
	//   42   84:aload_1         
	//   43   85:iload_2         
	//   44   86:invokeinterface #94  <Method Object List.get(int)>
	//   45   91:checkcast       #96  <Class iu>
	//   46   94:astore          4
			for(int k = 0; k < ((List) (iw1)).size(); k++)
	//*  47   96:iconst_0        
	//*  48   97:istore_3        
	//*  49   98:iload_3         
	//*  50   99:aload_0         
	//*  51  100:invokeinterface #90  <Method int List.size()>
	//*  52  105:icmpge          161
			{
				iu iu2 = (iu)((List) (iw1)).get(k);
	//   53  108:aload_0         
	//   54  109:iload_3         
	//   55  110:invokeinterface #94  <Method Object List.get(int)>
	//   56  115:checkcast       #96  <Class iu>
	//   57  118:astore          5
				if(iu1.f().equals(((Object) (iu2.f()))) && iq.a(iu1.e(), iu2.e()) <= 0)
	//*  58  120:aload           4
	//*  59  122:invokevirtual   #98  <Method String iu.f()>
	//*  60  125:aload           5
	//*  61  127:invokevirtual   #98  <Method String iu.f()>
	//*  62  130:invokevirtual   #104 <Method boolean String.equals(Object)>
	//*  63  133:ifeq            154
	//*  64  136:aload           4
	//*  65  138:invokevirtual   #106 <Method String iu.e()>
	//*  66  141:aload           5
	//*  67  143:invokevirtual   #106 <Method String iu.e()>
	//*  68  146:invokestatic    #84  <Method int iq.a(String, String)>
	//*  69  149:ifgt            154
					return false;
	//   70  152:iconst_0        
	//   71  153:ireturn         
			}

	//   72  154:iload_3         
	//   73  155:iconst_1        
	//   74  156:iadd            
	//   75  157:istore_3        
		}

	//   76  158:goto            98
	//   77  161:iload_2         
	//   78  162:iconst_1        
	//   79  163:iadd            
	//   80  164:istore_2        
	//*  81  165:goto            74
		return true;
	//   82  168:iconst_1        
	//   83  169:ireturn         
	}

	private boolean b()
	{
		boolean flag;
		Object obj;
		iu iu1;
		try
		{
			obj = ((Object) (d));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field iw d>
	//    2    4:astore_2        
		}
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       14
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:goto            63
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #109 <Method String iw.a()>
	//*  10   18:aload_0         
	//*  11   19:getfield        #47  <Field gy h>
	//*  12   22:invokevirtual   #112 <Method String gy.a()>
	//*  13   25:invokevirtual   #104 <Method boolean String.equals(Object)>
	//*  14   28:ifeq            315
	//*  15   31:aload_2         
	//*  16   32:invokevirtual   #114 <Method String iw.b()>
	//*  17   35:aload_0         
	//*  18   36:getfield        #47  <Field gy h>
	//*  19   39:invokevirtual   #115 <Method String gy.b()>
	//*  20   42:invokevirtual   #104 <Method boolean String.equals(Object)>
	//*  21   45:ifne            51
	//*  22   48:goto            315
	//*  23   51:aload_2         
	//*  24   52:invokevirtual   #70  <Method List iw.d()>
	//*  25   55:ifnonnull       320
	//*  26   58:iconst_0        
	//*  27   59:istore_1        
	//*  28   60:goto            63
	//*  29   63:iload_1         
	//*  30   64:ifeq            307
	//*  31   67:aload_0         
	//*  32   68:getfield        #31  <Field iw d>
	//*  33   71:ifnull          325
	//*  34   74:aload_0         
	//*  35   75:getfield        #31  <Field iw d>
	//*  36   78:invokevirtual   #70  <Method List iw.d()>
	//*  37   81:ifnonnull       87
	//*  38   84:goto            325
	//*  39   87:aload_0         
	//*  40   88:getfield        #31  <Field iw d>
	//*  41   91:invokevirtual   #70  <Method List iw.d()>
	//*  42   94:invokeinterface #119 <Method Iterator List.iterator()>
	//*  43   99:astore_2        
	//*  44  100:aload_2         
	//*  45  101:invokeinterface #124 <Method boolean Iterator.hasNext()>
	//*  46  106:ifeq            135
	//*  47  109:aload_2         
	//*  48  110:invokeinterface #128 <Method Object Iterator.next()>
	//*  49  115:checkcast       #96  <Class iu>
	//*  50  118:astore_3        
	//*  51  119:aload_0         
	//*  52  120:getfield        #45  <Field Context i>
	//*  53  123:aload_3         
	//*  54  124:invokestatic    #133 <Method boolean iv.b(Context, iu)>
	//*  55  127:ifeq            330
	//*  56  130:iconst_1        
	//*  57  131:istore_1        
	//*  58  132:goto            212
	//*  59  135:aload_0         
	//*  60  136:getfield        #33  <Field iw e>
	//*  61  139:ifnonnull       149
	//*  62  142:aload_0         
	//*  63  143:getfield        #35  <Field iw f>
	//*  64  146:ifnull          333
	//*  65  149:aload_0         
	//*  66  150:getfield        #47  <Field gy h>
	//*  67  153:invokevirtual   #115 <Method String gy.b()>
	//*  68  156:aload_0         
	//*  69  157:getfield        #31  <Field iw d>
	//*  70  160:invokevirtual   #73  <Method String iw.c()>
	//*  71  163:invokestatic    #84  <Method int iq.a(String, String)>
	//*  72  166:iflt            174
	//*  73  169:iconst_1        
	//*  74  170:istore_1        
	//*  75  171:goto            212
	//*  76  174:aload_0         
	//*  77  175:getfield        #33  <Field iw e>
	//*  78  178:aload_0         
	//*  79  179:getfield        #31  <Field iw d>
	//*  80  182:invokestatic    #135 <Method boolean a(iw, iw)>
	//*  81  185:ifne            193
	//*  82  188:iconst_1        
	//*  83  189:istore_1        
	//*  84  190:goto            212
	//*  85  193:aload_0         
	//*  86  194:getfield        #35  <Field iw f>
	//*  87  197:aload_0         
	//*  88  198:getfield        #31  <Field iw d>
	//*  89  201:invokestatic    #135 <Method boolean a(iw, iw)>
	//*  90  204:ifne            333
	//*  91  207:iconst_1        
	//*  92  208:istore_1        
	//*  93  209:goto            212
	//*  94  212:iload_1         
	//*  95  213:ifne            307
	//*  96  216:aload_0         
	//*  97  217:getfield        #45  <Field Context i>
	//*  98  220:astore_2        
	//*  99  221:aload_0         
	//* 100  222:getfield        #31  <Field iw d>
	//* 101  225:getfield        #138 <Field boolean iw.f>
	//* 102  228:ifne            344
	//* 103  231:aload_2         
	//* 104  232:invokestatic    #144 <Method int gt.p(Context)>
	//* 105  235:iconst_1        
	//* 106  236:icmpne          338
	//* 107  239:iconst_1        
	//* 108  240:istore_1        
	//* 109  241:goto            340
	//* 110  244:iload_1         
	//* 111  245:ifeq            307
	//* 112  248:aload_0         
	//* 113  249:getfield        #31  <Field iw d>
	//* 114  252:astore_2        
	//* 115  253:aload_2         
	//* 116  254:ifnonnull       262
	//* 117  257:iconst_0        
	//* 118  258:istore_1        
	//* 119  259:goto            301
	//* 120  262:getstatic       #150 <Field int android.os.Build$VERSION.SDK_INT>
	//* 121  265:aload_2         
	//* 122  266:getfield        #152 <Field int iw.b>
	//* 123  269:icmplt          354
	//* 124  272:getstatic       #150 <Field int android.os.Build$VERSION.SDK_INT>
	//* 125  275:aload_2         
	//* 126  276:getfield        #154 <Field int iw.a>
	//* 127  279:icmple          285
	//* 128  282:goto            354
	//* 129  285:aload_2         
	//* 130  286:invokevirtual   #70  <Method List iw.d()>
	//* 131  289:astore_2        
	//* 132  290:aload_2         
	//* 133  291:ifnonnull       299
	//* 134  294:iconst_0        
	//* 135  295:istore_1        
	//* 136  296:goto            301
	//* 137  299:iconst_1        
	//* 138  300:istore_1        
	//* 139  301:iload_1         
	//* 140  302:ifeq            307
	//* 141  305:iconst_1        
	//* 142  306:ireturn         
	//* 143  307:iconst_0        
	//* 144  308:ireturn         
	//* 145  309:iconst_0        
	//* 146  310:ireturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return false;
		}
		if(obj != null) goto _L2; else goto _L1
_L1:
		flag = false;
		  goto _L3
_L2:
		if(((iw) (obj)).a().equals(((Object) (h.a()))) && ((iw) (obj)).b().equals(((Object) (h.b())))) goto _L5; else goto _L4
_L5:
		Throwable throwable;
		if(((iw) (obj)).d() == null)
			flag = false;
		else
	//* 147  311:astore_2        
	//* 148  312:goto            309
	//* 149  315:iconst_0        
	//* 150  316:istore_1        
	//* 151  317:goto            63
			flag = true;
	//  152  320:iconst_1        
	//  153  321:istore_1        
_L3:
		if(!flag) goto _L7; else goto _L6
_L6:
		if(d != null && d.d() != null) goto _L9; else goto _L8
_L9:
		obj = ((Object) (d.d().iterator()));
_L13:
		if(!((Iterator) (obj)).hasNext()) goto _L11; else goto _L10
_L10:
		iu1 = (iu)((Iterator) (obj)).next();
		if(!iv.b(i, iu1)) goto _L13; else goto _L12
_L12:
		flag = true;
		  goto _L14
_L11:
		if(e == null && f == null) goto _L16; else goto _L15
_L15:
		if(iq.a(h.b(), d.c()) < 0) goto _L18; else goto _L17
_L17:
		flag = true;
		  goto _L14
_L18:
		if(a(e, d)) goto _L20; else goto _L19
_L19:
		flag = true;
		  goto _L14
_L20:
		if(a(f, d)) goto _L16; else goto _L21
_L21:
		flag = true;
_L14:
		if(flag) goto _L7; else goto _L22
_L22:
		obj = ((Object) (i));
		if(d.f) goto _L24; else goto _L23
_L23:
		if(gt.p(((Context) (obj))) == 1)
			flag = true;
		else
	//* 154  322:goto            63
	//* 155  325:iconst_1        
	//* 156  326:istore_1        
	//* 157  327:goto            212
	//* 158  330:goto            100
	//* 159  333:iconst_0        
	//* 160  334:istore_1        
	//* 161  335:goto            212
			flag = false;
	//  162  338:iconst_0        
	//  163  339:istore_1        
		  goto _L25
_L28:
		if(!flag) goto _L7; else goto _L26
_L26:
		obj = ((Object) (d));
		if(obj == null)
		{
			flag = false;
			break MISSING_BLOCK_LABEL_301;
		}
		if(android.os.Build.VERSION.SDK_INT < ((iw) (obj)).b || android.os.Build.VERSION.SDK_INT > ((iw) (obj)).a)
			break MISSING_BLOCK_LABEL_354;
		obj = ((Object) (((iw) (obj)).d()));
		if(obj == null)
			flag = false;
		else
			flag = true;
_L29:
		if(flag)
			return true;
_L7:
		return false;
_L4:
		flag = false;
		  goto _L3
_L8:
		flag = true;
		  goto _L14
_L16:
		flag = false;
		  goto _L14
_L25:
		if(!flag) goto _L27; else goto _L24
	//  164  340:iload_1         
	//  165  341:ifeq            349
_L24:
		flag = true;
	//  166  344:iconst_1        
	//  167  345:istore_1        
		  goto _L28
	//* 168  346:goto            244
_L27:
		flag = false;
	//  169  349:iconst_0        
	//  170  350:istore_1        
		  goto _L28
	//* 171  351:goto            244
		flag = false;
	//  172  354:iconst_0        
	//  173  355:istore_1        
		  goto _L29
	//* 174  356:goto            301
	}

	public final void a()
	{
		try
		{
			if(b())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #156 <Method boolean b()>
	//*   2    4:ifeq            32
			{
				ik.e(g.a(h.a()));
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field ik g>
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field gy h>
	//    7   15:invokevirtual   #112 <Method String gy.a()>
	//    8   18:invokevirtual   #161 <Method String ik.a(String)>
	//    9   21:invokestatic    #164 <Method void ik.e(String)>
				b.a(((jg.a) (this)));
	//   10   24:aload_0         
	//   11   25:getfield        #63  <Field jg b>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #167 <Method void jg.a(jg$a)>
			}
			return;
	//   14   32:return          
		}
		catch(Throwable throwable)
	//*  15   33:astore_1        
		{
			return;
	//   16   34:return          
		}
		catch(Throwable throwable1)
	//*  17   35:astore_1        
		{
			return;
	//   18   36:return          
		}
	}

	public final void a(Throwable throwable)
	{
		c.b();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field io c>
	//    2    4:invokevirtual   #172 <Method void io.b()>
	//    3    7:return          
	}

	public final void a(byte abyte0[], long l)
	{
		c.a(abyte0, l);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field io c>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #175 <Method void io.a(byte[], long)>
	//    5    9:return          
	}

	public final void d()
	{
	//    0    0:return          
	}

	public final void e()
	{
		c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field io c>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field Context i>
	//    4    8:invokevirtual   #178 <Method void io.a(Context)>
	//    5   11:return          
	}

	private jj a;
	private jg b;
	private io c;
	private iw d;
	private iw e;
	private iw f;
	private ik g;
	private gy h;
	private Context i;
}
