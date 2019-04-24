// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;


// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			ReflectorFactory

static class ReflectorFactory$1
{

	static final int $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType[];

	static 
	{
		$SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType = new int[Type.values().length];
	//    0    0:invokestatic    #18  <Method Reflector$ActionBarType[] Reflector$ActionBarType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType>
		try
		{
			$SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType[Type.STANDARD.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType>
	//    5   12:getstatic       #24  <Field Reflector$ActionBarType Reflector$ActionBarType.STANDARD>
	//    6   15:invokevirtual   #28  <Method int Reflector$ActionBarType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType>
	//*  10   23:getstatic       #31  <Field Reflector$ActionBarType Reflector$ActionBarType.APP_COMPAT>
	//*  11   26:invokevirtual   #28  <Method int Reflector$ActionBarType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType>
	//*  15   34:getstatic       #34  <Field Reflector$ActionBarType Reflector$ActionBarType.ACTIONBAR_SHERLOCK>
	//*  16   37:invokevirtual   #28  <Method int Reflector$ActionBarType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType[Type.APP_COMPAT.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$com$github$amlcurran$showcaseview$targets$Reflector$ActionBarType[Type.ACTIONBAR_SHERLOCK.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
