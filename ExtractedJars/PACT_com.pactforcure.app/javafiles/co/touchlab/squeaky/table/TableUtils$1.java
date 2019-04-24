// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.table;

import co.touchlab.squeaky.field.SqlType;

// Referenced classes of package co.touchlab.squeaky.table:
//			TableUtils

static class TableUtils$1
{

	static final int $SwitchMap$co$touchlab$squeaky$field$SqlType[];

	static 
	{
		$SwitchMap$co$touchlab$squeaky$field$SqlType = new int[SqlType.values().length];
	//    0    0:invokestatic    #18  <Method SqlType[] SqlType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.STRING.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//    5   12:getstatic       #24  <Field SqlType SqlType.STRING>
	//    6   15:invokevirtual   #28  <Method int SqlType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  10   23:getstatic       #31  <Field SqlType SqlType.LONG_STRING>
	//*  11   26:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  15   34:getstatic       #34  <Field SqlType SqlType.BOOLEAN>
	//*  16   37:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  20   45:getstatic       #37  <Field SqlType SqlType.DATE>
	//*  21   48:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  25   56:getstatic       #40  <Field SqlType SqlType.CHAR>
	//*  26   59:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  30   67:getstatic       #43  <Field SqlType SqlType.BYTE>
	//*  31   70:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  35   79:getstatic       #46  <Field SqlType SqlType.BYTE_ARRAY>
	//*  36   82:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  40   91:getstatic       #49  <Field SqlType SqlType.SHORT>
	//*  41   94:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  45  103:getstatic       #52  <Field SqlType SqlType.INTEGER>
	//*  46  106:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  50  115:getstatic       #55  <Field SqlType SqlType.LONG>
	//*  51  118:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  55  127:getstatic       #58  <Field SqlType SqlType.FLOAT>
	//*  56  130:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  57  133:bipush          11
	//*  58  135:iastore         
	//*  59  136:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  60  139:getstatic       #61  <Field SqlType SqlType.DOUBLE>
	//*  61  142:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  62  145:bipush          12
	//*  63  147:iastore         
	//*  64  148:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  65  151:getstatic       #64  <Field SqlType SqlType.SERIALIZABLE>
	//*  66  154:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  67  157:bipush          13
	//*  68  159:iastore         
	//*  69  160:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  70  163:getstatic       #67  <Field SqlType SqlType.BIG_DECIMAL>
	//*  71  166:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  72  169:bipush          14
	//*  73  171:iastore         
	//*  74  172:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  75  175:getstatic       #70  <Field SqlType SqlType.UNKNOWN>
	//*  76  178:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  77  181:bipush          15
	//*  78  183:iastore         
	//*  79  184:return          
	//*  80  185:astore_0        
	//*  81  186:return          
	//*  82  187:astore_0        
	//*  83  188:goto            172
	//*  84  191:astore_0        
	//*  85  192:goto            160
	//*  86  195:astore_0        
	//*  87  196:goto            148
	//*  88  199:astore_0        
	//*  89  200:goto            136
	//*  90  203:astore_0        
	//*  91  204:goto            124
	//*  92  207:astore_0        
	//*  93  208:goto            112
	//*  94  211:astore_0        
	//*  95  212:goto            100
	//*  96  215:astore_0        
	//*  97  216:goto            88
	//*  98  219:astore_0        
	//*  99  220:goto            76
	//* 100  223:astore_0        
	//* 101  224:goto            64
	//* 102  227:astore_0        
	//* 103  228:goto            53
	//* 104  231:astore_0        
	//* 105  232:goto            42
	//* 106  235:astore_0        
	//* 107  236:goto            31
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  108  239:astore_0        
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.LONG_STRING.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror13) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BOOLEAN.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror12) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.DATE.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror11) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.CHAR.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror10) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BYTE.ordinal()] = 6;
		}
		catch(NoSuchFieldError nosuchfielderror9) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BYTE_ARRAY.ordinal()] = 7;
		}
		catch(NoSuchFieldError nosuchfielderror8) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.SHORT.ordinal()] = 8;
		}
		catch(NoSuchFieldError nosuchfielderror7) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.INTEGER.ordinal()] = 9;
		}
		catch(NoSuchFieldError nosuchfielderror6) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.LONG.ordinal()] = 10;
		}
		catch(NoSuchFieldError nosuchfielderror5) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.FLOAT.ordinal()] = 11;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.DOUBLE.ordinal()] = 12;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.SERIALIZABLE.ordinal()] = 13;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BIG_DECIMAL.ordinal()] = 14;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.UNKNOWN.ordinal()] = 15;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//* 109  240:goto            20
	}
}
