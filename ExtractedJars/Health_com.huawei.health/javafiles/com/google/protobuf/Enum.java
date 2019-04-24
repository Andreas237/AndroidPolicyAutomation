// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			GeneratedMessageV3, EnumOrBuilder, InvalidProtocolBufferException, UnknownFieldSet, 
//			CodedInputStream, EnumValue, Option, SourceContext, 
//			TypeProto, Parser, EnumValueOrBuilder, ByteString, 
//			OptionOrBuilder, MessageLite, CodedOutputStream, Syntax, 
//			ExtensionRegistryLite, Message, SourceContextOrBuilder

public final class Enum extends GeneratedMessageV3
	implements EnumOrBuilder
{

	private Enum()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void GeneratedMessageV3()>
		memoizedIsInitialized = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #57  <Field byte memoizedIsInitialized>
		name_ = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #59  <String "">
	//    7   12:putfield        #61  <Field Object name_>
		enumvalue_ = Collections.emptyList();
	//    8   15:aload_0         
	//    9   16:invokestatic    #67  <Method List Collections.emptyList()>
	//   10   19:putfield        #69  <Field List enumvalue_>
		options_ = Collections.emptyList();
	//   11   22:aload_0         
	//   12   23:invokestatic    #67  <Method List Collections.emptyList()>
	//   13   26:putfield        #71  <Field List options_>
		syntax_ = 0;
	//   14   29:aload_0         
	//   15   30:iconst_0        
	//   16   31:putfield        #73  <Field int syntax_>
	//   17   34:return          
	}

	private Enum(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		int i;
		boolean flag1;
		UnknownFieldSet.Builder builder1;
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Enum()>
		if(extensionregistrylite == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       16
			throw new NullPointerException();
	//    4    8:new             #80  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #81  <Method void NullPointerException()>
	//    7   15:athrow          
		i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_3        
		builder1 = UnknownFieldSet.newBuilder();
	//   10   18:invokestatic    #87  <Method UnknownFieldSet$Builder UnknownFieldSet.newBuilder()>
	//   11   21:astore          12
		flag1 = false;
	//   12   23:iconst_0        
	//   13   24:istore          9
_L17:
		int k;
		int l;
		int i1;
		if(flag1)
			break; /* Loop/switch isn't completed */
	//   14   26:iload           9
	//   15   28:ifne            471
		l = i;
	//   16   31:iload_3         
	//   17   32:istore          6
		i1 = i;
	//   18   34:iload_3         
	//   19   35:istore          7
		k = i;
	//   20   37:iload_3         
	//   21   38:istore          5
		int j1 = codedinputstream.readTag();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #93  <Method int CodedInputStream.readTag()>
	//   24   44:istore          10
		j1;
	//   25   46:iload           10
		JVM INSTR lookupswitch 6: default 604
	//	               0: 607
	//	               10: 146
	//	               18: 173
	//	               26: 245
	//	               34: 317
	//	               40: 437;
	//   26   48:lookupswitch    6: default 604
	//	               0: 607
	//	               10: 146
	//	               18: 173
	//	               26: 245
	//	               34: 317
	//	               40: 437
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		int j;
		boolean flag;
		j = i;
	//   27  108:iload_3         
	//   28  109:istore          4
		flag = flag1;
	//   29  111:iload           9
	//   30  113:istore          8
		l = i;
	//   31  115:iload_3         
	//   32  116:istore          6
		i1 = i;
	//   33  118:iload_3         
	//   34  119:istore          7
		k = i;
	//   35  121:iload_3         
	//   36  122:istore          5
		if(!parseUnknownFieldProto3(codedinputstream, builder1, extensionregistrylite, j1))
	//*  37  124:aload_0         
	//*  38  125:aload_1         
	//*  39  126:aload           12
	//*  40  128:aload_2         
	//*  41  129:iload           10
	//*  42  131:invokevirtual   #97  <Method boolean parseUnknownFieldProto3(CodedInputStream, UnknownFieldSet$Builder, ExtensionRegistryLite, int)>
	//*  43  134:ifne            461
		{
			flag = true;
	//   44  137:iconst_1        
	//   45  138:istore          8
			j = i;
	//   46  140:iload_3         
	//   47  141:istore          4
		}
		  goto _L8
	//*  48  143:goto            461
_L3:
		l = i;
	//   49  146:iload_3         
	//   50  147:istore          6
		i1 = i;
	//   51  149:iload_3         
	//   52  150:istore          7
		k = i;
	//   53  152:iload_3         
	//   54  153:istore          5
		name_ = ((Object) (codedinputstream.readStringRequireUtf8()));
	//   55  155:aload_0         
	//   56  156:aload_1         
	//   57  157:invokevirtual   #101 <Method String CodedInputStream.readStringRequireUtf8()>
	//   58  160:putfield        #61  <Field Object name_>
		j = i;
	//   59  163:iload_3         
	//   60  164:istore          4
		flag = flag1;
	//   61  166:iload           9
	//   62  168:istore          8
		  goto _L8
	//*  63  170:goto            461
_L4:
		j = i;
	//   64  173:iload_3         
	//   65  174:istore          4
		if((i & 2) == 2) goto _L10; else goto _L9
	//   66  176:iload_3         
	//   67  177:iconst_2        
	//   68  178:iand            
	//   69  179:iconst_2        
	//   70  180:icmpeq          208
_L9:
		l = i;
	//   71  183:iload_3         
	//   72  184:istore          6
		i1 = i;
	//   73  186:iload_3         
	//   74  187:istore          7
		k = i;
	//   75  189:iload_3         
	//   76  190:istore          5
		enumvalue_ = ((List) (new ArrayList()));
	//   77  192:aload_0         
	//   78  193:new             #103 <Class ArrayList>
	//   79  196:dup             
	//   80  197:invokespecial   #104 <Method void ArrayList()>
	//   81  200:putfield        #69  <Field List enumvalue_>
		j = i | 2;
	//   82  203:iload_3         
	//   83  204:iconst_2        
	//   84  205:ior             
	//   85  206:istore          4
_L10:
		l = j;
	//   86  208:iload           4
	//   87  210:istore          6
		i1 = j;
	//   88  212:iload           4
	//   89  214:istore          7
		k = j;
	//   90  216:iload           4
	//   91  218:istore          5
		enumvalue_.add(((Object) (codedinputstream.readMessage(EnumValue.parser(), extensionregistrylite))));
	//   92  220:aload_0         
	//   93  221:getfield        #69  <Field List enumvalue_>
	//   94  224:aload_1         
	//   95  225:invokestatic    #110 <Method Parser EnumValue.parser()>
	//   96  228:aload_2         
	//   97  229:invokevirtual   #114 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//   98  232:invokeinterface #120 <Method boolean List.add(Object)>
	//   99  237:pop             
		flag = flag1;
	//  100  238:iload           9
	//  101  240:istore          8
		  goto _L8
	//* 102  242:goto            461
_L5:
		j = i;
	//  103  245:iload_3         
	//  104  246:istore          4
		if((i & 4) == 4) goto _L12; else goto _L11
	//  105  248:iload_3         
	//  106  249:iconst_4        
	//  107  250:iand            
	//  108  251:iconst_4        
	//  109  252:icmpeq          280
_L11:
		l = i;
	//  110  255:iload_3         
	//  111  256:istore          6
		i1 = i;
	//  112  258:iload_3         
	//  113  259:istore          7
		k = i;
	//  114  261:iload_3         
	//  115  262:istore          5
		options_ = ((List) (new ArrayList()));
	//  116  264:aload_0         
	//  117  265:new             #103 <Class ArrayList>
	//  118  268:dup             
	//  119  269:invokespecial   #104 <Method void ArrayList()>
	//  120  272:putfield        #71  <Field List options_>
		j = i | 4;
	//  121  275:iload_3         
	//  122  276:iconst_4        
	//  123  277:ior             
	//  124  278:istore          4
_L12:
		l = j;
	//  125  280:iload           4
	//  126  282:istore          6
		i1 = j;
	//  127  284:iload           4
	//  128  286:istore          7
		k = j;
	//  129  288:iload           4
	//  130  290:istore          5
		options_.add(((Object) (codedinputstream.readMessage(Option.parser(), extensionregistrylite))));
	//  131  292:aload_0         
	//  132  293:getfield        #71  <Field List options_>
	//  133  296:aload_1         
	//  134  297:invokestatic    #123 <Method Parser Option.parser()>
	//  135  300:aload_2         
	//  136  301:invokevirtual   #114 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  137  304:invokeinterface #120 <Method boolean List.add(Object)>
	//  138  309:pop             
		flag = flag1;
	//  139  310:iload           9
	//  140  312:istore          8
		  goto _L8
	//* 141  314:goto            461
_L6:
		SourceContext.Builder builder;
		builder = null;
	//  142  317:aconst_null     
	//  143  318:astore          11
		l = i;
	//  144  320:iload_3         
	//  145  321:istore          6
		i1 = i;
	//  146  323:iload_3         
	//  147  324:istore          7
		k = i;
	//  148  326:iload_3         
	//  149  327:istore          5
		if(sourceContext_ == null) goto _L14; else goto _L13
	//  150  329:aload_0         
	//  151  330:getfield        #125 <Field SourceContext sourceContext_>
	//  152  333:ifnull          354
_L13:
		l = i;
	//  153  336:iload_3         
	//  154  337:istore          6
		i1 = i;
	//  155  339:iload_3         
	//  156  340:istore          7
		k = i;
	//  157  342:iload_3         
	//  158  343:istore          5
		builder = sourceContext_.toBuilder();
	//  159  345:aload_0         
	//  160  346:getfield        #125 <Field SourceContext sourceContext_>
	//  161  349:invokevirtual   #131 <Method SourceContext$Builder SourceContext.toBuilder()>
	//  162  352:astore          11
_L14:
		l = i;
	//  163  354:iload_3         
	//  164  355:istore          6
		i1 = i;
	//  165  357:iload_3         
	//  166  358:istore          7
		k = i;
	//  167  360:iload_3         
	//  168  361:istore          5
		sourceContext_ = (SourceContext)codedinputstream.readMessage(SourceContext.parser(), extensionregistrylite);
	//  169  363:aload_0         
	//  170  364:aload_1         
	//  171  365:invokestatic    #132 <Method Parser SourceContext.parser()>
	//  172  368:aload_2         
	//  173  369:invokevirtual   #114 <Method MessageLite CodedInputStream.readMessage(Parser, ExtensionRegistryLite)>
	//  174  372:checkcast       #127 <Class SourceContext>
	//  175  375:putfield        #125 <Field SourceContext sourceContext_>
		j = i;
	//  176  378:iload_3         
	//  177  379:istore          4
		flag = flag1;
	//  178  381:iload           9
	//  179  383:istore          8
		if(builder == null) goto _L8; else goto _L15
	//  180  385:aload           11
	//  181  387:ifnull          461
_L15:
		l = i;
	//  182  390:iload_3         
	//  183  391:istore          6
		i1 = i;
	//  184  393:iload_3         
	//  185  394:istore          7
		k = i;
	//  186  396:iload_3         
	//  187  397:istore          5
		builder.mergeFrom(sourceContext_);
	//  188  399:aload           11
	//  189  401:aload_0         
	//  190  402:getfield        #125 <Field SourceContext sourceContext_>
	//  191  405:invokevirtual   #138 <Method SourceContext$Builder SourceContext$Builder.mergeFrom(SourceContext)>
	//  192  408:pop             
		l = i;
	//  193  409:iload_3         
	//  194  410:istore          6
		i1 = i;
	//  195  412:iload_3         
	//  196  413:istore          7
		k = i;
	//  197  415:iload_3         
	//  198  416:istore          5
		sourceContext_ = builder.buildPartial();
	//  199  418:aload_0         
	//  200  419:aload           11
	//  201  421:invokevirtual   #142 <Method SourceContext SourceContext$Builder.buildPartial()>
	//  202  424:putfield        #125 <Field SourceContext sourceContext_>
		j = i;
	//  203  427:iload_3         
	//  204  428:istore          4
		flag = flag1;
	//  205  430:iload           9
	//  206  432:istore          8
		  goto _L8
	//* 207  434:goto            461
_L7:
		l = i;
	//  208  437:iload_3         
	//  209  438:istore          6
		i1 = i;
	//  210  440:iload_3         
	//  211  441:istore          7
		k = i;
	//  212  443:iload_3         
	//  213  444:istore          5
		syntax_ = codedinputstream.readEnum();
	//  214  446:aload_0         
	//  215  447:aload_1         
	//  216  448:invokevirtual   #145 <Method int CodedInputStream.readEnum()>
	//  217  451:putfield        #73  <Field int syntax_>
		flag = flag1;
	//  218  454:iload           9
	//  219  456:istore          8
		j = i;
	//  220  458:iload_3         
	//  221  459:istore          4
_L8:
		i = j;
	//  222  461:iload           4
	//  223  463:istore_3        
		flag1 = flag;
	//  224  464:iload           8
	//  225  466:istore          9
		if(true) goto _L17; else goto _L16
	//  226  468:goto            26
_L16:
		if((i & 2) == 2)
	//* 227  471:iload_3         
	//* 228  472:iconst_2        
	//* 229  473:iand            
	//* 230  474:iconst_2        
	//* 231  475:icmpne          489
			enumvalue_ = Collections.unmodifiableList(enumvalue_);
	//  232  478:aload_0         
	//  233  479:aload_0         
	//  234  480:getfield        #69  <Field List enumvalue_>
	//  235  483:invokestatic    #149 <Method List Collections.unmodifiableList(List)>
	//  236  486:putfield        #69  <Field List enumvalue_>
		if((i & 4) == 4)
	//* 237  489:iload_3         
	//* 238  490:iconst_4        
	//* 239  491:iand            
	//* 240  492:iconst_4        
	//* 241  493:icmpne          507
			options_ = Collections.unmodifiableList(options_);
	//  242  496:aload_0         
	//  243  497:aload_0         
	//  244  498:getfield        #71  <Field List options_>
	//  245  501:invokestatic    #149 <Method List Collections.unmodifiableList(List)>
	//  246  504:putfield        #71  <Field List options_>
		unknownFields = builder1.build();
	//  247  507:aload_0         
	//  248  508:aload           12
	//  249  510:invokevirtual   #155 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  250  513:putfield        #159 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  251  516:aload_0         
	//  252  517:invokevirtual   #162 <Method void makeExtensionsImmutable()>
		return;
	//  253  520:return          
		codedinputstream;
	//  254  521:astore_1        
		k = l;
	//  255  522:iload           6
	//  256  524:istore          5
		throw ((InvalidProtocolBufferException) (codedinputstream)).setUnfinishedMessage(((MessageLite) (this)));
	//  257  526:aload_1         
	//  258  527:aload_0         
	//  259  528:invokevirtual   #166 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  260  531:athrow          
		codedinputstream;
	//  261  532:astore_1        
		k = i1;
	//  262  533:iload           7
	//  263  535:istore          5
		throw (new InvalidProtocolBufferException(((IOException) (codedinputstream)))).setUnfinishedMessage(((MessageLite) (this)));
	//  264  537:new             #76  <Class InvalidProtocolBufferException>
	//  265  540:dup             
	//  266  541:aload_1         
	//  267  542:invokespecial   #169 <Method void InvalidProtocolBufferException(IOException)>
	//  268  545:aload_0         
	//  269  546:invokevirtual   #166 <Method InvalidProtocolBufferException InvalidProtocolBufferException.setUnfinishedMessage(MessageLite)>
	//  270  549:athrow          
		codedinputstream;
	//  271  550:astore_1        
		if((k & 2) == 2)
	//* 272  551:iload           5
	//* 273  553:iconst_2        
	//* 274  554:iand            
	//* 275  555:iconst_2        
	//* 276  556:icmpne          570
			enumvalue_ = Collections.unmodifiableList(enumvalue_);
	//  277  559:aload_0         
	//  278  560:aload_0         
	//  279  561:getfield        #69  <Field List enumvalue_>
	//  280  564:invokestatic    #149 <Method List Collections.unmodifiableList(List)>
	//  281  567:putfield        #69  <Field List enumvalue_>
		if((k & 4) == 4)
	//* 282  570:iload           5
	//* 283  572:iconst_4        
	//* 284  573:iand            
	//* 285  574:iconst_4        
	//* 286  575:icmpne          589
			options_ = Collections.unmodifiableList(options_);
	//  287  578:aload_0         
	//  288  579:aload_0         
	//  289  580:getfield        #71  <Field List options_>
	//  290  583:invokestatic    #149 <Method List Collections.unmodifiableList(List)>
	//  291  586:putfield        #71  <Field List options_>
		unknownFields = builder1.build();
	//  292  589:aload_0         
	//  293  590:aload           12
	//  294  592:invokevirtual   #155 <Method UnknownFieldSet UnknownFieldSet$Builder.build()>
	//  295  595:putfield        #159 <Field UnknownFieldSet unknownFields>
		makeExtensionsImmutable();
	//  296  598:aload_0         
	//  297  599:invokevirtual   #162 <Method void makeExtensionsImmutable()>
		throw codedinputstream;
	//  298  602:aload_1         
	//  299  603:athrow          
	//* 300  604:goto            108
_L2:
		flag = true;
	//  301  607:iconst_1        
	//  302  608:istore          8
		j = i;
	//  303  610:iload_3         
	//  304  611:istore          4
		  goto _L8
	//* 305  613:goto            461
	}

	Enum(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite, _cls1 _pcls1)
		throws InvalidProtocolBufferException
	{
		this(codedinputstream, extensionregistrylite);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #173 <Method void Enum(CodedInputStream, ExtensionRegistryLite)>
	//    4    6:return          
	}

	private Enum(GeneratedMessageV3.Builder builder)
	{
		super(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method void GeneratedMessageV3(GeneratedMessageV3$Builder)>
		memoizedIsInitialized = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #57  <Field byte memoizedIsInitialized>
	//    6   10:return          
	}

	Enum(GeneratedMessageV3.Builder builder, _cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #180 <Method void Enum(GeneratedMessageV3$Builder)>
	//    3    5:return          
	}

	public static Enum getDefaultInstance()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #48  <Field Enum DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public static final Descriptors.Descriptor getDescriptor()
	{
		return TypeProto.internal_static_google_protobuf_Enum_descriptor;
	//    0    0:getstatic       #210 <Field Descriptors$Descriptor TypeProto.internal_static_google_protobuf_Enum_descriptor>
	//    1    3:areturn         
	}

	public static Builder newBuilder()
	{
		return DEFAULT_INSTANCE.toBuilder();
	//    0    0:getstatic       #48  <Field Enum DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #213 <Method Enum$Builder toBuilder()>
	//    2    6:areturn         
	}

	public static Builder newBuilder(Enum enum)
	{
	/* block-local class not found */
	class Builder {}

		return DEFAULT_INSTANCE.toBuilder().mergeFrom(enum);
	//    0    0:getstatic       #48  <Field Enum DEFAULT_INSTANCE>
	//    1    3:invokevirtual   #213 <Method Enum$Builder toBuilder()>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #216 <Method Enum$Builder Enum$Builder.mergeFrom(Enum)>
	//    4   10:areturn         
	}

	public static Enum parseDelimitedFrom(InputStream inputstream)
		throws IOException
	{
		return (Enum)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #222 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Enum>
	//    4   10:areturn         
	}

	public static Enum parseDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Enum)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #226 <Method Message GeneratedMessageV3.parseDelimitedWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Enum>
	//    5   11:areturn         
	}

	public static Enum parseFrom(ByteString bytestring)
		throws InvalidProtocolBufferException
	{
		return (Enum)PARSER.parseFrom(bytestring);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #233 <Method Object Parser.parseFrom(ByteString)>
	//    3    9:checkcast       #2   <Class Enum>
	//    4   12:areturn         
	}

	public static Enum parseFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Enum)PARSER.parseFrom(bytestring, extensionregistrylite);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #237 <Method Object Parser.parseFrom(ByteString, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Enum>
	//    5   13:areturn         
	}

	public static Enum parseFrom(CodedInputStream codedinputstream)
		throws IOException
	{
		return (Enum)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #242 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream)>
	//    3    7:checkcast       #2   <Class Enum>
	//    4   10:areturn         
	}

	public static Enum parseFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Enum)GeneratedMessageV3.parseWithIOException(PARSER, codedinputstream, extensionregistrylite);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #246 <Method Message GeneratedMessageV3.parseWithIOException(Parser, CodedInputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Enum>
	//    5   11:areturn         
	}

	public static Enum parseFrom(InputStream inputstream)
		throws IOException
	{
		return (Enum)GeneratedMessageV3.parseWithIOException(PARSER, inputstream);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokestatic    #248 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream)>
	//    3    7:checkcast       #2   <Class Enum>
	//    4   10:areturn         
	}

	public static Enum parseFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		return (Enum)GeneratedMessageV3.parseWithIOException(PARSER, inputstream, extensionregistrylite);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokestatic    #250 <Method Message GeneratedMessageV3.parseWithIOException(Parser, InputStream, ExtensionRegistryLite)>
	//    4    8:checkcast       #2   <Class Enum>
	//    5   11:areturn         
	}

	public static Enum parseFrom(ByteBuffer bytebuffer)
		throws InvalidProtocolBufferException
	{
		return (Enum)PARSER.parseFrom(bytebuffer);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #254 <Method Object Parser.parseFrom(ByteBuffer)>
	//    3    9:checkcast       #2   <Class Enum>
	//    4   12:areturn         
	}

	public static Enum parseFrom(ByteBuffer bytebuffer, ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Enum)PARSER.parseFrom(bytebuffer, extensionregistrylite);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #258 <Method Object Parser.parseFrom(ByteBuffer, ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Enum>
	//    5   13:areturn         
	}

	public static Enum parseFrom(byte abyte0[])
		throws InvalidProtocolBufferException
	{
		return (Enum)PARSER.parseFrom(abyte0);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:invokeinterface #262 <Method Object Parser.parseFrom(byte[])>
	//    3    9:checkcast       #2   <Class Enum>
	//    4   12:areturn         
	}

	public static Enum parseFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
		throws InvalidProtocolBufferException
	{
		return (Enum)PARSER.parseFrom(abyte0, extensionregistrylite);
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #266 <Method Object Parser.parseFrom(byte[], ExtensionRegistryLite)>
	//    4   10:checkcast       #2   <Class Enum>
	//    5   13:areturn         
	}

	public static Parser parser()
	{
		return PARSER;
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof Enum))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Enum>
	//*   7   11:ifne            20
			return super.equals(obj);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #270 <Method boolean GeneratedMessageV3.equals(Object)>
	//   11   19:ireturn         
		obj = ((Object) ((Enum)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Enum>
	//   14   24:astore_1        
		boolean flag;
		if(true && getName().equals(((Object) (((Enum) (obj)).getName()))))
	//*  15   25:iconst_1        
	//*  16   26:ifeq            48
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #273 <Method String getName()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #273 <Method String getName()>
	//*  21   37:invokevirtual   #276 <Method boolean String.equals(Object)>
	//*  22   40:ifeq            48
			flag = true;
	//   23   43:iconst_1        
	//   24   44:istore_2        
		else
	//*  25   45:goto            50
			flag = false;
	//   26   48:iconst_0        
	//   27   49:istore_2        
		if(flag && getEnumvalueList().equals(((Object) (((Enum) (obj)).getEnumvalueList()))))
	//*  28   50:iload_2         
	//*  29   51:ifeq            75
	//*  30   54:aload_0         
	//*  31   55:invokevirtual   #279 <Method List getEnumvalueList()>
	//*  32   58:aload_1         
	//*  33   59:invokevirtual   #279 <Method List getEnumvalueList()>
	//*  34   62:invokeinterface #280 <Method boolean List.equals(Object)>
	//*  35   67:ifeq            75
			flag = true;
	//   36   70:iconst_1        
	//   37   71:istore_2        
		else
	//*  38   72:goto            77
			flag = false;
	//   39   75:iconst_0        
	//   40   76:istore_2        
		if(flag && getOptionsList().equals(((Object) (((Enum) (obj)).getOptionsList()))))
	//*  41   77:iload_2         
	//*  42   78:ifeq            102
	//*  43   81:aload_0         
	//*  44   82:invokevirtual   #283 <Method List getOptionsList()>
	//*  45   85:aload_1         
	//*  46   86:invokevirtual   #283 <Method List getOptionsList()>
	//*  47   89:invokeinterface #280 <Method boolean List.equals(Object)>
	//*  48   94:ifeq            102
			flag = true;
	//   49   97:iconst_1        
	//   50   98:istore_2        
		else
	//*  51   99:goto            104
			flag = false;
	//   52  102:iconst_0        
	//   53  103:istore_2        
		if(flag && hasSourceContext() == ((Enum) (obj)).hasSourceContext())
	//*  54  104:iload_2         
	//*  55  105:ifeq            124
	//*  56  108:aload_0         
	//*  57  109:invokevirtual   #287 <Method boolean hasSourceContext()>
	//*  58  112:aload_1         
	//*  59  113:invokevirtual   #287 <Method boolean hasSourceContext()>
	//*  60  116:icmpne          124
			flag = true;
	//   61  119:iconst_1        
	//   62  120:istore_2        
		else
	//*  63  121:goto            126
			flag = false;
	//   64  124:iconst_0        
	//   65  125:istore_2        
		boolean flag1 = flag;
	//   66  126:iload_2         
	//   67  127:istore_3        
		if(hasSourceContext())
	//*  68  128:aload_0         
	//*  69  129:invokevirtual   #287 <Method boolean hasSourceContext()>
	//*  70  132:ifeq            160
			if(flag && getSourceContext().equals(((Object) (((Enum) (obj)).getSourceContext()))))
	//*  71  135:iload_2         
	//*  72  136:ifeq            158
	//*  73  139:aload_0         
	//*  74  140:invokevirtual   #290 <Method SourceContext getSourceContext()>
	//*  75  143:aload_1         
	//*  76  144:invokevirtual   #290 <Method SourceContext getSourceContext()>
	//*  77  147:invokevirtual   #291 <Method boolean SourceContext.equals(Object)>
	//*  78  150:ifeq            158
				flag1 = true;
	//   79  153:iconst_1        
	//   80  154:istore_3        
			else
	//*  81  155:goto            160
				flag1 = false;
	//   82  158:iconst_0        
	//   83  159:istore_3        
		if(flag1 && syntax_ == ((Enum) (obj)).syntax_)
	//*  84  160:iload_3         
	//*  85  161:ifeq            180
	//*  86  164:aload_0         
	//*  87  165:getfield        #73  <Field int syntax_>
	//*  88  168:aload_1         
	//*  89  169:getfield        #73  <Field int syntax_>
	//*  90  172:icmpne          180
			flag = true;
	//   91  175:iconst_1        
	//   92  176:istore_2        
		else
	//*  93  177:goto            182
			flag = false;
	//   94  180:iconst_0        
	//   95  181:istore_2        
		return flag && unknownFields.equals(((Object) (((Enum) (obj)).unknownFields)));
	//   96  182:iload_2         
	//   97  183:ifeq            202
	//   98  186:aload_0         
	//   99  187:getfield        #159 <Field UnknownFieldSet unknownFields>
	//  100  190:aload_1         
	//  101  191:getfield        #159 <Field UnknownFieldSet unknownFields>
	//  102  194:invokevirtual   #292 <Method boolean UnknownFieldSet.equals(Object)>
	//  103  197:ifeq            202
	//  104  200:iconst_1        
	//  105  201:ireturn         
	//  106  202:iconst_0        
	//  107  203:ireturn         
	}

	public Enum getDefaultInstanceForType()
	{
		return DEFAULT_INSTANCE;
	//    0    0:getstatic       #48  <Field Enum DEFAULT_INSTANCE>
	//    1    3:areturn         
	}

	public volatile Message getDefaultInstanceForType()
	{
		return ((Message) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #296 <Method Enum getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public volatile MessageLite getDefaultInstanceForType()
	{
		return ((MessageLite) (getDefaultInstanceForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #296 <Method Enum getDefaultInstanceForType()>
	//    2    4:areturn         
	}

	public EnumValue getEnumvalue(int i)
	{
		return (EnumValue)enumvalue_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List enumvalue_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #303 <Method Object List.get(int)>
	//    4   10:checkcast       #106 <Class EnumValue>
	//    5   13:areturn         
	}

	public int getEnumvalueCount()
	{
		return enumvalue_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List enumvalue_>
	//    2    4:invokeinterface #307 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getEnumvalueList()
	{
		return enumvalue_;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List enumvalue_>
	//    2    4:areturn         
	}

	public EnumValueOrBuilder getEnumvalueOrBuilder(int i)
	{
		return (EnumValueOrBuilder)enumvalue_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List enumvalue_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #303 <Method Object List.get(int)>
	//    4   10:checkcast       #312 <Class EnumValueOrBuilder>
	//    5   13:areturn         
	}

	public List getEnumvalueOrBuilderList()
	{
		return enumvalue_;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List enumvalue_>
	//    2    4:areturn         
	}

	public String getName()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #275 <Class String>
	//*   5    9:ifeq            17
		{
			return (String)obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #275 <Class String>
	//    8   16:areturn         
		} else
		{
			obj = ((Object) (((ByteString)obj).toStringUtf8()));
	//    9   17:aload_1         
	//   10   18:checkcast       #316 <Class ByteString>
	//   11   21:invokevirtual   #319 <Method String ByteString.toStringUtf8()>
	//   12   24:astore_1        
			name_ = obj;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #61  <Field Object name_>
			return ((String) (obj));
	//   16   30:aload_1         
	//   17   31:areturn         
		}
	}

	public ByteString getNameBytes()
	{
		Object obj = name_;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Object name_>
	//    2    4:astore_1        
		if(obj instanceof String)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #275 <Class String>
	//*   5    9:ifeq            27
		{
			obj = ((Object) (ByteString.copyFromUtf8((String)obj)));
	//    6   12:aload_1         
	//    7   13:checkcast       #275 <Class String>
	//    8   16:invokestatic    #325 <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:astore_1        
			name_ = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #61  <Field Object name_>
			return ((ByteString) (obj));
	//   13   25:aload_1         
	//   14   26:areturn         
		} else
		{
			return (ByteString)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #316 <Class ByteString>
	//   17   31:areturn         
		}
	}

	public Option getOptions(int i)
	{
		return (Option)options_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List options_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #303 <Method Object List.get(int)>
	//    4   10:checkcast       #122 <Class Option>
	//    5   13:areturn         
	}

	public int getOptionsCount()
	{
		return options_.size();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List options_>
	//    2    4:invokeinterface #307 <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getOptionsList()
	{
		return options_;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List options_>
	//    2    4:areturn         
	}

	public OptionOrBuilder getOptionsOrBuilder(int i)
	{
		return (OptionOrBuilder)options_.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List options_>
	//    2    4:iload_1         
	//    3    5:invokeinterface #303 <Method Object List.get(int)>
	//    4   10:checkcast       #333 <Class OptionOrBuilder>
	//    5   13:areturn         
	}

	public List getOptionsOrBuilderList()
	{
		return options_;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List options_>
	//    2    4:areturn         
	}

	public Parser getParserForType()
	{
		return PARSER;
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:areturn         
	}

	public int getSerializedSize()
	{
		int i = memoizedSize;
	//    0    0:aload_0         
	//    1    1:getfield        #340 <Field int memoizedSize>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		i = 0;
	//    8   12:iconst_0        
	//    9   13:istore_1        
		if(!getNameBytes().isEmpty())
	//*  10   14:aload_0         
	//*  11   15:invokevirtual   #342 <Method ByteString getNameBytes()>
	//*  12   18:invokevirtual   #345 <Method boolean ByteString.isEmpty()>
	//*  13   21:ifne            35
			i = GeneratedMessageV3.computeStringSize(1, name_) + 0;
	//   14   24:iconst_1        
	//   15   25:aload_0         
	//   16   26:getfield        #61  <Field Object name_>
	//   17   29:invokestatic    #349 <Method int GeneratedMessageV3.computeStringSize(int, Object)>
	//   18   32:iconst_0        
	//   19   33:iadd            
	//   20   34:istore_1        
		for(int j = 0; j < enumvalue_.size(); j++)
	//*  21   35:iconst_0        
	//*  22   36:istore_2        
	//*  23   37:iload_2         
	//*  24   38:aload_0         
	//*  25   39:getfield        #69  <Field List enumvalue_>
	//*  26   42:invokeinterface #307 <Method int List.size()>
	//*  27   47:icmpge          77
			i += CodedOutputStream.computeMessageSize(2, (MessageLite)enumvalue_.get(j));
	//   28   50:iload_1         
	//   29   51:iconst_2        
	//   30   52:aload_0         
	//   31   53:getfield        #69  <Field List enumvalue_>
	//   32   56:iload_2         
	//   33   57:invokeinterface #303 <Method Object List.get(int)>
	//   34   62:checkcast       #351 <Class MessageLite>
	//   35   65:invokestatic    #357 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   36   68:iadd            
	//   37   69:istore_1        

	//   38   70:iload_2         
	//   39   71:iconst_1        
	//   40   72:iadd            
	//   41   73:istore_2        
	//*  42   74:goto            37
		for(int k = 0; k < options_.size(); k++)
	//*  43   77:iconst_0        
	//*  44   78:istore_2        
	//*  45   79:iload_2         
	//*  46   80:aload_0         
	//*  47   81:getfield        #71  <Field List options_>
	//*  48   84:invokeinterface #307 <Method int List.size()>
	//*  49   89:icmpge          119
			i += CodedOutputStream.computeMessageSize(3, (MessageLite)options_.get(k));
	//   50   92:iload_1         
	//   51   93:iconst_3        
	//   52   94:aload_0         
	//   53   95:getfield        #71  <Field List options_>
	//   54   98:iload_2         
	//   55   99:invokeinterface #303 <Method Object List.get(int)>
	//   56  104:checkcast       #351 <Class MessageLite>
	//   57  107:invokestatic    #357 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   58  110:iadd            
	//   59  111:istore_1        

	//   60  112:iload_2         
	//   61  113:iconst_1        
	//   62  114:iadd            
	//   63  115:istore_2        
	//*  64  116:goto            79
		int l = i;
	//   65  119:iload_1         
	//   66  120:istore_2        
		if(sourceContext_ != null)
	//*  67  121:aload_0         
	//*  68  122:getfield        #125 <Field SourceContext sourceContext_>
	//*  69  125:ifnull          139
			l = i + CodedOutputStream.computeMessageSize(4, ((MessageLite) (getSourceContext())));
	//   70  128:iload_1         
	//   71  129:iconst_4        
	//   72  130:aload_0         
	//   73  131:invokevirtual   #290 <Method SourceContext getSourceContext()>
	//   74  134:invokestatic    #357 <Method int CodedOutputStream.computeMessageSize(int, MessageLite)>
	//   75  137:iadd            
	//   76  138:istore_2        
		i = l;
	//   77  139:iload_2         
	//   78  140:istore_1        
		if(syntax_ != Syntax.SYNTAX_PROTO2.getNumber())
	//*  79  141:aload_0         
	//*  80  142:getfield        #73  <Field int syntax_>
	//*  81  145:getstatic       #363 <Field Syntax Syntax.SYNTAX_PROTO2>
	//*  82  148:invokevirtual   #366 <Method int Syntax.getNumber()>
	//*  83  151:icmpeq          165
			i = l + CodedOutputStream.computeEnumSize(5, syntax_);
	//   84  154:iload_2         
	//   85  155:iconst_5        
	//   86  156:aload_0         
	//   87  157:getfield        #73  <Field int syntax_>
	//   88  160:invokestatic    #370 <Method int CodedOutputStream.computeEnumSize(int, int)>
	//   89  163:iadd            
	//   90  164:istore_1        
		i += unknownFields.getSerializedSize();
	//   91  165:iload_1         
	//   92  166:aload_0         
	//   93  167:getfield        #159 <Field UnknownFieldSet unknownFields>
	//   94  170:invokevirtual   #372 <Method int UnknownFieldSet.getSerializedSize()>
	//   95  173:iadd            
	//   96  174:istore_1        
		memoizedSize = i;
	//   97  175:aload_0         
	//   98  176:iload_1         
	//   99  177:putfield        #340 <Field int memoizedSize>
		return i;
	//  100  180:iload_1         
	//  101  181:ireturn         
	}

	public SourceContext getSourceContext()
	{
		if(sourceContext_ == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field SourceContext sourceContext_>
	//*   2    4:ifnonnull       11
			return SourceContext.getDefaultInstance();
	//    3    7:invokestatic    #374 <Method SourceContext SourceContext.getDefaultInstance()>
	//    4   10:areturn         
		else
			return sourceContext_;
	//    5   11:aload_0         
	//    6   12:getfield        #125 <Field SourceContext sourceContext_>
	//    7   15:areturn         
	}

	public SourceContextOrBuilder getSourceContextOrBuilder()
	{
		return ((SourceContextOrBuilder) (getSourceContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method SourceContext getSourceContext()>
	//    2    4:areturn         
	}

	public Syntax getSyntax()
	{
		Syntax syntax = Syntax.valueOf(syntax_);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int syntax_>
	//    2    4:invokestatic    #382 <Method Syntax Syntax.valueOf(int)>
	//    3    7:astore_1        
		if(syntax == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return Syntax.UNRECOGNIZED;
	//    6   12:getstatic       #385 <Field Syntax Syntax.UNRECOGNIZED>
	//    7   15:areturn         
		else
			return syntax;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public int getSyntaxValue()
	{
		return syntax_;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int syntax_>
	//    2    4:ireturn         
	}

	public final UnknownFieldSet getUnknownFields()
	{
		return unknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field UnknownFieldSet unknownFields>
	//    2    4:areturn         
	}

	public boolean hasSourceContext()
	{
		return sourceContext_ != null;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field SourceContext sourceContext_>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int hashCode()
	{
		if(memoizedHashCode != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #391 <Field int memoizedHashCode>
	//*   2    4:ifeq            12
			return memoizedHashCode;
	//    3    7:aload_0         
	//    4    8:getfield        #391 <Field int memoizedHashCode>
	//    5   11:ireturn         
		int j = ((((Object) (getDescriptor())).hashCode() + 779) * 37 + 1) * 53 + getName().hashCode();
	//    6   12:invokestatic    #393 <Method Descriptors$Descriptor getDescriptor()>
	//    7   15:invokevirtual   #397 <Method int Object.hashCode()>
	//    8   18:sipush          779
	//    9   21:iadd            
	//   10   22:bipush          37
	//   11   24:imul            
	//   12   25:iconst_1        
	//   13   26:iadd            
	//   14   27:bipush          53
	//   15   29:imul            
	//   16   30:aload_0         
	//   17   31:invokevirtual   #273 <Method String getName()>
	//   18   34:invokevirtual   #398 <Method int String.hashCode()>
	//   19   37:iadd            
	//   20   38:istore_2        
		int i = j;
	//   21   39:iload_2         
	//   22   40:istore_1        
		if(getEnumvalueCount() > 0)
	//*  23   41:aload_0         
	//*  24   42:invokevirtual   #400 <Method int getEnumvalueCount()>
	//*  25   45:ifle            68
			i = (j * 37 + 2) * 53 + getEnumvalueList().hashCode();
	//   26   48:iload_2         
	//   27   49:bipush          37
	//   28   51:imul            
	//   29   52:iconst_2        
	//   30   53:iadd            
	//   31   54:bipush          53
	//   32   56:imul            
	//   33   57:aload_0         
	//   34   58:invokevirtual   #279 <Method List getEnumvalueList()>
	//   35   61:invokeinterface #401 <Method int List.hashCode()>
	//   36   66:iadd            
	//   37   67:istore_1        
		j = i;
	//   38   68:iload_1         
	//   39   69:istore_2        
		if(getOptionsCount() > 0)
	//*  40   70:aload_0         
	//*  41   71:invokevirtual   #403 <Method int getOptionsCount()>
	//*  42   74:ifle            97
			j = (i * 37 + 3) * 53 + getOptionsList().hashCode();
	//   43   77:iload_1         
	//   44   78:bipush          37
	//   45   80:imul            
	//   46   81:iconst_3        
	//   47   82:iadd            
	//   48   83:bipush          53
	//   49   85:imul            
	//   50   86:aload_0         
	//   51   87:invokevirtual   #283 <Method List getOptionsList()>
	//   52   90:invokeinterface #401 <Method int List.hashCode()>
	//   53   95:iadd            
	//   54   96:istore_2        
		i = j;
	//   55   97:iload_2         
	//   56   98:istore_1        
		if(hasSourceContext())
	//*  57   99:aload_0         
	//*  58  100:invokevirtual   #287 <Method boolean hasSourceContext()>
	//*  59  103:ifeq            124
			i = (j * 37 + 4) * 53 + getSourceContext().hashCode();
	//   60  106:iload_2         
	//   61  107:bipush          37
	//   62  109:imul            
	//   63  110:iconst_4        
	//   64  111:iadd            
	//   65  112:bipush          53
	//   66  114:imul            
	//   67  115:aload_0         
	//   68  116:invokevirtual   #290 <Method SourceContext getSourceContext()>
	//   69  119:invokevirtual   #404 <Method int SourceContext.hashCode()>
	//   70  122:iadd            
	//   71  123:istore_1        
		i = ((i * 37 + 5) * 53 + syntax_) * 29 + unknownFields.hashCode();
	//   72  124:iload_1         
	//   73  125:bipush          37
	//   74  127:imul            
	//   75  128:iconst_5        
	//   76  129:iadd            
	//   77  130:bipush          53
	//   78  132:imul            
	//   79  133:aload_0         
	//   80  134:getfield        #73  <Field int syntax_>
	//   81  137:iadd            
	//   82  138:bipush          29
	//   83  140:imul            
	//   84  141:aload_0         
	//   85  142:getfield        #159 <Field UnknownFieldSet unknownFields>
	//   86  145:invokevirtual   #405 <Method int UnknownFieldSet.hashCode()>
	//   87  148:iadd            
	//   88  149:istore_1        
		memoizedHashCode = i;
	//   89  150:aload_0         
	//   90  151:iload_1         
	//   91  152:putfield        #391 <Field int memoizedHashCode>
		return i;
	//   92  155:iload_1         
	//   93  156:ireturn         
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
	{
		return TypeProto.internal_static_google_protobuf_Enum_fieldAccessorTable.ensureFieldAccessorsInitialized(com/google/protobuf/Enum, com/google/protobuf/Enum$Builder);
	//    0    0:getstatic       #411 <Field GeneratedMessageV3$FieldAccessorTable TypeProto.internal_static_google_protobuf_Enum_fieldAccessorTable>
	//    1    3:ldc1            #2   <Class Enum>
	//    2    5:ldc1            #8   <Class Enum$Builder>
	//    3    7:invokevirtual   #417 <Method GeneratedMessageV3$FieldAccessorTable GeneratedMessageV3$FieldAccessorTable.ensureFieldAccessorsInitialized(Class, Class)>
	//    4   10:areturn         
	}

	public final boolean isInitialized()
	{
		byte byte0 = memoizedIsInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field byte memoizedIsInitialized>
	//    2    4:istore_1        
		if(byte0 == 1)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(byte0 == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            18
		{
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		} else
		{
			memoizedIsInitialized = 1;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #57  <Field byte memoizedIsInitialized>
			return true;
	//   15   23:iconst_1        
	//   16   24:ireturn         
		}
	}

	public Builder newBuilderForType()
	{
		return newBuilder();
	//    0    0:invokestatic    #421 <Method Enum$Builder newBuilder()>
	//    1    3:areturn         
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return new Builder(builderparent, ((_cls1) (null)));
	//    0    0:new             #8   <Class Enum$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #425 <Method void Enum$Builder(GeneratedMessageV3$BuilderParent, Enum$1)>
	//    5    9:areturn         
	}

	public volatile Message.Builder newBuilderForType()
	{
		return ((Message.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #428 <Method Enum$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	protected volatile Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderparent)
	{
		return ((Message.Builder) (newBuilderForType(builderparent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #431 <Method Enum$Builder newBuilderForType(GeneratedMessageV3$BuilderParent)>
	//    3    5:areturn         
	}

	public volatile MessageLite.Builder newBuilderForType()
	{
		return ((MessageLite.Builder) (newBuilderForType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #428 <Method Enum$Builder newBuilderForType()>
	//    2    4:areturn         
	}

	public Builder toBuilder()
	{
		if(this == DEFAULT_INSTANCE)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #48  <Field Enum DEFAULT_INSTANCE>
	//*   2    4:if_acmpne       16
			return new Builder(((_cls1) (null)));
	//    3    7:new             #8   <Class Enum$Builder>
	//    4   10:dup             
	//    5   11:aconst_null     
	//    6   12:invokespecial   #435 <Method void Enum$Builder(Enum$1)>
	//    7   15:areturn         
		else
			return (new Builder(((_cls1) (null)))).mergeFrom(this);
	//    8   16:new             #8   <Class Enum$Builder>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #435 <Method void Enum$Builder(Enum$1)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #216 <Method Enum$Builder Enum$Builder.mergeFrom(Enum)>
	//   14   28:areturn         
	}

	public volatile Message.Builder toBuilder()
	{
		return ((Message.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #213 <Method Enum$Builder toBuilder()>
	//    2    4:areturn         
	}

	public volatile MessageLite.Builder toBuilder()
	{
		return ((MessageLite.Builder) (toBuilder()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #213 <Method Enum$Builder toBuilder()>
	//    2    4:areturn         
	}

	public void writeTo(CodedOutputStream codedoutputstream)
		throws IOException
	{
		if(!getNameBytes().isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #342 <Method ByteString getNameBytes()>
	//*   2    4:invokevirtual   #345 <Method boolean ByteString.isEmpty()>
	//*   3    7:ifne            19
			GeneratedMessageV3.writeString(codedoutputstream, 1, name_);
	//    4   10:aload_1         
	//    5   11:iconst_1        
	//    6   12:aload_0         
	//    7   13:getfield        #61  <Field Object name_>
	//    8   16:invokestatic    #441 <Method void GeneratedMessageV3.writeString(CodedOutputStream, int, Object)>
		for(int i = 0; i < enumvalue_.size(); i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:aload_0         
	//*  13   23:getfield        #69  <Field List enumvalue_>
	//*  14   26:invokeinterface #307 <Method int List.size()>
	//*  15   31:icmpge          59
			codedoutputstream.writeMessage(2, (MessageLite)enumvalue_.get(i));
	//   16   34:aload_1         
	//   17   35:iconst_2        
	//   18   36:aload_0         
	//   19   37:getfield        #69  <Field List enumvalue_>
	//   20   40:iload_2         
	//   21   41:invokeinterface #303 <Method Object List.get(int)>
	//   22   46:checkcast       #351 <Class MessageLite>
	//   23   49:invokevirtual   #445 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   24   52:iload_2         
	//   25   53:iconst_1        
	//   26   54:iadd            
	//   27   55:istore_2        
	//*  28   56:goto            21
		for(int j = 0; j < options_.size(); j++)
	//*  29   59:iconst_0        
	//*  30   60:istore_2        
	//*  31   61:iload_2         
	//*  32   62:aload_0         
	//*  33   63:getfield        #71  <Field List options_>
	//*  34   66:invokeinterface #307 <Method int List.size()>
	//*  35   71:icmpge          99
			codedoutputstream.writeMessage(3, (MessageLite)options_.get(j));
	//   36   74:aload_1         
	//   37   75:iconst_3        
	//   38   76:aload_0         
	//   39   77:getfield        #71  <Field List options_>
	//   40   80:iload_2         
	//   41   81:invokeinterface #303 <Method Object List.get(int)>
	//   42   86:checkcast       #351 <Class MessageLite>
	//   43   89:invokevirtual   #445 <Method void CodedOutputStream.writeMessage(int, MessageLite)>

	//   44   92:iload_2         
	//   45   93:iconst_1        
	//   46   94:iadd            
	//   47   95:istore_2        
	//*  48   96:goto            61
		if(sourceContext_ != null)
	//*  49   99:aload_0         
	//*  50  100:getfield        #125 <Field SourceContext sourceContext_>
	//*  51  103:ifnull          115
			codedoutputstream.writeMessage(4, ((MessageLite) (getSourceContext())));
	//   52  106:aload_1         
	//   53  107:iconst_4        
	//   54  108:aload_0         
	//   55  109:invokevirtual   #290 <Method SourceContext getSourceContext()>
	//   56  112:invokevirtual   #445 <Method void CodedOutputStream.writeMessage(int, MessageLite)>
		if(syntax_ != Syntax.SYNTAX_PROTO2.getNumber())
	//*  57  115:aload_0         
	//*  58  116:getfield        #73  <Field int syntax_>
	//*  59  119:getstatic       #363 <Field Syntax Syntax.SYNTAX_PROTO2>
	//*  60  122:invokevirtual   #366 <Method int Syntax.getNumber()>
	//*  61  125:icmpeq          137
			codedoutputstream.writeEnum(5, syntax_);
	//   62  128:aload_1         
	//   63  129:iconst_5        
	//   64  130:aload_0         
	//   65  131:getfield        #73  <Field int syntax_>
	//   66  134:invokevirtual   #449 <Method void CodedOutputStream.writeEnum(int, int)>
		unknownFields.writeTo(codedoutputstream);
	//   67  137:aload_0         
	//   68  138:getfield        #159 <Field UnknownFieldSet unknownFields>
	//   69  141:aload_1         
	//   70  142:invokevirtual   #451 <Method void UnknownFieldSet.writeTo(CodedOutputStream)>
	//   71  145:return          
	}

	private static final Enum DEFAULT_INSTANCE = new Enum();
	public static final int ENUMVALUE_FIELD_NUMBER = 2;
	public static final int NAME_FIELD_NUMBER = 1;
	public static final int OPTIONS_FIELD_NUMBER = 3;
	private static final Parser PARSER = new _cls1();
	public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
	public static final int SYNTAX_FIELD_NUMBER = 5;
	private static final long serialVersionUID = 0L;
	private int bitField0_;
	private List enumvalue_;
	private byte memoizedIsInitialized;
	private volatile Object name_;
	private List options_;
	private SourceContext sourceContext_;
	private int syntax_;

	static 
	{
	//    0    0:new             #2   <Class Enum>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void Enum()>
	//    3    7:putstatic       #48  <Field Enum DEFAULT_INSTANCE>
	//    4   10:new             #50  <Class Enum$1>
	//    5   13:dup             
	//    6   14:invokespecial   #51  <Method void Enum$1()>
	//    7   17:putstatic       #53  <Field Parser PARSER>
	//*   8   20:return          
	}


/*
	static Object access$300(Enum enum)
	{
		return enum.name_;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Object name_>
	//    2    4:areturn         
	}

*/


/*
	static Object access$302(Enum enum, Object obj)
	{
		enum.name_ = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field Object name_>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$400(Enum enum)
	{
		return enum.enumvalue_;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field List enumvalue_>
	//    2    4:areturn         
	}

*/


/*
	static List access$402(Enum enum, List list)
	{
		enum.enumvalue_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field List enumvalue_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static List access$500(Enum enum)
	{
		return enum.options_;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field List options_>
	//    2    4:areturn         
	}

*/


/*
	static List access$502(Enum enum, List list)
	{
		enum.options_ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #71  <Field List options_>
		return list;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static SourceContext access$602(Enum enum, SourceContext sourcecontext)
	{
		enum.sourceContext_ = sourcecontext;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field SourceContext sourceContext_>
		return sourcecontext;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$700(Enum enum)
	{
		return enum.syntax_;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int syntax_>
	//    2    4:ireturn         
	}

*/


/*
	static int access$702(Enum enum, int i)
	{
		enum.syntax_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field int syntax_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$802(Enum enum, int i)
	{
		enum.bitField0_ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #199 <Field int bitField0_>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Parser access$900()
	{
		return PARSER;
	//    0    0:getstatic       #53  <Field Parser PARSER>
	//    1    3:areturn         
	}

*/

	/* member class not found */
	class _cls1 {}

}
