// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.joran.spi:
//			ElementPath

public class ElementSelector extends ElementPath
{

	public ElementSelector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ElementPath()>
	//    2    4:return          
	}

	public ElementSelector(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ElementPath(String)>
	//    3    5:return          
	}

	public ElementSelector(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void ElementPath(List)>
	//    3    5:return          
	}

	private boolean equalityCheck(String s, String s1)
	{
		return s.equalsIgnoreCase(s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #25  <Method boolean String.equalsIgnoreCase(String)>
	//    3    5:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          71
		{
			if(!(obj instanceof ElementSelector))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class ElementSelector>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			obj = ((Object) ((ElementSelector)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class ElementSelector>
	//    9   17:astore_1        
			if(((ElementSelector) (obj)).size() != size())
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #31  <Method int size()>
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #31  <Method int size()>
	//*  14   26:icmpeq          31
				return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
			int j = size();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #31  <Method int size()>
	//   19   35:istore_3        
			for(int i = 0; i < j; i++)
	//*  20   36:iconst_0        
	//*  21   37:istore_2        
	//*  22   38:iload_2         
	//*  23   39:iload_3         
	//*  24   40:icmpge          69
				if(!equalityCheck(get(i), ((ElementSelector) (obj)).get(i)))
	//*  25   43:aload_0         
	//*  26   44:aload_0         
	//*  27   45:iload_2         
	//*  28   46:invokevirtual   #35  <Method String get(int)>
	//*  29   49:aload_1         
	//*  30   50:iload_2         
	//*  31   51:invokevirtual   #35  <Method String get(int)>
	//*  32   54:invokespecial   #37  <Method boolean equalityCheck(String, String)>
	//*  33   57:ifne            62
					return false;
	//   34   60:iconst_0        
	//   35   61:ireturn         

	//   36   62:iload_2         
	//   37   63:iconst_1        
	//   38   64:iadd            
	//   39   65:istore_2        
	//*  40   66:goto            38
			return true;
	//   41   69:iconst_1        
	//   42   70:ireturn         
		} else
		{
			return false;
	//   43   71:iconst_0        
	//   44   72:ireturn         
		}
	}

	public boolean fullPathMatch(ElementPath elementpath)
	{
		if(elementpath.size() != size())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #40  <Method int ElementPath.size()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #31  <Method int size()>
	//*   4    8:icmpeq          13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		int j = size();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #31  <Method int size()>
	//    9   17:istore_3        
		for(int i = 0; i < j; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_2        
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:icmpge          51
			if(!equalityCheck(get(i), elementpath.get(i)))
	//*  15   25:aload_0         
	//*  16   26:aload_0         
	//*  17   27:iload_2         
	//*  18   28:invokevirtual   #35  <Method String get(int)>
	//*  19   31:aload_1         
	//*  20   32:iload_2         
	//*  21   33:invokevirtual   #41  <Method String ElementPath.get(int)>
	//*  22   36:invokespecial   #37  <Method boolean equalityCheck(String, String)>
	//*  23   39:ifne            44
				return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         

	//   26   44:iload_2         
	//   27   45:iconst_1        
	//   28   46:iadd            
	//   29   47:istore_2        
	//*  30   48:goto            20
		return true;
	//   31   51:iconst_1        
	//   32   52:ireturn         
	}

	public int getPrefixMatchLength(ElementPath elementpath)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(elementpath == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return 0;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		int i = partList.size();
	//    6    8:aload_0         
	//    7    9:getfield        #47  <Field ArrayList partList>
	//    8   12:invokevirtual   #50  <Method int ArrayList.size()>
	//    9   15:istore_2        
		int k = elementpath.partList.size();
	//   10   16:aload_1         
	//   11   17:getfield        #51  <Field ArrayList ElementPath.partList>
	//   12   20:invokevirtual   #50  <Method int ArrayList.size()>
	//   13   23:istore          4
		if(i != 0)
	//*  14   25:iload_2         
	//*  15   26:ifeq            101
		{
			if(k == 0)
	//*  16   29:iload           4
	//*  17   31:ifne            36
				return 0;
	//   18   34:iconst_0        
	//   19   35:ireturn         
			if(i > k)
	//*  20   36:iload_2         
	//*  21   37:iload           4
	//*  22   39:icmpgt          45
	//*  23   42:goto            48
				i = k;
	//   24   45:iload           4
	//   25   47:istore_2        
			k = 0;
	//   26   48:iconst_0        
	//   27   49:istore          4
			for(; j < i && equalityCheck((String)partList.get(j), (String)elementpath.partList.get(j)); j++)
	//*  28   51:iload_3         
	//*  29   52:iload_2         
	//*  30   53:icmpge          98
	//*  31   56:aload_0         
	//*  32   57:aload_0         
	//*  33   58:getfield        #47  <Field ArrayList partList>
	//*  34   61:iload_3         
	//*  35   62:invokevirtual   #54  <Method Object ArrayList.get(int)>
	//*  36   65:checkcast       #21  <Class String>
	//*  37   68:aload_1         
	//*  38   69:getfield        #51  <Field ArrayList ElementPath.partList>
	//*  39   72:iload_3         
	//*  40   73:invokevirtual   #54  <Method Object ArrayList.get(int)>
	//*  41   76:checkcast       #21  <Class String>
	//*  42   79:invokespecial   #37  <Method boolean equalityCheck(String, String)>
	//*  43   82:ifeq            98
				k++;
	//   44   85:iload           4
	//   45   87:iconst_1        
	//   46   88:iadd            
	//   47   89:istore          4

	//   48   91:iload_3         
	//   49   92:iconst_1        
	//   50   93:iadd            
	//   51   94:istore_3        
	//*  52   95:goto            51
			return k;
	//   53   98:iload           4
	//   54  100:ireturn         
		} else
		{
			return 0;
	//   55  101:iconst_0        
	//   56  102:ireturn         
		}
	}

	public int getTailMatchLength(ElementPath elementpath)
	{
		int l = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		if(elementpath == null)
	//*   4    5:aload_1         
	//*   5    6:ifnonnull       11
			return 0;
	//    6    9:iconst_0        
	//    7   10:ireturn         
		int i1 = partList.size();
	//    8   11:aload_0         
	//    9   12:getfield        #47  <Field ArrayList partList>
	//   10   15:invokevirtual   #50  <Method int ArrayList.size()>
	//   11   18:istore          6
		int j1 = elementpath.partList.size();
	//   12   20:aload_1         
	//   13   21:getfield        #51  <Field ArrayList ElementPath.partList>
	//   14   24:invokevirtual   #50  <Method int ArrayList.size()>
	//   15   27:istore          7
		if(i1 != 0)
	//*  16   29:iload           6
	//*  17   31:ifeq            122
		{
			if(j1 == 0)
	//*  18   34:iload           7
	//*  19   36:ifne            41
				return 0;
	//   20   39:iconst_0        
	//   21   40:ireturn         
			int j;
			if(i1 <= j1)
	//*  22   41:iload           6
	//*  23   43:iload           7
	//*  24   45:icmpgt          54
				j = i1;
	//   25   48:iload           6
	//   26   50:istore_3        
			else
	//*  27   51:goto            57
				j = j1;
	//   28   54:iload           7
	//   29   56:istore_3        
			int k = 1;
	//   30   57:iconst_1        
	//   31   58:istore          4
			do
			{
				l = i;
	//   32   60:iload_2         
	//   33   61:istore          5
				if(k > j)
					break;
	//   34   63:iload           4
	//   35   65:iload_3         
	//   36   66:icmpgt          122
				l = i;
	//   37   69:iload_2         
	//   38   70:istore          5
				if(!equalityCheck((String)partList.get(i1 - k), (String)elementpath.partList.get(j1 - k)))
					break;
	//   39   72:aload_0         
	//   40   73:aload_0         
	//   41   74:getfield        #47  <Field ArrayList partList>
	//   42   77:iload           6
	//   43   79:iload           4
	//   44   81:isub            
	//   45   82:invokevirtual   #54  <Method Object ArrayList.get(int)>
	//   46   85:checkcast       #21  <Class String>
	//   47   88:aload_1         
	//   48   89:getfield        #51  <Field ArrayList ElementPath.partList>
	//   49   92:iload           7
	//   50   94:iload           4
	//   51   96:isub            
	//   52   97:invokevirtual   #54  <Method Object ArrayList.get(int)>
	//   53  100:checkcast       #21  <Class String>
	//   54  103:invokespecial   #37  <Method boolean equalityCheck(String, String)>
	//   55  106:ifeq            122
				i++;
	//   56  109:iload_2         
	//   57  110:iconst_1        
	//   58  111:iadd            
	//   59  112:istore_2        
				k++;
	//   60  113:iload           4
	//   61  115:iconst_1        
	//   62  116:iadd            
	//   63  117:istore          4
			} while(true);
	//   64  119:goto            60
		}
		return l;
	//   65  122:iload           5
	//   66  124:ireturn         
	}

	public int hashCode()
	{
		int k = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method int size()>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		int j = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
		for(; i < k; i++)
	//*   7    9:iload_1         
	//*   8   10:iload_3         
	//*   9   11:icmpge          35
			j ^= get(i).toLowerCase().hashCode();
	//   10   14:iload_2         
	//   11   15:aload_0         
	//   12   16:iload_1         
	//   13   17:invokevirtual   #35  <Method String get(int)>
	//   14   20:invokevirtual   #60  <Method String String.toLowerCase()>
	//   15   23:invokevirtual   #62  <Method int String.hashCode()>
	//   16   26:ixor            
	//   17   27:istore_2        

	//   18   28:iload_1         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_1        
	//*  22   32:goto            9
		return j;
	//   23   35:iload_2         
	//   24   36:ireturn         
	}

	public boolean isContainedIn(ElementPath elementpath)
	{
		if(elementpath == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return elementpath.toStableString().contains(((CharSequence) (toStableString())));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #66  <Method String ElementPath.toStableString()>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #67  <Method String toStableString()>
	//    8   14:invokevirtual   #71  <Method boolean String.contains(CharSequence)>
	//    9   17:ireturn         
	}
}
