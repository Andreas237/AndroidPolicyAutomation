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
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = ((String) (s.split("/")));
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "/">
	//    6    9:invokevirtual   #21  <Method String[] String.split(String)>
	//    7   12:astore_0        
		int j = as.length;
	//    8   13:aload_1         
	//    9   14:arraylength     
	//   10   15:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   16:iconst_0        
	//*  12   17:istore_2        
	//*  13   18:iload_2         
	//*  14   19:iload_3         
	//*  15   20:icmpge          52
		{
			String s1 = as[i];
	//   16   23:aload_1         
	//   17   24:iload_2         
	//   18   25:aaload          
	//   19   26:astore          4
			if(mimeTypeAgainstFilter(((String []) (s)), s1.split("/")))
	//*  20   28:aload_0         
	//*  21   29:aload           4
	//*  22   31:ldc1            #15  <String "/">
	//*  23   33:invokevirtual   #21  <Method String[] String.split(String)>
	//*  24   36:invokestatic    #25  <Method boolean mimeTypeAgainstFilter(String[], String[])>
	//*  25   39:ifeq            45
				return s1;
	//   26   42:aload           4
	//   27   44:areturn         
		}

	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_2        
	//*  32   49:goto            18
		return null;
	//   33   52:aconst_null     
	//   34   53:areturn         
	}

	public static String matches(String as[], String s)
	{
		if(as == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = ((String) (s.split("/")));
	//    4    6:aload_1         
	//    5    7:ldc1            #15  <String "/">
	//    6    9:invokevirtual   #21  <Method String[] String.split(String)>
	//    7   12:astore_1        
		int j = as.length;
	//    8   13:aload_0         
	//    9   14:arraylength     
	//   10   15:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   16:iconst_0        
	//*  12   17:istore_2        
	//*  13   18:iload_2         
	//*  14   19:iload_3         
	//*  15   20:icmpge          52
		{
			String s1 = as[i];
	//   16   23:aload_0         
	//   17   24:iload_2         
	//   18   25:aaload          
	//   19   26:astore          4
			if(mimeTypeAgainstFilter(s1.split("/"), ((String []) (s))))
	//*  20   28:aload           4
	//*  21   30:ldc1            #15  <String "/">
	//*  22   32:invokevirtual   #21  <Method String[] String.split(String)>
	//*  23   35:aload_1         
	//*  24   36:invokestatic    #25  <Method boolean mimeTypeAgainstFilter(String[], String[])>
	//*  25   39:ifeq            45
				return s1;
	//   26   42:aload           4
	//   27   44:areturn         
		}

	//   28   45:iload_2         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_2        
	//*  32   49:goto            18
		return null;
	//   33   52:aconst_null     
	//   34   53:areturn         
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
		if(as == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
			return new String[0];
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:areturn         
		ArrayList arraylist = new ArrayList();
	//    5    9:new             #32  <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #33  <Method void ArrayList()>
	//    8   16:astore          4
		s = ((String) (s.split("/")));
	//    9   18:aload_1         
	//   10   19:ldc1            #15  <String "/">
	//   11   21:invokevirtual   #21  <Method String[] String.split(String)>
	//   12   24:astore_1        
		int j = as.length;
	//   13   25:aload_0         
	//   14   26:arraylength     
	//   15   27:istore_3        
		for(int i = 0; i < j; i++)
	//*  16   28:iconst_0        
	//*  17   29:istore_2        
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
		if(as.length != 2 || as1.length != 2)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:iconst_2        
	//*   3    3:icmpne          12
	//*   4    6:aload_1         
	//*   5    7:arraylength     
	//*   6    8:iconst_2        
	//*   7    9:icmpeq          14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		if(!"*".equals(((Object) (as1[0]))) && !as1[0].equals(((Object) (as[0]))))
	//*  10   14:ldc1            #49  <String "*">
	//*  11   16:aload_1         
	//*  12   17:iconst_0        
	//*  13   18:aaload          
	//*  14   19:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  15   22:ifne            39
	//*  16   25:aload_1         
	//*  17   26:iconst_0        
	//*  18   27:aaload          
	//*  19   28:aload_0         
	//*  20   29:iconst_0        
	//*  21   30:aaload          
	//*  22   31:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  23   34:ifne            39
			return false;
	//   24   37:iconst_0        
	//   25   38:ireturn         
		return "*".equals(((Object) (as1[1]))) || as1[1].equals(((Object) (as[1])));
	//   26   39:ldc1            #49  <String "*">
	//   27   41:aload_1         
	//   28   42:iconst_1        
	//   29   43:aaload          
	//   30   44:invokevirtual   #52  <Method boolean String.equals(Object)>
	//   31   47:ifne            64
	//   32   50:aload_1         
	//   33   51:iconst_1        
	//   34   52:aaload          
	//   35   53:aload_0         
	//   36   54:iconst_1        
	//   37   55:aaload          
	//   38   56:invokevirtual   #52  <Method boolean String.equals(Object)>
	//   39   59:ifne            64
	//   40   62:iconst_0        
	//   41   63:ireturn         
	//   42   64:iconst_1        
	//   43   65:ireturn         
	}
}
