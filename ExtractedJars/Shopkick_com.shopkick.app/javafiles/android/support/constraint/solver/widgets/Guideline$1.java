// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


// Referenced classes of package android.support.constraint.solver.widgets:
//			Guideline

static class Guideline$1
{

	static final int $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[];

	static 
	{
		$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type = new int[chor.Type.values().length];
	//    0    0:invokestatic    #18  <Method ConstraintAnchor$Type[] ConstraintAnchor$Type.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[chor.Type.LEFT.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//    5   12:getstatic       #24  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//    6   15:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  10   23:getstatic       #31  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//*  11   26:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  15   34:getstatic       #34  <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//*  16   37:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  20   45:getstatic       #37  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//*  21   48:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  25   56:getstatic       #40  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//*  26   59:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  30   67:getstatic       #43  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//*  31   70:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  35   79:getstatic       #46  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//*  36   82:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  40   91:getstatic       #49  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//*  41   94:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  45  103:getstatic       #52  <Field ConstraintAnchor$Type ConstraintAnchor$Type.NONE>
	//*  46  106:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   50  113:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[chor.Type.RIGHT.ordinal()] = 2;
		}
	//*  51  114:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   52  117:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[chor.Type.TOP.ordinal()] = 3;
		}
	//*  53  118:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   54  121:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[chor.Type.BOTTOM.ordinal()] = 4;
		}
	//*  55  122:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   56  125:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[chor.Type.BASELINE.ordinal()] = 5;
		}
	//*  57  126:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   58  129:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[chor.Type.CENTER.ordinal()] = 6;
		}
	//*  59  130:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   60  133:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[chor.Type.CENTER_X.ordinal()] = 7;
		}
	//*  61  134:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   62  137:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[chor.Type.CENTER_Y.ordinal()] = 8;
		}
	//*  63  138:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   64  141:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[chor.Type.NONE.ordinal()] = 9;
		}
	//*  65  142:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   66  145:astore_0        
	//*  67  146:return          
	}
}
