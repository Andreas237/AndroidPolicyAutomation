// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.math.BigInteger;
import java.util.logging.Logger;

class Edge
{
	static final class Side extends Enum
	{

		public static Side valueOf(String s)
		{
			return (Side)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Edge$Side, s);
		//    0    0:ldc1            #2   <Class Edge$Side>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Edge$Side>
		//    4    9:areturn         
		}

		public static Side[] values()
		{
			return (Side[])((Side []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field Edge$Side[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Edge$Side_3B_.clone()>
		//    2    6:checkcast       #38  <Class Edge$Side[]>
		//    3    9:areturn         
		}

		private static final Side $VALUES[];
		public static final Side LEFT;
		public static final Side RIGHT;

		static 
		{
			LEFT = new Side("LEFT", 0);
		//    0    0:new             #2   <Class Edge$Side>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "LEFT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void Edge$Side(String, int)>
		//    5   10:putstatic       #22  <Field Edge$Side LEFT>
			RIGHT = new Side("RIGHT", 1);
		//    6   13:new             #2   <Class Edge$Side>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "RIGHT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void Edge$Side(String, int)>
		//   11   23:putstatic       #25  <Field Edge$Side RIGHT>
			$VALUES = (new Side[] {
				LEFT, RIGHT
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Side[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field Edge$Side LEFT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field Edge$Side RIGHT>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field Edge$Side[] $VALUES>
		//*  23   45:return          
		}

		private Side(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Edge()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #64  <Class Point$LongPoint>
	//    4    8:dup             
	//    5    9:invokespecial   #65  <Method void Point$LongPoint()>
	//    6   12:putfield        #67  <Field Point$LongPoint delta>
	//    7   15:aload_0         
	//    8   16:new             #64  <Class Point$LongPoint>
	//    9   19:dup             
	//   10   20:invokespecial   #65  <Method void Point$LongPoint()>
	//   11   23:putfield        #69  <Field Point$LongPoint top>
	//   12   26:aload_0         
	//   13   27:new             #64  <Class Point$LongPoint>
	//   14   30:dup             
	//   15   31:invokespecial   #65  <Method void Point$LongPoint()>
	//   16   34:putfield        #71  <Field Point$LongPoint bot>
	//   17   37:aload_0         
	//   18   38:new             #64  <Class Point$LongPoint>
	//   19   41:dup             
	//   20   42:invokespecial   #65  <Method void Point$LongPoint()>
	//   21   45:putfield        #73  <Field Point$LongPoint current>
	//   22   48:return          
	}

	static boolean doesE2InsertBeforeE1(Edge edge, Edge edge1)
	{
		if(edge1.current.getX() != edge.current.getX()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:getfield        #73  <Field Point$LongPoint current>
	//    2    4:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field Point$LongPoint current>
	//    5   11:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//    6   14:lcmp            
	//    7   15:ifne            86
_L1:
		if(edge1.top.getY() <= edge.top.getY()) goto _L4; else goto _L3
	//    8   18:aload_1         
	//    9   19:getfield        #69  <Field Point$LongPoint top>
	//   10   22:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   11   25:aload_0         
	//   12   26:getfield        #69  <Field Point$LongPoint top>
	//   13   29:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   14   32:lcmp            
	//   15   33:ifle            62
_L3:
		if(edge1.top.getX() >= topX(edge, edge1.top.getY())) goto _L6; else goto _L5
	//   16   36:aload_1         
	//   17   37:getfield        #69  <Field Point$LongPoint top>
	//   18   40:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//   19   43:aload_0         
	//   20   44:aload_1         
	//   21   45:getfield        #69  <Field Point$LongPoint top>
	//   22   48:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   23   51:invokestatic    #86  <Method long topX(Edge, long)>
	//   24   54:lcmp            
	//   25   55:ifge            60
_L5:
		return true;
	//   26   58:iconst_1        
	//   27   59:ireturn         
_L6:
		return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
_L4:
		if(edge.top.getX() <= topX(edge1, edge.top.getY()))
	//*  30   62:aload_0         
	//*  31   63:getfield        #69  <Field Point$LongPoint top>
	//*  32   66:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//*  33   69:aload_1         
	//*  34   70:aload_0         
	//*  35   71:getfield        #69  <Field Point$LongPoint top>
	//*  36   74:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//*  37   77:invokestatic    #86  <Method long topX(Edge, long)>
	//*  38   80:lcmp            
	//*  39   81:ifgt            58
			return false;
	//   40   84:iconst_0        
	//   41   85:ireturn         
		continue; /* Loop/switch isn't completed */
_L2:
		if(edge1.current.getX() >= edge.current.getX())
	//*  42   86:aload_1         
	//*  43   87:getfield        #73  <Field Point$LongPoint current>
	//*  44   90:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//*  45   93:aload_0         
	//*  46   94:getfield        #73  <Field Point$LongPoint current>
	//*  47   97:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//*  48  100:lcmp            
	//*  49  101:iflt            58
			return false;
	//   50  104:iconst_0        
	//   51  105:ireturn         
		if(true) goto _L5; else goto _L7
_L7:
	}

	static boolean slopesEqual(Edge edge, Edge edge1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            54
			return BigInteger.valueOf(edge.getDelta().getY()).multiply(BigInteger.valueOf(edge1.getDelta().getX())).equals(((Object) (BigInteger.valueOf(edge.getDelta().getX()).multiply(BigInteger.valueOf(edge1.getDelta().getY())))));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #92  <Method Point$LongPoint getDelta()>
	//    4    8:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//    5   11:invokestatic    #98  <Method BigInteger BigInteger.valueOf(long)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #92  <Method Point$LongPoint getDelta()>
	//    8   18:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//    9   21:invokestatic    #98  <Method BigInteger BigInteger.valueOf(long)>
	//   10   24:invokevirtual   #102 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   11   27:aload_0         
	//   12   28:invokevirtual   #92  <Method Point$LongPoint getDelta()>
	//   13   31:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//   14   34:invokestatic    #98  <Method BigInteger BigInteger.valueOf(long)>
	//   15   37:aload_1         
	//   16   38:invokevirtual   #92  <Method Point$LongPoint getDelta()>
	//   17   41:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   18   44:invokestatic    #98  <Method BigInteger BigInteger.valueOf(long)>
	//   19   47:invokevirtual   #102 <Method BigInteger BigInteger.multiply(BigInteger)>
	//   20   50:invokevirtual   #106 <Method boolean BigInteger.equals(Object)>
	//   21   53:ireturn         
		return edge.getDelta().getY() * edge1.getDelta().getX() == edge.getDelta().getX() * edge1.getDelta().getY();
	//   22   54:aload_0         
	//   23   55:invokevirtual   #92  <Method Point$LongPoint getDelta()>
	//   24   58:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   25   61:aload_1         
	//   26   62:invokevirtual   #92  <Method Point$LongPoint getDelta()>
	//   27   65:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//   28   68:lmul            
	//   29   69:aload_0         
	//   30   70:invokevirtual   #92  <Method Point$LongPoint getDelta()>
	//   31   73:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//   32   76:aload_1         
	//   33   77:invokevirtual   #92  <Method Point$LongPoint getDelta()>
	//   34   80:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   35   83:lmul            
	//   36   84:lcmp            
	//   37   85:ifne            90
	//   38   88:iconst_1        
	//   39   89:ireturn         
	//   40   90:iconst_0        
	//   41   91:ireturn         
	}

	static void swapPolyIndexes(Edge edge, Edge edge1)
	{
		int i = edge.outIdx;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field int outIdx>
	//    2    4:istore_2        
		edge.outIdx = edge1.outIdx;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #110 <Field int outIdx>
	//    6   10:putfield        #110 <Field int outIdx>
		edge1.outIdx = i;
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:putfield        #110 <Field int outIdx>
	//   10   18:return          
	}

	static void swapSides(Edge edge, Edge edge1)
	{
		Side side1 = edge.side;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Edge$Side side>
	//    2    4:astore_2        
		edge.side = edge1.side;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #113 <Field Edge$Side side>
	//    6   10:putfield        #113 <Field Edge$Side side>
		edge1.side = side1;
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:putfield        #113 <Field Edge$Side side>
	//   10   18:return          
	}

	static long topX(Edge edge, long l)
	{
		if(l == edge.getTop().getY())
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #116 <Method Point$LongPoint getTop()>
	//*   3    5:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//*   4    8:lcmp            
	//*   5    9:ifne            20
			return edge.getTop().getX();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #116 <Method Point$LongPoint getTop()>
	//    8   16:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//    9   19:lreturn         
		else
			return edge.getBot().getX() + Math.round(edge.deltaX * (double)(l - edge.getBot().getY()));
	//   10   20:aload_0         
	//   11   21:invokevirtual   #119 <Method Point$LongPoint getBot()>
	//   12   24:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//   13   27:aload_0         
	//   14   28:getfield        #121 <Field double deltaX>
	//   15   31:lload_1         
	//   16   32:aload_0         
	//   17   33:invokevirtual   #119 <Method Point$LongPoint getBot()>
	//   18   36:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   19   39:lsub            
	//   20   40:l2d             
	//   21   41:dmul            
	//   22   42:invokestatic    #127 <Method long Math.round(double)>
	//   23   45:ladd            
	//   24   46:lreturn         
	}

	public Edge findNextLocMin()
	{
_L6:
		Edge edge;
		Edge edge1;
		for(edge = this; !edge.bot.equals(((Object) (edge.prev.bot))) || edge.current.equals(((Object) (edge.top))); edge = edge.next);
	//    0    0:aload_0         
	//    1    1:astore_1        
	//    2    2:aload_1         
	//    3    3:getfield        #71  <Field Point$LongPoint bot>
	//    4    6:aload_1         
	//    5    7:getfield        #131 <Field Edge prev>
	//    6   10:getfield        #71  <Field Point$LongPoint bot>
	//    7   13:invokevirtual   #132 <Method boolean Point$LongPoint.equals(Object)>
	//    8   16:ifeq            33
	//    9   19:aload_1         
	//   10   20:getfield        #73  <Field Point$LongPoint current>
	//   11   23:aload_1         
	//   12   24:getfield        #69  <Field Point$LongPoint top>
	//   13   27:invokevirtual   #132 <Method boolean Point$LongPoint.equals(Object)>
	//   14   30:ifeq            41
	//   15   33:aload_1         
	//   16   34:getfield        #134 <Field Edge next>
	//   17   37:astore_1        
	//*  18   38:goto            2
		edge1 = edge;
	//   19   41:aload_1         
	//   20   42:astore_2        
		if(edge.deltaX == -3.4E+38D) goto _L2; else goto _L1
	//   21   43:aload_1         
	//   22   44:getfield        #121 <Field double deltaX>
	//   23   47:ldc2w           #12  <Double -3.4E+38D>
	//   24   50:dcmpl           
	//   25   51:ifeq            72
_L1:
		edge1 = edge;
	//   26   54:aload_1         
	//   27   55:astore_2        
		if(edge.prev.deltaX == -3.4E+38D) goto _L2; else goto _L3
	//   28   56:aload_1         
	//   29   57:getfield        #131 <Field Edge prev>
	//   30   60:getfield        #121 <Field double deltaX>
	//   31   63:ldc2w           #12  <Double -3.4E+38D>
	//   32   66:dcmpl           
	//   33   67:ifeq            72
_L3:
		return edge;
	//   34   70:aload_1         
	//   35   71:areturn         
_L2:
		for(; edge1.prev.deltaX == -3.4E+38D; edge1 = edge1.prev);
	//   36   72:aload_2         
	//   37   73:getfield        #131 <Field Edge prev>
	//   38   76:getfield        #121 <Field double deltaX>
	//   39   79:ldc2w           #12  <Double -3.4E+38D>
	//   40   82:dcmpl           
	//   41   83:ifne            94
	//   42   86:aload_2         
	//   43   87:getfield        #131 <Field Edge prev>
	//   44   90:astore_2        
	//*  45   91:goto            72
		Edge edge2;
		for(edge2 = edge1; edge2.deltaX == -3.4E+38D; edge2 = edge2.next);
	//   46   94:aload_2         
	//   47   95:astore_3        
	//   48   96:aload_3         
	//   49   97:getfield        #121 <Field double deltaX>
	//   50  100:ldc2w           #12  <Double -3.4E+38D>
	//   51  103:dcmpl           
	//   52  104:ifne            115
	//   53  107:aload_3         
	//   54  108:getfield        #134 <Field Edge next>
	//   55  111:astore_3        
	//*  56  112:goto            96
		edge = edge2;
	//   57  115:aload_3         
	//   58  116:astore_1        
		if(edge2.top.getY() == edge2.prev.bot.getY())
			continue; /* Loop/switch isn't completed */
	//   59  117:aload_3         
	//   60  118:getfield        #69  <Field Point$LongPoint top>
	//   61  121:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   62  124:aload_3         
	//   63  125:getfield        #131 <Field Edge prev>
	//   64  128:getfield        #71  <Field Point$LongPoint bot>
	//   65  131:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   66  134:lcmp            
	//   67  135:ifeq            2
		edge = edge2;
	//   68  138:aload_3         
	//   69  139:astore_1        
		if(edge1.prev.bot.getX() < edge2.bot.getX())
	//*  70  140:aload_2         
	//*  71  141:getfield        #131 <Field Edge prev>
	//*  72  144:getfield        #71  <Field Point$LongPoint bot>
	//*  73  147:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//*  74  150:aload_3         
	//*  75  151:getfield        #71  <Field Point$LongPoint bot>
	//*  76  154:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//*  77  157:lcmp            
	//*  78  158:ifge            70
			return edge1;
	//   79  161:aload_2         
	//   80  162:areturn         
		if(true) goto _L3; else goto _L4
_L4:
		if(true) goto _L6; else goto _L5
_L5:
	}

	public Point.LongPoint getBot()
	{
		return bot;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Point$LongPoint bot>
	//    2    4:areturn         
	}

	public Point.LongPoint getCurrent()
	{
		return current;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Point$LongPoint current>
	//    2    4:areturn         
	}

	public Point.LongPoint getDelta()
	{
		return delta;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Point$LongPoint delta>
	//    2    4:areturn         
	}

	public Edge getMaximaPair()
	{
		Edge edge1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(!next.top.equals(((Object) (top))) || next.nextInLML != null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #134 <Field Edge next>
	//    4    6:getfield        #69  <Field Point$LongPoint top>
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field Point$LongPoint top>
	//    7   13:invokevirtual   #132 <Method boolean Point$LongPoint.equals(Object)>
	//    8   16:ifeq            75
	//    9   19:aload_0         
	//   10   20:getfield        #134 <Field Edge next>
	//   11   23:getfield        #138 <Field Edge nextInLML>
	//   12   26:ifnonnull       75
_L1:
		Edge edge = next;
	//   13   29:aload_0         
	//   14   30:getfield        #134 <Field Edge next>
	//   15   33:astore_1        
_L4:
label0:
		{
			edge1 = edge;
	//   16   34:aload_1         
	//   17   35:astore_2        
			if(edge == null)
				break label0;
	//   18   36:aload_1         
	//   19   37:ifnull          73
			if(edge.outIdx != -2)
	//*  20   40:aload_1         
	//*  21   41:getfield        #110 <Field int outIdx>
	//*  22   44:bipush          -2
	//*  23   46:icmpeq          71
			{
				edge1 = edge;
	//   24   49:aload_1         
	//   25   50:astore_2        
				if(edge.nextInAEL != edge.prevInAEL)
					break label0;
	//   26   51:aload_1         
	//   27   52:getfield        #140 <Field Edge nextInAEL>
	//   28   55:aload_1         
	//   29   56:getfield        #142 <Field Edge prevInAEL>
	//   30   59:if_acmpne       73
				edge1 = edge;
	//   31   62:aload_1         
	//   32   63:astore_2        
				if(edge.isHorizontal())
					break label0;
	//   33   64:aload_1         
	//   34   65:invokevirtual   #146 <Method boolean isHorizontal()>
	//   35   68:ifne            73
			}
			edge1 = null;
	//   36   71:aconst_null     
	//   37   72:astore_2        
		}
		return edge1;
	//   38   73:aload_2         
	//   39   74:areturn         
_L2:
		edge = edge1;
	//   40   75:aload_2         
	//   41   76:astore_1        
		if(prev.top.equals(((Object) (top))))
	//*  42   77:aload_0         
	//*  43   78:getfield        #131 <Field Edge prev>
	//*  44   81:getfield        #69  <Field Point$LongPoint top>
	//*  45   84:aload_0         
	//*  46   85:getfield        #69  <Field Point$LongPoint top>
	//*  47   88:invokevirtual   #132 <Method boolean Point$LongPoint.equals(Object)>
	//*  48   91:ifeq            34
		{
			edge = edge1;
	//   49   94:aload_2         
	//   50   95:astore_1        
			if(prev.nextInLML == null)
	//*  51   96:aload_0         
	//*  52   97:getfield        #131 <Field Edge prev>
	//*  53  100:getfield        #138 <Field Edge nextInLML>
	//*  54  103:ifnonnull       34
				edge = prev;
	//   55  106:aload_0         
	//   56  107:getfield        #131 <Field Edge prev>
	//   57  110:astore_1        
		}
		if(true) goto _L4; else goto _L3
	//   58  111:goto            34
_L3:
	}

	public Edge getNextInAEL(Clipper.Direction direction)
	{
		if(direction == Clipper.Direction.LEFT_TO_RIGHT)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #154 <Field Clipper$Direction Clipper$Direction.LEFT_TO_RIGHT>
	//*   2    4:if_acmpne       12
			return nextInAEL;
	//    3    7:aload_0         
	//    4    8:getfield        #140 <Field Edge nextInAEL>
	//    5   11:areturn         
		else
			return prevInAEL;
	//    6   12:aload_0         
	//    7   13:getfield        #142 <Field Edge prevInAEL>
	//    8   16:areturn         
	}

	public Point.LongPoint getTop()
	{
		return top;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Point$LongPoint top>
	//    2    4:areturn         
	}

	public boolean isContributing(Clipper.PolyFillType polyfilltype, Clipper.PolyFillType polyfilltype1, Clipper.ClipType cliptype)
	{
		static class _cls1
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
			//*  29   65:getstatic       #49  <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
			//*  30   68:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
			//*  31   71:iconst_1        
			//*  32   72:iastore         
			//*  33   73:getstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
			//*  34   76:getstatic       #53  <Field Clipper$PolyFillType Clipper$PolyFillType.NON_ZERO>
			//*  35   79:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
			//*  36   82:iconst_2        
			//*  37   83:iastore         
			//*  38   84:getstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
			//*  39   87:getstatic       #56  <Field Clipper$PolyFillType Clipper$PolyFillType.POSITIVE>
			//*  40   90:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
			//*  41   93:iconst_3        
			//*  42   94:iastore         
			//*  43   95:return          
			//*  44   96:astore_0        
			//*  45   97:return          
			//*  46   98:astore_0        
			//*  47   99:goto            84
			//*  48  102:astore_0        
			//*  49  103:goto            73
			//*  50  106:astore_0        
			//*  51  107:goto            53
			//*  52  110:astore_0        
			//*  53  111:goto            42
			//*  54  114:astore_0        
			//*  55  115:goto            31
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   56  118:astore_0        
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper.ClipType.UNION.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper.ClipType.DIFFERENCE.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper.ClipType.XOR.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType = new int[Clipper.PolyFillType.values().length];
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[Clipper.PolyFillType.EVEN_ODD.ordinal()] = 1;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[Clipper.PolyFillType.NON_ZERO.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[Clipper.PolyFillType.POSITIVE.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  57  119:goto            20
			}
		}

		boolean flag;
		boolean flag1;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		LOGGER.entering(((Class) (com/itextpdf/text/pdf/parser/clipper/Edge)).getName(), "isContributing");
	//    2    3:getstatic       #58  <Field Logger LOGGER>
	//    3    6:ldc1            #2   <Class Edge>
	//    4    8:invokevirtual   #50  <Method String Class.getName()>
	//    5   11:ldc1            #157 <String "isContributing">
	//    6   13:invokevirtual   #161 <Method void Logger.entering(String, String)>
		if(polyTyp != Clipper.PolyType.SUBJECT)
	//*   7   16:aload_0         
	//*   8   17:getfield        #163 <Field Clipper$PolyType polyTyp>
	//*   9   20:getstatic       #168 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//*  10   23:if_acmpne       74
	//*  11   26:getstatic       #172 <Field int[] Edge$1.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//*  12   29:aload_2         
	//*  13   30:invokevirtual   #178 <Method int Clipper$PolyFillType.ordinal()>
	//*  14   33:iaload          
	//*  15   34:tableswitch     1 3: default 60
	//	               1 85
	//	               2 102
	//	               3 115
	//*  16   60:aload_0         
	//*  17   61:getfield        #180 <Field int windCnt>
	//*  18   64:iconst_m1       
	//*  19   65:icmpeq          125
	//*  20   68:iconst_0        
	//*  21   69:istore          4
	//*  22   71:iload           4
	//*  23   73:ireturn         
		{
			Clipper.PolyFillType polyfilltype2 = polyfilltype1;
	//   24   74:aload_2         
	//   25   75:astore          6
			polyfilltype1 = polyfilltype;
	//   26   77:aload_1         
	//   27   78:astore_2        
			polyfilltype = polyfilltype2;
	//   28   79:aload           6
	//   29   81:astore_1        
		}
		_cls1..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype1.ordinal()];
		JVM INSTR tableswitch 1 3: default 60
	//	               1 85
	//	               2 102
	//	               3 115;
		   goto _L1 _L2 _L3 _L4
_L1:
		if(windCnt == -1)
			break; /* Loop/switch isn't completed */
		flag = false;
_L8:
		return flag;
	//*  30   82:goto            26
_L2:
		if(windDelta == 0 && windCnt != 1)
	//*  31   85:aload_0         
	//*  32   86:getfield        #182 <Field int windDelta>
	//*  33   89:ifne            125
	//*  34   92:aload_0         
	//*  35   93:getfield        #180 <Field int windCnt>
	//*  36   96:iconst_1        
	//*  37   97:icmpeq          125
			return false;
	//   38  100:iconst_0        
	//   39  101:ireturn         
		break; /* Loop/switch isn't completed */
_L3:
		if(Math.abs(windCnt) != 1)
	//*  40  102:aload_0         
	//*  41  103:getfield        #180 <Field int windCnt>
	//*  42  106:invokestatic    #186 <Method int Math.abs(int)>
	//*  43  109:iconst_1        
	//*  44  110:icmpeq          125
			return false;
	//   45  113:iconst_0        
	//   46  114:ireturn         
		break; /* Loop/switch isn't completed */
_L4:
		if(windCnt != 1)
	//*  47  115:aload_0         
	//*  48  116:getfield        #180 <Field int windCnt>
	//*  49  119:iconst_1        
	//*  50  120:icmpeq          125
			return false;
	//   51  123:iconst_0        
	//   52  124:ireturn         
		switch(_cls1..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.ClipType[cliptype.ordinal()])
	//*  53  125:getstatic       #189 <Field int[] Edge$1.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
	//*  54  128:aload_3         
	//*  55  129:invokevirtual   #192 <Method int Clipper$ClipType.ordinal()>
	//*  56  132:iaload          
		{
	//*  57  133:tableswitch     1 4: default 164
	//	               1 166
	//	               2 239
	//	               3 311
	//	               4 467
		default:
			return true;
	//   58  164:iconst_1        
	//   59  165:ireturn         

		case 1: // '\001'
			switch(_cls1..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype.ordinal()])
	//*  60  166:getstatic       #172 <Field int[] Edge$1.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//*  61  169:aload_1         
	//*  62  170:invokevirtual   #178 <Method int Clipper$PolyFillType.ordinal()>
	//*  63  173:iaload          
			{
	//*  64  174:tableswitch     1 3: default 200
	//	               1 213
	//	               2 213
	//	               3 226
			default:
				flag = flag1;
	//   65  200:iload           5
	//   66  202:istore          4
				if(windCnt2 >= 0)
	//*  67  204:aload_0         
	//*  68  205:getfield        #194 <Field int windCnt2>
	//*  69  208:iflt            71
					return false;
	//   70  211:iconst_0        
	//   71  212:ireturn         
				break; /* Loop/switch isn't completed */

			case 1: // '\001'
			case 2: // '\002'
				flag = flag1;
	//   72  213:iload           5
	//   73  215:istore          4
				if(windCnt2 == 0)
	//*  74  217:aload_0         
	//*  75  218:getfield        #194 <Field int windCnt2>
	//*  76  221:ifne            71
					return false;
	//   77  224:iconst_0        
	//   78  225:ireturn         
				break; /* Loop/switch isn't completed */

			case 3: // '\003'
				flag = flag1;
	//   79  226:iload           5
	//   80  228:istore          4
				break;
			}
			if(windCnt2 <= 0)
	//*  81  230:aload_0         
	//*  82  231:getfield        #194 <Field int windCnt2>
	//*  83  234:ifgt            71
				return false;
	//   84  237:iconst_0        
	//   85  238:ireturn         
			break; /* Loop/switch isn't completed */

		case 2: // '\002'
			switch(_cls1..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype.ordinal()])
	//*  86  239:getstatic       #172 <Field int[] Edge$1.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//*  87  242:aload_1         
	//*  88  243:invokevirtual   #178 <Method int Clipper$PolyFillType.ordinal()>
	//*  89  246:iaload          
			{
	//*  90  247:tableswitch     1 3: default 272
	//	               1 285
	//	               2 285
	//	               3 298
			default:
				flag = flag1;
	//   91  272:iload           5
	//   92  274:istore          4
				if(windCnt2 < 0)
	//*  93  276:aload_0         
	//*  94  277:getfield        #194 <Field int windCnt2>
	//*  95  280:ifge            71
					return false;
	//   96  283:iconst_0        
	//   97  284:ireturn         
				break; /* Loop/switch isn't completed */

			case 1: // '\001'
			case 2: // '\002'
				flag = flag1;
	//   98  285:iload           5
	//   99  287:istore          4
				if(windCnt2 != 0)
	//* 100  289:aload_0         
	//* 101  290:getfield        #194 <Field int windCnt2>
	//* 102  293:ifeq            71
					return false;
	//  103  296:iconst_0        
	//  104  297:ireturn         
				break; /* Loop/switch isn't completed */

			case 3: // '\003'
				flag = flag1;
	//  105  298:iload           5
	//  106  300:istore          4
				break;
			}
			if(windCnt2 > 0)
	//* 107  302:aload_0         
	//* 108  303:getfield        #194 <Field int windCnt2>
	//* 109  306:ifle            71
				return false;
	//  110  309:iconst_0        
	//  111  310:ireturn         
			break; /* Loop/switch isn't completed */

		case 3: // '\003'
			if(polyTyp == Clipper.PolyType.SUBJECT)
	//* 112  311:aload_0         
	//* 113  312:getfield        #163 <Field Clipper$PolyType polyTyp>
	//* 114  315:getstatic       #168 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//* 115  318:if_acmpne       395
			{
				switch(_cls1..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype.ordinal()])
	//* 116  321:getstatic       #172 <Field int[] Edge$1.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//* 117  324:aload_1         
	//* 118  325:invokevirtual   #178 <Method int Clipper$PolyFillType.ordinal()>
	//* 119  328:iaload          
				{
	//* 120  329:tableswitch     1 3: default 356
	//	               1 369
	//	               2 369
	//	               3 382
				default:
					flag = flag1;
	//  121  356:iload           5
	//  122  358:istore          4
					if(windCnt2 < 0)
	//* 123  360:aload_0         
	//* 124  361:getfield        #194 <Field int windCnt2>
	//* 125  364:ifge            71
						return false;
	//  126  367:iconst_0        
	//  127  368:ireturn         
					break; /* Loop/switch isn't completed */

				case 1: // '\001'
				case 2: // '\002'
					flag = flag1;
	//  128  369:iload           5
	//  129  371:istore          4
					if(windCnt2 != 0)
	//* 130  373:aload_0         
	//* 131  374:getfield        #194 <Field int windCnt2>
	//* 132  377:ifeq            71
						return false;
	//  133  380:iconst_0        
	//  134  381:ireturn         
					break; /* Loop/switch isn't completed */

				case 3: // '\003'
					flag = flag1;
	//  135  382:iload           5
	//  136  384:istore          4
					break;
				}
				if(windCnt2 > 0)
	//* 137  386:aload_0         
	//* 138  387:getfield        #194 <Field int windCnt2>
	//* 139  390:ifle            71
					return false;
	//  140  393:iconst_0        
	//  141  394:ireturn         
				break; /* Loop/switch isn't completed */
			}
			switch(_cls1..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype.ordinal()])
	//* 142  395:getstatic       #172 <Field int[] Edge$1.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//* 143  398:aload_1         
	//* 144  399:invokevirtual   #178 <Method int Clipper$PolyFillType.ordinal()>
	//* 145  402:iaload          
			{
	//* 146  403:tableswitch     1 3: default 428
	//	               1 441
	//	               2 441
	//	               3 454
			default:
				flag = flag1;
	//  147  428:iload           5
	//  148  430:istore          4
				if(windCnt2 >= 0)
	//* 149  432:aload_0         
	//* 150  433:getfield        #194 <Field int windCnt2>
	//* 151  436:iflt            71
					return false;
	//  152  439:iconst_0        
	//  153  440:ireturn         
				break; /* Loop/switch isn't completed */

			case 1: // '\001'
			case 2: // '\002'
				flag = flag1;
	//  154  441:iload           5
	//  155  443:istore          4
				if(windCnt2 == 0)
	//* 156  445:aload_0         
	//* 157  446:getfield        #194 <Field int windCnt2>
	//* 158  449:ifne            71
					return false;
	//  159  452:iconst_0        
	//  160  453:ireturn         
				break; /* Loop/switch isn't completed */

			case 3: // '\003'
				flag = flag1;
	//  161  454:iload           5
	//  162  456:istore          4
				break;
			}
			if(windCnt2 <= 0)
	//* 163  458:aload_0         
	//* 164  459:getfield        #194 <Field int windCnt2>
	//* 165  462:ifgt            71
				return false;
	//  166  465:iconst_0        
	//  167  466:ireturn         
			break; /* Loop/switch isn't completed */

		case 4: // '\004'
			flag = flag1;
	//  168  467:iload           5
	//  169  469:istore          4
			break;
		}
		if(windDelta != 0)
			break; /* Loop/switch isn't completed */
	//  170  471:aload_0         
	//  171  472:getfield        #182 <Field int windDelta>
	//  172  475:ifne            71
		switch(_cls1..SwitchMap.com.itextpdf.text.pdf.parser.clipper.Clipper.PolyFillType[polyfilltype.ordinal()])
	//* 173  478:getstatic       #172 <Field int[] Edge$1.$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//* 174  481:aload_1         
	//* 175  482:invokevirtual   #178 <Method int Clipper$PolyFillType.ordinal()>
	//* 176  485:iaload          
		{
	//* 177  486:tableswitch     1 3: default 512
	//	               1 525
	//	               2 525
	//	               3 538
		default:
			flag = flag1;
	//  178  512:iload           5
	//  179  514:istore          4
			if(windCnt2 < 0)
	//* 180  516:aload_0         
	//* 181  517:getfield        #194 <Field int windCnt2>
	//* 182  520:ifge            71
				return false;
	//  183  523:iconst_0        
	//  184  524:ireturn         
			break; /* Loop/switch isn't completed */

		case 1: // '\001'
		case 2: // '\002'
			flag = flag1;
	//  185  525:iload           5
	//  186  527:istore          4
			if(windCnt2 != 0)
	//* 187  529:aload_0         
	//* 188  530:getfield        #194 <Field int windCnt2>
	//* 189  533:ifeq            71
				return false;
	//  190  536:iconst_0        
	//  191  537:ireturn         
			break; /* Loop/switch isn't completed */

		case 3: // '\003'
			flag = flag1;
	//  192  538:iload           5
	//  193  540:istore          4
			break;
		}
		if(windCnt2 <= 0) goto _L6; else goto _L5
	//  194  542:aload_0         
	//  195  543:getfield        #194 <Field int windCnt2>
	//  196  546:ifle            71
_L6:
		continue; /* Loop/switch isn't completed */
_L5:
		return false;
	//  197  549:iconst_0        
	//  198  550:ireturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	public boolean isEvenOddAltFillType(Clipper.PolyFillType polyfilltype, Clipper.PolyFillType polyfilltype1)
	{
		if(polyTyp != Clipper.PolyType.SUBJECT) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field Clipper$PolyType polyTyp>
	//    2    4:getstatic       #168 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//    3    7:if_acmpne       21
_L1:
		if(polyfilltype != Clipper.PolyFillType.EVEN_ODD) goto _L4; else goto _L3
	//    4   10:aload_1         
	//    5   11:getstatic       #200 <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
	//    6   14:if_acmpne       19
_L3:
		return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
_L4:
		return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
_L2:
		if(polyfilltype1 != Clipper.PolyFillType.EVEN_ODD)
	//*  11   21:aload_2         
	//*  12   22:getstatic       #200 <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
	//*  13   25:if_acmpeq       17
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	public boolean isEvenOddFillType(Clipper.PolyFillType polyfilltype, Clipper.PolyFillType polyfilltype1)
	{
		if(polyTyp != Clipper.PolyType.SUBJECT) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field Clipper$PolyType polyTyp>
	//    2    4:getstatic       #168 <Field Clipper$PolyType Clipper$PolyType.SUBJECT>
	//    3    7:if_acmpne       21
_L1:
		if(polyfilltype1 != Clipper.PolyFillType.EVEN_ODD) goto _L4; else goto _L3
	//    4   10:aload_2         
	//    5   11:getstatic       #200 <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
	//    6   14:if_acmpne       19
_L3:
		return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
_L4:
		return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
_L2:
		if(polyfilltype != Clipper.PolyFillType.EVEN_ODD)
	//*  11   21:aload_1         
	//*  12   22:getstatic       #200 <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
	//*  13   25:if_acmpeq       17
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	public boolean isHorizontal()
	{
		return delta.getY() == 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Point$LongPoint delta>
	//    2    4:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//    3    7:lconst_0        
	//    4    8:lcmp            
	//    5    9:ifne            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean isIntermediate(double d)
	{
		return (double)top.getY() == d && nextInLML != null;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Point$LongPoint top>
	//    2    4:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//    3    7:l2d             
	//    4    8:dload_1         
	//    5    9:dcmpl           
	//    6   10:ifne            22
	//    7   13:aload_0         
	//    8   14:getfield        #138 <Field Edge nextInLML>
	//    9   17:ifnull          22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public boolean isMaxima(double d)
	{
		return (double)top.getY() == d && nextInLML == null;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Point$LongPoint top>
	//    2    4:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//    3    7:l2d             
	//    4    8:dload_1         
	//    5    9:dcmpl           
	//    6   10:ifne            22
	//    7   13:aload_0         
	//    8   14:getfield        #138 <Field Edge nextInLML>
	//    9   17:ifnonnull       22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public void reverseHorizontal()
	{
		long l = top.getX();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Point$LongPoint top>
	//    2    4:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//    3    7:lstore_1        
		top.setX(((Number) (Long.valueOf(bot.getX()))));
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field Point$LongPoint top>
	//    6   12:aload_0         
	//    7   13:getfield        #71  <Field Point$LongPoint bot>
	//    8   16:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//    9   19:invokestatic    #210 <Method Long Long.valueOf(long)>
	//   10   22:invokevirtual   #214 <Method void Point$LongPoint.setX(Number)>
		bot.setX(((Number) (Long.valueOf(l))));
	//   11   25:aload_0         
	//   12   26:getfield        #71  <Field Point$LongPoint bot>
	//   13   29:lload_1         
	//   14   30:invokestatic    #210 <Method Long Long.valueOf(long)>
	//   15   33:invokevirtual   #214 <Method void Point$LongPoint.setX(Number)>
		l = top.getZ();
	//   16   36:aload_0         
	//   17   37:getfield        #69  <Field Point$LongPoint top>
	//   18   40:invokevirtual   #217 <Method long Point$LongPoint.getZ()>
	//   19   43:lstore_1        
		top.setZ(((Number) (Long.valueOf(bot.getZ()))));
	//   20   44:aload_0         
	//   21   45:getfield        #69  <Field Point$LongPoint top>
	//   22   48:aload_0         
	//   23   49:getfield        #71  <Field Point$LongPoint bot>
	//   24   52:invokevirtual   #217 <Method long Point$LongPoint.getZ()>
	//   25   55:invokestatic    #210 <Method Long Long.valueOf(long)>
	//   26   58:invokevirtual   #220 <Method void Point$LongPoint.setZ(Number)>
		bot.setZ(((Number) (Long.valueOf(l))));
	//   27   61:aload_0         
	//   28   62:getfield        #71  <Field Point$LongPoint bot>
	//   29   65:lload_1         
	//   30   66:invokestatic    #210 <Method Long Long.valueOf(long)>
	//   31   69:invokevirtual   #220 <Method void Point$LongPoint.setZ(Number)>
	//   32   72:return          
	}

	public void setBot(Point.LongPoint longpoint)
	{
		bot.set(((Point) (longpoint)));
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Point$LongPoint bot>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #226 <Method void Point$LongPoint.set(Point)>
	//    4    8:return          
	}

	public void setCurrent(Point.LongPoint longpoint)
	{
		current.set(((Point) (longpoint)));
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Point$LongPoint current>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #226 <Method void Point$LongPoint.set(Point)>
	//    4    8:return          
	}

	public void setTop(Point.LongPoint longpoint)
	{
		top.set(((Point) (longpoint)));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Point$LongPoint top>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #226 <Method void Point$LongPoint.set(Point)>
	//    4    8:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("TEdge [Bot=").append(((Object) (bot))).append(", Curr=").append(((Object) (current))).append(", Top=").append(((Object) (top))).append(", Delta=").append(((Object) (delta))).append(", Dx=").append(deltaX).append(", PolyTyp=").append(((Object) (polyTyp))).append(", Side=").append(((Object) (side))).append(", WindDelta=").append(windDelta).append(", WindCnt=").append(windCnt).append(", WindCnt2=").append(windCnt2).append(", OutIdx=").append(outIdx).append(", Next=").append(((Object) (next))).append(", Prev=").append(((Object) (prev))).append(", NextInLML=").append(((Object) (nextInLML))).append(", NextInAEL=").append(((Object) (nextInAEL))).append(", PrevInAEL=").append(((Object) (prevInAEL))).append(", NextInSEL=").append(((Object) (nextInSEL))).append(", PrevInSEL=").append(((Object) (prevInSEL))).append("]").toString();
	//    0    0:new             #231 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #232 <Method void StringBuilder()>
	//    3    7:ldc1            #234 <String "TEdge [Bot=">
	//    4    9:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #71  <Field Point$LongPoint bot>
	//    7   16:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #243 <String ", Curr=">
	//    9   21:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #73  <Field Point$LongPoint current>
	//   12   28:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #245 <String ", Top=">
	//   14   33:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #69  <Field Point$LongPoint top>
	//   17   40:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   18   43:ldc1            #247 <String ", Delta=">
	//   19   45:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #67  <Field Point$LongPoint delta>
	//   22   52:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   23   55:ldc1            #249 <String ", Dx=">
	//   24   57:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #121 <Field double deltaX>
	//   27   64:invokevirtual   #252 <Method StringBuilder StringBuilder.append(double)>
	//   28   67:ldc1            #254 <String ", PolyTyp=">
	//   29   69:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #163 <Field Clipper$PolyType polyTyp>
	//   32   76:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   33   79:ldc2            #256 <String ", Side=">
	//   34   82:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   35   85:aload_0         
	//   36   86:getfield        #113 <Field Edge$Side side>
	//   37   89:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   38   92:ldc2            #258 <String ", WindDelta=">
	//   39   95:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   40   98:aload_0         
	//   41   99:getfield        #182 <Field int windDelta>
	//   42  102:invokevirtual   #261 <Method StringBuilder StringBuilder.append(int)>
	//   43  105:ldc2            #263 <String ", WindCnt=">
	//   44  108:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   45  111:aload_0         
	//   46  112:getfield        #180 <Field int windCnt>
	//   47  115:invokevirtual   #261 <Method StringBuilder StringBuilder.append(int)>
	//   48  118:ldc2            #265 <String ", WindCnt2=">
	//   49  121:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   50  124:aload_0         
	//   51  125:getfield        #194 <Field int windCnt2>
	//   52  128:invokevirtual   #261 <Method StringBuilder StringBuilder.append(int)>
	//   53  131:ldc2            #267 <String ", OutIdx=">
	//   54  134:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   55  137:aload_0         
	//   56  138:getfield        #110 <Field int outIdx>
	//   57  141:invokevirtual   #261 <Method StringBuilder StringBuilder.append(int)>
	//   58  144:ldc2            #269 <String ", Next=">
	//   59  147:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   60  150:aload_0         
	//   61  151:getfield        #134 <Field Edge next>
	//   62  154:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   63  157:ldc2            #271 <String ", Prev=">
	//   64  160:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   65  163:aload_0         
	//   66  164:getfield        #131 <Field Edge prev>
	//   67  167:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   68  170:ldc2            #273 <String ", NextInLML=">
	//   69  173:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   70  176:aload_0         
	//   71  177:getfield        #138 <Field Edge nextInLML>
	//   72  180:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   73  183:ldc2            #275 <String ", NextInAEL=">
	//   74  186:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   75  189:aload_0         
	//   76  190:getfield        #140 <Field Edge nextInAEL>
	//   77  193:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   78  196:ldc2            #277 <String ", PrevInAEL=">
	//   79  199:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   80  202:aload_0         
	//   81  203:getfield        #142 <Field Edge prevInAEL>
	//   82  206:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   83  209:ldc2            #279 <String ", NextInSEL=">
	//   84  212:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   85  215:aload_0         
	//   86  216:getfield        #281 <Field Edge nextInSEL>
	//   87  219:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   88  222:ldc2            #283 <String ", PrevInSEL=">
	//   89  225:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   90  228:aload_0         
	//   91  229:getfield        #285 <Field Edge prevInSEL>
	//   92  232:invokevirtual   #241 <Method StringBuilder StringBuilder.append(Object)>
	//   93  235:ldc2            #287 <String "]">
	//   94  238:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   95  241:invokevirtual   #289 <Method String StringBuilder.toString()>
	//   96  244:areturn         
	}

	public void updateDeltaX()
	{
		delta.setX(((Number) (Long.valueOf(top.getX() - bot.getX()))));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Point$LongPoint delta>
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field Point$LongPoint top>
	//    4    8:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//    5   11:aload_0         
	//    6   12:getfield        #71  <Field Point$LongPoint bot>
	//    7   15:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//    8   18:lsub            
	//    9   19:invokestatic    #210 <Method Long Long.valueOf(long)>
	//   10   22:invokevirtual   #214 <Method void Point$LongPoint.setX(Number)>
		delta.setY(((Number) (Long.valueOf(top.getY() - bot.getY()))));
	//   11   25:aload_0         
	//   12   26:getfield        #67  <Field Point$LongPoint delta>
	//   13   29:aload_0         
	//   14   30:getfield        #69  <Field Point$LongPoint top>
	//   15   33:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   16   36:aload_0         
	//   17   37:getfield        #71  <Field Point$LongPoint bot>
	//   18   40:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   19   43:lsub            
	//   20   44:invokestatic    #210 <Method Long Long.valueOf(long)>
	//   21   47:invokevirtual   #293 <Method void Point$LongPoint.setY(Number)>
		if(delta.getY() == 0L)
	//*  22   50:aload_0         
	//*  23   51:getfield        #67  <Field Point$LongPoint delta>
	//*  24   54:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//*  25   57:lconst_0        
	//*  26   58:lcmp            
	//*  27   59:ifne            70
		{
			deltaX = -3.4E+38D;
	//   28   62:aload_0         
	//   29   63:ldc2w           #12  <Double -3.4E+38D>
	//   30   66:putfield        #121 <Field double deltaX>
			return;
	//   31   69:return          
		} else
		{
			deltaX = (double)delta.getX() / (double)delta.getY();
	//   32   70:aload_0         
	//   33   71:aload_0         
	//   34   72:getfield        #67  <Field Point$LongPoint delta>
	//   35   75:invokevirtual   #79  <Method long Point$LongPoint.getX()>
	//   36   78:l2d             
	//   37   79:aload_0         
	//   38   80:getfield        #67  <Field Point$LongPoint delta>
	//   39   83:invokevirtual   #82  <Method long Point$LongPoint.getY()>
	//   40   86:l2d             
	//   41   87:ddiv            
	//   42   88:putfield        #121 <Field double deltaX>
			return;
	//   43   91:return          
		}
	}

	protected static final double HORIZONTAL = -3.4E+38D;
	private static final Logger LOGGER = Logger.getLogger(((Class) (com/itextpdf/text/pdf/parser/clipper/Edge)).getName());
	protected static final int SKIP = -2;
	protected static final int UNASSIGNED = -1;
	private final Point.LongPoint bot = new Point.LongPoint();
	private final Point.LongPoint current = new Point.LongPoint();
	private final Point.LongPoint delta = new Point.LongPoint();
	double deltaX;
	Edge next;
	Edge nextInAEL;
	Edge nextInLML;
	Edge nextInSEL;
	int outIdx;
	Clipper.PolyType polyTyp;
	Edge prev;
	Edge prevInAEL;
	Edge prevInSEL;
	Side side;
	private final Point.LongPoint top = new Point.LongPoint();
	int windCnt;
	int windCnt2;
	int windDelta;

	static 
	{
	//    0    0:ldc1            #2   <Class Edge>
	//    1    2:invokevirtual   #50  <Method String Class.getName()>
	//    2    5:invokestatic    #56  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #58  <Field Logger LOGGER>
	//*   4   11:return          
	}
}
