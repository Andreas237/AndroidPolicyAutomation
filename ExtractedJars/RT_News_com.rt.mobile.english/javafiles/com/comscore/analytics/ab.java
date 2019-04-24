// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//			SessionState, ApplicationState

class ab
{

	static final int a[];
	static final int b[];

	static 
	{
		b = new int[SessionState.values().length];
	//    0    0:invokestatic    #17  <Method SessionState[] SessionState.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #19  <Field int[] b>
		try
		{
			b[SessionState.ACTIVE_USER.ordinal()] = 1;
	//    4    9:getstatic       #19  <Field int[] b>
	//    5   12:getstatic       #23  <Field SessionState SessionState.ACTIVE_USER>
	//    6   15:invokevirtual   #27  <Method int SessionState.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #19  <Field int[] b>
	//*  10   23:getstatic       #30  <Field SessionState SessionState.USER>
	//*  11   26:invokevirtual   #27  <Method int SessionState.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #19  <Field int[] b>
	//*  15   34:getstatic       #33  <Field SessionState SessionState.APPLICATION>
	//*  16   37:invokevirtual   #27  <Method int SessionState.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #19  <Field int[] b>
	//*  20   45:getstatic       #36  <Field SessionState SessionState.INACTIVE>
	//*  21   48:invokevirtual   #27  <Method int SessionState.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #41  <Method ApplicationState[] ApplicationState.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #43  <Field int[] a>
	//*  28   62:getstatic       #43  <Field int[] a>
	//*  29   65:getstatic       #46  <Field ApplicationState ApplicationState.INACTIVE>
	//*  30   68:invokevirtual   #47  <Method int ApplicationState.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #43  <Field int[] a>
	//*  34   76:getstatic       #50  <Field ApplicationState ApplicationState.BACKGROUND_UX_ACTIVE>
	//*  35   79:invokevirtual   #47  <Method int ApplicationState.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:getstatic       #43  <Field int[] a>
	//*  39   87:getstatic       #53  <Field ApplicationState ApplicationState.FOREGROUND>
	//*  40   90:invokevirtual   #47  <Method int ApplicationState.ordinal()>
	//*  41   93:iconst_3        
	//*  42   94:iastore         
	//*  43   95:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   44   96:astore_0        
		try
		{
			b[SessionState.USER.ordinal()] = 2;
		}
	//*  45   97:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   46  100:astore_0        
		try
		{
			b[SessionState.APPLICATION.ordinal()] = 3;
		}
	//*  47  101:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   48  104:astore_0        
		try
		{
			b[SessionState.INACTIVE.ordinal()] = 4;
		}
	//*  49  105:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   50  108:astore_0        
		a = new int[ApplicationState.values().length];
		try
		{
			a[ApplicationState.INACTIVE.ordinal()] = 1;
		}
	//*  51  109:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   52  112:astore_0        
		try
		{
			a[ApplicationState.BACKGROUND_UX_ACTIVE.ordinal()] = 2;
		}
	//*  53  113:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   54  116:astore_0        
		try
		{
			a[ApplicationState.FOREGROUND.ordinal()] = 3;
		}
	//*  55  117:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   56  120:astore_0        
	//*  57  121:return          
	}
}
