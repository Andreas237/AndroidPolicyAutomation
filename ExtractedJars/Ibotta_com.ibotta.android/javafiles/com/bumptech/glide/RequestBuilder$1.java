// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;


// Referenced classes of package com.bumptech.glide:
//			RequestBuilder, Priority

static class RequestBuilder$1
{

	static final int $SwitchMap$android$widget$ImageView$ScaleType[];
	static final int $SwitchMap$com$bumptech$glide$Priority[];

	static 
	{
		$SwitchMap$com$bumptech$glide$Priority = new int[Priority.values().length];
	//    0    0:invokestatic    #19  <Method Priority[] Priority.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
		try
		{
			$SwitchMap$com$bumptech$glide$Priority[Priority.LOW.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
	//    5   12:getstatic       #25  <Field Priority Priority.LOW>
	//    6   15:invokevirtual   #29  <Method int Priority.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
	//*  10   23:getstatic       #32  <Field Priority Priority.NORMAL>
	//*  11   26:invokevirtual   #29  <Method int Priority.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
	//*  15   34:getstatic       #35  <Field Priority Priority.HIGH>
	//*  16   37:invokevirtual   #29  <Method int Priority.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
	//*  20   45:getstatic       #38  <Field Priority Priority.IMMEDIATE>
	//*  21   48:invokevirtual   #29  <Method int Priority.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #43  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//*  28   62:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//*  29   65:getstatic       #49  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//*  30   68:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//*  34   76:getstatic       #53  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//*  35   79:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//*  39   87:getstatic       #56  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//*  40   90:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  41   93:iconst_3        
	//*  42   94:iastore         
	//*  43   95:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//*  44   98:getstatic       #59  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_START>
	//*  45  101:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  46  104:iconst_4        
	//*  47  105:iastore         
	//*  48  106:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//*  49  109:getstatic       #62  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_END>
	//*  50  112:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  51  115:iconst_5        
	//*  52  116:iastore         
	//*  53  117:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//*  54  120:getstatic       #65  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
	//*  55  123:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  56  126:bipush          6
	//*  57  128:iastore         
	//*  58  129:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//*  59  132:getstatic       #68  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
	//*  60  135:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  61  138:bipush          7
	//*  62  140:iastore         
	//*  63  141:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//*  64  144:getstatic       #71  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  65  147:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  66  150:bipush          8
	//*  67  152:iastore         
	//*  68  153:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   69  154:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$Priority[Priority.NORMAL.ordinal()] = 2;
		}
	//*  70  155:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   71  158:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$Priority[Priority.HIGH.ordinal()] = 3;
		}
	//*  72  159:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   73  162:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$Priority[Priority.IMMEDIATE.ordinal()] = 4;
		}
	//*  74  163:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   75  166:astore_0        
		$SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.pe.values().length];
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.CENTER_CROP.ordinal()] = 1;
		}
	//*  76  167:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   77  170:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.CENTER_INSIDE.ordinal()] = 2;
		}
	//*  78  171:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   79  174:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.FIT_CENTER.ordinal()] = 3;
		}
	//*  80  175:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   81  178:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.FIT_START.ordinal()] = 4;
		}
	//*  82  179:goto            95
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   83  182:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.FIT_END.ordinal()] = 5;
		}
	//*  84  183:goto            106
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   85  186:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.FIT_XY.ordinal()] = 6;
		}
	//*  86  187:goto            117
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   87  190:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.CENTER.ordinal()] = 7;
		}
	//*  88  191:goto            129
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   89  194:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.MATRIX.ordinal()] = 8;
		}
	//*  90  195:goto            141
		catch(NoSuchFieldError nosuchfielderror11) { }
	//   91  198:astore_0        
	//*  92  199:return          
	}
}
