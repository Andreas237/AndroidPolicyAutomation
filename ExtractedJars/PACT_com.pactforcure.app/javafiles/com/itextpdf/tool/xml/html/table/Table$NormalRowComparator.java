// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html.table;

import java.util.Comparator;

// Referenced classes of package com.itextpdf.tool.xml.html.table:
//			Table, TableRowElement

private final class Table$NormalRowComparator
	implements Comparator
{

	public int compare(TableRowElement tablerowelement, TableRowElement tablerowelement1)
	{
		return tablerowelement.getPlace().getNormal().compareTo(tablerowelement1.getPlace().getNormal());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method TableRowElement$Place TableRowElement.getPlace()>
	//    2    4:invokevirtual   #37  <Method Integer TableRowElement$Place.getNormal()>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #31  <Method TableRowElement$Place TableRowElement.getPlace()>
	//    5   11:invokevirtual   #37  <Method Integer TableRowElement$Place.getNormal()>
	//    6   14:invokevirtual   #43  <Method int Integer.compareTo(Integer)>
	//    7   17:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((TableRowElement)obj, (TableRowElement)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class TableRowElement>
	//    3    5:aload_2         
	//    4    6:checkcast       #27  <Class TableRowElement>
	//    5    9:invokevirtual   #46  <Method int compare(TableRowElement, TableRowElement)>
	//    6   12:ireturn         
	}

	final Table this$0;

	private Table$NormalRowComparator()
	{
		this$0 = Table.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Table this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	Table$NormalRowComparator(Table._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void Table$NormalRowComparator(Table)>
	//    3    5:return          
	}
}
