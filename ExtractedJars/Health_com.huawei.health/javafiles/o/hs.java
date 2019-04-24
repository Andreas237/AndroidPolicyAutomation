// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package o:
//			fv, ft

public final class hs
{

	public hs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Map c(String s)
	{
		fv fv1 = fv.b(fv.a.i);
	//    0    0:getstatic       #19  <Field fv fv.a>
	//    1    3:getfield        #23  <Field int fv.i>
	//    2    6:invokestatic    #27  <Method fv fv.b(int)>
	//    3    9:astore_2        
		HashMap hashmap = new HashMap();
	//    4   10:new             #29  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #30  <Method void HashMap()>
	//    7   17:astore_1        
		((Map) (hashmap)).put("resultStatus", ((Object) (Integer.toString(fv1.i))));
	//    8   18:aload_1         
	//    9   19:ldc1            #32  <String "resultStatus">
	//   10   21:aload_2         
	//   11   22:getfield        #23  <Field int fv.i>
	//   12   25:invokestatic    #38  <Method String Integer.toString(int)>
	//   13   28:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   14   33:pop             
		((Map) (hashmap)).put("memo", ((Object) (fv1.k)));
	//   15   34:aload_1         
	//   16   35:ldc1            #46  <String "memo">
	//   17   37:aload_2         
	//   18   38:getfield        #50  <Field String fv.k>
	//   19   41:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   20   46:pop             
		((Map) (hashmap)).put("result", "");
	//   21   47:aload_1         
	//   22   48:ldc1            #52  <String "result">
	//   23   50:ldc1            #54  <String "">
	//   24   52:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   25   57:pop             
		try
		{
			s = ((String) (d(s)));
	//   26   58:aload_0         
	//   27   59:invokestatic    #57  <Method Map d(String)>
	//   28   62:astore_0        
		}
	//*  29   63:aload_0         
	//*  30   64:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  31   65:astore_0        
		{
			ft.e("biz", "FormatResultEx", ((Throwable) (s)));
	//   32   66:ldc1            #59  <String "biz">
	//   33   68:ldc1            #61  <String "FormatResultEx">
	//   34   70:aload_0         
	//   35   71:invokestatic    #67  <Method void ft.e(String, String, Throwable)>
			return ((Map) (hashmap));
	//   36   74:aload_1         
	//   37   75:areturn         
		}
		return ((Map) (s));
	}

	private static Map d(String s)
	{
		s = ((String) (s.split(";")));
	//    0    0:aload_0         
	//    1    1:ldc1            #71  <String ";">
	//    2    3:invokevirtual   #77  <Method String[] String.split(String)>
	//    3    6:astore_0        
		HashMap hashmap = new HashMap();
	//    4    7:new             #29  <Class HashMap>
	//    5   10:dup             
	//    6   11:invokespecial   #30  <Method void HashMap()>
	//    7   14:astore_3        
		int j = s.length;
	//    8   15:aload_0         
	//    9   16:arraylength     
	//   10   17:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   18:iconst_0        
	//*  12   19:istore_1        
	//*  13   20:iload_1         
	//*  14   21:iload_2         
	//*  15   22:icmpge          108
		{
			String s1 = ((String) (s[i]));
	//   16   25:aload_0         
	//   17   26:iload_1         
	//   18   27:aaload          
	//   19   28:astore          4
			String s2 = s1.substring(0, s1.indexOf("={"));
	//   20   30:aload           4
	//   21   32:iconst_0        
	//   22   33:aload           4
	//   23   35:ldc1            #79  <String "={">
	//   24   37:invokevirtual   #83  <Method int String.indexOf(String)>
	//   25   40:invokevirtual   #87  <Method String String.substring(int, int)>
	//   26   43:astore          5
			String s3 = (new StringBuilder()).append(s2).append("={").toString();
	//   27   45:new             #89  <Class StringBuilder>
	//   28   48:dup             
	//   29   49:invokespecial   #90  <Method void StringBuilder()>
	//   30   52:aload           5
	//   31   54:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   32   57:ldc1            #79  <String "={">
	//   33   59:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   35   65:astore          6
			((Map) (hashmap)).put(((Object) (s2)), ((Object) (s1.substring(s1.indexOf(s3) + s3.length(), s1.lastIndexOf("}")))));
	//   36   67:aload_3         
	//   37   68:aload           5
	//   38   70:aload           4
	//   39   72:aload           4
	//   40   74:aload           6
	//   41   76:invokevirtual   #83  <Method int String.indexOf(String)>
	//   42   79:aload           6
	//   43   81:invokevirtual   #101 <Method int String.length()>
	//   44   84:iadd            
	//   45   85:aload           4
	//   46   87:ldc1            #103 <String "}">
	//   47   89:invokevirtual   #106 <Method int String.lastIndexOf(String)>
	//   48   92:invokevirtual   #87  <Method String String.substring(int, int)>
	//   49   95:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   50  100:pop             
		}

	//   51  101:iload_1         
	//   52  102:iconst_1        
	//   53  103:iadd            
	//   54  104:istore_1        
	//*  55  105:goto            20
		return ((Map) (hashmap));
	//   56  108:aload_3         
	//   57  109:areturn         
	}
}
