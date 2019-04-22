// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.*;

public class p
	implements BaseDisplayContainer
{

	public p()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		b = ((Collection) (Collections.emptyList()));
	//    2    4:aload_0         
	//    3    5:invokestatic    #28  <Method java.util.List Collections.emptyList()>
	//    4    8:putfield        #30  <Field Collection b>
		c = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #32  <Field Map c>
	//    8   16:return          
	}

	public Map a()
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Map c>
	//*   2    4:ifnonnull       109
		{
			com.google.c.b.n.a a1 = new com.google.c.b.n.a();
	//    3    7:new             #35  <Class com.google.c.b.n$a>
	//    4   10:dup             
	//    5   11:invokespecial   #36  <Method void com.google.c.b.n$a()>
	//    6   14:astore_2        
			Iterator iterator = b.iterator();
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field Collection b>
	//    9   19:invokeinterface #42  <Method Iterator Collection.iterator()>
	//   10   24:astore_3        
			do
			{
				if(!iterator.hasNext())
					break;
	//   11   25:aload_3         
	//   12   26:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            101
				CompanionAdSlot companionadslot = (CompanionAdSlot)iterator.next();
	//   14   34:aload_3         
	//   15   35:invokeinterface #52  <Method Object Iterator.next()>
	//   16   40:checkcast       #54  <Class CompanionAdSlot>
	//   17   43:astore          4
				if(companionadslot != null)
	//*  18   45:aload           4
	//*  19   47:ifnull          25
				{
					int i = d;
	//   20   50:getstatic       #56  <Field int d>
	//   21   53:istore_1        
					d = i + 1;
	//   22   54:iload_1         
	//   23   55:iconst_1        
	//   24   56:iadd            
	//   25   57:putstatic       #56  <Field int d>
					StringBuilder stringbuilder = new StringBuilder(20);
	//   26   60:new             #58  <Class StringBuilder>
	//   27   63:dup             
	//   28   64:bipush          20
	//   29   66:invokespecial   #61  <Method void StringBuilder(int)>
	//   30   69:astore          5
					stringbuilder.append("compSlot_");
	//   31   71:aload           5
	//   32   73:ldc1            #63  <String "compSlot_">
	//   33   75:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   34   78:pop             
					stringbuilder.append(i);
	//   35   79:aload           5
	//   36   81:iload_1         
	//   37   82:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   38   85:pop             
					a1.a(((Object) (stringbuilder.toString())), ((Object) (companionadslot)));
	//   39   86:aload_2         
	//   40   87:aload           5
	//   41   89:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   42   92:aload           4
	//   43   94:invokevirtual   #77  <Method com.google.c.b.n$a com.google.c.b.n$a.a(Object, Object)>
	//   44   97:pop             
				}
			} while(true);
	//   45   98:goto            25
			c = ((Map) (a1.a()));
	//   46  101:aload_0         
	//   47  102:aload_2         
	//   48  103:invokevirtual   #80  <Method com.google.c.b.n com.google.c.b.n$a.a()>
	//   49  106:putfield        #32  <Field Map c>
		}
		return c;
	//   50  109:aload_0         
	//   51  110:getfield        #32  <Field Map c>
	//   52  113:areturn         
	}

	public ViewGroup getAdContainer()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field ViewGroup a>
	//    2    4:areturn         
	}

	public Collection getCompanionSlots()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Collection b>
	//    2    4:areturn         
	}

	public void setAdContainer(ViewGroup viewgroup)
	{
		a = viewgroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field ViewGroup a>
	//    3    5:return          
	}

	public void setCompanionSlots(Collection collection)
	{
		b = collection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field Collection b>
	//    3    5:return          
	}

	private static int d;
	private ViewGroup a;
	private Collection b;
	private Map c;

	static 
	{
	//    0    0:return          
	}
}
