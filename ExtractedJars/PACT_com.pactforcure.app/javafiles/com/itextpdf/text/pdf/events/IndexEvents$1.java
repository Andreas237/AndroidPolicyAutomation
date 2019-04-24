// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.events;

import java.util.Comparator;

// Referenced classes of package com.itextpdf.text.pdf.events:
//			IndexEvents

class IndexEvents$1
	implements Comparator
{

	public int compare(try try1, try try2)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int i = ((int) (flag));
	//    2    3:iload           4
	//    3    5:istore_3        
		if(try1.getIn1() != null)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #27  <Method String IndexEvents$Entry.getIn1()>
	//*   6   10:ifnull          117
		{
			i = ((int) (flag));
	//    7   13:iload           4
	//    8   15:istore_3        
			if(try2.getIn1() != null)
	//*   9   16:aload_2         
	//*  10   17:invokevirtual   #27  <Method String IndexEvents$Entry.getIn1()>
	//*  11   20:ifnull          117
			{
				int j = try1.getIn1().compareToIgnoreCase(try2.getIn1());
	//   12   23:aload_1         
	//   13   24:invokevirtual   #27  <Method String IndexEvents$Entry.getIn1()>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #27  <Method String IndexEvents$Entry.getIn1()>
	//   16   31:invokevirtual   #33  <Method int String.compareToIgnoreCase(String)>
	//   17   34:istore          4
				i = j;
	//   18   36:iload           4
	//   19   38:istore_3        
				if(j == 0)
	//*  20   39:iload           4
	//*  21   41:ifne            117
				{
					i = j;
	//   22   44:iload           4
	//   23   46:istore_3        
					if(try1.getIn2() != null)
	//*  24   47:aload_1         
	//*  25   48:invokevirtual   #36  <Method String IndexEvents$Entry.getIn2()>
	//*  26   51:ifnull          117
					{
						i = j;
	//   27   54:iload           4
	//   28   56:istore_3        
						if(try2.getIn2() != null)
	//*  29   57:aload_2         
	//*  30   58:invokevirtual   #36  <Method String IndexEvents$Entry.getIn2()>
	//*  31   61:ifnull          117
						{
							int k = try1.getIn2().compareToIgnoreCase(try2.getIn2());
	//   32   64:aload_1         
	//   33   65:invokevirtual   #36  <Method String IndexEvents$Entry.getIn2()>
	//   34   68:aload_2         
	//   35   69:invokevirtual   #36  <Method String IndexEvents$Entry.getIn2()>
	//   36   72:invokevirtual   #33  <Method int String.compareToIgnoreCase(String)>
	//   37   75:istore          4
							i = k;
	//   38   77:iload           4
	//   39   79:istore_3        
							if(k == 0)
	//*  40   80:iload           4
	//*  41   82:ifne            117
							{
								i = k;
	//   42   85:iload           4
	//   43   87:istore_3        
								if(try1.getIn3() != null)
	//*  44   88:aload_1         
	//*  45   89:invokevirtual   #39  <Method String IndexEvents$Entry.getIn3()>
	//*  46   92:ifnull          117
								{
									i = k;
	//   47   95:iload           4
	//   48   97:istore_3        
									if(try2.getIn3() != null)
	//*  49   98:aload_2         
	//*  50   99:invokevirtual   #39  <Method String IndexEvents$Entry.getIn3()>
	//*  51  102:ifnull          117
										i = try1.getIn3().compareToIgnoreCase(try2.getIn3());
	//   52  105:aload_1         
	//   53  106:invokevirtual   #39  <Method String IndexEvents$Entry.getIn3()>
	//   54  109:aload_2         
	//   55  110:invokevirtual   #39  <Method String IndexEvents$Entry.getIn3()>
	//   56  113:invokevirtual   #33  <Method int String.compareToIgnoreCase(String)>
	//   57  116:istore_3        
								}
							}
						}
					}
				}
			}
		}
		return i;
	//   58  117:iload_3         
	//   59  118:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((try)obj, (try)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class IndexEvents$Entry>
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class IndexEvents$Entry>
	//    5    9:invokevirtual   #42  <Method int compare(IndexEvents$Entry, IndexEvents$Entry)>
	//    6   12:ireturn         
	}

	final IndexEvents this$0;

	IndexEvents$1()
	{
		this$0 = IndexEvents.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field IndexEvents this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
