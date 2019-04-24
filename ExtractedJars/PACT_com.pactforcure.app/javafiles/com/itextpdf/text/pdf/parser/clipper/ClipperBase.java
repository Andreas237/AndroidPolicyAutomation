// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Clipper, Edge, Path, Point, 
//			Paths

public abstract class ClipperBase
	implements Clipper
{
	protected class LocalMinima
	{

		Edge leftBound;
		LocalMinima next;
		Edge rightBound;
		final ClipperBase this$0;
		long y;

		protected LocalMinima()
		{
			this$0 = ClipperBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field ClipperBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
		//    5    9:return          
		}
	}

	protected class Scanbeam
	{

		Scanbeam next;
		final ClipperBase this$0;
		long y;

		protected Scanbeam()
		{
			this$0 = ClipperBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ClipperBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}


	protected ClipperBase(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		preserveCollinear = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #54  <Field boolean preserveCollinear>
		minimaList = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #56  <Field ClipperBase$LocalMinima minimaList>
		currentLM = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #58  <Field ClipperBase$LocalMinima currentLM>
		hasOpenPaths = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #60  <Field boolean hasOpenPaths>
	//   14   24:aload_0         
	//   15   25:new             #62  <Class ArrayList>
	//   16   28:dup             
	//   17   29:invokespecial   #63  <Method void ArrayList()>
	//   18   32:putfield        #65  <Field List edges>
	//   19   35:return          
	}

	private void disposeLocalMinimaList()
	{
		LocalMinima localminima;
		for(; minimaList != null; minimaList = localminima)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field ClipperBase$LocalMinima minimaList>
	//*   2    4:ifnull          28
		{
			localminima = minimaList.next;
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field ClipperBase$LocalMinima minimaList>
	//    5   11:getfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//    6   14:astore_1        
			minimaList = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #56  <Field ClipperBase$LocalMinima minimaList>
		}

	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #56  <Field ClipperBase$LocalMinima minimaList>
	//*  13   25:goto            0
		currentLM = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #58  <Field ClipperBase$LocalMinima currentLM>
	//   17   33:return          
	}

	private static void initEdge(Edge edge, Edge edge1, Edge edge2, Point.LongPoint longpoint)
	{
		edge.next = edge1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field Edge Edge.next>
		edge.prev = edge2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #79  <Field Edge Edge.prev>
		edge.setCurrent(new Point.LongPoint(longpoint));
	//    6   10:aload_0         
	//    7   11:new             #81  <Class Point$LongPoint>
	//    8   14:dup             
	//    9   15:aload_3         
	//   10   16:invokespecial   #84  <Method void Point$LongPoint(Point$LongPoint)>
	//   11   19:invokevirtual   #87  <Method void Edge.setCurrent(Point$LongPoint)>
		edge.outIdx = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #91  <Field int Edge.outIdx>
	//   15   27:return          
	}

	private static void initEdge2(Edge edge, Clipper.PolyType polytype)
	{
		if(edge.getCurrent().getY() >= edge.next.getCurrent().getY())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//*   2    4:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field Edge Edge.next>
	//*   5   11:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//*   6   14:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//*   7   17:lcmp            
	//*   8   18:iflt            64
		{
			edge.setBot(new Point.LongPoint(edge.getCurrent()));
	//    9   21:aload_0         
	//   10   22:new             #81  <Class Point$LongPoint>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//   14   30:invokespecial   #84  <Method void Point$LongPoint(Point$LongPoint)>
	//   15   33:invokevirtual   #104 <Method void Edge.setBot(Point$LongPoint)>
			edge.setTop(new Point.LongPoint(edge.next.getCurrent()));
	//   16   36:aload_0         
	//   17   37:new             #81  <Class Point$LongPoint>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:getfield        #76  <Field Edge Edge.next>
	//   21   45:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//   22   48:invokespecial   #84  <Method void Point$LongPoint(Point$LongPoint)>
	//   23   51:invokevirtual   #107 <Method void Edge.setTop(Point$LongPoint)>
		} else
	//*  24   54:aload_0         
	//*  25   55:invokevirtual   #110 <Method void Edge.updateDeltaX()>
	//*  26   58:aload_0         
	//*  27   59:aload_1         
	//*  28   60:putfield        #114 <Field Clipper$PolyType Edge.polyTyp>
	//*  29   63:return          
		{
			edge.setTop(new Point.LongPoint(edge.getCurrent()));
	//   30   64:aload_0         
	//   31   65:new             #81  <Class Point$LongPoint>
	//   32   68:dup             
	//   33   69:aload_0         
	//   34   70:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//   35   73:invokespecial   #84  <Method void Point$LongPoint(Point$LongPoint)>
	//   36   76:invokevirtual   #107 <Method void Edge.setTop(Point$LongPoint)>
			edge.setBot(new Point.LongPoint(edge.next.getCurrent()));
	//   37   79:aload_0         
	//   38   80:new             #81  <Class Point$LongPoint>
	//   39   83:dup             
	//   40   84:aload_0         
	//   41   85:getfield        #76  <Field Edge Edge.next>
	//   42   88:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//   43   91:invokespecial   #84  <Method void Point$LongPoint(Point$LongPoint)>
	//   44   94:invokevirtual   #104 <Method void Edge.setBot(Point$LongPoint)>
		}
		edge.updateDeltaX();
		edge.polyTyp = polytype;
	//*  45   97:goto            54
	}

	private void insertLocalMinima(LocalMinima localminima)
	{
		if(minimaList == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field ClipperBase$LocalMinima minimaList>
	//*   2    4:ifnonnull       13
		{
			minimaList = localminima;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #56  <Field ClipperBase$LocalMinima minimaList>
			return;
	//    6   12:return          
		}
		if(localminima.y >= minimaList.y)
	//*   7   13:aload_1         
	//*   8   14:getfield        #119 <Field long ClipperBase$LocalMinima.y>
	//*   9   17:aload_0         
	//*  10   18:getfield        #56  <Field ClipperBase$LocalMinima minimaList>
	//*  11   21:getfield        #119 <Field long ClipperBase$LocalMinima.y>
	//*  12   24:lcmp            
	//*  13   25:iflt            42
		{
			localminima.next = minimaList;
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #56  <Field ClipperBase$LocalMinima minimaList>
	//   17   33:putfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
			minimaList = localminima;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #56  <Field ClipperBase$LocalMinima minimaList>
			return;
	//   21   41:return          
		}
		LocalMinima localminima1;
		for(localminima1 = minimaList; localminima1.next != null && localminima.y < localminima1.next.y; localminima1 = localminima1.next);
	//   22   42:aload_0         
	//   23   43:getfield        #56  <Field ClipperBase$LocalMinima minimaList>
	//   24   46:astore_2        
	//   25   47:aload_2         
	//   26   48:getfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//   27   51:ifnull          77
	//   28   54:aload_1         
	//   29   55:getfield        #119 <Field long ClipperBase$LocalMinima.y>
	//   30   58:aload_2         
	//   31   59:getfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//   32   62:getfield        #119 <Field long ClipperBase$LocalMinima.y>
	//   33   65:lcmp            
	//   34   66:ifge            77
	//   35   69:aload_2         
	//   36   70:getfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//   37   73:astore_2        
	//*  38   74:goto            47
		localminima.next = localminima1.next;
	//   39   77:aload_1         
	//   40   78:aload_2         
	//   41   79:getfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//   42   82:putfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
		localminima1.next = localminima;
	//   43   85:aload_2         
	//   44   86:aload_1         
	//   45   87:putfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//   46   90:return          
	}

	protected static Path.OutRec parseFirstLeft(Path.OutRec outrec)
	{
		for(; outrec != null && outrec.getPoints() == null; outrec = outrec.firstLeft);
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:aload_0         
	//    3    5:invokevirtual   #127 <Method Path$OutPt Path$OutRec.getPoints()>
	//    4    8:ifnonnull       19
	//    5   11:aload_0         
	//    6   12:getfield        #131 <Field Path$OutRec Path$OutRec.firstLeft>
	//    7   15:astore_0        
	//*   8   16:goto            0
		return outrec;
	//    9   19:aload_0         
	//   10   20:areturn         
	}

	private Edge processBound(Edge edge, boolean flag)
	{
		Object obj;
		Object obj2;
		obj = ((Object) (edge));
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(((Edge) (obj)).outIdx == -2)
	//*   2    2:aload_3         
	//*   3    3:getfield        #91  <Field int Edge.outIdx>
	//*   4    6:bipush          -2
	//*   5    8:icmpne          254
		{
			Object obj1 = obj;
	//    6   11:aload_3         
	//    7   12:astore          4
			edge = ((Edge) (obj1));
	//    8   14:aload           4
	//    9   16:astore_1        
			Edge edge3;
			if(flag)
	//*  10   17:iload_2         
	//*  11   18:ifeq            87
			{
				do
				{
					edge = ((Edge) (obj1));
	//   12   21:aload           4
	//   13   23:astore_1        
					if(((Edge) (obj1)).getTop().getY() != ((Edge) (obj1)).next.getBot().getY())
						break;
	//   14   24:aload           4
	//   15   26:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//   16   29:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//   17   32:aload           4
	//   18   34:getfield        #76  <Field Edge Edge.next>
	//   19   37:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//   20   40:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//   21   43:lcmp            
	//   22   44:ifne            57
					obj1 = ((Object) (((Edge) (obj1)).next));
	//   23   47:aload           4
	//   24   49:getfield        #76  <Field Edge Edge.next>
	//   25   52:astore          4
				} while(true);
	//   26   54:goto            21
				do
				{
					edge3 = edge;
	//   27   57:aload_1         
	//   28   58:astore          5
					if(edge == obj)
						break;
	//   29   60:aload_1         
	//   30   61:aload_3         
	//   31   62:if_acmpeq       155
					edge3 = edge;
	//   32   65:aload_1         
	//   33   66:astore          5
					if(edge.deltaX != -3.4E+38D)
						break;
	//   34   68:aload_1         
	//   35   69:getfield        #143 <Field double Edge.deltaX>
	//   36   72:ldc2w           #144 <Double -3.4E+38D>
	//   37   75:dcmpl           
	//   38   76:ifne            155
					edge = edge.prev;
	//   39   79:aload_1         
	//   40   80:getfield        #79  <Field Edge Edge.prev>
	//   41   83:astore_1        
				} while(true);
	//   42   84:goto            57
			} else
			{
				Edge edge2;
				do
				{
					edge2 = edge;
	//   43   87:aload_1         
	//   44   88:astore          4
					if(edge.getTop().getY() != edge.prev.getBot().getY())
						break;
	//   45   90:aload_1         
	//   46   91:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//   47   94:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//   48   97:aload_1         
	//   49   98:getfield        #79  <Field Edge Edge.prev>
	//   50  101:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//   51  104:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//   52  107:lcmp            
	//   53  108:ifne            119
					edge = edge.prev;
	//   54  111:aload_1         
	//   55  112:getfield        #79  <Field Edge Edge.prev>
	//   56  115:astore_1        
				} while(true);
	//   57  116:goto            87
				do
				{
					edge3 = edge2;
	//   58  119:aload           4
	//   59  121:astore          5
					if(edge2 == obj)
						break;
	//   60  123:aload           4
	//   61  125:aload_3         
	//   62  126:if_acmpeq       155
					edge3 = edge2;
	//   63  129:aload           4
	//   64  131:astore          5
					if(edge2.deltaX != -3.4E+38D)
						break;
	//   65  133:aload           4
	//   66  135:getfield        #143 <Field double Edge.deltaX>
	//   67  138:ldc2w           #144 <Double -3.4E+38D>
	//   68  141:dcmpl           
	//   69  142:ifne            155
					edge2 = edge2.next;
	//   70  145:aload           4
	//   71  147:getfield        #76  <Field Edge Edge.next>
	//   72  150:astore          4
				} while(true);
	//   73  152:goto            119
			}
			if(edge3 == obj)
	//*  74  155:aload           5
	//*  75  157:aload_3         
	//*  76  158:if_acmpne       182
			{
				if(flag)
	//*  77  161:iload_2         
	//*  78  162:ifeq            173
					edge = edge3.next;
	//   79  165:aload           5
	//   80  167:getfield        #76  <Field Edge Edge.next>
	//   81  170:astore_1        
				else
	//*  82  171:aload_1         
	//*  83  172:areturn         
					edge = edge3.prev;
	//   84  173:aload           5
	//   85  175:getfield        #79  <Field Edge Edge.prev>
	//   86  178:astore_1        
			} else
	//*  87  179:goto            171
			{
				if(flag)
	//*  88  182:iload_2         
	//*  89  183:ifeq            246
					edge = ((Edge) (obj)).next;
	//   90  186:aload_3         
	//   91  187:getfield        #76  <Field Edge Edge.next>
	//   92  190:astore_1        
				else
	//*  93  191:new             #8   <Class ClipperBase$LocalMinima>
	//*  94  194:dup             
	//*  95  195:aload_0         
	//*  96  196:invokespecial   #148 <Method void ClipperBase$LocalMinima(ClipperBase)>
	//*  97  199:astore_3        
	//*  98  200:aload_3         
	//*  99  201:aconst_null     
	//* 100  202:putfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//* 101  205:aload_3         
	//* 102  206:aload_1         
	//* 103  207:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 104  210:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//* 105  213:putfield        #119 <Field long ClipperBase$LocalMinima.y>
	//* 106  216:aload_3         
	//* 107  217:aconst_null     
	//* 108  218:putfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//* 109  221:aload_3         
	//* 110  222:aload_1         
	//* 111  223:putfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
	//* 112  226:aload_1         
	//* 113  227:iconst_0        
	//* 114  228:putfield        #157 <Field int Edge.windDelta>
	//* 115  231:aload_0         
	//* 116  232:aload_1         
	//* 117  233:iload_2         
	//* 118  234:invokespecial   #159 <Method Edge processBound(Edge, boolean)>
	//* 119  237:astore_1        
	//* 120  238:aload_0         
	//* 121  239:aload_3         
	//* 122  240:invokespecial   #161 <Method void insertLocalMinima(ClipperBase$LocalMinima)>
	//* 123  243:goto            171
					edge = ((Edge) (obj)).prev;
	//  124  246:aload_3         
	//  125  247:getfield        #79  <Field Edge Edge.prev>
	//  126  250:astore_1        
				obj = ((Object) (new LocalMinima()));
				obj.next = null;
				obj.y = edge.getBot().getY();
				obj.leftBound = null;
				obj.rightBound = edge;
				edge.windDelta = 0;
				edge = processBound(edge, flag);
				insertLocalMinima(((LocalMinima) (obj)));
			}
			return edge;
		}
	//* 127  251:goto            191
		if(edge.deltaX == -3.4E+38D)
	//* 128  254:aload_1         
	//* 129  255:getfield        #143 <Field double Edge.deltaX>
	//* 130  258:ldc2w           #144 <Double -3.4E+38D>
	//* 131  261:dcmpl           
	//* 132  262:ifne            329
		{
			if(flag)
	//* 133  265:iload_2         
	//* 134  266:ifeq            377
				obj2 = ((Object) (edge.prev));
	//  135  269:aload_1         
	//  136  270:getfield        #79  <Field Edge Edge.prev>
	//  137  273:astore          4
			else
	//* 138  275:aload           4
	//* 139  277:getfield        #143 <Field double Edge.deltaX>
	//* 140  280:ldc2w           #144 <Double -3.4E+38D>
	//* 141  283:dcmpl           
	//* 142  284:ifne            386
	//* 143  287:aload           4
	//* 144  289:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 145  292:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 146  295:aload_1         
	//* 147  296:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 148  299:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 149  302:lcmp            
	//* 150  303:ifeq            329
	//* 151  306:aload           4
	//* 152  308:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 153  311:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 154  314:aload_1         
	//* 155  315:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 156  318:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 157  321:lcmp            
	//* 158  322:ifeq            329
	//* 159  325:aload_1         
	//* 160  326:invokevirtual   #167 <Method void Edge.reverseHorizontal()>
	//* 161  329:aload_3         
	//* 162  330:astore          4
	//* 163  332:iload_2         
	//* 164  333:ifeq            643
	//* 165  336:aload_3         
	//* 166  337:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 167  340:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//* 168  343:aload_3         
	//* 169  344:getfield        #76  <Field Edge Edge.next>
	//* 170  347:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 171  350:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//* 172  353:lcmp            
	//* 173  354:ifne            412
	//* 174  357:aload_3         
	//* 175  358:getfield        #76  <Field Edge Edge.next>
	//* 176  361:getfield        #91  <Field int Edge.outIdx>
	//* 177  364:bipush          -2
	//* 178  366:icmpeq          412
	//* 179  369:aload_3         
	//* 180  370:getfield        #76  <Field Edge Edge.next>
	//* 181  373:astore_3        
	//* 182  374:goto            336
				obj2 = ((Object) (edge.next));
	//  183  377:aload_1         
	//  184  378:getfield        #76  <Field Edge Edge.next>
	//  185  381:astore          4
			if(((Edge) (obj2)).deltaX == -3.4E+38D)
			{
				if(((Edge) (obj2)).getBot().getX() != edge.getBot().getX() && ((Edge) (obj2)).getTop().getX() != edge.getBot().getX())
					edge.reverseHorizontal();
			} else
	//* 186  383:goto            275
			if(((Edge) (obj2)).getBot().getX() != edge.getBot().getX())
	//* 187  386:aload           4
	//* 188  388:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 189  391:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 190  394:aload_1         
	//* 191  395:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 192  398:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 193  401:lcmp            
	//* 194  402:ifeq            329
				edge.reverseHorizontal();
	//  195  405:aload_1         
	//  196  406:invokevirtual   #167 <Method void Edge.reverseHorizontal()>
		}
		obj2 = obj;
		if(!flag) goto _L2; else goto _L1
_L1:
		for(; ((Edge) (obj)).getTop().getY() == ((Edge) (obj)).next.getBot().getY() && ((Edge) (obj)).next.outIdx != -2; obj = ((Object) (((Edge) (obj)).next)));
	//* 197  409:goto            329
		Object obj3 = obj;
	//  198  412:aload_3         
	//  199  413:astore          5
		obj2 = ((Object) (edge));
	//  200  415:aload_1         
	//  201  416:astore          4
		if(((Edge) (obj)).deltaX == -3.4E+38D)
	//* 202  418:aload_3         
	//* 203  419:getfield        #143 <Field double Edge.deltaX>
	//* 204  422:ldc2w           #144 <Double -3.4E+38D>
	//* 205  425:dcmpl           
	//* 206  426:ifne            516
		{
			obj3 = obj;
	//  207  429:aload_3         
	//  208  430:astore          5
			obj2 = ((Object) (edge));
	//  209  432:aload_1         
	//  210  433:astore          4
			if(((Edge) (obj)).next.outIdx != -2)
	//* 211  435:aload_3         
	//* 212  436:getfield        #76  <Field Edge Edge.next>
	//* 213  439:getfield        #91  <Field int Edge.outIdx>
	//* 214  442:bipush          -2
	//* 215  444:icmpeq          516
			{
				Object obj5;
				for(obj5 = obj; ((Edge) (obj5)).prev.deltaX == -3.4E+38D; obj5 = ((Object) (((Edge) (obj5)).prev)));
	//  216  447:aload_3         
	//  217  448:astore          6
	//  218  450:aload           6
	//  219  452:getfield        #79  <Field Edge Edge.prev>
	//  220  455:getfield        #143 <Field double Edge.deltaX>
	//  221  458:ldc2w           #144 <Double -3.4E+38D>
	//  222  461:dcmpl           
	//  223  462:ifne            475
	//  224  465:aload           6
	//  225  467:getfield        #79  <Field Edge Edge.prev>
	//  226  470:astore          6
	//* 227  472:goto            450
				obj3 = obj;
	//  228  475:aload_3         
	//  229  476:astore          5
				obj2 = ((Object) (edge));
	//  230  478:aload_1         
	//  231  479:astore          4
				if(((Edge) (obj5)).prev.getTop().getX() > ((Edge) (obj)).next.getTop().getX())
	//* 232  481:aload           6
	//* 233  483:getfield        #79  <Field Edge Edge.prev>
	//* 234  486:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 235  489:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 236  492:aload_3         
	//* 237  493:getfield        #76  <Field Edge Edge.next>
	//* 238  496:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 239  499:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 240  502:lcmp            
	//* 241  503:ifle            516
				{
					obj3 = ((Object) (((Edge) (obj5)).prev));
	//  242  506:aload           6
	//  243  508:getfield        #79  <Field Edge Edge.prev>
	//  244  511:astore          5
					obj2 = ((Object) (edge));
	//  245  513:aload_1         
	//  246  514:astore          4
				}
			}
		}
		for(; obj2 != obj3; obj2 = ((Object) (((Edge) (obj2)).next)))
	//* 247  516:aload           4
	//* 248  518:aload           5
	//* 249  520:if_acmpeq       589
		{
			obj2.nextInLML = ((Edge) (obj2)).next;
	//  250  523:aload           4
	//  251  525:aload           4
	//  252  527:getfield        #76  <Field Edge Edge.next>
	//  253  530:putfield        #170 <Field Edge Edge.nextInLML>
			if(((Edge) (obj2)).deltaX == -3.4E+38D && obj2 != edge && ((Edge) (obj2)).getBot().getX() != ((Edge) (obj2)).prev.getTop().getX())
	//* 254  533:aload           4
	//* 255  535:getfield        #143 <Field double Edge.deltaX>
	//* 256  538:ldc2w           #144 <Double -3.4E+38D>
	//* 257  541:dcmpl           
	//* 258  542:ifne            579
	//* 259  545:aload           4
	//* 260  547:aload_1         
	//* 261  548:if_acmpeq       579
	//* 262  551:aload           4
	//* 263  553:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 264  556:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 265  559:aload           4
	//* 266  561:getfield        #79  <Field Edge Edge.prev>
	//* 267  564:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 268  567:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 269  570:lcmp            
	//* 270  571:ifeq            579
				((Edge) (obj2)).reverseHorizontal();
	//  271  574:aload           4
	//  272  576:invokevirtual   #167 <Method void Edge.reverseHorizontal()>
		}

	//  273  579:aload           4
	//  274  581:getfield        #76  <Field Edge Edge.next>
	//  275  584:astore          4
	//* 276  586:goto            516
		if(((Edge) (obj2)).deltaX == -3.4E+38D && obj2 != edge && ((Edge) (obj2)).getBot().getX() != ((Edge) (obj2)).prev.getTop().getX())
	//* 277  589:aload           4
	//* 278  591:getfield        #143 <Field double Edge.deltaX>
	//* 279  594:ldc2w           #144 <Double -3.4E+38D>
	//* 280  597:dcmpl           
	//* 281  598:ifne            635
	//* 282  601:aload           4
	//* 283  603:aload_1         
	//* 284  604:if_acmpeq       635
	//* 285  607:aload           4
	//* 286  609:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 287  612:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 288  615:aload           4
	//* 289  617:getfield        #79  <Field Edge Edge.prev>
	//* 290  620:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 291  623:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 292  626:lcmp            
	//* 293  627:ifeq            635
			((Edge) (obj2)).reverseHorizontal();
	//  294  630:aload           4
	//  295  632:invokevirtual   #167 <Method void Edge.reverseHorizontal()>
		edge = ((Edge) (obj3)).next;
	//  296  635:aload           5
	//  297  637:getfield        #76  <Field Edge Edge.next>
	//  298  640:astore_1        
_L4:
		return edge;
	//  299  641:aload_1         
	//  300  642:areturn         
_L2:
		Edge edge1;
		Object obj4;
label0:
		{
			for(; ((Edge) (obj2)).getTop().getY() == ((Edge) (obj2)).prev.getBot().getY() && ((Edge) (obj2)).prev.outIdx != -2; obj2 = ((Object) (((Edge) (obj2)).prev)));
	//  301  643:aload           4
	//  302  645:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//  303  648:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//  304  651:aload           4
	//  305  653:getfield        #79  <Field Edge Edge.prev>
	//  306  656:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//  307  659:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//  308  662:lcmp            
	//  309  663:ifne            689
	//  310  666:aload           4
	//  311  668:getfield        #79  <Field Edge Edge.prev>
	//  312  671:getfield        #91  <Field int Edge.outIdx>
	//  313  674:bipush          -2
	//  314  676:icmpeq          689
	//  315  679:aload           4
	//  316  681:getfield        #79  <Field Edge Edge.prev>
	//  317  684:astore          4
	//* 318  686:goto            643
			obj4 = obj2;
	//  319  689:aload           4
	//  320  691:astore          5
			edge1 = edge;
	//  321  693:aload_1         
	//  322  694:astore_3        
			if(((Edge) (obj2)).deltaX != -3.4E+38D)
				break label0;
	//  323  695:aload           4
	//  324  697:getfield        #143 <Field double Edge.deltaX>
	//  325  700:ldc2w           #144 <Double -3.4E+38D>
	//  326  703:dcmpl           
	//  327  704:ifne            822
			obj4 = obj2;
	//  328  707:aload           4
	//  329  709:astore          5
			edge1 = edge;
	//  330  711:aload_1         
	//  331  712:astore_3        
			if(((Edge) (obj2)).prev.outIdx == -2)
				break label0;
	//  332  713:aload           4
	//  333  715:getfield        #79  <Field Edge Edge.prev>
	//  334  718:getfield        #91  <Field int Edge.outIdx>
	//  335  721:bipush          -2
	//  336  723:icmpeq          822
			Object obj6;
			for(obj6 = obj2; ((Edge) (obj6)).next.deltaX == -3.4E+38D; obj6 = ((Object) (((Edge) (obj6)).next)));
	//  337  726:aload           4
	//  338  728:astore          6
	//  339  730:aload           6
	//  340  732:getfield        #76  <Field Edge Edge.next>
	//  341  735:getfield        #143 <Field double Edge.deltaX>
	//  342  738:ldc2w           #144 <Double -3.4E+38D>
	//  343  741:dcmpl           
	//  344  742:ifne            755
	//  345  745:aload           6
	//  346  747:getfield        #76  <Field Edge Edge.next>
	//  347  750:astore          6
	//* 348  752:goto            730
			if(((Edge) (obj6)).next.getTop().getX() != ((Edge) (obj2)).prev.getTop().getX())
	//* 349  755:aload           6
	//* 350  757:getfield        #76  <Field Edge Edge.next>
	//* 351  760:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 352  763:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 353  766:aload           4
	//* 354  768:getfield        #79  <Field Edge Edge.prev>
	//* 355  771:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 356  774:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 357  777:lcmp            
	//* 358  778:ifeq            813
			{
				obj4 = obj2;
	//  359  781:aload           4
	//  360  783:astore          5
				edge1 = edge;
	//  361  785:aload_1         
	//  362  786:astore_3        
				if(((Edge) (obj6)).next.getTop().getX() <= ((Edge) (obj2)).prev.getTop().getX())
					break label0;
	//  363  787:aload           6
	//  364  789:getfield        #76  <Field Edge Edge.next>
	//  365  792:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//  366  795:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//  367  798:aload           4
	//  368  800:getfield        #79  <Field Edge Edge.prev>
	//  369  803:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//  370  806:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//  371  809:lcmp            
	//  372  810:ifle            822
			}
			obj4 = ((Object) (((Edge) (obj6)).next));
	//  373  813:aload           6
	//  374  815:getfield        #76  <Field Edge Edge.next>
	//  375  818:astore          5
		}
		for(edge1 = edge; edge1 != obj4; edge1 = edge1.prev)
	//* 376  820:aload_1         
	//* 377  821:astore_3        
	//* 378  822:aload_3         
	//* 379  823:aload           5
	//* 380  825:if_acmpeq       885
		{
			edge1.nextInLML = edge1.prev;
	//  381  828:aload_3         
	//  382  829:aload_3         
	//  383  830:getfield        #79  <Field Edge Edge.prev>
	//  384  833:putfield        #170 <Field Edge Edge.nextInLML>
			if(edge1.deltaX == -3.4E+38D && edge1 != edge && edge1.getBot().getX() != edge1.next.getTop().getX())
	//* 385  836:aload_3         
	//* 386  837:getfield        #143 <Field double Edge.deltaX>
	//* 387  840:ldc2w           #144 <Double -3.4E+38D>
	//* 388  843:dcmpl           
	//* 389  844:ifne            877
	//* 390  847:aload_3         
	//* 391  848:aload_1         
	//* 392  849:if_acmpeq       877
	//* 393  852:aload_3         
	//* 394  853:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 395  856:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 396  859:aload_3         
	//* 397  860:getfield        #76  <Field Edge Edge.next>
	//* 398  863:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 399  866:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 400  869:lcmp            
	//* 401  870:ifeq            877
				edge1.reverseHorizontal();
	//  402  873:aload_3         
	//  403  874:invokevirtual   #167 <Method void Edge.reverseHorizontal()>
		}

	//  404  877:aload_3         
	//  405  878:getfield        #79  <Field Edge Edge.prev>
	//  406  881:astore_3        
	//* 407  882:goto            822
		if(edge1.deltaX == -3.4E+38D && edge1 != edge && edge1.getBot().getX() != edge1.next.getTop().getX())
	//* 408  885:aload_3         
	//* 409  886:getfield        #143 <Field double Edge.deltaX>
	//* 410  889:ldc2w           #144 <Double -3.4E+38D>
	//* 411  892:dcmpl           
	//* 412  893:ifne            926
	//* 413  896:aload_3         
	//* 414  897:aload_1         
	//* 415  898:if_acmpeq       926
	//* 416  901:aload_3         
	//* 417  902:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 418  905:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 419  908:aload_3         
	//* 420  909:getfield        #76  <Field Edge Edge.next>
	//* 421  912:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 422  915:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 423  918:lcmp            
	//* 424  919:ifeq            926
			edge1.reverseHorizontal();
	//  425  922:aload_3         
	//  426  923:invokevirtual   #167 <Method void Edge.reverseHorizontal()>
		edge = ((Edge) (obj4)).prev;
	//  427  926:aload           5
	//  428  928:getfield        #79  <Field Edge Edge.prev>
	//  429  931:astore_1        
		if(true) goto _L4; else goto _L3
	//  430  932:goto            641
_L3:
	}

	private static boolean rangeTest(Point.LongPoint longpoint, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            60
		{
			if(longpoint.getX() > 0xffffffffL || longpoint.getY() > 0xffffffffL || -longpoint.getX() > 0xffffffffL || -longpoint.getY() > 0xffffffffL)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//*   4    8:ldc2w           #15  <Long 0xffffffffL>
	//*   5   11:lcmp            
	//*   6   12:ifgt            50
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//*   9   19:ldc2w           #15  <Long 0xffffffffL>
	//*  10   22:lcmp            
	//*  11   23:ifgt            50
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//*  14   30:lneg            
	//*  15   31:ldc2w           #15  <Long 0xffffffffL>
	//*  16   34:lcmp            
	//*  17   35:ifgt            50
	//*  18   38:aload_0         
	//*  19   39:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//*  20   42:lneg            
	//*  21   43:ldc2w           #15  <Long 0xffffffffL>
	//*  22   46:lcmp            
	//*  23   47:ifle            112
				throw new IllegalStateException("Coordinate outside allowed range");
	//   24   50:new             #174 <Class IllegalStateException>
	//   25   53:dup             
	//   26   54:ldc1            #176 <String "Coordinate outside allowed range">
	//   27   56:invokespecial   #179 <Method void IllegalStateException(String)>
	//   28   59:athrow          
		} else
		if(longpoint.getX() > 0x3fffffffL || longpoint.getY() > 0x3fffffffL || -longpoint.getX() > 0x3fffffffL || -longpoint.getY() > 0x3fffffffL)
	//*  29   60:aload_0         
	//*  30   61:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//*  31   64:ldc2w           #20  <Long 0x3fffffffL>
	//*  32   67:lcmp            
	//*  33   68:ifgt            106
	//*  34   71:aload_0         
	//*  35   72:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//*  36   75:ldc2w           #20  <Long 0x3fffffffL>
	//*  37   78:lcmp            
	//*  38   79:ifgt            106
	//*  39   82:aload_0         
	//*  40   83:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//*  41   86:lneg            
	//*  42   87:ldc2w           #20  <Long 0x3fffffffL>
	//*  43   90:lcmp            
	//*  44   91:ifgt            106
	//*  45   94:aload_0         
	//*  46   95:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//*  47   98:lneg            
	//*  48   99:ldc2w           #20  <Long 0x3fffffffL>
	//*  49  102:lcmp            
	//*  50  103:ifle            112
			flag = rangeTest(longpoint, true);
	//   51  106:aload_0         
	//   52  107:iconst_1        
	//   53  108:invokestatic    #181 <Method boolean rangeTest(Point$LongPoint, boolean)>
	//   54  111:istore_1        
		return flag;
	//   55  112:iload_1         
	//   56  113:ireturn         
	}

	private static Edge removeEdge(Edge edge)
	{
		edge.prev.next = edge.next;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Edge Edge.prev>
	//    2    4:aload_0         
	//    3    5:getfield        #76  <Field Edge Edge.next>
	//    4    8:putfield        #76  <Field Edge Edge.next>
		edge.next.prev = edge.prev;
	//    5   11:aload_0         
	//    6   12:getfield        #76  <Field Edge Edge.next>
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field Edge Edge.prev>
	//    9   19:putfield        #79  <Field Edge Edge.prev>
		Edge edge1 = edge.next;
	//   10   22:aload_0         
	//   11   23:getfield        #76  <Field Edge Edge.next>
	//   12   26:astore_1        
		edge.prev = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #79  <Field Edge Edge.prev>
		return edge1;
	//   16   32:aload_1         
	//   17   33:areturn         
	}

	public boolean addPath(Path path, Clipper.PolyType polytype, boolean flag)
	{
		int j;
		Edge edge;
		Object obj1;
		ArrayList arraylist;
		if(!flag && polytype == Clipper.PolyType.CLIP)
	//*   0    0:iload_3         
	//*   1    1:ifne            21
	//*   2    4:aload_2         
	//*   3    5:getstatic       #190 <Field Clipper$PolyType Clipper$PolyType.CLIP>
	//*   4    8:if_acmpne       21
			throw new IllegalStateException("AddPath: Open paths must be subject.");
	//    5   11:new             #174 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc1            #192 <String "AddPath: Open paths must be subject.">
	//    8   17:invokespecial   #179 <Method void IllegalStateException(String)>
	//    9   20:athrow          
		j = path.size() - 1;
	//   10   21:aload_1         
	//   11   22:invokevirtual   #198 <Method int Path.size()>
	//   12   25:iconst_1        
	//   13   26:isub            
	//   14   27:istore          5
		int i = j;
	//   15   29:iload           5
	//   16   31:istore          4
		if(flag)
	//*  17   33:iload_3         
	//*  18   34:ifeq            79
			do
			{
				i = j;
	//   19   37:iload           5
	//   20   39:istore          4
				if(j <= 0)
					break;
	//   21   41:iload           5
	//   22   43:ifle            79
				i = j;
	//   23   46:iload           5
	//   24   48:istore          4
				if(!((Point.LongPoint)path.get(j)).equals(path.get(0)))
					break;
	//   25   50:aload_1         
	//   26   51:iload           5
	//   27   53:invokevirtual   #202 <Method Object Path.get(int)>
	//   28   56:checkcast       #81  <Class Point$LongPoint>
	//   29   59:aload_1         
	//   30   60:iconst_0        
	//   31   61:invokevirtual   #202 <Method Object Path.get(int)>
	//   32   64:invokevirtual   #206 <Method boolean Point$LongPoint.equals(Object)>
	//   33   67:ifeq            79
				j--;
	//   34   70:iload           5
	//   35   72:iconst_1        
	//   36   73:isub            
	//   37   74:istore          5
			} while(true);
	//   38   76:goto            37
		for(; i > 0 && ((Point.LongPoint)path.get(i)).equals(path.get(i - 1)); i--);
	//   39   79:iload           4
	//   40   81:ifle            116
	//   41   84:aload_1         
	//   42   85:iload           4
	//   43   87:invokevirtual   #202 <Method Object Path.get(int)>
	//   44   90:checkcast       #81  <Class Point$LongPoint>
	//   45   93:aload_1         
	//   46   94:iload           4
	//   47   96:iconst_1        
	//   48   97:isub            
	//   49   98:invokevirtual   #202 <Method Object Path.get(int)>
	//   50  101:invokevirtual   #206 <Method boolean Point$LongPoint.equals(Object)>
	//   51  104:ifeq            116
	//   52  107:iload           4
	//   53  109:iconst_1        
	//   54  110:isub            
	//   55  111:istore          4
	//*  56  113:goto            79
		if(flag && i < 2 || !flag && i < 1)
	//*  57  116:iload_3         
	//*  58  117:ifeq            126
	//*  59  120:iload           4
	//*  60  122:iconst_2        
	//*  61  123:icmplt          136
	//*  62  126:iload_3         
	//*  63  127:ifne            138
	//*  64  130:iload           4
	//*  65  132:iconst_1        
	//*  66  133:icmpge          138
			return false;
	//   67  136:iconst_0        
	//   68  137:ireturn         
		arraylist = new ArrayList(i + 1);
	//   69  138:new             #62  <Class ArrayList>
	//   70  141:dup             
	//   71  142:iload           4
	//   72  144:iconst_1        
	//   73  145:iadd            
	//   74  146:invokespecial   #209 <Method void ArrayList(int)>
	//   75  149:astore          12
		for(j = 0; j <= i; j++)
	//*  76  151:iconst_0        
	//*  77  152:istore          5
	//*  78  154:iload           5
	//*  79  156:iload           4
	//*  80  158:icmpgt          185
			((List) (arraylist)).add(((Object) (new Edge())));
	//   81  161:aload           12
	//   82  163:new             #73  <Class Edge>
	//   83  166:dup             
	//   84  167:invokespecial   #210 <Method void Edge()>
	//   85  170:invokeinterface #215 <Method boolean List.add(Object)>
	//   86  175:pop             

	//   87  176:iload           5
	//   88  178:iconst_1        
	//   89  179:iadd            
	//   90  180:istore          5
	//*  91  182:goto            154
		j = 1;
	//   92  185:iconst_1        
	//   93  186:istore          5
		((Edge)((List) (arraylist)).get(1)).setCurrent(new Point.LongPoint((Point.LongPoint)path.get(1)));
	//   94  188:aload           12
	//   95  190:iconst_1        
	//   96  191:invokeinterface #216 <Method Object List.get(int)>
	//   97  196:checkcast       #73  <Class Edge>
	//   98  199:new             #81  <Class Point$LongPoint>
	//   99  202:dup             
	//  100  203:aload_1         
	//  101  204:iconst_1        
	//  102  205:invokevirtual   #202 <Method Object Path.get(int)>
	//  103  208:checkcast       #81  <Class Point$LongPoint>
	//  104  211:invokespecial   #84  <Method void Point$LongPoint(Point$LongPoint)>
	//  105  214:invokevirtual   #87  <Method void Edge.setCurrent(Point$LongPoint)>
		useFullRange = rangeTest((Point.LongPoint)path.get(0), useFullRange);
	//  106  217:aload_0         
	//  107  218:aload_1         
	//  108  219:iconst_0        
	//  109  220:invokevirtual   #202 <Method Object Path.get(int)>
	//  110  223:checkcast       #81  <Class Point$LongPoint>
	//  111  226:aload_0         
	//  112  227:getfield        #218 <Field boolean useFullRange>
	//  113  230:invokestatic    #181 <Method boolean rangeTest(Point$LongPoint, boolean)>
	//  114  233:putfield        #218 <Field boolean useFullRange>
		useFullRange = rangeTest((Point.LongPoint)path.get(i), useFullRange);
	//  115  236:aload_0         
	//  116  237:aload_1         
	//  117  238:iload           4
	//  118  240:invokevirtual   #202 <Method Object Path.get(int)>
	//  119  243:checkcast       #81  <Class Point$LongPoint>
	//  120  246:aload_0         
	//  121  247:getfield        #218 <Field boolean useFullRange>
	//  122  250:invokestatic    #181 <Method boolean rangeTest(Point$LongPoint, boolean)>
	//  123  253:putfield        #218 <Field boolean useFullRange>
		initEdge((Edge)((List) (arraylist)).get(0), (Edge)((List) (arraylist)).get(1), (Edge)((List) (arraylist)).get(i), (Point.LongPoint)path.get(0));
	//  124  256:aload           12
	//  125  258:iconst_0        
	//  126  259:invokeinterface #216 <Method Object List.get(int)>
	//  127  264:checkcast       #73  <Class Edge>
	//  128  267:aload           12
	//  129  269:iconst_1        
	//  130  270:invokeinterface #216 <Method Object List.get(int)>
	//  131  275:checkcast       #73  <Class Edge>
	//  132  278:aload           12
	//  133  280:iload           4
	//  134  282:invokeinterface #216 <Method Object List.get(int)>
	//  135  287:checkcast       #73  <Class Edge>
	//  136  290:aload_1         
	//  137  291:iconst_0        
	//  138  292:invokevirtual   #202 <Method Object Path.get(int)>
	//  139  295:checkcast       #81  <Class Point$LongPoint>
	//  140  298:invokestatic    #220 <Method void initEdge(Edge, Edge, Edge, Point$LongPoint)>
		initEdge((Edge)((List) (arraylist)).get(i), (Edge)((List) (arraylist)).get(0), (Edge)((List) (arraylist)).get(i - 1), (Point.LongPoint)path.get(i));
	//  141  301:aload           12
	//  142  303:iload           4
	//  143  305:invokeinterface #216 <Method Object List.get(int)>
	//  144  310:checkcast       #73  <Class Edge>
	//  145  313:aload           12
	//  146  315:iconst_0        
	//  147  316:invokeinterface #216 <Method Object List.get(int)>
	//  148  321:checkcast       #73  <Class Edge>
	//  149  324:aload           12
	//  150  326:iload           4
	//  151  328:iconst_1        
	//  152  329:isub            
	//  153  330:invokeinterface #216 <Method Object List.get(int)>
	//  154  335:checkcast       #73  <Class Edge>
	//  155  338:aload_1         
	//  156  339:iload           4
	//  157  341:invokevirtual   #202 <Method Object Path.get(int)>
	//  158  344:checkcast       #81  <Class Point$LongPoint>
	//  159  347:invokestatic    #220 <Method void initEdge(Edge, Edge, Edge, Point$LongPoint)>
		for(i--; i >= 1; i--)
	//* 160  350:iload           4
	//* 161  352:iconst_1        
	//* 162  353:isub            
	//* 163  354:istore          4
	//* 164  356:iload           4
	//* 165  358:iconst_1        
	//* 166  359:icmplt          443
		{
			useFullRange = rangeTest((Point.LongPoint)path.get(i), useFullRange);
	//  167  362:aload_0         
	//  168  363:aload_1         
	//  169  364:iload           4
	//  170  366:invokevirtual   #202 <Method Object Path.get(int)>
	//  171  369:checkcast       #81  <Class Point$LongPoint>
	//  172  372:aload_0         
	//  173  373:getfield        #218 <Field boolean useFullRange>
	//  174  376:invokestatic    #181 <Method boolean rangeTest(Point$LongPoint, boolean)>
	//  175  379:putfield        #218 <Field boolean useFullRange>
			initEdge((Edge)((List) (arraylist)).get(i), (Edge)((List) (arraylist)).get(i + 1), (Edge)((List) (arraylist)).get(i - 1), (Point.LongPoint)path.get(i));
	//  176  382:aload           12
	//  177  384:iload           4
	//  178  386:invokeinterface #216 <Method Object List.get(int)>
	//  179  391:checkcast       #73  <Class Edge>
	//  180  394:aload           12
	//  181  396:iload           4
	//  182  398:iconst_1        
	//  183  399:iadd            
	//  184  400:invokeinterface #216 <Method Object List.get(int)>
	//  185  405:checkcast       #73  <Class Edge>
	//  186  408:aload           12
	//  187  410:iload           4
	//  188  412:iconst_1        
	//  189  413:isub            
	//  190  414:invokeinterface #216 <Method Object List.get(int)>
	//  191  419:checkcast       #73  <Class Edge>
	//  192  422:aload_1         
	//  193  423:iload           4
	//  194  425:invokevirtual   #202 <Method Object Path.get(int)>
	//  195  428:checkcast       #81  <Class Point$LongPoint>
	//  196  431:invokestatic    #220 <Method void initEdge(Edge, Edge, Edge, Point$LongPoint)>
		}

	//  197  434:iload           4
	//  198  436:iconst_1        
	//  199  437:isub            
	//  200  438:istore          4
	//* 201  440:goto            356
		edge = (Edge)((List) (arraylist)).get(0);
	//  202  443:aload           12
	//  203  445:iconst_0        
	//  204  446:invokeinterface #216 <Method Object List.get(int)>
	//  205  451:checkcast       #73  <Class Edge>
	//  206  454:astore          8
		path = ((Path) (edge));
	//  207  456:aload           8
	//  208  458:astore_1        
		obj1 = ((Object) (edge));
	//  209  459:aload           8
	//  210  461:astore          9
_L8:
		if(!((Edge) (path)).getCurrent().equals(((Object) (((Edge) (path)).next.getCurrent()))) || !flag && ((Object) (((Edge) (path)).next)).equals(((Object) (edge)))) goto _L2; else goto _L1
	//  211  463:aload_1         
	//  212  464:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//  213  467:aload_1         
	//  214  468:getfield        #76  <Field Edge Edge.next>
	//  215  471:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//  216  474:invokevirtual   #206 <Method boolean Point$LongPoint.equals(Object)>
	//  217  477:ifeq            571
	//  218  480:iload_3         
	//  219  481:ifne            496
	//  220  484:aload_1         
	//  221  485:getfield        #76  <Field Edge Edge.next>
	//  222  488:aload           8
	//  223  490:invokevirtual   #221 <Method boolean Object.equals(Object)>
	//  224  493:ifne            571
_L1:
		if(path != ((Edge) (path)).next) goto _L4; else goto _L3
	//  225  496:aload_1         
	//  226  497:aload_1         
	//  227  498:getfield        #76  <Field Edge Edge.next>
	//  228  501:if_acmpne       540
_L3:
		Object obj2 = ((Object) (path));
	//  229  504:aload_1         
	//  230  505:astore          10
_L6:
		if(!flag && obj2 == ((Edge) (obj2)).next || flag && ((Edge) (obj2)).prev == ((Edge) (obj2)).next)
	//* 231  507:iload_3         
	//* 232  508:ifne            521
	//* 233  511:aload           10
	//* 234  513:aload           10
	//* 235  515:getfield        #76  <Field Edge Edge.next>
	//* 236  518:if_acmpeq       538
	//* 237  521:iload_3         
	//* 238  522:ifeq            726
	//* 239  525:aload           10
	//* 240  527:getfield        #79  <Field Edge Edge.prev>
	//* 241  530:aload           10
	//* 242  532:getfield        #76  <Field Edge Edge.next>
	//* 243  535:if_acmpne       726
			return false;
	//  244  538:iconst_0        
	//  245  539:ireturn         
		break; /* Loop/switch isn't completed */
_L4:
		obj2 = ((Object) (edge));
	//  246  540:aload           8
	//  247  542:astore          10
		if(path == edge)
	//* 248  544:aload_1         
	//* 249  545:aload           8
	//* 250  547:if_acmpne       556
			obj2 = ((Object) (((Edge) (path)).next));
	//  251  550:aload_1         
	//  252  551:getfield        #76  <Field Edge Edge.next>
	//  253  554:astore          10
		path = ((Path) (removeEdge(((Edge) (path)))));
	//  254  556:aload_1         
	//  255  557:invokestatic    #223 <Method Edge removeEdge(Edge)>
	//  256  560:astore_1        
		obj1 = ((Object) (path));
	//  257  561:aload_1         
	//  258  562:astore          9
		edge = ((Edge) (obj2));
	//  259  564:aload           10
	//  260  566:astore          8
		continue; /* Loop/switch isn't completed */
	//  261  568:goto            463
_L2:
		obj2 = ((Object) (path));
	//  262  571:aload_1         
	//  263  572:astore          10
		if(((Edge) (path)).prev != ((Edge) (path)).next)
	//* 264  574:aload_1         
	//* 265  575:getfield        #79  <Field Edge Edge.prev>
	//* 266  578:aload_1         
	//* 267  579:getfield        #76  <Field Edge Edge.next>
	//* 268  582:if_acmpeq       507
		{
			if(flag && Point.slopesEqual(((Edge) (path)).prev.getCurrent(), ((Edge) (path)).getCurrent(), ((Edge) (path)).next.getCurrent(), useFullRange) && (!isPreserveCollinear() || !Point.isPt2BetweenPt1AndPt3(((Edge) (path)).prev.getCurrent(), ((Edge) (path)).getCurrent(), ((Edge) (path)).next.getCurrent())))
	//* 269  585:iload_3         
	//* 270  586:ifeq            682
	//* 271  589:aload_1         
	//* 272  590:getfield        #79  <Field Edge Edge.prev>
	//* 273  593:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//* 274  596:aload_1         
	//* 275  597:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//* 276  600:aload_1         
	//* 277  601:getfield        #76  <Field Edge Edge.next>
	//* 278  604:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//* 279  607:aload_0         
	//* 280  608:getfield        #218 <Field boolean useFullRange>
	//* 281  611:invokestatic    #229 <Method boolean Point.slopesEqual(Point$LongPoint, Point$LongPoint, Point$LongPoint, boolean)>
	//* 282  614:ifeq            682
	//* 283  617:aload_0         
	//* 284  618:invokevirtual   #233 <Method boolean isPreserveCollinear()>
	//* 285  621:ifeq            648
	//* 286  624:aload_1         
	//* 287  625:getfield        #79  <Field Edge Edge.prev>
	//* 288  628:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//* 289  631:aload_1         
	//* 290  632:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//* 291  635:aload_1         
	//* 292  636:getfield        #76  <Field Edge Edge.next>
	//* 293  639:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//* 294  642:invokestatic    #237 <Method boolean Point.isPt2BetweenPt1AndPt3(Point$LongPoint, Point$LongPoint, Point$LongPoint)>
	//* 295  645:ifne            682
			{
				obj2 = ((Object) (edge));
	//  296  648:aload           8
	//  297  650:astore          10
				if(path == edge)
	//* 298  652:aload_1         
	//* 299  653:aload           8
	//* 300  655:if_acmpne       664
					obj2 = ((Object) (((Edge) (path)).next));
	//  301  658:aload_1         
	//  302  659:getfield        #76  <Field Edge Edge.next>
	//  303  662:astore          10
				path = ((Path) (removeEdge(((Edge) (path))).prev));
	//  304  664:aload_1         
	//  305  665:invokestatic    #223 <Method Edge removeEdge(Edge)>
	//  306  668:getfield        #79  <Field Edge Edge.prev>
	//  307  671:astore_1        
				obj1 = ((Object) (path));
	//  308  672:aload_1         
	//  309  673:astore          9
				edge = ((Edge) (obj2));
	//  310  675:aload           10
	//  311  677:astore          8
				continue; /* Loop/switch isn't completed */
	//  312  679:goto            463
			}
			Edge edge3 = ((Edge) (path)).next;
	//  313  682:aload_1         
	//  314  683:getfield        #76  <Field Edge Edge.next>
	//  315  686:astore          11
			obj2 = ((Object) (edge3));
	//  316  688:aload           11
	//  317  690:astore          10
			if(edge3 != obj1)
	//* 318  692:aload           11
	//* 319  694:aload           9
	//* 320  696:if_acmpeq       507
			{
				path = ((Path) (edge3));
	//  321  699:aload           11
	//  322  701:astore_1        
				if(flag)
					continue; /* Loop/switch isn't completed */
	//  323  702:iload_3         
	//  324  703:ifne            463
				path = ((Path) (edge3));
	//  325  706:aload           11
	//  326  708:astore_1        
				if(edge3.next != edge)
					continue; /* Loop/switch isn't completed */
	//  327  709:aload           11
	//  328  711:getfield        #76  <Field Edge Edge.next>
	//  329  714:aload           8
	//  330  716:if_acmpne       463
				obj2 = ((Object) (edge3));
	//  331  719:aload           11
	//  332  721:astore          10
			}
		}
		if(true) goto _L6; else goto _L5
	//  333  723:goto            507
_L5:
		if(!flag)
	//* 334  726:iload_3         
	//* 335  727:ifne            745
		{
			hasOpenPaths = true;
	//  336  730:aload_0         
	//  337  731:iconst_1        
	//  338  732:putfield        #60  <Field boolean hasOpenPaths>
			edge.prev.outIdx = -2;
	//  339  735:aload           8
	//  340  737:getfield        #79  <Field Edge Edge.prev>
	//  341  740:bipush          -2
	//  342  742:putfield        #91  <Field int Edge.outIdx>
		}
		path = ((Path) (edge));
	//  343  745:aload           8
	//  344  747:astore_1        
		boolean flag1 = ((boolean) (j));
	//  345  748:iload           5
	//  346  750:istore          4
		boolean flag2;
		Edge edge1;
		do
		{
			initEdge2(((Edge) (path)), polytype);
	//  347  752:aload_1         
	//  348  753:aload_2         
	//  349  754:invokestatic    #239 <Method void initEdge2(Edge, Clipper$PolyType)>
			edge1 = ((Edge) (path)).next;
	//  350  757:aload_1         
	//  351  758:getfield        #76  <Field Edge Edge.next>
	//  352  761:astore          9
			flag2 = flag1;
	//  353  763:iload           4
	//  354  765:istore          5
			if(flag1)
	//* 355  767:iload           4
	//* 356  769:ifeq            799
			{
				flag2 = flag1;
	//  357  772:iload           4
	//  358  774:istore          5
				if(edge1.getCurrent().getY() != edge.getCurrent().getY())
	//* 359  776:aload           9
	//* 360  778:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//* 361  781:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//* 362  784:aload           8
	//* 363  786:invokevirtual   #97  <Method Point$LongPoint Edge.getCurrent()>
	//* 364  789:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//* 365  792:lcmp            
	//* 366  793:ifeq            799
					flag2 = false;
	//  367  796:iconst_0        
	//  368  797:istore          5
			}
			flag1 = flag2;
	//  369  799:iload           5
	//  370  801:istore          4
			path = ((Path) (edge1));
	//  371  803:aload           9
	//  372  805:astore_1        
		} while(edge1 != edge);
	//  373  806:aload           9
	//  374  808:aload           8
	//  375  810:if_acmpne       752
		if(flag2)
	//* 376  813:iload           5
	//* 377  815:ifeq            969
		{
			if(flag)
	//* 378  818:iload_3         
	//* 379  819:ifeq            824
				return false;
	//  380  822:iconst_0        
	//  381  823:ireturn         
			edge1.prev.outIdx = -2;
	//  382  824:aload           9
	//  383  826:getfield        #79  <Field Edge Edge.prev>
	//  384  829:bipush          -2
	//  385  831:putfield        #91  <Field int Edge.outIdx>
			path = ((Path) (new LocalMinima()));
	//  386  834:new             #8   <Class ClipperBase$LocalMinima>
	//  387  837:dup             
	//  388  838:aload_0         
	//  389  839:invokespecial   #148 <Method void ClipperBase$LocalMinima(ClipperBase)>
	//  390  842:astore_1        
			path.next = null;
	//  391  843:aload_1         
	//  392  844:aconst_null     
	//  393  845:putfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
			path.y = edge1.getBot().getY();
	//  394  848:aload_1         
	//  395  849:aload           9
	//  396  851:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//  397  854:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//  398  857:putfield        #119 <Field long ClipperBase$LocalMinima.y>
			path.leftBound = null;
	//  399  860:aload_1         
	//  400  861:aconst_null     
	//  401  862:putfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
			path.rightBound = edge1;
	//  402  865:aload_1         
	//  403  866:aload           9
	//  404  868:putfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
			((LocalMinima) (path)).rightBound.side = Edge.Side.RIGHT;
	//  405  871:aload_1         
	//  406  872:getfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
	//  407  875:getstatic       #245 <Field Edge$Side Edge$Side.RIGHT>
	//  408  878:putfield        #248 <Field Edge$Side Edge.side>
			((LocalMinima) (path)).rightBound.windDelta = 0;
	//  409  881:aload_1         
	//  410  882:getfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
	//  411  885:iconst_0        
	//  412  886:putfield        #157 <Field int Edge.windDelta>
			do
			{
				if(edge1.getBot().getX() != edge1.prev.getTop().getX())
	//* 413  889:aload           9
	//* 414  891:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 415  894:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 416  897:aload           9
	//* 417  899:getfield        #79  <Field Edge Edge.prev>
	//* 418  902:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 419  905:invokevirtual   #164 <Method long Point$LongPoint.getX()>
	//* 420  908:lcmp            
	//* 421  909:ifeq            917
					edge1.reverseHorizontal();
	//  422  912:aload           9
	//  423  914:invokevirtual   #167 <Method void Edge.reverseHorizontal()>
				if(edge1.next.outIdx == -2)
	//* 424  917:aload           9
	//* 425  919:getfield        #76  <Field Edge Edge.next>
	//* 426  922:getfield        #91  <Field int Edge.outIdx>
	//* 427  925:bipush          -2
	//* 428  927:icmpne          949
				{
					insertLocalMinima(((LocalMinima) (path)));
	//  429  930:aload_0         
	//  430  931:aload_1         
	//  431  932:invokespecial   #161 <Method void insertLocalMinima(ClipperBase$LocalMinima)>
					edges.add(((Object) (arraylist)));
	//  432  935:aload_0         
	//  433  936:getfield        #65  <Field List edges>
	//  434  939:aload           12
	//  435  941:invokeinterface #215 <Method boolean List.add(Object)>
	//  436  946:pop             
					return true;
	//  437  947:iconst_1        
	//  438  948:ireturn         
				}
				edge1.nextInLML = edge1.next;
	//  439  949:aload           9
	//  440  951:aload           9
	//  441  953:getfield        #76  <Field Edge Edge.next>
	//  442  956:putfield        #170 <Field Edge Edge.nextInLML>
				edge1 = edge1.next;
	//  443  959:aload           9
	//  444  961:getfield        #76  <Field Edge Edge.next>
	//  445  964:astore          9
			} while(true);
	//  446  966:goto            889
		}
		edges.add(((Object) (arraylist)));
	//  447  969:aload_0         
	//  448  970:getfield        #65  <Field List edges>
	//  449  973:aload           12
	//  450  975:invokeinterface #215 <Method boolean List.add(Object)>
	//  451  980:pop             
		polytype = null;
	//  452  981:aconst_null     
	//  453  982:astore_2        
		Object obj3 = ((Object) (polytype));
	//  454  983:aload_2         
	//  455  984:astore          10
		path = ((Path) (edge1));
	//  456  986:aload           9
	//  457  988:astore_1        
		if(edge1.prev.getBot().equals(((Object) (edge1.prev.getTop()))))
	//* 458  989:aload           9
	//* 459  991:getfield        #79  <Field Edge Edge.prev>
	//* 460  994:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//* 461  997:aload           9
	//* 462  999:getfield        #79  <Field Edge Edge.prev>
	//* 463 1002:invokevirtual   #136 <Method Point$LongPoint Edge.getTop()>
	//* 464 1005:invokevirtual   #206 <Method boolean Point$LongPoint.equals(Object)>
	//* 465 1008:ifeq            1020
		{
			path = ((Path) (edge1.next));
	//  466 1011:aload           9
	//  467 1013:getfield        #76  <Field Edge Edge.next>
	//  468 1016:astore_1        
			obj3 = ((Object) (polytype));
	//  469 1017:aload_2         
	//  470 1018:astore          10
		}
		do
		{
			path = ((Path) (((Edge) (path)).findNextLocMin()));
	//  471 1020:aload_1         
	//  472 1021:invokevirtual   #252 <Method Edge Edge.findNextLocMin()>
	//  473 1024:astore_1        
			if(path == obj3)
	//* 474 1025:aload_1         
	//* 475 1026:aload           10
	//* 476 1028:if_acmpne       1033
				return true;
	//  477 1031:iconst_1        
	//  478 1032:ireturn         
			Object obj = obj3;
	//  479 1033:aload           10
	//  480 1035:astore          8
			if(obj3 == null)
	//* 481 1037:aload           10
	//* 482 1039:ifnonnull       1045
				obj = ((Object) (path));
	//  483 1042:aload_1         
	//  484 1043:astore          8
			obj3 = ((Object) (new LocalMinima()));
	//  485 1045:new             #8   <Class ClipperBase$LocalMinima>
	//  486 1048:dup             
	//  487 1049:aload_0         
	//  488 1050:invokespecial   #148 <Method void ClipperBase$LocalMinima(ClipperBase)>
	//  489 1053:astore          10
			obj3.next = null;
	//  490 1055:aload           10
	//  491 1057:aconst_null     
	//  492 1058:putfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
			obj3.y = ((Edge) (path)).getBot().getY();
	//  493 1061:aload           10
	//  494 1063:aload_1         
	//  495 1064:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//  496 1067:invokevirtual   #101 <Method long Point$LongPoint.getY()>
	//  497 1070:putfield        #119 <Field long ClipperBase$LocalMinima.y>
			boolean flag3;
			boolean flag4;
			Edge edge2;
			if(((Edge) (path)).deltaX < ((Edge) (path)).prev.deltaX)
	//* 498 1073:aload_1         
	//* 499 1074:getfield        #143 <Field double Edge.deltaX>
	//* 500 1077:aload_1         
	//* 501 1078:getfield        #79  <Field Edge Edge.prev>
	//* 502 1081:getfield        #143 <Field double Edge.deltaX>
	//* 503 1084:dcmpg           
	//* 504 1085:ifge            1285
			{
				obj3.leftBound = ((Edge) (path)).prev;
	//  505 1088:aload           10
	//  506 1090:aload_1         
	//  507 1091:getfield        #79  <Field Edge Edge.prev>
	//  508 1094:putfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
				obj3.rightBound = ((Edge) (path));
	//  509 1097:aload           10
	//  510 1099:aload_1         
	//  511 1100:putfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
				flag3 = false;
	//  512 1103:iconst_0        
	//  513 1104:istore          6
			} else
	//* 514 1106:aload           10
	//* 515 1108:getfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//* 516 1111:getstatic       #255 <Field Edge$Side Edge$Side.LEFT>
	//* 517 1114:putfield        #248 <Field Edge$Side Edge.side>
	//* 518 1117:aload           10
	//* 519 1119:getfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
	//* 520 1122:getstatic       #245 <Field Edge$Side Edge$Side.RIGHT>
	//* 521 1125:putfield        #248 <Field Edge$Side Edge.side>
	//* 522 1128:iload_3         
	//* 523 1129:ifne            1306
	//* 524 1132:aload           10
	//* 525 1134:getfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//* 526 1137:iconst_0        
	//* 527 1138:putfield        #157 <Field int Edge.windDelta>
	//* 528 1141:aload           10
	//* 529 1143:getfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
	//* 530 1146:aload           10
	//* 531 1148:getfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//* 532 1151:getfield        #157 <Field int Edge.windDelta>
	//* 533 1154:ineg            
	//* 534 1155:putfield        #157 <Field int Edge.windDelta>
	//* 535 1158:aload_0         
	//* 536 1159:aload           10
	//* 537 1161:getfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//* 538 1164:iload           6
	//* 539 1166:invokespecial   #159 <Method Edge processBound(Edge, boolean)>
	//* 540 1169:astore_2        
	//* 541 1170:aload_2         
	//* 542 1171:astore_1        
	//* 543 1172:aload_2         
	//* 544 1173:getfield        #91  <Field int Edge.outIdx>
	//* 545 1176:bipush          -2
	//* 546 1178:icmpne          1189
	//* 547 1181:aload_0         
	//* 548 1182:aload_2         
	//* 549 1183:iload           6
	//* 550 1185:invokespecial   #159 <Method Edge processBound(Edge, boolean)>
	//* 551 1188:astore_1        
	//* 552 1189:aload           10
	//* 553 1191:getfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
	//* 554 1194:astore_2        
	//* 555 1195:iload           6
	//* 556 1197:ifne            1346
	//* 557 1200:iconst_1        
	//* 558 1201:istore          7
	//* 559 1203:aload_0         
	//* 560 1204:aload_2         
	//* 561 1205:iload           7
	//* 562 1207:invokespecial   #159 <Method Edge processBound(Edge, boolean)>
	//* 563 1210:astore          9
	//* 564 1212:aload           9
	//* 565 1214:astore_2        
	//* 566 1215:aload           9
	//* 567 1217:getfield        #91  <Field int Edge.outIdx>
	//* 568 1220:bipush          -2
	//* 569 1222:icmpne          1242
	//* 570 1225:iload           6
	//* 571 1227:ifne            1352
	//* 572 1230:iconst_1        
	//* 573 1231:istore          7
	//* 574 1233:aload_0         
	//* 575 1234:aload           9
	//* 576 1236:iload           7
	//* 577 1238:invokespecial   #159 <Method Edge processBound(Edge, boolean)>
	//* 578 1241:astore_2        
	//* 579 1242:aload           10
	//* 580 1244:getfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//* 581 1247:getfield        #91  <Field int Edge.outIdx>
	//* 582 1250:bipush          -2
	//* 583 1252:icmpne          1358
	//* 584 1255:aload           10
	//* 585 1257:aconst_null     
	//* 586 1258:putfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//* 587 1261:aload_0         
	//* 588 1262:aload           10
	//* 589 1264:invokespecial   #161 <Method void insertLocalMinima(ClipperBase$LocalMinima)>
	//* 590 1267:aload           8
	//* 591 1269:astore          10
	//* 592 1271:iload           6
	//* 593 1273:ifne            1020
	//* 594 1276:aload_2         
	//* 595 1277:astore_1        
	//* 596 1278:aload           8
	//* 597 1280:astore          10
	//* 598 1282:goto            1020
			{
				obj3.leftBound = ((Edge) (path));
	//  599 1285:aload           10
	//  600 1287:aload_1         
	//  601 1288:putfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
				obj3.rightBound = ((Edge) (path)).prev;
	//  602 1291:aload           10
	//  603 1293:aload_1         
	//  604 1294:getfield        #79  <Field Edge Edge.prev>
	//  605 1297:putfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
				flag3 = true;
	//  606 1300:iconst_1        
	//  607 1301:istore          6
			}
			((LocalMinima) (obj3)).leftBound.side = Edge.Side.LEFT;
			((LocalMinima) (obj3)).rightBound.side = Edge.Side.RIGHT;
			if(!flag)
				((LocalMinima) (obj3)).leftBound.windDelta = 0;
			else
	//* 608 1303:goto            1106
			if(((LocalMinima) (obj3)).leftBound.next == ((LocalMinima) (obj3)).rightBound)
	//* 609 1306:aload           10
	//* 610 1308:getfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//* 611 1311:getfield        #76  <Field Edge Edge.next>
	//* 612 1314:aload           10
	//* 613 1316:getfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
	//* 614 1319:if_acmpne       1334
				((LocalMinima) (obj3)).leftBound.windDelta = -1;
	//  615 1322:aload           10
	//  616 1324:getfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//  617 1327:iconst_m1       
	//  618 1328:putfield        #157 <Field int Edge.windDelta>
			else
	//* 619 1331:goto            1141
				((LocalMinima) (obj3)).leftBound.windDelta = 1;
	//  620 1334:aload           10
	//  621 1336:getfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//  622 1339:iconst_1        
	//  623 1340:putfield        #157 <Field int Edge.windDelta>
			((LocalMinima) (obj3)).rightBound.windDelta = -((LocalMinima) (obj3)).leftBound.windDelta;
			polytype = ((Clipper.PolyType) (processBound(((LocalMinima) (obj3)).leftBound, flag3)));
			path = ((Path) (polytype));
			if(((Edge) (polytype)).outIdx == -2)
				path = ((Path) (processBound(((Edge) (polytype)), flag3)));
			polytype = ((Clipper.PolyType) (((LocalMinima) (obj3)).rightBound));
			if(!flag3)
				flag4 = true;
			else
	//* 624 1343:goto            1141
				flag4 = false;
	//  625 1346:iconst_0        
	//  626 1347:istore          7
			edge2 = processBound(((Edge) (polytype)), flag4);
			polytype = ((Clipper.PolyType) (edge2));
			if(edge2.outIdx == -2)
			{
				if(!flag3)
					flag4 = true;
				else
	//* 627 1349:goto            1203
					flag4 = false;
	//  628 1352:iconst_0        
	//  629 1353:istore          7
				polytype = ((Clipper.PolyType) (processBound(edge2, flag4)));
			}
			if(((LocalMinima) (obj3)).leftBound.outIdx == -2)
				obj3.leftBound = null;
			else
	//* 630 1355:goto            1233
			if(((LocalMinima) (obj3)).rightBound.outIdx == -2)
	//* 631 1358:aload           10
	//* 632 1360:getfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
	//* 633 1363:getfield        #91  <Field int Edge.outIdx>
	//* 634 1366:bipush          -2
	//* 635 1368:icmpne          1261
				obj3.rightBound = null;
	//  636 1371:aload           10
	//  637 1373:aconst_null     
	//  638 1374:putfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
			insertLocalMinima(((LocalMinima) (obj3)));
			obj3 = obj;
			if(!flag3)
			{
				path = ((Path) (polytype));
				obj3 = obj;
			}
		} while(true);
	//  639 1377:goto            1261
		if(true) goto _L8; else goto _L7
_L7:
	}

	public boolean addPaths(Paths paths, Clipper.PolyType polytype, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		for(int i = 0; i < paths.size(); i++)
	//*   2    3:iconst_0        
	//*   3    4:istore          4
	//*   4    6:iload           4
	//*   5    8:aload_1         
	//*   6    9:invokevirtual   #260 <Method int Paths.size()>
	//*   7   12:icmpge          45
			if(addPath((Path)paths.get(i), polytype, flag))
	//*   8   15:aload_0         
	//*   9   16:aload_1         
	//*  10   17:iload           4
	//*  11   19:invokevirtual   #261 <Method Object Paths.get(int)>
	//*  12   22:checkcast       #194 <Class Path>
	//*  13   25:aload_2         
	//*  14   26:iload_3         
	//*  15   27:invokevirtual   #263 <Method boolean addPath(Path, Clipper$PolyType, boolean)>
	//*  16   30:ifeq            36
				flag1 = true;
	//   17   33:iconst_1        
	//   18   34:istore          5

	//   19   36:iload           4
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:istore          4
	//*  23   42:goto            6
		return flag1;
	//   24   45:iload           5
	//   25   47:ireturn         
	}

	public void clear()
	{
		disposeLocalMinimaList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method void disposeLocalMinimaList()>
		edges.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field List edges>
	//    4    8:invokeinterface #268 <Method void List.clear()>
		useFullRange = false;
	//    5   13:aload_0         
	//    6   14:iconst_0        
	//    7   15:putfield        #218 <Field boolean useFullRange>
		hasOpenPaths = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #60  <Field boolean hasOpenPaths>
	//   11   23:return          
	}

	public boolean isPreserveCollinear()
	{
		return preserveCollinear;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean preserveCollinear>
	//    2    4:ireturn         
	}

	protected void popLocalMinima()
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/ClipperBase)).getName(), "popLocalMinima");
	//    0    0:getstatic       #47  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class ClipperBase>
	//    2    5:invokevirtual   #39  <Method String Class.getName()>
	//    3    8:ldc2            #270 <String "popLocalMinima">
	//    4   11:invokevirtual   #274 <Method void Logger.entering(String, String)>
		if(currentLM == null)
	//*   5   14:aload_0         
	//*   6   15:getfield        #58  <Field ClipperBase$LocalMinima currentLM>
	//*   7   18:ifnonnull       22
		{
			return;
	//    8   21:return          
		} else
		{
			currentLM = currentLM.next;
	//    9   22:aload_0         
	//   10   23:aload_0         
	//   11   24:getfield        #58  <Field ClipperBase$LocalMinima currentLM>
	//   12   27:getfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//   13   30:putfield        #58  <Field ClipperBase$LocalMinima currentLM>
			return;
	//   14   33:return          
		}
	}

	protected void reset()
	{
		currentLM = minimaList;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field ClipperBase$LocalMinima minimaList>
	//    3    5:putfield        #58  <Field ClipperBase$LocalMinima currentLM>
		if(currentLM != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #58  <Field ClipperBase$LocalMinima currentLM>
	//*   6   12:ifnonnull       16
	//*   7   15:return          
		{
			LocalMinima localminima = minimaList;
	//    8   16:aload_0         
	//    9   17:getfield        #56  <Field ClipperBase$LocalMinima minimaList>
	//   10   20:astore_1        
			while(localminima != null) 
	//*  11   21:aload_1         
	//*  12   22:ifnull          15
			{
				Edge edge = localminima.leftBound;
	//   13   25:aload_1         
	//   14   26:getfield        #151 <Field Edge ClipperBase$LocalMinima.leftBound>
	//   15   29:astore_2        
				if(edge != null)
	//*  16   30:aload_2         
	//*  17   31:ifnull          61
				{
					edge.setCurrent(new Point.LongPoint(edge.getBot()));
	//   18   34:aload_2         
	//   19   35:new             #81  <Class Point$LongPoint>
	//   20   38:dup             
	//   21   39:aload_2         
	//   22   40:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//   23   43:invokespecial   #84  <Method void Point$LongPoint(Point$LongPoint)>
	//   24   46:invokevirtual   #87  <Method void Edge.setCurrent(Point$LongPoint)>
					edge.side = Edge.Side.LEFT;
	//   25   49:aload_2         
	//   26   50:getstatic       #255 <Field Edge$Side Edge$Side.LEFT>
	//   27   53:putfield        #248 <Field Edge$Side Edge.side>
					edge.outIdx = -1;
	//   28   56:aload_2         
	//   29   57:iconst_m1       
	//   30   58:putfield        #91  <Field int Edge.outIdx>
				}
				edge = localminima.rightBound;
	//   31   61:aload_1         
	//   32   62:getfield        #154 <Field Edge ClipperBase$LocalMinima.rightBound>
	//   33   65:astore_2        
				if(edge != null)
	//*  34   66:aload_2         
	//*  35   67:ifnull          97
				{
					edge.setCurrent(new Point.LongPoint(edge.getBot()));
	//   36   70:aload_2         
	//   37   71:new             #81  <Class Point$LongPoint>
	//   38   74:dup             
	//   39   75:aload_2         
	//   40   76:invokevirtual   #139 <Method Point$LongPoint Edge.getBot()>
	//   41   79:invokespecial   #84  <Method void Point$LongPoint(Point$LongPoint)>
	//   42   82:invokevirtual   #87  <Method void Edge.setCurrent(Point$LongPoint)>
					edge.side = Edge.Side.RIGHT;
	//   43   85:aload_2         
	//   44   86:getstatic       #245 <Field Edge$Side Edge$Side.RIGHT>
	//   45   89:putfield        #248 <Field Edge$Side Edge.side>
					edge.outIdx = -1;
	//   46   92:aload_2         
	//   47   93:iconst_m1       
	//   48   94:putfield        #91  <Field int Edge.outIdx>
				}
				localminima = localminima.next;
	//   49   97:aload_1         
	//   50   98:getfield        #69  <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//   51  101:astore_1        
			}
		}
	//*  52  102:goto            21
	}

	private static final long HI_RANGE = 0xffffffffL;
	private static final Logger LOGGER = Logger.getLogger(((Class) (com/itextpdf/text/pdf/parser/clipper/Clipper)).getName());
	private static final long LOW_RANGE = 0x3fffffffL;
	protected LocalMinima currentLM;
	private final List edges = new ArrayList();
	protected boolean hasOpenPaths;
	protected LocalMinima minimaList;
	protected final boolean preserveCollinear;
	protected boolean useFullRange;

	static 
	{
	//    0    0:ldc1            #6   <Class Clipper>
	//    1    2:invokevirtual   #39  <Method String Class.getName()>
	//    2    5:invokestatic    #45  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #47  <Field Logger LOGGER>
	//*   4   11:return          
	}
}
