// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import java.io.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			Utils

public class FixASCIIControlsReader extends PushbackReader
{

	public FixASCIIControlsReader(Reader reader)
	{
		super(reader, 8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:bipush          8
	//    3    4:invokespecial   #27  <Method void PushbackReader(Reader, int)>
		state = 0;
	//    4    7:aload_0         
	//    5    8:iconst_0        
	//    6    9:putfield        #29  <Field int state>
		control = 0;
	//    7   12:aload_0         
	//    8   13:iconst_0        
	//    9   14:putfield        #31  <Field int control>
		digits = 0;
	//   10   17:aload_0         
	//   11   18:iconst_0        
	//   12   19:putfield        #33  <Field int digits>
	//   13   22:return          
	}

	private char processChar(char c)
	{
		state;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int state>
		JVM INSTR tableswitch 0 5: default 44
	//	               0 46
	//	               1 59
	//	               2 79
	//	               3 240
	//	               4 143
	//	               5 361;
	//    2    4:tableswitch     0 5: default 44
	//	               0 46
	//	               1 59
	//	               2 79
	//	               3 240
	//	               4 143
	//	               5 361
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		return c;
	//    3   44:iload_1         
	//    4   45:ireturn         
_L2:
		if(c == '&')
	//*   5   46:iload_1         
	//*   6   47:bipush          38
	//*   7   49:icmpne          44
		{
			state = 1;
	//    8   52:aload_0         
	//    9   53:iconst_1        
	//   10   54:putfield        #29  <Field int state>
			return c;
	//   11   57:iload_1         
	//   12   58:ireturn         
		}
		  goto _L1
_L3:
		if(c == '#')
	//*  13   59:iload_1         
	//*  14   60:bipush          35
	//*  15   62:icmpne          72
		{
			state = 2;
	//   16   65:aload_0         
	//   17   66:iconst_2        
	//   18   67:putfield        #29  <Field int state>
			return c;
	//   19   70:iload_1         
	//   20   71:ireturn         
		} else
		{
			state = 5;
	//   21   72:aload_0         
	//   22   73:iconst_5        
	//   23   74:putfield        #29  <Field int state>
			return c;
	//   24   77:iload_1         
	//   25   78:ireturn         
		}
_L4:
		if(c == 'x')
	//*  26   79:iload_1         
	//*  27   80:bipush          120
	//*  28   82:icmpne          102
		{
			control = 0;
	//   29   85:aload_0         
	//   30   86:iconst_0        
	//   31   87:putfield        #31  <Field int control>
			digits = 0;
	//   32   90:aload_0         
	//   33   91:iconst_0        
	//   34   92:putfield        #33  <Field int digits>
			state = 3;
	//   35   95:aload_0         
	//   36   96:iconst_3        
	//   37   97:putfield        #29  <Field int state>
			return c;
	//   38  100:iload_1         
	//   39  101:ireturn         
		}
		if('0' <= c && c <= '9')
	//*  40  102:bipush          48
	//*  41  104:iload_1         
	//*  42  105:icmpgt          136
	//*  43  108:iload_1         
	//*  44  109:bipush          57
	//*  45  111:icmpgt          136
		{
			control = Character.digit(c, 10);
	//   46  114:aload_0         
	//   47  115:iload_1         
	//   48  116:bipush          10
	//   49  118:invokestatic    #42  <Method int Character.digit(char, int)>
	//   50  121:putfield        #31  <Field int control>
			digits = 1;
	//   51  124:aload_0         
	//   52  125:iconst_1        
	//   53  126:putfield        #33  <Field int digits>
			state = 4;
	//   54  129:aload_0         
	//   55  130:iconst_4        
	//   56  131:putfield        #29  <Field int state>
			return c;
	//   57  134:iload_1         
	//   58  135:ireturn         
		} else
		{
			state = 5;
	//   59  136:aload_0         
	//   60  137:iconst_5        
	//   61  138:putfield        #29  <Field int state>
			return c;
	//   62  141:iload_1         
	//   63  142:ireturn         
		}
_L6:
		if('0' <= c && c <= '9')
	//*  64  143:bipush          48
	//*  65  145:iload_1         
	//*  66  146:icmpgt          205
	//*  67  149:iload_1         
	//*  68  150:bipush          57
	//*  69  152:icmpgt          205
		{
			control = control * 10 + Character.digit(c, 10);
	//   70  155:aload_0         
	//   71  156:aload_0         
	//   72  157:getfield        #31  <Field int control>
	//   73  160:bipush          10
	//   74  162:imul            
	//   75  163:iload_1         
	//   76  164:bipush          10
	//   77  166:invokestatic    #42  <Method int Character.digit(char, int)>
	//   78  169:iadd            
	//   79  170:putfield        #31  <Field int control>
			digits = digits + 1;
	//   80  173:aload_0         
	//   81  174:aload_0         
	//   82  175:getfield        #33  <Field int digits>
	//   83  178:iconst_1        
	//   84  179:iadd            
	//   85  180:putfield        #33  <Field int digits>
			if(digits <= 5)
	//*  86  183:aload_0         
	//*  87  184:getfield        #33  <Field int digits>
	//*  88  187:iconst_5        
	//*  89  188:icmpgt          198
			{
				state = 4;
	//   90  191:aload_0         
	//   91  192:iconst_4        
	//   92  193:putfield        #29  <Field int state>
				return c;
	//   93  196:iload_1         
	//   94  197:ireturn         
			} else
			{
				state = 5;
	//   95  198:aload_0         
	//   96  199:iconst_5        
	//   97  200:putfield        #29  <Field int state>
				return c;
	//   98  203:iload_1         
	//   99  204:ireturn         
			}
		}
		if(c == ';' && Utils.isControlChar((char)control))
	//* 100  205:iload_1         
	//* 101  206:bipush          59
	//* 102  208:icmpne          233
	//* 103  211:aload_0         
	//* 104  212:getfield        #31  <Field int control>
	//* 105  215:int2char        
	//* 106  216:invokestatic    #48  <Method boolean Utils.isControlChar(char)>
	//* 107  219:ifeq            233
		{
			state = 0;
	//  108  222:aload_0         
	//  109  223:iconst_0        
	//  110  224:putfield        #29  <Field int state>
			return (char)control;
	//  111  227:aload_0         
	//  112  228:getfield        #31  <Field int control>
	//  113  231:int2char        
	//  114  232:ireturn         
		} else
		{
			state = 5;
	//  115  233:aload_0         
	//  116  234:iconst_5        
	//  117  235:putfield        #29  <Field int state>
			return c;
	//  118  238:iload_1         
	//  119  239:ireturn         
		}
_L5:
		if('0' <= c && c <= '9' || 'a' <= c && c <= 'f' || 'A' <= c && c <= 'F')
	//* 120  240:bipush          48
	//* 121  242:iload_1         
	//* 122  243:icmpgt          252
	//* 123  246:iload_1         
	//* 124  247:bipush          57
	//* 125  249:icmple          276
	//* 126  252:bipush          97
	//* 127  254:iload_1         
	//* 128  255:icmpgt          264
	//* 129  258:iload_1         
	//* 130  259:bipush          102
	//* 131  261:icmple          276
	//* 132  264:bipush          65
	//* 133  266:iload_1         
	//* 134  267:icmpgt          326
	//* 135  270:iload_1         
	//* 136  271:bipush          70
	//* 137  273:icmpgt          326
		{
			control = control * 16 + Character.digit(c, 16);
	//  138  276:aload_0         
	//  139  277:aload_0         
	//  140  278:getfield        #31  <Field int control>
	//  141  281:bipush          16
	//  142  283:imul            
	//  143  284:iload_1         
	//  144  285:bipush          16
	//  145  287:invokestatic    #42  <Method int Character.digit(char, int)>
	//  146  290:iadd            
	//  147  291:putfield        #31  <Field int control>
			digits = digits + 1;
	//  148  294:aload_0         
	//  149  295:aload_0         
	//  150  296:getfield        #33  <Field int digits>
	//  151  299:iconst_1        
	//  152  300:iadd            
	//  153  301:putfield        #33  <Field int digits>
			if(digits <= 4)
	//* 154  304:aload_0         
	//* 155  305:getfield        #33  <Field int digits>
	//* 156  308:iconst_4        
	//* 157  309:icmpgt          319
			{
				state = 3;
	//  158  312:aload_0         
	//  159  313:iconst_3        
	//  160  314:putfield        #29  <Field int state>
				return c;
	//  161  317:iload_1         
	//  162  318:ireturn         
			} else
			{
				state = 5;
	//  163  319:aload_0         
	//  164  320:iconst_5        
	//  165  321:putfield        #29  <Field int state>
				return c;
	//  166  324:iload_1         
	//  167  325:ireturn         
			}
		}
		if(c == ';' && Utils.isControlChar((char)control))
	//* 168  326:iload_1         
	//* 169  327:bipush          59
	//* 170  329:icmpne          354
	//* 171  332:aload_0         
	//* 172  333:getfield        #31  <Field int control>
	//* 173  336:int2char        
	//* 174  337:invokestatic    #48  <Method boolean Utils.isControlChar(char)>
	//* 175  340:ifeq            354
		{
			state = 0;
	//  176  343:aload_0         
	//  177  344:iconst_0        
	//  178  345:putfield        #29  <Field int state>
			return (char)control;
	//  179  348:aload_0         
	//  180  349:getfield        #31  <Field int control>
	//  181  352:int2char        
	//  182  353:ireturn         
		} else
		{
			state = 5;
	//  183  354:aload_0         
	//  184  355:iconst_5        
	//  185  356:putfield        #29  <Field int state>
			return c;
	//  186  359:iload_1         
	//  187  360:ireturn         
		}
_L7:
		state = 0;
	//  188  361:aload_0         
	//  189  362:iconst_0        
	//  190  363:putfield        #29  <Field int state>
		return c;
	//  191  366:iload_1         
	//  192  367:ireturn         
	}

	public int read(char ac[], int i, int j)
		throws IOException
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		int l = 0;
	//    2    3:iconst_0        
	//    3    4:istore          8
		char ac1[] = new char[8];
	//    4    6:bipush          8
	//    5    8:newarray        char[]
	//    6   10:astore          10
		boolean flag = true;
	//    7   12:iconst_1        
	//    8   13:istore          7
		do
		{
			if(!flag || l >= j)
				break;
	//    9   15:iload           7
	//   10   17:ifeq            174
	//   11   20:iload           8
	//   12   22:iload_3         
	//   13   23:icmpge          174
			if(super.read(ac1, k, 1) == 1)
	//*  14   26:aload_0         
	//*  15   27:aload           10
	//*  16   29:iload           6
	//*  17   31:iconst_1        
	//*  18   32:invokespecial   #54  <Method int PushbackReader.read(char[], int, int)>
	//*  19   35:iconst_1        
	//*  20   36:icmpne          106
				flag = true;
	//   21   39:iconst_1        
	//   22   40:istore          7
			else
	//*  23   42:iload           7
	//*  24   44:ifeq            146
	//*  25   47:aload_0         
	//*  26   48:aload           10
	//*  27   50:iload           6
	//*  28   52:caload          
	//*  29   53:invokespecial   #56  <Method char processChar(char)>
	//*  30   56:istore          5
	//*  31   58:aload_0         
	//*  32   59:getfield        #29  <Field int state>
	//*  33   62:ifne            112
	//*  34   65:iload           5
	//*  35   67:istore          4
	//*  36   69:iload           5
	//*  37   71:invokestatic    #48  <Method boolean Utils.isControlChar(char)>
	//*  38   74:ifeq            81
	//*  39   77:bipush          32
	//*  40   79:istore          4
	//*  41   81:iload_2         
	//*  42   82:iconst_1        
	//*  43   83:iadd            
	//*  44   84:istore          9
	//*  45   86:aload_1         
	//*  46   87:iload_2         
	//*  47   88:iload           4
	//*  48   90:castore         
	//*  49   91:iconst_0        
	//*  50   92:istore          6
	//*  51   94:iload           8
	//*  52   96:iconst_1        
	//*  53   97:iadd            
	//*  54   98:istore          8
	//*  55  100:iload           9
	//*  56  102:istore_2        
	//*  57  103:goto            15
				flag = false;
	//   58  106:iconst_0        
	//   59  107:istore          7
			if(flag)
			{
				char c1 = processChar(ac1[k]);
				if(state == 0)
				{
					char c = c1;
					if(Utils.isControlChar(c1))
						c = ' ';
					int i1 = i + 1;
					ac[i] = c;
					k = 0;
					l++;
					i = i1;
				} else
	//*  60  109:goto            42
				if(state == 5)
	//*  61  112:aload_0         
	//*  62  113:getfield        #29  <Field int state>
	//*  63  116:iconst_5        
	//*  64  117:icmpne          137
				{
					unread(ac1, 0, k + 1);
	//   65  120:aload_0         
	//   66  121:aload           10
	//   67  123:iconst_0        
	//   68  124:iload           6
	//   69  126:iconst_1        
	//   70  127:iadd            
	//   71  128:invokevirtual   #60  <Method void unread(char[], int, int)>
					k = 0;
	//   72  131:iconst_0        
	//   73  132:istore          6
				} else
	//*  74  134:goto            103
				{
					k++;
	//   75  137:iload           6
	//   76  139:iconst_1        
	//   77  140:iadd            
	//   78  141:istore          6
				}
			} else
	//*  79  143:goto            103
			if(k > 0)
	//*  80  146:iload           6
	//*  81  148:ifle            15
			{
				unread(ac1, 0, k);
	//   82  151:aload_0         
	//   83  152:aload           10
	//   84  154:iconst_0        
	//   85  155:iload           6
	//   86  157:invokevirtual   #60  <Method void unread(char[], int, int)>
				state = 5;
	//   87  160:aload_0         
	//   88  161:iconst_5        
	//   89  162:putfield        #29  <Field int state>
				k = 0;
	//   90  165:iconst_0        
	//   91  166:istore          6
				flag = true;
	//   92  168:iconst_1        
	//   93  169:istore          7
			}
		} while(true);
	//   94  171:goto            15
		if(l > 0 || flag)
	//*  95  174:iload           8
	//*  96  176:ifgt            184
	//*  97  179:iload           7
	//*  98  181:ifeq            187
			return l;
	//   99  184:iload           8
	//  100  186:ireturn         
		else
			return -1;
	//  101  187:iconst_m1       
	//  102  188:ireturn         
	}

	private static final int BUFFER_SIZE = 8;
	private static final int STATE_AMP = 1;
	private static final int STATE_DIG1 = 4;
	private static final int STATE_ERROR = 5;
	private static final int STATE_HASH = 2;
	private static final int STATE_HEX = 3;
	private static final int STATE_START = 0;
	private int control;
	private int digits;
	private int state;
}
