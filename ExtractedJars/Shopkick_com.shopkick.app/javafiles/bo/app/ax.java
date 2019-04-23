// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.io.*;
import java.nio.charset.Charset;

// Referenced classes of package bo.app:
//			ay

class ax
	implements Closeable
{

	public ax(InputStream inputstream, int i, Charset charset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		if(inputstream != null && charset != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          64
	//*   4    8:aload_3         
	//*   5    9:ifnull          64
		{
			if(i >= 0)
	//*   6   12:iload_2         
	//*   7   13:iflt            54
			{
				if(charset.equals(((Object) (ay.a))))
	//*   8   16:aload_3         
	//*   9   17:getstatic       #26  <Field Charset ay.a>
	//*  10   20:invokevirtual   #32  <Method boolean Charset.equals(Object)>
	//*  11   23:ifeq            44
				{
					a = inputstream;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #34  <Field InputStream a>
					b = charset;
	//   15   31:aload_0         
	//   16   32:aload_3         
	//   17   33:putfield        #36  <Field Charset b>
					c = new byte[i];
	//   18   36:aload_0         
	//   19   37:iload_2         
	//   20   38:newarray        byte[]
	//   21   40:putfield        #38  <Field byte[] c>
					return;
	//   22   43:return          
				} else
				{
					throw new IllegalArgumentException("Unsupported encoding");
	//   23   44:new             #40  <Class IllegalArgumentException>
	//   24   47:dup             
	//   25   48:ldc1            #42  <String "Unsupported encoding">
	//   26   50:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   27   53:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("capacity <= 0");
	//   28   54:new             #40  <Class IllegalArgumentException>
	//   29   57:dup             
	//   30   58:ldc1            #47  <String "capacity <= 0">
	//   31   60:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   32   63:athrow          
			}
		} else
		{
			throw new NullPointerException();
	//   33   64:new             #49  <Class NullPointerException>
	//   34   67:dup             
	//   35   68:invokespecial   #50  <Method void NullPointerException()>
	//   36   71:athrow          
		}
	}

	public ax(InputStream inputstream, Charset charset)
	{
		this(inputstream, 8192, charset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          8192
	//    3    5:aload_2         
	//    4    6:invokespecial   #54  <Method void ax(InputStream, int, Charset)>
	//    5    9:return          
	}

	static Charset a(ax ax1)
	{
		return ax1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Charset b>
	//    2    4:areturn         
	}

	private void c()
	{
		InputStream inputstream = a;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field InputStream a>
	//    2    4:astore_2        
		byte abyte0[] = c;
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field byte[] c>
	//    5    9:astore_3        
		int i = inputstream.read(abyte0, 0, abyte0.length);
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:iconst_0        
	//    9   13:aload_3         
	//   10   14:arraylength     
	//   11   15:invokevirtual   #61  <Method int InputStream.read(byte[], int, int)>
	//   12   18:istore_1        
		if(i != -1)
	//*  13   19:iload_1         
	//*  14   20:iconst_m1       
	//*  15   21:icmpeq          35
		{
			d = 0;
	//   16   24:aload_0         
	//   17   25:iconst_0        
	//   18   26:putfield        #63  <Field int d>
			e = i;
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:putfield        #65  <Field int e>
			return;
	//   22   34:return          
		} else
		{
			throw new EOFException();
	//   23   35:new             #67  <Class EOFException>
	//   24   38:dup             
	//   25   39:invokespecial   #68  <Method void EOFException()>
	//   26   42:athrow          
		}
	}

	public String a()
	{
		InputStream inputstream = a;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field InputStream a>
	//    2    4:astore_3        
		inputstream;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(c == null) goto _L2; else goto _L1
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field byte[] c>
	//    7   11:ifnull          248
_L1:
		int i;
		if(d >= e)
	//*   8   14:aload_0         
	//*   9   15:getfield        #63  <Field int d>
	//*  10   18:aload_0         
	//*  11   19:getfield        #65  <Field int e>
	//*  12   22:icmplt          29
			c();
	//   13   25:aload_0         
	//   14   26:invokespecial   #71  <Method void c()>
		i = d;
	//   15   29:aload_0         
	//   16   30:getfield        #63  <Field int d>
	//   17   33:istore_1        
_L12:
		if(i == e) goto _L4; else goto _L3
	//   18   34:iload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #65  <Field int e>
	//   21   39:icmpeq          125
_L3:
		if(c[i] != 10) goto _L6; else goto _L5
	//   22   42:aload_0         
	//   23   43:getfield        #38  <Field byte[] c>
	//   24   46:iload_1         
	//   25   47:baload          
	//   26   48:bipush          10
	//   27   50:icmpne          270
_L5:
		if(i == d) goto _L8; else goto _L7
	//   28   53:iload_1         
	//   29   54:aload_0         
	//   30   55:getfield        #63  <Field int d>
	//   31   58:icmpeq          265
_L7:
		byte abyte0[] = c;
	//   32   61:aload_0         
	//   33   62:getfield        #38  <Field byte[] c>
	//   34   65:astore          4
		int j = i - 1;
	//   35   67:iload_1         
	//   36   68:iconst_1        
	//   37   69:isub            
	//   38   70:istore_2        
		if(abyte0[j] != 13) goto _L8; else goto _L9
	//   39   71:aload           4
	//   40   73:iload_2         
	//   41   74:baload          
	//   42   75:bipush          13
	//   43   77:icmpne          265
	//*  44   80:goto            83
_L9:
		Object obj;
		obj = ((Object) (new String(c, d, j - d, b.name())));
	//   45   83:new             #73  <Class String>
	//   46   86:dup             
	//   47   87:aload_0         
	//   48   88:getfield        #38  <Field byte[] c>
	//   49   91:aload_0         
	//   50   92:getfield        #63  <Field int d>
	//   51   95:iload_2         
	//   52   96:aload_0         
	//   53   97:getfield        #63  <Field int d>
	//   54  100:isub            
	//   55  101:aload_0         
	//   56  102:getfield        #36  <Field Charset b>
	//   57  105:invokevirtual   #76  <Method String Charset.name()>
	//   58  108:invokespecial   #79  <Method void String(byte[], int, int, String)>
	//   59  111:astore          4
		d = i + 1;
	//   60  113:aload_0         
	//   61  114:iload_1         
	//   62  115:iconst_1        
	//   63  116:iadd            
	//   64  117:putfield        #63  <Field int d>
		inputstream;
	//   65  120:aload_3         
		JVM INSTR monitorexit ;
	//   66  121:monitorexit     
		return ((String) (obj));
	//   67  122:aload           4
	//   68  124:areturn         
_L4:
		obj = ((Object) (new ByteArrayOutputStream((e - d) + 80) {

			public String toString()
			{
				int k;
				if(count > 0 && buf[count - 1] == 13)
			//*   0    0:aload_0         
			//*   1    1:getfield        #25  <Field int count>
			//*   2    4:ifle            33
			//*   3    7:aload_0         
			//*   4    8:getfield        #29  <Field byte[] buf>
			//*   5   11:aload_0         
			//*   6   12:getfield        #25  <Field int count>
			//*   7   15:iconst_1        
			//*   8   16:isub            
			//*   9   17:baload          
			//*  10   18:bipush          13
			//*  11   20:icmpne          33
					k = count - 1;
			//   12   23:aload_0         
			//   13   24:getfield        #25  <Field int count>
			//   14   27:iconst_1        
			//   15   28:isub            
			//   16   29:istore_1        
				else
			//*  17   30:goto            38
					k = count;
			//   18   33:aload_0         
			//   19   34:getfield        #25  <Field int count>
			//   20   37:istore_1        
				String s;
				try
				{
					s = new String(buf, 0, k, ax.a(a).name());
			//   21   38:new             #31  <Class String>
			//   22   41:dup             
			//   23   42:aload_0         
			//   24   43:getfield        #29  <Field byte[] buf>
			//   25   46:iconst_0        
			//   26   47:iload_1         
			//   27   48:aload_0         
			//   28   49:getfield        #14  <Field ax a>
			//   29   52:invokestatic    #34  <Method Charset ax.a(ax)>
			//   30   55:invokevirtual   #39  <Method String Charset.name()>
			//   31   58:invokespecial   #42  <Method void String(byte[], int, int, String)>
			//   32   61:astore_2        
				}
			//*  33   62:aload_2         
			//*  34   63:areturn         
				catch(UnsupportedEncodingException unsupportedencodingexception)
			//*  35   64:astore_2        
				{
					throw new AssertionError(((Object) (unsupportedencodingexception)));
			//   36   65:new             #44  <Class AssertionError>
			//   37   68:dup             
			//   38   69:aload_2         
			//   39   70:invokespecial   #47  <Method void AssertionError(Object)>
			//   40   73:athrow          
				}
				return s;
			}

			final ax a;

			
			{
				a = ax.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ax a>
				super(i);
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:invokespecial   #17  <Method void ByteArrayOutputStream(int)>
			//    6   10:return          
			}
		}
));
	//   69  125:new             #8   <Class ax$1>
	//   70  128:dup             
	//   71  129:aload_0         
	//   72  130:aload_0         
	//   73  131:getfield        #65  <Field int e>
	//   74  134:aload_0         
	//   75  135:getfield        #63  <Field int d>
	//   76  138:isub            
	//   77  139:bipush          80
	//   78  141:iadd            
	//   79  142:invokespecial   #82  <Method void ax$1(ax, int)>
	//   80  145:astore          4
_L11:
		((ByteArrayOutputStream) (obj)).write(c, d, e - d);
	//   81  147:aload           4
	//   82  149:aload_0         
	//   83  150:getfield        #38  <Field byte[] c>
	//   84  153:aload_0         
	//   85  154:getfield        #63  <Field int d>
	//   86  157:aload_0         
	//   87  158:getfield        #65  <Field int e>
	//   88  161:aload_0         
	//   89  162:getfield        #63  <Field int d>
	//   90  165:isub            
	//   91  166:invokevirtual   #88  <Method void ByteArrayOutputStream.write(byte[], int, int)>
		e = -1;
	//   92  169:aload_0         
	//   93  170:iconst_m1       
	//   94  171:putfield        #65  <Field int e>
		c();
	//   95  174:aload_0         
	//   96  175:invokespecial   #71  <Method void c()>
		i = d;
	//   97  178:aload_0         
	//   98  179:getfield        #63  <Field int d>
	//   99  182:istore_1        
_L13:
		if(i == e) goto _L11; else goto _L10
	//  100  183:iload_1         
	//  101  184:aload_0         
	//  102  185:getfield        #65  <Field int e>
	//  103  188:icmpeq          147
_L10:
		if(c[i] != 10)
			break MISSING_BLOCK_LABEL_277;
	//  104  191:aload_0         
	//  105  192:getfield        #38  <Field byte[] c>
	//  106  195:iload_1         
	//  107  196:baload          
	//  108  197:bipush          10
	//  109  199:icmpne          277
		if(i != d)
	//* 110  202:iload_1         
	//* 111  203:aload_0         
	//* 112  204:getfield        #63  <Field int d>
	//* 113  207:icmpeq          229
			((ByteArrayOutputStream) (obj)).write(c, d, i - d);
	//  114  210:aload           4
	//  115  212:aload_0         
	//  116  213:getfield        #38  <Field byte[] c>
	//  117  216:aload_0         
	//  118  217:getfield        #63  <Field int d>
	//  119  220:iload_1         
	//  120  221:aload_0         
	//  121  222:getfield        #63  <Field int d>
	//  122  225:isub            
	//  123  226:invokevirtual   #88  <Method void ByteArrayOutputStream.write(byte[], int, int)>
		d = i + 1;
	//  124  229:aload_0         
	//  125  230:iload_1         
	//  126  231:iconst_1        
	//  127  232:iadd            
	//  128  233:putfield        #63  <Field int d>
		obj = ((Object) (((ByteArrayOutputStream) (obj)).toString()));
	//  129  236:aload           4
	//  130  238:invokevirtual   #91  <Method String ByteArrayOutputStream.toString()>
	//  131  241:astore          4
		inputstream;
	//  132  243:aload_3         
		JVM INSTR monitorexit ;
	//  133  244:monitorexit     
		return ((String) (obj));
	//  134  245:aload           4
	//  135  247:areturn         
_L2:
		throw new IOException("LineReader is closed");
	//  136  248:new             #93  <Class IOException>
	//  137  251:dup             
	//  138  252:ldc1            #95  <String "LineReader is closed">
	//  139  254:invokespecial   #96  <Method void IOException(String)>
	//  140  257:athrow          
		Exception exception;
		exception;
	//  141  258:astore          4
		inputstream;
	//  142  260:aload_3         
		JVM INSTR monitorexit ;
	//  143  261:monitorexit     
		throw exception;
	//  144  262:aload           4
	//  145  264:athrow          
_L8:
		j = i;
	//  146  265:iload_1         
	//  147  266:istore_2        
		  goto _L9
	//* 148  267:goto            83
_L6:
		i++;
	//  149  270:iload_1         
	//  150  271:iconst_1        
	//  151  272:iadd            
	//  152  273:istore_1        
		  goto _L12
	//* 153  274:goto            34
		i++;
	//  154  277:iload_1         
	//  155  278:iconst_1        
	//  156  279:iadd            
	//  157  280:istore_1        
		  goto _L13
	//* 158  281:goto            183
	}

	public boolean b()
	{
		return e == -1;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int e>
	//    2    4:iconst_m1       
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void close()
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field InputStream a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(c != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #38  <Field byte[] c>
	//*   7   11:ifnull          26
			{
				c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #38  <Field byte[] c>
				a.close();
	//   11   19:aload_0         
	//   12   20:getfield        #34  <Field InputStream a>
	//   13   23:invokevirtual   #100 <Method void InputStream.close()>
			}
		}
	//   14   26:aload_1         
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		exception;
	//   17   29:astore_2        
		inputstream;
	//   18   30:aload_1         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw exception;
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	private final InputStream a;
	private final Charset b;
	private byte c[];
	private int d;
	private int e;
}
