// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.io.*;
import com.itextpdf.text.pdf.codec.Base64;
import com.itextpdf.text.pdf.security.PdfPKCS7;
import com.itextpdf.text.xml.XmlToTxt;
import java.io.*;
import java.util.*;
import org.w3c.dom.Node;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, XfaForm, PdfStamperImp, PdfDictionary, 
//			PdfNumber, PdfArray, PdfObject, PdfString, 
//			PdfIndirectReference, PRTokeniser, RandomAccessFileOrArray, PdfEncodings, 
//			GrayColor, CMYKColor, PdfReader, BaseField, 
//			PRIndirectReference, DocumentFont, BaseFont, PRStream, 
//			TextField, FdfWriter, PdfBoolean, RadioCheckField, 
//			ExtendedColor, PushbuttonField, PdfFormField, PdfAppearance, 
//			PdfWriter, ByteBuffer, FontDetails, FdfReader, 
//			XfdfReader, PdfDate, IntHashtable

public class AcroFields
{
	public static class FieldPosition
	{

		public int page;
		public Rectangle position;

		public FieldPosition()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class InstHit
	{

		public boolean isHit(int i)
		{
			if(hits == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field IntHashtable hits>
		//*   2    4:ifnonnull       9
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			else
				return hits.containsKey(i);
		//    5    9:aload_0         
		//    6   10:getfield        #19  <Field IntHashtable hits>
		//    7   13:iload_1         
		//    8   14:invokevirtual   #29  <Method boolean IntHashtable.containsKey(int)>
		//    9   17:ireturn         
		}

		IntHashtable hits;

		public InstHit(int ai[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			if(ai != null)
		//*   2    4:aload_1         
		//*   3    5:ifnonnull       9
		//*   4    8:return          
			{
				hits = new IntHashtable();
		//    5    9:aload_0         
		//    6   10:new             #16  <Class IntHashtable>
		//    7   13:dup             
		//    8   14:invokespecial   #17  <Method void IntHashtable()>
		//    9   17:putfield        #19  <Field IntHashtable hits>
				int i = 0;
		//   10   20:iconst_0        
		//   11   21:istore_2        
				while(i < ai.length) 
		//*  12   22:iload_2         
		//*  13   23:aload_1         
		//*  14   24:arraylength     
		//*  15   25:icmpge          8
				{
					hits.put(ai[i], 1);
		//   16   28:aload_0         
		//   17   29:getfield        #19  <Field IntHashtable hits>
		//   18   32:aload_1         
		//   19   33:iload_2         
		//   20   34:iaload          
		//   21   35:iconst_1        
		//   22   36:invokevirtual   #23  <Method int IntHashtable.put(int, int)>
		//   23   39:pop             
					i++;
		//   24   40:iload_2         
		//   25   41:iconst_1        
		//   26   42:iadd            
		//   27   43:istore_2        
				}
			}
		//*  28   44:goto            22
		}
	}

	public static class Item
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
					acrofields.markUsed(((PdfObject) (getValue(j))));
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
					acrofields.markUsed(((PdfObject) (getWidget(i))));
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

		public Item()
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

	private static class SorterComparator
		implements Comparator
	{

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Object[])obj, (Object[])obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class Object[]>
		//    3    5:aload_2         
		//    4    6:checkcast       #21  <Class Object[]>
		//    5    9:invokevirtual   #24  <Method int compare(Object[], Object[])>
		//    6   12:ireturn         
		}

		public int compare(Object aobj[], Object aobj1[])
		{
			return ((int[])(int[])aobj[1])[0] - ((int[])(int[])aobj1[1])[0];
		//    0    0:aload_1         
		//    1    1:iconst_1        
		//    2    2:aaload          
		//    3    3:checkcast       #26  <Class int[]>
		//    4    6:checkcast       #26  <Class int[]>
		//    5    9:iconst_0        
		//    6   10:iaload          
		//    7   11:aload_2         
		//    8   12:iconst_1        
		//    9   13:aaload          
		//   10   14:checkcast       #26  <Class int[]>
		//   11   17:checkcast       #26  <Class int[]>
		//   12   20:iconst_0        
		//   13   21:iaload          
		//   14   22:isub            
		//   15   23:ireturn         
		}

		private SorterComparator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}


	AcroFields(PdfReader pdfreader, PdfWriter pdfwriter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #208 <Method void Object()>
		extensionFonts = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #78  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #81  <Method void HashMap()>
	//    6   12:putfield        #210 <Field HashMap extensionFonts>
		generateAppearances = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #212 <Field boolean generateAppearances>
		localFonts = new HashMap();
	//   10   20:aload_0         
	//   11   21:new             #78  <Class HashMap>
	//   12   24:dup             
	//   13   25:invokespecial   #81  <Method void HashMap()>
	//   14   28:putfield        #214 <Field HashMap localFonts>
		reader = pdfreader;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #216 <Field PdfReader reader>
		writer = pdfwriter;
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:putfield        #218 <Field PdfWriter writer>
		try
		{
			xfa = new XfaForm(pdfreader);
	//   21   41:aload_0         
	//   22   42:new             #220 <Class XfaForm>
	//   23   45:dup             
	//   24   46:aload_1         
	//   25   47:invokespecial   #223 <Method void XfaForm(PdfReader)>
	//   26   50:putfield        #225 <Field XfaForm xfa>
		}
	//*  27   53:aload_2         
	//*  28   54:instanceof      #227 <Class PdfStamperImp>
	//*  29   57:ifeq            71
	//*  30   60:aload_0         
	//*  31   61:aload_2         
	//*  32   62:checkcast       #227 <Class PdfStamperImp>
	//*  33   65:invokevirtual   #231 <Method boolean PdfStamperImp.isAppend()>
	//*  34   68:putfield        #233 <Field boolean append>
	//*  35   71:aload_0         
	//*  36   72:invokevirtual   #236 <Method void fill()>
	//*  37   75:return          
		// Misplaced declaration of an exception variable
		catch(PdfReader pdfreader)
	//*  38   76:astore_1        
		{
			throw new ExceptionConverter(((Exception) (pdfreader)));
	//   39   77:new             #238 <Class ExceptionConverter>
	//   40   80:dup             
	//   41   81:aload_1         
	//   42   82:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//   43   85:athrow          
		}
		if(pdfwriter instanceof PdfStamperImp)
			append = ((PdfStamperImp)pdfwriter).isAppend();
		fill();
	}

	private static void clearSigDic(PdfDictionary pdfdictionary)
	{
		pdfdictionary.remove(PdfName.AP);
	//    0    0:aload_0         
	//    1    1:getstatic       #252 <Field PdfName PdfName.AP>
	//    2    4:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
		pdfdictionary.remove(PdfName.AS);
	//    3    7:aload_0         
	//    4    8:getstatic       #261 <Field PdfName PdfName.AS>
	//    5   11:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
		pdfdictionary.remove(PdfName.V);
	//    6   14:aload_0         
	//    7   15:getstatic       #264 <Field PdfName PdfName.V>
	//    8   18:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
		pdfdictionary.remove(PdfName.DV);
	//    9   21:aload_0         
	//   10   22:getstatic       #267 <Field PdfName PdfName.DV>
	//   11   25:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
		pdfdictionary.remove(PdfName.SV);
	//   12   28:aload_0         
	//   13   29:getstatic       #270 <Field PdfName PdfName.SV>
	//   14   32:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
		pdfdictionary.remove(PdfName.FF);
	//   15   35:aload_0         
	//   16   36:getstatic       #192 <Field PdfName PdfName.FF>
	//   17   39:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
		pdfdictionary.put(PdfName.F, ((PdfObject) (new PdfNumber(4))));
	//   18   42:aload_0         
	//   19   43:getstatic       #189 <Field PdfName PdfName.F>
	//   20   46:new             #272 <Class PdfNumber>
	//   21   49:dup             
	//   22   50:iconst_4        
	//   23   51:invokespecial   #275 <Method void PdfNumber(int)>
	//   24   54:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   25   57:return          
	}

	private String[] getListOption(String s, int i)
	{
		String as[];
		as = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		s = ((String) (getFieldItem(s)));
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokevirtual   #284 <Method AcroFields$Item getFieldItem(String)>
	//    5    8:astore_1        
		if(s != null) goto _L2; else goto _L1
	//    6    9:aload_1         
	//    7   10:ifnonnull       18
_L1:
		s = ((String) (as));
	//    8   13:aload           4
	//    9   15:astore_1        
_L4:
		return ((String []) (s));
	//   10   16:aload_1         
	//   11   17:areturn         
_L2:
		PdfArray pdfarray;
		pdfarray = ((Item) (s)).getMerged(0).getAsArray(PdfName.OPT);
	//   12   18:aload_1         
	//   13   19:iconst_0        
	//   14   20:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   15   23:getstatic       #291 <Field PdfName PdfName.OPT>
	//   16   26:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   17   29:astore          6
		s = ((String) (as));
	//   18   31:aload           4
	//   19   33:astore_1        
		if(pdfarray == null) goto _L4; else goto _L3
	//   20   34:aload           6
	//   21   36:ifnull          16
_L3:
		int j;
		as = new String[pdfarray.size()];
	//   22   39:aload           6
	//   23   41:invokevirtual   #301 <Method int PdfArray.size()>
	//   24   44:anewarray       String[]
	//   25   47:astore          4
		j = 0;
	//   26   49:iconst_0        
	//   27   50:istore_3        
_L6:
		s = ((String) (as));
	//   28   51:aload           4
	//   29   53:astore_1        
		if(j >= pdfarray.size()) goto _L4; else goto _L5
	//   30   54:iload_3         
	//   31   55:aload           6
	//   32   57:invokevirtual   #301 <Method int PdfArray.size()>
	//   33   60:icmpge          16
_L5:
		PdfObject pdfobject;
		pdfobject = pdfarray.getDirectObject(j);
	//   34   63:aload           6
	//   35   65:iload_3         
	//   36   66:invokevirtual   #305 <Method PdfObject PdfArray.getDirectObject(int)>
	//   37   69:astore          5
		s = ((String) (pdfobject));
	//   38   71:aload           5
	//   39   73:astore_1        
label0:
		{
			if(pdfobject.isArray())
	//*  40   74:aload           5
	//*  41   76:invokevirtual   #310 <Method boolean PdfObject.isArray()>
	//*  42   79:ifeq            92
				s = ((String) (((PdfArray)pdfobject).getDirectObject(i)));
	//   43   82:aload           5
	//   44   84:checkcast       #297 <Class PdfArray>
	//   45   87:iload_2         
	//   46   88:invokevirtual   #305 <Method PdfObject PdfArray.getDirectObject(int)>
	//   47   91:astore_1        
			if(((PdfObject) (s)).isString())
	//*  48   92:aload_1         
	//*  49   93:invokevirtual   #313 <Method boolean PdfObject.isString()>
	//*  50   96:ifeq            113
			{
				as[j] = ((PdfString)s).toUnicodeString();
	//   51   99:aload           4
	//   52  101:iload_3         
	//   53  102:aload_1         
	//   54  103:checkcast       #315 <Class PdfString>
	//   55  106:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//   56  109:aastore         
				break label0;
	//   57  110:goto            132
			}
			try
			{
				as[j] = ((PdfObject) (s)).toString();
	//   58  113:aload           4
	//   59  115:iload_3         
	//   60  116:aload_1         
	//   61  117:invokevirtual   #322 <Method String PdfObject.toString()>
	//   62  120:aastore         
			}
	//*  63  121:goto            132
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  64  124:astore_1        
			{
				as[j] = "";
	//   65  125:aload           4
	//   66  127:iload_3         
	//   67  128:ldc2            #324 <String "">
	//   68  131:aastore         
			}
		}
		j++;
	//   69  132:iload_3         
	//   70  133:iconst_1        
	//   71  134:iadd            
	//   72  135:istore_3        
		  goto _L6
	//*  73  136:goto            51
	}

	private void markUsed(PdfObject pdfobject)
	{
		if(!append)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field boolean append>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			((PdfStamperImp)writer).markUsed(pdfobject);
	//    4    8:aload_0         
	//    5    9:getfield        #218 <Field PdfWriter writer>
	//    6   12:checkcast       #227 <Class PdfStamperImp>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #325 <Method void PdfStamperImp.markUsed(PdfObject)>
			return;
	//    9   19:return          
		}
	}

	private int removeRefFromArray(PdfArray pdfarray, PdfObject pdfobject)
	{
		if(pdfobject == null || !pdfobject.isIndirect())
	//*   0    0:aload_2         
	//*   1    1:ifnull          11
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #330 <Method boolean PdfObject.isIndirect()>
	//*   4    8:ifne            16
			return pdfarray.size();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #301 <Method int PdfArray.size()>
	//    7   15:ireturn         
		pdfobject = ((PdfObject) ((PdfIndirectReference)pdfobject));
	//    8   16:aload_2         
	//    9   17:checkcast       #332 <Class PdfIndirectReference>
	//   10   20:astore_2        
		int i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_3        
		while(i < pdfarray.size()) 
	//*  13   23:iload_3         
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #301 <Method int PdfArray.size()>
	//*  16   28:icmpge          89
		{
			PdfObject pdfobject1 = pdfarray.getPdfObject(i);
	//   17   31:aload_1         
	//   18   32:iload_3         
	//   19   33:invokevirtual   #335 <Method PdfObject PdfArray.getPdfObject(int)>
	//   20   36:astore          5
			int j;
			if(!pdfobject1.isIndirect())
	//*  21   38:aload           5
	//*  22   40:invokevirtual   #330 <Method boolean PdfObject.isIndirect()>
	//*  23   43:ifne            57
			{
				j = i;
	//   24   46:iload_3         
	//   25   47:istore          4
			} else
	//*  26   49:iload           4
	//*  27   51:iconst_1        
	//*  28   52:iadd            
	//*  29   53:istore_3        
	//*  30   54:goto            23
			{
				j = i;
	//   31   57:iload_3         
	//   32   58:istore          4
				if(((PdfIndirectReference)pdfobject1).getNumber() == ((PdfIndirectReference) (pdfobject)).getNumber())
	//*  33   60:aload           5
	//*  34   62:checkcast       #332 <Class PdfIndirectReference>
	//*  35   65:invokevirtual   #338 <Method int PdfIndirectReference.getNumber()>
	//*  36   68:aload_2         
	//*  37   69:invokevirtual   #338 <Method int PdfIndirectReference.getNumber()>
	//*  38   72:icmpne          49
				{
					pdfarray.remove(i);
	//   39   75:aload_1         
	//   40   76:iload_3         
	//   41   77:invokevirtual   #340 <Method PdfObject PdfArray.remove(int)>
	//   42   80:pop             
					j = i - 1;
	//   43   81:iload_3         
	//   44   82:iconst_1        
	//   45   83:isub            
	//   46   84:istore          4
				}
			}
			i = j + 1;
		}
	//*  47   86:goto            49
		return pdfarray.size();
	//   48   89:aload_1         
	//   49   90:invokevirtual   #301 <Method int PdfArray.size()>
	//   50   93:ireturn         
	}

	public static Object[] splitDAelements(String s)
	{
		ArrayList arraylist;
		Object aobj[];
		s = ((String) (new PRTokeniser(new RandomAccessFileOrArray((new RandomAccessSourceFactory()).createSource(PdfEncodings.convertToBytes(s, ((String) (null))))))));
	//    0    0:new             #346 <Class PRTokeniser>
	//    1    3:dup             
	//    2    4:new             #348 <Class RandomAccessFileOrArray>
	//    3    7:dup             
	//    4    8:new             #350 <Class RandomAccessSourceFactory>
	//    5   11:dup             
	//    6   12:invokespecial   #351 <Method void RandomAccessSourceFactory()>
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:invokestatic    #357 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//   10   20:invokevirtual   #361 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createSource(byte[])>
	//   11   23:invokespecial   #364 <Method void RandomAccessFileOrArray(com.itextpdf.text.io.RandomAccessSource)>
	//   12   26:invokespecial   #367 <Method void PRTokeniser(RandomAccessFileOrArray)>
	//   13   29:astore_0        
		arraylist = new ArrayList();
	//   14   30:new             #369 <Class ArrayList>
	//   15   33:dup             
	//   16   34:invokespecial   #370 <Method void ArrayList()>
	//   17   37:astore_2        
		aobj = new Object[3];
	//   18   38:iconst_3        
	//   19   39:anewarray       Object[]
	//   20   42:astore_3        
_L3:
		String s1;
		do
			if(!((PRTokeniser) (s)).nextToken())
				break MISSING_BLOCK_LABEL_448;
	//   21   43:aload_0         
	//   22   44:invokevirtual   #373 <Method boolean PRTokeniser.nextToken()>
	//   23   47:ifeq            448
		while(((PRTokeniser) (s)).getTokenType() == PRTokeniser.TokenType.COMMENT);
	//   24   50:aload_0         
	//   25   51:invokevirtual   #377 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//   26   54:getstatic       #383 <Field PRTokeniser$TokenType PRTokeniser$TokenType.COMMENT>
	//   27   57:if_acmpeq       43
		if(((PRTokeniser) (s)).getTokenType() != PRTokeniser.TokenType.OTHER)
			break MISSING_BLOCK_LABEL_436;
	//   28   60:aload_0         
	//   29   61:invokevirtual   #377 <Method PRTokeniser$TokenType PRTokeniser.getTokenType()>
	//   30   64:getstatic       #386 <Field PRTokeniser$TokenType PRTokeniser$TokenType.OTHER>
	//   31   67:if_acmpne       436
		s1 = ((PRTokeniser) (s)).getStringValue();
	//   32   70:aload_0         
	//   33   71:invokevirtual   #389 <Method String PRTokeniser.getStringValue()>
	//   34   74:astore          4
		if(!s1.equals("Tf")) goto _L2; else goto _L1
	//   35   76:aload           4
	//   36   78:ldc2            #391 <String "Tf">
	//   37   81:invokevirtual   #395 <Method boolean String.equals(Object)>
	//   38   84:ifeq            148
_L1:
		if(arraylist.size() >= 2)
	//*  39   87:aload_2         
	//*  40   88:invokevirtual   #396 <Method int ArrayList.size()>
	//*  41   91:iconst_2        
	//*  42   92:icmplt          131
		{
			aobj[0] = arraylist.get(arraylist.size() - 2);
	//   43   95:aload_3         
	//   44   96:iconst_0        
	//   45   97:aload_2         
	//   46   98:aload_2         
	//   47   99:invokevirtual   #396 <Method int ArrayList.size()>
	//   48  102:iconst_2        
	//   49  103:isub            
	//   50  104:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//   51  107:aastore         
			aobj[1] = ((Object) (new Float((String)arraylist.get(arraylist.size() - 1))));
	//   52  108:aload_3         
	//   53  109:iconst_1        
	//   54  110:new             #402 <Class Float>
	//   55  113:dup             
	//   56  114:aload_2         
	//   57  115:aload_2         
	//   58  116:invokevirtual   #396 <Method int ArrayList.size()>
	//   59  119:iconst_1        
	//   60  120:isub            
	//   61  121:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//   62  124:checkcast       #87  <Class String>
	//   63  127:invokespecial   #405 <Method void Float(String)>
	//   64  130:aastore         
		}
_L5:
		arraylist.clear();
	//   65  131:aload_2         
	//   66  132:invokevirtual   #408 <Method void ArrayList.clear()>
		  goto _L3
	//*  67  135:goto            43
	//*  68  138:astore_0        
	//*  69  139:new             #238 <Class ExceptionConverter>
	//*  70  142:dup             
	//*  71  143:aload_0         
	//*  72  144:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//*  73  147:athrow          
_L2:
		if(!s1.equals("g"))
			break MISSING_BLOCK_LABEL_211;
	//   74  148:aload           4
	//   75  150:ldc2            #410 <String "g">
	//   76  153:invokevirtual   #395 <Method boolean String.equals(Object)>
	//   77  156:ifeq            211
		if(arraylist.size() < 1) goto _L5; else goto _L4
	//   78  159:aload_2         
	//   79  160:invokevirtual   #396 <Method int ArrayList.size()>
	//   80  163:iconst_1        
	//   81  164:icmplt          131
_L4:
		float f = (new Float((String)arraylist.get(arraylist.size() - 1))).floatValue();
	//   82  167:new             #402 <Class Float>
	//   83  170:dup             
	//   84  171:aload_2         
	//   85  172:aload_2         
	//   86  173:invokevirtual   #396 <Method int ArrayList.size()>
	//   87  176:iconst_1        
	//   88  177:isub            
	//   89  178:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//   90  181:checkcast       #87  <Class String>
	//   91  184:invokespecial   #405 <Method void Float(String)>
	//   92  187:invokevirtual   #414 <Method float Float.floatValue()>
	//   93  190:fstore_1        
		if(f != 0.0F)
	//*  94  191:fload_1         
	//*  95  192:fconst_0        
	//*  96  193:fcmpl           
	//*  97  194:ifeq            131
			try
			{
				aobj[2] = ((Object) (new GrayColor(f)));
	//   98  197:aload_3         
	//   99  198:iconst_2        
	//  100  199:new             #416 <Class GrayColor>
	//  101  202:dup             
	//  102  203:fload_1         
	//  103  204:invokespecial   #419 <Method void GrayColor(float)>
	//  104  207:aastore         
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new ExceptionConverter(((Exception) (s)));
			}
		  goto _L5
	//* 105  208:goto            131
		if(!s1.equals("rg")) goto _L7; else goto _L6
	//  106  211:aload           4
	//  107  213:ldc2            #421 <String "rg">
	//  108  216:invokevirtual   #395 <Method boolean String.equals(Object)>
	//  109  219:ifeq            312
_L6:
		if(arraylist.size() >= 3)
	//* 110  222:aload_2         
	//* 111  223:invokevirtual   #396 <Method int ArrayList.size()>
	//* 112  226:iconst_3        
	//* 113  227:icmplt          131
			aobj[2] = ((Object) (new BaseColor((new Float((String)arraylist.get(arraylist.size() - 3))).floatValue(), (new Float((String)arraylist.get(arraylist.size() - 2))).floatValue(), (new Float((String)arraylist.get(arraylist.size() - 1))).floatValue())));
	//  114  230:aload_3         
	//  115  231:iconst_2        
	//  116  232:new             #423 <Class BaseColor>
	//  117  235:dup             
	//  118  236:new             #402 <Class Float>
	//  119  239:dup             
	//  120  240:aload_2         
	//  121  241:aload_2         
	//  122  242:invokevirtual   #396 <Method int ArrayList.size()>
	//  123  245:iconst_3        
	//  124  246:isub            
	//  125  247:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//  126  250:checkcast       #87  <Class String>
	//  127  253:invokespecial   #405 <Method void Float(String)>
	//  128  256:invokevirtual   #414 <Method float Float.floatValue()>
	//  129  259:new             #402 <Class Float>
	//  130  262:dup             
	//  131  263:aload_2         
	//  132  264:aload_2         
	//  133  265:invokevirtual   #396 <Method int ArrayList.size()>
	//  134  268:iconst_2        
	//  135  269:isub            
	//  136  270:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//  137  273:checkcast       #87  <Class String>
	//  138  276:invokespecial   #405 <Method void Float(String)>
	//  139  279:invokevirtual   #414 <Method float Float.floatValue()>
	//  140  282:new             #402 <Class Float>
	//  141  285:dup             
	//  142  286:aload_2         
	//  143  287:aload_2         
	//  144  288:invokevirtual   #396 <Method int ArrayList.size()>
	//  145  291:iconst_1        
	//  146  292:isub            
	//  147  293:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//  148  296:checkcast       #87  <Class String>
	//  149  299:invokespecial   #405 <Method void Float(String)>
	//  150  302:invokevirtual   #414 <Method float Float.floatValue()>
	//  151  305:invokespecial   #426 <Method void BaseColor(float, float, float)>
	//  152  308:aastore         
		  goto _L5
	//* 153  309:goto            131
_L7:
		if(!s1.equals("k") || arraylist.size() < 4) goto _L5; else goto _L8
	//  154  312:aload           4
	//  155  314:ldc2            #428 <String "k">
	//  156  317:invokevirtual   #395 <Method boolean String.equals(Object)>
	//  157  320:ifeq            131
	//  158  323:aload_2         
	//  159  324:invokevirtual   #396 <Method int ArrayList.size()>
	//  160  327:iconst_4        
	//  161  328:icmplt          131
_L8:
		aobj[2] = ((Object) (new CMYKColor((new Float((String)arraylist.get(arraylist.size() - 4))).floatValue(), (new Float((String)arraylist.get(arraylist.size() - 3))).floatValue(), (new Float((String)arraylist.get(arraylist.size() - 2))).floatValue(), (new Float((String)arraylist.get(arraylist.size() - 1))).floatValue())));
	//  162  331:aload_3         
	//  163  332:iconst_2        
	//  164  333:new             #430 <Class CMYKColor>
	//  165  336:dup             
	//  166  337:new             #402 <Class Float>
	//  167  340:dup             
	//  168  341:aload_2         
	//  169  342:aload_2         
	//  170  343:invokevirtual   #396 <Method int ArrayList.size()>
	//  171  346:iconst_4        
	//  172  347:isub            
	//  173  348:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//  174  351:checkcast       #87  <Class String>
	//  175  354:invokespecial   #405 <Method void Float(String)>
	//  176  357:invokevirtual   #414 <Method float Float.floatValue()>
	//  177  360:new             #402 <Class Float>
	//  178  363:dup             
	//  179  364:aload_2         
	//  180  365:aload_2         
	//  181  366:invokevirtual   #396 <Method int ArrayList.size()>
	//  182  369:iconst_3        
	//  183  370:isub            
	//  184  371:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//  185  374:checkcast       #87  <Class String>
	//  186  377:invokespecial   #405 <Method void Float(String)>
	//  187  380:invokevirtual   #414 <Method float Float.floatValue()>
	//  188  383:new             #402 <Class Float>
	//  189  386:dup             
	//  190  387:aload_2         
	//  191  388:aload_2         
	//  192  389:invokevirtual   #396 <Method int ArrayList.size()>
	//  193  392:iconst_2        
	//  194  393:isub            
	//  195  394:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//  196  397:checkcast       #87  <Class String>
	//  197  400:invokespecial   #405 <Method void Float(String)>
	//  198  403:invokevirtual   #414 <Method float Float.floatValue()>
	//  199  406:new             #402 <Class Float>
	//  200  409:dup             
	//  201  410:aload_2         
	//  202  411:aload_2         
	//  203  412:invokevirtual   #396 <Method int ArrayList.size()>
	//  204  415:iconst_1        
	//  205  416:isub            
	//  206  417:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//  207  420:checkcast       #87  <Class String>
	//  208  423:invokespecial   #405 <Method void Float(String)>
	//  209  426:invokevirtual   #414 <Method float Float.floatValue()>
	//  210  429:invokespecial   #433 <Method void CMYKColor(float, float, float, float)>
	//  211  432:aastore         
		  goto _L5
	//* 212  433:goto            131
		arraylist.add(((Object) (((PRTokeniser) (s)).getStringValue())));
	//  213  436:aload_2         
	//  214  437:aload_0         
	//  215  438:invokevirtual   #389 <Method String PRTokeniser.getStringValue()>
	//  216  441:invokevirtual   #436 <Method boolean ArrayList.add(Object)>
	//  217  444:pop             
		  goto _L3
	//* 218  445:goto            43
		return aobj;
	//  219  448:aload_3         
	//  220  449:areturn         
	}

	private void updateByteRange(PdfPKCS7 pdfpkcs7, PdfDictionary pdfdictionary)
	{
		Object obj;
		Object obj1;
		RandomAccessFileOrArray randomaccessfileorarray;
		obj = ((Object) (pdfdictionary.getAsArray(PdfName.BYTERANGE)));
	//    0    0:aload_2         
	//    1    1:getstatic       #441 <Field PdfName PdfName.BYTERANGE>
	//    2    4:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//    3    7:astore          4
		randomaccessfileorarray = reader.getSafeFile();
	//    4    9:aload_0         
	//    5   10:getfield        #216 <Field PdfReader reader>
	//    6   13:invokevirtual   #447 <Method RandomAccessFileOrArray PdfReader.getSafeFile()>
	//    7   16:astore          6
		pdfdictionary = null;
	//    8   18:aconst_null     
	//    9   19:astore_2        
		obj1 = null;
	//   10   20:aconst_null     
	//   11   21:astore          5
		obj = ((Object) (new RASInputStream((new RandomAccessSourceFactory()).createRanged(randomaccessfileorarray.createSourceView(), ((PdfArray) (obj)).asLongArray()))));
	//   12   23:new             #449 <Class RASInputStream>
	//   13   26:dup             
	//   14   27:new             #350 <Class RandomAccessSourceFactory>
	//   15   30:dup             
	//   16   31:invokespecial   #351 <Method void RandomAccessSourceFactory()>
	//   17   34:aload           6
	//   18   36:invokevirtual   #453 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessFileOrArray.createSourceView()>
	//   19   39:aload           4
	//   20   41:invokevirtual   #457 <Method long[] PdfArray.asLongArray()>
	//   21   44:invokevirtual   #461 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessSourceFactory.createRanged(com.itextpdf.text.io.RandomAccessSource, long[])>
	//   22   47:invokespecial   #462 <Method void RASInputStream(com.itextpdf.text.io.RandomAccessSource)>
	//   23   50:astore          4
		pdfdictionary = ((PdfDictionary) (new byte[8192]));
	//   24   52:sipush          8192
	//   25   55:newarray        byte[]
	//   26   57:astore_2        
_L3:
		int i = ((InputStream) (obj)).read(((byte []) (pdfdictionary)), 0, pdfdictionary.length);
	//   27   58:aload           4
	//   28   60:aload_2         
	//   29   61:iconst_0        
	//   30   62:aload_2         
	//   31   63:arraylength     
	//   32   64:invokevirtual   #468 <Method int InputStream.read(byte[], int, int)>
	//   33   67:istore_3        
		if(i <= 0) goto _L2; else goto _L1
	//   34   68:iload_3         
	//   35   69:ifle            106
_L1:
		pdfpkcs7.update(((byte []) (pdfdictionary)), 0, i);
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:iconst_0        
	//   39   75:iload_3         
	//   40   76:invokevirtual   #474 <Method void PdfPKCS7.update(byte[], int, int)>
		  goto _L3
	//*  41   79:goto            58
		pdfpkcs7;
	//   42   82:astore_1        
		pdfdictionary = ((PdfDictionary) (obj));
	//   43   83:aload           4
	//   44   85:astore_2        
_L7:
		throw new ExceptionConverter(((Exception) (pdfpkcs7)));
	//   45   86:new             #238 <Class ExceptionConverter>
	//   46   89:dup             
	//   47   90:aload_1         
	//   48   91:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//   49   94:athrow          
		pdfpkcs7;
	//   50   95:astore_1        
_L5:
		if(pdfdictionary != null)
	//*  51   96:aload_2         
	//*  52   97:ifnull          104
			try
			{
				((InputStream) (pdfdictionary)).close();
	//   53  100:aload_2         
	//   54  101:invokevirtual   #477 <Method void InputStream.close()>
			}
	//*  55  104:aload_1         
	//*  56  105:athrow          
	//*  57  106:aload           4
	//*  58  108:ifnull          116
	//*  59  111:aload           4
	//*  60  113:invokevirtual   #477 <Method void InputStream.close()>
	//*  61  116:return          
	//*  62  117:astore_1        
	//*  63  118:new             #238 <Class ExceptionConverter>
	//*  64  121:dup             
	//*  65  122:aload_1         
	//*  66  123:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//*  67  126:athrow          
			// Misplaced declaration of an exception variable
			catch(PdfPKCS7 pdfpkcs7)
	//*  68  127:astore_1        
			{
				throw new ExceptionConverter(((Exception) (pdfpkcs7)));
	//   69  128:new             #238 <Class ExceptionConverter>
	//   70  131:dup             
	//   71  132:aload_1         
	//   72  133:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//   73  136:athrow          
			}
		throw pdfpkcs7;
_L2:
		if(obj == null)
			break MISSING_BLOCK_LABEL_116;
		((InputStream) (obj)).close();
		return;
		pdfpkcs7;
		throw new ExceptionConverter(((Exception) (pdfpkcs7)));
		pdfpkcs7;
	//   74  137:astore_1        
		pdfdictionary = ((PdfDictionary) (obj));
	//   75  138:aload           4
	//   76  140:astore_2        
		if(true) goto _L5; else goto _L4
	//   77  141:goto            96
_L4:
		pdfpkcs7;
	//   78  144:astore_1        
		pdfdictionary = ((PdfDictionary) (obj1));
	//   79  145:aload           5
	//   80  147:astore_2        
		if(true) goto _L7; else goto _L6
	//   81  148:goto            86
_L6:
	}

	public void addSubstitutionFont(BaseFont basefont)
	{
		if(substitutionFonts == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #481 <Field ArrayList substitutionFonts>
	//*   2    4:ifnonnull       18
			substitutionFonts = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #369 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #370 <Method void ArrayList()>
	//    7   15:putfield        #481 <Field ArrayList substitutionFonts>
		substitutionFonts.add(((Object) (basefont)));
	//    8   18:aload_0         
	//    9   19:getfield        #481 <Field ArrayList substitutionFonts>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #436 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public boolean clearSignatureField(String s)
	{
		sigNames = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #485 <Field HashMap sigNames>
		getSignatureNames();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #489 <Method ArrayList getSignatureNames()>
	//    5    9:pop             
		if(!sigNames.containsKey(((Object) (s))))
	//*   6   10:aload_0         
	//*   7   11:getfield        #485 <Field HashMap sigNames>
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #492 <Method boolean HashMap.containsKey(Object)>
	//*  10   18:ifne            23
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		s = ((String) ((Item)fields.get(((Object) (s)))));
	//   13   23:aload_0         
	//   14   24:getfield        #494 <Field Map fields>
	//   15   27:aload_1         
	//   16   28:invokeinterface #499 <Method Object Map.get(Object)>
	//   17   33:checkcast       #14  <Class AcroFields$Item>
	//   18   36:astore_1        
		((Item) (s)).markUsed(this, 6);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:bipush          6
	//   22   41:invokevirtual   #502 <Method void AcroFields$Item.markUsed(AcroFields, int)>
		int j = ((Item) (s)).size();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//   25   48:istore_3        
		for(int i = 0; i < j; i++)
	//*  26   49:iconst_0        
	//*  27   50:istore_2        
	//*  28   51:iload_2         
	//*  29   52:iload_3         
	//*  30   53:icmpge          87
		{
			clearSigDic(((Item) (s)).getMerged(i));
	//   31   56:aload_1         
	//   32   57:iload_2         
	//   33   58:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   34   61:invokestatic    #505 <Method void clearSigDic(PdfDictionary)>
			clearSigDic(((Item) (s)).getWidget(i));
	//   35   64:aload_1         
	//   36   65:iload_2         
	//   37   66:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//   38   69:invokestatic    #505 <Method void clearSigDic(PdfDictionary)>
			clearSigDic(((Item) (s)).getValue(i));
	//   39   72:aload_1         
	//   40   73:iload_2         
	//   41   74:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//   42   77:invokestatic    #505 <Method void clearSigDic(PdfDictionary)>
		}

	//   43   80:iload_2         
	//   44   81:iconst_1        
	//   45   82:iadd            
	//   46   83:istore_2        
	//*  47   84:goto            51
		return true;
	//   48   87:iconst_1        
	//   49   88:ireturn         
	}

	public void decodeGenericDictionary(PdfDictionary pdfdictionary, BaseField basefield)
		throws IOException, DocumentException
	{
		Object obj = ((Object) (pdfdictionary.getAsString(PdfName.DA)));
	//    0    0:aload_1         
	//    1    1:getstatic       #518 <Field PdfName PdfName.DA>
	//    2    4:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//    3    7:astore          5
		if(obj == null) goto _L2; else goto _L1
	//    4    9:aload           5
	//    5   11:ifnull          406
_L1:
		int i;
		boolean flag;
		Object aobj[];
		flag = false;
	//    6   14:iconst_0        
	//    7   15:istore          4
		aobj = splitDAelements(((PdfString) (obj)).toUnicodeString());
	//    8   17:aload           5
	//    9   19:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//   10   22:invokestatic    #524 <Method Object[] splitDAelements(String)>
	//   11   25:astore          8
		if(aobj[1] != null)
	//*  12   27:aload           8
	//*  13   29:iconst_1        
	//*  14   30:aaload          
	//*  15   31:ifnull          48
			basefield.setFontSize(((Float)aobj[1]).floatValue());
	//   16   34:aload_2         
	//   17   35:aload           8
	//   18   37:iconst_1        
	//   19   38:aaload          
	//   20   39:checkcast       #402 <Class Float>
	//   21   42:invokevirtual   #414 <Method float Float.floatValue()>
	//   22   45:invokevirtual   #529 <Method void BaseField.setFontSize(float)>
		if(aobj[2] != null)
	//*  23   48:aload           8
	//*  24   50:iconst_2        
	//*  25   51:aaload          
	//*  26   52:ifnull          66
			basefield.setTextColor((BaseColor)aobj[2]);
	//   27   55:aload_2         
	//   28   56:aload           8
	//   29   58:iconst_2        
	//   30   59:aaload          
	//   31   60:checkcast       #423 <Class BaseColor>
	//   32   63:invokevirtual   #533 <Method void BaseField.setTextColor(BaseColor)>
		i = ((int) (flag));
	//   33   66:iload           4
	//   34   68:istore_3        
		if(aobj[0] == null) goto _L4; else goto _L3
	//   35   69:aload           8
	//   36   71:iconst_0        
	//   37   72:aaload          
	//   38   73:ifnull          329
_L3:
		obj = ((Object) (pdfdictionary.getAsDict(PdfName.DR)));
	//   39   76:aload_1         
	//   40   77:getstatic       #536 <Field PdfName PdfName.DR>
	//   41   80:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   42   83:astore          5
		if(obj == null) goto _L6; else goto _L5
	//   43   85:aload           5
	//   44   87:ifnull          734
_L5:
		Object obj1 = ((Object) (((PdfDictionary) (obj)).getAsDict(PdfName.FONT)));
	//   45   90:aload           5
	//   46   92:getstatic       #543 <Field PdfName PdfName.FONT>
	//   47   95:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   48   98:astore          6
		if(obj1 == null) goto _L8; else goto _L7
	//   49  100:aload           6
	//   50  102:ifnull          729
_L7:
		PdfObject pdfobject = ((PdfDictionary) (obj1)).get(new PdfName((String)aobj[0]));
	//   51  105:aload           6
	//   52  107:new             #183 <Class PdfName>
	//   53  110:dup             
	//   54  111:aload           8
	//   55  113:iconst_0        
	//   56  114:aaload          
	//   57  115:checkcast       #87  <Class String>
	//   58  118:invokespecial   #544 <Method void PdfName(String)>
	//   59  121:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//   60  124:astore          7
		if(pdfobject == null || pdfobject.type() != 10) goto _L10; else goto _L9
	//   61  126:aload           7
	//   62  128:ifnull          724
	//   63  131:aload           7
	//   64  133:invokevirtual   #550 <Method int PdfObject.type()>
	//   65  136:bipush          10
	//   66  138:icmpne          724
_L9:
		Integer integer;
		obj1 = ((Object) ((PRIndirectReference)pdfobject));
	//   67  141:aload           7
	//   68  143:checkcast       #552 <Class PRIndirectReference>
	//   69  146:astore          6
		basefield.setFont(((BaseFont) (new DocumentFont((PRIndirectReference)pdfobject, ((PdfDictionary) (obj)).getAsDict(PdfName.ENCODING)))));
	//   70  148:aload_2         
	//   71  149:new             #554 <Class DocumentFont>
	//   72  152:dup             
	//   73  153:aload           7
	//   74  155:checkcast       #552 <Class PRIndirectReference>
	//   75  158:aload           5
	//   76  160:getstatic       #557 <Field PdfName PdfName.ENCODING>
	//   77  163:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   78  166:invokespecial   #560 <Method void DocumentFont(PRIndirectReference, PdfDictionary)>
	//   79  169:invokevirtual   #563 <Method void BaseField.setFont(BaseFont)>
		integer = Integer.valueOf(((PRIndirectReference) (obj1)).getNumber());
	//   80  172:aload           6
	//   81  174:invokevirtual   #564 <Method int PRIndirectReference.getNumber()>
	//   82  177:invokestatic    #570 <Method Integer Integer.valueOf(int)>
	//   83  180:astore          9
		obj = ((Object) ((BaseFont)extensionFonts.get(((Object) (integer)))));
	//   84  182:aload_0         
	//   85  183:getfield        #210 <Field HashMap extensionFonts>
	//   86  186:aload           9
	//   87  188:invokevirtual   #571 <Method Object HashMap.get(Object)>
	//   88  191:checkcast       #573 <Class BaseFont>
	//   89  194:astore          5
		obj1 = obj;
	//   90  196:aload           5
	//   91  198:astore          6
		if(obj != null) goto _L12; else goto _L11
	//   92  200:aload           5
	//   93  202:ifnonnull       307
_L11:
		obj1 = obj;
	//   94  205:aload           5
	//   95  207:astore          6
		if(extensionFonts.containsKey(((Object) (integer)))) goto _L12; else goto _L13
	//   96  209:aload_0         
	//   97  210:getfield        #210 <Field HashMap extensionFonts>
	//   98  213:aload           9
	//   99  215:invokevirtual   #492 <Method boolean HashMap.containsKey(Object)>
	//  100  218:ifne            307
_L13:
		PdfDictionary pdfdictionary1;
		pdfdictionary1 = ((PdfDictionary)PdfReader.getPdfObject(pdfobject)).getAsDict(PdfName.FONTDESCRIPTOR);
	//  101  221:aload           7
	//  102  223:invokestatic    #576 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//  103  226:checkcast       #254 <Class PdfDictionary>
	//  104  229:getstatic       #579 <Field PdfName PdfName.FONTDESCRIPTOR>
	//  105  232:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  106  235:astore          10
		obj1 = obj;
	//  107  237:aload           5
	//  108  239:astore          6
		if(pdfdictionary1 == null) goto _L12; else goto _L14
	//  109  241:aload           10
	//  110  243:ifnull          307
_L14:
		PRStream prstream = (PRStream)PdfReader.getPdfObject(pdfdictionary1.get(PdfName.FONTFILE2));
	//  111  246:aload           10
	//  112  248:getstatic       #582 <Field PdfName PdfName.FONTFILE2>
	//  113  251:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//  114  254:invokestatic    #576 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//  115  257:checkcast       #584 <Class PRStream>
	//  116  260:astore          7
		obj1 = ((Object) (prstream));
	//  117  262:aload           7
	//  118  264:astore          6
		if(prstream == null)
	//* 119  266:aload           7
	//* 120  268:ifnonnull       287
			obj1 = ((Object) ((PRStream)PdfReader.getPdfObject(pdfdictionary1.get(PdfName.FONTFILE3))));
	//  121  271:aload           10
	//  122  273:getstatic       #587 <Field PdfName PdfName.FONTFILE3>
	//  123  276:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//  124  279:invokestatic    #576 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//  125  282:checkcast       #584 <Class PRStream>
	//  126  285:astore          6
		if(obj1 != null) goto _L16; else goto _L15
	//  127  287:aload           6
	//  128  289:ifnonnull       682
_L15:
		extensionFonts.put(((Object) (integer)), ((Object) (null)));
	//  129  292:aload_0         
	//  130  293:getfield        #210 <Field HashMap extensionFonts>
	//  131  296:aload           9
	//  132  298:aconst_null     
	//  133  299:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  134  302:pop             
		obj1 = obj;
	//  135  303:aload           5
	//  136  305:astore          6
_L12:
		i = ((int) (flag));
	//  137  307:iload           4
	//  138  309:istore_3        
		if(basefield instanceof TextField)
	//* 139  310:aload_2         
	//* 140  311:instanceof      #589 <Class TextField>
	//* 141  314:ifeq            329
		{
			((TextField)basefield).setExtensionFont(((BaseFont) (obj1)));
	//  142  317:aload_2         
	//  143  318:checkcast       #589 <Class TextField>
	//  144  321:aload           6
	//  145  323:invokevirtual   #592 <Method void TextField.setExtensionFont(BaseFont)>
			i = ((int) (flag));
	//  146  326:iload           4
	//  147  328:istore_3        
		}
_L4:
		if(i == 0) goto _L2; else goto _L17
	//  148  329:iload_3         
	//  149  330:ifeq            406
_L17:
		obj = ((Object) ((BaseFont)localFonts.get(aobj[0])));
	//  150  333:aload_0         
	//  151  334:getfield        #214 <Field HashMap localFonts>
	//  152  337:aload           8
	//  153  339:iconst_0        
	//  154  340:aaload          
	//  155  341:invokevirtual   #571 <Method Object HashMap.get(Object)>
	//  156  344:checkcast       #573 <Class BaseFont>
	//  157  347:astore          5
		if(obj != null) goto _L19; else goto _L18
	//  158  349:aload           5
	//  159  351:ifnonnull       739
_L18:
		obj1 = ((Object) ((String[])stdFieldFontNames.get(aobj[0])));
	//  160  354:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  161  357:aload           8
	//  162  359:iconst_0        
	//  163  360:aaload          
	//  164  361:invokevirtual   #571 <Method Object HashMap.get(Object)>
	//  165  364:checkcast       #594 <Class String[]>
	//  166  367:astore          6
		if(obj1 == null) goto _L2; else goto _L20
	//  167  369:aload           6
	//  168  371:ifnull          406
_L20:
		obj = "winansi";
	//  169  374:ldc2            #596 <String "winansi">
	//  170  377:astore          5
		if(obj1.length > 1)
	//* 171  379:aload           6
	//* 172  381:arraylength     
	//* 173  382:iconst_1        
	//* 174  383:icmple          392
			obj = ((Object) (obj1[1]));
	//  175  386:aload           6
	//  176  388:iconst_1        
	//  177  389:aaload          
	//  178  390:astore          5
		try
		{
			basefield.setFont(BaseFont.createFont(((String) (obj1[0])), ((String) (obj)), false));
	//  179  392:aload_2         
	//  180  393:aload           6
	//  181  395:iconst_0        
	//  182  396:aaload          
	//  183  397:aload           5
	//  184  399:iconst_0        
	//  185  400:invokestatic    #600 <Method BaseFont BaseFont.createFont(String, String, boolean)>
	//  186  403:invokevirtual   #563 <Method void BaseField.setFont(BaseFont)>
		}
	//* 187  406:aload_1         
	//* 188  407:getstatic       #187 <Field PdfName PdfName.MK>
	//* 189  410:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 190  413:astore          5
	//* 191  415:aload           5
	//* 192  417:ifnull          490
	//* 193  420:aload_0         
	//* 194  421:aload           5
	//* 195  423:getstatic       #603 <Field PdfName PdfName.BC>
	//* 196  426:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 197  429:invokevirtual   #607 <Method BaseColor getMKColor(PdfArray)>
	//* 198  432:astore          6
	//* 199  434:aload_2         
	//* 200  435:aload           6
	//* 201  437:invokevirtual   #610 <Method void BaseField.setBorderColor(BaseColor)>
	//* 202  440:aload           6
	//* 203  442:ifnull          450
	//* 204  445:aload_2         
	//* 205  446:fconst_1        
	//* 206  447:invokevirtual   #613 <Method void BaseField.setBorderWidth(float)>
	//* 207  450:aload_2         
	//* 208  451:aload_0         
	//* 209  452:aload           5
	//* 210  454:getstatic       #616 <Field PdfName PdfName.BG>
	//* 211  457:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 212  460:invokevirtual   #607 <Method BaseColor getMKColor(PdfArray)>
	//* 213  463:invokevirtual   #619 <Method void BaseField.setBackgroundColor(BaseColor)>
	//* 214  466:aload           5
	//* 215  468:getstatic       #622 <Field PdfName PdfName.R>
	//* 216  471:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//* 217  474:astore          5
	//* 218  476:aload           5
	//* 219  478:ifnull          490
	//* 220  481:aload_2         
	//* 221  482:aload           5
	//* 222  484:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//* 223  487:invokevirtual   #632 <Method void BaseField.setRotation(int)>
	//* 224  490:aload_1         
	//* 225  491:getstatic       #189 <Field PdfName PdfName.F>
	//* 226  494:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//* 227  497:astore          5
	//* 228  499:aload_2         
	//* 229  500:iconst_2        
	//* 230  501:invokevirtual   #635 <Method void BaseField.setVisibility(int)>
	//* 231  504:aload           5
	//* 232  506:ifnull          532
	//* 233  509:aload           5
	//* 234  511:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//* 235  514:istore_3        
	//* 236  515:iload_3         
	//* 237  516:iconst_4        
	//* 238  517:iand            
	//* 239  518:ifeq            748
	//* 240  521:iload_3         
	//* 241  522:iconst_2        
	//* 242  523:iand            
	//* 243  524:ifeq            748
	//* 244  527:aload_2         
	//* 245  528:iconst_1        
	//* 246  529:invokevirtual   #635 <Method void BaseField.setVisibility(int)>
	//* 247  532:aload_1         
	//* 248  533:getstatic       #192 <Field PdfName PdfName.FF>
	//* 249  536:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//* 250  539:astore          5
	//* 251  541:iconst_0        
	//* 252  542:istore_3        
	//* 253  543:aload           5
	//* 254  545:ifnull          554
	//* 255  548:aload           5
	//* 256  550:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//* 257  553:istore_3        
	//* 258  554:aload_2         
	//* 259  555:iload_3         
	//* 260  556:invokevirtual   #638 <Method void BaseField.setOptions(int)>
	//* 261  559:ldc2            #639 <Int 0x1000000>
	//* 262  562:iload_3         
	//* 263  563:iand            
	//* 264  564:ifeq            594
	//* 265  567:aload_1         
	//* 266  568:getstatic       #642 <Field PdfName PdfName.MAXLEN>
	//* 267  571:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//* 268  574:astore          5
	//* 269  576:iconst_0        
	//* 270  577:istore_3        
	//* 271  578:aload           5
	//* 272  580:ifnull          589
	//* 273  583:aload           5
	//* 274  585:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//* 275  588:istore_3        
	//* 276  589:aload_2         
	//* 277  590:iload_3         
	//* 278  591:invokevirtual   #645 <Method void BaseField.setMaxCharacterLength(int)>
	//* 279  594:aload_1         
	//* 280  595:getstatic       #195 <Field PdfName PdfName.Q>
	//* 281  598:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//* 282  601:astore          5
	//* 283  603:aload           5
	//* 284  605:ifnull          622
	//* 285  608:aload           5
	//* 286  610:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//* 287  613:iconst_1        
	//* 288  614:icmpne          783
	//* 289  617:aload_2         
	//* 290  618:iconst_1        
	//* 291  619:invokevirtual   #648 <Method void BaseField.setAlignment(int)>
	//* 292  622:aload_1         
	//* 293  623:getstatic       #198 <Field PdfName PdfName.BS>
	//* 294  626:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 295  629:astore          5
	//* 296  631:aload           5
	//* 297  633:ifnull          848
	//* 298  636:aload           5
	//* 299  638:getstatic       #651 <Field PdfName PdfName.W>
	//* 300  641:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//* 301  644:astore_1        
	//* 302  645:aload_1         
	//* 303  646:ifnull          657
	//* 304  649:aload_2         
	//* 305  650:aload_1         
	//* 306  651:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//* 307  654:invokevirtual   #613 <Method void BaseField.setBorderWidth(float)>
	//* 308  657:aload           5
	//* 309  659:getstatic       #655 <Field PdfName PdfName.S>
	//* 310  662:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//* 311  665:astore_1        
	//* 312  666:getstatic       #662 <Field PdfName PdfName.D>
	//* 313  669:aload_1         
	//* 314  670:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 315  673:ifeq            800
	//* 316  676:aload_2         
	//* 317  677:iconst_1        
	//* 318  678:invokevirtual   #666 <Method void BaseField.setBorderStyle(int)>
	//* 319  681:return          
	//* 320  682:ldc2            #668 <String "font.ttf">
	//* 321  685:ldc2            #670 <String "Identity-H">
	//* 322  688:iconst_1        
	//* 323  689:iconst_0        
	//* 324  690:aload           6
	//* 325  692:invokestatic    #674 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//* 326  695:aconst_null     
	//* 327  696:invokestatic    #677 <Method BaseFont BaseFont.createFont(String, String, boolean, boolean, byte[], byte[])>
	//* 328  699:astore          6
	//* 329  701:aload           6
	//* 330  703:astore          5
	//* 331  705:aload_0         
	//* 332  706:getfield        #210 <Field HashMap extensionFonts>
	//* 333  709:aload           9
	//* 334  711:aload           5
	//* 335  713:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//* 336  716:pop             
	//* 337  717:aload           5
	//* 338  719:astore          6
	//* 339  721:goto            307
	//* 340  724:iconst_1        
	//* 341  725:istore_3        
	//* 342  726:goto            329
	//* 343  729:iconst_1        
	//* 344  730:istore_3        
	//* 345  731:goto            329
	//* 346  734:iconst_1        
	//* 347  735:istore_3        
	//* 348  736:goto            329
	//* 349  739:aload_2         
	//* 350  740:aload           5
	//* 351  742:invokevirtual   #563 <Method void BaseField.setFont(BaseFont)>
	//* 352  745:goto            406
	//* 353  748:iload_3         
	//* 354  749:iconst_4        
	//* 355  750:iand            
	//* 356  751:ifeq            769
	//* 357  754:iload_3         
	//* 358  755:bipush          32
	//* 359  757:iand            
	//* 360  758:ifeq            769
	//* 361  761:aload_2         
	//* 362  762:iconst_3        
	//* 363  763:invokevirtual   #635 <Method void BaseField.setVisibility(int)>
	//* 364  766:goto            532
	//* 365  769:iload_3         
	//* 366  770:iconst_4        
	//* 367  771:iand            
	//* 368  772:ifeq            532
	//* 369  775:aload_2         
	//* 370  776:iconst_0        
	//* 371  777:invokevirtual   #635 <Method void BaseField.setVisibility(int)>
	//* 372  780:goto            532
	//* 373  783:aload           5
	//* 374  785:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//* 375  788:iconst_2        
	//* 376  789:icmpne          622
	//* 377  792:aload_2         
	//* 378  793:iconst_2        
	//* 379  794:invokevirtual   #648 <Method void BaseField.setAlignment(int)>
	//* 380  797:goto            622
	//* 381  800:getstatic       #680 <Field PdfName PdfName.B>
	//* 382  803:aload_1         
	//* 383  804:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 384  807:ifeq            816
	//* 385  810:aload_2         
	//* 386  811:iconst_2        
	//* 387  812:invokevirtual   #666 <Method void BaseField.setBorderStyle(int)>
	//* 388  815:return          
	//* 389  816:getstatic       #682 <Field PdfName PdfName.I>
	//* 390  819:aload_1         
	//* 391  820:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 392  823:ifeq            832
	//* 393  826:aload_2         
	//* 394  827:iconst_3        
	//* 395  828:invokevirtual   #666 <Method void BaseField.setBorderStyle(int)>
	//* 396  831:return          
	//* 397  832:getstatic       #685 <Field PdfName PdfName.U>
	//* 398  835:aload_1         
	//* 399  836:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 400  839:ifeq            681
	//* 401  842:aload_2         
	//* 402  843:iconst_4        
	//* 403  844:invokevirtual   #666 <Method void BaseField.setBorderStyle(int)>
	//* 404  847:return          
	//* 405  848:aload_1         
	//* 406  849:getstatic       #201 <Field PdfName PdfName.BORDER>
	//* 407  852:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 408  855:astore_1        
	//* 409  856:aload_1         
	//* 410  857:ifnull          681
	//* 411  860:aload_1         
	//* 412  861:invokevirtual   #301 <Method int PdfArray.size()>
	//* 413  864:iconst_3        
	//* 414  865:icmplt          880
	//* 415  868:aload_2         
	//* 416  869:aload_1         
	//* 417  870:iconst_2        
	//* 418  871:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 419  874:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//* 420  877:invokevirtual   #613 <Method void BaseField.setBorderWidth(float)>
	//* 421  880:aload_1         
	//* 422  881:invokevirtual   #301 <Method int PdfArray.size()>
	//* 423  884:iconst_4        
	//* 424  885:icmplt          681
	//* 425  888:aload_2         
	//* 426  889:iconst_1        
	//* 427  890:invokevirtual   #666 <Method void BaseField.setBorderStyle(int)>
	//* 428  893:return          
		catch(Exception exception) { }
	//  429  894:astore          5
_L2:
		obj = ((Object) (pdfdictionary.getAsDict(PdfName.MK)));
		if(obj != null)
		{
			obj1 = ((Object) (getMKColor(((PdfDictionary) (obj)).getAsArray(PdfName.BC))));
			basefield.setBorderColor(((BaseColor) (obj1)));
			if(obj1 != null)
				basefield.setBorderWidth(1.0F);
			basefield.setBackgroundColor(getMKColor(((PdfDictionary) (obj)).getAsArray(PdfName.BG)));
			obj = ((Object) (((PdfDictionary) (obj)).getAsNumber(PdfName.R)));
			if(obj != null)
				basefield.setRotation(((PdfNumber) (obj)).intValue());
		}
		obj = ((Object) (pdfdictionary.getAsNumber(PdfName.F)));
		basefield.setVisibility(2);
		if(obj != null)
		{
			i = ((PdfNumber) (obj)).intValue();
			if((i & 4) != 0 && (i & 2) != 0)
				basefield.setVisibility(1);
			else
			if((i & 4) != 0 && (i & 0x20) != 0)
				basefield.setVisibility(3);
			else
			if((i & 4) != 0)
				basefield.setVisibility(0);
		}
		obj = ((Object) (pdfdictionary.getAsNumber(PdfName.FF)));
		i = 0;
		if(obj != null)
			i = ((PdfNumber) (obj)).intValue();
		basefield.setOptions(i);
		if((0x1000000 & i) != 0)
		{
			obj = ((Object) (pdfdictionary.getAsNumber(PdfName.MAXLEN)));
			i = 0;
			if(obj != null)
				i = ((PdfNumber) (obj)).intValue();
			basefield.setMaxCharacterLength(i);
		}
		obj = ((Object) (pdfdictionary.getAsNumber(PdfName.Q)));
		if(obj != null)
			if(((PdfNumber) (obj)).intValue() == 1)
				basefield.setAlignment(1);
			else
			if(((PdfNumber) (obj)).intValue() == 2)
				basefield.setAlignment(2);
		obj = ((Object) (pdfdictionary.getAsDict(PdfName.BS)));
		if(obj == null) goto _L22; else goto _L21
_L21:
		pdfdictionary = ((PdfDictionary) (((PdfDictionary) (obj)).getAsNumber(PdfName.W)));
		if(pdfdictionary != null)
			basefield.setBorderWidth(((PdfNumber) (pdfdictionary)).floatValue());
		pdfdictionary = ((PdfDictionary) (((PdfDictionary) (obj)).getAsName(PdfName.S)));
		if(!PdfName.D.equals(((Object) (pdfdictionary)))) goto _L24; else goto _L23
_L23:
		basefield.setBorderStyle(1);
_L26:
		return;
_L16:
		obj1 = ((Object) (BaseFont.createFont("font.ttf", "Identity-H", true, false, PdfReader.getStreamBytes(((PRStream) (obj1))), ((byte []) (null)))));
		obj = obj1;
_L27:
		extensionFonts.put(((Object) (integer)), obj);
		obj1 = obj;
		  goto _L12
_L10:
		i = 1;
		  goto _L4
_L8:
		i = 1;
		  goto _L4
_L6:
		i = 1;
		  goto _L4
_L19:
		basefield.setFont(((BaseFont) (obj)));
		  goto _L2
_L24:
		if(PdfName.B.equals(((Object) (pdfdictionary))))
		{
			basefield.setBorderStyle(2);
			return;
		}
		if(PdfName.I.equals(((Object) (pdfdictionary))))
		{
			basefield.setBorderStyle(3);
			return;
		}
		if(!PdfName.U.equals(((Object) (pdfdictionary)))) goto _L26; else goto _L25
_L25:
		basefield.setBorderStyle(4);
		return;
_L22:
		pdfdictionary = ((PdfDictionary) (pdfdictionary.getAsArray(PdfName.BORDER)));
		if(pdfdictionary != null)
		{
			if(((PdfArray) (pdfdictionary)).size() >= 3)
				basefield.setBorderWidth(((PdfArray) (pdfdictionary)).getAsNumber(2).floatValue());
			if(((PdfArray) (pdfdictionary)).size() >= 4)
			{
				basefield.setBorderStyle(1);
				return;
			}
		}
		  goto _L26
	//* 430  896:goto            406
		Exception exception1;
		exception1;
	//  431  899:astore          6
		  goto _L27
	//* 432  901:goto            705
	}

	public boolean doesSignatureFieldExist(String s)
	{
		return getBlankSignatureNames().contains(((Object) (s))) || getSignatureNames().contains(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #693 <Method ArrayList getBlankSignatureNames()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #696 <Method boolean ArrayList.contains(Object)>
	//    4    8:ifne            22
	//    5   11:aload_0         
	//    6   12:invokevirtual   #489 <Method ArrayList getSignatureNames()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #696 <Method boolean ArrayList.contains(Object)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public void exportAsFdf(FdfWriter fdfwriter)
	{
		Iterator iterator = fields.entrySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #494 <Field Map fields>
	//    2    4:invokeinterface #702 <Method Set Map.entrySet()>
	//    3    9:invokeinterface #708 <Method Iterator Set.iterator()>
	//    4   14:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   15:aload_2         
	//    6   16:invokeinterface #713 <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            108
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//    8   24:aload_2         
	//    9   25:invokeinterface #717 <Method Object Iterator.next()>
	//   10   30:checkcast       #719 <Class java.util.Map$Entry>
	//   11   33:astore          4
			Item item = (Item)((java.util.Map.Entry) (obj)).getValue();
	//   12   35:aload           4
	//   13   37:invokeinterface #721 <Method Object java.util.Map$Entry.getValue()>
	//   14   42:checkcast       #14  <Class AcroFields$Item>
	//   15   45:astore_3        
			obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getKey()));
	//   16   46:aload           4
	//   17   48:invokeinterface #724 <Method Object java.util.Map$Entry.getKey()>
	//   18   53:checkcast       #87  <Class String>
	//   19   56:astore          4
			if(item.getMerged(0).get(PdfName.V) != null)
	//*  20   58:aload_3         
	//*  21   59:iconst_0        
	//*  22   60:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//*  23   63:getstatic       #264 <Field PdfName PdfName.V>
	//*  24   66:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  25   69:ifnull          15
			{
				String s = getField(((String) (obj)));
	//   26   72:aload_0         
	//   27   73:aload           4
	//   28   75:invokevirtual   #728 <Method String getField(String)>
	//   29   78:astore_3        
				if(lastWasString)
	//*  30   79:aload_0         
	//*  31   80:getfield        #730 <Field boolean lastWasString>
	//*  32   83:ifeq            97
					fdfwriter.setFieldAsString(((String) (obj)), s);
	//   33   86:aload_1         
	//   34   87:aload           4
	//   35   89:aload_3         
	//   36   90:invokevirtual   #736 <Method boolean FdfWriter.setFieldAsString(String, String)>
	//   37   93:pop             
				else
	//*  38   94:goto            15
					fdfwriter.setFieldAsName(((String) (obj)), s);
	//   39   97:aload_1         
	//   40   98:aload           4
	//   41  100:aload_3         
	//   42  101:invokevirtual   #739 <Method boolean FdfWriter.setFieldAsName(String, String)>
	//   43  104:pop             
			}
		} while(true);
	//   44  105:goto            15
	//   45  108:return          
	}

	public InputStream extractRevision(String s)
		throws IOException
	{
		getSignatureNames();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #489 <Method ArrayList getSignatureNames()>
	//    2    4:pop             
		s = getTranslatedFieldName(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #744 <Method String getTranslatedFieldName(String)>
	//    6   10:astore_1        
		if(!sigNames.containsKey(((Object) (s))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #485 <Field HashMap sigNames>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #492 <Method boolean HashMap.containsKey(Object)>
	//*  11   19:ifne            24
		{
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		} else
		{
			int i = ((int[])sigNames.get(((Object) (s))))[0];
	//   14   24:aload_0         
	//   15   25:getfield        #485 <Field HashMap sigNames>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #571 <Method Object HashMap.get(Object)>
	//   18   32:checkcast       #746 <Class int[]>
	//   19   35:iconst_0        
	//   20   36:iaload          
	//   21   37:istore_2        
			return ((InputStream) (new RASInputStream(((com.itextpdf.text.io.RandomAccessSource) (new WindowRandomAccessSource(reader.getSafeFile().createSourceView(), 0L, i))))));
	//   22   38:new             #449 <Class RASInputStream>
	//   23   41:dup             
	//   24   42:new             #748 <Class WindowRandomAccessSource>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:getfield        #216 <Field PdfReader reader>
	//   28   50:invokevirtual   #447 <Method RandomAccessFileOrArray PdfReader.getSafeFile()>
	//   29   53:invokevirtual   #453 <Method com.itextpdf.text.io.RandomAccessSource RandomAccessFileOrArray.createSourceView()>
	//   30   56:lconst_0        
	//   31   57:iload_2         
	//   32   58:i2l             
	//   33   59:invokespecial   #751 <Method void WindowRandomAccessSource(com.itextpdf.text.io.RandomAccessSource, long, long)>
	//   34   62:invokespecial   #462 <Method void RASInputStream(com.itextpdf.text.io.RandomAccessSource)>
	//   35   65:areturn         
		}
	}

	void fill()
	{
		fields = ((Map) (new LinkedHashMap()));
	//    0    0:aload_0         
	//    1    1:new             #753 <Class LinkedHashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #754 <Method void LinkedHashMap()>
	//    4    8:putfield        #494 <Field Map fields>
		PdfDictionary pdfdictionary6 = (PdfDictionary)PdfReader.getPdfObjectRelease(reader.getCatalog().get(PdfName.ACROFORM));
	//    5   11:aload_0         
	//    6   12:getfield        #216 <Field PdfReader reader>
	//    7   15:invokevirtual   #758 <Method PdfDictionary PdfReader.getCatalog()>
	//    8   18:getstatic       #761 <Field PdfName PdfName.ACROFORM>
	//    9   21:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//   10   24:invokestatic    #764 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   11   27:checkcast       #254 <Class PdfDictionary>
	//   12   30:astore          11
		if(pdfdictionary6 != null)
	//*  13   32:aload           11
	//*  14   34:ifnonnull       38
	//*  15   37:return          
		{
			PdfBoolean pdfboolean = pdfdictionary6.getAsBoolean(PdfName.NEEDAPPEARANCES);
	//   16   38:aload           11
	//   17   40:getstatic       #767 <Field PdfName PdfName.NEEDAPPEARANCES>
	//   18   43:invokevirtual   #771 <Method PdfBoolean PdfDictionary.getAsBoolean(PdfName)>
	//   19   46:astore_3        
			PdfArray pdfarray;
			if(pdfboolean == null || !pdfboolean.booleanValue())
	//*  20   47:aload_3         
	//*  21   48:ifnull          58
	//*  22   51:aload_3         
	//*  23   52:invokevirtual   #776 <Method boolean PdfBoolean.booleanValue()>
	//*  24   55:ifne            142
				setGenerateAppearances(true);
	//   25   58:aload_0         
	//   26   59:iconst_1        
	//   27   60:invokevirtual   #780 <Method void setGenerateAppearances(boolean)>
			else
	//*  28   63:aload           11
	//*  29   65:getstatic       #783 <Field PdfName PdfName.FIELDS>
	//*  30   68:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  31   71:invokestatic    #764 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//*  32   74:checkcast       #297 <Class PdfArray>
	//*  33   77:astore          10
	//*  34   79:aload           10
	//*  35   81:ifnull          37
	//*  36   84:aload           10
	//*  37   86:invokevirtual   #301 <Method int PdfArray.size()>
	//*  38   89:ifeq            37
	//*  39   92:iconst_1        
	//*  40   93:istore_1        
	//*  41   94:iload_1         
	//*  42   95:aload_0         
	//*  43   96:getfield        #216 <Field PdfReader reader>
	//*  44   99:invokevirtual   #786 <Method int PdfReader.getNumberOfPages()>
	//*  45  102:icmpgt          559
	//*  46  105:aload_0         
	//*  47  106:getfield        #216 <Field PdfReader reader>
	//*  48  109:iload_1         
	//*  49  110:invokevirtual   #789 <Method PdfDictionary PdfReader.getPageNRelease(int)>
	//*  50  113:astore_3        
	//*  51  114:aload_3         
	//*  52  115:getstatic       #792 <Field PdfName PdfName.ANNOTS>
	//*  53  118:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  54  121:aload_3         
	//*  55  122:invokestatic    #795 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject, PdfObject)>
	//*  56  125:checkcast       #297 <Class PdfArray>
	//*  57  128:astore          12
	//*  58  130:aload           12
	//*  59  132:ifnonnull       150
	//*  60  135:iload_1         
	//*  61  136:iconst_1        
	//*  62  137:iadd            
	//*  63  138:istore_1        
	//*  64  139:goto            94
				setGenerateAppearances(false);
	//   65  142:aload_0         
	//   66  143:iconst_0        
	//   67  144:invokevirtual   #780 <Method void setGenerateAppearances(boolean)>
			pdfarray = (PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary6.get(PdfName.FIELDS));
			if(pdfarray != null && pdfarray.size() != 0)
			{
				int i = 1;
				while(i <= reader.getNumberOfPages()) 
				{
					PdfDictionary pdfdictionary = reader.getPageNRelease(i);
					PdfArray pdfarray1 = (PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.ANNOTS), ((PdfObject) (pdfdictionary)));
					if(pdfarray1 != null)
	//*  68  147:goto            63
					{
						int k = 0;
	//   69  150:iconst_0        
	//   70  151:istore_2        
						while(k < pdfarray1.size()) 
	//*  71  152:iload_2         
	//*  72  153:aload           12
	//*  73  155:invokevirtual   #301 <Method int PdfArray.size()>
	//*  74  158:icmpge          135
						{
							PdfDictionary pdfdictionary5 = pdfarray1.getAsDict(k);
	//   75  161:aload           12
	//   76  163:iload_2         
	//   77  164:invokevirtual   #797 <Method PdfDictionary PdfArray.getAsDict(int)>
	//   78  167:astore          9
							if(pdfdictionary5 == null)
	//*  79  169:aload           9
	//*  80  171:ifnonnull       190
								PdfReader.releaseLastXrefPartial(((PdfObject) (pdfarray1.getAsIndirectObject(k))));
	//   81  174:aload           12
	//   82  176:iload_2         
	//   83  177:invokevirtual   #801 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
	//   84  180:invokestatic    #804 <Method void PdfReader.releaseLastXrefPartial(PdfObject)>
							else
	//*  85  183:iload_2         
	//*  86  184:iconst_1        
	//*  87  185:iadd            
	//*  88  186:istore_2        
	//*  89  187:goto            152
							if(!PdfName.WIDGET.equals(((Object) (pdfdictionary5.getAsName(PdfName.SUBTYPE)))))
	//*  90  190:getstatic       #807 <Field PdfName PdfName.WIDGET>
	//*  91  193:aload           9
	//*  92  195:getstatic       #810 <Field PdfName PdfName.SUBTYPE>
	//*  93  198:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  94  201:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  95  204:ifne            219
							{
								PdfReader.releaseLastXrefPartial(((PdfObject) (pdfarray1.getAsIndirectObject(k))));
	//   96  207:aload           12
	//   97  209:iload_2         
	//   98  210:invokevirtual   #801 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
	//   99  213:invokestatic    #804 <Method void PdfReader.releaseLastXrefPartial(PdfObject)>
							} else
	//* 100  216:goto            183
							{
								PdfDictionary pdfdictionary7 = new PdfDictionary();
	//  101  219:new             #254 <Class PdfDictionary>
	//  102  222:dup             
	//  103  223:invokespecial   #811 <Method void PdfDictionary()>
	//  104  226:astore          13
								pdfdictionary7.putAll(pdfdictionary5);
	//  105  228:aload           13
	//  106  230:aload           9
	//  107  232:invokevirtual   #814 <Method void PdfDictionary.putAll(PdfDictionary)>
								Object obj = "";
	//  108  235:ldc2            #324 <String "">
	//  109  238:astore_3        
								PdfDictionary pdfdictionary3 = null;
	//  110  239:aconst_null     
	//  111  240:astore          5
								Object obj4 = null;
	//  112  242:aconst_null     
	//  113  243:astore          8
								for(PdfDictionary pdfdictionary2 = pdfdictionary5; pdfdictionary2 != null;)
	//* 114  245:aload           9
	//* 115  247:astore          4
	//* 116  249:aload           4
	//* 117  251:ifnull          424
								{
									pdfdictionary7.mergeDifferent(pdfdictionary2);
	//  118  254:aload           13
	//  119  256:aload           4
	//  120  258:invokevirtual   #817 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
									PdfString pdfstring = pdfdictionary2.getAsString(PdfName.T);
	//  121  261:aload           4
	//  122  263:getstatic       #820 <Field PdfName PdfName.T>
	//  123  266:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//  124  269:astore          14
									Object obj3 = obj;
	//  125  271:aload_3         
	//  126  272:astore          6
									if(pdfstring != null)
	//* 127  274:aload           14
	//* 128  276:ifnull          309
										obj3 = ((Object) ((new StringBuilder()).append(pdfstring.toUnicodeString()).append(".").append(((String) (obj))).toString()));
	//  129  279:new             #822 <Class StringBuilder>
	//  130  282:dup             
	//  131  283:invokespecial   #823 <Method void StringBuilder()>
	//  132  286:aload           14
	//  133  288:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  134  291:invokevirtual   #826 <Method StringBuilder StringBuilder.append(String)>
	//  135  294:ldc2            #828 <String ".">
	//  136  297:invokevirtual   #826 <Method StringBuilder StringBuilder.append(String)>
	//  137  300:aload_3         
	//  138  301:invokevirtual   #826 <Method StringBuilder StringBuilder.append(String)>
	//  139  304:invokevirtual   #829 <Method String StringBuilder.toString()>
	//  140  307:astore          6
									obj = obj4;
	//  141  309:aload           8
	//  142  311:astore_3        
									if(obj4 == null)
	//* 143  312:aload           8
	//* 144  314:ifnonnull       343
									{
										obj = obj4;
	//  145  317:aload           8
	//  146  319:astore_3        
										if(pdfdictionary2.get(PdfName.V) != null)
	//* 147  320:aload           4
	//* 148  322:getstatic       #264 <Field PdfName PdfName.V>
	//* 149  325:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 150  328:ifnull          343
											obj = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary2.get(PdfName.V))));
	//  151  331:aload           4
	//  152  333:getstatic       #264 <Field PdfName PdfName.V>
	//  153  336:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//  154  339:invokestatic    #764 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//  155  342:astore_3        
									}
									PdfDictionary pdfdictionary4 = pdfdictionary3;
	//  156  343:aload           5
	//  157  345:astore          7
									if(pdfdictionary3 == null)
	//* 158  347:aload           5
	//* 159  349:ifnonnull       401
									{
										pdfdictionary4 = pdfdictionary3;
	//  160  352:aload           5
	//  161  354:astore          7
										if(pdfstring != null)
	//* 162  356:aload           14
	//* 163  358:ifnull          401
										{
											pdfdictionary3 = pdfdictionary2;
	//  164  361:aload           4
	//  165  363:astore          5
											pdfdictionary4 = pdfdictionary3;
	//  166  365:aload           5
	//  167  367:astore          7
											if(pdfdictionary2.get(PdfName.V) == null)
	//* 168  369:aload           4
	//* 169  371:getstatic       #264 <Field PdfName PdfName.V>
	//* 170  374:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 171  377:ifnonnull       401
											{
												pdfdictionary4 = pdfdictionary3;
	//  172  380:aload           5
	//  173  382:astore          7
												if(obj != null)
	//* 174  384:aload_3         
	//* 175  385:ifnull          401
												{
													pdfdictionary3.put(PdfName.V, ((PdfObject) (obj)));
	//  176  388:aload           5
	//  177  390:getstatic       #264 <Field PdfName PdfName.V>
	//  178  393:aload_3         
	//  179  394:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
													pdfdictionary4 = pdfdictionary3;
	//  180  397:aload           5
	//  181  399:astore          7
												}
											}
										}
									}
									pdfdictionary2 = pdfdictionary2.getAsDict(PdfName.PARENT);
	//  182  401:aload           4
	//  183  403:getstatic       #832 <Field PdfName PdfName.PARENT>
	//  184  406:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  185  409:astore          4
									obj4 = obj;
	//  186  411:aload_3         
	//  187  412:astore          8
									obj = obj3;
	//  188  414:aload           6
	//  189  416:astore_3        
									pdfdictionary3 = pdfdictionary4;
	//  190  417:aload           7
	//  191  419:astore          5
								}

	//* 192  421:goto            249
								Object obj1 = obj;
	//  193  424:aload_3         
	//  194  425:astore          4
								if(((String) (obj)).length() > 0)
	//* 195  427:aload_3         
	//* 196  428:invokevirtual   #835 <Method int String.length()>
	//* 197  431:ifle            447
									obj1 = ((Object) (((String) (obj)).substring(0, ((String) (obj)).length() - 1)));
	//  198  434:aload_3         
	//  199  435:iconst_0        
	//  200  436:aload_3         
	//  201  437:invokevirtual   #835 <Method int String.length()>
	//  202  440:iconst_1        
	//  203  441:isub            
	//  204  442:invokevirtual   #839 <Method String String.substring(int, int)>
	//  205  445:astore          4
								Item item1 = (Item)fields.get(obj1);
	//  206  447:aload_0         
	//  207  448:getfield        #494 <Field Map fields>
	//  208  451:aload           4
	//  209  453:invokeinterface #499 <Method Object Map.get(Object)>
	//  210  458:checkcast       #14  <Class AcroFields$Item>
	//  211  461:astore          6
								obj = ((Object) (item1));
	//  212  463:aload           6
	//  213  465:astore_3        
								if(item1 == null)
	//* 214  466:aload           6
	//* 215  468:ifnonnull       492
								{
									obj = ((Object) (new Item()));
	//  216  471:new             #14  <Class AcroFields$Item>
	//  217  474:dup             
	//  218  475:invokespecial   #840 <Method void AcroFields$Item()>
	//  219  478:astore_3        
									fields.put(obj1, obj);
	//  220  479:aload_0         
	//  221  480:getfield        #494 <Field Map fields>
	//  222  483:aload           4
	//  223  485:aload_3         
	//  224  486:invokeinterface #841 <Method Object Map.put(Object, Object)>
	//  225  491:pop             
								}
								if(pdfdictionary3 == null)
	//* 226  492:aload           5
	//* 227  494:ifnonnull       550
									((Item) (obj)).addValue(pdfdictionary5);
	//  228  497:aload_3         
	//  229  498:aload           9
	//  230  500:invokevirtual   #844 <Method void AcroFields$Item.addValue(PdfDictionary)>
								else
	//* 231  503:aload_3         
	//* 232  504:aload           9
	//* 233  506:invokevirtual   #847 <Method void AcroFields$Item.addWidget(PdfDictionary)>
	//* 234  509:aload_3         
	//* 235  510:aload           12
	//* 236  512:iload_2         
	//* 237  513:invokevirtual   #801 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
	//* 238  516:invokevirtual   #851 <Method void AcroFields$Item.addWidgetRef(PdfIndirectReference)>
	//* 239  519:aload           11
	//* 240  521:ifnull          531
	//* 241  524:aload           13
	//* 242  526:aload           11
	//* 243  528:invokevirtual   #817 <Method void PdfDictionary.mergeDifferent(PdfDictionary)>
	//* 244  531:aload_3         
	//* 245  532:aload           13
	//* 246  534:invokevirtual   #854 <Method void AcroFields$Item.addMerged(PdfDictionary)>
	//* 247  537:aload_3         
	//* 248  538:iload_1         
	//* 249  539:invokevirtual   #857 <Method void AcroFields$Item.addPage(int)>
	//* 250  542:aload_3         
	//* 251  543:iload_2         
	//* 252  544:invokevirtual   #860 <Method void AcroFields$Item.addTabOrder(int)>
	//* 253  547:goto            183
									((Item) (obj)).addValue(pdfdictionary3);
	//  254  550:aload_3         
	//  255  551:aload           5
	//  256  553:invokevirtual   #844 <Method void AcroFields$Item.addValue(PdfDictionary)>
								((Item) (obj)).addWidget(pdfdictionary5);
								((Item) (obj)).addWidgetRef(pdfarray1.getAsIndirectObject(k));
								if(pdfdictionary6 != null)
									pdfdictionary7.mergeDifferent(pdfdictionary6);
								((Item) (obj)).addMerged(pdfdictionary7);
								((Item) (obj)).addPage(i);
								((Item) (obj)).addTabOrder(k);
							}
							k++;
						}
					}
					i++;
				}
	//* 257  556:goto            503
				PdfNumber pdfnumber = pdfdictionary6.getAsNumber(PdfName.SIGFLAGS);
	//  258  559:aload           11
	//  259  561:getstatic       #863 <Field PdfName PdfName.SIGFLAGS>
	//  260  564:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  261  567:astore_3        
				if(pdfnumber != null && (pdfnumber.intValue() & 1) == 1)
	//* 262  568:aload_3         
	//* 263  569:ifnull          37
	//* 264  572:aload_3         
	//* 265  573:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//* 266  576:iconst_1        
	//* 267  577:iand            
	//* 268  578:iconst_1        
	//* 269  579:icmpne          37
				{
					int j = 0;
	//  270  582:iconst_0        
	//  271  583:istore_1        
					while(j < pdfarray.size()) 
	//* 272  584:iload_1         
	//* 273  585:aload           10
	//* 274  587:invokevirtual   #301 <Method int PdfArray.size()>
	//* 275  590:icmpge          37
					{
						Object obj2 = ((Object) (pdfarray.getAsDict(j)));
	//  276  593:aload           10
	//  277  595:iload_1         
	//  278  596:invokevirtual   #797 <Method PdfDictionary PdfArray.getAsDict(int)>
	//  279  599:astore          4
						if(obj2 == null)
	//* 280  601:aload           4
	//* 281  603:ifnonnull       622
							PdfReader.releaseLastXrefPartial(((PdfObject) (pdfarray.getAsIndirectObject(j))));
	//  282  606:aload           10
	//  283  608:iload_1         
	//  284  609:invokevirtual   #801 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
	//  285  612:invokestatic    #804 <Method void PdfReader.releaseLastXrefPartial(PdfObject)>
						else
	//* 286  615:iload_1         
	//* 287  616:iconst_1        
	//* 288  617:iadd            
	//* 289  618:istore_1        
	//* 290  619:goto            584
						if(!PdfName.WIDGET.equals(((Object) (((PdfDictionary) (obj2)).getAsName(PdfName.SUBTYPE)))))
	//* 291  622:getstatic       #807 <Field PdfName PdfName.WIDGET>
	//* 292  625:aload           4
	//* 293  627:getstatic       #810 <Field PdfName PdfName.SUBTYPE>
	//* 294  630:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//* 295  633:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 296  636:ifne            651
							PdfReader.releaseLastXrefPartial(((PdfObject) (pdfarray.getAsIndirectObject(j))));
	//  297  639:aload           10
	//  298  641:iload_1         
	//  299  642:invokevirtual   #801 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
	//  300  645:invokestatic    #804 <Method void PdfReader.releaseLastXrefPartial(PdfObject)>
						else
	//* 301  648:goto            615
						if((PdfArray)PdfReader.getPdfObjectRelease(((PdfDictionary) (obj2)).get(PdfName.KIDS)) == null)
	//* 302  651:aload           4
	//* 303  653:getstatic       #866 <Field PdfName PdfName.KIDS>
	//* 304  656:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 305  659:invokestatic    #764 <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 306  662:checkcast       #297 <Class PdfArray>
	//* 307  665:ifnonnull       615
						{
							PdfDictionary pdfdictionary1 = new PdfDictionary();
	//  308  668:new             #254 <Class PdfDictionary>
	//  309  671:dup             
	//  310  672:invokespecial   #811 <Method void PdfDictionary()>
	//  311  675:astore_3        
							pdfdictionary1.putAll(((PdfDictionary) (obj2)));
	//  312  676:aload_3         
	//  313  677:aload           4
	//  314  679:invokevirtual   #814 <Method void PdfDictionary.putAll(PdfDictionary)>
							obj2 = ((Object) (((PdfDictionary) (obj2)).getAsString(PdfName.T)));
	//  315  682:aload           4
	//  316  684:getstatic       #820 <Field PdfName PdfName.T>
	//  317  687:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//  318  690:astore          4
							if(obj2 != null)
	//* 319  692:aload           4
	//* 320  694:ifnull          615
							{
								obj2 = ((Object) (((PdfString) (obj2)).toUnicodeString()));
	//  321  697:aload           4
	//  322  699:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  323  702:astore          4
								if(!fields.containsKey(obj2))
	//* 324  704:aload_0         
	//* 325  705:getfield        #494 <Field Map fields>
	//* 326  708:aload           4
	//* 327  710:invokeinterface #867 <Method boolean Map.containsKey(Object)>
	//* 328  715:ifne            615
								{
									Item item = new Item();
	//  329  718:new             #14  <Class AcroFields$Item>
	//  330  721:dup             
	//  331  722:invokespecial   #840 <Method void AcroFields$Item()>
	//  332  725:astore          5
									fields.put(obj2, ((Object) (item)));
	//  333  727:aload_0         
	//  334  728:getfield        #494 <Field Map fields>
	//  335  731:aload           4
	//  336  733:aload           5
	//  337  735:invokeinterface #841 <Method Object Map.put(Object, Object)>
	//  338  740:pop             
									item.addValue(pdfdictionary1);
	//  339  741:aload           5
	//  340  743:aload_3         
	//  341  744:invokevirtual   #844 <Method void AcroFields$Item.addValue(PdfDictionary)>
									item.addWidget(pdfdictionary1);
	//  342  747:aload           5
	//  343  749:aload_3         
	//  344  750:invokevirtual   #847 <Method void AcroFields$Item.addWidget(PdfDictionary)>
									item.addWidgetRef(pdfarray.getAsIndirectObject(j));
	//  345  753:aload           5
	//  346  755:aload           10
	//  347  757:iload_1         
	//  348  758:invokevirtual   #801 <Method PdfIndirectReference PdfArray.getAsIndirectObject(int)>
	//  349  761:invokevirtual   #851 <Method void AcroFields$Item.addWidgetRef(PdfIndirectReference)>
									item.addMerged(pdfdictionary1);
	//  350  764:aload           5
	//  351  766:aload_3         
	//  352  767:invokevirtual   #854 <Method void AcroFields$Item.addMerged(PdfDictionary)>
									item.addPage(-1);
	//  353  770:aload           5
	//  354  772:iconst_m1       
	//  355  773:invokevirtual   #857 <Method void AcroFields$Item.addPage(int)>
									item.addTabOrder(-1);
	//  356  776:aload           5
	//  357  778:iconst_m1       
	//  358  779:invokevirtual   #860 <Method void AcroFields$Item.addTabOrder(int)>
								}
							}
						}
						j++;
					}
				}
			}
		}
	//* 359  782:goto            615
	}

	PdfAppearance getAppearance(PdfDictionary pdfdictionary, String s, String s1)
		throws IOException, DocumentException
	{
		return getAppearance(pdfdictionary, new String[] {
			s
		}, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:anewarray       String[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_2         
	//    7    9:aastore         
	//    8   10:aload_3         
	//    9   11:invokevirtual   #872 <Method PdfAppearance getAppearance(PdfDictionary, String[], String)>
	//   10   14:areturn         
	}

	PdfAppearance getAppearance(PdfDictionary pdfdictionary, String as[], String s)
		throws IOException, DocumentException
	{
		String s1;
		Object obj;
		PdfName pdfname;
label0:
		{
			boolean flag1;
label1:
			{
				pdfname = pdfdictionary.getAsName(PdfName.FT);
	//    0    0:aload_1         
	//    1    1:getstatic       #875 <Field PdfName PdfName.FT>
	//    2    4:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//    3    7:astore          12
				if(!PdfName.BTN.equals(((Object) (pdfname))))
					break label0;
	//    4    9:getstatic       #878 <Field PdfName PdfName.BTN>
	//    5   12:aload           12
	//    6   14:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//    7   17:ifeq            166
				as = ((String []) (pdfdictionary.getAsNumber(PdfName.FF)));
	//    8   20:aload_1         
	//    9   21:getstatic       #192 <Field PdfName PdfName.FF>
	//   10   24:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   11   27:astore_2        
				boolean flag;
				RadioCheckField radiocheckfield;
				if(as != null && (((PdfNumber) (as)).intValue() & 0x8000) != 0)
	//*  12   28:aload_2         
	//*  13   29:ifnull          154
	//*  14   32:aload_2         
	//*  15   33:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//*  16   36:ldc2            #879 <Int 32768>
	//*  17   39:iand            
	//*  18   40:ifeq            154
					flag = true;
	//   19   43:iconst_1        
	//   20   44:istore          6
				else
	//*  21   46:new             #881 <Class RadioCheckField>
	//*  22   49:dup             
	//*  23   50:aload_0         
	//*  24   51:getfield        #218 <Field PdfWriter writer>
	//*  25   54:aconst_null     
	//*  26   55:aconst_null     
	//*  27   56:aconst_null     
	//*  28   57:invokespecial   #884 <Method void RadioCheckField(PdfWriter, Rectangle, String, String)>
	//*  29   60:astore          8
	//*  30   62:aload_0         
	//*  31   63:aload_1         
	//*  32   64:aload           8
	//*  33   66:invokevirtual   #886 <Method void decodeGenericDictionary(PdfDictionary, BaseField)>
	//*  34   69:aload_1         
	//*  35   70:getstatic       #889 <Field PdfName PdfName.RECT>
	//*  36   73:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//*  37   76:invokestatic    #893 <Method Rectangle PdfReader.getNormalizedRectangle(PdfArray)>
	//*  38   79:astore_3        
	//*  39   80:aload           8
	//*  40   82:invokevirtual   #896 <Method int RadioCheckField.getRotation()>
	//*  41   85:bipush          90
	//*  42   87:icmpeq          103
	//*  43   90:aload_3         
	//*  44   91:astore_2        
	//*  45   92:aload           8
	//*  46   94:invokevirtual   #896 <Method int RadioCheckField.getRotation()>
	//*  47   97:sipush          270
	//*  48  100:icmpne          108
	//*  49  103:aload_3         
	//*  50  104:invokevirtual   #902 <Method Rectangle Rectangle.rotate()>
	//*  51  107:astore_2        
	//*  52  108:aload           8
	//*  53  110:aload_2         
	//*  54  111:invokevirtual   #906 <Method void RadioCheckField.setBox(Rectangle)>
	//*  55  114:iload           6
	//*  56  116:ifne            125
	//*  57  119:aload           8
	//*  58  121:iconst_3        
	//*  59  122:invokevirtual   #909 <Method void RadioCheckField.setCheckType(int)>
	//*  60  125:aload_1         
	//*  61  126:getstatic       #261 <Field PdfName PdfName.AS>
	//*  62  129:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  63  132:getstatic       #912 <Field PdfName PdfName.Off>
	//*  64  135:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  65  138:ifne            160
	//*  66  141:iconst_1        
	//*  67  142:istore          7
	//*  68  144:aload           8
	//*  69  146:iload           6
	//*  70  148:iload           7
	//*  71  150:invokevirtual   #915 <Method PdfAppearance RadioCheckField.getAppearance(boolean, boolean)>
	//*  72  153:areturn         
					flag = false;
	//   73  154:iconst_0        
	//   74  155:istore          6
				radiocheckfield = new RadioCheckField(writer, ((Rectangle) (null)), ((String) (null)), ((String) (null)));
				decodeGenericDictionary(pdfdictionary, ((BaseField) (radiocheckfield)));
				s = ((String) (PdfReader.getNormalizedRectangle(pdfdictionary.getAsArray(PdfName.RECT))));
				if(radiocheckfield.getRotation() != 90)
				{
					as = ((String []) (s));
					if(radiocheckfield.getRotation() != 270)
						break label1;
				}
				as = ((String []) (((Rectangle) (s)).rotate()));
			}
			radiocheckfield.setBox(((Rectangle) (as)));
			if(!flag)
				radiocheckfield.setCheckType(3);
			if(!pdfdictionary.getAsName(PdfName.AS).equals(((Object) (PdfName.Off))))
				flag1 = true;
			else
	//*  75  157:goto            46
				flag1 = false;
	//   76  160:iconst_0        
	//   77  161:istore          7
			return radiocheckfield.getAppearance(flag, flag1);
		}
	//*  78  163:goto            144
		topFirst = 0;
	//   79  166:aload_0         
	//   80  167:iconst_0        
	//   81  168:putfield        #917 <Field int topFirst>
		TextField textfield;
		Rectangle rectangle;
		if(as.length > 0)
	//*  82  171:aload_2         
	//*  83  172:arraylength     
	//*  84  173:ifle            366
			s1 = as[0];
	//   85  176:aload_2         
	//   86  177:iconst_0        
	//   87  178:aaload          
	//   88  179:astore          8
		else
	//*  89  181:aload_0         
	//*  90  182:getfield        #919 <Field Map fieldCache>
	//*  91  185:ifnull          201
	//*  92  188:aload_0         
	//*  93  189:getfield        #919 <Field Map fieldCache>
	//*  94  192:aload_3         
	//*  95  193:invokeinterface #867 <Method boolean Map.containsKey(Object)>
	//*  96  198:ifne            372
	//*  97  201:new             #589 <Class TextField>
	//*  98  204:dup             
	//*  99  205:aload_0         
	//* 100  206:getfield        #218 <Field PdfWriter writer>
	//* 101  209:aconst_null     
	//* 102  210:aconst_null     
	//* 103  211:invokespecial   #922 <Method void TextField(PdfWriter, Rectangle, String)>
	//* 104  214:astore          10
	//* 105  216:aload           10
	//* 106  218:aload_0         
	//* 107  219:getfield        #924 <Field float extraMarginLeft>
	//* 108  222:aload_0         
	//* 109  223:getfield        #926 <Field float extraMarginTop>
	//* 110  226:invokevirtual   #930 <Method void TextField.setExtraMargin(float, float)>
	//* 111  229:aload           10
	//* 112  231:fconst_0        
	//* 113  232:invokevirtual   #931 <Method void TextField.setBorderWidth(float)>
	//* 114  235:aload           10
	//* 115  237:aload_0         
	//* 116  238:getfield        #481 <Field ArrayList substitutionFonts>
	//* 117  241:invokevirtual   #935 <Method void TextField.setSubstitutionFonts(ArrayList)>
	//* 118  244:aload_0         
	//* 119  245:aload_1         
	//* 120  246:aload           10
	//* 121  248:invokevirtual   #886 <Method void decodeGenericDictionary(PdfDictionary, BaseField)>
	//* 122  251:aload_1         
	//* 123  252:getstatic       #889 <Field PdfName PdfName.RECT>
	//* 124  255:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 125  258:invokestatic    #893 <Method Rectangle PdfReader.getNormalizedRectangle(PdfArray)>
	//* 126  261:astore          11
	//* 127  263:aload           10
	//* 128  265:invokevirtual   #936 <Method int TextField.getRotation()>
	//* 129  268:bipush          90
	//* 130  270:icmpeq          288
	//* 131  273:aload           11
	//* 132  275:astore          9
	//* 133  277:aload           10
	//* 134  279:invokevirtual   #936 <Method int TextField.getRotation()>
	//* 135  282:sipush          270
	//* 136  285:icmpne          295
	//* 137  288:aload           11
	//* 138  290:invokevirtual   #902 <Method Rectangle Rectangle.rotate()>
	//* 139  293:astore          9
	//* 140  295:aload           10
	//* 141  297:aload           9
	//* 142  299:invokevirtual   #937 <Method void TextField.setBox(Rectangle)>
	//* 143  302:aload           10
	//* 144  304:astore          9
	//* 145  306:aload_0         
	//* 146  307:getfield        #919 <Field Map fieldCache>
	//* 147  310:ifnull          330
	//* 148  313:aload_0         
	//* 149  314:getfield        #919 <Field Map fieldCache>
	//* 150  317:aload_3         
	//* 151  318:aload           10
	//* 152  320:invokeinterface #841 <Method Object Map.put(Object, Object)>
	//* 153  325:pop             
	//* 154  326:aload           10
	//* 155  328:astore          9
	//* 156  330:getstatic       #940 <Field PdfName PdfName.TX>
	//* 157  333:aload           12
	//* 158  335:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 159  338:ifeq            399
	//* 160  341:aload_2         
	//* 161  342:arraylength     
	//* 162  343:ifle            360
	//* 163  346:aload_2         
	//* 164  347:iconst_0        
	//* 165  348:aaload          
	//* 166  349:ifnull          360
	//* 167  352:aload           9
	//* 168  354:aload_2         
	//* 169  355:iconst_0        
	//* 170  356:aaload          
	//* 171  357:invokevirtual   #943 <Method void TextField.setText(String)>
	//* 172  360:aload           9
	//* 173  362:invokevirtual   #946 <Method PdfAppearance TextField.getAppearance()>
	//* 174  365:areturn         
			s1 = null;
	//  175  366:aconst_null     
	//  176  367:astore          8
		if(fieldCache != null && fieldCache.containsKey(((Object) (s)))) goto _L2; else goto _L1
_L1:
label2:
		{
			textfield = new TextField(writer, ((Rectangle) (null)), ((String) (null)));
			textfield.setExtraMargin(extraMarginLeft, extraMarginTop);
			textfield.setBorderWidth(0.0F);
			textfield.setSubstitutionFonts(substitutionFonts);
			decodeGenericDictionary(pdfdictionary, ((BaseField) (textfield)));
			rectangle = PdfReader.getNormalizedRectangle(pdfdictionary.getAsArray(PdfName.RECT));
			if(textfield.getRotation() != 90)
			{
				obj = ((Object) (rectangle));
				if(textfield.getRotation() != 270)
					break label2;
			}
			obj = ((Object) (rectangle.rotate()));
		}
		textfield.setBox(((Rectangle) (obj)));
		obj = ((Object) (textfield));
		if(fieldCache != null)
		{
			fieldCache.put(((Object) (s)), ((Object) (textfield)));
			obj = ((Object) (textfield));
		}
_L4:
		if(PdfName.TX.equals(((Object) (pdfname))))
		{
			if(as.length > 0 && as[0] != null)
				((TextField) (obj)).setText(as[0]);
			return ((TextField) (obj)).getAppearance();
		}
		break; /* Loop/switch isn't completed */
	//* 177  369:goto            181
_L2:
		obj = ((Object) ((TextField)fieldCache.get(((Object) (s)))));
	//  178  372:aload_0         
	//  179  373:getfield        #919 <Field Map fieldCache>
	//  180  376:aload_3         
	//  181  377:invokeinterface #499 <Method Object Map.get(Object)>
	//  182  382:checkcast       #589 <Class TextField>
	//  183  385:astore          9
		((TextField) (obj)).setWriter(writer);
	//  184  387:aload           9
	//  185  389:aload_0         
	//  186  390:getfield        #218 <Field PdfWriter writer>
	//  187  393:invokevirtual   #950 <Method void TextField.setWriter(PdfWriter)>
		if(true) goto _L4; else goto _L3
	//  188  396:goto            330
_L3:
		int i;
		PdfArray pdfarray;
		if(!PdfName.CH.equals(((Object) (pdfname))))
	//* 189  399:getstatic       #953 <Field PdfName PdfName.CH>
	//* 190  402:aload           12
	//* 191  404:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 192  407:ifne            428
			throw new DocumentException(MessageLocalization.getComposedMessage("an.appearance.was.requested.without.a.variable.text.field", new Object[0]));
	//  193  410:new             #515 <Class DocumentException>
	//  194  413:dup             
	//  195  414:ldc2            #955 <String "an.appearance.was.requested.without.a.variable.text.field">
	//  196  417:iconst_0        
	//  197  418:anewarray       Object[]
	//  198  421:invokestatic    #961 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  199  424:invokespecial   #962 <Method void DocumentException(String)>
	//  200  427:athrow          
		pdfarray = pdfdictionary.getAsArray(PdfName.OPT);
	//  201  428:aload_1         
	//  202  429:getstatic       #291 <Field PdfName PdfName.OPT>
	//  203  432:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  204  435:astore          11
		i = 0;
	//  205  437:iconst_0        
	//  206  438:istore          4
		pdfdictionary = ((PdfDictionary) (pdfdictionary.getAsNumber(PdfName.FF)));
	//  207  440:aload_1         
	//  208  441:getstatic       #192 <Field PdfName PdfName.FF>
	//  209  444:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  210  447:astore_1        
		if(pdfdictionary != null)
	//* 211  448:aload_1         
	//* 212  449:ifnull          458
			i = ((PdfNumber) (pdfdictionary)).intValue();
	//  213  452:aload_1         
	//  214  453:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//  215  456:istore          4
		if((0x20000 & i) != 0 && pdfarray == null)
	//* 216  458:ldc2            #963 <Int 0x20000>
	//* 217  461:iload           4
	//* 218  463:iand            
	//* 219  464:ifeq            485
	//* 220  467:aload           11
	//* 221  469:ifnonnull       485
		{
			((TextField) (obj)).setText(s1);
	//  222  472:aload           9
	//  223  474:aload           8
	//  224  476:invokevirtual   #943 <Method void TextField.setText(String)>
			return ((TextField) (obj)).getAppearance();
	//  225  479:aload           9
	//  226  481:invokevirtual   #946 <Method PdfAppearance TextField.getAppearance()>
	//  227  484:areturn         
		}
		if(pdfarray == null) goto _L6; else goto _L5
	//  228  485:aload           11
	//  229  487:ifnull          759
_L5:
		String as1[];
		s = ((String) (new String[pdfarray.size()]));
	//  230  490:aload           11
	//  231  492:invokevirtual   #301 <Method int PdfArray.size()>
	//  232  495:anewarray       String[]
	//  233  498:astore_3        
		as1 = new String[pdfarray.size()];
	//  234  499:aload           11
	//  235  501:invokevirtual   #301 <Method int PdfArray.size()>
	//  236  504:anewarray       String[]
	//  237  507:astore          10
		int j = 0;
	//  238  509:iconst_0        
	//  239  510:istore          5
		while(j < pdfarray.size()) 
	//* 240  512:iload           5
	//* 241  514:aload           11
	//* 242  516:invokevirtual   #301 <Method int PdfArray.size()>
	//* 243  519:icmpge          598
		{
			pdfdictionary = ((PdfDictionary) (pdfarray.getPdfObject(j)));
	//  244  522:aload           11
	//  245  524:iload           5
	//  246  526:invokevirtual   #335 <Method PdfObject PdfArray.getPdfObject(int)>
	//  247  529:astore_1        
			if(((PdfObject) (pdfdictionary)).isString())
	//* 248  530:aload_1         
	//* 249  531:invokevirtual   #313 <Method boolean PdfObject.isString()>
	//* 250  534:ifeq            565
			{
				pdfdictionary = ((PdfDictionary) (((PdfString)pdfdictionary).toUnicodeString()));
	//  251  537:aload_1         
	//  252  538:checkcast       #315 <Class PdfString>
	//  253  541:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  254  544:astore_1        
				as1[j] = ((String) (pdfdictionary));
	//  255  545:aload           10
	//  256  547:iload           5
	//  257  549:aload_1         
	//  258  550:aastore         
				s[j] = ((/*<invalid signature>*/java.lang.Object) (pdfdictionary));
	//  259  551:aload_3         
	//  260  552:iload           5
	//  261  554:aload_1         
	//  262  555:aastore         
			} else
	//* 263  556:iload           5
	//* 264  558:iconst_1        
	//* 265  559:iadd            
	//* 266  560:istore          5
	//* 267  562:goto            512
			{
				pdfdictionary = ((PdfDictionary) ((PdfArray)pdfdictionary));
	//  268  565:aload_1         
	//  269  566:checkcast       #297 <Class PdfArray>
	//  270  569:astore_1        
				as1[j] = ((PdfArray) (pdfdictionary)).getAsString(0).toUnicodeString();
	//  271  570:aload           10
	//  272  572:iload           5
	//  273  574:aload_1         
	//  274  575:iconst_0        
	//  275  576:invokevirtual   #966 <Method PdfString PdfArray.getAsString(int)>
	//  276  579:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  277  582:aastore         
				s[j] = ((/*<invalid signature>*/java.lang.Object) (((PdfArray) (pdfdictionary)).getAsString(1).toUnicodeString()));
	//  278  583:aload_3         
	//  279  584:iload           5
	//  280  586:aload_1         
	//  281  587:iconst_1        
	//  282  588:invokevirtual   #966 <Method PdfString PdfArray.getAsString(int)>
	//  283  591:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  284  594:aastore         
			}
			j++;
		}
	//* 285  595:goto            556
		if((0x20000 & i) != 0)
	//* 286  598:ldc2            #963 <Int 0x20000>
	//* 287  601:iload           4
	//* 288  603:iand            
	//* 289  604:ifeq            659
		{
			i = 0;
	//  290  607:iconst_0        
	//  291  608:istore          4
			do
			{
label3:
				{
					pdfdictionary = ((PdfDictionary) (s1));
	//  292  610:aload           8
	//  293  612:astore_1        
					if(i < s.length)
	//* 294  613:iload           4
	//* 295  615:aload_3         
	//* 296  616:arraylength     
	//* 297  617:icmpge          638
					{
						if(!s1.equals(((Object) (as1[i]))))
							break label3;
	//  298  620:aload           8
	//  299  622:aload           10
	//  300  624:iload           4
	//  301  626:aaload          
	//  302  627:invokevirtual   #395 <Method boolean String.equals(Object)>
	//  303  630:ifeq            650
						pdfdictionary = ((PdfDictionary) (s[i]));
	//  304  633:aload_3         
	//  305  634:iload           4
	//  306  636:aaload          
	//  307  637:astore_1        
					}
					((TextField) (obj)).setText(((String) (pdfdictionary)));
	//  308  638:aload           9
	//  309  640:aload_1         
	//  310  641:invokevirtual   #943 <Method void TextField.setText(String)>
					return ((TextField) (obj)).getAppearance();
	//  311  644:aload           9
	//  312  646:invokevirtual   #946 <Method PdfAppearance TextField.getAppearance()>
	//  313  649:areturn         
				}
				i++;
	//  314  650:iload           4
	//  315  652:iconst_1        
	//  316  653:iadd            
	//  317  654:istore          4
			} while(true);
	//  318  656:goto            610
		}
		pdfdictionary = ((PdfDictionary) (new ArrayList()));
	//  319  659:new             #369 <Class ArrayList>
	//  320  662:dup             
	//  321  663:invokespecial   #370 <Method void ArrayList()>
	//  322  666:astore_1        
		i = 0;
	//  323  667:iconst_0        
	//  324  668:istore          4
_L8:
		if(i < as1.length)
	//* 325  670:iload           4
	//* 326  672:aload           10
	//* 327  674:arraylength     
	//* 328  675:icmpge          740
		{
			int k = 0;
	//  329  678:iconst_0        
	//  330  679:istore          5
			do
			{
label4:
				{
					if(k < as.length)
	//* 331  681:iload           5
	//* 332  683:aload_2         
	//* 333  684:arraylength     
	//* 334  685:icmpge          722
					{
						String s2 = as[k];
	//  335  688:aload_2         
	//  336  689:iload           5
	//  337  691:aaload          
	//  338  692:astore          8
						if(s2 == null || !s2.equals(((Object) (as1[i]))))
							break label4;
	//  339  694:aload           8
	//  340  696:ifnull          731
	//  341  699:aload           8
	//  342  701:aload           10
	//  343  703:iload           4
	//  344  705:aaload          
	//  345  706:invokevirtual   #395 <Method boolean String.equals(Object)>
	//  346  709:ifeq            731
						((ArrayList) (pdfdictionary)).add(((Object) (Integer.valueOf(i))));
	//  347  712:aload_1         
	//  348  713:iload           4
	//  349  715:invokestatic    #570 <Method Integer Integer.valueOf(int)>
	//  350  718:invokevirtual   #436 <Method boolean ArrayList.add(Object)>
	//  351  721:pop             
					}
					i++;
	//  352  722:iload           4
	//  353  724:iconst_1        
	//  354  725:iadd            
	//  355  726:istore          4
					continue; /* Loop/switch isn't completed */
	//  356  728:goto            670
				}
				k++;
	//  357  731:iload           5
	//  358  733:iconst_1        
	//  359  734:iadd            
	//  360  735:istore          5
			} while(true);
	//  361  737:goto            681
		}
		((TextField) (obj)).setChoices(((String []) (s)));
	//  362  740:aload           9
	//  363  742:aload_3         
	//  364  743:invokevirtual   #970 <Method void TextField.setChoices(String[])>
		((TextField) (obj)).setChoiceExports(as1);
	//  365  746:aload           9
	//  366  748:aload           10
	//  367  750:invokevirtual   #973 <Method void TextField.setChoiceExports(String[])>
		((TextField) (obj)).setChoiceSelections(((ArrayList) (pdfdictionary)));
	//  368  753:aload           9
	//  369  755:aload_1         
	//  370  756:invokevirtual   #976 <Method void TextField.setChoiceSelections(ArrayList)>
_L6:
		pdfdictionary = ((PdfDictionary) (((TextField) (obj)).getListAppearance()));
	//  371  759:aload           9
	//  372  761:invokevirtual   #979 <Method PdfAppearance TextField.getListAppearance()>
	//  373  764:astore_1        
		topFirst = ((TextField) (obj)).getTopFirst();
	//  374  765:aload_0         
	//  375  766:aload           9
	//  376  768:invokevirtual   #982 <Method int TextField.getTopFirst()>
	//  377  771:putfield        #917 <Field int topFirst>
		return ((PdfAppearance) (pdfdictionary));
	//  378  774:aload_1         
	//  379  775:areturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	public String[] getAppearanceStates(String s)
	{
		PdfString pdfstring;
		Item item;
		LinkedHashSet linkedhashset;
		item = (Item)fields.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #494 <Field Map fields>
	//    2    4:aload_1         
	//    3    5:invokeinterface #499 <Method Object Map.get(Object)>
	//    4   10:checkcast       #14  <Class AcroFields$Item>
	//    5   13:astore          4
		if(item == null)
	//*   6   15:aload           4
	//*   7   17:ifnonnull       22
			return null;
	//    8   20:aconst_null     
	//    9   21:areturn         
		linkedhashset = new LinkedHashSet();
	//   10   22:new             #986 <Class LinkedHashSet>
	//   11   25:dup             
	//   12   26:invokespecial   #987 <Method void LinkedHashSet()>
	//   13   29:astore          5
		s = ((String) (item.getValue(0)));
	//   14   31:aload           4
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//   17   37:astore_1        
		pdfstring = ((PdfDictionary) (s)).getAsString(PdfName.OPT);
	//   18   38:aload_1         
	//   19   39:getstatic       #291 <Field PdfName PdfName.OPT>
	//   20   42:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   21   45:astore_3        
		if(pdfstring == null) goto _L2; else goto _L1
	//   22   46:aload_3         
	//   23   47:ifnull          95
_L1:
		((HashSet) (linkedhashset)).add(((Object) (pdfstring.toUnicodeString())));
	//   24   50:aload           5
	//   25   52:aload_3         
	//   26   53:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//   27   56:invokevirtual   #990 <Method boolean HashSet.add(Object)>
	//   28   59:pop             
_L4:
		int i = 0;
	//   29   60:iconst_0        
	//   30   61:istore_2        
		do
		{
			if(i >= item.size())
				break;
	//   31   62:iload_2         
	//   32   63:aload           4
	//   33   65:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//   34   68:icmpge          264
			s = ((String) (item.getWidget(i).getAsDict(PdfName.AP)));
	//   35   71:aload           4
	//   36   73:iload_2         
	//   37   74:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//   38   77:getstatic       #252 <Field PdfName PdfName.AP>
	//   39   80:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   40   83:astore_1        
			Object obj;
			PdfArray pdfarray;
			PdfObject pdfobject;
			if(s != null)
	//*  41   84:aload_1         
	//*  42   85:ifnonnull       209
	//*  43   88:iload_2         
	//*  44   89:iconst_1        
	//*  45   90:iadd            
	//*  46   91:istore_2        
	//*  47   92:goto            62
	//*  48   95:aload_1         
	//*  49   96:getstatic       #291 <Field PdfName PdfName.OPT>
	//*  50   99:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//*  51  102:astore          6
	//*  52  104:aload           6
	//*  53  106:ifnull          60
	//*  54  109:iconst_0        
	//*  55  110:istore_2        
	//*  56  111:iload_2         
	//*  57  112:aload           6
	//*  58  114:invokevirtual   #301 <Method int PdfArray.size()>
	//*  59  117:icmpge          60
	//*  60  120:aload           6
	//*  61  122:iload_2         
	//*  62  123:invokevirtual   #305 <Method PdfObject PdfArray.getDirectObject(int)>
	//*  63  126:astore          7
	//*  64  128:aconst_null     
	//*  65  129:astore_3        
	//*  66  130:aload_3         
	//*  67  131:astore_1        
	//*  68  132:aload           7
	//*  69  134:invokevirtual   #550 <Method int PdfObject.type()>
	//*  70  137:tableswitch     3 5: default 164
	//	               3 200
	//	               4 166
	//	               5 187
	//*  71  164:aload_3         
	//*  72  165:astore_1        
	//*  73  166:aload_1         
	//*  74  167:ifnull          180
	//*  75  170:aload           5
	//*  76  172:aload_1         
	//*  77  173:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//*  78  176:invokevirtual   #990 <Method boolean HashSet.add(Object)>
	//*  79  179:pop             
	//*  80  180:iload_2         
	//*  81  181:iconst_1        
	//*  82  182:iadd            
	//*  83  183:istore_2        
	//*  84  184:goto            111
	//*  85  187:aload           7
	//*  86  189:checkcast       #297 <Class PdfArray>
	//*  87  192:iconst_1        
	//*  88  193:invokevirtual   #966 <Method PdfString PdfArray.getAsString(int)>
	//*  89  196:astore_1        
	//*  90  197:goto            166
	//*  91  200:aload           7
	//*  92  202:checkcast       #315 <Class PdfString>
	//*  93  205:astore_1        
	//*  94  206:goto            166
	//*  95  209:aload_1         
	//*  96  210:getstatic       #993 <Field PdfName PdfName.N>
	//*  97  213:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//*  98  216:astore_1        
				if((s = ((String) (((PdfDictionary) (s)).getAsDict(PdfName.N)))) != null)
	//*  99  217:aload_1         
	//* 100  218:ifnull          88
				{
					s = ((String) (((PdfDictionary) (s)).getKeys().iterator()));
	//  101  221:aload_1         
	//  102  222:invokevirtual   #996 <Method Set PdfDictionary.getKeys()>
	//  103  225:invokeinterface #708 <Method Iterator Set.iterator()>
	//  104  230:astore_1        
					while(((Iterator) (s)).hasNext()) 
	//* 105  231:aload_1         
	//* 106  232:invokeinterface #713 <Method boolean Iterator.hasNext()>
	//* 107  237:ifeq            88
						((HashSet) (linkedhashset)).add(((Object) (PdfName.decodeName(((PdfName)((Iterator) (s)).next()).toString()))));
	//  108  240:aload           5
	//  109  242:aload_1         
	//  110  243:invokeinterface #717 <Method Object Iterator.next()>
	//  111  248:checkcast       #183 <Class PdfName>
	//  112  251:invokevirtual   #997 <Method String PdfName.toString()>
	//  113  254:invokestatic    #1000 <Method String PdfName.decodeName(String)>
	//  114  257:invokevirtual   #990 <Method boolean HashSet.add(Object)>
	//  115  260:pop             
				}
			i++;
		} while(true);
		break MISSING_BLOCK_LABEL_264;
	//  116  261:goto            231
_L2:
		pdfarray = ((PdfDictionary) (s)).getAsArray(PdfName.OPT);
		if(pdfarray == null) goto _L4; else goto _L3
_L3:
		i = 0;
_L10:
		if(i >= pdfarray.size()) goto _L4; else goto _L5
_L5:
		pdfobject = pdfarray.getDirectObject(i);
		obj = null;
		s = ((String) (obj));
		pdfobject.type();
		JVM INSTR tableswitch 3 5: default 164
	//	               3 200
	//	               4 166
	//	               5 187;
		   goto _L6 _L7 _L8 _L9
_L7:
		break MISSING_BLOCK_LABEL_200;
_L8:
		break; /* Loop/switch isn't completed */
_L6:
		s = ((String) (obj));
_L11:
		if(s != null)
			((HashSet) (linkedhashset)).add(((Object) (((PdfString) (s)).toUnicodeString())));
		i++;
		  goto _L10
_L9:
		s = ((String) (((PdfArray)pdfobject).getAsString(1)));
		  goto _L11
		s = ((String) ((PdfString)pdfobject));
		  goto _L11
		return (String[])((HashSet) (linkedhashset)).toArray(((Object []) (new String[((HashSet) (linkedhashset)).size()])));
	//  117  264:aload           5
	//  118  266:aload           5
	//  119  268:invokevirtual   #1001 <Method int HashSet.size()>
	//  120  271:anewarray       String[]
	//  121  274:invokevirtual   #1005 <Method Object[] HashSet.toArray(Object[])>
	//  122  277:checkcast       #594 <Class String[]>
	//  123  280:areturn         
	}

	public ArrayList getBlankSignatureNames()
	{
		getSignatureNames();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #489 <Method ArrayList getSignatureNames()>
	//    2    4:pop             
		ArrayList arraylist = new ArrayList();
	//    3    5:new             #369 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #370 <Method void ArrayList()>
	//    6   12:astore_1        
		Iterator iterator = fields.entrySet().iterator();
	//    7   13:aload_0         
	//    8   14:getfield        #494 <Field Map fields>
	//    9   17:invokeinterface #702 <Method Set Map.entrySet()>
	//   10   22:invokeinterface #708 <Method Iterator Set.iterator()>
	//   11   27:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   28:aload_2         
	//   13   29:invokeinterface #713 <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            109
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   15   37:aload_2         
	//   16   38:invokeinterface #717 <Method Object Iterator.next()>
	//   17   43:checkcast       #719 <Class java.util.Map$Entry>
	//   18   46:astore_3        
			PdfDictionary pdfdictionary = ((Item)entry.getValue()).getMerged(0);
	//   19   47:aload_3         
	//   20   48:invokeinterface #721 <Method Object java.util.Map$Entry.getValue()>
	//   21   53:checkcast       #14  <Class AcroFields$Item>
	//   22   56:iconst_0        
	//   23   57:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   24   60:astore          4
			if(PdfName.SIG.equals(((Object) (pdfdictionary.getAsName(PdfName.FT)))) && !sigNames.containsKey(entry.getKey()))
	//*  25   62:getstatic       #1008 <Field PdfName PdfName.SIG>
	//*  26   65:aload           4
	//*  27   67:getstatic       #875 <Field PdfName PdfName.FT>
	//*  28   70:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  29   73:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  30   76:ifeq            28
	//*  31   79:aload_0         
	//*  32   80:getfield        #485 <Field HashMap sigNames>
	//*  33   83:aload_3         
	//*  34   84:invokeinterface #724 <Method Object java.util.Map$Entry.getKey()>
	//*  35   89:invokevirtual   #492 <Method boolean HashMap.containsKey(Object)>
	//*  36   92:ifne            28
				arraylist.add(entry.getKey());
	//   37   95:aload_1         
	//   38   96:aload_3         
	//   39   97:invokeinterface #724 <Method Object java.util.Map$Entry.getKey()>
	//   40  102:invokevirtual   #436 <Method boolean ArrayList.add(Object)>
	//   41  105:pop             
		} while(true);
	//   42  106:goto            28
		return arraylist;
	//   43  109:aload_1         
	//   44  110:areturn         
	}

	public String getField(String s)
	{
		if(!xfa.isXfaPresent()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field XfaForm xfa>
	//    2    4:invokevirtual   #1013 <Method boolean XfaForm.isXfaPresent()>
	//    3    7:ifeq            45
_L1:
		s = xfa.findFieldName(s, this);
	//    4   10:aload_0         
	//    5   11:getfield        #225 <Field XfaForm xfa>
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #1017 <Method String XfaForm.findFieldName(String, AcroFields)>
	//    9   19:astore_1        
		if(s != null) goto _L4; else goto _L3
	//   10   20:aload_1         
	//   11   21:ifnonnull       28
_L3:
		Object obj = null;
	//   12   24:aconst_null     
	//   13   25:astore_3        
_L6:
		return ((String) (obj));
	//   14   26:aload_3         
	//   15   27:areturn         
_L4:
		s = XfaForm.Xml2Som.getShortName(s);
	//   16   28:aload_1         
	//   17   29:invokestatic    #1022 <Method String XfaForm$Xml2Som.getShortName(String)>
	//   18   32:astore_1        
		return XfaForm.getNodeText(xfa.findDatasetsNode(s));
	//   19   33:aload_0         
	//   20   34:getfield        #225 <Field XfaForm xfa>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #1026 <Method Node XfaForm.findDatasetsNode(String)>
	//   23   41:invokestatic    #1030 <Method String XfaForm.getNodeText(Node)>
	//   24   44:areturn         
_L2:
		Object obj1;
		obj = ((Object) ((Item)fields.get(((Object) (s)))));
	//   25   45:aload_0         
	//   26   46:getfield        #494 <Field Map fields>
	//   27   49:aload_1         
	//   28   50:invokeinterface #499 <Method Object Map.get(Object)>
	//   29   55:checkcast       #14  <Class AcroFields$Item>
	//   30   58:astore_3        
		if(obj == null)
	//*  31   59:aload_3         
	//*  32   60:ifnonnull       65
			return null;
	//   33   63:aconst_null     
	//   34   64:areturn         
		lastWasString = false;
	//   35   65:aload_0         
	//   36   66:iconst_0        
	//   37   67:putfield        #730 <Field boolean lastWasString>
		s = ((String) (((Item) (obj)).getMerged(0)));
	//   38   70:aload_3         
	//   39   71:iconst_0        
	//   40   72:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   41   75:astore_1        
		obj1 = ((Object) (PdfReader.getPdfObject(((PdfDictionary) (s)).get(PdfName.V))));
	//   42   76:aload_1         
	//   43   77:getstatic       #264 <Field PdfName PdfName.V>
	//   44   80:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//   45   83:invokestatic    #576 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   46   86:astore          4
		if(obj1 == null)
	//*  47   88:aload           4
	//*  48   90:ifnonnull       97
			return "";
	//   49   93:ldc2            #324 <String "">
	//   50   96:areturn         
		if(obj1 instanceof PRStream)
	//*  51   97:aload           4
	//*  52   99:instanceof      #584 <Class PRStream>
	//*  53  102:ifeq            133
		{
			try
			{
				s = new String(PdfReader.getStreamBytes((PRStream)obj1));
	//   54  105:new             #87  <Class String>
	//   55  108:dup             
	//   56  109:aload           4
	//   57  111:checkcast       #584 <Class PRStream>
	//   58  114:invokestatic    #674 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//   59  117:invokespecial   #1033 <Method void String(byte[])>
	//   60  120:astore_1        
			}
	//*  61  121:aload_1         
	//*  62  122:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  63  123:astore_1        
			{
				throw new ExceptionConverter(((Exception) (s)));
	//   64  124:new             #238 <Class ExceptionConverter>
	//   65  127:dup             
	//   66  128:aload_1         
	//   67  129:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//   68  132:athrow          
			}
			return s;
		}
		PdfName pdfname = ((PdfDictionary) (s)).getAsName(PdfName.FT);
	//   69  133:aload_1         
	//   70  134:getstatic       #875 <Field PdfName PdfName.FT>
	//   71  137:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   72  140:astore          5
		if(!PdfName.BTN.equals(((Object) (pdfname))))
			break MISSING_BLOCK_LABEL_272;
	//   73  142:getstatic       #878 <Field PdfName PdfName.BTN>
	//   74  145:aload           5
	//   75  147:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//   76  150:ifeq            272
		s = ((String) (((PdfDictionary) (s)).getAsNumber(PdfName.FF)));
	//   77  153:aload_1         
	//   78  154:getstatic       #192 <Field PdfName PdfName.FF>
	//   79  157:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   80  160:astore_1        
		int i = 0;
	//   81  161:iconst_0        
	//   82  162:istore_2        
		if(s != null)
	//*  83  163:aload_1         
	//*  84  164:ifnull          172
			i = ((PdfNumber) (s)).intValue();
	//   85  167:aload_1         
	//   86  168:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//   87  171:istore_2        
		if((0x10000 & i) != 0)
	//*  88  172:ldc2            #1034 <Int 0x10000>
	//*  89  175:iload_2         
	//*  90  176:iand            
	//*  91  177:ifeq            184
			return "";
	//   92  180:ldc2            #324 <String "">
	//   93  183:areturn         
		s = "";
	//   94  184:ldc2            #324 <String "">
	//   95  187:astore_1        
		if(obj1 instanceof PdfName)
	//*  96  188:aload           4
	//*  97  190:instanceof      #183 <Class PdfName>
	//*  98  193:ifeq            252
			s = PdfName.decodeName(((PdfObject) (obj1)).toString());
	//   99  196:aload           4
	//  100  198:invokevirtual   #322 <Method String PdfObject.toString()>
	//  101  201:invokestatic    #1000 <Method String PdfName.decodeName(String)>
	//  102  204:astore_1        
		else
	//* 103  205:aload_3         
	//* 104  206:iconst_0        
	//* 105  207:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//* 106  210:getstatic       #291 <Field PdfName PdfName.OPT>
	//* 107  213:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 108  216:astore          4
	//* 109  218:aload_1         
	//* 110  219:astore_3        
	//* 111  220:aload           4
	//* 112  222:ifnull          26
	//* 113  225:aload_1         
	//* 114  226:astore_3        
	//* 115  227:aload           4
	//* 116  229:aload_1         
	//* 117  230:invokestatic    #1038 <Method int Integer.parseInt(String)>
	//* 118  233:invokevirtual   #966 <Method PdfString PdfArray.getAsString(int)>
	//* 119  236:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//* 120  239:astore_1        
	//* 121  240:aload_1         
	//* 122  241:astore_3        
	//* 123  242:aload_0         
	//* 124  243:iconst_1        
	//* 125  244:putfield        #730 <Field boolean lastWasString>
	//* 126  247:aload_1         
	//* 127  248:areturn         
	//* 128  249:astore_1        
	//* 129  250:aload_3         
	//* 130  251:areturn         
		if(obj1 instanceof PdfString)
	//* 131  252:aload           4
	//* 132  254:instanceof      #315 <Class PdfString>
	//* 133  257:ifeq            205
			s = ((PdfString)obj1).toUnicodeString();
	//  134  260:aload           4
	//  135  262:checkcast       #315 <Class PdfString>
	//  136  265:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  137  268:astore_1        
		obj1 = ((Object) (((Item) (obj)).getValue(0).getAsArray(PdfName.OPT)));
		obj = ((Object) (s));
		if(obj1 == null) goto _L6; else goto _L5
_L5:
		obj = ((Object) (s));
		try
		{
			s = ((PdfArray) (obj1)).getAsString(Integer.parseInt(s)).toUnicodeString();
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return ((String) (obj));
		}
		obj = ((Object) (s));
		lastWasString = true;
		return s;
	//* 138  269:goto            205
		if(obj1 instanceof PdfString)
	//* 139  272:aload           4
	//* 140  274:instanceof      #315 <Class PdfString>
	//* 141  277:ifeq            294
		{
			lastWasString = true;
	//  142  280:aload_0         
	//  143  281:iconst_1        
	//  144  282:putfield        #730 <Field boolean lastWasString>
			return ((PdfString)obj1).toUnicodeString();
	//  145  285:aload           4
	//  146  287:checkcast       #315 <Class PdfString>
	//  147  290:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  148  293:areturn         
		}
		if(obj1 instanceof PdfName)
	//* 149  294:aload           4
	//* 150  296:instanceof      #183 <Class PdfName>
	//* 151  299:ifeq            311
			return PdfName.decodeName(((PdfObject) (obj1)).toString());
	//  152  302:aload           4
	//  153  304:invokevirtual   #322 <Method String PdfObject.toString()>
	//  154  307:invokestatic    #1000 <Method String PdfName.decodeName(String)>
	//  155  310:areturn         
		else
			return "";
	//  156  311:ldc2            #324 <String "">
	//  157  314:areturn         
	}

	public Map getFieldCache()
	{
		return fieldCache;
	//    0    0:aload_0         
	//    1    1:getfield        #919 <Field Map fieldCache>
	//    2    4:areturn         
	}

	public Item getFieldItem(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(xfa.isXfaPresent())
	//*   2    2:aload_0         
	//*   3    3:getfield        #225 <Field XfaForm xfa>
	//*   4    6:invokevirtual   #1013 <Method boolean XfaForm.isXfaPresent()>
	//*   5    9:ifeq            30
		{
			s = xfa.findFieldName(s, this);
	//    6   12:aload_0         
	//    7   13:getfield        #225 <Field XfaForm xfa>
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #1017 <Method String XfaForm.findFieldName(String, AcroFields)>
	//   11   21:astore_1        
			s1 = s;
	//   12   22:aload_1         
	//   13   23:astore_2        
			if(s == null)
	//*  14   24:aload_1         
	//*  15   25:ifnonnull       30
				return null;
	//   16   28:aconst_null     
	//   17   29:areturn         
		}
		return (Item)fields.get(((Object) (s1)));
	//   18   30:aload_0         
	//   19   31:getfield        #494 <Field Map fields>
	//   20   34:aload_2         
	//   21   35:invokeinterface #499 <Method Object Map.get(Object)>
	//   22   40:checkcast       #14  <Class AcroFields$Item>
	//   23   43:areturn         
	}

	public List getFieldPositions(String s)
	{
		Item item = getFieldItem(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #284 <Method AcroFields$Item getFieldItem(String)>
	//    3    5:astore          7
		if(item != null) goto _L2; else goto _L1
	//    4    7:aload           7
	//    5    9:ifnonnull       16
_L1:
		s = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
_L4:
		return ((List) (s));
	//    8   14:aload_1         
	//    9   15:areturn         
_L2:
		int i;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//   10   16:new             #369 <Class ArrayList>
	//   11   19:dup             
	//   12   20:invokespecial   #370 <Method void ArrayList()>
	//   13   23:astore          6
		i = 0;
	//   14   25:iconst_0        
	//   15   26:istore_2        
_L13:
		s = ((String) (arraylist));
	//   16   27:aload           6
	//   17   29:astore_1        
		if(i >= item.size()) goto _L4; else goto _L3
	//   18   30:iload_2         
	//   19   31:aload           7
	//   20   33:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//   21   36:icmpge          14
_L3:
		s = ((String) (item.getWidget(i).getAsArray(PdfName.RECT)));
	//   22   39:aload           7
	//   23   41:iload_2         
	//   24   42:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//   25   45:getstatic       #889 <Field PdfName PdfName.RECT>
	//   26   48:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   27   51:astore_1        
		if(s != null) goto _L6; else goto _L5
	//   28   52:aload_1         
	//   29   53:ifnonnull       59
	//*  30   56:goto            306
_L6:
		int j;
		int k;
		FieldPosition fieldposition;
		s = ((String) (PdfReader.getNormalizedRectangle(((PdfArray) (s)))));
	//   31   59:aload_1         
	//   32   60:invokestatic    #893 <Method Rectangle PdfReader.getNormalizedRectangle(PdfArray)>
	//   33   63:astore_1        
		j = item.getPage(i).intValue();
	//   34   64:aload           7
	//   35   66:iload_2         
	//   36   67:invokevirtual   #1046 <Method Integer AcroFields$Item.getPage(int)>
	//   37   70:invokevirtual   #1047 <Method int Integer.intValue()>
	//   38   73:istore_3        
		k = reader.getPageRotation(j);
	//   39   74:aload_0         
	//   40   75:getfield        #216 <Field PdfReader reader>
	//   41   78:iload_3         
	//   42   79:invokevirtual   #1051 <Method int PdfReader.getPageRotation(int)>
	//   43   82:istore          4
		fieldposition = new FieldPosition();
	//   44   84:new             #8   <Class AcroFields$FieldPosition>
	//   45   87:dup             
	//   46   88:invokespecial   #1052 <Method void AcroFields$FieldPosition()>
	//   47   91:astore          8
		fieldposition.page = j;
	//   48   93:aload           8
	//   49   95:iload_3         
	//   50   96:putfield        #1055 <Field int AcroFields$FieldPosition.page>
		Object obj = ((Object) (s));
	//   51   99:aload_1         
	//   52  100:astore          5
		if(k == 0) goto _L8; else goto _L7
	//   53  102:iload           4
	//   54  104:ifeq            159
_L7:
		obj = ((Object) (reader.getPageSize(j)));
	//   55  107:aload_0         
	//   56  108:getfield        #216 <Field PdfReader reader>
	//   57  111:iload_3         
	//   58  112:invokevirtual   #1059 <Method Rectangle PdfReader.getPageSize(int)>
	//   59  115:astore          5
		k;
	//   60  117:iload           4
		JVM INSTR lookupswitch 3: default 313
	//	               90: 267
	//	               180: 216
	//	               270: 177;
	//   61  119:lookupswitch    3: default 313
	//	               90: 267
	//	               180: 216
	//	               270: 177
		   goto _L9 _L10 _L11 _L12
_L9:
		((Rectangle) (s)).normalize();
	//   62  152:aload_1         
	//   63  153:invokevirtual   #1062 <Method void Rectangle.normalize()>
		obj = ((Object) (s));
	//   64  156:aload_1         
	//   65  157:astore          5
_L8:
		try
		{
			fieldposition.position = ((Rectangle) (obj));
	//   66  159:aload           8
	//   67  161:aload           5
	//   68  163:putfield        #1066 <Field Rectangle AcroFields$FieldPosition.position>
			arraylist.add(((Object) (fieldposition)));
	//   69  166:aload           6
	//   70  168:aload           8
	//   71  170:invokevirtual   #436 <Method boolean ArrayList.add(Object)>
	//   72  173:pop             
		}
	//*  73  174:goto            306
	//*  74  177:new             #898 <Class Rectangle>
	//*  75  180:dup             
	//*  76  181:aload           5
	//*  77  183:invokevirtual   #1069 <Method float Rectangle.getTop()>
	//*  78  186:aload_1         
	//*  79  187:invokevirtual   #1072 <Method float Rectangle.getBottom()>
	//*  80  190:fsub            
	//*  81  191:aload_1         
	//*  82  192:invokevirtual   #1075 <Method float Rectangle.getLeft()>
	//*  83  195:aload           5
	//*  84  197:invokevirtual   #1069 <Method float Rectangle.getTop()>
	//*  85  200:aload_1         
	//*  86  201:invokevirtual   #1069 <Method float Rectangle.getTop()>
	//*  87  204:fsub            
	//*  88  205:aload_1         
	//*  89  206:invokevirtual   #1078 <Method float Rectangle.getRight()>
	//*  90  209:invokespecial   #1079 <Method void Rectangle(float, float, float, float)>
	//*  91  212:astore_1        
	//*  92  213:goto            152
	//*  93  216:new             #898 <Class Rectangle>
	//*  94  219:dup             
	//*  95  220:aload           5
	//*  96  222:invokevirtual   #1078 <Method float Rectangle.getRight()>
	//*  97  225:aload_1         
	//*  98  226:invokevirtual   #1075 <Method float Rectangle.getLeft()>
	//*  99  229:fsub            
	//* 100  230:aload           5
	//* 101  232:invokevirtual   #1069 <Method float Rectangle.getTop()>
	//* 102  235:aload_1         
	//* 103  236:invokevirtual   #1072 <Method float Rectangle.getBottom()>
	//* 104  239:fsub            
	//* 105  240:aload           5
	//* 106  242:invokevirtual   #1078 <Method float Rectangle.getRight()>
	//* 107  245:aload_1         
	//* 108  246:invokevirtual   #1078 <Method float Rectangle.getRight()>
	//* 109  249:fsub            
	//* 110  250:aload           5
	//* 111  252:invokevirtual   #1069 <Method float Rectangle.getTop()>
	//* 112  255:aload_1         
	//* 113  256:invokevirtual   #1069 <Method float Rectangle.getTop()>
	//* 114  259:fsub            
	//* 115  260:invokespecial   #1079 <Method void Rectangle(float, float, float, float)>
	//* 116  263:astore_1        
	//* 117  264:goto            152
	//* 118  267:new             #898 <Class Rectangle>
	//* 119  270:dup             
	//* 120  271:aload_1         
	//* 121  272:invokevirtual   #1072 <Method float Rectangle.getBottom()>
	//* 122  275:aload           5
	//* 123  277:invokevirtual   #1078 <Method float Rectangle.getRight()>
	//* 124  280:aload_1         
	//* 125  281:invokevirtual   #1075 <Method float Rectangle.getLeft()>
	//* 126  284:fsub            
	//* 127  285:aload_1         
	//* 128  286:invokevirtual   #1069 <Method float Rectangle.getTop()>
	//* 129  289:aload           5
	//* 130  291:invokevirtual   #1078 <Method float Rectangle.getRight()>
	//* 131  294:aload_1         
	//* 132  295:invokevirtual   #1078 <Method float Rectangle.getRight()>
	//* 133  298:fsub            
	//* 134  299:invokespecial   #1079 <Method void Rectangle(float, float, float, float)>
	//* 135  302:astore_1        
	//* 136  303:goto            152
	//* 137  306:iload_2         
	//* 138  307:iconst_1        
	//* 139  308:iadd            
	//* 140  309:istore_2        
	//* 141  310:goto            27
	//* 142  313:goto            152
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//  143  316:astore_1        
		break; /* Loop/switch isn't completed */
	//  144  317:goto            306
_L12:
		s = ((String) (new Rectangle(((Rectangle) (obj)).getTop() - ((Rectangle) (s)).getBottom(), ((Rectangle) (s)).getLeft(), ((Rectangle) (obj)).getTop() - ((Rectangle) (s)).getTop(), ((Rectangle) (s)).getRight())));
		continue; /* Loop/switch isn't completed */
_L11:
		s = ((String) (new Rectangle(((Rectangle) (obj)).getRight() - ((Rectangle) (s)).getLeft(), ((Rectangle) (obj)).getTop() - ((Rectangle) (s)).getBottom(), ((Rectangle) (obj)).getRight() - ((Rectangle) (s)).getRight(), ((Rectangle) (obj)).getTop() - ((Rectangle) (s)).getTop())));
		continue; /* Loop/switch isn't completed */
_L10:
		s = ((String) (new Rectangle(((Rectangle) (s)).getBottom(), ((Rectangle) (obj)).getRight() - ((Rectangle) (s)).getLeft(), ((Rectangle) (s)).getTop(), ((Rectangle) (obj)).getRight() - ((Rectangle) (s)).getRight())));
		if(true) goto _L9; else goto _L5
_L5:
		i++;
		  goto _L13
	}

	public String getFieldRichValue(String s)
	{
		if(!xfa.isXfaPresent())
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field XfaForm xfa>
	//*   2    4:invokevirtual   #1013 <Method boolean XfaForm.isXfaPresent()>
	//*   3    7:ifeq            12
	//*   4   10:aconst_null     
	//*   5   11:areturn         
	//*   6   12:aload_0         
	//*   7   13:getfield        #494 <Field Map fields>
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #499 <Method Object Map.get(Object)>
	//*  10   22:checkcast       #14  <Class AcroFields$Item>
	//*  11   25:astore_1        
			if((s = ((String) ((Item)fields.get(((Object) (s)))))) != null && (s = ((String) (((Item) (s)).getMerged(0).getAsString(PdfName.RV)))) != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          10
	//*  14   30:aload_1         
	//*  15   31:iconst_0        
	//*  16   32:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//*  17   35:getstatic       #1084 <Field PdfName PdfName.RV>
	//*  18   38:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//*  19   41:astore_1        
	//*  20   42:aload_1         
	//*  21   43:ifnull          10
				return ((PdfString) (s)).toString();
	//   22   46:aload_1         
	//   23   47:invokevirtual   #1085 <Method String PdfString.toString()>
	//   24   50:areturn         
		return null;
	}

	public int getFieldType(String s)
	{
		s = ((String) (getFieldItem(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #284 <Method AcroFields$Item getFieldItem(String)>
	//    3    5:astore_1        
		if(s != null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
	//*   6   10:iconst_0        
	//*   7   11:ireturn         
		{
			Object obj = ((Object) (((Item) (s)).getMerged(0)));
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   11   17:astore_3        
			s = ((String) (((PdfDictionary) (obj)).getAsName(PdfName.FT)));
	//   12   18:aload_3         
	//   13   19:getstatic       #875 <Field PdfName PdfName.FT>
	//   14   22:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   15   25:astore_1        
			if(s != null)
	//*  16   26:aload_1         
	//*  17   27:ifnull          10
			{
				int i = 0;
	//   18   30:iconst_0        
	//   19   31:istore_2        
				obj = ((Object) (((PdfDictionary) (obj)).getAsNumber(PdfName.FF)));
	//   20   32:aload_3         
	//   21   33:getstatic       #192 <Field PdfName PdfName.FF>
	//   22   36:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   23   39:astore_3        
				if(obj != null)
	//*  24   40:aload_3         
	//*  25   41:ifnull          49
					i = ((PdfNumber) (obj)).intValue();
	//   26   44:aload_3         
	//   27   45:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//   28   48:istore_2        
				if(PdfName.BTN.equals(((Object) (s))))
	//*  29   49:getstatic       #878 <Field PdfName PdfName.BTN>
	//*  30   52:aload_1         
	//*  31   53:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  32   56:ifeq            81
				{
					if((0x10000 & i) != 0)
	//*  33   59:ldc2            #1034 <Int 0x10000>
	//*  34   62:iload_2         
	//*  35   63:iand            
	//*  36   64:ifeq            69
						return 1;
	//   37   67:iconst_1        
	//   38   68:ireturn         
					return (0x8000 & i) == 0 ? 2 : 3;
	//   39   69:ldc2            #879 <Int 32768>
	//   40   72:iload_2         
	//   41   73:iand            
	//   42   74:ifeq            79
	//   43   77:iconst_3        
	//   44   78:ireturn         
	//   45   79:iconst_2        
	//   46   80:ireturn         
				}
				if(PdfName.TX.equals(((Object) (s))))
	//*  47   81:getstatic       #940 <Field PdfName PdfName.TX>
	//*  48   84:aload_1         
	//*  49   85:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  50   88:ifeq            93
					return 4;
	//   51   91:iconst_4        
	//   52   92:ireturn         
				if(PdfName.CH.equals(((Object) (s))))
	//*  53   93:getstatic       #953 <Field PdfName PdfName.CH>
	//*  54   96:aload_1         
	//*  55   97:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  56  100:ifeq            116
					return (0x20000 & i) == 0 ? 5 : 6;
	//   57  103:ldc2            #963 <Int 0x20000>
	//   58  106:iload_2         
	//   59  107:iand            
	//   60  108:ifeq            114
	//   61  111:bipush          6
	//   62  113:ireturn         
	//   63  114:iconst_5        
	//   64  115:ireturn         
				if(PdfName.SIG.equals(((Object) (s))))
	//*  65  116:getstatic       #1008 <Field PdfName PdfName.SIG>
	//*  66  119:aload_1         
	//*  67  120:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  68  123:ifeq            10
					return 7;
	//   69  126:bipush          7
	//   70  128:ireturn         
			}
		}
		return 0;
	}

	public Map getFields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #494 <Field Map fields>
	//    2    4:areturn         
	}

	public String[] getListOptionDisplay(String s)
	{
		return getListOption(s, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #1091 <Method String[] getListOption(String, int)>
	//    4    6:areturn         
	}

	public String[] getListOptionExport(String s)
	{
		return getListOption(s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #1091 <Method String[] getListOption(String, int)>
	//    4    6:areturn         
	}

	public String[] getListSelection(String s)
	{
		Object obj = ((Object) (getField(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #728 <Method String getField(String)>
	//    3    5:astore          4
		String as[];
		if(obj == null)
	//*   4    7:aload           4
	//*   5    9:ifnonnull       39
		{
			as = new String[0];
	//    6   12:iconst_0        
	//    7   13:anewarray       String[]
	//    8   16:astore_3        
		} else
	//*   9   17:aload_0         
	//*  10   18:getfield        #494 <Field Map fields>
	//*  11   21:aload_1         
	//*  12   22:invokeinterface #499 <Method Object Map.get(Object)>
	//*  13   27:checkcast       #14  <Class AcroFields$Item>
	//*  14   30:astore          4
	//*  15   32:aload           4
	//*  16   34:ifnonnull       52
	//*  17   37:aload_3         
	//*  18   38:areturn         
		{
			as = new String[1];
	//   19   39:iconst_1        
	//   20   40:anewarray       String[]
	//   21   43:astore_3        
			as[0] = ((String) (obj));
	//   22   44:aload_3         
	//   23   45:iconst_0        
	//   24   46:aload           4
	//   25   48:aastore         
		}
		obj = ((Object) ((Item)fields.get(((Object) (s)))));
		if(obj == null)
			return as;
	//*  26   49:goto            17
		obj = ((Object) (((Item) (obj)).getMerged(0).getAsArray(PdfName.I)));
	//   27   52:aload           4
	//   28   54:iconst_0        
	//   29   55:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   30   58:getstatic       #682 <Field PdfName PdfName.I>
	//   31   61:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   32   64:astore          4
		if(obj == null)
	//*  33   66:aload           4
	//*  34   68:ifnonnull       73
			return as;
	//   35   71:aload_3         
	//   36   72:areturn         
		as = new String[((PdfArray) (obj)).size()];
	//   37   73:aload           4
	//   38   75:invokevirtual   #301 <Method int PdfArray.size()>
	//   39   78:anewarray       String[]
	//   40   81:astore_3        
		s = ((String) (getListOptionExport(s)));
	//   41   82:aload_0         
	//   42   83:aload_1         
	//   43   84:invokevirtual   #1095 <Method String[] getListOptionExport(String)>
	//   44   87:astore_1        
		int i = 0;
	//   45   88:iconst_0        
	//   46   89:istore_2        
		for(obj = ((Object) (((PdfArray) (obj)).listIterator())); ((Iterator) (obj)).hasNext();)
	//*  47   90:aload           4
	//*  48   92:invokevirtual   #1099 <Method java.util.ListIterator PdfArray.listIterator()>
	//*  49   95:astore          4
	//*  50   97:aload           4
	//*  51   99:invokeinterface #713 <Method boolean Iterator.hasNext()>
	//*  52  104:ifeq            132
		{
			as[i] = ((String) (s[((PdfNumber)((Iterator) (obj)).next()).intValue()]));
	//   53  107:aload_3         
	//   54  108:iload_2         
	//   55  109:aload_1         
	//   56  110:aload           4
	//   57  112:invokeinterface #717 <Method Object Iterator.next()>
	//   58  117:checkcast       #272 <Class PdfNumber>
	//   59  120:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//   60  123:aaload          
	//   61  124:aastore         
			i++;
	//   62  125:iload_2         
	//   63  126:iconst_1        
	//   64  127:iadd            
	//   65  128:istore_2        
		}

	//*  66  129:goto            97
		return as;
	//   67  132:aload_3         
	//   68  133:areturn         
	}

	BaseColor getMKColor(PdfArray pdfarray)
	{
		if(pdfarray == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		switch(pdfarray.size())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #301 <Method int PdfArray.size()>
		{
	//*   6   10:tableswitch     1 4: default 40
	//	               1 42
	//	               2 40
	//	               3 58
	//	               4 99
		case 2: // '\002'
		default:
			return null;
	//    7   40:aconst_null     
	//    8   41:areturn         

		case 1: // '\001'
			return ((BaseColor) (new GrayColor(pdfarray.getAsNumber(0).floatValue())));
	//    9   42:new             #416 <Class GrayColor>
	//   10   45:dup             
	//   11   46:aload_1         
	//   12   47:iconst_0        
	//   13   48:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   14   51:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//   15   54:invokespecial   #419 <Method void GrayColor(float)>
	//   16   57:areturn         

		case 3: // '\003'
			return new BaseColor(ExtendedColor.normalize(pdfarray.getAsNumber(0).floatValue()), ExtendedColor.normalize(pdfarray.getAsNumber(1).floatValue()), ExtendedColor.normalize(pdfarray.getAsNumber(2).floatValue()));
	//   17   58:new             #423 <Class BaseColor>
	//   18   61:dup             
	//   19   62:aload_1         
	//   20   63:iconst_0        
	//   21   64:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   22   67:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//   23   70:invokestatic    #1104 <Method float ExtendedColor.normalize(float)>
	//   24   73:aload_1         
	//   25   74:iconst_1        
	//   26   75:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   27   78:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//   28   81:invokestatic    #1104 <Method float ExtendedColor.normalize(float)>
	//   29   84:aload_1         
	//   30   85:iconst_2        
	//   31   86:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   32   89:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//   33   92:invokestatic    #1104 <Method float ExtendedColor.normalize(float)>
	//   34   95:invokespecial   #426 <Method void BaseColor(float, float, float)>
	//   35   98:areturn         

		case 4: // '\004'
			return ((BaseColor) (new CMYKColor(pdfarray.getAsNumber(0).floatValue(), pdfarray.getAsNumber(1).floatValue(), pdfarray.getAsNumber(2).floatValue(), pdfarray.getAsNumber(3).floatValue())));
	//   36   99:new             #430 <Class CMYKColor>
	//   37  102:dup             
	//   38  103:aload_1         
	//   39  104:iconst_0        
	//   40  105:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   41  108:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//   42  111:aload_1         
	//   43  112:iconst_1        
	//   44  113:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   45  116:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//   46  119:aload_1         
	//   47  120:iconst_2        
	//   48  121:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   49  124:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//   50  127:aload_1         
	//   51  128:iconst_3        
	//   52  129:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   53  132:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//   54  135:invokespecial   #433 <Method void CMYKColor(float, float, float, float)>
	//   55  138:areturn         
		}
	}

	public PushbuttonField getNewPushbuttonFromField(String s)
	{
		return getNewPushbuttonFromField(s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #1109 <Method PushbuttonField getNewPushbuttonFromField(String, int)>
	//    4    6:areturn         
	}

	public PushbuttonField getNewPushbuttonFromField(String s, int i)
	{
		if(getFieldType(s) != 1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #1111 <Method int getFieldType(String)>
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		Object obj = ((Object) (getFieldItem(s)));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #284 <Method AcroFields$Item getFieldItem(String)>
	//   10   16:astore          6
		Object obj2;
		if(i >= ((Item) (obj)).size())
	//*  11   18:iload_2         
	//*  12   19:aload           6
	//*  13   21:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//*  14   24:icmplt          29
			return null;
	//   15   27:aconst_null     
	//   16   28:areturn         
		float f;
		float f1;
		Object obj1;
		try
		{
			s = ((String) (((FieldPosition)getFieldPositions(s).get(i)).position));
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:invokevirtual   #1113 <Method List getFieldPositions(String)>
	//   20   34:iload_2         
	//   21   35:invokeinterface #1116 <Method Object List.get(int)>
	//   22   40:checkcast       #8   <Class AcroFields$FieldPosition>
	//   23   43:getfield        #1066 <Field Rectangle AcroFields$FieldPosition.position>
	//   24   46:astore_1        
			s = ((String) (new PushbuttonField(writer, ((Rectangle) (s)), ((String) (null)))));
	//   25   47:new             #1118 <Class PushbuttonField>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:getfield        #218 <Field PdfWriter writer>
	//   29   55:aload_1         
	//   30   56:aconst_null     
	//   31   57:invokespecial   #1119 <Method void PushbuttonField(PdfWriter, Rectangle, String)>
	//   32   60:astore_1        
			obj = ((Object) (((Item) (obj)).getMerged(i)));
	//   33   61:aload           6
	//   34   63:iload_2         
	//   35   64:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   36   67:astore          6
			decodeGenericDictionary(((PdfDictionary) (obj)), ((BaseField) (s)));
	//   37   69:aload_0         
	//   38   70:aload           6
	//   39   72:aload_1         
	//   40   73:invokevirtual   #886 <Method void decodeGenericDictionary(PdfDictionary, BaseField)>
			obj = ((Object) (((PdfDictionary) (obj)).getAsDict(PdfName.MK)));
	//   41   76:aload           6
	//   42   78:getstatic       #187 <Field PdfName PdfName.MK>
	//   43   81:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   44   84:astore          6
		}
	//*  45   86:aload           6
	//*  46   88:ifnull          386
	//*  47   91:aload           6
	//*  48   93:getstatic       #1122 <Field PdfName PdfName.CA>
	//*  49   96:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//*  50   99:astore          7
	//*  51  101:aload           7
	//*  52  103:ifnull          115
	//*  53  106:aload_1         
	//*  54  107:aload           7
	//*  55  109:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//*  56  112:invokevirtual   #1123 <Method void PushbuttonField.setText(String)>
	//*  57  115:aload           6
	//*  58  117:getstatic       #1126 <Field PdfName PdfName.TP>
	//*  59  120:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//*  60  123:astore          7
	//*  61  125:aload           7
	//*  62  127:ifnull          141
	//*  63  130:aload_1         
	//*  64  131:aload           7
	//*  65  133:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//*  66  136:iconst_1        
	//*  67  137:iadd            
	//*  68  138:invokevirtual   #1129 <Method void PushbuttonField.setLayout(int)>
	//*  69  141:aload           6
	//*  70  143:getstatic       #1132 <Field PdfName PdfName.IF>
	//*  71  146:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//*  72  149:astore          7
	//*  73  151:aload           7
	//*  74  153:ifnull          306
	//*  75  156:aload           7
	//*  76  158:getstatic       #1135 <Field PdfName PdfName.SW>
	//*  77  161:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  78  164:astore          8
	//*  79  166:aload           8
	//*  80  168:ifnull          191
	//*  81  171:iconst_1        
	//*  82  172:istore_2        
	//*  83  173:aload           8
	//*  84  175:getstatic       #680 <Field PdfName PdfName.B>
	//*  85  178:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  86  181:ifeq            350
	//*  87  184:iconst_3        
	//*  88  185:istore_2        
	//*  89  186:aload_1         
	//*  90  187:iload_2         
	//*  91  188:invokevirtual   #1138 <Method void PushbuttonField.setScaleIcon(int)>
	//*  92  191:aload           7
	//*  93  193:getstatic       #655 <Field PdfName PdfName.S>
	//*  94  196:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//*  95  199:astore          8
	//*  96  201:aload           8
	//*  97  203:ifnull          222
	//*  98  206:aload           8
	//*  99  208:getstatic       #1141 <Field PdfName PdfName.A>
	//* 100  211:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 101  214:ifeq            222
	//* 102  217:aload_1         
	//* 103  218:iconst_0        
	//* 104  219:invokevirtual   #1144 <Method void PushbuttonField.setProportionalIcon(boolean)>
	//* 105  222:aload           7
	//* 106  224:getstatic       #1141 <Field PdfName PdfName.A>
	//* 107  227:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 108  230:astore          8
	//* 109  232:aload           8
	//* 110  234:ifnull          278
	//* 111  237:aload           8
	//* 112  239:invokevirtual   #301 <Method int PdfArray.size()>
	//* 113  242:iconst_2        
	//* 114  243:icmpne          278
	//* 115  246:aload           8
	//* 116  248:iconst_0        
	//* 117  249:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 118  252:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//* 119  255:fstore_3        
	//* 120  256:aload           8
	//* 121  258:iconst_1        
	//* 122  259:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//* 123  262:invokevirtual   #652 <Method float PdfNumber.floatValue()>
	//* 124  265:fstore          4
	//* 125  267:aload_1         
	//* 126  268:fload_3         
	//* 127  269:invokevirtual   #1147 <Method void PushbuttonField.setIconHorizontalAdjustment(float)>
	//* 128  272:aload_1         
	//* 129  273:fload           4
	//* 130  275:invokevirtual   #1150 <Method void PushbuttonField.setIconVerticalAdjustment(float)>
	//* 131  278:aload           7
	//* 132  280:getstatic       #1153 <Field PdfName PdfName.FB>
	//* 133  283:invokevirtual   #771 <Method PdfBoolean PdfDictionary.getAsBoolean(PdfName)>
	//* 134  286:astore          7
	//* 135  288:aload           7
	//* 136  290:ifnull          306
	//* 137  293:aload           7
	//* 138  295:invokevirtual   #776 <Method boolean PdfBoolean.booleanValue()>
	//* 139  298:ifeq            306
	//* 140  301:aload_1         
	//* 141  302:iconst_1        
	//* 142  303:invokevirtual   #1156 <Method void PushbuttonField.setIconFitToBounds(boolean)>
	//* 143  306:aload           6
	//* 144  308:getstatic       #682 <Field PdfName PdfName.I>
	//* 145  311:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 146  314:astore          6
	//* 147  316:aload           6
	//* 148  318:ifnull          386
	//* 149  321:aload           6
	//* 150  323:invokevirtual   #330 <Method boolean PdfObject.isIndirect()>
	//* 151  326:ifeq            386
	//* 152  329:aload_1         
	//* 153  330:aload           6
	//* 154  332:checkcast       #552 <Class PRIndirectReference>
	//* 155  335:invokevirtual   #1160 <Method void PushbuttonField.setIconReference(PRIndirectReference)>
	//* 156  338:aload_1         
	//* 157  339:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 158  340:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//  159  341:new             #238 <Class ExceptionConverter>
	//  160  344:dup             
	//  161  345:aload_1         
	//  162  346:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//  163  349:athrow          
		}
		if(obj == null) goto _L2; else goto _L1
_L1:
		obj1 = ((Object) (((PdfDictionary) (obj)).getAsString(PdfName.CA)));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_115;
		((PushbuttonField) (s)).setText(((PdfString) (obj1)).toUnicodeString());
		obj1 = ((Object) (((PdfDictionary) (obj)).getAsNumber(PdfName.TP)));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_141;
		((PushbuttonField) (s)).setLayout(((PdfNumber) (obj1)).intValue() + 1);
		obj1 = ((Object) (((PdfDictionary) (obj)).getAsDict(PdfName.IF)));
		if(obj1 == null) goto _L4; else goto _L3
_L3:
		obj2 = ((Object) (((PdfDictionary) (obj1)).getAsName(PdfName.SW)));
		if(obj2 == null) goto _L6; else goto _L5
_L5:
		i = 1;
		if(!((PdfName) (obj2)).equals(((Object) (PdfName.B)))) goto _L8; else goto _L7
_L7:
		i = 3;
_L10:
		((PushbuttonField) (s)).setScaleIcon(i);
_L6:
		obj2 = ((Object) (((PdfDictionary) (obj1)).getAsName(PdfName.S)));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_222;
		if(((PdfName) (obj2)).equals(((Object) (PdfName.A))))
			((PushbuttonField) (s)).setProportionalIcon(false);
		obj2 = ((Object) (((PdfDictionary) (obj1)).getAsArray(PdfName.A)));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_278;
		if(((PdfArray) (obj2)).size() == 2)
		{
			f = ((PdfArray) (obj2)).getAsNumber(0).floatValue();
			f1 = ((PdfArray) (obj2)).getAsNumber(1).floatValue();
			((PushbuttonField) (s)).setIconHorizontalAdjustment(f);
			((PushbuttonField) (s)).setIconVerticalAdjustment(f1);
		}
		obj1 = ((Object) (((PdfDictionary) (obj1)).getAsBoolean(PdfName.FB)));
		if(obj1 == null) goto _L4; else goto _L9
_L9:
		if(((PdfBoolean) (obj1)).booleanValue())
			((PushbuttonField) (s)).setIconFitToBounds(true);
_L4:
		obj = ((Object) (((PdfDictionary) (obj)).get(PdfName.I)));
		if(obj == null)
			break; /* Loop/switch isn't completed */
		if(!((PdfObject) (obj)).isIndirect())
			break; /* Loop/switch isn't completed */
		((PushbuttonField) (s)).setIconReference((PRIndirectReference)obj);
		return ((PushbuttonField) (s));
_L8:
		if(((PdfName) (obj2)).equals(((Object) (PdfName.S))))
	//* 164  350:aload           8
	//* 165  352:getstatic       #655 <Field PdfName PdfName.S>
	//* 166  355:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 167  358:ifeq            366
		{
			i = 4;
	//  168  361:iconst_4        
	//  169  362:istore_2        
			continue; /* Loop/switch isn't completed */
	//  170  363:goto            186
		}
		boolean flag = ((PdfName) (obj2)).equals(((Object) (PdfName.N)));
	//  171  366:aload           8
	//  172  368:getstatic       #993 <Field PdfName PdfName.N>
	//  173  371:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//  174  374:istore          5
		if(flag)
	//* 175  376:iload           5
	//* 176  378:ifeq            186
			i = 2;
	//  177  381:iconst_2        
	//  178  382:istore_2        
		if(true) goto _L10; else goto _L2
	//  179  383:goto            186
_L2:
		return ((PushbuttonField) (s));
	//  180  386:aload_1         
	//  181  387:areturn         
	}

	public PdfIndirectReference getNormalAppearance(String s)
	{
		getSignatureNames();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #489 <Method ArrayList getSignatureNames()>
	//    2    4:pop             
		s = getTranslatedFieldName(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #744 <Method String getTranslatedFieldName(String)>
	//    6   10:astore_1        
		s = ((String) ((Item)fields.get(((Object) (s)))));
	//    7   11:aload_0         
	//    8   12:getfield        #494 <Field Map fields>
	//    9   15:aload_1         
	//   10   16:invokeinterface #499 <Method Object Map.get(Object)>
	//   11   21:checkcast       #14  <Class AcroFields$Item>
	//   12   24:astore_1        
		if(s == null)
	//*  13   25:aload_1         
	//*  14   26:ifnonnull       33
		{
			s = null;
	//   15   29:aconst_null     
	//   16   30:astore_1        
		} else
	//*  17   31:aload_1         
	//*  18   32:areturn         
		{
			s = ((String) (((Item) (s)).getMerged(0).getAsDict(PdfName.AP)));
	//   19   33:aload_1         
	//   20   34:iconst_0        
	//   21   35:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   22   38:getstatic       #252 <Field PdfName PdfName.AP>
	//   23   41:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   24   44:astore_1        
			if(s == null)
	//*  25   45:aload_1         
	//*  26   46:ifnonnull       51
				return null;
	//   27   49:aconst_null     
	//   28   50:areturn         
			PdfIndirectReference pdfindirectreference = ((PdfDictionary) (s)).getAsIndirectObject(PdfName.N);
	//   29   51:aload_1         
	//   30   52:getstatic       #993 <Field PdfName PdfName.N>
	//   31   55:invokevirtual   #1165 <Method PdfIndirectReference PdfDictionary.getAsIndirectObject(PdfName)>
	//   32   58:astore_2        
			s = ((String) (pdfindirectreference));
	//   33   59:aload_2         
	//   34   60:astore_1        
			if(pdfindirectreference == null)
	//*  35   61:aload_2         
	//*  36   62:ifnonnull       31
				return null;
	//   37   65:aconst_null     
	//   38   66:areturn         
		}
		return ((PdfIndirectReference) (s));
	}

	public int getRevision(String s)
	{
		getSignatureNames();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #489 <Method ArrayList getSignatureNames()>
	//    2    4:pop             
		s = getTranslatedFieldName(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #744 <Method String getTranslatedFieldName(String)>
	//    6   10:astore_1        
		if(!sigNames.containsKey(((Object) (s))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #485 <Field HashMap sigNames>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #492 <Method boolean HashMap.containsKey(Object)>
	//*  11   19:ifne            24
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		else
			return ((int[])sigNames.get(((Object) (s))))[1];
	//   14   24:aload_0         
	//   15   25:getfield        #485 <Field HashMap sigNames>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #571 <Method Object HashMap.get(Object)>
	//   18   32:checkcast       #746 <Class int[]>
	//   19   35:iconst_1        
	//   20   36:iaload          
	//   21   37:ireturn         
	}

	public PdfDictionary getSignatureDictionary(String s)
	{
		getSignatureNames();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #489 <Method ArrayList getSignatureNames()>
	//    2    4:pop             
		s = getTranslatedFieldName(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #744 <Method String getTranslatedFieldName(String)>
	//    6   10:astore_1        
		if(!sigNames.containsKey(((Object) (s))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #485 <Field HashMap sigNames>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #492 <Method boolean HashMap.containsKey(Object)>
	//*  11   19:ifne            24
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		else
			return ((Item)fields.get(((Object) (s)))).getMerged(0).getAsDict(PdfName.V);
	//   14   24:aload_0         
	//   15   25:getfield        #494 <Field Map fields>
	//   16   28:aload_1         
	//   17   29:invokeinterface #499 <Method Object Map.get(Object)>
	//   18   34:checkcast       #14  <Class AcroFields$Item>
	//   19   37:iconst_0        
	//   20   38:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   21   41:getstatic       #264 <Field PdfName PdfName.V>
	//   22   44:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   23   47:areturn         
	}

	public ArrayList getSignatureNames()
	{
		if(sigNames != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #485 <Field HashMap sigNames>
	//*   2    4:ifnull          19
			return new ArrayList(((java.util.Collection) (orderedSignatureNames)));
	//    3    7:new             #369 <Class ArrayList>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #1170 <Field ArrayList orderedSignatureNames>
	//    7   15:invokespecial   #1173 <Method void ArrayList(java.util.Collection)>
	//    8   18:areturn         
		sigNames = new HashMap();
	//    9   19:aload_0         
	//   10   20:new             #78  <Class HashMap>
	//   11   23:dup             
	//   12   24:invokespecial   #81  <Method void HashMap()>
	//   13   27:putfield        #485 <Field HashMap sigNames>
		orderedSignatureNames = new ArrayList();
	//   14   30:aload_0         
	//   15   31:new             #369 <Class ArrayList>
	//   16   34:dup             
	//   17   35:invokespecial   #370 <Method void ArrayList()>
	//   18   38:putfield        #1170 <Field ArrayList orderedSignatureNames>
		ArrayList arraylist = new ArrayList();
	//   19   41:new             #369 <Class ArrayList>
	//   20   44:dup             
	//   21   45:invokespecial   #370 <Method void ArrayList()>
	//   22   48:astore_3        
		Iterator iterator = fields.entrySet().iterator();
	//   23   49:aload_0         
	//   24   50:getfield        #494 <Field Map fields>
	//   25   53:invokeinterface #702 <Method Set Map.entrySet()>
	//   26   58:invokeinterface #708 <Method Iterator Set.iterator()>
	//   27   63:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   28   65:aload           4
	//   29   67:invokeinterface #713 <Method boolean Iterator.hasNext()>
	//   30   72:ifeq            234
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   31   75:aload           4
	//   32   77:invokeinterface #717 <Method Object Iterator.next()>
	//   33   82:checkcast       #719 <Class java.util.Map$Entry>
	//   34   85:astore          5
			Object obj = ((Object) (((Item)entry.getValue()).getMerged(0)));
	//   35   87:aload           5
	//   36   89:invokeinterface #721 <Method Object java.util.Map$Entry.getValue()>
	//   37   94:checkcast       #14  <Class AcroFields$Item>
	//   38   97:iconst_0        
	//   39   98:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   40  101:astore          6
			if(PdfName.SIG.equals(((Object) (((PdfDictionary) (obj)).get(PdfName.FT)))))
	//*  41  103:getstatic       #1008 <Field PdfName PdfName.SIG>
	//*  42  106:aload           6
	//*  43  108:getstatic       #875 <Field PdfName PdfName.FT>
	//*  44  111:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//*  45  114:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  46  117:ifeq            65
			{
				obj = ((Object) (((PdfDictionary) (obj)).getAsDict(PdfName.V)));
	//   47  120:aload           6
	//   48  122:getstatic       #264 <Field PdfName PdfName.V>
	//   49  125:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//   50  128:astore          6
				if(obj != null && ((PdfDictionary) (obj)).getAsString(PdfName.CONTENTS) != null)
	//*  51  130:aload           6
	//*  52  132:ifnull          65
	//*  53  135:aload           6
	//*  54  137:getstatic       #1176 <Field PdfName PdfName.CONTENTS>
	//*  55  140:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//*  56  143:ifnull          65
				{
					obj = ((Object) (((PdfDictionary) (obj)).getAsArray(PdfName.BYTERANGE)));
	//   57  146:aload           6
	//   58  148:getstatic       #441 <Field PdfName PdfName.BYTERANGE>
	//   59  151:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   60  154:astore          6
					if(obj != null)
	//*  61  156:aload           6
	//*  62  158:ifnull          65
					{
						int k = ((PdfArray) (obj)).size();
	//   63  161:aload           6
	//   64  163:invokevirtual   #301 <Method int PdfArray.size()>
	//   65  166:istore_2        
						if(k >= 2)
	//*  66  167:iload_2         
	//*  67  168:iconst_2        
	//*  68  169:icmplt          65
						{
							int i = ((PdfArray) (obj)).getAsNumber(k - 1).intValue();
	//   69  172:aload           6
	//   70  174:iload_2         
	//   71  175:iconst_1        
	//   72  176:isub            
	//   73  177:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   74  180:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//   75  183:istore_1        
							k = ((PdfArray) (obj)).getAsNumber(k - 2).intValue();
	//   76  184:aload           6
	//   77  186:iload_2         
	//   78  187:iconst_2        
	//   79  188:isub            
	//   80  189:invokevirtual   #688 <Method PdfNumber PdfArray.getAsNumber(int)>
	//   81  192:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//   82  195:istore_2        
							arraylist.add(((Object) (new Object[] {
								entry.getKey(), new int[] {
									i + k, 0
								}
							})));
	//   83  196:aload_3         
	//   84  197:iconst_2        
	//   85  198:anewarray       Object[]
	//   86  201:dup             
	//   87  202:iconst_0        
	//   88  203:aload           5
	//   89  205:invokeinterface #724 <Method Object java.util.Map$Entry.getKey()>
	//   90  210:aastore         
	//   91  211:dup             
	//   92  212:iconst_1        
	//   93  213:iconst_2        
	//   94  214:newarray        int[]
	//   95  216:dup             
	//   96  217:iconst_0        
	//   97  218:iload_1         
	//   98  219:iload_2         
	//   99  220:iadd            
	//  100  221:iastore         
	//  101  222:dup             
	//  102  223:iconst_1        
	//  103  224:iconst_0        
	//  104  225:iastore         
	//  105  226:aastore         
	//  106  227:invokevirtual   #436 <Method boolean ArrayList.add(Object)>
	//  107  230:pop             
						}
					}
				}
			}
		} while(true);
	//  108  231:goto            65
		Collections.sort(((List) (arraylist)), ((Comparator) (new SorterComparator())));
	//  109  234:aload_3         
	//  110  235:new             #17  <Class AcroFields$SorterComparator>
	//  111  238:dup             
	//  112  239:aconst_null     
	//  113  240:invokespecial   #1179 <Method void AcroFields$SorterComparator(AcroFields$1)>
	//  114  243:invokestatic    #1185 <Method void Collections.sort(List, Comparator)>
		if(!arraylist.isEmpty())
	//* 115  246:aload_3         
	//* 116  247:invokevirtual   #1188 <Method boolean ArrayList.isEmpty()>
	//* 117  250:ifne            386
		{
			int j;
			if((long)((int[])(int[])((Object[])arraylist.get(arraylist.size() - 1))[1])[0] == reader.getFileLength())
	//* 118  253:aload_3         
	//* 119  254:aload_3         
	//* 120  255:invokevirtual   #396 <Method int ArrayList.size()>
	//* 121  258:iconst_1        
	//* 122  259:isub            
	//* 123  260:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//* 124  263:checkcast       #1190 <Class Object[]>
	//* 125  266:iconst_1        
	//* 126  267:aaload          
	//* 127  268:checkcast       #746 <Class int[]>
	//* 128  271:checkcast       #746 <Class int[]>
	//* 129  274:iconst_0        
	//* 130  275:iaload          
	//* 131  276:i2l             
	//* 132  277:aload_0         
	//* 133  278:getfield        #216 <Field PdfReader reader>
	//* 134  281:invokevirtual   #1194 <Method long PdfReader.getFileLength()>
	//* 135  284:lcmp            
	//* 136  285:ifne            373
				totalRevisions = arraylist.size();
	//  137  288:aload_0         
	//  138  289:aload_3         
	//  139  290:invokevirtual   #396 <Method int ArrayList.size()>
	//  140  293:putfield        #1196 <Field int totalRevisions>
			else
	//* 141  296:iconst_0        
	//* 142  297:istore_1        
	//* 143  298:iload_1         
	//* 144  299:aload_3         
	//* 145  300:invokevirtual   #396 <Method int ArrayList.size()>
	//* 146  303:icmpge          386
	//* 147  306:aload_3         
	//* 148  307:iload_1         
	//* 149  308:invokevirtual   #400 <Method Object ArrayList.get(int)>
	//* 150  311:checkcast       #1190 <Class Object[]>
	//* 151  314:astore          5
	//* 152  316:aload           5
	//* 153  318:iconst_0        
	//* 154  319:aaload          
	//* 155  320:checkcast       #87  <Class String>
	//* 156  323:astore          4
	//* 157  325:aload           5
	//* 158  327:iconst_1        
	//* 159  328:aaload          
	//* 160  329:checkcast       #746 <Class int[]>
	//* 161  332:checkcast       #746 <Class int[]>
	//* 162  335:astore          5
	//* 163  337:aload           5
	//* 164  339:iconst_1        
	//* 165  340:iload_1         
	//* 166  341:iconst_1        
	//* 167  342:iadd            
	//* 168  343:iastore         
	//* 169  344:aload_0         
	//* 170  345:getfield        #485 <Field HashMap sigNames>
	//* 171  348:aload           4
	//* 172  350:aload           5
	//* 173  352:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//* 174  355:pop             
	//* 175  356:aload_0         
	//* 176  357:getfield        #1170 <Field ArrayList orderedSignatureNames>
	//* 177  360:aload           4
	//* 178  362:invokevirtual   #436 <Method boolean ArrayList.add(Object)>
	//* 179  365:pop             
	//* 180  366:iload_1         
	//* 181  367:iconst_1        
	//* 182  368:iadd            
	//* 183  369:istore_1        
	//* 184  370:goto            298
				totalRevisions = arraylist.size() + 1;
	//  185  373:aload_0         
	//  186  374:aload_3         
	//  187  375:invokevirtual   #396 <Method int ArrayList.size()>
	//  188  378:iconst_1        
	//  189  379:iadd            
	//  190  380:putfield        #1196 <Field int totalRevisions>
			for(j = 0; j < arraylist.size(); j++)
			{
				Object aobj[] = (Object[])arraylist.get(j);
				String s = (String)aobj[0];
				aobj = ((Object []) ((int[])(int[])aobj[1]));
				aobj[1] = j + 1;
				sigNames.put(((Object) (s)), ((Object) (aobj)));
				orderedSignatureNames.add(((Object) (s)));
			}

		}
	//* 191  383:goto            296
		return new ArrayList(((java.util.Collection) (orderedSignatureNames)));
	//  192  386:new             #369 <Class ArrayList>
	//  193  389:dup             
	//  194  390:aload_0         
	//  195  391:getfield        #1170 <Field ArrayList orderedSignatureNames>
	//  196  394:invokespecial   #1173 <Method void ArrayList(java.util.Collection)>
	//  197  397:areturn         
	}

	public ArrayList getSubstitutionFonts()
	{
		return substitutionFonts;
	//    0    0:aload_0         
	//    1    1:getfield        #481 <Field ArrayList substitutionFonts>
	//    2    4:areturn         
	}

	public int getTotalRevisions()
	{
		getSignatureNames();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #489 <Method ArrayList getSignatureNames()>
	//    2    4:pop             
		return totalRevisions;
	//    3    5:aload_0         
	//    4    6:getfield        #1196 <Field int totalRevisions>
	//    5    9:ireturn         
	}

	public String getTranslatedFieldName(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(xfa.isXfaPresent())
	//*   2    2:aload_0         
	//*   3    3:getfield        #225 <Field XfaForm xfa>
	//*   4    6:invokevirtual   #1013 <Method boolean XfaForm.isXfaPresent()>
	//*   5    9:ifeq            30
		{
			String s2 = xfa.findFieldName(s, this);
	//    6   12:aload_0         
	//    7   13:getfield        #225 <Field XfaForm xfa>
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #1017 <Method String XfaForm.findFieldName(String, AcroFields)>
	//   11   21:astore_3        
			s1 = s;
	//   12   22:aload_1         
	//   13   23:astore_2        
			if(s2 != null)
	//*  14   24:aload_3         
	//*  15   25:ifnull          30
				s1 = s2;
	//   16   28:aload_3         
	//   17   29:astore_2        
		}
		return s1;
	//   18   30:aload_2         
	//   19   31:areturn         
	}

	public XfaForm getXfa()
	{
		return xfa;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field XfaForm xfa>
	//    2    4:areturn         
	}

	public boolean isGenerateAppearances()
	{
		return generateAppearances;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field boolean generateAppearances>
	//    2    4:ireturn         
	}

	boolean isInAP(PdfDictionary pdfdictionary, PdfName pdfname)
	{
		return pdfdictionary != null && pdfdictionary.get(pdfname) != null;
	//    0    0:aload_1         
	//    1    1:ifnull          14
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//    5    9:ifnull          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public void mergeXfaData(Node node)
		throws IOException, DocumentException
	{
		node = ((Node) (new XfaForm.Xml2SomDatasets(node)));
	//    0    0:new             #1208 <Class XfaForm$Xml2SomDatasets>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #1210 <Method void XfaForm$Xml2SomDatasets(Node)>
	//    4    8:astore_1        
		String s;
		for(Iterator iterator = ((XfaForm.Xml2SomDatasets) (node)).getOrder().iterator(); iterator.hasNext(); setField(s, XfaForm.getNodeText((Node)((XfaForm.Xml2SomDatasets) (node)).getName2Node().get(((Object) (s))))))
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #1213 <Method ArrayList XfaForm$Xml2SomDatasets.getOrder()>
	//*   7   13:invokevirtual   #1214 <Method Iterator ArrayList.iterator()>
	//*   8   16:astore_2        
	//*   9   17:aload_2         
	//*  10   18:invokeinterface #713 <Method boolean Iterator.hasNext()>
	//*  11   23:ifeq            59
			s = (String)iterator.next();
	//   12   26:aload_2         
	//   13   27:invokeinterface #717 <Method Object Iterator.next()>
	//   14   32:checkcast       #87  <Class String>
	//   15   35:astore_3        

	//   16   36:aload_0         
	//   17   37:aload_3         
	//   18   38:aload_1         
	//   19   39:invokevirtual   #1218 <Method HashMap XfaForm$Xml2SomDatasets.getName2Node()>
	//   20   42:aload_3         
	//   21   43:invokevirtual   #571 <Method Object HashMap.get(Object)>
	//   22   46:checkcast       #1220 <Class Node>
	//   23   49:invokestatic    #1030 <Method String XfaForm.getNodeText(Node)>
	//   24   52:invokevirtual   #1223 <Method boolean setField(String, String)>
	//   25   55:pop             
	//*  26   56:goto            17
	//   27   59:return          
	}

	public boolean regenerateField(String s)
		throws IOException, DocumentException
	{
		String s1 = getField(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #728 <Method String getField(String)>
	//    3    5:astore_2        
		return setField(s, s1, s1);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:aload_2         
	//    8   10:invokevirtual   #1227 <Method boolean setField(String, String, String)>
	//    9   13:ireturn         
	}

	public boolean removeField(String s)
	{
		return removeField(s, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #1231 <Method boolean removeField(String, int)>
	//    4    6:ireturn         
	}

	public boolean removeField(String s, int i)
	{
		int j;
		Item item;
		PdfArray pdfarray;
		item = getFieldItem(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #284 <Method AcroFields$Item getFieldItem(String)>
	//    3    5:astore          8
		if(item == null)
	//*   4    7:aload           8
	//*   5    9:ifnonnull       14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		PdfDictionary pdfdictionary = (PdfDictionary)PdfReader.getPdfObject(reader.getCatalog().get(PdfName.ACROFORM), ((PdfObject) (reader.getCatalog())));
	//    8   14:aload_0         
	//    9   15:getfield        #216 <Field PdfReader reader>
	//   10   18:invokevirtual   #758 <Method PdfDictionary PdfReader.getCatalog()>
	//   11   21:getstatic       #761 <Field PdfName PdfName.ACROFORM>
	//   12   24:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//   13   27:aload_0         
	//   14   28:getfield        #216 <Field PdfReader reader>
	//   15   31:invokevirtual   #758 <Method PdfDictionary PdfReader.getCatalog()>
	//   16   34:invokestatic    #1233 <Method PdfObject PdfReader.getPdfObject(PdfObject, PdfObject)>
	//   17   37:checkcast       #254 <Class PdfDictionary>
	//   18   40:astore          5
		if(pdfdictionary == null)
	//*  19   42:aload           5
	//*  20   44:ifnonnull       49
			return false;
	//   21   47:iconst_0        
	//   22   48:ireturn         
		pdfarray = pdfdictionary.getAsArray(PdfName.FIELDS);
	//   23   49:aload           5
	//   24   51:getstatic       #783 <Field PdfName PdfName.FIELDS>
	//   25   54:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   26   57:astore          9
		if(pdfarray == null)
	//*  27   59:aload           9
	//*  28   61:ifnonnull       66
			return false;
	//   29   64:iconst_0        
	//   30   65:ireturn         
		j = 0;
	//   31   66:iconst_0        
	//   32   67:istore_3        
_L2:
		int k;
		if(j >= item.size())
			break MISSING_BLOCK_LABEL_304;
	//   33   68:iload_3         
	//   34   69:aload           8
	//   35   71:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//   36   74:icmpge          304
		k = item.getPage(j).intValue();
	//   37   77:aload           8
	//   38   79:iload_3         
	//   39   80:invokevirtual   #1046 <Method Integer AcroFields$Item.getPage(int)>
	//   40   83:invokevirtual   #1047 <Method int Integer.intValue()>
	//   41   86:istore          4
		if(i == -1 || i == k)
			break; /* Loop/switch isn't completed */
	//   42   88:iload_2         
	//   43   89:iconst_m1       
	//   44   90:icmpeq          110
	//   45   93:iload_2         
	//   46   94:iload           4
	//   47   96:icmpeq          110
		k = j;
	//   48   99:iload_3         
	//   49  100:istore          4
_L3:
		j = k + 1;
	//   50  102:iload           4
	//   51  104:iconst_1        
	//   52  105:iadd            
	//   53  106:istore_3        
		if(true) goto _L2; else goto _L1
	//   54  107:goto            68
_L1:
		Object obj;
		PdfIndirectReference pdfindirectreference;
		pdfindirectreference = item.getWidgetRef(j);
	//   55  110:aload           8
	//   56  112:iload_3         
	//   57  113:invokevirtual   #1236 <Method PdfIndirectReference AcroFields$Item.getWidgetRef(int)>
	//   58  116:astore          7
		PdfDictionary pdfdictionary1 = item.getWidget(j);
	//   59  118:aload           8
	//   60  120:iload_3         
	//   61  121:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//   62  124:astore          6
		PdfDictionary pdfdictionary2 = reader.getPageN(k);
	//   63  126:aload_0         
	//   64  127:getfield        #216 <Field PdfReader reader>
	//   65  130:iload           4
	//   66  132:invokevirtual   #1239 <Method PdfDictionary PdfReader.getPageN(int)>
	//   67  135:astore          10
		if(pdfdictionary2 != null)
	//*  68  137:aload           10
	//*  69  139:ifnull          276
			obj = ((Object) (pdfdictionary2.getAsArray(PdfName.ANNOTS)));
	//   70  142:aload           10
	//   71  144:getstatic       #792 <Field PdfName PdfName.ANNOTS>
	//   72  147:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   73  150:astore          5
		else
	//*  74  152:aload           5
	//*  75  154:ifnull          182
	//*  76  157:aload_0         
	//*  77  158:aload           5
	//*  78  160:aload           7
	//*  79  162:invokespecial   #1241 <Method int removeRefFromArray(PdfArray, PdfObject)>
	//*  80  165:ifne            282
	//*  81  168:aload           10
	//*  82  170:getstatic       #792 <Field PdfName PdfName.ANNOTS>
	//*  83  173:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
	//*  84  176:aload_0         
	//*  85  177:aload           10
	//*  86  179:invokespecial   #247 <Method void markUsed(PdfObject)>
	//*  87  182:aload           7
	//*  88  184:invokestatic    #1244 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//*  89  187:pop             
	//*  90  188:aload           7
	//*  91  190:astore          5
	//*  92  192:aload           6
	//*  93  194:getstatic       #832 <Field PdfName PdfName.PARENT>
	//*  94  197:invokevirtual   #1165 <Method PdfIndirectReference PdfDictionary.getAsIndirectObject(PdfName)>
	//*  95  200:astore          7
	//*  96  202:aload           7
	//*  97  204:ifnull          234
	//*  98  207:aload           6
	//*  99  209:getstatic       #832 <Field PdfName PdfName.PARENT>
	//* 100  212:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 101  215:astore          6
	//* 102  217:aload_0         
	//* 103  218:aload           6
	//* 104  220:getstatic       #866 <Field PdfName PdfName.KIDS>
	//* 105  223:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//* 106  226:aload           5
	//* 107  228:invokespecial   #1241 <Method int removeRefFromArray(PdfArray, PdfObject)>
	//* 108  231:ifeq            291
	//* 109  234:aload           7
	//* 110  236:ifnonnull       254
	//* 111  239:aload_0         
	//* 112  240:aload           9
	//* 113  242:aload           5
	//* 114  244:invokespecial   #1241 <Method int removeRefFromArray(PdfArray, PdfObject)>
	//* 115  247:pop             
	//* 116  248:aload_0         
	//* 117  249:aload           9
	//* 118  251:invokespecial   #247 <Method void markUsed(PdfObject)>
	//* 119  254:iload_3         
	//* 120  255:istore          4
	//* 121  257:iload_2         
	//* 122  258:iconst_m1       
	//* 123  259:icmpeq          102
	//* 124  262:aload           8
	//* 125  264:iload_3         
	//* 126  265:invokevirtual   #1246 <Method void AcroFields$Item.remove(int)>
	//* 127  268:iload_3         
	//* 128  269:iconst_1        
	//* 129  270:isub            
	//* 130  271:istore          4
	//* 131  273:goto            102
			obj = null;
	//  132  276:aconst_null     
	//  133  277:astore          5
		if(obj != null)
			if(removeRefFromArray(((PdfArray) (obj)), ((PdfObject) (pdfindirectreference))) == 0)
			{
				pdfdictionary2.remove(PdfName.ANNOTS);
				markUsed(((PdfObject) (pdfdictionary2)));
			} else
	//* 134  279:goto            152
			{
				markUsed(((PdfObject) (obj)));
	//  135  282:aload_0         
	//  136  283:aload           5
	//  137  285:invokespecial   #247 <Method void markUsed(PdfObject)>
			}
		PdfReader.killIndirect(((PdfObject) (pdfindirectreference)));
		obj = ((Object) (pdfindirectreference));
_L4:
label0:
		{
			pdfindirectreference = pdfdictionary1.getAsIndirectObject(PdfName.PARENT);
			if(pdfindirectreference != null)
			{
				pdfdictionary1 = pdfdictionary1.getAsDict(PdfName.PARENT);
				if(removeRefFromArray(pdfdictionary1.getAsArray(PdfName.KIDS), ((PdfObject) (obj))) == 0)
					break label0;
			}
			if(pdfindirectreference == null)
			{
				removeRefFromArray(pdfarray, ((PdfObject) (obj)));
				markUsed(((PdfObject) (pdfarray)));
			}
			k = j;
			if(i != -1)
			{
				item.remove(j);
				k = j - 1;
			}
		}
		  goto _L3
	//* 138  288:goto            182
		obj = ((Object) (pdfindirectreference));
	//  139  291:aload           7
	//  140  293:astore          5
		PdfReader.killIndirect(((PdfObject) (pdfindirectreference)));
	//  141  295:aload           7
	//  142  297:invokestatic    #1244 <Method PdfObject PdfReader.killIndirect(PdfObject)>
	//  143  300:pop             
		  goto _L4
	//* 144  301:goto            192
		if(i == -1 || item.size() == 0)
	//* 145  304:iload_2         
	//* 146  305:iconst_m1       
	//* 147  306:icmpeq          317
	//* 148  309:aload           8
	//* 149  311:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//* 150  314:ifne            328
			fields.remove(((Object) (s)));
	//  151  317:aload_0         
	//  152  318:getfield        #494 <Field Map fields>
	//  153  321:aload_1         
	//  154  322:invokeinterface #1248 <Method Object Map.remove(Object)>
	//  155  327:pop             
		return true;
	//  156  328:iconst_1        
	//  157  329:ireturn         
		  goto _L3
	}

	public boolean removeFieldsFromPage(int i)
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          7
			return false;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		String as[] = new String[fields.size()];
	//    5    7:aload_0         
	//    6    8:getfield        #494 <Field Map fields>
	//    7   11:invokeinterface #1251 <Method int Map.size()>
	//    8   16:anewarray       String[]
	//    9   19:astore          5
		fields.keySet().toArray(((Object []) (as)));
	//   10   21:aload_0         
	//   11   22:getfield        #494 <Field Map fields>
	//   12   25:invokeinterface #1254 <Method Set Map.keySet()>
	//   13   30:aload           5
	//   14   32:invokeinterface #1255 <Method Object[] Set.toArray(Object[])>
	//   15   37:pop             
		boolean flag = false;
	//   16   38:iconst_0        
	//   17   39:istore_3        
		int j = 0;
	//   18   40:iconst_0        
	//   19   41:istore_2        
		while(j < as.length) 
	//*  20   42:iload_2         
	//*  21   43:aload           5
	//*  22   45:arraylength     
	//*  23   46:icmpge          83
		{
			boolean flag1 = removeField(as[j], i);
	//   24   49:aload_0         
	//   25   50:aload           5
	//   26   52:iload_2         
	//   27   53:aaload          
	//   28   54:iload_1         
	//   29   55:invokevirtual   #1231 <Method boolean removeField(String, int)>
	//   30   58:istore          4
			if(flag || flag1)
	//*  31   60:iload_3         
	//*  32   61:ifne            69
	//*  33   64:iload           4
	//*  34   66:ifeq            78
				flag = true;
	//   35   69:iconst_1        
	//   36   70:istore_3        
			else
	//*  37   71:iload_2         
	//*  38   72:iconst_1        
	//*  39   73:iadd            
	//*  40   74:istore_2        
	//*  41   75:goto            42
				flag = false;
	//   42   78:iconst_0        
	//   43   79:istore_3        
			j++;
		}
	//*  44   80:goto            71
		return flag;
	//   45   83:iload_3         
	//   46   84:ireturn         
	}

	public void removeXfa()
	{
		reader.getCatalog().getAsDict(PdfName.ACROFORM).remove(PdfName.XFA);
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field PdfReader reader>
	//    2    4:invokevirtual   #758 <Method PdfDictionary PdfReader.getCatalog()>
	//    3    7:getstatic       #761 <Field PdfName PdfName.ACROFORM>
	//    4   10:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    5   13:getstatic       #1259 <Field PdfName PdfName.XFA>
	//    6   16:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
		try
		{
			xfa = new XfaForm(reader);
	//    7   19:aload_0         
	//    8   20:new             #220 <Class XfaForm>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:getfield        #216 <Field PdfReader reader>
	//   12   28:invokespecial   #223 <Method void XfaForm(PdfReader)>
	//   13   31:putfield        #225 <Field XfaForm xfa>
			return;
	//   14   34:return          
		}
		catch(Exception exception)
	//*  15   35:astore_1        
		{
			throw new ExceptionConverter(exception);
	//   16   36:new             #238 <Class ExceptionConverter>
	//   17   39:dup             
	//   18   40:aload_1         
	//   19   41:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//   20   44:athrow          
		}
	}

	public boolean renameField(String s, String s1)
	{
		int i;
		int j;
		i = s.lastIndexOf('.') + 1;
	//    0    0:aload_1         
	//    1    1:bipush          46
	//    2    3:invokevirtual   #1263 <Method int String.lastIndexOf(int)>
	//    3    6:iconst_1        
	//    4    7:iadd            
	//    5    8:istore_3        
		j = s1.lastIndexOf('.') + 1;
	//    6    9:aload_2         
	//    7   10:bipush          46
	//    8   12:invokevirtual   #1263 <Method int String.lastIndexOf(int)>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:istore          4
		break MISSING_BLOCK_LABEL_19;
		if(i == j && s.substring(0, i).equals(((Object) (s1.substring(0, j)))) && !fields.containsKey(((Object) (s1))))
	//*  12   19:iload_3         
	//*  13   20:iload           4
	//*  14   22:icmpeq          27
	//*  15   25:iconst_0        
	//*  16   26:ireturn         
	//*  17   27:aload_1         
	//*  18   28:iconst_0        
	//*  19   29:iload_3         
	//*  20   30:invokevirtual   #839 <Method String String.substring(int, int)>
	//*  21   33:aload_2         
	//*  22   34:iconst_0        
	//*  23   35:iload           4
	//*  24   37:invokevirtual   #839 <Method String String.substring(int, int)>
	//*  25   40:invokevirtual   #395 <Method boolean String.equals(Object)>
	//*  26   43:ifeq            25
	//*  27   46:aload_0         
	//*  28   47:getfield        #494 <Field Map fields>
	//*  29   50:aload_2         
	//*  30   51:invokeinterface #867 <Method boolean Map.containsKey(Object)>
	//*  31   56:ifne            25
		{
			Item item = (Item)fields.get(((Object) (s)));
	//   32   59:aload_0         
	//   33   60:getfield        #494 <Field Map fields>
	//   34   63:aload_1         
	//   35   64:invokeinterface #499 <Method Object Map.get(Object)>
	//   36   69:checkcast       #14  <Class AcroFields$Item>
	//   37   72:astore          5
			if(item != null)
	//*  38   74:aload           5
	//*  39   76:ifnull          25
			{
				s1 = s1.substring(j);
	//   40   79:aload_2         
	//   41   80:iload           4
	//   42   82:invokevirtual   #1266 <Method String String.substring(int)>
	//   43   85:astore_2        
				PdfString pdfstring = new PdfString(s1, "UnicodeBig");
	//   44   86:new             #315 <Class PdfString>
	//   45   89:dup             
	//   46   90:aload_2         
	//   47   91:ldc2            #1268 <String "UnicodeBig">
	//   48   94:invokespecial   #1271 <Method void PdfString(String, String)>
	//   49   97:astore          6
				item.writeToAll(PdfName.T, ((PdfObject) (pdfstring)), 5);
	//   50   99:aload           5
	//   51  101:getstatic       #820 <Field PdfName PdfName.T>
	//   52  104:aload           6
	//   53  106:iconst_5        
	//   54  107:invokevirtual   #1275 <Method void AcroFields$Item.writeToAll(PdfName, PdfObject, int)>
				item.markUsed(this, 4);
	//   55  110:aload           5
	//   56  112:aload_0         
	//   57  113:iconst_4        
	//   58  114:invokevirtual   #502 <Method void AcroFields$Item.markUsed(AcroFields, int)>
				fields.remove(((Object) (s)));
	//   59  117:aload_0         
	//   60  118:getfield        #494 <Field Map fields>
	//   61  121:aload_1         
	//   62  122:invokeinterface #1248 <Method Object Map.remove(Object)>
	//   63  127:pop             
				fields.put(((Object) (s1)), ((Object) (item)));
	//   64  128:aload_0         
	//   65  129:getfield        #494 <Field Map fields>
	//   66  132:aload_2         
	//   67  133:aload           5
	//   68  135:invokeinterface #841 <Method Object Map.put(Object, Object)>
	//   69  140:pop             
				return true;
	//   70  141:iconst_1        
	//   71  142:ireturn         
			}
		}
		return false;
	}

	public boolean replacePushbuttonField(String s, PdfFormField pdfformfield)
	{
		return replacePushbuttonField(s, pdfformfield, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #1280 <Method boolean replacePushbuttonField(String, PdfFormField, int)>
	//    5    7:ireturn         
	}

	public boolean replacePushbuttonField(String s, PdfFormField pdfformfield, int i)
	{
		Object obj;
		if(getFieldType(s) == 1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #1111 <Method int getFieldType(String)>
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          11
	//*   5    9:iconst_0        
	//*   6   10:ireturn         
	//*   7   11:aload_0         
	//*   8   12:aload_1         
	//*   9   13:invokevirtual   #284 <Method AcroFields$Item getFieldItem(String)>
	//*  10   16:astore          5
			if(i < ((Item) (obj = ((Object) (getFieldItem(s))))).size())
	//*  11   18:iload_3         
	//*  12   19:aload           5
	//*  13   21:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//*  14   24:icmpge          9
			{
				s = ((String) (((Item) (obj)).getMerged(i)));
	//   15   27:aload           5
	//   16   29:iload_3         
	//   17   30:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   18   33:astore_1        
				PdfDictionary pdfdictionary = ((Item) (obj)).getValue(i);
	//   19   34:aload           5
	//   20   36:iload_3         
	//   21   37:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//   22   40:astore          4
				obj = ((Object) (((Item) (obj)).getWidget(i)));
	//   23   42:aload           5
	//   24   44:iload_3         
	//   25   45:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//   26   48:astore          5
				for(i = 0; i < buttonRemove.length; i++)
	//*  27   50:iconst_0        
	//*  28   51:istore_3        
	//*  29   52:iload_3         
	//*  30   53:getstatic       #203 <Field PdfName[] buttonRemove>
	//*  31   56:arraylength     
	//*  32   57:icmpge          96
				{
					((PdfDictionary) (s)).remove(buttonRemove[i]);
	//   33   60:aload_1         
	//   34   61:getstatic       #203 <Field PdfName[] buttonRemove>
	//   35   64:iload_3         
	//   36   65:aaload          
	//   37   66:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
					pdfdictionary.remove(buttonRemove[i]);
	//   38   69:aload           4
	//   39   71:getstatic       #203 <Field PdfName[] buttonRemove>
	//   40   74:iload_3         
	//   41   75:aaload          
	//   42   76:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
					((PdfDictionary) (obj)).remove(buttonRemove[i]);
	//   43   79:aload           5
	//   44   81:getstatic       #203 <Field PdfName[] buttonRemove>
	//   45   84:iload_3         
	//   46   85:aaload          
	//   47   86:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
				}

	//   48   89:iload_3         
	//   49   90:iconst_1        
	//   50   91:iadd            
	//   51   92:istore_3        
	//*  52   93:goto            52
				Iterator iterator = pdfformfield.getKeys().iterator();
	//   53   96:aload_2         
	//   54   97:invokevirtual   #1283 <Method Set PdfFormField.getKeys()>
	//   55  100:invokeinterface #708 <Method Iterator Set.iterator()>
	//   56  105:astore          6
				do
				{
					if(!iterator.hasNext())
						break;
	//   57  107:aload           6
	//   58  109:invokeinterface #713 <Method boolean Iterator.hasNext()>
	//   59  114:ifeq            207
					PdfName pdfname = (PdfName)iterator.next();
	//   60  117:aload           6
	//   61  119:invokeinterface #717 <Method Object Iterator.next()>
	//   62  124:checkcast       #183 <Class PdfName>
	//   63  127:astore          7
					if(!pdfname.equals(((Object) (PdfName.T))))
	//*  64  129:aload           7
	//*  65  131:getstatic       #820 <Field PdfName PdfName.T>
	//*  66  134:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  67  137:ifne            107
					{
						if(pdfname.equals(((Object) (PdfName.FF))))
	//*  68  140:aload           7
	//*  69  142:getstatic       #192 <Field PdfName PdfName.FF>
	//*  70  145:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  71  148:ifeq            191
							pdfdictionary.put(pdfname, pdfformfield.get(pdfname));
	//   72  151:aload           4
	//   73  153:aload           7
	//   74  155:aload_2         
	//   75  156:aload           7
	//   76  158:invokevirtual   #1284 <Method PdfObject PdfFormField.get(PdfName)>
	//   77  161:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
						else
	//*  78  164:aload_1         
	//*  79  165:aload           7
	//*  80  167:aload_2         
	//*  81  168:aload           7
	//*  82  170:invokevirtual   #1284 <Method PdfObject PdfFormField.get(PdfName)>
	//*  83  173:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  84  176:aload_0         
	//*  85  177:aload           4
	//*  86  179:invokespecial   #247 <Method void markUsed(PdfObject)>
	//*  87  182:aload_0         
	//*  88  183:aload           5
	//*  89  185:invokespecial   #247 <Method void markUsed(PdfObject)>
	//*  90  188:goto            107
							((PdfDictionary) (obj)).put(pdfname, pdfformfield.get(pdfname));
	//   91  191:aload           5
	//   92  193:aload           7
	//   93  195:aload_2         
	//   94  196:aload           7
	//   95  198:invokevirtual   #1284 <Method PdfObject PdfFormField.get(PdfName)>
	//   96  201:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
						((PdfDictionary) (s)).put(pdfname, pdfformfield.get(pdfname));
						markUsed(((PdfObject) (pdfdictionary)));
						markUsed(((PdfObject) (obj)));
					}
				} while(true);
	//   97  204:goto            164
				return true;
	//   98  207:iconst_1        
	//   99  208:ireturn         
			}
		return false;
	}

	public void setExtraMargin(float f, float f1)
	{
		extraMarginLeft = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #924 <Field float extraMarginLeft>
		extraMarginTop = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #926 <Field float extraMarginTop>
	//    6   10:return          
	}

	public boolean setField(String s, String s1)
		throws IOException, DocumentException
	{
		return setField(s, s1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #1227 <Method boolean setField(String, String, String)>
	//    5    7:ireturn         
	}

	public boolean setField(String s, String s1, String s2)
		throws IOException, DocumentException
	{
		return setField(s, s1, s2, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #1287 <Method boolean setField(String, String, String, boolean)>
	//    6    8:ireturn         
	}

	public boolean setField(String s, String s1, String s2, boolean flag)
		throws IOException, DocumentException
	{
		if(writer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field PdfWriter writer>
	//*   2    4:ifnonnull       25
			throw new DocumentException(MessageLocalization.getComposedMessage("this.acrofields.instance.is.read.only", new Object[0]));
	//    3    7:new             #515 <Class DocumentException>
	//    4   10:dup             
	//    5   11:ldc2            #1289 <String "this.acrofields.instance.is.read.only">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #961 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #962 <Method void DocumentException(String)>
	//   10   24:athrow          
		String s3 = s;
	//   11   25:aload_1         
	//   12   26:astore          6
		if(xfa.isXfaPresent())
	//*  13   28:aload_0         
	//*  14   29:getfield        #225 <Field XfaForm xfa>
	//*  15   32:invokevirtual   #1013 <Method boolean XfaForm.isXfaPresent()>
	//*  16   35:ifeq            111
		{
			s3 = xfa.findFieldName(s, this);
	//   17   38:aload_0         
	//   18   39:getfield        #225 <Field XfaForm xfa>
	//   19   42:aload_1         
	//   20   43:aload_0         
	//   21   44:invokevirtual   #1017 <Method String XfaForm.findFieldName(String, AcroFields)>
	//   22   47:astore          6
			if(s3 == null)
	//*  23   49:aload           6
	//*  24   51:ifnonnull       56
				return false;
	//   25   54:iconst_0        
	//   26   55:ireturn         
			String s4 = XfaForm.Xml2Som.getShortName(s3);
	//   27   56:aload           6
	//   28   58:invokestatic    #1022 <Method String XfaForm$Xml2Som.getShortName(String)>
	//   29   61:astore          8
			Node node = xfa.findDatasetsNode(s4);
	//   30   63:aload_0         
	//   31   64:getfield        #225 <Field XfaForm xfa>
	//   32   67:aload           8
	//   33   69:invokevirtual   #1026 <Method Node XfaForm.findDatasetsNode(String)>
	//   34   72:astore          7
			s = ((String) (node));
	//   35   74:aload           7
	//   36   76:astore_1        
			if(node == null)
	//*  37   77:aload           7
	//*  38   79:ifnonnull       102
				s = ((String) (xfa.getDatasetsSom().insertNode(xfa.getDatasetsNode(), s4)));
	//   39   82:aload_0         
	//   40   83:getfield        #225 <Field XfaForm xfa>
	//   41   86:invokevirtual   #1293 <Method XfaForm$Xml2SomDatasets XfaForm.getDatasetsSom()>
	//   42   89:aload_0         
	//   43   90:getfield        #225 <Field XfaForm xfa>
	//   44   93:invokevirtual   #1297 <Method Node XfaForm.getDatasetsNode()>
	//   45   96:aload           8
	//   46   98:invokevirtual   #1301 <Method Node XfaForm$Xml2SomDatasets.insertNode(Node, String)>
	//   47  101:astore_1        
			xfa.setNodeText(((Node) (s)), s1);
	//   48  102:aload_0         
	//   49  103:getfield        #225 <Field XfaForm xfa>
	//   50  106:aload_1         
	//   51  107:aload_2         
	//   52  108:invokevirtual   #1305 <Method void XfaForm.setNodeText(Node, String)>
		}
		Item item = (Item)fields.get(((Object) (s3)));
	//   53  111:aload_0         
	//   54  112:getfield        #494 <Field Map fields>
	//   55  115:aload           6
	//   56  117:invokeinterface #499 <Method Object Map.get(Object)>
	//   57  122:checkcast       #14  <Class AcroFields$Item>
	//   58  125:astore          7
		if(item == null)
	//*  59  127:aload           7
	//*  60  129:ifnonnull       134
			return false;
	//   61  132:iconst_0        
	//   62  133:ireturn         
		PdfDictionary pdfdictionary = item.getMerged(0);
	//   63  134:aload           7
	//   64  136:iconst_0        
	//   65  137:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   66  140:astore          9
		PdfName pdfname = pdfdictionary.getAsName(PdfName.FT);
	//   67  142:aload           9
	//   68  144:getstatic       #875 <Field PdfName PdfName.FT>
	//   69  147:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   70  150:astore          8
		s = s1;
	//   71  152:aload_2         
	//   72  153:astore_1        
		if(PdfName.TX.equals(((Object) (pdfname))))
	//*  73  154:getstatic       #940 <Field PdfName PdfName.TX>
	//*  74  157:aload           8
	//*  75  159:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  76  162:ifeq            209
		{
			s = ((String) (pdfdictionary.getAsNumber(PdfName.MAXLEN)));
	//   77  165:aload           9
	//   78  167:getstatic       #642 <Field PdfName PdfName.MAXLEN>
	//   79  170:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   80  173:astore_1        
			int i = 0;
	//   81  174:iconst_0        
	//   82  175:istore          5
			if(s != null)
	//*  83  177:aload_1         
	//*  84  178:ifnull          187
				i = ((PdfNumber) (s)).intValue();
	//   85  181:aload_1         
	//   86  182:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//   87  185:istore          5
			s = s1;
	//   88  187:aload_2         
	//   89  188:astore_1        
			if(i > 0)
	//*  90  189:iload           5
	//*  91  191:ifle            209
				s = s1.substring(0, Math.min(i, s1.length()));
	//   92  194:aload_2         
	//   93  195:iconst_0        
	//   94  196:iload           5
	//   95  198:aload_2         
	//   96  199:invokevirtual   #835 <Method int String.length()>
	//   97  202:invokestatic    #1311 <Method int Math.min(int, int)>
	//   98  205:invokevirtual   #839 <Method String String.substring(int, int)>
	//   99  208:astore_1        
		}
		s1 = s2;
	//  100  209:aload_3         
	//  101  210:astore_2        
		if(s2 == null)
	//* 102  211:aload_3         
	//* 103  212:ifnonnull       217
			s1 = s;
	//  104  215:aload_1         
	//  105  216:astore_2        
		if(PdfName.TX.equals(((Object) (pdfname))) || PdfName.CH.equals(((Object) (pdfname))))
	//* 106  217:getstatic       #940 <Field PdfName PdfName.TX>
	//* 107  220:aload           8
	//* 108  222:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 109  225:ifne            239
	//* 110  228:getstatic       #953 <Field PdfName PdfName.CH>
	//* 111  231:aload           8
	//* 112  233:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 113  236:ifeq            487
		{
			PdfString pdfstring = new PdfString(s, "UnicodeBig");
	//  114  239:new             #315 <Class PdfString>
	//  115  242:dup             
	//  116  243:aload_1         
	//  117  244:ldc2            #1268 <String "UnicodeBig">
	//  118  247:invokespecial   #1271 <Method void PdfString(String, String)>
	//  119  250:astore          9
			int j = 0;
	//  120  252:iconst_0        
	//  121  253:istore          5
			while(j < item.size()) 
	//* 122  255:iload           5
	//* 123  257:aload           7
	//* 124  259:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//* 125  262:icmpge          485
			{
				s = ((String) (item.getValue(j)));
	//  126  265:aload           7
	//  127  267:iload           5
	//  128  269:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//  129  272:astore_1        
				((PdfDictionary) (s)).put(PdfName.V, ((PdfObject) (pdfstring)));
	//  130  273:aload_1         
	//  131  274:getstatic       #264 <Field PdfName PdfName.V>
	//  132  277:aload           9
	//  133  279:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
				((PdfDictionary) (s)).remove(PdfName.I);
	//  134  282:aload_1         
	//  135  283:getstatic       #682 <Field PdfName PdfName.I>
	//  136  286:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
				markUsed(((PdfObject) (s)));
	//  137  289:aload_0         
	//  138  290:aload_1         
	//  139  291:invokespecial   #247 <Method void markUsed(PdfObject)>
				PdfDictionary pdfdictionary2 = item.getMerged(j);
	//  140  294:aload           7
	//  141  296:iload           5
	//  142  298:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  143  301:astore          10
				pdfdictionary2.remove(PdfName.I);
	//  144  303:aload           10
	//  145  305:getstatic       #682 <Field PdfName PdfName.I>
	//  146  308:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
				pdfdictionary2.put(PdfName.V, ((PdfObject) (pdfstring)));
	//  147  311:aload           10
	//  148  313:getstatic       #264 <Field PdfName PdfName.V>
	//  149  316:aload           9
	//  150  318:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
				PdfDictionary pdfdictionary4 = item.getWidget(j);
	//  151  321:aload           7
	//  152  323:iload           5
	//  153  325:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  154  328:astore          11
				if(generateAppearances)
	//* 155  330:aload_0         
	//* 156  331:getfield        #212 <Field boolean generateAppearances>
	//* 157  334:ifeq            466
				{
					PdfAppearance pdfappearance = getAppearance(pdfdictionary2, s1, s3);
	//  158  337:aload_0         
	//  159  338:aload           10
	//  160  340:aload_2         
	//  161  341:aload           6
	//  162  343:invokevirtual   #1313 <Method PdfAppearance getAppearance(PdfDictionary, String, String)>
	//  163  346:astore          12
					if(PdfName.CH.equals(((Object) (pdfname))))
	//* 164  348:getstatic       #953 <Field PdfName PdfName.CH>
	//* 165  351:aload           8
	//* 166  353:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 167  356:ifeq            389
					{
						s = ((String) (new PdfNumber(topFirst)));
	//  168  359:new             #272 <Class PdfNumber>
	//  169  362:dup             
	//  170  363:aload_0         
	//  171  364:getfield        #917 <Field int topFirst>
	//  172  367:invokespecial   #275 <Method void PdfNumber(int)>
	//  173  370:astore_1        
						pdfdictionary4.put(PdfName.TI, ((PdfObject) (s)));
	//  174  371:aload           11
	//  175  373:getstatic       #1316 <Field PdfName PdfName.TI>
	//  176  376:aload_1         
	//  177  377:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
						pdfdictionary2.put(PdfName.TI, ((PdfObject) (s)));
	//  178  380:aload           10
	//  179  382:getstatic       #1316 <Field PdfName PdfName.TI>
	//  180  385:aload_1         
	//  181  386:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					}
					s2 = ((String) (pdfdictionary4.getAsDict(PdfName.AP)));
	//  182  389:aload           11
	//  183  391:getstatic       #252 <Field PdfName PdfName.AP>
	//  184  394:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  185  397:astore_3        
					s = s2;
	//  186  398:aload_3         
	//  187  399:astore_1        
					if(s2 == null)
	//* 188  400:aload_3         
	//* 189  401:ifnonnull       430
					{
						s = ((String) (new PdfDictionary()));
	//  190  404:new             #254 <Class PdfDictionary>
	//  191  407:dup             
	//  192  408:invokespecial   #811 <Method void PdfDictionary()>
	//  193  411:astore_1        
						pdfdictionary4.put(PdfName.AP, ((PdfObject) (s)));
	//  194  412:aload           11
	//  195  414:getstatic       #252 <Field PdfName PdfName.AP>
	//  196  417:aload_1         
	//  197  418:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
						pdfdictionary2.put(PdfName.AP, ((PdfObject) (s)));
	//  198  421:aload           10
	//  199  423:getstatic       #252 <Field PdfName PdfName.AP>
	//  200  426:aload_1         
	//  201  427:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					}
					((PdfDictionary) (s)).put(PdfName.N, ((PdfObject) (pdfappearance.getIndirectReference())));
	//  202  430:aload_1         
	//  203  431:getstatic       #993 <Field PdfName PdfName.N>
	//  204  434:aload           12
	//  205  436:invokevirtual   #1322 <Method PdfIndirectReference PdfAppearance.getIndirectReference()>
	//  206  439:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					writer.releaseTemplate(((PdfTemplate) (pdfappearance)));
	//  207  442:aload_0         
	//  208  443:getfield        #218 <Field PdfWriter writer>
	//  209  446:aload           12
	//  210  448:invokevirtual   #1328 <Method void PdfWriter.releaseTemplate(PdfTemplate)>
				} else
	//* 211  451:aload_0         
	//* 212  452:aload           11
	//* 213  454:invokespecial   #247 <Method void markUsed(PdfObject)>
	//* 214  457:iload           5
	//* 215  459:iconst_1        
	//* 216  460:iadd            
	//* 217  461:istore          5
	//* 218  463:goto            255
				{
					pdfdictionary4.remove(PdfName.AP);
	//  219  466:aload           11
	//  220  468:getstatic       #252 <Field PdfName PdfName.AP>
	//  221  471:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
					pdfdictionary2.remove(PdfName.AP);
	//  222  474:aload           10
	//  223  476:getstatic       #252 <Field PdfName PdfName.AP>
	//  224  479:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
				}
				markUsed(((PdfObject) (pdfdictionary4)));
				j++;
			}
	//* 225  482:goto            451
			return true;
	//  226  485:iconst_1        
	//  227  486:ireturn         
		}
		if(PdfName.BTN.equals(((Object) (pdfname))))
	//* 228  487:getstatic       #878 <Field PdfName PdfName.BTN>
	//* 229  490:aload           8
	//* 230  492:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//* 231  495:ifeq            930
		{
			s2 = ((String) (item.getMerged(0).getAsNumber(PdfName.FF)));
	//  232  498:aload           7
	//  233  500:iconst_0        
	//  234  501:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  235  504:getstatic       #192 <Field PdfName PdfName.FF>
	//  236  507:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  237  510:astore_3        
			int k = 0;
	//  238  511:iconst_0        
	//  239  512:istore          5
			if(s2 != null)
	//* 240  514:aload_3         
	//* 241  515:ifnull          524
				k = ((PdfNumber) (s2)).intValue();
	//  242  518:aload_3         
	//  243  519:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//  244  522:istore          5
			if((0x10000 & k) != 0)
	//* 245  524:ldc2            #1034 <Int 0x10000>
	//* 246  527:iload           5
	//* 247  529:iand            
	//* 248  530:ifeq            569
			{
				try
				{
					s = ((String) (Image.getInstance(Base64.decode(s))));
	//  249  533:aload_1         
	//  250  534:invokestatic    #1334 <Method byte[] Base64.decode(String)>
	//  251  537:invokestatic    #1340 <Method Image Image.getInstance(byte[])>
	//  252  540:astore_1        
				}
	//* 253  541:aload_0         
	//* 254  542:aload           6
	//* 255  544:invokevirtual   #1342 <Method PushbuttonField getNewPushbuttonFromField(String)>
	//* 256  547:astore_2        
	//* 257  548:aload_2         
	//* 258  549:aload_1         
	//* 259  550:invokevirtual   #1346 <Method void PushbuttonField.setImage(Image)>
	//* 260  553:aload_0         
	//* 261  554:aload           6
	//* 262  556:aload_2         
	//* 263  557:invokevirtual   #1349 <Method PdfFormField PushbuttonField.getField()>
	//* 264  560:invokevirtual   #1351 <Method boolean replacePushbuttonField(String, PdfFormField)>
	//* 265  563:pop             
	//* 266  564:iconst_1        
	//* 267  565:ireturn         
				// Misplaced declaration of an exception variable
				catch(String s)
	//* 268  566:astore_1        
				{
					return false;
	//  269  567:iconst_0        
	//  270  568:ireturn         
				}
				s1 = ((String) (getNewPushbuttonFromField(s3)));
				((PushbuttonField) (s1)).setImage(((Image) (s)));
				replacePushbuttonField(s3, ((PushbuttonField) (s1)).getField());
				return true;
			}
			s2 = ((String) (new PdfName(s)));
	//  271  569:new             #183 <Class PdfName>
	//  272  572:dup             
	//  273  573:aload_1         
	//  274  574:invokespecial   #544 <Method void PdfName(String)>
	//  275  577:astore_3        
			ArrayList arraylist = new ArrayList();
	//  276  578:new             #369 <Class ArrayList>
	//  277  581:dup             
	//  278  582:invokespecial   #370 <Method void ArrayList()>
	//  279  585:astore          8
			PdfArray pdfarray = item.getValue(0).getAsArray(PdfName.OPT);
	//  280  587:aload           7
	//  281  589:iconst_0        
	//  282  590:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//  283  593:getstatic       #291 <Field PdfName PdfName.OPT>
	//  284  596:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//  285  599:astore          9
			if(pdfarray != null)
	//* 286  601:aload           9
	//* 287  603:ifnull          663
			{
				k = 0;
	//  288  606:iconst_0        
	//  289  607:istore          5
				while(k < pdfarray.size()) 
	//* 290  609:iload           5
	//* 291  611:aload           9
	//* 292  613:invokevirtual   #301 <Method int PdfArray.size()>
	//* 293  616:icmpge          663
				{
					PdfString pdfstring1 = pdfarray.getAsString(k);
	//  294  619:aload           9
	//  295  621:iload           5
	//  296  623:invokevirtual   #966 <Method PdfString PdfArray.getAsString(int)>
	//  297  626:astore          10
					if(pdfstring1 != null)
	//* 298  628:aload           10
	//* 299  630:ifnull          653
						arraylist.add(((Object) (pdfstring1.toUnicodeString())));
	//  300  633:aload           8
	//  301  635:aload           10
	//  302  637:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  303  640:invokevirtual   #436 <Method boolean ArrayList.add(Object)>
	//  304  643:pop             
					else
	//* 305  644:iload           5
	//* 306  646:iconst_1        
	//* 307  647:iadd            
	//* 308  648:istore          5
	//* 309  650:goto            609
						arraylist.add(((Object) (null)));
	//  310  653:aload           8
	//  311  655:aconst_null     
	//  312  656:invokevirtual   #436 <Method boolean ArrayList.add(Object)>
	//  313  659:pop             
					k++;
				}
			}
	//* 314  660:goto            644
			k = arraylist.indexOf(((Object) (s)));
	//  315  663:aload           8
	//  316  665:aload_1         
	//  317  666:invokevirtual   #1355 <Method int ArrayList.indexOf(Object)>
	//  318  669:istore          5
			if(k >= 0)
	//* 319  671:iload           5
	//* 320  673:iflt            779
				s = ((String) (new PdfName(String.valueOf(k))));
	//  321  676:new             #183 <Class PdfName>
	//  322  679:dup             
	//  323  680:iload           5
	//  324  682:invokestatic    #1357 <Method String String.valueOf(int)>
	//  325  685:invokespecial   #544 <Method void PdfName(String)>
	//  326  688:astore_1        
			else
	//* 327  689:iconst_0        
	//* 328  690:istore          5
	//* 329  692:iload           5
	//* 330  694:aload           7
	//* 331  696:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//* 332  699:icmpge          928
	//* 333  702:aload           7
	//* 334  704:iload           5
	//* 335  706:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//* 336  709:astore_3        
	//* 337  710:aload           7
	//* 338  712:iload           5
	//* 339  714:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//* 340  717:astore          8
	//* 341  719:aload           7
	//* 342  721:iload           5
	//* 343  723:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//* 344  726:astore          9
	//* 345  728:aload_0         
	//* 346  729:aload           7
	//* 347  731:iload           5
	//* 348  733:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//* 349  736:invokespecial   #247 <Method void markUsed(PdfObject)>
	//* 350  739:aload           9
	//* 351  741:getstatic       #264 <Field PdfName PdfName.V>
	//* 352  744:aload_1         
	//* 353  745:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 354  748:aload_3         
	//* 355  749:getstatic       #264 <Field PdfName PdfName.V>
	//* 356  752:aload_1         
	//* 357  753:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 358  756:aload_0         
	//* 359  757:aload           8
	//* 360  759:invokespecial   #247 <Method void markUsed(PdfObject)>
	//* 361  762:aload           8
	//* 362  764:getstatic       #252 <Field PdfName PdfName.AP>
	//* 363  767:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 364  770:astore          9
	//* 365  772:aload           9
	//* 366  774:ifnonnull       784
	//* 367  777:iconst_0        
	//* 368  778:ireturn         
				s = s2;
	//  369  779:aload_3         
	//  370  780:astore_1        
			k = 0;
			while(k < item.size()) 
			{
				s2 = ((String) (item.getMerged(k)));
				Object obj = ((Object) (item.getWidget(k)));
				PdfDictionary pdfdictionary1 = item.getValue(k);
				markUsed(((PdfObject) (item.getValue(k))));
				pdfdictionary1.put(PdfName.V, ((PdfObject) (s)));
				((PdfDictionary) (s2)).put(PdfName.V, ((PdfObject) (s)));
				markUsed(((PdfObject) (obj)));
				pdfdictionary1 = ((PdfDictionary) (obj)).getAsDict(PdfName.AP);
				if(pdfdictionary1 == null)
					return false;
	//* 371  781:goto            689
				PdfDictionary pdfdictionary3 = pdfdictionary1.getAsDict(PdfName.N);
	//  372  784:aload           9
	//  373  786:getstatic       #993 <Field PdfName PdfName.N>
	//  374  789:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  375  792:astore          10
				if(isInAP(pdfdictionary3, ((PdfName) (s))) || pdfdictionary3 == null)
	//* 376  794:aload_0         
	//* 377  795:aload           10
	//* 378  797:aload_1         
	//* 379  798:invokevirtual   #1359 <Method boolean isInAP(PdfDictionary, PdfName)>
	//* 380  801:ifne            809
	//* 381  804:aload           10
	//* 382  806:ifnonnull       888
				{
					((PdfDictionary) (s2)).put(PdfName.AS, ((PdfObject) (s)));
	//  383  809:aload_3         
	//  384  810:getstatic       #261 <Field PdfName PdfName.AS>
	//  385  813:aload_1         
	//  386  814:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					((PdfDictionary) (obj)).put(PdfName.AS, ((PdfObject) (s)));
	//  387  817:aload           8
	//  388  819:getstatic       #261 <Field PdfName PdfName.AS>
	//  389  822:aload_1         
	//  390  823:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
				} else
	//* 391  826:aload_0         
	//* 392  827:getfield        #212 <Field boolean generateAppearances>
	//* 393  830:ifeq            879
	//* 394  833:iload           4
	//* 395  835:ifne            879
	//* 396  838:aload_0         
	//* 397  839:aload_3         
	//* 398  840:aload_2         
	//* 399  841:aload           6
	//* 400  843:invokevirtual   #1313 <Method PdfAppearance getAppearance(PdfDictionary, String, String)>
	//* 401  846:astore          8
	//* 402  848:aload           10
	//* 403  850:ifnull          912
	//* 404  853:aload           10
	//* 405  855:aload_3         
	//* 406  856:getstatic       #261 <Field PdfName PdfName.AS>
	//* 407  859:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//* 408  862:aload           8
	//* 409  864:invokevirtual   #1322 <Method PdfIndirectReference PdfAppearance.getIndirectReference()>
	//* 410  867:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 411  870:aload_0         
	//* 412  871:getfield        #218 <Field PdfWriter writer>
	//* 413  874:aload           8
	//* 414  876:invokevirtual   #1328 <Method void PdfWriter.releaseTemplate(PdfTemplate)>
	//* 415  879:iload           5
	//* 416  881:iconst_1        
	//* 417  882:iadd            
	//* 418  883:istore          5
	//* 419  885:goto            692
				{
					((PdfDictionary) (s2)).put(PdfName.AS, ((PdfObject) (PdfName.Off)));
	//  420  888:aload_3         
	//  421  889:getstatic       #261 <Field PdfName PdfName.AS>
	//  422  892:getstatic       #912 <Field PdfName PdfName.Off>
	//  423  895:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					((PdfDictionary) (obj)).put(PdfName.AS, ((PdfObject) (PdfName.Off)));
	//  424  898:aload           8
	//  425  900:getstatic       #261 <Field PdfName PdfName.AS>
	//  426  903:getstatic       #912 <Field PdfName PdfName.Off>
	//  427  906:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
				}
				if(generateAppearances && !flag)
				{
					obj = ((Object) (getAppearance(((PdfDictionary) (s2)), s1, s3)));
					if(pdfdictionary3 != null)
						pdfdictionary3.put(((PdfDictionary) (s2)).getAsName(PdfName.AS), ((PdfObject) (((PdfAppearance) (obj)).getIndirectReference())));
					else
	//* 428  909:goto            826
						pdfdictionary1.put(PdfName.N, ((PdfObject) (((PdfAppearance) (obj)).getIndirectReference())));
	//  429  912:aload           9
	//  430  914:getstatic       #993 <Field PdfName PdfName.N>
	//  431  917:aload           8
	//  432  919:invokevirtual   #1322 <Method PdfIndirectReference PdfAppearance.getIndirectReference()>
	//  433  922:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					writer.releaseTemplate(((PdfTemplate) (obj)));
				}
				k++;
			}
	//* 434  925:goto            870
			return true;
	//  435  928:iconst_1        
	//  436  929:ireturn         
		} else
		{
			return false;
	//  437  930:iconst_0        
	//  438  931:ireturn         
		}
	}

	public boolean setField(String s, String s1, boolean flag)
		throws IOException, DocumentException
	{
		return setField(s, s1, ((String) (null)), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iload_3         
	//    5    5:invokevirtual   #1287 <Method boolean setField(String, String, String, boolean)>
	//    6    8:ireturn         
	}

	public void setFieldCache(Map map)
	{
		fieldCache = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #919 <Field Map fieldCache>
	//    3    5:return          
	}

	public boolean setFieldProperty(String s, String s1, int i, int ai[])
	{
		if(writer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field PdfWriter writer>
	//*   2    4:ifnonnull       25
			throw new RuntimeException(MessageLocalization.getComposedMessage("this.acrofields.instance.is.read.only", new Object[0]));
	//    3    7:new             #1367 <Class RuntimeException>
	//    4   10:dup             
	//    5   11:ldc2            #1289 <String "this.acrofields.instance.is.read.only">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #961 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #1368 <Method void RuntimeException(String)>
	//   10   24:athrow          
		s = ((String) ((Item)fields.get(((Object) (s)))));
	//   11   25:aload_0         
	//   12   26:getfield        #494 <Field Map fields>
	//   13   29:aload_1         
	//   14   30:invokeinterface #499 <Method Object Map.get(Object)>
	//   15   35:checkcast       #14  <Class AcroFields$Item>
	//   16   38:astore_1        
		if(s != null) goto _L2; else goto _L1
	//   17   39:aload_1         
	//   18   40:ifnonnull       45
_L1:
		return false;
	//   19   43:iconst_0        
	//   20   44:ireturn         
_L2:
		ai = ((int []) (new InstHit(ai)));
	//   21   45:new             #11  <Class AcroFields$InstHit>
	//   22   48:dup             
	//   23   49:aload           4
	//   24   51:invokespecial   #1371 <Method void AcroFields$InstHit(int[])>
	//   25   54:astore          4
		if(s1.equalsIgnoreCase("flags"))
	//*  26   56:aload_2         
	//*  27   57:ldc2            #1373 <String "flags">
	//*  28   60:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//*  29   63:ifeq            134
		{
			s1 = ((String) (new PdfNumber(i)));
	//   30   66:new             #272 <Class PdfNumber>
	//   31   69:dup             
	//   32   70:iload_3         
	//   33   71:invokespecial   #275 <Method void PdfNumber(int)>
	//   34   74:astore_2        
			for(i = 0; i < ((Item) (s)).size(); i++)
	//*  35   75:iconst_0        
	//*  36   76:istore_3        
	//*  37   77:iload_3         
	//*  38   78:aload_1         
	//*  39   79:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//*  40   82:icmpge          670
				if(((InstHit) (ai)).isHit(i))
	//*  41   85:aload           4
	//*  42   87:iload_3         
	//*  43   88:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//*  44   91:ifeq            127
				{
					((Item) (s)).getMerged(i).put(PdfName.F, ((PdfObject) (s1)));
	//   45   94:aload_1         
	//   46   95:iload_3         
	//   47   96:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   48   99:getstatic       #189 <Field PdfName PdfName.F>
	//   49  102:aload_2         
	//   50  103:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					((Item) (s)).getWidget(i).put(PdfName.F, ((PdfObject) (s1)));
	//   51  106:aload_1         
	//   52  107:iload_3         
	//   53  108:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//   54  111:getstatic       #189 <Field PdfName PdfName.F>
	//   55  114:aload_2         
	//   56  115:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					markUsed(((PdfObject) (((Item) (s)).getWidget(i))));
	//   57  118:aload_0         
	//   58  119:aload_1         
	//   59  120:iload_3         
	//   60  121:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//   61  124:invokespecial   #247 <Method void markUsed(PdfObject)>
				}

	//   62  127:iload_3         
	//   63  128:iconst_1        
	//   64  129:iadd            
	//   65  130:istore_3        
			break; /* Loop/switch isn't completed */
	//   66  131:goto            77
		}
		if(s1.equalsIgnoreCase("setflags"))
	//*  67  134:aload_2         
	//*  68  135:ldc2            #1381 <String "setflags">
	//*  69  138:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//*  70  141:ifeq            249
		{
			for(int j = 0; j < ((Item) (s)).size(); j++)
	//*  71  144:iconst_0        
	//*  72  145:istore          5
	//*  73  147:iload           5
	//*  74  149:aload_1         
	//*  75  150:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//*  76  153:icmpge          670
				if(((InstHit) (ai)).isHit(j))
	//*  77  156:aload           4
	//*  78  158:iload           5
	//*  79  160:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//*  80  163:ifeq            240
				{
					s1 = ((String) (((Item) (s)).getWidget(j).getAsNumber(PdfName.F)));
	//   81  166:aload_1         
	//   82  167:iload           5
	//   83  169:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//   84  172:getstatic       #189 <Field PdfName PdfName.F>
	//   85  175:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   86  178:astore_2        
					int j1 = 0;
	//   87  179:iconst_0        
	//   88  180:istore          6
					if(s1 != null)
	//*  89  182:aload_2         
	//*  90  183:ifnull          192
						j1 = ((PdfNumber) (s1)).intValue();
	//   91  186:aload_2         
	//   92  187:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//   93  190:istore          6
					s1 = ((String) (new PdfNumber(j1 | i)));
	//   94  192:new             #272 <Class PdfNumber>
	//   95  195:dup             
	//   96  196:iload           6
	//   97  198:iload_3         
	//   98  199:ior             
	//   99  200:invokespecial   #275 <Method void PdfNumber(int)>
	//  100  203:astore_2        
					((Item) (s)).getMerged(j).put(PdfName.F, ((PdfObject) (s1)));
	//  101  204:aload_1         
	//  102  205:iload           5
	//  103  207:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  104  210:getstatic       #189 <Field PdfName PdfName.F>
	//  105  213:aload_2         
	//  106  214:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					((Item) (s)).getWidget(j).put(PdfName.F, ((PdfObject) (s1)));
	//  107  217:aload_1         
	//  108  218:iload           5
	//  109  220:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  110  223:getstatic       #189 <Field PdfName PdfName.F>
	//  111  226:aload_2         
	//  112  227:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					markUsed(((PdfObject) (((Item) (s)).getWidget(j))));
	//  113  230:aload_0         
	//  114  231:aload_1         
	//  115  232:iload           5
	//  116  234:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  117  237:invokespecial   #247 <Method void markUsed(PdfObject)>
				}

	//  118  240:iload           5
	//  119  242:iconst_1        
	//  120  243:iadd            
	//  121  244:istore          5
			break; /* Loop/switch isn't completed */
	//  122  246:goto            147
		}
		if(s1.equalsIgnoreCase("clrflags"))
	//* 123  249:aload_2         
	//* 124  250:ldc2            #1383 <String "clrflags">
	//* 125  253:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//* 126  256:ifeq            364
		{
			for(int k = 0; k < ((Item) (s)).size(); k++)
	//* 127  259:iconst_0        
	//* 128  260:istore          5
	//* 129  262:iload           5
	//* 130  264:aload_1         
	//* 131  265:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//* 132  268:icmpge          670
				if(((InstHit) (ai)).isHit(k))
	//* 133  271:aload           4
	//* 134  273:iload           5
	//* 135  275:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//* 136  278:ifeq            355
				{
					s1 = ((String) (((Item) (s)).getWidget(k)));
	//  137  281:aload_1         
	//  138  282:iload           5
	//  139  284:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  140  287:astore_2        
					PdfNumber pdfnumber = ((PdfDictionary) (s1)).getAsNumber(PdfName.F);
	//  141  288:aload_2         
	//  142  289:getstatic       #189 <Field PdfName PdfName.F>
	//  143  292:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  144  295:astore          7
					int k1 = 0;
	//  145  297:iconst_0        
	//  146  298:istore          6
					if(pdfnumber != null)
	//* 147  300:aload           7
	//* 148  302:ifnull          312
						k1 = pdfnumber.intValue();
	//  149  305:aload           7
	//  150  307:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//  151  310:istore          6
					pdfnumber = new PdfNumber(~i & k1);
	//  152  312:new             #272 <Class PdfNumber>
	//  153  315:dup             
	//  154  316:iload_3         
	//  155  317:iconst_m1       
	//  156  318:ixor            
	//  157  319:iload           6
	//  158  321:iand            
	//  159  322:invokespecial   #275 <Method void PdfNumber(int)>
	//  160  325:astore          7
					((Item) (s)).getMerged(k).put(PdfName.F, ((PdfObject) (pdfnumber)));
	//  161  327:aload_1         
	//  162  328:iload           5
	//  163  330:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  164  333:getstatic       #189 <Field PdfName PdfName.F>
	//  165  336:aload           7
	//  166  338:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					((PdfDictionary) (s1)).put(PdfName.F, ((PdfObject) (pdfnumber)));
	//  167  341:aload_2         
	//  168  342:getstatic       #189 <Field PdfName PdfName.F>
	//  169  345:aload           7
	//  170  347:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					markUsed(((PdfObject) (s1)));
	//  171  350:aload_0         
	//  172  351:aload_2         
	//  173  352:invokespecial   #247 <Method void markUsed(PdfObject)>
				}

	//  174  355:iload           5
	//  175  357:iconst_1        
	//  176  358:iadd            
	//  177  359:istore          5
			break; /* Loop/switch isn't completed */
	//  178  361:goto            262
		}
		if(s1.equalsIgnoreCase("fflags"))
	//* 179  364:aload_2         
	//* 180  365:ldc2            #1385 <String "fflags">
	//* 181  368:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//* 182  371:ifeq            442
		{
			s1 = ((String) (new PdfNumber(i)));
	//  183  374:new             #272 <Class PdfNumber>
	//  184  377:dup             
	//  185  378:iload_3         
	//  186  379:invokespecial   #275 <Method void PdfNumber(int)>
	//  187  382:astore_2        
			for(i = 0; i < ((Item) (s)).size(); i++)
	//* 188  383:iconst_0        
	//* 189  384:istore_3        
	//* 190  385:iload_3         
	//* 191  386:aload_1         
	//* 192  387:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//* 193  390:icmpge          670
				if(((InstHit) (ai)).isHit(i))
	//* 194  393:aload           4
	//* 195  395:iload_3         
	//* 196  396:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//* 197  399:ifeq            435
				{
					((Item) (s)).getMerged(i).put(PdfName.FF, ((PdfObject) (s1)));
	//  198  402:aload_1         
	//  199  403:iload_3         
	//  200  404:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  201  407:getstatic       #192 <Field PdfName PdfName.FF>
	//  202  410:aload_2         
	//  203  411:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					((Item) (s)).getValue(i).put(PdfName.FF, ((PdfObject) (s1)));
	//  204  414:aload_1         
	//  205  415:iload_3         
	//  206  416:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//  207  419:getstatic       #192 <Field PdfName PdfName.FF>
	//  208  422:aload_2         
	//  209  423:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					markUsed(((PdfObject) (((Item) (s)).getValue(i))));
	//  210  426:aload_0         
	//  211  427:aload_1         
	//  212  428:iload_3         
	//  213  429:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//  214  432:invokespecial   #247 <Method void markUsed(PdfObject)>
				}

	//  215  435:iload_3         
	//  216  436:iconst_1        
	//  217  437:iadd            
	//  218  438:istore_3        
			break; /* Loop/switch isn't completed */
	//  219  439:goto            385
		}
		if(s1.equalsIgnoreCase("setfflags"))
	//* 220  442:aload_2         
	//* 221  443:ldc2            #1387 <String "setfflags">
	//* 222  446:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//* 223  449:ifeq            555
		{
			for(int l = 0; l < ((Item) (s)).size(); l++)
	//* 224  452:iconst_0        
	//* 225  453:istore          5
	//* 226  455:iload           5
	//* 227  457:aload_1         
	//* 228  458:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//* 229  461:icmpge          670
				if(((InstHit) (ai)).isHit(l))
	//* 230  464:aload           4
	//* 231  466:iload           5
	//* 232  468:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//* 233  471:ifeq            546
				{
					s1 = ((String) (((Item) (s)).getValue(l)));
	//  234  474:aload_1         
	//  235  475:iload           5
	//  236  477:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//  237  480:astore_2        
					PdfNumber pdfnumber1 = ((PdfDictionary) (s1)).getAsNumber(PdfName.FF);
	//  238  481:aload_2         
	//  239  482:getstatic       #192 <Field PdfName PdfName.FF>
	//  240  485:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  241  488:astore          7
					int l1 = 0;
	//  242  490:iconst_0        
	//  243  491:istore          6
					if(pdfnumber1 != null)
	//* 244  493:aload           7
	//* 245  495:ifnull          505
						l1 = pdfnumber1.intValue();
	//  246  498:aload           7
	//  247  500:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//  248  503:istore          6
					pdfnumber1 = new PdfNumber(l1 | i);
	//  249  505:new             #272 <Class PdfNumber>
	//  250  508:dup             
	//  251  509:iload           6
	//  252  511:iload_3         
	//  253  512:ior             
	//  254  513:invokespecial   #275 <Method void PdfNumber(int)>
	//  255  516:astore          7
					((Item) (s)).getMerged(l).put(PdfName.FF, ((PdfObject) (pdfnumber1)));
	//  256  518:aload_1         
	//  257  519:iload           5
	//  258  521:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  259  524:getstatic       #192 <Field PdfName PdfName.FF>
	//  260  527:aload           7
	//  261  529:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					((PdfDictionary) (s1)).put(PdfName.FF, ((PdfObject) (pdfnumber1)));
	//  262  532:aload_2         
	//  263  533:getstatic       #192 <Field PdfName PdfName.FF>
	//  264  536:aload           7
	//  265  538:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
					markUsed(((PdfObject) (s1)));
	//  266  541:aload_0         
	//  267  542:aload_2         
	//  268  543:invokespecial   #247 <Method void markUsed(PdfObject)>
				}

	//  269  546:iload           5
	//  270  548:iconst_1        
	//  271  549:iadd            
	//  272  550:istore          5
			break; /* Loop/switch isn't completed */
	//  273  552:goto            455
		}
		if(!s1.equalsIgnoreCase("clrfflags"))
			continue; /* Loop/switch isn't completed */
	//  274  555:aload_2         
	//  275  556:ldc2            #1389 <String "clrfflags">
	//  276  559:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//  277  562:ifeq            43
		for(int i1 = 0; i1 < ((Item) (s)).size(); i1++)
	//* 278  565:iconst_0        
	//* 279  566:istore          5
	//* 280  568:iload           5
	//* 281  570:aload_1         
	//* 282  571:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//* 283  574:icmpge          670
		{
			if(!((InstHit) (ai)).isHit(i1))
				continue;
	//  284  577:aload           4
	//  285  579:iload           5
	//  286  581:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//  287  584:ifeq            661
			s1 = ((String) (((Item) (s)).getValue(i1)));
	//  288  587:aload_1         
	//  289  588:iload           5
	//  290  590:invokevirtual   #511 <Method PdfDictionary AcroFields$Item.getValue(int)>
	//  291  593:astore_2        
			PdfNumber pdfnumber2 = ((PdfDictionary) (s1)).getAsNumber(PdfName.FF);
	//  292  594:aload_2         
	//  293  595:getstatic       #192 <Field PdfName PdfName.FF>
	//  294  598:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//  295  601:astore          7
			int i2 = 0;
	//  296  603:iconst_0        
	//  297  604:istore          6
			if(pdfnumber2 != null)
	//* 298  606:aload           7
	//* 299  608:ifnull          618
				i2 = pdfnumber2.intValue();
	//  300  611:aload           7
	//  301  613:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//  302  616:istore          6
			pdfnumber2 = new PdfNumber(~i & i2);
	//  303  618:new             #272 <Class PdfNumber>
	//  304  621:dup             
	//  305  622:iload_3         
	//  306  623:iconst_m1       
	//  307  624:ixor            
	//  308  625:iload           6
	//  309  627:iand            
	//  310  628:invokespecial   #275 <Method void PdfNumber(int)>
	//  311  631:astore          7
			((Item) (s)).getMerged(i1).put(PdfName.FF, ((PdfObject) (pdfnumber2)));
	//  312  633:aload_1         
	//  313  634:iload           5
	//  314  636:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  315  639:getstatic       #192 <Field PdfName PdfName.FF>
	//  316  642:aload           7
	//  317  644:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
			((PdfDictionary) (s1)).put(PdfName.FF, ((PdfObject) (pdfnumber2)));
	//  318  647:aload_2         
	//  319  648:getstatic       #192 <Field PdfName PdfName.FF>
	//  320  651:aload           7
	//  321  653:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
			markUsed(((PdfObject) (s1)));
	//  322  656:aload_0         
	//  323  657:aload_2         
	//  324  658:invokespecial   #247 <Method void markUsed(PdfObject)>
		}

	//  325  661:iload           5
	//  326  663:iconst_1        
	//  327  664:iadd            
	//  328  665:istore          5
		break; /* Loop/switch isn't completed */
	//  329  667:goto            568
		if(true) goto _L1; else goto _L3
_L3:
		return true;
	//  330  670:iconst_1        
	//  331  671:ireturn         
	}

	public boolean setFieldProperty(String s, String s1, Object obj, int ai[])
	{
		int i;
		Object obj1;
		Item item;
		InstHit insthit;
		BaseFont basefont;
		if(writer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field PdfWriter writer>
	//*   2    4:ifnonnull       25
			throw new RuntimeException(MessageLocalization.getComposedMessage("this.acrofields.instance.is.read.only", new Object[0]));
	//    3    7:new             #1367 <Class RuntimeException>
	//    4   10:dup             
	//    5   11:ldc2            #1289 <String "this.acrofields.instance.is.read.only">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #961 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #1368 <Method void RuntimeException(String)>
	//   10   24:athrow          
		PdfDictionary pdfdictionary;
		Object aobj[];
		PdfAppearance pdfappearance;
		PdfIndirectReference pdfindirectreference;
		try
		{
			item = (Item)fields.get(((Object) (s)));
	//   11   25:aload_0         
	//   12   26:getfield        #494 <Field Map fields>
	//   13   29:aload_1         
	//   14   30:invokeinterface #499 <Method Object Map.get(Object)>
	//   15   35:checkcast       #14  <Class AcroFields$Item>
	//   16   38:astore          8
		}
	//*  17   40:aload           8
	//*  18   42:ifnonnull       47
	//*  19   45:iconst_0        
	//*  20   46:ireturn         
	//*  21   47:new             #11  <Class AcroFields$InstHit>
	//*  22   50:dup             
	//*  23   51:aload           4
	//*  24   53:invokespecial   #1371 <Method void AcroFields$InstHit(int[])>
	//*  25   56:astore          9
	//*  26   58:aload_2         
	//*  27   59:ldc2            #1392 <String "textfont">
	//*  28   62:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//*  29   65:ifeq            611
	//*  30   68:iconst_0        
	//*  31   69:istore          5
	//*  32   71:iload           5
	//*  33   73:aload           8
	//*  34   75:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//*  35   78:icmpge          1153
	//*  36   81:aload           9
	//*  37   83:iload           5
	//*  38   85:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//*  39   88:ifeq            1155
	//*  40   91:aload           8
	//*  41   93:iload           5
	//*  42   95:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//*  43   98:astore_2        
	//*  44   99:aload_2         
	//*  45  100:getstatic       #518 <Field PdfName PdfName.DA>
	//*  46  103:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//*  47  106:astore          6
	//*  48  108:aload_2         
	//*  49  109:getstatic       #536 <Field PdfName PdfName.DR>
	//*  50  112:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//*  51  115:astore_1        
	//*  52  116:aload           6
	//*  53  118:ifnull          1155
	//*  54  121:aload_1         
	//*  55  122:astore          4
	//*  56  124:aload_1         
	//*  57  125:ifnonnull       146
	//*  58  128:new             #254 <Class PdfDictionary>
	//*  59  131:dup             
	//*  60  132:invokespecial   #811 <Method void PdfDictionary()>
	//*  61  135:astore          4
	//*  62  137:aload_2         
	//*  63  138:getstatic       #536 <Field PdfName PdfName.DR>
	//*  64  141:aload           4
	//*  65  143:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  66  146:aload           6
	//*  67  148:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//*  68  151:invokestatic    #524 <Method Object[] splitDAelements(String)>
	//*  69  154:astore          10
	//*  70  156:new             #1318 <Class PdfAppearance>
	//*  71  159:dup             
	//*  72  160:invokespecial   #1393 <Method void PdfAppearance()>
	//*  73  163:astore          11
	//*  74  165:aload           10
	//*  75  167:iconst_0        
	//*  76  168:aaload          
	//*  77  169:ifnull          1155
	//*  78  172:aload_3         
	//*  79  173:checkcast       #573 <Class BaseFont>
	//*  80  176:astore          12
	//*  81  178:getstatic       #1394 <Field HashMap PdfAppearance.stdFieldFontNames>
	//*  82  181:aload           12
	//*  83  183:invokevirtual   #1397 <Method String BaseFont.getPostscriptFontName()>
	//*  84  186:invokevirtual   #571 <Method Object HashMap.get(Object)>
	//*  85  189:checkcast       #183 <Class PdfName>
	//*  86  192:astore_2        
	//*  87  193:aload_2         
	//*  88  194:astore_1        
	//*  89  195:aload_2         
	//*  90  196:ifnonnull       212
	//*  91  199:new             #183 <Class PdfName>
	//*  92  202:dup             
	//*  93  203:aload           12
	//*  94  205:invokevirtual   #1397 <Method String BaseFont.getPostscriptFontName()>
	//*  95  208:invokespecial   #544 <Method void PdfName(String)>
	//*  96  211:astore_1        
	//*  97  212:aload           4
	//*  98  214:getstatic       #543 <Field PdfName PdfName.FONT>
	//*  99  217:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 100  220:astore          6
	//* 101  222:aload           6
	//* 102  224:astore_2        
	//* 103  225:aload           6
	//* 104  227:ifnonnull       247
	//* 105  230:new             #254 <Class PdfDictionary>
	//* 106  233:dup             
	//* 107  234:invokespecial   #811 <Method void PdfDictionary()>
	//* 108  237:astore_2        
	//* 109  238:aload           4
	//* 110  240:getstatic       #543 <Field PdfName PdfName.FONT>
	//* 111  243:aload_2         
	//* 112  244:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 113  247:aload_2         
	//* 114  248:aload_1         
	//* 115  249:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 116  252:checkcast       #332 <Class PdfIndirectReference>
	//* 117  255:astore          13
	//* 118  257:aload_0         
	//* 119  258:getfield        #216 <Field PdfReader reader>
	//* 120  261:invokevirtual   #758 <Method PdfDictionary PdfReader.getCatalog()>
	//* 121  264:getstatic       #761 <Field PdfName PdfName.ACROFORM>
	//* 122  267:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 123  270:astore          7
	//* 124  272:aload_0         
	//* 125  273:aload           7
	//* 126  275:invokespecial   #247 <Method void markUsed(PdfObject)>
	//* 127  278:aload           7
	//* 128  280:getstatic       #536 <Field PdfName PdfName.DR>
	//* 129  283:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 130  286:astore          4
	//* 131  288:aload           4
	//* 132  290:astore          6
	//* 133  292:aload           4
	//* 134  294:ifnonnull       316
	//* 135  297:new             #254 <Class PdfDictionary>
	//* 136  300:dup             
	//* 137  301:invokespecial   #811 <Method void PdfDictionary()>
	//* 138  304:astore          6
	//* 139  306:aload           7
	//* 140  308:getstatic       #536 <Field PdfName PdfName.DR>
	//* 141  311:aload           6
	//* 142  313:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 143  316:aload_0         
	//* 144  317:aload           6
	//* 145  319:invokespecial   #247 <Method void markUsed(PdfObject)>
	//* 146  322:aload           6
	//* 147  324:getstatic       #543 <Field PdfName PdfName.FONT>
	//* 148  327:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//* 149  330:astore          7
	//* 150  332:aload           7
	//* 151  334:astore          4
	//* 152  336:aload           7
	//* 153  338:ifnonnull       360
	//* 154  341:new             #254 <Class PdfDictionary>
	//* 155  344:dup             
	//* 156  345:invokespecial   #811 <Method void PdfDictionary()>
	//* 157  348:astore          4
	//* 158  350:aload           6
	//* 159  352:getstatic       #543 <Field PdfName PdfName.FONT>
	//* 160  355:aload           4
	//* 161  357:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 162  360:aload_0         
	//* 163  361:aload           4
	//* 164  363:invokespecial   #247 <Method void markUsed(PdfObject)>
	//* 165  366:aload           4
	//* 166  368:aload_1         
	//* 167  369:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//* 168  372:checkcast       #332 <Class PdfIndirectReference>
	//* 169  375:astore          6
	//* 170  377:aload           6
	//* 171  379:ifnull          505
	//* 172  382:aload           13
	//* 173  384:ifnonnull       394
	//* 174  387:aload_2         
	//* 175  388:aload_1         
	//* 176  389:aload           6
	//* 177  391:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 178  394:aload           11
	//* 179  396:invokevirtual   #1401 <Method ByteBuffer PdfAppearance.getInternalBuffer()>
	//* 180  399:aload_1         
	//* 181  400:invokevirtual   #1405 <Method byte[] PdfName.getBytes()>
	//* 182  403:invokevirtual   #1410 <Method ByteBuffer ByteBuffer.append(byte[])>
	//* 183  406:bipush          32
	//* 184  408:invokevirtual   #1413 <Method ByteBuffer ByteBuffer.append(char)>
	//* 185  411:aload           10
	//* 186  413:iconst_1        
	//* 187  414:aaload          
	//* 188  415:checkcast       #402 <Class Float>
	//* 189  418:invokevirtual   #414 <Method float Float.floatValue()>
	//* 190  421:invokevirtual   #1416 <Method ByteBuffer ByteBuffer.append(float)>
	//* 191  424:ldc2            #1418 <String " Tf ">
	//* 192  427:invokevirtual   #1421 <Method ByteBuffer ByteBuffer.append(String)>
	//* 193  430:pop             
	//* 194  431:aload           10
	//* 195  433:iconst_2        
	//* 196  434:aaload          
	//* 197  435:ifnull          450
	//* 198  438:aload           11
	//* 199  440:aload           10
	//* 200  442:iconst_2        
	//* 201  443:aaload          
	//* 202  444:checkcast       #423 <Class BaseColor>
	//* 203  447:invokevirtual   #1424 <Method void PdfAppearance.setColorFill(BaseColor)>
	//* 204  450:new             #315 <Class PdfString>
	//* 205  453:dup             
	//* 206  454:aload           11
	//* 207  456:invokevirtual   #1425 <Method String PdfAppearance.toString()>
	//* 208  459:invokespecial   #1426 <Method void PdfString(String)>
	//* 209  462:astore_1        
	//* 210  463:aload           8
	//* 211  465:iload           5
	//* 212  467:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//* 213  470:getstatic       #518 <Field PdfName PdfName.DA>
	//* 214  473:aload_1         
	//* 215  474:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 216  477:aload           8
	//* 217  479:iload           5
	//* 218  481:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//* 219  484:getstatic       #518 <Field PdfName PdfName.DA>
	//* 220  487:aload_1         
	//* 221  488:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 222  491:aload_0         
	//* 223  492:aload           8
	//* 224  494:iload           5
	//* 225  496:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//* 226  499:invokespecial   #247 <Method void markUsed(PdfObject)>
	//* 227  502:goto            1155
	//* 228  505:aload           13
	//* 229  507:ifnonnull       394
	//* 230  510:aload           12
	//* 231  512:invokevirtual   #1429 <Method int BaseFont.getFontType()>
	//* 232  515:iconst_4        
	//* 233  516:icmpne          573
	//* 234  519:new             #1431 <Class FontDetails>
	//* 235  522:dup             
	//* 236  523:aconst_null     
	//* 237  524:aload           12
	//* 238  526:checkcast       #554 <Class DocumentFont>
	//* 239  529:invokevirtual   #1432 <Method PdfIndirectReference DocumentFont.getIndirectReference()>
	//* 240  532:aload           12
	//* 241  534:invokespecial   #1435 <Method void FontDetails(PdfName, PdfIndirectReference, BaseFont)>
	//* 242  537:astore          6
	//* 243  539:aload           4
	//* 244  541:aload_1         
	//* 245  542:aload           6
	//* 246  544:invokevirtual   #1436 <Method PdfIndirectReference FontDetails.getIndirectReference()>
	//* 247  547:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 248  550:aload_2         
	//* 249  551:aload_1         
	//* 250  552:aload           6
	//* 251  554:invokevirtual   #1436 <Method PdfIndirectReference FontDetails.getIndirectReference()>
	//* 252  557:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 253  560:goto            394
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 254  563:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//  255  564:new             #238 <Class ExceptionConverter>
	//  256  567:dup             
	//  257  568:aload_1         
	//  258  569:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//  259  572:athrow          
		}
		if(item == null)
			return false;
		insthit = new InstHit(ai);
		if(!s1.equalsIgnoreCase("textfont")) goto _L2; else goto _L1
_L1:
		i = 0;
_L39:
		if(i >= item.size()) goto _L4; else goto _L3
_L3:
		if(!insthit.isHit(i)) goto _L6; else goto _L5
_L5:
		s1 = ((String) (item.getMerged(i)));
		obj1 = ((Object) (((PdfDictionary) (s1)).getAsString(PdfName.DA)));
		s = ((String) (((PdfDictionary) (s1)).getAsDict(PdfName.DR)));
		if(obj1 == null) goto _L6; else goto _L7
_L7:
		ai = ((int []) (s));
		if(s != null)
			break MISSING_BLOCK_LABEL_146;
		ai = ((int []) (new PdfDictionary()));
		((PdfDictionary) (s1)).put(PdfName.DR, ((PdfObject) (ai)));
		aobj = splitDAelements(((PdfString) (obj1)).toUnicodeString());
		pdfappearance = new PdfAppearance();
		if(aobj[0] == null) goto _L6; else goto _L8
_L8:
		basefont = (BaseFont)obj;
		s1 = ((String) ((PdfName)PdfAppearance.stdFieldFontNames.get(((Object) (basefont.getPostscriptFontName())))));
		s = s1;
		if(s1 != null)
			break MISSING_BLOCK_LABEL_212;
		s = ((String) (new PdfName(basefont.getPostscriptFontName())));
		obj1 = ((Object) (((PdfDictionary) (ai)).getAsDict(PdfName.FONT)));
		s1 = ((String) (obj1));
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_247;
		s1 = ((String) (new PdfDictionary()));
		((PdfDictionary) (ai)).put(PdfName.FONT, ((PdfObject) (s1)));
		pdfindirectreference = (PdfIndirectReference)((PdfDictionary) (s1)).get(((PdfName) (s)));
		pdfdictionary = reader.getCatalog().getAsDict(PdfName.ACROFORM);
		markUsed(((PdfObject) (pdfdictionary)));
		ai = ((int []) (pdfdictionary.getAsDict(PdfName.DR)));
		obj1 = ((Object) (ai));
		if(ai != null)
			break MISSING_BLOCK_LABEL_316;
		obj1 = ((Object) (new PdfDictionary()));
		pdfdictionary.put(PdfName.DR, ((PdfObject) (obj1)));
		markUsed(((PdfObject) (obj1)));
		pdfdictionary = ((PdfDictionary) (obj1)).getAsDict(PdfName.FONT);
		ai = ((int []) (pdfdictionary));
		if(pdfdictionary != null)
			break MISSING_BLOCK_LABEL_360;
		ai = ((int []) (new PdfDictionary()));
		((PdfDictionary) (obj1)).put(PdfName.FONT, ((PdfObject) (ai)));
		markUsed(((PdfObject) (ai)));
		obj1 = ((Object) ((PdfIndirectReference)((PdfDictionary) (ai)).get(((PdfName) (s)))));
		if(obj1 == null) goto _L10; else goto _L9
_L9:
		if(pdfindirectreference != null)
			break MISSING_BLOCK_LABEL_394;
		((PdfDictionary) (s1)).put(((PdfName) (s)), ((PdfObject) (obj1)));
_L12:
		pdfappearance.getInternalBuffer().append(((PdfName) (s)).getBytes()).append(' ').append(((Float)aobj[1]).floatValue()).append(" Tf ");
		if(aobj[2] == null)
			break MISSING_BLOCK_LABEL_450;
		pdfappearance.setColorFill((BaseColor)aobj[2]);
		s = ((String) (new PdfString(pdfappearance.toString())));
		item.getMerged(i).put(PdfName.DA, ((PdfObject) (s)));
		item.getWidget(i).put(PdfName.DA, ((PdfObject) (s)));
		markUsed(((PdfObject) (item.getWidget(i))));
		  goto _L6
_L10:
		if(pdfindirectreference != null) goto _L12; else goto _L11
_L11:
		if(basefont.getFontType() != 4)
			break MISSING_BLOCK_LABEL_573;
		obj1 = ((Object) (new FontDetails(((PdfName) (null)), ((DocumentFont)basefont).getIndirectReference(), basefont)));
_L13:
		((PdfDictionary) (ai)).put(((PdfName) (s)), ((PdfObject) (((FontDetails) (obj1)).getIndirectReference())));
		((PdfDictionary) (s1)).put(((PdfName) (s)), ((PdfObject) (((FontDetails) (obj1)).getIndirectReference())));
		  goto _L12
		basefont.setSubset(false);
	//  260  573:aload           12
	//  261  575:iconst_0        
	//  262  576:invokevirtual   #1439 <Method void BaseFont.setSubset(boolean)>
		obj1 = ((Object) (writer.addSimple(basefont)));
	//  263  579:aload_0         
	//  264  580:getfield        #218 <Field PdfWriter writer>
	//  265  583:aload           12
	//  266  585:invokevirtual   #1443 <Method FontDetails PdfWriter.addSimple(BaseFont)>
	//  267  588:astore          6
		localFonts.put(((Object) (((PdfName) (s)).toString().substring(1))), ((Object) (basefont)));
	//  268  590:aload_0         
	//  269  591:getfield        #214 <Field HashMap localFonts>
	//  270  594:aload_1         
	//  271  595:invokevirtual   #997 <Method String PdfName.toString()>
	//  272  598:iconst_1        
	//  273  599:invokevirtual   #1266 <Method String String.substring(int)>
	//  274  602:aload           12
	//  275  604:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  276  607:pop             
		  goto _L13
	//* 277  608:goto            539
_L2:
		if(!s1.equalsIgnoreCase("textcolor")) goto _L15; else goto _L14
	//  278  611:aload_2         
	//  279  612:ldc2            #1445 <String "textcolor">
	//  280  615:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//  281  618:ifeq            793
_L14:
		i = 0;
	//  282  621:iconst_0        
	//  283  622:istore          5
_L40:
		if(i >= item.size()) goto _L4; else goto _L16
	//  284  624:iload           5
	//  285  626:aload           8
	//  286  628:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//  287  631:icmpge          1153
_L16:
		if(!insthit.isHit(i)) goto _L18; else goto _L17
	//  288  634:aload           9
	//  289  636:iload           5
	//  290  638:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//  291  641:ifeq            1164
_L17:
		s = ((String) (item.getMerged(i).getAsString(PdfName.DA)));
	//  292  644:aload           8
	//  293  646:iload           5
	//  294  648:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  295  651:getstatic       #518 <Field PdfName PdfName.DA>
	//  296  654:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//  297  657:astore_1        
		if(s == null) goto _L18; else goto _L19
	//  298  658:aload_1         
	//  299  659:ifnull          1164
_L19:
		s = ((String) (splitDAelements(((PdfString) (s)).toUnicodeString())));
	//  300  662:aload_1         
	//  301  663:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  302  666:invokestatic    #524 <Method Object[] splitDAelements(String)>
	//  303  669:astore_1        
		s1 = ((String) (new PdfAppearance()));
	//  304  670:new             #1318 <Class PdfAppearance>
	//  305  673:dup             
	//  306  674:invokespecial   #1393 <Method void PdfAppearance()>
	//  307  677:astore_2        
		if(s[0] == null) goto _L18; else goto _L20
	//  308  678:aload_1         
	//  309  679:iconst_0        
	//  310  680:aaload          
	//  311  681:ifnull          1164
_L20:
		((PdfAppearance) (s1)).getInternalBuffer().append((new PdfName((String)s[0])).getBytes()).append(' ').append(((Float)s[1]).floatValue()).append(" Tf ");
	//  312  684:aload_2         
	//  313  685:invokevirtual   #1401 <Method ByteBuffer PdfAppearance.getInternalBuffer()>
	//  314  688:new             #183 <Class PdfName>
	//  315  691:dup             
	//  316  692:aload_1         
	//  317  693:iconst_0        
	//  318  694:aaload          
	//  319  695:checkcast       #87  <Class String>
	//  320  698:invokespecial   #544 <Method void PdfName(String)>
	//  321  701:invokevirtual   #1405 <Method byte[] PdfName.getBytes()>
	//  322  704:invokevirtual   #1410 <Method ByteBuffer ByteBuffer.append(byte[])>
	//  323  707:bipush          32
	//  324  709:invokevirtual   #1413 <Method ByteBuffer ByteBuffer.append(char)>
	//  325  712:aload_1         
	//  326  713:iconst_1        
	//  327  714:aaload          
	//  328  715:checkcast       #402 <Class Float>
	//  329  718:invokevirtual   #414 <Method float Float.floatValue()>
	//  330  721:invokevirtual   #1416 <Method ByteBuffer ByteBuffer.append(float)>
	//  331  724:ldc2            #1418 <String " Tf ">
	//  332  727:invokevirtual   #1421 <Method ByteBuffer ByteBuffer.append(String)>
	//  333  730:pop             
		((PdfAppearance) (s1)).setColorFill((BaseColor)obj);
	//  334  731:aload_2         
	//  335  732:aload_3         
	//  336  733:checkcast       #423 <Class BaseColor>
	//  337  736:invokevirtual   #1424 <Method void PdfAppearance.setColorFill(BaseColor)>
		s = ((String) (new PdfString(((PdfAppearance) (s1)).toString())));
	//  338  739:new             #315 <Class PdfString>
	//  339  742:dup             
	//  340  743:aload_2         
	//  341  744:invokevirtual   #1425 <Method String PdfAppearance.toString()>
	//  342  747:invokespecial   #1426 <Method void PdfString(String)>
	//  343  750:astore_1        
		item.getMerged(i).put(PdfName.DA, ((PdfObject) (s)));
	//  344  751:aload           8
	//  345  753:iload           5
	//  346  755:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  347  758:getstatic       #518 <Field PdfName PdfName.DA>
	//  348  761:aload_1         
	//  349  762:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
		item.getWidget(i).put(PdfName.DA, ((PdfObject) (s)));
	//  350  765:aload           8
	//  351  767:iload           5
	//  352  769:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  353  772:getstatic       #518 <Field PdfName PdfName.DA>
	//  354  775:aload_1         
	//  355  776:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
		markUsed(((PdfObject) (item.getWidget(i))));
	//  356  779:aload_0         
	//  357  780:aload           8
	//  358  782:iload           5
	//  359  784:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  360  787:invokespecial   #247 <Method void markUsed(PdfObject)>
		  goto _L18
	//* 361  790:goto            1164
_L15:
		if(!s1.equalsIgnoreCase("textsize")) goto _L22; else goto _L21
	//  362  793:aload_2         
	//  363  794:ldc2            #1447 <String "textsize">
	//  364  797:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//  365  800:ifeq            981
_L21:
		i = 0;
	//  366  803:iconst_0        
	//  367  804:istore          5
_L41:
		if(i >= item.size()) goto _L4; else goto _L23
	//  368  806:iload           5
	//  369  808:aload           8
	//  370  810:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//  371  813:icmpge          1153
_L23:
		if(!insthit.isHit(i)) goto _L25; else goto _L24
	//  372  816:aload           9
	//  373  818:iload           5
	//  374  820:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//  375  823:ifeq            1173
_L24:
		s = ((String) (item.getMerged(i).getAsString(PdfName.DA)));
	//  376  826:aload           8
	//  377  828:iload           5
	//  378  830:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  379  833:getstatic       #518 <Field PdfName PdfName.DA>
	//  380  836:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//  381  839:astore_1        
		if(s == null) goto _L25; else goto _L26
	//  382  840:aload_1         
	//  383  841:ifnull          1173
_L26:
		s = ((String) (splitDAelements(((PdfString) (s)).toUnicodeString())));
	//  384  844:aload_1         
	//  385  845:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//  386  848:invokestatic    #524 <Method Object[] splitDAelements(String)>
	//  387  851:astore_1        
		s1 = ((String) (new PdfAppearance()));
	//  388  852:new             #1318 <Class PdfAppearance>
	//  389  855:dup             
	//  390  856:invokespecial   #1393 <Method void PdfAppearance()>
	//  391  859:astore_2        
		if(s[0] == null) goto _L25; else goto _L27
	//  392  860:aload_1         
	//  393  861:iconst_0        
	//  394  862:aaload          
	//  395  863:ifnull          1173
_L27:
		((PdfAppearance) (s1)).getInternalBuffer().append((new PdfName((String)s[0])).getBytes()).append(' ').append(((Float)obj).floatValue()).append(" Tf ");
	//  396  866:aload_2         
	//  397  867:invokevirtual   #1401 <Method ByteBuffer PdfAppearance.getInternalBuffer()>
	//  398  870:new             #183 <Class PdfName>
	//  399  873:dup             
	//  400  874:aload_1         
	//  401  875:iconst_0        
	//  402  876:aaload          
	//  403  877:checkcast       #87  <Class String>
	//  404  880:invokespecial   #544 <Method void PdfName(String)>
	//  405  883:invokevirtual   #1405 <Method byte[] PdfName.getBytes()>
	//  406  886:invokevirtual   #1410 <Method ByteBuffer ByteBuffer.append(byte[])>
	//  407  889:bipush          32
	//  408  891:invokevirtual   #1413 <Method ByteBuffer ByteBuffer.append(char)>
	//  409  894:aload_3         
	//  410  895:checkcast       #402 <Class Float>
	//  411  898:invokevirtual   #414 <Method float Float.floatValue()>
	//  412  901:invokevirtual   #1416 <Method ByteBuffer ByteBuffer.append(float)>
	//  413  904:ldc2            #1418 <String " Tf ">
	//  414  907:invokevirtual   #1421 <Method ByteBuffer ByteBuffer.append(String)>
	//  415  910:pop             
		if(s[2] == null)
			break MISSING_BLOCK_LABEL_927;
	//  416  911:aload_1         
	//  417  912:iconst_2        
	//  418  913:aaload          
	//  419  914:ifnull          927
		((PdfAppearance) (s1)).setColorFill((BaseColor)s[2]);
	//  420  917:aload_2         
	//  421  918:aload_1         
	//  422  919:iconst_2        
	//  423  920:aaload          
	//  424  921:checkcast       #423 <Class BaseColor>
	//  425  924:invokevirtual   #1424 <Method void PdfAppearance.setColorFill(BaseColor)>
		s = ((String) (new PdfString(((PdfAppearance) (s1)).toString())));
	//  426  927:new             #315 <Class PdfString>
	//  427  930:dup             
	//  428  931:aload_2         
	//  429  932:invokevirtual   #1425 <Method String PdfAppearance.toString()>
	//  430  935:invokespecial   #1426 <Method void PdfString(String)>
	//  431  938:astore_1        
		item.getMerged(i).put(PdfName.DA, ((PdfObject) (s)));
	//  432  939:aload           8
	//  433  941:iload           5
	//  434  943:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  435  946:getstatic       #518 <Field PdfName PdfName.DA>
	//  436  949:aload_1         
	//  437  950:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
		item.getWidget(i).put(PdfName.DA, ((PdfObject) (s)));
	//  438  953:aload           8
	//  439  955:iload           5
	//  440  957:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  441  960:getstatic       #518 <Field PdfName PdfName.DA>
	//  442  963:aload_1         
	//  443  964:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
		markUsed(((PdfObject) (item.getWidget(i))));
	//  444  967:aload_0         
	//  445  968:aload           8
	//  446  970:iload           5
	//  447  972:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  448  975:invokespecial   #247 <Method void markUsed(PdfObject)>
		  goto _L25
	//* 449  978:goto            1173
_L22:
		if(!s1.equalsIgnoreCase("bgcolor") && !s1.equalsIgnoreCase("bordercolor")) goto _L29; else goto _L28
	//  450  981:aload_2         
	//  451  982:ldc2            #1449 <String "bgcolor">
	//  452  985:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//  453  988:ifne            1001
	//  454  991:aload_2         
	//  455  992:ldc2            #1451 <String "bordercolor">
	//  456  995:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//  457  998:ifeq            1151
_L28:
		if(!s1.equalsIgnoreCase("bgcolor")) goto _L31; else goto _L30
	//  458 1001:aload_2         
	//  459 1002:ldc2            #1449 <String "bgcolor">
	//  460 1005:invokevirtual   #1376 <Method boolean String.equalsIgnoreCase(String)>
	//  461 1008:ifeq            1062
_L30:
		s = ((String) (PdfName.BG));
	//  462 1011:getstatic       #616 <Field PdfName PdfName.BG>
	//  463 1014:astore_1        
		  goto _L32
	//* 464 1015:goto            1182
_L42:
		if(i >= item.size()) goto _L4; else goto _L33
	//  465 1018:iload           5
	//  466 1020:aload           8
	//  467 1022:invokevirtual   #503 <Method int AcroFields$Item.size()>
	//  468 1025:icmpge          1153
_L33:
		if(!insthit.isHit(i))
			break MISSING_BLOCK_LABEL_1188;
	//  469 1028:aload           9
	//  470 1030:iload           5
	//  471 1032:invokevirtual   #1379 <Method boolean AcroFields$InstHit.isHit(int)>
	//  472 1035:ifeq            1188
		s1 = ((String) (item.getMerged(i).getAsDict(PdfName.MK)));
	//  473 1038:aload           8
	//  474 1040:iload           5
	//  475 1042:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  476 1045:getstatic       #187 <Field PdfName PdfName.MK>
	//  477 1048:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//  478 1051:astore_2        
		if(s1 != null) goto _L35; else goto _L34
	//  479 1052:aload_2         
	//  480 1053:ifnonnull       1128
_L34:
		if(obj == null)
	//* 481 1056:aload_3         
	//* 482 1057:ifnonnull       1069
			return true;
	//  483 1060:iconst_1        
	//  484 1061:ireturn         
		  goto _L36
_L31:
		s = ((String) (PdfName.BC));
	//  485 1062:getstatic       #603 <Field PdfName PdfName.BC>
	//  486 1065:astore_1        
		  goto _L32
	//* 487 1066:goto            1182
_L36:
		s1 = ((String) (new PdfDictionary()));
	//  488 1069:new             #254 <Class PdfDictionary>
	//  489 1072:dup             
	//  490 1073:invokespecial   #811 <Method void PdfDictionary()>
	//  491 1076:astore_2        
		item.getMerged(i).put(PdfName.MK, ((PdfObject) (s1)));
	//  492 1077:aload           8
	//  493 1079:iload           5
	//  494 1081:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//  495 1084:getstatic       #187 <Field PdfName PdfName.MK>
	//  496 1087:aload_2         
	//  497 1088:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
		item.getWidget(i).put(PdfName.MK, ((PdfObject) (s1)));
	//  498 1091:aload           8
	//  499 1093:iload           5
	//  500 1095:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  501 1098:getstatic       #187 <Field PdfName PdfName.MK>
	//  502 1101:aload_2         
	//  503 1102:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
		markUsed(((PdfObject) (item.getWidget(i))));
	//  504 1105:aload_0         
	//  505 1106:aload           8
	//  506 1108:iload           5
	//  507 1110:invokevirtual   #508 <Method PdfDictionary AcroFields$Item.getWidget(int)>
	//  508 1113:invokespecial   #247 <Method void markUsed(PdfObject)>
_L38:
		if(obj != null)
			break; /* Loop/switch isn't completed */
	//  509 1116:aload_3         
	//  510 1117:ifnonnull       1136
		((PdfDictionary) (s1)).remove(((PdfName) (s)));
	//  511 1120:aload_2         
	//  512 1121:aload_1         
	//  513 1122:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
		break MISSING_BLOCK_LABEL_1188;
	//  514 1125:goto            1188
_L35:
		markUsed(((PdfObject) (s1)));
	//  515 1128:aload_0         
	//  516 1129:aload_2         
	//  517 1130:invokespecial   #247 <Method void markUsed(PdfObject)>
		if(true) goto _L38; else goto _L37
	//  518 1133:goto            1116
_L37:
		((PdfDictionary) (s1)).put(((PdfName) (s)), ((PdfObject) (PdfFormField.getMKColor((BaseColor)obj))));
	//  519 1136:aload_2         
	//  520 1137:aload_1         
	//  521 1138:aload_3         
	//  522 1139:checkcast       #423 <Class BaseColor>
	//  523 1142:invokestatic    #1454 <Method PdfArray PdfFormField.getMKColor(BaseColor)>
	//  524 1145:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
		break MISSING_BLOCK_LABEL_1188;
	//  525 1148:goto            1188
_L29:
		return false;
	//  526 1151:iconst_0        
	//  527 1152:ireturn         
_L4:
		return true;
	//  528 1153:iconst_1        
	//  529 1154:ireturn         
_L6:
		i++;
	//  530 1155:iload           5
	//  531 1157:iconst_1        
	//  532 1158:iadd            
	//  533 1159:istore          5
		  goto _L39
	//* 534 1161:goto            71
_L18:
		i++;
	//  535 1164:iload           5
	//  536 1166:iconst_1        
	//  537 1167:iadd            
	//  538 1168:istore          5
		  goto _L40
	//* 539 1170:goto            624
_L25:
		i++;
	//  540 1173:iload           5
	//  541 1175:iconst_1        
	//  542 1176:iadd            
	//  543 1177:istore          5
		  goto _L41
	//* 544 1179:goto            806
_L32:
		i = 0;
	//  545 1182:iconst_0        
	//  546 1183:istore          5
		  goto _L42
	//* 547 1185:goto            1018
		i++;
	//  548 1188:iload           5
	//  549 1190:iconst_1        
	//  550 1191:iadd            
	//  551 1192:istore          5
		  goto _L42
	//* 552 1194:goto            1018
	}

	public boolean setFieldRichValue(String s, String s1)
		throws DocumentException, IOException
	{
		Item item;
		if(writer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field PdfWriter writer>
	//*   2    4:ifnonnull       25
			throw new DocumentException(MessageLocalization.getComposedMessage("this.acrofields.instance.is.read.only", new Object[0]));
	//    3    7:new             #515 <Class DocumentException>
	//    4   10:dup             
	//    5   11:ldc2            #1289 <String "this.acrofields.instance.is.read.only">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #961 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #962 <Method void DocumentException(String)>
	//   10   24:athrow          
		item = getFieldItem(s);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokevirtual   #284 <Method AcroFields$Item getFieldItem(String)>
	//   14   30:astore          4
		break MISSING_BLOCK_LABEL_32;
		if(item != null && getFieldType(s) == 4)
	//*  15   32:aload           4
	//*  16   34:ifnonnull       39
	//*  17   37:iconst_0        
	//*  18   38:ireturn         
	//*  19   39:aload_0         
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #1111 <Method int getFieldType(String)>
	//*  22   44:iconst_4        
	//*  23   45:icmpne          37
		{
			s = ((String) (item.getMerged(0).getAsNumber(PdfName.FF)));
	//   24   48:aload           4
	//   25   50:iconst_0        
	//   26   51:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   27   54:getstatic       #192 <Field PdfName PdfName.FF>
	//   28   57:invokevirtual   #626 <Method PdfNumber PdfDictionary.getAsNumber(PdfName)>
	//   29   60:astore_1        
			int i = 0;
	//   30   61:iconst_0        
	//   31   62:istore_3        
			if(s != null)
	//*  32   63:aload_1         
	//*  33   64:ifnull          72
				i = ((PdfNumber) (s)).intValue();
	//   34   67:aload_1         
	//   35   68:invokevirtual   #629 <Method int PdfNumber.intValue()>
	//   36   71:istore_3        
			if((0x2000000 & i) != 0)
	//*  37   72:ldc2            #1456 <Int 0x2000000>
	//*  38   75:iload_3         
	//*  39   76:iand            
	//*  40   77:ifeq            37
			{
				s = ((String) (new PdfString(s1)));
	//   41   80:new             #315 <Class PdfString>
	//   42   83:dup             
	//   43   84:aload_2         
	//   44   85:invokespecial   #1426 <Method void PdfString(String)>
	//   45   88:astore_1        
				item.writeToAll(PdfName.RV, ((PdfObject) (s)), 5);
	//   46   89:aload           4
	//   47   91:getstatic       #1084 <Field PdfName PdfName.RV>
	//   48   94:aload_1         
	//   49   95:iconst_5        
	//   50   96:invokevirtual   #1275 <Method void AcroFields$Item.writeToAll(PdfName, PdfObject, int)>
				s = ((String) (new PdfString(XmlToTxt.parse(((InputStream) (new ByteArrayInputStream(s1.getBytes())))))));
	//   51   99:new             #315 <Class PdfString>
	//   52  102:dup             
	//   53  103:new             #1458 <Class ByteArrayInputStream>
	//   54  106:dup             
	//   55  107:aload_2         
	//   56  108:invokevirtual   #1459 <Method byte[] String.getBytes()>
	//   57  111:invokespecial   #1460 <Method void ByteArrayInputStream(byte[])>
	//   58  114:invokestatic    #1466 <Method String XmlToTxt.parse(InputStream)>
	//   59  117:invokespecial   #1426 <Method void PdfString(String)>
	//   60  120:astore_1        
				item.writeToAll(PdfName.V, ((PdfObject) (s)), 5);
	//   61  121:aload           4
	//   62  123:getstatic       #264 <Field PdfName PdfName.V>
	//   63  126:aload_1         
	//   64  127:iconst_5        
	//   65  128:invokevirtual   #1275 <Method void AcroFields$Item.writeToAll(PdfName, PdfObject, int)>
				return true;
	//   66  131:iconst_1        
	//   67  132:ireturn         
			}
		}
		return false;
	}

	public void setFields(FdfReader fdfreader)
		throws IOException, DocumentException
	{
		Iterator iterator = fdfreader.getFields().keySet().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1472 <Method HashMap FdfReader.getFields()>
	//    2    4:invokevirtual   #1473 <Method Set HashMap.keySet()>
	//    3    7:invokeinterface #708 <Method Iterator Set.iterator()>
	//    4   12:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   13:aload_2         
	//    6   14:invokeinterface #713 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            55
			String s = (String)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #717 <Method Object Iterator.next()>
	//   10   28:checkcast       #87  <Class String>
	//   11   31:astore_3        
			String s1 = fdfreader.getFieldValue(s);
	//   12   32:aload_1         
	//   13   33:aload_3         
	//   14   34:invokevirtual   #1476 <Method String FdfReader.getFieldValue(String)>
	//   15   37:astore          4
			if(s1 != null)
	//*  16   39:aload           4
	//*  17   41:ifnull          13
				setField(s, s1);
	//   18   44:aload_0         
	//   19   45:aload_3         
	//   20   46:aload           4
	//   21   48:invokevirtual   #1223 <Method boolean setField(String, String)>
	//   22   51:pop             
		} while(true);
	//   23   52:goto            13
	//   24   55:return          
	}

	public void setFields(XfdfReader xfdfreader)
		throws IOException, DocumentException
	{
		Iterator iterator = xfdfreader.getFields().keySet().iterator();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1480 <Method HashMap XfdfReader.getFields()>
	//    2    4:invokevirtual   #1473 <Method Set HashMap.keySet()>
	//    3    7:invokeinterface #708 <Method Iterator Set.iterator()>
	//    4   12:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   13:aload_2         
	//    6   14:invokeinterface #713 <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            94
			Object obj = ((Object) ((String)iterator.next()));
	//    8   22:aload_2         
	//    9   23:invokeinterface #717 <Method Object Iterator.next()>
	//   10   28:checkcast       #87  <Class String>
	//   11   31:astore          4
			String s = xfdfreader.getFieldValue(((String) (obj)));
	//   12   33:aload_1         
	//   13   34:aload           4
	//   14   36:invokevirtual   #1481 <Method String XfdfReader.getFieldValue(String)>
	//   15   39:astore_3        
			if(s != null)
	//*  16   40:aload_3         
	//*  17   41:ifnull          52
				setField(((String) (obj)), s);
	//   18   44:aload_0         
	//   19   45:aload           4
	//   20   47:aload_3         
	//   21   48:invokevirtual   #1223 <Method boolean setField(String, String)>
	//   22   51:pop             
			obj = ((Object) (xfdfreader.getListValues(((String) (obj)))));
	//   23   52:aload_1         
	//   24   53:aload           4
	//   25   55:invokevirtual   #1484 <Method List XfdfReader.getListValues(String)>
	//   26   58:astore          4
			if(obj != null)
	//*  27   60:aload           4
	//*  28   62:ifnull          13
				setListSelection(s, (String[])((List) (obj)).toArray(((Object []) (new String[((List) (obj)).size()]))));
	//   29   65:aload_0         
	//   30   66:aload_3         
	//   31   67:aload           4
	//   32   69:aload           4
	//   33   71:invokeinterface #1485 <Method int List.size()>
	//   34   76:anewarray       String[]
	//   35   79:invokeinterface #1486 <Method Object[] List.toArray(Object[])>
	//   36   84:checkcast       #594 <Class String[]>
	//   37   87:invokevirtual   #1490 <Method boolean setListSelection(String, String[])>
	//   38   90:pop             
		} while(true);
	//   39   91:goto            13
	//   40   94:return          
	}

	public void setGenerateAppearances(boolean flag)
	{
		generateAppearances = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #212 <Field boolean generateAppearances>
		PdfDictionary pdfdictionary = reader.getCatalog().getAsDict(PdfName.ACROFORM);
	//    3    5:aload_0         
	//    4    6:getfield        #216 <Field PdfReader reader>
	//    5    9:invokevirtual   #758 <Method PdfDictionary PdfReader.getCatalog()>
	//    6   12:getstatic       #761 <Field PdfName PdfName.ACROFORM>
	//    7   15:invokevirtual   #540 <Method PdfDictionary PdfDictionary.getAsDict(PdfName)>
	//    8   18:astore_2        
		if(flag)
	//*   9   19:iload_1         
	//*  10   20:ifeq            31
		{
			pdfdictionary.remove(PdfName.NEEDAPPEARANCES);
	//   11   23:aload_2         
	//   12   24:getstatic       #767 <Field PdfName PdfName.NEEDAPPEARANCES>
	//   13   27:invokevirtual   #258 <Method void PdfDictionary.remove(PdfName)>
			return;
	//   14   30:return          
		} else
		{
			pdfdictionary.put(PdfName.NEEDAPPEARANCES, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   15   31:aload_2         
	//   16   32:getstatic       #767 <Field PdfName PdfName.NEEDAPPEARANCES>
	//   17   35:getstatic       #1494 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   18   38:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
			return;
	//   19   41:return          
		}
	}

	public boolean setListOption(String s, String as[], String as1[])
	{
		if(as != null || as1 != null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnonnull       10
	//    2    4:aload_3         
	//    3    5:ifnonnull       10
_L1:
		return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
_L2:
		int i;
		if(as != null && as1 != null && as.length != as1.length)
	//*   6   10:aload_2         
	//*   7   11:ifnull          43
	//*   8   14:aload_3         
	//*   9   15:ifnull          43
	//*  10   18:aload_2         
	//*  11   19:arraylength     
	//*  12   20:aload_3         
	//*  13   21:arraylength     
	//*  14   22:icmpeq          43
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.export.and.the.display.array.must.have.the.same.size", new Object[0]));
	//   15   25:new             #1498 <Class IllegalArgumentException>
	//   16   28:dup             
	//   17   29:ldc2            #1500 <String "the.export.and.the.display.array.must.have.the.same.size">
	//   18   32:iconst_0        
	//   19   33:anewarray       Object[]
	//   20   36:invokestatic    #961 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   21   39:invokespecial   #1501 <Method void IllegalArgumentException(String)>
	//   22   42:athrow          
		i = getFieldType(s);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #1111 <Method int getFieldType(String)>
	//   26   48:istore          4
		if(i != 6 && i != 5) goto _L1; else goto _L3
	//   27   50:iload           4
	//   28   52:bipush          6
	//   29   54:icmpeq          63
	//   30   57:iload           4
	//   31   59:iconst_5        
	//   32   60:icmpne          8
_L3:
		PdfArray pdfarray;
		Item item;
		item = (Item)fields.get(((Object) (s)));
	//   33   63:aload_0         
	//   34   64:getfield        #494 <Field Map fields>
	//   35   67:aload_1         
	//   36   68:invokeinterface #499 <Method Object Map.get(Object)>
	//   37   73:checkcast       #14  <Class AcroFields$Item>
	//   38   76:astore          6
		pdfarray = null;
	//   39   78:aconst_null     
	//   40   79:astore          5
		if(as != null || as1 == null) goto _L5; else goto _L4
	//   41   81:aload_2         
	//   42   82:ifnonnull       143
	//   43   85:aload_3         
	//   44   86:ifnull          143
_L4:
		s = ((String) (as1));
	//   45   89:aload_3         
	//   46   90:astore_1        
_L7:
		pdfarray = new PdfArray();
	//   47   91:new             #297 <Class PdfArray>
	//   48   94:dup             
	//   49   95:invokespecial   #1502 <Method void PdfArray()>
	//   50   98:astore          5
		if(s == null)
			break; /* Loop/switch isn't completed */
	//   51  100:aload_1         
	//   52  101:ifnull          162
		for(int j = 0; j < s.length; j++)
	//*  53  104:iconst_0        
	//*  54  105:istore          4
	//*  55  107:iload           4
	//*  56  109:aload_1         
	//*  57  110:arraylength     
	//*  58  111:icmpge          234
			pdfarray.add(((PdfObject) (new PdfString(((String) (s[j])), "UnicodeBig"))));
	//   59  114:aload           5
	//   60  116:new             #315 <Class PdfString>
	//   61  119:dup             
	//   62  120:aload_1         
	//   63  121:iload           4
	//   64  123:aaload          
	//   65  124:ldc2            #1268 <String "UnicodeBig">
	//   66  127:invokespecial   #1271 <Method void PdfString(String, String)>
	//   67  130:invokevirtual   #1505 <Method boolean PdfArray.add(PdfObject)>
	//   68  133:pop             

	//   69  134:iload           4
	//   70  136:iconst_1        
	//   71  137:iadd            
	//   72  138:istore          4
		break MISSING_BLOCK_LABEL_234;
	//   73  140:goto            107
_L5:
		s = ((String) (pdfarray));
	//   74  143:aload           5
	//   75  145:astore_1        
		if(as != null)
	//*  76  146:aload_2         
	//*  77  147:ifnull          91
		{
			s = ((String) (pdfarray));
	//   78  150:aload           5
	//   79  152:astore_1        
			if(as1 == null)
	//*  80  153:aload_3         
	//*  81  154:ifnonnull       91
				s = ((String) (as));
	//   82  157:aload_2         
	//   83  158:astore_1        
		}
		if(true) goto _L7; else goto _L6
	//   84  159:goto            91
_L6:
		for(int k = 0; k < as.length; k++)
	//*  85  162:iconst_0        
	//*  86  163:istore          4
	//*  87  165:iload           4
	//*  88  167:aload_2         
	//*  89  168:arraylength     
	//*  90  169:icmpge          234
		{
			s = ((String) (new PdfArray()));
	//   91  172:new             #297 <Class PdfArray>
	//   92  175:dup             
	//   93  176:invokespecial   #1502 <Method void PdfArray()>
	//   94  179:astore_1        
			((PdfArray) (s)).add(((PdfObject) (new PdfString(as[k], "UnicodeBig"))));
	//   95  180:aload_1         
	//   96  181:new             #315 <Class PdfString>
	//   97  184:dup             
	//   98  185:aload_2         
	//   99  186:iload           4
	//  100  188:aaload          
	//  101  189:ldc2            #1268 <String "UnicodeBig">
	//  102  192:invokespecial   #1271 <Method void PdfString(String, String)>
	//  103  195:invokevirtual   #1505 <Method boolean PdfArray.add(PdfObject)>
	//  104  198:pop             
			((PdfArray) (s)).add(((PdfObject) (new PdfString(as1[k], "UnicodeBig"))));
	//  105  199:aload_1         
	//  106  200:new             #315 <Class PdfString>
	//  107  203:dup             
	//  108  204:aload_3         
	//  109  205:iload           4
	//  110  207:aaload          
	//  111  208:ldc2            #1268 <String "UnicodeBig">
	//  112  211:invokespecial   #1271 <Method void PdfString(String, String)>
	//  113  214:invokevirtual   #1505 <Method boolean PdfArray.add(PdfObject)>
	//  114  217:pop             
			pdfarray.add(((PdfObject) (s)));
	//  115  218:aload           5
	//  116  220:aload_1         
	//  117  221:invokevirtual   #1505 <Method boolean PdfArray.add(PdfObject)>
	//  118  224:pop             
		}

	//  119  225:iload           4
	//  120  227:iconst_1        
	//  121  228:iadd            
	//  122  229:istore          4
	//* 123  231:goto            165
		item.writeToAll(PdfName.OPT, ((PdfObject) (pdfarray)), 5);
	//  124  234:aload           6
	//  125  236:getstatic       #291 <Field PdfName PdfName.OPT>
	//  126  239:aload           5
	//  127  241:iconst_5        
	//  128  242:invokevirtual   #1275 <Method void AcroFields$Item.writeToAll(PdfName, PdfObject, int)>
		return true;
	//  129  245:iconst_1        
	//  130  246:ireturn         
	}

	public boolean setListSelection(String s, String as[])
		throws IOException, DocumentException
	{
		Item item = getFieldItem(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #284 <Method AcroFields$Item getFieldItem(String)>
	//    3    5:astore          6
		if(item == null)
	//*   4    7:aload           6
	//*   5    9:ifnonnull       14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		PdfDictionary pdfdictionary = item.getMerged(0);
	//    8   14:aload           6
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #288 <Method PdfDictionary AcroFields$Item.getMerged(int)>
	//   11   20:astore          7
		PdfName pdfname = pdfdictionary.getAsName(PdfName.FT);
	//   12   22:aload           7
	//   13   24:getstatic       #875 <Field PdfName PdfName.FT>
	//   14   27:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   15   30:astore          8
		if(!PdfName.CH.equals(((Object) (pdfname))))
	//*  16   32:getstatic       #953 <Field PdfName PdfName.CH>
	//*  17   35:aload           8
	//*  18   37:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//*  19   40:ifne            45
			return false;
	//   20   43:iconst_0        
	//   21   44:ireturn         
		String as1[] = getListOptionExport(s);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:invokevirtual   #1095 <Method String[] getListOptionExport(String)>
	//   25   50:astore          8
		PdfArray pdfarray1 = new PdfArray();
	//   26   52:new             #297 <Class PdfArray>
	//   27   55:dup             
	//   28   56:invokespecial   #1502 <Method void PdfArray()>
	//   29   59:astore          9
		int l = as.length;
	//   30   61:aload_2         
	//   31   62:arraylength     
	//   32   63:istore          5
		int i = 0;
	//   33   65:iconst_0        
	//   34   66:istore_3        
label0:
		do
		{
			if(i < l)
	//*  35   67:iload_3         
	//*  36   68:iload           5
	//*  37   70:icmpge          133
			{
				String s1 = as[i];
	//   38   73:aload_2         
	//   39   74:iload_3         
	//   40   75:aaload          
	//   41   76:astore          10
				int k = 0;
	//   42   78:iconst_0        
	//   43   79:istore          4
				do
				{
label1:
					{
						if(k < as1.length)
	//*  44   81:iload           4
	//*  45   83:aload           8
	//*  46   85:arraylength     
	//*  47   86:icmpge          117
						{
							if(!as1[k].equals(((Object) (s1))))
								break label1;
	//   48   89:aload           8
	//   49   91:iload           4
	//   50   93:aaload          
	//   51   94:aload           10
	//   52   96:invokevirtual   #395 <Method boolean String.equals(Object)>
	//   53   99:ifeq            124
							pdfarray1.add(((PdfObject) (new PdfNumber(k))));
	//   54  102:aload           9
	//   55  104:new             #272 <Class PdfNumber>
	//   56  107:dup             
	//   57  108:iload           4
	//   58  110:invokespecial   #275 <Method void PdfNumber(int)>
	//   59  113:invokevirtual   #1505 <Method boolean PdfArray.add(PdfObject)>
	//   60  116:pop             
						}
						i++;
	//   61  117:iload_3         
	//   62  118:iconst_1        
	//   63  119:iadd            
	//   64  120:istore_3        
						continue label0;
	//   65  121:goto            67
					}
					k++;
	//   66  124:iload           4
	//   67  126:iconst_1        
	//   68  127:iadd            
	//   69  128:istore          4
				} while(true);
	//   70  130:goto            81
			}
			item.writeToAll(PdfName.I, ((PdfObject) (pdfarray1)), 5);
	//   71  133:aload           6
	//   72  135:getstatic       #682 <Field PdfName PdfName.I>
	//   73  138:aload           9
	//   74  140:iconst_5        
	//   75  141:invokevirtual   #1275 <Method void AcroFields$Item.writeToAll(PdfName, PdfObject, int)>
			PdfArray pdfarray = new PdfArray();
	//   76  144:new             #297 <Class PdfArray>
	//   77  147:dup             
	//   78  148:invokespecial   #1502 <Method void PdfArray()>
	//   79  151:astore          8
			for(int j = 0; j < as.length; j++)
	//*  80  153:iconst_0        
	//*  81  154:istore_3        
	//*  82  155:iload_3         
	//*  83  156:aload_2         
	//*  84  157:arraylength     
	//*  85  158:icmpge          184
				pdfarray.add(((PdfObject) (new PdfString(as[j]))));
	//   86  161:aload           8
	//   87  163:new             #315 <Class PdfString>
	//   88  166:dup             
	//   89  167:aload_2         
	//   90  168:iload_3         
	//   91  169:aaload          
	//   92  170:invokespecial   #1426 <Method void PdfString(String)>
	//   93  173:invokevirtual   #1505 <Method boolean PdfArray.add(PdfObject)>
	//   94  176:pop             

	//   95  177:iload_3         
	//   96  178:iconst_1        
	//   97  179:iadd            
	//   98  180:istore_3        
	//*  99  181:goto            155
			item.writeToAll(PdfName.V, ((PdfObject) (pdfarray)), 5);
	//  100  184:aload           6
	//  101  186:getstatic       #264 <Field PdfName PdfName.V>
	//  102  189:aload           8
	//  103  191:iconst_5        
	//  104  192:invokevirtual   #1275 <Method void AcroFields$Item.writeToAll(PdfName, PdfObject, int)>
			s = ((String) (getAppearance(pdfdictionary, as, s)));
	//  105  195:aload_0         
	//  106  196:aload           7
	//  107  198:aload_2         
	//  108  199:aload_1         
	//  109  200:invokevirtual   #872 <Method PdfAppearance getAppearance(PdfDictionary, String[], String)>
	//  110  203:astore_1        
			as = ((String []) (new PdfDictionary()));
	//  111  204:new             #254 <Class PdfDictionary>
	//  112  207:dup             
	//  113  208:invokespecial   #811 <Method void PdfDictionary()>
	//  114  211:astore_2        
			((PdfDictionary) (as)).put(PdfName.N, ((PdfObject) (((PdfAppearance) (s)).getIndirectReference())));
	//  115  212:aload_2         
	//  116  213:getstatic       #993 <Field PdfName PdfName.N>
	//  117  216:aload_1         
	//  118  217:invokevirtual   #1322 <Method PdfIndirectReference PdfAppearance.getIndirectReference()>
	//  119  220:invokevirtual   #278 <Method void PdfDictionary.put(PdfName, PdfObject)>
			item.writeToAll(PdfName.AP, ((PdfObject) (as)), 3);
	//  120  223:aload           6
	//  121  225:getstatic       #252 <Field PdfName PdfName.AP>
	//  122  228:aload_2         
	//  123  229:iconst_3        
	//  124  230:invokevirtual   #1275 <Method void AcroFields$Item.writeToAll(PdfName, PdfObject, int)>
			writer.releaseTemplate(((PdfTemplate) (s)));
	//  125  233:aload_0         
	//  126  234:getfield        #218 <Field PdfWriter writer>
	//  127  237:aload_1         
	//  128  238:invokevirtual   #1328 <Method void PdfWriter.releaseTemplate(PdfTemplate)>
			item.markUsed(this, 6);
	//  129  241:aload           6
	//  130  243:aload_0         
	//  131  244:bipush          6
	//  132  246:invokevirtual   #502 <Method void AcroFields$Item.markUsed(AcroFields, int)>
			return true;
	//  133  249:iconst_1        
	//  134  250:ireturn         
		} while(true);
	}

	public void setSubstitutionFonts(ArrayList arraylist)
	{
		substitutionFonts = arraylist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #481 <Field ArrayList substitutionFonts>
	//    3    5:return          
	}

	public boolean signatureCoversWholeDocument(String s)
	{
		getSignatureNames();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #489 <Method ArrayList getSignatureNames()>
	//    2    4:pop             
		s = getTranslatedFieldName(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #744 <Method String getTranslatedFieldName(String)>
	//    6   10:astore_1        
		if(!sigNames.containsKey(((Object) (s))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #485 <Field HashMap sigNames>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #492 <Method boolean HashMap.containsKey(Object)>
	//*  11   19:ifne            24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		boolean flag;
		if((long)((int[])sigNames.get(((Object) (s))))[0] == reader.getFileLength())
	//*  14   24:aload_0         
	//*  15   25:getfield        #485 <Field HashMap sigNames>
	//*  16   28:aload_1         
	//*  17   29:invokevirtual   #571 <Method Object HashMap.get(Object)>
	//*  18   32:checkcast       #746 <Class int[]>
	//*  19   35:iconst_0        
	//*  20   36:iaload          
	//*  21   37:i2l             
	//*  22   38:aload_0         
	//*  23   39:getfield        #216 <Field PdfReader reader>
	//*  24   42:invokevirtual   #1194 <Method long PdfReader.getFileLength()>
	//*  25   45:lcmp            
	//*  26   46:ifne            53
			flag = true;
	//   27   49:iconst_1        
	//   28   50:istore_2        
		else
	//*  29   51:iload_2         
	//*  30   52:ireturn         
			flag = false;
	//   31   53:iconst_0        
	//   32   54:istore_2        
		return flag;
	//*  33   55:goto            51
	}

	public PdfPKCS7 verifySignature(String s)
	{
		return verifySignature(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #1512 <Method PdfPKCS7 verifySignature(String, String)>
	//    4    6:areturn         
	}

	public PdfPKCS7 verifySignature(String s, String s1)
	{
		PdfDictionary pdfdictionary = getSignatureDictionary(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1514 <Method PdfDictionary getSignatureDictionary(String)>
	//    3    5:astore          4
		if(pdfdictionary != null) goto _L2; else goto _L1
	//    4    7:aload           4
	//    5    9:ifnonnull       16
_L1:
		s1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
_L10:
		return ((PdfPKCS7) (s1));
	//    8   14:aload_2         
	//    9   15:areturn         
_L2:
		PdfString pdfstring1;
		s = ((String) (pdfdictionary.getAsName(PdfName.SUBFILTER)));
	//   10   16:aload           4
	//   11   18:getstatic       #1517 <Field PdfName PdfName.SUBFILTER>
	//   12   21:invokevirtual   #659 <Method PdfName PdfDictionary.getAsName(PdfName)>
	//   13   24:astore_1        
		pdfstring1 = pdfdictionary.getAsString(PdfName.CONTENTS);
	//   14   25:aload           4
	//   15   27:getstatic       #1176 <Field PdfName PdfName.CONTENTS>
	//   16   30:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   17   33:astore          5
		if(!((PdfName) (s)).equals(((Object) (PdfName.ADBE_X509_RSA_SHA1)))) goto _L4; else goto _L3
	//   18   35:aload_1         
	//   19   36:getstatic       #1520 <Field PdfName PdfName.ADBE_X509_RSA_SHA1>
	//   20   39:invokevirtual   #663 <Method boolean PdfName.equals(Object)>
	//   21   42:ifeq            212
_L3:
		PdfString pdfstring = pdfdictionary.getAsString(PdfName.CERT);
	//   22   45:aload           4
	//   23   47:getstatic       #1523 <Field PdfName PdfName.CERT>
	//   24   50:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   25   53:astore_3        
		s = ((String) (pdfstring));
	//   26   54:aload_3         
	//   27   55:astore_1        
		if(pdfstring != null)
			break MISSING_BLOCK_LABEL_73;
	//   28   56:aload_3         
	//   29   57:ifnonnull       73
		s = ((String) (pdfdictionary.getAsArray(PdfName.CERT).getAsString(0)));
	//   30   60:aload           4
	//   31   62:getstatic       #1523 <Field PdfName PdfName.CERT>
	//   32   65:invokevirtual   #295 <Method PdfArray PdfDictionary.getAsArray(PdfName)>
	//   33   68:iconst_0        
	//   34   69:invokevirtual   #966 <Method PdfString PdfArray.getAsString(int)>
	//   35   72:astore_1        
		s = ((String) (new PdfPKCS7(pdfstring1.getOriginalBytes(), ((PdfString) (s)).getBytes(), s1)));
	//   36   73:new             #470 <Class PdfPKCS7>
	//   37   76:dup             
	//   38   77:aload           5
	//   39   79:invokevirtual   #1526 <Method byte[] PdfString.getOriginalBytes()>
	//   40   82:aload_1         
	//   41   83:invokevirtual   #1527 <Method byte[] PdfString.getBytes()>
	//   42   86:aload_2         
	//   43   87:invokespecial   #1530 <Method void PdfPKCS7(byte[], byte[], String)>
	//   44   90:astore_1        
_L11:
		updateByteRange(((PdfPKCS7) (s)), pdfdictionary);
	//   45   91:aload_0         
	//   46   92:aload_1         
	//   47   93:aload           4
	//   48   95:invokespecial   #1532 <Method void updateByteRange(PdfPKCS7, PdfDictionary)>
		s1 = ((String) (pdfdictionary.getAsString(PdfName.M)));
	//   49   98:aload           4
	//   50  100:getstatic       #1535 <Field PdfName PdfName.M>
	//   51  103:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   52  106:astore_2        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_122;
	//   53  107:aload_2         
	//   54  108:ifnull          122
		((PdfPKCS7) (s)).setSignDate(PdfDate.decode(((PdfString) (s1)).toString()));
	//   55  111:aload_1         
	//   56  112:aload_2         
	//   57  113:invokevirtual   #1085 <Method String PdfString.toString()>
	//   58  116:invokestatic    #1540 <Method java.util.Calendar PdfDate.decode(String)>
	//   59  119:invokevirtual   #1544 <Method void PdfPKCS7.setSignDate(java.util.Calendar)>
		s1 = ((String) (PdfReader.getPdfObject(pdfdictionary.get(PdfName.NAME))));
	//   60  122:aload           4
	//   61  124:getstatic       #1547 <Field PdfName PdfName.NAME>
	//   62  127:invokevirtual   #547 <Method PdfObject PdfDictionary.get(PdfName)>
	//   63  130:invokestatic    #576 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   64  133:astore_2        
		if(s1 == null) goto _L6; else goto _L5
	//   65  134:aload_2         
	//   66  135:ifnull          156
_L5:
		if(!((PdfObject) (s1)).isString()) goto _L8; else goto _L7
	//   67  138:aload_2         
	//   68  139:invokevirtual   #313 <Method boolean PdfObject.isString()>
	//   69  142:ifeq            230
_L7:
		((PdfPKCS7) (s)).setSignName(((PdfString)s1).toUnicodeString());
	//   70  145:aload_1         
	//   71  146:aload_2         
	//   72  147:checkcast       #315 <Class PdfString>
	//   73  150:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//   74  153:invokevirtual   #1550 <Method void PdfPKCS7.setSignName(String)>
_L6:
		s1 = ((String) (pdfdictionary.getAsString(PdfName.REASON)));
	//   75  156:aload           4
	//   76  158:getstatic       #1553 <Field PdfName PdfName.REASON>
	//   77  161:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   78  164:astore_2        
		if(s1 == null)
			break MISSING_BLOCK_LABEL_177;
	//   79  165:aload_2         
	//   80  166:ifnull          177
		((PdfPKCS7) (s)).setReason(((PdfString) (s1)).toUnicodeString());
	//   81  169:aload_1         
	//   82  170:aload_2         
	//   83  171:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//   84  174:invokevirtual   #1556 <Method void PdfPKCS7.setReason(String)>
		pdfstring = pdfdictionary.getAsString(PdfName.LOCATION);
	//   85  177:aload           4
	//   86  179:getstatic       #1559 <Field PdfName PdfName.LOCATION>
	//   87  182:invokevirtual   #522 <Method PdfString PdfDictionary.getAsString(PdfName)>
	//   88  185:astore_3        
		s1 = s;
	//   89  186:aload_1         
	//   90  187:astore_2        
		if(pdfstring == null) goto _L10; else goto _L9
	//   91  188:aload_3         
	//   92  189:ifnull          14
_L9:
		try
		{
			((PdfPKCS7) (s)).setLocation(pdfstring.toUnicodeString());
	//   93  192:aload_1         
	//   94  193:aload_3         
	//   95  194:invokevirtual   #319 <Method String PdfString.toUnicodeString()>
	//   96  197:invokevirtual   #1562 <Method void PdfPKCS7.setLocation(String)>
		}
	//*  97  200:aload_1         
	//*  98  201:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  99  202:astore_1        
		{
			throw new ExceptionConverter(((Exception) (s)));
	//  100  203:new             #238 <Class ExceptionConverter>
	//  101  206:dup             
	//  102  207:aload_1         
	//  103  208:invokespecial   #241 <Method void ExceptionConverter(Exception)>
	//  104  211:athrow          
		}
		return ((PdfPKCS7) (s));
_L4:
		s = ((String) (new PdfPKCS7(pdfstring1.getOriginalBytes(), ((PdfName) (s)), s1)));
	//  105  212:new             #470 <Class PdfPKCS7>
	//  106  215:dup             
	//  107  216:aload           5
	//  108  218:invokevirtual   #1526 <Method byte[] PdfString.getOriginalBytes()>
	//  109  221:aload_1         
	//  110  222:aload_2         
	//  111  223:invokespecial   #1565 <Method void PdfPKCS7(byte[], PdfName, String)>
	//  112  226:astore_1        
		  goto _L11
	//* 113  227:goto            91
_L8:
		if(!((PdfObject) (s1)).isName()) goto _L6; else goto _L12
	//  114  230:aload_2         
	//  115  231:invokevirtual   #1568 <Method boolean PdfObject.isName()>
	//  116  234:ifeq            156
_L12:
		((PdfPKCS7) (s)).setSignName(PdfName.decodeName(((PdfObject) (s1)).toString()));
	//  117  237:aload_1         
	//  118  238:aload_2         
	//  119  239:invokevirtual   #322 <Method String PdfObject.toString()>
	//  120  242:invokestatic    #1000 <Method String PdfName.decodeName(String)>
	//  121  245:invokevirtual   #1550 <Method void PdfPKCS7.setSignName(String)>
		  goto _L6
	//* 122  248:goto            156
	}

	public static final int DA_COLOR = 2;
	public static final int DA_FONT = 0;
	public static final int DA_SIZE = 1;
	public static final int FIELD_TYPE_CHECKBOX = 2;
	public static final int FIELD_TYPE_COMBO = 6;
	public static final int FIELD_TYPE_LIST = 5;
	public static final int FIELD_TYPE_NONE = 0;
	public static final int FIELD_TYPE_PUSHBUTTON = 1;
	public static final int FIELD_TYPE_RADIOBUTTON = 3;
	public static final int FIELD_TYPE_SIGNATURE = 7;
	public static final int FIELD_TYPE_TEXT = 4;
	private static final PdfName buttonRemove[];
	private static final HashMap stdFieldFontNames;
	private boolean append;
	private HashMap extensionFonts;
	private float extraMarginLeft;
	private float extraMarginTop;
	private Map fieldCache;
	Map fields;
	private boolean generateAppearances;
	private boolean lastWasString;
	private HashMap localFonts;
	private ArrayList orderedSignatureNames;
	PdfReader reader;
	private HashMap sigNames;
	private ArrayList substitutionFonts;
	private int topFirst;
	private int totalRevisions;
	PdfWriter writer;
	private XfaForm xfa;

	static 
	{
		stdFieldFontNames = new HashMap();
	//    0    0:new             #78  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void HashMap()>
	//    3    7:putstatic       #83  <Field HashMap stdFieldFontNames>
		stdFieldFontNames.put("CoBO", ((Object) (new String[] {
			"Courier-BoldOblique"
		})));
	//    4   10:getstatic       #83  <Field HashMap stdFieldFontNames>
	//    5   13:ldc1            #85  <String "CoBO">
	//    6   15:iconst_1        
	//    7   16:anewarray       String[]
	//    8   19:dup             
	//    9   20:iconst_0        
	//   10   21:ldc1            #89  <String "Courier-BoldOblique">
	//   11   23:aastore         
	//   12   24:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
		stdFieldFontNames.put("CoBo", ((Object) (new String[] {
			"Courier-Bold"
		})));
	//   14   28:getstatic       #83  <Field HashMap stdFieldFontNames>
	//   15   31:ldc1            #95  <String "CoBo">
	//   16   33:iconst_1        
	//   17   34:anewarray       String[]
	//   18   37:dup             
	//   19   38:iconst_0        
	//   20   39:ldc1            #97  <String "Courier-Bold">
	//   21   41:aastore         
	//   22   42:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//   23   45:pop             
		stdFieldFontNames.put("CoOb", ((Object) (new String[] {
			"Courier-Oblique"
		})));
	//   24   46:getstatic       #83  <Field HashMap stdFieldFontNames>
	//   25   49:ldc1            #99  <String "CoOb">
	//   26   51:iconst_1        
	//   27   52:anewarray       String[]
	//   28   55:dup             
	//   29   56:iconst_0        
	//   30   57:ldc1            #101 <String "Courier-Oblique">
	//   31   59:aastore         
	//   32   60:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//   33   63:pop             
		stdFieldFontNames.put("Cour", ((Object) (new String[] {
			"Courier"
		})));
	//   34   64:getstatic       #83  <Field HashMap stdFieldFontNames>
	//   35   67:ldc1            #103 <String "Cour">
	//   36   69:iconst_1        
	//   37   70:anewarray       String[]
	//   38   73:dup             
	//   39   74:iconst_0        
	//   40   75:ldc1            #105 <String "Courier">
	//   41   77:aastore         
	//   42   78:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//   43   81:pop             
		stdFieldFontNames.put("HeBO", ((Object) (new String[] {
			"Helvetica-BoldOblique"
		})));
	//   44   82:getstatic       #83  <Field HashMap stdFieldFontNames>
	//   45   85:ldc1            #107 <String "HeBO">
	//   46   87:iconst_1        
	//   47   88:anewarray       String[]
	//   48   91:dup             
	//   49   92:iconst_0        
	//   50   93:ldc1            #109 <String "Helvetica-BoldOblique">
	//   51   95:aastore         
	//   52   96:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//   53   99:pop             
		stdFieldFontNames.put("HeBo", ((Object) (new String[] {
			"Helvetica-Bold"
		})));
	//   54  100:getstatic       #83  <Field HashMap stdFieldFontNames>
	//   55  103:ldc1            #111 <String "HeBo">
	//   56  105:iconst_1        
	//   57  106:anewarray       String[]
	//   58  109:dup             
	//   59  110:iconst_0        
	//   60  111:ldc1            #113 <String "Helvetica-Bold">
	//   61  113:aastore         
	//   62  114:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//   63  117:pop             
		stdFieldFontNames.put("HeOb", ((Object) (new String[] {
			"Helvetica-Oblique"
		})));
	//   64  118:getstatic       #83  <Field HashMap stdFieldFontNames>
	//   65  121:ldc1            #115 <String "HeOb">
	//   66  123:iconst_1        
	//   67  124:anewarray       String[]
	//   68  127:dup             
	//   69  128:iconst_0        
	//   70  129:ldc1            #117 <String "Helvetica-Oblique">
	//   71  131:aastore         
	//   72  132:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//   73  135:pop             
		stdFieldFontNames.put("Helv", ((Object) (new String[] {
			"Helvetica"
		})));
	//   74  136:getstatic       #83  <Field HashMap stdFieldFontNames>
	//   75  139:ldc1            #119 <String "Helv">
	//   76  141:iconst_1        
	//   77  142:anewarray       String[]
	//   78  145:dup             
	//   79  146:iconst_0        
	//   80  147:ldc1            #121 <String "Helvetica">
	//   81  149:aastore         
	//   82  150:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//   83  153:pop             
		stdFieldFontNames.put("Symb", ((Object) (new String[] {
			"Symbol"
		})));
	//   84  154:getstatic       #83  <Field HashMap stdFieldFontNames>
	//   85  157:ldc1            #123 <String "Symb">
	//   86  159:iconst_1        
	//   87  160:anewarray       String[]
	//   88  163:dup             
	//   89  164:iconst_0        
	//   90  165:ldc1            #125 <String "Symbol">
	//   91  167:aastore         
	//   92  168:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//   93  171:pop             
		stdFieldFontNames.put("TiBI", ((Object) (new String[] {
			"Times-BoldItalic"
		})));
	//   94  172:getstatic       #83  <Field HashMap stdFieldFontNames>
	//   95  175:ldc1            #127 <String "TiBI">
	//   96  177:iconst_1        
	//   97  178:anewarray       String[]
	//   98  181:dup             
	//   99  182:iconst_0        
	//  100  183:ldc1            #129 <String "Times-BoldItalic">
	//  101  185:aastore         
	//  102  186:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  103  189:pop             
		stdFieldFontNames.put("TiBo", ((Object) (new String[] {
			"Times-Bold"
		})));
	//  104  190:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  105  193:ldc1            #131 <String "TiBo">
	//  106  195:iconst_1        
	//  107  196:anewarray       String[]
	//  108  199:dup             
	//  109  200:iconst_0        
	//  110  201:ldc1            #133 <String "Times-Bold">
	//  111  203:aastore         
	//  112  204:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  113  207:pop             
		stdFieldFontNames.put("TiIt", ((Object) (new String[] {
			"Times-Italic"
		})));
	//  114  208:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  115  211:ldc1            #135 <String "TiIt">
	//  116  213:iconst_1        
	//  117  214:anewarray       String[]
	//  118  217:dup             
	//  119  218:iconst_0        
	//  120  219:ldc1            #137 <String "Times-Italic">
	//  121  221:aastore         
	//  122  222:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  123  225:pop             
		stdFieldFontNames.put("TiRo", ((Object) (new String[] {
			"Times-Roman"
		})));
	//  124  226:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  125  229:ldc1            #139 <String "TiRo">
	//  126  231:iconst_1        
	//  127  232:anewarray       String[]
	//  128  235:dup             
	//  129  236:iconst_0        
	//  130  237:ldc1            #141 <String "Times-Roman">
	//  131  239:aastore         
	//  132  240:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  133  243:pop             
		stdFieldFontNames.put("ZaDb", ((Object) (new String[] {
			"ZapfDingbats"
		})));
	//  134  244:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  135  247:ldc1            #143 <String "ZaDb">
	//  136  249:iconst_1        
	//  137  250:anewarray       String[]
	//  138  253:dup             
	//  139  254:iconst_0        
	//  140  255:ldc1            #145 <String "ZapfDingbats">
	//  141  257:aastore         
	//  142  258:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  143  261:pop             
		stdFieldFontNames.put("HySm", ((Object) (new String[] {
			"HYSMyeongJo-Medium", "UniKS-UCS2-H"
		})));
	//  144  262:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  145  265:ldc1            #147 <String "HySm">
	//  146  267:iconst_2        
	//  147  268:anewarray       String[]
	//  148  271:dup             
	//  149  272:iconst_0        
	//  150  273:ldc1            #149 <String "HYSMyeongJo-Medium">
	//  151  275:aastore         
	//  152  276:dup             
	//  153  277:iconst_1        
	//  154  278:ldc1            #151 <String "UniKS-UCS2-H">
	//  155  280:aastore         
	//  156  281:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  157  284:pop             
		stdFieldFontNames.put("HyGo", ((Object) (new String[] {
			"HYGoThic-Medium", "UniKS-UCS2-H"
		})));
	//  158  285:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  159  288:ldc1            #153 <String "HyGo">
	//  160  290:iconst_2        
	//  161  291:anewarray       String[]
	//  162  294:dup             
	//  163  295:iconst_0        
	//  164  296:ldc1            #155 <String "HYGoThic-Medium">
	//  165  298:aastore         
	//  166  299:dup             
	//  167  300:iconst_1        
	//  168  301:ldc1            #151 <String "UniKS-UCS2-H">
	//  169  303:aastore         
	//  170  304:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  171  307:pop             
		stdFieldFontNames.put("KaGo", ((Object) (new String[] {
			"HeiseiKakuGo-W5", "UniKS-UCS2-H"
		})));
	//  172  308:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  173  311:ldc1            #157 <String "KaGo">
	//  174  313:iconst_2        
	//  175  314:anewarray       String[]
	//  176  317:dup             
	//  177  318:iconst_0        
	//  178  319:ldc1            #159 <String "HeiseiKakuGo-W5">
	//  179  321:aastore         
	//  180  322:dup             
	//  181  323:iconst_1        
	//  182  324:ldc1            #151 <String "UniKS-UCS2-H">
	//  183  326:aastore         
	//  184  327:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  185  330:pop             
		stdFieldFontNames.put("KaMi", ((Object) (new String[] {
			"HeiseiMin-W3", "UniJIS-UCS2-H"
		})));
	//  186  331:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  187  334:ldc1            #161 <String "KaMi">
	//  188  336:iconst_2        
	//  189  337:anewarray       String[]
	//  190  340:dup             
	//  191  341:iconst_0        
	//  192  342:ldc1            #163 <String "HeiseiMin-W3">
	//  193  344:aastore         
	//  194  345:dup             
	//  195  346:iconst_1        
	//  196  347:ldc1            #165 <String "UniJIS-UCS2-H">
	//  197  349:aastore         
	//  198  350:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  199  353:pop             
		stdFieldFontNames.put("MHei", ((Object) (new String[] {
			"MHei-Medium", "UniCNS-UCS2-H"
		})));
	//  200  354:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  201  357:ldc1            #167 <String "MHei">
	//  202  359:iconst_2        
	//  203  360:anewarray       String[]
	//  204  363:dup             
	//  205  364:iconst_0        
	//  206  365:ldc1            #169 <String "MHei-Medium">
	//  207  367:aastore         
	//  208  368:dup             
	//  209  369:iconst_1        
	//  210  370:ldc1            #171 <String "UniCNS-UCS2-H">
	//  211  372:aastore         
	//  212  373:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  213  376:pop             
		stdFieldFontNames.put("MSun", ((Object) (new String[] {
			"MSung-Light", "UniCNS-UCS2-H"
		})));
	//  214  377:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  215  380:ldc1            #173 <String "MSun">
	//  216  382:iconst_2        
	//  217  383:anewarray       String[]
	//  218  386:dup             
	//  219  387:iconst_0        
	//  220  388:ldc1            #175 <String "MSung-Light">
	//  221  390:aastore         
	//  222  391:dup             
	//  223  392:iconst_1        
	//  224  393:ldc1            #171 <String "UniCNS-UCS2-H">
	//  225  395:aastore         
	//  226  396:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  227  399:pop             
		stdFieldFontNames.put("STSo", ((Object) (new String[] {
			"STSong-Light", "UniGB-UCS2-H"
		})));
	//  228  400:getstatic       #83  <Field HashMap stdFieldFontNames>
	//  229  403:ldc1            #177 <String "STSo">
	//  230  405:iconst_2        
	//  231  406:anewarray       String[]
	//  232  409:dup             
	//  233  410:iconst_0        
	//  234  411:ldc1            #179 <String "STSong-Light">
	//  235  413:aastore         
	//  236  414:dup             
	//  237  415:iconst_1        
	//  238  416:ldc1            #181 <String "UniGB-UCS2-H">
	//  239  418:aastore         
	//  240  419:invokevirtual   #93  <Method Object HashMap.put(Object, Object)>
	//  241  422:pop             
		buttonRemove = (new PdfName[] {
			PdfName.MK, PdfName.F, PdfName.FF, PdfName.Q, PdfName.BS, PdfName.BORDER
		});
	//  242  423:bipush          6
	//  243  425:anewarray       PdfName[]
	//  244  428:dup             
	//  245  429:iconst_0        
	//  246  430:getstatic       #187 <Field PdfName PdfName.MK>
	//  247  433:aastore         
	//  248  434:dup             
	//  249  435:iconst_1        
	//  250  436:getstatic       #189 <Field PdfName PdfName.F>
	//  251  439:aastore         
	//  252  440:dup             
	//  253  441:iconst_2        
	//  254  442:getstatic       #192 <Field PdfName PdfName.FF>
	//  255  445:aastore         
	//  256  446:dup             
	//  257  447:iconst_3        
	//  258  448:getstatic       #195 <Field PdfName PdfName.Q>
	//  259  451:aastore         
	//  260  452:dup             
	//  261  453:iconst_4        
	//  262  454:getstatic       #198 <Field PdfName PdfName.BS>
	//  263  457:aastore         
	//  264  458:dup             
	//  265  459:iconst_5        
	//  266  460:getstatic       #201 <Field PdfName PdfName.BORDER>
	//  267  463:aastore         
	//  268  464:putstatic       #203 <Field PdfName[] buttonRemove>
	//* 269  467:return          
	}


/*
	static void access$000(AcroFields acrofields, PdfObject pdfobject)
	{
		acrofields.markUsed(pdfobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #247 <Method void markUsed(PdfObject)>
		return;
	//    3    5:return          
	}

*/
}
