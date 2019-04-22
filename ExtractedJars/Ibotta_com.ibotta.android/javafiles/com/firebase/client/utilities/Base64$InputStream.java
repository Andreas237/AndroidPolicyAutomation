// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import java.io.*;

// Referenced classes of package com.firebase.client.utilities:
//			Base64

public static class Base64$InputStream extends FilterInputStream
{

	public int read()
		throws IOException
	{
		if(position < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int position>
	//*   2    4:ifge            199
			if(encode)
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field boolean encode>
	//*   5   11:ifeq            93
			{
				byte abyte0[] = new byte[3];
	//    6   14:iconst_3        
	//    7   15:newarray        byte[]
	//    8   17:astore          4
				int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
				int l = 0;
	//   11   21:iconst_0        
	//   12   22:istore_2        
				do
				{
					if(i >= 3)
						break;
	//   13   23:iload_1         
	//   14   24:iconst_3        
	//   15   25:icmpge          57
					int j1 = in.read();
	//   16   28:aload_0         
	//   17   29:getfield        #55  <Field InputStream in>
	//   18   32:invokevirtual   #59  <Method int InputStream.read()>
	//   19   35:istore_3        
					if(j1 < 0)
						break;
	//   20   36:iload_3         
	//   21   37:iflt            57
					abyte0[i] = (byte)j1;
	//   22   40:aload           4
	//   23   42:iload_1         
	//   24   43:iload_3         
	//   25   44:int2byte        
	//   26   45:bastore         
					l++;
	//   27   46:iload_2         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_2        
					i++;
	//   31   50:iload_1         
	//   32   51:iconst_1        
	//   33   52:iadd            
	//   34   53:istore_1        
				} while(true);
	//   35   54:goto            23
				if(l > 0)
	//*  36   57:iload_2         
	//*  37   58:ifle            91
				{
					Base64.access$100(abyte0, 0, l, buffer, 0, options);
	//   38   61:aload           4
	//   39   63:iconst_0        
	//   40   64:iload_2         
	//   41   65:aload_0         
	//   42   66:getfield        #37  <Field byte[] buffer>
	//   43   69:iconst_0        
	//   44   70:aload_0         
	//   45   71:getfield        #29  <Field int options>
	//   46   74:invokestatic    #63  <Method byte[] Base64.access$100(byte[], int, int, byte[], int, int)>
	//   47   77:pop             
					position = 0;
	//   48   78:aload_0         
	//   49   79:iconst_0        
	//   50   80:putfield        #39  <Field int position>
					numSigBytes = 4;
	//   51   83:aload_0         
	//   52   84:iconst_4        
	//   53   85:putfield        #65  <Field int numSigBytes>
				} else
	//*  54   88:goto            199
				{
					return -1;
	//   55   91:iconst_m1       
	//   56   92:ireturn         
				}
			} else
			{
				byte abyte1[] = new byte[4];
	//   57   93:iconst_4        
	//   58   94:newarray        byte[]
	//   59   96:astore          4
				int j = 0;
	//   60   98:iconst_0        
	//   61   99:istore_1        
				do
				{
					if(j >= 4)
						break;
	//   62  100:iload_1         
	//   63  101:iconst_4        
	//   64  102:icmpge          151
					int i1;
					do
						i1 = in.read();
	//   65  105:aload_0         
	//   66  106:getfield        #55  <Field InputStream in>
	//   67  109:invokevirtual   #59  <Method int InputStream.read()>
	//   68  112:istore_2        
					while(i1 >= 0 && decodabet[i1 & 0x7f] <= -5);
	//   69  113:iload_2         
	//   70  114:iflt            131
	//   71  117:aload_0         
	//   72  118:getfield        #47  <Field byte[] decodabet>
	//   73  121:iload_2         
	//   74  122:bipush          127
	//   75  124:iand            
	//   76  125:baload          
	//   77  126:bipush          -5
	//   78  128:icmple          105
					if(i1 < 0)
	//*  79  131:iload_2         
	//*  80  132:ifge            138
						break;
	//   81  135:goto            151
					abyte1[j] = (byte)i1;
	//   82  138:aload           4
	//   83  140:iload_1         
	//   84  141:iload_2         
	//   85  142:int2byte        
	//   86  143:bastore         
					j++;
	//   87  144:iload_1         
	//   88  145:iconst_1        
	//   89  146:iadd            
	//   90  147:istore_1        
				} while(true);
	//   91  148:goto            100
				if(j == 4)
	//*  92  151:iload_1         
	//*  93  152:iconst_4        
	//*  94  153:icmpne          183
				{
					numSigBytes = Base64.access$200(abyte1, 0, buffer, 0, options);
	//   95  156:aload_0         
	//   96  157:aload           4
	//   97  159:iconst_0        
	//   98  160:aload_0         
	//   99  161:getfield        #37  <Field byte[] buffer>
	//  100  164:iconst_0        
	//  101  165:aload_0         
	//  102  166:getfield        #29  <Field int options>
	//  103  169:invokestatic    #69  <Method int Base64.access$200(byte[], int, byte[], int, int)>
	//  104  172:putfield        #65  <Field int numSigBytes>
					position = 0;
	//  105  175:aload_0         
	//  106  176:iconst_0        
	//  107  177:putfield        #39  <Field int position>
				} else
	//* 108  180:goto            199
				if(j == 0)
	//* 109  183:iload_1         
	//* 110  184:ifne            189
					return -1;
	//  111  187:iconst_m1       
	//  112  188:ireturn         
				else
					throw new IOException("Improperly padded Base64 input.");
	//  113  189:new             #51  <Class IOException>
	//  114  192:dup             
	//  115  193:ldc1            #71  <String "Improperly padded Base64 input.">
	//  116  195:invokespecial   #74  <Method void IOException(String)>
	//  117  198:athrow          
			}
		int k = position;
	//  118  199:aload_0         
	//  119  200:getfield        #39  <Field int position>
	//  120  203:istore_1        
		if(k >= 0)
	//* 121  204:iload_1         
	//* 122  205:iflt            304
		{
			if(k >= numSigBytes)
	//* 123  208:iload_1         
	//* 124  209:aload_0         
	//* 125  210:getfield        #65  <Field int numSigBytes>
	//* 126  213:icmplt          218
				return -1;
	//  127  216:iconst_m1       
	//  128  217:ireturn         
			if(encode && breakLines && lineLength >= 76)
	//* 129  218:aload_0         
	//* 130  219:getfield        #33  <Field boolean encode>
	//* 131  222:ifeq            249
	//* 132  225:aload_0         
	//* 133  226:getfield        #31  <Field boolean breakLines>
	//* 134  229:ifeq            249
	//* 135  232:aload_0         
	//* 136  233:getfield        #41  <Field int lineLength>
	//* 137  236:bipush          76
	//* 138  238:icmplt          249
			{
				lineLength = 0;
	//  139  241:aload_0         
	//  140  242:iconst_0        
	//  141  243:putfield        #41  <Field int lineLength>
				return 10;
	//  142  246:bipush          10
	//  143  248:ireturn         
			}
			lineLength = lineLength + 1;
	//  144  249:aload_0         
	//  145  250:aload_0         
	//  146  251:getfield        #41  <Field int lineLength>
	//  147  254:iconst_1        
	//  148  255:iadd            
	//  149  256:putfield        #41  <Field int lineLength>
			byte abyte2[] = buffer;
	//  150  259:aload_0         
	//  151  260:getfield        #37  <Field byte[] buffer>
	//  152  263:astore          4
			k = position;
	//  153  265:aload_0         
	//  154  266:getfield        #39  <Field int position>
	//  155  269:istore_1        
			position = k + 1;
	//  156  270:aload_0         
	//  157  271:iload_1         
	//  158  272:iconst_1        
	//  159  273:iadd            
	//  160  274:putfield        #39  <Field int position>
			k = ((int) (abyte2[k]));
	//  161  277:aload           4
	//  162  279:iload_1         
	//  163  280:baload          
	//  164  281:istore_1        
			if(position >= bufferLength)
	//* 165  282:aload_0         
	//* 166  283:getfield        #39  <Field int position>
	//* 167  286:aload_0         
	//* 168  287:getfield        #35  <Field int bufferLength>
	//* 169  290:icmplt          298
				position = -1;
	//  170  293:aload_0         
	//  171  294:iconst_m1       
	//  172  295:putfield        #39  <Field int position>
			return k & 0xff;
	//  173  298:iload_1         
	//  174  299:sipush          255
	//  175  302:iand            
	//  176  303:ireturn         
		} else
		{
			throw new IOException("Error in Base64 code reading stream.");
	//  177  304:new             #51  <Class IOException>
	//  178  307:dup             
	//  179  308:ldc1            #76  <String "Error in Base64 code reading stream.">
	//  180  310:invokespecial   #74  <Method void IOException(String)>
	//  181  313:athrow          
		}
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		int k;
label0:
		{
			k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
			do
			{
				if(k >= j)
					break label0;
	//    2    3:iload           4
	//    3    5:iload_3         
	//    4    6:icmpge          45
				int l = read();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #79  <Method int read()>
	//    7   13:istore          5
				if(l < 0)
					break;
	//    8   15:iload           5
	//    9   17:iflt            38
				abyte0[i + k] = (byte)l;
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:iload           4
	//   13   24:iadd            
	//   14   25:iload           5
	//   15   27:int2byte        
	//   16   28:bastore         
				k++;
	//   17   29:iload           4
	//   18   31:iconst_1        
	//   19   32:iadd            
	//   20   33:istore          4
			} while(true);
	//   21   35:goto            3
			if(k == 0)
	//*  22   38:iload           4
	//*  23   40:ifne            45
				return -1;
	//   24   43:iconst_m1       
	//   25   44:ireturn         
		}
		return k;
	//   26   45:iload           4
	//   27   47:ireturn         
	}

	private boolean breakLines;
	private byte buffer[];
	private int bufferLength;
	private byte decodabet[];
	private boolean encode;
	private int lineLength;
	private int numSigBytes;
	private int options;
	private int position;

	public Base64$InputStream(InputStream inputstream)
	{
		this(inputstream, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #24  <Method void Base64$InputStream(InputStream, int)>
	//    4    6:return          
	}

	public Base64$InputStream(InputStream inputstream, int i)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void FilterInputStream(InputStream)>
		options = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #29  <Field int options>
		boolean flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore          5
		boolean flag;
		if((i & 8) > 0)
	//*   8   13:iload_2         
	//*   9   14:bipush          8
	//*  10   16:iand            
	//*  11   17:ifle            26
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore          4
		else
	//*  14   23:goto            29
			flag = false;
	//   15   26:iconst_0        
	//   16   27:istore          4
		breakLines = flag;
	//   17   29:aload_0         
	//   18   30:iload           4
	//   19   32:putfield        #31  <Field boolean breakLines>
		if((i & 1) > 0)
	//*  20   35:iload_2         
	//*  21   36:iconst_1        
	//*  22   37:iand            
	//*  23   38:ifle            48
			flag = flag1;
	//   24   41:iload           5
	//   25   43:istore          4
		else
	//*  26   45:goto            51
			flag = false;
	//   27   48:iconst_0        
	//   28   49:istore          4
		encode = flag;
	//   29   51:aload_0         
	//   30   52:iload           4
	//   31   54:putfield        #33  <Field boolean encode>
		int j;
		if(encode)
	//*  32   57:aload_0         
	//*  33   58:getfield        #33  <Field boolean encode>
	//*  34   61:ifeq            69
			j = 4;
	//   35   64:iconst_4        
	//   36   65:istore_3        
		else
	//*  37   66:goto            71
			j = 3;
	//   38   69:iconst_3        
	//   39   70:istore_3        
		bufferLength = j;
	//   40   71:aload_0         
	//   41   72:iload_3         
	//   42   73:putfield        #35  <Field int bufferLength>
		buffer = new byte[bufferLength];
	//   43   76:aload_0         
	//   44   77:aload_0         
	//   45   78:getfield        #35  <Field int bufferLength>
	//   46   81:newarray        byte[]
	//   47   83:putfield        #37  <Field byte[] buffer>
		position = -1;
	//   48   86:aload_0         
	//   49   87:iconst_m1       
	//   50   88:putfield        #39  <Field int position>
		lineLength = 0;
	//   51   91:aload_0         
	//   52   92:iconst_0        
	//   53   93:putfield        #41  <Field int lineLength>
		decodabet = Base64.access$000(i);
	//   54   96:aload_0         
	//   55   97:iload_2         
	//   56   98:invokestatic    #45  <Method byte[] Base64.access$000(int)>
	//   57  101:putfield        #47  <Field byte[] decodabet>
	//   58  104:return          
	}
}
