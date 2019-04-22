// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import java.io.*;

// Referenced classes of package com.firebase.client.utilities:
//			Base64

public static class Base64$OutputStream extends FilterOutputStream
{

	public void close()
		throws IOException
	{
		flushBase64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method void flushBase64()>
		super.close();
	//    2    4:aload_0         
	//    3    5:invokespecial   #61  <Method void FilterOutputStream.close()>
		buffer = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #36  <Field byte[] buffer>
		out = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #65  <Field OutputStream out>
	//   10   18:return          
	}

	public void flushBase64()
		throws IOException
	{
		if(position > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int position>
	//*   2    4:ifle            56
		{
			if(encode)
	//*   3    7:aload_0         
	//*   4    8:getfield        #32  <Field boolean encode>
	//*   5   11:ifeq            46
			{
				out.write(Base64.access$300(b4, buffer, position, options));
	//    6   14:aload_0         
	//    7   15:getfield        #65  <Field OutputStream out>
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field byte[] b4>
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field byte[] buffer>
	//   12   26:aload_0         
	//   13   27:getfield        #38  <Field int position>
	//   14   30:aload_0         
	//   15   31:getfield        #46  <Field int options>
	//   16   34:invokestatic    #70  <Method byte[] Base64.access$300(byte[], byte[], int, int)>
	//   17   37:invokevirtual   #76  <Method void OutputStream.write(byte[])>
				position = 0;
	//   18   40:aload_0         
	//   19   41:iconst_0        
	//   20   42:putfield        #38  <Field int position>
				return;
	//   21   45:return          
			} else
			{
				throw new IOException("Base64 input not properly padded.");
	//   22   46:new             #56  <Class IOException>
	//   23   49:dup             
	//   24   50:ldc1            #78  <String "Base64 input not properly padded.">
	//   25   52:invokespecial   #81  <Method void IOException(String)>
	//   26   55:athrow          
			}
		} else
		{
			return;
	//   27   56:return          
		}
	}

	public void resumeEncoding()
	{
		suspendEncoding = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #42  <Field boolean suspendEncoding>
	//    3    5:return          
	}

	public void suspendEncoding()
		throws IOException
	{
		flushBase64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method void flushBase64()>
		suspendEncoding = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #42  <Field boolean suspendEncoding>
	//    5    9:return          
	}

	public void write(int i)
		throws IOException
	{
label0:
		{
			if(suspendEncoding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean suspendEncoding>
	//*   2    4:ifeq            16
			{
				out.write(i);
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field OutputStream out>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #85  <Method void OutputStream.write(int)>
				return;
	//    7   15:return          
			}
			if(encode)
	//*   8   16:aload_0         
	//*   9   17:getfield        #32  <Field boolean encode>
	//*  10   20:ifeq            128
			{
				byte abyte0[] = buffer;
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field byte[] buffer>
	//   13   27:astore_3        
				int j = position;
	//   14   28:aload_0         
	//   15   29:getfield        #38  <Field int position>
	//   16   32:istore_2        
				position = j + 1;
	//   17   33:aload_0         
	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #38  <Field int position>
				abyte0[j] = (byte)i;
	//   22   40:aload_3         
	//   23   41:iload_2         
	//   24   42:iload_1         
	//   25   43:int2byte        
	//   26   44:bastore         
				if(position >= bufferLength)
	//*  27   45:aload_0         
	//*  28   46:getfield        #38  <Field int position>
	//*  29   49:aload_0         
	//*  30   50:getfield        #34  <Field int bufferLength>
	//*  31   53:icmplt          221
				{
					out.write(Base64.access$300(b4, buffer, bufferLength, options));
	//   32   56:aload_0         
	//   33   57:getfield        #65  <Field OutputStream out>
	//   34   60:aload_0         
	//   35   61:getfield        #44  <Field byte[] b4>
	//   36   64:aload_0         
	//   37   65:getfield        #36  <Field byte[] buffer>
	//   38   68:aload_0         
	//   39   69:getfield        #34  <Field int bufferLength>
	//   40   72:aload_0         
	//   41   73:getfield        #46  <Field int options>
	//   42   76:invokestatic    #70  <Method byte[] Base64.access$300(byte[], byte[], int, int)>
	//   43   79:invokevirtual   #76  <Method void OutputStream.write(byte[])>
					lineLength = lineLength + 4;
	//   44   82:aload_0         
	//   45   83:aload_0         
	//   46   84:getfield        #40  <Field int lineLength>
	//   47   87:iconst_4        
	//   48   88:iadd            
	//   49   89:putfield        #40  <Field int lineLength>
					if(breakLines && lineLength >= 76)
	//*  50   92:aload_0         
	//*  51   93:getfield        #30  <Field boolean breakLines>
	//*  52   96:ifeq            122
	//*  53   99:aload_0         
	//*  54  100:getfield        #40  <Field int lineLength>
	//*  55  103:bipush          76
	//*  56  105:icmplt          122
					{
						out.write(10);
	//   57  108:aload_0         
	//   58  109:getfield        #65  <Field OutputStream out>
	//   59  112:bipush          10
	//   60  114:invokevirtual   #85  <Method void OutputStream.write(int)>
						lineLength = 0;
	//   61  117:aload_0         
	//   62  118:iconst_0        
	//   63  119:putfield        #40  <Field int lineLength>
					}
					position = 0;
	//   64  122:aload_0         
	//   65  123:iconst_0        
	//   66  124:putfield        #38  <Field int position>
					return;
	//   67  127:return          
				}
			} else
			{
				byte abyte1[] = decodabet;
	//   68  128:aload_0         
	//   69  129:getfield        #52  <Field byte[] decodabet>
	//   70  132:astore_3        
				int k = i & 0x7f;
	//   71  133:iload_1         
	//   72  134:bipush          127
	//   73  136:iand            
	//   74  137:istore_2        
				if(abyte1[k] > -5)
	//*  75  138:aload_3         
	//*  76  139:iload_2         
	//*  77  140:baload          
	//*  78  141:bipush          -5
	//*  79  143:icmple          213
				{
					abyte1 = buffer;
	//   80  146:aload_0         
	//   81  147:getfield        #36  <Field byte[] buffer>
	//   82  150:astore_3        
					k = position;
	//   83  151:aload_0         
	//   84  152:getfield        #38  <Field int position>
	//   85  155:istore_2        
					position = k + 1;
	//   86  156:aload_0         
	//   87  157:iload_2         
	//   88  158:iconst_1        
	//   89  159:iadd            
	//   90  160:putfield        #38  <Field int position>
					abyte1[k] = (byte)i;
	//   91  163:aload_3         
	//   92  164:iload_2         
	//   93  165:iload_1         
	//   94  166:int2byte        
	//   95  167:bastore         
					if(position >= bufferLength)
	//*  96  168:aload_0         
	//*  97  169:getfield        #38  <Field int position>
	//*  98  172:aload_0         
	//*  99  173:getfield        #34  <Field int bufferLength>
	//* 100  176:icmplt          221
					{
						i = Base64.access$200(abyte1, 0, b4, 0, options);
	//  101  179:aload_3         
	//  102  180:iconst_0        
	//  103  181:aload_0         
	//  104  182:getfield        #44  <Field byte[] b4>
	//  105  185:iconst_0        
	//  106  186:aload_0         
	//  107  187:getfield        #46  <Field int options>
	//  108  190:invokestatic    #89  <Method int Base64.access$200(byte[], int, byte[], int, int)>
	//  109  193:istore_1        
						out.write(b4, 0, i);
	//  110  194:aload_0         
	//  111  195:getfield        #65  <Field OutputStream out>
	//  112  198:aload_0         
	//  113  199:getfield        #44  <Field byte[] b4>
	//  114  202:iconst_0        
	//  115  203:iload_1         
	//  116  204:invokevirtual   #92  <Method void OutputStream.write(byte[], int, int)>
						position = 0;
	//  117  207:aload_0         
	//  118  208:iconst_0        
	//  119  209:putfield        #38  <Field int position>
						return;
	//  120  212:return          
					}
				} else
				if(abyte1[k] != -5)
					break label0;
	//  121  213:aload_3         
	//  122  214:iload_2         
	//  123  215:baload          
	//  124  216:bipush          -5
	//  125  218:icmpne          222
			}
			return;
	//  126  221:return          
		}
		throw new IOException("Invalid character in Base64 data.");
	//  127  222:new             #56  <Class IOException>
	//  128  225:dup             
	//  129  226:ldc1            #94  <String "Invalid character in Base64 data.">
	//  130  228:invokespecial   #81  <Method void IOException(String)>
	//  131  231:athrow          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		if(suspendEncoding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean suspendEncoding>
	//*   2    4:ifeq            18
		{
			out.write(abyte0, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field OutputStream out>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #92  <Method void OutputStream.write(byte[], int, int)>
			return;
	//    9   17:return          
		}
		for(int k = 0; k < j; k++)
	//*  10   18:iconst_0        
	//*  11   19:istore          4
	//*  12   21:iload           4
	//*  13   23:iload_3         
	//*  14   24:icmpge          46
			write(((int) (abyte0[i + k])));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:iload           4
	//   19   32:iadd            
	//   20   33:baload          
	//   21   34:invokevirtual   #95  <Method void write(int)>

	//   22   37:iload           4
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore          4
	//*  26   43:goto            21
	//   27   46:return          
	}

	private byte b4[];
	private boolean breakLines;
	private byte buffer[];
	private int bufferLength;
	private byte decodabet[];
	private boolean encode;
	private int lineLength;
	private int options;
	private int position;
	private boolean suspendEncoding;

	public Base64$OutputStream(OutputStream outputstream)
	{
		this(outputstream, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #25  <Method void Base64$OutputStream(OutputStream, int)>
	//    4    6:return          
	}

	public Base64$OutputStream(OutputStream outputstream, int i)
	{
		super(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void FilterOutputStream(OutputStream)>
		boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore          5
		boolean flag;
		if((i & 8) != 0)
	//*   5    8:iload_2         
	//*   6    9:bipush          8
	//*   7   11:iand            
	//*   8   12:ifeq            21
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore          4
		else
	//*  11   18:goto            24
			flag = false;
	//   12   21:iconst_0        
	//   13   22:istore          4
		breakLines = flag;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #30  <Field boolean breakLines>
		if((i & 1) != 0)
	//*  17   30:iload_2         
	//*  18   31:iconst_1        
	//*  19   32:iand            
	//*  20   33:ifeq            43
			flag = flag1;
	//   21   36:iload           5
	//   22   38:istore          4
		else
	//*  23   40:goto            46
			flag = false;
	//   24   43:iconst_0        
	//   25   44:istore          4
		encode = flag;
	//   26   46:aload_0         
	//   27   47:iload           4
	//   28   49:putfield        #32  <Field boolean encode>
		int j;
		if(encode)
	//*  29   52:aload_0         
	//*  30   53:getfield        #32  <Field boolean encode>
	//*  31   56:ifeq            64
			j = 3;
	//   32   59:iconst_3        
	//   33   60:istore_3        
		else
	//*  34   61:goto            66
			j = 4;
	//   35   64:iconst_4        
	//   36   65:istore_3        
		bufferLength = j;
	//   37   66:aload_0         
	//   38   67:iload_3         
	//   39   68:putfield        #34  <Field int bufferLength>
		buffer = new byte[bufferLength];
	//   40   71:aload_0         
	//   41   72:aload_0         
	//   42   73:getfield        #34  <Field int bufferLength>
	//   43   76:newarray        byte[]
	//   44   78:putfield        #36  <Field byte[] buffer>
		position = 0;
	//   45   81:aload_0         
	//   46   82:iconst_0        
	//   47   83:putfield        #38  <Field int position>
		lineLength = 0;
	//   48   86:aload_0         
	//   49   87:iconst_0        
	//   50   88:putfield        #40  <Field int lineLength>
		suspendEncoding = false;
	//   51   91:aload_0         
	//   52   92:iconst_0        
	//   53   93:putfield        #42  <Field boolean suspendEncoding>
		b4 = new byte[4];
	//   54   96:aload_0         
	//   55   97:iconst_4        
	//   56   98:newarray        byte[]
	//   57  100:putfield        #44  <Field byte[] b4>
		options = i;
	//   58  103:aload_0         
	//   59  104:iload_2         
	//   60  105:putfield        #46  <Field int options>
		decodabet = Base64.access$000(i);
	//   61  108:aload_0         
	//   62  109:iload_2         
	//   63  110:invokestatic    #50  <Method byte[] Base64.access$000(int)>
	//   64  113:putfield        #52  <Field byte[] decodabet>
	//   65  116:return          
	}
}
