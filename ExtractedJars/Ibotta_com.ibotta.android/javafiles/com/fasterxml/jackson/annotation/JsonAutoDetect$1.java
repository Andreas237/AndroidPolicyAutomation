// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//			JsonAutoDetect, PropertyAccessor

static class JsonAutoDetect$1
{

	static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[];
	static final int $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[];

	static 
	{
		$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor = new int[PropertyAccessor.values().length];
	//    0    0:invokestatic    #19  <Method PropertyAccessor[] PropertyAccessor.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.CREATOR.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//    5   12:getstatic       #25  <Field PropertyAccessor PropertyAccessor.CREATOR>
	//    6   15:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  10   23:getstatic       #32  <Field PropertyAccessor PropertyAccessor.FIELD>
	//*  11   26:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  15   34:getstatic       #35  <Field PropertyAccessor PropertyAccessor.GETTER>
	//*  16   37:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  20   45:getstatic       #38  <Field PropertyAccessor PropertyAccessor.IS_GETTER>
	//*  21   48:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  25   56:getstatic       #41  <Field PropertyAccessor PropertyAccessor.NONE>
	//*  26   59:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  30   67:getstatic       #44  <Field PropertyAccessor PropertyAccessor.SETTER>
	//*  31   70:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor>
	//*  35   79:getstatic       #47  <Field PropertyAccessor PropertyAccessor.ALL>
	//*  36   82:invokevirtual   #29  <Method int PropertyAccessor.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:invokestatic    #52  <Method JsonAutoDetect$Visibility[] JsonAutoDetect$Visibility.values()>
	//*  40   91:arraylength     
	//*  41   92:newarray        int[]
	//*  42   94:putstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  43   97:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  44  100:getstatic       #58  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.ANY>
	//*  45  103:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
	//*  46  106:iconst_1        
	//*  47  107:iastore         
	//*  48  108:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  49  111:getstatic       #61  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.NONE>
	//*  50  114:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
	//*  51  117:iconst_2        
	//*  52  118:iastore         
	//*  53  119:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  54  122:getstatic       #64  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.NON_PRIVATE>
	//*  55  125:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
	//*  56  128:iconst_3        
	//*  57  129:iastore         
	//*  58  130:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  59  133:getstatic       #67  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PROTECTED_AND_PUBLIC>
	//*  60  136:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
	//*  61  139:iconst_4        
	//*  62  140:iastore         
	//*  63  141:getstatic       #54  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility>
	//*  64  144:getstatic       #70  <Field JsonAutoDetect$Visibility JsonAutoDetect$Visibility.PUBLIC_ONLY>
	//*  65  147:invokevirtual   #59  <Method int JsonAutoDetect$Visibility.ordinal()>
	//*  66  150:iconst_5        
	//*  67  151:iastore         
	//*  68  152:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   69  153:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.FIELD.ordinal()] = 2;
		}
	//*  70  154:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   71  157:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.GETTER.ordinal()] = 3;
		}
	//*  72  158:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   73  161:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.IS_GETTER.ordinal()] = 4;
		}
	//*  74  162:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   75  165:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.NONE.ordinal()] = 5;
		}
	//*  76  166:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   77  169:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.SETTER.ordinal()] = 6;
		}
	//*  78  170:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   79  173:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$PropertyAccessor[PropertyAccessor.ALL.ordinal()] = 7;
		}
	//*  80  174:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   81  177:astore_0        
		$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility = new int[sibility.values().length];
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.ANY.ordinal()] = 1;
		}
	//*  82  178:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   83  181:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.NONE.ordinal()] = 2;
		}
	//*  84  182:goto            108
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   85  185:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.NON_PRIVATE.ordinal()] = 3;
		}
	//*  86  186:goto            119
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   87  189:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
		}
	//*  88  190:goto            130
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   89  193:astore_0        
		try
		{
			$SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[sibility.PUBLIC_ONLY.ordinal()] = 5;
		}
	//*  90  194:goto            141
		catch(NoSuchFieldError nosuchfielderror11) { }
	//   91  197:astore_0        
	//*  92  198:return          
	}
}
