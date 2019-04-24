// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.regions;

import java.util.*;

// Referenced classes of package com.amazonaws.regions:
//			Region

class RegionDefaults
{

	public static List a()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #8   <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #12  <Method void ArrayList()>
	//    3    7:astore_0        
		Region region = new Region("us-east-1", "");
	//    4    8:new             #14  <Class Region>
	//    5   11:dup             
	//    6   12:ldc1            #16  <String "us-east-1">
	//    7   14:ldc1            #18  <String "">
	//    8   16:invokespecial   #21  <Method void Region(String, String)>
	//    9   19:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokeinterface #27  <Method boolean List.add(Object)>
	//   13   27:pop             
		a(region, "s3", "s3.amazonaws.com", true, true);
	//   14   28:aload_1         
	//   15   29:ldc1            #29  <String "s3">
	//   16   31:ldc1            #31  <String "s3.amazonaws.com">
	//   17   33:iconst_1        
	//   18   34:iconst_1        
	//   19   35:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//   20   38:aload_1         
	//   21   39:ldc1            #36  <String "sts">
	//   22   41:ldc1            #38  <String "sts.amazonaws.com">
	//   23   43:iconst_0        
	//   24   44:iconst_1        
	//   25   45:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.us-east-1.amazonaws.com", true, true);
	//   26   48:aload_1         
	//   27   49:ldc1            #40  <String "monitoring">
	//   28   51:ldc1            #42  <String "monitoring.us-east-1.amazonaws.com">
	//   29   53:iconst_1        
	//   30   54:iconst_1        
	//   31   55:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.us-east-1.amazonaws.com", true, true);
	//   32   58:aload_1         
	//   33   59:ldc1            #44  <String "sns">
	//   34   61:ldc1            #46  <String "sns.us-east-1.amazonaws.com">
	//   35   63:iconst_1        
	//   36   64:iconst_1        
	//   37   65:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.us-east-1.amazonaws.com", true, true);
	//   38   68:aload_1         
	//   39   69:ldc1            #48  <String "autoscaling">
	//   40   71:ldc1            #50  <String "autoscaling.us-east-1.amazonaws.com">
	//   41   73:iconst_1        
	//   42   74:iconst_1        
	//   43   75:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sdb", "sdb.amazonaws.com", true, true);
	//   44   78:aload_1         
	//   45   79:ldc1            #52  <String "sdb">
	//   46   81:ldc1            #54  <String "sdb.amazonaws.com">
	//   47   83:iconst_1        
	//   48   84:iconst_1        
	//   49   85:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.us-east-1.amazonaws.com", true, true);
	//   50   88:aload_1         
	//   51   89:ldc1            #56  <String "dynamodb">
	//   52   91:ldc1            #58  <String "dynamodb.us-east-1.amazonaws.com">
	//   53   93:iconst_1        
	//   54   94:iconst_1        
	//   55   95:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.us-east-1.amazonaws.com", true, true);
	//   56   98:aload_1         
	//   57   99:ldc1            #60  <String "ec2">
	//   58  101:ldc1            #62  <String "ec2.us-east-1.amazonaws.com">
	//   59  103:iconst_1        
	//   60  104:iconst_1        
	//   61  105:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kinesis", "kinesis.us-east-1.amazonaws.com", false, true);
	//   62  108:aload_1         
	//   63  109:ldc1            #64  <String "kinesis">
	//   64  111:ldc1            #66  <String "kinesis.us-east-1.amazonaws.com">
	//   65  113:iconst_0        
	//   66  114:iconst_1        
	//   67  115:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "firehose", "firehose.us-east-1.amazonaws.com", false, true);
	//   68  118:aload_1         
	//   69  119:ldc1            #68  <String "firehose">
	//   70  121:ldc1            #70  <String "firehose.us-east-1.amazonaws.com">
	//   71  123:iconst_0        
	//   72  124:iconst_1        
	//   73  125:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "lambda", "lambda.us-east-1.amazonaws.com", false, true);
	//   74  128:aload_1         
	//   75  129:ldc1            #72  <String "lambda">
	//   76  131:ldc1            #74  <String "lambda.us-east-1.amazonaws.com">
	//   77  133:iconst_0        
	//   78  134:iconst_1        
	//   79  135:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.us-east-1.amazonaws.com", true, true);
	//   80  138:aload_1         
	//   81  139:ldc1            #76  <String "sqs">
	//   82  141:ldc1            #78  <String "sqs.us-east-1.amazonaws.com">
	//   83  143:iconst_1        
	//   84  144:iconst_1        
	//   85  145:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.us-east-1.amazonaws.com", true, true);
	//   86  148:aload_1         
	//   87  149:ldc1            #80  <String "elasticloadbalancing">
	//   88  151:ldc1            #82  <String "elasticloadbalancing.us-east-1.amazonaws.com">
	//   89  153:iconst_1        
	//   90  154:iconst_1        
	//   91  155:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "email", "email.us-east-1.amazonaws.com", false, true);
	//   92  158:aload_1         
	//   93  159:ldc1            #84  <String "email">
	//   94  161:ldc1            #86  <String "email.us-east-1.amazonaws.com">
	//   95  163:iconst_0        
	//   96  164:iconst_1        
	//   97  165:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "cognito-sync", "cognito-sync.us-east-1.amazonaws.com", false, true);
	//   98  168:aload_1         
	//   99  169:ldc1            #88  <String "cognito-sync">
	//  100  171:ldc1            #90  <String "cognito-sync.us-east-1.amazonaws.com">
	//  101  173:iconst_0        
	//  102  174:iconst_1        
	//  103  175:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "cognito-identity", "cognito-identity.us-east-1.amazonaws.com", false, true);
	//  104  178:aload_1         
	//  105  179:ldc1            #92  <String "cognito-identity">
	//  106  181:ldc1            #94  <String "cognito-identity.us-east-1.amazonaws.com">
	//  107  183:iconst_0        
	//  108  184:iconst_1        
	//  109  185:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "cognito-idp", "cognito-idp.us-east-1.amazonaws.com", false, true);
	//  110  188:aload_1         
	//  111  189:ldc1            #96  <String "cognito-idp">
	//  112  191:ldc1            #98  <String "cognito-idp.us-east-1.amazonaws.com">
	//  113  193:iconst_0        
	//  114  194:iconst_1        
	//  115  195:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "mobileanalytics", "mobileanalytics.us-east-1.amazonaws.com", false, true);
	//  116  198:aload_1         
	//  117  199:ldc1            #100 <String "mobileanalytics">
	//  118  201:ldc1            #102 <String "mobileanalytics.us-east-1.amazonaws.com">
	//  119  203:iconst_0        
	//  120  204:iconst_1        
	//  121  205:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "machinelearning", "machinelearning.us-east-1.amazonaws.com", false, true);
	//  122  208:aload_1         
	//  123  209:ldc1            #104 <String "machinelearning">
	//  124  211:ldc1            #106 <String "machinelearning.us-east-1.amazonaws.com">
	//  125  213:iconst_0        
	//  126  214:iconst_1        
	//  127  215:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.us-east-1.amazonaws.com", false, true);
	//  128  218:aload_1         
	//  129  219:ldc1            #108 <String "kms">
	//  130  221:ldc1            #110 <String "kms.us-east-1.amazonaws.com">
	//  131  223:iconst_0        
	//  132  224:iconst_1        
	//  133  225:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "execute-api", "iot.us-east-1.amazonaws.com", false, true);
	//  134  228:aload_1         
	//  135  229:ldc1            #112 <String "execute-api">
	//  136  231:ldc1            #114 <String "iot.us-east-1.amazonaws.com">
	//  137  233:iconst_0        
	//  138  234:iconst_1        
	//  139  235:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("us-west-1", "");
	//  140  238:new             #14  <Class Region>
	//  141  241:dup             
	//  142  242:ldc1            #116 <String "us-west-1">
	//  143  244:ldc1            #18  <String "">
	//  144  246:invokespecial   #21  <Method void Region(String, String)>
	//  145  249:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  146  250:aload_0         
	//  147  251:aload_1         
	//  148  252:invokeinterface #27  <Method boolean List.add(Object)>
	//  149  257:pop             
		a(region, "s3", "s3-us-west-1.amazonaws.com", true, true);
	//  150  258:aload_1         
	//  151  259:ldc1            #29  <String "s3">
	//  152  261:ldc1            #118 <String "s3-us-west-1.amazonaws.com">
	//  153  263:iconst_1        
	//  154  264:iconst_1        
	//  155  265:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//  156  268:aload_1         
	//  157  269:ldc1            #36  <String "sts">
	//  158  271:ldc1            #38  <String "sts.amazonaws.com">
	//  159  273:iconst_0        
	//  160  274:iconst_1        
	//  161  275:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.us-west-1.amazonaws.com", true, true);
	//  162  278:aload_1         
	//  163  279:ldc1            #40  <String "monitoring">
	//  164  281:ldc1            #120 <String "monitoring.us-west-1.amazonaws.com">
	//  165  283:iconst_1        
	//  166  284:iconst_1        
	//  167  285:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.us-west-1.amazonaws.com", true, true);
	//  168  288:aload_1         
	//  169  289:ldc1            #44  <String "sns">
	//  170  291:ldc1            #122 <String "sns.us-west-1.amazonaws.com">
	//  171  293:iconst_1        
	//  172  294:iconst_1        
	//  173  295:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.us-west-1.amazonaws.com", true, true);
	//  174  298:aload_1         
	//  175  299:ldc1            #48  <String "autoscaling">
	//  176  301:ldc1            #124 <String "autoscaling.us-west-1.amazonaws.com">
	//  177  303:iconst_1        
	//  178  304:iconst_1        
	//  179  305:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sdb", "sdb.us-west-1.amazonaws.com", true, true);
	//  180  308:aload_1         
	//  181  309:ldc1            #52  <String "sdb">
	//  182  311:ldc1            #126 <String "sdb.us-west-1.amazonaws.com">
	//  183  313:iconst_1        
	//  184  314:iconst_1        
	//  185  315:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.us-west-1.amazonaws.com", true, true);
	//  186  318:aload_1         
	//  187  319:ldc1            #56  <String "dynamodb">
	//  188  321:ldc1            #128 <String "dynamodb.us-west-1.amazonaws.com">
	//  189  323:iconst_1        
	//  190  324:iconst_1        
	//  191  325:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.us-west-1.amazonaws.com", true, true);
	//  192  328:aload_1         
	//  193  329:ldc1            #60  <String "ec2">
	//  194  331:ldc1            #130 <String "ec2.us-west-1.amazonaws.com">
	//  195  333:iconst_1        
	//  196  334:iconst_1        
	//  197  335:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kinesis", "kinesis.us-west-1.amazonaws.com", false, true);
	//  198  338:aload_1         
	//  199  339:ldc1            #64  <String "kinesis">
	//  200  341:ldc1            #132 <String "kinesis.us-west-1.amazonaws.com">
	//  201  343:iconst_0        
	//  202  344:iconst_1        
	//  203  345:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.us-west-1.amazonaws.com", true, true);
	//  204  348:aload_1         
	//  205  349:ldc1            #76  <String "sqs">
	//  206  351:ldc1            #134 <String "sqs.us-west-1.amazonaws.com">
	//  207  353:iconst_1        
	//  208  354:iconst_1        
	//  209  355:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.us-west-1.amazonaws.com", true, true);
	//  210  358:aload_1         
	//  211  359:ldc1            #80  <String "elasticloadbalancing">
	//  212  361:ldc1            #136 <String "elasticloadbalancing.us-west-1.amazonaws.com">
	//  213  363:iconst_1        
	//  214  364:iconst_1        
	//  215  365:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.us-west-1.amazonaws.com", false, true);
	//  216  368:aload_1         
	//  217  369:ldc1            #108 <String "kms">
	//  218  371:ldc1            #138 <String "kms.us-west-1.amazonaws.com">
	//  219  373:iconst_0        
	//  220  374:iconst_1        
	//  221  375:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("us-west-2", "");
	//  222  378:new             #14  <Class Region>
	//  223  381:dup             
	//  224  382:ldc1            #140 <String "us-west-2">
	//  225  384:ldc1            #18  <String "">
	//  226  386:invokespecial   #21  <Method void Region(String, String)>
	//  227  389:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  228  390:aload_0         
	//  229  391:aload_1         
	//  230  392:invokeinterface #27  <Method boolean List.add(Object)>
	//  231  397:pop             
		a(region, "s3", "s3-us-west-2.amazonaws.com", true, true);
	//  232  398:aload_1         
	//  233  399:ldc1            #29  <String "s3">
	//  234  401:ldc1            #142 <String "s3-us-west-2.amazonaws.com">
	//  235  403:iconst_1        
	//  236  404:iconst_1        
	//  237  405:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//  238  408:aload_1         
	//  239  409:ldc1            #36  <String "sts">
	//  240  411:ldc1            #38  <String "sts.amazonaws.com">
	//  241  413:iconst_0        
	//  242  414:iconst_1        
	//  243  415:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.us-west-2.amazonaws.com", true, true);
	//  244  418:aload_1         
	//  245  419:ldc1            #40  <String "monitoring">
	//  246  421:ldc1            #144 <String "monitoring.us-west-2.amazonaws.com">
	//  247  423:iconst_1        
	//  248  424:iconst_1        
	//  249  425:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.us-west-2.amazonaws.com", true, true);
	//  250  428:aload_1         
	//  251  429:ldc1            #44  <String "sns">
	//  252  431:ldc1            #146 <String "sns.us-west-2.amazonaws.com">
	//  253  433:iconst_1        
	//  254  434:iconst_1        
	//  255  435:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.us-west-2.amazonaws.com", true, true);
	//  256  438:aload_1         
	//  257  439:ldc1            #48  <String "autoscaling">
	//  258  441:ldc1            #148 <String "autoscaling.us-west-2.amazonaws.com">
	//  259  443:iconst_1        
	//  260  444:iconst_1        
	//  261  445:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sdb", "sdb.us-west-2.amazonaws.com", true, true);
	//  262  448:aload_1         
	//  263  449:ldc1            #52  <String "sdb">
	//  264  451:ldc1            #150 <String "sdb.us-west-2.amazonaws.com">
	//  265  453:iconst_1        
	//  266  454:iconst_1        
	//  267  455:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.us-west-2.amazonaws.com", true, true);
	//  268  458:aload_1         
	//  269  459:ldc1            #56  <String "dynamodb">
	//  270  461:ldc1            #152 <String "dynamodb.us-west-2.amazonaws.com">
	//  271  463:iconst_1        
	//  272  464:iconst_1        
	//  273  465:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.us-west-2.amazonaws.com", true, true);
	//  274  468:aload_1         
	//  275  469:ldc1            #60  <String "ec2">
	//  276  471:ldc1            #154 <String "ec2.us-west-2.amazonaws.com">
	//  277  473:iconst_1        
	//  278  474:iconst_1        
	//  279  475:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kinesis", "kinesis.us-west-2.amazonaws.com", false, true);
	//  280  478:aload_1         
	//  281  479:ldc1            #64  <String "kinesis">
	//  282  481:ldc1            #156 <String "kinesis.us-west-2.amazonaws.com">
	//  283  483:iconst_0        
	//  284  484:iconst_1        
	//  285  485:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "firehose", "firehose.us-west-2.amazonaws.com", false, true);
	//  286  488:aload_1         
	//  287  489:ldc1            #68  <String "firehose">
	//  288  491:ldc1            #158 <String "firehose.us-west-2.amazonaws.com">
	//  289  493:iconst_0        
	//  290  494:iconst_1        
	//  291  495:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "lambda", "lambda.us-west-2.amazonaws.com", false, true);
	//  292  498:aload_1         
	//  293  499:ldc1            #72  <String "lambda">
	//  294  501:ldc1            #160 <String "lambda.us-west-2.amazonaws.com">
	//  295  503:iconst_0        
	//  296  504:iconst_1        
	//  297  505:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.us-west-2.amazonaws.com", true, true);
	//  298  508:aload_1         
	//  299  509:ldc1            #76  <String "sqs">
	//  300  511:ldc1            #162 <String "sqs.us-west-2.amazonaws.com">
	//  301  513:iconst_1        
	//  302  514:iconst_1        
	//  303  515:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.us-west-2.amazonaws.com", true, true);
	//  304  518:aload_1         
	//  305  519:ldc1            #80  <String "elasticloadbalancing">
	//  306  521:ldc1            #164 <String "elasticloadbalancing.us-west-2.amazonaws.com">
	//  307  523:iconst_1        
	//  308  524:iconst_1        
	//  309  525:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "email", "email.us-west-2.amazonaws.com", false, true);
	//  310  528:aload_1         
	//  311  529:ldc1            #84  <String "email">
	//  312  531:ldc1            #166 <String "email.us-west-2.amazonaws.com">
	//  313  533:iconst_0        
	//  314  534:iconst_1        
	//  315  535:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.us-west-2.amazonaws.com", false, true);
	//  316  538:aload_1         
	//  317  539:ldc1            #108 <String "kms">
	//  318  541:ldc1            #168 <String "kms.us-west-2.amazonaws.com">
	//  319  543:iconst_0        
	//  320  544:iconst_1        
	//  321  545:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "execute-api", "iot.us-west-2.amazonaws.com", false, true);
	//  322  548:aload_1         
	//  323  549:ldc1            #112 <String "execute-api">
	//  324  551:ldc1            #170 <String "iot.us-west-2.amazonaws.com">
	//  325  553:iconst_0        
	//  326  554:iconst_1        
	//  327  555:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("ap-northeast-1", "");
	//  328  558:new             #14  <Class Region>
	//  329  561:dup             
	//  330  562:ldc1            #172 <String "ap-northeast-1">
	//  331  564:ldc1            #18  <String "">
	//  332  566:invokespecial   #21  <Method void Region(String, String)>
	//  333  569:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  334  570:aload_0         
	//  335  571:aload_1         
	//  336  572:invokeinterface #27  <Method boolean List.add(Object)>
	//  337  577:pop             
		a(region, "s3", "s3-ap-northeast-1.amazonaws.com", true, true);
	//  338  578:aload_1         
	//  339  579:ldc1            #29  <String "s3">
	//  340  581:ldc1            #174 <String "s3-ap-northeast-1.amazonaws.com">
	//  341  583:iconst_1        
	//  342  584:iconst_1        
	//  343  585:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//  344  588:aload_1         
	//  345  589:ldc1            #36  <String "sts">
	//  346  591:ldc1            #38  <String "sts.amazonaws.com">
	//  347  593:iconst_0        
	//  348  594:iconst_1        
	//  349  595:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.ap-northeast-1.amazonaws.com", true, true);
	//  350  598:aload_1         
	//  351  599:ldc1            #40  <String "monitoring">
	//  352  601:ldc1            #176 <String "monitoring.ap-northeast-1.amazonaws.com">
	//  353  603:iconst_1        
	//  354  604:iconst_1        
	//  355  605:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.ap-northeast-1.amazonaws.com", true, true);
	//  356  608:aload_1         
	//  357  609:ldc1            #44  <String "sns">
	//  358  611:ldc1            #178 <String "sns.ap-northeast-1.amazonaws.com">
	//  359  613:iconst_1        
	//  360  614:iconst_1        
	//  361  615:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.ap-northeast-1.amazonaws.com", true, true);
	//  362  618:aload_1         
	//  363  619:ldc1            #48  <String "autoscaling">
	//  364  621:ldc1            #180 <String "autoscaling.ap-northeast-1.amazonaws.com">
	//  365  623:iconst_1        
	//  366  624:iconst_1        
	//  367  625:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sdb", "sdb.ap-northeast-1.amazonaws.com", true, true);
	//  368  628:aload_1         
	//  369  629:ldc1            #52  <String "sdb">
	//  370  631:ldc1            #182 <String "sdb.ap-northeast-1.amazonaws.com">
	//  371  633:iconst_1        
	//  372  634:iconst_1        
	//  373  635:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.ap-northeast-1.amazonaws.com", true, true);
	//  374  638:aload_1         
	//  375  639:ldc1            #56  <String "dynamodb">
	//  376  641:ldc1            #184 <String "dynamodb.ap-northeast-1.amazonaws.com">
	//  377  643:iconst_1        
	//  378  644:iconst_1        
	//  379  645:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.ap-northeast-1.amazonaws.com", true, true);
	//  380  648:aload_1         
	//  381  649:ldc1            #60  <String "ec2">
	//  382  651:ldc1            #186 <String "ec2.ap-northeast-1.amazonaws.com">
	//  383  653:iconst_1        
	//  384  654:iconst_1        
	//  385  655:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kinesis", "kinesis.ap-northeast-1.amazonaws.com", false, true);
	//  386  658:aload_1         
	//  387  659:ldc1            #64  <String "kinesis">
	//  388  661:ldc1            #188 <String "kinesis.ap-northeast-1.amazonaws.com">
	//  389  663:iconst_0        
	//  390  664:iconst_1        
	//  391  665:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "lambda", "lambda.ap-northeast-1.amazonaws.com", false, true);
	//  392  668:aload_1         
	//  393  669:ldc1            #72  <String "lambda">
	//  394  671:ldc1            #190 <String "lambda.ap-northeast-1.amazonaws.com">
	//  395  673:iconst_0        
	//  396  674:iconst_1        
	//  397  675:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.ap-northeast-1.amazonaws.com", true, true);
	//  398  678:aload_1         
	//  399  679:ldc1            #76  <String "sqs">
	//  400  681:ldc1            #192 <String "sqs.ap-northeast-1.amazonaws.com">
	//  401  683:iconst_1        
	//  402  684:iconst_1        
	//  403  685:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.ap-northeast-1.amazonaws.com", true, true);
	//  404  688:aload_1         
	//  405  689:ldc1            #80  <String "elasticloadbalancing">
	//  406  691:ldc1            #194 <String "elasticloadbalancing.ap-northeast-1.amazonaws.com">
	//  407  693:iconst_1        
	//  408  694:iconst_1        
	//  409  695:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "cognito-sync", "cognito-sync.ap-northeast-1.amazonaws.com", false, true);
	//  410  698:aload_1         
	//  411  699:ldc1            #88  <String "cognito-sync">
	//  412  701:ldc1            #196 <String "cognito-sync.ap-northeast-1.amazonaws.com">
	//  413  703:iconst_0        
	//  414  704:iconst_1        
	//  415  705:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "cognito-identity", "cognito-identity.ap-northeast-1.amazonaws.com", false, true);
	//  416  708:aload_1         
	//  417  709:ldc1            #92  <String "cognito-identity">
	//  418  711:ldc1            #198 <String "cognito-identity.ap-northeast-1.amazonaws.com">
	//  419  713:iconst_0        
	//  420  714:iconst_1        
	//  421  715:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.ap-northeast-1.amazonaws.com", false, true);
	//  422  718:aload_1         
	//  423  719:ldc1            #108 <String "kms">
	//  424  721:ldc1            #200 <String "kms.ap-northeast-1.amazonaws.com">
	//  425  723:iconst_0        
	//  426  724:iconst_1        
	//  427  725:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "execute-api", "iot.ap-northeast-1.amazonaws.com", false, true);
	//  428  728:aload_1         
	//  429  729:ldc1            #112 <String "execute-api">
	//  430  731:ldc1            #202 <String "iot.ap-northeast-1.amazonaws.com">
	//  431  733:iconst_0        
	//  432  734:iconst_1        
	//  433  735:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("ap-northeast-2", "");
	//  434  738:new             #14  <Class Region>
	//  435  741:dup             
	//  436  742:ldc1            #204 <String "ap-northeast-2">
	//  437  744:ldc1            #18  <String "">
	//  438  746:invokespecial   #21  <Method void Region(String, String)>
	//  439  749:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  440  750:aload_0         
	//  441  751:aload_1         
	//  442  752:invokeinterface #27  <Method boolean List.add(Object)>
	//  443  757:pop             
		a(region, "s3", "s3-ap-northeast-2.amazonaws.com", true, true);
	//  444  758:aload_1         
	//  445  759:ldc1            #29  <String "s3">
	//  446  761:ldc1            #206 <String "s3-ap-northeast-2.amazonaws.com">
	//  447  763:iconst_1        
	//  448  764:iconst_1        
	//  449  765:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//  450  768:aload_1         
	//  451  769:ldc1            #36  <String "sts">
	//  452  771:ldc1            #38  <String "sts.amazonaws.com">
	//  453  773:iconst_0        
	//  454  774:iconst_1        
	//  455  775:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.ap-northeast-2.amazonaws.com", true, true);
	//  456  778:aload_1         
	//  457  779:ldc1            #40  <String "monitoring">
	//  458  781:ldc1            #208 <String "monitoring.ap-northeast-2.amazonaws.com">
	//  459  783:iconst_1        
	//  460  784:iconst_1        
	//  461  785:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.ap-northeast-2.amazonaws.com", true, true);
	//  462  788:aload_1         
	//  463  789:ldc1            #44  <String "sns">
	//  464  791:ldc1            #210 <String "sns.ap-northeast-2.amazonaws.com">
	//  465  793:iconst_1        
	//  466  794:iconst_1        
	//  467  795:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.ap-northeast-2.amazonaws.com", true, true);
	//  468  798:aload_1         
	//  469  799:ldc1            #48  <String "autoscaling">
	//  470  801:ldc1            #212 <String "autoscaling.ap-northeast-2.amazonaws.com">
	//  471  803:iconst_1        
	//  472  804:iconst_1        
	//  473  805:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.ap-northeast-2.amazonaws.com", true, true);
	//  474  808:aload_1         
	//  475  809:ldc1            #56  <String "dynamodb">
	//  476  811:ldc1            #214 <String "dynamodb.ap-northeast-2.amazonaws.com">
	//  477  813:iconst_1        
	//  478  814:iconst_1        
	//  479  815:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.ap-northeast-2.amazonaws.com", true, true);
	//  480  818:aload_1         
	//  481  819:ldc1            #60  <String "ec2">
	//  482  821:ldc1            #216 <String "ec2.ap-northeast-2.amazonaws.com">
	//  483  823:iconst_1        
	//  484  824:iconst_1        
	//  485  825:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kinesis", "kinesis.ap-northeast-2.amazonaws.com", false, true);
	//  486  828:aload_1         
	//  487  829:ldc1            #64  <String "kinesis">
	//  488  831:ldc1            #218 <String "kinesis.ap-northeast-2.amazonaws.com">
	//  489  833:iconst_0        
	//  490  834:iconst_1        
	//  491  835:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.ap-northeast-2.amazonaws.com", true, true);
	//  492  838:aload_1         
	//  493  839:ldc1            #76  <String "sqs">
	//  494  841:ldc1            #220 <String "sqs.ap-northeast-2.amazonaws.com">
	//  495  843:iconst_1        
	//  496  844:iconst_1        
	//  497  845:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.ap-northeast-2.amazonaws.com", true, true);
	//  498  848:aload_1         
	//  499  849:ldc1            #80  <String "elasticloadbalancing">
	//  500  851:ldc1            #222 <String "elasticloadbalancing.ap-northeast-2.amazonaws.com">
	//  501  853:iconst_1        
	//  502  854:iconst_1        
	//  503  855:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.ap-northeast-2.amazonaws.com", false, true);
	//  504  858:aload_1         
	//  505  859:ldc1            #108 <String "kms">
	//  506  861:ldc1            #224 <String "kms.ap-northeast-2.amazonaws.com">
	//  507  863:iconst_0        
	//  508  864:iconst_1        
	//  509  865:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("ap-southeast-1", "");
	//  510  868:new             #14  <Class Region>
	//  511  871:dup             
	//  512  872:ldc1            #226 <String "ap-southeast-1">
	//  513  874:ldc1            #18  <String "">
	//  514  876:invokespecial   #21  <Method void Region(String, String)>
	//  515  879:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  516  880:aload_0         
	//  517  881:aload_1         
	//  518  882:invokeinterface #27  <Method boolean List.add(Object)>
	//  519  887:pop             
		a(region, "s3", "s3-ap-southeast-1.amazonaws.com", true, true);
	//  520  888:aload_1         
	//  521  889:ldc1            #29  <String "s3">
	//  522  891:ldc1            #228 <String "s3-ap-southeast-1.amazonaws.com">
	//  523  893:iconst_1        
	//  524  894:iconst_1        
	//  525  895:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//  526  898:aload_1         
	//  527  899:ldc1            #36  <String "sts">
	//  528  901:ldc1            #38  <String "sts.amazonaws.com">
	//  529  903:iconst_0        
	//  530  904:iconst_1        
	//  531  905:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.ap-southeast-1.amazonaws.com", true, true);
	//  532  908:aload_1         
	//  533  909:ldc1            #40  <String "monitoring">
	//  534  911:ldc1            #230 <String "monitoring.ap-southeast-1.amazonaws.com">
	//  535  913:iconst_1        
	//  536  914:iconst_1        
	//  537  915:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.ap-southeast-1.amazonaws.com", true, true);
	//  538  918:aload_1         
	//  539  919:ldc1            #44  <String "sns">
	//  540  921:ldc1            #232 <String "sns.ap-southeast-1.amazonaws.com">
	//  541  923:iconst_1        
	//  542  924:iconst_1        
	//  543  925:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.ap-southeast-1.amazonaws.com", true, true);
	//  544  928:aload_1         
	//  545  929:ldc1            #48  <String "autoscaling">
	//  546  931:ldc1            #234 <String "autoscaling.ap-southeast-1.amazonaws.com">
	//  547  933:iconst_1        
	//  548  934:iconst_1        
	//  549  935:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sdb", "sdb.ap-southeast-1.amazonaws.com", true, true);
	//  550  938:aload_1         
	//  551  939:ldc1            #52  <String "sdb">
	//  552  941:ldc1            #236 <String "sdb.ap-southeast-1.amazonaws.com">
	//  553  943:iconst_1        
	//  554  944:iconst_1        
	//  555  945:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.ap-southeast-1.amazonaws.com", true, true);
	//  556  948:aload_1         
	//  557  949:ldc1            #56  <String "dynamodb">
	//  558  951:ldc1            #238 <String "dynamodb.ap-southeast-1.amazonaws.com">
	//  559  953:iconst_1        
	//  560  954:iconst_1        
	//  561  955:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.ap-southeast-1.amazonaws.com", true, true);
	//  562  958:aload_1         
	//  563  959:ldc1            #60  <String "ec2">
	//  564  961:ldc1            #240 <String "ec2.ap-southeast-1.amazonaws.com">
	//  565  963:iconst_1        
	//  566  964:iconst_1        
	//  567  965:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kinesis", "kinesis.ap-southeast-1.amazonaws.com", false, true);
	//  568  968:aload_1         
	//  569  969:ldc1            #64  <String "kinesis">
	//  570  971:ldc1            #242 <String "kinesis.ap-southeast-1.amazonaws.com">
	//  571  973:iconst_0        
	//  572  974:iconst_1        
	//  573  975:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.ap-southeast-1.amazonaws.com", true, true);
	//  574  978:aload_1         
	//  575  979:ldc1            #76  <String "sqs">
	//  576  981:ldc1            #244 <String "sqs.ap-southeast-1.amazonaws.com">
	//  577  983:iconst_1        
	//  578  984:iconst_1        
	//  579  985:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.ap-southeast-1.amazonaws.com", true, true);
	//  580  988:aload_1         
	//  581  989:ldc1            #80  <String "elasticloadbalancing">
	//  582  991:ldc1            #246 <String "elasticloadbalancing.ap-southeast-1.amazonaws.com">
	//  583  993:iconst_1        
	//  584  994:iconst_1        
	//  585  995:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.ap-southeast-1.amazonaws.com", false, true);
	//  586  998:aload_1         
	//  587  999:ldc1            #108 <String "kms">
	//  588 1001:ldc1            #248 <String "kms.ap-southeast-1.amazonaws.com">
	//  589 1003:iconst_0        
	//  590 1004:iconst_1        
	//  591 1005:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("ap-southeast-2", "");
	//  592 1008:new             #14  <Class Region>
	//  593 1011:dup             
	//  594 1012:ldc1            #250 <String "ap-southeast-2">
	//  595 1014:ldc1            #18  <String "">
	//  596 1016:invokespecial   #21  <Method void Region(String, String)>
	//  597 1019:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  598 1020:aload_0         
	//  599 1021:aload_1         
	//  600 1022:invokeinterface #27  <Method boolean List.add(Object)>
	//  601 1027:pop             
		a(region, "s3", "s3-ap-southeast-2.amazonaws.com", true, true);
	//  602 1028:aload_1         
	//  603 1029:ldc1            #29  <String "s3">
	//  604 1031:ldc1            #252 <String "s3-ap-southeast-2.amazonaws.com">
	//  605 1033:iconst_1        
	//  606 1034:iconst_1        
	//  607 1035:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//  608 1038:aload_1         
	//  609 1039:ldc1            #36  <String "sts">
	//  610 1041:ldc1            #38  <String "sts.amazonaws.com">
	//  611 1043:iconst_0        
	//  612 1044:iconst_1        
	//  613 1045:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.ap-southeast-2.amazonaws.com", true, true);
	//  614 1048:aload_1         
	//  615 1049:ldc1            #40  <String "monitoring">
	//  616 1051:ldc1            #254 <String "monitoring.ap-southeast-2.amazonaws.com">
	//  617 1053:iconst_1        
	//  618 1054:iconst_1        
	//  619 1055:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.ap-southeast-2.amazonaws.com", true, true);
	//  620 1058:aload_1         
	//  621 1059:ldc1            #44  <String "sns">
	//  622 1061:ldc2            #256 <String "sns.ap-southeast-2.amazonaws.com">
	//  623 1064:iconst_1        
	//  624 1065:iconst_1        
	//  625 1066:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.ap-southeast-2.amazonaws.com", true, true);
	//  626 1069:aload_1         
	//  627 1070:ldc1            #48  <String "autoscaling">
	//  628 1072:ldc2            #258 <String "autoscaling.ap-southeast-2.amazonaws.com">
	//  629 1075:iconst_1        
	//  630 1076:iconst_1        
	//  631 1077:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sdb", "sdb.ap-southeast-2.amazonaws.com", true, true);
	//  632 1080:aload_1         
	//  633 1081:ldc1            #52  <String "sdb">
	//  634 1083:ldc2            #260 <String "sdb.ap-southeast-2.amazonaws.com">
	//  635 1086:iconst_1        
	//  636 1087:iconst_1        
	//  637 1088:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.ap-southeast-2.amazonaws.com", true, true);
	//  638 1091:aload_1         
	//  639 1092:ldc1            #56  <String "dynamodb">
	//  640 1094:ldc2            #262 <String "dynamodb.ap-southeast-2.amazonaws.com">
	//  641 1097:iconst_1        
	//  642 1098:iconst_1        
	//  643 1099:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.ap-southeast-2.amazonaws.com", true, true);
	//  644 1102:aload_1         
	//  645 1103:ldc1            #60  <String "ec2">
	//  646 1105:ldc2            #264 <String "ec2.ap-southeast-2.amazonaws.com">
	//  647 1108:iconst_1        
	//  648 1109:iconst_1        
	//  649 1110:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kinesis", "kinesis.ap-southeast-2.amazonaws.com", false, true);
	//  650 1113:aload_1         
	//  651 1114:ldc1            #64  <String "kinesis">
	//  652 1116:ldc2            #266 <String "kinesis.ap-southeast-2.amazonaws.com">
	//  653 1119:iconst_0        
	//  654 1120:iconst_1        
	//  655 1121:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.ap-southeast-2.amazonaws.com", true, true);
	//  656 1124:aload_1         
	//  657 1125:ldc1            #76  <String "sqs">
	//  658 1127:ldc2            #268 <String "sqs.ap-southeast-2.amazonaws.com">
	//  659 1130:iconst_1        
	//  660 1131:iconst_1        
	//  661 1132:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.ap-southeast-2.amazonaws.com", true, true);
	//  662 1135:aload_1         
	//  663 1136:ldc1            #80  <String "elasticloadbalancing">
	//  664 1138:ldc2            #270 <String "elasticloadbalancing.ap-southeast-2.amazonaws.com">
	//  665 1141:iconst_1        
	//  666 1142:iconst_1        
	//  667 1143:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.ap-southeast-2.amazonaws.com", false, true);
	//  668 1146:aload_1         
	//  669 1147:ldc1            #108 <String "kms">
	//  670 1149:ldc2            #272 <String "kms.ap-southeast-2.amazonaws.com">
	//  671 1152:iconst_0        
	//  672 1153:iconst_1        
	//  673 1154:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("sa-east-1", "");
	//  674 1157:new             #14  <Class Region>
	//  675 1160:dup             
	//  676 1161:ldc2            #274 <String "sa-east-1">
	//  677 1164:ldc1            #18  <String "">
	//  678 1166:invokespecial   #21  <Method void Region(String, String)>
	//  679 1169:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  680 1170:aload_0         
	//  681 1171:aload_1         
	//  682 1172:invokeinterface #27  <Method boolean List.add(Object)>
	//  683 1177:pop             
		a(region, "s3", "s3-sa-east-1.amazonaws.com", true, true);
	//  684 1178:aload_1         
	//  685 1179:ldc1            #29  <String "s3">
	//  686 1181:ldc2            #276 <String "s3-sa-east-1.amazonaws.com">
	//  687 1184:iconst_1        
	//  688 1185:iconst_1        
	//  689 1186:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//  690 1189:aload_1         
	//  691 1190:ldc1            #36  <String "sts">
	//  692 1192:ldc1            #38  <String "sts.amazonaws.com">
	//  693 1194:iconst_0        
	//  694 1195:iconst_1        
	//  695 1196:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.sa-east-1.amazonaws.com", true, true);
	//  696 1199:aload_1         
	//  697 1200:ldc1            #40  <String "monitoring">
	//  698 1202:ldc2            #278 <String "monitoring.sa-east-1.amazonaws.com">
	//  699 1205:iconst_1        
	//  700 1206:iconst_1        
	//  701 1207:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.sa-east-1.amazonaws.com", true, true);
	//  702 1210:aload_1         
	//  703 1211:ldc1            #44  <String "sns">
	//  704 1213:ldc2            #280 <String "sns.sa-east-1.amazonaws.com">
	//  705 1216:iconst_1        
	//  706 1217:iconst_1        
	//  707 1218:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.sa-east-1.amazonaws.com", true, true);
	//  708 1221:aload_1         
	//  709 1222:ldc1            #48  <String "autoscaling">
	//  710 1224:ldc2            #282 <String "autoscaling.sa-east-1.amazonaws.com">
	//  711 1227:iconst_1        
	//  712 1228:iconst_1        
	//  713 1229:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sdb", "sdb.sa-east-1.amazonaws.com", true, true);
	//  714 1232:aload_1         
	//  715 1233:ldc1            #52  <String "sdb">
	//  716 1235:ldc2            #284 <String "sdb.sa-east-1.amazonaws.com">
	//  717 1238:iconst_1        
	//  718 1239:iconst_1        
	//  719 1240:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.sa-east-1.amazonaws.com", true, true);
	//  720 1243:aload_1         
	//  721 1244:ldc1            #56  <String "dynamodb">
	//  722 1246:ldc2            #286 <String "dynamodb.sa-east-1.amazonaws.com">
	//  723 1249:iconst_1        
	//  724 1250:iconst_1        
	//  725 1251:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.sa-east-1.amazonaws.com", true, true);
	//  726 1254:aload_1         
	//  727 1255:ldc1            #60  <String "ec2">
	//  728 1257:ldc2            #288 <String "ec2.sa-east-1.amazonaws.com">
	//  729 1260:iconst_1        
	//  730 1261:iconst_1        
	//  731 1262:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.sa-east-1.amazonaws.com", true, true);
	//  732 1265:aload_1         
	//  733 1266:ldc1            #76  <String "sqs">
	//  734 1268:ldc2            #290 <String "sqs.sa-east-1.amazonaws.com">
	//  735 1271:iconst_1        
	//  736 1272:iconst_1        
	//  737 1273:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.sa-east-1.amazonaws.com", true, true);
	//  738 1276:aload_1         
	//  739 1277:ldc1            #80  <String "elasticloadbalancing">
	//  740 1279:ldc2            #292 <String "elasticloadbalancing.sa-east-1.amazonaws.com">
	//  741 1282:iconst_1        
	//  742 1283:iconst_1        
	//  743 1284:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.sa-east-1.amazonaws.com", false, true);
	//  744 1287:aload_1         
	//  745 1288:ldc1            #108 <String "kms">
	//  746 1290:ldc2            #294 <String "kms.sa-east-1.amazonaws.com">
	//  747 1293:iconst_0        
	//  748 1294:iconst_1        
	//  749 1295:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("eu-west-1", "");
	//  750 1298:new             #14  <Class Region>
	//  751 1301:dup             
	//  752 1302:ldc2            #296 <String "eu-west-1">
	//  753 1305:ldc1            #18  <String "">
	//  754 1307:invokespecial   #21  <Method void Region(String, String)>
	//  755 1310:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  756 1311:aload_0         
	//  757 1312:aload_1         
	//  758 1313:invokeinterface #27  <Method boolean List.add(Object)>
	//  759 1318:pop             
		a(region, "s3", "s3-eu-west-1.amazonaws.com", true, true);
	//  760 1319:aload_1         
	//  761 1320:ldc1            #29  <String "s3">
	//  762 1322:ldc2            #298 <String "s3-eu-west-1.amazonaws.com">
	//  763 1325:iconst_1        
	//  764 1326:iconst_1        
	//  765 1327:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//  766 1330:aload_1         
	//  767 1331:ldc1            #36  <String "sts">
	//  768 1333:ldc1            #38  <String "sts.amazonaws.com">
	//  769 1335:iconst_0        
	//  770 1336:iconst_1        
	//  771 1337:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.eu-west-1.amazonaws.com", true, true);
	//  772 1340:aload_1         
	//  773 1341:ldc1            #40  <String "monitoring">
	//  774 1343:ldc2            #300 <String "monitoring.eu-west-1.amazonaws.com">
	//  775 1346:iconst_1        
	//  776 1347:iconst_1        
	//  777 1348:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.eu-west-1.amazonaws.com", true, true);
	//  778 1351:aload_1         
	//  779 1352:ldc1            #44  <String "sns">
	//  780 1354:ldc2            #302 <String "sns.eu-west-1.amazonaws.com">
	//  781 1357:iconst_1        
	//  782 1358:iconst_1        
	//  783 1359:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.eu-west-1.amazonaws.com", true, true);
	//  784 1362:aload_1         
	//  785 1363:ldc1            #48  <String "autoscaling">
	//  786 1365:ldc2            #304 <String "autoscaling.eu-west-1.amazonaws.com">
	//  787 1368:iconst_1        
	//  788 1369:iconst_1        
	//  789 1370:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sdb", "sdb.eu-west-1.amazonaws.com", true, true);
	//  790 1373:aload_1         
	//  791 1374:ldc1            #52  <String "sdb">
	//  792 1376:ldc2            #306 <String "sdb.eu-west-1.amazonaws.com">
	//  793 1379:iconst_1        
	//  794 1380:iconst_1        
	//  795 1381:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.eu-west-1.amazonaws.com", true, true);
	//  796 1384:aload_1         
	//  797 1385:ldc1            #56  <String "dynamodb">
	//  798 1387:ldc2            #308 <String "dynamodb.eu-west-1.amazonaws.com">
	//  799 1390:iconst_1        
	//  800 1391:iconst_1        
	//  801 1392:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.eu-west-1.amazonaws.com", true, true);
	//  802 1395:aload_1         
	//  803 1396:ldc1            #60  <String "ec2">
	//  804 1398:ldc2            #310 <String "ec2.eu-west-1.amazonaws.com">
	//  805 1401:iconst_1        
	//  806 1402:iconst_1        
	//  807 1403:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kinesis", "kinesis.eu-west-1.amazonaws.com", false, true);
	//  808 1406:aload_1         
	//  809 1407:ldc1            #64  <String "kinesis">
	//  810 1409:ldc2            #312 <String "kinesis.eu-west-1.amazonaws.com">
	//  811 1412:iconst_0        
	//  812 1413:iconst_1        
	//  813 1414:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "firehose", "firehose.eu-west-1.amazonaws.com", false, true);
	//  814 1417:aload_1         
	//  815 1418:ldc1            #68  <String "firehose">
	//  816 1420:ldc2            #314 <String "firehose.eu-west-1.amazonaws.com">
	//  817 1423:iconst_0        
	//  818 1424:iconst_1        
	//  819 1425:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "lambda", "lambda.eu-west-1.amazonaws.com", false, true);
	//  820 1428:aload_1         
	//  821 1429:ldc1            #72  <String "lambda">
	//  822 1431:ldc2            #316 <String "lambda.eu-west-1.amazonaws.com">
	//  823 1434:iconst_0        
	//  824 1435:iconst_1        
	//  825 1436:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.eu-west-1.amazonaws.com", true, true);
	//  826 1439:aload_1         
	//  827 1440:ldc1            #76  <String "sqs">
	//  828 1442:ldc2            #318 <String "sqs.eu-west-1.amazonaws.com">
	//  829 1445:iconst_1        
	//  830 1446:iconst_1        
	//  831 1447:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.eu-west-1.amazonaws.com", true, true);
	//  832 1450:aload_1         
	//  833 1451:ldc1            #80  <String "elasticloadbalancing">
	//  834 1453:ldc2            #320 <String "elasticloadbalancing.eu-west-1.amazonaws.com">
	//  835 1456:iconst_1        
	//  836 1457:iconst_1        
	//  837 1458:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "email", "email.eu-west-1.amazonaws.com", false, true);
	//  838 1461:aload_1         
	//  839 1462:ldc1            #84  <String "email">
	//  840 1464:ldc2            #322 <String "email.eu-west-1.amazonaws.com">
	//  841 1467:iconst_0        
	//  842 1468:iconst_1        
	//  843 1469:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "cognito-sync", "cognito-sync.eu-west-1.amazonaws.com", false, true);
	//  844 1472:aload_1         
	//  845 1473:ldc1            #88  <String "cognito-sync">
	//  846 1475:ldc2            #324 <String "cognito-sync.eu-west-1.amazonaws.com">
	//  847 1478:iconst_0        
	//  848 1479:iconst_1        
	//  849 1480:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "cognito-identity", "cognito-identity.eu-west-1.amazonaws.com", false, true);
	//  850 1483:aload_1         
	//  851 1484:ldc1            #92  <String "cognito-identity">
	//  852 1486:ldc2            #326 <String "cognito-identity.eu-west-1.amazonaws.com">
	//  853 1489:iconst_0        
	//  854 1490:iconst_1        
	//  855 1491:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "machinelearning", "machinelearning.eu-west-1.amazonaws.com", false, true);
	//  856 1494:aload_1         
	//  857 1495:ldc1            #104 <String "machinelearning">
	//  858 1497:ldc2            #328 <String "machinelearning.eu-west-1.amazonaws.com">
	//  859 1500:iconst_0        
	//  860 1501:iconst_1        
	//  861 1502:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.eu-west-1.amazonaws.com", false, true);
	//  862 1505:aload_1         
	//  863 1506:ldc1            #108 <String "kms">
	//  864 1508:ldc2            #330 <String "kms.eu-west-1.amazonaws.com">
	//  865 1511:iconst_0        
	//  866 1512:iconst_1        
	//  867 1513:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "execute-api", "iot.eu-west-1.amazonaws.com", false, true);
	//  868 1516:aload_1         
	//  869 1517:ldc1            #112 <String "execute-api">
	//  870 1519:ldc2            #332 <String "iot.eu-west-1.amazonaws.com">
	//  871 1522:iconst_0        
	//  872 1523:iconst_1        
	//  873 1524:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("eu-central-1", "");
	//  874 1527:new             #14  <Class Region>
	//  875 1530:dup             
	//  876 1531:ldc2            #334 <String "eu-central-1">
	//  877 1534:ldc1            #18  <String "">
	//  878 1536:invokespecial   #21  <Method void Region(String, String)>
	//  879 1539:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  880 1540:aload_0         
	//  881 1541:aload_1         
	//  882 1542:invokeinterface #27  <Method boolean List.add(Object)>
	//  883 1547:pop             
		a(region, "sqs", "sqs.eu-central-1.amazonaws.com", true, true);
	//  884 1548:aload_1         
	//  885 1549:ldc1            #76  <String "sqs">
	//  886 1551:ldc2            #336 <String "sqs.eu-central-1.amazonaws.com">
	//  887 1554:iconst_1        
	//  888 1555:iconst_1        
	//  889 1556:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "s3", "s3.eu-central-1.amazonaws.com", true, true);
	//  890 1559:aload_1         
	//  891 1560:ldc1            #29  <String "s3">
	//  892 1562:ldc2            #338 <String "s3.eu-central-1.amazonaws.com">
	//  893 1565:iconst_1        
	//  894 1566:iconst_1        
	//  895 1567:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.amazonaws.com", false, true);
	//  896 1570:aload_1         
	//  897 1571:ldc1            #36  <String "sts">
	//  898 1573:ldc1            #38  <String "sts.amazonaws.com">
	//  899 1575:iconst_0        
	//  900 1576:iconst_1        
	//  901 1577:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.eu-central-1.amazonaws.com", true, true);
	//  902 1580:aload_1         
	//  903 1581:ldc1            #40  <String "monitoring">
	//  904 1583:ldc2            #340 <String "monitoring.eu-central-1.amazonaws.com">
	//  905 1586:iconst_1        
	//  906 1587:iconst_1        
	//  907 1588:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.eu-central-1.amazonaws.com", true, true);
	//  908 1591:aload_1         
	//  909 1592:ldc1            #44  <String "sns">
	//  910 1594:ldc2            #342 <String "sns.eu-central-1.amazonaws.com">
	//  911 1597:iconst_1        
	//  912 1598:iconst_1        
	//  913 1599:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.eu-central-1.amazonaws.com", true, true);
	//  914 1602:aload_1         
	//  915 1603:ldc1            #48  <String "autoscaling">
	//  916 1605:ldc2            #344 <String "autoscaling.eu-central-1.amazonaws.com">
	//  917 1608:iconst_1        
	//  918 1609:iconst_1        
	//  919 1610:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "dynamodb", "dynamodb.eu-central-1.amazonaws.com", true, true);
	//  920 1613:aload_1         
	//  921 1614:ldc1            #56  <String "dynamodb">
	//  922 1616:ldc2            #346 <String "dynamodb.eu-central-1.amazonaws.com">
	//  923 1619:iconst_1        
	//  924 1620:iconst_1        
	//  925 1621:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.eu-central-1.amazonaws.com", true, true);
	//  926 1624:aload_1         
	//  927 1625:ldc1            #60  <String "ec2">
	//  928 1627:ldc2            #348 <String "ec2.eu-central-1.amazonaws.com">
	//  929 1630:iconst_1        
	//  930 1631:iconst_1        
	//  931 1632:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kinesis", "kinesis.eu-central-1.amazonaws.com", false, true);
	//  932 1635:aload_1         
	//  933 1636:ldc1            #64  <String "kinesis">
	//  934 1638:ldc2            #350 <String "kinesis.eu-central-1.amazonaws.com">
	//  935 1641:iconst_0        
	//  936 1642:iconst_1        
	//  937 1643:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.eu-central-1.amazonaws.com", true, true);
	//  938 1646:aload_1         
	//  939 1647:ldc1            #80  <String "elasticloadbalancing">
	//  940 1649:ldc2            #352 <String "elasticloadbalancing.eu-central-1.amazonaws.com">
	//  941 1652:iconst_1        
	//  942 1653:iconst_1        
	//  943 1654:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "kms", "kms.eu-central-1.amazonaws.com", false, true);
	//  944 1657:aload_1         
	//  945 1658:ldc1            #108 <String "kms">
	//  946 1660:ldc2            #354 <String "kms.eu-central-1.amazonaws.com">
	//  947 1663:iconst_0        
	//  948 1664:iconst_1        
	//  949 1665:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("cn-north-1", "amazonaws.com.cn");
	//  950 1668:new             #14  <Class Region>
	//  951 1671:dup             
	//  952 1672:ldc2            #356 <String "cn-north-1">
	//  953 1675:ldc2            #358 <String "amazonaws.com.cn">
	//  954 1678:invokespecial   #21  <Method void Region(String, String)>
	//  955 1681:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	//  956 1682:aload_0         
	//  957 1683:aload_1         
	//  958 1684:invokeinterface #27  <Method boolean List.add(Object)>
	//  959 1689:pop             
		a(region, "dynamodb", "dynamodb.cn-north-1.amazonaws.com.cn", true, true);
	//  960 1690:aload_1         
	//  961 1691:ldc1            #56  <String "dynamodb">
	//  962 1693:ldc2            #360 <String "dynamodb.cn-north-1.amazonaws.com.cn">
	//  963 1696:iconst_1        
	//  964 1697:iconst_1        
	//  965 1698:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.cn-north-1.amazonaws.com.cn", true, true);
	//  966 1701:aload_1         
	//  967 1702:ldc1            #60  <String "ec2">
	//  968 1704:ldc2            #362 <String "ec2.cn-north-1.amazonaws.com.cn">
	//  969 1707:iconst_1        
	//  970 1708:iconst_1        
	//  971 1709:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.cn-north-1.amazonaws.com.cn", true, true);
	//  972 1712:aload_1         
	//  973 1713:ldc1            #44  <String "sns">
	//  974 1715:ldc2            #364 <String "sns.cn-north-1.amazonaws.com.cn">
	//  975 1718:iconst_1        
	//  976 1719:iconst_1        
	//  977 1720:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.cn-north-1.amazonaws.com.cn", true, true);
	//  978 1723:aload_1         
	//  979 1724:ldc1            #76  <String "sqs">
	//  980 1726:ldc2            #366 <String "sqs.cn-north-1.amazonaws.com.cn">
	//  981 1729:iconst_1        
	//  982 1730:iconst_1        
	//  983 1731:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "s3", "s3.cn-north-1.amazonaws.com.cn", true, true);
	//  984 1734:aload_1         
	//  985 1735:ldc1            #29  <String "s3">
	//  986 1737:ldc2            #368 <String "s3.cn-north-1.amazonaws.com.cn">
	//  987 1740:iconst_1        
	//  988 1741:iconst_1        
	//  989 1742:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.cn-north-1.amazonaws.com.cn", false, true);
	//  990 1745:aload_1         
	//  991 1746:ldc1            #36  <String "sts">
	//  992 1748:ldc2            #370 <String "sts.cn-north-1.amazonaws.com.cn">
	//  993 1751:iconst_0        
	//  994 1752:iconst_1        
	//  995 1753:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.cn-north-1.amazonaws.com.cn", true, true);
	//  996 1756:aload_1         
	//  997 1757:ldc1            #80  <String "elasticloadbalancing">
	//  998 1759:ldc2            #372 <String "elasticloadbalancing.cn-north-1.amazonaws.com.cn">
	//  999 1762:iconst_1        
	// 1000 1763:iconst_1        
	// 1001 1764:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.cn-north-1.amazonaws.com.cn", true, true);
	// 1002 1767:aload_1         
	// 1003 1768:ldc1            #48  <String "autoscaling">
	// 1004 1770:ldc2            #374 <String "autoscaling.cn-north-1.amazonaws.com.cn">
	// 1005 1773:iconst_1        
	// 1006 1774:iconst_1        
	// 1007 1775:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.cn-north-1.amazonaws.com.cn", true, true);
	// 1008 1778:aload_1         
	// 1009 1779:ldc1            #40  <String "monitoring">
	// 1010 1781:ldc2            #376 <String "monitoring.cn-north-1.amazonaws.com.cn">
	// 1011 1784:iconst_1        
	// 1012 1785:iconst_1        
	// 1013 1786:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		region = new Region("us-gov-west-1", "");
	// 1014 1789:new             #14  <Class Region>
	// 1015 1792:dup             
	// 1016 1793:ldc2            #378 <String "us-gov-west-1">
	// 1017 1796:ldc1            #18  <String "">
	// 1018 1798:invokespecial   #21  <Method void Region(String, String)>
	// 1019 1801:astore_1        
		((List) (arraylist)).add(((Object) (region)));
	// 1020 1802:aload_0         
	// 1021 1803:aload_1         
	// 1022 1804:invokeinterface #27  <Method boolean List.add(Object)>
	// 1023 1809:pop             
		a(region, "dynamodb", "dynamodb.us-gov-west-1.amazonaws.com", false, true);
	// 1024 1810:aload_1         
	// 1025 1811:ldc1            #56  <String "dynamodb">
	// 1026 1813:ldc2            #380 <String "dynamodb.us-gov-west-1.amazonaws.com">
	// 1027 1816:iconst_0        
	// 1028 1817:iconst_1        
	// 1029 1818:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "ec2", "ec2.us-gov-west-1.amazonaws.com", false, true);
	// 1030 1821:aload_1         
	// 1031 1822:ldc1            #60  <String "ec2">
	// 1032 1824:ldc2            #382 <String "ec2.us-gov-west-1.amazonaws.com">
	// 1033 1827:iconst_0        
	// 1034 1828:iconst_1        
	// 1035 1829:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sns", "sns.us-gov-west-1.amazonaws.com", true, true);
	// 1036 1832:aload_1         
	// 1037 1833:ldc1            #44  <String "sns">
	// 1038 1835:ldc2            #384 <String "sns.us-gov-west-1.amazonaws.com">
	// 1039 1838:iconst_1        
	// 1040 1839:iconst_1        
	// 1041 1840:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sqs", "sqs.us-gov-west-1.amazonaws.com", true, true);
	// 1042 1843:aload_1         
	// 1043 1844:ldc1            #76  <String "sqs">
	// 1044 1846:ldc2            #386 <String "sqs.us-gov-west-1.amazonaws.com">
	// 1045 1849:iconst_1        
	// 1046 1850:iconst_1        
	// 1047 1851:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "s3", "s3-us-gov-west-1.amazonaws.com", true, true);
	// 1048 1854:aload_1         
	// 1049 1855:ldc1            #29  <String "s3">
	// 1050 1857:ldc2            #388 <String "s3-us-gov-west-1.amazonaws.com">
	// 1051 1860:iconst_1        
	// 1052 1861:iconst_1        
	// 1053 1862:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "sts", "sts.us-gov-west-1.amazonaws.com", false, true);
	// 1054 1865:aload_1         
	// 1055 1866:ldc1            #36  <String "sts">
	// 1056 1868:ldc2            #390 <String "sts.us-gov-west-1.amazonaws.com">
	// 1057 1871:iconst_0        
	// 1058 1872:iconst_1        
	// 1059 1873:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "elasticloadbalancing", "elasticloadbalancing.us-gov-west-1.amazonaws.com", true, true);
	// 1060 1876:aload_1         
	// 1061 1877:ldc1            #80  <String "elasticloadbalancing">
	// 1062 1879:ldc2            #392 <String "elasticloadbalancing.us-gov-west-1.amazonaws.com">
	// 1063 1882:iconst_1        
	// 1064 1883:iconst_1        
	// 1065 1884:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "autoscaling", "autoscaling.us-gov-west-1.amazonaws.com", true, true);
	// 1066 1887:aload_1         
	// 1067 1888:ldc1            #48  <String "autoscaling">
	// 1068 1890:ldc2            #394 <String "autoscaling.us-gov-west-1.amazonaws.com">
	// 1069 1893:iconst_1        
	// 1070 1894:iconst_1        
	// 1071 1895:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		a(region, "monitoring", "monitoring.us-gov-west-1.amazonaws.com", false, true);
	// 1072 1898:aload_1         
	// 1073 1899:ldc1            #40  <String "monitoring">
	// 1074 1901:ldc2            #396 <String "monitoring.us-gov-west-1.amazonaws.com">
	// 1075 1904:iconst_0        
	// 1076 1905:iconst_1        
	// 1077 1906:invokestatic    #34  <Method void a(Region, String, String, boolean, boolean)>
		return ((List) (arraylist));
	// 1078 1909:aload_0         
	// 1079 1910:areturn         
	}

	private static void a(Region region, String s, String s1, boolean flag, boolean flag1)
	{
		Map map = region.b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #403 <Method Map Region.b()>
	//    2    4:astore          5
		Map map1 = region.c();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #406 <Method Map Region.c()>
	//    5   10:astore          6
		region = ((Region) (region.d()));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #409 <Method Map Region.d()>
	//    8   16:astore_0        
		map.put(((Object) (s)), ((Object) (s1)));
	//    9   17:aload           5
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokeinterface #415 <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		map1.put(((Object) (s)), ((Object) (Boolean.valueOf(flag))));
	//   14   27:aload           6
	//   15   29:aload_1         
	//   16   30:iload_3         
	//   17   31:invokestatic    #421 <Method Boolean Boolean.valueOf(boolean)>
	//   18   34:invokeinterface #415 <Method Object Map.put(Object, Object)>
	//   19   39:pop             
		((Map) (region)).put(((Object) (s)), ((Object) (Boolean.valueOf(flag1))));
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:iload           4
	//   23   44:invokestatic    #421 <Method Boolean Boolean.valueOf(boolean)>
	//   24   47:invokeinterface #415 <Method Object Map.put(Object, Object)>
	//   25   52:pop             
	//   26   53:return          
	}
}
