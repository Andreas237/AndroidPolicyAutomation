// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			PolyTree, PolyNode, Path, LongRect

public class Paths extends ArrayList
{

	public Paths()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ArrayList()>
	//    2    4:return          
	}

	public Paths(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #19  <Method void ArrayList(int)>
	//    3    5:return          
	}

	public static Paths closedPathsFromPolyTree(PolyTree polytree)
	{
		Paths paths = new Paths();
	//    0    0:new             #2   <Class Paths>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Paths()>
	//    3    7:astore_1        
		paths.addPolyNode(((PolyNode) (polytree)), PolyNode.NodeType.CLOSED);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getstatic       #28  <Field PolyNode$NodeType PolyNode$NodeType.CLOSED>
	//    7   13:invokevirtual   #32  <Method void addPolyNode(PolyNode, PolyNode$NodeType)>
		return paths;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public static Paths makePolyTreeToPaths(PolyTree polytree)
	{
		Paths paths = new Paths();
	//    0    0:new             #2   <Class Paths>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Paths()>
	//    3    7:astore_1        
		paths.addPolyNode(((PolyNode) (polytree)), PolyNode.NodeType.ANY);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getstatic       #36  <Field PolyNode$NodeType PolyNode$NodeType.ANY>
	//    7   13:invokevirtual   #32  <Method void addPolyNode(PolyNode, PolyNode$NodeType)>
		return paths;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public static Paths openPathsFromPolyTree(PolyTree polytree)
	{
		Paths paths = new Paths();
	//    0    0:new             #2   <Class Paths>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Paths()>
	//    3    7:astore_1        
		polytree = ((PolyTree) (polytree.getChilds().iterator()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #43  <Method List PolyTree.getChilds()>
	//    6   12:invokeinterface #49  <Method Iterator List.iterator()>
	//    7   17:astore_0        
		do
		{
			if(!((Iterator) (polytree)).hasNext())
				break;
	//    8   18:aload_0         
	//    9   19:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            56
			PolyNode polynode = (PolyNode)((Iterator) (polytree)).next();
	//   11   27:aload_0         
	//   12   28:invokeinterface #59  <Method Object Iterator.next()>
	//   13   33:checkcast       #61  <Class PolyNode>
	//   14   36:astore_2        
			if(polynode.isOpen())
	//*  15   37:aload_2         
	//*  16   38:invokevirtual   #64  <Method boolean PolyNode.isOpen()>
	//*  17   41:ifeq            18
				paths.add(((Object) (polynode.getPolygon())));
	//   18   44:aload_1         
	//   19   45:aload_2         
	//   20   46:invokevirtual   #68  <Method Path PolyNode.getPolygon()>
	//   21   49:invokevirtual   #72  <Method boolean add(Object)>
	//   22   52:pop             
		} while(true);
	//   23   53:goto            18
		return paths;
	//   24   56:aload_1         
	//   25   57:areturn         
	}

	public void addPolyNode(PolyNode polynode, PolyNode.NodeType nodetype)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		static class _cls1
		{

			static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType[];

			static 
			{
				$SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType = new int[PolyNode.NodeType.values().length];
			//    0    0:invokestatic    #18  <Method PolyNode$NodeType[] PolyNode$NodeType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType>
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType[PolyNode.NodeType.OPEN.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType>
			//    5   12:getstatic       #24  <Field PolyNode$NodeType PolyNode$NodeType.OPEN>
			//    6   15:invokevirtual   #28  <Method int PolyNode$NodeType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType>
			//*  10   23:getstatic       #31  <Field PolyNode$NodeType PolyNode$NodeType.CLOSED>
			//*  11   26:invokevirtual   #28  <Method int PolyNode$NodeType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
			//*  15   32:astore_0        
			//*  16   33:return          
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   34:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType[PolyNode.NodeType.CLOSED.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  18   35:goto            20
			}
		}

		switch(_cls1..SwitchMap.com.itextpdf.text.pdf.parser.clipper.PolyNode.NodeType[nodetype.ordinal()])
	//*   2    2:getstatic       #76  <Field int[] Paths$1.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType>
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #80  <Method int PolyNode$NodeType.ordinal()>
	//*   5    9:iaload          
		{
	//*   6   10:tableswitch     1 2: default 32
	//	               1 108
	//	               2 91
	//*   7   32:aload_1         
	//*   8   33:invokevirtual   #68  <Method Path PolyNode.getPolygon()>
	//*   9   36:invokevirtual   #85  <Method int Path.size()>
	//*  10   39:ifle            55
	//*  11   42:iload_3         
	//*  12   43:ifeq            55
	//*  13   46:aload_0         
	//*  14   47:aload_1         
	//*  15   48:invokevirtual   #68  <Method Path PolyNode.getPolygon()>
	//*  16   51:invokevirtual   #72  <Method boolean add(Object)>
	//*  17   54:pop             
	//*  18   55:aload_1         
	//*  19   56:invokevirtual   #86  <Method List PolyNode.getChilds()>
	//*  20   59:invokeinterface #49  <Method Iterator List.iterator()>
	//*  21   64:astore_1        
	//*  22   65:aload_1         
	//*  23   66:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//*  24   71:ifeq            108
	//*  25   74:aload_0         
	//*  26   75:aload_1         
	//*  27   76:invokeinterface #59  <Method Object Iterator.next()>
	//*  28   81:checkcast       #61  <Class PolyNode>
	//*  29   84:aload_2         
	//*  30   85:invokevirtual   #32  <Method void addPolyNode(PolyNode, PolyNode$NodeType)>
	//*  31   88:goto            65
		case 2: // '\002'
			if(!polynode.isOpen())
	//*  32   91:aload_1         
	//*  33   92:invokevirtual   #64  <Method boolean PolyNode.isOpen()>
	//*  34   95:ifne            103
				flag = true;
	//   35   98:iconst_1        
	//   36   99:istore_3        
			else
	//*  37  100:goto            32
				flag = false;
	//   38  103:iconst_0        
	//   39  104:istore_3        
			// fall through

		default:
			if(polynode.getPolygon().size() > 0 && flag)
				add(((Object) (polynode.getPolygon())));
			for(polynode = ((PolyNode) (polynode.getChilds().iterator())); ((Iterator) (polynode)).hasNext(); addPolyNode((PolyNode)((Iterator) (polynode)).next(), nodetype));
			// fall through

	//*  40  105:goto            100
		case 1: // '\001'
			return;
	//   41  108:return          
		}
	}

	public Paths cleanPolygons()
	{
		return cleanPolygons(1.415D);
	//    0    0:aload_0         
	//    1    1:ldc2w           #89  <Double 1.415D>
	//    2    4:invokevirtual   #93  <Method Paths cleanPolygons(double)>
	//    3    7:areturn         
	}

	public Paths cleanPolygons(double d)
	{
		Paths paths = new Paths(size());
	//    0    0:new             #2   <Class Paths>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #94  <Method int size()>
	//    4    8:invokespecial   #95  <Method void Paths(int)>
	//    5   11:astore          4
		for(int i = 0; i < size(); i++)
	//*   6   13:iconst_0        
	//*   7   14:istore_3        
	//*   8   15:iload_3         
	//*   9   16:aload_0         
	//*  10   17:invokevirtual   #94  <Method int size()>
	//*  11   20:icmpge          48
			paths.add(((Object) (((Path)get(i)).cleanPolygon(d))));
	//   12   23:aload           4
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:invokevirtual   #99  <Method Object get(int)>
	//   16   30:checkcast       #82  <Class Path>
	//   17   33:dload_1         
	//   18   34:invokevirtual   #103 <Method Path Path.cleanPolygon(double)>
	//   19   37:invokevirtual   #72  <Method boolean add(Object)>
	//   20   40:pop             

	//   21   41:iload_3         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_3        
	//*  25   45:goto            15
		return paths;
	//   26   48:aload           4
	//   27   50:areturn         
	}

	public LongRect getBounds()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int k = size();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #94  <Method int size()>
	//    4    6:istore_3        
		LongRect longrect = new LongRect();
	//    5    7:new             #107 <Class LongRect>
	//    6   10:dup             
	//    7   11:invokespecial   #108 <Method void LongRect()>
	//    8   14:astore          4
		for(; i < k && ((Path)get(i)).isEmpty(); i++);
	//    9   16:iload_1         
	//   10   17:iload_3         
	//   11   18:icmpge          42
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:invokevirtual   #99  <Method Object get(int)>
	//   15   26:checkcast       #82  <Class Path>
	//   16   29:invokevirtual   #111 <Method boolean Path.isEmpty()>
	//   17   32:ifeq            42
	//   18   35:iload_1         
	//   19   36:iconst_1        
	//   20   37:iadd            
	//   21   38:istore_1        
	//*  22   39:goto            16
		if(i != k)
	//*  23   42:iload_1         
	//*  24   43:iload_3         
	//*  25   44:icmpne          50
	//*  26   47:aload           4
	//*  27   49:areturn         
		{
			longrect.left = ((Point.LongPoint)((Path)get(i)).get(0)).getX();
	//   28   50:aload           4
	//   29   52:aload_0         
	//   30   53:iload_1         
	//   31   54:invokevirtual   #99  <Method Object get(int)>
	//   32   57:checkcast       #82  <Class Path>
	//   33   60:iconst_0        
	//   34   61:invokevirtual   #112 <Method Object Path.get(int)>
	//   35   64:checkcast       #114 <Class Point$LongPoint>
	//   36   67:invokevirtual   #118 <Method long Point$LongPoint.getX()>
	//   37   70:putfield        #121 <Field long LongRect.left>
			longrect.right = longrect.left;
	//   38   73:aload           4
	//   39   75:aload           4
	//   40   77:getfield        #121 <Field long LongRect.left>
	//   41   80:putfield        #124 <Field long LongRect.right>
			longrect.top = ((Point.LongPoint)((Path)get(i)).get(0)).getY();
	//   42   83:aload           4
	//   43   85:aload_0         
	//   44   86:iload_1         
	//   45   87:invokevirtual   #99  <Method Object get(int)>
	//   46   90:checkcast       #82  <Class Path>
	//   47   93:iconst_0        
	//   48   94:invokevirtual   #112 <Method Object Path.get(int)>
	//   49   97:checkcast       #114 <Class Point$LongPoint>
	//   50  100:invokevirtual   #127 <Method long Point$LongPoint.getY()>
	//   51  103:putfield        #130 <Field long LongRect.top>
			longrect.bottom = longrect.top;
	//   52  106:aload           4
	//   53  108:aload           4
	//   54  110:getfield        #130 <Field long LongRect.top>
	//   55  113:putfield        #133 <Field long LongRect.bottom>
			while(i < k) 
	//*  56  116:iload_1         
	//*  57  117:iload_3         
	//*  58  118:icmpge          47
			{
				int j = 0;
	//   59  121:iconst_0        
	//   60  122:istore_2        
				while(j < ((Path)get(i)).size()) 
	//*  61  123:iload_2         
	//*  62  124:aload_0         
	//*  63  125:iload_1         
	//*  64  126:invokevirtual   #99  <Method Object get(int)>
	//*  65  129:checkcast       #82  <Class Path>
	//*  66  132:invokevirtual   #85  <Method int Path.size()>
	//*  67  135:icmpge          351
				{
					if(((Point.LongPoint)((Path)get(i)).get(j)).getX() < longrect.left)
	//*  68  138:aload_0         
	//*  69  139:iload_1         
	//*  70  140:invokevirtual   #99  <Method Object get(int)>
	//*  71  143:checkcast       #82  <Class Path>
	//*  72  146:iload_2         
	//*  73  147:invokevirtual   #112 <Method Object Path.get(int)>
	//*  74  150:checkcast       #114 <Class Point$LongPoint>
	//*  75  153:invokevirtual   #118 <Method long Point$LongPoint.getX()>
	//*  76  156:aload           4
	//*  77  158:getfield        #121 <Field long LongRect.left>
	//*  78  161:lcmp            
	//*  79  162:ifge            245
						longrect.left = ((Point.LongPoint)((Path)get(i)).get(j)).getX();
	//   80  165:aload           4
	//   81  167:aload_0         
	//   82  168:iload_1         
	//   83  169:invokevirtual   #99  <Method Object get(int)>
	//   84  172:checkcast       #82  <Class Path>
	//   85  175:iload_2         
	//   86  176:invokevirtual   #112 <Method Object Path.get(int)>
	//   87  179:checkcast       #114 <Class Point$LongPoint>
	//   88  182:invokevirtual   #118 <Method long Point$LongPoint.getX()>
	//   89  185:putfield        #121 <Field long LongRect.left>
					else
	//*  90  188:aload_0         
	//*  91  189:iload_1         
	//*  92  190:invokevirtual   #99  <Method Object get(int)>
	//*  93  193:checkcast       #82  <Class Path>
	//*  94  196:iload_2         
	//*  95  197:invokevirtual   #112 <Method Object Path.get(int)>
	//*  96  200:checkcast       #114 <Class Point$LongPoint>
	//*  97  203:invokevirtual   #127 <Method long Point$LongPoint.getY()>
	//*  98  206:aload           4
	//*  99  208:getfield        #130 <Field long LongRect.top>
	//* 100  211:lcmp            
	//* 101  212:ifge            298
	//* 102  215:aload           4
	//* 103  217:aload_0         
	//* 104  218:iload_1         
	//* 105  219:invokevirtual   #99  <Method Object get(int)>
	//* 106  222:checkcast       #82  <Class Path>
	//* 107  225:iload_2         
	//* 108  226:invokevirtual   #112 <Method Object Path.get(int)>
	//* 109  229:checkcast       #114 <Class Point$LongPoint>
	//* 110  232:invokevirtual   #127 <Method long Point$LongPoint.getY()>
	//* 111  235:putfield        #130 <Field long LongRect.top>
	//* 112  238:iload_2         
	//* 113  239:iconst_1        
	//* 114  240:iadd            
	//* 115  241:istore_2        
	//* 116  242:goto            123
					if(((Point.LongPoint)((Path)get(i)).get(j)).getX() > longrect.right)
	//* 117  245:aload_0         
	//* 118  246:iload_1         
	//* 119  247:invokevirtual   #99  <Method Object get(int)>
	//* 120  250:checkcast       #82  <Class Path>
	//* 121  253:iload_2         
	//* 122  254:invokevirtual   #112 <Method Object Path.get(int)>
	//* 123  257:checkcast       #114 <Class Point$LongPoint>
	//* 124  260:invokevirtual   #118 <Method long Point$LongPoint.getX()>
	//* 125  263:aload           4
	//* 126  265:getfield        #124 <Field long LongRect.right>
	//* 127  268:lcmp            
	//* 128  269:ifle            188
						longrect.right = ((Point.LongPoint)((Path)get(i)).get(j)).getX();
	//  129  272:aload           4
	//  130  274:aload_0         
	//  131  275:iload_1         
	//  132  276:invokevirtual   #99  <Method Object get(int)>
	//  133  279:checkcast       #82  <Class Path>
	//  134  282:iload_2         
	//  135  283:invokevirtual   #112 <Method Object Path.get(int)>
	//  136  286:checkcast       #114 <Class Point$LongPoint>
	//  137  289:invokevirtual   #118 <Method long Point$LongPoint.getX()>
	//  138  292:putfield        #124 <Field long LongRect.right>
					if(((Point.LongPoint)((Path)get(i)).get(j)).getY() < longrect.top)
						longrect.top = ((Point.LongPoint)((Path)get(i)).get(j)).getY();
					else
	//* 139  295:goto            188
					if(((Point.LongPoint)((Path)get(i)).get(j)).getY() > longrect.bottom)
	//* 140  298:aload_0         
	//* 141  299:iload_1         
	//* 142  300:invokevirtual   #99  <Method Object get(int)>
	//* 143  303:checkcast       #82  <Class Path>
	//* 144  306:iload_2         
	//* 145  307:invokevirtual   #112 <Method Object Path.get(int)>
	//* 146  310:checkcast       #114 <Class Point$LongPoint>
	//* 147  313:invokevirtual   #127 <Method long Point$LongPoint.getY()>
	//* 148  316:aload           4
	//* 149  318:getfield        #133 <Field long LongRect.bottom>
	//* 150  321:lcmp            
	//* 151  322:ifle            238
						longrect.bottom = ((Point.LongPoint)((Path)get(i)).get(j)).getY();
	//  152  325:aload           4
	//  153  327:aload_0         
	//  154  328:iload_1         
	//  155  329:invokevirtual   #99  <Method Object get(int)>
	//  156  332:checkcast       #82  <Class Path>
	//  157  335:iload_2         
	//  158  336:invokevirtual   #112 <Method Object Path.get(int)>
	//  159  339:checkcast       #114 <Class Point$LongPoint>
	//  160  342:invokevirtual   #127 <Method long Point$LongPoint.getY()>
	//  161  345:putfield        #133 <Field long LongRect.bottom>
					j++;
				}
	//* 162  348:goto            238
				i++;
	//  163  351:iload_1         
	//  164  352:iconst_1        
	//  165  353:iadd            
	//  166  354:istore_1        
			}
		}
		return longrect;
	//* 167  355:goto            116
	}

	public void reversePaths()
	{
		for(Iterator iterator = iterator(); iterator.hasNext(); ((Path)iterator.next()).reverse());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method Iterator iterator()>
	//    2    4:astore_1        
	//    3    5:aload_1         
	//    4    6:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            29
	//    6   14:aload_1         
	//    7   15:invokeinterface #59  <Method Object Iterator.next()>
	//    8   20:checkcast       #82  <Class Path>
	//    9   23:invokevirtual   #138 <Method void Path.reverse()>
	//*  10   26:goto            5
	//   11   29:return          
	}

	private static final long serialVersionUID = 0xa702aad4L;
}
