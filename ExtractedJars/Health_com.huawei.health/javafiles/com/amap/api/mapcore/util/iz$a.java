// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			iz

public final class iz$a
{
	class a extends FilterOutputStream
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
				iz.a.a(a, true);
		//    5    9:aload_0         
		//    6   10:getfield        #14  <Field iz$a a>
		//    7   13:iconst_1        
		//    8   14:invokestatic    #36  <Method boolean iz$a.a(iz$a, boolean)>
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
		//    2    4:invokevirtual   #39  <Method void OutputStream.flush()>
				return;
		//    3    7:return          
			}
			catch(IOException ioexception)
		//*   4    8:astore_1        
			{
				iz.a.a(a, true);
		//    5    9:aload_0         
		//    6   10:getfield        #14  <Field iz$a a>
		//    7   13:iconst_1        
		//    8   14:invokestatic    #36  <Method boolean iz$a.a(iz$a, boolean)>
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
		//    3    5:invokevirtual   #43  <Method void OutputStream.write(int)>
				return;
		//    4    8:return          
			}
			catch(IOException ioexception)
		//*   5    9:astore_2        
			{
				iz.a.a(a, true);
		//    6   10:aload_0         
		//    7   11:getfield        #14  <Field iz$a a>
		//    8   14:iconst_1        
		//    9   15:invokestatic    #36  <Method boolean iz$a.a(iz$a, boolean)>
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
		//    5    7:invokevirtual   #46  <Method void OutputStream.write(byte[], int, int)>
				return;
		//    6   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*   7   11:astore_1        
			{
				iz.a.a(a, true);
		//    8   12:aload_0         
		//    9   13:getfield        #14  <Field iz$a a>
		//   10   16:iconst_1        
		//   11   17:invokestatic    #36  <Method boolean iz$a.a(iz$a, boolean)>
		//   12   20:pop             
			}
		//   13   21:return          
		}

		final iz.a a;

		private a(OutputStream outputstream)
		{
			a = iz.a.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field iz$a a>
			super(outputstream);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #17  <Method void FilterOutputStream(OutputStream)>
		//    6   10:return          
		}

		a(OutputStream outputstream, iz._cls1 _pcls1)
		{
			this(outputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void iz$a$a(iz$a, OutputStream)>
		//    4    6:return          
		}
	}


	static iz$c a(iz$a iz$a1)
	{
		return iz$a1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field iz$c b>
	//    2    4:areturn         
	}

	static boolean a(iz$a iz$a1, boolean flag)
	{
		iz$a1.d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field boolean d>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static boolean[] b(iz$a iz$a1)
	{
		return iz$a1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean[] c>
	//    2    4:areturn         
	}

	public OutputStream a(int i)
		throws IOException
	{
		if(i < 0 || i >= iz.e(a))
	//*   0    0:iload_1         
	//*   1    1:iflt            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field iz a>
	//*   5    9:invokestatic    #34  <Method int iz.e(iz)>
	//*   6   12:icmplt          57
			throw new IllegalArgumentException((new StringBuilder()).append("Expected index ").append(i).append(" to be greater than 0 and less than the maximum value count of ").append(iz.e(a)).toString());
	//    7   15:new             #52  <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:new             #54  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #55  <Method void StringBuilder()>
	//   12   26:ldc1            #57  <String "Expected index ">
	//   13   28:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:iload_1         
	//   15   32:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   16   35:ldc1            #66  <String " to be greater than 0 and less than the maximum value count of ">
	//   17   37:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:aload_0         
	//   19   41:getfield        #21  <Field iz a>
	//   20   44:invokestatic    #34  <Method int iz.e(iz)>
	//   21   47:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   22   50:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   24   56:athrow          
		iz iz1 = a;
	//   25   57:aload_0         
	//   26   58:getfield        #21  <Field iz a>
	//   27   61:astore_3        
		iz1;
	//   28   62:aload_3         
		JVM INSTR monitorenter ;
	//   29   63:monitorenter    
		File file;
		if(iz$c.a(b) != this)
	//*  30   64:aload_0         
	//*  31   65:getfield        #26  <Field iz$c b>
	//*  32   68:invokestatic    #76  <Method iz$a iz$c.a(iz$c)>
	//*  33   71:aload_0         
	//*  34   72:if_acmpeq       83
			throw new IllegalStateException();
	//   35   75:new             #78  <Class IllegalStateException>
	//   36   78:dup             
	//   37   79:invokespecial   #79  <Method void IllegalStateException()>
	//   38   82:athrow          
		if(!iz$c.d(b))
	//*  39   83:aload_0         
	//*  40   84:getfield        #26  <Field iz$c b>
	//*  41   87:invokestatic    #31  <Method boolean iz$c.d(iz$c)>
	//*  42   90:ifne            100
			c[i] = true;
	//   43   93:aload_0         
	//   44   94:getfield        #36  <Field boolean[] c>
	//   45   97:iload_1         
	//   46   98:iconst_1        
	//   47   99:bastore         
		file = b.b(i);
	//   48  100:aload_0         
	//   49  101:getfield        #26  <Field iz$c b>
	//   50  104:iload_1         
	//   51  105:invokevirtual   #82  <Method File iz$c.b(int)>
	//   52  108:astore          4
		Object obj;
		try
		{
			obj = ((Object) (new FileOutputStream(file)));
	//   53  110:new             #84  <Class FileOutputStream>
	//   54  113:dup             
	//   55  114:aload           4
	//   56  116:invokespecial   #87  <Method void FileOutputStream(File)>
	//   57  119:astore_2        
			break MISSING_BLOCK_LABEL_157;
	//   58  120:goto            157
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   59  123:astore_2        
		iz.f(a).mkdirs();
	//   60  124:aload_0         
	//   61  125:getfield        #21  <Field iz a>
	//   62  128:invokestatic    #91  <Method File iz.f(iz)>
	//   63  131:invokevirtual   #97  <Method boolean File.mkdirs()>
	//   64  134:pop             
		try
		{
			obj = ((Object) (new FileOutputStream(file)));
	//   65  135:new             #84  <Class FileOutputStream>
	//   66  138:dup             
	//   67  139:aload           4
	//   68  141:invokespecial   #87  <Method void FileOutputStream(File)>
	//   69  144:astore_2        
			break MISSING_BLOCK_LABEL_157;
	//   70  145:goto            157
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   71  148:astore_2        
		obj = ((Object) (iz.g()));
	//   72  149:invokestatic    #101 <Method OutputStream iz.g()>
	//   73  152:astore_2        
		iz1;
	//   74  153:aload_3         
		JVM INSTR monitorexit ;
	//   75  154:monitorexit     
		return ((OutputStream) (obj));
	//   76  155:aload_2         
	//   77  156:areturn         
		obj = ((Object) (new a(((OutputStream) (obj)), ((iz$1) (null)))));
	//   78  157:new             #9   <Class iz$a$a>
	//   79  160:dup             
	//   80  161:aload_0         
	//   81  162:aload_2         
	//   82  163:aconst_null     
	//   83  164:invokespecial   #104 <Method void iz$a$a(iz$a, OutputStream, iz$1)>
	//   84  167:astore_2        
		iz1;
	//   85  168:aload_3         
		JVM INSTR monitorexit ;
	//   86  169:monitorexit     
		return ((OutputStream) (obj));
	//   87  170:aload_2         
	//   88  171:areturn         
		Exception exception;
		exception;
	//   89  172:astore_2        
	//*  90  173:aload_3         
		throw exception;
	//   91  174:monitorexit     
	//   92  175:aload_2         
	//   93  176:athrow          
	}

	public void a()
		throws IOException
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field boolean d>
	//*   2    4:ifeq            34
		{
			iz.a(a, this, false);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field iz a>
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #108 <Method void iz.a(iz, iz$a, boolean)>
			a.c(iz$c.c(b));
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field iz a>
	//   10   20:aload_0         
	//   11   21:getfield        #26  <Field iz$c b>
	//   12   24:invokestatic    #111 <Method String iz$c.c(iz$c)>
	//   13   27:invokevirtual   #114 <Method boolean iz.c(String)>
	//   14   30:pop             
		} else
	//*  15   31:goto            43
		{
			iz.a(a, this, true);
	//   16   34:aload_0         
	//   17   35:getfield        #21  <Field iz a>
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:invokestatic    #108 <Method void iz.a(iz, iz$a, boolean)>
		}
		e = true;
	//   21   43:aload_0         
	//   22   44:iconst_1        
	//   23   45:putfield        #116 <Field boolean e>
	//   24   48:return          
	}

	public void b()
		throws IOException
	{
		iz.a(a, this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field iz a>
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #108 <Method void iz.a(iz, iz$a, boolean)>
	//    5    9:return          
	}

	final iz a;
	private final iz$c b;
	private final boolean c[];
	private boolean d;
	private boolean e;

	private iz$a(iz iz1, iz$c iz$c1)
	{
		a = iz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field iz a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		b = iz$c1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field iz$c b>
		if(iz$c.d(iz$c1))
	//*   8   14:aload_2         
	//*   9   15:invokestatic    #31  <Method boolean iz$c.d(iz$c)>
	//*  10   18:ifeq            26
			iz1 = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
		else
	//*  13   23:goto            33
			iz1 = ((iz) (new boolean[iz.e(iz1)]));
	//   14   26:aload_1         
	//   15   27:invokestatic    #34  <Method int iz.e(iz)>
	//   16   30:newarray        boolean[]
	//   17   32:astore_1        
		c = ((boolean []) (iz1));
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:putfield        #36  <Field boolean[] c>
	//   21   38:return          
	}

	iz$a(iz iz1, iz$c iz$c1, iz$1 iz$1)
	{
		this(iz1, iz$c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void iz$a(iz, iz$c)>
	//    4    6:return          
	}
}
