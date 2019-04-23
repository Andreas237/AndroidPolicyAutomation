// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import com.appboy.enums.inappmessage.ClickAction;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			AppboyInAppMessageSlideupView

static class AppboyInAppMessageSlideupView$1
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
			$SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NONE.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
	//    5   12:getstatic       #24  <Field ClickAction ClickAction.NONE>
	//    6   15:invokevirtual   #28  <Method int ClickAction.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
	//    9   20:return          
		}
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   21:astore_0        
	//*  11   22:return          
	}
}
