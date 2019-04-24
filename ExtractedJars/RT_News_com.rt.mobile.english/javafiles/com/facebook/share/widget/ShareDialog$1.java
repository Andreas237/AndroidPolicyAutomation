// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//			ShareDialog

static class ShareDialog$1
{

	static final int $SwitchMap$com$facebook$share$widget$ShareDialog$Mode[];

	static 
	{
		$SwitchMap$com$facebook$share$widget$ShareDialog$Mode = new int[de.values().length];
	//    0    0:invokestatic    #18  <Method ShareDialog$Mode[] ShareDialog$Mode.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
		try
		{
			$SwitchMap$com$facebook$share$widget$ShareDialog$Mode[de.AUTOMATIC.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
	//    5   12:getstatic       #24  <Field ShareDialog$Mode ShareDialog$Mode.AUTOMATIC>
	//    6   15:invokevirtual   #28  <Method int ShareDialog$Mode.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
	//*  10   23:getstatic       #31  <Field ShareDialog$Mode ShareDialog$Mode.WEB>
	//*  11   26:invokevirtual   #28  <Method int ShareDialog$Mode.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$ShareDialog$Mode>
	//*  15   34:getstatic       #34  <Field ShareDialog$Mode ShareDialog$Mode.NATIVE>
	//*  16   37:invokevirtual   #28  <Method int ShareDialog$Mode.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$com$facebook$share$widget$ShareDialog$Mode[de.WEB.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$com$facebook$share$widget$ShareDialog$Mode[de.NATIVE.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
