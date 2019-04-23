// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintAnchor

public static final class ConstraintAnchor$Strength extends Enum
{

	public static ConstraintAnchor$Strength valueOf(String s)
	{
		return (ConstraintAnchor$Strength)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintAnchor$Strength, s);
	//    0    0:ldc1            #2   <Class ConstraintAnchor$Strength>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ConstraintAnchor$Strength>
	//    4    9:areturn         
	}

	public static ConstraintAnchor$Strength[] values()
	{
		return (ConstraintAnchor$Strength[])((ConstraintAnchor$Strength []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field ConstraintAnchor$Strength[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintAnchor$Strength_3B_.clone()>
	//    2    6:checkcast       #42  <Class ConstraintAnchor$Strength[]>
	//    3    9:areturn         
	}

	private static final ConstraintAnchor$Strength $VALUES[];
	public static final ConstraintAnchor$Strength NONE;
	public static final ConstraintAnchor$Strength STRONG;
	public static final ConstraintAnchor$Strength WEAK;

	static 
	{
		NONE = new ConstraintAnchor$Strength("NONE", 0);
	//    0    0:new             #2   <Class ConstraintAnchor$Strength>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ConstraintAnchor$Strength(String, int)>
	//    5   10:putstatic       #23  <Field ConstraintAnchor$Strength NONE>
		STRONG = new ConstraintAnchor$Strength("STRONG", 1);
	//    6   13:new             #2   <Class ConstraintAnchor$Strength>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "STRONG">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ConstraintAnchor$Strength(String, int)>
	//   11   23:putstatic       #26  <Field ConstraintAnchor$Strength STRONG>
		WEAK = new ConstraintAnchor$Strength("WEAK", 2);
	//   12   26:new             #2   <Class ConstraintAnchor$Strength>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "WEAK">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ConstraintAnchor$Strength(String, int)>
	//   17   36:putstatic       #29  <Field ConstraintAnchor$Strength WEAK>
		$VALUES = (new ConstraintAnchor$Strength[] {
			NONE, STRONG, WEAK
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ConstraintAnchor$Strength[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field ConstraintAnchor$Strength NONE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field ConstraintAnchor$Strength STRONG>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field ConstraintAnchor$Strength WEAK>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field ConstraintAnchor$Strength[] $VALUES>
	//*  33   64:return          
	}

	private ConstraintAnchor$Strength(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
