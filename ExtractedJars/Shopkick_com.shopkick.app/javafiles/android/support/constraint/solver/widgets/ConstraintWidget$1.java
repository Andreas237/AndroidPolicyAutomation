// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;


// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget

static class ConstraintWidget$1
{

	static final int $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[];
	static final int $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[];

	static 
	{
		$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour = new int[mensionBehaviour.values().length];
	//    0    0:invokestatic    #19  <Method ConstraintWidget$DimensionBehaviour[] ConstraintWidget$DimensionBehaviour.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[mensionBehaviour.FIXED.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
	//    5   12:getstatic       #25  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//    6   15:invokevirtual   #29  <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
	//*  10   23:getstatic       #32  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  11   26:invokevirtual   #29  <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
	//*  15   34:getstatic       #35  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_PARENT>
	//*  16   37:invokevirtual   #29  <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
	//*  20   45:getstatic       #38  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  21   48:invokevirtual   #29  <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #43  <Method ConstraintAnchor$Type[] ConstraintAnchor$Type.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  28   62:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  29   65:getstatic       #49  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//*  30   68:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  34   76:getstatic       #53  <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//*  35   79:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  39   87:getstatic       #56  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//*  40   90:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
	//*  41   93:iconst_3        
	//*  42   94:iastore         
	//*  43   95:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  44   98:getstatic       #59  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//*  45  101:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
	//*  46  104:iconst_4        
	//*  47  105:iastore         
	//*  48  106:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  49  109:getstatic       #62  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//*  50  112:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
	//*  51  115:iconst_5        
	//*  52  116:iastore         
	//*  53  117:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  54  120:getstatic       #65  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//*  55  123:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
	//*  56  126:bipush          6
	//*  57  128:iastore         
	//*  58  129:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  59  132:getstatic       #68  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//*  60  135:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
	//*  61  138:bipush          7
	//*  62  140:iastore         
	//*  63  141:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  64  144:getstatic       #71  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//*  65  147:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
	//*  66  150:bipush          8
	//*  67  152:iastore         
	//*  68  153:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*  69  156:getstatic       #74  <Field ConstraintAnchor$Type ConstraintAnchor$Type.NONE>
	//*  70  159:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
	//*  71  162:bipush          9
	//*  72  164:iastore         
	//*  73  165:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   74  166:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[mensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
		}
	//*  75  167:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   76  170:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[mensionBehaviour.MATCH_PARENT.ordinal()] = 3;
		}
	//*  77  171:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   78  174:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[mensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
		}
	//*  79  175:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   80  178:astore_0        
		$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type = new int[pe.values().length];
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[pe.LEFT.ordinal()] = 1;
		}
	//*  81  179:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   82  182:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[pe.TOP.ordinal()] = 2;
		}
	//*  83  183:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   84  186:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[pe.RIGHT.ordinal()] = 3;
		}
	//*  85  187:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   86  190:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[pe.BOTTOM.ordinal()] = 4;
		}
	//*  87  191:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   88  194:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[pe.BASELINE.ordinal()] = 5;
		}
	//*  89  195:goto            106
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   90  198:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[pe.CENTER.ordinal()] = 6;
		}
	//*  91  199:goto            117
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   92  202:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[pe.CENTER_X.ordinal()] = 7;
		}
	//*  93  203:goto            129
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   94  206:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[pe.CENTER_Y.ordinal()] = 8;
		}
	//*  95  207:goto            141
		catch(NoSuchFieldError nosuchfielderror11) { }
	//   96  210:astore_0        
		try
		{
			$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[pe.NONE.ordinal()] = 9;
		}
	//*  97  211:goto            153
		catch(NoSuchFieldError nosuchfielderror12) { }
	//   98  214:astore_0        
	//*  99  215:return          
	}
}
