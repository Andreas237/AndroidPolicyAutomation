// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			FullLifecycleObserverAdapter

static class FullLifecycleObserverAdapter$1
{

	static final int $SwitchMap$android$arch$lifecycle$Lifecycle$Event[];

	static 
	{
		$SwitchMap$android$arch$lifecycle$Lifecycle$Event = new int[Lifecycle.Event.values().length];
	//    0    0:invokestatic    #18  <Method Lifecycle$Event[] Lifecycle$Event.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//    5   12:getstatic       #24  <Field Lifecycle$Event Lifecycle$Event.ON_CREATE>
	//    6   15:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  10   23:getstatic       #31  <Field Lifecycle$Event Lifecycle$Event.ON_START>
	//*  11   26:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  15   34:getstatic       #34  <Field Lifecycle$Event Lifecycle$Event.ON_RESUME>
	//*  16   37:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  20   45:getstatic       #37  <Field Lifecycle$Event Lifecycle$Event.ON_PAUSE>
	//*  21   48:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  25   56:getstatic       #40  <Field Lifecycle$Event Lifecycle$Event.ON_STOP>
	//*  26   59:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  30   67:getstatic       #43  <Field Lifecycle$Event Lifecycle$Event.ON_DESTROY>
	//*  31   70:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] $SwitchMap$android$arch$lifecycle$Lifecycle$Event>
	//*  35   79:getstatic       #46  <Field Lifecycle$Event Lifecycle$Event.ON_ANY>
	//*  36   82:invokevirtual   #28  <Method int Lifecycle$Event.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   40   89:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_START.ordinal()] = 2;
		}
	//*  41   90:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   42   93:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
		}
	//*  43   94:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   44   97:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
		}
	//*  45   98:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   46  101:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_STOP.ordinal()] = 5;
		}
	//*  47  102:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   48  105:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
		}
	//*  49  106:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   50  109:astore_0        
		try
		{
			$SwitchMap$android$arch$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_ANY.ordinal()] = 7;
		}
	//*  51  110:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   52  113:astore_0        
	//*  53  114:return          
	}
}
