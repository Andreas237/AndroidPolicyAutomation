// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

public class EntryXIndexComparator
	implements Comparator
{

	public EntryXIndexComparator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public int compare(Entry entry, Entry entry1)
	{
		return entry.getXIndex() - entry1.getXIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method int Entry.getXIndex()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #20  <Method int Entry.getXIndex()>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Entry)obj, (Entry)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class Entry>
	//    3    5:aload_2         
	//    4    6:checkcast       #16  <Class Entry>
	//    5    9:invokevirtual   #23  <Method int compare(Entry, Entry)>
	//    6   12:ireturn         
	}
}
