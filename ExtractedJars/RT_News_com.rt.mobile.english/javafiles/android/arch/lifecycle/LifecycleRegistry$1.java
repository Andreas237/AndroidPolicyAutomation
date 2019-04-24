// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			LifecycleRegistry

static class LifecycleRegistry$1
{

	static final int $SwitchMap$android$arch$lifecycle$Lifecycle$Event[];
	static final int $SwitchMap$android$arch$lifecycle$Lifecycle$State[];

	static 
	{
		$SwitchMap$android$arch$lifecycle$Lifecycle$State = new int[Lifecycle.State.values().length];
	//    0    0:invokestatic    #19  <Method Lifecycle$State[] Lifecycle$State.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.INITIALIZED.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
	//    5   12:getstatic       #25  <Field Lifecycle$State Lifecycle$State.INITIALIZED>
	//    6   15:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
	//*  10   23:getstatic       #32  <Field Lifecycle$State Lifecycle$State.CREATED>
	//*  11   26:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
	//*  15   34:getstatic       #35  <Field Lifecycle$State Lifecycle$State.STARTED>
	//*  16   37:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
	//*  20   45:getstatic       #38  <Field Lifecycle$State Lifecycle$State.RESUMED>
	//*  21   48:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$State>
	//*  25   56:getstatic       #41  <Field Lifecycle$State Lifecycle$State.DESTROYED>
	//*  26   59:invokevirtual   #29  <Method int Lifecycle$State.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:invokestatic    #46  <Method Lifecycle$Event[] Lifecycle$Event.values()>
	//*  30   67:arraylength     
	//*  31   68:newarray        int[]
	//*  32   70:putstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  33   73:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  34   76:getstatic       #52  <Field Lifecycle$Event Lifecycle$Event.ON_CREATE>
	//*  35   79:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
	//*  36   82:iconst_1        
	//*  37   83:iastore         
	//*  38   84:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  39   87:getstatic       #56  <Field Lifecycle$Event Lifecycle$Event.ON_STOP>
	//*  40   90:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
	//*  41   93:iconst_2        
	//*  42   94:iastore         
	//*  43   95:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  44   98:getstatic       #59  <Field Lifecycle$Event Lifecycle$Event.ON_START>
	//*  45  101:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
	//*  46  104:iconst_3        
	//*  47  105:iastore         
	//*  48  106:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  49  109:getstatic       #62  <Field Lifecycle$Event Lifecycle$Event.ON_PAUSE>
	//*  50  112:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
	//*  51  115:iconst_4        
	//*  52  116:iastore         
	//*  53  117:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  54  120:getstatic       #65  <Field Lifecycle$Event Lifecycle$Event.ON_RESUME>
	//*  55  123:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
	//*  56  126:iconst_5        
	//*  57  127:iastore         
	//*  58  128:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  59  131:getstatic       #68  <Field Lifecycle$Event Lifecycle$Event.ON_DESTROY>
	//*  60  134:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
	//*  61  137:bipush          6
	//*  62  139:iastore         
	//*  63  140:getstatic       #48  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  64  143:getstatic       #71  <Field Lifecycle$Event Lifecycle$Event.ON_ANY>
	//*  65  146:invokevirtual   #53  <Method int Lifecycle$Event.ordinal()>
	//*  66  149:bipush          7
	//*  67  151:iastore         
	//*  68  152:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   69  153:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.CREATED.ordinal()] = 2;
		}
	//*  70  154:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   71  157:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.STARTED.ordinal()] = 3;
		}
	//*  72  158:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   73  161:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.RESUMED.ordinal()] = 4;
		}
	//*  74  162:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   75  165:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$State[Lifecycle.State.DESTROYED.ordinal()] = 5;
		}
	//*  76  166:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   77  169:astore_0        
		$SwitchMap$android$arch$lifecycle$Lifecycle$Event = new int[Lifecycle.Event.values().length];
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
		}
	//*  78  170:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   79  173:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_STOP.ordinal()] = 2;
		}
	//*  80  174:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   81  177:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_START.ordinal()] = 3;
		}
	//*  82  178:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   83  181:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
		}
	//*  84  182:goto            106
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   85  185:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_RESUME.ordinal()] = 5;
		}
	//*  86  186:goto            117
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   87  189:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
		}
	//*  88  190:goto            128
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   89  193:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_ANY.ordinal()] = 7;
		}
	//*  90  194:goto            140
		catch(NoSuchFieldError nosuchfielderror11) { }
	//   91  197:astore_0        
	//*  92  198:return          
	}
}
