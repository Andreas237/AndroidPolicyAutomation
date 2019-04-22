// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.e;

import android.net.Uri;
import java.io.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.e:
//			n, m, f, j

public final class j
	implements n
{
	public static class a extends Writer
	{
		static class a
			implements CharSequence
		{

			public char charAt(int i)
			{
				return a[i];
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field char[] a>
			//    2    4:iload_1         
			//    3    5:caload          
			//    4    6:ireturn         
			}

			public int length()
			{
				return a.length;
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field char[] a>
			//    2    4:arraylength     
			//    3    5:ireturn         
			}

			public CharSequence subSequence(int i, int k)
			{
				return ((CharSequence) (new String(a, i, k - i)));
			//    0    0:new             #27  <Class String>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field char[] a>
			//    4    8:iload_1         
			//    5    9:iload_2         
			//    6   10:iload_1         
			//    7   11:isub            
			//    8   12:invokespecial   #30  <Method void String(char[], int, int)>
			//    9   15:areturn         
			}

			char a[];

			a()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #16  <Method void Object()>
			//    2    4:return          
			}
		}


		public void close()
		{
		//    0    0:return          
		}

		public void flush()
		{
		//    0    0:return          
		}

		public void write(int i)
			throws IOException
		{
			a.append((char)i);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Appendable a>
		//    2    4:iload_1         
		//    3    5:int2char        
		//    4    6:invokeinterface #38  <Method Appendable Appendable.append(char)>
		//    5   11:pop             
		//    6   12:return          
		}

		public void write(char ac[], int i, int k)
			throws IOException
		{
			a a1 = b;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field j$a$a b>
		//    2    4:astore          4
			a1.a = ac;
		//    3    6:aload           4
		//    4    8:aload_1         
		//    5    9:putfield        #43  <Field char[] j$a$a.a>
			a.append(((CharSequence) (a1)), i, k + i);
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field Appendable a>
		//    8   16:aload           4
		//    9   18:iload_2         
		//   10   19:iload_3         
		//   11   20:iload_2         
		//   12   21:iadd            
		//   13   22:invokeinterface #46  <Method Appendable Appendable.append(CharSequence, int, int)>
		//   14   27:pop             
		//   15   28:return          
		}

		private final Appendable a;
		private final a b;

		private a(Appendable appendable)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Writer()>
			b = new a();
		//    2    4:aload_0         
		//    3    5:new             #9   <Class j$a$a>
		//    4    8:dup             
		//    5    9:invokespecial   #18  <Method void j$a$a()>
		//    6   12:putfield        #20  <Field j$a$a b>
			a = appendable;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #22  <Field Appendable a>
		//   10   20:return          
		}

		a(Appendable appendable, _cls1 _pcls1)
		{
			this(appendable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void j$a(Appendable)>
		//    3    5:return          
		}
	}


	public j()
	{
		this(((m) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #23  <Method void j(m)>
	//    3    5:return          
	}

	public j(m m1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = m1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field m a>
	//    5    9:return          
	}

	public int a(byte abyte0[], int i, int k)
		throws a
	{
		long l = d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long d>
	//    2    4:lstore          4
		if(l == 0L)
	//*   3    6:lload           4
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		try
		{
			i = b.read(abyte0, i, (int)Math.min(l, k));
	//    9   15:aload_0         
	//   10   16:getfield        #35  <Field RandomAccessFile b>
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:lload           4
	//   14   23:iload_3         
	//   15   24:i2l             
	//   16   25:invokestatic    #41  <Method long Math.min(long, long)>
	//   17   28:l2i             
	//   18   29:invokevirtual   #46  <Method int RandomAccessFile.read(byte[], int, int)>
	//   19   32:istore_2        
		}
	//*  20   33:iload_2         
	//*  21   34:ifle            64
	//*  22   37:aload_0         
	//*  23   38:aload_0         
	//*  24   39:getfield        #33  <Field long d>
	//*  25   42:iload_2         
	//*  26   43:i2l             
	//*  27   44:lsub            
	//*  28   45:putfield        #33  <Field long d>
	//*  29   48:aload_0         
	//*  30   49:getfield        #28  <Field m a>
	//*  31   52:astore_1        
	//*  32   53:aload_1         
	//*  33   54:ifnull          64
	//*  34   57:aload_1         
	//*  35   58:iload_2         
	//*  36   59:invokeinterface #51  <Method void m.a(int)>
	//*  37   64:iload_2         
	//*  38   65:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  39   66:astore_1        
		{
			throw new a(((IOException) (abyte0)));
	//   40   67:new             #8   <Class j$a>
	//   41   70:dup             
	//   42   71:aload_1         
	//   43   72:invokespecial   #54  <Method void j$a(IOException)>
	//   44   75:athrow          
		}
		if(i > 0)
		{
			d = d - (long)i;
			abyte0 = ((byte []) (a));
			if(abyte0 != null)
				((m) (abyte0)).a(i);
		}
		return i;
	}

	public long a(f f1)
		throws a
	{
		long l;
		c = f1.a.toString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #61  <Field Uri f.a>
	//    3    5:invokevirtual   #67  <Method String Uri.toString()>
	//    4    8:putfield        #69  <Field String c>
		b = new RandomAccessFile(f1.a.getPath(), "r");
	//    5   11:aload_0         
	//    6   12:new             #43  <Class RandomAccessFile>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:getfield        #61  <Field Uri f.a>
	//   10   20:invokevirtual   #72  <Method String Uri.getPath()>
	//   11   23:ldc1            #74  <String "r">
	//   12   25:invokespecial   #77  <Method void RandomAccessFile(String, String)>
	//   13   28:putfield        #35  <Field RandomAccessFile b>
		b.seek(f1.d);
	//   14   31:aload_0         
	//   15   32:getfield        #35  <Field RandomAccessFile b>
	//   16   35:aload_1         
	//   17   36:getfield        #78  <Field long f.d>
	//   18   39:invokevirtual   #82  <Method void RandomAccessFile.seek(long)>
		if(f1.e == -1L)
	//*  19   42:aload_1         
	//*  20   43:getfield        #84  <Field long f.e>
	//*  21   46:ldc2w           #85  <Long -1L>
	//*  22   49:lcmp            
	//*  23   50:ifne            69
		{
			l = b.length() - f1.d;
	//   24   53:aload_0         
	//   25   54:getfield        #35  <Field RandomAccessFile b>
	//   26   57:invokevirtual   #90  <Method long RandomAccessFile.length()>
	//   27   60:aload_1         
	//   28   61:getfield        #78  <Field long f.d>
	//   29   64:lsub            
	//   30   65:lstore_2        
			break MISSING_BLOCK_LABEL_74;
	//   31   66:goto            74
		}
		l = f1.e;
	//   32   69:aload_1         
	//   33   70:getfield        #84  <Field long f.e>
	//   34   73:lstore_2        
		d = l;
	//   35   74:aload_0         
	//   36   75:lload_2         
	//   37   76:putfield        #33  <Field long d>
		l = d;
	//   38   79:aload_0         
	//   39   80:getfield        #33  <Field long d>
	//   40   83:lstore_2        
		if(l >= 0L)
	//*  41   84:lload_2         
	//*  42   85:lconst_0        
	//*  43   86:lcmp            
	//*  44   87:iflt            115
		{
			e = true;
	//   45   90:aload_0         
	//   46   91:iconst_1        
	//   47   92:putfield        #92  <Field boolean e>
			f1 = ((f) (a));
	//   48   95:aload_0         
	//   49   96:getfield        #28  <Field m a>
	//   50   99:astore_1        
			if(f1 != null)
	//*  51  100:aload_1         
	//*  52  101:ifnull          110
				((m) (f1)).a();
	//   53  104:aload_1         
	//   54  105:invokeinterface #94  <Method void m.a()>
			return d;
	//   55  110:aload_0         
	//   56  111:getfield        #33  <Field long d>
	//   57  114:lreturn         
		}
		try
		{
			throw new EOFException();
	//   58  115:new             #96  <Class EOFException>
	//   59  118:dup             
	//   60  119:invokespecial   #97  <Method void EOFException()>
	//   61  122:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(f f1)
	//*  62  123:astore_1        
		{
			throw new a(((IOException) (f1)));
	//   63  124:new             #8   <Class j$a>
	//   64  127:dup             
	//   65  128:aload_1         
	//   66  129:invokespecial   #54  <Method void j$a(IOException)>
	//   67  132:athrow          
		}
	}

	public void a()
		throws a
	{
		RandomAccessFile randomaccessfile;
		c = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #69  <Field String c>
		randomaccessfile = b;
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field RandomAccessFile b>
	//    5    9:astore_1        
		if(randomaccessfile == null)
			break MISSING_BLOCK_LABEL_99;
	//    6   10:aload_1         
	//    7   11:ifnull          99
		randomaccessfile.close();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #100 <Method void RandomAccessFile.close()>
		b = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #35  <Field RandomAccessFile b>
		if(e)
	//*  13   23:aload_0         
	//*  14   24:getfield        #92  <Field boolean e>
	//*  15   27:ifeq            99
		{
			e = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #92  <Field boolean e>
			m m1 = a;
	//   19   35:aload_0         
	//   20   36:getfield        #28  <Field m a>
	//   21   39:astore_1        
			if(m1 != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          99
			{
				m1.b();
	//   24   44:aload_1         
	//   25   45:invokeinterface #102 <Method void m.b()>
				return;
	//   26   50:return          
			}
		}
		break MISSING_BLOCK_LABEL_99;
		Object obj;
		obj;
	//   27   51:astore_1        
		break MISSING_BLOCK_LABEL_65;
	//   28   52:goto            65
		obj;
	//   29   55:astore_1        
		throw new a(((IOException) (obj)));
	//   30   56:new             #8   <Class j$a>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokespecial   #54  <Method void j$a(IOException)>
	//   34   64:athrow          
		b = null;
	//   35   65:aload_0         
	//   36   66:aconst_null     
	//   37   67:putfield        #35  <Field RandomAccessFile b>
		if(e)
	//*  38   70:aload_0         
	//*  39   71:getfield        #92  <Field boolean e>
	//*  40   74:ifeq            97
		{
			e = false;
	//   41   77:aload_0         
	//   42   78:iconst_0        
	//   43   79:putfield        #92  <Field boolean e>
			m m2 = a;
	//   44   82:aload_0         
	//   45   83:getfield        #28  <Field m a>
	//   46   86:astore_2        
			if(m2 != null)
	//*  47   87:aload_2         
	//*  48   88:ifnull          97
				m2.b();
	//   49   91:aload_2         
	//   50   92:invokeinterface #102 <Method void m.b()>
		}
		throw obj;
	//   51   97:aload_1         
	//   52   98:athrow          
	//   53   99:return          
	}

	private final m a;
	private RandomAccessFile b;
	private String c;
	private long d;
	private boolean e;
}
