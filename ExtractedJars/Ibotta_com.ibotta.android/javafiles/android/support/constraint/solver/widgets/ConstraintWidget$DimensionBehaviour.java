// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget

public static final class ConstraintWidget$DimensionBehaviour extends Enum
{

	public static ConstraintWidget$DimensionBehaviour valueOf(String s)
	{
		return (ConstraintWidget$DimensionBehaviour)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintWidget$DimensionBehaviour, s);
	//    0    0:ldc1            #2   <Class ConstraintWidget$DimensionBehaviour>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ConstraintWidget$DimensionBehaviour>
	//    4    9:areturn         
	}

	public static ConstraintWidget$DimensionBehaviour[] values()
	{
		return (ConstraintWidget$DimensionBehaviour[])((ConstraintWidget$DimensionBehaviour []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field ConstraintWidget$DimensionBehaviour[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour_3B_.clone()>
	//    2    6:checkcast       #46  <Class ConstraintWidget$DimensionBehaviour[]>
	//    3    9:areturn         
	}

	private static final ConstraintWidget$DimensionBehaviour $VALUES[];
	public static final ConstraintWidget$DimensionBehaviour FIXED;
	public static final ConstraintWidget$DimensionBehaviour MATCH_CONSTRAINT;
	public static final ConstraintWidget$DimensionBehaviour MATCH_PARENT;
	public static final ConstraintWidget$DimensionBehaviour WRAP_CONTENT;

	static 
	{
		FIXED = new ConstraintWidget$DimensionBehaviour("FIXED", 0);
	//    0    0:new             #2   <Class ConstraintWidget$DimensionBehaviour>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "FIXED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void ConstraintWidget$DimensionBehaviour(String, int)>
	//    5   10:putstatic       #24  <Field ConstraintWidget$DimensionBehaviour FIXED>
		WRAP_CONTENT = new ConstraintWidget$DimensionBehaviour("WRAP_CONTENT", 1);
	//    6   13:new             #2   <Class ConstraintWidget$DimensionBehaviour>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "WRAP_CONTENT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void ConstraintWidget$DimensionBehaviour(String, int)>
	//   11   23:putstatic       #27  <Field ConstraintWidget$DimensionBehaviour WRAP_CONTENT>
		MATCH_CONSTRAINT = new ConstraintWidget$DimensionBehaviour("MATCH_CONSTRAINT", 2);
	//   12   26:new             #2   <Class ConstraintWidget$DimensionBehaviour>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "MATCH_CONSTRAINT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void ConstraintWidget$DimensionBehaviour(String, int)>
	//   17   36:putstatic       #30  <Field ConstraintWidget$DimensionBehaviour MATCH_CONSTRAINT>
		MATCH_PARENT = new ConstraintWidget$DimensionBehaviour("MATCH_PARENT", 3);
	//   18   39:new             #2   <Class ConstraintWidget$DimensionBehaviour>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "MATCH_PARENT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void ConstraintWidget$DimensionBehaviour(String, int)>
	//   23   49:putstatic       #33  <Field ConstraintWidget$DimensionBehaviour MATCH_PARENT>
		$VALUES = (new ConstraintWidget$DimensionBehaviour[] {
			FIXED, WRAP_CONTENT, MATCH_CONSTRAINT, MATCH_PARENT
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       ConstraintWidget$DimensionBehaviour[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field ConstraintWidget$DimensionBehaviour FIXED>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field ConstraintWidget$DimensionBehaviour WRAP_CONTENT>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field ConstraintWidget$DimensionBehaviour MATCH_CONSTRAINT>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field ConstraintWidget$DimensionBehaviour MATCH_PARENT>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field ConstraintWidget$DimensionBehaviour[] $VALUES>
	//*  43   83:return          
	}

	private ConstraintWidget$DimensionBehaviour(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
