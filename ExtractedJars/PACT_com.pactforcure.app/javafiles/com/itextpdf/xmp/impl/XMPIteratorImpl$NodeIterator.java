// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPMetaFactory;
import com.itextpdf.xmp.XMPSchemaRegistry;
import com.itextpdf.xmp.options.IteratorOptions;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.properties.XMPPropertyInfo;
import java.util.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPIteratorImpl, XMPNode, QName

private class XMPIteratorImpl$NodeIterator
	implements Iterator
{

	private boolean iterateChildren(Iterator iterator)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(skipSiblings)
	//*   2    2:aload_0         
	//*   3    3:getfield        #35  <Field XMPIteratorImpl this$0>
	//*   4    6:getfield        #96  <Field boolean XMPIteratorImpl.skipSiblings>
	//*   5    9:ifeq            32
		{
			skipSiblings = false;
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field XMPIteratorImpl this$0>
	//    8   16:iconst_0        
	//    9   17:putfield        #96  <Field boolean XMPIteratorImpl.skipSiblings>
			subIterator = Collections.EMPTY_LIST.iterator();
	//   10   20:aload_0         
	//   11   21:getstatic       #50  <Field List Collections.EMPTY_LIST>
	//   12   24:invokeinterface #56  <Method Iterator List.iterator()>
	//   13   29:putfield        #58  <Field Iterator subIterator>
		}
		if(!subIterator.hasNext() && iterator.hasNext())
	//*  14   32:aload_0         
	//*  15   33:getfield        #58  <Field Iterator subIterator>
	//*  16   36:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//*  17   41:ifne            97
	//*  18   44:aload_1         
	//*  19   45:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//*  20   50:ifeq            97
		{
			iterator = ((Iterator) ((XMPNode)iterator.next()));
	//   21   53:aload_1         
	//   22   54:invokeinterface #103 <Method Object Iterator.next()>
	//   23   59:checkcast       #66  <Class XMPNode>
	//   24   62:astore_1        
			index = index + 1;
	//   25   63:aload_0         
	//   26   64:aload_0         
	//   27   65:getfield        #44  <Field int index>
	//   28   68:iconst_1        
	//   29   69:iadd            
	//   30   70:putfield        #44  <Field int index>
			subIterator = ((Iterator) (new XMPIteratorImpl$NodeIterator(((XMPNode) (iterator)), path, index)));
	//   31   73:aload_0         
	//   32   74:new             #2   <Class XMPIteratorImpl$NodeIterator>
	//   33   77:dup             
	//   34   78:aload_0         
	//   35   79:getfield        #35  <Field XMPIteratorImpl this$0>
	//   36   82:aload_1         
	//   37   83:aload_0         
	//   38   84:getfield        #90  <Field String path>
	//   39   87:aload_0         
	//   40   88:getfield        #44  <Field int index>
	//   41   91:invokespecial   #105 <Method void XMPIteratorImpl$NodeIterator(XMPIteratorImpl, XMPNode, String, int)>
	//   42   94:putfield        #58  <Field Iterator subIterator>
		}
		if(subIterator.hasNext())
	//*  43   97:aload_0         
	//*  44   98:getfield        #58  <Field Iterator subIterator>
	//*  45  101:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//*  46  106:ifeq            127
		{
			returnProperty = (XMPPropertyInfo)subIterator.next();
	//   47  109:aload_0         
	//   48  110:aload_0         
	//   49  111:getfield        #58  <Field Iterator subIterator>
	//   50  114:invokeinterface #103 <Method Object Iterator.next()>
	//   51  119:checkcast       #107 <Class XMPPropertyInfo>
	//   52  122:putfield        #60  <Field XMPPropertyInfo returnProperty>
			flag = true;
	//   53  125:iconst_1        
	//   54  126:istore_2        
		}
		return flag;
	//   55  127:iload_2         
	//   56  128:ireturn         
	}

	protected String accumulatePath(XMPNode xmpnode, String s, int i)
	{
		Object obj;
		if(xmpnode.getParent() == null || xmpnode.getOptions().isSchemaNode())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #111 <Method XMPNode XMPNode.getParent()>
	//*   2    4:ifnull          17
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #70  <Method PropertyOptions XMPNode.getOptions()>
	//*   5   11:invokevirtual   #76  <Method boolean PropertyOptions.isSchemaNode()>
	//*   6   14:ifeq            23
		{
			obj = null;
	//    7   17:aconst_null     
	//    8   18:astore          5
		} else
	//*   9   20:aload           5
	//*  10   22:areturn         
		{
			String s1;
			if(xmpnode.getParent().getOptions().isArray())
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #111 <Method XMPNode XMPNode.getParent()>
	//*  13   27:invokevirtual   #70  <Method PropertyOptions XMPNode.getOptions()>
	//*  14   30:invokevirtual   #114 <Method boolean PropertyOptions.isArray()>
	//*  15   33:ifeq            116
			{
				s1 = "";
	//   16   36:ldc1            #116 <String "">
	//   17   38:astore          4
				xmpnode = ((XMPNode) ((new StringBuilder()).append("[").append(String.valueOf(i)).append("]").toString()));
	//   18   40:new             #118 <Class StringBuilder>
	//   19   43:dup             
	//   20   44:invokespecial   #119 <Method void StringBuilder()>
	//   21   47:ldc1            #121 <String "[">
	//   22   49:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:iload_3         
	//   24   53:invokestatic    #131 <Method String String.valueOf(int)>
	//   25   56:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   26   59:ldc1            #133 <String "]">
	//   27   61:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   28   64:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   29   67:astore_1        
			} else
	//*  30   68:aload_1         
	//*  31   69:astore          5
	//*  32   71:aload_2         
	//*  33   72:ifnull          20
	//*  34   75:aload_1         
	//*  35   76:astore          5
	//*  36   78:aload_2         
	//*  37   79:invokevirtual   #140 <Method int String.length()>
	//*  38   82:ifeq            20
	//*  39   85:aload_0         
	//*  40   86:getfield        #35  <Field XMPIteratorImpl this$0>
	//*  41   89:invokevirtual   #143 <Method IteratorOptions XMPIteratorImpl.getOptions()>
	//*  42   92:invokevirtual   #148 <Method boolean IteratorOptions.isJustLeafname()>
	//*  43   95:ifeq            128
	//*  44   98:aload_1         
	//*  45   99:astore          5
	//*  46  101:aload_1         
	//*  47  102:ldc1            #150 <String "?">
	//*  48  104:invokevirtual   #154 <Method boolean String.startsWith(String)>
	//*  49  107:ifeq            20
	//*  50  110:aload_1         
	//*  51  111:iconst_1        
	//*  52  112:invokevirtual   #157 <Method String String.substring(int)>
	//*  53  115:areturn         
			{
				s1 = "/";
	//   54  116:ldc1            #159 <String "/">
	//   55  118:astore          4
				xmpnode = ((XMPNode) (xmpnode.getName()));
	//   56  120:aload_1         
	//   57  121:invokevirtual   #80  <Method String XMPNode.getName()>
	//   58  124:astore_1        
			}
			obj = ((Object) (xmpnode));
			if(s != null)
			{
				obj = ((Object) (xmpnode));
				if(s.length() != 0)
					if(getOptions().isJustLeafname())
					{
						obj = ((Object) (xmpnode));
						if(((String) (xmpnode)).startsWith("?"))
							return ((String) (xmpnode)).substring(1);
					} else
	//*  59  125:goto            68
					{
						return (new StringBuilder()).append(s).append(s1).append(((String) (xmpnode))).toString();
	//   60  128:new             #118 <Class StringBuilder>
	//   61  131:dup             
	//   62  132:invokespecial   #119 <Method void StringBuilder()>
	//   63  135:aload_2         
	//   64  136:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   65  139:aload           4
	//   66  141:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   67  144:aload_1         
	//   68  145:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   69  148:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   70  151:areturn         
					}
			}
		}
		return ((String) (obj));
	}

	protected XMPPropertyInfo createPropertyInfo(final XMPNode node, final String baseNS, final String path)
	{
		final String value;
		if(node.getOptions().isSchemaNode())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #70  <Method PropertyOptions XMPNode.getOptions()>
	//*   2    4:invokevirtual   #76  <Method boolean PropertyOptions.isSchemaNode()>
	//*   3    7:ifeq            27
			value = null;
	//    4   10:aconst_null     
	//    5   11:astore          4
		else
	//*   6   13:new             #11  <Class XMPIteratorImpl$NodeIterator$1>
	//*   7   16:dup             
	//*   8   17:aload_0         
	//*   9   18:aload_1         
	//*  10   19:aload_2         
	//*  11   20:aload_3         
	//*  12   21:aload           4
	//*  13   23:invokespecial   #164 <Method void XMPIteratorImpl$NodeIterator$1(XMPIteratorImpl$NodeIterator, XMPNode, String, String, String)>
	//*  14   26:areturn         
			value = node.getValue();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #167 <Method String XMPNode.getValue()>
	//   17   31:astore          4
		return new XMPPropertyInfo() {

			public String getLanguage()
			{
				return null;
			//    0    0:aconst_null     
			//    1    1:areturn         
			}

			public String getNamespace()
			{
				if(!node.getOptions().isSchemaNode())
			//*   0    0:aload_0         
			//*   1    1:getfield        #28  <Field XMPNode val$node>
			//*   2    4:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
			//*   3    7:invokevirtual   #53  <Method boolean PropertyOptions.isSchemaNode()>
			//*   4   10:ifne            41
				{
					QName qname = new QName(node.getName());
			//    5   13:new             #55  <Class QName>
			//    6   16:dup             
			//    7   17:aload_0         
			//    8   18:getfield        #28  <Field XMPNode val$node>
			//    9   21:invokevirtual   #58  <Method String XMPNode.getName()>
			//   10   24:invokespecial   #61  <Method void QName(String)>
			//   11   27:astore_1        
					return XMPMetaFactory.getSchemaRegistry().getNamespaceURI(qname.getPrefix());
			//   12   28:invokestatic    #67  <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
			//   13   31:aload_1         
			//   14   32:invokevirtual   #70  <Method String QName.getPrefix()>
			//   15   35:invokeinterface #76  <Method String XMPSchemaRegistry.getNamespaceURI(String)>
			//   16   40:areturn         
				} else
				{
					return baseNS;
			//   17   41:aload_0         
			//   18   42:getfield        #30  <Field String val$baseNS>
			//   19   45:areturn         
				}
			}

			public PropertyOptions getOptions()
			{
				return node.getOptions();
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field XMPNode val$node>
			//    2    4:invokevirtual   #47  <Method PropertyOptions XMPNode.getOptions()>
			//    3    7:areturn         
			}

			public String getPath()
			{
				return path;
			//    0    0:aload_0         
			//    1    1:getfield        #32  <Field String val$path>
			//    2    4:areturn         
			}

			public String getValue()
			{
				return value;
			//    0    0:aload_0         
			//    1    1:getfield        #34  <Field String val$value>
			//    2    4:areturn         
			}

			final XMPIteratorImpl.NodeIterator this$1;
			final String val$baseNS;
			final XMPNode val$node;
			final String val$path;
			final String val$value;

			
			{
				this$1 = XMPIteratorImpl.NodeIterator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field XMPIteratorImpl$NodeIterator this$1>
				node = xmpnode;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field XMPNode val$node>
				baseNS = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$baseNS>
				path = s1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field String val$path>
				value = s2;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field String val$value>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
		}
;
	//*  18   33:goto            13
	}

	protected Iterator getChildrenIterator()
	{
		return childrenIterator;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Iterator childrenIterator>
	//    2    4:areturn         
	}

	protected XMPPropertyInfo getReturnProperty()
	{
		return returnProperty;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field XMPPropertyInfo returnProperty>
	//    2    4:areturn         
	}

	public boolean hasNext()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(returnProperty == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #60  <Field XMPPropertyInfo returnProperty>
	//*   4    6:ifnull          11
	//*   5    9:iload_1         
	//*   6   10:ireturn         
		{
			if(state == 0)
	//*   7   11:aload_0         
	//*   8   12:getfield        #40  <Field int state>
	//*   9   15:ifne            23
				return reportNode();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #173 <Method boolean reportNode()>
	//   12   22:ireturn         
			if(state == 1)
	//*  13   23:aload_0         
	//*  14   24:getfield        #40  <Field int state>
	//*  15   27:iconst_1        
	//*  16   28:icmpne          106
			{
				if(childrenIterator == null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #42  <Field Iterator childrenIterator>
	//*  19   35:ifnonnull       49
					childrenIterator = visitedNode.iterateChildren();
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #64  <Field XMPNode visitedNode>
	//   23   43:invokevirtual   #175 <Method Iterator XMPNode.iterateChildren()>
	//   24   46:putfield        #42  <Field Iterator childrenIterator>
				boolean flag1 = iterateChildren(childrenIterator);
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #42  <Field Iterator childrenIterator>
	//   28   54:invokespecial   #177 <Method boolean iterateChildren(Iterator)>
	//   29   57:istore_2        
				flag = flag1;
	//   30   58:iload_2         
	//   31   59:istore_1        
				if(!flag1)
	//*  32   60:iload_2         
	//*  33   61:ifne            9
				{
					flag = flag1;
	//   34   64:iload_2         
	//   35   65:istore_1        
					if(visitedNode.hasQualifier())
	//*  36   66:aload_0         
	//*  37   67:getfield        #64  <Field XMPNode visitedNode>
	//*  38   70:invokevirtual   #180 <Method boolean XMPNode.hasQualifier()>
	//*  39   73:ifeq            9
					{
						flag = flag1;
	//   40   76:iload_2         
	//   41   77:istore_1        
						if(!getOptions().isOmitQualifiers())
	//*  42   78:aload_0         
	//*  43   79:getfield        #35  <Field XMPIteratorImpl this$0>
	//*  44   82:invokevirtual   #143 <Method IteratorOptions XMPIteratorImpl.getOptions()>
	//*  45   85:invokevirtual   #183 <Method boolean IteratorOptions.isOmitQualifiers()>
	//*  46   88:ifne            9
						{
							state = 2;
	//   47   91:aload_0         
	//   48   92:iconst_2        
	//   49   93:putfield        #40  <Field int state>
							childrenIterator = null;
	//   50   96:aload_0         
	//   51   97:aconst_null     
	//   52   98:putfield        #42  <Field Iterator childrenIterator>
							return hasNext();
	//   53  101:aload_0         
	//   54  102:invokevirtual   #184 <Method boolean hasNext()>
	//   55  105:ireturn         
						}
					}
				}
			} else
			{
				if(childrenIterator == null)
	//*  56  106:aload_0         
	//*  57  107:getfield        #42  <Field Iterator childrenIterator>
	//*  58  110:ifnonnull       124
					childrenIterator = visitedNode.iterateQualifier();
	//   59  113:aload_0         
	//   60  114:aload_0         
	//   61  115:getfield        #64  <Field XMPNode visitedNode>
	//   62  118:invokevirtual   #187 <Method Iterator XMPNode.iterateQualifier()>
	//   63  121:putfield        #42  <Field Iterator childrenIterator>
				return iterateChildren(childrenIterator);
	//   64  124:aload_0         
	//   65  125:aload_0         
	//   66  126:getfield        #42  <Field Iterator childrenIterator>
	//   67  129:invokespecial   #177 <Method boolean iterateChildren(Iterator)>
	//   68  132:ireturn         
			}
		}
		return flag;
	}

	public Object next()
	{
		if(hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #184 <Method boolean hasNext()>
	//*   2    4:ifeq            19
		{
			XMPPropertyInfo xmppropertyinfo = returnProperty;
	//    3    7:aload_0         
	//    4    8:getfield        #60  <Field XMPPropertyInfo returnProperty>
	//    5   11:astore_1        
			returnProperty = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #60  <Field XMPPropertyInfo returnProperty>
			return ((Object) (xmppropertyinfo));
	//    9   17:aload_1         
	//   10   18:areturn         
		} else
		{
			throw new NoSuchElementException("There are no more nodes to return");
	//   11   19:new             #189 <Class NoSuchElementException>
	//   12   22:dup             
	//   13   23:ldc1            #191 <String "There are no more nodes to return">
	//   14   25:invokespecial   #193 <Method void NoSuchElementException(String)>
	//   15   28:athrow          
		}
	}

	public void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #196 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #197 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	protected boolean reportNode()
	{
		state = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #40  <Field int state>
		if(visitedNode.getParent() != null && (!getOptions().isJustLeafnodes() || !visitedNode.hasChildren()))
	//*   3    5:aload_0         
	//*   4    6:getfield        #64  <Field XMPNode visitedNode>
	//*   5    9:invokevirtual   #111 <Method XMPNode XMPNode.getParent()>
	//*   6   12:ifnull          63
	//*   7   15:aload_0         
	//*   8   16:getfield        #35  <Field XMPIteratorImpl this$0>
	//*   9   19:invokevirtual   #143 <Method IteratorOptions XMPIteratorImpl.getOptions()>
	//*  10   22:invokevirtual   #200 <Method boolean IteratorOptions.isJustLeafnodes()>
	//*  11   25:ifeq            38
	//*  12   28:aload_0         
	//*  13   29:getfield        #64  <Field XMPNode visitedNode>
	//*  14   32:invokevirtual   #203 <Method boolean XMPNode.hasChildren()>
	//*  15   35:ifne            63
		{
			returnProperty = createPropertyInfo(visitedNode, getBaseNS(), path);
	//   16   38:aload_0         
	//   17   39:aload_0         
	//   18   40:aload_0         
	//   19   41:getfield        #64  <Field XMPNode visitedNode>
	//   20   44:aload_0         
	//   21   45:getfield        #35  <Field XMPIteratorImpl this$0>
	//   22   48:invokevirtual   #206 <Method String XMPIteratorImpl.getBaseNS()>
	//   23   51:aload_0         
	//   24   52:getfield        #90  <Field String path>
	//   25   55:invokevirtual   #208 <Method XMPPropertyInfo createPropertyInfo(XMPNode, String, String)>
	//   26   58:putfield        #60  <Field XMPPropertyInfo returnProperty>
			return true;
	//   27   61:iconst_1        
	//   28   62:ireturn         
		} else
		{
			return hasNext();
	//   29   63:aload_0         
	//   30   64:invokevirtual   #184 <Method boolean hasNext()>
	//   31   67:ireturn         
		}
	}

	protected void setChildrenIterator(Iterator iterator)
	{
		childrenIterator = iterator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field Iterator childrenIterator>
	//    3    5:return          
	}

	protected void setReturnProperty(XMPPropertyInfo xmppropertyinfo)
	{
		returnProperty = xmppropertyinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field XMPPropertyInfo returnProperty>
	//    3    5:return          
	}

	protected static final int ITERATE_CHILDREN = 1;
	protected static final int ITERATE_NODE = 0;
	protected static final int ITERATE_QUALIFIER = 2;
	private Iterator childrenIterator;
	private int index;
	private String path;
	private XMPPropertyInfo returnProperty;
	private int state;
	private Iterator subIterator;
	final XMPIteratorImpl this$0;
	private XMPNode visitedNode;

	public XMPIteratorImpl$NodeIterator()
	{
		this$0 = XMPIteratorImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field XMPIteratorImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #38  <Method void Object()>
		state = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #40  <Field int state>
		childrenIterator = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #42  <Field Iterator childrenIterator>
		index = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #44  <Field int index>
		subIterator = Collections.EMPTY_LIST.iterator();
	//   14   24:aload_0         
	//   15   25:getstatic       #50  <Field List Collections.EMPTY_LIST>
	//   16   28:invokeinterface #56  <Method Iterator List.iterator()>
	//   17   33:putfield        #58  <Field Iterator subIterator>
		returnProperty = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #60  <Field XMPPropertyInfo returnProperty>
	//   21   41:return          
	}

	public XMPIteratorImpl$NodeIterator(XMPNode xmpnode, String s, int i)
	{
		this$0 = XMPIteratorImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field XMPIteratorImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #38  <Method void Object()>
		state = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #40  <Field int state>
		childrenIterator = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #42  <Field Iterator childrenIterator>
		index = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #44  <Field int index>
		subIterator = Collections.EMPTY_LIST.iterator();
	//   14   24:aload_0         
	//   15   25:getstatic       #50  <Field List Collections.EMPTY_LIST>
	//   16   28:invokeinterface #56  <Method Iterator List.iterator()>
	//   17   33:putfield        #58  <Field Iterator subIterator>
		returnProperty = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #60  <Field XMPPropertyInfo returnProperty>
		visitedNode = xmpnode;
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:putfield        #64  <Field XMPNode visitedNode>
		state = 0;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #40  <Field int state>
		if(xmpnode.getOptions().isSchemaNode())
	//*  27   51:aload_2         
	//*  28   52:invokevirtual   #70  <Method PropertyOptions XMPNode.getOptions()>
	//*  29   55:invokevirtual   #76  <Method boolean PropertyOptions.isSchemaNode()>
	//*  30   58:ifeq            69
			setBaseNS(xmpnode.getName());
	//   31   61:aload_1         
	//   32   62:aload_2         
	//   33   63:invokevirtual   #80  <Method String XMPNode.getName()>
	//   34   66:invokevirtual   #84  <Method void XMPIteratorImpl.setBaseNS(String)>
		path = accumulatePath(xmpnode, s, i);
	//   35   69:aload_0         
	//   36   70:aload_0         
	//   37   71:aload_2         
	//   38   72:aload_3         
	//   39   73:iload           4
	//   40   75:invokevirtual   #88  <Method String accumulatePath(XMPNode, String, int)>
	//   41   78:putfield        #90  <Field String path>
	//   42   81:return          
	}
}
