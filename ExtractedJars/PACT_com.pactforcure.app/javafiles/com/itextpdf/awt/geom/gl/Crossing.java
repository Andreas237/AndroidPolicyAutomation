// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom.gl;

import com.itextpdf.awt.geom.*;

public class Crossing
{
	public static class CubicCurve
	{

		int addBound(double ad[], int i, double ad1[], int j, double d, double d1, boolean flag, int k)
		{
			int l;
			int i1;
			l = 0;
		//    0    0:iconst_0        
		//    1    1:istore          15
			i1 = k;
		//    2    3:iload           10
		//    3    5:istore          16
_L2:
			if(l >= j)
				break; /* Loop/switch isn't completed */
		//    4    7:iload           15
		//    5    9:iload           4
		//    6   11:icmpge          178
			double d2 = ad1[l];
		//    7   14:aload_3         
		//    8   15:iload           15
		//    9   17:daload          
		//   10   18:dstore          11
			k = i;
		//   11   20:iload_2         
		//   12   21:istore          10
			if(d2 <= -1.0000000000000001E-05D)
				break MISSING_BLOCK_LABEL_180;
		//   13   23:dload           11
		//   14   25:ldc2w           #59  <Double -1.0000000000000001E-05D>
		//   15   28:dcmpl           
		//   16   29:ifle            180
			k = i;
		//   17   32:iload_2         
		//   18   33:istore          10
			if(d2 >= 1.0000100000000001D)
				break MISSING_BLOCK_LABEL_180;
		//   19   35:dload           11
		//   20   37:ldc2w           #61  <Double 1.0000100000000001D>
		//   21   40:dcmpg           
		//   22   41:ifge            180
			double d3 = d2 * ((Ax * d2 + Bx) * d2 + Cx);
		//   23   44:dload           11
		//   24   46:aload_0         
		//   25   47:getfield        #45  <Field double Ax>
		//   26   50:dload           11
		//   27   52:dmul            
		//   28   53:aload_0         
		//   29   54:getfield        #43  <Field double Bx>
		//   30   57:dadd            
		//   31   58:dload           11
		//   32   60:dmul            
		//   33   61:aload_0         
		//   34   62:getfield        #41  <Field double Cx>
		//   35   65:dadd            
		//   36   66:dmul            
		//   37   67:dstore          13
			k = i;
		//   38   69:iload_2         
		//   39   70:istore          10
			if(d > d3)
				break MISSING_BLOCK_LABEL_180;
		//   40   72:dload           5
		//   41   74:dload           13
		//   42   76:dcmpg           
		//   43   77:ifgt            180
			k = i;
		//   44   80:iload_2         
		//   45   81:istore          10
			if(d3 > d1)
				break MISSING_BLOCK_LABEL_180;
		//   46   83:dload           13
		//   47   85:dload           7
		//   48   87:dcmpg           
		//   49   88:ifgt            180
			k = i + 1;
		//   50   91:iload_2         
		//   51   92:iconst_1        
		//   52   93:iadd            
		//   53   94:istore          10
			ad[i] = d2;
		//   54   96:aload_1         
		//   55   97:iload_2         
		//   56   98:dload           11
		//   57  100:dastore         
			i = k + 1;
		//   58  101:iload           10
		//   59  103:iconst_1        
		//   60  104:iadd            
		//   61  105:istore_2        
			ad[k] = d3;
		//   62  106:aload_1         
		//   63  107:iload           10
		//   64  109:dload           13
		//   65  111:dastore         
			k = i + 1;
		//   66  112:iload_2         
		//   67  113:iconst_1        
		//   68  114:iadd            
		//   69  115:istore          10
			ad[i] = ((Ay * d2 + By) * d2 + Cy) * d2;
		//   70  117:aload_1         
		//   71  118:iload_2         
		//   72  119:aload_0         
		//   73  120:getfield        #51  <Field double Ay>
		//   74  123:dload           11
		//   75  125:dmul            
		//   76  126:aload_0         
		//   77  127:getfield        #49  <Field double By>
		//   78  130:dadd            
		//   79  131:dload           11
		//   80  133:dmul            
		//   81  134:aload_0         
		//   82  135:getfield        #47  <Field double Cy>
		//   83  138:dadd            
		//   84  139:dload           11
		//   85  141:dmul            
		//   86  142:dastore         
			i = k + 1;
		//   87  143:iload           10
		//   88  145:iconst_1        
		//   89  146:iadd            
		//   90  147:istore_2        
			ad[k] = i1;
		//   91  148:aload_1         
		//   92  149:iload           10
		//   93  151:iload           16
		//   94  153:i2d             
		//   95  154:dastore         
			k = i;
		//   96  155:iload_2         
		//   97  156:istore          10
			if(!flag)
				break MISSING_BLOCK_LABEL_180;
		//   98  158:iload           9
		//   99  160:ifeq            180
			i1++;
		//  100  163:iload           16
		//  101  165:iconst_1        
		//  102  166:iadd            
		//  103  167:istore          16
_L3:
			l++;
		//  104  169:iload           15
		//  105  171:iconst_1        
		//  106  172:iadd            
		//  107  173:istore          15
			if(true) goto _L2; else goto _L1
		//  108  175:goto            7
_L1:
			return i;
		//  109  178:iload_2         
		//  110  179:ireturn         
			i = k;
		//  111  180:iload           10
		//  112  182:istore_2        
			  goto _L3
		//* 113  183:goto            169
		}

		int cross(double ad[], int i, double d, double d1)
		{
			int k;
			int l;
			l = 0;
		//    0    0:iconst_0        
		//    1    1:istore          15
			k = 0;
		//    2    3:iconst_0        
		//    3    4:istore          14
_L2:
			double d6;
			int j;
			if(k >= i)
				break MISSING_BLOCK_LABEL_409;
		//    4    6:iload           14
		//    5    8:iload_2         
		//    6    9:icmpge          409
			d6 = ad[k];
		//    7   12:aload_1         
		//    8   13:iload           14
		//    9   15:daload          
		//   10   16:dstore          11
			j = l;
		//   11   18:iload           15
		//   12   20:istore          13
			if(d6 >= -1.0000000000000001E-05D)
		//*  13   22:dload           11
		//*  14   24:ldc2w           #59  <Double -1.0000000000000001E-05D>
		//*  15   27:dcmpg           
		//*  16   28:iflt            44
			{
				if(d6 <= 1.0000100000000001D)
					break; /* Loop/switch isn't completed */
		//   17   31:dload           11
		//   18   33:ldc2w           #61  <Double 1.0000100000000001D>
		//   19   36:dcmpl           
		//   20   37:ifle            57
				j = l;
		//   21   40:iload           15
		//   22   42:istore          13
			}
_L3:
			k++;
		//   23   44:iload           14
		//   24   46:iconst_1        
		//   25   47:iadd            
		//   26   48:istore          14
			l = j;
		//   27   50:iload           13
		//   28   52:istore          15
			if(true) goto _L2; else goto _L1
		//   29   54:goto            6
_L1:
			if(d6 < 1.0000000000000001E-05D)
		//*  30   57:dload           11
		//*  31   59:ldc2w           #65  <Double 1.0000000000000001E-05D>
		//*  32   62:dcmpg           
		//*  33   63:ifge            151
			{
				j = l;
		//   34   66:iload           15
		//   35   68:istore          13
				if(d < 0.0D)
		//*  36   70:dload_3         
		//*  37   71:dconst_0        
		//*  38   72:dcmpg           
		//*  39   73:ifge            44
				{
					double d2;
					if(bx != 0.0D)
		//*  40   76:aload_0         
		//*  41   77:getfield        #33  <Field double bx>
		//*  42   80:dconst_0        
		//*  43   81:dcmpl           
		//*  44   82:ifeq            111
						d2 = bx;
		//   45   85:aload_0         
		//   46   86:getfield        #33  <Field double bx>
		//   47   89:dstore          7
					else
		//*  48   91:iload           15
		//*  49   93:istore          13
		//*  50   95:dload           7
		//*  51   97:dconst_0        
		//*  52   98:dcmpg           
		//*  53   99:ifge            44
		//*  54  102:iload           15
		//*  55  104:iconst_1        
		//*  56  105:isub            
		//*  57  106:istore          13
		//*  58  108:goto            44
					if(cx != bx)
		//*  59  111:aload_0         
		//*  60  112:getfield        #37  <Field double cx>
		//*  61  115:aload_0         
		//*  62  116:getfield        #33  <Field double bx>
		//*  63  119:dcmpl           
		//*  64  120:ifeq            137
						d2 = cx - bx;
		//   65  123:aload_0         
		//   66  124:getfield        #37  <Field double cx>
		//   67  127:aload_0         
		//   68  128:getfield        #33  <Field double bx>
		//   69  131:dsub            
		//   70  132:dstore          7
					else
		//*  71  134:goto            91
						d2 = ax - cx;
		//   72  137:aload_0         
		//   73  138:getfield        #29  <Field double ax>
		//   74  141:aload_0         
		//   75  142:getfield        #37  <Field double cx>
		//   76  145:dsub            
		//   77  146:dstore          7
					j = l;
					if(d2 < 0.0D)
						j = l - 1;
				}
			} else
		//*  78  148:goto            91
			{
label0:
				{
					if(d6 <= 0.99999000000000005D)
						break label0;
		//   79  151:dload           11
		//   80  153:ldc2w           #67  <Double 0.99999000000000005D>
		//   81  156:dcmpl           
		//   82  157:ifle            251
					j = l;
		//   83  160:iload           15
		//   84  162:istore          13
					if(d < ay)
		//*  85  164:dload_3         
		//*  86  165:aload_0         
		//*  87  166:getfield        #31  <Field double ay>
		//*  88  169:dcmpg           
		//*  89  170:ifge            44
					{
						double d3;
						if(ax != cx)
		//*  90  173:aload_0         
		//*  91  174:getfield        #29  <Field double ax>
		//*  92  177:aload_0         
		//*  93  178:getfield        #37  <Field double cx>
		//*  94  181:dcmpl           
		//*  95  182:ifeq            216
							d3 = ax - cx;
		//   96  185:aload_0         
		//   97  186:getfield        #29  <Field double ax>
		//   98  189:aload_0         
		//   99  190:getfield        #37  <Field double cx>
		//  100  193:dsub            
		//  101  194:dstore          7
						else
		//* 102  196:iload           15
		//* 103  198:istore          13
		//* 104  200:dload           7
		//* 105  202:dconst_0        
		//* 106  203:dcmpl           
		//* 107  204:ifle            44
		//* 108  207:iload           15
		//* 109  209:iconst_1        
		//* 110  210:iadd            
		//* 111  211:istore          13
		//* 112  213:goto            44
						if(cx != bx)
		//* 113  216:aload_0         
		//* 114  217:getfield        #37  <Field double cx>
		//* 115  220:aload_0         
		//* 116  221:getfield        #33  <Field double bx>
		//* 117  224:dcmpl           
		//* 118  225:ifeq            242
							d3 = cx - bx;
		//  119  228:aload_0         
		//  120  229:getfield        #37  <Field double cx>
		//  121  232:aload_0         
		//  122  233:getfield        #33  <Field double bx>
		//  123  236:dsub            
		//  124  237:dstore          7
						else
		//* 125  239:goto            196
							d3 = bx;
		//  126  242:aload_0         
		//  127  243:getfield        #33  <Field double bx>
		//  128  246:dstore          7
						j = l;
						if(d3 > 0.0D)
							j = l + 1;
					}
				}
			}
			  goto _L3
		//* 129  248:goto            196
			j = l;
		//  130  251:iload           15
		//  131  253:istore          13
			if(d6 * ((Ay * d6 + By) * d6 + Cy) <= d1) goto _L3; else goto _L4
		//  132  255:dload           11
		//  133  257:aload_0         
		//  134  258:getfield        #51  <Field double Ay>
		//  135  261:dload           11
		//  136  263:dmul            
		//  137  264:aload_0         
		//  138  265:getfield        #49  <Field double By>
		//  139  268:dadd            
		//  140  269:dload           11
		//  141  271:dmul            
		//  142  272:aload_0         
		//  143  273:getfield        #47  <Field double Cy>
		//  144  276:dadd            
		//  145  277:dmul            
		//  146  278:dload           5
		//  147  280:dcmpl           
		//  148  281:ifle            44
_L4:
			double d4;
			double d5 = (Ax3 * d6 + Bx2) * d6 + Cx;
		//  149  284:aload_0         
		//  150  285:getfield        #53  <Field double Ax3>
		//  151  288:dload           11
		//  152  290:dmul            
		//  153  291:aload_0         
		//  154  292:getfield        #55  <Field double Bx2>
		//  155  295:dadd            
		//  156  296:dload           11
		//  157  298:dmul            
		//  158  299:aload_0         
		//  159  300:getfield        #41  <Field double Cx>
		//  160  303:dadd            
		//  161  304:dstore          9
			d4 = d5;
		//  162  306:dload           9
		//  163  308:dstore          7
			if(d5 <= -1.0000000000000001E-05D)
				break MISSING_BLOCK_LABEL_383;
		//  164  310:dload           9
		//  165  312:ldc2w           #59  <Double -1.0000000000000001E-05D>
		//  166  315:dcmpl           
		//  167  316:ifle            383
			d4 = d5;
		//  168  319:dload           9
		//  169  321:dstore          7
			if(d5 >= 1.0000000000000001E-05D)
				break MISSING_BLOCK_LABEL_383;
		//  170  323:dload           9
		//  171  325:ldc2w           #65  <Double 1.0000000000000001E-05D>
		//  172  328:dcmpg           
		//  173  329:ifge            383
			d4 = (Ax3 + Ax3) * d6 + Bx2;
		//  174  332:aload_0         
		//  175  333:getfield        #53  <Field double Ax3>
		//  176  336:aload_0         
		//  177  337:getfield        #53  <Field double Ax3>
		//  178  340:dadd            
		//  179  341:dload           11
		//  180  343:dmul            
		//  181  344:aload_0         
		//  182  345:getfield        #55  <Field double Bx2>
		//  183  348:dadd            
		//  184  349:dstore          7
			j = l;
		//  185  351:iload           15
		//  186  353:istore          13
			if(d4 < -1.0000000000000001E-05D) goto _L3; else goto _L5
		//  187  355:dload           7
		//  188  357:ldc2w           #59  <Double -1.0000000000000001E-05D>
		//  189  360:dcmpg           
		//  190  361:iflt            44
_L5:
			j = l;
		//  191  364:iload           15
		//  192  366:istore          13
			if(d4 > 1.0000000000000001E-05D) goto _L3; else goto _L6
		//  193  368:dload           7
		//  194  370:ldc2w           #65  <Double 1.0000000000000001E-05D>
		//  195  373:dcmpl           
		//  196  374:ifgt            44
_L6:
			d4 = ax;
		//  197  377:aload_0         
		//  198  378:getfield        #29  <Field double ax>
		//  199  381:dstore          7
			if(d4 > 0.0D)
		//* 200  383:dload           7
		//* 201  385:dconst_0        
		//* 202  386:dcmpl           
		//* 203  387:ifle            403
				j = 1;
		//  204  390:iconst_1        
		//  205  391:istore          13
			else
		//* 206  393:iload           15
		//* 207  395:iload           13
		//* 208  397:iadd            
		//* 209  398:istore          13
		//* 210  400:goto            44
				j = -1;
		//  211  403:iconst_m1       
		//  212  404:istore          13
			j = l + j;
			  goto _L3
		//* 213  406:goto            393
			return l;
		//  214  409:iload           15
		//  215  411:ireturn         
		}

		int solveExtremX(double ad[])
		{
			return Crossing.solveQuad(new double[] {
				Cx, Bx2, Ax3
			}, ad);
		//    0    0:iconst_3        
		//    1    1:newarray        double[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:aload_0         
		//    5    6:getfield        #41  <Field double Cx>
		//    6    9:dastore         
		//    7   10:dup             
		//    8   11:iconst_1        
		//    9   12:aload_0         
		//   10   13:getfield        #55  <Field double Bx2>
		//   11   16:dastore         
		//   12   17:dup             
		//   13   18:iconst_2        
		//   14   19:aload_0         
		//   15   20:getfield        #53  <Field double Ax3>
		//   16   23:dastore         
		//   17   24:aload_1         
		//   18   25:invokestatic    #74  <Method int Crossing.solveQuad(double[], double[])>
		//   19   28:ireturn         
		}

		int solveExtremY(double ad[])
		{
			return Crossing.solveQuad(new double[] {
				Cy, By + By, Ay + Ay + Ay
			}, ad);
		//    0    0:iconst_3        
		//    1    1:newarray        double[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:aload_0         
		//    5    6:getfield        #47  <Field double Cy>
		//    6    9:dastore         
		//    7   10:dup             
		//    8   11:iconst_1        
		//    9   12:aload_0         
		//   10   13:getfield        #49  <Field double By>
		//   11   16:aload_0         
		//   12   17:getfield        #49  <Field double By>
		//   13   20:dadd            
		//   14   21:dastore         
		//   15   22:dup             
		//   16   23:iconst_2        
		//   17   24:aload_0         
		//   18   25:getfield        #51  <Field double Ay>
		//   19   28:aload_0         
		//   20   29:getfield        #51  <Field double Ay>
		//   21   32:dadd            
		//   22   33:aload_0         
		//   23   34:getfield        #51  <Field double Ay>
		//   24   37:dadd            
		//   25   38:dastore         
		//   26   39:aload_1         
		//   27   40:invokestatic    #74  <Method int Crossing.solveQuad(double[], double[])>
		//   28   43:ireturn         
		}

		int solvePoint(double ad[], double d)
		{
			return Crossing.solveCubic(new double[] {
				-d, Cx, Bx, Ax
			}, ad);
		//    0    0:iconst_4        
		//    1    1:newarray        double[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:dload_2         
		//    5    6:dneg            
		//    6    7:dastore         
		//    7    8:dup             
		//    8    9:iconst_1        
		//    9   10:aload_0         
		//   10   11:getfield        #41  <Field double Cx>
		//   11   14:dastore         
		//   12   15:dup             
		//   13   16:iconst_2        
		//   14   17:aload_0         
		//   15   18:getfield        #43  <Field double Bx>
		//   16   21:dastore         
		//   17   22:dup             
		//   18   23:iconst_3        
		//   19   24:aload_0         
		//   20   25:getfield        #45  <Field double Ax>
		//   21   28:dastore         
		//   22   29:aload_1         
		//   23   30:invokestatic    #80  <Method int Crossing.solveCubic(double[], double[])>
		//   24   33:ireturn         
		}

		double Ax;
		double Ax3;
		double Ay;
		double Bx;
		double Bx2;
		double By;
		double Cx;
		double Cy;
		double ax;
		double ay;
		double bx;
		double by;
		double cx;
		double cy;

		public CubicCurve(double d, double d1, double d2, double d3, double d4, double d5, double d6, 
				double d7)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			ax = d6 - d;
		//    2    4:aload_0         
		//    3    5:dload           13
		//    4    7:dload_1         
		//    5    8:dsub            
		//    6    9:putfield        #29  <Field double ax>
			ay = d7 - d1;
		//    7   12:aload_0         
		//    8   13:dload           15
		//    9   15:dload_3         
		//   10   16:dsub            
		//   11   17:putfield        #31  <Field double ay>
			bx = d2 - d;
		//   12   20:aload_0         
		//   13   21:dload           5
		//   14   23:dload_1         
		//   15   24:dsub            
		//   16   25:putfield        #33  <Field double bx>
			by = d3 - d1;
		//   17   28:aload_0         
		//   18   29:dload           7
		//   19   31:dload_3         
		//   20   32:dsub            
		//   21   33:putfield        #35  <Field double by>
			cx = d4 - d;
		//   22   36:aload_0         
		//   23   37:dload           9
		//   24   39:dload_1         
		//   25   40:dsub            
		//   26   41:putfield        #37  <Field double cx>
			cy = d5 - d1;
		//   27   44:aload_0         
		//   28   45:dload           11
		//   29   47:dload_3         
		//   30   48:dsub            
		//   31   49:putfield        #39  <Field double cy>
			Cx = bx + bx + bx;
		//   32   52:aload_0         
		//   33   53:aload_0         
		//   34   54:getfield        #33  <Field double bx>
		//   35   57:aload_0         
		//   36   58:getfield        #33  <Field double bx>
		//   37   61:dadd            
		//   38   62:aload_0         
		//   39   63:getfield        #33  <Field double bx>
		//   40   66:dadd            
		//   41   67:putfield        #41  <Field double Cx>
			Bx = (cx + cx + cx) - Cx - Cx;
		//   42   70:aload_0         
		//   43   71:aload_0         
		//   44   72:getfield        #37  <Field double cx>
		//   45   75:aload_0         
		//   46   76:getfield        #37  <Field double cx>
		//   47   79:dadd            
		//   48   80:aload_0         
		//   49   81:getfield        #37  <Field double cx>
		//   50   84:dadd            
		//   51   85:aload_0         
		//   52   86:getfield        #41  <Field double Cx>
		//   53   89:dsub            
		//   54   90:aload_0         
		//   55   91:getfield        #41  <Field double Cx>
		//   56   94:dsub            
		//   57   95:putfield        #43  <Field double Bx>
			Ax = ax - Bx - Cx;
		//   58   98:aload_0         
		//   59   99:aload_0         
		//   60  100:getfield        #29  <Field double ax>
		//   61  103:aload_0         
		//   62  104:getfield        #43  <Field double Bx>
		//   63  107:dsub            
		//   64  108:aload_0         
		//   65  109:getfield        #41  <Field double Cx>
		//   66  112:dsub            
		//   67  113:putfield        #45  <Field double Ax>
			Cy = by + by + by;
		//   68  116:aload_0         
		//   69  117:aload_0         
		//   70  118:getfield        #35  <Field double by>
		//   71  121:aload_0         
		//   72  122:getfield        #35  <Field double by>
		//   73  125:dadd            
		//   74  126:aload_0         
		//   75  127:getfield        #35  <Field double by>
		//   76  130:dadd            
		//   77  131:putfield        #47  <Field double Cy>
			By = (cy + cy + cy) - Cy - Cy;
		//   78  134:aload_0         
		//   79  135:aload_0         
		//   80  136:getfield        #39  <Field double cy>
		//   81  139:aload_0         
		//   82  140:getfield        #39  <Field double cy>
		//   83  143:dadd            
		//   84  144:aload_0         
		//   85  145:getfield        #39  <Field double cy>
		//   86  148:dadd            
		//   87  149:aload_0         
		//   88  150:getfield        #47  <Field double Cy>
		//   89  153:dsub            
		//   90  154:aload_0         
		//   91  155:getfield        #47  <Field double Cy>
		//   92  158:dsub            
		//   93  159:putfield        #49  <Field double By>
			Ay = ay - By - Cy;
		//   94  162:aload_0         
		//   95  163:aload_0         
		//   96  164:getfield        #31  <Field double ay>
		//   97  167:aload_0         
		//   98  168:getfield        #49  <Field double By>
		//   99  171:dsub            
		//  100  172:aload_0         
		//  101  173:getfield        #47  <Field double Cy>
		//  102  176:dsub            
		//  103  177:putfield        #51  <Field double Ay>
			Ax3 = Ax + Ax + Ax;
		//  104  180:aload_0         
		//  105  181:aload_0         
		//  106  182:getfield        #45  <Field double Ax>
		//  107  185:aload_0         
		//  108  186:getfield        #45  <Field double Ax>
		//  109  189:dadd            
		//  110  190:aload_0         
		//  111  191:getfield        #45  <Field double Ax>
		//  112  194:dadd            
		//  113  195:putfield        #53  <Field double Ax3>
			Bx2 = Bx + Bx;
		//  114  198:aload_0         
		//  115  199:aload_0         
		//  116  200:getfield        #43  <Field double Bx>
		//  117  203:aload_0         
		//  118  204:getfield        #43  <Field double Bx>
		//  119  207:dadd            
		//  120  208:putfield        #55  <Field double Bx2>
		//  121  211:return          
		}
	}

	public static class QuadCurve
	{

		int addBound(double ad[], int i, double ad1[], int j, double d, double d1, boolean flag, int k)
		{
			int l;
			int i1;
			l = 0;
		//    0    0:iconst_0        
		//    1    1:istore          15
			i1 = k;
		//    2    3:iload           10
		//    3    5:istore          16
_L2:
			if(l >= j)
				break; /* Loop/switch isn't completed */
		//    4    7:iload           15
		//    5    9:iload           4
		//    6   11:icmpge          162
			double d2 = ad1[l];
		//    7   14:aload_3         
		//    8   15:iload           15
		//    9   17:daload          
		//   10   18:dstore          11
			k = i;
		//   11   20:iload_2         
		//   12   21:istore          10
			if(d2 <= -1.0000000000000001E-05D)
				break MISSING_BLOCK_LABEL_164;
		//   13   23:dload           11
		//   14   25:ldc2w           #41  <Double -1.0000000000000001E-05D>
		//   15   28:dcmpl           
		//   16   29:ifle            164
			k = i;
		//   17   32:iload_2         
		//   18   33:istore          10
			if(d2 >= 1.0000100000000001D)
				break MISSING_BLOCK_LABEL_164;
		//   19   35:dload           11
		//   20   37:ldc2w           #43  <Double 1.0000100000000001D>
		//   21   40:dcmpg           
		//   22   41:ifge            164
			double d3 = d2 * (Ax * d2 + Bx);
		//   23   44:dload           11
		//   24   46:aload_0         
		//   25   47:getfield        #33  <Field double Ax>
		//   26   50:dload           11
		//   27   52:dmul            
		//   28   53:aload_0         
		//   29   54:getfield        #31  <Field double Bx>
		//   30   57:dadd            
		//   31   58:dmul            
		//   32   59:dstore          13
			k = i;
		//   33   61:iload_2         
		//   34   62:istore          10
			if(d > d3)
				break MISSING_BLOCK_LABEL_164;
		//   35   64:dload           5
		//   36   66:dload           13
		//   37   68:dcmpg           
		//   38   69:ifgt            164
			k = i;
		//   39   72:iload_2         
		//   40   73:istore          10
			if(d3 > d1)
				break MISSING_BLOCK_LABEL_164;
		//   41   75:dload           13
		//   42   77:dload           7
		//   43   79:dcmpg           
		//   44   80:ifgt            164
			k = i + 1;
		//   45   83:iload_2         
		//   46   84:iconst_1        
		//   47   85:iadd            
		//   48   86:istore          10
			ad[i] = d2;
		//   49   88:aload_1         
		//   50   89:iload_2         
		//   51   90:dload           11
		//   52   92:dastore         
			i = k + 1;
		//   53   93:iload           10
		//   54   95:iconst_1        
		//   55   96:iadd            
		//   56   97:istore_2        
			ad[k] = d3;
		//   57   98:aload_1         
		//   58   99:iload           10
		//   59  101:dload           13
		//   60  103:dastore         
			k = i + 1;
		//   61  104:iload_2         
		//   62  105:iconst_1        
		//   63  106:iadd            
		//   64  107:istore          10
			ad[i] = (Ay * d2 + By) * d2;
		//   65  109:aload_1         
		//   66  110:iload_2         
		//   67  111:aload_0         
		//   68  112:getfield        #37  <Field double Ay>
		//   69  115:dload           11
		//   70  117:dmul            
		//   71  118:aload_0         
		//   72  119:getfield        #35  <Field double By>
		//   73  122:dadd            
		//   74  123:dload           11
		//   75  125:dmul            
		//   76  126:dastore         
			i = k + 1;
		//   77  127:iload           10
		//   78  129:iconst_1        
		//   79  130:iadd            
		//   80  131:istore_2        
			ad[k] = i1;
		//   81  132:aload_1         
		//   82  133:iload           10
		//   83  135:iload           16
		//   84  137:i2d             
		//   85  138:dastore         
			k = i;
		//   86  139:iload_2         
		//   87  140:istore          10
			if(!flag)
				break MISSING_BLOCK_LABEL_164;
		//   88  142:iload           9
		//   89  144:ifeq            164
			i1++;
		//   90  147:iload           16
		//   91  149:iconst_1        
		//   92  150:iadd            
		//   93  151:istore          16
_L3:
			l++;
		//   94  153:iload           15
		//   95  155:iconst_1        
		//   96  156:iadd            
		//   97  157:istore          15
			if(true) goto _L2; else goto _L1
		//   98  159:goto            7
_L1:
			return i;
		//   99  162:iload_2         
		//  100  163:ireturn         
			i = k;
		//  101  164:iload           10
		//  102  166:istore_2        
			  goto _L3
		//* 103  167:goto            153
		}

		int cross(double ad[], int i, double d, double d1)
		{
			int k;
			int l;
			l = 0;
		//    0    0:iconst_0        
		//    1    1:istore          11
			k = 0;
		//    2    3:iconst_0        
		//    3    4:istore          10
_L2:
			double d2;
			int j;
			if(k >= i)
				break MISSING_BLOCK_LABEL_286;
		//    4    6:iload           10
		//    5    8:iload_2         
		//    6    9:icmpge          286
			d2 = ad[k];
		//    7   12:aload_1         
		//    8   13:iload           10
		//    9   15:daload          
		//   10   16:dstore          7
			j = l;
		//   11   18:iload           11
		//   12   20:istore          9
			if(d2 >= -1.0000000000000001E-05D)
		//*  13   22:dload           7
		//*  14   24:ldc2w           #41  <Double -1.0000000000000001E-05D>
		//*  15   27:dcmpg           
		//*  16   28:iflt            44
			{
				if(d2 <= 1.0000100000000001D)
					break; /* Loop/switch isn't completed */
		//   17   31:dload           7
		//   18   33:ldc2w           #43  <Double 1.0000100000000001D>
		//   19   36:dcmpl           
		//   20   37:ifle            57
				j = l;
		//   21   40:iload           11
		//   22   42:istore          9
			}
_L3:
			k++;
		//   23   44:iload           10
		//   24   46:iconst_1        
		//   25   47:iadd            
		//   26   48:istore          10
			l = j;
		//   27   50:iload           9
		//   28   52:istore          11
			if(true) goto _L2; else goto _L1
		//   29   54:goto            6
_L1:
			if(d2 < 1.0000000000000001E-05D)
		//*  30   57:dload           7
		//*  31   59:ldc2w           #47  <Double 1.0000000000000001E-05D>
		//*  32   62:dcmpg           
		//*  33   63:ifge            125
			{
				j = l;
		//   34   66:iload           11
		//   35   68:istore          9
				if(d < 0.0D)
		//*  36   70:dload_3         
		//*  37   71:dconst_0        
		//*  38   72:dcmpg           
		//*  39   73:ifge            44
				{
					if(bx != 0.0D)
		//*  40   76:aload_0         
		//*  41   77:getfield        #27  <Field double bx>
		//*  42   80:dconst_0        
		//*  43   81:dcmpl           
		//*  44   82:ifeq            111
						d2 = bx;
		//   45   85:aload_0         
		//   46   86:getfield        #27  <Field double bx>
		//   47   89:dstore          7
					else
		//*  48   91:iload           11
		//*  49   93:istore          9
		//*  50   95:dload           7
		//*  51   97:dconst_0        
		//*  52   98:dcmpg           
		//*  53   99:ifge            44
		//*  54  102:iload           11
		//*  55  104:iconst_1        
		//*  56  105:isub            
		//*  57  106:istore          9
		//*  58  108:goto            44
						d2 = ax - bx;
		//   59  111:aload_0         
		//   60  112:getfield        #23  <Field double ax>
		//   61  115:aload_0         
		//   62  116:getfield        #27  <Field double bx>
		//   63  119:dsub            
		//   64  120:dstore          7
					j = l;
					if(d2 < 0.0D)
						j = l - 1;
				}
			} else
		//*  65  122:goto            91
			{
label0:
				{
					if(d2 <= 0.99999000000000005D)
						break label0;
		//   66  125:dload           7
		//   67  127:ldc2w           #49  <Double 0.99999000000000005D>
		//   68  130:dcmpl           
		//   69  131:ifle            199
					j = l;
		//   70  134:iload           11
		//   71  136:istore          9
					if(d < ay)
		//*  72  138:dload_3         
		//*  73  139:aload_0         
		//*  74  140:getfield        #25  <Field double ay>
		//*  75  143:dcmpg           
		//*  76  144:ifge            44
					{
						if(ax != bx)
		//*  77  147:aload_0         
		//*  78  148:getfield        #23  <Field double ax>
		//*  79  151:aload_0         
		//*  80  152:getfield        #27  <Field double bx>
		//*  81  155:dcmpl           
		//*  82  156:ifeq            190
							d2 = ax - bx;
		//   83  159:aload_0         
		//   84  160:getfield        #23  <Field double ax>
		//   85  163:aload_0         
		//   86  164:getfield        #27  <Field double bx>
		//   87  167:dsub            
		//   88  168:dstore          7
						else
		//*  89  170:iload           11
		//*  90  172:istore          9
		//*  91  174:dload           7
		//*  92  176:dconst_0        
		//*  93  177:dcmpl           
		//*  94  178:ifle            44
		//*  95  181:iload           11
		//*  96  183:iconst_1        
		//*  97  184:iadd            
		//*  98  185:istore          9
		//*  99  187:goto            44
							d2 = bx;
		//  100  190:aload_0         
		//  101  191:getfield        #27  <Field double bx>
		//  102  194:dstore          7
						j = l;
						if(d2 > 0.0D)
							j = l + 1;
					}
				}
			}
			  goto _L3
		//* 103  196:goto            170
			j = l;
		//  104  199:iload           11
		//  105  201:istore          9
			if(d2 * (Ay * d2 + By) <= d1) goto _L3; else goto _L4
		//  106  203:dload           7
		//  107  205:aload_0         
		//  108  206:getfield        #37  <Field double Ay>
		//  109  209:dload           7
		//  110  211:dmul            
		//  111  212:aload_0         
		//  112  213:getfield        #35  <Field double By>
		//  113  216:dadd            
		//  114  217:dmul            
		//  115  218:dload           5
		//  116  220:dcmpl           
		//  117  221:ifle            44
_L4:
			d2 = Ax * d2 + bx;
		//  118  224:aload_0         
		//  119  225:getfield        #33  <Field double Ax>
		//  120  228:dload           7
		//  121  230:dmul            
		//  122  231:aload_0         
		//  123  232:getfield        #27  <Field double bx>
		//  124  235:dadd            
		//  125  236:dstore          7
			if(d2 <= -1.0000000000000001E-05D) goto _L6; else goto _L5
		//  126  238:dload           7
		//  127  240:ldc2w           #41  <Double -1.0000000000000001E-05D>
		//  128  243:dcmpl           
		//  129  244:ifle            260
_L5:
			j = l;
		//  130  247:iload           11
		//  131  249:istore          9
			if(d2 < 1.0000000000000001E-05D) goto _L3; else goto _L6
		//  132  251:dload           7
		//  133  253:ldc2w           #47  <Double 1.0000000000000001E-05D>
		//  134  256:dcmpg           
		//  135  257:iflt            44
_L6:
			if(d2 > 0.0D)
		//* 136  260:dload           7
		//* 137  262:dconst_0        
		//* 138  263:dcmpl           
		//* 139  264:ifle            280
				j = 1;
		//  140  267:iconst_1        
		//  141  268:istore          9
			else
		//* 142  270:iload           11
		//* 143  272:iload           9
		//* 144  274:iadd            
		//* 145  275:istore          9
		//* 146  277:goto            44
				j = -1;
		//  147  280:iconst_m1       
		//  148  281:istore          9
			j = l + j;
			  goto _L3
		//* 149  283:goto            270
			return l;
		//  150  286:iload           11
		//  151  288:ireturn         
		}

		int solveExtrem(double ad[])
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			if(Ax != 0.0D)
		//*   2    2:aload_0         
		//*   3    3:getfield        #33  <Field double Ax>
		//*   4    6:dconst_0        
		//*   5    7:dcmpl           
		//*   6    8:ifeq            33
			{
				ad[0] = -Bx / (Ax + Ax);
		//    7   11:aload_1         
		//    8   12:iconst_0        
		//    9   13:aload_0         
		//   10   14:getfield        #31  <Field double Bx>
		//   11   17:dneg            
		//   12   18:aload_0         
		//   13   19:getfield        #33  <Field double Ax>
		//   14   22:aload_0         
		//   15   23:getfield        #33  <Field double Ax>
		//   16   26:dadd            
		//   17   27:ddiv            
		//   18   28:dastore         
				i = 0 + 1;
		//   19   29:iconst_0        
		//   20   30:iconst_1        
		//   21   31:iadd            
		//   22   32:istore_2        
			}
			int j = i;
		//   23   33:iload_2         
		//   24   34:istore_3        
			if(Ay != 0.0D)
		//*  25   35:aload_0         
		//*  26   36:getfield        #37  <Field double Ay>
		//*  27   39:dconst_0        
		//*  28   40:dcmpl           
		//*  29   41:ifeq            66
			{
				ad[i] = -By / (Ay + Ay);
		//   30   44:aload_1         
		//   31   45:iload_2         
		//   32   46:aload_0         
		//   33   47:getfield        #35  <Field double By>
		//   34   50:dneg            
		//   35   51:aload_0         
		//   36   52:getfield        #37  <Field double Ay>
		//   37   55:aload_0         
		//   38   56:getfield        #37  <Field double Ay>
		//   39   59:dadd            
		//   40   60:ddiv            
		//   41   61:dastore         
				j = i + 1;
		//   42   62:iload_2         
		//   43   63:iconst_1        
		//   44   64:iadd            
		//   45   65:istore_3        
			}
			return j;
		//   46   66:iload_3         
		//   47   67:ireturn         
		}

		int solvePoint(double ad[], double d)
		{
			return Crossing.solveQuad(new double[] {
				-d, Bx, Ax
			}, ad);
		//    0    0:iconst_3        
		//    1    1:newarray        double[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:dload_2         
		//    5    6:dneg            
		//    6    7:dastore         
		//    7    8:dup             
		//    8    9:iconst_1        
		//    9   10:aload_0         
		//   10   11:getfield        #31  <Field double Bx>
		//   11   14:dastore         
		//   12   15:dup             
		//   13   16:iconst_2        
		//   14   17:aload_0         
		//   15   18:getfield        #33  <Field double Ax>
		//   16   21:dastore         
		//   17   22:aload_1         
		//   18   23:invokestatic    #58  <Method int Crossing.solveQuad(double[], double[])>
		//   19   26:ireturn         
		}

		double Ax;
		double Ay;
		double Bx;
		double By;
		double ax;
		double ay;
		double bx;
		double by;

		public QuadCurve(double d, double d1, double d2, double d3, double d4, double d5)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			ax = d4 - d;
		//    2    4:aload_0         
		//    3    5:dload           9
		//    4    7:dload_1         
		//    5    8:dsub            
		//    6    9:putfield        #23  <Field double ax>
			ay = d5 - d1;
		//    7   12:aload_0         
		//    8   13:dload           11
		//    9   15:dload_3         
		//   10   16:dsub            
		//   11   17:putfield        #25  <Field double ay>
			bx = d2 - d;
		//   12   20:aload_0         
		//   13   21:dload           5
		//   14   23:dload_1         
		//   15   24:dsub            
		//   16   25:putfield        #27  <Field double bx>
			by = d3 - d1;
		//   17   28:aload_0         
		//   18   29:dload           7
		//   19   31:dload_3         
		//   20   32:dsub            
		//   21   33:putfield        #29  <Field double by>
			Bx = bx + bx;
		//   22   36:aload_0         
		//   23   37:aload_0         
		//   24   38:getfield        #27  <Field double bx>
		//   25   41:aload_0         
		//   26   42:getfield        #27  <Field double bx>
		//   27   45:dadd            
		//   28   46:putfield        #31  <Field double Bx>
			Ax = ax - Bx;
		//   29   49:aload_0         
		//   30   50:aload_0         
		//   31   51:getfield        #23  <Field double ax>
		//   32   54:aload_0         
		//   33   55:getfield        #31  <Field double Bx>
		//   34   58:dsub            
		//   35   59:putfield        #33  <Field double Ax>
			By = by + by;
		//   36   62:aload_0         
		//   37   63:aload_0         
		//   38   64:getfield        #29  <Field double by>
		//   39   67:aload_0         
		//   40   68:getfield        #29  <Field double by>
		//   41   71:dadd            
		//   42   72:putfield        #35  <Field double By>
			Ay = ay - By;
		//   43   75:aload_0         
		//   44   76:aload_0         
		//   45   77:getfield        #25  <Field double ay>
		//   46   80:aload_0         
		//   47   81:getfield        #35  <Field double By>
		//   48   84:dsub            
		//   49   85:putfield        #37  <Field double Ay>
		//   50   88:return          
		}
	}


	public Crossing()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	static int crossBound(double ad[], int i, double d, double d1)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int k = 0;
	//    4    6:iconst_0        
	//    5    7:istore          7
		int i1 = 0;
	//    6    9:iconst_0        
	//    7   10:istore          8
		int j = 2;
	//    8   12:iconst_2        
	//    9   13:istore          6
		while(j < i) 
	//*  10   15:iload           6
	//*  11   17:iload_1         
	//*  12   18:icmpge          68
		{
			if(ad[j] < d)
	//*  13   21:aload_0         
	//*  14   22:iload           6
	//*  15   24:daload          
	//*  16   25:dload_2         
	//*  17   26:dcmpg           
	//*  18   27:ifge            45
				k++;
	//   19   30:iload           7
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore          7
			else
	//*  23   36:iload           6
	//*  24   38:iconst_4        
	//*  25   39:iadd            
	//*  26   40:istore          6
	//*  27   42:goto            15
			if(ad[j] > d1)
	//*  28   45:aload_0         
	//*  29   46:iload           6
	//*  30   48:daload          
	//*  31   49:dload           4
	//*  32   51:dcmpl           
	//*  33   52:ifle            64
				i1++;
	//   34   55:iload           8
	//   35   57:iconst_1        
	//   36   58:iadd            
	//   37   59:istore          8
			else
	//*  38   61:goto            36
				return 255;
	//   39   64:sipush          255
	//   40   67:ireturn         
			j += 4;
		}
		if(i1 == 0)
	//*  41   68:iload           8
	//*  42   70:ifne            75
			return 0;
	//   43   73:iconst_0        
	//   44   74:ireturn         
		if(k != 0)
	//*  45   75:iload           7
	//*  46   77:ifeq            176
		{
			sortBound(ad, i);
	//   47   80:aload_0         
	//   48   81:iload_1         
	//   49   82:invokestatic    #33  <Method void sortBound(double[], int)>
			boolean flag;
			int l;
			if(ad[2] > d1)
	//*  50   85:aload_0         
	//*  51   86:iconst_2        
	//*  52   87:daload          
	//*  53   88:dload           4
	//*  54   90:dcmpl           
	//*  55   91:ifle            151
				flag = true;
	//   56   94:iconst_1        
	//   57   95:istore          6
			else
	//*  58   97:bipush          6
	//*  59   99:istore          7
	//*  60  101:iload           6
	//*  61  103:istore          8
	//*  62  105:iload           7
	//*  63  107:iload_1         
	//*  64  108:icmpge          176
	//*  65  111:aload_0         
	//*  66  112:iload           7
	//*  67  114:daload          
	//*  68  115:dload           4
	//*  69  117:dcmpl           
	//*  70  118:ifle            157
	//*  71  121:iconst_1        
	//*  72  122:istore          6
	//*  73  124:iload           8
	//*  74  126:iload           6
	//*  75  128:icmpeq          163
	//*  76  131:aload_0         
	//*  77  132:iload           7
	//*  78  134:iconst_1        
	//*  79  135:iadd            
	//*  80  136:daload          
	//*  81  137:aload_0         
	//*  82  138:iload           7
	//*  83  140:iconst_3        
	//*  84  141:isub            
	//*  85  142:daload          
	//*  86  143:dcmpl           
	//*  87  144:ifeq            163
	//*  88  147:sipush          255
	//*  89  150:ireturn         
				flag = false;
	//   90  151:iconst_0        
	//   91  152:istore          6
			l = 6;
			for(boolean flag1 = flag; l < i; flag1 = flag)
			{
				if(ad[l] > d1)
					flag = true;
				else
	//*  92  154:goto            97
					flag = false;
	//   93  157:iconst_0        
	//   94  158:istore          6
				if(flag1 != flag && ad[l + 1] != ad[l - 3])
					return 255;
	//*  95  160:goto            124
				l += 4;
	//   96  163:iload           7
	//   97  165:iconst_4        
	//   98  166:iadd            
	//   99  167:istore          7
			}

	//  100  169:iload           6
	//  101  171:istore          8
		}
	//* 102  173:goto            105
		return 254;
	//  103  176:sipush          254
	//  104  179:ireturn         
	}

	public static int crossCubic(double d, double d1, double d2, double d3, 
			double d4, double d5, double d6, double d7, double d8, double d9)
	{
		if(d8 < d && d8 < d2 && d8 < d4 && d8 < d6 || d8 > d && d8 > d2 && d8 > d4 && d8 > d6 || d9 > d1 && d9 > d3 && d9 > d5 && d9 > d7 || d == d2 && d2 == d4 && d4 == d6)
	//*   0    0:dload           16
	//*   1    2:dload_0         
	//*   2    3:dcmpg           
	//*   3    4:ifge            31
	//*   4    7:dload           16
	//*   5    9:dload           4
	//*   6   11:dcmpg           
	//*   7   12:ifge            31
	//*   8   15:dload           16
	//*   9   17:dload           8
	//*  10   19:dcmpg           
	//*  11   20:ifge            31
	//*  12   23:dload           16
	//*  13   25:dload           12
	//*  14   27:dcmpg           
	//*  15   28:iflt            116
	//*  16   31:dload           16
	//*  17   33:dload_0         
	//*  18   34:dcmpl           
	//*  19   35:ifle            62
	//*  20   38:dload           16
	//*  21   40:dload           4
	//*  22   42:dcmpl           
	//*  23   43:ifle            62
	//*  24   46:dload           16
	//*  25   48:dload           8
	//*  26   50:dcmpl           
	//*  27   51:ifle            62
	//*  28   54:dload           16
	//*  29   56:dload           12
	//*  30   58:dcmpl           
	//*  31   59:ifgt            116
	//*  32   62:dload           18
	//*  33   64:dload_2         
	//*  34   65:dcmpl           
	//*  35   66:ifle            93
	//*  36   69:dload           18
	//*  37   71:dload           6
	//*  38   73:dcmpl           
	//*  39   74:ifle            93
	//*  40   77:dload           18
	//*  41   79:dload           10
	//*  42   81:dcmpl           
	//*  43   82:ifle            93
	//*  44   85:dload           18
	//*  45   87:dload           14
	//*  46   89:dcmpl           
	//*  47   90:ifgt            116
	//*  48   93:dload_0         
	//*  49   94:dload           4
	//*  50   96:dcmpl           
	//*  51   97:ifne            118
	//*  52  100:dload           4
	//*  53  102:dload           8
	//*  54  104:dcmpl           
	//*  55  105:ifne            118
	//*  56  108:dload           8
	//*  57  110:dload           12
	//*  58  112:dcmpl           
	//*  59  113:ifne            118
			return 0;
	//   60  116:iconst_0        
	//   61  117:ireturn         
		if(d9 < d1 && d9 < d3 && d9 < d5 && d9 < d7 && d8 != d && d8 != d6)
	//*  62  118:dload           18
	//*  63  120:dload_2         
	//*  64  121:dcmpg           
	//*  65  122:ifge            209
	//*  66  125:dload           18
	//*  67  127:dload           6
	//*  68  129:dcmpg           
	//*  69  130:ifge            209
	//*  70  133:dload           18
	//*  71  135:dload           10
	//*  72  137:dcmpg           
	//*  73  138:ifge            209
	//*  74  141:dload           18
	//*  75  143:dload           14
	//*  76  145:dcmpg           
	//*  77  146:ifge            209
	//*  78  149:dload           16
	//*  79  151:dload_0         
	//*  80  152:dcmpl           
	//*  81  153:ifeq            209
	//*  82  156:dload           16
	//*  83  158:dload           12
	//*  84  160:dcmpl           
	//*  85  161:ifeq            209
		{
			if(d < d6)
	//*  86  164:dload_0         
	//*  87  165:dload           12
	//*  88  167:dcmpg           
	//*  89  168:ifge            190
				return d >= d8 || d8 >= d6 ? 0 : 1;
	//   90  171:dload_0         
	//   91  172:dload           16
	//   92  174:dcmpg           
	//   93  175:ifge            188
	//   94  178:dload           16
	//   95  180:dload           12
	//   96  182:dcmpg           
	//   97  183:ifge            188
	//   98  186:iconst_1        
	//   99  187:ireturn         
	//  100  188:iconst_0        
	//  101  189:ireturn         
			return d6 >= d8 || d8 >= d ? 0 : -1;
	//  102  190:dload           12
	//  103  192:dload           16
	//  104  194:dcmpg           
	//  105  195:ifge            207
	//  106  198:dload           16
	//  107  200:dload_0         
	//  108  201:dcmpg           
	//  109  202:ifge            207
	//  110  205:iconst_m1       
	//  111  206:ireturn         
	//  112  207:iconst_0        
	//  113  208:ireturn         
		} else
		{
			CubicCurve cubiccurve = new CubicCurve(d, d1, d2, d3, d4, d5, d6, d7);
	//  114  209:new             #6   <Class Crossing$CubicCurve>
	//  115  212:dup             
	//  116  213:dload_0         
	//  117  214:dload_2         
	//  118  215:dload           4
	//  119  217:dload           6
	//  120  219:dload           8
	//  121  221:dload           10
	//  122  223:dload           12
	//  123  225:dload           14
	//  124  227:invokespecial   #38  <Method void Crossing$CubicCurve(double, double, double, double, double, double, double, double)>
	//  125  230:astore          20
			d1 = d9 - d1;
	//  126  232:dload           18
	//  127  234:dload_2         
	//  128  235:dsub            
	//  129  236:dstore_2        
			double ad[] = new double[3];
	//  130  237:iconst_3        
	//  131  238:newarray        double[]
	//  132  240:astore          21
			return cubiccurve.cross(ad, cubiccurve.solvePoint(ad, d8 - d), d1, d1);
	//  133  242:aload           20
	//  134  244:aload           21
	//  135  246:aload           20
	//  136  248:aload           21
	//  137  250:dload           16
	//  138  252:dload_0         
	//  139  253:dsub            
	//  140  254:invokevirtual   #42  <Method int Crossing$CubicCurve.solvePoint(double[], double)>
	//  141  257:dload_2         
	//  142  258:dload_2         
	//  143  259:invokevirtual   #45  <Method int Crossing$CubicCurve.cross(double[], int, double, double)>
	//  144  262:ireturn         
		}
	}

	public static int crossLine(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		if(d4 < d && d4 < d2 || d4 > d && d4 > d2 || d5 > d1 && d5 > d3 || d == d2)
	//*   0    0:dload           8
	//*   1    2:dload_0         
	//*   2    3:dcmpg           
	//*   3    4:ifge            15
	//*   4    7:dload           8
	//*   5    9:dload           4
	//*   6   11:dcmpg           
	//*   7   12:iflt            52
	//*   8   15:dload           8
	//*   9   17:dload_0         
	//*  10   18:dcmpl           
	//*  11   19:ifle            30
	//*  12   22:dload           8
	//*  13   24:dload           4
	//*  14   26:dcmpl           
	//*  15   27:ifgt            52
	//*  16   30:dload           10
	//*  17   32:dload_2         
	//*  18   33:dcmpl           
	//*  19   34:ifle            45
	//*  20   37:dload           10
	//*  21   39:dload           6
	//*  22   41:dcmpl           
	//*  23   42:ifgt            52
	//*  24   45:dload_0         
	//*  25   46:dload           4
	//*  26   48:dcmpl           
	//*  27   49:ifne            54
			return 0;
	//   28   52:iconst_0        
	//   29   53:ireturn         
		if(d5 < d1 && d5 < d3 || ((d3 - d1) * (d4 - d)) / (d2 - d) > d5 - d1)
	//*  30   54:dload           10
	//*  31   56:dload_2         
	//*  32   57:dcmpg           
	//*  33   58:ifge            85
	//*  34   61:dload           10
	//*  35   63:dload           6
	//*  36   65:dcmpg           
	//*  37   66:ifge            85
		{
			if(d4 == d)
	//*  38   69:dload           8
	//*  39   71:dload_0         
	//*  40   72:dcmpl           
	//*  41   73:ifne            111
				return d >= d2 ? -1 : 0;
	//   42   76:dload_0         
	//   43   77:dload           4
	//   44   79:dcmpg           
	//   45   80:ifge            109
	//   46   83:iconst_0        
	//   47   84:ireturn         
	//   48   85:dload           6
	//   49   87:dload_2         
	//   50   88:dsub            
	//   51   89:dload           8
	//   52   91:dload_0         
	//   53   92:dsub            
	//   54   93:dmul            
	//   55   94:dload           4
	//   56   96:dload_0         
	//   57   97:dsub            
	//   58   98:ddiv            
	//   59   99:dload           10
	//   60  101:dload_2         
	//   61  102:dsub            
	//   62  103:dcmpg           
	//   63  104:ifgt            69
	//   64  107:iconst_0        
	//   65  108:ireturn         
	//   66  109:iconst_m1       
	//   67  110:ireturn         
		} else
		{
			return 0;
		}
		if(d4 == d2)
	//*  68  111:dload           8
	//*  69  113:dload           4
	//*  70  115:dcmpl           
	//*  71  116:ifne            130
			return d >= d2 ? 0 : 1;
	//   72  119:dload_0         
	//   73  120:dload           4
	//   74  122:dcmpg           
	//   75  123:ifge            128
	//   76  126:iconst_1        
	//   77  127:ireturn         
	//   78  128:iconst_0        
	//   79  129:ireturn         
		return d >= d2 ? -1 : 1;
	//   80  130:dload_0         
	//   81  131:dload           4
	//   82  133:dcmpg           
	//   83  134:ifge            139
	//   84  137:iconst_1        
	//   85  138:ireturn         
	//   86  139:iconst_m1       
	//   87  140:ireturn         
	}

	public static int crossPath(PathIterator pathiterator, double d, double d1)
	{
		double d4;
		double d5;
		double d7;
		double d8;
		int j;
		double ad[];
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          26
		d7 = 0.0D;
	//    2    3:dconst_0        
	//    3    4:dstore          15
		d8 = 0.0D;
	//    4    6:dconst_0        
	//    5    7:dstore          17
		d4 = 0.0D;
	//    6    9:dconst_0        
	//    7   10:dstore          9
		d5 = 0.0D;
	//    8   12:dconst_0        
	//    9   13:dstore          11
		ad = new double[6];
	//   10   15:bipush          6
	//   11   17:newarray        double[]
	//   12   19:astore          27
_L15:
		double d2;
		double d3;
		double d6;
		double d9;
		int i;
		d2 = d8;
	//   13   21:dload           17
	//   14   23:dstore          5
		d3 = d7;
	//   15   25:dload           15
	//   16   27:dstore          7
		d9 = d5;
	//   17   29:dload           11
	//   18   31:dstore          19
		d6 = d4;
	//   19   33:dload           9
	//   20   35:dstore          13
		i = j;
	//   21   37:iload           26
	//   22   39:istore          25
		if(pathiterator.isDone()) goto _L2; else goto _L1
	//   23   41:aload_0         
	//   24   42:invokeinterface #55  <Method boolean PathIterator.isDone()>
	//   25   47:ifne            133
_L1:
		pathiterator.currentSegment(ad);
	//   26   50:aload_0         
	//   27   51:aload           27
	//   28   53:invokeinterface #59  <Method int PathIterator.currentSegment(double[])>
		JVM INSTR tableswitch 0 4: default 92
	//	               0 166
	//	               1 227
	//	               2 268
	//	               3 325
	//	               4 398;
	//   29   58:tableswitch     0 4: default 92
	//	               0 166
	//	               1 227
	//	               2 268
	//	               3 325
	//	               4 398
		   goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
		i = j;
	//   30   92:iload           26
	//   31   94:istore          25
		d6 = d4;
	//   32   96:dload           9
	//   33   98:dstore          13
		d9 = d5;
	//   34  100:dload           11
	//   35  102:dstore          19
		d3 = d7;
	//   36  104:dload           15
	//   37  106:dstore          7
		d2 = d8;
	//   38  108:dload           17
	//   39  110:dstore          5
_L13:
		if(d != d2 || d1 != d3)
			break; /* Loop/switch isn't completed */
	//   40  112:dload_1         
	//   41  113:dload           5
	//   42  115:dcmpl           
	//   43  116:ifne            471
	//   44  119:dload_3         
	//   45  120:dload           7
	//   46  122:dcmpl           
	//   47  123:ifne            471
		i = 0;
	//   48  126:iconst_0        
	//   49  127:istore          25
		d3 = d6;
	//   50  129:dload           13
	//   51  131:dstore          7
_L2:
		j = i;
	//   52  133:iload           25
	//   53  135:istore          26
		if(d3 != d6)
	//*  54  137:dload           7
	//*  55  139:dload           13
	//*  56  141:dcmpl           
	//*  57  142:ifeq            163
			j = i + crossLine(d2, d3, d9, d6, d, d1);
	//   58  145:iload           25
	//   59  147:dload           5
	//   60  149:dload           7
	//   61  151:dload           19
	//   62  153:dload           13
	//   63  155:dload_1         
	//   64  156:dload_3         
	//   65  157:invokestatic    #61  <Method int crossLine(double, double, double, double, double, double)>
	//   66  160:iadd            
	//   67  161:istore          26
		return j;
	//   68  163:iload           26
	//   69  165:ireturn         
_L4:
		if(d8 != d5) goto _L10; else goto _L9
	//   70  166:dload           17
	//   71  168:dload           11
	//   72  170:dcmpl           
	//   73  171:ifne            186
_L9:
		i = j;
	//   74  174:iload           26
	//   75  176:istore          25
		if(d7 == d4) goto _L11; else goto _L10
	//   76  178:dload           15
	//   77  180:dload           9
	//   78  182:dcmpl           
	//   79  183:ifeq            204
_L10:
		i = j + crossLine(d8, d7, d5, d4, d, d1);
	//   80  186:iload           26
	//   81  188:dload           17
	//   82  190:dload           15
	//   83  192:dload           11
	//   84  194:dload           9
	//   85  196:dload_1         
	//   86  197:dload_3         
	//   87  198:invokestatic    #61  <Method int crossLine(double, double, double, double, double, double)>
	//   88  201:iadd            
	//   89  202:istore          25
_L11:
		d2 = ad[0];
	//   90  204:aload           27
	//   91  206:iconst_0        
	//   92  207:daload          
	//   93  208:dstore          5
		d9 = d2;
	//   94  210:dload           5
	//   95  212:dstore          19
		d3 = ad[1];
	//   96  214:aload           27
	//   97  216:iconst_1        
	//   98  217:daload          
	//   99  218:dstore          7
		d6 = d3;
	//  100  220:dload           7
	//  101  222:dstore          13
		continue; /* Loop/switch isn't completed */
	//  102  224:goto            112
_L5:
		d2 = ad[0];
	//  103  227:aload           27
	//  104  229:iconst_0        
	//  105  230:daload          
	//  106  231:dstore          5
		d3 = ad[1];
	//  107  233:aload           27
	//  108  235:iconst_1        
	//  109  236:daload          
	//  110  237:dstore          7
		i = j + crossLine(d8, d7, d2, d3, d, d1);
	//  111  239:iload           26
	//  112  241:dload           17
	//  113  243:dload           15
	//  114  245:dload           5
	//  115  247:dload           7
	//  116  249:dload_1         
	//  117  250:dload_3         
	//  118  251:invokestatic    #61  <Method int crossLine(double, double, double, double, double, double)>
	//  119  254:iadd            
	//  120  255:istore          25
		d9 = d5;
	//  121  257:dload           11
	//  122  259:dstore          19
		d6 = d4;
	//  123  261:dload           9
	//  124  263:dstore          13
		continue; /* Loop/switch isn't completed */
	//  125  265:goto            112
_L6:
		d6 = ad[0];
	//  126  268:aload           27
	//  127  270:iconst_0        
	//  128  271:daload          
	//  129  272:dstore          13
		d9 = ad[1];
	//  130  274:aload           27
	//  131  276:iconst_1        
	//  132  277:daload          
	//  133  278:dstore          19
		d2 = ad[2];
	//  134  280:aload           27
	//  135  282:iconst_2        
	//  136  283:daload          
	//  137  284:dstore          5
		d3 = ad[3];
	//  138  286:aload           27
	//  139  288:iconst_3        
	//  140  289:daload          
	//  141  290:dstore          7
		i = j + crossQuad(d8, d7, d6, d9, d2, d3, d, d1);
	//  142  292:iload           26
	//  143  294:dload           17
	//  144  296:dload           15
	//  145  298:dload           13
	//  146  300:dload           19
	//  147  302:dload           5
	//  148  304:dload           7
	//  149  306:dload_1         
	//  150  307:dload_3         
	//  151  308:invokestatic    #65  <Method int crossQuad(double, double, double, double, double, double, double, double)>
	//  152  311:iadd            
	//  153  312:istore          25
		d9 = d5;
	//  154  314:dload           11
	//  155  316:dstore          19
		d6 = d4;
	//  156  318:dload           9
	//  157  320:dstore          13
		continue; /* Loop/switch isn't completed */
	//  158  322:goto            112
_L7:
		d6 = ad[0];
	//  159  325:aload           27
	//  160  327:iconst_0        
	//  161  328:daload          
	//  162  329:dstore          13
		d9 = ad[1];
	//  163  331:aload           27
	//  164  333:iconst_1        
	//  165  334:daload          
	//  166  335:dstore          19
		double d10 = ad[2];
	//  167  337:aload           27
	//  168  339:iconst_2        
	//  169  340:daload          
	//  170  341:dstore          21
		double d11 = ad[3];
	//  171  343:aload           27
	//  172  345:iconst_3        
	//  173  346:daload          
	//  174  347:dstore          23
		d2 = ad[4];
	//  175  349:aload           27
	//  176  351:iconst_4        
	//  177  352:daload          
	//  178  353:dstore          5
		d3 = ad[5];
	//  179  355:aload           27
	//  180  357:iconst_5        
	//  181  358:daload          
	//  182  359:dstore          7
		i = j + crossCubic(d8, d7, d6, d9, d10, d11, d2, d3, d, d1);
	//  183  361:iload           26
	//  184  363:dload           17
	//  185  365:dload           15
	//  186  367:dload           13
	//  187  369:dload           19
	//  188  371:dload           21
	//  189  373:dload           23
	//  190  375:dload           5
	//  191  377:dload           7
	//  192  379:dload_1         
	//  193  380:dload_3         
	//  194  381:invokestatic    #67  <Method int crossCubic(double, double, double, double, double, double, double, double, double, double)>
	//  195  384:iadd            
	//  196  385:istore          25
		d9 = d5;
	//  197  387:dload           11
	//  198  389:dstore          19
		d6 = d4;
	//  199  391:dload           9
	//  200  393:dstore          13
		continue; /* Loop/switch isn't completed */
	//  201  395:goto            112
_L8:
		if(d7 == d4)
	//* 202  398:dload           15
	//* 203  400:dload           9
	//* 204  402:dcmpl           
	//* 205  403:ifne            434
		{
			d2 = d8;
	//  206  406:dload           17
	//  207  408:dstore          5
			d3 = d7;
	//  208  410:dload           15
	//  209  412:dstore          7
			d9 = d5;
	//  210  414:dload           11
	//  211  416:dstore          19
			d6 = d4;
	//  212  418:dload           9
	//  213  420:dstore          13
			i = j;
	//  214  422:iload           26
	//  215  424:istore          25
			if(d8 == d5)
				continue; /* Loop/switch isn't completed */
	//  216  426:dload           17
	//  217  428:dload           11
	//  218  430:dcmpl           
	//  219  431:ifeq            112
		}
		i = j + crossLine(d8, d7, d5, d4, d, d1);
	//  220  434:iload           26
	//  221  436:dload           17
	//  222  438:dload           15
	//  223  440:dload           11
	//  224  442:dload           9
	//  225  444:dload_1         
	//  226  445:dload_3         
	//  227  446:invokestatic    #61  <Method int crossLine(double, double, double, double, double, double)>
	//  228  449:iadd            
	//  229  450:istore          25
		d3 = d4;
	//  230  452:dload           9
	//  231  454:dstore          7
		d2 = d5;
	//  232  456:dload           11
	//  233  458:dstore          5
		d9 = d5;
	//  234  460:dload           11
	//  235  462:dstore          19
		d6 = d4;
	//  236  464:dload           9
	//  237  466:dstore          13
		if(true) goto _L13; else goto _L12
	//  238  468:goto            112
_L12:
		pathiterator.next();
	//  239  471:aload_0         
	//  240  472:invokeinterface #70  <Method void PathIterator.next()>
		d8 = d2;
	//  241  477:dload           5
	//  242  479:dstore          17
		d7 = d3;
	//  243  481:dload           7
	//  244  483:dstore          15
		d5 = d9;
	//  245  485:dload           19
	//  246  487:dstore          11
		d4 = d6;
	//  247  489:dload           13
	//  248  491:dstore          9
		j = i;
	//  249  493:iload           25
	//  250  495:istore          26
		if(true) goto _L15; else goto _L14
	//  251  497:goto            21
_L14:
	}

	public static int crossQuad(double d, double d1, double d2, double d3, 
			double d4, double d5, double d6, double d7)
	{
		if(d6 < d && d6 < d2 && d6 < d4 || d6 > d && d6 > d2 && d6 > d4 || d7 > d1 && d7 > d3 && d7 > d5 || d == d2 && d2 == d4)
	//*   0    0:dload           12
	//*   1    2:dload_0         
	//*   2    3:dcmpg           
	//*   3    4:ifge            23
	//*   4    7:dload           12
	//*   5    9:dload           4
	//*   6   11:dcmpg           
	//*   7   12:ifge            23
	//*   8   15:dload           12
	//*   9   17:dload           8
	//*  10   19:dcmpg           
	//*  11   20:iflt            84
	//*  12   23:dload           12
	//*  13   25:dload_0         
	//*  14   26:dcmpl           
	//*  15   27:ifle            46
	//*  16   30:dload           12
	//*  17   32:dload           4
	//*  18   34:dcmpl           
	//*  19   35:ifle            46
	//*  20   38:dload           12
	//*  21   40:dload           8
	//*  22   42:dcmpl           
	//*  23   43:ifgt            84
	//*  24   46:dload           14
	//*  25   48:dload_2         
	//*  26   49:dcmpl           
	//*  27   50:ifle            69
	//*  28   53:dload           14
	//*  29   55:dload           6
	//*  30   57:dcmpl           
	//*  31   58:ifle            69
	//*  32   61:dload           14
	//*  33   63:dload           10
	//*  34   65:dcmpl           
	//*  35   66:ifgt            84
	//*  36   69:dload_0         
	//*  37   70:dload           4
	//*  38   72:dcmpl           
	//*  39   73:ifne            86
	//*  40   76:dload           4
	//*  41   78:dload           8
	//*  42   80:dcmpl           
	//*  43   81:ifne            86
			return 0;
	//   44   84:iconst_0        
	//   45   85:ireturn         
		if(d7 < d1 && d7 < d3 && d7 < d5 && d6 != d && d6 != d4)
	//*  46   86:dload           14
	//*  47   88:dload_2         
	//*  48   89:dcmpg           
	//*  49   90:ifge            169
	//*  50   93:dload           14
	//*  51   95:dload           6
	//*  52   97:dcmpg           
	//*  53   98:ifge            169
	//*  54  101:dload           14
	//*  55  103:dload           10
	//*  56  105:dcmpg           
	//*  57  106:ifge            169
	//*  58  109:dload           12
	//*  59  111:dload_0         
	//*  60  112:dcmpl           
	//*  61  113:ifeq            169
	//*  62  116:dload           12
	//*  63  118:dload           8
	//*  64  120:dcmpl           
	//*  65  121:ifeq            169
		{
			if(d < d4)
	//*  66  124:dload_0         
	//*  67  125:dload           8
	//*  68  127:dcmpg           
	//*  69  128:ifge            150
				return d >= d6 || d6 >= d4 ? 0 : 1;
	//   70  131:dload_0         
	//   71  132:dload           12
	//   72  134:dcmpg           
	//   73  135:ifge            148
	//   74  138:dload           12
	//   75  140:dload           8
	//   76  142:dcmpg           
	//   77  143:ifge            148
	//   78  146:iconst_1        
	//   79  147:ireturn         
	//   80  148:iconst_0        
	//   81  149:ireturn         
			return d4 >= d6 || d6 >= d ? 0 : -1;
	//   82  150:dload           8
	//   83  152:dload           12
	//   84  154:dcmpg           
	//   85  155:ifge            167
	//   86  158:dload           12
	//   87  160:dload_0         
	//   88  161:dcmpg           
	//   89  162:ifge            167
	//   90  165:iconst_m1       
	//   91  166:ireturn         
	//   92  167:iconst_0        
	//   93  168:ireturn         
		} else
		{
			QuadCurve quadcurve = new QuadCurve(d, d1, d2, d3, d4, d5);
	//   94  169:new             #9   <Class Crossing$QuadCurve>
	//   95  172:dup             
	//   96  173:dload_0         
	//   97  174:dload_2         
	//   98  175:dload           4
	//   99  177:dload           6
	//  100  179:dload           8
	//  101  181:dload           10
	//  102  183:invokespecial   #73  <Method void Crossing$QuadCurve(double, double, double, double, double, double)>
	//  103  186:astore          16
			d1 = d7 - d1;
	//  104  188:dload           14
	//  105  190:dload_2         
	//  106  191:dsub            
	//  107  192:dstore_2        
			double ad[] = new double[3];
	//  108  193:iconst_3        
	//  109  194:newarray        double[]
	//  110  196:astore          17
			return quadcurve.cross(ad, quadcurve.solvePoint(ad, d6 - d), d1, d1);
	//  111  198:aload           16
	//  112  200:aload           17
	//  113  202:aload           16
	//  114  204:aload           17
	//  115  206:dload           12
	//  116  208:dload_0         
	//  117  209:dsub            
	//  118  210:invokevirtual   #74  <Method int Crossing$QuadCurve.solvePoint(double[], double)>
	//  119  213:dload_2         
	//  120  214:dload_2         
	//  121  215:invokevirtual   #75  <Method int Crossing$QuadCurve.cross(double[], int, double, double)>
	//  122  218:ireturn         
		}
	}

	public static int crossShape(Shape shape, double d, double d1)
	{
		if(!shape.getBounds2D().contains(d, d1))
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #83  <Method Rectangle2D Shape.getBounds2D()>
	//*   2    6:dload_1         
	//*   3    7:dload_3         
	//*   4    8:invokevirtual   #89  <Method boolean Rectangle2D.contains(double, double)>
	//*   5   11:ifne            16
			return 0;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		else
			return crossPath(shape.getPathIterator(((com.itextpdf.awt.geom.AffineTransform) (null))), d, d1);
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokeinterface #93  <Method PathIterator Shape.getPathIterator(com.itextpdf.awt.geom.AffineTransform)>
	//   11   23:dload_1         
	//   12   24:dload_3         
	//   13   25:invokestatic    #95  <Method int crossPath(PathIterator, double, double)>
	//   14   28:ireturn         
	}

	static int fixRoots(double ad[], int i)
	{
		int j;
		int k;
		k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
_L5:
		int l;
		if(k >= i)
			break MISSING_BLOCK_LABEL_67;
	//    4    4:iload_3         
	//    5    5:iload_1         
	//    6    6:icmpge          67
		l = k + 1;
	//    7    9:iload_3         
	//    8   10:iconst_1        
	//    9   11:iadd            
	//   10   12:istore          4
_L3:
		if(l >= i)
			break MISSING_BLOCK_LABEL_50;
	//   11   14:iload           4
	//   12   16:iload_1         
	//   13   17:icmpge          50
		if(!isZero(ad[k] - ad[l])) goto _L2; else goto _L1
	//   14   20:aload_0         
	//   15   21:iload_3         
	//   16   22:daload          
	//   17   23:aload_0         
	//   18   24:iload           4
	//   19   26:daload          
	//   20   27:dsub            
	//   21   28:invokestatic    #101 <Method boolean isZero(double)>
	//   22   31:ifeq            41
_L1:
		k++;
	//   23   34:iload_3         
	//   24   35:iconst_1        
	//   25   36:iadd            
	//   26   37:istore_3        
		continue; /* Loop/switch isn't completed */
	//   27   38:goto            4
_L2:
		l++;
	//   28   41:iload           4
	//   29   43:iconst_1        
	//   30   44:iadd            
	//   31   45:istore          4
		  goto _L3
	//*  32   47:goto            14
		int i1 = j + 1;
	//   33   50:iload_2         
	//   34   51:iconst_1        
	//   35   52:iadd            
	//   36   53:istore          4
		ad[j] = ad[k];
	//   37   55:aload_0         
	//   38   56:iload_2         
	//   39   57:aload_0         
	//   40   58:iload_3         
	//   41   59:daload          
	//   42   60:dastore         
		j = i1;
	//   43   61:iload           4
	//   44   63:istore_2        
		  goto _L1
	//*  45   64:goto            34
		return j;
	//   46   67:iload_2         
	//   47   68:ireturn         
		if(true) goto _L5; else goto _L4
_L4:
	}

	public static int intersectCubic(double d, double d1, double d2, double d3, 
			double d4, double d5, double d6, double d7, double d8, double d9, double d10, 
			double d11)
	{
		if(d10 < d && d10 < d2 && d10 < d4 && d10 < d6 || d8 > d && d8 > d2 && d8 > d4 && d8 > d6 || d9 > d1 && d9 > d3 && d9 > d5 && d9 > d7)
	//*   0    0:dload           20
	//*   1    2:dload_0         
	//*   2    3:dcmpg           
	//*   3    4:ifge            31
	//*   4    7:dload           20
	//*   5    9:dload           4
	//*   6   11:dcmpg           
	//*   7   12:ifge            31
	//*   8   15:dload           20
	//*   9   17:dload           8
	//*  10   19:dcmpg           
	//*  11   20:ifge            31
	//*  12   23:dload           20
	//*  13   25:dload           12
	//*  14   27:dcmpg           
	//*  15   28:iflt            93
	//*  16   31:dload           16
	//*  17   33:dload_0         
	//*  18   34:dcmpl           
	//*  19   35:ifle            62
	//*  20   38:dload           16
	//*  21   40:dload           4
	//*  22   42:dcmpl           
	//*  23   43:ifle            62
	//*  24   46:dload           16
	//*  25   48:dload           8
	//*  26   50:dcmpl           
	//*  27   51:ifle            62
	//*  28   54:dload           16
	//*  29   56:dload           12
	//*  30   58:dcmpl           
	//*  31   59:ifgt            93
	//*  32   62:dload           18
	//*  33   64:dload_2         
	//*  34   65:dcmpl           
	//*  35   66:ifle            95
	//*  36   69:dload           18
	//*  37   71:dload           6
	//*  38   73:dcmpl           
	//*  39   74:ifle            95
	//*  40   77:dload           18
	//*  41   79:dload           10
	//*  42   81:dcmpl           
	//*  43   82:ifle            95
	//*  44   85:dload           18
	//*  45   87:dload           14
	//*  46   89:dcmpl           
	//*  47   90:ifle            95
			return 0;
	//   48   93:iconst_0        
	//   49   94:ireturn         
		if(d11 < d1 && d11 < d3 && d11 < d5 && d11 < d7 && d8 != d && d8 != d6)
	//*  50   95:dload           22
	//*  51   97:dload_2         
	//*  52   98:dcmpg           
	//*  53   99:ifge            186
	//*  54  102:dload           22
	//*  55  104:dload           6
	//*  56  106:dcmpg           
	//*  57  107:ifge            186
	//*  58  110:dload           22
	//*  59  112:dload           10
	//*  60  114:dcmpg           
	//*  61  115:ifge            186
	//*  62  118:dload           22
	//*  63  120:dload           14
	//*  64  122:dcmpg           
	//*  65  123:ifge            186
	//*  66  126:dload           16
	//*  67  128:dload_0         
	//*  68  129:dcmpl           
	//*  69  130:ifeq            186
	//*  70  133:dload           16
	//*  71  135:dload           12
	//*  72  137:dcmpl           
	//*  73  138:ifeq            186
		{
			if(d < d6)
	//*  74  141:dload_0         
	//*  75  142:dload           12
	//*  76  144:dcmpg           
	//*  77  145:ifge            167
				return d >= d8 || d8 >= d6 ? 0 : 1;
	//   78  148:dload_0         
	//   79  149:dload           16
	//   80  151:dcmpg           
	//   81  152:ifge            165
	//   82  155:dload           16
	//   83  157:dload           12
	//   84  159:dcmpg           
	//   85  160:ifge            165
	//   86  163:iconst_1        
	//   87  164:ireturn         
	//   88  165:iconst_0        
	//   89  166:ireturn         
			return d6 >= d8 || d8 >= d ? 0 : -1;
	//   90  167:dload           12
	//   91  169:dload           16
	//   92  171:dcmpg           
	//   93  172:ifge            184
	//   94  175:dload           16
	//   95  177:dload_0         
	//   96  178:dcmpg           
	//   97  179:ifge            184
	//   98  182:iconst_m1       
	//   99  183:ireturn         
	//  100  184:iconst_0        
	//  101  185:ireturn         
		}
		CubicCurve cubiccurve = new CubicCurve(d, d1, d2, d3, d4, d5, d6, d7);
	//  102  186:new             #6   <Class Crossing$CubicCurve>
	//  103  189:dup             
	//  104  190:dload_0         
	//  105  191:dload_2         
	//  106  192:dload           4
	//  107  194:dload           6
	//  108  196:dload           8
	//  109  198:dload           10
	//  110  200:dload           12
	//  111  202:dload           14
	//  112  204:invokespecial   #38  <Method void Crossing$CubicCurve(double, double, double, double, double, double, double, double)>
	//  113  207:astore          28
		d3 = d8 - d;
	//  114  209:dload           16
	//  115  211:dload_0         
	//  116  212:dsub            
	//  117  213:dstore          6
		d2 = d9 - d1;
	//  118  215:dload           18
	//  119  217:dload_2         
	//  120  218:dsub            
	//  121  219:dstore          4
		d4 = d10 - d;
	//  122  221:dload           20
	//  123  223:dload_0         
	//  124  224:dsub            
	//  125  225:dstore          8
		d1 = d11 - d1;
	//  126  227:dload           22
	//  127  229:dload_2         
	//  128  230:dsub            
	//  129  231:dstore_2        
		double ad[] = new double[3];
	//  130  232:iconst_3        
	//  131  233:newarray        double[]
	//  132  235:astore          29
		double ad1[] = new double[3];
	//  133  237:iconst_3        
	//  134  238:newarray        double[]
	//  135  240:astore          30
		int k = cubiccurve.solvePoint(ad, d3);
	//  136  242:aload           28
	//  137  244:aload           29
	//  138  246:dload           6
	//  139  248:invokevirtual   #42  <Method int Crossing$CubicCurve.solvePoint(double[], double)>
	//  140  251:istore          26
		int i = cubiccurve.solvePoint(ad1, d4);
	//  141  253:aload           28
	//  142  255:aload           30
	//  143  257:dload           8
	//  144  259:invokevirtual   #42  <Method int Crossing$CubicCurve.solvePoint(double[], double)>
	//  145  262:istore          24
		if(k == 0 && i == 0)
	//* 146  264:iload           26
	//* 147  266:ifne            276
	//* 148  269:iload           24
	//* 149  271:ifne            276
			return 0;
	//  150  274:iconst_0        
	//  151  275:ireturn         
		d3 -= 1.0000000000000001E-05D;
	//  152  276:dload           6
	//  153  278:ldc2w           #16  <Double 1.0000000000000001E-05D>
	//  154  281:dsub            
	//  155  282:dstore          6
		d4 += 1.0000000000000001E-05D;
	//  156  284:dload           8
	//  157  286:ldc2w           #16  <Double 1.0000000000000001E-05D>
	//  158  289:dadd            
	//  159  290:dstore          8
		double ad2[] = new double[40];
	//  160  292:bipush          40
	//  161  294:newarray        double[]
	//  162  296:astore          31
		int j = cubiccurve.addBound(ad2, cubiccurve.addBound(ad2, cubiccurve.addBound(ad2, cubiccurve.addBound(ad2, 0, ad, k, d3, d4, false, 0), ad1, i, d3, d4, false, 1), ad1, cubiccurve.solveExtremX(ad1), d3, d4, true, 2), ad1, cubiccurve.solveExtremY(ad1), d3, d4, true, 4);
	//  163  298:aload           28
	//  164  300:aload           31
	//  165  302:aload           28
	//  166  304:aload           31
	//  167  306:aload           28
	//  168  308:aload           31
	//  169  310:aload           28
	//  170  312:aload           31
	//  171  314:iconst_0        
	//  172  315:aload           29
	//  173  317:iload           26
	//  174  319:dload           6
	//  175  321:dload           8
	//  176  323:iconst_0        
	//  177  324:iconst_0        
	//  178  325:invokevirtual   #107 <Method int Crossing$CubicCurve.addBound(double[], int, double[], int, double, double, boolean, int)>
	//  179  328:aload           30
	//  180  330:iload           24
	//  181  332:dload           6
	//  182  334:dload           8
	//  183  336:iconst_0        
	//  184  337:iconst_1        
	//  185  338:invokevirtual   #107 <Method int Crossing$CubicCurve.addBound(double[], int, double[], int, double, double, boolean, int)>
	//  186  341:aload           30
	//  187  343:aload           28
	//  188  345:aload           30
	//  189  347:invokevirtual   #110 <Method int Crossing$CubicCurve.solveExtremX(double[])>
	//  190  350:dload           6
	//  191  352:dload           8
	//  192  354:iconst_1        
	//  193  355:iconst_2        
	//  194  356:invokevirtual   #107 <Method int Crossing$CubicCurve.addBound(double[], int, double[], int, double, double, boolean, int)>
	//  195  359:aload           30
	//  196  361:aload           28
	//  197  363:aload           30
	//  198  365:invokevirtual   #113 <Method int Crossing$CubicCurve.solveExtremY(double[])>
	//  199  368:dload           6
	//  200  370:dload           8
	//  201  372:iconst_1        
	//  202  373:iconst_4        
	//  203  374:invokevirtual   #107 <Method int Crossing$CubicCurve.addBound(double[], int, double[], int, double, double, boolean, int)>
	//  204  377:istore          25
		i = j;
	//  205  379:iload           25
	//  206  381:istore          24
		if(d8 < d)
	//* 207  383:dload           16
	//* 208  385:dload_0         
	//* 209  386:dcmpg           
	//* 210  387:ifge            451
		{
			i = j;
	//  211  390:iload           25
	//  212  392:istore          24
			if(d < d10)
	//* 213  394:dload_0         
	//* 214  395:dload           20
	//* 215  397:dcmpg           
	//* 216  398:ifge            451
			{
				i = j + 1;
	//  217  401:iload           25
	//  218  403:iconst_1        
	//  219  404:iadd            
	//  220  405:istore          24
				ad2[j] = 0.0D;
	//  221  407:aload           31
	//  222  409:iload           25
	//  223  411:dconst_0        
	//  224  412:dastore         
				j = i + 1;
	//  225  413:iload           24
	//  226  415:iconst_1        
	//  227  416:iadd            
	//  228  417:istore          25
				ad2[i] = 0.0D;
	//  229  419:aload           31
	//  230  421:iload           24
	//  231  423:dconst_0        
	//  232  424:dastore         
				int l = j + 1;
	//  233  425:iload           25
	//  234  427:iconst_1        
	//  235  428:iadd            
	//  236  429:istore          27
				ad2[j] = 0.0D;
	//  237  431:aload           31
	//  238  433:iload           25
	//  239  435:dconst_0        
	//  240  436:dastore         
				i = l + 1;
	//  241  437:iload           27
	//  242  439:iconst_1        
	//  243  440:iadd            
	//  244  441:istore          24
				ad2[l] = 6D;
	//  245  443:aload           31
	//  246  445:iload           27
	//  247  447:ldc2w           #114 <Double 6D>
	//  248  450:dastore         
			}
		}
		j = i;
	//  249  451:iload           24
	//  250  453:istore          25
		if(d8 < d6)
	//* 251  455:dload           16
	//* 252  457:dload           12
	//* 253  459:dcmpg           
	//* 254  460:ifge            533
		{
			j = i;
	//  255  463:iload           24
	//  256  465:istore          25
			if(d6 < d10)
	//* 257  467:dload           12
	//* 258  469:dload           20
	//* 259  471:dcmpg           
	//* 260  472:ifge            533
			{
				j = i + 1;
	//  261  475:iload           24
	//  262  477:iconst_1        
	//  263  478:iadd            
	//  264  479:istore          25
				ad2[i] = 1.0D;
	//  265  481:aload           31
	//  266  483:iload           24
	//  267  485:dconst_1        
	//  268  486:dastore         
				i = j + 1;
	//  269  487:iload           25
	//  270  489:iconst_1        
	//  271  490:iadd            
	//  272  491:istore          24
				ad2[j] = cubiccurve.ax;
	//  273  493:aload           31
	//  274  495:iload           25
	//  275  497:aload           28
	//  276  499:getfield        #118 <Field double Crossing$CubicCurve.ax>
	//  277  502:dastore         
				int i1 = i + 1;
	//  278  503:iload           24
	//  279  505:iconst_1        
	//  280  506:iadd            
	//  281  507:istore          27
				ad2[i] = cubiccurve.ay;
	//  282  509:aload           31
	//  283  511:iload           24
	//  284  513:aload           28
	//  285  515:getfield        #121 <Field double Crossing$CubicCurve.ay>
	//  286  518:dastore         
				j = i1 + 1;
	//  287  519:iload           27
	//  288  521:iconst_1        
	//  289  522:iadd            
	//  290  523:istore          25
				ad2[i1] = 7D;
	//  291  525:aload           31
	//  292  527:iload           27
	//  293  529:ldc2w           #122 <Double 7D>
	//  294  532:dastore         
			}
		}
		i = crossBound(ad2, j, d2, d1);
	//  295  533:aload           31
	//  296  535:iload           25
	//  297  537:dload           4
	//  298  539:dload_2         
	//  299  540:invokestatic    #125 <Method int crossBound(double[], int, double, double)>
	//  300  543:istore          24
		if(i != 254)
	//* 301  545:iload           24
	//* 302  547:sipush          254
	//* 303  550:icmpeq          556
			return i;
	//  304  553:iload           24
	//  305  555:ireturn         
		else
			return cubiccurve.cross(ad, k, d2, d1);
	//  306  556:aload           28
	//  307  558:aload           29
	//  308  560:iload           26
	//  309  562:dload           4
	//  310  564:dload_2         
	//  311  565:invokevirtual   #45  <Method int Crossing$CubicCurve.cross(double[], int, double, double)>
	//  312  568:ireturn         
	}

	public static int intersectLine(double d, double d1, double d2, double d3, 
			double d4, double d5, double d6, double d7)
	{
		if(d6 < d && d6 < d2 || d4 > d && d4 > d2 || d5 > d1 && d5 > d3)
	//*   0    0:dload           12
	//*   1    2:dload_0         
	//*   2    3:dcmpg           
	//*   3    4:ifge            15
	//*   4    7:dload           12
	//*   5    9:dload           4
	//*   6   11:dcmpg           
	//*   7   12:iflt            45
	//*   8   15:dload           8
	//*   9   17:dload_0         
	//*  10   18:dcmpl           
	//*  11   19:ifle            30
	//*  12   22:dload           8
	//*  13   24:dload           4
	//*  14   26:dcmpl           
	//*  15   27:ifgt            45
	//*  16   30:dload           10
	//*  17   32:dload_2         
	//*  18   33:dcmpl           
	//*  19   34:ifle            47
	//*  20   37:dload           10
	//*  21   39:dload           6
	//*  22   41:dcmpl           
	//*  23   42:ifle            47
			return 0;
	//   24   45:iconst_0        
	//   25   46:ireturn         
		if(d7 >= d1 || d7 >= d3) goto _L2; else goto _L1
	//   26   47:dload           14
	//   27   49:dload_2         
	//   28   50:dcmpg           
	//   29   51:ifge            71
	//   30   54:dload           14
	//   31   56:dload           6
	//   32   58:dcmpg           
	//   33   59:ifge            71
_L1:
		if(d == d2)
	//*  34   62:dload_0         
	//*  35   63:dload           4
	//*  36   65:dcmpl           
	//*  37   66:ifne            224
			return 0;
	//   38   69:iconst_0        
	//   39   70:ireturn         
		break MISSING_BLOCK_LABEL_224;
_L2:
		if(d == d2)
	//*  40   71:dload_0         
	//*  41   72:dload           4
	//*  42   74:dcmpl           
	//*  43   75:ifne            82
			return 255;
	//   44   78:sipush          255
	//   45   81:ireturn         
		if(d >= d2) goto _L4; else goto _L3
	//   46   82:dload_0         
	//   47   83:dload           4
	//   48   85:dcmpg           
	//   49   86:ifge            170
_L3:
		double d8;
		if(d < d4)
	//*  50   89:dload_0         
	//*  51   90:dload           8
	//*  52   92:dcmpg           
	//*  53   93:ifge            161
			d8 = d4;
	//   54   96:dload           8
	//   55   98:dstore          16
		else
	//*  56  100:dload           4
	//*  57  102:dload           12
	//*  58  104:dcmpg           
	//*  59  105:ifge            167
	//*  60  108:dload           4
	//*  61  110:dstore          12
	//*  62  112:dload           6
	//*  63  114:dload_2         
	//*  64  115:dsub            
	//*  65  116:dload           4
	//*  66  118:dload_0         
	//*  67  119:dsub            
	//*  68  120:ddiv            
	//*  69  121:dstore          6
	//*  70  123:dload           16
	//*  71  125:dload_0         
	//*  72  126:dsub            
	//*  73  127:dload           6
	//*  74  129:dmul            
	//*  75  130:dload_2         
	//*  76  131:dadd            
	//*  77  132:dstore          16
	//*  78  134:dload           12
	//*  79  136:dload_0         
	//*  80  137:dsub            
	//*  81  138:dload           6
	//*  82  140:dmul            
	//*  83  141:dload_2         
	//*  84  142:dadd            
	//*  85  143:dstore_2        
	//*  86  144:dload           16
	//*  87  146:dload           10
	//*  88  148:dcmpg           
	//*  89  149:ifge            205
	//*  90  152:dload_2         
	//*  91  153:dload           10
	//*  92  155:dcmpg           
	//*  93  156:ifge            205
	//*  94  159:iconst_0        
	//*  95  160:ireturn         
			d8 = d;
	//   96  161:dload_0         
	//   97  162:dstore          16
		if(d2 < d6)
			d6 = d2;
_L6:
		d3 = (d3 - d1) / (d2 - d);
		d8 = (d8 - d) * d3 + d1;
		d1 = (d6 - d) * d3 + d1;
		if(d8 < d5 && d1 < d5)
			return 0;
		break; /* Loop/switch isn't completed */
	//*  98  164:goto            100
	//*  99  167:goto            112
_L4:
		if(d2 < d4)
	//* 100  170:dload           4
	//* 101  172:dload           8
	//* 102  174:dcmpg           
	//* 103  175:ifge            195
			d8 = d4;
	//  104  178:dload           8
	//  105  180:dstore          16
		else
	//* 106  182:dload_0         
	//* 107  183:dload           12
	//* 108  185:dcmpg           
	//* 109  186:ifge            202
	//* 110  189:dload_0         
	//* 111  190:dstore          12
	//* 112  192:goto            112
			d8 = d2;
	//  113  195:dload           4
	//  114  197:dstore          16
		if(d < d6)
			d6 = d;
		if(true) goto _L6; else goto _L5
	//* 115  199:goto            182
	//* 116  202:goto            192
_L5:
		if(d8 > d7 && d1 > d7) goto _L1; else goto _L7
	//  117  205:dload           16
	//  118  207:dload           14
	//  119  209:dcmpl           
	//  120  210:ifle            220
	//  121  213:dload_2         
	//  122  214:dload           14
	//  123  216:dcmpl           
	//  124  217:ifgt            62
_L7:
		return 255;
	//  125  220:sipush          255
	//  126  223:ireturn         
		if(d4 == d)
	//* 127  224:dload           8
	//* 128  226:dload_0         
	//* 129  227:dcmpl           
	//* 130  228:ifne            242
			return d >= d2 ? -1 : 0;
	//  131  231:dload_0         
	//  132  232:dload           4
	//  133  234:dcmpg           
	//  134  235:ifge            240
	//  135  238:iconst_0        
	//  136  239:ireturn         
	//  137  240:iconst_m1       
	//  138  241:ireturn         
		if(d4 == d2)
	//* 139  242:dload           8
	//* 140  244:dload           4
	//* 141  246:dcmpl           
	//* 142  247:ifne            261
			return d >= d2 ? 0 : 1;
	//  143  250:dload_0         
	//  144  251:dload           4
	//  145  253:dcmpg           
	//  146  254:ifge            259
	//  147  257:iconst_1        
	//  148  258:ireturn         
	//  149  259:iconst_0        
	//  150  260:ireturn         
		if(d < d2)
	//* 151  261:dload_0         
	//* 152  262:dload           4
	//* 153  264:dcmpg           
	//* 154  265:ifge            287
			return d >= d4 || d4 >= d2 ? 0 : 1;
	//  155  268:dload_0         
	//  156  269:dload           8
	//  157  271:dcmpg           
	//  158  272:ifge            285
	//  159  275:dload           8
	//  160  277:dload           4
	//  161  279:dcmpg           
	//  162  280:ifge            285
	//  163  283:iconst_1        
	//  164  284:ireturn         
	//  165  285:iconst_0        
	//  166  286:ireturn         
		return d2 >= d4 || d4 >= d ? 0 : -1;
	//  167  287:dload           4
	//  168  289:dload           8
	//  169  291:dcmpg           
	//  170  292:ifge            304
	//  171  295:dload           8
	//  172  297:dload_0         
	//  173  298:dcmpg           
	//  174  299:ifge            304
	//  175  302:iconst_m1       
	//  176  303:ireturn         
	//  177  304:iconst_0        
	//  178  305:ireturn         
	}

	public static int intersectPath(PathIterator pathiterator, double d, double d1, double d2, double d3)
	{
		double d4;
		double d5;
		double d14;
		double d15;
		int k;
		double ad[];
		k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          30
		double d10 = 0.0D;
	//    2    3:dconst_0        
	//    3    4:dstore          15
		double d6 = 0.0D;
	//    4    6:dconst_0        
	//    5    7:dstore          13
		d4 = 0.0D;
	//    6    9:dconst_0        
	//    7   10:dstore          9
		d5 = 0.0D;
	//    8   12:dconst_0        
	//    9   13:dstore          11
		ad = new double[6];
	//   10   15:bipush          6
	//   11   17:newarray        double[]
	//   12   19:astore          33
		d14 = d + d2;
	//   13   21:dload_1         
	//   14   22:dload           5
	//   15   24:dadd            
	//   16   25:dstore          17
		d15 = d1 + d3;
	//   17   27:dload_3         
	//   18   28:dload           7
	//   19   30:dadd            
	//   20   31:dstore          19
		d3 = d10;
	//   21   33:dload           15
	//   22   35:dstore          7
		d2 = d6;
	//   23   37:dload           13
	//   24   39:dstore          5
_L10:
		if(pathiterator.isDone()) goto _L2; else goto _L1
	//   25   41:aload_0         
	//   26   42:invokeinterface #55  <Method boolean PathIterator.isDone()>
	//   27   47:ifne            414
_L1:
		int i;
		boolean flag;
		boolean flag1;
		flag = false;
	//   28   50:iconst_0        
	//   29   51:istore          31
		flag1 = false;
	//   30   53:iconst_0        
	//   31   54:istore          32
		i = 0;
	//   32   56:iconst_0        
	//   33   57:istore          29
		pathiterator.currentSegment(ad);
	//   34   59:aload_0         
	//   35   60:aload           33
	//   36   62:invokeinterface #59  <Method int PathIterator.currentSegment(double[])>
		JVM INSTR tableswitch 0 4: default 100
	//	               0 112
	//	               1 174
	//	               2 216
	//	               3 274
	//	               4 348;
	//   37   67:tableswitch     0 4: default 100
	//	               0 112
	//	               1 174
	//	               2 216
	//	               3 274
	//	               4 348
		   goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
		if(i == 255)
	//*  38  100:iload           29
	//*  39  102:sipush          255
	//*  40  105:icmpne          398
			return 255;
	//   41  108:sipush          255
	//   42  111:ireturn         
		break; /* Loop/switch isn't completed */
_L4:
label0:
		{
			if(d2 == d5)
	//*  43  112:dload           5
	//*  44  114:dload           11
	//*  45  116:dcmpl           
	//*  46  117:ifne            132
			{
				i = ((int) (flag));
	//   47  120:iload           31
	//   48  122:istore          29
				if(d3 == d4)
					break label0;
	//   49  124:dload           7
	//   50  126:dload           9
	//   51  128:dcmpl           
	//   52  129:ifeq            151
			}
			i = intersectLine(d2, d3, d5, d4, d, d1, d14, d15);
	//   53  132:dload           5
	//   54  134:dload           7
	//   55  136:dload           11
	//   56  138:dload           9
	//   57  140:dload_1         
	//   58  141:dload_3         
	//   59  142:dload           17
	//   60  144:dload           19
	//   61  146:invokestatic    #130 <Method int intersectLine(double, double, double, double, double, double, double, double)>
	//   62  149:istore          29
		}
		d2 = ad[0];
	//   63  151:aload           33
	//   64  153:iconst_0        
	//   65  154:daload          
	//   66  155:dstore          5
		d5 = d2;
	//   67  157:dload           5
	//   68  159:dstore          11
		d3 = ad[1];
	//   69  161:aload           33
	//   70  163:iconst_1        
	//   71  164:daload          
	//   72  165:dstore          7
		d4 = d3;
	//   73  167:dload           7
	//   74  169:dstore          9
		continue; /* Loop/switch isn't completed */
	//   75  171:goto            100
_L5:
		double d7 = ad[0];
	//   76  174:aload           33
	//   77  176:iconst_0        
	//   78  177:daload          
	//   79  178:dstore          13
		double d11 = ad[1];
	//   80  180:aload           33
	//   81  182:iconst_1        
	//   82  183:daload          
	//   83  184:dstore          15
		i = intersectLine(d2, d3, d7, d11, d, d1, d14, d15);
	//   84  186:dload           5
	//   85  188:dload           7
	//   86  190:dload           13
	//   87  192:dload           15
	//   88  194:dload_1         
	//   89  195:dload_3         
	//   90  196:dload           17
	//   91  198:dload           19
	//   92  200:invokestatic    #130 <Method int intersectLine(double, double, double, double, double, double, double, double)>
	//   93  203:istore          29
		d3 = d11;
	//   94  205:dload           15
	//   95  207:dstore          7
		d2 = d7;
	//   96  209:dload           13
	//   97  211:dstore          5
		continue; /* Loop/switch isn't completed */
	//   98  213:goto            100
_L6:
		double d16 = ad[0];
	//   99  216:aload           33
	//  100  218:iconst_0        
	//  101  219:daload          
	//  102  220:dstore          21
		double d18 = ad[1];
	//  103  222:aload           33
	//  104  224:iconst_1        
	//  105  225:daload          
	//  106  226:dstore          23
		double d8 = ad[2];
	//  107  228:aload           33
	//  108  230:iconst_2        
	//  109  231:daload          
	//  110  232:dstore          13
		double d12 = ad[3];
	//  111  234:aload           33
	//  112  236:iconst_3        
	//  113  237:daload          
	//  114  238:dstore          15
		i = intersectQuad(d2, d3, d16, d18, d8, d12, d, d1, d14, d15);
	//  115  240:dload           5
	//  116  242:dload           7
	//  117  244:dload           21
	//  118  246:dload           23
	//  119  248:dload           13
	//  120  250:dload           15
	//  121  252:dload_1         
	//  122  253:dload_3         
	//  123  254:dload           17
	//  124  256:dload           19
	//  125  258:invokestatic    #133 <Method int intersectQuad(double, double, double, double, double, double, double, double, double, double)>
	//  126  261:istore          29
		d3 = d12;
	//  127  263:dload           15
	//  128  265:dstore          7
		d2 = d8;
	//  129  267:dload           13
	//  130  269:dstore          5
		continue; /* Loop/switch isn't completed */
	//  131  271:goto            100
_L7:
		double d17 = ad[0];
	//  132  274:aload           33
	//  133  276:iconst_0        
	//  134  277:daload          
	//  135  278:dstore          21
		double d19 = ad[1];
	//  136  280:aload           33
	//  137  282:iconst_1        
	//  138  283:daload          
	//  139  284:dstore          23
		double d20 = ad[2];
	//  140  286:aload           33
	//  141  288:iconst_2        
	//  142  289:daload          
	//  143  290:dstore          25
		double d21 = ad[3];
	//  144  292:aload           33
	//  145  294:iconst_3        
	//  146  295:daload          
	//  147  296:dstore          27
		double d9 = ad[4];
	//  148  298:aload           33
	//  149  300:iconst_4        
	//  150  301:daload          
	//  151  302:dstore          13
		double d13 = ad[5];
	//  152  304:aload           33
	//  153  306:iconst_5        
	//  154  307:daload          
	//  155  308:dstore          15
		i = intersectCubic(d2, d3, d17, d19, d20, d21, d9, d13, d, d1, d14, d15);
	//  156  310:dload           5
	//  157  312:dload           7
	//  158  314:dload           21
	//  159  316:dload           23
	//  160  318:dload           25
	//  161  320:dload           27
	//  162  322:dload           13
	//  163  324:dload           15
	//  164  326:dload_1         
	//  165  327:dload_3         
	//  166  328:dload           17
	//  167  330:dload           19
	//  168  332:invokestatic    #135 <Method int intersectCubic(double, double, double, double, double, double, double, double, double, double, double, double)>
	//  169  335:istore          29
		d3 = d13;
	//  170  337:dload           15
	//  171  339:dstore          7
		d2 = d9;
	//  172  341:dload           13
	//  173  343:dstore          5
		continue; /* Loop/switch isn't completed */
	//  174  345:goto            100
_L8:
label1:
		{
			if(d3 == d4)
	//* 175  348:dload           7
	//* 176  350:dload           9
	//* 177  352:dcmpl           
	//* 178  353:ifne            368
			{
				i = ((int) (flag1));
	//  179  356:iload           32
	//  180  358:istore          29
				if(d2 == d5)
					break label1;
	//  181  360:dload           5
	//  182  362:dload           11
	//  183  364:dcmpl           
	//  184  365:ifeq            387
			}
			i = intersectLine(d2, d3, d5, d4, d, d1, d14, d15);
	//  185  368:dload           5
	//  186  370:dload           7
	//  187  372:dload           11
	//  188  374:dload           9
	//  189  376:dload_1         
	//  190  377:dload_3         
	//  191  378:dload           17
	//  192  380:dload           19
	//  193  382:invokestatic    #130 <Method int intersectLine(double, double, double, double, double, double, double, double)>
	//  194  385:istore          29
		}
		d2 = d5;
	//  195  387:dload           11
	//  196  389:dstore          5
		d3 = d4;
	//  197  391:dload           9
	//  198  393:dstore          7
		if(true) goto _L3; else goto _L9
	//  199  395:goto            100
_L9:
		k += i;
	//  200  398:iload           30
	//  201  400:iload           29
	//  202  402:iadd            
	//  203  403:istore          30
		pathiterator.next();
	//  204  405:aload_0         
	//  205  406:invokeinterface #70  <Method void PathIterator.next()>
		  goto _L10
	//* 206  411:goto            41
_L2:
		int j = k;
	//  207  414:iload           30
	//  208  416:istore          29
		if(d3 != d4)
	//* 209  418:dload           7
	//* 210  420:dload           9
	//* 211  422:dcmpl           
	//* 212  423:ifeq            464
		{
			j = intersectLine(d2, d3, d5, d4, d, d1, d14, d15);
	//  213  426:dload           5
	//  214  428:dload           7
	//  215  430:dload           11
	//  216  432:dload           9
	//  217  434:dload_1         
	//  218  435:dload_3         
	//  219  436:dload           17
	//  220  438:dload           19
	//  221  440:invokestatic    #130 <Method int intersectLine(double, double, double, double, double, double, double, double)>
	//  222  443:istore          29
			if(j == 255)
	//* 223  445:iload           29
	//* 224  447:sipush          255
	//* 225  450:icmpne          457
				return 255;
	//  226  453:sipush          255
	//  227  456:ireturn         
			j = k + j;
	//  228  457:iload           30
	//  229  459:iload           29
	//  230  461:iadd            
	//  231  462:istore          29
		}
		return j;
	//  232  464:iload           29
	//  233  466:ireturn         
	}

	public static int intersectQuad(double d, double d1, double d2, double d3, 
			double d4, double d5, double d6, double d7, double d8, double d9)
	{
		if(d8 < d && d8 < d2 && d8 < d4 || d6 > d && d6 > d2 && d6 > d4 || d7 > d1 && d7 > d3 && d7 > d5)
	//*   0    0:dload           16
	//*   1    2:dload_0         
	//*   2    3:dcmpg           
	//*   3    4:ifge            23
	//*   4    7:dload           16
	//*   5    9:dload           4
	//*   6   11:dcmpg           
	//*   7   12:ifge            23
	//*   8   15:dload           16
	//*   9   17:dload           8
	//*  10   19:dcmpg           
	//*  11   20:iflt            69
	//*  12   23:dload           12
	//*  13   25:dload_0         
	//*  14   26:dcmpl           
	//*  15   27:ifle            46
	//*  16   30:dload           12
	//*  17   32:dload           4
	//*  18   34:dcmpl           
	//*  19   35:ifle            46
	//*  20   38:dload           12
	//*  21   40:dload           8
	//*  22   42:dcmpl           
	//*  23   43:ifgt            69
	//*  24   46:dload           14
	//*  25   48:dload_2         
	//*  26   49:dcmpl           
	//*  27   50:ifle            71
	//*  28   53:dload           14
	//*  29   55:dload           6
	//*  30   57:dcmpl           
	//*  31   58:ifle            71
	//*  32   61:dload           14
	//*  33   63:dload           10
	//*  34   65:dcmpl           
	//*  35   66:ifle            71
			return 0;
	//   36   69:iconst_0        
	//   37   70:ireturn         
		if(d9 < d1 && d9 < d3 && d9 < d5 && d6 != d && d6 != d4)
	//*  38   71:dload           18
	//*  39   73:dload_2         
	//*  40   74:dcmpg           
	//*  41   75:ifge            154
	//*  42   78:dload           18
	//*  43   80:dload           6
	//*  44   82:dcmpg           
	//*  45   83:ifge            154
	//*  46   86:dload           18
	//*  47   88:dload           10
	//*  48   90:dcmpg           
	//*  49   91:ifge            154
	//*  50   94:dload           12
	//*  51   96:dload_0         
	//*  52   97:dcmpl           
	//*  53   98:ifeq            154
	//*  54  101:dload           12
	//*  55  103:dload           8
	//*  56  105:dcmpl           
	//*  57  106:ifeq            154
		{
			if(d < d4)
	//*  58  109:dload_0         
	//*  59  110:dload           8
	//*  60  112:dcmpg           
	//*  61  113:ifge            135
				return d >= d6 || d6 >= d4 ? 0 : 1;
	//   62  116:dload_0         
	//   63  117:dload           12
	//   64  119:dcmpg           
	//   65  120:ifge            133
	//   66  123:dload           12
	//   67  125:dload           8
	//   68  127:dcmpg           
	//   69  128:ifge            133
	//   70  131:iconst_1        
	//   71  132:ireturn         
	//   72  133:iconst_0        
	//   73  134:ireturn         
			return d4 >= d6 || d6 >= d ? 0 : -1;
	//   74  135:dload           8
	//   75  137:dload           12
	//   76  139:dcmpg           
	//   77  140:ifge            152
	//   78  143:dload           12
	//   79  145:dload_0         
	//   80  146:dcmpg           
	//   81  147:ifge            152
	//   82  150:iconst_m1       
	//   83  151:ireturn         
	//   84  152:iconst_0        
	//   85  153:ireturn         
		}
		QuadCurve quadcurve = new QuadCurve(d, d1, d2, d3, d4, d5);
	//   86  154:new             #9   <Class Crossing$QuadCurve>
	//   87  157:dup             
	//   88  158:dload_0         
	//   89  159:dload_2         
	//   90  160:dload           4
	//   91  162:dload           6
	//   92  164:dload           8
	//   93  166:dload           10
	//   94  168:invokespecial   #73  <Method void Crossing$QuadCurve(double, double, double, double, double, double)>
	//   95  171:astore          24
		d3 = d6 - d;
	//   96  173:dload           12
	//   97  175:dload_0         
	//   98  176:dsub            
	//   99  177:dstore          6
		d2 = d7 - d1;
	//  100  179:dload           14
	//  101  181:dload_2         
	//  102  182:dsub            
	//  103  183:dstore          4
		d5 = d8 - d;
	//  104  185:dload           16
	//  105  187:dload_0         
	//  106  188:dsub            
	//  107  189:dstore          10
		d1 = d9 - d1;
	//  108  191:dload           18
	//  109  193:dload_2         
	//  110  194:dsub            
	//  111  195:dstore_2        
		double ad[] = new double[3];
	//  112  196:iconst_3        
	//  113  197:newarray        double[]
	//  114  199:astore          25
		double ad1[] = new double[3];
	//  115  201:iconst_3        
	//  116  202:newarray        double[]
	//  117  204:astore          26
		int k = quadcurve.solvePoint(ad, d3);
	//  118  206:aload           24
	//  119  208:aload           25
	//  120  210:dload           6
	//  121  212:invokevirtual   #74  <Method int Crossing$QuadCurve.solvePoint(double[], double)>
	//  122  215:istore          22
		int i = quadcurve.solvePoint(ad1, d5);
	//  123  217:aload           24
	//  124  219:aload           26
	//  125  221:dload           10
	//  126  223:invokevirtual   #74  <Method int Crossing$QuadCurve.solvePoint(double[], double)>
	//  127  226:istore          20
		if(k == 0 && i == 0)
	//* 128  228:iload           22
	//* 129  230:ifne            240
	//* 130  233:iload           20
	//* 131  235:ifne            240
			return 0;
	//  132  238:iconst_0        
	//  133  239:ireturn         
		d3 -= 1.0000000000000001E-05D;
	//  134  240:dload           6
	//  135  242:ldc2w           #16  <Double 1.0000000000000001E-05D>
	//  136  245:dsub            
	//  137  246:dstore          6
		d5 += 1.0000000000000001E-05D;
	//  138  248:dload           10
	//  139  250:ldc2w           #16  <Double 1.0000000000000001E-05D>
	//  140  253:dadd            
	//  141  254:dstore          10
		double ad2[] = new double[28];
	//  142  256:bipush          28
	//  143  258:newarray        double[]
	//  144  260:astore          27
		int j = quadcurve.addBound(ad2, quadcurve.addBound(ad2, quadcurve.addBound(ad2, 0, ad, k, d3, d5, false, 0), ad1, i, d3, d5, false, 1), ad1, quadcurve.solveExtrem(ad1), d3, d5, true, 2);
	//  145  262:aload           24
	//  146  264:aload           27
	//  147  266:aload           24
	//  148  268:aload           27
	//  149  270:aload           24
	//  150  272:aload           27
	//  151  274:iconst_0        
	//  152  275:aload           25
	//  153  277:iload           22
	//  154  279:dload           6
	//  155  281:dload           10
	//  156  283:iconst_0        
	//  157  284:iconst_0        
	//  158  285:invokevirtual   #136 <Method int Crossing$QuadCurve.addBound(double[], int, double[], int, double, double, boolean, int)>
	//  159  288:aload           26
	//  160  290:iload           20
	//  161  292:dload           6
	//  162  294:dload           10
	//  163  296:iconst_0        
	//  164  297:iconst_1        
	//  165  298:invokevirtual   #136 <Method int Crossing$QuadCurve.addBound(double[], int, double[], int, double, double, boolean, int)>
	//  166  301:aload           26
	//  167  303:aload           24
	//  168  305:aload           26
	//  169  307:invokevirtual   #139 <Method int Crossing$QuadCurve.solveExtrem(double[])>
	//  170  310:dload           6
	//  171  312:dload           10
	//  172  314:iconst_1        
	//  173  315:iconst_2        
	//  174  316:invokevirtual   #136 <Method int Crossing$QuadCurve.addBound(double[], int, double[], int, double, double, boolean, int)>
	//  175  319:istore          21
		i = j;
	//  176  321:iload           21
	//  177  323:istore          20
		if(d6 < d)
	//* 178  325:dload           12
	//* 179  327:dload_0         
	//* 180  328:dcmpg           
	//* 181  329:ifge            393
		{
			i = j;
	//  182  332:iload           21
	//  183  334:istore          20
			if(d < d8)
	//* 184  336:dload_0         
	//* 185  337:dload           16
	//* 186  339:dcmpg           
	//* 187  340:ifge            393
			{
				i = j + 1;
	//  188  343:iload           21
	//  189  345:iconst_1        
	//  190  346:iadd            
	//  191  347:istore          20
				ad2[j] = 0.0D;
	//  192  349:aload           27
	//  193  351:iload           21
	//  194  353:dconst_0        
	//  195  354:dastore         
				j = i + 1;
	//  196  355:iload           20
	//  197  357:iconst_1        
	//  198  358:iadd            
	//  199  359:istore          21
				ad2[i] = 0.0D;
	//  200  361:aload           27
	//  201  363:iload           20
	//  202  365:dconst_0        
	//  203  366:dastore         
				int l = j + 1;
	//  204  367:iload           21
	//  205  369:iconst_1        
	//  206  370:iadd            
	//  207  371:istore          23
				ad2[j] = 0.0D;
	//  208  373:aload           27
	//  209  375:iload           21
	//  210  377:dconst_0        
	//  211  378:dastore         
				i = l + 1;
	//  212  379:iload           23
	//  213  381:iconst_1        
	//  214  382:iadd            
	//  215  383:istore          20
				ad2[l] = 4D;
	//  216  385:aload           27
	//  217  387:iload           23
	//  218  389:ldc2w           #140 <Double 4D>
	//  219  392:dastore         
			}
		}
		j = i;
	//  220  393:iload           20
	//  221  395:istore          21
		if(d6 < d4)
	//* 222  397:dload           12
	//* 223  399:dload           8
	//* 224  401:dcmpg           
	//* 225  402:ifge            475
		{
			j = i;
	//  226  405:iload           20
	//  227  407:istore          21
			if(d4 < d8)
	//* 228  409:dload           8
	//* 229  411:dload           16
	//* 230  413:dcmpg           
	//* 231  414:ifge            475
			{
				j = i + 1;
	//  232  417:iload           20
	//  233  419:iconst_1        
	//  234  420:iadd            
	//  235  421:istore          21
				ad2[i] = 1.0D;
	//  236  423:aload           27
	//  237  425:iload           20
	//  238  427:dconst_1        
	//  239  428:dastore         
				i = j + 1;
	//  240  429:iload           21
	//  241  431:iconst_1        
	//  242  432:iadd            
	//  243  433:istore          20
				ad2[j] = quadcurve.ax;
	//  244  435:aload           27
	//  245  437:iload           21
	//  246  439:aload           24
	//  247  441:getfield        #142 <Field double Crossing$QuadCurve.ax>
	//  248  444:dastore         
				int i1 = i + 1;
	//  249  445:iload           20
	//  250  447:iconst_1        
	//  251  448:iadd            
	//  252  449:istore          23
				ad2[i] = quadcurve.ay;
	//  253  451:aload           27
	//  254  453:iload           20
	//  255  455:aload           24
	//  256  457:getfield        #143 <Field double Crossing$QuadCurve.ay>
	//  257  460:dastore         
				j = i1 + 1;
	//  258  461:iload           23
	//  259  463:iconst_1        
	//  260  464:iadd            
	//  261  465:istore          21
				ad2[i1] = 5D;
	//  262  467:aload           27
	//  263  469:iload           23
	//  264  471:ldc2w           #144 <Double 5D>
	//  265  474:dastore         
			}
		}
		i = crossBound(ad2, j, d2, d1);
	//  266  475:aload           27
	//  267  477:iload           21
	//  268  479:dload           4
	//  269  481:dload_2         
	//  270  482:invokestatic    #125 <Method int crossBound(double[], int, double, double)>
	//  271  485:istore          20
		if(i != 254)
	//* 272  487:iload           20
	//* 273  489:sipush          254
	//* 274  492:icmpeq          498
			return i;
	//  275  495:iload           20
	//  276  497:ireturn         
		else
			return quadcurve.cross(ad, k, d2, d1);
	//  277  498:aload           24
	//  278  500:aload           25
	//  279  502:iload           22
	//  280  504:dload           4
	//  281  506:dload_2         
	//  282  507:invokevirtual   #75  <Method int Crossing$QuadCurve.cross(double[], int, double, double)>
	//  283  510:ireturn         
	}

	public static int intersectShape(Shape shape, double d, double d1, double d2, double d3)
	{
		if(!shape.getBounds2D().intersects(d, d1, d2, d3))
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #83  <Method Rectangle2D Shape.getBounds2D()>
	//*   2    6:dload_1         
	//*   3    7:dload_3         
	//*   4    8:dload           5
	//*   5   10:dload           7
	//*   6   12:invokevirtual   #151 <Method boolean Rectangle2D.intersects(double, double, double, double)>
	//*   7   15:ifne            20
			return 0;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		else
			return intersectPath(shape.getPathIterator(((com.itextpdf.awt.geom.AffineTransform) (null))), d, d1, d2, d3);
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:invokeinterface #93  <Method PathIterator Shape.getPathIterator(com.itextpdf.awt.geom.AffineTransform)>
	//   13   27:dload_1         
	//   14   28:dload_3         
	//   15   29:dload           5
	//   16   31:dload           7
	//   17   33:invokestatic    #153 <Method int intersectPath(PathIterator, double, double, double, double)>
	//   18   36:ireturn         
	}

	public static boolean isInsideEvenOdd(int i)
	{
		return (i & 1) != 0;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:iand            
	//    3    3:ifeq            8
	//    4    6:iconst_1        
	//    5    7:ireturn         
	//    6    8:iconst_0        
	//    7    9:ireturn         
	}

	public static boolean isInsideNonZero(int i)
	{
		return i != 0;
	//    0    0:iload_0         
	//    1    1:ifeq            6
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iconst_0        
	//    5    7:ireturn         
	}

	public static boolean isZero(double d)
	{
		return -1.0000000000000001E-05D < d && d < 1.0000000000000001E-05D;
	//    0    0:ldc2w           #157 <Double -1.0000000000000001E-05D>
	//    1    3:dload_0         
	//    2    4:dcmpg           
	//    3    5:ifge            18
	//    4    8:dload_0         
	//    5    9:ldc2w           #16  <Double 1.0000000000000001E-05D>
	//    6   12:dcmpg           
	//    7   13:ifge            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public static int solveCubic(double ad[], double ad1[])
	{
		double d7;
		double d8;
		double d9;
		double d10;
		double d11;
		d7 = ad[3];
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:daload          
	//    3    3:dstore          6
		if(d7 == 0.0D)
	//*   4    5:dload           6
	//*   5    7:dconst_0        
	//*   6    8:dcmpl           
	//*   7    9:ifne            18
			return solveQuad(ad, ad1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokestatic    #163 <Method int solveQuad(double[], double[])>
	//   11   17:ireturn         
		double d = ad[2] / d7;
	//   12   18:aload_0         
	//   13   19:iconst_2        
	//   14   20:daload          
	//   15   21:dload           6
	//   16   23:ddiv            
	//   17   24:dstore_2        
		double d3 = ad[1] / d7;
	//   18   25:aload_0         
	//   19   26:iconst_1        
	//   20   27:daload          
	//   21   28:dload           6
	//   22   30:ddiv            
	//   23   31:dstore          4
		d8 = ad[0] / d7;
	//   24   33:aload_0         
	//   25   34:iconst_0        
	//   26   35:daload          
	//   27   36:dload           6
	//   28   38:ddiv            
	//   29   39:dstore          8
		d7 = (d * d - 3D * d3) / 9D;
	//   30   41:dload_2         
	//   31   42:dload_2         
	//   32   43:dmul            
	//   33   44:ldc2w           #164 <Double 3D>
	//   34   47:dload           4
	//   35   49:dmul            
	//   36   50:dsub            
	//   37   51:ldc2w           #166 <Double 9D>
	//   38   54:ddiv            
	//   39   55:dstore          6
		d11 = ((2D * d * d * d - 9D * d * d3) + 27D * d8) / 54D;
	//   40   57:ldc2w           #168 <Double 2D>
	//   41   60:dload_2         
	//   42   61:dmul            
	//   43   62:dload_2         
	//   44   63:dmul            
	//   45   64:dload_2         
	//   46   65:dmul            
	//   47   66:ldc2w           #166 <Double 9D>
	//   48   69:dload_2         
	//   49   70:dmul            
	//   50   71:dload           4
	//   51   73:dmul            
	//   52   74:dsub            
	//   53   75:ldc2w           #170 <Double 27D>
	//   54   78:dload           8
	//   55   80:dmul            
	//   56   81:dadd            
	//   57   82:ldc2w           #172 <Double 54D>
	//   58   85:ddiv            
	//   59   86:dstore          14
		d9 = d7 * d7 * d7;
	//   60   88:dload           6
	//   61   90:dload           6
	//   62   92:dmul            
	//   63   93:dload           6
	//   64   95:dmul            
	//   65   96:dstore          10
		d10 = d11 * d11;
	//   66   98:dload           14
	//   67  100:dload           14
	//   68  102:dmul            
	//   69  103:dstore          12
		d8 = -d / 3D;
	//   70  105:dload_2         
	//   71  106:dneg            
	//   72  107:ldc2w           #164 <Double 3D>
	//   73  110:ddiv            
	//   74  111:dstore          8
		if(d10 >= d9) goto _L2; else goto _L1
	//   75  113:dload           12
	//   76  115:dload           10
	//   77  117:dcmpg           
	//   78  118:ifge            221
_L1:
		int i;
		double d1 = Math.acos(d11 / Math.sqrt(d9)) / 3D;
	//   79  121:dload           14
	//   80  123:dload           10
	//   81  125:invokestatic    #179 <Method double Math.sqrt(double)>
	//   82  128:ddiv            
	//   83  129:invokestatic    #182 <Method double Math.acos(double)>
	//   84  132:ldc2w           #164 <Double 3D>
	//   85  135:ddiv            
	//   86  136:dstore_2        
		double d4 = -2D * Math.sqrt(d7);
	//   87  137:ldc2w           #183 <Double -2D>
	//   88  140:dload           6
	//   89  142:invokestatic    #179 <Method double Math.sqrt(double)>
	//   90  145:dmul            
	//   91  146:dstore          4
		i = 0 + 1;
	//   92  148:iconst_0        
	//   93  149:iconst_1        
	//   94  150:iadd            
	//   95  151:istore          16
		ad1[0] = Math.cos(d1) * d4 + d8;
	//   96  153:aload_1         
	//   97  154:iconst_0        
	//   98  155:dload_2         
	//   99  156:invokestatic    #187 <Method double Math.cos(double)>
	//  100  159:dload           4
	//  101  161:dmul            
	//  102  162:dload           8
	//  103  164:dadd            
	//  104  165:dastore         
		int j = i + 1;
	//  105  166:iload           16
	//  106  168:iconst_1        
	//  107  169:iadd            
	//  108  170:istore          17
		ad1[i] = Math.cos(d1 + 2.0943951023931953D) * d4 + d8;
	//  109  172:aload_1         
	//  110  173:iload           16
	//  111  175:dload_2         
	//  112  176:ldc2w           #188 <Double 2.0943951023931953D>
	//  113  179:dadd            
	//  114  180:invokestatic    #187 <Method double Math.cos(double)>
	//  115  183:dload           4
	//  116  185:dmul            
	//  117  186:dload           8
	//  118  188:dadd            
	//  119  189:dastore         
		ad1[j] = Math.cos(d1 - 2.0943951023931953D) * d4 + d8;
	//  120  190:aload_1         
	//  121  191:iload           17
	//  122  193:dload_2         
	//  123  194:ldc2w           #188 <Double 2.0943951023931953D>
	//  124  197:dsub            
	//  125  198:invokestatic    #187 <Method double Math.cos(double)>
	//  126  201:dload           4
	//  127  203:dmul            
	//  128  204:dload           8
	//  129  206:dadd            
	//  130  207:dastore         
		i = j + 1;
	//  131  208:iload           17
	//  132  210:iconst_1        
	//  133  211:iadd            
	//  134  212:istore          16
_L4:
		return fixRoots(ad1, i);
	//  135  214:aload_1         
	//  136  215:iload           16
	//  137  217:invokestatic    #191 <Method int fixRoots(double[], int)>
	//  138  220:ireturn         
_L2:
		double d5 = Math.pow(Math.abs(d11) + Math.sqrt(d10 - d9), 0.33333333333333331D);
	//  139  221:dload           14
	//  140  223:invokestatic    #194 <Method double Math.abs(double)>
	//  141  226:dload           12
	//  142  228:dload           10
	//  143  230:dsub            
	//  144  231:invokestatic    #179 <Method double Math.sqrt(double)>
	//  145  234:dadd            
	//  146  235:ldc2w           #195 <Double 0.33333333333333331D>
	//  147  238:invokestatic    #200 <Method double Math.pow(double, double)>
	//  148  241:dstore          4
		double d2 = d5;
	//  149  243:dload           4
	//  150  245:dstore_2        
		if(d11 > 0.0D)
	//* 151  246:dload           14
	//* 152  248:dconst_0        
	//* 153  249:dcmpl           
	//* 154  250:ifle            257
			d2 = -d5;
	//  155  253:dload           4
	//  156  255:dneg            
	//  157  256:dstore_2        
		if(-1E-10D < d2 && d2 < 1E-10D)
	//* 158  257:ldc2w           #201 <Double -1E-10D>
	//* 159  260:dload_2         
	//* 160  261:dcmpg           
	//* 161  262:ifge            286
	//* 162  265:dload_2         
	//* 163  266:ldc2w           #19  <Double 1E-10D>
	//* 164  269:dcmpg           
	//* 165  270:ifge            286
		{
			ad1[0] = d8;
	//  166  273:aload_1         
	//  167  274:iconst_0        
	//  168  275:dload           8
	//  169  277:dastore         
			i = 0 + 1;
	//  170  278:iconst_0        
	//  171  279:iconst_1        
	//  172  280:iadd            
	//  173  281:istore          16
		} else
	//* 174  283:goto            214
		{
			double d6 = d7 / d2;
	//  175  286:dload           6
	//  176  288:dload_2         
	//  177  289:ddiv            
	//  178  290:dstore          4
			i = 0 + 1;
	//  179  292:iconst_0        
	//  180  293:iconst_1        
	//  181  294:iadd            
	//  182  295:istore          16
			ad1[0] = d2 + d6 + d8;
	//  183  297:aload_1         
	//  184  298:iconst_0        
	//  185  299:dload_2         
	//  186  300:dload           4
	//  187  302:dadd            
	//  188  303:dload           8
	//  189  305:dadd            
	//  190  306:dastore         
			d7 = d10 - d9;
	//  191  307:dload           12
	//  192  309:dload           10
	//  193  311:dsub            
	//  194  312:dstore          6
			if(-1E-10D < d7 && d7 < 1E-10D)
	//* 195  314:ldc2w           #201 <Double -1E-10D>
	//* 196  317:dload           6
	//* 197  319:dcmpg           
	//* 198  320:ifge            361
	//* 199  323:dload           6
	//* 200  325:ldc2w           #19  <Double 1E-10D>
	//* 201  328:dcmpg           
	//* 202  329:ifge            361
			{
				int k = i + 1;
	//  203  332:iload           16
	//  204  334:iconst_1        
	//  205  335:iadd            
	//  206  336:istore          17
				ad1[i] = -(d2 + d6) / 2D + d8;
	//  207  338:aload_1         
	//  208  339:iload           16
	//  209  341:dload_2         
	//  210  342:dload           4
	//  211  344:dadd            
	//  212  345:dneg            
	//  213  346:ldc2w           #168 <Double 2D>
	//  214  349:ddiv            
	//  215  350:dload           8
	//  216  352:dadd            
	//  217  353:dastore         
				i = k;
	//  218  354:iload           17
	//  219  356:istore          16
			}
		}
		if(true) goto _L4; else goto _L3
	//  220  358:goto            214
_L3:
	//* 221  361:goto            214
	}

	public static int solveQuad(double ad[], double ad1[])
	{
		double d;
		double d1;
		double d2;
		d = ad[2];
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:daload          
	//    3    3:dstore_2        
		d1 = ad[1];
	//    4    4:aload_0         
	//    5    5:iconst_1        
	//    6    6:daload          
	//    7    7:dstore          4
		d2 = ad[0];
	//    8    9:aload_0         
	//    9   10:iconst_0        
	//   10   11:daload          
	//   11   12:dstore          6
		if(d != 0.0D) goto _L2; else goto _L1
	//   12   14:dload_2         
	//   13   15:dconst_0        
	//   14   16:dcmpl           
	//   15   17:ifne            50
_L1:
		int i;
		if(d1 == 0.0D)
	//*  16   20:dload           4
	//*  17   22:dconst_0        
	//*  18   23:dcmpl           
	//*  19   24:ifne            29
			return -1;
	//   20   27:iconst_m1       
	//   21   28:ireturn         
		ad1[0] = -d2 / d1;
	//   22   29:aload_1         
	//   23   30:iconst_0        
	//   24   31:dload           6
	//   25   33:dneg            
	//   26   34:dload           4
	//   27   36:ddiv            
	//   28   37:dastore         
		i = 0 + 1;
	//   29   38:iconst_0        
	//   30   39:iconst_1        
	//   31   40:iadd            
	//   32   41:istore          8
_L4:
		return fixRoots(ad1, i);
	//   33   43:aload_1         
	//   34   44:iload           8
	//   35   46:invokestatic    #191 <Method int fixRoots(double[], int)>
	//   36   49:ireturn         
_L2:
		d2 = d1 * d1 - 4D * d * d2;
	//   37   50:dload           4
	//   38   52:dload           4
	//   39   54:dmul            
	//   40   55:ldc2w           #140 <Double 4D>
	//   41   58:dload_2         
	//   42   59:dmul            
	//   43   60:dload           6
	//   44   62:dmul            
	//   45   63:dsub            
	//   46   64:dstore          6
		if(d2 < 0.0D)
	//*  47   66:dload           6
	//*  48   68:dconst_0        
	//*  49   69:dcmpg           
	//*  50   70:ifge            75
			return 0;
	//   51   73:iconst_0        
	//   52   74:ireturn         
		d2 = Math.sqrt(d2);
	//   53   75:dload           6
	//   54   77:invokestatic    #179 <Method double Math.sqrt(double)>
	//   55   80:dstore          6
		i = 0 + 1;
	//   56   82:iconst_0        
	//   57   83:iconst_1        
	//   58   84:iadd            
	//   59   85:istore          8
		ad1[0] = (-d1 + d2) / (2D * d);
	//   60   87:aload_1         
	//   61   88:iconst_0        
	//   62   89:dload           4
	//   63   91:dneg            
	//   64   92:dload           6
	//   65   94:dadd            
	//   66   95:ldc2w           #168 <Double 2D>
	//   67   98:dload_2         
	//   68   99:dmul            
	//   69  100:ddiv            
	//   70  101:dastore         
		if(d2 != 0.0D)
	//*  71  102:dload           6
	//*  72  104:dconst_0        
	//*  73  105:dcmpl           
	//*  74  106:ifeq            138
		{
			int j = i + 1;
	//   75  109:iload           8
	//   76  111:iconst_1        
	//   77  112:iadd            
	//   78  113:istore          9
			ad1[i] = (-d1 - d2) / (2D * d);
	//   79  115:aload_1         
	//   80  116:iload           8
	//   81  118:dload           4
	//   82  120:dneg            
	//   83  121:dload           6
	//   84  123:dsub            
	//   85  124:ldc2w           #168 <Double 2D>
	//   86  127:dload_2         
	//   87  128:dmul            
	//   88  129:ddiv            
	//   89  130:dastore         
			i = j;
	//   90  131:iload           9
	//   91  133:istore          8
		}
		if(true) goto _L4; else goto _L3
	//   92  135:goto            43
_L3:
	//*  93  138:goto            43
	}

	static void sortBound(double ad[], int i)
	{
		for(int j = 0; j < i - 4; j += 4)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:iload_1         
	//*   4    6:iconst_4        
	//*   5    7:isub            
	//*   6    8:icmpge          172
		{
			int l = j;
	//    7   11:iload           4
	//    8   13:istore          6
			for(int k = j + 4; k < i;)
	//*   9   15:iload           4
	//*  10   17:iconst_4        
	//*  11   18:iadd            
	//*  12   19:istore          5
	//*  13   21:iload           5
	//*  14   23:iload_1         
	//*  15   24:icmpge          60
			{
				int i1 = l;
	//   16   27:iload           6
	//   17   29:istore          7
				if(ad[l] > ad[k])
	//*  18   31:aload_0         
	//*  19   32:iload           6
	//*  20   34:daload          
	//*  21   35:aload_0         
	//*  22   36:iload           5
	//*  23   38:daload          
	//*  24   39:dcmpl           
	//*  25   40:ifle            47
					i1 = k;
	//   26   43:iload           5
	//   27   45:istore          7
				k += 4;
	//   28   47:iload           5
	//   29   49:iconst_4        
	//   30   50:iadd            
	//   31   51:istore          5
				l = i1;
	//   32   53:iload           7
	//   33   55:istore          6
			}

	//*  34   57:goto            21
			if(l != j)
	//*  35   60:iload           6
	//*  36   62:iload           4
	//*  37   64:icmpeq          163
			{
				double d = ad[j];
	//   38   67:aload_0         
	//   39   68:iload           4
	//   40   70:daload          
	//   41   71:dstore_2        
				ad[j] = ad[l];
	//   42   72:aload_0         
	//   43   73:iload           4
	//   44   75:aload_0         
	//   45   76:iload           6
	//   46   78:daload          
	//   47   79:dastore         
				ad[l] = d;
	//   48   80:aload_0         
	//   49   81:iload           6
	//   50   83:dload_2         
	//   51   84:dastore         
				d = ad[j + 1];
	//   52   85:aload_0         
	//   53   86:iload           4
	//   54   88:iconst_1        
	//   55   89:iadd            
	//   56   90:daload          
	//   57   91:dstore_2        
				ad[j + 1] = ad[l + 1];
	//   58   92:aload_0         
	//   59   93:iload           4
	//   60   95:iconst_1        
	//   61   96:iadd            
	//   62   97:aload_0         
	//   63   98:iload           6
	//   64  100:iconst_1        
	//   65  101:iadd            
	//   66  102:daload          
	//   67  103:dastore         
				ad[l + 1] = d;
	//   68  104:aload_0         
	//   69  105:iload           6
	//   70  107:iconst_1        
	//   71  108:iadd            
	//   72  109:dload_2         
	//   73  110:dastore         
				d = ad[j + 2];
	//   74  111:aload_0         
	//   75  112:iload           4
	//   76  114:iconst_2        
	//   77  115:iadd            
	//   78  116:daload          
	//   79  117:dstore_2        
				ad[j + 2] = ad[l + 2];
	//   80  118:aload_0         
	//   81  119:iload           4
	//   82  121:iconst_2        
	//   83  122:iadd            
	//   84  123:aload_0         
	//   85  124:iload           6
	//   86  126:iconst_2        
	//   87  127:iadd            
	//   88  128:daload          
	//   89  129:dastore         
				ad[l + 2] = d;
	//   90  130:aload_0         
	//   91  131:iload           6
	//   92  133:iconst_2        
	//   93  134:iadd            
	//   94  135:dload_2         
	//   95  136:dastore         
				d = ad[j + 3];
	//   96  137:aload_0         
	//   97  138:iload           4
	//   98  140:iconst_3        
	//   99  141:iadd            
	//  100  142:daload          
	//  101  143:dstore_2        
				ad[j + 3] = ad[l + 3];
	//  102  144:aload_0         
	//  103  145:iload           4
	//  104  147:iconst_3        
	//  105  148:iadd            
	//  106  149:aload_0         
	//  107  150:iload           6
	//  108  152:iconst_3        
	//  109  153:iadd            
	//  110  154:daload          
	//  111  155:dastore         
				ad[l + 3] = d;
	//  112  156:aload_0         
	//  113  157:iload           6
	//  114  159:iconst_3        
	//  115  160:iadd            
	//  116  161:dload_2         
	//  117  162:dastore         
			}
		}

	//  118  163:iload           4
	//  119  165:iconst_4        
	//  120  166:iadd            
	//  121  167:istore          4
	//* 122  169:goto            3
	//  123  172:return          
	}

	public static final int CROSSING = 255;
	static final double DELTA = 1.0000000000000001E-05D;
	static final double ROOT_DELTA = 1E-10D;
	static final int UNKNOWN = 254;
}
