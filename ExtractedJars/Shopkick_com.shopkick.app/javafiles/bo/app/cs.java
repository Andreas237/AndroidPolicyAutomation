// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import java.util.*;

// Referenced classes of package bo.app:
//			cp

public abstract class cs
	implements cp
{

	protected cs(Uri uri, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		b = map;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #18  <Field Map b>
		map = ((Map) (new StringBuilder()));
	//    5    9:new             #20  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #21  <Method void StringBuilder()>
	//    8   16:astore_2        
		((StringBuilder) (map)).append(((Object) (uri)));
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #25  <Method StringBuilder StringBuilder.append(Object)>
	//   12   22:pop             
		((StringBuilder) (map)).append(j());
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #29  <Method String j()>
	//   16   28:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		a = Uri.parse(((StringBuilder) (map)).toString());
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   21   37:invokestatic    #41  <Method Uri Uri.parse(String)>
	//   22   40:putfield        #43  <Field Uri a>
	//   23   43:return          
	}

	public Uri a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Uri a>
	//    2    4:areturn         
	}

	public String j()
	{
		Map map = b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map b>
	//    2    4:astore_1        
		if(map != null && map.size() != 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          137
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #53  <Method int Map.size()>
	//*   7   15:ifne            21
	//*   8   18:goto            137
		{
			String s = "?";
	//    9   21:ldc1            #55  <String "?">
	//   10   23:astore_1        
			for(Iterator iterator = b.keySet().iterator(); iterator.hasNext();)
	//*  11   24:aload_0         
	//*  12   25:getfield        #18  <Field Map b>
	//*  13   28:invokeinterface #59  <Method Set Map.keySet()>
	//*  14   33:invokeinterface #65  <Method Iterator Set.iterator()>
	//*  15   38:astore_2        
	//*  16   39:aload_2         
	//*  17   40:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  18   45:ifeq            125
			{
				String s1 = (String)iterator.next();
	//   19   48:aload_2         
	//   20   49:invokeinterface #75  <Method Object Iterator.next()>
	//   21   54:checkcast       #77  <Class String>
	//   22   57:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   23   58:new             #20  <Class StringBuilder>
	//   24   61:dup             
	//   25   62:invokespecial   #21  <Method void StringBuilder()>
	//   26   65:astore          4
				stringbuilder.append(s);
	//   27   67:aload           4
	//   28   69:aload_1         
	//   29   70:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   30   73:pop             
				stringbuilder.append(s1);
	//   31   74:aload           4
	//   32   76:aload_3         
	//   33   77:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   34   80:pop             
				stringbuilder.append("=");
	//   35   81:aload           4
	//   36   83:ldc1            #79  <String "=">
	//   37   85:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   38   88:pop             
				stringbuilder.append((String)b.get(((Object) (s1))));
	//   39   89:aload           4
	//   40   91:aload_0         
	//   41   92:getfield        #18  <Field Map b>
	//   42   95:aload_3         
	//   43   96:invokeinterface #83  <Method Object Map.get(Object)>
	//   44  101:checkcast       #77  <Class String>
	//   45  104:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   46  107:pop             
				stringbuilder.append("&");
	//   47  108:aload           4
	//   48  110:ldc1            #85  <String "&">
	//   49  112:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   50  115:pop             
				s = stringbuilder.toString();
	//   51  116:aload           4
	//   52  118:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   53  121:astore_1        
			}

	//*  54  122:goto            39
			return s.substring(0, s.length() - 1);
	//   55  125:aload_1         
	//   56  126:iconst_0        
	//   57  127:aload_1         
	//   58  128:invokevirtual   #88  <Method int String.length()>
	//   59  131:iconst_1        
	//   60  132:isub            
	//   61  133:invokevirtual   #92  <Method String String.substring(int, int)>
	//   62  136:areturn         
		} else
		{
			return "";
	//   63  137:ldc1            #94  <String "">
	//   64  139:areturn         
		}
	}

	public final Uri a;
	private Map b;
}
