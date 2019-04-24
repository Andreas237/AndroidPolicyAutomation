// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			LongHashtable

static class LongHashtable$Entry
{

	protected Object clone()
	{
		int i = hash;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int hash>
	//    2    4:istore_1        
		long l = key;
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field long key>
	//    5    9:lstore_2        
		long l1 = value;
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field long value>
	//    8   14:lstore          4
		LongHashtable$Entry longhashtable$entry;
		if(next != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #27  <Field LongHashtable$Entry next>
	//*  11   20:ifnull          49
			longhashtable$entry = (LongHashtable$Entry)next.clone();
	//   12   23:aload_0         
	//   13   24:getfield        #27  <Field LongHashtable$Entry next>
	//   14   27:invokevirtual   #32  <Method Object clone()>
	//   15   30:checkcast       #2   <Class LongHashtable$Entry>
	//   16   33:astore          6
		else
	//*  17   35:new             #2   <Class LongHashtable$Entry>
	//*  18   38:dup             
	//*  19   39:iload_1         
	//*  20   40:lload_2         
	//*  21   41:lload           4
	//*  22   43:aload           6
	//*  23   45:invokespecial   #34  <Method void LongHashtable$Entry(int, long, long, LongHashtable$Entry)>
	//*  24   48:areturn         
			longhashtable$entry = null;
	//   25   49:aconst_null     
	//   26   50:astore          6
		return ((Object) (new LongHashtable$Entry(i, l, l1, longhashtable$entry)));
	//*  27   52:goto            35
	}

	public long getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long key>
	//    2    4:lreturn         
	}

	public long getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field long value>
	//    2    4:lreturn         
	}

	int hash;
	long key;
	LongHashtable$Entry next;
	long value;

	protected LongHashtable$Entry(int i, long l, long l1, LongHashtable$Entry longhashtable$entry)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		hash = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int hash>
		key = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #23  <Field long key>
		value = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #25  <Field long value>
		next = longhashtable$entry;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #27  <Field LongHashtable$Entry next>
	//   14   26:return          
	}
}
