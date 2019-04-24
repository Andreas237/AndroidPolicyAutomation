// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;

import java.util.*;

public class Tag
	implements Iterable
{

	public Tag(String s)
	{
		this(s, ((Map) (new LinkedHashMap(0))), ((Map) (new LinkedHashMap(0))), "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #25  <Class LinkedHashMap>
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:invokespecial   #28  <Method void LinkedHashMap(int)>
	//    6   10:new             #25  <Class LinkedHashMap>
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:invokespecial   #28  <Method void LinkedHashMap(int)>
	//   10   18:ldc1            #30  <String "">
	//   11   20:invokespecial   #33  <Method void Tag(String, Map, Map, String)>
	//   12   23:return          
	}

	public Tag(String s, String s1)
	{
		this(s, ((Map) (new LinkedHashMap(0))), ((Map) (new LinkedHashMap(0))), s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #25  <Class LinkedHashMap>
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:invokespecial   #28  <Method void LinkedHashMap(int)>
	//    6   10:new             #25  <Class LinkedHashMap>
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:invokespecial   #28  <Method void LinkedHashMap(int)>
	//   10   18:aload_2         
	//   11   19:invokespecial   #33  <Method void Tag(String, Map, Map, String)>
	//   12   22:return          
	}

	public Tag(String s, Map map)
	{
		this(s, map, ((Map) (new LinkedHashMap(0))), "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #25  <Class LinkedHashMap>
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:invokespecial   #28  <Method void LinkedHashMap(int)>
	//    7   11:ldc1            #30  <String "">
	//    8   13:invokespecial   #33  <Method void Tag(String, Map, Map, String)>
	//    9   16:return          
	}

	public Tag(String s, Map map, String s1)
	{
		this(s, map, ((Map) (new LinkedHashMap(0))), s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #25  <Class LinkedHashMap>
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:invokespecial   #28  <Method void LinkedHashMap(int)>
	//    7   11:aload_3         
	//    8   12:invokespecial   #33  <Method void Tag(String, Map, Map, String)>
	//    9   15:return          
	}

	public Tag(String s, Map map, Map map1, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		lastMarginBottom = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #45  <Field Object lastMarginBottom>
		tag = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #47  <Field String tag>
		attributes = map;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #49  <Field Map attributes>
		css = map1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #51  <Field Map css>
		children = ((List) (new LinkedList()));
	//   14   24:aload_0         
	//   15   25:new             #53  <Class LinkedList>
	//   16   28:dup             
	//   17   29:invokespecial   #54  <Method void LinkedList()>
	//   18   32:putfield        #56  <Field List children>
		if(s1 == null)
	//*  19   35:aload           4
	//*  20   37:ifnonnull       50
		{
			throw new NullPointerException("NS cannot be null");
	//   21   40:new             #58  <Class NullPointerException>
	//   22   43:dup             
	//   23   44:ldc1            #60  <String "NS cannot be null">
	//   24   46:invokespecial   #62  <Method void NullPointerException(String)>
	//   25   49:athrow          
		} else
		{
			ns = s1;
	//   26   50:aload_0         
	//   27   51:aload           4
	//   28   53:putfield        #64  <Field String ns>
			return;
	//   29   56:return          
		}
	}

	private Tag recursiveGetChild(Tag tag1, String s, String s1, boolean flag)
	{
		for(tag1 = ((Tag) (tag1.iterator())); ((Iterator) (tag1)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #71  <Method Iterator iterator()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            77
		{
			Tag tag2 = (Tag)((Iterator) (tag1)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #81  <Method Object Iterator.next()>
	//    8   20:checkcast       #2   <Class Tag>
	//    9   23:astore          5
			if(tag2.tag.equals(((Object) (s))) && tag2.ns.equals(((Object) (s1))))
	//*  10   25:aload           5
	//*  11   27:getfield        #47  <Field String tag>
	//*  12   30:aload_2         
	//*  13   31:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*  14   34:ifeq            52
	//*  15   37:aload           5
	//*  16   39:getfield        #64  <Field String ns>
	//*  17   42:aload_3         
	//*  18   43:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*  19   46:ifeq            52
				return tag2;
	//   20   49:aload           5
	//   21   51:areturn         
			if(flag)
	//*  22   52:iload           4
	//*  23   54:ifeq            5
			{
				tag2 = recursiveGetChild(tag2, s, s1, flag);
	//   24   57:aload_0         
	//   25   58:aload           5
	//   26   60:aload_2         
	//   27   61:aload_3         
	//   28   62:iload           4
	//   29   64:invokespecial   #89  <Method Tag recursiveGetChild(Tag, String, String, boolean)>
	//   30   67:astore          5
				if(tag2 != null)
	//*  31   69:aload           5
	//*  32   71:ifnull          5
					return tag2;
	//   33   74:aload           5
	//   34   76:areturn         
			}
		}

		return null;
	//   35   77:aconst_null     
	//   36   78:areturn         
	}

	private boolean recursiveHasChild(Tag tag1, String s, String s1, boolean flag)
	{
		for(tag1 = ((Tag) (tag1.iterator())); ((Iterator) (tag1)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #71  <Method Iterator iterator()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            71
		{
			Tag tag2 = (Tag)((Iterator) (tag1)).next();
	//    6   14:aload_1         
	//    7   15:invokeinterface #81  <Method Object Iterator.next()>
	//    8   20:checkcast       #2   <Class Tag>
	//    9   23:astore          5
			if(tag2.tag.equals(((Object) (s))) && tag2.ns.equals(((Object) (s1))))
	//*  10   25:aload           5
	//*  11   27:getfield        #47  <Field String tag>
	//*  12   30:aload_2         
	//*  13   31:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*  14   34:ifeq            51
	//*  15   37:aload           5
	//*  16   39:getfield        #64  <Field String ns>
	//*  17   42:aload_3         
	//*  18   43:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*  19   46:ifeq            51
				return true;
	//   20   49:iconst_1        
	//   21   50:ireturn         
			if(flag && recursiveHasChild(tag2, s, s1, flag))
	//*  22   51:iload           4
	//*  23   53:ifeq            5
	//*  24   56:aload_0         
	//*  25   57:aload           5
	//*  26   59:aload_2         
	//*  27   60:aload_3         
	//*  28   61:iload           4
	//*  29   63:invokespecial   #93  <Method boolean recursiveHasChild(Tag, String, String, boolean)>
	//*  30   66:ifeq            5
				return true;
	//   31   69:iconst_1        
	//   32   70:ireturn         
		}

		return false;
	//   33   71:iconst_0        
	//   34   72:ireturn         
	}

	public void addChild(Tag tag1)
	{
		tag1.setParent(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #98  <Method void setParent(Tag)>
		children.add(((Object) (tag1)));
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field List children>
	//    5    9:aload_1         
	//    6   10:invokeinterface #103 <Method boolean List.add(Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	public boolean compareTag(Tag tag1)
	{
		if(this != tag1) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpne       7
_L1:
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
_L2:
		if(tag1 == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(ns == null)
	//*   9   13:aload_0         
	//*  10   14:getfield        #64  <Field String ns>
	//*  11   17:ifnonnull       29
		{
			if(tag1.ns != null)
	//*  12   20:aload_1         
	//*  13   21:getfield        #64  <Field String ns>
	//*  14   24:ifnull          45
				return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		} else
		if(!ns.equals(((Object) (tag1.ns))))
	//*  17   29:aload_0         
	//*  18   30:getfield        #64  <Field String ns>
	//*  19   33:aload_1         
	//*  20   34:getfield        #64  <Field String ns>
	//*  21   37:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*  22   40:ifne            45
			return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
		if(tag != null)
			continue; /* Loop/switch isn't completed */
	//   25   45:aload_0         
	//   26   46:getfield        #47  <Field String tag>
	//   27   49:ifnonnull       61
		if(tag1.tag == null) goto _L1; else goto _L3
	//   28   52:aload_1         
	//   29   53:getfield        #47  <Field String tag>
	//   30   56:ifnull          5
_L3:
		return false;
	//   31   59:iconst_0        
	//   32   60:ireturn         
		if(tag.equals(((Object) (tag1.tag)))) goto _L1; else goto _L4
	//   33   61:aload_0         
	//   34   62:getfield        #47  <Field String tag>
	//   35   65:aload_1         
	//   36   66:getfield        #47  <Field String tag>
	//   37   69:invokevirtual   #87  <Method boolean String.equals(Object)>
	//   38   72:ifne            5
_L4:
		return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
	}

	public Map getAttributes()
	{
		return attributes;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Map attributes>
	//    2    4:areturn         
	}

	public Map getCSS()
	{
		return css;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Map css>
	//    2    4:areturn         
	}

	public Tag getChild(String s, String s1)
	{
		return getChild(s, s1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #114 <Method Tag getChild(String, String, boolean)>
	//    5    7:areturn         
	}

	public Tag getChild(String s, String s1, boolean flag)
	{
		return recursiveGetChild(this, s, s1, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:iload_3         
	//    5    5:invokespecial   #89  <Method Tag recursiveGetChild(Tag, String, String, boolean)>
	//    6    8:areturn         
	}

	public List getChildren()
	{
		return children;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List children>
	//    2    4:areturn         
	}

	public List getChildren(String s)
	{
		LinkedList linkedlist = new LinkedList();
	//    0    0:new             #53  <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void LinkedList()>
	//    3    7:astore_2        
		Iterator iterator1 = children.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field List children>
	//    6   12:invokeinterface #119 <Method Iterator List.iterator()>
	//    7   17:astore_3        
		do
		{
			if(!iterator1.hasNext())
				break;
	//    8   18:aload_3         
	//    9   19:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            62
			Tag tag1 = (Tag)iterator1.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #81  <Method Object Iterator.next()>
	//   13   33:checkcast       #2   <Class Tag>
	//   14   36:astore          4
			if(tag1.getName().equals(((Object) (s))))
	//*  15   38:aload           4
	//*  16   40:invokevirtual   #123 <Method String getName()>
	//*  17   43:aload_1         
	//*  18   44:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*  19   47:ifeq            18
				((List) (linkedlist)).add(((Object) (tag1)));
	//   20   50:aload_2         
	//   21   51:aload           4
	//   22   53:invokeinterface #103 <Method boolean List.add(Object)>
	//   23   58:pop             
		} while(true);
	//   24   59:goto            18
		return ((List) (linkedlist));
	//   25   62:aload_2         
	//   26   63:areturn         
	}

	public Object getLastMarginBottom()
	{
		return lastMarginBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object lastMarginBottom>
	//    2    4:areturn         
	}

	public String getName()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String tag>
	//    2    4:areturn         
	}

	public String getNameSpace()
	{
		return ns;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String ns>
	//    2    4:areturn         
	}

	public Tag getParent()
	{
		return parent;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field Tag parent>
	//    2    4:areturn         
	}

	public String getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String tag>
	//    2    4:areturn         
	}

	public boolean hasChild(String s, String s1)
	{
		return hasChild(s, s1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #138 <Method boolean hasChild(String, String, boolean)>
	//    5    7:ireturn         
	}

	public boolean hasChild(String s, String s1, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            13
			return recursiveHasChild(this, s, s1, true);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iconst_1        
	//    7    9:invokespecial   #93  <Method boolean recursiveHasChild(Tag, String, String, boolean)>
	//    8   12:ireturn         
		else
			return recursiveHasChild(this, s, s1, false);
	//    9   13:aload_0         
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:aload_2         
	//   13   17:iconst_0        
	//   14   18:invokespecial   #93  <Method boolean recursiveHasChild(Tag, String, String, boolean)>
	//   15   21:ireturn         
	}

	public boolean hasChildren()
	{
		return getChildren().size() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method List getChildren()>
	//    2    4:invokeinterface #145 <Method int List.size()>
	//    3    9:ifeq            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public boolean hasParent()
	{
		return getParent() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #148 <Method Tag getParent()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public Iterator iterator()
	{
		return children.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field List children>
	//    2    4:invokeinterface #119 <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	public void setCSS(Map map)
	{
		if(map != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			css = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field Map css>
			return;
	//    5    9:return          
		} else
		{
			css.clear();
	//    6   10:aload_0         
	//    7   11:getfield        #51  <Field Map css>
	//    8   14:invokeinterface #156 <Method void Map.clear()>
			return;
	//    9   19:return          
		}
	}

	public void setLastMarginBottom(Object obj)
	{
		lastMarginBottom = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field Object lastMarginBottom>
	//    3    5:return          
	}

	public void setParent(Tag tag1)
	{
		parent = tag1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field Tag parent>
	//    3    5:return          
	}

	public String toString()
	{
		if("".equalsIgnoreCase(ns))
	//*   0    0:ldc1            #30  <String "">
	//*   1    2:aload_0         
	//*   2    3:getfield        #64  <Field String ns>
	//*   3    6:invokevirtual   #164 <Method boolean String.equalsIgnoreCase(String)>
	//*   4    9:ifeq            29
			return String.format("%s", new Object[] {
				tag
			});
	//    5   12:ldc1            #166 <String "%s">
	//    6   14:iconst_1        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field String tag>
	//   12   24:aastore         
	//   13   25:invokestatic    #170 <Method String String.format(String, Object[])>
	//   14   28:areturn         
		else
			return String.format("%s:%s", new Object[] {
				ns, tag
			});
	//   15   29:ldc1            #172 <String "%s:%s">
	//   16   31:iconst_2        
	//   17   32:anewarray       Object[]
	//   18   35:dup             
	//   19   36:iconst_0        
	//   20   37:aload_0         
	//   21   38:getfield        #64  <Field String ns>
	//   22   41:aastore         
	//   23   42:dup             
	//   24   43:iconst_1        
	//   25   44:aload_0         
	//   26   45:getfield        #47  <Field String tag>
	//   27   48:aastore         
	//   28   49:invokestatic    #170 <Method String String.format(String, Object[])>
	//   29   52:areturn         
	}

	private final Map attributes;
	private final List children;
	private Map css;
	private Object lastMarginBottom;
	private final String ns;
	private Tag parent;
	private final String tag;
}
