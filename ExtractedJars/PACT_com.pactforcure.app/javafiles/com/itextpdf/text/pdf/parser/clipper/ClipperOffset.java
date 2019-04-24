// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			PolyNode, Path, Paths, Point, 
//			DefaultClipper, LongRect, PolyTree

public class ClipperOffset
{

	public ClipperOffset()
	{
		this(2D, 0.25D);
	//    0    0:aload_0         
	//    1    1:ldc2w           #39  <Double 2D>
	//    2    4:ldc2w           #9   <Double 0.25D>
	//    3    7:invokespecial   #43  <Method void ClipperOffset(double, double)>
	//    4   10:return          
	}

	public ClipperOffset(double d)
	{
		this(d, 0.25D);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:ldc2w           #9   <Double 0.25D>
	//    3    5:invokespecial   #43  <Method void ClipperOffset(double, double)>
	//    4    8:return          
	}

	public ClipperOffset(double d, double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		miterLimit = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #49  <Field double miterLimit>
		arcTolerance = d1;
	//    5    9:aload_0         
	//    6   10:dload_3         
	//    7   11:putfield        #51  <Field double arcTolerance>
		lowest = new Point.LongPoint();
	//    8   14:aload_0         
	//    9   15:new             #53  <Class Point$LongPoint>
	//   10   18:dup             
	//   11   19:invokespecial   #54  <Method void Point$LongPoint()>
	//   12   22:putfield        #56  <Field Point$LongPoint lowest>
		lowest.setX(((Number) (Long.valueOf(-1L))));
	//   13   25:aload_0         
	//   14   26:getfield        #56  <Field Point$LongPoint lowest>
	//   15   29:ldc2w           #57  <Long -1L>
	//   16   32:invokestatic    #64  <Method Long Long.valueOf(long)>
	//   17   35:invokevirtual   #68  <Method void Point$LongPoint.setX(Number)>
		polyNodes = new PolyNode();
	//   18   38:aload_0         
	//   19   39:new             #70  <Class PolyNode>
	//   20   42:dup             
	//   21   43:invokespecial   #71  <Method void PolyNode()>
	//   22   46:putfield        #73  <Field PolyNode polyNodes>
		normals = ((List) (new ArrayList()));
	//   23   49:aload_0         
	//   24   50:new             #75  <Class ArrayList>
	//   25   53:dup             
	//   26   54:invokespecial   #76  <Method void ArrayList()>
	//   27   57:putfield        #78  <Field List normals>
	//   28   60:return          
	}

	private void doMiter(int i, int j, double d)
	{
		d = delta / d;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field double delta>
	//    2    4:dload_3         
	//    3    5:ddiv            
	//    4    6:dstore_3        
		destPoly.add(((Object) (new Point.LongPoint(Math.round((double)((Point.LongPoint)srcPoly.get(i)).getX() + (((Point.DoublePoint)normals.get(j)).getX() + ((Point.DoublePoint)normals.get(i)).getX()) * d), Math.round((double)((Point.LongPoint)srcPoly.get(i)).getY() + (((Point.DoublePoint)normals.get(j)).getY() + ((Point.DoublePoint)normals.get(i)).getY()) * d)))));
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field Path destPoly>
	//    7   11:new             #53  <Class Point$LongPoint>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #86  <Field Path srcPoly>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #92  <Method Object Path.get(int)>
	//   13   23:checkcast       #53  <Class Point$LongPoint>
	//   14   26:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//   15   29:l2d             
	//   16   30:aload_0         
	//   17   31:getfield        #78  <Field List normals>
	//   18   34:iload_2         
	//   19   35:invokeinterface #99  <Method Object List.get(int)>
	//   20   40:checkcast       #101 <Class Point$DoublePoint>
	//   21   43:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//   22   46:aload_0         
	//   23   47:getfield        #78  <Field List normals>
	//   24   50:iload_1         
	//   25   51:invokeinterface #99  <Method Object List.get(int)>
	//   26   56:checkcast       #101 <Class Point$DoublePoint>
	//   27   59:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//   28   62:dadd            
	//   29   63:dload_3         
	//   30   64:dmul            
	//   31   65:dadd            
	//   32   66:invokestatic    #110 <Method long Math.round(double)>
	//   33   69:aload_0         
	//   34   70:getfield        #86  <Field Path srcPoly>
	//   35   73:iload_1         
	//   36   74:invokevirtual   #92  <Method Object Path.get(int)>
	//   37   77:checkcast       #53  <Class Point$LongPoint>
	//   38   80:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//   39   83:l2d             
	//   40   84:aload_0         
	//   41   85:getfield        #78  <Field List normals>
	//   42   88:iload_2         
	//   43   89:invokeinterface #99  <Method Object List.get(int)>
	//   44   94:checkcast       #101 <Class Point$DoublePoint>
	//   45   97:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//   46  100:aload_0         
	//   47  101:getfield        #78  <Field List normals>
	//   48  104:iload_1         
	//   49  105:invokeinterface #99  <Method Object List.get(int)>
	//   50  110:checkcast       #101 <Class Point$DoublePoint>
	//   51  113:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//   52  116:dadd            
	//   53  117:dload_3         
	//   54  118:dmul            
	//   55  119:dadd            
	//   56  120:invokestatic    #110 <Method long Math.round(double)>
	//   57  123:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//   58  126:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   59  129:pop             
	//   60  130:return          
	}

	private void doOffset(double d)
	{
		destPolys = new Paths();
	//    0    0:aload_0         
	//    1    1:new             #125 <Class Paths>
	//    2    4:dup             
	//    3    5:invokespecial   #126 <Method void Paths()>
	//    4    8:putfield        #128 <Field Paths destPolys>
		delta = d;
	//    5   11:aload_0         
	//    6   12:dload_1         
	//    7   13:putfield        #82  <Field double delta>
		if(nearZero(d))
	//*   8   16:dload_1         
	//*   9   17:invokestatic    #132 <Method boolean nearZero(double)>
	//*  10   20:ifeq            90
		{
			for(int i = 0; i < polyNodes.getChildCount(); i++)
	//*  11   23:iconst_0        
	//*  12   24:istore          11
	//*  13   26:iload           11
	//*  14   28:aload_0         
	//*  15   29:getfield        #73  <Field PolyNode polyNodes>
	//*  16   32:invokevirtual   #136 <Method int PolyNode.getChildCount()>
	//*  17   35:icmpge          1916
			{
				PolyNode polynode = (PolyNode)polyNodes.getChilds().get(i);
	//   18   38:aload_0         
	//   19   39:getfield        #73  <Field PolyNode polyNodes>
	//   20   42:invokevirtual   #140 <Method List PolyNode.getChilds()>
	//   21   45:iload           11
	//   22   47:invokeinterface #99  <Method Object List.get(int)>
	//   23   52:checkcast       #70  <Class PolyNode>
	//   24   55:astore          16
				if(polynode.getEndType() == Clipper.EndType.CLOSED_POLYGON)
	//*  25   57:aload           16
	//*  26   59:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//*  27   62:getstatic       #150 <Field Clipper$EndType Clipper$EndType.CLOSED_POLYGON>
	//*  28   65:if_acmpne       81
					destPolys.add(((Object) (polynode.getPolygon())));
	//   29   68:aload_0         
	//   30   69:getfield        #128 <Field Paths destPolys>
	//   31   72:aload           16
	//   32   74:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//   33   77:invokevirtual   #155 <Method boolean Paths.add(Object)>
	//   34   80:pop             
			}

	//   35   81:iload           11
	//   36   83:iconst_1        
	//   37   84:iadd            
	//   38   85:istore          11
		} else
	//*  39   87:goto            26
		{
			double d1;
			double d9;
			int j;
			if(miterLimit > 2D)
	//*  40   90:aload_0         
	//*  41   91:getfield        #49  <Field double miterLimit>
	//*  42   94:ldc2w           #39  <Double 2D>
	//*  43   97:dcmpl           
	//*  44   98:ifle            288
				miterLim = 2D / (miterLimit * miterLimit);
	//   45  101:aload_0         
	//   46  102:ldc2w           #39  <Double 2D>
	//   47  105:aload_0         
	//   48  106:getfield        #49  <Field double miterLimit>
	//   49  109:aload_0         
	//   50  110:getfield        #49  <Field double miterLimit>
	//   51  113:dmul            
	//   52  114:ddiv            
	//   53  115:putfield        #157 <Field double miterLim>
			else
	//*  54  118:aload_0         
	//*  55  119:getfield        #51  <Field double arcTolerance>
	//*  56  122:dconst_0        
	//*  57  123:dcmpg           
	//*  58  124:ifgt            298
	//*  59  127:ldc2w           #9   <Double 0.25D>
	//*  60  130:dstore_3        
	//*  61  131:ldc2w           #158 <Double 3.1415926535897931D>
	//*  62  134:dconst_1        
	//*  63  135:dload_3         
	//*  64  136:dload_1         
	//*  65  137:invokestatic    #163 <Method double Math.abs(double)>
	//*  66  140:ddiv            
	//*  67  141:dsub            
	//*  68  142:invokestatic    #166 <Method double Math.acos(double)>
	//*  69  145:ddiv            
	//*  70  146:dstore          9
	//*  71  148:aload_0         
	//*  72  149:ldc2w           #15  <Double 6.2831853071795862D>
	//*  73  152:dload           9
	//*  74  154:ddiv            
	//*  75  155:invokestatic    #168 <Method double Math.sin(double)>
	//*  76  158:putfield        #170 <Field double sin>
	//*  77  161:aload_0         
	//*  78  162:ldc2w           #15  <Double 6.2831853071795862D>
	//*  79  165:dload           9
	//*  80  167:ddiv            
	//*  81  168:invokestatic    #172 <Method double Math.cos(double)>
	//*  82  171:putfield        #174 <Field double cos>
	//*  83  174:aload_0         
	//*  84  175:dload           9
	//*  85  177:ldc2w           #15  <Double 6.2831853071795862D>
	//*  86  180:ddiv            
	//*  87  181:putfield        #176 <Field double stepsPerRad>
	//*  88  184:dload_1         
	//*  89  185:dconst_0        
	//*  90  186:dcmpg           
	//*  91  187:ifge            199
	//*  92  190:aload_0         
	//*  93  191:aload_0         
	//*  94  192:getfield        #170 <Field double sin>
	//*  95  195:dneg            
	//*  96  196:putfield        #170 <Field double sin>
	//*  97  199:iconst_0        
	//*  98  200:istore          11
	//*  99  202:iload           11
	//* 100  204:aload_0         
	//* 101  205:getfield        #73  <Field PolyNode polyNodes>
	//* 102  208:invokevirtual   #136 <Method int PolyNode.getChildCount()>
	//* 103  211:icmpge          1916
	//* 104  214:aload_0         
	//* 105  215:getfield        #73  <Field PolyNode polyNodes>
	//* 106  218:invokevirtual   #140 <Method List PolyNode.getChilds()>
	//* 107  221:iload           11
	//* 108  223:invokeinterface #99  <Method Object List.get(int)>
	//* 109  228:checkcast       #70  <Class PolyNode>
	//* 110  231:astore          16
	//* 111  233:aload_0         
	//* 112  234:aload           16
	//* 113  236:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//* 114  239:putfield        #86  <Field Path srcPoly>
	//* 115  242:aload_0         
	//* 116  243:getfield        #86  <Field Path srcPoly>
	//* 117  246:invokevirtual   #179 <Method int Path.size()>
	//* 118  249:istore          13
	//* 119  251:iload           13
	//* 120  253:ifeq            279
	//* 121  256:dload_1         
	//* 122  257:dconst_0        
	//* 123  258:dcmpg           
	//* 124  259:ifgt            334
	//* 125  262:iload           13
	//* 126  264:iconst_3        
	//* 127  265:icmplt          279
	//* 128  268:aload           16
	//* 129  270:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//* 130  273:getstatic       #150 <Field Clipper$EndType Clipper$EndType.CLOSED_POLYGON>
	//* 131  276:if_acmpeq       334
	//* 132  279:iload           11
	//* 133  281:iconst_1        
	//* 134  282:iadd            
	//* 135  283:istore          11
	//* 136  285:goto            202
				miterLim = 0.5D;
	//  137  288:aload_0         
	//  138  289:ldc2w           #180 <Double 0.5D>
	//  139  292:putfield        #157 <Field double miterLim>
			if(arcTolerance <= 0.0D)
				d1 = 0.25D;
			else
	//* 140  295:goto            118
			if(arcTolerance > Math.abs(d) * 0.25D)
	//* 141  298:aload_0         
	//* 142  299:getfield        #51  <Field double arcTolerance>
	//* 143  302:dload_1         
	//* 144  303:invokestatic    #163 <Method double Math.abs(double)>
	//* 145  306:ldc2w           #9   <Double 0.25D>
	//* 146  309:dmul            
	//* 147  310:dcmpl           
	//* 148  311:ifle            326
				d1 = Math.abs(d) * 0.25D;
	//  149  314:dload_1         
	//  150  315:invokestatic    #163 <Method double Math.abs(double)>
	//  151  318:ldc2w           #9   <Double 0.25D>
	//  152  321:dmul            
	//  153  322:dstore_3        
			else
	//* 154  323:goto            131
				d1 = arcTolerance;
	//  155  326:aload_0         
	//  156  327:getfield        #51  <Field double arcTolerance>
	//  157  330:dstore_3        
			d9 = 3.1415926535897931D / Math.acos(1.0D - d1 / Math.abs(d));
			sin = Math.sin(6.2831853071795862D / d9);
			cos = Math.cos(6.2831853071795862D / d9);
			stepsPerRad = d9 / 6.2831853071795862D;
			if(d < 0.0D)
				sin = -sin;
			j = 0;
			while(j < polyNodes.getChildCount()) 
			{
				Object obj = ((Object) ((PolyNode)polyNodes.getChilds().get(j)));
				srcPoly = ((PolyNode) (obj)).getPolygon();
				int k3 = srcPoly.size();
				if(k3 != 0 && (d > 0.0D || k3 >= 3 && ((PolyNode) (obj)).getEndType() == Clipper.EndType.CLOSED_POLYGON))
	//* 158  331:goto            131
				{
					destPoly = new Path();
	//  159  334:aload_0         
	//  160  335:new             #88  <Class Path>
	//  161  338:dup             
	//  162  339:invokespecial   #182 <Method void Path()>
	//  163  342:putfield        #84  <Field Path destPoly>
					if(k3 == 1)
	//* 164  345:iload           13
	//* 165  347:iconst_1        
	//* 166  348:icmpne          615
					{
						if(((PolyNode) (obj)).getJoinType() == Clipper.JoinType.ROUND)
	//* 167  351:aload           16
	//* 168  353:invokevirtual   #186 <Method Clipper$JoinType PolyNode.getJoinType()>
	//* 169  356:getstatic       #192 <Field Clipper$JoinType Clipper$JoinType.ROUND>
	//* 170  359:if_acmpne       485
						{
							double d2 = 1.0D;
	//  171  362:dconst_1        
	//  172  363:dstore_3        
							double d6 = 0.0D;
	//  173  364:dconst_0        
	//  174  365:dstore          5
							int k = 1;
	//  175  367:iconst_1        
	//  176  368:istore          12
							do
							{
								double d8 = d2;
	//  177  370:dload_3         
	//  178  371:dstore          7
								if((double)k > d9)
									break;
	//  179  373:iload           12
	//  180  375:i2d             
	//  181  376:dload           9
	//  182  378:dcmpg           
	//  183  379:ifgt            600
								destPoly.add(((Object) (new Point.LongPoint(Math.round((double)((Point.LongPoint)srcPoly.get(0)).getX() + d8 * d), Math.round((double)((Point.LongPoint)srcPoly.get(0)).getY() + d6 * d)))));
	//  184  382:aload_0         
	//  185  383:getfield        #84  <Field Path destPoly>
	//  186  386:new             #53  <Class Point$LongPoint>
	//  187  389:dup             
	//  188  390:aload_0         
	//  189  391:getfield        #86  <Field Path srcPoly>
	//  190  394:iconst_0        
	//  191  395:invokevirtual   #92  <Method Object Path.get(int)>
	//  192  398:checkcast       #53  <Class Point$LongPoint>
	//  193  401:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  194  404:l2d             
	//  195  405:dload           7
	//  196  407:dload_1         
	//  197  408:dmul            
	//  198  409:dadd            
	//  199  410:invokestatic    #110 <Method long Math.round(double)>
	//  200  413:aload_0         
	//  201  414:getfield        #86  <Field Path srcPoly>
	//  202  417:iconst_0        
	//  203  418:invokevirtual   #92  <Method Object Path.get(int)>
	//  204  421:checkcast       #53  <Class Point$LongPoint>
	//  205  424:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  206  427:l2d             
	//  207  428:dload           5
	//  208  430:dload_1         
	//  209  431:dmul            
	//  210  432:dadd            
	//  211  433:invokestatic    #110 <Method long Math.round(double)>
	//  212  436:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  213  439:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  214  442:pop             
								d2 = cos * d8 - sin * d6;
	//  215  443:aload_0         
	//  216  444:getfield        #174 <Field double cos>
	//  217  447:dload           7
	//  218  449:dmul            
	//  219  450:aload_0         
	//  220  451:getfield        #170 <Field double sin>
	//  221  454:dload           5
	//  222  456:dmul            
	//  223  457:dsub            
	//  224  458:dstore_3        
								d6 = sin * d8 + cos * d6;
	//  225  459:aload_0         
	//  226  460:getfield        #170 <Field double sin>
	//  227  463:dload           7
	//  228  465:dmul            
	//  229  466:aload_0         
	//  230  467:getfield        #174 <Field double cos>
	//  231  470:dload           5
	//  232  472:dmul            
	//  233  473:dadd            
	//  234  474:dstore          5
								k++;
	//  235  476:iload           12
	//  236  478:iconst_1        
	//  237  479:iadd            
	//  238  480:istore          12
							} while(true);
	//  239  482:goto            370
						} else
						{
							double d3 = -1D;
	//  240  485:ldc2w           #193 <Double -1D>
	//  241  488:dstore_3        
							double d7 = -1D;
	//  242  489:ldc2w           #193 <Double -1D>
	//  243  492:dstore          5
							int l = 0;
	//  244  494:iconst_0        
	//  245  495:istore          12
							while(l < 4) 
	//* 246  497:iload           12
	//* 247  499:iconst_4        
	//* 248  500:icmpge          600
							{
								destPoly.add(((Object) (new Point.LongPoint(Math.round((double)((Point.LongPoint)srcPoly.get(0)).getX() + d3 * d), Math.round((double)((Point.LongPoint)srcPoly.get(0)).getY() + d7 * d)))));
	//  249  503:aload_0         
	//  250  504:getfield        #84  <Field Path destPoly>
	//  251  507:new             #53  <Class Point$LongPoint>
	//  252  510:dup             
	//  253  511:aload_0         
	//  254  512:getfield        #86  <Field Path srcPoly>
	//  255  515:iconst_0        
	//  256  516:invokevirtual   #92  <Method Object Path.get(int)>
	//  257  519:checkcast       #53  <Class Point$LongPoint>
	//  258  522:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  259  525:l2d             
	//  260  526:dload_3         
	//  261  527:dload_1         
	//  262  528:dmul            
	//  263  529:dadd            
	//  264  530:invokestatic    #110 <Method long Math.round(double)>
	//  265  533:aload_0         
	//  266  534:getfield        #86  <Field Path srcPoly>
	//  267  537:iconst_0        
	//  268  538:invokevirtual   #92  <Method Object Path.get(int)>
	//  269  541:checkcast       #53  <Class Point$LongPoint>
	//  270  544:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  271  547:l2d             
	//  272  548:dload           5
	//  273  550:dload_1         
	//  274  551:dmul            
	//  275  552:dadd            
	//  276  553:invokestatic    #110 <Method long Math.round(double)>
	//  277  556:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  278  559:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  279  562:pop             
								if(d3 < 0.0D)
	//* 280  563:dload_3         
	//* 281  564:dconst_0        
	//* 282  565:dcmpg           
	//* 283  566:ifge            580
									d3 = 1.0D;
	//  284  569:dconst_1        
	//  285  570:dstore_3        
								else
	//* 286  571:iload           12
	//* 287  573:iconst_1        
	//* 288  574:iadd            
	//* 289  575:istore          12
	//* 290  577:goto            497
								if(d7 < 0.0D)
	//* 291  580:dload           5
	//* 292  582:dconst_0        
	//* 293  583:dcmpg           
	//* 294  584:ifge            593
									d7 = 1.0D;
	//  295  587:dconst_1        
	//  296  588:dstore          5
								else
	//* 297  590:goto            571
									d3 = -1D;
	//  298  593:ldc2w           #193 <Double -1D>
	//  299  596:dstore_3        
								l++;
							}
						}
	//* 300  597:goto            571
						destPolys.add(((Object) (destPoly)));
	//  301  600:aload_0         
	//  302  601:getfield        #128 <Field Paths destPolys>
	//  303  604:aload_0         
	//  304  605:getfield        #84  <Field Path destPoly>
	//  305  608:invokevirtual   #155 <Method boolean Paths.add(Object)>
	//  306  611:pop             
					} else
	//* 307  612:goto            279
					{
						normals.clear();
	//  308  615:aload_0         
	//  309  616:getfield        #78  <Field List normals>
	//  310  619:invokeinterface #197 <Method void List.clear()>
						for(int i1 = 0; i1 < k3 - 1; i1++)
	//* 311  624:iconst_0        
	//* 312  625:istore          12
	//* 313  627:iload           12
	//* 314  629:iload           13
	//* 315  631:iconst_1        
	//* 316  632:isub            
	//* 317  633:icmpge          684
							normals.add(((Object) (Point.getUnitNormal((Point.LongPoint)srcPoly.get(i1), (Point.LongPoint)srcPoly.get(i1 + 1)))));
	//  318  636:aload_0         
	//  319  637:getfield        #78  <Field List normals>
	//  320  640:aload_0         
	//  321  641:getfield        #86  <Field Path srcPoly>
	//  322  644:iload           12
	//  323  646:invokevirtual   #92  <Method Object Path.get(int)>
	//  324  649:checkcast       #53  <Class Point$LongPoint>
	//  325  652:aload_0         
	//  326  653:getfield        #86  <Field Path srcPoly>
	//  327  656:iload           12
	//  328  658:iconst_1        
	//  329  659:iadd            
	//  330  660:invokevirtual   #92  <Method Object Path.get(int)>
	//  331  663:checkcast       #53  <Class Point$LongPoint>
	//  332  666:invokestatic    #203 <Method Point$DoublePoint Point.getUnitNormal(Point$LongPoint, Point$LongPoint)>
	//  333  669:invokeinterface #204 <Method boolean List.add(Object)>
	//  334  674:pop             

	//  335  675:iload           12
	//  336  677:iconst_1        
	//  337  678:iadd            
	//  338  679:istore          12
	//* 339  681:goto            627
						if(((PolyNode) (obj)).getEndType() == Clipper.EndType.CLOSED_LINE || ((PolyNode) (obj)).getEndType() == Clipper.EndType.CLOSED_POLYGON)
	//* 340  684:aload           16
	//* 341  686:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//* 342  689:getstatic       #207 <Field Clipper$EndType Clipper$EndType.CLOSED_LINE>
	//* 343  692:if_acmpeq       706
	//* 344  695:aload           16
	//* 345  697:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//* 346  700:getstatic       #150 <Field Clipper$EndType Clipper$EndType.CLOSED_POLYGON>
	//* 347  703:if_acmpne       799
							normals.add(((Object) (Point.getUnitNormal((Point.LongPoint)srcPoly.get(k3 - 1), (Point.LongPoint)srcPoly.get(0)))));
	//  348  706:aload_0         
	//  349  707:getfield        #78  <Field List normals>
	//  350  710:aload_0         
	//  351  711:getfield        #86  <Field Path srcPoly>
	//  352  714:iload           13
	//  353  716:iconst_1        
	//  354  717:isub            
	//  355  718:invokevirtual   #92  <Method Object Path.get(int)>
	//  356  721:checkcast       #53  <Class Point$LongPoint>
	//  357  724:aload_0         
	//  358  725:getfield        #86  <Field Path srcPoly>
	//  359  728:iconst_0        
	//  360  729:invokevirtual   #92  <Method Object Path.get(int)>
	//  361  732:checkcast       #53  <Class Point$LongPoint>
	//  362  735:invokestatic    #203 <Method Point$DoublePoint Point.getUnitNormal(Point$LongPoint, Point$LongPoint)>
	//  363  738:invokeinterface #204 <Method boolean List.add(Object)>
	//  364  743:pop             
						else
	//* 365  744:aload           16
	//* 366  746:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//* 367  749:getstatic       #150 <Field Clipper$EndType Clipper$EndType.CLOSED_POLYGON>
	//* 368  752:if_acmpne       850
	//* 369  755:iconst_0        
	//* 370  756:istore          12
	//* 371  758:iload           12
	//* 372  760:iload           13
	//* 373  762:icmpge          835
	//* 374  765:aload           16
	//* 375  767:invokevirtual   #186 <Method Clipper$JoinType PolyNode.getJoinType()>
	//* 376  770:astore          17
	//* 377  772:aload_0         
	//* 378  773:iload           12
	//* 379  775:iconst_1        
	//* 380  776:newarray        int[]
	//* 381  778:dup             
	//* 382  779:iconst_0        
	//* 383  780:iload           13
	//* 384  782:iconst_1        
	//* 385  783:isub            
	//* 386  784:iastore         
	//* 387  785:aload           17
	//* 388  787:invokespecial   #211 <Method void offsetPoint(int, int[], Clipper$JoinType)>
	//* 389  790:iload           12
	//* 390  792:iconst_1        
	//* 391  793:iadd            
	//* 392  794:istore          12
	//* 393  796:goto            758
							normals.add(((Object) (new Point.DoublePoint((Point.DoublePoint)normals.get(k3 - 2)))));
	//  394  799:aload_0         
	//  395  800:getfield        #78  <Field List normals>
	//  396  803:new             #101 <Class Point$DoublePoint>
	//  397  806:dup             
	//  398  807:aload_0         
	//  399  808:getfield        #78  <Field List normals>
	//  400  811:iload           13
	//  401  813:iconst_2        
	//  402  814:isub            
	//  403  815:invokeinterface #99  <Method Object List.get(int)>
	//  404  820:checkcast       #101 <Class Point$DoublePoint>
	//  405  823:invokespecial   #214 <Method void Point$DoublePoint(Point$DoublePoint)>
	//  406  826:invokeinterface #204 <Method boolean List.add(Object)>
	//  407  831:pop             
						if(((PolyNode) (obj)).getEndType() == Clipper.EndType.CLOSED_POLYGON)
						{
							for(int j1 = 0; j1 < k3; j1++)
							{
								Clipper.JoinType jointype = ((PolyNode) (obj)).getJoinType();
								offsetPoint(j1, new int[] {
									k3 - 1
								}, jointype);
							}

	//* 408  832:goto            744
							destPolys.add(((Object) (destPoly)));
	//  409  835:aload_0         
	//  410  836:getfield        #128 <Field Paths destPolys>
	//  411  839:aload_0         
	//  412  840:getfield        #84  <Field Path destPoly>
	//  413  843:invokevirtual   #155 <Method boolean Paths.add(Object)>
	//  414  846:pop             
						} else
	//* 415  847:goto            279
						if(((PolyNode) (obj)).getEndType() == Clipper.EndType.CLOSED_LINE)
	//* 416  850:aload           16
	//* 417  852:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//* 418  855:getstatic       #207 <Field Clipper$EndType Clipper$EndType.CLOSED_LINE>
	//* 419  858:if_acmpne       1110
						{
							int ai[] = new int[1];
	//  420  861:iconst_1        
	//  421  862:newarray        int[]
	//  422  864:astore          17
							ai[0] = k3 - 1;
	//  423  866:aload           17
	//  424  868:iconst_0        
	//  425  869:iload           13
	//  426  871:iconst_1        
	//  427  872:isub            
	//  428  873:iastore         
							for(int k1 = 0; k1 < k3; k1++)
	//* 429  874:iconst_0        
	//* 430  875:istore          12
	//* 431  877:iload           12
	//* 432  879:iload           13
	//* 433  881:icmpge          906
								offsetPoint(k1, ai, ((PolyNode) (obj)).getJoinType());
	//  434  884:aload_0         
	//  435  885:iload           12
	//  436  887:aload           17
	//  437  889:aload           16
	//  438  891:invokevirtual   #186 <Method Clipper$JoinType PolyNode.getJoinType()>
	//  439  894:invokespecial   #211 <Method void offsetPoint(int, int[], Clipper$JoinType)>

	//  440  897:iload           12
	//  441  899:iconst_1        
	//  442  900:iadd            
	//  443  901:istore          12
	//* 444  903:goto            877
							destPolys.add(((Object) (destPoly)));
	//  445  906:aload_0         
	//  446  907:getfield        #128 <Field Paths destPolys>
	//  447  910:aload_0         
	//  448  911:getfield        #84  <Field Path destPoly>
	//  449  914:invokevirtual   #155 <Method boolean Paths.add(Object)>
	//  450  917:pop             
							destPoly = new Path();
	//  451  918:aload_0         
	//  452  919:new             #88  <Class Path>
	//  453  922:dup             
	//  454  923:invokespecial   #182 <Method void Path()>
	//  455  926:putfield        #84  <Field Path destPoly>
							Point.DoublePoint doublepoint = (Point.DoublePoint)normals.get(k3 - 1);
	//  456  929:aload_0         
	//  457  930:getfield        #78  <Field List normals>
	//  458  933:iload           13
	//  459  935:iconst_1        
	//  460  936:isub            
	//  461  937:invokeinterface #99  <Method Object List.get(int)>
	//  462  942:checkcast       #101 <Class Point$DoublePoint>
	//  463  945:astore          18
							for(int l1 = k3 - 1; l1 > 0; l1--)
	//* 464  947:iload           13
	//* 465  949:iconst_1        
	//* 466  950:isub            
	//* 467  951:istore          12
	//* 468  953:iload           12
	//* 469  955:ifle            1026
								normals.set(l1, ((Object) (new Point.DoublePoint(-((Point.DoublePoint)normals.get(l1 - 1)).getX(), -((Point.DoublePoint)normals.get(l1 - 1)).getY()))));
	//  470  958:aload_0         
	//  471  959:getfield        #78  <Field List normals>
	//  472  962:iload           12
	//  473  964:new             #101 <Class Point$DoublePoint>
	//  474  967:dup             
	//  475  968:aload_0         
	//  476  969:getfield        #78  <Field List normals>
	//  477  972:iload           12
	//  478  974:iconst_1        
	//  479  975:isub            
	//  480  976:invokeinterface #99  <Method Object List.get(int)>
	//  481  981:checkcast       #101 <Class Point$DoublePoint>
	//  482  984:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//  483  987:dneg            
	//  484  988:aload_0         
	//  485  989:getfield        #78  <Field List normals>
	//  486  992:iload           12
	//  487  994:iconst_1        
	//  488  995:isub            
	//  489  996:invokeinterface #99  <Method Object List.get(int)>
	//  490 1001:checkcast       #101 <Class Point$DoublePoint>
	//  491 1004:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//  492 1007:dneg            
	//  493 1008:invokespecial   #215 <Method void Point$DoublePoint(double, double)>
	//  494 1011:invokeinterface #219 <Method Object List.set(int, Object)>
	//  495 1016:pop             

	//  496 1017:iload           12
	//  497 1019:iconst_1        
	//  498 1020:isub            
	//  499 1021:istore          12
	//* 500 1023:goto            953
							normals.set(0, ((Object) (new Point.DoublePoint(-doublepoint.getX(), -doublepoint.getY(), 0.0D))));
	//  501 1026:aload_0         
	//  502 1027:getfield        #78  <Field List normals>
	//  503 1030:iconst_0        
	//  504 1031:new             #101 <Class Point$DoublePoint>
	//  505 1034:dup             
	//  506 1035:aload           18
	//  507 1037:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//  508 1040:dneg            
	//  509 1041:aload           18
	//  510 1043:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//  511 1046:dneg            
	//  512 1047:dconst_0        
	//  513 1048:invokespecial   #222 <Method void Point$DoublePoint(double, double, double)>
	//  514 1051:invokeinterface #219 <Method Object List.set(int, Object)>
	//  515 1056:pop             
							ai[0] = 0;
	//  516 1057:aload           17
	//  517 1059:iconst_0        
	//  518 1060:iconst_0        
	//  519 1061:iastore         
							for(int i2 = k3 - 1; i2 >= 0; i2--)
	//* 520 1062:iload           13
	//* 521 1064:iconst_1        
	//* 522 1065:isub            
	//* 523 1066:istore          12
	//* 524 1068:iload           12
	//* 525 1070:iflt            1095
								offsetPoint(i2, ai, ((PolyNode) (obj)).getJoinType());
	//  526 1073:aload_0         
	//  527 1074:iload           12
	//  528 1076:aload           17
	//  529 1078:aload           16
	//  530 1080:invokevirtual   #186 <Method Clipper$JoinType PolyNode.getJoinType()>
	//  531 1083:invokespecial   #211 <Method void offsetPoint(int, int[], Clipper$JoinType)>

	//  532 1086:iload           12
	//  533 1088:iconst_1        
	//  534 1089:isub            
	//  535 1090:istore          12
	//* 536 1092:goto            1068
							destPolys.add(((Object) (destPoly)));
	//  537 1095:aload_0         
	//  538 1096:getfield        #128 <Field Paths destPolys>
	//  539 1099:aload_0         
	//  540 1100:getfield        #84  <Field Path destPoly>
	//  541 1103:invokevirtual   #155 <Method boolean Paths.add(Object)>
	//  542 1106:pop             
						} else
	//* 543 1107:goto            279
						{
							int ai1[] = new int[1];
	//  544 1110:iconst_1        
	//  545 1111:newarray        int[]
	//  546 1113:astore          17
							for(int j2 = 1; j2 < k3 - 1; j2++)
	//* 547 1115:iconst_1        
	//* 548 1116:istore          12
	//* 549 1118:iload           12
	//* 550 1120:iload           13
	//* 551 1122:iconst_1        
	//* 552 1123:isub            
	//* 553 1124:icmpge          1149
								offsetPoint(j2, ai1, ((PolyNode) (obj)).getJoinType());
	//  554 1127:aload_0         
	//  555 1128:iload           12
	//  556 1130:aload           17
	//  557 1132:aload           16
	//  558 1134:invokevirtual   #186 <Method Clipper$JoinType PolyNode.getJoinType()>
	//  559 1137:invokespecial   #211 <Method void offsetPoint(int, int[], Clipper$JoinType)>

	//  560 1140:iload           12
	//  561 1142:iconst_1        
	//  562 1143:iadd            
	//  563 1144:istore          12
	//* 564 1146:goto            1118
							int l2;
							if(((PolyNode) (obj)).getEndType() == Clipper.EndType.OPEN_BUTT)
	//* 565 1149:aload           16
	//* 566 1151:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//* 567 1154:getstatic       #225 <Field Clipper$EndType Clipper$EndType.OPEN_BUTT>
	//* 568 1157:if_acmpne       1449
							{
								int k2 = k3 - 1;
	//  569 1160:iload           13
	//  570 1162:iconst_1        
	//  571 1163:isub            
	//  572 1164:istore          12
								double d4 = ((Point.LongPoint)srcPoly.get(k2)).getX();
	//  573 1166:aload_0         
	//  574 1167:getfield        #86  <Field Path srcPoly>
	//  575 1170:iload           12
	//  576 1172:invokevirtual   #92  <Method Object Path.get(int)>
	//  577 1175:checkcast       #53  <Class Point$LongPoint>
	//  578 1178:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  579 1181:l2d             
	//  580 1182:dstore_3        
								long l3 = Math.round(((Point.DoublePoint)normals.get(k2)).getX() * d + d4);
	//  581 1183:aload_0         
	//  582 1184:getfield        #78  <Field List normals>
	//  583 1187:iload           12
	//  584 1189:invokeinterface #99  <Method Object List.get(int)>
	//  585 1194:checkcast       #101 <Class Point$DoublePoint>
	//  586 1197:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//  587 1200:dload_1         
	//  588 1201:dmul            
	//  589 1202:dload_3         
	//  590 1203:dadd            
	//  591 1204:invokestatic    #110 <Method long Math.round(double)>
	//  592 1207:lstore          14
								d4 = ((Point.LongPoint)srcPoly.get(k2)).getY();
	//  593 1209:aload_0         
	//  594 1210:getfield        #86  <Field Path srcPoly>
	//  595 1213:iload           12
	//  596 1215:invokevirtual   #92  <Method Object Path.get(int)>
	//  597 1218:checkcast       #53  <Class Point$LongPoint>
	//  598 1221:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  599 1224:l2d             
	//  600 1225:dstore_3        
								Point.LongPoint longpoint = new Point.LongPoint(l3, Math.round(((Point.DoublePoint)normals.get(k2)).getY() * d + d4), 0L);
	//  601 1226:new             #53  <Class Point$LongPoint>
	//  602 1229:dup             
	//  603 1230:lload           14
	//  604 1232:aload_0         
	//  605 1233:getfield        #78  <Field List normals>
	//  606 1236:iload           12
	//  607 1238:invokeinterface #99  <Method Object List.get(int)>
	//  608 1243:checkcast       #101 <Class Point$DoublePoint>
	//  609 1246:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//  610 1249:dload_1         
	//  611 1250:dmul            
	//  612 1251:dload_3         
	//  613 1252:dadd            
	//  614 1253:invokestatic    #110 <Method long Math.round(double)>
	//  615 1256:lconst_0        
	//  616 1257:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//  617 1260:astore          18
								destPoly.add(((Object) (longpoint)));
	//  618 1262:aload_0         
	//  619 1263:getfield        #84  <Field Path destPoly>
	//  620 1266:aload           18
	//  621 1268:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  622 1271:pop             
								longpoint = new Point.LongPoint(Math.round((double)((Point.LongPoint)srcPoly.get(k2)).getX() - ((Point.DoublePoint)normals.get(k2)).getX() * d), Math.round((double)((Point.LongPoint)srcPoly.get(k2)).getY() - ((Point.DoublePoint)normals.get(k2)).getY() * d), 0L);
	//  623 1272:new             #53  <Class Point$LongPoint>
	//  624 1275:dup             
	//  625 1276:aload_0         
	//  626 1277:getfield        #86  <Field Path srcPoly>
	//  627 1280:iload           12
	//  628 1282:invokevirtual   #92  <Method Object Path.get(int)>
	//  629 1285:checkcast       #53  <Class Point$LongPoint>
	//  630 1288:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  631 1291:l2d             
	//  632 1292:aload_0         
	//  633 1293:getfield        #78  <Field List normals>
	//  634 1296:iload           12
	//  635 1298:invokeinterface #99  <Method Object List.get(int)>
	//  636 1303:checkcast       #101 <Class Point$DoublePoint>
	//  637 1306:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//  638 1309:dload_1         
	//  639 1310:dmul            
	//  640 1311:dsub            
	//  641 1312:invokestatic    #110 <Method long Math.round(double)>
	//  642 1315:aload_0         
	//  643 1316:getfield        #86  <Field Path srcPoly>
	//  644 1319:iload           12
	//  645 1321:invokevirtual   #92  <Method Object Path.get(int)>
	//  646 1324:checkcast       #53  <Class Point$LongPoint>
	//  647 1327:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  648 1330:l2d             
	//  649 1331:aload_0         
	//  650 1332:getfield        #78  <Field List normals>
	//  651 1335:iload           12
	//  652 1337:invokeinterface #99  <Method Object List.get(int)>
	//  653 1342:checkcast       #101 <Class Point$DoublePoint>
	//  654 1345:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//  655 1348:dload_1         
	//  656 1349:dmul            
	//  657 1350:dsub            
	//  658 1351:invokestatic    #110 <Method long Math.round(double)>
	//  659 1354:lconst_0        
	//  660 1355:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//  661 1358:astore          18
								destPoly.add(((Object) (longpoint)));
	//  662 1360:aload_0         
	//  663 1361:getfield        #84  <Field Path destPoly>
	//  664 1364:aload           18
	//  665 1366:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  666 1369:pop             
							} else
	//* 667 1370:iload           13
	//* 668 1372:iconst_1        
	//* 669 1373:isub            
	//* 670 1374:istore          12
	//* 671 1376:iload           12
	//* 672 1378:ifle            1561
	//* 673 1381:aload_0         
	//* 674 1382:getfield        #78  <Field List normals>
	//* 675 1385:iload           12
	//* 676 1387:new             #101 <Class Point$DoublePoint>
	//* 677 1390:dup             
	//* 678 1391:aload_0         
	//* 679 1392:getfield        #78  <Field List normals>
	//* 680 1395:iload           12
	//* 681 1397:iconst_1        
	//* 682 1398:isub            
	//* 683 1399:invokeinterface #99  <Method Object List.get(int)>
	//* 684 1404:checkcast       #101 <Class Point$DoublePoint>
	//* 685 1407:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//* 686 1410:dneg            
	//* 687 1411:aload_0         
	//* 688 1412:getfield        #78  <Field List normals>
	//* 689 1415:iload           12
	//* 690 1417:iconst_1        
	//* 691 1418:isub            
	//* 692 1419:invokeinterface #99  <Method Object List.get(int)>
	//* 693 1424:checkcast       #101 <Class Point$DoublePoint>
	//* 694 1427:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//* 695 1430:dneg            
	//* 696 1431:invokespecial   #215 <Method void Point$DoublePoint(double, double)>
	//* 697 1434:invokeinterface #219 <Method Object List.set(int, Object)>
	//* 698 1439:pop             
	//* 699 1440:iload           12
	//* 700 1442:iconst_1        
	//* 701 1443:isub            
	//* 702 1444:istore          12
	//* 703 1446:goto            1376
							{
								int i3 = k3 - 1;
	//  704 1449:iload           13
	//  705 1451:iconst_1        
	//  706 1452:isub            
	//  707 1453:istore          12
								ai1[0] = k3 - 2;
	//  708 1455:aload           17
	//  709 1457:iconst_0        
	//  710 1458:iload           13
	//  711 1460:iconst_2        
	//  712 1461:isub            
	//  713 1462:iastore         
								inA = 0.0D;
	//  714 1463:aload_0         
	//  715 1464:dconst_0        
	//  716 1465:putfield        #230 <Field double inA>
								normals.set(i3, ((Object) (new Point.DoublePoint(-((Point.DoublePoint)normals.get(i3)).getX(), -((Point.DoublePoint)normals.get(i3)).getY()))));
	//  717 1468:aload_0         
	//  718 1469:getfield        #78  <Field List normals>
	//  719 1472:iload           12
	//  720 1474:new             #101 <Class Point$DoublePoint>
	//  721 1477:dup             
	//  722 1478:aload_0         
	//  723 1479:getfield        #78  <Field List normals>
	//  724 1482:iload           12
	//  725 1484:invokeinterface #99  <Method Object List.get(int)>
	//  726 1489:checkcast       #101 <Class Point$DoublePoint>
	//  727 1492:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//  728 1495:dneg            
	//  729 1496:aload_0         
	//  730 1497:getfield        #78  <Field List normals>
	//  731 1500:iload           12
	//  732 1502:invokeinterface #99  <Method Object List.get(int)>
	//  733 1507:checkcast       #101 <Class Point$DoublePoint>
	//  734 1510:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//  735 1513:dneg            
	//  736 1514:invokespecial   #215 <Method void Point$DoublePoint(double, double)>
	//  737 1517:invokeinterface #219 <Method Object List.set(int, Object)>
	//  738 1522:pop             
								if(((PolyNode) (obj)).getEndType() == Clipper.EndType.OPEN_SQUARE)
	//* 739 1523:aload           16
	//* 740 1525:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//* 741 1528:getstatic       #233 <Field Clipper$EndType Clipper$EndType.OPEN_SQUARE>
	//* 742 1531:if_acmpne       1548
									doSquare(i3, ai1[0], true);
	//  743 1534:aload_0         
	//  744 1535:iload           12
	//  745 1537:aload           17
	//  746 1539:iconst_0        
	//  747 1540:iaload          
	//  748 1541:iconst_1        
	//  749 1542:invokespecial   #237 <Method void doSquare(int, int, boolean)>
								else
	//* 750 1545:goto            1370
									doRound(i3, ai1[0]);
	//  751 1548:aload_0         
	//  752 1549:iload           12
	//  753 1551:aload           17
	//  754 1553:iconst_0        
	//  755 1554:iaload          
	//  756 1555:invokespecial   #241 <Method void doRound(int, int)>
							}
							for(l2 = k3 - 1; l2 > 0; l2--)
								normals.set(l2, ((Object) (new Point.DoublePoint(-((Point.DoublePoint)normals.get(l2 - 1)).getX(), -((Point.DoublePoint)normals.get(l2 - 1)).getY()))));

	//* 757 1558:goto            1370
							normals.set(0, ((Object) (new Point.DoublePoint(-((Point.DoublePoint)normals.get(1)).getX(), -((Point.DoublePoint)normals.get(1)).getY()))));
	//  758 1561:aload_0         
	//  759 1562:getfield        #78  <Field List normals>
	//  760 1565:iconst_0        
	//  761 1566:new             #101 <Class Point$DoublePoint>
	//  762 1569:dup             
	//  763 1570:aload_0         
	//  764 1571:getfield        #78  <Field List normals>
	//  765 1574:iconst_1        
	//  766 1575:invokeinterface #99  <Method Object List.get(int)>
	//  767 1580:checkcast       #101 <Class Point$DoublePoint>
	//  768 1583:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//  769 1586:dneg            
	//  770 1587:aload_0         
	//  771 1588:getfield        #78  <Field List normals>
	//  772 1591:iconst_1        
	//  773 1592:invokeinterface #99  <Method Object List.get(int)>
	//  774 1597:checkcast       #101 <Class Point$DoublePoint>
	//  775 1600:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//  776 1603:dneg            
	//  777 1604:invokespecial   #215 <Method void Point$DoublePoint(double, double)>
	//  778 1607:invokeinterface #219 <Method Object List.set(int, Object)>
	//  779 1612:pop             
							ai1[0] = k3 - 1;
	//  780 1613:aload           17
	//  781 1615:iconst_0        
	//  782 1616:iload           13
	//  783 1618:iconst_1        
	//  784 1619:isub            
	//  785 1620:iastore         
							for(int j3 = ai1[0] - 1; j3 > 0; j3--)
	//* 786 1621:aload           17
	//* 787 1623:iconst_0        
	//* 788 1624:iaload          
	//* 789 1625:iconst_1        
	//* 790 1626:isub            
	//* 791 1627:istore          12
	//* 792 1629:iload           12
	//* 793 1631:ifle            1656
								offsetPoint(j3, ai1, ((PolyNode) (obj)).getJoinType());
	//  794 1634:aload_0         
	//  795 1635:iload           12
	//  796 1637:aload           17
	//  797 1639:aload           16
	//  798 1641:invokevirtual   #186 <Method Clipper$JoinType PolyNode.getJoinType()>
	//  799 1644:invokespecial   #211 <Method void offsetPoint(int, int[], Clipper$JoinType)>

	//  800 1647:iload           12
	//  801 1649:iconst_1        
	//  802 1650:isub            
	//  803 1651:istore          12
	//* 804 1653:goto            1629
							if(((PolyNode) (obj)).getEndType() == Clipper.EndType.OPEN_BUTT)
	//* 805 1656:aload           16
	//* 806 1658:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//* 807 1661:getstatic       #225 <Field Clipper$EndType Clipper$EndType.OPEN_BUTT>
	//* 808 1664:if_acmpne       1876
							{
								obj = ((Object) (new Point.LongPoint(Math.round((double)((Point.LongPoint)srcPoly.get(0)).getX() - ((Point.DoublePoint)normals.get(0)).getX() * d), Math.round((double)((Point.LongPoint)srcPoly.get(0)).getY() - ((Point.DoublePoint)normals.get(0)).getY() * d))));
	//  809 1667:new             #53  <Class Point$LongPoint>
	//  810 1670:dup             
	//  811 1671:aload_0         
	//  812 1672:getfield        #86  <Field Path srcPoly>
	//  813 1675:iconst_0        
	//  814 1676:invokevirtual   #92  <Method Object Path.get(int)>
	//  815 1679:checkcast       #53  <Class Point$LongPoint>
	//  816 1682:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  817 1685:l2d             
	//  818 1686:aload_0         
	//  819 1687:getfield        #78  <Field List normals>
	//  820 1690:iconst_0        
	//  821 1691:invokeinterface #99  <Method Object List.get(int)>
	//  822 1696:checkcast       #101 <Class Point$DoublePoint>
	//  823 1699:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//  824 1702:dload_1         
	//  825 1703:dmul            
	//  826 1704:dsub            
	//  827 1705:invokestatic    #110 <Method long Math.round(double)>
	//  828 1708:aload_0         
	//  829 1709:getfield        #86  <Field Path srcPoly>
	//  830 1712:iconst_0        
	//  831 1713:invokevirtual   #92  <Method Object Path.get(int)>
	//  832 1716:checkcast       #53  <Class Point$LongPoint>
	//  833 1719:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  834 1722:l2d             
	//  835 1723:aload_0         
	//  836 1724:getfield        #78  <Field List normals>
	//  837 1727:iconst_0        
	//  838 1728:invokeinterface #99  <Method Object List.get(int)>
	//  839 1733:checkcast       #101 <Class Point$DoublePoint>
	//  840 1736:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//  841 1739:dload_1         
	//  842 1740:dmul            
	//  843 1741:dsub            
	//  844 1742:invokestatic    #110 <Method long Math.round(double)>
	//  845 1745:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  846 1748:astore          16
								destPoly.add(obj);
	//  847 1750:aload_0         
	//  848 1751:getfield        #84  <Field Path destPoly>
	//  849 1754:aload           16
	//  850 1756:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  851 1759:pop             
								double d5 = ((Point.LongPoint)srcPoly.get(0)).getX();
	//  852 1760:aload_0         
	//  853 1761:getfield        #86  <Field Path srcPoly>
	//  854 1764:iconst_0        
	//  855 1765:invokevirtual   #92  <Method Object Path.get(int)>
	//  856 1768:checkcast       #53  <Class Point$LongPoint>
	//  857 1771:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  858 1774:l2d             
	//  859 1775:dstore_3        
								long l4 = Math.round(((Point.DoublePoint)normals.get(0)).getX() * d + d5);
	//  860 1776:aload_0         
	//  861 1777:getfield        #78  <Field List normals>
	//  862 1780:iconst_0        
	//  863 1781:invokeinterface #99  <Method Object List.get(int)>
	//  864 1786:checkcast       #101 <Class Point$DoublePoint>
	//  865 1789:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//  866 1792:dload_1         
	//  867 1793:dmul            
	//  868 1794:dload_3         
	//  869 1795:dadd            
	//  870 1796:invokestatic    #110 <Method long Math.round(double)>
	//  871 1799:lstore          14
								d5 = ((Point.LongPoint)srcPoly.get(0)).getY();
	//  872 1801:aload_0         
	//  873 1802:getfield        #86  <Field Path srcPoly>
	//  874 1805:iconst_0        
	//  875 1806:invokevirtual   #92  <Method Object Path.get(int)>
	//  876 1809:checkcast       #53  <Class Point$LongPoint>
	//  877 1812:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  878 1815:l2d             
	//  879 1816:dstore_3        
								obj = ((Object) (new Point.LongPoint(l4, Math.round(((Point.DoublePoint)normals.get(0)).getY() * d + d5))));
	//  880 1817:new             #53  <Class Point$LongPoint>
	//  881 1820:dup             
	//  882 1821:lload           14
	//  883 1823:aload_0         
	//  884 1824:getfield        #78  <Field List normals>
	//  885 1827:iconst_0        
	//  886 1828:invokeinterface #99  <Method Object List.get(int)>
	//  887 1833:checkcast       #101 <Class Point$DoublePoint>
	//  888 1836:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//  889 1839:dload_1         
	//  890 1840:dmul            
	//  891 1841:dload_3         
	//  892 1842:dadd            
	//  893 1843:invokestatic    #110 <Method long Math.round(double)>
	//  894 1846:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  895 1849:astore          16
								destPoly.add(obj);
	//  896 1851:aload_0         
	//  897 1852:getfield        #84  <Field Path destPoly>
	//  898 1855:aload           16
	//  899 1857:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  900 1860:pop             
							} else
	//* 901 1861:aload_0         
	//* 902 1862:getfield        #128 <Field Paths destPolys>
	//* 903 1865:aload_0         
	//* 904 1866:getfield        #84  <Field Path destPoly>
	//* 905 1869:invokevirtual   #155 <Method boolean Paths.add(Object)>
	//* 906 1872:pop             
	//* 907 1873:goto            279
							{
								ai1[0] = 1;
	//  908 1876:aload           17
	//  909 1878:iconst_0        
	//  910 1879:iconst_1        
	//  911 1880:iastore         
								inA = 0.0D;
	//  912 1881:aload_0         
	//  913 1882:dconst_0        
	//  914 1883:putfield        #230 <Field double inA>
								if(((PolyNode) (obj)).getEndType() == Clipper.EndType.OPEN_SQUARE)
	//* 915 1886:aload           16
	//* 916 1888:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//* 917 1891:getstatic       #233 <Field Clipper$EndType Clipper$EndType.OPEN_SQUARE>
	//* 918 1894:if_acmpne       1907
									doSquare(0, 1, true);
	//  919 1897:aload_0         
	//  920 1898:iconst_0        
	//  921 1899:iconst_1        
	//  922 1900:iconst_1        
	//  923 1901:invokespecial   #237 <Method void doSquare(int, int, boolean)>
								else
	//* 924 1904:goto            1861
									doRound(0, 1);
	//  925 1907:aload_0         
	//  926 1908:iconst_0        
	//  927 1909:iconst_1        
	//  928 1910:invokespecial   #241 <Method void doRound(int, int)>
							}
							destPolys.add(((Object) (destPoly)));
						}
					}
				}
				j++;
			}
		}
	//* 929 1913:goto            1861
	//  930 1916:return          
	}

	private void doRound(int i, int j)
	{
		double d = inA;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field double inA>
	//    2    4:dstore_3        
		double d1 = ((Point.DoublePoint)normals.get(j)).getX();
	//    3    5:aload_0         
	//    4    6:getfield        #78  <Field List normals>
	//    5    9:iload_2         
	//    6   10:invokeinterface #99  <Method Object List.get(int)>
	//    7   15:checkcast       #101 <Class Point$DoublePoint>
	//    8   18:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//    9   21:dstore          5
		double d2 = ((Point.DoublePoint)normals.get(i)).getX();
	//   10   23:aload_0         
	//   11   24:getfield        #78  <Field List normals>
	//   12   27:iload_1         
	//   13   28:invokeinterface #99  <Method Object List.get(int)>
	//   14   33:checkcast       #101 <Class Point$DoublePoint>
	//   15   36:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//   16   39:dstore          7
		double d4 = ((Point.DoublePoint)normals.get(j)).getY();
	//   17   41:aload_0         
	//   18   42:getfield        #78  <Field List normals>
	//   19   45:iload_2         
	//   20   46:invokeinterface #99  <Method Object List.get(int)>
	//   21   51:checkcast       #101 <Class Point$DoublePoint>
	//   22   54:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//   23   57:dstore          9
		d = Math.atan2(d, ((Point.DoublePoint)normals.get(i)).getY() * d4 + d1 * d2);
	//   24   59:dload_3         
	//   25   60:aload_0         
	//   26   61:getfield        #78  <Field List normals>
	//   27   64:iload_1         
	//   28   65:invokeinterface #99  <Method Object List.get(int)>
	//   29   70:checkcast       #101 <Class Point$DoublePoint>
	//   30   73:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//   31   76:dload           9
	//   32   78:dmul            
	//   33   79:dload           5
	//   34   81:dload           7
	//   35   83:dmul            
	//   36   84:dadd            
	//   37   85:invokestatic    #245 <Method double Math.atan2(double, double)>
	//   38   88:dstore_3        
		int k = Math.max((int)Math.round(stepsPerRad * Math.abs(d)), 1);
	//   39   89:aload_0         
	//   40   90:getfield        #176 <Field double stepsPerRad>
	//   41   93:dload_3         
	//   42   94:invokestatic    #163 <Method double Math.abs(double)>
	//   43   97:dmul            
	//   44   98:invokestatic    #110 <Method long Math.round(double)>
	//   45  101:l2i             
	//   46  102:iconst_1        
	//   47  103:invokestatic    #249 <Method int Math.max(int, int)>
	//   48  106:istore          11
		d = ((Point.DoublePoint)normals.get(j)).getX();
	//   49  108:aload_0         
	//   50  109:getfield        #78  <Field List normals>
	//   51  112:iload_2         
	//   52  113:invokeinterface #99  <Method Object List.get(int)>
	//   53  118:checkcast       #101 <Class Point$DoublePoint>
	//   54  121:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//   55  124:dstore_3        
		d1 = ((Point.DoublePoint)normals.get(j)).getY();
	//   56  125:aload_0         
	//   57  126:getfield        #78  <Field List normals>
	//   58  129:iload_2         
	//   59  130:invokeinterface #99  <Method Object List.get(int)>
	//   60  135:checkcast       #101 <Class Point$DoublePoint>
	//   61  138:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//   62  141:dstore          5
		j = 0;
	//   63  143:iconst_0        
	//   64  144:istore_2        
		do
		{
			double d3 = d;
	//   65  145:dload_3         
	//   66  146:dstore          7
			if(j < k)
	//*  67  148:iload_2         
	//*  68  149:iload           11
	//*  69  151:icmpge          261
			{
				destPoly.add(((Object) (new Point.LongPoint(Math.round((double)((Point.LongPoint)srcPoly.get(i)).getX() + delta * d3), Math.round((double)((Point.LongPoint)srcPoly.get(i)).getY() + delta * d1)))));
	//   70  154:aload_0         
	//   71  155:getfield        #84  <Field Path destPoly>
	//   72  158:new             #53  <Class Point$LongPoint>
	//   73  161:dup             
	//   74  162:aload_0         
	//   75  163:getfield        #86  <Field Path srcPoly>
	//   76  166:iload_1         
	//   77  167:invokevirtual   #92  <Method Object Path.get(int)>
	//   78  170:checkcast       #53  <Class Point$LongPoint>
	//   79  173:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//   80  176:l2d             
	//   81  177:aload_0         
	//   82  178:getfield        #82  <Field double delta>
	//   83  181:dload           7
	//   84  183:dmul            
	//   85  184:dadd            
	//   86  185:invokestatic    #110 <Method long Math.round(double)>
	//   87  188:aload_0         
	//   88  189:getfield        #86  <Field Path srcPoly>
	//   89  192:iload_1         
	//   90  193:invokevirtual   #92  <Method Object Path.get(int)>
	//   91  196:checkcast       #53  <Class Point$LongPoint>
	//   92  199:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//   93  202:l2d             
	//   94  203:aload_0         
	//   95  204:getfield        #82  <Field double delta>
	//   96  207:dload           5
	//   97  209:dmul            
	//   98  210:dadd            
	//   99  211:invokestatic    #110 <Method long Math.round(double)>
	//  100  214:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  101  217:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  102  220:pop             
				d = cos * d3 - sin * d1;
	//  103  221:aload_0         
	//  104  222:getfield        #174 <Field double cos>
	//  105  225:dload           7
	//  106  227:dmul            
	//  107  228:aload_0         
	//  108  229:getfield        #170 <Field double sin>
	//  109  232:dload           5
	//  110  234:dmul            
	//  111  235:dsub            
	//  112  236:dstore_3        
				d1 = sin * d3 + cos * d1;
	//  113  237:aload_0         
	//  114  238:getfield        #170 <Field double sin>
	//  115  241:dload           7
	//  116  243:dmul            
	//  117  244:aload_0         
	//  118  245:getfield        #174 <Field double cos>
	//  119  248:dload           5
	//  120  250:dmul            
	//  121  251:dadd            
	//  122  252:dstore          5
				j++;
	//  123  254:iload_2         
	//  124  255:iconst_1        
	//  125  256:iadd            
	//  126  257:istore_2        
			} else
	//* 127  258:goto            145
			{
				destPoly.add(((Object) (new Point.LongPoint(Math.round((double)((Point.LongPoint)srcPoly.get(i)).getX() + ((Point.DoublePoint)normals.get(i)).getX() * delta), Math.round((double)((Point.LongPoint)srcPoly.get(i)).getY() + ((Point.DoublePoint)normals.get(i)).getY() * delta)))));
	//  128  261:aload_0         
	//  129  262:getfield        #84  <Field Path destPoly>
	//  130  265:new             #53  <Class Point$LongPoint>
	//  131  268:dup             
	//  132  269:aload_0         
	//  133  270:getfield        #86  <Field Path srcPoly>
	//  134  273:iload_1         
	//  135  274:invokevirtual   #92  <Method Object Path.get(int)>
	//  136  277:checkcast       #53  <Class Point$LongPoint>
	//  137  280:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  138  283:l2d             
	//  139  284:aload_0         
	//  140  285:getfield        #78  <Field List normals>
	//  141  288:iload_1         
	//  142  289:invokeinterface #99  <Method Object List.get(int)>
	//  143  294:checkcast       #101 <Class Point$DoublePoint>
	//  144  297:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//  145  300:aload_0         
	//  146  301:getfield        #82  <Field double delta>
	//  147  304:dmul            
	//  148  305:dadd            
	//  149  306:invokestatic    #110 <Method long Math.round(double)>
	//  150  309:aload_0         
	//  151  310:getfield        #86  <Field Path srcPoly>
	//  152  313:iload_1         
	//  153  314:invokevirtual   #92  <Method Object Path.get(int)>
	//  154  317:checkcast       #53  <Class Point$LongPoint>
	//  155  320:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  156  323:l2d             
	//  157  324:aload_0         
	//  158  325:getfield        #78  <Field List normals>
	//  159  328:iload_1         
	//  160  329:invokeinterface #99  <Method Object List.get(int)>
	//  161  334:checkcast       #101 <Class Point$DoublePoint>
	//  162  337:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//  163  340:aload_0         
	//  164  341:getfield        #82  <Field double delta>
	//  165  344:dmul            
	//  166  345:dadd            
	//  167  346:invokestatic    #110 <Method long Math.round(double)>
	//  168  349:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  169  352:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  170  355:pop             
				return;
	//  171  356:return          
			}
		} while(true);
	}

	private void doSquare(int i, int j, boolean flag)
	{
		double d7 = ((Point.DoublePoint)normals.get(j)).getX();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field List normals>
	//    2    4:iload_2         
	//    3    5:invokeinterface #99  <Method Object List.get(int)>
	//    4   10:checkcast       #101 <Class Point$DoublePoint>
	//    5   13:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//    6   16:dstore          18
		double d6 = ((Point.DoublePoint)normals.get(j)).getY();
	//    7   18:aload_0         
	//    8   19:getfield        #78  <Field List normals>
	//    9   22:iload_2         
	//   10   23:invokeinterface #99  <Method Object List.get(int)>
	//   11   28:checkcast       #101 <Class Point$DoublePoint>
	//   12   31:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//   13   34:dstore          16
		double d3 = ((Point.DoublePoint)normals.get(i)).getX();
	//   14   36:aload_0         
	//   15   37:getfield        #78  <Field List normals>
	//   16   40:iload_1         
	//   17   41:invokeinterface #99  <Method Object List.get(int)>
	//   18   46:checkcast       #101 <Class Point$DoublePoint>
	//   19   49:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//   20   52:dstore          10
		double d1 = ((Point.DoublePoint)normals.get(i)).getY();
	//   21   54:aload_0         
	//   22   55:getfield        #78  <Field List normals>
	//   23   58:iload_1         
	//   24   59:invokeinterface #99  <Method Object List.get(int)>
	//   25   64:checkcast       #101 <Class Point$DoublePoint>
	//   26   67:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//   27   70:dstore          6
		double d5 = ((Point.LongPoint)srcPoly.get(i)).getX();
	//   28   72:aload_0         
	//   29   73:getfield        #86  <Field Path srcPoly>
	//   30   76:iload_1         
	//   31   77:invokevirtual   #92  <Method Object Path.get(int)>
	//   32   80:checkcast       #53  <Class Point$LongPoint>
	//   33   83:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//   34   86:l2d             
	//   35   87:dstore          14
		double d2 = ((Point.LongPoint)srcPoly.get(i)).getY();
	//   36   89:aload_0         
	//   37   90:getfield        #86  <Field Path srcPoly>
	//   38   93:iload_1         
	//   39   94:invokevirtual   #92  <Method Object Path.get(int)>
	//   40   97:checkcast       #53  <Class Point$LongPoint>
	//   41  100:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//   42  103:l2d             
	//   43  104:dstore          8
		double d4 = Math.tan(Math.atan2(inA, d7 * d3 + d6 * d1) / 4D);
	//   44  106:aload_0         
	//   45  107:getfield        #230 <Field double inA>
	//   46  110:dload           18
	//   47  112:dload           10
	//   48  114:dmul            
	//   49  115:dload           16
	//   50  117:dload           6
	//   51  119:dmul            
	//   52  120:dadd            
	//   53  121:invokestatic    #245 <Method double Math.atan2(double, double)>
	//   54  124:ldc2w           #250 <Double 4D>
	//   55  127:ddiv            
	//   56  128:invokestatic    #254 <Method double Math.tan(double)>
	//   57  131:dstore          12
		Path path = destPoly;
	//   58  133:aload_0         
	//   59  134:getfield        #84  <Field Path destPoly>
	//   60  137:astore          24
		double d8 = delta;
	//   61  139:aload_0         
	//   62  140:getfield        #82  <Field double delta>
	//   63  143:dstore          20
		double d;
		long l;
		if(flag)
	//*  64  145:iload_3         
	//*  65  146:ifeq            306
			d = d6 * d4;
	//   66  149:dload           16
	//   67  151:dload           12
	//   68  153:dmul            
	//   69  154:dstore          4
		else
	//*  70  156:dload           18
	//*  71  158:dload           4
	//*  72  160:dsub            
	//*  73  161:dload           20
	//*  74  163:dmul            
	//*  75  164:dload           14
	//*  76  166:dadd            
	//*  77  167:invokestatic    #110 <Method long Math.round(double)>
	//*  78  170:lstore          22
	//*  79  172:aload_0         
	//*  80  173:getfield        #82  <Field double delta>
	//*  81  176:dstore          20
	//*  82  178:iload_3         
	//*  83  179:ifeq            312
	//*  84  182:dload           18
	//*  85  184:dload           12
	//*  86  186:dmul            
	//*  87  187:dstore          4
	//*  88  189:aload           24
	//*  89  191:new             #53  <Class Point$LongPoint>
	//*  90  194:dup             
	//*  91  195:lload           22
	//*  92  197:dload           4
	//*  93  199:dload           16
	//*  94  201:dadd            
	//*  95  202:dload           20
	//*  96  204:dmul            
	//*  97  205:dload           8
	//*  98  207:dadd            
	//*  99  208:invokestatic    #110 <Method long Math.round(double)>
	//* 100  211:lconst_0        
	//* 101  212:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//* 102  215:invokevirtual   #122 <Method boolean Path.add(Object)>
	//* 103  218:pop             
	//* 104  219:aload_0         
	//* 105  220:getfield        #84  <Field Path destPoly>
	//* 106  223:astore          24
	//* 107  225:aload_0         
	//* 108  226:getfield        #82  <Field double delta>
	//* 109  229:dstore          16
	//* 110  231:iload_3         
	//* 111  232:ifeq            318
	//* 112  235:dload           6
	//* 113  237:dload           12
	//* 114  239:dmul            
	//* 115  240:dstore          4
	//* 116  242:dload           4
	//* 117  244:dload           10
	//* 118  246:dadd            
	//* 119  247:dload           16
	//* 120  249:dmul            
	//* 121  250:dload           14
	//* 122  252:dadd            
	//* 123  253:invokestatic    #110 <Method long Math.round(double)>
	//* 124  256:lstore          22
	//* 125  258:aload_0         
	//* 126  259:getfield        #82  <Field double delta>
	//* 127  262:dstore          14
	//* 128  264:iload_3         
	//* 129  265:ifeq            324
	//* 130  268:dload           10
	//* 131  270:dload           12
	//* 132  272:dmul            
	//* 133  273:dstore          4
	//* 134  275:aload           24
	//* 135  277:new             #53  <Class Point$LongPoint>
	//* 136  280:dup             
	//* 137  281:lload           22
	//* 138  283:dload           6
	//* 139  285:dload           4
	//* 140  287:dsub            
	//* 141  288:dload           14
	//* 142  290:dmul            
	//* 143  291:dload           8
	//* 144  293:dadd            
	//* 145  294:invokestatic    #110 <Method long Math.round(double)>
	//* 146  297:lconst_0        
	//* 147  298:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//* 148  301:invokevirtual   #122 <Method boolean Path.add(Object)>
	//* 149  304:pop             
	//* 150  305:return          
			d = 0.0D;
	//  151  306:dconst_0        
	//  152  307:dstore          4
		l = Math.round((d7 - d) * d8 + d5);
		d8 = delta;
		if(flag)
			d = d7 * d4;
		else
	//* 153  309:goto            156
			d = 0.0D;
	//  154  312:dconst_0        
	//  155  313:dstore          4
		path.add(((Object) (new Point.LongPoint(l, Math.round((d + d6) * d8 + d2), 0L))));
		path = destPoly;
		d6 = delta;
		if(flag)
			d = d1 * d4;
		else
	//* 156  315:goto            189
			d = 0.0D;
	//  157  318:dconst_0        
	//  158  319:dstore          4
		l = Math.round((d + d3) * d6 + d5);
		d5 = delta;
		if(flag)
			d = d3 * d4;
		else
	//* 159  321:goto            242
			d = 0.0D;
	//  160  324:dconst_0        
	//  161  325:dstore          4
		path.add(((Object) (new Point.LongPoint(l, Math.round((d1 - d) * d5 + d2), 0L))));
	//* 162  327:goto            275
	}

	private void fixOrientations()
	{
		if(lowest.getX() >= 0L && !((PolyNode)polyNodes.childs.get((int)lowest.getX())).getPolygon().orientation())
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field Point$LongPoint lowest>
	//*   2    4:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//*   3    7:lconst_0        
	//*   4    8:lcmp            
	//*   5    9:iflt            118
	//*   6   12:aload_0         
	//*   7   13:getfield        #73  <Field PolyNode polyNodes>
	//*   8   16:getfield        #258 <Field List PolyNode.childs>
	//*   9   19:aload_0         
	//*  10   20:getfield        #56  <Field Point$LongPoint lowest>
	//*  11   23:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//*  12   26:l2i             
	//*  13   27:invokeinterface #99  <Method Object List.get(int)>
	//*  14   32:checkcast       #70  <Class PolyNode>
	//*  15   35:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//*  16   38:invokevirtual   #262 <Method boolean Path.orientation()>
	//*  17   41:ifne            118
		{
			for(int i = 0; i < polyNodes.getChildCount(); i++)
	//*  18   44:iconst_0        
	//*  19   45:istore_1        
	//*  20   46:iload_1         
	//*  21   47:aload_0         
	//*  22   48:getfield        #73  <Field PolyNode polyNodes>
	//*  23   51:invokevirtual   #136 <Method int PolyNode.getChildCount()>
	//*  24   54:icmpge          182
			{
				PolyNode polynode = (PolyNode)polyNodes.childs.get(i);
	//   25   57:aload_0         
	//   26   58:getfield        #73  <Field PolyNode polyNodes>
	//   27   61:getfield        #258 <Field List PolyNode.childs>
	//   28   64:iload_1         
	//   29   65:invokeinterface #99  <Method Object List.get(int)>
	//   30   70:checkcast       #70  <Class PolyNode>
	//   31   73:astore_2        
				if(polynode.getEndType() == Clipper.EndType.CLOSED_POLYGON || polynode.getEndType() == Clipper.EndType.CLOSED_LINE && polynode.getPolygon().orientation())
	//*  32   74:aload_2         
	//*  33   75:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//*  34   78:getstatic       #150 <Field Clipper$EndType Clipper$EndType.CLOSED_POLYGON>
	//*  35   81:if_acmpeq       104
	//*  36   84:aload_2         
	//*  37   85:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//*  38   88:getstatic       #207 <Field Clipper$EndType Clipper$EndType.CLOSED_LINE>
	//*  39   91:if_acmpne       111
	//*  40   94:aload_2         
	//*  41   95:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//*  42   98:invokevirtual   #262 <Method boolean Path.orientation()>
	//*  43  101:ifeq            111
					Collections.reverse(((List) (polynode.getPolygon())));
	//   44  104:aload_2         
	//   45  105:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//   46  108:invokestatic    #268 <Method void Collections.reverse(List)>
			}

	//   47  111:iload_1         
	//   48  112:iconst_1        
	//   49  113:iadd            
	//   50  114:istore_1        
		} else
	//*  51  115:goto            46
		{
			for(int j = 0; j < polyNodes.getChildCount(); j++)
	//*  52  118:iconst_0        
	//*  53  119:istore_1        
	//*  54  120:iload_1         
	//*  55  121:aload_0         
	//*  56  122:getfield        #73  <Field PolyNode polyNodes>
	//*  57  125:invokevirtual   #136 <Method int PolyNode.getChildCount()>
	//*  58  128:icmpge          182
			{
				PolyNode polynode1 = (PolyNode)polyNodes.childs.get(j);
	//   59  131:aload_0         
	//   60  132:getfield        #73  <Field PolyNode polyNodes>
	//   61  135:getfield        #258 <Field List PolyNode.childs>
	//   62  138:iload_1         
	//   63  139:invokeinterface #99  <Method Object List.get(int)>
	//   64  144:checkcast       #70  <Class PolyNode>
	//   65  147:astore_2        
				if(polynode1.getEndType() == Clipper.EndType.CLOSED_LINE && !polynode1.getPolygon().orientation())
	//*  66  148:aload_2         
	//*  67  149:invokevirtual   #144 <Method Clipper$EndType PolyNode.getEndType()>
	//*  68  152:getstatic       #207 <Field Clipper$EndType Clipper$EndType.CLOSED_LINE>
	//*  69  155:if_acmpne       175
	//*  70  158:aload_2         
	//*  71  159:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//*  72  162:invokevirtual   #262 <Method boolean Path.orientation()>
	//*  73  165:ifne            175
					Collections.reverse(((List) (polynode1.getPolygon())));
	//   74  168:aload_2         
	//   75  169:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//   76  172:invokestatic    #268 <Method void Collections.reverse(List)>
			}

	//   77  175:iload_1         
	//   78  176:iconst_1        
	//   79  177:iadd            
	//   80  178:istore_1        
		}
	//*  81  179:goto            120
	//   82  182:return          
	}

	private static boolean nearZero(double d)
	{
		return d > -9.9999999999999995E-21D && d < 9.9999999999999995E-21D;
	//    0    0:dload_0         
	//    1    1:ldc2w           #269 <Double -9.9999999999999995E-21D>
	//    2    4:dcmpl           
	//    3    5:ifle            18
	//    4    8:dload_0         
	//    5    9:ldc2w           #12  <Double 9.9999999999999995E-21D>
	//    6   12:dcmpg           
	//    7   13:ifge            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private void offsetPoint(int i, int ai[], Clipper.JoinType jointype)
	{
		double d;
		double d1;
		double d2;
		double d3;
		int j;
		long l;
		long l1;
		j = ai[0];
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:iaload          
	//    3    3:istore          12
		d = ((Point.DoublePoint)normals.get(j)).getX();
	//    4    5:aload_0         
	//    5    6:getfield        #78  <Field List normals>
	//    6    9:iload           12
	//    7   11:invokeinterface #99  <Method Object List.get(int)>
	//    8   16:checkcast       #101 <Class Point$DoublePoint>
	//    9   19:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//   10   22:dstore          4
		d1 = ((Point.DoublePoint)normals.get(j)).getY();
	//   11   24:aload_0         
	//   12   25:getfield        #78  <Field List normals>
	//   13   28:iload           12
	//   14   30:invokeinterface #99  <Method Object List.get(int)>
	//   15   35:checkcast       #101 <Class Point$DoublePoint>
	//   16   38:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//   17   41:dstore          6
		d2 = ((Point.DoublePoint)normals.get(i)).getY();
	//   18   43:aload_0         
	//   19   44:getfield        #78  <Field List normals>
	//   20   47:iload_1         
	//   21   48:invokeinterface #99  <Method Object List.get(int)>
	//   22   53:checkcast       #101 <Class Point$DoublePoint>
	//   23   56:invokevirtual   #115 <Method double Point$DoublePoint.getY()>
	//   24   59:dstore          8
		d3 = ((Point.DoublePoint)normals.get(i)).getX();
	//   25   61:aload_0         
	//   26   62:getfield        #78  <Field List normals>
	//   27   65:iload_1         
	//   28   66:invokeinterface #99  <Method Object List.get(int)>
	//   29   71:checkcast       #101 <Class Point$DoublePoint>
	//   30   74:invokevirtual   #104 <Method double Point$DoublePoint.getX()>
	//   31   77:dstore          10
		l = ((Point.LongPoint)srcPoly.get(i)).getX();
	//   32   79:aload_0         
	//   33   80:getfield        #86  <Field Path srcPoly>
	//   34   83:iload_1         
	//   35   84:invokevirtual   #92  <Method Object Path.get(int)>
	//   36   87:checkcast       #53  <Class Point$LongPoint>
	//   37   90:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//   38   93:lstore          13
		l1 = ((Point.LongPoint)srcPoly.get(i)).getY();
	//   39   95:aload_0         
	//   40   96:getfield        #86  <Field Path srcPoly>
	//   41   99:iload_1         
	//   42  100:invokevirtual   #92  <Method Object Path.get(int)>
	//   43  103:checkcast       #53  <Class Point$LongPoint>
	//   44  106:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//   45  109:lstore          15
		inA = d * d2 - d3 * d1;
	//   46  111:aload_0         
	//   47  112:dload           4
	//   48  114:dload           8
	//   49  116:dmul            
	//   50  117:dload           10
	//   51  119:dload           6
	//   52  121:dmul            
	//   53  122:dsub            
	//   54  123:putfield        #230 <Field double inA>
		if(Math.abs(inA * delta) >= 1.0D) goto _L2; else goto _L1
	//   55  126:aload_0         
	//   56  127:getfield        #230 <Field double inA>
	//   57  130:aload_0         
	//   58  131:getfield        #82  <Field double delta>
	//   59  134:dmul            
	//   60  135:invokestatic    #163 <Method double Math.abs(double)>
	//   61  138:dconst_1        
	//   62  139:dcmpg           
	//   63  140:ifge            204
_L1:
		if(d * d3 + d2 * d1 > 0.0D)
	//*  64  143:dload           4
	//*  65  145:dload           10
	//*  66  147:dmul            
	//*  67  148:dload           8
	//*  68  150:dload           6
	//*  69  152:dmul            
	//*  70  153:dadd            
	//*  71  154:dconst_0        
	//*  72  155:dcmpl           
	//*  73  156:ifle            218
		{
			destPoly.add(((Object) (new Point.LongPoint(Math.round((double)l + delta * d), Math.round((double)l1 + delta * d1), 0L))));
	//   74  159:aload_0         
	//   75  160:getfield        #84  <Field Path destPoly>
	//   76  163:new             #53  <Class Point$LongPoint>
	//   77  166:dup             
	//   78  167:lload           13
	//   79  169:l2d             
	//   80  170:aload_0         
	//   81  171:getfield        #82  <Field double delta>
	//   82  174:dload           4
	//   83  176:dmul            
	//   84  177:dadd            
	//   85  178:invokestatic    #110 <Method long Math.round(double)>
	//   86  181:lload           15
	//   87  183:l2d             
	//   88  184:aload_0         
	//   89  185:getfield        #82  <Field double delta>
	//   90  188:dload           6
	//   91  190:dmul            
	//   92  191:dadd            
	//   93  192:invokestatic    #110 <Method long Math.round(double)>
	//   94  195:lconst_0        
	//   95  196:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//   96  199:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   97  202:pop             
			return;
	//   98  203:return          
		}
		  goto _L3
_L2:
		if(inA <= 1.0D) goto _L5; else goto _L4
	//   99  204:aload_0         
	//  100  205:getfield        #230 <Field double inA>
	//  101  208:dconst_1        
	//  102  209:dcmpl           
	//  103  210:ifle            339
_L4:
		inA = 1.0D;
	//  104  213:aload_0         
	//  105  214:dconst_1        
	//  106  215:putfield        #230 <Field double inA>
_L3:
		if(inA * delta >= 0.0D) goto _L7; else goto _L6
	//  107  218:aload_0         
	//  108  219:getfield        #230 <Field double inA>
	//  109  222:aload_0         
	//  110  223:getfield        #82  <Field double delta>
	//  111  226:dmul            
	//  112  227:dconst_0        
	//  113  228:dcmpg           
	//  114  229:ifge            360
_L6:
		destPoly.add(((Object) (new Point.LongPoint(Math.round((double)l + delta * d), Math.round((double)l1 + delta * d1)))));
	//  115  232:aload_0         
	//  116  233:getfield        #84  <Field Path destPoly>
	//  117  236:new             #53  <Class Point$LongPoint>
	//  118  239:dup             
	//  119  240:lload           13
	//  120  242:l2d             
	//  121  243:aload_0         
	//  122  244:getfield        #82  <Field double delta>
	//  123  247:dload           4
	//  124  249:dmul            
	//  125  250:dadd            
	//  126  251:invokestatic    #110 <Method long Math.round(double)>
	//  127  254:lload           15
	//  128  256:l2d             
	//  129  257:aload_0         
	//  130  258:getfield        #82  <Field double delta>
	//  131  261:dload           6
	//  132  263:dmul            
	//  133  264:dadd            
	//  134  265:invokestatic    #110 <Method long Math.round(double)>
	//  135  268:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  136  271:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  137  274:pop             
		destPoly.add(srcPoly.get(i));
	//  138  275:aload_0         
	//  139  276:getfield        #84  <Field Path destPoly>
	//  140  279:aload_0         
	//  141  280:getfield        #86  <Field Path srcPoly>
	//  142  283:iload_1         
	//  143  284:invokevirtual   #92  <Method Object Path.get(int)>
	//  144  287:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  145  290:pop             
		destPoly.add(((Object) (new Point.LongPoint(Math.round((double)l + delta * d3), Math.round((double)l1 + delta * d2)))));
	//  146  291:aload_0         
	//  147  292:getfield        #84  <Field Path destPoly>
	//  148  295:new             #53  <Class Point$LongPoint>
	//  149  298:dup             
	//  150  299:lload           13
	//  151  301:l2d             
	//  152  302:aload_0         
	//  153  303:getfield        #82  <Field double delta>
	//  154  306:dload           10
	//  155  308:dmul            
	//  156  309:dadd            
	//  157  310:invokestatic    #110 <Method long Math.round(double)>
	//  158  313:lload           15
	//  159  315:l2d             
	//  160  316:aload_0         
	//  161  317:getfield        #82  <Field double delta>
	//  162  320:dload           8
	//  163  322:dmul            
	//  164  323:dadd            
	//  165  324:invokestatic    #110 <Method long Math.round(double)>
	//  166  327:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  167  330:invokevirtual   #122 <Method boolean Path.add(Object)>
	//  168  333:pop             
_L9:
		ai[0] = i;
	//  169  334:aload_2         
	//  170  335:iconst_0        
	//  171  336:iload_1         
	//  172  337:iastore         
		return;
	//  173  338:return          
_L5:
		if(inA < -1D)
	//* 174  339:aload_0         
	//* 175  340:getfield        #230 <Field double inA>
	//* 176  343:ldc2w           #193 <Double -1D>
	//* 177  346:dcmpg           
	//* 178  347:ifge            218
			inA = -1D;
	//  179  350:aload_0         
	//  180  351:ldc2w           #193 <Double -1D>
	//  181  354:putfield        #230 <Field double inA>
		continue; /* Loop/switch isn't completed */
	//  182  357:goto            218
_L7:
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType[];

			static 
			{
				$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType = new int[Clipper.JoinType.values().length];
			//    0    0:invokestatic    #18  <Method Clipper$JoinType[] Clipper$JoinType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType>
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType[Clipper.JoinType.MITER.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType>
			//    5   12:getstatic       #24  <Field Clipper$JoinType Clipper$JoinType.MITER>
			//    6   15:invokevirtual   #28  <Method int Clipper$JoinType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType>
			//*  10   23:getstatic       #31  <Field Clipper$JoinType Clipper$JoinType.BEVEL>
			//*  11   26:invokevirtual   #28  <Method int Clipper$JoinType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType>
			//*  15   34:getstatic       #34  <Field Clipper$JoinType Clipper$JoinType.ROUND>
			//*  16   37:invokevirtual   #28  <Method int Clipper$JoinType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
			//*  20   43:astore_0        
			//*  21   44:return          
			//*  22   45:astore_0        
			//*  23   46:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   49:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType[Clipper.JoinType.BEVEL.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType[Clipper.JoinType.ROUND.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  25   50:goto            20
			}
		}

		switch(_cls1..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.JoinType[jointype.ordinal()])
	//* 183  360:getstatic       #274 <Field int[] ClipperOffset$1.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType>
	//* 184  363:aload_3         
	//* 185  364:invokevirtual   #277 <Method int Clipper$JoinType.ordinal()>
	//* 186  367:iaload          
		{
	//* 187  368:tableswitch     1 3: default 396
	//	               1 399
	//	               2 447
	//	               3 458
	//* 188  396:goto            334
		case 1: // '\001'
			d = 1.0D + d3 * d + d2 * d1;
	//  189  399:dconst_1        
	//  190  400:dload           10
	//  191  402:dload           4
	//  192  404:dmul            
	//  193  405:dadd            
	//  194  406:dload           8
	//  195  408:dload           6
	//  196  410:dmul            
	//  197  411:dadd            
	//  198  412:dstore          4
			if(d >= miterLim)
	//* 199  414:dload           4
	//* 200  416:aload_0         
	//* 201  417:getfield        #157 <Field double miterLim>
	//* 202  420:dcmpl           
	//* 203  421:iflt            436
				doMiter(i, j, d);
	//  204  424:aload_0         
	//  205  425:iload_1         
	//  206  426:iload           12
	//  207  428:dload           4
	//  208  430:invokespecial   #279 <Method void doMiter(int, int, double)>
			else
	//* 209  433:goto            334
				doSquare(i, j, false);
	//  210  436:aload_0         
	//  211  437:iload_1         
	//  212  438:iload           12
	//  213  440:iconst_0        
	//  214  441:invokespecial   #237 <Method void doSquare(int, int, boolean)>
			break;

	//* 215  444:goto            334
		case 2: // '\002'
			doSquare(i, j, false);
	//  216  447:aload_0         
	//  217  448:iload_1         
	//  218  449:iload           12
	//  219  451:iconst_0        
	//  220  452:invokespecial   #237 <Method void doSquare(int, int, boolean)>
			break;

	//* 221  455:goto            334
		case 3: // '\003'
			doRound(i, j);
	//  222  458:aload_0         
	//  223  459:iload_1         
	//  224  460:iload           12
	//  225  462:invokespecial   #241 <Method void doRound(int, int)>
			break;
		}
		if(true) goto _L9; else goto _L8
_L8:
		if(true) goto _L3; else goto _L10
_L10:
	//* 226  465:goto            334
	}

	public void addPath(Path path, Clipper.JoinType jointype, Clipper.EndType endtype)
	{
		int l = path.size() - 1;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #179 <Method int Path.size()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore          6
		if(l >= 0) goto _L2; else goto _L1
	//    5    8:iload           6
	//    6   10:ifge            14
_L1:
		return;
	//    7   13:return          
_L2:
		int k;
		PolyNode polynode;
label0:
		{
			polynode = new PolyNode();
	//    8   14:new             #70  <Class PolyNode>
	//    9   17:dup             
	//   10   18:invokespecial   #71  <Method void PolyNode()>
	//   11   21:astore          10
			polynode.setJoinType(jointype);
	//   12   23:aload           10
	//   13   25:aload_2         
	//   14   26:invokevirtual   #285 <Method void PolyNode.setJoinType(Clipper$JoinType)>
			polynode.setEndType(endtype);
	//   15   29:aload           10
	//   16   31:aload_3         
	//   17   32:invokevirtual   #289 <Method void PolyNode.setEndType(Clipper$EndType)>
			int i = l;
	//   18   35:iload           6
	//   19   37:istore          4
			if(endtype != Clipper.EndType.CLOSED_LINE)
	//*  20   39:aload_3         
	//*  21   40:getstatic       #207 <Field Clipper$EndType Clipper$EndType.CLOSED_LINE>
	//*  22   43:if_acmpeq       61
			{
				k = l;
	//   23   46:iload           6
	//   24   48:istore          5
				if(endtype != Clipper.EndType.CLOSED_POLYGON)
					break label0;
	//   25   50:aload_3         
	//   26   51:getstatic       #150 <Field Clipper$EndType Clipper$EndType.CLOSED_POLYGON>
	//   27   54:if_acmpne       97
				i = l;
	//   28   57:iload           6
	//   29   59:istore          4
			}
			do
			{
				k = i;
	//   30   61:iload           4
	//   31   63:istore          5
				if(i <= 0)
					break;
	//   32   65:iload           4
	//   33   67:ifle            97
				k = i;
	//   34   70:iload           4
	//   35   72:istore          5
				if(path.get(0) != path.get(i))
					break;
	//   36   74:aload_1         
	//   37   75:iconst_0        
	//   38   76:invokevirtual   #92  <Method Object Path.get(int)>
	//   39   79:aload_1         
	//   40   80:iload           4
	//   41   82:invokevirtual   #92  <Method Object Path.get(int)>
	//   42   85:if_acmpne       97
				i--;
	//   43   88:iload           4
	//   44   90:iconst_1        
	//   45   91:isub            
	//   46   92:istore          4
			} while(true);
	//   47   94:goto            61
		}
		polynode.getPolygon().add(path.get(0));
	//   48   97:aload           10
	//   49   99:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//   50  102:aload_1         
	//   51  103:iconst_0        
	//   52  104:invokevirtual   #92  <Method Object Path.get(int)>
	//   53  107:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   54  110:pop             
		int l1 = 0;
	//   55  111:iconst_0        
	//   56  112:istore          9
		int j = 0;
	//   57  114:iconst_0        
	//   58  115:istore          4
		for(int i1 = 1; i1 <= k;)
	//*  59  117:iconst_1        
	//*  60  118:istore          6
	//*  61  120:iload           6
	//*  62  122:iload           5
	//*  63  124:icmpgt          312
		{
			int j1;
			int k1;
label1:
			{
				j1 = l1;
	//   64  127:iload           9
	//   65  129:istore          7
				k1 = j;
	//   66  131:iload           4
	//   67  133:istore          8
				if(polynode.getPolygon().get(l1) == path.get(i1))
					break label1;
	//   68  135:aload           10
	//   69  137:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//   70  140:iload           9
	//   71  142:invokevirtual   #92  <Method Object Path.get(int)>
	//   72  145:aload_1         
	//   73  146:iload           6
	//   74  148:invokevirtual   #92  <Method Object Path.get(int)>
	//   75  151:if_acmpeq       295
				l1++;
	//   76  154:iload           9
	//   77  156:iconst_1        
	//   78  157:iadd            
	//   79  158:istore          9
				polynode.getPolygon().add(path.get(i1));
	//   80  160:aload           10
	//   81  162:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//   82  165:aload_1         
	//   83  166:iload           6
	//   84  168:invokevirtual   #92  <Method Object Path.get(int)>
	//   85  171:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   86  174:pop             
				if(((Point.LongPoint)path.get(i1)).getY() <= ((Point.LongPoint)polynode.getPolygon().get(j)).getY())
	//*  87  175:aload_1         
	//*  88  176:iload           6
	//*  89  178:invokevirtual   #92  <Method Object Path.get(int)>
	//*  90  181:checkcast       #53  <Class Point$LongPoint>
	//*  91  184:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//*  92  187:aload           10
	//*  93  189:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//*  94  192:iload           4
	//*  95  194:invokevirtual   #92  <Method Object Path.get(int)>
	//*  96  197:checkcast       #53  <Class Point$LongPoint>
	//*  97  200:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//*  98  203:lcmp            
	//*  99  204:ifgt            287
				{
					j1 = l1;
	//  100  207:iload           9
	//  101  209:istore          7
					k1 = j;
	//  102  211:iload           4
	//  103  213:istore          8
					if(((Point.LongPoint)path.get(i1)).getY() != ((Point.LongPoint)polynode.getPolygon().get(j)).getY())
						break label1;
	//  104  215:aload_1         
	//  105  216:iload           6
	//  106  218:invokevirtual   #92  <Method Object Path.get(int)>
	//  107  221:checkcast       #53  <Class Point$LongPoint>
	//  108  224:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  109  227:aload           10
	//  110  229:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//  111  232:iload           4
	//  112  234:invokevirtual   #92  <Method Object Path.get(int)>
	//  113  237:checkcast       #53  <Class Point$LongPoint>
	//  114  240:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  115  243:lcmp            
	//  116  244:ifne            295
					j1 = l1;
	//  117  247:iload           9
	//  118  249:istore          7
					k1 = j;
	//  119  251:iload           4
	//  120  253:istore          8
					if(((Point.LongPoint)path.get(i1)).getX() >= ((Point.LongPoint)polynode.getPolygon().get(j)).getX())
						break label1;
	//  121  255:aload_1         
	//  122  256:iload           6
	//  123  258:invokevirtual   #92  <Method Object Path.get(int)>
	//  124  261:checkcast       #53  <Class Point$LongPoint>
	//  125  264:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  126  267:aload           10
	//  127  269:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//  128  272:iload           4
	//  129  274:invokevirtual   #92  <Method Object Path.get(int)>
	//  130  277:checkcast       #53  <Class Point$LongPoint>
	//  131  280:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  132  283:lcmp            
	//  133  284:ifge            295
				}
				k1 = l1;
	//  134  287:iload           9
	//  135  289:istore          8
				j1 = l1;
	//  136  291:iload           9
	//  137  293:istore          7
			}
			i1++;
	//  138  295:iload           6
	//  139  297:iconst_1        
	//  140  298:iadd            
	//  141  299:istore          6
			l1 = j1;
	//  142  301:iload           7
	//  143  303:istore          9
			j = k1;
	//  144  305:iload           8
	//  145  307:istore          4
		}

	//* 146  309:goto            120
		if(endtype != Clipper.EndType.CLOSED_POLYGON || l1 >= 2)
	//* 147  312:aload_3         
	//* 148  313:getstatic       #150 <Field Clipper$EndType Clipper$EndType.CLOSED_POLYGON>
	//* 149  316:if_acmpne       325
	//* 150  319:iload           9
	//* 151  321:iconst_2        
	//* 152  322:icmplt          13
		{
			polyNodes.addChild(polynode);
	//  153  325:aload_0         
	//  154  326:getfield        #73  <Field PolyNode polyNodes>
	//  155  329:aload           10
	//  156  331:invokevirtual   #293 <Method void PolyNode.addChild(PolyNode)>
			if(endtype == Clipper.EndType.CLOSED_POLYGON)
	//* 157  334:aload_3         
	//* 158  335:getstatic       #150 <Field Clipper$EndType Clipper$EndType.CLOSED_POLYGON>
	//* 159  338:if_acmpne       13
			{
				if(lowest.getX() < 0L)
	//* 160  341:aload_0         
	//* 161  342:getfield        #56  <Field Point$LongPoint lowest>
	//* 162  345:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//* 163  348:lconst_0        
	//* 164  349:lcmp            
	//* 165  350:ifge            378
				{
					lowest = new Point.LongPoint(polyNodes.getChildCount() - 1, j);
	//  166  353:aload_0         
	//  167  354:new             #53  <Class Point$LongPoint>
	//  168  357:dup             
	//  169  358:aload_0         
	//  170  359:getfield        #73  <Field PolyNode polyNodes>
	//  171  362:invokevirtual   #136 <Method int PolyNode.getChildCount()>
	//  172  365:iconst_1        
	//  173  366:isub            
	//  174  367:i2l             
	//  175  368:iload           4
	//  176  370:i2l             
	//  177  371:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  178  374:putfield        #56  <Field Point$LongPoint lowest>
					return;
	//  179  377:return          
				}
				path = ((Path) ((Point.LongPoint)((PolyNode)polyNodes.getChilds().get((int)lowest.getX())).getPolygon().get((int)lowest.getY())));
	//  180  378:aload_0         
	//  181  379:getfield        #73  <Field PolyNode polyNodes>
	//  182  382:invokevirtual   #140 <Method List PolyNode.getChilds()>
	//  183  385:aload_0         
	//  184  386:getfield        #56  <Field Point$LongPoint lowest>
	//  185  389:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//  186  392:l2i             
	//  187  393:invokeinterface #99  <Method Object List.get(int)>
	//  188  398:checkcast       #70  <Class PolyNode>
	//  189  401:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//  190  404:aload_0         
	//  191  405:getfield        #56  <Field Point$LongPoint lowest>
	//  192  408:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//  193  411:l2i             
	//  194  412:invokevirtual   #92  <Method Object Path.get(int)>
	//  195  415:checkcast       #53  <Class Point$LongPoint>
	//  196  418:astore_1        
				if(((Point.LongPoint)polynode.getPolygon().get(j)).getY() > ((Point.LongPoint) (path)).getY() || ((Point.LongPoint)polynode.getPolygon().get(j)).getY() == ((Point.LongPoint) (path)).getY() && ((Point.LongPoint)polynode.getPolygon().get(j)).getX() < ((Point.LongPoint) (path)).getX())
	//* 197  419:aload           10
	//* 198  421:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//* 199  424:iload           4
	//* 200  426:invokevirtual   #92  <Method Object Path.get(int)>
	//* 201  429:checkcast       #53  <Class Point$LongPoint>
	//* 202  432:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//* 203  435:aload_1         
	//* 204  436:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//* 205  439:lcmp            
	//* 206  440:ifgt            491
	//* 207  443:aload           10
	//* 208  445:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//* 209  448:iload           4
	//* 210  450:invokevirtual   #92  <Method Object Path.get(int)>
	//* 211  453:checkcast       #53  <Class Point$LongPoint>
	//* 212  456:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//* 213  459:aload_1         
	//* 214  460:invokevirtual   #113 <Method long Point$LongPoint.getY()>
	//* 215  463:lcmp            
	//* 216  464:ifne            13
	//* 217  467:aload           10
	//* 218  469:invokevirtual   #154 <Method Path PolyNode.getPolygon()>
	//* 219  472:iload           4
	//* 220  474:invokevirtual   #92  <Method Object Path.get(int)>
	//* 221  477:checkcast       #53  <Class Point$LongPoint>
	//* 222  480:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//* 223  483:aload_1         
	//* 224  484:invokevirtual   #96  <Method long Point$LongPoint.getX()>
	//* 225  487:lcmp            
	//* 226  488:ifge            13
				{
					lowest = new Point.LongPoint(polyNodes.getChildCount() - 1, j);
	//  227  491:aload_0         
	//  228  492:new             #53  <Class Point$LongPoint>
	//  229  495:dup             
	//  230  496:aload_0         
	//  231  497:getfield        #73  <Field PolyNode polyNodes>
	//  232  500:invokevirtual   #136 <Method int PolyNode.getChildCount()>
	//  233  503:iconst_1        
	//  234  504:isub            
	//  235  505:i2l             
	//  236  506:iload           4
	//  237  508:i2l             
	//  238  509:invokespecial   #118 <Method void Point$LongPoint(long, long)>
	//  239  512:putfield        #56  <Field Point$LongPoint lowest>
					return;
	//  240  515:return          
				}
			}
		}
		if(true) goto _L1; else goto _L3
_L3:
	}

	public void addPaths(Paths paths, Clipper.JoinType jointype, Clipper.EndType endtype)
	{
		for(paths = ((Paths) (paths.iterator())); ((Iterator) (paths)).hasNext(); addPath((Path)((Iterator) (paths)).next(), jointype, endtype));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #299 <Method Iterator Paths.iterator()>
	//    2    4:astore_1        
	//    3    5:aload_1         
	//    4    6:invokeinterface #304 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            32
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #308 <Method Object Iterator.next()>
	//    9   21:checkcast       #88  <Class Path>
	//   10   24:aload_2         
	//   11   25:aload_3         
	//   12   26:invokevirtual   #310 <Method void addPath(Path, Clipper$JoinType, Clipper$EndType)>
	//*  13   29:goto            5
	//   14   32:return          
	}

	public void clear()
	{
		polyNodes.getChilds().clear();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field PolyNode polyNodes>
	//    2    4:invokevirtual   #140 <Method List PolyNode.getChilds()>
	//    3    7:invokeinterface #197 <Method void List.clear()>
		lowest.setX(((Number) (Long.valueOf(-1L))));
	//    4   12:aload_0         
	//    5   13:getfield        #56  <Field Point$LongPoint lowest>
	//    6   16:ldc2w           #57  <Long -1L>
	//    7   19:invokestatic    #64  <Method Long Long.valueOf(long)>
	//    8   22:invokevirtual   #68  <Method void Point$LongPoint.setX(Number)>
	//    9   25:return          
	}

	public void execute(Paths paths, double d)
	{
		paths.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #313 <Method void Paths.clear()>
		fixOrientations();
	//    2    4:aload_0         
	//    3    5:invokespecial   #315 <Method void fixOrientations()>
		doOffset(d);
	//    4    8:aload_0         
	//    5    9:dload_2         
	//    6   10:invokespecial   #317 <Method void doOffset(double)>
		DefaultClipper defaultclipper = new DefaultClipper(1);
	//    7   13:new             #319 <Class DefaultClipper>
	//    8   16:dup             
	//    9   17:iconst_1        
	//   10   18:invokespecial   #322 <Method void DefaultClipper(int)>
	//   11   21:astore          4
		defaultclipper.addPaths(destPolys, Clipper.PolyType.SUBJECT, true);
	//   12   23:aload           4
	//   13   25:aload_0         
	//   14   26:getfield        #128 <Field Paths destPolys>
	//   15   29:getstatic       #328 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #331 <Method boolean DefaultClipper.addPaths(Paths, Clipper$PolyType, boolean)>
	//   18   36:pop             
		if(d > 0.0D)
	//*  19   37:dload_2         
	//*  20   38:dconst_0        
	//*  21   39:dcmpl           
	//*  22   40:ifle            60
		{
			defaultclipper.execute(Clipper.ClipType.UNION, paths, Clipper.PolyFillType.POSITIVE, Clipper.PolyFillType.POSITIVE);
	//   23   43:aload           4
	//   24   45:getstatic       #337 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//   25   48:aload_1         
	//   26   49:getstatic       #343 <Field Clipper$PolyFillType Clipper$PolyFillType.POSITIVE>
	//   27   52:getstatic       #343 <Field Clipper$PolyFillType Clipper$PolyFillType.POSITIVE>
	//   28   55:invokevirtual   #346 <Method boolean DefaultClipper.execute(Clipper$ClipType, Paths, Clipper$PolyFillType, Clipper$PolyFillType)>
	//   29   58:pop             
		} else
	//*  30   59:return          
		{
			LongRect longrect = destPolys.getBounds();
	//   31   60:aload_0         
	//   32   61:getfield        #128 <Field Paths destPolys>
	//   33   64:invokevirtual   #350 <Method LongRect Paths.getBounds()>
	//   34   67:astore          5
			Path path = new Path(4);
	//   35   69:new             #88  <Class Path>
	//   36   72:dup             
	//   37   73:iconst_4        
	//   38   74:invokespecial   #351 <Method void Path(int)>
	//   39   77:astore          6
			path.add(((Object) (new Point.LongPoint(longrect.left - 10L, longrect.bottom + 10L, 0L))));
	//   40   79:aload           6
	//   41   81:new             #53  <Class Point$LongPoint>
	//   42   84:dup             
	//   43   85:aload           5
	//   44   87:getfield        #357 <Field long LongRect.left>
	//   45   90:ldc2w           #358 <Long 10L>
	//   46   93:lsub            
	//   47   94:aload           5
	//   48   96:getfield        #362 <Field long LongRect.bottom>
	//   49   99:ldc2w           #358 <Long 10L>
	//   50  102:ladd            
	//   51  103:lconst_0        
	//   52  104:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//   53  107:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   54  110:pop             
			path.add(((Object) (new Point.LongPoint(longrect.right + 10L, longrect.bottom + 10L, 0L))));
	//   55  111:aload           6
	//   56  113:new             #53  <Class Point$LongPoint>
	//   57  116:dup             
	//   58  117:aload           5
	//   59  119:getfield        #365 <Field long LongRect.right>
	//   60  122:ldc2w           #358 <Long 10L>
	//   61  125:ladd            
	//   62  126:aload           5
	//   63  128:getfield        #362 <Field long LongRect.bottom>
	//   64  131:ldc2w           #358 <Long 10L>
	//   65  134:ladd            
	//   66  135:lconst_0        
	//   67  136:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//   68  139:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   69  142:pop             
			path.add(((Object) (new Point.LongPoint(longrect.right + 10L, longrect.top - 10L, 0L))));
	//   70  143:aload           6
	//   71  145:new             #53  <Class Point$LongPoint>
	//   72  148:dup             
	//   73  149:aload           5
	//   74  151:getfield        #365 <Field long LongRect.right>
	//   75  154:ldc2w           #358 <Long 10L>
	//   76  157:ladd            
	//   77  158:aload           5
	//   78  160:getfield        #368 <Field long LongRect.top>
	//   79  163:ldc2w           #358 <Long 10L>
	//   80  166:lsub            
	//   81  167:lconst_0        
	//   82  168:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//   83  171:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   84  174:pop             
			path.add(((Object) (new Point.LongPoint(longrect.left - 10L, longrect.top - 10L, 0L))));
	//   85  175:aload           6
	//   86  177:new             #53  <Class Point$LongPoint>
	//   87  180:dup             
	//   88  181:aload           5
	//   89  183:getfield        #357 <Field long LongRect.left>
	//   90  186:ldc2w           #358 <Long 10L>
	//   91  189:lsub            
	//   92  190:aload           5
	//   93  192:getfield        #368 <Field long LongRect.top>
	//   94  195:ldc2w           #358 <Long 10L>
	//   95  198:lsub            
	//   96  199:lconst_0        
	//   97  200:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//   98  203:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   99  206:pop             
			defaultclipper.addPath(path, Clipper.PolyType.SUBJECT, true);
	//  100  207:aload           4
	//  101  209:aload           6
	//  102  211:getstatic       #328 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//  103  214:iconst_1        
	//  104  215:invokevirtual   #371 <Method boolean DefaultClipper.addPath(Path, Clipper$PolyType, boolean)>
	//  105  218:pop             
			defaultclipper.execute(Clipper.ClipType.UNION, paths, Clipper.PolyFillType.NEGATIVE, Clipper.PolyFillType.NEGATIVE);
	//  106  219:aload           4
	//  107  221:getstatic       #337 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//  108  224:aload_1         
	//  109  225:getstatic       #374 <Field Clipper$PolyFillType Clipper$PolyFillType.NEGATIVE>
	//  110  228:getstatic       #374 <Field Clipper$PolyFillType Clipper$PolyFillType.NEGATIVE>
	//  111  231:invokevirtual   #346 <Method boolean DefaultClipper.execute(Clipper$ClipType, Paths, Clipper$PolyFillType, Clipper$PolyFillType)>
	//  112  234:pop             
			if(paths.size() > 0)
	//* 113  235:aload_1         
	//* 114  236:invokevirtual   #375 <Method int Paths.size()>
	//* 115  239:ifle            59
			{
				paths.remove(0);
	//  116  242:aload_1         
	//  117  243:iconst_0        
	//  118  244:invokevirtual   #378 <Method Object Paths.remove(int)>
	//  119  247:pop             
				return;
	//  120  248:return          
			}
		}
	}

	public void execute(PolyTree polytree, double d)
	{
		polytree.Clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #384 <Method void PolyTree.Clear()>
		fixOrientations();
	//    2    4:aload_0         
	//    3    5:invokespecial   #315 <Method void fixOrientations()>
		doOffset(d);
	//    4    8:aload_0         
	//    5    9:dload_2         
	//    6   10:invokespecial   #317 <Method void doOffset(double)>
		DefaultClipper defaultclipper = new DefaultClipper(1);
	//    7   13:new             #319 <Class DefaultClipper>
	//    8   16:dup             
	//    9   17:iconst_1        
	//   10   18:invokespecial   #322 <Method void DefaultClipper(int)>
	//   11   21:astore          5
		defaultclipper.addPaths(destPolys, Clipper.PolyType.SUBJECT, true);
	//   12   23:aload           5
	//   13   25:aload_0         
	//   14   26:getfield        #128 <Field Paths destPolys>
	//   15   29:getstatic       #328 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #331 <Method boolean DefaultClipper.addPaths(Paths, Clipper$PolyType, boolean)>
	//   18   36:pop             
		if(d > 0.0D)
	//*  19   37:dload_2         
	//*  20   38:dconst_0        
	//*  21   39:dcmpl           
	//*  22   40:ifle            60
		{
			defaultclipper.execute(Clipper.ClipType.UNION, polytree, Clipper.PolyFillType.POSITIVE, Clipper.PolyFillType.POSITIVE);
	//   23   43:aload           5
	//   24   45:getstatic       #337 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//   25   48:aload_1         
	//   26   49:getstatic       #343 <Field Clipper$PolyFillType Clipper$PolyFillType.POSITIVE>
	//   27   52:getstatic       #343 <Field Clipper$PolyFillType Clipper$PolyFillType.POSITIVE>
	//   28   55:invokevirtual   #387 <Method boolean DefaultClipper.execute(Clipper$ClipType, PolyTree, Clipper$PolyFillType, Clipper$PolyFillType)>
	//   29   58:pop             
		} else
	//*  30   59:return          
		{
			LongRect longrect = destPolys.getBounds();
	//   31   60:aload_0         
	//   32   61:getfield        #128 <Field Paths destPolys>
	//   33   64:invokevirtual   #350 <Method LongRect Paths.getBounds()>
	//   34   67:astore          6
			Path path = new Path(4);
	//   35   69:new             #88  <Class Path>
	//   36   72:dup             
	//   37   73:iconst_4        
	//   38   74:invokespecial   #351 <Method void Path(int)>
	//   39   77:astore          7
			path.add(((Object) (new Point.LongPoint(longrect.left - 10L, longrect.bottom + 10L, 0L))));
	//   40   79:aload           7
	//   41   81:new             #53  <Class Point$LongPoint>
	//   42   84:dup             
	//   43   85:aload           6
	//   44   87:getfield        #357 <Field long LongRect.left>
	//   45   90:ldc2w           #358 <Long 10L>
	//   46   93:lsub            
	//   47   94:aload           6
	//   48   96:getfield        #362 <Field long LongRect.bottom>
	//   49   99:ldc2w           #358 <Long 10L>
	//   50  102:ladd            
	//   51  103:lconst_0        
	//   52  104:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//   53  107:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   54  110:pop             
			path.add(((Object) (new Point.LongPoint(longrect.right + 10L, longrect.bottom + 10L, 0L))));
	//   55  111:aload           7
	//   56  113:new             #53  <Class Point$LongPoint>
	//   57  116:dup             
	//   58  117:aload           6
	//   59  119:getfield        #365 <Field long LongRect.right>
	//   60  122:ldc2w           #358 <Long 10L>
	//   61  125:ladd            
	//   62  126:aload           6
	//   63  128:getfield        #362 <Field long LongRect.bottom>
	//   64  131:ldc2w           #358 <Long 10L>
	//   65  134:ladd            
	//   66  135:lconst_0        
	//   67  136:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//   68  139:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   69  142:pop             
			path.add(((Object) (new Point.LongPoint(longrect.right + 10L, longrect.top - 10L, 0L))));
	//   70  143:aload           7
	//   71  145:new             #53  <Class Point$LongPoint>
	//   72  148:dup             
	//   73  149:aload           6
	//   74  151:getfield        #365 <Field long LongRect.right>
	//   75  154:ldc2w           #358 <Long 10L>
	//   76  157:ladd            
	//   77  158:aload           6
	//   78  160:getfield        #368 <Field long LongRect.top>
	//   79  163:ldc2w           #358 <Long 10L>
	//   80  166:lsub            
	//   81  167:lconst_0        
	//   82  168:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//   83  171:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   84  174:pop             
			path.add(((Object) (new Point.LongPoint(longrect.left - 10L, longrect.top - 10L, 0L))));
	//   85  175:aload           7
	//   86  177:new             #53  <Class Point$LongPoint>
	//   87  180:dup             
	//   88  181:aload           6
	//   89  183:getfield        #357 <Field long LongRect.left>
	//   90  186:ldc2w           #358 <Long 10L>
	//   91  189:lsub            
	//   92  190:aload           6
	//   93  192:getfield        #368 <Field long LongRect.top>
	//   94  195:ldc2w           #358 <Long 10L>
	//   95  198:lsub            
	//   96  199:lconst_0        
	//   97  200:invokespecial   #228 <Method void Point$LongPoint(long, long, long)>
	//   98  203:invokevirtual   #122 <Method boolean Path.add(Object)>
	//   99  206:pop             
			defaultclipper.addPath(path, Clipper.PolyType.SUBJECT, true);
	//  100  207:aload           5
	//  101  209:aload           7
	//  102  211:getstatic       #328 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//  103  214:iconst_1        
	//  104  215:invokevirtual   #371 <Method boolean DefaultClipper.addPath(Path, Clipper$PolyType, boolean)>
	//  105  218:pop             
			defaultclipper.execute(Clipper.ClipType.UNION, polytree, Clipper.PolyFillType.NEGATIVE, Clipper.PolyFillType.NEGATIVE);
	//  106  219:aload           5
	//  107  221:getstatic       #337 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//  108  224:aload_1         
	//  109  225:getstatic       #374 <Field Clipper$PolyFillType Clipper$PolyFillType.NEGATIVE>
	//  110  228:getstatic       #374 <Field Clipper$PolyFillType Clipper$PolyFillType.NEGATIVE>
	//  111  231:invokevirtual   #387 <Method boolean DefaultClipper.execute(Clipper$ClipType, PolyTree, Clipper$PolyFillType, Clipper$PolyFillType)>
	//  112  234:pop             
			if(polytree.getChildCount() == 1 && ((PolyNode)polytree.getChilds().get(0)).getChildCount() > 0)
	//* 113  235:aload_1         
	//* 114  236:invokevirtual   #388 <Method int PolyTree.getChildCount()>
	//* 115  239:iconst_1        
	//* 116  240:icmpne          357
	//* 117  243:aload_1         
	//* 118  244:invokevirtual   #389 <Method List PolyTree.getChilds()>
	//* 119  247:iconst_0        
	//* 120  248:invokeinterface #99  <Method Object List.get(int)>
	//* 121  253:checkcast       #70  <Class PolyNode>
	//* 122  256:invokevirtual   #136 <Method int PolyNode.getChildCount()>
	//* 123  259:ifle            357
			{
				PolyNode polynode = (PolyNode)polytree.getChilds().get(0);
	//  124  262:aload_1         
	//  125  263:invokevirtual   #389 <Method List PolyTree.getChilds()>
	//  126  266:iconst_0        
	//  127  267:invokeinterface #99  <Method Object List.get(int)>
	//  128  272:checkcast       #70  <Class PolyNode>
	//  129  275:astore          5
				polytree.getChilds().set(0, polynode.getChilds().get(0));
	//  130  277:aload_1         
	//  131  278:invokevirtual   #389 <Method List PolyTree.getChilds()>
	//  132  281:iconst_0        
	//  133  282:aload           5
	//  134  284:invokevirtual   #140 <Method List PolyNode.getChilds()>
	//  135  287:iconst_0        
	//  136  288:invokeinterface #99  <Method Object List.get(int)>
	//  137  293:invokeinterface #219 <Method Object List.set(int, Object)>
	//  138  298:pop             
				((PolyNode)polytree.getChilds().get(0)).setParent(((PolyNode) (polytree)));
	//  139  299:aload_1         
	//  140  300:invokevirtual   #389 <Method List PolyTree.getChilds()>
	//  141  303:iconst_0        
	//  142  304:invokeinterface #99  <Method Object List.get(int)>
	//  143  309:checkcast       #70  <Class PolyNode>
	//  144  312:aload_1         
	//  145  313:invokevirtual   #392 <Method void PolyNode.setParent(PolyNode)>
				int i = 1;
	//  146  316:iconst_1        
	//  147  317:istore          4
				while(i < polynode.getChildCount()) 
	//* 148  319:iload           4
	//* 149  321:aload           5
	//* 150  323:invokevirtual   #136 <Method int PolyNode.getChildCount()>
	//* 151  326:icmpge          59
				{
					polytree.addChild((PolyNode)polynode.getChilds().get(i));
	//  152  329:aload_1         
	//  153  330:aload           5
	//  154  332:invokevirtual   #140 <Method List PolyNode.getChilds()>
	//  155  335:iload           4
	//  156  337:invokeinterface #99  <Method Object List.get(int)>
	//  157  342:checkcast       #70  <Class PolyNode>
	//  158  345:invokevirtual   #393 <Method void PolyTree.addChild(PolyNode)>
					i++;
	//  159  348:iload           4
	//  160  350:iconst_1        
	//  161  351:iadd            
	//  162  352:istore          4
				}
			} else
	//* 163  354:goto            319
			{
				polytree.Clear();
	//  164  357:aload_1         
	//  165  358:invokevirtual   #384 <Method void PolyTree.Clear()>
				return;
	//  166  361:return          
			}
		}
	}

	private static final double DEFAULT_ARC_TOLERANCE = 0.25D;
	private static final double TOLERANCE = 9.9999999999999995E-21D;
	private static final double TWO_PI = 6.2831853071795862D;
	private final double arcTolerance;
	private double cos;
	private double delta;
	private Path destPoly;
	private Paths destPolys;
	private double inA;
	private Point.LongPoint lowest;
	private double miterLim;
	private final double miterLimit;
	private final List normals;
	private final PolyNode polyNodes;
	private double sin;
	private Path srcPoly;
	private double stepsPerRad;
}
