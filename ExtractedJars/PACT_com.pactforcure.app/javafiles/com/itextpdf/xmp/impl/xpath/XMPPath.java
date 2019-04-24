// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl.xpath;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.xmp.impl.xpath:
//			XMPPathSegment

public class XMPPath
{

	public XMPPath()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		segments = ((List) (new ArrayList(5)));
	//    2    4:aload_0         
	//    3    5:new             #30  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iconst_5        
	//    6   10:invokespecial   #33  <Method void ArrayList(int)>
	//    7   13:putfield        #35  <Field List segments>
	//    8   16:return          
	}

	public void add(XMPPathSegment xmppathsegment)
	{
		segments.add(((Object) (xmppathsegment)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List segments>
	//    2    4:aload_1         
	//    3    5:invokeinterface #43  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public XMPPathSegment getSegment(int i)
	{
		return (XMPPathSegment)segments.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List segments>
	//    2    4:iload_1         
	//    3    5:invokeinterface #49  <Method Object List.get(int)>
	//    4   10:checkcast       #51  <Class XMPPathSegment>
	//    5   13:areturn         
	}

	public int size()
	{
		return segments.size();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List segments>
	//    2    4:invokeinterface #55  <Method int List.size()>
	//    3    9:ireturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #59  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringBuffer()>
	//    3    7:astore_3        
		for(int i = 1; i < size(); i++)
	//*   4    8:iconst_1        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #61  <Method int size()>
	//*   9   15:icmpge          73
		{
			stringbuffer.append(((Object) (getSegment(i))));
	//   10   18:aload_3         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #63  <Method XMPPathSegment getSegment(int)>
	//   14   24:invokevirtual   #67  <Method StringBuffer StringBuffer.append(Object)>
	//   15   27:pop             
			if(i >= size() - 1)
				continue;
	//   16   28:iload_1         
	//   17   29:aload_0         
	//   18   30:invokevirtual   #61  <Method int size()>
	//   19   33:iconst_1        
	//   20   34:isub            
	//   21   35:icmpge          66
			int j = getSegment(i + 1).getKind();
	//   22   38:aload_0         
	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:invokevirtual   #63  <Method XMPPathSegment getSegment(int)>
	//   27   45:invokevirtual   #70  <Method int XMPPathSegment.getKind()>
	//   28   48:istore_2        
			if(j == 1 || j == 2)
	//*  29   49:iload_2         
	//*  30   50:iconst_1        
	//*  31   51:icmpeq          59
	//*  32   54:iload_2         
	//*  33   55:iconst_2        
	//*  34   56:icmpne          66
				stringbuffer.append('/');
	//   35   59:aload_3         
	//   36   60:bipush          47
	//   37   62:invokevirtual   #73  <Method StringBuffer StringBuffer.append(char)>
	//   38   65:pop             
		}

	//   39   66:iload_1         
	//   40   67:iconst_1        
	//   41   68:iadd            
	//   42   69:istore_1        
	//*  43   70:goto            10
		return stringbuffer.toString();
	//   44   73:aload_3         
	//   45   74:invokevirtual   #75  <Method String StringBuffer.toString()>
	//   46   77:areturn         
	}

	public static final int ARRAY_INDEX_STEP = 3;
	public static final int ARRAY_LAST_STEP = 4;
	public static final int FIELD_SELECTOR_STEP = 6;
	public static final int QUALIFIER_STEP = 2;
	public static final int QUAL_SELECTOR_STEP = 5;
	public static final int SCHEMA_NODE = 0x80000000;
	public static final int STEP_ROOT_PROP = 1;
	public static final int STEP_SCHEMA = 0;
	public static final int STRUCT_FIELD_STEP = 1;
	private List segments;
}
