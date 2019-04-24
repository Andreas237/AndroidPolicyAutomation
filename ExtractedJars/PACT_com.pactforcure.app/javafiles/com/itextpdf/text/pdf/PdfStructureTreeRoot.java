// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.pdf.interfaces.IPdfStructureElement;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfWriter, PdfObject, 
//			PdfArray, PdfIndirectObject, PdfIndirectReference, PdfNumberTree, 
//			PdfNameTree

public class PdfStructureTreeRoot extends PdfDictionary
	implements IPdfStructureElement
{

	PdfStructureTreeRoot(PdfWriter pdfwriter)
	{
		super(PdfName.STRUCTTREEROOT);
	//    0    0:aload_0         
	//    1    1:getstatic       #29  <Field PdfName PdfName.STRUCTTREEROOT>
	//    2    4:invokespecial   #32  <Method void PdfDictionary(PdfName)>
		parentTree = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #34  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #37  <Method void HashMap()>
	//    7   15:putfield        #39  <Field HashMap parentTree>
		classMap = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #41  <Field PdfDictionary classMap>
		classes = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #43  <Field HashMap classes>
		numTree = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #45  <Field HashMap numTree>
		writer = pdfwriter;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:putfield        #47  <Field PdfWriter writer>
		reference = pdfwriter.getPdfIndirectReference();
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #53  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   23   43:putfield        #55  <Field PdfIndirectReference reference>
	//   24   46:return          
	}

	private void createNumTree()
		throws IOException
	{
		if(numTree == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field HashMap numTree>
	//*   2    4:ifnull          8
	//*   3    7:return          
		{
			numTree = new HashMap();
	//    4    8:aload_0         
	//    5    9:new             #34  <Class HashMap>
	//    6   12:dup             
	//    7   13:invokespecial   #37  <Method void HashMap()>
	//    8   16:putfield        #45  <Field HashMap numTree>
			Iterator iterator = parentTree.keySet().iterator();
	//    9   19:aload_0         
	//   10   20:getfield        #39  <Field HashMap parentTree>
	//   11   23:invokevirtual   #63  <Method Set HashMap.keySet()>
	//   12   26:invokeinterface #69  <Method Iterator Set.iterator()>
	//   13   31:astore_1        
			while(iterator.hasNext()) 
	//*  14   32:aload_1         
	//*  15   33:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*  16   38:ifeq            7
			{
				Integer integer = (Integer)iterator.next();
	//   17   41:aload_1         
	//   18   42:invokeinterface #79  <Method Object Iterator.next()>
	//   19   47:checkcast       #81  <Class Integer>
	//   20   50:astore_2        
				Object obj = ((Object) ((PdfObject)parentTree.get(((Object) (integer)))));
	//   21   51:aload_0         
	//   22   52:getfield        #39  <Field HashMap parentTree>
	//   23   55:aload_2         
	//   24   56:invokevirtual   #85  <Method Object HashMap.get(Object)>
	//   25   59:checkcast       #87  <Class PdfObject>
	//   26   62:astore_3        
				if(((PdfObject) (obj)).isArray())
	//*  27   63:aload_3         
	//*  28   64:invokevirtual   #90  <Method boolean PdfObject.isArray()>
	//*  29   67:ifeq            98
				{
					obj = ((Object) ((PdfArray)obj));
	//   30   70:aload_3         
	//   31   71:checkcast       #92  <Class PdfArray>
	//   32   74:astore_3        
					numTree.put(((Object) (integer)), ((Object) (writer.addToBody(((PdfObject) (obj))).getIndirectReference())));
	//   33   75:aload_0         
	//   34   76:getfield        #45  <Field HashMap numTree>
	//   35   79:aload_2         
	//   36   80:aload_0         
	//   37   81:getfield        #47  <Field PdfWriter writer>
	//   38   84:aload_3         
	//   39   85:invokevirtual   #96  <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   40   88:invokevirtual   #101 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   41   91:invokevirtual   #105 <Method Object HashMap.put(Object, Object)>
	//   42   94:pop             
				} else
	//*  43   95:goto            32
				if(obj instanceof PdfIndirectReference)
	//*  44   98:aload_3         
	//*  45   99:instanceof      #107 <Class PdfIndirectReference>
	//*  46  102:ifeq            32
					numTree.put(((Object) (integer)), ((Object) ((PdfIndirectReference)obj)));
	//   47  105:aload_0         
	//   48  106:getfield        #45  <Field HashMap numTree>
	//   49  109:aload_2         
	//   50  110:aload_3         
	//   51  111:checkcast       #107 <Class PdfIndirectReference>
	//   52  114:invokevirtual   #105 <Method Object HashMap.put(Object, Object)>
	//   53  117:pop             
			}
		}
	//*  54  118:goto            32
	}

	void buildTree()
		throws IOException
	{
		createNumTree();
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void createNumTree()>
		PdfDictionary pdfdictionary = PdfNumberTree.writeTree(numTree, writer);
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field HashMap numTree>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field PdfWriter writer>
	//    6   12:invokestatic    #117 <Method PdfDictionary PdfNumberTree.writeTree(HashMap, PdfWriter)>
	//    7   15:astore_2        
		if(pdfdictionary != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          38
			put(PdfName.PARENTTREE, ((PdfObject) (writer.addToBody(((PdfObject) (pdfdictionary))).getIndirectReference())));
	//   10   20:aload_0         
	//   11   21:getstatic       #120 <Field PdfName PdfName.PARENTTREE>
	//   12   24:aload_0         
	//   13   25:getfield        #47  <Field PdfWriter writer>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #96  <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   16   32:invokevirtual   #101 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   17   35:invokevirtual   #123 <Method void put(PdfName, PdfObject)>
		if(classMap != null && !classes.isEmpty())
	//*  18   38:aload_0         
	//*  19   39:getfield        #41  <Field PdfDictionary classMap>
	//*  20   42:ifnull          255
	//*  21   45:aload_0         
	//*  22   46:getfield        #43  <Field HashMap classes>
	//*  23   49:invokevirtual   #126 <Method boolean HashMap.isEmpty()>
	//*  24   52:ifne            255
		{
			Iterator iterator = classes.entrySet().iterator();
	//   25   55:aload_0         
	//   26   56:getfield        #43  <Field HashMap classes>
	//   27   59:invokevirtual   #129 <Method Set HashMap.entrySet()>
	//   28   62:invokeinterface #69  <Method Iterator Set.iterator()>
	//   29   67:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   30   68:aload_2         
	//   31   69:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//   32   74:ifeq            234
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   33   77:aload_2         
	//   34   78:invokeinterface #79  <Method Object Iterator.next()>
	//   35   83:checkcast       #131 <Class java.util.Map$Entry>
	//   36   86:astore_3        
				Object obj = ((Object) ((PdfObject)entry.getValue()));
	//   37   87:aload_3         
	//   38   88:invokeinterface #134 <Method Object java.util.Map$Entry.getValue()>
	//   39   93:checkcast       #87  <Class PdfObject>
	//   40   96:astore          5
				if(((PdfObject) (obj)).isDictionary())
	//*  41   98:aload           5
	//*  42  100:invokevirtual   #137 <Method boolean PdfObject.isDictionary()>
	//*  43  103:ifeq            137
					classMap.put((PdfName)entry.getKey(), ((PdfObject) (writer.addToBody(((PdfObject) (obj))).getIndirectReference())));
	//   44  106:aload_0         
	//   45  107:getfield        #41  <Field PdfDictionary classMap>
	//   46  110:aload_3         
	//   47  111:invokeinterface #140 <Method Object java.util.Map$Entry.getKey()>
	//   48  116:checkcast       #25  <Class PdfName>
	//   49  119:aload_0         
	//   50  120:getfield        #47  <Field PdfWriter writer>
	//   51  123:aload           5
	//   52  125:invokevirtual   #96  <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   53  128:invokevirtual   #101 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   54  131:invokevirtual   #141 <Method void PdfDictionary.put(PdfName, PdfObject)>
				else
	//*  55  134:goto            68
				if(((PdfObject) (obj)).isArray())
	//*  56  137:aload           5
	//*  57  139:invokevirtual   #90  <Method boolean PdfObject.isArray()>
	//*  58  142:ifeq            68
				{
					PdfArray pdfarray = new PdfArray();
	//   59  145:new             #92  <Class PdfArray>
	//   60  148:dup             
	//   61  149:invokespecial   #142 <Method void PdfArray()>
	//   62  152:astore          4
					obj = ((Object) ((PdfArray)obj));
	//   63  154:aload           5
	//   64  156:checkcast       #92  <Class PdfArray>
	//   65  159:astore          5
					for(int i = 0; i < ((PdfArray) (obj)).size(); i++)
	//*  66  161:iconst_0        
	//*  67  162:istore_1        
	//*  68  163:iload_1         
	//*  69  164:aload           5
	//*  70  166:invokevirtual   #146 <Method int PdfArray.size()>
	//*  71  169:icmpge          213
						if(((PdfArray) (obj)).getPdfObject(i).isDictionary())
	//*  72  172:aload           5
	//*  73  174:iload_1         
	//*  74  175:invokevirtual   #150 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  75  178:invokevirtual   #137 <Method boolean PdfObject.isDictionary()>
	//*  76  181:ifeq            206
							pdfarray.add(((PdfObject) (writer.addToBody(((PdfObject) (((PdfArray) (obj)).getAsDict(i)))).getIndirectReference())));
	//   77  184:aload           4
	//   78  186:aload_0         
	//   79  187:getfield        #47  <Field PdfWriter writer>
	//   80  190:aload           5
	//   81  192:iload_1         
	//   82  193:invokevirtual   #154 <Method PdfDictionary PdfArray.getAsDict(int)>
	//   83  196:invokevirtual   #96  <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   84  199:invokevirtual   #101 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   85  202:invokevirtual   #158 <Method boolean PdfArray.add(PdfObject)>
	//   86  205:pop             

	//   87  206:iload_1         
	//   88  207:iconst_1        
	//   89  208:iadd            
	//   90  209:istore_1        
	//*  91  210:goto            163
					classMap.put((PdfName)entry.getKey(), ((PdfObject) (pdfarray)));
	//   92  213:aload_0         
	//   93  214:getfield        #41  <Field PdfDictionary classMap>
	//   94  217:aload_3         
	//   95  218:invokeinterface #140 <Method Object java.util.Map$Entry.getKey()>
	//   96  223:checkcast       #25  <Class PdfName>
	//   97  226:aload           4
	//   98  228:invokevirtual   #141 <Method void PdfDictionary.put(PdfName, PdfObject)>
				}
			} while(true);
	//   99  231:goto            68
			put(PdfName.CLASSMAP, ((PdfObject) (writer.addToBody(((PdfObject) (classMap))).getIndirectReference())));
	//  100  234:aload_0         
	//  101  235:getstatic       #161 <Field PdfName PdfName.CLASSMAP>
	//  102  238:aload_0         
	//  103  239:getfield        #47  <Field PdfWriter writer>
	//  104  242:aload_0         
	//  105  243:getfield        #41  <Field PdfDictionary classMap>
	//  106  246:invokevirtual   #96  <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//  107  249:invokevirtual   #101 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//  108  252:invokevirtual   #123 <Method void put(PdfName, PdfObject)>
		}
		if(idTreeMap != null && !idTreeMap.isEmpty())
	//* 109  255:aload_0         
	//* 110  256:getfield        #163 <Field HashMap idTreeMap>
	//* 111  259:ifnull          292
	//* 112  262:aload_0         
	//* 113  263:getfield        #163 <Field HashMap idTreeMap>
	//* 114  266:invokevirtual   #126 <Method boolean HashMap.isEmpty()>
	//* 115  269:ifne            292
		{
			PdfDictionary pdfdictionary1 = PdfNameTree.writeTree(idTreeMap, writer);
	//  116  272:aload_0         
	//  117  273:getfield        #163 <Field HashMap idTreeMap>
	//  118  276:aload_0         
	//  119  277:getfield        #47  <Field PdfWriter writer>
	//  120  280:invokestatic    #166 <Method PdfDictionary PdfNameTree.writeTree(HashMap, PdfWriter)>
	//  121  283:astore_2        
			put(PdfName.IDTREE, ((PdfObject) (pdfdictionary1)));
	//  122  284:aload_0         
	//  123  285:getstatic       #169 <Field PdfName PdfName.IDTREE>
	//  124  288:aload_2         
	//  125  289:invokevirtual   #123 <Method void put(PdfName, PdfObject)>
		}
		writer.addToBody(((PdfObject) (this)), reference);
	//  126  292:aload_0         
	//  127  293:getfield        #47  <Field PdfWriter writer>
	//  128  296:aload_0         
	//  129  297:aload_0         
	//  130  298:getfield        #55  <Field PdfIndirectReference reference>
	//  131  301:invokevirtual   #172 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//  132  304:pop             
	//  133  305:return          
	}

	public PdfObject getAttribute(PdfName pdfname)
	{
		PdfDictionary pdfdictionary = getAsDict(PdfName.A);
	//    0    0:aload_0         
	//    1    1:getstatic       #177 <Field PdfName PdfName.A>
	//    2    4:invokevirtual   #180 <Method PdfDictionary getAsDict(PdfName)>
	//    3    7:astore_2        
		if(pdfdictionary != null && pdfdictionary.contains(pdfname))
	//*   4    8:aload_2         
	//*   5    9:ifnull          26
	//*   6   12:aload_2         
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #184 <Method boolean PdfDictionary.contains(PdfName)>
	//*   9   17:ifeq            26
			return pdfdictionary.get(pdfname);
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #186 <Method PdfObject PdfDictionary.get(PdfName)>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public PdfObject getMappedClass(PdfName pdfname)
	{
		if(classes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field HashMap classes>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (PdfObject)classes.get(((Object) (pdfname)));
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field HashMap classes>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #85  <Method Object HashMap.get(Object)>
	//    9   17:checkcast       #87  <Class PdfObject>
	//   10   20:areturn         
	}

	public HashMap getNumTree()
		throws IOException
	{
		if(numTree == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field HashMap numTree>
	//*   2    4:ifnonnull       11
			createNumTree();
	//    3    7:aload_0         
	//    4    8:invokespecial   #111 <Method void createNumTree()>
		return numTree;
	//    5   11:aload_0         
	//    6   12:getfield        #45  <Field HashMap numTree>
	//    7   15:areturn         
	}

	public PdfIndirectReference getReference()
	{
		return reference;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field PdfIndirectReference reference>
	//    2    4:areturn         
	}

	public PdfWriter getWriter()
	{
		return writer;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field PdfWriter writer>
	//    2    4:areturn         
	}

	public void mapClass(PdfName pdfname, PdfObject pdfobject)
	{
		if(classMap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field PdfDictionary classMap>
	//*   2    4:ifnonnull       29
		{
			classMap = new PdfDictionary();
	//    3    7:aload_0         
	//    4    8:new             #4   <Class PdfDictionary>
	//    5   11:dup             
	//    6   12:invokespecial   #196 <Method void PdfDictionary()>
	//    7   15:putfield        #41  <Field PdfDictionary classMap>
			classes = new HashMap();
	//    8   18:aload_0         
	//    9   19:new             #34  <Class HashMap>
	//   10   22:dup             
	//   11   23:invokespecial   #37  <Method void HashMap()>
	//   12   26:putfield        #43  <Field HashMap classes>
		}
		classes.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//   13   29:aload_0         
	//   14   30:getfield        #43  <Field HashMap classes>
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:invokevirtual   #105 <Method Object HashMap.put(Object, Object)>
	//   18   38:pop             
	//   19   39:return          
	}

	public void mapRole(PdfName pdfname, PdfName pdfname1)
	{
		PdfDictionary pdfdictionary1 = (PdfDictionary)get(PdfName.ROLEMAP);
	//    0    0:aload_0         
	//    1    1:getstatic       #201 <Field PdfName PdfName.ROLEMAP>
	//    2    4:invokevirtual   #202 <Method PdfObject get(PdfName)>
	//    3    7:checkcast       #4   <Class PdfDictionary>
	//    4   10:astore          4
		PdfDictionary pdfdictionary = pdfdictionary1;
	//    5   12:aload           4
	//    6   14:astore_3        
		if(pdfdictionary1 == null)
	//*   7   15:aload           4
	//*   8   17:ifnonnull       36
		{
			pdfdictionary = new PdfDictionary();
	//    9   20:new             #4   <Class PdfDictionary>
	//   10   23:dup             
	//   11   24:invokespecial   #196 <Method void PdfDictionary()>
	//   12   27:astore_3        
			put(PdfName.ROLEMAP, ((PdfObject) (pdfdictionary)));
	//   13   28:aload_0         
	//   14   29:getstatic       #201 <Field PdfName PdfName.ROLEMAP>
	//   15   32:aload_3         
	//   16   33:invokevirtual   #123 <Method void put(PdfName, PdfObject)>
		}
		pdfdictionary.put(pdfname, ((PdfObject) (pdfname1)));
	//   17   36:aload_3         
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:invokevirtual   #141 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   21   42:return          
	}

	void putIDTree(String s, PdfObject pdfobject)
	{
		if(idTreeMap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field HashMap idTreeMap>
	//*   2    4:ifnonnull       18
			idTreeMap = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #34  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #37  <Method void HashMap()>
	//    7   15:putfield        #163 <Field HashMap idTreeMap>
		idTreeMap.put(((Object) (s)), ((Object) (pdfobject)));
	//    8   18:aload_0         
	//    9   19:getfield        #163 <Field HashMap idTreeMap>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #105 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	void setAnnotationMark(int i, PdfIndirectReference pdfindirectreference)
	{
		parentTree.put(((Object) (Integer.valueOf(i))), ((Object) (pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field HashMap parentTree>
	//    2    4:iload_1         
	//    3    5:invokestatic    #210 <Method Integer Integer.valueOf(int)>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #105 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void setAttribute(PdfName pdfname, PdfObject pdfobject)
	{
		PdfDictionary pdfdictionary1 = getAsDict(PdfName.A);
	//    0    0:aload_0         
	//    1    1:getstatic       #177 <Field PdfName PdfName.A>
	//    2    4:invokevirtual   #180 <Method PdfDictionary getAsDict(PdfName)>
	//    3    7:astore          4
		PdfDictionary pdfdictionary = pdfdictionary1;
	//    4    9:aload           4
	//    5   11:astore_3        
		if(pdfdictionary1 == null)
	//*   6   12:aload           4
	//*   7   14:ifnonnull       33
		{
			pdfdictionary = new PdfDictionary();
	//    8   17:new             #4   <Class PdfDictionary>
	//    9   20:dup             
	//   10   21:invokespecial   #196 <Method void PdfDictionary()>
	//   11   24:astore_3        
			put(PdfName.A, ((PdfObject) (pdfdictionary)));
	//   12   25:aload_0         
	//   13   26:getstatic       #177 <Field PdfName PdfName.A>
	//   14   29:aload_3         
	//   15   30:invokevirtual   #123 <Method void put(PdfName, PdfObject)>
		}
		pdfdictionary.put(pdfname, pdfobject);
	//   16   33:aload_3         
	//   17   34:aload_1         
	//   18   35:aload_2         
	//   19   36:invokevirtual   #141 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   20   39:return          
	}

	void setPageMark(int i, PdfIndirectReference pdfindirectreference)
	{
		Integer integer = Integer.valueOf(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #210 <Method Integer Integer.valueOf(int)>
	//    2    4:astore          5
		PdfArray pdfarray1 = (PdfArray)parentTree.get(((Object) (integer)));
	//    3    6:aload_0         
	//    4    7:getfield        #39  <Field HashMap parentTree>
	//    5   10:aload           5
	//    6   12:invokevirtual   #85  <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #92  <Class PdfArray>
	//    8   18:astore          4
		PdfArray pdfarray = pdfarray1;
	//    9   20:aload           4
	//   10   22:astore_3        
		if(pdfarray1 == null)
	//*  11   23:aload           4
	//*  12   25:ifnonnull       47
		{
			pdfarray = new PdfArray();
	//   13   28:new             #92  <Class PdfArray>
	//   14   31:dup             
	//   15   32:invokespecial   #142 <Method void PdfArray()>
	//   16   35:astore_3        
			parentTree.put(((Object) (integer)), ((Object) (pdfarray)));
	//   17   36:aload_0         
	//   18   37:getfield        #39  <Field HashMap parentTree>
	//   19   40:aload           5
	//   20   42:aload_3         
	//   21   43:invokevirtual   #105 <Method Object HashMap.put(Object, Object)>
	//   22   46:pop             
		}
		pdfarray.add(((PdfObject) (pdfindirectreference)));
	//   23   47:aload_3         
	//   24   48:aload_2         
	//   25   49:invokevirtual   #158 <Method boolean PdfArray.add(PdfObject)>
	//   26   52:pop             
	//   27   53:return          
	}

	private PdfDictionary classMap;
	protected HashMap classes;
	private HashMap idTreeMap;
	private HashMap numTree;
	private HashMap parentTree;
	private PdfIndirectReference reference;
	private PdfWriter writer;
}
