// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, PdfName, PdfArray, PdfBoolean, 
//			PdfIndirectReference, PdfNumber, PdfStream, PdfString, 
//			PdfReader, PdfWriter

public class PdfDictionary extends PdfObject
{

	public PdfDictionary()
	{
		super(6);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:invokespecial   #38  <Method void PdfObject(int)>
		dictionaryType = null;
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:putfield        #40  <Field PdfName dictionaryType>
		hashMap = new LinkedHashMap();
	//    6   11:aload_0         
	//    7   12:new             #42  <Class LinkedHashMap>
	//    8   15:dup             
	//    9   16:invokespecial   #44  <Method void LinkedHashMap()>
	//   10   19:putfield        #46  <Field LinkedHashMap hashMap>
	//   11   22:return          
	}

	public PdfDictionary(int i)
	{
		super(6);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:invokespecial   #38  <Method void PdfObject(int)>
		dictionaryType = null;
	//    3    6:aload_0         
	//    4    7:aconst_null     
	//    5    8:putfield        #40  <Field PdfName dictionaryType>
		hashMap = new LinkedHashMap(i);
	//    6   11:aload_0         
	//    7   12:new             #42  <Class LinkedHashMap>
	//    8   15:dup             
	//    9   16:iload_1         
	//   10   17:invokespecial   #47  <Method void LinkedHashMap(int)>
	//   11   20:putfield        #46  <Field LinkedHashMap hashMap>
	//   12   23:return          
	}

	public PdfDictionary(PdfName pdfname)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void PdfDictionary()>
		dictionaryType = pdfname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field PdfName dictionaryType>
		put(PdfName.TYPE, ((PdfObject) (dictionaryType)));
	//    5    9:aload_0         
	//    6   10:getstatic       #52  <Field PdfName PdfName.TYPE>
	//    7   13:aload_0         
	//    8   14:getfield        #40  <Field PdfName dictionaryType>
	//    9   17:invokevirtual   #56  <Method void put(PdfName, PdfObject)>
	//   10   20:return          
	}

	public boolean checkType(PdfName pdfname)
	{
		if(pdfname == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(dictionaryType == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #40  <Field PdfName dictionaryType>
	//*   6   10:ifnonnull       24
			dictionaryType = getAsName(PdfName.TYPE);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getstatic       #52  <Field PdfName PdfName.TYPE>
	//   10   18:invokevirtual   #62  <Method PdfName getAsName(PdfName)>
	//   11   21:putfield        #40  <Field PdfName dictionaryType>
		return pdfname.equals(((Object) (dictionaryType)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field PdfName dictionaryType>
	//   15   29:invokevirtual   #66  <Method boolean PdfName.equals(Object)>
	//   16   32:ireturn         
	}

	public void clear()
	{
		hashMap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LinkedHashMap hashMap>
	//    2    4:invokevirtual   #69  <Method void LinkedHashMap.clear()>
	//    3    7:return          
	}

	public boolean contains(PdfName pdfname)
	{
		return hashMap.containsKey(((Object) (pdfname)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LinkedHashMap hashMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #73  <Method boolean LinkedHashMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public PdfObject get(PdfName pdfname)
	{
		return (PdfObject)hashMap.get(((Object) (pdfname)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LinkedHashMap hashMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #78  <Method Object LinkedHashMap.get(Object)>
	//    4    8:checkcast       #4   <Class PdfObject>
	//    5   11:areturn         
	}

	public PdfArray getAsArray(PdfName pdfname)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		PdfObject pdfobject = getDirectObject(pdfname);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #83  <Method PdfObject getDirectObject(PdfName)>
	//    5    7:astore_3        
		pdfname = ((PdfName) (obj));
	//    6    8:aload_2         
	//    7    9:astore_1        
		if(pdfobject != null)
	//*   8   10:aload_3         
	//*   9   11:ifnull          28
		{
			pdfname = ((PdfName) (obj));
	//   10   14:aload_2         
	//   11   15:astore_1        
			if(pdfobject.isArray())
	//*  12   16:aload_3         
	//*  13   17:invokevirtual   #87  <Method boolean PdfObject.isArray()>
	//*  14   20:ifeq            28
				pdfname = ((PdfName) ((PdfArray)pdfobject));
	//   15   23:aload_3         
	//   16   24:checkcast       #89  <Class PdfArray>
	//   17   27:astore_1        
		}
		return ((PdfArray) (pdfname));
	//   18   28:aload_1         
	//   19   29:areturn         
	}

	public PdfBoolean getAsBoolean(PdfName pdfname)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		PdfObject pdfobject = getDirectObject(pdfname);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #83  <Method PdfObject getDirectObject(PdfName)>
	//    5    7:astore_3        
		pdfname = ((PdfName) (obj));
	//    6    8:aload_2         
	//    7    9:astore_1        
		if(pdfobject != null)
	//*   8   10:aload_3         
	//*   9   11:ifnull          28
		{
			pdfname = ((PdfName) (obj));
	//   10   14:aload_2         
	//   11   15:astore_1        
			if(pdfobject.isBoolean())
	//*  12   16:aload_3         
	//*  13   17:invokevirtual   #94  <Method boolean PdfObject.isBoolean()>
	//*  14   20:ifeq            28
				pdfname = ((PdfName) ((PdfBoolean)pdfobject));
	//   15   23:aload_3         
	//   16   24:checkcast       #96  <Class PdfBoolean>
	//   17   27:astore_1        
		}
		return ((PdfBoolean) (pdfname));
	//   18   28:aload_1         
	//   19   29:areturn         
	}

	public PdfDictionary getAsDict(PdfName pdfname)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		PdfObject pdfobject = getDirectObject(pdfname);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #83  <Method PdfObject getDirectObject(PdfName)>
	//    5    7:astore_3        
		pdfname = ((PdfName) (obj));
	//    6    8:aload_2         
	//    7    9:astore_1        
		if(pdfobject != null)
	//*   8   10:aload_3         
	//*   9   11:ifnull          28
		{
			pdfname = ((PdfName) (obj));
	//   10   14:aload_2         
	//   11   15:astore_1        
			if(pdfobject.isDictionary())
	//*  12   16:aload_3         
	//*  13   17:invokevirtual   #101 <Method boolean PdfObject.isDictionary()>
	//*  14   20:ifeq            28
				pdfname = ((PdfName) ((PdfDictionary)pdfobject));
	//   15   23:aload_3         
	//   16   24:checkcast       #2   <Class PdfDictionary>
	//   17   27:astore_1        
		}
		return ((PdfDictionary) (pdfname));
	//   18   28:aload_1         
	//   19   29:areturn         
	}

	public PdfIndirectReference getAsIndirectObject(PdfName pdfname)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		PdfObject pdfobject = get(pdfname);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #105 <Method PdfObject get(PdfName)>
	//    5    7:astore_3        
		pdfname = ((PdfName) (obj));
	//    6    8:aload_2         
	//    7    9:astore_1        
		if(pdfobject != null)
	//*   8   10:aload_3         
	//*   9   11:ifnull          28
		{
			pdfname = ((PdfName) (obj));
	//   10   14:aload_2         
	//   11   15:astore_1        
			if(pdfobject.isIndirect())
	//*  12   16:aload_3         
	//*  13   17:invokevirtual   #108 <Method boolean PdfObject.isIndirect()>
	//*  14   20:ifeq            28
				pdfname = ((PdfName) ((PdfIndirectReference)pdfobject));
	//   15   23:aload_3         
	//   16   24:checkcast       #110 <Class PdfIndirectReference>
	//   17   27:astore_1        
		}
		return ((PdfIndirectReference) (pdfname));
	//   18   28:aload_1         
	//   19   29:areturn         
	}

	public PdfName getAsName(PdfName pdfname)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		PdfObject pdfobject = getDirectObject(pdfname);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #83  <Method PdfObject getDirectObject(PdfName)>
	//    5    7:astore_3        
		pdfname = ((PdfName) (obj));
	//    6    8:aload_2         
	//    7    9:astore_1        
		if(pdfobject != null)
	//*   8   10:aload_3         
	//*   9   11:ifnull          28
		{
			pdfname = ((PdfName) (obj));
	//   10   14:aload_2         
	//   11   15:astore_1        
			if(pdfobject.isName())
	//*  12   16:aload_3         
	//*  13   17:invokevirtual   #113 <Method boolean PdfObject.isName()>
	//*  14   20:ifeq            28
				pdfname = (PdfName)pdfobject;
	//   15   23:aload_3         
	//   16   24:checkcast       #18  <Class PdfName>
	//   17   27:astore_1        
		}
		return pdfname;
	//   18   28:aload_1         
	//   19   29:areturn         
	}

	public PdfNumber getAsNumber(PdfName pdfname)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		PdfObject pdfobject = getDirectObject(pdfname);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #83  <Method PdfObject getDirectObject(PdfName)>
	//    5    7:astore_3        
		pdfname = ((PdfName) (obj));
	//    6    8:aload_2         
	//    7    9:astore_1        
		if(pdfobject != null)
	//*   8   10:aload_3         
	//*   9   11:ifnull          28
		{
			pdfname = ((PdfName) (obj));
	//   10   14:aload_2         
	//   11   15:astore_1        
			if(pdfobject.isNumber())
	//*  12   16:aload_3         
	//*  13   17:invokevirtual   #118 <Method boolean PdfObject.isNumber()>
	//*  14   20:ifeq            28
				pdfname = ((PdfName) ((PdfNumber)pdfobject));
	//   15   23:aload_3         
	//   16   24:checkcast       #120 <Class PdfNumber>
	//   17   27:astore_1        
		}
		return ((PdfNumber) (pdfname));
	//   18   28:aload_1         
	//   19   29:areturn         
	}

	public PdfStream getAsStream(PdfName pdfname)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		PdfObject pdfobject = getDirectObject(pdfname);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #83  <Method PdfObject getDirectObject(PdfName)>
	//    5    7:astore_3        
		pdfname = ((PdfName) (obj));
	//    6    8:aload_2         
	//    7    9:astore_1        
		if(pdfobject != null)
	//*   8   10:aload_3         
	//*   9   11:ifnull          28
		{
			pdfname = ((PdfName) (obj));
	//   10   14:aload_2         
	//   11   15:astore_1        
			if(pdfobject.isStream())
	//*  12   16:aload_3         
	//*  13   17:invokevirtual   #125 <Method boolean PdfObject.isStream()>
	//*  14   20:ifeq            28
				pdfname = ((PdfName) ((PdfStream)pdfobject));
	//   15   23:aload_3         
	//   16   24:checkcast       #127 <Class PdfStream>
	//   17   27:astore_1        
		}
		return ((PdfStream) (pdfname));
	//   18   28:aload_1         
	//   19   29:areturn         
	}

	public PdfString getAsString(PdfName pdfname)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		PdfObject pdfobject = getDirectObject(pdfname);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #83  <Method PdfObject getDirectObject(PdfName)>
	//    5    7:astore_3        
		pdfname = ((PdfName) (obj));
	//    6    8:aload_2         
	//    7    9:astore_1        
		if(pdfobject != null)
	//*   8   10:aload_3         
	//*   9   11:ifnull          28
		{
			pdfname = ((PdfName) (obj));
	//   10   14:aload_2         
	//   11   15:astore_1        
			if(pdfobject.isString())
	//*  12   16:aload_3         
	//*  13   17:invokevirtual   #132 <Method boolean PdfObject.isString()>
	//*  14   20:ifeq            28
				pdfname = ((PdfName) ((PdfString)pdfobject));
	//   15   23:aload_3         
	//   16   24:checkcast       #134 <Class PdfString>
	//   17   27:astore_1        
		}
		return ((PdfString) (pdfname));
	//   18   28:aload_1         
	//   19   29:areturn         
	}

	public PdfObject getDirectObject(PdfName pdfname)
	{
		return PdfReader.getPdfObject(get(pdfname));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method PdfObject get(PdfName)>
	//    3    5:invokestatic    #140 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    4    8:areturn         
	}

	public Set getKeys()
	{
		return hashMap.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LinkedHashMap hashMap>
	//    2    4:invokevirtual   #145 <Method Set LinkedHashMap.keySet()>
	//    3    7:areturn         
	}

	public boolean isCatalog()
	{
		return checkType(CATALOG);
	//    0    0:aload_0         
	//    1    1:getstatic       #33  <Field PdfName CATALOG>
	//    2    4:invokevirtual   #150 <Method boolean checkType(PdfName)>
	//    3    7:ireturn         
	}

	public boolean isFont()
	{
		return checkType(FONT);
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field PdfName FONT>
	//    2    4:invokevirtual   #150 <Method boolean checkType(PdfName)>
	//    3    7:ireturn         
	}

	public boolean isOutlineTree()
	{
		return checkType(OUTLINES);
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field PdfName OUTLINES>
	//    2    4:invokevirtual   #150 <Method boolean checkType(PdfName)>
	//    3    7:ireturn         
	}

	public boolean isPage()
	{
		return checkType(PAGE);
	//    0    0:aload_0         
	//    1    1:getstatic       #27  <Field PdfName PAGE>
	//    2    4:invokevirtual   #150 <Method boolean checkType(PdfName)>
	//    3    7:ireturn         
	}

	public boolean isPages()
	{
		return checkType(PAGES);
	//    0    0:aload_0         
	//    1    1:getstatic       #30  <Field PdfName PAGES>
	//    2    4:invokevirtual   #150 <Method boolean checkType(PdfName)>
	//    3    7:ireturn         
	}

	public void merge(PdfDictionary pdfdictionary)
	{
		hashMap.putAll(((java.util.Map) (pdfdictionary.hashMap)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LinkedHashMap hashMap>
	//    2    4:aload_1         
	//    3    5:getfield        #46  <Field LinkedHashMap hashMap>
	//    4    8:invokevirtual   #160 <Method void LinkedHashMap.putAll(java.util.Map)>
	//    5   11:return          
	}

	public void mergeDifferent(PdfDictionary pdfdictionary)
	{
		Iterator iterator = pdfdictionary.hashMap.keySet().iterator();
	//    0    0:aload_1         
	//    1    1:getfield        #46  <Field LinkedHashMap hashMap>
	//    2    4:invokevirtual   #145 <Method Set LinkedHashMap.keySet()>
	//    3    7:invokeinterface #167 <Method Iterator Set.iterator()>
	//    4   12:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   13:aload_2         
	//    6   14:invokeinterface #172 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            63
			PdfName pdfname = (PdfName)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #176 <Method Object Iterator.next()>
	//   10   28:checkcast       #18  <Class PdfName>
	//   11   31:astore_3        
			if(!hashMap.containsKey(((Object) (pdfname))))
	//*  12   32:aload_0         
	//*  13   33:getfield        #46  <Field LinkedHashMap hashMap>
	//*  14   36:aload_3         
	//*  15   37:invokevirtual   #73  <Method boolean LinkedHashMap.containsKey(Object)>
	//*  16   40:ifne            13
				hashMap.put(((Object) (pdfname)), pdfdictionary.hashMap.get(((Object) (pdfname))));
	//   17   43:aload_0         
	//   18   44:getfield        #46  <Field LinkedHashMap hashMap>
	//   19   47:aload_3         
	//   20   48:aload_1         
	//   21   49:getfield        #46  <Field LinkedHashMap hashMap>
	//   22   52:aload_3         
	//   23   53:invokevirtual   #78  <Method Object LinkedHashMap.get(Object)>
	//   24   56:invokevirtual   #179 <Method Object LinkedHashMap.put(Object, Object)>
	//   25   59:pop             
		} while(true);
	//   26   60:goto            13
	//   27   63:return          
	}

	public void put(PdfName pdfname, PdfObject pdfobject)
	{
		if(pdfobject == null || pdfobject.isNull())
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #182 <Method boolean PdfObject.isNull()>
	//*   4    8:ifeq            21
		{
			hashMap.remove(((Object) (pdfname)));
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field LinkedHashMap hashMap>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #185 <Method Object LinkedHashMap.remove(Object)>
	//    9   19:pop             
			return;
	//   10   20:return          
		} else
		{
			hashMap.put(((Object) (pdfname)), ((Object) (pdfobject)));
	//   11   21:aload_0         
	//   12   22:getfield        #46  <Field LinkedHashMap hashMap>
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #179 <Method Object LinkedHashMap.put(Object, Object)>
	//   16   30:pop             
			return;
	//   17   31:return          
		}
	}

	public void putAll(PdfDictionary pdfdictionary)
	{
		hashMap.putAll(((java.util.Map) (pdfdictionary.hashMap)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LinkedHashMap hashMap>
	//    2    4:aload_1         
	//    3    5:getfield        #46  <Field LinkedHashMap hashMap>
	//    4    8:invokevirtual   #160 <Method void LinkedHashMap.putAll(java.util.Map)>
	//    5   11:return          
	}

	public void putEx(PdfName pdfname, PdfObject pdfobject)
	{
		if(pdfobject == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			put(pdfname, pdfobject);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #56  <Method void put(PdfName, PdfObject)>
			return;
	//    7   11:return          
		}
	}

	public void remove(PdfName pdfname)
	{
		hashMap.remove(((Object) (pdfname)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LinkedHashMap hashMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #185 <Method Object LinkedHashMap.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public int size()
	{
		return hashMap.size();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LinkedHashMap hashMap>
	//    2    4:invokevirtual   #190 <Method int LinkedHashMap.size()>
	//    3    7:ireturn         
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 11, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokestatic    #200 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		outputstream.write(60);
	//    4    7:aload_2         
	//    5    8:bipush          60
	//    6   10:invokevirtual   #205 <Method void OutputStream.write(int)>
		outputstream.write(60);
	//    7   13:aload_2         
	//    8   14:bipush          60
	//    9   16:invokevirtual   #205 <Method void OutputStream.write(int)>
		Object obj;
		for(Iterator iterator = hashMap.entrySet().iterator(); iterator.hasNext(); ((PdfObject) (obj)).toPdf(pdfwriter, outputstream))
	//*  10   19:aload_0         
	//*  11   20:getfield        #46  <Field LinkedHashMap hashMap>
	//*  12   23:invokevirtual   #208 <Method Set LinkedHashMap.entrySet()>
	//*  13   26:invokeinterface #167 <Method Iterator Set.iterator()>
	//*  14   31:astore          4
	//*  15   33:aload           4
	//*  16   35:invokeinterface #172 <Method boolean Iterator.hasNext()>
	//*  17   40:ifeq            125
		{
			obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   18   43:aload           4
	//   19   45:invokeinterface #176 <Method Object Iterator.next()>
	//   20   50:checkcast       #210 <Class java.util.Map$Entry>
	//   21   53:astore          5
			((PdfName)((java.util.Map.Entry) (obj)).getKey()).toPdf(pdfwriter, outputstream);
	//   22   55:aload           5
	//   23   57:invokeinterface #213 <Method Object java.util.Map$Entry.getKey()>
	//   24   62:checkcast       #18  <Class PdfName>
	//   25   65:aload_1         
	//   26   66:aload_2         
	//   27   67:invokevirtual   #215 <Method void PdfName.toPdf(PdfWriter, OutputStream)>
			obj = ((Object) ((PdfObject)((java.util.Map.Entry) (obj)).getValue()));
	//   28   70:aload           5
	//   29   72:invokeinterface #218 <Method Object java.util.Map$Entry.getValue()>
	//   30   77:checkcast       #4   <Class PdfObject>
	//   31   80:astore          5
			int i = ((PdfObject) (obj)).type();
	//   32   82:aload           5
	//   33   84:invokevirtual   #221 <Method int PdfObject.type()>
	//   34   87:istore_3        
			if(i != 5 && i != 6 && i != 4 && i != 3)
	//*  35   88:iload_3         
	//*  36   89:iconst_5        
	//*  37   90:icmpeq          115
	//*  38   93:iload_3         
	//*  39   94:bipush          6
	//*  40   96:icmpeq          115
	//*  41   99:iload_3         
	//*  42  100:iconst_4        
	//*  43  101:icmpeq          115
	//*  44  104:iload_3         
	//*  45  105:iconst_3        
	//*  46  106:icmpeq          115
				outputstream.write(32);
	//   47  109:aload_2         
	//   48  110:bipush          32
	//   49  112:invokevirtual   #205 <Method void OutputStream.write(int)>
		}

	//   50  115:aload           5
	//   51  117:aload_1         
	//   52  118:aload_2         
	//   53  119:invokevirtual   #222 <Method void PdfObject.toPdf(PdfWriter, OutputStream)>
	//*  54  122:goto            33
		outputstream.write(62);
	//   55  125:aload_2         
	//   56  126:bipush          62
	//   57  128:invokevirtual   #205 <Method void OutputStream.write(int)>
		outputstream.write(62);
	//   58  131:aload_2         
	//   59  132:bipush          62
	//   60  134:invokevirtual   #205 <Method void OutputStream.write(int)>
	//   61  137:return          
	}

	public String toString()
	{
		if(get(PdfName.TYPE) == null)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #52  <Field PdfName PdfName.TYPE>
	//*   2    4:invokevirtual   #105 <Method PdfObject get(PdfName)>
	//*   3    7:ifnonnull       13
			return "Dictionary";
	//    4   10:ldc1            #227 <String "Dictionary">
	//    5   12:areturn         
		else
			return (new StringBuilder()).append("Dictionary of type: ").append(((Object) (get(PdfName.TYPE)))).toString();
	//    6   13:new             #229 <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #230 <Method void StringBuilder()>
	//    9   20:ldc1            #232 <String "Dictionary of type: ">
	//   10   22:invokevirtual   #236 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:getstatic       #52  <Field PdfName PdfName.TYPE>
	//   13   29:invokevirtual   #105 <Method PdfObject get(PdfName)>
	//   14   32:invokevirtual   #239 <Method StringBuilder StringBuilder.append(Object)>
	//   15   35:invokevirtual   #241 <Method String StringBuilder.toString()>
	//   16   38:areturn         
	}

	public static final PdfName CATALOG;
	public static final PdfName FONT;
	public static final PdfName OUTLINES;
	public static final PdfName PAGE;
	public static final PdfName PAGES;
	private PdfName dictionaryType;
	protected LinkedHashMap hashMap;

	static 
	{
		FONT = PdfName.FONT;
	//    0    0:getstatic       #20  <Field PdfName PdfName.FONT>
	//    1    3:putstatic       #21  <Field PdfName FONT>
		OUTLINES = PdfName.OUTLINES;
	//    2    6:getstatic       #23  <Field PdfName PdfName.OUTLINES>
	//    3    9:putstatic       #24  <Field PdfName OUTLINES>
		PAGE = PdfName.PAGE;
	//    4   12:getstatic       #26  <Field PdfName PdfName.PAGE>
	//    5   15:putstatic       #27  <Field PdfName PAGE>
		PAGES = PdfName.PAGES;
	//    6   18:getstatic       #29  <Field PdfName PdfName.PAGES>
	//    7   21:putstatic       #30  <Field PdfName PAGES>
		CATALOG = PdfName.CATALOG;
	//    8   24:getstatic       #32  <Field PdfName PdfName.CATALOG>
	//    9   27:putstatic       #33  <Field PdfName CATALOG>
	//*  10   30:return          
	}
}
