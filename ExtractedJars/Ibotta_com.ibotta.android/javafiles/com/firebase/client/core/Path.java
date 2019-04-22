// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseException;
import com.firebase.client.snapshot.ChildKey;
import java.util.*;

public class Path
	implements Comparable, Iterable
{

	public Path(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		s = ((String) (s.split("/")));
	//    2    4:aload_1         
	//    3    5:ldc1            #36  <String "/">
	//    4    7:invokevirtual   #42  <Method String[] String.split(String)>
	//    5   10:astore_1        
		int j1 = s.length;
	//    6   11:aload_1         
	//    7   12:arraylength     
	//    8   13:istore          5
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		int j;
		int l;
		for(j = 0; i < j1; j = l)
	//*  11   17:iconst_0        
	//*  12   18:istore_3        
	//*  13   19:iload_2         
	//*  14   20:iload           5
	//*  15   22:icmpge          52
		{
			l = j;
	//   16   25:iload_3         
	//   17   26:istore          4
			if(((String) (s[i])).length() > 0)
	//*  18   28:aload_1         
	//*  19   29:iload_2         
	//*  20   30:aaload          
	//*  21   31:invokevirtual   #46  <Method int String.length()>
	//*  22   34:ifle            42
				l = j + 1;
	//   23   37:iload_3         
	//   24   38:iconst_1        
	//   25   39:iadd            
	//   26   40:istore          4
			i++;
	//   27   42:iload_2         
	//   28   43:iconst_1        
	//   29   44:iadd            
	//   30   45:istore_2        
		}

	//   31   46:iload           4
	//   32   48:istore_3        
	//*  33   49:goto            19
		pieces = new ChildKey[j];
	//   34   52:aload_0         
	//   35   53:iload_3         
	//   36   54:anewarray       ChildKey[]
	//   37   57:putfield        #50  <Field ChildKey[] pieces>
		j1 = s.length;
	//   38   60:aload_1         
	//   39   61:arraylength     
	//   40   62:istore          5
		i = 0;
	//   41   64:iconst_0        
	//   42   65:istore_2        
		int i1;
		for(int k = 0; i < j1; k = i1)
	//*  43   66:iconst_0        
	//*  44   67:istore_3        
	//*  45   68:iload_2         
	//*  46   69:iload           5
	//*  47   71:icmpge          116
		{
			String s1 = ((String) (s[i]));
	//   48   74:aload_1         
	//   49   75:iload_2         
	//   50   76:aaload          
	//   51   77:astore          6
			i1 = k;
	//   52   79:iload_3         
	//   53   80:istore          4
			if(s1.length() > 0)
	//*  54   82:aload           6
	//*  55   84:invokevirtual   #46  <Method int String.length()>
	//*  56   87:ifle            106
			{
				pieces[k] = ChildKey.fromString(s1);
	//   57   90:aload_0         
	//   58   91:getfield        #50  <Field ChildKey[] pieces>
	//   59   94:iload_3         
	//   60   95:aload           6
	//   61   97:invokestatic    #54  <Method ChildKey ChildKey.fromString(String)>
	//   62  100:aastore         
				i1 = k + 1;
	//   63  101:iload_3         
	//   64  102:iconst_1        
	//   65  103:iadd            
	//   66  104:istore          4
			}
			i++;
	//   67  106:iload_2         
	//   68  107:iconst_1        
	//   69  108:iadd            
	//   70  109:istore_2        
		}

	//   71  110:iload           4
	//   72  112:istore_3        
	//*  73  113:goto            68
		start = 0;
	//   74  116:aload_0         
	//   75  117:iconst_0        
	//   76  118:putfield        #56  <Field int start>
		end = pieces.length;
	//   77  121:aload_0         
	//   78  122:aload_0         
	//   79  123:getfield        #50  <Field ChildKey[] pieces>
	//   80  126:arraylength     
	//   81  127:putfield        #58  <Field int end>
	//   82  130:return          
	}

	public transient Path(ChildKey achildkey[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		pieces = (ChildKey[])Arrays.copyOf(((Object []) (achildkey)), achildkey.length);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokestatic    #65  <Method Object[] Arrays.copyOf(Object[], int)>
	//    7   11:checkcast       #66  <Class ChildKey[]>
	//    8   14:putfield        #50  <Field ChildKey[] pieces>
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		start = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #56  <Field int start>
		end = achildkey.length;
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:arraylength     
	//   17   27:putfield        #58  <Field int end>
		for(int j = achildkey.length; i < j; i++)
	//*  18   30:aload_1         
	//*  19   31:arraylength     
	//*  20   32:istore_3        
	//*  21   33:iload_2         
	//*  22   34:iload_3         
	//*  23   35:icmpge          50
		{
			ChildKey childkey = achildkey[i];
	//   24   38:aload_1         
	//   25   39:iload_2         
	//   26   40:aaload          
	//   27   41:astore          4
		}

	//   28   43:iload_2         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_2        
	//*  32   47:goto            33
	//   33   50:return          
	}

	private Path(ChildKey achildkey[], int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		pieces = achildkey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field ChildKey[] pieces>
		start = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #56  <Field int start>
		end = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #58  <Field int end>
	//   11   19:return          
	}

	public static Path getEmptyPath()
	{
		return EMPTY_PATH;
	//    0    0:getstatic       #31  <Field Path EMPTY_PATH>
	//    1    3:areturn         
	}

	public static Path getRelative(Path path, Path path1)
	{
		ChildKey childkey = path.getFront();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method ChildKey getFront()>
	//    2    4:astore_2        
		ChildKey childkey1 = path1.getFront();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #80  <Method ChildKey getFront()>
	//    5    9:astore_3        
		if(childkey == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       16
			return path1;
	//    8   14:aload_1         
	//    9   15:areturn         
		if(childkey.equals(((Object) (childkey1))))
	//*  10   16:aload_2         
	//*  11   17:aload_3         
	//*  12   18:invokevirtual   #84  <Method boolean ChildKey.equals(Object)>
	//*  13   21:ifeq            36
		{
			return getRelative(path.popFront(), path1.popFront());
	//   14   24:aload_0         
	//   15   25:invokevirtual   #87  <Method Path popFront()>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #87  <Method Path popFront()>
	//   18   32:invokestatic    #89  <Method Path getRelative(Path, Path)>
	//   19   35:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   20   36:new             #91  <Class StringBuilder>
	//   21   39:dup             
	//   22   40:invokespecial   #92  <Method void StringBuilder()>
	//   23   43:astore_2        
			stringbuilder.append("INTERNAL ERROR: ");
	//   24   44:aload_2         
	//   25   45:ldc1            #94  <String "INTERNAL ERROR: ">
	//   26   47:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			stringbuilder.append(((Object) (path1)));
	//   28   51:aload_2         
	//   29   52:aload_1         
	//   30   53:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   31   56:pop             
			stringbuilder.append(" is not contained in ");
	//   32   57:aload_2         
	//   33   58:ldc1            #103 <String " is not contained in ">
	//   34   60:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
			stringbuilder.append(((Object) (path)));
	//   36   64:aload_2         
	//   37   65:aload_0         
	//   38   66:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   39   69:pop             
			throw new FirebaseException(stringbuilder.toString());
	//   40   70:new             #105 <Class FirebaseException>
	//   41   73:dup             
	//   42   74:aload_2         
	//   43   75:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   44   78:invokespecial   #110 <Method void FirebaseException(String)>
	//   45   81:athrow          
		}
	}

	public Path child(Path path)
	{
		int i = size() + path.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method int size()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method int size()>
	//    4    8:iadd            
	//    5    9:istore_2        
		ChildKey achildkey[] = new ChildKey[i];
	//    6   10:iload_2         
	//    7   11:anewarray       ChildKey[]
	//    8   14:astore_3        
		System.arraycopy(((Object) (pieces)), start, ((Object) (achildkey)), 0, size());
	//    9   15:aload_0         
	//   10   16:getfield        #50  <Field ChildKey[] pieces>
	//   11   19:aload_0         
	//   12   20:getfield        #56  <Field int start>
	//   13   23:aload_3         
	//   14   24:iconst_0        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #115 <Method int size()>
	//   17   29:invokestatic    #121 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (path.pieces)), path.start, ((Object) (achildkey)), size(), path.size());
	//   18   32:aload_1         
	//   19   33:getfield        #50  <Field ChildKey[] pieces>
	//   20   36:aload_1         
	//   21   37:getfield        #56  <Field int start>
	//   22   40:aload_3         
	//   23   41:aload_0         
	//   24   42:invokevirtual   #115 <Method int size()>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #115 <Method int size()>
	//   27   49:invokestatic    #121 <Method void System.arraycopy(Object, int, Object, int, int)>
		return new Path(achildkey, 0, i);
	//   28   52:new             #2   <Class Path>
	//   29   55:dup             
	//   30   56:aload_3         
	//   31   57:iconst_0        
	//   32   58:iload_2         
	//   33   59:invokespecial   #123 <Method void Path(ChildKey[], int, int)>
	//   34   62:areturn         
	}

	public Path child(ChildKey childkey)
	{
		int i = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method int size()>
	//    2    4:istore_2        
		int j = i + 1;
	//    3    5:iload_2         
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:istore_3        
		ChildKey achildkey[] = new ChildKey[j];
	//    7    9:iload_3         
	//    8   10:anewarray       ChildKey[]
	//    9   13:astore          4
		System.arraycopy(((Object) (pieces)), start, ((Object) (achildkey)), 0, i);
	//   10   15:aload_0         
	//   11   16:getfield        #50  <Field ChildKey[] pieces>
	//   12   19:aload_0         
	//   13   20:getfield        #56  <Field int start>
	//   14   23:aload           4
	//   15   25:iconst_0        
	//   16   26:iload_2         
	//   17   27:invokestatic    #121 <Method void System.arraycopy(Object, int, Object, int, int)>
		achildkey[i] = childkey;
	//   18   30:aload           4
	//   19   32:iload_2         
	//   20   33:aload_1         
	//   21   34:aastore         
		return new Path(achildkey, 0, j);
	//   22   35:new             #2   <Class Path>
	//   23   38:dup             
	//   24   39:aload           4
	//   25   41:iconst_0        
	//   26   42:iload_3         
	//   27   43:invokespecial   #123 <Method void Path(ChildKey[], int, int)>
	//   28   46:areturn         
	}

	public int compareTo(Path path)
	{
		int j = start;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int start>
	//    2    4:istore_3        
		int i;
		for(i = path.start; j < end && i < path.end; i++)
	//*   3    5:aload_1         
	//*   4    6:getfield        #56  <Field int start>
	//*   5    9:istore_2        
	//*   6   10:iload_3         
	//*   7   11:aload_0         
	//*   8   12:getfield        #58  <Field int end>
	//*   9   15:icmpge          62
	//*  10   18:iload_2         
	//*  11   19:aload_1         
	//*  12   20:getfield        #58  <Field int end>
	//*  13   23:icmpge          62
		{
			int k = pieces[j].compareTo(path.pieces[i]);
	//   14   26:aload_0         
	//   15   27:getfield        #50  <Field ChildKey[] pieces>
	//   16   30:iload_3         
	//   17   31:aaload          
	//   18   32:aload_1         
	//   19   33:getfield        #50  <Field ChildKey[] pieces>
	//   20   36:iload_2         
	//   21   37:aaload          
	//   22   38:invokevirtual   #128 <Method int ChildKey.compareTo(ChildKey)>
	//   23   41:istore          4
			if(k != 0)
	//*  24   43:iload           4
	//*  25   45:ifeq            51
				return k;
	//   26   48:iload           4
	//   27   50:ireturn         
			j++;
	//   28   51:iload_3         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_3        
		}

	//   32   55:iload_2         
	//   33   56:iconst_1        
	//   34   57:iadd            
	//   35   58:istore_2        
	//*  36   59:goto            10
		if(j == end && i == path.end)
	//*  37   62:iload_3         
	//*  38   63:aload_0         
	//*  39   64:getfield        #58  <Field int end>
	//*  40   67:icmpne          80
	//*  41   70:iload_2         
	//*  42   71:aload_1         
	//*  43   72:getfield        #58  <Field int end>
	//*  44   75:icmpne          80
			return 0;
	//   45   78:iconst_0        
	//   46   79:ireturn         
		return j != end ? 1 : -1;
	//   47   80:iload_3         
	//   48   81:aload_0         
	//   49   82:getfield        #58  <Field int end>
	//   50   85:icmpne          90
	//   51   88:iconst_m1       
	//   52   89:ireturn         
	//   53   90:iconst_1        
	//   54   91:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((Path)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class Path>
	//    3    5:invokevirtual   #131 <Method int compareTo(Path)>
	//    4    8:ireturn         
	}

	public boolean contains(Path path)
	{
		if(size() > path.size())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #115 <Method int size()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #115 <Method int size()>
	//*   4    8:icmple          13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		int j = start;
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field int start>
	//    9   17:istore_3        
		for(int i = path.start; j < end; i++)
	//*  10   18:aload_1         
	//*  11   19:getfield        #56  <Field int start>
	//*  12   22:istore_2        
	//*  13   23:iload_3         
	//*  14   24:aload_0         
	//*  15   25:getfield        #58  <Field int end>
	//*  16   28:icmpge          62
		{
			if(!pieces[j].equals(((Object) (path.pieces[i]))))
	//*  17   31:aload_0         
	//*  18   32:getfield        #50  <Field ChildKey[] pieces>
	//*  19   35:iload_3         
	//*  20   36:aaload          
	//*  21   37:aload_1         
	//*  22   38:getfield        #50  <Field ChildKey[] pieces>
	//*  23   41:iload_2         
	//*  24   42:aaload          
	//*  25   43:invokevirtual   #84  <Method boolean ChildKey.equals(Object)>
	//*  26   46:ifne            51
				return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
			j++;
	//   29   51:iload_3         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_3        
		}

	//   33   55:iload_2         
	//   34   56:iconst_1        
	//   35   57:iadd            
	//   36   58:istore_2        
	//*  37   59:goto            23
		return true;
	//   38   62:iconst_1        
	//   39   63:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Path))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Path>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(this == obj)
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:if_acmpne       16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		obj = ((Object) ((Path)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class Path>
	//   12   20:astore_1        
		if(size() != ((Path) (obj)).size())
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #115 <Method int size()>
	//*  15   25:aload_1         
	//*  16   26:invokevirtual   #115 <Method int size()>
	//*  17   29:icmpeq          34
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		int j = start;
	//   20   34:aload_0         
	//   21   35:getfield        #56  <Field int start>
	//   22   38:istore_3        
		for(int i = ((Path) (obj)).start; j < end && i < ((Path) (obj)).end; i++)
	//*  23   39:aload_1         
	//*  24   40:getfield        #56  <Field int start>
	//*  25   43:istore_2        
	//*  26   44:iload_3         
	//*  27   45:aload_0         
	//*  28   46:getfield        #58  <Field int end>
	//*  29   49:icmpge          91
	//*  30   52:iload_2         
	//*  31   53:aload_1         
	//*  32   54:getfield        #58  <Field int end>
	//*  33   57:icmpge          91
		{
			if(!pieces[j].equals(((Object) (((Path) (obj)).pieces[i]))))
	//*  34   60:aload_0         
	//*  35   61:getfield        #50  <Field ChildKey[] pieces>
	//*  36   64:iload_3         
	//*  37   65:aaload          
	//*  38   66:aload_1         
	//*  39   67:getfield        #50  <Field ChildKey[] pieces>
	//*  40   70:iload_2         
	//*  41   71:aaload          
	//*  42   72:invokevirtual   #84  <Method boolean ChildKey.equals(Object)>
	//*  43   75:ifne            80
				return false;
	//   44   78:iconst_0        
	//   45   79:ireturn         
			j++;
	//   46   80:iload_3         
	//   47   81:iconst_1        
	//   48   82:iadd            
	//   49   83:istore_3        
		}

	//   50   84:iload_2         
	//   51   85:iconst_1        
	//   52   86:iadd            
	//   53   87:istore_2        
	//*  54   88:goto            44
		return true;
	//   55   91:iconst_1        
	//   56   92:ireturn         
	}

	public ChildKey getBack()
	{
		if(!isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #138 <Method boolean isEmpty()>
	//*   2    4:ifne            19
			return pieces[end - 1];
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field ChildKey[] pieces>
	//    5   11:aload_0         
	//    6   12:getfield        #58  <Field int end>
	//    7   15:iconst_1        
	//    8   16:isub            
	//    9   17:aaload          
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	public ChildKey getFront()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #138 <Method boolean isEmpty()>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return pieces[start];
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field ChildKey[] pieces>
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field int start>
	//    9   17:aaload          
	//   10   18:areturn         
	}

	public Path getParent()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #138 <Method boolean isEmpty()>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return new Path(pieces, start, end - 1);
	//    5    9:new             #2   <Class Path>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #50  <Field ChildKey[] pieces>
	//    9   17:aload_0         
	//   10   18:getfield        #56  <Field int start>
	//   11   21:aload_0         
	//   12   22:getfield        #58  <Field int end>
	//   13   25:iconst_1        
	//   14   26:isub            
	//   15   27:invokespecial   #123 <Method void Path(ChildKey[], int, int)>
	//   16   30:areturn         
	}

	public int hashCode()
	{
		int i = start;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int start>
	//    2    4:istore_1        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		for(; i < end; i++)
	//*   5    7:iload_1         
	//*   6    8:aload_0         
	//*   7    9:getfield        #58  <Field int end>
	//*   8   12:icmpge          37
			j = j * 37 + pieces[i].hashCode();
	//    9   15:iload_2         
	//   10   16:bipush          37
	//   11   18:imul            
	//   12   19:aload_0         
	//   13   20:getfield        #50  <Field ChildKey[] pieces>
	//   14   23:iload_1         
	//   15   24:aaload          
	//   16   25:invokevirtual   #142 <Method int ChildKey.hashCode()>
	//   17   28:iadd            
	//   18   29:istore_2        

	//   19   30:iload_1         
	//   20   31:iconst_1        
	//   21   32:iadd            
	//   22   33:istore_1        
	//*  23   34:goto            7
		return j;
	//   24   37:iload_2         
	//   25   38:ireturn         
	}

	public boolean isEmpty()
	{
		return start >= end;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int start>
	//    2    4:aload_0         
	//    3    5:getfield        #58  <Field int end>
	//    4    8:icmplt          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public Iterator iterator()
	{
		return new Iterator() {

			public boolean hasNext()
			{
				return offset < end;
			//    0    0:aload_0         
			//    1    1:getfield        #29  <Field int offset>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field Path this$0>
			//    4    8:invokestatic    #35  <Method int Path.access$100(Path)>
			//    5   11:icmpge          16
			//    6   14:iconst_1        
			//    7   15:ireturn         
			//    8   16:iconst_0        
			//    9   17:ireturn         
			}

			public ChildKey next()
			{
				if(hasNext())
			//*   0    0:aload_0         
			//*   1    1:invokevirtual   #39  <Method boolean hasNext()>
			//*   2    4:ifeq            33
				{
					ChildKey achildkey[] = pieces;
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field Path this$0>
			//    5   11:invokestatic    #43  <Method ChildKey[] Path.access$200(Path)>
			//    6   14:astore_2        
					int i = offset;
			//    7   15:aload_0         
			//    8   16:getfield        #29  <Field int offset>
			//    9   19:istore_1        
					ChildKey childkey = achildkey[i];
			//   10   20:aload_2         
			//   11   21:iload_1         
			//   12   22:aaload          
			//   13   23:astore_2        
					offset = i + 1;
			//   14   24:aload_0         
			//   15   25:iload_1         
			//   16   26:iconst_1        
			//   17   27:iadd            
			//   18   28:putfield        #29  <Field int offset>
					return childkey;
			//   19   31:aload_2         
			//   20   32:areturn         
				} else
				{
					throw new NoSuchElementException("No more elements.");
			//   21   33:new             #45  <Class NoSuchElementException>
			//   22   36:dup             
			//   23   37:ldc1            #47  <String "No more elements.">
			//   24   39:invokespecial   #50  <Method void NoSuchElementException(String)>
			//   25   42:athrow          
				}
			}

			public volatile Object next()
			{
				return ((Object) (next()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #53  <Method ChildKey next()>
			//    2    4:areturn         
			}

			public void remove()
			{
				throw new UnsupportedOperationException("Can't remove component from immutable Path!");
			//    0    0:new             #56  <Class UnsupportedOperationException>
			//    1    3:dup             
			//    2    4:ldc1            #58  <String "Can't remove component from immutable Path!">
			//    3    6:invokespecial   #59  <Method void UnsupportedOperationException(String)>
			//    4    9:athrow          
			}

			int offset;
			final Path this$0;

			
			{
				this$0 = Path.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Path this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
				offset = start;
			//    5    9:aload_0         
			//    6   10:aload_0         
			//    7   11:getfield        #20  <Field Path this$0>
			//    8   14:invokestatic    #27  <Method int Path.access$000(Path)>
			//    9   17:putfield        #29  <Field int offset>
			//   10   20:return          
			}
		}
;
	//    0    0:new             #11  <Class Path$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #147 <Method void Path$1(Path)>
	//    4    8:areturn         
	}

	public Path popFront()
	{
		int j = start;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int start>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(!isEmpty())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #138 <Method boolean isEmpty()>
	//*   7   11:ifne            18
			i = j + 1;
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:istore_1        
		return new Path(pieces, i, end);
	//   12   18:new             #2   <Class Path>
	//   13   21:dup             
	//   14   22:aload_0         
	//   15   23:getfield        #50  <Field ChildKey[] pieces>
	//   16   26:iload_1         
	//   17   27:aload_0         
	//   18   28:getfield        #58  <Field int end>
	//   19   31:invokespecial   #123 <Method void Path(ChildKey[], int, int)>
	//   20   34:areturn         
	}

	public int size()
	{
		return end - start;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int end>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field int start>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public String toString()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #138 <Method boolean isEmpty()>
	//*   2    4:ifeq            10
			return "/";
	//    3    7:ldc1            #36  <String "/">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #91  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #92  <Method void StringBuilder()>
	//    8   17:astore_2        
		for(int i = start; i < end; i++)
	//*   9   18:aload_0         
	//*  10   19:getfield        #56  <Field int start>
	//*  11   22:istore_1        
	//*  12   23:iload_1         
	//*  13   24:aload_0         
	//*  14   25:getfield        #58  <Field int end>
	//*  15   28:icmpge          59
		{
			stringbuilder.append("/");
	//   16   31:aload_2         
	//   17   32:ldc1            #36  <String "/">
	//   18   34:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(pieces[i].asString());
	//   20   38:aload_2         
	//   21   39:aload_0         
	//   22   40:getfield        #50  <Field ChildKey[] pieces>
	//   23   43:iload_1         
	//   24   44:aaload          
	//   25   45:invokevirtual   #152 <Method String ChildKey.asString()>
	//   26   48:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		}

	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
	//*  32   56:goto            23
		return stringbuilder.toString();
	//   33   59:aload_2         
	//   34   60:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   35   63:areturn         
	}

	public String wireFormat()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #138 <Method boolean isEmpty()>
	//*   2    4:ifeq            10
			return "/";
	//    3    7:ldc1            #36  <String "/">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5   10:new             #91  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #92  <Method void StringBuilder()>
	//    8   17:astore_2        
		for(int i = start; i < end; i++)
	//*   9   18:aload_0         
	//*  10   19:getfield        #56  <Field int start>
	//*  11   22:istore_1        
	//*  12   23:iload_1         
	//*  13   24:aload_0         
	//*  14   25:getfield        #58  <Field int end>
	//*  15   28:icmpge          67
		{
			if(i > start)
	//*  16   31:iload_1         
	//*  17   32:aload_0         
	//*  18   33:getfield        #56  <Field int start>
	//*  19   36:icmple          46
				stringbuilder.append("/");
	//   20   39:aload_2         
	//   21   40:ldc1            #36  <String "/">
	//   22   42:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			stringbuilder.append(pieces[i].asString());
	//   24   46:aload_2         
	//   25   47:aload_0         
	//   26   48:getfield        #50  <Field ChildKey[] pieces>
	//   27   51:iload_1         
	//   28   52:aaload          
	//   29   53:invokevirtual   #152 <Method String ChildKey.asString()>
	//   30   56:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
		}

	//   32   60:iload_1         
	//   33   61:iconst_1        
	//   34   62:iadd            
	//   35   63:istore_1        
	//*  36   64:goto            23
		return stringbuilder.toString();
	//   37   67:aload_2         
	//   38   68:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   39   71:areturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final Path EMPTY_PATH = new Path("");
	private final int end;
	private final ChildKey pieces[];
	private final int start;

	static 
	{
	//    0    0:new             #2   <Class Path>
	//    1    3:dup             
	//    2    4:ldc1            #25  <String "">
	//    3    6:invokespecial   #29  <Method void Path(String)>
	//    4    9:putstatic       #31  <Field Path EMPTY_PATH>
	//*   5   12:return          
	}


/*
	static int access$000(Path path)
	{
		return path.start;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int start>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(Path path)
	{
		return path.end;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int end>
	//    2    4:ireturn         
	}

*/


/*
	static ChildKey[] access$200(Path path)
	{
		return path.pieces;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ChildKey[] pieces>
	//    2    4:areturn         
	}

*/
}
