// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget

public static final class ConstraintWidget$ContentAlignment extends Enum
{

	public static ConstraintWidget$ContentAlignment valueOf(String s)
	{
		return (ConstraintWidget$ContentAlignment)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintWidget$ContentAlignment, s);
	//    0    0:ldc1            #2   <Class ConstraintWidget$ContentAlignment>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ConstraintWidget$ContentAlignment>
	//    4    9:areturn         
	}

	public static ConstraintWidget$ContentAlignment[] values()
	{
		return (ConstraintWidget$ContentAlignment[])((ConstraintWidget$ContentAlignment []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field ConstraintWidget$ContentAlignment[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintWidget$ContentAlignment_3B_.clone()>
	//    2    6:checkcast       #62  <Class ConstraintWidget$ContentAlignment[]>
	//    3    9:areturn         
	}

	private static final ConstraintWidget$ContentAlignment $VALUES[];
	public static final ConstraintWidget$ContentAlignment BEGIN;
	public static final ConstraintWidget$ContentAlignment BOTTOM;
	public static final ConstraintWidget$ContentAlignment END;
	public static final ConstraintWidget$ContentAlignment LEFT;
	public static final ConstraintWidget$ContentAlignment MIDDLE;
	public static final ConstraintWidget$ContentAlignment RIGHT;
	public static final ConstraintWidget$ContentAlignment TOP;
	public static final ConstraintWidget$ContentAlignment VERTICAL_MIDDLE;

	static 
	{
		BEGIN = new ConstraintWidget$ContentAlignment("BEGIN", 0);
	//    0    0:new             #2   <Class ConstraintWidget$ContentAlignment>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "BEGIN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
	//    5   10:putstatic       #28  <Field ConstraintWidget$ContentAlignment BEGIN>
		MIDDLE = new ConstraintWidget$ContentAlignment("MIDDLE", 1);
	//    6   13:new             #2   <Class ConstraintWidget$ContentAlignment>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "MIDDLE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
	//   11   23:putstatic       #31  <Field ConstraintWidget$ContentAlignment MIDDLE>
		END = new ConstraintWidget$ContentAlignment("END", 2);
	//   12   26:new             #2   <Class ConstraintWidget$ContentAlignment>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "END">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
	//   17   36:putstatic       #34  <Field ConstraintWidget$ContentAlignment END>
		TOP = new ConstraintWidget$ContentAlignment("TOP", 3);
	//   18   39:new             #2   <Class ConstraintWidget$ContentAlignment>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "TOP">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
	//   23   49:putstatic       #37  <Field ConstraintWidget$ContentAlignment TOP>
		VERTICAL_MIDDLE = new ConstraintWidget$ContentAlignment("VERTICAL_MIDDLE", 4);
	//   24   52:new             #2   <Class ConstraintWidget$ContentAlignment>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "VERTICAL_MIDDLE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
	//   29   62:putstatic       #40  <Field ConstraintWidget$ContentAlignment VERTICAL_MIDDLE>
		BOTTOM = new ConstraintWidget$ContentAlignment("BOTTOM", 5);
	//   30   65:new             #2   <Class ConstraintWidget$ContentAlignment>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "BOTTOM">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
	//   35   75:putstatic       #43  <Field ConstraintWidget$ContentAlignment BOTTOM>
		LEFT = new ConstraintWidget$ContentAlignment("LEFT", 6);
	//   36   78:new             #2   <Class ConstraintWidget$ContentAlignment>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "LEFT">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
	//   41   89:putstatic       #46  <Field ConstraintWidget$ContentAlignment LEFT>
		RIGHT = new ConstraintWidget$ContentAlignment("RIGHT", 7);
	//   42   92:new             #2   <Class ConstraintWidget$ContentAlignment>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "RIGHT">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
	//   47  103:putstatic       #49  <Field ConstraintWidget$ContentAlignment RIGHT>
		$VALUES = (new ConstraintWidget$ContentAlignment[] {
			BEGIN, MIDDLE, END, TOP, VERTICAL_MIDDLE, BOTTOM, LEFT, RIGHT
		});
	//   48  106:bipush          8
	//   49  108:anewarray       ConstraintWidget$ContentAlignment[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:getstatic       #28  <Field ConstraintWidget$ContentAlignment BEGIN>
	//   53  116:aastore         
	//   54  117:dup             
	//   55  118:iconst_1        
	//   56  119:getstatic       #31  <Field ConstraintWidget$ContentAlignment MIDDLE>
	//   57  122:aastore         
	//   58  123:dup             
	//   59  124:iconst_2        
	//   60  125:getstatic       #34  <Field ConstraintWidget$ContentAlignment END>
	//   61  128:aastore         
	//   62  129:dup             
	//   63  130:iconst_3        
	//   64  131:getstatic       #37  <Field ConstraintWidget$ContentAlignment TOP>
	//   65  134:aastore         
	//   66  135:dup             
	//   67  136:iconst_4        
	//   68  137:getstatic       #40  <Field ConstraintWidget$ContentAlignment VERTICAL_MIDDLE>
	//   69  140:aastore         
	//   70  141:dup             
	//   71  142:iconst_5        
	//   72  143:getstatic       #43  <Field ConstraintWidget$ContentAlignment BOTTOM>
	//   73  146:aastore         
	//   74  147:dup             
	//   75  148:bipush          6
	//   76  150:getstatic       #46  <Field ConstraintWidget$ContentAlignment LEFT>
	//   77  153:aastore         
	//   78  154:dup             
	//   79  155:bipush          7
	//   80  157:getstatic       #49  <Field ConstraintWidget$ContentAlignment RIGHT>
	//   81  160:aastore         
	//   82  161:putstatic       #51  <Field ConstraintWidget$ContentAlignment[] $VALUES>
	//*  83  164:return          
	}

	private ConstraintWidget$ContentAlignment(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #53  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
