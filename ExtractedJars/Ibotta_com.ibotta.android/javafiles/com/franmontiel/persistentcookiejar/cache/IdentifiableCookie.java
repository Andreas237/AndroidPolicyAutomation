// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.franmontiel.persistentcookiejar.cache;

import java.util.*;
import okhttp3.Cookie;

class IdentifiableCookie
{

	IdentifiableCookie(Cookie cookie1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		cookie = cookie1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Cookie cookie>
	//    5    9:return          
	}

	static List decorateAll(Collection collection)
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #18  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #24  <Method int Collection.size()>
	//    4   10:invokespecial   #27  <Method void ArrayList(int)>
	//    5   13:astore_1        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((List) (arraylist)).add(((Object) (new IdentifiableCookie((Cookie)((Iterator) (collection)).next())))));
	//    6   14:aload_0         
	//    7   15:invokeinterface #31  <Method Iterator Collection.iterator()>
	//    8   20:astore_0        
	//    9   21:aload_0         
	//   10   22:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            56
	//   12   30:aload_1         
	//   13   31:new             #2   <Class IdentifiableCookie>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:invokeinterface #41  <Method Object Iterator.next()>
	//   17   41:checkcast       #43  <Class Cookie>
	//   18   44:invokespecial   #45  <Method void IdentifiableCookie(Cookie)>
	//   19   47:invokeinterface #51  <Method boolean List.add(Object)>
	//   20   52:pop             
	//*  21   53:goto            21
		return ((List) (arraylist));
	//   22   56:aload_1         
	//   23   57:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof IdentifiableCookie;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class IdentifiableCookie>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((IdentifiableCookie)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class IdentifiableCookie>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(((IdentifiableCookie) (obj)).cookie.name().equals(((Object) (cookie.name()))))
	//*  14   20:aload_1         
	//*  15   21:getfield        #13  <Field Cookie cookie>
	//*  16   24:invokevirtual   #58  <Method String Cookie.name()>
	//*  17   27:aload_0         
	//*  18   28:getfield        #13  <Field Cookie cookie>
	//*  19   31:invokevirtual   #58  <Method String Cookie.name()>
	//*  20   34:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  21   37:ifeq            124
		{
			flag = flag1;
	//   22   40:iload_3         
	//   23   41:istore_2        
			if(((IdentifiableCookie) (obj)).cookie.domain().equals(((Object) (cookie.domain()))))
	//*  24   42:aload_1         
	//*  25   43:getfield        #13  <Field Cookie cookie>
	//*  26   46:invokevirtual   #65  <Method String Cookie.domain()>
	//*  27   49:aload_0         
	//*  28   50:getfield        #13  <Field Cookie cookie>
	//*  29   53:invokevirtual   #65  <Method String Cookie.domain()>
	//*  30   56:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  31   59:ifeq            124
			{
				flag = flag1;
	//   32   62:iload_3         
	//   33   63:istore_2        
				if(((IdentifiableCookie) (obj)).cookie.path().equals(((Object) (cookie.path()))))
	//*  34   64:aload_1         
	//*  35   65:getfield        #13  <Field Cookie cookie>
	//*  36   68:invokevirtual   #68  <Method String Cookie.path()>
	//*  37   71:aload_0         
	//*  38   72:getfield        #13  <Field Cookie cookie>
	//*  39   75:invokevirtual   #68  <Method String Cookie.path()>
	//*  40   78:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  41   81:ifeq            124
				{
					flag = flag1;
	//   42   84:iload_3         
	//   43   85:istore_2        
					if(((IdentifiableCookie) (obj)).cookie.secure() == cookie.secure())
	//*  44   86:aload_1         
	//*  45   87:getfield        #13  <Field Cookie cookie>
	//*  46   90:invokevirtual   #71  <Method boolean Cookie.secure()>
	//*  47   93:aload_0         
	//*  48   94:getfield        #13  <Field Cookie cookie>
	//*  49   97:invokevirtual   #71  <Method boolean Cookie.secure()>
	//*  50  100:icmpne          124
					{
						flag = flag1;
	//   51  103:iload_3         
	//   52  104:istore_2        
						if(((IdentifiableCookie) (obj)).cookie.hostOnly() == cookie.hostOnly())
	//*  53  105:aload_1         
	//*  54  106:getfield        #13  <Field Cookie cookie>
	//*  55  109:invokevirtual   #74  <Method boolean Cookie.hostOnly()>
	//*  56  112:aload_0         
	//*  57  113:getfield        #13  <Field Cookie cookie>
	//*  58  116:invokevirtual   #74  <Method boolean Cookie.hostOnly()>
	//*  59  119:icmpne          124
							flag = true;
	//   60  122:iconst_1        
	//   61  123:istore_2        
					}
				}
			}
		}
		return flag;
	//   62  124:iload_2         
	//   63  125:ireturn         
	}

	Cookie getCookie()
	{
		return cookie;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Cookie cookie>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ((((527 + cookie.name().hashCode()) * 31 + cookie.domain().hashCode()) * 31 + cookie.path().hashCode()) * 31 + (cookie.secure() ^ true)) * 31 + (cookie.hostOnly() ^ true);
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #13  <Field Cookie cookie>
	//    3    7:invokevirtual   #58  <Method String Cookie.name()>
	//    4   10:invokevirtual   #79  <Method int String.hashCode()>
	//    5   13:iadd            
	//    6   14:bipush          31
	//    7   16:imul            
	//    8   17:aload_0         
	//    9   18:getfield        #13  <Field Cookie cookie>
	//   10   21:invokevirtual   #65  <Method String Cookie.domain()>
	//   11   24:invokevirtual   #79  <Method int String.hashCode()>
	//   12   27:iadd            
	//   13   28:bipush          31
	//   14   30:imul            
	//   15   31:aload_0         
	//   16   32:getfield        #13  <Field Cookie cookie>
	//   17   35:invokevirtual   #68  <Method String Cookie.path()>
	//   18   38:invokevirtual   #79  <Method int String.hashCode()>
	//   19   41:iadd            
	//   20   42:bipush          31
	//   21   44:imul            
	//   22   45:aload_0         
	//   23   46:getfield        #13  <Field Cookie cookie>
	//   24   49:invokevirtual   #71  <Method boolean Cookie.secure()>
	//   25   52:iconst_1        
	//   26   53:ixor            
	//   27   54:iadd            
	//   28   55:bipush          31
	//   29   57:imul            
	//   30   58:aload_0         
	//   31   59:getfield        #13  <Field Cookie cookie>
	//   32   62:invokevirtual   #74  <Method boolean Cookie.hostOnly()>
	//   33   65:iconst_1        
	//   34   66:ixor            
	//   35   67:iadd            
	//   36   68:ireturn         
	}

	private Cookie cookie;
}
