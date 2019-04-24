// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;


// Referenced classes of package io.fabric.sdk.android.services.network:
//			DefaultHttpRequestFactory, HttpMethod

static class DefaultHttpRequestFactory$1
{

	static final int $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[];

	static 
	{
		$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod = new int[HttpMethod.values().length];
	//    0    0:invokestatic    #18  <Method HttpMethod[] HttpMethod.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
		try
		{
			$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.GET.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
	//    5   12:getstatic       #24  <Field HttpMethod HttpMethod.GET>
	//    6   15:invokevirtual   #28  <Method int HttpMethod.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
	//*  10   23:getstatic       #31  <Field HttpMethod HttpMethod.POST>
	//*  11   26:invokevirtual   #28  <Method int HttpMethod.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
	//*  15   34:getstatic       #34  <Field HttpMethod HttpMethod.PUT>
	//*  16   37:invokevirtual   #28  <Method int HttpMethod.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
	//*  20   45:getstatic       #37  <Field HttpMethod HttpMethod.DELETE>
	//*  21   48:invokevirtual   #28  <Method int HttpMethod.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:return          
	//*  25   54:astore_0        
	//*  26   55:return          
	//*  27   56:astore_0        
	//*  28   57:goto            42
	//*  29   60:astore_0        
	//*  30   61:goto            31
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   64:astore_0        
		try
		{
			$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.POST.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.PUT.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.DELETE.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  32   65:goto            20
	}
}
