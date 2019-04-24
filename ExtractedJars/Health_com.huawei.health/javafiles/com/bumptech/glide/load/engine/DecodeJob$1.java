// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob

static class DecodeJob$1
{

	static final int $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[];
	static final int $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[];

	static 
	{
		$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage = new int[age.values().length];
	//    0    0:invokestatic    #19  <Method DecodeJob$Stage[] DecodeJob$Stage.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.RESOURCE_CACHE.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//    5   12:getstatic       #25  <Field DecodeJob$Stage DecodeJob$Stage.RESOURCE_CACHE>
	//    6   15:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.DATA_CACHE.ordinal()] = 2;
	//   11   24:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//   12   27:getstatic       #32  <Field DecodeJob$Stage DecodeJob$Stage.DATA_CACHE>
	//   13   30:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.SOURCE.ordinal()] = 3;
	//   18   39:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//   19   42:getstatic       #35  <Field DecodeJob$Stage DecodeJob$Stage.SOURCE>
	//   20   45:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
	//   21   48:iconst_3        
	//   22   49:iastore         
		}
	//*  23   50:goto            54
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   53:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.FINISHED.ordinal()] = 4;
	//   25   54:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//   26   57:getstatic       #38  <Field DecodeJob$Stage DecodeJob$Stage.FINISHED>
	//   27   60:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
	//   28   63:iconst_4        
	//   29   64:iastore         
		}
	//*  30   65:goto            69
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   68:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage[age.INITIALIZE.ordinal()] = 5;
	//   32   69:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$Stage>
	//   33   72:getstatic       #41  <Field DecodeJob$Stage DecodeJob$Stage.INITIALIZE>
	//   34   75:invokevirtual   #29  <Method int DecodeJob$Stage.ordinal()>
	//   35   78:iconst_5        
	//   36   79:iastore         
		}
	//*  37   80:goto            84
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   83:astore_0        
		$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason = new int[nReason.values().length];
	//   39   84:invokestatic    #46  <Method DecodeJob$RunReason[] DecodeJob$RunReason.values()>
	//   40   87:arraylength     
	//   41   88:newarray        int[]
	//   42   90:putstatic       #48  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[nReason.INITIALIZE.ordinal()] = 1;
	//   43   93:getstatic       #48  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
	//   44   96:getstatic       #51  <Field DecodeJob$RunReason DecodeJob$RunReason.INITIALIZE>
	//   45   99:invokevirtual   #52  <Method int DecodeJob$RunReason.ordinal()>
	//   46  102:iconst_1        
	//   47  103:iastore         
		}
	//*  48  104:goto            108
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  107:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[nReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
	//   50  108:getstatic       #48  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
	//   51  111:getstatic       #55  <Field DecodeJob$RunReason DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE>
	//   52  114:invokevirtual   #52  <Method int DecodeJob$RunReason.ordinal()>
	//   53  117:iconst_2        
	//   54  118:iastore         
		}
	//*  55  119:goto            123
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   56  122:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason[nReason.DECODE_DATA.ordinal()] = 3;
	//   57  123:getstatic       #48  <Field int[] $SwitchMap$com$bumptech$glide$load$engine$DecodeJob$RunReason>
	//   58  126:getstatic       #58  <Field DecodeJob$RunReason DecodeJob$RunReason.DECODE_DATA>
	//   59  129:invokevirtual   #52  <Method int DecodeJob$RunReason.ordinal()>
	//   60  132:iconst_3        
	//   61  133:iastore         
	//   62  134:return          
		}
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   63  135:astore_0        
	//*  64  136:return          
	}
}
