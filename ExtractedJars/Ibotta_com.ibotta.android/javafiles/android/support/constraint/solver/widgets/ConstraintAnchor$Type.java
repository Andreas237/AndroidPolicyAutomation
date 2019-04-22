// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintAnchor

public static final class ConstraintAnchor$Type extends Enum
{

	public static ConstraintAnchor$Type valueOf(String s)
	{
		return (ConstraintAnchor$Type)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintAnchor$Type, s);
	//    0    0:ldc1            #2   <Class ConstraintAnchor$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ConstraintAnchor$Type>
	//    4    9:areturn         
	}

	public static ConstraintAnchor$Type[] values()
	{
		return (ConstraintAnchor$Type[])((ConstraintAnchor$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #55  <Field ConstraintAnchor$Type[] $VALUES>
	//    1    3:invokevirtual   #70  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintAnchor$Type_3B_.clone()>
	//    2    6:checkcast       #66  <Class ConstraintAnchor$Type[]>
	//    3    9:areturn         
	}

	private static final ConstraintAnchor$Type $VALUES[];
	public static final ConstraintAnchor$Type BASELINE;
	public static final ConstraintAnchor$Type BOTTOM;
	public static final ConstraintAnchor$Type CENTER;
	public static final ConstraintAnchor$Type CENTER_X;
	public static final ConstraintAnchor$Type CENTER_Y;
	public static final ConstraintAnchor$Type LEFT;
	public static final ConstraintAnchor$Type NONE;
	public static final ConstraintAnchor$Type RIGHT;
	public static final ConstraintAnchor$Type TOP;

	static 
	{
		NONE = new ConstraintAnchor$Type("NONE", 0);
	//    0    0:new             #2   <Class ConstraintAnchor$Type>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
	//    5   10:putstatic       #29  <Field ConstraintAnchor$Type NONE>
		LEFT = new ConstraintAnchor$Type("LEFT", 1);
	//    6   13:new             #2   <Class ConstraintAnchor$Type>
	//    7   16:dup             
	//    8   17:ldc1            #30  <String "LEFT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
	//   11   23:putstatic       #32  <Field ConstraintAnchor$Type LEFT>
		TOP = new ConstraintAnchor$Type("TOP", 2);
	//   12   26:new             #2   <Class ConstraintAnchor$Type>
	//   13   29:dup             
	//   14   30:ldc1            #33  <String "TOP">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
	//   17   36:putstatic       #35  <Field ConstraintAnchor$Type TOP>
		RIGHT = new ConstraintAnchor$Type("RIGHT", 3);
	//   18   39:new             #2   <Class ConstraintAnchor$Type>
	//   19   42:dup             
	//   20   43:ldc1            #36  <String "RIGHT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
	//   23   49:putstatic       #38  <Field ConstraintAnchor$Type RIGHT>
		BOTTOM = new ConstraintAnchor$Type("BOTTOM", 4);
	//   24   52:new             #2   <Class ConstraintAnchor$Type>
	//   25   55:dup             
	//   26   56:ldc1            #39  <String "BOTTOM">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
	//   29   62:putstatic       #41  <Field ConstraintAnchor$Type BOTTOM>
		BASELINE = new ConstraintAnchor$Type("BASELINE", 5);
	//   30   65:new             #2   <Class ConstraintAnchor$Type>
	//   31   68:dup             
	//   32   69:ldc1            #42  <String "BASELINE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
	//   35   75:putstatic       #44  <Field ConstraintAnchor$Type BASELINE>
		CENTER = new ConstraintAnchor$Type("CENTER", 6);
	//   36   78:new             #2   <Class ConstraintAnchor$Type>
	//   37   81:dup             
	//   38   82:ldc1            #45  <String "CENTER">
	//   39   84:bipush          6
	//   40   86:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
	//   41   89:putstatic       #47  <Field ConstraintAnchor$Type CENTER>
		CENTER_X = new ConstraintAnchor$Type("CENTER_X", 7);
	//   42   92:new             #2   <Class ConstraintAnchor$Type>
	//   43   95:dup             
	//   44   96:ldc1            #48  <String "CENTER_X">
	//   45   98:bipush          7
	//   46  100:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
	//   47  103:putstatic       #50  <Field ConstraintAnchor$Type CENTER_X>
		CENTER_Y = new ConstraintAnchor$Type("CENTER_Y", 8);
	//   48  106:new             #2   <Class ConstraintAnchor$Type>
	//   49  109:dup             
	//   50  110:ldc1            #51  <String "CENTER_Y">
	//   51  112:bipush          8
	//   52  114:invokespecial   #27  <Method void ConstraintAnchor$Type(String, int)>
	//   53  117:putstatic       #53  <Field ConstraintAnchor$Type CENTER_Y>
		$VALUES = (new ConstraintAnchor$Type[] {
			NONE, LEFT, TOP, RIGHT, BOTTOM, BASELINE, CENTER, CENTER_X, CENTER_Y
		});
	//   54  120:bipush          9
	//   55  122:anewarray       ConstraintAnchor$Type[]
	//   56  125:dup             
	//   57  126:iconst_0        
	//   58  127:getstatic       #29  <Field ConstraintAnchor$Type NONE>
	//   59  130:aastore         
	//   60  131:dup             
	//   61  132:iconst_1        
	//   62  133:getstatic       #32  <Field ConstraintAnchor$Type LEFT>
	//   63  136:aastore         
	//   64  137:dup             
	//   65  138:iconst_2        
	//   66  139:getstatic       #35  <Field ConstraintAnchor$Type TOP>
	//   67  142:aastore         
	//   68  143:dup             
	//   69  144:iconst_3        
	//   70  145:getstatic       #38  <Field ConstraintAnchor$Type RIGHT>
	//   71  148:aastore         
	//   72  149:dup             
	//   73  150:iconst_4        
	//   74  151:getstatic       #41  <Field ConstraintAnchor$Type BOTTOM>
	//   75  154:aastore         
	//   76  155:dup             
	//   77  156:iconst_5        
	//   78  157:getstatic       #44  <Field ConstraintAnchor$Type BASELINE>
	//   79  160:aastore         
	//   80  161:dup             
	//   81  162:bipush          6
	//   82  164:getstatic       #47  <Field ConstraintAnchor$Type CENTER>
	//   83  167:aastore         
	//   84  168:dup             
	//   85  169:bipush          7
	//   86  171:getstatic       #50  <Field ConstraintAnchor$Type CENTER_X>
	//   87  174:aastore         
	//   88  175:dup             
	//   89  176:bipush          8
	//   90  178:getstatic       #53  <Field ConstraintAnchor$Type CENTER_Y>
	//   91  181:aastore         
	//   92  182:putstatic       #55  <Field ConstraintAnchor$Type[] $VALUES>
	//*  93  185:return          
	}

	private ConstraintAnchor$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #57  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
