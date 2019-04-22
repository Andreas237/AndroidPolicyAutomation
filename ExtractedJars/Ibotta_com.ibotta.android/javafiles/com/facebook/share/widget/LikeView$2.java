// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;


// Referenced classes of package com.facebook.share.widget:
//			LikeView

static class LikeView$2
{

	static final int $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[];

	static 
	{
		$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition = new int[xiliaryViewPosition.values().length];
	//    0    0:invokestatic    #18  <Method LikeView$AuxiliaryViewPosition[] LikeView$AuxiliaryViewPosition.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
		try
		{
			$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[xiliaryViewPosition.TOP.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
	//    5   12:getstatic       #24  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.TOP>
	//    6   15:invokevirtual   #28  <Method int LikeView$AuxiliaryViewPosition.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
	//*  10   23:getstatic       #31  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.BOTTOM>
	//*  11   26:invokevirtual   #28  <Method int LikeView$AuxiliaryViewPosition.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
	//*  15   34:getstatic       #34  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.INLINE>
	//*  16   37:invokevirtual   #28  <Method int LikeView$AuxiliaryViewPosition.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[xiliaryViewPosition.BOTTOM.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[xiliaryViewPosition.INLINE.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
