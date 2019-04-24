// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.AMapException;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.amap.api.mapcore.util:
//			bt, ce, cf, jg, 
//			bu, bz, gq, fd, 
//			hm, cb, l

public class by
	implements jg.a
{
	public static interface a
	{

		public abstract void c();
	}


	public by(bz bz1, String s, Context context, ce ce1)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #40  <Field bz a>
		b = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #42  <Field long b>
		c = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #44  <Field long c>
		e = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #46  <Field boolean e>
		g = 0L;
	//   14   24:aload_0         
	//   15   25:lconst_0        
	//   16   26:putfield        #48  <Field long g>
		f = bt.a(context.getApplicationContext());
	//   17   29:aload_0         
	//   18   30:aload_3         
	//   19   31:invokevirtual   #54  <Method Context Context.getApplicationContext()>
	//   20   34:invokestatic    #59  <Method bt bt.a(Context)>
	//   21   37:putfield        #61  <Field bt f>
		a = bz1;
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:putfield        #40  <Field bz a>
		i = context;
	//   25   45:aload_0         
	//   26   46:aload_3         
	//   27   47:putfield        #63  <Field Context i>
		k = s;
	//   28   50:aload_0         
	//   29   51:aload_2         
	//   30   52:putfield        #65  <Field String k>
		j = ce1;
	//   31   55:aload_0         
	//   32   56:aload           4
	//   33   58:putfield        #67  <Field ce j>
		g();
	//   34   61:aload_0         
	//   35   62:invokespecial   #69  <Method void g()>
	//   36   65:return          
	}

	private void a(int i1)
	{
	//    0    0:return          
	}

	private void a(long l1)
	{
		if(d > 0L && j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field long d>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifle            37
	//*   5    9:aload_0         
	//*   6   10:getfield        #67  <Field ce j>
	//*   7   13:ifnull          37
		{
			j.a(d, l1);
	//    8   16:aload_0         
	//    9   17:getfield        #67  <Field ce j>
	//   10   20:aload_0         
	//   11   21:getfield        #75  <Field long d>
	//   12   24:lload_1         
	//   13   25:invokeinterface #80  <Method void ce.a(long, long)>
			g = System.currentTimeMillis();
	//   14   30:aload_0         
	//   15   31:invokestatic    #86  <Method long System.currentTimeMillis()>
	//   16   34:putfield        #48  <Field long g>
		}
	//   17   37:return          
	}

	private void f()
		throws IOException
	{
		cf cf1 = new cf(k);
	//    0    0:new             #88  <Class cf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field String k>
	//    4    8:invokespecial   #91  <Method void cf(String)>
	//    5   11:astore_1        
		cf1.a(0x1b7740);
	//    6   12:aload_1         
	//    7   13:ldc1            #92  <Int 0x1b7740>
	//    8   15:invokevirtual   #94  <Method void cf.a(int)>
		cf1.b(0x1b7740);
	//    9   18:aload_1         
	//   10   19:ldc1            #92  <Int 0x1b7740>
	//   11   21:invokevirtual   #96  <Method void cf.b(int)>
		l = new jg(((jj) (cf1)), b, c);
	//   12   24:aload_0         
	//   13   25:new             #98  <Class jg>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #42  <Field long b>
	//   18   34:aload_0         
	//   19   35:getfield        #44  <Field long c>
	//   20   38:invokespecial   #101 <Method void jg(jj, long, long)>
	//   21   41:putfield        #103 <Field jg l>
		m = new bu((new StringBuilder()).append(a.b()).append(File.separator).append(a.c()).toString(), b);
	//   22   44:aload_0         
	//   23   45:new             #105 <Class bu>
	//   24   48:dup             
	//   25   49:new             #107 <Class StringBuilder>
	//   26   52:dup             
	//   27   53:invokespecial   #108 <Method void StringBuilder()>
	//   28   56:aload_0         
	//   29   57:getfield        #40  <Field bz a>
	//   30   60:invokevirtual   #113 <Method String bz.b()>
	//   31   63:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:getstatic       #122 <Field String File.separator>
	//   33   69:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   34   72:aload_0         
	//   35   73:getfield        #40  <Field bz a>
	//   36   76:invokevirtual   #124 <Method String bz.c()>
	//   37   79:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   38   82:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   39   85:aload_0         
	//   40   86:getfield        #42  <Field long b>
	//   41   89:invokespecial   #130 <Method void bu(String, long)>
	//   42   92:putfield        #132 <Field bu m>
	//   43   95:return          
	}

	private void g()
	{
		File file = new File((new StringBuilder()).append(a.b()).append(a.c()).toString());
	//    0    0:new             #119 <Class File>
	//    1    3:dup             
	//    2    4:new             #107 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #108 <Method void StringBuilder()>
	//    5   11:aload_0         
	//    6   12:getfield        #40  <Field bz a>
	//    7   15:invokevirtual   #113 <Method String bz.b()>
	//    8   18:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_0         
	//   10   22:getfield        #40  <Field bz a>
	//   11   25:invokevirtual   #124 <Method String bz.c()>
	//   12   28:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   14   34:invokespecial   #133 <Method void File(String)>
	//   15   37:astore_1        
		if(file.exists())
	//*  16   38:aload_1         
	//*  17   39:invokevirtual   #137 <Method boolean File.exists()>
	//*  18   42:ifeq            96
		{
			e = false;
	//   19   45:aload_0         
	//   20   46:iconst_0        
	//   21   47:putfield        #46  <Field boolean e>
			b = file.length();
	//   22   50:aload_0         
	//   23   51:aload_1         
	//   24   52:invokevirtual   #140 <Method long File.length()>
	//   25   55:putfield        #42  <Field long b>
			try
			{
				d = b();
	//   26   58:aload_0         
	//   27   59:aload_0         
	//   28   60:invokevirtual   #142 <Method long b()>
	//   29   63:putfield        #75  <Field long d>
				c = d;
	//   30   66:aload_0         
	//   31   67:aload_0         
	//   32   68:getfield        #75  <Field long d>
	//   33   71:putfield        #44  <Field long c>
				return;
	//   34   74:return          
			}
			catch(IOException ioexception) { }
	//   35   75:astore_1        
			if(j != null)
	//*  36   76:aload_0         
	//*  37   77:getfield        #67  <Field ce j>
	//*  38   80:ifnull          95
				j.a(ce.a.c);
	//   39   83:aload_0         
	//   40   84:getfield        #67  <Field ce j>
	//   41   87:getstatic       #147 <Field ce$a ce$a.c>
	//   42   90:invokeinterface #150 <Method void ce.a(ce$a)>
			return;
	//   43   95:return          
		} else
		{
			b = 0L;
	//   44   96:aload_0         
	//   45   97:lconst_0        
	//   46   98:putfield        #42  <Field long b>
			c = 0L;
	//   47  101:aload_0         
	//   48  102:lconst_0        
	//   49  103:putfield        #44  <Field long c>
			return;
	//   50  106:return          
		}
	}

	private boolean h()
	{
		return (new File((new StringBuilder()).append(a.b()).append(File.separator).append(a.c()).toString())).length() >= 10L;
	//    0    0:new             #119 <Class File>
	//    1    3:dup             
	//    2    4:new             #107 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #108 <Method void StringBuilder()>
	//    5   11:aload_0         
	//    6   12:getfield        #40  <Field bz a>
	//    7   15:invokevirtual   #113 <Method String bz.b()>
	//    8   18:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:getstatic       #122 <Field String File.separator>
	//   10   24:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #40  <Field bz a>
	//   13   31:invokevirtual   #124 <Method String bz.c()>
	//   14   34:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   15   37:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   16   40:invokespecial   #133 <Method void File(String)>
	//   17   43:invokevirtual   #140 <Method long File.length()>
	//   18   46:ldc2w           #151 <Long 10L>
	//   19   49:lcmp            
	//   20   50:ifge            55
	//   21   53:iconst_0        
	//   22   54:ireturn         
	//   23   55:iconst_1        
	//   24   56:ireturn         
	}

	private void i()
		throws AMapException
	{
		int i1;
		if(gq.a == 1)
			break MISSING_BLOCK_LABEL_53;
	//    0    0:getstatic       #161 <Field int gq.a>
	//    1    3:iconst_1        
	//    2    4:icmpeq          53
		i1 = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
_L3:
		if(i1 >= 3) goto _L2; else goto _L1
	//    5    9:iload_1         
	//    6   10:iconst_3        
	//    7   11:icmpge          53
_L1:
		boolean flag = gq.a(i, fd.e());
	//    8   14:aload_0         
	//    9   15:getfield        #63  <Field Context i>
	//   10   18:invokestatic    #166 <Method gy fd.e()>
	//   11   21:invokestatic    #169 <Method boolean gq.a(Context, gy)>
	//   12   24:istore_2        
		if(flag)
	//*  13   25:iload_2         
	//*  14   26:ifeq            30
			return;
	//   15   29:return          
		continue; /* Loop/switch isn't completed */
	//   16   30:goto            46
		Throwable throwable;
		throwable;
	//   17   33:astore_3        
		hm.c(throwable, "SiteFileFetch", "authOffLineDownLoad");
	//   18   34:aload_3         
	//   19   35:ldc1            #171 <String "SiteFileFetch">
	//   20   37:ldc1            #173 <String "authOffLineDownLoad">
	//   21   39:invokestatic    #178 <Method void hm.c(Throwable, String, String)>
		throwable.printStackTrace();
	//   22   42:aload_3         
	//   23   43:invokevirtual   #181 <Method void Throwable.printStackTrace()>
		i1++;
	//   24   46:iload_1         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_1        
		  goto _L3
	//*  28   50:goto            9
_L2:
	//   29   53:return          
	}

	private void j()
	{
		long l1 = System.currentTimeMillis();
	//    0    0:invokestatic    #86  <Method long System.currentTimeMillis()>
	//    1    3:lstore_1        
		if(a != null && l1 - g > 500L)
	//*   2    4:aload_0         
	//*   3    5:getfield        #40  <Field bz a>
	//*   4    8:ifnull          41
	//*   5   11:lload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #48  <Field long g>
	//*   8   16:lsub            
	//*   9   17:ldc2w           #182 <Long 500L>
	//*  10   20:lcmp            
	//*  11   21:ifle            41
		{
			k();
	//   12   24:aload_0         
	//   13   25:invokespecial   #185 <Method void k()>
			g = l1;
	//   14   28:aload_0         
	//   15   29:lload_1         
	//   16   30:putfield        #48  <Field long g>
			a(b);
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #42  <Field long b>
	//   20   38:invokespecial   #187 <Method void a(long)>
		}
	//   21   41:return          
	}

	private void k()
	{
		f.a(a.e(), a.d(), d, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field bt f>
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field bz a>
	//    4    8:invokevirtual   #189 <Method String bz.e()>
	//    5   11:aload_0         
	//    6   12:getfield        #40  <Field bz a>
	//    7   15:invokevirtual   #192 <Method int bz.d()>
	//    8   18:aload_0         
	//    9   19:getfield        #75  <Field long d>
	//   10   22:aload_0         
	//   11   23:getfield        #42  <Field long b>
	//   12   26:aload_0         
	//   13   27:getfield        #44  <Field long c>
	//   14   30:invokevirtual   #195 <Method void bt.a(String, int, long, long, long)>
	//   15   33:return          
	}

	public void a()
	{
		if(fd.d(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field Context i>
	//*   2    4:invokestatic    #198 <Method boolean fd.d(Context)>
	//*   3    7:ifeq            17
		{
			i();
	//    4   10:aload_0         
	//    5   11:invokespecial   #200 <Method void i()>
			break MISSING_BLOCK_LABEL_37;
	//    6   14:goto            37
		} else
		{
			try
			{
				if(j != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #67  <Field ce j>
	//*   9   21:ifnull          36
					j.a(ce.a.b);
	//   10   24:aload_0         
	//   11   25:getfield        #67  <Field ce j>
	//   12   28:getstatic       #202 <Field ce$a ce$a.b>
	//   13   31:invokeinterface #150 <Method void ce.a(ce$a)>
				return;
	//   14   36:return          
			}
	//*  15   37:getstatic       #161 <Field int gq.a>
	//*  16   40:iconst_1        
	//*  17   41:icmpeq          64
	//*  18   44:aload_0         
	//*  19   45:getfield        #67  <Field ce j>
	//*  20   48:ifnull          63
	//*  21   51:aload_0         
	//*  22   52:getfield        #67  <Field ce j>
	//*  23   55:getstatic       #204 <Field ce$a ce$a.a>
	//*  24   58:invokeinterface #150 <Method void ce.a(ce$a)>
	//*  25   63:return          
	//*  26   64:aload_0         
	//*  27   65:invokespecial   #206 <Method boolean h()>
	//*  28   68:ifne            76
	//*  29   71:aload_0         
	//*  30   72:iconst_1        
	//*  31   73:putfield        #46  <Field boolean e>
	//*  32   76:aload_0         
	//*  33   77:getfield        #46  <Field boolean e>
	//*  34   80:ifeq            142
	//*  35   83:aload_0         
	//*  36   84:aload_0         
	//*  37   85:invokevirtual   #142 <Method long b()>
	//*  38   88:putfield        #75  <Field long d>
	//*  39   91:aload_0         
	//*  40   92:getfield        #75  <Field long d>
	//*  41   95:ldc2w           #207 <Long -1L>
	//*  42   98:lcmp            
	//*  43   99:ifne            110
	//*  44  102:ldc1            #210 <String "File Length is not known!">
	//*  45  104:invokestatic    #214 <Method void cb.a(String)>
	//*  46  107:goto            137
	//*  47  110:aload_0         
	//*  48  111:getfield        #75  <Field long d>
	//*  49  114:ldc2w           #215 <Long -2L>
	//*  50  117:lcmp            
	//*  51  118:ifne            129
	//*  52  121:ldc1            #218 <String "File is not access!">
	//*  53  123:invokestatic    #214 <Method void cb.a(String)>
	//*  54  126:goto            137
	//*  55  129:aload_0         
	//*  56  130:aload_0         
	//*  57  131:getfield        #75  <Field long d>
	//*  58  134:putfield        #44  <Field long c>
	//*  59  137:aload_0         
	//*  60  138:lconst_0        
	//*  61  139:putfield        #42  <Field long b>
	//*  62  142:aload_0         
	//*  63  143:getfield        #67  <Field ce j>
	//*  64  146:ifnull          158
	//*  65  149:aload_0         
	//*  66  150:getfield        #67  <Field ce j>
	//*  67  153:invokeinterface #221 <Method void ce.n()>
	//*  68  158:aload_0         
	//*  69  159:getfield        #42  <Field long b>
	//*  70  162:aload_0         
	//*  71  163:getfield        #44  <Field long c>
	//*  72  166:lcmp            
	//*  73  167:iflt            177
	//*  74  170:aload_0         
	//*  75  171:invokevirtual   #223 <Method void e()>
	//*  76  174:goto            189
	//*  77  177:aload_0         
	//*  78  178:invokespecial   #225 <Method void f()>
	//*  79  181:aload_0         
	//*  80  182:getfield        #103 <Field jg l>
	//*  81  185:aload_0         
	//*  82  186:invokevirtual   #228 <Method void jg.a(jg$a)>
	//*  83  189:return          
			catch(AMapException amapexception)
	//*  84  190:astore_1        
			{
				hm.c(((Throwable) (amapexception)), "SiteFileFetch", "download");
	//   85  191:aload_1         
	//   86  192:ldc1            #171 <String "SiteFileFetch">
	//   87  194:ldc1            #230 <String "download">
	//   88  196:invokestatic    #178 <Method void hm.c(Throwable, String, String)>
				if(j != null)
	//*  89  199:aload_0         
	//*  90  200:getfield        #67  <Field ce j>
	//*  91  203:ifnull          218
					j.a(ce.a.a);
	//   92  206:aload_0         
	//   93  207:getfield        #67  <Field ce j>
	//   94  210:getstatic       #204 <Field ce$a ce$a.a>
	//   95  213:invokeinterface #150 <Method void ce.a(ce$a)>
				return;
	//   96  218:return          
			}
			catch(IOException ioexception) { }
	//   97  219:astore_1        
			break MISSING_BLOCK_LABEL_220;
		}
		if(gq.a != 1)
		{
			if(j != null)
				j.a(ce.a.a);
			return;
		}
		if(!h())
			e = true;
		if(!e)
			break MISSING_BLOCK_LABEL_142;
		d = b();
		if(d == -1L)
		{
			cb.a("File Length is not known!");
			break MISSING_BLOCK_LABEL_137;
		}
		if(d == -2L)
		{
			cb.a("File is not access!");
			break MISSING_BLOCK_LABEL_137;
		}
		c = d;
		b = 0L;
		if(j != null)
			j.n();
		if(b >= c)
		{
			e();
			break MISSING_BLOCK_LABEL_189;
		}
		f();
		l.a(((jg.a) (this)));
		return;
		if(j != null)
	//*  98  220:aload_0         
	//*  99  221:getfield        #67  <Field ce j>
	//* 100  224:ifnull          239
			j.a(ce.a.c);
	//  101  227:aload_0         
	//  102  228:getfield        #67  <Field ce j>
	//  103  231:getstatic       #147 <Field ce$a ce$a.c>
	//  104  234:invokeinterface #150 <Method void ce.a(ce$a)>
		return;
	//  105  239:return          
	}

	public void a(a a1)
	{
		h = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #233 <Field by$a h>
	//    3    5:return          
	}

	public void a(Throwable throwable)
	{
		if(j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field ce j>
	//*   2    4:ifnull          19
			j.a(ce.a.b);
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field ce j>
	//    5   11:getstatic       #202 <Field ce$a ce$a.b>
	//    6   14:invokeinterface #150 <Method void ce.a(ce$a)>
		if(throwable instanceof IOException)
	//*   7   19:aload_1         
	//*   8   20:instanceof      #35  <Class IOException>
	//*   9   23:ifeq            27
			return;
	//   10   26:return          
		if(m != null)
	//*  11   27:aload_0         
	//*  12   28:getfield        #132 <Field bu m>
	//*  13   31:ifnull          41
			m.a();
	//   14   34:aload_0         
	//   15   35:getfield        #132 <Field bu m>
	//   16   38:invokevirtual   #236 <Method void bu.a()>
	//   17   41:return          
	}

	public void a(byte abyte0[], long l1)
	{
		try
		{
			m.a(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field bu m>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #240 <Method int bu.a(byte[])>
	//    4    8:pop             
		}
	//*   5    9:goto            59
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   6   12:astore_1        
		{
			((IOException) (abyte0)).printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #241 <Method void IOException.printStackTrace()>
			hm.c(((Throwable) (abyte0)), "fileAccessI", "fileAccessI.write(byte[] data)");
	//    9   17:aload_1         
	//   10   18:ldc1            #243 <String "fileAccessI">
	//   11   20:ldc1            #245 <String "fileAccessI.write(byte[] data)">
	//   12   22:invokestatic    #178 <Method void hm.c(Throwable, String, String)>
			if(j != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #67  <Field ce j>
	//*  15   29:ifnull          44
				j.a(ce.a.c);
	//   16   32:aload_0         
	//   17   33:getfield        #67  <Field ce j>
	//   18   36:getstatic       #147 <Field ce$a ce$a.c>
	//   19   39:invokeinterface #150 <Method void ce.a(ce$a)>
			if(l != null)
	//*  20   44:aload_0         
	//*  21   45:getfield        #103 <Field jg l>
	//*  22   48:ifnull          58
				l.a();
	//   23   51:aload_0         
	//   24   52:getfield        #103 <Field jg l>
	//   25   55:invokevirtual   #246 <Method void jg.a()>
			return;
	//   26   58:return          
		}
		b = l1;
	//   27   59:aload_0         
	//   28   60:lload_2         
	//   29   61:putfield        #42  <Field long b>
		j();
	//   30   64:aload_0         
	//   31   65:invokespecial   #248 <Method void j()>
	//   32   68:return          
	}

	public long b()
		throws IOException
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_3        
		HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(a.a())).openConnection();
	//    2    2:new             #250 <Class URL>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field bz a>
	//    6   10:invokevirtual   #252 <Method String bz.a()>
	//    7   13:invokespecial   #253 <Method void URL(String)>
	//    8   16:invokevirtual   #257 <Method java.net.URLConnection URL.openConnection()>
	//    9   19:checkcast       #259 <Class HttpURLConnection>
	//   10   22:astore          4
		httpurlconnection.setRequestProperty("User-Agent", l.c);
	//   11   24:aload           4
	//   12   26:ldc2            #261 <String "User-Agent">
	//   13   29:getstatic       #265 <Field String l.c>
	//   14   32:invokevirtual   #269 <Method void HttpURLConnection.setRequestProperty(String, String)>
		int i1 = httpurlconnection.getResponseCode();
	//   15   35:aload           4
	//   16   37:invokevirtual   #272 <Method int HttpURLConnection.getResponseCode()>
	//   17   40:istore_1        
		if(i1 >= 400)
	//*  18   41:iload_1         
	//*  19   42:sipush          400
	//*  20   45:icmplt          57
		{
			a(i1);
	//   21   48:aload_0         
	//   22   49:iload_1         
	//   23   50:invokespecial   #273 <Method void a(int)>
			return -2L;
	//   24   53:ldc2w           #215 <Long -2L>
	//   25   56:lreturn         
		}
		i1 = 1;
	//   26   57:iconst_1        
	//   27   58:istore_1        
		int j1;
		do
		{
			String s = httpurlconnection.getHeaderFieldKey(i1);
	//   28   59:aload           4
	//   29   61:iload_1         
	//   30   62:invokevirtual   #277 <Method String HttpURLConnection.getHeaderFieldKey(int)>
	//   31   65:astore          5
			j1 = ((int) (byte0));
	//   32   67:iload_3         
	//   33   68:istore_2        
			if(s == null)
				break;
	//   34   69:aload           5
	//   35   71:ifnull          106
			if("Content-Length".equalsIgnoreCase(s))
	//*  36   74:ldc2            #279 <String "Content-Length">
	//*  37   77:aload           5
	//*  38   79:invokevirtual   #285 <Method boolean String.equalsIgnoreCase(String)>
	//*  39   82:ifeq            99
			{
				j1 = Integer.parseInt(httpurlconnection.getHeaderField(s));
	//   40   85:aload           4
	//   41   87:aload           5
	//   42   89:invokevirtual   #289 <Method String HttpURLConnection.getHeaderField(String)>
	//   43   92:invokestatic    #295 <Method int Integer.parseInt(String)>
	//   44   95:istore_2        
				break;
	//   45   96:goto            106
			}
			i1++;
	//   46   99:iload_1         
	//   47  100:iconst_1        
	//   48  101:iadd            
	//   49  102:istore_1        
		} while(true);
	//   50  103:goto            59
		return (long)j1;
	//   51  106:iload_2         
	//   52  107:i2l             
	//   53  108:lreturn         
	}

	public void c()
	{
		if(l != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field jg l>
	//*   2    4:ifnull          14
			l.a();
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field jg l>
	//    5   11:invokevirtual   #246 <Method void jg.a()>
	//    6   14:return          
	}

	public void d()
	{
		if(j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field ce j>
	//*   2    4:ifnull          16
			j.p();
	//    3    7:aload_0         
	//    4    8:getfield        #67  <Field ce j>
	//    5   11:invokeinterface #298 <Method void ce.p()>
		k();
	//    6   16:aload_0         
	//    7   17:invokespecial   #185 <Method void k()>
	//    8   20:return          
	}

	public void e()
	{
		j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #248 <Method void j()>
		if(j != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #67  <Field ce j>
	//*   4    8:ifnull          20
			j.o();
	//    5   11:aload_0         
	//    6   12:getfield        #67  <Field ce j>
	//    7   15:invokeinterface #301 <Method void ce.o()>
		if(m != null)
	//*   8   20:aload_0         
	//*   9   21:getfield        #132 <Field bu m>
	//*  10   24:ifnull          34
			m.a();
	//   11   27:aload_0         
	//   12   28:getfield        #132 <Field bu m>
	//   13   31:invokevirtual   #236 <Method void bu.a()>
		if(h != null)
	//*  14   34:aload_0         
	//*  15   35:getfield        #233 <Field by$a h>
	//*  16   38:ifnull          50
			h.c();
	//   17   41:aload_0         
	//   18   42:getfield        #233 <Field by$a h>
	//   19   45:invokeinterface #303 <Method void by$a.c()>
	//   20   50:return          
	}

	bz a;
	long b;
	long c;
	long d;
	boolean e;
	bt f;
	long g;
	a h;
	private Context i;
	private ce j;
	private String k;
	private jg l;
	private bu m;
}
