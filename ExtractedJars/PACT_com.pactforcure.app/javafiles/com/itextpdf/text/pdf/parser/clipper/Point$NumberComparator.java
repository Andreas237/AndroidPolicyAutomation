// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;

import java.util.Comparator;

// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Point

private static class Point$NumberComparator
	implements Comparator
{

	public int compare(Number number, Number number1)
		throws ClassCastException
	{
		return ((Comparable)number).compareTo(((Object) (number1)));
	//    0    0:aload_1         
	//    1    1:checkcast       #23  <Class Comparable>
	//    2    4:aload_2         
	//    3    5:invokeinterface #27  <Method int Comparable.compareTo(Object)>
	//    4   10:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Number)obj, (Number)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class Number>
	//    3    5:aload_2         
	//    4    6:checkcast       #33  <Class Number>
	//    5    9:invokevirtual   #35  <Method int compare(Number, Number)>
	//    6   12:ireturn         
	}

	private Point$NumberComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	Point$NumberComparator(Point._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Point$NumberComparator()>
	//    2    4:return          
	}
}
