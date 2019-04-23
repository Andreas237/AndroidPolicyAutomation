// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import com.appboy.enums.inappmessage.ClickAction;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			AppboyInAppMessageViewLifecycleListener

static class AppboyInAppMessageViewLifecycleListener$2
{

	static final int $SwitchMap$com$appboy$enums$inappmessage$ClickAction[];

	static 
	{
		$SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[ClickAction.values().length];
	//    0    0:invokestatic    #18  <Method ClickAction[] ClickAction.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
		try
		{
			$SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NEWS_FEED.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
	//    5   12:getstatic       #24  <Field ClickAction ClickAction.NEWS_FEED>
	//    6   15:invokevirtual   #28  <Method int ClickAction.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
	//*  10   23:getstatic       #31  <Field ClickAction ClickAction.URI>
	//*  11   26:invokevirtual   #28  <Method int ClickAction.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
	//*  15   34:getstatic       #34  <Field ClickAction ClickAction.NONE>
	//*  16   37:invokevirtual   #28  <Method int ClickAction.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.URI.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NONE.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
