// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;

import java.util.Arrays;

// Referenced classes of package android.support.constraint.solver:
//			ArrayRow, ArrayLinkedVariables

public class SolverVariable
{
	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(android/support/constraint/solver/SolverVariable$Type, s);
		//    0    0:ldc1            #2   <Class SolverVariable$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SolverVariable$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field SolverVariable$Type[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Landroid.support.constraint.solver.SolverVariable$Type_3B_.clone()>
		//    2    6:checkcast       #50  <Class SolverVariable$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type CONSTANT;
		public static final Type ERROR;
		public static final Type SLACK;
		public static final Type UNKNOWN;
		public static final Type UNRESTRICTED;

		static 
		{
			UNRESTRICTED = new Type("UNRESTRICTED", 0);
		//    0    0:new             #2   <Class SolverVariable$Type>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "UNRESTRICTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//    5   10:putstatic       #25  <Field SolverVariable$Type UNRESTRICTED>
			CONSTANT = new Type("CONSTANT", 1);
		//    6   13:new             #2   <Class SolverVariable$Type>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "CONSTANT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//   11   23:putstatic       #28  <Field SolverVariable$Type CONSTANT>
			SLACK = new Type("SLACK", 2);
		//   12   26:new             #2   <Class SolverVariable$Type>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "SLACK">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//   17   36:putstatic       #31  <Field SolverVariable$Type SLACK>
			ERROR = new Type("ERROR", 3);
		//   18   39:new             #2   <Class SolverVariable$Type>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "ERROR">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//   23   49:putstatic       #34  <Field SolverVariable$Type ERROR>
			UNKNOWN = new Type("UNKNOWN", 4);
		//   24   52:new             #2   <Class SolverVariable$Type>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "UNKNOWN">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//   29   62:putstatic       #37  <Field SolverVariable$Type UNKNOWN>
			$VALUES = (new Type[] {
				UNRESTRICTED, CONSTANT, SLACK, ERROR, UNKNOWN
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       Type[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field SolverVariable$Type UNRESTRICTED>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field SolverVariable$Type CONSTANT>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field SolverVariable$Type SLACK>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field SolverVariable$Type ERROR>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field SolverVariable$Type UNKNOWN>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field SolverVariable$Type[] $VALUES>
		//*  53  102:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public SolverVariable(Type type, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		id = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #38  <Field int id>
		definitionId = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #40  <Field int definitionId>
		strength = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #42  <Field int strength>
		strengthVector = new float[7];
	//   11   19:aload_0         
	//   12   20:bipush          7
	//   13   22:newarray        float[]
	//   14   24:putfield        #44  <Field float[] strengthVector>
		mClientEquations = new ArrayRow[8];
	//   15   27:aload_0         
	//   16   28:bipush          8
	//   17   30:anewarray       ArrayRow[]
	//   18   33:putfield        #48  <Field ArrayRow[] mClientEquations>
		mClientEquationsCount = 0;
	//   19   36:aload_0         
	//   20   37:iconst_0        
	//   21   38:putfield        #50  <Field int mClientEquationsCount>
		usageInRowCount = 0;
	//   22   41:aload_0         
	//   23   42:iconst_0        
	//   24   43:putfield        #52  <Field int usageInRowCount>
		mType = type;
	//   25   46:aload_0         
	//   26   47:aload_1         
	//   27   48:putfield        #54  <Field SolverVariable$Type mType>
	//   28   51:return          
	}

	static void increaseErrorId()
	{
		uniqueErrorId++;
	//    0    0:getstatic       #57  <Field int uniqueErrorId>
	//    1    3:iconst_1        
	//    2    4:iadd            
	//    3    5:putstatic       #57  <Field int uniqueErrorId>
	//    4    8:return          
	}

	public final void addToRow(ArrayRow arrayrow)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j;
		do
		{
			j = mClientEquationsCount;
	//    2    2:aload_0         
	//    3    3:getfield        #50  <Field int mClientEquationsCount>
	//    4    6:istore_3        
			if(i >= j)
				break;
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:icmpge          30
			if(mClientEquations[i] == arrayrow)
	//*   8   12:aload_0         
	//*   9   13:getfield        #48  <Field ArrayRow[] mClientEquations>
	//*  10   16:iload_2         
	//*  11   17:aaload          
	//*  12   18:aload_1         
	//*  13   19:if_acmpne       23
				return;
	//   14   22:return          
			i++;
	//   15   23:iload_2         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore_2        
		} while(true);
	//   19   27:goto            2
		ArrayRow aarrayrow[] = mClientEquations;
	//   20   30:aload_0         
	//   21   31:getfield        #48  <Field ArrayRow[] mClientEquations>
	//   22   34:astore          4
		if(j >= aarrayrow.length)
	//*  23   36:iload_3         
	//*  24   37:aload           4
	//*  25   39:arraylength     
	//*  26   40:icmplt          60
			mClientEquations = (ArrayRow[])Arrays.copyOf(((Object []) (aarrayrow)), aarrayrow.length * 2);
	//   27   43:aload_0         
	//   28   44:aload           4
	//   29   46:aload           4
	//   30   48:arraylength     
	//   31   49:iconst_2        
	//   32   50:imul            
	//   33   51:invokestatic    #65  <Method Object[] Arrays.copyOf(Object[], int)>
	//   34   54:checkcast       #66  <Class ArrayRow[]>
	//   35   57:putfield        #48  <Field ArrayRow[] mClientEquations>
		aarrayrow = mClientEquations;
	//   36   60:aload_0         
	//   37   61:getfield        #48  <Field ArrayRow[] mClientEquations>
	//   38   64:astore          4
		i = mClientEquationsCount;
	//   39   66:aload_0         
	//   40   67:getfield        #50  <Field int mClientEquationsCount>
	//   41   70:istore_2        
		aarrayrow[i] = arrayrow;
	//   42   71:aload           4
	//   43   73:iload_2         
	//   44   74:aload_1         
	//   45   75:aastore         
		mClientEquationsCount = i + 1;
	//   46   76:aload_0         
	//   47   77:iload_2         
	//   48   78:iconst_1        
	//   49   79:iadd            
	//   50   80:putfield        #50  <Field int mClientEquationsCount>
	//   51   83:return          
	}

	public final void removeFromRow(ArrayRow arrayrow)
	{
		int k = mClientEquationsCount;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int mClientEquationsCount>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		for(int i = 0; i < k; i++)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_2         
	//*   8   11:iload           4
	//*   9   13:icmpge          81
			if(mClientEquations[i] == arrayrow)
	//*  10   16:aload_0         
	//*  11   17:getfield        #48  <Field ArrayRow[] mClientEquations>
	//*  12   20:iload_2         
	//*  13   21:aaload          
	//*  14   22:aload_1         
	//*  15   23:if_acmpne       74
			{
				for(; j < k - i - 1; j++)
	//*  16   26:iload_3         
	//*  17   27:iload           4
	//*  18   29:iload_2         
	//*  19   30:isub            
	//*  20   31:iconst_1        
	//*  21   32:isub            
	//*  22   33:icmpge          63
				{
					arrayrow = ((ArrayRow) (mClientEquations));
	//   23   36:aload_0         
	//   24   37:getfield        #48  <Field ArrayRow[] mClientEquations>
	//   25   40:astore_1        
					int l = i + j;
	//   26   41:iload_2         
	//   27   42:iload_3         
	//   28   43:iadd            
	//   29   44:istore          5
					arrayrow[l] = arrayrow[l + 1];
	//   30   46:aload_1         
	//   31   47:iload           5
	//   32   49:aload_1         
	//   33   50:iload           5
	//   34   52:iconst_1        
	//   35   53:iadd            
	//   36   54:aaload          
	//   37   55:aastore         
				}

	//   38   56:iload_3         
	//   39   57:iconst_1        
	//   40   58:iadd            
	//   41   59:istore_3        
	//*  42   60:goto            26
				mClientEquationsCount = mClientEquationsCount - 1;
	//   43   63:aload_0         
	//   44   64:aload_0         
	//   45   65:getfield        #50  <Field int mClientEquationsCount>
	//   46   68:iconst_1        
	//   47   69:isub            
	//   48   70:putfield        #50  <Field int mClientEquationsCount>
				return;
	//   49   73:return          
			}

	//   50   74:iload_2         
	//   51   75:iconst_1        
	//   52   76:iadd            
	//   53   77:istore_2        
	//*  54   78:goto            10
	//   55   81:return          
	}

	public void reset()
	{
		mName = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #70  <Field String mName>
		mType = Type.UNKNOWN;
	//    3    5:aload_0         
	//    4    6:getstatic       #73  <Field SolverVariable$Type SolverVariable$Type.UNKNOWN>
	//    5    9:putfield        #54  <Field SolverVariable$Type mType>
		strength = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #42  <Field int strength>
		id = -1;
	//    9   17:aload_0         
	//   10   18:iconst_m1       
	//   11   19:putfield        #38  <Field int id>
		definitionId = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #40  <Field int definitionId>
		computedValue = 0.0F;
	//   15   27:aload_0         
	//   16   28:fconst_0        
	//   17   29:putfield        #75  <Field float computedValue>
		mClientEquationsCount = 0;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #50  <Field int mClientEquationsCount>
		usageInRowCount = 0;
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:putfield        #52  <Field int usageInRowCount>
	//   24   42:return          
	}

	public void setType(Type type, String s)
	{
		mType = type;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field SolverVariable$Type mType>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #80  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("");
	//    4    8:aload_1         
	//    5    9:ldc1            #83  <String "">
	//    6   11:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mName);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #70  <Field String mName>
	//   11   20:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	public final void updateReferencesWithNewDefinition(ArrayRow arrayrow)
	{
		int j = mClientEquationsCount;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int mClientEquationsCount>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          39
			mClientEquations[i].variables.updateFromRow(mClientEquations[i], arrayrow, false);
	//    8   12:aload_0         
	//    9   13:getfield        #48  <Field ArrayRow[] mClientEquations>
	//   10   16:iload_2         
	//   11   17:aaload          
	//   12   18:getfield        #94  <Field ArrayLinkedVariables ArrayRow.variables>
	//   13   21:aload_0         
	//   14   22:getfield        #48  <Field ArrayRow[] mClientEquations>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:aload_1         
	//   18   28:iconst_0        
	//   19   29:invokevirtual   #100 <Method void ArrayLinkedVariables.updateFromRow(ArrayRow, ArrayRow, boolean)>

	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_2        
	//*  24   36:goto            7
		mClientEquationsCount = 0;
	//   25   39:aload_0         
	//   26   40:iconst_0        
	//   27   41:putfield        #50  <Field int mClientEquationsCount>
	//   28   44:return          
	}

	private static int uniqueConstantId = 1;
	private static int uniqueErrorId = 1;
	private static int uniqueId = 1;
	private static int uniqueSlackId = 1;
	private static int uniqueUnrestrictedId = 1;
	public float computedValue;
	int definitionId;
	public int id;
	ArrayRow mClientEquations[];
	int mClientEquationsCount;
	private String mName;
	Type mType;
	public int strength;
	float strengthVector[];
	public int usageInRowCount;

	static 
	{
	//    0    0:return          
	}
}
