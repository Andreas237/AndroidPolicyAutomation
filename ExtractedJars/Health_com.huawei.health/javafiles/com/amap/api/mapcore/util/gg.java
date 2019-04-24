// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.amap.api.mapcore.util:
//			jj, gf, gn, ji, 
//			gw, gi

public abstract class gg extends jj
{

	public gg(Context context, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void jj()>
		b = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #23  <Field int b>
		e = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #25  <Field boolean e>
		a(context, obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #27  <Method void a(Context, Object)>
	//   12   20:return          
	}

	private Object a(byte abyte0[])
		throws gf
	{
		return b(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method Object b(byte[])>
	//    3    5:areturn         
	}

	private void a(Context context, Object obj)
	{
		c = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field Context c>
		a = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #41  <Field Object a>
		b = 1;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #23  <Field int b>
		b(30000);
	//    9   15:aload_0         
	//   10   16:sipush          30000
	//   11   19:invokevirtual   #44  <Method void b(int)>
		a(30000);
	//   12   22:aload_0         
	//   13   23:sipush          30000
	//   14   26:invokevirtual   #46  <Method void a(int)>
	//   15   29:return          
	}

	private Object f()
		throws gf
	{
		int i;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
_L2:
		if(i >= b)
			break MISSING_BLOCK_LABEL_281;
	//    4    4:iload_1         
	//    5    5:aload_0         
	//    6    6:getfield        #23  <Field int b>
	//    7    9:icmpge          281
		Object obj1 = obj;
	//    8   12:aload_3         
	//    9   13:astore          4
		Object obj2 = obj;
	//   10   15:aload_3         
	//   11   16:astore          5
		int j;
		ji ji1;
		try
		{
			ji1 = ji.a(false);
	//   12   18:iconst_0        
	//   13   19:invokestatic    #59  <Method ji ji.a(boolean)>
	//   14   22:astore          6
		}
	//*  15   24:aload_3         
	//*  16   25:astore          4
	//*  17   27:aload_3         
	//*  18   28:astore          5
	//*  19   30:aload_0         
	//*  20   31:aload_0         
	//*  21   32:getfield        #39  <Field Context c>
	//*  22   35:invokestatic    #64  <Method java.net.Proxy gw.a(Context)>
	//*  23   38:invokevirtual   #67  <Method void a(java.net.Proxy)>
	//*  24   41:aload_3         
	//*  25   42:astore          4
	//*  26   44:aload_3         
	//*  27   45:astore          5
	//*  28   47:aload_0         
	//*  29   48:aload_0         
	//*  30   49:iconst_1        
	//*  31   50:aload           6
	//*  32   52:aload_0         
	//*  33   53:invokevirtual   #70  <Method byte[] a(int, ji, jj)>
	//*  34   56:invokespecial   #72  <Method Object a(byte[])>
	//*  35   59:astore_3        
	//*  36   60:aload_3         
	//*  37   61:astore          4
	//*  38   63:aload_3         
	//*  39   64:astore          5
	//*  40   66:aload_0         
	//*  41   67:getfield        #23  <Field int b>
	//*  42   70:istore_2        
	//*  43   71:iload_2         
	//*  44   72:istore_1        
	//*  45   73:goto            4
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  46   76:astore_3        
		{
			i++;
	//   47   77:iload_1         
	//   48   78:iconst_1        
	//   49   79:iadd            
	//   50   80:istore_1        
			if(i < b)
	//*  51   81:iload_1         
	//*  52   82:aload_0         
	//*  53   83:getfield        #23  <Field int b>
	//*  54   86:icmpge          158
			{
				try
				{
					Thread.sleep(1000L);
	//   55   89:ldc2w           #73  <Long 1000L>
	//   56   92:invokestatic    #80  <Method void Thread.sleep(long)>
				}
	//*  57   95:goto            233
				// Misplaced declaration of an exception variable
				catch(Object obj1)
	//*  58   98:astore          4
				{
					if("http\u8FDE\u63A5\u5931\u8D25 - ConnectionException".equals(((Object) (((gn) (obj)).getMessage()))) || "socket \u8FDE\u63A5\u5F02\u5E38 - SocketException".equals(((Object) (((gn) (obj)).getMessage()))) || "\u670D\u52A1\u5668\u8FDE\u63A5\u5931\u8D25 - UnknownServiceException".equals(((Object) (((gn) (obj)).getMessage()))))
	//*  59  100:ldc1            #82  <String "http\u8FDE\u63A5\u5931\u8D25 - ConnectionException">
	//*  60  102:aload_3         
	//*  61  103:invokevirtual   #86  <Method String gn.getMessage()>
	//*  62  106:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  63  109:ifne            136
	//*  64  112:ldc1            #94  <String "socket \u8FDE\u63A5\u5F02\u5E38 - SocketException">
	//*  65  114:aload_3         
	//*  66  115:invokevirtual   #86  <Method String gn.getMessage()>
	//*  67  118:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  68  121:ifne            136
	//*  69  124:ldc1            #96  <String "\u670D\u52A1\u5668\u8FDE\u63A5\u5931\u8D25 - UnknownServiceException">
	//*  70  126:aload_3         
	//*  71  127:invokevirtual   #86  <Method String gn.getMessage()>
	//*  72  130:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  73  133:ifeq            146
						throw new gf("http\u6216socket\u8FDE\u63A5\u5931\u8D25 - ConnectionException");
	//   74  136:new             #33  <Class gf>
	//   75  139:dup             
	//   76  140:ldc1            #98  <String "http\u6216socket\u8FDE\u63A5\u5931\u8D25 - ConnectionException">
	//   77  142:invokespecial   #101 <Method void gf(String)>
	//   78  145:athrow          
					else
						throw new gf(((gn) (obj)).a());
	//   79  146:new             #33  <Class gf>
	//   80  149:dup             
	//   81  150:aload_3         
	//   82  151:invokevirtual   #103 <Method String gn.a()>
	//   83  154:invokespecial   #101 <Method void gf(String)>
	//   84  157:athrow          
				}
			} else
			{
				e();
	//   85  158:aload_0         
	//   86  159:invokevirtual   #105 <Method Object e()>
	//   87  162:pop             
				if("http\u8FDE\u63A5\u5931\u8D25 - ConnectionException".equals(((Object) (((gn) (obj)).getMessage()))) || "socket \u8FDE\u63A5\u5F02\u5E38 - SocketException".equals(((Object) (((gn) (obj)).getMessage()))) || "\u672A\u77E5\u7684\u9519\u8BEF".equals(((Object) (((gn) (obj)).a()))) || "\u670D\u52A1\u5668\u8FDE\u63A5\u5931\u8D25 - UnknownServiceException".equals(((Object) (((gn) (obj)).getMessage()))))
	//*  88  163:ldc1            #82  <String "http\u8FDE\u63A5\u5931\u8D25 - ConnectionException">
	//*  89  165:aload_3         
	//*  90  166:invokevirtual   #86  <Method String gn.getMessage()>
	//*  91  169:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  92  172:ifne            211
	//*  93  175:ldc1            #94  <String "socket \u8FDE\u63A5\u5F02\u5E38 - SocketException">
	//*  94  177:aload_3         
	//*  95  178:invokevirtual   #86  <Method String gn.getMessage()>
	//*  96  181:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  97  184:ifne            211
	//*  98  187:ldc1            #107 <String "\u672A\u77E5\u7684\u9519\u8BEF">
	//*  99  189:aload_3         
	//* 100  190:invokevirtual   #103 <Method String gn.a()>
	//* 101  193:invokevirtual   #92  <Method boolean String.equals(Object)>
	//* 102  196:ifne            211
	//* 103  199:ldc1            #96  <String "\u670D\u52A1\u5668\u8FDE\u63A5\u5931\u8D25 - UnknownServiceException">
	//* 104  201:aload_3         
	//* 105  202:invokevirtual   #86  <Method String gn.getMessage()>
	//* 106  205:invokevirtual   #92  <Method boolean String.equals(Object)>
	//* 107  208:ifeq            221
					throw new gf("http\u6216socket\u8FDE\u63A5\u5931\u8D25 - ConnectionException");
	//  108  211:new             #33  <Class gf>
	//  109  214:dup             
	//  110  215:ldc1            #98  <String "http\u6216socket\u8FDE\u63A5\u5931\u8D25 - ConnectionException">
	//  111  217:invokespecial   #101 <Method void gf(String)>
	//  112  220:athrow          
				else
					throw new gf(((gn) (obj)).a());
	//  113  221:new             #33  <Class gf>
	//  114  224:dup             
	//  115  225:aload_3         
	//  116  226:invokevirtual   #103 <Method String gn.a()>
	//  117  229:invokespecial   #101 <Method void gf(String)>
	//  118  232:athrow          
			}
			obj = obj1;
	//  119  233:aload           4
	//  120  235:astore_3        
			continue; /* Loop/switch isn't completed */
	//  121  236:goto            4
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 122  239:astore_3        
		{
			i++;
	//  123  240:iload_1         
	//  124  241:iconst_1        
	//  125  242:iadd            
	//  126  243:istore_1        
			if(i >= b)
	//* 127  244:iload_1         
	//* 128  245:aload_0         
	//* 129  246:getfield        #23  <Field int b>
	//* 130  249:icmplt          264
				throw new gf(((gf) (obj)).a());
	//  131  252:new             #33  <Class gf>
	//  132  255:dup             
	//  133  256:aload_3         
	//  134  257:invokevirtual   #108 <Method String gf.a()>
	//  135  260:invokespecial   #101 <Method void gf(String)>
	//  136  263:athrow          
			obj = obj2;
	//  137  264:aload           5
	//  138  266:astore_3        
			continue; /* Loop/switch isn't completed */
	//  139  267:goto            4
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 140  270:astore_3        
		{
			throw new gf("\u672A\u77E5\u9519\u8BEF");
	//  141  271:new             #33  <Class gf>
	//  142  274:dup             
	//  143  275:ldc1            #110 <String "\u672A\u77E5\u9519\u8BEF">
	//  144  277:invokespecial   #101 <Method void gf(String)>
	//  145  280:athrow          
		}
		obj1 = obj;
		obj2 = obj;
		a(gw.a(c));
		obj1 = obj;
		obj2 = obj;
		obj = a(a(1, ji1, ((jj) (this))));
		obj1 = obj;
		obj2 = obj;
		j = b;
		i = j;
		continue; /* Loop/switch isn't completed */
		return obj;
	//  146  281:aload_3         
	//  147  282:areturn         
		if(true) goto _L2; else goto _L1
_L1:
	}

	public Map a()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected byte[] a(int i, ji ji1, jj jj1)
		throws gn
	{
		byte abyte0[] = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(i == 1)
	//*   2    3:iload_1         
	//*   3    4:iconst_1        
	//*   4    5:icmpne          27
			if(e)
	//*   5    8:aload_0         
	//*   6    9:getfield        #25  <Field boolean e>
	//*   7   12:ifeq            21
				return ji1.b(jj1);
	//    8   15:aload_2         
	//    9   16:aload_3         
	//   10   17:invokevirtual   #116 <Method byte[] ji.b(jj)>
	//   11   20:areturn         
			else
				return ji1.d(jj1);
	//   12   21:aload_2         
	//   13   22:aload_3         
	//   14   23:invokevirtual   #118 <Method byte[] ji.d(jj)>
	//   15   26:areturn         
		if(i == 2)
	//*  16   27:iload_1         
	//*  17   28:iconst_2        
	//*  18   29:icmpne          52
		{
			if(e)
	//*  19   32:aload_0         
	//*  20   33:getfield        #25  <Field boolean e>
	//*  21   36:ifeq            45
				return ji1.a(jj1);
	//   22   39:aload_2         
	//   23   40:aload_3         
	//   24   41:invokevirtual   #120 <Method byte[] ji.a(jj)>
	//   25   44:areturn         
			abyte0 = ji1.e(jj1);
	//   26   45:aload_2         
	//   27   46:aload_3         
	//   28   47:invokevirtual   #122 <Method byte[] ji.e(jj)>
	//   29   50:astore          4
		}
		return abyte0;
	//   30   52:aload           4
	//   31   54:areturn         
	}

	protected abstract Object b(String s)
		throws gf;

	protected Object b(byte abyte0[])
		throws gf
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		try
		{
			abyte0 = ((byte []) (new String(abyte0, "utf-8")));
	//    2    2:new             #88  <Class String>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:ldc1            #127 <String "utf-8">
	//    6    9:invokespecial   #130 <Method void String(byte[], String)>
	//    7   12:astore_1        
		}
	//*   8   13:goto            23
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   9   16:astore_1        
		{
			((Exception) (abyte0)).printStackTrace();
	//   10   17:aload_1         
	//   11   18:invokevirtual   #133 <Method void Exception.printStackTrace()>
			abyte0 = ((byte []) (obj));
	//   12   21:aload_2         
	//   13   22:astore_1        
		}
		if(abyte0 == null || "".equals(((Object) (abyte0))))
	//*  14   23:aload_1         
	//*  15   24:ifnull          36
	//*  16   27:ldc1            #135 <String "">
	//*  17   29:aload_1         
	//*  18   30:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  19   33:ifeq            38
		{
			return ((Object) (null));
	//   20   36:aconst_null     
	//   21   37:areturn         
		} else
		{
			gi.a(((String) (abyte0)), d);
	//   22   38:aload_1         
	//   23   39:aload_0         
	//   24   40:getfield        #137 <Field String d>
	//   25   43:invokestatic    #142 <Method void gi.a(String, String)>
			return b(((String) (abyte0)));
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:invokevirtual   #144 <Method Object b(String)>
	//   29   51:areturn         
		}
	}

	public Map b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object d()
		throws gf
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object a>
	//*   2    4:ifnull          12
			return f();
	//    3    7:aload_0         
	//    4    8:invokespecial   #146 <Method Object f()>
	//    5   11:areturn         
		else
			return ((Object) (null));
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	protected Object e()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected Object a;
	protected int b;
	protected Context c;
	protected String d;
	protected boolean e;
}
