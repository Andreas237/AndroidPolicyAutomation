// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;

// Referenced classes of package o:
//			jw

public final class jw$b
{
	class b extends FilterOutputStream
	{

		public void close()
		{
			try
			{
				out.close();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field OutputStream out>
		//    2    4:invokevirtual   #33  <Method void OutputStream.close()>
				return;
		//    3    7:return          
			}
			catch(IOException ioexception)
		//*   4    8:astore_1        
			{
				jw.b.d(b, true);
		//    5    9:aload_0         
		//    6   10:getfield        #14  <Field jw$b b>
		//    7   13:iconst_1        
		//    8   14:invokestatic    #37  <Method boolean jw$b.d(jw$b, boolean)>
		//    9   17:pop             
			}
		//   10   18:return          
		}

		public void flush()
		{
			try
			{
				out.flush();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field OutputStream out>
		//    2    4:invokevirtual   #40  <Method void OutputStream.flush()>
				return;
		//    3    7:return          
			}
			catch(IOException ioexception)
		//*   4    8:astore_1        
			{
				jw.b.d(b, true);
		//    5    9:aload_0         
		//    6   10:getfield        #14  <Field jw$b b>
		//    7   13:iconst_1        
		//    8   14:invokestatic    #37  <Method boolean jw$b.d(jw$b, boolean)>
		//    9   17:pop             
			}
		//   10   18:return          
		}

		public void write(int i)
		{
			try
			{
				out.write(i);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field OutputStream out>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #44  <Method void OutputStream.write(int)>
				return;
		//    4    8:return          
			}
			catch(IOException ioexception)
		//*   5    9:astore_2        
			{
				jw.b.d(b, true);
		//    6   10:aload_0         
		//    7   11:getfield        #14  <Field jw$b b>
		//    8   14:iconst_1        
		//    9   15:invokestatic    #37  <Method boolean jw$b.d(jw$b, boolean)>
		//   10   18:pop             
			}
		//   11   19:return          
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
		//    5    7:invokevirtual   #47  <Method void OutputStream.write(byte[], int, int)>
				return;
		//    6   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*   7   11:astore_1        
			{
				jw.b.d(b, true);
		//    8   12:aload_0         
		//    9   13:getfield        #14  <Field jw$b b>
		//   10   16:iconst_1        
		//   11   17:invokestatic    #37  <Method boolean jw$b.d(jw$b, boolean)>
		//   12   20:pop             
			}
		//   13   21:return          
		}

		final jw.b b;

		private b(OutputStream outputstream)
		{
			b = jw.b.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field jw$b b>
			super(outputstream);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #17  <Method void FilterOutputStream(OutputStream)>
		//    6   10:return          
		}

		b(OutputStream outputstream, jw.a a1)
		{
			this(outputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void jw$b$b(jw$b, OutputStream)>
		//    4    6:return          
		}
	}


	static boolean[] b(jw$b jw$b1)
	{
		return jw$b1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean[] d>
	//    2    4:areturn         
	}

	static jw$c c(jw$b jw$b1)
	{
		return jw$b1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field jw$c e>
	//    2    4:areturn         
	}

	static boolean d(jw$b jw$b1, boolean flag)
	{
		jw$b1.c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean c>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	public OutputStream a(int i)
		throws IOException
	{
		if(i < 0 || i >= jw.d(a))
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field jw a>
	//*   5    9:invokestatic    #34  <Method int jw.d(jw)>
	//*   6   12:icmplt          67
			throw new IllegalArgumentException((new StringBuilder()).append("Expected index ").append(i).append(" to ").append("be greater than 0 and less than the maximum value count ").append("of ").append(jw.d(a)).toString());
	//    7   15:new             #52  <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:new             #54  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #55  <Method void StringBuilder()>
	//   12   26:ldc1            #57  <String "Expected index ">
	//   13   28:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:iload_1         
	//   15   32:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   16   35:ldc1            #66  <String " to ">
	//   17   37:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:ldc1            #68  <String "be greater than 0 and less than the maximum value count ">
	//   19   42:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   20   45:ldc1            #70  <String "of ">
	//   21   47:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   22   50:aload_0         
	//   23   51:getfield        #21  <Field jw a>
	//   24   54:invokestatic    #34  <Method int jw.d(jw)>
	//   25   57:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   26   60:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   27   63:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//   28   66:athrow          
		jw jw1 = a;
	//   29   67:aload_0         
	//   30   68:getfield        #21  <Field jw a>
	//   31   71:astore_3        
		jw1;
	//   32   72:aload_3         
		JVM INSTR monitorenter ;
	//   33   73:monitorenter    
		File file;
		if(jw$c.e(e) != this)
	//*  34   74:aload_0         
	//*  35   75:getfield        #26  <Field jw$c e>
	//*  36   78:invokestatic    #80  <Method jw$b jw$c.e(jw$c)>
	//*  37   81:aload_0         
	//*  38   82:if_acmpeq       93
			throw new IllegalStateException();
	//   39   85:new             #82  <Class IllegalStateException>
	//   40   88:dup             
	//   41   89:invokespecial   #83  <Method void IllegalStateException()>
	//   42   92:athrow          
		if(!jw$c.d(e))
	//*  43   93:aload_0         
	//*  44   94:getfield        #26  <Field jw$c e>
	//*  45   97:invokestatic    #31  <Method boolean jw$c.d(jw$c)>
	//*  46  100:ifne            110
			d[i] = true;
	//   47  103:aload_0         
	//   48  104:getfield        #36  <Field boolean[] d>
	//   49  107:iload_1         
	//   50  108:iconst_1        
	//   51  109:bastore         
		file = e.b(i);
	//   52  110:aload_0         
	//   53  111:getfield        #26  <Field jw$c e>
	//   54  114:iload_1         
	//   55  115:invokevirtual   #86  <Method File jw$c.b(int)>
	//   56  118:astore          4
		Object obj;
		try
		{
			obj = ((Object) (new FileOutputStream(file)));
	//   57  120:new             #88  <Class FileOutputStream>
	//   58  123:dup             
	//   59  124:aload           4
	//   60  126:invokespecial   #91  <Method void FileOutputStream(File)>
	//   61  129:astore_2        
			break MISSING_BLOCK_LABEL_167;
	//   62  130:goto            167
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   63  133:astore_2        
		jw.g(a).mkdirs();
	//   64  134:aload_0         
	//   65  135:getfield        #21  <Field jw a>
	//   66  138:invokestatic    #95  <Method File jw.g(jw)>
	//   67  141:invokevirtual   #101 <Method boolean File.mkdirs()>
	//   68  144:pop             
		try
		{
			obj = ((Object) (new FileOutputStream(file)));
	//   69  145:new             #88  <Class FileOutputStream>
	//   70  148:dup             
	//   71  149:aload           4
	//   72  151:invokespecial   #91  <Method void FileOutputStream(File)>
	//   73  154:astore_2        
			break MISSING_BLOCK_LABEL_167;
	//   74  155:goto            167
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   75  158:astore_2        
		obj = ((Object) (jw.d()));
	//   76  159:invokestatic    #104 <Method OutputStream jw.d()>
	//   77  162:astore_2        
		jw1;
	//   78  163:aload_3         
		JVM INSTR monitorexit ;
	//   79  164:monitorexit     
		return ((OutputStream) (obj));
	//   80  165:aload_2         
	//   81  166:areturn         
		obj = ((Object) (new b(((OutputStream) (obj)), ((jw$a) (null)))));
	//   82  167:new             #9   <Class jw$b$b>
	//   83  170:dup             
	//   84  171:aload_0         
	//   85  172:aload_2         
	//   86  173:aconst_null     
	//   87  174:invokespecial   #107 <Method void jw$b$b(jw$b, OutputStream, jw$a)>
	//   88  177:astore_2        
		jw1;
	//   89  178:aload_3         
		JVM INSTR monitorexit ;
	//   90  179:monitorexit     
		return ((OutputStream) (obj));
	//   91  180:aload_2         
	//   92  181:areturn         
		Exception exception;
		exception;
	//   93  182:astore_2        
	//*  94  183:aload_3         
		throw exception;
	//   95  184:monitorexit     
	//   96  185:aload_2         
	//   97  186:athrow          
	}

	public void c()
		throws IOException
	{
		jw.b(a, this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field jw a>
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #111 <Method void jw.b(jw, jw$b, boolean)>
	//    5    9:return          
	}

	public void d()
		throws IOException
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean c>
	//*   2    4:ifeq            34
		{
			jw.b(a, this, false);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field jw a>
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #111 <Method void jw.b(jw, jw$b, boolean)>
			a.a(jw$c.c(e));
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field jw a>
	//   10   20:aload_0         
	//   11   21:getfield        #26  <Field jw$c e>
	//   12   24:invokestatic    #114 <Method String jw$c.c(jw$c)>
	//   13   27:invokevirtual   #117 <Method boolean jw.a(String)>
	//   14   30:pop             
		} else
	//*  15   31:goto            43
		{
			jw.b(a, this, true);
	//   16   34:aload_0         
	//   17   35:getfield        #21  <Field jw a>
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:invokestatic    #111 <Method void jw.b(jw, jw$b, boolean)>
		}
		b = true;
	//   21   43:aload_0         
	//   22   44:iconst_1        
	//   23   45:putfield        #119 <Field boolean b>
	//   24   48:return          
	}

	final jw a;
	private boolean b;
	private boolean c;
	private final boolean d[];
	private final jw$c e;

	private jw$b(jw jw1, jw$c jw$c1)
	{
		a = jw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field jw a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		e = jw$c1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field jw$c e>
		if(jw$c.d(jw$c1))
	//*   8   14:aload_2         
	//*   9   15:invokestatic    #31  <Method boolean jw$c.d(jw$c)>
	//*  10   18:ifeq            26
			jw1 = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
		else
	//*  13   23:goto            33
			jw1 = ((jw) (new boolean[jw.d(jw1)]));
	//   14   26:aload_1         
	//   15   27:invokestatic    #34  <Method int jw.d(jw)>
	//   16   30:newarray        boolean[]
	//   17   32:astore_1        
		d = ((boolean []) (jw1));
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:putfield        #36  <Field boolean[] d>
	//   21   38:return          
	}

	jw$b(jw jw1, jw$c jw$c1, jw$a jw$a)
	{
		this(jw1, jw$c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void jw$b(jw, jw$c)>
	//    4    6:return          
	}
}
