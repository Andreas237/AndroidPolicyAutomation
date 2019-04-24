// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.events;

import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.events:
//			IndexEvents

public class IndexEvents$Entry
{

	public void addPageNumberAndTag(int i, String s)
	{
		pagenumbers.add(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List pagenumbers>
	//    2    4:iload_1         
	//    3    5:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #56  <Method boolean List.add(Object)>
	//    5   13:pop             
		tags.add(((Object) (s)));
	//    6   14:aload_0         
	//    7   15:getfield        #33  <Field List tags>
	//    8   18:aload_2         
	//    9   19:invokeinterface #56  <Method boolean List.add(Object)>
	//   10   24:pop             
	//   11   25:return          
	}

	public String getIn1()
	{
		return in1;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String in1>
	//    2    4:areturn         
	}

	public String getIn2()
	{
		return in2;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String in2>
	//    2    4:areturn         
	}

	public String getIn3()
	{
		return in3;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String in3>
	//    2    4:areturn         
	}

	public String getKey()
	{
		return (new StringBuilder()).append(in1).append("!").append(in2).append("!").append(in3).toString();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field String in1>
	//    5   11:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #70  <String "!">
	//    7   16:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #37  <Field String in2>
	//   10   23:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #70  <String "!">
	//   12   28:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:aload_0         
	//   14   32:getfield        #39  <Field String in3>
	//   15   35:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   17   41:areturn         
	}

	public int getPageNumber()
	{
		int i = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_1        
		Integer integer = (Integer)IndexEvents.access$000(IndexEvents.this).get(((Object) (tag)));
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field IndexEvents this$0>
	//    4    6:invokestatic    #79  <Method Map IndexEvents.access$000(IndexEvents)>
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field String tag>
	//    7   13:invokeinterface #85  <Method Object Map.get(Object)>
	//    8   18:checkcast       #46  <Class Integer>
	//    9   21:astore_2        
		if(integer != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          31
			i = integer.intValue();
	//   12   26:aload_2         
	//   13   27:invokevirtual   #88  <Method int Integer.intValue()>
	//   14   30:istore_1        
		return i;
	//   15   31:iload_1         
	//   16   32:ireturn         
	}

	public List getPagenumbers()
	{
		return pagenumbers;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List pagenumbers>
	//    2    4:areturn         
	}

	public String getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String tag>
	//    2    4:areturn         
	}

	public List getTags()
	{
		return tags;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List tags>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #97  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void StringBuffer()>
	//    3    7:astore_2        
		stringbuffer.append(in1).append(' ');
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field String in1>
	//    7   13:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
	//    8   16:bipush          32
	//    9   18:invokevirtual   #104 <Method StringBuffer StringBuffer.append(char)>
	//   10   21:pop             
		stringbuffer.append(in2).append(' ');
	//   11   22:aload_2         
	//   12   23:aload_0         
	//   13   24:getfield        #37  <Field String in2>
	//   14   27:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
	//   15   30:bipush          32
	//   16   32:invokevirtual   #104 <Method StringBuffer StringBuffer.append(char)>
	//   17   35:pop             
		stringbuffer.append(in3).append(' ');
	//   18   36:aload_2         
	//   19   37:aload_0         
	//   20   38:getfield        #39  <Field String in3>
	//   21   41:invokevirtual   #101 <Method StringBuffer StringBuffer.append(String)>
	//   22   44:bipush          32
	//   23   46:invokevirtual   #104 <Method StringBuffer StringBuffer.append(char)>
	//   24   49:pop             
		for(int i = 0; i < pagenumbers.size(); i++)
	//*  25   50:iconst_0        
	//*  26   51:istore_1        
	//*  27   52:iload_1         
	//*  28   53:aload_0         
	//*  29   54:getfield        #31  <Field List pagenumbers>
	//*  30   57:invokeinterface #107 <Method int List.size()>
	//*  31   62:icmpge          92
			stringbuffer.append(pagenumbers.get(i)).append(' ');
	//   32   65:aload_2         
	//   33   66:aload_0         
	//   34   67:getfield        #31  <Field List pagenumbers>
	//   35   70:iload_1         
	//   36   71:invokeinterface #110 <Method Object List.get(int)>
	//   37   76:invokevirtual   #113 <Method StringBuffer StringBuffer.append(Object)>
	//   38   79:bipush          32
	//   39   81:invokevirtual   #104 <Method StringBuffer StringBuffer.append(char)>
	//   40   84:pop             

	//   41   85:iload_1         
	//   42   86:iconst_1        
	//   43   87:iadd            
	//   44   88:istore_1        
	//*  45   89:goto            52
		return stringbuffer.toString();
	//   46   92:aload_2         
	//   47   93:invokevirtual   #114 <Method String StringBuffer.toString()>
	//   48   96:areturn         
	}

	private String in1;
	private String in2;
	private String in3;
	private List pagenumbers;
	private String tag;
	private List tags;
	final IndexEvents this$0;

	public IndexEvents$Entry(String s, String s1, String s2, String s3)
	{
		this$0 = IndexEvents.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field IndexEvents this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
		pagenumbers = ((List) (new ArrayList()));
	//    5    9:aload_0         
	//    6   10:new             #28  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #29  <Method void ArrayList()>
	//    9   17:putfield        #31  <Field List pagenumbers>
		tags = ((List) (new ArrayList()));
	//   10   20:aload_0         
	//   11   21:new             #28  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #29  <Method void ArrayList()>
	//   14   28:putfield        #33  <Field List tags>
		in1 = s;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #35  <Field String in1>
		in2 = s1;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #37  <Field String in2>
		in3 = s2;
	//   21   41:aload_0         
	//   22   42:aload           4
	//   23   44:putfield        #39  <Field String in3>
		tag = s3;
	//   24   47:aload_0         
	//   25   48:aload           5
	//   26   50:putfield        #41  <Field String tag>
	//   27   53:return          
	}
}
