// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;


// Referenced classes of package android.support.constraint.solver:
//			SolverVariable

public static final class SolverVariable$Type extends Enum
{

	public static SolverVariable$Type valueOf(String s)
	{
		return (SolverVariable$Type)Enum.valueOf(android/support/constraint/solver/SolverVariable$Type, s);
	//    0    0:ldc1            #2   <Class SolverVariable$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SolverVariable$Type>
	//    4    9:areturn         
	}

	public static SolverVariable$Type[] values()
	{
		return (SolverVariable$Type[])((SolverVariable$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field SolverVariable$Type[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Landroid.support.constraint.solver.SolverVariable$Type_3B_.clone()>
	//    2    6:checkcast       #50  <Class SolverVariable$Type[]>
	//    3    9:areturn         
	}

	private static final SolverVariable$Type $VALUES[];
	public static final SolverVariable$Type CONSTANT;
	public static final SolverVariable$Type ERROR;
	public static final SolverVariable$Type SLACK;
	public static final SolverVariable$Type UNKNOWN;
	public static final SolverVariable$Type UNRESTRICTED;

	static 
	{
		UNRESTRICTED = new SolverVariable$Type("UNRESTRICTED", 0);
	//    0    0:new             #2   <Class SolverVariable$Type>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "UNRESTRICTED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
	//    5   10:putstatic       #25  <Field SolverVariable$Type UNRESTRICTED>
		CONSTANT = new SolverVariable$Type("CONSTANT", 1);
	//    6   13:new             #2   <Class SolverVariable$Type>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "CONSTANT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
	//   11   23:putstatic       #28  <Field SolverVariable$Type CONSTANT>
		SLACK = new SolverVariable$Type("SLACK", 2);
	//   12   26:new             #2   <Class SolverVariable$Type>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "SLACK">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
	//   17   36:putstatic       #31  <Field SolverVariable$Type SLACK>
		ERROR = new SolverVariable$Type("ERROR", 3);
	//   18   39:new             #2   <Class SolverVariable$Type>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "ERROR">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
	//   23   49:putstatic       #34  <Field SolverVariable$Type ERROR>
		UNKNOWN = new SolverVariable$Type("UNKNOWN", 4);
	//   24   52:new             #2   <Class SolverVariable$Type>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "UNKNOWN">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
	//   29   62:putstatic       #37  <Field SolverVariable$Type UNKNOWN>
		$VALUES = (new SolverVariable$Type[] {
			UNRESTRICTED, CONSTANT, SLACK, ERROR, UNKNOWN
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       SolverVariable$Type[]
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

	private SolverVariable$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
