// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public class kh
{

	public kh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #4546 <Method void Object()>
	//    2    4:return          
	}

	private static double d(double d1, double d2, double d3)
	{
		return Math.sin(d2 * d3 * 0.017453292519943299D) * d1;
	//    0    0:dload_2         
	//    1    1:dload           4
	//    2    3:dmul            
	//    3    4:ldc2w           #4549 <Double 0.017453292519943299D>
	//    4    7:dmul            
	//    5    8:invokestatic    #4556 <Method double Math.sin(double)>
	//    6   11:dload_0         
	//    7   12:dmul            
	//    8   13:dreturn         
	}

	public static double[] d(double d1, double d2)
	{
		int i = (int)((d1 - 71D) / 3D) * 19 + (int)(d2 / 3D);
	//    0    0:dload_0         
	//    1    1:ldc2w           #4558 <Double 71D>
	//    2    4:dsub            
	//    3    5:ldc2w           #4560 <Double 3D>
	//    4    8:ddiv            
	//    5    9:d2i             
	//    6   10:bipush          19
	//    7   12:imul            
	//    8   13:dload_2         
	//    9   14:ldc2w           #4560 <Double 3D>
	//   10   17:ddiv            
	//   11   18:d2i             
	//   12   19:iadd            
	//   13   20:istore          36
		double d3 = a[i][0];
	//   14   22:getstatic       #4542 <Field double[][] a>
	//   15   25:iload           36
	//   16   27:aaload          
	//   17   28:iconst_0        
	//   18   29:daload          
	//   19   30:dstore          4
		double d4 = a[i][1];
	//   20   32:getstatic       #4542 <Field double[][] a>
	//   21   35:iload           36
	//   22   37:aaload          
	//   23   38:iconst_1        
	//   24   39:daload          
	//   25   40:dstore          6
		double d5 = a[i][2];
	//   26   42:getstatic       #4542 <Field double[][] a>
	//   27   45:iload           36
	//   28   47:aaload          
	//   29   48:iconst_2        
	//   30   49:daload          
	//   31   50:dstore          8
		double d9 = a[i][3];
	//   32   52:getstatic       #4542 <Field double[][] a>
	//   33   55:iload           36
	//   34   57:aaload          
	//   35   58:iconst_3        
	//   36   59:daload          
	//   37   60:dstore          16
		double d10 = a[i][4];
	//   38   62:getstatic       #4542 <Field double[][] a>
	//   39   65:iload           36
	//   40   67:aaload          
	//   41   68:iconst_4        
	//   42   69:daload          
	//   43   70:dstore          18
		double d6 = a[i][5];
	//   44   72:getstatic       #4542 <Field double[][] a>
	//   45   75:iload           36
	//   46   77:aaload          
	//   47   78:iconst_5        
	//   48   79:daload          
	//   49   80:dstore          10
		double d7 = a[i][6];
	//   50   82:getstatic       #4542 <Field double[][] a>
	//   51   85:iload           36
	//   52   87:aaload          
	//   53   88:bipush          6
	//   54   90:daload          
	//   55   91:dstore          12
		double d8 = a[i][7];
	//   56   93:getstatic       #4542 <Field double[][] a>
	//   57   96:iload           36
	//   58   98:aaload          
	//   59   99:bipush          7
	//   60  101:daload          
	//   61  102:dstore          14
		double d15 = a[i][8];
	//   62  104:getstatic       #4542 <Field double[][] a>
	//   63  107:iload           36
	//   64  109:aaload          
	//   65  110:bipush          8
	//   66  112:daload          
	//   67  113:dstore          28
		d9 = (d9 * d2) / 1000000000D;
	//   68  115:dload           16
	//   69  117:dload_2         
	//   70  118:dmul            
	//   71  119:ldc2w           #4562 <Double 1000000000D>
	//   72  122:ddiv            
	//   73  123:dstore          16
		d10 /= 1000000D;
	//   74  125:dload           18
	//   75  127:ldc2w           #4564 <Double 1000000D>
	//   76  130:ddiv            
	//   77  131:dstore          18
		double d16 = d1 - 105D;
	//   78  133:dload_0         
	//   79  134:ldc2w           #4566 <Double 105D>
	//   80  137:dsub            
	//   81  138:dstore          30
		double d11 = d(150D, 15D, d16);
	//   82  140:ldc2w           #4568 <Double 150D>
	//   83  143:ldc2w           #4570 <Double 15D>
	//   84  146:dload           30
	//   85  148:invokestatic    #4573 <Method double d(double, double, double)>
	//   86  151:dstore          20
		double d12 = d(40D, 60D, d16);
	//   87  153:ldc2w           #4574 <Double 40D>
	//   88  156:ldc2w           #4576 <Double 60D>
	//   89  159:dload           30
	//   90  161:invokestatic    #4573 <Method double d(double, double, double)>
	//   91  164:dstore          22
		double d13 = d(20D, 180D, d16);
	//   92  166:ldc2w           #4578 <Double 20D>
	//   93  169:ldc2w           #4580 <Double 180D>
	//   94  172:dload           30
	//   95  174:invokestatic    #4573 <Method double d(double, double, double)>
	//   96  177:dstore          24
		double d14 = d(20D, 360D, d16);
	//   97  179:ldc2w           #4578 <Double 20D>
	//   98  182:ldc2w           #4582 <Double 360D>
	//   99  185:dload           30
	//  100  187:invokestatic    #4573 <Method double d(double, double, double)>
	//  101  190:dstore          26
		d16 = d(20D, 1080D, d16);
	//  102  192:ldc2w           #4578 <Double 20D>
	//  103  195:ldc2w           #4584 <Double 1080D>
	//  104  198:dload           30
	//  105  200:invokestatic    #4573 <Method double d(double, double, double)>
	//  106  203:dstore          30
		d15 = (d15 * d2) / 1000000000D;
	//  107  205:dload           28
	//  108  207:dload_2         
	//  109  208:dmul            
	//  110  209:ldc2w           #4562 <Double 1000000000D>
	//  111  212:ddiv            
	//  112  213:dstore          28
		double d17 = d1 - 105D;
	//  113  215:dload_0         
	//  114  216:ldc2w           #4566 <Double 105D>
	//  115  219:dsub            
	//  116  220:dstore          32
		double d18 = d2 - 35D;
	//  117  222:dload_2         
	//  118  223:ldc2w           #4586 <Double 35D>
	//  119  226:dsub            
	//  120  227:dstore          34
		return (new double[] {
			d1 + (d3 * d1 + d4 * d2 + d5 + (d11 + d12 + d13 + d14 + d16) * 0.66666666666666663D) * (d9 + d10), d2 + (d6 * d1 + d7 * d2 + d8 + (d(160D, 15D, d18) + d(40D, 60D, d18) + d(20D, 180D, d18) + d(20D, 360D, d17) + d(20D, 1080D, d17)) * 0.66666666666666663D) * (d15 + 9.0539664000000001E-06D)
		});
	//  121  229:iconst_2        
	//  122  230:newarray        double[]
	//  123  232:dup             
	//  124  233:iconst_0        
	//  125  234:dload_0         
	//  126  235:dload           4
	//  127  237:dload_0         
	//  128  238:dmul            
	//  129  239:dload           6
	//  130  241:dload_2         
	//  131  242:dmul            
	//  132  243:dadd            
	//  133  244:dload           8
	//  134  246:dadd            
	//  135  247:dload           20
	//  136  249:dload           22
	//  137  251:dadd            
	//  138  252:dload           24
	//  139  254:dadd            
	//  140  255:dload           26
	//  141  257:dadd            
	//  142  258:dload           30
	//  143  260:dadd            
	//  144  261:ldc2w           #4588 <Double 0.66666666666666663D>
	//  145  264:dmul            
	//  146  265:dadd            
	//  147  266:dload           16
	//  148  268:dload           18
	//  149  270:dadd            
	//  150  271:dmul            
	//  151  272:dadd            
	//  152  273:dastore         
	//  153  274:dup             
	//  154  275:iconst_1        
	//  155  276:dload_2         
	//  156  277:dload           10
	//  157  279:dload_0         
	//  158  280:dmul            
	//  159  281:dload           12
	//  160  283:dload_2         
	//  161  284:dmul            
	//  162  285:dadd            
	//  163  286:dload           14
	//  164  288:dadd            
	//  165  289:ldc2w           #4590 <Double 160D>
	//  166  292:ldc2w           #4570 <Double 15D>
	//  167  295:dload           34
	//  168  297:invokestatic    #4573 <Method double d(double, double, double)>
	//  169  300:ldc2w           #4574 <Double 40D>
	//  170  303:ldc2w           #4576 <Double 60D>
	//  171  306:dload           34
	//  172  308:invokestatic    #4573 <Method double d(double, double, double)>
	//  173  311:dadd            
	//  174  312:ldc2w           #4578 <Double 20D>
	//  175  315:ldc2w           #4580 <Double 180D>
	//  176  318:dload           34
	//  177  320:invokestatic    #4573 <Method double d(double, double, double)>
	//  178  323:dadd            
	//  179  324:ldc2w           #4578 <Double 20D>
	//  180  327:ldc2w           #4582 <Double 360D>
	//  181  330:dload           32
	//  182  332:invokestatic    #4573 <Method double d(double, double, double)>
	//  183  335:dadd            
	//  184  336:ldc2w           #4578 <Double 20D>
	//  185  339:ldc2w           #4584 <Double 1080D>
	//  186  342:dload           32
	//  187  344:invokestatic    #4573 <Method double d(double, double, double)>
	//  188  347:dadd            
	//  189  348:ldc2w           #4588 <Double 0.66666666666666663D>
	//  190  351:dmul            
	//  191  352:dadd            
	//  192  353:dload           28
	//  193  355:ldc2w           #4592 <Double 9.0539664000000001E-06D>
	//  194  358:dadd            
	//  195  359:dmul            
	//  196  360:dadd            
	//  197  361:dastore         
	//  198  362:areturn         
	}

	private static double a[][];

	static 
	{
		double ad[] = {
			-28.3517379D, -1.3875926999999999D, 2525.5354505D, 19.625597299999999D, 8.9143979000000009D, -0.69254470000000001D, -33.139089900000002D, 238.3347976D, -0.38996530000000001D
		};
	//    0    0:bipush          9
	//    1    2:newarray        double[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc2w           #9   <Double -28.3517379D>
	//    5    9:dastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc2w           #11  <Double -1.3875926999999999D>
	//    9   15:dastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:ldc2w           #13  <Double 2525.5354505D>
	//   13   21:dastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:ldc2w           #15  <Double 19.625597299999999D>
	//   17   27:dastore         
	//   18   28:dup             
	//   19   29:iconst_4        
	//   20   30:ldc2w           #17  <Double 8.9143979000000009D>
	//   21   33:dastore         
	//   22   34:dup             
	//   23   35:iconst_5        
	//   24   36:ldc2w           #19  <Double -0.69254470000000001D>
	//   25   39:dastore         
	//   26   40:dup             
	//   27   41:bipush          6
	//   28   43:ldc2w           #21  <Double -33.139089900000002D>
	//   29   46:dastore         
	//   30   47:dup             
	//   31   48:bipush          7
	//   32   50:ldc2w           #23  <Double 238.3347976D>
	//   33   53:dastore         
	//   34   54:dup             
	//   35   55:bipush          8
	//   36   57:ldc2w           #25  <Double -0.38996530000000001D>
	//   37   60:dastore         
	//   38   61:astore_0        
		double ad1[] = {
			-28.051737899999999D, -1.3875926999999999D, 2504.1982286000002D, 28.2628214D, 8.8398648000000009D, -0.39254470000000002D, -29.355043899999998D, 183.72457510000001D, -0.54830319999999999D
		};
	//   39   62:bipush          9
	//   40   64:newarray        double[]
	//   41   66:dup             
	//   42   67:iconst_0        
	//   43   68:ldc2w           #27  <Double -28.051737899999999D>
	//   44   71:dastore         
	//   45   72:dup             
	//   46   73:iconst_1        
	//   47   74:ldc2w           #11  <Double -1.3875926999999999D>
	//   48   77:dastore         
	//   49   78:dup             
	//   50   79:iconst_2        
	//   51   80:ldc2w           #29  <Double 2504.1982286000002D>
	//   52   83:dastore         
	//   53   84:dup             
	//   54   85:iconst_3        
	//   55   86:ldc2w           #31  <Double 28.2628214D>
	//   56   89:dastore         
	//   57   90:dup             
	//   58   91:iconst_4        
	//   59   92:ldc2w           #33  <Double 8.8398648000000009D>
	//   60   95:dastore         
	//   61   96:dup             
	//   62   97:iconst_5        
	//   63   98:ldc2w           #35  <Double -0.39254470000000002D>
	//   64  101:dastore         
	//   65  102:dup             
	//   66  103:bipush          6
	//   67  105:ldc2w           #37  <Double -29.355043899999998D>
	//   68  108:dastore         
	//   69  109:dup             
	//   70  110:bipush          7
	//   71  112:ldc2w           #39  <Double 183.72457510000001D>
	//   72  115:dastore         
	//   73  116:dup             
	//   74  117:bipush          8
	//   75  119:ldc2w           #41  <Double -0.54830319999999999D>
	//   76  122:dastore         
	//   77  123:astore_1        
		double ad2[] = {
			-27.751737899999998D, -1.3875926999999999D, 2482.8610066000001D, 37.305238799999998D, 8.7346948999999992D, -0.092544699999999994D, -23.695978700000001D, 96.003545200000005D, -0.70060560000000005D
		};
	//   78  124:bipush          9
	//   79  126:newarray        double[]
	//   80  128:dup             
	//   81  129:iconst_0        
	//   82  130:ldc2w           #43  <Double -27.751737899999998D>
	//   83  133:dastore         
	//   84  134:dup             
	//   85  135:iconst_1        
	//   86  136:ldc2w           #11  <Double -1.3875926999999999D>
	//   87  139:dastore         
	//   88  140:dup             
	//   89  141:iconst_2        
	//   90  142:ldc2w           #45  <Double 2482.8610066000001D>
	//   91  145:dastore         
	//   92  146:dup             
	//   93  147:iconst_3        
	//   94  148:ldc2w           #47  <Double 37.305238799999998D>
	//   95  151:dastore         
	//   96  152:dup             
	//   97  153:iconst_4        
	//   98  154:ldc2w           #49  <Double 8.7346948999999992D>
	//   99  157:dastore         
	//  100  158:dup             
	//  101  159:iconst_5        
	//  102  160:ldc2w           #51  <Double -0.092544699999999994D>
	//  103  163:dastore         
	//  104  164:dup             
	//  105  165:bipush          6
	//  106  167:ldc2w           #53  <Double -23.695978700000001D>
	//  107  170:dastore         
	//  108  171:dup             
	//  109  172:bipush          7
	//  110  174:ldc2w           #55  <Double 96.003545200000005D>
	//  111  177:dastore         
	//  112  178:dup             
	//  113  179:bipush          8
	//  114  181:ldc2w           #57  <Double -0.70060560000000005D>
	//  115  184:dastore         
	//  116  185:astore_2        
		double ad3[] = {
			-27.151737900000001D, -1.3875926999999999D, 2440.1865627000002D, 57.2001287D, 8.4126647000000006D, 0.50745530000000005D, -8.6395417999999999D, -191.7600726D, -0.98049019999999998D
		};
	//  117  186:bipush          9
	//  118  188:newarray        double[]
	//  119  190:dup             
	//  120  191:iconst_0        
	//  121  192:ldc2w           #59  <Double -27.151737900000001D>
	//  122  195:dastore         
	//  123  196:dup             
	//  124  197:iconst_1        
	//  125  198:ldc2w           #11  <Double -1.3875926999999999D>
	//  126  201:dastore         
	//  127  202:dup             
	//  128  203:iconst_2        
	//  129  204:ldc2w           #61  <Double 2440.1865627000002D>
	//  130  207:dastore         
	//  131  208:dup             
	//  132  209:iconst_3        
	//  133  210:ldc2w           #63  <Double 57.2001287D>
	//  134  213:dastore         
	//  135  214:dup             
	//  136  215:iconst_4        
	//  137  216:ldc2w           #65  <Double 8.4126647000000006D>
	//  138  219:dastore         
	//  139  220:dup             
	//  140  221:iconst_5        
	//  141  222:ldc2w           #67  <Double 0.50745530000000005D>
	//  142  225:dastore         
	//  143  226:dup             
	//  144  227:bipush          6
	//  145  229:ldc2w           #69  <Double -8.6395417999999999D>
	//  146  232:dastore         
	//  147  233:dup             
	//  148  234:bipush          7
	//  149  236:ldc2w           #71  <Double -191.7600726D>
	//  150  239:dastore         
	//  151  240:dup             
	//  152  241:bipush          8
	//  153  243:ldc2w           #73  <Double -0.98049019999999998D>
	//  154  246:dastore         
	//  155  247:astore_3        
		double ad4[] = {
			-26.551737899999999D, -1.3875926999999999D, 2397.5121189000001D, 80.747736000000003D, 7.8897272999999997D, 1.1074553D, 7.1958921D, -584.79144429999997D, -1.2173562D
		};
	//  156  248:bipush          9
	//  157  250:newarray        double[]
	//  158  252:dup             
	//  159  253:iconst_0        
	//  160  254:ldc2w           #75  <Double -26.551737899999999D>
	//  161  257:dastore         
	//  162  258:dup             
	//  163  259:iconst_1        
	//  164  260:ldc2w           #11  <Double -1.3875926999999999D>
	//  165  263:dastore         
	//  166  264:dup             
	//  167  265:iconst_2        
	//  168  266:ldc2w           #77  <Double 2397.5121189000001D>
	//  169  269:dastore         
	//  170  270:dup             
	//  171  271:iconst_3        
	//  172  272:ldc2w           #79  <Double 80.747736000000003D>
	//  173  275:dastore         
	//  174  276:dup             
	//  175  277:iconst_4        
	//  176  278:ldc2w           #81  <Double 7.8897272999999997D>
	//  177  281:dastore         
	//  178  282:dup             
	//  179  283:iconst_5        
	//  180  284:ldc2w           #83  <Double 1.1074553D>
	//  181  287:dastore         
	//  182  288:dup             
	//  183  289:bipush          6
	//  184  291:ldc2w           #85  <Double 7.1958921D>
	//  185  294:dastore         
	//  186  295:dup             
	//  187  296:bipush          7
	//  188  298:ldc2w           #87  <Double -584.79144429999997D>
	//  189  301:dastore         
	//  190  302:dup             
	//  191  303:bipush          8
	//  192  305:ldc2w           #89  <Double -1.2173562D>
	//  193  308:dastore         
	//  194  309:astore          4
		double ad5[] = {
			-26.251737899999998D, -1.3875926999999999D, 2376.1748969D, 94.497482399999996D, 7.5234689000000001D, 1.4074553000000001D, 13.757335299999999D, -781.08595200000002D, -1.3163339000000001D
		};
	//  195  311:bipush          9
	//  196  313:newarray        double[]
	//  197  315:dup             
	//  198  316:iconst_0        
	//  199  317:ldc2w           #91  <Double -26.251737899999998D>
	//  200  320:dastore         
	//  201  321:dup             
	//  202  322:iconst_1        
	//  203  323:ldc2w           #11  <Double -1.3875926999999999D>
	//  204  326:dastore         
	//  205  327:dup             
	//  206  328:iconst_2        
	//  207  329:ldc2w           #93  <Double 2376.1748969D>
	//  208  332:dastore         
	//  209  333:dup             
	//  210  334:iconst_3        
	//  211  335:ldc2w           #95  <Double 94.497482399999996D>
	//  212  338:dastore         
	//  213  339:dup             
	//  214  340:iconst_4        
	//  215  341:ldc2w           #97  <Double 7.5234689000000001D>
	//  216  344:dastore         
	//  217  345:dup             
	//  218  346:iconst_5        
	//  219  347:ldc2w           #99  <Double 1.4074553000000001D>
	//  220  350:dastore         
	//  221  351:dup             
	//  222  352:bipush          6
	//  223  354:ldc2w           #101 <Double 13.757335299999999D>
	//  224  357:dastore         
	//  225  358:dup             
	//  226  359:bipush          7
	//  227  361:ldc2w           #103 <Double -781.08595200000002D>
	//  228  364:dastore         
	//  229  365:dup             
	//  230  366:bipush          8
	//  231  368:ldc2w           #105 <Double -1.3163339000000001D>
	//  232  371:dastore         
	//  233  372:astore          5
		double ad6[] = {
			-25.951737900000001D, -1.3875926999999999D, 2354.8376750000002D, 110.00047410000001D, 7.0639795000000003D, 1.7074552999999999D, 18.6784438D, -948.42031829999996D, -1.4008494D
		};
	//  234  374:bipush          9
	//  235  376:newarray        double[]
	//  236  378:dup             
	//  237  379:iconst_0        
	//  238  380:ldc2w           #107 <Double -25.951737900000001D>
	//  239  383:dastore         
	//  240  384:dup             
	//  241  385:iconst_1        
	//  242  386:ldc2w           #11  <Double -1.3875926999999999D>
	//  243  389:dastore         
	//  244  390:dup             
	//  245  391:iconst_2        
	//  246  392:ldc2w           #109 <Double 2354.8376750000002D>
	//  247  395:dastore         
	//  248  396:dup             
	//  249  397:iconst_3        
	//  250  398:ldc2w           #111 <Double 110.00047410000001D>
	//  251  401:dastore         
	//  252  402:dup             
	//  253  403:iconst_4        
	//  254  404:ldc2w           #113 <Double 7.0639795000000003D>
	//  255  407:dastore         
	//  256  408:dup             
	//  257  409:iconst_5        
	//  258  410:ldc2w           #115 <Double 1.7074552999999999D>
	//  259  413:dastore         
	//  260  414:dup             
	//  261  415:bipush          6
	//  262  417:ldc2w           #117 <Double 18.6784438D>
	//  263  420:dastore         
	//  264  421:dup             
	//  265  422:bipush          7
	//  266  424:ldc2w           #119 <Double -948.42031829999996D>
	//  267  427:dastore         
	//  268  428:dup             
	//  269  429:bipush          8
	//  270  431:ldc2w           #121 <Double -1.4008494D>
	//  271  434:dastore         
	//  272  435:astore          6
		double ad7[] = {
			-25.651737900000001D, -1.3875926999999999D, 2333.5004530000001D, 127.6888198D, 6.4866308999999998D, 2.0074553000000002D, 21.5949697D, -1065.0888311000001D, -1.4699811D
		};
	//  273  437:bipush          9
	//  274  439:newarray        double[]
	//  275  441:dup             
	//  276  442:iconst_0        
	//  277  443:ldc2w           #123 <Double -25.651737900000001D>
	//  278  446:dastore         
	//  279  447:dup             
	//  280  448:iconst_1        
	//  281  449:ldc2w           #11  <Double -1.3875926999999999D>
	//  282  452:dastore         
	//  283  453:dup             
	//  284  454:iconst_2        
	//  285  455:ldc2w           #125 <Double 2333.5004530000001D>
	//  286  458:dastore         
	//  287  459:dup             
	//  288  460:iconst_3        
	//  289  461:ldc2w           #127 <Double 127.6888198D>
	//  290  464:dastore         
	//  291  465:dup             
	//  292  466:iconst_4        
	//  293  467:ldc2w           #129 <Double 6.4866308999999998D>
	//  294  470:dastore         
	//  295  471:dup             
	//  296  472:iconst_5        
	//  297  473:ldc2w           #131 <Double 2.0074553000000002D>
	//  298  476:dastore         
	//  299  477:dup             
	//  300  478:bipush          6
	//  301  480:ldc2w           #133 <Double 21.5949697D>
	//  302  483:dastore         
	//  303  484:dup             
	//  304  485:bipush          7
	//  305  487:ldc2w           #135 <Double -1065.0888311000001D>
	//  306  490:dastore         
	//  307  491:dup             
	//  308  492:bipush          8
	//  309  494:ldc2w           #137 <Double -1.4699811D>
	//  310  497:dastore         
	//  311  498:astore          7
		double ad8[] = {
			-25.051737899999999D, -1.3875926999999999D, 2290.8260092D, 171.99884599999999D, 4.8356763999999997D, 2.6074552999999998D, 20.954841399999999D, -1081.1686677D, -1.5592649999999999D
		};
	//  312  500:bipush          9
	//  313  502:newarray        double[]
	//  314  504:dup             
	//  315  505:iconst_0        
	//  316  506:ldc2w           #139 <Double -25.051737899999999D>
	//  317  509:dastore         
	//  318  510:dup             
	//  319  511:iconst_1        
	//  320  512:ldc2w           #11  <Double -1.3875926999999999D>
	//  321  515:dastore         
	//  322  516:dup             
	//  323  517:iconst_2        
	//  324  518:ldc2w           #141 <Double 2290.8260092D>
	//  325  521:dastore         
	//  326  522:dup             
	//  327  523:iconst_3        
	//  328  524:ldc2w           #143 <Double 171.99884599999999D>
	//  329  527:dastore         
	//  330  528:dup             
	//  331  529:iconst_4        
	//  332  530:ldc2w           #145 <Double 4.8356763999999997D>
	//  333  533:dastore         
	//  334  534:dup             
	//  335  535:iconst_5        
	//  336  536:ldc2w           #147 <Double 2.6074552999999998D>
	//  337  539:dastore         
	//  338  540:dup             
	//  339  541:bipush          6
	//  340  543:ldc2w           #149 <Double 20.954841399999999D>
	//  341  546:dastore         
	//  342  547:dup             
	//  343  548:bipush          7
	//  344  550:ldc2w           #151 <Double -1081.1686677D>
	//  345  553:dastore         
	//  346  554:dup             
	//  347  555:bipush          8
	//  348  557:ldc2w           #153 <Double -1.5592649999999999D>
	//  349  560:dastore         
	//  350  561:astore          8
		double ad9[] = {
			-24.451737900000001D, -1.3875926999999999D, 2248.1515653000001D, 234.27778710000001D, 2.1401053000000001D, 3.2074552999999999D, 12.9981761D, -779.06617319999998D, -1.5803442000000001D
		};
	//  351  563:bipush          9
	//  352  565:newarray        double[]
	//  353  567:dup             
	//  354  568:iconst_0        
	//  355  569:ldc2w           #155 <Double -24.451737900000001D>
	//  356  572:dastore         
	//  357  573:dup             
	//  358  574:iconst_1        
	//  359  575:ldc2w           #11  <Double -1.3875926999999999D>
	//  360  578:dastore         
	//  361  579:dup             
	//  362  580:iconst_2        
	//  363  581:ldc2w           #157 <Double 2248.1515653000001D>
	//  364  584:dastore         
	//  365  585:dup             
	//  366  586:iconst_3        
	//  367  587:ldc2w           #159 <Double 234.27778710000001D>
	//  368  590:dastore         
	//  369  591:dup             
	//  370  592:iconst_4        
	//  371  593:ldc2w           #161 <Double 2.1401053000000001D>
	//  372  596:dastore         
	//  373  597:dup             
	//  374  598:iconst_5        
	//  375  599:ldc2w           #163 <Double 3.2074552999999999D>
	//  376  602:dastore         
	//  377  603:dup             
	//  378  604:bipush          6
	//  379  606:ldc2w           #165 <Double 12.9981761D>
	//  380  609:dastore         
	//  381  610:dup             
	//  382  611:bipush          7
	//  383  613:ldc2w           #167 <Double -779.06617319999998D>
	//  384  616:dastore         
	//  385  617:dup             
	//  386  618:bipush          8
	//  387  620:ldc2w           #169 <Double -1.5803442000000001D>
	//  388  623:dastore         
	//  389  624:astore          9
		double ad10[] = {
			-24.151737900000001D, -1.3875926999999999D, 2226.8143433D, 275.7268449D, 0.1651599D, 3.5074553000000002D, 7.4393393000000003D, -536.01713319999999D, -1.5649227999999999D
		};
	//  390  626:bipush          9
	//  391  628:newarray        double[]
	//  392  630:dup             
	//  393  631:iconst_0        
	//  394  632:ldc2w           #171 <Double -24.151737900000001D>
	//  395  635:dastore         
	//  396  636:dup             
	//  397  637:iconst_1        
	//  398  638:ldc2w           #11  <Double -1.3875926999999999D>
	//  399  641:dastore         
	//  400  642:dup             
	//  401  643:iconst_2        
	//  402  644:ldc2w           #173 <Double 2226.8143433D>
	//  403  647:dastore         
	//  404  648:dup             
	//  405  649:iconst_3        
	//  406  650:ldc2w           #175 <Double 275.7268449D>
	//  407  653:dastore         
	//  408  654:dup             
	//  409  655:iconst_4        
	//  410  656:ldc2w           #177 <Double 0.1651599D>
	//  411  659:dastore         
	//  412  660:dup             
	//  413  661:iconst_5        
	//  414  662:ldc2w           #179 <Double 3.5074553000000002D>
	//  415  665:dastore         
	//  416  666:dup             
	//  417  667:bipush          6
	//  418  669:ldc2w           #181 <Double 7.4393393000000003D>
	//  419  672:dastore         
	//  420  673:dup             
	//  421  674:bipush          7
	//  422  676:ldc2w           #183 <Double -536.01713319999999D>
	//  423  679:dastore         
	//  424  680:dup             
	//  425  681:bipush          8
	//  426  683:ldc2w           #185 <Double -1.5649227999999999D>
	//  427  686:dastore         
	//  428  687:astore          10
		double ad11[] = {
			-23.551737899999999D, -1.3875926999999999D, 2184.1398995D, 392.10647540000002D, -5.9244687000000003D, 4.1074552999999998D, -3.5960945999999998D, -5.1215304000000001D, -1.4830451D
		};
	//  429  689:bipush          9
	//  430  691:newarray        double[]
	//  431  693:dup             
	//  432  694:iconst_0        
	//  433  695:ldc2w           #187 <Double -23.551737899999999D>
	//  434  698:dastore         
	//  435  699:dup             
	//  436  700:iconst_1        
	//  437  701:ldc2w           #11  <Double -1.3875926999999999D>
	//  438  704:dastore         
	//  439  705:dup             
	//  440  706:iconst_2        
	//  441  707:ldc2w           #189 <Double 2184.1398995D>
	//  442  710:dastore         
	//  443  711:dup             
	//  444  712:iconst_3        
	//  445  713:ldc2w           #191 <Double 392.10647540000002D>
	//  446  716:dastore         
	//  447  717:dup             
	//  448  718:iconst_4        
	//  449  719:ldc2w           #193 <Double -5.9244687000000003D>
	//  450  722:dastore         
	//  451  723:dup             
	//  452  724:iconst_5        
	//  453  725:ldc2w           #195 <Double 4.1074552999999998D>
	//  454  728:dastore         
	//  455  729:dup             
	//  456  730:bipush          6
	//  457  732:ldc2w           #197 <Double -3.5960945999999998D>
	//  458  735:dastore         
	//  459  736:dup             
	//  460  737:bipush          7
	//  461  739:ldc2w           #199 <Double -5.1215304000000001D>
	//  462  742:dastore         
	//  463  743:dup             
	//  464  744:bipush          8
	//  465  746:ldc2w           #201 <Double -1.4830451D>
	//  466  749:dastore         
	//  467  750:astore          11
		double ad12[] = {
			-29.035007799999999D, -0.83208029999999999D, 2572.9940385999998D, 3.0597946D, 8.9830009000000004D, -1.2934159999999999D, -33.978662200000002D, 289.65584960000001D, -0.062199999999999998D
		};
	//  468  752:bipush          9
	//  469  754:newarray        double[]
	//  470  756:dup             
	//  471  757:iconst_0        
	//  472  758:ldc2w           #203 <Double -29.035007799999999D>
	//  473  761:dastore         
	//  474  762:dup             
	//  475  763:iconst_1        
	//  476  764:ldc2w           #205 <Double -0.83208029999999999D>
	//  477  767:dastore         
	//  478  768:dup             
	//  479  769:iconst_2        
	//  480  770:ldc2w           #207 <Double 2572.9940385999998D>
	//  481  773:dastore         
	//  482  774:dup             
	//  483  775:iconst_3        
	//  484  776:ldc2w           #209 <Double 3.0597946D>
	//  485  779:dastore         
	//  486  780:dup             
	//  487  781:iconst_4        
	//  488  782:ldc2w           #211 <Double 8.9830009000000004D>
	//  489  785:dastore         
	//  490  786:dup             
	//  491  787:iconst_5        
	//  492  788:ldc2w           #213 <Double -1.2934159999999999D>
	//  493  791:dastore         
	//  494  792:dup             
	//  495  793:bipush          6
	//  496  795:ldc2w           #215 <Double -33.978662200000002D>
	//  497  798:dastore         
	//  498  799:dup             
	//  499  800:bipush          7
	//  500  802:ldc2w           #217 <Double 289.65584960000001D>
	//  501  805:dastore         
	//  502  806:dup             
	//  503  807:bipush          8
	//  504  809:ldc2w           #219 <Double -0.062199999999999998D>
	//  505  812:dastore         
	//  506  813:astore          12
		double ad13[] = {
			-28.435007800000001D, -0.83208029999999999D, 2526.9865202999999D, 19.625597299999999D, 8.9143979000000009D, -0.69341600000000003D, -32.839105699999998D, 235.9244119D, -0.38996530000000001D
		};
	//  507  815:bipush          9
	//  508  817:newarray        double[]
	//  509  819:dup             
	//  510  820:iconst_0        
	//  511  821:ldc2w           #221 <Double -28.435007800000001D>
	//  512  824:dastore         
	//  513  825:dup             
	//  514  826:iconst_1        
	//  515  827:ldc2w           #205 <Double -0.83208029999999999D>
	//  516  830:dastore         
	//  517  831:dup             
	//  518  832:iconst_2        
	//  519  833:ldc2w           #223 <Double 2526.9865202999999D>
	//  520  836:dastore         
	//  521  837:dup             
	//  522  838:iconst_3        
	//  523  839:ldc2w           #15  <Double 19.625597299999999D>
	//  524  842:dastore         
	//  525  843:dup             
	//  526  844:iconst_4        
	//  527  845:ldc2w           #17  <Double 8.9143979000000009D>
	//  528  848:dastore         
	//  529  849:dup             
	//  530  850:iconst_5        
	//  531  851:ldc2w           #225 <Double -0.69341600000000003D>
	//  532  854:dastore         
	//  533  855:dup             
	//  534  856:bipush          6
	//  535  858:ldc2w           #227 <Double -32.839105699999998D>
	//  536  861:dastore         
	//  537  862:dup             
	//  538  863:bipush          7
	//  539  865:ldc2w           #229 <Double 235.9244119D>
	//  540  868:dastore         
	//  541  869:dup             
	//  542  870:bipush          8
	//  543  872:ldc2w           #25  <Double -0.38996530000000001D>
	//  544  875:dastore         
	//  545  876:astore          13
		double ad14[] = {
			-26.3350078D, -0.83208029999999999D, 2365.9602063000002D, 94.497482399999996D, 7.5234689000000001D, 1.4065840000000001D, 14.0573195D, -789.79600500000004D, -1.3163339000000001D
		};
	//  546  878:bipush          9
	//  547  880:newarray        double[]
	//  548  882:dup             
	//  549  883:iconst_0        
	//  550  884:ldc2w           #231 <Double -26.3350078D>
	//  551  887:dastore         
	//  552  888:dup             
	//  553  889:iconst_1        
	//  554  890:ldc2w           #205 <Double -0.83208029999999999D>
	//  555  893:dastore         
	//  556  894:dup             
	//  557  895:iconst_2        
	//  558  896:ldc2w           #233 <Double 2365.9602063000002D>
	//  559  899:dastore         
	//  560  900:dup             
	//  561  901:iconst_3        
	//  562  902:ldc2w           #95  <Double 94.497482399999996D>
	//  563  905:dastore         
	//  564  906:dup             
	//  565  907:iconst_4        
	//  566  908:ldc2w           #97  <Double 7.5234689000000001D>
	//  567  911:dastore         
	//  568  912:dup             
	//  569  913:iconst_5        
	//  570  914:ldc2w           #235 <Double 1.4065840000000001D>
	//  571  917:dastore         
	//  572  918:dup             
	//  573  919:bipush          6
	//  574  921:ldc2w           #237 <Double 14.0573195D>
	//  575  924:dastore         
	//  576  925:dup             
	//  577  926:bipush          7
	//  578  928:ldc2w           #239 <Double -789.79600500000004D>
	//  579  931:dastore         
	//  580  932:dup             
	//  581  933:bipush          8
	//  582  935:ldc2w           #105 <Double -1.3163339000000001D>
	//  583  938:dastore         
	//  584  939:astore          14
		double ad15[] = {
			-26.035007799999999D, -0.83208029999999999D, 2342.9564472000002D, 110.00047410000001D, 7.0639795000000003D, 1.7065840000000001D, 18.978428000000001D, -958.03032380000002D, -1.4008494D
		};
	//  585  941:bipush          9
	//  586  943:newarray        double[]
	//  587  945:dup             
	//  588  946:iconst_0        
	//  589  947:ldc2w           #241 <Double -26.035007799999999D>
	//  590  950:dastore         
	//  591  951:dup             
	//  592  952:iconst_1        
	//  593  953:ldc2w           #205 <Double -0.83208029999999999D>
	//  594  956:dastore         
	//  595  957:dup             
	//  596  958:iconst_2        
	//  597  959:ldc2w           #243 <Double 2342.9564472000002D>
	//  598  962:dastore         
	//  599  963:dup             
	//  600  964:iconst_3        
	//  601  965:ldc2w           #111 <Double 110.00047410000001D>
	//  602  968:dastore         
	//  603  969:dup             
	//  604  970:iconst_4        
	//  605  971:ldc2w           #113 <Double 7.0639795000000003D>
	//  606  974:dastore         
	//  607  975:dup             
	//  608  976:iconst_5        
	//  609  977:ldc2w           #245 <Double 1.7065840000000001D>
	//  610  980:dastore         
	//  611  981:dup             
	//  612  982:bipush          6
	//  613  984:ldc2w           #247 <Double 18.978428000000001D>
	//  614  987:dastore         
	//  615  988:dup             
	//  616  989:bipush          7
	//  617  991:ldc2w           #249 <Double -958.03032380000002D>
	//  618  994:dastore         
	//  619  995:dup             
	//  620  996:bipush          8
	//  621  998:ldc2w           #121 <Double -1.4008494D>
	//  622 1001:dastore         
	//  623 1002:astore          15
		double ad16[] = {
			-25.735007800000002D, -0.83208029999999999D, 2319.9526879999999D, 127.6888198D, 6.4866308999999998D, 2.0065840000000001D, 21.894953900000001D, -1075.5987889999999D, -1.4699811D
		};
	//  624 1004:bipush          9
	//  625 1006:newarray        double[]
	//  626 1008:dup             
	//  627 1009:iconst_0        
	//  628 1010:ldc2w           #251 <Double -25.735007800000002D>
	//  629 1013:dastore         
	//  630 1014:dup             
	//  631 1015:iconst_1        
	//  632 1016:ldc2w           #205 <Double -0.83208029999999999D>
	//  633 1019:dastore         
	//  634 1020:dup             
	//  635 1021:iconst_2        
	//  636 1022:ldc2w           #253 <Double 2319.9526879999999D>
	//  637 1025:dastore         
	//  638 1026:dup             
	//  639 1027:iconst_3        
	//  640 1028:ldc2w           #127 <Double 127.6888198D>
	//  641 1031:dastore         
	//  642 1032:dup             
	//  643 1033:iconst_4        
	//  644 1034:ldc2w           #129 <Double 6.4866308999999998D>
	//  645 1037:dastore         
	//  646 1038:dup             
	//  647 1039:iconst_5        
	//  648 1040:ldc2w           #255 <Double 2.0065840000000001D>
	//  649 1043:dastore         
	//  650 1044:dup             
	//  651 1045:bipush          6
	//  652 1047:ldc2w           #257 <Double 21.894953900000001D>
	//  653 1050:dastore         
	//  654 1051:dup             
	//  655 1052:bipush          7
	//  656 1054:ldc2w           #259 <Double -1075.5987889999999D>
	//  657 1057:dastore         
	//  658 1058:dup             
	//  659 1059:bipush          8
	//  660 1061:ldc2w           #137 <Double -1.4699811D>
	//  661 1064:dastore         
	//  662 1065:astore          16
		double ad17[] = {
			-24.8350078D, -0.83208029999999999D, 2250.9414105999999D, 200.29154579999999D, 3.6574485999999999D, 2.9065840000000001D, 17.995760300000001D, -980.28488849999997D, -1.5784544D
		};
	//  663 1067:bipush          9
	//  664 1069:newarray        double[]
	//  665 1071:dup             
	//  666 1072:iconst_0        
	//  667 1073:ldc2w           #261 <Double -24.8350078D>
	//  668 1076:dastore         
	//  669 1077:dup             
	//  670 1078:iconst_1        
	//  671 1079:ldc2w           #205 <Double -0.83208029999999999D>
	//  672 1082:dastore         
	//  673 1083:dup             
	//  674 1084:iconst_2        
	//  675 1085:ldc2w           #263 <Double 2250.9414105999999D>
	//  676 1088:dastore         
	//  677 1089:dup             
	//  678 1090:iconst_3        
	//  679 1091:ldc2w           #265 <Double 200.29154579999999D>
	//  680 1094:dastore         
	//  681 1095:dup             
	//  682 1096:iconst_4        
	//  683 1097:ldc2w           #267 <Double 3.6574485999999999D>
	//  684 1100:dastore         
	//  685 1101:dup             
	//  686 1102:iconst_5        
	//  687 1103:ldc2w           #269 <Double 2.9065840000000001D>
	//  688 1106:dastore         
	//  689 1107:dup             
	//  690 1108:bipush          6
	//  691 1110:ldc2w           #271 <Double 17.995760300000001D>
	//  692 1113:dastore         
	//  693 1114:dup             
	//  694 1115:bipush          7
	//  695 1117:ldc2w           #273 <Double -980.28488849999997D>
	//  696 1120:dastore         
	//  697 1121:dup             
	//  698 1122:bipush          8
	//  699 1124:ldc2w           #275 <Double -1.5784544D>
	//  700 1127:dastore         
	//  701 1128:astore          17
		double ad18[] = {
			-24.535007799999999D, -0.83208029999999999D, 2227.9376514999999D, 234.27778710000001D, 2.1401053000000001D, 3.2065839999999999D, 13.2981602D, -793.17594099999997D, -1.5803442000000001D
		};
	//  702 1130:bipush          9
	//  703 1132:newarray        double[]
	//  704 1134:dup             
	//  705 1135:iconst_0        
	//  706 1136:ldc2w           #277 <Double -24.535007799999999D>
	//  707 1139:dastore         
	//  708 1140:dup             
	//  709 1141:iconst_1        
	//  710 1142:ldc2w           #205 <Double -0.83208029999999999D>
	//  711 1145:dastore         
	//  712 1146:dup             
	//  713 1147:iconst_2        
	//  714 1148:ldc2w           #279 <Double 2227.9376514999999D>
	//  715 1151:dastore         
	//  716 1152:dup             
	//  717 1153:iconst_3        
	//  718 1154:ldc2w           #159 <Double 234.27778710000001D>
	//  719 1157:dastore         
	//  720 1158:dup             
	//  721 1159:iconst_4        
	//  722 1160:ldc2w           #161 <Double 2.1401053000000001D>
	//  723 1163:dastore         
	//  724 1164:dup             
	//  725 1165:iconst_5        
	//  726 1166:ldc2w           #281 <Double 3.2065839999999999D>
	//  727 1169:dastore         
	//  728 1170:dup             
	//  729 1171:bipush          6
	//  730 1173:ldc2w           #283 <Double 13.2981602D>
	//  731 1176:dastore         
	//  732 1177:dup             
	//  733 1178:bipush          7
	//  734 1180:ldc2w           #285 <Double -793.17594099999997D>
	//  735 1183:dastore         
	//  736 1184:dup             
	//  737 1185:bipush          8
	//  738 1187:ldc2w           #169 <Double -1.5803442000000001D>
	//  739 1190:dastore         
	//  740 1191:astore          18
		double ad19[] = {
			-23.935007800000001D, -0.83208029999999999D, 2181.9301332D, 327.13300479999998D, -2.4385346000000001D, 3.806584D, 1.9808520000000001D, -282.1695972D, -1.5323681D
		};
	//  741 1193:bipush          9
	//  742 1195:newarray        double[]
	//  743 1197:dup             
	//  744 1198:iconst_0        
	//  745 1199:ldc2w           #287 <Double -23.935007800000001D>
	//  746 1202:dastore         
	//  747 1203:dup             
	//  748 1204:iconst_1        
	//  749 1205:ldc2w           #205 <Double -0.83208029999999999D>
	//  750 1208:dastore         
	//  751 1209:dup             
	//  752 1210:iconst_2        
	//  753 1211:ldc2w           #289 <Double 2181.9301332D>
	//  754 1214:dastore         
	//  755 1215:dup             
	//  756 1216:iconst_3        
	//  757 1217:ldc2w           #291 <Double 327.13300479999998D>
	//  758 1220:dastore         
	//  759 1221:dup             
	//  760 1222:iconst_4        
	//  761 1223:ldc2w           #293 <Double -2.4385346000000001D>
	//  762 1226:dastore         
	//  763 1227:dup             
	//  764 1228:iconst_5        
	//  765 1229:ldc2w           #295 <Double 3.806584D>
	//  766 1232:dastore         
	//  767 1233:dup             
	//  768 1234:bipush          6
	//  769 1236:ldc2w           #297 <Double 1.9808520000000001D>
	//  770 1239:dastore         
	//  771 1240:dup             
	//  772 1241:bipush          7
	//  773 1243:ldc2w           #299 <Double -282.1695972D>
	//  774 1246:dastore         
	//  775 1247:dup             
	//  776 1248:bipush          8
	//  777 1250:ldc2w           #301 <Double -1.5323681D>
	//  778 1253:dastore         
	//  779 1254:astore          19
		double ad20[] = {
			-23.6350078D, -0.83208029999999999D, 2158.9263741D, 392.10647540000002D, -5.9244687000000003D, 4.1065839999999998D, -3.2961103999999999D, -21.9311556D, -1.4830451D
		};
	//  780 1256:bipush          9
	//  781 1258:newarray        double[]
	//  782 1260:dup             
	//  783 1261:iconst_0        
	//  784 1262:ldc2w           #303 <Double -23.6350078D>
	//  785 1265:dastore         
	//  786 1266:dup             
	//  787 1267:iconst_1        
	//  788 1268:ldc2w           #205 <Double -0.83208029999999999D>
	//  789 1271:dastore         
	//  790 1272:dup             
	//  791 1273:iconst_2        
	//  792 1274:ldc2w           #305 <Double 2158.9263741D>
	//  793 1277:dastore         
	//  794 1278:dup             
	//  795 1279:iconst_3        
	//  796 1280:ldc2w           #191 <Double 392.10647540000002D>
	//  797 1283:dastore         
	//  798 1284:dup             
	//  799 1285:iconst_4        
	//  800 1286:ldc2w           #193 <Double -5.9244687000000003D>
	//  801 1289:dastore         
	//  802 1290:dup             
	//  803 1291:iconst_5        
	//  804 1292:ldc2w           #307 <Double 4.1065839999999998D>
	//  805 1295:dastore         
	//  806 1296:dup             
	//  807 1297:bipush          6
	//  808 1299:ldc2w           #309 <Double -3.2961103999999999D>
	//  809 1302:dastore         
	//  810 1303:dup             
	//  811 1304:bipush          7
	//  812 1306:ldc2w           #311 <Double -21.9311556D>
	//  813 1309:dastore         
	//  814 1310:dup             
	//  815 1311:bipush          8
	//  816 1313:ldc2w           #201 <Double -1.4830451D>
	//  817 1316:dastore         
	//  818 1317:astore          20
		double ad21[] = {
			-26.777328300000001D, -0.2807772D, 2396.2287978999998D, 11.2644424D, 8.9614528999999994D, -0.99443159999999997D, -34.1952085D, 266.63255989999999D, -0.22733419999999999D
		};
	//  819 1319:bipush          9
	//  820 1321:newarray        double[]
	//  821 1323:dup             
	//  822 1324:iconst_0        
	//  823 1325:ldc2w           #313 <Double -26.777328300000001D>
	//  824 1328:dastore         
	//  825 1329:dup             
	//  826 1330:iconst_1        
	//  827 1331:ldc2w           #315 <Double -0.2807772D>
	//  828 1334:dastore         
	//  829 1335:dup             
	//  830 1336:iconst_2        
	//  831 1337:ldc2w           #317 <Double 2396.2287978999998D>
	//  832 1340:dastore         
	//  833 1341:dup             
	//  834 1342:iconst_3        
	//  835 1343:ldc2w           #319 <Double 11.2644424D>
	//  836 1346:dastore         
	//  837 1347:dup             
	//  838 1348:iconst_4        
	//  839 1349:ldc2w           #321 <Double 8.9614528999999994D>
	//  840 1352:dastore         
	//  841 1353:dup             
	//  842 1354:iconst_5        
	//  843 1355:ldc2w           #323 <Double -0.99443159999999997D>
	//  844 1358:dastore         
	//  845 1359:dup             
	//  846 1360:bipush          6
	//  847 1362:ldc2w           #325 <Double -34.1952085D>
	//  848 1365:dastore         
	//  849 1366:dup             
	//  850 1367:bipush          7
	//  851 1369:ldc2w           #327 <Double 266.63255989999999D>
	//  852 1372:dastore         
	//  853 1373:dup             
	//  854 1374:bipush          8
	//  855 1376:ldc2w           #329 <Double -0.22733419999999999D>
	//  856 1379:dastore         
	//  857 1380:astore          21
		double ad22[] = {
			-25.277328300000001D, -0.2807772D, 2272.9404559999998D, 57.2001287D, 8.4126647000000006D, 0.50556840000000003D, -8.0395780999999999D, -203.76664249999999D, -0.98049019999999998D
		};
	//  858 1382:bipush          9
	//  859 1384:newarray        double[]
	//  860 1386:dup             
	//  861 1387:iconst_0        
	//  862 1388:ldc2w           #331 <Double -25.277328300000001D>
	//  863 1391:dastore         
	//  864 1392:dup             
	//  865 1393:iconst_1        
	//  866 1394:ldc2w           #315 <Double -0.2807772D>
	//  867 1397:dastore         
	//  868 1398:dup             
	//  869 1399:iconst_2        
	//  870 1400:ldc2w           #333 <Double 2272.9404559999998D>
	//  871 1403:dastore         
	//  872 1404:dup             
	//  873 1405:iconst_3        
	//  874 1406:ldc2w           #63  <Double 57.2001287D>
	//  875 1409:dastore         
	//  876 1410:dup             
	//  877 1411:iconst_4        
	//  878 1412:ldc2w           #65  <Double 8.4126647000000006D>
	//  879 1415:dastore         
	//  880 1416:dup             
	//  881 1417:iconst_5        
	//  882 1418:ldc2w           #335 <Double 0.50556840000000003D>
	//  883 1421:dastore         
	//  884 1422:dup             
	//  885 1423:bipush          6
	//  886 1425:ldc2w           #337 <Double -8.0395780999999999D>
	//  887 1428:dastore         
	//  888 1429:dup             
	//  889 1430:bipush          7
	//  890 1432:ldc2w           #339 <Double -203.76664249999999D>
	//  891 1435:dastore         
	//  892 1436:dup             
	//  893 1437:bipush          8
	//  894 1439:ldc2w           #73  <Double -0.98049019999999998D>
	//  895 1442:dastore         
	//  896 1443:astore          22
		double ad23[] = {
			-24.9773283D, -0.2807772D, 2248.2827876000001D, 68.407805800000006D, 8.1813959000000001D, 0.80556839999999996D, 0.1188934D, -395.56899149999998D, -1.1049982D
		};
	//  897 1445:bipush          9
	//  898 1447:newarray        double[]
	//  899 1449:dup             
	//  900 1450:iconst_0        
	//  901 1451:ldc2w           #341 <Double -24.9773283D>
	//  902 1454:dastore         
	//  903 1455:dup             
	//  904 1456:iconst_1        
	//  905 1457:ldc2w           #315 <Double -0.2807772D>
	//  906 1460:dastore         
	//  907 1461:dup             
	//  908 1462:iconst_2        
	//  909 1463:ldc2w           #343 <Double 2248.2827876000001D>
	//  910 1466:dastore         
	//  911 1467:dup             
	//  912 1468:iconst_3        
	//  913 1469:ldc2w           #345 <Double 68.407805800000006D>
	//  914 1472:dastore         
	//  915 1473:dup             
	//  916 1474:iconst_4        
	//  917 1475:ldc2w           #347 <Double 8.1813959000000001D>
	//  918 1478:dastore         
	//  919 1479:dup             
	//  920 1480:iconst_5        
	//  921 1481:ldc2w           #349 <Double 0.80556839999999996D>
	//  922 1484:dastore         
	//  923 1485:dup             
	//  924 1486:bipush          6
	//  925 1488:ldc2w           #351 <Double 0.1188934D>
	//  926 1491:dastore         
	//  927 1492:dup             
	//  928 1493:bipush          7
	//  929 1495:ldc2w           #353 <Double -395.56899149999998D>
	//  930 1498:dastore         
	//  931 1499:dup             
	//  932 1500:bipush          8
	//  933 1502:ldc2w           #355 <Double -1.1049982D>
	//  934 1505:dastore         
	//  935 1506:astore          23
		double ad24[] = {
			-24.377328299999999D, -0.2807772D, 2198.9674507999998D, 94.497482399999996D, 7.5234689000000001D, 1.4055683999999999D, 14.357298999999999D, -798.49219530000005D, -1.3163339000000001D
		};
	//  936 1508:bipush          9
	//  937 1510:newarray        double[]
	//  938 1512:dup             
	//  939 1513:iconst_0        
	//  940 1514:ldc2w           #357 <Double -24.377328299999999D>
	//  941 1517:dastore         
	//  942 1518:dup             
	//  943 1519:iconst_1        
	//  944 1520:ldc2w           #315 <Double -0.2807772D>
	//  945 1523:dastore         
	//  946 1524:dup             
	//  947 1525:iconst_2        
	//  948 1526:ldc2w           #359 <Double 2198.9674507999998D>
	//  949 1529:dastore         
	//  950 1530:dup             
	//  951 1531:iconst_3        
	//  952 1532:ldc2w           #95  <Double 94.497482399999996D>
	//  953 1535:dastore         
	//  954 1536:dup             
	//  955 1537:iconst_4        
	//  956 1538:ldc2w           #97  <Double 7.5234689000000001D>
	//  957 1541:dastore         
	//  958 1542:dup             
	//  959 1543:iconst_5        
	//  960 1544:ldc2w           #361 <Double 1.4055683999999999D>
	//  961 1547:dastore         
	//  962 1548:dup             
	//  963 1549:bipush          6
	//  964 1551:ldc2w           #363 <Double 14.357298999999999D>
	//  965 1554:dastore         
	//  966 1555:dup             
	//  967 1556:bipush          7
	//  968 1558:ldc2w           #365 <Double -798.49219530000005D>
	//  969 1561:dastore         
	//  970 1562:dup             
	//  971 1563:bipush          8
	//  972 1565:ldc2w           #105 <Double -1.3163339000000001D>
	//  973 1568:dastore         
	//  974 1569:astore          24
		double ad25[] = {
			-24.077328300000001D, -0.2807772D, 2174.3097824000001D, 110.00047410000001D, 7.0639795000000003D, 1.7055684D, 19.2784075D, -967.62645269999996D, -1.4008494D
		};
	//  975 1571:bipush          9
	//  976 1573:newarray        double[]
	//  977 1575:dup             
	//  978 1576:iconst_0        
	//  979 1577:ldc2w           #367 <Double -24.077328300000001D>
	//  980 1580:dastore         
	//  981 1581:dup             
	//  982 1582:iconst_1        
	//  983 1583:ldc2w           #315 <Double -0.2807772D>
	//  984 1586:dastore         
	//  985 1587:dup             
	//  986 1588:iconst_2        
	//  987 1589:ldc2w           #369 <Double 2174.3097824000001D>
	//  988 1592:dastore         
	//  989 1593:dup             
	//  990 1594:iconst_3        
	//  991 1595:ldc2w           #111 <Double 110.00047410000001D>
	//  992 1598:dastore         
	//  993 1599:dup             
	//  994 1600:iconst_4        
	//  995 1601:ldc2w           #113 <Double 7.0639795000000003D>
	//  996 1604:dastore         
	//  997 1605:dup             
	//  998 1606:iconst_5        
	//  999 1607:ldc2w           #371 <Double 1.7055684D>
	// 1000 1610:dastore         
	// 1001 1611:dup             
	// 1002 1612:bipush          6
	// 1003 1614:ldc2w           #373 <Double 19.2784075D>
	// 1004 1617:dastore         
	// 1005 1618:dup             
	// 1006 1619:bipush          7
	// 1007 1621:ldc2w           #375 <Double -967.62645269999996D>
	// 1008 1624:dastore         
	// 1009 1625:dup             
	// 1010 1626:bipush          8
	// 1011 1628:ldc2w           #121 <Double -1.4008494D>
	// 1012 1631:dastore         
	// 1013 1632:astore          25
		double ad26[] = {
			-22.877328299999999D, -0.2807772D, 2075.6791088999998D, 200.29154579999999D, 3.6574485999999999D, 2.9055683999999999D, 18.295739900000001D, -993.48077190000004D, -1.5784544D
		};
	// 1014 1634:bipush          9
	// 1015 1636:newarray        double[]
	// 1016 1638:dup             
	// 1017 1639:iconst_0        
	// 1018 1640:ldc2w           #377 <Double -22.877328299999999D>
	// 1019 1643:dastore         
	// 1020 1644:dup             
	// 1021 1645:iconst_1        
	// 1022 1646:ldc2w           #315 <Double -0.2807772D>
	// 1023 1649:dastore         
	// 1024 1650:dup             
	// 1025 1651:iconst_2        
	// 1026 1652:ldc2w           #379 <Double 2075.6791088999998D>
	// 1027 1655:dastore         
	// 1028 1656:dup             
	// 1029 1657:iconst_3        
	// 1030 1658:ldc2w           #265 <Double 200.29154579999999D>
	// 1031 1661:dastore         
	// 1032 1662:dup             
	// 1033 1663:iconst_4        
	// 1034 1664:ldc2w           #267 <Double 3.6574485999999999D>
	// 1035 1667:dastore         
	// 1036 1668:dup             
	// 1037 1669:iconst_5        
	// 1038 1670:ldc2w           #381 <Double 2.9055683999999999D>
	// 1039 1673:dastore         
	// 1040 1674:dup             
	// 1041 1675:bipush          6
	// 1042 1677:ldc2w           #383 <Double 18.295739900000001D>
	// 1043 1680:dastore         
	// 1044 1681:dup             
	// 1045 1682:bipush          7
	// 1046 1684:ldc2w           #385 <Double -993.48077190000004D>
	// 1047 1687:dastore         
	// 1048 1688:dup             
	// 1049 1689:bipush          8
	// 1050 1691:ldc2w           #275 <Double -1.5784544D>
	// 1051 1694:dastore         
	// 1052 1695:astore          26
		double ad27[] = {
			-22.577328300000001D, -0.2807772D, 2051.0214405000002D, 234.27778710000001D, 2.1401053000000001D, 3.2055684000000002D, 13.5981398D, -807.27176310000004D, -1.5803442000000001D
		};
	// 1053 1697:bipush          9
	// 1054 1699:newarray        double[]
	// 1055 1701:dup             
	// 1056 1702:iconst_0        
	// 1057 1703:ldc2w           #387 <Double -22.577328300000001D>
	// 1058 1706:dastore         
	// 1059 1707:dup             
	// 1060 1708:iconst_1        
	// 1061 1709:ldc2w           #315 <Double -0.2807772D>
	// 1062 1712:dastore         
	// 1063 1713:dup             
	// 1064 1714:iconst_2        
	// 1065 1715:ldc2w           #389 <Double 2051.0214405000002D>
	// 1066 1718:dastore         
	// 1067 1719:dup             
	// 1068 1720:iconst_3        
	// 1069 1721:ldc2w           #159 <Double 234.27778710000001D>
	// 1070 1724:dastore         
	// 1071 1725:dup             
	// 1072 1726:iconst_4        
	// 1073 1727:ldc2w           #161 <Double 2.1401053000000001D>
	// 1074 1730:dastore         
	// 1075 1731:dup             
	// 1076 1732:iconst_5        
	// 1077 1733:ldc2w           #391 <Double 3.2055684000000002D>
	// 1078 1736:dastore         
	// 1079 1737:dup             
	// 1080 1738:bipush          6
	// 1081 1740:ldc2w           #393 <Double 13.5981398D>
	// 1082 1743:dastore         
	// 1083 1744:dup             
	// 1084 1745:bipush          7
	// 1085 1747:ldc2w           #395 <Double -807.27176310000004D>
	// 1086 1750:dastore         
	// 1087 1751:dup             
	// 1088 1752:bipush          8
	// 1089 1754:ldc2w           #169 <Double -1.5803442000000001D>
	// 1090 1757:dastore         
	// 1091 1758:astore          27
		double ad28[] = {
			-21.9773283D, -0.2807772D, 2001.7061037000001D, 327.13300479999998D, -2.4385346000000001D, 3.8055683999999999D, 2.2808315000000001D, -298.06529649999999D, -1.5323681D
		};
	// 1092 1760:bipush          9
	// 1093 1762:newarray        double[]
	// 1094 1764:dup             
	// 1095 1765:iconst_0        
	// 1096 1766:ldc2w           #397 <Double -21.9773283D>
	// 1097 1769:dastore         
	// 1098 1770:dup             
	// 1099 1771:iconst_1        
	// 1100 1772:ldc2w           #315 <Double -0.2807772D>
	// 1101 1775:dastore         
	// 1102 1776:dup             
	// 1103 1777:iconst_2        
	// 1104 1778:ldc2w           #399 <Double 2001.7061037000001D>
	// 1105 1781:dastore         
	// 1106 1782:dup             
	// 1107 1783:iconst_3        
	// 1108 1784:ldc2w           #291 <Double 327.13300479999998D>
	// 1109 1787:dastore         
	// 1110 1788:dup             
	// 1111 1789:iconst_4        
	// 1112 1790:ldc2w           #293 <Double -2.4385346000000001D>
	// 1113 1793:dastore         
	// 1114 1794:dup             
	// 1115 1795:iconst_5        
	// 1116 1796:ldc2w           #401 <Double 3.8055683999999999D>
	// 1117 1799:dastore         
	// 1118 1800:dup             
	// 1119 1801:bipush          6
	// 1120 1803:ldc2w           #403 <Double 2.2808315000000001D>
	// 1121 1806:dastore         
	// 1122 1807:dup             
	// 1123 1808:bipush          7
	// 1124 1810:ldc2w           #405 <Double -298.06529649999999D>
	// 1125 1813:dastore         
	// 1126 1814:dup             
	// 1127 1815:bipush          8
	// 1128 1817:ldc2w           #301 <Double -1.5323681D>
	// 1129 1820:dastore         
	// 1130 1821:astore          28
		double ad29[] = {
			-23.211670699999999D, 0.24171519999999999D, 2110.3468520000001D, 3.0597946D, 8.9830009000000004D, -1.2956363D, -33.378709800000003D, 288.48056229999997D, -0.062199999999999998D
		};
	// 1131 1823:bipush          9
	// 1132 1825:newarray        double[]
	// 1133 1827:dup             
	// 1134 1828:iconst_0        
	// 1135 1829:ldc2w           #407 <Double -23.211670699999999D>
	// 1136 1832:dastore         
	// 1137 1833:dup             
	// 1138 1834:iconst_1        
	// 1139 1835:ldc2w           #409 <Double 0.24171519999999999D>
	// 1140 1838:dastore         
	// 1141 1839:dup             
	// 1142 1840:iconst_2        
	// 1143 1841:ldc2w           #411 <Double 2110.3468520000001D>
	// 1144 1844:dastore         
	// 1145 1845:dup             
	// 1146 1846:iconst_3        
	// 1147 1847:ldc2w           #209 <Double 3.0597946D>
	// 1148 1850:dastore         
	// 1149 1851:dup             
	// 1150 1852:iconst_4        
	// 1151 1853:ldc2w           #211 <Double 8.9830009000000004D>
	// 1152 1856:dastore         
	// 1153 1857:dup             
	// 1154 1858:iconst_5        
	// 1155 1859:ldc2w           #413 <Double -1.2956363D>
	// 1156 1862:dastore         
	// 1157 1863:dup             
	// 1158 1864:bipush          6
	// 1159 1866:ldc2w           #415 <Double -33.378709800000003D>
	// 1160 1869:dastore         
	// 1161 1870:dup             
	// 1162 1871:bipush          7
	// 1163 1873:ldc2w           #417 <Double 288.48056229999997D>
	// 1164 1876:dastore         
	// 1165 1877:dup             
	// 1166 1878:bipush          8
	// 1167 1880:ldc2w           #219 <Double -0.062199999999999998D>
	// 1168 1883:dastore         
	// 1169 1884:astore          29
		double ad30[] = {
			-22.911670699999998D, 0.24171519999999999D, 2084.1217065000001D, 11.2644424D, 8.9614528999999994D, -0.99563630000000003D, -33.895235700000001D, 265.15409679999999D, -0.22733419999999999D
		};
	// 1170 1886:bipush          9
	// 1171 1888:newarray        double[]
	// 1172 1890:dup             
	// 1173 1891:iconst_0        
	// 1174 1892:ldc2w           #419 <Double -22.911670699999998D>
	// 1175 1895:dastore         
	// 1176 1896:dup             
	// 1177 1897:iconst_1        
	// 1178 1898:ldc2w           #409 <Double 0.24171519999999999D>
	// 1179 1901:dastore         
	// 1180 1902:dup             
	// 1181 1903:iconst_2        
	// 1182 1904:ldc2w           #421 <Double 2084.1217065000001D>
	// 1183 1907:dastore         
	// 1184 1908:dup             
	// 1185 1909:iconst_3        
	// 1186 1910:ldc2w           #319 <Double 11.2644424D>
	// 1187 1913:dastore         
	// 1188 1914:dup             
	// 1189 1915:iconst_4        
	// 1190 1916:ldc2w           #321 <Double 8.9614528999999994D>
	// 1191 1919:dastore         
	// 1192 1920:dup             
	// 1193 1921:iconst_5        
	// 1194 1922:ldc2w           #423 <Double -0.99563630000000003D>
	// 1195 1925:dastore         
	// 1196 1926:dup             
	// 1197 1927:bipush          6
	// 1198 1929:ldc2w           #425 <Double -33.895235700000001D>
	// 1199 1932:dastore         
	// 1200 1933:dup             
	// 1201 1934:bipush          7
	// 1202 1936:ldc2w           #427 <Double 265.15409679999999D>
	// 1203 1939:dastore         
	// 1204 1940:dup             
	// 1205 1941:bipush          8
	// 1206 1943:ldc2w           #329 <Double -0.22733419999999999D>
	// 1207 1946:dastore         
	// 1208 1947:astore          30
		double ad31[] = {
			-22.0116707D, 0.24171519999999999D, 2005.4462696999999D, 37.305238799999998D, 8.7346948999999992D, -0.095636299999999994D, -22.796042199999999D, 83.418538999999996D, -0.70060560000000005D
		};
	// 1209 1949:bipush          9
	// 1210 1951:newarray        double[]
	// 1211 1953:dup             
	// 1212 1954:iconst_0        
	// 1213 1955:ldc2w           #429 <Double -22.0116707D>
	// 1214 1958:dastore         
	// 1215 1959:dup             
	// 1216 1960:iconst_1        
	// 1217 1961:ldc2w           #409 <Double 0.24171519999999999D>
	// 1218 1964:dastore         
	// 1219 1965:dup             
	// 1220 1966:iconst_2        
	// 1221 1967:ldc2w           #431 <Double 2005.4462696999999D>
	// 1222 1970:dastore         
	// 1223 1971:dup             
	// 1224 1972:iconst_3        
	// 1225 1973:ldc2w           #47  <Double 37.305238799999998D>
	// 1226 1976:dastore         
	// 1227 1977:dup             
	// 1228 1978:iconst_4        
	// 1229 1979:ldc2w           #49  <Double 8.7346948999999992D>
	// 1230 1982:dastore         
	// 1231 1983:dup             
	// 1232 1984:iconst_5        
	// 1233 1985:ldc2w           #433 <Double -0.095636299999999994D>
	// 1234 1988:dastore         
	// 1235 1989:dup             
	// 1236 1990:bipush          6
	// 1237 1992:ldc2w           #435 <Double -22.796042199999999D>
	// 1238 1995:dastore         
	// 1239 1996:dup             
	// 1240 1997:bipush          7
	// 1241 1999:ldc2w           #437 <Double 83.418538999999996D>
	// 1242 2002:dastore         
	// 1243 2003:dup             
	// 1244 2004:bipush          8
	// 1245 2006:ldc2w           #57  <Double -0.70060560000000005D>
	// 1246 2009:dastore         
	// 1247 2010:astore          31
		double ad32[] = {
			-21.411670699999998D, 0.24171519999999999D, 1952.9959785000001D, 57.2001287D, 8.4126647000000006D, 0.50436369999999997D, -7.7396053D, -209.74469769999999D, -0.98049019999999998D
		};
	// 1248 2012:bipush          9
	// 1249 2014:newarray        double[]
	// 1250 2016:dup             
	// 1251 2017:iconst_0        
	// 1252 2018:ldc2w           #439 <Double -21.411670699999998D>
	// 1253 2021:dastore         
	// 1254 2022:dup             
	// 1255 2023:iconst_1        
	// 1256 2024:ldc2w           #409 <Double 0.24171519999999999D>
	// 1257 2027:dastore         
	// 1258 2028:dup             
	// 1259 2029:iconst_2        
	// 1260 2030:ldc2w           #441 <Double 1952.9959785000001D>
	// 1261 2033:dastore         
	// 1262 2034:dup             
	// 1263 2035:iconst_3        
	// 1264 2036:ldc2w           #63  <Double 57.2001287D>
	// 1265 2039:dastore         
	// 1266 2040:dup             
	// 1267 2041:iconst_4        
	// 1268 2042:ldc2w           #65  <Double 8.4126647000000006D>
	// 1269 2045:dastore         
	// 1270 2046:dup             
	// 1271 2047:iconst_5        
	// 1272 2048:ldc2w           #443 <Double 0.50436369999999997D>
	// 1273 2051:dastore         
	// 1274 2052:dup             
	// 1275 2053:bipush          6
	// 1276 2055:ldc2w           #445 <Double -7.7396053D>
	// 1277 2058:dastore         
	// 1278 2059:dup             
	// 1279 2060:bipush          7
	// 1280 2062:ldc2w           #447 <Double -209.74469769999999D>
	// 1281 2065:dastore         
	// 1282 2066:dup             
	// 1283 2067:bipush          8
	// 1284 2069:ldc2w           #73  <Double -0.98049019999999998D>
	// 1285 2072:dastore         
	// 1286 2073:astore          32
		double ad33[] = {
			-20.5116707D, 0.24171519999999999D, 1874.3205416999999D, 94.497482399999996D, 7.5234689000000001D, 1.4043637D, 14.6572718D, -807.17000570000005D, -1.3163339000000001D
		};
	// 1287 2075:bipush          9
	// 1288 2077:newarray        double[]
	// 1289 2079:dup             
	// 1290 2080:iconst_0        
	// 1291 2081:ldc2w           #449 <Double -20.5116707D>
	// 1292 2084:dastore         
	// 1293 2085:dup             
	// 1294 2086:iconst_1        
	// 1295 2087:ldc2w           #409 <Double 0.24171519999999999D>
	// 1296 2090:dastore         
	// 1297 2091:dup             
	// 1298 2092:iconst_2        
	// 1299 2093:ldc2w           #451 <Double 1874.3205416999999D>
	// 1300 2096:dastore         
	// 1301 2097:dup             
	// 1302 2098:iconst_3        
	// 1303 2099:ldc2w           #95  <Double 94.497482399999996D>
	// 1304 2102:dastore         
	// 1305 2103:dup             
	// 1306 2104:iconst_4        
	// 1307 2105:ldc2w           #97  <Double 7.5234689000000001D>
	// 1308 2108:dastore         
	// 1309 2109:dup             
	// 1310 2110:iconst_5        
	// 1311 2111:ldc2w           #453 <Double 1.4043637D>
	// 1312 2114:dastore         
	// 1313 2115:dup             
	// 1314 2116:bipush          6
	// 1315 2118:ldc2w           #455 <Double 14.6572718D>
	// 1316 2121:dastore         
	// 1317 2122:dup             
	// 1318 2123:bipush          7
	// 1319 2125:ldc2w           #457 <Double -807.17000570000005D>
	// 1320 2128:dastore         
	// 1321 2129:dup             
	// 1322 2130:bipush          8
	// 1323 2132:ldc2w           #105 <Double -1.3163339000000001D>
	// 1324 2135:dastore         
	// 1325 2136:astore          33
		double ad34[] = {
			-19.611670700000001D, 0.24171519999999999D, 1795.6451049D, 148.1152635D, 5.7586041999999997D, 2.3043637000000001D, 23.2388239D, -1147.2843596D, -1.5229775000000001D
		};
	// 1326 2138:bipush          9
	// 1327 2140:newarray        double[]
	// 1328 2142:dup             
	// 1329 2143:iconst_0        
	// 1330 2144:ldc2w           #459 <Double -19.611670700000001D>
	// 1331 2147:dastore         
	// 1332 2148:dup             
	// 1333 2149:iconst_1        
	// 1334 2150:ldc2w           #409 <Double 0.24171519999999999D>
	// 1335 2153:dastore         
	// 1336 2154:dup             
	// 1337 2155:iconst_2        
	// 1338 2156:ldc2w           #461 <Double 1795.6451049D>
	// 1339 2159:dastore         
	// 1340 2160:dup             
	// 1341 2161:iconst_3        
	// 1342 2162:ldc2w           #463 <Double 148.1152635D>
	// 1343 2165:dastore         
	// 1344 2166:dup             
	// 1345 2167:iconst_4        
	// 1346 2168:ldc2w           #465 <Double 5.7586041999999997D>
	// 1347 2171:dastore         
	// 1348 2172:dup             
	// 1349 2173:iconst_5        
	// 1350 2174:ldc2w           #467 <Double 2.3043637000000001D>
	// 1351 2177:dastore         
	// 1352 2178:dup             
	// 1353 2179:bipush          6
	// 1354 2181:ldc2w           #469 <Double 23.2388239D>
	// 1355 2184:dastore         
	// 1356 2185:dup             
	// 1357 2186:bipush          7
	// 1358 2188:ldc2w           #471 <Double -1147.2843596D>
	// 1359 2191:dastore         
	// 1360 2192:dup             
	// 1361 2193:bipush          8
	// 1362 2195:ldc2w           #473 <Double -1.5229775000000001D>
	// 1363 2198:dastore         
	// 1364 2199:astore          34
		double ad35[] = {
			-19.0116707D, 0.24171519999999999D, 1743.1948138D, 200.29154579999999D, 3.6574485999999999D, 2.9043637000000002D, 18.5957127D, -1006.6581744D, -1.5784544D
		};
	// 1365 2201:bipush          9
	// 1366 2203:newarray        double[]
	// 1367 2205:dup             
	// 1368 2206:iconst_0        
	// 1369 2207:ldc2w           #475 <Double -19.0116707D>
	// 1370 2210:dastore         
	// 1371 2211:dup             
	// 1372 2212:iconst_1        
	// 1373 2213:ldc2w           #409 <Double 0.24171519999999999D>
	// 1374 2216:dastore         
	// 1375 2217:dup             
	// 1376 2218:iconst_2        
	// 1377 2219:ldc2w           #477 <Double 1743.1948138D>
	// 1378 2222:dastore         
	// 1379 2223:dup             
	// 1380 2224:iconst_3        
	// 1381 2225:ldc2w           #265 <Double 200.29154579999999D>
	// 1382 2228:dastore         
	// 1383 2229:dup             
	// 1384 2230:iconst_4        
	// 1385 2231:ldc2w           #267 <Double 3.6574485999999999D>
	// 1386 2234:dastore         
	// 1387 2235:dup             
	// 1388 2236:iconst_5        
	// 1389 2237:ldc2w           #479 <Double 2.9043637000000002D>
	// 1390 2240:dastore         
	// 1391 2241:dup             
	// 1392 2242:bipush          6
	// 1393 2244:ldc2w           #481 <Double 18.5957127D>
	// 1394 2247:dastore         
	// 1395 2248:dup             
	// 1396 2249:bipush          7
	// 1397 2251:ldc2w           #483 <Double -1006.6581744D>
	// 1398 2254:dastore         
	// 1399 2255:dup             
	// 1400 2256:bipush          8
	// 1401 2258:ldc2w           #275 <Double -1.5784544D>
	// 1402 2261:dastore         
	// 1403 2262:astore          35
		double ad36[] = {
			-18.711670699999999D, 0.24171519999999999D, 1716.9696681999999D, 234.27778710000001D, 2.1401053000000001D, 3.2043637D, 13.898112599999999D, -821.34908399999995D, -1.5803442000000001D
		};
	// 1404 2264:bipush          9
	// 1405 2266:newarray        double[]
	// 1406 2268:dup             
	// 1407 2269:iconst_0        
	// 1408 2270:ldc2w           #485 <Double -18.711670699999999D>
	// 1409 2273:dastore         
	// 1410 2274:dup             
	// 1411 2275:iconst_1        
	// 1412 2276:ldc2w           #409 <Double 0.24171519999999999D>
	// 1413 2279:dastore         
	// 1414 2280:dup             
	// 1415 2281:iconst_2        
	// 1416 2282:ldc2w           #487 <Double 1716.9696681999999D>
	// 1417 2285:dastore         
	// 1418 2286:dup             
	// 1419 2287:iconst_3        
	// 1420 2288:ldc2w           #159 <Double 234.27778710000001D>
	// 1421 2291:dastore         
	// 1422 2292:dup             
	// 1423 2293:iconst_4        
	// 1424 2294:ldc2w           #161 <Double 2.1401053000000001D>
	// 1425 2297:dastore         
	// 1426 2298:dup             
	// 1427 2299:iconst_5        
	// 1428 2300:ldc2w           #489 <Double 3.2043637D>
	// 1429 2303:dastore         
	// 1430 2304:dup             
	// 1431 2305:bipush          6
	// 1432 2307:ldc2w           #491 <Double 13.898112599999999D>
	// 1433 2310:dastore         
	// 1434 2311:dup             
	// 1435 2312:bipush          7
	// 1436 2314:ldc2w           #493 <Double -821.34908399999995D>
	// 1437 2317:dastore         
	// 1438 2318:dup             
	// 1439 2319:bipush          8
	// 1440 2321:ldc2w           #169 <Double -1.5803442000000001D>
	// 1441 2324:dastore         
	// 1442 2325:astore          36
		double ad37[] = {
			-17.811670700000001D, 0.24171519999999999D, 1638.2942313999999D, 392.10647540000002D, -5.9244687000000003D, 4.1043637000000004D, -2.6961580999999999D, -55.503869600000002D, -1.4830451D
		};
	// 1443 2327:bipush          9
	// 1444 2329:newarray        double[]
	// 1445 2331:dup             
	// 1446 2332:iconst_0        
	// 1447 2333:ldc2w           #495 <Double -17.811670700000001D>
	// 1448 2336:dastore         
	// 1449 2337:dup             
	// 1450 2338:iconst_1        
	// 1451 2339:ldc2w           #409 <Double 0.24171519999999999D>
	// 1452 2342:dastore         
	// 1453 2343:dup             
	// 1454 2344:iconst_2        
	// 1455 2345:ldc2w           #497 <Double 1638.2942313999999D>
	// 1456 2348:dastore         
	// 1457 2349:dup             
	// 1458 2350:iconst_3        
	// 1459 2351:ldc2w           #191 <Double 392.10647540000002D>
	// 1460 2354:dastore         
	// 1461 2355:dup             
	// 1462 2356:iconst_4        
	// 1463 2357:ldc2w           #193 <Double -5.9244687000000003D>
	// 1464 2360:dastore         
	// 1465 2361:dup             
	// 1466 2362:iconst_5        
	// 1467 2363:ldc2w           #499 <Double 4.1043637000000004D>
	// 1468 2366:dastore         
	// 1469 2367:dup             
	// 1470 2368:bipush          6
	// 1471 2370:ldc2w           #501 <Double -2.6961580999999999D>
	// 1472 2373:dastore         
	// 1473 2374:dup             
	// 1474 2375:bipush          7
	// 1475 2377:ldc2w           #503 <Double -55.503869600000002D>
	// 1476 2380:dastore         
	// 1477 2381:dup             
	// 1478 2382:bipush          8
	// 1479 2384:ldc2w           #201 <Double -1.4830451D>
	// 1480 2387:dastore         
	// 1481 2388:astore          37
		double ad38[] = {
			-17.757792800000001D, 0.71361470000000005D, 1656.5271465999999D, 3.0597946D, 8.9830009000000004D, -1.2970974D, -33.078747399999997D, 287.92693639999999D, -0.062199999999999998D
		};
	// 1482 2390:bipush          9
	// 1483 2392:newarray        double[]
	// 1484 2394:dup             
	// 1485 2395:iconst_0        
	// 1486 2396:ldc2w           #505 <Double -17.757792800000001D>
	// 1487 2399:dastore         
	// 1488 2400:dup             
	// 1489 2401:iconst_1        
	// 1490 2402:ldc2w           #507 <Double 0.71361470000000005D>
	// 1491 2405:dastore         
	// 1492 2406:dup             
	// 1493 2407:iconst_2        
	// 1494 2408:ldc2w           #509 <Double 1656.5271465999999D>
	// 1495 2411:dastore         
	// 1496 2412:dup             
	// 1497 2413:iconst_3        
	// 1498 2414:ldc2w           #209 <Double 3.0597946D>
	// 1499 2417:dastore         
	// 1500 2418:dup             
	// 1501 2419:iconst_4        
	// 1502 2420:ldc2w           #211 <Double 8.9830009000000004D>
	// 1503 2423:dastore         
	// 1504 2424:dup             
	// 1505 2425:iconst_5        
	// 1506 2426:ldc2w           #511 <Double -1.2970974D>
	// 1507 2429:dastore         
	// 1508 2430:dup             
	// 1509 2431:bipush          6
	// 1510 2433:ldc2w           #513 <Double -33.078747399999997D>
	// 1511 2436:dastore         
	// 1512 2437:dup             
	// 1513 2438:bipush          7
	// 1514 2440:ldc2w           #515 <Double 287.92693639999999D>
	// 1515 2443:dastore         
	// 1516 2444:dup             
	// 1517 2445:bipush          8
	// 1518 2447:ldc2w           #219 <Double -0.062199999999999998D>
	// 1519 2450:dastore         
	// 1520 2451:astore          38
		double ad39[] = {
			-17.4577928D, 0.71361470000000005D, 1628.8863025999999D, 11.2644424D, 8.9614528999999994D, -0.99709740000000002D, -33.595273200000001D, 263.70058340000003D, -0.22733419999999999D
		};
	// 1521 2453:bipush          9
	// 1522 2455:newarray        double[]
	// 1523 2457:dup             
	// 1524 2458:iconst_0        
	// 1525 2459:ldc2w           #517 <Double -17.4577928D>
	// 1526 2462:dastore         
	// 1527 2463:dup             
	// 1528 2464:iconst_1        
	// 1529 2465:ldc2w           #507 <Double 0.71361470000000005D>
	// 1530 2468:dastore         
	// 1531 2469:dup             
	// 1532 2470:iconst_2        
	// 1533 2471:ldc2w           #519 <Double 1628.8863025999999D>
	// 1534 2474:dastore         
	// 1535 2475:dup             
	// 1536 2476:iconst_3        
	// 1537 2477:ldc2w           #319 <Double 11.2644424D>
	// 1538 2480:dastore         
	// 1539 2481:dup             
	// 1540 2482:iconst_4        
	// 1541 2483:ldc2w           #321 <Double 8.9614528999999994D>
	// 1542 2486:dastore         
	// 1543 2487:dup             
	// 1544 2488:iconst_5        
	// 1545 2489:ldc2w           #521 <Double -0.99709740000000002D>
	// 1546 2492:dastore         
	// 1547 2493:dup             
	// 1548 2494:bipush          6
	// 1549 2496:ldc2w           #523 <Double -33.595273200000001D>
	// 1550 2499:dastore         
	// 1551 2500:dup             
	// 1552 2501:bipush          7
	// 1553 2503:ldc2w           #525 <Double 263.70058340000003D>
	// 1554 2506:dastore         
	// 1555 2507:dup             
	// 1556 2508:bipush          8
	// 1557 2510:ldc2w           #329 <Double -0.22733419999999999D>
	// 1558 2513:dastore         
	// 1559 2514:astore          39
		double ad40[] = {
			-16.857792799999999D, 0.71361470000000005D, 1573.6046143999999D, 28.2628214D, 8.8398648000000009D, -0.39709739999999999D, -28.1551449D, 170.5860902D, -0.54830319999999999D
		};
	// 1560 2516:bipush          9
	// 1561 2518:newarray        double[]
	// 1562 2520:dup             
	// 1563 2521:iconst_0        
	// 1564 2522:ldc2w           #527 <Double -16.857792799999999D>
	// 1565 2525:dastore         
	// 1566 2526:dup             
	// 1567 2527:iconst_1        
	// 1568 2528:ldc2w           #507 <Double 0.71361470000000005D>
	// 1569 2531:dastore         
	// 1570 2532:dup             
	// 1571 2533:iconst_2        
	// 1572 2534:ldc2w           #529 <Double 1573.6046143999999D>
	// 1573 2537:dastore         
	// 1574 2538:dup             
	// 1575 2539:iconst_3        
	// 1576 2540:ldc2w           #31  <Double 28.2628214D>
	// 1577 2543:dastore         
	// 1578 2544:dup             
	// 1579 2545:iconst_4        
	// 1580 2546:ldc2w           #33  <Double 8.8398648000000009D>
	// 1581 2549:dastore         
	// 1582 2550:dup             
	// 1583 2551:iconst_5        
	// 1584 2552:ldc2w           #531 <Double -0.39709739999999999D>
	// 1585 2555:dastore         
	// 1586 2556:dup             
	// 1587 2557:bipush          6
	// 1588 2559:ldc2w           #533 <Double -28.1551449D>
	// 1589 2562:dastore         
	// 1590 2563:dup             
	// 1591 2564:bipush          7
	// 1592 2566:ldc2w           #535 <Double 170.5860902D>
	// 1593 2569:dastore         
	// 1594 2570:dup             
	// 1595 2571:bipush          8
	// 1596 2573:ldc2w           #41  <Double -0.54830319999999999D>
	// 1597 2576:dastore         
	// 1598 2577:astore          40
		double ad41[] = {
			-16.257792800000001D, 0.71361470000000005D, 1518.3229262D, 46.896400399999997D, 8.5943556999999995D, 0.20290259999999999D, -15.3984796D, -50.014622699999997D, -0.84519750000000005D
		};
	// 1599 2579:bipush          9
	// 1600 2581:newarray        double[]
	// 1601 2583:dup             
	// 1602 2584:iconst_0        
	// 1603 2585:ldc2w           #537 <Double -16.257792800000001D>
	// 1604 2588:dastore         
	// 1605 2589:dup             
	// 1606 2590:iconst_1        
	// 1607 2591:ldc2w           #507 <Double 0.71361470000000005D>
	// 1608 2594:dastore         
	// 1609 2595:dup             
	// 1610 2596:iconst_2        
	// 1611 2597:ldc2w           #539 <Double 1518.3229262D>
	// 1612 2600:dastore         
	// 1613 2601:dup             
	// 1614 2602:iconst_3        
	// 1615 2603:ldc2w           #541 <Double 46.896400399999997D>
	// 1616 2606:dastore         
	// 1617 2607:dup             
	// 1618 2608:iconst_4        
	// 1619 2609:ldc2w           #543 <Double 8.5943556999999995D>
	// 1620 2612:dastore         
	// 1621 2613:dup             
	// 1622 2614:iconst_5        
	// 1623 2615:ldc2w           #545 <Double 0.20290259999999999D>
	// 1624 2618:dastore         
	// 1625 2619:dup             
	// 1626 2620:bipush          6
	// 1627 2622:ldc2w           #547 <Double -15.3984796D>
	// 1628 2625:dastore         
	// 1629 2626:dup             
	// 1630 2627:bipush          7
	// 1631 2629:ldc2w           #549 <Double -50.014622699999997D>
	// 1632 2632:dastore         
	// 1633 2633:dup             
	// 1634 2634:bipush          8
	// 1635 2636:ldc2w           #551 <Double -0.84519750000000005D>
	// 1636 2639:dastore         
	// 1637 2640:astore          41
		double ad42[] = {
			-15.3577928D, 0.71361470000000005D, 1435.400394D, 80.747736000000003D, 7.8897272999999997D, 1.1029026D, 8.3957911000000003D, -615.92841399999998D, -1.2173562D
		};
	// 1638 2642:bipush          9
	// 1639 2644:newarray        double[]
	// 1640 2646:dup             
	// 1641 2647:iconst_0        
	// 1642 2648:ldc2w           #553 <Double -15.3577928D>
	// 1643 2651:dastore         
	// 1644 2652:dup             
	// 1645 2653:iconst_1        
	// 1646 2654:ldc2w           #507 <Double 0.71361470000000005D>
	// 1647 2657:dastore         
	// 1648 2658:dup             
	// 1649 2659:iconst_2        
	// 1650 2660:ldc2w           #555 <Double 1435.400394D>
	// 1651 2663:dastore         
	// 1652 2664:dup             
	// 1653 2665:iconst_3        
	// 1654 2666:ldc2w           #79  <Double 80.747736000000003D>
	// 1655 2669:dastore         
	// 1656 2670:dup             
	// 1657 2671:iconst_4        
	// 1658 2672:ldc2w           #81  <Double 7.8897272999999997D>
	// 1659 2675:dastore         
	// 1660 2676:dup             
	// 1661 2677:iconst_5        
	// 1662 2678:ldc2w           #557 <Double 1.1029026D>
	// 1663 2681:dastore         
	// 1664 2682:dup             
	// 1665 2683:bipush          6
	// 1666 2685:ldc2w           #559 <Double 8.3957911000000003D>
	// 1667 2688:dastore         
	// 1668 2689:dup             
	// 1669 2690:bipush          7
	// 1670 2692:ldc2w           #561 <Double -615.92841399999998D>
	// 1671 2695:dastore         
	// 1672 2696:dup             
	// 1673 2697:bipush          8
	// 1674 2699:ldc2w           #89  <Double -1.2173562D>
	// 1675 2702:dastore         
	// 1676 2703:astore          42
		double ad43[] = {
			-14.157792799999999D, 0.71361470000000005D, 1324.8370176999999D, 148.1152635D, 5.7586041999999997D, 2.3029025999999999D, 23.538786399999999D, -1158.6366349D, -1.5229775000000001D
		};
	// 1677 2705:bipush          9
	// 1678 2707:newarray        double[]
	// 1679 2709:dup             
	// 1680 2710:iconst_0        
	// 1681 2711:ldc2w           #563 <Double -14.157792799999999D>
	// 1682 2714:dastore         
	// 1683 2715:dup             
	// 1684 2716:iconst_1        
	// 1685 2717:ldc2w           #507 <Double 0.71361470000000005D>
	// 1686 2720:dastore         
	// 1687 2721:dup             
	// 1688 2722:iconst_2        
	// 1689 2723:ldc2w           #565 <Double 1324.8370176999999D>
	// 1690 2726:dastore         
	// 1691 2727:dup             
	// 1692 2728:iconst_3        
	// 1693 2729:ldc2w           #463 <Double 148.1152635D>
	// 1694 2732:dastore         
	// 1695 2733:dup             
	// 1696 2734:iconst_4        
	// 1697 2735:ldc2w           #465 <Double 5.7586041999999997D>
	// 1698 2738:dastore         
	// 1699 2739:dup             
	// 1700 2740:iconst_5        
	// 1701 2741:ldc2w           #567 <Double 2.3029025999999999D>
	// 1702 2744:dastore         
	// 1703 2745:dup             
	// 1704 2746:bipush          6
	// 1705 2748:ldc2w           #569 <Double 23.538786399999999D>
	// 1706 2751:dastore         
	// 1707 2752:dup             
	// 1708 2753:bipush          7
	// 1709 2755:ldc2w           #571 <Double -1158.6366349D>
	// 1710 2758:dastore         
	// 1711 2759:dup             
	// 1712 2760:bipush          8
	// 1713 2762:ldc2w           #473 <Double -1.5229775000000001D>
	// 1714 2765:dastore         
	// 1715 2766:astore          43
		double ad44[] = {
			-13.257792800000001D, 0.71361470000000005D, 1241.9144855D, 234.27778710000001D, 2.1401053000000001D, 3.2029025999999998D, 14.198075100000001D, -835.40102160000004D, -1.5803442000000001D
		};
	// 1716 2768:bipush          9
	// 1717 2770:newarray        double[]
	// 1718 2772:dup             
	// 1719 2773:iconst_0        
	// 1720 2774:ldc2w           #573 <Double -13.257792800000001D>
	// 1721 2777:dastore         
	// 1722 2778:dup             
	// 1723 2779:iconst_1        
	// 1724 2780:ldc2w           #507 <Double 0.71361470000000005D>
	// 1725 2783:dastore         
	// 1726 2784:dup             
	// 1727 2785:iconst_2        
	// 1728 2786:ldc2w           #575 <Double 1241.9144855D>
	// 1729 2789:dastore         
	// 1730 2790:dup             
	// 1731 2791:iconst_3        
	// 1732 2792:ldc2w           #159 <Double 234.27778710000001D>
	// 1733 2795:dastore         
	// 1734 2796:dup             
	// 1735 2797:iconst_4        
	// 1736 2798:ldc2w           #161 <Double 2.1401053000000001D>
	// 1737 2801:dastore         
	// 1738 2802:dup             
	// 1739 2803:iconst_5        
	// 1740 2804:ldc2w           #577 <Double 3.2029025999999998D>
	// 1741 2807:dastore         
	// 1742 2808:dup             
	// 1743 2809:bipush          6
	// 1744 2811:ldc2w           #579 <Double 14.198075100000001D>
	// 1745 2814:dastore         
	// 1746 2815:dup             
	// 1747 2816:bipush          7
	// 1748 2818:ldc2w           #581 <Double -835.40102160000004D>
	// 1749 2821:dastore         
	// 1750 2822:dup             
	// 1751 2823:bipush          8
	// 1752 2825:ldc2w           #169 <Double -1.5803442000000001D>
	// 1753 2828:dastore         
	// 1754 2829:astore          44
		double ad45[] = {
			-9.9909505999999997D, 1.1180895D, 975.39927049999994D, 37.305238799999998D, 8.7346948999999992D, -0.098921099999999998D, -22.196134000000001D, 75.147999499999997D, -0.70060560000000005D
		};
	// 1755 2831:bipush          9
	// 1756 2833:newarray        double[]
	// 1757 2835:dup             
	// 1758 2836:iconst_0        
	// 1759 2837:ldc2w           #583 <Double -9.9909505999999997D>
	// 1760 2840:dastore         
	// 1761 2841:dup             
	// 1762 2842:iconst_1        
	// 1763 2843:ldc2w           #585 <Double 1.1180895D>
	// 1764 2846:dastore         
	// 1765 2847:dup             
	// 1766 2848:iconst_2        
	// 1767 2849:ldc2w           #587 <Double 975.39927049999994D>
	// 1768 2852:dastore         
	// 1769 2853:dup             
	// 1770 2854:iconst_3        
	// 1771 2855:ldc2w           #47  <Double 37.305238799999998D>
	// 1772 2858:dastore         
	// 1773 2859:dup             
	// 1774 2860:iconst_4        
	// 1775 2861:ldc2w           #49  <Double 8.7346948999999992D>
	// 1776 2864:dastore         
	// 1777 2865:dup             
	// 1778 2866:iconst_5        
	// 1779 2867:ldc2w           #589 <Double -0.098921099999999998D>
	// 1780 2870:dastore         
	// 1781 2871:dup             
	// 1782 2872:bipush          6
	// 1783 2874:ldc2w           #591 <Double -22.196134000000001D>
	// 1784 2877:dastore         
	// 1785 2878:dup             
	// 1786 2879:bipush          7
	// 1787 2881:ldc2w           #593 <Double 75.147999499999997D>
	// 1788 2884:dastore         
	// 1789 2885:dup             
	// 1790 2886:bipush          8
	// 1791 2888:ldc2w           #57  <Double -0.70060560000000005D>
	// 1792 2891:dastore         
	// 1793 2892:astore          45
		double ad46[] = {
			-9.6909506000000007D, 1.1180895D, 946.54500199999995D, 46.896400399999997D, 8.5943556999999995D, 0.2010789D, -15.0985339D, -55.031823699999997D, -0.84519750000000005D
		};
	// 1794 2894:bipush          9
	// 1795 2896:newarray        double[]
	// 1796 2898:dup             
	// 1797 2899:iconst_0        
	// 1798 2900:ldc2w           #595 <Double -9.6909506000000007D>
	// 1799 2903:dastore         
	// 1800 2904:dup             
	// 1801 2905:iconst_1        
	// 1802 2906:ldc2w           #585 <Double 1.1180895D>
	// 1803 2909:dastore         
	// 1804 2910:dup             
	// 1805 2911:iconst_2        
	// 1806 2912:ldc2w           #597 <Double 946.54500199999995D>
	// 1807 2915:dastore         
	// 1808 2916:dup             
	// 1809 2917:iconst_3        
	// 1810 2918:ldc2w           #541 <Double 46.896400399999997D>
	// 1811 2921:dastore         
	// 1812 2922:dup             
	// 1813 2923:iconst_4        
	// 1814 2924:ldc2w           #543 <Double 8.5943556999999995D>
	// 1815 2927:dastore         
	// 1816 2928:dup             
	// 1817 2929:iconst_5        
	// 1818 2930:ldc2w           #599 <Double 0.2010789D>
	// 1819 2933:dastore         
	// 1820 2934:dup             
	// 1821 2935:bipush          6
	// 1822 2937:ldc2w           #601 <Double -15.0985339D>
	// 1823 2940:dastore         
	// 1824 2941:dup             
	// 1825 2942:bipush          7
	// 1826 2944:ldc2w           #603 <Double -55.031823699999997D>
	// 1827 2947:dastore         
	// 1828 2948:dup             
	// 1829 2949:bipush          8
	// 1830 2951:ldc2w           #551 <Double -0.84519750000000005D>
	// 1831 2954:dastore         
	// 1832 2955:astore          46
		double ad47[] = {
			-9.3909506D, 1.1180895D, 917.69073349999996D, 57.2001287D, 8.4126647000000006D, 0.50107889999999999D, -7.1396971000000002D, -221.61468640000001D, -0.98049019999999998D
		};
	// 1833 2957:bipush          9
	// 1834 2959:newarray        double[]
	// 1835 2961:dup             
	// 1836 2962:iconst_0        
	// 1837 2963:ldc2w           #605 <Double -9.3909506D>
	// 1838 2966:dastore         
	// 1839 2967:dup             
	// 1840 2968:iconst_1        
	// 1841 2969:ldc2w           #585 <Double 1.1180895D>
	// 1842 2972:dastore         
	// 1843 2973:dup             
	// 1844 2974:iconst_2        
	// 1845 2975:ldc2w           #607 <Double 917.69073349999996D>
	// 1846 2978:dastore         
	// 1847 2979:dup             
	// 1848 2980:iconst_3        
	// 1849 2981:ldc2w           #63  <Double 57.2001287D>
	// 1850 2984:dastore         
	// 1851 2985:dup             
	// 1852 2986:iconst_4        
	// 1853 2987:ldc2w           #65  <Double 8.4126647000000006D>
	// 1854 2990:dastore         
	// 1855 2991:dup             
	// 1856 2992:iconst_5        
	// 1857 2993:ldc2w           #609 <Double 0.50107889999999999D>
	// 1858 2996:dastore         
	// 1859 2997:dup             
	// 1860 2998:bipush          6
	// 1861 3000:ldc2w           #611 <Double -7.1396971000000002D>
	// 1862 3003:dastore         
	// 1863 3004:dup             
	// 1864 3005:bipush          7
	// 1865 3007:ldc2w           #613 <Double -221.61468640000001D>
	// 1866 3010:dastore         
	// 1867 3011:dup             
	// 1868 3012:bipush          8
	// 1869 3014:ldc2w           #73  <Double -0.98049019999999998D>
	// 1870 3017:dastore         
	// 1871 3018:astore          47
		double ad48[] = {
			-8.7909506000000004D, 1.1180895D, 859.98219659999995D, 80.747736000000003D, 7.8897272999999997D, 1.1010789000000001D, 8.6957368000000006D, -623.64512620000005D, -1.2173562D
		};
	// 1872 3020:bipush          9
	// 1873 3022:newarray        double[]
	// 1874 3024:dup             
	// 1875 3025:iconst_0        
	// 1876 3026:ldc2w           #615 <Double -8.7909506000000004D>
	// 1877 3029:dastore         
	// 1878 3030:dup             
	// 1879 3031:iconst_1        
	// 1880 3032:ldc2w           #585 <Double 1.1180895D>
	// 1881 3035:dastore         
	// 1882 3036:dup             
	// 1883 3037:iconst_2        
	// 1884 3038:ldc2w           #617 <Double 859.98219659999995D>
	// 1885 3041:dastore         
	// 1886 3042:dup             
	// 1887 3043:iconst_3        
	// 1888 3044:ldc2w           #79  <Double 80.747736000000003D>
	// 1889 3047:dastore         
	// 1890 3048:dup             
	// 1891 3049:iconst_4        
	// 1892 3050:ldc2w           #81  <Double 7.8897272999999997D>
	// 1893 3053:dastore         
	// 1894 3054:dup             
	// 1895 3055:iconst_5        
	// 1896 3056:ldc2w           #619 <Double 1.1010789000000001D>
	// 1897 3059:dastore         
	// 1898 3060:dup             
	// 1899 3061:bipush          6
	// 1900 3063:ldc2w           #621 <Double 8.6957368000000006D>
	// 1901 3066:dastore         
	// 1902 3067:dup             
	// 1903 3068:bipush          7
	// 1904 3070:ldc2w           #623 <Double -623.64512620000005D>
	// 1905 3073:dastore         
	// 1906 3074:dup             
	// 1907 3075:bipush          8
	// 1908 3077:ldc2w           #89  <Double -1.2173562D>
	// 1909 3080:dastore         
	// 1910 3081:astore          48
		double ad49[] = {
			-8.4909505999999997D, 1.1180895D, 831.12792809999996D, 94.497482399999996D, 7.5234689000000001D, 1.4010788999999999D, 15.25718D, -824.439168D, -1.3163339000000001D
		};
	// 1911 3083:bipush          9
	// 1912 3085:newarray        double[]
	// 1913 3087:dup             
	// 1914 3088:iconst_0        
	// 1915 3089:ldc2w           #625 <Double -8.4909505999999997D>
	// 1916 3092:dastore         
	// 1917 3093:dup             
	// 1918 3094:iconst_1        
	// 1919 3095:ldc2w           #585 <Double 1.1180895D>
	// 1920 3098:dastore         
	// 1921 3099:dup             
	// 1922 3100:iconst_2        
	// 1923 3101:ldc2w           #627 <Double 831.12792809999996D>
	// 1924 3104:dastore         
	// 1925 3105:dup             
	// 1926 3106:iconst_3        
	// 1927 3107:ldc2w           #95  <Double 94.497482399999996D>
	// 1928 3110:dastore         
	// 1929 3111:dup             
	// 1930 3112:iconst_4        
	// 1931 3113:ldc2w           #97  <Double 7.5234689000000001D>
	// 1932 3116:dastore         
	// 1933 3117:dup             
	// 1934 3118:iconst_5        
	// 1935 3119:ldc2w           #629 <Double 1.4010788999999999D>
	// 1936 3122:dastore         
	// 1937 3123:dup             
	// 1938 3124:bipush          6
	// 1939 3126:ldc2w           #631 <Double 15.25718D>
	// 1940 3129:dastore         
	// 1941 3130:dup             
	// 1942 3131:bipush          7
	// 1943 3133:ldc2w           #633 <Double -824.439168D>
	// 1944 3136:dastore         
	// 1945 3137:dup             
	// 1946 3138:bipush          8
	// 1947 3140:ldc2w           #105 <Double -1.3163339000000001D>
	// 1948 3143:dastore         
	// 1949 3144:astore          49
		double ad50[] = {
			-7.5909506000000002D, 1.1180895D, 744.56512269999996D, 148.1152635D, 5.7586041999999997D, 2.3010788999999998D, 23.838732100000001D, -1169.9526956D, -1.5229775000000001D
		};
	// 1950 3146:bipush          9
	// 1951 3148:newarray        double[]
	// 1952 3150:dup             
	// 1953 3151:iconst_0        
	// 1954 3152:ldc2w           #635 <Double -7.5909506000000002D>
	// 1955 3155:dastore         
	// 1956 3156:dup             
	// 1957 3157:iconst_1        
	// 1958 3158:ldc2w           #585 <Double 1.1180895D>
	// 1959 3161:dastore         
	// 1960 3162:dup             
	// 1961 3163:iconst_2        
	// 1962 3164:ldc2w           #637 <Double 744.56512269999996D>
	// 1963 3167:dastore         
	// 1964 3168:dup             
	// 1965 3169:iconst_3        
	// 1966 3170:ldc2w           #463 <Double 148.1152635D>
	// 1967 3173:dastore         
	// 1968 3174:dup             
	// 1969 3175:iconst_4        
	// 1970 3176:ldc2w           #465 <Double 5.7586041999999997D>
	// 1971 3179:dastore         
	// 1972 3180:dup             
	// 1973 3181:iconst_5        
	// 1974 3182:ldc2w           #639 <Double 2.3010788999999998D>
	// 1975 3185:dastore         
	// 1976 3186:dup             
	// 1977 3187:bipush          6
	// 1978 3189:ldc2w           #641 <Double 23.838732100000001D>
	// 1979 3192:dastore         
	// 1980 3193:dup             
	// 1981 3194:bipush          7
	// 1982 3196:ldc2w           #643 <Double -1169.9526956D>
	// 1983 3199:dastore         
	// 1984 3200:dup             
	// 1985 3201:bipush          8
	// 1986 3203:ldc2w           #473 <Double -1.5229775000000001D>
	// 1987 3206:dastore         
	// 1988 3207:astore          50
		double ad51[] = {
			-6.9909505999999997D, 1.1180895D, 686.85658569999998D, 200.29154579999999D, 3.6574485999999999D, 2.9010788999999999D, 19.195620900000002D, -1032.9259595000001D, -1.5784544D
		};
	// 1989 3209:bipush          9
	// 1990 3211:newarray        double[]
	// 1991 3213:dup             
	// 1992 3214:iconst_0        
	// 1993 3215:ldc2w           #645 <Double -6.9909505999999997D>
	// 1994 3218:dastore         
	// 1995 3219:dup             
	// 1996 3220:iconst_1        
	// 1997 3221:ldc2w           #585 <Double 1.1180895D>
	// 1998 3224:dastore         
	// 1999 3225:dup             
	// 2000 3226:iconst_2        
	// 2001 3227:ldc2w           #647 <Double 686.85658569999998D>
	// 2002 3230:dastore         
	// 2003 3231:dup             
	// 2004 3232:iconst_3        
	// 2005 3233:ldc2w           #265 <Double 200.29154579999999D>
	// 2006 3236:dastore         
	// 2007 3237:dup             
	// 2008 3238:iconst_4        
	// 2009 3239:ldc2w           #267 <Double 3.6574485999999999D>
	// 2010 3242:dastore         
	// 2011 3243:dup             
	// 2012 3244:iconst_5        
	// 2013 3245:ldc2w           #649 <Double 2.9010788999999999D>
	// 2014 3248:dastore         
	// 2015 3249:dup             
	// 2016 3250:bipush          6
	// 2017 3252:ldc2w           #651 <Double 19.195620900000002D>
	// 2018 3255:dastore         
	// 2019 3256:dup             
	// 2020 3257:bipush          7
	// 2021 3259:ldc2w           #653 <Double -1032.9259595000001D>
	// 2022 3262:dastore         
	// 2023 3263:dup             
	// 2024 3264:bipush          8
	// 2025 3266:ldc2w           #275 <Double -1.5784544D>
	// 2026 3269:dastore         
	// 2027 3270:astore          51
		double ad52[] = {
			-6.3909506D, 1.1180895D, 629.1480487D, 275.7268449D, 0.1651599D, 3.5010789D, 8.9391839999999991D, -610.86708759999999D, -1.5649227999999999D
		};
	// 2028 3272:bipush          9
	// 2029 3274:newarray        double[]
	// 2030 3276:dup             
	// 2031 3277:iconst_0        
	// 2032 3278:ldc2w           #655 <Double -6.3909506D>
	// 2033 3281:dastore         
	// 2034 3282:dup             
	// 2035 3283:iconst_1        
	// 2036 3284:ldc2w           #585 <Double 1.1180895D>
	// 2037 3287:dastore         
	// 2038 3288:dup             
	// 2039 3289:iconst_2        
	// 2040 3290:ldc2w           #657 <Double 629.1480487D>
	// 2041 3293:dastore         
	// 2042 3294:dup             
	// 2043 3295:iconst_3        
	// 2044 3296:ldc2w           #175 <Double 275.7268449D>
	// 2045 3299:dastore         
	// 2046 3300:dup             
	// 2047 3301:iconst_4        
	// 2048 3302:ldc2w           #177 <Double 0.1651599D>
	// 2049 3305:dastore         
	// 2050 3306:dup             
	// 2051 3307:iconst_5        
	// 2052 3308:ldc2w           #659 <Double 3.5010789D>
	// 2053 3311:dastore         
	// 2054 3312:dup             
	// 2055 3313:bipush          6
	// 2056 3315:ldc2w           #661 <Double 8.9391839999999991D>
	// 2057 3318:dastore         
	// 2058 3319:dup             
	// 2059 3320:bipush          7
	// 2060 3322:ldc2w           #663 <Double -610.86708759999999D>
	// 2061 3325:dastore         
	// 2062 3326:dup             
	// 2063 3327:bipush          8
	// 2064 3329:ldc2w           #185 <Double -1.5649227999999999D>
	// 2065 3332:dastore         
	// 2066 3333:astore          52
		double ad53[] = {
			-6.0909506000000002D, 1.1180895D, 600.29378029999998D, 327.13300479999998D, -2.4385346000000001D, 3.8010788999999998D, 3.1807124999999998D, -345.6094129D, -1.5323681D
		};
	// 2067 3335:bipush          9
	// 2068 3337:newarray        double[]
	// 2069 3339:dup             
	// 2070 3340:iconst_0        
	// 2071 3341:ldc2w           #665 <Double -6.0909506000000002D>
	// 2072 3344:dastore         
	// 2073 3345:dup             
	// 2074 3346:iconst_1        
	// 2075 3347:ldc2w           #585 <Double 1.1180895D>
	// 2076 3350:dastore         
	// 2077 3351:dup             
	// 2078 3352:iconst_2        
	// 2079 3353:ldc2w           #667 <Double 600.29378029999998D>
	// 2080 3356:dastore         
	// 2081 3357:dup             
	// 2082 3358:iconst_3        
	// 2083 3359:ldc2w           #291 <Double 327.13300479999998D>
	// 2084 3362:dastore         
	// 2085 3363:dup             
	// 2086 3364:iconst_4        
	// 2087 3365:ldc2w           #293 <Double -2.4385346000000001D>
	// 2088 3368:dastore         
	// 2089 3369:dup             
	// 2090 3370:iconst_5        
	// 2091 3371:ldc2w           #669 <Double 3.8010788999999998D>
	// 2092 3374:dastore         
	// 2093 3375:dup             
	// 2094 3376:bipush          6
	// 2095 3378:ldc2w           #671 <Double 3.1807124999999998D>
	// 2096 3381:dastore         
	// 2097 3382:dup             
	// 2098 3383:bipush          7
	// 2099 3385:ldc2w           #673 <Double -345.6094129D>
	// 2100 3388:dastore         
	// 2101 3389:dup             
	// 2102 3390:bipush          8
	// 2103 3392:ldc2w           #301 <Double -1.5323681D>
	// 2104 3395:dastore         
	// 2105 3396:astore          53
		double ad54[] = {
			-3.7953996999999999D, 1.4449038000000001D, 428.72884740000001D, 11.2644424D, 8.9614528999999994D, -1.0012877D, -32.995411400000002D, 260.91884479999999D, -0.22733419999999999D
		};
	// 2106 3398:bipush          9
	// 2107 3400:newarray        double[]
	// 2108 3402:dup             
	// 2109 3403:iconst_0        
	// 2110 3404:ldc2w           #675 <Double -3.7953996999999999D>
	// 2111 3407:dastore         
	// 2112 3408:dup             
	// 2113 3409:iconst_1        
	// 2114 3410:ldc2w           #677 <Double 1.4449038000000001D>
	// 2115 3413:dastore         
	// 2116 3414:dup             
	// 2117 3415:iconst_2        
	// 2118 3416:ldc2w           #679 <Double 428.72884740000001D>
	// 2119 3419:dastore         
	// 2120 3420:dup             
	// 2121 3421:iconst_3        
	// 2122 3422:ldc2w           #319 <Double 11.2644424D>
	// 2123 3425:dastore         
	// 2124 3426:dup             
	// 2125 3427:iconst_4        
	// 2126 3428:ldc2w           #321 <Double 8.9614528999999994D>
	// 2127 3431:dastore         
	// 2128 3432:dup             
	// 2129 3433:iconst_5        
	// 2130 3434:ldc2w           #681 <Double -1.0012877D>
	// 2131 3437:dastore         
	// 2132 3438:dup             
	// 2133 3439:bipush          6
	// 2134 3441:ldc2w           #683 <Double -32.995411400000002D>
	// 2135 3444:dastore         
	// 2136 3445:dup             
	// 2137 3446:bipush          7
	// 2138 3448:ldc2w           #685 <Double 260.91884479999999D>
	// 2139 3451:dastore         
	// 2140 3452:dup             
	// 2141 3453:bipush          8
	// 2142 3455:ldc2w           #329 <Double -0.22733419999999999D>
	// 2143 3458:dastore         
	// 2144 3459:astore          54
		double ad55[] = {
			-3.4953997000000001D, 1.4449038000000001D, 398.89413589999998D, 19.625597299999999D, 8.9143979000000009D, -0.70128769999999996D, -31.3393291D, 224.21468569999999D, -0.38996530000000001D
		};
	// 2145 3461:bipush          9
	// 2146 3463:newarray        double[]
	// 2147 3465:dup             
	// 2148 3466:iconst_0        
	// 2149 3467:ldc2w           #687 <Double -3.4953997000000001D>
	// 2150 3470:dastore         
	// 2151 3471:dup             
	// 2152 3472:iconst_1        
	// 2153 3473:ldc2w           #677 <Double 1.4449038000000001D>
	// 2154 3476:dastore         
	// 2155 3477:dup             
	// 2156 3478:iconst_2        
	// 2157 3479:ldc2w           #689 <Double 398.89413589999998D>
	// 2158 3482:dastore         
	// 2159 3483:dup             
	// 2160 3484:iconst_3        
	// 2161 3485:ldc2w           #15  <Double 19.625597299999999D>
	// 2162 3488:dastore         
	// 2163 3489:dup             
	// 2164 3490:iconst_4        
	// 2165 3491:ldc2w           #17  <Double 8.9143979000000009D>
	// 2166 3494:dastore         
	// 2167 3495:dup             
	// 2168 3496:iconst_5        
	// 2169 3497:ldc2w           #691 <Double -0.70128769999999996D>
	// 2170 3500:dastore         
	// 2171 3501:dup             
	// 2172 3502:bipush          6
	// 2173 3504:ldc2w           #693 <Double -31.3393291D>
	// 2174 3507:dastore         
	// 2175 3508:dup             
	// 2176 3509:bipush          7
	// 2177 3511:ldc2w           #695 <Double 224.21468569999999D>
	// 2178 3514:dastore         
	// 2179 3515:dup             
	// 2180 3516:bipush          8
	// 2181 3518:ldc2w           #25  <Double -0.38996530000000001D>
	// 2182 3521:dastore         
	// 2183 3522:astore          55
		double ad56[] = {
			-1.9953997000000001D, 1.4449038000000001D, 249.72057860000001D, 68.407805800000006D, 8.1813959000000001D, 0.79871230000000004D, 1.3186905D, -422.87905460000002D, -1.1049982D
		};
	// 2184 3524:bipush          9
	// 2185 3526:newarray        double[]
	// 2186 3528:dup             
	// 2187 3529:iconst_0        
	// 2188 3530:ldc2w           #697 <Double -1.9953997000000001D>
	// 2189 3533:dastore         
	// 2190 3534:dup             
	// 2191 3535:iconst_1        
	// 2192 3536:ldc2w           #677 <Double 1.4449038000000001D>
	// 2193 3539:dastore         
	// 2194 3540:dup             
	// 2195 3541:iconst_2        
	// 2196 3542:ldc2w           #699 <Double 249.72057860000001D>
	// 2197 3545:dastore         
	// 2198 3546:dup             
	// 2199 3547:iconst_3        
	// 2200 3548:ldc2w           #345 <Double 68.407805800000006D>
	// 2201 3551:dastore         
	// 2202 3552:dup             
	// 2203 3553:iconst_4        
	// 2204 3554:ldc2w           #347 <Double 8.1813959000000001D>
	// 2205 3557:dastore         
	// 2206 3558:dup             
	// 2207 3559:iconst_5        
	// 2208 3560:ldc2w           #701 <Double 0.79871230000000004D>
	// 2209 3563:dastore         
	// 2210 3564:dup             
	// 2211 3565:bipush          6
	// 2212 3567:ldc2w           #703 <Double 1.3186905D>
	// 2213 3570:dastore         
	// 2214 3571:dup             
	// 2215 3572:bipush          7
	// 2216 3574:ldc2w           #705 <Double -422.87905460000002D>
	// 2217 3577:dastore         
	// 2218 3578:dup             
	// 2219 3579:bipush          8
	// 2220 3581:ldc2w           #355 <Double -1.1049982D>
	// 2221 3584:dastore         
	// 2222 3585:astore          56
		double ad57[] = {
			-1.6953997000000001D, 1.4449038000000001D, 219.88586710000001D, 80.747736000000003D, 7.8897272999999997D, 1.0987123000000001D, 8.9956528999999996D, -631.30725080000002D, -1.2173562D
		};
	// 2223 3587:bipush          9
	// 2224 3589:newarray        double[]
	// 2225 3591:dup             
	// 2226 3592:iconst_0        
	// 2227 3593:ldc2w           #707 <Double -1.6953997000000001D>
	// 2228 3596:dastore         
	// 2229 3597:dup             
	// 2230 3598:iconst_1        
	// 2231 3599:ldc2w           #677 <Double 1.4449038000000001D>
	// 2232 3602:dastore         
	// 2233 3603:dup             
	// 2234 3604:iconst_2        
	// 2235 3605:ldc2w           #709 <Double 219.88586710000001D>
	// 2236 3608:dastore         
	// 2237 3609:dup             
	// 2238 3610:iconst_3        
	// 2239 3611:ldc2w           #79  <Double 80.747736000000003D>
	// 2240 3614:dastore         
	// 2241 3615:dup             
	// 2242 3616:iconst_4        
	// 2243 3617:ldc2w           #81  <Double 7.8897272999999997D>
	// 2244 3620:dastore         
	// 2245 3621:dup             
	// 2246 3622:iconst_5        
	// 2247 3623:ldc2w           #711 <Double 1.0987123000000001D>
	// 2248 3626:dastore         
	// 2249 3627:dup             
	// 2250 3628:bipush          6
	// 2251 3630:ldc2w           #713 <Double 8.9956528999999996D>
	// 2252 3633:dastore         
	// 2253 3634:dup             
	// 2254 3635:bipush          7
	// 2255 3637:ldc2w           #715 <Double -631.30725080000002D>
	// 2256 3640:dastore         
	// 2257 3641:dup             
	// 2258 3642:bipush          8
	// 2259 3644:ldc2w           #89  <Double -1.2173562D>
	// 2260 3647:dastore         
	// 2261 3648:astore          57
		double ad58[] = {
			-0.4953997D, 1.4449038000000001D, 100.5470212D, 148.1152635D, 5.7586041999999997D, 2.2987123D, 24.138648199999999D, -1181.2138136000001D, -1.5229775000000001D
		};
	// 2262 3650:bipush          9
	// 2263 3652:newarray        double[]
	// 2264 3654:dup             
	// 2265 3655:iconst_0        
	// 2266 3656:ldc2w           #717 <Double -0.4953997D>
	// 2267 3659:dastore         
	// 2268 3660:dup             
	// 2269 3661:iconst_1        
	// 2270 3662:ldc2w           #677 <Double 1.4449038000000001D>
	// 2271 3665:dastore         
	// 2272 3666:dup             
	// 2273 3667:iconst_2        
	// 2274 3668:ldc2w           #719 <Double 100.5470212D>
	// 2275 3671:dastore         
	// 2276 3672:dup             
	// 2277 3673:iconst_3        
	// 2278 3674:ldc2w           #463 <Double 148.1152635D>
	// 2279 3677:dastore         
	// 2280 3678:dup             
	// 2281 3679:iconst_4        
	// 2282 3680:ldc2w           #465 <Double 5.7586041999999997D>
	// 2283 3683:dastore         
	// 2284 3684:dup             
	// 2285 3685:iconst_5        
	// 2286 3686:ldc2w           #721 <Double 2.2987123D>
	// 2287 3689:dastore         
	// 2288 3690:dup             
	// 2289 3691:bipush          6
	// 2290 3693:ldc2w           #723 <Double 24.138648199999999D>
	// 2291 3696:dastore         
	// 2292 3697:dup             
	// 2293 3698:bipush          7
	// 2294 3700:ldc2w           #725 <Double -1181.2138136000001D>
	// 2295 3703:dastore         
	// 2296 3704:dup             
	// 2297 3705:bipush          8
	// 2298 3707:ldc2w           #473 <Double -1.5229775000000001D>
	// 2299 3710:dastore         
	// 2300 3711:astore          58
		double ad59[] = {
			0.10460029999999999D, 1.4449038000000001D, 40.877598300000002D, 200.29154579999999D, 3.6574485999999999D, 2.8987123000000001D, 19.495536999999999D, -1045.9865741999999D, -1.5784544D
		};
	// 2301 3713:bipush          9
	// 2302 3715:newarray        double[]
	// 2303 3717:dup             
	// 2304 3718:iconst_0        
	// 2305 3719:ldc2w           #727 <Double 0.10460029999999999D>
	// 2306 3722:dastore         
	// 2307 3723:dup             
	// 2308 3724:iconst_1        
	// 2309 3725:ldc2w           #677 <Double 1.4449038000000001D>
	// 2310 3728:dastore         
	// 2311 3729:dup             
	// 2312 3730:iconst_2        
	// 2313 3731:ldc2w           #729 <Double 40.877598300000002D>
	// 2314 3734:dastore         
	// 2315 3735:dup             
	// 2316 3736:iconst_3        
	// 2317 3737:ldc2w           #265 <Double 200.29154579999999D>
	// 2318 3740:dastore         
	// 2319 3741:dup             
	// 2320 3742:iconst_4        
	// 2321 3743:ldc2w           #267 <Double 3.6574485999999999D>
	// 2322 3746:dastore         
	// 2323 3747:dup             
	// 2324 3748:iconst_5        
	// 2325 3749:ldc2w           #731 <Double 2.8987123000000001D>
	// 2326 3752:dastore         
	// 2327 3753:dup             
	// 2328 3754:bipush          6
	// 2329 3756:ldc2w           #733 <Double 19.495536999999999D>
	// 2330 3759:dastore         
	// 2331 3760:dup             
	// 2332 3761:bipush          7
	// 2333 3763:ldc2w           #735 <Double -1045.9865741999999D>
	// 2334 3766:dastore         
	// 2335 3767:dup             
	// 2336 3768:bipush          8
	// 2337 3770:ldc2w           #275 <Double -1.5784544D>
	// 2338 3773:dastore         
	// 2339 3774:astore          59
		double ad60[] = {
			1.3046002999999999D, 1.4449038000000001D, -78.461247599999993D, 392.10647540000002D, -5.9244687000000003D, 4.0987122999999999D, -1.7963338D, -105.6301611D, -1.4830451D
		};
	// 2340 3776:bipush          9
	// 2341 3778:newarray        double[]
	// 2342 3780:dup             
	// 2343 3781:iconst_0        
	// 2344 3782:ldc2w           #737 <Double 1.3046002999999999D>
	// 2345 3785:dastore         
	// 2346 3786:dup             
	// 2347 3787:iconst_1        
	// 2348 3788:ldc2w           #677 <Double 1.4449038000000001D>
	// 2349 3791:dastore         
	// 2350 3792:dup             
	// 2351 3793:iconst_2        
	// 2352 3794:ldc2w           #739 <Double -78.461247599999993D>
	// 2353 3797:dastore         
	// 2354 3798:dup             
	// 2355 3799:iconst_3        
	// 2356 3800:ldc2w           #191 <Double 392.10647540000002D>
	// 2357 3803:dastore         
	// 2358 3804:dup             
	// 2359 3805:iconst_4        
	// 2360 3806:ldc2w           #193 <Double -5.9244687000000003D>
	// 2361 3809:dastore         
	// 2362 3810:dup             
	// 2363 3811:iconst_5        
	// 2364 3812:ldc2w           #741 <Double 4.0987122999999999D>
	// 2365 3815:dastore         
	// 2366 3816:dup             
	// 2367 3817:bipush          6
	// 2368 3819:ldc2w           #743 <Double -1.7963338D>
	// 2369 3822:dastore         
	// 2370 3823:dup             
	// 2371 3824:bipush          7
	// 2372 3826:ldc2w           #745 <Double -105.6301611D>
	// 2373 3829:dastore         
	// 2374 3830:dup             
	// 2375 3831:bipush          8
	// 2376 3833:ldc2w           #201 <Double -1.4830451D>
	// 2377 3836:dastore         
	// 2378 3837:astore          60
		double ad61[] = {
			4.0927451000000001D, 1.6914144D, -307.17060520000001D, 37.305238799999998D, 8.7346948999999992D, -0.1045357D, -21.596360099999998D, 67.110779100000002D, -0.70060560000000005D
		};
	// 2379 3839:bipush          9
	// 2380 3841:newarray        double[]
	// 2381 3843:dup             
	// 2382 3844:iconst_0        
	// 2383 3845:ldc2w           #747 <Double 4.0927451000000001D>
	// 2384 3848:dastore         
	// 2385 3849:dup             
	// 2386 3850:iconst_1        
	// 2387 3851:ldc2w           #749 <Double 1.6914144D>
	// 2388 3854:dastore         
	// 2389 3855:dup             
	// 2390 3856:iconst_2        
	// 2391 3857:ldc2w           #751 <Double -307.17060520000001D>
	// 2392 3860:dastore         
	// 2393 3861:dup             
	// 2394 3862:iconst_3        
	// 2395 3863:ldc2w           #47  <Double 37.305238799999998D>
	// 2396 3866:dastore         
	// 2397 3867:dup             
	// 2398 3868:iconst_4        
	// 2399 3869:ldc2w           #49  <Double 8.7346948999999992D>
	// 2400 3872:dastore         
	// 2401 3873:dup             
	// 2402 3874:iconst_5        
	// 2403 3875:ldc2w           #753 <Double -0.1045357D>
	// 2404 3878:dastore         
	// 2405 3879:dup             
	// 2406 3880:bipush          6
	// 2407 3882:ldc2w           #755 <Double -21.596360099999998D>
	// 2408 3885:dastore         
	// 2409 3886:dup             
	// 2410 3887:bipush          7
	// 2411 3889:ldc2w           #757 <Double 67.110779100000002D>
	// 2412 3892:dastore         
	// 2413 3893:dup             
	// 2414 3894:bipush          8
	// 2415 3896:ldc2w           #57  <Double -0.70060560000000005D>
	// 2416 3899:dastore         
	// 2417 3900:astore          61
		double ad62[] = {
			4.6927450999999998D, 1.6914144D, -368.31909150000001D, 57.2001287D, 8.4126647000000006D, 0.49546430000000002D, -6.5399231999999996D, -233.25054990000001D, -0.98049019999999998D
		};
	// 2418 3902:bipush          9
	// 2419 3904:newarray        double[]
	// 2420 3906:dup             
	// 2421 3907:iconst_0        
	// 2422 3908:ldc2w           #759 <Double 4.6927450999999998D>
	// 2423 3911:dastore         
	// 2424 3912:dup             
	// 2425 3913:iconst_1        
	// 2426 3914:ldc2w           #749 <Double 1.6914144D>
	// 2427 3917:dastore         
	// 2428 3918:dup             
	// 2429 3919:iconst_2        
	// 2430 3920:ldc2w           #761 <Double -368.31909150000001D>
	// 2431 3923:dastore         
	// 2432 3924:dup             
	// 2433 3925:iconst_3        
	// 2434 3926:ldc2w           #63  <Double 57.2001287D>
	// 2435 3929:dastore         
	// 2436 3930:dup             
	// 2437 3931:iconst_4        
	// 2438 3932:ldc2w           #65  <Double 8.4126647000000006D>
	// 2439 3935:dastore         
	// 2440 3936:dup             
	// 2441 3937:iconst_5        
	// 2442 3938:ldc2w           #763 <Double 0.49546430000000002D>
	// 2443 3941:dastore         
	// 2444 3942:dup             
	// 2445 3943:bipush          6
	// 2446 3945:ldc2w           #765 <Double -6.5399231999999996D>
	// 2447 3948:dastore         
	// 2448 3949:dup             
	// 2449 3950:bipush          7
	// 2450 3952:ldc2w           #767 <Double -233.25054990000001D>
	// 2451 3955:dastore         
	// 2452 3956:dup             
	// 2453 3957:bipush          8
	// 2454 3959:ldc2w           #73  <Double -0.98049019999999998D>
	// 2455 3962:dastore         
	// 2456 3963:astore          62
		double ad63[] = {
			5.2927451000000003D, 1.6914144D, -429.46757789999998D, 80.747736000000003D, 7.8897272999999997D, 1.0954642999999999D, 9.2955106000000001D, -638.87963279999997D, -1.2173562D
		};
	// 2457 3965:bipush          9
	// 2458 3967:newarray        double[]
	// 2459 3969:dup             
	// 2460 3970:iconst_0        
	// 2461 3971:ldc2w           #769 <Double 5.2927451000000003D>
	// 2462 3974:dastore         
	// 2463 3975:dup             
	// 2464 3976:iconst_1        
	// 2465 3977:ldc2w           #749 <Double 1.6914144D>
	// 2466 3980:dastore         
	// 2467 3981:dup             
	// 2468 3982:iconst_2        
	// 2469 3983:ldc2w           #771 <Double -429.46757789999998D>
	// 2470 3986:dastore         
	// 2471 3987:dup             
	// 2472 3988:iconst_3        
	// 2473 3989:ldc2w           #79  <Double 80.747736000000003D>
	// 2474 3992:dastore         
	// 2475 3993:dup             
	// 2476 3994:iconst_4        
	// 2477 3995:ldc2w           #81  <Double 7.8897272999999997D>
	// 2478 3998:dastore         
	// 2479 3999:dup             
	// 2480 4000:iconst_5        
	// 2481 4001:ldc2w           #773 <Double 1.0954642999999999D>
	// 2482 4004:dastore         
	// 2483 4005:dup             
	// 2484 4006:bipush          6
	// 2485 4008:ldc2w           #775 <Double 9.2955106000000001D>
	// 2486 4011:dastore         
	// 2487 4012:dup             
	// 2488 4013:bipush          7
	// 2489 4015:ldc2w           #777 <Double -638.87963279999997D>
	// 2490 4018:dastore         
	// 2491 4019:dup             
	// 2492 4020:bipush          8
	// 2493 4022:ldc2w           #89  <Double -1.2173562D>
	// 2494 4025:dastore         
	// 2495 4026:astore          63
		double ad64[] = {
			5.5927451000000001D, 1.6914144D, -460.04182100000003D, 94.497482399999996D, 7.5234689000000001D, 1.3954643D, 15.856953799999999D, -841.47299610000005D, -1.3163339000000001D
		};
	// 2496 4028:bipush          9
	// 2497 4030:newarray        double[]
	// 2498 4032:dup             
	// 2499 4033:iconst_0        
	// 2500 4034:ldc2w           #779 <Double 5.5927451000000001D>
	// 2501 4037:dastore         
	// 2502 4038:dup             
	// 2503 4039:iconst_1        
	// 2504 4040:ldc2w           #749 <Double 1.6914144D>
	// 2505 4043:dastore         
	// 2506 4044:dup             
	// 2507 4045:iconst_2        
	// 2508 4046:ldc2w           #781 <Double -460.04182100000003D>
	// 2509 4049:dastore         
	// 2510 4050:dup             
	// 2511 4051:iconst_3        
	// 2512 4052:ldc2w           #95  <Double 94.497482399999996D>
	// 2513 4055:dastore         
	// 2514 4056:dup             
	// 2515 4057:iconst_4        
	// 2516 4058:ldc2w           #97  <Double 7.5234689000000001D>
	// 2517 4061:dastore         
	// 2518 4062:dup             
	// 2519 4063:iconst_5        
	// 2520 4064:ldc2w           #783 <Double 1.3954643D>
	// 2521 4067:dastore         
	// 2522 4068:dup             
	// 2523 4069:bipush          6
	// 2524 4071:ldc2w           #785 <Double 15.856953799999999D>
	// 2525 4074:dastore         
	// 2526 4075:dup             
	// 2527 4076:bipush          7
	// 2528 4078:ldc2w           #787 <Double -841.47299610000005D>
	// 2529 4081:dastore         
	// 2530 4082:dup             
	// 2531 4083:bipush          8
	// 2532 4085:ldc2w           #105 <Double -1.3163339000000001D>
	// 2533 4088:dastore         
	// 2534 4089:astore          64
		double ad65[] = {
			5.8927451D, 1.6914144D, -490.61606419999998D, 110.00047410000001D, 7.0639795000000003D, 1.6954643D, 20.7780624D, -1015.106218D, -1.4008494D
		};
	// 2535 4091:bipush          9
	// 2536 4093:newarray        double[]
	// 2537 4095:dup             
	// 2538 4096:iconst_0        
	// 2539 4097:ldc2w           #789 <Double 5.8927451D>
	// 2540 4100:dastore         
	// 2541 4101:dup             
	// 2542 4102:iconst_1        
	// 2543 4103:ldc2w           #749 <Double 1.6914144D>
	// 2544 4106:dastore         
	// 2545 4107:dup             
	// 2546 4108:iconst_2        
	// 2547 4109:ldc2w           #791 <Double -490.61606419999998D>
	// 2548 4112:dastore         
	// 2549 4113:dup             
	// 2550 4114:iconst_3        
	// 2551 4115:ldc2w           #111 <Double 110.00047410000001D>
	// 2552 4118:dastore         
	// 2553 4119:dup             
	// 2554 4120:iconst_4        
	// 2555 4121:ldc2w           #113 <Double 7.0639795000000003D>
	// 2556 4124:dastore         
	// 2557 4125:dup             
	// 2558 4126:iconst_5        
	// 2559 4127:ldc2w           #793 <Double 1.6954643D>
	// 2560 4130:dastore         
	// 2561 4131:dup             
	// 2562 4132:bipush          6
	// 2563 4134:ldc2w           #795 <Double 20.7780624D>
	// 2564 4137:dastore         
	// 2565 4138:dup             
	// 2566 4139:bipush          7
	// 2567 4141:ldc2w           #797 <Double -1015.106218D>
	// 2568 4144:dastore         
	// 2569 4145:dup             
	// 2570 4146:bipush          8
	// 2571 4148:ldc2w           #121 <Double -1.4008494D>
	// 2572 4151:dastore         
	// 2573 4152:astore          65
		double ad66[] = {
			6.4927450999999996D, 1.6914144D, -551.76455050000004D, 148.1152635D, 5.7586041999999997D, 2.2954642999999999D, 24.438505899999999D, -1192.3844882000001D, -1.5229775000000001D
		};
	// 2574 4154:bipush          9
	// 2575 4156:newarray        double[]
	// 2576 4158:dup             
	// 2577 4159:iconst_0        
	// 2578 4160:ldc2w           #799 <Double 6.4927450999999996D>
	// 2579 4163:dastore         
	// 2580 4164:dup             
	// 2581 4165:iconst_1        
	// 2582 4166:ldc2w           #749 <Double 1.6914144D>
	// 2583 4169:dastore         
	// 2584 4170:dup             
	// 2585 4171:iconst_2        
	// 2586 4172:ldc2w           #801 <Double -551.76455050000004D>
	// 2587 4175:dastore         
	// 2588 4176:dup             
	// 2589 4177:iconst_3        
	// 2590 4178:ldc2w           #463 <Double 148.1152635D>
	// 2591 4181:dastore         
	// 2592 4182:dup             
	// 2593 4183:iconst_4        
	// 2594 4184:ldc2w           #465 <Double 5.7586041999999997D>
	// 2595 4187:dastore         
	// 2596 4188:dup             
	// 2597 4189:iconst_5        
	// 2598 4190:ldc2w           #803 <Double 2.2954642999999999D>
	// 2599 4193:dastore         
	// 2600 4194:dup             
	// 2601 4195:bipush          6
	// 2602 4197:ldc2w           #805 <Double 24.438505899999999D>
	// 2603 4200:dastore         
	// 2604 4201:dup             
	// 2605 4202:bipush          7
	// 2606 4204:ldc2w           #807 <Double -1192.3844882000001D>
	// 2607 4207:dastore         
	// 2608 4208:dup             
	// 2609 4209:bipush          8
	// 2610 4211:ldc2w           #473 <Double -1.5229775000000001D>
	// 2611 4214:dastore         
	// 2612 4215:astore          66
		double ad67[] = {
			6.7927451000000003D, 1.6914144D, -582.3387937D, 171.99884599999999D, 4.8356763999999997D, 2.5954643000000002D, 23.054459900000001D, -1166.7511340999999D, -1.5592649999999999D
		};
	// 2613 4217:bipush          9
	// 2614 4219:newarray        double[]
	// 2615 4221:dup             
	// 2616 4222:iconst_0        
	// 2617 4223:ldc2w           #809 <Double 6.7927451000000003D>
	// 2618 4226:dastore         
	// 2619 4227:dup             
	// 2620 4228:iconst_1        
	// 2621 4229:ldc2w           #749 <Double 1.6914144D>
	// 2622 4232:dastore         
	// 2623 4233:dup             
	// 2624 4234:iconst_2        
	// 2625 4235:ldc2w           #811 <Double -582.3387937D>
	// 2626 4238:dastore         
	// 2627 4239:dup             
	// 2628 4240:iconst_3        
	// 2629 4241:ldc2w           #143 <Double 171.99884599999999D>
	// 2630 4244:dastore         
	// 2631 4245:dup             
	// 2632 4246:iconst_4        
	// 2633 4247:ldc2w           #145 <Double 4.8356763999999997D>
	// 2634 4250:dastore         
	// 2635 4251:dup             
	// 2636 4252:iconst_5        
	// 2637 4253:ldc2w           #813 <Double 2.5954643000000002D>
	// 2638 4256:dastore         
	// 2639 4257:dup             
	// 2640 4258:bipush          6
	// 2641 4260:ldc2w           #815 <Double 23.054459900000001D>
	// 2642 4263:dastore         
	// 2643 4264:dup             
	// 2644 4265:bipush          7
	// 2645 4267:ldc2w           #817 <Double -1166.7511340999999D>
	// 2646 4270:dastore         
	// 2647 4271:dup             
	// 2648 4272:bipush          8
	// 2649 4274:ldc2w           #153 <Double -1.5592649999999999D>
	// 2650 4277:dastore         
	// 2651 4278:astore          67
		double ad68[] = {
			7.9927450999999996D, 1.6914144D, -704.63576639999997D, 327.13300479999998D, -2.4385346000000001D, 3.7954642999999999D, 3.7804864D, -377.03781320000002D, -1.5323681D
		};
	// 2652 4280:bipush          9
	// 2653 4282:newarray        double[]
	// 2654 4284:dup             
	// 2655 4285:iconst_0        
	// 2656 4286:ldc2w           #819 <Double 7.9927450999999996D>
	// 2657 4289:dastore         
	// 2658 4290:dup             
	// 2659 4291:iconst_1        
	// 2660 4292:ldc2w           #749 <Double 1.6914144D>
	// 2661 4295:dastore         
	// 2662 4296:dup             
	// 2663 4297:iconst_2        
	// 2664 4298:ldc2w           #821 <Double -704.63576639999997D>
	// 2665 4301:dastore         
	// 2666 4302:dup             
	// 2667 4303:iconst_3        
	// 2668 4304:ldc2w           #291 <Double 327.13300479999998D>
	// 2669 4307:dastore         
	// 2670 4308:dup             
	// 2671 4309:iconst_4        
	// 2672 4310:ldc2w           #293 <Double -2.4385346000000001D>
	// 2673 4313:dastore         
	// 2674 4314:dup             
	// 2675 4315:iconst_5        
	// 2676 4316:ldc2w           #823 <Double 3.7954642999999999D>
	// 2677 4319:dastore         
	// 2678 4320:dup             
	// 2679 4321:bipush          6
	// 2680 4323:ldc2w           #825 <Double 3.7804864D>
	// 2681 4326:dastore         
	// 2682 4327:dup             
	// 2683 4328:bipush          7
	// 2684 4330:ldc2w           #827 <Double -377.03781320000002D>
	// 2685 4333:dastore         
	// 2686 4334:dup             
	// 2687 4335:bipush          8
	// 2688 4337:ldc2w           #301 <Double -1.5323681D>
	// 2689 4340:dastore         
	// 2690 4341:astore          68
		double ad69[] = {
			8.2927450999999994D, 1.6914144D, -735.21000960000003D, 392.10647540000002D, -5.9244687000000003D, 4.0954642999999997D, -1.4964761D, -122.1982747D, -1.4830451D
		};
	// 2691 4343:bipush          9
	// 2692 4345:newarray        double[]
	// 2693 4347:dup             
	// 2694 4348:iconst_0        
	// 2695 4349:ldc2w           #829 <Double 8.2927450999999994D>
	// 2696 4352:dastore         
	// 2697 4353:dup             
	// 2698 4354:iconst_1        
	// 2699 4355:ldc2w           #749 <Double 1.6914144D>
	// 2700 4358:dastore         
	// 2701 4359:dup             
	// 2702 4360:iconst_2        
	// 2703 4361:ldc2w           #831 <Double -735.21000960000003D>
	// 2704 4364:dastore         
	// 2705 4365:dup             
	// 2706 4366:iconst_3        
	// 2707 4367:ldc2w           #191 <Double 392.10647540000002D>
	// 2708 4370:dastore         
	// 2709 4371:dup             
	// 2710 4372:iconst_4        
	// 2711 4373:ldc2w           #193 <Double -5.9244687000000003D>
	// 2712 4376:dastore         
	// 2713 4377:dup             
	// 2714 4378:iconst_5        
	// 2715 4379:ldc2w           #833 <Double 4.0954642999999997D>
	// 2716 4382:dastore         
	// 2717 4383:dup             
	// 2718 4384:bipush          6
	// 2719 4386:ldc2w           #835 <Double -1.4964761D>
	// 2720 4389:dastore         
	// 2721 4390:dup             
	// 2722 4391:bipush          7
	// 2723 4393:ldc2w           #837 <Double -122.1982747D>
	// 2724 4396:dastore         
	// 2725 4397:dup             
	// 2726 4398:bipush          8
	// 2727 4400:ldc2w           #201 <Double -1.4830451D>
	// 2728 4403:dastore         
	// 2729 4404:astore          69
		double ad70[] = {
			9.1476407999999996D, 1.8628107D, -779.40997809999999D, 3.0597946D, 8.9830009000000004D, -1.3094009D, -31.879307300000001D, 286.35694819999998D, -0.062199999999999998D
		};
	// 2730 4406:bipush          9
	// 2731 4408:newarray        double[]
	// 2732 4410:dup             
	// 2733 4411:iconst_0        
	// 2734 4412:ldc2w           #839 <Double 9.1476407999999996D>
	// 2735 4415:dastore         
	// 2736 4416:dup             
	// 2737 4417:iconst_1        
	// 2738 4418:ldc2w           #841 <Double 1.8628107D>
	// 2739 4421:dastore         
	// 2740 4422:dup             
	// 2741 4423:iconst_2        
	// 2742 4424:ldc2w           #843 <Double -779.40997809999999D>
	// 2743 4427:dastore         
	// 2744 4428:dup             
	// 2745 4429:iconst_3        
	// 2746 4430:ldc2w           #209 <Double 3.0597946D>
	// 2747 4433:dastore         
	// 2748 4434:dup             
	// 2749 4435:iconst_4        
	// 2750 4436:ldc2w           #211 <Double 8.9830009000000004D>
	// 2751 4439:dastore         
	// 2752 4440:dup             
	// 2753 4441:iconst_5        
	// 2754 4442:ldc2w           #845 <Double -1.3094009D>
	// 2755 4445:dastore         
	// 2756 4446:dup             
	// 2757 4447:bipush          6
	// 2758 4449:ldc2w           #847 <Double -31.879307300000001D>
	// 2759 4452:dastore         
	// 2760 4453:dup             
	// 2761 4454:bipush          7
	// 2762 4456:ldc2w           #849 <Double 286.35694819999998D>
	// 2763 4459:dastore         
	// 2764 4460:dup             
	// 2765 4461:bipush          8
	// 2766 4463:ldc2w           #219 <Double -0.062199999999999998D>
	// 2767 4466:dastore         
	// 2768 4467:astore          70
		double ad71[] = {
			9.4476408000000003D, 1.8628107D, -810.49841040000001D, 11.2644424D, 8.9614528999999994D, -1.0094008999999999D, -32.395833199999998D, 258.53227509999999D, -0.22733419999999999D
		};
	// 2769 4469:bipush          9
	// 2770 4471:newarray        double[]
	// 2771 4473:dup             
	// 2772 4474:iconst_0        
	// 2773 4475:ldc2w           #851 <Double 9.4476408000000003D>
	// 2774 4478:dastore         
	// 2775 4479:dup             
	// 2776 4480:iconst_1        
	// 2777 4481:ldc2w           #841 <Double 1.8628107D>
	// 2778 4484:dastore         
	// 2779 4485:dup             
	// 2780 4486:iconst_2        
	// 2781 4487:ldc2w           #853 <Double -810.49841040000001D>
	// 2782 4490:dastore         
	// 2783 4491:dup             
	// 2784 4492:iconst_3        
	// 2785 4493:ldc2w           #319 <Double 11.2644424D>
	// 2786 4496:dastore         
	// 2787 4497:dup             
	// 2788 4498:iconst_4        
	// 2789 4499:ldc2w           #321 <Double 8.9614528999999994D>
	// 2790 4502:dastore         
	// 2791 4503:dup             
	// 2792 4504:iconst_5        
	// 2793 4505:ldc2w           #855 <Double -1.0094008999999999D>
	// 2794 4508:dastore         
	// 2795 4509:dup             
	// 2796 4510:bipush          6
	// 2797 4512:ldc2w           #857 <Double -32.395833199999998D>
	// 2798 4515:dastore         
	// 2799 4516:dup             
	// 2800 4517:bipush          7
	// 2801 4519:ldc2w           #859 <Double 258.53227509999999D>
	// 2802 4522:dastore         
	// 2803 4523:dup             
	// 2804 4524:bipush          8
	// 2805 4526:ldc2w           #329 <Double -0.22733419999999999D>
	// 2806 4529:dastore         
	// 2807 4530:astore          71
		double ad72[] = {
			10.6476408D, 1.8628107D, -934.85213940000006D, 46.896400399999997D, 8.5943556999999995D, 0.19059909999999999D, -14.1990395D, -69.576211799999996D, -0.84519750000000005D
		};
	// 2808 4532:bipush          9
	// 2809 4534:newarray        double[]
	// 2810 4536:dup             
	// 2811 4537:iconst_0        
	// 2812 4538:ldc2w           #861 <Double 10.6476408D>
	// 2813 4541:dastore         
	// 2814 4542:dup             
	// 2815 4543:iconst_1        
	// 2816 4544:ldc2w           #841 <Double 1.8628107D>
	// 2817 4547:dastore         
	// 2818 4548:dup             
	// 2819 4549:iconst_2        
	// 2820 4550:ldc2w           #863 <Double -934.85213940000006D>
	// 2821 4553:dastore         
	// 2822 4554:dup             
	// 2823 4555:iconst_3        
	// 2824 4556:ldc2w           #541 <Double 46.896400399999997D>
	// 2825 4559:dastore         
	// 2826 4560:dup             
	// 2827 4561:iconst_4        
	// 2828 4562:ldc2w           #543 <Double 8.5943556999999995D>
	// 2829 4565:dastore         
	// 2830 4566:dup             
	// 2831 4567:iconst_5        
	// 2832 4568:ldc2w           #865 <Double 0.19059909999999999D>
	// 2833 4571:dastore         
	// 2834 4572:dup             
	// 2835 4573:bipush          6
	// 2836 4575:ldc2w           #867 <Double -14.1990395D>
	// 2837 4578:dastore         
	// 2838 4579:dup             
	// 2839 4580:bipush          7
	// 2840 4582:ldc2w           #869 <Double -69.576211799999996D>
	// 2841 4585:dastore         
	// 2842 4586:dup             
	// 2843 4587:bipush          8
	// 2844 4589:ldc2w           #551 <Double -0.84519750000000005D>
	// 2845 4592:dastore         
	// 2846 4593:astore          72
		double ad73[] = {
			11.5476408D, 1.8628107D, -1028.1174361000001D, 80.747736000000003D, 7.8897272999999997D, 1.0905990999999999D, 9.5952310999999995D, -646.28496359999997D, -1.2173562D
		};
	// 2847 4595:bipush          9
	// 2848 4597:newarray        double[]
	// 2849 4599:dup             
	// 2850 4600:iconst_0        
	// 2851 4601:ldc2w           #871 <Double 11.5476408D>
	// 2852 4604:dastore         
	// 2853 4605:dup             
	// 2854 4606:iconst_1        
	// 2855 4607:ldc2w           #841 <Double 1.8628107D>
	// 2856 4610:dastore         
	// 2857 4611:dup             
	// 2858 4612:iconst_2        
	// 2859 4613:ldc2w           #873 <Double -1028.1174361000001D>
	// 2860 4616:dastore         
	// 2861 4617:dup             
	// 2862 4618:iconst_3        
	// 2863 4619:ldc2w           #79  <Double 80.747736000000003D>
	// 2864 4622:dastore         
	// 2865 4623:dup             
	// 2866 4624:iconst_4        
	// 2867 4625:ldc2w           #81  <Double 7.8897272999999997D>
	// 2868 4628:dastore         
	// 2869 4629:dup             
	// 2870 4630:iconst_5        
	// 2871 4631:ldc2w           #875 <Double 1.0905990999999999D>
	// 2872 4634:dastore         
	// 2873 4635:dup             
	// 2874 4636:bipush          6
	// 2875 4638:ldc2w           #877 <Double 9.5952310999999995D>
	// 2876 4641:dastore         
	// 2877 4642:dup             
	// 2878 4643:bipush          7
	// 2879 4645:ldc2w           #879 <Double -646.28496359999997D>
	// 2880 4648:dastore         
	// 2881 4649:dup             
	// 2882 4650:bipush          8
	// 2883 4652:ldc2w           #89  <Double -1.2173562D>
	// 2884 4655:dastore         
	// 2885 4656:astore          73
		double ad74[] = {
			12.1476408D, 1.8628107D, -1090.2943006D, 110.00047410000001D, 7.0639795000000003D, 1.6905991D, 21.077782899999999D, -1024.3098719D, -1.4008494D
		};
	// 2886 4658:bipush          9
	// 2887 4660:newarray        double[]
	// 2888 4662:dup             
	// 2889 4663:iconst_0        
	// 2890 4664:ldc2w           #881 <Double 12.1476408D>
	// 2891 4667:dastore         
	// 2892 4668:dup             
	// 2893 4669:iconst_1        
	// 2894 4670:ldc2w           #841 <Double 1.8628107D>
	// 2895 4673:dastore         
	// 2896 4674:dup             
	// 2897 4675:iconst_2        
	// 2898 4676:ldc2w           #883 <Double -1090.2943006D>
	// 2899 4679:dastore         
	// 2900 4680:dup             
	// 2901 4681:iconst_3        
	// 2902 4682:ldc2w           #111 <Double 110.00047410000001D>
	// 2903 4685:dastore         
	// 2904 4686:dup             
	// 2905 4687:iconst_4        
	// 2906 4688:ldc2w           #113 <Double 7.0639795000000003D>
	// 2907 4691:dastore         
	// 2908 4692:dup             
	// 2909 4693:iconst_5        
	// 2910 4694:ldc2w           #885 <Double 1.6905991D>
	// 2911 4697:dastore         
	// 2912 4698:dup             
	// 2913 4699:bipush          6
	// 2914 4701:ldc2w           #887 <Double 21.077782899999999D>
	// 2915 4704:dastore         
	// 2916 4705:dup             
	// 2917 4706:bipush          7
	// 2918 4708:ldc2w           #889 <Double -1024.3098719D>
	// 2919 4711:dastore         
	// 2920 4712:dup             
	// 2921 4713:bipush          8
	// 2922 4715:ldc2w           #121 <Double -1.4008494D>
	// 2923 4718:dastore         
	// 2924 4719:astore          74
		double ad75[] = {
			12.4476408D, 1.8628107D, -1121.3827329000001D, 127.6888198D, 6.4866308999999998D, 1.9905991000000001D, 23.994308799999999D, -1148.1764017999999D, -1.4699811D
		};
	// 2925 4721:bipush          9
	// 2926 4723:newarray        double[]
	// 2927 4725:dup             
	// 2928 4726:iconst_0        
	// 2929 4727:ldc2w           #891 <Double 12.4476408D>
	// 2930 4730:dastore         
	// 2931 4731:dup             
	// 2932 4732:iconst_1        
	// 2933 4733:ldc2w           #841 <Double 1.8628107D>
	// 2934 4736:dastore         
	// 2935 4737:dup             
	// 2936 4738:iconst_2        
	// 2937 4739:ldc2w           #893 <Double -1121.3827329000001D>
	// 2938 4742:dastore         
	// 2939 4743:dup             
	// 2940 4744:iconst_3        
	// 2941 4745:ldc2w           #127 <Double 127.6888198D>
	// 2942 4748:dastore         
	// 2943 4749:dup             
	// 2944 4750:iconst_4        
	// 2945 4751:ldc2w           #129 <Double 6.4866308999999998D>
	// 2946 4754:dastore         
	// 2947 4755:dup             
	// 2948 4756:iconst_5        
	// 2949 4757:ldc2w           #895 <Double 1.9905991000000001D>
	// 2950 4760:dastore         
	// 2951 4761:dup             
	// 2952 4762:bipush          6
	// 2953 4764:ldc2w           #897 <Double 23.994308799999999D>
	// 2954 4767:dastore         
	// 2955 4768:dup             
	// 2956 4769:bipush          7
	// 2957 4771:ldc2w           #899 <Double -1148.1764017999999D>
	// 2958 4774:dastore         
	// 2959 4775:dup             
	// 2960 4776:bipush          8
	// 2961 4778:ldc2w           #137 <Double -1.4699811D>
	// 2962 4781:dastore         
	// 2963 4782:astore          75
		double ad76[] = {
			13.0476408D, 1.8628107D, -1183.5595973D, 171.99884599999999D, 4.8356763999999997D, 2.5905990999999999D, 23.354180499999998D, -1178.6522726999999D, -1.5592649999999999D
		};
	// 2964 4784:bipush          9
	// 2965 4786:newarray        double[]
	// 2966 4788:dup             
	// 2967 4789:iconst_0        
	// 2968 4790:ldc2w           #901 <Double 13.0476408D>
	// 2969 4793:dastore         
	// 2970 4794:dup             
	// 2971 4795:iconst_1        
	// 2972 4796:ldc2w           #841 <Double 1.8628107D>
	// 2973 4799:dastore         
	// 2974 4800:dup             
	// 2975 4801:iconst_2        
	// 2976 4802:ldc2w           #903 <Double -1183.5595973D>
	// 2977 4805:dastore         
	// 2978 4806:dup             
	// 2979 4807:iconst_3        
	// 2980 4808:ldc2w           #143 <Double 171.99884599999999D>
	// 2981 4811:dastore         
	// 2982 4812:dup             
	// 2983 4813:iconst_4        
	// 2984 4814:ldc2w           #145 <Double 4.8356763999999997D>
	// 2985 4817:dastore         
	// 2986 4818:dup             
	// 2987 4819:iconst_5        
	// 2988 4820:ldc2w           #905 <Double 2.5905990999999999D>
	// 2989 4823:dastore         
	// 2990 4824:dup             
	// 2991 4825:bipush          6
	// 2992 4827:ldc2w           #907 <Double 23.354180499999998D>
	// 2993 4830:dastore         
	// 2994 4831:dup             
	// 2995 4832:bipush          7
	// 2996 4834:ldc2w           #909 <Double -1178.6522726999999D>
	// 2997 4837:dastore         
	// 2998 4838:dup             
	// 2999 4839:bipush          8
	// 3000 4841:ldc2w           #153 <Double -1.5592649999999999D>
	// 3001 4844:dastore         
	// 3002 4845:astore          76
		double ad77[] = {
			14.247640799999999D, 1.8628107D, -1307.9133263000001D, 327.13300479999998D, -2.4385346000000001D, 3.7905991000000001D, 4.0802069000000003D, -392.53559799999999D, -1.5323681D
		};
	// 3003 4847:bipush          9
	// 3004 4849:newarray        double[]
	// 3005 4851:dup             
	// 3006 4852:iconst_0        
	// 3007 4853:ldc2w           #911 <Double 14.247640799999999D>
	// 3008 4856:dastore         
	// 3009 4857:dup             
	// 3010 4858:iconst_1        
	// 3011 4859:ldc2w           #841 <Double 1.8628107D>
	// 3012 4862:dastore         
	// 3013 4863:dup             
	// 3014 4864:iconst_2        
	// 3015 4865:ldc2w           #913 <Double -1307.9133263000001D>
	// 3016 4868:dastore         
	// 3017 4869:dup             
	// 3018 4870:iconst_3        
	// 3019 4871:ldc2w           #291 <Double 327.13300479999998D>
	// 3020 4874:dastore         
	// 3021 4875:dup             
	// 3022 4876:iconst_4        
	// 3023 4877:ldc2w           #293 <Double -2.4385346000000001D>
	// 3024 4880:dastore         
	// 3025 4881:dup             
	// 3026 4882:iconst_5        
	// 3027 4883:ldc2w           #915 <Double 3.7905991000000001D>
	// 3028 4886:dastore         
	// 3029 4887:dup             
	// 3030 4888:bipush          6
	// 3031 4890:ldc2w           #917 <Double 4.0802069000000003D>
	// 3032 4893:dastore         
	// 3033 4894:dup             
	// 3034 4895:bipush          7
	// 3035 4897:ldc2w           #919 <Double -392.53559799999999D>
	// 3036 4900:dastore         
	// 3037 4901:dup             
	// 3038 4902:bipush          8
	// 3039 4904:ldc2w           #301 <Double -1.5323681D>
	// 3040 4907:dastore         
	// 3041 4908:astore          77
		double ad78[] = {
			14.5476408D, 1.8628107D, -1339.0017585999999D, 392.10647540000002D, -5.9244687000000003D, 4.0905991000000004D, -1.1967555999999999D, -138.5952211D, -1.4830451D
		};
	// 3042 4910:bipush          9
	// 3043 4912:newarray        double[]
	// 3044 4914:dup             
	// 3045 4915:iconst_0        
	// 3046 4916:ldc2w           #921 <Double 14.5476408D>
	// 3047 4919:dastore         
	// 3048 4920:dup             
	// 3049 4921:iconst_1        
	// 3050 4922:ldc2w           #841 <Double 1.8628107D>
	// 3051 4925:dastore         
	// 3052 4926:dup             
	// 3053 4927:iconst_2        
	// 3054 4928:ldc2w           #923 <Double -1339.0017585999999D>
	// 3055 4931:dastore         
	// 3056 4932:dup             
	// 3057 4933:iconst_3        
	// 3058 4934:ldc2w           #191 <Double 392.10647540000002D>
	// 3059 4937:dastore         
	// 3060 4938:dup             
	// 3061 4939:iconst_4        
	// 3062 4940:ldc2w           #193 <Double -5.9244687000000003D>
	// 3063 4943:dastore         
	// 3064 4944:dup             
	// 3065 4945:iconst_5        
	// 3066 4946:ldc2w           #925 <Double 4.0905991000000004D>
	// 3067 4949:dastore         
	// 3068 4950:dup             
	// 3069 4951:bipush          6
	// 3070 4953:ldc2w           #927 <Double -1.1967555999999999D>
	// 3071 4956:dastore         
	// 3072 4957:dup             
	// 3073 4958:bipush          7
	// 3074 4960:ldc2w           #929 <Double -138.5952211D>
	// 3075 4963:dastore         
	// 3076 4964:dup             
	// 3077 4965:bipush          8
	// 3078 4967:ldc2w           #201 <Double -1.4830451D>
	// 3079 4970:dastore         
	// 3080 4971:astore          78
		double ad79[] = {
			14.4144778D, 1.9715174D, -1297.7233801D, 11.2644424D, 8.9614528999999994D, -1.0179450000000001D, -32.096550700000002D, 257.79871370000001D, -0.22733419999999999D
		};
	// 3081 4973:bipush          9
	// 3082 4975:newarray        double[]
	// 3083 4977:dup             
	// 3084 4978:iconst_0        
	// 3085 4979:ldc2w           #931 <Double 14.4144778D>
	// 3086 4982:dastore         
	// 3087 4983:dup             
	// 3088 4984:iconst_1        
	// 3089 4985:ldc2w           #933 <Double 1.9715174D>
	// 3090 4988:dastore         
	// 3091 4989:dup             
	// 3092 4990:iconst_2        
	// 3093 4991:ldc2w           #935 <Double -1297.7233801D>
	// 3094 4994:dastore         
	// 3095 4995:dup             
	// 3096 4996:iconst_3        
	// 3097 4997:ldc2w           #319 <Double 11.2644424D>
	// 3098 5000:dastore         
	// 3099 5001:dup             
	// 3100 5002:iconst_4        
	// 3101 5003:ldc2w           #321 <Double 8.9614528999999994D>
	// 3102 5006:dastore         
	// 3103 5007:dup             
	// 3104 5008:iconst_5        
	// 3105 5009:ldc2w           #937 <Double -1.0179450000000001D>
	// 3106 5012:dastore         
	// 3107 5013:dup             
	// 3108 5014:bipush          6
	// 3109 5016:ldc2w           #939 <Double -32.096550700000002D>
	// 3110 5019:dastore         
	// 3111 5020:dup             
	// 3112 5021:bipush          7
	// 3113 5023:ldc2w           #941 <Double 257.79871370000001D>
	// 3114 5026:dastore         
	// 3115 5027:dup             
	// 3116 5028:bipush          8
	// 3117 5030:ldc2w           #329 <Double -0.22733419999999999D>
	// 3118 5033:dastore         
	// 3119 5034:astore          79
		double ad80[] = {
			15.9144778D, 1.9715174D, -1454.7961412D, 57.2001287D, 8.4126647000000006D, 0.48205500000000001D, -5.9409203000000002D, -244.08035580000001D, -0.98049019999999998D
		};
	// 3120 5036:bipush          9
	// 3121 5038:newarray        double[]
	// 3122 5040:dup             
	// 3123 5041:iconst_0        
	// 3124 5042:ldc2w           #943 <Double 15.9144778D>
	// 3125 5045:dastore         
	// 3126 5046:dup             
	// 3127 5047:iconst_1        
	// 3128 5048:ldc2w           #933 <Double 1.9715174D>
	// 3129 5051:dastore         
	// 3130 5052:dup             
	// 3131 5053:iconst_2        
	// 3132 5054:ldc2w           #945 <Double -1454.7961412D>
	// 3133 5057:dastore         
	// 3134 5058:dup             
	// 3135 5059:iconst_3        
	// 3136 5060:ldc2w           #63  <Double 57.2001287D>
	// 3137 5063:dastore         
	// 3138 5064:dup             
	// 3139 5065:iconst_4        
	// 3140 5066:ldc2w           #65  <Double 8.4126647000000006D>
	// 3141 5069:dastore         
	// 3142 5070:dup             
	// 3143 5071:iconst_5        
	// 3144 5072:ldc2w           #947 <Double 0.48205500000000001D>
	// 3145 5075:dastore         
	// 3146 5076:dup             
	// 3147 5077:bipush          6
	// 3148 5079:ldc2w           #949 <Double -5.9409203000000002D>
	// 3149 5082:dastore         
	// 3150 5083:dup             
	// 3151 5084:bipush          7
	// 3152 5086:ldc2w           #951 <Double -244.08035580000001D>
	// 3153 5089:dastore         
	// 3154 5090:dup             
	// 3155 5091:bipush          8
	// 3156 5093:ldc2w           #73  <Double -0.98049019999999998D>
	// 3157 5096:dastore         
	// 3158 5097:astore          80
		double ad81[] = {
			17.1144778D, 1.9715174D, -1580.4543501999999D, 110.00047410000001D, 7.0639795000000003D, 1.6820550000000001D, 21.377065300000002D, -1033.1240594999999D, -1.4008494D
		};
	// 3159 5099:bipush          9
	// 3160 5101:newarray        double[]
	// 3161 5103:dup             
	// 3162 5104:iconst_0        
	// 3163 5105:ldc2w           #953 <Double 17.1144778D>
	// 3164 5108:dastore         
	// 3165 5109:dup             
	// 3166 5110:iconst_1        
	// 3167 5111:ldc2w           #933 <Double 1.9715174D>
	// 3168 5114:dastore         
	// 3169 5115:dup             
	// 3170 5116:iconst_2        
	// 3171 5117:ldc2w           #955 <Double -1580.4543501999999D>
	// 3172 5120:dastore         
	// 3173 5121:dup             
	// 3174 5122:iconst_3        
	// 3175 5123:ldc2w           #111 <Double 110.00047410000001D>
	// 3176 5126:dastore         
	// 3177 5127:dup             
	// 3178 5128:iconst_4        
	// 3179 5129:ldc2w           #113 <Double 7.0639795000000003D>
	// 3180 5132:dastore         
	// 3181 5133:dup             
	// 3182 5134:iconst_5        
	// 3183 5135:ldc2w           #957 <Double 1.6820550000000001D>
	// 3184 5138:dastore         
	// 3185 5139:dup             
	// 3186 5140:bipush          6
	// 3187 5142:ldc2w           #959 <Double 21.377065300000002D>
	// 3188 5145:dastore         
	// 3189 5146:dup             
	// 3190 5147:bipush          7
	// 3191 5149:ldc2w           #961 <Double -1033.1240594999999D>
	// 3192 5152:dastore         
	// 3193 5153:dup             
	// 3194 5154:bipush          8
	// 3195 5156:ldc2w           #121 <Double -1.4008494D>
	// 3196 5159:dastore         
	// 3197 5160:astore          81
		double ad82[] = {
			17.4144778D, 1.9715174D, -1611.8689024D, 127.6888198D, 6.4866308999999998D, 1.9820549999999999D, 24.293591200000002D, -1157.8884367000001D, -1.4699811D
		};
	// 3198 5162:bipush          9
	// 3199 5164:newarray        double[]
	// 3200 5166:dup             
	// 3201 5167:iconst_0        
	// 3202 5168:ldc2w           #963 <Double 17.4144778D>
	// 3203 5171:dastore         
	// 3204 5172:dup             
	// 3205 5173:iconst_1        
	// 3206 5174:ldc2w           #933 <Double 1.9715174D>
	// 3207 5177:dastore         
	// 3208 5178:dup             
	// 3209 5179:iconst_2        
	// 3210 5180:ldc2w           #965 <Double -1611.8689024D>
	// 3211 5183:dastore         
	// 3212 5184:dup             
	// 3213 5185:iconst_3        
	// 3214 5186:ldc2w           #127 <Double 127.6888198D>
	// 3215 5189:dastore         
	// 3216 5190:dup             
	// 3217 5191:iconst_4        
	// 3218 5192:ldc2w           #129 <Double 6.4866308999999998D>
	// 3219 5195:dastore         
	// 3220 5196:dup             
	// 3221 5197:iconst_5        
	// 3222 5198:ldc2w           #967 <Double 1.9820549999999999D>
	// 3223 5201:dastore         
	// 3224 5202:dup             
	// 3225 5203:bipush          6
	// 3226 5205:ldc2w           #969 <Double 24.293591200000002D>
	// 3227 5208:dastore         
	// 3228 5209:dup             
	// 3229 5210:bipush          7
	// 3230 5212:ldc2w           #971 <Double -1157.8884367000001D>
	// 3231 5215:dastore         
	// 3232 5216:dup             
	// 3233 5217:bipush          8
	// 3234 5219:ldc2w           #137 <Double -1.4699811D>
	// 3235 5222:dastore         
	// 3236 5223:astore          82
		double ad83[] = {
			17.960124799999999D, 2.0349358D, -1657.3531022D, 19.625597299999999D, 8.9143979000000009D, -0.74068149999999999D, -30.144201200000001D, 218.2518858D, -0.38996530000000001D
		};
	// 3237 5225:bipush          9
	// 3238 5227:newarray        double[]
	// 3239 5229:dup             
	// 3240 5230:iconst_0        
	// 3241 5231:ldc2w           #973 <Double 17.960124799999999D>
	// 3242 5234:dastore         
	// 3243 5235:dup             
	// 3244 5236:iconst_1        
	// 3245 5237:ldc2w           #975 <Double 2.0349358D>
	// 3246 5240:dastore         
	// 3247 5241:dup             
	// 3248 5242:iconst_2        
	// 3249 5243:ldc2w           #977 <Double -1657.3531022D>
	// 3250 5246:dastore         
	// 3251 5247:dup             
	// 3252 5248:iconst_3        
	// 3253 5249:ldc2w           #15  <Double 19.625597299999999D>
	// 3254 5252:dastore         
	// 3255 5253:dup             
	// 3256 5254:iconst_4        
	// 3257 5255:ldc2w           #17  <Double 8.9143979000000009D>
	// 3258 5258:dastore         
	// 3259 5259:dup             
	// 3260 5260:iconst_5        
	// 3261 5261:ldc2w           #979 <Double -0.74068149999999999D>
	// 3262 5264:dastore         
	// 3263 5265:dup             
	// 3264 5266:bipush          6
	// 3265 5268:ldc2w           #981 <Double -30.144201200000001D>
	// 3266 5271:dastore         
	// 3267 5272:dup             
	// 3268 5273:bipush          7
	// 3269 5275:ldc2w           #983 <Double 218.2518858D>
	// 3270 5278:dastore         
	// 3271 5279:dup             
	// 3272 5280:bipush          8
	// 3273 5282:ldc2w           #25  <Double -0.38996530000000001D>
	// 3274 5285:dastore         
	// 3275 5286:astore          83
		double ad84[] = {
			18.2601248D, 2.0349358D, -1688.9579096D, 28.2628214D, 8.8398648000000009D, -0.4406815D, -26.360155200000001D, 154.65699699999999D, -0.54830319999999999D
		};
	// 3276 5288:bipush          9
	// 3277 5290:newarray        double[]
	// 3278 5292:dup             
	// 3279 5293:iconst_0        
	// 3280 5294:ldc2w           #985 <Double 18.2601248D>
	// 3281 5297:dastore         
	// 3282 5298:dup             
	// 3283 5299:iconst_1        
	// 3284 5300:ldc2w           #975 <Double 2.0349358D>
	// 3285 5303:dastore         
	// 3286 5304:dup             
	// 3287 5305:iconst_2        
	// 3288 5306:ldc2w           #987 <Double -1688.9579096D>
	// 3289 5309:dastore         
	// 3290 5310:dup             
	// 3291 5311:iconst_3        
	// 3292 5312:ldc2w           #31  <Double 28.2628214D>
	// 3293 5315:dastore         
	// 3294 5316:dup             
	// 3295 5317:iconst_4        
	// 3296 5318:ldc2w           #33  <Double 8.8398648000000009D>
	// 3297 5321:dastore         
	// 3298 5322:dup             
	// 3299 5323:iconst_5        
	// 3300 5324:ldc2w           #989 <Double -0.4406815D>
	// 3301 5327:dastore         
	// 3302 5328:dup             
	// 3303 5329:bipush          6
	// 3304 5331:ldc2w           #991 <Double -26.360155200000001D>
	// 3305 5334:dastore         
	// 3306 5335:dup             
	// 3307 5336:bipush          7
	// 3308 5338:ldc2w           #993 <Double 154.65699699999999D>
	// 3309 5341:dastore         
	// 3310 5342:dup             
	// 3311 5343:bipush          8
	// 3312 5345:ldc2w           #41  <Double -0.54830319999999999D>
	// 3313 5348:dastore         
	// 3314 5349:astore          84
		double ad85[] = {
			20.060124800000001D, 2.0349358D, -1878.5867542000001D, 94.497482399999996D, 7.5234689000000001D, 1.3593185000000001D, 16.752223999999998D, -864.06152740000005D, -1.3163339000000001D
		};
	// 3315 5351:bipush          9
	// 3316 5353:newarray        double[]
	// 3317 5355:dup             
	// 3318 5356:iconst_0        
	// 3319 5357:ldc2w           #995 <Double 20.060124800000001D>
	// 3320 5360:dastore         
	// 3321 5361:dup             
	// 3322 5362:iconst_1        
	// 3323 5363:ldc2w           #975 <Double 2.0349358D>
	// 3324 5366:dastore         
	// 3325 5367:dup             
	// 3326 5368:iconst_2        
	// 3327 5369:ldc2w           #997 <Double -1878.5867542000001D>
	// 3328 5372:dastore         
	// 3329 5373:dup             
	// 3330 5374:iconst_3        
	// 3331 5375:ldc2w           #95  <Double 94.497482399999996D>
	// 3332 5378:dastore         
	// 3333 5379:dup             
	// 3334 5380:iconst_4        
	// 3335 5381:ldc2w           #97  <Double 7.5234689000000001D>
	// 3336 5384:dastore         
	// 3337 5385:dup             
	// 3338 5386:iconst_5        
	// 3339 5387:ldc2w           #999 <Double 1.3593185000000001D>
	// 3340 5390:dastore         
	// 3341 5391:dup             
	// 3342 5392:bipush          6
	// 3343 5394:ldc2w           #1001 <Double 16.752223999999998D>
	// 3344 5397:dastore         
	// 3345 5398:dup             
	// 3346 5399:bipush          7
	// 3347 5401:ldc2w           #1003 <Double -864.06152740000005D>
	// 3348 5404:dastore         
	// 3349 5405:dup             
	// 3350 5406:bipush          8
	// 3351 5408:ldc2w           #105 <Double -1.3163339000000001D>
	// 3352 5411:dastore         
	// 3353 5412:astore          85
		double ad86[] = {
			20.660124799999998D, 2.0349358D, -1941.7963689999999D, 127.6888198D, 6.4866308999999998D, 1.9593185D, 24.589858499999998D, -1166.0337388999999D, -1.4699811D
		};
	// 3354 5414:bipush          9
	// 3355 5416:newarray        double[]
	// 3356 5418:dup             
	// 3357 5419:iconst_0        
	// 3358 5420:ldc2w           #1005 <Double 20.660124799999998D>
	// 3359 5423:dastore         
	// 3360 5424:dup             
	// 3361 5425:iconst_1        
	// 3362 5426:ldc2w           #975 <Double 2.0349358D>
	// 3363 5429:dastore         
	// 3364 5430:dup             
	// 3365 5431:iconst_2        
	// 3366 5432:ldc2w           #1007 <Double -1941.7963689999999D>
	// 3367 5435:dastore         
	// 3368 5436:dup             
	// 3369 5437:iconst_3        
	// 3370 5438:ldc2w           #127 <Double 127.6888198D>
	// 3371 5441:dastore         
	// 3372 5442:dup             
	// 3373 5443:iconst_4        
	// 3374 5444:ldc2w           #129 <Double 6.4866308999999998D>
	// 3375 5447:dastore         
	// 3376 5448:dup             
	// 3377 5449:iconst_5        
	// 3378 5450:ldc2w           #1009 <Double 1.9593185D>
	// 3379 5453:dastore         
	// 3380 5454:dup             
	// 3381 5455:bipush          6
	// 3382 5457:ldc2w           #1011 <Double 24.589858499999998D>
	// 3383 5460:dastore         
	// 3384 5461:dup             
	// 3385 5462:bipush          7
	// 3386 5464:ldc2w           #1013 <Double -1166.0337388999999D>
	// 3387 5467:dastore         
	// 3388 5468:dup             
	// 3389 5469:bipush          8
	// 3390 5471:ldc2w           #137 <Double -1.4699811D>
	// 3391 5474:dastore         
	// 3392 5475:astore          86
		double ad87[] = {
			20.960124799999999D, 2.0349358D, -1973.4011763999999D, 148.1152635D, 5.7586041999999997D, 2.2593185D, 25.333776100000001D, -1223.0304515D, -1.5229775000000001D
		};
	// 3393 5477:bipush          9
	// 3394 5479:newarray        double[]
	// 3395 5481:dup             
	// 3396 5482:iconst_0        
	// 3397 5483:ldc2w           #1015 <Double 20.960124799999999D>
	// 3398 5486:dastore         
	// 3399 5487:dup             
	// 3400 5488:iconst_1        
	// 3401 5489:ldc2w           #975 <Double 2.0349358D>
	// 3402 5492:dastore         
	// 3403 5493:dup             
	// 3404 5494:iconst_2        
	// 3405 5495:ldc2w           #1017 <Double -1973.4011763999999D>
	// 3406 5498:dastore         
	// 3407 5499:dup             
	// 3408 5500:iconst_3        
	// 3409 5501:ldc2w           #463 <Double 148.1152635D>
	// 3410 5504:dastore         
	// 3411 5505:dup             
	// 3412 5506:iconst_4        
	// 3413 5507:ldc2w           #465 <Double 5.7586041999999997D>
	// 3414 5510:dastore         
	// 3415 5511:dup             
	// 3416 5512:iconst_5        
	// 3417 5513:ldc2w           #1019 <Double 2.2593185D>
	// 3418 5516:dastore         
	// 3419 5517:dup             
	// 3420 5518:bipush          6
	// 3421 5520:ldc2w           #1021 <Double 25.333776100000001D>
	// 3422 5523:dastore         
	// 3423 5524:dup             
	// 3424 5525:bipush          7
	// 3425 5527:ldc2w           #1023 <Double -1223.0304515D>
	// 3426 5530:dastore         
	// 3427 5531:dup             
	// 3428 5532:bipush          8
	// 3429 5534:ldc2w           #473 <Double -1.5229775000000001D>
	// 3430 5537:dastore         
	// 3431 5538:astore          87
		double ad88[] = {
			21.860124800000001D, 2.0349358D, -2068.2155987000001D, 234.27778710000001D, 2.1401053000000001D, 3.1593184999999999D, 15.993064800000001D, -915.949746D, -1.5803442000000001D
		};
	// 3432 5540:bipush          9
	// 3433 5542:newarray        double[]
	// 3434 5544:dup             
	// 3435 5545:iconst_0        
	// 3436 5546:ldc2w           #1025 <Double 21.860124800000001D>
	// 3437 5549:dastore         
	// 3438 5550:dup             
	// 3439 5551:iconst_1        
	// 3440 5552:ldc2w           #975 <Double 2.0349358D>
	// 3441 5555:dastore         
	// 3442 5556:dup             
	// 3443 5557:iconst_2        
	// 3444 5558:ldc2w           #1027 <Double -2068.2155987000001D>
	// 3445 5561:dastore         
	// 3446 5562:dup             
	// 3447 5563:iconst_3        
	// 3448 5564:ldc2w           #159 <Double 234.27778710000001D>
	// 3449 5567:dastore         
	// 3450 5568:dup             
	// 3451 5569:iconst_4        
	// 3452 5570:ldc2w           #161 <Double 2.1401053000000001D>
	// 3453 5573:dastore         
	// 3454 5574:dup             
	// 3455 5575:iconst_5        
	// 3456 5576:ldc2w           #1029 <Double 3.1593184999999999D>
	// 3457 5579:dastore         
	// 3458 5580:dup             
	// 3459 5581:bipush          6
	// 3460 5583:ldc2w           #1031 <Double 15.993064800000001D>
	// 3461 5586:dastore         
	// 3462 5587:dup             
	// 3463 5588:bipush          7
	// 3464 5590:ldc2w           #1033 <Double -915.949746D>
	// 3465 5593:dastore         
	// 3466 5594:dup             
	// 3467 5595:bipush          8
	// 3468 5597:ldc2w           #169 <Double -1.5803442000000001D>
	// 3469 5600:dastore         
	// 3470 5601:astore          88
		double ad89[] = {
			22.460124799999999D, 2.0349358D, -2131.4252135000002D, 327.13300479999998D, -2.4385346000000001D, 3.7593185D, 4.6757565999999997D, -421.1128296D, -1.5323681D
		};
	// 3471 5603:bipush          9
	// 3472 5605:newarray        double[]
	// 3473 5607:dup             
	// 3474 5608:iconst_0        
	// 3475 5609:ldc2w           #1035 <Double 22.460124799999999D>
	// 3476 5612:dastore         
	// 3477 5613:dup             
	// 3478 5614:iconst_1        
	// 3479 5615:ldc2w           #975 <Double 2.0349358D>
	// 3480 5618:dastore         
	// 3481 5619:dup             
	// 3482 5620:iconst_2        
	// 3483 5621:ldc2w           #1037 <Double -2131.4252135000002D>
	// 3484 5624:dastore         
	// 3485 5625:dup             
	// 3486 5626:iconst_3        
	// 3487 5627:ldc2w           #291 <Double 327.13300479999998D>
	// 3488 5630:dastore         
	// 3489 5631:dup             
	// 3490 5632:iconst_4        
	// 3491 5633:ldc2w           #293 <Double -2.4385346000000001D>
	// 3492 5636:dastore         
	// 3493 5637:dup             
	// 3494 5638:iconst_5        
	// 3495 5639:ldc2w           #1039 <Double 3.7593185D>
	// 3496 5642:dastore         
	// 3497 5643:dup             
	// 3498 5644:bipush          6
	// 3499 5646:ldc2w           #1041 <Double 4.6757565999999997D>
	// 3500 5649:dastore         
	// 3501 5650:dup             
	// 3502 5651:bipush          7
	// 3503 5653:ldc2w           #1043 <Double -421.1128296D>
	// 3504 5656:dastore         
	// 3505 5657:dup             
	// 3506 5658:bipush          8
	// 3507 5660:ldc2w           #301 <Double -1.5323681D>
	// 3508 5663:dastore         
	// 3509 5664:astore          89
		double ad90[] = {
			22.7601248D, 2.0349358D, -2163.030021D, 392.10647540000002D, -5.9244687000000003D, 4.0593184999999998D, -0.60120589999999996D, -168.95910180000001D, -1.4830451D
		};
	// 3510 5666:bipush          9
	// 3511 5668:newarray        double[]
	// 3512 5670:dup             
	// 3513 5671:iconst_0        
	// 3514 5672:ldc2w           #1045 <Double 22.7601248D>
	// 3515 5675:dastore         
	// 3516 5676:dup             
	// 3517 5677:iconst_1        
	// 3518 5678:ldc2w           #975 <Double 2.0349358D>
	// 3519 5681:dastore         
	// 3520 5682:dup             
	// 3521 5683:iconst_2        
	// 3522 5684:ldc2w           #1047 <Double -2163.030021D>
	// 3523 5687:dastore         
	// 3524 5688:dup             
	// 3525 5689:iconst_3        
	// 3526 5690:ldc2w           #191 <Double 392.10647540000002D>
	// 3527 5693:dastore         
	// 3528 5694:dup             
	// 3529 5695:iconst_4        
	// 3530 5696:ldc2w           #193 <Double -5.9244687000000003D>
	// 3531 5699:dastore         
	// 3532 5700:dup             
	// 3533 5701:iconst_5        
	// 3534 5702:ldc2w           #1049 <Double 4.0593184999999998D>
	// 3535 5705:dastore         
	// 3536 5706:dup             
	// 3537 5707:bipush          6
	// 3538 5709:ldc2w           #1051 <Double -0.60120589999999996D>
	// 3539 5712:dastore         
	// 3540 5713:dup             
	// 3541 5714:bipush          7
	// 3542 5716:ldc2w           #1053 <Double -168.95910180000001D>
	// 3543 5719:dastore         
	// 3544 5720:dup             
	// 3545 5721:bipush          8
	// 3546 5723:ldc2w           #201 <Double -1.4830451D>
	// 3547 5726:dastore         
	// 3548 5727:astore          90
		double ad91[] = {
			18.993020000000001D, 2.1002652999999998D, -1764.6015047000001D, 11.2644424D, 8.9614528999999994D, -0.9405597D, -31.458583900000001D, 246.30071290000001D, -0.22733419999999999D
		};
	// 3549 5729:bipush          9
	// 3550 5731:newarray        double[]
	// 3551 5733:dup             
	// 3552 5734:iconst_0        
	// 3553 5735:ldc2w           #1055 <Double 18.993020000000001D>
	// 3554 5738:dastore         
	// 3555 5739:dup             
	// 3556 5740:iconst_1        
	// 3557 5741:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3558 5744:dastore         
	// 3559 5745:dup             
	// 3560 5746:iconst_2        
	// 3561 5747:ldc2w           #1059 <Double -1764.6015047000001D>
	// 3562 5750:dastore         
	// 3563 5751:dup             
	// 3564 5752:iconst_3        
	// 3565 5753:ldc2w           #319 <Double 11.2644424D>
	// 3566 5756:dastore         
	// 3567 5757:dup             
	// 3568 5758:iconst_4        
	// 3569 5759:ldc2w           #321 <Double 8.9614528999999994D>
	// 3570 5762:dastore         
	// 3571 5763:dup             
	// 3572 5764:iconst_5        
	// 3573 5765:ldc2w           #1061 <Double -0.9405597D>
	// 3574 5768:dastore         
	// 3575 5769:dup             
	// 3576 5770:bipush          6
	// 3577 5772:ldc2w           #1063 <Double -31.458583900000001D>
	// 3578 5775:dastore         
	// 3579 5776:dup             
	// 3580 5777:bipush          7
	// 3581 5779:ldc2w           #1065 <Double 246.30071290000001D>
	// 3582 5782:dastore         
	// 3583 5783:dup             
	// 3584 5784:bipush          8
	// 3585 5786:ldc2w           #329 <Double -0.22733419999999999D>
	// 3586 5789:dastore         
	// 3587 5790:astore          91
		double ad92[] = {
			19.293019999999999D, 2.1002652999999998D, -1796.4023004000001D, 19.625597299999999D, 8.9143979000000009D, -0.64055969999999995D, -29.802501599999999D, 204.98607129999999D, -0.38996530000000001D
		};
	// 3588 5792:bipush          9
	// 3589 5794:newarray        double[]
	// 3590 5796:dup             
	// 3591 5797:iconst_0        
	// 3592 5798:ldc2w           #1067 <Double 19.293019999999999D>
	// 3593 5801:dastore         
	// 3594 5802:dup             
	// 3595 5803:iconst_1        
	// 3596 5804:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3597 5807:dastore         
	// 3598 5808:dup             
	// 3599 5809:iconst_2        
	// 3600 5810:ldc2w           #1069 <Double -1796.4023004000001D>
	// 3601 5813:dastore         
	// 3602 5814:dup             
	// 3603 5815:iconst_3        
	// 3604 5816:ldc2w           #15  <Double 19.625597299999999D>
	// 3605 5819:dastore         
	// 3606 5820:dup             
	// 3607 5821:iconst_4        
	// 3608 5822:ldc2w           #17  <Double 8.9143979000000009D>
	// 3609 5825:dastore         
	// 3610 5826:dup             
	// 3611 5827:iconst_5        
	// 3612 5828:ldc2w           #1071 <Double -0.64055969999999995D>
	// 3613 5831:dastore         
	// 3614 5832:dup             
	// 3615 5833:bipush          6
	// 3616 5835:ldc2w           #1073 <Double -29.802501599999999D>
	// 3617 5838:dastore         
	// 3618 5839:dup             
	// 3619 5840:bipush          7
	// 3620 5842:ldc2w           #1075 <Double 204.98607129999999D>
	// 3621 5845:dastore         
	// 3622 5846:dup             
	// 3623 5847:bipush          8
	// 3624 5849:ldc2w           #25  <Double -0.38996530000000001D>
	// 3625 5852:dastore         
	// 3626 5853:astore          92
		double ad93[] = {
			19.89302D, 2.1002652999999998D, -1860.003892D, 37.305238799999998D, 8.7346948999999992D, -0.040559699999999997D, -20.359390399999999D, 42.635289200000003D, -0.70060560000000005D
		};
	// 3627 5855:bipush          9
	// 3628 5857:newarray        double[]
	// 3629 5859:dup             
	// 3630 5860:iconst_0        
	// 3631 5861:ldc2w           #1077 <Double 19.89302D>
	// 3632 5864:dastore         
	// 3633 5865:dup             
	// 3634 5866:iconst_1        
	// 3635 5867:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3636 5870:dastore         
	// 3637 5871:dup             
	// 3638 5872:iconst_2        
	// 3639 5873:ldc2w           #1079 <Double -1860.003892D>
	// 3640 5876:dastore         
	// 3641 5877:dup             
	// 3642 5878:iconst_3        
	// 3643 5879:ldc2w           #47  <Double 37.305238799999998D>
	// 3644 5882:dastore         
	// 3645 5883:dup             
	// 3646 5884:iconst_4        
	// 3647 5885:ldc2w           #49  <Double 8.7346948999999992D>
	// 3648 5888:dastore         
	// 3649 5889:dup             
	// 3650 5890:iconst_5        
	// 3651 5891:ldc2w           #1081 <Double -0.040559699999999997D>
	// 3652 5894:dastore         
	// 3653 5895:dup             
	// 3654 5896:bipush          6
	// 3655 5898:ldc2w           #1083 <Double -20.359390399999999D>
	// 3656 5901:dastore         
	// 3657 5902:dup             
	// 3658 5903:bipush          7
	// 3659 5905:ldc2w           #1085 <Double 42.635289200000003D>
	// 3660 5908:dastore         
	// 3661 5909:dup             
	// 3662 5910:bipush          8
	// 3663 5912:ldc2w           #57  <Double -0.70060560000000005D>
	// 3664 5915:dastore         
	// 3665 5916:astore          93
		double ad94[] = {
			20.193020000000001D, 2.1002652999999998D, -1891.8046876999999D, 46.896400399999997D, 8.5943556999999995D, 0.25944030000000001D, -13.261790299999999D, -93.054764700000007D, -0.84519750000000005D
		};
	// 3666 5918:bipush          9
	// 3667 5920:newarray        double[]
	// 3668 5922:dup             
	// 3669 5923:iconst_0        
	// 3670 5924:ldc2w           #1087 <Double 20.193020000000001D>
	// 3671 5927:dastore         
	// 3672 5928:dup             
	// 3673 5929:iconst_1        
	// 3674 5930:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3675 5933:dastore         
	// 3676 5934:dup             
	// 3677 5935:iconst_2        
	// 3678 5936:ldc2w           #1089 <Double -1891.8046876999999D>
	// 3679 5939:dastore         
	// 3680 5940:dup             
	// 3681 5941:iconst_3        
	// 3682 5942:ldc2w           #541 <Double 46.896400399999997D>
	// 3683 5945:dastore         
	// 3684 5946:dup             
	// 3685 5947:iconst_4        
	// 3686 5948:ldc2w           #543 <Double 8.5943556999999995D>
	// 3687 5951:dastore         
	// 3688 5952:dup             
	// 3689 5953:iconst_5        
	// 3690 5954:ldc2w           #1091 <Double 0.25944030000000001D>
	// 3691 5957:dastore         
	// 3692 5958:dup             
	// 3693 5959:bipush          6
	// 3694 5961:ldc2w           #1093 <Double -13.261790299999999D>
	// 3695 5964:dastore         
	// 3696 5965:dup             
	// 3697 5966:bipush          7
	// 3698 5968:ldc2w           #1095 <Double -93.054764700000007D>
	// 3699 5971:dastore         
	// 3700 5972:dup             
	// 3701 5973:bipush          8
	// 3702 5975:ldc2w           #551 <Double -0.84519750000000005D>
	// 3703 5978:dastore         
	// 3704 5979:astore          94
		double ad95[] = {
			21.093019999999999D, 2.1002652999999998D, -1987.207075D, 80.747736000000003D, 7.8897272999999997D, 1.1594403D, 10.532480400000001D, -678.19875950000005D, -1.2173562D
		};
	// 3705 5981:bipush          9
	// 3706 5983:newarray        double[]
	// 3707 5985:dup             
	// 3708 5986:iconst_0        
	// 3709 5987:ldc2w           #1097 <Double 21.093019999999999D>
	// 3710 5990:dastore         
	// 3711 5991:dup             
	// 3712 5992:iconst_1        
	// 3713 5993:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3714 5996:dastore         
	// 3715 5997:dup             
	// 3716 5998:iconst_2        
	// 3717 5999:ldc2w           #1099 <Double -1987.207075D>
	// 3718 6002:dastore         
	// 3719 6003:dup             
	// 3720 6004:iconst_3        
	// 3721 6005:ldc2w           #79  <Double 80.747736000000003D>
	// 3722 6008:dastore         
	// 3723 6009:dup             
	// 3724 6010:iconst_4        
	// 3725 6011:ldc2w           #81  <Double 7.8897272999999997D>
	// 3726 6014:dastore         
	// 3727 6015:dup             
	// 3728 6016:iconst_5        
	// 3729 6017:ldc2w           #1101 <Double 1.1594403D>
	// 3730 6020:dastore         
	// 3731 6021:dup             
	// 3732 6022:bipush          6
	// 3733 6024:ldc2w           #1103 <Double 10.532480400000001D>
	// 3734 6027:dastore         
	// 3735 6028:dup             
	// 3736 6029:bipush          7
	// 3737 6031:ldc2w           #1105 <Double -678.19875950000005D>
	// 3738 6034:dastore         
	// 3739 6035:dup             
	// 3740 6036:bipush          8
	// 3741 6038:ldc2w           #89  <Double -1.2173562D>
	// 3742 6041:dastore         
	// 3743 6042:astore          95
		double ad96[] = {
			21.39302D, 2.1002652999999998D, -2019.0078707D, 94.497482399999996D, 7.5234689000000001D, 1.4594403D, 17.0939236D, -884.50303199999996D, -1.3163339000000001D
		};
	// 3744 6044:bipush          9
	// 3745 6046:newarray        double[]
	// 3746 6048:dup             
	// 3747 6049:iconst_0        
	// 3748 6050:ldc2w           #1107 <Double 21.39302D>
	// 3749 6053:dastore         
	// 3750 6054:dup             
	// 3751 6055:iconst_1        
	// 3752 6056:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3753 6059:dastore         
	// 3754 6060:dup             
	// 3755 6061:iconst_2        
	// 3756 6062:ldc2w           #1109 <Double -2019.0078707D>
	// 3757 6065:dastore         
	// 3758 6066:dup             
	// 3759 6067:iconst_3        
	// 3760 6068:ldc2w           #95  <Double 94.497482399999996D>
	// 3761 6071:dastore         
	// 3762 6072:dup             
	// 3763 6073:iconst_4        
	// 3764 6074:ldc2w           #97  <Double 7.5234689000000001D>
	// 3765 6077:dastore         
	// 3766 6078:dup             
	// 3767 6079:iconst_5        
	// 3768 6080:ldc2w           #1111 <Double 1.4594403D>
	// 3769 6083:dastore         
	// 3770 6084:dup             
	// 3771 6085:bipush          6
	// 3772 6087:ldc2w           #1113 <Double 17.0939236D>
	// 3773 6090:dastore         
	// 3774 6091:dup             
	// 3775 6092:bipush          7
	// 3776 6094:ldc2w           #1115 <Double -884.50303199999996D>
	// 3777 6097:dastore         
	// 3778 6098:dup             
	// 3779 6099:bipush          8
	// 3780 6101:ldc2w           #105 <Double -1.3163339000000001D>
	// 3781 6104:dastore         
	// 3782 6105:astore          96
		double ad97[] = {
			22.293019999999999D, 2.1002652999999998D, -2114.4102579999999D, 148.1152635D, 5.7586041999999997D, 2.3594403000000002D, 25.6754757D, -1246.5472517999999D, -1.5229775000000001D
		};
	// 3783 6107:bipush          9
	// 3784 6109:newarray        double[]
	// 3785 6111:dup             
	// 3786 6112:iconst_0        
	// 3787 6113:ldc2w           #1117 <Double 22.293019999999999D>
	// 3788 6116:dastore         
	// 3789 6117:dup             
	// 3790 6118:iconst_1        
	// 3791 6119:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3792 6122:dastore         
	// 3793 6123:dup             
	// 3794 6124:iconst_2        
	// 3795 6125:ldc2w           #1119 <Double -2114.4102579999999D>
	// 3796 6128:dastore         
	// 3797 6129:dup             
	// 3798 6130:iconst_3        
	// 3799 6131:ldc2w           #463 <Double 148.1152635D>
	// 3800 6134:dastore         
	// 3801 6135:dup             
	// 3802 6136:iconst_4        
	// 3803 6137:ldc2w           #465 <Double 5.7586041999999997D>
	// 3804 6140:dastore         
	// 3805 6141:dup             
	// 3806 6142:iconst_5        
	// 3807 6143:ldc2w           #1121 <Double 2.3594403000000002D>
	// 3808 6146:dastore         
	// 3809 6147:dup             
	// 3810 6148:bipush          6
	// 3811 6150:ldc2w           #1123 <Double 25.6754757D>
	// 3812 6153:dastore         
	// 3813 6154:dup             
	// 3814 6155:bipush          7
	// 3815 6157:ldc2w           #1125 <Double -1246.5472517999999D>
	// 3816 6160:dastore         
	// 3817 6161:dup             
	// 3818 6162:bipush          8
	// 3819 6164:ldc2w           #473 <Double -1.5229775000000001D>
	// 3820 6167:dastore         
	// 3821 6168:astore          97
		double ad98[] = {
			23.193020000000001D, 2.1002652999999998D, -2209.8126453D, 234.27778710000001D, 2.1401053000000001D, 3.2594403000000001D, 16.3347643D, -942.54184210000005D, -1.5803442000000001D
		};
	// 3822 6170:bipush          9
	// 3823 6172:newarray        double[]
	// 3824 6174:dup             
	// 3825 6175:iconst_0        
	// 3826 6176:ldc2w           #1127 <Double 23.193020000000001D>
	// 3827 6179:dastore         
	// 3828 6180:dup             
	// 3829 6181:iconst_1        
	// 3830 6182:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3831 6185:dastore         
	// 3832 6186:dup             
	// 3833 6187:iconst_2        
	// 3834 6188:ldc2w           #1129 <Double -2209.8126453D>
	// 3835 6191:dastore         
	// 3836 6192:dup             
	// 3837 6193:iconst_3        
	// 3838 6194:ldc2w           #159 <Double 234.27778710000001D>
	// 3839 6197:dastore         
	// 3840 6198:dup             
	// 3841 6199:iconst_4        
	// 3842 6200:ldc2w           #161 <Double 2.1401053000000001D>
	// 3843 6203:dastore         
	// 3844 6204:dup             
	// 3845 6205:iconst_5        
	// 3846 6206:ldc2w           #1131 <Double 3.2594403000000001D>
	// 3847 6209:dastore         
	// 3848 6210:dup             
	// 3849 6211:bipush          6
	// 3850 6213:ldc2w           #1133 <Double 16.3347643D>
	// 3851 6216:dastore         
	// 3852 6217:dup             
	// 3853 6218:bipush          7
	// 3854 6220:ldc2w           #1135 <Double -942.54184210000005D>
	// 3855 6223:dastore         
	// 3856 6224:dup             
	// 3857 6225:bipush          8
	// 3858 6227:ldc2w           #169 <Double -1.5803442000000001D>
	// 3859 6230:dastore         
	// 3860 6231:astore          98
		double ad99[] = {
			23.493020000000001D, 2.1002652999999998D, -2241.613441D, 275.7268449D, 0.1651599D, 3.5594402999999999D, 10.7759275D, -709.50256690000003D, -1.5649227999999999D
		};
	// 3861 6233:bipush          9
	// 3862 6235:newarray        double[]
	// 3863 6237:dup             
	// 3864 6238:iconst_0        
	// 3865 6239:ldc2w           #1137 <Double 23.493020000000001D>
	// 3866 6242:dastore         
	// 3867 6243:dup             
	// 3868 6244:iconst_1        
	// 3869 6245:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3870 6248:dastore         
	// 3871 6249:dup             
	// 3872 6250:iconst_2        
	// 3873 6251:ldc2w           #1139 <Double -2241.613441D>
	// 3874 6254:dastore         
	// 3875 6255:dup             
	// 3876 6256:iconst_3        
	// 3877 6257:ldc2w           #175 <Double 275.7268449D>
	// 3878 6260:dastore         
	// 3879 6261:dup             
	// 3880 6262:iconst_4        
	// 3881 6263:ldc2w           #177 <Double 0.1651599D>
	// 3882 6266:dastore         
	// 3883 6267:dup             
	// 3884 6268:iconst_5        
	// 3885 6269:ldc2w           #1141 <Double 3.5594402999999999D>
	// 3886 6272:dastore         
	// 3887 6273:dup             
	// 3888 6274:bipush          6
	// 3889 6276:ldc2w           #1143 <Double 10.7759275D>
	// 3890 6279:dastore         
	// 3891 6280:dup             
	// 3892 6281:bipush          7
	// 3893 6283:ldc2w           #1145 <Double -709.50256690000003D>
	// 3894 6286:dastore         
	// 3895 6287:dup             
	// 3896 6288:bipush          8
	// 3897 6290:ldc2w           #185 <Double -1.5649227999999999D>
	// 3898 6293:dastore         
	// 3899 6294:astore          99
		double ad100[] = {
			24.093019999999999D, 2.1002652999999998D, -2305.2150324999998D, 392.10647540000002D, -5.9244687000000003D, 4.1594403D, -0.25950630000000002D, -198.6264937D, -1.4830451D
		};
	// 3900 6296:bipush          9
	// 3901 6298:newarray        double[]
	// 3902 6300:dup             
	// 3903 6301:iconst_0        
	// 3904 6302:ldc2w           #1147 <Double 24.093019999999999D>
	// 3905 6305:dastore         
	// 3906 6306:dup             
	// 3907 6307:iconst_1        
	// 3908 6308:ldc2w           #1057 <Double 2.1002652999999998D>
	// 3909 6311:dastore         
	// 3910 6312:dup             
	// 3911 6313:iconst_2        
	// 3912 6314:ldc2w           #1149 <Double -2305.2150324999998D>
	// 3913 6317:dastore         
	// 3914 6318:dup             
	// 3915 6319:iconst_3        
	// 3916 6320:ldc2w           #191 <Double 392.10647540000002D>
	// 3917 6323:dastore         
	// 3918 6324:dup             
	// 3919 6325:iconst_4        
	// 3920 6326:ldc2w           #193 <Double -5.9244687000000003D>
	// 3921 6329:dastore         
	// 3922 6330:dup             
	// 3923 6331:iconst_5        
	// 3924 6332:ldc2w           #1151 <Double 4.1594403D>
	// 3925 6335:dastore         
	// 3926 6336:dup             
	// 3927 6337:bipush          6
	// 3928 6339:ldc2w           #1153 <Double -0.25950630000000002D>
	// 3929 6342:dastore         
	// 3930 6343:dup             
	// 3931 6344:bipush          7
	// 3932 6346:ldc2w           #1155 <Double -198.6264937D>
	// 3933 6349:dastore         
	// 3934 6350:dup             
	// 3935 6351:bipush          8
	// 3936 6353:ldc2w           #201 <Double -1.4830451D>
	// 3937 6356:dastore         
	// 3938 6357:astore          100
		double ad101[] = {
			17.9448291D, 2.1292100999999999D, -1652.6782860000001D, 3.0597946D, 8.9830009000000004D, -1.2205668999999999D, -30.6815417D, 274.22234049999997D, -0.062199999999999998D
		};
	// 3939 6359:bipush          9
	// 3940 6361:newarray        double[]
	// 3941 6363:dup             
	// 3942 6364:iconst_0        
	// 3943 6365:ldc2w           #1157 <Double 17.9448291D>
	// 3944 6368:dastore         
	// 3945 6369:dup             
	// 3946 6370:iconst_1        
	// 3947 6371:ldc2w           #1159 <Double 2.1292100999999999D>
	// 3948 6374:dastore         
	// 3949 6375:dup             
	// 3950 6376:iconst_2        
	// 3951 6377:ldc2w           #1161 <Double -1652.6782860000001D>
	// 3952 6380:dastore         
	// 3953 6381:dup             
	// 3954 6382:iconst_3        
	// 3955 6383:ldc2w           #209 <Double 3.0597946D>
	// 3956 6386:dastore         
	// 3957 6387:dup             
	// 3958 6388:iconst_4        
	// 3959 6389:ldc2w           #211 <Double 8.9830009000000004D>
	// 3960 6392:dastore         
	// 3961 6393:dup             
	// 3962 6394:iconst_5        
	// 3963 6395:ldc2w           #1163 <Double -1.2205668999999999D>
	// 3964 6398:dastore         
	// 3965 6399:dup             
	// 3966 6400:bipush          6
	// 3967 6402:ldc2w           #1165 <Double -30.6815417D>
	// 3968 6405:dastore         
	// 3969 6406:dup             
	// 3970 6407:bipush          7
	// 3971 6409:ldc2w           #1167 <Double 274.22234049999997D>
	// 3972 6412:dastore         
	// 3973 6413:dup             
	// 3974 6414:bipush          8
	// 3975 6416:ldc2w           #219 <Double -0.062199999999999998D>
	// 3976 6419:dastore         
	// 3977 6420:astore          101
		double ad102[] = {
			18.2448291D, 2.1292100999999999D, -1684.5659165D, 11.2644424D, 8.9614528999999994D, -0.92056689999999997D, -31.198067500000001D, 242.8043705D, -0.22733419999999999D
		};
	// 3978 6422:bipush          9
	// 3979 6424:newarray        double[]
	// 3980 6426:dup             
	// 3981 6427:iconst_0        
	// 3982 6428:ldc2w           #1169 <Double 18.2448291D>
	// 3983 6431:dastore         
	// 3984 6432:dup             
	// 3985 6433:iconst_1        
	// 3986 6434:ldc2w           #1159 <Double 2.1292100999999999D>
	// 3987 6437:dastore         
	// 3988 6438:dup             
	// 3989 6439:iconst_2        
	// 3990 6440:ldc2w           #1171 <Double -1684.5659165D>
	// 3991 6443:dastore         
	// 3992 6444:dup             
	// 3993 6445:iconst_3        
	// 3994 6446:ldc2w           #319 <Double 11.2644424D>
	// 3995 6449:dastore         
	// 3996 6450:dup             
	// 3997 6451:iconst_4        
	// 3998 6452:ldc2w           #321 <Double 8.9614528999999994D>
	// 3999 6455:dastore         
	// 4000 6456:dup             
	// 4001 6457:iconst_5        
	// 4002 6458:ldc2w           #1173 <Double -0.92056689999999997D>
	// 4003 6461:dastore         
	// 4004 6462:dup             
	// 4005 6463:bipush          6
	// 4006 6465:ldc2w           #1175 <Double -31.198067500000001D>
	// 4007 6468:dastore         
	// 4008 6469:dup             
	// 4009 6470:bipush          7
	// 4010 6472:ldc2w           #1177 <Double 242.8043705D>
	// 4011 6475:dastore         
	// 4012 6476:dup             
	// 4013 6477:bipush          8
	// 4014 6479:ldc2w           #329 <Double -0.22733419999999999D>
	// 4015 6482:dastore         
	// 4016 6483:astore          102
		double ad103[] = {
			18.844829099999998D, 2.1292100999999999D, -1748.3411773D, 28.2628214D, 8.8398648000000009D, -0.32056689999999999D, -25.757939199999999D, 135.3066431D, -0.54830319999999999D
		};
	// 4017 6485:bipush          9
	// 4018 6487:newarray        double[]
	// 4019 6489:dup             
	// 4020 6490:iconst_0        
	// 4021 6491:ldc2w           #1179 <Double 18.844829099999998D>
	// 4022 6494:dastore         
	// 4023 6495:dup             
	// 4024 6496:iconst_1        
	// 4025 6497:ldc2w           #1159 <Double 2.1292100999999999D>
	// 4026 6500:dastore         
	// 4027 6501:dup             
	// 4028 6502:iconst_2        
	// 4029 6503:ldc2w           #1181 <Double -1748.3411773D>
	// 4030 6506:dastore         
	// 4031 6507:dup             
	// 4032 6508:iconst_3        
	// 4033 6509:ldc2w           #31  <Double 28.2628214D>
	// 4034 6512:dastore         
	// 4035 6513:dup             
	// 4036 6514:iconst_4        
	// 4037 6515:ldc2w           #33  <Double 8.8398648000000009D>
	// 4038 6518:dastore         
	// 4039 6519:dup             
	// 4040 6520:iconst_5        
	// 4041 6521:ldc2w           #1183 <Double -0.32056689999999999D>
	// 4042 6524:dastore         
	// 4043 6525:dup             
	// 4044 6526:bipush          6
	// 4045 6528:ldc2w           #1185 <Double -25.757939199999999D>
	// 4046 6531:dastore         
	// 4047 6532:dup             
	// 4048 6533:bipush          7
	// 4049 6535:ldc2w           #1187 <Double 135.3066431D>
	// 4050 6538:dastore         
	// 4051 6539:dup             
	// 4052 6540:bipush          8
	// 4053 6542:ldc2w           #41  <Double -0.54830319999999999D>
	// 4054 6545:dastore         
	// 4055 6546:astore          103
		double ad104[] = {
			20.9448291D, 2.1292100999999999D, -1971.5545904000001D, 110.00047410000001D, 7.0639795000000003D, 1.7794331000000001D, 22.275548499999999D, -1072.3774487000001D, -1.4008494D
		};
	// 4056 6548:bipush          9
	// 4057 6550:newarray        double[]
	// 4058 6552:dup             
	// 4059 6553:iconst_0        
	// 4060 6554:ldc2w           #1189 <Double 20.9448291D>
	// 4061 6557:dastore         
	// 4062 6558:dup             
	// 4063 6559:iconst_1        
	// 4064 6560:ldc2w           #1159 <Double 2.1292100999999999D>
	// 4065 6563:dastore         
	// 4066 6564:dup             
	// 4067 6565:iconst_2        
	// 4068 6566:ldc2w           #1191 <Double -1971.5545904000001D>
	// 4069 6569:dastore         
	// 4070 6570:dup             
	// 4071 6571:iconst_3        
	// 4072 6572:ldc2w           #111 <Double 110.00047410000001D>
	// 4073 6575:dastore         
	// 4074 6576:dup             
	// 4075 6577:iconst_4        
	// 4076 6578:ldc2w           #113 <Double 7.0639795000000003D>
	// 4077 6581:dastore         
	// 4078 6582:dup             
	// 4079 6583:iconst_5        
	// 4080 6584:ldc2w           #1193 <Double 1.7794331000000001D>
	// 4081 6587:dastore         
	// 4082 6588:dup             
	// 4083 6589:bipush          6
	// 4084 6591:ldc2w           #1195 <Double 22.275548499999999D>
	// 4085 6594:dastore         
	// 4086 6595:dup             
	// 4087 6596:bipush          7
	// 4088 6598:ldc2w           #1197 <Double -1072.3774487000001D>
	// 4089 6601:dastore         
	// 4090 6602:dup             
	// 4091 6603:bipush          8
	// 4092 6605:ldc2w           #121 <Double -1.4008494D>
	// 4093 6608:dastore         
	// 4094 6609:astore          104
		double ad105[] = {
			21.2448291D, 2.1292100999999999D, -2003.4422208999999D, 127.6888198D, 6.4866308999999998D, 2.0794331000000001D, 25.192074399999999D, -1199.8372755D, -1.4699811D
		};
	// 4095 6611:bipush          9
	// 4096 6613:newarray        double[]
	// 4097 6615:dup             
	// 4098 6616:iconst_0        
	// 4099 6617:ldc2w           #1199 <Double 21.2448291D>
	// 4100 6620:dastore         
	// 4101 6621:dup             
	// 4102 6622:iconst_1        
	// 4103 6623:ldc2w           #1159 <Double 2.1292100999999999D>
	// 4104 6626:dastore         
	// 4105 6627:dup             
	// 4106 6628:iconst_2        
	// 4107 6629:ldc2w           #1201 <Double -2003.4422208999999D>
	// 4108 6632:dastore         
	// 4109 6633:dup             
	// 4110 6634:iconst_3        
	// 4111 6635:ldc2w           #127 <Double 127.6888198D>
	// 4112 6638:dastore         
	// 4113 6639:dup             
	// 4114 6640:iconst_4        
	// 4115 6641:ldc2w           #129 <Double 6.4866308999999998D>
	// 4116 6644:dastore         
	// 4117 6645:dup             
	// 4118 6646:iconst_5        
	// 4119 6647:ldc2w           #1203 <Double 2.0794331000000001D>
	// 4120 6650:dastore         
	// 4121 6651:dup             
	// 4122 6652:bipush          6
	// 4123 6654:ldc2w           #1205 <Double 25.192074399999999D>
	// 4124 6657:dastore         
	// 4125 6658:dup             
	// 4126 6659:bipush          7
	// 4127 6661:ldc2w           #1207 <Double -1199.8372755D>
	// 4128 6664:dastore         
	// 4129 6665:dup             
	// 4130 6666:bipush          8
	// 4131 6668:ldc2w           #137 <Double -1.4699811D>
	// 4132 6671:dastore         
	// 4133 6672:astore          105
		double ad106[] = {
			21.844829099999998D, 2.1292100999999999D, -2067.2174817D, 171.99884599999999D, 4.8356763999999997D, 2.6794330999999998D, 24.551946099999999D, -1237.4997401999999D, -1.5592649999999999D
		};
	// 4134 6674:bipush          9
	// 4135 6676:newarray        double[]
	// 4136 6678:dup             
	// 4137 6679:iconst_0        
	// 4138 6680:ldc2w           #1209 <Double 21.844829099999998D>
	// 4139 6683:dastore         
	// 4140 6684:dup             
	// 4141 6685:iconst_1        
	// 4142 6686:ldc2w           #1159 <Double 2.1292100999999999D>
	// 4143 6689:dastore         
	// 4144 6690:dup             
	// 4145 6691:iconst_2        
	// 4146 6692:ldc2w           #1211 <Double -2067.2174817D>
	// 4147 6695:dastore         
	// 4148 6696:dup             
	// 4149 6697:iconst_3        
	// 4150 6698:ldc2w           #143 <Double 171.99884599999999D>
	// 4151 6701:dastore         
	// 4152 6702:dup             
	// 4153 6703:iconst_4        
	// 4154 6704:ldc2w           #145 <Double 4.8356763999999997D>
	// 4155 6707:dastore         
	// 4156 6708:dup             
	// 4157 6709:iconst_5        
	// 4158 6710:ldc2w           #1213 <Double 2.6794330999999998D>
	// 4159 6713:dastore         
	// 4160 6714:dup             
	// 4161 6715:bipush          6
	// 4162 6717:ldc2w           #1215 <Double 24.551946099999999D>
	// 4163 6720:dastore         
	// 4164 6721:dup             
	// 4165 6722:bipush          7
	// 4166 6724:ldc2w           #1217 <Double -1237.4997401999999D>
	// 4167 6727:dastore         
	// 4168 6728:dup             
	// 4169 6729:bipush          8
	// 4170 6731:ldc2w           #153 <Double -1.5592649999999999D>
	// 4171 6734:dastore         
	// 4172 6735:astore          106
		double ad107[] = {
			22.7448291D, 2.1292100999999999D, -2162.8803730999998D, 275.7268449D, 0.1651599D, 3.5794331000000001D, 11.036443999999999D, -724.72214780000002D, -1.5649227999999999D
		};
	// 4173 6737:bipush          9
	// 4174 6739:newarray        double[]
	// 4175 6741:dup             
	// 4176 6742:iconst_0        
	// 4177 6743:ldc2w           #1219 <Double 22.7448291D>
	// 4178 6746:dastore         
	// 4179 6747:dup             
	// 4180 6748:iconst_1        
	// 4181 6749:ldc2w           #1159 <Double 2.1292100999999999D>
	// 4182 6752:dastore         
	// 4183 6753:dup             
	// 4184 6754:iconst_2        
	// 4185 6755:ldc2w           #1221 <Double -2162.8803730999998D>
	// 4186 6758:dastore         
	// 4187 6759:dup             
	// 4188 6760:iconst_3        
	// 4189 6761:ldc2w           #175 <Double 275.7268449D>
	// 4190 6764:dastore         
	// 4191 6765:dup             
	// 4192 6766:iconst_4        
	// 4193 6767:ldc2w           #177 <Double 0.1651599D>
	// 4194 6770:dastore         
	// 4195 6771:dup             
	// 4196 6772:iconst_5        
	// 4197 6773:ldc2w           #1223 <Double 3.5794331000000001D>
	// 4198 6776:dastore         
	// 4199 6777:dup             
	// 4200 6778:bipush          6
	// 4201 6780:ldc2w           #1225 <Double 11.036443999999999D>
	// 4202 6783:dastore         
	// 4203 6784:dup             
	// 4204 6785:bipush          7
	// 4205 6787:ldc2w           #1227 <Double -724.72214780000002D>
	// 4206 6790:dastore         
	// 4207 6791:dup             
	// 4208 6792:bipush          8
	// 4209 6794:ldc2w           #185 <Double -1.5649227999999999D>
	// 4210 6797:dastore         
	// 4211 6798:astore          107
		double ad108[] = {
			23.044829100000001D, 2.1292100999999999D, -2194.7680034999998D, 327.13300479999998D, -2.4385346000000001D, 3.8794331D, 5.2779724999999997D, -465.75625309999998D, -1.5323681D
		};
	// 4212 6800:bipush          9
	// 4213 6802:newarray        double[]
	// 4214 6804:dup             
	// 4215 6805:iconst_0        
	// 4216 6806:ldc2w           #1229 <Double 23.044829100000001D>
	// 4217 6809:dastore         
	// 4218 6810:dup             
	// 4219 6811:iconst_1        
	// 4220 6812:ldc2w           #1159 <Double 2.1292100999999999D>
	// 4221 6815:dastore         
	// 4222 6816:dup             
	// 4223 6817:iconst_2        
	// 4224 6818:ldc2w           #1231 <Double -2194.7680034999998D>
	// 4225 6821:dastore         
	// 4226 6822:dup             
	// 4227 6823:iconst_3        
	// 4228 6824:ldc2w           #291 <Double 327.13300479999998D>
	// 4229 6827:dastore         
	// 4230 6828:dup             
	// 4231 6829:iconst_4        
	// 4232 6830:ldc2w           #293 <Double -2.4385346000000001D>
	// 4233 6833:dastore         
	// 4234 6834:dup             
	// 4235 6835:iconst_5        
	// 4236 6836:ldc2w           #1233 <Double 3.8794331D>
	// 4237 6839:dastore         
	// 4238 6840:dup             
	// 4239 6841:bipush          6
	// 4240 6843:ldc2w           #1235 <Double 5.2779724999999997D>
	// 4241 6846:dastore         
	// 4242 6847:dup             
	// 4243 6848:bipush          7
	// 4244 6850:ldc2w           #1237 <Double -465.75625309999998D>
	// 4245 6853:dastore         
	// 4246 6854:dup             
	// 4247 6855:bipush          8
	// 4248 6857:ldc2w           #301 <Double -1.5323681D>
	// 4249 6860:dastore         
	// 4250 6861:astore          108
		double ad109[] = {
			16.4710638D, 2.2076294999999999D, -1487.1211412D, 37.305238799999998D, 8.7346948999999992D, -0.035577400000000002D, -19.797023299999999D, 34.1432036D, -0.70060560000000005D
		};
	// 4251 6863:bipush          9
	// 4252 6865:newarray        double[]
	// 4253 6867:dup             
	// 4254 6868:iconst_0        
	// 4255 6869:ldc2w           #1239 <Double 16.4710638D>
	// 4256 6872:dastore         
	// 4257 6873:dup             
	// 4258 6874:iconst_1        
	// 4259 6875:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4260 6878:dastore         
	// 4261 6879:dup             
	// 4262 6880:iconst_2        
	// 4263 6881:ldc2w           #1243 <Double -1487.1211412D>
	// 4264 6884:dastore         
	// 4265 6885:dup             
	// 4266 6886:iconst_3        
	// 4267 6887:ldc2w           #47  <Double 37.305238799999998D>
	// 4268 6890:dastore         
	// 4269 6891:dup             
	// 4270 6892:iconst_4        
	// 4271 6893:ldc2w           #49  <Double 8.7346948999999992D>
	// 4272 6896:dastore         
	// 4273 6897:dup             
	// 4274 6898:iconst_5        
	// 4275 6899:ldc2w           #1245 <Double -0.035577400000000002D>
	// 4276 6902:dastore         
	// 4277 6903:dup             
	// 4278 6904:bipush          6
	// 4279 6906:ldc2w           #1247 <Double -19.797023299999999D>
	// 4280 6909:dastore         
	// 4281 6910:dup             
	// 4282 6911:bipush          7
	// 4283 6913:ldc2w           #1249 <Double 34.1432036D>
	// 4284 6916:dastore         
	// 4285 6917:dup             
	// 4286 6918:bipush          8
	// 4287 6920:ldc2w           #57  <Double -0.70060560000000005D>
	// 4288 6923:dastore         
	// 4289 6924:astore          109
		double ad110[] = {
			16.7710638D, 2.2076294999999999D, -1519.2440297000001D, 46.896400399999997D, 8.5943556999999995D, 0.26442260000000001D, -12.6994232D, -103.2339516D, -0.84519750000000005D
		};
	// 4290 6926:bipush          9
	// 4291 6928:newarray        double[]
	// 4292 6930:dup             
	// 4293 6931:iconst_0        
	// 4294 6932:ldc2w           #1251 <Double 16.7710638D>
	// 4295 6935:dastore         
	// 4296 6936:dup             
	// 4297 6937:iconst_1        
	// 4298 6938:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4299 6941:dastore         
	// 4300 6942:dup             
	// 4301 6943:iconst_2        
	// 4302 6944:ldc2w           #1253 <Double -1519.2440297000001D>
	// 4303 6947:dastore         
	// 4304 6948:dup             
	// 4305 6949:iconst_3        
	// 4306 6950:ldc2w           #541 <Double 46.896400399999997D>
	// 4307 6953:dastore         
	// 4308 6954:dup             
	// 4309 6955:iconst_4        
	// 4310 6956:ldc2w           #543 <Double 8.5943556999999995D>
	// 4311 6959:dastore         
	// 4312 6960:dup             
	// 4313 6961:iconst_5        
	// 4314 6962:ldc2w           #1255 <Double 0.26442260000000001D>
	// 4315 6965:dastore         
	// 4316 6966:dup             
	// 4317 6967:bipush          6
	// 4318 6969:ldc2w           #1257 <Double -12.6994232D>
	// 4319 6972:dastore         
	// 4320 6973:dup             
	// 4321 6974:bipush          7
	// 4322 6976:ldc2w           #1259 <Double -103.2339516D>
	// 4323 6979:dastore         
	// 4324 6980:dup             
	// 4325 6981:bipush          8
	// 4326 6983:ldc2w           #551 <Double -0.84519750000000005D>
	// 4327 6986:dastore         
	// 4328 6987:astore          110
		double ad111[] = {
			17.371063800000002D, 2.2076294999999999D, -1583.4898066999999D, 68.407805800000006D, 8.1813959000000001D, 0.86442260000000004D, 3.4178850999999999D, -478.71347050000003D, -1.1049982D
		};
	// 4329 6989:bipush          9
	// 4330 6991:newarray        double[]
	// 4331 6993:dup             
	// 4332 6994:iconst_0        
	// 4333 6995:ldc2w           #1261 <Double 17.371063800000002D>
	// 4334 6998:dastore         
	// 4335 6999:dup             
	// 4336 7000:iconst_1        
	// 4337 7001:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4338 7004:dastore         
	// 4339 7005:dup             
	// 4340 7006:iconst_2        
	// 4341 7007:ldc2w           #1263 <Double -1583.4898066999999D>
	// 4342 7010:dastore         
	// 4343 7011:dup             
	// 4344 7012:iconst_3        
	// 4345 7013:ldc2w           #345 <Double 68.407805800000006D>
	// 4346 7016:dastore         
	// 4347 7017:dup             
	// 4348 7018:iconst_4        
	// 4349 7019:ldc2w           #347 <Double 8.1813959000000001D>
	// 4350 7022:dastore         
	// 4351 7023:dup             
	// 4352 7024:iconst_5        
	// 4353 7025:ldc2w           #1265 <Double 0.86442260000000004D>
	// 4354 7028:dastore         
	// 4355 7029:dup             
	// 4356 7030:bipush          6
	// 4357 7032:ldc2w           #1267 <Double 3.4178850999999999D>
	// 4358 7035:dastore         
	// 4359 7036:dup             
	// 4360 7037:bipush          7
	// 4361 7039:ldc2w           #1269 <Double -478.71347050000003D>
	// 4362 7042:dastore         
	// 4363 7043:dup             
	// 4364 7044:bipush          8
	// 4365 7046:ldc2w           #355 <Double -1.1049982D>
	// 4366 7049:dastore         
	// 4367 7050:astore          111
		double ad112[] = {
			17.671063799999999D, 2.2076294999999999D, -1615.6126951000001D, 80.747736000000003D, 7.8897272999999997D, 1.1644226D, 11.0948475D, -693.43925049999996D, -1.2173562D
		};
	// 4368 7052:bipush          9
	// 4369 7054:newarray        double[]
	// 4370 7056:dup             
	// 4371 7057:iconst_0        
	// 4372 7058:ldc2w           #1271 <Double 17.671063799999999D>
	// 4373 7061:dastore         
	// 4374 7062:dup             
	// 4375 7063:iconst_1        
	// 4376 7064:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4377 7067:dastore         
	// 4378 7068:dup             
	// 4379 7069:iconst_2        
	// 4380 7070:ldc2w           #1273 <Double -1615.6126951000001D>
	// 4381 7073:dastore         
	// 4382 7074:dup             
	// 4383 7075:iconst_3        
	// 4384 7076:ldc2w           #79  <Double 80.747736000000003D>
	// 4385 7079:dastore         
	// 4386 7080:dup             
	// 4387 7081:iconst_4        
	// 4388 7082:ldc2w           #81  <Double 7.8897272999999997D>
	// 4389 7085:dastore         
	// 4390 7086:dup             
	// 4391 7087:iconst_5        
	// 4392 7088:ldc2w           #1275 <Double 1.1644226D>
	// 4393 7091:dastore         
	// 4394 7092:dup             
	// 4395 7093:bipush          6
	// 4396 7095:ldc2w           #1277 <Double 11.0948475D>
	// 4397 7098:dastore         
	// 4398 7099:dup             
	// 4399 7100:bipush          7
	// 4400 7102:ldc2w           #1279 <Double -693.43925049999996D>
	// 4401 7105:dastore         
	// 4402 7106:dup             
	// 4403 7107:bipush          8
	// 4404 7109:ldc2w           #89  <Double -1.2173562D>
	// 4405 7112:dastore         
	// 4406 7113:astore          112
		double ad113[] = {
			18.2710638D, 2.2076294999999999D, -1679.8584721D, 110.00047410000001D, 7.0639795000000003D, 1.7644226000000001D, 22.577399199999999D, -1080.4618568000001D, -1.4008494D
		};
	// 4407 7115:bipush          9
	// 4408 7117:newarray        double[]
	// 4409 7119:dup             
	// 4410 7120:iconst_0        
	// 4411 7121:ldc2w           #1281 <Double 18.2710638D>
	// 4412 7124:dastore         
	// 4413 7125:dup             
	// 4414 7126:iconst_1        
	// 4415 7127:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4416 7130:dastore         
	// 4417 7131:dup             
	// 4418 7132:iconst_2        
	// 4419 7133:ldc2w           #1283 <Double -1679.8584721D>
	// 4420 7136:dastore         
	// 4421 7137:dup             
	// 4422 7138:iconst_3        
	// 4423 7139:ldc2w           #111 <Double 110.00047410000001D>
	// 4424 7142:dastore         
	// 4425 7143:dup             
	// 4426 7144:iconst_4        
	// 4427 7145:ldc2w           #113 <Double 7.0639795000000003D>
	// 4428 7148:dastore         
	// 4429 7149:dup             
	// 4430 7150:iconst_5        
	// 4431 7151:ldc2w           #1285 <Double 1.7644226000000001D>
	// 4432 7154:dastore         
	// 4433 7155:dup             
	// 4434 7156:bipush          6
	// 4435 7158:ldc2w           #1287 <Double 22.577399199999999D>
	// 4436 7161:dastore         
	// 4437 7162:dup             
	// 4438 7163:bipush          7
	// 4439 7165:ldc2w           #1289 <Double -1080.4618568000001D>
	// 4440 7168:dastore         
	// 4441 7169:dup             
	// 4442 7170:bipush          8
	// 4443 7172:ldc2w           #121 <Double -1.4008494D>
	// 4444 7175:dastore         
	// 4445 7176:astore          113
		double ad114[] = {
			18.571063800000001D, 2.2076294999999999D, -1711.9813606D, 127.6888198D, 6.4866308999999998D, 2.0644225999999999D, 25.493925099999998D, -1208.8272357000001D, -1.4699811D
		};
	// 4446 7178:bipush          9
	// 4447 7180:newarray        double[]
	// 4448 7182:dup             
	// 4449 7183:iconst_0        
	// 4450 7184:ldc2w           #1291 <Double 18.571063800000001D>
	// 4451 7187:dastore         
	// 4452 7188:dup             
	// 4453 7189:iconst_1        
	// 4454 7190:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4455 7193:dastore         
	// 4456 7194:dup             
	// 4457 7195:iconst_2        
	// 4458 7196:ldc2w           #1293 <Double -1711.9813606D>
	// 4459 7199:dastore         
	// 4460 7200:dup             
	// 4461 7201:iconst_3        
	// 4462 7202:ldc2w           #127 <Double 127.6888198D>
	// 4463 7205:dastore         
	// 4464 7206:dup             
	// 4465 7207:iconst_4        
	// 4466 7208:ldc2w           #129 <Double 6.4866308999999998D>
	// 4467 7211:dastore         
	// 4468 7212:dup             
	// 4469 7213:iconst_5        
	// 4470 7214:ldc2w           #1295 <Double 2.0644225999999999D>
	// 4471 7217:dastore         
	// 4472 7218:dup             
	// 4473 7219:bipush          6
	// 4474 7221:ldc2w           #1297 <Double 25.493925099999998D>
	// 4475 7224:dastore         
	// 4476 7225:dup             
	// 4477 7226:bipush          7
	// 4478 7228:ldc2w           #1299 <Double -1208.8272357000001D>
	// 4479 7231:dastore         
	// 4480 7232:dup             
	// 4481 7233:bipush          8
	// 4482 7235:ldc2w           #137 <Double -1.4699811D>
	// 4483 7238:dastore         
	// 4484 7239:astore          114
		double ad115[] = {
			19.171063799999999D, 2.2076294999999999D, -1776.2271376000001D, 171.99884599999999D, 4.8356763999999997D, 2.6644226D, 24.853796800000001D, -1248.3008046D, -1.5592649999999999D
		};
	// 4485 7241:bipush          9
	// 4486 7243:newarray        double[]
	// 4487 7245:dup             
	// 4488 7246:iconst_0        
	// 4489 7247:ldc2w           #1301 <Double 19.171063799999999D>
	// 4490 7250:dastore         
	// 4491 7251:dup             
	// 4492 7252:iconst_1        
	// 4493 7253:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4494 7256:dastore         
	// 4495 7257:dup             
	// 4496 7258:iconst_2        
	// 4497 7259:ldc2w           #1303 <Double -1776.2271376000001D>
	// 4498 7262:dastore         
	// 4499 7263:dup             
	// 4500 7264:iconst_3        
	// 4501 7265:ldc2w           #143 <Double 171.99884599999999D>
	// 4502 7268:dastore         
	// 4503 7269:dup             
	// 4504 7270:iconst_4        
	// 4505 7271:ldc2w           #145 <Double 4.8356763999999997D>
	// 4506 7274:dastore         
	// 4507 7275:dup             
	// 4508 7276:iconst_5        
	// 4509 7277:ldc2w           #1305 <Double 2.6644226D>
	// 4510 7280:dastore         
	// 4511 7281:dup             
	// 4512 7282:bipush          6
	// 4513 7284:ldc2w           #1307 <Double 24.853796800000001D>
	// 4514 7287:dastore         
	// 4515 7288:dup             
	// 4516 7289:bipush          7
	// 4517 7291:ldc2w           #1309 <Double -1248.3008046D>
	// 4518 7294:dastore         
	// 4519 7295:dup             
	// 4520 7296:bipush          8
	// 4521 7298:ldc2w           #153 <Double -1.5592649999999999D>
	// 4522 7301:dastore         
	// 4523 7302:astore          115
		double ad116[] = {
			19.4710638D, 2.2076294999999999D, -1808.3500260999999D, 200.29154579999999D, 3.6574485999999999D, 2.9644225999999998D, 21.594731599999999D, -1145.9040762D, -1.5784544D
		};
	// 4524 7304:bipush          9
	// 4525 7306:newarray        double[]
	// 4526 7308:dup             
	// 4527 7309:iconst_0        
	// 4528 7310:ldc2w           #1311 <Double 19.4710638D>
	// 4529 7313:dastore         
	// 4530 7314:dup             
	// 4531 7315:iconst_1        
	// 4532 7316:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4533 7319:dastore         
	// 4534 7320:dup             
	// 4535 7321:iconst_2        
	// 4536 7322:ldc2w           #1313 <Double -1808.3500260999999D>
	// 4537 7325:dastore         
	// 4538 7326:dup             
	// 4539 7327:iconst_3        
	// 4540 7328:ldc2w           #265 <Double 200.29154579999999D>
	// 4541 7331:dastore         
	// 4542 7332:dup             
	// 4543 7333:iconst_4        
	// 4544 7334:ldc2w           #267 <Double 3.6574485999999999D>
	// 4545 7337:dastore         
	// 4546 7338:dup             
	// 4547 7339:iconst_5        
	// 4548 7340:ldc2w           #1315 <Double 2.9644225999999998D>
	// 4549 7343:dastore         
	// 4550 7344:dup             
	// 4551 7345:bipush          6
	// 4552 7347:ldc2w           #1317 <Double 21.594731599999999D>
	// 4553 7350:dastore         
	// 4554 7351:dup             
	// 4555 7352:bipush          7
	// 4556 7354:ldc2w           #1319 <Double -1145.9040762D>
	// 4557 7357:dastore         
	// 4558 7358:dup             
	// 4559 7359:bipush          8
	// 4560 7361:ldc2w           #275 <Double -1.5784544D>
	// 4561 7364:dastore         
	// 4562 7365:astore          116
		double ad117[] = {
			19.7710638D, 2.2076294999999999D, -1840.4729146D, 234.27778710000001D, 2.1401053000000001D, 3.2644226000000001D, 16.8971315D, -969.59204250000005D, -1.5803442000000001D
		};
	// 4563 7367:bipush          9
	// 4564 7369:newarray        double[]
	// 4565 7371:dup             
	// 4566 7372:iconst_0        
	// 4567 7373:ldc2w           #1321 <Double 19.7710638D>
	// 4568 7376:dastore         
	// 4569 7377:dup             
	// 4570 7378:iconst_1        
	// 4571 7379:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4572 7382:dastore         
	// 4573 7383:dup             
	// 4574 7384:iconst_2        
	// 4575 7385:ldc2w           #1323 <Double -1840.4729146D>
	// 4576 7388:dastore         
	// 4577 7389:dup             
	// 4578 7390:iconst_3        
	// 4579 7391:ldc2w           #159 <Double 234.27778710000001D>
	// 4580 7394:dastore         
	// 4581 7395:dup             
	// 4582 7396:iconst_4        
	// 4583 7397:ldc2w           #161 <Double 2.1401053000000001D>
	// 4584 7400:dastore         
	// 4585 7401:dup             
	// 4586 7402:iconst_5        
	// 4587 7403:ldc2w           #1325 <Double 3.2644226000000001D>
	// 4588 7406:dastore         
	// 4589 7407:dup             
	// 4590 7408:bipush          6
	// 4591 7410:ldc2w           #1327 <Double 16.8971315D>
	// 4592 7413:dastore         
	// 4593 7414:dup             
	// 4594 7415:bipush          7
	// 4595 7417:ldc2w           #1329 <Double -969.59204250000005D>
	// 4596 7420:dastore         
	// 4597 7421:dup             
	// 4598 7422:bipush          8
	// 4599 7424:ldc2w           #169 <Double -1.5803442000000001D>
	// 4600 7427:dastore         
	// 4601 7428:astore          117
		double ad118[] = {
			20.071063800000001D, 2.2076294999999999D, -1872.5958031D, 275.7268449D, 0.1651599D, 3.5644225999999999D, 11.338294700000001D, -738.23986849999994D, -1.5649227999999999D
		};
	// 4602 7430:bipush          9
	// 4603 7432:newarray        double[]
	// 4604 7434:dup             
	// 4605 7435:iconst_0        
	// 4606 7436:ldc2w           #1331 <Double 20.071063800000001D>
	// 4607 7439:dastore         
	// 4608 7440:dup             
	// 4609 7441:iconst_1        
	// 4610 7442:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4611 7445:dastore         
	// 4612 7446:dup             
	// 4613 7447:iconst_2        
	// 4614 7448:ldc2w           #1333 <Double -1872.5958031D>
	// 4615 7451:dastore         
	// 4616 7452:dup             
	// 4617 7453:iconst_3        
	// 4618 7454:ldc2w           #175 <Double 275.7268449D>
	// 4619 7457:dastore         
	// 4620 7458:dup             
	// 4621 7459:iconst_4        
	// 4622 7460:ldc2w           #177 <Double 0.1651599D>
	// 4623 7463:dastore         
	// 4624 7464:dup             
	// 4625 7465:iconst_5        
	// 4626 7466:ldc2w           #1335 <Double 3.5644225999999999D>
	// 4627 7469:dastore         
	// 4628 7470:dup             
	// 4629 7471:bipush          6
	// 4630 7473:ldc2w           #1337 <Double 11.338294700000001D>
	// 4631 7476:dastore         
	// 4632 7477:dup             
	// 4633 7478:bipush          7
	// 4634 7480:ldc2w           #1339 <Double -738.23986849999994D>
	// 4635 7483:dastore         
	// 4636 7484:dup             
	// 4637 7485:bipush          8
	// 4638 7487:ldc2w           #185 <Double -1.5649227999999999D>
	// 4639 7490:dastore         
	// 4640 7491:astore          118
		double ad119[] = {
			20.671063799999999D, 2.2076294999999999D, -1936.8415801000001D, 392.10647540000002D, -5.9244687000000003D, 4.1644226D, 0.30286079999999999D, -230.737998D, -1.4830451D
		};
	// 4641 7493:bipush          9
	// 4642 7495:newarray        double[]
	// 4643 7497:dup             
	// 4644 7498:iconst_0        
	// 4645 7499:ldc2w           #1341 <Double 20.671063799999999D>
	// 4646 7502:dastore         
	// 4647 7503:dup             
	// 4648 7504:iconst_1        
	// 4649 7505:ldc2w           #1241 <Double 2.2076294999999999D>
	// 4650 7508:dastore         
	// 4651 7509:dup             
	// 4652 7510:iconst_2        
	// 4653 7511:ldc2w           #1343 <Double -1936.8415801000001D>
	// 4654 7514:dastore         
	// 4655 7515:dup             
	// 4656 7516:iconst_3        
	// 4657 7517:ldc2w           #191 <Double 392.10647540000002D>
	// 4658 7520:dastore         
	// 4659 7521:dup             
	// 4660 7522:iconst_4        
	// 4661 7523:ldc2w           #193 <Double -5.9244687000000003D>
	// 4662 7526:dastore         
	// 4663 7527:dup             
	// 4664 7528:iconst_5        
	// 4665 7529:ldc2w           #1345 <Double 4.1644226D>
	// 4666 7532:dastore         
	// 4667 7533:dup             
	// 4668 7534:bipush          6
	// 4669 7536:ldc2w           #1347 <Double 0.30286079999999999D>
	// 4670 7539:dastore         
	// 4671 7540:dup             
	// 4672 7541:bipush          7
	// 4673 7543:ldc2w           #1349 <Double -230.737998D>
	// 4674 7546:dastore         
	// 4675 7547:dup             
	// 4676 7548:bipush          8
	// 4677 7550:ldc2w           #201 <Double -1.4830451D>
	// 4678 7553:dastore         
	// 4679 7554:astore          119
		double ad120[] = {
			11.013004499999999D, 2.3359621000000002D, -877.67167619999998D, 3.0597946D, 8.9830009000000004D, -1.2424793000000001D, -30.079189199999998D, 275.29698309999998D, -0.062199999999999998D
		};
	// 4680 7556:bipush          9
	// 4681 7558:newarray        double[]
	// 4682 7560:dup             
	// 4683 7561:iconst_0        
	// 4684 7562:ldc2w           #1351 <Double 11.013004499999999D>
	// 4685 7565:dastore         
	// 4686 7566:dup             
	// 4687 7567:iconst_1        
	// 4688 7568:ldc2w           #1353 <Double 2.3359621000000002D>
	// 4689 7571:dastore         
	// 4690 7572:dup             
	// 4691 7573:iconst_2        
	// 4692 7574:ldc2w           #1355 <Double -877.67167619999998D>
	// 4693 7577:dastore         
	// 4694 7578:dup             
	// 4695 7579:iconst_3        
	// 4696 7580:ldc2w           #209 <Double 3.0597946D>
	// 4697 7583:dastore         
	// 4698 7584:dup             
	// 4699 7585:iconst_4        
	// 4700 7586:ldc2w           #211 <Double 8.9830009000000004D>
	// 4701 7589:dastore         
	// 4702 7590:dup             
	// 4703 7591:iconst_5        
	// 4704 7592:ldc2w           #1357 <Double -1.2424793000000001D>
	// 4705 7595:dastore         
	// 4706 7596:dup             
	// 4707 7597:bipush          6
	// 4708 7599:ldc2w           #1359 <Double -30.079189199999998D>
	// 4709 7602:dastore         
	// 4710 7603:dup             
	// 4711 7604:bipush          7
	// 4712 7606:ldc2w           #1361 <Double 275.29698309999998D>
	// 4713 7609:dastore         
	// 4714 7610:dup             
	// 4715 7611:bipush          8
	// 4716 7613:ldc2w           #219 <Double -0.062199999999999998D>
	// 4717 7616:dastore         
	// 4718 7617:astore          120
		double ad121[] = {
			11.3130045D, 2.3359621000000002D, -910.17956249999997D, 11.2644424D, 8.9614528999999994D, -0.94247930000000002D, -30.5957151D, 242.07195580000001D, -0.22733419999999999D
		};
	// 4719 7619:bipush          9
	// 4720 7621:newarray        double[]
	// 4721 7623:dup             
	// 4722 7624:iconst_0        
	// 4723 7625:ldc2w           #1363 <Double 11.3130045D>
	// 4724 7628:dastore         
	// 4725 7629:dup             
	// 4726 7630:iconst_1        
	// 4727 7631:ldc2w           #1353 <Double 2.3359621000000002D>
	// 4728 7634:dastore         
	// 4729 7635:dup             
	// 4730 7636:iconst_2        
	// 4731 7637:ldc2w           #1365 <Double -910.17956249999997D>
	// 4732 7640:dastore         
	// 4733 7641:dup             
	// 4734 7642:iconst_3        
	// 4735 7643:ldc2w           #319 <Double 11.2644424D>
	// 4736 7646:dastore         
	// 4737 7647:dup             
	// 4738 7648:iconst_4        
	// 4739 7649:ldc2w           #321 <Double 8.9614528999999994D>
	// 4740 7652:dastore         
	// 4741 7653:dup             
	// 4742 7654:iconst_5        
	// 4743 7655:ldc2w           #1367 <Double -0.94247930000000002D>
	// 4744 7658:dastore         
	// 4745 7659:dup             
	// 4746 7660:bipush          6
	// 4747 7662:ldc2w           #1369 <Double -30.5957151D>
	// 4748 7665:dastore         
	// 4749 7666:dup             
	// 4750 7667:bipush          7
	// 4751 7669:ldc2w           #1371 <Double 242.07195580000001D>
	// 4752 7672:dastore         
	// 4753 7673:dup             
	// 4754 7674:bipush          8
	// 4755 7676:ldc2w           #329 <Double -0.22733419999999999D>
	// 4756 7679:dastore         
	// 4757 7680:astore          121
		double ad122[] = {
			11.613004500000001D, 2.3359621000000002D, -942.68744890000005D, 19.625597299999999D, 8.9143979000000009D, -0.64247929999999998D, -28.939632799999998D, 198.1687076D, -0.38996530000000001D
		};
	// 4758 7682:bipush          9
	// 4759 7684:newarray        double[]
	// 4760 7686:dup             
	// 4761 7687:iconst_0        
	// 4762 7688:ldc2w           #1373 <Double 11.613004500000001D>
	// 4763 7691:dastore         
	// 4764 7692:dup             
	// 4765 7693:iconst_1        
	// 4766 7694:ldc2w           #1353 <Double 2.3359621000000002D>
	// 4767 7697:dastore         
	// 4768 7698:dup             
	// 4769 7699:iconst_2        
	// 4770 7700:ldc2w           #1375 <Double -942.68744890000005D>
	// 4771 7703:dastore         
	// 4772 7704:dup             
	// 4773 7705:iconst_3        
	// 4774 7706:ldc2w           #15  <Double 19.625597299999999D>
	// 4775 7709:dastore         
	// 4776 7710:dup             
	// 4777 7711:iconst_4        
	// 4778 7712:ldc2w           #17  <Double 8.9143979000000009D>
	// 4779 7715:dastore         
	// 4780 7716:dup             
	// 4781 7717:iconst_5        
	// 4782 7718:ldc2w           #1377 <Double -0.64247929999999998D>
	// 4783 7721:dastore         
	// 4784 7722:dup             
	// 4785 7723:bipush          6
	// 4786 7725:ldc2w           #1379 <Double -28.939632799999998D>
	// 4787 7728:dastore         
	// 4788 7729:dup             
	// 4789 7730:bipush          7
	// 4790 7732:ldc2w           #1381 <Double 198.1687076D>
	// 4791 7735:dastore         
	// 4792 7736:dup             
	// 4793 7737:bipush          8
	// 4794 7739:ldc2w           #25  <Double -0.38996530000000001D>
	// 4795 7742:dastore         
	// 4796 7743:astore          122
		double ad123[] = {
			12.2130045D, 2.3359621000000002D, -1007.7032215D, 37.305238799999998D, 8.7346948999999992D, -0.042479299999999998D, -19.496521600000001D, 30.640712400000002D, -0.70060560000000005D
		};
	// 4797 7745:bipush          9
	// 4798 7747:newarray        double[]
	// 4799 7749:dup             
	// 4800 7750:iconst_0        
	// 4801 7751:ldc2w           #1383 <Double 12.2130045D>
	// 4802 7754:dastore         
	// 4803 7755:dup             
	// 4804 7756:iconst_1        
	// 4805 7757:ldc2w           #1353 <Double 2.3359621000000002D>
	// 4806 7760:dastore         
	// 4807 7761:dup             
	// 4808 7762:iconst_2        
	// 4809 7763:ldc2w           #1385 <Double -1007.7032215D>
	// 4810 7766:dastore         
	// 4811 7767:dup             
	// 4812 7768:iconst_3        
	// 4813 7769:ldc2w           #47  <Double 37.305238799999998D>
	// 4814 7772:dastore         
	// 4815 7773:dup             
	// 4816 7774:iconst_4        
	// 4817 7775:ldc2w           #49  <Double 8.7346948999999992D>
	// 4818 7778:dastore         
	// 4819 7779:dup             
	// 4820 7780:iconst_5        
	// 4821 7781:ldc2w           #1387 <Double -0.042479299999999998D>
	// 4822 7784:dastore         
	// 4823 7785:dup             
	// 4824 7786:bipush          6
	// 4825 7788:ldc2w           #1389 <Double -19.496521600000001D>
	// 4826 7791:dastore         
	// 4827 7792:dup             
	// 4828 7793:bipush          7
	// 4829 7795:ldc2w           #1391 <Double 30.640712400000002D>
	// 4830 7798:dastore         
	// 4831 7799:dup             
	// 4832 7800:bipush          8
	// 4833 7802:ldc2w           #57  <Double -0.70060560000000005D>
	// 4834 7805:dastore         
	// 4835 7806:astore          123
		double ad124[] = {
			12.513004499999999D, 2.3359621000000002D, -1040.2111078999999D, 46.896400399999997D, 8.5943556999999995D, 0.25752069999999999D, -12.398921400000001D, -107.6379481D, -0.84519750000000005D
		};
	// 4836 7808:bipush          9
	// 4837 7810:newarray        double[]
	// 4838 7812:dup             
	// 4839 7813:iconst_0        
	// 4840 7814:ldc2w           #1393 <Double 12.513004499999999D>
	// 4841 7817:dastore         
	// 4842 7818:dup             
	// 4843 7819:iconst_1        
	// 4844 7820:ldc2w           #1353 <Double 2.3359621000000002D>
	// 4845 7823:dastore         
	// 4846 7824:dup             
	// 4847 7825:iconst_2        
	// 4848 7826:ldc2w           #1395 <Double -1040.2111078999999D>
	// 4849 7829:dastore         
	// 4850 7830:dup             
	// 4851 7831:iconst_3        
	// 4852 7832:ldc2w           #541 <Double 46.896400399999997D>
	// 4853 7835:dastore         
	// 4854 7836:dup             
	// 4855 7837:iconst_4        
	// 4856 7838:ldc2w           #543 <Double 8.5943556999999995D>
	// 4857 7841:dastore         
	// 4858 7842:dup             
	// 4859 7843:iconst_5        
	// 4860 7844:ldc2w           #1397 <Double 0.25752069999999999D>
	// 4861 7847:dastore         
	// 4862 7848:dup             
	// 4863 7849:bipush          6
	// 4864 7851:ldc2w           #1399 <Double -12.398921400000001D>
	// 4865 7854:dastore         
	// 4866 7855:dup             
	// 4867 7856:bipush          7
	// 4868 7858:ldc2w           #1401 <Double -107.6379481D>
	// 4869 7861:dastore         
	// 4870 7862:dup             
	// 4871 7863:bipush          8
	// 4872 7865:ldc2w           #551 <Double -0.84519750000000005D>
	// 4873 7868:dastore         
	// 4874 7869:astore          124
		double ad125[] = {
			14.613004500000001D, 2.3359621000000002D, -1267.7663121999999D, 148.1152635D, 5.7586041999999997D, 2.3575206999999998D, 26.538344500000001D, -1279.2506811000001D, -1.5229775000000001D
		};
	// 4875 7871:bipush          9
	// 4876 7873:newarray        double[]
	// 4877 7875:dup             
	// 4878 7876:iconst_0        
	// 4879 7877:ldc2w           #1403 <Double 14.613004500000001D>
	// 4880 7880:dastore         
	// 4881 7881:dup             
	// 4882 7882:iconst_1        
	// 4883 7883:ldc2w           #1353 <Double 2.3359621000000002D>
	// 4884 7886:dastore         
	// 4885 7887:dup             
	// 4886 7888:iconst_2        
	// 4887 7889:ldc2w           #1405 <Double -1267.7663121999999D>
	// 4888 7892:dastore         
	// 4889 7893:dup             
	// 4890 7894:iconst_3        
	// 4891 7895:ldc2w           #463 <Double 148.1152635D>
	// 4892 7898:dastore         
	// 4893 7899:dup             
	// 4894 7900:iconst_4        
	// 4895 7901:ldc2w           #465 <Double 5.7586041999999997D>
	// 4896 7904:dastore         
	// 4897 7905:dup             
	// 4898 7906:iconst_5        
	// 4899 7907:ldc2w           #1407 <Double 2.3575206999999998D>
	// 4900 7910:dastore         
	// 4901 7911:dup             
	// 4902 7912:bipush          6
	// 4903 7914:ldc2w           #1409 <Double 26.538344500000001D>
	// 4904 7917:dastore         
	// 4905 7918:dup             
	// 4906 7919:bipush          7
	// 4907 7921:ldc2w           #1411 <Double -1279.2506811000001D>
	// 4908 7924:dastore         
	// 4909 7925:dup             
	// 4910 7926:bipush          8
	// 4911 7928:ldc2w           #473 <Double -1.5229775000000001D>
	// 4912 7931:dastore         
	// 4913 7932:astore          125
		double ad126[] = {
			15.2130045D, 2.3359621000000002D, -1332.7820849D, 200.29154579999999D, 3.6574485999999999D, 2.9575206999999999D, 21.895233300000001D, -1158.4216196D, -1.5784544D
		};
	// 4914 7934:bipush          9
	// 4915 7936:newarray        double[]
	// 4916 7938:dup             
	// 4917 7939:iconst_0        
	// 4918 7940:ldc2w           #1413 <Double 15.2130045D>
	// 4919 7943:dastore         
	// 4920 7944:dup             
	// 4921 7945:iconst_1        
	// 4922 7946:ldc2w           #1353 <Double 2.3359621000000002D>
	// 4923 7949:dastore         
	// 4924 7950:dup             
	// 4925 7951:iconst_2        
	// 4926 7952:ldc2w           #1415 <Double -1332.7820849D>
	// 4927 7955:dastore         
	// 4928 7956:dup             
	// 4929 7957:iconst_3        
	// 4930 7958:ldc2w           #265 <Double 200.29154579999999D>
	// 4931 7961:dastore         
	// 4932 7962:dup             
	// 4933 7963:iconst_4        
	// 4934 7964:ldc2w           #267 <Double 3.6574485999999999D>
	// 4935 7967:dastore         
	// 4936 7968:dup             
	// 4937 7969:iconst_5        
	// 4938 7970:ldc2w           #1417 <Double 2.9575206999999999D>
	// 4939 7973:dastore         
	// 4940 7974:dup             
	// 4941 7975:bipush          6
	// 4942 7977:ldc2w           #1419 <Double 21.895233300000001D>
	// 4943 7980:dastore         
	// 4944 7981:dup             
	// 4945 7982:bipush          7
	// 4946 7984:ldc2w           #1421 <Double -1158.4216196D>
	// 4947 7987:dastore         
	// 4948 7988:dup             
	// 4949 7989:bipush          8
	// 4950 7991:ldc2w           #275 <Double -1.5784544D>
	// 4951 7994:dastore         
	// 4952 7995:astore          126
		double ad127[] = {
			16.113004499999999D, 2.3359621000000002D, -1430.3057438999999D, 327.13300479999998D, -2.4385346000000001D, 3.8575206999999998D, 5.8803248999999997D, -495.40158500000001D, -1.5323681D
		};
	// 4953 7997:bipush          9
	// 4954 7999:newarray        double[]
	// 4955 8001:dup             
	// 4956 8002:iconst_0        
	// 4957 8003:ldc2w           #1423 <Double 16.113004499999999D>
	// 4958 8006:dastore         
	// 4959 8007:dup             
	// 4960 8008:iconst_1        
	// 4961 8009:ldc2w           #1353 <Double 2.3359621000000002D>
	// 4962 8012:dastore         
	// 4963 8013:dup             
	// 4964 8014:iconst_2        
	// 4965 8015:ldc2w           #1425 <Double -1430.3057438999999D>
	// 4966 8018:dastore         
	// 4967 8019:dup             
	// 4968 8020:iconst_3        
	// 4969 8021:ldc2w           #291 <Double 327.13300479999998D>
	// 4970 8024:dastore         
	// 4971 8025:dup             
	// 4972 8026:iconst_4        
	// 4973 8027:ldc2w           #293 <Double -2.4385346000000001D>
	// 4974 8030:dastore         
	// 4975 8031:dup             
	// 4976 8032:iconst_5        
	// 4977 8033:ldc2w           #1427 <Double 3.8575206999999998D>
	// 4978 8036:dastore         
	// 4979 8037:dup             
	// 4980 8038:bipush          6
	// 4981 8040:ldc2w           #1429 <Double 5.8803248999999997D>
	// 4982 8043:dastore         
	// 4983 8044:dup             
	// 4984 8045:bipush          7
	// 4985 8047:ldc2w           #1431 <Double -495.40158500000001D>
	// 4986 8050:dastore         
	// 4987 8051:dup             
	// 4988 8052:bipush          8
	// 4989 8054:ldc2w           #301 <Double -1.5323681D>
	// 4990 8057:dastore         
	// 4991 8058:astore          127
		double ad128[] = {
			5.6431513999999998D, 2.5315694D, -255.15657139999999D, 3.0597946D, 8.9830009000000004D, -1.2466774D, -29.7789708D, 275.10836360000002D, -0.062199999999999998D
		};
	// 4992 8060:bipush          9
	// 4993 8062:newarray        double[]
	// 4994 8064:dup             
	// 4995 8065:iconst_0        
	// 4996 8066:ldc2w           #1433 <Double 5.6431513999999998D>
	// 4997 8069:dastore         
	// 4998 8070:dup             
	// 4999 8071:iconst_1        
	// 5000 8072:ldc2w           #1435 <Double 2.5315694D>
	// 5001 8075:dastore         
	// 5002 8076:dup             
	// 5003 8077:iconst_2        
	// 5004 8078:ldc2w           #1437 <Double -255.15657139999999D>
	// 5005 8081:dastore         
	// 5006 8082:dup             
	// 5007 8083:iconst_3        
	// 5008 8084:ldc2w           #209 <Double 3.0597946D>
	// 5009 8087:dastore         
	// 5010 8088:dup             
	// 5011 8089:iconst_4        
	// 5012 8090:ldc2w           #211 <Double 8.9830009000000004D>
	// 5013 8093:dastore         
	// 5014 8094:dup             
	// 5015 8095:iconst_5        
	// 5016 8096:ldc2w           #1439 <Double -1.2466774D>
	// 5017 8099:dastore         
	// 5018 8100:dup             
	// 5019 8101:bipush          6
	// 5020 8103:ldc2w           #1441 <Double -29.7789708D>
	// 5021 8106:dastore         
	// 5022 8107:dup             
	// 5023 8108:bipush          7
	// 5024 8110:ldc2w           #1443 <Double 275.10836360000002D>
	// 5025 8113:dastore         
	// 5026 8114:dup             
	// 5027 8115:bipush          8
	// 5028 8117:ldc2w           #219 <Double -0.062199999999999998D>
	// 5029 8120:dastore         
	// 5030 8121:astore          128
		double ad129[] = {
			7.1431513999999998D, 2.5315694D, -420.630112D, 46.896400399999997D, 8.5943556999999995D, 0.25332260000000001D, -12.098703D, -112.32984380000001D, -0.84519750000000005D
		};
	// 5031 8123:bipush          9
	// 5032 8125:newarray        double[]
	// 5033 8127:dup             
	// 5034 8128:iconst_0        
	// 5035 8129:ldc2w           #1445 <Double 7.1431513999999998D>
	// 5036 8132:dastore         
	// 5037 8133:dup             
	// 5038 8134:iconst_1        
	// 5039 8135:ldc2w           #1435 <Double 2.5315694D>
	// 5040 8138:dastore         
	// 5041 8139:dup             
	// 5042 8140:iconst_2        
	// 5043 8141:ldc2w           #1447 <Double -420.630112D>
	// 5044 8144:dastore         
	// 5045 8145:dup             
	// 5046 8146:iconst_3        
	// 5047 8147:ldc2w           #541 <Double 46.896400399999997D>
	// 5048 8150:dastore         
	// 5049 8151:dup             
	// 5050 8152:iconst_4        
	// 5051 8153:ldc2w           #543 <Double 8.5943556999999995D>
	// 5052 8156:dastore         
	// 5053 8157:dup             
	// 5054 8158:iconst_5        
	// 5055 8159:ldc2w           #1449 <Double 0.25332260000000001D>
	// 5056 8162:dastore         
	// 5057 8163:dup             
	// 5058 8164:bipush          6
	// 5059 8166:ldc2w           #1451 <Double -12.098703D>
	// 5060 8169:dastore         
	// 5061 8170:dup             
	// 5062 8171:bipush          7
	// 5063 8173:ldc2w           #1453 <Double -112.32984380000001D>
	// 5064 8176:dastore         
	// 5065 8177:dup             
	// 5066 8178:bipush          8
	// 5067 8180:ldc2w           #551 <Double -0.84519750000000005D>
	// 5068 8183:dastore         
	// 5069 8184:astore          129
		double ad130[] = {
			7.4431513999999996D, 2.5315694D, -453.72482009999999D, 57.2001287D, 8.4126647000000006D, 0.5533226D, -4.1398662000000002D, -287.91219910000001D, -0.98049019999999998D
		};
	// 5070 8186:bipush          9
	// 5071 8188:newarray        double[]
	// 5072 8190:dup             
	// 5073 8191:iconst_0        
	// 5074 8192:ldc2w           #1455 <Double 7.4431513999999996D>
	// 5075 8195:dastore         
	// 5076 8196:dup             
	// 5077 8197:iconst_1        
	// 5078 8198:ldc2w           #1435 <Double 2.5315694D>
	// 5079 8201:dastore         
	// 5080 8202:dup             
	// 5081 8203:iconst_2        
	// 5082 8204:ldc2w           #1457 <Double -453.72482009999999D>
	// 5083 8207:dastore         
	// 5084 8208:dup             
	// 5085 8209:iconst_3        
	// 5086 8210:ldc2w           #63  <Double 57.2001287D>
	// 5087 8213:dastore         
	// 5088 8214:dup             
	// 5089 8215:iconst_4        
	// 5090 8216:ldc2w           #65  <Double 8.4126647000000006D>
	// 5091 8219:dastore         
	// 5092 8220:dup             
	// 5093 8221:iconst_5        
	// 5094 8222:ldc2w           #1459 <Double 0.5533226D>
	// 5095 8225:dastore         
	// 5096 8226:dup             
	// 5097 8227:bipush          6
	// 5098 8229:ldc2w           #1461 <Double -4.1398662000000002D>
	// 5099 8232:dastore         
	// 5100 8233:dup             
	// 5101 8234:bipush          7
	// 5102 8236:ldc2w           #1463 <Double -287.91219910000001D>
	// 5103 8239:dastore         
	// 5104 8240:dup             
	// 5105 8241:bipush          8
	// 5106 8243:ldc2w           #73  <Double -0.98049019999999998D>
	// 5107 8246:dastore         
	// 5108 8247:astore          130
		double ad131[] = {
			8.3431514D, 2.5315694D, -553.00894449999998D, 94.497482399999996D, 7.5234689000000001D, 1.4533225999999999D, 18.2570108D, -917.73515850000001D, -1.3163339000000001D
		};
	// 5109 8249:bipush          9
	// 5110 8251:newarray        double[]
	// 5111 8253:dup             
	// 5112 8254:iconst_0        
	// 5113 8255:ldc2w           #1465 <Double 8.3431514D>
	// 5114 8258:dastore         
	// 5115 8259:dup             
	// 5116 8260:iconst_1        
	// 5117 8261:ldc2w           #1435 <Double 2.5315694D>
	// 5118 8264:dastore         
	// 5119 8265:dup             
	// 5120 8266:iconst_2        
	// 5121 8267:ldc2w           #1467 <Double -553.00894449999998D>
	// 5122 8270:dastore         
	// 5123 8271:dup             
	// 5124 8272:iconst_3        
	// 5125 8273:ldc2w           #95  <Double 94.497482399999996D>
	// 5126 8276:dastore         
	// 5127 8277:dup             
	// 5128 8278:iconst_4        
	// 5129 8279:ldc2w           #97  <Double 7.5234689000000001D>
	// 5130 8282:dastore         
	// 5131 8283:dup             
	// 5132 8284:iconst_5        
	// 5133 8285:ldc2w           #1469 <Double 1.4533225999999999D>
	// 5134 8288:dastore         
	// 5135 8289:dup             
	// 5136 8290:bipush          6
	// 5137 8292:ldc2w           #1471 <Double 18.2570108D>
	// 5138 8295:dastore         
	// 5139 8296:dup             
	// 5140 8297:bipush          7
	// 5141 8299:ldc2w           #1473 <Double -917.73515850000001D>
	// 5142 8302:dastore         
	// 5143 8303:dup             
	// 5144 8304:bipush          8
	// 5145 8306:ldc2w           #105 <Double -1.3163339000000001D>
	// 5146 8309:dastore         
	// 5147 8310:astore          131
		double ad132[] = {
			8.9431513999999996D, 2.5315694D, -619.19836069999997D, 127.6888198D, 6.4866308999999998D, 2.0533226D, 26.0946453D, -1228.7360908000001D, -1.4699811D
		};
	// 5148 8312:bipush          9
	// 5149 8314:newarray        double[]
	// 5150 8316:dup             
	// 5151 8317:iconst_0        
	// 5152 8318:ldc2w           #1475 <Double 8.9431513999999996D>
	// 5153 8321:dastore         
	// 5154 8322:dup             
	// 5155 8323:iconst_1        
	// 5156 8324:ldc2w           #1435 <Double 2.5315694D>
	// 5157 8327:dastore         
	// 5158 8328:dup             
	// 5159 8329:iconst_2        
	// 5160 8330:ldc2w           #1477 <Double -619.19836069999997D>
	// 5161 8333:dastore         
	// 5162 8334:dup             
	// 5163 8335:iconst_3        
	// 5164 8336:ldc2w           #127 <Double 127.6888198D>
	// 5165 8339:dastore         
	// 5166 8340:dup             
	// 5167 8341:iconst_4        
	// 5168 8342:ldc2w           #129 <Double 6.4866308999999998D>
	// 5169 8345:dastore         
	// 5170 8346:dup             
	// 5171 8347:iconst_5        
	// 5172 8348:ldc2w           #1479 <Double 2.0533226D>
	// 5173 8351:dastore         
	// 5174 8352:dup             
	// 5175 8353:bipush          6
	// 5176 8355:ldc2w           #1481 <Double 26.0946453D>
	// 5177 8358:dastore         
	// 5178 8359:dup             
	// 5179 8360:bipush          7
	// 5180 8362:ldc2w           #1483 <Double -1228.7360908000001D>
	// 5181 8365:dastore         
	// 5182 8366:dup             
	// 5183 8367:bipush          8
	// 5184 8369:ldc2w           #137 <Double -1.4699811D>
	// 5185 8372:dastore         
	// 5186 8373:astore          132
		double ad133[] = {
			10.143151400000001D, 2.5315694D, -751.57719320000001D, 234.27778710000001D, 2.1401053000000001D, 3.2533226000000002D, 17.497851600000001D, -996.70953950000001D, -1.5803442000000001D
		};
	// 5187 8375:bipush          9
	// 5188 8377:newarray        double[]
	// 5189 8379:dup             
	// 5190 8380:iconst_0        
	// 5191 8381:ldc2w           #1485 <Double 10.143151400000001D>
	// 5192 8384:dastore         
	// 5193 8385:dup             
	// 5194 8386:iconst_1        
	// 5195 8387:ldc2w           #1435 <Double 2.5315694D>
	// 5196 8390:dastore         
	// 5197 8391:dup             
	// 5198 8392:iconst_2        
	// 5199 8393:ldc2w           #1487 <Double -751.57719320000001D>
	// 5200 8396:dastore         
	// 5201 8397:dup             
	// 5202 8398:iconst_3        
	// 5203 8399:ldc2w           #159 <Double 234.27778710000001D>
	// 5204 8402:dastore         
	// 5205 8403:dup             
	// 5206 8404:iconst_4        
	// 5207 8405:ldc2w           #161 <Double 2.1401053000000001D>
	// 5208 8408:dastore         
	// 5209 8409:dup             
	// 5210 8410:iconst_5        
	// 5211 8411:ldc2w           #1489 <Double 3.2533226000000002D>
	// 5212 8414:dastore         
	// 5213 8415:dup             
	// 5214 8416:bipush          6
	// 5215 8418:ldc2w           #1491 <Double 17.497851600000001D>
	// 5216 8421:dastore         
	// 5217 8422:dup             
	// 5218 8423:bipush          7
	// 5219 8425:ldc2w           #1493 <Double -996.70953950000001D>
	// 5220 8428:dastore         
	// 5221 8429:dup             
	// 5222 8430:bipush          8
	// 5223 8432:ldc2w           #169 <Double -1.5803442000000001D>
	// 5224 8435:dastore         
	// 5225 8436:astore          133
		double ad134[] = {
			10.4431514D, 2.5315694D, -784.67190129999994D, 275.7268449D, 0.1651599D, 3.5533226D, 11.939014800000001D, -767.15952609999999D, -1.5649227999999999D
		};
	// 5226 8438:bipush          9
	// 5227 8440:newarray        double[]
	// 5228 8442:dup             
	// 5229 8443:iconst_0        
	// 5230 8444:ldc2w           #1495 <Double 10.4431514D>
	// 5231 8447:dastore         
	// 5232 8448:dup             
	// 5233 8449:iconst_1        
	// 5234 8450:ldc2w           #1435 <Double 2.5315694D>
	// 5235 8453:dastore         
	// 5236 8454:dup             
	// 5237 8455:iconst_2        
	// 5238 8456:ldc2w           #1497 <Double -784.67190129999994D>
	// 5239 8459:dastore         
	// 5240 8460:dup             
	// 5241 8461:iconst_3        
	// 5242 8462:ldc2w           #175 <Double 275.7268449D>
	// 5243 8465:dastore         
	// 5244 8466:dup             
	// 5245 8467:iconst_4        
	// 5246 8468:ldc2w           #177 <Double 0.1651599D>
	// 5247 8471:dastore         
	// 5248 8472:dup             
	// 5249 8473:iconst_5        
	// 5250 8474:ldc2w           #1499 <Double 3.5533226D>
	// 5251 8477:dastore         
	// 5252 8478:dup             
	// 5253 8479:bipush          6
	// 5254 8481:ldc2w           #1501 <Double 11.939014800000001D>
	// 5255 8484:dastore         
	// 5256 8485:dup             
	// 5257 8486:bipush          7
	// 5258 8488:ldc2w           #1503 <Double -767.15952609999999D>
	// 5259 8491:dastore         
	// 5260 8492:dup             
	// 5261 8493:bipush          8
	// 5262 8495:ldc2w           #185 <Double -1.5649227999999999D>
	// 5263 8498:dastore         
	// 5264 8499:astore          134
		double ad135[] = {
			10.7431514D, 2.5315694D, -817.76660939999999D, 327.13300479999998D, -2.4385346000000001D, 3.8533225999999998D, 6.1805434000000004D, -510.90134399999999D, -1.5323681D
		};
	// 5265 8501:bipush          9
	// 5266 8503:newarray        double[]
	// 5267 8505:dup             
	// 5268 8506:iconst_0        
	// 5269 8507:ldc2w           #1505 <Double 10.7431514D>
	// 5270 8510:dastore         
	// 5271 8511:dup             
	// 5272 8512:iconst_1        
	// 5273 8513:ldc2w           #1435 <Double 2.5315694D>
	// 5274 8516:dastore         
	// 5275 8517:dup             
	// 5276 8518:iconst_2        
	// 5277 8519:ldc2w           #1507 <Double -817.76660939999999D>
	// 5278 8522:dastore         
	// 5279 8523:dup             
	// 5280 8524:iconst_3        
	// 5281 8525:ldc2w           #291 <Double 327.13300479999998D>
	// 5282 8528:dastore         
	// 5283 8529:dup             
	// 5284 8530:iconst_4        
	// 5285 8531:ldc2w           #293 <Double -2.4385346000000001D>
	// 5286 8534:dastore         
	// 5287 8535:dup             
	// 5288 8536:iconst_5        
	// 5289 8537:ldc2w           #1509 <Double 3.8533225999999998D>
	// 5290 8540:dastore         
	// 5291 8541:dup             
	// 5292 8542:bipush          6
	// 5293 8544:ldc2w           #1511 <Double 6.1805434000000004D>
	// 5294 8547:dastore         
	// 5295 8548:dup             
	// 5296 8549:bipush          7
	// 5297 8551:ldc2w           #1513 <Double -510.90134399999999D>
	// 5298 8554:dastore         
	// 5299 8555:dup             
	// 5300 8556:bipush          8
	// 5301 8558:ldc2w           #301 <Double -1.5323681D>
	// 5302 8561:dastore         
	// 5303 8562:astore          135
		double ad136[] = {
			11.043151399999999D, 2.5315694D, -850.86131750000004D, 392.10647540000002D, -5.9244687000000003D, 4.1533226000000001D, 0.90358090000000002D, -263.2619765D, -1.4830451D
		};
	// 5304 8564:bipush          9
	// 5305 8566:newarray        double[]
	// 5306 8568:dup             
	// 5307 8569:iconst_0        
	// 5308 8570:ldc2w           #1515 <Double 11.043151399999999D>
	// 5309 8573:dastore         
	// 5310 8574:dup             
	// 5311 8575:iconst_1        
	// 5312 8576:ldc2w           #1435 <Double 2.5315694D>
	// 5313 8579:dastore         
	// 5314 8580:dup             
	// 5315 8581:iconst_2        
	// 5316 8582:ldc2w           #1517 <Double -850.86131750000004D>
	// 5317 8585:dastore         
	// 5318 8586:dup             
	// 5319 8587:iconst_3        
	// 5320 8588:ldc2w           #191 <Double 392.10647540000002D>
	// 5321 8591:dastore         
	// 5322 8592:dup             
	// 5323 8593:iconst_4        
	// 5324 8594:ldc2w           #193 <Double -5.9244687000000003D>
	// 5325 8597:dastore         
	// 5326 8598:dup             
	// 5327 8599:iconst_5        
	// 5328 8600:ldc2w           #1519 <Double 4.1533226000000001D>
	// 5329 8603:dastore         
	// 5330 8604:dup             
	// 5331 8605:bipush          6
	// 5332 8607:ldc2w           #1521 <Double 0.90358090000000002D>
	// 5333 8610:dastore         
	// 5334 8611:dup             
	// 5335 8612:bipush          7
	// 5336 8614:ldc2w           #1523 <Double -263.2619765D>
	// 5337 8617:dastore         
	// 5338 8618:dup             
	// 5339 8619:bipush          8
	// 5340 8621:ldc2w           #201 <Double -1.4830451D>
	// 5341 8624:dastore         
	// 5342 8625:astore          136
		double ad137[] = {
			-0.25503290000000001D, 2.8047719999999998D, 446.12607400000002D, 3.0597946D, 8.9830009000000004D, -1.2495776000000001D, -29.478853000000001D, 274.7781688D, -0.062199999999999998D
		};
	// 5343 8627:bipush          9
	// 5344 8629:newarray        double[]
	// 5345 8631:dup             
	// 5346 8632:iconst_0        
	// 5347 8633:ldc2w           #1525 <Double -0.25503290000000001D>
	// 5348 8636:dastore         
	// 5349 8637:dup             
	// 5350 8638:iconst_1        
	// 5351 8639:ldc2w           #1527 <Double 2.8047719999999998D>
	// 5352 8642:dastore         
	// 5353 8643:dup             
	// 5354 8644:iconst_2        
	// 5355 8645:ldc2w           #1529 <Double 446.12607400000002D>
	// 5356 8648:dastore         
	// 5357 8649:dup             
	// 5358 8650:iconst_3        
	// 5359 8651:ldc2w           #209 <Double 3.0597946D>
	// 5360 8654:dastore         
	// 5361 8655:dup             
	// 5362 8656:iconst_4        
	// 5363 8657:ldc2w           #211 <Double 8.9830009000000004D>
	// 5364 8660:dastore         
	// 5365 8661:dup             
	// 5366 8662:iconst_5        
	// 5367 8663:ldc2w           #1531 <Double -1.2495776000000001D>
	// 5368 8666:dastore         
	// 5369 8667:dup             
	// 5370 8668:bipush          6
	// 5371 8670:ldc2w           #1533 <Double -29.478853000000001D>
	// 5372 8673:dastore         
	// 5373 8674:dup             
	// 5374 8675:bipush          7
	// 5375 8677:ldc2w           #1535 <Double 274.7781688D>
	// 5376 8680:dastore         
	// 5377 8681:dup             
	// 5378 8682:bipush          8
	// 5379 8684:ldc2w           #219 <Double -0.062199999999999998D>
	// 5380 8687:dastore         
	// 5381 8688:astore          137
		double ad138[] = {
			0.044967100000000003D, 2.8047719999999998D, 412.2117581D, 11.2644424D, 8.9614528999999994D, -0.94957760000000002D, -29.995378899999999D, 239.75213289999999D, -0.22733419999999999D
		};
	// 5382 8690:bipush          9
	// 5383 8692:newarray        double[]
	// 5384 8694:dup             
	// 5385 8695:iconst_0        
	// 5386 8696:ldc2w           #1537 <Double 0.044967100000000003D>
	// 5387 8699:dastore         
	// 5388 8700:dup             
	// 5389 8701:iconst_1        
	// 5390 8702:ldc2w           #1527 <Double 2.8047719999999998D>
	// 5391 8705:dastore         
	// 5392 8706:dup             
	// 5393 8707:iconst_2        
	// 5394 8708:ldc2w           #1539 <Double 412.2117581D>
	// 5395 8711:dastore         
	// 5396 8712:dup             
	// 5397 8713:iconst_3        
	// 5398 8714:ldc2w           #319 <Double 11.2644424D>
	// 5399 8717:dastore         
	// 5400 8718:dup             
	// 5401 8719:iconst_4        
	// 5402 8720:ldc2w           #321 <Double 8.9614528999999994D>
	// 5403 8723:dastore         
	// 5404 8724:dup             
	// 5405 8725:iconst_5        
	// 5406 8726:ldc2w           #1541 <Double -0.94957760000000002D>
	// 5407 8729:dastore         
	// 5408 8730:dup             
	// 5409 8731:bipush          6
	// 5410 8733:ldc2w           #1543 <Double -29.995378899999999D>
	// 5411 8736:dastore         
	// 5412 8737:dup             
	// 5413 8738:bipush          7
	// 5414 8740:ldc2w           #1545 <Double 239.75213289999999D>
	// 5415 8743:dastore         
	// 5416 8744:dup             
	// 5417 8745:bipush          8
	// 5418 8747:ldc2w           #329 <Double -0.22733419999999999D>
	// 5419 8750:dastore         
	// 5420 8751:astore          138
		double ad139[] = {
			1.8449671000000001D, 2.8047719999999998D, 208.72586219999999D, 68.407805800000006D, 8.1813959000000001D, 0.85042240000000002D, 4.3187230000000003D, -498.04635159999998D, -1.1049982D
		};
	// 5421 8753:bipush          9
	// 5422 8755:newarray        double[]
	// 5423 8757:dup             
	// 5424 8758:iconst_0        
	// 5425 8759:ldc2w           #1547 <Double 1.8449671000000001D>
	// 5426 8762:dastore         
	// 5427 8763:dup             
	// 5428 8764:iconst_1        
	// 5429 8765:ldc2w           #1527 <Double 2.8047719999999998D>
	// 5430 8768:dastore         
	// 5431 8769:dup             
	// 5432 8770:iconst_2        
	// 5433 8771:ldc2w           #1549 <Double 208.72586219999999D>
	// 5434 8774:dastore         
	// 5435 8775:dup             
	// 5436 8776:iconst_3        
	// 5437 8777:ldc2w           #345 <Double 68.407805800000006D>
	// 5438 8780:dastore         
	// 5439 8781:dup             
	// 5440 8782:iconst_4        
	// 5441 8783:ldc2w           #347 <Double 8.1813959000000001D>
	// 5442 8786:dastore         
	// 5443 8787:dup             
	// 5444 8788:iconst_5        
	// 5445 8789:ldc2w           #1551 <Double 0.85042240000000002D>
	// 5446 8792:dastore         
	// 5447 8793:dup             
	// 5448 8794:bipush          6
	// 5449 8796:ldc2w           #1553 <Double 4.3187230000000003D>
	// 5450 8799:dastore         
	// 5451 8800:dup             
	// 5452 8801:bipush          7
	// 5453 8803:ldc2w           #1555 <Double -498.04635159999998D>
	// 5454 8806:dastore         
	// 5455 8807:dup             
	// 5456 8808:bipush          8
	// 5457 8810:ldc2w           #355 <Double -1.1049982D>
	// 5458 8813:dastore         
	// 5459 8814:astore          139
		double ad140[] = {
			2.1449671000000001D, 2.8047719999999998D, 174.8115463D, 80.747736000000003D, 7.8897272999999997D, 1.1504224000000001D, 11.995685399999999D, -715.47464539999999D, -1.2173562D
		};
	// 5460 8816:bipush          9
	// 5461 8818:newarray        double[]
	// 5462 8820:dup             
	// 5463 8821:iconst_0        
	// 5464 8822:ldc2w           #1557 <Double 2.1449671000000001D>
	// 5465 8825:dastore         
	// 5466 8826:dup             
	// 5467 8827:iconst_1        
	// 5468 8828:ldc2w           #1527 <Double 2.8047719999999998D>
	// 5469 8831:dastore         
	// 5470 8832:dup             
	// 5471 8833:iconst_2        
	// 5472 8834:ldc2w           #1559 <Double 174.8115463D>
	// 5473 8837:dastore         
	// 5474 8838:dup             
	// 5475 8839:iconst_3        
	// 5476 8840:ldc2w           #79  <Double 80.747736000000003D>
	// 5477 8843:dastore         
	// 5478 8844:dup             
	// 5479 8845:iconst_4        
	// 5480 8846:ldc2w           #81  <Double 7.8897272999999997D>
	// 5481 8849:dastore         
	// 5482 8850:dup             
	// 5483 8851:iconst_5        
	// 5484 8852:ldc2w           #1561 <Double 1.1504224000000001D>
	// 5485 8855:dastore         
	// 5486 8856:dup             
	// 5487 8857:bipush          6
	// 5488 8859:ldc2w           #1563 <Double 11.995685399999999D>
	// 5489 8862:dastore         
	// 5490 8863:dup             
	// 5491 8864:bipush          7
	// 5492 8866:ldc2w           #1565 <Double -715.47464539999999D>
	// 5493 8869:dastore         
	// 5494 8870:dup             
	// 5495 8871:bipush          8
	// 5496 8873:ldc2w           #89  <Double -1.2173562D>
	// 5497 8876:dastore         
	// 5498 8877:astore          140
		double ad141[] = {
			2.4449670999999999D, 2.8047719999999998D, 140.89723029999999D, 94.497482399999996D, 7.5234689000000001D, 1.4504223999999999D, 18.557128599999999D, -926.16853300000002D, -1.3163339000000001D
		};
	// 5499 8879:bipush          9
	// 5500 8881:newarray        double[]
	// 5501 8883:dup             
	// 5502 8884:iconst_0        
	// 5503 8885:ldc2w           #1567 <Double 2.4449670999999999D>
	// 5504 8888:dastore         
	// 5505 8889:dup             
	// 5506 8890:iconst_1        
	// 5507 8891:ldc2w           #1527 <Double 2.8047719999999998D>
	// 5508 8894:dastore         
	// 5509 8895:dup             
	// 5510 8896:iconst_2        
	// 5511 8897:ldc2w           #1569 <Double 140.89723029999999D>
	// 5512 8900:dastore         
	// 5513 8901:dup             
	// 5514 8902:iconst_3        
	// 5515 8903:ldc2w           #95  <Double 94.497482399999996D>
	// 5516 8906:dastore         
	// 5517 8907:dup             
	// 5518 8908:iconst_4        
	// 5519 8909:ldc2w           #97  <Double 7.5234689000000001D>
	// 5520 8912:dastore         
	// 5521 8913:dup             
	// 5522 8914:iconst_5        
	// 5523 8915:ldc2w           #1571 <Double 1.4504223999999999D>
	// 5524 8918:dastore         
	// 5525 8919:dup             
	// 5526 8920:bipush          6
	// 5527 8922:ldc2w           #1573 <Double 18.557128599999999D>
	// 5528 8925:dastore         
	// 5529 8926:dup             
	// 5530 8927:bipush          7
	// 5531 8929:ldc2w           #1575 <Double -926.16853300000002D>
	// 5532 8932:dastore         
	// 5533 8933:dup             
	// 5534 8934:bipush          8
	// 5535 8936:ldc2w           #105 <Double -1.3163339000000001D>
	// 5536 8939:dastore         
	// 5537 8940:astore          141
		double ad142[] = {
			3.9449670999999999D, 2.8047719999999998D, -28.674349500000002D, 200.29154579999999D, 3.6574485999999999D, 2.9504223999999999D, 22.495569499999998D, -1184.1545539000001D, -1.5784544D
		};
	// 5538 8942:bipush          9
	// 5539 8944:newarray        double[]
	// 5540 8946:dup             
	// 5541 8947:iconst_0        
	// 5542 8948:ldc2w           #1577 <Double 3.9449670999999999D>
	// 5543 8951:dastore         
	// 5544 8952:dup             
	// 5545 8953:iconst_1        
	// 5546 8954:ldc2w           #1527 <Double 2.8047719999999998D>
	// 5547 8957:dastore         
	// 5548 8958:dup             
	// 5549 8959:iconst_2        
	// 5550 8960:ldc2w           #1579 <Double -28.674349500000002D>
	// 5551 8963:dastore         
	// 5552 8964:dup             
	// 5553 8965:iconst_3        
	// 5554 8966:ldc2w           #265 <Double 200.29154579999999D>
	// 5555 8969:dastore         
	// 5556 8970:dup             
	// 5557 8971:iconst_4        
	// 5558 8972:ldc2w           #267 <Double 3.6574485999999999D>
	// 5559 8975:dastore         
	// 5560 8976:dup             
	// 5561 8977:iconst_5        
	// 5562 8978:ldc2w           #1581 <Double 2.9504223999999999D>
	// 5563 8981:dastore         
	// 5564 8982:dup             
	// 5565 8983:bipush          6
	// 5566 8985:ldc2w           #1583 <Double 22.495569499999998D>
	// 5567 8988:dastore         
	// 5568 8989:dup             
	// 5569 8990:bipush          7
	// 5570 8992:ldc2w           #1585 <Double -1184.1545539000001D>
	// 5571 8995:dastore         
	// 5572 8996:dup             
	// 5573 8997:bipush          8
	// 5574 8999:ldc2w           #275 <Double -1.5784544D>
	// 5575 9002:dastore         
	// 5576 9003:astore          142
		double ad143[] = {
			4.2449671000000002D, 2.8047719999999998D, -62.588665499999998D, 234.27778710000001D, 2.1401053000000001D, 3.2504224000000002D, 17.797969399999999D, -1010.5450339D, -1.5803442000000001D
		};
	// 5577 9005:bipush          9
	// 5578 9007:newarray        double[]
	// 5579 9009:dup             
	// 5580 9010:iconst_0        
	// 5581 9011:ldc2w           #1587 <Double 4.2449671000000002D>
	// 5582 9014:dastore         
	// 5583 9015:dup             
	// 5584 9016:iconst_1        
	// 5585 9017:ldc2w           #1527 <Double 2.8047719999999998D>
	// 5586 9020:dastore         
	// 5587 9021:dup             
	// 5588 9022:iconst_2        
	// 5589 9023:ldc2w           #1589 <Double -62.588665499999998D>
	// 5590 9026:dastore         
	// 5591 9027:dup             
	// 5592 9028:iconst_3        
	// 5593 9029:ldc2w           #159 <Double 234.27778710000001D>
	// 5594 9032:dastore         
	// 5595 9033:dup             
	// 5596 9034:iconst_4        
	// 5597 9035:ldc2w           #161 <Double 2.1401053000000001D>
	// 5598 9038:dastore         
	// 5599 9039:dup             
	// 5600 9040:iconst_5        
	// 5601 9041:ldc2w           #1591 <Double 3.2504224000000002D>
	// 5602 9044:dastore         
	// 5603 9045:dup             
	// 5604 9046:bipush          6
	// 5605 9048:ldc2w           #1593 <Double 17.797969399999999D>
	// 5606 9051:dastore         
	// 5607 9052:dup             
	// 5608 9053:bipush          7
	// 5609 9055:ldc2w           #1595 <Double -1010.5450339D>
	// 5610 9058:dastore         
	// 5611 9059:dup             
	// 5612 9060:bipush          8
	// 5613 9062:ldc2w           #169 <Double -1.5803442000000001D>
	// 5614 9065:dastore         
	// 5615 9066:astore          143
		double ad144[] = {
			4.5449671D, 2.8047719999999998D, -96.502981500000004D, 275.7268449D, 0.1651599D, 3.5504224D, 12.2391326D, -781.89537380000002D, -1.5649227999999999D
		};
	// 5616 9068:bipush          9
	// 5617 9070:newarray        double[]
	// 5618 9072:dup             
	// 5619 9073:iconst_0        
	// 5620 9074:ldc2w           #1597 <Double 4.5449671D>
	// 5621 9077:dastore         
	// 5622 9078:dup             
	// 5623 9079:iconst_1        
	// 5624 9080:ldc2w           #1527 <Double 2.8047719999999998D>
	// 5625 9083:dastore         
	// 5626 9084:dup             
	// 5627 9085:iconst_2        
	// 5628 9086:ldc2w           #1599 <Double -96.502981500000004D>
	// 5629 9089:dastore         
	// 5630 9090:dup             
	// 5631 9091:iconst_3        
	// 5632 9092:ldc2w           #175 <Double 275.7268449D>
	// 5633 9095:dastore         
	// 5634 9096:dup             
	// 5635 9097:iconst_4        
	// 5636 9098:ldc2w           #177 <Double 0.1651599D>
	// 5637 9101:dastore         
	// 5638 9102:dup             
	// 5639 9103:iconst_5        
	// 5640 9104:ldc2w           #1601 <Double 3.5504224D>
	// 5641 9107:dastore         
	// 5642 9108:dup             
	// 5643 9109:bipush          6
	// 5644 9111:ldc2w           #1603 <Double 12.2391326D>
	// 5645 9114:dastore         
	// 5646 9115:dup             
	// 5647 9116:bipush          7
	// 5648 9118:ldc2w           #1605 <Double -781.89537380000002D>
	// 5649 9121:dastore         
	// 5650 9122:dup             
	// 5651 9123:bipush          8
	// 5652 9125:ldc2w           #185 <Double -1.5649227999999999D>
	// 5653 9128:dastore         
	// 5654 9129:astore          144
		double ad145[] = {
			5.1449670999999997D, 2.8047719999999998D, -164.33161340000001D, 392.10647540000002D, -5.9244687000000003D, 4.1504224000000001D, 1.2036986999999999D, -279.7985309D, -1.4830451D
		};
	// 5655 9131:bipush          9
	// 5656 9133:newarray        double[]
	// 5657 9135:dup             
	// 5658 9136:iconst_0        
	// 5659 9137:ldc2w           #1607 <Double 5.1449670999999997D>
	// 5660 9140:dastore         
	// 5661 9141:dup             
	// 5662 9142:iconst_1        
	// 5663 9143:ldc2w           #1527 <Double 2.8047719999999998D>
	// 5664 9146:dastore         
	// 5665 9147:dup             
	// 5666 9148:iconst_2        
	// 5667 9149:ldc2w           #1609 <Double -164.33161340000001D>
	// 5668 9152:dastore         
	// 5669 9153:dup             
	// 5670 9154:iconst_3        
	// 5671 9155:ldc2w           #191 <Double 392.10647540000002D>
	// 5672 9158:dastore         
	// 5673 9159:dup             
	// 5674 9160:iconst_4        
	// 5675 9161:ldc2w           #193 <Double -5.9244687000000003D>
	// 5676 9164:dastore         
	// 5677 9165:dup             
	// 5678 9166:iconst_5        
	// 5679 9167:ldc2w           #1611 <Double 4.1504224000000001D>
	// 5680 9170:dastore         
	// 5681 9171:dup             
	// 5682 9172:bipush          6
	// 5683 9174:ldc2w           #1613 <Double 1.2036986999999999D>
	// 5684 9177:dastore         
	// 5685 9178:dup             
	// 5686 9179:bipush          7
	// 5687 9181:ldc2w           #1615 <Double -279.7985309D>
	// 5688 9184:dastore         
	// 5689 9185:dup             
	// 5690 9186:bipush          8
	// 5691 9188:ldc2w           #201 <Double -1.4830451D>
	// 5692 9191:dastore         
	// 5693 9192:astore          145
		double ad146[] = {
			-3.3458809999999999D, 3.1582262000000001D, 837.01539219999995D, 94.497482399999996D, 7.5234689000000001D, 1.4482638999999999D, 18.857200500000001D, -934.68233510000005D, -1.3163339000000001D
		};
	// 5694 9194:bipush          9
	// 5695 9196:newarray        double[]
	// 5696 9198:dup             
	// 5697 9199:iconst_0        
	// 5698 9200:ldc2w           #1617 <Double -3.3458809999999999D>
	// 5699 9203:dastore         
	// 5700 9204:dup             
	// 5701 9205:iconst_1        
	// 5702 9206:ldc2w           #1619 <Double 3.1582262000000001D>
	// 5703 9209:dastore         
	// 5704 9210:dup             
	// 5705 9211:iconst_2        
	// 5706 9212:ldc2w           #1621 <Double 837.01539219999995D>
	// 5707 9215:dastore         
	// 5708 9216:dup             
	// 5709 9217:iconst_3        
	// 5710 9218:ldc2w           #95  <Double 94.497482399999996D>
	// 5711 9221:dastore         
	// 5712 9222:dup             
	// 5713 9223:iconst_4        
	// 5714 9224:ldc2w           #97  <Double 7.5234689000000001D>
	// 5715 9227:dastore         
	// 5716 9228:dup             
	// 5717 9229:iconst_5        
	// 5718 9230:ldc2w           #1623 <Double 1.4482638999999999D>
	// 5719 9233:dastore         
	// 5720 9234:dup             
	// 5721 9235:bipush          6
	// 5722 9237:ldc2w           #1625 <Double 18.857200500000001D>
	// 5723 9240:dastore         
	// 5724 9241:dup             
	// 5725 9242:bipush          7
	// 5726 9244:ldc2w           #1627 <Double -934.68233510000005D>
	// 5727 9247:dastore         
	// 5728 9248:dup             
	// 5729 9249:bipush          8
	// 5730 9251:ldc2w           #105 <Double -1.3163339000000001D>
	// 5731 9254:dastore         
	// 5732 9255:astore          146
		double ad147[] = {
			-2.1458810000000001D, 3.1582262000000001D, 697.11667720000003D, 171.99884599999999D, 4.8356763999999997D, 2.6482638999999999D, 26.054706700000001D, -1295.9634337D, -1.5592649999999999D
		};
	// 5733 9257:bipush          9
	// 5734 9259:newarray        double[]
	// 5735 9261:dup             
	// 5736 9262:iconst_0        
	// 5737 9263:ldc2w           #1629 <Double -2.1458810000000001D>
	// 5738 9266:dastore         
	// 5739 9267:dup             
	// 5740 9268:iconst_1        
	// 5741 9269:ldc2w           #1619 <Double 3.1582262000000001D>
	// 5742 9272:dastore         
	// 5743 9273:dup             
	// 5744 9274:iconst_2        
	// 5745 9275:ldc2w           #1631 <Double 697.11667720000003D>
	// 5746 9278:dastore         
	// 5747 9279:dup             
	// 5748 9280:iconst_3        
	// 5749 9281:ldc2w           #143 <Double 171.99884599999999D>
	// 5750 9284:dastore         
	// 5751 9285:dup             
	// 5752 9286:iconst_4        
	// 5753 9287:ldc2w           #145 <Double 4.8356763999999997D>
	// 5754 9290:dastore         
	// 5755 9291:dup             
	// 5756 9292:iconst_5        
	// 5757 9293:ldc2w           #1633 <Double 2.6482638999999999D>
	// 5758 9296:dastore         
	// 5759 9297:dup             
	// 5760 9298:bipush          6
	// 5761 9300:ldc2w           #1635 <Double 26.054706700000001D>
	// 5762 9303:dastore         
	// 5763 9304:dup             
	// 5764 9305:bipush          7
	// 5765 9307:ldc2w           #1637 <Double -1295.9634337D>
	// 5766 9310:dastore         
	// 5767 9311:dup             
	// 5768 9312:bipush          8
	// 5769 9314:ldc2w           #153 <Double -1.5592649999999999D>
	// 5770 9317:dastore         
	// 5771 9318:astore          147
		double ad148[] = {
			-1.8458810000000001D, 3.1582262000000001D, 662.1419985D, 200.29154579999999D, 3.6574485999999999D, 2.9482639000000002D, 22.795641400000001D, -1197.1694348999999D, -1.5784544D
		};
	// 5772 9320:bipush          9
	// 5773 9322:newarray        double[]
	// 5774 9324:dup             
	// 5775 9325:iconst_0        
	// 5776 9326:ldc2w           #1639 <Double -1.8458810000000001D>
	// 5777 9329:dastore         
	// 5778 9330:dup             
	// 5779 9331:iconst_1        
	// 5780 9332:ldc2w           #1619 <Double 3.1582262000000001D>
	// 5781 9335:dastore         
	// 5782 9336:dup             
	// 5783 9337:iconst_2        
	// 5784 9338:ldc2w           #1641 <Double 662.1419985D>
	// 5785 9341:dastore         
	// 5786 9342:dup             
	// 5787 9343:iconst_3        
	// 5788 9344:ldc2w           #265 <Double 200.29154579999999D>
	// 5789 9347:dastore         
	// 5790 9348:dup             
	// 5791 9349:iconst_4        
	// 5792 9350:ldc2w           #267 <Double 3.6574485999999999D>
	// 5793 9353:dastore         
	// 5794 9354:dup             
	// 5795 9355:iconst_5        
	// 5796 9356:ldc2w           #1643 <Double 2.9482639000000002D>
	// 5797 9359:dastore         
	// 5798 9360:dup             
	// 5799 9361:bipush          6
	// 5800 9363:ldc2w           #1645 <Double 22.795641400000001D>
	// 5801 9366:dastore         
	// 5802 9367:dup             
	// 5803 9368:bipush          7
	// 5804 9370:ldc2w           #1647 <Double -1197.1694348999999D>
	// 5805 9373:dastore         
	// 5806 9374:dup             
	// 5807 9375:bipush          8
	// 5808 9377:ldc2w           #275 <Double -1.5784544D>
	// 5809 9380:dastore         
	// 5810 9381:astore          148
		double ad149[] = {
			-11.104053D, 3.5867140000000002D, 1783.0305780000001D, 3.0597946D, 8.9830009000000004D, -1.2534236000000001D, -28.878733400000002D, 273.90211240000002D, -0.062199999999999998D
		};
	// 5811 9383:bipush          9
	// 5812 9385:newarray        double[]
	// 5813 9387:dup             
	// 5814 9388:iconst_0        
	// 5815 9389:ldc2w           #1649 <Double -11.104053D>
	// 5816 9392:dastore         
	// 5817 9393:dup             
	// 5818 9394:iconst_1        
	// 5819 9395:ldc2w           #1651 <Double 3.5867140000000002D>
	// 5820 9398:dastore         
	// 5821 9399:dup             
	// 5822 9400:iconst_2        
	// 5823 9401:ldc2w           #1653 <Double 1783.0305780000001D>
	// 5824 9404:dastore         
	// 5825 9405:dup             
	// 5826 9406:iconst_3        
	// 5827 9407:ldc2w           #209 <Double 3.0597946D>
	// 5828 9410:dastore         
	// 5829 9411:dup             
	// 5830 9412:iconst_4        
	// 5831 9413:ldc2w           #211 <Double 8.9830009000000004D>
	// 5832 9416:dastore         
	// 5833 9417:dup             
	// 5834 9418:iconst_5        
	// 5835 9419:ldc2w           #1655 <Double -1.2534236000000001D>
	// 5836 9422:dastore         
	// 5837 9423:dup             
	// 5838 9424:bipush          6
	// 5839 9426:ldc2w           #1657 <Double -28.878733400000002D>
	// 5840 9429:dastore         
	// 5841 9430:dup             
	// 5842 9431:bipush          7
	// 5843 9433:ldc2w           #1659 <Double 273.90211240000002D>
	// 5844 9436:dastore         
	// 5845 9437:dup             
	// 5846 9438:bipush          8
	// 5847 9440:ldc2w           #219 <Double -0.062199999999999998D>
	// 5848 9443:dastore         
	// 5849 9444:astore          149
		double ad150[] = {
			-10.204053D, 3.5867140000000002D, 1674.2501520000001D, 28.2628214D, 8.8398648000000009D, -0.3534236D, -23.955131000000002D, 118.7611406D, -0.54830319999999999D
		};
	// 5850 9446:bipush          9
	// 5851 9448:newarray        double[]
	// 5852 9450:dup             
	// 5853 9451:iconst_0        
	// 5854 9452:ldc2w           #1661 <Double -10.204053D>
	// 5855 9455:dastore         
	// 5856 9456:dup             
	// 5857 9457:iconst_1        
	// 5858 9458:ldc2w           #1651 <Double 3.5867140000000002D>
	// 5859 9461:dastore         
	// 5860 9462:dup             
	// 5861 9463:iconst_2        
	// 5862 9464:ldc2w           #1663 <Double 1674.2501520000001D>
	// 5863 9467:dastore         
	// 5864 9468:dup             
	// 5865 9469:iconst_3        
	// 5866 9470:ldc2w           #31  <Double 28.2628214D>
	// 5867 9473:dastore         
	// 5868 9474:dup             
	// 5869 9475:iconst_4        
	// 5870 9476:ldc2w           #33  <Double 8.8398648000000009D>
	// 5871 9479:dastore         
	// 5872 9480:dup             
	// 5873 9481:iconst_5        
	// 5874 9482:ldc2w           #1665 <Double -0.3534236D>
	// 5875 9485:dastore         
	// 5876 9486:dup             
	// 5877 9487:bipush          6
	// 5878 9489:ldc2w           #1667 <Double -23.955131000000002D>
	// 5879 9492:dastore         
	// 5880 9493:dup             
	// 5881 9494:bipush          7
	// 5882 9496:ldc2w           #1669 <Double 118.7611406D>
	// 5883 9499:dastore         
	// 5884 9500:dup             
	// 5885 9501:bipush          8
	// 5886 9503:ldc2w           #41  <Double -0.54830319999999999D>
	// 5887 9506:dastore         
	// 5888 9507:astore          150
		double ad151[] = {
			-9.3040529999999997D, 3.5867140000000002D, 1565.469726D, 57.2001287D, 8.4126647000000006D, 0.54657639999999996D, -3.2396288000000002D, -305.32272369999998D, -0.98049019999999998D
		};
	// 5889 9509:bipush          9
	// 5890 9511:newarray        double[]
	// 5891 9513:dup             
	// 5892 9514:iconst_0        
	// 5893 9515:ldc2w           #1671 <Double -9.3040529999999997D>
	// 5894 9518:dastore         
	// 5895 9519:dup             
	// 5896 9520:iconst_1        
	// 5897 9521:ldc2w           #1651 <Double 3.5867140000000002D>
	// 5898 9524:dastore         
	// 5899 9525:dup             
	// 5900 9526:iconst_2        
	// 5901 9527:ldc2w           #1673 <Double 1565.469726D>
	// 5902 9530:dastore         
	// 5903 9531:dup             
	// 5904 9532:iconst_3        
	// 5905 9533:ldc2w           #63  <Double 57.2001287D>
	// 5906 9536:dastore         
	// 5907 9537:dup             
	// 5908 9538:iconst_4        
	// 5909 9539:ldc2w           #65  <Double 8.4126647000000006D>
	// 5910 9542:dastore         
	// 5911 9543:dup             
	// 5912 9544:iconst_5        
	// 5913 9545:ldc2w           #1675 <Double 0.54657639999999996D>
	// 5914 9548:dastore         
	// 5915 9549:dup             
	// 5916 9550:bipush          6
	// 5917 9552:ldc2w           #1677 <Double -3.2396288000000002D>
	// 5918 9555:dastore         
	// 5919 9556:dup             
	// 5920 9557:bipush          7
	// 5921 9559:ldc2w           #1679 <Double -305.32272369999998D>
	// 5922 9562:dastore         
	// 5923 9563:dup             
	// 5924 9564:bipush          8
	// 5925 9566:ldc2w           #73  <Double -0.98049019999999998D>
	// 5926 9569:dastore         
	// 5927 9570:astore          151
		double ad152[] = {
			-8.704053D, 3.5867140000000002D, 1492.9494420000001D, 80.747736000000003D, 7.8897272999999997D, 1.1465764000000001D, 12.5958051D, -730.75357320000001D, -1.2173562D
		};
	// 5928 9572:bipush          9
	// 5929 9574:newarray        double[]
	// 5930 9576:dup             
	// 5931 9577:iconst_0        
	// 5932 9578:ldc2w           #1681 <Double -8.704053D>
	// 5933 9581:dastore         
	// 5934 9582:dup             
	// 5935 9583:iconst_1        
	// 5936 9584:ldc2w           #1651 <Double 3.5867140000000002D>
	// 5937 9587:dastore         
	// 5938 9588:dup             
	// 5939 9589:iconst_2        
	// 5940 9590:ldc2w           #1683 <Double 1492.9494420000001D>
	// 5941 9593:dastore         
	// 5942 9594:dup             
	// 5943 9595:iconst_3        
	// 5944 9596:ldc2w           #79  <Double 80.747736000000003D>
	// 5945 9599:dastore         
	// 5946 9600:dup             
	// 5947 9601:iconst_4        
	// 5948 9602:ldc2w           #81  <Double 7.8897272999999997D>
	// 5949 9605:dastore         
	// 5950 9606:dup             
	// 5951 9607:iconst_5        
	// 5952 9608:ldc2w           #1685 <Double 1.1465764000000001D>
	// 5953 9611:dastore         
	// 5954 9612:dup             
	// 5955 9613:bipush          6
	// 5956 9615:ldc2w           #1687 <Double 12.5958051D>
	// 5957 9618:dastore         
	// 5958 9619:dup             
	// 5959 9620:bipush          7
	// 5960 9622:ldc2w           #1689 <Double -730.75357320000001D>
	// 5961 9625:dastore         
	// 5962 9626:dup             
	// 5963 9627:bipush          8
	// 5964 9629:ldc2w           #89  <Double -1.2173562D>
	// 5965 9632:dastore         
	// 5966 9633:astore          152
		double ad153[] = {
			-7.8040529999999997D, 3.5867140000000002D, 1384.1690159D, 127.6888198D, 6.4866308999999998D, 2.0465764000000002D, 26.994882700000002D, -1259.6501765D, -1.4699811D
		};
	// 5967 9635:bipush          9
	// 5968 9637:newarray        double[]
	// 5969 9639:dup             
	// 5970 9640:iconst_0        
	// 5971 9641:ldc2w           #1691 <Double -7.8040529999999997D>
	// 5972 9644:dastore         
	// 5973 9645:dup             
	// 5974 9646:iconst_1        
	// 5975 9647:ldc2w           #1651 <Double 3.5867140000000002D>
	// 5976 9650:dastore         
	// 5977 9651:dup             
	// 5978 9652:iconst_2        
	// 5979 9653:ldc2w           #1693 <Double 1384.1690159D>
	// 5980 9656:dastore         
	// 5981 9657:dup             
	// 5982 9658:iconst_3        
	// 5983 9659:ldc2w           #127 <Double 127.6888198D>
	// 5984 9662:dastore         
	// 5985 9663:dup             
	// 5986 9664:iconst_4        
	// 5987 9665:ldc2w           #129 <Double 6.4866308999999998D>
	// 5988 9668:dastore         
	// 5989 9669:dup             
	// 5990 9670:iconst_5        
	// 5991 9671:ldc2w           #1695 <Double 2.0465764000000002D>
	// 5992 9674:dastore         
	// 5993 9675:dup             
	// 5994 9676:bipush          6
	// 5995 9678:ldc2w           #1697 <Double 26.994882700000002D>
	// 5996 9681:dastore         
	// 5997 9682:dup             
	// 5998 9683:bipush          7
	// 5999 9685:ldc2w           #1699 <Double -1259.6501765D>
	// 6000 9688:dastore         
	// 6001 9689:dup             
	// 6002 9690:bipush          8
	// 6003 9692:ldc2w           #137 <Double -1.4699811D>
	// 6004 9695:dastore         
	// 6005 9696:astore          153
		double ad154[] = {
			-6.9040530000000002D, 3.5867140000000002D, 1275.3885898999999D, 200.29154579999999D, 3.6574485999999999D, 2.9465764000000001D, 23.095689100000001D, -1210.2356351999999D, -1.5784544D
		};
	// 6006 9698:bipush          9
	// 6007 9700:newarray        double[]
	// 6008 9702:dup             
	// 6009 9703:iconst_0        
	// 6010 9704:ldc2w           #1701 <Double -6.9040530000000002D>
	// 6011 9707:dastore         
	// 6012 9708:dup             
	// 6013 9709:iconst_1        
	// 6014 9710:ldc2w           #1651 <Double 3.5867140000000002D>
	// 6015 9713:dastore         
	// 6016 9714:dup             
	// 6017 9715:iconst_2        
	// 6018 9716:ldc2w           #1703 <Double 1275.3885898999999D>
	// 6019 9719:dastore         
	// 6020 9720:dup             
	// 6021 9721:iconst_3        
	// 6022 9722:ldc2w           #265 <Double 200.29154579999999D>
	// 6023 9725:dastore         
	// 6024 9726:dup             
	// 6025 9727:iconst_4        
	// 6026 9728:ldc2w           #267 <Double 3.6574485999999999D>
	// 6027 9731:dastore         
	// 6028 9732:dup             
	// 6029 9733:iconst_5        
	// 6030 9734:ldc2w           #1705 <Double 2.9465764000000001D>
	// 6031 9737:dastore         
	// 6032 9738:dup             
	// 6033 9739:bipush          6
	// 6034 9741:ldc2w           #1707 <Double 23.095689100000001D>
	// 6035 9744:dastore         
	// 6036 9745:dup             
	// 6037 9746:bipush          7
	// 6038 9748:ldc2w           #1709 <Double -1210.2356351999999D>
	// 6039 9751:dastore         
	// 6040 9752:dup             
	// 6041 9753:bipush          8
	// 6042 9755:ldc2w           #275 <Double -1.5784544D>
	// 6043 9758:dastore         
	// 6044 9759:astore          154
		double ad155[] = {
			-14.5758452D, 4.0776652999999996D, 2226.8867414000001D, 11.2644424D, 8.9614528999999994D, -0.95478980000000002D, -29.0952257D, 235.67540510000001D, -0.22733419999999999D
		};
	// 6045 9761:bipush          9
	// 6046 9763:newarray        double[]
	// 6047 9765:dup             
	// 6048 9766:iconst_0        
	// 6049 9767:ldc2w           #1711 <Double -14.5758452D>
	// 6050 9770:dastore         
	// 6051 9771:dup             
	// 6052 9772:iconst_1        
	// 6053 9773:ldc2w           #1713 <Double 4.0776652999999996D>
	// 6054 9776:dastore         
	// 6055 9777:dup             
	// 6056 9778:iconst_2        
	// 6057 9779:ldc2w           #1715 <Double 2226.8867414000001D>
	// 6058 9782:dastore         
	// 6059 9783:dup             
	// 6060 9784:iconst_3        
	// 6061 9785:ldc2w           #319 <Double 11.2644424D>
	// 6062 9788:dastore         
	// 6063 9789:dup             
	// 6064 9790:iconst_4        
	// 6065 9791:ldc2w           #321 <Double 8.9614528999999994D>
	// 6066 9794:dastore         
	// 6067 9795:dup             
	// 6068 9796:iconst_5        
	// 6069 9797:ldc2w           #1717 <Double -0.95478980000000002D>
	// 6070 9800:dastore         
	// 6071 9801:dup             
	// 6072 9802:bipush          6
	// 6073 9804:ldc2w           #1719 <Double -29.0952257D>
	// 6074 9807:dastore         
	// 6075 9808:dup             
	// 6076 9809:bipush          7
	// 6077 9811:ldc2w           #1721 <Double 235.67540510000001D>
	// 6078 9814:dastore         
	// 6079 9815:dup             
	// 6080 9816:bipush          8
	// 6081 9818:ldc2w           #329 <Double -0.22733419999999999D>
	// 6082 9821:dastore         
	// 6083 9822:astore          155
		double ad156[] = {
			-13.375845200000001D, 4.0776652999999996D, 2075.9547573999998D, 46.896400399999997D, 8.5943556999999995D, 0.24521019999999999D, -10.898432100000001D, -132.04037120000001D, -0.84519750000000005D
		};
	// 6084 9824:bipush          9
	// 6085 9826:newarray        double[]
	// 6086 9828:dup             
	// 6087 9829:iconst_0        
	// 6088 9830:ldc2w           #1723 <Double -13.375845200000001D>
	// 6089 9833:dastore         
	// 6090 9834:dup             
	// 6091 9835:iconst_1        
	// 6092 9836:ldc2w           #1713 <Double 4.0776652999999996D>
	// 6093 9839:dastore         
	// 6094 9840:dup             
	// 6095 9841:iconst_2        
	// 6096 9842:ldc2w           #1725 <Double 2075.9547573999998D>
	// 6097 9845:dastore         
	// 6098 9846:dup             
	// 6099 9847:iconst_3        
	// 6100 9848:ldc2w           #541 <Double 46.896400399999997D>
	// 6101 9851:dastore         
	// 6102 9852:dup             
	// 6103 9853:iconst_4        
	// 6104 9854:ldc2w           #543 <Double 8.5943556999999995D>
	// 6105 9857:dastore         
	// 6106 9858:dup             
	// 6107 9859:iconst_5        
	// 6108 9860:ldc2w           #1727 <Double 0.24521019999999999D>
	// 6109 9863:dastore         
	// 6110 9864:dup             
	// 6111 9865:bipush          6
	// 6112 9867:ldc2w           #1729 <Double -10.898432100000001D>
	// 6113 9870:dastore         
	// 6114 9871:dup             
	// 6115 9872:bipush          7
	// 6116 9874:ldc2w           #1731 <Double -132.04037120000001D>
	// 6117 9877:dastore         
	// 6118 9878:dup             
	// 6119 9879:bipush          8
	// 6120 9881:ldc2w           #551 <Double -0.84519750000000005D>
	// 6121 9884:dastore         
	// 6122 9885:astore          156
		double ad157[] = {
			-13.0758452D, 4.0776652999999996D, 2038.2217614000001D, 57.2001287D, 8.4126647000000006D, 0.54521019999999998D, -2.9395953000000001D, -311.22353939999999D, -0.98049019999999998D
		};
	// 6123 9887:bipush          9
	// 6124 9889:newarray        double[]
	// 6125 9891:dup             
	// 6126 9892:iconst_0        
	// 6127 9893:ldc2w           #1733 <Double -13.0758452D>
	// 6128 9896:dastore         
	// 6129 9897:dup             
	// 6130 9898:iconst_1        
	// 6131 9899:ldc2w           #1713 <Double 4.0776652999999996D>
	// 6132 9902:dastore         
	// 6133 9903:dup             
	// 6134 9904:iconst_2        
	// 6135 9905:ldc2w           #1735 <Double 2038.2217614000001D>
	// 6136 9908:dastore         
	// 6137 9909:dup             
	// 6138 9910:iconst_3        
	// 6139 9911:ldc2w           #63  <Double 57.2001287D>
	// 6140 9914:dastore         
	// 6141 9915:dup             
	// 6142 9916:iconst_4        
	// 6143 9917:ldc2w           #65  <Double 8.4126647000000006D>
	// 6144 9920:dastore         
	// 6145 9921:dup             
	// 6146 9922:iconst_5        
	// 6147 9923:ldc2w           #1737 <Double 0.54521019999999998D>
	// 6148 9926:dastore         
	// 6149 9927:dup             
	// 6150 9928:bipush          6
	// 6151 9930:ldc2w           #1739 <Double -2.9395953000000001D>
	// 6152 9933:dastore         
	// 6153 9934:dup             
	// 6154 9935:bipush          7
	// 6155 9937:ldc2w           #1741 <Double -311.22353939999999D>
	// 6156 9940:dastore         
	// 6157 9941:dup             
	// 6158 9942:bipush          8
	// 6159 9944:ldc2w           #73  <Double -0.98049019999999998D>
	// 6160 9947:dastore         
	// 6161 9948:astore          157
		double ad158[] = {
			-12.775845199999999D, 4.0776652999999996D, 2000.4887653000001D, 68.407805800000006D, 8.1813959000000001D, 0.84521020000000002D, 5.2188762000000004D, -518.32583680000005D, -1.1049982D
		};
	// 6162 9950:bipush          9
	// 6163 9952:newarray        double[]
	// 6164 9954:dup             
	// 6165 9955:iconst_0        
	// 6166 9956:ldc2w           #1743 <Double -12.775845199999999D>
	// 6167 9959:dastore         
	// 6168 9960:dup             
	// 6169 9961:iconst_1        
	// 6170 9962:ldc2w           #1713 <Double 4.0776652999999996D>
	// 6171 9965:dastore         
	// 6172 9966:dup             
	// 6173 9967:iconst_2        
	// 6174 9968:ldc2w           #1745 <Double 2000.4887653000001D>
	// 6175 9971:dastore         
	// 6176 9972:dup             
	// 6177 9973:iconst_3        
	// 6178 9974:ldc2w           #345 <Double 68.407805800000006D>
	// 6179 9977:dastore         
	// 6180 9978:dup             
	// 6181 9979:iconst_4        
	// 6182 9980:ldc2w           #347 <Double 8.1813959000000001D>
	// 6183 9983:dastore         
	// 6184 9984:dup             
	// 6185 9985:iconst_5        
	// 6186 9986:ldc2w           #1747 <Double 0.84521020000000002D>
	// 6187 9989:dastore         
	// 6188 9990:dup             
	// 6189 9991:bipush          6
	// 6190 9993:ldc2w           #1749 <Double 5.2188762000000004D>
	// 6191 9996:dastore         
	// 6192 9997:dup             
	// 6193 9998:bipush          7
	// 6194 10000:ldc2w           #1751 <Double -518.32583680000005D>
	// 6195 10003:dastore         
	// 6196 10004:dup             
	// 6197 10005:bipush          8
	// 6198 10007:ldc2w           #355 <Double -1.1049982D>
	// 6199 10010:dastore         
	// 6200 10011:astore          158
		double ad159[] = {
			-12.175845199999999D, 4.0776652999999996D, 1925.0227732999999D, 94.497482399999996D, 7.5234689000000001D, 1.4452102D, 19.457281800000001D, -951.84893729999999D, -1.3163339000000001D
		};
	// 6201 10013:bipush          9
	// 6202 10015:newarray        double[]
	// 6203 10017:dup             
	// 6204 10018:iconst_0        
	// 6205 10019:ldc2w           #1753 <Double -12.175845199999999D>
	// 6206 10022:dastore         
	// 6207 10023:dup             
	// 6208 10024:iconst_1        
	// 6209 10025:ldc2w           #1713 <Double 4.0776652999999996D>
	// 6210 10028:dastore         
	// 6211 10029:dup             
	// 6212 10030:iconst_2        
	// 6213 10031:ldc2w           #1755 <Double 1925.0227732999999D>
	// 6214 10034:dastore         
	// 6215 10035:dup             
	// 6216 10036:iconst_3        
	// 6217 10037:ldc2w           #95  <Double 94.497482399999996D>
	// 6218 10040:dastore         
	// 6219 10041:dup             
	// 6220 10042:iconst_4        
	// 6221 10043:ldc2w           #97  <Double 7.5234689000000001D>
	// 6222 10046:dastore         
	// 6223 10047:dup             
	// 6224 10048:iconst_5        
	// 6225 10049:ldc2w           #1757 <Double 1.4452102D>
	// 6226 10052:dastore         
	// 6227 10053:dup             
	// 6228 10054:bipush          6
	// 6229 10056:ldc2w           #1759 <Double 19.457281800000001D>
	// 6230 10059:dastore         
	// 6231 10060:dup             
	// 6232 10061:bipush          7
	// 6233 10063:ldc2w           #1761 <Double -951.84893729999999D>
	// 6234 10066:dastore         
	// 6235 10067:dup             
	// 6236 10068:bipush          8
	// 6237 10070:ldc2w           #105 <Double -1.3163339000000001D>
	// 6238 10073:dastore         
	// 6239 10074:astore          159
		double ad160[] = {
			-11.875845200000001D, 4.0776652999999996D, 1887.2897773D, 110.00047410000001D, 7.0639795000000003D, 1.7452102D, 24.3783903D, -1136.2831431D, -1.4008494D
		};
	// 6240 10076:bipush          9
	// 6241 10078:newarray        double[]
	// 6242 10080:dup             
	// 6243 10081:iconst_0        
	// 6244 10082:ldc2w           #1763 <Double -11.875845200000001D>
	// 6245 10085:dastore         
	// 6246 10086:dup             
	// 6247 10087:iconst_1        
	// 6248 10088:ldc2w           #1713 <Double 4.0776652999999996D>
	// 6249 10091:dastore         
	// 6250 10092:dup             
	// 6251 10093:iconst_2        
	// 6252 10094:ldc2w           #1765 <Double 1887.2897773D>
	// 6253 10097:dastore         
	// 6254 10098:dup             
	// 6255 10099:iconst_3        
	// 6256 10100:ldc2w           #111 <Double 110.00047410000001D>
	// 6257 10103:dastore         
	// 6258 10104:dup             
	// 6259 10105:iconst_4        
	// 6260 10106:ldc2w           #113 <Double 7.0639795000000003D>
	// 6261 10109:dastore         
	// 6262 10110:dup             
	// 6263 10111:iconst_5        
	// 6264 10112:ldc2w           #1767 <Double 1.7452102D>
	// 6265 10115:dastore         
	// 6266 10116:dup             
	// 6267 10117:bipush          6
	// 6268 10119:ldc2w           #1769 <Double 24.3783903D>
	// 6269 10122:dastore         
	// 6270 10123:dup             
	// 6271 10124:bipush          7
	// 6272 10126:ldc2w           #1771 <Double -1136.2831431D>
	// 6273 10129:dastore         
	// 6274 10130:dup             
	// 6275 10131:bipush          8
	// 6276 10133:ldc2w           #121 <Double -1.4008494D>
	// 6277 10136:dastore         
	// 6278 10137:astore          160
		double ad161[] = {
			-10.9758452D, 4.0776652999999996D, 1774.0907892D, 171.99884599999999D, 4.8356763999999997D, 2.6452102000000002D, 26.654787899999999D, -1320.331011D, -1.5592649999999999D
		};
	// 6279 10139:bipush          9
	// 6280 10141:newarray        double[]
	// 6281 10143:dup             
	// 6282 10144:iconst_0        
	// 6283 10145:ldc2w           #1773 <Double -10.9758452D>
	// 6284 10148:dastore         
	// 6285 10149:dup             
	// 6286 10150:iconst_1        
	// 6287 10151:ldc2w           #1713 <Double 4.0776652999999996D>
	// 6288 10154:dastore         
	// 6289 10155:dup             
	// 6290 10156:iconst_2        
	// 6291 10157:ldc2w           #1775 <Double 1774.0907892D>
	// 6292 10160:dastore         
	// 6293 10161:dup             
	// 6294 10162:iconst_3        
	// 6295 10163:ldc2w           #143 <Double 171.99884599999999D>
	// 6296 10166:dastore         
	// 6297 10167:dup             
	// 6298 10168:iconst_4        
	// 6299 10169:ldc2w           #145 <Double 4.8356763999999997D>
	// 6300 10172:dastore         
	// 6301 10173:dup             
	// 6302 10174:iconst_5        
	// 6303 10175:ldc2w           #1777 <Double 2.6452102000000002D>
	// 6304 10178:dastore         
	// 6305 10179:dup             
	// 6306 10180:bipush          6
	// 6307 10182:ldc2w           #1779 <Double 26.654787899999999D>
	// 6308 10185:dastore         
	// 6309 10186:dup             
	// 6310 10187:bipush          7
	// 6311 10189:ldc2w           #1781 <Double -1320.331011D>
	// 6312 10192:dastore         
	// 6313 10193:dup             
	// 6314 10194:bipush          8
	// 6315 10196:ldc2w           #153 <Double -1.5592649999999999D>
	// 6316 10199:dastore         
	// 6317 10200:astore          161
		double ad162[] = {
			-10.675845199999999D, 4.0776652999999996D, 1736.3577932000001D, 200.29154579999999D, 3.6574485999999999D, 2.9452102D, 23.3957227D, -1223.3372558999999D, -1.5784544D
		};
	// 6318 10202:bipush          9
	// 6319 10204:newarray        double[]
	// 6320 10206:dup             
	// 6321 10207:iconst_0        
	// 6322 10208:ldc2w           #1783 <Double -10.675845199999999D>
	// 6323 10211:dastore         
	// 6324 10212:dup             
	// 6325 10213:iconst_1        
	// 6326 10214:ldc2w           #1713 <Double 4.0776652999999996D>
	// 6327 10217:dastore         
	// 6328 10218:dup             
	// 6329 10219:iconst_2        
	// 6330 10220:ldc2w           #1785 <Double 1736.3577932000001D>
	// 6331 10223:dastore         
	// 6332 10224:dup             
	// 6333 10225:iconst_3        
	// 6334 10226:ldc2w           #265 <Double 200.29154579999999D>
	// 6335 10229:dastore         
	// 6336 10230:dup             
	// 6337 10231:iconst_4        
	// 6338 10232:ldc2w           #267 <Double 3.6574485999999999D>
	// 6339 10235:dastore         
	// 6340 10236:dup             
	// 6341 10237:iconst_5        
	// 6342 10238:ldc2w           #1787 <Double 2.9452102D>
	// 6343 10241:dastore         
	// 6344 10242:dup             
	// 6345 10243:bipush          6
	// 6346 10245:ldc2w           #1789 <Double 23.3957227D>
	// 6347 10248:dastore         
	// 6348 10249:dup             
	// 6349 10250:bipush          7
	// 6350 10252:ldc2w           #1791 <Double -1223.3372558999999D>
	// 6351 10255:dastore         
	// 6352 10256:dup             
	// 6353 10257:bipush          8
	// 6354 10259:ldc2w           #275 <Double -1.5784544D>
	// 6355 10262:dastore         
	// 6356 10263:astore          162
		double ad163[] = {
			-10.0758452D, 4.0776652999999996D, 1660.8918011999999D, 275.7268449D, 0.1651599D, 3.5452102000000001D, 13.1392858D, -826.47899489999998D, -1.5649227999999999D
		};
	// 6357 10265:bipush          9
	// 6358 10267:newarray        double[]
	// 6359 10269:dup             
	// 6360 10270:iconst_0        
	// 6361 10271:ldc2w           #1793 <Double -10.0758452D>
	// 6362 10274:dastore         
	// 6363 10275:dup             
	// 6364 10276:iconst_1        
	// 6365 10277:ldc2w           #1713 <Double 4.0776652999999996D>
	// 6366 10280:dastore         
	// 6367 10281:dup             
	// 6368 10282:iconst_2        
	// 6369 10283:ldc2w           #1795 <Double 1660.8918011999999D>
	// 6370 10286:dastore         
	// 6371 10287:dup             
	// 6372 10288:iconst_3        
	// 6373 10289:ldc2w           #175 <Double 275.7268449D>
	// 6374 10292:dastore         
	// 6375 10293:dup             
	// 6376 10294:iconst_4        
	// 6377 10295:ldc2w           #177 <Double 0.1651599D>
	// 6378 10298:dastore         
	// 6379 10299:dup             
	// 6380 10300:iconst_5        
	// 6381 10301:ldc2w           #1797 <Double 3.5452102000000001D>
	// 6382 10304:dastore         
	// 6383 10305:dup             
	// 6384 10306:bipush          6
	// 6385 10308:ldc2w           #1799 <Double 13.1392858D>
	// 6386 10311:dastore         
	// 6387 10312:dup             
	// 6388 10313:bipush          7
	// 6389 10315:ldc2w           #1801 <Double -826.47899489999998D>
	// 6390 10318:dastore         
	// 6391 10319:dup             
	// 6392 10320:bipush          8
	// 6393 10322:ldc2w           #185 <Double -1.5649227999999999D>
	// 6394 10325:dastore         
	// 6395 10326:astore          163
		double ad164[] = {
			-15.7334283D, 4.6123928999999997D, 2375.4937455999998D, 37.305238799999998D, 8.7346948999999992D, -0.0559254D, -17.6960075D, 6.6131552999999998D, -0.70060560000000005D
		};
	// 6396 10328:bipush          9
	// 6397 10330:newarray        double[]
	// 6398 10332:dup             
	// 6399 10333:iconst_0        
	// 6400 10334:ldc2w           #1803 <Double -15.7334283D>
	// 6401 10337:dastore         
	// 6402 10338:dup             
	// 6403 10339:iconst_1        
	// 6404 10340:ldc2w           #1805 <Double 4.6123928999999997D>
	// 6405 10343:dastore         
	// 6406 10344:dup             
	// 6407 10345:iconst_2        
	// 6408 10346:ldc2w           #1807 <Double 2375.4937455999998D>
	// 6409 10349:dastore         
	// 6410 10350:dup             
	// 6411 10351:iconst_3        
	// 6412 10352:ldc2w           #47  <Double 37.305238799999998D>
	// 6413 10355:dastore         
	// 6414 10356:dup             
	// 6415 10357:iconst_4        
	// 6416 10358:ldc2w           #49  <Double 8.7346948999999992D>
	// 6417 10361:dastore         
	// 6418 10362:dup             
	// 6419 10363:iconst_5        
	// 6420 10364:ldc2w           #1809 <Double -0.0559254D>
	// 6421 10367:dastore         
	// 6422 10368:dup             
	// 6423 10369:bipush          6
	// 6424 10371:ldc2w           #1811 <Double -17.6960075D>
	// 6425 10374:dastore         
	// 6426 10375:dup             
	// 6427 10376:bipush          7
	// 6428 10378:ldc2w           #1813 <Double 6.6131552999999998D>
	// 6429 10381:dastore         
	// 6430 10382:dup             
	// 6431 10383:bipush          8
	// 6432 10385:ldc2w           #57  <Double -0.70060560000000005D>
	// 6433 10388:dastore         
	// 6434 10389:astore          164
		double ad165[] = {
			-14.8334283D, 4.6123928999999997D, 2257.4822097000001D, 68.407805800000006D, 8.1813959000000001D, 0.84407460000000001D, 5.5189007999999999D, -525.15266059999999D, -1.1049982D
		};
	// 6435 10391:bipush          9
	// 6436 10393:newarray        double[]
	// 6437 10395:dup             
	// 6438 10396:iconst_0        
	// 6439 10397:ldc2w           #1815 <Double -14.8334283D>
	// 6440 10400:dastore         
	// 6441 10401:dup             
	// 6442 10402:iconst_1        
	// 6443 10403:ldc2w           #1805 <Double 4.6123928999999997D>
	// 6444 10406:dastore         
	// 6445 10407:dup             
	// 6446 10408:iconst_2        
	// 6447 10409:ldc2w           #1817 <Double 2257.4822097000001D>
	// 6448 10412:dastore         
	// 6449 10413:dup             
	// 6450 10414:iconst_3        
	// 6451 10415:ldc2w           #345 <Double 68.407805800000006D>
	// 6452 10418:dastore         
	// 6453 10419:dup             
	// 6454 10420:iconst_4        
	// 6455 10421:ldc2w           #347 <Double 8.1813959000000001D>
	// 6456 10424:dastore         
	// 6457 10425:dup             
	// 6458 10426:iconst_5        
	// 6459 10427:ldc2w           #1819 <Double 0.84407460000000001D>
	// 6460 10430:dastore         
	// 6461 10431:dup             
	// 6462 10432:bipush          6
	// 6463 10434:ldc2w           #1821 <Double 5.5189007999999999D>
	// 6464 10437:dastore         
	// 6465 10438:dup             
	// 6466 10439:bipush          7
	// 6467 10441:ldc2w           #1823 <Double -525.15266059999999D>
	// 6468 10444:dastore         
	// 6469 10445:dup             
	// 6470 10446:bipush          8
	// 6471 10448:ldc2w           #355 <Double -1.1049982D>
	// 6472 10451:dastore         
	// 6473 10452:astore          165
		double ad166[] = {
			-14.533428300000001D, 4.6123928999999997D, 2218.145031D, 80.747736000000003D, 7.8897272999999997D, 1.1440745999999999D, 13.1958632D, -746.18148789999998D, -1.2173562D
		};
	// 6474 10454:bipush          9
	// 6475 10456:newarray        double[]
	// 6476 10458:dup             
	// 6477 10459:iconst_0        
	// 6478 10460:ldc2w           #1825 <Double -14.533428300000001D>
	// 6479 10463:dastore         
	// 6480 10464:dup             
	// 6481 10465:iconst_1        
	// 6482 10466:ldc2w           #1805 <Double 4.6123928999999997D>
	// 6483 10469:dastore         
	// 6484 10470:dup             
	// 6485 10471:iconst_2        
	// 6486 10472:ldc2w           #1827 <Double 2218.145031D>
	// 6487 10475:dastore         
	// 6488 10476:dup             
	// 6489 10477:iconst_3        
	// 6490 10478:ldc2w           #79  <Double 80.747736000000003D>
	// 6491 10481:dastore         
	// 6492 10482:dup             
	// 6493 10483:iconst_4        
	// 6494 10484:ldc2w           #81  <Double 7.8897272999999997D>
	// 6495 10487:dastore         
	// 6496 10488:dup             
	// 6497 10489:iconst_5        
	// 6498 10490:ldc2w           #1829 <Double 1.1440745999999999D>
	// 6499 10493:dastore         
	// 6500 10494:dup             
	// 6501 10495:bipush          6
	// 6502 10497:ldc2w           #1831 <Double 13.1958632D>
	// 6503 10500:dastore         
	// 6504 10501:dup             
	// 6505 10502:bipush          7
	// 6506 10504:ldc2w           #1833 <Double -746.18148789999998D>
	// 6507 10507:dastore         
	// 6508 10508:dup             
	// 6509 10509:bipush          8
	// 6510 10511:ldc2w           #89  <Double -1.2173562D>
	// 6511 10514:dastore         
	// 6512 10515:astore          166
		double ad167[] = {
			-13.6334283D, 4.6123928999999997D, 2100.1334950999999D, 127.6888198D, 6.4866308999999998D, 2.0440746000000001D, 27.594940900000001D, -1280.4786148999999D, -1.4699811D
		};
	// 6513 10517:bipush          9
	// 6514 10519:newarray        double[]
	// 6515 10521:dup             
	// 6516 10522:iconst_0        
	// 6517 10523:ldc2w           #1835 <Double -13.6334283D>
	// 6518 10526:dastore         
	// 6519 10527:dup             
	// 6520 10528:iconst_1        
	// 6521 10529:ldc2w           #1805 <Double 4.6123928999999997D>
	// 6522 10532:dastore         
	// 6523 10533:dup             
	// 6524 10534:iconst_2        
	// 6525 10535:ldc2w           #1837 <Double 2100.1334950999999D>
	// 6526 10538:dastore         
	// 6527 10539:dup             
	// 6528 10540:iconst_3        
	// 6529 10541:ldc2w           #127 <Double 127.6888198D>
	// 6530 10544:dastore         
	// 6531 10545:dup             
	// 6532 10546:iconst_4        
	// 6533 10547:ldc2w           #129 <Double 6.4866308999999998D>
	// 6534 10550:dastore         
	// 6535 10551:dup             
	// 6536 10552:iconst_5        
	// 6537 10553:ldc2w           #1839 <Double 2.0440746000000001D>
	// 6538 10556:dastore         
	// 6539 10557:dup             
	// 6540 10558:bipush          6
	// 6541 10560:ldc2w           #1841 <Double 27.594940900000001D>
	// 6542 10563:dastore         
	// 6543 10564:dup             
	// 6544 10565:bipush          7
	// 6545 10567:ldc2w           #1843 <Double -1280.4786148999999D>
	// 6546 10570:dastore         
	// 6547 10571:dup             
	// 6548 10572:bipush          8
	// 6549 10574:ldc2w           #137 <Double -1.4699811D>
	// 6550 10577:dastore         
	// 6551 10578:astore          167
		double ad168[] = {
			-13.033428300000001D, 4.6123928999999997D, 2021.4591378D, 171.99884599999999D, 4.8356763999999997D, 2.6440746000000002D, 26.9548126D, -1332.5582784000001D, -1.5592649999999999D
		};
	// 6552 10580:bipush          9
	// 6553 10582:newarray        double[]
	// 6554 10584:dup             
	// 6555 10585:iconst_0        
	// 6556 10586:ldc2w           #1845 <Double -13.033428300000001D>
	// 6557 10589:dastore         
	// 6558 10590:dup             
	// 6559 10591:iconst_1        
	// 6560 10592:ldc2w           #1805 <Double 4.6123928999999997D>
	// 6561 10595:dastore         
	// 6562 10596:dup             
	// 6563 10597:iconst_2        
	// 6564 10598:ldc2w           #1847 <Double 2021.4591378D>
	// 6565 10601:dastore         
	// 6566 10602:dup             
	// 6567 10603:iconst_3        
	// 6568 10604:ldc2w           #143 <Double 171.99884599999999D>
	// 6569 10607:dastore         
	// 6570 10608:dup             
	// 6571 10609:iconst_4        
	// 6572 10610:ldc2w           #145 <Double 4.8356763999999997D>
	// 6573 10613:dastore         
	// 6574 10614:dup             
	// 6575 10615:iconst_5        
	// 6576 10616:ldc2w           #1849 <Double 2.6440746000000002D>
	// 6577 10619:dastore         
	// 6578 10620:dup             
	// 6579 10621:bipush          6
	// 6580 10623:ldc2w           #1851 <Double 26.9548126D>
	// 6581 10626:dastore         
	// 6582 10627:dup             
	// 6583 10628:bipush          7
	// 6584 10630:ldc2w           #1853 <Double -1332.5582784000001D>
	// 6585 10633:dastore         
	// 6586 10634:dup             
	// 6587 10635:bipush          8
	// 6588 10637:ldc2w           #153 <Double -1.5592649999999999D>
	// 6589 10640:dastore         
	// 6590 10641:astore          168
		double ad169[] = {
			-12.7334283D, 4.6123928999999997D, 1982.1219590999999D, 200.29154579999999D, 3.6574485999999999D, 2.9440746D, 23.695747300000001D, -1236.4645972000001D, -1.5784544D
		};
	// 6591 10643:bipush          9
	// 6592 10645:newarray        double[]
	// 6593 10647:dup             
	// 6594 10648:iconst_0        
	// 6595 10649:ldc2w           #1855 <Double -12.7334283D>
	// 6596 10652:dastore         
	// 6597 10653:dup             
	// 6598 10654:iconst_1        
	// 6599 10655:ldc2w           #1805 <Double 4.6123928999999997D>
	// 6600 10658:dastore         
	// 6601 10659:dup             
	// 6602 10660:iconst_2        
	// 6603 10661:ldc2w           #1857 <Double 1982.1219590999999D>
	// 6604 10664:dastore         
	// 6605 10665:dup             
	// 6606 10666:iconst_3        
	// 6607 10667:ldc2w           #265 <Double 200.29154579999999D>
	// 6608 10670:dastore         
	// 6609 10671:dup             
	// 6610 10672:iconst_4        
	// 6611 10673:ldc2w           #267 <Double 3.6574485999999999D>
	// 6612 10676:dastore         
	// 6613 10677:dup             
	// 6614 10678:iconst_5        
	// 6615 10679:ldc2w           #1859 <Double 2.9440746D>
	// 6616 10682:dastore         
	// 6617 10683:dup             
	// 6618 10684:bipush          6
	// 6619 10686:ldc2w           #1861 <Double 23.695747300000001D>
	// 6620 10689:dastore         
	// 6621 10690:dup             
	// 6622 10691:bipush          7
	// 6623 10693:ldc2w           #1863 <Double -1236.4645972000001D>
	// 6624 10696:dastore         
	// 6625 10697:dup             
	// 6626 10698:bipush          8
	// 6627 10700:ldc2w           #275 <Double -1.5784544D>
	// 6628 10703:dastore         
	// 6629 10704:astore          169
		double ad170[] = {
			-17.016744200000002D, 5.1679225999999998D, 2542.6289181000002D, 3.0597946D, 8.9830009000000004D, -1.2568887D, -27.9786565D, 272.32962730000003D, -0.062199999999999998D
		};
	// 6630 10706:bipush          9
	// 6631 10708:newarray        double[]
	// 6632 10710:dup             
	// 6633 10711:iconst_0        
	// 6634 10712:ldc2w           #1865 <Double -17.016744200000002D>
	// 6635 10715:dastore         
	// 6636 10716:dup             
	// 6637 10717:iconst_1        
	// 6638 10718:ldc2w           #1867 <Double 5.1679225999999998D>
	// 6639 10721:dastore         
	// 6640 10722:dup             
	// 6641 10723:iconst_2        
	// 6642 10724:ldc2w           #1869 <Double 2542.6289181000002D>
	// 6643 10727:dastore         
	// 6644 10728:dup             
	// 6645 10729:iconst_3        
	// 6646 10730:ldc2w           #209 <Double 3.0597946D>
	// 6647 10733:dastore         
	// 6648 10734:dup             
	// 6649 10735:iconst_4        
	// 6650 10736:ldc2w           #211 <Double 8.9830009000000004D>
	// 6651 10739:dastore         
	// 6652 10740:dup             
	// 6653 10741:iconst_5        
	// 6654 10742:ldc2w           #1871 <Double -1.2568887D>
	// 6655 10745:dastore         
	// 6656 10746:dup             
	// 6657 10747:bipush          6
	// 6658 10749:ldc2w           #1873 <Double -27.9786565D>
	// 6659 10752:dastore         
	// 6660 10753:dup             
	// 6661 10754:bipush          7
	// 6662 10756:ldc2w           #1875 <Double 272.32962730000003D>
	// 6663 10759:dastore         
	// 6664 10760:dup             
	// 6665 10761:bipush          8
	// 6666 10763:ldc2w           #219 <Double -0.062199999999999998D>
	// 6667 10766:dastore         
	// 6668 10767:astore          170
		double ad171[] = {
			-15.8167442D, 5.1679225999999998D, 2378.6138473000001D, 37.305238799999998D, 8.7346948999999992D, -0.0568887D, -17.395988800000001D, 2.4669636000000001D, -0.70060560000000005D
		};
	// 6669 10769:bipush          9
	// 6670 10771:newarray        double[]
	// 6671 10773:dup             
	// 6672 10774:iconst_0        
	// 6673 10775:ldc2w           #1877 <Double -15.8167442D>
	// 6674 10778:dastore         
	// 6675 10779:dup             
	// 6676 10780:iconst_1        
	// 6677 10781:ldc2w           #1867 <Double 5.1679225999999998D>
	// 6678 10784:dastore         
	// 6679 10785:dup             
	// 6680 10786:iconst_2        
	// 6681 10787:ldc2w           #1879 <Double 2378.6138473000001D>
	// 6682 10790:dastore         
	// 6683 10791:dup             
	// 6684 10792:iconst_3        
	// 6685 10793:ldc2w           #47  <Double 37.305238799999998D>
	// 6686 10796:dastore         
	// 6687 10797:dup             
	// 6688 10798:iconst_4        
	// 6689 10799:ldc2w           #49  <Double 8.7346948999999992D>
	// 6690 10802:dastore         
	// 6691 10803:dup             
	// 6692 10804:iconst_5        
	// 6693 10805:ldc2w           #1881 <Double -0.0568887D>
	// 6694 10808:dastore         
	// 6695 10809:dup             
	// 6696 10810:bipush          6
	// 6697 10812:ldc2w           #1883 <Double -17.395988800000001D>
	// 6698 10815:dastore         
	// 6699 10816:dup             
	// 6700 10817:bipush          7
	// 6701 10819:ldc2w           #1885 <Double 2.4669636000000001D>
	// 6702 10822:dastore         
	// 6703 10823:dup             
	// 6704 10824:bipush          8
	// 6705 10826:ldc2w           #57  <Double -0.70060560000000005D>
	// 6706 10829:dastore         
	// 6707 10830:astore          171
		double ad172[] = {
			-15.5167442D, 5.1679225999999998D, 2337.6100796000001D, 46.896400399999997D, 8.5943556999999995D, 0.2431113D, -10.2983887D, -142.11329509999999D, -0.84519750000000005D
		};
	// 6708 10832:bipush          9
	// 6709 10834:newarray        double[]
	// 6710 10836:dup             
	// 6711 10837:iconst_0        
	// 6712 10838:ldc2w           #1887 <Double -15.5167442D>
	// 6713 10841:dastore         
	// 6714 10842:dup             
	// 6715 10843:iconst_1        
	// 6716 10844:ldc2w           #1867 <Double 5.1679225999999998D>
	// 6717 10847:dastore         
	// 6718 10848:dup             
	// 6719 10849:iconst_2        
	// 6720 10850:ldc2w           #1889 <Double 2337.6100796000001D>
	// 6721 10853:dastore         
	// 6722 10854:dup             
	// 6723 10855:iconst_3        
	// 6724 10856:ldc2w           #541 <Double 46.896400399999997D>
	// 6725 10859:dastore         
	// 6726 10860:dup             
	// 6727 10861:iconst_4        
	// 6728 10862:ldc2w           #543 <Double 8.5943556999999995D>
	// 6729 10865:dastore         
	// 6730 10866:dup             
	// 6731 10867:iconst_5        
	// 6732 10868:ldc2w           #1891 <Double 0.2431113D>
	// 6733 10871:dastore         
	// 6734 10872:dup             
	// 6735 10873:bipush          6
	// 6736 10875:ldc2w           #1893 <Double -10.2983887D>
	// 6737 10878:dastore         
	// 6738 10879:dup             
	// 6739 10880:bipush          7
	// 6740 10882:ldc2w           #1895 <Double -142.11329509999999D>
	// 6741 10885:dastore         
	// 6742 10886:dup             
	// 6743 10887:bipush          8
	// 6744 10889:ldc2w           #551 <Double -0.84519750000000005D>
	// 6745 10892:dastore         
	// 6746 10893:astore          172
		double ad173[] = {
			-14.0167442D, 5.1679225999999998D, 2132.5912410000001D, 110.00047410000001D, 7.0639795000000003D, 1.7431113D, 24.9784337D, -1155.3567175999999D, -1.4008494D
		};
	// 6747 10895:bipush          9
	// 6748 10897:newarray        double[]
	// 6749 10899:dup             
	// 6750 10900:iconst_0        
	// 6751 10901:ldc2w           #1897 <Double -14.0167442D>
	// 6752 10904:dastore         
	// 6753 10905:dup             
	// 6754 10906:iconst_1        
	// 6755 10907:ldc2w           #1867 <Double 5.1679225999999998D>
	// 6756 10910:dastore         
	// 6757 10911:dup             
	// 6758 10912:iconst_2        
	// 6759 10913:ldc2w           #1899 <Double 2132.5912410000001D>
	// 6760 10916:dastore         
	// 6761 10917:dup             
	// 6762 10918:iconst_3        
	// 6763 10919:ldc2w           #111 <Double 110.00047410000001D>
	// 6764 10922:dastore         
	// 6765 10923:dup             
	// 6766 10924:iconst_4        
	// 6767 10925:ldc2w           #113 <Double 7.0639795000000003D>
	// 6768 10928:dastore         
	// 6769 10929:dup             
	// 6770 10930:iconst_5        
	// 6771 10931:ldc2w           #1901 <Double 1.7431113D>
	// 6772 10934:dastore         
	// 6773 10935:dup             
	// 6774 10936:bipush          6
	// 6775 10938:ldc2w           #1903 <Double 24.9784337D>
	// 6776 10941:dastore         
	// 6777 10942:dup             
	// 6778 10943:bipush          7
	// 6779 10945:ldc2w           #1905 <Double -1155.3567175999999D>
	// 6780 10948:dastore         
	// 6781 10949:dup             
	// 6782 10950:bipush          8
	// 6783 10952:ldc2w           #121 <Double -1.4008494D>
	// 6784 10955:dastore         
	// 6785 10956:astore          173
		double ad174[] = {
			-12.8167442D, 5.1679225999999998D, 1968.5761702D, 200.29154579999999D, 3.6574485999999999D, 2.9431113D, 23.995766100000001D, -1249.6113508999999D, -1.5784544D
		};
	// 6786 10958:bipush          9
	// 6787 10960:newarray        double[]
	// 6788 10962:dup             
	// 6789 10963:iconst_0        
	// 6790 10964:ldc2w           #1907 <Double -12.8167442D>
	// 6791 10967:dastore         
	// 6792 10968:dup             
	// 6793 10969:iconst_1        
	// 6794 10970:ldc2w           #1867 <Double 5.1679225999999998D>
	// 6795 10973:dastore         
	// 6796 10974:dup             
	// 6797 10975:iconst_2        
	// 6798 10976:ldc2w           #1909 <Double 1968.5761702D>
	// 6799 10979:dastore         
	// 6800 10980:dup             
	// 6801 10981:iconst_3        
	// 6802 10982:ldc2w           #265 <Double 200.29154579999999D>
	// 6803 10985:dastore         
	// 6804 10986:dup             
	// 6805 10987:iconst_4        
	// 6806 10988:ldc2w           #267 <Double 3.6574485999999999D>
	// 6807 10991:dastore         
	// 6808 10992:dup             
	// 6809 10993:iconst_5        
	// 6810 10994:ldc2w           #1911 <Double 2.9431113D>
	// 6811 10997:dastore         
	// 6812 10998:dup             
	// 6813 10999:bipush          6
	// 6814 11001:ldc2w           #1913 <Double 23.995766100000001D>
	// 6815 11004:dastore         
	// 6816 11005:dup             
	// 6817 11006:bipush          7
	// 6818 11008:ldc2w           #1915 <Double -1249.6113508999999D>
	// 6819 11011:dastore         
	// 6820 11012:dup             
	// 6821 11013:bipush          8
	// 6822 11015:ldc2w           #275 <Double -1.5784544D>
	// 6823 11018:dastore         
	// 6824 11019:astore          174
		double ad175[] = {
			-11.616744199999999D, 5.1679225999999998D, 1804.5610993D, 392.10647540000002D, -5.9244687000000003D, 4.1431113000000002D, 2.7038953000000001D, -363.25768649999998D, -1.4830451D
		};
	// 6825 11021:bipush          9
	// 6826 11023:newarray        double[]
	// 6827 11025:dup             
	// 6828 11026:iconst_0        
	// 6829 11027:ldc2w           #1917 <Double -11.616744199999999D>
	// 6830 11030:dastore         
	// 6831 11031:dup             
	// 6832 11032:iconst_1        
	// 6833 11033:ldc2w           #1867 <Double 5.1679225999999998D>
	// 6834 11036:dastore         
	// 6835 11037:dup             
	// 6836 11038:iconst_2        
	// 6837 11039:ldc2w           #1919 <Double 1804.5610993D>
	// 6838 11042:dastore         
	// 6839 11043:dup             
	// 6840 11044:iconst_3        
	// 6841 11045:ldc2w           #191 <Double 392.10647540000002D>
	// 6842 11048:dastore         
	// 6843 11049:dup             
	// 6844 11050:iconst_4        
	// 6845 11051:ldc2w           #193 <Double -5.9244687000000003D>
	// 6846 11054:dastore         
	// 6847 11055:dup             
	// 6848 11056:iconst_5        
	// 6849 11057:ldc2w           #1921 <Double 4.1431113000000002D>
	// 6850 11060:dastore         
	// 6851 11061:dup             
	// 6852 11062:bipush          6
	// 6853 11064:ldc2w           #1923 <Double 2.7038953000000001D>
	// 6854 11067:dastore         
	// 6855 11068:dup             
	// 6856 11069:bipush          7
	// 6857 11071:ldc2w           #1925 <Double -363.25768649999998D>
	// 6858 11074:dastore         
	// 6859 11075:dup             
	// 6860 11076:bipush          8
	// 6861 11078:ldc2w           #201 <Double -1.4830451D>
	// 6862 11081:dastore         
	// 6863 11082:astore          175
		double ad176[] = {
			-14.7589723D, 5.7192432000000002D, 2230.3901292D, 11.2644424D, 8.9614528999999994D, -0.9577194D, -28.195167699999999D, 231.3417153D, -0.22733419999999999D
		};
	// 6864 11084:bipush          9
	// 6865 11086:newarray        double[]
	// 6866 11088:dup             
	// 6867 11089:iconst_0        
	// 6868 11090:ldc2w           #1927 <Double -14.7589723D>
	// 6869 11093:dastore         
	// 6870 11094:dup             
	// 6871 11095:iconst_1        
	// 6872 11096:ldc2w           #1929 <Double 5.7192432000000002D>
	// 6873 11099:dastore         
	// 6874 11100:dup             
	// 6875 11101:iconst_2        
	// 6876 11102:ldc2w           #1931 <Double 2230.3901292D>
	// 6877 11105:dastore         
	// 6878 11106:dup             
	// 6879 11107:iconst_3        
	// 6880 11108:ldc2w           #319 <Double 11.2644424D>
	// 6881 11111:dastore         
	// 6882 11112:dup             
	// 6883 11113:iconst_4        
	// 6884 11114:ldc2w           #321 <Double 8.9614528999999994D>
	// 6885 11117:dastore         
	// 6886 11118:dup             
	// 6887 11119:iconst_5        
	// 6888 11120:ldc2w           #1933 <Double -0.9577194D>
	// 6889 11123:dastore         
	// 6890 11124:dup             
	// 6891 11125:bipush          6
	// 6892 11127:ldc2w           #1935 <Double -28.195167699999999D>
	// 6893 11130:dastore         
	// 6894 11131:dup             
	// 6895 11132:bipush          7
	// 6896 11134:ldc2w           #1937 <Double 231.3417153D>
	// 6897 11137:dastore         
	// 6898 11138:dup             
	// 6899 11139:bipush          8
	// 6900 11141:ldc2w           #329 <Double -0.22733419999999999D>
	// 6901 11144:dastore         
	// 6902 11145:astore          176
		double ad177[] = {
			-14.1589723D, 5.7192432000000002D, 2145.07467D, 28.2628214D, 8.8398648000000009D, -0.35771940000000002D, -22.755039400000001D, 105.8265889D, -0.54830319999999999D
		};
	// 6903 11147:bipush          9
	// 6904 11149:newarray        double[]
	// 6905 11151:dup             
	// 6906 11152:iconst_0        
	// 6907 11153:ldc2w           #1939 <Double -14.1589723D>
	// 6908 11156:dastore         
	// 6909 11157:dup             
	// 6910 11158:iconst_1        
	// 6911 11159:ldc2w           #1929 <Double 5.7192432000000002D>
	// 6912 11162:dastore         
	// 6913 11163:dup             
	// 6914 11164:iconst_2        
	// 6915 11165:ldc2w           #1941 <Double 2145.07467D>
	// 6916 11168:dastore         
	// 6917 11169:dup             
	// 6918 11170:iconst_3        
	// 6919 11171:ldc2w           #31  <Double 28.2628214D>
	// 6920 11174:dastore         
	// 6921 11175:dup             
	// 6922 11176:iconst_4        
	// 6923 11177:ldc2w           #33  <Double 8.8398648000000009D>
	// 6924 11180:dastore         
	// 6925 11181:dup             
	// 6926 11182:iconst_5        
	// 6927 11183:ldc2w           #1943 <Double -0.35771940000000002D>
	// 6928 11186:dastore         
	// 6929 11187:dup             
	// 6930 11188:bipush          6
	// 6931 11190:ldc2w           #1945 <Double -22.755039400000001D>
	// 6932 11193:dastore         
	// 6933 11194:dup             
	// 6934 11195:bipush          7
	// 6935 11197:ldc2w           #1947 <Double 105.8265889D>
	// 6936 11200:dastore         
	// 6937 11201:dup             
	// 6938 11202:bipush          8
	// 6939 11204:ldc2w           #41  <Double -0.54830319999999999D>
	// 6940 11207:dastore         
	// 6941 11208:astore          177
		double ad178[] = {
			-13.558972300000001D, 5.7192432000000002D, 2059.7592109000002D, 46.896400399999997D, 8.5943556999999995D, 0.24228060000000001D, -9.9983740999999995D, -147.17475709999999D, -0.84519750000000005D
		};
	// 6942 11210:bipush          9
	// 6943 11212:newarray        double[]
	// 6944 11214:dup             
	// 6945 11215:iconst_0        
	// 6946 11216:ldc2w           #1949 <Double -13.558972300000001D>
	// 6947 11219:dastore         
	// 6948 11220:dup             
	// 6949 11221:iconst_1        
	// 6950 11222:ldc2w           #1929 <Double 5.7192432000000002D>
	// 6951 11225:dastore         
	// 6952 11226:dup             
	// 6953 11227:iconst_2        
	// 6954 11228:ldc2w           #1951 <Double 2059.7592109000002D>
	// 6955 11231:dastore         
	// 6956 11232:dup             
	// 6957 11233:iconst_3        
	// 6958 11234:ldc2w           #541 <Double 46.896400399999997D>
	// 6959 11237:dastore         
	// 6960 11238:dup             
	// 6961 11239:iconst_4        
	// 6962 11240:ldc2w           #543 <Double 8.5943556999999995D>
	// 6963 11243:dastore         
	// 6964 11244:dup             
	// 6965 11245:iconst_5        
	// 6966 11246:ldc2w           #1953 <Double 0.24228060000000001D>
	// 6967 11249:dastore         
	// 6968 11250:dup             
	// 6969 11251:bipush          6
	// 6970 11253:ldc2w           #1955 <Double -9.9983740999999995D>
	// 6971 11256:dastore         
	// 6972 11257:dup             
	// 6973 11258:bipush          7
	// 6974 11260:ldc2w           #1957 <Double -147.17475709999999D>
	// 6975 11263:dastore         
	// 6976 11264:dup             
	// 6977 11265:bipush          8
	// 6978 11267:ldc2w           #551 <Double -0.84519750000000005D>
	// 6979 11270:dastore         
	// 6980 11271:astore          178
		double ad179[] = {
			-12.058972300000001D, 5.7192432000000002D, 1846.4705629D, 110.00047410000001D, 7.0639795000000003D, 1.7422806D, 25.278448300000001D, -1164.9183989999999D, -1.4008494D
		};
	// 6981 11273:bipush          9
	// 6982 11275:newarray        double[]
	// 6983 11277:dup             
	// 6984 11278:iconst_0        
	// 6985 11279:ldc2w           #1959 <Double -12.058972300000001D>
	// 6986 11282:dastore         
	// 6987 11283:dup             
	// 6988 11284:iconst_1        
	// 6989 11285:ldc2w           #1929 <Double 5.7192432000000002D>
	// 6990 11288:dastore         
	// 6991 11289:dup             
	// 6992 11290:iconst_2        
	// 6993 11291:ldc2w           #1961 <Double 1846.4705629D>
	// 6994 11294:dastore         
	// 6995 11295:dup             
	// 6996 11296:iconst_3        
	// 6997 11297:ldc2w           #111 <Double 110.00047410000001D>
	// 6998 11300:dastore         
	// 6999 11301:dup             
	// 7000 11302:iconst_4        
	// 7001 11303:ldc2w           #113 <Double 7.0639795000000003D>
	// 7002 11306:dastore         
	// 7003 11307:dup             
	// 7004 11308:iconst_5        
	// 7005 11309:ldc2w           #1963 <Double 1.7422806D>
	// 7006 11312:dastore         
	// 7007 11313:dup             
	// 7008 11314:bipush          6
	// 7009 11316:ldc2w           #1965 <Double 25.278448300000001D>
	// 7010 11319:dastore         
	// 7011 11320:dup             
	// 7012 11321:bipush          7
	// 7013 11323:ldc2w           #1967 <Double -1164.9183989999999D>
	// 7014 11326:dastore         
	// 7015 11327:dup             
	// 7016 11328:bipush          8
	// 7017 11330:ldc2w           #121 <Double -1.4008494D>
	// 7018 11333:dastore         
	// 7019 11334:astore          179
		double ad180[] = {
			-11.458972299999999D, 5.7192432000000002D, 1761.1551036999999D, 148.1152635D, 5.7586041999999997D, 2.3422806D, 28.938891900000002D, -1369.1989851000001D, -1.5229775000000001D
		};
	// 7020 11336:bipush          9
	// 7021 11338:newarray        double[]
	// 7022 11340:dup             
	// 7023 11341:iconst_0        
	// 7024 11342:ldc2w           #1969 <Double -11.458972299999999D>
	// 7025 11345:dastore         
	// 7026 11346:dup             
	// 7027 11347:iconst_1        
	// 7028 11348:ldc2w           #1929 <Double 5.7192432000000002D>
	// 7029 11351:dastore         
	// 7030 11352:dup             
	// 7031 11353:iconst_2        
	// 7032 11354:ldc2w           #1971 <Double 1761.1551036999999D>
	// 7033 11357:dastore         
	// 7034 11358:dup             
	// 7035 11359:iconst_3        
	// 7036 11360:ldc2w           #463 <Double 148.1152635D>
	// 7037 11363:dastore         
	// 7038 11364:dup             
	// 7039 11365:iconst_4        
	// 7040 11366:ldc2w           #465 <Double 5.7586041999999997D>
	// 7041 11369:dastore         
	// 7042 11370:dup             
	// 7043 11371:iconst_5        
	// 7044 11372:ldc2w           #1973 <Double 2.3422806D>
	// 7045 11375:dastore         
	// 7046 11376:dup             
	// 7047 11377:bipush          6
	// 7048 11379:ldc2w           #1975 <Double 28.938891900000002D>
	// 7049 11382:dastore         
	// 7050 11383:dup             
	// 7051 11384:bipush          7
	// 7052 11386:ldc2w           #1977 <Double -1369.1989851000001D>
	// 7053 11389:dastore         
	// 7054 11390:dup             
	// 7055 11391:bipush          8
	// 7056 11393:ldc2w           #473 <Double -1.5229775000000001D>
	// 7057 11396:dastore         
	// 7058 11397:astore          180
		double ad181[] = {
			-10.8589723D, 5.7192432000000002D, 1675.8396445999999D, 200.29154579999999D, 3.6574485999999999D, 2.9422806000000001D, 24.295780700000002D, -1262.7732079D, -1.5784544D
		};
	// 7059 11399:bipush          9
	// 7060 11401:newarray        double[]
	// 7061 11403:dup             
	// 7062 11404:iconst_0        
	// 7063 11405:ldc2w           #1979 <Double -10.8589723D>
	// 7064 11408:dastore         
	// 7065 11409:dup             
	// 7066 11410:iconst_1        
	// 7067 11411:ldc2w           #1929 <Double 5.7192432000000002D>
	// 7068 11414:dastore         
	// 7069 11415:dup             
	// 7070 11416:iconst_2        
	// 7071 11417:ldc2w           #1981 <Double 1675.8396445999999D>
	// 7072 11420:dastore         
	// 7073 11421:dup             
	// 7074 11422:iconst_3        
	// 7075 11423:ldc2w           #265 <Double 200.29154579999999D>
	// 7076 11426:dastore         
	// 7077 11427:dup             
	// 7078 11428:iconst_4        
	// 7079 11429:ldc2w           #267 <Double 3.6574485999999999D>
	// 7080 11432:dastore         
	// 7081 11433:dup             
	// 7082 11434:iconst_5        
	// 7083 11435:ldc2w           #1983 <Double 2.9422806000000001D>
	// 7084 11438:dastore         
	// 7085 11439:dup             
	// 7086 11440:bipush          6
	// 7087 11442:ldc2w           #1985 <Double 24.295780700000002D>
	// 7088 11445:dastore         
	// 7089 11446:dup             
	// 7090 11447:bipush          7
	// 7091 11449:ldc2w           #1987 <Double -1262.7732079D>
	// 7092 11452:dastore         
	// 7093 11453:dup             
	// 7094 11454:bipush          8
	// 7095 11456:ldc2w           #275 <Double -1.5784544D>
	// 7096 11459:dastore         
	// 7097 11460:astore          181
		double ad182[] = {
			-10.558972300000001D, 5.7192432000000002D, 1633.1819149999999D, 234.27778710000001D, 2.1401053000000001D, 3.2422806D, 19.598180599999999D, -1094.5643213999999D, -1.5803442000000001D
		};
	// 7098 11462:bipush          9
	// 7099 11464:newarray        double[]
	// 7100 11466:dup             
	// 7101 11467:iconst_0        
	// 7102 11468:ldc2w           #1989 <Double -10.558972300000001D>
	// 7103 11471:dastore         
	// 7104 11472:dup             
	// 7105 11473:iconst_1        
	// 7106 11474:ldc2w           #1929 <Double 5.7192432000000002D>
	// 7107 11477:dastore         
	// 7108 11478:dup             
	// 7109 11479:iconst_2        
	// 7110 11480:ldc2w           #1991 <Double 1633.1819149999999D>
	// 7111 11483:dastore         
	// 7112 11484:dup             
	// 7113 11485:iconst_3        
	// 7114 11486:ldc2w           #159 <Double 234.27778710000001D>
	// 7115 11489:dastore         
	// 7116 11490:dup             
	// 7117 11491:iconst_4        
	// 7118 11492:ldc2w           #161 <Double 2.1401053000000001D>
	// 7119 11495:dastore         
	// 7120 11496:dup             
	// 7121 11497:iconst_5        
	// 7122 11498:ldc2w           #1993 <Double 3.2422806D>
	// 7123 11501:dastore         
	// 7124 11502:dup             
	// 7125 11503:bipush          6
	// 7126 11505:ldc2w           #1995 <Double 19.598180599999999D>
	// 7127 11508:dastore         
	// 7128 11509:dup             
	// 7129 11510:bipush          7
	// 7130 11512:ldc2w           #1997 <Double -1094.5643213999999D>
	// 7131 11515:dastore         
	// 7132 11516:dup             
	// 7133 11517:bipush          8
	// 7134 11519:ldc2w           #169 <Double -1.5803442000000001D>
	// 7135 11522:dastore         
	// 7136 11523:astore          182
		double ad183[] = {
			-10.2589723D, 5.7192432000000002D, 1590.5241854000001D, 275.7268449D, 0.1651599D, 3.5422805999999998D, 14.039343799999999D, -871.31529490000003D, -1.5649227999999999D
		};
	// 7137 11525:bipush          9
	// 7138 11527:newarray        double[]
	// 7139 11529:dup             
	// 7140 11530:iconst_0        
	// 7141 11531:ldc2w           #1999 <Double -10.2589723D>
	// 7142 11534:dastore         
	// 7143 11535:dup             
	// 7144 11536:iconst_1        
	// 7145 11537:ldc2w           #1929 <Double 5.7192432000000002D>
	// 7146 11540:dastore         
	// 7147 11541:dup             
	// 7148 11542:iconst_2        
	// 7149 11543:ldc2w           #2001 <Double 1590.5241854000001D>
	// 7150 11546:dastore         
	// 7151 11547:dup             
	// 7152 11548:iconst_3        
	// 7153 11549:ldc2w           #175 <Double 275.7268449D>
	// 7154 11552:dastore         
	// 7155 11553:dup             
	// 7156 11554:iconst_4        
	// 7157 11555:ldc2w           #177 <Double 0.1651599D>
	// 7158 11558:dastore         
	// 7159 11559:dup             
	// 7160 11560:iconst_5        
	// 7161 11561:ldc2w           #2003 <Double 3.5422805999999998D>
	// 7162 11564:dastore         
	// 7163 11565:dup             
	// 7164 11566:bipush          6
	// 7165 11568:ldc2w           #2005 <Double 14.039343799999999D>
	// 7166 11571:dastore         
	// 7167 11572:dup             
	// 7168 11573:bipush          7
	// 7169 11575:ldc2w           #2007 <Double -871.31529490000003D>
	// 7170 11578:dastore         
	// 7171 11579:dup             
	// 7172 11580:bipush          8
	// 7173 11582:ldc2w           #185 <Double -1.5649227999999999D>
	// 7174 11585:dastore         
	// 7175 11586:astore          183
		double ad184[] = {
			-9.9589722999999992D, 5.7192432000000002D, 1547.8664558D, 327.13300479999998D, -2.4385346000000001D, 3.8422806D, 8.2808723000000004D, -621.35809970000003D, -1.5323681D
		};
	// 7176 11588:bipush          9
	// 7177 11590:newarray        double[]
	// 7178 11592:dup             
	// 7179 11593:iconst_0        
	// 7180 11594:ldc2w           #2009 <Double -9.9589722999999992D>
	// 7181 11597:dastore         
	// 7182 11598:dup             
	// 7183 11599:iconst_1        
	// 7184 11600:ldc2w           #1929 <Double 5.7192432000000002D>
	// 7185 11603:dastore         
	// 7186 11604:dup             
	// 7187 11605:iconst_2        
	// 7188 11606:ldc2w           #2011 <Double 1547.8664558D>
	// 7189 11609:dastore         
	// 7190 11610:dup             
	// 7191 11611:iconst_3        
	// 7192 11612:ldc2w           #291 <Double 327.13300479999998D>
	// 7193 11615:dastore         
	// 7194 11616:dup             
	// 7195 11617:iconst_4        
	// 7196 11618:ldc2w           #293 <Double -2.4385346000000001D>
	// 7197 11621:dastore         
	// 7198 11622:dup             
	// 7199 11623:iconst_5        
	// 7200 11624:ldc2w           #2013 <Double 3.8422806D>
	// 7201 11627:dastore         
	// 7202 11628:dup             
	// 7203 11629:bipush          6
	// 7204 11631:ldc2w           #2015 <Double 8.2808723000000004D>
	// 7205 11634:dastore         
	// 7206 11635:dup             
	// 7207 11636:bipush          7
	// 7208 11638:ldc2w           #2017 <Double -621.35809970000003D>
	// 7209 11641:dastore         
	// 7210 11642:dup             
	// 7211 11643:bipush          8
	// 7212 11645:ldc2w           #301 <Double -1.5323681D>
	// 7213 11648:dastore         
	// 7214 11649:astore          184
		a = (new double[][] {
			new double[] {
				-28.951737900000001D, -1.3875926999999999D, 2568.2098943999999D, 3.0597946D, 8.9830009000000004D, -1.2925447000000001D, -34.278646299999998D, 290.26633040000002D, -0.062199999999999998D
			}, new double[] {
				-28.651737900000001D, -1.3875926999999999D, 2546.8726723999998D, 11.2644424D, 8.9614528999999994D, -0.99254469999999995D, -34.795172200000003D, 269.63967439999999D, -0.22733419999999999D
			}, ad, ad1, ad2, new double[] {
				-27.451737900000001D, -1.3875926999999999D, 2461.5237846999999D, 46.896400399999997D, 8.5943556999999995D, 0.20745530000000001D, -16.5983786D, -29.676743900000002D, -0.84519750000000005D
			}, ad3, new double[] {
				-26.8517379D, -1.3875926999999999D, 2418.8493407999999D, 68.407805800000006D, 8.1813959000000001D, 0.80745529999999999D, -0.48107030000000001D, -381.76253050000003D, -1.1049982D
			}, ad4, ad5, ad6, ad7, new double[] {
				-25.3517379D, -1.3875926999999999D, 2312.1632310999998D, 148.1152635D, 5.7586041999999997D, 2.3074553D, 22.338887400000001D, -1113.1008773999999D, -1.5229775000000001D
			}, ad8, new double[] {
				-24.751737899999998D, -1.3875926999999999D, 2269.4887871999999D, 200.29154579999999D, 3.6574485999999999D, 2.9074553000000001D, 17.695776200000001D, -967.07507320000002D, -1.5784544D
			}, ad9, ad10, new double[] {
				-23.8517379D, -1.3875926999999999D, 2205.4771214000002D, 327.13300479999998D, -2.4385346000000001D, 3.8074553D, 1.6808677999999999D, -266.25992439999999D, -1.5323681D
			}, ad11, ad12, new double[] {
				-28.735007800000002D, -0.83208029999999999D, 2549.9902794D, 11.2644424D, 8.9614528999999994D, -0.99341599999999997D, -34.4951881D, 268.12924120000002D, -0.22733419999999999D
			}, ad13, new double[] {
				-28.1350078D, -0.83208029999999999D, 2503.9827611999999D, 28.2628214D, 8.8398648000000009D, -0.39341599999999999D, -29.055059799999999D, 180.41423689999999D, -0.54830319999999999D
			}, new double[] {
				-27.8350078D, -0.83208029999999999D, 2480.979002D, 37.305238799999998D, 8.7346948999999992D, -0.093415999999999999D, -23.3959945D, 91.793254500000003D, -0.70060560000000005D
			}, new double[] {
				-27.535007799999999D, -0.83208029999999999D, 2457.9752429D, 46.896400399999997D, 8.5943556999999995D, 0.20658399999999999D, -16.298394399999999D, -34.786987000000003D, -0.84519750000000005D
			}, new double[] {
				-27.235007800000002D, -0.83208029999999999D, 2434.9714837000001D, 57.2001287D, 8.4126647000000006D, 0.50658400000000003D, -8.3395575999999991D, -197.7702682D, -0.98049019999999998D
			}, new double[] {
				-26.935007800000001D, -0.83208029999999999D, 2411.9677246000001D, 68.407805800000006D, 8.1813959000000001D, 0.80658399999999997D, -0.1810862D, -388.67267850000002D, -1.1049982D
			}, new double[] {
				-26.6350078D, -0.83208029999999999D, 2388.9639655000001D, 80.747736000000003D, 7.8897272999999997D, 1.106584D, 7.4958762999999999D, -592.60154480000006D, -1.2173562D
			}, ad14, ad15, ad16, new double[] {
				-25.435007800000001D, -0.83208029999999999D, 2296.9489288999998D, 148.1152635D, 5.7586041999999997D, 2.306584D, 22.638871600000002D, -1124.5107877999999D, -1.5229775000000001D
			}, new double[] {
				-25.1350078D, -0.83208029999999999D, 2273.9451697999998D, 171.99884599999999D, 4.8356763999999997D, 2.6065839999999998D, 21.2548256D, -1093.4785305D, -1.5592649999999999D
			}, ad17, ad18, new double[] {
				-24.235007800000002D, -0.83208029999999999D, 2204.9338923D, 275.7268449D, 0.1651599D, 3.5065840000000001D, 7.7393234D, -551.02685340000005D, -1.5649227999999999D
			}, ad19, ad20, new double[] {
				-27.077328300000001D, -0.2807772D, 2420.8864662999999D, 3.0597946D, 8.9830009000000004D, -1.2944316D, -33.678682600000002D, 289.05910699999998D, -0.062199999999999998D
			}, ad21, new double[] {
				-26.4773283D, -0.2807772D, 2371.5711295000001D, 19.625597299999999D, 8.9143979000000009D, -0.69443160000000004D, -32.539126199999998D, 233.5277921D, -0.38996530000000001D
			}, new double[] {
				-26.177328299999999D, -0.2807772D, 2346.9134610999999D, 28.2628214D, 8.8398648000000009D, -0.39443159999999999D, -28.755080199999998D, 177.11767839999999D, -0.54830319999999999D
			}, new double[] {
				-25.877328299999999D, -0.2807772D, 2322.2557926999998D, 37.305238799999998D, 8.7346948999999992D, -0.094431600000000004D, -23.096015000000001D, 87.596757400000001D, -0.70060560000000005D
			}, new double[] {
				-25.577328300000001D, -0.2807772D, 2297.5981244D, 46.896400399999997D, 8.5943556999999995D, 0.20556840000000001D, -15.9984149D, -39.883422799999998D, -0.84519750000000005D
			}, ad22, ad23, new double[] {
				-24.677328299999999D, -0.2807772D, 2223.6251192D, 80.747736000000003D, 7.8897272999999997D, 1.1055683999999999D, 7.7958558D, -600.39779650000003D, -1.2173562D
			}, ad24, ad25, new double[] {
				-23.777328300000001D, -0.2807772D, 2149.6521140999998D, 127.6888198D, 6.4866308999999998D, 2.0055684D, 22.1949334D, -1086.0948565000001D, -1.4699811D
			}, new double[] {
				-23.4773283D, -0.2807772D, 2124.9944457000001D, 148.1152635D, 5.7586041999999997D, 2.3055683999999999D, 22.938851100000001D, -1135.9067938999999D, -1.5229775000000001D
			}, new double[] {
				-23.177328299999999D, -0.2807772D, 2100.3367773D, 171.99884599999999D, 4.8356763999999997D, 2.6055684000000001D, 21.554805099999999D, -1105.7744754D, -1.5592649999999999D
			}, ad26, ad27, new double[] {
				-22.277328300000001D, -0.2807772D, 2026.3637721D, 275.7268449D, 0.1651599D, 3.5055684D, 8.0393030000000003D, -566.02261410000006D, -1.5649227999999999D
			}, ad28, new double[] {
				-21.677328299999999D, -0.2807772D, 1977.0484354D, 392.10647540000002D, -5.9244687000000003D, 4.1055684000000001D, -2.9961308999999998D, -38.726793499999999D, -1.4830451D
			}, ad29, ad30, new double[] {
				-22.611670700000001D, 0.24171519999999999D, 2057.8965609000002D, 19.625597299999999D, 8.9143979000000009D, -0.69563629999999999D, -32.239153399999999D, 231.14941049999999D, -0.38996530000000001D
			}, new double[] {
				-22.311670700000001D, 0.24171519999999999D, 2031.6714153D, 28.2628214D, 8.8398648000000009D, -0.3956363D, -28.455107399999999D, 173.83937850000001D, -0.54830319999999999D
			}, ad31, new double[] {
				-21.711670699999999D, 0.24171519999999999D, 1979.2211241D, 46.896400399999997D, 8.5943556999999995D, 0.20436370000000001D, -15.698442099999999D, -44.961559600000001D, -0.84519750000000005D
			}, ad32, new double[] {
				-21.111670700000001D, 0.24171519999999999D, 1926.7708329D, 68.407805800000006D, 8.1813959000000001D, 0.80436370000000001D, 0.41886620000000002D, -402.4469651D, -1.1049982D
			}, new double[] {
				-20.811670700000001D, 0.24171519999999999D, 1900.5456873000001D, 80.747736000000003D, 7.8897272999999997D, 1.1043636999999999D, 8.0958286000000008D, -608.17568849999998D, -1.2173562D
			}, ad33, new double[] {
				-20.211670699999999D, 0.24171519999999999D, 1848.0953961D, 110.00047410000001D, 7.0639795000000003D, 1.7043637D, 19.578380299999999D, -977.2041815D, -1.4008494D
			}, new double[] {
				-19.911670699999998D, 0.24171519999999999D, 1821.8702505000001D, 127.6888198D, 6.4866308999999998D, 2.0043636999999999D, 22.494906199999999D, -1096.5725038D, -1.4699811D
			}, ad34, new double[] {
				-19.311670700000001D, 0.24171519999999999D, 1769.4199593999999D, 171.99884599999999D, 4.8356763999999997D, 2.6043636999999999D, 21.854777899999998D, -1118.0519594D, -1.5592649999999999D
			}, ad35, ad36, new double[] {
				-18.411670699999998D, 0.24171519999999999D, 1690.7445226D, 275.7268449D, 0.1651599D, 3.5043636999999999D, 8.3392757999999994D, -580.99985340000001D, -1.5649227999999999D
			}, new double[] {
				-18.111670700000001D, 0.24171519999999999D, 1664.5193770000001D, 327.13300479999998D, -2.4385346000000001D, 3.8043637000000001D, 2.5808043000000001D, -313.94245419999999D, -1.5323681D
			}, ad37, ad38, ad39, new double[] {
				-17.157792799999999D, 0.71361470000000005D, 1601.2454585D, 19.625597299999999D, 8.9143979000000009D, -0.69709739999999998D, -31.9391909D, 228.79600970000001D, -0.38996530000000001D
			}, ad40, new double[] {
				-16.557792800000001D, 0.71361470000000005D, 1545.9637703000001D, 37.305238799999998D, 8.7346948999999992D, -0.0970974D, -22.496079699999999D, 79.265363300000004D, -0.70060560000000005D
			}, ad41, new double[] {
				-15.9577928D, 0.71361470000000005D, 1490.6820822D, 57.2001287D, 8.4126647000000006D, 0.50290259999999998D, -7.4396427999999997D, -215.6976483D, -0.98049019999999998D
			}, new double[] {
				-15.657792799999999D, 0.71361470000000005D, 1463.0412381000001D, 68.407805800000006D, 8.1813959000000001D, 0.80290260000000002D, 0.71882869999999999D, -409.29980319999999D, -1.1049982D
			}, ad42, new double[] {
				-15.0577928D, 0.71361470000000005D, 1407.7595498999999D, 94.497482399999996D, 7.5234689000000001D, 1.4029026D, 14.9572343D, -815.82261870000002D, -1.3163339000000001D
			}, new double[] {
				-14.757792800000001D, 0.71361470000000005D, 1380.1187058999999D, 110.00047410000001D, 7.0639795000000003D, 1.7029026D, 19.878342799999999D, -986.75668189999999D, -1.4008494D
			}, new double[] {
				-14.4577928D, 0.71361470000000005D, 1352.4778618D, 127.6888198D, 6.4866308999999998D, 2.0029026000000001D, 22.794868699999999D, -1107.0248916D, -1.4699811D
			}, ad43, new double[] {
				-13.8577928D, 0.71361470000000005D, 1297.1961736000001D, 171.99884599999999D, 4.8356763999999997D, 2.6029026000000002D, 22.154740400000001D, -1130.3041221999999D, -1.5592649999999999D
			}, new double[] {
				-13.5577928D, 0.71361470000000005D, 1269.5553295D, 200.29154579999999D, 3.6574485999999999D, 2.9029026D, 18.895675199999999D, -1019.8102246D, -1.5784544D
			}, ad44, new double[] {
				-12.9577928D, 0.71361470000000005D, 1214.2736414000001D, 275.7268449D, 0.1651599D, 3.5029026000000001D, 8.6392383000000006D, -595.95167849999996D, -1.5649227999999999D
			}, new double[] {
				-12.657792799999999D, 0.71361470000000005D, 1186.6327973D, 327.13300479999998D, -2.4385346000000001D, 3.8029025999999999D, 2.8807668D, -329.79416670000001D, -1.5323681D
			}, new double[] {
				-12.3577928D, 0.71361470000000005D, 1158.9919531999999D, 392.10647540000002D, -5.9244687000000003D, 4.1029026000000002D, -2.3961956D, -72.255469599999998D, -1.4830451D
			}, new double[] {
				-11.190950600000001D, 1.1180895D, 1090.8163443999999D, 3.0597946D, 8.9830009000000004D, -1.2989211000000001D, -32.778801700000002D, 287.4089209D, -0.062199999999999998D
			}, new double[] {
				-10.8909506D, 1.1180895D, 1061.9620758999999D, 11.2644424D, 8.9614528999999994D, -0.99892110000000001D, -33.295327499999999D, 262.28273089999999D, -0.22733419999999999D
			}, new double[] {
				-10.590950599999999D, 1.1180895D, 1033.1078075D, 19.625597299999999D, 8.9143979000000009D, -0.69892109999999996D, -31.639245200000001D, 226.47832009999999D, -0.38996530000000001D
			}, new double[] {
				-10.2909506D, 1.1180895D, 1004.253539D, 28.2628214D, 8.8398648000000009D, -0.39892109999999997D, -27.855199200000001D, 167.36856349999999D, -0.54830319999999999D
			}, ad45, ad46, ad47, new double[] {
				-9.0909505999999993D, 1.1180895D, 888.83646510000005D, 68.407805800000006D, 8.1813959000000001D, 0.80107890000000004D, 1.0187744000000001D, -416.11667829999999D, -1.1049982D
			}, ad48, ad49, new double[] {
				-8.1909506000000007D, 1.1180895D, 802.27365959999997D, 110.00047410000001D, 7.0639795000000003D, 1.7010788999999999D, 20.178288500000001D, -996.27306840000006D, -1.4008494D
			}, new double[] {
				-7.8909506D, 1.1180895D, 773.41939109999998D, 127.6888198D, 6.4866308999999998D, 2.0010789D, 23.094814400000001D, -1117.4411152D, -1.4699811D
			}, ad50, new double[] {
				-7.2909506000000004D, 1.1180895D, 715.71085419999997D, 171.99884599999999D, 4.8356763999999997D, 2.6010789000000001D, 22.4546861D, -1142.5200199000001D, -1.5592649999999999D
			}, ad51, new double[] {
				-6.6909505999999999D, 1.1180895D, 658.00231719999999D, 234.27778710000001D, 2.1401053000000001D, 3.2010789000000002D, 14.498020800000001D, -849.41659360000006D, -1.5803442000000001D
			}, ad52, ad53, new double[] {
				-5.7909506000000004D, 1.1180895D, 571.43951179999999D, 392.10647540000002D, -5.9244687000000003D, 4.1010789000000001D, -2.0962499000000001D, -88.970552900000001D, -1.4830451D
			}, new double[] {
				-4.0953996999999998D, 1.4449038000000001D, 458.56355880000001D, 3.0597946D, 8.9830009000000004D, -1.3012877D, -32.478885499999997D, 286.94478320000002D, -0.062199999999999998D
			}, ad54, ad55, new double[] {
				-3.1953996999999998D, 1.4449038000000001D, 369.05942440000001D, 28.2628214D, 8.8398648000000009D, -0.40128770000000002D, -27.5552831D, 164.2051807D, -0.54830319999999999D
			}, new double[] {
				-2.8953997D, 1.4449038000000001D, 339.22471300000001D, 37.305238799999998D, 8.7346948999999992D, -0.10128769999999999D, -21.8962179D, 71.084868299999997D, -0.70060560000000005D
			}, new double[] {
				-2.5953997000000002D, 1.4449038000000001D, 309.39000149999998D, 46.896400399999997D, 8.5943556999999995D, 0.19871230000000001D, -14.798617800000001D, -59.994703199999996D, -0.84519750000000005D
			}, new double[] {
				-2.2953996999999999D, 1.4449038000000001D, 279.55529000000001D, 57.2001287D, 8.4126647000000006D, 0.4987123D, -6.8397810000000003D, -227.47731429999999D, -0.98049019999999998D
			}, ad56, ad57, new double[] {
				-1.3953997D, 1.4449038000000001D, 190.05115559999999D, 94.497482399999996D, 7.5234689000000001D, 1.3987122999999999D, 15.557096100000001D, -833.00104099999999D, -1.3163339000000001D
			}, new double[] {
				-1.0953997D, 1.4449038000000001D, 160.21644420000001D, 110.00047410000001D, 7.0639795000000003D, 1.6987123D, 20.478204699999999D, -1005.7346897D, -1.4008494D
			}, new double[] {
				-0.79539970000000004D, 1.4449038000000001D, 130.38173269999999D, 127.6888198D, 6.4866308999999998D, 1.9987123D, 23.394730500000001D, -1127.8024849000001D, -1.4699811D
			}, ad58, new double[] {
				-0.19539970000000001D, 1.4449038000000001D, 70.7123098D, 171.99884599999999D, 4.8356763999999997D, 2.5987122999999999D, 22.754602200000001D, -1154.6808864D, -1.5592649999999999D
			}, ad59, new double[] {
				0.40460030000000002D, 1.4449038000000001D, 11.0428868D, 234.27778710000001D, 2.1401053000000001D, 3.1987123D, 14.7979369D, -863.37695670000005D, -1.5803442000000001D
			}, new double[] {
				0.70460029999999996D, 1.4449038000000001D, -18.791824600000002D, 275.7268449D, 0.1651599D, 3.4987123000000002D, 9.2391000999999999D, -625.72719910000001D, -1.5649227999999999D
			}, new double[] {
				1.0046002999999999D, 1.4449038000000001D, -48.626536100000003D, 327.13300479999998D, -2.4385346000000001D, 3.7987123D, 3.4806286000000002D, -361.36927279999998D, -1.5323681D
			}, ad60, new double[] {
				2.8927451D, 1.6914144D, -184.87363250000001D, 3.0597946D, 8.9830009000000004D, -1.3045357D, -32.1790278D, 286.56898660000002D, -0.062199999999999998D
			}, new double[] {
				3.1927450999999998D, 1.6914144D, -215.4478757D, 11.2644424D, 8.9614528999999994D, -1.0045356999999999D, -32.695553699999998D, 259.64347509999999D, -0.22733419999999999D
			}, new double[] {
				3.4927451D, 1.6914144D, -246.02211879999999D, 19.625597299999999D, 8.9143979000000009D, -0.70453569999999999D, -31.0394714D, 222.03974270000001D, -0.38996530000000001D
			}, new double[] {
				3.7927450999999999D, 1.6914144D, -276.596362D, 28.2628214D, 8.8398648000000009D, -0.4045357D, -27.2554254D, 161.13066459999999D, -0.54830319999999999D
			}, ad61, new double[] {
				4.3927451D, 1.6914144D, -337.7448483D, 46.896400399999997D, 8.5943556999999995D, 0.19546430000000001D, -14.498760000000001D, -64.868365600000004D, -0.84519750000000005D
			}, ad62, new double[] {
				4.9927450999999996D, 1.6914144D, -398.89333470000003D, 68.407805800000006D, 8.1813959000000001D, 0.79546430000000001D, 1.6185482D, -429.55186329999998D, -1.1049982D
			}, ad63, ad64, ad65, new double[] {
				6.1927450999999998D, 1.6914144D, -521.19030740000005D, 127.6888198D, 6.4866308999999998D, 1.9954643000000001D, 23.694588199999998D, -1138.0735863D, -1.4699811D
			}, ad66, ad67, new double[] {
				7.0927451000000001D, 1.6914144D, -612.91303689999995D, 200.29154579999999D, 3.6574485999999999D, 2.8954643D, 19.795394699999999D, -1058.9563952000001D, -1.5784544D
			}, new double[] {
				7.3927451D, 1.6914144D, -643.48728000000006D, 234.27778710000001D, 2.1401053000000001D, 3.1954642999999998D, 15.0977946D, -877.24635079999996D, -1.5803442000000001D
			}, new double[] {
				7.6927450999999998D, 1.6914144D, -674.06152320000001D, 275.7268449D, 0.1651599D, 3.4954643000000001D, 9.5389578000000004D, -640.49616639999999D, -1.5649227999999999D
			}, ad68, ad69, ad70, ad71, new double[] {
				9.7476407999999992D, 1.8628107D, -841.58684259999995D, 19.625597299999999D, 8.9143979000000009D, -0.7094009D, -30.739750900000001D, 220.02938109999999D, -0.38996530000000001D
			}, new double[] {
				10.0476408D, 1.8628107D, -872.67527489999998D, 28.2628214D, 8.8398648000000009D, -0.40940090000000001D, -26.955704900000001D, 158.22114149999999D, -0.54830319999999999D
			}, new double[] {
				10.347640800000001D, 1.8628107D, -903.76370710000003D, 37.305238799999998D, 8.7346948999999992D, -0.1094009D, -21.296639599999999D, 63.302094400000001D, -0.70060560000000005D
			}, ad72, new double[] {
				10.9476408D, 1.8628107D, -965.9405716D, 57.2001287D, 8.4126647000000006D, 0.49059910000000001D, -6.2402027000000002D, -238.85755760000001D, -0.98049019999999998D
			}, new double[] {
				11.247640799999999D, 1.8628107D, -997.02900390000002D, 68.407805800000006D, 8.1813959000000001D, 0.7905991D, 1.9182687D, -436.05803270000001D, -1.1049982D
			}, ad73, new double[] {
				11.847640800000001D, 1.8628107D, -1059.2058684000001D, 94.497482399999996D, 7.5234689000000001D, 1.3905991D, 16.156674299999999D, -849.7774885D, -1.3163339000000001D
			}, ad74, ad75, new double[] {
				12.747640799999999D, 1.8628107D, -1152.4711651D, 148.1152635D, 5.7586041999999997D, 2.2905991000000001D, 24.7382265D, -1203.3864653000001D, -1.5229775000000001D
			}, ad76, new double[] {
				13.347640800000001D, 1.8628107D, -1214.6480296D, 200.29154579999999D, 3.6574485999999999D, 2.8905991000000002D, 20.095115199999999D, -1071.7566953D, -1.5784544D
			}, new double[] {
				13.6476408D, 1.8628107D, -1245.7364617999999D, 234.27778710000001D, 2.1401053000000001D, 3.1905991D, 15.3975151D, -890.94581249999999D, -1.5803442000000001D
			}, new double[] {
				13.9476408D, 1.8628107D, -1276.8248940999999D, 275.7268449D, 0.1651599D, 3.4905990999999998D, 9.8386782999999998D, -655.09478960000001D, -1.5649227999999999D
			}, ad77, ad78, new double[] {
				14.1144778D, 1.9715174D, -1266.3088279000001D, 3.0597946D, 8.9830009000000004D, -1.3179449999999999D, -31.5800248D, 286.52123410000002D, -0.062199999999999998D
			}, ad79, new double[] {
				14.714477799999999D, 1.9715174D, -1329.1379323000001D, 19.625597299999999D, 8.9143979000000009D, -0.71794500000000006D, -30.4404684D, 218.39797239999999D, -0.38996530000000001D
			}, new double[] {
				15.0144778D, 1.9715174D, -1360.5524846000001D, 28.2628214D, 8.8398648000000009D, -0.41794500000000001D, -26.6564224D, 155.69188539999999D, -0.54830319999999999D
			}, new double[] {
				15.314477800000001D, 1.9715174D, -1391.9670368D, 37.305238799999998D, 8.7346948999999992D, -0.11794499999999999D, -20.9973572D, 59.8749909D, -0.70060560000000005D
			}, new double[] {
				15.6144778D, 1.9715174D, -1423.3815890000001D, 46.896400399999997D, 8.5943556999999995D, 0.18205499999999999D, -13.8997571D, -73.901162600000006D, -0.84519750000000005D
			}, ad80, new double[] {
				16.214477800000001D, 1.9715174D, -1486.2106934999999D, 68.407805800000006D, 8.1813959000000001D, 0.78205499999999994D, 2.2175511999999999D, -442.17867819999998D, -1.1049982D
			}, new double[] {
				16.514477800000002D, 1.9715174D, -1517.6252457000001D, 80.747736000000003D, 7.8897272999999997D, 1.082055D, 9.8945135999999998D, -653.30345650000004D, -1.2173562D
			}, new double[] {
				16.814477799999999D, 1.9715174D, -1549.0397978999999D, 94.497482399999996D, 7.5234689000000001D, 1.382055D, 16.455956799999999D, -857.69382870000004D, -1.3163339000000001D
			}, ad81, ad82, new double[] {
				17.714477800000001D, 1.9715174D, -1643.2834545999999D, 148.1152635D, 5.7586041999999997D, 2.2820550000000002D, 25.037508899999999D, -1213.9963475D, -1.5229775000000001D
			}, new double[] {
				18.014477800000002D, 1.9715174D, -1674.6980069000001D, 171.99884599999999D, 4.8356763999999997D, 2.582055D, 23.653462900000001D, -1190.1600023000001D, -1.5592649999999999D
			}, new double[] {
				18.314477799999999D, 1.9715174D, -1706.1125591D, 200.29154579999999D, 3.6574485999999999D, 2.8820549999999998D, 20.394397699999999D, -1084.1622723D, -1.5784544D
			}, new double[] {
				18.6144778D, 1.9715174D, -1737.5271112999999D, 234.27778710000001D, 2.1401053000000001D, 3.1820550000000001D, 15.6967976D, -904.24923690000003D, -1.5803442000000001D
			}, new double[] {
				18.9144778D, 1.9715174D, -1768.9416635D, 275.7268449D, 0.1651599D, 3.4820549999999999D, 10.1379608D, -669.29606130000002D, -1.5649227999999999D
			}, new double[] {
				19.214477800000001D, 1.9715174D, -1800.3562158D, 327.13300479999998D, -2.4385346000000001D, 3.7820550000000002D, 4.3794893000000004D, -407.63471709999999D, -1.5323681D
			}, new double[] {
				19.514477800000002D, 1.9715174D, -1831.7707680000001D, 392.10647540000002D, -5.9244687000000003D, 4.0820550000000004D, -0.89747310000000002D, -154.59218749999999D, -1.4830451D
			}, new double[] {
				17.360124800000001D, 2.0349358D, -1594.1434873000001D, 3.0597946D, 8.9830009000000004D, -1.3406815000000001D, -31.283757600000001D, 288.1527509D, -0.062199999999999998D
			}, new double[] {
				17.660124799999998D, 2.0349358D, -1625.7482947999999D, 11.2644424D, 8.9614528999999994D, -1.0406815D, -31.800283499999999D, 258.54142869999998D, -0.22733419999999999D
			}, ad83, ad84, new double[] {
				18.560124800000001D, 2.0349358D, -1720.562717D, 37.305238799999998D, 8.7346948999999992D, -0.14068149999999999D, -20.701089899999999D, 57.951300799999999D, -0.70060560000000005D
			}, new double[] {
				18.860124800000001D, 2.0349358D, -1752.1675244999999D, 46.896400399999997D, 8.5943556999999995D, 0.1593185D, -13.6034898D, -76.713654500000004D, -0.84519750000000005D
			}, new double[] {
				19.160124799999998D, 2.0349358D, -1783.7723318999999D, 57.2001287D, 8.4126647000000006D, 0.45931850000000002D, -5.6446529999999999D, -247.7816493D, -0.98049019999999998D
			}, new double[] {
				19.460124799999999D, 2.0349358D, -1815.3771393D, 68.407805800000006D, 8.1813959000000001D, 0.75931850000000001D, 2.5138183999999999D, -446.76877339999999D, -1.1049982D
			}, new double[] {
				19.7601248D, 2.0349358D, -1846.9819467D, 80.747736000000003D, 7.8897272999999997D, 1.0593185000000001D, 10.190780800000001D, -658.7823535D, -1.2173562D
			}, ad85, new double[] {
				20.360124800000001D, 2.0349358D, -1910.1915616000001D, 110.00047410000001D, 7.0639795000000003D, 1.6593184999999999D, 21.673332599999998D, -1040.3805600000001D, -1.4008494D
			}, ad86, ad87, new double[] {
				21.2601248D, 2.0349358D, -2005.0059838D, 171.99884599999999D, 4.8356763999999997D, 2.5593184999999998D, 23.949730200000001D, -1200.0829080000001D, -1.5592649999999999D
			}, new double[] {
				21.560124800000001D, 2.0349358D, -2036.6107913000001D, 200.29154579999999D, 3.6574485999999999D, 2.8593185000000001D, 20.690664900000002D, -1094.9739797D, -1.5784544D
			}, ad88, new double[] {
				22.160124799999998D, 2.0349358D, -2099.8204061000001D, 275.7268449D, 0.1651599D, 3.4593185000000002D, 10.434227999999999D, -681.88537210000004D, -1.5649227999999999D
			}, ad89, ad90, new double[] {
				18.693020000000001D, 2.1002652999999998D, -1732.8007089D, 3.0597946D, 8.9830009000000004D, -1.2405596999999999D, -30.942058100000001D, 276.9371337D, -0.062199999999999998D
			}, ad91, ad92, new double[] {
				19.593019999999999D, 2.1002652999999998D, -1828.2030961999999D, 28.2628214D, 8.8398648000000009D, -0.34055970000000002D, -26.018455599999999D, 140.366084D, -0.54830319999999999D
			}, ad93, ad94, new double[] {
				20.493020000000001D, 2.1002652999999998D, -1923.6054835D, 57.2001287D, 8.4126647000000006D, 0.5594403D, -5.3029535000000001D, -265.14785810000001D, -0.98049019999999998D
			}, new double[] {
				20.793019999999999D, 2.1002652999999998D, -1955.4062792D, 68.407805800000006D, 8.1813959000000001D, 0.85944030000000005D, 2.8555179000000002D, -465.1600808D, -1.1049982D
			}, ad95, ad96, new double[] {
				21.693020000000001D, 2.1002652999999998D, -2050.8086665000001D, 110.00047410000001D, 7.0639795000000003D, 1.7594403000000001D, 22.015032099999999D, -1061.8471631D, -1.4008494D
			}, new double[] {
				21.993020000000001D, 2.1002652999999998D, -2082.6094622999999D, 127.6888198D, 6.4866308999999998D, 2.0594402999999999D, 24.931557999999999D, -1188.5254407D, -1.4699811D
			}, ad97, new double[] {
				22.593019999999999D, 2.1002652999999998D, -2146.2110538000002D, 171.99884599999999D, 4.8356763999999997D, 2.6594403D, 24.291429699999998D, -1224.6248069999999D, -1.5592649999999999D
			}, new double[] {
				22.89302D, 2.1002652999999998D, -2178.0118495000002D, 200.29154579999999D, 3.6574485999999999D, 2.9594402999999998D, 21.0323645D, -1120.5409772999999D, -1.5784544D
			}, ad98, ad99, new double[] {
				23.793019999999999D, 2.1002652999999998D, -2273.4142367999998D, 327.13300479999998D, -2.4385346000000001D, 3.8594403000000002D, 5.0174561000000004D, -449.75512300000003D, -1.5323681D
			}, ad100, ad101, ad102, new double[] {
				18.544829100000001D, 2.1292100999999999D, -1716.4535469D, 19.625597299999999D, 8.9143979000000009D, -0.62056690000000003D, -29.541985199999999D, 200.70817959999999D, -0.38996530000000001D
			}, ad103, new double[] {
				19.144829099999999D, 2.1292100999999999D, -1780.2288077999999D, 37.305238799999998D, 8.7346948999999992D, -0.020566899999999999D, -20.098873999999999D, 36.794299100000003D, -0.70060560000000005D
			}, new double[] {
				19.4448291D, 2.1292100999999999D, -1812.1164381999999D, 46.896400399999997D, 8.5943556999999995D, 0.27943309999999999D, -13.001273899999999D, -99.677304100000001D, -0.84519750000000005D
			}, new double[] {
				19.7448291D, 2.1292100999999999D, -1844.0040687000001D, 57.2001287D, 8.4126647000000006D, 0.57943310000000003D, -5.0424370999999999D, -272.5519468D, -0.98049019999999998D
			}, new double[] {
				20.044829100000001D, 2.1292100999999999D, -1875.8916991000001D, 68.407805800000006D, 8.1813959000000001D, 0.87943309999999997D, 3.1160344000000002D, -473.34571870000002D, -1.1049982D
			}, new double[] {
				20.344829099999998D, 2.1292100999999999D, -1907.7793294999999D, 80.747736000000003D, 7.8897272999999997D, 1.1794331D, 10.792996799999999D, -687.16594659999998D, -1.2173562D
			}, new double[] {
				20.644829099999999D, 2.1292100999999999D, -1939.66696D, 94.497482399999996D, 7.5234689000000001D, 1.4794331000000001D, 17.35444D, -894.25176829999998D, -1.3163339000000001D
			}, ad104, ad105, new double[] {
				21.544829100000001D, 2.1292100999999999D, -2035.3298513D, 148.1152635D, 5.7586041999999997D, 2.3794331D, 25.9359921D, -1258.6406357999999D, -1.5229775000000001D
			}, ad106, new double[] {
				22.144829099999999D, 2.1292100999999999D, -2099.1051121999999D, 200.29154579999999D, 3.6574485999999999D, 2.9794331000000001D, 21.2928809D, -1134.1974597000001D, -1.5784544D
			}, new double[] {
				22.4448291D, 2.1292100999999999D, -2130.9927425999999D, 234.27778710000001D, 2.1401053000000001D, 3.2794330999999999D, 16.5952807D, -956.97987379999995D, -1.5803442000000001D
			}, ad107, ad108, new double[] {
				23.344829099999998D, 2.1292100999999999D, -2226.6556338999999D, 392.10647540000002D, -5.9244687000000003D, 4.1794330999999998D, 0.0010101000000000001D, -215.4091731D, -1.4830451D
			}, new double[] {
				15.2710638D, 2.2076294999999999D, -1358.6295872000001D, 3.0597946D, 8.9830009000000004D, -1.2355773999999999D, -30.379691000000001D, 275.19345340000001D, -0.062199999999999998D
			}, new double[] {
				15.571063799999999D, 2.2076294999999999D, -1390.7524757000001D, 11.2644424D, 8.9614528999999994D, -0.9355774D, -30.896216800000001D, 242.86993129999999D, -0.22733419999999999D
			}, new double[] {
				15.8710638D, 2.2076294999999999D, -1422.8753641999999D, 19.625597299999999D, 8.9143979000000009D, -0.63557739999999996D, -29.2401345D, 199.86818840000001D, -0.38996530000000001D
			}, new double[] {
				16.171063799999999D, 2.2076294999999999D, -1454.9982527D, 28.2628214D, 8.8398648000000009D, -0.33557740000000003D, -25.4560885D, 133.5610997D, -0.54830319999999999D
			}, ad109, ad110, new double[] {
				17.071063800000001D, 2.2076294999999999D, -1551.3669182000001D, 57.2001287D, 8.4126647000000006D, 0.5644226D, -4.7405863999999998D, -277.01414640000002D, -0.98049019999999998D
			}, ad111, ad112, new double[] {
				17.9710638D, 2.2076294999999999D, -1647.7355835999999D, 94.497482399999996D, 7.5234689000000001D, 1.4644226D, 17.6562907D, -901.43062429999998D, -1.3163339000000001D
			}, ad113, ad114, new double[] {
				18.871063800000002D, 2.2076294999999999D, -1744.1042491000001D, 148.1152635D, 5.7586041999999997D, 2.3644226000000002D, 26.237842799999999D, -1268.5361482000001D, -1.5229775000000001D
			}, ad115, ad116, ad117, ad118, new double[] {
				20.371063800000002D, 2.2076294999999999D, -1904.7186916000001D, 327.13300479999998D, -2.4385346000000001D, 3.8644226000000002D, 5.5798231999999999D, -480.17952600000001D, -1.5323681D
			}, ad119, ad120, ad121, ad122, new double[] {
				11.9130045D, 2.3359621000000002D, -975.19533520000005D, 28.2628214D, 8.8398648000000009D, -0.34247929999999999D, -25.155586799999998D, 130.96011369999999D, -0.54830319999999999D
			}, ad123, ad124, new double[] {
				12.8130045D, 2.3359621000000002D, -1072.7189942D, 57.2001287D, 8.4126647000000006D, 0.55752069999999998D, -4.4400845999999996D, -282.31964809999999D, -0.98049019999999998D
			}, new double[] {
				13.113004500000001D, 2.3359621000000002D, -1105.2268805000001D, 68.407805800000006D, 8.1813959000000001D, 0.85752070000000002D, 3.7183868000000002D, -484.92047730000002D, -1.1049982D
			}, new double[] {
				13.4130045D, 2.3359621000000002D, -1137.7347669000001D, 80.747736000000003D, 7.8897272999999997D, 1.1575207000000001D, 11.3953492D, -700.54776249999998D, -1.2173562D
			}, new double[] {
				13.7130045D, 2.3359621000000002D, -1170.2426531999999D, 94.497482399999996D, 7.5234689000000001D, 1.4575206999999999D, 17.956792400000001D, -909.44064160000005D, -1.3163339000000001D
			}, new double[] {
				14.013004499999999D, 2.3359621000000002D, -1202.7505395999999D, 110.00047410000001D, 7.0639795000000003D, 1.7575206999999999D, 22.877901000000001D, -1089.3733792999999D, -1.4008494D
			}, new double[] {
				14.3130045D, 2.3359621000000002D, -1235.2584259D, 127.6888198D, 6.4866308999999998D, 2.0575207D, 25.7944268D, -1218.6402634000001D, -1.4699811D
			}, ad125, new double[] {
				14.9130045D, 2.3359621000000002D, -1300.2741986000001D, 171.99884599999999D, 4.8356763999999997D, 2.6575207000000001D, 25.154298499999999D, -1259.9168428D, -1.5592649999999999D
			}, ad126, new double[] {
				15.513004499999999D, 2.3359621000000002D, -1365.2899712000001D, 234.27778710000001D, 2.1401053000000001D, 3.2575207000000002D, 17.197633199999999D, -983.01109099999996D, -1.5803442000000001D
			}, new double[] {
				15.8130045D, 2.3359621000000002D, -1397.7978576D, 275.7268449D, 0.1651599D, 3.5575207D, 11.6387964D, -752.56042230000003D, -1.5649227999999999D
			}, ad127, new double[] {
				16.4130045D, 2.3359621000000002D, -1462.8136303000001D, 392.10647540000002D, -5.9244687000000003D, 4.1575207000000001D, 0.60336250000000002D, -246.8615623D, -1.4830451D
			}, ad128, new double[] {
				5.9431513999999996D, 2.5315694D, -288.25127950000001D, 11.2644424D, 8.9614528999999994D, -0.9466774D, -30.295496700000001D, 240.98268100000001D, -0.22733419999999999D
			}, new double[] {
				6.2431514000000004D, 2.5315694D, -321.3459876D, 19.625597299999999D, 8.9143979000000009D, -0.64667739999999996D, -28.6394144D, 196.17877759999999D, -0.38996530000000001D
			}, new double[] {
				6.5431514000000002D, 2.5315694D, -354.44069569999999D, 28.2628214D, 8.8398648000000009D, -0.34667740000000002D, -24.8553684D, 128.06952849999999D, -0.54830319999999999D
			}, new double[] {
				6.8431514D, 2.5315694D, -387.53540390000001D, 37.305238799999998D, 8.7346948999999992D, -0.046677400000000001D, -19.196303100000002D, 26.849471900000001D, -0.70060560000000005D
			}, ad129, ad130, new double[] {
				7.7431514000000004D, 2.5315694D, -486.81952819999998D, 68.407805800000006D, 8.1813959000000001D, 0.85332260000000004D, 4.0186051999999997D, -491.41368360000001D, -1.1049982D
			}, new double[] {
				8.0431513999999993D, 2.5315694D, -519.91423629999997D, 80.747736000000003D, 7.8897272999999997D, 1.1533226000000001D, 11.6955676D, -707.94162410000001D, -1.2173562D
			}, ad131, new double[] {
				8.6431514000000007D, 2.5315694D, -586.10365260000003D, 110.00047410000001D, 7.0639795000000003D, 1.7533226D, 23.1781194D, -1098.5685513999999D, -1.4008494D
			}, ad132, new double[] {
				9.2431514000000004D, 2.5315694D, -652.29306880000001D, 148.1152635D, 5.7586041999999997D, 2.3533225999999998D, 26.838563000000001D, -1290.2471637000001D, -1.5229775000000001D
			}, new double[] {
				9.5431513999999993D, 2.5315694D, -685.38777689999995D, 171.99884599999999D, 4.8356763999999997D, 2.6533226000000001D, 25.454516999999999D, -1271.8139807D, -1.5592649999999999D
			}, new double[] {
				9.8431514D, 2.5315694D, -718.48248509999996D, 200.29154579999999D, 3.6574485999999999D, 2.9533225999999999D, 22.1954517D, -1171.2194128000001D, -1.5784544D
			}, ad133, ad134, ad135, ad136, ad137, ad138, new double[] {
				0.34496710000000003D, 2.8047719999999998D, 378.29744210000001D, 19.625597299999999D, 8.9143979000000009D, -0.64957759999999998D, -28.339296600000001D, 194.04787619999999D, -0.38996530000000001D
			}, new double[] {
				0.64496710000000002D, 2.8047719999999998D, 344.38312610000003D, 28.2628214D, 8.8398648000000009D, -0.34957759999999999D, -24.555250600000001D, 125.0382737D, -0.54830319999999999D
			}, new double[] {
				0.94496709999999995D, 2.8047719999999998D, 310.46881020000001D, 37.305238799999998D, 8.7346948999999992D, -0.049577599999999999D, -18.8961854D, 22.917863799999999D, -0.70060560000000005D
			}, new double[] {
				1.2449671D, 2.8047719999999998D, 276.55449420000002D, 46.896400399999997D, 8.5943556999999995D, 0.25042239999999999D, -11.798585299999999D, -117.1618052D, -0.84519750000000005D
			}, new double[] {
				1.5449671D, 2.8047719999999998D, 242.64017820000001D, 57.2001287D, 8.4126647000000006D, 0.55042239999999998D, -3.8397484999999998D, -293.64451380000003D, -0.98049019999999998D
			}, ad139, ad140, ad141, new double[] {
				2.7449671000000002D, 2.8047719999999998D, 106.9829143D, 110.00047410000001D, 7.0639795000000003D, 1.7504223999999999D, 23.478237199999999D, -1107.9022792999999D, -1.4008494D
			}, new double[] {
				3.0449671D, 2.8047719999999998D, 73.068598399999999D, 127.6888198D, 6.4866308999999998D, 2.0504224D, 26.394763000000001D, -1238.970172D, -1.4699811D
			}, new double[] {
				3.3449670999999999D, 2.8047719999999998D, 39.1542824D, 148.1152635D, 5.7586041999999997D, 2.3504223999999998D, 27.138680699999998D, -1301.3815982000001D, -1.5229775000000001D
			}, new double[] {
				3.6449671000000001D, 2.8047719999999998D, 5.2399664000000001D, 171.99884599999999D, 4.8356763999999997D, 2.6504224000000001D, 25.7546347D, -1283.8487685D, -1.5592649999999999D
			}, ad142, ad143, ad144, new double[] {
				4.8449670999999999D, 2.8047719999999998D, -130.4172974D, 327.13300479999998D, -2.4385346000000001D, 3.8504223999999998D, 6.4806610999999998D, -526.53754500000002D, -1.5323681D
			}, ad145, new double[] {
				-6.0458809999999996D, 3.1582262000000001D, 1151.787501D, 3.0597946D, 8.9830009000000004D, -1.2517361D, -29.178781099999998D, 274.366309D, -0.062199999999999998D
			}, new double[] {
				-5.7458809999999998D, 3.1582262000000001D, 1116.8128222D, 11.2644424D, 8.9614528999999994D, -0.95173609999999997D, -29.695307D, 238.44005730000001D, -0.22733419999999999D
			}, new double[] {
				-5.445881D, 3.1582262000000001D, 1081.8381434999999D, 19.625597299999999D, 8.9143979000000009D, -0.65173610000000004D, -28.039224699999998D, 191.83558479999999D, -0.38996530000000001D
			}, new double[] {
				-5.1458810000000001D, 3.1582262000000001D, 1046.8634646999999D, 28.2628214D, 8.8398648000000009D, -0.3517361D, -24.255178699999998D, 121.92576649999999D, -0.54830319999999999D
			}, new double[] {
				-4.8458810000000003D, 3.1582262000000001D, 1011.888786D, 37.305238799999998D, 8.7346948999999992D, -0.0517361D, -18.5961134D, 18.905140800000002D, -0.70060560000000005D
			}, new double[] {
				-4.5458809999999996D, 3.1582262000000001D, 976.91410719999999D, 46.896400399999997D, 8.5943556999999995D, 0.24826390000000001D, -11.498513300000001D, -122.074744D, -0.84519750000000005D
			}, new double[] {
				-4.2458809999999998D, 3.1582262000000001D, 941.93942849999996D, 57.2001287D, 8.4126647000000006D, 0.54826390000000003D, -3.5396765000000001D, -299.45766839999999D, -0.98049019999999998D
			}, new double[] {
				-3.945881D, 3.1582262000000001D, 906.96474969999997D, 68.407805800000006D, 8.1813959000000001D, 0.84826389999999996D, 4.6187949000000001D, -504.75972200000001D, -1.1049982D
			}, new double[] {
				-3.6458810000000001D, 3.1582262000000001D, 871.99007099999994D, 80.747736000000003D, 7.8897272999999997D, 1.1482638999999999D, 12.2957573D, -723.08823159999997D, -1.2173562D
			}, ad146, new double[] {
				-3.0458810000000001D, 3.1582262000000001D, 802.04071350000004D, 110.00047410000001D, 7.0639795000000003D, 1.7482639D, 23.778309100000001D, -1117.3162970999999D, -1.4008494D
			}, new double[] {
				-2.7458809999999998D, 3.1582262000000001D, 767.06603470000005D, 127.6888198D, 6.4866308999999998D, 2.0482638999999998D, 26.694835000000001D, -1249.2844055999999D, -1.4699811D
			}, new double[] {
				-2.445881D, 3.1582262000000001D, 732.09135600000002D, 148.1152635D, 5.7586041999999997D, 2.3482639000000001D, 27.438752699999998D, -1312.5960477000001D, -1.5229775000000001D
			}, ad147, ad148, new double[] {
				-1.5458810000000001D, 3.1582262000000001D, 627.16731970000001D, 234.27778710000001D, 2.1401053000000001D, 3.2482639D, 18.098041299999998D, -1024.4601307D, -1.5803442000000001D
			}, new double[] {
				-1.245881D, 3.1582262000000001D, 592.19264099999998D, 275.7268449D, 0.1651599D, 3.5482638999999998D, 12.5392045D, -796.71068639999999D, -1.5649227999999999D
			}, new double[] {
				-0.94588099999999997D, 3.1582262000000001D, 557.21796219999999D, 327.13300479999998D, -2.4385346000000001D, 3.8482639000000001D, 6.7807331D, -542.25307350000003D, -1.5323681D
			}, new double[] {
				-0.64588100000000004D, 3.1582262000000001D, 522.24328349999996D, 392.10647540000002D, -5.9244687000000003D, 4.1482638999999999D, 1.5037707D, -296.4142751D, -1.4830451D
			}, ad149, new double[] {
				-10.804053D, 3.5867140000000002D, 1746.770436D, 11.2644424D, 8.9614528999999994D, -0.95342360000000004D, -29.395259299999999D, 237.07571759999999D, -0.22733419999999999D
			}, new double[] {
				-10.504053000000001D, 3.5867140000000002D, 1710.5102939999999D, 19.625597299999999D, 8.9143979000000009D, -0.65342359999999999D, -27.7391769D, 189.571102D, -0.38996530000000001D
			}, ad150, new double[] {
				-9.9040529999999993D, 3.5867140000000002D, 1637.99001D, 37.305238799999998D, 8.7346948999999992D, -0.053423600000000002D, -18.2960657D, 14.8403718D, -0.70060560000000005D
			}, new double[] {
				-9.6040530000000004D, 3.5867140000000002D, 1601.7298679999999D, 46.896400399999997D, 8.5943556999999995D, 0.2465764D, -11.1984656D, -127.0396562D, -0.84519750000000005D
			}, ad151, new double[] {
				-9.0040530000000008D, 3.5867140000000002D, 1529.2095839999999D, 68.407805800000006D, 8.1813959000000001D, 0.84657640000000001D, 4.9188425999999996D, -511.52492050000001D, -1.1049982D
			}, ad152, new double[] {
				-8.4040529999999993D, 3.5867140000000002D, 1456.6893D, 94.497482399999996D, 7.5234689000000001D, 1.4465764000000001D, 19.157248200000002D, -943.24781970000004D, -1.3163339000000001D
			}, new double[] {
				-8.1040530000000004D, 3.5867140000000002D, 1420.4291579000001D, 110.00047410000001D, 7.0639795000000003D, 1.7465763999999999D, 24.078356800000002D, -1126.7819248999999D, -1.4008494D
			}, ad153, new double[] {
				-7.5040529999999999D, 3.5867140000000002D, 1347.9088738999999D, 148.1152635D, 5.7586041999999997D, 2.3465764D, 27.738800399999999D, -1323.8619616999999D, -1.5229775000000001D
			}, new double[] {
				-7.204053D, 3.5867140000000002D, 1311.6487319D, 171.99884599999999D, 4.8356763999999997D, 2.6465763999999998D, 26.354754400000001D, -1308.1294909000001D, -1.5592649999999999D
			}, ad154, new double[] {
				-6.6040530000000004D, 3.5867140000000002D, 1239.1284479000001D, 234.27778710000001D, 2.1401053000000001D, 3.2465763999999999D, 18.398088999999999D, -1038.4264741D, -1.5803442000000001D
			}, new double[] {
				-6.3040529999999997D, 3.5867140000000002D, 1202.8683059D, 275.7268449D, 0.1651599D, 3.5465764000000002D, 12.839252200000001D, -811.57717290000005D, -1.5649227999999999D
			}, new double[] {
				-6.0040529999999999D, 3.5867140000000002D, 1166.6081638999999D, 327.13300479999998D, -2.4385346000000001D, 3.8465764D, 7.0807808000000003D, -558.01970300000005D, -1.5323681D
			}, new double[] {
				-5.704053D, 3.5867140000000002D, 1130.3480219D, 392.10647540000002D, -5.9244687000000003D, 4.1465763999999998D, 1.8038183999999999D, -313.08104780000002D, -1.4830451D
			}, new double[] {
				-14.875845200000001D, 4.0776652999999996D, 2264.6197375000002D, 3.0597946D, 8.9830009000000004D, -1.2547898D, -28.578699799999999D, 273.40190050000001D, -0.062199999999999998D
			}, ad155, new double[] {
				-14.275845199999999D, 4.0776652999999996D, 2189.1537453999999D, 19.625597299999999D, 8.9143979000000009D, -0.65478979999999998D, -27.439143399999999D, 187.27068879999999D, -0.38996530000000001D
			}, new double[] {
				-13.9758452D, 4.0776652999999996D, 2151.4207494000002D, 28.2628214D, 8.8398648000000009D, -0.35478979999999999D, -23.655097399999999D, 115.56062679999999D, -0.54830319999999999D
			}, new double[] {
				-13.675845199999999D, 4.0776652999999996D, 2113.6877534D, 37.305238799999998D, 8.7346948999999992D, -0.0547898D, -17.996032199999998D, 10.739757300000001D, -0.70060560000000005D
			}, ad156, ad157, ad158, new double[] {
				-12.4758452D, 4.0776652999999996D, 1962.7557693000001D, 80.747736000000003D, 7.8897272999999997D, 1.1452102D, 12.895838599999999D, -738.45459010000002D, -1.2173562D
			}, ad159, ad160, new double[] {
				-11.5758452D, 4.0776652999999996D, 1849.5567813D, 127.6888198D, 6.4866308999999998D, 2.0452102000000001D, 27.294916199999999D, -1270.0514954D, -1.4699811D
			}, new double[] {
				-11.275845199999999D, 4.0776652999999996D, 1811.8237853000001D, 148.1152635D, 5.7586041999999997D, 2.3452101999999999D, 28.0388339D, -1335.1633812D, -1.5229775000000001D
			}, ad161, ad162, new double[] {
				-10.375845200000001D, 4.0776652999999996D, 1698.6247972000001D, 234.27778710000001D, 2.1401053000000001D, 3.2452101999999998D, 18.698122600000001D, -1052.4281954999999D, -1.5803442000000001D
			}, ad163, new double[] {
				-9.7758451999999991D, 4.0776652999999996D, 1623.1588052D, 327.13300479999998D, -2.4385346000000001D, 3.8452101999999999D, 7.3808142999999999D, -573.82162570000003D, -1.5323681D
			}, new double[] {
				-9.4758452000000002D, 4.0776652999999996D, 1585.4258092D, 392.10647540000002D, -5.9244687000000003D, 4.1452102000000002D, 2.1038519D, -329.78307109999997D, -1.4830451D
			}, new double[] {
				-16.933428299999999D, 4.6123928999999997D, 2532.8424602D, 3.0597946D, 8.9830009000000004D, -1.2559254D, -28.278675199999999D, 272.87559420000002D, -0.062199999999999998D
			}, new double[] {
				-16.633428299999999D, 4.6123928999999997D, 2493.5052816000002D, 11.2644424D, 8.9614528999999994D, -0.95592540000000004D, -28.7952011D, 234.2490248D, -0.22733419999999999D
			}, new double[] {
				-16.333428300000001D, 4.6123928999999997D, 2454.1681029000001D, 19.625597299999999D, 8.9143979000000009D, -0.65592539999999999D, -27.139118799999999D, 184.94423459999999D, -0.38996530000000001D
			}, new double[] {
				-16.033428300000001D, 4.6123928999999997D, 2414.8309242999999D, 28.2628214D, 8.8398648000000009D, -0.3559254D, -23.355072799999999D, 112.3340987D, -0.54830319999999999D
			}, ad164, new double[] {
				-15.433428299999999D, 4.6123928999999997D, 2336.156567D, 46.896400399999997D, 8.5943556999999995D, 0.2440746D, -10.598407399999999D, -137.06704719999999D, -0.84519750000000005D
			}, new double[] {
				-15.1334283D, 4.6123928999999997D, 2296.8193882999999D, 57.2001287D, 8.4126647000000006D, 0.54407459999999996D, -2.6395705999999999D, -317.1502893D, -0.98049019999999998D
			}, ad165, ad166, new double[] {
				-14.2334283D, 4.6123928999999997D, 2178.8078523999998D, 94.497482399999996D, 7.5234689000000001D, 1.4440746D, 19.757306400000001D, -960.475909D, -1.3163339000000001D
			}, new double[] {
				-13.933428299999999D, 4.6123928999999997D, 2139.4706737000001D, 110.00047410000001D, 7.0639795000000003D, 1.7440746D, 24.678415000000001D, -1145.8101887D, -1.4008494D
			}, ad167, new double[] {
				-13.3334283D, 4.6123928999999997D, 2060.7963163999998D, 148.1152635D, 5.7586041999999997D, 2.3440745999999999D, 28.338858500000001D, -1346.4905745999999D, -1.5229775000000001D
			}, ad168, ad169, new double[] {
				-12.433428299999999D, 4.6123928999999997D, 1942.7847804999999D, 234.27778710000001D, 2.1401053000000001D, 3.2440745999999998D, 18.998147199999998D, -1066.4556107000001D, -1.5803442000000001D
			}, new double[] {
				-12.1334283D, 4.6123928999999997D, 1903.4476018D, 275.7268449D, 0.1651599D, 3.5440746000000001D, 13.4393104D, -841.40648409999994D, -1.5649227999999999D
			}, new double[] {
				-11.8334283D, 4.6123928999999997D, 1864.1104232D, 327.13300479999998D, -2.4385346000000001D, 3.8440745999999999D, 7.6808389999999997D, -589.64918880000005D, -1.5323681D
			}, new double[] {
				-11.533428300000001D, 4.6123928999999997D, 1824.7732444999999D, 392.10647540000002D, -5.9244687000000003D, 4.1440745999999997D, 2.4038765D, -346.51070809999999D, -1.4830451D
			}, ad170, new double[] {
				-16.716744200000001D, 5.1679225999999998D, 2501.6251504000002D, 11.2644424D, 8.9614528999999994D, -0.95688870000000004D, -28.4951823D, 232.80300170000001D, -0.22733419999999999D
			}, new double[] {
				-16.4167442D, 5.1679225999999998D, 2460.6213827000001D, 19.625597299999999D, 8.9143979000000009D, -0.65688869999999999D, -26.839099999999998D, 182.5981553D, -0.38996530000000001D
			}, new double[] {
				-16.116744199999999D, 5.1679225999999998D, 2419.6176150000001D, 28.2628214D, 8.8398648000000009D, -0.3568887D, -23.055053999999998D, 109.0879631D, -0.54830319999999999D
			}, ad171, ad172, new double[] {
				-15.216744200000001D, 5.1679225999999998D, 2296.6063119D, 57.2001287D, 8.4126647000000006D, 0.54311129999999996D, -2.3395519D, -323.09659340000002D, -0.98049019999999998D
			}, new double[] {
				-14.9167442D, 5.1679225999999998D, 2255.6025441000002D, 68.407805800000006D, 8.1813959000000001D, 0.84311130000000001D, 5.8189194999999998D, -531.9990209D, -1.1049982D
			}, new double[] {
				-14.616744199999999D, 5.1679225999999998D, 2214.5987764000001D, 80.747736000000003D, 7.8897272999999997D, 1.1431112999999999D, 13.495882D, -753.92790430000002D, -1.2173562D
			}, new double[] {
				-14.3167442D, 5.1679225999999998D, 2173.5950087000001D, 94.497482399999996D, 7.5234689000000001D, 1.4431113D, 20.057325200000001D, -969.12238170000001D, -1.3163339000000001D
			}, ad173, new double[] {
				-13.716744200000001D, 5.1679225999999998D, 2091.5874733000001D, 127.6888198D, 6.4866308999999998D, 2.0431113000000001D, 27.8949596D, -1290.9251999999999D, -1.4699811D
			}, new double[] {
				-13.4167442D, 5.1679225999999998D, 2050.5837056D, 148.1152635D, 5.7586041999999997D, 2.3431112999999999D, 28.638877300000001D, -1357.8372159D, -1.5229775000000001D
			}, new double[] {
				-13.116744199999999D, 5.1679225999999998D, 2009.5799379D, 171.99884599999999D, 4.8356763999999997D, 2.6431113000000002D, 27.254831299999999D, -1344.8049758D, -1.5592649999999999D
			}, ad174, new double[] {
				-12.5167442D, 5.1679225999999998D, 1927.5724025D, 234.27778710000001D, 2.1401053000000001D, 3.2431112999999998D, 19.298165900000001D, -1080.5024206000001D, -1.5803442000000001D
			}, new double[] {
				-12.216744200000001D, 5.1679225999999998D, 1886.5686347000001D, 275.7268449D, 0.1651599D, 3.5431113000000001D, 13.739329100000001D, -856.35335009999994D, -1.5649227999999999D
			}, new double[] {
				-11.9167442D, 5.1679225999999998D, 1845.564867D, 327.13300479999998D, -2.4385346000000001D, 3.8431112999999999D, 7.9808576999999996D, -605.49611100000004D, -1.5323681D
			}, ad175, new double[] {
				-15.058972300000001D, 5.7192432000000002D, 2273.0478588000001D, 3.0597946D, 8.9830009000000004D, -1.2577194D, -27.678641800000001D, 271.76838479999998D, -0.062199999999999998D
			}, ad176, new double[] {
				-14.458972299999999D, 5.7192432000000002D, 2187.7323996D, 19.625597299999999D, 8.9143979000000009D, -0.65771939999999995D, -26.539085400000001D, 180.23682500000001D, -0.38996530000000001D
			}, ad177, new double[] {
				-13.8589723D, 5.7192432000000002D, 2102.4169403999999D, 37.305238799999998D, 8.7346948999999992D, -0.057719399999999997D, -17.095974200000001D, -1.6944545D, -0.70060560000000005D
			}, ad178, new double[] {
				-13.2589723D, 5.7192432000000002D, 2017.1014812999999D, 57.2001287D, 8.4126647000000006D, 0.5422806D, -2.0395373000000001D, -329.05809929999998D, -0.98049019999999998D
			}, new double[] {
				-12.958972299999999D, 5.7192432000000002D, 1974.4437516999999D, 68.407805800000006D, 8.1813959000000001D, 0.84228060000000005D, 6.1189342D, -538.86057059999996D, -1.1049982D
			}, new double[] {
				-12.6589723D, 5.7192432000000002D, 1931.7860221000001D, 80.747736000000003D, 7.8897272999999997D, 1.1422806000000001D, 13.795896600000001D, -761.68949799999996D, -1.2173562D
			}, new double[] {
				-12.3589723D, 5.7192432000000002D, 1889.1282925D, 94.497482399999996D, 7.5234689000000001D, 1.4422805999999999D, 20.357339799999998D, -977.78401919999999D, -1.3163339000000001D
			}, ad179, new double[] {
				-11.7589723D, 5.7192432000000002D, 1803.8128333D, 127.6888198D, 6.4866308999999998D, 2.0422805999999998D, 28.194974200000001D, -1301.3869253D, -1.4699811D
			}, ad180, new double[] {
				-11.1589723D, 5.7192432000000002D, 1718.4973742D, 171.99884599999999D, 4.8356763999999997D, 2.6422805999999999D, 27.5548459D, -1357.0667888999999D, -1.5592649999999999D
			}, ad181, ad182, ad183, ad184, new double[] {
				-9.6589723000000003D, 5.7192432000000002D, 1505.2087262D, 392.10647540000002D, -5.9244687000000003D, 4.1422806000000003D, 3.0039099D, -380.01971909999997D, -1.4830451D
			}
		});
	// 7215 11651:sipush          437
	// 7216 11654:anewarray       double[][]
	// 7217 11657:dup             
	// 7218 11658:iconst_0        
	// 7219 11659:bipush          9
	// 7220 11661:newarray        double[]
	// 7221 11663:dup             
	// 7222 11664:iconst_0        
	// 7223 11665:ldc2w           #2021 <Double -28.951737900000001D>
	// 7224 11668:dastore         
	// 7225 11669:dup             
	// 7226 11670:iconst_1        
	// 7227 11671:ldc2w           #11  <Double -1.3875926999999999D>
	// 7228 11674:dastore         
	// 7229 11675:dup             
	// 7230 11676:iconst_2        
	// 7231 11677:ldc2w           #2023 <Double 2568.2098943999999D>
	// 7232 11680:dastore         
	// 7233 11681:dup             
	// 7234 11682:iconst_3        
	// 7235 11683:ldc2w           #209 <Double 3.0597946D>
	// 7236 11686:dastore         
	// 7237 11687:dup             
	// 7238 11688:iconst_4        
	// 7239 11689:ldc2w           #211 <Double 8.9830009000000004D>
	// 7240 11692:dastore         
	// 7241 11693:dup             
	// 7242 11694:iconst_5        
	// 7243 11695:ldc2w           #2025 <Double -1.2925447000000001D>
	// 7244 11698:dastore         
	// 7245 11699:dup             
	// 7246 11700:bipush          6
	// 7247 11702:ldc2w           #2027 <Double -34.278646299999998D>
	// 7248 11705:dastore         
	// 7249 11706:dup             
	// 7250 11707:bipush          7
	// 7251 11709:ldc2w           #2029 <Double 290.26633040000002D>
	// 7252 11712:dastore         
	// 7253 11713:dup             
	// 7254 11714:bipush          8
	// 7255 11716:ldc2w           #219 <Double -0.062199999999999998D>
	// 7256 11719:dastore         
	// 7257 11720:aastore         
	// 7258 11721:dup             
	// 7259 11722:iconst_1        
	// 7260 11723:bipush          9
	// 7261 11725:newarray        double[]
	// 7262 11727:dup             
	// 7263 11728:iconst_0        
	// 7264 11729:ldc2w           #2031 <Double -28.651737900000001D>
	// 7265 11732:dastore         
	// 7266 11733:dup             
	// 7267 11734:iconst_1        
	// 7268 11735:ldc2w           #11  <Double -1.3875926999999999D>
	// 7269 11738:dastore         
	// 7270 11739:dup             
	// 7271 11740:iconst_2        
	// 7272 11741:ldc2w           #2033 <Double 2546.8726723999998D>
	// 7273 11744:dastore         
	// 7274 11745:dup             
	// 7275 11746:iconst_3        
	// 7276 11747:ldc2w           #319 <Double 11.2644424D>
	// 7277 11750:dastore         
	// 7278 11751:dup             
	// 7279 11752:iconst_4        
	// 7280 11753:ldc2w           #321 <Double 8.9614528999999994D>
	// 7281 11756:dastore         
	// 7282 11757:dup             
	// 7283 11758:iconst_5        
	// 7284 11759:ldc2w           #2035 <Double -0.99254469999999995D>
	// 7285 11762:dastore         
	// 7286 11763:dup             
	// 7287 11764:bipush          6
	// 7288 11766:ldc2w           #2037 <Double -34.795172200000003D>
	// 7289 11769:dastore         
	// 7290 11770:dup             
	// 7291 11771:bipush          7
	// 7292 11773:ldc2w           #2039 <Double 269.63967439999999D>
	// 7293 11776:dastore         
	// 7294 11777:dup             
	// 7295 11778:bipush          8
	// 7296 11780:ldc2w           #329 <Double -0.22733419999999999D>
	// 7297 11783:dastore         
	// 7298 11784:aastore         
	// 7299 11785:dup             
	// 7300 11786:iconst_2        
	// 7301 11787:aload_0         
	// 7302 11788:aastore         
	// 7303 11789:dup             
	// 7304 11790:iconst_3        
	// 7305 11791:aload_1         
	// 7306 11792:aastore         
	// 7307 11793:dup             
	// 7308 11794:iconst_4        
	// 7309 11795:aload_2         
	// 7310 11796:aastore         
	// 7311 11797:dup             
	// 7312 11798:iconst_5        
	// 7313 11799:bipush          9
	// 7314 11801:newarray        double[]
	// 7315 11803:dup             
	// 7316 11804:iconst_0        
	// 7317 11805:ldc2w           #2041 <Double -27.451737900000001D>
	// 7318 11808:dastore         
	// 7319 11809:dup             
	// 7320 11810:iconst_1        
	// 7321 11811:ldc2w           #11  <Double -1.3875926999999999D>
	// 7322 11814:dastore         
	// 7323 11815:dup             
	// 7324 11816:iconst_2        
	// 7325 11817:ldc2w           #2043 <Double 2461.5237846999999D>
	// 7326 11820:dastore         
	// 7327 11821:dup             
	// 7328 11822:iconst_3        
	// 7329 11823:ldc2w           #541 <Double 46.896400399999997D>
	// 7330 11826:dastore         
	// 7331 11827:dup             
	// 7332 11828:iconst_4        
	// 7333 11829:ldc2w           #543 <Double 8.5943556999999995D>
	// 7334 11832:dastore         
	// 7335 11833:dup             
	// 7336 11834:iconst_5        
	// 7337 11835:ldc2w           #2045 <Double 0.20745530000000001D>
	// 7338 11838:dastore         
	// 7339 11839:dup             
	// 7340 11840:bipush          6
	// 7341 11842:ldc2w           #2047 <Double -16.5983786D>
	// 7342 11845:dastore         
	// 7343 11846:dup             
	// 7344 11847:bipush          7
	// 7345 11849:ldc2w           #2049 <Double -29.676743900000002D>
	// 7346 11852:dastore         
	// 7347 11853:dup             
	// 7348 11854:bipush          8
	// 7349 11856:ldc2w           #551 <Double -0.84519750000000005D>
	// 7350 11859:dastore         
	// 7351 11860:aastore         
	// 7352 11861:dup             
	// 7353 11862:bipush          6
	// 7354 11864:aload_3         
	// 7355 11865:aastore         
	// 7356 11866:dup             
	// 7357 11867:bipush          7
	// 7358 11869:bipush          9
	// 7359 11871:newarray        double[]
	// 7360 11873:dup             
	// 7361 11874:iconst_0        
	// 7362 11875:ldc2w           #2051 <Double -26.8517379D>
	// 7363 11878:dastore         
	// 7364 11879:dup             
	// 7365 11880:iconst_1        
	// 7366 11881:ldc2w           #11  <Double -1.3875926999999999D>
	// 7367 11884:dastore         
	// 7368 11885:dup             
	// 7369 11886:iconst_2        
	// 7370 11887:ldc2w           #2053 <Double 2418.8493407999999D>
	// 7371 11890:dastore         
	// 7372 11891:dup             
	// 7373 11892:iconst_3        
	// 7374 11893:ldc2w           #345 <Double 68.407805800000006D>
	// 7375 11896:dastore         
	// 7376 11897:dup             
	// 7377 11898:iconst_4        
	// 7378 11899:ldc2w           #347 <Double 8.1813959000000001D>
	// 7379 11902:dastore         
	// 7380 11903:dup             
	// 7381 11904:iconst_5        
	// 7382 11905:ldc2w           #2055 <Double 0.80745529999999999D>
	// 7383 11908:dastore         
	// 7384 11909:dup             
	// 7385 11910:bipush          6
	// 7386 11912:ldc2w           #2057 <Double -0.48107030000000001D>
	// 7387 11915:dastore         
	// 7388 11916:dup             
	// 7389 11917:bipush          7
	// 7390 11919:ldc2w           #2059 <Double -381.76253050000003D>
	// 7391 11922:dastore         
	// 7392 11923:dup             
	// 7393 11924:bipush          8
	// 7394 11926:ldc2w           #355 <Double -1.1049982D>
	// 7395 11929:dastore         
	// 7396 11930:aastore         
	// 7397 11931:dup             
	// 7398 11932:bipush          8
	// 7399 11934:aload           4
	// 7400 11936:aastore         
	// 7401 11937:dup             
	// 7402 11938:bipush          9
	// 7403 11940:aload           5
	// 7404 11942:aastore         
	// 7405 11943:dup             
	// 7406 11944:bipush          10
	// 7407 11946:aload           6
	// 7408 11948:aastore         
	// 7409 11949:dup             
	// 7410 11950:bipush          11
	// 7411 11952:aload           7
	// 7412 11954:aastore         
	// 7413 11955:dup             
	// 7414 11956:bipush          12
	// 7415 11958:bipush          9
	// 7416 11960:newarray        double[]
	// 7417 11962:dup             
	// 7418 11963:iconst_0        
	// 7419 11964:ldc2w           #2061 <Double -25.3517379D>
	// 7420 11967:dastore         
	// 7421 11968:dup             
	// 7422 11969:iconst_1        
	// 7423 11970:ldc2w           #11  <Double -1.3875926999999999D>
	// 7424 11973:dastore         
	// 7425 11974:dup             
	// 7426 11975:iconst_2        
	// 7427 11976:ldc2w           #2063 <Double 2312.1632310999998D>
	// 7428 11979:dastore         
	// 7429 11980:dup             
	// 7430 11981:iconst_3        
	// 7431 11982:ldc2w           #463 <Double 148.1152635D>
	// 7432 11985:dastore         
	// 7433 11986:dup             
	// 7434 11987:iconst_4        
	// 7435 11988:ldc2w           #465 <Double 5.7586041999999997D>
	// 7436 11991:dastore         
	// 7437 11992:dup             
	// 7438 11993:iconst_5        
	// 7439 11994:ldc2w           #2065 <Double 2.3074553D>
	// 7440 11997:dastore         
	// 7441 11998:dup             
	// 7442 11999:bipush          6
	// 7443 12001:ldc2w           #2067 <Double 22.338887400000001D>
	// 7444 12004:dastore         
	// 7445 12005:dup             
	// 7446 12006:bipush          7
	// 7447 12008:ldc2w           #2069 <Double -1113.1008773999999D>
	// 7448 12011:dastore         
	// 7449 12012:dup             
	// 7450 12013:bipush          8
	// 7451 12015:ldc2w           #473 <Double -1.5229775000000001D>
	// 7452 12018:dastore         
	// 7453 12019:aastore         
	// 7454 12020:dup             
	// 7455 12021:bipush          13
	// 7456 12023:aload           8
	// 7457 12025:aastore         
	// 7458 12026:dup             
	// 7459 12027:bipush          14
	// 7460 12029:bipush          9
	// 7461 12031:newarray        double[]
	// 7462 12033:dup             
	// 7463 12034:iconst_0        
	// 7464 12035:ldc2w           #2071 <Double -24.751737899999998D>
	// 7465 12038:dastore         
	// 7466 12039:dup             
	// 7467 12040:iconst_1        
	// 7468 12041:ldc2w           #11  <Double -1.3875926999999999D>
	// 7469 12044:dastore         
	// 7470 12045:dup             
	// 7471 12046:iconst_2        
	// 7472 12047:ldc2w           #2073 <Double 2269.4887871999999D>
	// 7473 12050:dastore         
	// 7474 12051:dup             
	// 7475 12052:iconst_3        
	// 7476 12053:ldc2w           #265 <Double 200.29154579999999D>
	// 7477 12056:dastore         
	// 7478 12057:dup             
	// 7479 12058:iconst_4        
	// 7480 12059:ldc2w           #267 <Double 3.6574485999999999D>
	// 7481 12062:dastore         
	// 7482 12063:dup             
	// 7483 12064:iconst_5        
	// 7484 12065:ldc2w           #2075 <Double 2.9074553000000001D>
	// 7485 12068:dastore         
	// 7486 12069:dup             
	// 7487 12070:bipush          6
	// 7488 12072:ldc2w           #2077 <Double 17.695776200000001D>
	// 7489 12075:dastore         
	// 7490 12076:dup             
	// 7491 12077:bipush          7
	// 7492 12079:ldc2w           #2079 <Double -967.07507320000002D>
	// 7493 12082:dastore         
	// 7494 12083:dup             
	// 7495 12084:bipush          8
	// 7496 12086:ldc2w           #275 <Double -1.5784544D>
	// 7497 12089:dastore         
	// 7498 12090:aastore         
	// 7499 12091:dup             
	// 7500 12092:bipush          15
	// 7501 12094:aload           9
	// 7502 12096:aastore         
	// 7503 12097:dup             
	// 7504 12098:bipush          16
	// 7505 12100:aload           10
	// 7506 12102:aastore         
	// 7507 12103:dup             
	// 7508 12104:bipush          17
	// 7509 12106:bipush          9
	// 7510 12108:newarray        double[]
	// 7511 12110:dup             
	// 7512 12111:iconst_0        
	// 7513 12112:ldc2w           #2081 <Double -23.8517379D>
	// 7514 12115:dastore         
	// 7515 12116:dup             
	// 7516 12117:iconst_1        
	// 7517 12118:ldc2w           #11  <Double -1.3875926999999999D>
	// 7518 12121:dastore         
	// 7519 12122:dup             
	// 7520 12123:iconst_2        
	// 7521 12124:ldc2w           #2083 <Double 2205.4771214000002D>
	// 7522 12127:dastore         
	// 7523 12128:dup             
	// 7524 12129:iconst_3        
	// 7525 12130:ldc2w           #291 <Double 327.13300479999998D>
	// 7526 12133:dastore         
	// 7527 12134:dup             
	// 7528 12135:iconst_4        
	// 7529 12136:ldc2w           #293 <Double -2.4385346000000001D>
	// 7530 12139:dastore         
	// 7531 12140:dup             
	// 7532 12141:iconst_5        
	// 7533 12142:ldc2w           #2085 <Double 3.8074553D>
	// 7534 12145:dastore         
	// 7535 12146:dup             
	// 7536 12147:bipush          6
	// 7537 12149:ldc2w           #2087 <Double 1.6808677999999999D>
	// 7538 12152:dastore         
	// 7539 12153:dup             
	// 7540 12154:bipush          7
	// 7541 12156:ldc2w           #2089 <Double -266.25992439999999D>
	// 7542 12159:dastore         
	// 7543 12160:dup             
	// 7544 12161:bipush          8
	// 7545 12163:ldc2w           #301 <Double -1.5323681D>
	// 7546 12166:dastore         
	// 7547 12167:aastore         
	// 7548 12168:dup             
	// 7549 12169:bipush          18
	// 7550 12171:aload           11
	// 7551 12173:aastore         
	// 7552 12174:dup             
	// 7553 12175:bipush          19
	// 7554 12177:aload           12
	// 7555 12179:aastore         
	// 7556 12180:dup             
	// 7557 12181:bipush          20
	// 7558 12183:bipush          9
	// 7559 12185:newarray        double[]
	// 7560 12187:dup             
	// 7561 12188:iconst_0        
	// 7562 12189:ldc2w           #2091 <Double -28.735007800000002D>
	// 7563 12192:dastore         
	// 7564 12193:dup             
	// 7565 12194:iconst_1        
	// 7566 12195:ldc2w           #205 <Double -0.83208029999999999D>
	// 7567 12198:dastore         
	// 7568 12199:dup             
	// 7569 12200:iconst_2        
	// 7570 12201:ldc2w           #2093 <Double 2549.9902794D>
	// 7571 12204:dastore         
	// 7572 12205:dup             
	// 7573 12206:iconst_3        
	// 7574 12207:ldc2w           #319 <Double 11.2644424D>
	// 7575 12210:dastore         
	// 7576 12211:dup             
	// 7577 12212:iconst_4        
	// 7578 12213:ldc2w           #321 <Double 8.9614528999999994D>
	// 7579 12216:dastore         
	// 7580 12217:dup             
	// 7581 12218:iconst_5        
	// 7582 12219:ldc2w           #2095 <Double -0.99341599999999997D>
	// 7583 12222:dastore         
	// 7584 12223:dup             
	// 7585 12224:bipush          6
	// 7586 12226:ldc2w           #2097 <Double -34.4951881D>
	// 7587 12229:dastore         
	// 7588 12230:dup             
	// 7589 12231:bipush          7
	// 7590 12233:ldc2w           #2099 <Double 268.12924120000002D>
	// 7591 12236:dastore         
	// 7592 12237:dup             
	// 7593 12238:bipush          8
	// 7594 12240:ldc2w           #329 <Double -0.22733419999999999D>
	// 7595 12243:dastore         
	// 7596 12244:aastore         
	// 7597 12245:dup             
	// 7598 12246:bipush          21
	// 7599 12248:aload           13
	// 7600 12250:aastore         
	// 7601 12251:dup             
	// 7602 12252:bipush          22
	// 7603 12254:bipush          9
	// 7604 12256:newarray        double[]
	// 7605 12258:dup             
	// 7606 12259:iconst_0        
	// 7607 12260:ldc2w           #2101 <Double -28.1350078D>
	// 7608 12263:dastore         
	// 7609 12264:dup             
	// 7610 12265:iconst_1        
	// 7611 12266:ldc2w           #205 <Double -0.83208029999999999D>
	// 7612 12269:dastore         
	// 7613 12270:dup             
	// 7614 12271:iconst_2        
	// 7615 12272:ldc2w           #2103 <Double 2503.9827611999999D>
	// 7616 12275:dastore         
	// 7617 12276:dup             
	// 7618 12277:iconst_3        
	// 7619 12278:ldc2w           #31  <Double 28.2628214D>
	// 7620 12281:dastore         
	// 7621 12282:dup             
	// 7622 12283:iconst_4        
	// 7623 12284:ldc2w           #33  <Double 8.8398648000000009D>
	// 7624 12287:dastore         
	// 7625 12288:dup             
	// 7626 12289:iconst_5        
	// 7627 12290:ldc2w           #2105 <Double -0.39341599999999999D>
	// 7628 12293:dastore         
	// 7629 12294:dup             
	// 7630 12295:bipush          6
	// 7631 12297:ldc2w           #2107 <Double -29.055059799999999D>
	// 7632 12300:dastore         
	// 7633 12301:dup             
	// 7634 12302:bipush          7
	// 7635 12304:ldc2w           #2109 <Double 180.41423689999999D>
	// 7636 12307:dastore         
	// 7637 12308:dup             
	// 7638 12309:bipush          8
	// 7639 12311:ldc2w           #41  <Double -0.54830319999999999D>
	// 7640 12314:dastore         
	// 7641 12315:aastore         
	// 7642 12316:dup             
	// 7643 12317:bipush          23
	// 7644 12319:bipush          9
	// 7645 12321:newarray        double[]
	// 7646 12323:dup             
	// 7647 12324:iconst_0        
	// 7648 12325:ldc2w           #2111 <Double -27.8350078D>
	// 7649 12328:dastore         
	// 7650 12329:dup             
	// 7651 12330:iconst_1        
	// 7652 12331:ldc2w           #205 <Double -0.83208029999999999D>
	// 7653 12334:dastore         
	// 7654 12335:dup             
	// 7655 12336:iconst_2        
	// 7656 12337:ldc2w           #2113 <Double 2480.979002D>
	// 7657 12340:dastore         
	// 7658 12341:dup             
	// 7659 12342:iconst_3        
	// 7660 12343:ldc2w           #47  <Double 37.305238799999998D>
	// 7661 12346:dastore         
	// 7662 12347:dup             
	// 7663 12348:iconst_4        
	// 7664 12349:ldc2w           #49  <Double 8.7346948999999992D>
	// 7665 12352:dastore         
	// 7666 12353:dup             
	// 7667 12354:iconst_5        
	// 7668 12355:ldc2w           #2115 <Double -0.093415999999999999D>
	// 7669 12358:dastore         
	// 7670 12359:dup             
	// 7671 12360:bipush          6
	// 7672 12362:ldc2w           #2117 <Double -23.3959945D>
	// 7673 12365:dastore         
	// 7674 12366:dup             
	// 7675 12367:bipush          7
	// 7676 12369:ldc2w           #2119 <Double 91.793254500000003D>
	// 7677 12372:dastore         
	// 7678 12373:dup             
	// 7679 12374:bipush          8
	// 7680 12376:ldc2w           #57  <Double -0.70060560000000005D>
	// 7681 12379:dastore         
	// 7682 12380:aastore         
	// 7683 12381:dup             
	// 7684 12382:bipush          24
	// 7685 12384:bipush          9
	// 7686 12386:newarray        double[]
	// 7687 12388:dup             
	// 7688 12389:iconst_0        
	// 7689 12390:ldc2w           #2121 <Double -27.535007799999999D>
	// 7690 12393:dastore         
	// 7691 12394:dup             
	// 7692 12395:iconst_1        
	// 7693 12396:ldc2w           #205 <Double -0.83208029999999999D>
	// 7694 12399:dastore         
	// 7695 12400:dup             
	// 7696 12401:iconst_2        
	// 7697 12402:ldc2w           #2123 <Double 2457.9752429D>
	// 7698 12405:dastore         
	// 7699 12406:dup             
	// 7700 12407:iconst_3        
	// 7701 12408:ldc2w           #541 <Double 46.896400399999997D>
	// 7702 12411:dastore         
	// 7703 12412:dup             
	// 7704 12413:iconst_4        
	// 7705 12414:ldc2w           #543 <Double 8.5943556999999995D>
	// 7706 12417:dastore         
	// 7707 12418:dup             
	// 7708 12419:iconst_5        
	// 7709 12420:ldc2w           #2125 <Double 0.20658399999999999D>
	// 7710 12423:dastore         
	// 7711 12424:dup             
	// 7712 12425:bipush          6
	// 7713 12427:ldc2w           #2127 <Double -16.298394399999999D>
	// 7714 12430:dastore         
	// 7715 12431:dup             
	// 7716 12432:bipush          7
	// 7717 12434:ldc2w           #2129 <Double -34.786987000000003D>
	// 7718 12437:dastore         
	// 7719 12438:dup             
	// 7720 12439:bipush          8
	// 7721 12441:ldc2w           #551 <Double -0.84519750000000005D>
	// 7722 12444:dastore         
	// 7723 12445:aastore         
	// 7724 12446:dup             
	// 7725 12447:bipush          25
	// 7726 12449:bipush          9
	// 7727 12451:newarray        double[]
	// 7728 12453:dup             
	// 7729 12454:iconst_0        
	// 7730 12455:ldc2w           #2131 <Double -27.235007800000002D>
	// 7731 12458:dastore         
	// 7732 12459:dup             
	// 7733 12460:iconst_1        
	// 7734 12461:ldc2w           #205 <Double -0.83208029999999999D>
	// 7735 12464:dastore         
	// 7736 12465:dup             
	// 7737 12466:iconst_2        
	// 7738 12467:ldc2w           #2133 <Double 2434.9714837000001D>
	// 7739 12470:dastore         
	// 7740 12471:dup             
	// 7741 12472:iconst_3        
	// 7742 12473:ldc2w           #63  <Double 57.2001287D>
	// 7743 12476:dastore         
	// 7744 12477:dup             
	// 7745 12478:iconst_4        
	// 7746 12479:ldc2w           #65  <Double 8.4126647000000006D>
	// 7747 12482:dastore         
	// 7748 12483:dup             
	// 7749 12484:iconst_5        
	// 7750 12485:ldc2w           #2135 <Double 0.50658400000000003D>
	// 7751 12488:dastore         
	// 7752 12489:dup             
	// 7753 12490:bipush          6
	// 7754 12492:ldc2w           #2137 <Double -8.3395575999999991D>
	// 7755 12495:dastore         
	// 7756 12496:dup             
	// 7757 12497:bipush          7
	// 7758 12499:ldc2w           #2139 <Double -197.7702682D>
	// 7759 12502:dastore         
	// 7760 12503:dup             
	// 7761 12504:bipush          8
	// 7762 12506:ldc2w           #73  <Double -0.98049019999999998D>
	// 7763 12509:dastore         
	// 7764 12510:aastore         
	// 7765 12511:dup             
	// 7766 12512:bipush          26
	// 7767 12514:bipush          9
	// 7768 12516:newarray        double[]
	// 7769 12518:dup             
	// 7770 12519:iconst_0        
	// 7771 12520:ldc2w           #2141 <Double -26.935007800000001D>
	// 7772 12523:dastore         
	// 7773 12524:dup             
	// 7774 12525:iconst_1        
	// 7775 12526:ldc2w           #205 <Double -0.83208029999999999D>
	// 7776 12529:dastore         
	// 7777 12530:dup             
	// 7778 12531:iconst_2        
	// 7779 12532:ldc2w           #2143 <Double 2411.9677246000001D>
	// 7780 12535:dastore         
	// 7781 12536:dup             
	// 7782 12537:iconst_3        
	// 7783 12538:ldc2w           #345 <Double 68.407805800000006D>
	// 7784 12541:dastore         
	// 7785 12542:dup             
	// 7786 12543:iconst_4        
	// 7787 12544:ldc2w           #347 <Double 8.1813959000000001D>
	// 7788 12547:dastore         
	// 7789 12548:dup             
	// 7790 12549:iconst_5        
	// 7791 12550:ldc2w           #2145 <Double 0.80658399999999997D>
	// 7792 12553:dastore         
	// 7793 12554:dup             
	// 7794 12555:bipush          6
	// 7795 12557:ldc2w           #2147 <Double -0.1810862D>
	// 7796 12560:dastore         
	// 7797 12561:dup             
	// 7798 12562:bipush          7
	// 7799 12564:ldc2w           #2149 <Double -388.67267850000002D>
	// 7800 12567:dastore         
	// 7801 12568:dup             
	// 7802 12569:bipush          8
	// 7803 12571:ldc2w           #355 <Double -1.1049982D>
	// 7804 12574:dastore         
	// 7805 12575:aastore         
	// 7806 12576:dup             
	// 7807 12577:bipush          27
	// 7808 12579:bipush          9
	// 7809 12581:newarray        double[]
	// 7810 12583:dup             
	// 7811 12584:iconst_0        
	// 7812 12585:ldc2w           #2151 <Double -26.6350078D>
	// 7813 12588:dastore         
	// 7814 12589:dup             
	// 7815 12590:iconst_1        
	// 7816 12591:ldc2w           #205 <Double -0.83208029999999999D>
	// 7817 12594:dastore         
	// 7818 12595:dup             
	// 7819 12596:iconst_2        
	// 7820 12597:ldc2w           #2153 <Double 2388.9639655000001D>
	// 7821 12600:dastore         
	// 7822 12601:dup             
	// 7823 12602:iconst_3        
	// 7824 12603:ldc2w           #79  <Double 80.747736000000003D>
	// 7825 12606:dastore         
	// 7826 12607:dup             
	// 7827 12608:iconst_4        
	// 7828 12609:ldc2w           #81  <Double 7.8897272999999997D>
	// 7829 12612:dastore         
	// 7830 12613:dup             
	// 7831 12614:iconst_5        
	// 7832 12615:ldc2w           #2155 <Double 1.106584D>
	// 7833 12618:dastore         
	// 7834 12619:dup             
	// 7835 12620:bipush          6
	// 7836 12622:ldc2w           #2157 <Double 7.4958762999999999D>
	// 7837 12625:dastore         
	// 7838 12626:dup             
	// 7839 12627:bipush          7
	// 7840 12629:ldc2w           #2159 <Double -592.60154480000006D>
	// 7841 12632:dastore         
	// 7842 12633:dup             
	// 7843 12634:bipush          8
	// 7844 12636:ldc2w           #89  <Double -1.2173562D>
	// 7845 12639:dastore         
	// 7846 12640:aastore         
	// 7847 12641:dup             
	// 7848 12642:bipush          28
	// 7849 12644:aload           14
	// 7850 12646:aastore         
	// 7851 12647:dup             
	// 7852 12648:bipush          29
	// 7853 12650:aload           15
	// 7854 12652:aastore         
	// 7855 12653:dup             
	// 7856 12654:bipush          30
	// 7857 12656:aload           16
	// 7858 12658:aastore         
	// 7859 12659:dup             
	// 7860 12660:bipush          31
	// 7861 12662:bipush          9
	// 7862 12664:newarray        double[]
	// 7863 12666:dup             
	// 7864 12667:iconst_0        
	// 7865 12668:ldc2w           #2161 <Double -25.435007800000001D>
	// 7866 12671:dastore         
	// 7867 12672:dup             
	// 7868 12673:iconst_1        
	// 7869 12674:ldc2w           #205 <Double -0.83208029999999999D>
	// 7870 12677:dastore         
	// 7871 12678:dup             
	// 7872 12679:iconst_2        
	// 7873 12680:ldc2w           #2163 <Double 2296.9489288999998D>
	// 7874 12683:dastore         
	// 7875 12684:dup             
	// 7876 12685:iconst_3        
	// 7877 12686:ldc2w           #463 <Double 148.1152635D>
	// 7878 12689:dastore         
	// 7879 12690:dup             
	// 7880 12691:iconst_4        
	// 7881 12692:ldc2w           #465 <Double 5.7586041999999997D>
	// 7882 12695:dastore         
	// 7883 12696:dup             
	// 7884 12697:iconst_5        
	// 7885 12698:ldc2w           #2165 <Double 2.306584D>
	// 7886 12701:dastore         
	// 7887 12702:dup             
	// 7888 12703:bipush          6
	// 7889 12705:ldc2w           #2167 <Double 22.638871600000002D>
	// 7890 12708:dastore         
	// 7891 12709:dup             
	// 7892 12710:bipush          7
	// 7893 12712:ldc2w           #2169 <Double -1124.5107877999999D>
	// 7894 12715:dastore         
	// 7895 12716:dup             
	// 7896 12717:bipush          8
	// 7897 12719:ldc2w           #473 <Double -1.5229775000000001D>
	// 7898 12722:dastore         
	// 7899 12723:aastore         
	// 7900 12724:dup             
	// 7901 12725:bipush          32
	// 7902 12727:bipush          9
	// 7903 12729:newarray        double[]
	// 7904 12731:dup             
	// 7905 12732:iconst_0        
	// 7906 12733:ldc2w           #2171 <Double -25.1350078D>
	// 7907 12736:dastore         
	// 7908 12737:dup             
	// 7909 12738:iconst_1        
	// 7910 12739:ldc2w           #205 <Double -0.83208029999999999D>
	// 7911 12742:dastore         
	// 7912 12743:dup             
	// 7913 12744:iconst_2        
	// 7914 12745:ldc2w           #2173 <Double 2273.9451697999998D>
	// 7915 12748:dastore         
	// 7916 12749:dup             
	// 7917 12750:iconst_3        
	// 7918 12751:ldc2w           #143 <Double 171.99884599999999D>
	// 7919 12754:dastore         
	// 7920 12755:dup             
	// 7921 12756:iconst_4        
	// 7922 12757:ldc2w           #145 <Double 4.8356763999999997D>
	// 7923 12760:dastore         
	// 7924 12761:dup             
	// 7925 12762:iconst_5        
	// 7926 12763:ldc2w           #2175 <Double 2.6065839999999998D>
	// 7927 12766:dastore         
	// 7928 12767:dup             
	// 7929 12768:bipush          6
	// 7930 12770:ldc2w           #2177 <Double 21.2548256D>
	// 7931 12773:dastore         
	// 7932 12774:dup             
	// 7933 12775:bipush          7
	// 7934 12777:ldc2w           #2179 <Double -1093.4785305D>
	// 7935 12780:dastore         
	// 7936 12781:dup             
	// 7937 12782:bipush          8
	// 7938 12784:ldc2w           #153 <Double -1.5592649999999999D>
	// 7939 12787:dastore         
	// 7940 12788:aastore         
	// 7941 12789:dup             
	// 7942 12790:bipush          33
	// 7943 12792:aload           17
	// 7944 12794:aastore         
	// 7945 12795:dup             
	// 7946 12796:bipush          34
	// 7947 12798:aload           18
	// 7948 12800:aastore         
	// 7949 12801:dup             
	// 7950 12802:bipush          35
	// 7951 12804:bipush          9
	// 7952 12806:newarray        double[]
	// 7953 12808:dup             
	// 7954 12809:iconst_0        
	// 7955 12810:ldc2w           #2181 <Double -24.235007800000002D>
	// 7956 12813:dastore         
	// 7957 12814:dup             
	// 7958 12815:iconst_1        
	// 7959 12816:ldc2w           #205 <Double -0.83208029999999999D>
	// 7960 12819:dastore         
	// 7961 12820:dup             
	// 7962 12821:iconst_2        
	// 7963 12822:ldc2w           #2183 <Double 2204.9338923D>
	// 7964 12825:dastore         
	// 7965 12826:dup             
	// 7966 12827:iconst_3        
	// 7967 12828:ldc2w           #175 <Double 275.7268449D>
	// 7968 12831:dastore         
	// 7969 12832:dup             
	// 7970 12833:iconst_4        
	// 7971 12834:ldc2w           #177 <Double 0.1651599D>
	// 7972 12837:dastore         
	// 7973 12838:dup             
	// 7974 12839:iconst_5        
	// 7975 12840:ldc2w           #2185 <Double 3.5065840000000001D>
	// 7976 12843:dastore         
	// 7977 12844:dup             
	// 7978 12845:bipush          6
	// 7979 12847:ldc2w           #2187 <Double 7.7393234D>
	// 7980 12850:dastore         
	// 7981 12851:dup             
	// 7982 12852:bipush          7
	// 7983 12854:ldc2w           #2189 <Double -551.02685340000005D>
	// 7984 12857:dastore         
	// 7985 12858:dup             
	// 7986 12859:bipush          8
	// 7987 12861:ldc2w           #185 <Double -1.5649227999999999D>
	// 7988 12864:dastore         
	// 7989 12865:aastore         
	// 7990 12866:dup             
	// 7991 12867:bipush          36
	// 7992 12869:aload           19
	// 7993 12871:aastore         
	// 7994 12872:dup             
	// 7995 12873:bipush          37
	// 7996 12875:aload           20
	// 7997 12877:aastore         
	// 7998 12878:dup             
	// 7999 12879:bipush          38
	// 8000 12881:bipush          9
	// 8001 12883:newarray        double[]
	// 8002 12885:dup             
	// 8003 12886:iconst_0        
	// 8004 12887:ldc2w           #2191 <Double -27.077328300000001D>
	// 8005 12890:dastore         
	// 8006 12891:dup             
	// 8007 12892:iconst_1        
	// 8008 12893:ldc2w           #315 <Double -0.2807772D>
	// 8009 12896:dastore         
	// 8010 12897:dup             
	// 8011 12898:iconst_2        
	// 8012 12899:ldc2w           #2193 <Double 2420.8864662999999D>
	// 8013 12902:dastore         
	// 8014 12903:dup             
	// 8015 12904:iconst_3        
	// 8016 12905:ldc2w           #209 <Double 3.0597946D>
	// 8017 12908:dastore         
	// 8018 12909:dup             
	// 8019 12910:iconst_4        
	// 8020 12911:ldc2w           #211 <Double 8.9830009000000004D>
	// 8021 12914:dastore         
	// 8022 12915:dup             
	// 8023 12916:iconst_5        
	// 8024 12917:ldc2w           #2195 <Double -1.2944316D>
	// 8025 12920:dastore         
	// 8026 12921:dup             
	// 8027 12922:bipush          6
	// 8028 12924:ldc2w           #2197 <Double -33.678682600000002D>
	// 8029 12927:dastore         
	// 8030 12928:dup             
	// 8031 12929:bipush          7
	// 8032 12931:ldc2w           #2199 <Double 289.05910699999998D>
	// 8033 12934:dastore         
	// 8034 12935:dup             
	// 8035 12936:bipush          8
	// 8036 12938:ldc2w           #219 <Double -0.062199999999999998D>
	// 8037 12941:dastore         
	// 8038 12942:aastore         
	// 8039 12943:dup             
	// 8040 12944:bipush          39
	// 8041 12946:aload           21
	// 8042 12948:aastore         
	// 8043 12949:dup             
	// 8044 12950:bipush          40
	// 8045 12952:bipush          9
	// 8046 12954:newarray        double[]
	// 8047 12956:dup             
	// 8048 12957:iconst_0        
	// 8049 12958:ldc2w           #2201 <Double -26.4773283D>
	// 8050 12961:dastore         
	// 8051 12962:dup             
	// 8052 12963:iconst_1        
	// 8053 12964:ldc2w           #315 <Double -0.2807772D>
	// 8054 12967:dastore         
	// 8055 12968:dup             
	// 8056 12969:iconst_2        
	// 8057 12970:ldc2w           #2203 <Double 2371.5711295000001D>
	// 8058 12973:dastore         
	// 8059 12974:dup             
	// 8060 12975:iconst_3        
	// 8061 12976:ldc2w           #15  <Double 19.625597299999999D>
	// 8062 12979:dastore         
	// 8063 12980:dup             
	// 8064 12981:iconst_4        
	// 8065 12982:ldc2w           #17  <Double 8.9143979000000009D>
	// 8066 12985:dastore         
	// 8067 12986:dup             
	// 8068 12987:iconst_5        
	// 8069 12988:ldc2w           #2205 <Double -0.69443160000000004D>
	// 8070 12991:dastore         
	// 8071 12992:dup             
	// 8072 12993:bipush          6
	// 8073 12995:ldc2w           #2207 <Double -32.539126199999998D>
	// 8074 12998:dastore         
	// 8075 12999:dup             
	// 8076 13000:bipush          7
	// 8077 13002:ldc2w           #2209 <Double 233.5277921D>
	// 8078 13005:dastore         
	// 8079 13006:dup             
	// 8080 13007:bipush          8
	// 8081 13009:ldc2w           #25  <Double -0.38996530000000001D>
	// 8082 13012:dastore         
	// 8083 13013:aastore         
	// 8084 13014:dup             
	// 8085 13015:bipush          41
	// 8086 13017:bipush          9
	// 8087 13019:newarray        double[]
	// 8088 13021:dup             
	// 8089 13022:iconst_0        
	// 8090 13023:ldc2w           #2211 <Double -26.177328299999999D>
	// 8091 13026:dastore         
	// 8092 13027:dup             
	// 8093 13028:iconst_1        
	// 8094 13029:ldc2w           #315 <Double -0.2807772D>
	// 8095 13032:dastore         
	// 8096 13033:dup             
	// 8097 13034:iconst_2        
	// 8098 13035:ldc2w           #2213 <Double 2346.9134610999999D>
	// 8099 13038:dastore         
	// 8100 13039:dup             
	// 8101 13040:iconst_3        
	// 8102 13041:ldc2w           #31  <Double 28.2628214D>
	// 8103 13044:dastore         
	// 8104 13045:dup             
	// 8105 13046:iconst_4        
	// 8106 13047:ldc2w           #33  <Double 8.8398648000000009D>
	// 8107 13050:dastore         
	// 8108 13051:dup             
	// 8109 13052:iconst_5        
	// 8110 13053:ldc2w           #2215 <Double -0.39443159999999999D>
	// 8111 13056:dastore         
	// 8112 13057:dup             
	// 8113 13058:bipush          6
	// 8114 13060:ldc2w           #2217 <Double -28.755080199999998D>
	// 8115 13063:dastore         
	// 8116 13064:dup             
	// 8117 13065:bipush          7
	// 8118 13067:ldc2w           #2219 <Double 177.11767839999999D>
	// 8119 13070:dastore         
	// 8120 13071:dup             
	// 8121 13072:bipush          8
	// 8122 13074:ldc2w           #41  <Double -0.54830319999999999D>
	// 8123 13077:dastore         
	// 8124 13078:aastore         
	// 8125 13079:dup             
	// 8126 13080:bipush          42
	// 8127 13082:bipush          9
	// 8128 13084:newarray        double[]
	// 8129 13086:dup             
	// 8130 13087:iconst_0        
	// 8131 13088:ldc2w           #2221 <Double -25.877328299999999D>
	// 8132 13091:dastore         
	// 8133 13092:dup             
	// 8134 13093:iconst_1        
	// 8135 13094:ldc2w           #315 <Double -0.2807772D>
	// 8136 13097:dastore         
	// 8137 13098:dup             
	// 8138 13099:iconst_2        
	// 8139 13100:ldc2w           #2223 <Double 2322.2557926999998D>
	// 8140 13103:dastore         
	// 8141 13104:dup             
	// 8142 13105:iconst_3        
	// 8143 13106:ldc2w           #47  <Double 37.305238799999998D>
	// 8144 13109:dastore         
	// 8145 13110:dup             
	// 8146 13111:iconst_4        
	// 8147 13112:ldc2w           #49  <Double 8.7346948999999992D>
	// 8148 13115:dastore         
	// 8149 13116:dup             
	// 8150 13117:iconst_5        
	// 8151 13118:ldc2w           #2225 <Double -0.094431600000000004D>
	// 8152 13121:dastore         
	// 8153 13122:dup             
	// 8154 13123:bipush          6
	// 8155 13125:ldc2w           #2227 <Double -23.096015000000001D>
	// 8156 13128:dastore         
	// 8157 13129:dup             
	// 8158 13130:bipush          7
	// 8159 13132:ldc2w           #2229 <Double 87.596757400000001D>
	// 8160 13135:dastore         
	// 8161 13136:dup             
	// 8162 13137:bipush          8
	// 8163 13139:ldc2w           #57  <Double -0.70060560000000005D>
	// 8164 13142:dastore         
	// 8165 13143:aastore         
	// 8166 13144:dup             
	// 8167 13145:bipush          43
	// 8168 13147:bipush          9
	// 8169 13149:newarray        double[]
	// 8170 13151:dup             
	// 8171 13152:iconst_0        
	// 8172 13153:ldc2w           #2231 <Double -25.577328300000001D>
	// 8173 13156:dastore         
	// 8174 13157:dup             
	// 8175 13158:iconst_1        
	// 8176 13159:ldc2w           #315 <Double -0.2807772D>
	// 8177 13162:dastore         
	// 8178 13163:dup             
	// 8179 13164:iconst_2        
	// 8180 13165:ldc2w           #2233 <Double 2297.5981244D>
	// 8181 13168:dastore         
	// 8182 13169:dup             
	// 8183 13170:iconst_3        
	// 8184 13171:ldc2w           #541 <Double 46.896400399999997D>
	// 8185 13174:dastore         
	// 8186 13175:dup             
	// 8187 13176:iconst_4        
	// 8188 13177:ldc2w           #543 <Double 8.5943556999999995D>
	// 8189 13180:dastore         
	// 8190 13181:dup             
	// 8191 13182:iconst_5        
	// 8192 13183:ldc2w           #2235 <Double 0.20556840000000001D>
	// 8193 13186:dastore         
	// 8194 13187:dup             
	// 8195 13188:bipush          6
	// 8196 13190:ldc2w           #2237 <Double -15.9984149D>
	// 8197 13193:dastore         
	// 8198 13194:dup             
	// 8199 13195:bipush          7
	// 8200 13197:ldc2w           #2239 <Double -39.883422799999998D>
	// 8201 13200:dastore         
	// 8202 13201:dup             
	// 8203 13202:bipush          8
	// 8204 13204:ldc2w           #551 <Double -0.84519750000000005D>
	// 8205 13207:dastore         
	// 8206 13208:aastore         
	// 8207 13209:dup             
	// 8208 13210:bipush          44
	// 8209 13212:aload           22
	// 8210 13214:aastore         
	// 8211 13215:dup             
	// 8212 13216:bipush          45
	// 8213 13218:aload           23
	// 8214 13220:aastore         
	// 8215 13221:dup             
	// 8216 13222:bipush          46
	// 8217 13224:bipush          9
	// 8218 13226:newarray        double[]
	// 8219 13228:dup             
	// 8220 13229:iconst_0        
	// 8221 13230:ldc2w           #2241 <Double -24.677328299999999D>
	// 8222 13233:dastore         
	// 8223 13234:dup             
	// 8224 13235:iconst_1        
	// 8225 13236:ldc2w           #315 <Double -0.2807772D>
	// 8226 13239:dastore         
	// 8227 13240:dup             
	// 8228 13241:iconst_2        
	// 8229 13242:ldc2w           #2243 <Double 2223.6251192D>
	// 8230 13245:dastore         
	// 8231 13246:dup             
	// 8232 13247:iconst_3        
	// 8233 13248:ldc2w           #79  <Double 80.747736000000003D>
	// 8234 13251:dastore         
	// 8235 13252:dup             
	// 8236 13253:iconst_4        
	// 8237 13254:ldc2w           #81  <Double 7.8897272999999997D>
	// 8238 13257:dastore         
	// 8239 13258:dup             
	// 8240 13259:iconst_5        
	// 8241 13260:ldc2w           #2245 <Double 1.1055683999999999D>
	// 8242 13263:dastore         
	// 8243 13264:dup             
	// 8244 13265:bipush          6
	// 8245 13267:ldc2w           #2247 <Double 7.7958558D>
	// 8246 13270:dastore         
	// 8247 13271:dup             
	// 8248 13272:bipush          7
	// 8249 13274:ldc2w           #2249 <Double -600.39779650000003D>
	// 8250 13277:dastore         
	// 8251 13278:dup             
	// 8252 13279:bipush          8
	// 8253 13281:ldc2w           #89  <Double -1.2173562D>
	// 8254 13284:dastore         
	// 8255 13285:aastore         
	// 8256 13286:dup             
	// 8257 13287:bipush          47
	// 8258 13289:aload           24
	// 8259 13291:aastore         
	// 8260 13292:dup             
	// 8261 13293:bipush          48
	// 8262 13295:aload           25
	// 8263 13297:aastore         
	// 8264 13298:dup             
	// 8265 13299:bipush          49
	// 8266 13301:bipush          9
	// 8267 13303:newarray        double[]
	// 8268 13305:dup             
	// 8269 13306:iconst_0        
	// 8270 13307:ldc2w           #2251 <Double -23.777328300000001D>
	// 8271 13310:dastore         
	// 8272 13311:dup             
	// 8273 13312:iconst_1        
	// 8274 13313:ldc2w           #315 <Double -0.2807772D>
	// 8275 13316:dastore         
	// 8276 13317:dup             
	// 8277 13318:iconst_2        
	// 8278 13319:ldc2w           #2253 <Double 2149.6521140999998D>
	// 8279 13322:dastore         
	// 8280 13323:dup             
	// 8281 13324:iconst_3        
	// 8282 13325:ldc2w           #127 <Double 127.6888198D>
	// 8283 13328:dastore         
	// 8284 13329:dup             
	// 8285 13330:iconst_4        
	// 8286 13331:ldc2w           #129 <Double 6.4866308999999998D>
	// 8287 13334:dastore         
	// 8288 13335:dup             
	// 8289 13336:iconst_5        
	// 8290 13337:ldc2w           #2255 <Double 2.0055684D>
	// 8291 13340:dastore         
	// 8292 13341:dup             
	// 8293 13342:bipush          6
	// 8294 13344:ldc2w           #2257 <Double 22.1949334D>
	// 8295 13347:dastore         
	// 8296 13348:dup             
	// 8297 13349:bipush          7
	// 8298 13351:ldc2w           #2259 <Double -1086.0948565000001D>
	// 8299 13354:dastore         
	// 8300 13355:dup             
	// 8301 13356:bipush          8
	// 8302 13358:ldc2w           #137 <Double -1.4699811D>
	// 8303 13361:dastore         
	// 8304 13362:aastore         
	// 8305 13363:dup             
	// 8306 13364:bipush          50
	// 8307 13366:bipush          9
	// 8308 13368:newarray        double[]
	// 8309 13370:dup             
	// 8310 13371:iconst_0        
	// 8311 13372:ldc2w           #2261 <Double -23.4773283D>
	// 8312 13375:dastore         
	// 8313 13376:dup             
	// 8314 13377:iconst_1        
	// 8315 13378:ldc2w           #315 <Double -0.2807772D>
	// 8316 13381:dastore         
	// 8317 13382:dup             
	// 8318 13383:iconst_2        
	// 8319 13384:ldc2w           #2263 <Double 2124.9944457000001D>
	// 8320 13387:dastore         
	// 8321 13388:dup             
	// 8322 13389:iconst_3        
	// 8323 13390:ldc2w           #463 <Double 148.1152635D>
	// 8324 13393:dastore         
	// 8325 13394:dup             
	// 8326 13395:iconst_4        
	// 8327 13396:ldc2w           #465 <Double 5.7586041999999997D>
	// 8328 13399:dastore         
	// 8329 13400:dup             
	// 8330 13401:iconst_5        
	// 8331 13402:ldc2w           #2265 <Double 2.3055683999999999D>
	// 8332 13405:dastore         
	// 8333 13406:dup             
	// 8334 13407:bipush          6
	// 8335 13409:ldc2w           #2267 <Double 22.938851100000001D>
	// 8336 13412:dastore         
	// 8337 13413:dup             
	// 8338 13414:bipush          7
	// 8339 13416:ldc2w           #2269 <Double -1135.9067938999999D>
	// 8340 13419:dastore         
	// 8341 13420:dup             
	// 8342 13421:bipush          8
	// 8343 13423:ldc2w           #473 <Double -1.5229775000000001D>
	// 8344 13426:dastore         
	// 8345 13427:aastore         
	// 8346 13428:dup             
	// 8347 13429:bipush          51
	// 8348 13431:bipush          9
	// 8349 13433:newarray        double[]
	// 8350 13435:dup             
	// 8351 13436:iconst_0        
	// 8352 13437:ldc2w           #2271 <Double -23.177328299999999D>
	// 8353 13440:dastore         
	// 8354 13441:dup             
	// 8355 13442:iconst_1        
	// 8356 13443:ldc2w           #315 <Double -0.2807772D>
	// 8357 13446:dastore         
	// 8358 13447:dup             
	// 8359 13448:iconst_2        
	// 8360 13449:ldc2w           #2273 <Double 2100.3367773D>
	// 8361 13452:dastore         
	// 8362 13453:dup             
	// 8363 13454:iconst_3        
	// 8364 13455:ldc2w           #143 <Double 171.99884599999999D>
	// 8365 13458:dastore         
	// 8366 13459:dup             
	// 8367 13460:iconst_4        
	// 8368 13461:ldc2w           #145 <Double 4.8356763999999997D>
	// 8369 13464:dastore         
	// 8370 13465:dup             
	// 8371 13466:iconst_5        
	// 8372 13467:ldc2w           #2275 <Double 2.6055684000000001D>
	// 8373 13470:dastore         
	// 8374 13471:dup             
	// 8375 13472:bipush          6
	// 8376 13474:ldc2w           #2277 <Double 21.554805099999999D>
	// 8377 13477:dastore         
	// 8378 13478:dup             
	// 8379 13479:bipush          7
	// 8380 13481:ldc2w           #2279 <Double -1105.7744754D>
	// 8381 13484:dastore         
	// 8382 13485:dup             
	// 8383 13486:bipush          8
	// 8384 13488:ldc2w           #153 <Double -1.5592649999999999D>
	// 8385 13491:dastore         
	// 8386 13492:aastore         
	// 8387 13493:dup             
	// 8388 13494:bipush          52
	// 8389 13496:aload           26
	// 8390 13498:aastore         
	// 8391 13499:dup             
	// 8392 13500:bipush          53
	// 8393 13502:aload           27
	// 8394 13504:aastore         
	// 8395 13505:dup             
	// 8396 13506:bipush          54
	// 8397 13508:bipush          9
	// 8398 13510:newarray        double[]
	// 8399 13512:dup             
	// 8400 13513:iconst_0        
	// 8401 13514:ldc2w           #2281 <Double -22.277328300000001D>
	// 8402 13517:dastore         
	// 8403 13518:dup             
	// 8404 13519:iconst_1        
	// 8405 13520:ldc2w           #315 <Double -0.2807772D>
	// 8406 13523:dastore         
	// 8407 13524:dup             
	// 8408 13525:iconst_2        
	// 8409 13526:ldc2w           #2283 <Double 2026.3637721D>
	// 8410 13529:dastore         
	// 8411 13530:dup             
	// 8412 13531:iconst_3        
	// 8413 13532:ldc2w           #175 <Double 275.7268449D>
	// 8414 13535:dastore         
	// 8415 13536:dup             
	// 8416 13537:iconst_4        
	// 8417 13538:ldc2w           #177 <Double 0.1651599D>
	// 8418 13541:dastore         
	// 8419 13542:dup             
	// 8420 13543:iconst_5        
	// 8421 13544:ldc2w           #2285 <Double 3.5055684D>
	// 8422 13547:dastore         
	// 8423 13548:dup             
	// 8424 13549:bipush          6
	// 8425 13551:ldc2w           #2287 <Double 8.0393030000000003D>
	// 8426 13554:dastore         
	// 8427 13555:dup             
	// 8428 13556:bipush          7
	// 8429 13558:ldc2w           #2289 <Double -566.02261410000006D>
	// 8430 13561:dastore         
	// 8431 13562:dup             
	// 8432 13563:bipush          8
	// 8433 13565:ldc2w           #185 <Double -1.5649227999999999D>
	// 8434 13568:dastore         
	// 8435 13569:aastore         
	// 8436 13570:dup             
	// 8437 13571:bipush          55
	// 8438 13573:aload           28
	// 8439 13575:aastore         
	// 8440 13576:dup             
	// 8441 13577:bipush          56
	// 8442 13579:bipush          9
	// 8443 13581:newarray        double[]
	// 8444 13583:dup             
	// 8445 13584:iconst_0        
	// 8446 13585:ldc2w           #2291 <Double -21.677328299999999D>
	// 8447 13588:dastore         
	// 8448 13589:dup             
	// 8449 13590:iconst_1        
	// 8450 13591:ldc2w           #315 <Double -0.2807772D>
	// 8451 13594:dastore         
	// 8452 13595:dup             
	// 8453 13596:iconst_2        
	// 8454 13597:ldc2w           #2293 <Double 1977.0484354D>
	// 8455 13600:dastore         
	// 8456 13601:dup             
	// 8457 13602:iconst_3        
	// 8458 13603:ldc2w           #191 <Double 392.10647540000002D>
	// 8459 13606:dastore         
	// 8460 13607:dup             
	// 8461 13608:iconst_4        
	// 8462 13609:ldc2w           #193 <Double -5.9244687000000003D>
	// 8463 13612:dastore         
	// 8464 13613:dup             
	// 8465 13614:iconst_5        
	// 8466 13615:ldc2w           #2295 <Double 4.1055684000000001D>
	// 8467 13618:dastore         
	// 8468 13619:dup             
	// 8469 13620:bipush          6
	// 8470 13622:ldc2w           #2297 <Double -2.9961308999999998D>
	// 8471 13625:dastore         
	// 8472 13626:dup             
	// 8473 13627:bipush          7
	// 8474 13629:ldc2w           #2299 <Double -38.726793499999999D>
	// 8475 13632:dastore         
	// 8476 13633:dup             
	// 8477 13634:bipush          8
	// 8478 13636:ldc2w           #201 <Double -1.4830451D>
	// 8479 13639:dastore         
	// 8480 13640:aastore         
	// 8481 13641:dup             
	// 8482 13642:bipush          57
	// 8483 13644:aload           29
	// 8484 13646:aastore         
	// 8485 13647:dup             
	// 8486 13648:bipush          58
	// 8487 13650:aload           30
	// 8488 13652:aastore         
	// 8489 13653:dup             
	// 8490 13654:bipush          59
	// 8491 13656:bipush          9
	// 8492 13658:newarray        double[]
	// 8493 13660:dup             
	// 8494 13661:iconst_0        
	// 8495 13662:ldc2w           #2301 <Double -22.611670700000001D>
	// 8496 13665:dastore         
	// 8497 13666:dup             
	// 8498 13667:iconst_1        
	// 8499 13668:ldc2w           #409 <Double 0.24171519999999999D>
	// 8500 13671:dastore         
	// 8501 13672:dup             
	// 8502 13673:iconst_2        
	// 8503 13674:ldc2w           #2303 <Double 2057.8965609000002D>
	// 8504 13677:dastore         
	// 8505 13678:dup             
	// 8506 13679:iconst_3        
	// 8507 13680:ldc2w           #15  <Double 19.625597299999999D>
	// 8508 13683:dastore         
	// 8509 13684:dup             
	// 8510 13685:iconst_4        
	// 8511 13686:ldc2w           #17  <Double 8.9143979000000009D>
	// 8512 13689:dastore         
	// 8513 13690:dup             
	// 8514 13691:iconst_5        
	// 8515 13692:ldc2w           #2305 <Double -0.69563629999999999D>
	// 8516 13695:dastore         
	// 8517 13696:dup             
	// 8518 13697:bipush          6
	// 8519 13699:ldc2w           #2307 <Double -32.239153399999999D>
	// 8520 13702:dastore         
	// 8521 13703:dup             
	// 8522 13704:bipush          7
	// 8523 13706:ldc2w           #2309 <Double 231.14941049999999D>
	// 8524 13709:dastore         
	// 8525 13710:dup             
	// 8526 13711:bipush          8
	// 8527 13713:ldc2w           #25  <Double -0.38996530000000001D>
	// 8528 13716:dastore         
	// 8529 13717:aastore         
	// 8530 13718:dup             
	// 8531 13719:bipush          60
	// 8532 13721:bipush          9
	// 8533 13723:newarray        double[]
	// 8534 13725:dup             
	// 8535 13726:iconst_0        
	// 8536 13727:ldc2w           #2311 <Double -22.311670700000001D>
	// 8537 13730:dastore         
	// 8538 13731:dup             
	// 8539 13732:iconst_1        
	// 8540 13733:ldc2w           #409 <Double 0.24171519999999999D>
	// 8541 13736:dastore         
	// 8542 13737:dup             
	// 8543 13738:iconst_2        
	// 8544 13739:ldc2w           #2313 <Double 2031.6714153D>
	// 8545 13742:dastore         
	// 8546 13743:dup             
	// 8547 13744:iconst_3        
	// 8548 13745:ldc2w           #31  <Double 28.2628214D>
	// 8549 13748:dastore         
	// 8550 13749:dup             
	// 8551 13750:iconst_4        
	// 8552 13751:ldc2w           #33  <Double 8.8398648000000009D>
	// 8553 13754:dastore         
	// 8554 13755:dup             
	// 8555 13756:iconst_5        
	// 8556 13757:ldc2w           #2315 <Double -0.3956363D>
	// 8557 13760:dastore         
	// 8558 13761:dup             
	// 8559 13762:bipush          6
	// 8560 13764:ldc2w           #2317 <Double -28.455107399999999D>
	// 8561 13767:dastore         
	// 8562 13768:dup             
	// 8563 13769:bipush          7
	// 8564 13771:ldc2w           #2319 <Double 173.83937850000001D>
	// 8565 13774:dastore         
	// 8566 13775:dup             
	// 8567 13776:bipush          8
	// 8568 13778:ldc2w           #41  <Double -0.54830319999999999D>
	// 8569 13781:dastore         
	// 8570 13782:aastore         
	// 8571 13783:dup             
	// 8572 13784:bipush          61
	// 8573 13786:aload           31
	// 8574 13788:aastore         
	// 8575 13789:dup             
	// 8576 13790:bipush          62
	// 8577 13792:bipush          9
	// 8578 13794:newarray        double[]
	// 8579 13796:dup             
	// 8580 13797:iconst_0        
	// 8581 13798:ldc2w           #2321 <Double -21.711670699999999D>
	// 8582 13801:dastore         
	// 8583 13802:dup             
	// 8584 13803:iconst_1        
	// 8585 13804:ldc2w           #409 <Double 0.24171519999999999D>
	// 8586 13807:dastore         
	// 8587 13808:dup             
	// 8588 13809:iconst_2        
	// 8589 13810:ldc2w           #2323 <Double 1979.2211241D>
	// 8590 13813:dastore         
	// 8591 13814:dup             
	// 8592 13815:iconst_3        
	// 8593 13816:ldc2w           #541 <Double 46.896400399999997D>
	// 8594 13819:dastore         
	// 8595 13820:dup             
	// 8596 13821:iconst_4        
	// 8597 13822:ldc2w           #543 <Double 8.5943556999999995D>
	// 8598 13825:dastore         
	// 8599 13826:dup             
	// 8600 13827:iconst_5        
	// 8601 13828:ldc2w           #2325 <Double 0.20436370000000001D>
	// 8602 13831:dastore         
	// 8603 13832:dup             
	// 8604 13833:bipush          6
	// 8605 13835:ldc2w           #2327 <Double -15.698442099999999D>
	// 8606 13838:dastore         
	// 8607 13839:dup             
	// 8608 13840:bipush          7
	// 8609 13842:ldc2w           #2329 <Double -44.961559600000001D>
	// 8610 13845:dastore         
	// 8611 13846:dup             
	// 8612 13847:bipush          8
	// 8613 13849:ldc2w           #551 <Double -0.84519750000000005D>
	// 8614 13852:dastore         
	// 8615 13853:aastore         
	// 8616 13854:dup             
	// 8617 13855:bipush          63
	// 8618 13857:aload           32
	// 8619 13859:aastore         
	// 8620 13860:dup             
	// 8621 13861:bipush          64
	// 8622 13863:bipush          9
	// 8623 13865:newarray        double[]
	// 8624 13867:dup             
	// 8625 13868:iconst_0        
	// 8626 13869:ldc2w           #2331 <Double -21.111670700000001D>
	// 8627 13872:dastore         
	// 8628 13873:dup             
	// 8629 13874:iconst_1        
	// 8630 13875:ldc2w           #409 <Double 0.24171519999999999D>
	// 8631 13878:dastore         
	// 8632 13879:dup             
	// 8633 13880:iconst_2        
	// 8634 13881:ldc2w           #2333 <Double 1926.7708329D>
	// 8635 13884:dastore         
	// 8636 13885:dup             
	// 8637 13886:iconst_3        
	// 8638 13887:ldc2w           #345 <Double 68.407805800000006D>
	// 8639 13890:dastore         
	// 8640 13891:dup             
	// 8641 13892:iconst_4        
	// 8642 13893:ldc2w           #347 <Double 8.1813959000000001D>
	// 8643 13896:dastore         
	// 8644 13897:dup             
	// 8645 13898:iconst_5        
	// 8646 13899:ldc2w           #2335 <Double 0.80436370000000001D>
	// 8647 13902:dastore         
	// 8648 13903:dup             
	// 8649 13904:bipush          6
	// 8650 13906:ldc2w           #2337 <Double 0.41886620000000002D>
	// 8651 13909:dastore         
	// 8652 13910:dup             
	// 8653 13911:bipush          7
	// 8654 13913:ldc2w           #2339 <Double -402.4469651D>
	// 8655 13916:dastore         
	// 8656 13917:dup             
	// 8657 13918:bipush          8
	// 8658 13920:ldc2w           #355 <Double -1.1049982D>
	// 8659 13923:dastore         
	// 8660 13924:aastore         
	// 8661 13925:dup             
	// 8662 13926:bipush          65
	// 8663 13928:bipush          9
	// 8664 13930:newarray        double[]
	// 8665 13932:dup             
	// 8666 13933:iconst_0        
	// 8667 13934:ldc2w           #2341 <Double -20.811670700000001D>
	// 8668 13937:dastore         
	// 8669 13938:dup             
	// 8670 13939:iconst_1        
	// 8671 13940:ldc2w           #409 <Double 0.24171519999999999D>
	// 8672 13943:dastore         
	// 8673 13944:dup             
	// 8674 13945:iconst_2        
	// 8675 13946:ldc2w           #2343 <Double 1900.5456873000001D>
	// 8676 13949:dastore         
	// 8677 13950:dup             
	// 8678 13951:iconst_3        
	// 8679 13952:ldc2w           #79  <Double 80.747736000000003D>
	// 8680 13955:dastore         
	// 8681 13956:dup             
	// 8682 13957:iconst_4        
	// 8683 13958:ldc2w           #81  <Double 7.8897272999999997D>
	// 8684 13961:dastore         
	// 8685 13962:dup             
	// 8686 13963:iconst_5        
	// 8687 13964:ldc2w           #2345 <Double 1.1043636999999999D>
	// 8688 13967:dastore         
	// 8689 13968:dup             
	// 8690 13969:bipush          6
	// 8691 13971:ldc2w           #2347 <Double 8.0958286000000008D>
	// 8692 13974:dastore         
	// 8693 13975:dup             
	// 8694 13976:bipush          7
	// 8695 13978:ldc2w           #2349 <Double -608.17568849999998D>
	// 8696 13981:dastore         
	// 8697 13982:dup             
	// 8698 13983:bipush          8
	// 8699 13985:ldc2w           #89  <Double -1.2173562D>
	// 8700 13988:dastore         
	// 8701 13989:aastore         
	// 8702 13990:dup             
	// 8703 13991:bipush          66
	// 8704 13993:aload           33
	// 8705 13995:aastore         
	// 8706 13996:dup             
	// 8707 13997:bipush          67
	// 8708 13999:bipush          9
	// 8709 14001:newarray        double[]
	// 8710 14003:dup             
	// 8711 14004:iconst_0        
	// 8712 14005:ldc2w           #2351 <Double -20.211670699999999D>
	// 8713 14008:dastore         
	// 8714 14009:dup             
	// 8715 14010:iconst_1        
	// 8716 14011:ldc2w           #409 <Double 0.24171519999999999D>
	// 8717 14014:dastore         
	// 8718 14015:dup             
	// 8719 14016:iconst_2        
	// 8720 14017:ldc2w           #2353 <Double 1848.0953961D>
	// 8721 14020:dastore         
	// 8722 14021:dup             
	// 8723 14022:iconst_3        
	// 8724 14023:ldc2w           #111 <Double 110.00047410000001D>
	// 8725 14026:dastore         
	// 8726 14027:dup             
	// 8727 14028:iconst_4        
	// 8728 14029:ldc2w           #113 <Double 7.0639795000000003D>
	// 8729 14032:dastore         
	// 8730 14033:dup             
	// 8731 14034:iconst_5        
	// 8732 14035:ldc2w           #2355 <Double 1.7043637D>
	// 8733 14038:dastore         
	// 8734 14039:dup             
	// 8735 14040:bipush          6
	// 8736 14042:ldc2w           #2357 <Double 19.578380299999999D>
	// 8737 14045:dastore         
	// 8738 14046:dup             
	// 8739 14047:bipush          7
	// 8740 14049:ldc2w           #2359 <Double -977.2041815D>
	// 8741 14052:dastore         
	// 8742 14053:dup             
	// 8743 14054:bipush          8
	// 8744 14056:ldc2w           #121 <Double -1.4008494D>
	// 8745 14059:dastore         
	// 8746 14060:aastore         
	// 8747 14061:dup             
	// 8748 14062:bipush          68
	// 8749 14064:bipush          9
	// 8750 14066:newarray        double[]
	// 8751 14068:dup             
	// 8752 14069:iconst_0        
	// 8753 14070:ldc2w           #2361 <Double -19.911670699999998D>
	// 8754 14073:dastore         
	// 8755 14074:dup             
	// 8756 14075:iconst_1        
	// 8757 14076:ldc2w           #409 <Double 0.24171519999999999D>
	// 8758 14079:dastore         
	// 8759 14080:dup             
	// 8760 14081:iconst_2        
	// 8761 14082:ldc2w           #2363 <Double 1821.8702505000001D>
	// 8762 14085:dastore         
	// 8763 14086:dup             
	// 8764 14087:iconst_3        
	// 8765 14088:ldc2w           #127 <Double 127.6888198D>
	// 8766 14091:dastore         
	// 8767 14092:dup             
	// 8768 14093:iconst_4        
	// 8769 14094:ldc2w           #129 <Double 6.4866308999999998D>
	// 8770 14097:dastore         
	// 8771 14098:dup             
	// 8772 14099:iconst_5        
	// 8773 14100:ldc2w           #2365 <Double 2.0043636999999999D>
	// 8774 14103:dastore         
	// 8775 14104:dup             
	// 8776 14105:bipush          6
	// 8777 14107:ldc2w           #2367 <Double 22.494906199999999D>
	// 8778 14110:dastore         
	// 8779 14111:dup             
	// 8780 14112:bipush          7
	// 8781 14114:ldc2w           #2369 <Double -1096.5725038D>
	// 8782 14117:dastore         
	// 8783 14118:dup             
	// 8784 14119:bipush          8
	// 8785 14121:ldc2w           #137 <Double -1.4699811D>
	// 8786 14124:dastore         
	// 8787 14125:aastore         
	// 8788 14126:dup             
	// 8789 14127:bipush          69
	// 8790 14129:aload           34
	// 8791 14131:aastore         
	// 8792 14132:dup             
	// 8793 14133:bipush          70
	// 8794 14135:bipush          9
	// 8795 14137:newarray        double[]
	// 8796 14139:dup             
	// 8797 14140:iconst_0        
	// 8798 14141:ldc2w           #2371 <Double -19.311670700000001D>
	// 8799 14144:dastore         
	// 8800 14145:dup             
	// 8801 14146:iconst_1        
	// 8802 14147:ldc2w           #409 <Double 0.24171519999999999D>
	// 8803 14150:dastore         
	// 8804 14151:dup             
	// 8805 14152:iconst_2        
	// 8806 14153:ldc2w           #2373 <Double 1769.4199593999999D>
	// 8807 14156:dastore         
	// 8808 14157:dup             
	// 8809 14158:iconst_3        
	// 8810 14159:ldc2w           #143 <Double 171.99884599999999D>
	// 8811 14162:dastore         
	// 8812 14163:dup             
	// 8813 14164:iconst_4        
	// 8814 14165:ldc2w           #145 <Double 4.8356763999999997D>
	// 8815 14168:dastore         
	// 8816 14169:dup             
	// 8817 14170:iconst_5        
	// 8818 14171:ldc2w           #2375 <Double 2.6043636999999999D>
	// 8819 14174:dastore         
	// 8820 14175:dup             
	// 8821 14176:bipush          6
	// 8822 14178:ldc2w           #2377 <Double 21.854777899999998D>
	// 8823 14181:dastore         
	// 8824 14182:dup             
	// 8825 14183:bipush          7
	// 8826 14185:ldc2w           #2379 <Double -1118.0519594D>
	// 8827 14188:dastore         
	// 8828 14189:dup             
	// 8829 14190:bipush          8
	// 8830 14192:ldc2w           #153 <Double -1.5592649999999999D>
	// 8831 14195:dastore         
	// 8832 14196:aastore         
	// 8833 14197:dup             
	// 8834 14198:bipush          71
	// 8835 14200:aload           35
	// 8836 14202:aastore         
	// 8837 14203:dup             
	// 8838 14204:bipush          72
	// 8839 14206:aload           36
	// 8840 14208:aastore         
	// 8841 14209:dup             
	// 8842 14210:bipush          73
	// 8843 14212:bipush          9
	// 8844 14214:newarray        double[]
	// 8845 14216:dup             
	// 8846 14217:iconst_0        
	// 8847 14218:ldc2w           #2381 <Double -18.411670699999998D>
	// 8848 14221:dastore         
	// 8849 14222:dup             
	// 8850 14223:iconst_1        
	// 8851 14224:ldc2w           #409 <Double 0.24171519999999999D>
	// 8852 14227:dastore         
	// 8853 14228:dup             
	// 8854 14229:iconst_2        
	// 8855 14230:ldc2w           #2383 <Double 1690.7445226D>
	// 8856 14233:dastore         
	// 8857 14234:dup             
	// 8858 14235:iconst_3        
	// 8859 14236:ldc2w           #175 <Double 275.7268449D>
	// 8860 14239:dastore         
	// 8861 14240:dup             
	// 8862 14241:iconst_4        
	// 8863 14242:ldc2w           #177 <Double 0.1651599D>
	// 8864 14245:dastore         
	// 8865 14246:dup             
	// 8866 14247:iconst_5        
	// 8867 14248:ldc2w           #2385 <Double 3.5043636999999999D>
	// 8868 14251:dastore         
	// 8869 14252:dup             
	// 8870 14253:bipush          6
	// 8871 14255:ldc2w           #2387 <Double 8.3392757999999994D>
	// 8872 14258:dastore         
	// 8873 14259:dup             
	// 8874 14260:bipush          7
	// 8875 14262:ldc2w           #2389 <Double -580.99985340000001D>
	// 8876 14265:dastore         
	// 8877 14266:dup             
	// 8878 14267:bipush          8
	// 8879 14269:ldc2w           #185 <Double -1.5649227999999999D>
	// 8880 14272:dastore         
	// 8881 14273:aastore         
	// 8882 14274:dup             
	// 8883 14275:bipush          74
	// 8884 14277:bipush          9
	// 8885 14279:newarray        double[]
	// 8886 14281:dup             
	// 8887 14282:iconst_0        
	// 8888 14283:ldc2w           #2391 <Double -18.111670700000001D>
	// 8889 14286:dastore         
	// 8890 14287:dup             
	// 8891 14288:iconst_1        
	// 8892 14289:ldc2w           #409 <Double 0.24171519999999999D>
	// 8893 14292:dastore         
	// 8894 14293:dup             
	// 8895 14294:iconst_2        
	// 8896 14295:ldc2w           #2393 <Double 1664.5193770000001D>
	// 8897 14298:dastore         
	// 8898 14299:dup             
	// 8899 14300:iconst_3        
	// 8900 14301:ldc2w           #291 <Double 327.13300479999998D>
	// 8901 14304:dastore         
	// 8902 14305:dup             
	// 8903 14306:iconst_4        
	// 8904 14307:ldc2w           #293 <Double -2.4385346000000001D>
	// 8905 14310:dastore         
	// 8906 14311:dup             
	// 8907 14312:iconst_5        
	// 8908 14313:ldc2w           #2395 <Double 3.8043637000000001D>
	// 8909 14316:dastore         
	// 8910 14317:dup             
	// 8911 14318:bipush          6
	// 8912 14320:ldc2w           #2397 <Double 2.5808043000000001D>
	// 8913 14323:dastore         
	// 8914 14324:dup             
	// 8915 14325:bipush          7
	// 8916 14327:ldc2w           #2399 <Double -313.94245419999999D>
	// 8917 14330:dastore         
	// 8918 14331:dup             
	// 8919 14332:bipush          8
	// 8920 14334:ldc2w           #301 <Double -1.5323681D>
	// 8921 14337:dastore         
	// 8922 14338:aastore         
	// 8923 14339:dup             
	// 8924 14340:bipush          75
	// 8925 14342:aload           37
	// 8926 14344:aastore         
	// 8927 14345:dup             
	// 8928 14346:bipush          76
	// 8929 14348:aload           38
	// 8930 14350:aastore         
	// 8931 14351:dup             
	// 8932 14352:bipush          77
	// 8933 14354:aload           39
	// 8934 14356:aastore         
	// 8935 14357:dup             
	// 8936 14358:bipush          78
	// 8937 14360:bipush          9
	// 8938 14362:newarray        double[]
	// 8939 14364:dup             
	// 8940 14365:iconst_0        
	// 8941 14366:ldc2w           #2401 <Double -17.157792799999999D>
	// 8942 14369:dastore         
	// 8943 14370:dup             
	// 8944 14371:iconst_1        
	// 8945 14372:ldc2w           #507 <Double 0.71361470000000005D>
	// 8946 14375:dastore         
	// 8947 14376:dup             
	// 8948 14377:iconst_2        
	// 8949 14378:ldc2w           #2403 <Double 1601.2454585D>
	// 8950 14381:dastore         
	// 8951 14382:dup             
	// 8952 14383:iconst_3        
	// 8953 14384:ldc2w           #15  <Double 19.625597299999999D>
	// 8954 14387:dastore         
	// 8955 14388:dup             
	// 8956 14389:iconst_4        
	// 8957 14390:ldc2w           #17  <Double 8.9143979000000009D>
	// 8958 14393:dastore         
	// 8959 14394:dup             
	// 8960 14395:iconst_5        
	// 8961 14396:ldc2w           #2405 <Double -0.69709739999999998D>
	// 8962 14399:dastore         
	// 8963 14400:dup             
	// 8964 14401:bipush          6
	// 8965 14403:ldc2w           #2407 <Double -31.9391909D>
	// 8966 14406:dastore         
	// 8967 14407:dup             
	// 8968 14408:bipush          7
	// 8969 14410:ldc2w           #2409 <Double 228.79600970000001D>
	// 8970 14413:dastore         
	// 8971 14414:dup             
	// 8972 14415:bipush          8
	// 8973 14417:ldc2w           #25  <Double -0.38996530000000001D>
	// 8974 14420:dastore         
	// 8975 14421:aastore         
	// 8976 14422:dup             
	// 8977 14423:bipush          79
	// 8978 14425:aload           40
	// 8979 14427:aastore         
	// 8980 14428:dup             
	// 8981 14429:bipush          80
	// 8982 14431:bipush          9
	// 8983 14433:newarray        double[]
	// 8984 14435:dup             
	// 8985 14436:iconst_0        
	// 8986 14437:ldc2w           #2411 <Double -16.557792800000001D>
	// 8987 14440:dastore         
	// 8988 14441:dup             
	// 8989 14442:iconst_1        
	// 8990 14443:ldc2w           #507 <Double 0.71361470000000005D>
	// 8991 14446:dastore         
	// 8992 14447:dup             
	// 8993 14448:iconst_2        
	// 8994 14449:ldc2w           #2413 <Double 1545.9637703000001D>
	// 8995 14452:dastore         
	// 8996 14453:dup             
	// 8997 14454:iconst_3        
	// 8998 14455:ldc2w           #47  <Double 37.305238799999998D>
	// 8999 14458:dastore         
	// 9000 14459:dup             
	// 9001 14460:iconst_4        
	// 9002 14461:ldc2w           #49  <Double 8.7346948999999992D>
	// 9003 14464:dastore         
	// 9004 14465:dup             
	// 9005 14466:iconst_5        
	// 9006 14467:ldc2w           #2415 <Double -0.0970974D>
	// 9007 14470:dastore         
	// 9008 14471:dup             
	// 9009 14472:bipush          6
	// 9010 14474:ldc2w           #2417 <Double -22.496079699999999D>
	// 9011 14477:dastore         
	// 9012 14478:dup             
	// 9013 14479:bipush          7
	// 9014 14481:ldc2w           #2419 <Double 79.265363300000004D>
	// 9015 14484:dastore         
	// 9016 14485:dup             
	// 9017 14486:bipush          8
	// 9018 14488:ldc2w           #57  <Double -0.70060560000000005D>
	// 9019 14491:dastore         
	// 9020 14492:aastore         
	// 9021 14493:dup             
	// 9022 14494:bipush          81
	// 9023 14496:aload           41
	// 9024 14498:aastore         
	// 9025 14499:dup             
	// 9026 14500:bipush          82
	// 9027 14502:bipush          9
	// 9028 14504:newarray        double[]
	// 9029 14506:dup             
	// 9030 14507:iconst_0        
	// 9031 14508:ldc2w           #2421 <Double -15.9577928D>
	// 9032 14511:dastore         
	// 9033 14512:dup             
	// 9034 14513:iconst_1        
	// 9035 14514:ldc2w           #507 <Double 0.71361470000000005D>
	// 9036 14517:dastore         
	// 9037 14518:dup             
	// 9038 14519:iconst_2        
	// 9039 14520:ldc2w           #2423 <Double 1490.6820822D>
	// 9040 14523:dastore         
	// 9041 14524:dup             
	// 9042 14525:iconst_3        
	// 9043 14526:ldc2w           #63  <Double 57.2001287D>
	// 9044 14529:dastore         
	// 9045 14530:dup             
	// 9046 14531:iconst_4        
	// 9047 14532:ldc2w           #65  <Double 8.4126647000000006D>
	// 9048 14535:dastore         
	// 9049 14536:dup             
	// 9050 14537:iconst_5        
	// 9051 14538:ldc2w           #2425 <Double 0.50290259999999998D>
	// 9052 14541:dastore         
	// 9053 14542:dup             
	// 9054 14543:bipush          6
	// 9055 14545:ldc2w           #2427 <Double -7.4396427999999997D>
	// 9056 14548:dastore         
	// 9057 14549:dup             
	// 9058 14550:bipush          7
	// 9059 14552:ldc2w           #2429 <Double -215.6976483D>
	// 9060 14555:dastore         
	// 9061 14556:dup             
	// 9062 14557:bipush          8
	// 9063 14559:ldc2w           #73  <Double -0.98049019999999998D>
	// 9064 14562:dastore         
	// 9065 14563:aastore         
	// 9066 14564:dup             
	// 9067 14565:bipush          83
	// 9068 14567:bipush          9
	// 9069 14569:newarray        double[]
	// 9070 14571:dup             
	// 9071 14572:iconst_0        
	// 9072 14573:ldc2w           #2431 <Double -15.657792799999999D>
	// 9073 14576:dastore         
	// 9074 14577:dup             
	// 9075 14578:iconst_1        
	// 9076 14579:ldc2w           #507 <Double 0.71361470000000005D>
	// 9077 14582:dastore         
	// 9078 14583:dup             
	// 9079 14584:iconst_2        
	// 9080 14585:ldc2w           #2433 <Double 1463.0412381000001D>
	// 9081 14588:dastore         
	// 9082 14589:dup             
	// 9083 14590:iconst_3        
	// 9084 14591:ldc2w           #345 <Double 68.407805800000006D>
	// 9085 14594:dastore         
	// 9086 14595:dup             
	// 9087 14596:iconst_4        
	// 9088 14597:ldc2w           #347 <Double 8.1813959000000001D>
	// 9089 14600:dastore         
	// 9090 14601:dup             
	// 9091 14602:iconst_5        
	// 9092 14603:ldc2w           #2435 <Double 0.80290260000000002D>
	// 9093 14606:dastore         
	// 9094 14607:dup             
	// 9095 14608:bipush          6
	// 9096 14610:ldc2w           #2437 <Double 0.71882869999999999D>
	// 9097 14613:dastore         
	// 9098 14614:dup             
	// 9099 14615:bipush          7
	// 9100 14617:ldc2w           #2439 <Double -409.29980319999999D>
	// 9101 14620:dastore         
	// 9102 14621:dup             
	// 9103 14622:bipush          8
	// 9104 14624:ldc2w           #355 <Double -1.1049982D>
	// 9105 14627:dastore         
	// 9106 14628:aastore         
	// 9107 14629:dup             
	// 9108 14630:bipush          84
	// 9109 14632:aload           42
	// 9110 14634:aastore         
	// 9111 14635:dup             
	// 9112 14636:bipush          85
	// 9113 14638:bipush          9
	// 9114 14640:newarray        double[]
	// 9115 14642:dup             
	// 9116 14643:iconst_0        
	// 9117 14644:ldc2w           #2441 <Double -15.0577928D>
	// 9118 14647:dastore         
	// 9119 14648:dup             
	// 9120 14649:iconst_1        
	// 9121 14650:ldc2w           #507 <Double 0.71361470000000005D>
	// 9122 14653:dastore         
	// 9123 14654:dup             
	// 9124 14655:iconst_2        
	// 9125 14656:ldc2w           #2443 <Double 1407.7595498999999D>
	// 9126 14659:dastore         
	// 9127 14660:dup             
	// 9128 14661:iconst_3        
	// 9129 14662:ldc2w           #95  <Double 94.497482399999996D>
	// 9130 14665:dastore         
	// 9131 14666:dup             
	// 9132 14667:iconst_4        
	// 9133 14668:ldc2w           #97  <Double 7.5234689000000001D>
	// 9134 14671:dastore         
	// 9135 14672:dup             
	// 9136 14673:iconst_5        
	// 9137 14674:ldc2w           #2445 <Double 1.4029026D>
	// 9138 14677:dastore         
	// 9139 14678:dup             
	// 9140 14679:bipush          6
	// 9141 14681:ldc2w           #2447 <Double 14.9572343D>
	// 9142 14684:dastore         
	// 9143 14685:dup             
	// 9144 14686:bipush          7
	// 9145 14688:ldc2w           #2449 <Double -815.82261870000002D>
	// 9146 14691:dastore         
	// 9147 14692:dup             
	// 9148 14693:bipush          8
	// 9149 14695:ldc2w           #105 <Double -1.3163339000000001D>
	// 9150 14698:dastore         
	// 9151 14699:aastore         
	// 9152 14700:dup             
	// 9153 14701:bipush          86
	// 9154 14703:bipush          9
	// 9155 14705:newarray        double[]
	// 9156 14707:dup             
	// 9157 14708:iconst_0        
	// 9158 14709:ldc2w           #2451 <Double -14.757792800000001D>
	// 9159 14712:dastore         
	// 9160 14713:dup             
	// 9161 14714:iconst_1        
	// 9162 14715:ldc2w           #507 <Double 0.71361470000000005D>
	// 9163 14718:dastore         
	// 9164 14719:dup             
	// 9165 14720:iconst_2        
	// 9166 14721:ldc2w           #2453 <Double 1380.1187058999999D>
	// 9167 14724:dastore         
	// 9168 14725:dup             
	// 9169 14726:iconst_3        
	// 9170 14727:ldc2w           #111 <Double 110.00047410000001D>
	// 9171 14730:dastore         
	// 9172 14731:dup             
	// 9173 14732:iconst_4        
	// 9174 14733:ldc2w           #113 <Double 7.0639795000000003D>
	// 9175 14736:dastore         
	// 9176 14737:dup             
	// 9177 14738:iconst_5        
	// 9178 14739:ldc2w           #2455 <Double 1.7029026D>
	// 9179 14742:dastore         
	// 9180 14743:dup             
	// 9181 14744:bipush          6
	// 9182 14746:ldc2w           #2457 <Double 19.878342799999999D>
	// 9183 14749:dastore         
	// 9184 14750:dup             
	// 9185 14751:bipush          7
	// 9186 14753:ldc2w           #2459 <Double -986.75668189999999D>
	// 9187 14756:dastore         
	// 9188 14757:dup             
	// 9189 14758:bipush          8
	// 9190 14760:ldc2w           #121 <Double -1.4008494D>
	// 9191 14763:dastore         
	// 9192 14764:aastore         
	// 9193 14765:dup             
	// 9194 14766:bipush          87
	// 9195 14768:bipush          9
	// 9196 14770:newarray        double[]
	// 9197 14772:dup             
	// 9198 14773:iconst_0        
	// 9199 14774:ldc2w           #2461 <Double -14.4577928D>
	// 9200 14777:dastore         
	// 9201 14778:dup             
	// 9202 14779:iconst_1        
	// 9203 14780:ldc2w           #507 <Double 0.71361470000000005D>
	// 9204 14783:dastore         
	// 9205 14784:dup             
	// 9206 14785:iconst_2        
	// 9207 14786:ldc2w           #2463 <Double 1352.4778618D>
	// 9208 14789:dastore         
	// 9209 14790:dup             
	// 9210 14791:iconst_3        
	// 9211 14792:ldc2w           #127 <Double 127.6888198D>
	// 9212 14795:dastore         
	// 9213 14796:dup             
	// 9214 14797:iconst_4        
	// 9215 14798:ldc2w           #129 <Double 6.4866308999999998D>
	// 9216 14801:dastore         
	// 9217 14802:dup             
	// 9218 14803:iconst_5        
	// 9219 14804:ldc2w           #2465 <Double 2.0029026000000001D>
	// 9220 14807:dastore         
	// 9221 14808:dup             
	// 9222 14809:bipush          6
	// 9223 14811:ldc2w           #2467 <Double 22.794868699999999D>
	// 9224 14814:dastore         
	// 9225 14815:dup             
	// 9226 14816:bipush          7
	// 9227 14818:ldc2w           #2469 <Double -1107.0248916D>
	// 9228 14821:dastore         
	// 9229 14822:dup             
	// 9230 14823:bipush          8
	// 9231 14825:ldc2w           #137 <Double -1.4699811D>
	// 9232 14828:dastore         
	// 9233 14829:aastore         
	// 9234 14830:dup             
	// 9235 14831:bipush          88
	// 9236 14833:aload           43
	// 9237 14835:aastore         
	// 9238 14836:dup             
	// 9239 14837:bipush          89
	// 9240 14839:bipush          9
	// 9241 14841:newarray        double[]
	// 9242 14843:dup             
	// 9243 14844:iconst_0        
	// 9244 14845:ldc2w           #2471 <Double -13.8577928D>
	// 9245 14848:dastore         
	// 9246 14849:dup             
	// 9247 14850:iconst_1        
	// 9248 14851:ldc2w           #507 <Double 0.71361470000000005D>
	// 9249 14854:dastore         
	// 9250 14855:dup             
	// 9251 14856:iconst_2        
	// 9252 14857:ldc2w           #2473 <Double 1297.1961736000001D>
	// 9253 14860:dastore         
	// 9254 14861:dup             
	// 9255 14862:iconst_3        
	// 9256 14863:ldc2w           #143 <Double 171.99884599999999D>
	// 9257 14866:dastore         
	// 9258 14867:dup             
	// 9259 14868:iconst_4        
	// 9260 14869:ldc2w           #145 <Double 4.8356763999999997D>
	// 9261 14872:dastore         
	// 9262 14873:dup             
	// 9263 14874:iconst_5        
	// 9264 14875:ldc2w           #2475 <Double 2.6029026000000002D>
	// 9265 14878:dastore         
	// 9266 14879:dup             
	// 9267 14880:bipush          6
	// 9268 14882:ldc2w           #2477 <Double 22.154740400000001D>
	// 9269 14885:dastore         
	// 9270 14886:dup             
	// 9271 14887:bipush          7
	// 9272 14889:ldc2w           #2479 <Double -1130.3041221999999D>
	// 9273 14892:dastore         
	// 9274 14893:dup             
	// 9275 14894:bipush          8
	// 9276 14896:ldc2w           #153 <Double -1.5592649999999999D>
	// 9277 14899:dastore         
	// 9278 14900:aastore         
	// 9279 14901:dup             
	// 9280 14902:bipush          90
	// 9281 14904:bipush          9
	// 9282 14906:newarray        double[]
	// 9283 14908:dup             
	// 9284 14909:iconst_0        
	// 9285 14910:ldc2w           #2481 <Double -13.5577928D>
	// 9286 14913:dastore         
	// 9287 14914:dup             
	// 9288 14915:iconst_1        
	// 9289 14916:ldc2w           #507 <Double 0.71361470000000005D>
	// 9290 14919:dastore         
	// 9291 14920:dup             
	// 9292 14921:iconst_2        
	// 9293 14922:ldc2w           #2483 <Double 1269.5553295D>
	// 9294 14925:dastore         
	// 9295 14926:dup             
	// 9296 14927:iconst_3        
	// 9297 14928:ldc2w           #265 <Double 200.29154579999999D>
	// 9298 14931:dastore         
	// 9299 14932:dup             
	// 9300 14933:iconst_4        
	// 9301 14934:ldc2w           #267 <Double 3.6574485999999999D>
	// 9302 14937:dastore         
	// 9303 14938:dup             
	// 9304 14939:iconst_5        
	// 9305 14940:ldc2w           #2485 <Double 2.9029026D>
	// 9306 14943:dastore         
	// 9307 14944:dup             
	// 9308 14945:bipush          6
	// 9309 14947:ldc2w           #2487 <Double 18.895675199999999D>
	// 9310 14950:dastore         
	// 9311 14951:dup             
	// 9312 14952:bipush          7
	// 9313 14954:ldc2w           #2489 <Double -1019.8102246D>
	// 9314 14957:dastore         
	// 9315 14958:dup             
	// 9316 14959:bipush          8
	// 9317 14961:ldc2w           #275 <Double -1.5784544D>
	// 9318 14964:dastore         
	// 9319 14965:aastore         
	// 9320 14966:dup             
	// 9321 14967:bipush          91
	// 9322 14969:aload           44
	// 9323 14971:aastore         
	// 9324 14972:dup             
	// 9325 14973:bipush          92
	// 9326 14975:bipush          9
	// 9327 14977:newarray        double[]
	// 9328 14979:dup             
	// 9329 14980:iconst_0        
	// 9330 14981:ldc2w           #2491 <Double -12.9577928D>
	// 9331 14984:dastore         
	// 9332 14985:dup             
	// 9333 14986:iconst_1        
	// 9334 14987:ldc2w           #507 <Double 0.71361470000000005D>
	// 9335 14990:dastore         
	// 9336 14991:dup             
	// 9337 14992:iconst_2        
	// 9338 14993:ldc2w           #2493 <Double 1214.2736414000001D>
	// 9339 14996:dastore         
	// 9340 14997:dup             
	// 9341 14998:iconst_3        
	// 9342 14999:ldc2w           #175 <Double 275.7268449D>
	// 9343 15002:dastore         
	// 9344 15003:dup             
	// 9345 15004:iconst_4        
	// 9346 15005:ldc2w           #177 <Double 0.1651599D>
	// 9347 15008:dastore         
	// 9348 15009:dup             
	// 9349 15010:iconst_5        
	// 9350 15011:ldc2w           #2495 <Double 3.5029026000000001D>
	// 9351 15014:dastore         
	// 9352 15015:dup             
	// 9353 15016:bipush          6
	// 9354 15018:ldc2w           #2497 <Double 8.6392383000000006D>
	// 9355 15021:dastore         
	// 9356 15022:dup             
	// 9357 15023:bipush          7
	// 9358 15025:ldc2w           #2499 <Double -595.95167849999996D>
	// 9359 15028:dastore         
	// 9360 15029:dup             
	// 9361 15030:bipush          8
	// 9362 15032:ldc2w           #185 <Double -1.5649227999999999D>
	// 9363 15035:dastore         
	// 9364 15036:aastore         
	// 9365 15037:dup             
	// 9366 15038:bipush          93
	// 9367 15040:bipush          9
	// 9368 15042:newarray        double[]
	// 9369 15044:dup             
	// 9370 15045:iconst_0        
	// 9371 15046:ldc2w           #2501 <Double -12.657792799999999D>
	// 9372 15049:dastore         
	// 9373 15050:dup             
	// 9374 15051:iconst_1        
	// 9375 15052:ldc2w           #507 <Double 0.71361470000000005D>
	// 9376 15055:dastore         
	// 9377 15056:dup             
	// 9378 15057:iconst_2        
	// 9379 15058:ldc2w           #2503 <Double 1186.6327973D>
	// 9380 15061:dastore         
	// 9381 15062:dup             
	// 9382 15063:iconst_3        
	// 9383 15064:ldc2w           #291 <Double 327.13300479999998D>
	// 9384 15067:dastore         
	// 9385 15068:dup             
	// 9386 15069:iconst_4        
	// 9387 15070:ldc2w           #293 <Double -2.4385346000000001D>
	// 9388 15073:dastore         
	// 9389 15074:dup             
	// 9390 15075:iconst_5        
	// 9391 15076:ldc2w           #2505 <Double 3.8029025999999999D>
	// 9392 15079:dastore         
	// 9393 15080:dup             
	// 9394 15081:bipush          6
	// 9395 15083:ldc2w           #2507 <Double 2.8807668D>
	// 9396 15086:dastore         
	// 9397 15087:dup             
	// 9398 15088:bipush          7
	// 9399 15090:ldc2w           #2509 <Double -329.79416670000001D>
	// 9400 15093:dastore         
	// 9401 15094:dup             
	// 9402 15095:bipush          8
	// 9403 15097:ldc2w           #301 <Double -1.5323681D>
	// 9404 15100:dastore         
	// 9405 15101:aastore         
	// 9406 15102:dup             
	// 9407 15103:bipush          94
	// 9408 15105:bipush          9
	// 9409 15107:newarray        double[]
	// 9410 15109:dup             
	// 9411 15110:iconst_0        
	// 9412 15111:ldc2w           #2511 <Double -12.3577928D>
	// 9413 15114:dastore         
	// 9414 15115:dup             
	// 9415 15116:iconst_1        
	// 9416 15117:ldc2w           #507 <Double 0.71361470000000005D>
	// 9417 15120:dastore         
	// 9418 15121:dup             
	// 9419 15122:iconst_2        
	// 9420 15123:ldc2w           #2513 <Double 1158.9919531999999D>
	// 9421 15126:dastore         
	// 9422 15127:dup             
	// 9423 15128:iconst_3        
	// 9424 15129:ldc2w           #191 <Double 392.10647540000002D>
	// 9425 15132:dastore         
	// 9426 15133:dup             
	// 9427 15134:iconst_4        
	// 9428 15135:ldc2w           #193 <Double -5.9244687000000003D>
	// 9429 15138:dastore         
	// 9430 15139:dup             
	// 9431 15140:iconst_5        
	// 9432 15141:ldc2w           #2515 <Double 4.1029026000000002D>
	// 9433 15144:dastore         
	// 9434 15145:dup             
	// 9435 15146:bipush          6
	// 9436 15148:ldc2w           #2517 <Double -2.3961956D>
	// 9437 15151:dastore         
	// 9438 15152:dup             
	// 9439 15153:bipush          7
	// 9440 15155:ldc2w           #2519 <Double -72.255469599999998D>
	// 9441 15158:dastore         
	// 9442 15159:dup             
	// 9443 15160:bipush          8
	// 9444 15162:ldc2w           #201 <Double -1.4830451D>
	// 9445 15165:dastore         
	// 9446 15166:aastore         
	// 9447 15167:dup             
	// 9448 15168:bipush          95
	// 9449 15170:bipush          9
	// 9450 15172:newarray        double[]
	// 9451 15174:dup             
	// 9452 15175:iconst_0        
	// 9453 15176:ldc2w           #2521 <Double -11.190950600000001D>
	// 9454 15179:dastore         
	// 9455 15180:dup             
	// 9456 15181:iconst_1        
	// 9457 15182:ldc2w           #585 <Double 1.1180895D>
	// 9458 15185:dastore         
	// 9459 15186:dup             
	// 9460 15187:iconst_2        
	// 9461 15188:ldc2w           #2523 <Double 1090.8163443999999D>
	// 9462 15191:dastore         
	// 9463 15192:dup             
	// 9464 15193:iconst_3        
	// 9465 15194:ldc2w           #209 <Double 3.0597946D>
	// 9466 15197:dastore         
	// 9467 15198:dup             
	// 9468 15199:iconst_4        
	// 9469 15200:ldc2w           #211 <Double 8.9830009000000004D>
	// 9470 15203:dastore         
	// 9471 15204:dup             
	// 9472 15205:iconst_5        
	// 9473 15206:ldc2w           #2525 <Double -1.2989211000000001D>
	// 9474 15209:dastore         
	// 9475 15210:dup             
	// 9476 15211:bipush          6
	// 9477 15213:ldc2w           #2527 <Double -32.778801700000002D>
	// 9478 15216:dastore         
	// 9479 15217:dup             
	// 9480 15218:bipush          7
	// 9481 15220:ldc2w           #2529 <Double 287.4089209D>
	// 9482 15223:dastore         
	// 9483 15224:dup             
	// 9484 15225:bipush          8
	// 9485 15227:ldc2w           #219 <Double -0.062199999999999998D>
	// 9486 15230:dastore         
	// 9487 15231:aastore         
	// 9488 15232:dup             
	// 9489 15233:bipush          96
	// 9490 15235:bipush          9
	// 9491 15237:newarray        double[]
	// 9492 15239:dup             
	// 9493 15240:iconst_0        
	// 9494 15241:ldc2w           #2531 <Double -10.8909506D>
	// 9495 15244:dastore         
	// 9496 15245:dup             
	// 9497 15246:iconst_1        
	// 9498 15247:ldc2w           #585 <Double 1.1180895D>
	// 9499 15250:dastore         
	// 9500 15251:dup             
	// 9501 15252:iconst_2        
	// 9502 15253:ldc2w           #2533 <Double 1061.9620758999999D>
	// 9503 15256:dastore         
	// 9504 15257:dup             
	// 9505 15258:iconst_3        
	// 9506 15259:ldc2w           #319 <Double 11.2644424D>
	// 9507 15262:dastore         
	// 9508 15263:dup             
	// 9509 15264:iconst_4        
	// 9510 15265:ldc2w           #321 <Double 8.9614528999999994D>
	// 9511 15268:dastore         
	// 9512 15269:dup             
	// 9513 15270:iconst_5        
	// 9514 15271:ldc2w           #2535 <Double -0.99892110000000001D>
	// 9515 15274:dastore         
	// 9516 15275:dup             
	// 9517 15276:bipush          6
	// 9518 15278:ldc2w           #2537 <Double -33.295327499999999D>
	// 9519 15281:dastore         
	// 9520 15282:dup             
	// 9521 15283:bipush          7
	// 9522 15285:ldc2w           #2539 <Double 262.28273089999999D>
	// 9523 15288:dastore         
	// 9524 15289:dup             
	// 9525 15290:bipush          8
	// 9526 15292:ldc2w           #329 <Double -0.22733419999999999D>
	// 9527 15295:dastore         
	// 9528 15296:aastore         
	// 9529 15297:dup             
	// 9530 15298:bipush          97
	// 9531 15300:bipush          9
	// 9532 15302:newarray        double[]
	// 9533 15304:dup             
	// 9534 15305:iconst_0        
	// 9535 15306:ldc2w           #2541 <Double -10.590950599999999D>
	// 9536 15309:dastore         
	// 9537 15310:dup             
	// 9538 15311:iconst_1        
	// 9539 15312:ldc2w           #585 <Double 1.1180895D>
	// 9540 15315:dastore         
	// 9541 15316:dup             
	// 9542 15317:iconst_2        
	// 9543 15318:ldc2w           #2543 <Double 1033.1078075D>
	// 9544 15321:dastore         
	// 9545 15322:dup             
	// 9546 15323:iconst_3        
	// 9547 15324:ldc2w           #15  <Double 19.625597299999999D>
	// 9548 15327:dastore         
	// 9549 15328:dup             
	// 9550 15329:iconst_4        
	// 9551 15330:ldc2w           #17  <Double 8.9143979000000009D>
	// 9552 15333:dastore         
	// 9553 15334:dup             
	// 9554 15335:iconst_5        
	// 9555 15336:ldc2w           #2545 <Double -0.69892109999999996D>
	// 9556 15339:dastore         
	// 9557 15340:dup             
	// 9558 15341:bipush          6
	// 9559 15343:ldc2w           #2547 <Double -31.639245200000001D>
	// 9560 15346:dastore         
	// 9561 15347:dup             
	// 9562 15348:bipush          7
	// 9563 15350:ldc2w           #2549 <Double 226.47832009999999D>
	// 9564 15353:dastore         
	// 9565 15354:dup             
	// 9566 15355:bipush          8
	// 9567 15357:ldc2w           #25  <Double -0.38996530000000001D>
	// 9568 15360:dastore         
	// 9569 15361:aastore         
	// 9570 15362:dup             
	// 9571 15363:bipush          98
	// 9572 15365:bipush          9
	// 9573 15367:newarray        double[]
	// 9574 15369:dup             
	// 9575 15370:iconst_0        
	// 9576 15371:ldc2w           #2551 <Double -10.2909506D>
	// 9577 15374:dastore         
	// 9578 15375:dup             
	// 9579 15376:iconst_1        
	// 9580 15377:ldc2w           #585 <Double 1.1180895D>
	// 9581 15380:dastore         
	// 9582 15381:dup             
	// 9583 15382:iconst_2        
	// 9584 15383:ldc2w           #2553 <Double 1004.253539D>
	// 9585 15386:dastore         
	// 9586 15387:dup             
	// 9587 15388:iconst_3        
	// 9588 15389:ldc2w           #31  <Double 28.2628214D>
	// 9589 15392:dastore         
	// 9590 15393:dup             
	// 9591 15394:iconst_4        
	// 9592 15395:ldc2w           #33  <Double 8.8398648000000009D>
	// 9593 15398:dastore         
	// 9594 15399:dup             
	// 9595 15400:iconst_5        
	// 9596 15401:ldc2w           #2555 <Double -0.39892109999999997D>
	// 9597 15404:dastore         
	// 9598 15405:dup             
	// 9599 15406:bipush          6
	// 9600 15408:ldc2w           #2557 <Double -27.855199200000001D>
	// 9601 15411:dastore         
	// 9602 15412:dup             
	// 9603 15413:bipush          7
	// 9604 15415:ldc2w           #2559 <Double 167.36856349999999D>
	// 9605 15418:dastore         
	// 9606 15419:dup             
	// 9607 15420:bipush          8
	// 9608 15422:ldc2w           #41  <Double -0.54830319999999999D>
	// 9609 15425:dastore         
	// 9610 15426:aastore         
	// 9611 15427:dup             
	// 9612 15428:bipush          99
	// 9613 15430:aload           45
	// 9614 15432:aastore         
	// 9615 15433:dup             
	// 9616 15434:bipush          100
	// 9617 15436:aload           46
	// 9618 15438:aastore         
	// 9619 15439:dup             
	// 9620 15440:bipush          101
	// 9621 15442:aload           47
	// 9622 15444:aastore         
	// 9623 15445:dup             
	// 9624 15446:bipush          102
	// 9625 15448:bipush          9
	// 9626 15450:newarray        double[]
	// 9627 15452:dup             
	// 9628 15453:iconst_0        
	// 9629 15454:ldc2w           #2561 <Double -9.0909505999999993D>
	// 9630 15457:dastore         
	// 9631 15458:dup             
	// 9632 15459:iconst_1        
	// 9633 15460:ldc2w           #585 <Double 1.1180895D>
	// 9634 15463:dastore         
	// 9635 15464:dup             
	// 9636 15465:iconst_2        
	// 9637 15466:ldc2w           #2563 <Double 888.83646510000005D>
	// 9638 15469:dastore         
	// 9639 15470:dup             
	// 9640 15471:iconst_3        
	// 9641 15472:ldc2w           #345 <Double 68.407805800000006D>
	// 9642 15475:dastore         
	// 9643 15476:dup             
	// 9644 15477:iconst_4        
	// 9645 15478:ldc2w           #347 <Double 8.1813959000000001D>
	// 9646 15481:dastore         
	// 9647 15482:dup             
	// 9648 15483:iconst_5        
	// 9649 15484:ldc2w           #2565 <Double 0.80107890000000004D>
	// 9650 15487:dastore         
	// 9651 15488:dup             
	// 9652 15489:bipush          6
	// 9653 15491:ldc2w           #2567 <Double 1.0187744000000001D>
	// 9654 15494:dastore         
	// 9655 15495:dup             
	// 9656 15496:bipush          7
	// 9657 15498:ldc2w           #2569 <Double -416.11667829999999D>
	// 9658 15501:dastore         
	// 9659 15502:dup             
	// 9660 15503:bipush          8
	// 9661 15505:ldc2w           #355 <Double -1.1049982D>
	// 9662 15508:dastore         
	// 9663 15509:aastore         
	// 9664 15510:dup             
	// 9665 15511:bipush          103
	// 9666 15513:aload           48
	// 9667 15515:aastore         
	// 9668 15516:dup             
	// 9669 15517:bipush          104
	// 9670 15519:aload           49
	// 9671 15521:aastore         
	// 9672 15522:dup             
	// 9673 15523:bipush          105
	// 9674 15525:bipush          9
	// 9675 15527:newarray        double[]
	// 9676 15529:dup             
	// 9677 15530:iconst_0        
	// 9678 15531:ldc2w           #2571 <Double -8.1909506000000007D>
	// 9679 15534:dastore         
	// 9680 15535:dup             
	// 9681 15536:iconst_1        
	// 9682 15537:ldc2w           #585 <Double 1.1180895D>
	// 9683 15540:dastore         
	// 9684 15541:dup             
	// 9685 15542:iconst_2        
	// 9686 15543:ldc2w           #2573 <Double 802.27365959999997D>
	// 9687 15546:dastore         
	// 9688 15547:dup             
	// 9689 15548:iconst_3        
	// 9690 15549:ldc2w           #111 <Double 110.00047410000001D>
	// 9691 15552:dastore         
	// 9692 15553:dup             
	// 9693 15554:iconst_4        
	// 9694 15555:ldc2w           #113 <Double 7.0639795000000003D>
	// 9695 15558:dastore         
	// 9696 15559:dup             
	// 9697 15560:iconst_5        
	// 9698 15561:ldc2w           #2575 <Double 1.7010788999999999D>
	// 9699 15564:dastore         
	// 9700 15565:dup             
	// 9701 15566:bipush          6
	// 9702 15568:ldc2w           #2577 <Double 20.178288500000001D>
	// 9703 15571:dastore         
	// 9704 15572:dup             
	// 9705 15573:bipush          7
	// 9706 15575:ldc2w           #2579 <Double -996.27306840000006D>
	// 9707 15578:dastore         
	// 9708 15579:dup             
	// 9709 15580:bipush          8
	// 9710 15582:ldc2w           #121 <Double -1.4008494D>
	// 9711 15585:dastore         
	// 9712 15586:aastore         
	// 9713 15587:dup             
	// 9714 15588:bipush          106
	// 9715 15590:bipush          9
	// 9716 15592:newarray        double[]
	// 9717 15594:dup             
	// 9718 15595:iconst_0        
	// 9719 15596:ldc2w           #2581 <Double -7.8909506D>
	// 9720 15599:dastore         
	// 9721 15600:dup             
	// 9722 15601:iconst_1        
	// 9723 15602:ldc2w           #585 <Double 1.1180895D>
	// 9724 15605:dastore         
	// 9725 15606:dup             
	// 9726 15607:iconst_2        
	// 9727 15608:ldc2w           #2583 <Double 773.41939109999998D>
	// 9728 15611:dastore         
	// 9729 15612:dup             
	// 9730 15613:iconst_3        
	// 9731 15614:ldc2w           #127 <Double 127.6888198D>
	// 9732 15617:dastore         
	// 9733 15618:dup             
	// 9734 15619:iconst_4        
	// 9735 15620:ldc2w           #129 <Double 6.4866308999999998D>
	// 9736 15623:dastore         
	// 9737 15624:dup             
	// 9738 15625:iconst_5        
	// 9739 15626:ldc2w           #2585 <Double 2.0010789D>
	// 9740 15629:dastore         
	// 9741 15630:dup             
	// 9742 15631:bipush          6
	// 9743 15633:ldc2w           #2587 <Double 23.094814400000001D>
	// 9744 15636:dastore         
	// 9745 15637:dup             
	// 9746 15638:bipush          7
	// 9747 15640:ldc2w           #2589 <Double -1117.4411152D>
	// 9748 15643:dastore         
	// 9749 15644:dup             
	// 9750 15645:bipush          8
	// 9751 15647:ldc2w           #137 <Double -1.4699811D>
	// 9752 15650:dastore         
	// 9753 15651:aastore         
	// 9754 15652:dup             
	// 9755 15653:bipush          107
	// 9756 15655:aload           50
	// 9757 15657:aastore         
	// 9758 15658:dup             
	// 9759 15659:bipush          108
	// 9760 15661:bipush          9
	// 9761 15663:newarray        double[]
	// 9762 15665:dup             
	// 9763 15666:iconst_0        
	// 9764 15667:ldc2w           #2591 <Double -7.2909506000000004D>
	// 9765 15670:dastore         
	// 9766 15671:dup             
	// 9767 15672:iconst_1        
	// 9768 15673:ldc2w           #585 <Double 1.1180895D>
	// 9769 15676:dastore         
	// 9770 15677:dup             
	// 9771 15678:iconst_2        
	// 9772 15679:ldc2w           #2593 <Double 715.71085419999997D>
	// 9773 15682:dastore         
	// 9774 15683:dup             
	// 9775 15684:iconst_3        
	// 9776 15685:ldc2w           #143 <Double 171.99884599999999D>
	// 9777 15688:dastore         
	// 9778 15689:dup             
	// 9779 15690:iconst_4        
	// 9780 15691:ldc2w           #145 <Double 4.8356763999999997D>
	// 9781 15694:dastore         
	// 9782 15695:dup             
	// 9783 15696:iconst_5        
	// 9784 15697:ldc2w           #2595 <Double 2.6010789000000001D>
	// 9785 15700:dastore         
	// 9786 15701:dup             
	// 9787 15702:bipush          6
	// 9788 15704:ldc2w           #2597 <Double 22.4546861D>
	// 9789 15707:dastore         
	// 9790 15708:dup             
	// 9791 15709:bipush          7
	// 9792 15711:ldc2w           #2599 <Double -1142.5200199000001D>
	// 9793 15714:dastore         
	// 9794 15715:dup             
	// 9795 15716:bipush          8
	// 9796 15718:ldc2w           #153 <Double -1.5592649999999999D>
	// 9797 15721:dastore         
	// 9798 15722:aastore         
	// 9799 15723:dup             
	// 9800 15724:bipush          109
	// 9801 15726:aload           51
	// 9802 15728:aastore         
	// 9803 15729:dup             
	// 9804 15730:bipush          110
	// 9805 15732:bipush          9
	// 9806 15734:newarray        double[]
	// 9807 15736:dup             
	// 9808 15737:iconst_0        
	// 9809 15738:ldc2w           #2601 <Double -6.6909505999999999D>
	// 9810 15741:dastore         
	// 9811 15742:dup             
	// 9812 15743:iconst_1        
	// 9813 15744:ldc2w           #585 <Double 1.1180895D>
	// 9814 15747:dastore         
	// 9815 15748:dup             
	// 9816 15749:iconst_2        
	// 9817 15750:ldc2w           #2603 <Double 658.00231719999999D>
	// 9818 15753:dastore         
	// 9819 15754:dup             
	// 9820 15755:iconst_3        
	// 9821 15756:ldc2w           #159 <Double 234.27778710000001D>
	// 9822 15759:dastore         
	// 9823 15760:dup             
	// 9824 15761:iconst_4        
	// 9825 15762:ldc2w           #161 <Double 2.1401053000000001D>
	// 9826 15765:dastore         
	// 9827 15766:dup             
	// 9828 15767:iconst_5        
	// 9829 15768:ldc2w           #2605 <Double 3.2010789000000002D>
	// 9830 15771:dastore         
	// 9831 15772:dup             
	// 9832 15773:bipush          6
	// 9833 15775:ldc2w           #2607 <Double 14.498020800000001D>
	// 9834 15778:dastore         
	// 9835 15779:dup             
	// 9836 15780:bipush          7
	// 9837 15782:ldc2w           #2609 <Double -849.41659360000006D>
	// 9838 15785:dastore         
	// 9839 15786:dup             
	// 9840 15787:bipush          8
	// 9841 15789:ldc2w           #169 <Double -1.5803442000000001D>
	// 9842 15792:dastore         
	// 9843 15793:aastore         
	// 9844 15794:dup             
	// 9845 15795:bipush          111
	// 9846 15797:aload           52
	// 9847 15799:aastore         
	// 9848 15800:dup             
	// 9849 15801:bipush          112
	// 9850 15803:aload           53
	// 9851 15805:aastore         
	// 9852 15806:dup             
	// 9853 15807:bipush          113
	// 9854 15809:bipush          9
	// 9855 15811:newarray        double[]
	// 9856 15813:dup             
	// 9857 15814:iconst_0        
	// 9858 15815:ldc2w           #2611 <Double -5.7909506000000004D>
	// 9859 15818:dastore         
	// 9860 15819:dup             
	// 9861 15820:iconst_1        
	// 9862 15821:ldc2w           #585 <Double 1.1180895D>
	// 9863 15824:dastore         
	// 9864 15825:dup             
	// 9865 15826:iconst_2        
	// 9866 15827:ldc2w           #2613 <Double 571.43951179999999D>
	// 9867 15830:dastore         
	// 9868 15831:dup             
	// 9869 15832:iconst_3        
	// 9870 15833:ldc2w           #191 <Double 392.10647540000002D>
	// 9871 15836:dastore         
	// 9872 15837:dup             
	// 9873 15838:iconst_4        
	// 9874 15839:ldc2w           #193 <Double -5.9244687000000003D>
	// 9875 15842:dastore         
	// 9876 15843:dup             
	// 9877 15844:iconst_5        
	// 9878 15845:ldc2w           #2615 <Double 4.1010789000000001D>
	// 9879 15848:dastore         
	// 9880 15849:dup             
	// 9881 15850:bipush          6
	// 9882 15852:ldc2w           #2617 <Double -2.0962499000000001D>
	// 9883 15855:dastore         
	// 9884 15856:dup             
	// 9885 15857:bipush          7
	// 9886 15859:ldc2w           #2619 <Double -88.970552900000001D>
	// 9887 15862:dastore         
	// 9888 15863:dup             
	// 9889 15864:bipush          8
	// 9890 15866:ldc2w           #201 <Double -1.4830451D>
	// 9891 15869:dastore         
	// 9892 15870:aastore         
	// 9893 15871:dup             
	// 9894 15872:bipush          114
	// 9895 15874:bipush          9
	// 9896 15876:newarray        double[]
	// 9897 15878:dup             
	// 9898 15879:iconst_0        
	// 9899 15880:ldc2w           #2621 <Double -4.0953996999999998D>
	// 9900 15883:dastore         
	// 9901 15884:dup             
	// 9902 15885:iconst_1        
	// 9903 15886:ldc2w           #677 <Double 1.4449038000000001D>
	// 9904 15889:dastore         
	// 9905 15890:dup             
	// 9906 15891:iconst_2        
	// 9907 15892:ldc2w           #2623 <Double 458.56355880000001D>
	// 9908 15895:dastore         
	// 9909 15896:dup             
	// 9910 15897:iconst_3        
	// 9911 15898:ldc2w           #209 <Double 3.0597946D>
	// 9912 15901:dastore         
	// 9913 15902:dup             
	// 9914 15903:iconst_4        
	// 9915 15904:ldc2w           #211 <Double 8.9830009000000004D>
	// 9916 15907:dastore         
	// 9917 15908:dup             
	// 9918 15909:iconst_5        
	// 9919 15910:ldc2w           #2625 <Double -1.3012877D>
	// 9920 15913:dastore         
	// 9921 15914:dup             
	// 9922 15915:bipush          6
	// 9923 15917:ldc2w           #2627 <Double -32.478885499999997D>
	// 9924 15920:dastore         
	// 9925 15921:dup             
	// 9926 15922:bipush          7
	// 9927 15924:ldc2w           #2629 <Double 286.94478320000002D>
	// 9928 15927:dastore         
	// 9929 15928:dup             
	// 9930 15929:bipush          8
	// 9931 15931:ldc2w           #219 <Double -0.062199999999999998D>
	// 9932 15934:dastore         
	// 9933 15935:aastore         
	// 9934 15936:dup             
	// 9935 15937:bipush          115
	// 9936 15939:aload           54
	// 9937 15941:aastore         
	// 9938 15942:dup             
	// 9939 15943:bipush          116
	// 9940 15945:aload           55
	// 9941 15947:aastore         
	// 9942 15948:dup             
	// 9943 15949:bipush          117
	// 9944 15951:bipush          9
	// 9945 15953:newarray        double[]
	// 9946 15955:dup             
	// 9947 15956:iconst_0        
	// 9948 15957:ldc2w           #2631 <Double -3.1953996999999998D>
	// 9949 15960:dastore         
	// 9950 15961:dup             
	// 9951 15962:iconst_1        
	// 9952 15963:ldc2w           #677 <Double 1.4449038000000001D>
	// 9953 15966:dastore         
	// 9954 15967:dup             
	// 9955 15968:iconst_2        
	// 9956 15969:ldc2w           #2633 <Double 369.05942440000001D>
	// 9957 15972:dastore         
	// 9958 15973:dup             
	// 9959 15974:iconst_3        
	// 9960 15975:ldc2w           #31  <Double 28.2628214D>
	// 9961 15978:dastore         
	// 9962 15979:dup             
	// 9963 15980:iconst_4        
	// 9964 15981:ldc2w           #33  <Double 8.8398648000000009D>
	// 9965 15984:dastore         
	// 9966 15985:dup             
	// 9967 15986:iconst_5        
	// 9968 15987:ldc2w           #2635 <Double -0.40128770000000002D>
	// 9969 15990:dastore         
	// 9970 15991:dup             
	// 9971 15992:bipush          6
	// 9972 15994:ldc2w           #2637 <Double -27.5552831D>
	// 9973 15997:dastore         
	// 9974 15998:dup             
	// 9975 15999:bipush          7
	// 9976 16001:ldc2w           #2639 <Double 164.2051807D>
	// 9977 16004:dastore         
	// 9978 16005:dup             
	// 9979 16006:bipush          8
	// 9980 16008:ldc2w           #41  <Double -0.54830319999999999D>
	// 9981 16011:dastore         
	// 9982 16012:aastore         
	// 9983 16013:dup             
	// 9984 16014:bipush          118
	// 9985 16016:bipush          9
	// 9986 16018:newarray        double[]
	// 9987 16020:dup             
	// 9988 16021:iconst_0        
	// 9989 16022:ldc2w           #2641 <Double -2.8953997D>
	// 9990 16025:dastore         
	// 9991 16026:dup             
	// 9992 16027:iconst_1        
	// 9993 16028:ldc2w           #677 <Double 1.4449038000000001D>
	// 9994 16031:dastore         
	// 9995 16032:dup             
	// 9996 16033:iconst_2        
	// 9997 16034:ldc2w           #2643 <Double 339.22471300000001D>
	// 9998 16037:dastore         
	// 9999 16038:dup             
	// 10000 16039:iconst_3        
	// 10001 16040:ldc2w           #47  <Double 37.305238799999998D>
	// 10002 16043:dastore         
	// 10003 16044:dup             
	// 10004 16045:iconst_4        
	// 10005 16046:ldc2w           #49  <Double 8.7346948999999992D>
	// 10006 16049:dastore         
	// 10007 16050:dup             
	// 10008 16051:iconst_5        
	// 10009 16052:ldc2w           #2645 <Double -0.10128769999999999D>
	// 10010 16055:dastore         
	// 10011 16056:dup             
	// 10012 16057:bipush          6
	// 10013 16059:ldc2w           #2647 <Double -21.8962179D>
	// 10014 16062:dastore         
	// 10015 16063:dup             
	// 10016 16064:bipush          7
	// 10017 16066:ldc2w           #2649 <Double 71.084868299999997D>
	// 10018 16069:dastore         
	// 10019 16070:dup             
	// 10020 16071:bipush          8
	// 10021 16073:ldc2w           #57  <Double -0.70060560000000005D>
	// 10022 16076:dastore         
	// 10023 16077:aastore         
	// 10024 16078:dup             
	// 10025 16079:bipush          119
	// 10026 16081:bipush          9
	// 10027 16083:newarray        double[]
	// 10028 16085:dup             
	// 10029 16086:iconst_0        
	// 10030 16087:ldc2w           #2651 <Double -2.5953997000000002D>
	// 10031 16090:dastore         
	// 10032 16091:dup             
	// 10033 16092:iconst_1        
	// 10034 16093:ldc2w           #677 <Double 1.4449038000000001D>
	// 10035 16096:dastore         
	// 10036 16097:dup             
	// 10037 16098:iconst_2        
	// 10038 16099:ldc2w           #2653 <Double 309.39000149999998D>
	// 10039 16102:dastore         
	// 10040 16103:dup             
	// 10041 16104:iconst_3        
	// 10042 16105:ldc2w           #541 <Double 46.896400399999997D>
	// 10043 16108:dastore         
	// 10044 16109:dup             
	// 10045 16110:iconst_4        
	// 10046 16111:ldc2w           #543 <Double 8.5943556999999995D>
	// 10047 16114:dastore         
	// 10048 16115:dup             
	// 10049 16116:iconst_5        
	// 10050 16117:ldc2w           #2655 <Double 0.19871230000000001D>
	// 10051 16120:dastore         
	// 10052 16121:dup             
	// 10053 16122:bipush          6
	// 10054 16124:ldc2w           #2657 <Double -14.798617800000001D>
	// 10055 16127:dastore         
	// 10056 16128:dup             
	// 10057 16129:bipush          7
	// 10058 16131:ldc2w           #2659 <Double -59.994703199999996D>
	// 10059 16134:dastore         
	// 10060 16135:dup             
	// 10061 16136:bipush          8
	// 10062 16138:ldc2w           #551 <Double -0.84519750000000005D>
	// 10063 16141:dastore         
	// 10064 16142:aastore         
	// 10065 16143:dup             
	// 10066 16144:bipush          120
	// 10067 16146:bipush          9
	// 10068 16148:newarray        double[]
	// 10069 16150:dup             
	// 10070 16151:iconst_0        
	// 10071 16152:ldc2w           #2661 <Double -2.2953996999999999D>
	// 10072 16155:dastore         
	// 10073 16156:dup             
	// 10074 16157:iconst_1        
	// 10075 16158:ldc2w           #677 <Double 1.4449038000000001D>
	// 10076 16161:dastore         
	// 10077 16162:dup             
	// 10078 16163:iconst_2        
	// 10079 16164:ldc2w           #2663 <Double 279.55529000000001D>
	// 10080 16167:dastore         
	// 10081 16168:dup             
	// 10082 16169:iconst_3        
	// 10083 16170:ldc2w           #63  <Double 57.2001287D>
	// 10084 16173:dastore         
	// 10085 16174:dup             
	// 10086 16175:iconst_4        
	// 10087 16176:ldc2w           #65  <Double 8.4126647000000006D>
	// 10088 16179:dastore         
	// 10089 16180:dup             
	// 10090 16181:iconst_5        
	// 10091 16182:ldc2w           #2665 <Double 0.4987123D>
	// 10092 16185:dastore         
	// 10093 16186:dup             
	// 10094 16187:bipush          6
	// 10095 16189:ldc2w           #2667 <Double -6.8397810000000003D>
	// 10096 16192:dastore         
	// 10097 16193:dup             
	// 10098 16194:bipush          7
	// 10099 16196:ldc2w           #2669 <Double -227.47731429999999D>
	// 10100 16199:dastore         
	// 10101 16200:dup             
	// 10102 16201:bipush          8
	// 10103 16203:ldc2w           #73  <Double -0.98049019999999998D>
	// 10104 16206:dastore         
	// 10105 16207:aastore         
	// 10106 16208:dup             
	// 10107 16209:bipush          121
	// 10108 16211:aload           56
	// 10109 16213:aastore         
	// 10110 16214:dup             
	// 10111 16215:bipush          122
	// 10112 16217:aload           57
	// 10113 16219:aastore         
	// 10114 16220:dup             
	// 10115 16221:bipush          123
	// 10116 16223:bipush          9
	// 10117 16225:newarray        double[]
	// 10118 16227:dup             
	// 10119 16228:iconst_0        
	// 10120 16229:ldc2w           #2671 <Double -1.3953997D>
	// 10121 16232:dastore         
	// 10122 16233:dup             
	// 10123 16234:iconst_1        
	// 10124 16235:ldc2w           #677 <Double 1.4449038000000001D>
	// 10125 16238:dastore         
	// 10126 16239:dup             
	// 10127 16240:iconst_2        
	// 10128 16241:ldc2w           #2673 <Double 190.05115559999999D>
	// 10129 16244:dastore         
	// 10130 16245:dup             
	// 10131 16246:iconst_3        
	// 10132 16247:ldc2w           #95  <Double 94.497482399999996D>
	// 10133 16250:dastore         
	// 10134 16251:dup             
	// 10135 16252:iconst_4        
	// 10136 16253:ldc2w           #97  <Double 7.5234689000000001D>
	// 10137 16256:dastore         
	// 10138 16257:dup             
	// 10139 16258:iconst_5        
	// 10140 16259:ldc2w           #2675 <Double 1.3987122999999999D>
	// 10141 16262:dastore         
	// 10142 16263:dup             
	// 10143 16264:bipush          6
	// 10144 16266:ldc2w           #2677 <Double 15.557096100000001D>
	// 10145 16269:dastore         
	// 10146 16270:dup             
	// 10147 16271:bipush          7
	// 10148 16273:ldc2w           #2679 <Double -833.00104099999999D>
	// 10149 16276:dastore         
	// 10150 16277:dup             
	// 10151 16278:bipush          8
	// 10152 16280:ldc2w           #105 <Double -1.3163339000000001D>
	// 10153 16283:dastore         
	// 10154 16284:aastore         
	// 10155 16285:dup             
	// 10156 16286:bipush          124
	// 10157 16288:bipush          9
	// 10158 16290:newarray        double[]
	// 10159 16292:dup             
	// 10160 16293:iconst_0        
	// 10161 16294:ldc2w           #2681 <Double -1.0953997D>
	// 10162 16297:dastore         
	// 10163 16298:dup             
	// 10164 16299:iconst_1        
	// 10165 16300:ldc2w           #677 <Double 1.4449038000000001D>
	// 10166 16303:dastore         
	// 10167 16304:dup             
	// 10168 16305:iconst_2        
	// 10169 16306:ldc2w           #2683 <Double 160.21644420000001D>
	// 10170 16309:dastore         
	// 10171 16310:dup             
	// 10172 16311:iconst_3        
	// 10173 16312:ldc2w           #111 <Double 110.00047410000001D>
	// 10174 16315:dastore         
	// 10175 16316:dup             
	// 10176 16317:iconst_4        
	// 10177 16318:ldc2w           #113 <Double 7.0639795000000003D>
	// 10178 16321:dastore         
	// 10179 16322:dup             
	// 10180 16323:iconst_5        
	// 10181 16324:ldc2w           #2685 <Double 1.6987123D>
	// 10182 16327:dastore         
	// 10183 16328:dup             
	// 10184 16329:bipush          6
	// 10185 16331:ldc2w           #2687 <Double 20.478204699999999D>
	// 10186 16334:dastore         
	// 10187 16335:dup             
	// 10188 16336:bipush          7
	// 10189 16338:ldc2w           #2689 <Double -1005.7346897D>
	// 10190 16341:dastore         
	// 10191 16342:dup             
	// 10192 16343:bipush          8
	// 10193 16345:ldc2w           #121 <Double -1.4008494D>
	// 10194 16348:dastore         
	// 10195 16349:aastore         
	// 10196 16350:dup             
	// 10197 16351:bipush          125
	// 10198 16353:bipush          9
	// 10199 16355:newarray        double[]
	// 10200 16357:dup             
	// 10201 16358:iconst_0        
	// 10202 16359:ldc2w           #2691 <Double -0.79539970000000004D>
	// 10203 16362:dastore         
	// 10204 16363:dup             
	// 10205 16364:iconst_1        
	// 10206 16365:ldc2w           #677 <Double 1.4449038000000001D>
	// 10207 16368:dastore         
	// 10208 16369:dup             
	// 10209 16370:iconst_2        
	// 10210 16371:ldc2w           #2693 <Double 130.38173269999999D>
	// 10211 16374:dastore         
	// 10212 16375:dup             
	// 10213 16376:iconst_3        
	// 10214 16377:ldc2w           #127 <Double 127.6888198D>
	// 10215 16380:dastore         
	// 10216 16381:dup             
	// 10217 16382:iconst_4        
	// 10218 16383:ldc2w           #129 <Double 6.4866308999999998D>
	// 10219 16386:dastore         
	// 10220 16387:dup             
	// 10221 16388:iconst_5        
	// 10222 16389:ldc2w           #2695 <Double 1.9987123D>
	// 10223 16392:dastore         
	// 10224 16393:dup             
	// 10225 16394:bipush          6
	// 10226 16396:ldc2w           #2697 <Double 23.394730500000001D>
	// 10227 16399:dastore         
	// 10228 16400:dup             
	// 10229 16401:bipush          7
	// 10230 16403:ldc2w           #2699 <Double -1127.8024849000001D>
	// 10231 16406:dastore         
	// 10232 16407:dup             
	// 10233 16408:bipush          8
	// 10234 16410:ldc2w           #137 <Double -1.4699811D>
	// 10235 16413:dastore         
	// 10236 16414:aastore         
	// 10237 16415:dup             
	// 10238 16416:bipush          126
	// 10239 16418:aload           58
	// 10240 16420:aastore         
	// 10241 16421:dup             
	// 10242 16422:bipush          127
	// 10243 16424:bipush          9
	// 10244 16426:newarray        double[]
	// 10245 16428:dup             
	// 10246 16429:iconst_0        
	// 10247 16430:ldc2w           #2701 <Double -0.19539970000000001D>
	// 10248 16433:dastore         
	// 10249 16434:dup             
	// 10250 16435:iconst_1        
	// 10251 16436:ldc2w           #677 <Double 1.4449038000000001D>
	// 10252 16439:dastore         
	// 10253 16440:dup             
	// 10254 16441:iconst_2        
	// 10255 16442:ldc2w           #2703 <Double 70.7123098D>
	// 10256 16445:dastore         
	// 10257 16446:dup             
	// 10258 16447:iconst_3        
	// 10259 16448:ldc2w           #143 <Double 171.99884599999999D>
	// 10260 16451:dastore         
	// 10261 16452:dup             
	// 10262 16453:iconst_4        
	// 10263 16454:ldc2w           #145 <Double 4.8356763999999997D>
	// 10264 16457:dastore         
	// 10265 16458:dup             
	// 10266 16459:iconst_5        
	// 10267 16460:ldc2w           #2705 <Double 2.5987122999999999D>
	// 10268 16463:dastore         
	// 10269 16464:dup             
	// 10270 16465:bipush          6
	// 10271 16467:ldc2w           #2707 <Double 22.754602200000001D>
	// 10272 16470:dastore         
	// 10273 16471:dup             
	// 10274 16472:bipush          7
	// 10275 16474:ldc2w           #2709 <Double -1154.6808864D>
	// 10276 16477:dastore         
	// 10277 16478:dup             
	// 10278 16479:bipush          8
	// 10279 16481:ldc2w           #153 <Double -1.5592649999999999D>
	// 10280 16484:dastore         
	// 10281 16485:aastore         
	// 10282 16486:dup             
	// 10283 16487:sipush          128
	// 10284 16490:aload           59
	// 10285 16492:aastore         
	// 10286 16493:dup             
	// 10287 16494:sipush          129
	// 10288 16497:bipush          9
	// 10289 16499:newarray        double[]
	// 10290 16501:dup             
	// 10291 16502:iconst_0        
	// 10292 16503:ldc2w           #2711 <Double 0.40460030000000002D>
	// 10293 16506:dastore         
	// 10294 16507:dup             
	// 10295 16508:iconst_1        
	// 10296 16509:ldc2w           #677 <Double 1.4449038000000001D>
	// 10297 16512:dastore         
	// 10298 16513:dup             
	// 10299 16514:iconst_2        
	// 10300 16515:ldc2w           #2713 <Double 11.0428868D>
	// 10301 16518:dastore         
	// 10302 16519:dup             
	// 10303 16520:iconst_3        
	// 10304 16521:ldc2w           #159 <Double 234.27778710000001D>
	// 10305 16524:dastore         
	// 10306 16525:dup             
	// 10307 16526:iconst_4        
	// 10308 16527:ldc2w           #161 <Double 2.1401053000000001D>
	// 10309 16530:dastore         
	// 10310 16531:dup             
	// 10311 16532:iconst_5        
	// 10312 16533:ldc2w           #2715 <Double 3.1987123D>
	// 10313 16536:dastore         
	// 10314 16537:dup             
	// 10315 16538:bipush          6
	// 10316 16540:ldc2w           #2717 <Double 14.7979369D>
	// 10317 16543:dastore         
	// 10318 16544:dup             
	// 10319 16545:bipush          7
	// 10320 16547:ldc2w           #2719 <Double -863.37695670000005D>
	// 10321 16550:dastore         
	// 10322 16551:dup             
	// 10323 16552:bipush          8
	// 10324 16554:ldc2w           #169 <Double -1.5803442000000001D>
	// 10325 16557:dastore         
	// 10326 16558:aastore         
	// 10327 16559:dup             
	// 10328 16560:sipush          130
	// 10329 16563:bipush          9
	// 10330 16565:newarray        double[]
	// 10331 16567:dup             
	// 10332 16568:iconst_0        
	// 10333 16569:ldc2w           #2721 <Double 0.70460029999999996D>
	// 10334 16572:dastore         
	// 10335 16573:dup             
	// 10336 16574:iconst_1        
	// 10337 16575:ldc2w           #677 <Double 1.4449038000000001D>
	// 10338 16578:dastore         
	// 10339 16579:dup             
	// 10340 16580:iconst_2        
	// 10341 16581:ldc2w           #2723 <Double -18.791824600000002D>
	// 10342 16584:dastore         
	// 10343 16585:dup             
	// 10344 16586:iconst_3        
	// 10345 16587:ldc2w           #175 <Double 275.7268449D>
	// 10346 16590:dastore         
	// 10347 16591:dup             
	// 10348 16592:iconst_4        
	// 10349 16593:ldc2w           #177 <Double 0.1651599D>
	// 10350 16596:dastore         
	// 10351 16597:dup             
	// 10352 16598:iconst_5        
	// 10353 16599:ldc2w           #2725 <Double 3.4987123000000002D>
	// 10354 16602:dastore         
	// 10355 16603:dup             
	// 10356 16604:bipush          6
	// 10357 16606:ldc2w           #2727 <Double 9.2391000999999999D>
	// 10358 16609:dastore         
	// 10359 16610:dup             
	// 10360 16611:bipush          7
	// 10361 16613:ldc2w           #2729 <Double -625.72719910000001D>
	// 10362 16616:dastore         
	// 10363 16617:dup             
	// 10364 16618:bipush          8
	// 10365 16620:ldc2w           #185 <Double -1.5649227999999999D>
	// 10366 16623:dastore         
	// 10367 16624:aastore         
	// 10368 16625:dup             
	// 10369 16626:sipush          131
	// 10370 16629:bipush          9
	// 10371 16631:newarray        double[]
	// 10372 16633:dup             
	// 10373 16634:iconst_0        
	// 10374 16635:ldc2w           #2731 <Double 1.0046002999999999D>
	// 10375 16638:dastore         
	// 10376 16639:dup             
	// 10377 16640:iconst_1        
	// 10378 16641:ldc2w           #677 <Double 1.4449038000000001D>
	// 10379 16644:dastore         
	// 10380 16645:dup             
	// 10381 16646:iconst_2        
	// 10382 16647:ldc2w           #2733 <Double -48.626536100000003D>
	// 10383 16650:dastore         
	// 10384 16651:dup             
	// 10385 16652:iconst_3        
	// 10386 16653:ldc2w           #291 <Double 327.13300479999998D>
	// 10387 16656:dastore         
	// 10388 16657:dup             
	// 10389 16658:iconst_4        
	// 10390 16659:ldc2w           #293 <Double -2.4385346000000001D>
	// 10391 16662:dastore         
	// 10392 16663:dup             
	// 10393 16664:iconst_5        
	// 10394 16665:ldc2w           #2735 <Double 3.7987123D>
	// 10395 16668:dastore         
	// 10396 16669:dup             
	// 10397 16670:bipush          6
	// 10398 16672:ldc2w           #2737 <Double 3.4806286000000002D>
	// 10399 16675:dastore         
	// 10400 16676:dup             
	// 10401 16677:bipush          7
	// 10402 16679:ldc2w           #2739 <Double -361.36927279999998D>
	// 10403 16682:dastore         
	// 10404 16683:dup             
	// 10405 16684:bipush          8
	// 10406 16686:ldc2w           #301 <Double -1.5323681D>
	// 10407 16689:dastore         
	// 10408 16690:aastore         
	// 10409 16691:dup             
	// 10410 16692:sipush          132
	// 10411 16695:aload           60
	// 10412 16697:aastore         
	// 10413 16698:dup             
	// 10414 16699:sipush          133
	// 10415 16702:bipush          9
	// 10416 16704:newarray        double[]
	// 10417 16706:dup             
	// 10418 16707:iconst_0        
	// 10419 16708:ldc2w           #2741 <Double 2.8927451D>
	// 10420 16711:dastore         
	// 10421 16712:dup             
	// 10422 16713:iconst_1        
	// 10423 16714:ldc2w           #749 <Double 1.6914144D>
	// 10424 16717:dastore         
	// 10425 16718:dup             
	// 10426 16719:iconst_2        
	// 10427 16720:ldc2w           #2743 <Double -184.87363250000001D>
	// 10428 16723:dastore         
	// 10429 16724:dup             
	// 10430 16725:iconst_3        
	// 10431 16726:ldc2w           #209 <Double 3.0597946D>
	// 10432 16729:dastore         
	// 10433 16730:dup             
	// 10434 16731:iconst_4        
	// 10435 16732:ldc2w           #211 <Double 8.9830009000000004D>
	// 10436 16735:dastore         
	// 10437 16736:dup             
	// 10438 16737:iconst_5        
	// 10439 16738:ldc2w           #2745 <Double -1.3045357D>
	// 10440 16741:dastore         
	// 10441 16742:dup             
	// 10442 16743:bipush          6
	// 10443 16745:ldc2w           #2747 <Double -32.1790278D>
	// 10444 16748:dastore         
	// 10445 16749:dup             
	// 10446 16750:bipush          7
	// 10447 16752:ldc2w           #2749 <Double 286.56898660000002D>
	// 10448 16755:dastore         
	// 10449 16756:dup             
	// 10450 16757:bipush          8
	// 10451 16759:ldc2w           #219 <Double -0.062199999999999998D>
	// 10452 16762:dastore         
	// 10453 16763:aastore         
	// 10454 16764:dup             
	// 10455 16765:sipush          134
	// 10456 16768:bipush          9
	// 10457 16770:newarray        double[]
	// 10458 16772:dup             
	// 10459 16773:iconst_0        
	// 10460 16774:ldc2w           #2751 <Double 3.1927450999999998D>
	// 10461 16777:dastore         
	// 10462 16778:dup             
	// 10463 16779:iconst_1        
	// 10464 16780:ldc2w           #749 <Double 1.6914144D>
	// 10465 16783:dastore         
	// 10466 16784:dup             
	// 10467 16785:iconst_2        
	// 10468 16786:ldc2w           #2753 <Double -215.4478757D>
	// 10469 16789:dastore         
	// 10470 16790:dup             
	// 10471 16791:iconst_3        
	// 10472 16792:ldc2w           #319 <Double 11.2644424D>
	// 10473 16795:dastore         
	// 10474 16796:dup             
	// 10475 16797:iconst_4        
	// 10476 16798:ldc2w           #321 <Double 8.9614528999999994D>
	// 10477 16801:dastore         
	// 10478 16802:dup             
	// 10479 16803:iconst_5        
	// 10480 16804:ldc2w           #2755 <Double -1.0045356999999999D>
	// 10481 16807:dastore         
	// 10482 16808:dup             
	// 10483 16809:bipush          6
	// 10484 16811:ldc2w           #2757 <Double -32.695553699999998D>
	// 10485 16814:dastore         
	// 10486 16815:dup             
	// 10487 16816:bipush          7
	// 10488 16818:ldc2w           #2759 <Double 259.64347509999999D>
	// 10489 16821:dastore         
	// 10490 16822:dup             
	// 10491 16823:bipush          8
	// 10492 16825:ldc2w           #329 <Double -0.22733419999999999D>
	// 10493 16828:dastore         
	// 10494 16829:aastore         
	// 10495 16830:dup             
	// 10496 16831:sipush          135
	// 10497 16834:bipush          9
	// 10498 16836:newarray        double[]
	// 10499 16838:dup             
	// 10500 16839:iconst_0        
	// 10501 16840:ldc2w           #2761 <Double 3.4927451D>
	// 10502 16843:dastore         
	// 10503 16844:dup             
	// 10504 16845:iconst_1        
	// 10505 16846:ldc2w           #749 <Double 1.6914144D>
	// 10506 16849:dastore         
	// 10507 16850:dup             
	// 10508 16851:iconst_2        
	// 10509 16852:ldc2w           #2763 <Double -246.02211879999999D>
	// 10510 16855:dastore         
	// 10511 16856:dup             
	// 10512 16857:iconst_3        
	// 10513 16858:ldc2w           #15  <Double 19.625597299999999D>
	// 10514 16861:dastore         
	// 10515 16862:dup             
	// 10516 16863:iconst_4        
	// 10517 16864:ldc2w           #17  <Double 8.9143979000000009D>
	// 10518 16867:dastore         
	// 10519 16868:dup             
	// 10520 16869:iconst_5        
	// 10521 16870:ldc2w           #2765 <Double -0.70453569999999999D>
	// 10522 16873:dastore         
	// 10523 16874:dup             
	// 10524 16875:bipush          6
	// 10525 16877:ldc2w           #2767 <Double -31.0394714D>
	// 10526 16880:dastore         
	// 10527 16881:dup             
	// 10528 16882:bipush          7
	// 10529 16884:ldc2w           #2769 <Double 222.03974270000001D>
	// 10530 16887:dastore         
	// 10531 16888:dup             
	// 10532 16889:bipush          8
	// 10533 16891:ldc2w           #25  <Double -0.38996530000000001D>
	// 10534 16894:dastore         
	// 10535 16895:aastore         
	// 10536 16896:dup             
	// 10537 16897:sipush          136
	// 10538 16900:bipush          9
	// 10539 16902:newarray        double[]
	// 10540 16904:dup             
	// 10541 16905:iconst_0        
	// 10542 16906:ldc2w           #2771 <Double 3.7927450999999999D>
	// 10543 16909:dastore         
	// 10544 16910:dup             
	// 10545 16911:iconst_1        
	// 10546 16912:ldc2w           #749 <Double 1.6914144D>
	// 10547 16915:dastore         
	// 10548 16916:dup             
	// 10549 16917:iconst_2        
	// 10550 16918:ldc2w           #2773 <Double -276.596362D>
	// 10551 16921:dastore         
	// 10552 16922:dup             
	// 10553 16923:iconst_3        
	// 10554 16924:ldc2w           #31  <Double 28.2628214D>
	// 10555 16927:dastore         
	// 10556 16928:dup             
	// 10557 16929:iconst_4        
	// 10558 16930:ldc2w           #33  <Double 8.8398648000000009D>
	// 10559 16933:dastore         
	// 10560 16934:dup             
	// 10561 16935:iconst_5        
	// 10562 16936:ldc2w           #2775 <Double -0.4045357D>
	// 10563 16939:dastore         
	// 10564 16940:dup             
	// 10565 16941:bipush          6
	// 10566 16943:ldc2w           #2777 <Double -27.2554254D>
	// 10567 16946:dastore         
	// 10568 16947:dup             
	// 10569 16948:bipush          7
	// 10570 16950:ldc2w           #2779 <Double 161.13066459999999D>
	// 10571 16953:dastore         
	// 10572 16954:dup             
	// 10573 16955:bipush          8
	// 10574 16957:ldc2w           #41  <Double -0.54830319999999999D>
	// 10575 16960:dastore         
	// 10576 16961:aastore         
	// 10577 16962:dup             
	// 10578 16963:sipush          137
	// 10579 16966:aload           61
	// 10580 16968:aastore         
	// 10581 16969:dup             
	// 10582 16970:sipush          138
	// 10583 16973:bipush          9
	// 10584 16975:newarray        double[]
	// 10585 16977:dup             
	// 10586 16978:iconst_0        
	// 10587 16979:ldc2w           #2781 <Double 4.3927451D>
	// 10588 16982:dastore         
	// 10589 16983:dup             
	// 10590 16984:iconst_1        
	// 10591 16985:ldc2w           #749 <Double 1.6914144D>
	// 10592 16988:dastore         
	// 10593 16989:dup             
	// 10594 16990:iconst_2        
	// 10595 16991:ldc2w           #2783 <Double -337.7448483D>
	// 10596 16994:dastore         
	// 10597 16995:dup             
	// 10598 16996:iconst_3        
	// 10599 16997:ldc2w           #541 <Double 46.896400399999997D>
	// 10600 17000:dastore         
	// 10601 17001:dup             
	// 10602 17002:iconst_4        
	// 10603 17003:ldc2w           #543 <Double 8.5943556999999995D>
	// 10604 17006:dastore         
	// 10605 17007:dup             
	// 10606 17008:iconst_5        
	// 10607 17009:ldc2w           #2785 <Double 0.19546430000000001D>
	// 10608 17012:dastore         
	// 10609 17013:dup             
	// 10610 17014:bipush          6
	// 10611 17016:ldc2w           #2787 <Double -14.498760000000001D>
	// 10612 17019:dastore         
	// 10613 17020:dup             
	// 10614 17021:bipush          7
	// 10615 17023:ldc2w           #2789 <Double -64.868365600000004D>
	// 10616 17026:dastore         
	// 10617 17027:dup             
	// 10618 17028:bipush          8
	// 10619 17030:ldc2w           #551 <Double -0.84519750000000005D>
	// 10620 17033:dastore         
	// 10621 17034:aastore         
	// 10622 17035:dup             
	// 10623 17036:sipush          139
	// 10624 17039:aload           62
	// 10625 17041:aastore         
	// 10626 17042:dup             
	// 10627 17043:sipush          140
	// 10628 17046:bipush          9
	// 10629 17048:newarray        double[]
	// 10630 17050:dup             
	// 10631 17051:iconst_0        
	// 10632 17052:ldc2w           #2791 <Double 4.9927450999999996D>
	// 10633 17055:dastore         
	// 10634 17056:dup             
	// 10635 17057:iconst_1        
	// 10636 17058:ldc2w           #749 <Double 1.6914144D>
	// 10637 17061:dastore         
	// 10638 17062:dup             
	// 10639 17063:iconst_2        
	// 10640 17064:ldc2w           #2793 <Double -398.89333470000003D>
	// 10641 17067:dastore         
	// 10642 17068:dup             
	// 10643 17069:iconst_3        
	// 10644 17070:ldc2w           #345 <Double 68.407805800000006D>
	// 10645 17073:dastore         
	// 10646 17074:dup             
	// 10647 17075:iconst_4        
	// 10648 17076:ldc2w           #347 <Double 8.1813959000000001D>
	// 10649 17079:dastore         
	// 10650 17080:dup             
	// 10651 17081:iconst_5        
	// 10652 17082:ldc2w           #2795 <Double 0.79546430000000001D>
	// 10653 17085:dastore         
	// 10654 17086:dup             
	// 10655 17087:bipush          6
	// 10656 17089:ldc2w           #2797 <Double 1.6185482D>
	// 10657 17092:dastore         
	// 10658 17093:dup             
	// 10659 17094:bipush          7
	// 10660 17096:ldc2w           #2799 <Double -429.55186329999998D>
	// 10661 17099:dastore         
	// 10662 17100:dup             
	// 10663 17101:bipush          8
	// 10664 17103:ldc2w           #355 <Double -1.1049982D>
	// 10665 17106:dastore         
	// 10666 17107:aastore         
	// 10667 17108:dup             
	// 10668 17109:sipush          141
	// 10669 17112:aload           63
	// 10670 17114:aastore         
	// 10671 17115:dup             
	// 10672 17116:sipush          142
	// 10673 17119:aload           64
	// 10674 17121:aastore         
	// 10675 17122:dup             
	// 10676 17123:sipush          143
	// 10677 17126:aload           65
	// 10678 17128:aastore         
	// 10679 17129:dup             
	// 10680 17130:sipush          144
	// 10681 17133:bipush          9
	// 10682 17135:newarray        double[]
	// 10683 17137:dup             
	// 10684 17138:iconst_0        
	// 10685 17139:ldc2w           #2801 <Double 6.1927450999999998D>
	// 10686 17142:dastore         
	// 10687 17143:dup             
	// 10688 17144:iconst_1        
	// 10689 17145:ldc2w           #749 <Double 1.6914144D>
	// 10690 17148:dastore         
	// 10691 17149:dup             
	// 10692 17150:iconst_2        
	// 10693 17151:ldc2w           #2803 <Double -521.19030740000005D>
	// 10694 17154:dastore         
	// 10695 17155:dup             
	// 10696 17156:iconst_3        
	// 10697 17157:ldc2w           #127 <Double 127.6888198D>
	// 10698 17160:dastore         
	// 10699 17161:dup             
	// 10700 17162:iconst_4        
	// 10701 17163:ldc2w           #129 <Double 6.4866308999999998D>
	// 10702 17166:dastore         
	// 10703 17167:dup             
	// 10704 17168:iconst_5        
	// 10705 17169:ldc2w           #2805 <Double 1.9954643000000001D>
	// 10706 17172:dastore         
	// 10707 17173:dup             
	// 10708 17174:bipush          6
	// 10709 17176:ldc2w           #2807 <Double 23.694588199999998D>
	// 10710 17179:dastore         
	// 10711 17180:dup             
	// 10712 17181:bipush          7
	// 10713 17183:ldc2w           #2809 <Double -1138.0735863D>
	// 10714 17186:dastore         
	// 10715 17187:dup             
	// 10716 17188:bipush          8
	// 10717 17190:ldc2w           #137 <Double -1.4699811D>
	// 10718 17193:dastore         
	// 10719 17194:aastore         
	// 10720 17195:dup             
	// 10721 17196:sipush          145
	// 10722 17199:aload           66
	// 10723 17201:aastore         
	// 10724 17202:dup             
	// 10725 17203:sipush          146
	// 10726 17206:aload           67
	// 10727 17208:aastore         
	// 10728 17209:dup             
	// 10729 17210:sipush          147
	// 10730 17213:bipush          9
	// 10731 17215:newarray        double[]
	// 10732 17217:dup             
	// 10733 17218:iconst_0        
	// 10734 17219:ldc2w           #2811 <Double 7.0927451000000001D>
	// 10735 17222:dastore         
	// 10736 17223:dup             
	// 10737 17224:iconst_1        
	// 10738 17225:ldc2w           #749 <Double 1.6914144D>
	// 10739 17228:dastore         
	// 10740 17229:dup             
	// 10741 17230:iconst_2        
	// 10742 17231:ldc2w           #2813 <Double -612.91303689999995D>
	// 10743 17234:dastore         
	// 10744 17235:dup             
	// 10745 17236:iconst_3        
	// 10746 17237:ldc2w           #265 <Double 200.29154579999999D>
	// 10747 17240:dastore         
	// 10748 17241:dup             
	// 10749 17242:iconst_4        
	// 10750 17243:ldc2w           #267 <Double 3.6574485999999999D>
	// 10751 17246:dastore         
	// 10752 17247:dup             
	// 10753 17248:iconst_5        
	// 10754 17249:ldc2w           #2815 <Double 2.8954643D>
	// 10755 17252:dastore         
	// 10756 17253:dup             
	// 10757 17254:bipush          6
	// 10758 17256:ldc2w           #2817 <Double 19.795394699999999D>
	// 10759 17259:dastore         
	// 10760 17260:dup             
	// 10761 17261:bipush          7
	// 10762 17263:ldc2w           #2819 <Double -1058.9563952000001D>
	// 10763 17266:dastore         
	// 10764 17267:dup             
	// 10765 17268:bipush          8
	// 10766 17270:ldc2w           #275 <Double -1.5784544D>
	// 10767 17273:dastore         
	// 10768 17274:aastore         
	// 10769 17275:dup             
	// 10770 17276:sipush          148
	// 10771 17279:bipush          9
	// 10772 17281:newarray        double[]
	// 10773 17283:dup             
	// 10774 17284:iconst_0        
	// 10775 17285:ldc2w           #2821 <Double 7.3927451D>
	// 10776 17288:dastore         
	// 10777 17289:dup             
	// 10778 17290:iconst_1        
	// 10779 17291:ldc2w           #749 <Double 1.6914144D>
	// 10780 17294:dastore         
	// 10781 17295:dup             
	// 10782 17296:iconst_2        
	// 10783 17297:ldc2w           #2823 <Double -643.48728000000006D>
	// 10784 17300:dastore         
	// 10785 17301:dup             
	// 10786 17302:iconst_3        
	// 10787 17303:ldc2w           #159 <Double 234.27778710000001D>
	// 10788 17306:dastore         
	// 10789 17307:dup             
	// 10790 17308:iconst_4        
	// 10791 17309:ldc2w           #161 <Double 2.1401053000000001D>
	// 10792 17312:dastore         
	// 10793 17313:dup             
	// 10794 17314:iconst_5        
	// 10795 17315:ldc2w           #2825 <Double 3.1954642999999998D>
	// 10796 17318:dastore         
	// 10797 17319:dup             
	// 10798 17320:bipush          6
	// 10799 17322:ldc2w           #2827 <Double 15.0977946D>
	// 10800 17325:dastore         
	// 10801 17326:dup             
	// 10802 17327:bipush          7
	// 10803 17329:ldc2w           #2829 <Double -877.24635079999996D>
	// 10804 17332:dastore         
	// 10805 17333:dup             
	// 10806 17334:bipush          8
	// 10807 17336:ldc2w           #169 <Double -1.5803442000000001D>
	// 10808 17339:dastore         
	// 10809 17340:aastore         
	// 10810 17341:dup             
	// 10811 17342:sipush          149
	// 10812 17345:bipush          9
	// 10813 17347:newarray        double[]
	// 10814 17349:dup             
	// 10815 17350:iconst_0        
	// 10816 17351:ldc2w           #2831 <Double 7.6927450999999998D>
	// 10817 17354:dastore         
	// 10818 17355:dup             
	// 10819 17356:iconst_1        
	// 10820 17357:ldc2w           #749 <Double 1.6914144D>
	// 10821 17360:dastore         
	// 10822 17361:dup             
	// 10823 17362:iconst_2        
	// 10824 17363:ldc2w           #2833 <Double -674.06152320000001D>
	// 10825 17366:dastore         
	// 10826 17367:dup             
	// 10827 17368:iconst_3        
	// 10828 17369:ldc2w           #175 <Double 275.7268449D>
	// 10829 17372:dastore         
	// 10830 17373:dup             
	// 10831 17374:iconst_4        
	// 10832 17375:ldc2w           #177 <Double 0.1651599D>
	// 10833 17378:dastore         
	// 10834 17379:dup             
	// 10835 17380:iconst_5        
	// 10836 17381:ldc2w           #2835 <Double 3.4954643000000001D>
	// 10837 17384:dastore         
	// 10838 17385:dup             
	// 10839 17386:bipush          6
	// 10840 17388:ldc2w           #2837 <Double 9.5389578000000004D>
	// 10841 17391:dastore         
	// 10842 17392:dup             
	// 10843 17393:bipush          7
	// 10844 17395:ldc2w           #2839 <Double -640.49616639999999D>
	// 10845 17398:dastore         
	// 10846 17399:dup             
	// 10847 17400:bipush          8
	// 10848 17402:ldc2w           #185 <Double -1.5649227999999999D>
	// 10849 17405:dastore         
	// 10850 17406:aastore         
	// 10851 17407:dup             
	// 10852 17408:sipush          150
	// 10853 17411:aload           68
	// 10854 17413:aastore         
	// 10855 17414:dup             
	// 10856 17415:sipush          151
	// 10857 17418:aload           69
	// 10858 17420:aastore         
	// 10859 17421:dup             
	// 10860 17422:sipush          152
	// 10861 17425:aload           70
	// 10862 17427:aastore         
	// 10863 17428:dup             
	// 10864 17429:sipush          153
	// 10865 17432:aload           71
	// 10866 17434:aastore         
	// 10867 17435:dup             
	// 10868 17436:sipush          154
	// 10869 17439:bipush          9
	// 10870 17441:newarray        double[]
	// 10871 17443:dup             
	// 10872 17444:iconst_0        
	// 10873 17445:ldc2w           #2841 <Double 9.7476407999999992D>
	// 10874 17448:dastore         
	// 10875 17449:dup             
	// 10876 17450:iconst_1        
	// 10877 17451:ldc2w           #841 <Double 1.8628107D>
	// 10878 17454:dastore         
	// 10879 17455:dup             
	// 10880 17456:iconst_2        
	// 10881 17457:ldc2w           #2843 <Double -841.58684259999995D>
	// 10882 17460:dastore         
	// 10883 17461:dup             
	// 10884 17462:iconst_3        
	// 10885 17463:ldc2w           #15  <Double 19.625597299999999D>
	// 10886 17466:dastore         
	// 10887 17467:dup             
	// 10888 17468:iconst_4        
	// 10889 17469:ldc2w           #17  <Double 8.9143979000000009D>
	// 10890 17472:dastore         
	// 10891 17473:dup             
	// 10892 17474:iconst_5        
	// 10893 17475:ldc2w           #2845 <Double -0.7094009D>
	// 10894 17478:dastore         
	// 10895 17479:dup             
	// 10896 17480:bipush          6
	// 10897 17482:ldc2w           #2847 <Double -30.739750900000001D>
	// 10898 17485:dastore         
	// 10899 17486:dup             
	// 10900 17487:bipush          7
	// 10901 17489:ldc2w           #2849 <Double 220.02938109999999D>
	// 10902 17492:dastore         
	// 10903 17493:dup             
	// 10904 17494:bipush          8
	// 10905 17496:ldc2w           #25  <Double -0.38996530000000001D>
	// 10906 17499:dastore         
	// 10907 17500:aastore         
	// 10908 17501:dup             
	// 10909 17502:sipush          155
	// 10910 17505:bipush          9
	// 10911 17507:newarray        double[]
	// 10912 17509:dup             
	// 10913 17510:iconst_0        
	// 10914 17511:ldc2w           #2851 <Double 10.0476408D>
	// 10915 17514:dastore         
	// 10916 17515:dup             
	// 10917 17516:iconst_1        
	// 10918 17517:ldc2w           #841 <Double 1.8628107D>
	// 10919 17520:dastore         
	// 10920 17521:dup             
	// 10921 17522:iconst_2        
	// 10922 17523:ldc2w           #2853 <Double -872.67527489999998D>
	// 10923 17526:dastore         
	// 10924 17527:dup             
	// 10925 17528:iconst_3        
	// 10926 17529:ldc2w           #31  <Double 28.2628214D>
	// 10927 17532:dastore         
	// 10928 17533:dup             
	// 10929 17534:iconst_4        
	// 10930 17535:ldc2w           #33  <Double 8.8398648000000009D>
	// 10931 17538:dastore         
	// 10932 17539:dup             
	// 10933 17540:iconst_5        
	// 10934 17541:ldc2w           #2855 <Double -0.40940090000000001D>
	// 10935 17544:dastore         
	// 10936 17545:dup             
	// 10937 17546:bipush          6
	// 10938 17548:ldc2w           #2857 <Double -26.955704900000001D>
	// 10939 17551:dastore         
	// 10940 17552:dup             
	// 10941 17553:bipush          7
	// 10942 17555:ldc2w           #2859 <Double 158.22114149999999D>
	// 10943 17558:dastore         
	// 10944 17559:dup             
	// 10945 17560:bipush          8
	// 10946 17562:ldc2w           #41  <Double -0.54830319999999999D>
	// 10947 17565:dastore         
	// 10948 17566:aastore         
	// 10949 17567:dup             
	// 10950 17568:sipush          156
	// 10951 17571:bipush          9
	// 10952 17573:newarray        double[]
	// 10953 17575:dup             
	// 10954 17576:iconst_0        
	// 10955 17577:ldc2w           #2861 <Double 10.347640800000001D>
	// 10956 17580:dastore         
	// 10957 17581:dup             
	// 10958 17582:iconst_1        
	// 10959 17583:ldc2w           #841 <Double 1.8628107D>
	// 10960 17586:dastore         
	// 10961 17587:dup             
	// 10962 17588:iconst_2        
	// 10963 17589:ldc2w           #2863 <Double -903.76370710000003D>
	// 10964 17592:dastore         
	// 10965 17593:dup             
	// 10966 17594:iconst_3        
	// 10967 17595:ldc2w           #47  <Double 37.305238799999998D>
	// 10968 17598:dastore         
	// 10969 17599:dup             
	// 10970 17600:iconst_4        
	// 10971 17601:ldc2w           #49  <Double 8.7346948999999992D>
	// 10972 17604:dastore         
	// 10973 17605:dup             
	// 10974 17606:iconst_5        
	// 10975 17607:ldc2w           #2865 <Double -0.1094009D>
	// 10976 17610:dastore         
	// 10977 17611:dup             
	// 10978 17612:bipush          6
	// 10979 17614:ldc2w           #2867 <Double -21.296639599999999D>
	// 10980 17617:dastore         
	// 10981 17618:dup             
	// 10982 17619:bipush          7
	// 10983 17621:ldc2w           #2869 <Double 63.302094400000001D>
	// 10984 17624:dastore         
	// 10985 17625:dup             
	// 10986 17626:bipush          8
	// 10987 17628:ldc2w           #57  <Double -0.70060560000000005D>
	// 10988 17631:dastore         
	// 10989 17632:aastore         
	// 10990 17633:dup             
	// 10991 17634:sipush          157
	// 10992 17637:aload           72
	// 10993 17639:aastore         
	// 10994 17640:dup             
	// 10995 17641:sipush          158
	// 10996 17644:bipush          9
	// 10997 17646:newarray        double[]
	// 10998 17648:dup             
	// 10999 17649:iconst_0        
	// 11000 17650:ldc2w           #2871 <Double 10.9476408D>
	// 11001 17653:dastore         
	// 11002 17654:dup             
	// 11003 17655:iconst_1        
	// 11004 17656:ldc2w           #841 <Double 1.8628107D>
	// 11005 17659:dastore         
	// 11006 17660:dup             
	// 11007 17661:iconst_2        
	// 11008 17662:ldc2w           #2873 <Double -965.9405716D>
	// 11009 17665:dastore         
	// 11010 17666:dup             
	// 11011 17667:iconst_3        
	// 11012 17668:ldc2w           #63  <Double 57.2001287D>
	// 11013 17671:dastore         
	// 11014 17672:dup             
	// 11015 17673:iconst_4        
	// 11016 17674:ldc2w           #65  <Double 8.4126647000000006D>
	// 11017 17677:dastore         
	// 11018 17678:dup             
	// 11019 17679:iconst_5        
	// 11020 17680:ldc2w           #2875 <Double 0.49059910000000001D>
	// 11021 17683:dastore         
	// 11022 17684:dup             
	// 11023 17685:bipush          6
	// 11024 17687:ldc2w           #2877 <Double -6.2402027000000002D>
	// 11025 17690:dastore         
	// 11026 17691:dup             
	// 11027 17692:bipush          7
	// 11028 17694:ldc2w           #2879 <Double -238.85755760000001D>
	// 11029 17697:dastore         
	// 11030 17698:dup             
	// 11031 17699:bipush          8
	// 11032 17701:ldc2w           #73  <Double -0.98049019999999998D>
	// 11033 17704:dastore         
	// 11034 17705:aastore         
	// 11035 17706:dup             
	// 11036 17707:sipush          159
	// 11037 17710:bipush          9
	// 11038 17712:newarray        double[]
	// 11039 17714:dup             
	// 11040 17715:iconst_0        
	// 11041 17716:ldc2w           #2881 <Double 11.247640799999999D>
	// 11042 17719:dastore         
	// 11043 17720:dup             
	// 11044 17721:iconst_1        
	// 11045 17722:ldc2w           #841 <Double 1.8628107D>
	// 11046 17725:dastore         
	// 11047 17726:dup             
	// 11048 17727:iconst_2        
	// 11049 17728:ldc2w           #2883 <Double -997.02900390000002D>
	// 11050 17731:dastore         
	// 11051 17732:dup             
	// 11052 17733:iconst_3        
	// 11053 17734:ldc2w           #345 <Double 68.407805800000006D>
	// 11054 17737:dastore         
	// 11055 17738:dup             
	// 11056 17739:iconst_4        
	// 11057 17740:ldc2w           #347 <Double 8.1813959000000001D>
	// 11058 17743:dastore         
	// 11059 17744:dup             
	// 11060 17745:iconst_5        
	// 11061 17746:ldc2w           #2885 <Double 0.7905991D>
	// 11062 17749:dastore         
	// 11063 17750:dup             
	// 11064 17751:bipush          6
	// 11065 17753:ldc2w           #2887 <Double 1.9182687D>
	// 11066 17756:dastore         
	// 11067 17757:dup             
	// 11068 17758:bipush          7
	// 11069 17760:ldc2w           #2889 <Double -436.05803270000001D>
	// 11070 17763:dastore         
	// 11071 17764:dup             
	// 11072 17765:bipush          8
	// 11073 17767:ldc2w           #355 <Double -1.1049982D>
	// 11074 17770:dastore         
	// 11075 17771:aastore         
	// 11076 17772:dup             
	// 11077 17773:sipush          160
	// 11078 17776:aload           73
	// 11079 17778:aastore         
	// 11080 17779:dup             
	// 11081 17780:sipush          161
	// 11082 17783:bipush          9
	// 11083 17785:newarray        double[]
	// 11084 17787:dup             
	// 11085 17788:iconst_0        
	// 11086 17789:ldc2w           #2891 <Double 11.847640800000001D>
	// 11087 17792:dastore         
	// 11088 17793:dup             
	// 11089 17794:iconst_1        
	// 11090 17795:ldc2w           #841 <Double 1.8628107D>
	// 11091 17798:dastore         
	// 11092 17799:dup             
	// 11093 17800:iconst_2        
	// 11094 17801:ldc2w           #2893 <Double -1059.2058684000001D>
	// 11095 17804:dastore         
	// 11096 17805:dup             
	// 11097 17806:iconst_3        
	// 11098 17807:ldc2w           #95  <Double 94.497482399999996D>
	// 11099 17810:dastore         
	// 11100 17811:dup             
	// 11101 17812:iconst_4        
	// 11102 17813:ldc2w           #97  <Double 7.5234689000000001D>
	// 11103 17816:dastore         
	// 11104 17817:dup             
	// 11105 17818:iconst_5        
	// 11106 17819:ldc2w           #2895 <Double 1.3905991D>
	// 11107 17822:dastore         
	// 11108 17823:dup             
	// 11109 17824:bipush          6
	// 11110 17826:ldc2w           #2897 <Double 16.156674299999999D>
	// 11111 17829:dastore         
	// 11112 17830:dup             
	// 11113 17831:bipush          7
	// 11114 17833:ldc2w           #2899 <Double -849.7774885D>
	// 11115 17836:dastore         
	// 11116 17837:dup             
	// 11117 17838:bipush          8
	// 11118 17840:ldc2w           #105 <Double -1.3163339000000001D>
	// 11119 17843:dastore         
	// 11120 17844:aastore         
	// 11121 17845:dup             
	// 11122 17846:sipush          162
	// 11123 17849:aload           74
	// 11124 17851:aastore         
	// 11125 17852:dup             
	// 11126 17853:sipush          163
	// 11127 17856:aload           75
	// 11128 17858:aastore         
	// 11129 17859:dup             
	// 11130 17860:sipush          164
	// 11131 17863:bipush          9
	// 11132 17865:newarray        double[]
	// 11133 17867:dup             
	// 11134 17868:iconst_0        
	// 11135 17869:ldc2w           #2901 <Double 12.747640799999999D>
	// 11136 17872:dastore         
	// 11137 17873:dup             
	// 11138 17874:iconst_1        
	// 11139 17875:ldc2w           #841 <Double 1.8628107D>
	// 11140 17878:dastore         
	// 11141 17879:dup             
	// 11142 17880:iconst_2        
	// 11143 17881:ldc2w           #2903 <Double -1152.4711651D>
	// 11144 17884:dastore         
	// 11145 17885:dup             
	// 11146 17886:iconst_3        
	// 11147 17887:ldc2w           #463 <Double 148.1152635D>
	// 11148 17890:dastore         
	// 11149 17891:dup             
	// 11150 17892:iconst_4        
	// 11151 17893:ldc2w           #465 <Double 5.7586041999999997D>
	// 11152 17896:dastore         
	// 11153 17897:dup             
	// 11154 17898:iconst_5        
	// 11155 17899:ldc2w           #2905 <Double 2.2905991000000001D>
	// 11156 17902:dastore         
	// 11157 17903:dup             
	// 11158 17904:bipush          6
	// 11159 17906:ldc2w           #2907 <Double 24.7382265D>
	// 11160 17909:dastore         
	// 11161 17910:dup             
	// 11162 17911:bipush          7
	// 11163 17913:ldc2w           #2909 <Double -1203.3864653000001D>
	// 11164 17916:dastore         
	// 11165 17917:dup             
	// 11166 17918:bipush          8
	// 11167 17920:ldc2w           #473 <Double -1.5229775000000001D>
	// 11168 17923:dastore         
	// 11169 17924:aastore         
	// 11170 17925:dup             
	// 11171 17926:sipush          165
	// 11172 17929:aload           76
	// 11173 17931:aastore         
	// 11174 17932:dup             
	// 11175 17933:sipush          166
	// 11176 17936:bipush          9
	// 11177 17938:newarray        double[]
	// 11178 17940:dup             
	// 11179 17941:iconst_0        
	// 11180 17942:ldc2w           #2911 <Double 13.347640800000001D>
	// 11181 17945:dastore         
	// 11182 17946:dup             
	// 11183 17947:iconst_1        
	// 11184 17948:ldc2w           #841 <Double 1.8628107D>
	// 11185 17951:dastore         
	// 11186 17952:dup             
	// 11187 17953:iconst_2        
	// 11188 17954:ldc2w           #2913 <Double -1214.6480296D>
	// 11189 17957:dastore         
	// 11190 17958:dup             
	// 11191 17959:iconst_3        
	// 11192 17960:ldc2w           #265 <Double 200.29154579999999D>
	// 11193 17963:dastore         
	// 11194 17964:dup             
	// 11195 17965:iconst_4        
	// 11196 17966:ldc2w           #267 <Double 3.6574485999999999D>
	// 11197 17969:dastore         
	// 11198 17970:dup             
	// 11199 17971:iconst_5        
	// 11200 17972:ldc2w           #2915 <Double 2.8905991000000002D>
	// 11201 17975:dastore         
	// 11202 17976:dup             
	// 11203 17977:bipush          6
	// 11204 17979:ldc2w           #2917 <Double 20.095115199999999D>
	// 11205 17982:dastore         
	// 11206 17983:dup             
	// 11207 17984:bipush          7
	// 11208 17986:ldc2w           #2919 <Double -1071.7566953D>
	// 11209 17989:dastore         
	// 11210 17990:dup             
	// 11211 17991:bipush          8
	// 11212 17993:ldc2w           #275 <Double -1.5784544D>
	// 11213 17996:dastore         
	// 11214 17997:aastore         
	// 11215 17998:dup             
	// 11216 17999:sipush          167
	// 11217 18002:bipush          9
	// 11218 18004:newarray        double[]
	// 11219 18006:dup             
	// 11220 18007:iconst_0        
	// 11221 18008:ldc2w           #2921 <Double 13.6476408D>
	// 11222 18011:dastore         
	// 11223 18012:dup             
	// 11224 18013:iconst_1        
	// 11225 18014:ldc2w           #841 <Double 1.8628107D>
	// 11226 18017:dastore         
	// 11227 18018:dup             
	// 11228 18019:iconst_2        
	// 11229 18020:ldc2w           #2923 <Double -1245.7364617999999D>
	// 11230 18023:dastore         
	// 11231 18024:dup             
	// 11232 18025:iconst_3        
	// 11233 18026:ldc2w           #159 <Double 234.27778710000001D>
	// 11234 18029:dastore         
	// 11235 18030:dup             
	// 11236 18031:iconst_4        
	// 11237 18032:ldc2w           #161 <Double 2.1401053000000001D>
	// 11238 18035:dastore         
	// 11239 18036:dup             
	// 11240 18037:iconst_5        
	// 11241 18038:ldc2w           #2925 <Double 3.1905991D>
	// 11242 18041:dastore         
	// 11243 18042:dup             
	// 11244 18043:bipush          6
	// 11245 18045:ldc2w           #2927 <Double 15.3975151D>
	// 11246 18048:dastore         
	// 11247 18049:dup             
	// 11248 18050:bipush          7
	// 11249 18052:ldc2w           #2929 <Double -890.94581249999999D>
	// 11250 18055:dastore         
	// 11251 18056:dup             
	// 11252 18057:bipush          8
	// 11253 18059:ldc2w           #169 <Double -1.5803442000000001D>
	// 11254 18062:dastore         
	// 11255 18063:aastore         
	// 11256 18064:dup             
	// 11257 18065:sipush          168
	// 11258 18068:bipush          9
	// 11259 18070:newarray        double[]
	// 11260 18072:dup             
	// 11261 18073:iconst_0        
	// 11262 18074:ldc2w           #2931 <Double 13.9476408D>
	// 11263 18077:dastore         
	// 11264 18078:dup             
	// 11265 18079:iconst_1        
	// 11266 18080:ldc2w           #841 <Double 1.8628107D>
	// 11267 18083:dastore         
	// 11268 18084:dup             
	// 11269 18085:iconst_2        
	// 11270 18086:ldc2w           #2933 <Double -1276.8248940999999D>
	// 11271 18089:dastore         
	// 11272 18090:dup             
	// 11273 18091:iconst_3        
	// 11274 18092:ldc2w           #175 <Double 275.7268449D>
	// 11275 18095:dastore         
	// 11276 18096:dup             
	// 11277 18097:iconst_4        
	// 11278 18098:ldc2w           #177 <Double 0.1651599D>
	// 11279 18101:dastore         
	// 11280 18102:dup             
	// 11281 18103:iconst_5        
	// 11282 18104:ldc2w           #2935 <Double 3.4905990999999998D>
	// 11283 18107:dastore         
	// 11284 18108:dup             
	// 11285 18109:bipush          6
	// 11286 18111:ldc2w           #2937 <Double 9.8386782999999998D>
	// 11287 18114:dastore         
	// 11288 18115:dup             
	// 11289 18116:bipush          7
	// 11290 18118:ldc2w           #2939 <Double -655.09478960000001D>
	// 11291 18121:dastore         
	// 11292 18122:dup             
	// 11293 18123:bipush          8
	// 11294 18125:ldc2w           #185 <Double -1.5649227999999999D>
	// 11295 18128:dastore         
	// 11296 18129:aastore         
	// 11297 18130:dup             
	// 11298 18131:sipush          169
	// 11299 18134:aload           77
	// 11300 18136:aastore         
	// 11301 18137:dup             
	// 11302 18138:sipush          170
	// 11303 18141:aload           78
	// 11304 18143:aastore         
	// 11305 18144:dup             
	// 11306 18145:sipush          171
	// 11307 18148:bipush          9
	// 11308 18150:newarray        double[]
	// 11309 18152:dup             
	// 11310 18153:iconst_0        
	// 11311 18154:ldc2w           #2941 <Double 14.1144778D>
	// 11312 18157:dastore         
	// 11313 18158:dup             
	// 11314 18159:iconst_1        
	// 11315 18160:ldc2w           #933 <Double 1.9715174D>
	// 11316 18163:dastore         
	// 11317 18164:dup             
	// 11318 18165:iconst_2        
	// 11319 18166:ldc2w           #2943 <Double -1266.3088279000001D>
	// 11320 18169:dastore         
	// 11321 18170:dup             
	// 11322 18171:iconst_3        
	// 11323 18172:ldc2w           #209 <Double 3.0597946D>
	// 11324 18175:dastore         
	// 11325 18176:dup             
	// 11326 18177:iconst_4        
	// 11327 18178:ldc2w           #211 <Double 8.9830009000000004D>
	// 11328 18181:dastore         
	// 11329 18182:dup             
	// 11330 18183:iconst_5        
	// 11331 18184:ldc2w           #2945 <Double -1.3179449999999999D>
	// 11332 18187:dastore         
	// 11333 18188:dup             
	// 11334 18189:bipush          6
	// 11335 18191:ldc2w           #2947 <Double -31.5800248D>
	// 11336 18194:dastore         
	// 11337 18195:dup             
	// 11338 18196:bipush          7
	// 11339 18198:ldc2w           #2949 <Double 286.52123410000002D>
	// 11340 18201:dastore         
	// 11341 18202:dup             
	// 11342 18203:bipush          8
	// 11343 18205:ldc2w           #219 <Double -0.062199999999999998D>
	// 11344 18208:dastore         
	// 11345 18209:aastore         
	// 11346 18210:dup             
	// 11347 18211:sipush          172
	// 11348 18214:aload           79
	// 11349 18216:aastore         
	// 11350 18217:dup             
	// 11351 18218:sipush          173
	// 11352 18221:bipush          9
	// 11353 18223:newarray        double[]
	// 11354 18225:dup             
	// 11355 18226:iconst_0        
	// 11356 18227:ldc2w           #2951 <Double 14.714477799999999D>
	// 11357 18230:dastore         
	// 11358 18231:dup             
	// 11359 18232:iconst_1        
	// 11360 18233:ldc2w           #933 <Double 1.9715174D>
	// 11361 18236:dastore         
	// 11362 18237:dup             
	// 11363 18238:iconst_2        
	// 11364 18239:ldc2w           #2953 <Double -1329.1379323000001D>
	// 11365 18242:dastore         
	// 11366 18243:dup             
	// 11367 18244:iconst_3        
	// 11368 18245:ldc2w           #15  <Double 19.625597299999999D>
	// 11369 18248:dastore         
	// 11370 18249:dup             
	// 11371 18250:iconst_4        
	// 11372 18251:ldc2w           #17  <Double 8.9143979000000009D>
	// 11373 18254:dastore         
	// 11374 18255:dup             
	// 11375 18256:iconst_5        
	// 11376 18257:ldc2w           #2955 <Double -0.71794500000000006D>
	// 11377 18260:dastore         
	// 11378 18261:dup             
	// 11379 18262:bipush          6
	// 11380 18264:ldc2w           #2957 <Double -30.4404684D>
	// 11381 18267:dastore         
	// 11382 18268:dup             
	// 11383 18269:bipush          7
	// 11384 18271:ldc2w           #2959 <Double 218.39797239999999D>
	// 11385 18274:dastore         
	// 11386 18275:dup             
	// 11387 18276:bipush          8
	// 11388 18278:ldc2w           #25  <Double -0.38996530000000001D>
	// 11389 18281:dastore         
	// 11390 18282:aastore         
	// 11391 18283:dup             
	// 11392 18284:sipush          174
	// 11393 18287:bipush          9
	// 11394 18289:newarray        double[]
	// 11395 18291:dup             
	// 11396 18292:iconst_0        
	// 11397 18293:ldc2w           #2961 <Double 15.0144778D>
	// 11398 18296:dastore         
	// 11399 18297:dup             
	// 11400 18298:iconst_1        
	// 11401 18299:ldc2w           #933 <Double 1.9715174D>
	// 11402 18302:dastore         
	// 11403 18303:dup             
	// 11404 18304:iconst_2        
	// 11405 18305:ldc2w           #2963 <Double -1360.5524846000001D>
	// 11406 18308:dastore         
	// 11407 18309:dup             
	// 11408 18310:iconst_3        
	// 11409 18311:ldc2w           #31  <Double 28.2628214D>
	// 11410 18314:dastore         
	// 11411 18315:dup             
	// 11412 18316:iconst_4        
	// 11413 18317:ldc2w           #33  <Double 8.8398648000000009D>
	// 11414 18320:dastore         
	// 11415 18321:dup             
	// 11416 18322:iconst_5        
	// 11417 18323:ldc2w           #2965 <Double -0.41794500000000001D>
	// 11418 18326:dastore         
	// 11419 18327:dup             
	// 11420 18328:bipush          6
	// 11421 18330:ldc2w           #2967 <Double -26.6564224D>
	// 11422 18333:dastore         
	// 11423 18334:dup             
	// 11424 18335:bipush          7
	// 11425 18337:ldc2w           #2969 <Double 155.69188539999999D>
	// 11426 18340:dastore         
	// 11427 18341:dup             
	// 11428 18342:bipush          8
	// 11429 18344:ldc2w           #41  <Double -0.54830319999999999D>
	// 11430 18347:dastore         
	// 11431 18348:aastore         
	// 11432 18349:dup             
	// 11433 18350:sipush          175
	// 11434 18353:bipush          9
	// 11435 18355:newarray        double[]
	// 11436 18357:dup             
	// 11437 18358:iconst_0        
	// 11438 18359:ldc2w           #2971 <Double 15.314477800000001D>
	// 11439 18362:dastore         
	// 11440 18363:dup             
	// 11441 18364:iconst_1        
	// 11442 18365:ldc2w           #933 <Double 1.9715174D>
	// 11443 18368:dastore         
	// 11444 18369:dup             
	// 11445 18370:iconst_2        
	// 11446 18371:ldc2w           #2973 <Double -1391.9670368D>
	// 11447 18374:dastore         
	// 11448 18375:dup             
	// 11449 18376:iconst_3        
	// 11450 18377:ldc2w           #47  <Double 37.305238799999998D>
	// 11451 18380:dastore         
	// 11452 18381:dup             
	// 11453 18382:iconst_4        
	// 11454 18383:ldc2w           #49  <Double 8.7346948999999992D>
	// 11455 18386:dastore         
	// 11456 18387:dup             
	// 11457 18388:iconst_5        
	// 11458 18389:ldc2w           #2975 <Double -0.11794499999999999D>
	// 11459 18392:dastore         
	// 11460 18393:dup             
	// 11461 18394:bipush          6
	// 11462 18396:ldc2w           #2977 <Double -20.9973572D>
	// 11463 18399:dastore         
	// 11464 18400:dup             
	// 11465 18401:bipush          7
	// 11466 18403:ldc2w           #2979 <Double 59.8749909D>
	// 11467 18406:dastore         
	// 11468 18407:dup             
	// 11469 18408:bipush          8
	// 11470 18410:ldc2w           #57  <Double -0.70060560000000005D>
	// 11471 18413:dastore         
	// 11472 18414:aastore         
	// 11473 18415:dup             
	// 11474 18416:sipush          176
	// 11475 18419:bipush          9
	// 11476 18421:newarray        double[]
	// 11477 18423:dup             
	// 11478 18424:iconst_0        
	// 11479 18425:ldc2w           #2981 <Double 15.6144778D>
	// 11480 18428:dastore         
	// 11481 18429:dup             
	// 11482 18430:iconst_1        
	// 11483 18431:ldc2w           #933 <Double 1.9715174D>
	// 11484 18434:dastore         
	// 11485 18435:dup             
	// 11486 18436:iconst_2        
	// 11487 18437:ldc2w           #2983 <Double -1423.3815890000001D>
	// 11488 18440:dastore         
	// 11489 18441:dup             
	// 11490 18442:iconst_3        
	// 11491 18443:ldc2w           #541 <Double 46.896400399999997D>
	// 11492 18446:dastore         
	// 11493 18447:dup             
	// 11494 18448:iconst_4        
	// 11495 18449:ldc2w           #543 <Double 8.5943556999999995D>
	// 11496 18452:dastore         
	// 11497 18453:dup             
	// 11498 18454:iconst_5        
	// 11499 18455:ldc2w           #2985 <Double 0.18205499999999999D>
	// 11500 18458:dastore         
	// 11501 18459:dup             
	// 11502 18460:bipush          6
	// 11503 18462:ldc2w           #2987 <Double -13.8997571D>
	// 11504 18465:dastore         
	// 11505 18466:dup             
	// 11506 18467:bipush          7
	// 11507 18469:ldc2w           #2989 <Double -73.901162600000006D>
	// 11508 18472:dastore         
	// 11509 18473:dup             
	// 11510 18474:bipush          8
	// 11511 18476:ldc2w           #551 <Double -0.84519750000000005D>
	// 11512 18479:dastore         
	// 11513 18480:aastore         
	// 11514 18481:dup             
	// 11515 18482:sipush          177
	// 11516 18485:aload           80
	// 11517 18487:aastore         
	// 11518 18488:dup             
	// 11519 18489:sipush          178
	// 11520 18492:bipush          9
	// 11521 18494:newarray        double[]
	// 11522 18496:dup             
	// 11523 18497:iconst_0        
	// 11524 18498:ldc2w           #2991 <Double 16.214477800000001D>
	// 11525 18501:dastore         
	// 11526 18502:dup             
	// 11527 18503:iconst_1        
	// 11528 18504:ldc2w           #933 <Double 1.9715174D>
	// 11529 18507:dastore         
	// 11530 18508:dup             
	// 11531 18509:iconst_2        
	// 11532 18510:ldc2w           #2993 <Double -1486.2106934999999D>
	// 11533 18513:dastore         
	// 11534 18514:dup             
	// 11535 18515:iconst_3        
	// 11536 18516:ldc2w           #345 <Double 68.407805800000006D>
	// 11537 18519:dastore         
	// 11538 18520:dup             
	// 11539 18521:iconst_4        
	// 11540 18522:ldc2w           #347 <Double 8.1813959000000001D>
	// 11541 18525:dastore         
	// 11542 18526:dup             
	// 11543 18527:iconst_5        
	// 11544 18528:ldc2w           #2995 <Double 0.78205499999999994D>
	// 11545 18531:dastore         
	// 11546 18532:dup             
	// 11547 18533:bipush          6
	// 11548 18535:ldc2w           #2997 <Double 2.2175511999999999D>
	// 11549 18538:dastore         
	// 11550 18539:dup             
	// 11551 18540:bipush          7
	// 11552 18542:ldc2w           #2999 <Double -442.17867819999998D>
	// 11553 18545:dastore         
	// 11554 18546:dup             
	// 11555 18547:bipush          8
	// 11556 18549:ldc2w           #355 <Double -1.1049982D>
	// 11557 18552:dastore         
	// 11558 18553:aastore         
	// 11559 18554:dup             
	// 11560 18555:sipush          179
	// 11561 18558:bipush          9
	// 11562 18560:newarray        double[]
	// 11563 18562:dup             
	// 11564 18563:iconst_0        
	// 11565 18564:ldc2w           #3001 <Double 16.514477800000002D>
	// 11566 18567:dastore         
	// 11567 18568:dup             
	// 11568 18569:iconst_1        
	// 11569 18570:ldc2w           #933 <Double 1.9715174D>
	// 11570 18573:dastore         
	// 11571 18574:dup             
	// 11572 18575:iconst_2        
	// 11573 18576:ldc2w           #3003 <Double -1517.6252457000001D>
	// 11574 18579:dastore         
	// 11575 18580:dup             
	// 11576 18581:iconst_3        
	// 11577 18582:ldc2w           #79  <Double 80.747736000000003D>
	// 11578 18585:dastore         
	// 11579 18586:dup             
	// 11580 18587:iconst_4        
	// 11581 18588:ldc2w           #81  <Double 7.8897272999999997D>
	// 11582 18591:dastore         
	// 11583 18592:dup             
	// 11584 18593:iconst_5        
	// 11585 18594:ldc2w           #3005 <Double 1.082055D>
	// 11586 18597:dastore         
	// 11587 18598:dup             
	// 11588 18599:bipush          6
	// 11589 18601:ldc2w           #3007 <Double 9.8945135999999998D>
	// 11590 18604:dastore         
	// 11591 18605:dup             
	// 11592 18606:bipush          7
	// 11593 18608:ldc2w           #3009 <Double -653.30345650000004D>
	// 11594 18611:dastore         
	// 11595 18612:dup             
	// 11596 18613:bipush          8
	// 11597 18615:ldc2w           #89  <Double -1.2173562D>
	// 11598 18618:dastore         
	// 11599 18619:aastore         
	// 11600 18620:dup             
	// 11601 18621:sipush          180
	// 11602 18624:bipush          9
	// 11603 18626:newarray        double[]
	// 11604 18628:dup             
	// 11605 18629:iconst_0        
	// 11606 18630:ldc2w           #3011 <Double 16.814477799999999D>
	// 11607 18633:dastore         
	// 11608 18634:dup             
	// 11609 18635:iconst_1        
	// 11610 18636:ldc2w           #933 <Double 1.9715174D>
	// 11611 18639:dastore         
	// 11612 18640:dup             
	// 11613 18641:iconst_2        
	// 11614 18642:ldc2w           #3013 <Double -1549.0397978999999D>
	// 11615 18645:dastore         
	// 11616 18646:dup             
	// 11617 18647:iconst_3        
	// 11618 18648:ldc2w           #95  <Double 94.497482399999996D>
	// 11619 18651:dastore         
	// 11620 18652:dup             
	// 11621 18653:iconst_4        
	// 11622 18654:ldc2w           #97  <Double 7.5234689000000001D>
	// 11623 18657:dastore         
	// 11624 18658:dup             
	// 11625 18659:iconst_5        
	// 11626 18660:ldc2w           #3015 <Double 1.382055D>
	// 11627 18663:dastore         
	// 11628 18664:dup             
	// 11629 18665:bipush          6
	// 11630 18667:ldc2w           #3017 <Double 16.455956799999999D>
	// 11631 18670:dastore         
	// 11632 18671:dup             
	// 11633 18672:bipush          7
	// 11634 18674:ldc2w           #3019 <Double -857.69382870000004D>
	// 11635 18677:dastore         
	// 11636 18678:dup             
	// 11637 18679:bipush          8
	// 11638 18681:ldc2w           #105 <Double -1.3163339000000001D>
	// 11639 18684:dastore         
	// 11640 18685:aastore         
	// 11641 18686:dup             
	// 11642 18687:sipush          181
	// 11643 18690:aload           81
	// 11644 18692:aastore         
	// 11645 18693:dup             
	// 11646 18694:sipush          182
	// 11647 18697:aload           82
	// 11648 18699:aastore         
	// 11649 18700:dup             
	// 11650 18701:sipush          183
	// 11651 18704:bipush          9
	// 11652 18706:newarray        double[]
	// 11653 18708:dup             
	// 11654 18709:iconst_0        
	// 11655 18710:ldc2w           #3021 <Double 17.714477800000001D>
	// 11656 18713:dastore         
	// 11657 18714:dup             
	// 11658 18715:iconst_1        
	// 11659 18716:ldc2w           #933 <Double 1.9715174D>
	// 11660 18719:dastore         
	// 11661 18720:dup             
	// 11662 18721:iconst_2        
	// 11663 18722:ldc2w           #3023 <Double -1643.2834545999999D>
	// 11664 18725:dastore         
	// 11665 18726:dup             
	// 11666 18727:iconst_3        
	// 11667 18728:ldc2w           #463 <Double 148.1152635D>
	// 11668 18731:dastore         
	// 11669 18732:dup             
	// 11670 18733:iconst_4        
	// 11671 18734:ldc2w           #465 <Double 5.7586041999999997D>
	// 11672 18737:dastore         
	// 11673 18738:dup             
	// 11674 18739:iconst_5        
	// 11675 18740:ldc2w           #3025 <Double 2.2820550000000002D>
	// 11676 18743:dastore         
	// 11677 18744:dup             
	// 11678 18745:bipush          6
	// 11679 18747:ldc2w           #3027 <Double 25.037508899999999D>
	// 11680 18750:dastore         
	// 11681 18751:dup             
	// 11682 18752:bipush          7
	// 11683 18754:ldc2w           #3029 <Double -1213.9963475D>
	// 11684 18757:dastore         
	// 11685 18758:dup             
	// 11686 18759:bipush          8
	// 11687 18761:ldc2w           #473 <Double -1.5229775000000001D>
	// 11688 18764:dastore         
	// 11689 18765:aastore         
	// 11690 18766:dup             
	// 11691 18767:sipush          184
	// 11692 18770:bipush          9
	// 11693 18772:newarray        double[]
	// 11694 18774:dup             
	// 11695 18775:iconst_0        
	// 11696 18776:ldc2w           #3031 <Double 18.014477800000002D>
	// 11697 18779:dastore         
	// 11698 18780:dup             
	// 11699 18781:iconst_1        
	// 11700 18782:ldc2w           #933 <Double 1.9715174D>
	// 11701 18785:dastore         
	// 11702 18786:dup             
	// 11703 18787:iconst_2        
	// 11704 18788:ldc2w           #3033 <Double -1674.6980069000001D>
	// 11705 18791:dastore         
	// 11706 18792:dup             
	// 11707 18793:iconst_3        
	// 11708 18794:ldc2w           #143 <Double 171.99884599999999D>
	// 11709 18797:dastore         
	// 11710 18798:dup             
	// 11711 18799:iconst_4        
	// 11712 18800:ldc2w           #145 <Double 4.8356763999999997D>
	// 11713 18803:dastore         
	// 11714 18804:dup             
	// 11715 18805:iconst_5        
	// 11716 18806:ldc2w           #3035 <Double 2.582055D>
	// 11717 18809:dastore         
	// 11718 18810:dup             
	// 11719 18811:bipush          6
	// 11720 18813:ldc2w           #3037 <Double 23.653462900000001D>
	// 11721 18816:dastore         
	// 11722 18817:dup             
	// 11723 18818:bipush          7
	// 11724 18820:ldc2w           #3039 <Double -1190.1600023000001D>
	// 11725 18823:dastore         
	// 11726 18824:dup             
	// 11727 18825:bipush          8
	// 11728 18827:ldc2w           #153 <Double -1.5592649999999999D>
	// 11729 18830:dastore         
	// 11730 18831:aastore         
	// 11731 18832:dup             
	// 11732 18833:sipush          185
	// 11733 18836:bipush          9
	// 11734 18838:newarray        double[]
	// 11735 18840:dup             
	// 11736 18841:iconst_0        
	// 11737 18842:ldc2w           #3041 <Double 18.314477799999999D>
	// 11738 18845:dastore         
	// 11739 18846:dup             
	// 11740 18847:iconst_1        
	// 11741 18848:ldc2w           #933 <Double 1.9715174D>
	// 11742 18851:dastore         
	// 11743 18852:dup             
	// 11744 18853:iconst_2        
	// 11745 18854:ldc2w           #3043 <Double -1706.1125591D>
	// 11746 18857:dastore         
	// 11747 18858:dup             
	// 11748 18859:iconst_3        
	// 11749 18860:ldc2w           #265 <Double 200.29154579999999D>
	// 11750 18863:dastore         
	// 11751 18864:dup             
	// 11752 18865:iconst_4        
	// 11753 18866:ldc2w           #267 <Double 3.6574485999999999D>
	// 11754 18869:dastore         
	// 11755 18870:dup             
	// 11756 18871:iconst_5        
	// 11757 18872:ldc2w           #3045 <Double 2.8820549999999998D>
	// 11758 18875:dastore         
	// 11759 18876:dup             
	// 11760 18877:bipush          6
	// 11761 18879:ldc2w           #3047 <Double 20.394397699999999D>
	// 11762 18882:dastore         
	// 11763 18883:dup             
	// 11764 18884:bipush          7
	// 11765 18886:ldc2w           #3049 <Double -1084.1622723D>
	// 11766 18889:dastore         
	// 11767 18890:dup             
	// 11768 18891:bipush          8
	// 11769 18893:ldc2w           #275 <Double -1.5784544D>
	// 11770 18896:dastore         
	// 11771 18897:aastore         
	// 11772 18898:dup             
	// 11773 18899:sipush          186
	// 11774 18902:bipush          9
	// 11775 18904:newarray        double[]
	// 11776 18906:dup             
	// 11777 18907:iconst_0        
	// 11778 18908:ldc2w           #3051 <Double 18.6144778D>
	// 11779 18911:dastore         
	// 11780 18912:dup             
	// 11781 18913:iconst_1        
	// 11782 18914:ldc2w           #933 <Double 1.9715174D>
	// 11783 18917:dastore         
	// 11784 18918:dup             
	// 11785 18919:iconst_2        
	// 11786 18920:ldc2w           #3053 <Double -1737.5271112999999D>
	// 11787 18923:dastore         
	// 11788 18924:dup             
	// 11789 18925:iconst_3        
	// 11790 18926:ldc2w           #159 <Double 234.27778710000001D>
	// 11791 18929:dastore         
	// 11792 18930:dup             
	// 11793 18931:iconst_4        
	// 11794 18932:ldc2w           #161 <Double 2.1401053000000001D>
	// 11795 18935:dastore         
	// 11796 18936:dup             
	// 11797 18937:iconst_5        
	// 11798 18938:ldc2w           #3055 <Double 3.1820550000000001D>
	// 11799 18941:dastore         
	// 11800 18942:dup             
	// 11801 18943:bipush          6
	// 11802 18945:ldc2w           #3057 <Double 15.6967976D>
	// 11803 18948:dastore         
	// 11804 18949:dup             
	// 11805 18950:bipush          7
	// 11806 18952:ldc2w           #3059 <Double -904.24923690000003D>
	// 11807 18955:dastore         
	// 11808 18956:dup             
	// 11809 18957:bipush          8
	// 11810 18959:ldc2w           #169 <Double -1.5803442000000001D>
	// 11811 18962:dastore         
	// 11812 18963:aastore         
	// 11813 18964:dup             
	// 11814 18965:sipush          187
	// 11815 18968:bipush          9
	// 11816 18970:newarray        double[]
	// 11817 18972:dup             
	// 11818 18973:iconst_0        
	// 11819 18974:ldc2w           #3061 <Double 18.9144778D>
	// 11820 18977:dastore         
	// 11821 18978:dup             
	// 11822 18979:iconst_1        
	// 11823 18980:ldc2w           #933 <Double 1.9715174D>
	// 11824 18983:dastore         
	// 11825 18984:dup             
	// 11826 18985:iconst_2        
	// 11827 18986:ldc2w           #3063 <Double -1768.9416635D>
	// 11828 18989:dastore         
	// 11829 18990:dup             
	// 11830 18991:iconst_3        
	// 11831 18992:ldc2w           #175 <Double 275.7268449D>
	// 11832 18995:dastore         
	// 11833 18996:dup             
	// 11834 18997:iconst_4        
	// 11835 18998:ldc2w           #177 <Double 0.1651599D>
	// 11836 19001:dastore         
	// 11837 19002:dup             
	// 11838 19003:iconst_5        
	// 11839 19004:ldc2w           #3065 <Double 3.4820549999999999D>
	// 11840 19007:dastore         
	// 11841 19008:dup             
	// 11842 19009:bipush          6
	// 11843 19011:ldc2w           #3067 <Double 10.1379608D>
	// 11844 19014:dastore         
	// 11845 19015:dup             
	// 11846 19016:bipush          7
	// 11847 19018:ldc2w           #3069 <Double -669.29606130000002D>
	// 11848 19021:dastore         
	// 11849 19022:dup             
	// 11850 19023:bipush          8
	// 11851 19025:ldc2w           #185 <Double -1.5649227999999999D>
	// 11852 19028:dastore         
	// 11853 19029:aastore         
	// 11854 19030:dup             
	// 11855 19031:sipush          188
	// 11856 19034:bipush          9
	// 11857 19036:newarray        double[]
	// 11858 19038:dup             
	// 11859 19039:iconst_0        
	// 11860 19040:ldc2w           #3071 <Double 19.214477800000001D>
	// 11861 19043:dastore         
	// 11862 19044:dup             
	// 11863 19045:iconst_1        
	// 11864 19046:ldc2w           #933 <Double 1.9715174D>
	// 11865 19049:dastore         
	// 11866 19050:dup             
	// 11867 19051:iconst_2        
	// 11868 19052:ldc2w           #3073 <Double -1800.3562158D>
	// 11869 19055:dastore         
	// 11870 19056:dup             
	// 11871 19057:iconst_3        
	// 11872 19058:ldc2w           #291 <Double 327.13300479999998D>
	// 11873 19061:dastore         
	// 11874 19062:dup             
	// 11875 19063:iconst_4        
	// 11876 19064:ldc2w           #293 <Double -2.4385346000000001D>
	// 11877 19067:dastore         
	// 11878 19068:dup             
	// 11879 19069:iconst_5        
	// 11880 19070:ldc2w           #3075 <Double 3.7820550000000002D>
	// 11881 19073:dastore         
	// 11882 19074:dup             
	// 11883 19075:bipush          6
	// 11884 19077:ldc2w           #3077 <Double 4.3794893000000004D>
	// 11885 19080:dastore         
	// 11886 19081:dup             
	// 11887 19082:bipush          7
	// 11888 19084:ldc2w           #3079 <Double -407.63471709999999D>
	// 11889 19087:dastore         
	// 11890 19088:dup             
	// 11891 19089:bipush          8
	// 11892 19091:ldc2w           #301 <Double -1.5323681D>
	// 11893 19094:dastore         
	// 11894 19095:aastore         
	// 11895 19096:dup             
	// 11896 19097:sipush          189
	// 11897 19100:bipush          9
	// 11898 19102:newarray        double[]
	// 11899 19104:dup             
	// 11900 19105:iconst_0        
	// 11901 19106:ldc2w           #3081 <Double 19.514477800000002D>
	// 11902 19109:dastore         
	// 11903 19110:dup             
	// 11904 19111:iconst_1        
	// 11905 19112:ldc2w           #933 <Double 1.9715174D>
	// 11906 19115:dastore         
	// 11907 19116:dup             
	// 11908 19117:iconst_2        
	// 11909 19118:ldc2w           #3083 <Double -1831.7707680000001D>
	// 11910 19121:dastore         
	// 11911 19122:dup             
	// 11912 19123:iconst_3        
	// 11913 19124:ldc2w           #191 <Double 392.10647540000002D>
	// 11914 19127:dastore         
	// 11915 19128:dup             
	// 11916 19129:iconst_4        
	// 11917 19130:ldc2w           #193 <Double -5.9244687000000003D>
	// 11918 19133:dastore         
	// 11919 19134:dup             
	// 11920 19135:iconst_5        
	// 11921 19136:ldc2w           #3085 <Double 4.0820550000000004D>
	// 11922 19139:dastore         
	// 11923 19140:dup             
	// 11924 19141:bipush          6
	// 11925 19143:ldc2w           #3087 <Double -0.89747310000000002D>
	// 11926 19146:dastore         
	// 11927 19147:dup             
	// 11928 19148:bipush          7
	// 11929 19150:ldc2w           #3089 <Double -154.59218749999999D>
	// 11930 19153:dastore         
	// 11931 19154:dup             
	// 11932 19155:bipush          8
	// 11933 19157:ldc2w           #201 <Double -1.4830451D>
	// 11934 19160:dastore         
	// 11935 19161:aastore         
	// 11936 19162:dup             
	// 11937 19163:sipush          190
	// 11938 19166:bipush          9
	// 11939 19168:newarray        double[]
	// 11940 19170:dup             
	// 11941 19171:iconst_0        
	// 11942 19172:ldc2w           #3091 <Double 17.360124800000001D>
	// 11943 19175:dastore         
	// 11944 19176:dup             
	// 11945 19177:iconst_1        
	// 11946 19178:ldc2w           #975 <Double 2.0349358D>
	// 11947 19181:dastore         
	// 11948 19182:dup             
	// 11949 19183:iconst_2        
	// 11950 19184:ldc2w           #3093 <Double -1594.1434873000001D>
	// 11951 19187:dastore         
	// 11952 19188:dup             
	// 11953 19189:iconst_3        
	// 11954 19190:ldc2w           #209 <Double 3.0597946D>
	// 11955 19193:dastore         
	// 11956 19194:dup             
	// 11957 19195:iconst_4        
	// 11958 19196:ldc2w           #211 <Double 8.9830009000000004D>
	// 11959 19199:dastore         
	// 11960 19200:dup             
	// 11961 19201:iconst_5        
	// 11962 19202:ldc2w           #3095 <Double -1.3406815000000001D>
	// 11963 19205:dastore         
	// 11964 19206:dup             
	// 11965 19207:bipush          6
	// 11966 19209:ldc2w           #3097 <Double -31.283757600000001D>
	// 11967 19212:dastore         
	// 11968 19213:dup             
	// 11969 19214:bipush          7
	// 11970 19216:ldc2w           #3099 <Double 288.1527509D>
	// 11971 19219:dastore         
	// 11972 19220:dup             
	// 11973 19221:bipush          8
	// 11974 19223:ldc2w           #219 <Double -0.062199999999999998D>
	// 11975 19226:dastore         
	// 11976 19227:aastore         
	// 11977 19228:dup             
	// 11978 19229:sipush          191
	// 11979 19232:bipush          9
	// 11980 19234:newarray        double[]
	// 11981 19236:dup             
	// 11982 19237:iconst_0        
	// 11983 19238:ldc2w           #3101 <Double 17.660124799999998D>
	// 11984 19241:dastore         
	// 11985 19242:dup             
	// 11986 19243:iconst_1        
	// 11987 19244:ldc2w           #975 <Double 2.0349358D>
	// 11988 19247:dastore         
	// 11989 19248:dup             
	// 11990 19249:iconst_2        
	// 11991 19250:ldc2w           #3103 <Double -1625.7482947999999D>
	// 11992 19253:dastore         
	// 11993 19254:dup             
	// 11994 19255:iconst_3        
	// 11995 19256:ldc2w           #319 <Double 11.2644424D>
	// 11996 19259:dastore         
	// 11997 19260:dup             
	// 11998 19261:iconst_4        
	// 11999 19262:ldc2w           #321 <Double 8.9614528999999994D>
	// 12000 19265:dastore         
	// 12001 19266:dup             
	// 12002 19267:iconst_5        
	// 12003 19268:ldc2w           #3105 <Double -1.0406815D>
	// 12004 19271:dastore         
	// 12005 19272:dup             
	// 12006 19273:bipush          6
	// 12007 19275:ldc2w           #3107 <Double -31.800283499999999D>
	// 12008 19278:dastore         
	// 12009 19279:dup             
	// 12010 19280:bipush          7
	// 12011 19282:ldc2w           #3109 <Double 258.54142869999998D>
	// 12012 19285:dastore         
	// 12013 19286:dup             
	// 12014 19287:bipush          8
	// 12015 19289:ldc2w           #329 <Double -0.22733419999999999D>
	// 12016 19292:dastore         
	// 12017 19293:aastore         
	// 12018 19294:dup             
	// 12019 19295:sipush          192
	// 12020 19298:aload           83
	// 12021 19300:aastore         
	// 12022 19301:dup             
	// 12023 19302:sipush          193
	// 12024 19305:aload           84
	// 12025 19307:aastore         
	// 12026 19308:dup             
	// 12027 19309:sipush          194
	// 12028 19312:bipush          9
	// 12029 19314:newarray        double[]
	// 12030 19316:dup             
	// 12031 19317:iconst_0        
	// 12032 19318:ldc2w           #3111 <Double 18.560124800000001D>
	// 12033 19321:dastore         
	// 12034 19322:dup             
	// 12035 19323:iconst_1        
	// 12036 19324:ldc2w           #975 <Double 2.0349358D>
	// 12037 19327:dastore         
	// 12038 19328:dup             
	// 12039 19329:iconst_2        
	// 12040 19330:ldc2w           #3113 <Double -1720.562717D>
	// 12041 19333:dastore         
	// 12042 19334:dup             
	// 12043 19335:iconst_3        
	// 12044 19336:ldc2w           #47  <Double 37.305238799999998D>
	// 12045 19339:dastore         
	// 12046 19340:dup             
	// 12047 19341:iconst_4        
	// 12048 19342:ldc2w           #49  <Double 8.7346948999999992D>
	// 12049 19345:dastore         
	// 12050 19346:dup             
	// 12051 19347:iconst_5        
	// 12052 19348:ldc2w           #3115 <Double -0.14068149999999999D>
	// 12053 19351:dastore         
	// 12054 19352:dup             
	// 12055 19353:bipush          6
	// 12056 19355:ldc2w           #3117 <Double -20.701089899999999D>
	// 12057 19358:dastore         
	// 12058 19359:dup             
	// 12059 19360:bipush          7
	// 12060 19362:ldc2w           #3119 <Double 57.951300799999999D>
	// 12061 19365:dastore         
	// 12062 19366:dup             
	// 12063 19367:bipush          8
	// 12064 19369:ldc2w           #57  <Double -0.70060560000000005D>
	// 12065 19372:dastore         
	// 12066 19373:aastore         
	// 12067 19374:dup             
	// 12068 19375:sipush          195
	// 12069 19378:bipush          9
	// 12070 19380:newarray        double[]
	// 12071 19382:dup             
	// 12072 19383:iconst_0        
	// 12073 19384:ldc2w           #3121 <Double 18.860124800000001D>
	// 12074 19387:dastore         
	// 12075 19388:dup             
	// 12076 19389:iconst_1        
	// 12077 19390:ldc2w           #975 <Double 2.0349358D>
	// 12078 19393:dastore         
	// 12079 19394:dup             
	// 12080 19395:iconst_2        
	// 12081 19396:ldc2w           #3123 <Double -1752.1675244999999D>
	// 12082 19399:dastore         
	// 12083 19400:dup             
	// 12084 19401:iconst_3        
	// 12085 19402:ldc2w           #541 <Double 46.896400399999997D>
	// 12086 19405:dastore         
	// 12087 19406:dup             
	// 12088 19407:iconst_4        
	// 12089 19408:ldc2w           #543 <Double 8.5943556999999995D>
	// 12090 19411:dastore         
	// 12091 19412:dup             
	// 12092 19413:iconst_5        
	// 12093 19414:ldc2w           #3125 <Double 0.1593185D>
	// 12094 19417:dastore         
	// 12095 19418:dup             
	// 12096 19419:bipush          6
	// 12097 19421:ldc2w           #3127 <Double -13.6034898D>
	// 12098 19424:dastore         
	// 12099 19425:dup             
	// 12100 19426:bipush          7
	// 12101 19428:ldc2w           #3129 <Double -76.713654500000004D>
	// 12102 19431:dastore         
	// 12103 19432:dup             
	// 12104 19433:bipush          8
	// 12105 19435:ldc2w           #551 <Double -0.84519750000000005D>
	// 12106 19438:dastore         
	// 12107 19439:aastore         
	// 12108 19440:dup             
	// 12109 19441:sipush          196
	// 12110 19444:bipush          9
	// 12111 19446:newarray        double[]
	// 12112 19448:dup             
	// 12113 19449:iconst_0        
	// 12114 19450:ldc2w           #3131 <Double 19.160124799999998D>
	// 12115 19453:dastore         
	// 12116 19454:dup             
	// 12117 19455:iconst_1        
	// 12118 19456:ldc2w           #975 <Double 2.0349358D>
	// 12119 19459:dastore         
	// 12120 19460:dup             
	// 12121 19461:iconst_2        
	// 12122 19462:ldc2w           #3133 <Double -1783.7723318999999D>
	// 12123 19465:dastore         
	// 12124 19466:dup             
	// 12125 19467:iconst_3        
	// 12126 19468:ldc2w           #63  <Double 57.2001287D>
	// 12127 19471:dastore         
	// 12128 19472:dup             
	// 12129 19473:iconst_4        
	// 12130 19474:ldc2w           #65  <Double 8.4126647000000006D>
	// 12131 19477:dastore         
	// 12132 19478:dup             
	// 12133 19479:iconst_5        
	// 12134 19480:ldc2w           #3135 <Double 0.45931850000000002D>
	// 12135 19483:dastore         
	// 12136 19484:dup             
	// 12137 19485:bipush          6
	// 12138 19487:ldc2w           #3137 <Double -5.6446529999999999D>
	// 12139 19490:dastore         
	// 12140 19491:dup             
	// 12141 19492:bipush          7
	// 12142 19494:ldc2w           #3139 <Double -247.7816493D>
	// 12143 19497:dastore         
	// 12144 19498:dup             
	// 12145 19499:bipush          8
	// 12146 19501:ldc2w           #73  <Double -0.98049019999999998D>
	// 12147 19504:dastore         
	// 12148 19505:aastore         
	// 12149 19506:dup             
	// 12150 19507:sipush          197
	// 12151 19510:bipush          9
	// 12152 19512:newarray        double[]
	// 12153 19514:dup             
	// 12154 19515:iconst_0        
	// 12155 19516:ldc2w           #3141 <Double 19.460124799999999D>
	// 12156 19519:dastore         
	// 12157 19520:dup             
	// 12158 19521:iconst_1        
	// 12159 19522:ldc2w           #975 <Double 2.0349358D>
	// 12160 19525:dastore         
	// 12161 19526:dup             
	// 12162 19527:iconst_2        
	// 12163 19528:ldc2w           #3143 <Double -1815.3771393D>
	// 12164 19531:dastore         
	// 12165 19532:dup             
	// 12166 19533:iconst_3        
	// 12167 19534:ldc2w           #345 <Double 68.407805800000006D>
	// 12168 19537:dastore         
	// 12169 19538:dup             
	// 12170 19539:iconst_4        
	// 12171 19540:ldc2w           #347 <Double 8.1813959000000001D>
	// 12172 19543:dastore         
	// 12173 19544:dup             
	// 12174 19545:iconst_5        
	// 12175 19546:ldc2w           #3145 <Double 0.75931850000000001D>
	// 12176 19549:dastore         
	// 12177 19550:dup             
	// 12178 19551:bipush          6
	// 12179 19553:ldc2w           #3147 <Double 2.5138183999999999D>
	// 12180 19556:dastore         
	// 12181 19557:dup             
	// 12182 19558:bipush          7
	// 12183 19560:ldc2w           #3149 <Double -446.76877339999999D>
	// 12184 19563:dastore         
	// 12185 19564:dup             
	// 12186 19565:bipush          8
	// 12187 19567:ldc2w           #355 <Double -1.1049982D>
	// 12188 19570:dastore         
	// 12189 19571:aastore         
	// 12190 19572:dup             
	// 12191 19573:sipush          198
	// 12192 19576:bipush          9
	// 12193 19578:newarray        double[]
	// 12194 19580:dup             
	// 12195 19581:iconst_0        
	// 12196 19582:ldc2w           #3151 <Double 19.7601248D>
	// 12197 19585:dastore         
	// 12198 19586:dup             
	// 12199 19587:iconst_1        
	// 12200 19588:ldc2w           #975 <Double 2.0349358D>
	// 12201 19591:dastore         
	// 12202 19592:dup             
	// 12203 19593:iconst_2        
	// 12204 19594:ldc2w           #3153 <Double -1846.9819467D>
	// 12205 19597:dastore         
	// 12206 19598:dup             
	// 12207 19599:iconst_3        
	// 12208 19600:ldc2w           #79  <Double 80.747736000000003D>
	// 12209 19603:dastore         
	// 12210 19604:dup             
	// 12211 19605:iconst_4        
	// 12212 19606:ldc2w           #81  <Double 7.8897272999999997D>
	// 12213 19609:dastore         
	// 12214 19610:dup             
	// 12215 19611:iconst_5        
	// 12216 19612:ldc2w           #3155 <Double 1.0593185000000001D>
	// 12217 19615:dastore         
	// 12218 19616:dup             
	// 12219 19617:bipush          6
	// 12220 19619:ldc2w           #3157 <Double 10.190780800000001D>
	// 12221 19622:dastore         
	// 12222 19623:dup             
	// 12223 19624:bipush          7
	// 12224 19626:ldc2w           #3159 <Double -658.7823535D>
	// 12225 19629:dastore         
	// 12226 19630:dup             
	// 12227 19631:bipush          8
	// 12228 19633:ldc2w           #89  <Double -1.2173562D>
	// 12229 19636:dastore         
	// 12230 19637:aastore         
	// 12231 19638:dup             
	// 12232 19639:sipush          199
	// 12233 19642:aload           85
	// 12234 19644:aastore         
	// 12235 19645:dup             
	// 12236 19646:sipush          200
	// 12237 19649:bipush          9
	// 12238 19651:newarray        double[]
	// 12239 19653:dup             
	// 12240 19654:iconst_0        
	// 12241 19655:ldc2w           #3161 <Double 20.360124800000001D>
	// 12242 19658:dastore         
	// 12243 19659:dup             
	// 12244 19660:iconst_1        
	// 12245 19661:ldc2w           #975 <Double 2.0349358D>
	// 12246 19664:dastore         
	// 12247 19665:dup             
	// 12248 19666:iconst_2        
	// 12249 19667:ldc2w           #3163 <Double -1910.1915616000001D>
	// 12250 19670:dastore         
	// 12251 19671:dup             
	// 12252 19672:iconst_3        
	// 12253 19673:ldc2w           #111 <Double 110.00047410000001D>
	// 12254 19676:dastore         
	// 12255 19677:dup             
	// 12256 19678:iconst_4        
	// 12257 19679:ldc2w           #113 <Double 7.0639795000000003D>
	// 12258 19682:dastore         
	// 12259 19683:dup             
	// 12260 19684:iconst_5        
	// 12261 19685:ldc2w           #3165 <Double 1.6593184999999999D>
	// 12262 19688:dastore         
	// 12263 19689:dup             
	// 12264 19690:bipush          6
	// 12265 19692:ldc2w           #3167 <Double 21.673332599999998D>
	// 12266 19695:dastore         
	// 12267 19696:dup             
	// 12268 19697:bipush          7
	// 12269 19699:ldc2w           #3169 <Double -1040.3805600000001D>
	// 12270 19702:dastore         
	// 12271 19703:dup             
	// 12272 19704:bipush          8
	// 12273 19706:ldc2w           #121 <Double -1.4008494D>
	// 12274 19709:dastore         
	// 12275 19710:aastore         
	// 12276 19711:dup             
	// 12277 19712:sipush          201
	// 12278 19715:aload           86
	// 12279 19717:aastore         
	// 12280 19718:dup             
	// 12281 19719:sipush          202
	// 12282 19722:aload           87
	// 12283 19724:aastore         
	// 12284 19725:dup             
	// 12285 19726:sipush          203
	// 12286 19729:bipush          9
	// 12287 19731:newarray        double[]
	// 12288 19733:dup             
	// 12289 19734:iconst_0        
	// 12290 19735:ldc2w           #3171 <Double 21.2601248D>
	// 12291 19738:dastore         
	// 12292 19739:dup             
	// 12293 19740:iconst_1        
	// 12294 19741:ldc2w           #975 <Double 2.0349358D>
	// 12295 19744:dastore         
	// 12296 19745:dup             
	// 12297 19746:iconst_2        
	// 12298 19747:ldc2w           #3173 <Double -2005.0059838D>
	// 12299 19750:dastore         
	// 12300 19751:dup             
	// 12301 19752:iconst_3        
	// 12302 19753:ldc2w           #143 <Double 171.99884599999999D>
	// 12303 19756:dastore         
	// 12304 19757:dup             
	// 12305 19758:iconst_4        
	// 12306 19759:ldc2w           #145 <Double 4.8356763999999997D>
	// 12307 19762:dastore         
	// 12308 19763:dup             
	// 12309 19764:iconst_5        
	// 12310 19765:ldc2w           #3175 <Double 2.5593184999999998D>
	// 12311 19768:dastore         
	// 12312 19769:dup             
	// 12313 19770:bipush          6
	// 12314 19772:ldc2w           #3177 <Double 23.949730200000001D>
	// 12315 19775:dastore         
	// 12316 19776:dup             
	// 12317 19777:bipush          7
	// 12318 19779:ldc2w           #3179 <Double -1200.0829080000001D>
	// 12319 19782:dastore         
	// 12320 19783:dup             
	// 12321 19784:bipush          8
	// 12322 19786:ldc2w           #153 <Double -1.5592649999999999D>
	// 12323 19789:dastore         
	// 12324 19790:aastore         
	// 12325 19791:dup             
	// 12326 19792:sipush          204
	// 12327 19795:bipush          9
	// 12328 19797:newarray        double[]
	// 12329 19799:dup             
	// 12330 19800:iconst_0        
	// 12331 19801:ldc2w           #3181 <Double 21.560124800000001D>
	// 12332 19804:dastore         
	// 12333 19805:dup             
	// 12334 19806:iconst_1        
	// 12335 19807:ldc2w           #975 <Double 2.0349358D>
	// 12336 19810:dastore         
	// 12337 19811:dup             
	// 12338 19812:iconst_2        
	// 12339 19813:ldc2w           #3183 <Double -2036.6107913000001D>
	// 12340 19816:dastore         
	// 12341 19817:dup             
	// 12342 19818:iconst_3        
	// 12343 19819:ldc2w           #265 <Double 200.29154579999999D>
	// 12344 19822:dastore         
	// 12345 19823:dup             
	// 12346 19824:iconst_4        
	// 12347 19825:ldc2w           #267 <Double 3.6574485999999999D>
	// 12348 19828:dastore         
	// 12349 19829:dup             
	// 12350 19830:iconst_5        
	// 12351 19831:ldc2w           #3185 <Double 2.8593185000000001D>
	// 12352 19834:dastore         
	// 12353 19835:dup             
	// 12354 19836:bipush          6
	// 12355 19838:ldc2w           #3187 <Double 20.690664900000002D>
	// 12356 19841:dastore         
	// 12357 19842:dup             
	// 12358 19843:bipush          7
	// 12359 19845:ldc2w           #3189 <Double -1094.9739797D>
	// 12360 19848:dastore         
	// 12361 19849:dup             
	// 12362 19850:bipush          8
	// 12363 19852:ldc2w           #275 <Double -1.5784544D>
	// 12364 19855:dastore         
	// 12365 19856:aastore         
	// 12366 19857:dup             
	// 12367 19858:sipush          205
	// 12368 19861:aload           88
	// 12369 19863:aastore         
	// 12370 19864:dup             
	// 12371 19865:sipush          206
	// 12372 19868:bipush          9
	// 12373 19870:newarray        double[]
	// 12374 19872:dup             
	// 12375 19873:iconst_0        
	// 12376 19874:ldc2w           #3191 <Double 22.160124799999998D>
	// 12377 19877:dastore         
	// 12378 19878:dup             
	// 12379 19879:iconst_1        
	// 12380 19880:ldc2w           #975 <Double 2.0349358D>
	// 12381 19883:dastore         
	// 12382 19884:dup             
	// 12383 19885:iconst_2        
	// 12384 19886:ldc2w           #3193 <Double -2099.8204061000001D>
	// 12385 19889:dastore         
	// 12386 19890:dup             
	// 12387 19891:iconst_3        
	// 12388 19892:ldc2w           #175 <Double 275.7268449D>
	// 12389 19895:dastore         
	// 12390 19896:dup             
	// 12391 19897:iconst_4        
	// 12392 19898:ldc2w           #177 <Double 0.1651599D>
	// 12393 19901:dastore         
	// 12394 19902:dup             
	// 12395 19903:iconst_5        
	// 12396 19904:ldc2w           #3195 <Double 3.4593185000000002D>
	// 12397 19907:dastore         
	// 12398 19908:dup             
	// 12399 19909:bipush          6
	// 12400 19911:ldc2w           #3197 <Double 10.434227999999999D>
	// 12401 19914:dastore         
	// 12402 19915:dup             
	// 12403 19916:bipush          7
	// 12404 19918:ldc2w           #3199 <Double -681.88537210000004D>
	// 12405 19921:dastore         
	// 12406 19922:dup             
	// 12407 19923:bipush          8
	// 12408 19925:ldc2w           #185 <Double -1.5649227999999999D>
	// 12409 19928:dastore         
	// 12410 19929:aastore         
	// 12411 19930:dup             
	// 12412 19931:sipush          207
	// 12413 19934:aload           89
	// 12414 19936:aastore         
	// 12415 19937:dup             
	// 12416 19938:sipush          208
	// 12417 19941:aload           90
	// 12418 19943:aastore         
	// 12419 19944:dup             
	// 12420 19945:sipush          209
	// 12421 19948:bipush          9
	// 12422 19950:newarray        double[]
	// 12423 19952:dup             
	// 12424 19953:iconst_0        
	// 12425 19954:ldc2w           #3201 <Double 18.693020000000001D>
	// 12426 19957:dastore         
	// 12427 19958:dup             
	// 12428 19959:iconst_1        
	// 12429 19960:ldc2w           #1057 <Double 2.1002652999999998D>
	// 12430 19963:dastore         
	// 12431 19964:dup             
	// 12432 19965:iconst_2        
	// 12433 19966:ldc2w           #3203 <Double -1732.8007089D>
	// 12434 19969:dastore         
	// 12435 19970:dup             
	// 12436 19971:iconst_3        
	// 12437 19972:ldc2w           #209 <Double 3.0597946D>
	// 12438 19975:dastore         
	// 12439 19976:dup             
	// 12440 19977:iconst_4        
	// 12441 19978:ldc2w           #211 <Double 8.9830009000000004D>
	// 12442 19981:dastore         
	// 12443 19982:dup             
	// 12444 19983:iconst_5        
	// 12445 19984:ldc2w           #3205 <Double -1.2405596999999999D>
	// 12446 19987:dastore         
	// 12447 19988:dup             
	// 12448 19989:bipush          6
	// 12449 19991:ldc2w           #3207 <Double -30.942058100000001D>
	// 12450 19994:dastore         
	// 12451 19995:dup             
	// 12452 19996:bipush          7
	// 12453 19998:ldc2w           #3209 <Double 276.9371337D>
	// 12454 20001:dastore         
	// 12455 20002:dup             
	// 12456 20003:bipush          8
	// 12457 20005:ldc2w           #219 <Double -0.062199999999999998D>
	// 12458 20008:dastore         
	// 12459 20009:aastore         
	// 12460 20010:dup             
	// 12461 20011:sipush          210
	// 12462 20014:aload           91
	// 12463 20016:aastore         
	// 12464 20017:dup             
	// 12465 20018:sipush          211
	// 12466 20021:aload           92
	// 12467 20023:aastore         
	// 12468 20024:dup             
	// 12469 20025:sipush          212
	// 12470 20028:bipush          9
	// 12471 20030:newarray        double[]
	// 12472 20032:dup             
	// 12473 20033:iconst_0        
	// 12474 20034:ldc2w           #3211 <Double 19.593019999999999D>
	// 12475 20037:dastore         
	// 12476 20038:dup             
	// 12477 20039:iconst_1        
	// 12478 20040:ldc2w           #1057 <Double 2.1002652999999998D>
	// 12479 20043:dastore         
	// 12480 20044:dup             
	// 12481 20045:iconst_2        
	// 12482 20046:ldc2w           #3213 <Double -1828.2030961999999D>
	// 12483 20049:dastore         
	// 12484 20050:dup             
	// 12485 20051:iconst_3        
	// 12486 20052:ldc2w           #31  <Double 28.2628214D>
	// 12487 20055:dastore         
	// 12488 20056:dup             
	// 12489 20057:iconst_4        
	// 12490 20058:ldc2w           #33  <Double 8.8398648000000009D>
	// 12491 20061:dastore         
	// 12492 20062:dup             
	// 12493 20063:iconst_5        
	// 12494 20064:ldc2w           #3215 <Double -0.34055970000000002D>
	// 12495 20067:dastore         
	// 12496 20068:dup             
	// 12497 20069:bipush          6
	// 12498 20071:ldc2w           #3217 <Double -26.018455599999999D>
	// 12499 20074:dastore         
	// 12500 20075:dup             
	// 12501 20076:bipush          7
	// 12502 20078:ldc2w           #3219 <Double 140.366084D>
	// 12503 20081:dastore         
	// 12504 20082:dup             
	// 12505 20083:bipush          8
	// 12506 20085:ldc2w           #41  <Double -0.54830319999999999D>
	// 12507 20088:dastore         
	// 12508 20089:aastore         
	// 12509 20090:dup             
	// 12510 20091:sipush          213
	// 12511 20094:aload           93
	// 12512 20096:aastore         
	// 12513 20097:dup             
	// 12514 20098:sipush          214
	// 12515 20101:aload           94
	// 12516 20103:aastore         
	// 12517 20104:dup             
	// 12518 20105:sipush          215
	// 12519 20108:bipush          9
	// 12520 20110:newarray        double[]
	// 12521 20112:dup             
	// 12522 20113:iconst_0        
	// 12523 20114:ldc2w           #3221 <Double 20.493020000000001D>
	// 12524 20117:dastore         
	// 12525 20118:dup             
	// 12526 20119:iconst_1        
	// 12527 20120:ldc2w           #1057 <Double 2.1002652999999998D>
	// 12528 20123:dastore         
	// 12529 20124:dup             
	// 12530 20125:iconst_2        
	// 12531 20126:ldc2w           #3223 <Double -1923.6054835D>
	// 12532 20129:dastore         
	// 12533 20130:dup             
	// 12534 20131:iconst_3        
	// 12535 20132:ldc2w           #63  <Double 57.2001287D>
	// 12536 20135:dastore         
	// 12537 20136:dup             
	// 12538 20137:iconst_4        
	// 12539 20138:ldc2w           #65  <Double 8.4126647000000006D>
	// 12540 20141:dastore         
	// 12541 20142:dup             
	// 12542 20143:iconst_5        
	// 12543 20144:ldc2w           #3225 <Double 0.5594403D>
	// 12544 20147:dastore         
	// 12545 20148:dup             
	// 12546 20149:bipush          6
	// 12547 20151:ldc2w           #3227 <Double -5.3029535000000001D>
	// 12548 20154:dastore         
	// 12549 20155:dup             
	// 12550 20156:bipush          7
	// 12551 20158:ldc2w           #3229 <Double -265.14785810000001D>
	// 12552 20161:dastore         
	// 12553 20162:dup             
	// 12554 20163:bipush          8
	// 12555 20165:ldc2w           #73  <Double -0.98049019999999998D>
	// 12556 20168:dastore         
	// 12557 20169:aastore         
	// 12558 20170:dup             
	// 12559 20171:sipush          216
	// 12560 20174:bipush          9
	// 12561 20176:newarray        double[]
	// 12562 20178:dup             
	// 12563 20179:iconst_0        
	// 12564 20180:ldc2w           #3231 <Double 20.793019999999999D>
	// 12565 20183:dastore         
	// 12566 20184:dup             
	// 12567 20185:iconst_1        
	// 12568 20186:ldc2w           #1057 <Double 2.1002652999999998D>
	// 12569 20189:dastore         
	// 12570 20190:dup             
	// 12571 20191:iconst_2        
	// 12572 20192:ldc2w           #3233 <Double -1955.4062792D>
	// 12573 20195:dastore         
	// 12574 20196:dup             
	// 12575 20197:iconst_3        
	// 12576 20198:ldc2w           #345 <Double 68.407805800000006D>
	// 12577 20201:dastore         
	// 12578 20202:dup             
	// 12579 20203:iconst_4        
	// 12580 20204:ldc2w           #347 <Double 8.1813959000000001D>
	// 12581 20207:dastore         
	// 12582 20208:dup             
	// 12583 20209:iconst_5        
	// 12584 20210:ldc2w           #3235 <Double 0.85944030000000005D>
	// 12585 20213:dastore         
	// 12586 20214:dup             
	// 12587 20215:bipush          6
	// 12588 20217:ldc2w           #3237 <Double 2.8555179000000002D>
	// 12589 20220:dastore         
	// 12590 20221:dup             
	// 12591 20222:bipush          7
	// 12592 20224:ldc2w           #3239 <Double -465.1600808D>
	// 12593 20227:dastore         
	// 12594 20228:dup             
	// 12595 20229:bipush          8
	// 12596 20231:ldc2w           #355 <Double -1.1049982D>
	// 12597 20234:dastore         
	// 12598 20235:aastore         
	// 12599 20236:dup             
	// 12600 20237:sipush          217
	// 12601 20240:aload           95
	// 12602 20242:aastore         
	// 12603 20243:dup             
	// 12604 20244:sipush          218
	// 12605 20247:aload           96
	// 12606 20249:aastore         
	// 12607 20250:dup             
	// 12608 20251:sipush          219
	// 12609 20254:bipush          9
	// 12610 20256:newarray        double[]
	// 12611 20258:dup             
	// 12612 20259:iconst_0        
	// 12613 20260:ldc2w           #3241 <Double 21.693020000000001D>
	// 12614 20263:dastore         
	// 12615 20264:dup             
	// 12616 20265:iconst_1        
	// 12617 20266:ldc2w           #1057 <Double 2.1002652999999998D>
	// 12618 20269:dastore         
	// 12619 20270:dup             
	// 12620 20271:iconst_2        
	// 12621 20272:ldc2w           #3243 <Double -2050.8086665000001D>
	// 12622 20275:dastore         
	// 12623 20276:dup             
	// 12624 20277:iconst_3        
	// 12625 20278:ldc2w           #111 <Double 110.00047410000001D>
	// 12626 20281:dastore         
	// 12627 20282:dup             
	// 12628 20283:iconst_4        
	// 12629 20284:ldc2w           #113 <Double 7.0639795000000003D>
	// 12630 20287:dastore         
	// 12631 20288:dup             
	// 12632 20289:iconst_5        
	// 12633 20290:ldc2w           #3245 <Double 1.7594403000000001D>
	// 12634 20293:dastore         
	// 12635 20294:dup             
	// 12636 20295:bipush          6
	// 12637 20297:ldc2w           #3247 <Double 22.015032099999999D>
	// 12638 20300:dastore         
	// 12639 20301:dup             
	// 12640 20302:bipush          7
	// 12641 20304:ldc2w           #3249 <Double -1061.8471631D>
	// 12642 20307:dastore         
	// 12643 20308:dup             
	// 12644 20309:bipush          8
	// 12645 20311:ldc2w           #121 <Double -1.4008494D>
	// 12646 20314:dastore         
	// 12647 20315:aastore         
	// 12648 20316:dup             
	// 12649 20317:sipush          220
	// 12650 20320:bipush          9
	// 12651 20322:newarray        double[]
	// 12652 20324:dup             
	// 12653 20325:iconst_0        
	// 12654 20326:ldc2w           #3251 <Double 21.993020000000001D>
	// 12655 20329:dastore         
	// 12656 20330:dup             
	// 12657 20331:iconst_1        
	// 12658 20332:ldc2w           #1057 <Double 2.1002652999999998D>
	// 12659 20335:dastore         
	// 12660 20336:dup             
	// 12661 20337:iconst_2        
	// 12662 20338:ldc2w           #3253 <Double -2082.6094622999999D>
	// 12663 20341:dastore         
	// 12664 20342:dup             
	// 12665 20343:iconst_3        
	// 12666 20344:ldc2w           #127 <Double 127.6888198D>
	// 12667 20347:dastore         
	// 12668 20348:dup             
	// 12669 20349:iconst_4        
	// 12670 20350:ldc2w           #129 <Double 6.4866308999999998D>
	// 12671 20353:dastore         
	// 12672 20354:dup             
	// 12673 20355:iconst_5        
	// 12674 20356:ldc2w           #3255 <Double 2.0594402999999999D>
	// 12675 20359:dastore         
	// 12676 20360:dup             
	// 12677 20361:bipush          6
	// 12678 20363:ldc2w           #3257 <Double 24.931557999999999D>
	// 12679 20366:dastore         
	// 12680 20367:dup             
	// 12681 20368:bipush          7
	// 12682 20370:ldc2w           #3259 <Double -1188.5254407D>
	// 12683 20373:dastore         
	// 12684 20374:dup             
	// 12685 20375:bipush          8
	// 12686 20377:ldc2w           #137 <Double -1.4699811D>
	// 12687 20380:dastore         
	// 12688 20381:aastore         
	// 12689 20382:dup             
	// 12690 20383:sipush          221
	// 12691 20386:aload           97
	// 12692 20388:aastore         
	// 12693 20389:dup             
	// 12694 20390:sipush          222
	// 12695 20393:bipush          9
	// 12696 20395:newarray        double[]
	// 12697 20397:dup             
	// 12698 20398:iconst_0        
	// 12699 20399:ldc2w           #3261 <Double 22.593019999999999D>
	// 12700 20402:dastore         
	// 12701 20403:dup             
	// 12702 20404:iconst_1        
	// 12703 20405:ldc2w           #1057 <Double 2.1002652999999998D>
	// 12704 20408:dastore         
	// 12705 20409:dup             
	// 12706 20410:iconst_2        
	// 12707 20411:ldc2w           #3263 <Double -2146.2110538000002D>
	// 12708 20414:dastore         
	// 12709 20415:dup             
	// 12710 20416:iconst_3        
	// 12711 20417:ldc2w           #143 <Double 171.99884599999999D>
	// 12712 20420:dastore         
	// 12713 20421:dup             
	// 12714 20422:iconst_4        
	// 12715 20423:ldc2w           #145 <Double 4.8356763999999997D>
	// 12716 20426:dastore         
	// 12717 20427:dup             
	// 12718 20428:iconst_5        
	// 12719 20429:ldc2w           #3265 <Double 2.6594403D>
	// 12720 20432:dastore         
	// 12721 20433:dup             
	// 12722 20434:bipush          6
	// 12723 20436:ldc2w           #3267 <Double 24.291429699999998D>
	// 12724 20439:dastore         
	// 12725 20440:dup             
	// 12726 20441:bipush          7
	// 12727 20443:ldc2w           #3269 <Double -1224.6248069999999D>
	// 12728 20446:dastore         
	// 12729 20447:dup             
	// 12730 20448:bipush          8
	// 12731 20450:ldc2w           #153 <Double -1.5592649999999999D>
	// 12732 20453:dastore         
	// 12733 20454:aastore         
	// 12734 20455:dup             
	// 12735 20456:sipush          223
	// 12736 20459:bipush          9
	// 12737 20461:newarray        double[]
	// 12738 20463:dup             
	// 12739 20464:iconst_0        
	// 12740 20465:ldc2w           #3271 <Double 22.89302D>
	// 12741 20468:dastore         
	// 12742 20469:dup             
	// 12743 20470:iconst_1        
	// 12744 20471:ldc2w           #1057 <Double 2.1002652999999998D>
	// 12745 20474:dastore         
	// 12746 20475:dup             
	// 12747 20476:iconst_2        
	// 12748 20477:ldc2w           #3273 <Double -2178.0118495000002D>
	// 12749 20480:dastore         
	// 12750 20481:dup             
	// 12751 20482:iconst_3        
	// 12752 20483:ldc2w           #265 <Double 200.29154579999999D>
	// 12753 20486:dastore         
	// 12754 20487:dup             
	// 12755 20488:iconst_4        
	// 12756 20489:ldc2w           #267 <Double 3.6574485999999999D>
	// 12757 20492:dastore         
	// 12758 20493:dup             
	// 12759 20494:iconst_5        
	// 12760 20495:ldc2w           #3275 <Double 2.9594402999999998D>
	// 12761 20498:dastore         
	// 12762 20499:dup             
	// 12763 20500:bipush          6
	// 12764 20502:ldc2w           #3277 <Double 21.0323645D>
	// 12765 20505:dastore         
	// 12766 20506:dup             
	// 12767 20507:bipush          7
	// 12768 20509:ldc2w           #3279 <Double -1120.5409772999999D>
	// 12769 20512:dastore         
	// 12770 20513:dup             
	// 12771 20514:bipush          8
	// 12772 20516:ldc2w           #275 <Double -1.5784544D>
	// 12773 20519:dastore         
	// 12774 20520:aastore         
	// 12775 20521:dup             
	// 12776 20522:sipush          224
	// 12777 20525:aload           98
	// 12778 20527:aastore         
	// 12779 20528:dup             
	// 12780 20529:sipush          225
	// 12781 20532:aload           99
	// 12782 20534:aastore         
	// 12783 20535:dup             
	// 12784 20536:sipush          226
	// 12785 20539:bipush          9
	// 12786 20541:newarray        double[]
	// 12787 20543:dup             
	// 12788 20544:iconst_0        
	// 12789 20545:ldc2w           #3281 <Double 23.793019999999999D>
	// 12790 20548:dastore         
	// 12791 20549:dup             
	// 12792 20550:iconst_1        
	// 12793 20551:ldc2w           #1057 <Double 2.1002652999999998D>
	// 12794 20554:dastore         
	// 12795 20555:dup             
	// 12796 20556:iconst_2        
	// 12797 20557:ldc2w           #3283 <Double -2273.4142367999998D>
	// 12798 20560:dastore         
	// 12799 20561:dup             
	// 12800 20562:iconst_3        
	// 12801 20563:ldc2w           #291 <Double 327.13300479999998D>
	// 12802 20566:dastore         
	// 12803 20567:dup             
	// 12804 20568:iconst_4        
	// 12805 20569:ldc2w           #293 <Double -2.4385346000000001D>
	// 12806 20572:dastore         
	// 12807 20573:dup             
	// 12808 20574:iconst_5        
	// 12809 20575:ldc2w           #3285 <Double 3.8594403000000002D>
	// 12810 20578:dastore         
	// 12811 20579:dup             
	// 12812 20580:bipush          6
	// 12813 20582:ldc2w           #3287 <Double 5.0174561000000004D>
	// 12814 20585:dastore         
	// 12815 20586:dup             
	// 12816 20587:bipush          7
	// 12817 20589:ldc2w           #3289 <Double -449.75512300000003D>
	// 12818 20592:dastore         
	// 12819 20593:dup             
	// 12820 20594:bipush          8
	// 12821 20596:ldc2w           #301 <Double -1.5323681D>
	// 12822 20599:dastore         
	// 12823 20600:aastore         
	// 12824 20601:dup             
	// 12825 20602:sipush          227
	// 12826 20605:aload           100
	// 12827 20607:aastore         
	// 12828 20608:dup             
	// 12829 20609:sipush          228
	// 12830 20612:aload           101
	// 12831 20614:aastore         
	// 12832 20615:dup             
	// 12833 20616:sipush          229
	// 12834 20619:aload           102
	// 12835 20621:aastore         
	// 12836 20622:dup             
	// 12837 20623:sipush          230
	// 12838 20626:bipush          9
	// 12839 20628:newarray        double[]
	// 12840 20630:dup             
	// 12841 20631:iconst_0        
	// 12842 20632:ldc2w           #3291 <Double 18.544829100000001D>
	// 12843 20635:dastore         
	// 12844 20636:dup             
	// 12845 20637:iconst_1        
	// 12846 20638:ldc2w           #1159 <Double 2.1292100999999999D>
	// 12847 20641:dastore         
	// 12848 20642:dup             
	// 12849 20643:iconst_2        
	// 12850 20644:ldc2w           #3293 <Double -1716.4535469D>
	// 12851 20647:dastore         
	// 12852 20648:dup             
	// 12853 20649:iconst_3        
	// 12854 20650:ldc2w           #15  <Double 19.625597299999999D>
	// 12855 20653:dastore         
	// 12856 20654:dup             
	// 12857 20655:iconst_4        
	// 12858 20656:ldc2w           #17  <Double 8.9143979000000009D>
	// 12859 20659:dastore         
	// 12860 20660:dup             
	// 12861 20661:iconst_5        
	// 12862 20662:ldc2w           #3295 <Double -0.62056690000000003D>
	// 12863 20665:dastore         
	// 12864 20666:dup             
	// 12865 20667:bipush          6
	// 12866 20669:ldc2w           #3297 <Double -29.541985199999999D>
	// 12867 20672:dastore         
	// 12868 20673:dup             
	// 12869 20674:bipush          7
	// 12870 20676:ldc2w           #3299 <Double 200.70817959999999D>
	// 12871 20679:dastore         
	// 12872 20680:dup             
	// 12873 20681:bipush          8
	// 12874 20683:ldc2w           #25  <Double -0.38996530000000001D>
	// 12875 20686:dastore         
	// 12876 20687:aastore         
	// 12877 20688:dup             
	// 12878 20689:sipush          231
	// 12879 20692:aload           103
	// 12880 20694:aastore         
	// 12881 20695:dup             
	// 12882 20696:sipush          232
	// 12883 20699:bipush          9
	// 12884 20701:newarray        double[]
	// 12885 20703:dup             
	// 12886 20704:iconst_0        
	// 12887 20705:ldc2w           #3301 <Double 19.144829099999999D>
	// 12888 20708:dastore         
	// 12889 20709:dup             
	// 12890 20710:iconst_1        
	// 12891 20711:ldc2w           #1159 <Double 2.1292100999999999D>
	// 12892 20714:dastore         
	// 12893 20715:dup             
	// 12894 20716:iconst_2        
	// 12895 20717:ldc2w           #3303 <Double -1780.2288077999999D>
	// 12896 20720:dastore         
	// 12897 20721:dup             
	// 12898 20722:iconst_3        
	// 12899 20723:ldc2w           #47  <Double 37.305238799999998D>
	// 12900 20726:dastore         
	// 12901 20727:dup             
	// 12902 20728:iconst_4        
	// 12903 20729:ldc2w           #49  <Double 8.7346948999999992D>
	// 12904 20732:dastore         
	// 12905 20733:dup             
	// 12906 20734:iconst_5        
	// 12907 20735:ldc2w           #3305 <Double -0.020566899999999999D>
	// 12908 20738:dastore         
	// 12909 20739:dup             
	// 12910 20740:bipush          6
	// 12911 20742:ldc2w           #3307 <Double -20.098873999999999D>
	// 12912 20745:dastore         
	// 12913 20746:dup             
	// 12914 20747:bipush          7
	// 12915 20749:ldc2w           #3309 <Double 36.794299100000003D>
	// 12916 20752:dastore         
	// 12917 20753:dup             
	// 12918 20754:bipush          8
	// 12919 20756:ldc2w           #57  <Double -0.70060560000000005D>
	// 12920 20759:dastore         
	// 12921 20760:aastore         
	// 12922 20761:dup             
	// 12923 20762:sipush          233
	// 12924 20765:bipush          9
	// 12925 20767:newarray        double[]
	// 12926 20769:dup             
	// 12927 20770:iconst_0        
	// 12928 20771:ldc2w           #3311 <Double 19.4448291D>
	// 12929 20774:dastore         
	// 12930 20775:dup             
	// 12931 20776:iconst_1        
	// 12932 20777:ldc2w           #1159 <Double 2.1292100999999999D>
	// 12933 20780:dastore         
	// 12934 20781:dup             
	// 12935 20782:iconst_2        
	// 12936 20783:ldc2w           #3313 <Double -1812.1164381999999D>
	// 12937 20786:dastore         
	// 12938 20787:dup             
	// 12939 20788:iconst_3        
	// 12940 20789:ldc2w           #541 <Double 46.896400399999997D>
	// 12941 20792:dastore         
	// 12942 20793:dup             
	// 12943 20794:iconst_4        
	// 12944 20795:ldc2w           #543 <Double 8.5943556999999995D>
	// 12945 20798:dastore         
	// 12946 20799:dup             
	// 12947 20800:iconst_5        
	// 12948 20801:ldc2w           #3315 <Double 0.27943309999999999D>
	// 12949 20804:dastore         
	// 12950 20805:dup             
	// 12951 20806:bipush          6
	// 12952 20808:ldc2w           #3317 <Double -13.001273899999999D>
	// 12953 20811:dastore         
	// 12954 20812:dup             
	// 12955 20813:bipush          7
	// 12956 20815:ldc2w           #3319 <Double -99.677304100000001D>
	// 12957 20818:dastore         
	// 12958 20819:dup             
	// 12959 20820:bipush          8
	// 12960 20822:ldc2w           #551 <Double -0.84519750000000005D>
	// 12961 20825:dastore         
	// 12962 20826:aastore         
	// 12963 20827:dup             
	// 12964 20828:sipush          234
	// 12965 20831:bipush          9
	// 12966 20833:newarray        double[]
	// 12967 20835:dup             
	// 12968 20836:iconst_0        
	// 12969 20837:ldc2w           #3321 <Double 19.7448291D>
	// 12970 20840:dastore         
	// 12971 20841:dup             
	// 12972 20842:iconst_1        
	// 12973 20843:ldc2w           #1159 <Double 2.1292100999999999D>
	// 12974 20846:dastore         
	// 12975 20847:dup             
	// 12976 20848:iconst_2        
	// 12977 20849:ldc2w           #3323 <Double -1844.0040687000001D>
	// 12978 20852:dastore         
	// 12979 20853:dup             
	// 12980 20854:iconst_3        
	// 12981 20855:ldc2w           #63  <Double 57.2001287D>
	// 12982 20858:dastore         
	// 12983 20859:dup             
	// 12984 20860:iconst_4        
	// 12985 20861:ldc2w           #65  <Double 8.4126647000000006D>
	// 12986 20864:dastore         
	// 12987 20865:dup             
	// 12988 20866:iconst_5        
	// 12989 20867:ldc2w           #3325 <Double 0.57943310000000003D>
	// 12990 20870:dastore         
	// 12991 20871:dup             
	// 12992 20872:bipush          6
	// 12993 20874:ldc2w           #3327 <Double -5.0424370999999999D>
	// 12994 20877:dastore         
	// 12995 20878:dup             
	// 12996 20879:bipush          7
	// 12997 20881:ldc2w           #3329 <Double -272.5519468D>
	// 12998 20884:dastore         
	// 12999 20885:dup             
	// 13000 20886:bipush          8
	// 13001 20888:ldc2w           #73  <Double -0.98049019999999998D>
	// 13002 20891:dastore         
	// 13003 20892:aastore         
	// 13004 20893:dup             
	// 13005 20894:sipush          235
	// 13006 20897:bipush          9
	// 13007 20899:newarray        double[]
	// 13008 20901:dup             
	// 13009 20902:iconst_0        
	// 13010 20903:ldc2w           #3331 <Double 20.044829100000001D>
	// 13011 20906:dastore         
	// 13012 20907:dup             
	// 13013 20908:iconst_1        
	// 13014 20909:ldc2w           #1159 <Double 2.1292100999999999D>
	// 13015 20912:dastore         
	// 13016 20913:dup             
	// 13017 20914:iconst_2        
	// 13018 20915:ldc2w           #3333 <Double -1875.8916991000001D>
	// 13019 20918:dastore         
	// 13020 20919:dup             
	// 13021 20920:iconst_3        
	// 13022 20921:ldc2w           #345 <Double 68.407805800000006D>
	// 13023 20924:dastore         
	// 13024 20925:dup             
	// 13025 20926:iconst_4        
	// 13026 20927:ldc2w           #347 <Double 8.1813959000000001D>
	// 13027 20930:dastore         
	// 13028 20931:dup             
	// 13029 20932:iconst_5        
	// 13030 20933:ldc2w           #3335 <Double 0.87943309999999997D>
	// 13031 20936:dastore         
	// 13032 20937:dup             
	// 13033 20938:bipush          6
	// 13034 20940:ldc2w           #3337 <Double 3.1160344000000002D>
	// 13035 20943:dastore         
	// 13036 20944:dup             
	// 13037 20945:bipush          7
	// 13038 20947:ldc2w           #3339 <Double -473.34571870000002D>
	// 13039 20950:dastore         
	// 13040 20951:dup             
	// 13041 20952:bipush          8
	// 13042 20954:ldc2w           #355 <Double -1.1049982D>
	// 13043 20957:dastore         
	// 13044 20958:aastore         
	// 13045 20959:dup             
	// 13046 20960:sipush          236
	// 13047 20963:bipush          9
	// 13048 20965:newarray        double[]
	// 13049 20967:dup             
	// 13050 20968:iconst_0        
	// 13051 20969:ldc2w           #3341 <Double 20.344829099999998D>
	// 13052 20972:dastore         
	// 13053 20973:dup             
	// 13054 20974:iconst_1        
	// 13055 20975:ldc2w           #1159 <Double 2.1292100999999999D>
	// 13056 20978:dastore         
	// 13057 20979:dup             
	// 13058 20980:iconst_2        
	// 13059 20981:ldc2w           #3343 <Double -1907.7793294999999D>
	// 13060 20984:dastore         
	// 13061 20985:dup             
	// 13062 20986:iconst_3        
	// 13063 20987:ldc2w           #79  <Double 80.747736000000003D>
	// 13064 20990:dastore         
	// 13065 20991:dup             
	// 13066 20992:iconst_4        
	// 13067 20993:ldc2w           #81  <Double 7.8897272999999997D>
	// 13068 20996:dastore         
	// 13069 20997:dup             
	// 13070 20998:iconst_5        
	// 13071 20999:ldc2w           #3345 <Double 1.1794331D>
	// 13072 21002:dastore         
	// 13073 21003:dup             
	// 13074 21004:bipush          6
	// 13075 21006:ldc2w           #3347 <Double 10.792996799999999D>
	// 13076 21009:dastore         
	// 13077 21010:dup             
	// 13078 21011:bipush          7
	// 13079 21013:ldc2w           #3349 <Double -687.16594659999998D>
	// 13080 21016:dastore         
	// 13081 21017:dup             
	// 13082 21018:bipush          8
	// 13083 21020:ldc2w           #89  <Double -1.2173562D>
	// 13084 21023:dastore         
	// 13085 21024:aastore         
	// 13086 21025:dup             
	// 13087 21026:sipush          237
	// 13088 21029:bipush          9
	// 13089 21031:newarray        double[]
	// 13090 21033:dup             
	// 13091 21034:iconst_0        
	// 13092 21035:ldc2w           #3351 <Double 20.644829099999999D>
	// 13093 21038:dastore         
	// 13094 21039:dup             
	// 13095 21040:iconst_1        
	// 13096 21041:ldc2w           #1159 <Double 2.1292100999999999D>
	// 13097 21044:dastore         
	// 13098 21045:dup             
	// 13099 21046:iconst_2        
	// 13100 21047:ldc2w           #3353 <Double -1939.66696D>
	// 13101 21050:dastore         
	// 13102 21051:dup             
	// 13103 21052:iconst_3        
	// 13104 21053:ldc2w           #95  <Double 94.497482399999996D>
	// 13105 21056:dastore         
	// 13106 21057:dup             
	// 13107 21058:iconst_4        
	// 13108 21059:ldc2w           #97  <Double 7.5234689000000001D>
	// 13109 21062:dastore         
	// 13110 21063:dup             
	// 13111 21064:iconst_5        
	// 13112 21065:ldc2w           #3355 <Double 1.4794331000000001D>
	// 13113 21068:dastore         
	// 13114 21069:dup             
	// 13115 21070:bipush          6
	// 13116 21072:ldc2w           #3357 <Double 17.35444D>
	// 13117 21075:dastore         
	// 13118 21076:dup             
	// 13119 21077:bipush          7
	// 13120 21079:ldc2w           #3359 <Double -894.25176829999998D>
	// 13121 21082:dastore         
	// 13122 21083:dup             
	// 13123 21084:bipush          8
	// 13124 21086:ldc2w           #105 <Double -1.3163339000000001D>
	// 13125 21089:dastore         
	// 13126 21090:aastore         
	// 13127 21091:dup             
	// 13128 21092:sipush          238
	// 13129 21095:aload           104
	// 13130 21097:aastore         
	// 13131 21098:dup             
	// 13132 21099:sipush          239
	// 13133 21102:aload           105
	// 13134 21104:aastore         
	// 13135 21105:dup             
	// 13136 21106:sipush          240
	// 13137 21109:bipush          9
	// 13138 21111:newarray        double[]
	// 13139 21113:dup             
	// 13140 21114:iconst_0        
	// 13141 21115:ldc2w           #3361 <Double 21.544829100000001D>
	// 13142 21118:dastore         
	// 13143 21119:dup             
	// 13144 21120:iconst_1        
	// 13145 21121:ldc2w           #1159 <Double 2.1292100999999999D>
	// 13146 21124:dastore         
	// 13147 21125:dup             
	// 13148 21126:iconst_2        
	// 13149 21127:ldc2w           #3363 <Double -2035.3298513D>
	// 13150 21130:dastore         
	// 13151 21131:dup             
	// 13152 21132:iconst_3        
	// 13153 21133:ldc2w           #463 <Double 148.1152635D>
	// 13154 21136:dastore         
	// 13155 21137:dup             
	// 13156 21138:iconst_4        
	// 13157 21139:ldc2w           #465 <Double 5.7586041999999997D>
	// 13158 21142:dastore         
	// 13159 21143:dup             
	// 13160 21144:iconst_5        
	// 13161 21145:ldc2w           #3365 <Double 2.3794331D>
	// 13162 21148:dastore         
	// 13163 21149:dup             
	// 13164 21150:bipush          6
	// 13165 21152:ldc2w           #3367 <Double 25.9359921D>
	// 13166 21155:dastore         
	// 13167 21156:dup             
	// 13168 21157:bipush          7
	// 13169 21159:ldc2w           #3369 <Double -1258.6406357999999D>
	// 13170 21162:dastore         
	// 13171 21163:dup             
	// 13172 21164:bipush          8
	// 13173 21166:ldc2w           #473 <Double -1.5229775000000001D>
	// 13174 21169:dastore         
	// 13175 21170:aastore         
	// 13176 21171:dup             
	// 13177 21172:sipush          241
	// 13178 21175:aload           106
	// 13179 21177:aastore         
	// 13180 21178:dup             
	// 13181 21179:sipush          242
	// 13182 21182:bipush          9
	// 13183 21184:newarray        double[]
	// 13184 21186:dup             
	// 13185 21187:iconst_0        
	// 13186 21188:ldc2w           #3371 <Double 22.144829099999999D>
	// 13187 21191:dastore         
	// 13188 21192:dup             
	// 13189 21193:iconst_1        
	// 13190 21194:ldc2w           #1159 <Double 2.1292100999999999D>
	// 13191 21197:dastore         
	// 13192 21198:dup             
	// 13193 21199:iconst_2        
	// 13194 21200:ldc2w           #3373 <Double -2099.1051121999999D>
	// 13195 21203:dastore         
	// 13196 21204:dup             
	// 13197 21205:iconst_3        
	// 13198 21206:ldc2w           #265 <Double 200.29154579999999D>
	// 13199 21209:dastore         
	// 13200 21210:dup             
	// 13201 21211:iconst_4        
	// 13202 21212:ldc2w           #267 <Double 3.6574485999999999D>
	// 13203 21215:dastore         
	// 13204 21216:dup             
	// 13205 21217:iconst_5        
	// 13206 21218:ldc2w           #3375 <Double 2.9794331000000001D>
	// 13207 21221:dastore         
	// 13208 21222:dup             
	// 13209 21223:bipush          6
	// 13210 21225:ldc2w           #3377 <Double 21.2928809D>
	// 13211 21228:dastore         
	// 13212 21229:dup             
	// 13213 21230:bipush          7
	// 13214 21232:ldc2w           #3379 <Double -1134.1974597000001D>
	// 13215 21235:dastore         
	// 13216 21236:dup             
	// 13217 21237:bipush          8
	// 13218 21239:ldc2w           #275 <Double -1.5784544D>
	// 13219 21242:dastore         
	// 13220 21243:aastore         
	// 13221 21244:dup             
	// 13222 21245:sipush          243
	// 13223 21248:bipush          9
	// 13224 21250:newarray        double[]
	// 13225 21252:dup             
	// 13226 21253:iconst_0        
	// 13227 21254:ldc2w           #3381 <Double 22.4448291D>
	// 13228 21257:dastore         
	// 13229 21258:dup             
	// 13230 21259:iconst_1        
	// 13231 21260:ldc2w           #1159 <Double 2.1292100999999999D>
	// 13232 21263:dastore         
	// 13233 21264:dup             
	// 13234 21265:iconst_2        
	// 13235 21266:ldc2w           #3383 <Double -2130.9927425999999D>
	// 13236 21269:dastore         
	// 13237 21270:dup             
	// 13238 21271:iconst_3        
	// 13239 21272:ldc2w           #159 <Double 234.27778710000001D>
	// 13240 21275:dastore         
	// 13241 21276:dup             
	// 13242 21277:iconst_4        
	// 13243 21278:ldc2w           #161 <Double 2.1401053000000001D>
	// 13244 21281:dastore         
	// 13245 21282:dup             
	// 13246 21283:iconst_5        
	// 13247 21284:ldc2w           #3385 <Double 3.2794330999999999D>
	// 13248 21287:dastore         
	// 13249 21288:dup             
	// 13250 21289:bipush          6
	// 13251 21291:ldc2w           #3387 <Double 16.5952807D>
	// 13252 21294:dastore         
	// 13253 21295:dup             
	// 13254 21296:bipush          7
	// 13255 21298:ldc2w           #3389 <Double -956.97987379999995D>
	// 13256 21301:dastore         
	// 13257 21302:dup             
	// 13258 21303:bipush          8
	// 13259 21305:ldc2w           #169 <Double -1.5803442000000001D>
	// 13260 21308:dastore         
	// 13261 21309:aastore         
	// 13262 21310:dup             
	// 13263 21311:sipush          244
	// 13264 21314:aload           107
	// 13265 21316:aastore         
	// 13266 21317:dup             
	// 13267 21318:sipush          245
	// 13268 21321:aload           108
	// 13269 21323:aastore         
	// 13270 21324:dup             
	// 13271 21325:sipush          246
	// 13272 21328:bipush          9
	// 13273 21330:newarray        double[]
	// 13274 21332:dup             
	// 13275 21333:iconst_0        
	// 13276 21334:ldc2w           #3391 <Double 23.344829099999998D>
	// 13277 21337:dastore         
	// 13278 21338:dup             
	// 13279 21339:iconst_1        
	// 13280 21340:ldc2w           #1159 <Double 2.1292100999999999D>
	// 13281 21343:dastore         
	// 13282 21344:dup             
	// 13283 21345:iconst_2        
	// 13284 21346:ldc2w           #3393 <Double -2226.6556338999999D>
	// 13285 21349:dastore         
	// 13286 21350:dup             
	// 13287 21351:iconst_3        
	// 13288 21352:ldc2w           #191 <Double 392.10647540000002D>
	// 13289 21355:dastore         
	// 13290 21356:dup             
	// 13291 21357:iconst_4        
	// 13292 21358:ldc2w           #193 <Double -5.9244687000000003D>
	// 13293 21361:dastore         
	// 13294 21362:dup             
	// 13295 21363:iconst_5        
	// 13296 21364:ldc2w           #3395 <Double 4.1794330999999998D>
	// 13297 21367:dastore         
	// 13298 21368:dup             
	// 13299 21369:bipush          6
	// 13300 21371:ldc2w           #3397 <Double 0.0010101000000000001D>
	// 13301 21374:dastore         
	// 13302 21375:dup             
	// 13303 21376:bipush          7
	// 13304 21378:ldc2w           #3399 <Double -215.4091731D>
	// 13305 21381:dastore         
	// 13306 21382:dup             
	// 13307 21383:bipush          8
	// 13308 21385:ldc2w           #201 <Double -1.4830451D>
	// 13309 21388:dastore         
	// 13310 21389:aastore         
	// 13311 21390:dup             
	// 13312 21391:sipush          247
	// 13313 21394:bipush          9
	// 13314 21396:newarray        double[]
	// 13315 21398:dup             
	// 13316 21399:iconst_0        
	// 13317 21400:ldc2w           #3401 <Double 15.2710638D>
	// 13318 21403:dastore         
	// 13319 21404:dup             
	// 13320 21405:iconst_1        
	// 13321 21406:ldc2w           #1241 <Double 2.2076294999999999D>
	// 13322 21409:dastore         
	// 13323 21410:dup             
	// 13324 21411:iconst_2        
	// 13325 21412:ldc2w           #3403 <Double -1358.6295872000001D>
	// 13326 21415:dastore         
	// 13327 21416:dup             
	// 13328 21417:iconst_3        
	// 13329 21418:ldc2w           #209 <Double 3.0597946D>
	// 13330 21421:dastore         
	// 13331 21422:dup             
	// 13332 21423:iconst_4        
	// 13333 21424:ldc2w           #211 <Double 8.9830009000000004D>
	// 13334 21427:dastore         
	// 13335 21428:dup             
	// 13336 21429:iconst_5        
	// 13337 21430:ldc2w           #3405 <Double -1.2355773999999999D>
	// 13338 21433:dastore         
	// 13339 21434:dup             
	// 13340 21435:bipush          6
	// 13341 21437:ldc2w           #3407 <Double -30.379691000000001D>
	// 13342 21440:dastore         
	// 13343 21441:dup             
	// 13344 21442:bipush          7
	// 13345 21444:ldc2w           #3409 <Double 275.19345340000001D>
	// 13346 21447:dastore         
	// 13347 21448:dup             
	// 13348 21449:bipush          8
	// 13349 21451:ldc2w           #219 <Double -0.062199999999999998D>
	// 13350 21454:dastore         
	// 13351 21455:aastore         
	// 13352 21456:dup             
	// 13353 21457:sipush          248
	// 13354 21460:bipush          9
	// 13355 21462:newarray        double[]
	// 13356 21464:dup             
	// 13357 21465:iconst_0        
	// 13358 21466:ldc2w           #3411 <Double 15.571063799999999D>
	// 13359 21469:dastore         
	// 13360 21470:dup             
	// 13361 21471:iconst_1        
	// 13362 21472:ldc2w           #1241 <Double 2.2076294999999999D>
	// 13363 21475:dastore         
	// 13364 21476:dup             
	// 13365 21477:iconst_2        
	// 13366 21478:ldc2w           #3413 <Double -1390.7524757000001D>
	// 13367 21481:dastore         
	// 13368 21482:dup             
	// 13369 21483:iconst_3        
	// 13370 21484:ldc2w           #319 <Double 11.2644424D>
	// 13371 21487:dastore         
	// 13372 21488:dup             
	// 13373 21489:iconst_4        
	// 13374 21490:ldc2w           #321 <Double 8.9614528999999994D>
	// 13375 21493:dastore         
	// 13376 21494:dup             
	// 13377 21495:iconst_5        
	// 13378 21496:ldc2w           #3415 <Double -0.9355774D>
	// 13379 21499:dastore         
	// 13380 21500:dup             
	// 13381 21501:bipush          6
	// 13382 21503:ldc2w           #3417 <Double -30.896216800000001D>
	// 13383 21506:dastore         
	// 13384 21507:dup             
	// 13385 21508:bipush          7
	// 13386 21510:ldc2w           #3419 <Double 242.86993129999999D>
	// 13387 21513:dastore         
	// 13388 21514:dup             
	// 13389 21515:bipush          8
	// 13390 21517:ldc2w           #329 <Double -0.22733419999999999D>
	// 13391 21520:dastore         
	// 13392 21521:aastore         
	// 13393 21522:dup             
	// 13394 21523:sipush          249
	// 13395 21526:bipush          9
	// 13396 21528:newarray        double[]
	// 13397 21530:dup             
	// 13398 21531:iconst_0        
	// 13399 21532:ldc2w           #3421 <Double 15.8710638D>
	// 13400 21535:dastore         
	// 13401 21536:dup             
	// 13402 21537:iconst_1        
	// 13403 21538:ldc2w           #1241 <Double 2.2076294999999999D>
	// 13404 21541:dastore         
	// 13405 21542:dup             
	// 13406 21543:iconst_2        
	// 13407 21544:ldc2w           #3423 <Double -1422.8753641999999D>
	// 13408 21547:dastore         
	// 13409 21548:dup             
	// 13410 21549:iconst_3        
	// 13411 21550:ldc2w           #15  <Double 19.625597299999999D>
	// 13412 21553:dastore         
	// 13413 21554:dup             
	// 13414 21555:iconst_4        
	// 13415 21556:ldc2w           #17  <Double 8.9143979000000009D>
	// 13416 21559:dastore         
	// 13417 21560:dup             
	// 13418 21561:iconst_5        
	// 13419 21562:ldc2w           #3425 <Double -0.63557739999999996D>
	// 13420 21565:dastore         
	// 13421 21566:dup             
	// 13422 21567:bipush          6
	// 13423 21569:ldc2w           #3427 <Double -29.2401345D>
	// 13424 21572:dastore         
	// 13425 21573:dup             
	// 13426 21574:bipush          7
	// 13427 21576:ldc2w           #3429 <Double 199.86818840000001D>
	// 13428 21579:dastore         
	// 13429 21580:dup             
	// 13430 21581:bipush          8
	// 13431 21583:ldc2w           #25  <Double -0.38996530000000001D>
	// 13432 21586:dastore         
	// 13433 21587:aastore         
	// 13434 21588:dup             
	// 13435 21589:sipush          250
	// 13436 21592:bipush          9
	// 13437 21594:newarray        double[]
	// 13438 21596:dup             
	// 13439 21597:iconst_0        
	// 13440 21598:ldc2w           #3431 <Double 16.171063799999999D>
	// 13441 21601:dastore         
	// 13442 21602:dup             
	// 13443 21603:iconst_1        
	// 13444 21604:ldc2w           #1241 <Double 2.2076294999999999D>
	// 13445 21607:dastore         
	// 13446 21608:dup             
	// 13447 21609:iconst_2        
	// 13448 21610:ldc2w           #3433 <Double -1454.9982527D>
	// 13449 21613:dastore         
	// 13450 21614:dup             
	// 13451 21615:iconst_3        
	// 13452 21616:ldc2w           #31  <Double 28.2628214D>
	// 13453 21619:dastore         
	// 13454 21620:dup             
	// 13455 21621:iconst_4        
	// 13456 21622:ldc2w           #33  <Double 8.8398648000000009D>
	// 13457 21625:dastore         
	// 13458 21626:dup             
	// 13459 21627:iconst_5        
	// 13460 21628:ldc2w           #3435 <Double -0.33557740000000003D>
	// 13461 21631:dastore         
	// 13462 21632:dup             
	// 13463 21633:bipush          6
	// 13464 21635:ldc2w           #3437 <Double -25.4560885D>
	// 13465 21638:dastore         
	// 13466 21639:dup             
	// 13467 21640:bipush          7
	// 13468 21642:ldc2w           #3439 <Double 133.5610997D>
	// 13469 21645:dastore         
	// 13470 21646:dup             
	// 13471 21647:bipush          8
	// 13472 21649:ldc2w           #41  <Double -0.54830319999999999D>
	// 13473 21652:dastore         
	// 13474 21653:aastore         
	// 13475 21654:dup             
	// 13476 21655:sipush          251
	// 13477 21658:aload           109
	// 13478 21660:aastore         
	// 13479 21661:dup             
	// 13480 21662:sipush          252
	// 13481 21665:aload           110
	// 13482 21667:aastore         
	// 13483 21668:dup             
	// 13484 21669:sipush          253
	// 13485 21672:bipush          9
	// 13486 21674:newarray        double[]
	// 13487 21676:dup             
	// 13488 21677:iconst_0        
	// 13489 21678:ldc2w           #3441 <Double 17.071063800000001D>
	// 13490 21681:dastore         
	// 13491 21682:dup             
	// 13492 21683:iconst_1        
	// 13493 21684:ldc2w           #1241 <Double 2.2076294999999999D>
	// 13494 21687:dastore         
	// 13495 21688:dup             
	// 13496 21689:iconst_2        
	// 13497 21690:ldc2w           #3443 <Double -1551.3669182000001D>
	// 13498 21693:dastore         
	// 13499 21694:dup             
	// 13500 21695:iconst_3        
	// 13501 21696:ldc2w           #63  <Double 57.2001287D>
	// 13502 21699:dastore         
	// 13503 21700:dup             
	// 13504 21701:iconst_4        
	// 13505 21702:ldc2w           #65  <Double 8.4126647000000006D>
	// 13506 21705:dastore         
	// 13507 21706:dup             
	// 13508 21707:iconst_5        
	// 13509 21708:ldc2w           #3445 <Double 0.5644226D>
	// 13510 21711:dastore         
	// 13511 21712:dup             
	// 13512 21713:bipush          6
	// 13513 21715:ldc2w           #3447 <Double -4.7405863999999998D>
	// 13514 21718:dastore         
	// 13515 21719:dup             
	// 13516 21720:bipush          7
	// 13517 21722:ldc2w           #3449 <Double -277.01414640000002D>
	// 13518 21725:dastore         
	// 13519 21726:dup             
	// 13520 21727:bipush          8
	// 13521 21729:ldc2w           #73  <Double -0.98049019999999998D>
	// 13522 21732:dastore         
	// 13523 21733:aastore         
	// 13524 21734:dup             
	// 13525 21735:sipush          254
	// 13526 21738:aload           111
	// 13527 21740:aastore         
	// 13528 21741:dup             
	// 13529 21742:sipush          255
	// 13530 21745:aload           112
	// 13531 21747:aastore         
	// 13532 21748:dup             
	// 13533 21749:sipush          256
	// 13534 21752:bipush          9
	// 13535 21754:newarray        double[]
	// 13536 21756:dup             
	// 13537 21757:iconst_0        
	// 13538 21758:ldc2w           #3451 <Double 17.9710638D>
	// 13539 21761:dastore         
	// 13540 21762:dup             
	// 13541 21763:iconst_1        
	// 13542 21764:ldc2w           #1241 <Double 2.2076294999999999D>
	// 13543 21767:dastore         
	// 13544 21768:dup             
	// 13545 21769:iconst_2        
	// 13546 21770:ldc2w           #3453 <Double -1647.7355835999999D>
	// 13547 21773:dastore         
	// 13548 21774:dup             
	// 13549 21775:iconst_3        
	// 13550 21776:ldc2w           #95  <Double 94.497482399999996D>
	// 13551 21779:dastore         
	// 13552 21780:dup             
	// 13553 21781:iconst_4        
	// 13554 21782:ldc2w           #97  <Double 7.5234689000000001D>
	// 13555 21785:dastore         
	// 13556 21786:dup             
	// 13557 21787:iconst_5        
	// 13558 21788:ldc2w           #3455 <Double 1.4644226D>
	// 13559 21791:dastore         
	// 13560 21792:dup             
	// 13561 21793:bipush          6
	// 13562 21795:ldc2w           #3457 <Double 17.6562907D>
	// 13563 21798:dastore         
	// 13564 21799:dup             
	// 13565 21800:bipush          7
	// 13566 21802:ldc2w           #3459 <Double -901.43062429999998D>
	// 13567 21805:dastore         
	// 13568 21806:dup             
	// 13569 21807:bipush          8
	// 13570 21809:ldc2w           #105 <Double -1.3163339000000001D>
	// 13571 21812:dastore         
	// 13572 21813:aastore         
	// 13573 21814:dup             
	// 13574 21815:sipush          257
	// 13575 21818:aload           113
	// 13576 21820:aastore         
	// 13577 21821:dup             
	// 13578 21822:sipush          258
	// 13579 21825:aload           114
	// 13580 21827:aastore         
	// 13581 21828:dup             
	// 13582 21829:sipush          259
	// 13583 21832:bipush          9
	// 13584 21834:newarray        double[]
	// 13585 21836:dup             
	// 13586 21837:iconst_0        
	// 13587 21838:ldc2w           #3461 <Double 18.871063800000002D>
	// 13588 21841:dastore         
	// 13589 21842:dup             
	// 13590 21843:iconst_1        
	// 13591 21844:ldc2w           #1241 <Double 2.2076294999999999D>
	// 13592 21847:dastore         
	// 13593 21848:dup             
	// 13594 21849:iconst_2        
	// 13595 21850:ldc2w           #3463 <Double -1744.1042491000001D>
	// 13596 21853:dastore         
	// 13597 21854:dup             
	// 13598 21855:iconst_3        
	// 13599 21856:ldc2w           #463 <Double 148.1152635D>
	// 13600 21859:dastore         
	// 13601 21860:dup             
	// 13602 21861:iconst_4        
	// 13603 21862:ldc2w           #465 <Double 5.7586041999999997D>
	// 13604 21865:dastore         
	// 13605 21866:dup             
	// 13606 21867:iconst_5        
	// 13607 21868:ldc2w           #3465 <Double 2.3644226000000002D>
	// 13608 21871:dastore         
	// 13609 21872:dup             
	// 13610 21873:bipush          6
	// 13611 21875:ldc2w           #3467 <Double 26.237842799999999D>
	// 13612 21878:dastore         
	// 13613 21879:dup             
	// 13614 21880:bipush          7
	// 13615 21882:ldc2w           #3469 <Double -1268.5361482000001D>
	// 13616 21885:dastore         
	// 13617 21886:dup             
	// 13618 21887:bipush          8
	// 13619 21889:ldc2w           #473 <Double -1.5229775000000001D>
	// 13620 21892:dastore         
	// 13621 21893:aastore         
	// 13622 21894:dup             
	// 13623 21895:sipush          260
	// 13624 21898:aload           115
	// 13625 21900:aastore         
	// 13626 21901:dup             
	// 13627 21902:sipush          261
	// 13628 21905:aload           116
	// 13629 21907:aastore         
	// 13630 21908:dup             
	// 13631 21909:sipush          262
	// 13632 21912:aload           117
	// 13633 21914:aastore         
	// 13634 21915:dup             
	// 13635 21916:sipush          263
	// 13636 21919:aload           118
	// 13637 21921:aastore         
	// 13638 21922:dup             
	// 13639 21923:sipush          264
	// 13640 21926:bipush          9
	// 13641 21928:newarray        double[]
	// 13642 21930:dup             
	// 13643 21931:iconst_0        
	// 13644 21932:ldc2w           #3471 <Double 20.371063800000002D>
	// 13645 21935:dastore         
	// 13646 21936:dup             
	// 13647 21937:iconst_1        
	// 13648 21938:ldc2w           #1241 <Double 2.2076294999999999D>
	// 13649 21941:dastore         
	// 13650 21942:dup             
	// 13651 21943:iconst_2        
	// 13652 21944:ldc2w           #3473 <Double -1904.7186916000001D>
	// 13653 21947:dastore         
	// 13654 21948:dup             
	// 13655 21949:iconst_3        
	// 13656 21950:ldc2w           #291 <Double 327.13300479999998D>
	// 13657 21953:dastore         
	// 13658 21954:dup             
	// 13659 21955:iconst_4        
	// 13660 21956:ldc2w           #293 <Double -2.4385346000000001D>
	// 13661 21959:dastore         
	// 13662 21960:dup             
	// 13663 21961:iconst_5        
	// 13664 21962:ldc2w           #3475 <Double 3.8644226000000002D>
	// 13665 21965:dastore         
	// 13666 21966:dup             
	// 13667 21967:bipush          6
	// 13668 21969:ldc2w           #3477 <Double 5.5798231999999999D>
	// 13669 21972:dastore         
	// 13670 21973:dup             
	// 13671 21974:bipush          7
	// 13672 21976:ldc2w           #3479 <Double -480.17952600000001D>
	// 13673 21979:dastore         
	// 13674 21980:dup             
	// 13675 21981:bipush          8
	// 13676 21983:ldc2w           #301 <Double -1.5323681D>
	// 13677 21986:dastore         
	// 13678 21987:aastore         
	// 13679 21988:dup             
	// 13680 21989:sipush          265
	// 13681 21992:aload           119
	// 13682 21994:aastore         
	// 13683 21995:dup             
	// 13684 21996:sipush          266
	// 13685 21999:aload           120
	// 13686 22001:aastore         
	// 13687 22002:dup             
	// 13688 22003:sipush          267
	// 13689 22006:aload           121
	// 13690 22008:aastore         
	// 13691 22009:dup             
	// 13692 22010:sipush          268
	// 13693 22013:aload           122
	// 13694 22015:aastore         
	// 13695 22016:dup             
	// 13696 22017:sipush          269
	// 13697 22020:bipush          9
	// 13698 22022:newarray        double[]
	// 13699 22024:dup             
	// 13700 22025:iconst_0        
	// 13701 22026:ldc2w           #3481 <Double 11.9130045D>
	// 13702 22029:dastore         
	// 13703 22030:dup             
	// 13704 22031:iconst_1        
	// 13705 22032:ldc2w           #1353 <Double 2.3359621000000002D>
	// 13706 22035:dastore         
	// 13707 22036:dup             
	// 13708 22037:iconst_2        
	// 13709 22038:ldc2w           #3483 <Double -975.19533520000005D>
	// 13710 22041:dastore         
	// 13711 22042:dup             
	// 13712 22043:iconst_3        
	// 13713 22044:ldc2w           #31  <Double 28.2628214D>
	// 13714 22047:dastore         
	// 13715 22048:dup             
	// 13716 22049:iconst_4        
	// 13717 22050:ldc2w           #33  <Double 8.8398648000000009D>
	// 13718 22053:dastore         
	// 13719 22054:dup             
	// 13720 22055:iconst_5        
	// 13721 22056:ldc2w           #3485 <Double -0.34247929999999999D>
	// 13722 22059:dastore         
	// 13723 22060:dup             
	// 13724 22061:bipush          6
	// 13725 22063:ldc2w           #3487 <Double -25.155586799999998D>
	// 13726 22066:dastore         
	// 13727 22067:dup             
	// 13728 22068:bipush          7
	// 13729 22070:ldc2w           #3489 <Double 130.96011369999999D>
	// 13730 22073:dastore         
	// 13731 22074:dup             
	// 13732 22075:bipush          8
	// 13733 22077:ldc2w           #41  <Double -0.54830319999999999D>
	// 13734 22080:dastore         
	// 13735 22081:aastore         
	// 13736 22082:dup             
	// 13737 22083:sipush          270
	// 13738 22086:aload           123
	// 13739 22088:aastore         
	// 13740 22089:dup             
	// 13741 22090:sipush          271
	// 13742 22093:aload           124
	// 13743 22095:aastore         
	// 13744 22096:dup             
	// 13745 22097:sipush          272
	// 13746 22100:bipush          9
	// 13747 22102:newarray        double[]
	// 13748 22104:dup             
	// 13749 22105:iconst_0        
	// 13750 22106:ldc2w           #3491 <Double 12.8130045D>
	// 13751 22109:dastore         
	// 13752 22110:dup             
	// 13753 22111:iconst_1        
	// 13754 22112:ldc2w           #1353 <Double 2.3359621000000002D>
	// 13755 22115:dastore         
	// 13756 22116:dup             
	// 13757 22117:iconst_2        
	// 13758 22118:ldc2w           #3493 <Double -1072.7189942D>
	// 13759 22121:dastore         
	// 13760 22122:dup             
	// 13761 22123:iconst_3        
	// 13762 22124:ldc2w           #63  <Double 57.2001287D>
	// 13763 22127:dastore         
	// 13764 22128:dup             
	// 13765 22129:iconst_4        
	// 13766 22130:ldc2w           #65  <Double 8.4126647000000006D>
	// 13767 22133:dastore         
	// 13768 22134:dup             
	// 13769 22135:iconst_5        
	// 13770 22136:ldc2w           #3495 <Double 0.55752069999999998D>
	// 13771 22139:dastore         
	// 13772 22140:dup             
	// 13773 22141:bipush          6
	// 13774 22143:ldc2w           #3497 <Double -4.4400845999999996D>
	// 13775 22146:dastore         
	// 13776 22147:dup             
	// 13777 22148:bipush          7
	// 13778 22150:ldc2w           #3499 <Double -282.31964809999999D>
	// 13779 22153:dastore         
	// 13780 22154:dup             
	// 13781 22155:bipush          8
	// 13782 22157:ldc2w           #73  <Double -0.98049019999999998D>
	// 13783 22160:dastore         
	// 13784 22161:aastore         
	// 13785 22162:dup             
	// 13786 22163:sipush          273
	// 13787 22166:bipush          9
	// 13788 22168:newarray        double[]
	// 13789 22170:dup             
	// 13790 22171:iconst_0        
	// 13791 22172:ldc2w           #3501 <Double 13.113004500000001D>
	// 13792 22175:dastore         
	// 13793 22176:dup             
	// 13794 22177:iconst_1        
	// 13795 22178:ldc2w           #1353 <Double 2.3359621000000002D>
	// 13796 22181:dastore         
	// 13797 22182:dup             
	// 13798 22183:iconst_2        
	// 13799 22184:ldc2w           #3503 <Double -1105.2268805000001D>
	// 13800 22187:dastore         
	// 13801 22188:dup             
	// 13802 22189:iconst_3        
	// 13803 22190:ldc2w           #345 <Double 68.407805800000006D>
	// 13804 22193:dastore         
	// 13805 22194:dup             
	// 13806 22195:iconst_4        
	// 13807 22196:ldc2w           #347 <Double 8.1813959000000001D>
	// 13808 22199:dastore         
	// 13809 22200:dup             
	// 13810 22201:iconst_5        
	// 13811 22202:ldc2w           #3505 <Double 0.85752070000000002D>
	// 13812 22205:dastore         
	// 13813 22206:dup             
	// 13814 22207:bipush          6
	// 13815 22209:ldc2w           #3507 <Double 3.7183868000000002D>
	// 13816 22212:dastore         
	// 13817 22213:dup             
	// 13818 22214:bipush          7
	// 13819 22216:ldc2w           #3509 <Double -484.92047730000002D>
	// 13820 22219:dastore         
	// 13821 22220:dup             
	// 13822 22221:bipush          8
	// 13823 22223:ldc2w           #355 <Double -1.1049982D>
	// 13824 22226:dastore         
	// 13825 22227:aastore         
	// 13826 22228:dup             
	// 13827 22229:sipush          274
	// 13828 22232:bipush          9
	// 13829 22234:newarray        double[]
	// 13830 22236:dup             
	// 13831 22237:iconst_0        
	// 13832 22238:ldc2w           #3511 <Double 13.4130045D>
	// 13833 22241:dastore         
	// 13834 22242:dup             
	// 13835 22243:iconst_1        
	// 13836 22244:ldc2w           #1353 <Double 2.3359621000000002D>
	// 13837 22247:dastore         
	// 13838 22248:dup             
	// 13839 22249:iconst_2        
	// 13840 22250:ldc2w           #3513 <Double -1137.7347669000001D>
	// 13841 22253:dastore         
	// 13842 22254:dup             
	// 13843 22255:iconst_3        
	// 13844 22256:ldc2w           #79  <Double 80.747736000000003D>
	// 13845 22259:dastore         
	// 13846 22260:dup             
	// 13847 22261:iconst_4        
	// 13848 22262:ldc2w           #81  <Double 7.8897272999999997D>
	// 13849 22265:dastore         
	// 13850 22266:dup             
	// 13851 22267:iconst_5        
	// 13852 22268:ldc2w           #3515 <Double 1.1575207000000001D>
	// 13853 22271:dastore         
	// 13854 22272:dup             
	// 13855 22273:bipush          6
	// 13856 22275:ldc2w           #3517 <Double 11.3953492D>
	// 13857 22278:dastore         
	// 13858 22279:dup             
	// 13859 22280:bipush          7
	// 13860 22282:ldc2w           #3519 <Double -700.54776249999998D>
	// 13861 22285:dastore         
	// 13862 22286:dup             
	// 13863 22287:bipush          8
	// 13864 22289:ldc2w           #89  <Double -1.2173562D>
	// 13865 22292:dastore         
	// 13866 22293:aastore         
	// 13867 22294:dup             
	// 13868 22295:sipush          275
	// 13869 22298:bipush          9
	// 13870 22300:newarray        double[]
	// 13871 22302:dup             
	// 13872 22303:iconst_0        
	// 13873 22304:ldc2w           #3521 <Double 13.7130045D>
	// 13874 22307:dastore         
	// 13875 22308:dup             
	// 13876 22309:iconst_1        
	// 13877 22310:ldc2w           #1353 <Double 2.3359621000000002D>
	// 13878 22313:dastore         
	// 13879 22314:dup             
	// 13880 22315:iconst_2        
	// 13881 22316:ldc2w           #3523 <Double -1170.2426531999999D>
	// 13882 22319:dastore         
	// 13883 22320:dup             
	// 13884 22321:iconst_3        
	// 13885 22322:ldc2w           #95  <Double 94.497482399999996D>
	// 13886 22325:dastore         
	// 13887 22326:dup             
	// 13888 22327:iconst_4        
	// 13889 22328:ldc2w           #97  <Double 7.5234689000000001D>
	// 13890 22331:dastore         
	// 13891 22332:dup             
	// 13892 22333:iconst_5        
	// 13893 22334:ldc2w           #3525 <Double 1.4575206999999999D>
	// 13894 22337:dastore         
	// 13895 22338:dup             
	// 13896 22339:bipush          6
	// 13897 22341:ldc2w           #3527 <Double 17.956792400000001D>
	// 13898 22344:dastore         
	// 13899 22345:dup             
	// 13900 22346:bipush          7
	// 13901 22348:ldc2w           #3529 <Double -909.44064160000005D>
	// 13902 22351:dastore         
	// 13903 22352:dup             
	// 13904 22353:bipush          8
	// 13905 22355:ldc2w           #105 <Double -1.3163339000000001D>
	// 13906 22358:dastore         
	// 13907 22359:aastore         
	// 13908 22360:dup             
	// 13909 22361:sipush          276
	// 13910 22364:bipush          9
	// 13911 22366:newarray        double[]
	// 13912 22368:dup             
	// 13913 22369:iconst_0        
	// 13914 22370:ldc2w           #3531 <Double 14.013004499999999D>
	// 13915 22373:dastore         
	// 13916 22374:dup             
	// 13917 22375:iconst_1        
	// 13918 22376:ldc2w           #1353 <Double 2.3359621000000002D>
	// 13919 22379:dastore         
	// 13920 22380:dup             
	// 13921 22381:iconst_2        
	// 13922 22382:ldc2w           #3533 <Double -1202.7505395999999D>
	// 13923 22385:dastore         
	// 13924 22386:dup             
	// 13925 22387:iconst_3        
	// 13926 22388:ldc2w           #111 <Double 110.00047410000001D>
	// 13927 22391:dastore         
	// 13928 22392:dup             
	// 13929 22393:iconst_4        
	// 13930 22394:ldc2w           #113 <Double 7.0639795000000003D>
	// 13931 22397:dastore         
	// 13932 22398:dup             
	// 13933 22399:iconst_5        
	// 13934 22400:ldc2w           #3535 <Double 1.7575206999999999D>
	// 13935 22403:dastore         
	// 13936 22404:dup             
	// 13937 22405:bipush          6
	// 13938 22407:ldc2w           #3537 <Double 22.877901000000001D>
	// 13939 22410:dastore         
	// 13940 22411:dup             
	// 13941 22412:bipush          7
	// 13942 22414:ldc2w           #3539 <Double -1089.3733792999999D>
	// 13943 22417:dastore         
	// 13944 22418:dup             
	// 13945 22419:bipush          8
	// 13946 22421:ldc2w           #121 <Double -1.4008494D>
	// 13947 22424:dastore         
	// 13948 22425:aastore         
	// 13949 22426:dup             
	// 13950 22427:sipush          277
	// 13951 22430:bipush          9
	// 13952 22432:newarray        double[]
	// 13953 22434:dup             
	// 13954 22435:iconst_0        
	// 13955 22436:ldc2w           #3541 <Double 14.3130045D>
	// 13956 22439:dastore         
	// 13957 22440:dup             
	// 13958 22441:iconst_1        
	// 13959 22442:ldc2w           #1353 <Double 2.3359621000000002D>
	// 13960 22445:dastore         
	// 13961 22446:dup             
	// 13962 22447:iconst_2        
	// 13963 22448:ldc2w           #3543 <Double -1235.2584259D>
	// 13964 22451:dastore         
	// 13965 22452:dup             
	// 13966 22453:iconst_3        
	// 13967 22454:ldc2w           #127 <Double 127.6888198D>
	// 13968 22457:dastore         
	// 13969 22458:dup             
	// 13970 22459:iconst_4        
	// 13971 22460:ldc2w           #129 <Double 6.4866308999999998D>
	// 13972 22463:dastore         
	// 13973 22464:dup             
	// 13974 22465:iconst_5        
	// 13975 22466:ldc2w           #3545 <Double 2.0575207D>
	// 13976 22469:dastore         
	// 13977 22470:dup             
	// 13978 22471:bipush          6
	// 13979 22473:ldc2w           #3547 <Double 25.7944268D>
	// 13980 22476:dastore         
	// 13981 22477:dup             
	// 13982 22478:bipush          7
	// 13983 22480:ldc2w           #3549 <Double -1218.6402634000001D>
	// 13984 22483:dastore         
	// 13985 22484:dup             
	// 13986 22485:bipush          8
	// 13987 22487:ldc2w           #137 <Double -1.4699811D>
	// 13988 22490:dastore         
	// 13989 22491:aastore         
	// 13990 22492:dup             
	// 13991 22493:sipush          278
	// 13992 22496:aload           125
	// 13993 22498:aastore         
	// 13994 22499:dup             
	// 13995 22500:sipush          279
	// 13996 22503:bipush          9
	// 13997 22505:newarray        double[]
	// 13998 22507:dup             
	// 13999 22508:iconst_0        
	// 14000 22509:ldc2w           #3551 <Double 14.9130045D>
	// 14001 22512:dastore         
	// 14002 22513:dup             
	// 14003 22514:iconst_1        
	// 14004 22515:ldc2w           #1353 <Double 2.3359621000000002D>
	// 14005 22518:dastore         
	// 14006 22519:dup             
	// 14007 22520:iconst_2        
	// 14008 22521:ldc2w           #3553 <Double -1300.2741986000001D>
	// 14009 22524:dastore         
	// 14010 22525:dup             
	// 14011 22526:iconst_3        
	// 14012 22527:ldc2w           #143 <Double 171.99884599999999D>
	// 14013 22530:dastore         
	// 14014 22531:dup             
	// 14015 22532:iconst_4        
	// 14016 22533:ldc2w           #145 <Double 4.8356763999999997D>
	// 14017 22536:dastore         
	// 14018 22537:dup             
	// 14019 22538:iconst_5        
	// 14020 22539:ldc2w           #3555 <Double 2.6575207000000001D>
	// 14021 22542:dastore         
	// 14022 22543:dup             
	// 14023 22544:bipush          6
	// 14024 22546:ldc2w           #3557 <Double 25.154298499999999D>
	// 14025 22549:dastore         
	// 14026 22550:dup             
	// 14027 22551:bipush          7
	// 14028 22553:ldc2w           #3559 <Double -1259.9168428D>
	// 14029 22556:dastore         
	// 14030 22557:dup             
	// 14031 22558:bipush          8
	// 14032 22560:ldc2w           #153 <Double -1.5592649999999999D>
	// 14033 22563:dastore         
	// 14034 22564:aastore         
	// 14035 22565:dup             
	// 14036 22566:sipush          280
	// 14037 22569:aload           126
	// 14038 22571:aastore         
	// 14039 22572:dup             
	// 14040 22573:sipush          281
	// 14041 22576:bipush          9
	// 14042 22578:newarray        double[]
	// 14043 22580:dup             
	// 14044 22581:iconst_0        
	// 14045 22582:ldc2w           #3561 <Double 15.513004499999999D>
	// 14046 22585:dastore         
	// 14047 22586:dup             
	// 14048 22587:iconst_1        
	// 14049 22588:ldc2w           #1353 <Double 2.3359621000000002D>
	// 14050 22591:dastore         
	// 14051 22592:dup             
	// 14052 22593:iconst_2        
	// 14053 22594:ldc2w           #3563 <Double -1365.2899712000001D>
	// 14054 22597:dastore         
	// 14055 22598:dup             
	// 14056 22599:iconst_3        
	// 14057 22600:ldc2w           #159 <Double 234.27778710000001D>
	// 14058 22603:dastore         
	// 14059 22604:dup             
	// 14060 22605:iconst_4        
	// 14061 22606:ldc2w           #161 <Double 2.1401053000000001D>
	// 14062 22609:dastore         
	// 14063 22610:dup             
	// 14064 22611:iconst_5        
	// 14065 22612:ldc2w           #3565 <Double 3.2575207000000002D>
	// 14066 22615:dastore         
	// 14067 22616:dup             
	// 14068 22617:bipush          6
	// 14069 22619:ldc2w           #3567 <Double 17.197633199999999D>
	// 14070 22622:dastore         
	// 14071 22623:dup             
	// 14072 22624:bipush          7
	// 14073 22626:ldc2w           #3569 <Double -983.01109099999996D>
	// 14074 22629:dastore         
	// 14075 22630:dup             
	// 14076 22631:bipush          8
	// 14077 22633:ldc2w           #169 <Double -1.5803442000000001D>
	// 14078 22636:dastore         
	// 14079 22637:aastore         
	// 14080 22638:dup             
	// 14081 22639:sipush          282
	// 14082 22642:bipush          9
	// 14083 22644:newarray        double[]
	// 14084 22646:dup             
	// 14085 22647:iconst_0        
	// 14086 22648:ldc2w           #3571 <Double 15.8130045D>
	// 14087 22651:dastore         
	// 14088 22652:dup             
	// 14089 22653:iconst_1        
	// 14090 22654:ldc2w           #1353 <Double 2.3359621000000002D>
	// 14091 22657:dastore         
	// 14092 22658:dup             
	// 14093 22659:iconst_2        
	// 14094 22660:ldc2w           #3573 <Double -1397.7978576D>
	// 14095 22663:dastore         
	// 14096 22664:dup             
	// 14097 22665:iconst_3        
	// 14098 22666:ldc2w           #175 <Double 275.7268449D>
	// 14099 22669:dastore         
	// 14100 22670:dup             
	// 14101 22671:iconst_4        
	// 14102 22672:ldc2w           #177 <Double 0.1651599D>
	// 14103 22675:dastore         
	// 14104 22676:dup             
	// 14105 22677:iconst_5        
	// 14106 22678:ldc2w           #3575 <Double 3.5575207D>
	// 14107 22681:dastore         
	// 14108 22682:dup             
	// 14109 22683:bipush          6
	// 14110 22685:ldc2w           #3577 <Double 11.6387964D>
	// 14111 22688:dastore         
	// 14112 22689:dup             
	// 14113 22690:bipush          7
	// 14114 22692:ldc2w           #3579 <Double -752.56042230000003D>
	// 14115 22695:dastore         
	// 14116 22696:dup             
	// 14117 22697:bipush          8
	// 14118 22699:ldc2w           #185 <Double -1.5649227999999999D>
	// 14119 22702:dastore         
	// 14120 22703:aastore         
	// 14121 22704:dup             
	// 14122 22705:sipush          283
	// 14123 22708:aload           127
	// 14124 22710:aastore         
	// 14125 22711:dup             
	// 14126 22712:sipush          284
	// 14127 22715:bipush          9
	// 14128 22717:newarray        double[]
	// 14129 22719:dup             
	// 14130 22720:iconst_0        
	// 14131 22721:ldc2w           #3581 <Double 16.4130045D>
	// 14132 22724:dastore         
	// 14133 22725:dup             
	// 14134 22726:iconst_1        
	// 14135 22727:ldc2w           #1353 <Double 2.3359621000000002D>
	// 14136 22730:dastore         
	// 14137 22731:dup             
	// 14138 22732:iconst_2        
	// 14139 22733:ldc2w           #3583 <Double -1462.8136303000001D>
	// 14140 22736:dastore         
	// 14141 22737:dup             
	// 14142 22738:iconst_3        
	// 14143 22739:ldc2w           #191 <Double 392.10647540000002D>
	// 14144 22742:dastore         
	// 14145 22743:dup             
	// 14146 22744:iconst_4        
	// 14147 22745:ldc2w           #193 <Double -5.9244687000000003D>
	// 14148 22748:dastore         
	// 14149 22749:dup             
	// 14150 22750:iconst_5        
	// 14151 22751:ldc2w           #3585 <Double 4.1575207000000001D>
	// 14152 22754:dastore         
	// 14153 22755:dup             
	// 14154 22756:bipush          6
	// 14155 22758:ldc2w           #3587 <Double 0.60336250000000002D>
	// 14156 22761:dastore         
	// 14157 22762:dup             
	// 14158 22763:bipush          7
	// 14159 22765:ldc2w           #3589 <Double -246.8615623D>
	// 14160 22768:dastore         
	// 14161 22769:dup             
	// 14162 22770:bipush          8
	// 14163 22772:ldc2w           #201 <Double -1.4830451D>
	// 14164 22775:dastore         
	// 14165 22776:aastore         
	// 14166 22777:dup             
	// 14167 22778:sipush          285
	// 14168 22781:aload           128
	// 14169 22783:aastore         
	// 14170 22784:dup             
	// 14171 22785:sipush          286
	// 14172 22788:bipush          9
	// 14173 22790:newarray        double[]
	// 14174 22792:dup             
	// 14175 22793:iconst_0        
	// 14176 22794:ldc2w           #3591 <Double 5.9431513999999996D>
	// 14177 22797:dastore         
	// 14178 22798:dup             
	// 14179 22799:iconst_1        
	// 14180 22800:ldc2w           #1435 <Double 2.5315694D>
	// 14181 22803:dastore         
	// 14182 22804:dup             
	// 14183 22805:iconst_2        
	// 14184 22806:ldc2w           #3593 <Double -288.25127950000001D>
	// 14185 22809:dastore         
	// 14186 22810:dup             
	// 14187 22811:iconst_3        
	// 14188 22812:ldc2w           #319 <Double 11.2644424D>
	// 14189 22815:dastore         
	// 14190 22816:dup             
	// 14191 22817:iconst_4        
	// 14192 22818:ldc2w           #321 <Double 8.9614528999999994D>
	// 14193 22821:dastore         
	// 14194 22822:dup             
	// 14195 22823:iconst_5        
	// 14196 22824:ldc2w           #3595 <Double -0.9466774D>
	// 14197 22827:dastore         
	// 14198 22828:dup             
	// 14199 22829:bipush          6
	// 14200 22831:ldc2w           #3597 <Double -30.295496700000001D>
	// 14201 22834:dastore         
	// 14202 22835:dup             
	// 14203 22836:bipush          7
	// 14204 22838:ldc2w           #3599 <Double 240.98268100000001D>
	// 14205 22841:dastore         
	// 14206 22842:dup             
	// 14207 22843:bipush          8
	// 14208 22845:ldc2w           #329 <Double -0.22733419999999999D>
	// 14209 22848:dastore         
	// 14210 22849:aastore         
	// 14211 22850:dup             
	// 14212 22851:sipush          287
	// 14213 22854:bipush          9
	// 14214 22856:newarray        double[]
	// 14215 22858:dup             
	// 14216 22859:iconst_0        
	// 14217 22860:ldc2w           #3601 <Double 6.2431514000000004D>
	// 14218 22863:dastore         
	// 14219 22864:dup             
	// 14220 22865:iconst_1        
	// 14221 22866:ldc2w           #1435 <Double 2.5315694D>
	// 14222 22869:dastore         
	// 14223 22870:dup             
	// 14224 22871:iconst_2        
	// 14225 22872:ldc2w           #3603 <Double -321.3459876D>
	// 14226 22875:dastore         
	// 14227 22876:dup             
	// 14228 22877:iconst_3        
	// 14229 22878:ldc2w           #15  <Double 19.625597299999999D>
	// 14230 22881:dastore         
	// 14231 22882:dup             
	// 14232 22883:iconst_4        
	// 14233 22884:ldc2w           #17  <Double 8.9143979000000009D>
	// 14234 22887:dastore         
	// 14235 22888:dup             
	// 14236 22889:iconst_5        
	// 14237 22890:ldc2w           #3605 <Double -0.64667739999999996D>
	// 14238 22893:dastore         
	// 14239 22894:dup             
	// 14240 22895:bipush          6
	// 14241 22897:ldc2w           #3607 <Double -28.6394144D>
	// 14242 22900:dastore         
	// 14243 22901:dup             
	// 14244 22902:bipush          7
	// 14245 22904:ldc2w           #3609 <Double 196.17877759999999D>
	// 14246 22907:dastore         
	// 14247 22908:dup             
	// 14248 22909:bipush          8
	// 14249 22911:ldc2w           #25  <Double -0.38996530000000001D>
	// 14250 22914:dastore         
	// 14251 22915:aastore         
	// 14252 22916:dup             
	// 14253 22917:sipush          288
	// 14254 22920:bipush          9
	// 14255 22922:newarray        double[]
	// 14256 22924:dup             
	// 14257 22925:iconst_0        
	// 14258 22926:ldc2w           #3611 <Double 6.5431514000000002D>
	// 14259 22929:dastore         
	// 14260 22930:dup             
	// 14261 22931:iconst_1        
	// 14262 22932:ldc2w           #1435 <Double 2.5315694D>
	// 14263 22935:dastore         
	// 14264 22936:dup             
	// 14265 22937:iconst_2        
	// 14266 22938:ldc2w           #3613 <Double -354.44069569999999D>
	// 14267 22941:dastore         
	// 14268 22942:dup             
	// 14269 22943:iconst_3        
	// 14270 22944:ldc2w           #31  <Double 28.2628214D>
	// 14271 22947:dastore         
	// 14272 22948:dup             
	// 14273 22949:iconst_4        
	// 14274 22950:ldc2w           #33  <Double 8.8398648000000009D>
	// 14275 22953:dastore         
	// 14276 22954:dup             
	// 14277 22955:iconst_5        
	// 14278 22956:ldc2w           #3615 <Double -0.34667740000000002D>
	// 14279 22959:dastore         
	// 14280 22960:dup             
	// 14281 22961:bipush          6
	// 14282 22963:ldc2w           #3617 <Double -24.8553684D>
	// 14283 22966:dastore         
	// 14284 22967:dup             
	// 14285 22968:bipush          7
	// 14286 22970:ldc2w           #3619 <Double 128.06952849999999D>
	// 14287 22973:dastore         
	// 14288 22974:dup             
	// 14289 22975:bipush          8
	// 14290 22977:ldc2w           #41  <Double -0.54830319999999999D>
	// 14291 22980:dastore         
	// 14292 22981:aastore         
	// 14293 22982:dup             
	// 14294 22983:sipush          289
	// 14295 22986:bipush          9
	// 14296 22988:newarray        double[]
	// 14297 22990:dup             
	// 14298 22991:iconst_0        
	// 14299 22992:ldc2w           #3621 <Double 6.8431514D>
	// 14300 22995:dastore         
	// 14301 22996:dup             
	// 14302 22997:iconst_1        
	// 14303 22998:ldc2w           #1435 <Double 2.5315694D>
	// 14304 23001:dastore         
	// 14305 23002:dup             
	// 14306 23003:iconst_2        
	// 14307 23004:ldc2w           #3623 <Double -387.53540390000001D>
	// 14308 23007:dastore         
	// 14309 23008:dup             
	// 14310 23009:iconst_3        
	// 14311 23010:ldc2w           #47  <Double 37.305238799999998D>
	// 14312 23013:dastore         
	// 14313 23014:dup             
	// 14314 23015:iconst_4        
	// 14315 23016:ldc2w           #49  <Double 8.7346948999999992D>
	// 14316 23019:dastore         
	// 14317 23020:dup             
	// 14318 23021:iconst_5        
	// 14319 23022:ldc2w           #3625 <Double -0.046677400000000001D>
	// 14320 23025:dastore         
	// 14321 23026:dup             
	// 14322 23027:bipush          6
	// 14323 23029:ldc2w           #3627 <Double -19.196303100000002D>
	// 14324 23032:dastore         
	// 14325 23033:dup             
	// 14326 23034:bipush          7
	// 14327 23036:ldc2w           #3629 <Double 26.849471900000001D>
	// 14328 23039:dastore         
	// 14329 23040:dup             
	// 14330 23041:bipush          8
	// 14331 23043:ldc2w           #57  <Double -0.70060560000000005D>
	// 14332 23046:dastore         
	// 14333 23047:aastore         
	// 14334 23048:dup             
	// 14335 23049:sipush          290
	// 14336 23052:aload           129
	// 14337 23054:aastore         
	// 14338 23055:dup             
	// 14339 23056:sipush          291
	// 14340 23059:aload           130
	// 14341 23061:aastore         
	// 14342 23062:dup             
	// 14343 23063:sipush          292
	// 14344 23066:bipush          9
	// 14345 23068:newarray        double[]
	// 14346 23070:dup             
	// 14347 23071:iconst_0        
	// 14348 23072:ldc2w           #3631 <Double 7.7431514000000004D>
	// 14349 23075:dastore         
	// 14350 23076:dup             
	// 14351 23077:iconst_1        
	// 14352 23078:ldc2w           #1435 <Double 2.5315694D>
	// 14353 23081:dastore         
	// 14354 23082:dup             
	// 14355 23083:iconst_2        
	// 14356 23084:ldc2w           #3633 <Double -486.81952819999998D>
	// 14357 23087:dastore         
	// 14358 23088:dup             
	// 14359 23089:iconst_3        
	// 14360 23090:ldc2w           #345 <Double 68.407805800000006D>
	// 14361 23093:dastore         
	// 14362 23094:dup             
	// 14363 23095:iconst_4        
	// 14364 23096:ldc2w           #347 <Double 8.1813959000000001D>
	// 14365 23099:dastore         
	// 14366 23100:dup             
	// 14367 23101:iconst_5        
	// 14368 23102:ldc2w           #3635 <Double 0.85332260000000004D>
	// 14369 23105:dastore         
	// 14370 23106:dup             
	// 14371 23107:bipush          6
	// 14372 23109:ldc2w           #3637 <Double 4.0186051999999997D>
	// 14373 23112:dastore         
	// 14374 23113:dup             
	// 14375 23114:bipush          7
	// 14376 23116:ldc2w           #3639 <Double -491.41368360000001D>
	// 14377 23119:dastore         
	// 14378 23120:dup             
	// 14379 23121:bipush          8
	// 14380 23123:ldc2w           #355 <Double -1.1049982D>
	// 14381 23126:dastore         
	// 14382 23127:aastore         
	// 14383 23128:dup             
	// 14384 23129:sipush          293
	// 14385 23132:bipush          9
	// 14386 23134:newarray        double[]
	// 14387 23136:dup             
	// 14388 23137:iconst_0        
	// 14389 23138:ldc2w           #3641 <Double 8.0431513999999993D>
	// 14390 23141:dastore         
	// 14391 23142:dup             
	// 14392 23143:iconst_1        
	// 14393 23144:ldc2w           #1435 <Double 2.5315694D>
	// 14394 23147:dastore         
	// 14395 23148:dup             
	// 14396 23149:iconst_2        
	// 14397 23150:ldc2w           #3643 <Double -519.91423629999997D>
	// 14398 23153:dastore         
	// 14399 23154:dup             
	// 14400 23155:iconst_3        
	// 14401 23156:ldc2w           #79  <Double 80.747736000000003D>
	// 14402 23159:dastore         
	// 14403 23160:dup             
	// 14404 23161:iconst_4        
	// 14405 23162:ldc2w           #81  <Double 7.8897272999999997D>
	// 14406 23165:dastore         
	// 14407 23166:dup             
	// 14408 23167:iconst_5        
	// 14409 23168:ldc2w           #3645 <Double 1.1533226000000001D>
	// 14410 23171:dastore         
	// 14411 23172:dup             
	// 14412 23173:bipush          6
	// 14413 23175:ldc2w           #3647 <Double 11.6955676D>
	// 14414 23178:dastore         
	// 14415 23179:dup             
	// 14416 23180:bipush          7
	// 14417 23182:ldc2w           #3649 <Double -707.94162410000001D>
	// 14418 23185:dastore         
	// 14419 23186:dup             
	// 14420 23187:bipush          8
	// 14421 23189:ldc2w           #89  <Double -1.2173562D>
	// 14422 23192:dastore         
	// 14423 23193:aastore         
	// 14424 23194:dup             
	// 14425 23195:sipush          294
	// 14426 23198:aload           131
	// 14427 23200:aastore         
	// 14428 23201:dup             
	// 14429 23202:sipush          295
	// 14430 23205:bipush          9
	// 14431 23207:newarray        double[]
	// 14432 23209:dup             
	// 14433 23210:iconst_0        
	// 14434 23211:ldc2w           #3651 <Double 8.6431514000000007D>
	// 14435 23214:dastore         
	// 14436 23215:dup             
	// 14437 23216:iconst_1        
	// 14438 23217:ldc2w           #1435 <Double 2.5315694D>
	// 14439 23220:dastore         
	// 14440 23221:dup             
	// 14441 23222:iconst_2        
	// 14442 23223:ldc2w           #3653 <Double -586.10365260000003D>
	// 14443 23226:dastore         
	// 14444 23227:dup             
	// 14445 23228:iconst_3        
	// 14446 23229:ldc2w           #111 <Double 110.00047410000001D>
	// 14447 23232:dastore         
	// 14448 23233:dup             
	// 14449 23234:iconst_4        
	// 14450 23235:ldc2w           #113 <Double 7.0639795000000003D>
	// 14451 23238:dastore         
	// 14452 23239:dup             
	// 14453 23240:iconst_5        
	// 14454 23241:ldc2w           #3655 <Double 1.7533226D>
	// 14455 23244:dastore         
	// 14456 23245:dup             
	// 14457 23246:bipush          6
	// 14458 23248:ldc2w           #3657 <Double 23.1781194D>
	// 14459 23251:dastore         
	// 14460 23252:dup             
	// 14461 23253:bipush          7
	// 14462 23255:ldc2w           #3659 <Double -1098.5685513999999D>
	// 14463 23258:dastore         
	// 14464 23259:dup             
	// 14465 23260:bipush          8
	// 14466 23262:ldc2w           #121 <Double -1.4008494D>
	// 14467 23265:dastore         
	// 14468 23266:aastore         
	// 14469 23267:dup             
	// 14470 23268:sipush          296
	// 14471 23271:aload           132
	// 14472 23273:aastore         
	// 14473 23274:dup             
	// 14474 23275:sipush          297
	// 14475 23278:bipush          9
	// 14476 23280:newarray        double[]
	// 14477 23282:dup             
	// 14478 23283:iconst_0        
	// 14479 23284:ldc2w           #3661 <Double 9.2431514000000004D>
	// 14480 23287:dastore         
	// 14481 23288:dup             
	// 14482 23289:iconst_1        
	// 14483 23290:ldc2w           #1435 <Double 2.5315694D>
	// 14484 23293:dastore         
	// 14485 23294:dup             
	// 14486 23295:iconst_2        
	// 14487 23296:ldc2w           #3663 <Double -652.29306880000001D>
	// 14488 23299:dastore         
	// 14489 23300:dup             
	// 14490 23301:iconst_3        
	// 14491 23302:ldc2w           #463 <Double 148.1152635D>
	// 14492 23305:dastore         
	// 14493 23306:dup             
	// 14494 23307:iconst_4        
	// 14495 23308:ldc2w           #465 <Double 5.7586041999999997D>
	// 14496 23311:dastore         
	// 14497 23312:dup             
	// 14498 23313:iconst_5        
	// 14499 23314:ldc2w           #3665 <Double 2.3533225999999998D>
	// 14500 23317:dastore         
	// 14501 23318:dup             
	// 14502 23319:bipush          6
	// 14503 23321:ldc2w           #3667 <Double 26.838563000000001D>
	// 14504 23324:dastore         
	// 14505 23325:dup             
	// 14506 23326:bipush          7
	// 14507 23328:ldc2w           #3669 <Double -1290.2471637000001D>
	// 14508 23331:dastore         
	// 14509 23332:dup             
	// 14510 23333:bipush          8
	// 14511 23335:ldc2w           #473 <Double -1.5229775000000001D>
	// 14512 23338:dastore         
	// 14513 23339:aastore         
	// 14514 23340:dup             
	// 14515 23341:sipush          298
	// 14516 23344:bipush          9
	// 14517 23346:newarray        double[]
	// 14518 23348:dup             
	// 14519 23349:iconst_0        
	// 14520 23350:ldc2w           #3671 <Double 9.5431513999999993D>
	// 14521 23353:dastore         
	// 14522 23354:dup             
	// 14523 23355:iconst_1        
	// 14524 23356:ldc2w           #1435 <Double 2.5315694D>
	// 14525 23359:dastore         
	// 14526 23360:dup             
	// 14527 23361:iconst_2        
	// 14528 23362:ldc2w           #3673 <Double -685.38777689999995D>
	// 14529 23365:dastore         
	// 14530 23366:dup             
	// 14531 23367:iconst_3        
	// 14532 23368:ldc2w           #143 <Double 171.99884599999999D>
	// 14533 23371:dastore         
	// 14534 23372:dup             
	// 14535 23373:iconst_4        
	// 14536 23374:ldc2w           #145 <Double 4.8356763999999997D>
	// 14537 23377:dastore         
	// 14538 23378:dup             
	// 14539 23379:iconst_5        
	// 14540 23380:ldc2w           #3675 <Double 2.6533226000000001D>
	// 14541 23383:dastore         
	// 14542 23384:dup             
	// 14543 23385:bipush          6
	// 14544 23387:ldc2w           #3677 <Double 25.454516999999999D>
	// 14545 23390:dastore         
	// 14546 23391:dup             
	// 14547 23392:bipush          7
	// 14548 23394:ldc2w           #3679 <Double -1271.8139807D>
	// 14549 23397:dastore         
	// 14550 23398:dup             
	// 14551 23399:bipush          8
	// 14552 23401:ldc2w           #153 <Double -1.5592649999999999D>
	// 14553 23404:dastore         
	// 14554 23405:aastore         
	// 14555 23406:dup             
	// 14556 23407:sipush          299
	// 14557 23410:bipush          9
	// 14558 23412:newarray        double[]
	// 14559 23414:dup             
	// 14560 23415:iconst_0        
	// 14561 23416:ldc2w           #3681 <Double 9.8431514D>
	// 14562 23419:dastore         
	// 14563 23420:dup             
	// 14564 23421:iconst_1        
	// 14565 23422:ldc2w           #1435 <Double 2.5315694D>
	// 14566 23425:dastore         
	// 14567 23426:dup             
	// 14568 23427:iconst_2        
	// 14569 23428:ldc2w           #3683 <Double -718.48248509999996D>
	// 14570 23431:dastore         
	// 14571 23432:dup             
	// 14572 23433:iconst_3        
	// 14573 23434:ldc2w           #265 <Double 200.29154579999999D>
	// 14574 23437:dastore         
	// 14575 23438:dup             
	// 14576 23439:iconst_4        
	// 14577 23440:ldc2w           #267 <Double 3.6574485999999999D>
	// 14578 23443:dastore         
	// 14579 23444:dup             
	// 14580 23445:iconst_5        
	// 14581 23446:ldc2w           #3685 <Double 2.9533225999999999D>
	// 14582 23449:dastore         
	// 14583 23450:dup             
	// 14584 23451:bipush          6
	// 14585 23453:ldc2w           #3687 <Double 22.1954517D>
	// 14586 23456:dastore         
	// 14587 23457:dup             
	// 14588 23458:bipush          7
	// 14589 23460:ldc2w           #3689 <Double -1171.2194128000001D>
	// 14590 23463:dastore         
	// 14591 23464:dup             
	// 14592 23465:bipush          8
	// 14593 23467:ldc2w           #275 <Double -1.5784544D>
	// 14594 23470:dastore         
	// 14595 23471:aastore         
	// 14596 23472:dup             
	// 14597 23473:sipush          300
	// 14598 23476:aload           133
	// 14599 23478:aastore         
	// 14600 23479:dup             
	// 14601 23480:sipush          301
	// 14602 23483:aload           134
	// 14603 23485:aastore         
	// 14604 23486:dup             
	// 14605 23487:sipush          302
	// 14606 23490:aload           135
	// 14607 23492:aastore         
	// 14608 23493:dup             
	// 14609 23494:sipush          303
	// 14610 23497:aload           136
	// 14611 23499:aastore         
	// 14612 23500:dup             
	// 14613 23501:sipush          304
	// 14614 23504:aload           137
	// 14615 23506:aastore         
	// 14616 23507:dup             
	// 14617 23508:sipush          305
	// 14618 23511:aload           138
	// 14619 23513:aastore         
	// 14620 23514:dup             
	// 14621 23515:sipush          306
	// 14622 23518:bipush          9
	// 14623 23520:newarray        double[]
	// 14624 23522:dup             
	// 14625 23523:iconst_0        
	// 14626 23524:ldc2w           #3691 <Double 0.34496710000000003D>
	// 14627 23527:dastore         
	// 14628 23528:dup             
	// 14629 23529:iconst_1        
	// 14630 23530:ldc2w           #1527 <Double 2.8047719999999998D>
	// 14631 23533:dastore         
	// 14632 23534:dup             
	// 14633 23535:iconst_2        
	// 14634 23536:ldc2w           #3693 <Double 378.29744210000001D>
	// 14635 23539:dastore         
	// 14636 23540:dup             
	// 14637 23541:iconst_3        
	// 14638 23542:ldc2w           #15  <Double 19.625597299999999D>
	// 14639 23545:dastore         
	// 14640 23546:dup             
	// 14641 23547:iconst_4        
	// 14642 23548:ldc2w           #17  <Double 8.9143979000000009D>
	// 14643 23551:dastore         
	// 14644 23552:dup             
	// 14645 23553:iconst_5        
	// 14646 23554:ldc2w           #3695 <Double -0.64957759999999998D>
	// 14647 23557:dastore         
	// 14648 23558:dup             
	// 14649 23559:bipush          6
	// 14650 23561:ldc2w           #3697 <Double -28.339296600000001D>
	// 14651 23564:dastore         
	// 14652 23565:dup             
	// 14653 23566:bipush          7
	// 14654 23568:ldc2w           #3699 <Double 194.04787619999999D>
	// 14655 23571:dastore         
	// 14656 23572:dup             
	// 14657 23573:bipush          8
	// 14658 23575:ldc2w           #25  <Double -0.38996530000000001D>
	// 14659 23578:dastore         
	// 14660 23579:aastore         
	// 14661 23580:dup             
	// 14662 23581:sipush          307
	// 14663 23584:bipush          9
	// 14664 23586:newarray        double[]
	// 14665 23588:dup             
	// 14666 23589:iconst_0        
	// 14667 23590:ldc2w           #3701 <Double 0.64496710000000002D>
	// 14668 23593:dastore         
	// 14669 23594:dup             
	// 14670 23595:iconst_1        
	// 14671 23596:ldc2w           #1527 <Double 2.8047719999999998D>
	// 14672 23599:dastore         
	// 14673 23600:dup             
	// 14674 23601:iconst_2        
	// 14675 23602:ldc2w           #3703 <Double 344.38312610000003D>
	// 14676 23605:dastore         
	// 14677 23606:dup             
	// 14678 23607:iconst_3        
	// 14679 23608:ldc2w           #31  <Double 28.2628214D>
	// 14680 23611:dastore         
	// 14681 23612:dup             
	// 14682 23613:iconst_4        
	// 14683 23614:ldc2w           #33  <Double 8.8398648000000009D>
	// 14684 23617:dastore         
	// 14685 23618:dup             
	// 14686 23619:iconst_5        
	// 14687 23620:ldc2w           #3705 <Double -0.34957759999999999D>
	// 14688 23623:dastore         
	// 14689 23624:dup             
	// 14690 23625:bipush          6
	// 14691 23627:ldc2w           #3707 <Double -24.555250600000001D>
	// 14692 23630:dastore         
	// 14693 23631:dup             
	// 14694 23632:bipush          7
	// 14695 23634:ldc2w           #3709 <Double 125.0382737D>
	// 14696 23637:dastore         
	// 14697 23638:dup             
	// 14698 23639:bipush          8
	// 14699 23641:ldc2w           #41  <Double -0.54830319999999999D>
	// 14700 23644:dastore         
	// 14701 23645:aastore         
	// 14702 23646:dup             
	// 14703 23647:sipush          308
	// 14704 23650:bipush          9
	// 14705 23652:newarray        double[]
	// 14706 23654:dup             
	// 14707 23655:iconst_0        
	// 14708 23656:ldc2w           #3711 <Double 0.94496709999999995D>
	// 14709 23659:dastore         
	// 14710 23660:dup             
	// 14711 23661:iconst_1        
	// 14712 23662:ldc2w           #1527 <Double 2.8047719999999998D>
	// 14713 23665:dastore         
	// 14714 23666:dup             
	// 14715 23667:iconst_2        
	// 14716 23668:ldc2w           #3713 <Double 310.46881020000001D>
	// 14717 23671:dastore         
	// 14718 23672:dup             
	// 14719 23673:iconst_3        
	// 14720 23674:ldc2w           #47  <Double 37.305238799999998D>
	// 14721 23677:dastore         
	// 14722 23678:dup             
	// 14723 23679:iconst_4        
	// 14724 23680:ldc2w           #49  <Double 8.7346948999999992D>
	// 14725 23683:dastore         
	// 14726 23684:dup             
	// 14727 23685:iconst_5        
	// 14728 23686:ldc2w           #3715 <Double -0.049577599999999999D>
	// 14729 23689:dastore         
	// 14730 23690:dup             
	// 14731 23691:bipush          6
	// 14732 23693:ldc2w           #3717 <Double -18.8961854D>
	// 14733 23696:dastore         
	// 14734 23697:dup             
	// 14735 23698:bipush          7
	// 14736 23700:ldc2w           #3719 <Double 22.917863799999999D>
	// 14737 23703:dastore         
	// 14738 23704:dup             
	// 14739 23705:bipush          8
	// 14740 23707:ldc2w           #57  <Double -0.70060560000000005D>
	// 14741 23710:dastore         
	// 14742 23711:aastore         
	// 14743 23712:dup             
	// 14744 23713:sipush          309
	// 14745 23716:bipush          9
	// 14746 23718:newarray        double[]
	// 14747 23720:dup             
	// 14748 23721:iconst_0        
	// 14749 23722:ldc2w           #3721 <Double 1.2449671D>
	// 14750 23725:dastore         
	// 14751 23726:dup             
	// 14752 23727:iconst_1        
	// 14753 23728:ldc2w           #1527 <Double 2.8047719999999998D>
	// 14754 23731:dastore         
	// 14755 23732:dup             
	// 14756 23733:iconst_2        
	// 14757 23734:ldc2w           #3723 <Double 276.55449420000002D>
	// 14758 23737:dastore         
	// 14759 23738:dup             
	// 14760 23739:iconst_3        
	// 14761 23740:ldc2w           #541 <Double 46.896400399999997D>
	// 14762 23743:dastore         
	// 14763 23744:dup             
	// 14764 23745:iconst_4        
	// 14765 23746:ldc2w           #543 <Double 8.5943556999999995D>
	// 14766 23749:dastore         
	// 14767 23750:dup             
	// 14768 23751:iconst_5        
	// 14769 23752:ldc2w           #3725 <Double 0.25042239999999999D>
	// 14770 23755:dastore         
	// 14771 23756:dup             
	// 14772 23757:bipush          6
	// 14773 23759:ldc2w           #3727 <Double -11.798585299999999D>
	// 14774 23762:dastore         
	// 14775 23763:dup             
	// 14776 23764:bipush          7
	// 14777 23766:ldc2w           #3729 <Double -117.1618052D>
	// 14778 23769:dastore         
	// 14779 23770:dup             
	// 14780 23771:bipush          8
	// 14781 23773:ldc2w           #551 <Double -0.84519750000000005D>
	// 14782 23776:dastore         
	// 14783 23777:aastore         
	// 14784 23778:dup             
	// 14785 23779:sipush          310
	// 14786 23782:bipush          9
	// 14787 23784:newarray        double[]
	// 14788 23786:dup             
	// 14789 23787:iconst_0        
	// 14790 23788:ldc2w           #3731 <Double 1.5449671D>
	// 14791 23791:dastore         
	// 14792 23792:dup             
	// 14793 23793:iconst_1        
	// 14794 23794:ldc2w           #1527 <Double 2.8047719999999998D>
	// 14795 23797:dastore         
	// 14796 23798:dup             
	// 14797 23799:iconst_2        
	// 14798 23800:ldc2w           #3733 <Double 242.64017820000001D>
	// 14799 23803:dastore         
	// 14800 23804:dup             
	// 14801 23805:iconst_3        
	// 14802 23806:ldc2w           #63  <Double 57.2001287D>
	// 14803 23809:dastore         
	// 14804 23810:dup             
	// 14805 23811:iconst_4        
	// 14806 23812:ldc2w           #65  <Double 8.4126647000000006D>
	// 14807 23815:dastore         
	// 14808 23816:dup             
	// 14809 23817:iconst_5        
	// 14810 23818:ldc2w           #3735 <Double 0.55042239999999998D>
	// 14811 23821:dastore         
	// 14812 23822:dup             
	// 14813 23823:bipush          6
	// 14814 23825:ldc2w           #3737 <Double -3.8397484999999998D>
	// 14815 23828:dastore         
	// 14816 23829:dup             
	// 14817 23830:bipush          7
	// 14818 23832:ldc2w           #3739 <Double -293.64451380000003D>
	// 14819 23835:dastore         
	// 14820 23836:dup             
	// 14821 23837:bipush          8
	// 14822 23839:ldc2w           #73  <Double -0.98049019999999998D>
	// 14823 23842:dastore         
	// 14824 23843:aastore         
	// 14825 23844:dup             
	// 14826 23845:sipush          311
	// 14827 23848:aload           139
	// 14828 23850:aastore         
	// 14829 23851:dup             
	// 14830 23852:sipush          312
	// 14831 23855:aload           140
	// 14832 23857:aastore         
	// 14833 23858:dup             
	// 14834 23859:sipush          313
	// 14835 23862:aload           141
	// 14836 23864:aastore         
	// 14837 23865:dup             
	// 14838 23866:sipush          314
	// 14839 23869:bipush          9
	// 14840 23871:newarray        double[]
	// 14841 23873:dup             
	// 14842 23874:iconst_0        
	// 14843 23875:ldc2w           #3741 <Double 2.7449671000000002D>
	// 14844 23878:dastore         
	// 14845 23879:dup             
	// 14846 23880:iconst_1        
	// 14847 23881:ldc2w           #1527 <Double 2.8047719999999998D>
	// 14848 23884:dastore         
	// 14849 23885:dup             
	// 14850 23886:iconst_2        
	// 14851 23887:ldc2w           #3743 <Double 106.9829143D>
	// 14852 23890:dastore         
	// 14853 23891:dup             
	// 14854 23892:iconst_3        
	// 14855 23893:ldc2w           #111 <Double 110.00047410000001D>
	// 14856 23896:dastore         
	// 14857 23897:dup             
	// 14858 23898:iconst_4        
	// 14859 23899:ldc2w           #113 <Double 7.0639795000000003D>
	// 14860 23902:dastore         
	// 14861 23903:dup             
	// 14862 23904:iconst_5        
	// 14863 23905:ldc2w           #3745 <Double 1.7504223999999999D>
	// 14864 23908:dastore         
	// 14865 23909:dup             
	// 14866 23910:bipush          6
	// 14867 23912:ldc2w           #3747 <Double 23.478237199999999D>
	// 14868 23915:dastore         
	// 14869 23916:dup             
	// 14870 23917:bipush          7
	// 14871 23919:ldc2w           #3749 <Double -1107.9022792999999D>
	// 14872 23922:dastore         
	// 14873 23923:dup             
	// 14874 23924:bipush          8
	// 14875 23926:ldc2w           #121 <Double -1.4008494D>
	// 14876 23929:dastore         
	// 14877 23930:aastore         
	// 14878 23931:dup             
	// 14879 23932:sipush          315
	// 14880 23935:bipush          9
	// 14881 23937:newarray        double[]
	// 14882 23939:dup             
	// 14883 23940:iconst_0        
	// 14884 23941:ldc2w           #3751 <Double 3.0449671D>
	// 14885 23944:dastore         
	// 14886 23945:dup             
	// 14887 23946:iconst_1        
	// 14888 23947:ldc2w           #1527 <Double 2.8047719999999998D>
	// 14889 23950:dastore         
	// 14890 23951:dup             
	// 14891 23952:iconst_2        
	// 14892 23953:ldc2w           #3753 <Double 73.068598399999999D>
	// 14893 23956:dastore         
	// 14894 23957:dup             
	// 14895 23958:iconst_3        
	// 14896 23959:ldc2w           #127 <Double 127.6888198D>
	// 14897 23962:dastore         
	// 14898 23963:dup             
	// 14899 23964:iconst_4        
	// 14900 23965:ldc2w           #129 <Double 6.4866308999999998D>
	// 14901 23968:dastore         
	// 14902 23969:dup             
	// 14903 23970:iconst_5        
	// 14904 23971:ldc2w           #3755 <Double 2.0504224D>
	// 14905 23974:dastore         
	// 14906 23975:dup             
	// 14907 23976:bipush          6
	// 14908 23978:ldc2w           #3757 <Double 26.394763000000001D>
	// 14909 23981:dastore         
	// 14910 23982:dup             
	// 14911 23983:bipush          7
	// 14912 23985:ldc2w           #3759 <Double -1238.970172D>
	// 14913 23988:dastore         
	// 14914 23989:dup             
	// 14915 23990:bipush          8
	// 14916 23992:ldc2w           #137 <Double -1.4699811D>
	// 14917 23995:dastore         
	// 14918 23996:aastore         
	// 14919 23997:dup             
	// 14920 23998:sipush          316
	// 14921 24001:bipush          9
	// 14922 24003:newarray        double[]
	// 14923 24005:dup             
	// 14924 24006:iconst_0        
	// 14925 24007:ldc2w           #3761 <Double 3.3449670999999999D>
	// 14926 24010:dastore         
	// 14927 24011:dup             
	// 14928 24012:iconst_1        
	// 14929 24013:ldc2w           #1527 <Double 2.8047719999999998D>
	// 14930 24016:dastore         
	// 14931 24017:dup             
	// 14932 24018:iconst_2        
	// 14933 24019:ldc2w           #3763 <Double 39.1542824D>
	// 14934 24022:dastore         
	// 14935 24023:dup             
	// 14936 24024:iconst_3        
	// 14937 24025:ldc2w           #463 <Double 148.1152635D>
	// 14938 24028:dastore         
	// 14939 24029:dup             
	// 14940 24030:iconst_4        
	// 14941 24031:ldc2w           #465 <Double 5.7586041999999997D>
	// 14942 24034:dastore         
	// 14943 24035:dup             
	// 14944 24036:iconst_5        
	// 14945 24037:ldc2w           #3765 <Double 2.3504223999999998D>
	// 14946 24040:dastore         
	// 14947 24041:dup             
	// 14948 24042:bipush          6
	// 14949 24044:ldc2w           #3767 <Double 27.138680699999998D>
	// 14950 24047:dastore         
	// 14951 24048:dup             
	// 14952 24049:bipush          7
	// 14953 24051:ldc2w           #3769 <Double -1301.3815982000001D>
	// 14954 24054:dastore         
	// 14955 24055:dup             
	// 14956 24056:bipush          8
	// 14957 24058:ldc2w           #473 <Double -1.5229775000000001D>
	// 14958 24061:dastore         
	// 14959 24062:aastore         
	// 14960 24063:dup             
	// 14961 24064:sipush          317
	// 14962 24067:bipush          9
	// 14963 24069:newarray        double[]
	// 14964 24071:dup             
	// 14965 24072:iconst_0        
	// 14966 24073:ldc2w           #3771 <Double 3.6449671000000001D>
	// 14967 24076:dastore         
	// 14968 24077:dup             
	// 14969 24078:iconst_1        
	// 14970 24079:ldc2w           #1527 <Double 2.8047719999999998D>
	// 14971 24082:dastore         
	// 14972 24083:dup             
	// 14973 24084:iconst_2        
	// 14974 24085:ldc2w           #3773 <Double 5.2399664000000001D>
	// 14975 24088:dastore         
	// 14976 24089:dup             
	// 14977 24090:iconst_3        
	// 14978 24091:ldc2w           #143 <Double 171.99884599999999D>
	// 14979 24094:dastore         
	// 14980 24095:dup             
	// 14981 24096:iconst_4        
	// 14982 24097:ldc2w           #145 <Double 4.8356763999999997D>
	// 14983 24100:dastore         
	// 14984 24101:dup             
	// 14985 24102:iconst_5        
	// 14986 24103:ldc2w           #3775 <Double 2.6504224000000001D>
	// 14987 24106:dastore         
	// 14988 24107:dup             
	// 14989 24108:bipush          6
	// 14990 24110:ldc2w           #3777 <Double 25.7546347D>
	// 14991 24113:dastore         
	// 14992 24114:dup             
	// 14993 24115:bipush          7
	// 14994 24117:ldc2w           #3779 <Double -1283.8487685D>
	// 14995 24120:dastore         
	// 14996 24121:dup             
	// 14997 24122:bipush          8
	// 14998 24124:ldc2w           #153 <Double -1.5592649999999999D>
	// 14999 24127:dastore         
	// 15000 24128:aastore         
	// 15001 24129:dup             
	// 15002 24130:sipush          318
	// 15003 24133:aload           142
	// 15004 24135:aastore         
	// 15005 24136:dup             
	// 15006 24137:sipush          319
	// 15007 24140:aload           143
	// 15008 24142:aastore         
	// 15009 24143:dup             
	// 15010 24144:sipush          320
	// 15011 24147:aload           144
	// 15012 24149:aastore         
	// 15013 24150:dup             
	// 15014 24151:sipush          321
	// 15015 24154:bipush          9
	// 15016 24156:newarray        double[]
	// 15017 24158:dup             
	// 15018 24159:iconst_0        
	// 15019 24160:ldc2w           #3781 <Double 4.8449670999999999D>
	// 15020 24163:dastore         
	// 15021 24164:dup             
	// 15022 24165:iconst_1        
	// 15023 24166:ldc2w           #1527 <Double 2.8047719999999998D>
	// 15024 24169:dastore         
	// 15025 24170:dup             
	// 15026 24171:iconst_2        
	// 15027 24172:ldc2w           #3783 <Double -130.4172974D>
	// 15028 24175:dastore         
	// 15029 24176:dup             
	// 15030 24177:iconst_3        
	// 15031 24178:ldc2w           #291 <Double 327.13300479999998D>
	// 15032 24181:dastore         
	// 15033 24182:dup             
	// 15034 24183:iconst_4        
	// 15035 24184:ldc2w           #293 <Double -2.4385346000000001D>
	// 15036 24187:dastore         
	// 15037 24188:dup             
	// 15038 24189:iconst_5        
	// 15039 24190:ldc2w           #3785 <Double 3.8504223999999998D>
	// 15040 24193:dastore         
	// 15041 24194:dup             
	// 15042 24195:bipush          6
	// 15043 24197:ldc2w           #3787 <Double 6.4806610999999998D>
	// 15044 24200:dastore         
	// 15045 24201:dup             
	// 15046 24202:bipush          7
	// 15047 24204:ldc2w           #3789 <Double -526.53754500000002D>
	// 15048 24207:dastore         
	// 15049 24208:dup             
	// 15050 24209:bipush          8
	// 15051 24211:ldc2w           #301 <Double -1.5323681D>
	// 15052 24214:dastore         
	// 15053 24215:aastore         
	// 15054 24216:dup             
	// 15055 24217:sipush          322
	// 15056 24220:aload           145
	// 15057 24222:aastore         
	// 15058 24223:dup             
	// 15059 24224:sipush          323
	// 15060 24227:bipush          9
	// 15061 24229:newarray        double[]
	// 15062 24231:dup             
	// 15063 24232:iconst_0        
	// 15064 24233:ldc2w           #3791 <Double -6.0458809999999996D>
	// 15065 24236:dastore         
	// 15066 24237:dup             
	// 15067 24238:iconst_1        
	// 15068 24239:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15069 24242:dastore         
	// 15070 24243:dup             
	// 15071 24244:iconst_2        
	// 15072 24245:ldc2w           #3793 <Double 1151.787501D>
	// 15073 24248:dastore         
	// 15074 24249:dup             
	// 15075 24250:iconst_3        
	// 15076 24251:ldc2w           #209 <Double 3.0597946D>
	// 15077 24254:dastore         
	// 15078 24255:dup             
	// 15079 24256:iconst_4        
	// 15080 24257:ldc2w           #211 <Double 8.9830009000000004D>
	// 15081 24260:dastore         
	// 15082 24261:dup             
	// 15083 24262:iconst_5        
	// 15084 24263:ldc2w           #3795 <Double -1.2517361D>
	// 15085 24266:dastore         
	// 15086 24267:dup             
	// 15087 24268:bipush          6
	// 15088 24270:ldc2w           #3797 <Double -29.178781099999998D>
	// 15089 24273:dastore         
	// 15090 24274:dup             
	// 15091 24275:bipush          7
	// 15092 24277:ldc2w           #3799 <Double 274.366309D>
	// 15093 24280:dastore         
	// 15094 24281:dup             
	// 15095 24282:bipush          8
	// 15096 24284:ldc2w           #219 <Double -0.062199999999999998D>
	// 15097 24287:dastore         
	// 15098 24288:aastore         
	// 15099 24289:dup             
	// 15100 24290:sipush          324
	// 15101 24293:bipush          9
	// 15102 24295:newarray        double[]
	// 15103 24297:dup             
	// 15104 24298:iconst_0        
	// 15105 24299:ldc2w           #3801 <Double -5.7458809999999998D>
	// 15106 24302:dastore         
	// 15107 24303:dup             
	// 15108 24304:iconst_1        
	// 15109 24305:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15110 24308:dastore         
	// 15111 24309:dup             
	// 15112 24310:iconst_2        
	// 15113 24311:ldc2w           #3803 <Double 1116.8128222D>
	// 15114 24314:dastore         
	// 15115 24315:dup             
	// 15116 24316:iconst_3        
	// 15117 24317:ldc2w           #319 <Double 11.2644424D>
	// 15118 24320:dastore         
	// 15119 24321:dup             
	// 15120 24322:iconst_4        
	// 15121 24323:ldc2w           #321 <Double 8.9614528999999994D>
	// 15122 24326:dastore         
	// 15123 24327:dup             
	// 15124 24328:iconst_5        
	// 15125 24329:ldc2w           #3805 <Double -0.95173609999999997D>
	// 15126 24332:dastore         
	// 15127 24333:dup             
	// 15128 24334:bipush          6
	// 15129 24336:ldc2w           #3807 <Double -29.695307D>
	// 15130 24339:dastore         
	// 15131 24340:dup             
	// 15132 24341:bipush          7
	// 15133 24343:ldc2w           #3809 <Double 238.44005730000001D>
	// 15134 24346:dastore         
	// 15135 24347:dup             
	// 15136 24348:bipush          8
	// 15137 24350:ldc2w           #329 <Double -0.22733419999999999D>
	// 15138 24353:dastore         
	// 15139 24354:aastore         
	// 15140 24355:dup             
	// 15141 24356:sipush          325
	// 15142 24359:bipush          9
	// 15143 24361:newarray        double[]
	// 15144 24363:dup             
	// 15145 24364:iconst_0        
	// 15146 24365:ldc2w           #3811 <Double -5.445881D>
	// 15147 24368:dastore         
	// 15148 24369:dup             
	// 15149 24370:iconst_1        
	// 15150 24371:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15151 24374:dastore         
	// 15152 24375:dup             
	// 15153 24376:iconst_2        
	// 15154 24377:ldc2w           #3813 <Double 1081.8381434999999D>
	// 15155 24380:dastore         
	// 15156 24381:dup             
	// 15157 24382:iconst_3        
	// 15158 24383:ldc2w           #15  <Double 19.625597299999999D>
	// 15159 24386:dastore         
	// 15160 24387:dup             
	// 15161 24388:iconst_4        
	// 15162 24389:ldc2w           #17  <Double 8.9143979000000009D>
	// 15163 24392:dastore         
	// 15164 24393:dup             
	// 15165 24394:iconst_5        
	// 15166 24395:ldc2w           #3815 <Double -0.65173610000000004D>
	// 15167 24398:dastore         
	// 15168 24399:dup             
	// 15169 24400:bipush          6
	// 15170 24402:ldc2w           #3817 <Double -28.039224699999998D>
	// 15171 24405:dastore         
	// 15172 24406:dup             
	// 15173 24407:bipush          7
	// 15174 24409:ldc2w           #3819 <Double 191.83558479999999D>
	// 15175 24412:dastore         
	// 15176 24413:dup             
	// 15177 24414:bipush          8
	// 15178 24416:ldc2w           #25  <Double -0.38996530000000001D>
	// 15179 24419:dastore         
	// 15180 24420:aastore         
	// 15181 24421:dup             
	// 15182 24422:sipush          326
	// 15183 24425:bipush          9
	// 15184 24427:newarray        double[]
	// 15185 24429:dup             
	// 15186 24430:iconst_0        
	// 15187 24431:ldc2w           #3821 <Double -5.1458810000000001D>
	// 15188 24434:dastore         
	// 15189 24435:dup             
	// 15190 24436:iconst_1        
	// 15191 24437:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15192 24440:dastore         
	// 15193 24441:dup             
	// 15194 24442:iconst_2        
	// 15195 24443:ldc2w           #3823 <Double 1046.8634646999999D>
	// 15196 24446:dastore         
	// 15197 24447:dup             
	// 15198 24448:iconst_3        
	// 15199 24449:ldc2w           #31  <Double 28.2628214D>
	// 15200 24452:dastore         
	// 15201 24453:dup             
	// 15202 24454:iconst_4        
	// 15203 24455:ldc2w           #33  <Double 8.8398648000000009D>
	// 15204 24458:dastore         
	// 15205 24459:dup             
	// 15206 24460:iconst_5        
	// 15207 24461:ldc2w           #3825 <Double -0.3517361D>
	// 15208 24464:dastore         
	// 15209 24465:dup             
	// 15210 24466:bipush          6
	// 15211 24468:ldc2w           #3827 <Double -24.255178699999998D>
	// 15212 24471:dastore         
	// 15213 24472:dup             
	// 15214 24473:bipush          7
	// 15215 24475:ldc2w           #3829 <Double 121.92576649999999D>
	// 15216 24478:dastore         
	// 15217 24479:dup             
	// 15218 24480:bipush          8
	// 15219 24482:ldc2w           #41  <Double -0.54830319999999999D>
	// 15220 24485:dastore         
	// 15221 24486:aastore         
	// 15222 24487:dup             
	// 15223 24488:sipush          327
	// 15224 24491:bipush          9
	// 15225 24493:newarray        double[]
	// 15226 24495:dup             
	// 15227 24496:iconst_0        
	// 15228 24497:ldc2w           #3831 <Double -4.8458810000000003D>
	// 15229 24500:dastore         
	// 15230 24501:dup             
	// 15231 24502:iconst_1        
	// 15232 24503:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15233 24506:dastore         
	// 15234 24507:dup             
	// 15235 24508:iconst_2        
	// 15236 24509:ldc2w           #3833 <Double 1011.888786D>
	// 15237 24512:dastore         
	// 15238 24513:dup             
	// 15239 24514:iconst_3        
	// 15240 24515:ldc2w           #47  <Double 37.305238799999998D>
	// 15241 24518:dastore         
	// 15242 24519:dup             
	// 15243 24520:iconst_4        
	// 15244 24521:ldc2w           #49  <Double 8.7346948999999992D>
	// 15245 24524:dastore         
	// 15246 24525:dup             
	// 15247 24526:iconst_5        
	// 15248 24527:ldc2w           #3835 <Double -0.0517361D>
	// 15249 24530:dastore         
	// 15250 24531:dup             
	// 15251 24532:bipush          6
	// 15252 24534:ldc2w           #3837 <Double -18.5961134D>
	// 15253 24537:dastore         
	// 15254 24538:dup             
	// 15255 24539:bipush          7
	// 15256 24541:ldc2w           #3839 <Double 18.905140800000002D>
	// 15257 24544:dastore         
	// 15258 24545:dup             
	// 15259 24546:bipush          8
	// 15260 24548:ldc2w           #57  <Double -0.70060560000000005D>
	// 15261 24551:dastore         
	// 15262 24552:aastore         
	// 15263 24553:dup             
	// 15264 24554:sipush          328
	// 15265 24557:bipush          9
	// 15266 24559:newarray        double[]
	// 15267 24561:dup             
	// 15268 24562:iconst_0        
	// 15269 24563:ldc2w           #3841 <Double -4.5458809999999996D>
	// 15270 24566:dastore         
	// 15271 24567:dup             
	// 15272 24568:iconst_1        
	// 15273 24569:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15274 24572:dastore         
	// 15275 24573:dup             
	// 15276 24574:iconst_2        
	// 15277 24575:ldc2w           #3843 <Double 976.91410719999999D>
	// 15278 24578:dastore         
	// 15279 24579:dup             
	// 15280 24580:iconst_3        
	// 15281 24581:ldc2w           #541 <Double 46.896400399999997D>
	// 15282 24584:dastore         
	// 15283 24585:dup             
	// 15284 24586:iconst_4        
	// 15285 24587:ldc2w           #543 <Double 8.5943556999999995D>
	// 15286 24590:dastore         
	// 15287 24591:dup             
	// 15288 24592:iconst_5        
	// 15289 24593:ldc2w           #3845 <Double 0.24826390000000001D>
	// 15290 24596:dastore         
	// 15291 24597:dup             
	// 15292 24598:bipush          6
	// 15293 24600:ldc2w           #3847 <Double -11.498513300000001D>
	// 15294 24603:dastore         
	// 15295 24604:dup             
	// 15296 24605:bipush          7
	// 15297 24607:ldc2w           #3849 <Double -122.074744D>
	// 15298 24610:dastore         
	// 15299 24611:dup             
	// 15300 24612:bipush          8
	// 15301 24614:ldc2w           #551 <Double -0.84519750000000005D>
	// 15302 24617:dastore         
	// 15303 24618:aastore         
	// 15304 24619:dup             
	// 15305 24620:sipush          329
	// 15306 24623:bipush          9
	// 15307 24625:newarray        double[]
	// 15308 24627:dup             
	// 15309 24628:iconst_0        
	// 15310 24629:ldc2w           #3851 <Double -4.2458809999999998D>
	// 15311 24632:dastore         
	// 15312 24633:dup             
	// 15313 24634:iconst_1        
	// 15314 24635:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15315 24638:dastore         
	// 15316 24639:dup             
	// 15317 24640:iconst_2        
	// 15318 24641:ldc2w           #3853 <Double 941.93942849999996D>
	// 15319 24644:dastore         
	// 15320 24645:dup             
	// 15321 24646:iconst_3        
	// 15322 24647:ldc2w           #63  <Double 57.2001287D>
	// 15323 24650:dastore         
	// 15324 24651:dup             
	// 15325 24652:iconst_4        
	// 15326 24653:ldc2w           #65  <Double 8.4126647000000006D>
	// 15327 24656:dastore         
	// 15328 24657:dup             
	// 15329 24658:iconst_5        
	// 15330 24659:ldc2w           #3855 <Double 0.54826390000000003D>
	// 15331 24662:dastore         
	// 15332 24663:dup             
	// 15333 24664:bipush          6
	// 15334 24666:ldc2w           #3857 <Double -3.5396765000000001D>
	// 15335 24669:dastore         
	// 15336 24670:dup             
	// 15337 24671:bipush          7
	// 15338 24673:ldc2w           #3859 <Double -299.45766839999999D>
	// 15339 24676:dastore         
	// 15340 24677:dup             
	// 15341 24678:bipush          8
	// 15342 24680:ldc2w           #73  <Double -0.98049019999999998D>
	// 15343 24683:dastore         
	// 15344 24684:aastore         
	// 15345 24685:dup             
	// 15346 24686:sipush          330
	// 15347 24689:bipush          9
	// 15348 24691:newarray        double[]
	// 15349 24693:dup             
	// 15350 24694:iconst_0        
	// 15351 24695:ldc2w           #3861 <Double -3.945881D>
	// 15352 24698:dastore         
	// 15353 24699:dup             
	// 15354 24700:iconst_1        
	// 15355 24701:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15356 24704:dastore         
	// 15357 24705:dup             
	// 15358 24706:iconst_2        
	// 15359 24707:ldc2w           #3863 <Double 906.96474969999997D>
	// 15360 24710:dastore         
	// 15361 24711:dup             
	// 15362 24712:iconst_3        
	// 15363 24713:ldc2w           #345 <Double 68.407805800000006D>
	// 15364 24716:dastore         
	// 15365 24717:dup             
	// 15366 24718:iconst_4        
	// 15367 24719:ldc2w           #347 <Double 8.1813959000000001D>
	// 15368 24722:dastore         
	// 15369 24723:dup             
	// 15370 24724:iconst_5        
	// 15371 24725:ldc2w           #3865 <Double 0.84826389999999996D>
	// 15372 24728:dastore         
	// 15373 24729:dup             
	// 15374 24730:bipush          6
	// 15375 24732:ldc2w           #3867 <Double 4.6187949000000001D>
	// 15376 24735:dastore         
	// 15377 24736:dup             
	// 15378 24737:bipush          7
	// 15379 24739:ldc2w           #3869 <Double -504.75972200000001D>
	// 15380 24742:dastore         
	// 15381 24743:dup             
	// 15382 24744:bipush          8
	// 15383 24746:ldc2w           #355 <Double -1.1049982D>
	// 15384 24749:dastore         
	// 15385 24750:aastore         
	// 15386 24751:dup             
	// 15387 24752:sipush          331
	// 15388 24755:bipush          9
	// 15389 24757:newarray        double[]
	// 15390 24759:dup             
	// 15391 24760:iconst_0        
	// 15392 24761:ldc2w           #3871 <Double -3.6458810000000001D>
	// 15393 24764:dastore         
	// 15394 24765:dup             
	// 15395 24766:iconst_1        
	// 15396 24767:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15397 24770:dastore         
	// 15398 24771:dup             
	// 15399 24772:iconst_2        
	// 15400 24773:ldc2w           #3873 <Double 871.99007099999994D>
	// 15401 24776:dastore         
	// 15402 24777:dup             
	// 15403 24778:iconst_3        
	// 15404 24779:ldc2w           #79  <Double 80.747736000000003D>
	// 15405 24782:dastore         
	// 15406 24783:dup             
	// 15407 24784:iconst_4        
	// 15408 24785:ldc2w           #81  <Double 7.8897272999999997D>
	// 15409 24788:dastore         
	// 15410 24789:dup             
	// 15411 24790:iconst_5        
	// 15412 24791:ldc2w           #3875 <Double 1.1482638999999999D>
	// 15413 24794:dastore         
	// 15414 24795:dup             
	// 15415 24796:bipush          6
	// 15416 24798:ldc2w           #3877 <Double 12.2957573D>
	// 15417 24801:dastore         
	// 15418 24802:dup             
	// 15419 24803:bipush          7
	// 15420 24805:ldc2w           #3879 <Double -723.08823159999997D>
	// 15421 24808:dastore         
	// 15422 24809:dup             
	// 15423 24810:bipush          8
	// 15424 24812:ldc2w           #89  <Double -1.2173562D>
	// 15425 24815:dastore         
	// 15426 24816:aastore         
	// 15427 24817:dup             
	// 15428 24818:sipush          332
	// 15429 24821:aload           146
	// 15430 24823:aastore         
	// 15431 24824:dup             
	// 15432 24825:sipush          333
	// 15433 24828:bipush          9
	// 15434 24830:newarray        double[]
	// 15435 24832:dup             
	// 15436 24833:iconst_0        
	// 15437 24834:ldc2w           #3881 <Double -3.0458810000000001D>
	// 15438 24837:dastore         
	// 15439 24838:dup             
	// 15440 24839:iconst_1        
	// 15441 24840:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15442 24843:dastore         
	// 15443 24844:dup             
	// 15444 24845:iconst_2        
	// 15445 24846:ldc2w           #3883 <Double 802.04071350000004D>
	// 15446 24849:dastore         
	// 15447 24850:dup             
	// 15448 24851:iconst_3        
	// 15449 24852:ldc2w           #111 <Double 110.00047410000001D>
	// 15450 24855:dastore         
	// 15451 24856:dup             
	// 15452 24857:iconst_4        
	// 15453 24858:ldc2w           #113 <Double 7.0639795000000003D>
	// 15454 24861:dastore         
	// 15455 24862:dup             
	// 15456 24863:iconst_5        
	// 15457 24864:ldc2w           #3885 <Double 1.7482639D>
	// 15458 24867:dastore         
	// 15459 24868:dup             
	// 15460 24869:bipush          6
	// 15461 24871:ldc2w           #3887 <Double 23.778309100000001D>
	// 15462 24874:dastore         
	// 15463 24875:dup             
	// 15464 24876:bipush          7
	// 15465 24878:ldc2w           #3889 <Double -1117.3162970999999D>
	// 15466 24881:dastore         
	// 15467 24882:dup             
	// 15468 24883:bipush          8
	// 15469 24885:ldc2w           #121 <Double -1.4008494D>
	// 15470 24888:dastore         
	// 15471 24889:aastore         
	// 15472 24890:dup             
	// 15473 24891:sipush          334
	// 15474 24894:bipush          9
	// 15475 24896:newarray        double[]
	// 15476 24898:dup             
	// 15477 24899:iconst_0        
	// 15478 24900:ldc2w           #3891 <Double -2.7458809999999998D>
	// 15479 24903:dastore         
	// 15480 24904:dup             
	// 15481 24905:iconst_1        
	// 15482 24906:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15483 24909:dastore         
	// 15484 24910:dup             
	// 15485 24911:iconst_2        
	// 15486 24912:ldc2w           #3893 <Double 767.06603470000005D>
	// 15487 24915:dastore         
	// 15488 24916:dup             
	// 15489 24917:iconst_3        
	// 15490 24918:ldc2w           #127 <Double 127.6888198D>
	// 15491 24921:dastore         
	// 15492 24922:dup             
	// 15493 24923:iconst_4        
	// 15494 24924:ldc2w           #129 <Double 6.4866308999999998D>
	// 15495 24927:dastore         
	// 15496 24928:dup             
	// 15497 24929:iconst_5        
	// 15498 24930:ldc2w           #3895 <Double 2.0482638999999998D>
	// 15499 24933:dastore         
	// 15500 24934:dup             
	// 15501 24935:bipush          6
	// 15502 24937:ldc2w           #3897 <Double 26.694835000000001D>
	// 15503 24940:dastore         
	// 15504 24941:dup             
	// 15505 24942:bipush          7
	// 15506 24944:ldc2w           #3899 <Double -1249.2844055999999D>
	// 15507 24947:dastore         
	// 15508 24948:dup             
	// 15509 24949:bipush          8
	// 15510 24951:ldc2w           #137 <Double -1.4699811D>
	// 15511 24954:dastore         
	// 15512 24955:aastore         
	// 15513 24956:dup             
	// 15514 24957:sipush          335
	// 15515 24960:bipush          9
	// 15516 24962:newarray        double[]
	// 15517 24964:dup             
	// 15518 24965:iconst_0        
	// 15519 24966:ldc2w           #3901 <Double -2.445881D>
	// 15520 24969:dastore         
	// 15521 24970:dup             
	// 15522 24971:iconst_1        
	// 15523 24972:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15524 24975:dastore         
	// 15525 24976:dup             
	// 15526 24977:iconst_2        
	// 15527 24978:ldc2w           #3903 <Double 732.09135600000002D>
	// 15528 24981:dastore         
	// 15529 24982:dup             
	// 15530 24983:iconst_3        
	// 15531 24984:ldc2w           #463 <Double 148.1152635D>
	// 15532 24987:dastore         
	// 15533 24988:dup             
	// 15534 24989:iconst_4        
	// 15535 24990:ldc2w           #465 <Double 5.7586041999999997D>
	// 15536 24993:dastore         
	// 15537 24994:dup             
	// 15538 24995:iconst_5        
	// 15539 24996:ldc2w           #3905 <Double 2.3482639000000001D>
	// 15540 24999:dastore         
	// 15541 25000:dup             
	// 15542 25001:bipush          6
	// 15543 25003:ldc2w           #3907 <Double 27.438752699999998D>
	// 15544 25006:dastore         
	// 15545 25007:dup             
	// 15546 25008:bipush          7
	// 15547 25010:ldc2w           #3909 <Double -1312.5960477000001D>
	// 15548 25013:dastore         
	// 15549 25014:dup             
	// 15550 25015:bipush          8
	// 15551 25017:ldc2w           #473 <Double -1.5229775000000001D>
	// 15552 25020:dastore         
	// 15553 25021:aastore         
	// 15554 25022:dup             
	// 15555 25023:sipush          336
	// 15556 25026:aload           147
	// 15557 25028:aastore         
	// 15558 25029:dup             
	// 15559 25030:sipush          337
	// 15560 25033:aload           148
	// 15561 25035:aastore         
	// 15562 25036:dup             
	// 15563 25037:sipush          338
	// 15564 25040:bipush          9
	// 15565 25042:newarray        double[]
	// 15566 25044:dup             
	// 15567 25045:iconst_0        
	// 15568 25046:ldc2w           #3911 <Double -1.5458810000000001D>
	// 15569 25049:dastore         
	// 15570 25050:dup             
	// 15571 25051:iconst_1        
	// 15572 25052:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15573 25055:dastore         
	// 15574 25056:dup             
	// 15575 25057:iconst_2        
	// 15576 25058:ldc2w           #3913 <Double 627.16731970000001D>
	// 15577 25061:dastore         
	// 15578 25062:dup             
	// 15579 25063:iconst_3        
	// 15580 25064:ldc2w           #159 <Double 234.27778710000001D>
	// 15581 25067:dastore         
	// 15582 25068:dup             
	// 15583 25069:iconst_4        
	// 15584 25070:ldc2w           #161 <Double 2.1401053000000001D>
	// 15585 25073:dastore         
	// 15586 25074:dup             
	// 15587 25075:iconst_5        
	// 15588 25076:ldc2w           #3915 <Double 3.2482639D>
	// 15589 25079:dastore         
	// 15590 25080:dup             
	// 15591 25081:bipush          6
	// 15592 25083:ldc2w           #3917 <Double 18.098041299999998D>
	// 15593 25086:dastore         
	// 15594 25087:dup             
	// 15595 25088:bipush          7
	// 15596 25090:ldc2w           #3919 <Double -1024.4601307D>
	// 15597 25093:dastore         
	// 15598 25094:dup             
	// 15599 25095:bipush          8
	// 15600 25097:ldc2w           #169 <Double -1.5803442000000001D>
	// 15601 25100:dastore         
	// 15602 25101:aastore         
	// 15603 25102:dup             
	// 15604 25103:sipush          339
	// 15605 25106:bipush          9
	// 15606 25108:newarray        double[]
	// 15607 25110:dup             
	// 15608 25111:iconst_0        
	// 15609 25112:ldc2w           #3921 <Double -1.245881D>
	// 15610 25115:dastore         
	// 15611 25116:dup             
	// 15612 25117:iconst_1        
	// 15613 25118:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15614 25121:dastore         
	// 15615 25122:dup             
	// 15616 25123:iconst_2        
	// 15617 25124:ldc2w           #3923 <Double 592.19264099999998D>
	// 15618 25127:dastore         
	// 15619 25128:dup             
	// 15620 25129:iconst_3        
	// 15621 25130:ldc2w           #175 <Double 275.7268449D>
	// 15622 25133:dastore         
	// 15623 25134:dup             
	// 15624 25135:iconst_4        
	// 15625 25136:ldc2w           #177 <Double 0.1651599D>
	// 15626 25139:dastore         
	// 15627 25140:dup             
	// 15628 25141:iconst_5        
	// 15629 25142:ldc2w           #3925 <Double 3.5482638999999998D>
	// 15630 25145:dastore         
	// 15631 25146:dup             
	// 15632 25147:bipush          6
	// 15633 25149:ldc2w           #3927 <Double 12.5392045D>
	// 15634 25152:dastore         
	// 15635 25153:dup             
	// 15636 25154:bipush          7
	// 15637 25156:ldc2w           #3929 <Double -796.71068639999999D>
	// 15638 25159:dastore         
	// 15639 25160:dup             
	// 15640 25161:bipush          8
	// 15641 25163:ldc2w           #185 <Double -1.5649227999999999D>
	// 15642 25166:dastore         
	// 15643 25167:aastore         
	// 15644 25168:dup             
	// 15645 25169:sipush          340
	// 15646 25172:bipush          9
	// 15647 25174:newarray        double[]
	// 15648 25176:dup             
	// 15649 25177:iconst_0        
	// 15650 25178:ldc2w           #3931 <Double -0.94588099999999997D>
	// 15651 25181:dastore         
	// 15652 25182:dup             
	// 15653 25183:iconst_1        
	// 15654 25184:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15655 25187:dastore         
	// 15656 25188:dup             
	// 15657 25189:iconst_2        
	// 15658 25190:ldc2w           #3933 <Double 557.21796219999999D>
	// 15659 25193:dastore         
	// 15660 25194:dup             
	// 15661 25195:iconst_3        
	// 15662 25196:ldc2w           #291 <Double 327.13300479999998D>
	// 15663 25199:dastore         
	// 15664 25200:dup             
	// 15665 25201:iconst_4        
	// 15666 25202:ldc2w           #293 <Double -2.4385346000000001D>
	// 15667 25205:dastore         
	// 15668 25206:dup             
	// 15669 25207:iconst_5        
	// 15670 25208:ldc2w           #3935 <Double 3.8482639000000001D>
	// 15671 25211:dastore         
	// 15672 25212:dup             
	// 15673 25213:bipush          6
	// 15674 25215:ldc2w           #3937 <Double 6.7807331D>
	// 15675 25218:dastore         
	// 15676 25219:dup             
	// 15677 25220:bipush          7
	// 15678 25222:ldc2w           #3939 <Double -542.25307350000003D>
	// 15679 25225:dastore         
	// 15680 25226:dup             
	// 15681 25227:bipush          8
	// 15682 25229:ldc2w           #301 <Double -1.5323681D>
	// 15683 25232:dastore         
	// 15684 25233:aastore         
	// 15685 25234:dup             
	// 15686 25235:sipush          341
	// 15687 25238:bipush          9
	// 15688 25240:newarray        double[]
	// 15689 25242:dup             
	// 15690 25243:iconst_0        
	// 15691 25244:ldc2w           #3941 <Double -0.64588100000000004D>
	// 15692 25247:dastore         
	// 15693 25248:dup             
	// 15694 25249:iconst_1        
	// 15695 25250:ldc2w           #1619 <Double 3.1582262000000001D>
	// 15696 25253:dastore         
	// 15697 25254:dup             
	// 15698 25255:iconst_2        
	// 15699 25256:ldc2w           #3943 <Double 522.24328349999996D>
	// 15700 25259:dastore         
	// 15701 25260:dup             
	// 15702 25261:iconst_3        
	// 15703 25262:ldc2w           #191 <Double 392.10647540000002D>
	// 15704 25265:dastore         
	// 15705 25266:dup             
	// 15706 25267:iconst_4        
	// 15707 25268:ldc2w           #193 <Double -5.9244687000000003D>
	// 15708 25271:dastore         
	// 15709 25272:dup             
	// 15710 25273:iconst_5        
	// 15711 25274:ldc2w           #3945 <Double 4.1482638999999999D>
	// 15712 25277:dastore         
	// 15713 25278:dup             
	// 15714 25279:bipush          6
	// 15715 25281:ldc2w           #3947 <Double 1.5037707D>
	// 15716 25284:dastore         
	// 15717 25285:dup             
	// 15718 25286:bipush          7
	// 15719 25288:ldc2w           #3949 <Double -296.4142751D>
	// 15720 25291:dastore         
	// 15721 25292:dup             
	// 15722 25293:bipush          8
	// 15723 25295:ldc2w           #201 <Double -1.4830451D>
	// 15724 25298:dastore         
	// 15725 25299:aastore         
	// 15726 25300:dup             
	// 15727 25301:sipush          342
	// 15728 25304:aload           149
	// 15729 25306:aastore         
	// 15730 25307:dup             
	// 15731 25308:sipush          343
	// 15732 25311:bipush          9
	// 15733 25313:newarray        double[]
	// 15734 25315:dup             
	// 15735 25316:iconst_0        
	// 15736 25317:ldc2w           #3951 <Double -10.804053D>
	// 15737 25320:dastore         
	// 15738 25321:dup             
	// 15739 25322:iconst_1        
	// 15740 25323:ldc2w           #1651 <Double 3.5867140000000002D>
	// 15741 25326:dastore         
	// 15742 25327:dup             
	// 15743 25328:iconst_2        
	// 15744 25329:ldc2w           #3953 <Double 1746.770436D>
	// 15745 25332:dastore         
	// 15746 25333:dup             
	// 15747 25334:iconst_3        
	// 15748 25335:ldc2w           #319 <Double 11.2644424D>
	// 15749 25338:dastore         
	// 15750 25339:dup             
	// 15751 25340:iconst_4        
	// 15752 25341:ldc2w           #321 <Double 8.9614528999999994D>
	// 15753 25344:dastore         
	// 15754 25345:dup             
	// 15755 25346:iconst_5        
	// 15756 25347:ldc2w           #3955 <Double -0.95342360000000004D>
	// 15757 25350:dastore         
	// 15758 25351:dup             
	// 15759 25352:bipush          6
	// 15760 25354:ldc2w           #3957 <Double -29.395259299999999D>
	// 15761 25357:dastore         
	// 15762 25358:dup             
	// 15763 25359:bipush          7
	// 15764 25361:ldc2w           #3959 <Double 237.07571759999999D>
	// 15765 25364:dastore         
	// 15766 25365:dup             
	// 15767 25366:bipush          8
	// 15768 25368:ldc2w           #329 <Double -0.22733419999999999D>
	// 15769 25371:dastore         
	// 15770 25372:aastore         
	// 15771 25373:dup             
	// 15772 25374:sipush          344
	// 15773 25377:bipush          9
	// 15774 25379:newarray        double[]
	// 15775 25381:dup             
	// 15776 25382:iconst_0        
	// 15777 25383:ldc2w           #3961 <Double -10.504053000000001D>
	// 15778 25386:dastore         
	// 15779 25387:dup             
	// 15780 25388:iconst_1        
	// 15781 25389:ldc2w           #1651 <Double 3.5867140000000002D>
	// 15782 25392:dastore         
	// 15783 25393:dup             
	// 15784 25394:iconst_2        
	// 15785 25395:ldc2w           #3963 <Double 1710.5102939999999D>
	// 15786 25398:dastore         
	// 15787 25399:dup             
	// 15788 25400:iconst_3        
	// 15789 25401:ldc2w           #15  <Double 19.625597299999999D>
	// 15790 25404:dastore         
	// 15791 25405:dup             
	// 15792 25406:iconst_4        
	// 15793 25407:ldc2w           #17  <Double 8.9143979000000009D>
	// 15794 25410:dastore         
	// 15795 25411:dup             
	// 15796 25412:iconst_5        
	// 15797 25413:ldc2w           #3965 <Double -0.65342359999999999D>
	// 15798 25416:dastore         
	// 15799 25417:dup             
	// 15800 25418:bipush          6
	// 15801 25420:ldc2w           #3967 <Double -27.7391769D>
	// 15802 25423:dastore         
	// 15803 25424:dup             
	// 15804 25425:bipush          7
	// 15805 25427:ldc2w           #3969 <Double 189.571102D>
	// 15806 25430:dastore         
	// 15807 25431:dup             
	// 15808 25432:bipush          8
	// 15809 25434:ldc2w           #25  <Double -0.38996530000000001D>
	// 15810 25437:dastore         
	// 15811 25438:aastore         
	// 15812 25439:dup             
	// 15813 25440:sipush          345
	// 15814 25443:aload           150
	// 15815 25445:aastore         
	// 15816 25446:dup             
	// 15817 25447:sipush          346
	// 15818 25450:bipush          9
	// 15819 25452:newarray        double[]
	// 15820 25454:dup             
	// 15821 25455:iconst_0        
	// 15822 25456:ldc2w           #3971 <Double -9.9040529999999993D>
	// 15823 25459:dastore         
	// 15824 25460:dup             
	// 15825 25461:iconst_1        
	// 15826 25462:ldc2w           #1651 <Double 3.5867140000000002D>
	// 15827 25465:dastore         
	// 15828 25466:dup             
	// 15829 25467:iconst_2        
	// 15830 25468:ldc2w           #3973 <Double 1637.99001D>
	// 15831 25471:dastore         
	// 15832 25472:dup             
	// 15833 25473:iconst_3        
	// 15834 25474:ldc2w           #47  <Double 37.305238799999998D>
	// 15835 25477:dastore         
	// 15836 25478:dup             
	// 15837 25479:iconst_4        
	// 15838 25480:ldc2w           #49  <Double 8.7346948999999992D>
	// 15839 25483:dastore         
	// 15840 25484:dup             
	// 15841 25485:iconst_5        
	// 15842 25486:ldc2w           #3975 <Double -0.053423600000000002D>
	// 15843 25489:dastore         
	// 15844 25490:dup             
	// 15845 25491:bipush          6
	// 15846 25493:ldc2w           #3977 <Double -18.2960657D>
	// 15847 25496:dastore         
	// 15848 25497:dup             
	// 15849 25498:bipush          7
	// 15850 25500:ldc2w           #3979 <Double 14.8403718D>
	// 15851 25503:dastore         
	// 15852 25504:dup             
	// 15853 25505:bipush          8
	// 15854 25507:ldc2w           #57  <Double -0.70060560000000005D>
	// 15855 25510:dastore         
	// 15856 25511:aastore         
	// 15857 25512:dup             
	// 15858 25513:sipush          347
	// 15859 25516:bipush          9
	// 15860 25518:newarray        double[]
	// 15861 25520:dup             
	// 15862 25521:iconst_0        
	// 15863 25522:ldc2w           #3981 <Double -9.6040530000000004D>
	// 15864 25525:dastore         
	// 15865 25526:dup             
	// 15866 25527:iconst_1        
	// 15867 25528:ldc2w           #1651 <Double 3.5867140000000002D>
	// 15868 25531:dastore         
	// 15869 25532:dup             
	// 15870 25533:iconst_2        
	// 15871 25534:ldc2w           #3983 <Double 1601.7298679999999D>
	// 15872 25537:dastore         
	// 15873 25538:dup             
	// 15874 25539:iconst_3        
	// 15875 25540:ldc2w           #541 <Double 46.896400399999997D>
	// 15876 25543:dastore         
	// 15877 25544:dup             
	// 15878 25545:iconst_4        
	// 15879 25546:ldc2w           #543 <Double 8.5943556999999995D>
	// 15880 25549:dastore         
	// 15881 25550:dup             
	// 15882 25551:iconst_5        
	// 15883 25552:ldc2w           #3985 <Double 0.2465764D>
	// 15884 25555:dastore         
	// 15885 25556:dup             
	// 15886 25557:bipush          6
	// 15887 25559:ldc2w           #3987 <Double -11.1984656D>
	// 15888 25562:dastore         
	// 15889 25563:dup             
	// 15890 25564:bipush          7
	// 15891 25566:ldc2w           #3989 <Double -127.0396562D>
	// 15892 25569:dastore         
	// 15893 25570:dup             
	// 15894 25571:bipush          8
	// 15895 25573:ldc2w           #551 <Double -0.84519750000000005D>
	// 15896 25576:dastore         
	// 15897 25577:aastore         
	// 15898 25578:dup             
	// 15899 25579:sipush          348
	// 15900 25582:aload           151
	// 15901 25584:aastore         
	// 15902 25585:dup             
	// 15903 25586:sipush          349
	// 15904 25589:bipush          9
	// 15905 25591:newarray        double[]
	// 15906 25593:dup             
	// 15907 25594:iconst_0        
	// 15908 25595:ldc2w           #3991 <Double -9.0040530000000008D>
	// 15909 25598:dastore         
	// 15910 25599:dup             
	// 15911 25600:iconst_1        
	// 15912 25601:ldc2w           #1651 <Double 3.5867140000000002D>
	// 15913 25604:dastore         
	// 15914 25605:dup             
	// 15915 25606:iconst_2        
	// 15916 25607:ldc2w           #3993 <Double 1529.2095839999999D>
	// 15917 25610:dastore         
	// 15918 25611:dup             
	// 15919 25612:iconst_3        
	// 15920 25613:ldc2w           #345 <Double 68.407805800000006D>
	// 15921 25616:dastore         
	// 15922 25617:dup             
	// 15923 25618:iconst_4        
	// 15924 25619:ldc2w           #347 <Double 8.1813959000000001D>
	// 15925 25622:dastore         
	// 15926 25623:dup             
	// 15927 25624:iconst_5        
	// 15928 25625:ldc2w           #3995 <Double 0.84657640000000001D>
	// 15929 25628:dastore         
	// 15930 25629:dup             
	// 15931 25630:bipush          6
	// 15932 25632:ldc2w           #3997 <Double 4.9188425999999996D>
	// 15933 25635:dastore         
	// 15934 25636:dup             
	// 15935 25637:bipush          7
	// 15936 25639:ldc2w           #3999 <Double -511.52492050000001D>
	// 15937 25642:dastore         
	// 15938 25643:dup             
	// 15939 25644:bipush          8
	// 15940 25646:ldc2w           #355 <Double -1.1049982D>
	// 15941 25649:dastore         
	// 15942 25650:aastore         
	// 15943 25651:dup             
	// 15944 25652:sipush          350
	// 15945 25655:aload           152
	// 15946 25657:aastore         
	// 15947 25658:dup             
	// 15948 25659:sipush          351
	// 15949 25662:bipush          9
	// 15950 25664:newarray        double[]
	// 15951 25666:dup             
	// 15952 25667:iconst_0        
	// 15953 25668:ldc2w           #4001 <Double -8.4040529999999993D>
	// 15954 25671:dastore         
	// 15955 25672:dup             
	// 15956 25673:iconst_1        
	// 15957 25674:ldc2w           #1651 <Double 3.5867140000000002D>
	// 15958 25677:dastore         
	// 15959 25678:dup             
	// 15960 25679:iconst_2        
	// 15961 25680:ldc2w           #4003 <Double 1456.6893D>
	// 15962 25683:dastore         
	// 15963 25684:dup             
	// 15964 25685:iconst_3        
	// 15965 25686:ldc2w           #95  <Double 94.497482399999996D>
	// 15966 25689:dastore         
	// 15967 25690:dup             
	// 15968 25691:iconst_4        
	// 15969 25692:ldc2w           #97  <Double 7.5234689000000001D>
	// 15970 25695:dastore         
	// 15971 25696:dup             
	// 15972 25697:iconst_5        
	// 15973 25698:ldc2w           #4005 <Double 1.4465764000000001D>
	// 15974 25701:dastore         
	// 15975 25702:dup             
	// 15976 25703:bipush          6
	// 15977 25705:ldc2w           #4007 <Double 19.157248200000002D>
	// 15978 25708:dastore         
	// 15979 25709:dup             
	// 15980 25710:bipush          7
	// 15981 25712:ldc2w           #4009 <Double -943.24781970000004D>
	// 15982 25715:dastore         
	// 15983 25716:dup             
	// 15984 25717:bipush          8
	// 15985 25719:ldc2w           #105 <Double -1.3163339000000001D>
	// 15986 25722:dastore         
	// 15987 25723:aastore         
	// 15988 25724:dup             
	// 15989 25725:sipush          352
	// 15990 25728:bipush          9
	// 15991 25730:newarray        double[]
	// 15992 25732:dup             
	// 15993 25733:iconst_0        
	// 15994 25734:ldc2w           #4011 <Double -8.1040530000000004D>
	// 15995 25737:dastore         
	// 15996 25738:dup             
	// 15997 25739:iconst_1        
	// 15998 25740:ldc2w           #1651 <Double 3.5867140000000002D>
	// 15999 25743:dastore         
	// 16000 25744:dup             
	// 16001 25745:iconst_2        
	// 16002 25746:ldc2w           #4013 <Double 1420.4291579000001D>
	// 16003 25749:dastore         
	// 16004 25750:dup             
	// 16005 25751:iconst_3        
	// 16006 25752:ldc2w           #111 <Double 110.00047410000001D>
	// 16007 25755:dastore         
	// 16008 25756:dup             
	// 16009 25757:iconst_4        
	// 16010 25758:ldc2w           #113 <Double 7.0639795000000003D>
	// 16011 25761:dastore         
	// 16012 25762:dup             
	// 16013 25763:iconst_5        
	// 16014 25764:ldc2w           #4015 <Double 1.7465763999999999D>
	// 16015 25767:dastore         
	// 16016 25768:dup             
	// 16017 25769:bipush          6
	// 16018 25771:ldc2w           #4017 <Double 24.078356800000002D>
	// 16019 25774:dastore         
	// 16020 25775:dup             
	// 16021 25776:bipush          7
	// 16022 25778:ldc2w           #4019 <Double -1126.7819248999999D>
	// 16023 25781:dastore         
	// 16024 25782:dup             
	// 16025 25783:bipush          8
	// 16026 25785:ldc2w           #121 <Double -1.4008494D>
	// 16027 25788:dastore         
	// 16028 25789:aastore         
	// 16029 25790:dup             
	// 16030 25791:sipush          353
	// 16031 25794:aload           153
	// 16032 25796:aastore         
	// 16033 25797:dup             
	// 16034 25798:sipush          354
	// 16035 25801:bipush          9
	// 16036 25803:newarray        double[]
	// 16037 25805:dup             
	// 16038 25806:iconst_0        
	// 16039 25807:ldc2w           #4021 <Double -7.5040529999999999D>
	// 16040 25810:dastore         
	// 16041 25811:dup             
	// 16042 25812:iconst_1        
	// 16043 25813:ldc2w           #1651 <Double 3.5867140000000002D>
	// 16044 25816:dastore         
	// 16045 25817:dup             
	// 16046 25818:iconst_2        
	// 16047 25819:ldc2w           #4023 <Double 1347.9088738999999D>
	// 16048 25822:dastore         
	// 16049 25823:dup             
	// 16050 25824:iconst_3        
	// 16051 25825:ldc2w           #463 <Double 148.1152635D>
	// 16052 25828:dastore         
	// 16053 25829:dup             
	// 16054 25830:iconst_4        
	// 16055 25831:ldc2w           #465 <Double 5.7586041999999997D>
	// 16056 25834:dastore         
	// 16057 25835:dup             
	// 16058 25836:iconst_5        
	// 16059 25837:ldc2w           #4025 <Double 2.3465764D>
	// 16060 25840:dastore         
	// 16061 25841:dup             
	// 16062 25842:bipush          6
	// 16063 25844:ldc2w           #4027 <Double 27.738800399999999D>
	// 16064 25847:dastore         
	// 16065 25848:dup             
	// 16066 25849:bipush          7
	// 16067 25851:ldc2w           #4029 <Double -1323.8619616999999D>
	// 16068 25854:dastore         
	// 16069 25855:dup             
	// 16070 25856:bipush          8
	// 16071 25858:ldc2w           #473 <Double -1.5229775000000001D>
	// 16072 25861:dastore         
	// 16073 25862:aastore         
	// 16074 25863:dup             
	// 16075 25864:sipush          355
	// 16076 25867:bipush          9
	// 16077 25869:newarray        double[]
	// 16078 25871:dup             
	// 16079 25872:iconst_0        
	// 16080 25873:ldc2w           #4031 <Double -7.204053D>
	// 16081 25876:dastore         
	// 16082 25877:dup             
	// 16083 25878:iconst_1        
	// 16084 25879:ldc2w           #1651 <Double 3.5867140000000002D>
	// 16085 25882:dastore         
	// 16086 25883:dup             
	// 16087 25884:iconst_2        
	// 16088 25885:ldc2w           #4033 <Double 1311.6487319D>
	// 16089 25888:dastore         
	// 16090 25889:dup             
	// 16091 25890:iconst_3        
	// 16092 25891:ldc2w           #143 <Double 171.99884599999999D>
	// 16093 25894:dastore         
	// 16094 25895:dup             
	// 16095 25896:iconst_4        
	// 16096 25897:ldc2w           #145 <Double 4.8356763999999997D>
	// 16097 25900:dastore         
	// 16098 25901:dup             
	// 16099 25902:iconst_5        
	// 16100 25903:ldc2w           #4035 <Double 2.6465763999999998D>
	// 16101 25906:dastore         
	// 16102 25907:dup             
	// 16103 25908:bipush          6
	// 16104 25910:ldc2w           #4037 <Double 26.354754400000001D>
	// 16105 25913:dastore         
	// 16106 25914:dup             
	// 16107 25915:bipush          7
	// 16108 25917:ldc2w           #4039 <Double -1308.1294909000001D>
	// 16109 25920:dastore         
	// 16110 25921:dup             
	// 16111 25922:bipush          8
	// 16112 25924:ldc2w           #153 <Double -1.5592649999999999D>
	// 16113 25927:dastore         
	// 16114 25928:aastore         
	// 16115 25929:dup             
	// 16116 25930:sipush          356
	// 16117 25933:aload           154
	// 16118 25935:aastore         
	// 16119 25936:dup             
	// 16120 25937:sipush          357
	// 16121 25940:bipush          9
	// 16122 25942:newarray        double[]
	// 16123 25944:dup             
	// 16124 25945:iconst_0        
	// 16125 25946:ldc2w           #4041 <Double -6.6040530000000004D>
	// 16126 25949:dastore         
	// 16127 25950:dup             
	// 16128 25951:iconst_1        
	// 16129 25952:ldc2w           #1651 <Double 3.5867140000000002D>
	// 16130 25955:dastore         
	// 16131 25956:dup             
	// 16132 25957:iconst_2        
	// 16133 25958:ldc2w           #4043 <Double 1239.1284479000001D>
	// 16134 25961:dastore         
	// 16135 25962:dup             
	// 16136 25963:iconst_3        
	// 16137 25964:ldc2w           #159 <Double 234.27778710000001D>
	// 16138 25967:dastore         
	// 16139 25968:dup             
	// 16140 25969:iconst_4        
	// 16141 25970:ldc2w           #161 <Double 2.1401053000000001D>
	// 16142 25973:dastore         
	// 16143 25974:dup             
	// 16144 25975:iconst_5        
	// 16145 25976:ldc2w           #4045 <Double 3.2465763999999999D>
	// 16146 25979:dastore         
	// 16147 25980:dup             
	// 16148 25981:bipush          6
	// 16149 25983:ldc2w           #4047 <Double 18.398088999999999D>
	// 16150 25986:dastore         
	// 16151 25987:dup             
	// 16152 25988:bipush          7
	// 16153 25990:ldc2w           #4049 <Double -1038.4264741D>
	// 16154 25993:dastore         
	// 16155 25994:dup             
	// 16156 25995:bipush          8
	// 16157 25997:ldc2w           #169 <Double -1.5803442000000001D>
	// 16158 26000:dastore         
	// 16159 26001:aastore         
	// 16160 26002:dup             
	// 16161 26003:sipush          358
	// 16162 26006:bipush          9
	// 16163 26008:newarray        double[]
	// 16164 26010:dup             
	// 16165 26011:iconst_0        
	// 16166 26012:ldc2w           #4051 <Double -6.3040529999999997D>
	// 16167 26015:dastore         
	// 16168 26016:dup             
	// 16169 26017:iconst_1        
	// 16170 26018:ldc2w           #1651 <Double 3.5867140000000002D>
	// 16171 26021:dastore         
	// 16172 26022:dup             
	// 16173 26023:iconst_2        
	// 16174 26024:ldc2w           #4053 <Double 1202.8683059D>
	// 16175 26027:dastore         
	// 16176 26028:dup             
	// 16177 26029:iconst_3        
	// 16178 26030:ldc2w           #175 <Double 275.7268449D>
	// 16179 26033:dastore         
	// 16180 26034:dup             
	// 16181 26035:iconst_4        
	// 16182 26036:ldc2w           #177 <Double 0.1651599D>
	// 16183 26039:dastore         
	// 16184 26040:dup             
	// 16185 26041:iconst_5        
	// 16186 26042:ldc2w           #4055 <Double 3.5465764000000002D>
	// 16187 26045:dastore         
	// 16188 26046:dup             
	// 16189 26047:bipush          6
	// 16190 26049:ldc2w           #4057 <Double 12.839252200000001D>
	// 16191 26052:dastore         
	// 16192 26053:dup             
	// 16193 26054:bipush          7
	// 16194 26056:ldc2w           #4059 <Double -811.57717290000005D>
	// 16195 26059:dastore         
	// 16196 26060:dup             
	// 16197 26061:bipush          8
	// 16198 26063:ldc2w           #185 <Double -1.5649227999999999D>
	// 16199 26066:dastore         
	// 16200 26067:aastore         
	// 16201 26068:dup             
	// 16202 26069:sipush          359
	// 16203 26072:bipush          9
	// 16204 26074:newarray        double[]
	// 16205 26076:dup             
	// 16206 26077:iconst_0        
	// 16207 26078:ldc2w           #4061 <Double -6.0040529999999999D>
	// 16208 26081:dastore         
	// 16209 26082:dup             
	// 16210 26083:iconst_1        
	// 16211 26084:ldc2w           #1651 <Double 3.5867140000000002D>
	// 16212 26087:dastore         
	// 16213 26088:dup             
	// 16214 26089:iconst_2        
	// 16215 26090:ldc2w           #4063 <Double 1166.6081638999999D>
	// 16216 26093:dastore         
	// 16217 26094:dup             
	// 16218 26095:iconst_3        
	// 16219 26096:ldc2w           #291 <Double 327.13300479999998D>
	// 16220 26099:dastore         
	// 16221 26100:dup             
	// 16222 26101:iconst_4        
	// 16223 26102:ldc2w           #293 <Double -2.4385346000000001D>
	// 16224 26105:dastore         
	// 16225 26106:dup             
	// 16226 26107:iconst_5        
	// 16227 26108:ldc2w           #4065 <Double 3.8465764D>
	// 16228 26111:dastore         
	// 16229 26112:dup             
	// 16230 26113:bipush          6
	// 16231 26115:ldc2w           #4067 <Double 7.0807808000000003D>
	// 16232 26118:dastore         
	// 16233 26119:dup             
	// 16234 26120:bipush          7
	// 16235 26122:ldc2w           #4069 <Double -558.01970300000005D>
	// 16236 26125:dastore         
	// 16237 26126:dup             
	// 16238 26127:bipush          8
	// 16239 26129:ldc2w           #301 <Double -1.5323681D>
	// 16240 26132:dastore         
	// 16241 26133:aastore         
	// 16242 26134:dup             
	// 16243 26135:sipush          360
	// 16244 26138:bipush          9
	// 16245 26140:newarray        double[]
	// 16246 26142:dup             
	// 16247 26143:iconst_0        
	// 16248 26144:ldc2w           #4071 <Double -5.704053D>
	// 16249 26147:dastore         
	// 16250 26148:dup             
	// 16251 26149:iconst_1        
	// 16252 26150:ldc2w           #1651 <Double 3.5867140000000002D>
	// 16253 26153:dastore         
	// 16254 26154:dup             
	// 16255 26155:iconst_2        
	// 16256 26156:ldc2w           #4073 <Double 1130.3480219D>
	// 16257 26159:dastore         
	// 16258 26160:dup             
	// 16259 26161:iconst_3        
	// 16260 26162:ldc2w           #191 <Double 392.10647540000002D>
	// 16261 26165:dastore         
	// 16262 26166:dup             
	// 16263 26167:iconst_4        
	// 16264 26168:ldc2w           #193 <Double -5.9244687000000003D>
	// 16265 26171:dastore         
	// 16266 26172:dup             
	// 16267 26173:iconst_5        
	// 16268 26174:ldc2w           #4075 <Double 4.1465763999999998D>
	// 16269 26177:dastore         
	// 16270 26178:dup             
	// 16271 26179:bipush          6
	// 16272 26181:ldc2w           #4077 <Double 1.8038183999999999D>
	// 16273 26184:dastore         
	// 16274 26185:dup             
	// 16275 26186:bipush          7
	// 16276 26188:ldc2w           #4079 <Double -313.08104780000002D>
	// 16277 26191:dastore         
	// 16278 26192:dup             
	// 16279 26193:bipush          8
	// 16280 26195:ldc2w           #201 <Double -1.4830451D>
	// 16281 26198:dastore         
	// 16282 26199:aastore         
	// 16283 26200:dup             
	// 16284 26201:sipush          361
	// 16285 26204:bipush          9
	// 16286 26206:newarray        double[]
	// 16287 26208:dup             
	// 16288 26209:iconst_0        
	// 16289 26210:ldc2w           #4081 <Double -14.875845200000001D>
	// 16290 26213:dastore         
	// 16291 26214:dup             
	// 16292 26215:iconst_1        
	// 16293 26216:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16294 26219:dastore         
	// 16295 26220:dup             
	// 16296 26221:iconst_2        
	// 16297 26222:ldc2w           #4083 <Double 2264.6197375000002D>
	// 16298 26225:dastore         
	// 16299 26226:dup             
	// 16300 26227:iconst_3        
	// 16301 26228:ldc2w           #209 <Double 3.0597946D>
	// 16302 26231:dastore         
	// 16303 26232:dup             
	// 16304 26233:iconst_4        
	// 16305 26234:ldc2w           #211 <Double 8.9830009000000004D>
	// 16306 26237:dastore         
	// 16307 26238:dup             
	// 16308 26239:iconst_5        
	// 16309 26240:ldc2w           #4085 <Double -1.2547898D>
	// 16310 26243:dastore         
	// 16311 26244:dup             
	// 16312 26245:bipush          6
	// 16313 26247:ldc2w           #4087 <Double -28.578699799999999D>
	// 16314 26250:dastore         
	// 16315 26251:dup             
	// 16316 26252:bipush          7
	// 16317 26254:ldc2w           #4089 <Double 273.40190050000001D>
	// 16318 26257:dastore         
	// 16319 26258:dup             
	// 16320 26259:bipush          8
	// 16321 26261:ldc2w           #219 <Double -0.062199999999999998D>
	// 16322 26264:dastore         
	// 16323 26265:aastore         
	// 16324 26266:dup             
	// 16325 26267:sipush          362
	// 16326 26270:aload           155
	// 16327 26272:aastore         
	// 16328 26273:dup             
	// 16329 26274:sipush          363
	// 16330 26277:bipush          9
	// 16331 26279:newarray        double[]
	// 16332 26281:dup             
	// 16333 26282:iconst_0        
	// 16334 26283:ldc2w           #4091 <Double -14.275845199999999D>
	// 16335 26286:dastore         
	// 16336 26287:dup             
	// 16337 26288:iconst_1        
	// 16338 26289:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16339 26292:dastore         
	// 16340 26293:dup             
	// 16341 26294:iconst_2        
	// 16342 26295:ldc2w           #4093 <Double 2189.1537453999999D>
	// 16343 26298:dastore         
	// 16344 26299:dup             
	// 16345 26300:iconst_3        
	// 16346 26301:ldc2w           #15  <Double 19.625597299999999D>
	// 16347 26304:dastore         
	// 16348 26305:dup             
	// 16349 26306:iconst_4        
	// 16350 26307:ldc2w           #17  <Double 8.9143979000000009D>
	// 16351 26310:dastore         
	// 16352 26311:dup             
	// 16353 26312:iconst_5        
	// 16354 26313:ldc2w           #4095 <Double -0.65478979999999998D>
	// 16355 26316:dastore         
	// 16356 26317:dup             
	// 16357 26318:bipush          6
	// 16358 26320:ldc2w           #4097 <Double -27.439143399999999D>
	// 16359 26323:dastore         
	// 16360 26324:dup             
	// 16361 26325:bipush          7
	// 16362 26327:ldc2w           #4099 <Double 187.27068879999999D>
	// 16363 26330:dastore         
	// 16364 26331:dup             
	// 16365 26332:bipush          8
	// 16366 26334:ldc2w           #25  <Double -0.38996530000000001D>
	// 16367 26337:dastore         
	// 16368 26338:aastore         
	// 16369 26339:dup             
	// 16370 26340:sipush          364
	// 16371 26343:bipush          9
	// 16372 26345:newarray        double[]
	// 16373 26347:dup             
	// 16374 26348:iconst_0        
	// 16375 26349:ldc2w           #4101 <Double -13.9758452D>
	// 16376 26352:dastore         
	// 16377 26353:dup             
	// 16378 26354:iconst_1        
	// 16379 26355:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16380 26358:dastore         
	// 16381 26359:dup             
	// 16382 26360:iconst_2        
	// 16383 26361:ldc2w           #4103 <Double 2151.4207494000002D>
	// 16384 26364:dastore         
	// 16385 26365:dup             
	// 16386 26366:iconst_3        
	// 16387 26367:ldc2w           #31  <Double 28.2628214D>
	// 16388 26370:dastore         
	// 16389 26371:dup             
	// 16390 26372:iconst_4        
	// 16391 26373:ldc2w           #33  <Double 8.8398648000000009D>
	// 16392 26376:dastore         
	// 16393 26377:dup             
	// 16394 26378:iconst_5        
	// 16395 26379:ldc2w           #4105 <Double -0.35478979999999999D>
	// 16396 26382:dastore         
	// 16397 26383:dup             
	// 16398 26384:bipush          6
	// 16399 26386:ldc2w           #4107 <Double -23.655097399999999D>
	// 16400 26389:dastore         
	// 16401 26390:dup             
	// 16402 26391:bipush          7
	// 16403 26393:ldc2w           #4109 <Double 115.56062679999999D>
	// 16404 26396:dastore         
	// 16405 26397:dup             
	// 16406 26398:bipush          8
	// 16407 26400:ldc2w           #41  <Double -0.54830319999999999D>
	// 16408 26403:dastore         
	// 16409 26404:aastore         
	// 16410 26405:dup             
	// 16411 26406:sipush          365
	// 16412 26409:bipush          9
	// 16413 26411:newarray        double[]
	// 16414 26413:dup             
	// 16415 26414:iconst_0        
	// 16416 26415:ldc2w           #4111 <Double -13.675845199999999D>
	// 16417 26418:dastore         
	// 16418 26419:dup             
	// 16419 26420:iconst_1        
	// 16420 26421:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16421 26424:dastore         
	// 16422 26425:dup             
	// 16423 26426:iconst_2        
	// 16424 26427:ldc2w           #4113 <Double 2113.6877534D>
	// 16425 26430:dastore         
	// 16426 26431:dup             
	// 16427 26432:iconst_3        
	// 16428 26433:ldc2w           #47  <Double 37.305238799999998D>
	// 16429 26436:dastore         
	// 16430 26437:dup             
	// 16431 26438:iconst_4        
	// 16432 26439:ldc2w           #49  <Double 8.7346948999999992D>
	// 16433 26442:dastore         
	// 16434 26443:dup             
	// 16435 26444:iconst_5        
	// 16436 26445:ldc2w           #4115 <Double -0.0547898D>
	// 16437 26448:dastore         
	// 16438 26449:dup             
	// 16439 26450:bipush          6
	// 16440 26452:ldc2w           #4117 <Double -17.996032199999998D>
	// 16441 26455:dastore         
	// 16442 26456:dup             
	// 16443 26457:bipush          7
	// 16444 26459:ldc2w           #4119 <Double 10.739757300000001D>
	// 16445 26462:dastore         
	// 16446 26463:dup             
	// 16447 26464:bipush          8
	// 16448 26466:ldc2w           #57  <Double -0.70060560000000005D>
	// 16449 26469:dastore         
	// 16450 26470:aastore         
	// 16451 26471:dup             
	// 16452 26472:sipush          366
	// 16453 26475:aload           156
	// 16454 26477:aastore         
	// 16455 26478:dup             
	// 16456 26479:sipush          367
	// 16457 26482:aload           157
	// 16458 26484:aastore         
	// 16459 26485:dup             
	// 16460 26486:sipush          368
	// 16461 26489:aload           158
	// 16462 26491:aastore         
	// 16463 26492:dup             
	// 16464 26493:sipush          369
	// 16465 26496:bipush          9
	// 16466 26498:newarray        double[]
	// 16467 26500:dup             
	// 16468 26501:iconst_0        
	// 16469 26502:ldc2w           #4121 <Double -12.4758452D>
	// 16470 26505:dastore         
	// 16471 26506:dup             
	// 16472 26507:iconst_1        
	// 16473 26508:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16474 26511:dastore         
	// 16475 26512:dup             
	// 16476 26513:iconst_2        
	// 16477 26514:ldc2w           #4123 <Double 1962.7557693000001D>
	// 16478 26517:dastore         
	// 16479 26518:dup             
	// 16480 26519:iconst_3        
	// 16481 26520:ldc2w           #79  <Double 80.747736000000003D>
	// 16482 26523:dastore         
	// 16483 26524:dup             
	// 16484 26525:iconst_4        
	// 16485 26526:ldc2w           #81  <Double 7.8897272999999997D>
	// 16486 26529:dastore         
	// 16487 26530:dup             
	// 16488 26531:iconst_5        
	// 16489 26532:ldc2w           #4125 <Double 1.1452102D>
	// 16490 26535:dastore         
	// 16491 26536:dup             
	// 16492 26537:bipush          6
	// 16493 26539:ldc2w           #4127 <Double 12.895838599999999D>
	// 16494 26542:dastore         
	// 16495 26543:dup             
	// 16496 26544:bipush          7
	// 16497 26546:ldc2w           #4129 <Double -738.45459010000002D>
	// 16498 26549:dastore         
	// 16499 26550:dup             
	// 16500 26551:bipush          8
	// 16501 26553:ldc2w           #89  <Double -1.2173562D>
	// 16502 26556:dastore         
	// 16503 26557:aastore         
	// 16504 26558:dup             
	// 16505 26559:sipush          370
	// 16506 26562:aload           159
	// 16507 26564:aastore         
	// 16508 26565:dup             
	// 16509 26566:sipush          371
	// 16510 26569:aload           160
	// 16511 26571:aastore         
	// 16512 26572:dup             
	// 16513 26573:sipush          372
	// 16514 26576:bipush          9
	// 16515 26578:newarray        double[]
	// 16516 26580:dup             
	// 16517 26581:iconst_0        
	// 16518 26582:ldc2w           #4131 <Double -11.5758452D>
	// 16519 26585:dastore         
	// 16520 26586:dup             
	// 16521 26587:iconst_1        
	// 16522 26588:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16523 26591:dastore         
	// 16524 26592:dup             
	// 16525 26593:iconst_2        
	// 16526 26594:ldc2w           #4133 <Double 1849.5567813D>
	// 16527 26597:dastore         
	// 16528 26598:dup             
	// 16529 26599:iconst_3        
	// 16530 26600:ldc2w           #127 <Double 127.6888198D>
	// 16531 26603:dastore         
	// 16532 26604:dup             
	// 16533 26605:iconst_4        
	// 16534 26606:ldc2w           #129 <Double 6.4866308999999998D>
	// 16535 26609:dastore         
	// 16536 26610:dup             
	// 16537 26611:iconst_5        
	// 16538 26612:ldc2w           #4135 <Double 2.0452102000000001D>
	// 16539 26615:dastore         
	// 16540 26616:dup             
	// 16541 26617:bipush          6
	// 16542 26619:ldc2w           #4137 <Double 27.294916199999999D>
	// 16543 26622:dastore         
	// 16544 26623:dup             
	// 16545 26624:bipush          7
	// 16546 26626:ldc2w           #4139 <Double -1270.0514954D>
	// 16547 26629:dastore         
	// 16548 26630:dup             
	// 16549 26631:bipush          8
	// 16550 26633:ldc2w           #137 <Double -1.4699811D>
	// 16551 26636:dastore         
	// 16552 26637:aastore         
	// 16553 26638:dup             
	// 16554 26639:sipush          373
	// 16555 26642:bipush          9
	// 16556 26644:newarray        double[]
	// 16557 26646:dup             
	// 16558 26647:iconst_0        
	// 16559 26648:ldc2w           #4141 <Double -11.275845199999999D>
	// 16560 26651:dastore         
	// 16561 26652:dup             
	// 16562 26653:iconst_1        
	// 16563 26654:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16564 26657:dastore         
	// 16565 26658:dup             
	// 16566 26659:iconst_2        
	// 16567 26660:ldc2w           #4143 <Double 1811.8237853000001D>
	// 16568 26663:dastore         
	// 16569 26664:dup             
	// 16570 26665:iconst_3        
	// 16571 26666:ldc2w           #463 <Double 148.1152635D>
	// 16572 26669:dastore         
	// 16573 26670:dup             
	// 16574 26671:iconst_4        
	// 16575 26672:ldc2w           #465 <Double 5.7586041999999997D>
	// 16576 26675:dastore         
	// 16577 26676:dup             
	// 16578 26677:iconst_5        
	// 16579 26678:ldc2w           #4145 <Double 2.3452101999999999D>
	// 16580 26681:dastore         
	// 16581 26682:dup             
	// 16582 26683:bipush          6
	// 16583 26685:ldc2w           #4147 <Double 28.0388339D>
	// 16584 26688:dastore         
	// 16585 26689:dup             
	// 16586 26690:bipush          7
	// 16587 26692:ldc2w           #4149 <Double -1335.1633812D>
	// 16588 26695:dastore         
	// 16589 26696:dup             
	// 16590 26697:bipush          8
	// 16591 26699:ldc2w           #473 <Double -1.5229775000000001D>
	// 16592 26702:dastore         
	// 16593 26703:aastore         
	// 16594 26704:dup             
	// 16595 26705:sipush          374
	// 16596 26708:aload           161
	// 16597 26710:aastore         
	// 16598 26711:dup             
	// 16599 26712:sipush          375
	// 16600 26715:aload           162
	// 16601 26717:aastore         
	// 16602 26718:dup             
	// 16603 26719:sipush          376
	// 16604 26722:bipush          9
	// 16605 26724:newarray        double[]
	// 16606 26726:dup             
	// 16607 26727:iconst_0        
	// 16608 26728:ldc2w           #4151 <Double -10.375845200000001D>
	// 16609 26731:dastore         
	// 16610 26732:dup             
	// 16611 26733:iconst_1        
	// 16612 26734:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16613 26737:dastore         
	// 16614 26738:dup             
	// 16615 26739:iconst_2        
	// 16616 26740:ldc2w           #4153 <Double 1698.6247972000001D>
	// 16617 26743:dastore         
	// 16618 26744:dup             
	// 16619 26745:iconst_3        
	// 16620 26746:ldc2w           #159 <Double 234.27778710000001D>
	// 16621 26749:dastore         
	// 16622 26750:dup             
	// 16623 26751:iconst_4        
	// 16624 26752:ldc2w           #161 <Double 2.1401053000000001D>
	// 16625 26755:dastore         
	// 16626 26756:dup             
	// 16627 26757:iconst_5        
	// 16628 26758:ldc2w           #4155 <Double 3.2452101999999998D>
	// 16629 26761:dastore         
	// 16630 26762:dup             
	// 16631 26763:bipush          6
	// 16632 26765:ldc2w           #4157 <Double 18.698122600000001D>
	// 16633 26768:dastore         
	// 16634 26769:dup             
	// 16635 26770:bipush          7
	// 16636 26772:ldc2w           #4159 <Double -1052.4281954999999D>
	// 16637 26775:dastore         
	// 16638 26776:dup             
	// 16639 26777:bipush          8
	// 16640 26779:ldc2w           #169 <Double -1.5803442000000001D>
	// 16641 26782:dastore         
	// 16642 26783:aastore         
	// 16643 26784:dup             
	// 16644 26785:sipush          377
	// 16645 26788:aload           163
	// 16646 26790:aastore         
	// 16647 26791:dup             
	// 16648 26792:sipush          378
	// 16649 26795:bipush          9
	// 16650 26797:newarray        double[]
	// 16651 26799:dup             
	// 16652 26800:iconst_0        
	// 16653 26801:ldc2w           #4161 <Double -9.7758451999999991D>
	// 16654 26804:dastore         
	// 16655 26805:dup             
	// 16656 26806:iconst_1        
	// 16657 26807:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16658 26810:dastore         
	// 16659 26811:dup             
	// 16660 26812:iconst_2        
	// 16661 26813:ldc2w           #4163 <Double 1623.1588052D>
	// 16662 26816:dastore         
	// 16663 26817:dup             
	// 16664 26818:iconst_3        
	// 16665 26819:ldc2w           #291 <Double 327.13300479999998D>
	// 16666 26822:dastore         
	// 16667 26823:dup             
	// 16668 26824:iconst_4        
	// 16669 26825:ldc2w           #293 <Double -2.4385346000000001D>
	// 16670 26828:dastore         
	// 16671 26829:dup             
	// 16672 26830:iconst_5        
	// 16673 26831:ldc2w           #4165 <Double 3.8452101999999999D>
	// 16674 26834:dastore         
	// 16675 26835:dup             
	// 16676 26836:bipush          6
	// 16677 26838:ldc2w           #4167 <Double 7.3808142999999999D>
	// 16678 26841:dastore         
	// 16679 26842:dup             
	// 16680 26843:bipush          7
	// 16681 26845:ldc2w           #4169 <Double -573.82162570000003D>
	// 16682 26848:dastore         
	// 16683 26849:dup             
	// 16684 26850:bipush          8
	// 16685 26852:ldc2w           #301 <Double -1.5323681D>
	// 16686 26855:dastore         
	// 16687 26856:aastore         
	// 16688 26857:dup             
	// 16689 26858:sipush          379
	// 16690 26861:bipush          9
	// 16691 26863:newarray        double[]
	// 16692 26865:dup             
	// 16693 26866:iconst_0        
	// 16694 26867:ldc2w           #4171 <Double -9.4758452000000002D>
	// 16695 26870:dastore         
	// 16696 26871:dup             
	// 16697 26872:iconst_1        
	// 16698 26873:ldc2w           #1713 <Double 4.0776652999999996D>
	// 16699 26876:dastore         
	// 16700 26877:dup             
	// 16701 26878:iconst_2        
	// 16702 26879:ldc2w           #4173 <Double 1585.4258092D>
	// 16703 26882:dastore         
	// 16704 26883:dup             
	// 16705 26884:iconst_3        
	// 16706 26885:ldc2w           #191 <Double 392.10647540000002D>
	// 16707 26888:dastore         
	// 16708 26889:dup             
	// 16709 26890:iconst_4        
	// 16710 26891:ldc2w           #193 <Double -5.9244687000000003D>
	// 16711 26894:dastore         
	// 16712 26895:dup             
	// 16713 26896:iconst_5        
	// 16714 26897:ldc2w           #4175 <Double 4.1452102000000002D>
	// 16715 26900:dastore         
	// 16716 26901:dup             
	// 16717 26902:bipush          6
	// 16718 26904:ldc2w           #4177 <Double 2.1038519D>
	// 16719 26907:dastore         
	// 16720 26908:dup             
	// 16721 26909:bipush          7
	// 16722 26911:ldc2w           #4179 <Double -329.78307109999997D>
	// 16723 26914:dastore         
	// 16724 26915:dup             
	// 16725 26916:bipush          8
	// 16726 26918:ldc2w           #201 <Double -1.4830451D>
	// 16727 26921:dastore         
	// 16728 26922:aastore         
	// 16729 26923:dup             
	// 16730 26924:sipush          380
	// 16731 26927:bipush          9
	// 16732 26929:newarray        double[]
	// 16733 26931:dup             
	// 16734 26932:iconst_0        
	// 16735 26933:ldc2w           #4181 <Double -16.933428299999999D>
	// 16736 26936:dastore         
	// 16737 26937:dup             
	// 16738 26938:iconst_1        
	// 16739 26939:ldc2w           #1805 <Double 4.6123928999999997D>
	// 16740 26942:dastore         
	// 16741 26943:dup             
	// 16742 26944:iconst_2        
	// 16743 26945:ldc2w           #4183 <Double 2532.8424602D>
	// 16744 26948:dastore         
	// 16745 26949:dup             
	// 16746 26950:iconst_3        
	// 16747 26951:ldc2w           #209 <Double 3.0597946D>
	// 16748 26954:dastore         
	// 16749 26955:dup             
	// 16750 26956:iconst_4        
	// 16751 26957:ldc2w           #211 <Double 8.9830009000000004D>
	// 16752 26960:dastore         
	// 16753 26961:dup             
	// 16754 26962:iconst_5        
	// 16755 26963:ldc2w           #4185 <Double -1.2559254D>
	// 16756 26966:dastore         
	// 16757 26967:dup             
	// 16758 26968:bipush          6
	// 16759 26970:ldc2w           #4187 <Double -28.278675199999999D>
	// 16760 26973:dastore         
	// 16761 26974:dup             
	// 16762 26975:bipush          7
	// 16763 26977:ldc2w           #4189 <Double 272.87559420000002D>
	// 16764 26980:dastore         
	// 16765 26981:dup             
	// 16766 26982:bipush          8
	// 16767 26984:ldc2w           #219 <Double -0.062199999999999998D>
	// 16768 26987:dastore         
	// 16769 26988:aastore         
	// 16770 26989:dup             
	// 16771 26990:sipush          381
	// 16772 26993:bipush          9
	// 16773 26995:newarray        double[]
	// 16774 26997:dup             
	// 16775 26998:iconst_0        
	// 16776 26999:ldc2w           #4191 <Double -16.633428299999999D>
	// 16777 27002:dastore         
	// 16778 27003:dup             
	// 16779 27004:iconst_1        
	// 16780 27005:ldc2w           #1805 <Double 4.6123928999999997D>
	// 16781 27008:dastore         
	// 16782 27009:dup             
	// 16783 27010:iconst_2        
	// 16784 27011:ldc2w           #4193 <Double 2493.5052816000002D>
	// 16785 27014:dastore         
	// 16786 27015:dup             
	// 16787 27016:iconst_3        
	// 16788 27017:ldc2w           #319 <Double 11.2644424D>
	// 16789 27020:dastore         
	// 16790 27021:dup             
	// 16791 27022:iconst_4        
	// 16792 27023:ldc2w           #321 <Double 8.9614528999999994D>
	// 16793 27026:dastore         
	// 16794 27027:dup             
	// 16795 27028:iconst_5        
	// 16796 27029:ldc2w           #4195 <Double -0.95592540000000004D>
	// 16797 27032:dastore         
	// 16798 27033:dup             
	// 16799 27034:bipush          6
	// 16800 27036:ldc2w           #4197 <Double -28.7952011D>
	// 16801 27039:dastore         
	// 16802 27040:dup             
	// 16803 27041:bipush          7
	// 16804 27043:ldc2w           #4199 <Double 234.2490248D>
	// 16805 27046:dastore         
	// 16806 27047:dup             
	// 16807 27048:bipush          8
	// 16808 27050:ldc2w           #329 <Double -0.22733419999999999D>
	// 16809 27053:dastore         
	// 16810 27054:aastore         
	// 16811 27055:dup             
	// 16812 27056:sipush          382
	// 16813 27059:bipush          9
	// 16814 27061:newarray        double[]
	// 16815 27063:dup             
	// 16816 27064:iconst_0        
	// 16817 27065:ldc2w           #4201 <Double -16.333428300000001D>
	// 16818 27068:dastore         
	// 16819 27069:dup             
	// 16820 27070:iconst_1        
	// 16821 27071:ldc2w           #1805 <Double 4.6123928999999997D>
	// 16822 27074:dastore         
	// 16823 27075:dup             
	// 16824 27076:iconst_2        
	// 16825 27077:ldc2w           #4203 <Double 2454.1681029000001D>
	// 16826 27080:dastore         
	// 16827 27081:dup             
	// 16828 27082:iconst_3        
	// 16829 27083:ldc2w           #15  <Double 19.625597299999999D>
	// 16830 27086:dastore         
	// 16831 27087:dup             
	// 16832 27088:iconst_4        
	// 16833 27089:ldc2w           #17  <Double 8.9143979000000009D>
	// 16834 27092:dastore         
	// 16835 27093:dup             
	// 16836 27094:iconst_5        
	// 16837 27095:ldc2w           #4205 <Double -0.65592539999999999D>
	// 16838 27098:dastore         
	// 16839 27099:dup             
	// 16840 27100:bipush          6
	// 16841 27102:ldc2w           #4207 <Double -27.139118799999999D>
	// 16842 27105:dastore         
	// 16843 27106:dup             
	// 16844 27107:bipush          7
	// 16845 27109:ldc2w           #4209 <Double 184.94423459999999D>
	// 16846 27112:dastore         
	// 16847 27113:dup             
	// 16848 27114:bipush          8
	// 16849 27116:ldc2w           #25  <Double -0.38996530000000001D>
	// 16850 27119:dastore         
	// 16851 27120:aastore         
	// 16852 27121:dup             
	// 16853 27122:sipush          383
	// 16854 27125:bipush          9
	// 16855 27127:newarray        double[]
	// 16856 27129:dup             
	// 16857 27130:iconst_0        
	// 16858 27131:ldc2w           #4211 <Double -16.033428300000001D>
	// 16859 27134:dastore         
	// 16860 27135:dup             
	// 16861 27136:iconst_1        
	// 16862 27137:ldc2w           #1805 <Double 4.6123928999999997D>
	// 16863 27140:dastore         
	// 16864 27141:dup             
	// 16865 27142:iconst_2        
	// 16866 27143:ldc2w           #4213 <Double 2414.8309242999999D>
	// 16867 27146:dastore         
	// 16868 27147:dup             
	// 16869 27148:iconst_3        
	// 16870 27149:ldc2w           #31  <Double 28.2628214D>
	// 16871 27152:dastore         
	// 16872 27153:dup             
	// 16873 27154:iconst_4        
	// 16874 27155:ldc2w           #33  <Double 8.8398648000000009D>
	// 16875 27158:dastore         
	// 16876 27159:dup             
	// 16877 27160:iconst_5        
	// 16878 27161:ldc2w           #4215 <Double -0.3559254D>
	// 16879 27164:dastore         
	// 16880 27165:dup             
	// 16881 27166:bipush          6
	// 16882 27168:ldc2w           #4217 <Double -23.355072799999999D>
	// 16883 27171:dastore         
	// 16884 27172:dup             
	// 16885 27173:bipush          7
	// 16886 27175:ldc2w           #4219 <Double 112.3340987D>
	// 16887 27178:dastore         
	// 16888 27179:dup             
	// 16889 27180:bipush          8
	// 16890 27182:ldc2w           #41  <Double -0.54830319999999999D>
	// 16891 27185:dastore         
	// 16892 27186:aastore         
	// 16893 27187:dup             
	// 16894 27188:sipush          384
	// 16895 27191:aload           164
	// 16896 27193:aastore         
	// 16897 27194:dup             
	// 16898 27195:sipush          385
	// 16899 27198:bipush          9
	// 16900 27200:newarray        double[]
	// 16901 27202:dup             
	// 16902 27203:iconst_0        
	// 16903 27204:ldc2w           #4221 <Double -15.433428299999999D>
	// 16904 27207:dastore         
	// 16905 27208:dup             
	// 16906 27209:iconst_1        
	// 16907 27210:ldc2w           #1805 <Double 4.6123928999999997D>
	// 16908 27213:dastore         
	// 16909 27214:dup             
	// 16910 27215:iconst_2        
	// 16911 27216:ldc2w           #4223 <Double 2336.156567D>
	// 16912 27219:dastore         
	// 16913 27220:dup             
	// 16914 27221:iconst_3        
	// 16915 27222:ldc2w           #541 <Double 46.896400399999997D>
	// 16916 27225:dastore         
	// 16917 27226:dup             
	// 16918 27227:iconst_4        
	// 16919 27228:ldc2w           #543 <Double 8.5943556999999995D>
	// 16920 27231:dastore         
	// 16921 27232:dup             
	// 16922 27233:iconst_5        
	// 16923 27234:ldc2w           #4225 <Double 0.2440746D>
	// 16924 27237:dastore         
	// 16925 27238:dup             
	// 16926 27239:bipush          6
	// 16927 27241:ldc2w           #4227 <Double -10.598407399999999D>
	// 16928 27244:dastore         
	// 16929 27245:dup             
	// 16930 27246:bipush          7
	// 16931 27248:ldc2w           #4229 <Double -137.06704719999999D>
	// 16932 27251:dastore         
	// 16933 27252:dup             
	// 16934 27253:bipush          8
	// 16935 27255:ldc2w           #551 <Double -0.84519750000000005D>
	// 16936 27258:dastore         
	// 16937 27259:aastore         
	// 16938 27260:dup             
	// 16939 27261:sipush          386
	// 16940 27264:bipush          9
	// 16941 27266:newarray        double[]
	// 16942 27268:dup             
	// 16943 27269:iconst_0        
	// 16944 27270:ldc2w           #4231 <Double -15.1334283D>
	// 16945 27273:dastore         
	// 16946 27274:dup             
	// 16947 27275:iconst_1        
	// 16948 27276:ldc2w           #1805 <Double 4.6123928999999997D>
	// 16949 27279:dastore         
	// 16950 27280:dup             
	// 16951 27281:iconst_2        
	// 16952 27282:ldc2w           #4233 <Double 2296.8193882999999D>
	// 16953 27285:dastore         
	// 16954 27286:dup             
	// 16955 27287:iconst_3        
	// 16956 27288:ldc2w           #63  <Double 57.2001287D>
	// 16957 27291:dastore         
	// 16958 27292:dup             
	// 16959 27293:iconst_4        
	// 16960 27294:ldc2w           #65  <Double 8.4126647000000006D>
	// 16961 27297:dastore         
	// 16962 27298:dup             
	// 16963 27299:iconst_5        
	// 16964 27300:ldc2w           #4235 <Double 0.54407459999999996D>
	// 16965 27303:dastore         
	// 16966 27304:dup             
	// 16967 27305:bipush          6
	// 16968 27307:ldc2w           #4237 <Double -2.6395705999999999D>
	// 16969 27310:dastore         
	// 16970 27311:dup             
	// 16971 27312:bipush          7
	// 16972 27314:ldc2w           #4239 <Double -317.1502893D>
	// 16973 27317:dastore         
	// 16974 27318:dup             
	// 16975 27319:bipush          8
	// 16976 27321:ldc2w           #73  <Double -0.98049019999999998D>
	// 16977 27324:dastore         
	// 16978 27325:aastore         
	// 16979 27326:dup             
	// 16980 27327:sipush          387
	// 16981 27330:aload           165
	// 16982 27332:aastore         
	// 16983 27333:dup             
	// 16984 27334:sipush          388
	// 16985 27337:aload           166
	// 16986 27339:aastore         
	// 16987 27340:dup             
	// 16988 27341:sipush          389
	// 16989 27344:bipush          9
	// 16990 27346:newarray        double[]
	// 16991 27348:dup             
	// 16992 27349:iconst_0        
	// 16993 27350:ldc2w           #4241 <Double -14.2334283D>
	// 16994 27353:dastore         
	// 16995 27354:dup             
	// 16996 27355:iconst_1        
	// 16997 27356:ldc2w           #1805 <Double 4.6123928999999997D>
	// 16998 27359:dastore         
	// 16999 27360:dup             
	// 17000 27361:iconst_2        
	// 17001 27362:ldc2w           #4243 <Double 2178.8078523999998D>
	// 17002 27365:dastore         
	// 17003 27366:dup             
	// 17004 27367:iconst_3        
	// 17005 27368:ldc2w           #95  <Double 94.497482399999996D>
	// 17006 27371:dastore         
	// 17007 27372:dup             
	// 17008 27373:iconst_4        
	// 17009 27374:ldc2w           #97  <Double 7.5234689000000001D>
	// 17010 27377:dastore         
	// 17011 27378:dup             
	// 17012 27379:iconst_5        
	// 17013 27380:ldc2w           #4245 <Double 1.4440746D>
	// 17014 27383:dastore         
	// 17015 27384:dup             
	// 17016 27385:bipush          6
	// 17017 27387:ldc2w           #4247 <Double 19.757306400000001D>
	// 17018 27390:dastore         
	// 17019 27391:dup             
	// 17020 27392:bipush          7
	// 17021 27394:ldc2w           #4249 <Double -960.475909D>
	// 17022 27397:dastore         
	// 17023 27398:dup             
	// 17024 27399:bipush          8
	// 17025 27401:ldc2w           #105 <Double -1.3163339000000001D>
	// 17026 27404:dastore         
	// 17027 27405:aastore         
	// 17028 27406:dup             
	// 17029 27407:sipush          390
	// 17030 27410:bipush          9
	// 17031 27412:newarray        double[]
	// 17032 27414:dup             
	// 17033 27415:iconst_0        
	// 17034 27416:ldc2w           #4251 <Double -13.933428299999999D>
	// 17035 27419:dastore         
	// 17036 27420:dup             
	// 17037 27421:iconst_1        
	// 17038 27422:ldc2w           #1805 <Double 4.6123928999999997D>
	// 17039 27425:dastore         
	// 17040 27426:dup             
	// 17041 27427:iconst_2        
	// 17042 27428:ldc2w           #4253 <Double 2139.4706737000001D>
	// 17043 27431:dastore         
	// 17044 27432:dup             
	// 17045 27433:iconst_3        
	// 17046 27434:ldc2w           #111 <Double 110.00047410000001D>
	// 17047 27437:dastore         
	// 17048 27438:dup             
	// 17049 27439:iconst_4        
	// 17050 27440:ldc2w           #113 <Double 7.0639795000000003D>
	// 17051 27443:dastore         
	// 17052 27444:dup             
	// 17053 27445:iconst_5        
	// 17054 27446:ldc2w           #4255 <Double 1.7440746D>
	// 17055 27449:dastore         
	// 17056 27450:dup             
	// 17057 27451:bipush          6
	// 17058 27453:ldc2w           #4257 <Double 24.678415000000001D>
	// 17059 27456:dastore         
	// 17060 27457:dup             
	// 17061 27458:bipush          7
	// 17062 27460:ldc2w           #4259 <Double -1145.8101887D>
	// 17063 27463:dastore         
	// 17064 27464:dup             
	// 17065 27465:bipush          8
	// 17066 27467:ldc2w           #121 <Double -1.4008494D>
	// 17067 27470:dastore         
	// 17068 27471:aastore         
	// 17069 27472:dup             
	// 17070 27473:sipush          391
	// 17071 27476:aload           167
	// 17072 27478:aastore         
	// 17073 27479:dup             
	// 17074 27480:sipush          392
	// 17075 27483:bipush          9
	// 17076 27485:newarray        double[]
	// 17077 27487:dup             
	// 17078 27488:iconst_0        
	// 17079 27489:ldc2w           #4261 <Double -13.3334283D>
	// 17080 27492:dastore         
	// 17081 27493:dup             
	// 17082 27494:iconst_1        
	// 17083 27495:ldc2w           #1805 <Double 4.6123928999999997D>
	// 17084 27498:dastore         
	// 17085 27499:dup             
	// 17086 27500:iconst_2        
	// 17087 27501:ldc2w           #4263 <Double 2060.7963163999998D>
	// 17088 27504:dastore         
	// 17089 27505:dup             
	// 17090 27506:iconst_3        
	// 17091 27507:ldc2w           #463 <Double 148.1152635D>
	// 17092 27510:dastore         
	// 17093 27511:dup             
	// 17094 27512:iconst_4        
	// 17095 27513:ldc2w           #465 <Double 5.7586041999999997D>
	// 17096 27516:dastore         
	// 17097 27517:dup             
	// 17098 27518:iconst_5        
	// 17099 27519:ldc2w           #4265 <Double 2.3440745999999999D>
	// 17100 27522:dastore         
	// 17101 27523:dup             
	// 17102 27524:bipush          6
	// 17103 27526:ldc2w           #4267 <Double 28.338858500000001D>
	// 17104 27529:dastore         
	// 17105 27530:dup             
	// 17106 27531:bipush          7
	// 17107 27533:ldc2w           #4269 <Double -1346.4905745999999D>
	// 17108 27536:dastore         
	// 17109 27537:dup             
	// 17110 27538:bipush          8
	// 17111 27540:ldc2w           #473 <Double -1.5229775000000001D>
	// 17112 27543:dastore         
	// 17113 27544:aastore         
	// 17114 27545:dup             
	// 17115 27546:sipush          393
	// 17116 27549:aload           168
	// 17117 27551:aastore         
	// 17118 27552:dup             
	// 17119 27553:sipush          394
	// 17120 27556:aload           169
	// 17121 27558:aastore         
	// 17122 27559:dup             
	// 17123 27560:sipush          395
	// 17124 27563:bipush          9
	// 17125 27565:newarray        double[]
	// 17126 27567:dup             
	// 17127 27568:iconst_0        
	// 17128 27569:ldc2w           #4271 <Double -12.433428299999999D>
	// 17129 27572:dastore         
	// 17130 27573:dup             
	// 17131 27574:iconst_1        
	// 17132 27575:ldc2w           #1805 <Double 4.6123928999999997D>
	// 17133 27578:dastore         
	// 17134 27579:dup             
	// 17135 27580:iconst_2        
	// 17136 27581:ldc2w           #4273 <Double 1942.7847804999999D>
	// 17137 27584:dastore         
	// 17138 27585:dup             
	// 17139 27586:iconst_3        
	// 17140 27587:ldc2w           #159 <Double 234.27778710000001D>
	// 17141 27590:dastore         
	// 17142 27591:dup             
	// 17143 27592:iconst_4        
	// 17144 27593:ldc2w           #161 <Double 2.1401053000000001D>
	// 17145 27596:dastore         
	// 17146 27597:dup             
	// 17147 27598:iconst_5        
	// 17148 27599:ldc2w           #4275 <Double 3.2440745999999998D>
	// 17149 27602:dastore         
	// 17150 27603:dup             
	// 17151 27604:bipush          6
	// 17152 27606:ldc2w           #4277 <Double 18.998147199999998D>
	// 17153 27609:dastore         
	// 17154 27610:dup             
	// 17155 27611:bipush          7
	// 17156 27613:ldc2w           #4279 <Double -1066.4556107000001D>
	// 17157 27616:dastore         
	// 17158 27617:dup             
	// 17159 27618:bipush          8
	// 17160 27620:ldc2w           #169 <Double -1.5803442000000001D>
	// 17161 27623:dastore         
	// 17162 27624:aastore         
	// 17163 27625:dup             
	// 17164 27626:sipush          396
	// 17165 27629:bipush          9
	// 17166 27631:newarray        double[]
	// 17167 27633:dup             
	// 17168 27634:iconst_0        
	// 17169 27635:ldc2w           #4281 <Double -12.1334283D>
	// 17170 27638:dastore         
	// 17171 27639:dup             
	// 17172 27640:iconst_1        
	// 17173 27641:ldc2w           #1805 <Double 4.6123928999999997D>
	// 17174 27644:dastore         
	// 17175 27645:dup             
	// 17176 27646:iconst_2        
	// 17177 27647:ldc2w           #4283 <Double 1903.4476018D>
	// 17178 27650:dastore         
	// 17179 27651:dup             
	// 17180 27652:iconst_3        
	// 17181 27653:ldc2w           #175 <Double 275.7268449D>
	// 17182 27656:dastore         
	// 17183 27657:dup             
	// 17184 27658:iconst_4        
	// 17185 27659:ldc2w           #177 <Double 0.1651599D>
	// 17186 27662:dastore         
	// 17187 27663:dup             
	// 17188 27664:iconst_5        
	// 17189 27665:ldc2w           #4285 <Double 3.5440746000000001D>
	// 17190 27668:dastore         
	// 17191 27669:dup             
	// 17192 27670:bipush          6
	// 17193 27672:ldc2w           #4287 <Double 13.4393104D>
	// 17194 27675:dastore         
	// 17195 27676:dup             
	// 17196 27677:bipush          7
	// 17197 27679:ldc2w           #4289 <Double -841.40648409999994D>
	// 17198 27682:dastore         
	// 17199 27683:dup             
	// 17200 27684:bipush          8
	// 17201 27686:ldc2w           #185 <Double -1.5649227999999999D>
	// 17202 27689:dastore         
	// 17203 27690:aastore         
	// 17204 27691:dup             
	// 17205 27692:sipush          397
	// 17206 27695:bipush          9
	// 17207 27697:newarray        double[]
	// 17208 27699:dup             
	// 17209 27700:iconst_0        
	// 17210 27701:ldc2w           #4291 <Double -11.8334283D>
	// 17211 27704:dastore         
	// 17212 27705:dup             
	// 17213 27706:iconst_1        
	// 17214 27707:ldc2w           #1805 <Double 4.6123928999999997D>
	// 17215 27710:dastore         
	// 17216 27711:dup             
	// 17217 27712:iconst_2        
	// 17218 27713:ldc2w           #4293 <Double 1864.1104232D>
	// 17219 27716:dastore         
	// 17220 27717:dup             
	// 17221 27718:iconst_3        
	// 17222 27719:ldc2w           #291 <Double 327.13300479999998D>
	// 17223 27722:dastore         
	// 17224 27723:dup             
	// 17225 27724:iconst_4        
	// 17226 27725:ldc2w           #293 <Double -2.4385346000000001D>
	// 17227 27728:dastore         
	// 17228 27729:dup             
	// 17229 27730:iconst_5        
	// 17230 27731:ldc2w           #4295 <Double 3.8440745999999999D>
	// 17231 27734:dastore         
	// 17232 27735:dup             
	// 17233 27736:bipush          6
	// 17234 27738:ldc2w           #4297 <Double 7.6808389999999997D>
	// 17235 27741:dastore         
	// 17236 27742:dup             
	// 17237 27743:bipush          7
	// 17238 27745:ldc2w           #4299 <Double -589.64918880000005D>
	// 17239 27748:dastore         
	// 17240 27749:dup             
	// 17241 27750:bipush          8
	// 17242 27752:ldc2w           #301 <Double -1.5323681D>
	// 17243 27755:dastore         
	// 17244 27756:aastore         
	// 17245 27757:dup             
	// 17246 27758:sipush          398
	// 17247 27761:bipush          9
	// 17248 27763:newarray        double[]
	// 17249 27765:dup             
	// 17250 27766:iconst_0        
	// 17251 27767:ldc2w           #4301 <Double -11.533428300000001D>
	// 17252 27770:dastore         
	// 17253 27771:dup             
	// 17254 27772:iconst_1        
	// 17255 27773:ldc2w           #1805 <Double 4.6123928999999997D>
	// 17256 27776:dastore         
	// 17257 27777:dup             
	// 17258 27778:iconst_2        
	// 17259 27779:ldc2w           #4303 <Double 1824.7732444999999D>
	// 17260 27782:dastore         
	// 17261 27783:dup             
	// 17262 27784:iconst_3        
	// 17263 27785:ldc2w           #191 <Double 392.10647540000002D>
	// 17264 27788:dastore         
	// 17265 27789:dup             
	// 17266 27790:iconst_4        
	// 17267 27791:ldc2w           #193 <Double -5.9244687000000003D>
	// 17268 27794:dastore         
	// 17269 27795:dup             
	// 17270 27796:iconst_5        
	// 17271 27797:ldc2w           #4305 <Double 4.1440745999999997D>
	// 17272 27800:dastore         
	// 17273 27801:dup             
	// 17274 27802:bipush          6
	// 17275 27804:ldc2w           #4307 <Double 2.4038765D>
	// 17276 27807:dastore         
	// 17277 27808:dup             
	// 17278 27809:bipush          7
	// 17279 27811:ldc2w           #4309 <Double -346.51070809999999D>
	// 17280 27814:dastore         
	// 17281 27815:dup             
	// 17282 27816:bipush          8
	// 17283 27818:ldc2w           #201 <Double -1.4830451D>
	// 17284 27821:dastore         
	// 17285 27822:aastore         
	// 17286 27823:dup             
	// 17287 27824:sipush          399
	// 17288 27827:aload           170
	// 17289 27829:aastore         
	// 17290 27830:dup             
	// 17291 27831:sipush          400
	// 17292 27834:bipush          9
	// 17293 27836:newarray        double[]
	// 17294 27838:dup             
	// 17295 27839:iconst_0        
	// 17296 27840:ldc2w           #4311 <Double -16.716744200000001D>
	// 17297 27843:dastore         
	// 17298 27844:dup             
	// 17299 27845:iconst_1        
	// 17300 27846:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17301 27849:dastore         
	// 17302 27850:dup             
	// 17303 27851:iconst_2        
	// 17304 27852:ldc2w           #4313 <Double 2501.6251504000002D>
	// 17305 27855:dastore         
	// 17306 27856:dup             
	// 17307 27857:iconst_3        
	// 17308 27858:ldc2w           #319 <Double 11.2644424D>
	// 17309 27861:dastore         
	// 17310 27862:dup             
	// 17311 27863:iconst_4        
	// 17312 27864:ldc2w           #321 <Double 8.9614528999999994D>
	// 17313 27867:dastore         
	// 17314 27868:dup             
	// 17315 27869:iconst_5        
	// 17316 27870:ldc2w           #4315 <Double -0.95688870000000004D>
	// 17317 27873:dastore         
	// 17318 27874:dup             
	// 17319 27875:bipush          6
	// 17320 27877:ldc2w           #4317 <Double -28.4951823D>
	// 17321 27880:dastore         
	// 17322 27881:dup             
	// 17323 27882:bipush          7
	// 17324 27884:ldc2w           #4319 <Double 232.80300170000001D>
	// 17325 27887:dastore         
	// 17326 27888:dup             
	// 17327 27889:bipush          8
	// 17328 27891:ldc2w           #329 <Double -0.22733419999999999D>
	// 17329 27894:dastore         
	// 17330 27895:aastore         
	// 17331 27896:dup             
	// 17332 27897:sipush          401
	// 17333 27900:bipush          9
	// 17334 27902:newarray        double[]
	// 17335 27904:dup             
	// 17336 27905:iconst_0        
	// 17337 27906:ldc2w           #4321 <Double -16.4167442D>
	// 17338 27909:dastore         
	// 17339 27910:dup             
	// 17340 27911:iconst_1        
	// 17341 27912:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17342 27915:dastore         
	// 17343 27916:dup             
	// 17344 27917:iconst_2        
	// 17345 27918:ldc2w           #4323 <Double 2460.6213827000001D>
	// 17346 27921:dastore         
	// 17347 27922:dup             
	// 17348 27923:iconst_3        
	// 17349 27924:ldc2w           #15  <Double 19.625597299999999D>
	// 17350 27927:dastore         
	// 17351 27928:dup             
	// 17352 27929:iconst_4        
	// 17353 27930:ldc2w           #17  <Double 8.9143979000000009D>
	// 17354 27933:dastore         
	// 17355 27934:dup             
	// 17356 27935:iconst_5        
	// 17357 27936:ldc2w           #4325 <Double -0.65688869999999999D>
	// 17358 27939:dastore         
	// 17359 27940:dup             
	// 17360 27941:bipush          6
	// 17361 27943:ldc2w           #4327 <Double -26.839099999999998D>
	// 17362 27946:dastore         
	// 17363 27947:dup             
	// 17364 27948:bipush          7
	// 17365 27950:ldc2w           #4329 <Double 182.5981553D>
	// 17366 27953:dastore         
	// 17367 27954:dup             
	// 17368 27955:bipush          8
	// 17369 27957:ldc2w           #25  <Double -0.38996530000000001D>
	// 17370 27960:dastore         
	// 17371 27961:aastore         
	// 17372 27962:dup             
	// 17373 27963:sipush          402
	// 17374 27966:bipush          9
	// 17375 27968:newarray        double[]
	// 17376 27970:dup             
	// 17377 27971:iconst_0        
	// 17378 27972:ldc2w           #4331 <Double -16.116744199999999D>
	// 17379 27975:dastore         
	// 17380 27976:dup             
	// 17381 27977:iconst_1        
	// 17382 27978:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17383 27981:dastore         
	// 17384 27982:dup             
	// 17385 27983:iconst_2        
	// 17386 27984:ldc2w           #4333 <Double 2419.6176150000001D>
	// 17387 27987:dastore         
	// 17388 27988:dup             
	// 17389 27989:iconst_3        
	// 17390 27990:ldc2w           #31  <Double 28.2628214D>
	// 17391 27993:dastore         
	// 17392 27994:dup             
	// 17393 27995:iconst_4        
	// 17394 27996:ldc2w           #33  <Double 8.8398648000000009D>
	// 17395 27999:dastore         
	// 17396 28000:dup             
	// 17397 28001:iconst_5        
	// 17398 28002:ldc2w           #4335 <Double -0.3568887D>
	// 17399 28005:dastore         
	// 17400 28006:dup             
	// 17401 28007:bipush          6
	// 17402 28009:ldc2w           #4337 <Double -23.055053999999998D>
	// 17403 28012:dastore         
	// 17404 28013:dup             
	// 17405 28014:bipush          7
	// 17406 28016:ldc2w           #4339 <Double 109.0879631D>
	// 17407 28019:dastore         
	// 17408 28020:dup             
	// 17409 28021:bipush          8
	// 17410 28023:ldc2w           #41  <Double -0.54830319999999999D>
	// 17411 28026:dastore         
	// 17412 28027:aastore         
	// 17413 28028:dup             
	// 17414 28029:sipush          403
	// 17415 28032:aload           171
	// 17416 28034:aastore         
	// 17417 28035:dup             
	// 17418 28036:sipush          404
	// 17419 28039:aload           172
	// 17420 28041:aastore         
	// 17421 28042:dup             
	// 17422 28043:sipush          405
	// 17423 28046:bipush          9
	// 17424 28048:newarray        double[]
	// 17425 28050:dup             
	// 17426 28051:iconst_0        
	// 17427 28052:ldc2w           #4341 <Double -15.216744200000001D>
	// 17428 28055:dastore         
	// 17429 28056:dup             
	// 17430 28057:iconst_1        
	// 17431 28058:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17432 28061:dastore         
	// 17433 28062:dup             
	// 17434 28063:iconst_2        
	// 17435 28064:ldc2w           #4343 <Double 2296.6063119D>
	// 17436 28067:dastore         
	// 17437 28068:dup             
	// 17438 28069:iconst_3        
	// 17439 28070:ldc2w           #63  <Double 57.2001287D>
	// 17440 28073:dastore         
	// 17441 28074:dup             
	// 17442 28075:iconst_4        
	// 17443 28076:ldc2w           #65  <Double 8.4126647000000006D>
	// 17444 28079:dastore         
	// 17445 28080:dup             
	// 17446 28081:iconst_5        
	// 17447 28082:ldc2w           #4345 <Double 0.54311129999999996D>
	// 17448 28085:dastore         
	// 17449 28086:dup             
	// 17450 28087:bipush          6
	// 17451 28089:ldc2w           #4347 <Double -2.3395519D>
	// 17452 28092:dastore         
	// 17453 28093:dup             
	// 17454 28094:bipush          7
	// 17455 28096:ldc2w           #4349 <Double -323.09659340000002D>
	// 17456 28099:dastore         
	// 17457 28100:dup             
	// 17458 28101:bipush          8
	// 17459 28103:ldc2w           #73  <Double -0.98049019999999998D>
	// 17460 28106:dastore         
	// 17461 28107:aastore         
	// 17462 28108:dup             
	// 17463 28109:sipush          406
	// 17464 28112:bipush          9
	// 17465 28114:newarray        double[]
	// 17466 28116:dup             
	// 17467 28117:iconst_0        
	// 17468 28118:ldc2w           #4351 <Double -14.9167442D>
	// 17469 28121:dastore         
	// 17470 28122:dup             
	// 17471 28123:iconst_1        
	// 17472 28124:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17473 28127:dastore         
	// 17474 28128:dup             
	// 17475 28129:iconst_2        
	// 17476 28130:ldc2w           #4353 <Double 2255.6025441000002D>
	// 17477 28133:dastore         
	// 17478 28134:dup             
	// 17479 28135:iconst_3        
	// 17480 28136:ldc2w           #345 <Double 68.407805800000006D>
	// 17481 28139:dastore         
	// 17482 28140:dup             
	// 17483 28141:iconst_4        
	// 17484 28142:ldc2w           #347 <Double 8.1813959000000001D>
	// 17485 28145:dastore         
	// 17486 28146:dup             
	// 17487 28147:iconst_5        
	// 17488 28148:ldc2w           #4355 <Double 0.84311130000000001D>
	// 17489 28151:dastore         
	// 17490 28152:dup             
	// 17491 28153:bipush          6
	// 17492 28155:ldc2w           #4357 <Double 5.8189194999999998D>
	// 17493 28158:dastore         
	// 17494 28159:dup             
	// 17495 28160:bipush          7
	// 17496 28162:ldc2w           #4359 <Double -531.9990209D>
	// 17497 28165:dastore         
	// 17498 28166:dup             
	// 17499 28167:bipush          8
	// 17500 28169:ldc2w           #355 <Double -1.1049982D>
	// 17501 28172:dastore         
	// 17502 28173:aastore         
	// 17503 28174:dup             
	// 17504 28175:sipush          407
	// 17505 28178:bipush          9
	// 17506 28180:newarray        double[]
	// 17507 28182:dup             
	// 17508 28183:iconst_0        
	// 17509 28184:ldc2w           #4361 <Double -14.616744199999999D>
	// 17510 28187:dastore         
	// 17511 28188:dup             
	// 17512 28189:iconst_1        
	// 17513 28190:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17514 28193:dastore         
	// 17515 28194:dup             
	// 17516 28195:iconst_2        
	// 17517 28196:ldc2w           #4363 <Double 2214.5987764000001D>
	// 17518 28199:dastore         
	// 17519 28200:dup             
	// 17520 28201:iconst_3        
	// 17521 28202:ldc2w           #79  <Double 80.747736000000003D>
	// 17522 28205:dastore         
	// 17523 28206:dup             
	// 17524 28207:iconst_4        
	// 17525 28208:ldc2w           #81  <Double 7.8897272999999997D>
	// 17526 28211:dastore         
	// 17527 28212:dup             
	// 17528 28213:iconst_5        
	// 17529 28214:ldc2w           #4365 <Double 1.1431112999999999D>
	// 17530 28217:dastore         
	// 17531 28218:dup             
	// 17532 28219:bipush          6
	// 17533 28221:ldc2w           #4367 <Double 13.495882D>
	// 17534 28224:dastore         
	// 17535 28225:dup             
	// 17536 28226:bipush          7
	// 17537 28228:ldc2w           #4369 <Double -753.92790430000002D>
	// 17538 28231:dastore         
	// 17539 28232:dup             
	// 17540 28233:bipush          8
	// 17541 28235:ldc2w           #89  <Double -1.2173562D>
	// 17542 28238:dastore         
	// 17543 28239:aastore         
	// 17544 28240:dup             
	// 17545 28241:sipush          408
	// 17546 28244:bipush          9
	// 17547 28246:newarray        double[]
	// 17548 28248:dup             
	// 17549 28249:iconst_0        
	// 17550 28250:ldc2w           #4371 <Double -14.3167442D>
	// 17551 28253:dastore         
	// 17552 28254:dup             
	// 17553 28255:iconst_1        
	// 17554 28256:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17555 28259:dastore         
	// 17556 28260:dup             
	// 17557 28261:iconst_2        
	// 17558 28262:ldc2w           #4373 <Double 2173.5950087000001D>
	// 17559 28265:dastore         
	// 17560 28266:dup             
	// 17561 28267:iconst_3        
	// 17562 28268:ldc2w           #95  <Double 94.497482399999996D>
	// 17563 28271:dastore         
	// 17564 28272:dup             
	// 17565 28273:iconst_4        
	// 17566 28274:ldc2w           #97  <Double 7.5234689000000001D>
	// 17567 28277:dastore         
	// 17568 28278:dup             
	// 17569 28279:iconst_5        
	// 17570 28280:ldc2w           #4375 <Double 1.4431113D>
	// 17571 28283:dastore         
	// 17572 28284:dup             
	// 17573 28285:bipush          6
	// 17574 28287:ldc2w           #4377 <Double 20.057325200000001D>
	// 17575 28290:dastore         
	// 17576 28291:dup             
	// 17577 28292:bipush          7
	// 17578 28294:ldc2w           #4379 <Double -969.12238170000001D>
	// 17579 28297:dastore         
	// 17580 28298:dup             
	// 17581 28299:bipush          8
	// 17582 28301:ldc2w           #105 <Double -1.3163339000000001D>
	// 17583 28304:dastore         
	// 17584 28305:aastore         
	// 17585 28306:dup             
	// 17586 28307:sipush          409
	// 17587 28310:aload           173
	// 17588 28312:aastore         
	// 17589 28313:dup             
	// 17590 28314:sipush          410
	// 17591 28317:bipush          9
	// 17592 28319:newarray        double[]
	// 17593 28321:dup             
	// 17594 28322:iconst_0        
	// 17595 28323:ldc2w           #4381 <Double -13.716744200000001D>
	// 17596 28326:dastore         
	// 17597 28327:dup             
	// 17598 28328:iconst_1        
	// 17599 28329:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17600 28332:dastore         
	// 17601 28333:dup             
	// 17602 28334:iconst_2        
	// 17603 28335:ldc2w           #4383 <Double 2091.5874733000001D>
	// 17604 28338:dastore         
	// 17605 28339:dup             
	// 17606 28340:iconst_3        
	// 17607 28341:ldc2w           #127 <Double 127.6888198D>
	// 17608 28344:dastore         
	// 17609 28345:dup             
	// 17610 28346:iconst_4        
	// 17611 28347:ldc2w           #129 <Double 6.4866308999999998D>
	// 17612 28350:dastore         
	// 17613 28351:dup             
	// 17614 28352:iconst_5        
	// 17615 28353:ldc2w           #4385 <Double 2.0431113000000001D>
	// 17616 28356:dastore         
	// 17617 28357:dup             
	// 17618 28358:bipush          6
	// 17619 28360:ldc2w           #4387 <Double 27.8949596D>
	// 17620 28363:dastore         
	// 17621 28364:dup             
	// 17622 28365:bipush          7
	// 17623 28367:ldc2w           #4389 <Double -1290.9251999999999D>
	// 17624 28370:dastore         
	// 17625 28371:dup             
	// 17626 28372:bipush          8
	// 17627 28374:ldc2w           #137 <Double -1.4699811D>
	// 17628 28377:dastore         
	// 17629 28378:aastore         
	// 17630 28379:dup             
	// 17631 28380:sipush          411
	// 17632 28383:bipush          9
	// 17633 28385:newarray        double[]
	// 17634 28387:dup             
	// 17635 28388:iconst_0        
	// 17636 28389:ldc2w           #4391 <Double -13.4167442D>
	// 17637 28392:dastore         
	// 17638 28393:dup             
	// 17639 28394:iconst_1        
	// 17640 28395:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17641 28398:dastore         
	// 17642 28399:dup             
	// 17643 28400:iconst_2        
	// 17644 28401:ldc2w           #4393 <Double 2050.5837056D>
	// 17645 28404:dastore         
	// 17646 28405:dup             
	// 17647 28406:iconst_3        
	// 17648 28407:ldc2w           #463 <Double 148.1152635D>
	// 17649 28410:dastore         
	// 17650 28411:dup             
	// 17651 28412:iconst_4        
	// 17652 28413:ldc2w           #465 <Double 5.7586041999999997D>
	// 17653 28416:dastore         
	// 17654 28417:dup             
	// 17655 28418:iconst_5        
	// 17656 28419:ldc2w           #4395 <Double 2.3431112999999999D>
	// 17657 28422:dastore         
	// 17658 28423:dup             
	// 17659 28424:bipush          6
	// 17660 28426:ldc2w           #4397 <Double 28.638877300000001D>
	// 17661 28429:dastore         
	// 17662 28430:dup             
	// 17663 28431:bipush          7
	// 17664 28433:ldc2w           #4399 <Double -1357.8372159D>
	// 17665 28436:dastore         
	// 17666 28437:dup             
	// 17667 28438:bipush          8
	// 17668 28440:ldc2w           #473 <Double -1.5229775000000001D>
	// 17669 28443:dastore         
	// 17670 28444:aastore         
	// 17671 28445:dup             
	// 17672 28446:sipush          412
	// 17673 28449:bipush          9
	// 17674 28451:newarray        double[]
	// 17675 28453:dup             
	// 17676 28454:iconst_0        
	// 17677 28455:ldc2w           #4401 <Double -13.116744199999999D>
	// 17678 28458:dastore         
	// 17679 28459:dup             
	// 17680 28460:iconst_1        
	// 17681 28461:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17682 28464:dastore         
	// 17683 28465:dup             
	// 17684 28466:iconst_2        
	// 17685 28467:ldc2w           #4403 <Double 2009.5799379D>
	// 17686 28470:dastore         
	// 17687 28471:dup             
	// 17688 28472:iconst_3        
	// 17689 28473:ldc2w           #143 <Double 171.99884599999999D>
	// 17690 28476:dastore         
	// 17691 28477:dup             
	// 17692 28478:iconst_4        
	// 17693 28479:ldc2w           #145 <Double 4.8356763999999997D>
	// 17694 28482:dastore         
	// 17695 28483:dup             
	// 17696 28484:iconst_5        
	// 17697 28485:ldc2w           #4405 <Double 2.6431113000000002D>
	// 17698 28488:dastore         
	// 17699 28489:dup             
	// 17700 28490:bipush          6
	// 17701 28492:ldc2w           #4407 <Double 27.254831299999999D>
	// 17702 28495:dastore         
	// 17703 28496:dup             
	// 17704 28497:bipush          7
	// 17705 28499:ldc2w           #4409 <Double -1344.8049758D>
	// 17706 28502:dastore         
	// 17707 28503:dup             
	// 17708 28504:bipush          8
	// 17709 28506:ldc2w           #153 <Double -1.5592649999999999D>
	// 17710 28509:dastore         
	// 17711 28510:aastore         
	// 17712 28511:dup             
	// 17713 28512:sipush          413
	// 17714 28515:aload           174
	// 17715 28517:aastore         
	// 17716 28518:dup             
	// 17717 28519:sipush          414
	// 17718 28522:bipush          9
	// 17719 28524:newarray        double[]
	// 17720 28526:dup             
	// 17721 28527:iconst_0        
	// 17722 28528:ldc2w           #4411 <Double -12.5167442D>
	// 17723 28531:dastore         
	// 17724 28532:dup             
	// 17725 28533:iconst_1        
	// 17726 28534:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17727 28537:dastore         
	// 17728 28538:dup             
	// 17729 28539:iconst_2        
	// 17730 28540:ldc2w           #4413 <Double 1927.5724025D>
	// 17731 28543:dastore         
	// 17732 28544:dup             
	// 17733 28545:iconst_3        
	// 17734 28546:ldc2w           #159 <Double 234.27778710000001D>
	// 17735 28549:dastore         
	// 17736 28550:dup             
	// 17737 28551:iconst_4        
	// 17738 28552:ldc2w           #161 <Double 2.1401053000000001D>
	// 17739 28555:dastore         
	// 17740 28556:dup             
	// 17741 28557:iconst_5        
	// 17742 28558:ldc2w           #4415 <Double 3.2431112999999998D>
	// 17743 28561:dastore         
	// 17744 28562:dup             
	// 17745 28563:bipush          6
	// 17746 28565:ldc2w           #4417 <Double 19.298165900000001D>
	// 17747 28568:dastore         
	// 17748 28569:dup             
	// 17749 28570:bipush          7
	// 17750 28572:ldc2w           #4419 <Double -1080.5024206000001D>
	// 17751 28575:dastore         
	// 17752 28576:dup             
	// 17753 28577:bipush          8
	// 17754 28579:ldc2w           #169 <Double -1.5803442000000001D>
	// 17755 28582:dastore         
	// 17756 28583:aastore         
	// 17757 28584:dup             
	// 17758 28585:sipush          415
	// 17759 28588:bipush          9
	// 17760 28590:newarray        double[]
	// 17761 28592:dup             
	// 17762 28593:iconst_0        
	// 17763 28594:ldc2w           #4421 <Double -12.216744200000001D>
	// 17764 28597:dastore         
	// 17765 28598:dup             
	// 17766 28599:iconst_1        
	// 17767 28600:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17768 28603:dastore         
	// 17769 28604:dup             
	// 17770 28605:iconst_2        
	// 17771 28606:ldc2w           #4423 <Double 1886.5686347000001D>
	// 17772 28609:dastore         
	// 17773 28610:dup             
	// 17774 28611:iconst_3        
	// 17775 28612:ldc2w           #175 <Double 275.7268449D>
	// 17776 28615:dastore         
	// 17777 28616:dup             
	// 17778 28617:iconst_4        
	// 17779 28618:ldc2w           #177 <Double 0.1651599D>
	// 17780 28621:dastore         
	// 17781 28622:dup             
	// 17782 28623:iconst_5        
	// 17783 28624:ldc2w           #4425 <Double 3.5431113000000001D>
	// 17784 28627:dastore         
	// 17785 28628:dup             
	// 17786 28629:bipush          6
	// 17787 28631:ldc2w           #4427 <Double 13.739329100000001D>
	// 17788 28634:dastore         
	// 17789 28635:dup             
	// 17790 28636:bipush          7
	// 17791 28638:ldc2w           #4429 <Double -856.35335009999994D>
	// 17792 28641:dastore         
	// 17793 28642:dup             
	// 17794 28643:bipush          8
	// 17795 28645:ldc2w           #185 <Double -1.5649227999999999D>
	// 17796 28648:dastore         
	// 17797 28649:aastore         
	// 17798 28650:dup             
	// 17799 28651:sipush          416
	// 17800 28654:bipush          9
	// 17801 28656:newarray        double[]
	// 17802 28658:dup             
	// 17803 28659:iconst_0        
	// 17804 28660:ldc2w           #4431 <Double -11.9167442D>
	// 17805 28663:dastore         
	// 17806 28664:dup             
	// 17807 28665:iconst_1        
	// 17808 28666:ldc2w           #1867 <Double 5.1679225999999998D>
	// 17809 28669:dastore         
	// 17810 28670:dup             
	// 17811 28671:iconst_2        
	// 17812 28672:ldc2w           #4433 <Double 1845.564867D>
	// 17813 28675:dastore         
	// 17814 28676:dup             
	// 17815 28677:iconst_3        
	// 17816 28678:ldc2w           #291 <Double 327.13300479999998D>
	// 17817 28681:dastore         
	// 17818 28682:dup             
	// 17819 28683:iconst_4        
	// 17820 28684:ldc2w           #293 <Double -2.4385346000000001D>
	// 17821 28687:dastore         
	// 17822 28688:dup             
	// 17823 28689:iconst_5        
	// 17824 28690:ldc2w           #4435 <Double 3.8431112999999999D>
	// 17825 28693:dastore         
	// 17826 28694:dup             
	// 17827 28695:bipush          6
	// 17828 28697:ldc2w           #4437 <Double 7.9808576999999996D>
	// 17829 28700:dastore         
	// 17830 28701:dup             
	// 17831 28702:bipush          7
	// 17832 28704:ldc2w           #4439 <Double -605.49611100000004D>
	// 17833 28707:dastore         
	// 17834 28708:dup             
	// 17835 28709:bipush          8
	// 17836 28711:ldc2w           #301 <Double -1.5323681D>
	// 17837 28714:dastore         
	// 17838 28715:aastore         
	// 17839 28716:dup             
	// 17840 28717:sipush          417
	// 17841 28720:aload           175
	// 17842 28722:aastore         
	// 17843 28723:dup             
	// 17844 28724:sipush          418
	// 17845 28727:bipush          9
	// 17846 28729:newarray        double[]
	// 17847 28731:dup             
	// 17848 28732:iconst_0        
	// 17849 28733:ldc2w           #4441 <Double -15.058972300000001D>
	// 17850 28736:dastore         
	// 17851 28737:dup             
	// 17852 28738:iconst_1        
	// 17853 28739:ldc2w           #1929 <Double 5.7192432000000002D>
	// 17854 28742:dastore         
	// 17855 28743:dup             
	// 17856 28744:iconst_2        
	// 17857 28745:ldc2w           #4443 <Double 2273.0478588000001D>
	// 17858 28748:dastore         
	// 17859 28749:dup             
	// 17860 28750:iconst_3        
	// 17861 28751:ldc2w           #209 <Double 3.0597946D>
	// 17862 28754:dastore         
	// 17863 28755:dup             
	// 17864 28756:iconst_4        
	// 17865 28757:ldc2w           #211 <Double 8.9830009000000004D>
	// 17866 28760:dastore         
	// 17867 28761:dup             
	// 17868 28762:iconst_5        
	// 17869 28763:ldc2w           #4445 <Double -1.2577194D>
	// 17870 28766:dastore         
	// 17871 28767:dup             
	// 17872 28768:bipush          6
	// 17873 28770:ldc2w           #4447 <Double -27.678641800000001D>
	// 17874 28773:dastore         
	// 17875 28774:dup             
	// 17876 28775:bipush          7
	// 17877 28777:ldc2w           #4449 <Double 271.76838479999998D>
	// 17878 28780:dastore         
	// 17879 28781:dup             
	// 17880 28782:bipush          8
	// 17881 28784:ldc2w           #219 <Double -0.062199999999999998D>
	// 17882 28787:dastore         
	// 17883 28788:aastore         
	// 17884 28789:dup             
	// 17885 28790:sipush          419
	// 17886 28793:aload           176
	// 17887 28795:aastore         
	// 17888 28796:dup             
	// 17889 28797:sipush          420
	// 17890 28800:bipush          9
	// 17891 28802:newarray        double[]
	// 17892 28804:dup             
	// 17893 28805:iconst_0        
	// 17894 28806:ldc2w           #4451 <Double -14.458972299999999D>
	// 17895 28809:dastore         
	// 17896 28810:dup             
	// 17897 28811:iconst_1        
	// 17898 28812:ldc2w           #1929 <Double 5.7192432000000002D>
	// 17899 28815:dastore         
	// 17900 28816:dup             
	// 17901 28817:iconst_2        
	// 17902 28818:ldc2w           #4453 <Double 2187.7323996D>
	// 17903 28821:dastore         
	// 17904 28822:dup             
	// 17905 28823:iconst_3        
	// 17906 28824:ldc2w           #15  <Double 19.625597299999999D>
	// 17907 28827:dastore         
	// 17908 28828:dup             
	// 17909 28829:iconst_4        
	// 17910 28830:ldc2w           #17  <Double 8.9143979000000009D>
	// 17911 28833:dastore         
	// 17912 28834:dup             
	// 17913 28835:iconst_5        
	// 17914 28836:ldc2w           #4455 <Double -0.65771939999999995D>
	// 17915 28839:dastore         
	// 17916 28840:dup             
	// 17917 28841:bipush          6
	// 17918 28843:ldc2w           #4457 <Double -26.539085400000001D>
	// 17919 28846:dastore         
	// 17920 28847:dup             
	// 17921 28848:bipush          7
	// 17922 28850:ldc2w           #4459 <Double 180.23682500000001D>
	// 17923 28853:dastore         
	// 17924 28854:dup             
	// 17925 28855:bipush          8
	// 17926 28857:ldc2w           #25  <Double -0.38996530000000001D>
	// 17927 28860:dastore         
	// 17928 28861:aastore         
	// 17929 28862:dup             
	// 17930 28863:sipush          421
	// 17931 28866:aload           177
	// 17932 28868:aastore         
	// 17933 28869:dup             
	// 17934 28870:sipush          422
	// 17935 28873:bipush          9
	// 17936 28875:newarray        double[]
	// 17937 28877:dup             
	// 17938 28878:iconst_0        
	// 17939 28879:ldc2w           #4461 <Double -13.8589723D>
	// 17940 28882:dastore         
	// 17941 28883:dup             
	// 17942 28884:iconst_1        
	// 17943 28885:ldc2w           #1929 <Double 5.7192432000000002D>
	// 17944 28888:dastore         
	// 17945 28889:dup             
	// 17946 28890:iconst_2        
	// 17947 28891:ldc2w           #4463 <Double 2102.4169403999999D>
	// 17948 28894:dastore         
	// 17949 28895:dup             
	// 17950 28896:iconst_3        
	// 17951 28897:ldc2w           #47  <Double 37.305238799999998D>
	// 17952 28900:dastore         
	// 17953 28901:dup             
	// 17954 28902:iconst_4        
	// 17955 28903:ldc2w           #49  <Double 8.7346948999999992D>
	// 17956 28906:dastore         
	// 17957 28907:dup             
	// 17958 28908:iconst_5        
	// 17959 28909:ldc2w           #4465 <Double -0.057719399999999997D>
	// 17960 28912:dastore         
	// 17961 28913:dup             
	// 17962 28914:bipush          6
	// 17963 28916:ldc2w           #4467 <Double -17.095974200000001D>
	// 17964 28919:dastore         
	// 17965 28920:dup             
	// 17966 28921:bipush          7
	// 17967 28923:ldc2w           #4469 <Double -1.6944545D>
	// 17968 28926:dastore         
	// 17969 28927:dup             
	// 17970 28928:bipush          8
	// 17971 28930:ldc2w           #57  <Double -0.70060560000000005D>
	// 17972 28933:dastore         
	// 17973 28934:aastore         
	// 17974 28935:dup             
	// 17975 28936:sipush          423
	// 17976 28939:aload           178
	// 17977 28941:aastore         
	// 17978 28942:dup             
	// 17979 28943:sipush          424
	// 17980 28946:bipush          9
	// 17981 28948:newarray        double[]
	// 17982 28950:dup             
	// 17983 28951:iconst_0        
	// 17984 28952:ldc2w           #4471 <Double -13.2589723D>
	// 17985 28955:dastore         
	// 17986 28956:dup             
	// 17987 28957:iconst_1        
	// 17988 28958:ldc2w           #1929 <Double 5.7192432000000002D>
	// 17989 28961:dastore         
	// 17990 28962:dup             
	// 17991 28963:iconst_2        
	// 17992 28964:ldc2w           #4473 <Double 2017.1014812999999D>
	// 17993 28967:dastore         
	// 17994 28968:dup             
	// 17995 28969:iconst_3        
	// 17996 28970:ldc2w           #63  <Double 57.2001287D>
	// 17997 28973:dastore         
	// 17998 28974:dup             
	// 17999 28975:iconst_4        
	// 18000 28976:ldc2w           #65  <Double 8.4126647000000006D>
	// 18001 28979:dastore         
	// 18002 28980:dup             
	// 18003 28981:iconst_5        
	// 18004 28982:ldc2w           #4475 <Double 0.5422806D>
	// 18005 28985:dastore         
	// 18006 28986:dup             
	// 18007 28987:bipush          6
	// 18008 28989:ldc2w           #4477 <Double -2.0395373000000001D>
	// 18009 28992:dastore         
	// 18010 28993:dup             
	// 18011 28994:bipush          7
	// 18012 28996:ldc2w           #4479 <Double -329.05809929999998D>
	// 18013 28999:dastore         
	// 18014 29000:dup             
	// 18015 29001:bipush          8
	// 18016 29003:ldc2w           #73  <Double -0.98049019999999998D>
	// 18017 29006:dastore         
	// 18018 29007:aastore         
	// 18019 29008:dup             
	// 18020 29009:sipush          425
	// 18021 29012:bipush          9
	// 18022 29014:newarray        double[]
	// 18023 29016:dup             
	// 18024 29017:iconst_0        
	// 18025 29018:ldc2w           #4481 <Double -12.958972299999999D>
	// 18026 29021:dastore         
	// 18027 29022:dup             
	// 18028 29023:iconst_1        
	// 18029 29024:ldc2w           #1929 <Double 5.7192432000000002D>
	// 18030 29027:dastore         
	// 18031 29028:dup             
	// 18032 29029:iconst_2        
	// 18033 29030:ldc2w           #4483 <Double 1974.4437516999999D>
	// 18034 29033:dastore         
	// 18035 29034:dup             
	// 18036 29035:iconst_3        
	// 18037 29036:ldc2w           #345 <Double 68.407805800000006D>
	// 18038 29039:dastore         
	// 18039 29040:dup             
	// 18040 29041:iconst_4        
	// 18041 29042:ldc2w           #347 <Double 8.1813959000000001D>
	// 18042 29045:dastore         
	// 18043 29046:dup             
	// 18044 29047:iconst_5        
	// 18045 29048:ldc2w           #4485 <Double 0.84228060000000005D>
	// 18046 29051:dastore         
	// 18047 29052:dup             
	// 18048 29053:bipush          6
	// 18049 29055:ldc2w           #4487 <Double 6.1189342D>
	// 18050 29058:dastore         
	// 18051 29059:dup             
	// 18052 29060:bipush          7
	// 18053 29062:ldc2w           #4489 <Double -538.86057059999996D>
	// 18054 29065:dastore         
	// 18055 29066:dup             
	// 18056 29067:bipush          8
	// 18057 29069:ldc2w           #355 <Double -1.1049982D>
	// 18058 29072:dastore         
	// 18059 29073:aastore         
	// 18060 29074:dup             
	// 18061 29075:sipush          426
	// 18062 29078:bipush          9
	// 18063 29080:newarray        double[]
	// 18064 29082:dup             
	// 18065 29083:iconst_0        
	// 18066 29084:ldc2w           #4491 <Double -12.6589723D>
	// 18067 29087:dastore         
	// 18068 29088:dup             
	// 18069 29089:iconst_1        
	// 18070 29090:ldc2w           #1929 <Double 5.7192432000000002D>
	// 18071 29093:dastore         
	// 18072 29094:dup             
	// 18073 29095:iconst_2        
	// 18074 29096:ldc2w           #4493 <Double 1931.7860221000001D>
	// 18075 29099:dastore         
	// 18076 29100:dup             
	// 18077 29101:iconst_3        
	// 18078 29102:ldc2w           #79  <Double 80.747736000000003D>
	// 18079 29105:dastore         
	// 18080 29106:dup             
	// 18081 29107:iconst_4        
	// 18082 29108:ldc2w           #81  <Double 7.8897272999999997D>
	// 18083 29111:dastore         
	// 18084 29112:dup             
	// 18085 29113:iconst_5        
	// 18086 29114:ldc2w           #4495 <Double 1.1422806000000001D>
	// 18087 29117:dastore         
	// 18088 29118:dup             
	// 18089 29119:bipush          6
	// 18090 29121:ldc2w           #4497 <Double 13.795896600000001D>
	// 18091 29124:dastore         
	// 18092 29125:dup             
	// 18093 29126:bipush          7
	// 18094 29128:ldc2w           #4499 <Double -761.68949799999996D>
	// 18095 29131:dastore         
	// 18096 29132:dup             
	// 18097 29133:bipush          8
	// 18098 29135:ldc2w           #89  <Double -1.2173562D>
	// 18099 29138:dastore         
	// 18100 29139:aastore         
	// 18101 29140:dup             
	// 18102 29141:sipush          427
	// 18103 29144:bipush          9
	// 18104 29146:newarray        double[]
	// 18105 29148:dup             
	// 18106 29149:iconst_0        
	// 18107 29150:ldc2w           #4501 <Double -12.3589723D>
	// 18108 29153:dastore         
	// 18109 29154:dup             
	// 18110 29155:iconst_1        
	// 18111 29156:ldc2w           #1929 <Double 5.7192432000000002D>
	// 18112 29159:dastore         
	// 18113 29160:dup             
	// 18114 29161:iconst_2        
	// 18115 29162:ldc2w           #4503 <Double 1889.1282925D>
	// 18116 29165:dastore         
	// 18117 29166:dup             
	// 18118 29167:iconst_3        
	// 18119 29168:ldc2w           #95  <Double 94.497482399999996D>
	// 18120 29171:dastore         
	// 18121 29172:dup             
	// 18122 29173:iconst_4        
	// 18123 29174:ldc2w           #97  <Double 7.5234689000000001D>
	// 18124 29177:dastore         
	// 18125 29178:dup             
	// 18126 29179:iconst_5        
	// 18127 29180:ldc2w           #4505 <Double 1.4422805999999999D>
	// 18128 29183:dastore         
	// 18129 29184:dup             
	// 18130 29185:bipush          6
	// 18131 29187:ldc2w           #4507 <Double 20.357339799999998D>
	// 18132 29190:dastore         
	// 18133 29191:dup             
	// 18134 29192:bipush          7
	// 18135 29194:ldc2w           #4509 <Double -977.78401919999999D>
	// 18136 29197:dastore         
	// 18137 29198:dup             
	// 18138 29199:bipush          8
	// 18139 29201:ldc2w           #105 <Double -1.3163339000000001D>
	// 18140 29204:dastore         
	// 18141 29205:aastore         
	// 18142 29206:dup             
	// 18143 29207:sipush          428
	// 18144 29210:aload           179
	// 18145 29212:aastore         
	// 18146 29213:dup             
	// 18147 29214:sipush          429
	// 18148 29217:bipush          9
	// 18149 29219:newarray        double[]
	// 18150 29221:dup             
	// 18151 29222:iconst_0        
	// 18152 29223:ldc2w           #4511 <Double -11.7589723D>
	// 18153 29226:dastore         
	// 18154 29227:dup             
	// 18155 29228:iconst_1        
	// 18156 29229:ldc2w           #1929 <Double 5.7192432000000002D>
	// 18157 29232:dastore         
	// 18158 29233:dup             
	// 18159 29234:iconst_2        
	// 18160 29235:ldc2w           #4513 <Double 1803.8128333D>
	// 18161 29238:dastore         
	// 18162 29239:dup             
	// 18163 29240:iconst_3        
	// 18164 29241:ldc2w           #127 <Double 127.6888198D>
	// 18165 29244:dastore         
	// 18166 29245:dup             
	// 18167 29246:iconst_4        
	// 18168 29247:ldc2w           #129 <Double 6.4866308999999998D>
	// 18169 29250:dastore         
	// 18170 29251:dup             
	// 18171 29252:iconst_5        
	// 18172 29253:ldc2w           #4515 <Double 2.0422805999999998D>
	// 18173 29256:dastore         
	// 18174 29257:dup             
	// 18175 29258:bipush          6
	// 18176 29260:ldc2w           #4517 <Double 28.194974200000001D>
	// 18177 29263:dastore         
	// 18178 29264:dup             
	// 18179 29265:bipush          7
	// 18180 29267:ldc2w           #4519 <Double -1301.3869253D>
	// 18181 29270:dastore         
	// 18182 29271:dup             
	// 18183 29272:bipush          8
	// 18184 29274:ldc2w           #137 <Double -1.4699811D>
	// 18185 29277:dastore         
	// 18186 29278:aastore         
	// 18187 29279:dup             
	// 18188 29280:sipush          430
	// 18189 29283:aload           180
	// 18190 29285:aastore         
	// 18191 29286:dup             
	// 18192 29287:sipush          431
	// 18193 29290:bipush          9
	// 18194 29292:newarray        double[]
	// 18195 29294:dup             
	// 18196 29295:iconst_0        
	// 18197 29296:ldc2w           #4521 <Double -11.1589723D>
	// 18198 29299:dastore         
	// 18199 29300:dup             
	// 18200 29301:iconst_1        
	// 18201 29302:ldc2w           #1929 <Double 5.7192432000000002D>
	// 18202 29305:dastore         
	// 18203 29306:dup             
	// 18204 29307:iconst_2        
	// 18205 29308:ldc2w           #4523 <Double 1718.4973742D>
	// 18206 29311:dastore         
	// 18207 29312:dup             
	// 18208 29313:iconst_3        
	// 18209 29314:ldc2w           #143 <Double 171.99884599999999D>
	// 18210 29317:dastore         
	// 18211 29318:dup             
	// 18212 29319:iconst_4        
	// 18213 29320:ldc2w           #145 <Double 4.8356763999999997D>
	// 18214 29323:dastore         
	// 18215 29324:dup             
	// 18216 29325:iconst_5        
	// 18217 29326:ldc2w           #4525 <Double 2.6422805999999999D>
	// 18218 29329:dastore         
	// 18219 29330:dup             
	// 18220 29331:bipush          6
	// 18221 29333:ldc2w           #4527 <Double 27.5548459D>
	// 18222 29336:dastore         
	// 18223 29337:dup             
	// 18224 29338:bipush          7
	// 18225 29340:ldc2w           #4529 <Double -1357.0667888999999D>
	// 18226 29343:dastore         
	// 18227 29344:dup             
	// 18228 29345:bipush          8
	// 18229 29347:ldc2w           #153 <Double -1.5592649999999999D>
	// 18230 29350:dastore         
	// 18231 29351:aastore         
	// 18232 29352:dup             
	// 18233 29353:sipush          432
	// 18234 29356:aload           181
	// 18235 29358:aastore         
	// 18236 29359:dup             
	// 18237 29360:sipush          433
	// 18238 29363:aload           182
	// 18239 29365:aastore         
	// 18240 29366:dup             
	// 18241 29367:sipush          434
	// 18242 29370:aload           183
	// 18243 29372:aastore         
	// 18244 29373:dup             
	// 18245 29374:sipush          435
	// 18246 29377:aload           184
	// 18247 29379:aastore         
	// 18248 29380:dup             
	// 18249 29381:sipush          436
	// 18250 29384:bipush          9
	// 18251 29386:newarray        double[]
	// 18252 29388:dup             
	// 18253 29389:iconst_0        
	// 18254 29390:ldc2w           #4531 <Double -9.6589723000000003D>
	// 18255 29393:dastore         
	// 18256 29394:dup             
	// 18257 29395:iconst_1        
	// 18258 29396:ldc2w           #1929 <Double 5.7192432000000002D>
	// 18259 29399:dastore         
	// 18260 29400:dup             
	// 18261 29401:iconst_2        
	// 18262 29402:ldc2w           #4533 <Double 1505.2087262D>
	// 18263 29405:dastore         
	// 18264 29406:dup             
	// 18265 29407:iconst_3        
	// 18266 29408:ldc2w           #191 <Double 392.10647540000002D>
	// 18267 29411:dastore         
	// 18268 29412:dup             
	// 18269 29413:iconst_4        
	// 18270 29414:ldc2w           #193 <Double -5.9244687000000003D>
	// 18271 29417:dastore         
	// 18272 29418:dup             
	// 18273 29419:iconst_5        
	// 18274 29420:ldc2w           #4535 <Double 4.1422806000000003D>
	// 18275 29423:dastore         
	// 18276 29424:dup             
	// 18277 29425:bipush          6
	// 18278 29427:ldc2w           #4537 <Double 3.0039099D>
	// 18279 29430:dastore         
	// 18280 29431:dup             
	// 18281 29432:bipush          7
	// 18282 29434:ldc2w           #4539 <Double -380.01971909999997D>
	// 18283 29437:dastore         
	// 18284 29438:dup             
	// 18285 29439:bipush          8
	// 18286 29441:ldc2w           #201 <Double -1.4830451D>
	// 18287 29444:dastore         
	// 18288 29445:aastore         
	// 18289 29446:putstatic       #4542 <Field double[][] a>
	//*18290 29449:return          
	}
}
