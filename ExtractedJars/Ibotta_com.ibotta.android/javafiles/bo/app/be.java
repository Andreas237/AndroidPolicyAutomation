// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package bo.app:
//			bf, bg, bh

public final class be
{
	public final class a
	{

		static bf a(a a1)
		{
			return a1.b;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field bf b>
		//    2    4:areturn         
		}

		static boolean a(a a1, boolean flag)
		{
			a1.d = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #43  <Field boolean d>
			return flag;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

		static boolean[] b(a a1)
		{
			return a1.c;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field boolean[] c>
		//    2    4:areturn         
		}

		public OutputStream a(int i1)
		{
			if(i1 < 0 || i1 >= be.e(a)) goto _L2; else goto _L1
		//    0    0:iload_1         
		//    1    1:iflt            130
		//    2    4:iload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #21  <Field be a>
		//    5    9:invokestatic    #33  <Method int be.e(be)>
		//    6   12:icmpge          130
_L1:
			be be1 = a;
		//    7   15:aload_0         
		//    8   16:getfield        #21  <Field be a>
		//    9   19:astore_3        
			be1;
		//   10   20:aload_3         
			JVM INSTR monitorenter ;
		//   11   21:monitorenter    
			if(b.d != this) goto _L4; else goto _L3
		//   12   22:aload_0         
		//   13   23:getfield        #26  <Field bf b>
		//   14   26:getfield        #50  <Field be$a bf.d>
		//   15   29:aload_0         
		//   16   30:if_acmpne       117
_L3:
			File file;
			if(!b.c)
		//*  17   33:aload_0         
		//*  18   34:getfield        #26  <Field bf b>
		//*  19   37:getfield        #30  <Field boolean bf.c>
		//*  20   40:ifne            50
				c[i1] = true;
		//   21   43:aload_0         
		//   22   44:getfield        #35  <Field boolean[] c>
		//   23   47:iload_1         
		//   24   48:iconst_1        
		//   25   49:bastore         
			file = b.b(i1);
		//   26   50:aload_0         
		//   27   51:getfield        #26  <Field bf b>
		//   28   54:iload_1         
		//   29   55:invokevirtual   #53  <Method File bf.b(int)>
		//   30   58:astore          4
			Object obj = ((Object) (new FileOutputStream(file)));
		//   31   60:new             #55  <Class FileOutputStream>
		//   32   63:dup             
		//   33   64:aload           4
		//   34   66:invokespecial   #58  <Method void FileOutputStream(File)>
		//   35   69:astore_2        
			  goto _L5
		//*  36   70:goto            94
_L6:
			be.f(a).mkdirs();
		//   37   73:aload_0         
		//   38   74:getfield        #21  <Field be a>
		//   39   77:invokestatic    #62  <Method File be.f(be)>
		//   40   80:invokevirtual   #68  <Method boolean File.mkdirs()>
		//   41   83:pop             
			obj = ((Object) (new FileOutputStream(file)));
		//   42   84:new             #55  <Class FileOutputStream>
		//   43   87:dup             
		//   44   88:aload           4
		//   45   90:invokespecial   #58  <Method void FileOutputStream(File)>
		//   46   93:astore_2        
_L5:
			obj = ((Object) (new a(this, ((OutputStream) (obj)))));
		//   47   94:new             #9   <Class be$a$a>
		//   48   97:dup             
		//   49   98:aload_0         
		//   50   99:aload_2         
		//   51  100:aconst_null     
		//   52  101:invokespecial   #71  <Method void be$a$a(be$a, OutputStream, be$1)>
		//   53  104:astore_2        
			be1;
		//   54  105:aload_3         
			JVM INSTR monitorexit ;
		//   55  106:monitorexit     
			return ((OutputStream) (obj));
		//   56  107:aload_2         
		//   57  108:areturn         
_L7:
			obj = ((Object) (be.c()));
		//   58  109:invokestatic    #74  <Method OutputStream be.c()>
		//   59  112:astore_2        
			be1;
		//   60  113:aload_3         
			JVM INSTR monitorexit ;
		//   61  114:monitorexit     
			return ((OutputStream) (obj));
		//   62  115:aload_2         
		//   63  116:areturn         
_L4:
			throw new IllegalStateException();
		//   64  117:new             #76  <Class IllegalStateException>
		//   65  120:dup             
		//   66  121:invokespecial   #77  <Method void IllegalStateException()>
		//   67  124:athrow          
			Object obj1;
			obj1;
		//   68  125:astore_2        
			be1;
		//   69  126:aload_3         
			JVM INSTR monitorexit ;
		//   70  127:monitorexit     
			throw obj1;
		//   71  128:aload_2         
		//   72  129:athrow          
_L2:
			StringBuilder stringbuilder = new StringBuilder();
		//   73  130:new             #79  <Class StringBuilder>
		//   74  133:dup             
		//   75  134:invokespecial   #80  <Method void StringBuilder()>
		//   76  137:astore_2        
			stringbuilder.append("Expected index ");
		//   77  138:aload_2         
		//   78  139:ldc1            #82  <String "Expected index ">
		//   79  141:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
		//   80  144:pop             
			stringbuilder.append(i1);
		//   81  145:aload_2         
		//   82  146:iload_1         
		//   83  147:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
		//   84  150:pop             
			stringbuilder.append(" to be greater than 0 and less than the maximum value count of ");
		//   85  151:aload_2         
		//   86  152:ldc1            #91  <String " to be greater than 0 and less than the maximum value count of ">
		//   87  154:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
		//   88  157:pop             
			stringbuilder.append(be.e(a));
		//   89  158:aload_2         
		//   90  159:aload_0         
		//   91  160:getfield        #21  <Field be a>
		//   92  163:invokestatic    #33  <Method int be.e(be)>
		//   93  166:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
		//   94  169:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
		//   95  170:new             #93  <Class IllegalArgumentException>
		//   96  173:dup             
		//   97  174:aload_2         
		//   98  175:invokevirtual   #97  <Method String StringBuilder.toString()>
		//   99  178:invokespecial   #100 <Method void IllegalArgumentException(String)>
		//  100  181:athrow          
			stringbuilder;
		//  101  182:astore_2        
			  goto _L6
		//* 102  183:goto            73
			stringbuilder;
		//  103  186:astore_2        
			  goto _L7
		//* 104  187:goto            109
		}

		public void a()
		{
			if(d)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field boolean d>
		//*   2    4:ifeq            34
			{
				be.a(a, this, false);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field be a>
		//    5   11:aload_0         
		//    6   12:iconst_0        
		//    7   13:invokestatic    #103 <Method void be.a(be, be$a, boolean)>
				a.c(b.a);
		//    8   16:aload_0         
		//    9   17:getfield        #21  <Field be a>
		//   10   20:aload_0         
		//   11   21:getfield        #26  <Field bf b>
		//   12   24:getfield        #106 <Field String bf.a>
		//   13   27:invokevirtual   #109 <Method boolean be.c(String)>
		//   14   30:pop             
			} else
		//*  15   31:goto            43
			{
				be.a(a, this, true);
		//   16   34:aload_0         
		//   17   35:getfield        #21  <Field be a>
		//   18   38:aload_0         
		//   19   39:iconst_1        
		//   20   40:invokestatic    #103 <Method void be.a(be, be$a, boolean)>
			}
			e = true;
		//   21   43:aload_0         
		//   22   44:iconst_1        
		//   23   45:putfield        #111 <Field boolean e>
		//   24   48:return          
		}

		public void b()
		{
			be.a(a, this, false);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field be a>
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:invokestatic    #103 <Method void be.a(be, be$a, boolean)>
		//    5    9:return          
		}

		final be a;
		private final bf b;
		private final boolean c[];
		private boolean d;
		private boolean e;

		private a(bf bf1)
		{
			a = be.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field be a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			b = bf1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field bf b>
			if(bf1.c)
		//*   8   14:aload_2         
		//*   9   15:getfield        #30  <Field boolean bf.c>
		//*  10   18:ifeq            26
				be1 = null;
		//   11   21:aconst_null     
		//   12   22:astore_1        
			else
		//*  13   23:goto            33
				be1 = ((be) (new boolean[be.e(be.this)]));
		//   14   26:aload_1         
		//   15   27:invokestatic    #33  <Method int be.e(be)>
		//   16   30:newarray        boolean[]
		//   17   32:astore_1        
			c = ((boolean []) (be.this));
		//   18   33:aload_0         
		//   19   34:aload_1         
		//   20   35:putfield        #35  <Field boolean[] c>
		//   21   38:return          
		}

	}

	class a.a extends FilterOutputStream
	{

		public void close()
		{
			IOException ioexception;
			try
			{
				out.close();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field OutputStream out>
		//    2    4:invokevirtual   #33  <Method void OutputStream.close()>
				return;
		//    3    7:return          
			}
		//*   4    8:aload_0         
		//*   5    9:getfield        #14  <Field be$a a>
		//*   6   12:iconst_1        
		//*   7   13:invokestatic    #36  <Method boolean be$a.a(be$a, boolean)>
		//*   8   16:pop             
		//*   9   17:return          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				a.a(a, true);
			}
		//*  10   18:astore_1        
		//*  11   19:goto            8
		}

		public void flush()
		{
			IOException ioexception;
			try
			{
				out.flush();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field OutputStream out>
		//    2    4:invokevirtual   #39  <Method void OutputStream.flush()>
				return;
		//    3    7:return          
			}
		//*   4    8:aload_0         
		//*   5    9:getfield        #14  <Field be$a a>
		//*   6   12:iconst_1        
		//*   7   13:invokestatic    #36  <Method boolean be$a.a(be$a, boolean)>
		//*   8   16:pop             
		//*   9   17:return          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				a.a(a, true);
			}
		//*  10   18:astore_1        
		//*  11   19:goto            8
		}

		public void write(int i1)
		{
			IOException ioexception;
			try
			{
				out.write(i1);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field OutputStream out>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #43  <Method void OutputStream.write(int)>
				return;
		//    4    8:return          
			}
		//*   5    9:aload_0         
		//*   6   10:getfield        #14  <Field be$a a>
		//*   7   13:iconst_1        
		//*   8   14:invokestatic    #36  <Method boolean be$a.a(be$a, boolean)>
		//*   9   17:pop             
		//*  10   18:return          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				a.a(a, true);
			}
		//*  11   19:astore_2        
		//*  12   20:goto            9
		}

		public void write(byte abyte0[], int i1, int j1)
		{
			try
			{
				out.write(abyte0, i1, j1);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field OutputStream out>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #46  <Method void OutputStream.write(byte[], int, int)>
				return;
		//    6   10:return          
			}
		//*   7   11:aload_0         
		//*   8   12:getfield        #14  <Field be$a a>
		//*   9   15:iconst_1        
		//*  10   16:invokestatic    #36  <Method boolean be$a.a(be$a, boolean)>
		//*  11   19:pop             
		//*  12   20:return          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				a.a(a, true);
			}
		//*  13   21:astore_1        
		//*  14   22:goto            11
		}

		final a a;

		private a.a(a a1, OutputStream outputstream)
		{
			a = a1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field be$a a>
			super(outputstream);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #17  <Method void FilterOutputStream(OutputStream)>
		//    6   10:return          
		}

	}

	public final class b
		implements Closeable
	{

		public InputStream a(int i1)
		{
			return d[i1];
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field InputStream[] d>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		public void close()
		{
			InputStream ainputstream[] = d;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field InputStream[] d>
		//    2    4:astore_3        
			int j1 = ainputstream.length;
		//    3    5:aload_3         
		//    4    6:arraylength     
		//    5    7:istore_2        
			for(int i1 = 0; i1 < j1; i1++)
		//*   6    8:iconst_0        
		//*   7    9:istore_1        
		//*   8   10:iload_1         
		//*   9   11:iload_2         
		//*  10   12:icmpge          28
				bh.a(((Closeable) (ainputstream[i1])));
		//   11   15:aload_3         
		//   12   16:iload_1         
		//   13   17:aaload          
		//   14   18:invokestatic    #44  <Method void bh.a(Closeable)>

		//   15   21:iload_1         
		//   16   22:iconst_1        
		//   17   23:iadd            
		//   18   24:istore_1        
		//*  19   25:goto            10
		//   20   28:return          
		}

		final be a;
		private final String b;
		private final long c;
		private final InputStream d[];
		private final long e[];

		private b(String s, long l1, InputStream ainputstream[], long al[])
		{
			a = be.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field be a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			b = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field String b>
			c = l1;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #29  <Field long c>
			d = ainputstream;
		//   11   19:aload_0         
		//   12   20:aload           5
		//   13   22:putfield        #31  <Field InputStream[] d>
			e = al;
		//   14   25:aload_0         
		//   15   26:aload           6
		//   16   28:putfield        #33  <Field long[] e>
		//   17   31:return          
		}

		b(String s, long l1, InputStream ainputstream[], long al[], _cls1 _pcls1)
		{
			this(s, l1, ainputstream, al);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:lload_3         
		//    4    4:aload           5
		//    5    6:aload           6
		//    6    8:invokespecial   #37  <Method void be$b(be, String, long, InputStream[], long[])>
		//    7   11:return          
		}
	}


	private be(File file, int i1, int j1, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
		k = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #73  <Field long k>
	//    5    9:aload_0         
	//    6   10:new             #75  <Class LinkedHashMap>
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:ldc1            #76  <Float 0.75F>
	//   10   17:iconst_1        
	//   11   18:invokespecial   #79  <Method void LinkedHashMap(int, float, boolean)>
	//   12   21:putfield        #81  <Field LinkedHashMap m>
		o = 0L;
	//   13   24:aload_0         
	//   14   25:lconst_0        
	//   15   26:putfield        #83  <Field long o>
		b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())));
	//   16   29:aload_0         
	//   17   30:new             #85  <Class ThreadPoolExecutor>
	//   18   33:dup             
	//   19   34:iconst_0        
	//   20   35:iconst_1        
	//   21   36:ldc2w           #86  <Long 60L>
	//   22   39:getstatic       #93  <Field TimeUnit TimeUnit.SECONDS>
	//   23   42:new             #95  <Class LinkedBlockingQueue>
	//   24   45:dup             
	//   25   46:invokespecial   #96  <Method void LinkedBlockingQueue()>
	//   26   49:invokespecial   #99  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue)>
	//   27   52:putfield        #101 <Field ThreadPoolExecutor b>
	//   28   55:aload_0         
	//   29   56:new             #6   <Class be$1>
	//   30   59:dup             
	//   31   60:aload_0         
	//   32   61:invokespecial   #104 <Method void be$1(be)>
	//   33   64:putfield        #106 <Field Callable p>
		d = file;
	//   34   67:aload_0         
	//   35   68:aload_1         
	//   36   69:putfield        #108 <Field File d>
		h = i1;
	//   37   72:aload_0         
	//   38   73:iload_2         
	//   39   74:putfield        #110 <Field int h>
		e = new File(file, "journal");
	//   40   77:aload_0         
	//   41   78:new             #112 <Class File>
	//   42   81:dup             
	//   43   82:aload_1         
	//   44   83:ldc1            #114 <String "journal">
	//   45   85:invokespecial   #117 <Method void File(File, String)>
	//   46   88:putfield        #119 <Field File e>
		f = new File(file, "journal.tmp");
	//   47   91:aload_0         
	//   48   92:new             #112 <Class File>
	//   49   95:dup             
	//   50   96:aload_1         
	//   51   97:ldc1            #121 <String "journal.tmp">
	//   52   99:invokespecial   #117 <Method void File(File, String)>
	//   53  102:putfield        #123 <Field File f>
		g = new File(file, "journal.bkp");
	//   54  105:aload_0         
	//   55  106:new             #112 <Class File>
	//   56  109:dup             
	//   57  110:aload_1         
	//   58  111:ldc1            #125 <String "journal.bkp">
	//   59  113:invokespecial   #117 <Method void File(File, String)>
	//   60  116:putfield        #127 <Field File g>
		j = j1;
	//   61  119:aload_0         
	//   62  120:iload_3         
	//   63  121:putfield        #129 <Field int j>
		i = l1;
	//   64  124:aload_0         
	//   65  125:lload           4
	//   66  127:putfield        #131 <Field long i>
	//   67  130:return          
	}

	static int a(be be1, int i1)
	{
		be1.n = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #134 <Field int n>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private a a(String s, long l1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		h();
	//    2    2:aload_0         
	//    3    3:invokespecial   #137 <Method void h()>
		e(s);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #140 <Method void e(String)>
		obj = ((Object) ((bf)m.get(((Object) (s)))));
	//    7   11:aload_0         
	//    8   12:getfield        #81  <Field LinkedHashMap m>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #144 <Method Object LinkedHashMap.get(Object)>
	//   11   19:checkcast       #146 <Class bf>
	//   12   22:astore          6
		if(l1 == -1L)
			break MISSING_BLOCK_LABEL_55;
	//   13   24:lload_2         
	//   14   25:ldc2w           #147 <Long -1L>
	//   15   28:lcmp            
	//   16   29:ifeq            55
		if(obj == null)
			break MISSING_BLOCK_LABEL_51;
	//   17   32:aload           6
	//   18   34:ifnull          51
		long l2 = ((bf) (obj)).e;
	//   19   37:aload           6
	//   20   39:getfield        #150 <Field long bf.e>
	//   21   42:lstore          4
		if(l2 == l1)
			break MISSING_BLOCK_LABEL_55;
	//   22   44:lload           4
	//   23   46:lload_2         
	//   24   47:lcmp            
	//   25   48:ifeq            55
		this;
	//   26   51:aload_0         
		JVM INSTR monitorexit ;
	//   27   52:monitorexit     
		return null;
	//   28   53:aconst_null     
	//   29   54:areturn         
		if(obj != null)
			break MISSING_BLOCK_LABEL_92;
	//   30   55:aload           6
	//   31   57:ifnonnull       92
		obj = ((Object) (new bf(s, j, d)));
	//   32   60:new             #146 <Class bf>
	//   33   63:dup             
	//   34   64:aload_1         
	//   35   65:aload_0         
	//   36   66:getfield        #129 <Field int j>
	//   37   69:aload_0         
	//   38   70:getfield        #108 <Field File d>
	//   39   73:invokespecial   #153 <Method void bf(String, int, File)>
	//   40   76:astore          6
		m.put(((Object) (s)), obj);
	//   41   78:aload_0         
	//   42   79:getfield        #81  <Field LinkedHashMap m>
	//   43   82:aload_1         
	//   44   83:aload           6
	//   45   85:invokevirtual   #157 <Method Object LinkedHashMap.put(Object, Object)>
	//   46   88:pop             
		break MISSING_BLOCK_LABEL_108;
	//   47   89:goto            108
		a a1 = ((bf) (obj)).d;
	//   48   92:aload           6
	//   49   94:getfield        #160 <Field be$a bf.d>
	//   50   97:astore          7
		if(a1 == null)
			break MISSING_BLOCK_LABEL_108;
	//   51   99:aload           7
	//   52  101:ifnull          108
		this;
	//   53  104:aload_0         
		JVM INSTR monitorexit ;
	//   54  105:monitorexit     
		return null;
	//   55  106:aconst_null     
	//   56  107:areturn         
		a1 = new a(((bf) (obj)));
	//   57  108:new             #10  <Class be$a>
	//   58  111:dup             
	//   59  112:aload_0         
	//   60  113:aload           6
	//   61  115:aconst_null     
	//   62  116:invokespecial   #163 <Method void be$a(be, bf, be$1)>
	//   63  119:astore          7
		obj.d = a1;
	//   64  121:aload           6
	//   65  123:aload           7
	//   66  125:putfield        #160 <Field be$a bf.d>
		obj = ((Object) (l));
	//   67  128:aload_0         
	//   68  129:getfield        #165 <Field Writer l>
	//   69  132:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//   70  134:new             #167 <Class StringBuilder>
	//   71  137:dup             
	//   72  138:invokespecial   #168 <Method void StringBuilder()>
	//   73  141:astore          8
		stringbuilder.append("DIRTY ");
	//   74  143:aload           8
	//   75  145:ldc1            #170 <String "DIRTY ">
	//   76  147:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   77  150:pop             
		stringbuilder.append(s);
	//   78  151:aload           8
	//   79  153:aload_1         
	//   80  154:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   81  157:pop             
		stringbuilder.append('\n');
	//   82  158:aload           8
	//   83  160:bipush          10
	//   84  162:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//   85  165:pop             
		((Writer) (obj)).write(stringbuilder.toString());
	//   86  166:aload           6
	//   87  168:aload           8
	//   88  170:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   89  173:invokevirtual   #186 <Method void Writer.write(String)>
		l.flush();
	//   90  176:aload_0         
	//   91  177:getfield        #165 <Field Writer l>
	//   92  180:invokevirtual   #189 <Method void Writer.flush()>
		this;
	//   93  183:aload_0         
		JVM INSTR monitorexit ;
	//   94  184:monitorexit     
		return a1;
	//   95  185:aload           7
	//   96  187:areturn         
		s;
	//   97  188:astore_1        
	//*  98  189:aload_0         
		throw s;
	//   99  190:monitorexit     
	//  100  191:aload_1         
	//  101  192:athrow          
	}

	public static be a(File file, int i1, int j1, long l1)
	{
		Object obj;
		if(l1 <= 0L)
			break MISSING_BLOCK_LABEL_211;
	//    0    0:lload_3         
	//    1    1:lconst_0        
	//    2    2:lcmp            
	//    3    3:ifle            211
		if(j1 <= 0)
			break MISSING_BLOCK_LABEL_201;
	//    4    6:iload_2         
	//    5    7:ifle            201
		obj = ((Object) (new File(file, "journal.bkp")));
	//    6   10:new             #112 <Class File>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:ldc1            #125 <String "journal.bkp">
	//   10   17:invokespecial   #117 <Method void File(File, String)>
	//   11   20:astore          5
		if(((File) (obj)).exists())
	//*  12   22:aload           5
	//*  13   24:invokevirtual   #196 <Method boolean File.exists()>
	//*  14   27:ifeq            67
		{
			File file1 = new File(file, "journal");
	//   15   30:new             #112 <Class File>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:ldc1            #114 <String "journal">
	//   19   37:invokespecial   #117 <Method void File(File, String)>
	//   20   40:astore          6
			if(file1.exists())
	//*  21   42:aload           6
	//*  22   44:invokevirtual   #196 <Method boolean File.exists()>
	//*  23   47:ifeq            59
				((File) (obj)).delete();
	//   24   50:aload           5
	//   25   52:invokevirtual   #199 <Method boolean File.delete()>
	//   26   55:pop             
			else
	//*  27   56:goto            67
				a(((File) (obj)), file1, false);
	//   28   59:aload           5
	//   29   61:aload           6
	//   30   63:iconst_0        
	//   31   64:invokestatic    #202 <Method void a(File, File, boolean)>
		}
		obj = ((Object) (new be(file, i1, j1, l1)));
	//   32   67:new             #2   <Class be>
	//   33   70:dup             
	//   34   71:aload_0         
	//   35   72:iload_1         
	//   36   73:iload_2         
	//   37   74:lload_3         
	//   38   75:invokespecial   #204 <Method void be(File, int, int, long)>
	//   39   78:astore          5
		if(!((be) (obj)).e.exists())
			break MISSING_BLOCK_LABEL_178;
	//   40   80:aload           5
	//   41   82:getfield        #119 <Field File e>
	//   42   85:invokevirtual   #196 <Method boolean File.exists()>
	//   43   88:ifeq            178
		((be) (obj)).d();
	//   44   91:aload           5
	//   45   93:invokespecial   #206 <Method void d()>
		((be) (obj)).e();
	//   46   96:aload           5
	//   47   98:invokespecial   #208 <Method void e()>
		return ((be) (obj));
	//   48  101:aload           5
	//   49  103:areturn         
		IOException ioexception;
		ioexception;
	//   50  104:astore          6
		String s = c;
	//   51  106:getstatic       #63  <Field String c>
	//   52  109:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   53  111:new             #167 <Class StringBuilder>
	//   54  114:dup             
	//   55  115:invokespecial   #168 <Method void StringBuilder()>
	//   56  118:astore          8
		stringbuilder.append("DiskLruCache ");
	//   57  120:aload           8
	//   58  122:ldc1            #210 <String "DiskLruCache ">
	//   59  124:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   60  127:pop             
		stringbuilder.append(((Object) (file)));
	//   61  128:aload           8
	//   62  130:aload_0         
	//   63  131:invokevirtual   #213 <Method StringBuilder StringBuilder.append(Object)>
	//   64  134:pop             
		stringbuilder.append(" is corrupt: ");
	//   65  135:aload           8
	//   66  137:ldc1            #215 <String " is corrupt: ">
	//   67  139:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   68  142:pop             
		stringbuilder.append(ioexception.getMessage());
	//   69  143:aload           8
	//   70  145:aload           6
	//   71  147:invokevirtual   #218 <Method String IOException.getMessage()>
	//   72  150:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   73  153:pop             
		stringbuilder.append(", removing");
	//   74  154:aload           8
	//   75  156:ldc1            #220 <String ", removing">
	//   76  158:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   77  161:pop             
		AppboyLogger.e(s, stringbuilder.toString());
	//   78  162:aload           7
	//   79  164:aload           8
	//   80  166:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   81  169:invokestatic    #223 <Method int AppboyLogger.e(String, String)>
	//   82  172:pop             
		((be) (obj)).b();
	//   83  173:aload           5
	//   84  175:invokevirtual   #225 <Method void b()>
		file.mkdirs();
	//   85  178:aload_0         
	//   86  179:invokevirtual   #228 <Method boolean File.mkdirs()>
	//   87  182:pop             
		file = ((File) (new be(file, i1, j1, l1)));
	//   88  183:new             #2   <Class be>
	//   89  186:dup             
	//   90  187:aload_0         
	//   91  188:iload_1         
	//   92  189:iload_2         
	//   93  190:lload_3         
	//   94  191:invokespecial   #204 <Method void be(File, int, int, long)>
	//   95  194:astore_0        
		((be) (file)).f();
	//   96  195:aload_0         
	//   97  196:invokespecial   #230 <Method void f()>
		return ((be) (file));
	//   98  199:aload_0         
	//   99  200:areturn         
		throw new IllegalArgumentException("valueCount <= 0");
	//  100  201:new             #232 <Class IllegalArgumentException>
	//  101  204:dup             
	//  102  205:ldc1            #234 <String "valueCount <= 0">
	//  103  207:invokespecial   #236 <Method void IllegalArgumentException(String)>
	//  104  210:athrow          
		throw new IllegalArgumentException("maxSize <= 0");
	//  105  211:new             #232 <Class IllegalArgumentException>
	//  106  214:dup             
	//  107  215:ldc1            #238 <String "maxSize <= 0">
	//  108  217:invokespecial   #236 <Method void IllegalArgumentException(String)>
	//  109  220:athrow          
	}

	static Writer a(be be1)
	{
		return be1.l;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field Writer l>
	//    2    4:areturn         
	}

	private void a(a a1, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		bf bf1 = a.a(a1);
	//    2    2:aload_1         
	//    3    3:invokestatic    #243 <Method bf be$a.a(be$a)>
	//    4    6:astore          10
		if(bf1.d != a1) goto _L2; else goto _L1
	//    5    8:aload           10
	//    6   10:getfield        #160 <Field be$a bf.d>
	//    7   13:aload_1         
	//    8   14:if_acmpne       448
_L1:
		int j1;
		boolean flag1;
		flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore          5
		j1 = ((int) (flag1));
	//   11   20:iload           5
	//   12   22:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_126;
	//   13   24:iload_2         
	//   14   25:ifeq            126
		j1 = ((int) (flag1));
	//   15   28:iload           5
	//   16   30:istore          4
		if(bf1.c)
			break MISSING_BLOCK_LABEL_126;
	//   17   32:aload           10
	//   18   34:getfield        #246 <Field boolean bf.c>
	//   19   37:ifne            126
		int i1 = 0;
	//   20   40:iconst_0        
	//   21   41:istore_3        
_L4:
		j1 = ((int) (flag1));
	//   22   42:iload           5
	//   23   44:istore          4
		if(i1 >= j)
			break MISSING_BLOCK_LABEL_126;
	//   24   46:iload_3         
	//   25   47:aload_0         
	//   26   48:getfield        #129 <Field int j>
	//   27   51:icmpge          126
		if(!a.b(a1)[i1])
			break; /* Loop/switch isn't completed */
	//   28   54:aload_1         
	//   29   55:invokestatic    #249 <Method boolean[] be$a.b(be$a)>
	//   30   58:iload_3         
	//   31   59:baload          
	//   32   60:ifeq            89
		if(bf1.b(i1).exists())
			break MISSING_BLOCK_LABEL_82;
	//   33   63:aload           10
	//   34   65:iload_3         
	//   35   66:invokevirtual   #252 <Method File bf.b(int)>
	//   36   69:invokevirtual   #196 <Method boolean File.exists()>
	//   37   72:ifne            82
		a1.b();
	//   38   75:aload_1         
	//   39   76:invokevirtual   #253 <Method void be$a.b()>
		this;
	//   40   79:aload_0         
		JVM INSTR monitorexit ;
	//   41   80:monitorexit     
		return;
	//   42   81:return          
		i1++;
	//   43   82:iload_3         
	//   44   83:iconst_1        
	//   45   84:iadd            
	//   46   85:istore_3        
		if(true) goto _L4; else goto _L3
	//   47   86:goto            42
_L3:
		a1.b();
	//   48   89:aload_1         
	//   49   90:invokevirtual   #253 <Method void be$a.b()>
		a1 = ((a) (new StringBuilder()));
	//   50   93:new             #167 <Class StringBuilder>
	//   51   96:dup             
	//   52   97:invokespecial   #168 <Method void StringBuilder()>
	//   53  100:astore_1        
		((StringBuilder) (a1)).append("Newly created entry didn't create value for index ");
	//   54  101:aload_1         
	//   55  102:ldc1            #255 <String "Newly created entry didn't create value for index ">
	//   56  104:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   57  107:pop             
		((StringBuilder) (a1)).append(i1);
	//   58  108:aload_1         
	//   59  109:iload_3         
	//   60  110:invokevirtual   #258 <Method StringBuilder StringBuilder.append(int)>
	//   61  113:pop             
		throw new IllegalStateException(((StringBuilder) (a1)).toString());
	//   62  114:new             #260 <Class IllegalStateException>
	//   63  117:dup             
	//   64  118:aload_1         
	//   65  119:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   66  122:invokespecial   #261 <Method void IllegalStateException(String)>
	//   67  125:athrow          
_L7:
		if(j1 >= j) goto _L6; else goto _L5
	//   68  126:iload           4
	//   69  128:aload_0         
	//   70  129:getfield        #129 <Field int j>
	//   71  132:icmpge          221
_L5:
		a1 = ((a) (bf1.b(j1)));
	//   72  135:aload           10
	//   73  137:iload           4
	//   74  139:invokevirtual   #252 <Method File bf.b(int)>
	//   75  142:astore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_214;
	//   76  143:iload_2         
	//   77  144:ifeq            214
		if(((File) (a1)).exists())
	//*  78  147:aload_1         
	//*  79  148:invokevirtual   #196 <Method boolean File.exists()>
	//*  80  151:ifeq            461
		{
			File file = bf1.a(j1);
	//   81  154:aload           10
	//   82  156:iload           4
	//   83  158:invokevirtual   #263 <Method File bf.a(int)>
	//   84  161:astore          11
			((File) (a1)).renameTo(file);
	//   85  163:aload_1         
	//   86  164:aload           11
	//   87  166:invokevirtual   #267 <Method boolean File.renameTo(File)>
	//   88  169:pop             
			long l1 = bf1.b[j1];
	//   89  170:aload           10
	//   90  172:getfield        #270 <Field long[] bf.b>
	//   91  175:iload           4
	//   92  177:laload          
	//   93  178:lstore          6
			long l3 = file.length();
	//   94  180:aload           11
	//   95  182:invokevirtual   #274 <Method long File.length()>
	//   96  185:lstore          8
			bf1.b[j1] = l3;
	//   97  187:aload           10
	//   98  189:getfield        #270 <Field long[] bf.b>
	//   99  192:iload           4
	//  100  194:lload           8
	//  101  196:lastore         
			k = (k - l1) + l3;
	//  102  197:aload_0         
	//  103  198:aload_0         
	//  104  199:getfield        #73  <Field long k>
	//  105  202:lload           6
	//  106  204:lsub            
	//  107  205:lload           8
	//  108  207:ladd            
	//  109  208:putfield        #73  <Field long k>
		}
		break MISSING_BLOCK_LABEL_461;
	//  110  211:goto            461
		a(((File) (a1)));
	//  111  214:aload_1         
	//  112  215:invokestatic    #277 <Method void a(File)>
		break MISSING_BLOCK_LABEL_461;
	//  113  218:goto            461
_L6:
		n = n + 1;
	//  114  221:aload_0         
	//  115  222:aload_0         
	//  116  223:getfield        #134 <Field int n>
	//  117  226:iconst_1        
	//  118  227:iadd            
	//  119  228:putfield        #134 <Field int n>
		bf1.d = null;
	//  120  231:aload           10
	//  121  233:aconst_null     
	//  122  234:putfield        #160 <Field be$a bf.d>
		if(!(bf1.c | flag))
			break MISSING_BLOCK_LABEL_343;
	//  123  237:aload           10
	//  124  239:getfield        #246 <Field boolean bf.c>
	//  125  242:iload_2         
	//  126  243:ior             
	//  127  244:ifeq            343
		bf1.c = true;
	//  128  247:aload           10
	//  129  249:iconst_1        
	//  130  250:putfield        #246 <Field boolean bf.c>
		a1 = ((a) (l));
	//  131  253:aload_0         
	//  132  254:getfield        #165 <Field Writer l>
	//  133  257:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//  134  258:new             #167 <Class StringBuilder>
	//  135  261:dup             
	//  136  262:invokespecial   #168 <Method void StringBuilder()>
	//  137  265:astore          11
		stringbuilder.append("CLEAN ");
	//  138  267:aload           11
	//  139  269:ldc2            #279 <String "CLEAN ">
	//  140  272:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  141  275:pop             
		stringbuilder.append(bf1.a);
	//  142  276:aload           11
	//  143  278:aload           10
	//  144  280:getfield        #281 <Field String bf.a>
	//  145  283:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  146  286:pop             
		stringbuilder.append(bf1.a());
	//  147  287:aload           11
	//  148  289:aload           10
	//  149  291:invokevirtual   #283 <Method String bf.a()>
	//  150  294:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  151  297:pop             
		stringbuilder.append('\n');
	//  152  298:aload           11
	//  153  300:bipush          10
	//  154  302:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//  155  305:pop             
		((Writer) (a1)).write(stringbuilder.toString());
	//  156  306:aload_1         
	//  157  307:aload           11
	//  158  309:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  159  312:invokevirtual   #186 <Method void Writer.write(String)>
		if(!flag)
			break MISSING_BLOCK_LABEL_407;
	//  160  315:iload_2         
	//  161  316:ifeq            407
		long l2 = o;
	//  162  319:aload_0         
	//  163  320:getfield        #83  <Field long o>
	//  164  323:lstore          6
		o = 1L + l2;
	//  165  325:aload_0         
	//  166  326:lconst_1        
	//  167  327:lload           6
	//  168  329:ladd            
	//  169  330:putfield        #83  <Field long o>
		bf1.e = l2;
	//  170  333:aload           10
	//  171  335:lload           6
	//  172  337:putfield        #150 <Field long bf.e>
		break MISSING_BLOCK_LABEL_407;
	//  173  340:goto            407
		m.remove(((Object) (bf1.a)));
	//  174  343:aload_0         
	//  175  344:getfield        #81  <Field LinkedHashMap m>
	//  176  347:aload           10
	//  177  349:getfield        #281 <Field String bf.a>
	//  178  352:invokevirtual   #286 <Method Object LinkedHashMap.remove(Object)>
	//  179  355:pop             
		a1 = ((a) (l));
	//  180  356:aload_0         
	//  181  357:getfield        #165 <Field Writer l>
	//  182  360:astore_1        
		StringBuilder stringbuilder1 = new StringBuilder();
	//  183  361:new             #167 <Class StringBuilder>
	//  184  364:dup             
	//  185  365:invokespecial   #168 <Method void StringBuilder()>
	//  186  368:astore          11
		stringbuilder1.append("REMOVE ");
	//  187  370:aload           11
	//  188  372:ldc2            #288 <String "REMOVE ">
	//  189  375:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  190  378:pop             
		stringbuilder1.append(bf1.a);
	//  191  379:aload           11
	//  192  381:aload           10
	//  193  383:getfield        #281 <Field String bf.a>
	//  194  386:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  195  389:pop             
		stringbuilder1.append('\n');
	//  196  390:aload           11
	//  197  392:bipush          10
	//  198  394:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//  199  397:pop             
		((Writer) (a1)).write(stringbuilder1.toString());
	//  200  398:aload_1         
	//  201  399:aload           11
	//  202  401:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  203  404:invokevirtual   #186 <Method void Writer.write(String)>
		l.flush();
	//  204  407:aload_0         
	//  205  408:getfield        #165 <Field Writer l>
	//  206  411:invokevirtual   #189 <Method void Writer.flush()>
		if(k > i || g())
	//* 207  414:aload_0         
	//* 208  415:getfield        #73  <Field long k>
	//* 209  418:aload_0         
	//* 210  419:getfield        #131 <Field long i>
	//* 211  422:lcmp            
	//* 212  423:ifgt            433
	//* 213  426:aload_0         
	//* 214  427:invokespecial   #290 <Method boolean g()>
	//* 215  430:ifeq            445
			b.submit(p);
	//  216  433:aload_0         
	//  217  434:getfield        #101 <Field ThreadPoolExecutor b>
	//  218  437:aload_0         
	//  219  438:getfield        #106 <Field Callable p>
	//  220  441:invokevirtual   #294 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//  221  444:pop             
		this;
	//  222  445:aload_0         
		JVM INSTR monitorexit ;
	//  223  446:monitorexit     
		return;
	//  224  447:return          
_L2:
		throw new IllegalStateException();
	//  225  448:new             #260 <Class IllegalStateException>
	//  226  451:dup             
	//  227  452:invokespecial   #295 <Method void IllegalStateException()>
	//  228  455:athrow          
		a1;
	//  229  456:astore_1        
		this;
	//  230  457:aload_0         
		JVM INSTR monitorexit ;
	//  231  458:monitorexit     
		throw a1;
	//  232  459:aload_1         
	//  233  460:athrow          
		j1++;
	//  234  461:iload           4
	//  235  463:iconst_1        
	//  236  464:iadd            
	//  237  465:istore          4
		  goto _L7
	//* 238  467:goto            126
	}

	static void a(be be1, a a1, boolean flag)
	{
		be1.a(a1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #298 <Method void a(be$a, boolean)>
	//    4    6:return          
	}

	private static void a(File file)
	{
		if(file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #196 <Method boolean File.exists()>
	//*   2    4:ifeq            23
		{
			if(file.delete())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #199 <Method boolean File.delete()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			else
				throw new IOException();
	//    7   15:new             #192 <Class IOException>
	//    8   18:dup             
	//    9   19:invokespecial   #299 <Method void IOException()>
	//   10   22:athrow          
		} else
		{
			return;
	//   11   23:return          
		}
	}

	private static void a(File file, File file1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            8
			a(file1);
	//    2    4:aload_1         
	//    3    5:invokestatic    #277 <Method void a(File)>
		if(file.renameTo(file1))
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #267 <Method boolean File.renameTo(File)>
	//*   7   13:ifeq            17
			return;
	//    8   16:return          
		else
			throw new IOException();
	//    9   17:new             #192 <Class IOException>
	//   10   20:dup             
	//   11   21:invokespecial   #299 <Method void IOException()>
	//   12   24:athrow          
	}

	static void b(be be1)
	{
		be1.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #301 <Method void i()>
	//    2    4:return          
	}

	static OutputStream c()
	{
		return q;
	//    0    0:getstatic       #68  <Field OutputStream q>
	//    1    3:areturn         
	}

	static boolean c(be be1)
	{
		return be1.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #290 <Method boolean g()>
	//    2    4:ireturn         
	}

	private void d()
	{
		bg bg1 = new bg(((InputStream) (new FileInputStream(e))), bh.a);
	//    0    0:new             #307 <Class bg>
	//    1    3:dup             
	//    2    4:new             #309 <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #119 <Field File e>
	//    6   12:invokespecial   #311 <Method void FileInputStream(File)>
	//    7   15:getstatic       #316 <Field java.nio.charset.Charset bh.a>
	//    8   18:invokespecial   #319 <Method void bg(InputStream, java.nio.charset.Charset)>
	//    9   21:astore_3        
		String s;
		String s1;
		String s2;
		String s3;
		String s4;
		s = bg1.a();
	//   10   22:aload_3         
	//   11   23:invokevirtual   #320 <Method String bg.a()>
	//   12   26:astore          4
		s1 = bg1.a();
	//   13   28:aload_3         
	//   14   29:invokevirtual   #320 <Method String bg.a()>
	//   15   32:astore          5
		s4 = bg1.a();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #320 <Method String bg.a()>
	//   18   38:astore          8
		s2 = bg1.a();
	//   19   40:aload_3         
	//   20   41:invokevirtual   #320 <Method String bg.a()>
	//   21   44:astore          6
		s3 = bg1.a();
	//   22   46:aload_3         
	//   23   47:invokevirtual   #320 <Method String bg.a()>
	//   24   50:astore          7
		if(!"libcore.io.DiskLruCache".equals(((Object) (s))) || !"1".equals(((Object) (s1))) || !Integer.toString(h).equals(((Object) (s4))) || !Integer.toString(j).equals(((Object) (s2)))) goto _L2; else goto _L1
	//   25   52:ldc2            #322 <String "libcore.io.DiskLruCache">
	//   26   55:aload           4
	//   27   57:invokevirtual   #328 <Method boolean String.equals(Object)>
	//   28   60:ifeq            199
	//   29   63:ldc2            #330 <String "1">
	//   30   66:aload           5
	//   31   68:invokevirtual   #328 <Method boolean String.equals(Object)>
	//   32   71:ifeq            199
	//   33   74:aload_0         
	//   34   75:getfield        #110 <Field int h>
	//   35   78:invokestatic    #335 <Method String Integer.toString(int)>
	//   36   81:aload           8
	//   37   83:invokevirtual   #328 <Method boolean String.equals(Object)>
	//   38   86:ifeq            199
	//   39   89:aload_0         
	//   40   90:getfield        #129 <Field int j>
	//   41   93:invokestatic    #335 <Method String Integer.toString(int)>
	//   42   96:aload           6
	//   43   98:invokevirtual   #328 <Method boolean String.equals(Object)>
	//   44  101:ifeq            199
_L1:
		boolean flag = "".equals(((Object) (s3)));
	//   45  104:ldc2            #337 <String "">
	//   46  107:aload           7
	//   47  109:invokevirtual   #328 <Method boolean String.equals(Object)>
	//   48  112:istore_2        
		if(!flag) goto _L2; else goto _L3
	//   49  113:iload_2         
	//   50  114:ifeq            199
_L3:
		int i1 = 0;
	//   51  117:iconst_0        
	//   52  118:istore_1        
_L5:
		d(bg1.a());
	//   53  119:aload_0         
	//   54  120:aload_3         
	//   55  121:invokevirtual   #320 <Method String bg.a()>
	//   56  124:invokespecial   #339 <Method void d(String)>
		i1++;
	//   57  127:iload_1         
	//   58  128:iconst_1        
	//   59  129:iadd            
	//   60  130:istore_1        
		if(true) goto _L5; else goto _L4
	//   61  131:goto            119
_L4:
		n = i1 - m.size();
	//   62  134:aload_0         
	//   63  135:iload_1         
	//   64  136:aload_0         
	//   65  137:getfield        #81  <Field LinkedHashMap m>
	//   66  140:invokevirtual   #343 <Method int LinkedHashMap.size()>
	//   67  143:isub            
	//   68  144:putfield        #134 <Field int n>
		if(bg1.b())
	//*  69  147:aload_3         
	//*  70  148:invokevirtual   #345 <Method boolean bg.b()>
	//*  71  151:ifeq            161
		{
			f();
	//   72  154:aload_0         
	//   73  155:invokespecial   #230 <Method void f()>
			break MISSING_BLOCK_LABEL_194;
	//   74  158:goto            194
		}
		l = ((Writer) (new BufferedWriter(((Writer) (new OutputStreamWriter(((OutputStream) (new FileOutputStream(e, true))), bh.a))))));
	//   75  161:aload_0         
	//   76  162:new             #347 <Class BufferedWriter>
	//   77  165:dup             
	//   78  166:new             #349 <Class OutputStreamWriter>
	//   79  169:dup             
	//   80  170:new             #351 <Class FileOutputStream>
	//   81  173:dup             
	//   82  174:aload_0         
	//   83  175:getfield        #119 <Field File e>
	//   84  178:iconst_1        
	//   85  179:invokespecial   #354 <Method void FileOutputStream(File, boolean)>
	//   86  182:getstatic       #316 <Field java.nio.charset.Charset bh.a>
	//   87  185:invokespecial   #357 <Method void OutputStreamWriter(OutputStream, java.nio.charset.Charset)>
	//   88  188:invokespecial   #360 <Method void BufferedWriter(Writer)>
	//   89  191:putfield        #165 <Field Writer l>
		bh.a(((Closeable) (bg1)));
	//   90  194:aload_3         
	//   91  195:invokestatic    #363 <Method void bh.a(Closeable)>
		return;
	//   92  198:return          
_L2:
		StringBuilder stringbuilder = new StringBuilder();
	//   93  199:new             #167 <Class StringBuilder>
	//   94  202:dup             
	//   95  203:invokespecial   #168 <Method void StringBuilder()>
	//   96  206:astore          8
		stringbuilder.append("unexpected journal header: [");
	//   97  208:aload           8
	//   98  210:ldc2            #365 <String "unexpected journal header: [">
	//   99  213:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  100  216:pop             
		stringbuilder.append(s);
	//  101  217:aload           8
	//  102  219:aload           4
	//  103  221:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  104  224:pop             
		stringbuilder.append(", ");
	//  105  225:aload           8
	//  106  227:ldc2            #367 <String ", ">
	//  107  230:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  108  233:pop             
		stringbuilder.append(s1);
	//  109  234:aload           8
	//  110  236:aload           5
	//  111  238:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  112  241:pop             
		stringbuilder.append(", ");
	//  113  242:aload           8
	//  114  244:ldc2            #367 <String ", ">
	//  115  247:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  116  250:pop             
		stringbuilder.append(s2);
	//  117  251:aload           8
	//  118  253:aload           6
	//  119  255:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  120  258:pop             
		stringbuilder.append(", ");
	//  121  259:aload           8
	//  122  261:ldc2            #367 <String ", ">
	//  123  264:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  124  267:pop             
		stringbuilder.append(s3);
	//  125  268:aload           8
	//  126  270:aload           7
	//  127  272:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  128  275:pop             
		stringbuilder.append("]");
	//  129  276:aload           8
	//  130  278:ldc2            #369 <String "]">
	//  131  281:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  132  284:pop             
		throw new IOException(stringbuilder.toString());
	//  133  285:new             #192 <Class IOException>
	//  134  288:dup             
	//  135  289:aload           8
	//  136  291:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  137  294:invokespecial   #370 <Method void IOException(String)>
	//  138  297:athrow          
		Object obj;
		obj;
	//  139  298:astore          4
		bh.a(((Closeable) (bg1)));
	//  140  300:aload_3         
	//  141  301:invokestatic    #363 <Method void bh.a(Closeable)>
		throw obj;
	//  142  304:aload           4
	//  143  306:athrow          
		obj;
	//  144  307:astore          4
		if(true) goto _L4; else goto _L6
	//  145  309:goto            134
_L6:
	}

	static void d(be be1)
	{
		be1.f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #230 <Method void f()>
	//    2    4:return          
	}

	private void d(String s)
	{
		int i1 = s.indexOf(' ');
	//    0    0:aload_1         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #374 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		if(i1 != -1)
	//*   4    7:iload_2         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          289
		{
			int j1 = i1 + 1;
	//    7   12:iload_2         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:istore_3        
			int k1 = s.indexOf(' ', j1);
	//   11   16:aload_1         
	//   12   17:bipush          32
	//   13   19:iload_3         
	//   14   20:invokevirtual   #377 <Method int String.indexOf(int, int)>
	//   15   23:istore          4
			String s1;
			if(k1 == -1)
	//*  16   25:iload           4
	//*  17   27:iconst_m1       
	//*  18   28:icmpne          73
			{
				String s2 = s.substring(j1);
	//   19   31:aload_1         
	//   20   32:iload_3         
	//   21   33:invokevirtual   #380 <Method String String.substring(int)>
	//   22   36:astore          6
				s1 = s2;
	//   23   38:aload           6
	//   24   40:astore          5
				if(i1 == 6)
	//*  25   42:iload_2         
	//*  26   43:bipush          6
	//*  27   45:icmpne          82
				{
					s1 = s2;
	//   28   48:aload           6
	//   29   50:astore          5
					if(s.startsWith("REMOVE"))
	//*  30   52:aload_1         
	//*  31   53:ldc2            #382 <String "REMOVE">
	//*  32   56:invokevirtual   #386 <Method boolean String.startsWith(String)>
	//*  33   59:ifeq            82
					{
						m.remove(((Object) (s2)));
	//   34   62:aload_0         
	//   35   63:getfield        #81  <Field LinkedHashMap m>
	//   36   66:aload           6
	//   37   68:invokevirtual   #286 <Method Object LinkedHashMap.remove(Object)>
	//   38   71:pop             
						return;
	//   39   72:return          
					}
				}
			} else
			{
				s1 = s.substring(j1, k1);
	//   40   73:aload_1         
	//   41   74:iload_3         
	//   42   75:iload           4
	//   43   77:invokevirtual   #389 <Method String String.substring(int, int)>
	//   44   80:astore          5
			}
			bf bf2 = (bf)m.get(((Object) (s1)));
	//   45   82:aload_0         
	//   46   83:getfield        #81  <Field LinkedHashMap m>
	//   47   86:aload           5
	//   48   88:invokevirtual   #144 <Method Object LinkedHashMap.get(Object)>
	//   49   91:checkcast       #146 <Class bf>
	//   50   94:astore          7
			bf bf1 = bf2;
	//   51   96:aload           7
	//   52   98:astore          6
			if(bf2 == null)
	//*  53  100:aload           7
	//*  54  102:ifnonnull       136
			{
				bf1 = new bf(s1, j, d);
	//   55  105:new             #146 <Class bf>
	//   56  108:dup             
	//   57  109:aload           5
	//   58  111:aload_0         
	//   59  112:getfield        #129 <Field int j>
	//   60  115:aload_0         
	//   61  116:getfield        #108 <Field File d>
	//   62  119:invokespecial   #153 <Method void bf(String, int, File)>
	//   63  122:astore          6
				m.put(((Object) (s1)), ((Object) (bf1)));
	//   64  124:aload_0         
	//   65  125:getfield        #81  <Field LinkedHashMap m>
	//   66  128:aload           5
	//   67  130:aload           6
	//   68  132:invokevirtual   #157 <Method Object LinkedHashMap.put(Object, Object)>
	//   69  135:pop             
			}
			if(k1 != -1 && i1 == 5 && s.startsWith("CLEAN"))
	//*  70  136:iload           4
	//*  71  138:iconst_m1       
	//*  72  139:icmpeq          191
	//*  73  142:iload_2         
	//*  74  143:iconst_5        
	//*  75  144:icmpne          191
	//*  76  147:aload_1         
	//*  77  148:ldc2            #391 <String "CLEAN">
	//*  78  151:invokevirtual   #386 <Method boolean String.startsWith(String)>
	//*  79  154:ifeq            191
			{
				s = ((String) (s.substring(k1 + 1).split(" ")));
	//   80  157:aload_1         
	//   81  158:iload           4
	//   82  160:iconst_1        
	//   83  161:iadd            
	//   84  162:invokevirtual   #380 <Method String String.substring(int)>
	//   85  165:ldc2            #393 <String " ">
	//   86  168:invokevirtual   #397 <Method String[] String.split(String)>
	//   87  171:astore_1        
				bf1.c = true;
	//   88  172:aload           6
	//   89  174:iconst_1        
	//   90  175:putfield        #246 <Field boolean bf.c>
				bf1.d = null;
	//   91  178:aload           6
	//   92  180:aconst_null     
	//   93  181:putfield        #160 <Field be$a bf.d>
				bf1.a(((String []) (s)));
	//   94  184:aload           6
	//   95  186:aload_1         
	//   96  187:invokevirtual   #400 <Method void bf.a(String[])>
				return;
	//   97  190:return          
			}
			if(k1 == -1 && i1 == 5 && s.startsWith("DIRTY"))
	//*  98  191:iload           4
	//*  99  193:iconst_m1       
	//* 100  194:icmpne          229
	//* 101  197:iload_2         
	//* 102  198:iconst_5        
	//* 103  199:icmpne          229
	//* 104  202:aload_1         
	//* 105  203:ldc2            #402 <String "DIRTY">
	//* 106  206:invokevirtual   #386 <Method boolean String.startsWith(String)>
	//* 107  209:ifeq            229
			{
				bf1.d = new a(bf1);
	//  108  212:aload           6
	//  109  214:new             #10  <Class be$a>
	//  110  217:dup             
	//  111  218:aload_0         
	//  112  219:aload           6
	//  113  221:aconst_null     
	//  114  222:invokespecial   #163 <Method void be$a(be, bf, be$1)>
	//  115  225:putfield        #160 <Field be$a bf.d>
				return;
	//  116  228:return          
			}
			if(k1 == -1 && i1 == 4 && s.startsWith("READ"))
	//* 117  229:iload           4
	//* 118  231:iconst_m1       
	//* 119  232:icmpne          251
	//* 120  235:iload_2         
	//* 121  236:iconst_4        
	//* 122  237:icmpne          251
	//* 123  240:aload_1         
	//* 124  241:ldc2            #404 <String "READ">
	//* 125  244:invokevirtual   #386 <Method boolean String.startsWith(String)>
	//* 126  247:ifeq            251
			{
				return;
	//  127  250:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  128  251:new             #167 <Class StringBuilder>
	//  129  254:dup             
	//  130  255:invokespecial   #168 <Method void StringBuilder()>
	//  131  258:astore          5
				stringbuilder.append("unexpected journal line: ");
	//  132  260:aload           5
	//  133  262:ldc2            #406 <String "unexpected journal line: ">
	//  134  265:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  135  268:pop             
				stringbuilder.append(s);
	//  136  269:aload           5
	//  137  271:aload_1         
	//  138  272:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  139  275:pop             
				throw new IOException(stringbuilder.toString());
	//  140  276:new             #192 <Class IOException>
	//  141  279:dup             
	//  142  280:aload           5
	//  143  282:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  144  285:invokespecial   #370 <Method void IOException(String)>
	//  145  288:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  146  289:new             #167 <Class StringBuilder>
	//  147  292:dup             
	//  148  293:invokespecial   #168 <Method void StringBuilder()>
	//  149  296:astore          5
			stringbuilder1.append("unexpected journal line: ");
	//  150  298:aload           5
	//  151  300:ldc2            #406 <String "unexpected journal line: ">
	//  152  303:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  153  306:pop             
			stringbuilder1.append(s);
	//  154  307:aload           5
	//  155  309:aload_1         
	//  156  310:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  157  313:pop             
			throw new IOException(stringbuilder1.toString());
	//  158  314:new             #192 <Class IOException>
	//  159  317:dup             
	//  160  318:aload           5
	//  161  320:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  162  323:invokespecial   #370 <Method void IOException(String)>
	//  163  326:athrow          
		}
	}

	static int e(be be1)
	{
		return be1.j;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int j>
	//    2    4:ireturn         
	}

	private void e()
	{
		a(f);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field File f>
	//    2    4:invokestatic    #277 <Method void a(File)>
		for(Iterator iterator = m.values().iterator(); iterator.hasNext();)
	//*   3    7:aload_0         
	//*   4    8:getfield        #81  <Field LinkedHashMap m>
	//*   5   11:invokevirtual   #411 <Method Collection LinkedHashMap.values()>
	//*   6   14:invokeinterface #417 <Method Iterator Collection.iterator()>
	//*   7   19:astore_3        
	//*   8   20:aload_3         
	//*   9   21:invokeinterface #422 <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            137
		{
			bf bf1 = (bf)iterator.next();
	//   11   29:aload_3         
	//   12   30:invokeinterface #426 <Method Object Iterator.next()>
	//   13   35:checkcast       #146 <Class bf>
	//   14   38:astore          4
			a a1 = bf1.d;
	//   15   40:aload           4
	//   16   42:getfield        #160 <Field be$a bf.d>
	//   17   45:astore          5
			boolean flag = false;
	//   18   47:iconst_0        
	//   19   48:istore_2        
			int i1 = 0;
	//   20   49:iconst_0        
	//   21   50:istore_1        
			if(a1 == null)
	//*  22   51:aload           5
	//*  23   53:ifnonnull       87
			{
				while(i1 < j) 
	//*  24   56:iload_1         
	//*  25   57:aload_0         
	//*  26   58:getfield        #129 <Field int j>
	//*  27   61:icmpge          20
				{
					k = k + bf1.b[i1];
	//   28   64:aload_0         
	//   29   65:aload_0         
	//   30   66:getfield        #73  <Field long k>
	//   31   69:aload           4
	//   32   71:getfield        #270 <Field long[] bf.b>
	//   33   74:iload_1         
	//   34   75:laload          
	//   35   76:ladd            
	//   36   77:putfield        #73  <Field long k>
					i1++;
	//   37   80:iload_1         
	//   38   81:iconst_1        
	//   39   82:iadd            
	//   40   83:istore_1        
				}
			} else
	//*  41   84:goto            56
			{
				bf1.d = null;
	//   42   87:aload           4
	//   43   89:aconst_null     
	//   44   90:putfield        #160 <Field be$a bf.d>
				for(int j1 = ((int) (flag)); j1 < j; j1++)
	//*  45   93:iload_2         
	//*  46   94:istore_1        
	//*  47   95:iload_1         
	//*  48   96:aload_0         
	//*  49   97:getfield        #129 <Field int j>
	//*  50  100:icmpge          128
				{
					a(bf1.a(j1));
	//   51  103:aload           4
	//   52  105:iload_1         
	//   53  106:invokevirtual   #263 <Method File bf.a(int)>
	//   54  109:invokestatic    #277 <Method void a(File)>
					a(bf1.b(j1));
	//   55  112:aload           4
	//   56  114:iload_1         
	//   57  115:invokevirtual   #252 <Method File bf.b(int)>
	//   58  118:invokestatic    #277 <Method void a(File)>
				}

	//   59  121:iload_1         
	//   60  122:iconst_1        
	//   61  123:iadd            
	//   62  124:istore_1        
	//*  63  125:goto            95
				iterator.remove();
	//   64  128:aload_3         
	//   65  129:invokeinterface #428 <Method void Iterator.remove()>
			}
		}

	//*  66  134:goto            20
	//   67  137:return          
	}

	private void e(String s)
	{
		if(a.matcher(((CharSequence) (s))).matches())
	//*   0    0:getstatic       #55  <Field Pattern a>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #432 <Method Matcher Pattern.matcher(CharSequence)>
	//*   3    7:invokevirtual   #437 <Method boolean Matcher.matches()>
	//*   4   10:ifeq            14
		{
			return;
	//    5   13:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #167 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #168 <Method void StringBuilder()>
	//    9   21:astore_2        
			stringbuilder.append("keys must match regex [a-z0-9_-]{1,120}: \"");
	//   10   22:aload_2         
	//   11   23:ldc2            #439 <String "keys must match regex [a-z0-9_-]{1,120}: \"">
	//   12   26:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
			stringbuilder.append(s);
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append("\"");
	//   18   36:aload_2         
	//   19   37:ldc2            #441 <String "\"">
	//   20   40:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   22   44:new             #232 <Class IllegalArgumentException>
	//   23   47:dup             
	//   24   48:aload_2         
	//   25   49:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   26   52:invokespecial   #236 <Method void IllegalArgumentException(String)>
	//   27   55:athrow          
		}
	}

	static File f(be be1)
	{
		return be1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field File d>
	//    2    4:areturn         
	}

	private void f()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		BufferedWriter bufferedwriter;
		if(l != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #165 <Field Writer l>
	//*   4    6:ifnull          16
			l.close();
	//    5    9:aload_0         
	//    6   10:getfield        #165 <Field Writer l>
	//    7   13:invokevirtual   #445 <Method void Writer.close()>
		bufferedwriter = new BufferedWriter(((Writer) (new OutputStreamWriter(((OutputStream) (new FileOutputStream(f))), bh.a))));
	//    8   16:new             #347 <Class BufferedWriter>
	//    9   19:dup             
	//   10   20:new             #349 <Class OutputStreamWriter>
	//   11   23:dup             
	//   12   24:new             #351 <Class FileOutputStream>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #123 <Field File f>
	//   16   32:invokespecial   #446 <Method void FileOutputStream(File)>
	//   17   35:getstatic       #316 <Field java.nio.charset.Charset bh.a>
	//   18   38:invokespecial   #357 <Method void OutputStreamWriter(OutputStream, java.nio.charset.Charset)>
	//   19   41:invokespecial   #360 <Method void BufferedWriter(Writer)>
	//   20   44:astore_1        
		Iterator iterator;
		((Writer) (bufferedwriter)).write("libcore.io.DiskLruCache");
	//   21   45:aload_1         
	//   22   46:ldc2            #322 <String "libcore.io.DiskLruCache">
	//   23   49:invokevirtual   #186 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   24   52:aload_1         
	//   25   53:ldc2            #448 <String "\n">
	//   26   56:invokevirtual   #186 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("1");
	//   27   59:aload_1         
	//   28   60:ldc2            #330 <String "1">
	//   29   63:invokevirtual   #186 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   30   66:aload_1         
	//   31   67:ldc2            #448 <String "\n">
	//   32   70:invokevirtual   #186 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write(Integer.toString(h));
	//   33   73:aload_1         
	//   34   74:aload_0         
	//   35   75:getfield        #110 <Field int h>
	//   36   78:invokestatic    #335 <Method String Integer.toString(int)>
	//   37   81:invokevirtual   #186 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   38   84:aload_1         
	//   39   85:ldc2            #448 <String "\n">
	//   40   88:invokevirtual   #186 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write(Integer.toString(j));
	//   41   91:aload_1         
	//   42   92:aload_0         
	//   43   93:getfield        #129 <Field int j>
	//   44   96:invokestatic    #335 <Method String Integer.toString(int)>
	//   45   99:invokevirtual   #186 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   46  102:aload_1         
	//   47  103:ldc2            #448 <String "\n">
	//   48  106:invokevirtual   #186 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   49  109:aload_1         
	//   50  110:ldc2            #448 <String "\n">
	//   51  113:invokevirtual   #186 <Method void Writer.write(String)>
		iterator = m.values().iterator();
	//   52  116:aload_0         
	//   53  117:getfield        #81  <Field LinkedHashMap m>
	//   54  120:invokevirtual   #411 <Method Collection LinkedHashMap.values()>
	//   55  123:invokeinterface #417 <Method Iterator Collection.iterator()>
	//   56  128:astore_2        
_L1:
		bf bf1;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_260;
	//   57  129:aload_2         
	//   58  130:invokeinterface #422 <Method boolean Iterator.hasNext()>
	//   59  135:ifeq            260
			bf1 = (bf)iterator.next();
	//   60  138:aload_2         
	//   61  139:invokeinterface #426 <Method Object Iterator.next()>
	//   62  144:checkcast       #146 <Class bf>
	//   63  147:astore_3        
			if(bf1.d == null)
				break MISSING_BLOCK_LABEL_202;
	//   64  148:aload_3         
	//   65  149:getfield        #160 <Field be$a bf.d>
	//   66  152:ifnull          202
			StringBuilder stringbuilder = new StringBuilder();
	//   67  155:new             #167 <Class StringBuilder>
	//   68  158:dup             
	//   69  159:invokespecial   #168 <Method void StringBuilder()>
	//   70  162:astore          4
			stringbuilder.append("DIRTY ");
	//   71  164:aload           4
	//   72  166:ldc1            #170 <String "DIRTY ">
	//   73  168:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   74  171:pop             
			stringbuilder.append(bf1.a);
	//   75  172:aload           4
	//   76  174:aload_3         
	//   77  175:getfield        #281 <Field String bf.a>
	//   78  178:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   79  181:pop             
			stringbuilder.append('\n');
	//   80  182:aload           4
	//   81  184:bipush          10
	//   82  186:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//   83  189:pop             
			((Writer) (bufferedwriter)).write(stringbuilder.toString());
	//   84  190:aload_1         
	//   85  191:aload           4
	//   86  193:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   87  196:invokevirtual   #186 <Method void Writer.write(String)>
		} while(true);
	//   88  199:goto            129
		StringBuilder stringbuilder1 = new StringBuilder();
	//   89  202:new             #167 <Class StringBuilder>
	//   90  205:dup             
	//   91  206:invokespecial   #168 <Method void StringBuilder()>
	//   92  209:astore          4
		stringbuilder1.append("CLEAN ");
	//   93  211:aload           4
	//   94  213:ldc2            #279 <String "CLEAN ">
	//   95  216:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   96  219:pop             
		stringbuilder1.append(bf1.a);
	//   97  220:aload           4
	//   98  222:aload_3         
	//   99  223:getfield        #281 <Field String bf.a>
	//  100  226:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  101  229:pop             
		stringbuilder1.append(bf1.a());
	//  102  230:aload           4
	//  103  232:aload_3         
	//  104  233:invokevirtual   #283 <Method String bf.a()>
	//  105  236:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//  106  239:pop             
		stringbuilder1.append('\n');
	//  107  240:aload           4
	//  108  242:bipush          10
	//  109  244:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//  110  247:pop             
		((Writer) (bufferedwriter)).write(stringbuilder1.toString());
	//  111  248:aload_1         
	//  112  249:aload           4
	//  113  251:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  114  254:invokevirtual   #186 <Method void Writer.write(String)>
		  goto _L1
	//* 115  257:goto            129
		((Writer) (bufferedwriter)).close();
	//  116  260:aload_1         
	//  117  261:invokevirtual   #445 <Method void Writer.close()>
		if(e.exists())
	//* 118  264:aload_0         
	//* 119  265:getfield        #119 <Field File e>
	//* 120  268:invokevirtual   #196 <Method boolean File.exists()>
	//* 121  271:ifeq            286
			a(e, g, true);
	//  122  274:aload_0         
	//  123  275:getfield        #119 <Field File e>
	//  124  278:aload_0         
	//  125  279:getfield        #127 <Field File g>
	//  126  282:iconst_1        
	//  127  283:invokestatic    #202 <Method void a(File, File, boolean)>
		a(f, e, false);
	//  128  286:aload_0         
	//  129  287:getfield        #123 <Field File f>
	//  130  290:aload_0         
	//  131  291:getfield        #119 <Field File e>
	//  132  294:iconst_0        
	//  133  295:invokestatic    #202 <Method void a(File, File, boolean)>
		g.delete();
	//  134  298:aload_0         
	//  135  299:getfield        #127 <Field File g>
	//  136  302:invokevirtual   #199 <Method boolean File.delete()>
	//  137  305:pop             
		l = ((Writer) (new BufferedWriter(((Writer) (new OutputStreamWriter(((OutputStream) (new FileOutputStream(e, true))), bh.a))))));
	//  138  306:aload_0         
	//  139  307:new             #347 <Class BufferedWriter>
	//  140  310:dup             
	//  141  311:new             #349 <Class OutputStreamWriter>
	//  142  314:dup             
	//  143  315:new             #351 <Class FileOutputStream>
	//  144  318:dup             
	//  145  319:aload_0         
	//  146  320:getfield        #119 <Field File e>
	//  147  323:iconst_1        
	//  148  324:invokespecial   #354 <Method void FileOutputStream(File, boolean)>
	//  149  327:getstatic       #316 <Field java.nio.charset.Charset bh.a>
	//  150  330:invokespecial   #357 <Method void OutputStreamWriter(OutputStream, java.nio.charset.Charset)>
	//  151  333:invokespecial   #360 <Method void BufferedWriter(Writer)>
	//  152  336:putfield        #165 <Field Writer l>
		this;
	//  153  339:aload_0         
		JVM INSTR monitorexit ;
	//  154  340:monitorexit     
		return;
	//  155  341:return          
		Exception exception1;
		exception1;
	//  156  342:astore_2        
		((Writer) (bufferedwriter)).close();
	//  157  343:aload_1         
	//  158  344:invokevirtual   #445 <Method void Writer.close()>
		throw exception1;
	//  159  347:aload_2         
	//  160  348:athrow          
		Exception exception;
		exception;
	//  161  349:astore_1        
		this;
	//  162  350:aload_0         
		JVM INSTR monitorexit ;
	//  163  351:monitorexit     
		throw exception;
	//  164  352:aload_1         
	//  165  353:athrow          
	}

	private boolean g()
	{
		int i1 = n;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field int n>
	//    2    4:istore_1        
		return i1 >= 2000 && i1 >= m.size();
	//    3    5:iload_1         
	//    4    6:sipush          2000
	//    5    9:icmplt          25
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #81  <Field LinkedHashMap m>
	//    9   17:invokevirtual   #343 <Method int LinkedHashMap.size()>
	//   10   20:icmplt          25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private void h()
	{
		if(l != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field Writer l>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("cache is closed");
	//    4    8:new             #260 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc2            #450 <String "cache is closed">
	//    7   15:invokespecial   #261 <Method void IllegalStateException(String)>
	//    8   18:athrow          
	}

	private void i()
	{
		while(k > i) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field long k>
	//*   2    4:aload_0         
	//*   3    5:getfield        #131 <Field long i>
	//*   4    8:lcmp            
	//*   5    9:ifle            48
			c((String)((java.util.Map.Entry)m.entrySet().iterator().next()).getKey());
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #81  <Field LinkedHashMap m>
	//    9   17:invokevirtual   #454 <Method Set LinkedHashMap.entrySet()>
	//   10   20:invokeinterface #457 <Method Iterator Set.iterator()>
	//   11   25:invokeinterface #426 <Method Object Iterator.next()>
	//   12   30:checkcast       #459 <Class java.util.Map$Entry>
	//   13   33:invokeinterface #462 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #324 <Class String>
	//   15   41:invokevirtual   #464 <Method boolean c(String)>
	//   16   44:pop             
	//*  17   45:goto            0
	//   18   48:return          
	}

	public b a(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		bf bf1;
		h();
	//    2    2:aload_0         
	//    3    3:invokespecial   #137 <Method void h()>
		e(s);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #140 <Method void e(String)>
		bf1 = (bf)m.get(((Object) (s)));
	//    7   11:aload_0         
	//    8   12:getfield        #81  <Field LinkedHashMap m>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #144 <Method Object LinkedHashMap.get(Object)>
	//   11   19:checkcast       #146 <Class bf>
	//   12   22:astore          6
		if(bf1 != null)
			break MISSING_BLOCK_LABEL_33;
	//   13   24:aload           6
	//   14   26:ifnonnull       33
		this;
	//   15   29:aload_0         
		JVM INSTR monitorexit ;
	//   16   30:monitorexit     
		return null;
	//   17   31:aconst_null     
	//   18   32:areturn         
		boolean flag1 = bf1.c;
	//   19   33:aload           6
	//   20   35:getfield        #246 <Field boolean bf.c>
	//   21   38:istore          4
		if(flag1)
			break MISSING_BLOCK_LABEL_49;
	//   22   40:iload           4
	//   23   42:ifne            49
		this;
	//   24   45:aload_0         
		JVM INSTR monitorexit ;
	//   25   46:monitorexit     
		return null;
	//   26   47:aconst_null     
	//   27   48:areturn         
		InputStream ainputstream[] = new InputStream[j];
	//   28   49:aload_0         
	//   29   50:getfield        #129 <Field int j>
	//   30   53:anewarray       InputStream[]
	//   31   56:astore          5
		int i1;
		boolean flag;
		flag = false;
	//   32   58:iconst_0        
	//   33   59:istore_3        
		i1 = 0;
	//   34   60:iconst_0        
	//   35   61:istore_2        
_L2:
		if(i1 >= j)
			break; /* Loop/switch isn't completed */
	//   36   62:iload_2         
	//   37   63:aload_0         
	//   38   64:getfield        #129 <Field int j>
	//   39   67:icmpge          94
		ainputstream[i1] = ((InputStream) (new FileInputStream(bf1.a(i1))));
	//   40   70:aload           5
	//   41   72:iload_2         
	//   42   73:new             #309 <Class FileInputStream>
	//   43   76:dup             
	//   44   77:aload           6
	//   45   79:iload_2         
	//   46   80:invokevirtual   #263 <Method File bf.a(int)>
	//   47   83:invokespecial   #311 <Method void FileInputStream(File)>
	//   48   86:aastore         
		i1++;
	//   49   87:iload_2         
	//   50   88:iconst_1        
	//   51   89:iadd            
	//   52   90:istore_2        
		if(true) goto _L2; else goto _L1
	//   53   91:goto            62
_L1:
		n = n + 1;
	//   54   94:aload_0         
	//   55   95:aload_0         
	//   56   96:getfield        #134 <Field int n>
	//   57   99:iconst_1        
	//   58  100:iadd            
	//   59  101:putfield        #134 <Field int n>
		Writer writer = l;
	//   60  104:aload_0         
	//   61  105:getfield        #165 <Field Writer l>
	//   62  108:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   63  110:new             #167 <Class StringBuilder>
	//   64  113:dup             
	//   65  114:invokespecial   #168 <Method void StringBuilder()>
	//   66  117:astore          8
		stringbuilder.append("READ ");
	//   67  119:aload           8
	//   68  121:ldc2            #471 <String "READ ">
	//   69  124:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   70  127:pop             
		stringbuilder.append(s);
	//   71  128:aload           8
	//   72  130:aload_1         
	//   73  131:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   74  134:pop             
		stringbuilder.append('\n');
	//   75  135:aload           8
	//   76  137:bipush          10
	//   77  139:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//   78  142:pop             
		writer.append(((CharSequence) (stringbuilder.toString())));
	//   79  143:aload           7
	//   80  145:aload           8
	//   81  147:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   82  150:invokevirtual   #474 <Method Writer Writer.append(CharSequence)>
	//   83  153:pop             
		if(g())
	//*  84  154:aload_0         
	//*  85  155:invokespecial   #290 <Method boolean g()>
	//*  86  158:ifeq            173
			b.submit(p);
	//   87  161:aload_0         
	//   88  162:getfield        #101 <Field ThreadPoolExecutor b>
	//   89  165:aload_0         
	//   90  166:getfield        #106 <Field Callable p>
	//   91  169:invokevirtual   #294 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//   92  172:pop             
		s = ((String) (new b(s, bf1.e, ainputstream, bf1.b)));
	//   93  173:new             #15  <Class be$b>
	//   94  176:dup             
	//   95  177:aload_0         
	//   96  178:aload_1         
	//   97  179:aload           6
	//   98  181:getfield        #150 <Field long bf.e>
	//   99  184:aload           5
	//  100  186:aload           6
	//  101  188:getfield        #270 <Field long[] bf.b>
	//  102  191:aconst_null     
	//  103  192:invokespecial   #477 <Method void be$b(be, String, long, InputStream[], long[], be$1)>
	//  104  195:astore_1        
		this;
	//  105  196:aload_0         
		JVM INSTR monitorexit ;
	//  106  197:monitorexit     
		return ((b) (s));
	//  107  198:aload_1         
	//  108  199:areturn         
_L4:
		if(i1 >= j || ainputstream[i1] == null)
			break MISSING_BLOCK_LABEL_229;
	//  109  200:iload_2         
	//  110  201:aload_0         
	//  111  202:getfield        #129 <Field int j>
	//  112  205:icmpge          229
	//  113  208:aload           5
	//  114  210:iload_2         
	//  115  211:aaload          
	//  116  212:ifnull          229
		bh.a(((Closeable) (ainputstream[i1])));
	//  117  215:aload           5
	//  118  217:iload_2         
	//  119  218:aaload          
	//  120  219:invokestatic    #363 <Method void bh.a(Closeable)>
		i1++;
	//  121  222:iload_2         
	//  122  223:iconst_1        
	//  123  224:iadd            
	//  124  225:istore_2        
		continue; /* Loop/switch isn't completed */
	//  125  226:goto            200
		this;
	//  126  229:aload_0         
		JVM INSTR monitorexit ;
	//  127  230:monitorexit     
		return null;
	//  128  231:aconst_null     
	//  129  232:areturn         
		s;
	//  130  233:astore_1        
	//* 131  234:aload_0         
		throw s;
	//  132  235:monitorexit     
	//  133  236:aload_1         
	//  134  237:athrow          
		s;
	//  135  238:astore_1        
		i1 = ((int) (flag));
	//  136  239:iload_3         
	//  137  240:istore_2        
		if(true) goto _L4; else goto _L3
	//  138  241:goto            200
_L3:
	}

	public void a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Writer writer = l;
	//    2    2:aload_0         
	//    3    3:getfield        #165 <Field Writer l>
	//    4    6:astore_1        
		if(writer != null)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:aload_1         
	//    6    8:ifnonnull       14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		Iterator iterator = (new ArrayList(m.values())).iterator();
	//   10   14:new             #479 <Class ArrayList>
	//   11   17:dup             
	//   12   18:aload_0         
	//   13   19:getfield        #81  <Field LinkedHashMap m>
	//   14   22:invokevirtual   #411 <Method Collection LinkedHashMap.values()>
	//   15   25:invokespecial   #482 <Method void ArrayList(Collection)>
	//   16   28:invokevirtual   #483 <Method Iterator ArrayList.iterator()>
	//   17   31:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   18   32:aload_1         
	//   19   33:invokeinterface #422 <Method boolean Iterator.hasNext()>
	//   20   38:ifeq            68
			bf bf1 = (bf)iterator.next();
	//   21   41:aload_1         
	//   22   42:invokeinterface #426 <Method Object Iterator.next()>
	//   23   47:checkcast       #146 <Class bf>
	//   24   50:astore_2        
			if(bf1.d != null)
	//*  25   51:aload_2         
	//*  26   52:getfield        #160 <Field be$a bf.d>
	//*  27   55:ifnull          32
				bf1.d.b();
	//   28   58:aload_2         
	//   29   59:getfield        #160 <Field be$a bf.d>
	//   30   62:invokevirtual   #253 <Method void be$a.b()>
		} while(true);
	//   31   65:goto            32
		i();
	//   32   68:aload_0         
	//   33   69:invokespecial   #301 <Method void i()>
		l.close();
	//   34   72:aload_0         
	//   35   73:getfield        #165 <Field Writer l>
	//   36   76:invokevirtual   #445 <Method void Writer.close()>
		l = null;
	//   37   79:aload_0         
	//   38   80:aconst_null     
	//   39   81:putfield        #165 <Field Writer l>
		this;
	//   40   84:aload_0         
		JVM INSTR monitorexit ;
	//   41   85:monitorexit     
		return;
	//   42   86:return          
		Exception exception;
		exception;
	//   43   87:astore_1        
	//*  44   88:aload_0         
		throw exception;
	//   45   89:monitorexit     
	//   46   90:aload_1         
	//   47   91:athrow          
	}

	public a b(String s)
	{
		return a(s, -1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #147 <Long -1L>
	//    3    5:invokespecial   #486 <Method be$a a(String, long)>
	//    4    8:areturn         
	}

	public void b()
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #488 <Method void a()>
		bh.a(d);
	//    2    4:aload_0         
	//    3    5:getfield        #108 <Field File d>
	//    4    8:invokestatic    #489 <Method void bh.a(File)>
	//    5   11:return          
	}

	public boolean c(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		bf bf1;
		h();
	//    2    2:aload_0         
	//    3    3:invokespecial   #137 <Method void h()>
		e(s);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #140 <Method void e(String)>
		bf1 = (bf)m.get(((Object) (s)));
	//    7   11:aload_0         
	//    8   12:getfield        #81  <Field LinkedHashMap m>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #144 <Method Object LinkedHashMap.get(Object)>
	//   11   19:checkcast       #146 <Class bf>
	//   12   22:astore          4
		int i1;
		i1 = 0;
	//   13   24:iconst_0        
	//   14   25:istore_2        
		if(bf1 == null)
			break MISSING_BLOCK_LABEL_229;
	//   15   26:aload           4
	//   16   28:ifnull          229
		if(bf1.d != null)
	//*  17   31:aload           4
	//*  18   33:getfield        #160 <Field be$a bf.d>
	//*  19   36:ifnull          42
			break MISSING_BLOCK_LABEL_229;
	//   20   39:goto            229
_L2:
		File file;
		if(i1 >= j)
			break; /* Loop/switch isn't completed */
	//   21   42:iload_2         
	//   22   43:aload_0         
	//   23   44:getfield        #129 <Field int j>
	//   24   47:icmpge          139
		file = bf1.a(i1);
	//   25   50:aload           4
	//   26   52:iload_2         
	//   27   53:invokevirtual   #263 <Method File bf.a(int)>
	//   28   56:astore_3        
		if(!file.exists() || file.delete())
	//*  29   57:aload_3         
	//*  30   58:invokevirtual   #196 <Method boolean File.exists()>
	//*  31   61:ifeq            108
	//*  32   64:aload_3         
	//*  33   65:invokevirtual   #199 <Method boolean File.delete()>
	//*  34   68:ifeq            74
			break MISSING_BLOCK_LABEL_108;
	//   35   71:goto            108
		s = ((String) (new StringBuilder()));
	//   36   74:new             #167 <Class StringBuilder>
	//   37   77:dup             
	//   38   78:invokespecial   #168 <Method void StringBuilder()>
	//   39   81:astore_1        
		((StringBuilder) (s)).append("failed to delete ");
	//   40   82:aload_1         
	//   41   83:ldc2            #491 <String "failed to delete ">
	//   42   86:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
		((StringBuilder) (s)).append(((Object) (file)));
	//   44   90:aload_1         
	//   45   91:aload_3         
	//   46   92:invokevirtual   #213 <Method StringBuilder StringBuilder.append(Object)>
	//   47   95:pop             
		throw new IOException(((StringBuilder) (s)).toString());
	//   48   96:new             #192 <Class IOException>
	//   49   99:dup             
	//   50  100:aload_1         
	//   51  101:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   52  104:invokespecial   #370 <Method void IOException(String)>
	//   53  107:athrow          
		k = k - bf1.b[i1];
	//   54  108:aload_0         
	//   55  109:aload_0         
	//   56  110:getfield        #73  <Field long k>
	//   57  113:aload           4
	//   58  115:getfield        #270 <Field long[] bf.b>
	//   59  118:iload_2         
	//   60  119:laload          
	//   61  120:lsub            
	//   62  121:putfield        #73  <Field long k>
		bf1.b[i1] = 0L;
	//   63  124:aload           4
	//   64  126:getfield        #270 <Field long[] bf.b>
	//   65  129:iload_2         
	//   66  130:lconst_0        
	//   67  131:lastore         
		i1++;
	//   68  132:iload_2         
	//   69  133:iconst_1        
	//   70  134:iadd            
	//   71  135:istore_2        
		if(true) goto _L2; else goto _L1
	//   72  136:goto            42
_L1:
		n = n + 1;
	//   73  139:aload_0         
	//   74  140:aload_0         
	//   75  141:getfield        #134 <Field int n>
	//   76  144:iconst_1        
	//   77  145:iadd            
	//   78  146:putfield        #134 <Field int n>
		Writer writer = l;
	//   79  149:aload_0         
	//   80  150:getfield        #165 <Field Writer l>
	//   81  153:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   82  154:new             #167 <Class StringBuilder>
	//   83  157:dup             
	//   84  158:invokespecial   #168 <Method void StringBuilder()>
	//   85  161:astore          4
		stringbuilder.append("REMOVE ");
	//   86  163:aload           4
	//   87  165:ldc2            #288 <String "REMOVE ">
	//   88  168:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   89  171:pop             
		stringbuilder.append(s);
	//   90  172:aload           4
	//   91  174:aload_1         
	//   92  175:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   93  178:pop             
		stringbuilder.append('\n');
	//   94  179:aload           4
	//   95  181:bipush          10
	//   96  183:invokevirtual   #177 <Method StringBuilder StringBuilder.append(char)>
	//   97  186:pop             
		writer.append(((CharSequence) (stringbuilder.toString())));
	//   98  187:aload_3         
	//   99  188:aload           4
	//  100  190:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  101  193:invokevirtual   #474 <Method Writer Writer.append(CharSequence)>
	//  102  196:pop             
		m.remove(((Object) (s)));
	//  103  197:aload_0         
	//  104  198:getfield        #81  <Field LinkedHashMap m>
	//  105  201:aload_1         
	//  106  202:invokevirtual   #286 <Method Object LinkedHashMap.remove(Object)>
	//  107  205:pop             
		if(g())
	//* 108  206:aload_0         
	//* 109  207:invokespecial   #290 <Method boolean g()>
	//* 110  210:ifeq            225
			b.submit(p);
	//  111  213:aload_0         
	//  112  214:getfield        #101 <Field ThreadPoolExecutor b>
	//  113  217:aload_0         
	//  114  218:getfield        #106 <Field Callable p>
	//  115  221:invokevirtual   #294 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//  116  224:pop             
		this;
	//  117  225:aload_0         
		JVM INSTR monitorexit ;
	//  118  226:monitorexit     
		return true;
	//  119  227:iconst_1        
	//  120  228:ireturn         
		this;
	//  121  229:aload_0         
		JVM INSTR monitorexit ;
	//  122  230:monitorexit     
		return false;
	//  123  231:iconst_0        
	//  124  232:ireturn         
		s;
	//  125  233:astore_1        
	//* 126  234:aload_0         
		throw s;
	//  127  235:monitorexit     
	//  128  236:aload_1         
	//  129  237:athrow          
	}

	static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
	private static final String c = AppboyLogger.getAppboyLogTag(bo/app/be);
	private static final OutputStream q = new OutputStream() {

		public void write(int i1)
		{
		//    0    0:return          
		}

	}
;
	final ThreadPoolExecutor b;
	private final File d;
	private final File e;
	private final File f;
	private final File g;
	private final int h;
	private long i;
	private final int j;
	private long k;
	private Writer l;
	private final LinkedHashMap m = new LinkedHashMap(0, 0.75F, true);
	private int n;
	private long o;
	private final Callable p = new Callable() {

		public Void a()
		{
label0:
			{
				synchronized(a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field be a>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
				{
					if(be.a(a) != null)
						break label0;
		//    5    7:aload_0         
		//    6    8:getfield        #15  <Field be a>
		//    7   11:invokestatic    #23  <Method Writer be.a(be)>
		//    8   14:ifnonnull       21
				}
		//    9   17:aload_1         
		//   10   18:monitorexit     
				return null;
		//   11   19:aconst_null     
		//   12   20:areturn         
			}
			be.b(a);
		//   13   21:aload_0         
		//   14   22:getfield        #15  <Field be a>
		//   15   25:invokestatic    #26  <Method void be.b(be)>
			if(be.c(a))
		//*  16   28:aload_0         
		//*  17   29:getfield        #15  <Field be a>
		//*  18   32:invokestatic    #30  <Method boolean be.c(be)>
		//*  19   35:ifeq            54
			{
				be.d(a);
		//   20   38:aload_0         
		//   21   39:getfield        #15  <Field be a>
		//   22   42:invokestatic    #33  <Method void be.d(be)>
				be.a(a, 0);
		//   23   45:aload_0         
		//   24   46:getfield        #15  <Field be a>
		//   25   49:iconst_0        
		//   26   50:invokestatic    #36  <Method int be.a(be, int)>
		//   27   53:pop             
			}
			be1;
		//   28   54:aload_1         
			JVM INSTR monitorexit ;
		//   29   55:monitorexit     
			return null;
		//   30   56:aconst_null     
		//   31   57:areturn         
			exception;
		//   32   58:astore_2        
			be1;
		//   33   59:aload_1         
			JVM INSTR monitorexit ;
		//   34   60:monitorexit     
			throw exception;
		//   35   61:aload_2         
		//   36   62:athrow          
		}

		public Object call()
		{
			return ((Object) (a()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method Void a()>
		//    2    4:areturn         
		}

		final be a;

			
			{
				a = be.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field be a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
	}
;

	static 
	{
	//    0    0:ldc1            #47  <String "[a-z0-9_-]{1,120}">
	//    1    2:invokestatic    #53  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #55  <Field Pattern a>
	//    3    8:ldc1            #2   <Class be>
	//    4   10:invokestatic    #61  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    5   13:putstatic       #63  <Field String c>
	//    6   16:new             #8   <Class be$2>
	//    7   19:dup             
	//    8   20:invokespecial   #66  <Method void be$2()>
	//    9   23:putstatic       #68  <Field OutputStream q>
	//*  10   26:return          
	}
}
