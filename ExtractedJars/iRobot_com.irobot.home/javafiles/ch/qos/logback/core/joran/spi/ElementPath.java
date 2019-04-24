// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import java.util.*;

public class ElementPath
{

	public ElementPath()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		partList = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field ArrayList partList>
	//    7   15:return          
	}

	public ElementPath(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		partList = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field ArrayList partList>
		if(s == null)
	//*   7   15:aload_1         
	//*   8   16:ifnonnull       20
			return;
	//    9   19:return          
		s = ((String) (s.split("/")));
	//   10   20:aload_1         
	//   11   21:ldc1            #20  <String "/">
	//   12   23:invokevirtual   #26  <Method String[] String.split(String)>
	//   13   26:astore_1        
		if(s == null)
	//*  14   27:aload_1         
	//*  15   28:ifnonnull       32
			return;
	//   16   31:return          
		int j = s.length;
	//   17   32:aload_1         
	//   18   33:arraylength     
	//   19   34:istore_3        
		for(int i = 0; i < j; i++)
	//*  20   35:iconst_0        
	//*  21   36:istore_2        
	//*  22   37:iload_2         
	//*  23   38:iload_3         
	//*  24   39:icmpge          72
		{
			String s1 = ((String) (s[i]));
	//   25   42:aload_1         
	//   26   43:iload_2         
	//   27   44:aaload          
	//   28   45:astore          4
			if(s1.length() > 0)
	//*  29   47:aload           4
	//*  30   49:invokevirtual   #30  <Method int String.length()>
	//*  31   52:ifle            65
				partList.add(((Object) (s1)));
	//   32   55:aload_0         
	//   33   56:getfield        #16  <Field ArrayList partList>
	//   34   59:aload           4
	//   35   61:invokevirtual   #34  <Method boolean ArrayList.add(Object)>
	//   36   64:pop             
		}

	//   37   65:iload_2         
	//   38   66:iconst_1        
	//   39   67:iadd            
	//   40   68:istore_2        
	//*  41   69:goto            37
	//   42   72:return          
	}

	public ElementPath(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		partList = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field ArrayList partList>
		partList.addAll(((java.util.Collection) (list)));
	//    7   15:aload_0         
	//    8   16:getfield        #16  <Field ArrayList partList>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #39  <Method boolean ArrayList.addAll(java.util.Collection)>
	//   11   23:pop             
	//   12   24:return          
	}

	private boolean equalityCheck(String s, String s1)
	{
		return s.equalsIgnoreCase(s1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #47  <Method boolean String.equalsIgnoreCase(String)>
	//    3    5:ireturn         
	}

	public ElementPath duplicate()
	{
		ElementPath elementpath = new ElementPath();
	//    0    0:new             #2   <Class ElementPath>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void ElementPath()>
	//    3    7:astore_1        
		elementpath.partList.addAll(((java.util.Collection) (partList)));
	//    4    8:aload_1         
	//    5    9:getfield        #16  <Field ArrayList partList>
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field ArrayList partList>
	//    8   16:invokevirtual   #39  <Method boolean ArrayList.addAll(java.util.Collection)>
	//    9   19:pop             
		return elementpath;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          71
		{
			if(!(obj instanceof ElementPath))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class ElementPath>
	//*   4    8:ifne            13
				return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			obj = ((Object) ((ElementPath)obj));
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class ElementPath>
	//    9   17:astore_1        
			if(((ElementPath) (obj)).size() != size())
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #54  <Method int size()>
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #54  <Method int size()>
	//*  14   26:icmpeq          31
				return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
			int j = size();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #54  <Method int size()>
	//   19   35:istore_3        
			for(int i = 0; i < j; i++)
	//*  20   36:iconst_0        
	//*  21   37:istore_2        
	//*  22   38:iload_2         
	//*  23   39:iload_3         
	//*  24   40:icmpge          69
				if(!equalityCheck(get(i), ((ElementPath) (obj)).get(i)))
	//*  25   43:aload_0         
	//*  26   44:aload_0         
	//*  27   45:iload_2         
	//*  28   46:invokevirtual   #58  <Method String get(int)>
	//*  29   49:aload_1         
	//*  30   50:iload_2         
	//*  31   51:invokevirtual   #58  <Method String get(int)>
	//*  32   54:invokespecial   #60  <Method boolean equalityCheck(String, String)>
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

	public String get(int i)
	{
		return (String)partList.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList partList>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #63  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #22  <Class String>
	//    5   11:areturn         
	}

	public List getCopyOfPartList()
	{
		return ((List) (new ArrayList(((java.util.Collection) (partList)))));
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ArrayList partList>
	//    4    8:invokespecial   #68  <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public String peekLast()
	{
		if(!partList.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ArrayList partList>
	//*   2    4:invokevirtual   #75  <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            32
		{
			int i = partList.size();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ArrayList partList>
	//    6   14:invokevirtual   #76  <Method int ArrayList.size()>
	//    7   17:istore_1        
			return (String)partList.get(i - 1);
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field ArrayList partList>
	//   10   22:iload_1         
	//   11   23:iconst_1        
	//   12   24:isub            
	//   13   25:invokevirtual   #63  <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #22  <Class String>
	//   15   31:areturn         
		} else
		{
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
		}
	}

	public void pop()
	{
		if(!partList.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ArrayList partList>
	//*   2    4:invokevirtual   #75  <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            27
			partList.remove(partList.size() - 1);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ArrayList partList>
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field ArrayList partList>
	//    8   18:invokevirtual   #76  <Method int ArrayList.size()>
	//    9   21:iconst_1        
	//   10   22:isub            
	//   11   23:invokevirtual   #80  <Method Object ArrayList.remove(int)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void push(String s)
	{
		partList.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList partList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public int size()
	{
		return partList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList partList>
	//    2    4:invokevirtual   #76  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	protected String toStableString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void StringBuilder()>
	//    3    7:astore_1        
		for(Iterator iterator = partList.iterator(); iterator.hasNext(); stringbuilder.append("]"))
	//*   4    8:aload_0         
	//*   5    9:getfield        #16  <Field ArrayList partList>
	//*   6   12:invokevirtual   #89  <Method Iterator ArrayList.iterator()>
	//*   7   15:astore_2        
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #94  <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            58
		{
			String s = (String)iterator.next();
	//   11   25:aload_2         
	//   12   26:invokeinterface #98  <Method Object Iterator.next()>
	//   13   31:checkcast       #22  <Class String>
	//   14   34:astore_3        
			stringbuilder.append("[");
	//   15   35:aload_1         
	//   16   36:ldc1            #100 <String "[">
	//   17   38:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			stringbuilder.append(s);
	//   19   42:aload_1         
	//   20   43:aload_3         
	//   21   44:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
		}

	//   23   48:aload_1         
	//   24   49:ldc1            #106 <String "]">
	//   25   51:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
	//*  27   55:goto            16
		return stringbuilder.toString();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #109 <Method String StringBuilder.toString()>
	//   30   62:areturn         
	}

	public String toString()
	{
		return toStableString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method String toStableString()>
	//    2    4:areturn         
	}

	ArrayList partList;
}
