// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import java.util.ArrayList;

public final class MimeTypeFilter
{

	private MimeTypeFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String matches(String s, String as[])
	{
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		s = null;
	//    2    4:aconst_null     
	//    3    5:astore_0        
_L4:
		return s;
	//    4    6:aload_0         
	//    5    7:areturn         
_L2:
		String as1[] = s.split("/");
	//    6    8:aload_0         
	//    7    9:ldc1            #15  <String "/">
	//    8   11:invokevirtual   #21  <Method String[] String.split(String)>
	//    9   14:astore          5
		int j = as.length;
	//   10   16:aload_1         
	//   11   17:arraylength     
	//   12   18:istore_3        
		int i = 0;
	//   13   19:iconst_0        
	//   14   20:istore_2        
label0:
		do
		{
label1:
			{
				if(i >= j)
					break label1;
	//   15   21:iload_2         
	//   16   22:iload_3         
	//   17   23:icmpge          56
				String s1 = as[i];
	//   18   26:aload_1         
	//   19   27:iload_2         
	//   20   28:aaload          
	//   21   29:astore          4
				s = s1;
	//   22   31:aload           4
	//   23   33:astore_0        
				if(mimeTypeAgainstFilter(as1, s1.split("/")))
					break label0;
	//   24   34:aload           5
	//   25   36:aload           4
	//   26   38:ldc1            #15  <String "/">
	//   27   40:invokevirtual   #21  <Method String[] String.split(String)>
	//   28   43:invokestatic    #25  <Method boolean mimeTypeAgainstFilter(String[], String[])>
	//   29   46:ifne            6
				i++;
	//   30   49:iload_2         
	//   31   50:iconst_1        
	//   32   51:iadd            
	//   33   52:istore_2        
			}
		} while(true);
	//   34   53:goto            21
		if(true) goto _L4; else goto _L3
_L3:
		return null;
	//   35   56:aconst_null     
	//   36   57:areturn         
	}

	public static String matches(String as[], String s)
	{
		if(as != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
_L4:
		return s;
	//    4    6:aload_1         
	//    5    7:areturn         
_L2:
		String as1[] = s.split("/");
	//    6    8:aload_1         
	//    7    9:ldc1            #15  <String "/">
	//    8   11:invokevirtual   #21  <Method String[] String.split(String)>
	//    9   14:astore          5
		int j = as.length;
	//   10   16:aload_0         
	//   11   17:arraylength     
	//   12   18:istore_3        
		int i = 0;
	//   13   19:iconst_0        
	//   14   20:istore_2        
label0:
		do
		{
label1:
			{
				if(i >= j)
					break label1;
	//   15   21:iload_2         
	//   16   22:iload_3         
	//   17   23:icmpge          56
				String s1 = as[i];
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:aaload          
	//   21   29:astore          4
				s = s1;
	//   22   31:aload           4
	//   23   33:astore_1        
				if(mimeTypeAgainstFilter(s1.split("/"), as1))
					break label0;
	//   24   34:aload           4
	//   25   36:ldc1            #15  <String "/">
	//   26   38:invokevirtual   #21  <Method String[] String.split(String)>
	//   27   41:aload           5
	//   28   43:invokestatic    #25  <Method boolean mimeTypeAgainstFilter(String[], String[])>
	//   29   46:ifne            6
				i++;
	//   30   49:iload_2         
	//   31   50:iconst_1        
	//   32   51:iadd            
	//   33   52:istore_2        
			}
		} while(true);
	//   34   53:goto            21
		if(true) goto _L4; else goto _L3
_L3:
		return null;
	//   35   56:aconst_null     
	//   36   57:areturn         
	}

	public static boolean matches(String s, String s1)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return mimeTypeAgainstFilter(s.split("/"), s1.split("/"));
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "/">
	//    6    9:invokevirtual   #21  <Method String[] String.split(String)>
	//    7   12:aload_1         
	//    8   13:ldc1            #15  <String "/">
	//    9   15:invokevirtual   #21  <Method String[] String.split(String)>
	//   10   18:invokestatic    #25  <Method boolean mimeTypeAgainstFilter(String[], String[])>
	//   11   21:ireturn         
	}

	public static String[] matchesMany(String as[], String s)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(as == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       11
			return new String[0];
	//    4    6:iconst_0        
	//    5    7:anewarray       String[]
	//    6   10:areturn         
		ArrayList arraylist = new ArrayList();
	//    7   11:new             #32  <Class ArrayList>
	//    8   14:dup             
	//    9   15:invokespecial   #33  <Method void ArrayList()>
	//   10   18:astore          4
		s = ((String) (s.split("/")));
	//   11   20:aload_1         
	//   12   21:ldc1            #15  <String "/">
	//   13   23:invokevirtual   #21  <Method String[] String.split(String)>
	//   14   26:astore_1        
		for(int j = as.length; i < j; i++)
	//*  15   27:aload_0         
	//*  16   28:arraylength     
	//*  17   29:istore_3        
	//*  18   30:iload_2         
	//*  19   31:iload_3         
	//*  20   32:icmpge          69
		{
			String s1 = as[i];
	//   21   35:aload_0         
	//   22   36:iload_2         
	//   23   37:aaload          
	//   24   38:astore          5
			if(mimeTypeAgainstFilter(s1.split("/"), ((String []) (s))))
	//*  25   40:aload           5
	//*  26   42:ldc1            #15  <String "/">
	//*  27   44:invokevirtual   #21  <Method String[] String.split(String)>
	//*  28   47:aload_1         
	//*  29   48:invokestatic    #25  <Method boolean mimeTypeAgainstFilter(String[], String[])>
	//*  30   51:ifeq            62
				arraylist.add(((Object) (s1)));
	//   31   54:aload           4
	//   32   56:aload           5
	//   33   58:invokevirtual   #37  <Method boolean ArrayList.add(Object)>
	//   34   61:pop             
		}

	//   35   62:iload_2         
	//   36   63:iconst_1        
	//   37   64:iadd            
	//   38   65:istore_2        
	//*  39   66:goto            30
		return (String[])arraylist.toArray(((Object []) (new String[arraylist.size()])));
	//   40   69:aload           4
	//   41   71:aload           4
	//   42   73:invokevirtual   #41  <Method int ArrayList.size()>
	//   43   76:anewarray       String[]
	//   44   79:invokevirtual   #45  <Method Object[] ArrayList.toArray(Object[])>
	//   45   82:checkcast       #47  <Class String[]>
	//   46   85:areturn         
	}

	private static boolean mimeTypeAgainstFilter(String as[], String as1[])
	{
		if(as1.length != 2)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_2        
	//*   3    3:icmpeq          16
			throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
	//    4    6:new             #49  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #51  <String "Ill-formatted MIME type filter. Must be type/subtype.">
	//    7   12:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		if(as1[0].isEmpty() || as1[1].isEmpty())
	//*   9   16:aload_1         
	//*  10   17:iconst_0        
	//*  11   18:aaload          
	//*  12   19:invokevirtual   #58  <Method boolean String.isEmpty()>
	//*  13   22:ifne            34
	//*  14   25:aload_1         
	//*  15   26:iconst_1        
	//*  16   27:aaload          
	//*  17   28:invokevirtual   #58  <Method boolean String.isEmpty()>
	//*  18   31:ifeq            44
			throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
	//   19   34:new             #49  <Class IllegalArgumentException>
	//   20   37:dup             
	//   21   38:ldc1            #60  <String "Ill-formatted MIME type filter. Type or subtype empty.">
	//   22   40:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   23   43:athrow          
		while(as.length != 2 || !"*".equals(((Object) (as1[0]))) && !as1[0].equals(((Object) (as[0]))) || !"*".equals(((Object) (as1[1]))) && !as1[1].equals(((Object) (as[1])))) 
	//*  24   44:aload_0         
	//*  25   45:arraylength     
	//*  26   46:iconst_2        
	//*  27   47:icmpeq          52
			return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
	//   30   52:ldc1            #62  <String "*">
	//   31   54:aload_1         
	//   32   55:iconst_0        
	//   33   56:aaload          
	//   34   57:invokevirtual   #65  <Method boolean String.equals(Object)>
	//   35   60:ifne            75
	//   36   63:aload_1         
	//   37   64:iconst_0        
	//   38   65:aaload          
	//   39   66:aload_0         
	//   40   67:iconst_0        
	//   41   68:aaload          
	//   42   69:invokevirtual   #65  <Method boolean String.equals(Object)>
	//   43   72:ifeq            50
	//   44   75:ldc1            #62  <String "*">
	//   45   77:aload_1         
	//   46   78:iconst_1        
	//   47   79:aaload          
	//   48   80:invokevirtual   #65  <Method boolean String.equals(Object)>
	//   49   83:ifne            98
	//   50   86:aload_1         
	//   51   87:iconst_1        
	//   52   88:aaload          
	//   53   89:aload_0         
	//   54   90:iconst_1        
	//   55   91:aaload          
	//   56   92:invokevirtual   #65  <Method boolean String.equals(Object)>
	//   57   95:ifeq            50
		return true;
	//   58   98:iconst_1        
	//   59   99:ireturn         
	}
}
