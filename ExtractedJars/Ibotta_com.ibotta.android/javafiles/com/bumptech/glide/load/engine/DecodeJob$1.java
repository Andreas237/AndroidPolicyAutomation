// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EncodeStrategy;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob

static class DecodeJob$1
{

	static final int $SwitchMap$com$bumptech$glide$load$EncodeStrategy[];
	static final int $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[];
	static final int $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[];

	static 
	{
		$SwitchMap$com$bumptech$glide$load$EncodeStrategy = new int[EncodeStrategy.values().length];
	//    0    0:invokestatic    #20  <Method EncodeStrategy[] EncodeStrategy.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #22  <Field int[] $SwitchMap$com$bumptech$glide$load$EncodeStrategy>
		try
		{
			$SwitchMap$com$bumptech$glide$load$EncodeStrategy[EncodeStrategy.SOURCE.ordinal()] = 1;
	//    4    9:getstatic       #22  <Field int[] $SwitchMap$com$bumptech$glide$load$EncodeStrategy>
	//    5   12:getstatic       #26  <Field EncodeStrategy EncodeStrategy.SOURCE>
	//    6   15:invokevirtual   #30  <Method int EncodeStrategy.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #22  <Field int[] $SwitchMap$com$bumptech$glide$load$EncodeStrategy>
	//*  10   23:getstatic       #33  <Field EncodeStrategy EncodeStrategy.TRANSFORMED>
	//*  11   26:invokevirtual   #30  <Method int EncodeStrategy.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:invokestatic    #38  <Method DecodeJob$Stage[] DecodeJob$Stage.values()>
	//*  15   34:arraylength     
	//*  16   35:newarray        int[]
	//*  17   37:putstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*  18   40:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*  19   43:getstatic       #44  <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
	//*  20   46:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
	//*  21   49:iconst_1        
	//*  22   50:iastore         
	//*  23   51:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*  24   54:getstatic       #48  <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
	//*  25   57:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
	//*  26   60:iconst_2        
	//*  27   61:iastore         
	//*  28   62:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*  29   65:getstatic       #50  <Field DecodeJob$Stage DecodeJob$Stage.SOURCE>
	//*  30   68:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
	//*  31   71:iconst_3        
	//*  32   72:iastore         
	//*  33   73:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*  34   76:getstatic       #53  <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
	//*  35   79:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
	//*  36   82:iconst_4        
	//*  37   83:iastore         
	//*  38   84:getstatic       #40  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//*  39   87:getstatic       #56  <Field DecodeJob$Stage DecodeJob$Stage.INITIALIZE>
	//*  40   90:invokevirtual   #45  <Method int DecodeJob$Stage.ordinal()>
	//*  41   93:iconst_5        
	//*  42   94:iastore         
	//*  43   95:invokestatic    #61  <Method DecodeJob$RunReason[] DecodeJob$RunReason.values()>
	//*  44   98:arraylength     
	//*  45   99:newarray        int[]
	//*  46  101:putstatic       #63  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
	//*  47  104:getstatic       #63  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
	//*  48  107:getstatic       #66  <Field DecodeJob$RunReason DecodeJob$RunReason.INITIALIZE>
	//*  49  110:invokevirtual   #67  <Method int DecodeJob$RunReason.ordinal()>
	//*  50  113:iconst_1        
	//*  51  114:iastore         
	//*  52  115:getstatic       #63  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
	//*  53  118:getstatic       #70  <Field DecodeJob$RunReason DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE>
	//*  54  121:invokevirtual   #67  <Method int DecodeJob$RunReason.ordinal()>
	//*  55  124:iconst_2        
	//*  56  125:iastore         
	//*  57  126:getstatic       #63  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
	//*  58  129:getstatic       #73  <Field DecodeJob$RunReason DecodeJob$RunReason.DECODE_DATA>
	//*  59  132:invokevirtual   #67  <Method int DecodeJob$RunReason.ordinal()>
	//*  60  135:iconst_3        
	//*  61  136:iastore         
	//*  62  137:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   63  138:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$EncodeStrategy[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
		}
	//*  64  139:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   65  142:astore_0        
		$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage = new int[age.values().length];
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.RESOURCE_CACHE.ordinal()] = 1;
		}
	//*  66  143:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   67  146:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.DATA_CACHE.ordinal()] = 2;
		}
	//*  68  147:goto            51
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   69  150:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.SOURCE.ordinal()] = 3;
		}
	//*  70  151:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   71  154:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.FINISHED.ordinal()] = 4;
		}
	//*  72  155:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   73  158:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.INITIALIZE.ordinal()] = 5;
		}
	//*  74  159:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   75  162:astore_0        
		$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason = new int[nReason.values().length];
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[nReason.INITIALIZE.ordinal()] = 1;
		}
	//*  76  163:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   77  166:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[nReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
		}
	//*  78  167:goto            115
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   79  170:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[nReason.DECODE_DATA.ordinal()] = 3;
		}
	//*  80  171:goto            126
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   81  174:astore_0        
	//*  82  175:return          
	}
}
