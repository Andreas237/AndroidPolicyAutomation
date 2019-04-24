// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;


// Referenced classes of package com.gigya.socialize.android:
//			GSWebBridge

static class GSWebBridge$8
{

	static final int $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[];

	static 
	{
		$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions = new int[WebBridgeActions.values().length];
	//    0    0:invokestatic    #18  <Method GSWebBridge$GSWebBridgeActions[] GSWebBridge$GSWebBridgeActions.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
		try
		{
			$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[WebBridgeActions.IS_SESSION_VALID.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
	//    5   12:getstatic       #24  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.IS_SESSION_VALID>
	//    6   15:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
	//*  10   23:getstatic       #31  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.SEND_REQUEST>
	//*  11   26:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
	//*  15   34:getstatic       #34  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.SEND_OAUTH_REQUEST>
	//*  16   37:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
	//*  20   45:getstatic       #37  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.GET_IDS>
	//*  21   48:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
	//*  25   56:getstatic       #40  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.ON_PLUGIN_EVENT>
	//*  26   59:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
	//*  30   67:getstatic       #43  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.REGISTER_FOR_NAMESPACE_EVENTS>
	//*  31   70:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   35   77:astore_0        
		try
		{
			$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[WebBridgeActions.SEND_REQUEST.ordinal()] = 2;
		}
	//*  36   78:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   37   81:astore_0        
		try
		{
			$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[WebBridgeActions.SEND_OAUTH_REQUEST.ordinal()] = 3;
		}
	//*  38   82:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   39   85:astore_0        
		try
		{
			$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[WebBridgeActions.GET_IDS.ordinal()] = 4;
		}
	//*  40   86:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   41   89:astore_0        
		try
		{
			$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[WebBridgeActions.ON_PLUGIN_EVENT.ordinal()] = 5;
		}
	//*  42   90:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   43   93:astore_0        
		try
		{
			$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[WebBridgeActions.REGISTER_FOR_NAMESPACE_EVENTS.ordinal()] = 6;
		}
	//*  44   94:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   45   97:astore_0        
	//*  46   98:return          
	}
}
