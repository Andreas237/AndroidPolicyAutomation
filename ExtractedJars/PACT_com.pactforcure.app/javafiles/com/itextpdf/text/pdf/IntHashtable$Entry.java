// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			IntHashtable

static class IntHashtable$Entry
{

	protected Object clone()
	{
		int i = hash;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int hash>
	//    2    4:istore_1        
		int j = key;
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field int key>
	//    5    9:istore_2        
		int k = value;
	//    6   10:aload_0         
	//    7   11:getfield        #24  <Field int value>
	//    8   14:istore_3        
		IntHashtable$Entry inthashtable$entry;
		if(next != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #26  <Field IntHashtable$Entry next>
	//*  11   19:ifnull          47
			inthashtable$entry = (IntHashtable$Entry)next.clone();
	//   12   22:aload_0         
	//   13   23:getfield        #26  <Field IntHashtable$Entry next>
	//   14   26:invokevirtual   #31  <Method Object clone()>
	//   15   29:checkcast       #2   <Class IntHashtable$Entry>
	//   16   32:astore          4
		else
	//*  17   34:new             #2   <Class IntHashtable$Entry>
	//*  18   37:dup             
	//*  19   38:iload_1         
	//*  20   39:iload_2         
	//*  21   40:iload_3         
	//*  22   41:aload           4
	//*  23   43:invokespecial   #33  <Method void IntHashtable$Entry(int, int, int, IntHashtable$Entry)>
	//*  24   46:areturn         
			inthashtable$entry = null;
	//   25   47:aconst_null     
	//   26   48:astore          4
		return ((Object) (new IntHashtable$Entry(i, j, k, inthashtable$entry)));
	//*  27   50:goto            34
	}

	public int getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int key>
	//    2    4:ireturn         
	}

	public int getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int value>
	//    2    4:ireturn         
	}

	int hash;
	int key;
	IntHashtable$Entry next;
	int value;

	protected IntHashtable$Entry(int i, int j, int k, IntHashtable$Entry inthashtable$entry)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		hash = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #20  <Field int hash>
		key = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #22  <Field int key>
		value = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int value>
		next = inthashtable$entry;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #26  <Field IntHashtable$Entry next>
	//   14   25:return          
	}
}
