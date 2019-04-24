// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.options.SerializeOptions;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.xmp.impl:
//			CountOutputStream, Utils, XMPNode, QName, 
//			XMPNodeUtils, XMPMetaImpl

public class XMPSerializerRDF
{

	public XMPSerializerRDF()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
		unicodeSize = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #87  <Field int unicodeSize>
	//    5    9:return          
	}

	private void addPadding(int i)
		throws XMPException, IOException
	{
		if(options.getExactPacketLength())
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field SerializeOptions options>
	//*   2    4:invokevirtual   #101 <Method boolean SerializeOptions.getExactPacketLength()>
	//*   3    7:ifeq            55
		{
			i = outputStream.getBytesWritten() + unicodeSize * i;
	//    4   10:aload_0         
	//    5   11:getfield        #103 <Field CountOutputStream outputStream>
	//    6   14:invokevirtual   #109 <Method int CountOutputStream.getBytesWritten()>
	//    7   17:aload_0         
	//    8   18:getfield        #87  <Field int unicodeSize>
	//    9   21:iload_1         
	//   10   22:imul            
	//   11   23:iadd            
	//   12   24:istore_1        
			if(i > padding)
	//*  13   25:iload_1         
	//*  14   26:aload_0         
	//*  15   27:getfield        #111 <Field int padding>
	//*  16   30:icmple          45
				throw new XMPException("Can't fit into specified packet size", 107);
	//   17   33:new             #91  <Class XMPException>
	//   18   36:dup             
	//   19   37:ldc1            #113 <String "Can't fit into specified packet size">
	//   20   39:bipush          107
	//   21   41:invokespecial   #116 <Method void XMPException(String, int)>
	//   22   44:athrow          
			padding = padding - i;
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #111 <Field int padding>
	//   26   50:iload_1         
	//   27   51:isub            
	//   28   52:putfield        #111 <Field int padding>
		}
		padding = padding / unicodeSize;
	//   29   55:aload_0         
	//   30   56:aload_0         
	//   31   57:getfield        #111 <Field int padding>
	//   32   60:aload_0         
	//   33   61:getfield        #87  <Field int unicodeSize>
	//   34   64:idiv            
	//   35   65:putfield        #111 <Field int padding>
		i = options.getNewline().length();
	//   36   68:aload_0         
	//   37   69:getfield        #95  <Field SerializeOptions options>
	//   38   72:invokevirtual   #120 <Method String SerializeOptions.getNewline()>
	//   39   75:invokevirtual   #123 <Method int String.length()>
	//   40   78:istore_1        
		if(padding >= i)
	//*  41   79:aload_0         
	//*  42   80:getfield        #111 <Field int padding>
	//*  43   83:iload_1         
	//*  44   84:icmplt          151
		{
			for(padding = padding - i; padding >= i + 100; padding = padding - (i + 100))
	//*  45   87:aload_0         
	//*  46   88:aload_0         
	//*  47   89:getfield        #111 <Field int padding>
	//*  48   92:iload_1         
	//*  49   93:isub            
	//*  50   94:putfield        #111 <Field int padding>
	//*  51   97:aload_0         
	//*  52   98:getfield        #111 <Field int padding>
	//*  53  101:iload_1         
	//*  54  102:bipush          100
	//*  55  104:iadd            
	//*  56  105:icmplt          136
			{
				writeChars(100, ' ');
	//   57  108:aload_0         
	//   58  109:bipush          100
	//   59  111:bipush          32
	//   60  113:invokespecial   #127 <Method void writeChars(int, char)>
				writeNewline();
	//   61  116:aload_0         
	//   62  117:invokespecial   #130 <Method void writeNewline()>
			}

	//   63  120:aload_0         
	//   64  121:aload_0         
	//   65  122:getfield        #111 <Field int padding>
	//   66  125:iload_1         
	//   67  126:bipush          100
	//   68  128:iadd            
	//   69  129:isub            
	//   70  130:putfield        #111 <Field int padding>
	//*  71  133:goto            97
			writeChars(padding, ' ');
	//   72  136:aload_0         
	//   73  137:aload_0         
	//   74  138:getfield        #111 <Field int padding>
	//   75  141:bipush          32
	//   76  143:invokespecial   #127 <Method void writeChars(int, char)>
			writeNewline();
	//   77  146:aload_0         
	//   78  147:invokespecial   #130 <Method void writeNewline()>
			return;
	//   79  150:return          
		} else
		{
			writeChars(padding, ' ');
	//   80  151:aload_0         
	//   81  152:aload_0         
	//   82  153:getfield        #111 <Field int padding>
	//   83  156:bipush          32
	//   84  158:invokespecial   #127 <Method void writeChars(int, char)>
			return;
	//   85  161:return          
		}
	}

	private void appendNodeValue(String s, boolean flag)
		throws IOException
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
			s1 = "";
	//    4    6:ldc1            #135 <String "">
	//    5    8:astore_3        
		write(Utils.escapeXML(s1, flag, true));
	//    6    9:aload_0         
	//    7   10:aload_3         
	//    8   11:iload_2         
	//    9   12:iconst_1        
	//   10   13:invokestatic    #141 <Method String Utils.escapeXML(String, boolean, boolean)>
	//   11   16:invokespecial   #145 <Method void write(String)>
	//   12   19:return          
	}

	private boolean canBeRDFAttrProp(XMPNode xmpnode)
	{
		return !xmpnode.hasQualifier() && !xmpnode.getOptions().isURI() && !xmpnode.getOptions().isCompositeProperty() && !xmpnode.getOptions().containsOneOf(0x40000000) && !"[]".equals(((Object) (xmpnode.getName())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #152 <Method boolean XMPNode.hasQualifier()>
	//    2    4:ifne            53
	//    3    7:aload_1         
	//    4    8:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//    5   11:invokevirtual   #161 <Method boolean PropertyOptions.isURI()>
	//    6   14:ifne            53
	//    7   17:aload_1         
	//    8   18:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//    9   21:invokevirtual   #164 <Method boolean PropertyOptions.isCompositeProperty()>
	//   10   24:ifne            53
	//   11   27:aload_1         
	//   12   28:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//   13   31:ldc1            #165 <Int 0x40000000>
	//   14   33:invokevirtual   #169 <Method boolean PropertyOptions.containsOneOf(int)>
	//   15   36:ifne            53
	//   16   39:ldc1            #171 <String "[]">
	//   17   41:aload_1         
	//   18   42:invokevirtual   #174 <Method String XMPNode.getName()>
	//   19   45:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   20   48:ifne            53
	//   21   51:iconst_1        
	//   22   52:ireturn         
	//   23   53:iconst_0        
	//   24   54:ireturn         
	}

	private void declareNamespace(String s, String s1, Set set, int i)
		throws IOException
	{
label0:
		{
			String s3 = s;
	//    0    0:aload_1         
	//    1    1:astore          6
			String s2 = s1;
	//    2    3:aload_2         
	//    3    4:astore          5
			if(s1 == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       73
			{
				s = ((String) (new QName(s)));
	//    6   10:new             #182 <Class QName>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #184 <Method void QName(String)>
	//   10   18:astore_1        
				if(!((QName) (s)).hasPrefix())
					break label0;
	//   11   19:aload_1         
	//   12   20:invokevirtual   #187 <Method boolean QName.hasPrefix()>
	//   13   23:ifeq            133
				s3 = ((QName) (s)).getPrefix();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #190 <Method String QName.getPrefix()>
	//   16   30:astore          6
				s2 = XMPMetaFactory.getSchemaRegistry().getNamespaceURI((new StringBuilder()).append(s3).append(":").toString());
	//   17   32:invokestatic    #196 <Method XMPSchemaRegistry XMPMetaFactory.getSchemaRegistry()>
	//   18   35:new             #198 <Class StringBuilder>
	//   19   38:dup             
	//   20   39:invokespecial   #199 <Method void StringBuilder()>
	//   21   42:aload           6
	//   22   44:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:ldc1            #205 <String ":">
	//   24   49:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//   25   52:invokevirtual   #208 <Method String StringBuilder.toString()>
	//   26   55:invokeinterface #214 <Method String XMPSchemaRegistry.getNamespaceURI(String)>
	//   27   60:astore          5
				declareNamespace(s3, s2, set, i);
	//   28   62:aload_0         
	//   29   63:aload           6
	//   30   65:aload           5
	//   31   67:aload_3         
	//   32   68:iload           4
	//   33   70:invokespecial   #216 <Method void declareNamespace(String, String, Set, int)>
			}
			if(!set.contains(((Object) (s3))))
	//*  34   73:aload_3         
	//*  35   74:aload           6
	//*  36   76:invokeinterface #221 <Method boolean Set.contains(Object)>
	//*  37   81:ifne            133
			{
				writeNewline();
	//   38   84:aload_0         
	//   39   85:invokespecial   #130 <Method void writeNewline()>
				writeIndent(i);
	//   40   88:aload_0         
	//   41   89:iload           4
	//   42   91:invokespecial   #224 <Method void writeIndent(int)>
				write("xmlns:");
	//   43   94:aload_0         
	//   44   95:ldc1            #226 <String "xmlns:">
	//   45   97:invokespecial   #145 <Method void write(String)>
				write(s3);
	//   46  100:aload_0         
	//   47  101:aload           6
	//   48  103:invokespecial   #145 <Method void write(String)>
				write("=\"");
	//   49  106:aload_0         
	//   50  107:ldc1            #228 <String "=\"">
	//   51  109:invokespecial   #145 <Method void write(String)>
				write(s2);
	//   52  112:aload_0         
	//   53  113:aload           5
	//   54  115:invokespecial   #145 <Method void write(String)>
				write(34);
	//   55  118:aload_0         
	//   56  119:bipush          34
	//   57  121:invokespecial   #230 <Method void write(int)>
				set.add(((Object) (s3)));
	//   58  124:aload_3         
	//   59  125:aload           6
	//   60  127:invokeinterface #233 <Method boolean Set.add(Object)>
	//   61  132:pop             
			}
		}
	//   62  133:return          
	}

	private void declareUsedNamespaces(XMPNode xmpnode, Set set, int i)
		throws IOException
	{
		if(!xmpnode.getOptions().isSchemaNode()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//    2    4:invokevirtual   #238 <Method boolean PropertyOptions.isSchemaNode()>
	//    3    7:ifeq            72
_L1:
		declareNamespace(xmpnode.getValue().substring(0, xmpnode.getValue().length() - 1), xmpnode.getName(), set, i);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #241 <Method String XMPNode.getValue()>
	//    7   15:iconst_0        
	//    8   16:aload_1         
	//    9   17:invokevirtual   #241 <Method String XMPNode.getValue()>
	//   10   20:invokevirtual   #123 <Method int String.length()>
	//   11   23:iconst_1        
	//   12   24:isub            
	//   13   25:invokevirtual   #245 <Method String String.substring(int, int)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #174 <Method String XMPNode.getName()>
	//   16   32:aload_2         
	//   17   33:iload_3         
	//   18   34:invokespecial   #216 <Method void declareNamespace(String, String, Set, int)>
_L4:
		for(Iterator iterator = xmpnode.iterateChildren(); iterator.hasNext(); declareUsedNamespaces((XMPNode)iterator.next(), set, i));
	//   19   37:aload_1         
	//   20   38:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//   21   41:astore          4
	//   22   43:aload           4
	//   23   45:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//   24   50:ifeq            121
	//   25   53:aload_0         
	//   26   54:aload           4
	//   27   56:invokeinterface #258 <Method Object Iterator.next()>
	//   28   61:checkcast       #149 <Class XMPNode>
	//   29   64:aload_2         
	//   30   65:iload_3         
	//   31   66:invokespecial   #260 <Method void declareUsedNamespaces(XMPNode, Set, int)>
		break; /* Loop/switch isn't completed */
	//   32   69:goto            43
_L2:
		if(xmpnode.getOptions().isStruct())
	//*  33   72:aload_1         
	//*  34   73:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//*  35   76:invokevirtual   #263 <Method boolean PropertyOptions.isStruct()>
	//*  36   79:ifeq            37
		{
			Iterator iterator1 = xmpnode.iterateChildren();
	//   37   82:aload_1         
	//   38   83:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//   39   86:astore          4
			while(iterator1.hasNext()) 
	//*  40   88:aload           4
	//*  41   90:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//*  42   95:ifeq            37
				declareNamespace(((XMPNode)iterator1.next()).getName(), ((String) (null)), set, i);
	//   43   98:aload_0         
	//   44   99:aload           4
	//   45  101:invokeinterface #258 <Method Object Iterator.next()>
	//   46  106:checkcast       #149 <Class XMPNode>
	//   47  109:invokevirtual   #174 <Method String XMPNode.getName()>
	//   48  112:aconst_null     
	//   49  113:aload_2         
	//   50  114:iload_3         
	//   51  115:invokespecial   #216 <Method void declareNamespace(String, String, Set, int)>
		}
		if(true) goto _L4; else goto _L3
	//   52  118:goto            88
_L3:
		XMPNode xmpnode1;
		for(xmpnode = ((XMPNode) (xmpnode.iterateQualifier())); ((Iterator) (xmpnode)).hasNext(); declareUsedNamespaces(xmpnode1, set, i))
	//*  53  121:aload_1         
	//*  54  122:invokevirtual   #266 <Method Iterator XMPNode.iterateQualifier()>
	//*  55  125:astore_1        
	//*  56  126:aload_1         
	//*  57  127:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//*  58  132:ifeq            169
		{
			xmpnode1 = (XMPNode)((Iterator) (xmpnode)).next();
	//   59  135:aload_1         
	//   60  136:invokeinterface #258 <Method Object Iterator.next()>
	//   61  141:checkcast       #149 <Class XMPNode>
	//   62  144:astore          4
			declareNamespace(xmpnode1.getName(), ((String) (null)), set, i);
	//   63  146:aload_0         
	//   64  147:aload           4
	//   65  149:invokevirtual   #174 <Method String XMPNode.getName()>
	//   66  152:aconst_null     
	//   67  153:aload_2         
	//   68  154:iload_3         
	//   69  155:invokespecial   #216 <Method void declareNamespace(String, String, Set, int)>
		}

	//   70  158:aload_0         
	//   71  159:aload           4
	//   72  161:aload_2         
	//   73  162:iload_3         
	//   74  163:invokespecial   #260 <Method void declareUsedNamespaces(XMPNode, Set, int)>
	//*  75  166:goto            126
		return;
	//   76  169:return          
	}

	private void emitRDFArrayTag(XMPNode xmpnode, boolean flag, int i)
		throws IOException
	{
		if(flag || xmpnode.hasChildren())
	//*   0    0:iload_2         
	//*   1    1:ifne            11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #271 <Method boolean XMPNode.hasChildren()>
	//*   4    8:ifeq            70
		{
			writeIndent(i);
	//    5   11:aload_0         
	//    6   12:iload_3         
	//    7   13:invokespecial   #224 <Method void writeIndent(int)>
			String s;
			if(flag)
	//*   8   16:iload_2         
	//*   9   17:ifeq            71
				s = "<rdf:";
	//   10   20:ldc2            #273 <String "<rdf:">
	//   11   23:astore          4
			else
	//*  12   25:aload_0         
	//*  13   26:aload           4
	//*  14   28:invokespecial   #145 <Method void write(String)>
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//*  17   35:invokevirtual   #276 <Method boolean PropertyOptions.isArrayAlternate()>
	//*  18   38:ifeq            79
	//*  19   41:aload_0         
	//*  20   42:ldc2            #278 <String "Alt">
	//*  21   45:invokespecial   #145 <Method void write(String)>
	//*  22   48:iload_2         
	//*  23   49:ifeq            109
	//*  24   52:aload_1         
	//*  25   53:invokevirtual   #271 <Method boolean XMPNode.hasChildren()>
	//*  26   56:ifne            109
	//*  27   59:aload_0         
	//*  28   60:ldc2            #280 <String "/>">
	//*  29   63:invokespecial   #145 <Method void write(String)>
	//*  30   66:aload_0         
	//*  31   67:invokespecial   #130 <Method void writeNewline()>
	//*  32   70:return          
				s = "</rdf:";
	//   33   71:ldc2            #282 <String "</rdf:">
	//   34   74:astore          4
			write(s);
			if(xmpnode.getOptions().isArrayAlternate())
				write("Alt");
			else
	//*  35   76:goto            25
			if(xmpnode.getOptions().isArrayOrdered())
	//*  36   79:aload_1         
	//*  37   80:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//*  38   83:invokevirtual   #285 <Method boolean PropertyOptions.isArrayOrdered()>
	//*  39   86:ifeq            99
				write("Seq");
	//   40   89:aload_0         
	//   41   90:ldc2            #287 <String "Seq">
	//   42   93:invokespecial   #145 <Method void write(String)>
			else
	//*  43   96:goto            48
				write("Bag");
	//   44   99:aload_0         
	//   45  100:ldc2            #289 <String "Bag">
	//   46  103:invokespecial   #145 <Method void write(String)>
			if(flag && !xmpnode.hasChildren())
				write("/>");
			else
	//*  47  106:goto            48
				write(">");
	//   48  109:aload_0         
	//   49  110:ldc2            #291 <String ">">
	//   50  113:invokespecial   #145 <Method void write(String)>
			writeNewline();
		}
	//*  51  116:goto            66
	}

	private void endOuterRDFDescription(int i)
		throws IOException
	{
		writeIndent(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #224 <Method void writeIndent(int)>
		write("</rdf:Description>");
	//    5    7:aload_0         
	//    6    8:ldc1            #31  <String "</rdf:Description>">
	//    7   10:invokespecial   #145 <Method void write(String)>
		writeNewline();
	//    8   13:aload_0         
	//    9   14:invokespecial   #130 <Method void writeNewline()>
	//   10   17:return          
	}

	private String serializeAsRDF()
		throws IOException, XMPException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(!options.getOmitPacketWrapper())
	//*   2    2:aload_0         
	//*   3    3:getfield        #95  <Field SerializeOptions options>
	//*   4    6:invokevirtual   #296 <Method boolean SerializeOptions.getOmitPacketWrapper()>
	//*   5    9:ifne            27
		{
			writeIndent(0);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokespecial   #224 <Method void writeIndent(int)>
			write("<?xpacket begin=\"\uFEFF\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>");
	//    9   17:aload_0         
	//   10   18:ldc1            #11  <String "<?xpacket begin=\"\uFEFF\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>">
	//   11   20:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//   12   23:aload_0         
	//   13   24:invokespecial   #130 <Method void writeNewline()>
		}
		if(!options.getOmitXmpMetaElement())
	//*  14   27:aload_0         
	//*  15   28:getfield        #95  <Field SerializeOptions options>
	//*  16   31:invokevirtual   #299 <Method boolean SerializeOptions.getOmitXmpMetaElement()>
	//*  17   34:ifne            85
		{
			writeIndent(0);
	//   18   37:aload_0         
	//   19   38:iconst_0        
	//   20   39:invokespecial   #224 <Method void writeIndent(int)>
			write("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"");
	//   21   42:aload_0         
	//   22   43:ldc1            #44  <String "<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"">
	//   23   45:invokespecial   #145 <Method void write(String)>
			if(!options.getOmitVersionAttribute())
	//*  24   48:aload_0         
	//*  25   49:getfield        #95  <Field SerializeOptions options>
	//*  26   52:invokevirtual   #302 <Method boolean SerializeOptions.getOmitVersionAttribute()>
	//*  27   55:ifne            70
				write(XMPMetaFactory.getVersionInfo().getMessage());
	//   28   58:aload_0         
	//   29   59:invokestatic    #306 <Method XMPVersionInfo XMPMetaFactory.getVersionInfo()>
	//   30   62:invokeinterface #311 <Method String XMPVersionInfo.getMessage()>
	//   31   67:invokespecial   #145 <Method void write(String)>
			write("\">");
	//   32   70:aload_0         
	//   33   71:ldc2            #313 <String "\">">
	//   34   74:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//   35   77:aload_0         
	//   36   78:invokespecial   #130 <Method void writeNewline()>
			i = 0 + 1;
	//   37   81:iconst_0        
	//   38   82:iconst_1        
	//   39   83:iadd            
	//   40   84:istore_2        
		}
		writeIndent(i);
	//   41   85:aload_0         
	//   42   86:iload_2         
	//   43   87:invokespecial   #224 <Method void writeIndent(int)>
		write("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">");
	//   44   90:aload_0         
	//   45   91:ldc1            #28  <String "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">">
	//   46   93:invokespecial   #145 <Method void write(String)>
		writeNewline();
	//   47   96:aload_0         
	//   48   97:invokespecial   #130 <Method void writeNewline()>
		Object obj;
		String s;
		if(options.getUseCanonicalFormat())
	//*  49  100:aload_0         
	//*  50  101:getfield        #95  <Field SerializeOptions options>
	//*  51  104:invokevirtual   #316 <Method boolean SerializeOptions.getUseCanonicalFormat()>
	//*  52  107:ifeq            217
			serializeCanonicalRDFSchemas(i);
	//   53  110:aload_0         
	//   54  111:iload_2         
	//   55  112:invokespecial   #319 <Method void serializeCanonicalRDFSchemas(int)>
		else
	//*  56  115:aload_0         
	//*  57  116:iload_2         
	//*  58  117:invokespecial   #224 <Method void writeIndent(int)>
	//*  59  120:aload_0         
	//*  60  121:ldc1            #25  <String "</rdf:RDF>">
	//*  61  123:invokespecial   #145 <Method void write(String)>
	//*  62  126:aload_0         
	//*  63  127:invokespecial   #130 <Method void writeNewline()>
	//*  64  130:aload_0         
	//*  65  131:getfield        #95  <Field SerializeOptions options>
	//*  66  134:invokevirtual   #299 <Method boolean SerializeOptions.getOmitXmpMetaElement()>
	//*  67  137:ifne            157
	//*  68  140:aload_0         
	//*  69  141:iload_2         
	//*  70  142:iconst_1        
	//*  71  143:isub            
	//*  72  144:invokespecial   #224 <Method void writeIndent(int)>
	//*  73  147:aload_0         
	//*  74  148:ldc1            #41  <String "</x:xmpmeta>">
	//*  75  150:invokespecial   #145 <Method void write(String)>
	//*  76  153:aload_0         
	//*  77  154:invokespecial   #130 <Method void writeNewline()>
	//*  78  157:ldc1            #135 <String "">
	//*  79  159:astore_3        
	//*  80  160:aload_3         
	//*  81  161:astore          4
	//*  82  163:aload_0         
	//*  83  164:getfield        #95  <Field SerializeOptions options>
	//*  84  167:invokevirtual   #296 <Method boolean SerializeOptions.getOmitPacketWrapper()>
	//*  85  170:ifne            300
	//*  86  173:aload_0         
	//*  87  174:getfield        #95  <Field SerializeOptions options>
	//*  88  177:invokevirtual   #322 <Method int SerializeOptions.getBaseIndent()>
	//*  89  180:istore_2        
	//*  90  181:iload_2         
	//*  91  182:ifle            225
	//*  92  185:new             #198 <Class StringBuilder>
	//*  93  188:dup             
	//*  94  189:invokespecial   #199 <Method void StringBuilder()>
	//*  95  192:aload_3         
	//*  96  193:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//*  97  196:aload_0         
	//*  98  197:getfield        #95  <Field SerializeOptions options>
	//*  99  200:invokevirtual   #325 <Method String SerializeOptions.getIndent()>
	//* 100  203:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//* 101  206:invokevirtual   #208 <Method String StringBuilder.toString()>
	//* 102  209:astore_3        
	//* 103  210:iload_2         
	//* 104  211:iconst_1        
	//* 105  212:isub            
	//* 106  213:istore_2        
	//* 107  214:goto            181
			serializeCompactRDFSchemas(i);
	//  108  217:aload_0         
	//  109  218:iload_2         
	//  110  219:invokespecial   #328 <Method void serializeCompactRDFSchemas(int)>
		writeIndent(i);
		write("</rdf:RDF>");
		writeNewline();
		if(!options.getOmitXmpMetaElement())
		{
			writeIndent(i - 1);
			write("</x:xmpmeta>");
			writeNewline();
		}
		obj = "";
		s = ((String) (obj));
		if(!options.getOmitPacketWrapper())
		{
			for(i = options.getBaseIndent(); i > 0; i--)
				obj = ((Object) ((new StringBuilder()).append(((String) (obj))).append(options.getIndent()).toString()));

	//* 111  222:goto            115
			obj = ((Object) ((new StringBuilder()).append(((String) (obj))).append("<?xpacket end=\"").toString()));
	//  112  225:new             #198 <Class StringBuilder>
	//  113  228:dup             
	//  114  229:invokespecial   #199 <Method void StringBuilder()>
	//  115  232:aload_3         
	//  116  233:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//  117  236:ldc1            #14  <String "<?xpacket end=\"">
	//  118  238:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//  119  241:invokevirtual   #208 <Method String StringBuilder.toString()>
	//  120  244:astore_3        
			obj = ((Object) ((new StringBuilder()).append(((String) (obj)))));
	//  121  245:new             #198 <Class StringBuilder>
	//  122  248:dup             
	//  123  249:invokespecial   #199 <Method void StringBuilder()>
	//  124  252:aload_3         
	//  125  253:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//  126  256:astore_3        
			char c;
			if(options.getReadOnlyPacket())
	//* 127  257:aload_0         
	//* 128  258:getfield        #95  <Field SerializeOptions options>
	//* 129  261:invokevirtual   #331 <Method boolean SerializeOptions.getReadOnlyPacket()>
	//* 130  264:ifeq            303
				c = 'r';
	//  131  267:bipush          114
	//  132  269:istore_1        
			else
	//* 133  270:aload_3         
	//* 134  271:iload_1         
	//* 135  272:invokevirtual   #334 <Method StringBuilder StringBuilder.append(char)>
	//* 136  275:invokevirtual   #208 <Method String StringBuilder.toString()>
	//* 137  278:astore_3        
	//* 138  279:new             #198 <Class StringBuilder>
	//* 139  282:dup             
	//* 140  283:invokespecial   #199 <Method void StringBuilder()>
	//* 141  286:aload_3         
	//* 142  287:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//* 143  290:ldc1            #17  <String "\"?>">
	//* 144  292:invokevirtual   #203 <Method StringBuilder StringBuilder.append(String)>
	//* 145  295:invokevirtual   #208 <Method String StringBuilder.toString()>
	//* 146  298:astore          4
	//* 147  300:aload           4
	//* 148  302:areturn         
				c = 'w';
	//  149  303:bipush          119
	//  150  305:istore_1        
			obj = ((Object) (((StringBuilder) (obj)).append(c).toString()));
			s = (new StringBuilder()).append(((String) (obj))).append("\"?>").toString();
		}
		return s;
	//* 151  306:goto            270
	}

	private void serializeCanonicalRDFProperty(XMPNode xmpnode, boolean flag, boolean flag1, int i)
		throws IOException, XMPException
	{
		int k;
		boolean flag3;
		boolean flag4;
		Object obj1;
		k = 1;
	//    0    0:iconst_1        
	//    1    1:istore          6
		flag4 = true;
	//    2    3:iconst_1        
	//    3    4:istore          9
		flag3 = true;
	//    4    6:iconst_1        
	//    5    7:istore          8
		obj1 = ((Object) (xmpnode.getName()));
	//    6    9:aload_1         
	//    7   10:invokevirtual   #174 <Method String XMPNode.getName()>
	//    8   13:astore          13
		if(!flag1) goto _L2; else goto _L1
	//    9   15:iload_3         
	//   10   16:ifeq            98
_L1:
		Object obj = "rdf:value";
	//   11   19:ldc2            #338 <String "rdf:value">
	//   12   22:astore          12
_L10:
		int j;
		boolean flag5;
		writeIndent(i);
	//   13   24:aload_0         
	//   14   25:iload           4
	//   15   27:invokespecial   #224 <Method void writeIndent(int)>
		write(60);
	//   16   30:aload_0         
	//   17   31:bipush          60
	//   18   33:invokespecial   #230 <Method void write(int)>
		write(((String) (obj)));
	//   19   36:aload_0         
	//   20   37:aload           12
	//   21   39:invokespecial   #145 <Method void write(String)>
		j = 0;
	//   22   42:iconst_0        
	//   23   43:istore          5
		flag5 = false;
	//   24   45:iconst_0        
	//   25   46:istore          10
		obj1 = ((Object) (xmpnode.iterateQualifier()));
	//   26   48:aload_1         
	//   27   49:invokevirtual   #266 <Method Iterator XMPNode.iterateQualifier()>
	//   28   52:astore          13
_L4:
		if(!((Iterator) (obj1)).hasNext())
			break; /* Loop/switch isn't completed */
	//   29   54:aload           13
	//   30   56:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//   31   61:ifeq            184
		XMPNode xmpnode3 = (XMPNode)((Iterator) (obj1)).next();
	//   32   64:aload           13
	//   33   66:invokeinterface #258 <Method Object Iterator.next()>
	//   34   71:checkcast       #149 <Class XMPNode>
	//   35   74:astore          14
		if(!RDF_ATTR_QUALIFIER.contains(((Object) (xmpnode3.getName()))))
	//*  36   76:getstatic       #82  <Field Set RDF_ATTR_QUALIFIER>
	//*  37   79:aload           14
	//*  38   81:invokevirtual   #174 <Method String XMPNode.getName()>
	//*  39   84:invokeinterface #221 <Method boolean Set.contains(Object)>
	//*  40   89:ifne            120
		{
			j = 1;
	//   41   92:iconst_1        
	//   42   93:istore          5
		} else
	//*  43   95:goto            54
	//*  44   98:aload           13
	//*  45  100:astore          12
	//*  46  102:ldc1            #171 <String "[]">
	//*  47  104:aload           13
	//*  48  106:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*  49  109:ifeq            24
	//*  50  112:ldc2            #340 <String "rdf:li">
	//*  51  115:astore          12
	//*  52  117:goto            24
		{
			boolean flag6 = "rdf:resource".equals(((Object) (xmpnode3.getName())));
	//   53  120:ldc1            #64  <String "rdf:resource">
	//   54  122:aload           14
	//   55  124:invokevirtual   #174 <Method String XMPNode.getName()>
	//   56  127:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   57  130:istore          11
			flag5 = flag6;
	//   58  132:iload           11
	//   59  134:istore          10
			if(!flag1)
	//*  60  136:iload_3         
	//*  61  137:ifne            54
			{
				write(32);
	//   62  140:aload_0         
	//   63  141:bipush          32
	//   64  143:invokespecial   #230 <Method void write(int)>
				write(xmpnode3.getName());
	//   65  146:aload_0         
	//   66  147:aload           14
	//   67  149:invokevirtual   #174 <Method String XMPNode.getName()>
	//   68  152:invokespecial   #145 <Method void write(String)>
				write("=\"");
	//   69  155:aload_0         
	//   70  156:ldc1            #228 <String "=\"">
	//   71  158:invokespecial   #145 <Method void write(String)>
				appendNodeValue(xmpnode3.getValue(), true);
	//   72  161:aload_0         
	//   73  162:aload           14
	//   74  164:invokevirtual   #241 <Method String XMPNode.getValue()>
	//   75  167:iconst_1        
	//   76  168:invokespecial   #342 <Method void appendNodeValue(String, boolean)>
				write(34);
	//   77  171:aload_0         
	//   78  172:bipush          34
	//   79  174:invokespecial   #230 <Method void write(int)>
				flag5 = flag6;
	//   80  177:iload           11
	//   81  179:istore          10
			}
		}
		continue; /* Loop/switch isn't completed */
	//   82  181:goto            54
_L2:
		obj = obj1;
		if("[]".equals(obj1))
			obj = "rdf:li";
		continue; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L3
_L3:
		if(!j || flag1) goto _L6; else goto _L5
	//   83  184:iload           5
	//   84  186:ifeq            423
	//   85  189:iload_3         
	//   86  190:ifne            423
_L5:
		boolean flag2;
		if(flag5)
	//*  87  193:iload           10
	//*  88  195:ifeq            212
			throw new XMPException("Can't mix rdf:resource and general qualifiers", 202);
	//   89  198:new             #91  <Class XMPException>
	//   90  201:dup             
	//   91  202:ldc2            #344 <String "Can't mix rdf:resource and general qualifiers">
	//   92  205:sipush          202
	//   93  208:invokespecial   #116 <Method void XMPException(String, int)>
	//   94  211:athrow          
		if(flag)
	//*  95  212:iload_2         
	//*  96  213:ifeq            323
		{
			write(">");
	//   97  216:aload_0         
	//   98  217:ldc2            #291 <String ">">
	//   99  220:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//  100  223:aload_0         
	//  101  224:invokespecial   #130 <Method void writeNewline()>
			k = i + 1;
	//  102  227:iload           4
	//  103  229:iconst_1        
	//  104  230:iadd            
	//  105  231:istore          6
			writeIndent(k);
	//  106  233:aload_0         
	//  107  234:iload           6
	//  108  236:invokespecial   #224 <Method void writeIndent(int)>
			write("<rdf:Description");
	//  109  239:aload_0         
	//  110  240:ldc1            #38  <String "<rdf:Description">
	//  111  242:invokespecial   #145 <Method void write(String)>
			write(">");
	//  112  245:aload_0         
	//  113  246:ldc2            #291 <String ">">
	//  114  249:invokespecial   #145 <Method void write(String)>
		} else
	//* 115  252:aload_0         
	//* 116  253:invokespecial   #130 <Method void writeNewline()>
	//* 117  256:aload_0         
	//* 118  257:aload_1         
	//* 119  258:iload_2         
	//* 120  259:iconst_1        
	//* 121  260:iload           6
	//* 122  262:iconst_1        
	//* 123  263:iadd            
	//* 124  264:invokespecial   #346 <Method void serializeCanonicalRDFProperty(XMPNode, boolean, boolean, int)>
	//* 125  267:aload_1         
	//* 126  268:invokevirtual   #266 <Method Iterator XMPNode.iterateQualifier()>
	//* 127  271:astore_1        
	//* 128  272:aload_1         
	//* 129  273:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//* 130  278:ifeq            337
	//* 131  281:aload_1         
	//* 132  282:invokeinterface #258 <Method Object Iterator.next()>
	//* 133  287:checkcast       #149 <Class XMPNode>
	//* 134  290:astore          13
	//* 135  292:getstatic       #82  <Field Set RDF_ATTR_QUALIFIER>
	//* 136  295:aload           13
	//* 137  297:invokevirtual   #174 <Method String XMPNode.getName()>
	//* 138  300:invokeinterface #221 <Method boolean Set.contains(Object)>
	//* 139  305:ifne            272
	//* 140  308:aload_0         
	//* 141  309:aload           13
	//* 142  311:iload_2         
	//* 143  312:iconst_0        
	//* 144  313:iload           6
	//* 145  315:iconst_1        
	//* 146  316:iadd            
	//* 147  317:invokespecial   #346 <Method void serializeCanonicalRDFProperty(XMPNode, boolean, boolean, int)>
	//* 148  320:goto            272
		{
			write(" rdf:parseType=\"Resource\">");
	//  149  323:aload_0         
	//  150  324:ldc2            #348 <String " rdf:parseType=\"Resource\">">
	//  151  327:invokespecial   #145 <Method void write(String)>
			k = i;
	//  152  330:iload           4
	//  153  332:istore          6
		}
		writeNewline();
		serializeCanonicalRDFProperty(xmpnode, flag, true, k + 1);
		xmpnode = ((XMPNode) (xmpnode.iterateQualifier()));
		do
		{
			if(!((Iterator) (xmpnode)).hasNext())
				break;
			XMPNode xmpnode1 = (XMPNode)((Iterator) (xmpnode)).next();
			if(!RDF_ATTR_QUALIFIER.contains(((Object) (xmpnode1.getName()))))
				serializeCanonicalRDFProperty(xmpnode1, flag, false, k + 1);
		} while(true);
	//* 154  334:goto            252
		j = ((int) (flag4));
	//  155  337:iload           9
	//  156  339:istore          5
		flag2 = flag3;
	//  157  341:iload           8
	//  158  343:istore          7
		i = k;
	//  159  345:iload           6
	//  160  347:istore          4
		if(flag)
	//* 161  349:iload_2         
	//* 162  350:ifeq            383
		{
			writeIndent(k);
	//  163  353:aload_0         
	//  164  354:iload           6
	//  165  356:invokespecial   #224 <Method void writeIndent(int)>
			write("</rdf:Description>");
	//  166  359:aload_0         
	//  167  360:ldc1            #31  <String "</rdf:Description>">
	//  168  362:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//  169  365:aload_0         
	//  170  366:invokespecial   #130 <Method void writeNewline()>
			i = k - 1;
	//  171  369:iload           6
	//  172  371:iconst_1        
	//  173  372:isub            
	//  174  373:istore          4
			flag2 = flag3;
	//  175  375:iload           8
	//  176  377:istore          7
			j = ((int) (flag4));
	//  177  379:iload           9
	//  178  381:istore          5
		}
_L8:
		if(j != 0)
	//* 179  383:iload           5
	//* 180  385:ifeq            422
		{
			if(flag2)
	//* 181  388:iload           7
	//* 182  390:ifeq            399
				writeIndent(i);
	//  183  393:aload_0         
	//  184  394:iload           4
	//  185  396:invokespecial   #224 <Method void writeIndent(int)>
			write("</");
	//  186  399:aload_0         
	//  187  400:ldc2            #350 <String "</">
	//  188  403:invokespecial   #145 <Method void write(String)>
			write(((String) (obj)));
	//  189  406:aload_0         
	//  190  407:aload           12
	//  191  409:invokespecial   #145 <Method void write(String)>
			write(62);
	//  192  412:aload_0         
	//  193  413:bipush          62
	//  194  415:invokespecial   #230 <Method void write(int)>
			writeNewline();
	//  195  418:aload_0         
	//  196  419:invokespecial   #130 <Method void writeNewline()>
		}
		return;
	//  197  422:return          
_L6:
		if(!xmpnode.getOptions().isCompositeProperty())
	//* 198  423:aload_1         
	//* 199  424:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//* 200  427:invokevirtual   #164 <Method boolean PropertyOptions.isCompositeProperty()>
	//* 201  430:ifne            545
		{
			if(xmpnode.getOptions().isURI())
	//* 202  433:aload_1         
	//* 203  434:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//* 204  437:invokevirtual   #161 <Method boolean PropertyOptions.isURI()>
	//* 205  440:ifeq            480
			{
				write(" rdf:resource=\"");
	//  206  443:aload_0         
	//  207  444:ldc2            #352 <String " rdf:resource=\"">
	//  208  447:invokespecial   #145 <Method void write(String)>
				appendNodeValue(xmpnode.getValue(), true);
	//  209  450:aload_0         
	//  210  451:aload_1         
	//  211  452:invokevirtual   #241 <Method String XMPNode.getValue()>
	//  212  455:iconst_1        
	//  213  456:invokespecial   #342 <Method void appendNodeValue(String, boolean)>
				write("\"/>");
	//  214  459:aload_0         
	//  215  460:ldc2            #354 <String "\"/>">
	//  216  463:invokespecial   #145 <Method void write(String)>
				writeNewline();
	//  217  466:aload_0         
	//  218  467:invokespecial   #130 <Method void writeNewline()>
				j = 0;
	//  219  470:iconst_0        
	//  220  471:istore          5
				flag2 = flag3;
	//  221  473:iload           8
	//  222  475:istore          7
			} else
	//* 223  477:goto            383
			if(xmpnode.getValue() == null || "".equals(((Object) (xmpnode.getValue()))))
	//* 224  480:aload_1         
	//* 225  481:invokevirtual   #241 <Method String XMPNode.getValue()>
	//* 226  484:ifnull          499
	//* 227  487:ldc1            #135 <String "">
	//* 228  489:aload_1         
	//* 229  490:invokevirtual   #241 <Method String XMPNode.getValue()>
	//* 230  493:invokevirtual   #178 <Method boolean String.equals(Object)>
	//* 231  496:ifeq            520
			{
				write("/>");
	//  232  499:aload_0         
	//  233  500:ldc2            #280 <String "/>">
	//  234  503:invokespecial   #145 <Method void write(String)>
				writeNewline();
	//  235  506:aload_0         
	//  236  507:invokespecial   #130 <Method void writeNewline()>
				j = 0;
	//  237  510:iconst_0        
	//  238  511:istore          5
				flag2 = flag3;
	//  239  513:iload           8
	//  240  515:istore          7
			} else
	//* 241  517:goto            383
			{
				write(62);
	//  242  520:aload_0         
	//  243  521:bipush          62
	//  244  523:invokespecial   #230 <Method void write(int)>
				appendNodeValue(xmpnode.getValue(), false);
	//  245  526:aload_0         
	//  246  527:aload_1         
	//  247  528:invokevirtual   #241 <Method String XMPNode.getValue()>
	//  248  531:iconst_0        
	//  249  532:invokespecial   #342 <Method void appendNodeValue(String, boolean)>
				flag2 = false;
	//  250  535:iconst_0        
	//  251  536:istore          7
				j = ((int) (flag4));
	//  252  538:iload           9
	//  253  540:istore          5
			}
		} else
	//* 254  542:goto            383
		if(xmpnode.getOptions().isArray())
	//* 255  545:aload_1         
	//* 256  546:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//* 257  549:invokevirtual   #357 <Method boolean PropertyOptions.isArray()>
	//* 258  552:ifeq            649
		{
			write(62);
	//  259  555:aload_0         
	//  260  556:bipush          62
	//  261  558:invokespecial   #230 <Method void write(int)>
			writeNewline();
	//  262  561:aload_0         
	//  263  562:invokespecial   #130 <Method void writeNewline()>
			emitRDFArrayTag(xmpnode, true, i + 1);
	//  264  565:aload_0         
	//  265  566:aload_1         
	//  266  567:iconst_1        
	//  267  568:iload           4
	//  268  570:iconst_1        
	//  269  571:iadd            
	//  270  572:invokespecial   #359 <Method void emitRDFArrayTag(XMPNode, boolean, int)>
			if(xmpnode.getOptions().isArrayAltText())
	//* 271  575:aload_1         
	//* 272  576:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//* 273  579:invokevirtual   #362 <Method boolean PropertyOptions.isArrayAltText()>
	//* 274  582:ifeq            589
				XMPNodeUtils.normalizeLangArray(xmpnode);
	//  275  585:aload_1         
	//  276  586:invokestatic    #368 <Method void XMPNodeUtils.normalizeLangArray(XMPNode)>
			for(Iterator iterator = xmpnode.iterateChildren(); iterator.hasNext(); serializeCanonicalRDFProperty((XMPNode)iterator.next(), flag, false, i + 2));
	//  277  589:aload_1         
	//  278  590:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//  279  593:astore          13
	//  280  595:aload           13
	//  281  597:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//  282  602:ifeq            628
	//  283  605:aload_0         
	//  284  606:aload           13
	//  285  608:invokeinterface #258 <Method Object Iterator.next()>
	//  286  613:checkcast       #149 <Class XMPNode>
	//  287  616:iload_2         
	//  288  617:iconst_0        
	//  289  618:iload           4
	//  290  620:iconst_2        
	//  291  621:iadd            
	//  292  622:invokespecial   #346 <Method void serializeCanonicalRDFProperty(XMPNode, boolean, boolean, int)>
	//* 293  625:goto            595
			emitRDFArrayTag(xmpnode, false, i + 1);
	//  294  628:aload_0         
	//  295  629:aload_1         
	//  296  630:iconst_0        
	//  297  631:iload           4
	//  298  633:iconst_1        
	//  299  634:iadd            
	//  300  635:invokespecial   #359 <Method void emitRDFArrayTag(XMPNode, boolean, int)>
			j = ((int) (flag4));
	//  301  638:iload           9
	//  302  640:istore          5
			flag2 = flag3;
	//  303  642:iload           8
	//  304  644:istore          7
		} else
	//* 305  646:goto            383
		if(!flag5)
	//* 306  649:iload           10
	//* 307  651:ifne            861
		{
			if(!xmpnode.hasChildren())
	//* 308  654:aload_1         
	//* 309  655:invokevirtual   #271 <Method boolean XMPNode.hasChildren()>
	//* 310  658:ifne            718
			{
				if(flag)
	//* 311  661:iload_2         
	//* 312  662:ifeq            705
				{
					write(">");
	//  313  665:aload_0         
	//  314  666:ldc2            #291 <String ">">
	//  315  669:invokespecial   #145 <Method void write(String)>
					writeNewline();
	//  316  672:aload_0         
	//  317  673:invokespecial   #130 <Method void writeNewline()>
					writeIndent(i + 1);
	//  318  676:aload_0         
	//  319  677:iload           4
	//  320  679:iconst_1        
	//  321  680:iadd            
	//  322  681:invokespecial   #224 <Method void writeIndent(int)>
					write("<rdf:Description/>");
	//  323  684:aload_0         
	//  324  685:ldc1            #22  <String "<rdf:Description/>">
	//  325  687:invokespecial   #145 <Method void write(String)>
					j = k;
	//  326  690:iload           6
	//  327  692:istore          5
				} else
	//* 328  694:aload_0         
	//* 329  695:invokespecial   #130 <Method void writeNewline()>
	//* 330  698:iload           8
	//* 331  700:istore          7
	//* 332  702:goto            383
				{
					write(" rdf:parseType=\"Resource\"/>");
	//  333  705:aload_0         
	//  334  706:ldc2            #370 <String " rdf:parseType=\"Resource\"/>">
	//  335  709:invokespecial   #145 <Method void write(String)>
					j = 0;
	//  336  712:iconst_0        
	//  337  713:istore          5
				}
				writeNewline();
				flag2 = flag3;
			} else
	//* 338  715:goto            694
			{
				int l;
				if(flag)
	//* 339  718:iload_2         
	//* 340  719:ifeq            798
				{
					write(">");
	//  341  722:aload_0         
	//  342  723:ldc2            #291 <String ">">
	//  343  726:invokespecial   #145 <Method void write(String)>
					writeNewline();
	//  344  729:aload_0         
	//  345  730:invokespecial   #130 <Method void writeNewline()>
					l = i + 1;
	//  346  733:iload           4
	//  347  735:iconst_1        
	//  348  736:iadd            
	//  349  737:istore          6
					writeIndent(l);
	//  350  739:aload_0         
	//  351  740:iload           6
	//  352  742:invokespecial   #224 <Method void writeIndent(int)>
					write("<rdf:Description");
	//  353  745:aload_0         
	//  354  746:ldc1            #38  <String "<rdf:Description">
	//  355  748:invokespecial   #145 <Method void write(String)>
					write(">");
	//  356  751:aload_0         
	//  357  752:ldc2            #291 <String ">">
	//  358  755:invokespecial   #145 <Method void write(String)>
				} else
	//* 359  758:aload_0         
	//* 360  759:invokespecial   #130 <Method void writeNewline()>
	//* 361  762:aload_1         
	//* 362  763:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//* 363  766:astore_1        
	//* 364  767:aload_1         
	//* 365  768:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//* 366  773:ifeq            812
	//* 367  776:aload_0         
	//* 368  777:aload_1         
	//* 369  778:invokeinterface #258 <Method Object Iterator.next()>
	//* 370  783:checkcast       #149 <Class XMPNode>
	//* 371  786:iload_2         
	//* 372  787:iconst_0        
	//* 373  788:iload           6
	//* 374  790:iconst_1        
	//* 375  791:iadd            
	//* 376  792:invokespecial   #346 <Method void serializeCanonicalRDFProperty(XMPNode, boolean, boolean, int)>
	//* 377  795:goto            767
				{
					write(" rdf:parseType=\"Resource\">");
	//  378  798:aload_0         
	//  379  799:ldc2            #348 <String " rdf:parseType=\"Resource\">">
	//  380  802:invokespecial   #145 <Method void write(String)>
					l = i;
	//  381  805:iload           4
	//  382  807:istore          6
				}
				writeNewline();
				for(xmpnode = ((XMPNode) (xmpnode.iterateChildren())); ((Iterator) (xmpnode)).hasNext(); serializeCanonicalRDFProperty((XMPNode)((Iterator) (xmpnode)).next(), flag, false, l + 1));
	//* 383  809:goto            758
				j = ((int) (flag4));
	//  384  812:iload           9
	//  385  814:istore          5
				flag2 = flag3;
	//  386  816:iload           8
	//  387  818:istore          7
				i = l;
	//  388  820:iload           6
	//  389  822:istore          4
				if(flag)
	//* 390  824:iload_2         
	//* 391  825:ifeq            383
				{
					writeIndent(l);
	//  392  828:aload_0         
	//  393  829:iload           6
	//  394  831:invokespecial   #224 <Method void writeIndent(int)>
					write("</rdf:Description>");
	//  395  834:aload_0         
	//  396  835:ldc1            #31  <String "</rdf:Description>">
	//  397  837:invokespecial   #145 <Method void write(String)>
					writeNewline();
	//  398  840:aload_0         
	//  399  841:invokespecial   #130 <Method void writeNewline()>
					i = l - 1;
	//  400  844:iload           6
	//  401  846:iconst_1        
	//  402  847:isub            
	//  403  848:istore          4
					j = ((int) (flag4));
	//  404  850:iload           9
	//  405  852:istore          5
					flag2 = flag3;
	//  406  854:iload           8
	//  407  856:istore          7
				}
			}
		} else
	//* 408  858:goto            383
		{
			for(xmpnode = ((XMPNode) (xmpnode.iterateChildren())); ((Iterator) (xmpnode)).hasNext(); write(34))
	//* 409  861:aload_1         
	//* 410  862:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//* 411  865:astore_1        
	//* 412  866:aload_1         
	//* 413  867:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//* 414  872:ifeq            961
			{
				XMPNode xmpnode2 = (XMPNode)((Iterator) (xmpnode)).next();
	//  415  875:aload_1         
	//  416  876:invokeinterface #258 <Method Object Iterator.next()>
	//  417  881:checkcast       #149 <Class XMPNode>
	//  418  884:astore          13
				if(!canBeRDFAttrProp(xmpnode2))
	//* 419  886:aload_0         
	//* 420  887:aload           13
	//* 421  889:invokespecial   #372 <Method boolean canBeRDFAttrProp(XMPNode)>
	//* 422  892:ifne            909
					throw new XMPException("Can't mix rdf:resource and complex fields", 202);
	//  423  895:new             #91  <Class XMPException>
	//  424  898:dup             
	//  425  899:ldc2            #374 <String "Can't mix rdf:resource and complex fields">
	//  426  902:sipush          202
	//  427  905:invokespecial   #116 <Method void XMPException(String, int)>
	//  428  908:athrow          
				writeNewline();
	//  429  909:aload_0         
	//  430  910:invokespecial   #130 <Method void writeNewline()>
				writeIndent(i + 1);
	//  431  913:aload_0         
	//  432  914:iload           4
	//  433  916:iconst_1        
	//  434  917:iadd            
	//  435  918:invokespecial   #224 <Method void writeIndent(int)>
				write(32);
	//  436  921:aload_0         
	//  437  922:bipush          32
	//  438  924:invokespecial   #230 <Method void write(int)>
				write(xmpnode2.getName());
	//  439  927:aload_0         
	//  440  928:aload           13
	//  441  930:invokevirtual   #174 <Method String XMPNode.getName()>
	//  442  933:invokespecial   #145 <Method void write(String)>
				write("=\"");
	//  443  936:aload_0         
	//  444  937:ldc1            #228 <String "=\"">
	//  445  939:invokespecial   #145 <Method void write(String)>
				appendNodeValue(xmpnode2.getValue(), true);
	//  446  942:aload_0         
	//  447  943:aload           13
	//  448  945:invokevirtual   #241 <Method String XMPNode.getValue()>
	//  449  948:iconst_1        
	//  450  949:invokespecial   #342 <Method void appendNodeValue(String, boolean)>
			}

	//  451  952:aload_0         
	//  452  953:bipush          34
	//  453  955:invokespecial   #230 <Method void write(int)>
	//* 454  958:goto            866
			write("/>");
	//  455  961:aload_0         
	//  456  962:ldc2            #280 <String "/>">
	//  457  965:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//  458  968:aload_0         
	//  459  969:invokespecial   #130 <Method void writeNewline()>
			j = 0;
	//  460  972:iconst_0        
	//  461  973:istore          5
			flag2 = flag3;
	//  462  975:iload           8
	//  463  977:istore          7
		}
		if(true) goto _L8; else goto _L7
	//  464  979:goto            383
_L7:
		if(true) goto _L10; else goto _L9
_L9:
	}

	private void serializeCanonicalRDFSchema(XMPNode xmpnode, int i)
		throws IOException, XMPException
	{
		for(xmpnode = ((XMPNode) (xmpnode.iterateChildren())); ((Iterator) (xmpnode)).hasNext(); serializeCanonicalRDFProperty((XMPNode)((Iterator) (xmpnode)).next(), options.getUseCanonicalFormat(), false, i + 2));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//    2    4:astore_1        
	//    3    5:aload_1         
	//    4    6:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            41
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokeinterface #258 <Method Object Iterator.next()>
	//    9   21:checkcast       #149 <Class XMPNode>
	//   10   24:aload_0         
	//   11   25:getfield        #95  <Field SerializeOptions options>
	//   12   28:invokevirtual   #316 <Method boolean SerializeOptions.getUseCanonicalFormat()>
	//   13   31:iconst_0        
	//   14   32:iload_2         
	//   15   33:iconst_2        
	//   16   34:iadd            
	//   17   35:invokespecial   #346 <Method void serializeCanonicalRDFProperty(XMPNode, boolean, boolean, int)>
	//*  18   38:goto            5
	//   19   41:return          
	}

	private void serializeCanonicalRDFSchemas(int i)
		throws IOException, XMPException
	{
		if(xmp.getRoot().getChildrenLength() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #378 <Field XMPMetaImpl xmp>
	//*   2    4:invokevirtual   #384 <Method XMPNode XMPMetaImpl.getRoot()>
	//*   3    7:invokevirtual   #387 <Method int XMPNode.getChildrenLength()>
	//*   4   10:ifle            68
		{
			startOuterRDFDescription(xmp.getRoot(), i);
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:getfield        #378 <Field XMPMetaImpl xmp>
	//    8   18:invokevirtual   #384 <Method XMPNode XMPMetaImpl.getRoot()>
	//    9   21:iload_1         
	//   10   22:invokespecial   #390 <Method void startOuterRDFDescription(XMPNode, int)>
			for(Iterator iterator = xmp.getRoot().iterateChildren(); iterator.hasNext(); serializeCanonicalRDFSchema((XMPNode)iterator.next(), i));
	//   11   25:aload_0         
	//   12   26:getfield        #378 <Field XMPMetaImpl xmp>
	//   13   29:invokevirtual   #384 <Method XMPNode XMPMetaImpl.getRoot()>
	//   14   32:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//   15   35:astore_2        
	//   16   36:aload_2         
	//   17   37:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//   18   42:ifeq            62
	//   19   45:aload_0         
	//   20   46:aload_2         
	//   21   47:invokeinterface #258 <Method Object Iterator.next()>
	//   22   52:checkcast       #149 <Class XMPNode>
	//   23   55:iload_1         
	//   24   56:invokespecial   #392 <Method void serializeCanonicalRDFSchema(XMPNode, int)>
	//*  25   59:goto            36
			endOuterRDFDescription(i);
	//   26   62:aload_0         
	//   27   63:iload_1         
	//   28   64:invokespecial   #394 <Method void endOuterRDFDescription(int)>
			return;
	//   29   67:return          
		} else
		{
			writeIndent(i + 1);
	//   30   68:aload_0         
	//   31   69:iload_1         
	//   32   70:iconst_1        
	//   33   71:iadd            
	//   34   72:invokespecial   #224 <Method void writeIndent(int)>
			write("<rdf:Description rdf:about=");
	//   35   75:aload_0         
	//   36   76:ldc1            #34  <String "<rdf:Description rdf:about=">
	//   37   78:invokespecial   #145 <Method void write(String)>
			writeTreeName();
	//   38   81:aload_0         
	//   39   82:invokespecial   #397 <Method void writeTreeName()>
			write("/>");
	//   40   85:aload_0         
	//   41   86:ldc2            #280 <String "/>">
	//   42   89:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//   43   92:aload_0         
	//   44   93:invokespecial   #130 <Method void writeNewline()>
			return;
	//   45   96:return          
		}
	}

	private void serializeCompactRDFArrayProp(XMPNode xmpnode, int i)
		throws IOException, XMPException
	{
		write(62);
	//    0    0:aload_0         
	//    1    1:bipush          62
	//    2    3:invokespecial   #230 <Method void write(int)>
		writeNewline();
	//    3    6:aload_0         
	//    4    7:invokespecial   #130 <Method void writeNewline()>
		emitRDFArrayTag(xmpnode, true, i + 1);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:iconst_1        
	//    8   13:iload_2         
	//    9   14:iconst_1        
	//   10   15:iadd            
	//   11   16:invokespecial   #359 <Method void emitRDFArrayTag(XMPNode, boolean, int)>
		if(xmpnode.getOptions().isArrayAltText())
	//*  12   19:aload_1         
	//*  13   20:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//*  14   23:invokevirtual   #362 <Method boolean PropertyOptions.isArrayAltText()>
	//*  15   26:ifeq            33
			XMPNodeUtils.normalizeLangArray(xmpnode);
	//   16   29:aload_1         
	//   17   30:invokestatic    #368 <Method void XMPNodeUtils.normalizeLangArray(XMPNode)>
		serializeCompactRDFElementProps(xmpnode, i + 2);
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:iload_2         
	//   21   36:iconst_2        
	//   22   37:iadd            
	//   23   38:invokespecial   #401 <Method void serializeCompactRDFElementProps(XMPNode, int)>
		emitRDFArrayTag(xmpnode, false, i + 1);
	//   24   41:aload_0         
	//   25   42:aload_1         
	//   26   43:iconst_0        
	//   27   44:iload_2         
	//   28   45:iconst_1        
	//   29   46:iadd            
	//   30   47:invokespecial   #359 <Method void emitRDFArrayTag(XMPNode, boolean, int)>
	//   31   50:return          
	}

	private boolean serializeCompactRDFAttrProps(XMPNode xmpnode, int i)
		throws IOException
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		for(xmpnode = ((XMPNode) (xmpnode.iterateChildren())); ((Iterator) (xmpnode)).hasNext();)
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//*   4    6:astore_1        
	//*   5    7:aload_1         
	//*   6    8:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//*   7   13:ifeq            84
		{
			XMPNode xmpnode1 = (XMPNode)((Iterator) (xmpnode)).next();
	//    8   16:aload_1         
	//    9   17:invokeinterface #258 <Method Object Iterator.next()>
	//   10   22:checkcast       #149 <Class XMPNode>
	//   11   25:astore          4
			if(canBeRDFAttrProp(xmpnode1))
	//*  12   27:aload_0         
	//*  13   28:aload           4
	//*  14   30:invokespecial   #372 <Method boolean canBeRDFAttrProp(XMPNode)>
	//*  15   33:ifeq            79
			{
				writeNewline();
	//   16   36:aload_0         
	//   17   37:invokespecial   #130 <Method void writeNewline()>
				writeIndent(i);
	//   18   40:aload_0         
	//   19   41:iload_2         
	//   20   42:invokespecial   #224 <Method void writeIndent(int)>
				write(xmpnode1.getName());
	//   21   45:aload_0         
	//   22   46:aload           4
	//   23   48:invokevirtual   #174 <Method String XMPNode.getName()>
	//   24   51:invokespecial   #145 <Method void write(String)>
				write("=\"");
	//   25   54:aload_0         
	//   26   55:ldc1            #228 <String "=\"">
	//   27   57:invokespecial   #145 <Method void write(String)>
				appendNodeValue(xmpnode1.getValue(), true);
	//   28   60:aload_0         
	//   29   61:aload           4
	//   30   63:invokevirtual   #241 <Method String XMPNode.getValue()>
	//   31   66:iconst_1        
	//   32   67:invokespecial   #342 <Method void appendNodeValue(String, boolean)>
				write(34);
	//   33   70:aload_0         
	//   34   71:bipush          34
	//   35   73:invokespecial   #230 <Method void write(int)>
			} else
	//*  36   76:goto            7
			{
				flag = false;
	//   37   79:iconst_0        
	//   38   80:istore_3        
			}
		}

	//*  39   81:goto            7
		return flag;
	//   40   84:iload_3         
	//   41   85:ireturn         
	}

	private void serializeCompactRDFElementProps(XMPNode xmpnode, int i)
		throws IOException, XMPException
	{
		Iterator iterator1 = xmpnode.iterateChildren();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//    2    4:astore          8
		do
			if(iterator1.hasNext())
	//*   3    6:aload           8
	//*   4    8:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            330
			{
				XMPNode xmpnode1 = (XMPNode)iterator1.next();
	//    6   16:aload           8
	//    7   18:invokeinterface #258 <Method Object Iterator.next()>
	//    8   23:checkcast       #149 <Class XMPNode>
	//    9   26:astore          9
				if(!canBeRDFAttrProp(xmpnode1))
	//*  10   28:aload_0         
	//*  11   29:aload           9
	//*  12   31:invokespecial   #372 <Method boolean canBeRDFAttrProp(XMPNode)>
	//*  13   34:ifne            6
				{
					boolean flag3 = true;
	//   14   37:iconst_1        
	//   15   38:istore          6
					boolean flag2 = true;
	//   16   40:iconst_1        
	//   17   41:istore          5
					String s = xmpnode1.getName();
	//   18   43:aload           9
	//   19   45:invokevirtual   #174 <Method String XMPNode.getName()>
	//   20   48:astore          7
					xmpnode = ((XMPNode) (s));
	//   21   50:aload           7
	//   22   52:astore_1        
					if("[]".equals(((Object) (s))))
	//*  23   53:ldc1            #171 <String "[]">
	//*  24   55:aload           7
	//*  25   57:invokevirtual   #178 <Method boolean String.equals(Object)>
	//*  26   60:ifeq            67
						xmpnode = "rdf:li";
	//   27   63:ldc2            #340 <String "rdf:li">
	//   28   66:astore_1        
					writeIndent(i);
	//   29   67:aload_0         
	//   30   68:iload_2         
	//   31   69:invokespecial   #224 <Method void writeIndent(int)>
					write(60);
	//   32   72:aload_0         
	//   33   73:bipush          60
	//   34   75:invokespecial   #230 <Method void write(int)>
					write(((String) (xmpnode)));
	//   35   78:aload_0         
	//   36   79:aload_1         
	//   37   80:invokespecial   #145 <Method void write(String)>
					boolean flag = false;
	//   38   83:iconst_0        
	//   39   84:istore_3        
					boolean flag1 = false;
	//   40   85:iconst_0        
	//   41   86:istore          4
					for(Iterator iterator = xmpnode1.iterateQualifier(); iterator.hasNext();)
	//*  42   88:aload           9
	//*  43   90:invokevirtual   #266 <Method Iterator XMPNode.iterateQualifier()>
	//*  44   93:astore          7
	//*  45   95:aload           7
	//*  46   97:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//*  47  102:ifeq            190
					{
						XMPNode xmpnode2 = (XMPNode)iterator.next();
	//   48  105:aload           7
	//   49  107:invokeinterface #258 <Method Object Iterator.next()>
	//   50  112:checkcast       #149 <Class XMPNode>
	//   51  115:astore          10
						if(!RDF_ATTR_QUALIFIER.contains(((Object) (xmpnode2.getName()))))
	//*  52  117:getstatic       #82  <Field Set RDF_ATTR_QUALIFIER>
	//*  53  120:aload           10
	//*  54  122:invokevirtual   #174 <Method String XMPNode.getName()>
	//*  55  125:invokeinterface #221 <Method boolean Set.contains(Object)>
	//*  56  130:ifne            138
						{
							flag = true;
	//   57  133:iconst_1        
	//   58  134:istore_3        
						} else
	//*  59  135:goto            95
						{
							flag1 = "rdf:resource".equals(((Object) (xmpnode2.getName())));
	//   60  138:ldc1            #64  <String "rdf:resource">
	//   61  140:aload           10
	//   62  142:invokevirtual   #174 <Method String XMPNode.getName()>
	//   63  145:invokevirtual   #178 <Method boolean String.equals(Object)>
	//   64  148:istore          4
							write(32);
	//   65  150:aload_0         
	//   66  151:bipush          32
	//   67  153:invokespecial   #230 <Method void write(int)>
							write(xmpnode2.getName());
	//   68  156:aload_0         
	//   69  157:aload           10
	//   70  159:invokevirtual   #174 <Method String XMPNode.getName()>
	//   71  162:invokespecial   #145 <Method void write(String)>
							write("=\"");
	//   72  165:aload_0         
	//   73  166:ldc1            #228 <String "=\"">
	//   74  168:invokespecial   #145 <Method void write(String)>
							appendNodeValue(xmpnode2.getValue(), true);
	//   75  171:aload_0         
	//   76  172:aload           10
	//   77  174:invokevirtual   #241 <Method String XMPNode.getValue()>
	//   78  177:iconst_1        
	//   79  178:invokespecial   #342 <Method void appendNodeValue(String, boolean)>
							write(34);
	//   80  181:aload_0         
	//   81  182:bipush          34
	//   82  184:invokespecial   #230 <Method void write(int)>
						}
					}

	//*  83  187:goto            95
					if(flag)
	//*  84  190:iload_3         
	//*  85  191:ifeq            245
					{
						serializeCompactRDFGeneralQualifier(i, xmpnode1);
	//   86  194:aload_0         
	//   87  195:iload_2         
	//   88  196:aload           9
	//   89  198:invokespecial   #407 <Method void serializeCompactRDFGeneralQualifier(int, XMPNode)>
						flag1 = flag3;
	//   90  201:iload           6
	//   91  203:istore          4
					} else
	//*  92  205:iload           4
	//*  93  207:ifeq            6
	//*  94  210:iload           5
	//*  95  212:ifeq            220
	//*  96  215:aload_0         
	//*  97  216:iload_2         
	//*  98  217:invokespecial   #224 <Method void writeIndent(int)>
	//*  99  220:aload_0         
	//* 100  221:ldc2            #350 <String "</">
	//* 101  224:invokespecial   #145 <Method void write(String)>
	//* 102  227:aload_0         
	//* 103  228:aload_1         
	//* 104  229:invokespecial   #145 <Method void write(String)>
	//* 105  232:aload_0         
	//* 106  233:bipush          62
	//* 107  235:invokespecial   #230 <Method void write(int)>
	//* 108  238:aload_0         
	//* 109  239:invokespecial   #130 <Method void writeNewline()>
	//* 110  242:goto            6
					if(!xmpnode1.getOptions().isCompositeProperty())
	//* 111  245:aload           9
	//* 112  247:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//* 113  250:invokevirtual   #164 <Method boolean PropertyOptions.isCompositeProperty()>
	//* 114  253:ifne            291
					{
						Object aobj[] = serializeCompactRDFSimpleProp(xmpnode1);
	//  115  256:aload_0         
	//  116  257:aload           9
	//  117  259:invokespecial   #411 <Method Object[] serializeCompactRDFSimpleProp(XMPNode)>
	//  118  262:astore          7
						flag1 = ((Boolean)aobj[0]).booleanValue();
	//  119  264:aload           7
	//  120  266:iconst_0        
	//  121  267:aaload          
	//  122  268:checkcast       #413 <Class Boolean>
	//  123  271:invokevirtual   #416 <Method boolean Boolean.booleanValue()>
	//  124  274:istore          4
						flag2 = ((Boolean)aobj[1]).booleanValue();
	//  125  276:aload           7
	//  126  278:iconst_1        
	//  127  279:aaload          
	//  128  280:checkcast       #413 <Class Boolean>
	//  129  283:invokevirtual   #416 <Method boolean Boolean.booleanValue()>
	//  130  286:istore          5
					} else
	//* 131  288:goto            205
					if(xmpnode1.getOptions().isArray())
	//* 132  291:aload           9
	//* 133  293:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//* 134  296:invokevirtual   #357 <Method boolean PropertyOptions.isArray()>
	//* 135  299:ifeq            316
					{
						serializeCompactRDFArrayProp(xmpnode1, i);
	//  136  302:aload_0         
	//  137  303:aload           9
	//  138  305:iload_2         
	//  139  306:invokespecial   #418 <Method void serializeCompactRDFArrayProp(XMPNode, int)>
						flag1 = flag3;
	//  140  309:iload           6
	//  141  311:istore          4
					} else
	//* 142  313:goto            205
					{
						flag1 = serializeCompactRDFStructProp(xmpnode1, i, flag1);
	//  143  316:aload_0         
	//  144  317:aload           9
	//  145  319:iload_2         
	//  146  320:iload           4
	//  147  322:invokespecial   #422 <Method boolean serializeCompactRDFStructProp(XMPNode, int, boolean)>
	//  148  325:istore          4
					}
					if(flag1)
					{
						if(flag2)
							writeIndent(i);
						write("</");
						write(((String) (xmpnode)));
						write(62);
						writeNewline();
					}
				}
			} else
	//* 149  327:goto            205
			{
				return;
	//  150  330:return          
			}
		while(true);
	}

	private void serializeCompactRDFGeneralQualifier(int i, XMPNode xmpnode)
		throws IOException, XMPException
	{
		write(" rdf:parseType=\"Resource\">");
	//    0    0:aload_0         
	//    1    1:ldc2            #348 <String " rdf:parseType=\"Resource\">">
	//    2    4:invokespecial   #145 <Method void write(String)>
		writeNewline();
	//    3    7:aload_0         
	//    4    8:invokespecial   #130 <Method void writeNewline()>
		serializeCanonicalRDFProperty(xmpnode, false, true, i + 1);
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:iconst_0        
	//    8   14:iconst_1        
	//    9   15:iload_1         
	//   10   16:iconst_1        
	//   11   17:iadd            
	//   12   18:invokespecial   #346 <Method void serializeCanonicalRDFProperty(XMPNode, boolean, boolean, int)>
		for(xmpnode = ((XMPNode) (xmpnode.iterateQualifier())); ((Iterator) (xmpnode)).hasNext(); serializeCanonicalRDFProperty((XMPNode)((Iterator) (xmpnode)).next(), false, false, i + 1));
	//   13   21:aload_2         
	//   14   22:invokevirtual   #266 <Method Iterator XMPNode.iterateQualifier()>
	//   15   25:astore_2        
	//   16   26:aload_2         
	//   17   27:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//   18   32:ifeq            56
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:invokeinterface #258 <Method Object Iterator.next()>
	//   22   42:checkcast       #149 <Class XMPNode>
	//   23   45:iconst_0        
	//   24   46:iconst_0        
	//   25   47:iload_1         
	//   26   48:iconst_1        
	//   27   49:iadd            
	//   28   50:invokespecial   #346 <Method void serializeCanonicalRDFProperty(XMPNode, boolean, boolean, int)>
	//*  29   53:goto            26
	//   30   56:return          
	}

	private void serializeCompactRDFSchemas(int i)
		throws IOException, XMPException
	{
		writeIndent(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #224 <Method void writeIndent(int)>
		write("<rdf:Description rdf:about=");
	//    5    7:aload_0         
	//    6    8:ldc1            #34  <String "<rdf:Description rdf:about=">
	//    7   10:invokespecial   #145 <Method void write(String)>
		writeTreeName();
	//    8   13:aload_0         
	//    9   14:invokespecial   #397 <Method void writeTreeName()>
		HashSet hashset = new HashSet();
	//   10   17:new             #58  <Class HashSet>
	//   11   20:dup             
	//   12   21:invokespecial   #423 <Method void HashSet()>
	//   13   24:astore_3        
		((Set) (hashset)).add("xml");
	//   14   25:aload_3         
	//   15   26:ldc2            #425 <String "xml">
	//   16   29:invokeinterface #233 <Method boolean Set.add(Object)>
	//   17   34:pop             
		((Set) (hashset)).add("rdf");
	//   18   35:aload_3         
	//   19   36:ldc2            #427 <String "rdf">
	//   20   39:invokeinterface #233 <Method boolean Set.add(Object)>
	//   21   44:pop             
		for(Iterator iterator2 = xmp.getRoot().iterateChildren(); iterator2.hasNext(); declareUsedNamespaces((XMPNode)iterator2.next(), ((Set) (hashset)), i + 3));
	//   22   45:aload_0         
	//   23   46:getfield        #378 <Field XMPMetaImpl xmp>
	//   24   49:invokevirtual   #384 <Method XMPNode XMPMetaImpl.getRoot()>
	//   25   52:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//   26   55:astore          4
	//   27   57:aload           4
	//   28   59:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//   29   64:ifeq            88
	//   30   67:aload_0         
	//   31   68:aload           4
	//   32   70:invokeinterface #258 <Method Object Iterator.next()>
	//   33   75:checkcast       #149 <Class XMPNode>
	//   34   78:aload_3         
	//   35   79:iload_1         
	//   36   80:iconst_3        
	//   37   81:iadd            
	//   38   82:invokespecial   #260 <Method void declareUsedNamespaces(XMPNode, Set, int)>
	//*  39   85:goto            57
		boolean flag = true;
	//   40   88:iconst_1        
	//   41   89:istore_2        
		for(Iterator iterator = xmp.getRoot().iterateChildren(); iterator.hasNext();)
	//*  42   90:aload_0         
	//*  43   91:getfield        #378 <Field XMPMetaImpl xmp>
	//*  44   94:invokevirtual   #384 <Method XMPNode XMPMetaImpl.getRoot()>
	//*  45   97:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//*  46  100:astore_3        
	//*  47  101:aload_3         
	//*  48  102:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//*  49  107:ifeq            132
			flag &= serializeCompactRDFAttrProps((XMPNode)iterator.next(), i + 2);
	//   50  110:iload_2         
	//   51  111:aload_0         
	//   52  112:aload_3         
	//   53  113:invokeinterface #258 <Method Object Iterator.next()>
	//   54  118:checkcast       #149 <Class XMPNode>
	//   55  121:iload_1         
	//   56  122:iconst_2        
	//   57  123:iadd            
	//   58  124:invokespecial   #429 <Method boolean serializeCompactRDFAttrProps(XMPNode, int)>
	//   59  127:iand            
	//   60  128:istore_2        

	//*  61  129:goto            101
		if(!flag)
	//*  62  132:iload_2         
	//*  63  133:ifne            185
		{
			write(62);
	//   64  136:aload_0         
	//   65  137:bipush          62
	//   66  139:invokespecial   #230 <Method void write(int)>
			writeNewline();
	//   67  142:aload_0         
	//   68  143:invokespecial   #130 <Method void writeNewline()>
			for(Iterator iterator1 = xmp.getRoot().iterateChildren(); iterator1.hasNext(); serializeCompactRDFElementProps((XMPNode)iterator1.next(), i + 2));
	//   69  146:aload_0         
	//   70  147:getfield        #378 <Field XMPMetaImpl xmp>
	//   71  150:invokevirtual   #384 <Method XMPNode XMPMetaImpl.getRoot()>
	//   72  153:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//   73  156:astore_3        
	//   74  157:aload_3         
	//   75  158:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//   76  163:ifeq            197
	//   77  166:aload_0         
	//   78  167:aload_3         
	//   79  168:invokeinterface #258 <Method Object Iterator.next()>
	//   80  173:checkcast       #149 <Class XMPNode>
	//   81  176:iload_1         
	//   82  177:iconst_2        
	//   83  178:iadd            
	//   84  179:invokespecial   #401 <Method void serializeCompactRDFElementProps(XMPNode, int)>
		} else
	//*  85  182:goto            157
		{
			write("/>");
	//   86  185:aload_0         
	//   87  186:ldc2            #280 <String "/>">
	//   88  189:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//   89  192:aload_0         
	//   90  193:invokespecial   #130 <Method void writeNewline()>
			return;
	//   91  196:return          
		}
		writeIndent(i + 1);
	//   92  197:aload_0         
	//   93  198:iload_1         
	//   94  199:iconst_1        
	//   95  200:iadd            
	//   96  201:invokespecial   #224 <Method void writeIndent(int)>
		write("</rdf:Description>");
	//   97  204:aload_0         
	//   98  205:ldc1            #31  <String "</rdf:Description>">
	//   99  207:invokespecial   #145 <Method void write(String)>
		writeNewline();
	//  100  210:aload_0         
	//  101  211:invokespecial   #130 <Method void writeNewline()>
	//  102  214:return          
	}

	private Object[] serializeCompactRDFSimpleProp(XMPNode xmpnode)
		throws IOException
	{
		Boolean boolean2 = Boolean.TRUE;
	//    0    0:getstatic       #433 <Field Boolean Boolean.TRUE>
	//    1    3:astore_3        
		Boolean boolean1 = Boolean.TRUE;
	//    2    4:getstatic       #433 <Field Boolean Boolean.TRUE>
	//    3    7:astore_2        
		if(xmpnode.getOptions().isURI())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #156 <Method PropertyOptions XMPNode.getOptions()>
	//*   6   12:invokevirtual   #161 <Method boolean PropertyOptions.isURI()>
	//*   7   15:ifeq            62
		{
			write(" rdf:resource=\"");
	//    8   18:aload_0         
	//    9   19:ldc2            #352 <String " rdf:resource=\"">
	//   10   22:invokespecial   #145 <Method void write(String)>
			appendNodeValue(xmpnode.getValue(), true);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokevirtual   #241 <Method String XMPNode.getValue()>
	//   14   30:iconst_1        
	//   15   31:invokespecial   #342 <Method void appendNodeValue(String, boolean)>
			write("\"/>");
	//   16   34:aload_0         
	//   17   35:ldc2            #354 <String "\"/>">
	//   18   38:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//   19   41:aload_0         
	//   20   42:invokespecial   #130 <Method void writeNewline()>
			xmpnode = ((XMPNode) (Boolean.FALSE));
	//   21   45:getstatic       #436 <Field Boolean Boolean.FALSE>
	//   22   48:astore_1        
		} else
	//*  23   49:iconst_2        
	//*  24   50:anewarray       Object[]
	//*  25   53:dup             
	//*  26   54:iconst_0        
	//*  27   55:aload_1         
	//*  28   56:aastore         
	//*  29   57:dup             
	//*  30   58:iconst_1        
	//*  31   59:aload_2         
	//*  32   60:aastore         
	//*  33   61:areturn         
		if(xmpnode.getValue() == null || xmpnode.getValue().length() == 0)
	//*  34   62:aload_1         
	//*  35   63:invokevirtual   #241 <Method String XMPNode.getValue()>
	//*  36   66:ifnull          79
	//*  37   69:aload_1         
	//*  38   70:invokevirtual   #241 <Method String XMPNode.getValue()>
	//*  39   73:invokevirtual   #123 <Method int String.length()>
	//*  40   76:ifne            97
		{
			write("/>");
	//   41   79:aload_0         
	//   42   80:ldc2            #280 <String "/>">
	//   43   83:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//   44   86:aload_0         
	//   45   87:invokespecial   #130 <Method void writeNewline()>
			xmpnode = ((XMPNode) (Boolean.FALSE));
	//   46   90:getstatic       #436 <Field Boolean Boolean.FALSE>
	//   47   93:astore_1        
		} else
	//*  48   94:goto            49
		{
			write(62);
	//   49   97:aload_0         
	//   50   98:bipush          62
	//   51  100:invokespecial   #230 <Method void write(int)>
			appendNodeValue(xmpnode.getValue(), false);
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:invokevirtual   #241 <Method String XMPNode.getValue()>
	//   55  108:iconst_0        
	//   56  109:invokespecial   #342 <Method void appendNodeValue(String, boolean)>
			boolean1 = Boolean.FALSE;
	//   57  112:getstatic       #436 <Field Boolean Boolean.FALSE>
	//   58  115:astore_2        
			xmpnode = ((XMPNode) (boolean2));
	//   59  116:aload_3         
	//   60  117:astore_1        
		}
		return (new Object[] {
			xmpnode, boolean1
		});
	//*  61  118:goto            49
	}

	private boolean serializeCompactRDFStructProp(XMPNode xmpnode, int i, boolean flag)
		throws XMPException, IOException
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
		Iterator iterator = xmpnode.iterateChildren();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #249 <Method Iterator XMPNode.iterateChildren()>
	//    6   10:astore          8
		boolean flag3;
		boolean flag4;
label0:
		do
		{
			do
			{
				flag3 = flag2;
	//    7   12:iload           5
	//    8   14:istore          6
				flag4 = flag1;
	//    9   16:iload           4
	//   10   18:istore          7
				if(!iterator.hasNext())
					break label0;
	//   11   20:aload           8
	//   12   22:invokeinterface #254 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            80
				if(canBeRDFAttrProp((XMPNode)iterator.next()))
	//*  14   30:aload_0         
	//*  15   31:aload           8
	//*  16   33:invokeinterface #258 <Method Object Iterator.next()>
	//*  17   38:checkcast       #149 <Class XMPNode>
	//*  18   41:invokespecial   #372 <Method boolean canBeRDFAttrProp(XMPNode)>
	//*  19   44:ifeq            103
				{
					flag3 = true;
	//   20   47:iconst_1        
	//   21   48:istore          6
					flag4 = flag1;
	//   22   50:iload           4
	//   23   52:istore          7
				} else
	//*  24   54:iload           6
	//*  25   56:istore          5
	//*  26   58:iload           7
	//*  27   60:istore          4
	//*  28   62:iload           6
	//*  29   64:ifeq            12
	//*  30   67:iload           6
	//*  31   69:istore          5
	//*  32   71:iload           7
	//*  33   73:istore          4
	//*  34   75:iload           7
	//*  35   77:ifeq            12
	//*  36   80:iload_3         
	//*  37   81:ifeq            113
	//*  38   84:iload           7
	//*  39   86:ifeq            113
	//*  40   89:new             #91  <Class XMPException>
	//*  41   92:dup             
	//*  42   93:ldc2            #438 <String "Can't mix rdf:resource qualifier and element fields">
	//*  43   96:sipush          202
	//*  44   99:invokespecial   #116 <Method void XMPException(String, int)>
	//*  45  102:athrow          
				{
					flag4 = true;
	//   46  103:iconst_1        
	//   47  104:istore          7
					flag3 = flag2;
	//   48  106:iload           5
	//   49  108:istore          6
				}
				flag2 = flag3;
				flag1 = flag4;
			} while(!flag3);
			flag2 = flag3;
			flag1 = flag4;
		} while(!flag4);
		if(flag && flag4)
			throw new XMPException("Can't mix rdf:resource qualifier and element fields", 202);
	//*  50  110:goto            54
		if(!xmpnode.hasChildren())
	//*  51  113:aload_1         
	//*  52  114:invokevirtual   #271 <Method boolean XMPNode.hasChildren()>
	//*  53  117:ifne            133
		{
			write(" rdf:parseType=\"Resource\"/>");
	//   54  120:aload_0         
	//   55  121:ldc2            #370 <String " rdf:parseType=\"Resource\"/>">
	//   56  124:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//   57  127:aload_0         
	//   58  128:invokespecial   #130 <Method void writeNewline()>
			return false;
	//   59  131:iconst_0        
	//   60  132:ireturn         
		}
		if(!flag4)
	//*  61  133:iload           7
	//*  62  135:ifne            160
		{
			serializeCompactRDFAttrProps(xmpnode, i + 1);
	//   63  138:aload_0         
	//   64  139:aload_1         
	//   65  140:iload_2         
	//   66  141:iconst_1        
	//   67  142:iadd            
	//   68  143:invokespecial   #429 <Method boolean serializeCompactRDFAttrProps(XMPNode, int)>
	//   69  146:pop             
			write("/>");
	//   70  147:aload_0         
	//   71  148:ldc2            #280 <String "/>">
	//   72  151:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//   73  154:aload_0         
	//   74  155:invokespecial   #130 <Method void writeNewline()>
			return false;
	//   75  158:iconst_0        
	//   76  159:ireturn         
		}
		if(!flag3)
	//*  77  160:iload           6
	//*  78  162:ifne            186
		{
			write(" rdf:parseType=\"Resource\">");
	//   79  165:aload_0         
	//   80  166:ldc2            #348 <String " rdf:parseType=\"Resource\">">
	//   81  169:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//   82  172:aload_0         
	//   83  173:invokespecial   #130 <Method void writeNewline()>
			serializeCompactRDFElementProps(xmpnode, i + 1);
	//   84  176:aload_0         
	//   85  177:aload_1         
	//   86  178:iload_2         
	//   87  179:iconst_1        
	//   88  180:iadd            
	//   89  181:invokespecial   #401 <Method void serializeCompactRDFElementProps(XMPNode, int)>
			return true;
	//   90  184:iconst_1        
	//   91  185:ireturn         
		} else
		{
			write(62);
	//   92  186:aload_0         
	//   93  187:bipush          62
	//   94  189:invokespecial   #230 <Method void write(int)>
			writeNewline();
	//   95  192:aload_0         
	//   96  193:invokespecial   #130 <Method void writeNewline()>
			writeIndent(i + 1);
	//   97  196:aload_0         
	//   98  197:iload_2         
	//   99  198:iconst_1        
	//  100  199:iadd            
	//  101  200:invokespecial   #224 <Method void writeIndent(int)>
			write("<rdf:Description");
	//  102  203:aload_0         
	//  103  204:ldc1            #38  <String "<rdf:Description">
	//  104  206:invokespecial   #145 <Method void write(String)>
			serializeCompactRDFAttrProps(xmpnode, i + 2);
	//  105  209:aload_0         
	//  106  210:aload_1         
	//  107  211:iload_2         
	//  108  212:iconst_2        
	//  109  213:iadd            
	//  110  214:invokespecial   #429 <Method boolean serializeCompactRDFAttrProps(XMPNode, int)>
	//  111  217:pop             
			write(">");
	//  112  218:aload_0         
	//  113  219:ldc2            #291 <String ">">
	//  114  222:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//  115  225:aload_0         
	//  116  226:invokespecial   #130 <Method void writeNewline()>
			serializeCompactRDFElementProps(xmpnode, i + 1);
	//  117  229:aload_0         
	//  118  230:aload_1         
	//  119  231:iload_2         
	//  120  232:iconst_1        
	//  121  233:iadd            
	//  122  234:invokespecial   #401 <Method void serializeCompactRDFElementProps(XMPNode, int)>
			writeIndent(i + 1);
	//  123  237:aload_0         
	//  124  238:iload_2         
	//  125  239:iconst_1        
	//  126  240:iadd            
	//  127  241:invokespecial   #224 <Method void writeIndent(int)>
			write("</rdf:Description>");
	//  128  244:aload_0         
	//  129  245:ldc1            #31  <String "</rdf:Description>">
	//  130  247:invokespecial   #145 <Method void write(String)>
			writeNewline();
	//  131  250:aload_0         
	//  132  251:invokespecial   #130 <Method void writeNewline()>
			return true;
	//  133  254:iconst_1        
	//  134  255:ireturn         
		}
	}

	private void startOuterRDFDescription(XMPNode xmpnode, int i)
		throws IOException
	{
		writeIndent(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #224 <Method void writeIndent(int)>
		write("<rdf:Description rdf:about=");
	//    5    7:aload_0         
	//    6    8:ldc1            #34  <String "<rdf:Description rdf:about=">
	//    7   10:invokespecial   #145 <Method void write(String)>
		writeTreeName();
	//    8   13:aload_0         
	//    9   14:invokespecial   #397 <Method void writeTreeName()>
		HashSet hashset = new HashSet();
	//   10   17:new             #58  <Class HashSet>
	//   11   20:dup             
	//   12   21:invokespecial   #423 <Method void HashSet()>
	//   13   24:astore_3        
		((Set) (hashset)).add("xml");
	//   14   25:aload_3         
	//   15   26:ldc2            #425 <String "xml">
	//   16   29:invokeinterface #233 <Method boolean Set.add(Object)>
	//   17   34:pop             
		((Set) (hashset)).add("rdf");
	//   18   35:aload_3         
	//   19   36:ldc2            #427 <String "rdf">
	//   20   39:invokeinterface #233 <Method boolean Set.add(Object)>
	//   21   44:pop             
		declareUsedNamespaces(xmpnode, ((Set) (hashset)), i + 3);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:aload_3         
	//   25   48:iload_2         
	//   26   49:iconst_3        
	//   27   50:iadd            
	//   28   51:invokespecial   #260 <Method void declareUsedNamespaces(XMPNode, Set, int)>
		write(62);
	//   29   54:aload_0         
	//   30   55:bipush          62
	//   31   57:invokespecial   #230 <Method void write(int)>
		writeNewline();
	//   32   60:aload_0         
	//   33   61:invokespecial   #130 <Method void writeNewline()>
	//   34   64:return          
	}

	private void write(int i)
		throws IOException
	{
		writer.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #440 <Field OutputStreamWriter writer>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #443 <Method void OutputStreamWriter.write(int)>
	//    4    8:return          
	}

	private void write(String s)
		throws IOException
	{
		writer.write(s);
	//    0    0:aload_0         
	//    1    1:getfield        #440 <Field OutputStreamWriter writer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #444 <Method void OutputStreamWriter.write(String)>
	//    4    8:return          
	}

	private void writeChars(int i, char c)
		throws IOException
	{
		for(; i > 0; i--)
	//*   0    0:iload_1         
	//*   1    1:ifle            19
			writer.write(((int) (c)));
	//    2    4:aload_0         
	//    3    5:getfield        #440 <Field OutputStreamWriter writer>
	//    4    8:iload_2         
	//    5    9:invokevirtual   #443 <Method void OutputStreamWriter.write(int)>

	//    6   12:iload_1         
	//    7   13:iconst_1        
	//    8   14:isub            
	//    9   15:istore_1        
	//*  10   16:goto            0
	//   11   19:return          
	}

	private void writeIndent(int i)
		throws IOException
	{
		for(i = options.getBaseIndent() + i; i > 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field SerializeOptions options>
	//*   2    4:invokevirtual   #322 <Method int SerializeOptions.getBaseIndent()>
	//*   3    7:iload_1         
	//*   4    8:iadd            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:ifle            35
			writer.write(options.getIndent());
	//    8   14:aload_0         
	//    9   15:getfield        #440 <Field OutputStreamWriter writer>
	//   10   18:aload_0         
	//   11   19:getfield        #95  <Field SerializeOptions options>
	//   12   22:invokevirtual   #325 <Method String SerializeOptions.getIndent()>
	//   13   25:invokevirtual   #444 <Method void OutputStreamWriter.write(String)>

	//   14   28:iload_1         
	//   15   29:iconst_1        
	//   16   30:isub            
	//   17   31:istore_1        
	//*  18   32:goto            10
	//   19   35:return          
	}

	private void writeNewline()
		throws IOException
	{
		writer.write(options.getNewline());
	//    0    0:aload_0         
	//    1    1:getfield        #440 <Field OutputStreamWriter writer>
	//    2    4:aload_0         
	//    3    5:getfield        #95  <Field SerializeOptions options>
	//    4    8:invokevirtual   #120 <Method String SerializeOptions.getNewline()>
	//    5   11:invokevirtual   #444 <Method void OutputStreamWriter.write(String)>
	//    6   14:return          
	}

	private void writeTreeName()
		throws IOException
	{
		write(34);
	//    0    0:aload_0         
	//    1    1:bipush          34
	//    2    3:invokespecial   #230 <Method void write(int)>
		String s = xmp.getRoot().getName();
	//    3    6:aload_0         
	//    4    7:getfield        #378 <Field XMPMetaImpl xmp>
	//    5   10:invokevirtual   #384 <Method XMPNode XMPMetaImpl.getRoot()>
	//    6   13:invokevirtual   #174 <Method String XMPNode.getName()>
	//    7   16:astore_1        
		if(s != null)
	//*   8   17:aload_1         
	//*   9   18:ifnull          27
			appendNodeValue(s, true);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:iconst_1        
	//   13   24:invokespecial   #342 <Method void appendNodeValue(String, boolean)>
		write(34);
	//   14   27:aload_0         
	//   15   28:bipush          34
	//   16   30:invokespecial   #230 <Method void write(int)>
	//   17   33:return          
	}

	protected void checkOptionsConsistence()
		throws XMPException
	{
		if(options.getEncodeUTF16BE() | options.getEncodeUTF16LE())
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field SerializeOptions options>
	//*   2    4:invokevirtual   #448 <Method boolean SerializeOptions.getEncodeUTF16BE()>
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field SerializeOptions options>
	//*   5   11:invokevirtual   #451 <Method boolean SerializeOptions.getEncodeUTF16LE()>
	//*   6   14:ior             
	//*   7   15:ifeq            23
			unicodeSize = 2;
	//    8   18:aload_0         
	//    9   19:iconst_2        
	//   10   20:putfield        #87  <Field int unicodeSize>
		if(options.getExactPacketLength())
	//*  11   23:aload_0         
	//*  12   24:getfield        #95  <Field SerializeOptions options>
	//*  13   27:invokevirtual   #101 <Method boolean SerializeOptions.getExactPacketLength()>
	//*  14   30:ifeq            94
		{
			if(options.getOmitPacketWrapper() | options.getIncludeThumbnailPad())
	//*  15   33:aload_0         
	//*  16   34:getfield        #95  <Field SerializeOptions options>
	//*  17   37:invokevirtual   #296 <Method boolean SerializeOptions.getOmitPacketWrapper()>
	//*  18   40:aload_0         
	//*  19   41:getfield        #95  <Field SerializeOptions options>
	//*  20   44:invokevirtual   #454 <Method boolean SerializeOptions.getIncludeThumbnailPad()>
	//*  21   47:ior             
	//*  22   48:ifeq            64
				throw new XMPException("Inconsistent options for exact size serialize", 103);
	//   23   51:new             #91  <Class XMPException>
	//   24   54:dup             
	//   25   55:ldc2            #456 <String "Inconsistent options for exact size serialize">
	//   26   58:bipush          103
	//   27   60:invokespecial   #116 <Method void XMPException(String, int)>
	//   28   63:athrow          
			if((options.getPadding() & unicodeSize - 1) != 0)
	//*  29   64:aload_0         
	//*  30   65:getfield        #95  <Field SerializeOptions options>
	//*  31   68:invokevirtual   #459 <Method int SerializeOptions.getPadding()>
	//*  32   71:aload_0         
	//*  33   72:getfield        #87  <Field int unicodeSize>
	//*  34   75:iconst_1        
	//*  35   76:isub            
	//*  36   77:iand            
	//*  37   78:ifeq            140
				throw new XMPException("Exact size must be a multiple of the Unicode element", 103);
	//   38   81:new             #91  <Class XMPException>
	//   39   84:dup             
	//   40   85:ldc2            #461 <String "Exact size must be a multiple of the Unicode element">
	//   41   88:bipush          103
	//   42   90:invokespecial   #116 <Method void XMPException(String, int)>
	//   43   93:athrow          
		} else
		if(options.getReadOnlyPacket())
	//*  44   94:aload_0         
	//*  45   95:getfield        #95  <Field SerializeOptions options>
	//*  46   98:invokevirtual   #331 <Method boolean SerializeOptions.getReadOnlyPacket()>
	//*  47  101:ifeq            141
		{
			if(options.getOmitPacketWrapper() | options.getIncludeThumbnailPad())
	//*  48  104:aload_0         
	//*  49  105:getfield        #95  <Field SerializeOptions options>
	//*  50  108:invokevirtual   #296 <Method boolean SerializeOptions.getOmitPacketWrapper()>
	//*  51  111:aload_0         
	//*  52  112:getfield        #95  <Field SerializeOptions options>
	//*  53  115:invokevirtual   #454 <Method boolean SerializeOptions.getIncludeThumbnailPad()>
	//*  54  118:ior             
	//*  55  119:ifeq            135
				throw new XMPException("Inconsistent options for read-only packet", 103);
	//   56  122:new             #91  <Class XMPException>
	//   57  125:dup             
	//   58  126:ldc2            #463 <String "Inconsistent options for read-only packet">
	//   59  129:bipush          103
	//   60  131:invokespecial   #116 <Method void XMPException(String, int)>
	//   61  134:athrow          
			padding = 0;
	//   62  135:aload_0         
	//   63  136:iconst_0        
	//   64  137:putfield        #111 <Field int padding>
		} else
	//*  65  140:return          
		{
			if(options.getOmitPacketWrapper())
	//*  66  141:aload_0         
	//*  67  142:getfield        #95  <Field SerializeOptions options>
	//*  68  145:invokevirtual   #296 <Method boolean SerializeOptions.getOmitPacketWrapper()>
	//*  69  148:ifeq            180
				if(options.getIncludeThumbnailPad())
	//*  70  151:aload_0         
	//*  71  152:getfield        #95  <Field SerializeOptions options>
	//*  72  155:invokevirtual   #454 <Method boolean SerializeOptions.getIncludeThumbnailPad()>
	//*  73  158:ifeq            174
				{
					throw new XMPException("Inconsistent options for non-packet serialize", 103);
	//   74  161:new             #91  <Class XMPException>
	//   75  164:dup             
	//   76  165:ldc2            #465 <String "Inconsistent options for non-packet serialize">
	//   77  168:bipush          103
	//   78  170:invokespecial   #116 <Method void XMPException(String, int)>
	//   79  173:athrow          
				} else
				{
					padding = 0;
	//   80  174:aload_0         
	//   81  175:iconst_0        
	//   82  176:putfield        #111 <Field int padding>
					return;
	//   83  179:return          
				}
			if(padding == 0)
	//*  84  180:aload_0         
	//*  85  181:getfield        #111 <Field int padding>
	//*  86  184:ifne            199
				padding = unicodeSize * 2048;
	//   87  187:aload_0         
	//   88  188:aload_0         
	//   89  189:getfield        #87  <Field int unicodeSize>
	//   90  192:sipush          2048
	//   91  195:imul            
	//   92  196:putfield        #111 <Field int padding>
			if(options.getIncludeThumbnailPad() && !xmp.doesPropertyExist("http://ns.adobe.com/xap/1.0/", "Thumbnails"))
	//*  93  199:aload_0         
	//*  94  200:getfield        #95  <Field SerializeOptions options>
	//*  95  203:invokevirtual   #454 <Method boolean SerializeOptions.getIncludeThumbnailPad()>
	//*  96  206:ifeq            140
	//*  97  209:aload_0         
	//*  98  210:getfield        #378 <Field XMPMetaImpl xmp>
	//*  99  213:ldc2            #467 <String "http://ns.adobe.com/xap/1.0/">
	//* 100  216:ldc2            #469 <String "Thumbnails">
	//* 101  219:invokevirtual   #473 <Method boolean XMPMetaImpl.doesPropertyExist(String, String)>
	//* 102  222:ifne            140
			{
				padding = padding + unicodeSize * 10000;
	//  103  225:aload_0         
	//  104  226:aload_0         
	//  105  227:getfield        #111 <Field int padding>
	//  106  230:aload_0         
	//  107  231:getfield        #87  <Field int unicodeSize>
	//  108  234:sipush          10000
	//  109  237:imul            
	//  110  238:iadd            
	//  111  239:putfield        #111 <Field int padding>
				return;
	//  112  242:return          
			}
		}
	}

	public void serialize(XMPMeta xmpmeta, OutputStream outputstream, SerializeOptions serializeoptions)
		throws XMPException
	{
		try
		{
			outputStream = new CountOutputStream(outputstream);
	//    0    0:aload_0         
	//    1    1:new             #105 <Class CountOutputStream>
	//    2    4:dup             
	//    3    5:aload_2         
	//    4    6:invokespecial   #478 <Method void CountOutputStream(OutputStream)>
	//    5    9:putfield        #103 <Field CountOutputStream outputStream>
			writer = new OutputStreamWriter(((OutputStream) (outputStream)), serializeoptions.getEncoding());
	//    6   12:aload_0         
	//    7   13:new             #442 <Class OutputStreamWriter>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #103 <Field CountOutputStream outputStream>
	//   11   21:aload_3         
	//   12   22:invokevirtual   #481 <Method String SerializeOptions.getEncoding()>
	//   13   25:invokespecial   #484 <Method void OutputStreamWriter(OutputStream, String)>
	//   14   28:putfield        #440 <Field OutputStreamWriter writer>
			xmp = (XMPMetaImpl)xmpmeta;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:checkcast       #380 <Class XMPMetaImpl>
	//   18   36:putfield        #378 <Field XMPMetaImpl xmp>
			options = serializeoptions;
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:putfield        #95  <Field SerializeOptions options>
			padding = serializeoptions.getPadding();
	//   22   44:aload_0         
	//   23   45:aload_3         
	//   24   46:invokevirtual   #459 <Method int SerializeOptions.getPadding()>
	//   25   49:putfield        #111 <Field int padding>
			writer = new OutputStreamWriter(((OutputStream) (outputStream)), serializeoptions.getEncoding());
	//   26   52:aload_0         
	//   27   53:new             #442 <Class OutputStreamWriter>
	//   28   56:dup             
	//   29   57:aload_0         
	//   30   58:getfield        #103 <Field CountOutputStream outputStream>
	//   31   61:aload_3         
	//   32   62:invokevirtual   #481 <Method String SerializeOptions.getEncoding()>
	//   33   65:invokespecial   #484 <Method void OutputStreamWriter(OutputStream, String)>
	//   34   68:putfield        #440 <Field OutputStreamWriter writer>
			checkOptionsConsistence();
	//   35   71:aload_0         
	//   36   72:invokevirtual   #486 <Method void checkOptionsConsistence()>
			xmpmeta = ((XMPMeta) (serializeAsRDF()));
	//   37   75:aload_0         
	//   38   76:invokespecial   #488 <Method String serializeAsRDF()>
	//   39   79:astore_1        
			writer.flush();
	//   40   80:aload_0         
	//   41   81:getfield        #440 <Field OutputStreamWriter writer>
	//   42   84:invokevirtual   #491 <Method void OutputStreamWriter.flush()>
			addPadding(((String) (xmpmeta)).length());
	//   43   87:aload_0         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #123 <Method int String.length()>
	//   46   92:invokespecial   #493 <Method void addPadding(int)>
			write(((String) (xmpmeta)));
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:invokespecial   #145 <Method void write(String)>
			writer.flush();
	//   50  100:aload_0         
	//   51  101:getfield        #440 <Field OutputStreamWriter writer>
	//   52  104:invokevirtual   #491 <Method void OutputStreamWriter.flush()>
			outputStream.close();
	//   53  107:aload_0         
	//   54  108:getfield        #103 <Field CountOutputStream outputStream>
	//   55  111:invokevirtual   #496 <Method void CountOutputStream.close()>
			return;
	//   56  114:return          
		}
		// Misplaced declaration of an exception variable
		catch(XMPMeta xmpmeta)
	//*  57  115:astore_1        
		{
			throw new XMPException("Error writing to the OutputStream", 0);
	//   58  116:new             #91  <Class XMPException>
	//   59  119:dup             
	//   60  120:ldc2            #498 <String "Error writing to the OutputStream">
	//   61  123:iconst_0        
	//   62  124:invokespecial   #116 <Method void XMPException(String, int)>
	//   63  127:athrow          
		}
	}

	private static final int DEFAULT_PAD = 2048;
	private static final String PACKET_HEADER = "<?xpacket begin=\"\uFEFF\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>";
	private static final String PACKET_TRAILER = "<?xpacket end=\"";
	private static final String PACKET_TRAILER2 = "\"?>";
	static final Set RDF_ATTR_QUALIFIER = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"xml:lang", "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"
	}))))));
	private static final String RDF_EMPTY_STRUCT = "<rdf:Description/>";
	private static final String RDF_RDF_END = "</rdf:RDF>";
	private static final String RDF_RDF_START = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">";
	private static final String RDF_SCHEMA_END = "</rdf:Description>";
	private static final String RDF_SCHEMA_START = "<rdf:Description rdf:about=";
	private static final String RDF_STRUCT_END = "</rdf:Description>";
	private static final String RDF_STRUCT_START = "<rdf:Description";
	private static final String RDF_XMPMETA_END = "</x:xmpmeta>";
	private static final String RDF_XMPMETA_START = "<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"";
	private SerializeOptions options;
	private CountOutputStream outputStream;
	private int padding;
	private int unicodeSize;
	private OutputStreamWriter writer;
	private XMPMetaImpl xmp;

	static 
	{
	//    0    0:new             #58  <Class HashSet>
	//    1    3:dup             
	//    2    4:iconst_5        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #62  <String "xml:lang">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #64  <String "rdf:resource">
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #66  <String "rdf:ID">
	//   15   22:aastore         
	//   16   23:dup             
	//   17   24:iconst_3        
	//   18   25:ldc1            #68  <String "rdf:bagID">
	//   19   27:aastore         
	//   20   28:dup             
	//   21   29:iconst_4        
	//   22   30:ldc1            #70  <String "rdf:nodeID">
	//   23   32:aastore         
	//   24   33:invokestatic    #76  <Method java.util.List Arrays.asList(Object[])>
	//   25   36:invokespecial   #80  <Method void HashSet(java.util.Collection)>
	//   26   39:putstatic       #82  <Field Set RDF_ATTR_QUALIFIER>
	//*  27   42:return          
	}
}
