// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.util.*;

// Referenced classes of package android.support.v7:
//			cc, ce

public class cb
{

	cb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void HashMap()>
	//    6   12:putfield        #18  <Field Map a>
		b = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #15  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #16  <Method void HashMap()>
	//   11   23:putfield        #20  <Field Map b>
	//   12   26:return          
	}

	public cc a(String s)
	{
		return (cc)b.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Map b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #28  <Method Object Map.get(Object)>
	//    4   10:checkcast       #30  <Class cc>
	//    5   13:areturn         
	}

	void a(cc cc1)
	{
		b.put(((Object) (cc1.b())), ((Object) (cc1)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Map b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method String cc.b()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	void a(ce ce1)
	{
		a.put(((Object) (ce1.a())), ((Object) (ce1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method String ce.a()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #38  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	List b(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #46  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void ArrayList()>
	//    3    7:astore_2        
		Iterator iterator = b.values().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field Map b>
	//    6   12:invokeinterface #51  <Method Collection Map.values()>
	//    7   17:invokeinterface #57  <Method Iterator Collection.iterator()>
	//    8   22:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   23:aload_3         
	//   10   24:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            70
			cc cc1 = (cc)iterator.next();
	//   12   32:aload_3         
	//   13   33:invokeinterface #67  <Method Object Iterator.next()>
	//   14   38:checkcast       #30  <Class cc>
	//   15   41:astore          4
			if(cc1.a().equals(((Object) (s))))
	//*  16   43:aload           4
	//*  17   45:invokevirtual   #68  <Method String cc.a()>
	//*  18   48:aload_1         
	//*  19   49:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  20   52:ifeq            23
				((List) (arraylist)).add(((Object) (cc1.b())));
	//   21   55:aload_2         
	//   22   56:aload           4
	//   23   58:invokevirtual   #34  <Method String cc.b()>
	//   24   61:invokeinterface #79  <Method boolean List.add(Object)>
	//   25   66:pop             
		} while(true);
	//   26   67:goto            23
		return ((List) (arraylist));
	//   27   70:aload_2         
	//   28   71:areturn         
	}

	Map a;
	Map b;
}
