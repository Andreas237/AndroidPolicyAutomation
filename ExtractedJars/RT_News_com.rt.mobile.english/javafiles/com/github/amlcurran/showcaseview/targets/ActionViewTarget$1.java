// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;


// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			ActionViewTarget

static class ActionViewTarget$1
{

	static final int $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[];

	static 
	{
		$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type = new int[pe.values().length];
	//    0    0:invokestatic    #18  <Method ActionViewTarget$Type[] ActionViewTarget$Type.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
		try
		{
			$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[pe.SPINNER.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
	//    5   12:getstatic       #24  <Field ActionViewTarget$Type ActionViewTarget$Type.SPINNER>
	//    6   15:invokevirtual   #28  <Method int ActionViewTarget$Type.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
	//*  10   23:getstatic       #31  <Field ActionViewTarget$Type ActionViewTarget$Type.HOME>
	//*  11   26:invokevirtual   #28  <Method int ActionViewTarget$Type.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
	//*  15   34:getstatic       #34  <Field ActionViewTarget$Type ActionViewTarget$Type.OVERFLOW>
	//*  16   37:invokevirtual   #28  <Method int ActionViewTarget$Type.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type>
	//*  20   45:getstatic       #37  <Field ActionViewTarget$Type ActionViewTarget$Type.TITLE>
	//*  21   48:invokevirtual   #28  <Method int ActionViewTarget$Type.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   25   54:astore_0        
		try
		{
			$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[pe.HOME.ordinal()] = 2;
		}
	//*  26   55:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   27   58:astore_0        
		try
		{
			$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[pe.OVERFLOW.ordinal()] = 3;
		}
	//*  28   59:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   29   62:astore_0        
		try
		{
			$SwitchMap$com$github$amlcurran$showcaseview$targets$ActionViewTarget$Type[pe.TITLE.ordinal()] = 4;
		}
	//*  30   63:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
