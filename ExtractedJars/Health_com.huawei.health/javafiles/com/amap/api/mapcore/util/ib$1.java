// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			ib, hq, id, if, 
//			ih

static final class ib$1
	implements Runnable
{

	public void run()
	{
		hq hq1;
		Object obj;
		Object obj1;
		String s;
		try
		{
			hq1 = new hq(a, ((hp) (id.a())));
	//    0    0:new             #31  <Class hq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Context a>
	//    4    8:invokestatic    #36  <Method id id.a()>
	//    5   11:invokespecial   #39  <Method void hq(Context, hp)>
	//    6   14:astore_1        
			obj = ((Object) (hq1.b(com.amap.api.mapcore.util.if.a(b), com/amap/api/mapcore/util/if)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field String b>
	//   10   20:invokestatic    #44  <Method String if.a(String)>
	//   11   23:ldc1            #41  <Class if>
	//   12   25:invokevirtual   #47  <Method List hq.b(String, Class)>
	//   13   28:astore_2        
		}
	//*  14   29:aload_2         
	//*  15   30:ifnull          103
	//*  16   33:aload_2         
	//*  17   34:invokeinterface #53  <Method int List.size()>
	//*  18   39:ifle            103
	//*  19   42:aload_2         
	//*  20   43:invokeinterface #57  <Method Iterator List.iterator()>
	//*  21   48:astore_2        
	//*  22   49:aload_2         
	//*  23   50:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*  24   55:ifeq            103
	//*  25   58:aload_2         
	//*  26   59:invokeinterface #67  <Method Object Iterator.next()>
	//*  27   64:checkcast       #41  <Class if>
	//*  28   67:astore_3        
	//*  29   68:aload_3         
	//*  30   69:invokevirtual   #71  <Method String if.d()>
	//*  31   72:astore          4
	//*  32   74:aload_0         
	//*  33   75:getfield        #22  <Field String c>
	//*  34   78:aload           4
	//*  35   80:invokevirtual   #77  <Method boolean String.equalsIgnoreCase(String)>
	//*  36   83:ifne            100
	//*  37   86:aload_3         
	//*  38   87:invokevirtual   #79  <Method String if.a()>
	//*  39   90:astore_3        
	//*  40   91:aload_0         
	//*  41   92:getfield        #18  <Field Context a>
	//*  42   95:aload_1         
	//*  43   96:aload_3         
	//*  44   97:invokestatic    #82  <Method void ib.b(Context, hq, String)>
	//*  45  100:goto            49
	//*  46  103:return          
		catch(Throwable throwable)
	//*  47  104:astore_1        
		{
			ih.a(throwable, "FileManager", "clearUnSuitableV");
	//   48  105:aload_1         
	//   49  106:ldc1            #84  <String "FileManager">
	//   50  108:ldc1            #86  <String "clearUnSuitableV">
	//   51  110:invokestatic    #91  <Method void ih.a(Throwable, String, String)>
			return;
	//   52  113:return          
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_103;
		if(((List) (obj)).size() > 0)
		{
			obj = ((Object) (((List) (obj)).iterator()));
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
				obj1 = ((Object) ((if)((Iterator) (obj)).next()));
				s = ((if) (obj1)).d();
				if(!c.equalsIgnoreCase(s))
				{
					obj1 = ((Object) (((if) (obj1)).a()));
					ib.b(a, hq1, ((String) (obj1)));
				}
			} while(true);
		}
	}

	final Context a;
	final String b;
	final String c;

	ib$1(Context context, String s, String s1)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Context a>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String b>
		c = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field String c>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #25  <Method void Object()>
	//   11   19:return          
	}
}
