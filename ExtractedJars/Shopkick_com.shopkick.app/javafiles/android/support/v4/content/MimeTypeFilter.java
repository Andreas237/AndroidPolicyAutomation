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
		if(as1.length == 2)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_2        
	//*   3    3:icmpne          94
		{
			if(!as1[0].isEmpty() && !as1[1].isEmpty())
	//*   4    6:aload_1         
	//*   5    7:iconst_0        
	//*   6    8:aaload          
	//*   7    9:invokevirtual   #52  <Method boolean String.isEmpty()>
	//*   8   12:ifne            84
	//*   9   15:aload_1         
	//*  10   16:iconst_1        
	//*  11   17:aaload          
	//*  12   18:invokevirtual   #52  <Method boolean String.isEmpty()>
	//*  13   21:ifne            84
			{
				if(as.length != 2)
	//*  14   24:aload_0         
	//*  15   25:arraylength     
	//*  16   26:iconst_2        
	//*  17   27:icmpeq          32
					return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         
				if(!"*".equals(((Object) (as1[0]))) && !as1[0].equals(((Object) (as[0]))))
	//*  20   32:ldc1            #54  <String "*">
	//*  21   34:aload_1         
	//*  22   35:iconst_0        
	//*  23   36:aaload          
	//*  24   37:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  25   40:ifne            57
	//*  26   43:aload_1         
	//*  27   44:iconst_0        
	//*  28   45:aaload          
	//*  29   46:aload_0         
	//*  30   47:iconst_0        
	//*  31   48:aaload          
	//*  32   49:invokevirtual   #57  <Method boolean String.equals(Object)>
	//*  33   52:ifne            57
					return false;
	//   34   55:iconst_0        
	//   35   56:ireturn         
				return "*".equals(((Object) (as1[1]))) || as1[1].equals(((Object) (as[1])));
	//   36   57:ldc1            #54  <String "*">
	//   37   59:aload_1         
	//   38   60:iconst_1        
	//   39   61:aaload          
	//   40   62:invokevirtual   #57  <Method boolean String.equals(Object)>
	//   41   65:ifne            82
	//   42   68:aload_1         
	//   43   69:iconst_1        
	//   44   70:aaload          
	//   45   71:aload_0         
	//   46   72:iconst_1        
	//   47   73:aaload          
	//   48   74:invokevirtual   #57  <Method boolean String.equals(Object)>
	//   49   77:ifne            82
	//   50   80:iconst_0        
	//   51   81:ireturn         
	//   52   82:iconst_1        
	//   53   83:ireturn         
			} else
			{
				throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
	//   54   84:new             #59  <Class IllegalArgumentException>
	//   55   87:dup             
	//   56   88:ldc1            #61  <String "Ill-formatted MIME type filter. Type or subtype empty.">
	//   57   90:invokespecial   #64  <Method void IllegalArgumentException(String)>
	//   58   93:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
	//   59   94:new             #59  <Class IllegalArgumentException>
	//   60   97:dup             
	//   61   98:ldc1            #66  <String "Ill-formatted MIME type filter. Must be type/subtype.">
	//   62  100:invokespecial   #64  <Method void IllegalArgumentException(String)>
	//   63  103:athrow          
		}
	}
}
