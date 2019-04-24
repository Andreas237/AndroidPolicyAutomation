// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			FacebookRequestErrorClassification

static class FacebookRequestErrorClassification$3
{

	static final int $SwitchMap$com$facebook$FacebookRequestError$Category[];

	static 
	{
		$SwitchMap$com$facebook$FacebookRequestError$Category = new int[com.facebook.FacebookRequestError.Category.values().length];
	//    0    0:invokestatic    #18  <Method com.facebook.FacebookRequestError$Category[] com.facebook.FacebookRequestError$Category.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$FacebookRequestError$Category>
		try
		{
			$SwitchMap$com$facebook$FacebookRequestError$Category[com.facebook.FacebookRequestError.Category.OTHER.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$FacebookRequestError$Category>
	//    5   12:getstatic       #24  <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.OTHER>
	//    6   15:invokevirtual   #28  <Method int com.facebook.FacebookRequestError$Category.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$FacebookRequestError$Category>
	//*  10   23:getstatic       #31  <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.LOGIN_RECOVERABLE>
	//*  11   26:invokevirtual   #28  <Method int com.facebook.FacebookRequestError$Category.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$FacebookRequestError$Category>
	//*  15   34:getstatic       #34  <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.TRANSIENT>
	//*  16   37:invokevirtual   #28  <Method int com.facebook.FacebookRequestError$Category.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$com$facebook$FacebookRequestError$Category[com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$com$facebook$FacebookRequestError$Category[com.facebook.FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
