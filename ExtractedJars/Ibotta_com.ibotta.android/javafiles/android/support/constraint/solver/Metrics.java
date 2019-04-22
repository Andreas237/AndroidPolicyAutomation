// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;

import java.util.ArrayList;

public class Metrics
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("\n*** Metrics ***\nmeasures: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #47  <String "\n*** Metrics ***\nmeasures: ">
	//    6   11:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(measures);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #53  <Field long measures>
	//   11   20:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   12   23:pop             
		stringbuilder.append("\nadditionalMeasures: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #58  <String "\nadditionalMeasures: ">
	//   15   27:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(additionalMeasures);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #60  <Field long additionalMeasures>
	//   20   36:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   21   39:pop             
		stringbuilder.append("\nresolutions passes: ");
	//   22   40:aload_1         
	//   23   41:ldc1            #62  <String "\nresolutions passes: ">
	//   24   43:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(resolutions);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #64  <Field long resolutions>
	//   29   52:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   30   55:pop             
		stringbuilder.append("\ntable increases: ");
	//   31   56:aload_1         
	//   32   57:ldc1            #66  <String "\ntable increases: ">
	//   33   59:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(tableSizeIncrease);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #68  <Field long tableSizeIncrease>
	//   38   68:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   39   71:pop             
		stringbuilder.append("\nmaxTableSize: ");
	//   40   72:aload_1         
	//   41   73:ldc1            #70  <String "\nmaxTableSize: ">
	//   42   75:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(maxTableSize);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #72  <Field long maxTableSize>
	//   47   84:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   48   87:pop             
		stringbuilder.append("\nmaxVariables: ");
	//   49   88:aload_1         
	//   50   89:ldc1            #74  <String "\nmaxVariables: ">
	//   51   91:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(maxVariables);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #76  <Field long maxVariables>
	//   56  100:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   57  103:pop             
		stringbuilder.append("\nmaxRows: ");
	//   58  104:aload_1         
	//   59  105:ldc1            #78  <String "\nmaxRows: ">
	//   60  107:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(maxRows);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #80  <Field long maxRows>
	//   65  116:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   66  119:pop             
		stringbuilder.append("\n\nminimize: ");
	//   67  120:aload_1         
	//   68  121:ldc1            #82  <String "\n\nminimize: ">
	//   69  123:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(minimize);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #84  <Field long minimize>
	//   74  132:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   75  135:pop             
		stringbuilder.append("\nminimizeGoal: ");
	//   76  136:aload_1         
	//   77  137:ldc1            #86  <String "\nminimizeGoal: ">
	//   78  139:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(minimizeGoal);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #88  <Field long minimizeGoal>
	//   83  148:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   84  151:pop             
		stringbuilder.append("\nconstraints: ");
	//   85  152:aload_1         
	//   86  153:ldc1            #90  <String "\nconstraints: ">
	//   87  155:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   88  158:pop             
		stringbuilder.append(constraints);
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #92  <Field long constraints>
	//   92  164:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   93  167:pop             
		stringbuilder.append("\nsimpleconstraints: ");
	//   94  168:aload_1         
	//   95  169:ldc1            #94  <String "\nsimpleconstraints: ">
	//   96  171:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   97  174:pop             
		stringbuilder.append(simpleconstraints);
	//   98  175:aload_1         
	//   99  176:aload_0         
	//  100  177:getfield        #96  <Field long simpleconstraints>
	//  101  180:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  102  183:pop             
		stringbuilder.append("\noptimize: ");
	//  103  184:aload_1         
	//  104  185:ldc1            #98  <String "\noptimize: ">
	//  105  187:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  106  190:pop             
		stringbuilder.append(optimize);
	//  107  191:aload_1         
	//  108  192:aload_0         
	//  109  193:getfield        #100 <Field long optimize>
	//  110  196:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  111  199:pop             
		stringbuilder.append("\niterations: ");
	//  112  200:aload_1         
	//  113  201:ldc1            #102 <String "\niterations: ">
	//  114  203:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  115  206:pop             
		stringbuilder.append(iterations);
	//  116  207:aload_1         
	//  117  208:aload_0         
	//  118  209:getfield        #104 <Field long iterations>
	//  119  212:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  120  215:pop             
		stringbuilder.append("\npivots: ");
	//  121  216:aload_1         
	//  122  217:ldc1            #106 <String "\npivots: ">
	//  123  219:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  124  222:pop             
		stringbuilder.append(pivots);
	//  125  223:aload_1         
	//  126  224:aload_0         
	//  127  225:getfield        #108 <Field long pivots>
	//  128  228:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  129  231:pop             
		stringbuilder.append("\nbfs: ");
	//  130  232:aload_1         
	//  131  233:ldc1            #110 <String "\nbfs: ">
	//  132  235:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  133  238:pop             
		stringbuilder.append(bfs);
	//  134  239:aload_1         
	//  135  240:aload_0         
	//  136  241:getfield        #112 <Field long bfs>
	//  137  244:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  138  247:pop             
		stringbuilder.append("\nvariables: ");
	//  139  248:aload_1         
	//  140  249:ldc1            #114 <String "\nvariables: ">
	//  141  251:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  142  254:pop             
		stringbuilder.append(variables);
	//  143  255:aload_1         
	//  144  256:aload_0         
	//  145  257:getfield        #116 <Field long variables>
	//  146  260:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  147  263:pop             
		stringbuilder.append("\nerrors: ");
	//  148  264:aload_1         
	//  149  265:ldc1            #118 <String "\nerrors: ">
	//  150  267:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  151  270:pop             
		stringbuilder.append(errors);
	//  152  271:aload_1         
	//  153  272:aload_0         
	//  154  273:getfield        #120 <Field long errors>
	//  155  276:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  156  279:pop             
		stringbuilder.append("\nslackvariables: ");
	//  157  280:aload_1         
	//  158  281:ldc1            #122 <String "\nslackvariables: ">
	//  159  283:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  160  286:pop             
		stringbuilder.append(slackvariables);
	//  161  287:aload_1         
	//  162  288:aload_0         
	//  163  289:getfield        #124 <Field long slackvariables>
	//  164  292:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  165  295:pop             
		stringbuilder.append("\nextravariables: ");
	//  166  296:aload_1         
	//  167  297:ldc1            #126 <String "\nextravariables: ">
	//  168  299:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  169  302:pop             
		stringbuilder.append(extravariables);
	//  170  303:aload_1         
	//  171  304:aload_0         
	//  172  305:getfield        #128 <Field long extravariables>
	//  173  308:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  174  311:pop             
		stringbuilder.append("\nfullySolved: ");
	//  175  312:aload_1         
	//  176  313:ldc1            #130 <String "\nfullySolved: ">
	//  177  315:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  178  318:pop             
		stringbuilder.append(fullySolved);
	//  179  319:aload_1         
	//  180  320:aload_0         
	//  181  321:getfield        #132 <Field long fullySolved>
	//  182  324:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  183  327:pop             
		stringbuilder.append("\ngraphOptimizer: ");
	//  184  328:aload_1         
	//  185  329:ldc1            #134 <String "\ngraphOptimizer: ">
	//  186  331:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  187  334:pop             
		stringbuilder.append(graphOptimizer);
	//  188  335:aload_1         
	//  189  336:aload_0         
	//  190  337:getfield        #136 <Field long graphOptimizer>
	//  191  340:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  192  343:pop             
		stringbuilder.append("\nresolvedWidgets: ");
	//  193  344:aload_1         
	//  194  345:ldc1            #138 <String "\nresolvedWidgets: ">
	//  195  347:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  196  350:pop             
		stringbuilder.append(resolvedWidgets);
	//  197  351:aload_1         
	//  198  352:aload_0         
	//  199  353:getfield        #140 <Field long resolvedWidgets>
	//  200  356:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  201  359:pop             
		stringbuilder.append("\noldresolvedWidgets: ");
	//  202  360:aload_1         
	//  203  361:ldc1            #142 <String "\noldresolvedWidgets: ">
	//  204  363:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  205  366:pop             
		stringbuilder.append(oldresolvedWidgets);
	//  206  367:aload_1         
	//  207  368:aload_0         
	//  208  369:getfield        #144 <Field long oldresolvedWidgets>
	//  209  372:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  210  375:pop             
		stringbuilder.append("\nnonresolvedWidgets: ");
	//  211  376:aload_1         
	//  212  377:ldc1            #146 <String "\nnonresolvedWidgets: ">
	//  213  379:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  214  382:pop             
		stringbuilder.append(nonresolvedWidgets);
	//  215  383:aload_1         
	//  216  384:aload_0         
	//  217  385:getfield        #148 <Field long nonresolvedWidgets>
	//  218  388:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  219  391:pop             
		stringbuilder.append("\ncenterConnectionResolved: ");
	//  220  392:aload_1         
	//  221  393:ldc1            #150 <String "\ncenterConnectionResolved: ">
	//  222  395:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  223  398:pop             
		stringbuilder.append(centerConnectionResolved);
	//  224  399:aload_1         
	//  225  400:aload_0         
	//  226  401:getfield        #152 <Field long centerConnectionResolved>
	//  227  404:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  228  407:pop             
		stringbuilder.append("\nmatchConnectionResolved: ");
	//  229  408:aload_1         
	//  230  409:ldc1            #154 <String "\nmatchConnectionResolved: ">
	//  231  411:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  232  414:pop             
		stringbuilder.append(matchConnectionResolved);
	//  233  415:aload_1         
	//  234  416:aload_0         
	//  235  417:getfield        #156 <Field long matchConnectionResolved>
	//  236  420:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  237  423:pop             
		stringbuilder.append("\nchainConnectionResolved: ");
	//  238  424:aload_1         
	//  239  425:ldc1            #158 <String "\nchainConnectionResolved: ">
	//  240  427:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  241  430:pop             
		stringbuilder.append(chainConnectionResolved);
	//  242  431:aload_1         
	//  243  432:aload_0         
	//  244  433:getfield        #160 <Field long chainConnectionResolved>
	//  245  436:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  246  439:pop             
		stringbuilder.append("\nbarrierConnectionResolved: ");
	//  247  440:aload_1         
	//  248  441:ldc1            #162 <String "\nbarrierConnectionResolved: ">
	//  249  443:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  250  446:pop             
		stringbuilder.append(barrierConnectionResolved);
	//  251  447:aload_1         
	//  252  448:aload_0         
	//  253  449:getfield        #164 <Field long barrierConnectionResolved>
	//  254  452:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//  255  455:pop             
		stringbuilder.append("\nproblematicsLayouts: ");
	//  256  456:aload_1         
	//  257  457:ldc1            #166 <String "\nproblematicsLayouts: ">
	//  258  459:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  259  462:pop             
		stringbuilder.append(((Object) (problematicLayouts)));
	//  260  463:aload_1         
	//  261  464:aload_0         
	//  262  465:getfield        #168 <Field ArrayList problematicLayouts>
	//  263  468:invokevirtual   #171 <Method StringBuilder StringBuilder.append(Object)>
	//  264  471:pop             
		stringbuilder.append("\n");
	//  265  472:aload_1         
	//  266  473:ldc1            #173 <String "\n">
	//  267  475:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//  268  478:pop             
		return stringbuilder.toString();
	//  269  479:aload_1         
	//  270  480:invokevirtual   #175 <Method String StringBuilder.toString()>
	//  271  483:areturn         
	}

	public long additionalMeasures;
	public long barrierConnectionResolved;
	public long bfs;
	public long centerConnectionResolved;
	public long chainConnectionResolved;
	public long constraints;
	public long errors;
	public long extravariables;
	public long fullySolved;
	public long graphOptimizer;
	public long iterations;
	public long lastTableSize;
	public long matchConnectionResolved;
	public long maxRows;
	public long maxTableSize;
	public long maxVariables;
	public long measures;
	public long minimize;
	public long minimizeGoal;
	public long nonresolvedWidgets;
	public long oldresolvedWidgets;
	public long optimize;
	public long pivots;
	public ArrayList problematicLayouts;
	public long resolutions;
	public long resolvedWidgets;
	public long simpleconstraints;
	public long slackvariables;
	public long tableSizeIncrease;
	public long variables;
}
