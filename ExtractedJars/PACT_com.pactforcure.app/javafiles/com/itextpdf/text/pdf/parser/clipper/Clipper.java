// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Path, Paths, PolyTree

public interface Clipper
{
	public static final class ClipType extends Enum
	{

		public static ClipType valueOf(String s)
		{
			return (ClipType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$ClipType, s);
		//    0    0:ldc1            #2   <Class Clipper$ClipType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Clipper$ClipType>
		//    4    9:areturn         
		}

		public static ClipType[] values()
		{
			return (ClipType[])((ClipType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field Clipper$ClipType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$ClipType_3B_.clone()>
		//    2    6:checkcast       #46  <Class Clipper$ClipType[]>
		//    3    9:areturn         
		}

		private static final ClipType $VALUES[];
		public static final ClipType DIFFERENCE;
		public static final ClipType INTERSECTION;
		public static final ClipType UNION;
		public static final ClipType XOR;

		static 
		{
			INTERSECTION = new ClipType("INTERSECTION", 0);
		//    0    0:new             #2   <Class Clipper$ClipType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "INTERSECTION">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void Clipper$ClipType(String, int)>
		//    5   10:putstatic       #24  <Field Clipper$ClipType INTERSECTION>
			UNION = new ClipType("UNION", 1);
		//    6   13:new             #2   <Class Clipper$ClipType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "UNION">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void Clipper$ClipType(String, int)>
		//   11   23:putstatic       #27  <Field Clipper$ClipType UNION>
			DIFFERENCE = new ClipType("DIFFERENCE", 2);
		//   12   26:new             #2   <Class Clipper$ClipType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "DIFFERENCE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void Clipper$ClipType(String, int)>
		//   17   36:putstatic       #30  <Field Clipper$ClipType DIFFERENCE>
			XOR = new ClipType("XOR", 3);
		//   18   39:new             #2   <Class Clipper$ClipType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "XOR">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void Clipper$ClipType(String, int)>
		//   23   49:putstatic       #33  <Field Clipper$ClipType XOR>
			$VALUES = (new ClipType[] {
				INTERSECTION, UNION, DIFFERENCE, XOR
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       ClipType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field Clipper$ClipType INTERSECTION>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field Clipper$ClipType UNION>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field Clipper$ClipType DIFFERENCE>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field Clipper$ClipType XOR>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field Clipper$ClipType[] $VALUES>
		//*  43   83:return          
		}

		private ClipType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class Direction extends Enum
	{

		public static Direction valueOf(String s)
		{
			return (Direction)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$Direction, s);
		//    0    0:ldc1            #2   <Class Clipper$Direction>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Clipper$Direction>
		//    4    9:areturn         
		}

		public static Direction[] values()
		{
			return (Direction[])((Direction []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field Clipper$Direction[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$Direction_3B_.clone()>
		//    2    6:checkcast       #38  <Class Clipper$Direction[]>
		//    3    9:areturn         
		}

		private static final Direction $VALUES[];
		public static final Direction LEFT_TO_RIGHT;
		public static final Direction RIGHT_TO_LEFT;

		static 
		{
			RIGHT_TO_LEFT = new Direction("RIGHT_TO_LEFT", 0);
		//    0    0:new             #2   <Class Clipper$Direction>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "RIGHT_TO_LEFT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void Clipper$Direction(String, int)>
		//    5   10:putstatic       #22  <Field Clipper$Direction RIGHT_TO_LEFT>
			LEFT_TO_RIGHT = new Direction("LEFT_TO_RIGHT", 1);
		//    6   13:new             #2   <Class Clipper$Direction>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "LEFT_TO_RIGHT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void Clipper$Direction(String, int)>
		//   11   23:putstatic       #25  <Field Clipper$Direction LEFT_TO_RIGHT>
			$VALUES = (new Direction[] {
				RIGHT_TO_LEFT, LEFT_TO_RIGHT
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Direction[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field Clipper$Direction RIGHT_TO_LEFT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field Clipper$Direction LEFT_TO_RIGHT>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field Clipper$Direction[] $VALUES>
		//*  23   45:return          
		}

		private Direction(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class EndType extends Enum
	{

		public static EndType valueOf(String s)
		{
			return (EndType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$EndType, s);
		//    0    0:ldc1            #2   <Class Clipper$EndType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Clipper$EndType>
		//    4    9:areturn         
		}

		public static EndType[] values()
		{
			return (EndType[])((EndType []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field Clipper$EndType[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$EndType_3B_.clone()>
		//    2    6:checkcast       #50  <Class Clipper$EndType[]>
		//    3    9:areturn         
		}

		private static final EndType $VALUES[];
		public static final EndType CLOSED_LINE;
		public static final EndType CLOSED_POLYGON;
		public static final EndType OPEN_BUTT;
		public static final EndType OPEN_ROUND;
		public static final EndType OPEN_SQUARE;

		static 
		{
			CLOSED_POLYGON = new EndType("CLOSED_POLYGON", 0);
		//    0    0:new             #2   <Class Clipper$EndType>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "CLOSED_POLYGON">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void Clipper$EndType(String, int)>
		//    5   10:putstatic       #25  <Field Clipper$EndType CLOSED_POLYGON>
			CLOSED_LINE = new EndType("CLOSED_LINE", 1);
		//    6   13:new             #2   <Class Clipper$EndType>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "CLOSED_LINE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void Clipper$EndType(String, int)>
		//   11   23:putstatic       #28  <Field Clipper$EndType CLOSED_LINE>
			OPEN_BUTT = new EndType("OPEN_BUTT", 2);
		//   12   26:new             #2   <Class Clipper$EndType>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "OPEN_BUTT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void Clipper$EndType(String, int)>
		//   17   36:putstatic       #31  <Field Clipper$EndType OPEN_BUTT>
			OPEN_SQUARE = new EndType("OPEN_SQUARE", 3);
		//   18   39:new             #2   <Class Clipper$EndType>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "OPEN_SQUARE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void Clipper$EndType(String, int)>
		//   23   49:putstatic       #34  <Field Clipper$EndType OPEN_SQUARE>
			OPEN_ROUND = new EndType("OPEN_ROUND", 4);
		//   24   52:new             #2   <Class Clipper$EndType>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "OPEN_ROUND">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void Clipper$EndType(String, int)>
		//   29   62:putstatic       #37  <Field Clipper$EndType OPEN_ROUND>
			$VALUES = (new EndType[] {
				CLOSED_POLYGON, CLOSED_LINE, OPEN_BUTT, OPEN_SQUARE, OPEN_ROUND
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       EndType[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field Clipper$EndType CLOSED_POLYGON>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field Clipper$EndType CLOSED_LINE>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field Clipper$EndType OPEN_BUTT>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field Clipper$EndType OPEN_SQUARE>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field Clipper$EndType OPEN_ROUND>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field Clipper$EndType[] $VALUES>
		//*  53  102:return          
		}

		private EndType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class JoinType extends Enum
	{

		public static JoinType valueOf(String s)
		{
			return (JoinType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$JoinType, s);
		//    0    0:ldc1            #2   <Class Clipper$JoinType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Clipper$JoinType>
		//    4    9:areturn         
		}

		public static JoinType[] values()
		{
			return (JoinType[])((JoinType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field Clipper$JoinType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$JoinType_3B_.clone()>
		//    2    6:checkcast       #42  <Class Clipper$JoinType[]>
		//    3    9:areturn         
		}

		private static final JoinType $VALUES[];
		public static final JoinType BEVEL;
		public static final JoinType MITER;
		public static final JoinType ROUND;

		static 
		{
			BEVEL = new JoinType("BEVEL", 0);
		//    0    0:new             #2   <Class Clipper$JoinType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "BEVEL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void Clipper$JoinType(String, int)>
		//    5   10:putstatic       #23  <Field Clipper$JoinType BEVEL>
			ROUND = new JoinType("ROUND", 1);
		//    6   13:new             #2   <Class Clipper$JoinType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "ROUND">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void Clipper$JoinType(String, int)>
		//   11   23:putstatic       #26  <Field Clipper$JoinType ROUND>
			MITER = new JoinType("MITER", 2);
		//   12   26:new             #2   <Class Clipper$JoinType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "MITER">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void Clipper$JoinType(String, int)>
		//   17   36:putstatic       #29  <Field Clipper$JoinType MITER>
			$VALUES = (new JoinType[] {
				BEVEL, ROUND, MITER
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       JoinType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field Clipper$JoinType BEVEL>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field Clipper$JoinType ROUND>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field Clipper$JoinType MITER>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field Clipper$JoinType[] $VALUES>
		//*  33   64:return          
		}

		private JoinType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class PolyFillType extends Enum
	{

		public static PolyFillType valueOf(String s)
		{
			return (PolyFillType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$PolyFillType, s);
		//    0    0:ldc1            #2   <Class Clipper$PolyFillType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Clipper$PolyFillType>
		//    4    9:areturn         
		}

		public static PolyFillType[] values()
		{
			return (PolyFillType[])((PolyFillType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field Clipper$PolyFillType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$PolyFillType_3B_.clone()>
		//    2    6:checkcast       #46  <Class Clipper$PolyFillType[]>
		//    3    9:areturn         
		}

		private static final PolyFillType $VALUES[];
		public static final PolyFillType EVEN_ODD;
		public static final PolyFillType NEGATIVE;
		public static final PolyFillType NON_ZERO;
		public static final PolyFillType POSITIVE;

		static 
		{
			EVEN_ODD = new PolyFillType("EVEN_ODD", 0);
		//    0    0:new             #2   <Class Clipper$PolyFillType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "EVEN_ODD">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void Clipper$PolyFillType(String, int)>
		//    5   10:putstatic       #24  <Field Clipper$PolyFillType EVEN_ODD>
			NON_ZERO = new PolyFillType("NON_ZERO", 1);
		//    6   13:new             #2   <Class Clipper$PolyFillType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "NON_ZERO">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void Clipper$PolyFillType(String, int)>
		//   11   23:putstatic       #27  <Field Clipper$PolyFillType NON_ZERO>
			POSITIVE = new PolyFillType("POSITIVE", 2);
		//   12   26:new             #2   <Class Clipper$PolyFillType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "POSITIVE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void Clipper$PolyFillType(String, int)>
		//   17   36:putstatic       #30  <Field Clipper$PolyFillType POSITIVE>
			NEGATIVE = new PolyFillType("NEGATIVE", 3);
		//   18   39:new             #2   <Class Clipper$PolyFillType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "NEGATIVE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void Clipper$PolyFillType(String, int)>
		//   23   49:putstatic       #33  <Field Clipper$PolyFillType NEGATIVE>
			$VALUES = (new PolyFillType[] {
				EVEN_ODD, NON_ZERO, POSITIVE, NEGATIVE
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       PolyFillType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field Clipper$PolyFillType EVEN_ODD>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field Clipper$PolyFillType NON_ZERO>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field Clipper$PolyFillType POSITIVE>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field Clipper$PolyFillType NEGATIVE>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field Clipper$PolyFillType[] $VALUES>
		//*  43   83:return          
		}

		private PolyFillType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class PolyType extends Enum
	{

		public static PolyType valueOf(String s)
		{
			return (PolyType)Enum.valueOf(com/itextpdf/text/pdf/parser/clipper/Clipper$PolyType, s);
		//    0    0:ldc1            #2   <Class Clipper$PolyType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Clipper$PolyType>
		//    4    9:areturn         
		}

		public static PolyType[] values()
		{
			return (PolyType[])((PolyType []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field Clipper$PolyType[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.itextpdf.text.pdf.parser.clipper.Clipper$PolyType_3B_.clone()>
		//    2    6:checkcast       #38  <Class Clipper$PolyType[]>
		//    3    9:areturn         
		}

		private static final PolyType $VALUES[];
		public static final PolyType CLIP;
		public static final PolyType SUBJECT;

		static 
		{
			SUBJECT = new PolyType("SUBJECT", 0);
		//    0    0:new             #2   <Class Clipper$PolyType>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "SUBJECT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void Clipper$PolyType(String, int)>
		//    5   10:putstatic       #22  <Field Clipper$PolyType SUBJECT>
			CLIP = new PolyType("CLIP", 1);
		//    6   13:new             #2   <Class Clipper$PolyType>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "CLIP">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void Clipper$PolyType(String, int)>
		//   11   23:putstatic       #25  <Field Clipper$PolyType CLIP>
			$VALUES = (new PolyType[] {
				SUBJECT, CLIP
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       PolyType[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field Clipper$PolyType SUBJECT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field Clipper$PolyType CLIP>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field Clipper$PolyType[] $VALUES>
		//*  23   45:return          
		}

		private PolyType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static interface ZFillCallback
	{

		public abstract void zFill(Point.LongPoint longpoint, Point.LongPoint longpoint1, Point.LongPoint longpoint2, Point.LongPoint longpoint3, Point.LongPoint longpoint4);
	}


	public abstract boolean addPath(Path path, PolyType polytype, boolean flag);

	public abstract boolean addPaths(Paths paths, PolyType polytype, boolean flag);

	public abstract void clear();

	public abstract boolean execute(ClipType cliptype, Paths paths);

	public abstract boolean execute(ClipType cliptype, Paths paths, PolyFillType polyfilltype, PolyFillType polyfilltype1);

	public abstract boolean execute(ClipType cliptype, PolyTree polytree);

	public abstract boolean execute(ClipType cliptype, PolyTree polytree, PolyFillType polyfilltype, PolyFillType polyfilltype1);

	public static final int PRESERVE_COLINEAR = 4;
	public static final int REVERSE_SOLUTION = 1;
	public static final int STRICTLY_SIMPLE = 2;
}
