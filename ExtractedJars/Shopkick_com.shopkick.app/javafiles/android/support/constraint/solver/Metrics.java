// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;

import java.util.ArrayList;

public class Metrics
{

	public Metrics()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		problematicLayouts = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #43  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #44  <Method void ArrayList()>
	//    6   12:putfield        #46  <Field ArrayList problematicLayouts>
	//    7   15:return          
	}

	public void reset()
	{
		measures = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #50  <Field long measures>
		additionalMeasures = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #52  <Field long additionalMeasures>
		resolutions = 0L;
	//    6   10:aload_0         
	//    7   11:lconst_0        
	//    8   12:putfield        #54  <Field long resolutions>
		tableSizeIncrease = 0L;
	//    9   15:aload_0         
	//   10   16:lconst_0        
	//   11   17:putfield        #56  <Field long tableSizeIncrease>
		maxTableSize = 0L;
	//   12   20:aload_0         
	//   13   21:lconst_0        
	//   14   22:putfield        #58  <Field long maxTableSize>
		lastTableSize = 0L;
	//   15   25:aload_0         
	//   16   26:lconst_0        
	//   17   27:putfield        #60  <Field long lastTableSize>
		maxVariables = 0L;
	//   18   30:aload_0         
	//   19   31:lconst_0        
	//   20   32:putfield        #62  <Field long maxVariables>
		maxRows = 0L;
	//   21   35:aload_0         
	//   22   36:lconst_0        
	//   23   37:putfield        #64  <Field long maxRows>
		minimize = 0L;
	//   24   40:aload_0         
	//   25   41:lconst_0        
	//   26   42:putfield        #66  <Field long minimize>
		minimizeGoal = 0L;
	//   27   45:aload_0         
	//   28   46:lconst_0        
	//   29   47:putfield        #68  <Field long minimizeGoal>
		constraints = 0L;
	//   30   50:aload_0         
	//   31   51:lconst_0        
	//   32   52:putfield        #70  <Field long constraints>
		simpleconstraints = 0L;
	//   33   55:aload_0         
	//   34   56:lconst_0        
	//   35   57:putfield        #72  <Field long simpleconstraints>
		optimize = 0L;
	//   36   60:aload_0         
	//   37   61:lconst_0        
	//   38   62:putfield        #74  <Field long optimize>
		iterations = 0L;
	//   39   65:aload_0         
	//   40   66:lconst_0        
	//   41   67:putfield        #76  <Field long iterations>
		pivots = 0L;
	//   42   70:aload_0         
	//   43   71:lconst_0        
	//   44   72:putfield        #78  <Field long pivots>
		bfs = 0L;
	//   45   75:aload_0         
	//   46   76:lconst_0        
	//   47   77:putfield        #80  <Field long bfs>
		variables = 0L;
	//   48   80:aload_0         
	//   49   81:lconst_0        
	//   50   82:putfield        #82  <Field long variables>
		errors = 0L;
	//   51   85:aload_0         
	//   52   86:lconst_0        
	//   53   87:putfield        #84  <Field long errors>
		slackvariables = 0L;
	//   54   90:aload_0         
	//   55   91:lconst_0        
	//   56   92:putfield        #86  <Field long slackvariables>
		extravariables = 0L;
	//   57   95:aload_0         
	//   58   96:lconst_0        
	//   59   97:putfield        #88  <Field long extravariables>
		fullySolved = 0L;
	//   60  100:aload_0         
	//   61  101:lconst_0        
	//   62  102:putfield        #90  <Field long fullySolved>
		graphOptimizer = 0L;
	//   63  105:aload_0         
	//   64  106:lconst_0        
	//   65  107:putfield        #92  <Field long graphOptimizer>
		resolvedWidgets = 0L;
	//   66  110:aload_0         
	//   67  111:lconst_0        
	//   68  112:putfield        #94  <Field long resolvedWidgets>
		oldresolvedWidgets = 0L;
	//   69  115:aload_0         
	//   70  116:lconst_0        
	//   71  117:putfield        #96  <Field long oldresolvedWidgets>
		nonresolvedWidgets = 0L;
	//   72  120:aload_0         
	//   73  121:lconst_0        
	//   74  122:putfield        #98  <Field long nonresolvedWidgets>
		centerConnectionResolved = 0L;
	//   75  125:aload_0         
	//   76  126:lconst_0        
	//   77  127:putfield        #100 <Field long centerConnectionResolved>
		matchConnectionResolved = 0L;
	//   78  130:aload_0         
	//   79  131:lconst_0        
	//   80  132:putfield        #102 <Field long matchConnectionResolved>
		chainConnectionResolved = 0L;
	//   81  135:aload_0         
	//   82  136:lconst_0        
	//   83  137:putfield        #104 <Field long chainConnectionResolved>
		barrierConnectionResolved = 0L;
	//   84  140:aload_0         
	//   85  141:lconst_0        
	//   86  142:putfield        #106 <Field long barrierConnectionResolved>
		problematicLayouts.clear();
	//   87  145:aload_0         
	//   88  146:getfield        #46  <Field ArrayList problematicLayouts>
	//   89  149:invokevirtual   #109 <Method void ArrayList.clear()>
	//   90  152:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #113 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("\n*** Metrics ***\nmeasures: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #116 <String "\n*** Metrics ***\nmeasures: ">
	//    6   11:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(measures);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #50  <Field long measures>
	//   11   20:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   12   23:pop             
		stringbuilder.append("\nadditionalMeasures: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #125 <String "\nadditionalMeasures: ">
	//   15   27:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(additionalMeasures);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #52  <Field long additionalMeasures>
	//   20   36:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   21   39:pop             
		stringbuilder.append("\nresolutions passes: ");
	//   22   40:aload_1         
	//   23   41:ldc1            #127 <String "\nresolutions passes: ">
	//   24   43:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(resolutions);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #54  <Field long resolutions>
	//   29   52:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   30   55:pop             
		stringbuilder.append("\ntable increases: ");
	//   31   56:aload_1         
	//   32   57:ldc1            #129 <String "\ntable increases: ">
	//   33   59:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(tableSizeIncrease);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #56  <Field long tableSizeIncrease>
	//   38   68:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   39   71:pop             
		stringbuilder.append("\nmaxTableSize: ");
	//   40   72:aload_1         
	//   41   73:ldc1            #131 <String "\nmaxTableSize: ">
	//   42   75:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(maxTableSize);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #58  <Field long maxTableSize>
	//   47   84:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   48   87:pop             
		stringbuilder.append("\nmaxVariables: ");
	//   49   88:aload_1         
	//   50   89:ldc1            #133 <String "\nmaxVariables: ">
	//   51   91:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(maxVariables);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #62  <Field long maxVariables>
	//   56  100:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   57  103:pop             
		stringbuilder.append("\nmaxRows: ");
	//   58  104:aload_1         
	//   59  105:ldc1            #135 <String "\nmaxRows: ">
	//   60  107:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(maxRows);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #64  <Field long maxRows>
	//   65  116:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   66  119:pop             
		stringbuilder.append("\n\nminimize: ");
	//   67  120:aload_1         
	//   68  121:ldc1            #137 <String "\n\nminimize: ">
	//   69  123:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(minimize);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #66  <Field long minimize>
	//   74  132:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   75  135:pop             
		stringbuilder.append("\nminimizeGoal: ");
	//   76  136:aload_1         
	//   77  137:ldc1            #139 <String "\nminimizeGoal: ">
	//   78  139:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(minimizeGoal);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #68  <Field long minimizeGoal>
	//   83  148:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   84  151:pop             
		stringbuilder.append("\nconstraints: ");
	//   85  152:aload_1         
	//   86  153:ldc1            #141 <String "\nconstraints: ">
	//   87  155:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   88  158:pop             
		stringbuilder.append(constraints);
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #70  <Field long constraints>
	//   92  164:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//   93  167:pop             
		stringbuilder.append("\nsimpleconstraints: ");
	//   94  168:aload_1         
	//   95  169:ldc1            #143 <String "\nsimpleconstraints: ">
	//   96  171:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   97  174:pop             
		stringbuilder.append(simpleconstraints);
	//   98  175:aload_1         
	//   99  176:aload_0         
	//  100  177:getfield        #72  <Field long simpleconstraints>
	//  101  180:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  102  183:pop             
		stringbuilder.append("\noptimize: ");
	//  103  184:aload_1         
	//  104  185:ldc1            #145 <String "\noptimize: ">
	//  105  187:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  106  190:pop             
		stringbuilder.append(optimize);
	//  107  191:aload_1         
	//  108  192:aload_0         
	//  109  193:getfield        #74  <Field long optimize>
	//  110  196:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  111  199:pop             
		stringbuilder.append("\niterations: ");
	//  112  200:aload_1         
	//  113  201:ldc1            #147 <String "\niterations: ">
	//  114  203:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  115  206:pop             
		stringbuilder.append(iterations);
	//  116  207:aload_1         
	//  117  208:aload_0         
	//  118  209:getfield        #76  <Field long iterations>
	//  119  212:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  120  215:pop             
		stringbuilder.append("\npivots: ");
	//  121  216:aload_1         
	//  122  217:ldc1            #149 <String "\npivots: ">
	//  123  219:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  124  222:pop             
		stringbuilder.append(pivots);
	//  125  223:aload_1         
	//  126  224:aload_0         
	//  127  225:getfield        #78  <Field long pivots>
	//  128  228:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  129  231:pop             
		stringbuilder.append("\nbfs: ");
	//  130  232:aload_1         
	//  131  233:ldc1            #151 <String "\nbfs: ">
	//  132  235:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  133  238:pop             
		stringbuilder.append(bfs);
	//  134  239:aload_1         
	//  135  240:aload_0         
	//  136  241:getfield        #80  <Field long bfs>
	//  137  244:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  138  247:pop             
		stringbuilder.append("\nvariables: ");
	//  139  248:aload_1         
	//  140  249:ldc1            #153 <String "\nvariables: ">
	//  141  251:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  142  254:pop             
		stringbuilder.append(variables);
	//  143  255:aload_1         
	//  144  256:aload_0         
	//  145  257:getfield        #82  <Field long variables>
	//  146  260:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  147  263:pop             
		stringbuilder.append("\nerrors: ");
	//  148  264:aload_1         
	//  149  265:ldc1            #155 <String "\nerrors: ">
	//  150  267:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  151  270:pop             
		stringbuilder.append(errors);
	//  152  271:aload_1         
	//  153  272:aload_0         
	//  154  273:getfield        #84  <Field long errors>
	//  155  276:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  156  279:pop             
		stringbuilder.append("\nslackvariables: ");
	//  157  280:aload_1         
	//  158  281:ldc1            #157 <String "\nslackvariables: ">
	//  159  283:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  160  286:pop             
		stringbuilder.append(slackvariables);
	//  161  287:aload_1         
	//  162  288:aload_0         
	//  163  289:getfield        #86  <Field long slackvariables>
	//  164  292:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  165  295:pop             
		stringbuilder.append("\nextravariables: ");
	//  166  296:aload_1         
	//  167  297:ldc1            #159 <String "\nextravariables: ">
	//  168  299:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  169  302:pop             
		stringbuilder.append(extravariables);
	//  170  303:aload_1         
	//  171  304:aload_0         
	//  172  305:getfield        #88  <Field long extravariables>
	//  173  308:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  174  311:pop             
		stringbuilder.append("\nfullySolved: ");
	//  175  312:aload_1         
	//  176  313:ldc1            #161 <String "\nfullySolved: ">
	//  177  315:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  178  318:pop             
		stringbuilder.append(fullySolved);
	//  179  319:aload_1         
	//  180  320:aload_0         
	//  181  321:getfield        #90  <Field long fullySolved>
	//  182  324:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  183  327:pop             
		stringbuilder.append("\ngraphOptimizer: ");
	//  184  328:aload_1         
	//  185  329:ldc1            #163 <String "\ngraphOptimizer: ">
	//  186  331:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  187  334:pop             
		stringbuilder.append(graphOptimizer);
	//  188  335:aload_1         
	//  189  336:aload_0         
	//  190  337:getfield        #92  <Field long graphOptimizer>
	//  191  340:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  192  343:pop             
		stringbuilder.append("\nresolvedWidgets: ");
	//  193  344:aload_1         
	//  194  345:ldc1            #165 <String "\nresolvedWidgets: ">
	//  195  347:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  196  350:pop             
		stringbuilder.append(resolvedWidgets);
	//  197  351:aload_1         
	//  198  352:aload_0         
	//  199  353:getfield        #94  <Field long resolvedWidgets>
	//  200  356:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  201  359:pop             
		stringbuilder.append("\noldresolvedWidgets: ");
	//  202  360:aload_1         
	//  203  361:ldc1            #167 <String "\noldresolvedWidgets: ">
	//  204  363:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  205  366:pop             
		stringbuilder.append(oldresolvedWidgets);
	//  206  367:aload_1         
	//  207  368:aload_0         
	//  208  369:getfield        #96  <Field long oldresolvedWidgets>
	//  209  372:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  210  375:pop             
		stringbuilder.append("\nnonresolvedWidgets: ");
	//  211  376:aload_1         
	//  212  377:ldc1            #169 <String "\nnonresolvedWidgets: ">
	//  213  379:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  214  382:pop             
		stringbuilder.append(nonresolvedWidgets);
	//  215  383:aload_1         
	//  216  384:aload_0         
	//  217  385:getfield        #98  <Field long nonresolvedWidgets>
	//  218  388:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  219  391:pop             
		stringbuilder.append("\ncenterConnectionResolved: ");
	//  220  392:aload_1         
	//  221  393:ldc1            #171 <String "\ncenterConnectionResolved: ">
	//  222  395:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  223  398:pop             
		stringbuilder.append(centerConnectionResolved);
	//  224  399:aload_1         
	//  225  400:aload_0         
	//  226  401:getfield        #100 <Field long centerConnectionResolved>
	//  227  404:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  228  407:pop             
		stringbuilder.append("\nmatchConnectionResolved: ");
	//  229  408:aload_1         
	//  230  409:ldc1            #173 <String "\nmatchConnectionResolved: ">
	//  231  411:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  232  414:pop             
		stringbuilder.append(matchConnectionResolved);
	//  233  415:aload_1         
	//  234  416:aload_0         
	//  235  417:getfield        #102 <Field long matchConnectionResolved>
	//  236  420:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  237  423:pop             
		stringbuilder.append("\nchainConnectionResolved: ");
	//  238  424:aload_1         
	//  239  425:ldc1            #175 <String "\nchainConnectionResolved: ">
	//  240  427:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  241  430:pop             
		stringbuilder.append(chainConnectionResolved);
	//  242  431:aload_1         
	//  243  432:aload_0         
	//  244  433:getfield        #104 <Field long chainConnectionResolved>
	//  245  436:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  246  439:pop             
		stringbuilder.append("\nbarrierConnectionResolved: ");
	//  247  440:aload_1         
	//  248  441:ldc1            #177 <String "\nbarrierConnectionResolved: ">
	//  249  443:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  250  446:pop             
		stringbuilder.append(barrierConnectionResolved);
	//  251  447:aload_1         
	//  252  448:aload_0         
	//  253  449:getfield        #106 <Field long barrierConnectionResolved>
	//  254  452:invokevirtual   #123 <Method StringBuilder StringBuilder.append(long)>
	//  255  455:pop             
		stringbuilder.append("\nproblematicsLayouts: ");
	//  256  456:aload_1         
	//  257  457:ldc1            #179 <String "\nproblematicsLayouts: ">
	//  258  459:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  259  462:pop             
		stringbuilder.append(((Object) (problematicLayouts)));
	//  260  463:aload_1         
	//  261  464:aload_0         
	//  262  465:getfield        #46  <Field ArrayList problematicLayouts>
	//  263  468:invokevirtual   #182 <Method StringBuilder StringBuilder.append(Object)>
	//  264  471:pop             
		stringbuilder.append("\n");
	//  265  472:aload_1         
	//  266  473:ldc1            #184 <String "\n">
	//  267  475:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  268  478:pop             
		return stringbuilder.toString();
	//  269  479:aload_1         
	//  270  480:invokevirtual   #186 <Method String StringBuilder.toString()>
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
