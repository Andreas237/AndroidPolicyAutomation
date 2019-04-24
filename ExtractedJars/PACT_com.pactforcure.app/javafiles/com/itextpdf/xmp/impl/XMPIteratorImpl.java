// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.impl.xpath.XMPPath;
import com.itextpdf.xmp.impl.xpath.XMPPathParser;
import com.itextpdf.xmp.options.IteratorOptions;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.properties.XMPPropertyInfo;
import java.util.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPMetaImpl, XMPNodeUtils, XMPNode, QName

public class XMPIteratorImpl
	implements XMPIterator
{
	private class NodeIterator
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
				subIterator = ((Iterator) (new NodeIterator(((XMPNode) (iterator)), path, index)));
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
			String s;
			if(node.getOptions().isSchemaNode())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #70  <Method PropertyOptions XMPNode.getOptions()>
		//*   2    4:invokevirtual   #76  <Method boolean PropertyOptions.isSchemaNode()>
		//*   3    7:ifeq            27
				s = null;
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
				s = node.getValue();
		//   15   27:aload_1         
		//   16   28:invokevirtual   #167 <Method String XMPNode.getValue()>
		//   17   31:astore          4
			return ((_cls1) (s)). new XMPPropertyInfo() {

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

				final NodeIterator this$1;
				final String val$baseNS;
				final XMPNode val$node;
				final String val$path;
				final String val$value;

			
			{
				this$1 = final_nodeiterator;
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
				value = String.this;
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

		public NodeIterator()
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

		public NodeIterator(XMPNode xmpnode, String s, int i)
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

	private class NodeIteratorChildren extends NodeIterator
	{

		public boolean hasNext()
		{
			if(getReturnProperty() != null)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #62  <Method XMPPropertyInfo getReturnProperty()>
		//*   2    4:ifnull          9
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			if(skipSiblings)
		//*   5    9:aload_0         
		//*   6   10:getfield        #19  <Field XMPIteratorImpl this$0>
		//*   7   13:getfield        #66  <Field boolean XMPIteratorImpl.skipSiblings>
		//*   8   16:ifeq            21
				return false;
		//    9   19:iconst_0        
		//   10   20:ireturn         
			if(childrenIterator.hasNext())
		//*  11   21:aload_0         
		//*  12   22:getfield        #56  <Field Iterator childrenIterator>
		//*  13   25:invokeinterface #70  <Method boolean Iterator.hasNext()>
		//*  14   30:ifeq            147
			{
				XMPNode xmpnode = (XMPNode)childrenIterator.next();
		//   15   33:aload_0         
		//   16   34:getfield        #56  <Field Iterator childrenIterator>
		//   17   37:invokeinterface #74  <Method Object Iterator.next()>
		//   18   42:checkcast       #26  <Class XMPNode>
		//   19   45:astore_2        
				index = index + 1;
		//   20   46:aload_0         
		//   21   47:aload_0         
		//   22   48:getfield        #24  <Field int index>
		//   23   51:iconst_1        
		//   24   52:iadd            
		//   25   53:putfield        #24  <Field int index>
				String s = null;
		//   26   56:aconst_null     
		//   27   57:astore_1        
				if(xmpnode.getOptions().isSchemaNode())
		//*  28   58:aload_2         
		//*  29   59:invokevirtual   #30  <Method PropertyOptions XMPNode.getOptions()>
		//*  30   62:invokevirtual   #36  <Method boolean PropertyOptions.isSchemaNode()>
		//*  31   65:ifeq            118
					setBaseNS(xmpnode.getName());
		//   32   68:aload_0         
		//   33   69:getfield        #19  <Field XMPIteratorImpl this$0>
		//   34   72:aload_2         
		//   35   73:invokevirtual   #40  <Method String XMPNode.getName()>
		//   36   76:invokevirtual   #44  <Method void XMPIteratorImpl.setBaseNS(String)>
				else
		//*  37   79:aload_0         
		//*  38   80:getfield        #19  <Field XMPIteratorImpl this$0>
		//*  39   83:invokevirtual   #77  <Method IteratorOptions XMPIteratorImpl.getOptions()>
		//*  40   86:invokevirtual   #82  <Method boolean IteratorOptions.isJustLeafnodes()>
		//*  41   89:ifeq            99
		//*  42   92:aload_2         
		//*  43   93:invokevirtual   #85  <Method boolean XMPNode.hasChildren()>
		//*  44   96:ifne            142
		//*  45   99:aload_0         
		//*  46  100:aload_0         
		//*  47  101:aload_2         
		//*  48  102:aload_0         
		//*  49  103:getfield        #19  <Field XMPIteratorImpl this$0>
		//*  50  106:invokevirtual   #88  <Method String XMPIteratorImpl.getBaseNS()>
		//*  51  109:aload_1         
		//*  52  110:invokevirtual   #92  <Method XMPPropertyInfo createPropertyInfo(XMPNode, String, String)>
		//*  53  113:invokevirtual   #96  <Method void setReturnProperty(XMPPropertyInfo)>
		//*  54  116:iconst_1        
		//*  55  117:ireturn         
				if(xmpnode.getParent() != null)
		//*  56  118:aload_2         
		//*  57  119:invokevirtual   #100 <Method XMPNode XMPNode.getParent()>
		//*  58  122:ifnull          79
					s = accumulatePath(xmpnode, parentPath, index);
		//   59  125:aload_0         
		//   60  126:aload_2         
		//   61  127:aload_0         
		//   62  128:getfield        #50  <Field String parentPath>
		//   63  131:aload_0         
		//   64  132:getfield        #24  <Field int index>
		//   65  135:invokevirtual   #48  <Method String accumulatePath(XMPNode, String, int)>
		//   66  138:astore_1        
				if(!getOptions().isJustLeafnodes() || !xmpnode.hasChildren())
				{
					setReturnProperty(createPropertyInfo(xmpnode, getBaseNS(), s));
					return true;
				} else
		//*  67  139:goto            79
				{
					return hasNext();
		//   68  142:aload_0         
		//   69  143:invokevirtual   #101 <Method boolean hasNext()>
		//   70  146:ireturn         
				}
			} else
			{
				return false;
		//   71  147:iconst_0        
		//   72  148:ireturn         
			}
		}

		private Iterator childrenIterator;
		private int index;
		private String parentPath;
		final XMPIteratorImpl this$0;

		public NodeIteratorChildren(XMPNode xmpnode, String s)
		{
			this$0 = XMPIteratorImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field XMPIteratorImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #22  <Method void XMPIteratorImpl$NodeIterator(XMPIteratorImpl)>
			index = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #24  <Field int index>
			if(xmpnode.getOptions().isSchemaNode())
		//*   9   15:aload_2         
		//*  10   16:invokevirtual   #30  <Method PropertyOptions XMPNode.getOptions()>
		//*  11   19:invokevirtual   #36  <Method boolean PropertyOptions.isSchemaNode()>
		//*  12   22:ifeq            33
				setBaseNS(xmpnode.getName());
		//   13   25:aload_1         
		//   14   26:aload_2         
		//   15   27:invokevirtual   #40  <Method String XMPNode.getName()>
		//   16   30:invokevirtual   #44  <Method void XMPIteratorImpl.setBaseNS(String)>
			parentPath = accumulatePath(xmpnode, s, 1);
		//   17   33:aload_0         
		//   18   34:aload_0         
		//   19   35:aload_2         
		//   20   36:aload_3         
		//   21   37:iconst_1        
		//   22   38:invokevirtual   #48  <Method String accumulatePath(XMPNode, String, int)>
		//   23   41:putfield        #50  <Field String parentPath>
			childrenIterator = xmpnode.iterateChildren();
		//   24   44:aload_0         
		//   25   45:aload_2         
		//   26   46:invokevirtual   #54  <Method Iterator XMPNode.iterateChildren()>
		//   27   49:putfield        #56  <Field Iterator childrenIterator>
		//   28   52:return          
		}
	}


	public XMPIteratorImpl(XMPMetaImpl xmpmetaimpl, String s, String s1, IteratorOptions iteratoroptions)
		throws XMPException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		baseNS = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #32  <Field String baseNS>
		skipSiblings = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #34  <Field boolean skipSiblings>
		skipSubtree = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #36  <Field boolean skipSubtree>
		nodeIterator = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #38  <Field Iterator nodeIterator>
		int i;
		boolean flag;
		if(iteratoroptions == null)
	//*  14   24:aload           4
	//*  15   26:ifnull          114
	//*  16   29:aload_0         
	//*  17   30:aload           4
	//*  18   32:putfield        #40  <Field IteratorOptions options>
	//*  19   35:aconst_null     
	//*  20   36:astore          4
	//*  21   38:aload_2         
	//*  22   39:ifnull          126
	//*  23   42:aload_2         
	//*  24   43:invokevirtual   #46  <Method int String.length()>
	//*  25   46:ifle            126
	//*  26   49:iconst_1        
	//*  27   50:istore          5
	//*  28   52:aload_3         
	//*  29   53:ifnull          132
	//*  30   56:aload_3         
	//*  31   57:invokevirtual   #46  <Method int String.length()>
	//*  32   60:ifle            132
	//*  33   63:iconst_1        
	//*  34   64:istore          6
	//*  35   66:iload           5
	//*  36   68:ifne            138
	//*  37   71:iload           6
	//*  38   73:ifne            138
	//*  39   76:aload_1         
	//*  40   77:invokevirtual   #52  <Method XMPNode XMPMetaImpl.getRoot()>
	//*  41   80:astore_1        
	//*  42   81:aload           4
	//*  43   83:astore_2        
	//*  44   84:aload_1         
	//*  45   85:ifnull          276
	//*  46   88:aload_0         
	//*  47   89:getfield        #40  <Field IteratorOptions options>
	//*  48   92:invokevirtual   #58  <Method boolean IteratorOptions.isJustChildren()>
	//*  49   95:ifne            261
	//*  50   98:aload_0         
	//*  51   99:new             #8   <Class XMPIteratorImpl$NodeIterator>
	//*  52  102:dup             
	//*  53  103:aload_0         
	//*  54  104:aload_1         
	//*  55  105:aload_2         
	//*  56  106:iconst_1        
	//*  57  107:invokespecial   #61  <Method void XMPIteratorImpl$NodeIterator(XMPIteratorImpl, XMPNode, String, int)>
	//*  58  110:putfield        #38  <Field Iterator nodeIterator>
	//*  59  113:return          
			iteratoroptions = new IteratorOptions();
	//   60  114:new             #54  <Class IteratorOptions>
	//   61  117:dup             
	//   62  118:invokespecial   #62  <Method void IteratorOptions()>
	//   63  121:astore          4
		options = iteratoroptions;
		iteratoroptions = null;
		if(s != null && s.length() > 0)
			i = 1;
		else
	//*  64  123:goto            29
			i = 0;
	//   65  126:iconst_0        
	//   66  127:istore          5
		if(s1 != null && s1.length() > 0)
			flag = true;
		else
	//*  67  129:goto            52
			flag = false;
	//   68  132:iconst_0        
	//   69  133:istore          6
		if(i == 0 && !flag)
		{
			xmpmetaimpl = ((XMPMetaImpl) (xmpmetaimpl.getRoot()));
			s = ((String) (iteratoroptions));
		} else
	//*  70  135:goto            66
		if(i != 0 && flag)
	//*  71  138:iload           5
	//*  72  140:ifeq            223
	//*  73  143:iload           6
	//*  74  145:ifeq            223
		{
			iteratoroptions = ((IteratorOptions) (XMPPathParser.expandXPath(s, s1)));
	//   75  148:aload_2         
	//   76  149:aload_3         
	//   77  150:invokestatic    #68  <Method XMPPath XMPPathParser.expandXPath(String, String)>
	//   78  153:astore          4
			s1 = ((String) (new XMPPath()));
	//   79  155:new             #70  <Class XMPPath>
	//   80  158:dup             
	//   81  159:invokespecial   #71  <Method void XMPPath()>
	//   82  162:astore_3        
			for(i = 0; i < ((XMPPath) (iteratoroptions)).size() - 1; i++)
	//*  83  163:iconst_0        
	//*  84  164:istore          5
	//*  85  166:iload           5
	//*  86  168:aload           4
	//*  87  170:invokevirtual   #74  <Method int XMPPath.size()>
	//*  88  173:iconst_1        
	//*  89  174:isub            
	//*  90  175:icmpge          198
				((XMPPath) (s1)).add(((XMPPath) (iteratoroptions)).getSegment(i));
	//   91  178:aload_3         
	//   92  179:aload           4
	//   93  181:iload           5
	//   94  183:invokevirtual   #78  <Method com.itextpdf.xmp.impl.xpath.XMPPathSegment XMPPath.getSegment(int)>
	//   95  186:invokevirtual   #82  <Method void XMPPath.add(com.itextpdf.xmp.impl.xpath.XMPPathSegment)>

	//   96  189:iload           5
	//   97  191:iconst_1        
	//   98  192:iadd            
	//   99  193:istore          5
	//* 100  195:goto            166
			xmpmetaimpl = ((XMPMetaImpl) (XMPNodeUtils.findNode(xmpmetaimpl.getRoot(), ((XMPPath) (iteratoroptions)), false, ((PropertyOptions) (null)))));
	//  101  198:aload_1         
	//  102  199:invokevirtual   #52  <Method XMPNode XMPMetaImpl.getRoot()>
	//  103  202:aload           4
	//  104  204:iconst_0        
	//  105  205:aconst_null     
	//  106  206:invokestatic    #88  <Method XMPNode XMPNodeUtils.findNode(XMPNode, XMPPath, boolean, PropertyOptions)>
	//  107  209:astore_1        
			baseNS = s;
	//  108  210:aload_0         
	//  109  211:aload_2         
	//  110  212:putfield        #32  <Field String baseNS>
			s = ((XMPPath) (s1)).toString();
	//  111  215:aload_3         
	//  112  216:invokevirtual   #92  <Method String XMPPath.toString()>
	//  113  219:astore_2        
		} else
	//* 114  220:goto            84
		if(i != 0 && !flag)
	//* 115  223:iload           5
	//* 116  225:ifeq            249
	//* 117  228:iload           6
	//* 118  230:ifne            249
		{
			xmpmetaimpl = ((XMPMetaImpl) (XMPNodeUtils.findSchemaNode(xmpmetaimpl.getRoot(), s, false)));
	//  119  233:aload_1         
	//  120  234:invokevirtual   #52  <Method XMPNode XMPMetaImpl.getRoot()>
	//  121  237:aload_2         
	//  122  238:iconst_0        
	//  123  239:invokestatic    #96  <Method XMPNode XMPNodeUtils.findSchemaNode(XMPNode, String, boolean)>
	//  124  242:astore_1        
			s = ((String) (iteratoroptions));
	//  125  243:aload           4
	//  126  245:astore_2        
		} else
	//* 127  246:goto            84
		{
			throw new XMPException("Schema namespace URI is required", 101);
	//  128  249:new             #27  <Class XMPException>
	//  129  252:dup             
	//  130  253:ldc1            #98  <String "Schema namespace URI is required">
	//  131  255:bipush          101
	//  132  257:invokespecial   #101 <Method void XMPException(String, int)>
	//  133  260:athrow          
		}
		if(xmpmetaimpl != null)
		{
			if(!options.isJustChildren())
			{
				nodeIterator = ((Iterator) (new NodeIterator(((XMPNode) (xmpmetaimpl)), s, 1)));
				return;
			} else
			{
				nodeIterator = ((Iterator) (new NodeIteratorChildren(((XMPNode) (xmpmetaimpl)), s)));
	//  134  261:aload_0         
	//  135  262:new             #13  <Class XMPIteratorImpl$NodeIteratorChildren>
	//  136  265:dup             
	//  137  266:aload_0         
	//  138  267:aload_1         
	//  139  268:aload_2         
	//  140  269:invokespecial   #104 <Method void XMPIteratorImpl$NodeIteratorChildren(XMPIteratorImpl, XMPNode, String)>
	//  141  272:putfield        #38  <Field Iterator nodeIterator>
				return;
	//  142  275:return          
			}
		} else
		{
			nodeIterator = Collections.EMPTY_LIST.iterator();
	//  143  276:aload_0         
	//  144  277:getstatic       #110 <Field List Collections.EMPTY_LIST>
	//  145  280:invokeinterface #116 <Method Iterator List.iterator()>
	//  146  285:putfield        #38  <Field Iterator nodeIterator>
			return;
	//  147  288:return          
		}
	}

	protected String getBaseNS()
	{
		return baseNS;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String baseNS>
	//    2    4:areturn         
	}

	protected IteratorOptions getOptions()
	{
		return options;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field IteratorOptions options>
	//    2    4:areturn         
	}

	public boolean hasNext()
	{
		return nodeIterator.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Iterator nodeIterator>
	//    2    4:invokeinterface #126 <Method boolean Iterator.hasNext()>
	//    3    9:ireturn         
	}

	public Object next()
	{
		return nodeIterator.next();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Iterator nodeIterator>
	//    2    4:invokeinterface #130 <Method Object Iterator.next()>
	//    3    9:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException("The XMPIterator does not support remove().");
	//    0    0:new             #133 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #135 <String "The XMPIterator does not support remove().">
	//    3    6:invokespecial   #138 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	protected void setBaseNS(String s)
	{
		baseNS = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String baseNS>
	//    3    5:return          
	}

	public void skipSiblings()
	{
		skipSubtree();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method void skipSubtree()>
		skipSiblings = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #34  <Field boolean skipSiblings>
	//    5    9:return          
	}

	public void skipSubtree()
	{
		skipSubtree = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #36  <Field boolean skipSubtree>
	//    3    5:return          
	}

	private String baseNS;
	private Iterator nodeIterator;
	private IteratorOptions options;
	protected boolean skipSiblings;
	protected boolean skipSubtree;
}
