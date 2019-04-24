// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.io.*;
import java.nio.charset.Charset;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			Util

class StrictLineReader
	implements Closeable
{

	public StrictLineReader(InputStream inputstream, int i, Charset charset1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		if(inputstream == null || charset1 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          12
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       20
			throw new NullPointerException();
	//    6   12:new             #29  <Class NullPointerException>
	//    7   15:dup             
	//    8   16:invokespecial   #30  <Method void NullPointerException()>
	//    9   19:athrow          
		if(i < 0)
	//*  10   20:iload_2         
	//*  11   21:ifge            34
			throw new IllegalArgumentException("capacity <= 0");
	//   12   24:new             #32  <Class IllegalArgumentException>
	//   13   27:dup             
	//   14   28:ldc1            #34  <String "capacity <= 0">
	//   15   30:invokespecial   #37  <Method void IllegalArgumentException(String)>
	//   16   33:athrow          
		if(!charset1.equals(((Object) (Util.US_ASCII))))
	//*  17   34:aload_3         
	//*  18   35:getstatic       #42  <Field Charset Util.US_ASCII>
	//*  19   38:invokevirtual   #48  <Method boolean Charset.equals(Object)>
	//*  20   41:ifne            54
		{
			throw new IllegalArgumentException("Unsupported encoding");
	//   21   44:new             #32  <Class IllegalArgumentException>
	//   22   47:dup             
	//   23   48:ldc1            #50  <String "Unsupported encoding">
	//   24   50:invokespecial   #37  <Method void IllegalArgumentException(String)>
	//   25   53:athrow          
		} else
		{
			in = inputstream;
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:putfield        #52  <Field InputStream in>
			charset = charset1;
	//   29   59:aload_0         
	//   30   60:aload_3         
	//   31   61:putfield        #54  <Field Charset charset>
			buf = new byte[i];
	//   32   64:aload_0         
	//   33   65:iload_2         
	//   34   66:newarray        byte[]
	//   35   68:putfield        #56  <Field byte[] buf>
			return;
	//   36   71:return          
		}
	}

	public StrictLineReader(InputStream inputstream, Charset charset1)
	{
		this(inputstream, 8192, charset1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          8192
	//    3    5:aload_2         
	//    4    6:invokespecial   #60  <Method void StrictLineReader(InputStream, int, Charset)>
	//    5    9:return          
	}

	private void fillBuf()
		throws IOException
	{
		int i = in.read(buf, 0, buf.length);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream in>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field byte[] buf>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #56  <Field byte[] buf>
	//    7   13:arraylength     
	//    8   14:invokevirtual   #71  <Method int InputStream.read(byte[], int, int)>
	//    9   17:istore_1        
		if(i == -1)
	//*  10   18:iload_1         
	//*  11   19:iconst_m1       
	//*  12   20:icmpne          31
		{
			throw new EOFException();
	//   13   23:new             #73  <Class EOFException>
	//   14   26:dup             
	//   15   27:invokespecial   #74  <Method void EOFException()>
	//   16   30:athrow          
		} else
		{
			pos = 0;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #76  <Field int pos>
			end = i;
	//   20   36:aload_0         
	//   21   37:iload_1         
	//   22   38:putfield        #78  <Field int end>
			return;
	//   23   41:return          
		}
	}

	public void close()
		throws IOException
	{
		InputStream inputstream = in;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream in>
	//    2    4:astore_1        
		inputstream;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(buf != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #56  <Field byte[] buf>
	//*   7   11:ifnull          26
		{
			buf = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #56  <Field byte[] buf>
			in.close();
	//   11   19:aload_0         
	//   12   20:getfield        #52  <Field InputStream in>
	//   13   23:invokevirtual   #82  <Method void InputStream.close()>
		}
		inputstream;
	//   14   26:aload_1         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		Exception exception;
		exception;
	//   17   29:astore_2        
	//*  18   30:aload_1         
		throw exception;
	//   19   31:monitorexit     
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	public boolean hasUnterminatedLine()
	{
		return end == -1;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int end>
	//    2    4:iconst_m1       
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public String readLine()
		throws IOException
	{
		InputStream inputstream = in;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field InputStream in>
	//    2    4:astore_3        
		inputstream;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i;
		if(buf == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #56  <Field byte[] buf>
	//*   7   11:ifnonnull       24
			throw new IOException("LineReader is closed");
	//    8   14:new             #65  <Class IOException>
	//    9   17:dup             
	//   10   18:ldc1            #88  <String "LineReader is closed">
	//   11   20:invokespecial   #89  <Method void IOException(String)>
	//   12   23:athrow          
		if(pos >= end)
	//*  13   24:aload_0         
	//*  14   25:getfield        #76  <Field int pos>
	//*  15   28:aload_0         
	//*  16   29:getfield        #78  <Field int end>
	//*  17   32:icmplt          39
			fillBuf();
	//   18   35:aload_0         
	//   19   36:invokespecial   #91  <Method void fillBuf()>
		i = pos;
	//   20   39:aload_0         
	//   21   40:getfield        #76  <Field int pos>
	//   22   43:istore_1        
_L1:
		if(i == end)
			break MISSING_BLOCK_LABEL_140;
	//   23   44:iload_1         
	//   24   45:aload_0         
	//   25   46:getfield        #78  <Field int end>
	//   26   49:icmpeq          140
		if(buf[i] != 10)
			break MISSING_BLOCK_LABEL_133;
	//   27   52:aload_0         
	//   28   53:getfield        #56  <Field byte[] buf>
	//   29   56:iload_1         
	//   30   57:baload          
	//   31   58:bipush          10
	//   32   60:icmpne          133
		int j;
		Object obj;
		Exception exception;
		if(i != pos && buf[i - 1] == 13)
	//*  33   63:iload_1         
	//*  34   64:aload_0         
	//*  35   65:getfield        #76  <Field int pos>
	//*  36   68:icmpeq          280
	//*  37   71:aload_0         
	//*  38   72:getfield        #56  <Field byte[] buf>
	//*  39   75:iload_1         
	//*  40   76:iconst_1        
	//*  41   77:isub            
	//*  42   78:baload          
	//*  43   79:bipush          13
	//*  44   81:icmpne          280
			j = i - 1;
	//   45   84:iload_1         
	//   46   85:iconst_1        
	//   47   86:isub            
	//   48   87:istore_2        
		else
	//*  49   88:goto            91
	//*  50   91:new             #93  <Class String>
	//*  51   94:dup             
	//*  52   95:aload_0         
	//*  53   96:getfield        #56  <Field byte[] buf>
	//*  54   99:aload_0         
	//*  55  100:getfield        #76  <Field int pos>
	//*  56  103:iload_2         
	//*  57  104:aload_0         
	//*  58  105:getfield        #76  <Field int pos>
	//*  59  108:isub            
	//*  60  109:aload_0         
	//*  61  110:getfield        #54  <Field Charset charset>
	//*  62  113:invokevirtual   #96  <Method String Charset.name()>
	//*  63  116:invokespecial   #99  <Method void String(byte[], int, int, String)>
	//*  64  119:astore          4
	//*  65  121:aload_0         
	//*  66  122:iload_1         
	//*  67  123:iconst_1        
	//*  68  124:iadd            
	//*  69  125:putfield        #76  <Field int pos>
	//*  70  128:aload_3         
	//*  71  129:monitorexit     
	//*  72  130:aload           4
	//*  73  132:areturn         
	//*  74  133:iload_1         
	//*  75  134:iconst_1        
	//*  76  135:iadd            
	//*  77  136:istore_1        
	//*  78  137:goto            44
	//*  79  140:new             #8   <Class StrictLineReader$1>
	//*  80  143:dup             
	//*  81  144:aload_0         
	//*  82  145:aload_0         
	//*  83  146:getfield        #78  <Field int end>
	//*  84  149:aload_0         
	//*  85  150:getfield        #76  <Field int pos>
	//*  86  153:isub            
	//*  87  154:bipush          80
	//*  88  156:iadd            
	//*  89  157:invokespecial   #102 <Method void StrictLineReader$1(StrictLineReader, int)>
	//*  90  160:astore          4
	//*  91  162:aload           4
	//*  92  164:aload_0         
	//*  93  165:getfield        #56  <Field byte[] buf>
	//*  94  168:aload_0         
	//*  95  169:getfield        #76  <Field int pos>
	//*  96  172:aload_0         
	//*  97  173:getfield        #78  <Field int end>
	//*  98  176:aload_0         
	//*  99  177:getfield        #76  <Field int pos>
	//* 100  180:isub            
	//* 101  181:invokevirtual   #108 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//* 102  184:aload_0         
	//* 103  185:iconst_m1       
	//* 104  186:putfield        #78  <Field int end>
	//* 105  189:aload_0         
	//* 106  190:invokespecial   #91  <Method void fillBuf()>
	//* 107  193:aload_0         
	//* 108  194:getfield        #76  <Field int pos>
	//* 109  197:istore_1        
	//* 110  198:iload_1         
	//* 111  199:aload_0         
	//* 112  200:getfield        #78  <Field int end>
	//* 113  203:icmpeq          270
	//* 114  206:aload_0         
	//* 115  207:getfield        #56  <Field byte[] buf>
	//* 116  210:iload_1         
	//* 117  211:baload          
	//* 118  212:bipush          10
	//* 119  214:icmpne          263
	//* 120  217:iload_1         
	//* 121  218:aload_0         
	//* 122  219:getfield        #76  <Field int pos>
	//* 123  222:icmpeq          244
	//* 124  225:aload           4
	//* 125  227:aload_0         
	//* 126  228:getfield        #56  <Field byte[] buf>
	//* 127  231:aload_0         
	//* 128  232:getfield        #76  <Field int pos>
	//* 129  235:iload_1         
	//* 130  236:aload_0         
	//* 131  237:getfield        #76  <Field int pos>
	//* 132  240:isub            
	//* 133  241:invokevirtual   #108 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//* 134  244:aload_0         
	//* 135  245:iload_1         
	//* 136  246:iconst_1        
	//* 137  247:iadd            
	//* 138  248:putfield        #76  <Field int pos>
	//* 139  251:aload           4
	//* 140  253:invokevirtual   #111 <Method String ByteArrayOutputStream.toString()>
	//* 141  256:astore          4
	//* 142  258:aload_3         
	//* 143  259:monitorexit     
	//* 144  260:aload           4
	//* 145  262:areturn         
	//* 146  263:iload_1         
	//* 147  264:iconst_1        
	//* 148  265:iadd            
	//* 149  266:istore_1        
	//* 150  267:goto            198
	//* 151  270:goto            162
	//* 152  273:astore          4
	//* 153  275:aload_3         
	//* 154  276:monitorexit     
	//* 155  277:aload           4
	//* 156  279:athrow          
			j = i;
	//  157  280:iload_1         
	//  158  281:istore_2        
		obj = ((Object) (new String(buf, pos, j - pos, charset.name())));
		pos = i + 1;
		inputstream;
		JVM INSTR monitorexit ;
		return ((String) (obj));
		i++;
		  goto _L1
		obj = ((Object) (new ByteArrayOutputStream((end - pos) + 80) {

			public String toString()
			{
				int k;
				if(count > 0 && buf[count - 1] == 13)
			//*   0    0:aload_0         
			//*   1    1:getfield        #26  <Field int count>
			//*   2    4:ifle            33
			//*   3    7:aload_0         
			//*   4    8:getfield        #30  <Field byte[] buf>
			//*   5   11:aload_0         
			//*   6   12:getfield        #26  <Field int count>
			//*   7   15:iconst_1        
			//*   8   16:isub            
			//*   9   17:baload          
			//*  10   18:bipush          13
			//*  11   20:icmpne          33
					k = count - 1;
			//   12   23:aload_0         
			//   13   24:getfield        #26  <Field int count>
			//   14   27:iconst_1        
			//   15   28:isub            
			//   16   29:istore_1        
				else
			//*  17   30:goto            38
					k = count;
			//   18   33:aload_0         
			//   19   34:getfield        #26  <Field int count>
			//   20   37:istore_1        
				String s;
				try
				{
					s = new String(buf, 0, k, charset.name());
			//   21   38:new             #32  <Class String>
			//   22   41:dup             
			//   23   42:aload_0         
			//   24   43:getfield        #30  <Field byte[] buf>
			//   25   46:iconst_0        
			//   26   47:iload_1         
			//   27   48:aload_0         
			//   28   49:getfield        #15  <Field StrictLineReader this$0>
			//   29   52:invokestatic    #36  <Method Charset StrictLineReader.access$000(StrictLineReader)>
			//   30   55:invokevirtual   #41  <Method String Charset.name()>
			//   31   58:invokespecial   #44  <Method void String(byte[], int, int, String)>
			//   32   61:astore_2        
				}
			//*  33   62:aload_2         
			//*  34   63:areturn         
				catch(UnsupportedEncodingException unsupportedencodingexception)
			//*  35   64:astore_2        
				{
					throw new AssertionError(((Object) (unsupportedencodingexception)));
			//   36   65:new             #46  <Class AssertionError>
			//   37   68:dup             
			//   38   69:aload_2         
			//   39   70:invokespecial   #49  <Method void AssertionError(Object)>
			//   40   73:athrow          
				}
				return s;
			}

			final StrictLineReader this$0;

			
			{
				this$0 = StrictLineReader.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field StrictLineReader this$0>
				super(i);
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:invokespecial   #18  <Method void ByteArrayOutputStream(int)>
			//    6   10:return          
			}
		}
));
_L7:
		((ByteArrayOutputStream) (obj)).write(buf, pos, end - pos);
		end = -1;
		fillBuf();
		i = pos;
_L5:
		if(i == end)
			break; /* Loop/switch isn't completed */
		if(buf[i] != 10) goto _L3; else goto _L2
_L2:
		if(i != pos)
			((ByteArrayOutputStream) (obj)).write(buf, pos, i - pos);
		pos = i + 1;
		obj = ((Object) (((ByteArrayOutputStream) (obj)).toString()));
		inputstream;
		JVM INSTR monitorexit ;
		return ((String) (obj));
_L3:
		i++;
		if(true) goto _L5; else goto _L4
_L4:
		if(true) goto _L7; else goto _L6
_L6:
		exception;
		throw exception;
	//* 159  282:goto            91
	}

	private static final byte CR = 13;
	private static final byte LF = 10;
	private byte buf[];
	private final Charset charset;
	private int end;
	private final InputStream in;
	private int pos;


/*
	static Charset access$000(StrictLineReader strictlinereader)
	{
		return strictlinereader.charset;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Charset charset>
	//    2    4:areturn         
	}

*/
}
