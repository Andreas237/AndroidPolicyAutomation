// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;


// Referenced classes of package android.support.constraint.solver:
//			ArrayLinkedVariables, LinearSystem, SolverVariable, Cache

public class ArrayRow
	implements LinearSystem.Row
{

	public ArrayRow(Cache cache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		variable = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field SolverVariable variable>
		constantValue = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #24  <Field float constantValue>
		used = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field boolean used>
		isSimpleDefinition = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #28  <Field boolean isSimpleDefinition>
		variables = new ArrayLinkedVariables(this, cache);
	//   14   24:aload_0         
	//   15   25:new             #30  <Class ArrayLinkedVariables>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:invokespecial   #33  <Method void ArrayLinkedVariables(ArrayRow, Cache)>
	//   20   34:putfield        #35  <Field ArrayLinkedVariables variables>
	//   21   37:return          
	}

	public ArrayRow addError(LinearSystem linearsystem, int i)
	{
		variables.put(linearsystem.createErrorVariable(i, "ep"), 1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:ldc1            #40  <String "ep">
	//    5    8:invokevirtual   #46  <Method SolverVariable LinearSystem.createErrorVariable(int, String)>
	//    6   11:fconst_1        
	//    7   12:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		variables.put(linearsystem.createErrorVariable(i, "em"), -1F);
	//    8   15:aload_0         
	//    9   16:getfield        #35  <Field ArrayLinkedVariables variables>
	//   10   19:aload_1         
	//   11   20:iload_2         
	//   12   21:ldc1            #52  <String "em">
	//   13   23:invokevirtual   #46  <Method SolverVariable LinearSystem.createErrorVariable(int, String)>
	//   14   26:ldc1            #53  <Float -1F>
	//   15   28:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		return this;
	//   16   31:aload_0         
	//   17   32:areturn         
	}

	public void addError(SolverVariable solvervariable)
	{
		int i = solvervariable.strength;
	//    0    0:aload_1         
	//    1    1:getfield        #60  <Field int SolverVariable.strength>
	//    2    4:istore_3        
		float f = 1.0F;
	//    3    5:fconst_1        
	//    4    6:fstore_2        
		if(i != 1)
	//*   5    7:iload_3         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            68
			if(solvervariable.strength == 2)
	//*   9   15:aload_1         
	//*  10   16:getfield        #60  <Field int SolverVariable.strength>
	//*  11   19:iconst_2        
	//*  12   20:icmpne          29
				f = 1000F;
	//   13   23:ldc1            #61  <Float 1000F>
	//   14   25:fstore_2        
			else
	//*  15   26:goto            68
			if(solvervariable.strength == 3)
	//*  16   29:aload_1         
	//*  17   30:getfield        #60  <Field int SolverVariable.strength>
	//*  18   33:iconst_3        
	//*  19   34:icmpne          43
				f = 1000000F;
	//   20   37:ldc1            #62  <Float 1000000F>
	//   21   39:fstore_2        
			else
	//*  22   40:goto            68
			if(solvervariable.strength == 4)
	//*  23   43:aload_1         
	//*  24   44:getfield        #60  <Field int SolverVariable.strength>
	//*  25   47:iconst_4        
	//*  26   48:icmpne          57
				f = 1E+09F;
	//   27   51:ldc1            #63  <Float 1E+09F>
	//   28   53:fstore_2        
			else
	//*  29   54:goto            68
			if(solvervariable.strength == 5)
	//*  30   57:aload_1         
	//*  31   58:getfield        #60  <Field int SolverVariable.strength>
	//*  32   61:iconst_5        
	//*  33   62:icmpne          68
				f = 1E+12F;
	//   34   65:ldc1            #64  <Float 1E+12F>
	//   35   67:fstore_2        
		variables.put(solvervariable, f);
	//   36   68:aload_0         
	//   37   69:getfield        #35  <Field ArrayLinkedVariables variables>
	//   38   72:aload_1         
	//   39   73:fload_2         
	//   40   74:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
	//   41   77:return          
	}

	ArrayRow addSingleError(SolverVariable solvervariable, int i)
	{
		variables.put(solvervariable, i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:i2f             
	//    5    7:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	boolean chooseSubject(LinearSystem linearsystem)
	{
		linearsystem = ((LinearSystem) (variables.chooseSubject(linearsystem)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #71  <Method SolverVariable ArrayLinkedVariables.chooseSubject(LinearSystem)>
	//    4    8:astore_1        
		boolean flag;
		if(linearsystem == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       18
		{
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		} else
	//*   9   15:goto            25
		{
			pivot(((SolverVariable) (linearsystem)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #74  <Method void pivot(SolverVariable)>
			flag = false;
	//   13   23:iconst_0        
	//   14   24:istore_2        
		}
		if(variables.currentSize == 0)
	//*  15   25:aload_0         
	//*  16   26:getfield        #35  <Field ArrayLinkedVariables variables>
	//*  17   29:getfield        #77  <Field int ArrayLinkedVariables.currentSize>
	//*  18   32:ifne            40
			isSimpleDefinition = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #28  <Field boolean isSimpleDefinition>
		return flag;
	//   22   40:iload_2         
	//   23   41:ireturn         
	}

	public void clear()
	{
		variables.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:invokevirtual   #80  <Method void ArrayLinkedVariables.clear()>
		variable = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #22  <Field SolverVariable variable>
		constantValue = 0.0F;
	//    6   12:aload_0         
	//    7   13:fconst_0        
	//    8   14:putfield        #24  <Field float constantValue>
	//    9   17:return          
	}

	ArrayRow createRowCentering(SolverVariable solvervariable, SolverVariable solvervariable1, int i, float f, SolverVariable solvervariable2, SolverVariable solvervariable3, int j)
	{
		if(solvervariable1 == solvervariable2)
	//*   0    0:aload_2         
	//*   1    1:aload           5
	//*   2    3:if_acmpne       37
		{
			variables.put(solvervariable, 1.0F);
	//    3    6:aload_0         
	//    4    7:getfield        #35  <Field ArrayLinkedVariables variables>
	//    5   10:aload_1         
	//    6   11:fconst_1        
	//    7   12:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable3, 1.0F);
	//    8   15:aload_0         
	//    9   16:getfield        #35  <Field ArrayLinkedVariables variables>
	//   10   19:aload           6
	//   11   21:fconst_1        
	//   12   22:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, -2F);
	//   13   25:aload_0         
	//   14   26:getfield        #35  <Field ArrayLinkedVariables variables>
	//   15   29:aload_2         
	//   16   30:ldc1            #83  <Float -2F>
	//   17   32:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   18   35:aload_0         
	//   19   36:areturn         
		}
		if(f == 0.5F)
	//*  20   37:fload           4
	//*  21   39:ldc1            #84  <Float 0.5F>
	//*  22   41:fcmpl           
	//*  23   42:ifne            106
		{
			variables.put(solvervariable, 1.0F);
	//   24   45:aload_0         
	//   25   46:getfield        #35  <Field ArrayLinkedVariables variables>
	//   26   49:aload_1         
	//   27   50:fconst_1        
	//   28   51:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, -1F);
	//   29   54:aload_0         
	//   30   55:getfield        #35  <Field ArrayLinkedVariables variables>
	//   31   58:aload_2         
	//   32   59:ldc1            #53  <Float -1F>
	//   33   61:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable2, -1F);
	//   34   64:aload_0         
	//   35   65:getfield        #35  <Field ArrayLinkedVariables variables>
	//   36   68:aload           5
	//   37   70:ldc1            #53  <Float -1F>
	//   38   72:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable3, 1.0F);
	//   39   75:aload_0         
	//   40   76:getfield        #35  <Field ArrayLinkedVariables variables>
	//   41   79:aload           6
	//   42   81:fconst_1        
	//   43   82:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			if(i > 0 || j > 0)
	//*  44   85:iload_3         
	//*  45   86:ifgt            94
	//*  46   89:iload           7
	//*  47   91:ifle            265
			{
				constantValue = -i + j;
	//   48   94:aload_0         
	//   49   95:iload_3         
	//   50   96:ineg            
	//   51   97:iload           7
	//   52   99:iadd            
	//   53  100:i2f             
	//   54  101:putfield        #24  <Field float constantValue>
				return this;
	//   55  104:aload_0         
	//   56  105:areturn         
			}
		} else
		{
			if(f <= 0.0F)
	//*  57  106:fload           4
	//*  58  108:fconst_0        
	//*  59  109:fcmpg           
	//*  60  110:ifgt            140
			{
				variables.put(solvervariable, -1F);
	//   61  113:aload_0         
	//   62  114:getfield        #35  <Field ArrayLinkedVariables variables>
	//   63  117:aload_1         
	//   64  118:ldc1            #53  <Float -1F>
	//   65  120:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				variables.put(solvervariable1, 1.0F);
	//   66  123:aload_0         
	//   67  124:getfield        #35  <Field ArrayLinkedVariables variables>
	//   68  127:aload_2         
	//   69  128:fconst_1        
	//   70  129:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				constantValue = i;
	//   71  132:aload_0         
	//   72  133:iload_3         
	//   73  134:i2f             
	//   74  135:putfield        #24  <Field float constantValue>
				return this;
	//   75  138:aload_0         
	//   76  139:areturn         
			}
			if(f >= 1.0F)
	//*  77  140:fload           4
	//*  78  142:fconst_1        
	//*  79  143:fcmpl           
	//*  80  144:iflt            177
			{
				variables.put(solvervariable2, -1F);
	//   81  147:aload_0         
	//   82  148:getfield        #35  <Field ArrayLinkedVariables variables>
	//   83  151:aload           5
	//   84  153:ldc1            #53  <Float -1F>
	//   85  155:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				variables.put(solvervariable3, 1.0F);
	//   86  158:aload_0         
	//   87  159:getfield        #35  <Field ArrayLinkedVariables variables>
	//   88  162:aload           6
	//   89  164:fconst_1        
	//   90  165:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				constantValue = j;
	//   91  168:aload_0         
	//   92  169:iload           7
	//   93  171:i2f             
	//   94  172:putfield        #24  <Field float constantValue>
				return this;
	//   95  175:aload_0         
	//   96  176:areturn         
			}
			ArrayLinkedVariables arraylinkedvariables = variables;
	//   97  177:aload_0         
	//   98  178:getfield        #35  <Field ArrayLinkedVariables variables>
	//   99  181:astore          9
			float f1 = 1.0F - f;
	//  100  183:fconst_1        
	//  101  184:fload           4
	//  102  186:fsub            
	//  103  187:fstore          8
			arraylinkedvariables.put(solvervariable, f1 * 1.0F);
	//  104  189:aload           9
	//  105  191:aload_1         
	//  106  192:fload           8
	//  107  194:fconst_1        
	//  108  195:fmul            
	//  109  196:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, f1 * -1F);
	//  110  199:aload_0         
	//  111  200:getfield        #35  <Field ArrayLinkedVariables variables>
	//  112  203:aload_2         
	//  113  204:fload           8
	//  114  206:ldc1            #53  <Float -1F>
	//  115  208:fmul            
	//  116  209:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable2, -1F * f);
	//  117  212:aload_0         
	//  118  213:getfield        #35  <Field ArrayLinkedVariables variables>
	//  119  216:aload           5
	//  120  218:ldc1            #53  <Float -1F>
	//  121  220:fload           4
	//  122  222:fmul            
	//  123  223:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable3, 1.0F * f);
	//  124  226:aload_0         
	//  125  227:getfield        #35  <Field ArrayLinkedVariables variables>
	//  126  230:aload           6
	//  127  232:fconst_1        
	//  128  233:fload           4
	//  129  235:fmul            
	//  130  236:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			if(i > 0 || j > 0)
	//* 131  239:iload_3         
	//* 132  240:ifgt            248
	//* 133  243:iload           7
	//* 134  245:ifle            265
				constantValue = (float)(-i) * f1 + (float)j * f;
	//  135  248:aload_0         
	//  136  249:iload_3         
	//  137  250:ineg            
	//  138  251:i2f             
	//  139  252:fload           8
	//  140  254:fmul            
	//  141  255:iload           7
	//  142  257:i2f             
	//  143  258:fload           4
	//  144  260:fmul            
	//  145  261:fadd            
	//  146  262:putfield        #24  <Field float constantValue>
		}
		return this;
	//  147  265:aload_0         
	//  148  266:areturn         
	}

	ArrayRow createRowDefinition(SolverVariable solvervariable, int i)
	{
		variable = solvervariable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field SolverVariable variable>
		float f = i;
	//    3    5:iload_2         
	//    4    6:i2f             
	//    5    7:fstore_3        
		solvervariable.computedValue = f;
	//    6    8:aload_1         
	//    7    9:fload_3         
	//    8   10:putfield        #88  <Field float SolverVariable.computedValue>
		constantValue = f;
	//    9   13:aload_0         
	//   10   14:fload_3         
	//   11   15:putfield        #24  <Field float constantValue>
		isSimpleDefinition = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #28  <Field boolean isSimpleDefinition>
		return this;
	//   15   23:aload_0         
	//   16   24:areturn         
	}

	ArrayRow createRowDimensionPercent(SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, float f)
	{
		variables.put(solvervariable, -1F);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:aload_1         
	//    3    5:ldc1            #53  <Float -1F>
	//    4    7:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		variables.put(solvervariable1, 1.0F - f);
	//    5   10:aload_0         
	//    6   11:getfield        #35  <Field ArrayLinkedVariables variables>
	//    7   14:aload_2         
	//    8   15:fconst_1        
	//    9   16:fload           4
	//   10   18:fsub            
	//   11   19:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		variables.put(solvervariable2, f);
	//   12   22:aload_0         
	//   13   23:getfield        #35  <Field ArrayLinkedVariables variables>
	//   14   26:aload_3         
	//   15   27:fload           4
	//   16   29:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		return this;
	//   17   32:aload_0         
	//   18   33:areturn         
	}

	public ArrayRow createRowDimensionRatio(SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, SolverVariable solvervariable3, float f)
	{
		variables.put(solvervariable, -1F);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:aload_1         
	//    3    5:ldc1            #53  <Float -1F>
	//    4    7:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		variables.put(solvervariable1, 1.0F);
	//    5   10:aload_0         
	//    6   11:getfield        #35  <Field ArrayLinkedVariables variables>
	//    7   14:aload_2         
	//    8   15:fconst_1        
	//    9   16:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		variables.put(solvervariable2, f);
	//   10   19:aload_0         
	//   11   20:getfield        #35  <Field ArrayLinkedVariables variables>
	//   12   23:aload_3         
	//   13   24:fload           5
	//   14   26:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		variables.put(solvervariable3, -f);
	//   15   29:aload_0         
	//   16   30:getfield        #35  <Field ArrayLinkedVariables variables>
	//   17   33:aload           4
	//   18   35:fload           5
	//   19   37:fneg            
	//   20   38:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		return this;
	//   21   41:aload_0         
	//   22   42:areturn         
	}

	public ArrayRow createRowEqualMatchDimensions(float f, float f1, float f2, SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, SolverVariable solvervariable3)
	{
		constantValue = 0.0F;
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:putfield        #24  <Field float constantValue>
		if(f1 != 0.0F && f != f2)
	//*   3    5:fload_2         
	//*   4    6:fconst_0        
	//*   5    7:fcmpl           
	//*   6    8:ifeq            130
	//*   7   11:fload_1         
	//*   8   12:fload_3         
	//*   9   13:fcmpl           
	//*  10   14:ifne            20
	//*  11   17:goto            130
		{
			if(f == 0.0F)
	//*  12   20:fload_1         
	//*  13   21:fconst_0        
	//*  14   22:fcmpl           
	//*  15   23:ifne            49
			{
				variables.put(solvervariable, 1.0F);
	//   16   26:aload_0         
	//   17   27:getfield        #35  <Field ArrayLinkedVariables variables>
	//   18   30:aload           4
	//   19   32:fconst_1        
	//   20   33:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				variables.put(solvervariable1, -1F);
	//   21   36:aload_0         
	//   22   37:getfield        #35  <Field ArrayLinkedVariables variables>
	//   23   40:aload           5
	//   24   42:ldc1            #53  <Float -1F>
	//   25   44:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				return this;
	//   26   47:aload_0         
	//   27   48:areturn         
			}
			if(f2 == 0.0F)
	//*  28   49:fload_3         
	//*  29   50:fconst_0        
	//*  30   51:fcmpl           
	//*  31   52:ifne            78
			{
				variables.put(solvervariable2, 1.0F);
	//   32   55:aload_0         
	//   33   56:getfield        #35  <Field ArrayLinkedVariables variables>
	//   34   59:aload           6
	//   35   61:fconst_1        
	//   36   62:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				variables.put(solvervariable3, -1F);
	//   37   65:aload_0         
	//   38   66:getfield        #35  <Field ArrayLinkedVariables variables>
	//   39   69:aload           7
	//   40   71:ldc1            #53  <Float -1F>
	//   41   73:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				return this;
	//   42   76:aload_0         
	//   43   77:areturn         
			} else
			{
				f = f / f1 / (f2 / f1);
	//   44   78:fload_1         
	//   45   79:fload_2         
	//   46   80:fdiv            
	//   47   81:fload_3         
	//   48   82:fload_2         
	//   49   83:fdiv            
	//   50   84:fdiv            
	//   51   85:fstore_1        
				variables.put(solvervariable, 1.0F);
	//   52   86:aload_0         
	//   53   87:getfield        #35  <Field ArrayLinkedVariables variables>
	//   54   90:aload           4
	//   55   92:fconst_1        
	//   56   93:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				variables.put(solvervariable1, -1F);
	//   57   96:aload_0         
	//   58   97:getfield        #35  <Field ArrayLinkedVariables variables>
	//   59  100:aload           5
	//   60  102:ldc1            #53  <Float -1F>
	//   61  104:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				variables.put(solvervariable3, f);
	//   62  107:aload_0         
	//   63  108:getfield        #35  <Field ArrayLinkedVariables variables>
	//   64  111:aload           7
	//   65  113:fload_1         
	//   66  114:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				variables.put(solvervariable2, -f);
	//   67  117:aload_0         
	//   68  118:getfield        #35  <Field ArrayLinkedVariables variables>
	//   69  121:aload           6
	//   70  123:fload_1         
	//   71  124:fneg            
	//   72  125:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
				return this;
	//   73  128:aload_0         
	//   74  129:areturn         
			}
		} else
		{
			variables.put(solvervariable, 1.0F);
	//   75  130:aload_0         
	//   76  131:getfield        #35  <Field ArrayLinkedVariables variables>
	//   77  134:aload           4
	//   78  136:fconst_1        
	//   79  137:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, -1F);
	//   80  140:aload_0         
	//   81  141:getfield        #35  <Field ArrayLinkedVariables variables>
	//   82  144:aload           5
	//   83  146:ldc1            #53  <Float -1F>
	//   84  148:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable3, 1.0F);
	//   85  151:aload_0         
	//   86  152:getfield        #35  <Field ArrayLinkedVariables variables>
	//   87  155:aload           7
	//   88  157:fconst_1        
	//   89  158:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable2, -1F);
	//   90  161:aload_0         
	//   91  162:getfield        #35  <Field ArrayLinkedVariables variables>
	//   92  165:aload           6
	//   93  167:ldc1            #53  <Float -1F>
	//   94  169:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   95  172:aload_0         
	//   96  173:areturn         
		}
	}

	public ArrayRow createRowEquals(SolverVariable solvervariable, int i)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            23
		{
			constantValue = i * -1;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:iconst_m1       
	//    5    7:imul            
	//    6    8:i2f             
	//    7    9:putfield        #24  <Field float constantValue>
			variables.put(solvervariable, 1.0F);
	//    8   12:aload_0         
	//    9   13:getfield        #35  <Field ArrayLinkedVariables variables>
	//   10   16:aload_1         
	//   11   17:fconst_1        
	//   12   18:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   13   21:aload_0         
	//   14   22:areturn         
		} else
		{
			constantValue = i;
	//   15   23:aload_0         
	//   16   24:iload_2         
	//   17   25:i2f             
	//   18   26:putfield        #24  <Field float constantValue>
			variables.put(solvervariable, -1F);
	//   19   29:aload_0         
	//   20   30:getfield        #35  <Field ArrayLinkedVariables variables>
	//   21   33:aload_1         
	//   22   34:ldc1            #53  <Float -1F>
	//   23   36:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   24   39:aload_0         
	//   25   40:areturn         
		}
	}

	public ArrayRow createRowEquals(SolverVariable solvervariable, SolverVariable solvervariable1, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int j = 0;
	//    2    3:iconst_0        
	//    3    4:istore          5
		if(i != 0)
	//*   4    6:iload_3         
	//*   5    7:ifeq            36
		{
			flag = ((boolean) (j));
	//    6   10:iload           5
	//    7   12:istore          4
			j = i;
	//    8   14:iload_3         
	//    9   15:istore          5
			if(i < 0)
	//*  10   17:iload_3         
	//*  11   18:ifge            29
			{
				j = i * -1;
	//   12   21:iload_3         
	//   13   22:iconst_m1       
	//   14   23:imul            
	//   15   24:istore          5
				flag = true;
	//   16   26:iconst_1        
	//   17   27:istore          4
			}
			constantValue = j;
	//   18   29:aload_0         
	//   19   30:iload           5
	//   20   32:i2f             
	//   21   33:putfield        #24  <Field float constantValue>
		}
		if(!flag)
	//*  22   36:iload           4
	//*  23   38:ifne            62
		{
			variables.put(solvervariable, -1F);
	//   24   41:aload_0         
	//   25   42:getfield        #35  <Field ArrayLinkedVariables variables>
	//   26   45:aload_1         
	//   27   46:ldc1            #53  <Float -1F>
	//   28   48:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, 1.0F);
	//   29   51:aload_0         
	//   30   52:getfield        #35  <Field ArrayLinkedVariables variables>
	//   31   55:aload_2         
	//   32   56:fconst_1        
	//   33   57:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   34   60:aload_0         
	//   35   61:areturn         
		} else
		{
			variables.put(solvervariable, 1.0F);
	//   36   62:aload_0         
	//   37   63:getfield        #35  <Field ArrayLinkedVariables variables>
	//   38   66:aload_1         
	//   39   67:fconst_1        
	//   40   68:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, -1F);
	//   41   71:aload_0         
	//   42   72:getfield        #35  <Field ArrayLinkedVariables variables>
	//   43   75:aload_2         
	//   44   76:ldc1            #53  <Float -1F>
	//   45   78:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   46   81:aload_0         
	//   47   82:areturn         
		}
	}

	public ArrayRow createRowGreaterThan(SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int j = 0;
	//    2    3:iconst_0        
	//    3    4:istore          6
		if(i != 0)
	//*   4    6:iload           4
	//*   5    8:ifeq            40
		{
			flag = ((boolean) (j));
	//    6   11:iload           6
	//    7   13:istore          5
			j = i;
	//    8   15:iload           4
	//    9   17:istore          6
			if(i < 0)
	//*  10   19:iload           4
	//*  11   21:ifge            33
			{
				j = i * -1;
	//   12   24:iload           4
	//   13   26:iconst_m1       
	//   14   27:imul            
	//   15   28:istore          6
				flag = true;
	//   16   30:iconst_1        
	//   17   31:istore          5
			}
			constantValue = j;
	//   18   33:aload_0         
	//   19   34:iload           6
	//   20   36:i2f             
	//   21   37:putfield        #24  <Field float constantValue>
		}
		if(!flag)
	//*  22   40:iload           5
	//*  23   42:ifne            75
		{
			variables.put(solvervariable, -1F);
	//   24   45:aload_0         
	//   25   46:getfield        #35  <Field ArrayLinkedVariables variables>
	//   26   49:aload_1         
	//   27   50:ldc1            #53  <Float -1F>
	//   28   52:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, 1.0F);
	//   29   55:aload_0         
	//   30   56:getfield        #35  <Field ArrayLinkedVariables variables>
	//   31   59:aload_2         
	//   32   60:fconst_1        
	//   33   61:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable2, 1.0F);
	//   34   64:aload_0         
	//   35   65:getfield        #35  <Field ArrayLinkedVariables variables>
	//   36   68:aload_3         
	//   37   69:fconst_1        
	//   38   70:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   39   73:aload_0         
	//   40   74:areturn         
		} else
		{
			variables.put(solvervariable, 1.0F);
	//   41   75:aload_0         
	//   42   76:getfield        #35  <Field ArrayLinkedVariables variables>
	//   43   79:aload_1         
	//   44   80:fconst_1        
	//   45   81:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, -1F);
	//   46   84:aload_0         
	//   47   85:getfield        #35  <Field ArrayLinkedVariables variables>
	//   48   88:aload_2         
	//   49   89:ldc1            #53  <Float -1F>
	//   50   91:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable2, -1F);
	//   51   94:aload_0         
	//   52   95:getfield        #35  <Field ArrayLinkedVariables variables>
	//   53   98:aload_3         
	//   54   99:ldc1            #53  <Float -1F>
	//   55  101:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   56  104:aload_0         
	//   57  105:areturn         
		}
	}

	public ArrayRow createRowLowerThan(SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int j = 0;
	//    2    3:iconst_0        
	//    3    4:istore          6
		if(i != 0)
	//*   4    6:iload           4
	//*   5    8:ifeq            40
		{
			flag = ((boolean) (j));
	//    6   11:iload           6
	//    7   13:istore          5
			j = i;
	//    8   15:iload           4
	//    9   17:istore          6
			if(i < 0)
	//*  10   19:iload           4
	//*  11   21:ifge            33
			{
				j = i * -1;
	//   12   24:iload           4
	//   13   26:iconst_m1       
	//   14   27:imul            
	//   15   28:istore          6
				flag = true;
	//   16   30:iconst_1        
	//   17   31:istore          5
			}
			constantValue = j;
	//   18   33:aload_0         
	//   19   34:iload           6
	//   20   36:i2f             
	//   21   37:putfield        #24  <Field float constantValue>
		}
		if(!flag)
	//*  22   40:iload           5
	//*  23   42:ifne            76
		{
			variables.put(solvervariable, -1F);
	//   24   45:aload_0         
	//   25   46:getfield        #35  <Field ArrayLinkedVariables variables>
	//   26   49:aload_1         
	//   27   50:ldc1            #53  <Float -1F>
	//   28   52:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, 1.0F);
	//   29   55:aload_0         
	//   30   56:getfield        #35  <Field ArrayLinkedVariables variables>
	//   31   59:aload_2         
	//   32   60:fconst_1        
	//   33   61:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable2, -1F);
	//   34   64:aload_0         
	//   35   65:getfield        #35  <Field ArrayLinkedVariables variables>
	//   36   68:aload_3         
	//   37   69:ldc1            #53  <Float -1F>
	//   38   71:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   39   74:aload_0         
	//   40   75:areturn         
		} else
		{
			variables.put(solvervariable, 1.0F);
	//   41   76:aload_0         
	//   42   77:getfield        #35  <Field ArrayLinkedVariables variables>
	//   43   80:aload_1         
	//   44   81:fconst_1        
	//   45   82:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable1, -1F);
	//   46   85:aload_0         
	//   47   86:getfield        #35  <Field ArrayLinkedVariables variables>
	//   48   89:aload_2         
	//   49   90:ldc1            #53  <Float -1F>
	//   50   92:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variables.put(solvervariable2, 1.0F);
	//   51   95:aload_0         
	//   52   96:getfield        #35  <Field ArrayLinkedVariables variables>
	//   53   99:aload_3         
	//   54  100:fconst_1        
	//   55  101:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			return this;
	//   56  104:aload_0         
	//   57  105:areturn         
		}
	}

	public ArrayRow createRowWithAngle(SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, SolverVariable solvervariable3, float f)
	{
		variables.put(solvervariable2, 0.5F);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:aload_3         
	//    3    5:ldc1            #84  <Float 0.5F>
	//    4    7:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		variables.put(solvervariable3, 0.5F);
	//    5   10:aload_0         
	//    6   11:getfield        #35  <Field ArrayLinkedVariables variables>
	//    7   14:aload           4
	//    8   16:ldc1            #84  <Float 0.5F>
	//    9   18:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		variables.put(solvervariable, -0.5F);
	//   10   21:aload_0         
	//   11   22:getfield        #35  <Field ArrayLinkedVariables variables>
	//   12   25:aload_1         
	//   13   26:ldc1            #101 <Float -0.5F>
	//   14   28:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		variables.put(solvervariable1, -0.5F);
	//   15   31:aload_0         
	//   16   32:getfield        #35  <Field ArrayLinkedVariables variables>
	//   17   35:aload_2         
	//   18   36:ldc1            #101 <Float -0.5F>
	//   19   38:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
		constantValue = -f;
	//   20   41:aload_0         
	//   21   42:fload           5
	//   22   44:fneg            
	//   23   45:putfield        #24  <Field float constantValue>
		return this;
	//   24   48:aload_0         
	//   25   49:areturn         
	}

	void ensurePositiveConstant()
	{
		float f = constantValue;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float constantValue>
	//    2    4:fstore_1        
		if(f < 0.0F)
	//*   3    5:fload_1         
	//*   4    6:fconst_0        
	//*   5    7:fcmpg           
	//*   6    8:ifge            26
		{
			constantValue = f * -1F;
	//    7   11:aload_0         
	//    8   12:fload_1         
	//    9   13:ldc1            #53  <Float -1F>
	//   10   15:fmul            
	//   11   16:putfield        #24  <Field float constantValue>
			variables.invert();
	//   12   19:aload_0         
	//   13   20:getfield        #35  <Field ArrayLinkedVariables variables>
	//   14   23:invokevirtual   #105 <Method void ArrayLinkedVariables.invert()>
		}
	//   15   26:return          
	}

	public SolverVariable getKey()
	{
		return variable;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SolverVariable variable>
	//    2    4:areturn         
	}

	public SolverVariable getPivotCandidate(LinearSystem linearsystem, boolean aflag[])
	{
		return variables.getPivotCandidate(aflag, ((SolverVariable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:aload_2         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #112 <Method SolverVariable ArrayLinkedVariables.getPivotCandidate(boolean[], SolverVariable)>
	//    5    9:areturn         
	}

	boolean hasKeyVariable()
	{
		SolverVariable solvervariable = variable;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SolverVariable variable>
	//    2    4:astore_1        
		return solvervariable != null && (solvervariable.mType == SolverVariable.Type.UNRESTRICTED || constantValue >= 0.0F);
	//    3    5:aload_1         
	//    4    6:ifnull          30
	//    5    9:aload_1         
	//    6   10:getfield        #118 <Field SolverVariable$Type SolverVariable.mType>
	//    7   13:getstatic       #123 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//    8   16:if_acmpeq       28
	//    9   19:aload_0         
	//   10   20:getfield        #24  <Field float constantValue>
	//   11   23:fconst_0        
	//   12   24:fcmpg           
	//   13   25:iflt            30
	//   14   28:iconst_1        
	//   15   29:ireturn         
	//   16   30:iconst_0        
	//   17   31:ireturn         
	}

	boolean hasVariable(SolverVariable solvervariable)
	{
		return variables.containsKey(solvervariable);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #128 <Method boolean ArrayLinkedVariables.containsKey(SolverVariable)>
	//    4    8:ireturn         
	}

	public void initFromRow(LinearSystem.Row row)
	{
		if(row instanceof ArrayRow)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ArrayRow>
	//*   2    4:ifeq            74
		{
			row = ((LinearSystem.Row) ((ArrayRow)row));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ArrayRow>
	//    5   11:astore_1        
			variable = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #22  <Field SolverVariable variable>
			variables.clear();
	//    9   17:aload_0         
	//   10   18:getfield        #35  <Field ArrayLinkedVariables variables>
	//   11   21:invokevirtual   #80  <Method void ArrayLinkedVariables.clear()>
			for(int i = 0; i < ((ArrayRow) (row)).variables.currentSize; i++)
	//*  12   24:iconst_0        
	//*  13   25:istore_3        
	//*  14   26:iload_3         
	//*  15   27:aload_1         
	//*  16   28:getfield        #35  <Field ArrayLinkedVariables variables>
	//*  17   31:getfield        #77  <Field int ArrayLinkedVariables.currentSize>
	//*  18   34:icmpge          74
			{
				SolverVariable solvervariable = ((ArrayRow) (row)).variables.getVariable(i);
	//   19   37:aload_1         
	//   20   38:getfield        #35  <Field ArrayLinkedVariables variables>
	//   21   41:iload_3         
	//   22   42:invokevirtual   #134 <Method SolverVariable ArrayLinkedVariables.getVariable(int)>
	//   23   45:astore          4
				float f = ((ArrayRow) (row)).variables.getVariableValue(i);
	//   24   47:aload_1         
	//   25   48:getfield        #35  <Field ArrayLinkedVariables variables>
	//   26   51:iload_3         
	//   27   52:invokevirtual   #138 <Method float ArrayLinkedVariables.getVariableValue(int)>
	//   28   55:fstore_2        
				variables.add(solvervariable, f, true);
	//   29   56:aload_0         
	//   30   57:getfield        #35  <Field ArrayLinkedVariables variables>
	//   31   60:aload           4
	//   32   62:fload_2         
	//   33   63:iconst_1        
	//   34   64:invokevirtual   #142 <Method void ArrayLinkedVariables.add(SolverVariable, float, boolean)>
			}

	//   35   67:iload_3         
	//   36   68:iconst_1        
	//   37   69:iadd            
	//   38   70:istore_3        
		}
	//*  39   71:goto            26
	//   40   74:return          
	}

	public boolean isEmpty()
	{
		return variable == null && constantValue == 0.0F && variables.currentSize == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SolverVariable variable>
	//    2    4:ifnonnull       28
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field float constantValue>
	//    5   11:fconst_0        
	//    6   12:fcmpl           
	//    7   13:ifne            28
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field ArrayLinkedVariables variables>
	//   10   20:getfield        #77  <Field int ArrayLinkedVariables.currentSize>
	//   11   23:ifne            28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	SolverVariable pickPivot(SolverVariable solvervariable)
	{
		return variables.getPivotCandidate(((boolean []) (null)), solvervariable);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayLinkedVariables variables>
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokevirtual   #112 <Method SolverVariable ArrayLinkedVariables.getPivotCandidate(boolean[], SolverVariable)>
	//    5    9:areturn         
	}

	void pivot(SolverVariable solvervariable)
	{
		SolverVariable solvervariable1 = variable;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SolverVariable variable>
	//    2    4:astore_3        
		if(solvervariable1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          24
		{
			variables.put(solvervariable1, -1F);
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field ArrayLinkedVariables variables>
	//    7   13:aload_3         
	//    8   14:ldc1            #53  <Float -1F>
	//    9   16:invokevirtual   #50  <Method void ArrayLinkedVariables.put(SolverVariable, float)>
			variable = null;
	//   10   19:aload_0         
	//   11   20:aconst_null     
	//   12   21:putfield        #22  <Field SolverVariable variable>
		}
		float f = variables.remove(solvervariable, true) * -1F;
	//   13   24:aload_0         
	//   14   25:getfield        #35  <Field ArrayLinkedVariables variables>
	//   15   28:aload_1         
	//   16   29:iconst_1        
	//   17   30:invokevirtual   #149 <Method float ArrayLinkedVariables.remove(SolverVariable, boolean)>
	//   18   33:ldc1            #53  <Float -1F>
	//   19   35:fmul            
	//   20   36:fstore_2        
		variable = solvervariable;
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:putfield        #22  <Field SolverVariable variable>
		if(f == 1.0F)
	//*  24   42:fload_2         
	//*  25   43:fconst_1        
	//*  26   44:fcmpl           
	//*  27   45:ifne            49
		{
			return;
	//   28   48:return          
		} else
		{
			constantValue = constantValue / f;
	//   29   49:aload_0         
	//   30   50:aload_0         
	//   31   51:getfield        #24  <Field float constantValue>
	//   32   54:fload_2         
	//   33   55:fdiv            
	//   34   56:putfield        #24  <Field float constantValue>
			variables.divideByAmount(f);
	//   35   59:aload_0         
	//   36   60:getfield        #35  <Field ArrayLinkedVariables variables>
	//   37   63:fload_2         
	//   38   64:invokevirtual   #153 <Method void ArrayLinkedVariables.divideByAmount(float)>
			return;
	//   39   67:return          
		}
	}

	public void reset()
	{
		variable = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #22  <Field SolverVariable variable>
		variables.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field ArrayLinkedVariables variables>
	//    5    9:invokevirtual   #80  <Method void ArrayLinkedVariables.clear()>
		constantValue = 0.0F;
	//    6   12:aload_0         
	//    7   13:fconst_0        
	//    8   14:putfield        #24  <Field float constantValue>
		isSimpleDefinition = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #28  <Field boolean isSimpleDefinition>
	//   12   22:return          
	}

	String toReadableString()
	{
		Object obj;
		if(variable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field SolverVariable variable>
	//*   2    4:ifnonnull       42
		{
			obj = ((Object) (new StringBuilder()));
	//    3    7:new             #158 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #159 <Method void StringBuilder()>
	//    6   14:astore          7
			((StringBuilder) (obj)).append("");
	//    7   16:aload           7
	//    8   18:ldc1            #161 <String "">
	//    9   20:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:pop             
			((StringBuilder) (obj)).append("0");
	//   11   24:aload           7
	//   12   26:ldc1            #167 <String "0">
	//   13   28:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   15   32:aload           7
	//   16   34:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   17   37:astore          7
		} else
	//*  18   39:goto            76
		{
			obj = ((Object) (new StringBuilder()));
	//   19   42:new             #158 <Class StringBuilder>
	//   20   45:dup             
	//   21   46:invokespecial   #159 <Method void StringBuilder()>
	//   22   49:astore          7
			((StringBuilder) (obj)).append("");
	//   23   51:aload           7
	//   24   53:ldc1            #161 <String "">
	//   25   55:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   26   58:pop             
			((StringBuilder) (obj)).append(((Object) (variable)));
	//   27   59:aload           7
	//   28   61:aload_0         
	//   29   62:getfield        #22  <Field SolverVariable variable>
	//   30   65:invokevirtual   #173 <Method StringBuilder StringBuilder.append(Object)>
	//   31   68:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   32   69:aload           7
	//   33   71:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   34   74:astore          7
		}
		Object obj1 = ((Object) (new StringBuilder()));
	//   35   76:new             #158 <Class StringBuilder>
	//   36   79:dup             
	//   37   80:invokespecial   #159 <Method void StringBuilder()>
	//   38   83:astore          8
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   39   85:aload           8
	//   40   87:aload           7
	//   41   89:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
		((StringBuilder) (obj1)).append(" = ");
	//   43   93:aload           8
	//   44   95:ldc1            #175 <String " = ">
	//   45   97:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   46  100:pop             
		obj = ((Object) (((StringBuilder) (obj1)).toString()));
	//   47  101:aload           8
	//   48  103:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   49  106:astore          7
		float f = constantValue;
	//   50  108:aload_0         
	//   51  109:getfield        #24  <Field float constantValue>
	//   52  112:fstore_1        
		int i = 0;
	//   53  113:iconst_0        
	//   54  114:istore          4
		boolean flag;
		if(f != 0.0F)
	//*  55  116:fload_1         
	//*  56  117:fconst_0        
	//*  57  118:fcmpl           
	//*  58  119:ifeq            161
		{
			obj1 = ((Object) (new StringBuilder()));
	//   59  122:new             #158 <Class StringBuilder>
	//   60  125:dup             
	//   61  126:invokespecial   #159 <Method void StringBuilder()>
	//   62  129:astore          8
			((StringBuilder) (obj1)).append(((String) (obj)));
	//   63  131:aload           8
	//   64  133:aload           7
	//   65  135:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
			((StringBuilder) (obj1)).append(constantValue);
	//   67  139:aload           8
	//   68  141:aload_0         
	//   69  142:getfield        #24  <Field float constantValue>
	//   70  145:invokevirtual   #178 <Method StringBuilder StringBuilder.append(float)>
	//   71  148:pop             
			obj = ((Object) (((StringBuilder) (obj1)).toString()));
	//   72  149:aload           8
	//   73  151:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   74  154:astore          7
			flag = true;
	//   75  156:iconst_1        
	//   76  157:istore_3        
		} else
	//*  77  158:goto            163
		{
			flag = false;
	//   78  161:iconst_0        
	//   79  162:istore_3        
		}
		for(int j = variables.currentSize; i < j; i++)
	//*  80  163:aload_0         
	//*  81  164:getfield        #35  <Field ArrayLinkedVariables variables>
	//*  82  167:getfield        #77  <Field int ArrayLinkedVariables.currentSize>
	//*  83  170:istore          5
	//*  84  172:iload           4
	//*  85  174:iload           5
	//*  86  176:icmpge          462
		{
			obj1 = ((Object) (variables.getVariable(i)));
	//   87  179:aload_0         
	//   88  180:getfield        #35  <Field ArrayLinkedVariables variables>
	//   89  183:iload           4
	//   90  185:invokevirtual   #134 <Method SolverVariable ArrayLinkedVariables.getVariable(int)>
	//   91  188:astore          8
			if(obj1 == null)
	//*  92  190:aload           8
	//*  93  192:ifnonnull       198
				continue;
	//   94  195:goto            453
			float f2 = variables.getVariableValue(i);
	//   95  198:aload_0         
	//   96  199:getfield        #35  <Field ArrayLinkedVariables variables>
	//   97  202:iload           4
	//   98  204:invokevirtual   #138 <Method float ArrayLinkedVariables.getVariableValue(int)>
	//   99  207:fstore_2        
			int k = f2 != 0.0F;
	//  100  208:fload_2         
	//  101  209:fconst_0        
	//  102  210:fcmpl           
	//  103  211:istore          6
			if(k == 0)
	//* 104  213:iload           6
	//* 105  215:ifne            221
				continue;
	//  106  218:goto            453
			String s = ((SolverVariable) (obj1)).toString();
	//  107  221:aload           8
	//  108  223:invokevirtual   #179 <Method String SolverVariable.toString()>
	//  109  226:astore          9
			float f1;
			if(!flag)
	//* 110  228:iload_3         
	//* 111  229:ifne            284
			{
				obj1 = obj;
	//  112  232:aload           7
	//  113  234:astore          8
				f1 = f2;
	//  114  236:fload_2         
	//  115  237:fstore_1        
				if(f2 < 0.0F)
	//* 116  238:fload_2         
	//* 117  239:fconst_0        
	//* 118  240:fcmpg           
	//* 119  241:ifge            363
				{
					obj1 = ((Object) (new StringBuilder()));
	//  120  244:new             #158 <Class StringBuilder>
	//  121  247:dup             
	//  122  248:invokespecial   #159 <Method void StringBuilder()>
	//  123  251:astore          8
					((StringBuilder) (obj1)).append(((String) (obj)));
	//  124  253:aload           8
	//  125  255:aload           7
	//  126  257:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  127  260:pop             
					((StringBuilder) (obj1)).append("- ");
	//  128  261:aload           8
	//  129  263:ldc1            #181 <String "- ">
	//  130  265:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  131  268:pop             
					obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  132  269:aload           8
	//  133  271:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  134  274:astore          8
					f1 = f2 * -1F;
	//  135  276:fload_2         
	//  136  277:ldc1            #53  <Float -1F>
	//  137  279:fmul            
	//  138  280:fstore_1        
				}
			} else
	//* 139  281:goto            363
			if(k > 0)
	//* 140  284:iload           6
	//* 141  286:ifle            326
			{
				obj1 = ((Object) (new StringBuilder()));
	//  142  289:new             #158 <Class StringBuilder>
	//  143  292:dup             
	//  144  293:invokespecial   #159 <Method void StringBuilder()>
	//  145  296:astore          8
				((StringBuilder) (obj1)).append(((String) (obj)));
	//  146  298:aload           8
	//  147  300:aload           7
	//  148  302:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  149  305:pop             
				((StringBuilder) (obj1)).append(" + ");
	//  150  306:aload           8
	//  151  308:ldc1            #183 <String " + ">
	//  152  310:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  153  313:pop             
				obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  154  314:aload           8
	//  155  316:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  156  319:astore          8
				f1 = f2;
	//  157  321:fload_2         
	//  158  322:fstore_1        
			} else
	//* 159  323:goto            363
			{
				obj1 = ((Object) (new StringBuilder()));
	//  160  326:new             #158 <Class StringBuilder>
	//  161  329:dup             
	//  162  330:invokespecial   #159 <Method void StringBuilder()>
	//  163  333:astore          8
				((StringBuilder) (obj1)).append(((String) (obj)));
	//  164  335:aload           8
	//  165  337:aload           7
	//  166  339:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  167  342:pop             
				((StringBuilder) (obj1)).append(" - ");
	//  168  343:aload           8
	//  169  345:ldc1            #185 <String " - ">
	//  170  347:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  171  350:pop             
				obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  172  351:aload           8
	//  173  353:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  174  356:astore          8
				f1 = f2 * -1F;
	//  175  358:fload_2         
	//  176  359:ldc1            #53  <Float -1F>
	//  177  361:fmul            
	//  178  362:fstore_1        
			}
			if(f1 == 1.0F)
	//* 179  363:fload_1         
	//* 180  364:fconst_1        
	//* 181  365:fcmpl           
	//* 182  366:ifne            404
			{
				obj = ((Object) (new StringBuilder()));
	//  183  369:new             #158 <Class StringBuilder>
	//  184  372:dup             
	//  185  373:invokespecial   #159 <Method void StringBuilder()>
	//  186  376:astore          7
				((StringBuilder) (obj)).append(((String) (obj1)));
	//  187  378:aload           7
	//  188  380:aload           8
	//  189  382:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  190  385:pop             
				((StringBuilder) (obj)).append(s);
	//  191  386:aload           7
	//  192  388:aload           9
	//  193  390:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  194  393:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  195  394:aload           7
	//  196  396:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  197  399:astore          7
			} else
	//* 198  401:goto            451
			{
				obj = ((Object) (new StringBuilder()));
	//  199  404:new             #158 <Class StringBuilder>
	//  200  407:dup             
	//  201  408:invokespecial   #159 <Method void StringBuilder()>
	//  202  411:astore          7
				((StringBuilder) (obj)).append(((String) (obj1)));
	//  203  413:aload           7
	//  204  415:aload           8
	//  205  417:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  206  420:pop             
				((StringBuilder) (obj)).append(f1);
	//  207  421:aload           7
	//  208  423:fload_1         
	//  209  424:invokevirtual   #178 <Method StringBuilder StringBuilder.append(float)>
	//  210  427:pop             
				((StringBuilder) (obj)).append(" ");
	//  211  428:aload           7
	//  212  430:ldc1            #187 <String " ">
	//  213  432:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  214  435:pop             
				((StringBuilder) (obj)).append(s);
	//  215  436:aload           7
	//  216  438:aload           9
	//  217  440:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  218  443:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  219  444:aload           7
	//  220  446:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  221  449:astore          7
			}
			flag = true;
	//  222  451:iconst_1        
	//  223  452:istore_3        
		}

	//  224  453:iload           4
	//  225  455:iconst_1        
	//  226  456:iadd            
	//  227  457:istore          4
	//* 228  459:goto            172
		obj1 = obj;
	//  229  462:aload           7
	//  230  464:astore          8
		if(!flag)
	//* 231  466:iload_3         
	//* 232  467:ifne            502
		{
			obj1 = ((Object) (new StringBuilder()));
	//  233  470:new             #158 <Class StringBuilder>
	//  234  473:dup             
	//  235  474:invokespecial   #159 <Method void StringBuilder()>
	//  236  477:astore          8
			((StringBuilder) (obj1)).append(((String) (obj)));
	//  237  479:aload           8
	//  238  481:aload           7
	//  239  483:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  240  486:pop             
			((StringBuilder) (obj1)).append("0.0");
	//  241  487:aload           8
	//  242  489:ldc1            #189 <String "0.0">
	//  243  491:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//  244  494:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  245  495:aload           8
	//  246  497:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  247  500:astore          8
		}
		return ((String) (obj1));
	//  248  502:aload           8
	//  249  504:areturn         
	}

	public String toString()
	{
		return toReadableString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #191 <Method String toReadableString()>
	//    2    4:areturn         
	}

	float constantValue;
	boolean isSimpleDefinition;
	boolean used;
	SolverVariable variable;
	public final ArrayLinkedVariables variables;
}
