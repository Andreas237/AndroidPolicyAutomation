// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			LocationTextExtractionStrategy, Vector

public static class LocationTextExtractionStrategy$TextChunkLocationDefaultImp
	implements LocationTextExtractionStrategy.TextChunkLocation
{

	public int compareTo(LocationTextExtractionStrategy.TextChunkLocation textchunklocation)
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
			int j = LocationTextExtractionStrategy.access$300(orientationMagnitude(), textchunklocation.orientationMagnitude());
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
				int k = LocationTextExtractionStrategy.access$300(distPerpendicular(), textchunklocation.distPerpendicular());
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
		return compareTo((LocationTextExtractionStrategy.TextChunkLocation)obj);
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

	public float distanceFromEndOf(LocationTextExtractionStrategy.TextChunkLocation textchunklocation)
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

	public boolean isAtWordBoundary(LocationTextExtractionStrategy.TextChunkLocation textchunklocation)
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

	public boolean sameLine(LocationTextExtractionStrategy.TextChunkLocation textchunklocation)
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

	public LocationTextExtractionStrategy$TextChunkLocationDefaultImp(Vector vector, Vector vector1, float f)
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
