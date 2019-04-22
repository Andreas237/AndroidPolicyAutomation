// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import com.ibotta.android.mvp.ui.view.nav.NavButtonType;

// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpActivity

static class MvpActivity$2
{

	static final int $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[];

	static 
	{
		$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType = new int[NavButtonType.values().length];
	//    0    0:invokestatic    #18  <Method NavButtonType[] NavButtonType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.FEATURED.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
	//    5   12:getstatic       #24  <Field NavButtonType NavButtonType.FEATURED>
	//    6   15:invokevirtual   #28  <Method int NavButtonType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
	//*  10   23:getstatic       #31  <Field NavButtonType NavButtonType.FIND_REBATES>
	//*  11   26:invokevirtual   #28  <Method int NavButtonType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
	//*  15   34:getstatic       #34  <Field NavButtonType NavButtonType.REDEEM>
	//*  16   37:invokevirtual   #28  <Method int NavButtonType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
	//*  20   45:getstatic       #37  <Field NavButtonType NavButtonType.MY_REBATES>
	//*  21   48:invokevirtual   #28  <Method int NavButtonType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType>
	//*  25   56:getstatic       #40  <Field NavButtonType NavButtonType.ACCOUNT>
	//*  26   59:invokevirtual   #28  <Method int NavButtonType.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   30   65:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.FIND_REBATES.ordinal()] = 2;
		}
	//*  31   66:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   32   69:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.REDEEM.ordinal()] = 3;
		}
	//*  33   70:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   34   73:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.MY_REBATES.ordinal()] = 4;
		}
	//*  35   74:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   36   77:astore_0        
		try
		{
			$SwitchMap$com$ibotta$android$mvp$ui$view$nav$NavButtonType[NavButtonType.ACCOUNT.ordinal()] = 5;
		}
	//*  37   78:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   81:astore_0        
	//*  39   82:return          
	}
}
