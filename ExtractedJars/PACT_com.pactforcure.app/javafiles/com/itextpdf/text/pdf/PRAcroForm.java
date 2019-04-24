// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfArray, PRIndirectReference, PdfReader, 
//			PdfName, PdfString, PdfObject

public class PRAcroForm extends PdfDictionary
{
	public static class FieldInformation
	{

		public PdfDictionary getInfo()
		{
			return info;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field PdfDictionary info>
		//    2    4:areturn         
		}

		public String getName()
		{
			return fieldName;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field String fieldName>
		//    2    4:areturn         
		}

		public PRIndirectReference getRef()
		{
			return ref;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field PRIndirectReference ref>
		//    2    4:areturn         
		}

		public String getWidgetName()
		{
			PdfObject pdfobject = info.get(PdfName.NM);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field PdfDictionary info>
		//    2    4:getstatic       #38  <Field PdfName PdfName.NM>
		//    3    7:invokevirtual   #44  <Method PdfObject PdfDictionary.get(PdfName)>
		//    4   10:astore_1        
			if(pdfobject != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          20
				return pdfobject.toString();
		//    7   15:aload_1         
		//    8   16:invokevirtual   #49  <Method String PdfObject.toString()>
		//    9   19:areturn         
			else
				return null;
		//   10   20:aconst_null     
		//   11   21:areturn         
		}

		String fieldName;
		PdfDictionary info;
		PRIndirectReference ref;

		FieldInformation(String s, PdfDictionary pdfdictionary, PRIndirectReference prindirectreference)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			fieldName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field String fieldName>
			info = pdfdictionary;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field PdfDictionary info>
			ref = prindirectreference;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field PRIndirectReference ref>
		//   11   19:return          
		}
	}


	public PRAcroForm(PdfReader pdfreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void PdfDictionary()>
		reader = pdfreader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field PdfReader reader>
		fields = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #26  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #27  <Method void ArrayList()>
	//    9   17:putfield        #29  <Field ArrayList fields>
		fieldByName = new HashMap();
	//   10   20:aload_0         
	//   11   21:new             #31  <Class HashMap>
	//   12   24:dup             
	//   13   25:invokespecial   #32  <Method void HashMap()>
	//   14   28:putfield        #34  <Field HashMap fieldByName>
		stack = new ArrayList();
	//   15   31:aload_0         
	//   16   32:new             #26  <Class ArrayList>
	//   17   35:dup             
	//   18   36:invokespecial   #27  <Method void ArrayList()>
	//   19   39:putfield        #36  <Field ArrayList stack>
	//   20   42:return          
	}

	public FieldInformation getField(String s)
	{
		return (FieldInformation)fieldByName.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field HashMap fieldByName>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #6   <Class PRAcroForm$FieldInformation>
	//    5   11:areturn         
	}

	public ArrayList getFields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayList fields>
	//    2    4:areturn         
	}

	public PRIndirectReference getRefByName(String s)
	{
		s = ((String) ((FieldInformation)fieldByName.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field HashMap fieldByName>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #6   <Class PRAcroForm$FieldInformation>
	//    5   11:astore_1        
		if(s == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((FieldInformation) (s)).getRef();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #53  <Method PRIndirectReference PRAcroForm$FieldInformation.getRef()>
	//   12   22:areturn         
	}

	protected void iterateFields(PdfArray pdfarray, PRIndirectReference prindirectreference, String s)
	{
		java.util.ListIterator listiterator = pdfarray.listIterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #61  <Method java.util.ListIterator PdfArray.listIterator()>
	//    2    4:astore          8
		do
		{
			if(!((Iterator) (listiterator)).hasNext())
				break;
	//    3    6:aload           8
	//    4    8:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            272
			Object obj1 = ((Object) ((PRIndirectReference)((Iterator) (listiterator)).next()));
	//    6   16:aload           8
	//    7   18:invokeinterface #71  <Method Object Iterator.next()>
	//    8   23:checkcast       #73  <Class PRIndirectReference>
	//    9   26:astore          6
			PdfDictionary pdfdictionary2 = (PdfDictionary)PdfReader.getPdfObjectRelease(((PdfObject) (obj1)));
	//   10   28:aload           6
	//   11   30:invokestatic    #79  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   12   33:checkcast       #4   <Class PdfDictionary>
	//   13   36:astore          9
			Object obj = ((Object) (prindirectreference));
	//   14   38:aload_2         
	//   15   39:astore          5
			pdfarray = ((PdfArray) (s));
	//   16   41:aload_3         
	//   17   42:astore_1        
			PdfString pdfstring = (PdfString)pdfdictionary2.get(PdfName.T);
	//   18   43:aload           9
	//   19   45:getstatic       #85  <Field PdfName PdfName.T>
	//   20   48:invokevirtual   #88  <Method PdfObject PdfDictionary.get(PdfName)>
	//   21   51:checkcast       #90  <Class PdfString>
	//   22   54:astore          7
			boolean flag;
			if(pdfstring != null)
	//*  23   56:aload           7
	//*  24   58:ifnull          136
				flag = true;
	//   25   61:iconst_1        
	//   26   62:istore          4
			else
	//*  27   64:iload           4
	//*  28   66:ifeq            83
	//*  29   69:aload           6
	//*  30   71:astore          5
	//*  31   73:aload_3         
	//*  32   74:ifnonnull       142
	//*  33   77:aload           7
	//*  34   79:invokevirtual   #94  <Method String PdfString.toString()>
	//*  35   82:astore_1        
	//*  36   83:aload           9
	//*  37   85:getstatic       #97  <Field PdfName PdfName.KIDS>
	//*  38   88:invokevirtual   #88  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  39   91:checkcast       #57  <Class PdfArray>
	//*  40   94:astore          6
	//*  41   96:aload           6
	//*  42   98:ifnull          173
	//*  43  101:aload_0         
	//*  44  102:aload           9
	//*  45  104:invokevirtual   #101 <Method void pushAttrib(PdfDictionary)>
	//*  46  107:aload_0         
	//*  47  108:aload           6
	//*  48  110:aload           5
	//*  49  112:aload_1         
	//*  50  113:invokevirtual   #103 <Method void iterateFields(PdfArray, PRIndirectReference, String)>
	//*  51  116:aload_0         
	//*  52  117:getfield        #36  <Field ArrayList stack>
	//*  53  120:aload_0         
	//*  54  121:getfield        #36  <Field ArrayList stack>
	//*  55  124:invokevirtual   #107 <Method int ArrayList.size()>
	//*  56  127:iconst_1        
	//*  57  128:isub            
	//*  58  129:invokevirtual   #111 <Method Object ArrayList.remove(int)>
	//*  59  132:pop             
	//*  60  133:goto            6
				flag = false;
	//   61  136:iconst_0        
	//   62  137:istore          4
			if(flag)
			{
				obj = obj1;
				if(s == null)
					pdfarray = ((PdfArray) (pdfstring.toString()));
				else
	//*  63  139:goto            64
					pdfarray = ((PdfArray) ((new StringBuilder()).append(s).append('.').append(pdfstring.toString()).toString()));
	//   64  142:new             #113 <Class StringBuilder>
	//   65  145:dup             
	//   66  146:invokespecial   #114 <Method void StringBuilder()>
	//   67  149:aload_3         
	//   68  150:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   69  153:bipush          46
	//   70  155:invokevirtual   #121 <Method StringBuilder StringBuilder.append(char)>
	//   71  158:aload           7
	//   72  160:invokevirtual   #94  <Method String PdfString.toString()>
	//   73  163:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   74  166:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   75  169:astore_1        
			}
			obj1 = ((Object) ((PdfArray)pdfdictionary2.get(PdfName.KIDS)));
			if(obj1 != null)
			{
				pushAttrib(pdfdictionary2);
				iterateFields(((PdfArray) (obj1)), ((PRIndirectReference) (obj)), ((String) (pdfarray)));
				stack.remove(stack.size() - 1);
			} else
	//*  76  170:goto            83
			if(obj != null)
	//*  77  173:aload           5
	//*  78  175:ifnull          6
			{
				PdfDictionary pdfdictionary1 = (PdfDictionary)stack.get(stack.size() - 1);
	//   79  178:aload_0         
	//   80  179:getfield        #36  <Field ArrayList stack>
	//   81  182:aload_0         
	//   82  183:getfield        #36  <Field ArrayList stack>
	//   83  186:invokevirtual   #107 <Method int ArrayList.size()>
	//   84  189:iconst_1        
	//   85  190:isub            
	//   86  191:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   87  194:checkcast       #4   <Class PdfDictionary>
	//   88  197:astore          7
				PdfDictionary pdfdictionary = pdfdictionary1;
	//   89  199:aload           7
	//   90  201:astore          6
				if(flag)
	//*  91  203:iload           4
	//*  92  205:ifeq            218
					pdfdictionary = mergeAttrib(pdfdictionary1, pdfdictionary2);
	//   93  208:aload_0         
	//   94  209:aload           7
	//   95  211:aload           9
	//   96  213:invokevirtual   #128 <Method PdfDictionary mergeAttrib(PdfDictionary, PdfDictionary)>
	//   97  216:astore          6
				pdfdictionary.put(PdfName.T, ((PdfObject) (new PdfString(((String) (pdfarray))))));
	//   98  218:aload           6
	//   99  220:getstatic       #85  <Field PdfName PdfName.T>
	//  100  223:new             #90  <Class PdfString>
	//  101  226:dup             
	//  102  227:aload_1         
	//  103  228:invokespecial   #131 <Method void PdfString(String)>
	//  104  231:invokevirtual   #135 <Method void PdfDictionary.put(PdfName, PdfObject)>
				obj = ((Object) (new FieldInformation(((String) (pdfarray)), pdfdictionary, ((PRIndirectReference) (obj)))));
	//  105  234:new             #6   <Class PRAcroForm$FieldInformation>
	//  106  237:dup             
	//  107  238:aload_1         
	//  108  239:aload           6
	//  109  241:aload           5
	//  110  243:invokespecial   #138 <Method void PRAcroForm$FieldInformation(String, PdfDictionary, PRIndirectReference)>
	//  111  246:astore          5
				fields.add(obj);
	//  112  248:aload_0         
	//  113  249:getfield        #29  <Field ArrayList fields>
	//  114  252:aload           5
	//  115  254:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//  116  257:pop             
				fieldByName.put(((Object) (pdfarray)), obj);
	//  117  258:aload_0         
	//  118  259:getfield        #34  <Field HashMap fieldByName>
	//  119  262:aload_1         
	//  120  263:aload           5
	//  121  265:invokevirtual   #145 <Method Object HashMap.put(Object, Object)>
	//  122  268:pop             
			}
		} while(true);
	//  123  269:goto            6
	//  124  272:return          
	}

	protected PdfDictionary mergeAttrib(PdfDictionary pdfdictionary, PdfDictionary pdfdictionary1)
	{
		PdfDictionary pdfdictionary2 = new PdfDictionary();
	//    0    0:new             #4   <Class PdfDictionary>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void PdfDictionary()>
	//    3    7:astore_3        
		if(pdfdictionary != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			pdfdictionary2.putAll(pdfdictionary);
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #148 <Method void PdfDictionary.putAll(PdfDictionary)>
		pdfdictionary = ((PdfDictionary) (pdfdictionary1.getKeys().iterator()));
	//    9   17:aload_2         
	//   10   18:invokevirtual   #152 <Method Set PdfDictionary.getKeys()>
	//   11   21:invokeinterface #158 <Method Iterator Set.iterator()>
	//   12   26:astore_1        
		do
		{
			if(!((Iterator) (pdfdictionary)).hasNext())
				break;
	//   13   27:aload_1         
	//   14   28:invokeinterface #67  <Method boolean Iterator.hasNext()>
	//   15   33:ifeq            161
			PdfName pdfname = (PdfName)((Iterator) (pdfdictionary)).next();
	//   16   36:aload_1         
	//   17   37:invokeinterface #71  <Method Object Iterator.next()>
	//   18   42:checkcast       #81  <Class PdfName>
	//   19   45:astore          4
			if(pdfname.equals(((Object) (PdfName.DR))) || pdfname.equals(((Object) (PdfName.DA))) || pdfname.equals(((Object) (PdfName.Q))) || pdfname.equals(((Object) (PdfName.FF))) || pdfname.equals(((Object) (PdfName.DV))) || pdfname.equals(((Object) (PdfName.V))) || pdfname.equals(((Object) (PdfName.FT))) || pdfname.equals(((Object) (PdfName.NM))) || pdfname.equals(((Object) (PdfName.F))))
	//*  20   47:aload           4
	//*  21   49:getstatic       #161 <Field PdfName PdfName.DR>
	//*  22   52:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  23   55:ifne            146
	//*  24   58:aload           4
	//*  25   60:getstatic       #167 <Field PdfName PdfName.DA>
	//*  26   63:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  27   66:ifne            146
	//*  28   69:aload           4
	//*  29   71:getstatic       #170 <Field PdfName PdfName.Q>
	//*  30   74:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  31   77:ifne            146
	//*  32   80:aload           4
	//*  33   82:getstatic       #173 <Field PdfName PdfName.FF>
	//*  34   85:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  35   88:ifne            146
	//*  36   91:aload           4
	//*  37   93:getstatic       #176 <Field PdfName PdfName.DV>
	//*  38   96:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  39   99:ifne            146
	//*  40  102:aload           4
	//*  41  104:getstatic       #179 <Field PdfName PdfName.V>
	//*  42  107:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  43  110:ifne            146
	//*  44  113:aload           4
	//*  45  115:getstatic       #182 <Field PdfName PdfName.FT>
	//*  46  118:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  47  121:ifne            146
	//*  48  124:aload           4
	//*  49  126:getstatic       #185 <Field PdfName PdfName.NM>
	//*  50  129:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  51  132:ifne            146
	//*  52  135:aload           4
	//*  53  137:getstatic       #188 <Field PdfName PdfName.F>
	//*  54  140:invokevirtual   #164 <Method boolean PdfName.equals(Object)>
	//*  55  143:ifeq            27
				pdfdictionary2.put(pdfname, pdfdictionary1.get(pdfname));
	//   56  146:aload_3         
	//   57  147:aload           4
	//   58  149:aload_2         
	//   59  150:aload           4
	//   60  152:invokevirtual   #88  <Method PdfObject PdfDictionary.get(PdfName)>
	//   61  155:invokevirtual   #135 <Method void PdfDictionary.put(PdfName, PdfObject)>
		} while(true);
	//   62  158:goto            27
		return pdfdictionary2;
	//   63  161:aload_3         
	//   64  162:areturn         
	}

	protected void pushAttrib(PdfDictionary pdfdictionary)
	{
		PdfDictionary pdfdictionary1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(!stack.isEmpty())
	//*   2    2:aload_0         
	//*   3    3:getfield        #36  <Field ArrayList stack>
	//*   4    6:invokevirtual   #191 <Method boolean ArrayList.isEmpty()>
	//*   5    9:ifne            32
			pdfdictionary1 = (PdfDictionary)stack.get(stack.size() - 1);
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field ArrayList stack>
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field ArrayList stack>
	//   10   20:invokevirtual   #107 <Method int ArrayList.size()>
	//   11   23:iconst_1        
	//   12   24:isub            
	//   13   25:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #4   <Class PdfDictionary>
	//   15   31:astore_2        
		pdfdictionary = mergeAttrib(pdfdictionary1, pdfdictionary);
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #128 <Method PdfDictionary mergeAttrib(PdfDictionary, PdfDictionary)>
	//   20   38:astore_1        
		stack.add(((Object) (pdfdictionary)));
	//   21   39:aload_0         
	//   22   40:getfield        #36  <Field ArrayList stack>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   25   47:pop             
	//   26   48:return          
	}

	public void readAcroForm(PdfDictionary pdfdictionary)
	{
		if(pdfdictionary != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			hashMap = pdfdictionary.hashMap;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #196 <Field java.util.LinkedHashMap PdfDictionary.hashMap>
	//    6   10:putfield        #197 <Field java.util.LinkedHashMap hashMap>
			pushAttrib(pdfdictionary);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #101 <Method void pushAttrib(PdfDictionary)>
			pdfdictionary = ((PdfDictionary) ((PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.FIELDS))));
	//   10   18:aload_1         
	//   11   19:getstatic       #200 <Field PdfName PdfName.FIELDS>
	//   12   22:invokevirtual   #88  <Method PdfObject PdfDictionary.get(PdfName)>
	//   13   25:invokestatic    #79  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   14   28:checkcast       #57  <Class PdfArray>
	//   15   31:astore_1        
			if(pdfdictionary != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          4
			{
				iterateFields(((PdfArray) (pdfdictionary)), ((PRIndirectReference) (null)), ((String) (null)));
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aconst_null     
	//   21   39:aconst_null     
	//   22   40:invokevirtual   #103 <Method void iterateFields(PdfArray, PRIndirectReference, String)>
				return;
	//   23   43:return          
			}
		}
	}

	public int size()
	{
		return fields.size();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayList fields>
	//    2    4:invokevirtual   #107 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	HashMap fieldByName;
	ArrayList fields;
	PdfReader reader;
	ArrayList stack;
}
