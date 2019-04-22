// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			ShapeStroke

static class ShapeStroke$1
{

	static final int $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType[];
	static final int $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType[];

	static 
	{
		$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType = new int[neJoinType.values().length];
	//    0    0:invokestatic    #19  <Method ShapeStroke$LineJoinType[] ShapeStroke$LineJoinType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
		try
		{
			$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType[neJoinType.Bevel.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
	//    5   12:getstatic       #25  <Field ShapeStroke$LineJoinType ShapeStroke$LineJoinType.Bevel>
	//    6   15:invokevirtual   #29  <Method int ShapeStroke$LineJoinType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
	//*  10   23:getstatic       #32  <Field ShapeStroke$LineJoinType ShapeStroke$LineJoinType.Miter>
	//*  11   26:invokevirtual   #29  <Method int ShapeStroke$LineJoinType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
	//*  15   34:getstatic       #35  <Field ShapeStroke$LineJoinType ShapeStroke$LineJoinType.Round>
	//*  16   37:invokevirtual   #29  <Method int ShapeStroke$LineJoinType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #40  <Method ShapeStroke$LineCapType[] ShapeStroke$LineCapType.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #42  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
	//*  23   51:getstatic       #42  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
	//*  24   54:getstatic       #46  <Field ShapeStroke$LineCapType ShapeStroke$LineCapType.Butt>
	//*  25   57:invokevirtual   #47  <Method int ShapeStroke$LineCapType.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #42  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
	//*  29   65:getstatic       #49  <Field ShapeStroke$LineCapType ShapeStroke$LineCapType.Round>
	//*  30   68:invokevirtual   #47  <Method int ShapeStroke$LineCapType.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:getstatic       #42  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
	//*  34   76:getstatic       #52  <Field ShapeStroke$LineCapType ShapeStroke$LineCapType.Unknown>
	//*  35   79:invokevirtual   #47  <Method int ShapeStroke$LineCapType.ordinal()>
	//*  36   82:iconst_3        
	//*  37   83:iastore         
	//*  38   84:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   39   85:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType[neJoinType.Miter.ordinal()] = 2;
		}
	//*  40   86:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   41   89:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType[neJoinType.Round.ordinal()] = 3;
		}
	//*  42   90:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   43   93:astore_0        
		$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType = new int[neCapType.values().length];
		try
		{
			$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType[neCapType.Butt.ordinal()] = 1;
		}
	//*  44   94:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   45   97:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType[neCapType.Round.ordinal()] = 2;
		}
	//*  46   98:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   47  101:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType[neCapType.Unknown.ordinal()] = 3;
		}
	//*  48  102:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  105:astore_0        
	//*  50  106:return          
	}
}
