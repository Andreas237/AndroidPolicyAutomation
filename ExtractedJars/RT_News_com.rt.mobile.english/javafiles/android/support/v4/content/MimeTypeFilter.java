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
	//    7   11:new             #33  <Class ArrayList>
	//    8   14:dup             
	//    9   15:invokespecial   #34  <Method void ArrayList()>
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
	//   33   58:invokevirtual   #38  <Method boolean ArrayList.add(Object)>
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
	//   42   73:invokevirtual   #42  <Method int ArrayList.size()>
	//   43   76:anewarray       String[]
	//   44   79:invokevirtual   #46  <Method Object[] ArrayList.toArray(Object[])>
	//   45   82:checkcast       #48  <Class String[]>
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
	//    4    6:new             #50  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #52  <String "Ill-formatted MIME type filter. Must be type/subtype.">
	//    7   12:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		if(!as1[0].isEmpty() && !as1[1].isEmpty())
	//*   9   16:aload_1         
	//*  10   17:iconst_0        
	//*  11   18:aaload          
	//*  12   19:invokevirtual   #59  <Method boolean String.isEmpty()>
	//*  13   22:ifne            97
	//*  14   25:aload_1         
	//*  15   26:iconst_1        
	//*  16   27:aaload          
	//*  17   28:invokevirtual   #59  <Method boolean String.isEmpty()>
	//*  18   31:ifeq            37
	//*  19   34:goto            97
		{
			if(as.length != 2)
	//*  20   37:aload_0         
	//*  21   38:arraylength     
	//*  22   39:iconst_2        
	//*  23   40:icmpeq          45
				return false;
	//   24   43:iconst_0        
	//   25   44:ireturn         
			if(!"*".equals(((Object) (as1[0]))) && !as1[0].equals(((Object) (as[0]))))
	//*  26   45:ldc1            #61  <String "*">
	//*  27   47:aload_1         
	//*  28   48:iconst_0        
	//*  29   49:aaload          
	//*  30   50:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  31   53:ifne            70
	//*  32   56:aload_1         
	//*  33   57:iconst_0        
	//*  34   58:aaload          
	//*  35   59:aload_0         
	//*  36   60:iconst_0        
	//*  37   61:aaload          
	//*  38   62:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  39   65:ifne            70
				return false;
	//   40   68:iconst_0        
	//   41   69:ireturn         
			return "*".equals(((Object) (as1[1]))) || as1[1].equals(((Object) (as[1])));
	//   42   70:ldc1            #61  <String "*">
	//   43   72:aload_1         
	//   44   73:iconst_1        
	//   45   74:aaload          
	//   46   75:invokevirtual   #64  <Method boolean String.equals(Object)>
	//   47   78:ifne            95
	//   48   81:aload_1         
	//   49   82:iconst_1        
	//   50   83:aaload          
	//   51   84:aload_0         
	//   52   85:iconst_1        
	//   53   86:aaload          
	//   54   87:invokevirtual   #64  <Method boolean String.equals(Object)>
	//   55   90:ifne            95
	//   56   93:iconst_0        
	//   57   94:ireturn         
	//   58   95:iconst_1        
	//   59   96:ireturn         
		} else
		{
			throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
	//   60   97:new             #50  <Class IllegalArgumentException>
	//   61  100:dup             
	//   62  101:ldc1            #66  <String "Ill-formatted MIME type filter. Type or subtype empty.">
	//   63  103:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//   64  106:athrow          
		}
	}
}
