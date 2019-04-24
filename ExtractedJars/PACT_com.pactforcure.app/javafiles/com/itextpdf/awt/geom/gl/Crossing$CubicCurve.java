// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom.gl;


// Referenced classes of package com.itextpdf.awt.geom.gl:
//			Crossing

public static class Crossing$CubicCurve
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

	public Crossing$CubicCurve(double d, double d1, double d2, double d3, double d4, double d5, double d6, 
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
