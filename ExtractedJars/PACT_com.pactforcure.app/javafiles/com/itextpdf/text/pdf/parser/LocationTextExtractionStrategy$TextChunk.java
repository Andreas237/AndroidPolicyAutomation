// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import java.io.PrintStream;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			LocationTextExtractionStrategy, Vector

public static class LocationTextExtractionStrategy$TextChunk
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

	private boolean sameLine(LocationTextExtractionStrategy$TextChunk locationtextextractionstrategy$textchunk)
	{
		return getLocation().sameLine(locationtextextractionstrategy$textchunk.getLocation());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method LocationTextExtractionStrategy$TextChunkLocation getLocation()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #113 <Method LocationTextExtractionStrategy$TextChunkLocation getLocation()>
	//    4    8:invokeinterface #116 <Method boolean LocationTextExtractionStrategy$TextChunkLocation.sameLine(LocationTextExtractionStrategy$TextChunkLocation)>
	//    5   13:ireturn         
	}

	public int compareTo(LocationTextExtractionStrategy$TextChunk locationtextextractionstrategy$textchunk)
	{
		return location.compareTo(((Object) (locationtextextractionstrategy$textchunk.location)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
	//    2    4:aload_1         
	//    3    5:getfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
	//    4    8:invokeinterface #121 <Method int LocationTextExtractionStrategy$TextChunkLocation.compareTo(Object)>
	//    5   13:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((LocationTextExtractionStrategy$TextChunk)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class LocationTextExtractionStrategy$TextChunk>
	//    3    5:invokevirtual   #123 <Method int compareTo(LocationTextExtractionStrategy$TextChunk)>
	//    4    8:ireturn         
	}

	public float distanceFromEndOf(LocationTextExtractionStrategy$TextChunk locationtextextractionstrategy$textchunk)
	{
		return location.distanceFromEndOf(locationtextextractionstrategy$textchunk.location);
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

	public ocation getLocation()
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

	private final ocation location;
	private final String text;


/*
	static String access$000(LocationTextExtractionStrategy$TextChunk locationtextextractionstrategy$textchunk)
	{
		return locationtextextractionstrategy$textchunk.text;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String text>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$100(LocationTextExtractionStrategy$TextChunk locationtextextractionstrategy$textchunk, LocationTextExtractionStrategy$TextChunk locationtextextractionstrategy$textchunk1)
	{
		return locationtextextractionstrategy$textchunk.sameLine(locationtextextractionstrategy$textchunk1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method boolean sameLine(LocationTextExtractionStrategy$TextChunk)>
	//    3    5:ireturn         
	}

*/


/*
	static void access$200(LocationTextExtractionStrategy$TextChunk locationtextextractionstrategy$textchunk)
	{
		locationtextextractionstrategy$textchunk.printDiagnostics();
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void printDiagnostics()>
		return;
	//    2    4:return          
	}

*/

	public LocationTextExtractionStrategy$TextChunk(String s, ocation ocation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		text = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String text>
		location = ocation;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field LocationTextExtractionStrategy$TextChunkLocation location>
	//    8   14:return          
	}

	public LocationTextExtractionStrategy$TextChunk(String s, Vector vector, Vector vector1, float f)
	{
		this(s, ((ocation) (new ocationDefaultImp(vector, vector1, f))));
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
