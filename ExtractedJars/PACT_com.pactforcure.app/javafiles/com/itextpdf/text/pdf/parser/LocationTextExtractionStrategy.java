// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			TextExtractionStrategy, TextRenderInfo, Matrix, LineSegment, 
//			ImageRenderInfo, Vector

public class LocationTextExtractionStrategy
	implements TextExtractionStrategy
{
	public static class TextChunk
		implements Comparable
	{

		private void printDiagnostics()
		{
			System.out.println((new StringBuilder()).append("Text (@").append(((Object) (location.getStartLocation()))).append(" -> ").append(((Object) (location.getEndLocation()))).append("): ").append(text).toString());
		//    0    0:getstatic       #51  <Field PrintStream System.out>
		//    1    3:new             #53  <Class StringBuilder>
		//    2    6:dup             
		//    3    7:invokespecial   #54  <Method void StringBuilder()>
		//    4   10:ldc1            #56  <String "Text (@">
		//    5   12:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//    6   15:aload_0         
		//    7   16:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    8   19:invokeinterface #66  <Method Vector LocationTextExtractionStrategy$TextChunkLocation.getStartLocation()>
		//    9   24:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
		//   10   27:ldc1            #71  <String " -> ">
		//   11   29:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   12   32:aload_0         
		//   13   33:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//   14   36:invokeinterface #74  <Method Vector LocationTextExtractionStrategy$TextChunkLocation.getEndLocation()>
		//   15   41:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
		//   16   44:ldc1            #76  <String "): ">
		//   17   46:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   18   49:aload_0         
		//   19   50:getfield        #21  <Field String text>
		//   20   53:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   21   56:invokevirtual   #80  <Method String StringBuilder.toString()>
		//   22   59:invokevirtual   #86  <Method void PrintStream.println(String)>
			System.out.println((new StringBuilder()).append("orientationMagnitude: ").append(location.orientationMagnitude()).toString());
		//   23   62:getstatic       #51  <Field PrintStream System.out>
		//   24   65:new             #53  <Class StringBuilder>
		//   25   68:dup             
		//   26   69:invokespecial   #54  <Method void StringBuilder()>
		//   27   72:ldc1            #88  <String "orientationMagnitude: ">
		//   28   74:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   29   77:aload_0         
		//   30   78:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//   31   81:invokeinterface #92  <Method int LocationTextExtractionStrategy$TextChunkLocation.orientationMagnitude()>
		//   32   86:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
		//   33   89:invokevirtual   #80  <Method String StringBuilder.toString()>
		//   34   92:invokevirtual   #86  <Method void PrintStream.println(String)>
			System.out.println((new StringBuilder()).append("distPerpendicular: ").append(location.distPerpendicular()).toString());
		//   35   95:getstatic       #51  <Field PrintStream System.out>
		//   36   98:new             #53  <Class StringBuilder>
		//   37  101:dup             
		//   38  102:invokespecial   #54  <Method void StringBuilder()>
		//   39  105:ldc1            #97  <String "distPerpendicular: ">
		//   40  107:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   41  110:aload_0         
		//   42  111:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//   43  114:invokeinterface #100 <Method int LocationTextExtractionStrategy$TextChunkLocation.distPerpendicular()>
		//   44  119:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
		//   45  122:invokevirtual   #80  <Method String StringBuilder.toString()>
		//   46  125:invokevirtual   #86  <Method void PrintStream.println(String)>
			System.out.println((new StringBuilder()).append("distParallel: ").append(location.distParallelStart()).toString());
		//   47  128:getstatic       #51  <Field PrintStream System.out>
		//   48  131:new             #53  <Class StringBuilder>
		//   49  134:dup             
		//   50  135:invokespecial   #54  <Method void StringBuilder()>
		//   51  138:ldc1            #102 <String "distParallel: ">
		//   52  140:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   53  143:aload_0         
		//   54  144:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//   55  147:invokeinterface #106 <Method float LocationTextExtractionStrategy$TextChunkLocation.distParallelStart()>
		//   56  152:invokevirtual   #109 <Method StringBuilder StringBuilder.append(float)>
		//   57  155:invokevirtual   #80  <Method String StringBuilder.toString()>
		//   58  158:invokevirtual   #86  <Method void PrintStream.println(String)>
		//   59  161:return          
		}

		private boolean sameLine(TextChunk textchunk)
		{
			return getLocation().sameLine(textchunk.getLocation());
		//    0    0:aload_0         
		//    1    1:invokevirtual   #113 <Method LocationTextExtractionStrategy$TextChunkLocation getLocation()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #113 <Method LocationTextExtractionStrategy$TextChunkLocation getLocation()>
		//    4    8:invokeinterface #116 <Method boolean LocationTextExtractionStrategy$TextChunkLocation.sameLine(LocationTextExtractionStrategy$TextChunkLocation)>
		//    5   13:ireturn         
		}

		public int compareTo(TextChunk textchunk)
		{
			return location.compareTo(((Object) (textchunk.location)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    2    4:aload_1         
		//    3    5:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    4    8:invokeinterface #121 <Method int LocationTextExtractionStrategy$TextChunkLocation.compareTo(Object)>
		//    5   13:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((TextChunk)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class LocationTextExtractionStrategy$TextChunk>
		//    3    5:invokevirtual   #123 <Method int compareTo(LocationTextExtractionStrategy$TextChunk)>
		//    4    8:ireturn         
		}

		public float distanceFromEndOf(TextChunk textchunk)
		{
			return location.distanceFromEndOf(textchunk.location);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    2    4:aload_1         
		//    3    5:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    4    8:invokeinterface #128 <Method float LocationTextExtractionStrategy$TextChunkLocation.distanceFromEndOf(LocationTextExtractionStrategy$TextChunkLocation)>
		//    5   13:freturn         
		}

		public float getCharSpaceWidth()
		{
			return location.getCharSpaceWidth();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    2    4:invokeinterface #131 <Method float LocationTextExtractionStrategy$TextChunkLocation.getCharSpaceWidth()>
		//    3    9:freturn         
		}

		public Vector getEndLocation()
		{
			return location.getEndLocation();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    2    4:invokeinterface #74  <Method Vector LocationTextExtractionStrategy$TextChunkLocation.getEndLocation()>
		//    3    9:areturn         
		}

		public TextChunkLocation getLocation()
		{
			return location;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    2    4:areturn         
		}

		public Vector getStartLocation()
		{
			return location.getStartLocation();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    2    4:invokeinterface #66  <Method Vector LocationTextExtractionStrategy$TextChunkLocation.getStartLocation()>
		//    3    9:areturn         
		}

		public String getText()
		{
			return text;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String text>
		//    2    4:areturn         
		}

		private final TextChunkLocation location;
		private final String text;


/*
		static String access$000(TextChunk textchunk)
		{
			return textchunk.text;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String text>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$100(TextChunk textchunk, TextChunk textchunk1)
		{
			return textchunk.sameLine(textchunk1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #40  <Method boolean sameLine(LocationTextExtractionStrategy$TextChunk)>
		//    3    5:ireturn         
		}

*/


/*
		static void access$200(TextChunk textchunk)
		{
			textchunk.printDiagnostics();
		//    0    0:aload_0         
		//    1    1:invokespecial   #45  <Method void printDiagnostics()>
			return;
		//    2    4:return          
		}

*/

		public TextChunk(String s, TextChunkLocation textchunklocation)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			text = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field String text>
			location = textchunklocation;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
		//    8   14:return          
		}

		public TextChunk(String s, Vector vector, Vector vector1, float f)
		{
			this(s, ((TextChunkLocation) (new TextChunkLocationDefaultImp(vector, vector1, f))));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:new             #27  <Class LocationTextExtractionStrategy$TextChunkLocationDefaultImp>
		//    3    5:dup             
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:fload           4
		//    7   10:invokespecial   #30  <Method void LocationTextExtractionStrategy$TextChunkLocationDefaultImp(Vector, Vector, float)>
		//    8   13:invokespecial   #32  <Method void LocationTextExtractionStrategy$TextChunk(String, LocationTextExtractionStrategy$TextChunkLocation)>
		//    9   16:return          
		}
	}

	public static interface TextChunkFilter
	{

		public abstract boolean accept(TextChunk textchunk);
	}

	public static interface TextChunkLocation
		extends Comparable
	{

		public abstract float distParallelEnd();

		public abstract float distParallelStart();

		public abstract int distPerpendicular();

		public abstract float distanceFromEndOf(TextChunkLocation textchunklocation);

		public abstract float getCharSpaceWidth();

		public abstract Vector getEndLocation();

		public abstract Vector getStartLocation();

		public abstract boolean isAtWordBoundary(TextChunkLocation textchunklocation);

		public abstract int orientationMagnitude();

		public abstract boolean sameLine(TextChunkLocation textchunklocation);
	}

	public static class TextChunkLocationDefaultImp
		implements TextChunkLocation
	{

		public int compareTo(TextChunkLocation textchunklocation)
		{
			int i;
			if(this == textchunklocation)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       9
			{
				i = 0;
		//    3    5:iconst_0        
		//    4    6:istore_2        
			} else
		//*   5    7:iload_2         
		//*   6    8:ireturn         
			{
				int j = LocationTextExtractionStrategy.compareInts(orientationMagnitude(), textchunklocation.orientationMagnitude());
		//    7    9:aload_0         
		//    8   10:invokevirtual   #83  <Method int orientationMagnitude()>
		//    9   13:aload_1         
		//   10   14:invokeinterface #84  <Method int LocationTextExtractionStrategy$TextChunkLocation.orientationMagnitude()>
		//   11   19:invokestatic    #88  <Method int LocationTextExtractionStrategy.access$300(int, int)>
		//   12   22:istore_3        
				i = j;
		//   13   23:iload_3         
		//   14   24:istore_2        
				if(j == 0)
		//*  15   25:iload_3         
		//*  16   26:ifne            7
				{
					int k = LocationTextExtractionStrategy.compareInts(distPerpendicular(), textchunklocation.distPerpendicular());
		//   17   29:aload_0         
		//   18   30:invokevirtual   #90  <Method int distPerpendicular()>
		//   19   33:aload_1         
		//   20   34:invokeinterface #91  <Method int LocationTextExtractionStrategy$TextChunkLocation.distPerpendicular()>
		//   21   39:invokestatic    #88  <Method int LocationTextExtractionStrategy.access$300(int, int)>
		//   22   42:istore_3        
					i = k;
		//   23   43:iload_3         
		//   24   44:istore_2        
					if(k == 0)
		//*  25   45:iload_3         
		//*  26   46:ifne            7
						return Float.compare(distParallelStart(), textchunklocation.distParallelStart());
		//   27   49:aload_0         
		//   28   50:invokevirtual   #93  <Method float distParallelStart()>
		//   29   53:aload_1         
		//   30   54:invokeinterface #94  <Method float LocationTextExtractionStrategy$TextChunkLocation.distParallelStart()>
		//   31   59:invokestatic    #100 <Method int Float.compare(float, float)>
		//   32   62:ireturn         
				}
			}
			return i;
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((TextChunkLocation)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #6   <Class LocationTextExtractionStrategy$TextChunkLocation>
		//    3    5:invokevirtual   #103 <Method int compareTo(LocationTextExtractionStrategy$TextChunkLocation)>
		//    4    8:ireturn         
		}

		public float distParallelEnd()
		{
			return distParallelEnd;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field float distParallelEnd>
		//    2    4:freturn         
		}

		public float distParallelStart()
		{
			return distParallelStart;
		//    0    0:aload_0         
		//    1    1:getfield        #75  <Field float distParallelStart>
		//    2    4:freturn         
		}

		public int distPerpendicular()
		{
			return distPerpendicular;
		//    0    0:aload_0         
		//    1    1:getfield        #69  <Field int distPerpendicular>
		//    2    4:ireturn         
		}

		public float distanceFromEndOf(TextChunkLocation textchunklocation)
		{
			return distParallelStart() - textchunklocation.distParallelEnd();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #93  <Method float distParallelStart()>
		//    2    4:aload_1         
		//    3    5:invokeinterface #107 <Method float LocationTextExtractionStrategy$TextChunkLocation.distParallelEnd()>
		//    4   10:fsub            
		//    5   11:freturn         
		}

		public float getCharSpaceWidth()
		{
			return charSpaceWidth;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field float charSpaceWidth>
		//    2    4:freturn         
		}

		public Vector getEndLocation()
		{
			return endLocation;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Vector endLocation>
		//    2    4:areturn         
		}

		public Vector getStartLocation()
		{
			return startLocation;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Vector startLocation>
		//    2    4:areturn         
		}

		public boolean isAtWordBoundary(TextChunkLocation textchunklocation)
		{
			float f;
			if(getCharSpaceWidth() >= 0.1F)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #114 <Method float getCharSpaceWidth()>
		//*   2    4:ldc1            #115 <Float 0.1F>
		//*   3    6:fcmpg           
		//*   4    7:ifge            12
		//*   5   10:iconst_0        
		//*   6   11:ireturn         
		//*   7   12:aload_0         
		//*   8   13:aload_1         
		//*   9   14:invokevirtual   #117 <Method float distanceFromEndOf(LocationTextExtractionStrategy$TextChunkLocation)>
		//*  10   17:fstore_2        
				if((f = distanceFromEndOf(textchunklocation)) < -getCharSpaceWidth() || f > getCharSpaceWidth() / 2.0F)
		//*  11   18:fload_2         
		//*  12   19:aload_0         
		//*  13   20:invokevirtual   #114 <Method float getCharSpaceWidth()>
		//*  14   23:fneg            
		//*  15   24:fcmpg           
		//*  16   25:iflt            39
		//*  17   28:fload_2         
		//*  18   29:aload_0         
		//*  19   30:invokevirtual   #114 <Method float getCharSpaceWidth()>
		//*  20   33:fconst_2        
		//*  21   34:fdiv            
		//*  22   35:fcmpl           
		//*  23   36:ifle            10
					return true;
		//   24   39:iconst_1        
		//   25   40:ireturn         
			return false;
		}

		public int orientationMagnitude()
		{
			return orientationMagnitude;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field int orientationMagnitude>
		//    2    4:ireturn         
		}

		public boolean sameLine(TextChunkLocation textchunklocation)
		{
			return orientationMagnitude() == textchunklocation.orientationMagnitude() && distPerpendicular() == textchunklocation.distPerpendicular();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #83  <Method int orientationMagnitude()>
		//    2    4:aload_1         
		//    3    5:invokeinterface #84  <Method int LocationTextExtractionStrategy$TextChunkLocation.orientationMagnitude()>
		//    4   10:icmpne          28
		//    5   13:aload_0         
		//    6   14:invokevirtual   #90  <Method int distPerpendicular()>
		//    7   17:aload_1         
		//    8   18:invokeinterface #91  <Method int LocationTextExtractionStrategy$TextChunkLocation.distPerpendicular()>
		//    9   23:icmpne          28
		//   10   26:iconst_1        
		//   11   27:ireturn         
		//   12   28:iconst_0        
		//   13   29:ireturn         
		}

		private final float charSpaceWidth;
		private final float distParallelEnd;
		private final float distParallelStart;
		private final int distPerpendicular;
		private final Vector endLocation;
		private final int orientationMagnitude;
		private final Vector orientationVector;
		private final Vector startLocation;

		public TextChunkLocationDefaultImp(Vector vector, Vector vector1, float f)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			startLocation = vector;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #27  <Field Vector startLocation>
			endLocation = vector1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #29  <Field Vector endLocation>
			charSpaceWidth = f;
		//    8   14:aload_0         
		//    9   15:fload_3         
		//   10   16:putfield        #31  <Field float charSpaceWidth>
			Vector vector3 = vector1.subtract(vector);
		//   11   19:aload_2         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #37  <Method Vector Vector.subtract(Vector)>
		//   14   24:astore          5
			Vector vector2 = vector3;
		//   15   26:aload           5
		//   16   28:astore          4
			if(vector3.length() == 0.0F)
		//*  17   30:aload           5
		//*  18   32:invokevirtual   #41  <Method float Vector.length()>
		//*  19   35:fconst_0        
		//*  20   36:fcmpl           
		//*  21   37:ifne            52
				vector2 = new Vector(1.0F, 0.0F, 0.0F);
		//   22   40:new             #33  <Class Vector>
		//   23   43:dup             
		//   24   44:fconst_1        
		//   25   45:fconst_0        
		//   26   46:fconst_0        
		//   27   47:invokespecial   #44  <Method void Vector(float, float, float)>
		//   28   50:astore          4
			orientationVector = vector2.normalize();
		//   29   52:aload_0         
		//   30   53:aload           4
		//   31   55:invokevirtual   #48  <Method Vector Vector.normalize()>
		//   32   58:putfield        #50  <Field Vector orientationVector>
			orientationMagnitude = (int)(Math.atan2(orientationVector.get(1), orientationVector.get(0)) * 1000D);
		//   33   61:aload_0         
		//   34   62:aload_0         
		//   35   63:getfield        #50  <Field Vector orientationVector>
		//   36   66:iconst_1        
		//   37   67:invokevirtual   #54  <Method float Vector.get(int)>
		//   38   70:f2d             
		//   39   71:aload_0         
		//   40   72:getfield        #50  <Field Vector orientationVector>
		//   41   75:iconst_0        
		//   42   76:invokevirtual   #54  <Method float Vector.get(int)>
		//   43   79:f2d             
		//   44   80:invokestatic    #60  <Method double Math.atan2(double, double)>
		//   45   83:ldc2w           #61  <Double 1000D>
		//   46   86:dmul            
		//   47   87:d2i             
		//   48   88:putfield        #64  <Field int orientationMagnitude>
			distPerpendicular = (int)vector.subtract(new Vector(0.0F, 0.0F, 1.0F)).cross(orientationVector).get(2);
		//   49   91:aload_0         
		//   50   92:aload_1         
		//   51   93:new             #33  <Class Vector>
		//   52   96:dup             
		//   53   97:fconst_0        
		//   54   98:fconst_0        
		//   55   99:fconst_1        
		//   56  100:invokespecial   #44  <Method void Vector(float, float, float)>
		//   57  103:invokevirtual   #37  <Method Vector Vector.subtract(Vector)>
		//   58  106:aload_0         
		//   59  107:getfield        #50  <Field Vector orientationVector>
		//   60  110:invokevirtual   #67  <Method Vector Vector.cross(Vector)>
		//   61  113:iconst_2        
		//   62  114:invokevirtual   #54  <Method float Vector.get(int)>
		//   63  117:f2i             
		//   64  118:putfield        #69  <Field int distPerpendicular>
			distParallelStart = orientationVector.dot(vector);
		//   65  121:aload_0         
		//   66  122:aload_0         
		//   67  123:getfield        #50  <Field Vector orientationVector>
		//   68  126:aload_1         
		//   69  127:invokevirtual   #73  <Method float Vector.dot(Vector)>
		//   70  130:putfield        #75  <Field float distParallelStart>
			distParallelEnd = orientationVector.dot(vector1);
		//   71  133:aload_0         
		//   72  134:aload_0         
		//   73  135:getfield        #50  <Field Vector orientationVector>
		//   74  138:aload_2         
		//   75  139:invokevirtual   #73  <Method float Vector.dot(Vector)>
		//   76  142:putfield        #77  <Field float distParallelEnd>
		//   77  145:return          
		}
	}

	public static interface TextChunkLocationStrategy
	{

		public abstract TextChunkLocation createLocation(TextRenderInfo textrenderinfo, LineSegment linesegment);
	}


	public LocationTextExtractionStrategy()
	{
		this(new TextChunkLocationStrategy() {

			public TextChunkLocation createLocation(TextRenderInfo textrenderinfo, LineSegment linesegment)
			{
				return ((TextChunkLocation) (new TextChunkLocationDefaultImp(linesegment.getStartPoint(), linesegment.getEndPoint(), textrenderinfo.getSingleSpaceWidth())));
			//    0    0:new             #17  <Class LocationTextExtractionStrategy$TextChunkLocationDefaultImp>
			//    1    3:dup             
			//    2    4:aload_2         
			//    3    5:invokevirtual   #23  <Method Vector LineSegment.getStartPoint()>
			//    4    8:aload_2         
			//    5    9:invokevirtual   #26  <Method Vector LineSegment.getEndPoint()>
			//    6   12:aload_1         
			//    7   13:invokevirtual   #32  <Method float TextRenderInfo.getSingleSpaceWidth()>
			//    8   16:invokespecial   #35  <Method void LocationTextExtractionStrategy$TextChunkLocationDefaultImp(Vector, Vector, float)>
			//    9   19:areturn         
			}

		}
);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class LocationTextExtractionStrategy$1>
	//    2    4:dup             
	//    3    5:invokespecial   #38  <Method void LocationTextExtractionStrategy$1()>
	//    4    8:invokespecial   #41  <Method void LocationTextExtractionStrategy(LocationTextExtractionStrategy$TextChunkLocationStrategy)>
	//    5   11:return          
	}

	public LocationTextExtractionStrategy(TextChunkLocationStrategy textchunklocationstrategy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		locationalResult = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #44  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void ArrayList()>
	//    6   12:putfield        #47  <Field List locationalResult>
		tclStrat = textchunklocationstrategy;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #49  <Field LocationTextExtractionStrategy$TextChunkLocationStrategy tclStrat>
	//   10   20:return          
	}

	private static int compareInts(int i, int j)
	{
		if(i == j)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpne          7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		return i >= j ? 1 : -1;
	//    5    7:iload_0         
	//    6    8:iload_1         
	//    7    9:icmpge          14
	//    8   12:iconst_m1       
	//    9   13:ireturn         
	//   10   14:iconst_1        
	//   11   15:ireturn         
	}

	private void dumpState()
	{
		for(Iterator iterator = locationalResult.iterator(); iterator.hasNext(); System.out.println())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List locationalResult>
	//*   2    4:invokeinterface #61  <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            40
			((TextChunk)iterator.next()).printDiagnostics();
	//    7   19:aload_1         
	//    8   20:invokeinterface #71  <Method Object Iterator.next()>
	//    9   25:checkcast       #10  <Class LocationTextExtractionStrategy$TextChunk>
	//   10   28:invokestatic    #75  <Method void LocationTextExtractionStrategy$TextChunk.access$200(LocationTextExtractionStrategy$TextChunk)>

	//   11   31:getstatic       #81  <Field PrintStream System.out>
	//   12   34:invokevirtual   #86  <Method void PrintStream.println()>
	//*  13   37:goto            10
	//   14   40:return          
	}

	private boolean endsWithSpace(String s)
	{
		while(s.length() == 0 || s.charAt(s.length() - 1) != ' ') 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #94  <Method int String.length()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:aload_1         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #94  <Method int String.length()>
	//    8   14:iconst_1        
	//    9   15:isub            
	//   10   16:invokevirtual   #98  <Method char String.charAt(int)>
	//   11   19:bipush          32
	//   12   21:icmpne          7
		return true;
	//   13   24:iconst_1        
	//   14   25:ireturn         
	}

	private List filterTextChunks(List list, TextChunkFilter textchunkfilter)
	{
		if(textchunkfilter == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return list;
	//    2    4:aload_1         
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList();
	//    4    6:new             #44  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #45  <Method void ArrayList()>
	//    7   13:astore_3        
		list = ((List) (list.iterator()));
	//    8   14:aload_1         
	//    9   15:invokeinterface #61  <Method Iterator List.iterator()>
	//   10   20:astore_1        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   11   21:aload_1         
	//   12   22:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            64
			TextChunk textchunk = (TextChunk)((Iterator) (list)).next();
	//   14   30:aload_1         
	//   15   31:invokeinterface #71  <Method Object Iterator.next()>
	//   16   36:checkcast       #10  <Class LocationTextExtractionStrategy$TextChunk>
	//   17   39:astore          4
			if(textchunkfilter.accept(textchunk))
	//*  18   41:aload_2         
	//*  19   42:aload           4
	//*  20   44:invokeinterface #104 <Method boolean LocationTextExtractionStrategy$TextChunkFilter.accept(LocationTextExtractionStrategy$TextChunk)>
	//*  21   49:ifeq            21
				((List) (arraylist)).add(((Object) (textchunk)));
	//   22   52:aload_3         
	//   23   53:aload           4
	//   24   55:invokeinterface #108 <Method boolean List.add(Object)>
	//   25   60:pop             
		} while(true);
	//   26   61:goto            21
		return ((List) (arraylist));
	//   27   64:aload_3         
	//   28   65:areturn         
	}

	private boolean startsWithSpace(String s)
	{
		while(s.length() == 0 || s.charAt(0) != ' ') 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #94  <Method int String.length()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #98  <Method char String.charAt(int)>
	//    8   14:bipush          32
	//    9   16:icmpne          7
		return true;
	//   10   19:iconst_1        
	//   11   20:ireturn         
	}

	public void beginTextBlock()
	{
	//    0    0:return          
	}

	public void endTextBlock()
	{
	//    0    0:return          
	}

	public String getResultantText()
	{
		return getResultantText(((TextChunkFilter) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #118 <Method String getResultantText(LocationTextExtractionStrategy$TextChunkFilter)>
	//    3    5:areturn         
	}

	public String getResultantText(TextChunkFilter textchunkfilter)
	{
		if(DUMP_STATE)
	//*   0    0:getstatic       #34  <Field boolean DUMP_STATE>
	//*   1    3:ifeq            10
			dumpState();
	//    2    6:aload_0         
	//    3    7:invokespecial   #120 <Method void dumpState()>
		List list = filterTextChunks(locationalResult, textchunkfilter);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field List locationalResult>
	//    7   15:aload_1         
	//    8   16:invokespecial   #122 <Method List filterTextChunks(List, LocationTextExtractionStrategy$TextChunkFilter)>
	//    9   19:astore_2        
		Collections.sort(list);
	//   10   20:aload_2         
	//   11   21:invokestatic    #128 <Method void Collections.sort(List)>
		StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #130 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #131 <Method void StringBuilder()>
	//   15   31:astore_3        
		textchunkfilter = null;
	//   16   32:aconst_null     
	//   17   33:astore_1        
		Iterator iterator = list.iterator();
	//   18   34:aload_2         
	//   19   35:invokeinterface #61  <Method Iterator List.iterator()>
	//   20   40:astore          4
		while(iterator.hasNext()) 
	//*  21   42:aload           4
	//*  22   44:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//*  23   49:ifeq            158
		{
			TextChunk textchunk = (TextChunk)iterator.next();
	//   24   52:aload           4
	//   25   54:invokeinterface #71  <Method Object Iterator.next()>
	//   26   59:checkcast       #10  <Class LocationTextExtractionStrategy$TextChunk>
	//   27   62:astore_2        
			if(textchunkfilter == null)
	//*  28   63:aload_1         
	//*  29   64:ifnonnull       81
				stringbuilder.append(textchunk.text);
	//   30   67:aload_3         
	//   31   68:aload_2         
	//   32   69:invokestatic    #135 <Method String LocationTextExtractionStrategy$TextChunk.access$000(LocationTextExtractionStrategy$TextChunk)>
	//   33   72:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   34   75:pop             
			else
	//*  35   76:aload_2         
	//*  36   77:astore_1        
	//*  37   78:goto            42
			if(textchunk.sameLine(((TextChunk) (textchunkfilter))))
	//*  38   81:aload_2         
	//*  39   82:aload_1         
	//*  40   83:invokestatic    #143 <Method boolean LocationTextExtractionStrategy$TextChunk.access$100(LocationTextExtractionStrategy$TextChunk, LocationTextExtractionStrategy$TextChunk)>
	//*  41   86:ifeq            139
			{
				if(isChunkAtWordBoundary(textchunk, ((TextChunk) (textchunkfilter))) && !startsWithSpace(textchunk.text) && !endsWithSpace(((TextChunk) (textchunkfilter)).text))
	//*  42   89:aload_0         
	//*  43   90:aload_2         
	//*  44   91:aload_1         
	//*  45   92:invokevirtual   #146 <Method boolean isChunkAtWordBoundary(LocationTextExtractionStrategy$TextChunk, LocationTextExtractionStrategy$TextChunk)>
	//*  46   95:ifeq            127
	//*  47   98:aload_0         
	//*  48   99:aload_2         
	//*  49  100:invokestatic    #135 <Method String LocationTextExtractionStrategy$TextChunk.access$000(LocationTextExtractionStrategy$TextChunk)>
	//*  50  103:invokespecial   #148 <Method boolean startsWithSpace(String)>
	//*  51  106:ifne            127
	//*  52  109:aload_0         
	//*  53  110:aload_1         
	//*  54  111:invokestatic    #135 <Method String LocationTextExtractionStrategy$TextChunk.access$000(LocationTextExtractionStrategy$TextChunk)>
	//*  55  114:invokespecial   #150 <Method boolean endsWithSpace(String)>
	//*  56  117:ifne            127
					stringbuilder.append(' ');
	//   57  120:aload_3         
	//   58  121:bipush          32
	//   59  123:invokevirtual   #153 <Method StringBuilder StringBuilder.append(char)>
	//   60  126:pop             
				stringbuilder.append(textchunk.text);
	//   61  127:aload_3         
	//   62  128:aload_2         
	//   63  129:invokestatic    #135 <Method String LocationTextExtractionStrategy$TextChunk.access$000(LocationTextExtractionStrategy$TextChunk)>
	//   64  132:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   65  135:pop             
			} else
	//*  66  136:goto            76
			{
				stringbuilder.append('\n');
	//   67  139:aload_3         
	//   68  140:bipush          10
	//   69  142:invokevirtual   #153 <Method StringBuilder StringBuilder.append(char)>
	//   70  145:pop             
				stringbuilder.append(textchunk.text);
	//   71  146:aload_3         
	//   72  147:aload_2         
	//   73  148:invokestatic    #135 <Method String LocationTextExtractionStrategy$TextChunk.access$000(LocationTextExtractionStrategy$TextChunk)>
	//   74  151:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   75  154:pop             
			}
			textchunkfilter = ((TextChunkFilter) (textchunk));
		}
	//*  76  155:goto            76
		return stringbuilder.toString();
	//   77  158:aload_3         
	//   78  159:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   79  162:areturn         
	}

	protected boolean isChunkAtWordBoundary(TextChunk textchunk, TextChunk textchunk1)
	{
		return textchunk.getLocation().isAtWordBoundary(textchunk1.getLocation());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #160 <Method LocationTextExtractionStrategy$TextChunkLocation LocationTextExtractionStrategy$TextChunk.getLocation()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #160 <Method LocationTextExtractionStrategy$TextChunkLocation LocationTextExtractionStrategy$TextChunk.getLocation()>
	//    4    8:invokeinterface #164 <Method boolean LocationTextExtractionStrategy$TextChunkLocation.isAtWordBoundary(LocationTextExtractionStrategy$TextChunkLocation)>
	//    5   13:ireturn         
	}

	public void renderImage(ImageRenderInfo imagerenderinfo)
	{
	//    0    0:return          
	}

	public void renderText(TextRenderInfo textrenderinfo)
	{
		LineSegment linesegment1 = textrenderinfo.getBaseline();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #174 <Method LineSegment TextRenderInfo.getBaseline()>
	//    2    4:astore_3        
		LineSegment linesegment = linesegment1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(textrenderinfo.getRise() != 0.0F)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #178 <Method float TextRenderInfo.getRise()>
	//*   7   11:fconst_0        
	//*   8   12:fcmpl           
	//*   9   13:ifeq            34
			linesegment = linesegment1.transformBy(new Matrix(0.0F, -textrenderinfo.getRise()));
	//   10   16:aload_3         
	//   11   17:new             #180 <Class Matrix>
	//   12   20:dup             
	//   13   21:fconst_0        
	//   14   22:aload_1         
	//   15   23:invokevirtual   #178 <Method float TextRenderInfo.getRise()>
	//   16   26:fneg            
	//   17   27:invokespecial   #183 <Method void Matrix(float, float)>
	//   18   30:invokevirtual   #189 <Method LineSegment LineSegment.transformBy(Matrix)>
	//   19   33:astore_2        
		textrenderinfo = ((TextRenderInfo) (new TextChunk(textrenderinfo.getText(), tclStrat.createLocation(textrenderinfo, linesegment))));
	//   20   34:new             #10  <Class LocationTextExtractionStrategy$TextChunk>
	//   21   37:dup             
	//   22   38:aload_1         
	//   23   39:invokevirtual   #192 <Method String TextRenderInfo.getText()>
	//   24   42:aload_0         
	//   25   43:getfield        #49  <Field LocationTextExtractionStrategy$TextChunkLocationStrategy tclStrat>
	//   26   46:aload_1         
	//   27   47:aload_2         
	//   28   48:invokeinterface #196 <Method LocationTextExtractionStrategy$TextChunkLocation LocationTextExtractionStrategy$TextChunkLocationStrategy.createLocation(TextRenderInfo, LineSegment)>
	//   29   53:invokespecial   #199 <Method void LocationTextExtractionStrategy$TextChunk(String, LocationTextExtractionStrategy$TextChunkLocation)>
	//   30   56:astore_1        
		locationalResult.add(((Object) (textrenderinfo)));
	//   31   57:aload_0         
	//   32   58:getfield        #47  <Field List locationalResult>
	//   33   61:aload_1         
	//   34   62:invokeinterface #108 <Method boolean List.add(Object)>
	//   35   67:pop             
	//   36   68:return          
	}

	static boolean DUMP_STATE = false;
	private final List locationalResult;
	private final TextChunkLocationStrategy tclStrat;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #34  <Field boolean DUMP_STATE>
	//*   2    4:return          
	}


/*
	static int access$300(int i, int j)
	{
		return compareInts(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #54  <Method int compareInts(int, int)>
	//    3    5:ireturn         
	}

*/
}
