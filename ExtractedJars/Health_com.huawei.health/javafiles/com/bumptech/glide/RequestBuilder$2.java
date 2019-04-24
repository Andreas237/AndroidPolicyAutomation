// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;


// Referenced classes of package com.bumptech.glide:
//			RequestBuilder, Priority

static class RequestBuilder$2
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
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$Priority[Priority.NORMAL.ordinal()] = 2;
	//   11   24:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
	//   12   27:getstatic       #32  <Field Priority Priority.NORMAL>
	//   13   30:invokevirtual   #29  <Method int Priority.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$Priority[Priority.HIGH.ordinal()] = 3;
	//   18   39:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
	//   19   42:getstatic       #35  <Field Priority Priority.HIGH>
	//   20   45:invokevirtual   #29  <Method int Priority.ordinal()>
	//   21   48:iconst_3        
	//   22   49:iastore         
		}
	//*  23   50:goto            54
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   53:astore_0        
		try
		{
			$SwitchMap$com$bumptech$glide$Priority[Priority.IMMEDIATE.ordinal()] = 4;
	//   25   54:getstatic       #21  <Field int[] $SwitchMap$com$bumptech$glide$Priority>
	//   26   57:getstatic       #38  <Field Priority Priority.IMMEDIATE>
	//   27   60:invokevirtual   #29  <Method int Priority.ordinal()>
	//   28   63:iconst_4        
	//   29   64:iastore         
		}
	//*  30   65:goto            69
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   68:astore_0        
		$SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.pe.values().length];
	//   32   69:invokestatic    #43  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
	//   33   72:arraylength     
	//   34   73:newarray        int[]
	//   35   75:putstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.CENTER_CROP.ordinal()] = 1;
	//   36   78:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//   37   81:getstatic       #49  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   38   84:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   39   87:iconst_1        
	//   40   88:iastore         
		}
	//*  41   89:goto            93
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   92:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.CENTER_INSIDE.ordinal()] = 2;
	//   43   93:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//   44   96:getstatic       #53  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//   45   99:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   46  102:iconst_2        
	//   47  103:iastore         
		}
	//*  48  104:goto            108
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  107:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.FIT_CENTER.ordinal()] = 3;
	//   50  108:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//   51  111:getstatic       #56  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   52  114:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   53  117:iconst_3        
	//   54  118:iastore         
		}
	//*  55  119:goto            123
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   56  122:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.FIT_START.ordinal()] = 4;
	//   57  123:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//   58  126:getstatic       #59  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_START>
	//   59  129:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   60  132:iconst_4        
	//   61  133:iastore         
		}
	//*  62  134:goto            138
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   63  137:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.FIT_END.ordinal()] = 5;
	//   64  138:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//   65  141:getstatic       #62  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_END>
	//   66  144:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   67  147:iconst_5        
	//   68  148:iastore         
		}
	//*  69  149:goto            153
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   70  152:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.FIT_XY.ordinal()] = 6;
	//   71  153:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//   72  156:getstatic       #65  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
	//   73  159:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   74  162:bipush          6
	//   75  164:iastore         
		}
	//*  76  165:goto            169
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   77  168:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.CENTER.ordinal()] = 7;
	//   78  169:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//   79  172:getstatic       #68  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
	//   80  175:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   81  178:bipush          7
	//   82  180:iastore         
		}
	//*  83  181:goto            185
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   84  184:astore_0        
		try
		{
			$SwitchMap$android$widget$ImageView$ScaleType[android.widget.pe.MATRIX.ordinal()] = 8;
	//   85  185:getstatic       #45  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
	//   86  188:getstatic       #71  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//   87  191:invokevirtual   #50  <Method int android.widget.ImageView$ScaleType.ordinal()>
	//   88  194:bipush          8
	//   89  196:iastore         
	//   90  197:return          
		}
		catch(NoSuchFieldError nosuchfielderror11) { }
	//   91  198:astore_0        
	//*  92  199:return          
	}
}
