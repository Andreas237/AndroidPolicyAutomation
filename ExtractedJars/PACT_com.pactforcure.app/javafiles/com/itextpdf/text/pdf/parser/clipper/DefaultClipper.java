// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.util.*;
import java.util.logging.Logger;

// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			ClipperBase, Edge, Paths, Path, 
//			PolyTree, PolyNode, Point

public class DefaultClipper extends ClipperBase
{
	private class IntersectNode
	{

		public Point.LongPoint getPt()
		{
			return pt;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Point$LongPoint pt>
		//    2    4:areturn         
		}

		public void setPt(Point.LongPoint longpoint)
		{
			pt = longpoint;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field Point$LongPoint pt>
		//    3    5:return          
		}

		Edge Edge2;
		Edge edge1;
		private Point.LongPoint pt;
		final DefaultClipper this$0;

		private IntersectNode()
		{
			this$0 = DefaultClipper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field DefaultClipper this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}

	}


	public DefaultClipper()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #63  <Method void DefaultClipper(int)>
	//    3    5:return          
	}

	public DefaultClipper(int i)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag;
		if((i & 4) != 0)
	//*   2    2:iload_1         
	//*   3    3:iconst_4        
	//*   4    4:iand            
	//*   5    5:ifeq            128
			flag = true;
	//    6    8:iconst_1        
	//    7    9:istore_2        
		else
	//*   8   10:aload_0         
	//*   9   11:iload_2         
	//*  10   12:invokespecial   #66  <Method void ClipperBase(boolean)>
	//*  11   15:aload_0         
	//*  12   16:aconst_null     
	//*  13   17:putfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//*  14   20:aload_0         
	//*  15   21:aconst_null     
	//*  16   22:putfield        #70  <Field Path$Maxima maxima>
	//*  17   25:aload_0         
	//*  18   26:aconst_null     
	//*  19   27:putfield        #72  <Field Edge activeEdges>
	//*  20   30:aload_0         
	//*  21   31:aconst_null     
	//*  22   32:putfield        #74  <Field Edge sortedEdges>
	//*  23   35:aload_0         
	//*  24   36:new             #76  <Class ArrayList>
	//*  25   39:dup             
	//*  26   40:invokespecial   #78  <Method void ArrayList()>
	//*  27   43:putfield        #80  <Field List intersectList>
	//*  28   46:aload_0         
	//*  29   47:new             #6   <Class DefaultClipper$1>
	//*  30   50:dup             
	//*  31   51:aload_0         
	//*  32   52:invokespecial   #83  <Method void DefaultClipper$1(DefaultClipper)>
	//*  33   55:putfield        #85  <Field Comparator intersectNodeComparer>
	//*  34   58:aload_0         
	//*  35   59:iconst_0        
	//*  36   60:putfield        #87  <Field boolean usingPolyTree>
	//*  37   63:aload_0         
	//*  38   64:new             #76  <Class ArrayList>
	//*  39   67:dup             
	//*  40   68:invokespecial   #78  <Method void ArrayList()>
	//*  41   71:putfield        #89  <Field List polyOuts>
	//*  42   74:aload_0         
	//*  43   75:new             #76  <Class ArrayList>
	//*  44   78:dup             
	//*  45   79:invokespecial   #78  <Method void ArrayList()>
	//*  46   82:putfield        #91  <Field List joins>
	//*  47   85:aload_0         
	//*  48   86:new             #76  <Class ArrayList>
	//*  49   89:dup             
	//*  50   90:invokespecial   #78  <Method void ArrayList()>
	//*  51   93:putfield        #93  <Field List ghostJoins>
	//*  52   96:iload_1         
	//*  53   97:iconst_1        
	//*  54   98:iand            
	//*  55   99:ifeq            133
	//*  56  102:iconst_1        
	//*  57  103:istore_2        
	//*  58  104:aload_0         
	//*  59  105:iload_2         
	//*  60  106:putfield        #95  <Field boolean reverseSolution>
	//*  61  109:iload_1         
	//*  62  110:iconst_2        
	//*  63  111:iand            
	//*  64  112:ifeq            138
	//*  65  115:iload_3         
	//*  66  116:istore_2        
	//*  67  117:aload_0         
	//*  68  118:iload_2         
	//*  69  119:putfield        #97  <Field boolean strictlySimple>
	//*  70  122:aload_0         
	//*  71  123:aconst_null     
	//*  72  124:putfield        #99  <Field Clipper$ZFillCallback zFillFunction>
	//*  73  127:return          
			flag = false;
	//   74  128:iconst_0        
	//   75  129:istore_2        
		super(flag);
		scanbeam = null;
		maxima = null;
		activeEdges = null;
		sortedEdges = null;
		intersectList = ((List) (new ArrayList()));
		intersectNodeComparer = new Comparator() {

			public int compare(IntersectNode intersectnode, IntersectNode intersectnode1)
			{
				long l = intersectnode1.getPt().getY() - intersectnode.getPt().getY();
			//    0    0:aload_2         
			//    1    1:invokevirtual   #29  <Method Point$LongPoint DefaultClipper$IntersectNode.getPt()>
			//    2    4:invokevirtual   #35  <Method long Point$LongPoint.getY()>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #29  <Method Point$LongPoint DefaultClipper$IntersectNode.getPt()>
			//    5   11:invokevirtual   #35  <Method long Point$LongPoint.getY()>
			//    6   14:lsub            
			//    7   15:lstore_3        
				if(l > 0L)
			//*   8   16:lload_3         
			//*   9   17:lconst_0        
			//*  10   18:lcmp            
			//*  11   19:ifle            24
					return 1;
			//   12   22:iconst_1        
			//   13   23:ireturn         
				return l >= 0L ? 0 : -1;
			//   14   24:lload_3         
			//   15   25:lconst_0        
			//   16   26:lcmp            
			//   17   27:ifge            32
			//   18   30:iconst_m1       
			//   19   31:ireturn         
			//   20   32:iconst_0        
			//   21   33:ireturn         
			}

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((IntersectNode)obj, (IntersectNode)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #25  <Class DefaultClipper$IntersectNode>
			//    3    5:aload_2         
			//    4    6:checkcast       #25  <Class DefaultClipper$IntersectNode>
			//    5    9:invokevirtual   #38  <Method int compare(DefaultClipper$IntersectNode, DefaultClipper$IntersectNode)>
			//    6   12:ireturn         
			}

			final DefaultClipper this$0;

			
			{
				this$0 = DefaultClipper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DefaultClipper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
		usingPolyTree = false;
		polyOuts = ((List) (new ArrayList()));
		joins = ((List) (new ArrayList()));
		ghostJoins = ((List) (new ArrayList()));
		if((i & 1) != 0)
			flag = true;
		else
	//*  76  130:goto            10
			flag = false;
	//   77  133:iconst_0        
	//   78  134:istore_2        
		reverseSolution = flag;
		if((i & 2) != 0)
			flag = flag1;
		else
	//*  79  135:goto            104
			flag = false;
	//   80  138:iconst_0        
	//   81  139:istore_2        
		strictlySimple = flag;
		zFillFunction = null;
	//*  82  140:goto            117
	}

	private boolean EdgesAdjacent(IntersectNode intersectnode)
	{
		return intersectnode.edge1.nextInSEL == intersectnode.Edge2 || intersectnode.edge1.prevInSEL == intersectnode.Edge2;
	//    0    0:aload_1         
	//    1    1:getfield        #104 <Field Edge DefaultClipper$IntersectNode.edge1>
	//    2    4:getfield        #109 <Field Edge Edge.nextInSEL>
	//    3    7:aload_1         
	//    4    8:getfield        #112 <Field Edge DefaultClipper$IntersectNode.Edge2>
	//    5   11:if_acmpeq       28
	//    6   14:aload_1         
	//    7   15:getfield        #104 <Field Edge DefaultClipper$IntersectNode.edge1>
	//    8   18:getfield        #115 <Field Edge Edge.prevInSEL>
	//    9   21:aload_1         
	//   10   22:getfield        #112 <Field Edge DefaultClipper$IntersectNode.Edge2>
	//   11   25:if_acmpne       30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	private Path.OutPt GetLastOutPt(Edge edge)
	{
		Path.OutRec outrec = (Path.OutRec)polyOuts.get(edge.outIdx);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field List polyOuts>
	//    2    4:aload_1         
	//    3    5:getfield        #121 <Field int Edge.outIdx>
	//    4    8:invokeinterface #127 <Method Object List.get(int)>
	//    5   13:checkcast       #129 <Class Path$OutRec>
	//    6   16:astore_2        
		if(edge.side == Edge.Side.LEFT)
	//*   7   17:aload_1         
	//*   8   18:getfield        #133 <Field Edge$Side Edge.side>
	//*   9   21:getstatic       #138 <Field Edge$Side Edge$Side.LEFT>
	//*  10   24:if_acmpne       32
			return outrec.pts;
	//   11   27:aload_2         
	//   12   28:getfield        #142 <Field Path$OutPt Path$OutRec.pts>
	//   13   31:areturn         
		else
			return outrec.pts.prev;
	//   14   32:aload_2         
	//   15   33:getfield        #142 <Field Path$OutPt Path$OutRec.pts>
	//   16   36:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   17   39:areturn         
	}

	private void InsertMaxima(long l)
	{
		Path.Maxima maxima2 = new Path.Maxima();
	//    0    0:new             #151 <Class Path$Maxima>
	//    1    3:dup             
	//    2    4:invokespecial   #152 <Method void Path$Maxima()>
	//    3    7:astore          4
		maxima2.X = l;
	//    4    9:aload           4
	//    5   11:lload_1         
	//    6   12:putfield        #156 <Field long Path$Maxima.X>
		if(maxima == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #70  <Field Path$Maxima maxima>
	//*   9   19:ifnonnull       45
		{
			maxima = maxima2;
	//   10   22:aload_0         
	//   11   23:aload           4
	//   12   25:putfield        #70  <Field Path$Maxima maxima>
			maxima.Next = null;
	//   13   28:aload_0         
	//   14   29:getfield        #70  <Field Path$Maxima maxima>
	//   15   32:aconst_null     
	//   16   33:putfield        #159 <Field Path$Maxima Path$Maxima.Next>
			maxima.Prev = null;
	//   17   36:aload_0         
	//   18   37:getfield        #70  <Field Path$Maxima maxima>
	//   19   40:aconst_null     
	//   20   41:putfield        #162 <Field Path$Maxima Path$Maxima.Prev>
		} else
	//*  21   44:return          
		{
			if(l < maxima.X)
	//*  22   45:lload_1         
	//*  23   46:aload_0         
	//*  24   47:getfield        #70  <Field Path$Maxima maxima>
	//*  25   50:getfield        #156 <Field long Path$Maxima.X>
	//*  26   53:lcmp            
	//*  27   54:ifge            79
			{
				maxima2.Next = maxima;
	//   28   57:aload           4
	//   29   59:aload_0         
	//   30   60:getfield        #70  <Field Path$Maxima maxima>
	//   31   63:putfield        #159 <Field Path$Maxima Path$Maxima.Next>
				maxima2.Prev = null;
	//   32   66:aload           4
	//   33   68:aconst_null     
	//   34   69:putfield        #162 <Field Path$Maxima Path$Maxima.Prev>
				maxima = maxima2;
	//   35   72:aload_0         
	//   36   73:aload           4
	//   37   75:putfield        #70  <Field Path$Maxima maxima>
				return;
	//   38   78:return          
			}
			Path.Maxima maxima1;
			for(maxima1 = maxima; maxima1.Next != null && l >= maxima1.Next.X; maxima1 = maxima1.Next);
	//   39   79:aload_0         
	//   40   80:getfield        #70  <Field Path$Maxima maxima>
	//   41   83:astore_3        
	//   42   84:aload_3         
	//   43   85:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//   44   88:ifnull          111
	//   45   91:lload_1         
	//   46   92:aload_3         
	//   47   93:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//   48   96:getfield        #156 <Field long Path$Maxima.X>
	//   49   99:lcmp            
	//   50  100:iflt            111
	//   51  103:aload_3         
	//   52  104:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//   53  107:astore_3        
	//*  54  108:goto            84
			if(l != maxima1.X)
	//*  55  111:lload_1         
	//*  56  112:aload_3         
	//*  57  113:getfield        #156 <Field long Path$Maxima.X>
	//*  58  116:lcmp            
	//*  59  117:ifeq            44
			{
				maxima2.Next = maxima1.Next;
	//   60  120:aload           4
	//   61  122:aload_3         
	//   62  123:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//   63  126:putfield        #159 <Field Path$Maxima Path$Maxima.Next>
				maxima2.Prev = maxima1;
	//   64  129:aload           4
	//   65  131:aload_3         
	//   66  132:putfield        #162 <Field Path$Maxima Path$Maxima.Prev>
				if(maxima1.Next != null)
	//*  67  135:aload_3         
	//*  68  136:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//*  69  139:ifnull          151
					maxima1.Next.Prev = maxima2;
	//   70  142:aload_3         
	//   71  143:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//   72  146:aload           4
	//   73  148:putfield        #162 <Field Path$Maxima Path$Maxima.Prev>
				maxima1.Next = maxima2;
	//   74  151:aload_3         
	//   75  152:aload           4
	//   76  154:putfield        #159 <Field Path$Maxima Path$Maxima.Next>
				return;
	//   77  157:return          
			}
		}
	}

	private void addEdgeToSEL(Edge edge)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "addEdgeToSEL");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc1            #165 <String "addEdgeToSEL">
	//    4   10:invokevirtual   #169 <Method void Logger.entering(String, String)>
		if(sortedEdges == null)
	//*   5   13:aload_0         
	//*   6   14:getfield        #74  <Field Edge sortedEdges>
	//*   7   17:ifnonnull       36
		{
			sortedEdges = edge;
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:putfield        #74  <Field Edge sortedEdges>
			edge.prevInSEL = null;
	//   11   25:aload_1         
	//   12   26:aconst_null     
	//   13   27:putfield        #115 <Field Edge Edge.prevInSEL>
			edge.nextInSEL = null;
	//   14   30:aload_1         
	//   15   31:aconst_null     
	//   16   32:putfield        #109 <Field Edge Edge.nextInSEL>
			return;
	//   17   35:return          
		} else
		{
			edge.nextInSEL = sortedEdges;
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #74  <Field Edge sortedEdges>
	//   21   41:putfield        #109 <Field Edge Edge.nextInSEL>
			edge.prevInSEL = null;
	//   22   44:aload_1         
	//   23   45:aconst_null     
	//   24   46:putfield        #115 <Field Edge Edge.prevInSEL>
			sortedEdges.prevInSEL = edge;
	//   25   49:aload_0         
	//   26   50:getfield        #74  <Field Edge sortedEdges>
	//   27   53:aload_1         
	//   28   54:putfield        #115 <Field Edge Edge.prevInSEL>
			sortedEdges = edge;
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:putfield        #74  <Field Edge sortedEdges>
			return;
	//   32   62:return          
		}
	}

	private void addGhostJoin(Path.OutPt outpt, Point.LongPoint longpoint)
	{
		Path.Join join = new Path.Join();
	//    0    0:new             #173 <Class Path$Join>
	//    1    3:dup             
	//    2    4:invokespecial   #174 <Method void Path$Join()>
	//    3    7:astore_3        
		join.outPt1 = outpt;
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:putfield        #177 <Field Path$OutPt Path$Join.outPt1>
		join.setOffPt(longpoint);
	//    7   13:aload_3         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #181 <Method void Path$Join.setOffPt(Point$LongPoint)>
		ghostJoins.add(((Object) (join)));
	//   10   18:aload_0         
	//   11   19:getfield        #93  <Field List ghostJoins>
	//   12   22:aload_3         
	//   13   23:invokeinterface #185 <Method boolean List.add(Object)>
	//   14   28:pop             
	//   15   29:return          
	}

	private void addJoin(Path.OutPt outpt, Path.OutPt outpt1, Point.LongPoint longpoint)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "addJoin");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc1            #188 <String "addJoin">
	//    4   10:invokevirtual   #169 <Method void Logger.entering(String, String)>
		Path.Join join = new Path.Join();
	//    5   13:new             #173 <Class Path$Join>
	//    6   16:dup             
	//    7   17:invokespecial   #174 <Method void Path$Join()>
	//    8   20:astore          4
		join.outPt1 = outpt;
	//    9   22:aload           4
	//   10   24:aload_1         
	//   11   25:putfield        #177 <Field Path$OutPt Path$Join.outPt1>
		join.outPt2 = outpt1;
	//   12   28:aload           4
	//   13   30:aload_2         
	//   14   31:putfield        #191 <Field Path$OutPt Path$Join.outPt2>
		join.setOffPt(longpoint);
	//   15   34:aload           4
	//   16   36:aload_3         
	//   17   37:invokevirtual   #181 <Method void Path$Join.setOffPt(Point$LongPoint)>
		joins.add(((Object) (join)));
	//   18   40:aload_0         
	//   19   41:getfield        #91  <Field List joins>
	//   20   44:aload           4
	//   21   46:invokeinterface #185 <Method boolean List.add(Object)>
	//   22   51:pop             
	//   23   52:return          
	}

	private void addLocalMaxPoly(Edge edge, Edge edge1, Point.LongPoint longpoint)
	{
		addOutPt(edge, longpoint);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//    4    6:pop             
		if(edge1.windDelta == 0)
	//*   5    7:aload_2         
	//*   6    8:getfield        #200 <Field int Edge.windDelta>
	//*   7   11:ifne            21
			addOutPt(edge1, longpoint);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//   12   20:pop             
		if(edge.outIdx == edge1.outIdx)
	//*  13   21:aload_1         
	//*  14   22:getfield        #121 <Field int Edge.outIdx>
	//*  15   25:aload_2         
	//*  16   26:getfield        #121 <Field int Edge.outIdx>
	//*  17   29:icmpne          43
		{
			edge.outIdx = -1;
	//   18   32:aload_1         
	//   19   33:iconst_m1       
	//   20   34:putfield        #121 <Field int Edge.outIdx>
			edge1.outIdx = -1;
	//   21   37:aload_2         
	//   22   38:iconst_m1       
	//   23   39:putfield        #121 <Field int Edge.outIdx>
			return;
	//   24   42:return          
		}
		if(edge.outIdx < edge1.outIdx)
	//*  25   43:aload_1         
	//*  26   44:getfield        #121 <Field int Edge.outIdx>
	//*  27   47:aload_2         
	//*  28   48:getfield        #121 <Field int Edge.outIdx>
	//*  29   51:icmpge          61
		{
			appendPolygon(edge, edge1);
	//   30   54:aload_0         
	//   31   55:aload_1         
	//   32   56:aload_2         
	//   33   57:invokespecial   #204 <Method void appendPolygon(Edge, Edge)>
			return;
	//   34   60:return          
		} else
		{
			appendPolygon(edge1, edge);
	//   35   61:aload_0         
	//   36   62:aload_2         
	//   37   63:aload_1         
	//   38   64:invokespecial   #204 <Method void appendPolygon(Edge, Edge)>
			return;
	//   39   67:return          
		}
	}

	private Path.OutPt addLocalMinPoly(Edge edge, Edge edge1, Point.LongPoint longpoint)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "addLocalMinPoly");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc1            #207 <String "addLocalMinPoly">
	//    4   10:invokevirtual   #169 <Method void Logger.entering(String, String)>
		Path.OutPt outpt;
		if(edge1.isHorizontal() || edge.deltaX > edge1.deltaX)
	//*   5   13:aload_2         
	//*   6   14:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//*   7   17:ifne            32
	//*   8   20:aload_1         
	//*   9   21:getfield        #215 <Field double Edge.deltaX>
	//*  10   24:aload_2         
	//*  11   25:getfield        #215 <Field double Edge.deltaX>
	//*  12   28:dcmpl           
	//*  13   29:ifle            170
		{
			outpt = addOutPt(edge, longpoint);
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:aload_3         
	//   17   35:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//   18   38:astore          5
			edge1.outIdx = edge.outIdx;
	//   19   40:aload_2         
	//   20   41:aload_1         
	//   21   42:getfield        #121 <Field int Edge.outIdx>
	//   22   45:putfield        #121 <Field int Edge.outIdx>
			edge.side = Edge.Side.LEFT;
	//   23   48:aload_1         
	//   24   49:getstatic       #138 <Field Edge$Side Edge$Side.LEFT>
	//   25   52:putfield        #133 <Field Edge$Side Edge.side>
			edge1.side = Edge.Side.RIGHT;
	//   26   55:aload_2         
	//   27   56:getstatic       #218 <Field Edge$Side Edge$Side.RIGHT>
	//   28   59:putfield        #133 <Field Edge$Side Edge.side>
			Edge edge2 = edge;
	//   29   62:aload_1         
	//   30   63:astore          4
			if(edge2.prevInAEL == edge1)
	//*  31   65:aload           4
	//*  32   67:getfield        #221 <Field Edge Edge.prevInAEL>
	//*  33   70:aload_2         
	//*  34   71:if_acmpne       158
			{
				edge = edge1.prevInAEL;
	//   35   74:aload_2         
	//   36   75:getfield        #221 <Field Edge Edge.prevInAEL>
	//   37   78:astore_1        
				edge1 = edge2;
	//   38   79:aload           4
	//   39   81:astore_2        
			} else
	//*  40   82:aload_1         
	//*  41   83:ifnull          155
	//*  42   86:aload_1         
	//*  43   87:getfield        #121 <Field int Edge.outIdx>
	//*  44   90:iflt            155
	//*  45   93:aload_1         
	//*  46   94:aload_3         
	//*  47   95:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  48   98:invokestatic    #231 <Method long Edge.topX(Edge, long)>
	//*  49  101:aload_2         
	//*  50  102:aload_3         
	//*  51  103:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  52  106:invokestatic    #231 <Method long Edge.topX(Edge, long)>
	//*  53  109:lcmp            
	//*  54  110:ifne            155
	//*  55  113:aload_2         
	//*  56  114:aload_1         
	//*  57  115:aload_0         
	//*  58  116:getfield        #234 <Field boolean useFullRange>
	//*  59  119:invokestatic    #238 <Method boolean Edge.slopesEqual(Edge, Edge, boolean)>
	//*  60  122:ifeq            155
	//*  61  125:aload_2         
	//*  62  126:getfield        #200 <Field int Edge.windDelta>
	//*  63  129:ifeq            155
	//*  64  132:aload_1         
	//*  65  133:getfield        #200 <Field int Edge.windDelta>
	//*  66  136:ifeq            155
	//*  67  139:aload_0         
	//*  68  140:aload           5
	//*  69  142:aload_0         
	//*  70  143:aload_1         
	//*  71  144:aload_3         
	//*  72  145:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//*  73  148:aload_2         
	//*  74  149:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  75  152:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
	//*  76  155:aload           5
	//*  77  157:areturn         
			{
				edge = edge2.prevInAEL;
	//   78  158:aload           4
	//   79  160:getfield        #221 <Field Edge Edge.prevInAEL>
	//   80  163:astore_1        
				edge1 = edge2;
	//   81  164:aload           4
	//   82  166:astore_2        
			}
		} else
	//*  83  167:goto            82
		{
			outpt = addOutPt(edge1, longpoint);
	//   84  170:aload_0         
	//   85  171:aload_2         
	//   86  172:aload_3         
	//   87  173:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//   88  176:astore          5
			edge.outIdx = edge1.outIdx;
	//   89  178:aload_1         
	//   90  179:aload_2         
	//   91  180:getfield        #121 <Field int Edge.outIdx>
	//   92  183:putfield        #121 <Field int Edge.outIdx>
			edge.side = Edge.Side.RIGHT;
	//   93  186:aload_1         
	//   94  187:getstatic       #218 <Field Edge$Side Edge$Side.RIGHT>
	//   95  190:putfield        #133 <Field Edge$Side Edge.side>
			edge1.side = Edge.Side.LEFT;
	//   96  193:aload_2         
	//   97  194:getstatic       #138 <Field Edge$Side Edge$Side.LEFT>
	//   98  197:putfield        #133 <Field Edge$Side Edge.side>
			if(edge1.prevInAEL == edge)
	//*  99  200:aload_2         
	//* 100  201:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 101  204:aload_1         
	//* 102  205:if_acmpne       216
				edge = edge.prevInAEL;
	//  103  208:aload_1         
	//  104  209:getfield        #221 <Field Edge Edge.prevInAEL>
	//  105  212:astore_1        
			else
	//* 106  213:goto            82
				edge = edge1.prevInAEL;
	//  107  216:aload_2         
	//  108  217:getfield        #221 <Field Edge Edge.prevInAEL>
	//  109  220:astore_1        
		}
		if(edge != null && edge.outIdx >= 0 && Edge.topX(edge, longpoint.getY()) == Edge.topX(edge1, longpoint.getY()) && Edge.slopesEqual(edge1, edge, useFullRange) && edge1.windDelta != 0 && edge.windDelta != 0)
			addJoin(outpt, addOutPt(edge, longpoint), edge1.getTop());
		return outpt;
	//* 110  221:goto            82
	}

	private Path.OutPt addOutPt(Edge edge, Point.LongPoint longpoint)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "addOutPt");
	//    2    2:getstatic       #58  <Field Logger LOGGER>
	//    3    5:ldc1            #2   <Class DefaultClipper>
	//    4    7:invokevirtual   #50  <Method String Class.getName()>
	//    5   10:ldc1            #245 <String "addOutPt">
	//    6   12:invokevirtual   #169 <Method void Logger.entering(String, String)>
		if(edge.outIdx < 0)
	//*   7   15:aload_1         
	//*   8   16:getfield        #121 <Field int Edge.outIdx>
	//*   9   19:ifge            121
		{
			Path.OutRec outrec = createOutRec();
	//   10   22:aload_0         
	//   11   23:invokespecial   #249 <Method Path$OutRec createOutRec()>
	//   12   26:astore          5
			Path.OutPt outpt;
			if(edge.windDelta != 0)
	//*  13   28:aload_1         
	//*  14   29:getfield        #200 <Field int Edge.windDelta>
	//*  15   32:ifne            116
	//*  16   35:aload           5
	//*  17   37:iload_3         
	//*  18   38:putfield        #252 <Field boolean Path$OutRec.isOpen>
	//*  19   41:new             #144 <Class Path$OutPt>
	//*  20   44:dup             
	//*  21   45:invokespecial   #253 <Method void Path$OutPt()>
	//*  22   48:astore          4
	//*  23   50:aload           5
	//*  24   52:aload           4
	//*  25   54:putfield        #142 <Field Path$OutPt Path$OutRec.pts>
	//*  26   57:aload           4
	//*  27   59:aload           5
	//*  28   61:getfield        #256 <Field int Path$OutRec.Idx>
	//*  29   64:putfield        #259 <Field int Path$OutPt.idx>
	//*  30   67:aload           4
	//*  31   69:aload_2         
	//*  32   70:putfield        #263 <Field Point$LongPoint Path$OutPt.pt>
	//*  33   73:aload           4
	//*  34   75:aload           4
	//*  35   77:putfield        #266 <Field Path$OutPt Path$OutPt.next>
	//*  36   80:aload           4
	//*  37   82:aload           4
	//*  38   84:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  39   87:aload           5
	//*  40   89:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//*  41   92:ifne            102
	//*  42   95:aload_0         
	//*  43   96:aload_1         
	//*  44   97:aload           5
	//*  45   99:invokespecial   #270 <Method void setHoleState(Edge, Path$OutRec)>
	//*  46  102:aload_1         
	//*  47  103:aload           5
	//*  48  105:getfield        #256 <Field int Path$OutRec.Idx>
	//*  49  108:putfield        #121 <Field int Edge.outIdx>
	//*  50  111:aload           4
	//*  51  113:astore_1        
	//*  52  114:aload_1         
	//*  53  115:areturn         
				flag = false;
	//   54  116:iconst_0        
	//   55  117:istore_3        
			outrec.isOpen = flag;
			outpt = new Path.OutPt();
			outrec.pts = outpt;
			outpt.idx = outrec.Idx;
			outpt.pt = longpoint;
			outpt.next = outpt;
			outpt.prev = outpt;
			if(!outrec.isOpen)
				setHoleState(edge, outrec);
			edge.outIdx = outrec.Idx;
			edge = ((Edge) (outpt));
		} else
	//*  56  118:goto            35
		{
			Path.OutRec outrec1 = (Path.OutRec)polyOuts.get(edge.outIdx);
	//   57  121:aload_0         
	//   58  122:getfield        #89  <Field List polyOuts>
	//   59  125:aload_1         
	//   60  126:getfield        #121 <Field int Edge.outIdx>
	//   61  129:invokeinterface #127 <Method Object List.get(int)>
	//   62  134:checkcast       #129 <Class Path$OutRec>
	//   63  137:astore          5
			Path.OutPt outpt2 = outrec1.getPoints();
	//   64  139:aload           5
	//   65  141:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//   66  144:astore          6
			boolean flag1;
			if(edge.side == Edge.Side.LEFT)
	//*  67  146:aload_1         
	//*  68  147:getfield        #133 <Field Edge$Side Edge.side>
	//*  69  150:getstatic       #138 <Field Edge$Side Edge$Side.LEFT>
	//*  70  153:if_acmpne       251
				flag1 = true;
	//   71  156:iconst_1        
	//   72  157:istore_3        
			else
	//*  73  158:getstatic       #58  <Field Logger LOGGER>
	//*  74  161:new             #276 <Class StringBuilder>
	//*  75  164:dup             
	//*  76  165:invokespecial   #277 <Method void StringBuilder()>
	//*  77  168:ldc2            #279 <String "op=">
	//*  78  171:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//*  79  174:aload           6
	//*  80  176:invokevirtual   #287 <Method int Path$OutPt.getPointCount()>
	//*  81  179:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//*  82  182:invokevirtual   #293 <Method String StringBuilder.toString()>
	//*  83  185:invokevirtual   #297 <Method void Logger.finest(String)>
	//*  84  188:getstatic       #58  <Field Logger LOGGER>
	//*  85  191:new             #276 <Class StringBuilder>
	//*  86  194:dup             
	//*  87  195:invokespecial   #277 <Method void StringBuilder()>
	//*  88  198:iload_3         
	//*  89  199:invokevirtual   #300 <Method StringBuilder StringBuilder.append(boolean)>
	//*  90  202:ldc2            #302 <String " ">
	//*  91  205:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//*  92  208:aload_2         
	//*  93  209:invokevirtual   #305 <Method StringBuilder StringBuilder.append(Object)>
	//*  94  212:ldc2            #302 <String " ">
	//*  95  215:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//*  96  218:aload           6
	//*  97  220:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  98  223:invokevirtual   #305 <Method StringBuilder StringBuilder.append(Object)>
	//*  99  226:invokevirtual   #293 <Method String StringBuilder.toString()>
	//* 100  229:invokevirtual   #297 <Method void Logger.finest(String)>
	//* 101  232:iload_3         
	//* 102  233:ifeq            256
	//* 103  236:aload_2         
	//* 104  237:aload           6
	//* 105  239:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 106  242:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//* 107  245:ifeq            256
	//* 108  248:aload           6
	//* 109  250:areturn         
				flag1 = false;
	//  110  251:iconst_0        
	//  111  252:istore_3        
			LOGGER.finest((new StringBuilder()).append("op=").append(outpt2.getPointCount()).toString());
			LOGGER.finest((new StringBuilder()).append(flag1).append(" ").append(((Object) (longpoint))).append(" ").append(((Object) (outpt2.getPt()))).toString());
			if(flag1 && longpoint.equals(((Object) (outpt2.getPt()))))
				return outpt2;
	//* 112  253:goto            158
			if(!flag1 && longpoint.equals(((Object) (outpt2.prev.getPt()))))
	//* 113  256:iload_3         
	//* 114  257:ifne            281
	//* 115  260:aload_2         
	//* 116  261:aload           6
	//* 117  263:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//* 118  266:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 119  269:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//* 120  272:ifeq            281
				return outpt2.prev;
	//  121  275:aload           6
	//  122  277:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  123  280:areturn         
			Path.OutPt outpt1 = new Path.OutPt();
	//  124  281:new             #144 <Class Path$OutPt>
	//  125  284:dup             
	//  126  285:invokespecial   #253 <Method void Path$OutPt()>
	//  127  288:astore          4
			outpt1.idx = outrec1.Idx;
	//  128  290:aload           4
	//  129  292:aload           5
	//  130  294:getfield        #256 <Field int Path$OutRec.Idx>
	//  131  297:putfield        #259 <Field int Path$OutPt.idx>
			outpt1.setPt(new Point.LongPoint(longpoint));
	//  132  300:aload           4
	//  133  302:new             #223 <Class Point$LongPoint>
	//  134  305:dup             
	//  135  306:aload_2         
	//  136  307:invokespecial   #313 <Method void Point$LongPoint(Point$LongPoint)>
	//  137  310:invokevirtual   #316 <Method void Path$OutPt.setPt(Point$LongPoint)>
			outpt1.next = outpt2;
	//  138  313:aload           4
	//  139  315:aload           6
	//  140  317:putfield        #266 <Field Path$OutPt Path$OutPt.next>
			outpt1.prev = outpt2.prev;
	//  141  320:aload           4
	//  142  322:aload           6
	//  143  324:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  144  327:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
			outpt1.prev.next = outpt1;
	//  145  330:aload           4
	//  146  332:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  147  335:aload           4
	//  148  337:putfield        #266 <Field Path$OutPt Path$OutPt.next>
			outpt2.prev = outpt1;
	//  149  340:aload           6
	//  150  342:aload           4
	//  151  344:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
			edge = ((Edge) (outpt1));
	//  152  347:aload           4
	//  153  349:astore_1        
			if(flag1)
	//* 154  350:iload_3         
	//* 155  351:ifeq            114
			{
				outrec1.setPoints(outpt1);
	//  156  354:aload           5
	//  157  356:aload           4
	//  158  358:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
				return outpt1;
	//  159  361:aload           4
	//  160  363:areturn         
			}
		}
		return ((Path.OutPt) (edge));
	}

	private void appendPolygon(Edge edge, Edge edge1)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "appendPolygon");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #321 <String "appendPolygon">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		Path.OutRec outrec1 = (Path.OutRec)polyOuts.get(edge.outIdx);
	//    5   14:aload_0         
	//    6   15:getfield        #89  <Field List polyOuts>
	//    7   18:aload_1         
	//    8   19:getfield        #121 <Field int Edge.outIdx>
	//    9   22:invokeinterface #127 <Method Object List.get(int)>
	//   10   27:checkcast       #129 <Class Path$OutRec>
	//   11   30:astore          7
		Path.OutRec outrec2 = (Path.OutRec)polyOuts.get(edge1.outIdx);
	//   12   32:aload_0         
	//   13   33:getfield        #89  <Field List polyOuts>
	//   14   36:aload_2         
	//   15   37:getfield        #121 <Field int Edge.outIdx>
	//   16   40:invokeinterface #127 <Method Object List.get(int)>
	//   17   45:checkcast       #129 <Class Path$OutRec>
	//   18   48:astore          8
		LOGGER.finest((new StringBuilder()).append("").append(edge.outIdx).toString());
	//   19   50:getstatic       #58  <Field Logger LOGGER>
	//   20   53:new             #276 <Class StringBuilder>
	//   21   56:dup             
	//   22   57:invokespecial   #277 <Method void StringBuilder()>
	//   23   60:ldc2            #323 <String "">
	//   24   63:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   25   66:aload_1         
	//   26   67:getfield        #121 <Field int Edge.outIdx>
	//   27   70:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//   28   73:invokevirtual   #293 <Method String StringBuilder.toString()>
	//   29   76:invokevirtual   #297 <Method void Logger.finest(String)>
		LOGGER.finest((new StringBuilder()).append("").append(edge1.outIdx).toString());
	//   30   79:getstatic       #58  <Field Logger LOGGER>
	//   31   82:new             #276 <Class StringBuilder>
	//   32   85:dup             
	//   33   86:invokespecial   #277 <Method void StringBuilder()>
	//   34   89:ldc2            #323 <String "">
	//   35   92:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   36   95:aload_2         
	//   37   96:getfield        #121 <Field int Edge.outIdx>
	//   38   99:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//   39  102:invokevirtual   #293 <Method String StringBuilder.toString()>
	//   40  105:invokevirtual   #297 <Method void Logger.finest(String)>
		Path.OutRec outrec;
		Object obj;
		Path.OutPt outpt;
		Path.OutPt outpt1;
		Path.OutPt outpt2;
		if(isParam1RightOfParam2(outrec1, outrec2))
	//*  41  108:aload           7
	//*  42  110:aload           8
	//*  43  112:invokestatic    #327 <Method boolean isParam1RightOfParam2(Path$OutRec, Path$OutRec)>
	//*  44  115:ifeq            461
			outrec = outrec2;
	//   45  118:aload           8
	//   46  120:astore          5
		else
	//*  47  122:aload           7
	//*  48  124:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  49  127:astore          6
	//*  50  129:aload           6
	//*  51  131:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  52  134:astore          9
	//*  53  136:aload           8
	//*  54  138:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  55  141:astore          10
	//*  56  143:aload           10
	//*  57  145:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  58  148:astore          11
	//*  59  150:getstatic       #58  <Field Logger LOGGER>
	//*  60  153:new             #276 <Class StringBuilder>
	//*  61  156:dup             
	//*  62  157:invokespecial   #277 <Method void StringBuilder()>
	//*  63  160:ldc2            #329 <String "p1_lft.getPointCount() = ">
	//*  64  163:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//*  65  166:aload           6
	//*  66  168:invokevirtual   #287 <Method int Path$OutPt.getPointCount()>
	//*  67  171:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//*  68  174:invokevirtual   #293 <Method String StringBuilder.toString()>
	//*  69  177:invokevirtual   #297 <Method void Logger.finest(String)>
	//*  70  180:getstatic       #58  <Field Logger LOGGER>
	//*  71  183:new             #276 <Class StringBuilder>
	//*  72  186:dup             
	//*  73  187:invokespecial   #277 <Method void StringBuilder()>
	//*  74  190:ldc2            #331 <String "p1_rt.getPointCount() = ">
	//*  75  193:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//*  76  196:aload           9
	//*  77  198:invokevirtual   #287 <Method int Path$OutPt.getPointCount()>
	//*  78  201:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//*  79  204:invokevirtual   #293 <Method String StringBuilder.toString()>
	//*  80  207:invokevirtual   #297 <Method void Logger.finest(String)>
	//*  81  210:getstatic       #58  <Field Logger LOGGER>
	//*  82  213:new             #276 <Class StringBuilder>
	//*  83  216:dup             
	//*  84  217:invokespecial   #277 <Method void StringBuilder()>
	//*  85  220:ldc2            #333 <String "p2_lft.getPointCount() = ">
	//*  86  223:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//*  87  226:aload           10
	//*  88  228:invokevirtual   #287 <Method int Path$OutPt.getPointCount()>
	//*  89  231:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//*  90  234:invokevirtual   #293 <Method String StringBuilder.toString()>
	//*  91  237:invokevirtual   #297 <Method void Logger.finest(String)>
	//*  92  240:getstatic       #58  <Field Logger LOGGER>
	//*  93  243:new             #276 <Class StringBuilder>
	//*  94  246:dup             
	//*  95  247:invokespecial   #277 <Method void StringBuilder()>
	//*  96  250:ldc2            #335 <String "p2_rt.getPointCount() = ">
	//*  97  253:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//*  98  256:aload           11
	//*  99  258:invokevirtual   #287 <Method int Path$OutPt.getPointCount()>
	//* 100  261:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//* 101  264:invokevirtual   #293 <Method String StringBuilder.toString()>
	//* 102  267:invokevirtual   #297 <Method void Logger.finest(String)>
	//* 103  270:aload_1         
	//* 104  271:getfield        #133 <Field Edge$Side Edge.side>
	//* 105  274:getstatic       #138 <Field Edge$Side Edge$Side.LEFT>
	//* 106  277:if_acmpne       528
	//* 107  280:aload_2         
	//* 108  281:getfield        #133 <Field Edge$Side Edge.side>
	//* 109  284:getstatic       #138 <Field Edge$Side Edge$Side.LEFT>
	//* 110  287:if_acmpne       490
	//* 111  290:aload           10
	//* 112  292:invokevirtual   #338 <Method void Path$OutPt.reversePolyPtLinks()>
	//* 113  295:aload           10
	//* 114  297:aload           6
	//* 115  299:putfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 116  302:aload           6
	//* 117  304:aload           10
	//* 118  306:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//* 119  309:aload           9
	//* 120  311:aload           11
	//* 121  313:putfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 122  316:aload           11
	//* 123  318:aload           9
	//* 124  320:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//* 125  323:aload           7
	//* 126  325:aload           11
	//* 127  327:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
	//* 128  330:getstatic       #138 <Field Edge$Side Edge$Side.LEFT>
	//* 129  333:astore          6
	//* 130  335:aload           7
	//* 131  337:aconst_null     
	//* 132  338:putfield        #341 <Field Path$OutPt Path$OutRec.bottomPt>
	//* 133  341:aload           5
	//* 134  343:aload           8
	//* 135  345:invokevirtual   #344 <Method boolean Object.equals(Object)>
	//* 136  348:ifeq            381
	//* 137  351:aload           8
	//* 138  353:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 139  356:aload           7
	//* 140  358:if_acmpeq       371
	//* 141  361:aload           7
	//* 142  363:aload           8
	//* 143  365:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 144  368:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 145  371:aload           7
	//* 146  373:aload           8
	//* 147  375:getfield        #351 <Field boolean Path$OutRec.isHole>
	//* 148  378:putfield        #351 <Field boolean Path$OutRec.isHole>
	//* 149  381:aload           8
	//* 150  383:aconst_null     
	//* 151  384:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
	//* 152  387:aload           8
	//* 153  389:aconst_null     
	//* 154  390:putfield        #341 <Field Path$OutPt Path$OutRec.bottomPt>
	//* 155  393:aload           8
	//* 156  395:aload           7
	//* 157  397:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 158  400:aload_1         
	//* 159  401:getfield        #121 <Field int Edge.outIdx>
	//* 160  404:istore_3        
	//* 161  405:aload_2         
	//* 162  406:getfield        #121 <Field int Edge.outIdx>
	//* 163  409:istore          4
	//* 164  411:aload_1         
	//* 165  412:iconst_m1       
	//* 166  413:putfield        #121 <Field int Edge.outIdx>
	//* 167  416:aload_2         
	//* 168  417:iconst_m1       
	//* 169  418:putfield        #121 <Field int Edge.outIdx>
	//* 170  421:aload_0         
	//* 171  422:getfield        #72  <Field Edge activeEdges>
	//* 172  425:astore_1        
	//* 173  426:aload_1         
	//* 174  427:ifnull          450
	//* 175  430:aload_1         
	//* 176  431:getfield        #121 <Field int Edge.outIdx>
	//* 177  434:iload           4
	//* 178  436:icmpne          610
	//* 179  439:aload_1         
	//* 180  440:iload_3         
	//* 181  441:putfield        #121 <Field int Edge.outIdx>
	//* 182  444:aload_1         
	//* 183  445:aload           6
	//* 184  447:putfield        #133 <Field Edge$Side Edge.side>
	//* 185  450:aload           8
	//* 186  452:aload           7
	//* 187  454:getfield        #256 <Field int Path$OutRec.Idx>
	//* 188  457:putfield        #256 <Field int Path$OutRec.Idx>
	//* 189  460:return          
		if(isParam1RightOfParam2(outrec2, outrec1))
	//* 190  461:aload           8
	//* 191  463:aload           7
	//* 192  465:invokestatic    #327 <Method boolean isParam1RightOfParam2(Path$OutRec, Path$OutRec)>
	//* 193  468:ifeq            478
			outrec = outrec1;
	//  194  471:aload           7
	//  195  473:astore          5
		else
	//* 196  475:goto            122
			outrec = Path.OutPt.getLowerMostRec(outrec1, outrec2);
	//  197  478:aload           7
	//  198  480:aload           8
	//  199  482:invokestatic    #355 <Method Path$OutRec Path$OutPt.getLowerMostRec(Path$OutRec, Path$OutRec)>
	//  200  485:astore          5
		obj = ((Object) (outrec1.getPoints()));
		outpt = ((Path.OutPt) (obj)).prev;
		outpt1 = outrec2.getPoints();
		outpt2 = outpt1.prev;
		LOGGER.finest((new StringBuilder()).append("p1_lft.getPointCount() = ").append(((Path.OutPt) (obj)).getPointCount()).toString());
		LOGGER.finest((new StringBuilder()).append("p1_rt.getPointCount() = ").append(outpt.getPointCount()).toString());
		LOGGER.finest((new StringBuilder()).append("p2_lft.getPointCount() = ").append(outpt1.getPointCount()).toString());
		LOGGER.finest((new StringBuilder()).append("p2_rt.getPointCount() = ").append(outpt2.getPointCount()).toString());
		if(edge.side == Edge.Side.LEFT)
		{
			int i;
			int j;
			if(edge1.side == Edge.Side.LEFT)
			{
				outpt1.reversePolyPtLinks();
				outpt1.next = ((Path.OutPt) (obj));
				obj.prev = outpt1;
				outpt.next = outpt2;
				outpt2.prev = outpt;
				outrec1.setPoints(outpt2);
			} else
	//* 201  487:goto            122
			{
				outpt2.next = ((Path.OutPt) (obj));
	//  202  490:aload           11
	//  203  492:aload           6
	//  204  494:putfield        #266 <Field Path$OutPt Path$OutPt.next>
				obj.prev = outpt2;
	//  205  497:aload           6
	//  206  499:aload           11
	//  207  501:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
				outpt1.prev = outpt;
	//  208  504:aload           10
	//  209  506:aload           9
	//  210  508:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
				outpt.next = outpt1;
	//  211  511:aload           9
	//  212  513:aload           10
	//  213  515:putfield        #266 <Field Path$OutPt Path$OutPt.next>
				outrec1.setPoints(outpt1);
	//  214  518:aload           7
	//  215  520:aload           10
	//  216  522:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
			}
			obj = ((Object) (Edge.Side.LEFT));
		} else
	//* 217  525:goto            330
		{
			if(edge1.side == Edge.Side.RIGHT)
	//* 218  528:aload_2         
	//* 219  529:getfield        #133 <Field Edge$Side Edge.side>
	//* 220  532:getstatic       #218 <Field Edge$Side Edge$Side.RIGHT>
	//* 221  535:if_acmpne       579
			{
				outpt1.reversePolyPtLinks();
	//  222  538:aload           10
	//  223  540:invokevirtual   #338 <Method void Path$OutPt.reversePolyPtLinks()>
				outpt.next = outpt2;
	//  224  543:aload           9
	//  225  545:aload           11
	//  226  547:putfield        #266 <Field Path$OutPt Path$OutPt.next>
				outpt2.prev = outpt;
	//  227  550:aload           11
	//  228  552:aload           9
	//  229  554:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
				outpt1.next = ((Path.OutPt) (obj));
	//  230  557:aload           10
	//  231  559:aload           6
	//  232  561:putfield        #266 <Field Path$OutPt Path$OutPt.next>
				obj.prev = outpt1;
	//  233  564:aload           6
	//  234  566:aload           10
	//  235  568:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
			} else
	//* 236  571:getstatic       #218 <Field Edge$Side Edge$Side.RIGHT>
	//* 237  574:astore          6
	//* 238  576:goto            335
			{
				outpt.next = outpt1;
	//  239  579:aload           9
	//  240  581:aload           10
	//  241  583:putfield        #266 <Field Path$OutPt Path$OutPt.next>
				outpt1.prev = outpt;
	//  242  586:aload           10
	//  243  588:aload           9
	//  244  590:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
				obj.prev = outpt2;
	//  245  593:aload           6
	//  246  595:aload           11
	//  247  597:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
				outpt2.next = ((Path.OutPt) (obj));
	//  248  600:aload           11
	//  249  602:aload           6
	//  250  604:putfield        #266 <Field Path$OutPt Path$OutPt.next>
			}
			obj = ((Object) (Edge.Side.RIGHT));
		}
		outrec1.bottomPt = null;
		if(((Object) (outrec)).equals(((Object) (outrec2))))
		{
			if(outrec2.firstLeft != outrec1)
				outrec1.firstLeft = outrec2.firstLeft;
			outrec1.isHole = outrec2.isHole;
		}
		outrec2.setPoints(((Path.OutPt) (null)));
		outrec2.bottomPt = null;
		outrec2.firstLeft = outrec1;
		i = edge.outIdx;
		j = edge1.outIdx;
		edge.outIdx = -1;
		edge1.outIdx = -1;
		edge = activeEdges;
		do
		{
label0:
			{
				if(edge != null)
				{
					if(edge.outIdx != j)
						break label0;
					edge.outIdx = i;
					edge.side = ((Edge.Side) (obj));
				}
				outrec2.Idx = outrec1.Idx;
				return;
			}
	//* 251  607:goto            571
			edge = edge.nextInAEL;
	//  252  610:aload_1         
	//  253  611:getfield        #358 <Field Edge Edge.nextInAEL>
	//  254  614:astore_1        
		} while(true);
	//  255  615:goto            426
	}

	private void buildIntersectList(long l)
	{
		if(activeEdges == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field Edge activeEdges>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Edge edge = activeEdges;
	//    4    8:aload_0         
	//    5    9:getfield        #72  <Field Edge activeEdges>
	//    6   12:astore          4
		sortedEdges = edge;
	//    7   14:aload_0         
	//    8   15:aload           4
	//    9   17:putfield        #74  <Field Edge sortedEdges>
		for(; edge != null; edge = edge.nextInAEL)
	//*  10   20:aload           4
	//*  11   22:ifnull          72
		{
			edge.prevInSEL = edge.prevInAEL;
	//   12   25:aload           4
	//   13   27:aload           4
	//   14   29:getfield        #221 <Field Edge Edge.prevInAEL>
	//   15   32:putfield        #115 <Field Edge Edge.prevInSEL>
			edge.nextInSEL = edge.nextInAEL;
	//   16   35:aload           4
	//   17   37:aload           4
	//   18   39:getfield        #358 <Field Edge Edge.nextInAEL>
	//   19   42:putfield        #109 <Field Edge Edge.nextInSEL>
			edge.getCurrent().setX(((Number) (Long.valueOf(Edge.topX(edge, l)))));
	//   20   45:aload           4
	//   21   47:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//   22   50:aload           4
	//   23   52:lload_1         
	//   24   53:invokestatic    #231 <Method long Edge.topX(Edge, long)>
	//   25   56:invokestatic    #368 <Method Long Long.valueOf(long)>
	//   26   59:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
		}

	//   27   62:aload           4
	//   28   64:getfield        #358 <Field Edge Edge.nextInAEL>
	//   29   67:astore          4
	//*  30   69:goto            20
		boolean flag = true;
	//   31   72:iconst_1        
	//   32   73:istore_3        
		do
		{
			if(!flag || sortedEdges == null)
				break;
	//   33   74:iload_3         
	//   34   75:ifeq            230
	//   35   78:aload_0         
	//   36   79:getfield        #74  <Field Edge sortedEdges>
	//   37   82:ifnull          230
			flag = false;
	//   38   85:iconst_0        
	//   39   86:istore_3        
			Edge edge1;
			for(edge1 = sortedEdges; edge1.nextInSEL != null;)
	//*  40   87:aload_0         
	//*  41   88:getfield        #74  <Field Edge sortedEdges>
	//*  42   91:astore          4
	//*  43   93:aload           4
	//*  44   95:getfield        #109 <Field Edge Edge.nextInSEL>
	//*  45   98:ifnull          210
			{
				Edge edge2 = edge1.nextInSEL;
	//   46  101:aload           4
	//   47  103:getfield        #109 <Field Edge Edge.nextInSEL>
	//   48  106:astore          5
				Point.LongPoint alongpoint[] = new Point.LongPoint[1];
	//   49  108:iconst_1        
	//   50  109:anewarray       Point.LongPoint[]
	//   51  112:astore          6
				if(edge1.getCurrent().getX() > edge2.getCurrent().getX())
	//*  52  114:aload           4
	//*  53  116:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//*  54  119:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  55  122:aload           5
	//*  56  124:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//*  57  127:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  58  130:lcmp            
	//*  59  131:ifle            203
				{
					intersectPoint(edge1, edge2, alongpoint);
	//   60  134:aload_0         
	//   61  135:aload           4
	//   62  137:aload           5
	//   63  139:aload           6
	//   64  141:invokespecial   #379 <Method void intersectPoint(Edge, Edge, Point$LongPoint[])>
					IntersectNode intersectnode = new IntersectNode();
	//   65  144:new             #10  <Class DefaultClipper$IntersectNode>
	//   66  147:dup             
	//   67  148:aload_0         
	//   68  149:aconst_null     
	//   69  150:invokespecial   #382 <Method void DefaultClipper$IntersectNode(DefaultClipper, DefaultClipper$1)>
	//   70  153:astore          7
					intersectnode.edge1 = edge1;
	//   71  155:aload           7
	//   72  157:aload           4
	//   73  159:putfield        #104 <Field Edge DefaultClipper$IntersectNode.edge1>
					intersectnode.Edge2 = edge2;
	//   74  162:aload           7
	//   75  164:aload           5
	//   76  166:putfield        #112 <Field Edge DefaultClipper$IntersectNode.Edge2>
					intersectnode.setPt(alongpoint[0]);
	//   77  169:aload           7
	//   78  171:aload           6
	//   79  173:iconst_0        
	//   80  174:aaload          
	//   81  175:invokevirtual   #383 <Method void DefaultClipper$IntersectNode.setPt(Point$LongPoint)>
					intersectList.add(((Object) (intersectnode)));
	//   82  178:aload_0         
	//   83  179:getfield        #80  <Field List intersectList>
	//   84  182:aload           7
	//   85  184:invokeinterface #185 <Method boolean List.add(Object)>
	//   86  189:pop             
					swapPositionsInSEL(edge1, edge2);
	//   87  190:aload_0         
	//   88  191:aload           4
	//   89  193:aload           5
	//   90  195:invokespecial   #386 <Method void swapPositionsInSEL(Edge, Edge)>
					flag = true;
	//   91  198:iconst_1        
	//   92  199:istore_3        
				} else
	//*  93  200:goto            93
				{
					edge1 = edge2;
	//   94  203:aload           5
	//   95  205:astore          4
				}
			}

	//*  96  207:goto            93
			if(edge1.prevInSEL == null)
				break;
	//   97  210:aload           4
	//   98  212:getfield        #115 <Field Edge Edge.prevInSEL>
	//   99  215:ifnull          230
			edge1.prevInSEL.nextInSEL = null;
	//  100  218:aload           4
	//  101  220:getfield        #115 <Field Edge Edge.prevInSEL>
	//  102  223:aconst_null     
	//  103  224:putfield        #109 <Field Edge Edge.nextInSEL>
		} while(true);
	//  104  227:goto            74
		sortedEdges = null;
	//  105  230:aload_0         
	//  106  231:aconst_null     
	//  107  232:putfield        #74  <Field Edge sortedEdges>
	//  108  235:return          
	}

	private void buildResult(Paths paths)
	{
		paths.clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #393 <Method void Paths.clear()>
		int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		while(i < polyOuts.size()) 
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #89  <Field List polyOuts>
	//*   7   11:invokeinterface #396 <Method int List.size()>
	//*   8   16:icmpge          153
		{
			Object obj = ((Object) ((Path.OutRec)polyOuts.get(i)));
	//    9   19:aload_0         
	//   10   20:getfield        #89  <Field List polyOuts>
	//   11   23:iload_2         
	//   12   24:invokeinterface #127 <Method Object List.get(int)>
	//   13   29:checkcast       #129 <Class Path$OutRec>
	//   14   32:astore          5
			if(((Path.OutRec) (obj)).getPoints() != null)
	//*  15   34:aload           5
	//*  16   36:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  17   39:ifnonnull       49
	//*  18   42:iload_2         
	//*  19   43:iconst_1        
	//*  20   44:iadd            
	//*  21   45:istore_2        
	//*  22   46:goto            6
			{
				obj = ((Object) (((Path.OutRec) (obj)).getPoints().prev));
	//   23   49:aload           5
	//   24   51:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//   25   54:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   26   57:astore          5
				int k = ((Path.OutPt) (obj)).getPointCount();
	//   27   59:aload           5
	//   28   61:invokevirtual   #287 <Method int Path$OutPt.getPointCount()>
	//   29   64:istore          4
				LOGGER.finest((new StringBuilder()).append("cnt = ").append(k).toString());
	//   30   66:getstatic       #58  <Field Logger LOGGER>
	//   31   69:new             #276 <Class StringBuilder>
	//   32   72:dup             
	//   33   73:invokespecial   #277 <Method void StringBuilder()>
	//   34   76:ldc2            #398 <String "cnt = ">
	//   35   79:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   36   82:iload           4
	//   37   84:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//   38   87:invokevirtual   #293 <Method String StringBuilder.toString()>
	//   39   90:invokevirtual   #297 <Method void Logger.finest(String)>
				if(k >= 2)
	//*  40   93:iload           4
	//*  41   95:iconst_2        
	//*  42   96:icmplt          42
				{
					Path path = new Path(k);
	//   43   99:new             #400 <Class Path>
	//   44  102:dup             
	//   45  103:iload           4
	//   46  105:invokespecial   #401 <Method void Path(int)>
	//   47  108:astore          6
					for(int j = 0; j < k; j++)
	//*  48  110:iconst_0        
	//*  49  111:istore_3        
	//*  50  112:iload_3         
	//*  51  113:iload           4
	//*  52  115:icmpge          143
					{
						path.add(((Object) (((Path.OutPt) (obj)).getPt())));
	//   53  118:aload           6
	//   54  120:aload           5
	//   55  122:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   56  125:invokevirtual   #402 <Method boolean Path.add(Object)>
	//   57  128:pop             
						obj = ((Object) (((Path.OutPt) (obj)).prev));
	//   58  129:aload           5
	//   59  131:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   60  134:astore          5
					}

	//   61  136:iload_3         
	//   62  137:iconst_1        
	//   63  138:iadd            
	//   64  139:istore_3        
	//*  65  140:goto            112
					paths.add(((Object) (path)));
	//   66  143:aload_1         
	//   67  144:aload           6
	//   68  146:invokevirtual   #403 <Method boolean Paths.add(Object)>
	//   69  149:pop             
				}
			}
			i++;
		}
	//*  70  150:goto            42
	//   71  153:return          
	}

	private void buildResult2(PolyTree polytree)
	{
		polytree.Clear();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #410 <Method void PolyTree.Clear()>
		int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		while(i < polyOuts.size()) 
	//*   4    6:iload_2         
	//*   5    7:aload_0         
	//*   6    8:getfield        #89  <Field List polyOuts>
	//*   7   11:invokeinterface #396 <Method int List.size()>
	//*   8   16:icmpge          171
		{
			Object obj = ((Object) ((Path.OutRec)polyOuts.get(i)));
	//    9   19:aload_0         
	//   10   20:getfield        #89  <Field List polyOuts>
	//   11   23:iload_2         
	//   12   24:invokeinterface #127 <Method Object List.get(int)>
	//   13   29:checkcast       #129 <Class Path$OutRec>
	//   14   32:astore          5
			int j;
			if(((Path.OutRec) (obj)).getPoints() != null)
	//*  15   34:aload           5
	//*  16   36:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  17   39:ifnull          84
				j = ((Path.OutRec) (obj)).getPoints().getPointCount();
	//   18   42:aload           5
	//   19   44:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//   20   47:invokevirtual   #287 <Method int Path$OutPt.getPointCount()>
	//   21   50:istore_3        
			else
	//*  22   51:aload           5
	//*  23   53:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//*  24   56:ifeq            64
	//*  25   59:iload_3         
	//*  26   60:iconst_2        
	//*  27   61:icmplt          77
	//*  28   64:aload           5
	//*  29   66:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//*  30   69:ifne            89
	//*  31   72:iload_3         
	//*  32   73:iconst_3        
	//*  33   74:icmpge          89
	//*  34   77:iload_2         
	//*  35   78:iconst_1        
	//*  36   79:iadd            
	//*  37   80:istore_2        
	//*  38   81:goto            6
				j = 0;
	//   39   84:iconst_0        
	//   40   85:istore_3        
			if((!((Path.OutRec) (obj)).isOpen || j >= 2) && (((Path.OutRec) (obj)).isOpen || j >= 3))
	//*  41   86:goto            51
			{
				((Path.OutRec) (obj)).fixHoleLinkage();
	//   42   89:aload           5
	//   43   91:invokevirtual   #413 <Method void Path$OutRec.fixHoleLinkage()>
				PolyNode polynode = new PolyNode();
	//   44   94:new             #415 <Class PolyNode>
	//   45   97:dup             
	//   46   98:invokespecial   #416 <Method void PolyNode()>
	//   47  101:astore          6
				polytree.getAllPolys().add(((Object) (polynode)));
	//   48  103:aload_1         
	//   49  104:invokevirtual   #420 <Method List PolyTree.getAllPolys()>
	//   50  107:aload           6
	//   51  109:invokeinterface #185 <Method boolean List.add(Object)>
	//   52  114:pop             
				obj.polyNode = polynode;
	//   53  115:aload           5
	//   54  117:aload           6
	//   55  119:putfield        #424 <Field PolyNode Path$OutRec.polyNode>
				obj = ((Object) (((Path.OutRec) (obj)).getPoints().prev));
	//   56  122:aload           5
	//   57  124:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//   58  127:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   59  130:astore          5
				int k = 0;
	//   60  132:iconst_0        
	//   61  133:istore          4
				while(k < j) 
	//*  62  135:iload           4
	//*  63  137:iload_3         
	//*  64  138:icmpge          77
				{
					polynode.getPolygon().add(((Object) (((Path.OutPt) (obj)).getPt())));
	//   65  141:aload           6
	//   66  143:invokevirtual   #428 <Method Path PolyNode.getPolygon()>
	//   67  146:aload           5
	//   68  148:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   69  151:invokevirtual   #402 <Method boolean Path.add(Object)>
	//   70  154:pop             
					obj = ((Object) (((Path.OutPt) (obj)).prev));
	//   71  155:aload           5
	//   72  157:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   73  160:astore          5
					k++;
	//   74  162:iload           4
	//   75  164:iconst_1        
	//   76  165:iadd            
	//   77  166:istore          4
				}
			}
			i++;
		}
	//*  78  168:goto            135
		i = 0;
	//   79  171:iconst_0        
	//   80  172:istore_2        
		while(i < polyOuts.size()) 
	//*  81  173:iload_2         
	//*  82  174:aload_0         
	//*  83  175:getfield        #89  <Field List polyOuts>
	//*  84  178:invokeinterface #396 <Method int List.size()>
	//*  85  183:icmpge          295
		{
			Path.OutRec outrec = (Path.OutRec)polyOuts.get(i);
	//   86  186:aload_0         
	//   87  187:getfield        #89  <Field List polyOuts>
	//   88  190:iload_2         
	//   89  191:invokeinterface #127 <Method Object List.get(int)>
	//   90  196:checkcast       #129 <Class Path$OutRec>
	//   91  199:astore          5
			if(outrec.polyNode != null)
	//*  92  201:aload           5
	//*  93  203:getfield        #424 <Field PolyNode Path$OutRec.polyNode>
	//*  94  206:ifnonnull       216
	//*  95  209:iload_2         
	//*  96  210:iconst_1        
	//*  97  211:iadd            
	//*  98  212:istore_2        
	//*  99  213:goto            173
				if(outrec.isOpen)
	//* 100  216:aload           5
	//* 101  218:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//* 102  221:ifeq            245
				{
					outrec.polyNode.setOpen(true);
	//  103  224:aload           5
	//  104  226:getfield        #424 <Field PolyNode Path$OutRec.polyNode>
	//  105  229:iconst_1        
	//  106  230:invokevirtual   #431 <Method void PolyNode.setOpen(boolean)>
					polytree.addChild(outrec.polyNode);
	//  107  233:aload_1         
	//  108  234:aload           5
	//  109  236:getfield        #424 <Field PolyNode Path$OutRec.polyNode>
	//  110  239:invokevirtual   #435 <Method void PolyTree.addChild(PolyNode)>
				} else
	//* 111  242:goto            209
				if(outrec.firstLeft != null && outrec.firstLeft.polyNode != null)
	//* 112  245:aload           5
	//* 113  247:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 114  250:ifnull          283
	//* 115  253:aload           5
	//* 116  255:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 117  258:getfield        #424 <Field PolyNode Path$OutRec.polyNode>
	//* 118  261:ifnull          283
					outrec.firstLeft.polyNode.addChild(outrec.polyNode);
	//  119  264:aload           5
	//  120  266:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//  121  269:getfield        #424 <Field PolyNode Path$OutRec.polyNode>
	//  122  272:aload           5
	//  123  274:getfield        #424 <Field PolyNode Path$OutRec.polyNode>
	//  124  277:invokevirtual   #436 <Method void PolyNode.addChild(PolyNode)>
				else
	//* 125  280:goto            209
					polytree.addChild(outrec.polyNode);
	//  126  283:aload_1         
	//  127  284:aload           5
	//  128  286:getfield        #424 <Field PolyNode Path$OutRec.polyNode>
	//  129  289:invokevirtual   #435 <Method void PolyTree.addChild(PolyNode)>
			i++;
		}
	//* 130  292:goto            209
	//  131  295:return          
	}

	private void copyAELToSEL()
	{
		Edge edge = activeEdges;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Edge activeEdges>
	//    2    4:astore_1        
		sortedEdges = edge;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #74  <Field Edge sortedEdges>
		for(; edge != null; edge = edge.nextInAEL)
	//*   6   10:aload_1         
	//*   7   11:ifnull          38
		{
			edge.prevInSEL = edge.prevInAEL;
	//    8   14:aload_1         
	//    9   15:aload_1         
	//   10   16:getfield        #221 <Field Edge Edge.prevInAEL>
	//   11   19:putfield        #115 <Field Edge Edge.prevInSEL>
			edge.nextInSEL = edge.nextInAEL;
	//   12   22:aload_1         
	//   13   23:aload_1         
	//   14   24:getfield        #358 <Field Edge Edge.nextInAEL>
	//   15   27:putfield        #109 <Field Edge Edge.nextInSEL>
		}

	//   16   30:aload_1         
	//   17   31:getfield        #358 <Field Edge Edge.nextInAEL>
	//   18   34:astore_1        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private Path.OutRec createOutRec()
	{
		Path.OutRec outrec = new Path.OutRec();
	//    0    0:new             #129 <Class Path$OutRec>
	//    1    3:dup             
	//    2    4:invokespecial   #438 <Method void Path$OutRec()>
	//    3    7:astore_1        
		outrec.Idx = -1;
	//    4    8:aload_1         
	//    5    9:iconst_m1       
	//    6   10:putfield        #256 <Field int Path$OutRec.Idx>
		outrec.isHole = false;
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:putfield        #351 <Field boolean Path$OutRec.isHole>
		outrec.isOpen = false;
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:putfield        #252 <Field boolean Path$OutRec.isOpen>
		outrec.firstLeft = null;
	//   13   23:aload_1         
	//   14   24:aconst_null     
	//   15   25:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
		outrec.setPoints(((Path.OutPt) (null)));
	//   16   28:aload_1         
	//   17   29:aconst_null     
	//   18   30:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
		outrec.bottomPt = null;
	//   19   33:aload_1         
	//   20   34:aconst_null     
	//   21   35:putfield        #341 <Field Path$OutPt Path$OutRec.bottomPt>
		outrec.polyNode = null;
	//   22   38:aload_1         
	//   23   39:aconst_null     
	//   24   40:putfield        #424 <Field PolyNode Path$OutRec.polyNode>
		polyOuts.add(((Object) (outrec)));
	//   25   43:aload_0         
	//   26   44:getfield        #89  <Field List polyOuts>
	//   27   47:aload_1         
	//   28   48:invokeinterface #185 <Method boolean List.add(Object)>
	//   29   53:pop             
		outrec.Idx = polyOuts.size() - 1;
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #89  <Field List polyOuts>
	//   33   59:invokeinterface #396 <Method int List.size()>
	//   34   64:iconst_1        
	//   35   65:isub            
	//   36   66:putfield        #256 <Field int Path$OutRec.Idx>
		return outrec;
	//   37   69:aload_1         
	//   38   70:areturn         
	}

	private void deleteFromAEL(Edge edge)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "deleteFromAEL");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #440 <String "deleteFromAEL">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		Edge edge1 = edge.prevInAEL;
	//    5   14:aload_1         
	//    6   15:getfield        #221 <Field Edge Edge.prevInAEL>
	//    7   18:astore_2        
		Edge edge2 = edge.nextInAEL;
	//    8   19:aload_1         
	//    9   20:getfield        #358 <Field Edge Edge.nextInAEL>
	//   10   23:astore_3        
		if(edge1 == null && edge2 == null && edge != activeEdges)
	//*  11   24:aload_2         
	//*  12   25:ifnonnull       41
	//*  13   28:aload_3         
	//*  14   29:ifnonnull       41
	//*  15   32:aload_1         
	//*  16   33:aload_0         
	//*  17   34:getfield        #72  <Field Edge activeEdges>
	//*  18   37:if_acmpeq       41
			return;
	//   19   40:return          
		if(edge1 != null)
	//*  20   41:aload_2         
	//*  21   42:ifnull          84
			edge1.nextInAEL = edge2;
	//   22   45:aload_2         
	//   23   46:aload_3         
	//   24   47:putfield        #358 <Field Edge Edge.nextInAEL>
		else
	//*  25   50:aload_3         
	//*  26   51:ifnull          59
	//*  27   54:aload_3         
	//*  28   55:aload_2         
	//*  29   56:putfield        #221 <Field Edge Edge.prevInAEL>
	//*  30   59:aload_1         
	//*  31   60:aconst_null     
	//*  32   61:putfield        #358 <Field Edge Edge.nextInAEL>
	//*  33   64:aload_1         
	//*  34   65:aconst_null     
	//*  35   66:putfield        #221 <Field Edge Edge.prevInAEL>
	//*  36   69:getstatic       #58  <Field Logger LOGGER>
	//*  37   72:ldc1            #2   <Class DefaultClipper>
	//*  38   74:invokevirtual   #50  <Method String Class.getName()>
	//*  39   77:ldc2            #440 <String "deleteFromAEL">
	//*  40   80:invokevirtual   #443 <Method void Logger.exiting(String, String)>
	//*  41   83:return          
			activeEdges = edge2;
	//   42   84:aload_0         
	//   43   85:aload_3         
	//   44   86:putfield        #72  <Field Edge activeEdges>
		if(edge2 != null)
			edge2.prevInAEL = edge1;
		edge.nextInAEL = null;
		edge.prevInAEL = null;
		LOGGER.exiting(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "deleteFromAEL");
	//*  45   89:goto            50
	}

	private void deleteFromSEL(Edge edge)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "deleteFromSEL");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #445 <String "deleteFromSEL">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		Edge edge1 = edge.prevInSEL;
	//    5   14:aload_1         
	//    6   15:getfield        #115 <Field Edge Edge.prevInSEL>
	//    7   18:astore_2        
		Edge edge2 = edge.nextInSEL;
	//    8   19:aload_1         
	//    9   20:getfield        #109 <Field Edge Edge.nextInSEL>
	//   10   23:astore_3        
		if(edge1 == null && edge2 == null && !((Object) (edge)).equals(((Object) (sortedEdges))))
	//*  11   24:aload_2         
	//*  12   25:ifnonnull       44
	//*  13   28:aload_3         
	//*  14   29:ifnonnull       44
	//*  15   32:aload_1         
	//*  16   33:aload_0         
	//*  17   34:getfield        #74  <Field Edge sortedEdges>
	//*  18   37:invokevirtual   #344 <Method boolean Object.equals(Object)>
	//*  19   40:ifne            44
			return;
	//   20   43:return          
		if(edge1 != null)
	//*  21   44:aload_2         
	//*  22   45:ifnull          73
			edge1.nextInSEL = edge2;
	//   23   48:aload_2         
	//   24   49:aload_3         
	//   25   50:putfield        #109 <Field Edge Edge.nextInSEL>
		else
	//*  26   53:aload_3         
	//*  27   54:ifnull          62
	//*  28   57:aload_3         
	//*  29   58:aload_2         
	//*  30   59:putfield        #115 <Field Edge Edge.prevInSEL>
	//*  31   62:aload_1         
	//*  32   63:aconst_null     
	//*  33   64:putfield        #109 <Field Edge Edge.nextInSEL>
	//*  34   67:aload_1         
	//*  35   68:aconst_null     
	//*  36   69:putfield        #115 <Field Edge Edge.prevInSEL>
	//*  37   72:return          
			sortedEdges = edge2;
	//   38   73:aload_0         
	//   39   74:aload_3         
	//   40   75:putfield        #74  <Field Edge sortedEdges>
		if(edge2 != null)
			edge2.prevInSEL = edge1;
		edge.nextInSEL = null;
		edge.prevInSEL = null;
	//*  41   78:goto            53
	}

	private boolean doHorzSegmentsOverlap(long l, long l1, long l2, long l3)
	{
		long l5 = l;
	//    0    0:lload_1         
	//    1    1:lstore          11
		long l4 = l1;
	//    2    3:lload_3         
	//    3    4:lstore          9
		if(l > l1)
	//*   4    6:lload_1         
	//*   5    7:lload_3         
	//*   6    8:lcmp            
	//*   7    9:ifle            18
		{
			l4 = l;
	//    8   12:lload_1         
	//    9   13:lstore          9
			l5 = l1;
	//   10   15:lload_3         
	//   11   16:lstore          11
		}
		l1 = l2;
	//   12   18:lload           5
	//   13   20:lstore_3        
		l = l3;
	//   14   21:lload           7
	//   15   23:lstore_1        
		if(l2 > l3)
	//*  16   24:lload           5
	//*  17   26:lload           7
	//*  18   28:lcmp            
	//*  19   29:ifle            38
		{
			l = l2;
	//   20   32:lload           5
	//   21   34:lstore_1        
			l1 = l3;
	//   22   35:lload           7
	//   23   37:lstore_3        
		}
		return l5 < l && l1 < l4;
	//   24   38:lload           11
	//   25   40:lload_1         
	//   26   41:lcmp            
	//   27   42:ifge            54
	//   28   45:lload_3         
	//   29   46:lload           9
	//   30   48:lcmp            
	//   31   49:ifge            54
	//   32   52:iconst_1        
	//   33   53:ireturn         
	//   34   54:iconst_0        
	//   35   55:ireturn         
	}

	private void doMaxima(Edge edge)
	{
		Edge edge2 = edge.getMaximaPair();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #452 <Method Edge Edge.getMaximaPair()>
	//    2    4:astore_3        
		if(edge2 == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       32
		{
			if(edge.outIdx >= 0)
	//*   5    9:aload_1         
	//*   6   10:getfield        #121 <Field int Edge.outIdx>
	//*   7   13:iflt            26
				addOutPt(edge, edge.getTop());
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   12   22:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//   13   25:pop             
			deleteFromAEL(edge);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokespecial   #454 <Method void deleteFromAEL(Edge)>
			return;
	//   17   31:return          
		}
		for(Edge edge1 = edge.nextInAEL; edge1 != null && edge1 != edge2; edge1 = edge.nextInAEL)
	//*  18   32:aload_1         
	//*  19   33:getfield        #358 <Field Edge Edge.nextInAEL>
	//*  20   36:astore_2        
	//*  21   37:aload_2         
	//*  22   38:ifnull          87
	//*  23   41:aload_2         
	//*  24   42:aload_3         
	//*  25   43:if_acmpeq       87
		{
			Point.LongPoint longpoint = new Point.LongPoint(edge.getTop());
	//   26   46:new             #223 <Class Point$LongPoint>
	//   27   49:dup             
	//   28   50:aload_1         
	//   29   51:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   30   54:invokespecial   #313 <Method void Point$LongPoint(Point$LongPoint)>
	//   31   57:astore          4
			intersectEdges(edge, edge1, longpoint);
	//   32   59:aload_0         
	//   33   60:aload_1         
	//   34   61:aload_2         
	//   35   62:aload           4
	//   36   64:invokespecial   #457 <Method void intersectEdges(Edge, Edge, Point$LongPoint)>
			edge.setTop(longpoint);
	//   37   67:aload_1         
	//   38   68:aload           4
	//   39   70:invokevirtual   #460 <Method void Edge.setTop(Point$LongPoint)>
			swapPositionsInAEL(edge, edge1);
	//   40   73:aload_0         
	//   41   74:aload_1         
	//   42   75:aload_2         
	//   43   76:invokespecial   #463 <Method void swapPositionsInAEL(Edge, Edge)>
		}

	//   44   79:aload_1         
	//   45   80:getfield        #358 <Field Edge Edge.nextInAEL>
	//   46   83:astore_2        
	//*  47   84:goto            37
		if(edge.outIdx == -1 && edge2.outIdx == -1)
	//*  48   87:aload_1         
	//*  49   88:getfield        #121 <Field int Edge.outIdx>
	//*  50   91:iconst_m1       
	//*  51   92:icmpne          114
	//*  52   95:aload_3         
	//*  53   96:getfield        #121 <Field int Edge.outIdx>
	//*  54   99:iconst_m1       
	//*  55  100:icmpne          114
		{
			deleteFromAEL(edge);
	//   56  103:aload_0         
	//   57  104:aload_1         
	//   58  105:invokespecial   #454 <Method void deleteFromAEL(Edge)>
			deleteFromAEL(edge2);
	//   59  108:aload_0         
	//   60  109:aload_3         
	//   61  110:invokespecial   #454 <Method void deleteFromAEL(Edge)>
			return;
	//   62  113:return          
		}
		if(edge.outIdx >= 0 && edge2.outIdx >= 0)
	//*  63  114:aload_1         
	//*  64  115:getfield        #121 <Field int Edge.outIdx>
	//*  65  118:iflt            156
	//*  66  121:aload_3         
	//*  67  122:getfield        #121 <Field int Edge.outIdx>
	//*  68  125:iflt            156
		{
			if(edge.outIdx >= 0)
	//*  69  128:aload_1         
	//*  70  129:getfield        #121 <Field int Edge.outIdx>
	//*  71  132:iflt            145
				addLocalMaxPoly(edge, edge2, edge.getTop());
	//   72  135:aload_0         
	//   73  136:aload_1         
	//   74  137:aload_3         
	//   75  138:aload_1         
	//   76  139:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   77  142:invokespecial   #465 <Method void addLocalMaxPoly(Edge, Edge, Point$LongPoint)>
			deleteFromAEL(edge);
	//   78  145:aload_0         
	//   79  146:aload_1         
	//   80  147:invokespecial   #454 <Method void deleteFromAEL(Edge)>
			deleteFromAEL(edge2);
	//   81  150:aload_0         
	//   82  151:aload_3         
	//   83  152:invokespecial   #454 <Method void deleteFromAEL(Edge)>
			return;
	//   84  155:return          
		}
		if(edge.windDelta == 0)
	//*  85  156:aload_1         
	//*  86  157:getfield        #200 <Field int Edge.windDelta>
	//*  87  160:ifne            218
		{
			if(edge.outIdx >= 0)
	//*  88  163:aload_1         
	//*  89  164:getfield        #121 <Field int Edge.outIdx>
	//*  90  167:iflt            185
			{
				addOutPt(edge, edge.getTop());
	//   91  170:aload_0         
	//   92  171:aload_1         
	//   93  172:aload_1         
	//   94  173:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   95  176:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//   96  179:pop             
				edge.outIdx = -1;
	//   97  180:aload_1         
	//   98  181:iconst_m1       
	//   99  182:putfield        #121 <Field int Edge.outIdx>
			}
			deleteFromAEL(edge);
	//  100  185:aload_0         
	//  101  186:aload_1         
	//  102  187:invokespecial   #454 <Method void deleteFromAEL(Edge)>
			if(edge2.outIdx >= 0)
	//* 103  190:aload_3         
	//* 104  191:getfield        #121 <Field int Edge.outIdx>
	//* 105  194:iflt            212
			{
				addOutPt(edge2, edge.getTop());
	//  106  197:aload_0         
	//  107  198:aload_3         
	//  108  199:aload_1         
	//  109  200:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  110  203:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  111  206:pop             
				edge2.outIdx = -1;
	//  112  207:aload_3         
	//  113  208:iconst_m1       
	//  114  209:putfield        #121 <Field int Edge.outIdx>
			}
			deleteFromAEL(edge2);
	//  115  212:aload_0         
	//  116  213:aload_3         
	//  117  214:invokespecial   #454 <Method void deleteFromAEL(Edge)>
			return;
	//  118  217:return          
		} else
		{
			throw new IllegalStateException("DoMaxima error");
	//  119  218:new             #467 <Class IllegalStateException>
	//  120  221:dup             
	//  121  222:ldc2            #469 <String "DoMaxima error">
	//  122  225:invokespecial   #471 <Method void IllegalStateException(String)>
	//  123  228:athrow          
		}
	}

	private void doSimplePolygons()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		do
		{
			int j;
			if(i < polyOuts.size())
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #89  <Field List polyOuts>
	//*   5    7:invokeinterface #396 <Method int List.size()>
	//*   6   12:icmpge          421
			{
				Object obj = ((Object) (polyOuts));
	//    7   15:aload_0         
	//    8   16:getfield        #89  <Field List polyOuts>
	//    9   19:astore          4
				j = i + 1;
	//   10   21:iload_1         
	//   11   22:iconst_1        
	//   12   23:iadd            
	//   13   24:istore_2        
				Path.OutRec outrec = (Path.OutRec)((List) (obj)).get(i);
	//   14   25:aload           4
	//   15   27:iload_1         
	//   16   28:invokeinterface #127 <Method Object List.get(int)>
	//   17   33:checkcast       #129 <Class Path$OutRec>
	//   18   36:astore          7
				obj = ((Object) (outrec.getPoints()));
	//   19   38:aload           7
	//   20   40:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//   21   43:astore          4
				if(obj != null)
	//*  22   45:aload           4
	//*  23   47:ifnull          422
				{
					if(outrec.isOpen)
	//*  24   50:aload           7
	//*  25   52:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//*  26   55:ifeq            63
					{
						i = j;
	//   27   58:iload_2         
	//   28   59:istore_1        
						continue;
	//   29   60:goto            2
					}
					Path.OutPt outpt;
					do
					{
						outpt = ((Path.OutPt) (obj)).next;
	//   30   63:aload           4
	//   31   65:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   32   68:astore          5
						while(outpt != outrec.getPoints()) 
	//*  33   70:aload           5
	//*  34   72:aload           7
	//*  35   74:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  36   77:if_acmpeq       395
						{
							Object obj1 = ((Object) (outpt));
	//   37   80:aload           5
	//   38   82:astore          6
							if(!((Path.OutPt) (obj)).getPt().equals(((Object) (outpt.getPt()))))
								continue;
	//   39   84:aload           4
	//   40   86:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   41   89:aload           5
	//   42   91:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   43   94:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//   44   97:ifeq            260
							obj1 = ((Object) (outpt));
	//   45  100:aload           5
	//   46  102:astore          6
							if(((Object) (outpt.next)).equals(obj))
								continue;
	//   47  104:aload           5
	//   48  106:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   49  109:aload           4
	//   50  111:invokevirtual   #344 <Method boolean Object.equals(Object)>
	//   51  114:ifne            260
							obj1 = ((Object) (outpt));
	//   52  117:aload           5
	//   53  119:astore          6
							if(!((Object) (outpt.prev)).equals(obj))
	//*  54  121:aload           5
	//*  55  123:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  56  126:aload           4
	//*  57  128:invokevirtual   #344 <Method boolean Object.equals(Object)>
	//*  58  131:ifne            260
							{
								obj1 = ((Object) (((Path.OutPt) (obj)).prev));
	//   59  134:aload           4
	//   60  136:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   61  139:astore          6
								Path.OutPt outpt1 = outpt.prev;
	//   62  141:aload           5
	//   63  143:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   64  146:astore          8
								obj.prev = outpt1;
	//   65  148:aload           4
	//   66  150:aload           8
	//   67  152:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
								outpt1.next = ((Path.OutPt) (obj));
	//   68  155:aload           8
	//   69  157:aload           4
	//   70  159:putfield        #266 <Field Path$OutPt Path$OutPt.next>
								outpt.prev = ((Path.OutPt) (obj1));
	//   71  162:aload           5
	//   72  164:aload           6
	//   73  166:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
								obj1.next = outpt;
	//   74  169:aload           6
	//   75  171:aload           5
	//   76  173:putfield        #266 <Field Path$OutPt Path$OutPt.next>
								outrec.setPoints(((Path.OutPt) (obj)));
	//   77  176:aload           7
	//   78  178:aload           4
	//   79  180:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
								obj1 = ((Object) (createOutRec()));
	//   80  183:aload_0         
	//   81  184:invokespecial   #249 <Method Path$OutRec createOutRec()>
	//   82  187:astore          6
								((Path.OutRec) (obj1)).setPoints(outpt);
	//   83  189:aload           6
	//   84  191:aload           5
	//   85  193:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
								updateOutPtIdxs(((Path.OutRec) (obj1)));
	//   86  196:aload_0         
	//   87  197:aload           6
	//   88  199:invokespecial   #476 <Method void updateOutPtIdxs(Path$OutRec)>
								if(poly2ContainsPoly1(((Path.OutRec) (obj1)).getPoints(), outrec.getPoints()))
	//*  89  202:aload           6
	//*  90  204:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  91  207:aload           7
	//*  92  209:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  93  212:invokestatic    #480 <Method boolean poly2ContainsPoly1(Path$OutPt, Path$OutPt)>
	//*  94  215:ifeq            275
								{
									boolean flag;
									if(!outrec.isHole)
	//*  95  218:aload           7
	//*  96  220:getfield        #351 <Field boolean Path$OutRec.isHole>
	//*  97  223:ifne            270
										flag = true;
	//   98  226:iconst_1        
	//   99  227:istore_3        
									else
	//* 100  228:aload           6
	//* 101  230:iload_3         
	//* 102  231:putfield        #351 <Field boolean Path$OutRec.isHole>
	//* 103  234:aload           6
	//* 104  236:aload           7
	//* 105  238:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 106  241:aload_0         
	//* 107  242:getfield        #87  <Field boolean usingPolyTree>
	//* 108  245:ifeq            256
	//* 109  248:aload_0         
	//* 110  249:aload           6
	//* 111  251:aload           7
	//* 112  253:invokespecial   #484 <Method void fixupFirstLefts2(Path$OutRec, Path$OutRec)>
	//* 113  256:aload           4
	//* 114  258:astore          6
	//* 115  260:aload           6
	//* 116  262:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 117  265:astore          5
	//* 118  267:goto            70
										flag = false;
	//  119  270:iconst_0        
	//  120  271:istore_3        
									obj1.isHole = flag;
									obj1.firstLeft = outrec;
									if(usingPolyTree)
										fixupFirstLefts2(((Path.OutRec) (obj1)), outrec);
								} else
	//* 121  272:goto            228
								if(poly2ContainsPoly1(outrec.getPoints(), ((Path.OutRec) (obj1)).getPoints()))
	//* 122  275:aload           7
	//* 123  277:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 124  280:aload           6
	//* 125  282:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 126  285:invokestatic    #480 <Method boolean poly2ContainsPoly1(Path$OutPt, Path$OutPt)>
	//* 127  288:ifeq            357
								{
									obj1.isHole = outrec.isHole;
	//  128  291:aload           6
	//  129  293:aload           7
	//  130  295:getfield        #351 <Field boolean Path$OutRec.isHole>
	//  131  298:putfield        #351 <Field boolean Path$OutRec.isHole>
									boolean flag1;
									if(!((Path.OutRec) (obj1)).isHole)
	//* 132  301:aload           6
	//* 133  303:getfield        #351 <Field boolean Path$OutRec.isHole>
	//* 134  306:ifne            352
										flag1 = true;
	//  135  309:iconst_1        
	//  136  310:istore_3        
									else
	//* 137  311:aload           7
	//* 138  313:iload_3         
	//* 139  314:putfield        #351 <Field boolean Path$OutRec.isHole>
	//* 140  317:aload           6
	//* 141  319:aload           7
	//* 142  321:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 143  324:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 144  327:aload           7
	//* 145  329:aload           6
	//* 146  331:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 147  334:aload_0         
	//* 148  335:getfield        #87  <Field boolean usingPolyTree>
	//* 149  338:ifeq            256
	//* 150  341:aload_0         
	//* 151  342:aload           7
	//* 152  344:aload           6
	//* 153  346:invokespecial   #484 <Method void fixupFirstLefts2(Path$OutRec, Path$OutRec)>
	//* 154  349:goto            256
										flag1 = false;
	//  155  352:iconst_0        
	//  156  353:istore_3        
									outrec.isHole = flag1;
									obj1.firstLeft = outrec.firstLeft;
									outrec.firstLeft = ((Path.OutRec) (obj1));
									if(usingPolyTree)
										fixupFirstLefts2(outrec, ((Path.OutRec) (obj1)));
								} else
	//* 157  354:goto            311
								{
									obj1.isHole = outrec.isHole;
	//  158  357:aload           6
	//  159  359:aload           7
	//  160  361:getfield        #351 <Field boolean Path$OutRec.isHole>
	//  161  364:putfield        #351 <Field boolean Path$OutRec.isHole>
									obj1.firstLeft = outrec.firstLeft;
	//  162  367:aload           6
	//  163  369:aload           7
	//  164  371:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//  165  374:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
									if(usingPolyTree)
	//* 166  377:aload_0         
	//* 167  378:getfield        #87  <Field boolean usingPolyTree>
	//* 168  381:ifeq            256
										fixupFirstLefts1(outrec, ((Path.OutRec) (obj1)));
	//  169  384:aload_0         
	//  170  385:aload           7
	//  171  387:aload           6
	//  172  389:invokespecial   #487 <Method void fixupFirstLefts1(Path$OutRec, Path$OutRec)>
								}
								obj1 = obj;
							}
							outpt = ((Path.OutPt) (obj1)).next;
						}
	//* 173  392:goto            256
						outpt = ((Path.OutPt) (obj)).next;
	//  174  395:aload           4
	//  175  397:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  176  400:astore          5
						obj = ((Object) (outpt));
	//  177  402:aload           5
	//  178  404:astore          4
					} while(outpt != outrec.getPoints());
	//  179  406:aload           5
	//  180  408:aload           7
	//  181  410:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//  182  413:if_acmpne       63
					i = j;
	//  183  416:iload_2         
	//  184  417:istore_1        
					continue;
	//  185  418:goto            2
				}
			} else
			{
				return;
	//  186  421:return          
			}
			i = j;
	//  187  422:iload_2         
	//  188  423:istore_1        
		} while(true);
	//  189  424:goto            2
	}

	private boolean executeInternal()
	{
		Object obj;
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #491 <Method void reset()>
		obj = ((Object) (currentLM));
	//    2    4:aload_0         
	//    3    5:getfield        #495 <Field ClipperBase$LocalMinima currentLM>
	//    4    8:astore          9
		if(obj == null)
	//*   5   10:aload           9
	//*   6   12:ifnonnull       35
		{
			joins.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #91  <Field List joins>
	//    9   19:invokeinterface #496 <Method void List.clear()>
			ghostJoins.clear();
	//   10   24:aload_0         
	//   11   25:getfield        #93  <Field List ghostJoins>
	//   12   28:invokeinterface #496 <Method void List.clear()>
			return false;
	//   13   33:iconst_0        
	//   14   34:ireturn         
		}
		long l = popScanbeam();
	//   15   35:aload_0         
	//   16   36:invokespecial   #499 <Method long popScanbeam()>
	//   17   39:lstore_3        
_L7:
		insertLocalMinimaIntoAEL(l);
	//   18   40:aload_0         
	//   19   41:lload_3         
	//   20   42:invokespecial   #502 <Method void insertLocalMinimaIntoAEL(long)>
		processHorizontals();
	//   21   45:aload_0         
	//   22   46:invokespecial   #505 <Method void processHorizontals()>
		ghostJoins.clear();
	//   23   49:aload_0         
	//   24   50:getfield        #93  <Field List ghostJoins>
	//   25   53:invokeinterface #496 <Method void List.clear()>
		if(scanbeam == null)
	//*  26   58:aload_0         
	//*  27   59:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//*  28   62:ifnonnull       115
			break; /* Loop/switch isn't completed */
	//   29   65:goto            358
		  goto _L1
_L10:
		int i;
		if(i >= polyOuts.size()) goto _L3; else goto _L2
	//   30   68:iload_1         
	//   31   69:aload_0         
	//   32   70:getfield        #89  <Field List polyOuts>
	//   33   73:invokeinterface #396 <Method int List.size()>
	//   34   78:icmpge          256
_L2:
		obj = ((Object) ((Path.OutRec)polyOuts.get(i)));
	//   35   81:aload_0         
	//   36   82:getfield        #89  <Field List polyOuts>
	//   37   85:iload_1         
	//   38   86:invokeinterface #127 <Method Object List.get(int)>
	//   39   91:checkcast       #129 <Class Path$OutRec>
	//   40   94:astore          9
		if(((Path.OutRec) (obj)).pts != null && !((Path.OutRec) (obj)).isOpen) goto _L5; else goto _L4
	//   41   96:aload           9
	//   42   98:getfield        #142 <Field Path$OutPt Path$OutRec.pts>
	//   43  101:ifnull          363
	//   44  104:aload           9
	//   45  106:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//   46  109:ifeq            183
	//*  47  112:goto            363
_L1:
		long l1;
		boolean flag1;
		l1 = popScanbeam();
	//   48  115:aload_0         
	//   49  116:invokespecial   #499 <Method long popScanbeam()>
	//   50  119:lstore          5
		flag1 = processIntersections(l1);
	//   51  121:aload_0         
	//   52  122:lload           5
	//   53  124:invokespecial   #509 <Method boolean processIntersections(long)>
	//   54  127:istore          7
		if(!flag1)
	//*  55  129:iload           7
	//*  56  131:ifne            154
		{
			joins.clear();
	//   57  134:aload_0         
	//   58  135:getfield        #91  <Field List joins>
	//   59  138:invokeinterface #496 <Method void List.clear()>
			ghostJoins.clear();
	//   60  143:aload_0         
	//   61  144:getfield        #93  <Field List ghostJoins>
	//   62  147:invokeinterface #496 <Method void List.clear()>
			return false;
	//   63  152:iconst_0        
	//   64  153:ireturn         
		}
		processEdgesAtTopOfScanbeam(l1);
	//   65  154:aload_0         
	//   66  155:lload           5
	//   67  157:invokespecial   #512 <Method void processEdgesAtTopOfScanbeam(long)>
		l = l1;
	//   68  160:lload           5
	//   69  162:lstore_3        
		if(scanbeam != null) goto _L7; else goto _L6
	//   70  163:aload_0         
	//   71  164:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//   72  167:ifnonnull       40
_L6:
		l = l1;
	//   73  170:lload           5
	//   74  172:lstore_3        
		if(currentLM != null) goto _L7; else goto _L8
	//   75  173:aload_0         
	//   76  174:getfield        #495 <Field ClipperBase$LocalMinima currentLM>
	//   77  177:ifnonnull       40
	//*  78  180:goto            358
_L5:
		boolean flag2;
		flag1 = ((Path.OutRec) (obj)).isHole;
	//   79  183:aload           9
	//   80  185:getfield        #351 <Field boolean Path$OutRec.isHole>
	//   81  188:istore          7
		flag2 = reverseSolution;
	//   82  190:aload_0         
	//   83  191:getfield        #95  <Field boolean reverseSolution>
	//   84  194:istore          8
		boolean flag;
		Exception exception;
		if(((Path.OutRec) (obj)).area() > 0.0D)
	//*  85  196:aload           9
	//*  86  198:invokevirtual   #516 <Method double Path$OutRec.area()>
	//*  87  201:dconst_0        
	//*  88  202:dcmpl           
	//*  89  203:ifle            251
			flag = true;
	//   90  206:iconst_1        
	//   91  207:istore_2        
		else
	//*  92  208:iload           8
	//*  93  210:iload           7
	//*  94  212:ixor            
	//*  95  213:iload_2         
	//*  96  214:icmpne          363
	//*  97  217:aload           9
	//*  98  219:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  99  222:invokevirtual   #338 <Method void Path$OutPt.reversePolyPtLinks()>
	//* 100  225:goto            363
	//* 101  228:astore          9
	//* 102  230:aload_0         
	//* 103  231:getfield        #91  <Field List joins>
	//* 104  234:invokeinterface #496 <Method void List.clear()>
	//* 105  239:aload_0         
	//* 106  240:getfield        #93  <Field List ghostJoins>
	//* 107  243:invokeinterface #496 <Method void List.clear()>
	//* 108  248:aload           9
	//* 109  250:athrow          
			flag = false;
	//  110  251:iconst_0        
	//  111  252:istore_2        
		if((flag2 ^ flag1) != flag) goto _L4; else goto _L9
_L9:
		((Path.OutRec) (obj)).getPoints().reversePolyPtLinks();
		  goto _L4
		exception;
		joins.clear();
		ghostJoins.clear();
		throw exception;
	//* 112  253:goto            208
_L3:
		joinCommonEdges();
	//  113  256:aload_0         
	//  114  257:invokespecial   #519 <Method void joinCommonEdges()>
		i = 0;
	//  115  260:iconst_0        
	//  116  261:istore_1        
_L11:
		if(i >= polyOuts.size())
			break MISSING_BLOCK_LABEL_327;
	//  117  262:iload_1         
	//  118  263:aload_0         
	//  119  264:getfield        #89  <Field List polyOuts>
	//  120  267:invokeinterface #396 <Method int List.size()>
	//  121  272:icmpge          327
		exception = ((Exception) ((Path.OutRec)polyOuts.get(i)));
	//  122  275:aload_0         
	//  123  276:getfield        #89  <Field List polyOuts>
	//  124  279:iload_1         
	//  125  280:invokeinterface #127 <Method Object List.get(int)>
	//  126  285:checkcast       #129 <Class Path$OutRec>
	//  127  288:astore          9
		if(((Path.OutRec) (exception)).getPoints() == null)
	//* 128  290:aload           9
	//* 129  292:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 130  295:ifnonnull       301
			break MISSING_BLOCK_LABEL_370;
	//  131  298:goto            370
		if(((Path.OutRec) (exception)).isOpen)
	//* 132  301:aload           9
	//* 133  303:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//* 134  306:ifeq            318
		{
			fixupOutPolyline(((Path.OutRec) (exception)));
	//  135  309:aload_0         
	//  136  310:aload           9
	//  137  312:invokespecial   #522 <Method void fixupOutPolyline(Path$OutRec)>
			break MISSING_BLOCK_LABEL_370;
	//  138  315:goto            370
		}
		fixupOutPolygon(((Path.OutRec) (exception)));
	//  139  318:aload_0         
	//  140  319:aload           9
	//  141  321:invokespecial   #525 <Method void fixupOutPolygon(Path$OutRec)>
		break MISSING_BLOCK_LABEL_370;
	//  142  324:goto            370
		if(strictlySimple)
	//* 143  327:aload_0         
	//* 144  328:getfield        #97  <Field boolean strictlySimple>
	//* 145  331:ifeq            338
			doSimplePolygons();
	//  146  334:aload_0         
	//  147  335:invokespecial   #527 <Method void doSimplePolygons()>
		joins.clear();
	//  148  338:aload_0         
	//  149  339:getfield        #91  <Field List joins>
	//  150  342:invokeinterface #496 <Method void List.clear()>
		ghostJoins.clear();
	//  151  347:aload_0         
	//  152  348:getfield        #93  <Field List ghostJoins>
	//  153  351:invokeinterface #496 <Method void List.clear()>
		return true;
	//  154  356:iconst_1        
	//  155  357:ireturn         
_L8:
		i = 0;
	//  156  358:iconst_0        
	//  157  359:istore_1        
		  goto _L10
	//* 158  360:goto            68
_L4:
		i++;
	//  159  363:iload_1         
	//  160  364:iconst_1        
	//  161  365:iadd            
	//  162  366:istore_1        
		  goto _L10
	//* 163  367:goto            68
		i++;
	//  164  370:iload_1         
	//  165  371:iconst_1        
	//  166  372:iadd            
	//  167  373:istore_1        
		  goto _L11
	//* 168  374:goto            262
	}

	private void fixupFirstLefts1(Path.OutRec outrec, Path.OutRec outrec1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		do
		{
			if(i >= polyOuts.size())
				break;
	//    2    2:iload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #89  <Field List polyOuts>
	//    5    7:invokeinterface #396 <Method int List.size()>
	//    6   12:icmpge          92
			Path.OutRec outrec2 = (Path.OutRec)polyOuts.get(i);
	//    7   15:aload_0         
	//    8   16:getfield        #89  <Field List polyOuts>
	//    9   19:iload_3         
	//   10   20:invokeinterface #127 <Method Object List.get(int)>
	//   11   25:checkcast       #129 <Class Path$OutRec>
	//   12   28:astore          4
			if(outrec2.getPoints() != null && outrec2.firstLeft != null && ((Object) (parseFirstLeft(outrec2.firstLeft))).equals(((Object) (outrec))) && poly2ContainsPoly1(outrec2.getPoints(), outrec1.getPoints()))
	//*  13   30:aload           4
	//*  14   32:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  15   35:ifnull          46
	//*  16   38:aload           4
	//*  17   40:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//*  18   43:ifnonnull       53
	//*  19   46:iload_3         
	//*  20   47:iconst_1        
	//*  21   48:iadd            
	//*  22   49:istore_3        
	//*  23   50:goto            2
	//*  24   53:aload           4
	//*  25   55:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//*  26   58:invokestatic    #531 <Method Path$OutRec parseFirstLeft(Path$OutRec)>
	//*  27   61:aload_1         
	//*  28   62:invokevirtual   #344 <Method boolean Object.equals(Object)>
	//*  29   65:ifeq            46
	//*  30   68:aload           4
	//*  31   70:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  32   73:aload_2         
	//*  33   74:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  34   77:invokestatic    #480 <Method boolean poly2ContainsPoly1(Path$OutPt, Path$OutPt)>
	//*  35   80:ifeq            46
				outrec2.firstLeft = outrec1;
	//   36   83:aload           4
	//   37   85:aload_2         
	//   38   86:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
			i++;
		} while(true);
	//*  39   89:goto            46
	//   40   92:return          
	}

	private void fixupFirstLefts2(Path.OutRec outrec, Path.OutRec outrec1)
	{
		Iterator iterator = polyOuts.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field List polyOuts>
	//    2    4:invokeinterface #535 <Method Iterator List.iterator()>
	//    3    9:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   10:aload_3         
	//    5   11:invokeinterface #540 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            48
			Path.OutRec outrec2 = (Path.OutRec)iterator.next();
	//    7   19:aload_3         
	//    8   20:invokeinterface #543 <Method Object Iterator.next()>
	//    9   25:checkcast       #129 <Class Path$OutRec>
	//   10   28:astore          4
			if(outrec2.firstLeft == outrec)
	//*  11   30:aload           4
	//*  12   32:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//*  13   35:aload_1         
	//*  14   36:if_acmpne       10
				outrec2.firstLeft = outrec1;
	//   15   39:aload           4
	//   16   41:aload_2         
	//   17   42:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
		} while(true);
	//   18   45:goto            10
	//   19   48:return          
	}

	private boolean fixupIntersectionOrder()
	{
		Collections.sort(intersectList, intersectNodeComparer);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field List intersectList>
	//    2    4:aload_0         
	//    3    5:getfield        #85  <Field Comparator intersectNodeComparer>
	//    4    8:invokestatic    #550 <Method void Collections.sort(List, Comparator)>
		copyAELToSEL();
	//    5   11:aload_0         
	//    6   12:invokespecial   #552 <Method void copyAELToSEL()>
		int k = intersectList.size();
	//    7   15:aload_0         
	//    8   16:getfield        #80  <Field List intersectList>
	//    9   19:invokeinterface #396 <Method int List.size()>
	//   10   24:istore_3        
		for(int i = 0; i < k; i++)
	//*  11   25:iconst_0        
	//*  12   26:istore_1        
	//*  13   27:iload_1         
	//*  14   28:iload_3         
	//*  15   29:icmpge          187
		{
			if(!EdgesAdjacent((IntersectNode)intersectList.get(i)))
	//*  16   32:aload_0         
	//*  17   33:aload_0         
	//*  18   34:getfield        #80  <Field List intersectList>
	//*  19   37:iload_1         
	//*  20   38:invokeinterface #127 <Method Object List.get(int)>
	//*  21   43:checkcast       #10  <Class DefaultClipper$IntersectNode>
	//*  22   46:invokespecial   #554 <Method boolean EdgesAdjacent(DefaultClipper$IntersectNode)>
	//*  23   49:ifne            144
			{
				int j;
				for(j = i + 1; j < k && !EdgesAdjacent((IntersectNode)intersectList.get(j)); j++);
	//   24   52:iload_1         
	//   25   53:iconst_1        
	//   26   54:iadd            
	//   27   55:istore_2        
	//   28   56:iload_2         
	//   29   57:iload_3         
	//   30   58:icmpge          88
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:getfield        #80  <Field List intersectList>
	//   34   66:iload_2         
	//   35   67:invokeinterface #127 <Method Object List.get(int)>
	//   36   72:checkcast       #10  <Class DefaultClipper$IntersectNode>
	//   37   75:invokespecial   #554 <Method boolean EdgesAdjacent(DefaultClipper$IntersectNode)>
	//   38   78:ifne            88
	//   39   81:iload_2         
	//   40   82:iconst_1        
	//   41   83:iadd            
	//   42   84:istore_2        
	//*  43   85:goto            56
				if(j == k)
	//*  44   88:iload_2         
	//*  45   89:iload_3         
	//*  46   90:icmpne          95
					return false;
	//   47   93:iconst_0        
	//   48   94:ireturn         
				IntersectNode intersectnode = (IntersectNode)intersectList.get(i);
	//   49   95:aload_0         
	//   50   96:getfield        #80  <Field List intersectList>
	//   51   99:iload_1         
	//   52  100:invokeinterface #127 <Method Object List.get(int)>
	//   53  105:checkcast       #10  <Class DefaultClipper$IntersectNode>
	//   54  108:astore          4
				intersectList.set(i, intersectList.get(j));
	//   55  110:aload_0         
	//   56  111:getfield        #80  <Field List intersectList>
	//   57  114:iload_1         
	//   58  115:aload_0         
	//   59  116:getfield        #80  <Field List intersectList>
	//   60  119:iload_2         
	//   61  120:invokeinterface #127 <Method Object List.get(int)>
	//   62  125:invokeinterface #558 <Method Object List.set(int, Object)>
	//   63  130:pop             
				intersectList.set(j, ((Object) (intersectnode)));
	//   64  131:aload_0         
	//   65  132:getfield        #80  <Field List intersectList>
	//   66  135:iload_2         
	//   67  136:aload           4
	//   68  138:invokeinterface #558 <Method Object List.set(int, Object)>
	//   69  143:pop             
			}
			swapPositionsInSEL(((IntersectNode)intersectList.get(i)).edge1, ((IntersectNode)intersectList.get(i)).Edge2);
	//   70  144:aload_0         
	//   71  145:aload_0         
	//   72  146:getfield        #80  <Field List intersectList>
	//   73  149:iload_1         
	//   74  150:invokeinterface #127 <Method Object List.get(int)>
	//   75  155:checkcast       #10  <Class DefaultClipper$IntersectNode>
	//   76  158:getfield        #104 <Field Edge DefaultClipper$IntersectNode.edge1>
	//   77  161:aload_0         
	//   78  162:getfield        #80  <Field List intersectList>
	//   79  165:iload_1         
	//   80  166:invokeinterface #127 <Method Object List.get(int)>
	//   81  171:checkcast       #10  <Class DefaultClipper$IntersectNode>
	//   82  174:getfield        #112 <Field Edge DefaultClipper$IntersectNode.Edge2>
	//   83  177:invokespecial   #386 <Method void swapPositionsInSEL(Edge, Edge)>
		}

	//   84  180:iload_1         
	//   85  181:iconst_1        
	//   86  182:iadd            
	//   87  183:istore_1        
	//*  88  184:goto            27
		return true;
	//   89  187:iconst_1        
	//   90  188:ireturn         
	}

	private void fixupOutPolygon(Path.OutRec outrec)
	{
		Path.OutPt outpt1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		outrec.bottomPt = null;
	//    2    3:aload_1         
	//    3    4:aconst_null     
	//    4    5:putfield        #341 <Field Path$OutPt Path$OutRec.bottomPt>
		Path.OutPt outpt = outrec.getPoints();
	//    5    8:aload_1         
	//    6    9:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//    7   12:astore_3        
		boolean flag;
		if(preserveCollinear || strictlySimple)
	//*   8   13:aload_0         
	//*   9   14:getfield        #561 <Field boolean preserveCollinear>
	//*  10   17:ifne            27
	//*  11   20:aload_0         
	//*  12   21:getfield        #97  <Field boolean strictlySimple>
	//*  13   24:ifeq            54
			flag = true;
	//   14   27:iconst_1        
	//   15   28:istore_2        
		else
	//*  16   29:aload_3         
	//*  17   30:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  18   33:aload_3         
	//*  19   34:if_acmpeq       48
	//*  20   37:aload_3         
	//*  21   38:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  22   41:aload_3         
	//*  23   42:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//*  24   45:if_acmpne       59
	//*  25   48:aload_1         
	//*  26   49:aconst_null     
	//*  27   50:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
	//*  28   53:return          
			flag = false;
	//   29   54:iconst_0        
	//   30   55:istore_2        
		do
		{
			if(outpt.prev == outpt || outpt.prev == outpt.next)
			{
				outrec.setPoints(((Path.OutPt) (null)));
				return;
			}
	//*  31   56:goto            29
			if(outpt.getPt().equals(((Object) (outpt.next.getPt()))) || outpt.getPt().equals(((Object) (outpt.prev.getPt()))) || Point.slopesEqual(outpt.prev.getPt(), outpt.getPt(), outpt.next.getPt(), useFullRange) && (!flag || !Point.isPt2BetweenPt1AndPt3(outpt.prev.getPt(), outpt.getPt(), outpt.next.getPt())))
	//*  32   59:aload_3         
	//*  33   60:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  34   63:aload_3         
	//*  35   64:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//*  36   67:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  37   70:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  38   73:ifne            149
	//*  39   76:aload_3         
	//*  40   77:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  41   80:aload_3         
	//*  42   81:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  43   84:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  44   87:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  45   90:ifne            149
	//*  46   93:aload_3         
	//*  47   94:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  48   97:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  49  100:aload_3         
	//*  50  101:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  51  104:aload_3         
	//*  52  105:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//*  53  108:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  54  111:aload_0         
	//*  55  112:getfield        #234 <Field boolean useFullRange>
	//*  56  115:invokestatic    #566 <Method boolean Point.slopesEqual(Point$LongPoint, Point$LongPoint, Point$LongPoint, boolean)>
	//*  57  118:ifeq            182
	//*  58  121:iload_2         
	//*  59  122:ifeq            149
	//*  60  125:aload_3         
	//*  61  126:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  62  129:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  63  132:aload_3         
	//*  64  133:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  65  136:aload_3         
	//*  66  137:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//*  67  140:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  68  143:invokestatic    #570 <Method boolean Point.isPt2BetweenPt1AndPt3(Point$LongPoint, Point$LongPoint, Point$LongPoint)>
	//*  69  146:ifne            182
			{
				outpt1 = null;
	//   70  149:aconst_null     
	//   71  150:astore          4
				outpt.prev.next = outpt.next;
	//   72  152:aload_3         
	//   73  153:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   74  156:aload_3         
	//   75  157:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   76  160:putfield        #266 <Field Path$OutPt Path$OutPt.next>
				outpt.next.prev = outpt.prev;
	//   77  163:aload_3         
	//   78  164:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   79  167:aload_3         
	//   80  168:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   81  171:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
				outpt = outpt.prev;
	//   82  174:aload_3         
	//   83  175:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   84  178:astore_3        
			} else
	//*  85  179:goto            29
			{
				if(outpt == outpt1)
	//*  86  182:aload_3         
	//*  87  183:aload           4
	//*  88  185:if_acmpne       194
				{
					outrec.setPoints(outpt);
	//   89  188:aload_1         
	//   90  189:aload_3         
	//   91  190:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
					return;
	//   92  193:return          
				}
				Path.OutPt outpt2 = outpt1;
	//   93  194:aload           4
	//   94  196:astore          5
				if(outpt1 == null)
	//*  95  198:aload           4
	//*  96  200:ifnonnull       206
					outpt2 = outpt;
	//   97  203:aload_3         
	//   98  204:astore          5
				outpt = outpt.next;
	//   99  206:aload_3         
	//  100  207:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  101  210:astore_3        
				outpt1 = outpt2;
	//  102  211:aload           5
	//  103  213:astore          4
			}
		} while(true);
	//  104  215:goto            29
	}

	private void fixupOutPolyline(Path.OutRec outrec)
	{
		Path.OutPt outpt = outrec.pts;
	//    0    0:aload_1         
	//    1    1:getfield        #142 <Field Path$OutPt Path$OutRec.pts>
	//    2    4:astore_2        
		Path.OutPt outpt1 = outpt.prev;
	//    3    5:aload_2         
	//    4    6:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//    5    9:astore_3        
		do
		{
			if(outpt == outpt1)
				break;
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:if_acmpeq       92
			Path.OutPt outpt2 = outpt.next;
	//    9   15:aload_2         
	//   10   16:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   11   19:astore          4
			outpt = outpt2;
	//   12   21:aload           4
	//   13   23:astore_2        
			if(outpt2.pt.equals(((Object) (outpt2.prev.pt))))
	//*  14   24:aload           4
	//*  15   26:getfield        #263 <Field Point$LongPoint Path$OutPt.pt>
	//*  16   29:aload           4
	//*  17   31:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  18   34:getfield        #263 <Field Point$LongPoint Path$OutPt.pt>
	//*  19   37:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  20   40:ifeq            10
			{
				outpt = outpt1;
	//   21   43:aload_3         
	//   22   44:astore_2        
				if(outpt2 == outpt1)
	//*  23   45:aload           4
	//*  24   47:aload_3         
	//*  25   48:if_acmpne       57
					outpt = outpt2.prev;
	//   26   51:aload           4
	//   27   53:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   28   56:astore_2        
				outpt1 = outpt2.prev;
	//   29   57:aload           4
	//   30   59:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//   31   62:astore_3        
				outpt1.next = outpt2.next;
	//   32   63:aload_3         
	//   33   64:aload           4
	//   34   66:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   35   69:putfield        #266 <Field Path$OutPt Path$OutPt.next>
				outpt2.next.prev = outpt1;
	//   36   72:aload           4
	//   37   74:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   38   77:aload_3         
	//   39   78:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
				outpt2 = outpt1;
	//   40   81:aload_3         
	//   41   82:astore          4
				outpt1 = outpt;
	//   42   84:aload_2         
	//   43   85:astore_3        
				outpt = outpt2;
	//   44   86:aload           4
	//   45   88:astore_2        
			}
		} while(true);
	//   46   89:goto            10
		if(outpt == outpt.prev)
	//*  47   92:aload_2         
	//*  48   93:aload_2         
	//*  49   94:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//*  50   97:if_acmpne       105
			outrec.pts = null;
	//   51  100:aload_1         
	//   52  101:aconst_null     
	//   53  102:putfield        #142 <Field Path$OutPt Path$OutRec.pts>
	//   54  105:return          
	}

	private static void getHorzDirection(Edge edge, Clipper.Direction adirection[], long al[], long al1[])
	{
		if(edge.getBot().getX() < edge.getTop().getX())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//*   2    4:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*   5   11:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*   6   14:lcmp            
	//*   7   15:ifge            45
		{
			al[0] = edge.getBot().getX();
	//    8   18:aload_2         
	//    9   19:iconst_0        
	//   10   20:aload_0         
	//   11   21:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   12   24:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   13   27:lastore         
			al1[0] = edge.getTop().getX();
	//   14   28:aload_3         
	//   15   29:iconst_0        
	//   16   30:aload_0         
	//   17   31:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   18   34:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   19   37:lastore         
			adirection[0] = Clipper.Direction.LEFT_TO_RIGHT;
	//   20   38:aload_1         
	//   21   39:iconst_0        
	//   22   40:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//   23   43:aastore         
			return;
	//   24   44:return          
		} else
		{
			al[0] = edge.getTop().getX();
	//   25   45:aload_2         
	//   26   46:iconst_0        
	//   27   47:aload_0         
	//   28   48:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   29   51:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   30   54:lastore         
			al1[0] = edge.getBot().getX();
	//   31   55:aload_3         
	//   32   56:iconst_0        
	//   33   57:aload_0         
	//   34   58:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   35   61:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   36   64:lastore         
			adirection[0] = Clipper.Direction.RIGHT_TO_LEFT;
	//   37   65:aload_1         
	//   38   66:iconst_0        
	//   39   67:getstatic       #584 <Field Clipper$Direction Clipper$Direction.RIGHT_TO_LEFT>
	//   40   70:aastore         
			return;
	//   41   71:return          
		}
	}

	private Path.OutRec getOutRec(int i)
	{
		Path.OutRec outrec;
		for(outrec = (Path.OutRec)polyOuts.get(i); outrec != polyOuts.get(outrec.Idx); outrec = (Path.OutRec)polyOuts.get(outrec.Idx));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field List polyOuts>
	//    2    4:iload_1         
	//    3    5:invokeinterface #127 <Method Object List.get(int)>
	//    4   10:checkcast       #129 <Class Path$OutRec>
	//    5   13:astore_2        
	//    6   14:aload_2         
	//    7   15:aload_0         
	//    8   16:getfield        #89  <Field List polyOuts>
	//    9   19:aload_2         
	//   10   20:getfield        #256 <Field int Path$OutRec.Idx>
	//   11   23:invokeinterface #127 <Method Object List.get(int)>
	//   12   28:if_acmpeq       51
	//   13   31:aload_0         
	//   14   32:getfield        #89  <Field List polyOuts>
	//   15   35:aload_2         
	//   16   36:getfield        #256 <Field int Path$OutRec.Idx>
	//   17   39:invokeinterface #127 <Method Object List.get(int)>
	//   18   44:checkcast       #129 <Class Path$OutRec>
	//   19   47:astore_2        
	//*  20   48:goto            14
		return outrec;
	//   21   51:aload_2         
	//   22   52:areturn         
	}

	private static boolean getOverlap(long l, long l1, long l2, long l3, 
			long al[], long al1[])
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          10
		if(l < l1)
	//*   2    3:lload_0         
	//*   3    4:lload_2         
	//*   4    5:lcmp            
	//*   5    6:ifge            78
		{
			if(l2 < l3)
	//*   6    9:lload           4
	//*   7   11:lload           6
	//*   8   13:lcmp            
	//*   9   14:ifge            55
			{
				al[0] = Math.max(l, l2);
	//   10   17:aload           8
	//   11   19:iconst_0        
	//   12   20:lload_0         
	//   13   21:lload           4
	//   14   23:invokestatic    #594 <Method long Math.max(long, long)>
	//   15   26:lastore         
				al1[0] = Math.min(l1, l3);
	//   16   27:aload           9
	//   17   29:iconst_0        
	//   18   30:lload_2         
	//   19   31:lload           6
	//   20   33:invokestatic    #597 <Method long Math.min(long, long)>
	//   21   36:lastore         
			} else
	//*  22   37:aload           8
	//*  23   39:iconst_0        
	//*  24   40:laload          
	//*  25   41:aload           9
	//*  26   43:iconst_0        
	//*  27   44:laload          
	//*  28   45:lcmp            
	//*  29   46:ifge            52
	//*  30   49:iconst_1        
	//*  31   50:istore          10
	//*  32   52:iload           10
	//*  33   54:ireturn         
			{
				al[0] = Math.max(l, l3);
	//   34   55:aload           8
	//   35   57:iconst_0        
	//   36   58:lload_0         
	//   37   59:lload           6
	//   38   61:invokestatic    #594 <Method long Math.max(long, long)>
	//   39   64:lastore         
				al1[0] = Math.min(l1, l2);
	//   40   65:aload           9
	//   41   67:iconst_0        
	//   42   68:lload_2         
	//   43   69:lload           4
	//   44   71:invokestatic    #597 <Method long Math.min(long, long)>
	//   45   74:lastore         
			}
		} else
	//*  46   75:goto            37
		if(l2 < l3)
	//*  47   78:lload           4
	//*  48   80:lload           6
	//*  49   82:lcmp            
	//*  50   83:ifge            109
		{
			al[0] = Math.max(l1, l2);
	//   51   86:aload           8
	//   52   88:iconst_0        
	//   53   89:lload_2         
	//   54   90:lload           4
	//   55   92:invokestatic    #594 <Method long Math.max(long, long)>
	//   56   95:lastore         
			al1[0] = Math.min(l, l3);
	//   57   96:aload           9
	//   58   98:iconst_0        
	//   59   99:lload_0         
	//   60  100:lload           6
	//   61  102:invokestatic    #597 <Method long Math.min(long, long)>
	//   62  105:lastore         
		} else
	//*  63  106:goto            37
		{
			al[0] = Math.max(l1, l3);
	//   64  109:aload           8
	//   65  111:iconst_0        
	//   66  112:lload_2         
	//   67  113:lload           6
	//   68  115:invokestatic    #594 <Method long Math.max(long, long)>
	//   69  118:lastore         
			al1[0] = Math.min(l, l2);
	//   70  119:aload           9
	//   71  121:iconst_0        
	//   72  122:lload_0         
	//   73  123:lload           4
	//   74  125:invokestatic    #597 <Method long Math.min(long, long)>
	//   75  128:lastore         
		}
		if(al[0] < al1[0])
			flag = true;
		return flag;
	//*  76  129:goto            37
	}

	private void insertEdgeIntoAEL(Edge edge, Edge edge1)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "insertEdgeIntoAEL");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #599 <String "insertEdgeIntoAEL">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		if(activeEdges == null)
	//*   5   14:aload_0         
	//*   6   15:getfield        #72  <Field Edge activeEdges>
	//*   7   18:ifnonnull       76
		{
			edge.prevInAEL = null;
	//    8   21:aload_1         
	//    9   22:aconst_null     
	//   10   23:putfield        #221 <Field Edge Edge.prevInAEL>
			edge.nextInAEL = null;
	//   11   26:aload_1         
	//   12   27:aconst_null     
	//   13   28:putfield        #358 <Field Edge Edge.nextInAEL>
			LOGGER.finest((new StringBuilder()).append("Edge ").append(edge.outIdx).append(" -> ").append(((Object) (null))).toString());
	//   14   31:getstatic       #58  <Field Logger LOGGER>
	//   15   34:new             #276 <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #277 <Method void StringBuilder()>
	//   18   41:ldc2            #601 <String "Edge ">
	//   19   44:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   20   47:aload_1         
	//   21   48:getfield        #121 <Field int Edge.outIdx>
	//   22   51:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//   23   54:ldc2            #603 <String " -> ">
	//   24   57:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aconst_null     
	//   26   61:invokevirtual   #305 <Method StringBuilder StringBuilder.append(Object)>
	//   27   64:invokevirtual   #293 <Method String StringBuilder.toString()>
	//   28   67:invokevirtual   #297 <Method void Logger.finest(String)>
			activeEdges = edge;
	//   29   70:aload_0         
	//   30   71:aload_1         
	//   31   72:putfield        #72  <Field Edge activeEdges>
			return;
	//   32   75:return          
		}
		if(edge1 == null && Edge.doesE2InsertBeforeE1(activeEdges, edge))
	//*  33   76:aload_2         
	//*  34   77:ifnonnull       163
	//*  35   80:aload_0         
	//*  36   81:getfield        #72  <Field Edge activeEdges>
	//*  37   84:aload_1         
	//*  38   85:invokestatic    #607 <Method boolean Edge.doesE2InsertBeforeE1(Edge, Edge)>
	//*  39   88:ifeq            163
		{
			edge.prevInAEL = null;
	//   40   91:aload_1         
	//   41   92:aconst_null     
	//   42   93:putfield        #221 <Field Edge Edge.prevInAEL>
			edge.nextInAEL = activeEdges;
	//   43   96:aload_1         
	//   44   97:aload_0         
	//   45   98:getfield        #72  <Field Edge activeEdges>
	//   46  101:putfield        #358 <Field Edge Edge.nextInAEL>
			LOGGER.finest((new StringBuilder()).append("Edge ").append(edge.outIdx).append(" -> ").append(edge.nextInAEL.outIdx).toString());
	//   47  104:getstatic       #58  <Field Logger LOGGER>
	//   48  107:new             #276 <Class StringBuilder>
	//   49  110:dup             
	//   50  111:invokespecial   #277 <Method void StringBuilder()>
	//   51  114:ldc2            #601 <String "Edge ">
	//   52  117:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   53  120:aload_1         
	//   54  121:getfield        #121 <Field int Edge.outIdx>
	//   55  124:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//   56  127:ldc2            #603 <String " -> ">
	//   57  130:invokevirtual   #283 <Method StringBuilder StringBuilder.append(String)>
	//   58  133:aload_1         
	//   59  134:getfield        #358 <Field Edge Edge.nextInAEL>
	//   60  137:getfield        #121 <Field int Edge.outIdx>
	//   61  140:invokevirtual   #290 <Method StringBuilder StringBuilder.append(int)>
	//   62  143:invokevirtual   #293 <Method String StringBuilder.toString()>
	//   63  146:invokevirtual   #297 <Method void Logger.finest(String)>
			activeEdges.prevInAEL = edge;
	//   64  149:aload_0         
	//   65  150:getfield        #72  <Field Edge activeEdges>
	//   66  153:aload_1         
	//   67  154:putfield        #221 <Field Edge Edge.prevInAEL>
			activeEdges = edge;
	//   68  157:aload_0         
	//   69  158:aload_1         
	//   70  159:putfield        #72  <Field Edge activeEdges>
			return;
	//   71  162:return          
		}
		LOGGER.finest("activeEdges unchanged");
	//   72  163:getstatic       #58  <Field Logger LOGGER>
	//   73  166:ldc2            #609 <String "activeEdges unchanged">
	//   74  169:invokevirtual   #297 <Method void Logger.finest(String)>
		Edge edge2 = edge1;
	//   75  172:aload_2         
	//   76  173:astore_3        
		if(edge1 == null)
	//*  77  174:aload_2         
	//*  78  175:ifnonnull       183
			edge2 = activeEdges;
	//   79  178:aload_0         
	//   80  179:getfield        #72  <Field Edge activeEdges>
	//   81  182:astore_3        
		for(; edge2.nextInAEL != null && !Edge.doesE2InsertBeforeE1(edge2.nextInAEL, edge); edge2 = edge2.nextInAEL);
	//   82  183:aload_3         
	//   83  184:getfield        #358 <Field Edge Edge.nextInAEL>
	//   84  187:ifnull          209
	//   85  190:aload_3         
	//   86  191:getfield        #358 <Field Edge Edge.nextInAEL>
	//   87  194:aload_1         
	//   88  195:invokestatic    #607 <Method boolean Edge.doesE2InsertBeforeE1(Edge, Edge)>
	//   89  198:ifne            209
	//   90  201:aload_3         
	//   91  202:getfield        #358 <Field Edge Edge.nextInAEL>
	//   92  205:astore_3        
	//*  93  206:goto            183
		edge.nextInAEL = edge2.nextInAEL;
	//   94  209:aload_1         
	//   95  210:aload_3         
	//   96  211:getfield        #358 <Field Edge Edge.nextInAEL>
	//   97  214:putfield        #358 <Field Edge Edge.nextInAEL>
		if(edge2.nextInAEL != null)
	//*  98  217:aload_3         
	//*  99  218:getfield        #358 <Field Edge Edge.nextInAEL>
	//* 100  221:ifnull          232
			edge2.nextInAEL.prevInAEL = edge;
	//  101  224:aload_3         
	//  102  225:getfield        #358 <Field Edge Edge.nextInAEL>
	//  103  228:aload_1         
	//  104  229:putfield        #221 <Field Edge Edge.prevInAEL>
		edge.prevInAEL = edge2;
	//  105  232:aload_1         
	//  106  233:aload_3         
	//  107  234:putfield        #221 <Field Edge Edge.prevInAEL>
		edge2.nextInAEL = edge;
	//  108  237:aload_3         
	//  109  238:aload_1         
	//  110  239:putfield        #358 <Field Edge Edge.nextInAEL>
	//  111  242:return          
	}

	private void insertLocalMinimaIntoAEL(long l)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "insertLocalMinimaIntoAEL");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #610 <String "insertLocalMinimaIntoAEL">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		do
		{
			if(currentLM == null || currentLM.y != l)
				break;
	//    5   14:aload_0         
	//    6   15:getfield        #495 <Field ClipperBase$LocalMinima currentLM>
	//    7   18:ifnull          695
	//    8   21:aload_0         
	//    9   22:getfield        #495 <Field ClipperBase$LocalMinima currentLM>
	//   10   25:getfield        #615 <Field long ClipperBase$LocalMinima.y>
	//   11   28:lload_1         
	//   12   29:lcmp            
	//   13   30:ifne            695
			Edge edge = currentLM.leftBound;
	//   14   33:aload_0         
	//   15   34:getfield        #495 <Field ClipperBase$LocalMinima currentLM>
	//   16   37:getfield        #618 <Field Edge ClipperBase$LocalMinima.leftBound>
	//   17   40:astore          7
			Edge edge1 = currentLM.rightBound;
	//   18   42:aload_0         
	//   19   43:getfield        #495 <Field ClipperBase$LocalMinima currentLM>
	//   20   46:getfield        #621 <Field Edge ClipperBase$LocalMinima.rightBound>
	//   21   49:astore          8
			popLocalMinima();
	//   22   51:aload_0         
	//   23   52:invokevirtual   #624 <Method void popLocalMinima()>
			Path.Join join = null;
	//   24   55:aconst_null     
	//   25   56:astore          5
			Object obj1 = null;
	//   26   58:aconst_null     
	//   27   59:astore          6
			Object obj = null;
	//   28   61:aconst_null     
	//   29   62:astore          4
			if(edge == null)
	//*  30   64:aload           7
	//*  31   66:ifnonnull       272
			{
				insertEdgeIntoAEL(edge1, ((Edge) (null)));
	//   32   69:aload_0         
	//   33   70:aload           8
	//   34   72:aconst_null     
	//   35   73:invokespecial   #626 <Method void insertEdgeIntoAEL(Edge, Edge)>
				updateWindingCount(edge1);
	//   36   76:aload_0         
	//   37   77:aload           8
	//   38   79:invokespecial   #629 <Method void updateWindingCount(Edge)>
				if(edge1.isContributing(clipFillType, subjFillType, clipType))
	//*  39   82:aload           8
	//*  40   84:aload_0         
	//*  41   85:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//*  42   88:aload_0         
	//*  43   89:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//*  44   92:aload_0         
	//*  45   93:getfield        #635 <Field Clipper$ClipType clipType>
	//*  46   96:invokevirtual   #639 <Method boolean Edge.isContributing(Clipper$PolyFillType, Clipper$PolyFillType, Clipper$ClipType)>
	//*  47   99:ifeq            115
					obj = ((Object) (addOutPt(edge1, edge1.getBot())));
	//   48  102:aload_0         
	//   49  103:aload           8
	//   50  105:aload           8
	//   51  107:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   52  110:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//   53  113:astore          4
			} else
	//*  54  115:aload           8
	//*  55  117:ifnull          134
	//*  56  120:aload           8
	//*  57  122:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//*  58  125:ifeq            437
	//*  59  128:aload_0         
	//*  60  129:aload           8
	//*  61  131:invokespecial   #641 <Method void addEdgeToSEL(Edge)>
	//*  62  134:aload           7
	//*  63  136:ifnull          14
	//*  64  139:aload           8
	//*  65  141:ifnull          14
	//*  66  144:aload           4
	//*  67  146:ifnull          452
	//*  68  149:aload           8
	//*  69  151:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//*  70  154:ifeq            452
	//*  71  157:aload_0         
	//*  72  158:getfield        #93  <Field List ghostJoins>
	//*  73  161:invokeinterface #396 <Method int List.size()>
	//*  74  166:ifle            452
	//*  75  169:aload           8
	//*  76  171:getfield        #200 <Field int Edge.windDelta>
	//*  77  174:ifeq            452
	//*  78  177:iconst_0        
	//*  79  178:istore_3        
	//*  80  179:iload_3         
	//*  81  180:aload_0         
	//*  82  181:getfield        #93  <Field List ghostJoins>
	//*  83  184:invokeinterface #396 <Method int List.size()>
	//*  84  189:icmpge          452
	//*  85  192:aload_0         
	//*  86  193:getfield        #93  <Field List ghostJoins>
	//*  87  196:iload_3         
	//*  88  197:invokeinterface #127 <Method Object List.get(int)>
	//*  89  202:checkcast       #173 <Class Path$Join>
	//*  90  205:astore          5
	//*  91  207:aload_0         
	//*  92  208:aload           5
	//*  93  210:getfield        #177 <Field Path$OutPt Path$Join.outPt1>
	//*  94  213:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  95  216:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  96  219:aload           5
	//*  97  221:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//*  98  224:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  99  227:aload           8
	//* 100  229:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 101  232:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 102  235:aload           8
	//* 103  237:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 104  240:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 105  243:invokespecial   #646 <Method boolean doHorzSegmentsOverlap(long, long, long, long)>
	//* 106  246:ifeq            265
	//* 107  249:aload_0         
	//* 108  250:aload           5
	//* 109  252:getfield        #177 <Field Path$OutPt Path$Join.outPt1>
	//* 110  255:aload           4
	//* 111  257:aload           5
	//* 112  259:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//* 113  262:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
	//* 114  265:iload_3         
	//* 115  266:iconst_1        
	//* 116  267:iadd            
	//* 117  268:istore_3        
	//* 118  269:goto            179
			if(edge1 == null)
	//* 119  272:aload           8
	//* 120  274:ifnonnull       342
			{
				insertEdgeIntoAEL(edge, ((Edge) (null)));
	//  121  277:aload_0         
	//  122  278:aload           7
	//  123  280:aconst_null     
	//  124  281:invokespecial   #626 <Method void insertEdgeIntoAEL(Edge, Edge)>
				updateWindingCount(edge);
	//  125  284:aload_0         
	//  126  285:aload           7
	//  127  287:invokespecial   #629 <Method void updateWindingCount(Edge)>
				obj = ((Object) (join));
	//  128  290:aload           5
	//  129  292:astore          4
				if(edge.isContributing(clipFillType, subjFillType, clipType))
	//* 130  294:aload           7
	//* 131  296:aload_0         
	//* 132  297:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//* 133  300:aload_0         
	//* 134  301:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//* 135  304:aload_0         
	//* 136  305:getfield        #635 <Field Clipper$ClipType clipType>
	//* 137  308:invokevirtual   #639 <Method boolean Edge.isContributing(Clipper$PolyFillType, Clipper$PolyFillType, Clipper$ClipType)>
	//* 138  311:ifeq            327
					obj = ((Object) (addOutPt(edge, edge.getBot())));
	//  139  314:aload_0         
	//  140  315:aload           7
	//  141  317:aload           7
	//  142  319:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  143  322:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  144  325:astore          4
				insertScanbeam(edge.getTop().getY());
	//  145  327:aload_0         
	//  146  328:aload           7
	//  147  330:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  148  333:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  149  336:invokespecial   #649 <Method void insertScanbeam(long)>
			} else
	//* 150  339:goto            115
			{
				insertEdgeIntoAEL(edge, ((Edge) (null)));
	//  151  342:aload_0         
	//  152  343:aload           7
	//  153  345:aconst_null     
	//  154  346:invokespecial   #626 <Method void insertEdgeIntoAEL(Edge, Edge)>
				insertEdgeIntoAEL(edge1, edge);
	//  155  349:aload_0         
	//  156  350:aload           8
	//  157  352:aload           7
	//  158  354:invokespecial   #626 <Method void insertEdgeIntoAEL(Edge, Edge)>
				updateWindingCount(edge);
	//  159  357:aload_0         
	//  160  358:aload           7
	//  161  360:invokespecial   #629 <Method void updateWindingCount(Edge)>
				edge1.windCnt = edge.windCnt;
	//  162  363:aload           8
	//  163  365:aload           7
	//  164  367:getfield        #652 <Field int Edge.windCnt>
	//  165  370:putfield        #652 <Field int Edge.windCnt>
				edge1.windCnt2 = edge.windCnt2;
	//  166  373:aload           8
	//  167  375:aload           7
	//  168  377:getfield        #655 <Field int Edge.windCnt2>
	//  169  380:putfield        #655 <Field int Edge.windCnt2>
				obj = ((Object) (obj1));
	//  170  383:aload           6
	//  171  385:astore          4
				if(edge.isContributing(clipFillType, subjFillType, clipType))
	//* 172  387:aload           7
	//* 173  389:aload_0         
	//* 174  390:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//* 175  393:aload_0         
	//* 176  394:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//* 177  397:aload_0         
	//* 178  398:getfield        #635 <Field Clipper$ClipType clipType>
	//* 179  401:invokevirtual   #639 <Method boolean Edge.isContributing(Clipper$PolyFillType, Clipper$PolyFillType, Clipper$ClipType)>
	//* 180  404:ifeq            422
					obj = ((Object) (addLocalMinPoly(edge, edge1, edge.getBot())));
	//  181  407:aload_0         
	//  182  408:aload           7
	//  183  410:aload           8
	//  184  412:aload           7
	//  185  414:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  186  417:invokespecial   #657 <Method Path$OutPt addLocalMinPoly(Edge, Edge, Point$LongPoint)>
	//  187  420:astore          4
				insertScanbeam(edge.getTop().getY());
	//  188  422:aload_0         
	//  189  423:aload           7
	//  190  425:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  191  428:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  192  431:invokespecial   #649 <Method void insertScanbeam(long)>
			}
			if(edge1 != null)
				if(edge1.isHorizontal())
					addEdgeToSEL(edge1);
				else
	//* 193  434:goto            115
					insertScanbeam(edge1.getTop().getY());
	//  194  437:aload_0         
	//  195  438:aload           8
	//  196  440:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  197  443:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  198  446:invokespecial   #649 <Method void insertScanbeam(long)>
			if(edge != null && edge1 != null)
			{
				if(obj != null && edge1.isHorizontal() && ghostJoins.size() > 0 && edge1.windDelta != 0)
				{
					for(int i = 0; i < ghostJoins.size(); i++)
					{
						join = (Path.Join)ghostJoins.get(i);
						if(doHorzSegmentsOverlap(join.outPt1.getPt().getX(), join.getOffPt().getX(), edge1.getBot().getX(), edge1.getTop().getX()))
							addJoin(join.outPt1, ((Path.OutPt) (obj)), join.getOffPt());
					}

				}
	//* 199  449:goto            134
				if(edge.outIdx >= 0 && edge.prevInAEL != null && edge.prevInAEL.getCurrent().getX() == edge.getBot().getX() && edge.prevInAEL.outIdx >= 0 && Edge.slopesEqual(edge.prevInAEL, edge, useFullRange) && edge.windDelta != 0 && edge.prevInAEL.windDelta != 0)
	//* 200  452:aload           7
	//* 201  454:getfield        #121 <Field int Edge.outIdx>
	//* 202  457:iflt            563
	//* 203  460:aload           7
	//* 204  462:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 205  465:ifnull          563
	//* 206  468:aload           7
	//* 207  470:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 208  473:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 209  476:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 210  479:aload           7
	//* 211  481:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 212  484:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 213  487:lcmp            
	//* 214  488:ifne            563
	//* 215  491:aload           7
	//* 216  493:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 217  496:getfield        #121 <Field int Edge.outIdx>
	//* 218  499:iflt            563
	//* 219  502:aload           7
	//* 220  504:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 221  507:aload           7
	//* 222  509:aload_0         
	//* 223  510:getfield        #234 <Field boolean useFullRange>
	//* 224  513:invokestatic    #238 <Method boolean Edge.slopesEqual(Edge, Edge, boolean)>
	//* 225  516:ifeq            563
	//* 226  519:aload           7
	//* 227  521:getfield        #200 <Field int Edge.windDelta>
	//* 228  524:ifeq            563
	//* 229  527:aload           7
	//* 230  529:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 231  532:getfield        #200 <Field int Edge.windDelta>
	//* 232  535:ifeq            563
					addJoin(((Path.OutPt) (obj)), addOutPt(edge.prevInAEL, edge.getBot()), edge.getTop());
	//  233  538:aload_0         
	//  234  539:aload           4
	//  235  541:aload_0         
	//  236  542:aload           7
	//  237  544:getfield        #221 <Field Edge Edge.prevInAEL>
	//  238  547:aload           7
	//  239  549:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  240  552:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  241  555:aload           7
	//  242  557:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  243  560:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
				if(edge.nextInAEL != edge1)
	//* 244  563:aload           7
	//* 245  565:getfield        #358 <Field Edge Edge.nextInAEL>
	//* 246  568:aload           8
	//* 247  570:if_acmpeq       14
				{
					if(edge1.outIdx >= 0 && edge1.prevInAEL.outIdx >= 0 && Edge.slopesEqual(edge1.prevInAEL, edge1, useFullRange) && edge1.windDelta != 0 && edge1.prevInAEL.windDelta != 0)
	//* 248  573:aload           8
	//* 249  575:getfield        #121 <Field int Edge.outIdx>
	//* 250  578:iflt            653
	//* 251  581:aload           8
	//* 252  583:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 253  586:getfield        #121 <Field int Edge.outIdx>
	//* 254  589:iflt            653
	//* 255  592:aload           8
	//* 256  594:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 257  597:aload           8
	//* 258  599:aload_0         
	//* 259  600:getfield        #234 <Field boolean useFullRange>
	//* 260  603:invokestatic    #238 <Method boolean Edge.slopesEqual(Edge, Edge, boolean)>
	//* 261  606:ifeq            653
	//* 262  609:aload           8
	//* 263  611:getfield        #200 <Field int Edge.windDelta>
	//* 264  614:ifeq            653
	//* 265  617:aload           8
	//* 266  619:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 267  622:getfield        #200 <Field int Edge.windDelta>
	//* 268  625:ifeq            653
						addJoin(((Path.OutPt) (obj)), addOutPt(edge1.prevInAEL, edge1.getBot()), edge1.getTop());
	//  269  628:aload_0         
	//  270  629:aload           4
	//  271  631:aload_0         
	//  272  632:aload           8
	//  273  634:getfield        #221 <Field Edge Edge.prevInAEL>
	//  274  637:aload           8
	//  275  639:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  276  642:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  277  645:aload           8
	//  278  647:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  279  650:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
					obj = ((Object) (edge.nextInAEL));
	//  280  653:aload           7
	//  281  655:getfield        #358 <Field Edge Edge.nextInAEL>
	//  282  658:astore          4
					if(obj != null)
	//* 283  660:aload           4
	//* 284  662:ifnull          14
						while(obj != edge1) 
	//* 285  665:aload           4
	//* 286  667:aload           8
	//* 287  669:if_acmpeq       14
						{
							intersectEdges(edge1, ((Edge) (obj)), edge.getCurrent());
	//  288  672:aload_0         
	//  289  673:aload           8
	//  290  675:aload           4
	//  291  677:aload           7
	//  292  679:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  293  682:invokespecial   #457 <Method void intersectEdges(Edge, Edge, Point$LongPoint)>
							obj = ((Object) (((Edge) (obj)).nextInAEL));
	//  294  685:aload           4
	//  295  687:getfield        #358 <Field Edge Edge.nextInAEL>
	//  296  690:astore          4
						}
				}
			}
		} while(true);
	//  297  692:goto            665
	//  298  695:return          
	}

	private void insertScanbeam(long l)
	{
		if(scanbeam == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//*   2    4:ifnonnull       36
		{
			scanbeam = new ClipperBase.Scanbeam(((ClipperBase) (this)));
	//    3    7:aload_0         
	//    4    8:new             #659 <Class ClipperBase$Scanbeam>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #662 <Method void ClipperBase$Scanbeam(ClipperBase)>
	//    8   16:putfield        #68  <Field ClipperBase$Scanbeam scanbeam>
			scanbeam.next = null;
	//    9   19:aload_0         
	//   10   20:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//   11   23:aconst_null     
	//   12   24:putfield        #664 <Field ClipperBase$Scanbeam ClipperBase$Scanbeam.next>
			scanbeam.y = l;
	//   13   27:aload_0         
	//   14   28:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//   15   31:lload_1         
	//   16   32:putfield        #665 <Field long ClipperBase$Scanbeam.y>
		} else
	//*  17   35:return          
		{
			if(l > scanbeam.y)
	//*  18   36:lload_1         
	//*  19   37:aload_0         
	//*  20   38:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//*  21   41:getfield        #665 <Field long ClipperBase$Scanbeam.y>
	//*  22   44:lcmp            
	//*  23   45:ifle            76
			{
				ClipperBase.Scanbeam scanbeam1 = new ClipperBase.Scanbeam(((ClipperBase) (this)));
	//   24   48:new             #659 <Class ClipperBase$Scanbeam>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:invokespecial   #662 <Method void ClipperBase$Scanbeam(ClipperBase)>
	//   28   56:astore_3        
				scanbeam1.y = l;
	//   29   57:aload_3         
	//   30   58:lload_1         
	//   31   59:putfield        #665 <Field long ClipperBase$Scanbeam.y>
				scanbeam1.next = scanbeam;
	//   32   62:aload_3         
	//   33   63:aload_0         
	//   34   64:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//   35   67:putfield        #664 <Field ClipperBase$Scanbeam ClipperBase$Scanbeam.next>
				scanbeam = scanbeam1;
	//   36   70:aload_0         
	//   37   71:aload_3         
	//   38   72:putfield        #68  <Field ClipperBase$Scanbeam scanbeam>
				return;
	//   39   75:return          
			}
			ClipperBase.Scanbeam scanbeam2;
			for(scanbeam2 = scanbeam; scanbeam2.next != null && l <= scanbeam2.next.y; scanbeam2 = scanbeam2.next);
	//   40   76:aload_0         
	//   41   77:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//   42   80:astore_3        
	//   43   81:aload_3         
	//   44   82:getfield        #664 <Field ClipperBase$Scanbeam ClipperBase$Scanbeam.next>
	//   45   85:ifnull          108
	//   46   88:lload_1         
	//   47   89:aload_3         
	//   48   90:getfield        #664 <Field ClipperBase$Scanbeam ClipperBase$Scanbeam.next>
	//   49   93:getfield        #665 <Field long ClipperBase$Scanbeam.y>
	//   50   96:lcmp            
	//   51   97:ifgt            108
	//   52  100:aload_3         
	//   53  101:getfield        #664 <Field ClipperBase$Scanbeam ClipperBase$Scanbeam.next>
	//   54  104:astore_3        
	//*  55  105:goto            81
			if(l != scanbeam2.y)
	//*  56  108:lload_1         
	//*  57  109:aload_3         
	//*  58  110:getfield        #665 <Field long ClipperBase$Scanbeam.y>
	//*  59  113:lcmp            
	//*  60  114:ifeq            35
			{
				ClipperBase.Scanbeam scanbeam3 = new ClipperBase.Scanbeam(((ClipperBase) (this)));
	//   61  117:new             #659 <Class ClipperBase$Scanbeam>
	//   62  120:dup             
	//   63  121:aload_0         
	//   64  122:invokespecial   #662 <Method void ClipperBase$Scanbeam(ClipperBase)>
	//   65  125:astore          4
				scanbeam3.y = l;
	//   66  127:aload           4
	//   67  129:lload_1         
	//   68  130:putfield        #665 <Field long ClipperBase$Scanbeam.y>
				scanbeam3.next = scanbeam2.next;
	//   69  133:aload           4
	//   70  135:aload_3         
	//   71  136:getfield        #664 <Field ClipperBase$Scanbeam ClipperBase$Scanbeam.next>
	//   72  139:putfield        #664 <Field ClipperBase$Scanbeam ClipperBase$Scanbeam.next>
				scanbeam2.next = scanbeam3;
	//   73  142:aload_3         
	//   74  143:aload           4
	//   75  145:putfield        #664 <Field ClipperBase$Scanbeam ClipperBase$Scanbeam.next>
				return;
	//   76  148:return          
			}
		}
	}

	private void intersectEdges(Edge edge, Edge edge1, Point.LongPoint longpoint)
	{
		boolean flag;
		boolean flag1;
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "insersectEdges");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #667 <String "insersectEdges">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		if(edge.outIdx >= 0)
	//*   5   14:aload_1         
	//*   6   15:getfield        #121 <Field int Edge.outIdx>
	//*   7   18:iflt            70
			flag = true;
	//    8   21:iconst_1        
	//    9   22:istore          6
		else
	//*  10   24:aload_2         
	//*  11   25:getfield        #121 <Field int Edge.outIdx>
	//*  12   28:iflt            76
	//*  13   31:iconst_1        
	//*  14   32:istore          7
	//*  15   34:aload_0         
	//*  16   35:aload_3         
	//*  17   36:aload_1         
	//*  18   37:aload_2         
	//*  19   38:invokespecial   #671 <Method void setZ(Point$LongPoint, Edge, Edge)>
	//*  20   41:aload_1         
	//*  21   42:getfield        #200 <Field int Edge.windDelta>
	//*  22   45:ifeq            55
	//*  23   48:aload_2         
	//*  24   49:getfield        #200 <Field int Edge.windDelta>
	//*  25   52:ifne            284
	//*  26   55:aload_1         
	//*  27   56:getfield        #200 <Field int Edge.windDelta>
	//*  28   59:ifne            82
	//*  29   62:aload_2         
	//*  30   63:getfield        #200 <Field int Edge.windDelta>
	//*  31   66:ifne            82
	//*  32   69:return          
			flag = false;
	//   33   70:iconst_0        
	//   34   71:istore          6
		if(edge1.outIdx >= 0)
			flag1 = true;
		else
	//*  35   73:goto            24
			flag1 = false;
	//   36   76:iconst_0        
	//   37   77:istore          7
		setZ(longpoint, edge, edge1);
		if(edge.windDelta != 0 && edge1.windDelta != 0) goto _L2; else goto _L1
_L1:
		if(edge.windDelta != 0 || edge1.windDelta != 0) goto _L4; else goto _L3
_L3:
		return;
	//*  38   79:goto            34
_L4:
		if(edge.polyTyp != edge1.polyTyp || edge.windDelta == edge1.windDelta || clipType != Clipper.ClipType.UNION)
			continue; /* Loop/switch isn't completed */
	//   39   82:aload_1         
	//   40   83:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//   41   86:aload_2         
	//   42   87:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//   43   90:if_acmpne       167
	//   44   93:aload_1         
	//   45   94:getfield        #200 <Field int Edge.windDelta>
	//   46   97:aload_2         
	//   47   98:getfield        #200 <Field int Edge.windDelta>
	//   48  101:icmpeq          167
	//   49  104:aload_0         
	//   50  105:getfield        #635 <Field Clipper$ClipType clipType>
	//   51  108:getstatic       #680 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//   52  111:if_acmpne       167
		if(edge.windDelta != 0)
			continue; /* Loop/switch isn't completed */
	//   53  114:aload_1         
	//   54  115:getfield        #200 <Field int Edge.windDelta>
	//   55  118:ifne            144
		if(flag1)
	//*  56  121:iload           7
	//*  57  123:ifeq            69
		{
			addOutPt(edge, longpoint);
	//   58  126:aload_0         
	//   59  127:aload_1         
	//   60  128:aload_3         
	//   61  129:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//   62  132:pop             
			if(flag)
	//*  63  133:iload           6
	//*  64  135:ifeq            69
			{
				edge.outIdx = -1;
	//   65  138:aload_1         
	//   66  139:iconst_m1       
	//   67  140:putfield        #121 <Field int Edge.outIdx>
				return;
	//   68  143:return          
			}
		}
		continue; /* Loop/switch isn't completed */
		if(!flag) goto _L3; else goto _L5
	//   69  144:iload           6
	//   70  146:ifeq            69
_L5:
		addOutPt(edge1, longpoint);
	//   71  149:aload_0         
	//   72  150:aload_2         
	//   73  151:aload_3         
	//   74  152:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//   75  155:pop             
		if(flag1)
	//*  76  156:iload           7
	//*  77  158:ifeq            69
		{
			edge1.outIdx = -1;
	//   78  161:aload_2         
	//   79  162:iconst_m1       
	//   80  163:putfield        #121 <Field int Edge.outIdx>
			return;
	//   81  166:return          
		}
		continue; /* Loop/switch isn't completed */
		if(edge.polyTyp == edge1.polyTyp) goto _L3; else goto _L6
	//   82  167:aload_1         
	//   83  168:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//   84  171:aload_2         
	//   85  172:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//   86  175:if_acmpeq       69
_L6:
		if(edge.windDelta != 0 || Math.abs(edge1.windCnt) != 1 || clipType == Clipper.ClipType.UNION && edge1.windCnt2 != 0)
			continue; /* Loop/switch isn't completed */
	//   87  178:aload_1         
	//   88  179:getfield        #200 <Field int Edge.windDelta>
	//   89  182:ifne            231
	//   90  185:aload_2         
	//   91  186:getfield        #652 <Field int Edge.windCnt>
	//   92  189:invokestatic    #684 <Method int Math.abs(int)>
	//   93  192:iconst_1        
	//   94  193:icmpne          231
	//   95  196:aload_0         
	//   96  197:getfield        #635 <Field Clipper$ClipType clipType>
	//   97  200:getstatic       #680 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//   98  203:if_acmpne       213
	//   99  206:aload_2         
	//  100  207:getfield        #655 <Field int Edge.windCnt2>
	//  101  210:ifne            231
		addOutPt(edge, longpoint);
	//  102  213:aload_0         
	//  103  214:aload_1         
	//  104  215:aload_3         
	//  105  216:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  106  219:pop             
		if(flag)
	//* 107  220:iload           6
	//* 108  222:ifeq            69
		{
			edge.outIdx = -1;
	//  109  225:aload_1         
	//  110  226:iconst_m1       
	//  111  227:putfield        #121 <Field int Edge.outIdx>
			return;
	//  112  230:return          
		}
		continue; /* Loop/switch isn't completed */
		if(edge1.windDelta != 0 || Math.abs(edge.windCnt) != 1 || clipType == Clipper.ClipType.UNION && edge.windCnt2 != 0) goto _L3; else goto _L7
	//  113  231:aload_2         
	//  114  232:getfield        #200 <Field int Edge.windDelta>
	//  115  235:ifne            69
	//  116  238:aload_1         
	//  117  239:getfield        #652 <Field int Edge.windCnt>
	//  118  242:invokestatic    #684 <Method int Math.abs(int)>
	//  119  245:iconst_1        
	//  120  246:icmpne          69
	//  121  249:aload_0         
	//  122  250:getfield        #635 <Field Clipper$ClipType clipType>
	//  123  253:getstatic       #680 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//  124  256:if_acmpne       266
	//  125  259:aload_1         
	//  126  260:getfield        #655 <Field int Edge.windCnt2>
	//  127  263:ifne            69
_L7:
		addOutPt(edge1, longpoint);
	//  128  266:aload_0         
	//  129  267:aload_2         
	//  130  268:aload_3         
	//  131  269:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  132  272:pop             
		if(flag1)
	//* 133  273:iload           7
	//* 134  275:ifeq            69
		{
			edge1.outIdx = -1;
	//  135  278:aload_2         
	//  136  279:iconst_m1       
	//  137  280:putfield        #121 <Field int Edge.outIdx>
			return;
	//  138  283:return          
		}
		continue; /* Loop/switch isn't completed */
_L2:
		static class _cls2
		{

			static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[];
			static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[];

			static 
			{
				$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType = new int[Clipper.ClipType.values().length];
			//    0    0:invokestatic    #19  <Method Clipper$ClipType[] Clipper$ClipType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper.ClipType.INTERSECTION.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
			//    5   12:getstatic       #25  <Field Clipper$ClipType Clipper$ClipType.INTERSECTION>
			//    6   15:invokevirtual   #29  <Method int Clipper$ClipType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
			//*  10   23:getstatic       #32  <Field Clipper$ClipType Clipper$ClipType.UNION>
			//*  11   26:invokevirtual   #29  <Method int Clipper$ClipType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
			//*  15   34:getstatic       #35  <Field Clipper$ClipType Clipper$ClipType.DIFFERENCE>
			//*  16   37:invokevirtual   #29  <Method int Clipper$ClipType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
			//*  20   45:getstatic       #38  <Field Clipper$ClipType Clipper$ClipType.XOR>
			//*  21   48:invokevirtual   #29  <Method int Clipper$ClipType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:invokestatic    #43  <Method Clipper$PolyFillType[] Clipper$PolyFillType.values()>
			//*  25   56:arraylength     
			//*  26   57:newarray        int[]
			//*  27   59:putstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
			//*  28   62:getstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
			//*  29   65:getstatic       #49  <Field Clipper$PolyFillType Clipper$PolyFillType.POSITIVE>
			//*  30   68:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
			//*  31   71:iconst_1        
			//*  32   72:iastore         
			//*  33   73:getstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
			//*  34   76:getstatic       #53  <Field Clipper$PolyFillType Clipper$PolyFillType.NEGATIVE>
			//*  35   79:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
			//*  36   82:iconst_2        
			//*  37   83:iastore         
			//*  38   84:return          
			//*  39   85:astore_0        
			//*  40   86:return          
			//*  41   87:astore_0        
			//*  42   88:goto            73
			//*  43   91:astore_0        
			//*  44   92:goto            53
			//*  45   95:astore_0        
			//*  46   96:goto            42
			//*  47   99:astore_0        
			//*  48  100:goto            31
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   49  103:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper.ClipType.UNION.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper.ClipType.DIFFERENCE.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper.ClipType.XOR.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType = new int[Clipper.PolyFillType.values().length];
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[Clipper.PolyFillType.POSITIVE.ordinal()] = 1;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[Clipper.PolyFillType.NEGATIVE.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  50  104:goto            20
			}
		}

		int j;
		int k;
		Clipper.PolyFillType polyfilltype1;
		Clipper.PolyFillType polyfilltype3;
		Clipper.PolyFillType polyfilltype;
		Clipper.PolyFillType polyfilltype2;
		if(edge.polyTyp == edge1.polyTyp)
	//* 139  284:aload_1         
	//* 140  285:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 141  288:aload_2         
	//* 142  289:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 143  292:if_acmpne       591
		{
			if(edge.isEvenOddFillType(clipFillType, subjFillType))
	//* 144  295:aload_1         
	//* 145  296:aload_0         
	//* 146  297:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//* 147  300:aload_0         
	//* 148  301:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//* 149  304:invokevirtual   #688 <Method boolean Edge.isEvenOddFillType(Clipper$PolyFillType, Clipper$PolyFillType)>
	//* 150  307:ifeq            514
			{
				int i = edge.windCnt;
	//  151  310:aload_1         
	//  152  311:getfield        #652 <Field int Edge.windCnt>
	//  153  314:istore          4
				edge.windCnt = edge1.windCnt;
	//  154  316:aload_1         
	//  155  317:aload_2         
	//  156  318:getfield        #652 <Field int Edge.windCnt>
	//  157  321:putfield        #652 <Field int Edge.windCnt>
				edge1.windCnt = i;
	//  158  324:aload_2         
	//  159  325:iload           4
	//  160  327:putfield        #652 <Field int Edge.windCnt>
			} else
	//* 161  330:aload_1         
	//* 162  331:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 163  334:getstatic       #693 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//* 164  337:if_acmpne       700
	//* 165  340:aload_0         
	//* 166  341:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//* 167  344:astore          8
	//* 168  346:aload_0         
	//* 169  347:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//* 170  350:astore          9
	//* 171  352:aload_2         
	//* 172  353:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 173  356:getstatic       #693 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//* 174  359:if_acmpne       715
	//* 175  362:aload_0         
	//* 176  363:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//* 177  366:astore          10
	//* 178  368:aload_0         
	//* 179  369:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//* 180  372:astore          11
	//* 181  374:getstatic       #697 <Field int[] DefaultClipper$2.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//* 182  377:aload           8
	//* 183  379:invokevirtual   #702 <Method int Clipper$PolyFillType.ordinal()>
	//* 184  382:iaload          
	//* 185  383:tableswitch     1 2: default 404
	//	               1 730
	//	               2 739
	//* 186  404:aload_1         
	//* 187  405:getfield        #652 <Field int Edge.windCnt>
	//* 188  408:invokestatic    #684 <Method int Math.abs(int)>
	//* 189  411:istore          4
	//* 190  413:getstatic       #697 <Field int[] DefaultClipper$2.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//* 191  416:aload           10
	//* 192  418:invokevirtual   #702 <Method int Clipper$PolyFillType.ordinal()>
	//* 193  421:iaload          
	//* 194  422:tableswitch     1 2: default 444
	//	               1 749
	//	               2 758
	//* 195  444:aload_2         
	//* 196  445:getfield        #652 <Field int Edge.windCnt>
	//* 197  448:invokestatic    #684 <Method int Math.abs(int)>
	//* 198  451:istore          5
	//* 199  453:iload           6
	//* 200  455:ifeq            793
	//* 201  458:iload           7
	//* 202  460:ifeq            793
	//* 203  463:iload           4
	//* 204  465:ifeq            474
	//* 205  468:iload           4
	//* 206  470:iconst_1        
	//* 207  471:icmpne          506
	//* 208  474:iload           5
	//* 209  476:ifeq            485
	//* 210  479:iload           5
	//* 211  481:iconst_1        
	//* 212  482:icmpne          506
	//* 213  485:aload_1         
	//* 214  486:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 215  489:aload_2         
	//* 216  490:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 217  493:if_acmpeq       768
	//* 218  496:aload_0         
	//* 219  497:getfield        #635 <Field Clipper$ClipType clipType>
	//* 220  500:getstatic       #705 <Field Clipper$ClipType Clipper$ClipType.XOR>
	//* 221  503:if_acmpeq       768
	//* 222  506:aload_0         
	//* 223  507:aload_1         
	//* 224  508:aload_2         
	//* 225  509:aload_3         
	//* 226  510:invokespecial   #465 <Method void addLocalMaxPoly(Edge, Edge, Point$LongPoint)>
	//* 227  513:return          
			{
				if(edge.windCnt + edge1.windDelta == 0)
	//* 228  514:aload_1         
	//* 229  515:getfield        #652 <Field int Edge.windCnt>
	//* 230  518:aload_2         
	//* 231  519:getfield        #200 <Field int Edge.windDelta>
	//* 232  522:iadd            
	//* 233  523:ifne            559
					edge.windCnt = -edge.windCnt;
	//  234  526:aload_1         
	//  235  527:aload_1         
	//  236  528:getfield        #652 <Field int Edge.windCnt>
	//  237  531:ineg            
	//  238  532:putfield        #652 <Field int Edge.windCnt>
				else
	//* 239  535:aload_2         
	//* 240  536:getfield        #652 <Field int Edge.windCnt>
	//* 241  539:aload_1         
	//* 242  540:getfield        #200 <Field int Edge.windDelta>
	//* 243  543:isub            
	//* 244  544:ifne            575
	//* 245  547:aload_2         
	//* 246  548:aload_2         
	//* 247  549:getfield        #652 <Field int Edge.windCnt>
	//* 248  552:ineg            
	//* 249  553:putfield        #652 <Field int Edge.windCnt>
	//* 250  556:goto            330
					edge.windCnt = edge.windCnt + edge1.windDelta;
	//  251  559:aload_1         
	//  252  560:aload_1         
	//  253  561:getfield        #652 <Field int Edge.windCnt>
	//  254  564:aload_2         
	//  255  565:getfield        #200 <Field int Edge.windDelta>
	//  256  568:iadd            
	//  257  569:putfield        #652 <Field int Edge.windCnt>
				if(edge1.windCnt - edge.windDelta == 0)
					edge1.windCnt = -edge1.windCnt;
				else
	//* 258  572:goto            535
					edge1.windCnt = edge1.windCnt - edge.windDelta;
	//  259  575:aload_2         
	//  260  576:aload_2         
	//  261  577:getfield        #652 <Field int Edge.windCnt>
	//  262  580:aload_1         
	//  263  581:getfield        #200 <Field int Edge.windDelta>
	//  264  584:isub            
	//  265  585:putfield        #652 <Field int Edge.windCnt>
			}
		} else
	//* 266  588:goto            330
		{
			if(!edge1.isEvenOddFillType(clipFillType, subjFillType))
	//* 267  591:aload_2         
	//* 268  592:aload_0         
	//* 269  593:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//* 270  596:aload_0         
	//* 271  597:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//* 272  600:invokevirtual   #688 <Method boolean Edge.isEvenOddFillType(Clipper$PolyFillType, Clipper$PolyFillType)>
	//* 273  603:ifne            650
			{
				edge.windCnt2 = edge.windCnt2 + edge1.windDelta;
	//  274  606:aload_1         
	//  275  607:aload_1         
	//  276  608:getfield        #655 <Field int Edge.windCnt2>
	//  277  611:aload_2         
	//  278  612:getfield        #200 <Field int Edge.windDelta>
	//  279  615:iadd            
	//  280  616:putfield        #655 <Field int Edge.windCnt2>
			} else
	//* 281  619:aload_1         
	//* 282  620:aload_0         
	//* 283  621:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//* 284  624:aload_0         
	//* 285  625:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//* 286  628:invokevirtual   #688 <Method boolean Edge.isEvenOddFillType(Clipper$PolyFillType, Clipper$PolyFillType)>
	//* 287  631:ifne            675
	//* 288  634:aload_2         
	//* 289  635:aload_2         
	//* 290  636:getfield        #655 <Field int Edge.windCnt2>
	//* 291  639:aload_1         
	//* 292  640:getfield        #200 <Field int Edge.windDelta>
	//* 293  643:isub            
	//* 294  644:putfield        #655 <Field int Edge.windCnt2>
	//* 295  647:goto            330
			{
				if(edge.windCnt2 == 0)
	//* 296  650:aload_1         
	//* 297  651:getfield        #655 <Field int Edge.windCnt2>
	//* 298  654:ifne            669
					j = 1;
	//  299  657:iconst_1        
	//  300  658:istore          4
				else
	//* 301  660:aload_1         
	//* 302  661:iload           4
	//* 303  663:putfield        #655 <Field int Edge.windCnt2>
	//* 304  666:goto            619
					j = 0;
	//  305  669:iconst_0        
	//  306  670:istore          4
				edge.windCnt2 = j;
			}
			if(!edge.isEvenOddFillType(clipFillType, subjFillType))
			{
				edge1.windCnt2 = edge1.windCnt2 - edge.windDelta;
			} else
	//* 307  672:goto            660
			{
				if(edge1.windCnt2 == 0)
	//* 308  675:aload_2         
	//* 309  676:getfield        #655 <Field int Edge.windCnt2>
	//* 310  679:ifne            694
					j = 1;
	//  311  682:iconst_1        
	//  312  683:istore          4
				else
	//* 313  685:aload_2         
	//* 314  686:iload           4
	//* 315  688:putfield        #655 <Field int Edge.windCnt2>
	//* 316  691:goto            330
					j = 0;
	//  317  694:iconst_0        
	//  318  695:istore          4
				edge1.windCnt2 = j;
			}
		}
		if(edge.polyTyp == Clipper.PolyType.SUBJECT)
		{
			polyfilltype = subjFillType;
			polyfilltype1 = clipFillType;
		} else
	//* 319  697:goto            685
		{
			polyfilltype = clipFillType;
	//  320  700:aload_0         
	//  321  701:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//  322  704:astore          8
			polyfilltype1 = subjFillType;
	//  323  706:aload_0         
	//  324  707:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//  325  710:astore          9
		}
		if(edge1.polyTyp == Clipper.PolyType.SUBJECT)
		{
			polyfilltype2 = subjFillType;
			polyfilltype3 = clipFillType;
		} else
	//* 326  712:goto            352
		{
			polyfilltype2 = clipFillType;
	//  327  715:aload_0         
	//  328  716:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//  329  719:astore          10
			polyfilltype3 = subjFillType;
	//  330  721:aload_0         
	//  331  722:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//  332  725:astore          11
		}
		_cls2..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype.ordinal()];
		JVM INSTR tableswitch 1 2: default 404
	//	               1 730
	//	               2 739;
		   goto _L8 _L9 _L10
_L8:
		j = Math.abs(edge.windCnt);
_L14:
		_cls2..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype2.ordinal()];
		JVM INSTR tableswitch 1 2: default 444
	//	               1 749
	//	               2 758;
		   goto _L11 _L12 _L13
_L11:
		k = Math.abs(edge1.windCnt);
		break; /* Loop/switch isn't completed */
	//* 333  727:goto            374
_L9:
		j = edge.windCnt;
	//  334  730:aload_1         
	//  335  731:getfield        #652 <Field int Edge.windCnt>
	//  336  734:istore          4
		  goto _L14
	//* 337  736:goto            413
_L10:
		j = -edge.windCnt;
	//  338  739:aload_1         
	//  339  740:getfield        #652 <Field int Edge.windCnt>
	//  340  743:ineg            
	//  341  744:istore          4
		  goto _L14
	//* 342  746:goto            413
_L12:
		k = edge1.windCnt;
	//  343  749:aload_2         
	//  344  750:getfield        #652 <Field int Edge.windCnt>
	//  345  753:istore          5
		  goto _L15
	//* 346  755:goto            453
_L13:
		k = -edge1.windCnt;
	//  347  758:aload_2         
	//  348  759:getfield        #652 <Field int Edge.windCnt>
	//  349  762:ineg            
	//  350  763:istore          5
_L15:
		if(flag && flag1)
			if(j != 0 && j != 1 || k != 0 && k != 1 || edge.polyTyp != edge1.polyTyp && clipType != Clipper.ClipType.XOR)
			{
				addLocalMaxPoly(edge, edge1, longpoint);
				return;
			} else
	//* 351  765:goto            453
			{
				addOutPt(edge, longpoint);
	//  352  768:aload_0         
	//  353  769:aload_1         
	//  354  770:aload_3         
	//  355  771:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  356  774:pop             
				addOutPt(edge1, longpoint);
	//  357  775:aload_0         
	//  358  776:aload_2         
	//  359  777:aload_3         
	//  360  778:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  361  781:pop             
				Edge.swapSides(edge, edge1);
	//  362  782:aload_1         
	//  363  783:aload_2         
	//  364  784:invokestatic    #708 <Method void Edge.swapSides(Edge, Edge)>
				Edge.swapPolyIndexes(edge, edge1);
	//  365  787:aload_1         
	//  366  788:aload_2         
	//  367  789:invokestatic    #711 <Method void Edge.swapPolyIndexes(Edge, Edge)>
				return;
	//  368  792:return          
			}
		if(!flag)
			break; /* Loop/switch isn't completed */
	//  369  793:iload           6
	//  370  795:ifeq            827
		if(k == 0 || k == 1)
	//* 371  798:iload           5
	//* 372  800:ifeq            809
	//* 373  803:iload           5
	//* 374  805:iconst_1        
	//* 375  806:icmpne          69
		{
			addOutPt(edge, longpoint);
	//  376  809:aload_0         
	//  377  810:aload_1         
	//  378  811:aload_3         
	//  379  812:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  380  815:pop             
			Edge.swapSides(edge, edge1);
	//  381  816:aload_1         
	//  382  817:aload_2         
	//  383  818:invokestatic    #708 <Method void Edge.swapSides(Edge, Edge)>
			Edge.swapPolyIndexes(edge, edge1);
	//  384  821:aload_1         
	//  385  822:aload_2         
	//  386  823:invokestatic    #711 <Method void Edge.swapPolyIndexes(Edge, Edge)>
			return;
	//  387  826:return          
		}
		if(true) goto _L3; else goto _L16
_L16:
		if(!flag1)
			continue; /* Loop/switch isn't completed */
	//  388  827:iload           7
	//  389  829:ifeq            861
		if(j != 0 && j != 1) goto _L3; else goto _L17
	//  390  832:iload           4
	//  391  834:ifeq            843
	//  392  837:iload           4
	//  393  839:iconst_1        
	//  394  840:icmpne          69
_L17:
		addOutPt(edge1, longpoint);
	//  395  843:aload_0         
	//  396  844:aload_2         
	//  397  845:aload_3         
	//  398  846:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  399  849:pop             
		Edge.swapSides(edge, edge1);
	//  400  850:aload_1         
	//  401  851:aload_2         
	//  402  852:invokestatic    #708 <Method void Edge.swapSides(Edge, Edge)>
		Edge.swapPolyIndexes(edge, edge1);
	//  403  855:aload_1         
	//  404  856:aload_2         
	//  405  857:invokestatic    #711 <Method void Edge.swapPolyIndexes(Edge, Edge)>
		return;
	//  406  860:return          
		if(j != 0 && j != 1 || k != 0 && k != 1) goto _L3; else goto _L18
	//  407  861:iload           4
	//  408  863:ifeq            872
	//  409  866:iload           4
	//  410  868:iconst_1        
	//  411  869:icmpne          69
	//  412  872:iload           5
	//  413  874:ifeq            883
	//  414  877:iload           5
	//  415  879:iconst_1        
	//  416  880:icmpne          69
_L18:
		_cls2..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype1.ordinal()];
	//  417  883:getstatic       #697 <Field int[] DefaultClipper$2.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//  418  886:aload           9
	//  419  888:invokevirtual   #702 <Method int Clipper$PolyFillType.ordinal()>
	//  420  891:iaload          
		JVM INSTR tableswitch 1 2: default 916
	//	               1 985
	//	               2 994;
	//  421  892:tableswitch     1 2: default 916
	//	               1 985
	//	               2 994
		   goto _L19 _L20 _L21
_L19:
		int l = Math.abs(edge.windCnt2);
	//  422  916:aload_1         
	//  423  917:getfield        #655 <Field int Edge.windCnt2>
	//  424  920:invokestatic    #684 <Method int Math.abs(int)>
	//  425  923:istore          6
_L25:
		_cls2..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype3.ordinal()];
	//  426  925:getstatic       #697 <Field int[] DefaultClipper$2.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//  427  928:aload           11
	//  428  930:invokevirtual   #702 <Method int Clipper$PolyFillType.ordinal()>
	//  429  933:iaload          
		JVM INSTR tableswitch 1 2: default 956
	//	               1 1004
	//	               2 1013;
	//  430  934:tableswitch     1 2: default 956
	//	               1 1004
	//	               2 1013
		   goto _L22 _L23 _L24
_L22:
		int i1;
		i1 = Math.abs(edge1.windCnt2);
	//  431  956:aload_2         
	//  432  957:getfield        #655 <Field int Edge.windCnt2>
	//  433  960:invokestatic    #684 <Method int Math.abs(int)>
	//  434  963:istore          7
		break; /* Loop/switch isn't completed */
	//* 435  965:aload_1         
	//* 436  966:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 437  969:aload_2         
	//* 438  970:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 439  973:if_acmpeq       1023
	//* 440  976:aload_0         
	//* 441  977:aload_1         
	//* 442  978:aload_2         
	//* 443  979:aload_3         
	//* 444  980:invokespecial   #657 <Method Path$OutPt addLocalMinPoly(Edge, Edge, Point$LongPoint)>
	//* 445  983:pop             
	//* 446  984:return          
_L20:
		l = edge.windCnt2;
	//  447  985:aload_1         
	//  448  986:getfield        #655 <Field int Edge.windCnt2>
	//  449  989:istore          6
		  goto _L25
	//* 450  991:goto            925
_L21:
		l = -edge.windCnt2;
	//  451  994:aload_1         
	//  452  995:getfield        #655 <Field int Edge.windCnt2>
	//  453  998:ineg            
	//  454  999:istore          6
		  goto _L25
	//* 455 1001:goto            925
_L23:
		i1 = edge1.windCnt2;
	//  456 1004:aload_2         
	//  457 1005:getfield        #655 <Field int Edge.windCnt2>
	//  458 1008:istore          7
		  goto _L26
	//* 459 1010:goto            965
_L24:
		i1 = -edge1.windCnt2;
	//  460 1013:aload_2         
	//  461 1014:getfield        #655 <Field int Edge.windCnt2>
	//  462 1017:ineg            
	//  463 1018:istore          7
_L26:
		if(edge.polyTyp != edge1.polyTyp)
		{
			addLocalMinPoly(edge, edge1, longpoint);
			return;
		}
	//* 464 1020:goto            965
		if(j != 1 || k != 1)
			break; /* Loop/switch isn't completed */
	//  465 1023:iload           4
	//  466 1025:iconst_1        
	//  467 1026:icmpne          1173
	//  468 1029:iload           5
	//  469 1031:iconst_1        
	//  470 1032:icmpne          1173
		switch(_cls2..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.ClipType[clipType.ordinal()])
	//* 471 1035:getstatic       #714 <Field int[] DefaultClipper$2.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
	//* 472 1038:aload_0         
	//* 473 1039:getfield        #635 <Field Clipper$ClipType clipType>
	//* 474 1042:invokevirtual   #715 <Method int Clipper$ClipType.ordinal()>
	//* 475 1045:iaload          
		{
	//* 476 1046:tableswitch     1 4: default 1076
	//	               1 1077
	//	               2 1096
	//	               3 1115
	//	               4 1164
		default:
			return;
	//  477 1076:return          

		case 1: // '\001'
			if(l > 0 && i1 > 0)
	//* 478 1077:iload           6
	//* 479 1079:ifle            69
	//* 480 1082:iload           7
	//* 481 1084:ifle            69
			{
				addLocalMinPoly(edge, edge1, longpoint);
	//  482 1087:aload_0         
	//  483 1088:aload_1         
	//  484 1089:aload_2         
	//  485 1090:aload_3         
	//  486 1091:invokespecial   #657 <Method Path$OutPt addLocalMinPoly(Edge, Edge, Point$LongPoint)>
	//  487 1094:pop             
				return;
	//  488 1095:return          
			}
			break;

		case 2: // '\002'
			if(l <= 0 && i1 <= 0)
	//* 489 1096:iload           6
	//* 490 1098:ifgt            69
	//* 491 1101:iload           7
	//* 492 1103:ifgt            69
			{
				addLocalMinPoly(edge, edge1, longpoint);
	//  493 1106:aload_0         
	//  494 1107:aload_1         
	//  495 1108:aload_2         
	//  496 1109:aload_3         
	//  497 1110:invokespecial   #657 <Method Path$OutPt addLocalMinPoly(Edge, Edge, Point$LongPoint)>
	//  498 1113:pop             
				return;
	//  499 1114:return          
			}
			break;

		case 3: // '\003'
			if(edge.polyTyp == Clipper.PolyType.CLIP && l > 0 && i1 > 0 || edge.polyTyp == Clipper.PolyType.SUBJECT && l <= 0 && i1 <= 0)
	//* 500 1115:aload_1         
	//* 501 1116:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 502 1119:getstatic       #718 <Field Clipper$PolyType Clipper$PolyType.CLIP>
	//* 503 1122:if_acmpne       1135
	//* 504 1125:iload           6
	//* 505 1127:ifle            1135
	//* 506 1130:iload           7
	//* 507 1132:ifgt            1155
	//* 508 1135:aload_1         
	//* 509 1136:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 510 1139:getstatic       #693 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//* 511 1142:if_acmpne       69
	//* 512 1145:iload           6
	//* 513 1147:ifgt            69
	//* 514 1150:iload           7
	//* 515 1152:ifgt            69
			{
				addLocalMinPoly(edge, edge1, longpoint);
	//  516 1155:aload_0         
	//  517 1156:aload_1         
	//  518 1157:aload_2         
	//  519 1158:aload_3         
	//  520 1159:invokespecial   #657 <Method Path$OutPt addLocalMinPoly(Edge, Edge, Point$LongPoint)>
	//  521 1162:pop             
				return;
	//  522 1163:return          
			}
			break;

		case 4: // '\004'
			addLocalMinPoly(edge, edge1, longpoint);
	//  523 1164:aload_0         
	//  524 1165:aload_1         
	//  525 1166:aload_2         
	//  526 1167:aload_3         
	//  527 1168:invokespecial   #657 <Method Path$OutPt addLocalMinPoly(Edge, Edge, Point$LongPoint)>
	//  528 1171:pop             
			return;
	//  529 1172:return          
		}
		if(true) goto _L3; else goto _L27
_L27:
		Edge.swapSides(edge, edge1);
	//  530 1173:aload_1         
	//  531 1174:aload_2         
	//  532 1175:invokestatic    #708 <Method void Edge.swapSides(Edge, Edge)>
		return;
	//  533 1178:return          
	}

	private void intersectPoint(Edge edge, Edge edge1, Point.LongPoint alongpoint[])
	{
		Point.LongPoint longpoint = new Point.LongPoint();
	//    0    0:new             #223 <Class Point$LongPoint>
	//    1    3:dup             
	//    2    4:invokespecial   #719 <Method void Point$LongPoint()>
	//    3    7:astore          10
		alongpoint[0] = longpoint;
	//    4    9:aload_3         
	//    5   10:iconst_0        
	//    6   11:aload           10
	//    7   13:aastore         
		if(edge.deltaX == edge1.deltaX)
	//*   8   14:aload_1         
	//*   9   15:getfield        #215 <Field double Edge.deltaX>
	//*  10   18:aload_2         
	//*  11   19:getfield        #215 <Field double Edge.deltaX>
	//*  12   22:dcmpl           
	//*  13   23:ifne            59
		{
			longpoint.setY(((Number) (Long.valueOf(edge.getCurrent().getY()))));
	//   14   26:aload           10
	//   15   28:aload_1         
	//   16   29:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//   17   32:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//   18   35:invokestatic    #368 <Method Long Long.valueOf(long)>
	//   19   38:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
			longpoint.setX(((Number) (Long.valueOf(Edge.topX(edge, longpoint.getY())))));
	//   20   41:aload           10
	//   21   43:aload_1         
	//   22   44:aload           10
	//   23   46:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//   24   49:invokestatic    #231 <Method long Edge.topX(Edge, long)>
	//   25   52:invokestatic    #368 <Method Long Long.valueOf(long)>
	//   26   55:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
		} else
	//*  27   58:return          
		{
			if(edge.getDelta().getX() == 0L)
	//*  28   59:aload_1         
	//*  29   60:invokevirtual   #725 <Method Point$LongPoint Edge.getDelta()>
	//*  30   63:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  31   66:lconst_0        
	//*  32   67:lcmp            
	//*  33   68:ifne            331
			{
				longpoint.setX(((Number) (Long.valueOf(edge.getBot().getX()))));
	//   34   71:aload           10
	//   35   73:aload_1         
	//   36   74:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   37   77:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   38   80:invokestatic    #368 <Method Long Long.valueOf(long)>
	//   39   83:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
				if(edge1.isHorizontal())
	//*  40   86:aload_2         
	//*  41   87:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//*  42   90:ifeq            275
				{
					longpoint.setY(((Number) (Long.valueOf(edge1.getBot().getY()))));
	//   43   93:aload           10
	//   44   95:aload_2         
	//   45   96:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   46   99:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//   47  102:invokestatic    #368 <Method Long Long.valueOf(long)>
	//   48  105:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
				} else
	//*  49  108:aload           10
	//*  50  110:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  51  113:aload_1         
	//*  52  114:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  53  117:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  54  120:lcmp            
	//*  55  121:iflt            140
	//*  56  124:aload           10
	//*  57  126:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  58  129:aload_2         
	//*  59  130:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  60  133:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  61  136:lcmp            
	//*  62  137:ifge            208
	//*  63  140:aload_1         
	//*  64  141:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  65  144:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  66  147:aload_2         
	//*  67  148:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  68  151:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  69  154:lcmp            
	//*  70  155:ifle            583
	//*  71  158:aload           10
	//*  72  160:aload_1         
	//*  73  161:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  74  164:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  75  167:invokestatic    #368 <Method Long Long.valueOf(long)>
	//*  76  170:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
	//*  77  173:aload_1         
	//*  78  174:getfield        #215 <Field double Edge.deltaX>
	//*  79  177:invokestatic    #728 <Method double Math.abs(double)>
	//*  80  180:aload_2         
	//*  81  181:getfield        #215 <Field double Edge.deltaX>
	//*  82  184:invokestatic    #728 <Method double Math.abs(double)>
	//*  83  187:dcmpg           
	//*  84  188:ifge            601
	//*  85  191:aload           10
	//*  86  193:aload_1         
	//*  87  194:aload           10
	//*  88  196:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  89  199:invokestatic    #231 <Method long Edge.topX(Edge, long)>
	//*  90  202:invokestatic    #368 <Method Long Long.valueOf(long)>
	//*  91  205:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
	//*  92  208:aload           10
	//*  93  210:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  94  213:aload_1         
	//*  95  214:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//*  96  217:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  97  220:lcmp            
	//*  98  221:ifle            58
	//*  99  224:aload           10
	//* 100  226:aload_1         
	//* 101  227:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 102  230:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 103  233:invokestatic    #368 <Method Long Long.valueOf(long)>
	//* 104  236:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
	//* 105  239:aload_1         
	//* 106  240:getfield        #215 <Field double Edge.deltaX>
	//* 107  243:invokestatic    #728 <Method double Math.abs(double)>
	//* 108  246:aload_2         
	//* 109  247:getfield        #215 <Field double Edge.deltaX>
	//* 110  250:invokestatic    #728 <Method double Math.abs(double)>
	//* 111  253:dcmpl           
	//* 112  254:ifle            621
	//* 113  257:aload           10
	//* 114  259:aload_2         
	//* 115  260:aload           10
	//* 116  262:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 117  265:invokestatic    #231 <Method long Edge.topX(Edge, long)>
	//* 118  268:invokestatic    #368 <Method Long Long.valueOf(long)>
	//* 119  271:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
	//* 120  274:return          
				{
					double d = edge1.getBot().getY();
	//  121  275:aload_2         
	//  122  276:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  123  279:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  124  282:l2d             
	//  125  283:dstore          4
					double d3 = (double)edge1.getBot().getX() / edge1.deltaX;
	//  126  285:aload_2         
	//  127  286:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  128  289:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  129  292:l2d             
	//  130  293:aload_2         
	//  131  294:getfield        #215 <Field double Edge.deltaX>
	//  132  297:ddiv            
	//  133  298:dstore          6
					longpoint.setY(((Number) (Long.valueOf(Math.round((double)longpoint.getX() / edge1.deltaX + (d - d3))))));
	//  134  300:aload           10
	//  135  302:aload           10
	//  136  304:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  137  307:l2d             
	//  138  308:aload_2         
	//  139  309:getfield        #215 <Field double Edge.deltaX>
	//  140  312:ddiv            
	//  141  313:dload           4
	//  142  315:dload           6
	//  143  317:dsub            
	//  144  318:dadd            
	//  145  319:invokestatic    #732 <Method long Math.round(double)>
	//  146  322:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  147  325:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
				}
			} else
	//* 148  328:goto            108
			if(edge1.getDelta().getX() == 0L)
	//* 149  331:aload_2         
	//* 150  332:invokevirtual   #725 <Method Point$LongPoint Edge.getDelta()>
	//* 151  335:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 152  338:lconst_0        
	//* 153  339:lcmp            
	//* 154  340:ifne            439
			{
				longpoint.setX(((Number) (Long.valueOf(edge1.getBot().getX()))));
	//  155  343:aload           10
	//  156  345:aload_2         
	//  157  346:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  158  349:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  159  352:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  160  355:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
				if(edge.isHorizontal())
	//* 161  358:aload_1         
	//* 162  359:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//* 163  362:ifeq            383
				{
					longpoint.setY(((Number) (Long.valueOf(edge.getBot().getY()))));
	//  164  365:aload           10
	//  165  367:aload_1         
	//  166  368:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  167  371:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  168  374:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  169  377:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
				} else
	//* 170  380:goto            108
				{
					double d1 = edge.getBot().getY();
	//  171  383:aload_1         
	//  172  384:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  173  387:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  174  390:l2d             
	//  175  391:dstore          4
					double d4 = (double)edge.getBot().getX() / edge.deltaX;
	//  176  393:aload_1         
	//  177  394:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  178  397:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  179  400:l2d             
	//  180  401:aload_1         
	//  181  402:getfield        #215 <Field double Edge.deltaX>
	//  182  405:ddiv            
	//  183  406:dstore          6
					longpoint.setY(((Number) (Long.valueOf(Math.round((double)longpoint.getX() / edge.deltaX + (d1 - d4))))));
	//  184  408:aload           10
	//  185  410:aload           10
	//  186  412:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  187  415:l2d             
	//  188  416:aload_1         
	//  189  417:getfield        #215 <Field double Edge.deltaX>
	//  190  420:ddiv            
	//  191  421:dload           4
	//  192  423:dload           6
	//  193  425:dsub            
	//  194  426:dadd            
	//  195  427:invokestatic    #732 <Method long Math.round(double)>
	//  196  430:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  197  433:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
				}
			} else
	//* 198  436:goto            108
			{
				double d2 = (double)edge.getBot().getX() - (double)edge.getBot().getY() * edge.deltaX;
	//  199  439:aload_1         
	//  200  440:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  201  443:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  202  446:l2d             
	//  203  447:aload_1         
	//  204  448:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  205  451:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  206  454:l2d             
	//  207  455:aload_1         
	//  208  456:getfield        #215 <Field double Edge.deltaX>
	//  209  459:dmul            
	//  210  460:dsub            
	//  211  461:dstore          4
				double d5 = (double)edge1.getBot().getX() - (double)edge1.getBot().getY() * edge1.deltaX;
	//  212  463:aload_2         
	//  213  464:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  214  467:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  215  470:l2d             
	//  216  471:aload_2         
	//  217  472:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  218  475:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  219  478:l2d             
	//  220  479:aload_2         
	//  221  480:getfield        #215 <Field double Edge.deltaX>
	//  222  483:dmul            
	//  223  484:dsub            
	//  224  485:dstore          6
				double d6 = (d5 - d2) / (edge.deltaX - edge1.deltaX);
	//  225  487:dload           6
	//  226  489:dload           4
	//  227  491:dsub            
	//  228  492:aload_1         
	//  229  493:getfield        #215 <Field double Edge.deltaX>
	//  230  496:aload_2         
	//  231  497:getfield        #215 <Field double Edge.deltaX>
	//  232  500:dsub            
	//  233  501:ddiv            
	//  234  502:dstore          8
				longpoint.setY(((Number) (Long.valueOf(Math.round(d6)))));
	//  235  504:aload           10
	//  236  506:dload           8
	//  237  508:invokestatic    #732 <Method long Math.round(double)>
	//  238  511:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  239  514:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
				if(Math.abs(edge.deltaX) < Math.abs(edge1.deltaX))
	//* 240  517:aload_1         
	//* 241  518:getfield        #215 <Field double Edge.deltaX>
	//* 242  521:invokestatic    #728 <Method double Math.abs(double)>
	//* 243  524:aload_2         
	//* 244  525:getfield        #215 <Field double Edge.deltaX>
	//* 245  528:invokestatic    #728 <Method double Math.abs(double)>
	//* 246  531:dcmpg           
	//* 247  532:ifge            559
					longpoint.setX(((Number) (Long.valueOf(Math.round(edge.deltaX * d6 + d2)))));
	//  248  535:aload           10
	//  249  537:aload_1         
	//  250  538:getfield        #215 <Field double Edge.deltaX>
	//  251  541:dload           8
	//  252  543:dmul            
	//  253  544:dload           4
	//  254  546:dadd            
	//  255  547:invokestatic    #732 <Method long Math.round(double)>
	//  256  550:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  257  553:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
				else
	//* 258  556:goto            108
					longpoint.setX(((Number) (Long.valueOf(Math.round(edge1.deltaX * d6 + d5)))));
	//  259  559:aload           10
	//  260  561:aload_2         
	//  261  562:getfield        #215 <Field double Edge.deltaX>
	//  262  565:dload           8
	//  263  567:dmul            
	//  264  568:dload           6
	//  265  570:dadd            
	//  266  571:invokestatic    #732 <Method long Math.round(double)>
	//  267  574:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  268  577:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
			}
			if(longpoint.getY() < edge.getTop().getY() || longpoint.getY() < edge1.getTop().getY())
			{
				if(edge.getTop().getY() > edge1.getTop().getY())
					longpoint.setY(((Number) (Long.valueOf(edge.getTop().getY()))));
				else
	//* 269  580:goto            108
					longpoint.setY(((Number) (Long.valueOf(edge1.getTop().getY()))));
	//  270  583:aload           10
	//  271  585:aload_2         
	//  272  586:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  273  589:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  274  592:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  275  595:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
				if(Math.abs(edge.deltaX) < Math.abs(edge1.deltaX))
					longpoint.setX(((Number) (Long.valueOf(Edge.topX(edge, longpoint.getY())))));
				else
	//* 276  598:goto            173
					longpoint.setX(((Number) (Long.valueOf(Edge.topX(edge1, longpoint.getY())))));
	//  277  601:aload           10
	//  278  603:aload_2         
	//  279  604:aload           10
	//  280  606:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  281  609:invokestatic    #231 <Method long Edge.topX(Edge, long)>
	//  282  612:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  283  615:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
			}
			if(longpoint.getY() > edge.getCurrent().getY())
			{
				longpoint.setY(((Number) (Long.valueOf(edge.getCurrent().getY()))));
				if(Math.abs(edge.deltaX) > Math.abs(edge1.deltaX))
				{
					longpoint.setX(((Number) (Long.valueOf(Edge.topX(edge1, longpoint.getY())))));
					return;
				} else
	//* 284  618:goto            208
				{
					longpoint.setX(((Number) (Long.valueOf(Edge.topX(edge, longpoint.getY())))));
	//  285  621:aload           10
	//  286  623:aload_1         
	//  287  624:aload           10
	//  288  626:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  289  629:invokestatic    #231 <Method long Edge.topX(Edge, long)>
	//  290  632:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  291  635:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
					return;
	//  292  638:return          
				}
			}
		}
	}

	private static boolean isParam1RightOfParam2(Path.OutRec outrec, Path.OutRec outrec1)
	{
		Path.OutRec outrec2;
		do
		{
			outrec2 = outrec.firstLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//    2    4:astore_2        
			if(outrec2 == outrec1)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpne       12
				return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
			outrec = outrec2;
	//    8   12:aload_2         
	//    9   13:astore_0        
		} while(outrec2 != null);
	//   10   14:aload_2         
	//   11   15:ifnonnull       0
		return false;
	//   12   18:iconst_0        
	//   13   19:ireturn         
	}

	private static int isPointInPolygon(Point.LongPoint longpoint, Path.OutPt outpt)
	{
		int j;
		long l;
		long l1;
		long l4;
		long l5;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		l4 = longpoint.getX();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//    4    7:lstore          16
		l5 = longpoint.getY();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//    7   13:lstore          18
		l = outpt.getPt().getX();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   10   19:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   11   22:lstore          8
		l1 = outpt.getPt().getY();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   14   28:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//   15   31:lstore          10
		longpoint = ((Point.LongPoint) (outpt));
	//   16   33:aload_1         
	//   17   34:astore_0        
_L2:
		int i;
		long l2;
		long l3;
		Path.OutPt outpt1;
label0:
		{
			outpt1 = ((Path.OutPt) (longpoint)).next;
	//   18   35:aload_0         
	//   19   36:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   20   39:astore          20
			l3 = outpt1.getPt().getX();
	//   21   41:aload           20
	//   22   43:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   23   46:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   24   49:lstore          14
			l2 = outpt1.getPt().getY();
	//   25   51:aload           20
	//   26   53:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   27   56:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//   28   59:lstore          12
			if(l2 != l5)
				break label0;
	//   29   61:lload           12
	//   30   63:lload           18
	//   31   65:lcmp            
	//   32   66:ifne            128
			if(l3 != l4)
	//*  33   69:lload           14
	//*  34   71:lload           16
	//*  35   73:lcmp            
	//*  36   74:ifeq            114
			{
				if(l1 != l5)
					break label0;
	//   37   77:lload           10
	//   38   79:lload           18
	//   39   81:lcmp            
	//   40   82:ifne            128
				boolean flag;
				boolean flag1;
				if(l3 > l4)
	//*  41   85:lload           14
	//*  42   87:lload           16
	//*  43   89:lcmp            
	//*  44   90:ifle            116
					flag = true;
	//   45   93:iconst_1        
	//   46   94:istore          4
				else
	//*  47   96:lload           8
	//*  48   98:lload           16
	//*  49  100:lcmp            
	//*  50  101:ifge            122
	//*  51  104:iconst_1        
	//*  52  105:istore          6
	//*  53  107:iload           4
	//*  54  109:iload           6
	//*  55  111:icmpne          128
	//*  56  114:iconst_m1       
	//*  57  115:ireturn         
					flag = false;
	//   58  116:iconst_0        
	//   59  117:istore          4
				if(l < l4)
					flag1 = true;
				else
	//*  60  119:goto            96
					flag1 = false;
	//   61  122:iconst_0        
	//   62  123:istore          6
				if(flag != flag1)
					break label0;
			}
			return -1;
		}
	//*  63  125:goto            107
		boolean flag2;
		boolean flag5;
		if(l1 < l5)
	//*  64  128:lload           10
	//*  65  130:lload           18
	//*  66  132:lcmp            
	//*  67  133:ifge            207
			flag2 = true;
	//   68  136:iconst_1        
	//   69  137:istore          6
		else
	//*  70  139:lload           12
	//*  71  141:lload           18
	//*  72  143:lcmp            
	//*  73  144:ifge            213
	//*  74  147:iconst_1        
	//*  75  148:istore          7
	//*  76  150:iload           5
	//*  77  152:istore          4
	//*  78  154:iload           6
	//*  79  156:iload           7
	//*  80  158:icmpeq          183
	//*  81  161:lload           8
	//*  82  163:lload           16
	//*  83  165:lcmp            
	//*  84  166:iflt            307
	//*  85  169:lload           14
	//*  86  171:lload           16
	//*  87  173:lcmp            
	//*  88  174:ifle            219
	//*  89  177:iconst_1        
	//*  90  178:iload           5
	//*  91  180:isub            
	//*  92  181:istore          4
	//*  93  183:lload           14
	//*  94  185:lstore          8
	//*  95  187:lload           12
	//*  96  189:lstore          10
	//*  97  191:iload           4
	//*  98  193:istore          5
	//*  99  195:aload           20
	//* 100  197:astore_0        
	//* 101  198:aload_1         
	//* 102  199:aload           20
	//* 103  201:if_acmpne       35
	//* 104  204:iload           4
	//* 105  206:ireturn         
			flag2 = false;
	//  106  207:iconst_0        
	//  107  208:istore          6
		if(l2 < l5)
			flag5 = true;
		else
	//* 108  210:goto            139
			flag5 = false;
	//  109  213:iconst_0        
	//  110  214:istore          7
		i = j;
		if(flag2 != flag5)
		{
			if(l < l4)
				break; /* Loop/switch isn't completed */
			if(l3 > l4)
			{
				i = 1 - j;
			} else
	//* 111  216:goto            150
			{
				double d = (double)(l - l4) * (double)(l2 - l5) - (double)(l3 - l4) * (double)(l1 - l5);
	//  112  219:lload           8
	//  113  221:lload           16
	//  114  223:lsub            
	//  115  224:l2d             
	//  116  225:lload           12
	//  117  227:lload           18
	//  118  229:lsub            
	//  119  230:l2d             
	//  120  231:dmul            
	//  121  232:lload           14
	//  122  234:lload           16
	//  123  236:lsub            
	//  124  237:l2d             
	//  125  238:lload           10
	//  126  240:lload           18
	//  127  242:lsub            
	//  128  243:l2d             
	//  129  244:dmul            
	//  130  245:dsub            
	//  131  246:dstore_2        
				if(d == 0.0D)
	//* 132  247:dload_2         
	//* 133  248:dconst_0        
	//* 134  249:dcmpl           
	//* 135  250:ifne            255
					return -1;
	//  136  253:iconst_m1       
	//  137  254:ireturn         
				boolean flag3;
				boolean flag6;
				if(d > 0.0D)
	//* 138  255:dload_2         
	//* 139  256:dconst_0        
	//* 140  257:dcmpl           
	//* 141  258:ifle            295
					flag3 = true;
	//  142  261:iconst_1        
	//  143  262:istore          6
				else
	//* 144  264:lload           12
	//* 145  266:lload           10
	//* 146  268:lcmp            
	//* 147  269:ifle            301
	//* 148  272:iconst_1        
	//* 149  273:istore          7
	//* 150  275:iload           5
	//* 151  277:istore          4
	//* 152  279:iload           6
	//* 153  281:iload           7
	//* 154  283:icmpne          183
	//* 155  286:iconst_1        
	//* 156  287:iload           5
	//* 157  289:isub            
	//* 158  290:istore          4
	//* 159  292:goto            183
					flag3 = false;
	//  160  295:iconst_0        
	//  161  296:istore          6
				if(l2 > l1)
					flag6 = true;
				else
	//* 162  298:goto            264
					flag6 = false;
	//  163  301:iconst_0        
	//  164  302:istore          7
				i = j;
				if(flag3 == flag6)
					i = 1 - j;
			}
		}
_L3:
		l = l3;
		l1 = l2;
		j = i;
		longpoint = ((Point.LongPoint) (outpt1));
		if(outpt == outpt1)
			return i;
		if(true) goto _L2; else goto _L1
	//* 165  304:goto            275
_L1:
		i = j;
	//  166  307:iload           5
	//  167  309:istore          4
		if(l3 > l4)
	//* 168  311:lload           14
	//* 169  313:lload           16
	//* 170  315:lcmp            
	//* 171  316:ifle            183
		{
			double d1 = (double)(l - l4) * (double)(l2 - l5) - (double)(l3 - l4) * (double)(l1 - l5);
	//  172  319:lload           8
	//  173  321:lload           16
	//  174  323:lsub            
	//  175  324:l2d             
	//  176  325:lload           12
	//  177  327:lload           18
	//  178  329:lsub            
	//  179  330:l2d             
	//  180  331:dmul            
	//  181  332:lload           14
	//  182  334:lload           16
	//  183  336:lsub            
	//  184  337:l2d             
	//  185  338:lload           10
	//  186  340:lload           18
	//  187  342:lsub            
	//  188  343:l2d             
	//  189  344:dmul            
	//  190  345:dsub            
	//  191  346:dstore_2        
			if(d1 == 0.0D)
	//* 192  347:dload_2         
	//* 193  348:dconst_0        
	//* 194  349:dcmpl           
	//* 195  350:ifne            355
				return -1;
	//  196  353:iconst_m1       
	//  197  354:ireturn         
			boolean flag4;
			boolean flag7;
			if(d1 > 0.0D)
	//* 198  355:dload_2         
	//* 199  356:dconst_0        
	//* 200  357:dcmpl           
	//* 201  358:ifle            395
				flag4 = true;
	//  202  361:iconst_1        
	//  203  362:istore          6
			else
	//* 204  364:lload           12
	//* 205  366:lload           10
	//* 206  368:lcmp            
	//* 207  369:ifle            401
	//* 208  372:iconst_1        
	//* 209  373:istore          7
	//* 210  375:iload           5
	//* 211  377:istore          4
	//* 212  379:iload           6
	//* 213  381:iload           7
	//* 214  383:icmpne          183
	//* 215  386:iconst_1        
	//* 216  387:iload           5
	//* 217  389:isub            
	//* 218  390:istore          4
	//* 219  392:goto            183
				flag4 = false;
	//  220  395:iconst_0        
	//  221  396:istore          6
			if(l2 > l1)
				flag7 = true;
			else
	//* 222  398:goto            364
				flag7 = false;
	//  223  401:iconst_0        
	//  224  402:istore          7
			i = j;
			if(flag4 == flag7)
				i = 1 - j;
		}
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	//* 225  404:goto            375
	}

	private void joinCommonEdges()
	{
		int i;
		Path.OutRec outrec1;
		Path.OutRec outrec2;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		break MISSING_BLOCK_LABEL_2;
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #91  <Field List joins>
	//*   5    7:invokeinterface #396 <Method int List.size()>
	//*   6   12:icmpge          664
	//*   7   15:aload_0         
	//*   8   16:getfield        #91  <Field List joins>
	//*   9   19:iload_1         
	//*  10   20:invokeinterface #127 <Method Object List.get(int)>
	//*  11   25:checkcast       #173 <Class Path$Join>
	//*  12   28:astore          8
	//*  13   30:aload_0         
	//*  14   31:aload           8
	//*  15   33:getfield        #177 <Field Path$OutPt Path$Join.outPt1>
	//*  16   36:getfield        #259 <Field int Path$OutPt.idx>
	//*  17   39:invokespecial   #736 <Method Path$OutRec getOutRec(int)>
	//*  18   42:astore          6
	//*  19   44:aload_0         
	//*  20   45:aload           8
	//*  21   47:getfield        #191 <Field Path$OutPt Path$Join.outPt2>
	//*  22   50:getfield        #259 <Field int Path$OutPt.idx>
	//*  23   53:invokespecial   #736 <Method Path$OutRec getOutRec(int)>
	//*  24   56:astore          7
	//*  25   58:aload           6
	//*  26   60:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  27   63:ifnull          74
	//*  28   66:aload           7
	//*  29   68:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  30   71:ifnonnull       81
_L3:
		i++;
	//   31   74:iload_1         
	//   32   75:iconst_1        
	//   33   76:iadd            
	//   34   77:istore_1        
		if(true) goto _L2; else goto _L1
	//   35   78:goto            2
_L2:
		Path.OutRec outrec;
		if(i >= joins.size())
			break; /* Loop/switch isn't completed */
		Path.Join join = (Path.Join)joins.get(i);
		outrec1 = getOutRec(join.outPt1.idx);
		outrec2 = getOutRec(join.outPt2.idx);
		if(outrec1.getPoints() != null && outrec2.getPoints() != null && !outrec1.isOpen && !outrec2.isOpen)
	//*  36   81:aload           6
	//*  37   83:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//*  38   86:ifne            74
	//*  39   89:aload           7
	//*  40   91:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//*  41   94:ifne            74
		{
			if(outrec1 == outrec2)
	//*  42   97:aload           6
	//*  43   99:aload           7
	//*  44  101:if_acmpne       246
				outrec = outrec1;
	//   45  104:aload           6
	//   46  106:astore          5
			else
	//*  47  108:aload_0         
	//*  48  109:aload           8
	//*  49  111:aload           6
	//*  50  113:aload           7
	//*  51  115:invokespecial   #740 <Method boolean joinPoints(Path$Join, Path$OutRec, Path$OutRec)>
	//*  52  118:ifeq            74
	//*  53  121:aload           6
	//*  54  123:aload           7
	//*  55  125:if_acmpne       590
	//*  56  128:aload           6
	//*  57  130:aload           8
	//*  58  132:getfield        #177 <Field Path$OutPt Path$Join.outPt1>
	//*  59  135:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
	//*  60  138:aload           6
	//*  61  140:aconst_null     
	//*  62  141:putfield        #341 <Field Path$OutPt Path$OutRec.bottomPt>
	//*  63  144:aload_0         
	//*  64  145:invokespecial   #249 <Method Path$OutRec createOutRec()>
	//*  65  148:astore          5
	//*  66  150:aload           5
	//*  67  152:aload           8
	//*  68  154:getfield        #191 <Field Path$OutPt Path$Join.outPt2>
	//*  69  157:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
	//*  70  160:aload_0         
	//*  71  161:aload           5
	//*  72  163:invokespecial   #476 <Method void updateOutPtIdxs(Path$OutRec)>
	//*  73  166:aload_0         
	//*  74  167:getfield        #87  <Field boolean usingPolyTree>
	//*  75  170:ifeq            318
	//*  76  173:iconst_0        
	//*  77  174:istore_2        
	//*  78  175:iload_2         
	//*  79  176:aload_0         
	//*  80  177:getfield        #89  <Field List polyOuts>
	//*  81  180:invokeinterface #396 <Method int List.size()>
	//*  82  185:iconst_1        
	//*  83  186:isub            
	//*  84  187:icmpge          318
	//*  85  190:aload_0         
	//*  86  191:getfield        #89  <Field List polyOuts>
	//*  87  194:iload_2         
	//*  88  195:invokeinterface #127 <Method Object List.get(int)>
	//*  89  200:checkcast       #129 <Class Path$OutRec>
	//*  90  203:astore          7
	//*  91  205:aload           7
	//*  92  207:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//*  93  210:ifnull          239
	//*  94  213:aload           7
	//*  95  215:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//*  96  218:invokestatic    #531 <Method Path$OutRec parseFirstLeft(Path$OutRec)>
	//*  97  221:aload           6
	//*  98  223:if_acmpne       239
	//*  99  226:aload           7
	//* 100  228:getfield        #351 <Field boolean Path$OutRec.isHole>
	//* 101  231:aload           6
	//* 102  233:getfield        #351 <Field boolean Path$OutRec.isHole>
	//* 103  236:icmpne          292
	//* 104  239:iload_2         
	//* 105  240:iconst_1        
	//* 106  241:iadd            
	//* 107  242:istore_2        
	//* 108  243:goto            175
			if(isParam1RightOfParam2(outrec1, outrec2))
	//* 109  246:aload           6
	//* 110  248:aload           7
	//* 111  250:invokestatic    #327 <Method boolean isParam1RightOfParam2(Path$OutRec, Path$OutRec)>
	//* 112  253:ifeq            263
				outrec = outrec2;
	//  113  256:aload           7
	//  114  258:astore          5
			else
	//* 115  260:goto            108
			if(isParam1RightOfParam2(outrec2, outrec1))
	//* 116  263:aload           7
	//* 117  265:aload           6
	//* 118  267:invokestatic    #327 <Method boolean isParam1RightOfParam2(Path$OutRec, Path$OutRec)>
	//* 119  270:ifeq            280
				outrec = outrec1;
	//  120  273:aload           6
	//  121  275:astore          5
			else
	//* 122  277:goto            108
				outrec = Path.OutPt.getLowerMostRec(outrec1, outrec2);
	//  123  280:aload           6
	//  124  282:aload           7
	//  125  284:invokestatic    #355 <Method Path$OutRec Path$OutPt.getLowerMostRec(Path$OutRec, Path$OutRec)>
	//  126  287:astore          5
			if(joinPoints(join, outrec1, outrec2))
			{
label0:
				{
					if(outrec1 != outrec2)
						break label0;
					outrec1.setPoints(join.outPt1);
					outrec1.bottomPt = null;
					outrec = createOutRec();
					outrec.setPoints(join.outPt2);
					updateOutPtIdxs(outrec);
					if(usingPolyTree)
					{
						int j = 0;
						do
						{
							if(j >= polyOuts.size() - 1)
								break;
							outrec2 = (Path.OutRec)polyOuts.get(j);
							if(outrec2.getPoints() != null && parseFirstLeft(outrec2.firstLeft) == outrec1 && outrec2.isHole != outrec1.isHole && poly2ContainsPoly1(outrec2.getPoints(), join.outPt2))
	//* 127  289:goto            108
	//* 128  292:aload           7
	//* 129  294:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 130  297:aload           8
	//* 131  299:getfield        #191 <Field Path$OutPt Path$Join.outPt2>
	//* 132  302:invokestatic    #480 <Method boolean poly2ContainsPoly1(Path$OutPt, Path$OutPt)>
	//* 133  305:ifeq            239
								outrec2.firstLeft = outrec;
	//  134  308:aload           7
	//  135  310:aload           5
	//  136  312:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
							j++;
						} while(true);
					}
	//* 137  315:goto            239
					if(poly2ContainsPoly1(outrec.getPoints(), outrec1.getPoints()))
	//* 138  318:aload           5
	//* 139  320:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 140  323:aload           6
	//* 141  325:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 142  328:invokestatic    #480 <Method boolean poly2ContainsPoly1(Path$OutPt, Path$OutPt)>
	//* 143  331:ifeq            425
					{
						boolean flag;
						boolean flag2;
						boolean flag4;
						if(!outrec1.isHole)
	//* 144  334:aload           6
	//* 145  336:getfield        #351 <Field boolean Path$OutRec.isHole>
	//* 146  339:ifne            415
							flag2 = true;
	//  147  342:iconst_1        
	//  148  343:istore_3        
						else
	//* 149  344:aload           5
	//* 150  346:iload_3         
	//* 151  347:putfield        #351 <Field boolean Path$OutRec.isHole>
	//* 152  350:aload           5
	//* 153  352:aload           6
	//* 154  354:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 155  357:aload_0         
	//* 156  358:getfield        #87  <Field boolean usingPolyTree>
	//* 157  361:ifeq            372
	//* 158  364:aload_0         
	//* 159  365:aload           5
	//* 160  367:aload           6
	//* 161  369:invokespecial   #484 <Method void fixupFirstLefts2(Path$OutRec, Path$OutRec)>
	//* 162  372:aload           5
	//* 163  374:getfield        #351 <Field boolean Path$OutRec.isHole>
	//* 164  377:istore_3        
	//* 165  378:aload_0         
	//* 166  379:getfield        #95  <Field boolean reverseSolution>
	//* 167  382:istore          4
	//* 168  384:aload           5
	//* 169  386:invokevirtual   #516 <Method double Path$OutRec.area()>
	//* 170  389:dconst_0        
	//* 171  390:dcmpl           
	//* 172  391:ifle            420
	//* 173  394:iconst_1        
	//* 174  395:istore_2        
	//* 175  396:iload           4
	//* 176  398:iload_3         
	//* 177  399:ixor            
	//* 178  400:iload_2         
	//* 179  401:icmpne          74
	//* 180  404:aload           5
	//* 181  406:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 182  409:invokevirtual   #338 <Method void Path$OutPt.reversePolyPtLinks()>
	//* 183  412:goto            74
							flag2 = false;
	//  184  415:iconst_0        
	//  185  416:istore_3        
						outrec.isHole = flag2;
						outrec.firstLeft = outrec1;
						if(usingPolyTree)
							fixupFirstLefts2(outrec, outrec1);
						flag2 = outrec.isHole;
						flag4 = reverseSolution;
						if(outrec.area() > 0.0D)
							flag = true;
						else
	//* 186  417:goto            344
							flag = false;
	//  187  420:iconst_0        
	//  188  421:istore_2        
						if((flag4 ^ flag2) == flag)
							outrec.getPoints().reversePolyPtLinks();
					} else
	//* 189  422:goto            396
					if(poly2ContainsPoly1(outrec1.getPoints(), outrec.getPoints()))
	//* 190  425:aload           6
	//* 191  427:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 192  430:aload           5
	//* 193  432:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 194  435:invokestatic    #480 <Method boolean poly2ContainsPoly1(Path$OutPt, Path$OutPt)>
	//* 195  438:ifeq            552
					{
						outrec.isHole = outrec1.isHole;
	//  196  441:aload           5
	//  197  443:aload           6
	//  198  445:getfield        #351 <Field boolean Path$OutRec.isHole>
	//  199  448:putfield        #351 <Field boolean Path$OutRec.isHole>
						boolean flag1;
						boolean flag3;
						boolean flag5;
						if(!outrec.isHole)
	//* 200  451:aload           5
	//* 201  453:getfield        #351 <Field boolean Path$OutRec.isHole>
	//* 202  456:ifne            542
							flag3 = true;
	//  203  459:iconst_1        
	//  204  460:istore_3        
						else
	//* 205  461:aload           6
	//* 206  463:iload_3         
	//* 207  464:putfield        #351 <Field boolean Path$OutRec.isHole>
	//* 208  467:aload           5
	//* 209  469:aload           6
	//* 210  471:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 211  474:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 212  477:aload           6
	//* 213  479:aload           5
	//* 214  481:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//* 215  484:aload_0         
	//* 216  485:getfield        #87  <Field boolean usingPolyTree>
	//* 217  488:ifeq            499
	//* 218  491:aload_0         
	//* 219  492:aload           6
	//* 220  494:aload           5
	//* 221  496:invokespecial   #484 <Method void fixupFirstLefts2(Path$OutRec, Path$OutRec)>
	//* 222  499:aload           6
	//* 223  501:getfield        #351 <Field boolean Path$OutRec.isHole>
	//* 224  504:istore_3        
	//* 225  505:aload_0         
	//* 226  506:getfield        #95  <Field boolean reverseSolution>
	//* 227  509:istore          4
	//* 228  511:aload           6
	//* 229  513:invokevirtual   #516 <Method double Path$OutRec.area()>
	//* 230  516:dconst_0        
	//* 231  517:dcmpl           
	//* 232  518:ifle            547
	//* 233  521:iconst_1        
	//* 234  522:istore_2        
	//* 235  523:iload           4
	//* 236  525:iload_3         
	//* 237  526:ixor            
	//* 238  527:iload_2         
	//* 239  528:icmpne          74
	//* 240  531:aload           6
	//* 241  533:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//* 242  536:invokevirtual   #338 <Method void Path$OutPt.reversePolyPtLinks()>
	//* 243  539:goto            74
							flag3 = false;
	//  244  542:iconst_0        
	//  245  543:istore_3        
						outrec1.isHole = flag3;
						outrec.firstLeft = outrec1.firstLeft;
						outrec1.firstLeft = outrec;
						if(usingPolyTree)
							fixupFirstLefts2(outrec1, outrec);
						flag3 = outrec1.isHole;
						flag5 = reverseSolution;
						if(outrec1.area() > 0.0D)
							flag1 = true;
						else
	//* 246  544:goto            461
							flag1 = false;
	//  247  547:iconst_0        
	//  248  548:istore_2        
						if((flag5 ^ flag3) == flag1)
							outrec1.getPoints().reversePolyPtLinks();
					} else
	//* 249  549:goto            523
					{
						outrec.isHole = outrec1.isHole;
	//  250  552:aload           5
	//  251  554:aload           6
	//  252  556:getfield        #351 <Field boolean Path$OutRec.isHole>
	//  253  559:putfield        #351 <Field boolean Path$OutRec.isHole>
						outrec.firstLeft = outrec1.firstLeft;
	//  254  562:aload           5
	//  255  564:aload           6
	//  256  566:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//  257  569:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
						if(usingPolyTree)
	//* 258  572:aload_0         
	//* 259  573:getfield        #87  <Field boolean usingPolyTree>
	//* 260  576:ifeq            74
							fixupFirstLefts1(outrec1, outrec);
	//  261  579:aload_0         
	//  262  580:aload           6
	//  263  582:aload           5
	//  264  584:invokespecial   #487 <Method void fixupFirstLefts1(Path$OutRec, Path$OutRec)>
					}
				}
			}
		}
		  goto _L3
	//* 265  587:goto            74
		outrec2.setPoints(((Path.OutPt) (null)));
	//  266  590:aload           7
	//  267  592:aconst_null     
	//  268  593:invokevirtual   #320 <Method void Path$OutRec.setPoints(Path$OutPt)>
		outrec2.bottomPt = null;
	//  269  596:aload           7
	//  270  598:aconst_null     
	//  271  599:putfield        #341 <Field Path$OutPt Path$OutRec.bottomPt>
		outrec2.Idx = outrec1.Idx;
	//  272  602:aload           7
	//  273  604:aload           6
	//  274  606:getfield        #256 <Field int Path$OutRec.Idx>
	//  275  609:putfield        #256 <Field int Path$OutRec.Idx>
		outrec1.isHole = outrec.isHole;
	//  276  612:aload           6
	//  277  614:aload           5
	//  278  616:getfield        #351 <Field boolean Path$OutRec.isHole>
	//  279  619:putfield        #351 <Field boolean Path$OutRec.isHole>
		if(outrec == outrec2)
	//* 280  622:aload           5
	//* 281  624:aload           7
	//* 282  626:if_acmpne       639
			outrec1.firstLeft = outrec2.firstLeft;
	//  283  629:aload           6
	//  284  631:aload           7
	//  285  633:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//  286  636:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
		outrec2.firstLeft = outrec1;
	//  287  639:aload           7
	//  288  641:aload           6
	//  289  643:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
		if(usingPolyTree)
	//* 290  646:aload_0         
	//* 291  647:getfield        #87  <Field boolean usingPolyTree>
	//* 292  650:ifeq            74
			fixupFirstLefts2(outrec2, outrec1);
	//  293  653:aload_0         
	//  294  654:aload           7
	//  295  656:aload           6
	//  296  658:invokespecial   #484 <Method void fixupFirstLefts2(Path$OutRec, Path$OutRec)>
		  goto _L3
	//* 297  661:goto            74
_L1:
	//  298  664:return          
	}

	private static boolean joinHorz(Path.OutPt outpt, Path.OutPt outpt1, Path.OutPt outpt2, Path.OutPt outpt3, Point.LongPoint longpoint, boolean flag)
	{
		boolean flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		Clipper.Direction direction;
		Clipper.Direction direction1;
		if(outpt.getPt().getX() > outpt1.getPt().getX())
	//*   2    3:aload_0         
	//*   3    4:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*   4    7:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*   7   14:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*   8   17:lcmp            
	//*   9   18:ifle            58
			direction = Clipper.Direction.RIGHT_TO_LEFT;
	//   10   21:getstatic       #584 <Field Clipper$Direction Clipper$Direction.RIGHT_TO_LEFT>
	//   11   24:astore          8
		else
	//*  12   26:aload_2         
	//*  13   27:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  14   30:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  15   33:aload_3         
	//*  16   34:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  17   37:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  18   40:lcmp            
	//*  19   41:ifle            66
	//*  20   44:getstatic       #584 <Field Clipper$Direction Clipper$Direction.RIGHT_TO_LEFT>
	//*  21   47:astore          9
	//*  22   49:aload           8
	//*  23   51:aload           9
	//*  24   53:if_acmpne       74
	//*  25   56:iconst_0        
	//*  26   57:ireturn         
			direction = Clipper.Direction.LEFT_TO_RIGHT;
	//   27   58:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//   28   61:astore          8
		if(outpt2.getPt().getX() > outpt3.getPt().getX())
			direction1 = Clipper.Direction.RIGHT_TO_LEFT;
		else
	//*  29   63:goto            26
			direction1 = Clipper.Direction.LEFT_TO_RIGHT;
	//   30   66:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//   31   69:astore          9
		if(direction == direction1)
			return false;
	//*  32   71:goto            49
		outpt1 = outpt;
	//   33   74:aload_0         
	//   34   75:astore_1        
		if(direction == Clipper.Direction.LEFT_TO_RIGHT)
	//*  35   76:aload           8
	//*  36   78:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//*  37   81:if_acmpne       326
		{
			for(outpt1 = outpt; outpt1.next.getPt().getX() <= longpoint.getX() && outpt1.next.getPt().getX() >= outpt1.getPt().getX() && outpt1.next.getPt().getY() == longpoint.getY(); outpt1 = outpt1.next);
	//   38   84:aload_0         
	//   39   85:astore_1        
	//   40   86:aload_1         
	//   41   87:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   42   90:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   43   93:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   44   96:aload           4
	//   45   98:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   46  101:lcmp            
	//   47  102:ifgt            153
	//   48  105:aload_1         
	//   49  106:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   50  109:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   51  112:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   52  115:aload_1         
	//   53  116:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   54  119:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   55  122:lcmp            
	//   56  123:iflt            153
	//   57  126:aload_1         
	//   58  127:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   59  130:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   60  133:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//   61  136:aload           4
	//   62  138:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//   63  141:lcmp            
	//   64  142:ifne            153
	//   65  145:aload_1         
	//   66  146:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   67  149:astore_1        
	//*  68  150:goto            86
			outpt = outpt1;
	//   69  153:aload_1         
	//   70  154:astore_0        
			if(flag)
	//*  71  155:iload           5
	//*  72  157:ifeq            183
			{
				outpt = outpt1;
	//   73  160:aload_1         
	//   74  161:astore_0        
				if(outpt1.getPt().getX() != longpoint.getX())
	//*  75  162:aload_1         
	//*  76  163:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  77  166:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  78  169:aload           4
	//*  79  171:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  80  174:lcmp            
	//*  81  175:ifeq            183
					outpt = outpt1.next;
	//   82  178:aload_1         
	//   83  179:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   84  182:astore_0        
			}
			boolean flag1;
			if(!flag)
	//*  85  183:iload           5
	//*  86  185:ifne            314
				flag1 = true;
	//   87  188:iconst_1        
	//   88  189:istore          6
			else
	//*  89  191:aload_0         
	//*  90  192:iload           6
	//*  91  194:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//*  92  197:astore_3        
	//*  93  198:aload_3         
	//*  94  199:astore_1        
	//*  95  200:aload_3         
	//*  96  201:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  97  204:aload           4
	//*  98  206:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  99  209:ifne            235
	//* 100  212:aload_3         
	//* 101  213:astore_0        
	//* 102  214:aload_0         
	//* 103  215:aload           4
	//* 104  217:invokevirtual   #316 <Method void Path$OutPt.setPt(Point$LongPoint)>
	//* 105  220:iload           5
	//* 106  222:ifne            320
	//* 107  225:iconst_1        
	//* 108  226:istore          6
	//* 109  228:aload_0         
	//* 110  229:iload           6
	//* 111  231:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//* 112  234:astore_1        
	//* 113  235:aload_2         
	//* 114  236:astore_3        
	//* 115  237:aload           9
	//* 116  239:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//* 117  242:if_acmpne       604
	//* 118  245:aload_2         
	//* 119  246:astore_3        
	//* 120  247:aload_3         
	//* 121  248:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 122  251:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 123  254:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 124  257:aload           4
	//* 125  259:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 126  262:lcmp            
	//* 127  263:ifgt            462
	//* 128  266:aload_3         
	//* 129  267:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 130  270:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 131  273:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 132  276:aload_3         
	//* 133  277:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 134  280:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 135  283:lcmp            
	//* 136  284:iflt            462
	//* 137  287:aload_3         
	//* 138  288:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 139  291:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 140  294:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 141  297:aload           4
	//* 142  299:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 143  302:lcmp            
	//* 144  303:ifne            462
	//* 145  306:aload_3         
	//* 146  307:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 147  310:astore_3        
	//* 148  311:goto            247
				flag1 = false;
	//  149  314:iconst_0        
	//  150  315:istore          6
			outpt3 = outpt.duplicate(flag1);
			outpt1 = outpt3;
			if(!outpt3.getPt().equals(((Object) (longpoint))))
			{
				outpt = outpt3;
				outpt.setPt(longpoint);
				if(!flag)
					flag1 = true;
				else
	//* 151  317:goto            191
					flag1 = false;
	//  152  320:iconst_0        
	//  153  321:istore          6
				outpt1 = outpt.duplicate(flag1);
			}
		} else
	//* 154  323:goto            228
		{
			for(; outpt1.next.getPt().getX() >= longpoint.getX() && outpt1.next.getPt().getX() <= outpt1.getPt().getX() && outpt1.next.getPt().getY() == longpoint.getY(); outpt1 = outpt1.next);
	//  155  326:aload_1         
	//  156  327:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  157  330:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  158  333:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  159  336:aload           4
	//  160  338:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  161  341:lcmp            
	//  162  342:iflt            393
	//  163  345:aload_1         
	//  164  346:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  165  349:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  166  352:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  167  355:aload_1         
	//  168  356:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  169  359:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  170  362:lcmp            
	//  171  363:ifgt            393
	//  172  366:aload_1         
	//  173  367:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  174  370:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  175  373:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  176  376:aload           4
	//  177  378:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  178  381:lcmp            
	//  179  382:ifne            393
	//  180  385:aload_1         
	//  181  386:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  182  389:astore_1        
	//* 183  390:goto            326
			outpt = outpt1;
	//  184  393:aload_1         
	//  185  394:astore_0        
			if(!flag)
	//* 186  395:iload           5
	//* 187  397:ifne            423
			{
				outpt = outpt1;
	//  188  400:aload_1         
	//  189  401:astore_0        
				if(outpt1.getPt().getX() != longpoint.getX())
	//* 190  402:aload_1         
	//* 191  403:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 192  406:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 193  409:aload           4
	//* 194  411:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 195  414:lcmp            
	//* 196  415:ifeq            423
					outpt = outpt1.next;
	//  197  418:aload_1         
	//  198  419:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  199  422:astore_0        
			}
			outpt3 = outpt.duplicate(flag);
	//  200  423:aload_0         
	//  201  424:iload           5
	//  202  426:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  203  429:astore_3        
			outpt1 = outpt3;
	//  204  430:aload_3         
	//  205  431:astore_1        
			if(!outpt3.getPt().equals(((Object) (longpoint))))
	//* 206  432:aload_3         
	//* 207  433:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 208  436:aload           4
	//* 209  438:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//* 210  441:ifne            235
			{
				outpt = outpt3;
	//  211  444:aload_3         
	//  212  445:astore_0        
				outpt.setPt(longpoint);
	//  213  446:aload_0         
	//  214  447:aload           4
	//  215  449:invokevirtual   #316 <Method void Path$OutPt.setPt(Point$LongPoint)>
				outpt1 = outpt.duplicate(flag);
	//  216  452:aload_0         
	//  217  453:iload           5
	//  218  455:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  219  458:astore_1        
			}
		}
		outpt3 = outpt2;
		if(direction1 == Clipper.Direction.LEFT_TO_RIGHT)
		{
			for(outpt3 = outpt2; outpt3.next.getPt().getX() <= longpoint.getX() && outpt3.next.getPt().getX() >= outpt3.getPt().getX() && outpt3.next.getPt().getY() == longpoint.getY(); outpt3 = outpt3.next);
	//* 220  459:goto            235
			outpt2 = outpt3;
	//  221  462:aload_3         
	//  222  463:astore_2        
			if(flag)
	//* 223  464:iload           5
	//* 224  466:ifeq            492
			{
				outpt2 = outpt3;
	//  225  469:aload_3         
	//  226  470:astore_2        
				if(outpt3.getPt().getX() != longpoint.getX())
	//* 227  471:aload_3         
	//* 228  472:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 229  475:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 230  478:aload           4
	//* 231  480:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 232  483:lcmp            
	//* 233  484:ifeq            492
					outpt2 = outpt3.next;
	//  234  487:aload_3         
	//  235  488:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  236  491:astore_2        
			}
			boolean flag2;
			Path.OutPt outpt4;
			if(!flag)
	//* 237  492:iload           5
	//* 238  494:ifne            592
				flag2 = true;
	//  239  497:iconst_1        
	//  240  498:istore          6
			else
	//* 241  500:aload_2         
	//* 242  501:iload           6
	//* 243  503:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//* 244  506:astore          9
	//* 245  508:aload           9
	//* 246  510:astore_3        
	//* 247  511:aload           9
	//* 248  513:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 249  516:aload           4
	//* 250  518:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//* 251  521:ifne            548
	//* 252  524:aload           9
	//* 253  526:astore_2        
	//* 254  527:aload_2         
	//* 255  528:aload           4
	//* 256  530:invokevirtual   #316 <Method void Path$OutPt.setPt(Point$LongPoint)>
	//* 257  533:iload           5
	//* 258  535:ifne            598
	//* 259  538:iconst_1        
	//* 260  539:istore          6
	//* 261  541:aload_2         
	//* 262  542:iload           6
	//* 263  544:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//* 264  547:astore_3        
	//* 265  548:iload           7
	//* 266  550:istore          6
	//* 267  552:aload           8
	//* 268  554:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//* 269  557:if_acmpne       563
	//* 270  560:iconst_1        
	//* 271  561:istore          6
	//* 272  563:iload           6
	//* 273  565:iload           5
	//* 274  567:icmpne          744
	//* 275  570:aload_0         
	//* 276  571:aload_2         
	//* 277  572:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//* 278  575:aload_2         
	//* 279  576:aload_0         
	//* 280  577:putfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 281  580:aload_1         
	//* 282  581:aload_3         
	//* 283  582:putfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 284  585:aload_3         
	//* 285  586:aload_1         
	//* 286  587:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//* 287  590:iconst_1        
	//* 288  591:ireturn         
				flag2 = false;
	//  289  592:iconst_0        
	//  290  593:istore          6
			outpt4 = outpt2.duplicate(flag2);
			outpt3 = outpt4;
			if(!outpt4.getPt().equals(((Object) (longpoint))))
			{
				outpt2 = outpt4;
				outpt2.setPt(longpoint);
				if(!flag)
					flag2 = true;
				else
	//* 291  595:goto            500
					flag2 = false;
	//  292  598:iconst_0        
	//  293  599:istore          6
				outpt3 = outpt2.duplicate(flag2);
			}
		} else
	//* 294  601:goto            541
		{
			for(; outpt3.next.getPt().getX() >= longpoint.getX() && outpt3.next.getPt().getX() <= outpt3.getPt().getX() && outpt3.next.getPt().getY() == longpoint.getY(); outpt3 = outpt3.next);
	//  295  604:aload_3         
	//  296  605:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  297  608:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  298  611:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  299  614:aload           4
	//  300  616:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  301  619:lcmp            
	//  302  620:iflt            671
	//  303  623:aload_3         
	//  304  624:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  305  627:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  306  630:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  307  633:aload_3         
	//  308  634:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  309  637:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  310  640:lcmp            
	//  311  641:ifgt            671
	//  312  644:aload_3         
	//  313  645:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  314  648:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  315  651:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  316  654:aload           4
	//  317  656:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  318  659:lcmp            
	//  319  660:ifne            671
	//  320  663:aload_3         
	//  321  664:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  322  667:astore_3        
	//* 323  668:goto            604
			outpt2 = outpt3;
	//  324  671:aload_3         
	//  325  672:astore_2        
			if(!flag)
	//* 326  673:iload           5
	//* 327  675:ifne            701
			{
				outpt2 = outpt3;
	//  328  678:aload_3         
	//  329  679:astore_2        
				if(outpt3.getPt().getX() != longpoint.getX())
	//* 330  680:aload_3         
	//* 331  681:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 332  684:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 333  687:aload           4
	//* 334  689:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 335  692:lcmp            
	//* 336  693:ifeq            701
					outpt2 = outpt3.next;
	//  337  696:aload_3         
	//  338  697:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  339  700:astore_2        
			}
			Path.OutPt outpt5 = outpt2.duplicate(flag);
	//  340  701:aload_2         
	//  341  702:iload           5
	//  342  704:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  343  707:astore          9
			outpt3 = outpt5;
	//  344  709:aload           9
	//  345  711:astore_3        
			if(!outpt5.getPt().equals(((Object) (longpoint))))
	//* 346  712:aload           9
	//* 347  714:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 348  717:aload           4
	//* 349  719:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//* 350  722:ifne            548
			{
				outpt2 = outpt5;
	//  351  725:aload           9
	//  352  727:astore_2        
				outpt2.setPt(longpoint);
	//  353  728:aload_2         
	//  354  729:aload           4
	//  355  731:invokevirtual   #316 <Method void Path$OutPt.setPt(Point$LongPoint)>
				outpt3 = outpt2.duplicate(flag);
	//  356  734:aload_2         
	//  357  735:iload           5
	//  358  737:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  359  740:astore_3        
			}
		}
		flag2 = flag3;
		if(direction == Clipper.Direction.LEFT_TO_RIGHT)
			flag2 = true;
		if(flag2 == flag)
		{
			outpt.prev = outpt2;
			outpt2.next = outpt;
			outpt1.next = outpt3;
			outpt3.prev = outpt1;
		} else
	//* 360  741:goto            548
		{
			outpt.next = outpt2;
	//  361  744:aload_0         
	//  362  745:aload_2         
	//  363  746:putfield        #266 <Field Path$OutPt Path$OutPt.next>
			outpt2.prev = outpt;
	//  364  749:aload_2         
	//  365  750:aload_0         
	//  366  751:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
			outpt1.prev = outpt3;
	//  367  754:aload_1         
	//  368  755:aload_3         
	//  369  756:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
			outpt3.next = outpt1;
	//  370  759:aload_3         
	//  371  760:aload_1         
	//  372  761:putfield        #266 <Field Path$OutPt Path$OutPt.next>
		}
		return true;
	//* 373  764:goto            590
	}

	private boolean joinPoints(Path.Join join, Path.OutRec outrec, Path.OutRec outrec1)
	{
		boolean flag;
		Path.OutPt outpt2;
		Path.OutPt outpt3;
		Path.OutPt outpt4;
label0:
		{
			outpt3 = join.outPt1;
	//    0    0:aload_1         
	//    1    1:getfield        #177 <Field Path$OutPt Path$Join.outPt1>
	//    2    4:astore          13
			outpt2 = join.outPt2;
	//    3    6:aload_1         
	//    4    7:getfield        #191 <Field Path$OutPt Path$Join.outPt2>
	//    5   10:astore          12
			if(join.outPt1.getPt().getY() == join.getOffPt().getY())
	//*   6   12:aload_1         
	//*   7   13:getfield        #177 <Field Path$OutPt Path$Join.outPt1>
	//*   8   16:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*   9   19:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//*  12   26:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  13   29:lcmp            
	//*  14   30:ifne            82
				flag = true;
	//   15   33:iconst_1        
	//   16   34:istore          4
			else
	//*  17   36:iload           4
	//*  18   38:ifeq            330
	//*  19   41:aload_1         
	//*  20   42:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//*  21   45:aload_1         
	//*  22   46:getfield        #177 <Field Path$OutPt Path$Join.outPt1>
	//*  23   49:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  24   52:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  25   55:ifeq            330
	//*  26   58:aload_1         
	//*  27   59:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//*  28   62:aload_1         
	//*  29   63:getfield        #191 <Field Path$OutPt Path$Join.outPt2>
	//*  30   66:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  31   69:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  32   72:ifeq            330
	//*  33   75:aload_2         
	//*  34   76:aload_3         
	//*  35   77:if_acmpeq       88
	//*  36   80:iconst_0        
	//*  37   81:ireturn         
				flag = false;
	//   38   82:iconst_0        
	//   39   83:istore          4
			if(flag && join.getOffPt().equals(((Object) (join.outPt1.getPt()))) && join.getOffPt().equals(((Object) (join.outPt2.getPt()))))
			{
				if(outrec != outrec1)
					return false;
	//*  40   85:goto            36
				for(outrec = ((Path.OutRec) (join.outPt1.next)); outrec != outpt3 && ((Path.OutPt) (outrec)).getPt().equals(((Object) (join.getOffPt()))); outrec = ((Path.OutRec) (((Path.OutPt) (outrec)).next)));
	//   41   88:aload_1         
	//   42   89:getfield        #177 <Field Path$OutPt Path$Join.outPt1>
	//   43   92:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   44   95:astore_2        
	//   45   96:aload_2         
	//   46   97:aload           13
	//   47   99:if_acmpeq       124
	//   48  102:aload_2         
	//   49  103:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//   50  106:aload_1         
	//   51  107:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//   52  110:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//   53  113:ifeq            124
	//   54  116:aload_2         
	//   55  117:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   56  120:astore_2        
	//*  57  121:goto            96
				if(((Path.OutPt) (outrec)).getPt().getY() > join.getOffPt().getY())
	//*  58  124:aload_2         
	//*  59  125:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  60  128:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  61  131:aload_1         
	//*  62  132:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//*  63  135:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  64  138:lcmp            
	//*  65  139:ifle            181
					flag = true;
	//   66  142:iconst_1        
	//   67  143:istore          4
				else
	//*  68  145:aload_1         
	//*  69  146:getfield        #191 <Field Path$OutPt Path$Join.outPt2>
	//*  70  149:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//*  71  152:astore_2        
	//*  72  153:aload_2         
	//*  73  154:aload           12
	//*  74  156:if_acmpeq       187
	//*  75  159:aload_2         
	//*  76  160:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  77  163:aload_1         
	//*  78  164:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//*  79  167:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  80  170:ifeq            187
	//*  81  173:aload_2         
	//*  82  174:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//*  83  177:astore_2        
	//*  84  178:goto            153
					flag = false;
	//   85  181:iconst_0        
	//   86  182:istore          4
				for(outrec = ((Path.OutRec) (join.outPt2.next)); outrec != outpt2 && ((Path.OutPt) (outrec)).getPt().equals(((Object) (join.getOffPt()))); outrec = ((Path.OutRec) (((Path.OutPt) (outrec)).next)));
	//*  87  184:goto            145
				boolean flag1;
				if(((Path.OutPt) (outrec)).getPt().getY() > join.getOffPt().getY())
	//*  88  187:aload_2         
	//*  89  188:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//*  90  191:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  91  194:aload_1         
	//*  92  195:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//*  93  198:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  94  201:lcmp            
	//*  95  202:ifle            217
					flag1 = true;
	//   96  205:iconst_1        
	//   97  206:istore          5
				else
	//*  98  208:iload           4
	//*  99  210:iload           5
	//* 100  212:icmpne          223
	//* 101  215:iconst_0        
	//* 102  216:ireturn         
					flag1 = false;
	//  103  217:iconst_0        
	//  104  218:istore          5
				if(flag == flag1)
					return false;
	//* 105  220:goto            208
				if(flag)
	//* 106  223:iload           4
	//* 107  225:ifeq            279
				{
					outrec = ((Path.OutRec) (outpt3.duplicate(false)));
	//  108  228:aload           13
	//  109  230:iconst_0        
	//  110  231:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  111  234:astore_2        
					outrec1 = ((Path.OutRec) (outpt2.duplicate(true)));
	//  112  235:aload           12
	//  113  237:iconst_1        
	//  114  238:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  115  241:astore_3        
					outpt3.prev = outpt2;
	//  116  242:aload           13
	//  117  244:aload           12
	//  118  246:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
					outpt2.next = outpt3;
	//  119  249:aload           12
	//  120  251:aload           13
	//  121  253:putfield        #266 <Field Path$OutPt Path$OutPt.next>
					outrec.next = ((Path.OutPt) (outrec1));
	//  122  256:aload_2         
	//  123  257:aload_3         
	//  124  258:putfield        #266 <Field Path$OutPt Path$OutPt.next>
					outrec1.prev = ((Path.OutPt) (outrec));
	//  125  261:aload_3         
	//  126  262:aload_2         
	//  127  263:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
					join.outPt1 = outpt3;
	//  128  266:aload_1         
	//  129  267:aload           13
	//  130  269:putfield        #177 <Field Path$OutPt Path$Join.outPt1>
					join.outPt2 = ((Path.OutPt) (outrec));
	//  131  272:aload_1         
	//  132  273:aload_2         
	//  133  274:putfield        #191 <Field Path$OutPt Path$Join.outPt2>
					return true;
	//  134  277:iconst_1        
	//  135  278:ireturn         
				} else
				{
					outrec = ((Path.OutRec) (outpt3.duplicate(true)));
	//  136  279:aload           13
	//  137  281:iconst_1        
	//  138  282:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  139  285:astore_2        
					outrec1 = ((Path.OutRec) (outpt2.duplicate(false)));
	//  140  286:aload           12
	//  141  288:iconst_0        
	//  142  289:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  143  292:astore_3        
					outpt3.next = outpt2;
	//  144  293:aload           13
	//  145  295:aload           12
	//  146  297:putfield        #266 <Field Path$OutPt Path$OutPt.next>
					outpt2.prev = outpt3;
	//  147  300:aload           12
	//  148  302:aload           13
	//  149  304:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
					outrec.prev = ((Path.OutPt) (outrec1));
	//  150  307:aload_2         
	//  151  308:aload_3         
	//  152  309:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
					outrec1.next = ((Path.OutPt) (outrec));
	//  153  312:aload_3         
	//  154  313:aload_2         
	//  155  314:putfield        #266 <Field Path$OutPt Path$OutPt.next>
					join.outPt1 = outpt3;
	//  156  317:aload_1         
	//  157  318:aload           13
	//  158  320:putfield        #177 <Field Path$OutPt Path$Join.outPt1>
					join.outPt2 = ((Path.OutPt) (outrec));
	//  159  323:aload_1         
	//  160  324:aload_2         
	//  161  325:putfield        #191 <Field Path$OutPt Path$Join.outPt2>
					return true;
	//  162  328:iconst_1        
	//  163  329:ireturn         
				}
			}
			if(flag)
	//* 164  330:iload           4
	//* 165  332:ifeq            945
			{
				outrec = ((Path.OutRec) (outpt3));
	//  166  335:aload           13
	//  167  337:astore_2        
				do
				{
					outrec1 = outrec;
	//  168  338:aload_2         
	//  169  339:astore_3        
					if(outpt3.prev.getPt().getY() != outpt3.getPt().getY())
						break;
	//  170  340:aload           13
	//  171  342:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  172  345:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  173  348:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  174  351:aload           13
	//  175  353:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  176  356:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  177  359:lcmp            
	//  178  360:ifne            396
					outrec1 = outrec;
	//  179  363:aload_2         
	//  180  364:astore_3        
					if(outpt3.prev == outrec)
						break;
	//  181  365:aload           13
	//  182  367:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  183  370:aload_2         
	//  184  371:if_acmpeq       396
					outrec1 = outrec;
	//  185  374:aload_2         
	//  186  375:astore_3        
					if(outpt3.prev == outpt2)
						break;
	//  187  376:aload           13
	//  188  378:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  189  381:aload           12
	//  190  383:if_acmpeq       396
					outpt3 = outpt3.prev;
	//  191  386:aload           13
	//  192  388:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  193  391:astore          13
				} while(true);
	//  194  393:goto            338
				for(; ((Path.OutPt) (outrec1)).next.getPt().getY() == ((Path.OutPt) (outrec1)).getPt().getY() && ((Path.OutPt) (outrec1)).next != outpt3 && ((Path.OutPt) (outrec1)).next != outpt2; outrec1 = ((Path.OutRec) (((Path.OutPt) (outrec1)).next)));
	//  195  396:aload_3         
	//  196  397:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  197  400:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  198  403:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  199  406:aload_3         
	//  200  407:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  201  410:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  202  413:lcmp            
	//  203  414:ifne            443
	//  204  417:aload_3         
	//  205  418:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  206  421:aload           13
	//  207  423:if_acmpeq       443
	//  208  426:aload_3         
	//  209  427:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  210  430:aload           12
	//  211  432:if_acmpeq       443
	//  212  435:aload_3         
	//  213  436:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  214  439:astore_3        
	//* 215  440:goto            396
				if(((Path.OutPt) (outrec1)).next == outpt3 || ((Path.OutPt) (outrec1)).next == outpt2)
	//* 216  443:aload_3         
	//* 217  444:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 218  447:aload           13
	//* 219  449:if_acmpeq       461
	//* 220  452:aload_3         
	//* 221  453:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 222  456:aload           12
	//* 223  458:if_acmpne       463
					return false;
	//  224  461:iconst_0        
	//  225  462:ireturn         
				outrec = ((Path.OutRec) (outpt2));
	//  226  463:aload           12
	//  227  465:astore_2        
				Object obj;
				do
				{
					obj = ((Object) (outrec));
	//  228  466:aload_2         
	//  229  467:astore          11
					if(outpt2.prev.getPt().getY() != outpt2.getPt().getY())
						break;
	//  230  469:aload           12
	//  231  471:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  232  474:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  233  477:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  234  480:aload           12
	//  235  482:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  236  485:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  237  488:lcmp            
	//  238  489:ifne            526
					obj = ((Object) (outrec));
	//  239  492:aload_2         
	//  240  493:astore          11
					if(outpt2.prev == outrec)
						break;
	//  241  495:aload           12
	//  242  497:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  243  500:aload_2         
	//  244  501:if_acmpeq       526
					obj = ((Object) (outrec));
	//  245  504:aload_2         
	//  246  505:astore          11
					if(outpt2.prev == outrec1)
						break;
	//  247  507:aload           12
	//  248  509:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  249  512:aload_3         
	//  250  513:if_acmpeq       526
					outpt2 = outpt2.prev;
	//  251  516:aload           12
	//  252  518:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//  253  521:astore          12
				} while(true);
	//  254  523:goto            466
				for(; ((Path.OutPt) (obj)).next.getPt().getY() == ((Path.OutPt) (obj)).getPt().getY() && ((Path.OutPt) (obj)).next != outpt2 && ((Path.OutPt) (obj)).next != outpt3; obj = ((Object) (((Path.OutPt) (obj)).next)));
	//  255  526:aload           11
	//  256  528:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  257  531:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  258  534:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  259  537:aload           11
	//  260  539:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  261  542:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  262  545:lcmp            
	//  263  546:ifne            579
	//  264  549:aload           11
	//  265  551:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  266  554:aload           12
	//  267  556:if_acmpeq       579
	//  268  559:aload           11
	//  269  561:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  270  564:aload           13
	//  271  566:if_acmpeq       579
	//  272  569:aload           11
	//  273  571:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  274  574:astore          11
	//* 275  576:goto            526
				if(((Path.OutPt) (obj)).next == outpt2 || ((Path.OutPt) (obj)).next == outpt3)
	//* 276  579:aload           11
	//* 277  581:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 278  584:aload           12
	//* 279  586:if_acmpeq       599
	//* 280  589:aload           11
	//* 281  591:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//* 282  594:aload           13
	//* 283  596:if_acmpne       601
					return false;
	//  284  599:iconst_0        
	//  285  600:ireturn         
				outrec = ((Path.OutRec) (new long[1]));
	//  286  601:iconst_1        
	//  287  602:newarray        long[]
	//  288  604:astore_2        
				long al[] = new long[1];
	//  289  605:iconst_1        
	//  290  606:newarray        long[]
	//  291  608:astore          14
				if(!getOverlap(outpt3.getPt().getX(), ((Path.OutPt) (outrec1)).getPt().getX(), outpt2.getPt().getX(), ((Path.OutPt) (obj)).getPt().getX(), ((long []) (outrec)), al))
	//* 292  610:aload           13
	//* 293  612:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 294  615:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 295  618:aload_3         
	//* 296  619:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 297  622:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 298  625:aload           12
	//* 299  627:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 300  630:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 301  633:aload           11
	//* 302  635:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 303  638:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 304  641:aload_2         
	//* 305  642:aload           14
	//* 306  644:invokestatic    #748 <Method boolean getOverlap(long, long, long, long, long[], long[])>
	//* 307  647:ifne            652
					return false;
	//  308  650:iconst_0        
	//  309  651:ireturn         
				long l = outrec[0];
	//  310  652:aload_2         
	//  311  653:iconst_0        
	//  312  654:laload          
	//  313  655:lstore          6
				long l1 = al[0];
	//  314  657:aload           14
	//  315  659:iconst_0        
	//  316  660:laload          
	//  317  661:lstore          8
				boolean flag3;
				if(outpt3.getPt().getX() >= l && outpt3.getPt().getX() <= l1)
	//* 318  663:aload           13
	//* 319  665:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 320  668:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 321  671:lload           6
	//* 322  673:lcmp            
	//* 323  674:iflt            758
	//* 324  677:aload           13
	//* 325  679:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 326  682:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 327  685:lload           8
	//* 328  687:lcmp            
	//* 329  688:ifgt            758
				{
					outrec = ((Path.OutRec) (new Point.LongPoint(outpt3.getPt())));
	//  330  691:new             #223 <Class Point$LongPoint>
	//  331  694:dup             
	//  332  695:aload           13
	//  333  697:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  334  700:invokespecial   #313 <Method void Point$LongPoint(Point$LongPoint)>
	//  335  703:astore_2        
					if(outpt3.getPt().getX() > ((Path.OutPt) (outrec1)).getPt().getX())
	//* 336  704:aload           13
	//* 337  706:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 338  709:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 339  712:aload_3         
	//* 340  713:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 341  716:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 342  719:lcmp            
	//* 343  720:ifle            752
						flag3 = true;
	//  344  723:iconst_1        
	//  345  724:istore          10
					else
	//* 346  726:aload_1         
	//* 347  727:aload           13
	//* 348  729:putfield        #177 <Field Path$OutPt Path$Join.outPt1>
	//* 349  732:aload_1         
	//* 350  733:aload           12
	//* 351  735:putfield        #191 <Field Path$OutPt Path$Join.outPt2>
	//* 352  738:aload           13
	//* 353  740:aload_3         
	//* 354  741:aload           12
	//* 355  743:aload           11
	//* 356  745:aload_2         
	//* 357  746:iload           10
	//* 358  748:invokestatic    #750 <Method boolean joinHorz(Path$OutPt, Path$OutPt, Path$OutPt, Path$OutPt, Point$LongPoint, boolean)>
	//* 359  751:ireturn         
						flag3 = false;
	//  360  752:iconst_0        
	//  361  753:istore          10
				} else
	//* 362  755:goto            726
				if(outpt2.getPt().getX() >= l && outpt2.getPt().getX() <= l1)
	//* 363  758:aload           12
	//* 364  760:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 365  763:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 366  766:lload           6
	//* 367  768:lcmp            
	//* 368  769:iflt            831
	//* 369  772:aload           12
	//* 370  774:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 371  777:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 372  780:lload           8
	//* 373  782:lcmp            
	//* 374  783:ifgt            831
				{
					outrec = ((Path.OutRec) (new Point.LongPoint(outpt2.getPt())));
	//  375  786:new             #223 <Class Point$LongPoint>
	//  376  789:dup             
	//  377  790:aload           12
	//  378  792:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  379  795:invokespecial   #313 <Method void Point$LongPoint(Point$LongPoint)>
	//  380  798:astore_2        
					if(outpt2.getPt().getX() > ((Path.OutPt) (obj)).getPt().getX())
	//* 381  799:aload           12
	//* 382  801:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 383  804:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 384  807:aload           11
	//* 385  809:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 386  812:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 387  815:lcmp            
	//* 388  816:ifle            825
						flag3 = true;
	//  389  819:iconst_1        
	//  390  820:istore          10
					else
	//* 391  822:goto            726
						flag3 = false;
	//  392  825:iconst_0        
	//  393  826:istore          10
				} else
	//* 394  828:goto            822
				if(((Path.OutPt) (outrec1)).getPt().getX() >= l && ((Path.OutPt) (outrec1)).getPt().getX() <= l1)
	//* 395  831:aload_3         
	//* 396  832:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 397  835:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 398  838:lload           6
	//* 399  840:lcmp            
	//* 400  841:iflt            900
	//* 401  844:aload_3         
	//* 402  845:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 403  848:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 404  851:lload           8
	//* 405  853:lcmp            
	//* 406  854:ifgt            900
				{
					outrec = ((Path.OutRec) (new Point.LongPoint(((Path.OutPt) (outrec1)).getPt())));
	//  407  857:new             #223 <Class Point$LongPoint>
	//  408  860:dup             
	//  409  861:aload_3         
	//  410  862:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  411  865:invokespecial   #313 <Method void Point$LongPoint(Point$LongPoint)>
	//  412  868:astore_2        
					if(((Path.OutPt) (outrec1)).getPt().getX() > outpt3.getPt().getX())
	//* 413  869:aload_3         
	//* 414  870:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 415  873:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 416  876:aload           13
	//* 417  878:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 418  881:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 419  884:lcmp            
	//* 420  885:ifle            894
						flag3 = true;
	//  421  888:iconst_1        
	//  422  889:istore          10
					else
	//* 423  891:goto            726
						flag3 = false;
	//  424  894:iconst_0        
	//  425  895:istore          10
				} else
	//* 426  897:goto            891
				{
					outrec = ((Path.OutRec) (new Point.LongPoint(((Path.OutPt) (obj)).getPt())));
	//  427  900:new             #223 <Class Point$LongPoint>
	//  428  903:dup             
	//  429  904:aload           11
	//  430  906:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  431  909:invokespecial   #313 <Method void Point$LongPoint(Point$LongPoint)>
	//  432  912:astore_2        
					if(((Path.OutPt) (obj)).getPt().getX() > outpt2.getPt().getX())
	//* 433  913:aload           11
	//* 434  915:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 435  918:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 436  921:aload           12
	//* 437  923:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 438  926:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 439  929:lcmp            
	//* 440  930:ifle            939
						flag3 = true;
	//  441  933:iconst_1        
	//  442  934:istore          10
					else
	//* 443  936:goto            726
						flag3 = false;
	//  444  939:iconst_0        
	//  445  940:istore          10
				}
				join.outPt1 = outpt3;
				join.outPt2 = outpt2;
				return joinHorz(outpt3, ((Path.OutPt) (outrec1)), outpt2, ((Path.OutPt) (obj)), ((Point.LongPoint) (outrec)), flag3);
			}
	//* 446  942:goto            936
			Path.OutPt outpt;
			for(outpt = outpt3.next; outpt.getPt().equals(((Object) (outpt3.getPt()))) && outpt != outpt3; outpt = outpt.next);
	//  447  945:aload           13
	//  448  947:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  449  950:astore          11
	//  450  952:aload           11
	//  451  954:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  452  957:aload           13
	//  453  959:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  454  962:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//  455  965:ifeq            985
	//  456  968:aload           11
	//  457  970:aload           13
	//  458  972:if_acmpeq       985
	//  459  975:aload           11
	//  460  977:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  461  980:astore          11
	//* 462  982:goto            952
			if(outpt.getPt().getY() > outpt3.getPt().getY() || !Point.slopesEqual(outpt3.getPt(), outpt.getPt(), join.getOffPt(), useFullRange))
	//* 463  985:aload           11
	//* 464  987:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 465  990:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 466  993:aload           13
	//* 467  995:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 468  998:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 469 1001:lcmp            
	//* 470 1002:ifgt            1029
	//* 471 1005:aload           13
	//* 472 1007:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 473 1010:aload           11
	//* 474 1012:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 475 1015:aload_1         
	//* 476 1016:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//* 477 1019:aload_0         
	//* 478 1020:getfield        #234 <Field boolean useFullRange>
	//* 479 1023:invokestatic    #566 <Method boolean Point.slopesEqual(Point$LongPoint, Point$LongPoint, Point$LongPoint, boolean)>
	//* 480 1026:ifne            1081
				flag = true;
	//  481 1029:iconst_1        
	//  482 1030:istore          4
			else
	//* 483 1032:aload           11
	//* 484 1034:astore          14
	//* 485 1036:iload           4
	//* 486 1038:ifeq            1137
	//* 487 1041:aload           13
	//* 488 1043:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//* 489 1046:astore          11
	//* 490 1048:aload           11
	//* 491 1050:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 492 1053:aload           13
	//* 493 1055:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 494 1058:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//* 495 1061:ifeq            1087
	//* 496 1064:aload           11
	//* 497 1066:aload           13
	//* 498 1068:if_acmpeq       1087
	//* 499 1071:aload           11
	//* 500 1073:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//* 501 1076:astore          11
	//* 502 1078:goto            1048
				flag = false;
	//  503 1081:iconst_0        
	//  504 1082:istore          4
			outpt4 = outpt;
			if(!flag)
				break label0;
			for(outpt = outpt3.prev; outpt.getPt().equals(((Object) (outpt3.getPt()))) && outpt != outpt3; outpt = outpt.prev);
	//* 505 1084:goto            1032
			if(outpt.getPt().getY() <= outpt3.getPt().getY())
	//* 506 1087:aload           11
	//* 507 1089:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 508 1092:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 509 1095:aload           13
	//* 510 1097:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 511 1100:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 512 1103:lcmp            
	//* 513 1104:ifgt            1135
			{
				outpt4 = outpt;
	//  514 1107:aload           11
	//  515 1109:astore          14
				if(Point.slopesEqual(outpt3.getPt(), outpt.getPt(), join.getOffPt(), useFullRange))
					break label0;
	//  516 1111:aload           13
	//  517 1113:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  518 1116:aload           11
	//  519 1118:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  520 1121:aload_1         
	//  521 1122:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//  522 1125:aload_0         
	//  523 1126:getfield        #234 <Field boolean useFullRange>
	//  524 1129:invokestatic    #566 <Method boolean Point.slopesEqual(Point$LongPoint, Point$LongPoint, Point$LongPoint, boolean)>
	//  525 1132:ifne            1137
			}
			return false;
	//  526 1135:iconst_0        
	//  527 1136:ireturn         
		}
		boolean flag2;
		Path.OutPt outpt5;
label1:
		{
			Path.OutPt outpt1;
			for(outpt1 = outpt2.next; outpt1.getPt().equals(((Object) (outpt2.getPt()))) && outpt1 != outpt2; outpt1 = outpt1.next);
	//  528 1137:aload           12
	//  529 1139:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  530 1142:astore          11
	//  531 1144:aload           11
	//  532 1146:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  533 1149:aload           12
	//  534 1151:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  535 1154:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//  536 1157:ifeq            1177
	//  537 1160:aload           11
	//  538 1162:aload           12
	//  539 1164:if_acmpeq       1177
	//  540 1167:aload           11
	//  541 1169:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//  542 1172:astore          11
	//* 543 1174:goto            1144
			if(outpt1.getPt().getY() > outpt2.getPt().getY() || !Point.slopesEqual(outpt2.getPt(), outpt1.getPt(), join.getOffPt(), useFullRange))
	//* 544 1177:aload           11
	//* 545 1179:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 546 1182:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 547 1185:aload           12
	//* 548 1187:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 549 1190:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 550 1193:lcmp            
	//* 551 1194:ifgt            1221
	//* 552 1197:aload           12
	//* 553 1199:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 554 1202:aload           11
	//* 555 1204:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 556 1207:aload_1         
	//* 557 1208:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//* 558 1211:aload_0         
	//* 559 1212:getfield        #234 <Field boolean useFullRange>
	//* 560 1215:invokestatic    #566 <Method boolean Point.slopesEqual(Point$LongPoint, Point$LongPoint, Point$LongPoint, boolean)>
	//* 561 1218:ifne            1273
				flag2 = true;
	//  562 1221:iconst_1        
	//  563 1222:istore          5
			else
	//* 564 1224:aload           11
	//* 565 1226:astore          15
	//* 566 1228:iload           5
	//* 567 1230:ifeq            1329
	//* 568 1233:aload           12
	//* 569 1235:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//* 570 1238:astore          11
	//* 571 1240:aload           11
	//* 572 1242:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 573 1245:aload           12
	//* 574 1247:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 575 1250:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//* 576 1253:ifeq            1279
	//* 577 1256:aload           11
	//* 578 1258:aload           12
	//* 579 1260:if_acmpeq       1279
	//* 580 1263:aload           11
	//* 581 1265:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//* 582 1268:astore          11
	//* 583 1270:goto            1240
				flag2 = false;
	//  584 1273:iconst_0        
	//  585 1274:istore          5
			outpt5 = outpt1;
			if(!flag2)
				break label1;
			for(outpt1 = outpt2.prev; outpt1.getPt().equals(((Object) (outpt2.getPt()))) && outpt1 != outpt2; outpt1 = outpt1.prev);
	//* 586 1276:goto            1224
			if(outpt1.getPt().getY() <= outpt2.getPt().getY())
	//* 587 1279:aload           11
	//* 588 1281:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 589 1284:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 590 1287:aload           12
	//* 591 1289:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//* 592 1292:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 593 1295:lcmp            
	//* 594 1296:ifgt            1327
			{
				outpt5 = outpt1;
	//  595 1299:aload           11
	//  596 1301:astore          15
				if(Point.slopesEqual(outpt2.getPt(), outpt1.getPt(), join.getOffPt(), useFullRange))
					break label1;
	//  597 1303:aload           12
	//  598 1305:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  599 1308:aload           11
	//  600 1310:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//  601 1313:aload_1         
	//  602 1314:invokevirtual   #644 <Method Point$LongPoint Path$Join.getOffPt()>
	//  603 1317:aload_0         
	//  604 1318:getfield        #234 <Field boolean useFullRange>
	//  605 1321:invokestatic    #566 <Method boolean Point.slopesEqual(Point$LongPoint, Point$LongPoint, Point$LongPoint, boolean)>
	//  606 1324:ifne            1329
			}
			return false;
	//  607 1327:iconst_0        
	//  608 1328:ireturn         
		}
		if(outpt4 == outpt3 || outpt5 == outpt2 || outpt4 == outpt5 || outrec == outrec1 && flag == flag2)
	//* 609 1329:aload           14
	//* 610 1331:aload           13
	//* 611 1333:if_acmpeq       1362
	//* 612 1336:aload           15
	//* 613 1338:aload           12
	//* 614 1340:if_acmpeq       1362
	//* 615 1343:aload           14
	//* 616 1345:aload           15
	//* 617 1347:if_acmpeq       1362
	//* 618 1350:aload_2         
	//* 619 1351:aload_3         
	//* 620 1352:if_acmpne       1364
	//* 621 1355:iload           4
	//* 622 1357:iload           5
	//* 623 1359:icmpne          1364
			return false;
	//  624 1362:iconst_0        
	//  625 1363:ireturn         
		if(flag)
	//* 626 1364:iload           4
	//* 627 1366:ifeq            1420
		{
			outrec = ((Path.OutRec) (outpt3.duplicate(false)));
	//  628 1369:aload           13
	//  629 1371:iconst_0        
	//  630 1372:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  631 1375:astore_2        
			outrec1 = ((Path.OutRec) (outpt2.duplicate(true)));
	//  632 1376:aload           12
	//  633 1378:iconst_1        
	//  634 1379:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  635 1382:astore_3        
			outpt3.prev = outpt2;
	//  636 1383:aload           13
	//  637 1385:aload           12
	//  638 1387:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
			outpt2.next = outpt3;
	//  639 1390:aload           12
	//  640 1392:aload           13
	//  641 1394:putfield        #266 <Field Path$OutPt Path$OutPt.next>
			outrec.next = ((Path.OutPt) (outrec1));
	//  642 1397:aload_2         
	//  643 1398:aload_3         
	//  644 1399:putfield        #266 <Field Path$OutPt Path$OutPt.next>
			outrec1.prev = ((Path.OutPt) (outrec));
	//  645 1402:aload_3         
	//  646 1403:aload_2         
	//  647 1404:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
			join.outPt1 = outpt3;
	//  648 1407:aload_1         
	//  649 1408:aload           13
	//  650 1410:putfield        #177 <Field Path$OutPt Path$Join.outPt1>
			join.outPt2 = ((Path.OutPt) (outrec));
	//  651 1413:aload_1         
	//  652 1414:aload_2         
	//  653 1415:putfield        #191 <Field Path$OutPt Path$Join.outPt2>
			return true;
	//  654 1418:iconst_1        
	//  655 1419:ireturn         
		} else
		{
			outrec = ((Path.OutRec) (outpt3.duplicate(true)));
	//  656 1420:aload           13
	//  657 1422:iconst_1        
	//  658 1423:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  659 1426:astore_2        
			outrec1 = ((Path.OutRec) (outpt2.duplicate(false)));
	//  660 1427:aload           12
	//  661 1429:iconst_0        
	//  662 1430:invokevirtual   #746 <Method Path$OutPt Path$OutPt.duplicate(boolean)>
	//  663 1433:astore_3        
			outpt3.next = outpt2;
	//  664 1434:aload           13
	//  665 1436:aload           12
	//  666 1438:putfield        #266 <Field Path$OutPt Path$OutPt.next>
			outpt2.prev = outpt3;
	//  667 1441:aload           12
	//  668 1443:aload           13
	//  669 1445:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
			outrec.prev = ((Path.OutPt) (outrec1));
	//  670 1448:aload_2         
	//  671 1449:aload_3         
	//  672 1450:putfield        #147 <Field Path$OutPt Path$OutPt.prev>
			outrec1.next = ((Path.OutPt) (outrec));
	//  673 1453:aload_3         
	//  674 1454:aload_2         
	//  675 1455:putfield        #266 <Field Path$OutPt Path$OutPt.next>
			join.outPt1 = outpt3;
	//  676 1458:aload_1         
	//  677 1459:aload           13
	//  678 1461:putfield        #177 <Field Path$OutPt Path$Join.outPt1>
			join.outPt2 = ((Path.OutPt) (outrec));
	//  679 1464:aload_1         
	//  680 1465:aload_2         
	//  681 1466:putfield        #191 <Field Path$OutPt Path$Join.outPt2>
			return true;
	//  682 1469:iconst_1        
	//  683 1470:ireturn         
		}
	}

	private static Paths minkowski(Path path, Path path1, boolean flag, boolean flag1)
	{
		int i;
		int j1;
		int k1;
		Paths paths;
		if(flag1)
	//*   0    0:iload_3         
	//*   1    1:ifeq            136
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:aload_0         
	//*   5    8:invokevirtual   #753 <Method int Path.size()>
	//*   6   11:istore          7
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #753 <Method int Path.size()>
	//*   9   17:istore          8
	//*  10   19:new             #390 <Class Paths>
	//*  11   22:dup             
	//*  12   23:iload           8
	//*  13   25:invokespecial   #754 <Method void Paths(int)>
	//*  14   28:astore          9
	//*  15   30:iload_2         
	//*  16   31:ifeq            159
	//*  17   34:iconst_0        
	//*  18   35:istore          5
	//*  19   37:iload           5
	//*  20   39:iload           8
	//*  21   41:icmpge          278
	//*  22   44:new             #400 <Class Path>
	//*  23   47:dup             
	//*  24   48:iload           7
	//*  25   50:invokespecial   #401 <Method void Path(int)>
	//*  26   53:astore          10
	//*  27   55:aload_0         
	//*  28   56:invokevirtual   #755 <Method Iterator Path.iterator()>
	//*  29   59:astore          11
	//*  30   61:aload           11
	//*  31   63:invokeinterface #540 <Method boolean Iterator.hasNext()>
	//*  32   68:ifeq            142
	//*  33   71:aload           11
	//*  34   73:invokeinterface #543 <Method Object Iterator.next()>
	//*  35   78:checkcast       #223 <Class Point$LongPoint>
	//*  36   81:astore          12
	//*  37   83:aload           10
	//*  38   85:new             #223 <Class Point$LongPoint>
	//*  39   88:dup             
	//*  40   89:aload_1         
	//*  41   90:iload           5
	//*  42   92:invokevirtual   #756 <Method Object Path.get(int)>
	//*  43   95:checkcast       #223 <Class Point$LongPoint>
	//*  44   98:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  45  101:aload           12
	//*  46  103:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  47  106:ladd            
	//*  48  107:aload_1         
	//*  49  108:iload           5
	//*  50  110:invokevirtual   #756 <Method Object Path.get(int)>
	//*  51  113:checkcast       #223 <Class Point$LongPoint>
	//*  52  116:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  53  119:aload           12
	//*  54  121:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  55  124:ladd            
	//*  56  125:lconst_0        
	//*  57  126:invokespecial   #759 <Method void Point$LongPoint(long, long, long)>
	//*  58  129:invokevirtual   #402 <Method boolean Path.add(Object)>
	//*  59  132:pop             
	//*  60  133:goto            61
			i = 0;
	//   61  136:iconst_0        
	//   62  137:istore          4
		j1 = path.size();
		k1 = path1.size();
		paths = new Paths(k1);
		if(flag)
		{
			for(int j = 0; j < k1; j++)
			{
				Path path2 = new Path(j1);
				Point.LongPoint longpoint;
				for(Iterator iterator = path.iterator(); iterator.hasNext(); path2.add(((Object) (new Point.LongPoint(((Point.LongPoint)path1.get(j)).getX() + longpoint.getX(), ((Point.LongPoint)path1.get(j)).getY() + longpoint.getY(), 0L)))))
					longpoint = (Point.LongPoint)iterator.next();

	//*  63  139:goto            7
				paths.add(((Object) (path2)));
	//   64  142:aload           9
	//   65  144:aload           10
	//   66  146:invokevirtual   #403 <Method boolean Paths.add(Object)>
	//   67  149:pop             
			}

	//   68  150:iload           5
	//   69  152:iconst_1        
	//   70  153:iadd            
	//   71  154:istore          5
		} else
	//*  72  156:goto            37
		{
			for(int k = 0; k < k1; k++)
	//*  73  159:iconst_0        
	//*  74  160:istore          5
	//*  75  162:iload           5
	//*  76  164:iload           8
	//*  77  166:icmpge          278
			{
				Path path3 = new Path(j1);
	//   78  169:new             #400 <Class Path>
	//   79  172:dup             
	//   80  173:iload           7
	//   81  175:invokespecial   #401 <Method void Path(int)>
	//   82  178:astore          10
				Point.LongPoint longpoint1;
				for(Iterator iterator1 = path.iterator(); iterator1.hasNext(); path3.add(((Object) (new Point.LongPoint(((Point.LongPoint)path1.get(k)).getX() - longpoint1.getX(), ((Point.LongPoint)path1.get(k)).getY() - longpoint1.getY(), 0L)))))
	//*  83  180:aload_0         
	//*  84  181:invokevirtual   #755 <Method Iterator Path.iterator()>
	//*  85  184:astore          11
	//*  86  186:aload           11
	//*  87  188:invokeinterface #540 <Method boolean Iterator.hasNext()>
	//*  88  193:ifeq            261
					longpoint1 = (Point.LongPoint)iterator1.next();
	//   89  196:aload           11
	//   90  198:invokeinterface #543 <Method Object Iterator.next()>
	//   91  203:checkcast       #223 <Class Point$LongPoint>
	//   92  206:astore          12

	//   93  208:aload           10
	//   94  210:new             #223 <Class Point$LongPoint>
	//   95  213:dup             
	//   96  214:aload_1         
	//   97  215:iload           5
	//   98  217:invokevirtual   #756 <Method Object Path.get(int)>
	//   99  220:checkcast       #223 <Class Point$LongPoint>
	//  100  223:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  101  226:aload           12
	//  102  228:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  103  231:lsub            
	//  104  232:aload_1         
	//  105  233:iload           5
	//  106  235:invokevirtual   #756 <Method Object Path.get(int)>
	//  107  238:checkcast       #223 <Class Point$LongPoint>
	//  108  241:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  109  244:aload           12
	//  110  246:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  111  249:lsub            
	//  112  250:lconst_0        
	//  113  251:invokespecial   #759 <Method void Point$LongPoint(long, long, long)>
	//  114  254:invokevirtual   #402 <Method boolean Path.add(Object)>
	//  115  257:pop             
	//* 116  258:goto            186
				paths.add(((Object) (path3)));
	//  117  261:aload           9
	//  118  263:aload           10
	//  119  265:invokevirtual   #403 <Method boolean Paths.add(Object)>
	//  120  268:pop             
			}

	//  121  269:iload           5
	//  122  271:iconst_1        
	//  123  272:iadd            
	//  124  273:istore          5
		}
	//* 125  275:goto            162
		path = ((Path) (new Paths((k1 + i) * (j1 + 1))));
	//  126  278:new             #390 <Class Paths>
	//  127  281:dup             
	//  128  282:iload           8
	//  129  284:iload           4
	//  130  286:iadd            
	//  131  287:iload           7
	//  132  289:iconst_1        
	//  133  290:iadd            
	//  134  291:imul            
	//  135  292:invokespecial   #754 <Method void Paths(int)>
	//  136  295:astore_0        
		for(int l = 0; l < (k1 - 1) + i; l++)
	//* 137  296:iconst_0        
	//* 138  297:istore          5
	//* 139  299:iload           5
	//* 140  301:iload           8
	//* 141  303:iconst_1        
	//* 142  304:isub            
	//* 143  305:iload           4
	//* 144  307:iadd            
	//* 145  308:icmpge          477
		{
			for(int i1 = 0; i1 < j1; i1++)
	//* 146  311:iconst_0        
	//* 147  312:istore          6
	//* 148  314:iload           6
	//* 149  316:iload           7
	//* 150  318:icmpge          468
			{
				path1 = new Path(4);
	//  151  321:new             #400 <Class Path>
	//  152  324:dup             
	//  153  325:iconst_4        
	//  154  326:invokespecial   #401 <Method void Path(int)>
	//  155  329:astore_1        
				path1.add(((Path)paths.get(l % k1)).get(i1 % j1));
	//  156  330:aload_1         
	//  157  331:aload           9
	//  158  333:iload           5
	//  159  335:iload           8
	//  160  337:irem            
	//  161  338:invokevirtual   #760 <Method Object Paths.get(int)>
	//  162  341:checkcast       #400 <Class Path>
	//  163  344:iload           6
	//  164  346:iload           7
	//  165  348:irem            
	//  166  349:invokevirtual   #756 <Method Object Path.get(int)>
	//  167  352:invokevirtual   #402 <Method boolean Path.add(Object)>
	//  168  355:pop             
				path1.add(((Path)paths.get((l + 1) % k1)).get(i1 % j1));
	//  169  356:aload_1         
	//  170  357:aload           9
	//  171  359:iload           5
	//  172  361:iconst_1        
	//  173  362:iadd            
	//  174  363:iload           8
	//  175  365:irem            
	//  176  366:invokevirtual   #760 <Method Object Paths.get(int)>
	//  177  369:checkcast       #400 <Class Path>
	//  178  372:iload           6
	//  179  374:iload           7
	//  180  376:irem            
	//  181  377:invokevirtual   #756 <Method Object Path.get(int)>
	//  182  380:invokevirtual   #402 <Method boolean Path.add(Object)>
	//  183  383:pop             
				path1.add(((Path)paths.get((l + 1) % k1)).get((i1 + 1) % j1));
	//  184  384:aload_1         
	//  185  385:aload           9
	//  186  387:iload           5
	//  187  389:iconst_1        
	//  188  390:iadd            
	//  189  391:iload           8
	//  190  393:irem            
	//  191  394:invokevirtual   #760 <Method Object Paths.get(int)>
	//  192  397:checkcast       #400 <Class Path>
	//  193  400:iload           6
	//  194  402:iconst_1        
	//  195  403:iadd            
	//  196  404:iload           7
	//  197  406:irem            
	//  198  407:invokevirtual   #756 <Method Object Path.get(int)>
	//  199  410:invokevirtual   #402 <Method boolean Path.add(Object)>
	//  200  413:pop             
				path1.add(((Path)paths.get(l % k1)).get((i1 + 1) % j1));
	//  201  414:aload_1         
	//  202  415:aload           9
	//  203  417:iload           5
	//  204  419:iload           8
	//  205  421:irem            
	//  206  422:invokevirtual   #760 <Method Object Paths.get(int)>
	//  207  425:checkcast       #400 <Class Path>
	//  208  428:iload           6
	//  209  430:iconst_1        
	//  210  431:iadd            
	//  211  432:iload           7
	//  212  434:irem            
	//  213  435:invokevirtual   #756 <Method Object Path.get(int)>
	//  214  438:invokevirtual   #402 <Method boolean Path.add(Object)>
	//  215  441:pop             
				if(!path1.orientation())
	//* 216  442:aload_1         
	//* 217  443:invokevirtual   #763 <Method boolean Path.orientation()>
	//* 218  446:ifne            453
					Collections.reverse(((List) (path1)));
	//  219  449:aload_1         
	//  220  450:invokestatic    #767 <Method void Collections.reverse(List)>
				((Paths) (path)).add(((Object) (path1)));
	//  221  453:aload_0         
	//  222  454:aload_1         
	//  223  455:invokevirtual   #403 <Method boolean Paths.add(Object)>
	//  224  458:pop             
			}

	//  225  459:iload           6
	//  226  461:iconst_1        
	//  227  462:iadd            
	//  228  463:istore          6
		}

	//  229  465:goto            314
	//  230  468:iload           5
	//  231  470:iconst_1        
	//  232  471:iadd            
	//  233  472:istore          5
	//* 234  474:goto            299
		return ((Paths) (path));
	//  235  477:aload_0         
	//  236  478:areturn         
	}

	public static Paths minkowskiDiff(Path path, Path path1)
	{
		path = ((Path) (minkowski(path, path1, false, true)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iconst_1        
	//    4    4:invokestatic    #771 <Method Paths minkowski(Path, Path, boolean, boolean)>
	//    5    7:astore_0        
		path1 = ((Path) (new DefaultClipper()));
	//    6    8:new             #2   <Class DefaultClipper>
	//    7   11:dup             
	//    8   12:invokespecial   #772 <Method void DefaultClipper()>
	//    9   15:astore_1        
		((DefaultClipper) (path1)).addPaths(((Paths) (path)), Clipper.PolyType.SUBJECT, true);
	//   10   16:aload_1         
	//   11   17:aload_0         
	//   12   18:getstatic       #693 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//   13   21:iconst_1        
	//   14   22:invokevirtual   #776 <Method boolean addPaths(Paths, Clipper$PolyType, boolean)>
	//   15   25:pop             
		((DefaultClipper) (path1)).execute(Clipper.ClipType.UNION, ((Paths) (path)), Clipper.PolyFillType.NON_ZERO, Clipper.PolyFillType.NON_ZERO);
	//   16   26:aload_1         
	//   17   27:getstatic       #680 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//   18   30:aload_0         
	//   19   31:getstatic       #779 <Field Clipper$PolyFillType Clipper$PolyFillType.NON_ZERO>
	//   20   34:getstatic       #779 <Field Clipper$PolyFillType Clipper$PolyFillType.NON_ZERO>
	//   21   37:invokevirtual   #783 <Method boolean execute(Clipper$ClipType, Paths, Clipper$PolyFillType, Clipper$PolyFillType)>
	//   22   40:pop             
		return ((Paths) (path));
	//   23   41:aload_0         
	//   24   42:areturn         
	}

	public static Paths minkowskiSum(Path path, Path path1, boolean flag)
	{
		path = ((Path) (minkowski(path, path1, true, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iload_2         
	//    4    4:invokestatic    #771 <Method Paths minkowski(Path, Path, boolean, boolean)>
	//    5    7:astore_0        
		path1 = ((Path) (new DefaultClipper()));
	//    6    8:new             #2   <Class DefaultClipper>
	//    7   11:dup             
	//    8   12:invokespecial   #772 <Method void DefaultClipper()>
	//    9   15:astore_1        
		((DefaultClipper) (path1)).addPaths(((Paths) (path)), Clipper.PolyType.SUBJECT, true);
	//   10   16:aload_1         
	//   11   17:aload_0         
	//   12   18:getstatic       #693 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//   13   21:iconst_1        
	//   14   22:invokevirtual   #776 <Method boolean addPaths(Paths, Clipper$PolyType, boolean)>
	//   15   25:pop             
		((DefaultClipper) (path1)).execute(Clipper.ClipType.UNION, ((Paths) (path)), Clipper.PolyFillType.NON_ZERO, Clipper.PolyFillType.NON_ZERO);
	//   16   26:aload_1         
	//   17   27:getstatic       #680 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//   18   30:aload_0         
	//   19   31:getstatic       #779 <Field Clipper$PolyFillType Clipper$PolyFillType.NON_ZERO>
	//   20   34:getstatic       #779 <Field Clipper$PolyFillType Clipper$PolyFillType.NON_ZERO>
	//   21   37:invokevirtual   #783 <Method boolean execute(Clipper$ClipType, Paths, Clipper$PolyFillType, Clipper$PolyFillType)>
	//   22   40:pop             
		return ((Paths) (path));
	//   23   41:aload_0         
	//   24   42:areturn         
	}

	public static Paths minkowskiSum(Path path, Paths paths, boolean flag)
	{
		Paths paths1 = new Paths();
	//    0    0:new             #390 <Class Paths>
	//    1    3:dup             
	//    2    4:invokespecial   #787 <Method void Paths()>
	//    3    7:astore          4
		DefaultClipper defaultclipper = new DefaultClipper();
	//    4    9:new             #2   <Class DefaultClipper>
	//    5   12:dup             
	//    6   13:invokespecial   #772 <Method void DefaultClipper()>
	//    7   16:astore          5
		for(int i = 0; i < paths.size(); i++)
	//*   8   18:iconst_0        
	//*   9   19:istore_3        
	//*  10   20:iload_3         
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #788 <Method int Paths.size()>
	//*  13   25:icmpge          92
		{
			defaultclipper.addPaths(minkowski(path, (Path)paths.get(i), true, flag), Clipper.PolyType.SUBJECT, true);
	//   14   28:aload           5
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:iload_3         
	//   18   33:invokevirtual   #760 <Method Object Paths.get(int)>
	//   19   36:checkcast       #400 <Class Path>
	//   20   39:iconst_1        
	//   21   40:iload_2         
	//   22   41:invokestatic    #771 <Method Paths minkowski(Path, Path, boolean, boolean)>
	//   23   44:getstatic       #693 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//   24   47:iconst_1        
	//   25   48:invokevirtual   #776 <Method boolean addPaths(Paths, Clipper$PolyType, boolean)>
	//   26   51:pop             
			if(flag)
	//*  27   52:iload_2         
	//*  28   53:ifeq            85
				defaultclipper.addPath(((Path)paths.get(i)).TranslatePath((Point.LongPoint)path.get(0)), Clipper.PolyType.CLIP, true);
	//   29   56:aload           5
	//   30   58:aload_1         
	//   31   59:iload_3         
	//   32   60:invokevirtual   #760 <Method Object Paths.get(int)>
	//   33   63:checkcast       #400 <Class Path>
	//   34   66:aload_0         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #756 <Method Object Path.get(int)>
	//   37   71:checkcast       #223 <Class Point$LongPoint>
	//   38   74:invokevirtual   #792 <Method Path Path.TranslatePath(Point$LongPoint)>
	//   39   77:getstatic       #718 <Field Clipper$PolyType Clipper$PolyType.CLIP>
	//   40   80:iconst_1        
	//   41   81:invokevirtual   #796 <Method boolean addPath(Path, Clipper$PolyType, boolean)>
	//   42   84:pop             
		}

	//   43   85:iload_3         
	//   44   86:iconst_1        
	//   45   87:iadd            
	//   46   88:istore_3        
	//*  47   89:goto            20
		defaultclipper.execute(Clipper.ClipType.UNION, paths1, Clipper.PolyFillType.NON_ZERO, Clipper.PolyFillType.NON_ZERO);
	//   48   92:aload           5
	//   49   94:getstatic       #680 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//   50   97:aload           4
	//   51   99:getstatic       #779 <Field Clipper$PolyFillType Clipper$PolyFillType.NON_ZERO>
	//   52  102:getstatic       #779 <Field Clipper$PolyFillType Clipper$PolyFillType.NON_ZERO>
	//   53  105:invokevirtual   #783 <Method boolean execute(Clipper$ClipType, Paths, Clipper$PolyFillType, Clipper$PolyFillType)>
	//   54  108:pop             
		return paths1;
	//   55  109:aload           4
	//   56  111:areturn         
	}

	private static boolean poly2ContainsPoly1(Path.OutPt outpt, Path.OutPt outpt1)
	{
		Path.OutPt outpt2 = outpt;
	//    0    0:aload_0         
	//    1    1:astore_3        
		Path.OutPt outpt3;
		do
		{
			int i = isPointInPolygon(outpt2.getPt(), outpt1);
	//    2    2:aload_3         
	//    3    3:invokevirtual   #308 <Method Point$LongPoint Path$OutPt.getPt()>
	//    4    6:aload_1         
	//    5    7:invokestatic    #798 <Method int isPointInPolygon(Point$LongPoint, Path$OutPt)>
	//    6   10:istore_2        
			if(i >= 0)
	//*   7   11:iload_2         
	//*   8   12:iflt            23
				return i > 0;
	//    9   15:iload_2         
	//   10   16:ifle            21
	//   11   19:iconst_1        
	//   12   20:ireturn         
	//   13   21:iconst_0        
	//   14   22:ireturn         
			outpt3 = outpt2.next;
	//   15   23:aload_3         
	//   16   24:getfield        #266 <Field Path$OutPt Path$OutPt.next>
	//   17   27:astore          4
			outpt2 = outpt3;
	//   18   29:aload           4
	//   19   31:astore_3        
		} while(outpt3 != outpt);
	//   20   32:aload           4
	//   21   34:aload_0         
	//   22   35:if_acmpne       2
		return true;
	//   23   38:iconst_1        
	//   24   39:ireturn         
	}

	private long popScanbeam()
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "popBeam");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #800 <String "popBeam">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		long l = scanbeam.y;
	//    5   14:aload_0         
	//    6   15:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//    7   18:getfield        #665 <Field long ClipperBase$Scanbeam.y>
	//    8   21:lstore_1        
		scanbeam = scanbeam.next;
	//    9   22:aload_0         
	//   10   23:aload_0         
	//   11   24:getfield        #68  <Field ClipperBase$Scanbeam scanbeam>
	//   12   27:getfield        #664 <Field ClipperBase$Scanbeam ClipperBase$Scanbeam.next>
	//   13   30:putfield        #68  <Field ClipperBase$Scanbeam scanbeam>
		return l;
	//   14   33:lload_1         
	//   15   34:lreturn         
	}

	private void processEdgesAtTopOfScanbeam(long l)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "processEdgesAtTopOfScanbeam");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #801 <String "processEdgesAtTopOfScanbeam">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		do
		{
			for(Edge edge = activeEdges; edge != null;)
	//*   5   14:aload_0         
	//*   6   15:getfield        #72  <Field Edge activeEdges>
	//*   7   18:astore          5
	//*   8   20:aload           5
	//*   9   22:ifnull          359
			{
				boolean flag1 = edge.isMaxima(l);
	//   10   25:aload           5
	//   11   27:lload_1         
	//   12   28:l2d             
	//   13   29:invokevirtual   #805 <Method boolean Edge.isMaxima(double)>
	//   14   32:istore          4
				boolean flag = flag1;
	//   15   34:iload           4
	//   16   36:istore_3        
				if(flag1)
	//*  17   37:iload           4
	//*  18   39:ifeq            64
				{
					Edge edge2 = edge.getMaximaPair();
	//   19   42:aload           5
	//   20   44:invokevirtual   #452 <Method Edge Edge.getMaximaPair()>
	//   21   47:astore          6
					if(edge2 == null || !edge2.isHorizontal())
	//*  22   49:aload           6
	//*  23   51:ifnull          62
	//*  24   54:aload           6
	//*  25   56:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//*  26   59:ifne            114
						flag = true;
	//   27   62:iconst_1        
	//   28   63:istore_3        
					else
	//*  29   64:iload_3         
	//*  30   65:ifeq            129
	//*  31   68:aload_0         
	//*  32   69:getfield        #97  <Field boolean strictlySimple>
	//*  33   72:ifeq            87
	//*  34   75:aload_0         
	//*  35   76:aload           5
	//*  36   78:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  37   81:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  38   84:invokespecial   #807 <Method void InsertMaxima(long)>
	//*  39   87:aload           5
	//*  40   89:getfield        #221 <Field Edge Edge.prevInAEL>
	//*  41   92:astore          6
	//*  42   94:aload_0         
	//*  43   95:aload           5
	//*  44   97:invokespecial   #809 <Method void doMaxima(Edge)>
	//*  45  100:aload           6
	//*  46  102:ifnonnull       119
	//*  47  105:aload_0         
	//*  48  106:getfield        #72  <Field Edge activeEdges>
	//*  49  109:astore          5
	//*  50  111:goto            20
						flag = false;
	//   51  114:iconst_0        
	//   52  115:istore_3        
				}
				if(flag)
				{
					if(strictlySimple)
						InsertMaxima(edge.getTop().getX());
					Edge edge3 = edge.prevInAEL;
					doMaxima(edge);
					if(edge3 == null)
						edge = activeEdges;
					else
	//*  53  116:goto            64
						edge = edge3.nextInAEL;
	//   54  119:aload           6
	//   55  121:getfield        #358 <Field Edge Edge.nextInAEL>
	//   56  124:astore          5
				} else
	//*  57  126:goto            20
				{
					if(edge.isIntermediate(l) && edge.nextInLML.isHorizontal())
	//*  58  129:aload           5
	//*  59  131:lload_1         
	//*  60  132:l2d             
	//*  61  133:invokevirtual   #812 <Method boolean Edge.isIntermediate(double)>
	//*  62  136:ifeq            327
	//*  63  139:aload           5
	//*  64  141:getfield        #815 <Field Edge Edge.nextInLML>
	//*  65  144:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//*  66  147:ifeq            327
					{
						Edge aedge[] = new Edge[1];
	//   67  150:iconst_1        
	//   68  151:anewarray       Edge[]
	//   69  154:astore          6
						aedge[0] = edge;
	//   70  156:aload           6
	//   71  158:iconst_0        
	//   72  159:aload           5
	//   73  161:aastore         
						updateEdgeIntoAEL(aedge);
	//   74  162:aload_0         
	//   75  163:aload           6
	//   76  165:invokespecial   #819 <Method void updateEdgeIntoAEL(Edge[])>
						edge = aedge[0];
	//   77  168:aload           6
	//   78  170:iconst_0        
	//   79  171:aaload          
	//   80  172:astore          5
						if(edge.outIdx >= 0)
	//*  81  174:aload           5
	//*  82  176:getfield        #121 <Field int Edge.outIdx>
	//*  83  179:iflt            194
							addOutPt(edge, edge.getBot());
	//   84  182:aload_0         
	//   85  183:aload           5
	//   86  185:aload           5
	//   87  187:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   88  190:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//   89  193:pop             
						addEdgeToSEL(edge);
	//   90  194:aload_0         
	//   91  195:aload           5
	//   92  197:invokespecial   #641 <Method void addEdgeToSEL(Edge)>
					} else
	//*  93  200:aload_0         
	//*  94  201:getfield        #97  <Field boolean strictlySimple>
	//*  95  204:ifeq            317
	//*  96  207:aload           5
	//*  97  209:getfield        #221 <Field Edge Edge.prevInAEL>
	//*  98  212:astore          6
	//*  99  214:aload           5
	//* 100  216:getfield        #121 <Field int Edge.outIdx>
	//* 101  219:iflt            317
	//* 102  222:aload           5
	//* 103  224:getfield        #200 <Field int Edge.windDelta>
	//* 104  227:ifeq            317
	//* 105  230:aload           6
	//* 106  232:ifnull          317
	//* 107  235:aload           6
	//* 108  237:getfield        #121 <Field int Edge.outIdx>
	//* 109  240:iflt            317
	//* 110  243:aload           6
	//* 111  245:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 112  248:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 113  251:aload           5
	//* 114  253:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 115  256:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 116  259:lcmp            
	//* 117  260:ifne            317
	//* 118  263:aload           6
	//* 119  265:getfield        #200 <Field int Edge.windDelta>
	//* 120  268:ifeq            317
	//* 121  271:new             #223 <Class Point$LongPoint>
	//* 122  274:dup             
	//* 123  275:aload           5
	//* 124  277:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 125  280:invokespecial   #313 <Method void Point$LongPoint(Point$LongPoint)>
	//* 126  283:astore          7
	//* 127  285:aload_0         
	//* 128  286:aload           7
	//* 129  288:aload           6
	//* 130  290:aload           5
	//* 131  292:invokespecial   #671 <Method void setZ(Point$LongPoint, Edge, Edge)>
	//* 132  295:aload_0         
	//* 133  296:aload_0         
	//* 134  297:aload           6
	//* 135  299:aload           7
	//* 136  301:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//* 137  304:aload_0         
	//* 138  305:aload           5
	//* 139  307:aload           7
	//* 140  309:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//* 141  312:aload           7
	//* 142  314:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
	//* 143  317:aload           5
	//* 144  319:getfield        #358 <Field Edge Edge.nextInAEL>
	//* 145  322:astore          5
	//* 146  324:goto            20
					{
						edge.getCurrent().setX(((Number) (Long.valueOf(Edge.topX(edge, l)))));
	//  147  327:aload           5
	//  148  329:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  149  332:aload           5
	//  150  334:lload_1         
	//  151  335:invokestatic    #231 <Method long Edge.topX(Edge, long)>
	//  152  338:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  153  341:invokevirtual   #372 <Method void Point$LongPoint.setX(Number)>
						edge.getCurrent().setY(((Number) (Long.valueOf(l))));
	//  154  344:aload           5
	//  155  346:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  156  349:lload_1         
	//  157  350:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  158  353:invokevirtual   #722 <Method void Point$LongPoint.setY(Number)>
					}
					if(strictlySimple)
					{
						Edge edge4 = edge.prevInAEL;
						if(edge.outIdx >= 0 && edge.windDelta != 0 && edge4 != null && edge4.outIdx >= 0 && edge4.getCurrent().getX() == edge.getCurrent().getX() && edge4.windDelta != 0)
						{
							Point.LongPoint longpoint = new Point.LongPoint(edge.getCurrent());
							setZ(longpoint, edge4, edge);
							addJoin(addOutPt(edge4, longpoint), addOutPt(edge, longpoint), longpoint);
						}
					}
					edge = edge.nextInAEL;
				}
			}

	//* 159  356:goto            200
			processHorizontals();
	//  160  359:aload_0         
	//  161  360:invokespecial   #505 <Method void processHorizontals()>
			maxima = null;
	//  162  363:aload_0         
	//  163  364:aconst_null     
	//  164  365:putfield        #70  <Field Path$Maxima maxima>
			Edge edge1 = activeEdges;
	//  165  368:aload_0         
	//  166  369:getfield        #72  <Field Edge activeEdges>
	//  167  372:astore          5
			while(edge1 != null) 
	//* 168  374:aload           5
	//* 169  376:ifnull          772
			{
				Object obj = ((Object) (edge1));
	//  170  379:aload           5
	//  171  381:astore          7
				if(edge1.isIntermediate(l))
	//* 172  383:aload           5
	//* 173  385:lload_1         
	//* 174  386:l2d             
	//* 175  387:invokevirtual   #812 <Method boolean Edge.isIntermediate(double)>
	//* 176  390:ifeq            589
				{
					Path.OutPt outpt = null;
	//  177  393:aconst_null     
	//  178  394:astore          6
					if(edge1.outIdx >= 0)
	//* 179  396:aload           5
	//* 180  398:getfield        #121 <Field int Edge.outIdx>
	//* 181  401:iflt            417
						outpt = addOutPt(edge1, edge1.getTop());
	//  182  404:aload_0         
	//  183  405:aload           5
	//  184  407:aload           5
	//  185  409:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  186  412:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  187  415:astore          6
					obj = ((Object) (new Edge[1]));
	//  188  417:iconst_1        
	//  189  418:anewarray       Edge[]
	//  190  421:astore          7
					obj[0] = ((/*<invalid signature>*/java.lang.Object) (edge1));
	//  191  423:aload           7
	//  192  425:iconst_0        
	//  193  426:aload           5
	//  194  428:aastore         
					updateEdgeIntoAEL(((Edge []) (obj)));
	//  195  429:aload_0         
	//  196  430:aload           7
	//  197  432:invokespecial   #819 <Method void updateEdgeIntoAEL(Edge[])>
					edge1 = obj[0];
	//  198  435:aload           7
	//  199  437:iconst_0        
	//  200  438:aaload          
	//  201  439:astore          5
					obj = ((Object) (edge1.prevInAEL));
	//  202  441:aload           5
	//  203  443:getfield        #221 <Field Edge Edge.prevInAEL>
	//  204  446:astore          7
					Edge edge5 = edge1.nextInAEL;
	//  205  448:aload           5
	//  206  450:getfield        #358 <Field Edge Edge.nextInAEL>
	//  207  453:astore          8
					if(obj != null && ((Edge) (obj)).getCurrent().getX() == edge1.getBot().getX() && ((Edge) (obj)).getCurrent().getY() == edge1.getBot().getY() && outpt != null && ((Edge) (obj)).outIdx >= 0 && ((Edge) (obj)).getCurrent().getY() > ((Edge) (obj)).getTop().getY() && Edge.slopesEqual(edge1, ((Edge) (obj)), useFullRange) && edge1.windDelta != 0 && ((Edge) (obj)).windDelta != 0)
	//* 208  455:aload           7
	//* 209  457:ifnull          599
	//* 210  460:aload           7
	//* 211  462:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 212  465:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 213  468:aload           5
	//* 214  470:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 215  473:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 216  476:lcmp            
	//* 217  477:ifne            599
	//* 218  480:aload           7
	//* 219  482:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 220  485:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 221  488:aload           5
	//* 222  490:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 223  493:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 224  496:lcmp            
	//* 225  497:ifne            599
	//* 226  500:aload           6
	//* 227  502:ifnull          599
	//* 228  505:aload           7
	//* 229  507:getfield        #121 <Field int Edge.outIdx>
	//* 230  510:iflt            599
	//* 231  513:aload           7
	//* 232  515:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 233  518:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 234  521:aload           7
	//* 235  523:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 236  526:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 237  529:lcmp            
	//* 238  530:ifle            599
	//* 239  533:aload           5
	//* 240  535:aload           7
	//* 241  537:aload_0         
	//* 242  538:getfield        #234 <Field boolean useFullRange>
	//* 243  541:invokestatic    #238 <Method boolean Edge.slopesEqual(Edge, Edge, boolean)>
	//* 244  544:ifeq            599
	//* 245  547:aload           5
	//* 246  549:getfield        #200 <Field int Edge.windDelta>
	//* 247  552:ifeq            599
	//* 248  555:aload           7
	//* 249  557:getfield        #200 <Field int Edge.windDelta>
	//* 250  560:ifeq            599
					{
						addJoin(outpt, addOutPt(((Edge) (obj)), edge1.getBot()), edge1.getTop());
	//  251  563:aload_0         
	//  252  564:aload           6
	//  253  566:aload_0         
	//  254  567:aload           7
	//  255  569:aload           5
	//  256  571:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  257  574:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  258  577:aload           5
	//  259  579:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  260  582:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
						obj = ((Object) (edge1));
	//  261  585:aload           5
	//  262  587:astore          7
					} else
	//* 263  589:aload           7
	//* 264  591:getfield        #358 <Field Edge Edge.nextInAEL>
	//* 265  594:astore          5
	//* 266  596:goto            374
					{
						obj = ((Object) (edge1));
	//  267  599:aload           5
	//  268  601:astore          7
						if(edge5 != null)
	//* 269  603:aload           8
	//* 270  605:ifnull          589
						{
							obj = ((Object) (edge1));
	//  271  608:aload           5
	//  272  610:astore          7
							if(edge5.getCurrent().getX() == edge1.getBot().getX())
	//* 273  612:aload           8
	//* 274  614:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 275  617:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 276  620:aload           5
	//* 277  622:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 278  625:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 279  628:lcmp            
	//* 280  629:ifne            589
							{
								obj = ((Object) (edge1));
	//  281  632:aload           5
	//  282  634:astore          7
								if(edge5.getCurrent().getY() == edge1.getBot().getY())
	//* 283  636:aload           8
	//* 284  638:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 285  641:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 286  644:aload           5
	//* 287  646:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 288  649:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 289  652:lcmp            
	//* 290  653:ifne            589
								{
									obj = ((Object) (edge1));
	//  291  656:aload           5
	//  292  658:astore          7
									if(outpt != null)
	//* 293  660:aload           6
	//* 294  662:ifnull          589
									{
										obj = ((Object) (edge1));
	//  295  665:aload           5
	//  296  667:astore          7
										if(edge5.outIdx >= 0)
	//* 297  669:aload           8
	//* 298  671:getfield        #121 <Field int Edge.outIdx>
	//* 299  674:iflt            589
										{
											obj = ((Object) (edge1));
	//  300  677:aload           5
	//  301  679:astore          7
											if(edge5.getCurrent().getY() > edge5.getTop().getY())
	//* 302  681:aload           8
	//* 303  683:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 304  686:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 305  689:aload           8
	//* 306  691:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 307  694:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 308  697:lcmp            
	//* 309  698:ifle            589
											{
												obj = ((Object) (edge1));
	//  310  701:aload           5
	//  311  703:astore          7
												if(Edge.slopesEqual(edge1, edge5, useFullRange))
	//* 312  705:aload           5
	//* 313  707:aload           8
	//* 314  709:aload_0         
	//* 315  710:getfield        #234 <Field boolean useFullRange>
	//* 316  713:invokestatic    #238 <Method boolean Edge.slopesEqual(Edge, Edge, boolean)>
	//* 317  716:ifeq            589
												{
													obj = ((Object) (edge1));
	//  318  719:aload           5
	//  319  721:astore          7
													if(edge1.windDelta != 0)
	//* 320  723:aload           5
	//* 321  725:getfield        #200 <Field int Edge.windDelta>
	//* 322  728:ifeq            589
													{
														obj = ((Object) (edge1));
	//  323  731:aload           5
	//  324  733:astore          7
														if(edge5.windDelta != 0)
	//* 325  735:aload           8
	//* 326  737:getfield        #200 <Field int Edge.windDelta>
	//* 327  740:ifeq            589
														{
															addJoin(outpt, addOutPt(edge5, edge1.getBot()), edge1.getTop());
	//  328  743:aload_0         
	//  329  744:aload           6
	//  330  746:aload_0         
	//  331  747:aload           8
	//  332  749:aload           5
	//  333  751:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  334  754:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  335  757:aload           5
	//  336  759:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  337  762:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
															obj = ((Object) (edge1));
	//  338  765:aload           5
	//  339  767:astore          7
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				edge1 = ((Edge) (obj)).nextInAEL;
			}
	//* 340  769:goto            589
			LOGGER.exiting(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "processEdgesAtTopOfScanbeam");
	//  341  772:getstatic       #58  <Field Logger LOGGER>
	//  342  775:ldc1            #2   <Class DefaultClipper>
	//  343  777:invokevirtual   #50  <Method String Class.getName()>
	//  344  780:ldc2            #801 <String "processEdgesAtTopOfScanbeam">
	//  345  783:invokevirtual   #443 <Method void Logger.exiting(String, String)>
			return;
	//  346  786:return          
		} while(true);
	}

	private void processHorizontal(Edge edge)
	{
		boolean flag;
		Object obj;
		Object obj1;
		Edge edge3;
		Edge edge4;
		Clipper.Direction adirection[];
		long al[];
		long al1[];
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "isHorizontal");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #821 <String "isHorizontal">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		adirection = new Clipper.Direction[1];
	//    5   14:iconst_1        
	//    6   15:anewarray       Clipper.Direction[]
	//    7   18:astore          11
		al = new long[1];
	//    8   20:iconst_1        
	//    9   21:newarray        long[]
	//   10   23:astore          12
		al1 = new long[1];
	//   11   25:iconst_1        
	//   12   26:newarray        long[]
	//   13   28:astore          13
		if(edge.outIdx >= 0 && ((Path.OutRec)polyOuts.get(edge.outIdx)).isOpen)
	//*  14   30:aload_1         
	//*  15   31:getfield        #121 <Field int Edge.outIdx>
	//*  16   34:iflt            106
	//*  17   37:aload_0         
	//*  18   38:getfield        #89  <Field List polyOuts>
	//*  19   41:aload_1         
	//*  20   42:getfield        #121 <Field int Edge.outIdx>
	//*  21   45:invokeinterface #127 <Method Object List.get(int)>
	//*  22   50:checkcast       #129 <Class Path$OutRec>
	//*  23   53:getfield        #252 <Field boolean Path$OutRec.isOpen>
	//*  24   56:ifeq            106
			flag = true;
	//   25   59:iconst_1        
	//   26   60:istore_2        
		else
	//*  27   61:aload_1         
	//*  28   62:aload           11
	//*  29   64:aload           12
	//*  30   66:aload           13
	//*  31   68:invokestatic    #823 <Method void getHorzDirection(Edge, Clipper$Direction[], long[], long[])>
	//*  32   71:aload_1         
	//*  33   72:astore          7
	//*  34   74:aconst_null     
	//*  35   75:astore          8
	//*  36   77:aload           7
	//*  37   79:getfield        #815 <Field Edge Edge.nextInLML>
	//*  38   82:ifnull          111
	//*  39   85:aload           7
	//*  40   87:getfield        #815 <Field Edge Edge.nextInLML>
	//*  41   90:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//*  42   93:ifeq            111
	//*  43   96:aload           7
	//*  44   98:getfield        #815 <Field Edge Edge.nextInLML>
	//*  45  101:astore          7
	//*  46  103:goto            77
			flag = false;
	//   47  106:iconst_0        
	//   48  107:istore_2        
		getHorzDirection(edge, adirection, al, al1);
		edge3 = edge;
		edge4 = null;
		for(; edge3.nextInLML != null && edge3.nextInLML.isHorizontal(); edge3 = edge3.nextInLML);
	//*  49  108:goto            61
		if(edge3.nextInLML == null)
	//*  50  111:aload           7
	//*  51  113:getfield        #815 <Field Edge Edge.nextInLML>
	//*  52  116:ifnonnull       126
			edge4 = edge3.getMaximaPair();
	//   53  119:aload           7
	//   54  121:invokevirtual   #452 <Method Edge Edge.getMaximaPair()>
	//   55  124:astore          8
		obj1 = ((Object) (maxima));
	//   56  126:aload_0         
	//   57  127:getfield        #70  <Field Path$Maxima maxima>
	//   58  130:astore          5
		obj = obj1;
	//   59  132:aload           5
	//   60  134:astore          4
		if(obj1 == null) goto _L2; else goto _L1
	//   61  136:aload           5
	//   62  138:ifnull          219
_L1:
		Object obj2 = obj1;
	//   63  141:aload           5
	//   64  143:astore          6
		if(adirection[0] != Clipper.Direction.LEFT_TO_RIGHT) goto _L4; else goto _L3
	//   65  145:aload           11
	//   66  147:iconst_0        
	//   67  148:aaload          
	//   68  149:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//   69  152:if_acmpne       348
_L3:
		for(; obj1 != null && ((Path.Maxima) (obj1)).X <= edge.getBot().getX(); obj1 = ((Object) (((Path.Maxima) (obj1)).Next)));
	//   70  155:aload           5
	//   71  157:ifnull          186
	//   72  160:aload           5
	//   73  162:getfield        #156 <Field long Path$Maxima.X>
	//   74  165:aload_1         
	//   75  166:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   76  169:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//   77  172:lcmp            
	//   78  173:ifgt            186
	//   79  176:aload           5
	//   80  178:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//   81  181:astore          5
	//*  82  183:goto            155
		obj = obj1;
	//   83  186:aload           5
	//   84  188:astore          4
		if(obj1 != null)
	//*  85  190:aload           5
	//*  86  192:ifnull          219
		{
			obj = obj1;
	//   87  195:aload           5
	//   88  197:astore          4
			if(((Path.Maxima) (obj1)).X >= edge3.getBot().getX())
	//*  89  199:aload           5
	//*  90  201:getfield        #156 <Field long Path$Maxima.X>
	//*  91  204:aload           7
	//*  92  206:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//*  93  209:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//*  94  212:lcmp            
	//*  95  213:iflt            219
				obj = null;
	//   96  216:aconst_null     
	//   97  217:astore          4
		}
_L2:
		Object obj3;
		obj3 = null;
	//   98  219:aconst_null     
	//   99  220:astore          10
		obj2 = ((Object) (edge));
	//  100  222:aload_1         
	//  101  223:astore          6
		edge = ((Edge) (obj));
	//  102  225:aload           4
	//  103  227:astore_1        
_L18:
		boolean flag1;
		Edge edge5;
		if(obj2 == edge3)
	//* 104  228:aload           6
	//* 105  230:aload           7
	//* 106  232:if_acmpne       412
			flag1 = true;
	//  107  235:iconst_1        
	//  108  236:istore_3        
		else
	//* 109  237:aload           6
	//* 110  239:aload           11
	//* 111  241:iconst_0        
	//* 112  242:aaload          
	//* 113  243:invokevirtual   #827 <Method Edge Edge.getNextInAEL(Clipper$Direction)>
	//* 114  246:astore          9
	//* 115  248:aload_1         
	//* 116  249:astore          5
	//* 117  251:aload           9
	//* 118  253:ifnull          556
	//* 119  256:aload_1         
	//* 120  257:astore          4
	//* 121  259:aload_1         
	//* 122  260:ifnull          496
	//* 123  263:aload_1         
	//* 124  264:astore          5
	//* 125  266:aload           11
	//* 126  268:iconst_0        
	//* 127  269:aaload          
	//* 128  270:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//* 129  273:if_acmpne       417
	//* 130  276:aload_1         
	//* 131  277:astore          4
	//* 132  279:aload_1         
	//* 133  280:ifnull          496
	//* 134  283:aload_1         
	//* 135  284:astore          4
	//* 136  286:aload_1         
	//* 137  287:getfield        #156 <Field long Path$Maxima.X>
	//* 138  290:aload           9
	//* 139  292:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 140  295:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 141  298:lcmp            
	//* 142  299:ifge            496
	//* 143  302:aload           6
	//* 144  304:getfield        #121 <Field int Edge.outIdx>
	//* 145  307:iflt            340
	//* 146  310:iload_2         
	//* 147  311:ifne            340
	//* 148  314:aload_0         
	//* 149  315:aload           6
	//* 150  317:new             #223 <Class Point$LongPoint>
	//* 151  320:dup             
	//* 152  321:aload_1         
	//* 153  322:getfield        #156 <Field long Path$Maxima.X>
	//* 154  325:aload           6
	//* 155  327:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 156  330:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 157  333:invokespecial   #830 <Method void Point$LongPoint(long, long)>
	//* 158  336:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//* 159  339:pop             
	//* 160  340:aload_1         
	//* 161  341:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//* 162  344:astore_1        
	//* 163  345:goto            276
	//* 164  348:aload           6
	//* 165  350:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//* 166  353:ifnull          385
	//* 167  356:aload           6
	//* 168  358:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//* 169  361:getfield        #156 <Field long Path$Maxima.X>
	//* 170  364:aload_1         
	//* 171  365:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 172  368:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 173  371:lcmp            
	//* 174  372:ifge            385
	//* 175  375:aload           6
	//* 176  377:getfield        #159 <Field Path$Maxima Path$Maxima.Next>
	//* 177  380:astore          6
	//* 178  382:goto            348
	//* 179  385:aload           6
	//* 180  387:astore          4
	//* 181  389:aload           6
	//* 182  391:getfield        #156 <Field long Path$Maxima.X>
	//* 183  394:aload           7
	//* 184  396:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 185  399:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 186  402:lcmp            
	//* 187  403:ifgt            219
	//* 188  406:aconst_null     
	//* 189  407:astore          4
	//* 190  409:goto            219
			flag1 = false;
	//  191  412:iconst_0        
	//  192  413:istore_3        
		edge5 = ((Edge) (obj2)).getNextInAEL(adirection[0]);
_L17:
		obj1 = ((Object) (edge));
		if(edge5 == null) goto _L6; else goto _L5
_L5:
		obj = ((Object) (edge));
		if(edge != null)
		{
			obj1 = ((Object) (edge));
			if(adirection[0] == Clipper.Direction.LEFT_TO_RIGHT)
				do
				{
					obj = ((Object) (edge));
					if(edge == null)
						break;
					obj = ((Object) (edge));
					if(((Path.Maxima) (edge)).X >= edge5.getCurrent().getX())
						break;
					if(((Edge) (obj2)).outIdx >= 0 && !flag)
						addOutPt(((Edge) (obj2)), new Point.LongPoint(((Path.Maxima) (edge)).X, ((Edge) (obj2)).getBot().getY()));
					edge = ((Edge) (((Path.Maxima) (edge)).Next));
				} while(true);
			else
	//* 193  414:goto            237
				do
				{
					obj = obj1;
	//  194  417:aload           5
	//  195  419:astore          4
					if(obj1 == null)
						break;
	//  196  421:aload           5
	//  197  423:ifnull          496
					obj = obj1;
	//  198  426:aload           5
	//  199  428:astore          4
					if(((Path.Maxima) (obj1)).X <= edge5.getCurrent().getX())
						break;
	//  200  430:aload           5
	//  201  432:getfield        #156 <Field long Path$Maxima.X>
	//  202  435:aload           9
	//  203  437:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  204  440:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  205  443:lcmp            
	//  206  444:ifle            496
					if(((Edge) (obj2)).outIdx >= 0 && !flag)
	//* 207  447:aload           6
	//* 208  449:getfield        #121 <Field int Edge.outIdx>
	//* 209  452:iflt            486
	//* 210  455:iload_2         
	//* 211  456:ifne            486
						addOutPt(((Edge) (obj2)), new Point.LongPoint(((Path.Maxima) (obj1)).X, ((Edge) (obj2)).getBot().getY()));
	//  212  459:aload_0         
	//  213  460:aload           6
	//  214  462:new             #223 <Class Point$LongPoint>
	//  215  465:dup             
	//  216  466:aload           5
	//  217  468:getfield        #156 <Field long Path$Maxima.X>
	//  218  471:aload           6
	//  219  473:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  220  476:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  221  479:invokespecial   #830 <Method void Point$LongPoint(long, long)>
	//  222  482:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  223  485:pop             
					obj1 = ((Object) (((Path.Maxima) (obj1)).Prev));
	//  224  486:aload           5
	//  225  488:getfield        #162 <Field Path$Maxima Path$Maxima.Prev>
	//  226  491:astore          5
				} while(true);
	//  227  493:goto            417
		}
		  goto _L7
_L4:
		for(; ((Path.Maxima) (obj2)).Next != null && ((Path.Maxima) (obj2)).Next.X < edge.getBot().getX(); obj2 = ((Object) (((Path.Maxima) (obj2)).Next)));
		obj = obj2;
		if(((Path.Maxima) (obj2)).X <= edge3.getTop().getX())
			obj = null;
		continue; /* Loop/switch isn't completed */
_L7:
		if(adirection[0] != Clipper.Direction.LEFT_TO_RIGHT) goto _L9; else goto _L8
	//  228  496:aload           11
	//  229  498:iconst_0        
	//  230  499:aaload          
	//  231  500:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//  232  503:if_acmpne       526
_L8:
		obj1 = obj;
	//  233  506:aload           4
	//  234  508:astore          5
		if(edge5.getCurrent().getX() > al1[0]) goto _L6; else goto _L9
	//  235  510:aload           9
	//  236  512:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  237  515:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  238  518:aload           13
	//  239  520:iconst_0        
	//  240  521:laload          
	//  241  522:lcmp            
	//  242  523:ifgt            556
_L9:
		if(adirection[0] != Clipper.Direction.RIGHT_TO_LEFT || edge5.getCurrent().getX() >= al[0]) goto _L11; else goto _L10
	//  243  526:aload           11
	//  244  528:iconst_0        
	//  245  529:aaload          
	//  246  530:getstatic       #584 <Field Clipper$Direction Clipper$Direction.RIGHT_TO_LEFT>
	//  247  533:if_acmpne       672
	//  248  536:aload           9
	//  249  538:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  250  541:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  251  544:aload           12
	//  252  546:iconst_0        
	//  253  547:laload          
	//  254  548:lcmp            
	//  255  549:ifge            672
_L10:
		obj1 = obj;
	//  256  552:aload           4
	//  257  554:astore          5
_L6:
		if(((Edge) (obj2)).nextInLML != null && ((Edge) (obj2)).nextInLML.isHorizontal()) goto _L13; else goto _L12
	//  258  556:aload           6
	//  259  558:getfield        #815 <Field Edge Edge.nextInLML>
	//  260  561:ifnull          575
	//  261  564:aload           6
	//  262  566:getfield        #815 <Field Edge Edge.nextInLML>
	//  263  569:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//  264  572:ifne            992
	//* 265  575:aload           6
	//* 266  577:getfield        #121 <Field int Edge.outIdx>
	//* 267  580:iflt            1060
	//* 268  583:aload           10
	//* 269  585:ifnonnull       1060
	//* 270  588:aload_0         
	//* 271  589:aload           6
	//* 272  591:invokespecial   #832 <Method Path$OutPt GetLastOutPt(Edge)>
	//* 273  594:astore          4
	//* 274  596:aload_0         
	//* 275  597:getfield        #74  <Field Edge sortedEdges>
	//* 276  600:astore_1        
	//* 277  601:aload_1         
	//* 278  602:ifnull          1049
	//* 279  605:aload_1         
	//* 280  606:getfield        #121 <Field int Edge.outIdx>
	//* 281  609:iflt            664
	//* 282  612:aload_0         
	//* 283  613:aload           6
	//* 284  615:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 285  618:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 286  621:aload           6
	//* 287  623:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 288  626:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 289  629:aload_1         
	//* 290  630:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 291  633:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 292  636:aload_1         
	//* 293  637:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 294  640:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 295  643:invokespecial   #646 <Method boolean doHorzSegmentsOverlap(long, long, long, long)>
	//* 296  646:ifeq            664
	//* 297  649:aload_0         
	//* 298  650:aload_0         
	//* 299  651:aload_1         
	//* 300  652:invokespecial   #832 <Method Path$OutPt GetLastOutPt(Edge)>
	//* 301  655:aload           4
	//* 302  657:aload_1         
	//* 303  658:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 304  661:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
	//* 305  664:aload_1         
	//* 306  665:getfield        #109 <Field Edge Edge.nextInSEL>
	//* 307  668:astore_1        
	//* 308  669:goto            601
_L11:
		if(edge5.getCurrent().getX() != ((Edge) (obj2)).getTop().getX() || ((Edge) (obj2)).nextInLML == null)
			break; /* Loop/switch isn't completed */
	//  309  672:aload           9
	//  310  674:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  311  677:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  312  680:aload           6
	//  313  682:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  314  685:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  315  688:lcmp            
	//  316  689:ifne            721
	//  317  692:aload           6
	//  318  694:getfield        #815 <Field Edge Edge.nextInLML>
	//  319  697:ifnull          721
		obj1 = obj;
	//  320  700:aload           4
	//  321  702:astore          5
		if(edge5.deltaX < ((Edge) (obj2)).nextInLML.deltaX) goto _L6; else goto _L14
	//  322  704:aload           9
	//  323  706:getfield        #215 <Field double Edge.deltaX>
	//  324  709:aload           6
	//  325  711:getfield        #815 <Field Edge Edge.nextInLML>
	//  326  714:getfield        #215 <Field double Edge.deltaX>
	//  327  717:dcmpg           
	//  328  718:iflt            556
_L14:
		obj1 = obj3;
	//  329  721:aload           10
	//  330  723:astore          5
		if(((Edge) (obj2)).outIdx >= 0)
	//* 331  725:aload           6
	//* 332  727:getfield        #121 <Field int Edge.outIdx>
	//* 333  730:iflt            841
		{
			obj1 = obj3;
	//  334  733:aload           10
	//  335  735:astore          5
			if(!flag)
	//* 336  737:iload_2         
	//* 337  738:ifne            841
			{
				obj1 = ((Object) (addOutPt(((Edge) (obj2)), edge5.getCurrent())));
	//  338  741:aload_0         
	//  339  742:aload           6
	//  340  744:aload           9
	//  341  746:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  342  749:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  343  752:astore          5
				for(edge = sortedEdges; edge != null; edge = edge.nextInSEL)
	//* 344  754:aload_0         
	//* 345  755:getfield        #74  <Field Edge sortedEdges>
	//* 346  758:astore_1        
	//* 347  759:aload_1         
	//* 348  760:ifnull          830
					if(edge.outIdx >= 0 && doHorzSegmentsOverlap(((Edge) (obj2)).getBot().getX(), ((Edge) (obj2)).getTop().getX(), edge.getBot().getX(), edge.getTop().getX()))
	//* 349  763:aload_1         
	//* 350  764:getfield        #121 <Field int Edge.outIdx>
	//* 351  767:iflt            822
	//* 352  770:aload_0         
	//* 353  771:aload           6
	//* 354  773:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 355  776:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 356  779:aload           6
	//* 357  781:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 358  784:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 359  787:aload_1         
	//* 360  788:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 361  791:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 362  794:aload_1         
	//* 363  795:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 364  798:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 365  801:invokespecial   #646 <Method boolean doHorzSegmentsOverlap(long, long, long, long)>
	//* 366  804:ifeq            822
						addJoin(GetLastOutPt(edge), ((Path.OutPt) (obj1)), edge.getTop());
	//  367  807:aload_0         
	//  368  808:aload_0         
	//  369  809:aload_1         
	//  370  810:invokespecial   #832 <Method Path$OutPt GetLastOutPt(Edge)>
	//  371  813:aload           5
	//  372  815:aload_1         
	//  373  816:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  374  819:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>

	//  375  822:aload_1         
	//  376  823:getfield        #109 <Field Edge Edge.nextInSEL>
	//  377  826:astore_1        
	//* 378  827:goto            759
				addGhostJoin(((Path.OutPt) (obj1)), ((Edge) (obj2)).getBot());
	//  379  830:aload_0         
	//  380  831:aload           5
	//  381  833:aload           6
	//  382  835:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  383  838:invokespecial   #834 <Method void addGhostJoin(Path$OutPt, Point$LongPoint)>
			}
		}
		if(edge5 != edge4 || !flag1) goto _L16; else goto _L15
	//  384  841:aload           9
	//  385  843:aload           8
	//  386  845:if_acmpne       886
	//  387  848:iload_3         
	//  388  849:ifeq            886
_L15:
		if(((Edge) (obj2)).outIdx >= 0)
	//* 389  852:aload           6
	//* 390  854:getfield        #121 <Field int Edge.outIdx>
	//* 391  857:iflt            873
			addLocalMaxPoly(((Edge) (obj2)), edge4, ((Edge) (obj2)).getTop());
	//  392  860:aload_0         
	//  393  861:aload           6
	//  394  863:aload           8
	//  395  865:aload           6
	//  396  867:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  397  870:invokespecial   #465 <Method void addLocalMaxPoly(Edge, Edge, Point$LongPoint)>
		deleteFromAEL(((Edge) (obj2)));
	//  398  873:aload_0         
	//  399  874:aload           6
	//  400  876:invokespecial   #454 <Method void deleteFromAEL(Edge)>
		deleteFromAEL(edge4);
	//  401  879:aload_0         
	//  402  880:aload           8
	//  403  882:invokespecial   #454 <Method void deleteFromAEL(Edge)>
_L19:
		return;
	//  404  885:return          
_L16:
		if(adirection[0] == Clipper.Direction.LEFT_TO_RIGHT)
	//* 405  886:aload           11
	//* 406  888:iconst_0        
	//* 407  889:aaload          
	//* 408  890:getstatic       #581 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//* 409  893:if_acmpne       958
			intersectEdges(((Edge) (obj2)), edge5, new Point.LongPoint(edge5.getCurrent().getX(), ((Edge) (obj2)).getCurrent().getY()));
	//  410  896:aload_0         
	//  411  897:aload           6
	//  412  899:aload           9
	//  413  901:new             #223 <Class Point$LongPoint>
	//  414  904:dup             
	//  415  905:aload           9
	//  416  907:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  417  910:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  418  913:aload           6
	//  419  915:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  420  918:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  421  921:invokespecial   #830 <Method void Point$LongPoint(long, long)>
	//  422  924:invokespecial   #457 <Method void intersectEdges(Edge, Edge, Point$LongPoint)>
		else
	//* 423  927:aload           9
	//* 424  929:aload           11
	//* 425  931:iconst_0        
	//* 426  932:aaload          
	//* 427  933:invokevirtual   #827 <Method Edge Edge.getNextInAEL(Clipper$Direction)>
	//* 428  936:astore_1        
	//* 429  937:aload_0         
	//* 430  938:aload           6
	//* 431  940:aload           9
	//* 432  942:invokespecial   #463 <Method void swapPositionsInAEL(Edge, Edge)>
	//* 433  945:aload_1         
	//* 434  946:astore          9
	//* 435  948:aload           4
	//* 436  950:astore_1        
	//* 437  951:aload           5
	//* 438  953:astore          10
	//* 439  955:goto            248
			intersectEdges(edge5, ((Edge) (obj2)), new Point.LongPoint(edge5.getCurrent().getX(), ((Edge) (obj2)).getCurrent().getY()));
	//  440  958:aload_0         
	//  441  959:aload           9
	//  442  961:aload           6
	//  443  963:new             #223 <Class Point$LongPoint>
	//  444  966:dup             
	//  445  967:aload           9
	//  446  969:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  447  972:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//  448  975:aload           6
	//  449  977:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//  450  980:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//  451  983:invokespecial   #830 <Method void Point$LongPoint(long, long)>
	//  452  986:invokespecial   #457 <Method void intersectEdges(Edge, Edge, Point$LongPoint)>
		edge = edge5.getNextInAEL(adirection[0]);
		swapPositionsInAEL(((Edge) (obj2)), edge5);
		edge5 = edge;
		edge = ((Edge) (obj));
		obj3 = obj1;
		  goto _L17
	//* 453  989:goto            927
_L13:
		edge = ((Edge) (new Edge[1]));
	//  454  992:iconst_1        
	//  455  993:anewarray       Edge[]
	//  456  996:astore_1        
		edge[0] = ((/*<invalid signature>*/java.lang.Object) (obj2));
	//  457  997:aload_1         
	//  458  998:iconst_0        
	//  459  999:aload           6
	//  460 1001:aastore         
		updateEdgeIntoAEL(((Edge []) (edge)));
	//  461 1002:aload_0         
	//  462 1003:aload_1         
	//  463 1004:invokespecial   #819 <Method void updateEdgeIntoAEL(Edge[])>
		obj2 = ((Object) (edge[0]));
	//  464 1007:aload_1         
	//  465 1008:iconst_0        
	//  466 1009:aaload          
	//  467 1010:astore          6
		if(((Edge) (obj2)).outIdx >= 0)
	//* 468 1012:aload           6
	//* 469 1014:getfield        #121 <Field int Edge.outIdx>
	//* 470 1017:iflt            1032
			addOutPt(((Edge) (obj2)), ((Edge) (obj2)).getBot());
	//  471 1020:aload_0         
	//  472 1021:aload           6
	//  473 1023:aload           6
	//  474 1025:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  475 1028:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  476 1031:pop             
		getHorzDirection(((Edge) (obj2)), adirection, al, al1);
	//  477 1032:aload           6
	//  478 1034:aload           11
	//  479 1036:aload           12
	//  480 1038:aload           13
	//  481 1040:invokestatic    #823 <Method void getHorzDirection(Edge, Clipper$Direction[], long[], long[])>
		edge = ((Edge) (obj1));
	//  482 1043:aload           5
	//  483 1045:astore_1        
		  goto _L18
_L12:
		if(((Edge) (obj2)).outIdx >= 0 && obj3 == null)
		{
			obj = ((Object) (GetLastOutPt(((Edge) (obj2)))));
			for(edge = sortedEdges; edge != null; edge = edge.nextInSEL)
				if(edge.outIdx >= 0 && doHorzSegmentsOverlap(((Edge) (obj2)).getBot().getX(), ((Edge) (obj2)).getTop().getX(), edge.getBot().getX(), edge.getTop().getX()))
					addJoin(GetLastOutPt(edge), ((Path.OutPt) (obj)), edge.getTop());

	//* 484 1046:goto            228
			addGhostJoin(((Path.OutPt) (obj)), ((Edge) (obj2)).getTop());
	//  485 1049:aload_0         
	//  486 1050:aload           4
	//  487 1052:aload           6
	//  488 1054:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  489 1057:invokespecial   #834 <Method void addGhostJoin(Path$OutPt, Point$LongPoint)>
		}
label0:
		{
			if(((Edge) (obj2)).nextInLML == null)
				break label0;
	//  490 1060:aload           6
	//  491 1062:getfield        #815 <Field Edge Edge.nextInLML>
	//  492 1065:ifnull          1388
			if(((Edge) (obj2)).outIdx >= 0)
	//* 493 1068:aload           6
	//* 494 1070:getfield        #121 <Field int Edge.outIdx>
	//* 495 1073:iflt            1368
			{
				edge = ((Edge) (addOutPt(((Edge) (obj2)), ((Edge) (obj2)).getTop())));
	//  496 1076:aload_0         
	//  497 1077:aload           6
	//  498 1079:aload           6
	//  499 1081:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  500 1084:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  501 1087:astore_1        
				Edge aedge[] = new Edge[1];
	//  502 1088:iconst_1        
	//  503 1089:anewarray       Edge[]
	//  504 1092:astore          4
				aedge[0] = ((Edge) (obj2));
	//  505 1094:aload           4
	//  506 1096:iconst_0        
	//  507 1097:aload           6
	//  508 1099:aastore         
				updateEdgeIntoAEL(aedge);
	//  509 1100:aload_0         
	//  510 1101:aload           4
	//  511 1103:invokespecial   #819 <Method void updateEdgeIntoAEL(Edge[])>
				Edge edge1 = aedge[0];
	//  512 1106:aload           4
	//  513 1108:iconst_0        
	//  514 1109:aaload          
	//  515 1110:astore          4
				if(edge1.windDelta != 0)
	//* 516 1112:aload           4
	//* 517 1114:getfield        #200 <Field int Edge.windDelta>
	//* 518 1117:ifeq            885
				{
					Edge edge2 = edge1.prevInAEL;
	//  519 1120:aload           4
	//  520 1122:getfield        #221 <Field Edge Edge.prevInAEL>
	//  521 1125:astore          5
					obj2 = ((Object) (edge1.nextInAEL));
	//  522 1127:aload           4
	//  523 1129:getfield        #358 <Field Edge Edge.nextInAEL>
	//  524 1132:astore          6
					if(edge2 != null && edge2.getCurrent().getX() == edge1.getBot().getX() && edge2.getCurrent().getY() == edge1.getBot().getY() && edge2.windDelta != 0 && edge2.outIdx >= 0 && edge2.getCurrent().getY() > edge2.getTop().getY() && Edge.slopesEqual(edge1, edge2, useFullRange))
	//* 525 1134:aload           5
	//* 526 1136:ifnull          1251
	//* 527 1139:aload           5
	//* 528 1141:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 529 1144:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 530 1147:aload           4
	//* 531 1149:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 532 1152:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 533 1155:lcmp            
	//* 534 1156:ifne            1251
	//* 535 1159:aload           5
	//* 536 1161:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 537 1164:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 538 1167:aload           4
	//* 539 1169:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 540 1172:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 541 1175:lcmp            
	//* 542 1176:ifne            1251
	//* 543 1179:aload           5
	//* 544 1181:getfield        #200 <Field int Edge.windDelta>
	//* 545 1184:ifeq            1251
	//* 546 1187:aload           5
	//* 547 1189:getfield        #121 <Field int Edge.outIdx>
	//* 548 1192:iflt            1251
	//* 549 1195:aload           5
	//* 550 1197:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 551 1200:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 552 1203:aload           5
	//* 553 1205:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 554 1208:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 555 1211:lcmp            
	//* 556 1212:ifle            1251
	//* 557 1215:aload           4
	//* 558 1217:aload           5
	//* 559 1219:aload_0         
	//* 560 1220:getfield        #234 <Field boolean useFullRange>
	//* 561 1223:invokestatic    #238 <Method boolean Edge.slopesEqual(Edge, Edge, boolean)>
	//* 562 1226:ifeq            1251
					{
						addJoin(((Path.OutPt) (edge)), addOutPt(edge2, edge1.getBot()), edge1.getTop());
	//  563 1229:aload_0         
	//  564 1230:aload_1         
	//  565 1231:aload_0         
	//  566 1232:aload           5
	//  567 1234:aload           4
	//  568 1236:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  569 1239:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  570 1242:aload           4
	//  571 1244:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  572 1247:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
						return;
	//  573 1250:return          
					}
					if(obj2 != null && ((Edge) (obj2)).getCurrent().getX() == edge1.getBot().getX() && ((Edge) (obj2)).getCurrent().getY() == edge1.getBot().getY() && ((Edge) (obj2)).windDelta != 0 && ((Edge) (obj2)).outIdx >= 0 && ((Edge) (obj2)).getCurrent().getY() > ((Edge) (obj2)).getTop().getY() && Edge.slopesEqual(edge1, ((Edge) (obj2)), useFullRange))
	//* 574 1251:aload           6
	//* 575 1253:ifnull          885
	//* 576 1256:aload           6
	//* 577 1258:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 578 1261:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 579 1264:aload           4
	//* 580 1266:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 581 1269:invokevirtual   #375 <Method long Point$LongPoint.getX()>
	//* 582 1272:lcmp            
	//* 583 1273:ifne            885
	//* 584 1276:aload           6
	//* 585 1278:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 586 1281:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 587 1284:aload           4
	//* 588 1286:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//* 589 1289:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 590 1292:lcmp            
	//* 591 1293:ifne            885
	//* 592 1296:aload           6
	//* 593 1298:getfield        #200 <Field int Edge.windDelta>
	//* 594 1301:ifeq            885
	//* 595 1304:aload           6
	//* 596 1306:getfield        #121 <Field int Edge.outIdx>
	//* 597 1309:iflt            885
	//* 598 1312:aload           6
	//* 599 1314:invokevirtual   #362 <Method Point$LongPoint Edge.getCurrent()>
	//* 600 1317:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 601 1320:aload           6
	//* 602 1322:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//* 603 1325:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//* 604 1328:lcmp            
	//* 605 1329:ifle            885
	//* 606 1332:aload           4
	//* 607 1334:aload           6
	//* 608 1336:aload_0         
	//* 609 1337:getfield        #234 <Field boolean useFullRange>
	//* 610 1340:invokestatic    #238 <Method boolean Edge.slopesEqual(Edge, Edge, boolean)>
	//* 611 1343:ifeq            885
					{
						addJoin(((Path.OutPt) (edge)), addOutPt(((Edge) (obj2)), edge1.getBot()), edge1.getTop());
	//  612 1346:aload_0         
	//  613 1347:aload_1         
	//  614 1348:aload_0         
	//  615 1349:aload           6
	//  616 1351:aload           4
	//  617 1353:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//  618 1356:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  619 1359:aload           4
	//  620 1361:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  621 1364:invokespecial   #244 <Method void addJoin(Path$OutPt, Path$OutPt, Point$LongPoint)>
						return;
	//  622 1367:return          
					}
				}
			} else
			{
				edge = ((Edge) (new Edge[1]));
	//  623 1368:iconst_1        
	//  624 1369:anewarray       Edge[]
	//  625 1372:astore_1        
				edge[0] = ((/*<invalid signature>*/java.lang.Object) (obj2));
	//  626 1373:aload_1         
	//  627 1374:iconst_0        
	//  628 1375:aload           6
	//  629 1377:aastore         
				updateEdgeIntoAEL(((Edge []) (edge)));
	//  630 1378:aload_0         
	//  631 1379:aload_1         
	//  632 1380:invokespecial   #819 <Method void updateEdgeIntoAEL(Edge[])>
				edge = ((Edge) (edge[0]));
	//  633 1383:aload_1         
	//  634 1384:iconst_0        
	//  635 1385:aaload          
	//  636 1386:astore_1        
				return;
	//  637 1387:return          
			}
		}
		  goto _L19
		if(((Edge) (obj2)).outIdx >= 0)
	//* 638 1388:aload           6
	//* 639 1390:getfield        #121 <Field int Edge.outIdx>
	//* 640 1393:iflt            1408
			addOutPt(((Edge) (obj2)), ((Edge) (obj2)).getTop());
	//  641 1396:aload_0         
	//  642 1397:aload           6
	//  643 1399:aload           6
	//  644 1401:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//  645 1404:invokespecial   #197 <Method Path$OutPt addOutPt(Edge, Point$LongPoint)>
	//  646 1407:pop             
		deleteFromAEL(((Edge) (obj2)));
	//  647 1408:aload_0         
	//  648 1409:aload           6
	//  649 1411:invokespecial   #454 <Method void deleteFromAEL(Edge)>
		return;
	//  650 1414:return          
		if(true) goto _L2; else goto _L20
_L20:
	}

	private void processHorizontals()
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "processHorizontals");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #835 <String "processHorizontals">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		for(Edge edge = sortedEdges; edge != null; edge = sortedEdges)
	//*   5   14:aload_0         
	//*   6   15:getfield        #74  <Field Edge sortedEdges>
	//*   7   18:astore_1        
	//*   8   19:aload_1         
	//*   9   20:ifnull          41
		{
			deleteFromSEL(edge);
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:invokespecial   #837 <Method void deleteFromSEL(Edge)>
			processHorizontal(edge);
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:invokespecial   #839 <Method void processHorizontal(Edge)>
		}

	//   16   33:aload_0         
	//   17   34:getfield        #74  <Field Edge sortedEdges>
	//   18   37:astore_1        
	//*  19   38:goto            19
	//   20   41:return          
	}

	private void processIntersectList()
	{
		for(int i = 0; i < intersectList.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #80  <Field List intersectList>
	//*   5    7:invokeinterface #396 <Method int List.size()>
	//*   6   12:icmpge          64
		{
			IntersectNode intersectnode = (IntersectNode)intersectList.get(i);
	//    7   15:aload_0         
	//    8   16:getfield        #80  <Field List intersectList>
	//    9   19:iload_1         
	//   10   20:invokeinterface #127 <Method Object List.get(int)>
	//   11   25:checkcast       #10  <Class DefaultClipper$IntersectNode>
	//   12   28:astore_2        
			intersectEdges(intersectnode.edge1, intersectnode.Edge2, intersectnode.getPt());
	//   13   29:aload_0         
	//   14   30:aload_2         
	//   15   31:getfield        #104 <Field Edge DefaultClipper$IntersectNode.edge1>
	//   16   34:aload_2         
	//   17   35:getfield        #112 <Field Edge DefaultClipper$IntersectNode.Edge2>
	//   18   38:aload_2         
	//   19   39:invokevirtual   #841 <Method Point$LongPoint DefaultClipper$IntersectNode.getPt()>
	//   20   42:invokespecial   #457 <Method void intersectEdges(Edge, Edge, Point$LongPoint)>
			swapPositionsInAEL(intersectnode.edge1, intersectnode.Edge2);
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:getfield        #104 <Field Edge DefaultClipper$IntersectNode.edge1>
	//   24   50:aload_2         
	//   25   51:getfield        #112 <Field Edge DefaultClipper$IntersectNode.Edge2>
	//   26   54:invokespecial   #463 <Method void swapPositionsInAEL(Edge, Edge)>
		}

	//   27   57:iload_1         
	//   28   58:iconst_1        
	//   29   59:iadd            
	//   30   60:istore_1        
	//*  31   61:goto            2
		intersectList.clear();
	//   32   64:aload_0         
	//   33   65:getfield        #80  <Field List intersectList>
	//   34   68:invokeinterface #496 <Method void List.clear()>
	//   35   73:return          
	}

	private boolean processIntersections(long l)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "processIntersections");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #844 <String "processIntersections">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		if(activeEdges != null) goto _L2; else goto _L1
	//    5   14:aload_0         
	//    6   15:getfield        #72  <Field Edge activeEdges>
	//    7   18:ifnonnull       23
_L1:
		return true;
	//    8   21:iconst_1        
	//    9   22:ireturn         
_L2:
		buildIntersectList(l);
	//   10   23:aload_0         
	//   11   24:lload_1         
	//   12   25:invokespecial   #846 <Method void buildIntersectList(long)>
		if(intersectList.size() == 0) goto _L1; else goto _L3
	//   13   28:aload_0         
	//   14   29:getfield        #80  <Field List intersectList>
	//   15   32:invokeinterface #396 <Method int List.size()>
	//   16   37:ifeq            21
_L3:
		if(intersectList.size() != 1 && !fixupIntersectionOrder())
			break MISSING_BLOCK_LABEL_71;
	//   17   40:aload_0         
	//   18   41:getfield        #80  <Field List intersectList>
	//   19   44:invokeinterface #396 <Method int List.size()>
	//   20   49:iconst_1        
	//   21   50:icmpeq          60
	//   22   53:aload_0         
	//   23   54:invokespecial   #848 <Method boolean fixupIntersectionOrder()>
	//   24   57:ifeq            71
		processIntersectList();
	//   25   60:aload_0         
	//   26   61:invokespecial   #850 <Method void processIntersectList()>
		sortedEdges = null;
	//   27   64:aload_0         
	//   28   65:aconst_null     
	//   29   66:putfield        #74  <Field Edge sortedEdges>
		return true;
	//   30   69:iconst_1        
	//   31   70:ireturn         
		return false;
	//   32   71:iconst_0        
	//   33   72:ireturn         
		Exception exception;
		exception;
	//   34   73:astore_3        
		sortedEdges = null;
	//   35   74:aload_0         
	//   36   75:aconst_null     
	//   37   76:putfield        #74  <Field Edge sortedEdges>
		intersectList.clear();
	//   38   79:aload_0         
	//   39   80:getfield        #80  <Field List intersectList>
	//   40   83:invokeinterface #496 <Method void List.clear()>
		throw new IllegalStateException("ProcessIntersections error", ((Throwable) (exception)));
	//   41   88:new             #467 <Class IllegalStateException>
	//   42   91:dup             
	//   43   92:ldc2            #852 <String "ProcessIntersections error">
	//   44   95:aload_3         
	//   45   96:invokespecial   #855 <Method void IllegalStateException(String, Throwable)>
	//   46   99:athrow          
	}

	private void setHoleState(Edge edge, Path.OutRec outrec)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		edge = edge.prevInAEL;
	//    2    2:aload_1         
	//    3    3:getfield        #221 <Field Edge Edge.prevInAEL>
	//    4    6:astore_1        
		while(edge != null) 
	//*   5    7:aload_1         
	//*   6    8:ifnull          86
		{
			boolean flag1 = flag;
	//    7   11:iload_3         
	//    8   12:istore          4
			if(edge.outIdx >= 0)
	//*   9   14:aload_1         
	//*  10   15:getfield        #121 <Field int Edge.outIdx>
	//*  11   18:iflt            70
			{
				flag1 = flag;
	//   12   21:iload_3         
	//   13   22:istore          4
				if(edge.windDelta != 0)
	//*  14   24:aload_1         
	//*  15   25:getfield        #200 <Field int Edge.windDelta>
	//*  16   28:ifeq            70
				{
					if(!flag)
	//*  17   31:iload_3         
	//*  18   32:ifne            81
						flag = true;
	//   19   35:iconst_1        
	//   20   36:istore_3        
					else
	//*  21   37:iload_3         
	//*  22   38:istore          4
	//*  23   40:aload_2         
	//*  24   41:getfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//*  25   44:ifnonnull       70
	//*  26   47:aload_2         
	//*  27   48:aload_0         
	//*  28   49:getfield        #89  <Field List polyOuts>
	//*  29   52:aload_1         
	//*  30   53:getfield        #121 <Field int Edge.outIdx>
	//*  31   56:invokeinterface #127 <Method Object List.get(int)>
	//*  32   61:checkcast       #129 <Class Path$OutRec>
	//*  33   64:putfield        #348 <Field Path$OutRec Path$OutRec.firstLeft>
	//*  34   67:iload_3         
	//*  35   68:istore          4
	//*  36   70:aload_1         
	//*  37   71:getfield        #221 <Field Edge Edge.prevInAEL>
	//*  38   74:astore_1        
	//*  39   75:iload           4
	//*  40   77:istore_3        
	//*  41   78:goto            7
						flag = false;
	//   42   81:iconst_0        
	//   43   82:istore_3        
					flag1 = flag;
					if(outrec.firstLeft == null)
					{
						outrec.firstLeft = (Path.OutRec)polyOuts.get(edge.outIdx);
						flag1 = flag;
					}
				}
			}
			edge = edge.prevInAEL;
			flag = flag1;
		}
	//*  44   83:goto            37
		if(flag)
	//*  45   86:iload_3         
	//*  46   87:ifeq            95
			outrec.isHole = true;
	//   47   90:aload_2         
	//   48   91:iconst_1        
	//   49   92:putfield        #351 <Field boolean Path$OutRec.isHole>
	//   50   95:return          
	}

	private void setZ(Point.LongPoint longpoint, Edge edge, Edge edge1)
	{
		if(longpoint.getZ() != 0L || zFillFunction == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #858 <Method long Point$LongPoint.getZ()>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            16
	//*   5    9:aload_0         
	//*   6   10:getfield        #99  <Field Clipper$ZFillCallback zFillFunction>
	//*   7   13:ifnonnull       17
			return;
	//    8   16:return          
		if(longpoint.equals(((Object) (edge.getBot()))))
	//*   9   17:aload_1         
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//*  12   22:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  13   25:ifeq            43
		{
			longpoint.setZ(((Number) (Long.valueOf(edge.getBot().getZ()))));
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   17   33:invokevirtual   #858 <Method long Point$LongPoint.getZ()>
	//   18   36:invokestatic    #368 <Method Long Long.valueOf(long)>
	//   19   39:invokevirtual   #860 <Method void Point$LongPoint.setZ(Number)>
			return;
	//   20   42:return          
		}
		if(longpoint.equals(((Object) (edge.getTop()))))
	//*  21   43:aload_1         
	//*  22   44:aload_2         
	//*  23   45:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  24   48:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  25   51:ifeq            69
		{
			longpoint.setZ(((Number) (Long.valueOf(edge.getTop().getZ()))));
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   29   59:invokevirtual   #858 <Method long Point$LongPoint.getZ()>
	//   30   62:invokestatic    #368 <Method Long Long.valueOf(long)>
	//   31   65:invokevirtual   #860 <Method void Point$LongPoint.setZ(Number)>
			return;
	//   32   68:return          
		}
		if(longpoint.equals(((Object) (edge1.getBot()))))
	//*  33   69:aload_1         
	//*  34   70:aload_3         
	//*  35   71:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//*  36   74:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  37   77:ifeq            95
		{
			longpoint.setZ(((Number) (Long.valueOf(edge1.getBot().getZ()))));
	//   38   80:aload_1         
	//   39   81:aload_3         
	//   40   82:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   41   85:invokevirtual   #858 <Method long Point$LongPoint.getZ()>
	//   42   88:invokestatic    #368 <Method Long Long.valueOf(long)>
	//   43   91:invokevirtual   #860 <Method void Point$LongPoint.setZ(Number)>
			return;
	//   44   94:return          
		}
		if(longpoint.equals(((Object) (edge1.getTop()))))
	//*  45   95:aload_1         
	//*  46   96:aload_3         
	//*  47   97:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  48  100:invokevirtual   #311 <Method boolean Point$LongPoint.equals(Object)>
	//*  49  103:ifeq            121
		{
			longpoint.setZ(((Number) (Long.valueOf(edge1.getTop().getZ()))));
	//   50  106:aload_1         
	//   51  107:aload_3         
	//   52  108:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   53  111:invokevirtual   #858 <Method long Point$LongPoint.getZ()>
	//   54  114:invokestatic    #368 <Method Long Long.valueOf(long)>
	//   55  117:invokevirtual   #860 <Method void Point$LongPoint.setZ(Number)>
			return;
	//   56  120:return          
		} else
		{
			zFillFunction.zFill(edge.getBot(), edge.getTop(), edge1.getBot(), edge1.getTop(), longpoint);
	//   57  121:aload_0         
	//   58  122:getfield        #99  <Field Clipper$ZFillCallback zFillFunction>
	//   59  125:aload_2         
	//   60  126:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   61  129:aload_2         
	//   62  130:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   63  133:aload_3         
	//   64  134:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//   65  137:aload_3         
	//   66  138:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//   67  141:aload_1         
	//   68  142:invokeinterface #866 <Method void Clipper$ZFillCallback.zFill(Point$LongPoint, Point$LongPoint, Point$LongPoint, Point$LongPoint, Point$LongPoint)>
			return;
	//   69  147:return          
		}
	}

	public static Paths simplifyPolygon(Path path)
	{
		return simplifyPolygon(path, Clipper.PolyFillType.EVEN_ODD);
	//    0    0:aload_0         
	//    1    1:getstatic       #871 <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
	//    2    4:invokestatic    #874 <Method Paths simplifyPolygon(Path, Clipper$PolyFillType)>
	//    3    7:areturn         
	}

	public static Paths simplifyPolygon(Path path, Clipper.PolyFillType polyfilltype)
	{
		Paths paths = new Paths();
	//    0    0:new             #390 <Class Paths>
	//    1    3:dup             
	//    2    4:invokespecial   #787 <Method void Paths()>
	//    3    7:astore_2        
		DefaultClipper defaultclipper = new DefaultClipper(2);
	//    4    8:new             #2   <Class DefaultClipper>
	//    5   11:dup             
	//    6   12:iconst_2        
	//    7   13:invokespecial   #63  <Method void DefaultClipper(int)>
	//    8   16:astore_3        
		defaultclipper.addPath(path, Clipper.PolyType.SUBJECT, true);
	//    9   17:aload_3         
	//   10   18:aload_0         
	//   11   19:getstatic       #693 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #796 <Method boolean addPath(Path, Clipper$PolyType, boolean)>
	//   14   26:pop             
		defaultclipper.execute(Clipper.ClipType.UNION, paths, polyfilltype, polyfilltype);
	//   15   27:aload_3         
	//   16   28:getstatic       #680 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #783 <Method boolean execute(Clipper$ClipType, Paths, Clipper$PolyFillType, Clipper$PolyFillType)>
	//   21   37:pop             
		return paths;
	//   22   38:aload_2         
	//   23   39:areturn         
	}

	public static Paths simplifyPolygons(Paths paths)
	{
		return simplifyPolygons(paths, Clipper.PolyFillType.EVEN_ODD);
	//    0    0:aload_0         
	//    1    1:getstatic       #871 <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
	//    2    4:invokestatic    #879 <Method Paths simplifyPolygons(Paths, Clipper$PolyFillType)>
	//    3    7:areturn         
	}

	public static Paths simplifyPolygons(Paths paths, Clipper.PolyFillType polyfilltype)
	{
		Paths paths1 = new Paths();
	//    0    0:new             #390 <Class Paths>
	//    1    3:dup             
	//    2    4:invokespecial   #787 <Method void Paths()>
	//    3    7:astore_2        
		DefaultClipper defaultclipper = new DefaultClipper(2);
	//    4    8:new             #2   <Class DefaultClipper>
	//    5   11:dup             
	//    6   12:iconst_2        
	//    7   13:invokespecial   #63  <Method void DefaultClipper(int)>
	//    8   16:astore_3        
		defaultclipper.addPaths(paths, Clipper.PolyType.SUBJECT, true);
	//    9   17:aload_3         
	//   10   18:aload_0         
	//   11   19:getstatic       #693 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #776 <Method boolean addPaths(Paths, Clipper$PolyType, boolean)>
	//   14   26:pop             
		defaultclipper.execute(Clipper.ClipType.UNION, paths1, polyfilltype, polyfilltype);
	//   15   27:aload_3         
	//   16   28:getstatic       #680 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #783 <Method boolean execute(Clipper$ClipType, Paths, Clipper$PolyFillType, Clipper$PolyFillType)>
	//   21   37:pop             
		return paths1;
	//   22   38:aload_2         
	//   23   39:areturn         
	}

	private void swapPositionsInAEL(Edge edge, Edge edge1)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "swapPositionsInAEL");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #880 <String "swapPositionsInAEL">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		if(edge.nextInAEL == edge.prevInAEL || edge1.nextInAEL == edge1.prevInAEL)
	//*   5   14:aload_1         
	//*   6   15:getfield        #358 <Field Edge Edge.nextInAEL>
	//*   7   18:aload_1         
	//*   8   19:getfield        #221 <Field Edge Edge.prevInAEL>
	//*   9   22:if_acmpeq       36
	//*  10   25:aload_2         
	//*  11   26:getfield        #358 <Field Edge Edge.nextInAEL>
	//*  12   29:aload_2         
	//*  13   30:getfield        #221 <Field Edge Edge.prevInAEL>
	//*  14   33:if_acmpne       37
			return;
	//   15   36:return          
		if(edge.nextInAEL == edge1)
	//*  16   37:aload_1         
	//*  17   38:getfield        #358 <Field Edge Edge.nextInAEL>
	//*  18   41:aload_2         
	//*  19   42:if_acmpne       124
		{
			Edge edge2 = edge1.nextInAEL;
	//   20   45:aload_2         
	//   21   46:getfield        #358 <Field Edge Edge.nextInAEL>
	//   22   49:astore_3        
			if(edge2 != null)
	//*  23   50:aload_3         
	//*  24   51:ifnull          59
				edge2.prevInAEL = edge;
	//   25   54:aload_3         
	//   26   55:aload_1         
	//   27   56:putfield        #221 <Field Edge Edge.prevInAEL>
			Edge edge5 = edge.prevInAEL;
	//   28   59:aload_1         
	//   29   60:getfield        #221 <Field Edge Edge.prevInAEL>
	//   30   63:astore          4
			if(edge5 != null)
	//*  31   65:aload           4
	//*  32   67:ifnull          76
				edge5.nextInAEL = edge1;
	//   33   70:aload           4
	//   34   72:aload_2         
	//   35   73:putfield        #358 <Field Edge Edge.nextInAEL>
			edge1.prevInAEL = edge5;
	//   36   76:aload_2         
	//   37   77:aload           4
	//   38   79:putfield        #221 <Field Edge Edge.prevInAEL>
			edge1.nextInAEL = edge;
	//   39   82:aload_2         
	//   40   83:aload_1         
	//   41   84:putfield        #358 <Field Edge Edge.nextInAEL>
			edge.prevInAEL = edge1;
	//   42   87:aload_1         
	//   43   88:aload_2         
	//   44   89:putfield        #221 <Field Edge Edge.prevInAEL>
			edge.nextInAEL = edge2;
	//   45   92:aload_1         
	//   46   93:aload_3         
	//   47   94:putfield        #358 <Field Edge Edge.nextInAEL>
		} else
	//*  48   97:aload_1         
	//*  49   98:getfield        #221 <Field Edge Edge.prevInAEL>
	//*  50  101:ifnonnull       288
	//*  51  104:aload_0         
	//*  52  105:aload_1         
	//*  53  106:putfield        #72  <Field Edge activeEdges>
	//*  54  109:getstatic       #58  <Field Logger LOGGER>
	//*  55  112:ldc1            #2   <Class DefaultClipper>
	//*  56  114:invokevirtual   #50  <Method String Class.getName()>
	//*  57  117:ldc2            #880 <String "swapPositionsInAEL">
	//*  58  120:invokevirtual   #443 <Method void Logger.exiting(String, String)>
	//*  59  123:return          
		if(edge1.nextInAEL == edge)
	//*  60  124:aload_2         
	//*  61  125:getfield        #358 <Field Edge Edge.nextInAEL>
	//*  62  128:aload_1         
	//*  63  129:if_acmpne       187
		{
			Edge edge3 = edge.nextInAEL;
	//   64  132:aload_1         
	//   65  133:getfield        #358 <Field Edge Edge.nextInAEL>
	//   66  136:astore_3        
			if(edge3 != null)
	//*  67  137:aload_3         
	//*  68  138:ifnull          146
				edge3.prevInAEL = edge1;
	//   69  141:aload_3         
	//   70  142:aload_2         
	//   71  143:putfield        #221 <Field Edge Edge.prevInAEL>
			Edge edge6 = edge1.prevInAEL;
	//   72  146:aload_2         
	//   73  147:getfield        #221 <Field Edge Edge.prevInAEL>
	//   74  150:astore          4
			if(edge6 != null)
	//*  75  152:aload           4
	//*  76  154:ifnull          163
				edge6.nextInAEL = edge;
	//   77  157:aload           4
	//   78  159:aload_1         
	//   79  160:putfield        #358 <Field Edge Edge.nextInAEL>
			edge.prevInAEL = edge6;
	//   80  163:aload_1         
	//   81  164:aload           4
	//   82  166:putfield        #221 <Field Edge Edge.prevInAEL>
			edge.nextInAEL = edge1;
	//   83  169:aload_1         
	//   84  170:aload_2         
	//   85  171:putfield        #358 <Field Edge Edge.nextInAEL>
			edge1.prevInAEL = edge;
	//   86  174:aload_2         
	//   87  175:aload_1         
	//   88  176:putfield        #221 <Field Edge Edge.prevInAEL>
			edge1.nextInAEL = edge3;
	//   89  179:aload_2         
	//   90  180:aload_3         
	//   91  181:putfield        #358 <Field Edge Edge.nextInAEL>
		} else
	//*  92  184:goto            97
		{
			Edge edge4 = edge.nextInAEL;
	//   93  187:aload_1         
	//   94  188:getfield        #358 <Field Edge Edge.nextInAEL>
	//   95  191:astore_3        
			Edge edge7 = edge.prevInAEL;
	//   96  192:aload_1         
	//   97  193:getfield        #221 <Field Edge Edge.prevInAEL>
	//   98  196:astore          4
			edge.nextInAEL = edge1.nextInAEL;
	//   99  198:aload_1         
	//  100  199:aload_2         
	//  101  200:getfield        #358 <Field Edge Edge.nextInAEL>
	//  102  203:putfield        #358 <Field Edge Edge.nextInAEL>
			if(edge.nextInAEL != null)
	//* 103  206:aload_1         
	//* 104  207:getfield        #358 <Field Edge Edge.nextInAEL>
	//* 105  210:ifnull          221
				edge.nextInAEL.prevInAEL = edge;
	//  106  213:aload_1         
	//  107  214:getfield        #358 <Field Edge Edge.nextInAEL>
	//  108  217:aload_1         
	//  109  218:putfield        #221 <Field Edge Edge.prevInAEL>
			edge.prevInAEL = edge1.prevInAEL;
	//  110  221:aload_1         
	//  111  222:aload_2         
	//  112  223:getfield        #221 <Field Edge Edge.prevInAEL>
	//  113  226:putfield        #221 <Field Edge Edge.prevInAEL>
			if(edge.prevInAEL != null)
	//* 114  229:aload_1         
	//* 115  230:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 116  233:ifnull          244
				edge.prevInAEL.nextInAEL = edge;
	//  117  236:aload_1         
	//  118  237:getfield        #221 <Field Edge Edge.prevInAEL>
	//  119  240:aload_1         
	//  120  241:putfield        #358 <Field Edge Edge.nextInAEL>
			edge1.nextInAEL = edge4;
	//  121  244:aload_2         
	//  122  245:aload_3         
	//  123  246:putfield        #358 <Field Edge Edge.nextInAEL>
			if(edge1.nextInAEL != null)
	//* 124  249:aload_2         
	//* 125  250:getfield        #358 <Field Edge Edge.nextInAEL>
	//* 126  253:ifnull          264
				edge1.nextInAEL.prevInAEL = edge1;
	//  127  256:aload_2         
	//  128  257:getfield        #358 <Field Edge Edge.nextInAEL>
	//  129  260:aload_2         
	//  130  261:putfield        #221 <Field Edge Edge.prevInAEL>
			edge1.prevInAEL = edge7;
	//  131  264:aload_2         
	//  132  265:aload           4
	//  133  267:putfield        #221 <Field Edge Edge.prevInAEL>
			if(edge1.prevInAEL != null)
	//* 134  270:aload_2         
	//* 135  271:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 136  274:ifnull          97
				edge1.prevInAEL.nextInAEL = edge1;
	//  137  277:aload_2         
	//  138  278:getfield        #221 <Field Edge Edge.prevInAEL>
	//  139  281:aload_2         
	//  140  282:putfield        #358 <Field Edge Edge.nextInAEL>
		}
		if(edge.prevInAEL == null)
			activeEdges = edge;
		else
	//* 141  285:goto            97
		if(edge1.prevInAEL == null)
	//* 142  288:aload_2         
	//* 143  289:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 144  292:ifnonnull       109
			activeEdges = edge1;
	//  145  295:aload_0         
	//  146  296:aload_2         
	//  147  297:putfield        #72  <Field Edge activeEdges>
		LOGGER.exiting(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "swapPositionsInAEL");
	//* 148  300:goto            109
	}

	private void swapPositionsInSEL(Edge edge, Edge edge1)
	{
	//*   0    0:aload_1         
	//*   1    1:getfield        #109 <Field Edge Edge.nextInSEL>
	//*   2    4:ifnonnull       15
	//*   3    7:aload_1         
	//*   4    8:getfield        #115 <Field Edge Edge.prevInSEL>
	//*   5   11:ifnonnull       15
_L2:
		return;
	//    6   14:return          
		if(edge.nextInSEL == null && edge.prevInSEL == null || edge1.nextInSEL == null && edge1.prevInSEL == null) goto _L2; else goto _L1
	//    7   15:aload_2         
	//    8   16:getfield        #109 <Field Edge Edge.nextInSEL>
	//    9   19:ifnonnull       29
	//   10   22:aload_2         
	//   11   23:getfield        #115 <Field Edge Edge.prevInSEL>
	//   12   26:ifnull          14
_L1:
		if(edge.nextInSEL != edge1) goto _L4; else goto _L3
	//   13   29:aload_1         
	//   14   30:getfield        #109 <Field Edge Edge.nextInSEL>
	//   15   33:aload_2         
	//   16   34:if_acmpne       102
_L3:
		Edge edge2 = edge1.nextInSEL;
	//   17   37:aload_2         
	//   18   38:getfield        #109 <Field Edge Edge.nextInSEL>
	//   19   41:astore_3        
		if(edge2 != null)
	//*  20   42:aload_3         
	//*  21   43:ifnull          51
			edge2.prevInSEL = edge;
	//   22   46:aload_3         
	//   23   47:aload_1         
	//   24   48:putfield        #115 <Field Edge Edge.prevInSEL>
		Edge edge5 = edge.prevInSEL;
	//   25   51:aload_1         
	//   26   52:getfield        #115 <Field Edge Edge.prevInSEL>
	//   27   55:astore          4
		if(edge5 != null)
	//*  28   57:aload           4
	//*  29   59:ifnull          68
			edge5.nextInSEL = edge1;
	//   30   62:aload           4
	//   31   64:aload_2         
	//   32   65:putfield        #109 <Field Edge Edge.nextInSEL>
		edge1.prevInSEL = edge5;
	//   33   68:aload_2         
	//   34   69:aload           4
	//   35   71:putfield        #115 <Field Edge Edge.prevInSEL>
		edge1.nextInSEL = edge;
	//   36   74:aload_2         
	//   37   75:aload_1         
	//   38   76:putfield        #109 <Field Edge Edge.nextInSEL>
		edge.prevInSEL = edge1;
	//   39   79:aload_1         
	//   40   80:aload_2         
	//   41   81:putfield        #115 <Field Edge Edge.prevInSEL>
		edge.nextInSEL = edge2;
	//   42   84:aload_1         
	//   43   85:aload_3         
	//   44   86:putfield        #109 <Field Edge Edge.nextInSEL>
_L6:
		if(edge.prevInSEL == null)
	//*  45   89:aload_1         
	//*  46   90:getfield        #115 <Field Edge Edge.prevInSEL>
	//*  47   93:ifnonnull       266
		{
			sortedEdges = edge;
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:putfield        #74  <Field Edge sortedEdges>
			return;
	//   51  101:return          
		}
		break; /* Loop/switch isn't completed */
_L4:
		if(edge1.nextInSEL == edge)
	//*  52  102:aload_2         
	//*  53  103:getfield        #109 <Field Edge Edge.nextInSEL>
	//*  54  106:aload_1         
	//*  55  107:if_acmpne       165
		{
			Edge edge3 = edge.nextInSEL;
	//   56  110:aload_1         
	//   57  111:getfield        #109 <Field Edge Edge.nextInSEL>
	//   58  114:astore_3        
			if(edge3 != null)
	//*  59  115:aload_3         
	//*  60  116:ifnull          124
				edge3.prevInSEL = edge1;
	//   61  119:aload_3         
	//   62  120:aload_2         
	//   63  121:putfield        #115 <Field Edge Edge.prevInSEL>
			Edge edge6 = edge1.prevInSEL;
	//   64  124:aload_2         
	//   65  125:getfield        #115 <Field Edge Edge.prevInSEL>
	//   66  128:astore          4
			if(edge6 != null)
	//*  67  130:aload           4
	//*  68  132:ifnull          141
				edge6.nextInSEL = edge;
	//   69  135:aload           4
	//   70  137:aload_1         
	//   71  138:putfield        #109 <Field Edge Edge.nextInSEL>
			edge.prevInSEL = edge6;
	//   72  141:aload_1         
	//   73  142:aload           4
	//   74  144:putfield        #115 <Field Edge Edge.prevInSEL>
			edge.nextInSEL = edge1;
	//   75  147:aload_1         
	//   76  148:aload_2         
	//   77  149:putfield        #109 <Field Edge Edge.nextInSEL>
			edge1.prevInSEL = edge;
	//   78  152:aload_2         
	//   79  153:aload_1         
	//   80  154:putfield        #115 <Field Edge Edge.prevInSEL>
			edge1.nextInSEL = edge3;
	//   81  157:aload_2         
	//   82  158:aload_3         
	//   83  159:putfield        #109 <Field Edge Edge.nextInSEL>
		} else
	//*  84  162:goto            89
		{
			Edge edge4 = edge.nextInSEL;
	//   85  165:aload_1         
	//   86  166:getfield        #109 <Field Edge Edge.nextInSEL>
	//   87  169:astore_3        
			Edge edge7 = edge.prevInSEL;
	//   88  170:aload_1         
	//   89  171:getfield        #115 <Field Edge Edge.prevInSEL>
	//   90  174:astore          4
			edge.nextInSEL = edge1.nextInSEL;
	//   91  176:aload_1         
	//   92  177:aload_2         
	//   93  178:getfield        #109 <Field Edge Edge.nextInSEL>
	//   94  181:putfield        #109 <Field Edge Edge.nextInSEL>
			if(edge.nextInSEL != null)
	//*  95  184:aload_1         
	//*  96  185:getfield        #109 <Field Edge Edge.nextInSEL>
	//*  97  188:ifnull          199
				edge.nextInSEL.prevInSEL = edge;
	//   98  191:aload_1         
	//   99  192:getfield        #109 <Field Edge Edge.nextInSEL>
	//  100  195:aload_1         
	//  101  196:putfield        #115 <Field Edge Edge.prevInSEL>
			edge.prevInSEL = edge1.prevInSEL;
	//  102  199:aload_1         
	//  103  200:aload_2         
	//  104  201:getfield        #115 <Field Edge Edge.prevInSEL>
	//  105  204:putfield        #115 <Field Edge Edge.prevInSEL>
			if(edge.prevInSEL != null)
	//* 106  207:aload_1         
	//* 107  208:getfield        #115 <Field Edge Edge.prevInSEL>
	//* 108  211:ifnull          222
				edge.prevInSEL.nextInSEL = edge;
	//  109  214:aload_1         
	//  110  215:getfield        #115 <Field Edge Edge.prevInSEL>
	//  111  218:aload_1         
	//  112  219:putfield        #109 <Field Edge Edge.nextInSEL>
			edge1.nextInSEL = edge4;
	//  113  222:aload_2         
	//  114  223:aload_3         
	//  115  224:putfield        #109 <Field Edge Edge.nextInSEL>
			if(edge1.nextInSEL != null)
	//* 116  227:aload_2         
	//* 117  228:getfield        #109 <Field Edge Edge.nextInSEL>
	//* 118  231:ifnull          242
				edge1.nextInSEL.prevInSEL = edge1;
	//  119  234:aload_2         
	//  120  235:getfield        #109 <Field Edge Edge.nextInSEL>
	//  121  238:aload_2         
	//  122  239:putfield        #115 <Field Edge Edge.prevInSEL>
			edge1.prevInSEL = edge7;
	//  123  242:aload_2         
	//  124  243:aload           4
	//  125  245:putfield        #115 <Field Edge Edge.prevInSEL>
			if(edge1.prevInSEL != null)
	//* 126  248:aload_2         
	//* 127  249:getfield        #115 <Field Edge Edge.prevInSEL>
	//* 128  252:ifnull          89
				edge1.prevInSEL.nextInSEL = edge1;
	//  129  255:aload_2         
	//  130  256:getfield        #115 <Field Edge Edge.prevInSEL>
	//  131  259:aload_2         
	//  132  260:putfield        #109 <Field Edge Edge.nextInSEL>
		}
		if(true) goto _L6; else goto _L5
	//  133  263:goto            89
_L5:
		if(edge1.prevInSEL != null) goto _L2; else goto _L7
	//  134  266:aload_2         
	//  135  267:getfield        #115 <Field Edge Edge.prevInSEL>
	//  136  270:ifnonnull       14
_L7:
		sortedEdges = edge1;
	//  137  273:aload_0         
	//  138  274:aload_2         
	//  139  275:putfield        #74  <Field Edge sortedEdges>
		return;
	//  140  278:return          
	}

	private void updateEdgeIntoAEL(Edge aedge[])
	{
		Edge edge2 = aedge[0];
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:astore          4
		if(edge2.nextInLML == null)
	//*   4    5:aload           4
	//*   5    7:getfield        #815 <Field Edge Edge.nextInLML>
	//*   6   10:ifnonnull       24
			throw new IllegalStateException("UpdateEdgeIntoAEL: invalid call");
	//    7   13:new             #467 <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc2            #882 <String "UpdateEdgeIntoAEL: invalid call">
	//   10   20:invokespecial   #471 <Method void IllegalStateException(String)>
	//   11   23:athrow          
		Edge edge = edge2.prevInAEL;
	//   12   24:aload           4
	//   13   26:getfield        #221 <Field Edge Edge.prevInAEL>
	//   14   29:astore_2        
		Edge edge1 = edge2.nextInAEL;
	//   15   30:aload           4
	//   16   32:getfield        #358 <Field Edge Edge.nextInAEL>
	//   17   35:astore_3        
		edge2.nextInLML.outIdx = edge2.outIdx;
	//   18   36:aload           4
	//   19   38:getfield        #815 <Field Edge Edge.nextInLML>
	//   20   41:aload           4
	//   21   43:getfield        #121 <Field int Edge.outIdx>
	//   22   46:putfield        #121 <Field int Edge.outIdx>
		if(edge != null)
	//*  23   49:aload_2         
	//*  24   50:ifnull          182
			edge.nextInAEL = edge2.nextInLML;
	//   25   53:aload_2         
	//   26   54:aload           4
	//   27   56:getfield        #815 <Field Edge Edge.nextInLML>
	//   28   59:putfield        #358 <Field Edge Edge.nextInAEL>
		else
	//*  29   62:aload_3         
	//*  30   63:ifnull          75
	//*  31   66:aload_3         
	//*  32   67:aload           4
	//*  33   69:getfield        #815 <Field Edge Edge.nextInLML>
	//*  34   72:putfield        #221 <Field Edge Edge.prevInAEL>
	//*  35   75:aload           4
	//*  36   77:getfield        #815 <Field Edge Edge.nextInLML>
	//*  37   80:aload           4
	//*  38   82:getfield        #133 <Field Edge$Side Edge.side>
	//*  39   85:putfield        #133 <Field Edge$Side Edge.side>
	//*  40   88:aload           4
	//*  41   90:getfield        #815 <Field Edge Edge.nextInLML>
	//*  42   93:aload           4
	//*  43   95:getfield        #200 <Field int Edge.windDelta>
	//*  44   98:putfield        #200 <Field int Edge.windDelta>
	//*  45  101:aload           4
	//*  46  103:getfield        #815 <Field Edge Edge.nextInLML>
	//*  47  106:aload           4
	//*  48  108:getfield        #652 <Field int Edge.windCnt>
	//*  49  111:putfield        #652 <Field int Edge.windCnt>
	//*  50  114:aload           4
	//*  51  116:getfield        #815 <Field Edge Edge.nextInLML>
	//*  52  119:aload           4
	//*  53  121:getfield        #655 <Field int Edge.windCnt2>
	//*  54  124:putfield        #655 <Field int Edge.windCnt2>
	//*  55  127:aload           4
	//*  56  129:getfield        #815 <Field Edge Edge.nextInLML>
	//*  57  132:astore          4
	//*  58  134:aload_1         
	//*  59  135:iconst_0        
	//*  60  136:aload           4
	//*  61  138:aastore         
	//*  62  139:aload           4
	//*  63  141:aload           4
	//*  64  143:invokevirtual   #575 <Method Point$LongPoint Edge.getBot()>
	//*  65  146:invokevirtual   #885 <Method void Edge.setCurrent(Point$LongPoint)>
	//*  66  149:aload           4
	//*  67  151:aload_2         
	//*  68  152:putfield        #221 <Field Edge Edge.prevInAEL>
	//*  69  155:aload           4
	//*  70  157:aload_3         
	//*  71  158:putfield        #358 <Field Edge Edge.nextInAEL>
	//*  72  161:aload           4
	//*  73  163:invokevirtual   #211 <Method boolean Edge.isHorizontal()>
	//*  74  166:ifne            181
	//*  75  169:aload_0         
	//*  76  170:aload           4
	//*  77  172:invokevirtual   #242 <Method Point$LongPoint Edge.getTop()>
	//*  78  175:invokevirtual   #227 <Method long Point$LongPoint.getY()>
	//*  79  178:invokespecial   #649 <Method void insertScanbeam(long)>
	//*  80  181:return          
			activeEdges = edge2.nextInLML;
	//   81  182:aload_0         
	//   82  183:aload           4
	//   83  185:getfield        #815 <Field Edge Edge.nextInLML>
	//   84  188:putfield        #72  <Field Edge activeEdges>
		if(edge1 != null)
			edge1.prevInAEL = edge2.nextInLML;
		edge2.nextInLML.side = edge2.side;
		edge2.nextInLML.windDelta = edge2.windDelta;
		edge2.nextInLML.windCnt = edge2.windCnt;
		edge2.nextInLML.windCnt2 = edge2.windCnt2;
		edge2 = edge2.nextInLML;
		aedge[0] = edge2;
		edge2.setCurrent(edge2.getBot());
		edge2.prevInAEL = edge;
		edge2.nextInAEL = edge1;
		if(!edge2.isHorizontal())
			insertScanbeam(edge2.getTop().getY());
	//*  85  191:goto            62
	}

	private void updateOutPtIdxs(Path.OutRec outrec)
	{
		Path.OutPt outpt = outrec.getPoints();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//    2    4:astore_2        
		Path.OutPt outpt1;
		do
		{
			outpt.idx = outrec.Idx;
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:getfield        #256 <Field int Path$OutRec.Idx>
	//    6   10:putfield        #259 <Field int Path$OutPt.idx>
			outpt1 = outpt.prev;
	//    7   13:aload_2         
	//    8   14:getfield        #147 <Field Path$OutPt Path$OutPt.prev>
	//    9   17:astore_3        
			outpt = outpt1;
	//   10   18:aload_3         
	//   11   19:astore_2        
		} while(outpt1 != outrec.getPoints());
	//   12   20:aload_3         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #274 <Method Path$OutPt Path$OutRec.getPoints()>
	//   15   25:if_acmpne       5
	//   16   28:return          
	}

	private void updateWindingCount(Edge edge)
	{
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName(), "updateWindingCount");
	//    0    0:getstatic       #58  <Field Logger LOGGER>
	//    1    3:ldc1            #2   <Class DefaultClipper>
	//    2    5:invokevirtual   #50  <Method String Class.getName()>
	//    3    8:ldc2            #886 <String "updateWindingCount">
	//    4   11:invokevirtual   #169 <Method void Logger.entering(String, String)>
		Edge edge1;
		for(edge1 = edge.prevInAEL; edge1 != null && (edge1.polyTyp != edge.polyTyp || edge1.windDelta == 0); edge1 = edge1.prevInAEL);
	//    5   14:aload_1         
	//    6   15:getfield        #221 <Field Edge Edge.prevInAEL>
	//    7   18:astore          4
	//    8   20:aload           4
	//    9   22:ifnull          55
	//   10   25:aload           4
	//   11   27:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//   12   30:aload_1         
	//   13   31:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//   14   34:if_acmpne       45
	//   15   37:aload           4
	//   16   39:getfield        #200 <Field int Edge.windDelta>
	//   17   42:ifne            55
	//   18   45:aload           4
	//   19   47:getfield        #221 <Field Edge Edge.prevInAEL>
	//   20   50:astore          4
	//*  21   52:goto            20
		int i;
		if(edge1 == null)
	//*  22   55:aload           4
	//*  23   57:ifnonnull       150
		{
			if(edge.windDelta == 0)
	//*  24   60:aload_1         
	//*  25   61:getfield        #200 <Field int Edge.windDelta>
	//*  26   64:ifne            142
				i = 1;
	//   27   67:iconst_1        
	//   28   68:istore_2        
			else
	//*  29   69:aload_1         
	//*  30   70:iload_2         
	//*  31   71:putfield        #652 <Field int Edge.windCnt>
	//*  32   74:aload_1         
	//*  33   75:iconst_0        
	//*  34   76:putfield        #655 <Field int Edge.windCnt2>
	//*  35   79:aload_0         
	//*  36   80:getfield        #72  <Field Edge activeEdges>
	//*  37   83:astore          4
	//*  38   85:aload           4
	//*  39   87:astore          5
	//*  40   89:aload_1         
	//*  41   90:aload_0         
	//*  42   91:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//*  43   94:aload_0         
	//*  44   95:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//*  45   98:invokevirtual   #889 <Method boolean Edge.isEvenOddAltFillType(Clipper$PolyFillType, Clipper$PolyFillType)>
	//*  46  101:ifeq            519
	//*  47  104:aload           4
	//*  48  106:aload_1         
	//*  49  107:if_acmpeq       549
	//*  50  110:aload           4
	//*  51  112:getfield        #200 <Field int Edge.windDelta>
	//*  52  115:ifeq            132
	//*  53  118:aload_1         
	//*  54  119:getfield        #655 <Field int Edge.windCnt2>
	//*  55  122:ifne            514
	//*  56  125:iconst_1        
	//*  57  126:istore_2        
	//*  58  127:aload_1         
	//*  59  128:iload_2         
	//*  60  129:putfield        #655 <Field int Edge.windCnt2>
	//*  61  132:aload           4
	//*  62  134:getfield        #358 <Field Edge Edge.nextInAEL>
	//*  63  137:astore          4
	//*  64  139:goto            104
				i = edge.windDelta;
	//   65  142:aload_1         
	//   66  143:getfield        #200 <Field int Edge.windDelta>
	//   67  146:istore_2        
			edge.windCnt = i;
			edge.windCnt2 = 0;
			edge1 = activeEdges;
		} else
	//*  68  147:goto            69
		if(edge.windDelta == 0 && clipType != Clipper.ClipType.UNION)
	//*  69  150:aload_1         
	//*  70  151:getfield        #200 <Field int Edge.windDelta>
	//*  71  154:ifne            191
	//*  72  157:aload_0         
	//*  73  158:getfield        #635 <Field Clipper$ClipType clipType>
	//*  74  161:getstatic       #680 <Field Clipper$ClipType Clipper$ClipType.UNION>
	//*  75  164:if_acmpeq       191
		{
			edge.windCnt = 1;
	//   76  167:aload_1         
	//   77  168:iconst_1        
	//   78  169:putfield        #652 <Field int Edge.windCnt>
			edge.windCnt2 = edge1.windCnt2;
	//   79  172:aload_1         
	//   80  173:aload           4
	//   81  175:getfield        #655 <Field int Edge.windCnt2>
	//   82  178:putfield        #655 <Field int Edge.windCnt2>
			edge1 = edge1.nextInAEL;
	//   83  181:aload           4
	//   84  183:getfield        #358 <Field Edge Edge.nextInAEL>
	//   85  186:astore          4
		} else
	//*  86  188:goto            85
		if(edge.isEvenOddFillType(clipFillType, subjFillType))
	//*  87  191:aload_1         
	//*  88  192:aload_0         
	//*  89  193:getfield        #631 <Field Clipper$PolyFillType clipFillType>
	//*  90  196:aload_0         
	//*  91  197:getfield        #633 <Field Clipper$PolyFillType subjFillType>
	//*  92  200:invokevirtual   #688 <Method boolean Edge.isEvenOddFillType(Clipper$PolyFillType, Clipper$PolyFillType)>
	//*  93  203:ifeq            321
		{
			if(edge.windDelta == 0)
	//*  94  206:aload_1         
	//*  95  207:getfield        #200 <Field int Edge.windDelta>
	//*  96  210:ifne            310
			{
				boolean flag = true;
	//   97  213:iconst_1        
	//   98  214:istore_3        
				edge2 = edge1.prevInAEL;
	//   99  215:aload           4
	//  100  217:getfield        #221 <Field Edge Edge.prevInAEL>
	//  101  220:astore          5
				while(edge2 != null) 
	//* 102  222:aload           5
	//* 103  224:ifnull          275
				{
					i = ((int) (flag));
	//  104  227:iload_3         
	//  105  228:istore_2        
					if(edge2.polyTyp == edge1.polyTyp)
	//* 106  229:aload           5
	//* 107  231:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 108  234:aload           4
	//* 109  236:getfield        #675 <Field Clipper$PolyType Edge.polyTyp>
	//* 110  239:if_acmpne       258
					{
						i = ((int) (flag));
	//  111  242:iload_3         
	//  112  243:istore_2        
						if(edge2.windDelta != 0)
	//* 113  244:aload           5
	//* 114  246:getfield        #200 <Field int Edge.windDelta>
	//* 115  249:ifeq            258
							if(!flag)
	//* 116  252:iload_3         
	//* 117  253:ifne            270
								i = 1;
	//  118  256:iconst_1        
	//  119  257:istore_2        
							else
	//* 120  258:aload           5
	//* 121  260:getfield        #221 <Field Edge Edge.prevInAEL>
	//* 122  263:astore          5
	//* 123  265:iload_2         
	//* 124  266:istore_3        
	//* 125  267:goto            222
								i = 0;
	//  126  270:iconst_0        
	//  127  271:istore_2        
					}
					edge2 = edge2.prevInAEL;
					flag = ((boolean) (i));
				}
	//* 128  272:goto            258
				if(flag)
	//* 129  275:iload_3         
	//* 130  276:ifeq            305
					i = 0;
	//  131  279:iconst_0        
	//  132  280:istore_2        
				else
	//* 133  281:aload_1         
	//* 134  282:iload_2         
	//* 135  283:putfield        #652 <Field int Edge.windCnt>
	//* 136  286:aload_1         
	//* 137  287:aload           4
	//* 138  289:getfield        #655 <Field int Edge.windCnt2>
	//* 139  292:putfield        #655 <Field int Edge.windCnt2>
	//* 140  295:aload           4
	//* 141  297:getfield        #358 <Field Edge Edge.nextInAEL>
	//* 142  300:astore          4
	//* 143  302:goto            85
					i = 1;
	//  144  305:iconst_1        
	//  145  306:istore_2        
				edge.windCnt = i;
			} else
	//* 146  307:goto            281
			{
				edge.windCnt = edge.windDelta;
	//  147  310:aload_1         
	//  148  311:aload_1         
	//  149  312:getfield        #200 <Field int Edge.windDelta>
	//  150  315:putfield        #652 <Field int Edge.windCnt>
			}
			edge.windCnt2 = edge1.windCnt2;
			edge1 = edge1.nextInAEL;
		} else
	//* 151  318:goto            286
		{
			if(edge1.windCnt * edge1.windDelta < 0)
	//* 152  321:aload           4
	//* 153  323:getfield        #652 <Field int Edge.windCnt>
	//* 154  326:aload           4
	//* 155  328:getfield        #200 <Field int Edge.windDelta>
	//* 156  331:imul            
	//* 157  332:ifge            430
			{
				if(Math.abs(edge1.windCnt) > 1)
	//* 158  335:aload           4
	//* 159  337:getfield        #652 <Field int Edge.windCnt>
	//* 160  340:invokestatic    #684 <Method int Math.abs(int)>
	//* 161  343:iconst_1        
	//* 162  344:icmple          405
				{
					if(edge1.windDelta * edge.windDelta < 0)
	//* 163  347:aload           4
	//* 164  349:getfield        #200 <Field int Edge.windDelta>
	//* 165  352:aload_1         
	//* 166  353:getfield        #200 <Field int Edge.windDelta>
	//* 167  356:imul            
	//* 168  357:ifge            388
						edge.windCnt = edge1.windCnt;
	//  169  360:aload_1         
	//  170  361:aload           4
	//  171  363:getfield        #652 <Field int Edge.windCnt>
	//  172  366:putfield        #652 <Field int Edge.windCnt>
					else
	//* 173  369:aload_1         
	//* 174  370:aload           4
	//* 175  372:getfield        #655 <Field int Edge.windCnt2>
	//* 176  375:putfield        #655 <Field int Edge.windCnt2>
	//* 177  378:aload           4
	//* 178  380:getfield        #358 <Field Edge Edge.nextInAEL>
	//* 179  383:astore          4
	//* 180  385:goto            85
						edge.windCnt = edge1.windCnt + edge.windDelta;
	//  181  388:aload_1         
	//  182  389:aload           4
	//  183  391:getfield        #652 <Field int Edge.windCnt>
	//  184  394:aload_1         
	//  185  395:getfield        #200 <Field int Edge.windDelta>
	//  186  398:iadd            
	//  187  399:putfield        #652 <Field int Edge.windCnt>
				} else
	//* 188  402:goto            369
				{
					if(edge.windDelta == 0)
	//* 189  405:aload_1         
	//* 190  406:getfield        #200 <Field int Edge.windDelta>
	//* 191  409:ifne            422
						i = 1;
	//  192  412:iconst_1        
	//  193  413:istore_2        
					else
	//* 194  414:aload_1         
	//* 195  415:iload_2         
	//* 196  416:putfield        #652 <Field int Edge.windCnt>
	//* 197  419:goto            369
						i = edge.windDelta;
	//  198  422:aload_1         
	//  199  423:getfield        #200 <Field int Edge.windDelta>
	//  200  426:istore_2        
					edge.windCnt = i;
				}
			} else
	//* 201  427:goto            414
			if(edge.windDelta == 0)
	//* 202  430:aload_1         
	//* 203  431:getfield        #200 <Field int Edge.windDelta>
	//* 204  434:ifne            472
			{
				if(edge1.windCnt < 0)
	//* 205  437:aload           4
	//* 206  439:getfield        #652 <Field int Edge.windCnt>
	//* 207  442:ifge            461
					i = edge1.windCnt - 1;
	//  208  445:aload           4
	//  209  447:getfield        #652 <Field int Edge.windCnt>
	//  210  450:iconst_1        
	//  211  451:isub            
	//  212  452:istore_2        
				else
	//* 213  453:aload_1         
	//* 214  454:iload_2         
	//* 215  455:putfield        #652 <Field int Edge.windCnt>
	//* 216  458:goto            369
					i = edge1.windCnt + 1;
	//  217  461:aload           4
	//  218  463:getfield        #652 <Field int Edge.windCnt>
	//  219  466:iconst_1        
	//  220  467:iadd            
	//  221  468:istore_2        
				edge.windCnt = i;
			} else
	//* 222  469:goto            453
			if(edge1.windDelta * edge.windDelta < 0)
	//* 223  472:aload           4
	//* 224  474:getfield        #200 <Field int Edge.windDelta>
	//* 225  477:aload_1         
	//* 226  478:getfield        #200 <Field int Edge.windDelta>
	//* 227  481:imul            
	//* 228  482:ifge            497
				edge.windCnt = edge1.windCnt;
	//  229  485:aload_1         
	//  230  486:aload           4
	//  231  488:getfield        #652 <Field int Edge.windCnt>
	//  232  491:putfield        #652 <Field int Edge.windCnt>
			else
	//* 233  494:goto            369
				edge.windCnt = edge1.windCnt + edge.windDelta;
	//  234  497:aload_1         
	//  235  498:aload           4
	//  236  500:getfield        #652 <Field int Edge.windCnt>
	//  237  503:aload_1         
	//  238  504:getfield        #200 <Field int Edge.windDelta>
	//  239  507:iadd            
	//  240  508:putfield        #652 <Field int Edge.windCnt>
			edge.windCnt2 = edge1.windCnt2;
			edge1 = edge1.nextInAEL;
		}
		do
		{
			Edge edge2 = edge1;
			if(edge.isEvenOddAltFillType(clipFillType, subjFillType))
				while(edge1 != edge) 
				{
					if(edge1.windDelta != 0)
					{
						if(edge.windCnt2 == 0)
							i = 1;
						else
	//* 241  511:goto            369
							i = 0;
	//  242  514:iconst_0        
	//  243  515:istore_2        
						edge.windCnt2 = i;
					}
					edge1 = edge1.nextInAEL;
				}
			else
	//* 244  516:goto            127
				for(; edge2 != edge; edge2 = edge2.nextInAEL)
	//* 245  519:aload           5
	//* 246  521:aload_1         
	//* 247  522:if_acmpeq       549
					edge.windCnt2 = edge.windCnt2 + edge2.windDelta;
	//  248  525:aload_1         
	//  249  526:aload_1         
	//  250  527:getfield        #655 <Field int Edge.windCnt2>
	//  251  530:aload           5
	//  252  532:getfield        #200 <Field int Edge.windDelta>
	//  253  535:iadd            
	//  254  536:putfield        #655 <Field int Edge.windCnt2>

	//  255  539:aload           5
	//  256  541:getfield        #358 <Field Edge Edge.nextInAEL>
	//  257  544:astore          5
	//* 258  546:goto            519
			return;
	//  259  549:return          
		} while(true);
	}

	public boolean execute(Clipper.ClipType cliptype, Paths paths)
	{
		return execute(cliptype, paths, Clipper.PolyFillType.EVEN_ODD);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #871 <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
	//    4    6:invokevirtual   #893 <Method boolean execute(Clipper$ClipType, Paths, Clipper$PolyFillType)>
	//    5    9:ireturn         
	}

	public boolean execute(Clipper.ClipType cliptype, Paths paths, Clipper.PolyFillType polyfilltype)
	{
		return execute(cliptype, paths, polyfilltype, polyfilltype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #783 <Method boolean execute(Clipper$ClipType, Paths, Clipper$PolyFillType, Clipper$PolyFillType)>
	//    6    8:ireturn         
	}

	public boolean execute(Clipper.ClipType cliptype, Paths paths, Clipper.PolyFillType polyfilltype, Clipper.PolyFillType polyfilltype1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(hasOpenPaths)
	//*   2    2:aload_0         
	//*   3    3:getfield        #896 <Field boolean hasOpenPaths>
	//*   4    6:ifeq            25
			throw new IllegalStateException("Error: PolyTree struct is needed for open path clipping.");
	//    5    9:new             #467 <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc2            #898 <String "Error: PolyTree struct is needed for open path clipping.">
	//    8   16:invokespecial   #471 <Method void IllegalStateException(String)>
	//    9   19:athrow          
		break MISSING_BLOCK_LABEL_25;
		cliptype;
	//   10   20:astore_1        
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		throw cliptype;
	//   13   23:aload_1         
	//   14   24:athrow          
		paths.clear();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #393 <Method void Paths.clear()>
		subjFillType = polyfilltype;
	//   17   29:aload_0         
	//   18   30:aload_3         
	//   19   31:putfield        #633 <Field Clipper$PolyFillType subjFillType>
		clipFillType = polyfilltype1;
	//   20   34:aload_0         
	//   21   35:aload           4
	//   22   37:putfield        #631 <Field Clipper$PolyFillType clipFillType>
		clipType = cliptype;
	//   23   40:aload_0         
	//   24   41:aload_1         
	//   25   42:putfield        #635 <Field Clipper$ClipType clipType>
		usingPolyTree = false;
	//   26   45:aload_0         
	//   27   46:iconst_0        
	//   28   47:putfield        #87  <Field boolean usingPolyTree>
		boolean flag = executeInternal();
	//   29   50:aload_0         
	//   30   51:invokespecial   #900 <Method boolean executeInternal()>
	//   31   54:istore          5
		if(!flag)
			break MISSING_BLOCK_LABEL_66;
	//   32   56:iload           5
	//   33   58:ifeq            66
		buildResult(paths);
	//   34   61:aload_0         
	//   35   62:aload_2         
	//   36   63:invokespecial   #902 <Method void buildResult(Paths)>
		polyOuts.clear();
	//   37   66:aload_0         
	//   38   67:getfield        #89  <Field List polyOuts>
	//   39   70:invokeinterface #496 <Method void List.clear()>
		this;
	//   40   75:aload_0         
		JVM INSTR monitorexit ;
	//   41   76:monitorexit     
		return flag;
	//   42   77:iload           5
	//   43   79:ireturn         
		cliptype;
	//   44   80:astore_1        
		polyOuts.clear();
	//   45   81:aload_0         
	//   46   82:getfield        #89  <Field List polyOuts>
	//   47   85:invokeinterface #496 <Method void List.clear()>
		throw cliptype;
	//   48   90:aload_1         
	//   49   91:athrow          
	}

	public boolean execute(Clipper.ClipType cliptype, PolyTree polytree)
	{
		return execute(cliptype, polytree, Clipper.PolyFillType.EVEN_ODD);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #871 <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
	//    4    6:invokevirtual   #906 <Method boolean execute(Clipper$ClipType, PolyTree, Clipper$PolyFillType)>
	//    5    9:ireturn         
	}

	public boolean execute(Clipper.ClipType cliptype, PolyTree polytree, Clipper.PolyFillType polyfilltype)
	{
		return execute(cliptype, polytree, polyfilltype, polyfilltype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #909 <Method boolean execute(Clipper$ClipType, PolyTree, Clipper$PolyFillType, Clipper$PolyFillType)>
	//    6    8:ireturn         
	}

	public boolean execute(Clipper.ClipType cliptype, PolyTree polytree, Clipper.PolyFillType polyfilltype, Clipper.PolyFillType polyfilltype1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		subjFillType = polyfilltype;
	//    2    2:aload_0         
	//    3    3:aload_3         
	//    4    4:putfield        #633 <Field Clipper$PolyFillType subjFillType>
		clipFillType = polyfilltype1;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #631 <Field Clipper$PolyFillType clipFillType>
		clipType = cliptype;
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:putfield        #635 <Field Clipper$ClipType clipType>
		usingPolyTree = true;
	//   11   18:aload_0         
	//   12   19:iconst_1        
	//   13   20:putfield        #87  <Field boolean usingPolyTree>
		boolean flag = executeInternal();
	//   14   23:aload_0         
	//   15   24:invokespecial   #900 <Method boolean executeInternal()>
	//   16   27:istore          5
		if(!flag)
			break MISSING_BLOCK_LABEL_39;
	//   17   29:iload           5
	//   18   31:ifeq            39
		buildResult2(polytree);
	//   19   34:aload_0         
	//   20   35:aload_2         
	//   21   36:invokespecial   #911 <Method void buildResult2(PolyTree)>
		polyOuts.clear();
	//   22   39:aload_0         
	//   23   40:getfield        #89  <Field List polyOuts>
	//   24   43:invokeinterface #496 <Method void List.clear()>
		this;
	//   25   48:aload_0         
		JVM INSTR monitorexit ;
	//   26   49:monitorexit     
		return flag;
	//   27   50:iload           5
	//   28   52:ireturn         
		cliptype;
	//   29   53:astore_1        
		polyOuts.clear();
	//   30   54:aload_0         
	//   31   55:getfield        #89  <Field List polyOuts>
	//   32   58:invokeinterface #496 <Method void List.clear()>
		throw cliptype;
	//   33   63:aload_1         
	//   34   64:athrow          
		cliptype;
	//   35   65:astore_1        
		this;
	//   36   66:aload_0         
		JVM INSTR monitorexit ;
	//   37   67:monitorexit     
		throw cliptype;
	//   38   68:aload_1         
	//   39   69:athrow          
	}

	protected void reset()
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #912 <Method void ClipperBase.reset()>
		scanbeam = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #68  <Field ClipperBase$Scanbeam scanbeam>
		maxima = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #70  <Field Path$Maxima maxima>
		activeEdges = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #72  <Field Edge activeEdges>
		sortedEdges = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #74  <Field Edge sortedEdges>
		for(ClipperBase.LocalMinima localminima = minimaList; localminima != null; localminima = localminima.next)
	//*  14   24:aload_0         
	//*  15   25:getfield        #915 <Field ClipperBase$LocalMinima minimaList>
	//*  16   28:astore_1        
	//*  17   29:aload_1         
	//*  18   30:ifnull          49
			insertScanbeam(localminima.y);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:getfield        #615 <Field long ClipperBase$LocalMinima.y>
	//   22   38:invokespecial   #649 <Method void insertScanbeam(long)>

	//   23   41:aload_1         
	//   24   42:getfield        #917 <Field ClipperBase$LocalMinima ClipperBase$LocalMinima.next>
	//   25   45:astore_1        
	//*  26   46:goto            29
	//   27   49:return          
	}

	private static final Logger LOGGER = Logger.getLogger(((Class) (com/itextpdf/text/pdf/parser/clipper/DefaultClipper)).getName());
	private Edge activeEdges;
	private Clipper.PolyFillType clipFillType;
	private Clipper.ClipType clipType;
	private final List ghostJoins;
	private final List intersectList;
	private final Comparator intersectNodeComparer;
	private final List joins;
	private Path.Maxima maxima;
	protected final List polyOuts;
	private final boolean reverseSolution;
	private ClipperBase.Scanbeam scanbeam;
	private Edge sortedEdges;
	private final boolean strictlySimple;
	private Clipper.PolyFillType subjFillType;
	private boolean usingPolyTree;
	public Clipper.ZFillCallback zFillFunction;

	static 
	{
	//    0    0:ldc1            #2   <Class DefaultClipper>
	//    1    2:invokevirtual   #50  <Method String Class.getName()>
	//    2    5:invokestatic    #56  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #58  <Field Logger LOGGER>
	//*   4   11:return          
	}
}
