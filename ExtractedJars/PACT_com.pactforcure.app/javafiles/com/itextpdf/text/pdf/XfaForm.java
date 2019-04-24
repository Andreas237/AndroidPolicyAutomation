// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.xml.XmlDomWriter;
import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, PdfArray, PRStream, PdfReader, 
//			PdfName, PdfDictionary, PdfString, PdfStream, 
//			PdfWriter, PdfIndirectObject, AcroFields

public class XfaForm
{
	public static class AcroFieldsSearch extends Xml2Som
	{

		public HashMap getAcroShort2LongName()
		{
			return acroShort2LongName;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field HashMap acroShort2LongName>
		//    2    4:areturn         
		}

		public void setAcroShort2LongName(HashMap hashmap)
		{
			acroShort2LongName = hashmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field HashMap acroShort2LongName>
		//    3    5:return          
		}

		private HashMap acroShort2LongName;

		public AcroFieldsSearch(Collection collection)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void XfaForm$Xml2Som()>
			inverseSearch = new HashMap();
		//    2    4:aload_0         
		//    3    5:new             #17  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #18  <Method void HashMap()>
		//    6   12:putfield        #21  <Field HashMap inverseSearch>
			acroShort2LongName = new HashMap();
		//    7   15:aload_0         
		//    8   16:new             #17  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #18  <Method void HashMap()>
		//   11   23:putfield        #23  <Field HashMap acroShort2LongName>
			String s;
			String s1;
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); inverseSearchAdd(inverseSearch, splitParts(s1), s))
		//*  12   26:aload_1         
		//*  13   27:invokeinterface #29  <Method Iterator Collection.iterator()>
		//*  14   32:astore_1        
		//*  15   33:aload_1         
		//*  16   34:invokeinterface #35  <Method boolean Iterator.hasNext()>
		//*  17   39:ifeq            82
			{
				s = (String)((Iterator) (collection)).next();
		//   18   42:aload_1         
		//   19   43:invokeinterface #39  <Method Object Iterator.next()>
		//   20   48:checkcast       #41  <Class String>
		//   21   51:astore_2        
				s1 = getShortName(s);
		//   22   52:aload_2         
		//   23   53:invokestatic    #45  <Method String getShortName(String)>
		//   24   56:astore_3        
				acroShort2LongName.put(((Object) (s1)), ((Object) (s)));
		//   25   57:aload_0         
		//   26   58:getfield        #23  <Field HashMap acroShort2LongName>
		//   27   61:aload_3         
		//   28   62:aload_2         
		//   29   63:invokevirtual   #49  <Method Object HashMap.put(Object, Object)>
		//   30   66:pop             
			}

		//   31   67:aload_0         
		//   32   68:getfield        #21  <Field HashMap inverseSearch>
		//   33   71:aload_3         
		//   34   72:invokestatic    #53  <Method XfaForm$Stack2 splitParts(String)>
		//   35   75:aload_2         
		//   36   76:invokestatic    #57  <Method void inverseSearchAdd(HashMap, XfaForm$Stack2, String)>
		//*  37   79:goto            33
		//   38   82:return          
		}
	}

	public static class InverseStore
	{

		public String getDefaultName()
		{
			Object obj = ((Object) (this));
		//    0    0:aload_0         
		//    1    1:astore_1        
			do
			{
				obj = ((InverseStore) (obj)).follow.get(0);
		//    2    2:aload_1         
		//    3    3:getfield        #23  <Field ArrayList follow>
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #30  <Method Object ArrayList.get(int)>
		//    6   10:astore_1        
				if(obj instanceof String)
		//*   7   11:aload_1         
		//*   8   12:instanceof      #32  <Class String>
		//*   9   15:ifeq            23
					return (String)obj;
		//   10   18:aload_1         
		//   11   19:checkcast       #32  <Class String>
		//   12   22:areturn         
				obj = ((Object) ((InverseStore)obj));
		//   13   23:aload_1         
		//   14   24:checkcast       #2   <Class XfaForm$InverseStore>
		//   15   27:astore_1        
			} while(true);
		//   16   28:goto            2
		}

		public boolean isSimilar(String s)
		{
			s = s.substring(0, s.indexOf('[') + 1);
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:aload_1         
		//    3    3:bipush          91
		//    4    5:invokevirtual   #38  <Method int String.indexOf(int)>
		//    5    8:iconst_1        
		//    6    9:iadd            
		//    7   10:invokevirtual   #42  <Method String String.substring(int, int)>
		//    8   13:astore_1        
			for(int i = 0; i < part.size(); i++)
		//*   9   14:iconst_0        
		//*  10   15:istore_2        
		//*  11   16:iload_2         
		//*  12   17:aload_0         
		//*  13   18:getfield        #21  <Field ArrayList part>
		//*  14   21:invokevirtual   #46  <Method int ArrayList.size()>
		//*  15   24:icmpge          54
				if(((String)part.get(i)).startsWith(s))
		//*  16   27:aload_0         
		//*  17   28:getfield        #21  <Field ArrayList part>
		//*  18   31:iload_2         
		//*  19   32:invokevirtual   #30  <Method Object ArrayList.get(int)>
		//*  20   35:checkcast       #32  <Class String>
		//*  21   38:aload_1         
		//*  22   39:invokevirtual   #49  <Method boolean String.startsWith(String)>
		//*  23   42:ifeq            47
					return true;
		//   24   45:iconst_1        
		//   25   46:ireturn         

		//   26   47:iload_2         
		//   27   48:iconst_1        
		//   28   49:iadd            
		//   29   50:istore_2        
		//*  30   51:goto            16
			return false;
		//   31   54:iconst_0        
		//   32   55:ireturn         
		}

		protected ArrayList follow;
		protected ArrayList part;

		public InverseStore()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			part = new ArrayList();
		//    2    4:aload_0         
		//    3    5:new             #18  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void ArrayList()>
		//    6   12:putfield        #21  <Field ArrayList part>
			follow = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #18  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #19  <Method void ArrayList()>
		//   11   23:putfield        #23  <Field ArrayList follow>
		//   12   26:return          
		}
	}

	public static class Stack2 extends ArrayList
	{

		public boolean empty()
		{
			return size() == 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method int size()>
		//    2    4:ifne            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public Object peek()
		{
			if(size() == 0)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #23  <Method int size()>
		//*   2    4:ifne            15
				throw new EmptyStackException();
		//    3    7:new             #27  <Class EmptyStackException>
		//    4   10:dup             
		//    5   11:invokespecial   #28  <Method void EmptyStackException()>
		//    6   14:athrow          
			else
				return get(size() - 1);
		//    7   15:aload_0         
		//    8   16:aload_0         
		//    9   17:invokevirtual   #23  <Method int size()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:invokevirtual   #32  <Method Object get(int)>
		//   13   25:areturn         
		}

		public Object pop()
		{
			if(size() == 0)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #23  <Method int size()>
		//*   2    4:ifne            15
			{
				throw new EmptyStackException();
		//    3    7:new             #27  <Class EmptyStackException>
		//    4   10:dup             
		//    5   11:invokespecial   #28  <Method void EmptyStackException()>
		//    6   14:athrow          
			} else
			{
				Object obj = get(size() - 1);
		//    7   15:aload_0         
		//    8   16:aload_0         
		//    9   17:invokevirtual   #23  <Method int size()>
		//   10   20:iconst_1        
		//   11   21:isub            
		//   12   22:invokevirtual   #32  <Method Object get(int)>
		//   13   25:astore_1        
				remove(size() - 1);
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:invokevirtual   #23  <Method int size()>
		//   17   31:iconst_1        
		//   18   32:isub            
		//   19   33:invokevirtual   #38  <Method Object remove(int)>
		//   20   36:pop             
				return obj;
		//   21   37:aload_1         
		//   22   38:areturn         
			}
		}

		public Object push(Object obj)
		{
			add(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #44  <Method boolean add(Object)>
		//    3    5:pop             
			return obj;
		//    4    6:aload_1         
		//    5    7:areturn         
		}

		private static final long serialVersionUID = 0x98ffc494L;

		public Stack2()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void ArrayList()>
		//    2    4:return          
		}
	}

	public static class Xml2Som
	{

		public static String escapeSom(String s)
		{
			String s1;
			if(s == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       9
			{
				s1 = "";
		//    2    4:ldc1            #29  <String "">
		//    3    6:astore_3        
			} else
		//*   4    7:aload_3         
		//*   5    8:areturn         
			{
				int i = s.indexOf('.');
		//    6    9:aload_0         
		//    7   10:bipush          46
		//    8   12:invokevirtual   #35  <Method int String.indexOf(int)>
		//    9   15:istore_1        
				s1 = s;
		//   10   16:aload_0         
		//   11   17:astore_3        
				if(i >= 0)
		//*  12   18:iload_1         
		//*  13   19:iflt            7
				{
					StringBuffer stringbuffer = new StringBuffer();
		//   14   22:new             #37  <Class StringBuffer>
		//   15   25:dup             
		//   16   26:invokespecial   #38  <Method void StringBuffer()>
		//   17   29:astore_3        
					int j = 0;
		//   18   30:iconst_0        
		//   19   31:istore_2        
					for(; i >= 0; i = s.indexOf('.', i + 1))
		//*  20   32:iload_1         
		//*  21   33:iflt            69
					{
						stringbuffer.append(s.substring(j, i));
		//   22   36:aload_3         
		//   23   37:aload_0         
		//   24   38:iload_2         
		//   25   39:iload_1         
		//   26   40:invokevirtual   #42  <Method String String.substring(int, int)>
		//   27   43:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
		//   28   46:pop             
						stringbuffer.append('\\');
		//   29   47:aload_3         
		//   30   48:bipush          92
		//   31   50:invokevirtual   #49  <Method StringBuffer StringBuffer.append(char)>
		//   32   53:pop             
						j = i;
		//   33   54:iload_1         
		//   34   55:istore_2        
					}

		//   35   56:aload_0         
		//   36   57:bipush          46
		//   37   59:iload_1         
		//   38   60:iconst_1        
		//   39   61:iadd            
		//   40   62:invokevirtual   #52  <Method int String.indexOf(int, int)>
		//   41   65:istore_1        
		//*  42   66:goto            32
					stringbuffer.append(s.substring(j));
		//   43   69:aload_3         
		//   44   70:aload_0         
		//   45   71:iload_2         
		//   46   72:invokevirtual   #55  <Method String String.substring(int)>
		//   47   75:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
		//   48   78:pop             
					return stringbuffer.toString();
		//   49   79:aload_3         
		//   50   80:invokevirtual   #59  <Method String StringBuffer.toString()>
		//   51   83:areturn         
				}
			}
			return s1;
		}

		public static String getShortName(String s)
		{
			int i = s.indexOf(".#subform[");
		//    0    0:aload_0         
		//    1    1:ldc1            #62  <String ".#subform[">
		//    2    3:invokevirtual   #65  <Method int String.indexOf(String)>
		//    3    6:istore_1        
			if(i < 0)
		//*   4    7:iload_1         
		//*   5    8:ifge            13
				return s;
		//    6   11:aload_0         
		//    7   12:areturn         
			int j = 0;
		//    8   13:iconst_0        
		//    9   14:istore_2        
			StringBuffer stringbuffer = new StringBuffer();
		//   10   15:new             #37  <Class StringBuffer>
		//   11   18:dup             
		//   12   19:invokespecial   #38  <Method void StringBuffer()>
		//   13   22:astore_3        
			for(; i >= 0; i = s.indexOf(".#subform[", j))
		//*  14   23:iload_1         
		//*  15   24:iflt            73
			{
				stringbuffer.append(s.substring(j, i));
		//   16   27:aload_3         
		//   17   28:aload_0         
		//   18   29:iload_2         
		//   19   30:iload_1         
		//   20   31:invokevirtual   #42  <Method String String.substring(int, int)>
		//   21   34:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
		//   22   37:pop             
				i = s.indexOf("]", i + 10);
		//   23   38:aload_0         
		//   24   39:ldc1            #67  <String "]">
		//   25   41:iload_1         
		//   26   42:bipush          10
		//   27   44:iadd            
		//   28   45:invokevirtual   #70  <Method int String.indexOf(String, int)>
		//   29   48:istore_1        
				if(i < 0)
		//*  30   49:iload_1         
		//*  31   50:ifge            58
					return stringbuffer.toString();
		//   32   53:aload_3         
		//   33   54:invokevirtual   #59  <Method String StringBuffer.toString()>
		//   34   57:areturn         
				j = i + 1;
		//   35   58:iload_1         
		//   36   59:iconst_1        
		//   37   60:iadd            
		//   38   61:istore_2        
			}

		//   39   62:aload_0         
		//   40   63:ldc1            #62  <String ".#subform[">
		//   41   65:iload_2         
		//   42   66:invokevirtual   #70  <Method int String.indexOf(String, int)>
		//   43   69:istore_1        
		//*  44   70:goto            23
			stringbuffer.append(s.substring(j));
		//   45   73:aload_3         
		//   46   74:aload_0         
		//   47   75:iload_2         
		//   48   76:invokevirtual   #55  <Method String String.substring(int)>
		//   49   79:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
		//   50   82:pop             
			return stringbuffer.toString();
		//   51   83:aload_3         
		//   52   84:invokevirtual   #59  <Method String StringBuffer.toString()>
		//   53   87:areturn         
		}

		public static void inverseSearchAdd(HashMap hashmap, Stack2 stack2, String s)
		{
			String s1 = (String)stack2.peek();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #78  <Method Object XfaForm$Stack2.peek()>
		//    2    4:checkcast       #31  <Class String>
		//    3    7:astore          7
			InverseStore inversestore = (InverseStore)hashmap.get(((Object) (s1)));
		//    4    9:aload_0         
		//    5   10:aload           7
		//    6   12:invokevirtual   #84  <Method Object HashMap.get(Object)>
		//    7   15:checkcast       #86  <Class XfaForm$InverseStore>
		//    8   18:astore          6
			Object obj = ((Object) (inversestore));
		//    9   20:aload           6
		//   10   22:astore          5
			if(inversestore == null)
		//*  11   24:aload           6
		//*  12   26:ifnonnull       47
			{
				obj = ((Object) (new InverseStore()));
		//   13   29:new             #86  <Class XfaForm$InverseStore>
		//   14   32:dup             
		//   15   33:invokespecial   #87  <Method void XfaForm$InverseStore()>
		//   16   36:astore          5
				hashmap.put(((Object) (s1)), obj);
		//   17   38:aload_0         
		//   18   39:aload           7
		//   19   41:aload           5
		//   20   43:invokevirtual   #91  <Method Object HashMap.put(Object, Object)>
		//   21   46:pop             
			}
			int i = stack2.size() - 2;
		//   22   47:aload_1         
		//   23   48:invokevirtual   #95  <Method int XfaForm$Stack2.size()>
		//   24   51:iconst_2        
		//   25   52:isub            
		//   26   53:istore_3        
			while(i >= 0) 
		//*  27   54:iload_3         
		//*  28   55:iflt            138
			{
				hashmap = ((HashMap) ((String)stack2.get(i)));
		//   29   58:aload_1         
		//   30   59:iload_3         
		//   31   60:invokevirtual   #98  <Method Object XfaForm$Stack2.get(int)>
		//   32   63:checkcast       #31  <Class String>
		//   33   66:astore_0        
				int j = ((InverseStore) (obj)).part.indexOf(((Object) (hashmap)));
		//   34   67:aload           5
		//   35   69:getfield        #101 <Field ArrayList XfaForm$InverseStore.part>
		//   36   72:aload_0         
		//   37   73:invokevirtual   #106 <Method int ArrayList.indexOf(Object)>
		//   38   76:istore          4
				if(j < 0)
		//*  39   78:iload           4
		//*  40   80:ifge            121
				{
					((InverseStore) (obj)).part.add(((Object) (hashmap)));
		//   41   83:aload           5
		//   42   85:getfield        #101 <Field ArrayList XfaForm$InverseStore.part>
		//   43   88:aload_0         
		//   44   89:invokevirtual   #110 <Method boolean ArrayList.add(Object)>
		//   45   92:pop             
					hashmap = ((HashMap) (new InverseStore()));
		//   46   93:new             #86  <Class XfaForm$InverseStore>
		//   47   96:dup             
		//   48   97:invokespecial   #87  <Method void XfaForm$InverseStore()>
		//   49  100:astore_0        
					((InverseStore) (obj)).follow.add(((Object) (hashmap)));
		//   50  101:aload           5
		//   51  103:getfield        #113 <Field ArrayList XfaForm$InverseStore.follow>
		//   52  106:aload_0         
		//   53  107:invokevirtual   #110 <Method boolean ArrayList.add(Object)>
		//   54  110:pop             
				} else
		//*  55  111:iload_3         
		//*  56  112:iconst_1        
		//*  57  113:isub            
		//*  58  114:istore_3        
		//*  59  115:aload_0         
		//*  60  116:astore          5
		//*  61  118:goto            54
				{
					hashmap = ((HashMap) ((InverseStore)((InverseStore) (obj)).follow.get(j)));
		//   62  121:aload           5
		//   63  123:getfield        #113 <Field ArrayList XfaForm$InverseStore.follow>
		//   64  126:iload           4
		//   65  128:invokevirtual   #114 <Method Object ArrayList.get(int)>
		//   66  131:checkcast       #86  <Class XfaForm$InverseStore>
		//   67  134:astore_0        
				}
				i--;
				obj = ((Object) (hashmap));
			}
		//*  68  135:goto            111
			((InverseStore) (obj)).part.add("");
		//   69  138:aload           5
		//   70  140:getfield        #101 <Field ArrayList XfaForm$InverseStore.part>
		//   71  143:ldc1            #29  <String "">
		//   72  145:invokevirtual   #110 <Method boolean ArrayList.add(Object)>
		//   73  148:pop             
			((InverseStore) (obj)).follow.add(((Object) (s)));
		//   74  149:aload           5
		//   75  151:getfield        #113 <Field ArrayList XfaForm$InverseStore.follow>
		//   76  154:aload_2         
		//   77  155:invokevirtual   #110 <Method boolean ArrayList.add(Object)>
		//   78  158:pop             
		//   79  159:return          
		}

		public static Stack2 splitParts(String s)
		{
			for(; s.startsWith("."); s = s.substring(1));
		//    0    0:aload_0         
		//    1    1:ldc1            #120 <String ".">
		//    2    3:invokevirtual   #124 <Method boolean String.startsWith(String)>
		//    3    6:ifeq            18
		//    4    9:aload_0         
		//    5   10:iconst_1        
		//    6   11:invokevirtual   #55  <Method String String.substring(int)>
		//    7   14:astore_0        
		//*   8   15:goto            0
			Stack2 stack2 = new Stack2();
		//    9   18:new             #74  <Class XfaForm$Stack2>
		//   10   21:dup             
		//   11   22:invokespecial   #125 <Method void XfaForm$Stack2()>
		//   12   25:astore          5
			int i = 0;
		//   13   27:iconst_0        
		//   14   28:istore_1        
			do
			{
				int j = i;
		//   15   29:iload_1         
		//   16   30:istore_2        
label0:
				do
				{
					j = s.indexOf('.', j);
		//   17   31:aload_0         
		//   18   32:bipush          46
		//   19   34:iload_2         
		//   20   35:invokevirtual   #52  <Method int String.indexOf(int, int)>
		//   21   38:istore_2        
					while(j < 0 || s.charAt(j - 1) != '\\') 
		//*  22   39:iload_2         
		//*  23   40:ifge            94
					{
						if(j < 0)
		//*  24   43:iload_2         
		//*  25   44:ifge            113
						{
							String s1 = s.substring(i);
		//   26   47:aload_0         
		//   27   48:iload_1         
		//   28   49:invokevirtual   #55  <Method String String.substring(int)>
		//   29   52:astore_3        
							s = s1;
		//   30   53:aload_3         
		//   31   54:astore_0        
							if(!s1.endsWith("]"))
		//*  32   55:aload_3         
		//*  33   56:ldc1            #67  <String "]">
		//*  34   58:invokevirtual   #128 <Method boolean String.endsWith(String)>
		//*  35   61:ifne            84
								s = (new StringBuilder()).append(s1).append("[0]").toString();
		//   36   64:new             #130 <Class StringBuilder>
		//   37   67:dup             
		//   38   68:invokespecial   #131 <Method void StringBuilder()>
		//   39   71:aload_3         
		//   40   72:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   41   75:ldc1            #136 <String "[0]">
		//   42   77:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   43   80:invokevirtual   #137 <Method String StringBuilder.toString()>
		//   44   83:astore_0        
							stack2.add(((Object) (s)));
		//   45   84:aload           5
		//   46   86:aload_0         
		//   47   87:invokevirtual   #138 <Method boolean XfaForm$Stack2.add(Object)>
		//   48   90:pop             
							return stack2;
		//   49   91:aload           5
		//   50   93:areturn         
						}
						break label0;
					}
		//   51   94:aload_0         
		//   52   95:iload_2         
		//   53   96:iconst_1        
		//   54   97:isub            
		//   55   98:invokevirtual   #142 <Method char String.charAt(int)>
		//   56  101:bipush          92
		//   57  103:icmpne          43
					j++;
		//   58  106:iload_2         
		//   59  107:iconst_1        
		//   60  108:iadd            
		//   61  109:istore_2        
				} while(true);
		//   62  110:goto            31
				String s3 = s.substring(i, j);
		//   63  113:aload_0         
		//   64  114:iload_1         
		//   65  115:iload_2         
		//   66  116:invokevirtual   #42  <Method String String.substring(int, int)>
		//   67  119:astore          4
				String s2 = s3;
		//   68  121:aload           4
		//   69  123:astore_3        
				if(!s3.endsWith("]"))
		//*  70  124:aload           4
		//*  71  126:ldc1            #67  <String "]">
		//*  72  128:invokevirtual   #128 <Method boolean String.endsWith(String)>
		//*  73  131:ifne            155
					s2 = (new StringBuilder()).append(s3).append("[0]").toString();
		//   74  134:new             #130 <Class StringBuilder>
		//   75  137:dup             
		//   76  138:invokespecial   #131 <Method void StringBuilder()>
		//   77  141:aload           4
		//   78  143:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   79  146:ldc1            #136 <String "[0]">
		//   80  148:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   81  151:invokevirtual   #137 <Method String StringBuilder.toString()>
		//   82  154:astore_3        
				stack2.add(((Object) (s2)));
		//   83  155:aload           5
		//   84  157:aload_3         
		//   85  158:invokevirtual   #138 <Method boolean XfaForm$Stack2.add(Object)>
		//   86  161:pop             
				i = j + 1;
		//   87  162:iload_2         
		//   88  163:iconst_1        
		//   89  164:iadd            
		//   90  165:istore_1        
			} while(true);
		//   91  166:goto            29
		}

		public static String unescapeSom(String s)
		{
			int i = s.indexOf('\\');
		//    0    0:aload_0         
		//    1    1:bipush          92
		//    2    3:invokevirtual   #35  <Method int String.indexOf(int)>
		//    3    6:istore_1        
			if(i < 0)
		//*   4    7:iload_1         
		//*   5    8:ifge            13
				return s;
		//    6   11:aload_0         
		//    7   12:areturn         
			StringBuffer stringbuffer = new StringBuffer();
		//    8   13:new             #37  <Class StringBuffer>
		//    9   16:dup             
		//   10   17:invokespecial   #38  <Method void StringBuffer()>
		//   11   20:astore_3        
			int j = 0;
		//   12   21:iconst_0        
		//   13   22:istore_2        
			for(; i >= 0; i = s.indexOf('\\', i + 1))
		//*  14   23:iload_1         
		//*  15   24:iflt            55
			{
				stringbuffer.append(s.substring(j, i));
		//   16   27:aload_3         
		//   17   28:aload_0         
		//   18   29:iload_2         
		//   19   30:iload_1         
		//   20   31:invokevirtual   #42  <Method String String.substring(int, int)>
		//   21   34:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
		//   22   37:pop             
				j = i + 1;
		//   23   38:iload_1         
		//   24   39:iconst_1        
		//   25   40:iadd            
		//   26   41:istore_2        
			}

		//   27   42:aload_0         
		//   28   43:bipush          92
		//   29   45:iload_1         
		//   30   46:iconst_1        
		//   31   47:iadd            
		//   32   48:invokevirtual   #52  <Method int String.indexOf(int, int)>
		//   33   51:istore_1        
		//*  34   52:goto            23
			stringbuffer.append(s.substring(j));
		//   35   55:aload_3         
		//   36   56:aload_0         
		//   37   57:iload_2         
		//   38   58:invokevirtual   #55  <Method String String.substring(int)>
		//   39   61:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
		//   40   64:pop             
			return stringbuffer.toString();
		//   41   65:aload_3         
		//   42   66:invokevirtual   #59  <Method String StringBuffer.toString()>
		//   43   69:areturn         
		}

		public HashMap getInverseSearch()
		{
			return inverseSearch;
		//    0    0:aload_0         
		//    1    1:getfield        #148 <Field HashMap inverseSearch>
		//    2    4:areturn         
		}

		public HashMap getName2Node()
		{
			return name2Node;
		//    0    0:aload_0         
		//    1    1:getfield        #152 <Field HashMap name2Node>
		//    2    4:areturn         
		}

		public ArrayList getOrder()
		{
			return order;
		//    0    0:aload_0         
		//    1    1:getfield        #157 <Field ArrayList order>
		//    2    4:areturn         
		}

		public void inverseSearchAdd(String s)
		{
			inverseSearchAdd(inverseSearch, stack, s);
		//    0    0:aload_0         
		//    1    1:getfield        #148 <Field HashMap inverseSearch>
		//    2    4:aload_0         
		//    3    5:getfield        #161 <Field XfaForm$Stack2 stack>
		//    4    8:aload_1         
		//    5    9:invokestatic    #163 <Method void inverseSearchAdd(HashMap, XfaForm$Stack2, String)>
		//    6   12:return          
		}

		public String inverseSearchGlobal(ArrayList arraylist)
		{
			if(!arraylist.isEmpty()) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:invokevirtual   #169 <Method boolean ArrayList.isEmpty()>
		//    2    4:ifeq            9
_L1:
			InverseStore inversestore;
			return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
		//*   5    9:aload_0         
		//*   6   10:getfield        #148 <Field HashMap inverseSearch>
		//*   7   13:aload_1         
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #170 <Method int ArrayList.size()>
		//*  10   18:iconst_1        
		//*  11   19:isub            
		//*  12   20:invokevirtual   #114 <Method Object ArrayList.get(int)>
		//*  13   23:invokevirtual   #84  <Method Object HashMap.get(Object)>
		//*  14   26:checkcast       #86  <Class XfaForm$InverseStore>
		//*  15   29:astore          4
_L2:
			if((inversestore = (InverseStore)inverseSearch.get(arraylist.get(arraylist.size() - 1))) == null)
				continue; /* Loop/switch isn't completed */
		//   16   31:aload           4
		//   17   33:ifnull          7
			int i = arraylist.size() - 2;
		//   18   36:aload_1         
		//   19   37:invokevirtual   #170 <Method int ArrayList.size()>
		//   20   40:iconst_2        
		//   21   41:isub            
		//   22   42:istore_2        
			do
			{
				if(i < 0)
					break;
		//   23   43:iload_2         
		//   24   44:iflt            109
				String s = (String)arraylist.get(i);
		//   25   47:aload_1         
		//   26   48:iload_2         
		//   27   49:invokevirtual   #114 <Method Object ArrayList.get(int)>
		//   28   52:checkcast       #31  <Class String>
		//   29   55:astore          5
				int j = inversestore.part.indexOf(((Object) (s)));
		//   30   57:aload           4
		//   31   59:getfield        #101 <Field ArrayList XfaForm$InverseStore.part>
		//   32   62:aload           5
		//   33   64:invokevirtual   #106 <Method int ArrayList.indexOf(Object)>
		//   34   67:istore_3        
				if(j < 0)
		//*  35   68:iload_3         
		//*  36   69:ifge            88
				{
					if(!inversestore.isSimilar(s))
		//*  37   72:aload           4
		//*  38   74:aload           5
		//*  39   76:invokevirtual   #173 <Method boolean XfaForm$InverseStore.isSimilar(String)>
		//*  40   79:ifne            7
						return inversestore.getDefaultName();
		//   41   82:aload           4
		//   42   84:invokevirtual   #176 <Method String XfaForm$InverseStore.getDefaultName()>
		//   43   87:areturn         
					continue; /* Loop/switch isn't completed */
				}
				inversestore = (InverseStore)inversestore.follow.get(j);
		//   44   88:aload           4
		//   45   90:getfield        #113 <Field ArrayList XfaForm$InverseStore.follow>
		//   46   93:iload_3         
		//   47   94:invokevirtual   #114 <Method Object ArrayList.get(int)>
		//   48   97:checkcast       #86  <Class XfaForm$InverseStore>
		//   49  100:astore          4
				i--;
		//   50  102:iload_2         
		//   51  103:iconst_1        
		//   52  104:isub            
		//   53  105:istore_2        
			} while(true);
		//   54  106:goto            43
			return inversestore.getDefaultName();
		//   55  109:aload           4
		//   56  111:invokevirtual   #176 <Method String XfaForm$InverseStore.getDefaultName()>
		//   57  114:areturn         
			if(true) goto _L1; else goto _L3
_L3:
		}

		protected String printStack()
		{
			if(stack.empty())
		//*   0    0:aload_0         
		//*   1    1:getfield        #161 <Field XfaForm$Stack2 stack>
		//*   2    4:invokevirtual   #181 <Method boolean XfaForm$Stack2.empty()>
		//*   3    7:ifeq            13
				return "";
		//    4   10:ldc1            #29  <String "">
		//    5   12:areturn         
			StringBuffer stringbuffer = new StringBuffer();
		//    6   13:new             #37  <Class StringBuffer>
		//    7   16:dup             
		//    8   17:invokespecial   #38  <Method void StringBuffer()>
		//    9   20:astore_2        
			for(int i = 0; i < stack.size(); i++)
		//*  10   21:iconst_0        
		//*  11   22:istore_1        
		//*  12   23:iload_1         
		//*  13   24:aload_0         
		//*  14   25:getfield        #161 <Field XfaForm$Stack2 stack>
		//*  15   28:invokevirtual   #95  <Method int XfaForm$Stack2.size()>
		//*  16   31:icmpge          62
				stringbuffer.append('.').append((String)stack.get(i));
		//   17   34:aload_2         
		//   18   35:bipush          46
		//   19   37:invokevirtual   #49  <Method StringBuffer StringBuffer.append(char)>
		//   20   40:aload_0         
		//   21   41:getfield        #161 <Field XfaForm$Stack2 stack>
		//   22   44:iload_1         
		//   23   45:invokevirtual   #98  <Method Object XfaForm$Stack2.get(int)>
		//   24   48:checkcast       #31  <Class String>
		//   25   51:invokevirtual   #46  <Method StringBuffer StringBuffer.append(String)>
		//   26   54:pop             

		//   27   55:iload_1         
		//   28   56:iconst_1        
		//   29   57:iadd            
		//   30   58:istore_1        
		//*  31   59:goto            23
			return stringbuffer.substring(1);
		//   32   62:aload_2         
		//   33   63:iconst_1        
		//   34   64:invokevirtual   #182 <Method String StringBuffer.substring(int)>
		//   35   67:areturn         
		}

		public void setInverseSearch(HashMap hashmap)
		{
			inverseSearch = hashmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #148 <Field HashMap inverseSearch>
		//    3    5:return          
		}

		public void setName2Node(HashMap hashmap)
		{
			name2Node = hashmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #152 <Field HashMap name2Node>
		//    3    5:return          
		}

		public void setOrder(ArrayList arraylist)
		{
			order = arraylist;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #157 <Field ArrayList order>
		//    3    5:return          
		}

		protected int anform;
		protected HashMap inverseSearch;
		protected HashMap name2Node;
		protected ArrayList order;
		protected Stack2 stack;

		public Xml2Som()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class Xml2SomDatasets extends Xml2Som
	{

		private static boolean hasChildren(Node node)
		{
			Object obj = ((Object) (node.getAttributes().getNamedItemNS("http://www.xfa.org/schema/xfa-data/1.0/", "dataNode")));
		//    0    0:aload_0         
		//    1    1:invokeinterface #52  <Method NamedNodeMap Node.getAttributes()>
		//    2    6:ldc1            #54  <String "http://www.xfa.org/schema/xfa-data/1.0/">
		//    3    8:ldc1            #56  <String "dataNode">
		//    4   10:invokeinterface #62  <Method Node NamedNodeMap.getNamedItemNS(String, String)>
		//    5   15:astore_1        
			if(obj == null) goto _L2; else goto _L1
		//    6   16:aload_1         
		//    7   17:ifnull          49
_L1:
			obj = ((Object) (((Node) (obj)).getNodeValue()));
		//    8   20:aload_1         
		//    9   21:invokeinterface #66  <Method String Node.getNodeValue()>
		//   10   26:astore_1        
			if(!"dataGroup".equals(obj)) goto _L4; else goto _L3
		//   11   27:ldc1            #68  <String "dataGroup">
		//   12   29:aload_1         
		//   13   30:invokevirtual   #74  <Method boolean String.equals(Object)>
		//   14   33:ifeq            38
_L3:
			return true;
		//   15   36:iconst_1        
		//   16   37:ireturn         
_L4:
			if("dataValue".equals(obj))
		//*  17   38:ldc1            #76  <String "dataValue">
		//*  18   40:aload_1         
		//*  19   41:invokevirtual   #74  <Method boolean String.equals(Object)>
		//*  20   44:ifeq            49
				return false;
		//   21   47:iconst_0        
		//   22   48:ireturn         
_L2:
			if(!node.hasChildNodes())
		//*  23   49:aload_0         
		//*  24   50:invokeinterface #80  <Method boolean Node.hasChildNodes()>
		//*  25   55:ifne            60
				return false;
		//   26   58:iconst_0        
		//   27   59:ireturn         
			node = node.getFirstChild();
		//   28   60:aload_0         
		//   29   61:invokeinterface #84  <Method Node Node.getFirstChild()>
		//   30   66:astore_0        
label0:
			do
			{
label1:
				{
					if(node == null)
						break label1;
		//   31   67:aload_0         
		//   32   68:ifnull          91
					if(node.getNodeType() == 1)
						break label0;
		//   33   71:aload_0         
		//   34   72:invokeinterface #88  <Method short Node.getNodeType()>
		//   35   77:iconst_1        
		//   36   78:icmpeq          36
					node = node.getNextSibling();
		//   37   81:aload_0         
		//   38   82:invokeinterface #91  <Method Node Node.getNextSibling()>
		//   39   87:astore_0        
				}
			} while(true);
		//   40   88:goto            67
			if(true) goto _L3; else goto _L5
_L5:
			return false;
		//   41   91:iconst_0        
		//   42   92:ireturn         
		}

		private void processDatasetsInternal(Node node)
		{
			if(node != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          183
			{
				HashMap hashmap = new HashMap();
		//    2    4:new             #21  <Class HashMap>
		//    3    7:dup             
		//    4    8:invokespecial   #22  <Method void HashMap()>
		//    5   11:astore_3        
				node = node.getFirstChild();
		//    6   12:aload_1         
		//    7   13:invokeinterface #84  <Method Node Node.getFirstChild()>
		//    8   18:astore_1        
				while(node != null) 
		//*   9   19:aload_1         
		//*  10   20:ifnull          183
				{
					if(node.getNodeType() != 1)
						continue;
		//   11   23:aload_1         
		//   12   24:invokeinterface #88  <Method short Node.getNodeType()>
		//   13   29:iconst_1        
		//   14   30:icmpne          160
					String s = escapeSom(node.getLocalName());
		//   15   33:aload_1         
		//   16   34:invokeinterface #94  <Method String Node.getLocalName()>
		//   17   39:invokestatic    #98  <Method String escapeSom(String)>
		//   18   42:astore          4
					Object obj = ((Object) ((Integer)hashmap.get(((Object) (s)))));
		//   19   44:aload_3         
		//   20   45:aload           4
		//   21   47:invokevirtual   #102 <Method Object HashMap.get(Object)>
		//   22   50:checkcast       #104 <Class Integer>
		//   23   53:astore_2        
					if(obj == null)
		//*  24   54:aload_2         
		//*  25   55:ifnonnull       170
						obj = ((Object) (Integer.valueOf(0)));
		//   26   58:iconst_0        
		//   27   59:invokestatic    #108 <Method Integer Integer.valueOf(int)>
		//   28   62:astore_2        
					else
		//*  29   63:aload_3         
		//*  30   64:aload           4
		//*  31   66:aload_2         
		//*  32   67:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
		//*  33   70:pop             
		//*  34   71:aload_0         
		//*  35   72:getfield        #33  <Field XfaForm$Stack2 stack>
		//*  36   75:new             #114 <Class StringBuilder>
		//*  37   78:dup             
		//*  38   79:invokespecial   #115 <Method void StringBuilder()>
		//*  39   82:aload           4
		//*  40   84:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//*  41   87:ldc1            #121 <String "[">
		//*  42   89:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//*  43   92:aload_2         
		//*  44   93:invokevirtual   #124 <Method String Integer.toString()>
		//*  45   96:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//*  46   99:ldc1            #126 <String "]">
		//*  47  101:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//*  48  104:invokevirtual   #127 <Method String StringBuilder.toString()>
		//*  49  107:invokevirtual   #130 <Method Object XfaForm$Stack2.push(Object)>
		//*  50  110:pop             
		//*  51  111:aload_1         
		//*  52  112:invokestatic    #132 <Method boolean hasChildren(Node)>
		//*  53  115:ifeq            123
		//*  54  118:aload_0         
		//*  55  119:aload_1         
		//*  56  120:invokespecial   #43  <Method void processDatasetsInternal(Node)>
		//*  57  123:aload_0         
		//*  58  124:invokevirtual   #135 <Method String printStack()>
		//*  59  127:astore_2        
		//*  60  128:aload_0         
		//*  61  129:getfield        #19  <Field ArrayList order>
		//*  62  132:aload_2         
		//*  63  133:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
		//*  64  136:pop             
		//*  65  137:aload_0         
		//*  66  138:aload_2         
		//*  67  139:invokevirtual   #142 <Method void inverseSearchAdd(String)>
		//*  68  142:aload_0         
		//*  69  143:getfield        #26  <Field HashMap name2Node>
		//*  70  146:aload_2         
		//*  71  147:aload_1         
		//*  72  148:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
		//*  73  151:pop             
		//*  74  152:aload_0         
		//*  75  153:getfield        #33  <Field XfaForm$Stack2 stack>
		//*  76  156:invokevirtual   #146 <Method Object XfaForm$Stack2.pop()>
		//*  77  159:pop             
		//*  78  160:aload_1         
		//*  79  161:invokeinterface #91  <Method Node Node.getNextSibling()>
		//*  80  166:astore_1        
		//*  81  167:goto            19
						obj = ((Object) (Integer.valueOf(((Integer) (obj)).intValue() + 1)));
		//   82  170:aload_2         
		//   83  171:invokevirtual   #150 <Method int Integer.intValue()>
		//   84  174:iconst_1        
		//   85  175:iadd            
		//   86  176:invokestatic    #108 <Method Integer Integer.valueOf(int)>
		//   87  179:astore_2        
					hashmap.put(((Object) (s)), obj);
					stack.push(((Object) ((new StringBuilder()).append(s).append("[").append(((Integer) (obj)).toString()).append("]").toString())));
					if(hasChildren(node))
						processDatasetsInternal(node);
					obj = ((Object) (printStack()));
					order.add(obj);
					inverseSearchAdd(((String) (obj)));
					name2Node.put(obj, ((Object) (node)));
					stack.pop();
					node = node.getNextSibling();
				}
			}
		//*  88  180:goto            63
		//   89  183:return          
		}

		public Node insertNode(Node node, String s)
		{
			Stack2 stack2 = splitParts(s);
		//    0    0:aload_2         
		//    1    1:invokestatic    #156 <Method XfaForm$Stack2 splitParts(String)>
		//    2    4:astore          9
			Document document = node.getOwnerDocument();
		//    3    6:aload_1         
		//    4    7:invokeinterface #160 <Method Document Node.getOwnerDocument()>
		//    5   12:astore          10
			Object obj = null;
		//    6   14:aconst_null     
		//    7   15:astore          7
			for(node = node.getFirstChild(); node.getNodeType() != 1; node = node.getNextSibling());
		//    8   17:aload_1         
		//    9   18:invokeinterface #84  <Method Node Node.getFirstChild()>
		//   10   23:astore_1        
		//   11   24:aload_1         
		//   12   25:invokeinterface #88  <Method short Node.getNodeType()>
		//   13   30:iconst_1        
		//   14   31:icmpeq          44
		//   15   34:aload_1         
		//   16   35:invokeinterface #91  <Method Node Node.getNextSibling()>
		//   17   40:astore_1        
		//*  18   41:goto            24
			int k = 0;
		//   19   44:iconst_0        
		//   20   45:istore          5
			Node node1 = node;
		//   21   47:aload_1         
		//   22   48:astore          8
			node = ((Node) (obj));
		//   23   50:aload           7
		//   24   52:astore_1        
			do
			{
				if(k >= stack2.size())
					break;
		//   25   53:iload           5
		//   26   55:aload           9
		//   27   57:invokevirtual   #163 <Method int XfaForm$Stack2.size()>
		//   28   60:icmpge          280
				node = ((Node) ((String)stack2.get(k)));
		//   29   63:aload           9
		//   30   65:iload           5
		//   31   67:invokevirtual   #166 <Method Object XfaForm$Stack2.get(int)>
		//   32   70:checkcast       #70  <Class String>
		//   33   73:astore_1        
				int i = ((String) (node)).lastIndexOf('[');
		//   34   74:aload_1         
		//   35   75:bipush          91
		//   36   77:invokevirtual   #170 <Method int String.lastIndexOf(int)>
		//   37   80:istore_3        
				String s1 = ((String) (node)).substring(0, i);
		//   38   81:aload_1         
		//   39   82:iconst_0        
		//   40   83:iload_3         
		//   41   84:invokevirtual   #174 <Method String String.substring(int, int)>
		//   42   87:astore          11
				int l = Integer.parseInt(((String) (node)).substring(i + 1, ((String) (node)).length() - 1));
		//   43   89:aload_1         
		//   44   90:iload_3         
		//   45   91:iconst_1        
		//   46   92:iadd            
		//   47   93:aload_1         
		//   48   94:invokevirtual   #177 <Method int String.length()>
		//   49   97:iconst_1        
		//   50   98:isub            
		//   51   99:invokevirtual   #174 <Method String String.substring(int, int)>
		//   52  102:invokestatic    #181 <Method int Integer.parseInt(String)>
		//   53  105:istore          6
				i = -1;
		//   54  107:iconst_m1       
		//   55  108:istore_3        
				Object obj1 = ((Object) (node1.getFirstChild()));
		//   56  109:aload           8
		//   57  111:invokeinterface #84  <Method Node Node.getFirstChild()>
		//   58  116:astore          7
label0:
				do
				{
					int j;
label1:
					{
						j = i;
		//   59  118:iload_3         
		//   60  119:istore          4
						node = ((Node) (obj1));
		//   61  121:aload           7
		//   62  123:astore_1        
						if(obj1 != null)
		//*  63  124:aload           7
		//*  64  126:ifnull          183
						{
							j = i;
		//   65  129:iload_3         
		//   66  130:istore          4
							if(((Node) (obj1)).getNodeType() != 1)
								break label1;
		//   67  132:aload           7
		//   68  134:invokeinterface #88  <Method short Node.getNodeType()>
		//   69  139:iconst_1        
		//   70  140:icmpne          253
							j = i;
		//   71  143:iload_3         
		//   72  144:istore          4
							if(!escapeSom(((Node) (obj1)).getLocalName()).equals(((Object) (s1))))
								break label1;
		//   73  146:aload           7
		//   74  148:invokeinterface #94  <Method String Node.getLocalName()>
		//   75  153:invokestatic    #98  <Method String escapeSom(String)>
		//   76  156:aload           11
		//   77  158:invokevirtual   #74  <Method boolean String.equals(Object)>
		//   78  161:ifeq            253
							i++;
		//   79  164:iload_3         
		//   80  165:iconst_1        
		//   81  166:iadd            
		//   82  167:istore_3        
							j = i;
		//   83  168:iload_3         
		//   84  169:istore          4
							if(i != l)
								break label1;
		//   85  171:iload_3         
		//   86  172:iload           6
		//   87  174:icmpne          253
							node = ((Node) (obj1));
		//   88  177:aload           7
		//   89  179:astore_1        
						}
						for(j = i; j < l; j++)
		//*  90  180:iload_3         
		//*  91  181:istore          4
		//*  92  183:iload           4
		//*  93  185:iload           6
		//*  94  187:icmpge          268
						{
							node = node1.appendChild(((Node) (document.createElementNS(((String) (null)), s1))));
		//   95  190:aload           8
		//   96  192:aload           10
		//   97  194:aconst_null     
		//   98  195:aload           11
		//   99  197:invokeinterface #187 <Method Element Document.createElementNS(String, String)>
		//  100  202:invokeinterface #191 <Method Node Node.appendChild(Node)>
		//  101  207:astore_1        
							obj1 = ((Object) (document.createAttributeNS("http://www.xfa.org/schema/xfa-data/1.0/", "dataNode")));
		//  102  208:aload           10
		//  103  210:ldc1            #54  <String "http://www.xfa.org/schema/xfa-data/1.0/">
		//  104  212:ldc1            #56  <String "dataNode">
		//  105  214:invokeinterface #195 <Method org.w3c.dom.Attr Document.createAttributeNS(String, String)>
		//  106  219:astore          7
							((Node) (obj1)).setNodeValue("dataGroup");
		//  107  221:aload           7
		//  108  223:ldc1            #68  <String "dataGroup">
		//  109  225:invokeinterface #198 <Method void Node.setNodeValue(String)>
							node.getAttributes().setNamedItemNS(((Node) (obj1)));
		//  110  230:aload_1         
		//  111  231:invokeinterface #52  <Method NamedNodeMap Node.getAttributes()>
		//  112  236:aload           7
		//  113  238:invokeinterface #201 <Method Node NamedNodeMap.setNamedItemNS(Node)>
		//  114  243:pop             
						}

		//  115  244:iload           4
		//  116  246:iconst_1        
		//  117  247:iadd            
		//  118  248:istore          4
						break label0;
		//  119  250:goto            183
					}
					obj1 = ((Object) (((Node) (obj1)).getNextSibling()));
		//  120  253:aload           7
		//  121  255:invokeinterface #91  <Method Node Node.getNextSibling()>
		//  122  260:astore          7
					i = j;
		//  123  262:iload           4
		//  124  264:istore_3        
				} while(true);
		//  125  265:goto            118
				node1 = node;
		//  126  268:aload_1         
		//  127  269:astore          8
				k++;
		//  128  271:iload           5
		//  129  273:iconst_1        
		//  130  274:iadd            
		//  131  275:istore          5
			} while(true);
		//  132  277:goto            53
			inverseSearchAdd(inverseSearch, stack2, s);
		//  133  280:aload_0         
		//  134  281:getfield        #40  <Field HashMap inverseSearch>
		//  135  284:aload           9
		//  136  286:aload_2         
		//  137  287:invokestatic    #204 <Method void inverseSearchAdd(HashMap, XfaForm$Stack2, String)>
			name2Node.put(((Object) (s)), ((Object) (node)));
		//  138  290:aload_0         
		//  139  291:getfield        #26  <Field HashMap name2Node>
		//  140  294:aload_2         
		//  141  295:aload_1         
		//  142  296:invokevirtual   #112 <Method Object HashMap.put(Object, Object)>
		//  143  299:pop             
			order.add(((Object) (s)));
		//  144  300:aload_0         
		//  145  301:getfield        #19  <Field ArrayList order>
		//  146  304:aload_2         
		//  147  305:invokevirtual   #138 <Method boolean ArrayList.add(Object)>
		//  148  308:pop             
			return node;
		//  149  309:aload_1         
		//  150  310:areturn         
		}

		public Xml2SomDatasets(Node node)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void XfaForm$Xml2Som()>
			order = new ArrayList();
		//    2    4:aload_0         
		//    3    5:new             #14  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #15  <Method void ArrayList()>
		//    6   12:putfield        #19  <Field ArrayList order>
			name2Node = new HashMap();
		//    7   15:aload_0         
		//    8   16:new             #21  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #22  <Method void HashMap()>
		//   11   23:putfield        #26  <Field HashMap name2Node>
			stack = new Stack2();
		//   12   26:aload_0         
		//   13   27:new             #28  <Class XfaForm$Stack2>
		//   14   30:dup             
		//   15   31:invokespecial   #29  <Method void XfaForm$Stack2()>
		//   16   34:putfield        #33  <Field XfaForm$Stack2 stack>
			anform = 0;
		//   17   37:aload_0         
		//   18   38:iconst_0        
		//   19   39:putfield        #37  <Field int anform>
			inverseSearch = new HashMap();
		//   20   42:aload_0         
		//   21   43:new             #21  <Class HashMap>
		//   22   46:dup             
		//   23   47:invokespecial   #22  <Method void HashMap()>
		//   24   50:putfield        #40  <Field HashMap inverseSearch>
			processDatasetsInternal(node);
		//   25   53:aload_0         
		//   26   54:aload_1         
		//   27   55:invokespecial   #43  <Method void processDatasetsInternal(Node)>
		//   28   58:return          
		}
	}

	public static class Xml2SomTemplate extends Xml2Som
	{

		private void processTemplate(Node node, HashMap hashmap)
		{
			HashMap hashmap1 = hashmap;
		//    0    0:aload_2         
		//    1    1:astore          7
			if(hashmap == null)
		//*   2    3:aload_2         
		//*   3    4:ifnonnull       16
				hashmap1 = new HashMap();
		//    4    7:new             #25  <Class HashMap>
		//    5   10:dup             
		//    6   11:invokespecial   #26  <Method void HashMap()>
		//    7   14:astore          7
			HashMap hashmap2 = new HashMap();
		//    8   16:new             #25  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #26  <Method void HashMap()>
		//   11   23:astore          9
			hashmap = ((HashMap) (node.getFirstChild()));
		//   12   25:aload_1         
		//   13   26:invokeinterface #58  <Method Node Node.getFirstChild()>
		//   14   31:astore_2        
			while(hashmap != null) 
		//*  15   32:aload_2         
		//*  16   33:ifnull          592
			{
				if(((Node) (hashmap)).getNodeType() == 1)
		//*  17   36:aload_2         
		//*  18   37:invokeinterface #62  <Method short Node.getNodeType()>
		//*  19   42:iconst_1        
		//*  20   43:icmpne          200
				{
					node = ((Node) (((Node) (hashmap)).getLocalName()));
		//   21   46:aload_2         
		//   22   47:invokeinterface #66  <Method String Node.getLocalName()>
		//   23   52:astore_1        
					if("subform".equals(((Object) (node))))
		//*  24   53:ldc1            #68  <String "subform">
		//*  25   55:aload_1         
		//*  26   56:invokevirtual   #74  <Method boolean String.equals(Object)>
		//*  27   59:ifeq            264
					{
						node = ((Node) (hashmap)).getAttributes().getNamedItem("name");
		//   28   62:aload_2         
		//   29   63:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
		//   30   68:ldc1            #80  <String "name">
		//   31   70:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
		//   32   75:astore_1        
						String s = "#subform";
		//   33   76:ldc1            #88  <String "#subform">
		//   34   78:astore          8
						boolean flag = true;
		//   35   80:iconst_1        
		//   36   81:istore_3        
						if(node != null)
		//*  37   82:aload_1         
		//*  38   83:ifnull          99
						{
							s = escapeSom(node.getNodeValue());
		//   39   86:aload_1         
		//   40   87:invokeinterface #91  <Method String Node.getNodeValue()>
		//   41   92:invokestatic    #95  <Method String escapeSom(String)>
		//   42   95:astore          8
							flag = false;
		//   43   97:iconst_0        
		//   44   98:istore_3        
						}
						if(flag)
		//*  45   99:iload_3         
		//*  46  100:ifeq            210
						{
							node = ((Node) (Integer.valueOf(anform)));
		//   47  103:aload_0         
		//   48  104:getfield        #40  <Field int anform>
		//   49  107:invokestatic    #101 <Method Integer Integer.valueOf(int)>
		//   50  110:astore_1        
							anform = anform + 1;
		//   51  111:aload_0         
		//   52  112:aload_0         
		//   53  113:getfield        #40  <Field int anform>
		//   54  116:iconst_1        
		//   55  117:iadd            
		//   56  118:putfield        #40  <Field int anform>
						} else
		//*  57  121:aload_0         
		//*  58  122:getfield        #37  <Field XfaForm$Stack2 stack>
		//*  59  125:new             #103 <Class StringBuilder>
		//*  60  128:dup             
		//*  61  129:invokespecial   #104 <Method void StringBuilder()>
		//*  62  132:aload           8
		//*  63  134:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//*  64  137:ldc1            #110 <String "[">
		//*  65  139:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//*  66  142:aload_1         
		//*  67  143:invokevirtual   #113 <Method String Integer.toString()>
		//*  68  146:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//*  69  149:ldc1            #115 <String "]">
		//*  70  151:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//*  71  154:invokevirtual   #116 <Method String StringBuilder.toString()>
		//*  72  157:invokevirtual   #120 <Method Object XfaForm$Stack2.push(Object)>
		//*  73  160:pop             
		//*  74  161:aload_0         
		//*  75  162:aload_0         
		//*  76  163:getfield        #42  <Field int templateLevel>
		//*  77  166:iconst_1        
		//*  78  167:iadd            
		//*  79  168:putfield        #42  <Field int templateLevel>
		//*  80  171:iload_3         
		//*  81  172:ifeq            255
		//*  82  175:aload_0         
		//*  83  176:aload_2         
		//*  84  177:aload           7
		//*  85  179:invokespecial   #49  <Method void processTemplate(Node, HashMap)>
		//*  86  182:aload_0         
		//*  87  183:aload_0         
		//*  88  184:getfield        #42  <Field int templateLevel>
		//*  89  187:iconst_1        
		//*  90  188:isub            
		//*  91  189:putfield        #42  <Field int templateLevel>
		//*  92  192:aload_0         
		//*  93  193:getfield        #37  <Field XfaForm$Stack2 stack>
		//*  94  196:invokevirtual   #124 <Method Object XfaForm$Stack2.pop()>
		//*  95  199:pop             
		//*  96  200:aload_2         
		//*  97  201:invokeinterface #127 <Method Node Node.getNextSibling()>
		//*  98  206:astore_2        
		//*  99  207:goto            32
						{
							node = ((Node) ((Integer)hashmap2.get(((Object) (s)))));
		//  100  210:aload           9
		//  101  212:aload           8
		//  102  214:invokevirtual   #130 <Method Object HashMap.get(Object)>
		//  103  217:checkcast       #97  <Class Integer>
		//  104  220:astore_1        
							if(node == null)
		//* 105  221:aload_1         
		//* 106  222:ifnonnull       242
								node = ((Node) (Integer.valueOf(0)));
		//  107  225:iconst_0        
		//  108  226:invokestatic    #101 <Method Integer Integer.valueOf(int)>
		//  109  229:astore_1        
							else
		//* 110  230:aload           9
		//* 111  232:aload           8
		//* 112  234:aload_1         
		//* 113  235:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
		//* 114  238:pop             
		//* 115  239:goto            121
								node = ((Node) (Integer.valueOf(((Integer) (node)).intValue() + 1)));
		//  116  242:aload_1         
		//  117  243:invokevirtual   #138 <Method int Integer.intValue()>
		//  118  246:iconst_1        
		//  119  247:iadd            
		//  120  248:invokestatic    #101 <Method Integer Integer.valueOf(int)>
		//  121  251:astore_1        
							hashmap2.put(((Object) (s)), ((Object) (node)));
						}
						stack.push(((Object) ((new StringBuilder()).append(s).append("[").append(((Integer) (node)).toString()).append("]").toString())));
						templateLevel = templateLevel + 1;
						if(flag)
							processTemplate(((Node) (hashmap)), hashmap1);
						else
		//* 122  252:goto            230
							processTemplate(((Node) (hashmap)), ((HashMap) (null)));
		//  123  255:aload_0         
		//  124  256:aload_2         
		//  125  257:aconst_null     
		//  126  258:invokespecial   #49  <Method void processTemplate(Node, HashMap)>
						templateLevel = templateLevel - 1;
						stack.pop();
					} else
		//* 127  261:goto            182
					if("field".equals(((Object) (node))) || "exclGroup".equals(((Object) (node))))
		//* 128  264:ldc1            #140 <String "field">
		//* 129  266:aload_1         
		//* 130  267:invokevirtual   #74  <Method boolean String.equals(Object)>
		//* 131  270:ifne            282
		//* 132  273:ldc1            #142 <String "exclGroup">
		//* 133  275:aload_1         
		//* 134  276:invokevirtual   #74  <Method boolean String.equals(Object)>
		//* 135  279:ifeq            433
					{
						node = ((Node) (hashmap)).getAttributes().getNamedItem("name");
		//  136  282:aload_2         
		//  137  283:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
		//  138  288:ldc1            #80  <String "name">
		//  139  290:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
		//  140  295:astore_1        
						if(node != null)
		//* 141  296:aload_1         
		//* 142  297:ifnull          200
						{
							String s1 = escapeSom(node.getNodeValue());
		//  143  300:aload_1         
		//  144  301:invokeinterface #91  <Method String Node.getNodeValue()>
		//  145  306:invokestatic    #95  <Method String escapeSom(String)>
		//  146  309:astore          8
							node = ((Node) ((Integer)hashmap1.get(((Object) (s1)))));
		//  147  311:aload           7
		//  148  313:aload           8
		//  149  315:invokevirtual   #130 <Method Object HashMap.get(Object)>
		//  150  318:checkcast       #97  <Class Integer>
		//  151  321:astore_1        
							if(node == null)
		//* 152  322:aload_1         
		//* 153  323:ifnonnull       420
								node = ((Node) (Integer.valueOf(0)));
		//  154  326:iconst_0        
		//  155  327:invokestatic    #101 <Method Integer Integer.valueOf(int)>
		//  156  330:astore_1        
							else
		//* 157  331:aload           7
		//* 158  333:aload           8
		//* 159  335:aload_1         
		//* 160  336:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
		//* 161  339:pop             
		//* 162  340:aload_0         
		//* 163  341:getfield        #37  <Field XfaForm$Stack2 stack>
		//* 164  344:new             #103 <Class StringBuilder>
		//* 165  347:dup             
		//* 166  348:invokespecial   #104 <Method void StringBuilder()>
		//* 167  351:aload           8
		//* 168  353:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//* 169  356:ldc1            #110 <String "[">
		//* 170  358:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//* 171  361:aload_1         
		//* 172  362:invokevirtual   #113 <Method String Integer.toString()>
		//* 173  365:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//* 174  368:ldc1            #115 <String "]">
		//* 175  370:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//* 176  373:invokevirtual   #116 <Method String StringBuilder.toString()>
		//* 177  376:invokevirtual   #120 <Method Object XfaForm$Stack2.push(Object)>
		//* 178  379:pop             
		//* 179  380:aload_0         
		//* 180  381:invokevirtual   #145 <Method String printStack()>
		//* 181  384:astore_1        
		//* 182  385:aload_0         
		//* 183  386:getfield        #23  <Field ArrayList order>
		//* 184  389:aload_1         
		//* 185  390:invokevirtual   #148 <Method boolean ArrayList.add(Object)>
		//* 186  393:pop             
		//* 187  394:aload_0         
		//* 188  395:aload_1         
		//* 189  396:invokevirtual   #152 <Method void inverseSearchAdd(String)>
		//* 190  399:aload_0         
		//* 191  400:getfield        #30  <Field HashMap name2Node>
		//* 192  403:aload_1         
		//* 193  404:aload_2         
		//* 194  405:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
		//* 195  408:pop             
		//* 196  409:aload_0         
		//* 197  410:getfield        #37  <Field XfaForm$Stack2 stack>
		//* 198  413:invokevirtual   #124 <Method Object XfaForm$Stack2.pop()>
		//* 199  416:pop             
		//* 200  417:goto            200
								node = ((Node) (Integer.valueOf(((Integer) (node)).intValue() + 1)));
		//  201  420:aload_1         
		//  202  421:invokevirtual   #138 <Method int Integer.intValue()>
		//  203  424:iconst_1        
		//  204  425:iadd            
		//  205  426:invokestatic    #101 <Method Integer Integer.valueOf(int)>
		//  206  429:astore_1        
							hashmap1.put(((Object) (s1)), ((Object) (node)));
							stack.push(((Object) ((new StringBuilder()).append(s1).append("[").append(((Integer) (node)).toString()).append("]").toString())));
							node = ((Node) (printStack()));
							order.add(((Object) (node)));
							inverseSearchAdd(((String) (node)));
							name2Node.put(((Object) (node)), ((Object) (hashmap)));
							stack.pop();
						}
					} else
		//* 207  430:goto            331
					if(!dynamicForm && templateLevel > 0 && "occur".equals(((Object) (node))))
		//* 208  433:aload_0         
		//* 209  434:getfield        #154 <Field boolean dynamicForm>
		//* 210  437:ifne            200
		//* 211  440:aload_0         
		//* 212  441:getfield        #42  <Field int templateLevel>
		//* 213  444:ifle            200
		//* 214  447:ldc1            #156 <String "occur">
		//* 215  449:aload_1         
		//* 216  450:invokevirtual   #74  <Method boolean String.equals(Object)>
		//* 217  453:ifeq            200
					{
						int j = 1;
		//  218  456:iconst_1        
		//  219  457:istore          4
						int k = 1;
		//  220  459:iconst_1        
		//  221  460:istore          5
						boolean flag1 = true;
		//  222  462:iconst_1        
		//  223  463:istore          6
						node = ((Node) (hashmap)).getAttributes().getNamedItem("initial");
		//  224  465:aload_2         
		//  225  466:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
		//  226  471:ldc1            #158 <String "initial">
		//  227  473:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
		//  228  478:astore_1        
						int i = j;
		//  229  479:iload           4
		//  230  481:istore_3        
						if(node != null)
		//* 231  482:aload_1         
		//* 232  483:ifnull          499
							try
							{
								i = Integer.parseInt(node.getNodeValue().trim());
		//  233  486:aload_1         
		//  234  487:invokeinterface #91  <Method String Node.getNodeValue()>
		//  235  492:invokevirtual   #161 <Method String String.trim()>
		//  236  495:invokestatic    #165 <Method int Integer.parseInt(String)>
		//  237  498:istore_3        
							}
		//* 238  499:aload_2         
		//* 239  500:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
		//* 240  505:ldc1            #167 <String "min">
		//* 241  507:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
		//* 242  512:astore_1        
		//* 243  513:iload           5
		//* 244  515:istore          4
		//* 245  517:aload_1         
		//* 246  518:ifnull          535
		//* 247  521:aload_1         
		//* 248  522:invokeinterface #91  <Method String Node.getNodeValue()>
		//* 249  527:invokevirtual   #161 <Method String String.trim()>
		//* 250  530:invokestatic    #165 <Method int Integer.parseInt(String)>
		//* 251  533:istore          4
		//* 252  535:aload_2         
		//* 253  536:invokeinterface #78  <Method NamedNodeMap Node.getAttributes()>
		//* 254  541:ldc1            #169 <String "max">
		//* 255  543:invokeinterface #86  <Method Node NamedNodeMap.getNamedItem(String)>
		//* 256  548:astore_1        
		//* 257  549:iload           6
		//* 258  551:istore          5
		//* 259  553:aload_1         
		//* 260  554:ifnull          571
		//* 261  557:aload_1         
		//* 262  558:invokeinterface #91  <Method String Node.getNodeValue()>
		//* 263  563:invokevirtual   #161 <Method String String.trim()>
		//* 264  566:invokestatic    #165 <Method int Integer.parseInt(String)>
		//* 265  569:istore          5
		//* 266  571:iload_3         
		//* 267  572:iload           4
		//* 268  574:icmpne          584
		//* 269  577:iload           4
		//* 270  579:iload           5
		//* 271  581:icmpeq          200
		//* 272  584:aload_0         
		//* 273  585:iconst_1        
		//* 274  586:putfield        #154 <Field boolean dynamicForm>
		//* 275  589:goto            200
		//* 276  592:return          
		//* 277  593:astore_1        
		//* 278  594:iload           6
		//* 279  596:istore          5
		//* 280  598:goto            571
		//* 281  601:astore_1        
		//* 282  602:iload           5
		//* 283  604:istore          4
		//* 284  606:goto            535
							// Misplaced declaration of an exception variable
							catch(Node node)
		//* 285  609:astore_1        
							{
								i = j;
		//  286  610:iload           4
		//  287  612:istore_3        
							}
						node = ((Node) (hashmap)).getAttributes().getNamedItem("min");
						j = k;
						if(node != null)
							try
							{
								j = Integer.parseInt(node.getNodeValue().trim());
							}
							// Misplaced declaration of an exception variable
							catch(Node node)
							{
								j = k;
							}
						node = ((Node) (hashmap)).getAttributes().getNamedItem("max");
						k = ((int) (flag1));
						if(node != null)
							try
							{
								k = Integer.parseInt(node.getNodeValue().trim());
							}
							// Misplaced declaration of an exception variable
							catch(Node node)
							{
								k = ((int) (flag1));
							}
						if(i != j || j != k)
							dynamicForm = true;
					}
				}
				hashmap = ((HashMap) (((Node) (hashmap)).getNextSibling()));
			}
		//* 288  613:goto            499
		}

		public String getFieldType(String s)
		{
			s = ((String) ((Node)name2Node.get(((Object) (s)))));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field HashMap name2Node>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #130 <Method Object HashMap.get(Object)>
		//    4    8:checkcast       #54  <Class Node>
		//    5   11:astore_1        
			if(s != null) goto _L2; else goto _L1
		//    6   12:aload_1         
		//    7   13:ifnonnull       18
_L1:
			return null;
		//    8   16:aconst_null     
		//    9   17:areturn         
_L2:
			if("exclGroup".equals(((Object) (((Node) (s)).getLocalName()))))
		//*  10   18:ldc1            #142 <String "exclGroup">
		//*  11   20:aload_1         
		//*  12   21:invokeinterface #66  <Method String Node.getLocalName()>
		//*  13   26:invokevirtual   #74  <Method boolean String.equals(Object)>
		//*  14   29:ifeq            35
				return "exclGroup";
		//   15   32:ldc1            #142 <String "exclGroup">
		//   16   34:areturn         
			s = ((String) (((Node) (s)).getFirstChild()));
		//   17   35:aload_1         
		//   18   36:invokeinterface #58  <Method Node Node.getFirstChild()>
		//   19   41:astore_1        
_L6:
			if(s != null && (((Node) (s)).getNodeType() != 1 || !"ui".equals(((Object) (((Node) (s)).getLocalName()))))) goto _L4; else goto _L3
		//   20   42:aload_1         
		//   21   43:ifnull          70
		//   22   46:aload_1         
		//   23   47:invokeinterface #62  <Method short Node.getNodeType()>
		//   24   52:iconst_1        
		//   25   53:icmpne          130
		//   26   56:ldc1            #174 <String "ui">
		//   27   58:aload_1         
		//   28   59:invokeinterface #66  <Method String Node.getLocalName()>
		//   29   64:invokevirtual   #74  <Method boolean String.equals(Object)>
		//   30   67:ifeq            130
_L3:
			if(s == null) goto _L1; else goto _L5
		//   31   70:aload_1         
		//   32   71:ifnull          16
_L5:
			s = ((String) (((Node) (s)).getFirstChild()));
		//   33   74:aload_1         
		//   34   75:invokeinterface #58  <Method Node Node.getFirstChild()>
		//   35   80:astore_1        
_L7:
			if(s != null)
		//*  36   81:aload_1         
		//*  37   82:ifnull          16
			{
				if(((Node) (s)).getNodeType() == 1 && (!"extras".equals(((Object) (((Node) (s)).getLocalName()))) || !"picture".equals(((Object) (((Node) (s)).getLocalName())))))
		//*  38   85:aload_1         
		//*  39   86:invokeinterface #62  <Method short Node.getNodeType()>
		//*  40   91:iconst_1        
		//*  41   92:icmpne          140
		//*  42   95:ldc1            #176 <String "extras">
		//*  43   97:aload_1         
		//*  44   98:invokeinterface #66  <Method String Node.getLocalName()>
		//*  45  103:invokevirtual   #74  <Method boolean String.equals(Object)>
		//*  46  106:ifeq            123
		//*  47  109:ldc1            #178 <String "picture">
		//*  48  111:aload_1         
		//*  49  112:invokeinterface #66  <Method String Node.getLocalName()>
		//*  50  117:invokevirtual   #74  <Method boolean String.equals(Object)>
		//*  51  120:ifne            140
					return ((Node) (s)).getLocalName();
		//   52  123:aload_1         
		//   53  124:invokeinterface #66  <Method String Node.getLocalName()>
		//   54  129:areturn         
				break MISSING_BLOCK_LABEL_140;
			}
			  goto _L1
_L4:
			s = ((String) (((Node) (s)).getNextSibling()));
		//   55  130:aload_1         
		//   56  131:invokeinterface #127 <Method Node Node.getNextSibling()>
		//   57  136:astore_1        
			  goto _L6
		//*  58  137:goto            42
			s = ((String) (((Node) (s)).getNextSibling()));
		//   59  140:aload_1         
		//   60  141:invokeinterface #127 <Method Node Node.getNextSibling()>
		//   61  146:astore_1        
			  goto _L7
		//*  62  147:goto            81
		}

		public boolean isDynamicForm()
		{
			return dynamicForm;
		//    0    0:aload_0         
		//    1    1:getfield        #154 <Field boolean dynamicForm>
		//    2    4:ireturn         
		}

		public void setDynamicForm(boolean flag)
		{
			dynamicForm = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #154 <Field boolean dynamicForm>
		//    3    5:return          
		}

		private boolean dynamicForm;
		private int templateLevel;

		public Xml2SomTemplate(Node node)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void XfaForm$Xml2Som()>
			order = new ArrayList();
		//    2    4:aload_0         
		//    3    5:new             #18  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void ArrayList()>
		//    6   12:putfield        #23  <Field ArrayList order>
			name2Node = new HashMap();
		//    7   15:aload_0         
		//    8   16:new             #25  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #26  <Method void HashMap()>
		//   11   23:putfield        #30  <Field HashMap name2Node>
			stack = new Stack2();
		//   12   26:aload_0         
		//   13   27:new             #32  <Class XfaForm$Stack2>
		//   14   30:dup             
		//   15   31:invokespecial   #33  <Method void XfaForm$Stack2()>
		//   16   34:putfield        #37  <Field XfaForm$Stack2 stack>
			anform = 0;
		//   17   37:aload_0         
		//   18   38:iconst_0        
		//   19   39:putfield        #40  <Field int anform>
			templateLevel = 0;
		//   20   42:aload_0         
		//   21   43:iconst_0        
		//   22   44:putfield        #42  <Field int templateLevel>
			inverseSearch = new HashMap();
		//   23   47:aload_0         
		//   24   48:new             #25  <Class HashMap>
		//   25   51:dup             
		//   26   52:invokespecial   #26  <Method void HashMap()>
		//   27   55:putfield        #45  <Field HashMap inverseSearch>
			processTemplate(node, ((HashMap) (null)));
		//   28   58:aload_0         
		//   29   59:aload_1         
		//   30   60:aconst_null     
		//   31   61:invokespecial   #49  <Method void processTemplate(Node, HashMap)>
		//   32   64:return          
		}
	}


	public XfaForm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:return          
	}

	public XfaForm(PdfReader pdfreader)
		throws IOException, ParserConfigurationException, SAXException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		reader = pdfreader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #56  <Field PdfReader reader>
		Object obj = ((Object) (getXfaObject(pdfreader)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #60  <Method PdfObject getXfaObject(PdfReader)>
	//    7   13:astore_3        
		if(obj == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       24
		{
			xfaPresent = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #62  <Field boolean xfaPresent>
			return;
	//   13   23:return          
		}
		xfaPresent = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #62  <Field boolean xfaPresent>
		pdfreader = ((PdfReader) (new ByteArrayOutputStream()));
	//   17   29:new             #64  <Class ByteArrayOutputStream>
	//   18   32:dup             
	//   19   33:invokespecial   #65  <Method void ByteArrayOutputStream()>
	//   20   36:astore_1        
		if(((PdfObject) (obj)).isArray())
	//*  21   37:aload_3         
	//*  22   38:invokevirtual   #71  <Method boolean PdfObject.isArray()>
	//*  23   41:ifeq            93
		{
			obj = ((Object) ((PdfArray)obj));
	//   24   44:aload_3         
	//   25   45:checkcast       #73  <Class PdfArray>
	//   26   48:astore_3        
			for(int i = 1; i < ((PdfArray) (obj)).size(); i += 2)
	//*  27   49:iconst_1        
	//*  28   50:istore_2        
	//*  29   51:iload_2         
	//*  30   52:aload_3         
	//*  31   53:invokevirtual   #77  <Method int PdfArray.size()>
	//*  32   56:icmpge          111
			{
				PdfObject pdfobject = ((PdfArray) (obj)).getDirectObject(i);
	//   33   59:aload_3         
	//   34   60:iload_2         
	//   35   61:invokevirtual   #81  <Method PdfObject PdfArray.getDirectObject(int)>
	//   36   64:astore          4
				if(pdfobject instanceof PRStream)
	//*  37   66:aload           4
	//*  38   68:instanceof      #83  <Class PRStream>
	//*  39   71:ifeq            86
					((ByteArrayOutputStream) (pdfreader)).write(PdfReader.getStreamBytes((PRStream)pdfobject));
	//   40   74:aload_1         
	//   41   75:aload           4
	//   42   77:checkcast       #83  <Class PRStream>
	//   43   80:invokestatic    #89  <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   44   83:invokevirtual   #93  <Method void ByteArrayOutputStream.write(byte[])>
			}

	//   45   86:iload_2         
	//   46   87:iconst_2        
	//   47   88:iadd            
	//   48   89:istore_2        
		} else
	//*  49   90:goto            51
		if(obj instanceof PRStream)
	//*  50   93:aload_3         
	//*  51   94:instanceof      #83  <Class PRStream>
	//*  52   97:ifeq            111
			((ByteArrayOutputStream) (pdfreader)).write(PdfReader.getStreamBytes((PRStream)obj));
	//   53  100:aload_1         
	//   54  101:aload_3         
	//   55  102:checkcast       #83  <Class PRStream>
	//   56  105:invokestatic    #89  <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   57  108:invokevirtual   #93  <Method void ByteArrayOutputStream.write(byte[])>
		((ByteArrayOutputStream) (pdfreader)).close();
	//   58  111:aload_1         
	//   59  112:invokevirtual   #96  <Method void ByteArrayOutputStream.close()>
		obj = ((Object) (DocumentBuilderFactory.newInstance()));
	//   60  115:invokestatic    #102 <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//   61  118:astore_3        
		((DocumentBuilderFactory) (obj)).setNamespaceAware(true);
	//   62  119:aload_3         
	//   63  120:iconst_1        
	//   64  121:invokevirtual   #106 <Method void DocumentBuilderFactory.setNamespaceAware(boolean)>
		domDocument = ((DocumentBuilderFactory) (obj)).newDocumentBuilder().parse(((InputStream) (new ByteArrayInputStream(((ByteArrayOutputStream) (pdfreader)).toByteArray()))));
	//   65  124:aload_0         
	//   66  125:aload_3         
	//   67  126:invokevirtual   #110 <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//   68  129:new             #112 <Class ByteArrayInputStream>
	//   69  132:dup             
	//   70  133:aload_1         
	//   71  134:invokevirtual   #116 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   72  137:invokespecial   #118 <Method void ByteArrayInputStream(byte[])>
	//   73  140:invokevirtual   #124 <Method Document DocumentBuilder.parse(InputStream)>
	//   74  143:putfield        #126 <Field Document domDocument>
		extractNodes();
	//   75  146:aload_0         
	//   76  147:invokespecial   #129 <Method void extractNodes()>
	//   77  150:return          
	}

	private void createDatasetsNode(Node node)
	{
		for(; node.getChildNodes().getLength() == 0; node = node.getNextSibling());
	//    0    0:aload_1         
	//    1    1:invokeinterface #138 <Method NodeList Node.getChildNodes()>
	//    2    6:invokeinterface #143 <Method int NodeList.getLength()>
	//    3   11:ifne            24
	//    4   14:aload_1         
	//    5   15:invokeinterface #147 <Method Node Node.getNextSibling()>
	//    6   20:astore_1        
	//*   7   21:goto            0
		if(node != null)
	//*   8   24:aload_1         
	//*   9   25:ifnull          68
		{
			Element element = node.getOwnerDocument().createElement("xfa:datasets");
	//   10   28:aload_1         
	//   11   29:invokeinterface #151 <Method Document Node.getOwnerDocument()>
	//   12   34:ldc1            #153 <String "xfa:datasets">
	//   13   36:invokeinterface #159 <Method Element Document.createElement(String)>
	//   14   41:astore_2        
			element.setAttribute("xmlns:xfa", "http://www.xfa.org/schema/xfa-data/1.0/");
	//   15   42:aload_2         
	//   16   43:ldc1            #161 <String "xmlns:xfa">
	//   17   45:ldc1            #26  <String "http://www.xfa.org/schema/xfa-data/1.0/">
	//   18   47:invokeinterface #167 <Method void Element.setAttribute(String, String)>
			datasetsNode = ((Node) (element));
	//   19   52:aload_0         
	//   20   53:aload_2         
	//   21   54:putfield        #169 <Field Node datasetsNode>
			node.appendChild(datasetsNode);
	//   22   57:aload_1         
	//   23   58:aload_0         
	//   24   59:getfield        #169 <Field Node datasetsNode>
	//   25   62:invokeinterface #173 <Method Node Node.appendChild(Node)>
	//   26   67:pop             
		}
	//   27   68:return          
	}

	private void extractNodes()
	{
		Object obj = ((Object) (extractXFANodes(domDocument)));
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Document domDocument>
	//    2    4:invokestatic    #177 <Method Map extractXFANodes(Document)>
	//    3    7:astore_1        
		if(((Map) (obj)).containsKey("template"))
	//*   4    8:aload_1         
	//*   5    9:ldc1            #179 <String "template">
	//*   6   11:invokeinterface #185 <Method boolean Map.containsKey(Object)>
	//*   7   16:ifeq            49
		{
			templateNode = (Node)((Map) (obj)).get("template");
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:ldc1            #179 <String "template">
	//   11   23:invokeinterface #189 <Method Object Map.get(Object)>
	//   12   28:checkcast       #134 <Class Node>
	//   13   31:putfield        #191 <Field Node templateNode>
			templateSom = new Xml2SomTemplate(templateNode);
	//   14   34:aload_0         
	//   15   35:new             #21  <Class XfaForm$Xml2SomTemplate>
	//   16   38:dup             
	//   17   39:aload_0         
	//   18   40:getfield        #191 <Field Node templateNode>
	//   19   43:invokespecial   #193 <Method void XfaForm$Xml2SomTemplate(Node)>
	//   20   46:putfield        #195 <Field XfaForm$Xml2SomTemplate templateSom>
		}
		if(((Map) (obj)).containsKey("datasets"))
	//*  21   49:aload_1         
	//*  22   50:ldc1            #197 <String "datasets">
	//*  23   52:invokeinterface #185 <Method boolean Map.containsKey(Object)>
	//*  24   57:ifeq            100
		{
			datasetsNode = (Node)((Map) (obj)).get("datasets");
	//   25   60:aload_0         
	//   26   61:aload_1         
	//   27   62:ldc1            #197 <String "datasets">
	//   28   64:invokeinterface #189 <Method Object Map.get(Object)>
	//   29   69:checkcast       #134 <Class Node>
	//   30   72:putfield        #169 <Field Node datasetsNode>
			obj = ((Object) (findDataNode(datasetsNode)));
	//   31   75:aload_0         
	//   32   76:aload_0         
	//   33   77:getfield        #169 <Field Node datasetsNode>
	//   34   80:invokespecial   #200 <Method Node findDataNode(Node)>
	//   35   83:astore_1        
			if(obj == null)
	//*  36   84:aload_1         
	//*  37   85:ifnull          121
	//*  38   88:aload_0         
	//*  39   89:new             #18  <Class XfaForm$Xml2SomDatasets>
	//*  40   92:dup             
	//*  41   93:aload_1         
	//*  42   94:invokespecial   #201 <Method void XfaForm$Xml2SomDatasets(Node)>
	//*  43   97:putfield        #203 <Field XfaForm$Xml2SomDatasets datasetsSom>
	//*  44  100:aload_0         
	//*  45  101:getfield        #169 <Field Node datasetsNode>
	//*  46  104:ifnonnull       120
	//*  47  107:aload_0         
	//*  48  108:aload_0         
	//*  49  109:getfield        #126 <Field Document domDocument>
	//*  50  112:invokeinterface #206 <Method Node Document.getFirstChild()>
	//*  51  117:invokespecial   #208 <Method void createDatasetsNode(Node)>
	//*  52  120:return          
				obj = ((Object) (datasetsNode.getFirstChild()));
	//   53  121:aload_0         
	//   54  122:getfield        #169 <Field Node datasetsNode>
	//   55  125:invokeinterface #209 <Method Node Node.getFirstChild()>
	//   56  130:astore_1        
			datasetsSom = new Xml2SomDatasets(((Node) (obj)));
		}
		if(datasetsNode == null)
			createDatasetsNode(domDocument.getFirstChild());
	//*  57  131:goto            88
	}

	public static Map extractXFANodes(Document document)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #211 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #212 <Method void HashMap()>
	//    3    7:astore_1        
		for(document = ((Document) (document.getFirstChild())); ((Node) (document)).getChildNodes().getLength() == 0; document = ((Document) (((Node) (document)).getNextSibling())));
	//    4    8:aload_0         
	//    5    9:invokeinterface #206 <Method Node Document.getFirstChild()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #138 <Method NodeList Node.getChildNodes()>
	//    9   21:invokeinterface #143 <Method int NodeList.getLength()>
	//   10   26:ifne            39
	//   11   29:aload_0         
	//   12   30:invokeinterface #147 <Method Node Node.getNextSibling()>
	//   13   35:astore_0        
	//*  14   36:goto            15
		for(document = ((Document) (((Node) (document)).getFirstChild())); document != null; document = ((Document) (((Node) (document)).getNextSibling())))
	//*  15   39:aload_0         
	//*  16   40:invokeinterface #209 <Method Node Node.getFirstChild()>
	//*  17   45:astore_0        
	//*  18   46:aload_0         
	//*  19   47:ifnull          84
			if(((Node) (document)).getNodeType() == 1)
	//*  20   50:aload_0         
	//*  21   51:invokeinterface #216 <Method short Node.getNodeType()>
	//*  22   56:iconst_1        
	//*  23   57:icmpne          74
				((Map) (hashmap)).put(((Object) (((Node) (document)).getLocalName())), ((Object) (document)));
	//   24   60:aload_1         
	//   25   61:aload_0         
	//   26   62:invokeinterface #220 <Method String Node.getLocalName()>
	//   27   67:aload_0         
	//   28   68:invokeinterface #224 <Method Object Map.put(Object, Object)>
	//   29   73:pop             

	//   30   74:aload_0         
	//   31   75:invokeinterface #147 <Method Node Node.getNextSibling()>
	//   32   80:astore_0        
	//*  33   81:goto            46
		return ((Map) (hashmap));
	//   34   84:aload_1         
	//   35   85:areturn         
	}

	private Node findDataNode(Node node)
	{
		node = ((Node) (node.getChildNodes()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #138 <Method NodeList Node.getChildNodes()>
	//    2    6:astore_1        
		for(int i = 0; i < ((NodeList) (node)).getLength(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:aload_1         
	//*   7   11:invokeinterface #143 <Method int NodeList.getLength()>
	//*   8   16:icmpge          54
			if(((NodeList) (node)).item(i).getNodeName().equals("xfa:data"))
	//*   9   19:aload_1         
	//*  10   20:iload_2         
	//*  11   21:invokeinterface #230 <Method Node NodeList.item(int)>
	//*  12   26:invokeinterface #233 <Method String Node.getNodeName()>
	//*  13   31:ldc1            #235 <String "xfa:data">
	//*  14   33:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  15   36:ifeq            47
				return ((NodeList) (node)).item(i);
	//   16   39:aload_1         
	//   17   40:iload_2         
	//   18   41:invokeinterface #230 <Method Node NodeList.item(int)>
	//   19   46:areturn         

	//   20   47:iload_2         
	//   21   48:iconst_1        
	//   22   49:iadd            
	//   23   50:istore_2        
	//*  24   51:goto            9
		return null;
	//   25   54:aconst_null     
	//   26   55:areturn         
	}

	private Node getFirstElementNode(Node node)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		NodeList nodelist = node.getChildNodes();
	//    2    2:aload_1         
	//    3    3:invokeinterface #138 <Method NodeList Node.getChildNodes()>
	//    4    8:astore          4
		int i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		do
		{
label0:
			{
				node = ((Node) (obj));
	//    7   12:aload_3         
	//    8   13:astore_1        
				if(i < nodelist.getLength())
	//*   9   14:iload_2         
	//*  10   15:aload           4
	//*  11   17:invokeinterface #143 <Method int NodeList.getLength()>
	//*  12   22:icmpge          51
				{
					if(nodelist.item(i).getNodeType() != 1)
						break label0;
	//   13   25:aload           4
	//   14   27:iload_2         
	//   15   28:invokeinterface #230 <Method Node NodeList.item(int)>
	//   16   33:invokeinterface #216 <Method short Node.getNodeType()>
	//   17   38:iconst_1        
	//   18   39:icmpne          53
					node = nodelist.item(i);
	//   19   42:aload           4
	//   20   44:iload_2         
	//   21   45:invokeinterface #230 <Method Node NodeList.item(int)>
	//   22   50:astore_1        
				}
				return node;
	//   23   51:aload_1         
	//   24   52:areturn         
			}
			i++;
	//   25   53:iload_2         
	//   26   54:iconst_1        
	//   27   55:iadd            
	//   28   56:istore_2        
		} while(true);
	//   29   57:goto            12
	}

	public static String getNodeText(Node node)
	{
		if(node == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #245 <String "">
	//    3    6:areturn         
		else
			return getNodeText(node, "");
	//    4    7:aload_0         
	//    5    8:ldc1            #245 <String "">
	//    6   10:invokestatic    #248 <Method String getNodeText(Node, String)>
	//    7   13:areturn         
	}

	private static String getNodeText(Node node, String s)
	{
		node = node.getFirstChild();
	//    0    0:aload_0         
	//    1    1:invokeinterface #209 <Method Node Node.getFirstChild()>
	//    2    6:astore_0        
		Object obj = ((Object) (s));
	//    3    7:aload_1         
	//    4    8:astore_2        
		s = ((String) (node));
	//    5    9:aload_0         
	//    6   10:astore_1        
		while(s != null) 
	//*   7   11:aload_1         
	//*   8   12:ifnull          82
		{
			if(((Node) (s)).getNodeType() == 1)
	//*   9   15:aload_1         
	//*  10   16:invokeinterface #216 <Method short Node.getNodeType()>
	//*  11   21:iconst_1        
	//*  12   22:icmpne          43
			{
				node = ((Node) (getNodeText(((Node) (s)), ((String) (obj)))));
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokestatic    #248 <Method String getNodeText(Node, String)>
	//   16   30:astore_0        
			} else
	//*  17   31:aload_1         
	//*  18   32:invokeinterface #147 <Method Node Node.getNextSibling()>
	//*  19   37:astore_1        
	//*  20   38:aload_0         
	//*  21   39:astore_2        
	//*  22   40:goto            11
			{
				node = ((Node) (obj));
	//   23   43:aload_2         
	//   24   44:astore_0        
				if(((Node) (s)).getNodeType() == 3)
	//*  25   45:aload_1         
	//*  26   46:invokeinterface #216 <Method short Node.getNodeType()>
	//*  27   51:iconst_3        
	//*  28   52:icmpne          31
					node = ((Node) ((new StringBuilder()).append(((String) (obj))).append(((Node) (s)).getNodeValue()).toString()));
	//   29   55:new             #250 <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #251 <Method void StringBuilder()>
	//   32   62:aload_2         
	//   33   63:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:aload_1         
	//   35   67:invokeinterface #258 <Method String Node.getNodeValue()>
	//   36   72:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   37   75:invokevirtual   #261 <Method String StringBuilder.toString()>
	//   38   78:astore_0        
			}
			s = ((String) (((Node) (s)).getNextSibling()));
			obj = ((Object) (node));
		}
	//*  39   79:goto            31
		return ((String) (obj));
	//   40   82:aload_2         
	//   41   83:areturn         
	}

	public static PdfObject getXfaObject(PdfReader pdfreader)
	{
		pdfreader = ((PdfReader) ((PdfDictionary)PdfReader.getPdfObjectRelease(pdfreader.getCatalog().get(PdfName.ACROFORM))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #265 <Method PdfDictionary PdfReader.getCatalog()>
	//    2    4:getstatic       #271 <Field PdfName PdfName.ACROFORM>
	//    3    7:invokevirtual   #276 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:invokestatic    #280 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    5   13:checkcast       #273 <Class PdfDictionary>
	//    6   16:astore_0        
		if(pdfreader == null)
	//*   7   17:aload_0         
	//*   8   18:ifnonnull       23
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
		else
			return PdfReader.getPdfObjectRelease(((PdfDictionary) (pdfreader)).get(PdfName.XFA));
	//   11   23:aload_0         
	//   12   24:getstatic       #283 <Field PdfName PdfName.XFA>
	//   13   27:invokevirtual   #276 <Method PdfObject PdfDictionary.get(PdfName)>
	//   14   30:invokestatic    #280 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   15   33:areturn         
	}

	public static byte[] serializeDoc(Node node)
		throws IOException
	{
		XmlDomWriter xmldomwriter = new XmlDomWriter();
	//    0    0:new             #287 <Class XmlDomWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #288 <Method void XmlDomWriter()>
	//    3    7:astore_1        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    4    8:new             #64  <Class ByteArrayOutputStream>
	//    5   11:dup             
	//    6   12:invokespecial   #65  <Method void ByteArrayOutputStream()>
	//    7   15:astore_2        
		xmldomwriter.setOutput(((java.io.OutputStream) (bytearrayoutputstream)), ((String) (null)));
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #292 <Method void XmlDomWriter.setOutput(java.io.OutputStream, String)>
		xmldomwriter.setCanonical(false);
	//   12   22:aload_1         
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #295 <Method void XmlDomWriter.setCanonical(boolean)>
		xmldomwriter.write(node);
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #297 <Method void XmlDomWriter.write(Node)>
		bytearrayoutputstream.close();
	//   18   32:aload_2         
	//   19   33:invokevirtual   #96  <Method void ByteArrayOutputStream.close()>
		return bytearrayoutputstream.toByteArray();
	//   20   36:aload_2         
	//   21   37:invokevirtual   #116 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   22   40:areturn         
	}

	public static void setXfa(XfaForm xfaform, PdfReader pdfreader, PdfWriter pdfwriter)
		throws IOException
	{
		PdfDictionary pdfdictionary = (PdfDictionary)PdfReader.getPdfObjectRelease(pdfreader.getCatalog().get(PdfName.ACROFORM));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #265 <Method PdfDictionary PdfReader.getCatalog()>
	//    2    4:getstatic       #271 <Field PdfName PdfName.ACROFORM>
	//    3    7:invokevirtual   #276 <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:invokestatic    #280 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    5   13:checkcast       #273 <Class PdfDictionary>
	//    6   16:astore          6
		if(pdfdictionary == null)
	//*   7   18:aload           6
	//*   8   20:ifnonnull       24
			return;
	//    9   23:return          
		Object obj = ((Object) (getXfaObject(pdfreader)));
	//   10   24:aload_1         
	//   11   25:invokestatic    #60  <Method PdfObject getXfaObject(PdfReader)>
	//   12   28:astore          7
		if(((PdfObject) (obj)).isArray())
	//*  13   30:aload           7
	//*  14   32:invokevirtual   #71  <Method boolean PdfObject.isArray()>
	//*  15   35:ifeq            243
		{
			obj = ((Object) ((PdfArray)obj));
	//   16   38:aload           7
	//   17   40:checkcast       #73  <Class PdfArray>
	//   18   43:astore          7
			int k = -1;
	//   19   45:iconst_m1       
	//   20   46:istore          5
			int j = -1;
	//   21   48:iconst_m1       
	//   22   49:istore          4
			for(int i = 0; i < ((PdfArray) (obj)).size(); i += 2)
	//*  23   51:iconst_0        
	//*  24   52:istore_3        
	//*  25   53:iload_3         
	//*  26   54:aload           7
	//*  27   56:invokevirtual   #77  <Method int PdfArray.size()>
	//*  28   59:icmpge          113
			{
				PdfString pdfstring = ((PdfArray) (obj)).getAsString(i);
	//   29   62:aload           7
	//   30   64:iload_3         
	//   31   65:invokevirtual   #303 <Method PdfString PdfArray.getAsString(int)>
	//   32   68:astore          8
				if("template".equals(((Object) (pdfstring.toString()))))
	//*  33   70:ldc1            #179 <String "template">
	//*  34   72:aload           8
	//*  35   74:invokevirtual   #306 <Method String PdfString.toString()>
	//*  36   77:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  37   80:ifeq            88
					k = i + 1;
	//   38   83:iload_3         
	//   39   84:iconst_1        
	//   40   85:iadd            
	//   41   86:istore          5
				if("datasets".equals(((Object) (pdfstring.toString()))))
	//*  42   88:ldc1            #197 <String "datasets">
	//*  43   90:aload           8
	//*  44   92:invokevirtual   #306 <Method String PdfString.toString()>
	//*  45   95:invokevirtual   #240 <Method boolean String.equals(Object)>
	//*  46   98:ifeq            106
					j = i + 1;
	//   47  101:iload_3         
	//   48  102:iconst_1        
	//   49  103:iadd            
	//   50  104:istore          4
			}

	//   51  106:iload_3         
	//   52  107:iconst_2        
	//   53  108:iadd            
	//   54  109:istore_3        
	//*  55  110:goto            53
			if(k > -1 && j > -1)
	//*  56  113:iload           5
	//*  57  115:iconst_m1       
	//*  58  116:icmple          243
	//*  59  119:iload           4
	//*  60  121:iconst_m1       
	//*  61  122:icmple          243
			{
				pdfreader.killXref(((PdfObject) (((PdfArray) (obj)).getAsIndirectObject(k))));
	//   62  125:aload_1         
	//   63  126:aload           7
	//   64  128:iload           5
	//   65  130:invokevirtual   #310 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
	//   66  133:invokevirtual   #314 <Method void PdfReader.killXref(PdfObject)>
				pdfreader.killXref(((PdfObject) (((PdfArray) (obj)).getAsIndirectObject(j))));
	//   67  136:aload_1         
	//   68  137:aload           7
	//   69  139:iload           4
	//   70  141:invokevirtual   #310 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
	//   71  144:invokevirtual   #314 <Method void PdfReader.killXref(PdfObject)>
				pdfreader = ((PdfReader) (new PdfStream(serializeDoc(xfaform.templateNode))));
	//   72  147:new             #316 <Class PdfStream>
	//   73  150:dup             
	//   74  151:aload_0         
	//   75  152:getfield        #191 <Field Node templateNode>
	//   76  155:invokestatic    #318 <Method byte[] serializeDoc(Node)>
	//   77  158:invokespecial   #319 <Method void PdfStream(byte[])>
	//   78  161:astore_1        
				((PdfStream) (pdfreader)).flateCompress(pdfwriter.getCompressionLevel());
	//   79  162:aload_1         
	//   80  163:aload_2         
	//   81  164:invokevirtual   #324 <Method int PdfWriter.getCompressionLevel()>
	//   82  167:invokevirtual   #328 <Method void PdfStream.flateCompress(int)>
				((PdfArray) (obj)).set(k, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (pdfreader))).getIndirectReference())));
	//   83  170:aload           7
	//   84  172:iload           5
	//   85  174:aload_2         
	//   86  175:aload_1         
	//   87  176:invokevirtual   #332 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   88  179:invokevirtual   #338 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   89  182:invokevirtual   #342 <Method PdfObject PdfArray.set(int, PdfObject)>
	//   90  185:pop             
				xfaform = ((XfaForm) (new PdfStream(serializeDoc(xfaform.datasetsNode))));
	//   91  186:new             #316 <Class PdfStream>
	//   92  189:dup             
	//   93  190:aload_0         
	//   94  191:getfield        #169 <Field Node datasetsNode>
	//   95  194:invokestatic    #318 <Method byte[] serializeDoc(Node)>
	//   96  197:invokespecial   #319 <Method void PdfStream(byte[])>
	//   97  200:astore_0        
				((PdfStream) (xfaform)).flateCompress(pdfwriter.getCompressionLevel());
	//   98  201:aload_0         
	//   99  202:aload_2         
	//  100  203:invokevirtual   #324 <Method int PdfWriter.getCompressionLevel()>
	//  101  206:invokevirtual   #328 <Method void PdfStream.flateCompress(int)>
				((PdfArray) (obj)).set(j, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (xfaform))).getIndirectReference())));
	//  102  209:aload           7
	//  103  211:iload           4
	//  104  213:aload_2         
	//  105  214:aload_0         
	//  106  215:invokevirtual   #332 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  107  218:invokevirtual   #338 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  108  221:invokevirtual   #342 <Method PdfObject PdfArray.set(int, PdfObject)>
	//  109  224:pop             
				pdfdictionary.put(PdfName.XFA, ((PdfObject) (new PdfArray(((PdfArray) (obj))))));
	//  110  225:aload           6
	//  111  227:getstatic       #283 <Field PdfName PdfName.XFA>
	//  112  230:new             #73  <Class PdfArray>
	//  113  233:dup             
	//  114  234:aload           7
	//  115  236:invokespecial   #345 <Method void PdfArray(PdfArray)>
	//  116  239:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
				return;
	//  117  242:return          
			}
		}
		pdfreader.killXref(pdfdictionary.get(PdfName.XFA));
	//  118  243:aload_1         
	//  119  244:aload           6
	//  120  246:getstatic       #283 <Field PdfName PdfName.XFA>
	//  121  249:invokevirtual   #276 <Method PdfObject PdfDictionary.get(PdfName)>
	//  122  252:invokevirtual   #314 <Method void PdfReader.killXref(PdfObject)>
		xfaform = ((XfaForm) (new PdfStream(serializeDoc(((Node) (xfaform.domDocument))))));
	//  123  255:new             #316 <Class PdfStream>
	//  124  258:dup             
	//  125  259:aload_0         
	//  126  260:getfield        #126 <Field Document domDocument>
	//  127  263:invokestatic    #318 <Method byte[] serializeDoc(Node)>
	//  128  266:invokespecial   #319 <Method void PdfStream(byte[])>
	//  129  269:astore_0        
		((PdfStream) (xfaform)).flateCompress(pdfwriter.getCompressionLevel());
	//  130  270:aload_0         
	//  131  271:aload_2         
	//  132  272:invokevirtual   #324 <Method int PdfWriter.getCompressionLevel()>
	//  133  275:invokevirtual   #328 <Method void PdfStream.flateCompress(int)>
		xfaform = ((XfaForm) (pdfwriter.addToBody(((PdfObject) (xfaform))).getIndirectReference()));
	//  134  278:aload_2         
	//  135  279:aload_0         
	//  136  280:invokevirtual   #332 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  137  283:invokevirtual   #338 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  138  286:astore_0        
		pdfdictionary.put(PdfName.XFA, ((PdfObject) (xfaform)));
	//  139  287:aload           6
	//  140  289:getstatic       #283 <Field PdfName PdfName.XFA>
	//  141  292:aload_0         
	//  142  293:invokevirtual   #348 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//  143  296:return          
	}

	public void fillXfaForm(File file)
		throws IOException
	{
		fillXfaForm(file, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #353 <Method void fillXfaForm(File, boolean)>
	//    4    6:return          
	}

	public void fillXfaForm(File file, boolean flag)
		throws IOException
	{
		fillXfaForm(((InputStream) (new FileInputStream(file))), flag);
	//    0    0:aload_0         
	//    1    1:new             #355 <Class FileInputStream>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #357 <Method void FileInputStream(File)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #360 <Method void fillXfaForm(InputStream, boolean)>
	//    7   13:return          
	}

	public void fillXfaForm(InputStream inputstream)
		throws IOException
	{
		fillXfaForm(inputstream, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #360 <Method void fillXfaForm(InputStream, boolean)>
	//    4    6:return          
	}

	public void fillXfaForm(InputStream inputstream, boolean flag)
		throws IOException
	{
		fillXfaForm(new InputSource(inputstream), flag);
	//    0    0:aload_0         
	//    1    1:new             #363 <Class InputSource>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #365 <Method void InputSource(InputStream)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #368 <Method void fillXfaForm(InputSource, boolean)>
	//    7   13:return          
	}

	public void fillXfaForm(Node node)
	{
		fillXfaForm(node, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #371 <Method void fillXfaForm(Node, boolean)>
	//    4    6:return          
	}

	public void fillXfaForm(Node node, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            60
		{
			NodeList nodelist = domDocument.getElementsByTagName("field");
	//    2    4:aload_0         
	//    3    5:getfield        #126 <Field Document domDocument>
	//    4    8:ldc2            #373 <String "field">
	//    5   11:invokeinterface #377 <Method NodeList Document.getElementsByTagName(String)>
	//    6   16:astore          5
			for(int i = 0; i < nodelist.getLength(); i++)
	//*   7   18:iconst_0        
	//*   8   19:istore_3        
	//*   9   20:iload_3         
	//*  10   21:aload           5
	//*  11   23:invokeinterface #143 <Method int NodeList.getLength()>
	//*  12   28:icmpge          60
				((Element)nodelist.item(i)).setAttribute("access", "readOnly");
	//   13   31:aload           5
	//   14   33:iload_3         
	//   15   34:invokeinterface #230 <Method Node NodeList.item(int)>
	//   16   39:checkcast       #163 <Class Element>
	//   17   42:ldc2            #379 <String "access">
	//   18   45:ldc2            #381 <String "readOnly">
	//   19   48:invokeinterface #167 <Method void Element.setAttribute(String, String)>

	//   20   53:iload_3         
	//   21   54:iconst_1        
	//   22   55:iadd            
	//   23   56:istore_3        
		}
	//*  24   57:goto            20
		NodeList nodelist1 = datasetsNode.getChildNodes();
	//   25   60:aload_0         
	//   26   61:getfield        #169 <Field Node datasetsNode>
	//   27   64:invokeinterface #138 <Method NodeList Node.getChildNodes()>
	//   28   69:astore          7
		int k = nodelist1.getLength();
	//   29   71:aload           7
	//   30   73:invokeinterface #143 <Method int NodeList.getLength()>
	//   31   78:istore          4
		Object obj = null;
	//   32   80:aconst_null     
	//   33   81:astore          6
		int j = 0;
	//   34   83:iconst_0        
	//   35   84:istore_3        
		do
		{
label0:
			{
				Node node1 = ((Node) (obj));
	//   36   85:aload           6
	//   37   87:astore          5
				if(j < k)
	//*  38   89:iload_3         
	//*  39   90:iload           4
	//*  40   92:icmpge          147
				{
					node1 = nodelist1.item(j);
	//   41   95:aload           7
	//   42   97:iload_3         
	//   43   98:invokeinterface #230 <Method Node NodeList.item(int)>
	//   44  103:astore          5
					if(node1.getNodeType() != 1 || !node1.getLocalName().equals("data") || !"http://www.xfa.org/schema/xfa-data/1.0/".equals(((Object) (node1.getNamespaceURI()))))
						break label0;
	//   45  105:aload           5
	//   46  107:invokeinterface #216 <Method short Node.getNodeType()>
	//   47  112:iconst_1        
	//   48  113:icmpne          232
	//   49  116:aload           5
	//   50  118:invokeinterface #220 <Method String Node.getLocalName()>
	//   51  123:ldc2            #383 <String "data">
	//   52  126:invokevirtual   #240 <Method boolean String.equals(Object)>
	//   53  129:ifeq            232
	//   54  132:ldc1            #26  <String "http://www.xfa.org/schema/xfa-data/1.0/">
	//   55  134:aload           5
	//   56  136:invokeinterface #386 <Method String Node.getNamespaceURI()>
	//   57  141:invokevirtual   #240 <Method boolean String.equals(Object)>
	//   58  144:ifeq            232
				}
				obj = ((Object) (node1));
	//   59  147:aload           5
	//   60  149:astore          6
				if(node1 == null)
	//*  61  151:aload           5
	//*  62  153:ifnonnull       188
				{
					obj = ((Object) (datasetsNode.getOwnerDocument().createElementNS("http://www.xfa.org/schema/xfa-data/1.0/", "xfa:data")));
	//   63  156:aload_0         
	//   64  157:getfield        #169 <Field Node datasetsNode>
	//   65  160:invokeinterface #151 <Method Document Node.getOwnerDocument()>
	//   66  165:ldc1            #26  <String "http://www.xfa.org/schema/xfa-data/1.0/">
	//   67  167:ldc1            #235 <String "xfa:data">
	//   68  169:invokeinterface #390 <Method Element Document.createElementNS(String, String)>
	//   69  174:astore          6
					datasetsNode.appendChild(((Node) (obj)));
	//   70  176:aload_0         
	//   71  177:getfield        #169 <Field Node datasetsNode>
	//   72  180:aload           6
	//   73  182:invokeinterface #173 <Method Node Node.appendChild(Node)>
	//   74  187:pop             
				}
				if(((Node) (obj)).getChildNodes().getLength() == 0)
	//*  75  188:aload           6
	//*  76  190:invokeinterface #138 <Method NodeList Node.getChildNodes()>
	//*  77  195:invokeinterface #143 <Method int NodeList.getLength()>
	//*  78  200:ifne            239
				{
					((Node) (obj)).appendChild(domDocument.importNode(node, true));
	//   79  203:aload           6
	//   80  205:aload_0         
	//   81  206:getfield        #126 <Field Document domDocument>
	//   82  209:aload_1         
	//   83  210:iconst_1        
	//   84  211:invokeinterface #394 <Method Node Document.importNode(Node, boolean)>
	//   85  216:invokeinterface #173 <Method Node Node.appendChild(Node)>
	//   86  221:pop             
				} else
	//*  87  222:aload_0         
	//*  88  223:invokespecial   #129 <Method void extractNodes()>
	//*  89  226:aload_0         
	//*  90  227:iconst_1        
	//*  91  228:invokevirtual   #397 <Method void setChanged(boolean)>
	//*  92  231:return          
	//*  93  232:iload_3         
	//*  94  233:iconst_1        
	//*  95  234:iadd            
	//*  96  235:istore_3        
	//*  97  236:goto            85
				{
					Node node2 = getFirstElementNode(((Node) (obj)));
	//   98  239:aload_0         
	//   99  240:aload           6
	//  100  242:invokespecial   #399 <Method Node getFirstElementNode(Node)>
	//  101  245:astore          5
					if(node2 != null)
	//* 102  247:aload           5
	//* 103  249:ifnull          222
						((Node) (obj)).replaceChild(domDocument.importNode(node, true), node2);
	//  104  252:aload           6
	//  105  254:aload_0         
	//  106  255:getfield        #126 <Field Document domDocument>
	//  107  258:aload_1         
	//  108  259:iconst_1        
	//  109  260:invokeinterface #394 <Method Node Document.importNode(Node, boolean)>
	//  110  265:aload           5
	//  111  267:invokeinterface #403 <Method Node Node.replaceChild(Node, Node)>
	//  112  272:pop             
				}
				extractNodes();
				setChanged(true);
				return;
			}
			j++;
		} while(true);
	//* 113  273:goto            222
	}

	public void fillXfaForm(InputSource inputsource)
		throws IOException
	{
		fillXfaForm(inputsource, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #368 <Method void fillXfaForm(InputSource, boolean)>
	//    4    6:return          
	}

	public void fillXfaForm(InputSource inputsource, boolean flag)
		throws IOException
	{
		DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
	//    0    0:invokestatic    #102 <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    1    3:astore_3        
		try
		{
			fillXfaForm(((Node) (documentbuilderfactory.newDocumentBuilder().parse(inputsource).getDocumentElement())), flag);
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #110 <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #407 <Method Document DocumentBuilder.parse(InputSource)>
	//    7   13:invokeinterface #411 <Method Element Document.getDocumentElement()>
	//    8   18:iload_2         
	//    9   19:invokevirtual   #371 <Method void fillXfaForm(Node, boolean)>
			return;
	//   10   22:return          
		}
		// Misplaced declaration of an exception variable
		catch(InputSource inputsource)
	//*  11   23:astore_1        
		{
			throw new ExceptionConverter(((Exception) (inputsource)));
	//   12   24:new             #413 <Class ExceptionConverter>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:invokespecial   #416 <Method void ExceptionConverter(Exception)>
	//   16   32:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputSource inputsource)
	//*  17   33:astore_1        
		{
			throw new ExceptionConverter(((Exception) (inputsource)));
	//   18   34:new             #413 <Class ExceptionConverter>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokespecial   #416 <Method void ExceptionConverter(Exception)>
	//   22   42:athrow          
		}
	}

	public String findDatasetsName(String s)
	{
		if(datasetsSom.getName2Node().containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field XfaForm$Xml2SomDatasets datasetsSom>
	//*   2    4:invokevirtual   #422 <Method HashMap XfaForm$Xml2SomDatasets.getName2Node()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #423 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifeq            16
			return s;
	//    6   14:aload_1         
	//    7   15:areturn         
		else
			return datasetsSom.inverseSearchGlobal(((ArrayList) (Xml2Som.splitParts(s))));
	//    8   16:aload_0         
	//    9   17:getfield        #203 <Field XfaForm$Xml2SomDatasets datasetsSom>
	//   10   20:aload_1         
	//   11   21:invokestatic    #427 <Method XfaForm$Stack2 XfaForm$Xml2Som.splitParts(String)>
	//   12   24:invokevirtual   #431 <Method String XfaForm$Xml2SomDatasets.inverseSearchGlobal(ArrayList)>
	//   13   27:areturn         
	}

	public Node findDatasetsNode(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
	//*   2    4:aconst_null     
	//*   3    5:areturn         
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #435 <Method String findDatasetsName(String)>
	//*   7   11:astore_1        
			if((s = findDatasetsName(s)) != null)
	//*   8   12:aload_1         
	//*   9   13:ifnull          4
				return (Node)datasetsSom.getName2Node().get(((Object) (s)));
	//   10   16:aload_0         
	//   11   17:getfield        #203 <Field XfaForm$Xml2SomDatasets datasetsSom>
	//   12   20:invokevirtual   #422 <Method HashMap XfaForm$Xml2SomDatasets.getName2Node()>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #436 <Method Object HashMap.get(Object)>
	//   15   27:checkcast       #134 <Class Node>
	//   16   30:areturn         
		return null;
	}

	public String findFieldName(String s, AcroFields acrofields)
	{
		acrofields = ((AcroFields) (acrofields.getFields()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #444 <Method Map AcroFields.getFields()>
	//    2    4:astore_2        
		if(((Map) (acrofields)).containsKey(((Object) (s))))
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #185 <Method boolean Map.containsKey(Object)>
	//*   6   12:ifeq            17
			return s;
	//    7   15:aload_1         
	//    8   16:areturn         
		if(acroFieldsSom == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #446 <Field XfaForm$AcroFieldsSearch acroFieldsSom>
	//*  11   21:ifnonnull       61
			if(((Map) (acrofields)).isEmpty() && xfaPresent)
	//*  12   24:aload_2         
	//*  13   25:invokeinterface #449 <Method boolean Map.isEmpty()>
	//*  14   30:ifeq            90
	//*  15   33:aload_0         
	//*  16   34:getfield        #62  <Field boolean xfaPresent>
	//*  17   37:ifeq            90
				acroFieldsSom = new AcroFieldsSearch(((Collection) (datasetsSom.getName2Node().keySet())));
	//   18   40:aload_0         
	//   19   41:new             #6   <Class XfaForm$AcroFieldsSearch>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:getfield        #203 <Field XfaForm$Xml2SomDatasets datasetsSom>
	//   23   49:invokevirtual   #422 <Method HashMap XfaForm$Xml2SomDatasets.getName2Node()>
	//   24   52:invokevirtual   #453 <Method java.util.Set HashMap.keySet()>
	//   25   55:invokespecial   #456 <Method void XfaForm$AcroFieldsSearch(Collection)>
	//   26   58:putfield        #446 <Field XfaForm$AcroFieldsSearch acroFieldsSom>
			else
	//*  27   61:aload_0         
	//*  28   62:getfield        #446 <Field XfaForm$AcroFieldsSearch acroFieldsSom>
	//*  29   65:invokevirtual   #459 <Method HashMap XfaForm$AcroFieldsSearch.getAcroShort2LongName()>
	//*  30   68:aload_1         
	//*  31   69:invokevirtual   #423 <Method boolean HashMap.containsKey(Object)>
	//*  32   72:ifeq            110
	//*  33   75:aload_0         
	//*  34   76:getfield        #446 <Field XfaForm$AcroFieldsSearch acroFieldsSom>
	//*  35   79:invokevirtual   #459 <Method HashMap XfaForm$AcroFieldsSearch.getAcroShort2LongName()>
	//*  36   82:aload_1         
	//*  37   83:invokevirtual   #436 <Method Object HashMap.get(Object)>
	//*  38   86:checkcast       #237 <Class String>
	//*  39   89:areturn         
				acroFieldsSom = new AcroFieldsSearch(((Collection) (((Map) (acrofields)).keySet())));
	//   40   90:aload_0         
	//   41   91:new             #6   <Class XfaForm$AcroFieldsSearch>
	//   42   94:dup             
	//   43   95:aload_2         
	//   44   96:invokeinterface #460 <Method java.util.Set Map.keySet()>
	//   45  101:invokespecial   #456 <Method void XfaForm$AcroFieldsSearch(Collection)>
	//   46  104:putfield        #446 <Field XfaForm$AcroFieldsSearch acroFieldsSom>
		if(acroFieldsSom.getAcroShort2LongName().containsKey(((Object) (s))))
			return (String)acroFieldsSom.getAcroShort2LongName().get(((Object) (s)));
		else
	//*  47  107:goto            61
			return acroFieldsSom.inverseSearchGlobal(((ArrayList) (Xml2Som.splitParts(s))));
	//   48  110:aload_0         
	//   49  111:getfield        #446 <Field XfaForm$AcroFieldsSearch acroFieldsSom>
	//   50  114:aload_1         
	//   51  115:invokestatic    #427 <Method XfaForm$Stack2 XfaForm$Xml2Som.splitParts(String)>
	//   52  118:invokevirtual   #461 <Method String XfaForm$AcroFieldsSearch.inverseSearchGlobal(ArrayList)>
	//   53  121:areturn         
	}

	public AcroFieldsSearch getAcroFieldsSom()
	{
		return acroFieldsSom;
	//    0    0:aload_0         
	//    1    1:getfield        #446 <Field XfaForm$AcroFieldsSearch acroFieldsSom>
	//    2    4:areturn         
	}

	public Node getDatasetsNode()
	{
		return datasetsNode;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field Node datasetsNode>
	//    2    4:areturn         
	}

	public Xml2SomDatasets getDatasetsSom()
	{
		return datasetsSom;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field XfaForm$Xml2SomDatasets datasetsSom>
	//    2    4:areturn         
	}

	public Document getDomDocument()
	{
		return domDocument;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Document domDocument>
	//    2    4:areturn         
	}

	public PdfReader getReader()
	{
		return reader;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field PdfReader reader>
	//    2    4:areturn         
	}

	public Xml2SomTemplate getTemplateSom()
	{
		return templateSom;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field XfaForm$Xml2SomTemplate templateSom>
	//    2    4:areturn         
	}

	public boolean isChanged()
	{
		return changed;
	//    0    0:aload_0         
	//    1    1:getfield        #474 <Field boolean changed>
	//    2    4:ireturn         
	}

	public boolean isXfaPresent()
	{
		return xfaPresent;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean xfaPresent>
	//    2    4:ireturn         
	}

	public void setAcroFieldsSom(AcroFieldsSearch acrofieldssearch)
	{
		acroFieldsSom = acrofieldssearch;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #446 <Field XfaForm$AcroFieldsSearch acroFieldsSom>
	//    3    5:return          
	}

	public void setChanged(boolean flag)
	{
		changed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #474 <Field boolean changed>
	//    3    5:return          
	}

	public void setDatasetsSom(Xml2SomDatasets xml2somdatasets)
	{
		datasetsSom = xml2somdatasets;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #203 <Field XfaForm$Xml2SomDatasets datasetsSom>
	//    3    5:return          
	}

	public void setDomDocument(Document document)
	{
		domDocument = document;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #126 <Field Document domDocument>
		extractNodes();
	//    3    5:aload_0         
	//    4    6:invokespecial   #129 <Method void extractNodes()>
	//    5    9:return          
	}

	public void setNodeText(Node node, String s)
	{
		if(node == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		do
		{
			Node node1 = node.getFirstChild();
	//    3    5:aload_1         
	//    4    6:invokeinterface #209 <Method Node Node.getFirstChild()>
	//    5   11:astore_3        
			if(node1 == null)
				break;
	//    6   12:aload_3         
	//    7   13:ifnull          27
			node.removeChild(node1);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokeinterface #486 <Method Node Node.removeChild(Node)>
	//   11   23:pop             
		} while(true);
	//   12   24:goto            5
		if(node.getAttributes().getNamedItemNS("http://www.xfa.org/schema/xfa-data/1.0/", "dataNode") != null)
	//*  13   27:aload_1         
	//*  14   28:invokeinterface #490 <Method NamedNodeMap Node.getAttributes()>
	//*  15   33:ldc1            #26  <String "http://www.xfa.org/schema/xfa-data/1.0/">
	//*  16   35:ldc2            #492 <String "dataNode">
	//*  17   38:invokeinterface #498 <Method Node NamedNodeMap.getNamedItemNS(String, String)>
	//*  18   43:ifnull          63
			node.getAttributes().removeNamedItemNS("http://www.xfa.org/schema/xfa-data/1.0/", "dataNode");
	//   19   46:aload_1         
	//   20   47:invokeinterface #490 <Method NamedNodeMap Node.getAttributes()>
	//   21   52:ldc1            #26  <String "http://www.xfa.org/schema/xfa-data/1.0/">
	//   22   54:ldc2            #492 <String "dataNode">
	//   23   57:invokeinterface #501 <Method Node NamedNodeMap.removeNamedItemNS(String, String)>
	//   24   62:pop             
		node.appendChild(((Node) (domDocument.createTextNode(s))));
	//   25   63:aload_1         
	//   26   64:aload_0         
	//   27   65:getfield        #126 <Field Document domDocument>
	//   28   68:aload_2         
	//   29   69:invokeinterface #505 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//   30   74:invokeinterface #173 <Method Node Node.appendChild(Node)>
	//   31   79:pop             
		changed = true;
	//   32   80:aload_0         
	//   33   81:iconst_1        
	//   34   82:putfield        #474 <Field boolean changed>
	//   35   85:return          
	}

	public void setReader(PdfReader pdfreader)
	{
		reader = pdfreader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field PdfReader reader>
	//    3    5:return          
	}

	public void setTemplateSom(Xml2SomTemplate xml2somtemplate)
	{
		templateSom = xml2somtemplate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #195 <Field XfaForm$Xml2SomTemplate templateSom>
	//    3    5:return          
	}

	public void setXfa(PdfWriter pdfwriter)
		throws IOException
	{
		setXfa(this, reader, pdfwriter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #56  <Field PdfReader reader>
	//    3    5:aload_1         
	//    4    6:invokestatic    #511 <Method void setXfa(XfaForm, PdfReader, PdfWriter)>
	//    5    9:return          
	}

	public void setXfaPresent(boolean flag)
	{
		xfaPresent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean xfaPresent>
	//    3    5:return          
	}

	public static final String XFA_DATA_SCHEMA = "http://www.xfa.org/schema/xfa-data/1.0/";
	private AcroFieldsSearch acroFieldsSom;
	private boolean changed;
	private Node datasetsNode;
	private Xml2SomDatasets datasetsSom;
	private Document domDocument;
	private PdfReader reader;
	private Node templateNode;
	private Xml2SomTemplate templateSom;
	private boolean xfaPresent;
}
