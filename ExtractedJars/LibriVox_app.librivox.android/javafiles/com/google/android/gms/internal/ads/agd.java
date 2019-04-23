// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			byh, abj, age, agf, 
//			add, byj, wx, zzzw

public final class agd extends byh
{

	public agd(add add1, float f1, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void byh()>
	//    2    4:aload_0         
	//    3    5:new             #34  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void Object()>
	//    6   12:putfield        #37  <Field Object b>
		h = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #39  <Field boolean h>
		a = add1;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #41  <Field add a>
		i = f1;
	//   13   25:aload_0         
	//   14   26:fload_2         
	//   15   27:putfield        #43  <Field float i>
		c = flag;
	//   16   30:aload_0         
	//   17   31:iload_3         
	//   18   32:putfield        #45  <Field boolean c>
		d = flag1;
	//   19   35:aload_0         
	//   20   36:iload           4
	//   21   38:putfield        #47  <Field boolean d>
	//   22   41:return          
	}

	private final void a(String s, Map map)
	{
		if(map == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
			map = ((Map) (new HashMap()));
	//    2    4:new             #51  <Class HashMap>
	//    3    7:dup             
	//    4    8:invokespecial   #52  <Method void HashMap()>
	//    5   11:astore_2        
		else
	//*   6   12:goto            24
			map = ((Map) (new HashMap(map)));
	//    7   15:new             #51  <Class HashMap>
	//    8   18:dup             
	//    9   19:aload_2         
	//   10   20:invokespecial   #55  <Method void HashMap(Map)>
	//   11   23:astore_2        
		map.put("action", ((Object) (s)));
	//   12   24:aload_2         
	//   13   25:ldc1            #57  <String "action">
	//   14   27:aload_1         
	//   15   28:invokeinterface #63  <Method Object Map.put(Object, Object)>
	//   16   33:pop             
		abj.a.execute(((Runnable) (new age(this, map))));
	//   17   34:getstatic       #68  <Field Executor abj.a>
	//   18   37:new             #70  <Class age>
	//   19   40:dup             
	//   20   41:aload_0         
	//   21   42:aload_2         
	//   22   43:invokespecial   #73  <Method void age(agd, Map)>
	//   23   46:invokeinterface #79  <Method void Executor.execute(Runnable)>
	//   24   51:return          
	}

	private final void b(int i1, int j1, boolean flag, boolean flag1)
	{
		abj.a.execute(((Runnable) (new agf(this, i1, j1, flag, flag1))));
	//    0    0:getstatic       #68  <Field Executor abj.a>
	//    1    3:new             #82  <Class agf>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokespecial   #85  <Method void agf(agd, int, int, boolean, boolean)>
	//    9   16:invokeinterface #79  <Method void Executor.execute(Runnable)>
	//   10   21:return          
	}

	public final void a()
	{
		a("play", ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #87  <String "play">
	//    2    3:aconst_null     
	//    3    4:invokespecial   #89  <Method void a(String, Map)>
	//    4    7:return          
	}

	public final void a(float f1)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			j = f1;
	//    5    7:aload_0         
	//    6    8:fload_1         
	//    7    9:putfield        #92  <Field float j>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		exception;
	//   11   15:astore_3        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw exception;
	//   14   18:aload_3         
	//   15   19:athrow          
	}

	public final void a(float f1, float f2, int i1, boolean flag, float f3)
	{
		int j1;
		boolean flag1;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore          8
	//*   3    6:aload           8
	//*   4    8:monitorenter    
		{
			i = f2;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #43  <Field float i>
			j = f1;
	//    8   14:aload_0         
	//    9   15:fload_1         
	//   10   16:putfield        #92  <Field float j>
			flag1 = h;
	//   11   19:aload_0         
	//   12   20:getfield        #39  <Field boolean h>
	//   13   23:istore          7
			h = flag;
	//   14   25:aload_0         
	//   15   26:iload           4
	//   16   28:putfield        #39  <Field boolean h>
			j1 = e;
	//   17   31:aload_0         
	//   18   32:getfield        #95  <Field int e>
	//   19   35:istore          6
			e = i1;
	//   20   37:aload_0         
	//   21   38:iload_3         
	//   22   39:putfield        #95  <Field int e>
			f1 = k;
	//   23   42:aload_0         
	//   24   43:getfield        #97  <Field float k>
	//   25   46:fstore_1        
			k = f3;
	//   26   47:aload_0         
	//   27   48:fload           5
	//   28   50:putfield        #97  <Field float k>
			if(Math.abs(k - f1) > 0.0001F)
	//*  29   53:aload_0         
	//*  30   54:getfield        #97  <Field float k>
	//*  31   57:fload_1         
	//*  32   58:fsub            
	//*  33   59:invokestatic    #103 <Method float Math.abs(float)>
	//*  34   62:ldc1            #104 <Float 0.0001F>
	//*  35   64:fcmpl           
	//*  36   65:ifle            80
				a.getView().invalidate();
	//   37   68:aload_0         
	//   38   69:getfield        #41  <Field add a>
	//   39   72:invokeinterface #110 <Method View add.getView()>
	//   40   77:invokevirtual   #115 <Method void View.invalidate()>
		}
	//   41   80:aload           8
	//   42   82:monitorexit     
		b(j1, i1, flag1, flag);
	//   43   83:aload_0         
	//   44   84:iload           6
	//   45   86:iload_3         
	//   46   87:iload           7
	//   47   89:iload           4
	//   48   91:invokespecial   #117 <Method void b(int, int, boolean, boolean)>
		return;
	//   49   94:return          
		exception;
	//   50   95:astore          9
		obj;
	//   51   97:aload           8
		JVM INSTR monitorexit ;
	//   52   99:monitorexit     
		throw exception;
	//   53  100:aload           9
	//   54  102:athrow          
	}

	final void a(int i1, int j1, boolean flag, boolean flag1)
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object b>
	//    2    4:astore          9
		obj;
	//    3    6:aload           9
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		boolean flag3;
		boolean flag5;
		flag5 = false;
	//    5    9:iconst_0        
	//    6   10:istore          8
		if(i1 != j1)
	//*   7   12:iload_1         
	//*   8   13:iload_2         
	//*   9   14:icmpeq          23
			flag3 = true;
	//   10   17:iconst_1        
	//   11   18:istore          6
		else
	//*  12   20:goto            26
			flag3 = false;
	//   13   23:iconst_0        
	//   14   24:istore          6
		break MISSING_BLOCK_LABEL_26;
	//*  15   26:aload_0         
	//*  16   27:getfield        #121 <Field boolean g>
	//*  17   30:ifne            227
	//*  18   33:iload_2         
	//*  19   34:iconst_1        
	//*  20   35:icmpne          227
	//*  21   38:iconst_1        
	//*  22   39:istore_1        
	//*  23   40:goto            229
_L4:
		if(g)
			break MISSING_BLOCK_LABEL_302;
	//   24   43:aload_0         
	//   25   44:getfield        #121 <Field boolean g>
	//   26   47:ifne            302
		flag = flag5;
	//   27   50:iload           8
	//   28   52:istore_3        
		if(i1 != 0)
	//*  29   53:iload_1         
	//*  30   54:ifeq            60
			break MISSING_BLOCK_LABEL_302;
	//   31   57:goto            302
_L2:
		g = flag;
	//   32   60:aload_0         
	//   33   61:iload_3         
	//   34   62:putfield        #121 <Field boolean g>
		if(f != null)
			break MISSING_BLOCK_LABEL_76;
	//   35   65:aload_0         
	//   36   66:getfield        #123 <Field byj f>
	//   37   69:ifnonnull       76
		obj;
	//   38   72:aload           9
		JVM INSTR monitorexit ;
	//   39   74:monitorexit     
		return;
	//   40   75:return          
		if(i1 == 0)
			break MISSING_BLOCK_LABEL_101;
	//   41   76:iload_1         
	//   42   77:ifeq            101
		f.a();
	//   43   80:aload_0         
	//   44   81:getfield        #123 <Field byj f>
	//   45   84:invokeinterface #127 <Method void byj.a()>
		break MISSING_BLOCK_LABEL_101;
	//   46   89:goto            101
		obj1;
	//   47   92:astore          10
		wx.c("Unable to call onVideoStart()", ((Throwable) (obj1)));
	//   48   94:ldc1            #129 <String "Unable to call onVideoStart()">
	//   49   96:aload           10
	//   50   98:invokestatic    #134 <Method void wx.c(String, Throwable)>
		if(!flag2)
			break MISSING_BLOCK_LABEL_127;
	//   51  101:iload           5
	//   52  103:ifeq            127
		f.b();
	//   53  106:aload_0         
	//   54  107:getfield        #123 <Field byj f>
	//   55  110:invokeinterface #136 <Method void byj.b()>
		break MISSING_BLOCK_LABEL_127;
	//   56  115:goto            127
		obj1;
	//   57  118:astore          10
		wx.c("Unable to call onVideoPlay()", ((Throwable) (obj1)));
	//   58  120:ldc1            #138 <String "Unable to call onVideoPlay()">
	//   59  122:aload           10
	//   60  124:invokestatic    #134 <Method void wx.c(String, Throwable)>
		if(!flag4)
			break MISSING_BLOCK_LABEL_153;
	//   61  127:iload           7
	//   62  129:ifeq            153
		f.c();
	//   63  132:aload_0         
	//   64  133:getfield        #123 <Field byj f>
	//   65  136:invokeinterface #140 <Method void byj.c()>
		break MISSING_BLOCK_LABEL_153;
	//   66  141:goto            153
		obj1;
	//   67  144:astore          10
		wx.c("Unable to call onVideoPause()", ((Throwable) (obj1)));
	//   68  146:ldc1            #142 <String "Unable to call onVideoPause()">
	//   69  148:aload           10
	//   70  150:invokestatic    #134 <Method void wx.c(String, Throwable)>
		if(j1 == 0)
			break MISSING_BLOCK_LABEL_187;
	//   71  153:iload_2         
	//   72  154:ifeq            187
		f.d();
	//   73  157:aload_0         
	//   74  158:getfield        #123 <Field byj f>
	//   75  161:invokeinterface #144 <Method void byj.d()>
		break MISSING_BLOCK_LABEL_178;
	//   76  166:goto            178
		obj1;
	//   77  169:astore          10
		wx.c("Unable to call onVideoEnd()", ((Throwable) (obj1)));
	//   78  171:ldc1            #146 <String "Unable to call onVideoEnd()">
	//   79  173:aload           10
	//   80  175:invokestatic    #134 <Method void wx.c(String, Throwable)>
		a.n();
	//   81  178:aload_0         
	//   82  179:getfield        #41  <Field add a>
	//   83  182:invokeinterface #149 <Method void add.n()>
		if(!flag3)
			break MISSING_BLOCK_LABEL_215;
	//   84  187:iload           6
	//   85  189:ifeq            215
		f.a(flag1);
	//   86  192:aload_0         
	//   87  193:getfield        #123 <Field byj f>
	//   88  196:iload           4
	//   89  198:invokeinterface #152 <Method void byj.a(boolean)>
		break MISSING_BLOCK_LABEL_215;
	//   90  203:goto            215
		obj1;
	//   91  206:astore          10
		wx.c("Unable to call onVideoMute()", ((Throwable) (obj1)));
	//   92  208:ldc1            #154 <String "Unable to call onVideoMute()">
	//   93  210:aload           10
	//   94  212:invokestatic    #134 <Method void wx.c(String, Throwable)>
		obj;
	//   95  215:aload           9
		JVM INSTR monitorexit ;
	//   96  217:monitorexit     
		return;
	//   97  218:return          
		obj1;
	//   98  219:astore          10
		obj;
	//   99  221:aload           9
		JVM INSTR monitorexit ;
	//  100  223:monitorexit     
		throw obj1;
	//  101  224:aload           10
	//  102  226:athrow          
		{
			boolean flag2;
			boolean flag4;
			Object obj1;
			if(!g && j1 == 1)
				i1 = 1;
			else
				i1 = 0;
	//  103  227:iconst_0        
	//  104  228:istore_1        
			if(flag3 && j1 == 1)
	//* 105  229:iload           6
	//* 106  231:ifeq            245
	//* 107  234:iload_2         
	//* 108  235:iconst_1        
	//* 109  236:icmpne          245
				flag2 = true;
	//  110  239:iconst_1        
	//  111  240:istore          5
			else
	//* 112  242:goto            248
				flag2 = false;
	//  113  245:iconst_0        
	//  114  246:istore          5
			if(flag3 && j1 == 2)
	//* 115  248:iload           6
	//* 116  250:ifeq            264
	//* 117  253:iload_2         
	//* 118  254:iconst_2        
	//* 119  255:icmpne          264
				flag4 = true;
	//  120  258:iconst_1        
	//  121  259:istore          7
			else
	//* 122  261:goto            267
				flag4 = false;
	//  123  264:iconst_0        
	//  124  265:istore          7
			if(flag3 && j1 == 3)
	//* 125  267:iload           6
	//* 126  269:ifeq            282
	//* 127  272:iload_2         
	//* 128  273:iconst_3        
	//* 129  274:icmpne          282
				j1 = 1;
	//  130  277:iconst_1        
	//  131  278:istore_2        
			else
	//* 132  279:goto            284
				j1 = 0;
	//  133  282:iconst_0        
	//  134  283:istore_2        
			if(flag != flag1)
	//* 135  284:iload_3         
	//* 136  285:iload           4
	//* 137  287:icmpeq          296
				flag3 = true;
	//  138  290:iconst_1        
	//  139  291:istore          6
			else
	//* 140  293:goto            43
				flag3 = false;
	//  141  296:iconst_0        
	//  142  297:istore          6
		}
		if(true)
			continue; /* Loop/switch isn't completed */
	//  143  299:goto            43
		flag = true;
	//  144  302:iconst_1        
	//  145  303:istore_3        
		if(true) goto _L2; else goto _L1
_L1:
		if(true) goto _L4; else goto _L3
_L3:
	//* 146  304:goto            60
	}

	public final void a(byj byj1)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			f = byj1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #123 <Field byj f>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		byj1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw byj1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void a(zzzw zzzw1)
	{
		a(zzzw1.a, zzzw1.b, zzzw1.c);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #160 <Field boolean zzzw.a>
	//    3    5:aload_1         
	//    4    6:getfield        #162 <Field boolean zzzw.b>
	//    5    9:aload_1         
	//    6   10:getfield        #163 <Field boolean zzzw.c>
	//    7   13:invokevirtual   #166 <Method void a(boolean, boolean, boolean)>
	//    8   16:return          
	}

	final void a(Map map)
	{
		a.a("pubVideoCmd", map);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field add a>
	//    2    4:ldc1            #168 <String "pubVideoCmd">
	//    3    6:aload_1         
	//    4    7:invokeinterface #169 <Method void add.a(String, Map)>
	//    5   12:return          
	}

	public final void a(boolean flag)
	{
		String s;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			s = "mute";
	//    2    4:ldc1            #171 <String "mute">
	//    3    6:astore_2        
		else
	//*   4    7:goto            13
			s = "unmute";
	//    5   10:ldc1            #173 <String "unmute">
	//    6   12:astore_2        
		a(s, ((Map) (null)));
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:aconst_null     
	//   10   16:invokespecial   #89  <Method void a(String, Map)>
	//   11   19:return          
	}

	public final void a(boolean flag, boolean flag1, boolean flag2)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			l = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #175 <Field boolean l>
			m = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #177 <Field boolean m>
		}
	//   11   19:aload           4
	//   12   21:monitorexit     
		if(flag)
	//*  13   22:iload_1         
	//*  14   23:ifeq            33
			obj = "1";
	//   15   26:ldc1            #179 <String "1">
	//   16   28:astore          4
		else
	//*  17   30:goto            37
			obj = "0";
	//   18   33:ldc1            #181 <String "0">
	//   19   35:astore          4
		String s;
		if(flag1)
	//*  20   37:iload_2         
	//*  21   38:ifeq            48
			s = "1";
	//   22   41:ldc1            #179 <String "1">
	//   23   43:astore          5
		else
	//*  24   45:goto            52
			s = "0";
	//   25   48:ldc1            #181 <String "0">
	//   26   50:astore          5
		String s1;
		if(flag2)
	//*  27   52:iload_3         
	//*  28   53:ifeq            63
			s1 = "1";
	//   29   56:ldc1            #179 <String "1">
	//   30   58:astore          6
		else
	//*  31   60:goto            67
			s1 = "0";
	//   32   63:ldc1            #181 <String "0">
	//   33   65:astore          6
		a("initialState", com.google.android.gms.common.util.f.a("muteStart", obj, "customControlsRequested", ((Object) (s)), "clickToExpandRequested", ((Object) (s1))));
	//   34   67:aload_0         
	//   35   68:ldc1            #183 <String "initialState">
	//   36   70:ldc1            #185 <String "muteStart">
	//   37   72:aload           4
	//   38   74:ldc1            #187 <String "customControlsRequested">
	//   39   76:aload           5
	//   40   78:ldc1            #189 <String "clickToExpandRequested">
	//   41   80:aload           6
	//   42   82:invokestatic    #194 <Method Map f.a(Object, Object, Object, Object, Object, Object)>
	//   43   85:invokespecial   #89  <Method void a(String, Map)>
		return;
	//   44   88:return          
		exception;
	//   45   89:astore          5
		obj;
	//   46   91:aload           4
		JVM INSTR monitorexit ;
	//   47   93:monitorexit     
		throw exception;
	//   48   94:aload           5
	//   49   96:athrow          
	}

	public final void b()
	{
		a("pause", ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #196 <String "pause">
	//    2    3:aconst_null     
	//    3    4:invokespecial   #89  <Method void a(String, Map)>
	//    4    7:return          
	}

	public final boolean c()
	{
		boolean flag;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = h;
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field boolean h>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final int d()
	{
		int i1;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i1 = e;
	//    5    7:aload_0         
	//    6    8:getfield        #95  <Field int e>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return i1;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final float e()
	{
		float f1;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			f1 = i;
	//    5    7:aload_0         
	//    6    8:getfield        #43  <Field float i>
	//    7   11:fstore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return f1;
	//   10   14:fload_1         
	//   11   15:freturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final float f()
	{
		float f1;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			f1 = j;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field float j>
	//    7   11:fstore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return f1;
	//   10   14:fload_1         
	//   11   15:freturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final byj g()
	{
		byj byj1;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			byj1 = f;
	//    5    7:aload_0         
	//    6    8:getfield        #123 <Field byj f>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return byj1;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final float h()
	{
		float f1;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			f1 = k;
	//    5    7:aload_0         
	//    6    8:getfield        #97  <Field float k>
	//    7   11:fstore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return f1;
	//   10   14:fload_1         
	//   11   15:freturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final boolean i()
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Object b>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(c && l)
	//*   5    7:aload_0         
	//*   6    8:getfield        #45  <Field boolean c>
	//*   7   11:ifeq            35
	//*   8   14:aload_0         
	//*   9   15:getfield        #175 <Field boolean l>
	//*  10   18:ifeq            35
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
		else
	//*  13   23:goto            26
	//*  14   26:aload_2         
	//*  15   27:monitorexit     
	//*  16   28:iload_1         
	//*  17   29:ireturn         
	//*  18   30:astore_3        
	//*  19   31:aload_2         
	//*  20   32:monitorexit     
	//*  21   33:aload_3         
	//*  22   34:athrow          
			flag = false;
	//   23   35:iconst_0        
	//   24   36:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  25   37:goto            26
	}

	public final boolean j()
	{
		boolean flag = i();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method boolean i()>
	//    2    4:istore_1        
		Object obj = b;
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field Object b>
	//    5    9:astore_2        
		obj;
	//    6   10:aload_2         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		if(flag) goto _L2; else goto _L1
	//    8   12:iload_1         
	//    9   13:ifne            47
_L1:
		if(!m || !d) goto _L2; else goto _L3
	//   10   16:aload_0         
	//   11   17:getfield        #177 <Field boolean m>
	//   12   20:ifeq            47
	//   13   23:aload_0         
	//   14   24:getfield        #47  <Field boolean d>
	//   15   27:ifeq            47
_L3:
		flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_1        
	//*  18   32:goto            35
_L6:
		obj;
	//   19   35:aload_2         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return flag;
	//   21   37:iload_1         
	//   22   38:ireturn         
_L4:
		obj;
	//   23   39:aload_2         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		Exception exception;
		throw exception;
	//   25   41:aload_3         
	//   26   42:athrow          
		exception;
	//   27   43:astore_3        
		if(true) goto _L4; else goto _L2
	//   28   44:goto            39
_L2:
		flag = false;
	//   29   47:iconst_0        
	//   30   48:istore_1        
		if(true) goto _L6; else goto _L5
	//   31   49:goto            35
_L5:
	}

	public final void k()
	{
		int i1;
		boolean flag;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Object b>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			flag = h;
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field boolean h>
	//    7   11:istore_2        
			i1 = e;
	//    8   12:aload_0         
	//    9   13:getfield        #95  <Field int e>
	//   10   16:istore_1        
			e = 3;
	//   11   17:aload_0         
	//   12   18:iconst_3        
	//   13   19:putfield        #95  <Field int e>
		}
	//   14   22:aload_3         
	//   15   23:monitorexit     
		b(i1, 3, flag, flag);
	//   16   24:aload_0         
	//   17   25:iload_1         
	//   18   26:iconst_3        
	//   19   27:iload_2         
	//   20   28:iload_2         
	//   21   29:invokespecial   #117 <Method void b(int, int, boolean, boolean)>
		return;
	//   22   32:return          
		exception;
	//   23   33:astore          4
		obj;
	//   24   35:aload_3         
		JVM INSTR monitorexit ;
	//   25   36:monitorexit     
		throw exception;
	//   26   37:aload           4
	//   27   39:athrow          
	}

	private final add a;
	private final Object b = new Object();
	private final boolean c;
	private final boolean d;
	private int e;
	private byj f;
	private boolean g;
	private boolean h;
	private float i;
	private float j;
	private float k;
	private boolean l;
	private boolean m;
}
