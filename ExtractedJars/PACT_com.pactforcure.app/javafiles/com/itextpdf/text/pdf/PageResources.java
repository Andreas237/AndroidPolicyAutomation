// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfObject, PdfResources, PdfName, 
//			PdfReader, PdfIndirectReference

class PageResources
{

	PageResources()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		fontDictionary = new PdfDictionary();
	//    2    4:aload_0         
	//    3    5:new             #27  <Class PdfDictionary>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void PdfDictionary()>
	//    6   12:putfield        #30  <Field PdfDictionary fontDictionary>
		xObjectDictionary = new PdfDictionary();
	//    7   15:aload_0         
	//    8   16:new             #27  <Class PdfDictionary>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void PdfDictionary()>
	//   11   23:putfield        #32  <Field PdfDictionary xObjectDictionary>
		colorDictionary = new PdfDictionary();
	//   12   26:aload_0         
	//   13   27:new             #27  <Class PdfDictionary>
	//   14   30:dup             
	//   15   31:invokespecial   #28  <Method void PdfDictionary()>
	//   16   34:putfield        #34  <Field PdfDictionary colorDictionary>
		patternDictionary = new PdfDictionary();
	//   17   37:aload_0         
	//   18   38:new             #27  <Class PdfDictionary>
	//   19   41:dup             
	//   20   42:invokespecial   #28  <Method void PdfDictionary()>
	//   21   45:putfield        #36  <Field PdfDictionary patternDictionary>
		shadingDictionary = new PdfDictionary();
	//   22   48:aload_0         
	//   23   49:new             #27  <Class PdfDictionary>
	//   24   52:dup             
	//   25   53:invokespecial   #28  <Method void PdfDictionary()>
	//   26   56:putfield        #38  <Field PdfDictionary shadingDictionary>
		extGStateDictionary = new PdfDictionary();
	//   27   59:aload_0         
	//   28   60:new             #27  <Class PdfDictionary>
	//   29   63:dup             
	//   30   64:invokespecial   #28  <Method void PdfDictionary()>
	//   31   67:putfield        #40  <Field PdfDictionary extGStateDictionary>
		propertyDictionary = new PdfDictionary();
	//   32   70:aload_0         
	//   33   71:new             #27  <Class PdfDictionary>
	//   34   74:dup             
	//   35   75:invokespecial   #28  <Method void PdfDictionary()>
	//   36   78:putfield        #42  <Field PdfDictionary propertyDictionary>
	//   37   81:aload_0         
	//   38   82:iconst_1        
	//   39   83:newarray        int[]
	//   40   85:dup             
	//   41   86:iconst_0        
	//   42   87:iconst_0        
	//   43   88:iastore         
	//   44   89:putfield        #44  <Field int[] namePtr>
	//   45   92:return          
	}

	PdfName addColor(PdfName pdfname, PdfIndirectReference pdfindirectreference)
	{
		pdfname = translateName(pdfname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method PdfName translateName(PdfName)>
	//    3    5:astore_1        
		colorDictionary.put(pdfname, ((PdfObject) (pdfindirectreference)));
	//    4    6:aload_0         
	//    5    7:getfield        #34  <Field PdfDictionary colorDictionary>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfname;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	void addDefaultColor(PdfDictionary pdfdictionary)
	{
		colorDictionary.merge(pdfdictionary);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PdfDictionary colorDictionary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method void PdfDictionary.merge(PdfDictionary)>
	//    4    8:return          
	}

	void addDefaultColor(PdfName pdfname, PdfObject pdfobject)
	{
		if(pdfobject == null || pdfobject.isNull())
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #66  <Method boolean PdfObject.isNull()>
	//*   4    8:ifeq            20
		{
			colorDictionary.remove(pdfname);
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field PdfDictionary colorDictionary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #70  <Method void PdfDictionary.remove(PdfName)>
			return;
	//    9   19:return          
		} else
		{
			colorDictionary.put(pdfname, pdfobject);
	//   10   20:aload_0         
	//   11   21:getfield        #34  <Field PdfDictionary colorDictionary>
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   15   29:return          
		}
	}

	void addDefaultColorDiff(PdfDictionary pdfdictionary)
	{
		colorDictionary.mergeDifferent(pdfdictionary);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PdfDictionary colorDictionary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
	//    4    8:return          
	}

	PdfName addExtGState(PdfName pdfname, PdfIndirectReference pdfindirectreference)
	{
		pdfname = translateName(pdfname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method PdfName translateName(PdfName)>
	//    3    5:astore_1        
		extGStateDictionary.put(pdfname, ((PdfObject) (pdfindirectreference)));
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field PdfDictionary extGStateDictionary>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfname;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	PdfName addFont(PdfName pdfname, PdfIndirectReference pdfindirectreference)
	{
		pdfname = translateName(pdfname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method PdfName translateName(PdfName)>
	//    3    5:astore_1        
		fontDictionary.put(pdfname, ((PdfObject) (pdfindirectreference)));
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field PdfDictionary fontDictionary>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfname;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	PdfName addPattern(PdfName pdfname, PdfIndirectReference pdfindirectreference)
	{
		pdfname = translateName(pdfname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method PdfName translateName(PdfName)>
	//    3    5:astore_1        
		patternDictionary.put(pdfname, ((PdfObject) (pdfindirectreference)));
	//    4    6:aload_0         
	//    5    7:getfield        #36  <Field PdfDictionary patternDictionary>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfname;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	PdfName addProperty(PdfName pdfname, PdfIndirectReference pdfindirectreference)
	{
		pdfname = translateName(pdfname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method PdfName translateName(PdfName)>
	//    3    5:astore_1        
		propertyDictionary.put(pdfname, ((PdfObject) (pdfindirectreference)));
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field PdfDictionary propertyDictionary>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfname;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	PdfName addShading(PdfName pdfname, PdfIndirectReference pdfindirectreference)
	{
		pdfname = translateName(pdfname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method PdfName translateName(PdfName)>
	//    3    5:astore_1        
		shadingDictionary.put(pdfname, ((PdfObject) (pdfindirectreference)));
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field PdfDictionary shadingDictionary>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfname;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	PdfName addXObject(PdfName pdfname, PdfIndirectReference pdfindirectreference)
	{
		pdfname = translateName(pdfname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method PdfName translateName(PdfName)>
	//    3    5:astore_1        
		xObjectDictionary.put(pdfname, ((PdfObject) (pdfindirectreference)));
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field PdfDictionary xObjectDictionary>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
		return pdfname;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	PdfDictionary getResources()
	{
		PdfResources pdfresources = new PdfResources();
	//    0    0:new             #84  <Class PdfResources>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void PdfResources()>
	//    3    7:astore_1        
		if(originalResources != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #87  <Field PdfDictionary originalResources>
	//*   6   12:ifnull          23
			pdfresources.putAll(originalResources);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #87  <Field PdfDictionary originalResources>
	//   10   20:invokevirtual   #90  <Method void PdfResources.putAll(PdfDictionary)>
		pdfresources.add(PdfName.FONT, fontDictionary);
	//   11   23:aload_1         
	//   12   24:getstatic       #96  <Field PdfName PdfName.FONT>
	//   13   27:aload_0         
	//   14   28:getfield        #30  <Field PdfDictionary fontDictionary>
	//   15   31:invokevirtual   #100 <Method void PdfResources.add(PdfName, PdfDictionary)>
		pdfresources.add(PdfName.XOBJECT, xObjectDictionary);
	//   16   34:aload_1         
	//   17   35:getstatic       #103 <Field PdfName PdfName.XOBJECT>
	//   18   38:aload_0         
	//   19   39:getfield        #32  <Field PdfDictionary xObjectDictionary>
	//   20   42:invokevirtual   #100 <Method void PdfResources.add(PdfName, PdfDictionary)>
		pdfresources.add(PdfName.COLORSPACE, colorDictionary);
	//   21   45:aload_1         
	//   22   46:getstatic       #106 <Field PdfName PdfName.COLORSPACE>
	//   23   49:aload_0         
	//   24   50:getfield        #34  <Field PdfDictionary colorDictionary>
	//   25   53:invokevirtual   #100 <Method void PdfResources.add(PdfName, PdfDictionary)>
		pdfresources.add(PdfName.PATTERN, patternDictionary);
	//   26   56:aload_1         
	//   27   57:getstatic       #109 <Field PdfName PdfName.PATTERN>
	//   28   60:aload_0         
	//   29   61:getfield        #36  <Field PdfDictionary patternDictionary>
	//   30   64:invokevirtual   #100 <Method void PdfResources.add(PdfName, PdfDictionary)>
		pdfresources.add(PdfName.SHADING, shadingDictionary);
	//   31   67:aload_1         
	//   32   68:getstatic       #112 <Field PdfName PdfName.SHADING>
	//   33   71:aload_0         
	//   34   72:getfield        #38  <Field PdfDictionary shadingDictionary>
	//   35   75:invokevirtual   #100 <Method void PdfResources.add(PdfName, PdfDictionary)>
		pdfresources.add(PdfName.EXTGSTATE, extGStateDictionary);
	//   36   78:aload_1         
	//   37   79:getstatic       #115 <Field PdfName PdfName.EXTGSTATE>
	//   38   82:aload_0         
	//   39   83:getfield        #40  <Field PdfDictionary extGStateDictionary>
	//   40   86:invokevirtual   #100 <Method void PdfResources.add(PdfName, PdfDictionary)>
		pdfresources.add(PdfName.PROPERTIES, propertyDictionary);
	//   41   89:aload_1         
	//   42   90:getstatic       #118 <Field PdfName PdfName.PROPERTIES>
	//   43   93:aload_0         
	//   44   94:getfield        #42  <Field PdfDictionary propertyDictionary>
	//   45   97:invokevirtual   #100 <Method void PdfResources.add(PdfName, PdfDictionary)>
		return ((PdfDictionary) (pdfresources));
	//   46  100:aload_1         
	//   47  101:areturn         
	}

	boolean hasResources()
	{
		return fontDictionary.size() > 0 || xObjectDictionary.size() > 0 || colorDictionary.size() > 0 || patternDictionary.size() > 0 || shadingDictionary.size() > 0 || extGStateDictionary.size() > 0 || propertyDictionary.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field PdfDictionary fontDictionary>
	//    2    4:invokevirtual   #123 <Method int PdfDictionary.size()>
	//    3    7:ifgt            70
	//    4   10:aload_0         
	//    5   11:getfield        #32  <Field PdfDictionary xObjectDictionary>
	//    6   14:invokevirtual   #123 <Method int PdfDictionary.size()>
	//    7   17:ifgt            70
	//    8   20:aload_0         
	//    9   21:getfield        #34  <Field PdfDictionary colorDictionary>
	//   10   24:invokevirtual   #123 <Method int PdfDictionary.size()>
	//   11   27:ifgt            70
	//   12   30:aload_0         
	//   13   31:getfield        #36  <Field PdfDictionary patternDictionary>
	//   14   34:invokevirtual   #123 <Method int PdfDictionary.size()>
	//   15   37:ifgt            70
	//   16   40:aload_0         
	//   17   41:getfield        #38  <Field PdfDictionary shadingDictionary>
	//   18   44:invokevirtual   #123 <Method int PdfDictionary.size()>
	//   19   47:ifgt            70
	//   20   50:aload_0         
	//   21   51:getfield        #40  <Field PdfDictionary extGStateDictionary>
	//   22   54:invokevirtual   #123 <Method int PdfDictionary.size()>
	//   23   57:ifgt            70
	//   24   60:aload_0         
	//   25   61:getfield        #42  <Field PdfDictionary propertyDictionary>
	//   26   64:invokevirtual   #123 <Method int PdfDictionary.size()>
	//   27   67:ifle            72
	//   28   70:iconst_1        
	//   29   71:ireturn         
	//   30   72:iconst_0        
	//   31   73:ireturn         
	}

	void setOriginalResources(PdfDictionary pdfdictionary, int ai[])
	{
		if(ai != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          9
			namePtr = ai;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #44  <Field int[] namePtr>
		forbiddenNames = new HashSet();
	//    5    9:aload_0         
	//    6   10:new             #127 <Class HashSet>
	//    7   13:dup             
	//    8   14:invokespecial   #128 <Method void HashSet()>
	//    9   17:putfield        #130 <Field HashSet forbiddenNames>
		usedNames = new HashMap();
	//   10   20:aload_0         
	//   11   21:new             #132 <Class HashMap>
	//   12   24:dup             
	//   13   25:invokespecial   #133 <Method void HashMap()>
	//   14   28:putfield        #135 <Field HashMap usedNames>
		if(pdfdictionary != null)
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       36
	//*  17   35:return          
		{
			originalResources = new PdfDictionary();
	//   18   36:aload_0         
	//   19   37:new             #27  <Class PdfDictionary>
	//   20   40:dup             
	//   21   41:invokespecial   #28  <Method void PdfDictionary()>
	//   22   44:putfield        #87  <Field PdfDictionary originalResources>
			originalResources.merge(pdfdictionary);
	//   23   47:aload_0         
	//   24   48:getfield        #87  <Field PdfDictionary originalResources>
	//   25   51:aload_1         
	//   26   52:invokevirtual   #60  <Method void PdfDictionary.merge(PdfDictionary)>
			ai = ((int []) (pdfdictionary.getKeys().iterator()));
	//   27   55:aload_1         
	//   28   56:invokevirtual   #139 <Method Set PdfDictionary.getKeys()>
	//   29   59:invokeinterface #145 <Method Iterator Set.iterator()>
	//   30   64:astore_2        
			while(((Iterator) (ai)).hasNext()) 
	//*  31   65:aload_2         
	//*  32   66:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  33   71:ifeq            35
			{
				PdfName pdfname = (PdfName)((Iterator) (ai)).next();
	//   34   74:aload_2         
	//   35   75:invokeinterface #154 <Method Object Iterator.next()>
	//   36   80:checkcast       #92  <Class PdfName>
	//   37   83:astore_3        
				Object obj = ((Object) (PdfReader.getPdfObject(pdfdictionary.get(pdfname))));
	//   38   84:aload_1         
	//   39   85:aload_3         
	//   40   86:invokevirtual   #158 <Method PdfObject PdfDictionary.get(PdfName)>
	//   41   89:invokestatic    #164 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   42   92:astore          4
				if(obj != null && ((PdfObject) (obj)).isDictionary())
	//*  43   94:aload           4
	//*  44   96:ifnull          65
	//*  45   99:aload           4
	//*  46  101:invokevirtual   #167 <Method boolean PdfObject.isDictionary()>
	//*  47  104:ifeq            65
				{
					obj = ((Object) ((PdfDictionary)obj));
	//   48  107:aload           4
	//   49  109:checkcast       #27  <Class PdfDictionary>
	//   50  112:astore          4
					PdfName pdfname1;
					for(Iterator iterator = ((PdfDictionary) (obj)).getKeys().iterator(); iterator.hasNext(); forbiddenNames.add(((Object) (pdfname1))))
	//*  51  114:aload           4
	//*  52  116:invokevirtual   #139 <Method Set PdfDictionary.getKeys()>
	//*  53  119:invokeinterface #145 <Method Iterator Set.iterator()>
	//*  54  124:astore          5
	//*  55  126:aload           5
	//*  56  128:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//*  57  133:ifeq            161
						pdfname1 = (PdfName)iterator.next();
	//   58  136:aload           5
	//   59  138:invokeinterface #154 <Method Object Iterator.next()>
	//   60  143:checkcast       #92  <Class PdfName>
	//   61  146:astore          6

	//   62  148:aload_0         
	//   63  149:getfield        #130 <Field HashSet forbiddenNames>
	//   64  152:aload           6
	//   65  154:invokevirtual   #170 <Method boolean HashSet.add(Object)>
	//   66  157:pop             
	//*  67  158:goto            126
					PdfDictionary pdfdictionary1 = new PdfDictionary();
	//   68  161:new             #27  <Class PdfDictionary>
	//   69  164:dup             
	//   70  165:invokespecial   #28  <Method void PdfDictionary()>
	//   71  168:astore          5
					pdfdictionary1.merge(((PdfDictionary) (obj)));
	//   72  170:aload           5
	//   73  172:aload           4
	//   74  174:invokevirtual   #60  <Method void PdfDictionary.merge(PdfDictionary)>
					originalResources.put(pdfname, ((PdfObject) (pdfdictionary1)));
	//   75  177:aload_0         
	//   76  178:getfield        #87  <Field PdfDictionary originalResources>
	//   77  181:aload_3         
	//   78  182:aload           5
	//   79  184:invokevirtual   #55  <Method void PdfDictionary.put(PdfName, PdfObject)>
				}
			}
		}
	//*  80  187:goto            65
	}

	PdfName translateName(PdfName pdfname)
	{
		Object obj = ((Object) (pdfname));
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(forbiddenNames != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #130 <Field HashSet forbiddenNames>
	//*   4    6:ifnull          98
		{
			PdfName pdfname1 = (PdfName)usedNames.get(((Object) (pdfname)));
	//    5    9:aload_0         
	//    6   10:getfield        #135 <Field HashMap usedNames>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #173 <Method Object HashMap.get(Object)>
	//    9   17:checkcast       #92  <Class PdfName>
	//   10   20:astore          4
			obj = ((Object) (pdfname1));
	//   11   22:aload           4
	//   12   24:astore_3        
			if(pdfname1 == null)
	//*  13   25:aload           4
	//*  14   27:ifnonnull       98
			{
				do
				{
					obj = ((Object) ((new StringBuilder()).append("Xi")));
	//   15   30:new             #175 <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #176 <Method void StringBuilder()>
	//   18   37:ldc1            #178 <String "Xi">
	//   19   39:invokevirtual   #182 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:astore_3        
					int ai[] = namePtr;
	//   21   43:aload_0         
	//   22   44:getfield        #44  <Field int[] namePtr>
	//   23   47:astore          4
					int i = ai[0];
	//   24   49:aload           4
	//   25   51:iconst_0        
	//   26   52:iaload          
	//   27   53:istore_2        
					ai[0] = i + 1;
	//   28   54:aload           4
	//   29   56:iconst_0        
	//   30   57:iload_2         
	//   31   58:iconst_1        
	//   32   59:iadd            
	//   33   60:iastore         
					obj = ((Object) (new PdfName(((StringBuilder) (obj)).append(i).toString())));
	//   34   61:new             #92  <Class PdfName>
	//   35   64:dup             
	//   36   65:aload_3         
	//   37   66:iload_2         
	//   38   67:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   39   70:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   40   73:invokespecial   #192 <Method void PdfName(String)>
	//   41   76:astore_3        
				} while(forbiddenNames.contains(obj));
	//   42   77:aload_0         
	//   43   78:getfield        #130 <Field HashSet forbiddenNames>
	//   44   81:aload_3         
	//   45   82:invokevirtual   #195 <Method boolean HashSet.contains(Object)>
	//   46   85:ifne            30
				usedNames.put(((Object) (pdfname)), obj);
	//   47   88:aload_0         
	//   48   89:getfield        #135 <Field HashMap usedNames>
	//   49   92:aload_1         
	//   50   93:aload_3         
	//   51   94:invokevirtual   #198 <Method Object HashMap.put(Object, Object)>
	//   52   97:pop             
			}
		}
		return ((PdfName) (obj));
	//   53   98:aload_3         
	//   54   99:areturn         
	}

	protected PdfDictionary colorDictionary;
	protected PdfDictionary extGStateDictionary;
	protected PdfDictionary fontDictionary;
	protected HashSet forbiddenNames;
	protected int namePtr[] = {
		0
	};
	protected PdfDictionary originalResources;
	protected PdfDictionary patternDictionary;
	protected PdfDictionary propertyDictionary;
	protected PdfDictionary shadingDictionary;
	protected HashMap usedNames;
	protected PdfDictionary xObjectDictionary;
}
