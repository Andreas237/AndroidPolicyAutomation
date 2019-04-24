// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import com.itextpdf.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			Shape

public class BezierCurve
	implements Shape
{

	public BezierCurve(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		controlPoints = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//    2    4:aload_0         
	//    3    5:new             #34  <Class ArrayList>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #37  <Method void ArrayList(java.util.Collection)>
	//    7   13:putfield        #39  <Field List controlPoints>
	//    8   16:return          
	}

	private void recursiveApproximation(double d, double d1, double d2, double d3, double d4, double d5, double d6, 
			double d7, List list)
	{
		double d8 = (d + d2) / 2D;
	//    0    0:dload_1         
	//    1    1:dload           5
	//    2    3:dadd            
	//    3    4:ldc2w           #44  <Double 2D>
	//    4    7:ddiv            
	//    5    8:dstore          18
		double d9 = (d1 + d3) / 2D;
	//    6   10:dload_3         
	//    7   11:dload           7
	//    8   13:dadd            
	//    9   14:ldc2w           #44  <Double 2D>
	//   10   17:ddiv            
	//   11   18:dstore          20
		double d14 = (d2 + d4) / 2D;
	//   12   20:dload           5
	//   13   22:dload           9
	//   14   24:dadd            
	//   15   25:ldc2w           #44  <Double 2D>
	//   16   28:ddiv            
	//   17   29:dstore          30
		double d15 = (d3 + d5) / 2D;
	//   18   31:dload           7
	//   19   33:dload           11
	//   20   35:dadd            
	//   21   36:ldc2w           #44  <Double 2D>
	//   22   39:ddiv            
	//   23   40:dstore          32
		double d10 = (d4 + d6) / 2D;
	//   24   42:dload           9
	//   25   44:dload           13
	//   26   46:dadd            
	//   27   47:ldc2w           #44  <Double 2D>
	//   28   50:ddiv            
	//   29   51:dstore          22
		double d11 = (d5 + d7) / 2D;
	//   30   53:dload           11
	//   31   55:dload           15
	//   32   57:dadd            
	//   33   58:ldc2w           #44  <Double 2D>
	//   34   61:ddiv            
	//   35   62:dstore          24
		double d12 = (d8 + d14) / 2D;
	//   36   64:dload           18
	//   37   66:dload           30
	//   38   68:dadd            
	//   39   69:ldc2w           #44  <Double 2D>
	//   40   72:ddiv            
	//   41   73:dstore          26
		double d13 = (d9 + d15) / 2D;
	//   42   75:dload           20
	//   43   77:dload           32
	//   44   79:dadd            
	//   45   80:ldc2w           #44  <Double 2D>
	//   46   83:ddiv            
	//   47   84:dstore          28
		d14 = (d14 + d10) / 2D;
	//   48   86:dload           30
	//   49   88:dload           22
	//   50   90:dadd            
	//   51   91:ldc2w           #44  <Double 2D>
	//   52   94:ddiv            
	//   53   95:dstore          30
		d15 = (d15 + d11) / 2D;
	//   54   97:dload           32
	//   55   99:dload           24
	//   56  101:dadd            
	//   57  102:ldc2w           #44  <Double 2D>
	//   58  105:ddiv            
	//   59  106:dstore          32
		double d16 = (d12 + d14) / 2D;
	//   60  108:dload           26
	//   61  110:dload           30
	//   62  112:dadd            
	//   63  113:ldc2w           #44  <Double 2D>
	//   64  116:ddiv            
	//   65  117:dstore          34
		double d17 = (d13 + d15) / 2D;
	//   66  119:dload           28
	//   67  121:dload           32
	//   68  123:dadd            
	//   69  124:ldc2w           #44  <Double 2D>
	//   70  127:ddiv            
	//   71  128:dstore          36
		double d18 = d6 - d;
	//   72  130:dload           13
	//   73  132:dload_1         
	//   74  133:dsub            
	//   75  134:dstore          38
		double d19 = d7 - d1;
	//   76  136:dload           15
	//   77  138:dload_3         
	//   78  139:dsub            
	//   79  140:dstore          40
		double d20 = Math.abs((d2 - d6) * d19 - (d3 - d7) * d18);
	//   80  142:dload           5
	//   81  144:dload           13
	//   82  146:dsub            
	//   83  147:dload           40
	//   84  149:dmul            
	//   85  150:dload           7
	//   86  152:dload           15
	//   87  154:dsub            
	//   88  155:dload           38
	//   89  157:dmul            
	//   90  158:dsub            
	//   91  159:invokestatic    #51  <Method double Math.abs(double)>
	//   92  162:dstore          42
		double d21 = Math.abs((d4 - d6) * d19 - (d5 - d7) * d18);
	//   93  164:dload           9
	//   94  166:dload           13
	//   95  168:dsub            
	//   96  169:dload           40
	//   97  171:dmul            
	//   98  172:dload           11
	//   99  174:dload           15
	//  100  176:dsub            
	//  101  177:dload           38
	//  102  179:dmul            
	//  103  180:dsub            
	//  104  181:invokestatic    #51  <Method double Math.abs(double)>
	//  105  184:dstore          44
		if(d20 > curveCollinearityEpsilon || d21 > curveCollinearityEpsilon)
	//* 106  186:dload           42
	//* 107  188:getstatic       #19  <Field double curveCollinearityEpsilon>
	//* 108  191:dcmpl           
	//* 109  192:ifgt            204
	//* 110  195:dload           44
	//* 111  197:getstatic       #19  <Field double curveCollinearityEpsilon>
	//* 112  200:dcmpl           
	//* 113  201:ifle            254
		{
			if((d20 + d21) * (d20 + d21) <= distanceToleranceSquare * (d18 * d18 + d19 * d19))
	//* 114  204:dload           42
	//* 115  206:dload           44
	//* 116  208:dadd            
	//* 117  209:dload           42
	//* 118  211:dload           44
	//* 119  213:dadd            
	//* 120  214:dmul            
	//* 121  215:getstatic       #23  <Field double distanceToleranceSquare>
	//* 122  218:dload           38
	//* 123  220:dload           38
	//* 124  222:dmul            
	//* 125  223:dload           40
	//* 126  225:dload           40
	//* 127  227:dmul            
	//* 128  228:dadd            
	//* 129  229:dmul            
	//* 130  230:dcmpg           
	//* 131  231:ifgt            338
			{
				list.add(((Object) (new com.itextpdf.awt.geom.Point2D.Double(d16, d17))));
	//  132  234:aload           17
	//  133  236:new             #53  <Class com.itextpdf.awt.geom.Point2D$Double>
	//  134  239:dup             
	//  135  240:dload           34
	//  136  242:dload           36
	//  137  244:invokespecial   #56  <Method void com.itextpdf.awt.geom.Point2D$Double(double, double)>
	//  138  247:invokeinterface #62  <Method boolean List.add(Object)>
	//  139  252:pop             
				return;
	//  140  253:return          
			}
		} else
		if(Math.abs((d + d4) - d2 - d2) + Math.abs((d1 + d5) - d3 - d3) + Math.abs((d2 + d6) - d4 - d4) + Math.abs((d3 + d7) - d5 - d5) <= distanceToleranceManhattan)
	//* 141  254:dload_1         
	//* 142  255:dload           9
	//* 143  257:dadd            
	//* 144  258:dload           5
	//* 145  260:dsub            
	//* 146  261:dload           5
	//* 147  263:dsub            
	//* 148  264:invokestatic    #51  <Method double Math.abs(double)>
	//* 149  267:dload_3         
	//* 150  268:dload           11
	//* 151  270:dadd            
	//* 152  271:dload           7
	//* 153  273:dsub            
	//* 154  274:dload           7
	//* 155  276:dsub            
	//* 156  277:invokestatic    #51  <Method double Math.abs(double)>
	//* 157  280:dadd            
	//* 158  281:dload           5
	//* 159  283:dload           13
	//* 160  285:dadd            
	//* 161  286:dload           9
	//* 162  288:dsub            
	//* 163  289:dload           9
	//* 164  291:dsub            
	//* 165  292:invokestatic    #51  <Method double Math.abs(double)>
	//* 166  295:dadd            
	//* 167  296:dload           7
	//* 168  298:dload           15
	//* 169  300:dadd            
	//* 170  301:dload           11
	//* 171  303:dsub            
	//* 172  304:dload           11
	//* 173  306:dsub            
	//* 174  307:invokestatic    #51  <Method double Math.abs(double)>
	//* 175  310:dadd            
	//* 176  311:getstatic       #27  <Field double distanceToleranceManhattan>
	//* 177  314:dcmpg           
	//* 178  315:ifgt            338
		{
			list.add(((Object) (new com.itextpdf.awt.geom.Point2D.Double(d16, d17))));
	//  179  318:aload           17
	//  180  320:new             #53  <Class com.itextpdf.awt.geom.Point2D$Double>
	//  181  323:dup             
	//  182  324:dload           34
	//  183  326:dload           36
	//  184  328:invokespecial   #56  <Method void com.itextpdf.awt.geom.Point2D$Double(double, double)>
	//  185  331:invokeinterface #62  <Method boolean List.add(Object)>
	//  186  336:pop             
			return;
	//  187  337:return          
		}
		recursiveApproximation(d, d1, d8, d9, d12, d13, d16, d17, list);
	//  188  338:aload_0         
	//  189  339:dload_1         
	//  190  340:dload_3         
	//  191  341:dload           18
	//  192  343:dload           20
	//  193  345:dload           26
	//  194  347:dload           28
	//  195  349:dload           34
	//  196  351:dload           36
	//  197  353:aload           17
	//  198  355:invokespecial   #64  <Method void recursiveApproximation(double, double, double, double, double, double, double, double, List)>
		recursiveApproximation(d16, d17, d14, d15, d10, d11, d6, d7, list);
	//  199  358:aload_0         
	//  200  359:dload           34
	//  201  361:dload           36
	//  202  363:dload           30
	//  203  365:dload           32
	//  204  367:dload           22
	//  205  369:dload           24
	//  206  371:dload           13
	//  207  373:dload           15
	//  208  375:aload           17
	//  209  377:invokespecial   #64  <Method void recursiveApproximation(double, double, double, double, double, double, double, double, List)>
	//  210  380:return          
	}

	public List getBasePoints()
	{
		return controlPoints;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field List controlPoints>
	//    2    4:areturn         
	}

	public List getPiecewiseLinearApproximation()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #34  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (arraylist)).add(controlPoints.get(0));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field List controlPoints>
	//    7   13:iconst_0        
	//    8   14:invokeinterface #74  <Method Object List.get(int)>
	//    9   19:invokeinterface #62  <Method boolean List.add(Object)>
	//   10   24:pop             
		recursiveApproximation(((Point2D)controlPoints.get(0)).getX(), ((Point2D)controlPoints.get(0)).getY(), ((Point2D)controlPoints.get(1)).getX(), ((Point2D)controlPoints.get(1)).getY(), ((Point2D)controlPoints.get(2)).getX(), ((Point2D)controlPoints.get(2)).getY(), ((Point2D)controlPoints.get(3)).getX(), ((Point2D)controlPoints.get(3)).getY(), ((List) (arraylist)));
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #39  <Field List controlPoints>
	//   14   30:iconst_0        
	//   15   31:invokeinterface #74  <Method Object List.get(int)>
	//   16   36:checkcast       #76  <Class Point2D>
	//   17   39:invokevirtual   #80  <Method double Point2D.getX()>
	//   18   42:aload_0         
	//   19   43:getfield        #39  <Field List controlPoints>
	//   20   46:iconst_0        
	//   21   47:invokeinterface #74  <Method Object List.get(int)>
	//   22   52:checkcast       #76  <Class Point2D>
	//   23   55:invokevirtual   #83  <Method double Point2D.getY()>
	//   24   58:aload_0         
	//   25   59:getfield        #39  <Field List controlPoints>
	//   26   62:iconst_1        
	//   27   63:invokeinterface #74  <Method Object List.get(int)>
	//   28   68:checkcast       #76  <Class Point2D>
	//   29   71:invokevirtual   #80  <Method double Point2D.getX()>
	//   30   74:aload_0         
	//   31   75:getfield        #39  <Field List controlPoints>
	//   32   78:iconst_1        
	//   33   79:invokeinterface #74  <Method Object List.get(int)>
	//   34   84:checkcast       #76  <Class Point2D>
	//   35   87:invokevirtual   #83  <Method double Point2D.getY()>
	//   36   90:aload_0         
	//   37   91:getfield        #39  <Field List controlPoints>
	//   38   94:iconst_2        
	//   39   95:invokeinterface #74  <Method Object List.get(int)>
	//   40  100:checkcast       #76  <Class Point2D>
	//   41  103:invokevirtual   #80  <Method double Point2D.getX()>
	//   42  106:aload_0         
	//   43  107:getfield        #39  <Field List controlPoints>
	//   44  110:iconst_2        
	//   45  111:invokeinterface #74  <Method Object List.get(int)>
	//   46  116:checkcast       #76  <Class Point2D>
	//   47  119:invokevirtual   #83  <Method double Point2D.getY()>
	//   48  122:aload_0         
	//   49  123:getfield        #39  <Field List controlPoints>
	//   50  126:iconst_3        
	//   51  127:invokeinterface #74  <Method Object List.get(int)>
	//   52  132:checkcast       #76  <Class Point2D>
	//   53  135:invokevirtual   #80  <Method double Point2D.getX()>
	//   54  138:aload_0         
	//   55  139:getfield        #39  <Field List controlPoints>
	//   56  142:iconst_3        
	//   57  143:invokeinterface #74  <Method Object List.get(int)>
	//   58  148:checkcast       #76  <Class Point2D>
	//   59  151:invokevirtual   #83  <Method double Point2D.getY()>
	//   60  154:aload_1         
	//   61  155:invokespecial   #64  <Method void recursiveApproximation(double, double, double, double, double, double, double, double, List)>
		((List) (arraylist)).add(controlPoints.get(controlPoints.size() - 1));
	//   62  158:aload_1         
	//   63  159:aload_0         
	//   64  160:getfield        #39  <Field List controlPoints>
	//   65  163:aload_0         
	//   66  164:getfield        #39  <Field List controlPoints>
	//   67  167:invokeinterface #87  <Method int List.size()>
	//   68  172:iconst_1        
	//   69  173:isub            
	//   70  174:invokeinterface #74  <Method Object List.get(int)>
	//   71  179:invokeinterface #62  <Method boolean List.add(Object)>
	//   72  184:pop             
		return ((List) (arraylist));
	//   73  185:aload_1         
	//   74  186:areturn         
	}

	public static double curveCollinearityEpsilon = 1.0000000000000001E-30D;
	public static double distanceToleranceManhattan = 0.40000000000000002D;
	public static double distanceToleranceSquare = 0.025000000000000001D;
	private final List controlPoints;

	static 
	{
	//    0    0:ldc2w           #16  <Double 1.0000000000000001E-30D>
	//    1    3:putstatic       #19  <Field double curveCollinearityEpsilon>
	//    2    6:ldc2w           #20  <Double 0.025000000000000001D>
	//    3    9:putstatic       #23  <Field double distanceToleranceSquare>
	//    4   12:ldc2w           #24  <Double 0.40000000000000002D>
	//    5   15:putstatic       #27  <Field double distanceToleranceManhattan>
	//*   6   18:return          
	}
}
