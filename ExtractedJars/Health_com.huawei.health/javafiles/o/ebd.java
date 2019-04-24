// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;
import android.text.TextUtils;
import java.io.File;
import java.util.*;

// Referenced classes of package o:
//			eap, dho, ebe, ear, 
//			eax, eeq, ebh, ebl

public class ebd
{

	public ebd(eap.e e1)
	{
		this(e1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #29  <Method void ebd(eap$e, String)>
	//    4    6:return          
	}

	public ebd(eap.e e1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		e = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #33  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void HashMap()>
	//    6   12:putfield        #36  <Field HashMap e>
		c = new HashMap();
	//    7   15:aload_0         
	//    8   16:new             #33  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void HashMap()>
	//   11   23:putfield        #38  <Field HashMap c>
		d = ((Handler) (new _cls4(Looper.getMainLooper())));
	//   12   26:aload_0         
	//   13   27:new             #40  <Class ebd$4>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokestatic    #46  <Method Looper Looper.getMainLooper()>
	//   17   35:invokespecial   #49  <Method void ebd$4(ebd, Looper)>
	//   18   38:putfield        #51  <Field Handler d>
		a = new eap(e1, s);
	//   19   41:aload_0         
	//   20   42:new             #53  <Class eap>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:aload_2         
	//   24   48:invokespecial   #54  <Method void eap(eap$e, String)>
	//   25   51:putfield        #56  <Field eap a>
	//   26   54:return          
	}

	private File a(String s)
	{
		File file;
		String s1 = a.b(s);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field eap a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method String eap.b(String)>
	//    4    8:astore_2        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_80;
	//    5    9:aload_2         
	//    6   10:ifnull          80
		file = new File(s1);
	//    7   13:new             #62  <Class File>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokespecial   #65  <Method void File(String)>
	//   11   21:astore_3        
		if(!file.exists())
			break MISSING_BLOCK_LABEL_59;
	//   12   22:aload_3         
	//   13   23:invokevirtual   #69  <Method boolean File.exists()>
	//   14   26:ifeq            59
		HashMap hashmap = c;
	//   15   29:aload_0         
	//   16   30:getfield        #38  <Field HashMap c>
	//   17   33:astore_2        
		hashmap;
	//   18   34:aload_2         
		JVM INSTR monitorenter ;
	//   19   35:monitorenter    
		c.put(((Object) (d(s))), ((Object) (file)));
	//   20   36:aload_0         
	//   21   37:getfield        #38  <Field HashMap c>
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokespecial   #71  <Method String d(String)>
	//   25   45:aload_3         
	//   26   46:invokevirtual   #75  <Method Object HashMap.put(Object, Object)>
	//   27   49:pop             
		hashmap;
	//   28   50:aload_2         
		JVM INSTR monitorexit ;
	//   29   51:monitorexit     
		return file;
	//   30   52:aload_3         
	//   31   53:areturn         
		s;
	//   32   54:astore_1        
	//*  33   55:aload_2         
		throw s;
	//   34   56:monitorexit     
	//   35   57:aload_1         
	//   36   58:athrow          
		dho.b("Login_DownloadPluginHelper", new Object[] {
			file.getAbsolutePath(), " is not exists."
		});
	//   37   59:ldc1            #77  <String "Login_DownloadPluginHelper">
	//   38   61:iconst_2        
	//   39   62:anewarray       Object[]
	//   40   65:dup             
	//   41   66:iconst_0        
	//   42   67:aload_3         
	//   43   68:invokevirtual   #81  <Method String File.getAbsolutePath()>
	//   44   71:aastore         
	//   45   72:dup             
	//   46   73:iconst_1        
	//   47   74:ldc1            #83  <String " is not exists.">
	//   48   76:aastore         
	//   49   77:invokestatic    #88  <Method void dho.b(String, Object[])>
		return null;
	//   50   80:aconst_null     
	//   51   81:areturn         
	}

	static String a(int i)
	{
		return d(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #91  <Method String d(int)>
	//    2    4:areturn         
	}

	private void a(Handler handler, b b1)
	{
	/* block-local class not found */
	class b {}

		handler.sendMessageDelayed(Message.obtain(handler, 1101, ((Object) (b1))), b1.a);
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:sipush          1101
	//    3    5:aload_2         
	//    4    6:invokestatic    #98  <Method Message Message.obtain(Handler, int, Object)>
	//    5    9:aload_2         
	//    6   10:getfield        #100 <Field int ebd$b.a>
	//    7   13:i2l             
	//    8   14:invokevirtual   #106 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//    9   17:pop             
		if(b1.g != null)
	//*  10   18:aload_2         
	//*  11   19:getfield        #110 <Field ebe ebd$b.g>
	//*  12   22:ifnull          38
			b1.g.c(b1.e);
	//   13   25:aload_2         
	//   14   26:getfield        #110 <Field ebe ebd$b.g>
	//   15   29:aload_2         
	//   16   30:getfield        #112 <Field int ebd$b.e>
	//   17   33:invokeinterface #117 <Method void ebe.c(int)>
	//   18   38:return          
	}

	private void a(Handler handler, b b1, boolean flag)
	{
		handler.removeMessages(1101);
	//    0    0:aload_1         
	//    1    1:sipush          1101
	//    2    4:invokevirtual   #121 <Method void Handler.removeMessages(int)>
		if(!flag)
	//*   3    7:iload_3         
	//*   4    8:ifne            23
		{
			c(b1, 3);
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:iconst_3        
	//    8   14:invokespecial   #124 <Method void c(ebd$b, int)>
			b1.g = null;
	//    9   17:aload_2         
	//   10   18:aconst_null     
	//   11   19:putfield        #110 <Field ebe ebd$b.g>
			return;
	//   12   22:return          
		}
		b1.h.d(true);
	//   13   23:aload_2         
	//   14   24:getfield        #127 <Field eap ebd$b.h>
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #130 <Method void eap.d(boolean)>
		boolean flag1 = false;
	//   17   31:iconst_0        
	//   18   32:istore          4
		Object aobj[] = b1.d.toArray();
	//   19   34:aload_2         
	//   20   35:getfield        #133 <Field List ebd$b.d>
	//   21   38:invokeinterface #139 <Method Object[] List.toArray()>
	//   22   43:astore          8
		int j = aobj.length;
	//   23   45:aload           8
	//   24   47:arraylength     
	//   25   48:istore          7
		for(int i = 0; i < j; i++)
	//*  26   50:iconst_0        
	//*  27   51:istore          6
	//*  28   53:iload           6
	//*  29   55:iload           7
	//*  30   57:icmpge          270
		{
			Object obj = aobj[i];
	//   31   60:aload           8
	//   32   62:iload           6
	//   33   64:aaload          
	//   34   65:astore          10
	/* block-local class not found */
	class a {}

			a a1 = new a(((_cls5) (null)));
	//   35   67:new             #6   <Class ebd$a>
	//   36   70:dup             
	//   37   71:aconst_null     
	//   38   72:invokespecial   #142 <Method void ebd$a(ebd$5)>
	//   39   75:astore          9
			a1.c = b1;
	//   40   77:aload           9
	//   41   79:aload_2         
	//   42   80:putfield        #145 <Field ebd$b ebd$a.c>
			a1.d = (String)obj;
	//   43   83:aload           9
	//   44   85:aload           10
	//   45   87:checkcast       #147 <Class String>
	//   46   90:putfield        #150 <Field String ebd$a.d>
			obj = ((Object) (b1.h.d(a1.d)));
	//   47   93:aload_2         
	//   48   94:getfield        #127 <Field eap ebd$b.h>
	//   49   97:aload           9
	//   50   99:getfield        #150 <Field String ebd$a.d>
	//   51  102:invokevirtual   #153 <Method ear eap.d(String)>
	//   52  105:astore          10
			if(obj == null)
	//*  53  107:aload           10
	//*  54  109:ifnonnull       144
			{
				dho.b("Login_DownloadPluginHelper", new Object[] {
					"updateDescrption file fail(index not exist the plugin), uuid=", a1.d
				});
	//   55  112:ldc1            #77  <String "Login_DownloadPluginHelper">
	//   56  114:iconst_2        
	//   57  115:anewarray       Object[]
	//   58  118:dup             
	//   59  119:iconst_0        
	//   60  120:ldc1            #155 <String "updateDescrption file fail(index not exist the plugin), uuid=">
	//   61  122:aastore         
	//   62  123:dup             
	//   63  124:iconst_1        
	//   64  125:aload           9
	//   65  127:getfield        #150 <Field String ebd$a.d>
	//   66  130:aastore         
	//   67  131:invokestatic    #88  <Method void dho.b(String, Object[])>
				d(a1, false);
	//   68  134:aload_0         
	//   69  135:aload           9
	//   70  137:iconst_0        
	//   71  138:invokespecial   #158 <Method void d(ebd$a, boolean)>
				continue;
	//   72  141:goto            261
			}
			if(b1.h.e(a1.d))
	//*  73  144:aload_2         
	//*  74  145:getfield        #127 <Field eap ebd$b.h>
	//*  75  148:aload           9
	//*  76  150:getfield        #150 <Field String ebd$a.d>
	//*  77  153:invokevirtual   #161 <Method boolean eap.e(String)>
	//*  78  156:ifeq            191
			{
				dho.b("Login_DownloadPluginHelper", new Object[] {
					"updateDescrption file success(plugin is avaiable), uuid=", a1.d
				});
	//   79  159:ldc1            #77  <String "Login_DownloadPluginHelper">
	//   80  161:iconst_2        
	//   81  162:anewarray       Object[]
	//   82  165:dup             
	//   83  166:iconst_0        
	//   84  167:ldc1            #163 <String "updateDescrption file success(plugin is avaiable), uuid=">
	//   85  169:aastore         
	//   86  170:dup             
	//   87  171:iconst_1        
	//   88  172:aload           9
	//   89  174:getfield        #150 <Field String ebd$a.d>
	//   90  177:aastore         
	//   91  178:invokestatic    #88  <Method void dho.b(String, Object[])>
				d(a1, true);
	//   92  181:aload_0         
	//   93  182:aload           9
	//   94  184:iconst_1        
	//   95  185:invokespecial   #158 <Method void d(ebd$a, boolean)>
				continue;
	//   96  188:goto            261
			}
			boolean flag2 = flag1;
	//   97  191:iload           4
	//   98  193:istore          5
			if(!flag1)
	//*  99  195:iload           4
	//* 100  197:ifne            209
			{
				a(handler, b1);
	//  101  200:aload_0         
	//  102  201:aload_1         
	//  103  202:aload_2         
	//  104  203:invokespecial   #165 <Method void a(Handler, ebd$b)>
				flag2 = true;
	//  105  206:iconst_1        
	//  106  207:istore          5
			}
			if(!b1.h.e())
	//* 107  209:aload_2         
	//* 108  210:getfield        #127 <Field eap ebd$b.h>
	//* 109  213:invokevirtual   #167 <Method boolean eap.e()>
	//* 110  216:ifne            250
			{
				a1.e = ((ear) (obj)).i();
	//  111  219:aload           9
	//  112  221:aload           10
	//  113  223:invokevirtual   #173 <Method int ear.i()>
	//  114  226:putfield        #174 <Field int ebd$a.e>
				handler.sendMessage(Message.obtain(handler, 1004, ((Object) (a1))));
	//  115  229:aload_1         
	//  116  230:aload_1         
	//  117  231:sipush          1004
	//  118  234:aload           9
	//  119  236:invokestatic    #98  <Method Message Message.obtain(Handler, int, Object)>
	//  120  239:invokevirtual   #178 <Method boolean Handler.sendMessage(Message)>
	//  121  242:pop             
				flag1 = flag2;
	//  122  243:iload           5
	//  123  245:istore          4
			} else
	//* 124  247:goto            261
			{
				b(handler, a1);
	//  125  250:aload_0         
	//  126  251:aload_1         
	//  127  252:aload           9
	//  128  254:invokespecial   #181 <Method void b(Handler, ebd$a)>
				flag1 = flag2;
	//  129  257:iload           5
	//  130  259:istore          4
			}
		}

	//  131  261:iload           6
	//  132  263:iconst_1        
	//  133  264:iadd            
	//  134  265:istore          6
	//* 135  267:goto            53
		if(flag1 && b1.d.isEmpty())
	//* 136  270:iload           4
	//* 137  272:ifeq            294
	//* 138  275:aload_2         
	//* 139  276:getfield        #133 <Field List ebd$b.d>
	//* 140  279:invokeinterface #184 <Method boolean List.isEmpty()>
	//* 141  284:ifeq            294
			e(handler, b1, 0);
	//  142  287:aload_0         
	//  143  288:aload_1         
	//  144  289:aload_2         
	//  145  290:iconst_0        
	//  146  291:invokespecial   #187 <Method void e(Handler, ebd$b, int)>
	//  147  294:return          
	}

	private static void a(a a1)
	{
		if(2 == a1.c.c)
	//*   0    0:iconst_2        
	//*   1    1:aload_0         
	//*   2    2:getfield        #145 <Field ebd$b ebd$a.c>
	//*   3    5:getfield        #190 <Field int ebd$b.c>
	//*   4    8:icmpne          27
		{
			a1 = ((a) (a1.a));
	//    5   11:aload_0         
	//    6   12:getfield        #193 <Field eay ebd$a.a>
	//    7   15:astore_0        
			if(a1 != null)
	//*   8   16:aload_0         
	//*   9   17:ifnull          27
				eax.b().d(((eay) (a1)));
	//   10   20:invokestatic    #198 <Method eax eax.b()>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #201 <Method void eax.d(eay)>
		}
	//   13   27:return          
	}

	static void a(ebd ebd1, Handler handler, b b1, int i)
	{
		ebd1.e(handler, b1, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #187 <Method void e(Handler, ebd$b, int)>
	//    5    7:return          
	}

	private void b(Handler handler, a a1)
	{
		a1.c.h.e(a1.d, ((eaz) (new _cls1(a1, handler))));
	//    0    0:aload_2         
	//    1    1:getfield        #145 <Field ebd$b ebd$a.c>
	//    2    4:getfield        #127 <Field eap ebd$b.h>
	//    3    7:aload_2         
	//    4    8:getfield        #150 <Field String ebd$a.d>
	//    5   11:new             #204 <Class ebd$1>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokespecial   #207 <Method void ebd$1(ebd, ebd$a, Handler)>
	//   11   21:invokevirtual   #210 <Method void eap.e(String, eaz)>
	//   12   24:return          
	}

	private static void b(Handler handler, b b1, String s)
	{
		if(b1.k != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #215 <Field ebh ebd$b.k>
	//*   2    4:ifnull          82
		{
			if(Looper.getMainLooper() == Looper.myLooper())
	//*   3    7:invokestatic    #46  <Method Looper Looper.getMainLooper()>
	//*   4   10:invokestatic    #218 <Method Looper Looper.myLooper()>
	//*   5   13:if_acmpne       33
			{
				eeq.b().e(((Runnable) (new _cls5(handler, b1, s))));
	//    6   16:invokestatic    #223 <Method eeq eeq.b()>
	//    7   19:new             #225 <Class ebd$5>
	//    8   22:dup             
	//    9   23:aload_0         
	//   10   24:aload_1         
	//   11   25:aload_2         
	//   12   26:invokespecial   #227 <Method void ebd$5(Handler, ebd$b, String)>
	//   13   29:invokevirtual   #230 <Method void eeq.e(Runnable)>
				return;
	//   14   32:return          
			}
			String s1 = b1.k.e(((String) (null)), b1.h.d());
	//   15   33:aload_1         
	//   16   34:getfield        #215 <Field ebh ebd$b.k>
	//   17   37:aconst_null     
	//   18   38:aload_1         
	//   19   39:getfield        #127 <Field eap ebd$b.h>
	//   20   42:invokevirtual   #232 <Method boolean eap.d()>
	//   21   45:invokeinterface #237 <Method String ebh.e(String, boolean)>
	//   22   50:astore_3        
			dho.b("Login_DownloadPluginHelper", new Object[] {
				"updatePluginDownloadUrl success. queryStr=(", b1.h.c(s1, s), ")"
			});
	//   23   51:ldc1            #77  <String "Login_DownloadPluginHelper">
	//   24   53:iconst_3        
	//   25   54:anewarray       Object[]
	//   26   57:dup             
	//   27   58:iconst_0        
	//   28   59:ldc1            #239 <String "updatePluginDownloadUrl success. queryStr=(">
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:aload_1         
	//   33   65:getfield        #127 <Field eap ebd$b.h>
	//   34   68:aload_3         
	//   35   69:aload_2         
	//   36   70:invokevirtual   #242 <Method String eap.c(String, String)>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_2        
	//   40   76:ldc1            #244 <String ")">
	//   41   78:aastore         
	//   42   79:invokestatic    #88  <Method void dho.b(String, Object[])>
		}
		if(b1.h.i())
	//*  43   82:aload_1         
	//*  44   83:getfield        #127 <Field eap ebd$b.h>
	//*  45   86:invokevirtual   #246 <Method boolean eap.i()>
	//*  46   89:ifeq            120
		{
			s = ((String) (new a(((_cls5) (null)))));
	//   47   92:new             #6   <Class ebd$a>
	//   48   95:dup             
	//   49   96:aconst_null     
	//   50   97:invokespecial   #142 <Method void ebd$a(ebd$5)>
	//   51  100:astore_2        
			s.c = b1;
	//   52  101:aload_2         
	//   53  102:aload_1         
	//   54  103:putfield        #145 <Field ebd$b ebd$a.c>
			handler.sendMessage(Message.obtain(handler, 1001, ((Object) (s))));
	//   55  106:aload_0         
	//   56  107:aload_0         
	//   57  108:sipush          1001
	//   58  111:aload_2         
	//   59  112:invokestatic    #98  <Method Message Message.obtain(Handler, int, Object)>
	//   60  115:invokevirtual   #178 <Method boolean Handler.sendMessage(Message)>
	//   61  118:pop             
			return;
	//   62  119:return          
		} else
		{
			b1.h.a(((String) (null)));
	//   63  120:aload_1         
	//   64  121:getfield        #127 <Field eap ebd$b.h>
	//   65  124:aconst_null     
	//   66  125:invokevirtual   #248 <Method void eap.a(String)>
			e(handler, b1);
	//   67  128:aload_0         
	//   68  129:aload_1         
	//   69  130:invokestatic    #250 <Method void e(Handler, ebd$b)>
			return;
	//   70  133:return          
		}
	}

	private void b(a a1)
	{
		if(a1.c.f <= 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #145 <Field ebd$b ebd$a.c>
	//*   2    4:getfield        #253 <Field int ebd$b.f>
	//*   3    7:ifgt            38
		{
			dho.f("Login_DownloadPluginHelper", new Object[] {
				"totalSize error, totalSize=", Integer.valueOf(a1.c.f)
			});
	//    4   10:ldc1            #77  <String "Login_DownloadPluginHelper">
	//    5   12:iconst_2        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:ldc1            #255 <String "totalSize error, totalSize=">
	//   10   20:aastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:aload_1         
	//   14   24:getfield        #145 <Field ebd$b ebd$a.c>
	//   15   27:getfield        #253 <Field int ebd$b.f>
	//   16   30:invokestatic    #261 <Method Integer Integer.valueOf(int)>
	//   17   33:aastore         
	//   18   34:invokestatic    #263 <Method void dho.f(String, Object[])>
			return;
	//   19   37:return          
		}
		int i = ((a1.e + a1.c.m) * 100) / a1.c.f;
	//   20   38:aload_1         
	//   21   39:getfield        #174 <Field int ebd$a.e>
	//   22   42:aload_1         
	//   23   43:getfield        #145 <Field ebd$b ebd$a.c>
	//   24   46:getfield        #266 <Field int ebd$b.m>
	//   25   49:iadd            
	//   26   50:bipush          100
	//   27   52:imul            
	//   28   53:aload_1         
	//   29   54:getfield        #145 <Field ebd$b ebd$a.c>
	//   30   57:getfield        #253 <Field int ebd$b.f>
	//   31   60:idiv            
	//   32   61:istore_2        
		if(a1.c.p >= i)
	//*  33   62:aload_1         
	//*  34   63:getfield        #145 <Field ebd$b ebd$a.c>
	//*  35   66:getfield        #269 <Field int ebd$b.p>
	//*  36   69:iload_2         
	//*  37   70:icmplt          74
			return;
	//   38   73:return          
		a1.c.p = i;
	//   39   74:aload_1         
	//   40   75:getfield        #145 <Field ebd$b ebd$a.c>
	//   41   78:iload_2         
	//   42   79:putfield        #269 <Field int ebd$b.p>
		if(a1.c.g != null)
	//*  43   82:aload_1         
	//*  44   83:getfield        #145 <Field ebd$b ebd$a.c>
	//*  45   86:getfield        #110 <Field ebe ebd$b.g>
	//*  46   89:ifnull          112
			a1.c.g.b(a1.c.e, i);
	//   47   92:aload_1         
	//   48   93:getfield        #145 <Field ebd$b ebd$a.c>
	//   49   96:getfield        #110 <Field ebe ebd$b.g>
	//   50   99:aload_1         
	//   51  100:getfield        #145 <Field ebd$b ebd$a.c>
	//   52  103:getfield        #112 <Field int ebd$b.e>
	//   53  106:iload_2         
	//   54  107:invokeinterface #272 <Method void ebe.b(int, int)>
	//   55  112:return          
	}

	private static void b(b b1)
	{
		if(1 == b1.c)
	//*   0    0:iconst_1        
	//*   1    1:aload_0         
	//*   2    2:getfield        #190 <Field int ebd$b.c>
	//*   3    5:icmpne          13
			b1.c = 2;
	//    4    8:aload_0         
	//    5    9:iconst_2        
	//    6   10:putfield        #190 <Field int ebd$b.c>
	//    7   13:return          
	}

	private static int c()
	{
		o/ebd;
	//    0    0:ldc1            #2   <Class ebd>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		int i;
		i = b + 1;
	//    2    3:getstatic       #23  <Field int b>
	//    3    6:iconst_1        
	//    4    7:iadd            
	//    5    8:istore_0        
		b = i;
	//    6    9:iload_0         
	//    7   10:putstatic       #23  <Field int b>
		o/ebd;
	//    8   13:ldc1            #2   <Class ebd>
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return i;
	//   10   16:iload_0         
	//   11   17:ireturn         
		Exception exception;
		exception;
	//   12   18:astore_1        
	//*  13   19:ldc1            #2   <Class ebd>
		throw exception;
	//   14   21:monitorexit     
	//   15   22:aload_1         
	//   16   23:athrow          
	}

	private void c(Handler handler, a a1, boolean flag)
	{
		if(a1.c.d.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:getfield        #145 <Field ebd$b ebd$a.c>
	//*   2    4:getfield        #133 <Field List ebd$b.d>
	//*   3    7:invokeinterface #184 <Method boolean List.isEmpty()>
	//*   4   12:ifeq            16
			return;
	//    5   15:return          
		if(!flag)
	//*   6   16:iload_3         
	//*   7   17:ifne            29
		{
			d(a1, flag);
	//    8   20:aload_0         
	//    9   21:aload_2         
	//   10   22:iload_3         
	//   11   23:invokespecial   #158 <Method void d(ebd$a, boolean)>
		} else
	//*  12   26:goto            68
		{
			b b1 = a1.c;
	//   13   29:aload_2         
	//   14   30:getfield        #145 <Field ebd$b ebd$a.c>
	//   15   33:astore          4
			b1.l = b1.l + 1;
	//   16   35:aload           4
	//   17   37:aload           4
	//   18   39:getfield        #277 <Field int ebd$b.l>
	//   19   42:iconst_1        
	//   20   43:iadd            
	//   21   44:putfield        #277 <Field int ebd$b.l>
			b1 = a1.c;
	//   22   47:aload_2         
	//   23   48:getfield        #145 <Field ebd$b ebd$a.c>
	//   24   51:astore          4
			b1.f = b1.f + a1.e;
	//   25   53:aload           4
	//   26   55:aload           4
	//   27   57:getfield        #253 <Field int ebd$b.f>
	//   28   60:aload_2         
	//   29   61:getfield        #174 <Field int ebd$a.e>
	//   30   64:iadd            
	//   31   65:putfield        #253 <Field int ebd$b.f>
		}
		if(a1.c.l == a1.c.d.size())
	//*  32   68:aload_2         
	//*  33   69:getfield        #145 <Field ebd$b ebd$a.c>
	//*  34   72:getfield        #277 <Field int ebd$b.l>
	//*  35   75:aload_2         
	//*  36   76:getfield        #145 <Field ebd$b ebd$a.c>
	//*  37   79:getfield        #133 <Field List ebd$b.d>
	//*  38   82:invokeinterface #280 <Method int List.size()>
	//*  39   87:icmpne          175
		{
			dho.b("Login_DownloadPluginHelper", new Object[] {
				"collectDescrptions success, totalSize=", Integer.valueOf(a1.c.f)
			});
	//   40   90:ldc1            #77  <String "Login_DownloadPluginHelper">
	//   41   92:iconst_2        
	//   42   93:anewarray       Object[]
	//   43   96:dup             
	//   44   97:iconst_0        
	//   45   98:ldc2            #282 <String "collectDescrptions success, totalSize=">
	//   46  101:aastore         
	//   47  102:dup             
	//   48  103:iconst_1        
	//   49  104:aload_2         
	//   50  105:getfield        #145 <Field ebd$b ebd$a.c>
	//   51  108:getfield        #253 <Field int ebd$b.f>
	//   52  111:invokestatic    #261 <Method Integer Integer.valueOf(int)>
	//   53  114:aastore         
	//   54  115:invokestatic    #88  <Method void dho.b(String, Object[])>
			if(a1.c.d.isEmpty())
	//*  55  118:aload_2         
	//*  56  119:getfield        #145 <Field ebd$b ebd$a.c>
	//*  57  122:getfield        #133 <Field List ebd$b.d>
	//*  58  125:invokeinterface #184 <Method boolean List.isEmpty()>
	//*  59  130:ifeq            144
			{
				e(handler, a1.c, 0);
	//   60  133:aload_0         
	//   61  134:aload_1         
	//   62  135:aload_2         
	//   63  136:getfield        #145 <Field ebd$b ebd$a.c>
	//   64  139:iconst_0        
	//   65  140:invokespecial   #187 <Method void e(Handler, ebd$b, int)>
				return;
	//   66  143:return          
			}
			a1.d = (String)a1.c.d.get(0);
	//   67  144:aload_2         
	//   68  145:aload_2         
	//   69  146:getfield        #145 <Field ebd$b ebd$a.c>
	//   70  149:getfield        #133 <Field List ebd$b.d>
	//   71  152:iconst_0        
	//   72  153:invokeinterface #286 <Method Object List.get(int)>
	//   73  158:checkcast       #147 <Class String>
	//   74  161:putfield        #150 <Field String ebd$a.d>
			a1.e = 0;
	//   75  164:aload_2         
	//   76  165:iconst_0        
	//   77  166:putfield        #174 <Field int ebd$a.e>
			e(handler, a1);
	//   78  169:aload_0         
	//   79  170:aload_1         
	//   80  171:aload_2         
	//   81  172:invokespecial   #288 <Method void e(Handler, ebd$a)>
		}
	//   82  175:return          
	}

	static void c(a a1)
	{
		a(a1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #290 <Method void a(ebd$a)>
	//    2    4:return          
	}

	static void c(b b1)
	{
		b(b1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #292 <Method void b(ebd$b)>
	//    2    4:return          
	}

	private void c(b b1, int i)
	{
		if(b1.d.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:getfield        #133 <Field List ebd$b.d>
	//*   2    4:invokeinterface #184 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            13
			return;
	//    4   12:return          
		a a1 = new a(((_cls5) (null)));
	//    5   13:new             #6   <Class ebd$a>
	//    6   16:dup             
	//    7   17:aconst_null     
	//    8   18:invokespecial   #142 <Method void ebd$a(ebd$5)>
	//    9   21:astore          6
		Object aobj[] = b1.d.toArray();
	//   10   23:aload_1         
	//   11   24:getfield        #133 <Field List ebd$b.d>
	//   12   27:invokeinterface #139 <Method Object[] List.toArray()>
	//   13   32:astore          7
		int k = aobj.length;
	//   14   34:aload           7
	//   15   36:arraylength     
	//   16   37:istore          4
		for(int j = 0; j < k; j++)
	//*  17   39:iconst_0        
	//*  18   40:istore_3        
	//*  19   41:iload_3         
	//*  20   42:iload           4
	//*  21   44:icmpge          97
		{
			Object obj = aobj[j];
	//   22   47:aload           7
	//   23   49:iload_3         
	//   24   50:aaload          
	//   25   51:astore          8
			a1.c = b1;
	//   26   53:aload           6
	//   27   55:aload_1         
	//   28   56:putfield        #145 <Field ebd$b ebd$a.c>
			a1.d = (String)obj;
	//   29   59:aload           6
	//   30   61:aload           8
	//   31   63:checkcast       #147 <Class String>
	//   32   66:putfield        #150 <Field String ebd$a.d>
			boolean flag;
			if(i != 0)
	//*  33   69:iload_2         
	//*  34   70:ifeq            79
				flag = true;
	//   35   73:iconst_1        
	//   36   74:istore          5
			else
	//*  37   76:goto            82
				flag = false;
	//   38   79:iconst_0        
	//   39   80:istore          5
			d(a1, flag);
	//   40   82:aload_0         
	//   41   83:aload           6
	//   42   85:iload           5
	//   43   87:invokespecial   #158 <Method void d(ebd$a, boolean)>
		}

	//   44   90:iload_3         
	//   45   91:iconst_1        
	//   46   92:iadd            
	//   47   93:istore_3        
	//*  48   94:goto            41
	//   49   97:return          
	}

	static void c(ebd ebd1, Handler handler, a a1, boolean flag)
	{
		ebd1.c(handler, a1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #295 <Method void c(Handler, ebd$a, boolean)>
	//    5    7:return          
	}

	private int d(b b1)
	{
		b1.e = c();
	//    0    0:aload_1         
	//    1    1:invokestatic    #298 <Method int c()>
	//    2    4:putfield        #112 <Field int ebd$b.e>
		HashMap hashmap = e;
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field HashMap e>
	//    5   11:astore_3        
		hashmap;
	//    6   12:aload_3         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		boolean flag;
		flag = e.isEmpty();
	//    8   14:aload_0         
	//    9   15:getfield        #36  <Field HashMap e>
	//   10   18:invokevirtual   #299 <Method boolean HashMap.isEmpty()>
	//   11   21:istore_2        
		e.put(((Object) (Integer.valueOf(b1.e))), ((Object) (b1)));
	//   12   22:aload_0         
	//   13   23:getfield        #36  <Field HashMap e>
	//   14   26:aload_1         
	//   15   27:getfield        #112 <Field int ebd$b.e>
	//   16   30:invokestatic    #261 <Method Integer Integer.valueOf(int)>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #75  <Method Object HashMap.put(Object, Object)>
	//   19   37:pop             
		hashmap;
	//   20   38:aload_3         
		JVM INSTR monitorexit ;
	//   21   39:monitorexit     
		  goto _L1
	//*  22   40:goto            48
		b1;
	//   23   43:astore_1        
	//*  24   44:aload_3         
		throw b1;
	//   25   45:monitorexit     
	//   26   46:aload_1         
	//   27   47:athrow          
_L1:
		if(flag)
	//*  28   48:iload_2         
	//*  29   49:ifeq            70
		{
			b1.h = a;
	//   30   52:aload_1         
	//   31   53:aload_0         
	//   32   54:getfield        #56  <Field eap a>
	//   33   57:putfield        #127 <Field eap ebd$b.h>
			b1.h.c();
	//   34   60:aload_1         
	//   35   61:getfield        #127 <Field eap ebd$b.h>
	//   36   64:invokevirtual   #301 <Method void eap.c()>
		} else
	//*  37   67:goto            95
		{
			b1.h = new eap(a.b(), a.a());
	//   38   70:aload_1         
	//   39   71:new             #53  <Class eap>
	//   40   74:dup             
	//   41   75:aload_0         
	//   42   76:getfield        #56  <Field eap a>
	//   43   79:invokevirtual   #304 <Method eap$e eap.b()>
	//   44   82:aload_0         
	//   45   83:getfield        #56  <Field eap a>
	//   46   86:invokevirtual   #306 <Method String eap.a()>
	//   47   89:invokespecial   #54  <Method void eap(eap$e, String)>
	//   48   92:putfield        #127 <Field eap ebd$b.h>
		}
		return b1.e;
	//   49   95:aload_1         
	//   50   96:getfield        #112 <Field int ebd$b.e>
	//   51   99:ireturn         
	}

	private static String d(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     -10 -1: default 56
	//	               -10 95
	//	               -9 91
	//	               -8 87
	//	               -7 83
	//	               -6 79
	//	               -5 75
	//	               -4 71
	//	               -3 67
	//	               -2 63
	//	               -1 59
	//*   2   56:goto            99
		case -1: 
			return "PULL_UNEXPECTED_INTERRUPTION";
	//    3   59:ldc2            #308 <String "PULL_UNEXPECTED_INTERRUPTION">
	//    4   62:areturn         

		case -2: 
			return "PULL_VERIFICATION_FAILED";
	//    5   63:ldc2            #310 <String "PULL_VERIFICATION_FAILED">
	//    6   66:areturn         

		case -3: 
			return "PULL_TIMEOUT";
	//    7   67:ldc2            #312 <String "PULL_TIMEOUT">
	//    8   70:areturn         

		case -4: 
			return "PULL_NETWORK_ERROR";
	//    9   71:ldc2            #314 <String "PULL_NETWORK_ERROR">
	//   10   74:areturn         

		case -5: 
			return "PULL_NO_SUCH_FILE";
	//   11   75:ldc2            #316 <String "PULL_NO_SUCH_FILE">
	//   12   78:areturn         

		case -6: 
			return "PULL_DECOMPRESS_FAIL";
	//   13   79:ldc2            #318 <String "PULL_DECOMPRESS_FAIL">
	//   14   82:areturn         

		case -7: 
			return "PULL_NO_SUCH_TASK";
	//   15   83:ldc2            #320 <String "PULL_NO_SUCH_TASK">
	//   16   86:areturn         

		case -8: 
			return "PULL_TASK_IS_PENDING";
	//   17   87:ldc2            #322 <String "PULL_TASK_IS_PENDING">
	//   18   90:areturn         

		case -9: 
			return "PULL_STORAGE_NOT_ENOUGH";
	//   19   91:ldc2            #324 <String "PULL_STORAGE_NOT_ENOUGH">
	//   20   94:areturn         

		case -10: 
			return "PULL_CANCLE";
	//   21   95:ldc2            #326 <String "PULL_CANCLE">
	//   22   98:areturn         
		}
		return (new StringBuilder()).append("status:").append(i).toString();
	//   23   99:new             #328 <Class StringBuilder>
	//   24  102:dup             
	//   25  103:invokespecial   #329 <Method void StringBuilder()>
	//   26  106:ldc2            #331 <String "status:">
	//   27  109:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   28  112:iload_0         
	//   29  113:invokevirtual   #338 <Method StringBuilder StringBuilder.append(int)>
	//   30  116:invokevirtual   #341 <Method String StringBuilder.toString()>
	//   31  119:areturn         
	}

	private String d(String s)
	{
		return (new StringBuilder()).append(s).append("-").append(a()).toString();
	//    0    0:new             #328 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #329 <Method void StringBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc2            #343 <String "-">
	//    6   14:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #344 <Method String a()>
	//    9   21:invokevirtual   #335 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #341 <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	private void d(a a1, boolean flag)
	{
		byte byte1 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          4
		byte byte0 = byte1;
	//    2    3:iload           4
	//    3    5:istore_3        
		if(flag)
	//*   4    6:iload_2         
	//*   5    7:ifeq            26
		{
			byte0 = byte1;
	//    6   10:iload           4
	//    7   12:istore_3        
			if(a(a1.d) != null)
	//*   8   13:aload_0         
	//*   9   14:aload_1         
	//*  10   15:getfield        #150 <Field String ebd$a.d>
	//*  11   18:invokespecial   #346 <Method File a(String)>
	//*  12   21:ifnull          26
				byte0 = 0;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		}
		if(!a1.c.d.remove(((Object) (a1.d))))
	//*  15   26:aload_1         
	//*  16   27:getfield        #145 <Field ebd$b ebd$a.c>
	//*  17   30:getfield        #133 <Field List ebd$b.d>
	//*  18   33:aload_1         
	//*  19   34:getfield        #150 <Field String ebd$a.d>
	//*  20   37:invokeinterface #350 <Method boolean List.remove(Object)>
	//*  21   42:ifne            46
			return;
	//   22   45:return          
		if(a1.c.d.isEmpty())
	//*  23   46:aload_1         
	//*  24   47:getfield        #145 <Field ebd$b ebd$a.c>
	//*  25   50:getfield        #133 <Field List ebd$b.d>
	//*  26   53:invokeinterface #184 <Method boolean List.isEmpty()>
	//*  27   58:ifeq            81
		{
			e(a1.c.e);
	//   28   61:aload_0         
	//   29   62:aload_1         
	//   30   63:getfield        #145 <Field ebd$b ebd$a.c>
	//   31   66:getfield        #112 <Field int ebd$b.e>
	//   32   69:invokespecial   #353 <Method ebd$b e(int)>
	//   33   72:pop             
			a1.c.c = 0;
	//   34   73:aload_1         
	//   35   74:getfield        #145 <Field ebd$b ebd$a.c>
	//   36   77:iconst_0        
	//   37   78:putfield        #190 <Field int ebd$b.c>
		}
		if(a1.c.g != null)
	//*  38   81:aload_1         
	//*  39   82:getfield        #145 <Field ebd$b ebd$a.c>
	//*  40   85:getfield        #110 <Field ebe ebd$b.g>
	//*  41   88:ifnull          115
			a1.c.g.c(a1.c.e, a1.d, ((int) (byte0)));
	//   42   91:aload_1         
	//   43   92:getfield        #145 <Field ebd$b ebd$a.c>
	//   44   95:getfield        #110 <Field ebe ebd$b.g>
	//   45   98:aload_1         
	//   46   99:getfield        #145 <Field ebd$b ebd$a.c>
	//   47  102:getfield        #112 <Field int ebd$b.e>
	//   48  105:aload_1         
	//   49  106:getfield        #150 <Field String ebd$a.d>
	//   50  109:iload_3         
	//   51  110:invokeinterface #356 <Method void ebe.c(int, String, int)>
	//   52  115:return          
	}

	private b e(int i)
	{
		HashMap hashmap = e;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field HashMap e>
	//    2    4:astore_2        
		hashmap;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		b b1 = (b)e.remove(((Object) (Integer.valueOf(i))));
	//    5    7:aload_0         
	//    6    8:getfield        #36  <Field HashMap e>
	//    7   11:iload_1         
	//    8   12:invokestatic    #261 <Method Integer Integer.valueOf(int)>
	//    9   15:invokevirtual   #359 <Method Object HashMap.remove(Object)>
	//   10   18:checkcast       #8   <Class ebd$b>
	//   11   21:astore_3        
		hashmap;
	//   12   22:aload_2         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return b1;
	//   14   24:aload_3         
	//   15   25:areturn         
		Exception exception;
		exception;
	//   16   26:astore_3        
	//*  17   27:aload_2         
		throw exception;
	//   18   28:monitorexit     
	//   19   29:aload_3         
	//   20   30:athrow          
	}

	private void e(Handler handler, a a1)
	{
		if(2 == a1.c.c)
	//*   0    0:iconst_2        
	//*   1    1:aload_2         
	//*   2    2:getfield        #145 <Field ebd$b ebd$a.c>
	//*   3    5:getfield        #190 <Field int ebd$b.c>
	//*   4    8:icmpne          22
		{
			e(handler, a1.c, 1);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:getfield        #145 <Field ebd$b ebd$a.c>
	//    9   17:iconst_1        
	//   10   18:invokespecial   #187 <Method void e(Handler, ebd$b, int)>
			return;
	//   11   21:return          
		} else
		{
			handler.removeMessages(1101);
	//   12   22:aload_1         
	//   13   23:sipush          1101
	//   14   26:invokevirtual   #121 <Method void Handler.removeMessages(int)>
			handler.sendMessageDelayed(Message.obtain(handler, 1101, ((Object) (a1.c))), a1.c.a);
	//   15   29:aload_1         
	//   16   30:aload_1         
	//   17   31:sipush          1101
	//   18   34:aload_2         
	//   19   35:getfield        #145 <Field ebd$b ebd$a.c>
	//   20   38:invokestatic    #98  <Method Message Message.obtain(Handler, int, Object)>
	//   21   41:aload_2         
	//   22   42:getfield        #145 <Field ebd$b ebd$a.c>
	//   23   45:getfield        #100 <Field int ebd$b.a>
	//   24   48:i2l             
	//   25   49:invokevirtual   #106 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   26   52:pop             
			a1.c.h.a(a1.d, ((eaz) (new _cls3(a1, handler))));
	//   27   53:aload_2         
	//   28   54:getfield        #145 <Field ebd$b ebd$a.c>
	//   29   57:getfield        #127 <Field eap ebd$b.h>
	//   30   60:aload_2         
	//   31   61:getfield        #150 <Field String ebd$a.d>
	//   32   64:new             #361 <Class ebd$3>
	//   33   67:dup             
	//   34   68:aload_0         
	//   35   69:aload_2         
	//   36   70:aload_1         
	//   37   71:invokespecial   #362 <Method void ebd$3(ebd, ebd$a, Handler)>
	//   38   74:invokevirtual   #364 <Method void eap.a(String, eaz)>
			return;
	//   39   77:return          
		}
	}

	private void e(Handler handler, a a1, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_3         
	//*   1    1:ifne            15
		{
			e(handler, a1.c, 3);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:getfield        #145 <Field ebd$b ebd$a.c>
	//    6   10:iconst_3        
	//    7   11:invokespecial   #187 <Method void e(Handler, ebd$b, int)>
			return;
	//    8   14:return          
		}
		d(a1, flag);
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:iload_3         
	//   12   18:invokespecial   #158 <Method void d(ebd$a, boolean)>
		b b1 = a1.c;
	//   13   21:aload_2         
	//   14   22:getfield        #145 <Field ebd$b ebd$a.c>
	//   15   25:astore          4
		b1.m = b1.m + a1.e;
	//   16   27:aload           4
	//   17   29:aload           4
	//   18   31:getfield        #266 <Field int ebd$b.m>
	//   19   34:aload_2         
	//   20   35:getfield        #174 <Field int ebd$a.e>
	//   21   38:iadd            
	//   22   39:putfield        #266 <Field int ebd$b.m>
		if(a1.c.d.isEmpty())
	//*  23   42:aload_2         
	//*  24   43:getfield        #145 <Field ebd$b ebd$a.c>
	//*  25   46:getfield        #133 <Field List ebd$b.d>
	//*  26   49:invokeinterface #184 <Method boolean List.isEmpty()>
	//*  27   54:ifeq            68
		{
			e(handler, a1.c, 0);
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:aload_2         
	//   31   60:getfield        #145 <Field ebd$b ebd$a.c>
	//   32   63:iconst_0        
	//   33   64:invokespecial   #187 <Method void e(Handler, ebd$b, int)>
			return;
	//   34   67:return          
		} else
		{
			a1.d = (String)a1.c.d.get(0);
	//   35   68:aload_2         
	//   36   69:aload_2         
	//   37   70:getfield        #145 <Field ebd$b ebd$a.c>
	//   38   73:getfield        #133 <Field List ebd$b.d>
	//   39   76:iconst_0        
	//   40   77:invokeinterface #286 <Method Object List.get(int)>
	//   41   82:checkcast       #147 <Class String>
	//   42   85:putfield        #150 <Field String ebd$a.d>
			a1.e = 0;
	//   43   88:aload_2         
	//   44   89:iconst_0        
	//   45   90:putfield        #174 <Field int ebd$a.e>
			e(handler, a1);
	//   46   93:aload_0         
	//   47   94:aload_1         
	//   48   95:aload_2         
	//   49   96:invokespecial   #288 <Method void e(Handler, ebd$a)>
			return;
	//   50   99:return          
		}
	}

	private static void e(Handler handler, b b1)
	{
		handler.sendMessageDelayed(Message.obtain(handler, 1101, ((Object) (b1))), b1.a);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:sipush          1101
	//    3    5:aload_1         
	//    4    6:invokestatic    #98  <Method Message Message.obtain(Handler, int, Object)>
	//    5    9:aload_1         
	//    6   10:getfield        #100 <Field int ebd$b.a>
	//    7   13:i2l             
	//    8   14:invokevirtual   #106 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//    9   17:pop             
		a a1 = new a(((_cls5) (null)));
	//   10   18:new             #6   <Class ebd$a>
	//   11   21:dup             
	//   12   22:aconst_null     
	//   13   23:invokespecial   #142 <Method void ebd$a(ebd$5)>
	//   14   26:astore_2        
		a1.c = b1;
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:putfield        #145 <Field ebd$b ebd$a.c>
		b1.h.a(((eaz) (new _cls2(a1, handler))));
	//   18   32:aload_1         
	//   19   33:getfield        #127 <Field eap ebd$b.h>
	//   20   36:new             #366 <Class ebd$2>
	//   21   39:dup             
	//   22   40:aload_2         
	//   23   41:aload_0         
	//   24   42:invokespecial   #369 <Method void ebd$2(ebd$a, Handler)>
	//   25   45:invokevirtual   #372 <Method void eap.a(eaz)>
	//   26   48:return          
	}

	private void e(Handler handler, b b1, int i)
	{
		handler.removeMessages(1101);
	//    0    0:aload_1         
	//    1    1:sipush          1101
	//    2    4:invokevirtual   #121 <Method void Handler.removeMessages(int)>
		if(2 == i && b1.b)
	//*   3    7:iconst_2        
	//*   4    8:iload_3         
	//*   5    9:icmpne          137
	//*   6   12:aload_2         
	//*   7   13:getfield        #375 <Field boolean ebd$b.b>
	//*   8   16:ifeq            137
		{
			b1.i = b1.i + b1.a;
	//    9   19:aload_2         
	//   10   20:aload_2         
	//   11   21:getfield        #377 <Field int ebd$b.i>
	//   12   24:aload_2         
	//   13   25:getfield        #100 <Field int ebd$b.a>
	//   14   28:iadd            
	//   15   29:putfield        #377 <Field int ebd$b.i>
			dho.b("Login_DownloadPluginHelper", new Object[] {
				"taskNo=", Integer.valueOf(b1.e), ", lastProgress=", Integer.valueOf(b1.p), ", timeout=", Integer.valueOf(b1.a), ", totalCheckTimeout=", Integer.valueOf(b1.i)
			});
	//   16   32:ldc1            #77  <String "Login_DownloadPluginHelper">
	//   17   34:bipush          8
	//   18   36:anewarray       Object[]
	//   19   39:dup             
	//   20   40:iconst_0        
	//   21   41:ldc2            #379 <String "taskNo=">
	//   22   44:aastore         
	//   23   45:dup             
	//   24   46:iconst_1        
	//   25   47:aload_2         
	//   26   48:getfield        #112 <Field int ebd$b.e>
	//   27   51:invokestatic    #261 <Method Integer Integer.valueOf(int)>
	//   28   54:aastore         
	//   29   55:dup             
	//   30   56:iconst_2        
	//   31   57:ldc2            #381 <String ", lastProgress=">
	//   32   60:aastore         
	//   33   61:dup             
	//   34   62:iconst_3        
	//   35   63:aload_2         
	//   36   64:getfield        #269 <Field int ebd$b.p>
	//   37   67:invokestatic    #261 <Method Integer Integer.valueOf(int)>
	//   38   70:aastore         
	//   39   71:dup             
	//   40   72:iconst_4        
	//   41   73:ldc2            #383 <String ", timeout=">
	//   42   76:aastore         
	//   43   77:dup             
	//   44   78:iconst_5        
	//   45   79:aload_2         
	//   46   80:getfield        #100 <Field int ebd$b.a>
	//   47   83:invokestatic    #261 <Method Integer Integer.valueOf(int)>
	//   48   86:aastore         
	//   49   87:dup             
	//   50   88:bipush          6
	//   51   90:ldc2            #385 <String ", totalCheckTimeout=">
	//   52   93:aastore         
	//   53   94:dup             
	//   54   95:bipush          7
	//   55   97:aload_2         
	//   56   98:getfield        #377 <Field int ebd$b.i>
	//   57  101:invokestatic    #261 <Method Integer Integer.valueOf(int)>
	//   58  104:aastore         
	//   59  105:invokestatic    #88  <Method void dho.b(String, Object[])>
			if(b1.i < 0x1d4c0)
	//*  60  108:aload_2         
	//*  61  109:getfield        #377 <Field int ebd$b.i>
	//*  62  112:ldc2            #386 <Int 0x1d4c0>
	//*  63  115:icmpge          137
			{
				handler.sendMessageDelayed(Message.obtain(handler, 1101, ((Object) (b1))), b1.a);
	//   64  118:aload_1         
	//   65  119:aload_1         
	//   66  120:sipush          1101
	//   67  123:aload_2         
	//   68  124:invokestatic    #98  <Method Message Message.obtain(Handler, int, Object)>
	//   69  127:aload_2         
	//   70  128:getfield        #100 <Field int ebd$b.a>
	//   71  131:i2l             
	//   72  132:invokevirtual   #106 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   73  135:pop             
				return;
	//   74  136:return          
			}
		}
		e(b1.e);
	//   75  137:aload_0         
	//   76  138:aload_2         
	//   77  139:getfield        #112 <Field int ebd$b.e>
	//   78  142:invokespecial   #353 <Method ebd$b e(int)>
	//   79  145:pop             
		b1.c = 0;
	//   80  146:aload_2         
	//   81  147:iconst_0        
	//   82  148:putfield        #190 <Field int ebd$b.c>
		if(i != 0)
	//*  83  151:iload_3         
	//*  84  152:ifeq            161
			c(b1, i);
	//   85  155:aload_0         
	//   86  156:aload_2         
	//   87  157:iload_3         
	//   88  158:invokespecial   #124 <Method void c(ebd$b, int)>
		if(b1.g != null)
	//*  89  161:aload_2         
	//*  90  162:getfield        #110 <Field ebe ebd$b.g>
	//*  91  165:ifnull          182
			b1.g.a(b1.e, i);
	//   92  168:aload_2         
	//   93  169:getfield        #110 <Field ebe ebd$b.g>
	//   94  172:aload_2         
	//   95  173:getfield        #112 <Field int ebd$b.e>
	//   96  176:iload_3         
	//   97  177:invokeinterface #388 <Method void ebe.a(int, int)>
		b1.g = null;
	//   98  182:aload_2         
	//   99  183:aconst_null     
	//  100  184:putfield        #110 <Field ebe ebd$b.g>
	//  101  187:return          
	}

	static void e(Handler handler, b b1, String s)
	{
		b(handler, b1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #390 <Method void b(Handler, ebd$b, String)>
	//    4    6:return          
	}

	static void e(ebd ebd1, Handler handler, a a1, boolean flag)
	{
		ebd1.e(handler, a1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #392 <Method void e(Handler, ebd$a, boolean)>
	//    5    7:return          
	}

	static void e(ebd ebd1, Handler handler, b b1, boolean flag)
	{
		ebd1.a(handler, b1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #395 <Method void a(Handler, ebd$b, boolean)>
	//    5    7:return          
	}

	static void e(ebd ebd1, a a1)
	{
		ebd1.b(a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #398 <Method void b(ebd$a)>
	//    3    5:return          
	}

	public int a(String s, int i, ebe ebe1, ebh ebh1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #404 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
		{
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		} else
		{
			ArrayList arraylist = new ArrayList(1);
	//    5    9:new             #406 <Class ArrayList>
	//    6   12:dup             
	//    7   13:iconst_1        
	//    8   14:invokespecial   #408 <Method void ArrayList(int)>
	//    9   17:astore          5
			((List) (arraylist)).add(((Object) (s)));
	//   10   19:aload           5
	//   11   21:aload_1         
	//   12   22:invokeinterface #411 <Method boolean List.add(Object)>
	//   13   27:pop             
			return c(((List) (arraylist)), i, ebe1, ebh1);
	//   14   28:aload_0         
	//   15   29:aload           5
	//   16   31:iload_2         
	//   17   32:aload_3         
	//   18   33:aload           4
	//   19   35:invokevirtual   #414 <Method int c(List, int, ebe, ebh)>
	//   20   38:ireturn         
		}
	}

	public String a()
	{
		return a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field eap a>
	//    2    4:invokevirtual   #306 <Method String eap.a()>
	//    3    7:areturn         
	}

	public int c(List list, int i, ebe ebe1, ebh ebh1)
	{
		if(list == null || list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #184 <Method boolean List.isEmpty()>
	//*   4   10:ifeq            15
			return -1;
	//    5   13:iconst_m1       
	//    6   14:ireturn         
		b b1 = new b(((_cls5) (null)));
	//    7   15:new             #8   <Class ebd$b>
	//    8   18:dup             
	//    9   19:aconst_null     
	//   10   20:invokespecial   #415 <Method void ebd$b(ebd$5)>
	//   11   23:astore          6
		b1.d = list.subList(0, list.size());
	//   12   25:aload           6
	//   13   27:aload_1         
	//   14   28:iconst_0        
	//   15   29:aload_1         
	//   16   30:invokeinterface #280 <Method int List.size()>
	//   17   35:invokeinterface #419 <Method List List.subList(int, int)>
	//   18   40:putfield        #133 <Field List ebd$b.d>
		b1.c = 1;
	//   19   43:aload           6
	//   20   45:iconst_1        
	//   21   46:putfield        #190 <Field int ebd$b.c>
		boolean flag;
		if(i <= 0)
	//*  22   49:iload_2         
	//*  23   50:ifgt            59
			flag = true;
	//   24   53:iconst_1        
	//   25   54:istore          5
		else
	//*  26   56:goto            62
			flag = false;
	//   27   59:iconst_0        
	//   28   60:istore          5
		b1.b = flag;
	//   29   62:aload           6
	//   30   64:iload           5
	//   31   66:putfield        #375 <Field boolean ebd$b.b>
		if(i <= 0)
	//*  32   69:iload_2         
	//*  33   70:ifle            76
	//*  34   73:goto            80
			i = 10000;
	//   35   76:sipush          10000
	//   36   79:istore_2        
		b1.a = i;
	//   37   80:aload           6
	//   38   82:iload_2         
	//   39   83:putfield        #100 <Field int ebd$b.a>
		b1.g = ebe1;
	//   40   86:aload           6
	//   41   88:aload_3         
	//   42   89:putfield        #110 <Field ebe ebd$b.g>
		b1.k = ebh1;
	//   43   92:aload           6
	//   44   94:aload           4
	//   45   96:putfield        #215 <Field ebh ebd$b.k>
		i = d(b1);
	//   46   99:aload_0         
	//   47  100:aload           6
	//   48  102:invokespecial   #421 <Method int d(ebd$b)>
	//   49  105:istore_2        
		ebh1 = null;
	//   50  106:aconst_null     
	//   51  107:astore          4
		ebe1 = ((ebe) (ebh1));
	//   52  109:aload           4
	//   53  111:astore_3        
		if(eap.e.a == a.b())
	//*  54  112:getstatic       #426 <Field eap$e eap$e.a>
	//*  55  115:aload_0         
	//*  56  116:getfield        #56  <Field eap a>
	//*  57  119:invokevirtual   #304 <Method eap$e eap.b()>
	//*  58  122:if_acmpne       148
		{
			ebe1 = ((ebe) (ebh1));
	//   59  125:aload           4
	//   60  127:astore_3        
			if(ebl.b((String)list.get(0)))
	//*  61  128:aload_1         
	//*  62  129:iconst_0        
	//*  63  130:invokeinterface #286 <Method Object List.get(int)>
	//*  64  135:checkcast       #147 <Class String>
	//*  65  138:invokestatic    #430 <Method boolean ebl.b(String)>
	//*  66  141:ifeq            148
				ebe1 = "type=second";
	//   67  144:ldc2            #432 <String "type=second">
	//   68  147:astore_3        
		}
		b(d, b1, ((String) (ebe1)));
	//   69  148:aload_0         
	//   70  149:getfield        #51  <Field Handler d>
	//   71  152:aload           6
	//   72  154:aload_3         
	//   73  155:invokestatic    #390 <Method void b(Handler, ebd$b, String)>
		return i;
	//   74  158:iload_2         
	//   75  159:ireturn         
	}

	public File e(String s)
	{
		String s1;
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #404 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		s1 = d(s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #71  <Method String d(String)>
	//    8   14:astore_2        
		HashMap hashmap = c;
	//    9   15:aload_0         
	//   10   16:getfield        #38  <Field HashMap c>
	//   11   19:astore_3        
		hashmap;
	//   12   20:aload_3         
		JVM INSTR monitorenter ;
	//   13   21:monitorenter    
		File file = (File)c.get(((Object) (s1)));
	//   14   22:aload_0         
	//   15   23:getfield        #38  <Field HashMap c>
	//   16   26:aload_2         
	//   17   27:invokevirtual   #436 <Method Object HashMap.get(Object)>
	//   18   30:checkcast       #62  <Class File>
	//   19   33:astore          4
		hashmap;
	//   20   35:aload_3         
		JVM INSTR monitorexit ;
	//   21   36:monitorexit     
		  goto _L1
	//*  22   37:goto            45
		s;
	//   23   40:astore_1        
	//*  24   41:aload_3         
		throw s;
	//   25   42:monitorexit     
	//   26   43:aload_1         
	//   27   44:athrow          
_L1:
		if(file == null)
	//*  28   45:aload           4
	//*  29   47:ifnonnull       56
			return a(s);
	//   30   50:aload_0         
	//   31   51:aload_1         
	//   32   52:invokespecial   #346 <Method File a(String)>
	//   33   55:areturn         
		if(file.exists())
	//*  34   56:aload           4
	//*  35   58:invokevirtual   #69  <Method boolean File.exists()>
	//*  36   61:ifeq            67
			return file;
	//   37   64:aload           4
	//   38   66:areturn         
		s = ((String) (c));
	//   39   67:aload_0         
	//   40   68:getfield        #38  <Field HashMap c>
	//   41   71:astore_1        
		s;
	//   42   72:aload_1         
		JVM INSTR monitorenter ;
	//   43   73:monitorenter    
		c.remove(((Object) (s1)));
	//   44   74:aload_0         
	//   45   75:getfield        #38  <Field HashMap c>
	//   46   78:aload_2         
	//   47   79:invokevirtual   #359 <Method Object HashMap.remove(Object)>
	//   48   82:pop             
		s;
	//   49   83:aload_1         
		JVM INSTR monitorexit ;
	//   50   84:monitorexit     
		  goto _L2
	//*  51   85:goto            93
		Exception exception;
		exception;
	//   52   88:astore_2        
	//*  53   89:aload_1         
		throw exception;
	//   54   90:monitorexit     
	//   55   91:aload_2         
	//   56   92:athrow          
_L2:
		return null;
	//   57   93:aconst_null     
	//   58   94:areturn         
	}

	private static int b = 0;
	private final eap a;
	private final HashMap c;
	private Handler d;
	private final HashMap e;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #23  <Field int b>
	//*   2    4:return          
	}

	/* member class not found */
	class _cls4 {}


	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls5 {}


	/* member class not found */
	class _cls3 {}


	/* member class not found */
	class _cls2 {}

}
