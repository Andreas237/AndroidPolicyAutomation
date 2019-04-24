// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			AcroFields, PdfDictionary, PdfIndirectReference, PdfName, 
//			PdfObject

public static class AcroFields$Item
{

	void addMerged(PdfDictionary pdfdictionary)
	{
		merged.add(((Object) (pdfdictionary)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ArrayList merged>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void addPage(int i)
	{
		page.add(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ArrayList page>
	//    2    4:iload_1         
	//    3    5:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	void addTabOrder(int i)
	{
		tabOrder.add(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ArrayList tabOrder>
	//    2    4:iload_1         
	//    3    5:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	void addValue(PdfDictionary pdfdictionary)
	{
		values.add(((Object) (pdfdictionary)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ArrayList values>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void addWidget(PdfDictionary pdfdictionary)
	{
		widgets.add(((Object) (pdfdictionary)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayList widgets>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void addWidgetRef(PdfIndirectReference pdfindirectreference)
	{
		widget_refs.add(((Object) (pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList widget_refs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void forcePage(int i, int j)
	{
		page.set(i, ((Object) (Integer.valueOf(j))));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ArrayList page>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #69  <Method Object ArrayList.set(int, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public PdfDictionary getMerged(int i)
	{
		return (PdfDictionary)merged.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ArrayList merged>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #77  <Class PdfDictionary>
	//    5   11:areturn         
	}

	public Integer getPage(int i)
	{
		return (Integer)page.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ArrayList page>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #54  <Class Integer>
	//    5   11:areturn         
	}

	public Integer getTabOrder(int i)
	{
		return (Integer)tabOrder.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ArrayList tabOrder>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #54  <Class Integer>
	//    5   11:areturn         
	}

	public PdfDictionary getValue(int i)
	{
		return (PdfDictionary)values.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ArrayList values>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #77  <Class PdfDictionary>
	//    5   11:areturn         
	}

	public PdfDictionary getWidget(int i)
	{
		return (PdfDictionary)widgets.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayList widgets>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #77  <Class PdfDictionary>
	//    5   11:areturn         
	}

	public PdfIndirectReference getWidgetRef(int i)
	{
		return (PdfIndirectReference)widget_refs.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList widget_refs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #85  <Class PdfIndirectReference>
	//    5   11:areturn         
	}

	public void markUsed(AcroFields acrofields, int i)
	{
		if((i & 4) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:iand            
	//*   3    3:ifeq            32
		{
			for(int j = 0; j < size(); j++)
	//*   4    6:iconst_0        
	//*   5    7:istore_3        
	//*   6    8:iload_3         
	//*   7    9:aload_0         
	//*   8   10:invokevirtual   #91  <Method int size()>
	//*   9   13:icmpge          32
				AcroFields.access$000(acrofields, ((PdfObject) (getValue(j))));
	//   10   16:aload_1         
	//   11   17:aload_0         
	//   12   18:iload_3         
	//   13   19:invokevirtual   #93  <Method PdfDictionary getValue(int)>
	//   14   22:invokestatic    #97  <Method void AcroFields.access$000(AcroFields, PdfObject)>

	//   15   25:iload_3         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:istore_3        
		}
	//*  19   29:goto            8
		if((i & 2) != 0)
	//*  20   32:iload_2         
	//*  21   33:iconst_2        
	//*  22   34:iand            
	//*  23   35:ifeq            64
			for(i = 0; i < size(); i++)
	//*  24   38:iconst_0        
	//*  25   39:istore_2        
	//*  26   40:iload_2         
	//*  27   41:aload_0         
	//*  28   42:invokevirtual   #91  <Method int size()>
	//*  29   45:icmpge          64
				AcroFields.access$000(acrofields, ((PdfObject) (getWidget(i))));
	//   30   48:aload_1         
	//   31   49:aload_0         
	//   32   50:iload_2         
	//   33   51:invokevirtual   #99  <Method PdfDictionary getWidget(int)>
	//   34   54:invokestatic    #97  <Method void AcroFields.access$000(AcroFields, PdfObject)>

	//   35   57:iload_2         
	//   36   58:iconst_1        
	//   37   59:iadd            
	//   38   60:istore_2        
	//*  39   61:goto            40
	//   40   64:return          
	}

	void remove(int i)
	{
		values.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ArrayList values>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #102 <Method Object ArrayList.remove(int)>
	//    4    8:pop             
		widgets.remove(i);
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field ArrayList widgets>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #102 <Method Object ArrayList.remove(int)>
	//    9   17:pop             
		widget_refs.remove(i);
	//   10   18:aload_0         
	//   11   19:getfield        #37  <Field ArrayList widget_refs>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #102 <Method Object ArrayList.remove(int)>
	//   14   26:pop             
		merged.remove(i);
	//   15   27:aload_0         
	//   16   28:getfield        #39  <Field ArrayList merged>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #102 <Method Object ArrayList.remove(int)>
	//   19   35:pop             
		page.remove(i);
	//   20   36:aload_0         
	//   21   37:getfield        #41  <Field ArrayList page>
	//   22   40:iload_1         
	//   23   41:invokevirtual   #102 <Method Object ArrayList.remove(int)>
	//   24   44:pop             
		tabOrder.remove(i);
	//   25   45:aload_0         
	//   26   46:getfield        #43  <Field ArrayList tabOrder>
	//   27   49:iload_1         
	//   28   50:invokevirtual   #102 <Method Object ArrayList.remove(int)>
	//   29   53:pop             
	//   30   54:return          
	}

	public int size()
	{
		return values.size();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ArrayList values>
	//    2    4:invokevirtual   #103 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public void writeToAll(PdfName pdfname, PdfObject pdfobject, int i)
	{
		if((i & 1) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            41
		{
			for(int j = 0; j < merged.size(); j++)
	//*   4    6:iconst_0        
	//*   5    7:istore          4
	//*   6    9:iload           4
	//*   7   11:aload_0         
	//*   8   12:getfield        #39  <Field ArrayList merged>
	//*   9   15:invokevirtual   #103 <Method int ArrayList.size()>
	//*  10   18:icmpge          41
				getMerged(j).put(pdfname, pdfobject);
	//   11   21:aload_0         
	//   12   22:iload           4
	//   13   24:invokevirtual   #107 <Method PdfDictionary getMerged(int)>
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:invokevirtual   #111 <Method void PdfDictionary.put(PdfName, PdfObject)>

	//   17   32:iload           4
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore          4
		}
	//*  21   38:goto            9
		if((i & 2) != 0)
	//*  22   41:iload_3         
	//*  23   42:iconst_2        
	//*  24   43:iand            
	//*  25   44:ifeq            82
		{
			for(int k = 0; k < widgets.size(); k++)
	//*  26   47:iconst_0        
	//*  27   48:istore          4
	//*  28   50:iload           4
	//*  29   52:aload_0         
	//*  30   53:getfield        #35  <Field ArrayList widgets>
	//*  31   56:invokevirtual   #103 <Method int ArrayList.size()>
	//*  32   59:icmpge          82
				getWidget(k).put(pdfname, pdfobject);
	//   33   62:aload_0         
	//   34   63:iload           4
	//   35   65:invokevirtual   #99  <Method PdfDictionary getWidget(int)>
	//   36   68:aload_1         
	//   37   69:aload_2         
	//   38   70:invokevirtual   #111 <Method void PdfDictionary.put(PdfName, PdfObject)>

	//   39   73:iload           4
	//   40   75:iconst_1        
	//   41   76:iadd            
	//   42   77:istore          4
		}
	//*  43   79:goto            50
		if((i & 4) != 0)
	//*  44   82:iload_3         
	//*  45   83:iconst_4        
	//*  46   84:iand            
	//*  47   85:ifeq            118
			for(i = 0; i < values.size(); i++)
	//*  48   88:iconst_0        
	//*  49   89:istore_3        
	//*  50   90:iload_3         
	//*  51   91:aload_0         
	//*  52   92:getfield        #33  <Field ArrayList values>
	//*  53   95:invokevirtual   #103 <Method int ArrayList.size()>
	//*  54   98:icmpge          118
				getValue(i).put(pdfname, pdfobject);
	//   55  101:aload_0         
	//   56  102:iload_3         
	//   57  103:invokevirtual   #93  <Method PdfDictionary getValue(int)>
	//   58  106:aload_1         
	//   59  107:aload_2         
	//   60  108:invokevirtual   #111 <Method void PdfDictionary.put(PdfName, PdfObject)>

	//   61  111:iload_3         
	//   62  112:iconst_1        
	//   63  113:iadd            
	//   64  114:istore_3        
	//*  65  115:goto            90
	//   66  118:return          
	}

	public static final int WRITE_MERGED = 1;
	public static final int WRITE_VALUE = 4;
	public static final int WRITE_WIDGET = 2;
	protected ArrayList merged;
	protected ArrayList page;
	protected ArrayList tabOrder;
	protected ArrayList values;
	protected ArrayList widget_refs;
	protected ArrayList widgets;

	public AcroFields$Item()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		values = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #30  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void ArrayList()>
	//    6   12:putfield        #33  <Field ArrayList values>
		widgets = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #30  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #31  <Method void ArrayList()>
	//   11   23:putfield        #35  <Field ArrayList widgets>
		widget_refs = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #30  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #31  <Method void ArrayList()>
	//   16   34:putfield        #37  <Field ArrayList widget_refs>
		merged = new ArrayList();
	//   17   37:aload_0         
	//   18   38:new             #30  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #31  <Method void ArrayList()>
	//   21   45:putfield        #39  <Field ArrayList merged>
		page = new ArrayList();
	//   22   48:aload_0         
	//   23   49:new             #30  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #31  <Method void ArrayList()>
	//   26   56:putfield        #41  <Field ArrayList page>
		tabOrder = new ArrayList();
	//   27   59:aload_0         
	//   28   60:new             #30  <Class ArrayList>
	//   29   63:dup             
	//   30   64:invokespecial   #31  <Method void ArrayList()>
	//   31   67:putfield        #43  <Field ArrayList tabOrder>
	//   32   70:return          
	}
}
