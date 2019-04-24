// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.testutils;

import com.itextpdf.text.pdf.RefKey;
import java.util.Iterator;
import java.util.Stack;
import org.w3c.dom.*;

// Referenced classes of package com.itextpdf.testutils:
//			CompareTool

private class CompareTool$ObjectPath
{
	private class ArrayPathItem extends PathItem
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof ArrayPathItem) && index == ((ArrayPathItem)obj).index;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$ArrayPathItem>
		//    2    4:ifeq            23
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field int index>
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$ArrayPathItem>
		//    7   15:getfield        #23  <Field int index>
		//    8   18:icmpne          23
		//    9   21:iconst_1        
		//   10   22:ireturn         
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		public int hashCode()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int index>
		//    2    4:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append("Array index: ").append(String.valueOf(index)).toString();
		//    0    0:new             #32  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void StringBuilder()>
		//    3    7:ldc1            #37  <String "Array index: ">
		//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #23  <Field int index>
		//    7   16:invokestatic    #47  <Method String String.valueOf(int)>
		//    8   19:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   10   25:areturn         
		}

		protected Node toXmlNode(Document document)
		{
			Element element = document.createElement("arrayIndex");
		//    0    0:aload_1         
		//    1    1:ldc1            #53  <String "arrayIndex">
		//    2    3:invokeinterface #59  <Method Element Document.createElement(String)>
		//    3    8:astore_2        
			((Node) (element)).appendChild(((Node) (document.createTextNode(String.valueOf(index)))));
		//    4    9:aload_2         
		//    5   10:aload_1         
		//    6   11:aload_0         
		//    7   12:getfield        #23  <Field int index>
		//    8   15:invokestatic    #47  <Method String String.valueOf(int)>
		//    9   18:invokeinterface #63  <Method org.w3c.dom.Text Document.createTextNode(String)>
		//   10   23:invokeinterface #69  <Method Node Node.appendChild(Node)>
		//   11   28:pop             
			return ((Node) (element));
		//   12   29:aload_2         
		//   13   30:areturn         
		}

		int index;
		final CompareTool.ObjectPath this$1;

		public ArrayPathItem(int i)
		{
			this$1 = CompareTool.ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CompareTool$ObjectPath this$1>
			super(((CompareTool._cls1) (null)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #21  <Method void CompareTool$ObjectPath$PathItem(CompareTool$ObjectPath, CompareTool$1)>
			index = i;
		//    7   11:aload_0         
		//    8   12:iload_2         
		//    9   13:putfield        #23  <Field int index>
		//   10   16:return          
		}
	}

	private class DictPathItem extends PathItem
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof DictPathItem) && key.equals(((Object) (((DictPathItem)obj).key)));
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$DictPathItem>
		//    2    4:ifeq            26
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field String key>
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$DictPathItem>
		//    7   15:getfield        #23  <Field String key>
		//    8   18:invokevirtual   #30  <Method boolean String.equals(Object)>
		//    9   21:ifeq            26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		public int hashCode()
		{
			return key.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String key>
		//    2    4:invokevirtual   #34  <Method int String.hashCode()>
		//    3    7:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append("Dict key: ").append(key).toString();
		//    0    0:new             #38  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #41  <Method void StringBuilder()>
		//    3    7:ldc1            #43  <String "Dict key: ">
		//    4    9:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #23  <Field String key>
		//    7   16:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    8   19:invokevirtual   #49  <Method String StringBuilder.toString()>
		//    9   22:areturn         
		}

		protected Node toXmlNode(Document document)
		{
			Element element = document.createElement("dictKey");
		//    0    0:aload_1         
		//    1    1:ldc1            #53  <String "dictKey">
		//    2    3:invokeinterface #59  <Method Element Document.createElement(String)>
		//    3    8:astore_2        
			((Node) (element)).appendChild(((Node) (document.createTextNode(key))));
		//    4    9:aload_2         
		//    5   10:aload_1         
		//    6   11:aload_0         
		//    7   12:getfield        #23  <Field String key>
		//    8   15:invokeinterface #63  <Method org.w3c.dom.Text Document.createTextNode(String)>
		//    9   20:invokeinterface #69  <Method Node Node.appendChild(Node)>
		//   10   25:pop             
			return ((Node) (element));
		//   11   26:aload_2         
		//   12   27:areturn         
		}

		String key;
		final CompareTool.ObjectPath this$1;

		public DictPathItem(String s)
		{
			this$1 = CompareTool.ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CompareTool$ObjectPath this$1>
			super(((CompareTool._cls1) (null)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #21  <Method void CompareTool$ObjectPath$PathItem(CompareTool$ObjectPath, CompareTool$1)>
			key = s;
		//    7   11:aload_0         
		//    8   12:aload_2         
		//    9   13:putfield        #23  <Field String key>
		//   10   16:return          
		}
	}

	private class OffsetPathItem extends PathItem
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof OffsetPathItem) && offset == ((OffsetPathItem)obj).offset;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$OffsetPathItem>
		//    2    4:ifeq            23
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field int offset>
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$OffsetPathItem>
		//    7   15:getfield        #23  <Field int offset>
		//    8   18:icmpne          23
		//    9   21:iconst_1        
		//   10   22:ireturn         
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		public int hashCode()
		{
			return offset;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int offset>
		//    2    4:ireturn         
		}

		public String toString()
		{
			return (new StringBuilder()).append("Offset: ").append(String.valueOf(offset)).toString();
		//    0    0:new             #32  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void StringBuilder()>
		//    3    7:ldc1            #37  <String "Offset: ">
		//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:getfield        #23  <Field int offset>
		//    7   16:invokestatic    #47  <Method String String.valueOf(int)>
		//    8   19:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   10   25:areturn         
		}

		protected Node toXmlNode(Document document)
		{
			Element element = document.createElement("offset");
		//    0    0:aload_1         
		//    1    1:ldc1            #52  <String "offset">
		//    2    3:invokeinterface #58  <Method Element Document.createElement(String)>
		//    3    8:astore_2        
			((Node) (element)).appendChild(((Node) (document.createTextNode(String.valueOf(offset)))));
		//    4    9:aload_2         
		//    5   10:aload_1         
		//    6   11:aload_0         
		//    7   12:getfield        #23  <Field int offset>
		//    8   15:invokestatic    #47  <Method String String.valueOf(int)>
		//    9   18:invokeinterface #62  <Method org.w3c.dom.Text Document.createTextNode(String)>
		//   10   23:invokeinterface #68  <Method Node Node.appendChild(Node)>
		//   11   28:pop             
			return ((Node) (element));
		//   12   29:aload_2         
		//   13   30:areturn         
		}

		int offset;
		final CompareTool.ObjectPath this$1;

		public OffsetPathItem(int i)
		{
			this$1 = CompareTool.ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field CompareTool$ObjectPath this$1>
			super(((CompareTool._cls1) (null)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:invokespecial   #21  <Method void CompareTool$ObjectPath$PathItem(CompareTool$ObjectPath, CompareTool$1)>
			offset = i;
		//    7   11:aload_0         
		//    8   12:iload_2         
		//    9   13:putfield        #23  <Field int offset>
		//   10   16:return          
		}
	}

	private class Pair
	{

		public boolean equals(Object obj)
		{
			return (obj instanceof Pair) && first.equals(((Pair)obj).first) && second.equals(((Pair)obj).second);
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class CompareTool$ObjectPath$Pair>
		//    2    4:ifeq            43
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field Object first>
		//    5   11:aload_1         
		//    6   12:checkcast       #2   <Class CompareTool$ObjectPath$Pair>
		//    7   15:getfield        #26  <Field Object first>
		//    8   18:invokevirtual   #35  <Method boolean Object.equals(Object)>
		//    9   21:ifeq            43
		//   10   24:aload_0         
		//   11   25:getfield        #28  <Field Object second>
		//   12   28:aload_1         
		//   13   29:checkcast       #2   <Class CompareTool$ObjectPath$Pair>
		//   14   32:getfield        #28  <Field Object second>
		//   15   35:invokevirtual   #35  <Method boolean Object.equals(Object)>
		//   16   38:ifeq            43
		//   17   41:iconst_1        
		//   18   42:ireturn         
		//   19   43:iconst_0        
		//   20   44:ireturn         
		}

		public int hashCode()
		{
			return first.hashCode() * 31 + second.hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Object first>
		//    2    4:invokevirtual   #39  <Method int Object.hashCode()>
		//    3    7:bipush          31
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #28  <Field Object second>
		//    7   14:invokevirtual   #39  <Method int Object.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		private Object first;
		private Object second;
		final CompareTool.ObjectPath this$1;

		public Pair(Object obj, Object obj1)
		{
			this$1 = CompareTool.ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field CompareTool$ObjectPath this$1>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			first = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field Object first>
			second = obj1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #28  <Field Object second>
		//   11   19:return          
		}
	}

	private abstract class PathItem
	{

		protected abstract Node toXmlNode(Document document);

		final CompareTool.ObjectPath this$1;

		private PathItem()
		{
			this$1 = CompareTool.ObjectPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field CompareTool$ObjectPath this$1>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

		PathItem(CompareTool._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void CompareTool$ObjectPath$PathItem(CompareTool$ObjectPath)>
		//    3    5:return          
		}
	}


	protected Object clone()
	{
		return ((Object) (new CompareTool$ObjectPath(baseCmpObject, baseOutObject, (Stack)path.clone())));
	//    0    0:new             #2   <Class CompareTool$ObjectPath>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field CompareTool this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field RefKey baseCmpObject>
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field RefKey baseOutObject>
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field Stack path>
	//   10   20:invokevirtual   #59  <Method Object Stack.clone()>
	//   11   23:checkcast       #41  <Class Stack>
	//   12   26:invokespecial   #61  <Method void CompareTool$ObjectPath(CompareTool, RefKey, RefKey, Stack)>
	//   13   29:areturn         
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof CompareTool$ObjectPath) && baseCmpObject.equals(((Object) (((CompareTool$ObjectPath)obj).baseCmpObject))) && baseOutObject.equals(((Object) (((CompareTool$ObjectPath)obj).baseOutObject))) && path.equals(((Object) (((CompareTool$ObjectPath)obj).path)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class CompareTool$ObjectPath>
	//    2    4:ifeq            60
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field RefKey baseCmpObject>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class CompareTool$ObjectPath>
	//    7   15:getfield        #50  <Field RefKey baseCmpObject>
	//    8   18:invokevirtual   #67  <Method boolean RefKey.equals(Object)>
	//    9   21:ifeq            60
	//   10   24:aload_0         
	//   11   25:getfield        #52  <Field RefKey baseOutObject>
	//   12   28:aload_1         
	//   13   29:checkcast       #2   <Class CompareTool$ObjectPath>
	//   14   32:getfield        #52  <Field RefKey baseOutObject>
	//   15   35:invokevirtual   #67  <Method boolean RefKey.equals(Object)>
	//   16   38:ifeq            60
	//   17   41:aload_0         
	//   18   42:getfield        #44  <Field Stack path>
	//   19   45:aload_1         
	//   20   46:checkcast       #2   <Class CompareTool$ObjectPath>
	//   21   49:getfield        #44  <Field Stack path>
	//   22   52:invokevirtual   #68  <Method boolean Stack.equals(Object)>
	//   23   55:ifeq            60
	//   24   58:iconst_1        
	//   25   59:ireturn         
	//   26   60:iconst_0        
	//   27   61:ireturn         
	}

	public int hashCode()
	{
		int i;
		int j;
		if(baseCmpObject != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field RefKey baseCmpObject>
	//*   2    4:ifnull          75
			i = baseCmpObject.hashCode();
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field RefKey baseCmpObject>
	//    5   11:invokevirtual   #72  <Method int RefKey.hashCode()>
	//    6   14:istore_1        
		else
	//*   7   15:aload_0         
	//*   8   16:getfield        #52  <Field RefKey baseOutObject>
	//*   9   19:ifnull          80
	//*  10   22:aload_0         
	//*  11   23:getfield        #52  <Field RefKey baseOutObject>
	//*  12   26:invokevirtual   #72  <Method int RefKey.hashCode()>
	//*  13   29:istore_2        
	//*  14   30:iload_1         
	//*  15   31:bipush          31
	//*  16   33:imul            
	//*  17   34:iload_2         
	//*  18   35:iadd            
	//*  19   36:istore_1        
	//*  20   37:aload_0         
	//*  21   38:getfield        #44  <Field Stack path>
	//*  22   41:invokevirtual   #76  <Method Iterator Stack.iterator()>
	//*  23   44:astore_3        
	//*  24   45:aload_3         
	//*  25   46:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//*  26   51:ifeq            85
	//*  27   54:iload_1         
	//*  28   55:bipush          31
	//*  29   57:imul            
	//*  30   58:aload_3         
	//*  31   59:invokeinterface #85  <Method Object Iterator.next()>
	//*  32   64:checkcast       #21  <Class CompareTool$ObjectPath$PathItem>
	//*  33   67:invokevirtual   #86  <Method int Object.hashCode()>
	//*  34   70:iadd            
	//*  35   71:istore_1        
	//*  36   72:goto            45
			i = 1;
	//   37   75:iconst_1        
	//   38   76:istore_1        
		if(baseOutObject != null)
			j = baseOutObject.hashCode();
		else
	//*  39   77:goto            15
			j = 1;
	//   40   80:iconst_1        
	//   41   81:istore_2        
		i = i * 31 + j;
		for(Iterator iterator = path.iterator(); iterator.hasNext();)
			i = i * 31 + ((Object) ((PathItem)iterator.next())).hashCode();

	//*  42   82:goto            30
		return i;
	//   43   85:iload_1         
	//   44   86:ireturn         
	}

	public boolean isComparing(RefKey refkey, RefKey refkey1)
	{
		return indirects.contains(((Object) (new Pair(((Object) (refkey)), ((Object) (refkey1))))));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Stack indirects>
	//    2    4:new             #18  <Class CompareTool$ObjectPath$Pair>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #91  <Method void CompareTool$ObjectPath$Pair(CompareTool$ObjectPath, Object, Object)>
	//    8   14:invokevirtual   #94  <Method boolean Stack.contains(Object)>
	//    9   17:ireturn         
	}

	public void pop()
	{
		path.pop();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Stack path>
	//    2    4:invokevirtual   #97  <Method Object Stack.pop()>
	//    3    7:pop             
	//    4    8:return          
	}

	public void pushArrayItemToPath(int i)
	{
		path.add(((Object) (new ArrayPathItem(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Stack path>
	//    2    4:new             #9   <Class CompareTool$ObjectPath$ArrayPathItem>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #102 <Method void CompareTool$ObjectPath$ArrayPathItem(CompareTool$ObjectPath, int)>
	//    7   13:invokevirtual   #105 <Method boolean Stack.add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void pushDictItemToPath(String s)
	{
		path.add(((Object) (new DictPathItem(s))));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Stack path>
	//    2    4:new             #12  <Class CompareTool$ObjectPath$DictPathItem>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #110 <Method void CompareTool$ObjectPath$DictPathItem(CompareTool$ObjectPath, String)>
	//    7   13:invokevirtual   #105 <Method boolean Stack.add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void pushOffsetToPath(int i)
	{
		path.add(((Object) (new OffsetPathItem(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Stack path>
	//    2    4:new             #15  <Class CompareTool$ObjectPath$OffsetPathItem>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #112 <Method void CompareTool$ObjectPath$OffsetPathItem(CompareTool$ObjectPath, int)>
	//    7   13:invokevirtual   #105 <Method boolean Stack.add(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public CompareTool$ObjectPath resetDirectPath(RefKey refkey, RefKey refkey1)
	{
		CompareTool$ObjectPath comparetool$objectpath = new CompareTool$ObjectPath(refkey, refkey1);
	//    0    0:new             #2   <Class CompareTool$ObjectPath>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field CompareTool this$0>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #116 <Method void CompareTool$ObjectPath(CompareTool, RefKey, RefKey)>
	//    7   13:astore_3        
		comparetool$objectpath.indirects = (Stack)indirects.clone();
	//    8   14:aload_3         
	//    9   15:aload_0         
	//   10   16:getfield        #46  <Field Stack indirects>
	//   11   19:invokevirtual   #59  <Method Object Stack.clone()>
	//   12   22:checkcast       #41  <Class Stack>
	//   13   25:putfield        #46  <Field Stack indirects>
		comparetool$objectpath.indirects.add(((Object) (new Pair(((Object) (refkey)), ((Object) (refkey1))))));
	//   14   28:aload_3         
	//   15   29:getfield        #46  <Field Stack indirects>
	//   16   32:new             #18  <Class CompareTool$ObjectPath$Pair>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokespecial   #91  <Method void CompareTool$ObjectPath$Pair(CompareTool$ObjectPath, Object, Object)>
	//   22   42:invokevirtual   #105 <Method boolean Stack.add(Object)>
	//   23   45:pop             
		return comparetool$objectpath;
	//   24   46:aload_3         
	//   25   47:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #120 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(String.format("Base cmp object: %s obj. Base out object: %s obj", new Object[] {
			baseCmpObject, baseOutObject
		}));
	//    4    8:aload_1         
	//    5    9:ldc1            #123 <String "Base cmp object: %s obj. Base out object: %s obj">
	//    6   11:iconst_2        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:aload_0         
	//   11   18:getfield        #50  <Field RefKey baseCmpObject>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_1        
	//   15   24:aload_0         
	//   16   25:getfield        #52  <Field RefKey baseOutObject>
	//   17   28:aastore         
	//   18   29:invokestatic    #129 <Method String String.format(String, Object[])>
	//   19   32:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   20   35:pop             
		PathItem pathitem;
		for(Iterator iterator = path.iterator(); iterator.hasNext(); stringbuilder.append(((Object) (pathitem)).toString()))
	//*  21   36:aload_0         
	//*  22   37:getfield        #44  <Field Stack path>
	//*  23   40:invokevirtual   #76  <Method Iterator Stack.iterator()>
	//*  24   43:astore_2        
	//*  25   44:aload_2         
	//*  26   45:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//*  27   50:ifeq            82
		{
			pathitem = (PathItem)iterator.next();
	//   28   53:aload_2         
	//   29   54:invokeinterface #85  <Method Object Iterator.next()>
	//   30   59:checkcast       #21  <Class CompareTool$ObjectPath$PathItem>
	//   31   62:astore_3        
			stringbuilder.append("\n");
	//   32   63:aload_1         
	//   33   64:ldc1            #135 <String "\n">
	//   34   66:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		}

	//   36   70:aload_1         
	//   37   71:aload_3         
	//   38   72:invokevirtual   #137 <Method String Object.toString()>
	//   39   75:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   40   78:pop             
	//*  41   79:goto            44
		return stringbuilder.toString();
	//   42   82:aload_1         
	//   43   83:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   44   86:areturn         
	}

	public Node toXmlNode(Document document)
	{
		Element element = document.createElement("path");
	//    0    0:aload_1         
	//    1    1:ldc1            #141 <String "path">
	//    2    3:invokeinterface #147 <Method Element Document.createElement(String)>
	//    3    8:astore_2        
		Element element1 = document.createElement("base");
	//    4    9:aload_1         
	//    5   10:ldc1            #149 <String "base">
	//    6   12:invokeinterface #147 <Method Element Document.createElement(String)>
	//    7   17:astore_3        
		element1.setAttribute("cmp", (new StringBuilder()).append(baseCmpObject.toString()).append(" obj").toString());
	//    8   18:aload_3         
	//    9   19:ldc1            #151 <String "cmp">
	//   10   21:new             #120 <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #121 <Method void StringBuilder()>
	//   13   28:aload_0         
	//   14   29:getfield        #50  <Field RefKey baseCmpObject>
	//   15   32:invokevirtual   #152 <Method String RefKey.toString()>
	//   16   35:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:ldc1            #154 <String " obj">
	//   18   40:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   20   46:invokeinterface #160 <Method void Element.setAttribute(String, String)>
		element1.setAttribute("out", (new StringBuilder()).append(baseOutObject.toString()).append(" obj").toString());
	//   21   51:aload_3         
	//   22   52:ldc1            #162 <String "out">
	//   23   54:new             #120 <Class StringBuilder>
	//   24   57:dup             
	//   25   58:invokespecial   #121 <Method void StringBuilder()>
	//   26   61:aload_0         
	//   27   62:getfield        #52  <Field RefKey baseOutObject>
	//   28   65:invokevirtual   #152 <Method String RefKey.toString()>
	//   29   68:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   30   71:ldc1            #154 <String " obj">
	//   31   73:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   32   76:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   33   79:invokeinterface #160 <Method void Element.setAttribute(String, String)>
		element.appendChild(((Node) (element1)));
	//   34   84:aload_2         
	//   35   85:aload_3         
	//   36   86:invokeinterface #166 <Method Node Element.appendChild(Node)>
	//   37   91:pop             
		for(Iterator iterator = path.iterator(); iterator.hasNext(); element.appendChild(((PathItem)iterator.next()).toXmlNode(document)));
	//   38   92:aload_0         
	//   39   93:getfield        #44  <Field Stack path>
	//   40   96:invokevirtual   #76  <Method Iterator Stack.iterator()>
	//   41   99:astore_3        
	//   42  100:aload_3         
	//   43  101:invokeinterface #82  <Method boolean Iterator.hasNext()>
	//   44  106:ifeq            132
	//   45  109:aload_2         
	//   46  110:aload_3         
	//   47  111:invokeinterface #85  <Method Object Iterator.next()>
	//   48  116:checkcast       #21  <Class CompareTool$ObjectPath$PathItem>
	//   49  119:aload_1         
	//   50  120:invokevirtual   #168 <Method Node CompareTool$ObjectPath$PathItem.toXmlNode(Document)>
	//   51  123:invokeinterface #166 <Method Node Element.appendChild(Node)>
	//   52  128:pop             
	//*  53  129:goto            100
		return ((Node) (element));
	//   54  132:aload_2         
	//   55  133:areturn         
	}

	protected RefKey baseCmpObject;
	protected RefKey baseOutObject;
	protected Stack indirects;
	protected Stack path;
	final CompareTool this$0;

	public CompareTool$ObjectPath()
	{
		this$0 = CompareTool.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field CompareTool this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #39  <Method void Object()>
		path = new Stack();
	//    5    9:aload_0         
	//    6   10:new             #41  <Class Stack>
	//    7   13:dup             
	//    8   14:invokespecial   #42  <Method void Stack()>
	//    9   17:putfield        #44  <Field Stack path>
		indirects = new Stack();
	//   10   20:aload_0         
	//   11   21:new             #41  <Class Stack>
	//   12   24:dup             
	//   13   25:invokespecial   #42  <Method void Stack()>
	//   14   28:putfield        #46  <Field Stack indirects>
	//   15   31:return          
	}

	protected CompareTool$ObjectPath(RefKey refkey, RefKey refkey1)
	{
		this$0 = CompareTool.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field CompareTool this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #39  <Method void Object()>
		path = new Stack();
	//    5    9:aload_0         
	//    6   10:new             #41  <Class Stack>
	//    7   13:dup             
	//    8   14:invokespecial   #42  <Method void Stack()>
	//    9   17:putfield        #44  <Field Stack path>
		indirects = new Stack();
	//   10   20:aload_0         
	//   11   21:new             #41  <Class Stack>
	//   12   24:dup             
	//   13   25:invokespecial   #42  <Method void Stack()>
	//   14   28:putfield        #46  <Field Stack indirects>
		baseCmpObject = refkey;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #50  <Field RefKey baseCmpObject>
		baseOutObject = refkey1;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #52  <Field RefKey baseOutObject>
	//   21   41:return          
	}

	private CompareTool$ObjectPath(RefKey refkey, RefKey refkey1, Stack stack)
	{
		this$0 = CompareTool.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field CompareTool this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #39  <Method void Object()>
		path = new Stack();
	//    5    9:aload_0         
	//    6   10:new             #41  <Class Stack>
	//    7   13:dup             
	//    8   14:invokespecial   #42  <Method void Stack()>
	//    9   17:putfield        #44  <Field Stack path>
		indirects = new Stack();
	//   10   20:aload_0         
	//   11   21:new             #41  <Class Stack>
	//   12   24:dup             
	//   13   25:invokespecial   #42  <Method void Stack()>
	//   14   28:putfield        #46  <Field Stack indirects>
		baseCmpObject = refkey;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #50  <Field RefKey baseCmpObject>
		baseOutObject = refkey1;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #52  <Field RefKey baseOutObject>
		path = stack;
	//   21   41:aload_0         
	//   22   42:aload           4
	//   23   44:putfield        #44  <Field Stack path>
	//   24   47:return          
	}
}
