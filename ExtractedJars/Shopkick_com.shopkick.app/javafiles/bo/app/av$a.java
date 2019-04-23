// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.io.*;

// Referenced classes of package bo.app:
//			av, aw

public final class av$a
{
	class a extends FilterOutputStream
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
		//*   5    9:getfield        #14  <Field av$a a>
		//*   6   12:iconst_1        
		//*   7   13:invokestatic    #36  <Method boolean av$a.a(av$a, boolean)>
		//*   8   16:pop             
		//*   9   17:return          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				av.a.a(a, true);
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
		//*   5    9:getfield        #14  <Field av$a a>
		//*   6   12:iconst_1        
		//*   7   13:invokestatic    #36  <Method boolean av$a.a(av$a, boolean)>
		//*   8   16:pop             
		//*   9   17:return          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				av.a.a(a, true);
			}
		//*  10   18:astore_1        
		//*  11   19:goto            8
		}

		public void write(int i)
		{
			IOException ioexception;
			try
			{
				out.write(i);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field OutputStream out>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #43  <Method void OutputStream.write(int)>
				return;
		//    4    8:return          
			}
		//*   5    9:aload_0         
		//*   6   10:getfield        #14  <Field av$a a>
		//*   7   13:iconst_1        
		//*   8   14:invokestatic    #36  <Method boolean av$a.a(av$a, boolean)>
		//*   9   17:pop             
		//*  10   18:return          
			// Misplaced declaration of an exception variable
			catch(IOException ioexception)
			{
				av.a.a(a, true);
			}
		//*  11   19:astore_2        
		//*  12   20:goto            9
		}

		public void write(byte abyte0[], int i, int j)
		{
			try
			{
				out.write(abyte0, i, j);
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
		//*   8   12:getfield        #14  <Field av$a a>
		//*   9   15:iconst_1        
		//*  10   16:invokestatic    #36  <Method boolean av$a.a(av$a, boolean)>
		//*  11   19:pop             
		//*  12   20:return          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				av.a.a(a, true);
			}
		//*  13   21:astore_1        
		//*  14   22:goto            11
		}

		final av.a a;

		private a(OutputStream outputstream)
		{
			a = av.a.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field av$a a>
			super(outputstream);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #17  <Method void FilterOutputStream(OutputStream)>
		//    6   10:return          
		}

		a(OutputStream outputstream, av._cls1 _pcls1)
		{
			this(outputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void av$a$a(av$a, OutputStream)>
		//    4    6:return          
		}
	}


	static aw a(av$a av$a1)
	{
		return av$a1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field aw b>
	//    2    4:areturn         
	}

	static boolean a(av$a av$a1, boolean flag)
	{
		av$a1.d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean d>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean[] b(av$a av$a1)
	{
		return av$a1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean[] c>
	//    2    4:areturn         
	}

	public OutputStream a(int i)
	{
		if(i < 0 || i >= av.e(a)) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:iflt            130
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field av a>
	//    5    9:invokestatic    #33  <Method int av.e(av)>
	//    6   12:icmpge          130
_L1:
		av av1 = a;
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field av a>
	//    9   19:astore_3        
		av1;
	//   10   20:aload_3         
		JVM INSTR monitorenter ;
	//   11   21:monitorenter    
		if(b.d != this) goto _L4; else goto _L3
	//   12   22:aload_0         
	//   13   23:getfield        #26  <Field aw b>
	//   14   26:getfield        #50  <Field av$a aw.d>
	//   15   29:aload_0         
	//   16   30:if_acmpne       117
_L3:
		File file;
		if(!b.c)
	//*  17   33:aload_0         
	//*  18   34:getfield        #26  <Field aw b>
	//*  19   37:getfield        #30  <Field boolean aw.c>
	//*  20   40:ifne            50
			c[i] = true;
	//   21   43:aload_0         
	//   22   44:getfield        #35  <Field boolean[] c>
	//   23   47:iload_1         
	//   24   48:iconst_1        
	//   25   49:bastore         
		file = b.b(i);
	//   26   50:aload_0         
	//   27   51:getfield        #26  <Field aw b>
	//   28   54:iload_1         
	//   29   55:invokevirtual   #53  <Method File aw.b(int)>
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
		av.f(a).mkdirs();
	//   37   73:aload_0         
	//   38   74:getfield        #21  <Field av a>
	//   39   77:invokestatic    #62  <Method File av.f(av)>
	//   40   80:invokevirtual   #68  <Method boolean File.mkdirs()>
	//   41   83:pop             
		obj = ((Object) (new FileOutputStream(file)));
	//   42   84:new             #55  <Class FileOutputStream>
	//   43   87:dup             
	//   44   88:aload           4
	//   45   90:invokespecial   #58  <Method void FileOutputStream(File)>
	//   46   93:astore_2        
_L5:
		obj = ((Object) (new a(((OutputStream) (obj)), ((av$1) (null)))));
	//   47   94:new             #9   <Class av$a$a>
	//   48   97:dup             
	//   49   98:aload_0         
	//   50   99:aload_2         
	//   51  100:aconst_null     
	//   52  101:invokespecial   #71  <Method void av$a$a(av$a, OutputStream, av$1)>
	//   53  104:astore_2        
		av1;
	//   54  105:aload_3         
		JVM INSTR monitorexit ;
	//   55  106:monitorexit     
		return ((OutputStream) (obj));
	//   56  107:aload_2         
	//   57  108:areturn         
_L7:
		obj = ((Object) (av.c()));
	//   58  109:invokestatic    #74  <Method OutputStream av.c()>
	//   59  112:astore_2        
		av1;
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
		av1;
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
		stringbuilder.append(i);
	//   81  145:aload_2         
	//   82  146:iload_1         
	//   83  147:invokevirtual   #89  <Method StringBuilder StringBuilder.append(int)>
	//   84  150:pop             
		stringbuilder.append(" to be greater than 0 and less than the maximum value count of ");
	//   85  151:aload_2         
	//   86  152:ldc1            #91  <String " to be greater than 0 and less than the maximum value count of ">
	//   87  154:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   88  157:pop             
		stringbuilder.append(av.e(a));
	//   89  158:aload_2         
	//   90  159:aload_0         
	//   91  160:getfield        #21  <Field av a>
	//   92  163:invokestatic    #33  <Method int av.e(av)>
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
			av.a(a, this, false);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field av a>
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #103 <Method void av.a(av, av$a, boolean)>
			a.c(b.a);
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field av a>
	//   10   20:aload_0         
	//   11   21:getfield        #26  <Field aw b>
	//   12   24:getfield        #106 <Field String aw.a>
	//   13   27:invokevirtual   #109 <Method boolean av.c(String)>
	//   14   30:pop             
		} else
	//*  15   31:goto            43
		{
			av.a(a, this, true);
	//   16   34:aload_0         
	//   17   35:getfield        #21  <Field av a>
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:invokestatic    #103 <Method void av.a(av, av$a, boolean)>
		}
		e = true;
	//   21   43:aload_0         
	//   22   44:iconst_1        
	//   23   45:putfield        #111 <Field boolean e>
	//   24   48:return          
	}

	public void b()
	{
		av.a(a, this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field av a>
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #103 <Method void av.a(av, av$a, boolean)>
	//    5    9:return          
	}

	final av a;
	private final aw b;
	private final boolean c[];
	private boolean d;
	private boolean e;

	private av$a(av av1, aw aw1)
	{
		a = av1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field av a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		b = aw1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field aw b>
		if(aw1.c)
	//*   8   14:aload_2         
	//*   9   15:getfield        #30  <Field boolean aw.c>
	//*  10   18:ifeq            26
			av1 = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
		else
	//*  13   23:goto            33
			av1 = ((av) (new boolean[av.e(av1)]));
	//   14   26:aload_1         
	//   15   27:invokestatic    #33  <Method int av.e(av)>
	//   16   30:newarray        boolean[]
	//   17   32:astore_1        
		c = ((boolean []) (av1));
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:putfield        #35  <Field boolean[] c>
	//   21   38:return          
	}

	av$a(av av1, aw aw1, av$1 av$1)
	{
		this(av1, aw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #39  <Method void av$a(av, aw)>
	//    4    6:return          
	}
}
