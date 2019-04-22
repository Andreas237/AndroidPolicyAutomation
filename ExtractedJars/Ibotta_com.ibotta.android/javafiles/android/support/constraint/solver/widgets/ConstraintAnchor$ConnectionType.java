// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintAnchor

public static final class ConstraintAnchor$ConnectionType extends Enum
{

	public static ConstraintAnchor$ConnectionType valueOf(String s)
	{
		return (ConstraintAnchor$ConnectionType)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintAnchor$ConnectionType, s);
	//    0    0:ldc1            #2   <Class ConstraintAnchor$ConnectionType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ConstraintAnchor$ConnectionType>
	//    4    9:areturn         
	}

	public static ConstraintAnchor$ConnectionType[] values()
	{
		return (ConstraintAnchor$ConnectionType[])((ConstraintAnchor$ConnectionType []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field ConstraintAnchor$ConnectionType[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintAnchor$ConnectionType_3B_.clone()>
	//    2    6:checkcast       #38  <Class ConstraintAnchor$ConnectionType[]>
	//    3    9:areturn         
	}

	private static final ConstraintAnchor$ConnectionType $VALUES[];
	public static final ConstraintAnchor$ConnectionType RELAXED;
	public static final ConstraintAnchor$ConnectionType STRICT;

	static 
	{
		RELAXED = new ConstraintAnchor$ConnectionType("RELAXED", 0);
	//    0    0:new             #2   <Class ConstraintAnchor$ConnectionType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "RELAXED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void ConstraintAnchor$ConnectionType(String, int)>
	//    5   10:putstatic       #22  <Field ConstraintAnchor$ConnectionType RELAXED>
		STRICT = new ConstraintAnchor$ConnectionType("STRICT", 1);
	//    6   13:new             #2   <Class ConstraintAnchor$ConnectionType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "STRICT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void ConstraintAnchor$ConnectionType(String, int)>
	//   11   23:putstatic       #25  <Field ConstraintAnchor$ConnectionType STRICT>
		$VALUES = (new ConstraintAnchor$ConnectionType[] {
			RELAXED, STRICT
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       ConstraintAnchor$ConnectionType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field ConstraintAnchor$ConnectionType RELAXED>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field ConstraintAnchor$ConnectionType STRICT>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field ConstraintAnchor$ConnectionType[] $VALUES>
	//*  23   45:return          
	}

	private ConstraintAnchor$ConnectionType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
