// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//			MessengerShareContentUtility

static class MessengerShareContentUtility$1
{

	static final int $SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio[];
	static final int $SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType[];
	static final int $SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio[];

	static 
	{
		$SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType = new int[com.facebook.share.model.ent.MediaType.values().length];
	//    0    0:invokestatic    #20  <Method com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType[] com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #22  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType>
		try
		{
			$SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType[com.facebook.share.model.ent.MediaType.VIDEO.ordinal()] = 1;
	//    4    9:getstatic       #22  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType>
	//    5   12:getstatic       #26  <Field com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType.VIDEO>
	//    6   15:invokevirtual   #30  <Method int com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:invokestatic    #35  <Method com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio[] com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio.values()>
	//*  10   23:arraylength     
	//*  11   24:newarray        int[]
	//*  12   26:putstatic       #37  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio>
	//*  13   29:getstatic       #37  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio>
	//*  14   32:getstatic       #41  <Field com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio.SQUARE>
	//*  15   35:invokevirtual   #42  <Method int com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio.ordinal()>
	//*  16   38:iconst_1        
	//*  17   39:iastore         
	//*  18   40:invokestatic    #47  <Method com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio[] com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.values()>
	//*  19   43:arraylength     
	//*  20   44:newarray        int[]
	//*  21   46:putstatic       #49  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio>
	//*  22   49:getstatic       #49  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio>
	//*  23   52:getstatic       #53  <Field com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.WebviewHeightRatioCompact>
	//*  24   55:invokevirtual   #54  <Method int com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.ordinal()>
	//*  25   58:iconst_1        
	//*  26   59:iastore         
	//*  27   60:getstatic       #49  <Field int[] $SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio>
	//*  28   63:getstatic       #57  <Field com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.WebviewHeightRatioTall>
	//*  29   66:invokevirtual   #54  <Method int com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio.ordinal()>
	//*  30   69:iconst_2        
	//*  31   70:iastore         
	//*  32   71:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   33   72:astore_0        
		$SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio = new int[com.facebook.share.model.ntent.ImageAspectRatio.values().length];
		try
		{
			$SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio[com.facebook.share.model.ntent.ImageAspectRatio.SQUARE.ordinal()] = 1;
		}
	//*  34   73:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   35   76:astore_0        
		$SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio = new int[com.facebook.share.model.ebviewHeightRatio.values().length];
		try
		{
			$SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio[com.facebook.share.model.ebviewHeightRatio.WebviewHeightRatioCompact.ordinal()] = 1;
		}
	//*  36   77:goto            40
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   37   80:astore_0        
		try
		{
			$SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio[com.facebook.share.model.ebviewHeightRatio.WebviewHeightRatioTall.ordinal()] = 2;
		}
	//*  38   81:goto            60
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   39   84:astore_0        
	//*  40   85:return          
	}
}
