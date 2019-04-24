// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			Descriptors

static class Descriptors$1
{

	static final int $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[];
	static final int $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[];

	static 
	{
		$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = new int[eldDescriptor.JavaType.values().length];
	//    0    0:invokestatic    #19  <Method Descriptors$FieldDescriptor$JavaType[] Descriptors$FieldDescriptor$JavaType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType>
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[eldDescriptor.JavaType.ENUM.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType>
	//    5   12:getstatic       #25  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.ENUM>
	//    6   15:invokevirtual   #29  <Method int Descriptors$FieldDescriptor$JavaType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType[eldDescriptor.JavaType.MESSAGE.ordinal()] = 2;
	//   11   24:getstatic       #21  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType>
	//   12   27:getstatic       #32  <Field Descriptors$FieldDescriptor$JavaType Descriptors$FieldDescriptor$JavaType.MESSAGE>
	//   13   30:invokevirtual   #29  <Method int Descriptors$FieldDescriptor$JavaType.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = new int[eldDescriptor.Type.values().length];
	//   18   39:invokestatic    #37  <Method Descriptors$FieldDescriptor$Type[] Descriptors$FieldDescriptor$Type.values()>
	//   19   42:arraylength     
	//   20   43:newarray        int[]
	//   21   45:putstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.INT32.ordinal()] = 1;
	//   22   48:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   23   51:getstatic       #43  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.INT32>
	//   24   54:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   25   57:iconst_1        
	//   26   58:iastore         
		}
	//*  27   59:goto            63
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   28   62:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.SINT32.ordinal()] = 2;
	//   29   63:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   30   66:getstatic       #47  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.SINT32>
	//   31   69:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   32   72:iconst_2        
	//   33   73:iastore         
		}
	//*  34   74:goto            78
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   35   77:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.SFIXED32.ordinal()] = 3;
	//   36   78:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   37   81:getstatic       #50  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.SFIXED32>
	//   38   84:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   39   87:iconst_3        
	//   40   88:iastore         
		}
	//*  41   89:goto            93
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   92:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.UINT32.ordinal()] = 4;
	//   43   93:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   44   96:getstatic       #53  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.UINT32>
	//   45   99:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   46  102:iconst_4        
	//   47  103:iastore         
		}
	//*  48  104:goto            108
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  107:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.FIXED32.ordinal()] = 5;
	//   50  108:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   51  111:getstatic       #56  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.FIXED32>
	//   52  114:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   53  117:iconst_5        
	//   54  118:iastore         
		}
	//*  55  119:goto            123
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   56  122:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.INT64.ordinal()] = 6;
	//   57  123:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   58  126:getstatic       #59  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.INT64>
	//   59  129:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   60  132:bipush          6
	//   61  134:iastore         
		}
	//*  62  135:goto            139
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   63  138:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.SINT64.ordinal()] = 7;
	//   64  139:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   65  142:getstatic       #62  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.SINT64>
	//   66  145:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   67  148:bipush          7
	//   68  150:iastore         
		}
	//*  69  151:goto            155
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   70  154:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.SFIXED64.ordinal()] = 8;
	//   71  155:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   72  158:getstatic       #65  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.SFIXED64>
	//   73  161:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   74  164:bipush          8
	//   75  166:iastore         
		}
	//*  76  167:goto            171
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   77  170:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.UINT64.ordinal()] = 9;
	//   78  171:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   79  174:getstatic       #68  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.UINT64>
	//   80  177:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   81  180:bipush          9
	//   82  182:iastore         
		}
	//*  83  183:goto            187
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   84  186:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.FIXED64.ordinal()] = 10;
	//   85  187:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   86  190:getstatic       #71  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.FIXED64>
	//   87  193:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   88  196:bipush          10
	//   89  198:iastore         
		}
	//*  90  199:goto            203
		catch(NoSuchFieldError nosuchfielderror11) { }
	//   91  202:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.FLOAT.ordinal()] = 11;
	//   92  203:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//   93  206:getstatic       #74  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.FLOAT>
	//   94  209:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//   95  212:bipush          11
	//   96  214:iastore         
		}
	//*  97  215:goto            219
		catch(NoSuchFieldError nosuchfielderror12) { }
	//   98  218:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.DOUBLE.ordinal()] = 12;
	//   99  219:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//  100  222:getstatic       #77  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.DOUBLE>
	//  101  225:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//  102  228:bipush          12
	//  103  230:iastore         
		}
	//* 104  231:goto            235
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  105  234:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.BOOL.ordinal()] = 13;
	//  106  235:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//  107  238:getstatic       #80  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.BOOL>
	//  108  241:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//  109  244:bipush          13
	//  110  246:iastore         
		}
	//* 111  247:goto            251
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  112  250:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.STRING.ordinal()] = 14;
	//  113  251:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//  114  254:getstatic       #83  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.STRING>
	//  115  257:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//  116  260:bipush          14
	//  117  262:iastore         
		}
	//* 118  263:goto            267
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  119  266:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.BYTES.ordinal()] = 15;
	//  120  267:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//  121  270:getstatic       #86  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.BYTES>
	//  122  273:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//  123  276:bipush          15
	//  124  278:iastore         
		}
	//* 125  279:goto            283
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  126  282:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.ENUM.ordinal()] = 16;
	//  127  283:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//  128  286:getstatic       #88  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.ENUM>
	//  129  289:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//  130  292:bipush          16
	//  131  294:iastore         
		}
	//* 132  295:goto            299
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  133  298:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.MESSAGE.ordinal()] = 17;
	//  134  299:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//  135  302:getstatic       #90  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.MESSAGE>
	//  136  305:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//  137  308:bipush          17
	//  138  310:iastore         
		}
	//* 139  311:goto            315
		catch(NoSuchFieldError nosuchfielderror18) { }
	//  140  314:astore_0        
		try
		{
			$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[eldDescriptor.Type.GROUP.ordinal()] = 18;
	//  141  315:getstatic       #39  <Field int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type>
	//  142  318:getstatic       #93  <Field Descriptors$FieldDescriptor$Type Descriptors$FieldDescriptor$Type.GROUP>
	//  143  321:invokevirtual   #44  <Method int Descriptors$FieldDescriptor$Type.ordinal()>
	//  144  324:bipush          18
	//  145  326:iastore         
	//  146  327:return          
		}
		catch(NoSuchFieldError nosuchfielderror19) { }
	//  147  328:astore_0        
	//* 148  329:return          
	}
}
