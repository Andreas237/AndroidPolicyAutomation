// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aas, au, pc, ys, 
//			p, bwk, m, abe, 
//			afn, wx, pf, we, 
//			zzasm, pp, ow, abj, 
//			zzasi, zzacp, ou, pq, 
//			pr, abo, xg, oy, 
//			ps, pe, bl, bj, 
//			az, pa, wd, db, 
//			dm, aag, ahb, aft, 
//			abn, ox, agv, ph, 
//			pd, xe, pb, pg, 
//			bad, ad

public final class ov
	implements Callable
{

	public ov(Context context, ac ac1, ys ys1, bad bad, we we1, ad ad)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void Object()>
	//    6   12:putfield        #47  <Field Object g>
		b = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #49  <Field Context b>
		d = ac1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #51  <Field ac d>
		c = ys1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #53  <Field ys c>
		h = we1;
	//   16   30:aload_0         
	//   17   31:aload           5
	//   18   33:putfield        #55  <Field we h>
		e = bad;
	//   19   36:aload_0         
	//   20   37:aload           4
	//   21   39:putfield        #57  <Field bad e>
		i = ad;
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:putfield        #59  <Field ad i>
		f = ac1.I();
	//   25   48:aload_0         
	//   26   49:aload_2         
	//   27   50:invokevirtual   #64  <Method pp ac.I()>
	//   28   53:putfield        #66  <Field pp f>
		j = false;
	//   29   56:aload_0         
	//   30   57:iconst_0        
	//   31   58:putfield        #68  <Field boolean j>
		k = -2;
	//   32   61:aload_0         
	//   33   62:bipush          -2
	//   34   64:putfield        #70  <Field int k>
		l = null;
	//   35   67:aload_0         
	//   36   68:aconst_null     
	//   37   69:putfield        #72  <Field List l>
		n = null;
	//   38   72:aload_0         
	//   39   73:aconst_null     
	//   40   74:putfield        #74  <Field String n>
		o = null;
	//   41   77:aload_0         
	//   42   78:aconst_null     
	//   43   79:putfield        #76  <Field String o>
	//   44   82:return          
	}

	static ac a(ov ov1)
	{
		return ov1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ac d>
	//    2    4:areturn         
	}

	private final abe a(JSONObject jsonobject, boolean flag, boolean flag1)
	{
		String s;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
			s = jsonobject.getString("url");
	//    2    4:aload_1         
	//    3    5:ldc1            #80  <String "url">
	//    4    7:invokevirtual   #86  <Method String JSONObject.getString(String)>
	//    5   10:astore          7
		else
	//*   6   12:goto            23
			s = jsonobject.optString("url");
	//    7   15:aload_1         
	//    8   16:ldc1            #80  <String "url">
	//    9   18:invokevirtual   #89  <Method String JSONObject.optString(String)>
	//   10   21:astore          7
		double d1 = jsonobject.optDouble("scale", 1.0D);
	//   11   23:aload_1         
	//   12   24:ldc1            #91  <String "scale">
	//   13   26:dconst_1        
	//   14   27:invokevirtual   #95  <Method double JSONObject.optDouble(String, double)>
	//   15   30:dstore          4
		boolean flag2 = jsonobject.optBoolean("is_transparent", true);
	//   16   32:aload_1         
	//   17   33:ldc1            #97  <String "is_transparent">
	//   18   35:iconst_1        
	//   19   36:invokevirtual   #101 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   20   39:istore          6
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  21   41:aload           7
	//*  22   43:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   46:ifeq            60
		{
			a(0, flag);
	//   24   49:aload_0         
	//   25   50:iconst_0        
	//   26   51:iload_2         
	//   27   52:invokevirtual   #110 <Method void a(int, boolean)>
			return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (null)))));
	//   28   55:aconst_null     
	//   29   56:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//   30   59:areturn         
		}
		if(flag1)
	//*  31   60:iload_3         
	//*  32   61:ifeq            83
			return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (new au(((android.graphics.drawable.Drawable) (null)), Uri.parse(s), d1))))));
	//   33   64:new             #117 <Class au>
	//   34   67:dup             
	//   35   68:aconst_null     
	//   36   69:aload           7
	//   37   71:invokestatic    #123 <Method Uri Uri.parse(String)>
	//   38   74:dload           4
	//   39   76:invokespecial   #126 <Method void au(android.graphics.drawable.Drawable, Uri, double)>
	//   40   79:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//   41   82:areturn         
		else
			return c.a(s, ((yy) (new pc(this, flag, d1, flag2, s))));
	//   42   83:aload_0         
	//   43   84:getfield        #53  <Field ys c>
	//   44   87:aload           7
	//   45   89:new             #128 <Class pc>
	//   46   92:dup             
	//   47   93:aload_0         
	//   48   94:iload_2         
	//   49   95:dload           4
	//   50   97:iload           6
	//   51   99:aload           7
	//   52  101:invokespecial   #131 <Method void pc(ov, boolean, double, boolean, String)>
	//   53  104:invokevirtual   #136 <Method abe com.google.android.gms.internal.ads.ys.a(String, yy)>
	//   54  107:areturn         
	}

	static afn a(abe abe1)
	{
		e e1 = p.bz;
	//    0    0:getstatic       #151 <Field e p.bz>
	//    1    3:astore_1        
		abe1 = ((abe) ((afn)abe1.get(((Integer)bwk.e().a(e1)).intValue(), TimeUnit.SECONDS)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #156 <Method m bwk.e()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #161 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//    6   12:checkcast       #163 <Class Integer>
	//    7   15:invokevirtual   #167 <Method int Integer.intValue()>
	//    8   18:i2l             
	//    9   19:getstatic       #173 <Field TimeUnit TimeUnit.SECONDS>
	//   10   22:invokeinterface #179 <Method Object abe.get(long, TimeUnit)>
	//   11   27:checkcast       #181 <Class afn>
	//   12   30:astore_0        
		return ((afn) (abe1));
	//   13   31:aload_0         
	//   14   32:areturn         
		abe1;
	//   15   33:astore_0        
		break MISSING_BLOCK_LABEL_42;
	//   16   34:goto            42
		abe1;
	//   17   37:astore_0        
		break MISSING_BLOCK_LABEL_42;
	//   18   38:goto            42
		abe1;
	//   19   41:astore_0        
		wx.c("Exception occurred while waiting for video to load", ((Throwable) (abe1)));
	//   20   42:ldc1            #183 <String "Exception occurred while waiting for video to load">
	//   21   44:aload_0         
	//   22   45:invokestatic    #188 <Method void wx.c(String, Throwable)>
		break MISSING_BLOCK_LABEL_64;
	//   23   48:goto            64
		abe1;
	//   24   51:astore_0        
		wx.c("InterruptedException occurred while waiting for video to load", ((Throwable) (abe1)));
	//   25   52:ldc1            #190 <String "InterruptedException occurred while waiting for video to load">
	//   26   54:aload_0         
	//   27   55:invokestatic    #188 <Method void wx.c(String, Throwable)>
		Thread.currentThread().interrupt();
	//   28   58:invokestatic    #196 <Method Thread Thread.currentThread()>
	//   29   61:invokevirtual   #199 <Method void Thread.interrupt()>
		return null;
	//   30   64:aconst_null     
	//   31   65:areturn         
	}

	private static pf a(Context context, bad bad, we we1, ad ad, ac ac1)
	{
		return new pf(context, bad, we1, ad, ac1);
	//    0    0:new             #202 <Class pf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #205 <Method void pf(Context, bad, we, ad, ac)>
	//    8   13:areturn         
	}

	private final wd a()
	{
		String s = d.j_();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ac d>
	//    2    4:invokevirtual   #214 <Method String ac.j_()>
	//    3    7:astore          11
		if(b()) goto _L2; else goto _L1
	//    4    9:aload_0         
	//    5   10:invokespecial   #217 <Method boolean b()>
	//    6   13:ifne            949
_L1:
		Object obj;
		Object obj1;
		obj1 = ((Object) (new JSONObject(h.b.b)));
	//    7   16:new             #82  <Class JSONObject>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:getfield        #55  <Field we h>
	//   11   24:getfield        #222 <Field zzasm we.b>
	//   12   27:getfield        #226 <Field String zzasm.b>
	//   13   30:invokespecial   #229 <Method void JSONObject(String)>
	//   14   33:astore          7
		obj = ((Object) (new JSONObject(h.b.b)));
	//   15   35:new             #82  <Class JSONObject>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:getfield        #55  <Field we h>
	//   19   43:getfield        #222 <Field zzasm we.b>
	//   20   46:getfield        #226 <Field String zzasm.b>
	//   21   49:invokespecial   #229 <Method void JSONObject(String)>
	//   22   52:astore          6
		if(((JSONObject) (obj)).length() == 0) goto _L4; else goto _L3
	//   23   54:aload           6
	//   24   56:invokevirtual   #232 <Method int JSONObject.length()>
	//   25   59:ifeq            100
_L3:
		obj = ((Object) (((JSONObject) (obj)).optJSONArray("ads")));
	//   26   62:aload           6
	//   27   64:ldc1            #234 <String "ads">
	//   28   66:invokevirtual   #238 <Method JSONArray JSONObject.optJSONArray(String)>
	//   29   69:astore          6
		if(obj == null) goto _L6; else goto _L5
	//   30   71:aload           6
	//   31   73:ifnull          943
_L5:
		obj = ((Object) (((JSONArray) (obj)).optJSONObject(0)));
	//   32   76:aload           6
	//   33   78:iconst_0        
	//   34   79:invokevirtual   #244 <Method JSONObject JSONArray.optJSONObject(int)>
	//   35   82:astore          6
	//*  36   84:goto            87
_L38:
		if(obj == null) goto _L4; else goto _L7
	//   37   87:aload           6
	//   38   89:ifnull          100
_L7:
		if(((JSONObject) (obj)).length() != 0) goto _L8; else goto _L4
	//   39   92:aload           6
	//   40   94:invokevirtual   #232 <Method int JSONObject.length()>
	//   41   97:ifne            105
_L4:
		a(3);
	//   42  100:aload_0         
	//   43  101:iconst_3        
	//   44  102:invokespecial   #247 <Method void a(int)>
_L8:
		obj = ((Object) ((JSONObject)f.a(((JSONObject) (obj1))).get(a, TimeUnit.SECONDS)));
	//   45  105:aload_0         
	//   46  106:getfield        #66  <Field pp f>
	//   47  109:aload           7
	//   48  111:invokeinterface #252 <Method abe com.google.android.gms.internal.ads.pp.a(JSONObject)>
	//   49  116:getstatic       #254 <Field long a>
	//   50  119:getstatic       #173 <Field TimeUnit TimeUnit.SECONDS>
	//   51  122:invokeinterface #179 <Method Object abe.get(long, TimeUnit)>
	//   52  127:checkcast       #82  <Class JSONObject>
	//   53  130:astore          6
		if(!((JSONObject) (obj)).optBoolean("success", false)) goto _L2; else goto _L9
	//   54  132:aload           6
	//   55  134:ldc2            #256 <String "success">
	//   56  137:iconst_0        
	//   57  138:invokevirtual   #101 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   58  141:ifeq            949
_L9:
		Object obj2 = ((Object) (((JSONObject) (obj)).getJSONObject("json").optJSONArray("ads").getJSONObject(0)));
	//   59  144:aload           6
	//   60  146:ldc2            #258 <String "json">
	//   61  149:invokevirtual   #262 <Method JSONObject JSONObject.getJSONObject(String)>
	//   62  152:ldc1            #234 <String "ads">
	//   63  154:invokevirtual   #238 <Method JSONArray JSONObject.optJSONArray(String)>
	//   64  157:iconst_0        
	//   65  158:invokevirtual   #264 <Method JSONObject JSONArray.getJSONObject(int)>
	//   66  161:astore          8
	//*  67  163:goto            166
_L39:
		if(obj2 == null) goto _L11; else goto _L10
	//   68  166:aload           8
	//   69  168:ifnull          955
_L10:
		boolean flag = ((JSONObject) (obj2)).optBoolean("enable_omid");
	//   70  171:aload           8
	//   71  173:ldc2            #266 <String "enable_omid">
	//   72  176:invokevirtual   #269 <Method boolean JSONObject.optBoolean(String)>
	//   73  179:istore_2        
	//*  74  180:goto            183
_L40:
		if(flag) goto _L13; else goto _L12
	//   75  183:iload_2         
	//   76  184:ifne            196
_L12:
		int i1;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		Object obj3;
		String as[];
		JSONObject jsonobject;
		JSONArray jsonarray;
		try
		{
			obj1 = ((Object) (com.google.android.gms.internal.ads.aas.a(((Object) (null)))));
	//   77  187:aconst_null     
	//   78  188:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//   79  191:astore          7
			break MISSING_BLOCK_LABEL_269;
	//   80  193:goto            269
		}
	//*  81  196:aload           8
	//*  82  198:ldc2            #271 <String "omid_settings">
	//*  83  201:invokevirtual   #273 <Method JSONObject JSONObject.optJSONObject(String)>
	//*  84  204:astore          6
	//*  85  206:aload           6
	//*  86  208:ifnonnull       220
	//*  87  211:aconst_null     
	//*  88  212:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//*  89  215:astore          7
	//*  90  217:goto            269
	//*  91  220:aload           6
	//*  92  222:ldc2            #275 <String "omid_html">
	//*  93  225:invokevirtual   #89  <Method String JSONObject.optString(String)>
	//*  94  228:astore          6
	//*  95  230:aload           6
	//*  96  232:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  97  235:ifeq            247
	//*  98  238:aconst_null     
	//*  99  239:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//* 100  242:astore          7
	//* 101  244:goto            269
	//* 102  247:aconst_null     
	//* 103  248:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//* 104  251:new             #277 <Class ow>
	//* 105  254:dup             
	//* 106  255:aload_0         
	//* 107  256:aload           6
	//* 108  258:invokespecial   #280 <Method void ow(ov, String)>
	//* 109  261:getstatic       #285 <Field Executor com.google.android.gms.internal.ads.abj.a>
	//* 110  264:invokestatic    #288 <Method abe com.google.android.gms.internal.ads.aas.a(abe, aan, Executor)>
	//* 111  267:astore          7
	//* 112  269:aload_0         
	//* 113  270:invokespecial   #217 <Method boolean b()>
	//* 114  273:ifne            977
	//* 115  276:aload           8
	//* 116  278:ifnonnull       284
	//* 117  281:goto            977
	//* 118  284:aload           8
	//* 119  286:ldc2            #290 <String "template_id">
	//* 120  289:invokevirtual   #86  <Method String JSONObject.getString(String)>
	//* 121  292:astore          6
	//* 122  294:ldc2            #292 <String "instream">
	//* 123  297:aload           8
	//* 124  299:ldc2            #294 <String "type">
	//* 125  302:invokevirtual   #89  <Method String JSONObject.optString(String)>
	//* 126  305:invokevirtual   #300 <Method boolean String.equals(Object)>
	//* 127  308:istore          5
	//* 128  310:aload_0         
	//* 129  311:getfield        #55  <Field we h>
	//* 130  314:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//* 131  317:getfield        #309 <Field zzacp zzasi.y>
	//* 132  320:ifnull          960
	//* 133  323:aload_0         
	//* 134  324:getfield        #55  <Field we h>
	//* 135  327:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//* 136  330:getfield        #309 <Field zzacp zzasi.y>
	//* 137  333:getfield        #313 <Field boolean zzacp.b>
	//* 138  336:istore_3        
	//* 139  337:goto            340
	//* 140  340:aload_0         
	//* 141  341:getfield        #55  <Field we h>
	//* 142  344:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//* 143  347:getfield        #309 <Field zzacp zzasi.y>
	//* 144  350:ifnull          965
	//* 145  353:aload_0         
	//* 146  354:getfield        #55  <Field we h>
	//* 147  357:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//* 148  360:getfield        #309 <Field zzacp zzasi.y>
	//* 149  363:getfield        #315 <Field boolean zzacp.d>
	//* 150  366:istore          4
	//* 151  368:goto            371
	//* 152  371:iload           5
	//* 153  373:ifeq            388
	//* 154  376:new             #317 <Class ou>
	//* 155  379:dup             
	//* 156  380:invokespecial   #318 <Method void ou()>
	//* 157  383:astore          6
	//* 158  385:goto            592
	//* 159  388:ldc2            #320 <String "2">
	//* 160  391:aload           6
	//* 161  393:invokevirtual   #300 <Method boolean String.equals(Object)>
	//* 162  396:ifeq            421
	//* 163  399:new             #322 <Class pq>
	//* 164  402:dup             
	//* 165  403:iload_3         
	//* 166  404:iload           4
	//* 167  406:aload_0         
	//* 168  407:getfield        #55  <Field we h>
	//* 169  410:getfield        #323 <Field boolean we.j>
	//* 170  413:invokespecial   #326 <Method void pq(boolean, boolean, boolean)>
	//* 171  416:astore          6
	//* 172  418:goto            592
	//* 173  421:ldc2            #328 <String "1">
	//* 174  424:aload           6
	//* 175  426:invokevirtual   #300 <Method boolean String.equals(Object)>
	//* 176  429:ifeq            454
	//* 177  432:new             #330 <Class pr>
	//* 178  435:dup             
	//* 179  436:iload_3         
	//* 180  437:iload           4
	//* 181  439:aload_0         
	//* 182  440:getfield        #55  <Field we h>
	//* 183  443:getfield        #323 <Field boolean we.j>
	//* 184  446:invokespecial   #331 <Method void pr(boolean, boolean, boolean)>
	//* 185  449:astore          6
	//* 186  451:goto            592
	//* 187  454:ldc2            #333 <String "3">
	//* 188  457:aload           6
	//* 189  459:invokevirtual   #300 <Method boolean String.equals(Object)>
	//* 190  462:ifeq            584
	//* 191  465:aload           8
	//* 192  467:ldc2            #335 <String "custom_template_id">
	//* 193  470:invokevirtual   #86  <Method String JSONObject.getString(String)>
	//* 194  473:astore          6
	//* 195  475:new             #337 <Class abo>
	//* 196  478:dup             
	//* 197  479:invokespecial   #338 <Method void abo()>
	//* 198  482:astore          9
	//* 199  484:getstatic       #343 <Field Handler com.google.android.gms.internal.ads.xg.a>
	//* 200  487:new             #345 <Class oy>
	//* 201  490:dup             
	//* 202  491:aload_0         
	//* 203  492:aload           9
	//* 204  494:aload           6
	//* 205  496:invokespecial   #348 <Method void oy(ov, abo, String)>
	//* 206  499:invokevirtual   #354 <Method boolean Handler.post(Runnable)>
	//* 207  502:pop             
	//* 208  503:aload           9
	//* 209  505:getstatic       #254 <Field long a>
	//* 210  508:getstatic       #173 <Field TimeUnit TimeUnit.SECONDS>
	//* 211  511:invokevirtual   #355 <Method Object abo.get(long, TimeUnit)>
	//* 212  514:ifnull          530
	//* 213  517:new             #357 <Class ps>
	//* 214  520:dup             
	//* 215  521:iload_3         
	//* 216  522:invokespecial   #360 <Method void ps(boolean)>
	//* 217  525:astore          6
	//* 218  527:goto            592
	//* 219  530:aload           8
	//* 220  532:ldc2            #335 <String "custom_template_id">
	//* 221  535:invokevirtual   #86  <Method String JSONObject.getString(String)>
	//* 222  538:invokestatic    #364 <Method String String.valueOf(Object)>
	//* 223  541:astore          6
	//* 224  543:aload           6
	//* 225  545:invokevirtual   #365 <Method int String.length()>
	//* 226  548:ifeq            564
	//* 227  551:ldc2            #367 <String "No handler for custom template: ">
	//* 228  554:aload           6
	//* 229  556:invokevirtual   #370 <Method String String.concat(String)>
	//* 230  559:astore          6
	//* 231  561:goto            576
	//* 232  564:new             #296 <Class String>
	//* 233  567:dup             
	//* 234  568:ldc2            #367 <String "No handler for custom template: ">
	//* 235  571:invokespecial   #371 <Method void String(String)>
	//* 236  574:astore          6
	//* 237  576:aload           6
	//* 238  578:invokestatic    #373 <Method void wx.c(String)>
	//* 239  581:goto            971
	//* 240  584:aload_0         
	//* 241  585:iconst_0        
	//* 242  586:invokespecial   #247 <Method void a(int)>
	//* 243  589:goto            971
	//* 244  592:aload_0         
	//* 245  593:invokespecial   #217 <Method boolean b()>
	//* 246  596:ifne            994
	//* 247  599:aload           6
	//* 248  601:ifnull          994
	//* 249  604:aload           8
	//* 250  606:ifnonnull       612
	//* 251  609:goto            994
	//* 252  612:aload           8
	//* 253  614:ldc2            #375 <String "tracking_urls_and_actions">
	//* 254  617:invokevirtual   #262 <Method JSONObject JSONObject.getJSONObject(String)>
	//* 255  620:astore          12
	//* 256  622:aload           12
	//* 257  624:ldc2            #377 <String "impression_tracking_urls">
	//* 258  627:invokevirtual   #238 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 259  630:astore          13
	//* 260  632:aload           13
	//* 261  634:ifnonnull       643
	//* 262  637:aconst_null     
	//* 263  638:astore          9
	//* 264  640:goto            983
	//* 265  643:aload           13
	//* 266  645:invokevirtual   #378 <Method int JSONArray.length()>
	//* 267  648:anewarray       String[]
	//* 268  651:astore          10
	//* 269  653:iconst_0        
	//* 270  654:istore_1        
	//* 271  655:aload           10
	//* 272  657:astore          9
	//* 273  659:iload_1         
	//* 274  660:aload           13
	//* 275  662:invokevirtual   #378 <Method int JSONArray.length()>
	//* 276  665:icmpge          983
	//* 277  668:aload           10
	//* 278  670:iload_1         
	//* 279  671:aload           13
	//* 280  673:iload_1         
	//* 281  674:invokevirtual   #381 <Method String JSONArray.getString(int)>
	//* 282  677:aastore         
	//* 283  678:iload_1         
	//* 284  679:iconst_1        
	//* 285  680:iadd            
	//* 286  681:istore_1        
	//* 287  682:goto            655
	//* 288  685:aload           9
	//* 289  687:invokestatic    #387 <Method List Arrays.asList(Object[])>
	//* 290  690:astore          9
	//* 291  692:aload_0         
	//* 292  693:aload           9
	//* 293  695:putfield        #72  <Field List l>
	//* 294  698:aload_0         
	//* 295  699:aload           12
	//* 296  701:ldc2            #389 <String "active_view">
	//* 297  704:invokevirtual   #273 <Method JSONObject JSONObject.optJSONObject(String)>
	//* 298  707:putfield        #391 <Field JSONObject m>
	//* 299  710:aload_0         
	//* 300  711:aload           8
	//* 301  713:ldc2            #393 <String "debug_signals">
	//* 302  716:invokevirtual   #89  <Method String JSONObject.optString(String)>
	//* 303  719:putfield        #74  <Field String n>
	//* 304  722:aload_0         
	//* 305  723:aload           8
	//* 306  725:ldc2            #271 <String "omid_settings">
	//* 307  728:invokevirtual   #89  <Method String JSONObject.optString(String)>
	//* 308  731:putfield        #76  <Field String o>
	//* 309  734:aload           6
	//* 310  736:aload_0         
	//* 311  737:aload           8
	//* 312  739:invokeinterface #398 <Method bj com.google.android.gms.internal.ads.pe.a(ov, JSONObject)>
	//* 313  744:astore          6
	//* 314  746:aload           6
	//* 315  748:ifnonnull       763
	//* 316  751:ldc2            #400 <String "Failed to retrieve ad assets.">
	//* 317  754:invokestatic    #373 <Method void wx.c(String)>
	//* 318  757:aconst_null     
	//* 319  758:astore          6
	//* 320  760:goto            812
	//* 321  763:aload           6
	//* 322  765:new             #402 <Class bl>
	//* 323  768:dup             
	//* 324  769:aload_0         
	//* 325  770:getfield        #49  <Field Context b>
	//* 326  773:aload_0         
	//* 327  774:getfield        #51  <Field ac d>
	//* 328  777:aload_0         
	//* 329  778:getfield        #66  <Field pp f>
	//* 330  781:aload_0         
	//* 331  782:getfield        #57  <Field bad e>
	//* 332  785:aload           8
	//* 333  787:aload           6
	//* 334  789:aload_0         
	//* 335  790:getfield        #55  <Field we h>
	//* 336  793:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//* 337  796:getfield        #405 <Field zzbbi zzasi.k>
	//* 338  799:aload           11
	//* 339  801:invokespecial   #408 <Method void bl(Context, bi, pp, bad, JSONObject, bj, zzbbi, String)>
	//* 340  804:invokeinterface #413 <Method void com.google.android.gms.internal.ads.bj.a(bh)>
	//* 341  809:goto            812
	//* 342  812:aload           6
	//* 343  814:instanceof      #415 <Class az>
	//* 344  817:ifeq            849
	//* 345  820:new             #417 <Class pa>
	//* 346  823:dup             
	//* 347  824:aload_0         
	//* 348  825:aload           6
	//* 349  827:checkcast       #415 <Class az>
	//* 350  830:invokespecial   #420 <Method void pa(ov, az)>
	//* 351  833:astore          8
	//* 352  835:aload_0         
	//* 353  836:getfield        #66  <Field pp f>
	//* 354  839:ldc2            #422 <String "/nativeAdCustomClick">
	//* 355  842:aload           8
	//* 356  844:invokeinterface #425 <Method void com.google.android.gms.internal.ads.pp.a(String, com.google.android.gms.ads.internal.gmsg.ag)>
	//* 357  849:aload_0         
	//* 358  850:aload           6
	//* 359  852:iload_2         
	//* 360  853:invokespecial   #428 <Method wd a(bj, boolean)>
	//* 361  856:astore          6
	//* 362  858:aload_0         
	//* 363  859:getfield        #51  <Field ac d>
	//* 364  862:aload           7
	//* 365  864:invokestatic    #430 <Method afn b(abe)>
	//* 366  867:invokevirtual   #433 <Method void ac.b(afn)>
	//* 367  870:aload           6
	//* 368  872:areturn         
	//* 369  873:astore          6
	//* 370  875:ldc2            #435 <String "Error occured while doing native ads initialization.">
	//* 371  878:aload           6
	//* 372  880:invokestatic    #188 <Method void wx.c(String, Throwable)>
	//* 373  883:goto            924
	//* 374  886:astore          6
	//* 375  888:ldc2            #437 <String "Timeout when loading native ad.">
	//* 376  891:aload           6
	//* 377  893:invokestatic    #188 <Method void wx.c(String, Throwable)>
	//* 378  896:goto            924
	//* 379  899:astore          6
	//* 380  901:goto            916
	//* 381  904:astore          6
	//* 382  906:goto            916
	//* 383  909:astore          6
	//* 384  911:goto            916
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//  385  914:astore          6
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			break MISSING_BLOCK_LABEL_916;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			break MISSING_BLOCK_LABEL_916;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			break MISSING_BLOCK_LABEL_916;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			wx.c("Timeout when loading native ad.", ((Throwable) (obj)));
			break MISSING_BLOCK_LABEL_924;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			wx.c("Error occured while doing native ads initialization.", ((Throwable) (obj)));
			break MISSING_BLOCK_LABEL_924;
		}
		  goto _L14
_L13:
		obj = ((Object) (((JSONObject) (obj2)).optJSONObject("omid_settings")));
		if(obj != null)
			break MISSING_BLOCK_LABEL_220;
		obj1 = ((Object) (com.google.android.gms.internal.ads.aas.a(((Object) (null)))));
		break MISSING_BLOCK_LABEL_269;
		obj = ((Object) (((JSONObject) (obj)).optString("omid_html")));
		if(TextUtils.isEmpty(((CharSequence) (obj))))
		{
			obj1 = ((Object) (com.google.android.gms.internal.ads.aas.a(((Object) (null)))));
			break MISSING_BLOCK_LABEL_269;
		}
		obj1 = ((Object) (com.google.android.gms.internal.ads.aas.a(((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (null))))), ((aan) (new ow(this, ((String) (obj))))), com.google.android.gms.internal.ads.abj.a)));
		if(!b() && obj2 != null) goto _L16; else goto _L15
_L16:
		obj = ((Object) (((JSONObject) (obj2)).getString("template_id")));
		flag3 = "instream".equals(((Object) (((JSONObject) (obj2)).optString("type"))));
		if(h.a.y == null) goto _L18; else goto _L17
_L17:
		flag1 = h.a.y.b;
_L41:
		if(h.a.y == null) goto _L20; else goto _L19
_L19:
		flag2 = h.a.y.d;
_L42:
		if(!flag3) goto _L22; else goto _L21
_L21:
		obj = ((Object) (new ou()));
		  goto _L23
_L22:
		if(!"2".equals(obj)) goto _L25; else goto _L24
_L24:
		obj = ((Object) (new pq(flag1, flag2, h.j)));
		  goto _L23
_L25:
		if(!"1".equals(obj)) goto _L27; else goto _L26
_L26:
		obj = ((Object) (new pr(flag1, flag2, h.j)));
		  goto _L23
_L27:
		if(!"3".equals(obj)) goto _L29; else goto _L28
_L28:
		obj = ((Object) (((JSONObject) (obj2)).getString("custom_template_id")));
		obj3 = ((Object) (new abo()));
		com.google.android.gms.internal.ads.xg.a.post(((Runnable) (new oy(this, ((abo) (obj3)), ((String) (obj))))));
		if(((abo) (obj3)).get(a, TimeUnit.SECONDS) == null) goto _L31; else goto _L30
_L30:
		obj = ((Object) (new ps(flag1)));
		  goto _L23
_L31:
		obj = ((Object) (String.valueOf(((Object) (((JSONObject) (obj2)).getString("custom_template_id"))))));
		if(((String) (obj)).length() != 0)
		{
			obj = ((Object) ("No handler for custom template: ".concat(((String) (obj)))));
			break MISSING_BLOCK_LABEL_576;
		}
		obj = ((Object) (new String("No handler for custom template: ")));
		wx.c(((String) (obj)));
		  goto _L32
_L29:
		a(0);
		  goto _L32
_L23:
		if(b() || obj == null || obj2 == null)
			break MISSING_BLOCK_LABEL_994;
		jsonobject = ((JSONObject) (obj2)).getJSONObject("tracking_urls_and_actions");
		jsonarray = jsonobject.optJSONArray("impression_tracking_urls");
		if(jsonarray != null) goto _L34; else goto _L33
_L33:
		obj3 = null;
		  goto _L35
_L34:
		as = new String[jsonarray.length()];
		i1 = 0;
_L37:
		obj3 = ((Object) (as));
		if(i1 >= jsonarray.length()) goto _L35; else goto _L36
_L36:
		as[i1] = jsonarray.getString(i1);
		i1++;
		  goto _L37
_L44:
		obj3 = ((Object) (Arrays.asList(((Object []) (obj3)))));
_L45:
		l = ((List) (obj3));
		m = jsonobject.optJSONObject("active_view");
		n = ((JSONObject) (obj2)).optString("debug_signals");
		o = ((JSONObject) (obj2)).optString("omid_settings");
		obj = ((Object) (((pe) (obj)).a(this, ((JSONObject) (obj2)))));
		if(obj != null)
			break MISSING_BLOCK_LABEL_763;
		wx.c("Failed to retrieve ad assets.");
		obj = null;
		break MISSING_BLOCK_LABEL_812;
		((bj) (obj)).a(((bh) (new bl(b, ((bi) (d)), f, e, ((JSONObject) (obj2)), ((bj) (obj)), h.a.k, s))));
_L46:
		if(obj instanceof az)
		{
			obj2 = ((Object) (new pa(this, (az)obj)));
			f.a("/nativeAdCustomClick", ((com.google.android.gms.ads.internal.gmsg.ag) (obj2)));
		}
		obj = ((Object) (a(((bj) (obj)), flag)));
		d.b(b(((abe) (obj1))));
		return ((wd) (obj));
_L14:
		wx.c("Malformed native JSON response.", ((Throwable) (obj)));
	//  386  916:ldc2            #439 <String "Malformed native JSON response.">
	//  387  919:aload           6
	//  388  921:invokestatic    #188 <Method void wx.c(String, Throwable)>
		if(!j)
	//* 389  924:aload_0         
	//* 390  925:getfield        #68  <Field boolean j>
	//* 391  928:ifne            936
			a(0);
	//  392  931:aload_0         
	//  393  932:iconst_0        
	//  394  933:invokespecial   #247 <Method void a(int)>
		return a(((bj) (null)), false);
	//  395  936:aload_0         
	//  396  937:aconst_null     
	//  397  938:iconst_0        
	//  398  939:invokespecial   #428 <Method wd a(bj, boolean)>
	//  399  942:areturn         
_L6:
		obj = null;
	//  400  943:aconst_null     
	//  401  944:astore          6
		  goto _L38
	//* 402  946:goto            87
_L2:
		obj2 = null;
	//  403  949:aconst_null     
	//  404  950:astore          8
		  goto _L39
	//* 405  952:goto            166
_L11:
		flag = false;
	//  406  955:iconst_0        
	//  407  956:istore_2        
		  goto _L40
	//* 408  957:goto            183
_L18:
		flag1 = false;
	//  409  960:iconst_0        
	//  410  961:istore_3        
		  goto _L41
	//* 411  962:goto            340
_L20:
		flag2 = false;
	//  412  965:iconst_0        
	//  413  966:istore          4
		  goto _L42
	//* 414  968:goto            371
_L32:
		obj = null;
	//  415  971:aconst_null     
	//  416  972:astore          6
		  goto _L23
	//* 417  974:goto            592
_L15:
		obj = null;
	//  418  977:aconst_null     
	//  419  978:astore          6
		  goto _L23
	//* 420  980:goto            592
_L35:
		if(obj3 != null) goto _L44; else goto _L43
	//  421  983:aload           9
	//  422  985:ifnonnull       685
_L43:
		obj3 = null;
	//  423  988:aconst_null     
	//  424  989:astore          9
		  goto _L45
	//* 425  991:goto            692
		obj = null;
	//  426  994:aconst_null     
	//  427  995:astore          6
		  goto _L46
	//* 428  997:goto            812
	}

	private final wd a(bj bj1, boolean flag)
	{
		Object obj = g;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object g>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i1 = k;
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field int k>
	//    7   13:istore_3        
		if(bj1 != null)
			break MISSING_BLOCK_LABEL_32;
	//    8   14:aload_1         
	//    9   15:ifnonnull       276
		if(k == -2)
	//*  10   18:aload_0         
	//*  11   19:getfield        #70  <Field int k>
	//*  12   22:bipush          -2
	//*  13   24:icmpne          276
			i1 = 0;
	//   14   27:iconst_0        
	//   15   28:istore_3        
	//*  16   29:goto            32
		obj;
	//   17   32:aload           4
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		if(i1 != -2)
	//*  19   35:iload_3         
	//*  20   36:bipush          -2
	//*  21   38:icmpeq          46
			bj1 = null;
	//   22   41:aconst_null     
	//   23   42:astore_1        
	//*  24   43:goto            46
		return new wd(h.a.c, ((afn) (null)), h.b.c, i1, h.b.e, l, h.b.k, h.b.j, h.a.i, false, ((jv) (null)), ((kp) (null)), ((String) (null)), ((jw) (null)), ((jy) (null)), 0L, h.d, h.b.f, h.f, h.g, h.b.n, m, bj1, ((zzawd) (null)), ((List) (null)), ((List) (null)), h.b.D, h.b.E, ((String) (null)), h.b.H, n, h.i, h.b.O, h.j, flag, h.b.R, h.b.S, o, h.b.V);
	//   25   46:new             #441 <Class wd>
	//   26   49:dup             
	//   27   50:aload_0         
	//   28   51:getfield        #55  <Field we h>
	//   29   54:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//   30   57:getfield        #444 <Field zzwb zzasi.c>
	//   31   60:aconst_null     
	//   32   61:aload_0         
	//   33   62:getfield        #55  <Field we h>
	//   34   65:getfield        #222 <Field zzasm we.b>
	//   35   68:getfield        #446 <Field List zzasm.c>
	//   36   71:iload_3         
	//   37   72:aload_0         
	//   38   73:getfield        #55  <Field we h>
	//   39   76:getfield        #222 <Field zzasm we.b>
	//   40   79:getfield        #448 <Field List zzasm.e>
	//   41   82:aload_0         
	//   42   83:getfield        #72  <Field List l>
	//   43   86:aload_0         
	//   44   87:getfield        #55  <Field we h>
	//   45   90:getfield        #222 <Field zzasm we.b>
	//   46   93:getfield        #449 <Field int zzasm.k>
	//   47   96:aload_0         
	//   48   97:getfield        #55  <Field we h>
	//   49  100:getfield        #222 <Field zzasm we.b>
	//   50  103:getfield        #451 <Field long zzasm.j>
	//   51  106:aload_0         
	//   52  107:getfield        #55  <Field we h>
	//   53  110:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//   54  113:getfield        #453 <Field String zzasi.i>
	//   55  116:iconst_0        
	//   56  117:aconst_null     
	//   57  118:aconst_null     
	//   58  119:aconst_null     
	//   59  120:aconst_null     
	//   60  121:aconst_null     
	//   61  122:lconst_0        
	//   62  123:aload_0         
	//   63  124:getfield        #55  <Field we h>
	//   64  127:getfield        #456 <Field zzwf we.d>
	//   65  130:aload_0         
	//   66  131:getfield        #55  <Field we h>
	//   67  134:getfield        #222 <Field zzasm we.b>
	//   68  137:getfield        #458 <Field long zzasm.f>
	//   69  140:aload_0         
	//   70  141:getfield        #55  <Field we h>
	//   71  144:getfield        #459 <Field long we.f>
	//   72  147:aload_0         
	//   73  148:getfield        #55  <Field we h>
	//   74  151:getfield        #461 <Field long we.g>
	//   75  154:aload_0         
	//   76  155:getfield        #55  <Field we h>
	//   77  158:getfield        #222 <Field zzasm we.b>
	//   78  161:getfield        #462 <Field String zzasm.n>
	//   79  164:aload_0         
	//   80  165:getfield        #391 <Field JSONObject m>
	//   81  168:aload_1         
	//   82  169:aconst_null     
	//   83  170:aconst_null     
	//   84  171:aconst_null     
	//   85  172:aload_0         
	//   86  173:getfield        #55  <Field we h>
	//   87  176:getfield        #222 <Field zzasm we.b>
	//   88  179:getfield        #465 <Field boolean zzasm.D>
	//   89  182:aload_0         
	//   90  183:getfield        #55  <Field we h>
	//   91  186:getfield        #222 <Field zzasm we.b>
	//   92  189:getfield        #469 <Field zzaso zzasm.E>
	//   93  192:aconst_null     
	//   94  193:aload_0         
	//   95  194:getfield        #55  <Field we h>
	//   96  197:getfield        #222 <Field zzasm we.b>
	//   97  200:getfield        #472 <Field List zzasm.H>
	//   98  203:aload_0         
	//   99  204:getfield        #74  <Field String n>
	//  100  207:aload_0         
	//  101  208:getfield        #55  <Field we h>
	//  102  211:getfield        #475 <Field bse we.i>
	//  103  214:aload_0         
	//  104  215:getfield        #55  <Field we h>
	//  105  218:getfield        #222 <Field zzasm we.b>
	//  106  221:getfield        #478 <Field boolean zzasm.O>
	//  107  224:aload_0         
	//  108  225:getfield        #55  <Field we h>
	//  109  228:getfield        #323 <Field boolean we.j>
	//  110  231:iload_2         
	//  111  232:aload_0         
	//  112  233:getfield        #55  <Field we h>
	//  113  236:getfield        #222 <Field zzasm we.b>
	//  114  239:getfield        #481 <Field List zzasm.R>
	//  115  242:aload_0         
	//  116  243:getfield        #55  <Field we h>
	//  117  246:getfield        #222 <Field zzasm we.b>
	//  118  249:getfield        #484 <Field boolean zzasm.S>
	//  119  252:aload_0         
	//  120  253:getfield        #76  <Field String o>
	//  121  256:aload_0         
	//  122  257:getfield        #55  <Field we h>
	//  123  260:getfield        #222 <Field zzasm we.b>
	//  124  263:getfield        #487 <Field boolean zzasm.V>
	//  125  266:invokespecial   #490 <Method void wd(zzwb, afn, List, int, List, List, int, long, String, boolean, jv, kp, String, jw, jy, long, zzwf, long, long, long, String, JSONObject, bj, zzawd, List, List, boolean, zzaso, String, List, String, bse, boolean, boolean, boolean, List, boolean, String, boolean)>
	//  126  269:areturn         
		bj1;
	//  127  270:astore_1        
		obj;
	//  128  271:aload           4
		JVM INSTR monitorexit ;
	//  129  273:monitorexit     
		throw bj1;
	//  130  274:aload_1         
	//  131  275:athrow          
	//* 132  276:goto            32
	}

	static List a(List list)
	{
		return b(list);
	//    0    0:aload_0         
	//    1    1:invokestatic    #493 <Method List b(List)>
	//    2    4:areturn         
	}

	private final void a(int i1)
	{
		synchronized(g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Object g>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			j = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #68  <Field boolean j>
			k = i1;
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:putfield        #70  <Field int k>
		}
	//   11   17:aload_2         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	private final void a(db db1, String s)
	{
		dm dm1;
		try
		{
			dm1 = d.c(db1.b());
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ac d>
	//    2    4:aload_1         
	//    3    5:invokeinterface #500 <Method String db.b()>
	//    4   10:invokevirtual   #503 <Method dm ac.c(String)>
	//    5   13:astore_3        
		}
	//*   6   14:aload_3         
	//*   7   15:ifnull          26
	//*   8   18:aload_3         
	//*   9   19:aload_1         
	//*  10   20:aload_2         
	//*  11   21:invokeinterface #507 <Method void com.google.android.gms.internal.ads.dm.a(db, String)>
	//*  12   26:return          
		// Misplaced declaration of an exception variable
		catch(db db1)
	//*  13   27:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 40);
	//   14   28:new             #509 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:invokestatic    #364 <Method String String.valueOf(Object)>
	//   18   36:invokevirtual   #365 <Method int String.length()>
	//   19   39:bipush          40
	//   20   41:iadd            
	//   21   42:invokespecial   #511 <Method void StringBuilder(int)>
	//   22   45:astore_3        
			stringbuilder.append("Failed to call onCustomClick for asset ");
	//   23   46:aload_3         
	//   24   47:ldc2            #513 <String "Failed to call onCustomClick for asset ">
	//   25   50:invokevirtual   #517 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			stringbuilder.append(s);
	//   27   54:aload_3         
	//   28   55:aload_2         
	//   29   56:invokevirtual   #517 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			stringbuilder.append(".");
	//   31   60:aload_3         
	//   32   61:ldc2            #519 <String ".">
	//   33   64:invokevirtual   #517 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
			wx.c(stringbuilder.toString(), ((Throwable) (db1)));
	//   35   68:aload_3         
	//   36   69:invokevirtual   #522 <Method String StringBuilder.toString()>
	//   37   72:aload_1         
	//   38   73:invokestatic    #188 <Method void wx.c(String, Throwable)>
			return;
	//   39   76:return          
		}
		if(dm1 == null)
			break MISSING_BLOCK_LABEL_26;
		dm1.a(db1, s);
	}

	static void a(ov ov1, db db1, String s)
	{
		ov1.a(db1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #524 <Method void a(db, String)>
	//    4    6:return          
	}

	private static afn b(abe abe1)
	{
		e e1 = p.bA;
	//    0    0:getstatic       #527 <Field e p.bA>
	//    1    3:astore_1        
		abe1 = ((abe) ((afn)abe1.get(((Integer)bwk.e().a(e1)).intValue(), TimeUnit.MILLISECONDS)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #156 <Method m bwk.e()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #161 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//    6   12:checkcast       #163 <Class Integer>
	//    7   15:invokevirtual   #167 <Method int Integer.intValue()>
	//    8   18:i2l             
	//    9   19:getstatic       #530 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   10   22:invokeinterface #179 <Method Object abe.get(long, TimeUnit)>
	//   11   27:checkcast       #181 <Class afn>
	//   12   30:astore_0        
		return ((afn) (abe1));
	//   13   31:aload_0         
	//   14   32:areturn         
		abe1;
	//   15   33:astore_0        
		break MISSING_BLOCK_LABEL_42;
	//   16   34:goto            42
		abe1;
	//   17   37:astore_0        
		break MISSING_BLOCK_LABEL_42;
	//   18   38:goto            42
		abe1;
	//   19   41:astore_0        
		aag.c("", ((Throwable) (abe1)));
	//   20   42:ldc2            #532 <String "">
	//   21   45:aload_0         
	//   22   46:invokestatic    #535 <Method void aag.c(String, Throwable)>
		break MISSING_BLOCK_LABEL_66;
	//   23   49:goto            66
		abe1;
	//   24   52:astore_0        
		aag.c("", ((Throwable) (abe1)));
	//   25   53:ldc2            #532 <String "">
	//   26   56:aload_0         
	//   27   57:invokestatic    #535 <Method void aag.c(String, Throwable)>
		Thread.currentThread().interrupt();
	//   28   60:invokestatic    #196 <Method Thread Thread.currentThread()>
	//   29   63:invokevirtual   #199 <Method void Thread.interrupt()>
		return null;
	//   30   66:aconst_null     
	//   31   67:areturn         
	}

	private static Integer b(JSONObject jsonobject, String s)
	{
		int i1;
		try
		{
			jsonobject = jsonobject.getJSONObject(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #262 <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    5:astore_0        
			i1 = Color.rgb(jsonobject.getInt("r"), jsonobject.getInt("g"), jsonobject.getInt("b"));
	//    4    6:aload_0         
	//    5    7:ldc2            #538 <String "r">
	//    6   10:invokevirtual   #542 <Method int JSONObject.getInt(String)>
	//    7   13:aload_0         
	//    8   14:ldc2            #543 <String "g">
	//    9   17:invokevirtual   #542 <Method int JSONObject.getInt(String)>
	//   10   20:aload_0         
	//   11   21:ldc2            #544 <String "b">
	//   12   24:invokevirtual   #542 <Method int JSONObject.getInt(String)>
	//   13   27:invokestatic    #550 <Method int Color.rgb(int, int, int)>
	//   14   30:istore_2        
		}
	//*  15   31:iload_2         
	//*  16   32:invokestatic    #553 <Method Integer Integer.valueOf(int)>
	//*  17   35:areturn         
	//*  18   36:aconst_null     
	//*  19   37:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			return null;
		}
		return Integer.valueOf(i1);
	//*  20   38:astore_0        
	//*  21   39:goto            36
	}

	private static List b(List list)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #555 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #556 <Method void ArrayList()>
	//    3    7:astore_1        
		list = ((List) (list.iterator()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #562 <Method Iterator List.iterator()>
	//    6   14:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//    7   15:aload_0         
	//    8   16:invokeinterface #567 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            54
			Object obj = ((abe)((Iterator) (list)).next()).get();
	//   10   24:aload_0         
	//   11   25:invokeinterface #571 <Method Object Iterator.next()>
	//   12   30:checkcast       #175 <Class abe>
	//   13   33:invokeinterface #573 <Method Object abe.get()>
	//   14   38:astore_2        
			if(obj != null)
	//*  15   39:aload_2         
	//*  16   40:ifnull          15
				((List) (arraylist)).add(obj);
	//   17   43:aload_1         
	//   18   44:aload_2         
	//   19   45:invokeinterface #576 <Method boolean List.add(Object)>
	//   20   50:pop             
		} while(true);
	//   21   51:goto            15
		return ((List) (arraylist));
	//   22   54:aload_1         
	//   23   55:areturn         
	}

	private final boolean b()
	{
		boolean flag;
		synchronized(g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Object g>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = j;
	//    5    7:aload_0         
	//    6    8:getfield        #68  <Field boolean j>
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

	final abe a(String s, Object obj)
	{
		aw.f();
	//    0    0:invokestatic    #582 <Method aft aw.f()>
	//    1    3:pop             
		obj = ((Object) (com.google.android.gms.internal.ads.aft.a(b, com.google.android.gms.internal.ads.ahb.a(), "native-omid", false, false, e, h.a.k, i, ((com.google.android.gms.ads.internal.ap) (null)), ((a) (d)).i(), h.i)));
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field Context b>
	//    4    8:invokestatic    #587 <Method ahb com.google.android.gms.internal.ads.ahb.a()>
	//    5   11:ldc2            #589 <String "native-omid">
	//    6   14:iconst_0        
	//    7   15:iconst_0        
	//    8   16:aload_0         
	//    9   17:getfield        #57  <Field bad e>
	//   10   20:aload_0         
	//   11   21:getfield        #55  <Field we h>
	//   12   24:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//   13   27:getfield        #405 <Field zzbbi zzasi.k>
	//   14   30:aload_0         
	//   15   31:getfield        #59  <Field ad i>
	//   16   34:aconst_null     
	//   17   35:aload_0         
	//   18   36:getfield        #51  <Field ac d>
	//   19   39:invokevirtual   #594 <Method com.google.android.gms.ads.internal.bs a.i()>
	//   20   42:aload_0         
	//   21   43:getfield        #55  <Field we h>
	//   22   46:getfield        #475 <Field bse we.i>
	//   23   49:invokestatic    #599 <Method afn com.google.android.gms.internal.ads.aft.a(Context, ahb, String, boolean, boolean, bad, zzbbi, ad, com.google.android.gms.ads.internal.ap, com.google.android.gms.ads.internal.bs, bse)>
	//   24   52:astore_2        
		abn abn1 = com.google.android.gms.internal.ads.abn.a(obj);
	//   25   53:aload_2         
	//   26   54:invokestatic    #604 <Method abn com.google.android.gms.internal.ads.abn.a(Object)>
	//   27   57:astore_3        
		((afn) (obj)).w().a(((agw) (new ox(abn1))));
	//   28   58:aload_2         
	//   29   59:invokeinterface #608 <Method agv afn.w()>
	//   30   64:new             #610 <Class ox>
	//   31   67:dup             
	//   32   68:aload_3         
	//   33   69:invokespecial   #613 <Method void ox(abn)>
	//   34   72:invokeinterface #618 <Method void com.google.android.gms.internal.ads.agv.a(agw)>
		((afn) (obj)).loadData(s, "text/html", "UTF-8");
	//   35   77:aload_2         
	//   36   78:aload_1         
	//   37   79:ldc2            #620 <String "text/html">
	//   38   82:ldc2            #622 <String "UTF-8">
	//   39   85:invokeinterface #626 <Method void afn.loadData(String, String, String)>
		return ((abe) (abn1));
	//   40   90:aload_3         
	//   41   91:areturn         
	}

	public final abe a(String s, String s1, boolean flag)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))) && !TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            76
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifeq            17
	//*   6   14:goto            76
		{
			pf pf1 = a(b, e, h, i, d);
	//    7   17:aload_0         
	//    8   18:getfield        #49  <Field Context b>
	//    9   21:aload_0         
	//   10   22:getfield        #57  <Field bad e>
	//   11   25:aload_0         
	//   12   26:getfield        #55  <Field we h>
	//   13   29:aload_0         
	//   14   30:getfield        #59  <Field ad i>
	//   15   33:aload_0         
	//   16   34:getfield        #51  <Field ac d>
	//   17   37:invokestatic    #629 <Method pf a(Context, bad, we, ad, ac)>
	//   18   40:astore          4
			abo abo1 = new abo();
	//   19   42:new             #337 <Class abo>
	//   20   45:dup             
	//   21   46:invokespecial   #338 <Method void abo()>
	//   22   49:astore          5
			com.google.android.gms.internal.ads.abj.a.execute(((Runnable) (new ph(pf1, true, abo1, s, s1))));
	//   23   51:getstatic       #285 <Field Executor com.google.android.gms.internal.ads.abj.a>
	//   24   54:new             #631 <Class ph>
	//   25   57:dup             
	//   26   58:aload           4
	//   27   60:iconst_1        
	//   28   61:aload           5
	//   29   63:aload_1         
	//   30   64:aload_2         
	//   31   65:invokespecial   #634 <Method void ph(pf, boolean, abo, String, String)>
	//   32   68:invokeinterface #640 <Method void Executor.execute(Runnable)>
			return ((abe) (abo1));
	//   33   73:aload           5
	//   34   75:areturn         
		} else
		{
			return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (null)))));
	//   35   76:aconst_null     
	//   36   77:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//   37   80:areturn         
		}
	}

	public final abe a(JSONObject jsonobject)
	{
		Object obj = ((Object) (jsonobject.optJSONObject("attribution")));
	//    0    0:aload_1         
	//    1    1:ldc2            #642 <String "attribution">
	//    2    4:invokevirtual   #273 <Method JSONObject JSONObject.optJSONObject(String)>
	//    3    7:astore          11
		if(obj == null)
	//*   4    9:aload           11
	//*   5   11:ifnonnull       19
			return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (null)))));
	//    6   14:aconst_null     
	//    7   15:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//    8   18:areturn         
		String s = ((JSONObject) (obj)).optString("text");
	//    9   19:aload           11
	//   10   21:ldc2            #644 <String "text">
	//   11   24:invokevirtual   #89  <Method String JSONObject.optString(String)>
	//   12   27:astore          8
		int j1 = ((JSONObject) (obj)).optInt("text_size", -1);
	//   13   29:aload           11
	//   14   31:ldc2            #646 <String "text_size">
	//   15   34:iconst_m1       
	//   16   35:invokevirtual   #650 <Method int JSONObject.optInt(String, int)>
	//   17   38:istore_3        
		Integer integer = b(((JSONObject) (obj)), "text_color");
	//   18   39:aload           11
	//   19   41:ldc2            #652 <String "text_color">
	//   20   44:invokestatic    #654 <Method Integer b(JSONObject, String)>
	//   21   47:astore          9
		Integer integer1 = b(((JSONObject) (obj)), "bg_color");
	//   22   49:aload           11
	//   23   51:ldc2            #656 <String "bg_color">
	//   24   54:invokestatic    #654 <Method Integer b(JSONObject, String)>
	//   25   57:astore          10
		int k1 = ((JSONObject) (obj)).optInt("animation_ms", 1000);
	//   26   59:aload           11
	//   27   61:ldc2            #658 <String "animation_ms">
	//   28   64:sipush          1000
	//   29   67:invokevirtual   #650 <Method int JSONObject.optInt(String, int)>
	//   30   70:istore          4
		int l1 = ((JSONObject) (obj)).optInt("presentation_ms", 4000);
	//   31   72:aload           11
	//   32   74:ldc2            #660 <String "presentation_ms">
	//   33   77:sipush          4000
	//   34   80:invokevirtual   #650 <Method int JSONObject.optInt(String, int)>
	//   35   83:istore          5
		int i1;
		if(h.a.y != null && h.a.y.a >= 2)
	//*  36   85:aload_0         
	//*  37   86:getfield        #55  <Field we h>
	//*  38   89:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//*  39   92:getfield        #309 <Field zzacp zzasi.y>
	//*  40   95:ifnull          132
	//*  41   98:aload_0         
	//*  42   99:getfield        #55  <Field we h>
	//*  43  102:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//*  44  105:getfield        #309 <Field zzacp zzasi.y>
	//*  45  108:getfield        #662 <Field int com.google.android.gms.internal.ads.zzacp.a>
	//*  46  111:iconst_2        
	//*  47  112:icmplt          132
			i1 = h.a.y.e;
	//   48  115:aload_0         
	//   49  116:getfield        #55  <Field we h>
	//   50  119:getfield        #303 <Field zzasi com.google.android.gms.internal.ads.we.a>
	//   51  122:getfield        #309 <Field zzacp zzasi.y>
	//   52  125:getfield        #664 <Field int zzacp.e>
	//   53  128:istore_2        
		else
	//*  54  129:goto            134
			i1 = 1;
	//   55  132:iconst_1        
	//   56  133:istore_2        
		boolean flag = ((JSONObject) (obj)).optBoolean("allow_pub_rendering");
	//   57  134:aload           11
	//   58  136:ldc2            #666 <String "allow_pub_rendering">
	//   59  139:invokevirtual   #269 <Method boolean JSONObject.optBoolean(String)>
	//   60  142:istore          7
		jsonobject = ((JSONObject) (new ArrayList()));
	//   61  144:new             #555 <Class ArrayList>
	//   62  147:dup             
	//   63  148:invokespecial   #556 <Method void ArrayList()>
	//   64  151:astore_1        
		if(((JSONObject) (obj)).optJSONArray("images") != null)
	//*  65  152:aload           11
	//*  66  154:ldc2            #668 <String "images">
	//*  67  157:invokevirtual   #238 <Method JSONArray JSONObject.optJSONArray(String)>
	//*  68  160:ifnull          179
			jsonobject = ((JSONObject) (a(((JSONObject) (obj)), "images", false, false, true)));
	//   69  163:aload_0         
	//   70  164:aload           11
	//   71  166:ldc2            #668 <String "images">
	//   72  169:iconst_0        
	//   73  170:iconst_0        
	//   74  171:iconst_1        
	//   75  172:invokevirtual   #671 <Method List a(JSONObject, String, boolean, boolean, boolean)>
	//   76  175:astore_1        
		else
	//*  77  176:goto            197
			((List) (jsonobject)).add(((Object) (a(((JSONObject) (obj)), "image", false, false))));
	//   78  179:aload_1         
	//   79  180:aload_0         
	//   80  181:aload           11
	//   81  183:ldc2            #673 <String "image">
	//   82  186:iconst_0        
	//   83  187:iconst_0        
	//   84  188:invokevirtual   #676 <Method abe a(JSONObject, String, boolean, boolean)>
	//   85  191:invokeinterface #576 <Method boolean List.add(Object)>
	//   86  196:pop             
		obj = ((Object) (new abo()));
	//   87  197:new             #337 <Class abo>
	//   88  200:dup             
	//   89  201:invokespecial   #338 <Method void abo()>
	//   90  204:astore          11
		int i2 = ((List) (jsonobject)).size();
	//   91  206:aload_1         
	//   92  207:invokeinterface #679 <Method int List.size()>
	//   93  212:istore          6
		AtomicInteger atomicinteger = new AtomicInteger(0);
	//   94  214:new             #681 <Class AtomicInteger>
	//   95  217:dup             
	//   96  218:iconst_0        
	//   97  219:invokespecial   #682 <Method void AtomicInteger(int)>
	//   98  222:astore          12
		for(Iterator iterator = ((List) (jsonobject)).iterator(); iterator.hasNext(); ((abe)iterator.next()).a(((Runnable) (new pd(atomicinteger, i2, ((abo) (obj)), ((List) (jsonobject))))), ((Executor) (com.google.android.gms.internal.ads.xe.a))));
	//   99  224:aload_1         
	//  100  225:invokeinterface #562 <Method Iterator List.iterator()>
	//  101  230:astore          13
	//  102  232:aload           13
	//  103  234:invokeinterface #567 <Method boolean Iterator.hasNext()>
	//  104  239:ifeq            277
	//  105  242:aload           13
	//  106  244:invokeinterface #571 <Method Object Iterator.next()>
	//  107  249:checkcast       #175 <Class abe>
	//  108  252:new             #684 <Class pd>
	//  109  255:dup             
	//  110  256:aload           12
	//  111  258:iload           6
	//  112  260:aload           11
	//  113  262:aload_1         
	//  114  263:invokespecial   #687 <Method void pd(AtomicInteger, int, abo, List)>
	//  115  266:getstatic       #692 <Field abi com.google.android.gms.internal.ads.xe.a>
	//  116  269:invokeinterface #695 <Method void com.google.android.gms.internal.ads.abe.a(Runnable, Executor)>
	//* 117  274:goto            232
		return com.google.android.gms.internal.ads.aas.a(((abe) (obj)), ((aao) (new pb(this, s, integer1, integer, j1, l1, k1, i1, flag))), ((Executor) (com.google.android.gms.internal.ads.xe.a)));
	//  118  277:aload           11
	//  119  279:new             #697 <Class pb>
	//  120  282:dup             
	//  121  283:aload_0         
	//  122  284:aload           8
	//  123  286:aload           10
	//  124  288:aload           9
	//  125  290:iload_3         
	//  126  291:iload           5
	//  127  293:iload           4
	//  128  295:iload_2         
	//  129  296:iload           7
	//  130  298:invokespecial   #700 <Method void pb(ov, String, Integer, Integer, int, int, int, int, boolean)>
	//  131  301:getstatic       #692 <Field abi com.google.android.gms.internal.ads.xe.a>
	//  132  304:invokestatic    #703 <Method abe com.google.android.gms.internal.ads.aas.a(abe, aao, Executor)>
	//  133  307:areturn         
	}

	public final abe a(JSONObject jsonobject, String s)
	{
		s = ((String) (jsonobject.optJSONObject(s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #273 <Method JSONObject JSONObject.optJSONObject(String)>
	//    3    5:astore_2        
		if(s == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       15
			return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (null)))));
	//    6   10:aconst_null     
	//    7   11:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//    8   14:areturn         
		if(TextUtils.isEmpty(((CharSequence) (((JSONObject) (s)).optString("vast_xml")))))
	//*   9   15:aload_2         
	//*  10   16:ldc2            #706 <String "vast_xml">
	//*  11   19:invokevirtual   #89  <Method String JSONObject.optString(String)>
	//*  12   22:invokestatic    #107 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   25:ifeq            39
		{
			wx.e("Required field 'vast_xml' is missing");
	//   14   28:ldc2            #708 <String "Required field 'vast_xml' is missing">
	//   15   31:invokestatic    #710 <Method void wx.e(String)>
			return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (null)))));
	//   16   34:aconst_null     
	//   17   35:invokestatic    #115 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//   18   38:areturn         
		} else
		{
			pf pf1 = a(b, e, h, i, d);
	//   19   39:aload_0         
	//   20   40:getfield        #49  <Field Context b>
	//   21   43:aload_0         
	//   22   44:getfield        #57  <Field bad e>
	//   23   47:aload_0         
	//   24   48:getfield        #55  <Field we h>
	//   25   51:aload_0         
	//   26   52:getfield        #59  <Field ad i>
	//   27   55:aload_0         
	//   28   56:getfield        #51  <Field ac d>
	//   29   59:invokestatic    #629 <Method pf a(Context, bad, we, ad, ac)>
	//   30   62:astore          4
			boolean flag = "instream".equals(((Object) (jsonobject.optString("type"))));
	//   31   64:ldc2            #292 <String "instream">
	//   32   67:aload_1         
	//   33   68:ldc2            #294 <String "type">
	//   34   71:invokevirtual   #89  <Method String JSONObject.optString(String)>
	//   35   74:invokevirtual   #300 <Method boolean String.equals(Object)>
	//   36   77:istore_3        
			jsonobject = ((JSONObject) (new abo()));
	//   37   78:new             #337 <Class abo>
	//   38   81:dup             
	//   39   82:invokespecial   #338 <Method void abo()>
	//   40   85:astore_1        
			com.google.android.gms.internal.ads.abj.a.execute(((Runnable) (new pg(pf1, flag, ((JSONObject) (s)), ((abo) (jsonobject))))));
	//   41   86:getstatic       #285 <Field Executor com.google.android.gms.internal.ads.abj.a>
	//   42   89:new             #712 <Class pg>
	//   43   92:dup             
	//   44   93:aload           4
	//   45   95:iload_3         
	//   46   96:aload_2         
	//   47   97:aload_1         
	//   48   98:invokespecial   #715 <Method void pg(pf, boolean, JSONObject, abo)>
	//   49  101:invokeinterface #640 <Method void Executor.execute(Runnable)>
			return ((abe) (jsonobject));
	//   50  106:aload_1         
	//   51  107:areturn         
		}
	}

	public final abe a(JSONObject jsonobject, String s, boolean flag, boolean flag1)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            13
			jsonobject = jsonobject.getJSONObject(s);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #262 <Method JSONObject JSONObject.getJSONObject(String)>
	//    5    9:astore_1        
		else
	//*   6   10:goto            19
			jsonobject = jsonobject.optJSONObject(s);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #273 <Method JSONObject JSONObject.optJSONObject(String)>
	//   10   18:astore_1        
		s = ((String) (jsonobject));
	//   11   19:aload_1         
	//   12   20:astore_2        
		if(jsonobject == null)
	//*  13   21:aload_1         
	//*  14   22:ifnonnull       33
			s = ((String) (new JSONObject()));
	//   15   25:new             #82  <Class JSONObject>
	//   16   28:dup             
	//   17   29:invokespecial   #716 <Method void JSONObject()>
	//   18   32:astore_2        
		return a(((JSONObject) (s)), flag, flag1);
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:iload_3         
	//   22   36:iload           4
	//   23   38:invokespecial   #718 <Method abe a(JSONObject, boolean, boolean)>
	//   24   41:areturn         
	}

	public final List a(JSONObject jsonobject, String s, boolean flag, boolean flag1, boolean flag2)
	{
		JSONArray jsonarray = jsonobject.optJSONArray(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #238 <Method JSONArray JSONObject.optJSONArray(String)>
	//    3    5:astore          8
		ArrayList arraylist = new ArrayList();
	//    4    7:new             #555 <Class ArrayList>
	//    5   10:dup             
	//    6   11:invokespecial   #556 <Method void ArrayList()>
	//    7   14:astore          9
		if(jsonarray != null && jsonarray.length() != 0)
	//*   8   16:aload           8
	//*   9   18:ifnull          110
	//*  10   21:aload           8
	//*  11   23:invokevirtual   #378 <Method int JSONArray.length()>
	//*  12   26:ifne            32
	//*  13   29:goto            110
		{
			int i1;
			if(flag2)
	//*  14   32:iload           5
	//*  15   34:ifeq            47
				i1 = jsonarray.length();
	//   16   37:aload           8
	//   17   39:invokevirtual   #378 <Method int JSONArray.length()>
	//   18   42:istore          6
			else
	//*  19   44:goto            50
				i1 = 1;
	//   20   47:iconst_1        
	//   21   48:istore          6
			for(int j1 = 0; j1 < i1; j1++)
	//*  22   50:iconst_0        
	//*  23   51:istore          7
	//*  24   53:iload           7
	//*  25   55:iload           6
	//*  26   57:icmpge          107
			{
				s = ((String) (jsonarray.getJSONObject(j1)));
	//   27   60:aload           8
	//   28   62:iload           7
	//   29   64:invokevirtual   #264 <Method JSONObject JSONArray.getJSONObject(int)>
	//   30   67:astore_2        
				jsonobject = ((JSONObject) (s));
	//   31   68:aload_2         
	//   32   69:astore_1        
				if(s == null)
	//*  33   70:aload_2         
	//*  34   71:ifnonnull       82
					jsonobject = new JSONObject();
	//   35   74:new             #82  <Class JSONObject>
	//   36   77:dup             
	//   37   78:invokespecial   #716 <Method void JSONObject()>
	//   38   81:astore_1        
				((List) (arraylist)).add(((Object) (a(jsonobject, false, flag1))));
	//   39   82:aload           9
	//   40   84:aload_0         
	//   41   85:aload_1         
	//   42   86:iconst_0        
	//   43   87:iload           4
	//   44   89:invokespecial   #718 <Method abe a(JSONObject, boolean, boolean)>
	//   45   92:invokeinterface #576 <Method boolean List.add(Object)>
	//   46   97:pop             
			}

	//   47   98:iload           7
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:istore          7
	//*  51  104:goto            53
			return ((List) (arraylist));
	//   52  107:aload           9
	//   53  109:areturn         
		} else
		{
			a(0, false);
	//   54  110:aload_0         
	//   55  111:iconst_0        
	//   56  112:iconst_0        
	//   57  113:invokevirtual   #110 <Method void a(int, boolean)>
			return ((List) (arraylist));
	//   58  116:aload           9
	//   59  118:areturn         
		}
	}

	public final Future a(JSONObject jsonobject, String s, boolean flag)
	{
		s = ((String) (jsonobject.getJSONObject(s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #262 <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    5:astore_2        
		boolean flag1 = ((JSONObject) (s)).optBoolean("require", true);
	//    4    6:aload_2         
	//    5    7:ldc2            #721 <String "require">
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #101 <Method boolean JSONObject.optBoolean(String, boolean)>
	//    8   14:istore          4
		jsonobject = ((JSONObject) (s));
	//    9   16:aload_2         
	//   10   17:astore_1        
		if(s == null)
	//*  11   18:aload_2         
	//*  12   19:ifnonnull       30
			jsonobject = new JSONObject();
	//   13   22:new             #82  <Class JSONObject>
	//   14   25:dup             
	//   15   26:invokespecial   #716 <Method void JSONObject()>
	//   16   29:astore_1        
		return ((Future) (a(jsonobject, flag1, flag)));
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:iload           4
	//   20   34:iload_3         
	//   21   35:invokespecial   #718 <Method abe a(JSONObject, boolean, boolean)>
	//   22   38:areturn         
	}

	public final void a(int i1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            9
			a(i1);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #247 <Method void a(int)>
	//    5    9:return          
	}

	public final Object call()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #724 <Method wd a()>
	//    2    4:areturn         
	}

	private static long a = 10L;
	private final Context b;
	private final ys c;
	private final ac d;
	private final bad e;
	private final pp f;
	private final Object g = new Object();
	private final we h;
	private final ad i;
	private boolean j;
	private int k;
	private List l;
	private JSONObject m;
	private String n;
	private String o;

	static 
	{
	//    0    0:return          
	}
}
