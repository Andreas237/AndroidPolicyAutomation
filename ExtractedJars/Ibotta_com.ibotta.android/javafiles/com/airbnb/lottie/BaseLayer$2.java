// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			BaseLayer

static class BaseLayer$2
{

	static final int $SwitchMap$com$airbnb$lottie$Layer$LayerType[];
	static final int $SwitchMap$com$airbnb$lottie$Mask$MaskMode[];

	static 
	{
		$SwitchMap$com$airbnb$lottie$Mask$MaskMode = new int[e.values().length];
	//    0    0:invokestatic    #19  <Method Mask$MaskMode[] Mask$MaskMode.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$Mask$MaskMode>
		try
		{
			$SwitchMap$com$airbnb$lottie$Mask$MaskMode[e.MaskModeSubtract.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$Mask$MaskMode>
	//    5   12:getstatic       #25  <Field Mask$MaskMode Mask$MaskMode.MaskModeSubtract>
	//    6   15:invokevirtual   #29  <Method int Mask$MaskMode.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$Mask$MaskMode>
	//*  10   23:getstatic       #32  <Field Mask$MaskMode Mask$MaskMode.MaskModeAdd>
	//*  11   26:invokevirtual   #29  <Method int Mask$MaskMode.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:invokestatic    #37  <Method Layer$LayerType[] Layer$LayerType.values()>
	//*  15   34:arraylength     
	//*  16   35:newarray        int[]
	//*  17   37:putstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
	//*  18   40:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
	//*  19   43:getstatic       #43  <Field Layer$LayerType Layer$LayerType.Shape>
	//*  20   46:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
	//*  21   49:iconst_1        
	//*  22   50:iastore         
	//*  23   51:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
	//*  24   54:getstatic       #47  <Field Layer$LayerType Layer$LayerType.PreComp>
	//*  25   57:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
	//*  26   60:iconst_2        
	//*  27   61:iastore         
	//*  28   62:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
	//*  29   65:getstatic       #50  <Field Layer$LayerType Layer$LayerType.Solid>
	//*  30   68:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
	//*  31   71:iconst_3        
	//*  32   72:iastore         
	//*  33   73:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
	//*  34   76:getstatic       #53  <Field Layer$LayerType Layer$LayerType.Image>
	//*  35   79:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
	//*  36   82:iconst_4        
	//*  37   83:iastore         
	//*  38   84:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
	//*  39   87:getstatic       #56  <Field Layer$LayerType Layer$LayerType.Null>
	//*  40   90:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
	//*  41   93:iconst_5        
	//*  42   94:iastore         
	//*  43   95:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
	//*  44   98:getstatic       #59  <Field Layer$LayerType Layer$LayerType.Text>
	//*  45  101:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
	//*  46  104:bipush          6
	//*  47  106:iastore         
	//*  48  107:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
	//*  49  110:getstatic       #62  <Field Layer$LayerType Layer$LayerType.Unknown>
	//*  50  113:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
	//*  51  116:bipush          7
	//*  52  118:iastore         
	//*  53  119:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   54  120:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$Mask$MaskMode[e.MaskModeAdd.ordinal()] = 2;
		}
	//*  55  121:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   56  124:astore_0        
		$SwitchMap$com$airbnb$lottie$Layer$LayerType = new int[ype.values().length];
		try
		{
			$SwitchMap$com$airbnb$lottie$Layer$LayerType[ype.Shape.ordinal()] = 1;
		}
	//*  57  125:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   58  128:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$Layer$LayerType[ype.PreComp.ordinal()] = 2;
		}
	//*  59  129:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   60  132:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$Layer$LayerType[ype.Solid.ordinal()] = 3;
		}
	//*  61  133:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   62  136:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$Layer$LayerType[ype.Image.ordinal()] = 4;
		}
	//*  63  137:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   64  140:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$Layer$LayerType[ype.Null.ordinal()] = 5;
		}
	//*  65  141:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   66  144:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$Layer$LayerType[ype.Text.ordinal()] = 6;
		}
	//*  67  145:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   68  148:astore_0        
		try
		{
			$SwitchMap$com$airbnb$lottie$Layer$LayerType[ype.Unknown.ordinal()] = 7;
		}
	//*  69  149:goto            107
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   70  152:astore_0        
	//*  71  153:return          
	}
}
