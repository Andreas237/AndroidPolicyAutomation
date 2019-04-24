// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.impl.xpath.XMPPathParser;
import com.itextpdf.xmp.options.*;
import com.itextpdf.xmp.properties.XMPProperty;
import java.util.Calendar;
import java.util.Iterator;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPNode, XMPNodeUtils, ParameterAsserts, Utils, 
//			XMPIteratorImpl, XMPNormalizer

public class XMPMetaImpl
	implements XMPMeta, XMPConst
{

	public XMPMetaImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		packetHeader = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #51  <Field String packetHeader>
		tree = new XMPNode(((String) (null)), ((String) (null)), ((PropertyOptions) (null)));
	//    5    9:aload_0         
	//    6   10:new             #53  <Class XMPNode>
	//    7   13:dup             
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:aconst_null     
	//   11   17:invokespecial   #56  <Method void XMPNode(String, String, PropertyOptions)>
	//   12   20:putfield        #58  <Field XMPNode tree>
	//   13   23:return          
	}

	public XMPMetaImpl(XMPNode xmpnode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		packetHeader = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #51  <Field String packetHeader>
		tree = xmpnode;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #58  <Field XMPNode tree>
	//    8   14:return          
	}

	private void doSetArrayItem(XMPNode xmpnode, int i, String s, PropertyOptions propertyoptions, boolean flag)
		throws XMPException
	{
		XMPNode xmpnode1 = new XMPNode("[]", ((PropertyOptions) (null)));
	//    0    0:new             #53  <Class XMPNode>
	//    1    3:dup             
	//    2    4:ldc1            #65  <String "[]">
	//    3    6:aconst_null     
	//    4    7:invokespecial   #68  <Method void XMPNode(String, PropertyOptions)>
	//    5   10:astore          8
		propertyoptions = XMPNodeUtils.verifySetOptions(propertyoptions, ((Object) (s)));
	//    6   12:aload           4
	//    7   14:aload_3         
	//    8   15:invokestatic    #74  <Method PropertyOptions XMPNodeUtils.verifySetOptions(PropertyOptions, Object)>
	//    9   18:astore          4
		int j;
		int k;
		if(flag)
	//*  10   20:iload           5
	//*  11   22:ifeq            88
			j = xmpnode.getChildrenLength() + 1;
	//   12   25:aload_1         
	//   13   26:invokevirtual   #78  <Method int XMPNode.getChildrenLength()>
	//   14   29:iconst_1        
	//   15   30:iadd            
	//   16   31:istore          6
		else
	//*  17   33:iload_2         
	//*  18   34:istore          7
	//*  19   36:iload_2         
	//*  20   37:iconst_m1       
	//*  21   38:icmpne          45
	//*  22   41:iload           6
	//*  23   43:istore          7
	//*  24   45:iconst_1        
	//*  25   46:iload           7
	//*  26   48:icmpgt          97
	//*  27   51:iload           7
	//*  28   53:iload           6
	//*  29   55:icmpgt          97
	//*  30   58:iload           5
	//*  31   60:ifne            69
	//*  32   63:aload_1         
	//*  33   64:iload           7
	//*  34   66:invokevirtual   #82  <Method void XMPNode.removeChild(int)>
	//*  35   69:aload_1         
	//*  36   70:iload           7
	//*  37   72:aload           8
	//*  38   74:invokevirtual   #86  <Method void XMPNode.addChild(int, XMPNode)>
	//*  39   77:aload_0         
	//*  40   78:aload           8
	//*  41   80:aload_3         
	//*  42   81:aload           4
	//*  43   83:iconst_0        
	//*  44   84:invokevirtual   #90  <Method void setNode(XMPNode, Object, PropertyOptions, boolean)>
	//*  45   87:return          
			j = xmpnode.getChildrenLength();
	//   46   88:aload_1         
	//   47   89:invokevirtual   #78  <Method int XMPNode.getChildrenLength()>
	//   48   92:istore          6
		k = i;
		if(i == -1)
			k = j;
		if(1 <= k && k <= j)
		{
			if(!flag)
				xmpnode.removeChild(k);
			xmpnode.addChild(k, xmpnode1);
			setNode(xmpnode1, ((Object) (s)), propertyoptions, false);
			return;
		} else
	//*  49   94:goto            33
		{
			throw new XMPException("Array index out of bounds", 104);
	//   50   97:new             #63  <Class XMPException>
	//   51  100:dup             
	//   52  101:ldc1            #92  <String "Array index out of bounds">
	//   53  103:bipush          104
	//   54  105:invokespecial   #95  <Method void XMPException(String, int)>
	//   55  108:athrow          
		}
	}

	private Object evaluateNodeValue(int i, XMPNode xmpnode)
		throws XMPException
	{
		String s = xmpnode.getValue();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #102 <Method String XMPNode.getValue()>
	//    2    4:astore_3        
		switch(i)
	//*   3    5:iload_1         
		{
	//*   4    6:tableswitch     1 7: default 48
	//	               1 64
	//	               2 76
	//	               3 88
	//	               4 100
	//	               5 112
	//	               6 117
	//	               7 127
		default:
			if(s != null || xmpnode.getOptions().isCompositeProperty())
	//*   5   48:aload_3         
	//*   6   49:ifnonnull       62
	//*   7   52:aload_2         
	//*   8   53:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//*   9   56:invokevirtual   #111 <Method boolean PropertyOptions.isCompositeProperty()>
	//*  10   59:ifeq            132
				return ((Object) (s));
	//   11   62:aload_3         
	//   12   63:areturn         
			else
	//*  13   64:new             #113 <Class Boolean>
	//*  14   67:dup             
	//*  15   68:aload_3         
	//*  16   69:invokestatic    #119 <Method boolean XMPUtils.convertToBoolean(String)>
	//*  17   72:invokespecial   #122 <Method void Boolean(boolean)>
	//*  18   75:areturn         
	//*  19   76:new             #124 <Class Integer>
	//*  20   79:dup             
	//*  21   80:aload_3         
	//*  22   81:invokestatic    #128 <Method int XMPUtils.convertToInteger(String)>
	//*  23   84:invokespecial   #130 <Method void Integer(int)>
	//*  24   87:areturn         
	//*  25   88:new             #132 <Class Long>
	//*  26   91:dup             
	//*  27   92:aload_3         
	//*  28   93:invokestatic    #136 <Method long XMPUtils.convertToLong(String)>
	//*  29   96:invokespecial   #139 <Method void Long(long)>
	//*  30   99:areturn         
	//*  31  100:new             #141 <Class Double>
	//*  32  103:dup             
	//*  33  104:aload_3         
	//*  34  105:invokestatic    #145 <Method double XMPUtils.convertToDouble(String)>
	//*  35  108:invokespecial   #148 <Method void Double(double)>
	//*  36  111:areturn         
	//*  37  112:aload_3         
	//*  38  113:invokestatic    #152 <Method XMPDateTime XMPUtils.convertToDate(String)>
	//*  39  116:areturn         
	//*  40  117:aload_3         
	//*  41  118:invokestatic    #152 <Method XMPDateTime XMPUtils.convertToDate(String)>
	//*  42  121:invokeinterface #158 <Method Calendar XMPDateTime.getCalendar()>
	//*  43  126:areturn         
	//*  44  127:aload_3         
	//*  45  128:invokestatic    #162 <Method byte[] XMPUtils.decodeBase64(String)>
	//*  46  131:areturn         
				return ((Object) (""));
	//   47  132:ldc1            #164 <String "">
	//   48  134:areturn         

		case 1: // '\001'
			return ((Object) (new Boolean(XMPUtils.convertToBoolean(s))));

		case 2: // '\002'
			return ((Object) (new Integer(XMPUtils.convertToInteger(s))));

		case 3: // '\003'
			return ((Object) (new Long(XMPUtils.convertToLong(s))));

		case 4: // '\004'
			return ((Object) (new Double(XMPUtils.convertToDouble(s))));

		case 5: // '\005'
			return ((Object) (XMPUtils.convertToDate(s)));

		case 6: // '\006'
			return ((Object) (XMPUtils.convertToDate(s).getCalendar()));

		case 7: // '\007'
			return ((Object) (XMPUtils.decodeBase64(s)));
		}
	}

	public void appendArrayItem(String s, String s1, PropertyOptions propertyoptions, String s2, PropertyOptions propertyoptions1)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #175 <Method void ParameterAsserts.assertArrayName(String)>
		PropertyOptions propertyoptions2 = propertyoptions;
	//    4    8:aload_3         
	//    5    9:astore          6
		if(propertyoptions == null)
	//*   6   11:aload_3         
	//*   7   12:ifnonnull       24
			propertyoptions2 = new PropertyOptions();
	//    8   15:new             #108 <Class PropertyOptions>
	//    9   18:dup             
	//   10   19:invokespecial   #176 <Method void PropertyOptions()>
	//   11   22:astore          6
		if(!propertyoptions2.isOnlyArrayOptions())
	//*  12   24:aload           6
	//*  13   26:invokevirtual   #179 <Method boolean PropertyOptions.isOnlyArrayOptions()>
	//*  14   29:ifne            44
			throw new XMPException("Only array form flags allowed for arrayOptions", 103);
	//   15   32:new             #63  <Class XMPException>
	//   16   35:dup             
	//   17   36:ldc1            #181 <String "Only array form flags allowed for arrayOptions">
	//   18   38:bipush          103
	//   19   40:invokespecial   #95  <Method void XMPException(String, int)>
	//   20   43:athrow          
		propertyoptions = XMPNodeUtils.verifySetOptions(propertyoptions2, ((Object) (null)));
	//   21   44:aload           6
	//   22   46:aconst_null     
	//   23   47:invokestatic    #74  <Method PropertyOptions XMPNodeUtils.verifySetOptions(PropertyOptions, Object)>
	//   24   50:astore_3        
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//   28   56:astore_1        
		s1 = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//   29   57:aload_0         
	//   30   58:getfield        #58  <Field XMPNode tree>
	//   31   61:aload_1         
	//   32   62:iconst_0        
	//   33   63:aconst_null     
	//   34   64:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   35   67:astore_2        
		if(s1 != null)
	//*  36   68:aload_2         
	//*  37   69:ifnull          96
		{
			s = s1;
	//   38   72:aload_2         
	//   39   73:astore_1        
			if(!((XMPNode) (s1)).getOptions().isArray())
	//*  40   74:aload_2         
	//*  41   75:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//*  42   78:invokevirtual   #194 <Method boolean PropertyOptions.isArray()>
	//*  43   81:ifne            144
				throw new XMPException("The named property is not an array", 102);
	//   44   84:new             #63  <Class XMPException>
	//   45   87:dup             
	//   46   88:ldc1            #196 <String "The named property is not an array">
	//   47   90:bipush          102
	//   48   92:invokespecial   #95  <Method void XMPException(String, int)>
	//   49   95:athrow          
		} else
		if(propertyoptions.isArray())
	//*  50   96:aload_3         
	//*  51   97:invokevirtual   #194 <Method boolean PropertyOptions.isArray()>
	//*  52  100:ifeq            132
		{
			s1 = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), true, propertyoptions)));
	//   53  103:aload_0         
	//   54  104:getfield        #58  <Field XMPNode tree>
	//   55  107:aload_1         
	//   56  108:iconst_1        
	//   57  109:aload_3         
	//   58  110:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   59  113:astore_2        
			s = s1;
	//   60  114:aload_2         
	//   61  115:astore_1        
			if(s1 == null)
	//*  62  116:aload_2         
	//*  63  117:ifnonnull       144
				throw new XMPException("Failure creating array node", 102);
	//   64  120:new             #63  <Class XMPException>
	//   65  123:dup             
	//   66  124:ldc1            #198 <String "Failure creating array node">
	//   67  126:bipush          102
	//   68  128:invokespecial   #95  <Method void XMPException(String, int)>
	//   69  131:athrow          
		} else
		{
			throw new XMPException("Explicit arrayOptions required to create new array", 103);
	//   70  132:new             #63  <Class XMPException>
	//   71  135:dup             
	//   72  136:ldc1            #200 <String "Explicit arrayOptions required to create new array">
	//   73  138:bipush          103
	//   74  140:invokespecial   #95  <Method void XMPException(String, int)>
	//   75  143:athrow          
		}
		doSetArrayItem(((XMPNode) (s)), -1, s2, propertyoptions1, true);
	//   76  144:aload_0         
	//   77  145:aload_1         
	//   78  146:iconst_m1       
	//   79  147:aload           4
	//   80  149:aload           5
	//   81  151:iconst_1        
	//   82  152:invokespecial   #202 <Method void doSetArrayItem(XMPNode, int, String, PropertyOptions, boolean)>
	//   83  155:return          
	}

	public void appendArrayItem(String s, String s1, String s2)
		throws XMPException
	{
		appendArrayItem(s, s1, ((PropertyOptions) (null)), s2, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aconst_null     
	//    6    6:invokevirtual   #205 <Method void appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
	//    7    9:return          
	}

	public Object clone()
	{
		return ((Object) (new XMPMetaImpl((XMPNode)tree.clone())));
	//    0    0:new             #2   <Class XMPMetaImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #58  <Field XMPNode tree>
	//    4    8:invokevirtual   #209 <Method Object XMPNode.clone()>
	//    5   11:checkcast       #53  <Class XMPNode>
	//    6   14:invokespecial   #211 <Method void XMPMetaImpl(XMPNode)>
	//    7   17:areturn         
	}

	public int countArrayItems(String s, String s1)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #175 <Method void ParameterAsserts.assertArrayName(String)>
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//    7   13:astore_1        
		s = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field XMPNode tree>
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:aconst_null     
	//   13   21:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   14   24:astore_1        
		if(s == null)
	//*  15   25:aload_1         
	//*  16   26:ifnonnull       31
			return 0;
	//   17   29:iconst_0        
	//   18   30:ireturn         
		if(((XMPNode) (s)).getOptions().isArray())
	//*  19   31:aload_1         
	//*  20   32:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//*  21   35:invokevirtual   #194 <Method boolean PropertyOptions.isArray()>
	//*  22   38:ifeq            46
			return ((XMPNode) (s)).getChildrenLength();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #78  <Method int XMPNode.getChildrenLength()>
	//   25   45:ireturn         
		else
			throw new XMPException("The named property is not an array", 102);
	//   26   46:new             #63  <Class XMPException>
	//   27   49:dup             
	//   28   50:ldc1            #196 <String "The named property is not an array">
	//   29   52:bipush          102
	//   30   54:invokespecial   #95  <Method void XMPException(String, int)>
	//   31   57:athrow          
	}

	public void deleteArrayItem(String s, String s1, int i)
	{
		try
		{
			ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
			ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #175 <Method void ParameterAsserts.assertArrayName(String)>
			deleteProperty(s, XMPPathFactory.composeArrayItemPath(s1, i));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:invokestatic    #221 <Method String XMPPathFactory.composeArrayItemPath(String, int)>
	//    9   15:invokevirtual   #225 <Method void deleteProperty(String, String)>
			return;
	//   10   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  11   19:astore_1        
		{
			return;
	//   12   20:return          
		}
	}

	public void deleteProperty(String s, String s1)
	{
		try
		{
			ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
			ParameterAsserts.assertPropName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #228 <Method void ParameterAsserts.assertPropName(String)>
			s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//    7   13:astore_1        
			s = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field XMPNode tree>
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:aconst_null     
	//   13   21:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   14   24:astore_1        
		}
	//*  15   25:aload_1         
	//*  16   26:ifnull          33
	//*  17   29:aload_1         
	//*  18   30:invokestatic    #231 <Method void XMPNodeUtils.deleteNode(XMPNode)>
	//*  19   33:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  20   34:astore_1        
		{
			return;
	//   21   35:return          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_33;
		XMPNodeUtils.deleteNode(((XMPNode) (s)));
	}

	public void deleteQualifier(String s, String s1, String s2, String s3)
	{
		try
		{
			ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
			ParameterAsserts.assertPropName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #228 <Method void ParameterAsserts.assertPropName(String)>
			deleteProperty(s, (new StringBuilder()).append(s1).append(XMPPathFactory.composeQualifierPath(s2, s3)).toString());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:new             #235 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #236 <Method void StringBuilder()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_3         
	//   12   22:aload           4
	//   13   24:invokestatic    #244 <Method String XMPPathFactory.composeQualifierPath(String, String)>
	//   14   27:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   16   33:invokevirtual   #225 <Method void deleteProperty(String, String)>
			return;
	//   17   36:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  18   37:astore_1        
		{
			return;
	//   19   38:return          
		}
	}

	public void deleteStructField(String s, String s1, String s2, String s3)
	{
		try
		{
			ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
			ParameterAsserts.assertStructName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #251 <Method void ParameterAsserts.assertStructName(String)>
			deleteProperty(s, (new StringBuilder()).append(s1).append(XMPPathFactory.composeStructFieldPath(s2, s3)).toString());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:new             #235 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #236 <Method void StringBuilder()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_3         
	//   12   22:aload           4
	//   13   24:invokestatic    #254 <Method String XMPPathFactory.composeStructFieldPath(String, String)>
	//   14   27:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   16   33:invokevirtual   #225 <Method void deleteProperty(String, String)>
			return;
	//   17   36:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  18   37:astore_1        
		{
			return;
	//   19   38:return          
		}
	}

	public boolean doesArrayItemExist(String s, String s1, int i)
	{
		boolean flag;
		try
		{
			ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
			ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #175 <Method void ParameterAsserts.assertArrayName(String)>
			flag = doesPropertyExist(s, XMPPathFactory.composeArrayItemPath(s1, i));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:invokestatic    #221 <Method String XMPPathFactory.composeArrayItemPath(String, int)>
	//    9   15:invokevirtual   #260 <Method boolean doesPropertyExist(String, String)>
	//   10   18:istore          4
		}
	//*  11   20:iload           4
	//*  12   22:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   23:astore_1        
		{
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		}
		return flag;
	}

	public boolean doesPropertyExist(String s, String s1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		try
		{
			ParameterAsserts.assertSchemaNS(s);
	//    2    2:aload_1         
	//    3    3:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
			ParameterAsserts.assertPropName(s1);
	//    4    6:aload_2         
	//    5    7:invokestatic    #228 <Method void ParameterAsserts.assertPropName(String)>
			s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//    9   15:astore_1        
			s = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//   10   16:aload_0         
	//   11   17:getfield        #58  <Field XMPNode tree>
	//   12   20:aload_1         
	//   13   21:iconst_0        
	//   14   22:aconst_null     
	//   15   23:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   16   26:astore_1        
		}
	//*  17   27:aload_1         
	//*  18   28:ifnull          33
	//*  19   31:iconst_1        
	//*  20   32:istore_3        
	//*  21   33:iload_3         
	//*  22   34:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  23   35:astore_1        
		{
			return false;
	//   24   36:iconst_0        
	//   25   37:ireturn         
		}
		if(s != null)
			flag = true;
		return flag;
	}

	public boolean doesQualifierExist(String s, String s1, String s2, String s3)
	{
		boolean flag;
		try
		{
			ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
			ParameterAsserts.assertPropName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #228 <Method void ParameterAsserts.assertPropName(String)>
			s2 = XMPPathFactory.composeQualifierPath(s2, s3);
	//    4    8:aload_3         
	//    5    9:aload           4
	//    6   11:invokestatic    #244 <Method String XMPPathFactory.composeQualifierPath(String, String)>
	//    7   14:astore_3        
			flag = doesPropertyExist(s, (new StringBuilder()).append(s1).append(s2).toString());
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:new             #235 <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #236 <Method void StringBuilder()>
	//   13   24:aload_2         
	//   14   25:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:aload_3         
	//   16   29:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   18   35:invokevirtual   #260 <Method boolean doesPropertyExist(String, String)>
	//   19   38:istore          5
		}
	//*  20   40:iload           5
	//*  21   42:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  22   43:astore_1        
		{
			return false;
	//   23   44:iconst_0        
	//   24   45:ireturn         
		}
		return flag;
	}

	public boolean doesStructFieldExist(String s, String s1, String s2, String s3)
	{
		boolean flag;
		try
		{
			ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
			ParameterAsserts.assertStructName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #251 <Method void ParameterAsserts.assertStructName(String)>
			s2 = XMPPathFactory.composeStructFieldPath(s2, s3);
	//    4    8:aload_3         
	//    5    9:aload           4
	//    6   11:invokestatic    #254 <Method String XMPPathFactory.composeStructFieldPath(String, String)>
	//    7   14:astore_3        
			flag = doesPropertyExist(s, (new StringBuilder()).append(s1).append(s2).toString());
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:new             #235 <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #236 <Method void StringBuilder()>
	//   13   24:aload_2         
	//   14   25:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:aload_3         
	//   16   29:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   18   35:invokevirtual   #260 <Method boolean doesPropertyExist(String, String)>
	//   19   38:istore          5
		}
	//*  20   40:iload           5
	//*  21   42:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  22   43:astore_1        
		{
			return false;
	//   23   44:iconst_0        
	//   24   45:ireturn         
		}
		return flag;
	}

	public String dumpObject()
	{
		return getRoot().dumpNode(true);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #268 <Method XMPNode getRoot()>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #272 <Method String XMPNode.dumpNode(boolean)>
	//    4    8:areturn         
	}

	public XMPProperty getArrayItem(String s, String s1, int i)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #175 <Method void ParameterAsserts.assertArrayName(String)>
		return getProperty(s, XMPPathFactory.composeArrayItemPath(s1, i));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:invokestatic    #221 <Method String XMPPathFactory.composeArrayItemPath(String, int)>
	//    9   15:invokevirtual   #278 <Method XMPProperty getProperty(String, String)>
	//   10   18:areturn         
	}

	public XMPProperty getLocalizedText(final String itemNode, String s, String s1, String s2)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(itemNode);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertArrayName(s);
	//    2    4:aload_2         
	//    3    5:invokestatic    #175 <Method void ParameterAsserts.assertArrayName(String)>
		ParameterAsserts.assertSpecificLang(s2);
	//    4    8:aload           4
	//    5   10:invokestatic    #283 <Method void ParameterAsserts.assertSpecificLang(String)>
		if(s1 != null)
	//*   6   13:aload_3         
	//*   7   14:ifnull          52
			s1 = Utils.normalizeLangValue(s1);
	//    8   17:aload_3         
	//    9   18:invokestatic    #289 <Method String Utils.normalizeLangValue(String)>
	//   10   21:astore_3        
		else
	//*  11   22:aload           4
	//*  12   24:invokestatic    #289 <Method String Utils.normalizeLangValue(String)>
	//*  13   27:astore          4
	//*  14   29:aload_1         
	//*  15   30:aload_2         
	//*  16   31:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//*  17   34:astore_1        
	//*  18   35:aload_0         
	//*  19   36:getfield        #58  <Field XMPNode tree>
	//*  20   39:aload_1         
	//*  21   40:iconst_0        
	//*  22   41:aconst_null     
	//*  23   42:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//*  24   45:astore_1        
	//*  25   46:aload_1         
	//*  26   47:ifnonnull       57
	//*  27   50:aconst_null     
	//*  28   51:areturn         
			s1 = null;
	//   29   52:aconst_null     
	//   30   53:astore_3        
		s2 = Utils.normalizeLangValue(s2);
		itemNode = ((String) (XMPPathParser.expandXPath(itemNode, s)));
		itemNode = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (itemNode)), false, ((PropertyOptions) (null)))));
		if(itemNode != null)
	//*  31   54:goto            22
		{
			itemNode = ((String) (XMPNodeUtils.chooseLocalizedText(((XMPNode) (itemNode)), s1, s2)));
	//   32   57:aload_1         
	//   33   58:aload_3         
	//   34   59:aload           4
	//   35   61:invokestatic    #293 <Method Object[] XMPNodeUtils.chooseLocalizedText(XMPNode, String, String)>
	//   36   64:astore_1        
			int i = ((Integer)itemNode[0]).intValue();
	//   37   65:aload_1         
	//   38   66:iconst_0        
	//   39   67:aaload          
	//   40   68:checkcast       #124 <Class Integer>
	//   41   71:invokevirtual   #296 <Method int Integer.intValue()>
	//   42   74:istore          5
			itemNode = ((String) ((XMPNode)itemNode[1]));
	//   43   76:aload_1         
	//   44   77:iconst_1        
	//   45   78:aaload          
	//   46   79:checkcast       #53  <Class XMPNode>
	//   47   82:astore_1        
			if(i != 0)
	//*  48   83:iload           5
	//*  49   85:ifeq            50
				return new XMPProperty() {

					public String getLanguage()
					{
						return itemNode.getQualifier(1).getValue();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field XMPNode val$itemNode>
					//    2    4:iconst_1        
					//    3    5:invokevirtual   #33  <Method XMPNode XMPNode.getQualifier(int)>
					//    4    8:invokevirtual   #36  <Method String XMPNode.getValue()>
					//    5   11:areturn         
					}

					public PropertyOptions getOptions()
					{
						return itemNode.getOptions();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field XMPNode val$itemNode>
					//    2    4:invokevirtual   #40  <Method PropertyOptions XMPNode.getOptions()>
					//    3    7:areturn         
					}

					public String getValue()
					{
						return itemNode.getValue();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field XMPNode val$itemNode>
					//    2    4:invokevirtual   #36  <Method String XMPNode.getValue()>
					//    3    7:areturn         
					}

					public String toString()
					{
						return itemNode.getValue().toString();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field XMPNode val$itemNode>
					//    2    4:invokevirtual   #36  <Method String XMPNode.getValue()>
					//    3    7:invokevirtual   #45  <Method String String.toString()>
					//    4   10:areturn         
					}

					final XMPMetaImpl this$0;
					final XMPNode val$itemNode;

			
			{
				this$0 = XMPMetaImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field XMPMetaImpl this$0>
				itemNode = xmpnode;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field XMPNode val$itemNode>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
;
	//   50   88:new             #10  <Class XMPMetaImpl$1>
	//   51   91:dup             
	//   52   92:aload_0         
	//   53   93:aload_1         
	//   54   94:invokespecial   #299 <Method void XMPMetaImpl$1(XMPMetaImpl, XMPNode)>
	//   55   97:areturn         
		}
		return null;
	}

	public String getObjectName()
	{
		if(tree.getName() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field XMPNode tree>
	//*   2    4:invokevirtual   #303 <Method String XMPNode.getName()>
	//*   3    7:ifnull          18
			return tree.getName();
	//    4   10:aload_0         
	//    5   11:getfield        #58  <Field XMPNode tree>
	//    6   14:invokevirtual   #303 <Method String XMPNode.getName()>
	//    7   17:areturn         
		else
			return "";
	//    8   18:ldc1            #164 <String "">
	//    9   20:areturn         
	}

	public String getPacketHeader()
	{
		return packetHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String packetHeader>
	//    2    4:areturn         
	}

	public XMPProperty getProperty(String s, String s1)
		throws XMPException
	{
		return getProperty(s, s1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #306 <Method XMPProperty getProperty(String, String, int)>
	//    5    7:areturn         
	}

	protected XMPProperty getProperty(String s, String s1, int i)
		throws XMPException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		ParameterAsserts.assertSchemaNS(s);
	//    2    3:aload_1         
	//    3    4:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertPropName(s1);
	//    4    7:aload_2         
	//    5    8:invokestatic    #228 <Method void ParameterAsserts.assertPropName(String)>
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//    9   16:astore_1        
		s1 = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//   10   17:aload_0         
	//   11   18:getfield        #58  <Field XMPNode tree>
	//   12   21:aload_1         
	//   13   22:iconst_0        
	//   14   23:aconst_null     
	//   15   24:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   16   27:astore_2        
		s = ((String) (obj));
	//   17   28:aload           4
	//   18   30:astore_1        
		if(s1 != null)
	//*  19   31:aload_2         
	//*  20   32:ifnull          78
		{
			if(i != 0 && ((XMPNode) (s1)).getOptions().isCompositeProperty())
	//*  21   35:iload_3         
	//*  22   36:ifeq            62
	//*  23   39:aload_2         
	//*  24   40:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//*  25   43:invokevirtual   #111 <Method boolean PropertyOptions.isCompositeProperty()>
	//*  26   46:ifeq            62
				throw new XMPException("Property must be simple when a value type is requested", 102);
	//   27   49:new             #63  <Class XMPException>
	//   28   52:dup             
	//   29   53:ldc2            #308 <String "Property must be simple when a value type is requested">
	//   30   56:bipush          102
	//   31   58:invokespecial   #95  <Method void XMPException(String, int)>
	//   32   61:athrow          
			s = ((String) (new XMPProperty() {

				public String getLanguage()
				{
					return null;
				//    0    0:aconst_null     
				//    1    1:areturn         
				}

				public PropertyOptions getOptions()
				{
					return propNode.getOptions();
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field XMPNode val$propNode>
				//    2    4:invokevirtual   #37  <Method PropertyOptions XMPNode.getOptions()>
				//    3    7:areturn         
				}

				public String getValue()
				{
					if(value != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #23  <Field Object val$value>
				//*   2    4:ifnull          15
						return value.toString();
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field Object val$value>
				//    5   11:invokevirtual   #41  <Method String Object.toString()>
				//    6   14:areturn         
					else
						return null;
				//    7   15:aconst_null     
				//    8   16:areturn         
				}

				public String toString()
				{
					return value.toString();
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field Object val$value>
				//    2    4:invokevirtual   #41  <Method String Object.toString()>
				//    3    7:areturn         
				}

				final XMPMetaImpl this$0;
				final XMPNode val$propNode;
				final Object val$value;

			
			{
				this$0 = XMPMetaImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field XMPMetaImpl this$0>
				value = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Object val$value>
				propNode = xmpnode;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field XMPNode val$propNode>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
));
	//   33   62:new             #12  <Class XMPMetaImpl$2>
	//   34   65:dup             
	//   35   66:aload_0         
	//   36   67:aload_0         
	//   37   68:iload_3         
	//   38   69:aload_2         
	//   39   70:invokespecial   #310 <Method Object evaluateNodeValue(int, XMPNode)>
	//   40   73:aload_2         
	//   41   74:invokespecial   #313 <Method void XMPMetaImpl$2(XMPMetaImpl, Object, XMPNode)>
	//   42   77:astore_1        
		}
		return ((XMPProperty) (s));
	//   43   78:aload_1         
	//   44   79:areturn         
	}

	public byte[] getPropertyBase64(String s, String s1)
		throws XMPException
	{
		return (byte[])(byte[])getPropertyObject(s, s1, 7);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          7
	//    4    5:invokevirtual   #319 <Method Object getPropertyObject(String, String, int)>
	//    5    8:checkcast       #321 <Class byte[]>
	//    6   11:checkcast       #321 <Class byte[]>
	//    7   14:areturn         
	}

	public Boolean getPropertyBoolean(String s, String s1)
		throws XMPException
	{
		return (Boolean)getPropertyObject(s, s1, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #319 <Method Object getPropertyObject(String, String, int)>
	//    5    7:checkcast       #113 <Class Boolean>
	//    6   10:areturn         
	}

	public Calendar getPropertyCalendar(String s, String s1)
		throws XMPException
	{
		return (Calendar)getPropertyObject(s, s1, 6);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          6
	//    4    5:invokevirtual   #319 <Method Object getPropertyObject(String, String, int)>
	//    5    8:checkcast       #327 <Class Calendar>
	//    6   11:areturn         
	}

	public XMPDateTime getPropertyDate(String s, String s1)
		throws XMPException
	{
		return (XMPDateTime)getPropertyObject(s, s1, 5);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_5        
	//    4    4:invokevirtual   #319 <Method Object getPropertyObject(String, String, int)>
	//    5    7:checkcast       #154 <Class XMPDateTime>
	//    6   10:areturn         
	}

	public Double getPropertyDouble(String s, String s1)
		throws XMPException
	{
		return (Double)getPropertyObject(s, s1, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_4        
	//    4    4:invokevirtual   #319 <Method Object getPropertyObject(String, String, int)>
	//    5    7:checkcast       #141 <Class Double>
	//    6   10:areturn         
	}

	public Integer getPropertyInteger(String s, String s1)
		throws XMPException
	{
		return (Integer)getPropertyObject(s, s1, 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_2        
	//    4    4:invokevirtual   #319 <Method Object getPropertyObject(String, String, int)>
	//    5    7:checkcast       #124 <Class Integer>
	//    6   10:areturn         
	}

	public Long getPropertyLong(String s, String s1)
		throws XMPException
	{
		return (Long)getPropertyObject(s, s1, 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_3        
	//    4    4:invokevirtual   #319 <Method Object getPropertyObject(String, String, int)>
	//    5    7:checkcast       #132 <Class Long>
	//    6   10:areturn         
	}

	protected Object getPropertyObject(String s, String s1, int i)
		throws XMPException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		ParameterAsserts.assertSchemaNS(s);
	//    2    3:aload_1         
	//    3    4:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertPropName(s1);
	//    4    7:aload_2         
	//    5    8:invokestatic    #228 <Method void ParameterAsserts.assertPropName(String)>
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//    9   16:astore_1        
		s1 = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//   10   17:aload_0         
	//   11   18:getfield        #58  <Field XMPNode tree>
	//   12   21:aload_1         
	//   13   22:iconst_0        
	//   14   23:aconst_null     
	//   15   24:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   16   27:astore_2        
		s = ((String) (obj));
	//   17   28:aload           4
	//   18   30:astore_1        
		if(s1 != null)
	//*  19   31:aload_2         
	//*  20   32:ifnull          69
		{
			if(i != 0 && ((XMPNode) (s1)).getOptions().isCompositeProperty())
	//*  21   35:iload_3         
	//*  22   36:ifeq            62
	//*  23   39:aload_2         
	//*  24   40:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//*  25   43:invokevirtual   #111 <Method boolean PropertyOptions.isCompositeProperty()>
	//*  26   46:ifeq            62
				throw new XMPException("Property must be simple when a value type is requested", 102);
	//   27   49:new             #63  <Class XMPException>
	//   28   52:dup             
	//   29   53:ldc2            #308 <String "Property must be simple when a value type is requested">
	//   30   56:bipush          102
	//   31   58:invokespecial   #95  <Method void XMPException(String, int)>
	//   32   61:athrow          
			s = ((String) (evaluateNodeValue(i, ((XMPNode) (s1)))));
	//   33   62:aload_0         
	//   34   63:iload_3         
	//   35   64:aload_2         
	//   36   65:invokespecial   #310 <Method Object evaluateNodeValue(int, XMPNode)>
	//   37   68:astore_1        
		}
		return ((Object) (s));
	//   38   69:aload_1         
	//   39   70:areturn         
	}

	public String getPropertyString(String s, String s1)
		throws XMPException
	{
		return (String)getPropertyObject(s, s1, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #319 <Method Object getPropertyObject(String, String, int)>
	//    5    7:checkcast       #338 <Class String>
	//    6   10:areturn         
	}

	public XMPProperty getQualifier(String s, String s1, String s2, String s3)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertPropName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #228 <Method void ParameterAsserts.assertPropName(String)>
		return getProperty(s, (new StringBuilder()).append(s1).append(XMPPathFactory.composeQualifierPath(s2, s3)).toString());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:new             #235 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #236 <Method void StringBuilder()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_3         
	//   12   22:aload           4
	//   13   24:invokestatic    #244 <Method String XMPPathFactory.composeQualifierPath(String, String)>
	//   14   27:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   16   33:invokevirtual   #278 <Method XMPProperty getProperty(String, String)>
	//   17   36:areturn         
	}

	public XMPNode getRoot()
	{
		return tree;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field XMPNode tree>
	//    2    4:areturn         
	}

	public XMPProperty getStructField(String s, String s1, String s2, String s3)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertStructName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #251 <Method void ParameterAsserts.assertStructName(String)>
		return getProperty(s, (new StringBuilder()).append(s1).append(XMPPathFactory.composeStructFieldPath(s2, s3)).toString());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:new             #235 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #236 <Method void StringBuilder()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_3         
	//   12   22:aload           4
	//   13   24:invokestatic    #254 <Method String XMPPathFactory.composeStructFieldPath(String, String)>
	//   14   27:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   16   33:invokevirtual   #278 <Method XMPProperty getProperty(String, String)>
	//   17   36:areturn         
	}

	public void insertArrayItem(String s, String s1, int i, String s2)
		throws XMPException
	{
		insertArrayItem(s, s1, i, s2, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokevirtual   #345 <Method void insertArrayItem(String, String, int, String, PropertyOptions)>
	//    7   10:return          
	}

	public void insertArrayItem(String s, String s1, int i, String s2, PropertyOptions propertyoptions)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #175 <Method void ParameterAsserts.assertArrayName(String)>
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//    7   13:astore_1        
		s = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field XMPNode tree>
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:aconst_null     
	//   13   21:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   14   24:astore_1        
		if(s != null)
	//*  15   25:aload_1         
	//*  16   26:ifnull          41
		{
			doSetArrayItem(((XMPNode) (s)), i, s2, propertyoptions, true);
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:iload_3         
	//   20   32:aload           4
	//   21   34:aload           5
	//   22   36:iconst_1        
	//   23   37:invokespecial   #202 <Method void doSetArrayItem(XMPNode, int, String, PropertyOptions, boolean)>
			return;
	//   24   40:return          
		} else
		{
			throw new XMPException("Specified array does not exist", 102);
	//   25   41:new             #63  <Class XMPException>
	//   26   44:dup             
	//   27   45:ldc2            #347 <String "Specified array does not exist">
	//   28   48:bipush          102
	//   29   50:invokespecial   #95  <Method void XMPException(String, int)>
	//   30   53:athrow          
		}
	}

	public XMPIterator iterator()
		throws XMPException
	{
		return iterator(((String) (null)), ((String) (null)), ((IteratorOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #352 <Method XMPIterator iterator(String, String, IteratorOptions)>
	//    5    7:areturn         
	}

	public XMPIterator iterator(IteratorOptions iteratoroptions)
		throws XMPException
	{
		return iterator(((String) (null)), ((String) (null)), iteratoroptions);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aload_1         
	//    4    4:invokevirtual   #352 <Method XMPIterator iterator(String, String, IteratorOptions)>
	//    5    7:areturn         
	}

	public XMPIterator iterator(String s, String s1, IteratorOptions iteratoroptions)
		throws XMPException
	{
		return ((XMPIterator) (new XMPIteratorImpl(this, s, s1, iteratoroptions)));
	//    0    0:new             #355 <Class XMPIteratorImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #358 <Method void XMPIteratorImpl(XMPMetaImpl, String, String, IteratorOptions)>
	//    7   11:areturn         
	}

	public void normalize(ParseOptions parseoptions)
		throws XMPException
	{
		ParseOptions parseoptions1 = parseoptions;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(parseoptions == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			parseoptions1 = new ParseOptions();
	//    4    6:new             #362 <Class ParseOptions>
	//    5    9:dup             
	//    6   10:invokespecial   #363 <Method void ParseOptions()>
	//    7   13:astore_2        
		XMPNormalizer.process(this, parseoptions1);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #369 <Method XMPMeta XMPNormalizer.process(XMPMetaImpl, ParseOptions)>
	//   11   19:pop             
	//   12   20:return          
	}

	public void setArrayItem(String s, String s1, int i, String s2)
		throws XMPException
	{
		setArrayItem(s, s1, i, s2, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokevirtual   #372 <Method void setArrayItem(String, String, int, String, PropertyOptions)>
	//    7   10:return          
	}

	public void setArrayItem(String s, String s1, int i, String s2, PropertyOptions propertyoptions)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #175 <Method void ParameterAsserts.assertArrayName(String)>
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//    7   13:astore_1        
		s = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), false, ((PropertyOptions) (null)))));
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field XMPNode tree>
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:aconst_null     
	//   13   21:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   14   24:astore_1        
		if(s != null)
	//*  15   25:aload_1         
	//*  16   26:ifnull          41
		{
			doSetArrayItem(((XMPNode) (s)), i, s2, propertyoptions, false);
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:iload_3         
	//   20   32:aload           4
	//   21   34:aload           5
	//   22   36:iconst_0        
	//   23   37:invokespecial   #202 <Method void doSetArrayItem(XMPNode, int, String, PropertyOptions, boolean)>
			return;
	//   24   40:return          
		} else
		{
			throw new XMPException("Specified array does not exist", 102);
	//   25   41:new             #63  <Class XMPException>
	//   26   44:dup             
	//   27   45:ldc2            #347 <String "Specified array does not exist">
	//   28   48:bipush          102
	//   29   50:invokespecial   #95  <Method void XMPException(String, int)>
	//   30   53:athrow          
		}
	}

	public void setLocalizedText(String s, String s1, String s2, String s3, String s4)
		throws XMPException
	{
		setLocalizedText(s, s1, s2, s3, s4, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #377 <Method void setLocalizedText(String, String, String, String, String, PropertyOptions)>
	//    8   12:return          
	}

	public void setLocalizedText(String s, String s1, String s2, String s3, String s4, PropertyOptions propertyoptions)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertArrayName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #175 <Method void ParameterAsserts.assertArrayName(String)>
		ParameterAsserts.assertSpecificLang(s3);
	//    4    8:aload           4
	//    5   10:invokestatic    #283 <Method void ParameterAsserts.assertSpecificLang(String)>
		if(s2 != null)
	//*   6   13:aload_3         
	//*   7   14:ifnull          74
			s2 = Utils.normalizeLangValue(s2);
	//    8   17:aload_3         
	//    9   18:invokestatic    #289 <Method String Utils.normalizeLangValue(String)>
	//   10   21:astore_3        
		else
	//*  11   22:aload           4
	//*  12   24:invokestatic    #289 <Method String Utils.normalizeLangValue(String)>
	//*  13   27:astore          6
	//*  14   29:aload_1         
	//*  15   30:aload_2         
	//*  16   31:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//*  17   34:astore_1        
	//*  18   35:aload_0         
	//*  19   36:getfield        #58  <Field XMPNode tree>
	//*  20   39:aload_1         
	//*  21   40:iconst_1        
	//*  22   41:new             #108 <Class PropertyOptions>
	//*  23   44:dup             
	//*  24   45:sipush          7680
	//*  25   48:invokespecial   #378 <Method void PropertyOptions(int)>
	//*  26   51:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//*  27   54:astore          4
	//*  28   56:aload           4
	//*  29   58:ifnonnull       79
	//*  30   61:new             #63  <Class XMPException>
	//*  31   64:dup             
	//*  32   65:ldc2            #380 <String "Failed to find or create array node">
	//*  33   68:bipush          102
	//*  34   70:invokespecial   #95  <Method void XMPException(String, int)>
	//*  35   73:athrow          
			s2 = null;
	//   36   74:aconst_null     
	//   37   75:astore_3        
		propertyoptions = ((PropertyOptions) (Utils.normalizeLangValue(s3)));
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
		s3 = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), true, new PropertyOptions(7680))));
		if(s3 == null)
			throw new XMPException("Failed to find or create array node", 102);
	//*  38   76:goto            22
		if(((XMPNode) (s3)).getOptions().isArrayAltText()) goto _L2; else goto _L1
	//   39   79:aload           4
	//   40   81:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//   41   84:invokevirtual   #383 <Method boolean PropertyOptions.isArrayAltText()>
	//   42   87:ifne            119
_L1:
		if(((XMPNode) (s3)).hasChildren() || !((XMPNode) (s3)).getOptions().isArrayAlternate()) goto _L4; else goto _L3
	//   43   90:aload           4
	//   44   92:invokevirtual   #386 <Method boolean XMPNode.hasChildren()>
	//   45   95:ifne            195
	//   46   98:aload           4
	//   47  100:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//   48  103:invokevirtual   #389 <Method boolean PropertyOptions.isArrayAlternate()>
	//   49  106:ifeq            195
_L3:
		((XMPNode) (s3)).getOptions().setArrayAltText(true);
	//   50  109:aload           4
	//   51  111:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//   52  114:iconst_1        
	//   53  115:invokevirtual   #393 <Method PropertyOptions PropertyOptions.setArrayAltText(boolean)>
	//   54  118:pop             
_L2:
		int i;
		Iterator iterator1;
		i = 0;
	//   55  119:iconst_0        
	//   56  120:istore          7
		s1 = null;
	//   57  122:aconst_null     
	//   58  123:astore_2        
		iterator1 = ((XMPNode) (s3)).iterateChildren();
	//   59  124:aload           4
	//   60  126:invokevirtual   #397 <Method Iterator XMPNode.iterateChildren()>
	//   61  129:astore          10
_L6:
		boolean flag1;
		flag1 = ((boolean) (i));
	//   62  131:iload           7
	//   63  133:istore          8
		s = s1;
	//   64  135:aload_2         
	//   65  136:astore_1        
		if(iterator1.hasNext())
	//*  66  137:aload           10
	//*  67  139:invokeinterface #402 <Method boolean Iterator.hasNext()>
	//*  68  144:ifeq            228
		{
			s = ((String) ((XMPNode)iterator1.next()));
	//   69  147:aload           10
	//   70  149:invokeinterface #405 <Method Object Iterator.next()>
	//   71  154:checkcast       #53  <Class XMPNode>
	//   72  157:astore_1        
			if(!((XMPNode) (s)).hasQualifier() || !"xml:lang".equals(((Object) (((XMPNode) (s)).getQualifier(1).getName()))))
	//*  73  158:aload_1         
	//*  74  159:invokevirtual   #408 <Method boolean XMPNode.hasQualifier()>
	//*  75  162:ifeq            182
	//*  76  165:ldc2            #410 <String "xml:lang">
	//*  77  168:aload_1         
	//*  78  169:iconst_1        
	//*  79  170:invokevirtual   #413 <Method XMPNode XMPNode.getQualifier(int)>
	//*  80  173:invokevirtual   #303 <Method String XMPNode.getName()>
	//*  81  176:invokevirtual   #417 <Method boolean String.equals(Object)>
	//*  82  179:ifne            208
				throw new XMPException("Language qualifier must be first", 102);
	//   83  182:new             #63  <Class XMPException>
	//   84  185:dup             
	//   85  186:ldc2            #419 <String "Language qualifier must be first">
	//   86  189:bipush          102
	//   87  191:invokespecial   #95  <Method void XMPException(String, int)>
	//   88  194:athrow          
			continue; /* Loop/switch isn't completed */
		}
		break MISSING_BLOCK_LABEL_228;
_L4:
		throw new XMPException("Specified property is no alt-text array", 102);
	//   89  195:new             #63  <Class XMPException>
	//   90  198:dup             
	//   91  199:ldc2            #421 <String "Specified property is no alt-text array">
	//   92  202:bipush          102
	//   93  204:invokespecial   #95  <Method void XMPException(String, int)>
	//   94  207:athrow          
		if(!"x-default".equals(((Object) (((XMPNode) (s)).getQualifier(1).getValue())))) goto _L6; else goto _L5
	//   95  208:ldc2            #423 <String "x-default">
	//   96  211:aload_1         
	//   97  212:iconst_1        
	//   98  213:invokevirtual   #413 <Method XMPNode XMPNode.getQualifier(int)>
	//   99  216:invokevirtual   #102 <Method String XMPNode.getValue()>
	//  100  219:invokevirtual   #417 <Method boolean String.equals(Object)>
	//  101  222:ifeq            131
_L5:
		flag1 = true;
	//  102  225:iconst_1        
	//  103  226:istore          8
		boolean flag2;
		if(s != null && ((XMPNode) (s3)).getChildrenLength() > 1)
	//* 104  228:aload_1         
	//* 105  229:ifnull          254
	//* 106  232:aload           4
	//* 107  234:invokevirtual   #78  <Method int XMPNode.getChildrenLength()>
	//* 108  237:iconst_1        
	//* 109  238:icmple          254
		{
			((XMPNode) (s3)).removeChild(((XMPNode) (s)));
	//  110  241:aload           4
	//  111  243:aload_1         
	//  112  244:invokevirtual   #425 <Method void XMPNode.removeChild(XMPNode)>
			((XMPNode) (s3)).addChild(1, ((XMPNode) (s)));
	//  113  247:aload           4
	//  114  249:iconst_1        
	//  115  250:aload_1         
	//  116  251:invokevirtual   #86  <Method void XMPNode.addChild(int, XMPNode)>
		}
		s1 = ((String) (XMPNodeUtils.chooseLocalizedText(((XMPNode) (s3)), s2, ((String) (propertyoptions)))));
	//  117  254:aload           4
	//  118  256:aload_3         
	//  119  257:aload           6
	//  120  259:invokestatic    #293 <Method Object[] XMPNodeUtils.chooseLocalizedText(XMPNode, String, String)>
	//  121  262:astore_2        
		i = ((Integer)s1[0]).intValue();
	//  122  263:aload_2         
	//  123  264:iconst_0        
	//  124  265:aaload          
	//  125  266:checkcast       #124 <Class Integer>
	//  126  269:invokevirtual   #296 <Method int Integer.intValue()>
	//  127  272:istore          7
		s1 = ((String) ((XMPNode)s1[1]));
	//  128  274:aload_2         
	//  129  275:iconst_1        
	//  130  276:aaload          
	//  131  277:checkcast       #53  <Class XMPNode>
	//  132  280:astore_2        
		flag2 = "x-default".equals(((Object) (propertyoptions)));
	//  133  281:ldc2            #423 <String "x-default">
	//  134  284:aload           6
	//  135  286:invokevirtual   #417 <Method boolean String.equals(Object)>
	//  136  289:istore          9
		i;
	//  137  291:iload           7
		JVM INSTR tableswitch 0 5: default 332
	//	               0 345
	//	               1 405
	//	               2 574
	//	               3 621
	//	               4 645
	//	               5 680;
	//  138  293:tableswitch     0 5: default 332
	//	               0 345
	//	               1 405
	//	               2 574
	//	               3 621
	//	               4 645
	//	               5 680
		   goto _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L7:
		throw new XMPException("Unexpected result from ChooseLocalizedText", 9);
	//  139  332:new             #63  <Class XMPException>
	//  140  335:dup             
	//  141  336:ldc2            #427 <String "Unexpected result from ChooseLocalizedText">
	//  142  339:bipush          9
	//  143  341:invokespecial   #95  <Method void XMPException(String, int)>
	//  144  344:athrow          
_L8:
		boolean flag;
		XMPNodeUtils.appendLangItem(((XMPNode) (s3)), "x-default", s4);
	//  145  345:aload           4
	//  146  347:ldc2            #423 <String "x-default">
	//  147  350:aload           5
	//  148  352:invokestatic    #431 <Method void XMPNodeUtils.appendLangItem(XMPNode, String, String)>
		flag1 = true;
	//  149  355:iconst_1        
	//  150  356:istore          8
		flag = flag1;
	//  151  358:iload           8
	//  152  360:istore          7
		if(!flag2)
	//* 153  362:iload           9
	//* 154  364:ifne            380
		{
			XMPNodeUtils.appendLangItem(((XMPNode) (s3)), ((String) (propertyoptions)), s4);
	//  155  367:aload           4
	//  156  369:aload           6
	//  157  371:aload           5
	//  158  373:invokestatic    #431 <Method void XMPNodeUtils.appendLangItem(XMPNode, String, String)>
			flag = flag1;
	//  159  376:iload           8
	//  160  378:istore          7
		}
_L15:
		if(!flag && ((XMPNode) (s3)).getChildrenLength() == 1)
	//* 161  380:iload           7
	//* 162  382:ifne            404
	//* 163  385:aload           4
	//* 164  387:invokevirtual   #78  <Method int XMPNode.getChildrenLength()>
	//* 165  390:iconst_1        
	//* 166  391:icmpne          404
			XMPNodeUtils.appendLangItem(((XMPNode) (s3)), "x-default", s4);
	//  167  394:aload           4
	//  168  396:ldc2            #423 <String "x-default">
	//  169  399:aload           5
	//  170  401:invokestatic    #431 <Method void XMPNodeUtils.appendLangItem(XMPNode, String, String)>
		return;
	//  171  404:return          
_L9:
		if(!flag2)
	//* 172  405:iload           9
	//* 173  407:ifne            457
		{
			if(flag1 && s != s1 && s != null && ((XMPNode) (s)).getValue().equals(((Object) (((XMPNode) (s1)).getValue()))))
	//* 174  410:iload           8
	//* 175  412:ifeq            444
	//* 176  415:aload_1         
	//* 177  416:aload_2         
	//* 178  417:if_acmpeq       444
	//* 179  420:aload_1         
	//* 180  421:ifnull          444
	//* 181  424:aload_1         
	//* 182  425:invokevirtual   #102 <Method String XMPNode.getValue()>
	//* 183  428:aload_2         
	//* 184  429:invokevirtual   #102 <Method String XMPNode.getValue()>
	//* 185  432:invokevirtual   #417 <Method boolean String.equals(Object)>
	//* 186  435:ifeq            444
				((XMPNode) (s)).setValue(s4);
	//  187  438:aload_1         
	//  188  439:aload           5
	//  189  441:invokevirtual   #434 <Method void XMPNode.setValue(String)>
			((XMPNode) (s1)).setValue(s4);
	//  190  444:aload_2         
	//  191  445:aload           5
	//  192  447:invokevirtual   #434 <Method void XMPNode.setValue(String)>
			flag = flag1;
	//  193  450:iload           8
	//  194  452:istore          7
		} else
	//* 195  454:goto            380
		{
			if(!$assertionsDisabled && (!flag1 || s != s1))
	//* 196  457:getstatic       #45  <Field boolean $assertionsDisabled>
	//* 197  460:ifne            481
	//* 198  463:iload           8
	//* 199  465:ifeq            473
	//* 200  468:aload_1         
	//* 201  469:aload_2         
	//* 202  470:if_acmpeq       481
				throw new AssertionError();
	//  203  473:new             #436 <Class AssertionError>
	//  204  476:dup             
	//  205  477:invokespecial   #437 <Method void AssertionError()>
	//  206  480:athrow          
			s2 = ((String) (((XMPNode) (s3)).iterateChildren()));
	//  207  481:aload           4
	//  208  483:invokevirtual   #397 <Method Iterator XMPNode.iterateChildren()>
	//  209  486:astore_3        
			do
			{
				if(!((Iterator) (s2)).hasNext())
					break;
	//  210  487:aload_3         
	//  211  488:invokeinterface #402 <Method boolean Iterator.hasNext()>
	//  212  493:ifeq            553
				propertyoptions = ((PropertyOptions) ((XMPNode)((Iterator) (s2)).next()));
	//  213  496:aload_3         
	//  214  497:invokeinterface #405 <Method Object Iterator.next()>
	//  215  502:checkcast       #53  <Class XMPNode>
	//  216  505:astore          6
				if(propertyoptions != s)
	//* 217  507:aload           6
	//* 218  509:aload_1         
	//* 219  510:if_acmpeq       487
				{
					String s5 = ((XMPNode) (propertyoptions)).getValue();
	//  220  513:aload           6
	//  221  515:invokevirtual   #102 <Method String XMPNode.getValue()>
	//  222  518:astore          10
					if(s != null)
	//* 223  520:aload_1         
	//* 224  521:ifnull          548
						s1 = ((XMPNode) (s)).getValue();
	//  225  524:aload_1         
	//  226  525:invokevirtual   #102 <Method String XMPNode.getValue()>
	//  227  528:astore_2        
					else
	//* 228  529:aload           10
	//* 229  531:aload_2         
	//* 230  532:invokevirtual   #417 <Method boolean String.equals(Object)>
	//* 231  535:ifeq            487
	//* 232  538:aload           6
	//* 233  540:aload           5
	//* 234  542:invokevirtual   #434 <Method void XMPNode.setValue(String)>
	//* 235  545:goto            487
						s1 = null;
	//  236  548:aconst_null     
	//  237  549:astore_2        
					if(s5.equals(((Object) (s1))))
						((XMPNode) (propertyoptions)).setValue(s4);
				}
			} while(true);
	//* 238  550:goto            529
			flag = flag1;
	//  239  553:iload           8
	//  240  555:istore          7
			if(s != null)
	//* 241  557:aload_1         
	//* 242  558:ifnull          380
			{
				((XMPNode) (s)).setValue(s4);
	//  243  561:aload_1         
	//  244  562:aload           5
	//  245  564:invokevirtual   #434 <Method void XMPNode.setValue(String)>
				flag = flag1;
	//  246  567:iload           8
	//  247  569:istore          7
			}
		}
		continue; /* Loop/switch isn't completed */
	//  248  571:goto            380
_L10:
		if(flag1 && s != s1 && s != null && ((XMPNode) (s)).getValue().equals(((Object) (((XMPNode) (s1)).getValue()))))
	//* 249  574:iload           8
	//* 250  576:ifeq            608
	//* 251  579:aload_1         
	//* 252  580:aload_2         
	//* 253  581:if_acmpeq       608
	//* 254  584:aload_1         
	//* 255  585:ifnull          608
	//* 256  588:aload_1         
	//* 257  589:invokevirtual   #102 <Method String XMPNode.getValue()>
	//* 258  592:aload_2         
	//* 259  593:invokevirtual   #102 <Method String XMPNode.getValue()>
	//* 260  596:invokevirtual   #417 <Method boolean String.equals(Object)>
	//* 261  599:ifeq            608
			((XMPNode) (s)).setValue(s4);
	//  262  602:aload_1         
	//  263  603:aload           5
	//  264  605:invokevirtual   #434 <Method void XMPNode.setValue(String)>
		((XMPNode) (s1)).setValue(s4);
	//  265  608:aload_2         
	//  266  609:aload           5
	//  267  611:invokevirtual   #434 <Method void XMPNode.setValue(String)>
		flag = flag1;
	//  268  614:iload           8
	//  269  616:istore          7
		continue; /* Loop/switch isn't completed */
	//  270  618:goto            380
_L11:
		XMPNodeUtils.appendLangItem(((XMPNode) (s3)), ((String) (propertyoptions)), s4);
	//  271  621:aload           4
	//  272  623:aload           6
	//  273  625:aload           5
	//  274  627:invokestatic    #431 <Method void XMPNodeUtils.appendLangItem(XMPNode, String, String)>
		flag = flag1;
	//  275  630:iload           8
	//  276  632:istore          7
		if(flag2)
	//* 277  634:iload           9
	//* 278  636:ifeq            380
			flag = true;
	//  279  639:iconst_1        
	//  280  640:istore          7
		continue; /* Loop/switch isn't completed */
	//  281  642:goto            380
_L12:
		if(s != null && ((XMPNode) (s3)).getChildrenLength() == 1)
	//* 282  645:aload_1         
	//* 283  646:ifnull          664
	//* 284  649:aload           4
	//* 285  651:invokevirtual   #78  <Method int XMPNode.getChildrenLength()>
	//* 286  654:iconst_1        
	//* 287  655:icmpne          664
			((XMPNode) (s)).setValue(s4);
	//  288  658:aload_1         
	//  289  659:aload           5
	//  290  661:invokevirtual   #434 <Method void XMPNode.setValue(String)>
		XMPNodeUtils.appendLangItem(((XMPNode) (s3)), ((String) (propertyoptions)), s4);
	//  291  664:aload           4
	//  292  666:aload           6
	//  293  668:aload           5
	//  294  670:invokestatic    #431 <Method void XMPNodeUtils.appendLangItem(XMPNode, String, String)>
		flag = flag1;
	//  295  673:iload           8
	//  296  675:istore          7
		continue; /* Loop/switch isn't completed */
	//  297  677:goto            380
_L13:
		XMPNodeUtils.appendLangItem(((XMPNode) (s3)), ((String) (propertyoptions)), s4);
	//  298  680:aload           4
	//  299  682:aload           6
	//  300  684:aload           5
	//  301  686:invokestatic    #431 <Method void XMPNodeUtils.appendLangItem(XMPNode, String, String)>
		flag = flag1;
	//  302  689:iload           8
	//  303  691:istore          7
		if(flag2)
	//* 304  693:iload           9
	//* 305  695:ifeq            380
			flag = true;
	//  306  698:iconst_1        
	//  307  699:istore          7
		if(true) goto _L15; else goto _L14
	//  308  701:goto            380
_L14:
	}

	void setNode(XMPNode xmpnode, Object obj, PropertyOptions propertyoptions, boolean flag)
		throws XMPException
	{
		if(flag)
	//*   0    0:iload           4
	//*   1    2:ifeq            9
			xmpnode.clear();
	//    2    5:aload_1         
	//    3    6:invokevirtual   #440 <Method void XMPNode.clear()>
		xmpnode.getOptions().mergeWith(propertyoptions);
	//    4    9:aload_1         
	//    5   10:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//    6   13:aload_3         
	//    7   14:invokevirtual   #444 <Method void PropertyOptions.mergeWith(PropertyOptions)>
		if(!xmpnode.getOptions().isCompositeProperty())
	//*   8   17:aload_1         
	//*   9   18:invokevirtual   #106 <Method PropertyOptions XMPNode.getOptions()>
	//*  10   21:invokevirtual   #111 <Method boolean PropertyOptions.isCompositeProperty()>
	//*  11   24:ifne            33
		{
			XMPNodeUtils.setNodeValue(xmpnode, obj);
	//   12   27:aload_1         
	//   13   28:aload_2         
	//   14   29:invokestatic    #448 <Method void XMPNodeUtils.setNodeValue(XMPNode, Object)>
			return;
	//   15   32:return          
		}
		if(obj != null && obj.toString().length() > 0)
	//*  16   33:aload_2         
	//*  17   34:ifnull          60
	//*  18   37:aload_2         
	//*  19   38:invokevirtual   #449 <Method String Object.toString()>
	//*  20   41:invokevirtual   #452 <Method int String.length()>
	//*  21   44:ifle            60
		{
			throw new XMPException("Composite nodes can't have values", 102);
	//   22   47:new             #63  <Class XMPException>
	//   23   50:dup             
	//   24   51:ldc2            #454 <String "Composite nodes can't have values">
	//   25   54:bipush          102
	//   26   56:invokespecial   #95  <Method void XMPException(String, int)>
	//   27   59:athrow          
		} else
		{
			xmpnode.removeChildren();
	//   28   60:aload_1         
	//   29   61:invokevirtual   #457 <Method void XMPNode.removeChildren()>
			return;
	//   30   64:return          
		}
	}

	public void setObjectName(String s)
	{
		tree.setName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field XMPNode tree>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #461 <Method void XMPNode.setName(String)>
	//    4    8:return          
	}

	public void setPacketHeader(String s)
	{
		packetHeader = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field String packetHeader>
	//    3    5:return          
	}

	public void setProperty(String s, String s1, Object obj)
		throws XMPException
	{
		setProperty(s, s1, obj, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    6    8:return          
	}

	public void setProperty(String s, String s1, Object obj, PropertyOptions propertyoptions)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertPropName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #228 <Method void ParameterAsserts.assertPropName(String)>
		propertyoptions = XMPNodeUtils.verifySetOptions(propertyoptions, obj);
	//    4    8:aload           4
	//    5   10:aload_3         
	//    6   11:invokestatic    #74  <Method PropertyOptions XMPNodeUtils.verifySetOptions(PropertyOptions, Object)>
	//    7   14:astore          4
		s = ((String) (XMPPathParser.expandXPath(s, s1)));
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokestatic    #187 <Method com.itextpdf.xmp.impl.xpath.XMPPath XMPPathParser.expandXPath(String, String)>
	//   11   21:astore_1        
		s = ((String) (XMPNodeUtils.findNode(tree, ((com.itextpdf.xmp.impl.xpath.XMPPath) (s)), true, propertyoptions)));
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field XMPNode tree>
	//   14   26:aload_1         
	//   15   27:iconst_1        
	//   16   28:aload           4
	//   17   30:invokestatic    #191 <Method XMPNode XMPNodeUtils.findNode(XMPNode, com.itextpdf.xmp.impl.xpath.XMPPath, boolean, PropertyOptions)>
	//   18   33:astore_1        
		if(s != null)
	//*  19   34:aload_1         
	//*  20   35:ifnull          48
		{
			setNode(((XMPNode) (s)), obj, propertyoptions, false);
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:aload_3         
	//   24   41:aload           4
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #90  <Method void setNode(XMPNode, Object, PropertyOptions, boolean)>
			return;
	//   27   47:return          
		} else
		{
			throw new XMPException("Specified property does not exist", 102);
	//   28   48:new             #63  <Class XMPException>
	//   29   51:dup             
	//   30   52:ldc2            #469 <String "Specified property does not exist">
	//   31   55:bipush          102
	//   32   57:invokespecial   #95  <Method void XMPException(String, int)>
	//   33   60:athrow          
		}
	}

	public void setPropertyBase64(String s, String s1, byte abyte0[])
		throws XMPException
	{
		setProperty(s, s1, ((Object) (abyte0)), ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    6    8:return          
	}

	public void setPropertyBase64(String s, String s1, byte abyte0[], PropertyOptions propertyoptions)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (abyte0)), propertyoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    6    9:return          
	}

	public void setPropertyBoolean(String s, String s1, boolean flag)
		throws XMPException
	{
		String s2;
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            19
			s2 = "True";
	//    2    4:ldc2            #476 <String "True">
	//    3    7:astore          4
		else
	//*   4    9:aload_0         
	//*   5   10:aload_1         
	//*   6   11:aload_2         
	//*   7   12:aload           4
	//*   8   14:aconst_null     
	//*   9   15:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//*  10   18:return          
			s2 = "False";
	//   11   19:ldc2            #478 <String "False">
	//   12   22:astore          4
		setProperty(s, s1, ((Object) (s2)), ((PropertyOptions) (null)));
	//*  13   24:goto            9
	}

	public void setPropertyBoolean(String s, String s1, boolean flag, PropertyOptions propertyoptions)
		throws XMPException
	{
		String s2;
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            20
			s2 = "True";
	//    2    4:ldc2            #476 <String "True">
	//    3    7:astore          5
		else
	//*   4    9:aload_0         
	//*   5   10:aload_1         
	//*   6   11:aload_2         
	//*   7   12:aload           5
	//*   8   14:aload           4
	//*   9   16:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//*  10   19:return          
			s2 = "False";
	//   11   20:ldc2            #478 <String "False">
	//   12   23:astore          5
		setProperty(s, s1, ((Object) (s2)), propertyoptions);
	//*  13   25:goto            9
	}

	public void setPropertyCalendar(String s, String s1, Calendar calendar)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (calendar)), ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    6    8:return          
	}

	public void setPropertyCalendar(String s, String s1, Calendar calendar, PropertyOptions propertyoptions)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (calendar)), propertyoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    6    9:return          
	}

	public void setPropertyDate(String s, String s1, XMPDateTime xmpdatetime)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (xmpdatetime)), ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    6    8:return          
	}

	public void setPropertyDate(String s, String s1, XMPDateTime xmpdatetime, PropertyOptions propertyoptions)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (xmpdatetime)), propertyoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    6    9:return          
	}

	public void setPropertyDouble(String s, String s1, double d)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (new Double(d))), ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #141 <Class Double>
	//    4    6:dup             
	//    5    7:dload_3         
	//    6    8:invokespecial   #148 <Method void Double(double)>
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    9   15:return          
	}

	public void setPropertyDouble(String s, String s1, double d, PropertyOptions propertyoptions)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (new Double(d))), propertyoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #141 <Class Double>
	//    4    6:dup             
	//    5    7:dload_3         
	//    6    8:invokespecial   #148 <Method void Double(double)>
	//    7   11:aload           5
	//    8   13:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    9   16:return          
	}

	public void setPropertyInteger(String s, String s1, int i)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (new Integer(i))), ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #124 <Class Integer>
	//    4    6:dup             
	//    5    7:iload_3         
	//    6    8:invokespecial   #130 <Method void Integer(int)>
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    9   15:return          
	}

	public void setPropertyInteger(String s, String s1, int i, PropertyOptions propertyoptions)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (new Integer(i))), propertyoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #124 <Class Integer>
	//    4    6:dup             
	//    5    7:iload_3         
	//    6    8:invokespecial   #130 <Method void Integer(int)>
	//    7   11:aload           4
	//    8   13:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    9   16:return          
	}

	public void setPropertyLong(String s, String s1, long l)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (new Long(l))), ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #132 <Class Long>
	//    4    6:dup             
	//    5    7:lload_3         
	//    6    8:invokespecial   #139 <Method void Long(long)>
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    9   15:return          
	}

	public void setPropertyLong(String s, String s1, long l, PropertyOptions propertyoptions)
		throws XMPException
	{
		setProperty(s, s1, ((Object) (new Long(l))), propertyoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #132 <Class Long>
	//    4    6:dup             
	//    5    7:lload_3         
	//    6    8:invokespecial   #139 <Method void Long(long)>
	//    7   11:aload           5
	//    8   13:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//    9   16:return          
	}

	public void setQualifier(String s, String s1, String s2, String s3, String s4)
		throws XMPException
	{
		setQualifier(s, s1, s2, s3, s4, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #496 <Method void setQualifier(String, String, String, String, String, PropertyOptions)>
	//    8   12:return          
	}

	public void setQualifier(String s, String s1, String s2, String s3, String s4, PropertyOptions propertyoptions)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertPropName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #228 <Method void ParameterAsserts.assertPropName(String)>
		if(!doesPropertyExist(s, s1))
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #260 <Method boolean doesPropertyExist(String, String)>
	//*   8   14:ifne            30
		{
			throw new XMPException("Specified property does not exist!", 102);
	//    9   17:new             #63  <Class XMPException>
	//   10   20:dup             
	//   11   21:ldc2            #498 <String "Specified property does not exist!">
	//   12   24:bipush          102
	//   13   26:invokespecial   #95  <Method void XMPException(String, int)>
	//   14   29:athrow          
		} else
		{
			setProperty(s, (new StringBuilder()).append(s1).append(XMPPathFactory.composeQualifierPath(s2, s3)).toString(), ((Object) (s4)), propertyoptions);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:new             #235 <Class StringBuilder>
	//   18   35:dup             
	//   19   36:invokespecial   #236 <Method void StringBuilder()>
	//   20   39:aload_2         
	//   21   40:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:aload_3         
	//   23   44:aload           4
	//   24   46:invokestatic    #244 <Method String XMPPathFactory.composeQualifierPath(String, String)>
	//   25   49:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   27   55:aload           5
	//   28   57:aload           6
	//   29   59:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
			return;
	//   30   62:return          
		}
	}

	public void setStructField(String s, String s1, String s2, String s3, String s4)
		throws XMPException
	{
		setStructField(s, s1, s2, s3, s4, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:invokevirtual   #501 <Method void setStructField(String, String, String, String, String, PropertyOptions)>
	//    8   12:return          
	}

	public void setStructField(String s, String s1, String s2, String s3, String s4, PropertyOptions propertyoptions)
		throws XMPException
	{
		ParameterAsserts.assertSchemaNS(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method void ParameterAsserts.assertSchemaNS(String)>
		ParameterAsserts.assertStructName(s1);
	//    2    4:aload_2         
	//    3    5:invokestatic    #251 <Method void ParameterAsserts.assertStructName(String)>
		setProperty(s, (new StringBuilder()).append(s1).append(XMPPathFactory.composeStructFieldPath(s2, s3)).toString(), ((Object) (s4)), propertyoptions);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:new             #235 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #236 <Method void StringBuilder()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_3         
	//   12   22:aload           4
	//   13   24:invokestatic    #254 <Method String XMPPathFactory.composeStructFieldPath(String, String)>
	//   14   27:invokevirtual   #240 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   16   33:aload           5
	//   17   35:aload           6
	//   18   37:invokevirtual   #467 <Method void setProperty(String, String, Object, PropertyOptions)>
	//   19   40:return          
	}

	public void sort()
	{
		tree.sort();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field XMPNode tree>
	//    2    4:invokevirtual   #504 <Method void XMPNode.sort()>
	//    3    7:return          
	}

	static final boolean $assertionsDisabled;
	private static final int VALUE_BASE64 = 7;
	private static final int VALUE_BOOLEAN = 1;
	private static final int VALUE_CALENDAR = 6;
	private static final int VALUE_DATE = 5;
	private static final int VALUE_DOUBLE = 4;
	private static final int VALUE_INTEGER = 2;
	private static final int VALUE_LONG = 3;
	private static final int VALUE_STRING = 0;
	private String packetHeader;
	private XMPNode tree;

	static 
	{
		boolean flag;
		if(!((Class) (com/itextpdf/xmp/impl/XMPMetaImpl)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class XMPMetaImpl>
	//*   1    2:invokevirtual   #43  <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #45  <Field boolean $assertionsDisabled>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		$assertionsDisabled = flag;
	//*  10   17:goto            10
	}
}
