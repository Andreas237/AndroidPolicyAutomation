// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom.gl;


// Referenced classes of package com.itextpdf.awt.geom.gl:
//			Crossing

public static class Crossing$QuadCurve
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

	public Crossing$QuadCurve(double d, double d1, double d2, double d3, double d4, double d5)
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
