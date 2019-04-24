// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, PdfNumber, PdfBoolean, PdfDictionary, 
//			PdfIndirectReference, PdfName, PdfStream, PdfString, 
//			PdfReader, PdfWriter, PdfNull

public class PdfArray extends PdfObject
	implements Iterable
{

	public PdfArray()
	{
		super(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #15  <Method void PdfObject(int)>
		arrayList = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #17  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void ArrayList()>
	//    7   13:putfield        #21  <Field ArrayList arrayList>
	//    8   16:return          
	}

	public PdfArray(int i)
	{
		super(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #15  <Method void PdfObject(int)>
		arrayList = new ArrayList(i);
	//    3    5:aload_0         
	//    4    6:new             #17  <Class ArrayList>
	//    5    9:dup             
	//    6   10:iload_1         
	//    7   11:invokespecial   #23  <Method void ArrayList(int)>
	//    8   14:putfield        #21  <Field ArrayList arrayList>
	//    9   17:return          
	}

	public PdfArray(PdfArray pdfarray)
	{
		super(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #15  <Method void PdfObject(int)>
		arrayList = new ArrayList(((java.util.Collection) (pdfarray.arrayList)));
	//    3    5:aload_0         
	//    4    6:new             #17  <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:getfield        #21  <Field ArrayList arrayList>
	//    8   14:invokespecial   #27  <Method void ArrayList(java.util.Collection)>
	//    9   17:putfield        #21  <Field ArrayList arrayList>
	//   10   20:return          
	}

	public PdfArray(PdfObject pdfobject)
	{
		super(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #15  <Method void PdfObject(int)>
		arrayList = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #17  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void ArrayList()>
	//    7   13:putfield        #21  <Field ArrayList arrayList>
		arrayList.add(((Object) (pdfobject)));
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field ArrayList arrayList>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #32  <Method boolean ArrayList.add(Object)>
	//   12   24:pop             
	//   13   25:return          
	}

	public PdfArray(List list)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void PdfArray()>
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); add((PdfObject)((Iterator) (list)).next()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #40  <Method Iterator List.iterator()>
	//    4   10:astore_1        
	//    5   11:aload_1         
	//    6   12:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            37
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokeinterface #50  <Method Object Iterator.next()>
	//   11   27:checkcast       #5   <Class PdfObject>
	//   12   30:invokevirtual   #53  <Method boolean add(PdfObject)>
	//   13   33:pop             
	//*  14   34:goto            11
	//   15   37:return          
	}

	public PdfArray(float af[])
	{
		super(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #15  <Method void PdfObject(int)>
		arrayList = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #17  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void ArrayList()>
	//    7   13:putfield        #21  <Field ArrayList arrayList>
		add(af);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #59  <Method boolean add(float[])>
	//   11   21:pop             
	//   12   22:return          
	}

	public PdfArray(int ai[])
	{
		super(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #15  <Method void PdfObject(int)>
		arrayList = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #17  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void ArrayList()>
	//    7   13:putfield        #21  <Field ArrayList arrayList>
		add(ai);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #63  <Method boolean add(int[])>
	//   11   21:pop             
	//   12   22:return          
	}

	public void add(int i, PdfObject pdfobject)
	{
		arrayList.add(i, ((Object) (pdfobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #67  <Method void ArrayList.add(int, Object)>
	//    5    9:return          
	}

	public boolean add(PdfObject pdfobject)
	{
		return arrayList.add(((Object) (pdfobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method boolean ArrayList.add(Object)>
	//    4    8:ireturn         
	}

	public boolean add(float af[])
	{
		for(int i = 0; i < af.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:arraylength     
	//*   5    5:icmpge          33
			arrayList.add(((Object) (new PdfNumber(af[i]))));
	//    6    8:aload_0         
	//    7    9:getfield        #21  <Field ArrayList arrayList>
	//    8   12:new             #69  <Class PdfNumber>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:faload          
	//   13   19:invokespecial   #72  <Method void PdfNumber(float)>
	//   14   22:invokevirtual   #32  <Method boolean ArrayList.add(Object)>
	//   15   25:pop             

	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
	//*  20   30:goto            2
		return true;
	//   21   33:iconst_1        
	//   22   34:ireturn         
	}

	public boolean add(int ai[])
	{
		for(int i = 0; i < ai.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:arraylength     
	//*   5    5:icmpge          33
			arrayList.add(((Object) (new PdfNumber(ai[i]))));
	//    6    8:aload_0         
	//    7    9:getfield        #21  <Field ArrayList arrayList>
	//    8   12:new             #69  <Class PdfNumber>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:iaload          
	//   13   19:invokespecial   #73  <Method void PdfNumber(int)>
	//   14   22:invokevirtual   #32  <Method boolean ArrayList.add(Object)>
	//   15   25:pop             

	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
	//*  20   30:goto            2
		return true;
	//   21   33:iconst_1        
	//   22   34:ireturn         
	}

	public void addFirst(PdfObject pdfobject)
	{
		arrayList.add(0, ((Object) (pdfobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #67  <Method void ArrayList.add(int, Object)>
	//    5    9:return          
	}

	public double[] asDoubleArray()
	{
		double ad[] = new double[size()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method int size()>
	//    2    4:newarray        double[]
	//    3    6:astore_2        
		for(int i = 0; i < ad.length; i++)
	//*   4    7:iconst_0        
	//*   5    8:istore_1        
	//*   6    9:iload_1         
	//*   7   10:aload_2         
	//*   8   11:arraylength     
	//*   9   12:icmpge          33
			ad[i] = getAsNumber(i).doubleValue();
	//   10   15:aload_2         
	//   11   16:iload_1         
	//   12   17:aload_0         
	//   13   18:iload_1         
	//   14   19:invokevirtual   #84  <Method PdfNumber getAsNumber(int)>
	//   15   22:invokevirtual   #88  <Method double PdfNumber.doubleValue()>
	//   16   25:dastore         

	//   17   26:iload_1         
	//   18   27:iconst_1        
	//   19   28:iadd            
	//   20   29:istore_1        
	//*  21   30:goto            9
		return ad;
	//   22   33:aload_2         
	//   23   34:areturn         
	}

	public long[] asLongArray()
	{
		long al[] = new long[size()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method int size()>
	//    2    4:newarray        long[]
	//    3    6:astore_2        
		for(int i = 0; i < al.length; i++)
	//*   4    7:iconst_0        
	//*   5    8:istore_1        
	//*   6    9:iload_1         
	//*   7   10:aload_2         
	//*   8   11:arraylength     
	//*   9   12:icmpge          33
			al[i] = getAsNumber(i).longValue();
	//   10   15:aload_2         
	//   11   16:iload_1         
	//   12   17:aload_0         
	//   13   18:iload_1         
	//   14   19:invokevirtual   #84  <Method PdfNumber getAsNumber(int)>
	//   15   22:invokevirtual   #94  <Method long PdfNumber.longValue()>
	//   16   25:lastore         

	//   17   26:iload_1         
	//   18   27:iconst_1        
	//   19   28:iadd            
	//   20   29:istore_1        
	//*  21   30:goto            9
		return al;
	//   22   33:aload_2         
	//   23   34:areturn         
	}

	public boolean contains(PdfObject pdfobject)
	{
		return arrayList.contains(((Object) (pdfobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #97  <Method boolean ArrayList.contains(Object)>
	//    4    8:ireturn         
	}

	public ArrayList getArrayList()
	{
		return arrayList;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:areturn         
	}

	public PdfArray getAsArray(int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		PdfObject pdfobject = getDirectObject(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #108 <Method PdfObject getDirectObject(int)>
	//    5    7:astore          4
		PdfArray pdfarray = ((PdfArray) (obj));
	//    6    9:aload_3         
	//    7   10:astore_2        
		if(pdfobject != null)
	//*   8   11:aload           4
	//*   9   13:ifnull          32
		{
			pdfarray = ((PdfArray) (obj));
	//   10   16:aload_3         
	//   11   17:astore_2        
			if(pdfobject.isArray())
	//*  12   18:aload           4
	//*  13   20:invokevirtual   #111 <Method boolean PdfObject.isArray()>
	//*  14   23:ifeq            32
				pdfarray = (PdfArray)pdfobject;
	//   15   26:aload           4
	//   16   28:checkcast       #2   <Class PdfArray>
	//   17   31:astore_2        
		}
		return pdfarray;
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public PdfBoolean getAsBoolean(int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		PdfObject pdfobject = getDirectObject(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #108 <Method PdfObject getDirectObject(int)>
	//    5    7:astore          4
		PdfBoolean pdfboolean = ((PdfBoolean) (obj));
	//    6    9:aload_3         
	//    7   10:astore_2        
		if(pdfobject != null)
	//*   8   11:aload           4
	//*   9   13:ifnull          32
		{
			pdfboolean = ((PdfBoolean) (obj));
	//   10   16:aload_3         
	//   11   17:astore_2        
			if(pdfobject.isBoolean())
	//*  12   18:aload           4
	//*  13   20:invokevirtual   #116 <Method boolean PdfObject.isBoolean()>
	//*  14   23:ifeq            32
				pdfboolean = (PdfBoolean)pdfobject;
	//   15   26:aload           4
	//   16   28:checkcast       #118 <Class PdfBoolean>
	//   17   31:astore_2        
		}
		return pdfboolean;
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public PdfDictionary getAsDict(int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		PdfObject pdfobject = getDirectObject(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #108 <Method PdfObject getDirectObject(int)>
	//    5    7:astore          4
		PdfDictionary pdfdictionary = ((PdfDictionary) (obj));
	//    6    9:aload_3         
	//    7   10:astore_2        
		if(pdfobject != null)
	//*   8   11:aload           4
	//*   9   13:ifnull          32
		{
			pdfdictionary = ((PdfDictionary) (obj));
	//   10   16:aload_3         
	//   11   17:astore_2        
			if(pdfobject.isDictionary())
	//*  12   18:aload           4
	//*  13   20:invokevirtual   #123 <Method boolean PdfObject.isDictionary()>
	//*  14   23:ifeq            32
				pdfdictionary = (PdfDictionary)pdfobject;
	//   15   26:aload           4
	//   16   28:checkcast       #125 <Class PdfDictionary>
	//   17   31:astore_2        
		}
		return pdfdictionary;
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public PdfIndirectReference getAsIndirectObject(int i)
	{
		PdfIndirectReference pdfindirectreference = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		PdfObject pdfobject = getPdfObject(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #130 <Method PdfObject getPdfObject(int)>
	//    5    7:astore_3        
		if(pdfobject instanceof PdfIndirectReference)
	//*   6    8:aload_3         
	//*   7    9:instanceof      #132 <Class PdfIndirectReference>
	//*   8   12:ifeq            20
			pdfindirectreference = (PdfIndirectReference)pdfobject;
	//    9   15:aload_3         
	//   10   16:checkcast       #132 <Class PdfIndirectReference>
	//   11   19:astore_2        
		return pdfindirectreference;
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	public PdfName getAsName(int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		PdfObject pdfobject = getDirectObject(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #108 <Method PdfObject getDirectObject(int)>
	//    5    7:astore          4
		PdfName pdfname = ((PdfName) (obj));
	//    6    9:aload_3         
	//    7   10:astore_2        
		if(pdfobject != null)
	//*   8   11:aload           4
	//*   9   13:ifnull          32
		{
			pdfname = ((PdfName) (obj));
	//   10   16:aload_3         
	//   11   17:astore_2        
			if(pdfobject.isName())
	//*  12   18:aload           4
	//*  13   20:invokevirtual   #137 <Method boolean PdfObject.isName()>
	//*  14   23:ifeq            32
				pdfname = (PdfName)pdfobject;
	//   15   26:aload           4
	//   16   28:checkcast       #139 <Class PdfName>
	//   17   31:astore_2        
		}
		return pdfname;
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public PdfNumber getAsNumber(int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		PdfObject pdfobject = getDirectObject(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #108 <Method PdfObject getDirectObject(int)>
	//    5    7:astore          4
		PdfNumber pdfnumber = ((PdfNumber) (obj));
	//    6    9:aload_3         
	//    7   10:astore_2        
		if(pdfobject != null)
	//*   8   11:aload           4
	//*   9   13:ifnull          32
		{
			pdfnumber = ((PdfNumber) (obj));
	//   10   16:aload_3         
	//   11   17:astore_2        
			if(pdfobject.isNumber())
	//*  12   18:aload           4
	//*  13   20:invokevirtual   #142 <Method boolean PdfObject.isNumber()>
	//*  14   23:ifeq            32
				pdfnumber = (PdfNumber)pdfobject;
	//   15   26:aload           4
	//   16   28:checkcast       #69  <Class PdfNumber>
	//   17   31:astore_2        
		}
		return pdfnumber;
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public PdfStream getAsStream(int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		PdfObject pdfobject = getDirectObject(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #108 <Method PdfObject getDirectObject(int)>
	//    5    7:astore          4
		PdfStream pdfstream = ((PdfStream) (obj));
	//    6    9:aload_3         
	//    7   10:astore_2        
		if(pdfobject != null)
	//*   8   11:aload           4
	//*   9   13:ifnull          32
		{
			pdfstream = ((PdfStream) (obj));
	//   10   16:aload_3         
	//   11   17:astore_2        
			if(pdfobject.isStream())
	//*  12   18:aload           4
	//*  13   20:invokevirtual   #147 <Method boolean PdfObject.isStream()>
	//*  14   23:ifeq            32
				pdfstream = (PdfStream)pdfobject;
	//   15   26:aload           4
	//   16   28:checkcast       #149 <Class PdfStream>
	//   17   31:astore_2        
		}
		return pdfstream;
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public PdfString getAsString(int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		PdfObject pdfobject = getDirectObject(i);
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokevirtual   #108 <Method PdfObject getDirectObject(int)>
	//    5    7:astore          4
		PdfString pdfstring = ((PdfString) (obj));
	//    6    9:aload_3         
	//    7   10:astore_2        
		if(pdfobject != null)
	//*   8   11:aload           4
	//*   9   13:ifnull          32
		{
			pdfstring = ((PdfString) (obj));
	//   10   16:aload_3         
	//   11   17:astore_2        
			if(pdfobject.isString())
	//*  12   18:aload           4
	//*  13   20:invokevirtual   #154 <Method boolean PdfObject.isString()>
	//*  14   23:ifeq            32
				pdfstring = (PdfString)pdfobject;
	//   15   26:aload           4
	//   16   28:checkcast       #156 <Class PdfString>
	//   17   31:astore_2        
		}
		return pdfstring;
	//   18   32:aload_2         
	//   19   33:areturn         
	}

	public PdfObject getDirectObject(int i)
	{
		return PdfReader.getPdfObject(getPdfObject(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #130 <Method PdfObject getPdfObject(int)>
	//    3    5:invokestatic    #161 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//    4    8:areturn         
	}

	public PdfObject getPdfObject(int i)
	{
		return (PdfObject)arrayList.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #165 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #5   <Class PdfObject>
	//    5   11:areturn         
	}

	public boolean isEmpty()
	{
		return arrayList.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:invokevirtual   #168 <Method boolean ArrayList.isEmpty()>
	//    3    7:ireturn         
	}

	public Iterator iterator()
	{
		return arrayList.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:invokevirtual   #169 <Method Iterator ArrayList.iterator()>
	//    3    7:areturn         
	}

	public ListIterator listIterator()
	{
		return arrayList.listIterator();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:invokevirtual   #174 <Method ListIterator ArrayList.listIterator()>
	//    3    7:areturn         
	}

	public PdfObject remove(int i)
	{
		return (PdfObject)arrayList.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #178 <Method Object ArrayList.remove(int)>
	//    4    8:checkcast       #5   <Class PdfObject>
	//    5   11:areturn         
	}

	public PdfObject set(int i, PdfObject pdfobject)
	{
		return (PdfObject)arrayList.set(i, ((Object) (pdfobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #183 <Method Object ArrayList.set(int, Object)>
	//    5    9:checkcast       #5   <Class PdfObject>
	//    6   12:areturn         
	}

	public int size()
	{
		return arrayList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:invokevirtual   #184 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 11, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokestatic    #194 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		outputstream.write(91);
	//    4    7:aload_2         
	//    5    8:bipush          91
	//    6   10:invokevirtual   #199 <Method void OutputStream.write(int)>
		Iterator iterator1 = arrayList.iterator();
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field ArrayList arrayList>
	//    9   17:invokevirtual   #169 <Method Iterator ArrayList.iterator()>
	//   10   20:astore          6
		if(iterator1.hasNext())
	//*  11   22:aload           6
	//*  12   24:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            65
		{
			PdfObject pdfobject = (PdfObject)iterator1.next();
	//   14   32:aload           6
	//   15   34:invokeinterface #50  <Method Object Iterator.next()>
	//   16   39:checkcast       #5   <Class PdfObject>
	//   17   42:astore          5
			Object obj = ((Object) (pdfobject));
	//   18   44:aload           5
	//   19   46:astore          4
			if(pdfobject == null)
	//*  20   48:aload           5
	//*  21   50:ifnonnull       58
				obj = ((Object) (PdfNull.PDFNULL));
	//   22   53:getstatic       #205 <Field PdfNull PdfNull.PDFNULL>
	//   23   56:astore          4
			((PdfObject) (obj)).toPdf(pdfwriter, outputstream);
	//   24   58:aload           4
	//   25   60:aload_1         
	//   26   61:aload_2         
	//   27   62:invokevirtual   #207 <Method void PdfObject.toPdf(PdfWriter, OutputStream)>
		}
		Object obj1;
		for(; iterator1.hasNext(); ((PdfObject) (obj1)).toPdf(pdfwriter, outputstream))
	//*  28   65:aload           6
	//*  29   67:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  30   72:ifeq            144
		{
			PdfObject pdfobject1 = (PdfObject)iterator1.next();
	//   31   75:aload           6
	//   32   77:invokeinterface #50  <Method Object Iterator.next()>
	//   33   82:checkcast       #5   <Class PdfObject>
	//   34   85:astore          5
			obj1 = ((Object) (pdfobject1));
	//   35   87:aload           5
	//   36   89:astore          4
			if(pdfobject1 == null)
	//*  37   91:aload           5
	//*  38   93:ifnonnull       101
				obj1 = ((Object) (PdfNull.PDFNULL));
	//   39   96:getstatic       #205 <Field PdfNull PdfNull.PDFNULL>
	//   40   99:astore          4
			int i = ((PdfObject) (obj1)).type();
	//   41  101:aload           4
	//   42  103:invokevirtual   #210 <Method int PdfObject.type()>
	//   43  106:istore_3        
			if(i != 5 && i != 6 && i != 4 && i != 3)
	//*  44  107:iload_3         
	//*  45  108:iconst_5        
	//*  46  109:icmpeq          134
	//*  47  112:iload_3         
	//*  48  113:bipush          6
	//*  49  115:icmpeq          134
	//*  50  118:iload_3         
	//*  51  119:iconst_4        
	//*  52  120:icmpeq          134
	//*  53  123:iload_3         
	//*  54  124:iconst_3        
	//*  55  125:icmpeq          134
				outputstream.write(32);
	//   56  128:aload_2         
	//   57  129:bipush          32
	//   58  131:invokevirtual   #199 <Method void OutputStream.write(int)>
		}

	//   59  134:aload           4
	//   60  136:aload_1         
	//   61  137:aload_2         
	//   62  138:invokevirtual   #207 <Method void PdfObject.toPdf(PdfWriter, OutputStream)>
	//*  63  141:goto            65
		outputstream.write(93);
	//   64  144:aload_2         
	//   65  145:bipush          93
	//   66  147:invokevirtual   #199 <Method void OutputStream.write(int)>
	//   67  150:return          
	}

	public String toString()
	{
		return arrayList.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList arrayList>
	//    2    4:invokevirtual   #215 <Method String ArrayList.toString()>
	//    3    7:areturn         
	}

	protected ArrayList arrayList;
}
