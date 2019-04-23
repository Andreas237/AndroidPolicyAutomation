// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.api.ag;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			add, zzbbi, xg, zv, 
//			aet, aeu, aes, aev, 
//			bwk

public abstract class aeq
	implements ag
{

	public aeq(add add1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		a = add1.getContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #25  <Method Context add.getContext()>
	//    5   11:putfield        #27  <Field Context a>
		b = aw.e().b(a, add1.k().a);
	//    6   14:aload_0         
	//    7   15:invokestatic    #33  <Method xg aw.e()>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field Context a>
	//   10   22:aload_1         
	//   11   23:invokeinterface #37  <Method zzbbi add.k()>
	//   12   28:getfield        #41  <Field String zzbbi.a>
	//   13   31:invokevirtual   #46  <Method String xg.b(Context, String)>
	//   14   34:putfield        #48  <Field String b>
		c = new WeakReference(((Object) (add1)));
	//   15   37:aload_0         
	//   16   38:new             #50  <Class WeakReference>
	//   17   41:dup             
	//   18   42:aload_1         
	//   19   43:invokespecial   #53  <Method void WeakReference(Object)>
	//   20   46:putfield        #55  <Field WeakReference c>
	//   21   49:return          
	}

	static String a(aeq aeq1, String s)
	{
		return c(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #60  <Method String c(String)>
	//    2    4:areturn         
	}

	static void a(aeq aeq1, String s, Map map)
	{
		aeq1.a(s, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #64  <Method void a(String, Map)>
	//    4    6:return          
	}

	private final void a(String s, Map map)
	{
		add add1 = (add)c.get();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field WeakReference c>
	//    2    4:invokevirtual   #68  <Method Object WeakReference.get()>
	//    3    7:checkcast       #21  <Class add>
	//    4   10:astore_3        
		if(add1 != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          23
			add1.a(s, map);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #69  <Method void add.a(String, Map)>
	//   11   23:return          
	}

	private static String c(String s)
	{
		byte byte0;
label0:
		{
			switch(s.hashCode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #75  <Method int String.hashCode()>
			{
			default:
				break;

	//*   2    4:lookupswitch    12: default 112
	//	               -1947652542: 275
	//	               -1396664534: 260
	//	               -1347010958: 246
	//	               -918817863: 231
	//	               -659376217: 217
	//	               -642208130: 203
	//	               -354048396: 188
	//	               -32082395: 173
	//	               3387234: 159
	//	               96784904: 145
	//	               580119100: 130
	//	               725497484: 115
	//*   3  112:goto            289
			case 725497484: 
				if(s.equals("noCacheDir"))
	//*   4  115:aload_0         
	//*   5  116:ldc1            #77  <String "noCacheDir">
	//*   6  118:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*   7  121:ifeq            289
				{
					byte0 = 7;
	//    8  124:bipush          7
	//    9  126:istore_1        
					break label0;
	//   10  127:goto            291
				}
				break;

			case 580119100: 
				if(!s.equals("expireFailed"))
					break;
	//   11  130:aload_0         
	//   12  131:ldc1            #83  <String "expireFailed">
	//   13  133:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   14  136:ifeq            289
				byte0 = 6;
	//   15  139:bipush          6
	//   16  141:istore_1        
				break label0;
	//   17  142:goto            291

			case 96784904: 
				if(!s.equals("error"))
					break;
	//   18  145:aload_0         
	//   19  146:ldc1            #85  <String "error">
	//   20  148:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   21  151:ifeq            289
				byte0 = 1;
	//   22  154:iconst_1        
	//   23  155:istore_1        
				break label0;
	//   24  156:goto            291

			case 3387234: 
				if(!s.equals("noop"))
					break;
	//   25  159:aload_0         
	//   26  160:ldc1            #87  <String "noop">
	//   27  162:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   28  165:ifeq            289
				byte0 = 4;
	//   29  168:iconst_4        
	//   30  169:istore_1        
				break label0;
	//   31  170:goto            291

			case -32082395: 
				if(!s.equals("externalAbort"))
					break;
	//   32  173:aload_0         
	//   33  174:ldc1            #89  <String "externalAbort">
	//   34  176:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   35  179:ifeq            289
				byte0 = 10;
	//   36  182:bipush          10
	//   37  184:istore_1        
				break label0;
	//   38  185:goto            291

			case -354048396: 
				if(!s.equals("sizeExceeded"))
					break;
	//   39  188:aload_0         
	//   40  189:ldc1            #91  <String "sizeExceeded">
	//   41  191:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   42  194:ifeq            289
				byte0 = 11;
	//   43  197:bipush          11
	//   44  199:istore_1        
				break label0;
	//   45  200:goto            291

			case -642208130: 
				if(!s.equals("playerFailed"))
					break;
	//   46  203:aload_0         
	//   47  204:ldc1            #93  <String "playerFailed">
	//   48  206:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   49  209:ifeq            289
				byte0 = 5;
	//   50  212:iconst_5        
	//   51  213:istore_1        
				break label0;
	//   52  214:goto            291

			case -659376217: 
				if(!s.equals("contentLengthMissing"))
					break;
	//   53  217:aload_0         
	//   54  218:ldc1            #95  <String "contentLengthMissing">
	//   55  220:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   56  223:ifeq            289
				byte0 = 0;
	//   57  226:iconst_0        
	//   58  227:istore_1        
				break label0;
	//   59  228:goto            291

			case -918817863: 
				if(!s.equals("downloadTimeout"))
					break;
	//   60  231:aload_0         
	//   61  232:ldc1            #97  <String "downloadTimeout">
	//   62  234:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   63  237:ifeq            289
				byte0 = 9;
	//   64  240:bipush          9
	//   65  242:istore_1        
				break label0;
	//   66  243:goto            291

			case -1347010958: 
				if(!s.equals("inProgress"))
					break;
	//   67  246:aload_0         
	//   68  247:ldc1            #99  <String "inProgress">
	//   69  249:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   70  252:ifeq            289
				byte0 = 2;
	//   71  255:iconst_2        
	//   72  256:istore_1        
				break label0;
	//   73  257:goto            291

			case -1396664534: 
				if(!s.equals("badUrl"))
					break;
	//   74  260:aload_0         
	//   75  261:ldc1            #101 <String "badUrl">
	//   76  263:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   77  266:ifeq            289
				byte0 = 8;
	//   78  269:bipush          8
	//   79  271:istore_1        
				break label0;
	//   80  272:goto            291

			case -1947652542: 
				if(!s.equals("interrupted"))
					break;
	//   81  275:aload_0         
	//   82  276:ldc1            #103 <String "interrupted">
	//   83  278:invokevirtual   #81  <Method boolean String.equals(Object)>
	//   84  281:ifeq            289
				byte0 = 3;
	//   85  284:iconst_3        
	//   86  285:istore_1        
				break label0;
	//   87  286:goto            291
			}
			byte0 = -1;
	//   88  289:iconst_m1       
	//   89  290:istore_1        
		}
		switch(byte0)
	//*  90  291:iload_1         
		{
	//*  91  292:tableswitch     0 11: default 356
	//	               0 368
	//	               1 368
	//	               2 368
	//	               3 368
	//	               4 368
	//	               5 368
	//	               6 365
	//	               7 365
	//	               8 362
	//	               9 362
	//	               10 359
	//	               11 359
		default:
			return "internal";
	//   92  356:ldc1            #105 <String "internal">
	//   93  358:areturn         

		case 10: // '\n'
		case 11: // '\013'
			return "policy";
	//   94  359:ldc1            #107 <String "policy">
	//   95  361:areturn         

		case 8: // '\b'
		case 9: // '\t'
			return "network";
	//   96  362:ldc1            #109 <String "network">
	//   97  364:areturn         

		case 6: // '\006'
		case 7: // '\007'
			return "io";
	//   98  365:ldc1            #111 <String "io">
	//   99  367:areturn         

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			return "internal";
	//  100  368:ldc1            #105 <String "internal">
	//  101  370:areturn         
		}
	}

	public void a()
	{
	//    0    0:return          
	}

	protected void a(int i)
	{
	//    0    0:return          
	}

	protected final void a(String s, String s1, int i)
	{
		zv.a.post(((Runnable) (new aet(this, s, s1, i))));
	//    0    0:getstatic       #118 <Field Handler zv.a>
	//    1    3:new             #120 <Class aet>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #123 <Method void aet(aeq, String, String, int)>
	//    8   14:invokevirtual   #129 <Method boolean Handler.post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void a(String s, String s1, long l)
	{
		zv.a.post(((Runnable) (new aeu(this, s, s1, l))));
	//    0    0:getstatic       #118 <Field Handler zv.a>
	//    1    3:new             #132 <Class aeu>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:lload_3         
	//    7   11:invokespecial   #135 <Method void aeu(aeq, String, String, long)>
	//    8   14:invokevirtual   #129 <Method boolean Handler.post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void a(String s, String s1, long l, long l1, boolean flag, 
			int i, int j)
	{
		zv.a.post(((Runnable) (new aes(this, s, s1, l, l1, flag, i, j))));
	//    0    0:getstatic       #118 <Field Handler zv.a>
	//    1    3:new             #138 <Class aes>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:lload_3         
	//    7   11:lload           5
	//    8   13:iload           7
	//    9   15:iload           8
	//   10   17:iload           9
	//   11   19:invokespecial   #141 <Method void aes(aeq, String, String, long, long, boolean, int, int)>
	//   12   22:invokevirtual   #129 <Method boolean Handler.post(Runnable)>
	//   13   25:pop             
	//   14   26:return          
	}

	public final void a(String s, String s1, String s2, String s3)
	{
		zv.a.post(((Runnable) (new aev(this, s, s1, s2, s3))));
	//    0    0:getstatic       #118 <Field Handler zv.a>
	//    1    3:new             #144 <Class aev>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #147 <Method void aev(aeq, String, String, String, String)>
	//    9   16:invokevirtual   #129 <Method boolean Handler.post(Runnable)>
	//   10   19:pop             
	//   11   20:return          
	}

	public abstract boolean a(String s);

	protected String b(String s)
	{
		bwk.a();
	//    0    0:invokestatic    #153 <Method zv bwk.a()>
	//    1    3:pop             
		return zv.a(s);
	//    2    4:aload_1         
	//    3    5:invokestatic    #155 <Method String zv.a(String)>
	//    4    8:areturn         
	}

	public abstract void b();

	protected void c(int i)
	{
	//    0    0:return          
	}

	protected void d(int i)
	{
	//    0    0:return          
	}

	protected void e(int i)
	{
	//    0    0:return          
	}

	protected Context a;
	protected String b;
	protected WeakReference c;
}
