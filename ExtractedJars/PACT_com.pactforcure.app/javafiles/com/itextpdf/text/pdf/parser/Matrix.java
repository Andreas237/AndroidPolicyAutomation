// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import java.util.Arrays;

public class Matrix
{

	public Matrix()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          9
	//    4    7:newarray        float[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:fconst_1        
	//    8   12:fastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:fconst_0        
	//   12   16:fastore         
	//   13   17:dup             
	//   14   18:iconst_2        
	//   15   19:fconst_0        
	//   16   20:fastore         
	//   17   21:dup             
	//   18   22:iconst_3        
	//   19   23:fconst_0        
	//   20   24:fastore         
	//   21   25:dup             
	//   22   26:iconst_4        
	//   23   27:fconst_1        
	//   24   28:fastore         
	//   25   29:dup             
	//   26   30:iconst_5        
	//   27   31:fconst_0        
	//   28   32:fastore         
	//   29   33:dup             
	//   30   34:bipush          6
	//   31   36:fconst_0        
	//   32   37:fastore         
	//   33   38:dup             
	//   34   39:bipush          7
	//   35   41:fconst_0        
	//   36   42:fastore         
	//   37   43:dup             
	//   38   44:bipush          8
	//   39   46:fconst_1        
	//   40   47:fastore         
	//   41   48:putfield        #31  <Field float[] vals>
	//   42   51:return          
	}

	public Matrix(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          9
	//    4    7:newarray        float[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:fconst_1        
	//    8   12:fastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:fconst_0        
	//   12   16:fastore         
	//   13   17:dup             
	//   14   18:iconst_2        
	//   15   19:fconst_0        
	//   16   20:fastore         
	//   17   21:dup             
	//   18   22:iconst_3        
	//   19   23:fconst_0        
	//   20   24:fastore         
	//   21   25:dup             
	//   22   26:iconst_4        
	//   23   27:fconst_1        
	//   24   28:fastore         
	//   25   29:dup             
	//   26   30:iconst_5        
	//   27   31:fconst_0        
	//   28   32:fastore         
	//   29   33:dup             
	//   30   34:bipush          6
	//   31   36:fconst_0        
	//   32   37:fastore         
	//   33   38:dup             
	//   34   39:bipush          7
	//   35   41:fconst_0        
	//   36   42:fastore         
	//   37   43:dup             
	//   38   44:bipush          8
	//   39   46:fconst_1        
	//   40   47:fastore         
	//   41   48:putfield        #31  <Field float[] vals>
		vals[6] = f;
	//   42   51:aload_0         
	//   43   52:getfield        #31  <Field float[] vals>
	//   44   55:bipush          6
	//   45   57:fload_1         
	//   46   58:fastore         
		vals[7] = f1;
	//   47   59:aload_0         
	//   48   60:getfield        #31  <Field float[] vals>
	//   49   63:bipush          7
	//   50   65:fload_2         
	//   51   66:fastore         
	//   52   67:return          
	}

	public Matrix(float f, float f1, float f2, float f3, float f4, float f5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          9
	//    4    7:newarray        float[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:fconst_1        
	//    8   12:fastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:fconst_0        
	//   12   16:fastore         
	//   13   17:dup             
	//   14   18:iconst_2        
	//   15   19:fconst_0        
	//   16   20:fastore         
	//   17   21:dup             
	//   18   22:iconst_3        
	//   19   23:fconst_0        
	//   20   24:fastore         
	//   21   25:dup             
	//   22   26:iconst_4        
	//   23   27:fconst_1        
	//   24   28:fastore         
	//   25   29:dup             
	//   26   30:iconst_5        
	//   27   31:fconst_0        
	//   28   32:fastore         
	//   29   33:dup             
	//   30   34:bipush          6
	//   31   36:fconst_0        
	//   32   37:fastore         
	//   33   38:dup             
	//   34   39:bipush          7
	//   35   41:fconst_0        
	//   36   42:fastore         
	//   37   43:dup             
	//   38   44:bipush          8
	//   39   46:fconst_1        
	//   40   47:fastore         
	//   41   48:putfield        #31  <Field float[] vals>
		vals[0] = f;
	//   42   51:aload_0         
	//   43   52:getfield        #31  <Field float[] vals>
	//   44   55:iconst_0        
	//   45   56:fload_1         
	//   46   57:fastore         
		vals[1] = f1;
	//   47   58:aload_0         
	//   48   59:getfield        #31  <Field float[] vals>
	//   49   62:iconst_1        
	//   50   63:fload_2         
	//   51   64:fastore         
		vals[2] = 0.0F;
	//   52   65:aload_0         
	//   53   66:getfield        #31  <Field float[] vals>
	//   54   69:iconst_2        
	//   55   70:fconst_0        
	//   56   71:fastore         
		vals[3] = f2;
	//   57   72:aload_0         
	//   58   73:getfield        #31  <Field float[] vals>
	//   59   76:iconst_3        
	//   60   77:fload_3         
	//   61   78:fastore         
		vals[4] = f3;
	//   62   79:aload_0         
	//   63   80:getfield        #31  <Field float[] vals>
	//   64   83:iconst_4        
	//   65   84:fload           4
	//   66   86:fastore         
		vals[5] = 0.0F;
	//   67   87:aload_0         
	//   68   88:getfield        #31  <Field float[] vals>
	//   69   91:iconst_5        
	//   70   92:fconst_0        
	//   71   93:fastore         
		vals[6] = f4;
	//   72   94:aload_0         
	//   73   95:getfield        #31  <Field float[] vals>
	//   74   98:bipush          6
	//   75  100:fload           5
	//   76  102:fastore         
		vals[7] = f5;
	//   77  103:aload_0         
	//   78  104:getfield        #31  <Field float[] vals>
	//   79  107:bipush          7
	//   80  109:fload           6
	//   81  111:fastore         
		vals[8] = 1.0F;
	//   82  112:aload_0         
	//   83  113:getfield        #31  <Field float[] vals>
	//   84  116:bipush          8
	//   85  118:fconst_1        
	//   86  119:fastore         
	//   87  120:return          
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Matrix))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Matrix>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return Arrays.equals(vals, ((Matrix)obj).vals);
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field float[] vals>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Matrix>
	//    9   17:getfield        #31  <Field float[] vals>
	//   10   20:invokestatic    #41  <Method boolean Arrays.equals(float[], float[])>
	//   11   23:ireturn         
	}

	public float get(int i)
	{
		return vals[i];
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float[] vals>
	//    2    4:iload_1         
	//    3    5:faload          
	//    4    6:freturn         
	}

	public float getDeterminant()
	{
		return (vals[0] * vals[4] * vals[8] + vals[1] * vals[5] * vals[6] + vals[2] * vals[3] * vals[7]) - vals[0] * vals[5] * vals[7] - vals[1] * vals[3] * vals[8] - vals[2] * vals[4] * vals[6];
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float[] vals>
	//    2    4:iconst_0        
	//    3    5:faload          
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field float[] vals>
	//    6   10:iconst_4        
	//    7   11:faload          
	//    8   12:fmul            
	//    9   13:aload_0         
	//   10   14:getfield        #31  <Field float[] vals>
	//   11   17:bipush          8
	//   12   19:faload          
	//   13   20:fmul            
	//   14   21:aload_0         
	//   15   22:getfield        #31  <Field float[] vals>
	//   16   25:iconst_1        
	//   17   26:faload          
	//   18   27:aload_0         
	//   19   28:getfield        #31  <Field float[] vals>
	//   20   31:iconst_5        
	//   21   32:faload          
	//   22   33:fmul            
	//   23   34:aload_0         
	//   24   35:getfield        #31  <Field float[] vals>
	//   25   38:bipush          6
	//   26   40:faload          
	//   27   41:fmul            
	//   28   42:fadd            
	//   29   43:aload_0         
	//   30   44:getfield        #31  <Field float[] vals>
	//   31   47:iconst_2        
	//   32   48:faload          
	//   33   49:aload_0         
	//   34   50:getfield        #31  <Field float[] vals>
	//   35   53:iconst_3        
	//   36   54:faload          
	//   37   55:fmul            
	//   38   56:aload_0         
	//   39   57:getfield        #31  <Field float[] vals>
	//   40   60:bipush          7
	//   41   62:faload          
	//   42   63:fmul            
	//   43   64:fadd            
	//   44   65:aload_0         
	//   45   66:getfield        #31  <Field float[] vals>
	//   46   69:iconst_0        
	//   47   70:faload          
	//   48   71:aload_0         
	//   49   72:getfield        #31  <Field float[] vals>
	//   50   75:iconst_5        
	//   51   76:faload          
	//   52   77:fmul            
	//   53   78:aload_0         
	//   54   79:getfield        #31  <Field float[] vals>
	//   55   82:bipush          7
	//   56   84:faload          
	//   57   85:fmul            
	//   58   86:fsub            
	//   59   87:aload_0         
	//   60   88:getfield        #31  <Field float[] vals>
	//   61   91:iconst_1        
	//   62   92:faload          
	//   63   93:aload_0         
	//   64   94:getfield        #31  <Field float[] vals>
	//   65   97:iconst_3        
	//   66   98:faload          
	//   67   99:fmul            
	//   68  100:aload_0         
	//   69  101:getfield        #31  <Field float[] vals>
	//   70  104:bipush          8
	//   71  106:faload          
	//   72  107:fmul            
	//   73  108:fsub            
	//   74  109:aload_0         
	//   75  110:getfield        #31  <Field float[] vals>
	//   76  113:iconst_2        
	//   77  114:faload          
	//   78  115:aload_0         
	//   79  116:getfield        #31  <Field float[] vals>
	//   80  119:iconst_4        
	//   81  120:faload          
	//   82  121:fmul            
	//   83  122:aload_0         
	//   84  123:getfield        #31  <Field float[] vals>
	//   85  126:bipush          6
	//   86  128:faload          
	//   87  129:fmul            
	//   88  130:fsub            
	//   89  131:freturn         
	}

	public int hashCode()
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		for(int i = 0; i < vals.length; i++)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #31  <Field float[] vals>
	//*   7    9:arraylength     
	//*   8   10:icmpge          35
			j = j * 31 + Float.floatToIntBits(vals[i]);
	//    9   13:iload_2         
	//   10   14:bipush          31
	//   11   16:imul            
	//   12   17:aload_0         
	//   13   18:getfield        #31  <Field float[] vals>
	//   14   21:iload_1         
	//   15   22:faload          
	//   16   23:invokestatic    #53  <Method int Float.floatToIntBits(float)>
	//   17   26:iadd            
	//   18   27:istore_2        

	//   19   28:iload_1         
	//   20   29:iconst_1        
	//   21   30:iadd            
	//   22   31:istore_1        
	//*  23   32:goto            4
		return j;
	//   24   35:iload_2         
	//   25   36:ireturn         
	}

	public Matrix multiply(Matrix matrix)
	{
		Matrix matrix1 = new Matrix();
	//    0    0:new             #2   <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void Matrix()>
	//    3    7:astore_2        
		float af[] = vals;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field float[] vals>
	//    6   12:astore_3        
		matrix = ((Matrix) (matrix.vals));
	//    7   13:aload_1         
	//    8   14:getfield        #31  <Field float[] vals>
	//    9   17:astore_1        
		float af1[] = matrix1.vals;
	//   10   18:aload_2         
	//   11   19:getfield        #31  <Field float[] vals>
	//   12   22:astore          4
		af1[0] = af[0] * matrix[0] + af[1] * matrix[3] + af[2] * matrix[6];
	//   13   24:aload           4
	//   14   26:iconst_0        
	//   15   27:aload_3         
	//   16   28:iconst_0        
	//   17   29:faload          
	//   18   30:aload_1         
	//   19   31:iconst_0        
	//   20   32:faload          
	//   21   33:fmul            
	//   22   34:aload_3         
	//   23   35:iconst_1        
	//   24   36:faload          
	//   25   37:aload_1         
	//   26   38:iconst_3        
	//   27   39:faload          
	//   28   40:fmul            
	//   29   41:fadd            
	//   30   42:aload_3         
	//   31   43:iconst_2        
	//   32   44:faload          
	//   33   45:aload_1         
	//   34   46:bipush          6
	//   35   48:faload          
	//   36   49:fmul            
	//   37   50:fadd            
	//   38   51:fastore         
		af1[1] = af[0] * matrix[1] + af[1] * matrix[4] + af[2] * matrix[7];
	//   39   52:aload           4
	//   40   54:iconst_1        
	//   41   55:aload_3         
	//   42   56:iconst_0        
	//   43   57:faload          
	//   44   58:aload_1         
	//   45   59:iconst_1        
	//   46   60:faload          
	//   47   61:fmul            
	//   48   62:aload_3         
	//   49   63:iconst_1        
	//   50   64:faload          
	//   51   65:aload_1         
	//   52   66:iconst_4        
	//   53   67:faload          
	//   54   68:fmul            
	//   55   69:fadd            
	//   56   70:aload_3         
	//   57   71:iconst_2        
	//   58   72:faload          
	//   59   73:aload_1         
	//   60   74:bipush          7
	//   61   76:faload          
	//   62   77:fmul            
	//   63   78:fadd            
	//   64   79:fastore         
		af1[2] = af[0] * matrix[2] + af[1] * matrix[5] + af[2] * matrix[8];
	//   65   80:aload           4
	//   66   82:iconst_2        
	//   67   83:aload_3         
	//   68   84:iconst_0        
	//   69   85:faload          
	//   70   86:aload_1         
	//   71   87:iconst_2        
	//   72   88:faload          
	//   73   89:fmul            
	//   74   90:aload_3         
	//   75   91:iconst_1        
	//   76   92:faload          
	//   77   93:aload_1         
	//   78   94:iconst_5        
	//   79   95:faload          
	//   80   96:fmul            
	//   81   97:fadd            
	//   82   98:aload_3         
	//   83   99:iconst_2        
	//   84  100:faload          
	//   85  101:aload_1         
	//   86  102:bipush          8
	//   87  104:faload          
	//   88  105:fmul            
	//   89  106:fadd            
	//   90  107:fastore         
		af1[3] = af[3] * matrix[0] + af[4] * matrix[3] + af[5] * matrix[6];
	//   91  108:aload           4
	//   92  110:iconst_3        
	//   93  111:aload_3         
	//   94  112:iconst_3        
	//   95  113:faload          
	//   96  114:aload_1         
	//   97  115:iconst_0        
	//   98  116:faload          
	//   99  117:fmul            
	//  100  118:aload_3         
	//  101  119:iconst_4        
	//  102  120:faload          
	//  103  121:aload_1         
	//  104  122:iconst_3        
	//  105  123:faload          
	//  106  124:fmul            
	//  107  125:fadd            
	//  108  126:aload_3         
	//  109  127:iconst_5        
	//  110  128:faload          
	//  111  129:aload_1         
	//  112  130:bipush          6
	//  113  132:faload          
	//  114  133:fmul            
	//  115  134:fadd            
	//  116  135:fastore         
		af1[4] = af[3] * matrix[1] + af[4] * matrix[4] + af[5] * matrix[7];
	//  117  136:aload           4
	//  118  138:iconst_4        
	//  119  139:aload_3         
	//  120  140:iconst_3        
	//  121  141:faload          
	//  122  142:aload_1         
	//  123  143:iconst_1        
	//  124  144:faload          
	//  125  145:fmul            
	//  126  146:aload_3         
	//  127  147:iconst_4        
	//  128  148:faload          
	//  129  149:aload_1         
	//  130  150:iconst_4        
	//  131  151:faload          
	//  132  152:fmul            
	//  133  153:fadd            
	//  134  154:aload_3         
	//  135  155:iconst_5        
	//  136  156:faload          
	//  137  157:aload_1         
	//  138  158:bipush          7
	//  139  160:faload          
	//  140  161:fmul            
	//  141  162:fadd            
	//  142  163:fastore         
		af1[5] = af[3] * matrix[2] + af[4] * matrix[5] + af[5] * matrix[8];
	//  143  164:aload           4
	//  144  166:iconst_5        
	//  145  167:aload_3         
	//  146  168:iconst_3        
	//  147  169:faload          
	//  148  170:aload_1         
	//  149  171:iconst_2        
	//  150  172:faload          
	//  151  173:fmul            
	//  152  174:aload_3         
	//  153  175:iconst_4        
	//  154  176:faload          
	//  155  177:aload_1         
	//  156  178:iconst_5        
	//  157  179:faload          
	//  158  180:fmul            
	//  159  181:fadd            
	//  160  182:aload_3         
	//  161  183:iconst_5        
	//  162  184:faload          
	//  163  185:aload_1         
	//  164  186:bipush          8
	//  165  188:faload          
	//  166  189:fmul            
	//  167  190:fadd            
	//  168  191:fastore         
		af1[6] = af[6] * matrix[0] + af[7] * matrix[3] + af[8] * matrix[6];
	//  169  192:aload           4
	//  170  194:bipush          6
	//  171  196:aload_3         
	//  172  197:bipush          6
	//  173  199:faload          
	//  174  200:aload_1         
	//  175  201:iconst_0        
	//  176  202:faload          
	//  177  203:fmul            
	//  178  204:aload_3         
	//  179  205:bipush          7
	//  180  207:faload          
	//  181  208:aload_1         
	//  182  209:iconst_3        
	//  183  210:faload          
	//  184  211:fmul            
	//  185  212:fadd            
	//  186  213:aload_3         
	//  187  214:bipush          8
	//  188  216:faload          
	//  189  217:aload_1         
	//  190  218:bipush          6
	//  191  220:faload          
	//  192  221:fmul            
	//  193  222:fadd            
	//  194  223:fastore         
		af1[7] = af[6] * matrix[1] + af[7] * matrix[4] + af[8] * matrix[7];
	//  195  224:aload           4
	//  196  226:bipush          7
	//  197  228:aload_3         
	//  198  229:bipush          6
	//  199  231:faload          
	//  200  232:aload_1         
	//  201  233:iconst_1        
	//  202  234:faload          
	//  203  235:fmul            
	//  204  236:aload_3         
	//  205  237:bipush          7
	//  206  239:faload          
	//  207  240:aload_1         
	//  208  241:iconst_4        
	//  209  242:faload          
	//  210  243:fmul            
	//  211  244:fadd            
	//  212  245:aload_3         
	//  213  246:bipush          8
	//  214  248:faload          
	//  215  249:aload_1         
	//  216  250:bipush          7
	//  217  252:faload          
	//  218  253:fmul            
	//  219  254:fadd            
	//  220  255:fastore         
		af1[8] = af[6] * matrix[2] + af[7] * matrix[5] + af[8] * matrix[8];
	//  221  256:aload           4
	//  222  258:bipush          8
	//  223  260:aload_3         
	//  224  261:bipush          6
	//  225  263:faload          
	//  226  264:aload_1         
	//  227  265:iconst_2        
	//  228  266:faload          
	//  229  267:fmul            
	//  230  268:aload_3         
	//  231  269:bipush          7
	//  232  271:faload          
	//  233  272:aload_1         
	//  234  273:iconst_5        
	//  235  274:faload          
	//  236  275:fmul            
	//  237  276:fadd            
	//  238  277:aload_3         
	//  239  278:bipush          8
	//  240  280:faload          
	//  241  281:aload_1         
	//  242  282:bipush          8
	//  243  284:faload          
	//  244  285:fmul            
	//  245  286:fadd            
	//  246  287:fastore         
		return matrix1;
	//  247  288:aload_2         
	//  248  289:areturn         
	}

	public Matrix subtract(Matrix matrix)
	{
		Matrix matrix1 = new Matrix();
	//    0    0:new             #2   <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void Matrix()>
	//    3    7:astore_2        
		float af[] = vals;
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field float[] vals>
	//    6   12:astore_3        
		matrix = ((Matrix) (matrix.vals));
	//    7   13:aload_1         
	//    8   14:getfield        #31  <Field float[] vals>
	//    9   17:astore_1        
		float af1[] = matrix1.vals;
	//   10   18:aload_2         
	//   11   19:getfield        #31  <Field float[] vals>
	//   12   22:astore          4
		af1[0] = af[0] - matrix[0];
	//   13   24:aload           4
	//   14   26:iconst_0        
	//   15   27:aload_3         
	//   16   28:iconst_0        
	//   17   29:faload          
	//   18   30:aload_1         
	//   19   31:iconst_0        
	//   20   32:faload          
	//   21   33:fsub            
	//   22   34:fastore         
		af1[1] = af[1] - matrix[1];
	//   23   35:aload           4
	//   24   37:iconst_1        
	//   25   38:aload_3         
	//   26   39:iconst_1        
	//   27   40:faload          
	//   28   41:aload_1         
	//   29   42:iconst_1        
	//   30   43:faload          
	//   31   44:fsub            
	//   32   45:fastore         
		af1[2] = af[2] - matrix[2];
	//   33   46:aload           4
	//   34   48:iconst_2        
	//   35   49:aload_3         
	//   36   50:iconst_2        
	//   37   51:faload          
	//   38   52:aload_1         
	//   39   53:iconst_2        
	//   40   54:faload          
	//   41   55:fsub            
	//   42   56:fastore         
		af1[3] = af[3] - matrix[3];
	//   43   57:aload           4
	//   44   59:iconst_3        
	//   45   60:aload_3         
	//   46   61:iconst_3        
	//   47   62:faload          
	//   48   63:aload_1         
	//   49   64:iconst_3        
	//   50   65:faload          
	//   51   66:fsub            
	//   52   67:fastore         
		af1[4] = af[4] - matrix[4];
	//   53   68:aload           4
	//   54   70:iconst_4        
	//   55   71:aload_3         
	//   56   72:iconst_4        
	//   57   73:faload          
	//   58   74:aload_1         
	//   59   75:iconst_4        
	//   60   76:faload          
	//   61   77:fsub            
	//   62   78:fastore         
		af1[5] = af[5] - matrix[5];
	//   63   79:aload           4
	//   64   81:iconst_5        
	//   65   82:aload_3         
	//   66   83:iconst_5        
	//   67   84:faload          
	//   68   85:aload_1         
	//   69   86:iconst_5        
	//   70   87:faload          
	//   71   88:fsub            
	//   72   89:fastore         
		af1[6] = af[6] - matrix[6];
	//   73   90:aload           4
	//   74   92:bipush          6
	//   75   94:aload_3         
	//   76   95:bipush          6
	//   77   97:faload          
	//   78   98:aload_1         
	//   79   99:bipush          6
	//   80  101:faload          
	//   81  102:fsub            
	//   82  103:fastore         
		af1[7] = af[7] - matrix[7];
	//   83  104:aload           4
	//   84  106:bipush          7
	//   85  108:aload_3         
	//   86  109:bipush          7
	//   87  111:faload          
	//   88  112:aload_1         
	//   89  113:bipush          7
	//   90  115:faload          
	//   91  116:fsub            
	//   92  117:fastore         
		af1[8] = af[8] - matrix[8];
	//   93  118:aload           4
	//   94  120:bipush          8
	//   95  122:aload_3         
	//   96  123:bipush          8
	//   97  125:faload          
	//   98  126:aload_1         
	//   99  127:bipush          8
	//  100  129:faload          
	//  101  130:fsub            
	//  102  131:fastore         
		return matrix1;
	//  103  132:aload_2         
	//  104  133:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(vals[0]).append("\t").append(vals[1]).append("\t").append(vals[2]).append("\n").append(vals[3]).append("\t").append(vals[4]).append("\t").append(vals[2]).append("\n").append(vals[6]).append("\t").append(vals[7]).append("\t").append(vals[8]).toString();
	//    0    0:new             #61  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field float[] vals>
	//    5   11:iconst_0        
	//    6   12:faload          
	//    7   13:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//    8   16:ldc1            #68  <String "\t">
	//    9   18:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:aload_0         
	//   11   22:getfield        #31  <Field float[] vals>
	//   12   25:iconst_1        
	//   13   26:faload          
	//   14   27:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//   15   30:ldc1            #68  <String "\t">
	//   16   32:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:aload_0         
	//   18   36:getfield        #31  <Field float[] vals>
	//   19   39:iconst_2        
	//   20   40:faload          
	//   21   41:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//   22   44:ldc1            #73  <String "\n">
	//   23   46:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:aload_0         
	//   25   50:getfield        #31  <Field float[] vals>
	//   26   53:iconst_3        
	//   27   54:faload          
	//   28   55:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//   29   58:ldc1            #68  <String "\t">
	//   30   60:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:aload_0         
	//   32   64:getfield        #31  <Field float[] vals>
	//   33   67:iconst_4        
	//   34   68:faload          
	//   35   69:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//   36   72:ldc1            #68  <String "\t">
	//   37   74:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   38   77:aload_0         
	//   39   78:getfield        #31  <Field float[] vals>
	//   40   81:iconst_2        
	//   41   82:faload          
	//   42   83:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//   43   86:ldc1            #73  <String "\n">
	//   44   88:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   45   91:aload_0         
	//   46   92:getfield        #31  <Field float[] vals>
	//   47   95:bipush          6
	//   48   97:faload          
	//   49   98:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//   50  101:ldc1            #68  <String "\t">
	//   51  103:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   52  106:aload_0         
	//   53  107:getfield        #31  <Field float[] vals>
	//   54  110:bipush          7
	//   55  112:faload          
	//   56  113:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//   57  116:ldc1            #68  <String "\t">
	//   58  118:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   59  121:aload_0         
	//   60  122:getfield        #31  <Field float[] vals>
	//   61  125:bipush          8
	//   62  127:faload          
	//   63  128:invokevirtual   #66  <Method StringBuilder StringBuilder.append(float)>
	//   64  131:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   65  134:areturn         
	}

	public static final int I11 = 0;
	public static final int I12 = 1;
	public static final int I13 = 2;
	public static final int I21 = 3;
	public static final int I22 = 4;
	public static final int I23 = 5;
	public static final int I31 = 6;
	public static final int I32 = 7;
	public static final int I33 = 8;
	private final float vals[] = {
		1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F
	};
}
