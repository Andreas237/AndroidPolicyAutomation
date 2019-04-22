// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.Comparator;

public class StandardComparator
	implements Comparator
{

	private StandardComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static StandardComparator getComparator(Class class1)
	{
		return INSTANCE;
	//    0    0:getstatic       #16  <Field StandardComparator INSTANCE>
	//    1    3:areturn         
	}

	public int compare(Comparable comparable, Comparable comparable1)
	{
		return comparable.compareTo(((Object) (comparable1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #30  <Method int Comparable.compareTo(Object)>
	//    3    7:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Comparable)obj, (Comparable)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class Comparable>
	//    3    5:aload_2         
	//    4    6:checkcast       #26  <Class Comparable>
	//    5    9:invokevirtual   #34  <Method int compare(Comparable, Comparable)>
	//    6   12:ireturn         
	}

	private static StandardComparator INSTANCE = new StandardComparator();

	static 
	{
	//    0    0:new             #2   <Class StandardComparator>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void StandardComparator()>
	//    3    7:putstatic       #16  <Field StandardComparator INSTANCE>
	//*   4   10:return          
	}
}
