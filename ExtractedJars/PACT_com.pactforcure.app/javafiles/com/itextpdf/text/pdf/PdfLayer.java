// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfOCG, PdfName, PdfStamperImp, 
//			PdfWriter, PdfIndirectObject, PdfString, PdfArray, 
//			PdfNumber, PdfIndirectReference, PdfObject

public class PdfLayer extends PdfDictionary
	implements PdfOCG
{

	PdfLayer(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void PdfDictionary()>
		on = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #25  <Field boolean on>
		onPanel = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #27  <Field boolean onPanel>
		title = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #29  <Field String title>
	//   11   19:return          
	}

	public PdfLayer(String s, PdfWriter pdfwriter)
		throws IOException
	{
		super(PdfName.OCG);
	//    0    0:aload_0         
	//    1    1:getstatic       #39  <Field PdfName PdfName.OCG>
	//    2    4:invokespecial   #42  <Method void PdfDictionary(PdfName)>
		on = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #25  <Field boolean on>
		onPanel = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #27  <Field boolean onPanel>
		setName(s);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #45  <Method void setName(String)>
		if(pdfwriter instanceof PdfStamperImp)
	//*  12   22:aload_2         
	//*  13   23:instanceof      #47  <Class PdfStamperImp>
	//*  14   26:ifeq            47
			ref = pdfwriter.addToBody(((PdfObject) (this))).getIndirectReference();
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #53  <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//   19   35:invokevirtual   #59  <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//   20   38:putfield        #61  <Field PdfIndirectReference ref>
		else
	//*  21   41:aload_2         
	//*  22   42:aload_0         
	//*  23   43:invokevirtual   #65  <Method void PdfWriter.registerLayer(PdfOCG)>
	//*  24   46:return          
			ref = pdfwriter.getPdfIndirectReference();
	//   25   47:aload_0         
	//   26   48:aload_2         
	//   27   49:invokevirtual   #68  <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   28   52:putfield        #61  <Field PdfIndirectReference ref>
		pdfwriter.registerLayer(((PdfOCG) (this)));
	//*  29   55:goto            41
	}

	public static PdfLayer createTitle(String s, PdfWriter pdfwriter)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       21
		{
			throw new NullPointerException(MessageLocalization.getComposedMessage("title.cannot.be.null", new Object[0]));
	//    2    4:new             #73  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #75  <String "title.cannot.be.null">
	//    5   10:iconst_0        
	//    6   11:anewarray       Object[]
	//    7   14:invokestatic    #83  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    8   17:invokespecial   #85  <Method void NullPointerException(String)>
	//    9   20:athrow          
		} else
		{
			s = ((String) (new PdfLayer(s)));
	//   10   21:new             #2   <Class PdfLayer>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:invokespecial   #86  <Method void PdfLayer(String)>
	//   14   29:astore_0        
			pdfwriter.registerLayer(((PdfOCG) (s)));
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:invokevirtual   #65  <Method void PdfWriter.registerLayer(PdfOCG)>
			return ((PdfLayer) (s));
	//   18   35:aload_0         
	//   19   36:areturn         
		}
	}

	private PdfDictionary getUsage()
	{
		PdfDictionary pdfdictionary1 = getAsDict(PdfName.USAGE);
	//    0    0:aload_0         
	//    1    1:getstatic       #91  <Field PdfName PdfName.USAGE>
	//    2    4:invokevirtual   #95  <Method PdfDictionary getAsDict(PdfName)>
	//    3    7:astore_2        
		PdfDictionary pdfdictionary = pdfdictionary1;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(pdfdictionary1 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       30
		{
			pdfdictionary = new PdfDictionary();
	//    8   14:new             #4   <Class PdfDictionary>
	//    9   17:dup             
	//   10   18:invokespecial   #23  <Method void PdfDictionary()>
	//   11   21:astore_1        
			put(PdfName.USAGE, ((PdfObject) (pdfdictionary)));
	//   12   22:aload_0         
	//   13   23:getstatic       #91  <Field PdfName PdfName.USAGE>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #99  <Method void put(PdfName, PdfObject)>
		}
		return pdfdictionary;
	//   16   30:aload_1         
	//   17   31:areturn         
	}

	public void addChild(PdfLayer pdflayer)
	{
		if(pdflayer.parent != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #103 <Field PdfLayer parent>
	//*   2    4:ifnull          37
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("the.layer.1.already.has.a.parent", new Object[] {
				pdflayer.getAsString(PdfName.NAME).toUnicodeString()
			}));
	//    3    7:new             #105 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #107 <String "the.layer.1.already.has.a.parent">
	//    6   13:iconst_1        
	//    7   14:anewarray       Object[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_1         
	//   11   20:getstatic       #110 <Field PdfName PdfName.NAME>
	//   12   23:invokevirtual   #114 <Method PdfString getAsString(PdfName)>
	//   13   26:invokevirtual   #120 <Method String PdfString.toUnicodeString()>
	//   14   29:aastore         
	//   15   30:invokestatic    #83  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   16   33:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//   17   36:athrow          
		pdflayer.parent = this;
	//   18   37:aload_1         
	//   19   38:aload_0         
	//   20   39:putfield        #103 <Field PdfLayer parent>
		if(children == null)
	//*  21   42:aload_0         
	//*  22   43:getfield        #123 <Field ArrayList children>
	//*  23   46:ifnonnull       60
			children = new ArrayList();
	//   24   49:aload_0         
	//   25   50:new             #125 <Class ArrayList>
	//   26   53:dup             
	//   27   54:invokespecial   #126 <Method void ArrayList()>
	//   28   57:putfield        #123 <Field ArrayList children>
		children.add(((Object) (pdflayer)));
	//   29   60:aload_0         
	//   30   61:getfield        #123 <Field ArrayList children>
	//   31   64:aload_1         
	//   32   65:invokevirtual   #130 <Method boolean ArrayList.add(Object)>
	//   33   68:pop             
	//   34   69:return          
	}

	public ArrayList getChildren()
	{
		return children;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field ArrayList children>
	//    2    4:areturn         
	}

	public PdfLayer getParent()
	{
		return parent;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field PdfLayer parent>
	//    2    4:areturn         
	}

	public PdfObject getPdfObject()
	{
		return ((PdfObject) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public PdfIndirectReference getRef()
	{
		return ref;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field PdfIndirectReference ref>
	//    2    4:areturn         
	}

	String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String title>
	//    2    4:areturn         
	}

	public boolean isOn()
	{
		return on;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean on>
	//    2    4:ireturn         
	}

	public boolean isOnPanel()
	{
		return onPanel;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean onPanel>
	//    2    4:ireturn         
	}

	public void setCreatorInfo(String s, String s1)
	{
		PdfDictionary pdfdictionary = getUsage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method PdfDictionary getUsage()>
	//    2    4:astore_3        
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    3    5:new             #4   <Class PdfDictionary>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void PdfDictionary()>
	//    6   12:astore          4
		pdfdictionary1.put(PdfName.CREATOR, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    7   14:aload           4
	//    8   16:getstatic       #150 <Field PdfName PdfName.CREATOR>
	//    9   19:new             #116 <Class PdfString>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:ldc1            #152 <String "UnicodeBig">
	//   13   26:invokespecial   #154 <Method void PdfString(String, String)>
	//   14   29:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary1.put(PdfName.SUBTYPE, ((PdfObject) (new PdfName(s1))));
	//   15   32:aload           4
	//   16   34:getstatic       #158 <Field PdfName PdfName.SUBTYPE>
	//   17   37:new             #35  <Class PdfName>
	//   18   40:dup             
	//   19   41:aload_2         
	//   20   42:invokespecial   #159 <Method void PdfName(String)>
	//   21   45:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.CREATORINFO, ((PdfObject) (pdfdictionary1)));
	//   22   48:aload_3         
	//   23   49:getstatic       #162 <Field PdfName PdfName.CREATORINFO>
	//   24   52:aload           4
	//   25   54:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   26   57:return          
	}

	public void setExport(boolean flag)
	{
		PdfDictionary pdfdictionary = getUsage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method PdfDictionary getUsage()>
	//    2    4:astore_3        
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    3    5:new             #4   <Class PdfDictionary>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void PdfDictionary()>
	//    6   12:astore          4
		PdfName pdfname1 = PdfName.EXPORTSTATE;
	//    7   14:getstatic       #167 <Field PdfName PdfName.EXPORTSTATE>
	//    8   17:astore          5
		PdfName pdfname;
		if(flag)
	//*   9   19:iload_1         
	//*  10   20:ifeq            45
			pdfname = PdfName.ON;
	//   11   23:getstatic       #170 <Field PdfName PdfName.ON>
	//   12   26:astore_2        
		else
	//*  13   27:aload           4
	//*  14   29:aload           5
	//*  15   31:aload_2         
	//*  16   32:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  17   35:aload_3         
	//*  18   36:getstatic       #173 <Field PdfName PdfName.EXPORT>
	//*  19   39:aload           4
	//*  20   41:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  21   44:return          
			pdfname = PdfName.OFF;
	//   22   45:getstatic       #176 <Field PdfName PdfName.OFF>
	//   23   48:astore_2        
		pdfdictionary1.put(pdfname1, ((PdfObject) (pdfname)));
		pdfdictionary.put(PdfName.EXPORT, ((PdfObject) (pdfdictionary1)));
	//*  24   49:goto            27
	}

	public void setLanguage(String s, boolean flag)
	{
		PdfDictionary pdfdictionary = getUsage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method PdfDictionary getUsage()>
	//    2    4:astore_3        
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    3    5:new             #4   <Class PdfDictionary>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void PdfDictionary()>
	//    6   12:astore          4
		pdfdictionary1.put(PdfName.LANG, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    7   14:aload           4
	//    8   16:getstatic       #181 <Field PdfName PdfName.LANG>
	//    9   19:new             #116 <Class PdfString>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:ldc1            #152 <String "UnicodeBig">
	//   13   26:invokespecial   #154 <Method void PdfString(String, String)>
	//   14   29:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(flag)
	//*  15   32:iload_2         
	//*  16   33:ifeq            47
			pdfdictionary1.put(PdfName.PREFERRED, ((PdfObject) (PdfName.ON)));
	//   17   36:aload           4
	//   18   38:getstatic       #184 <Field PdfName PdfName.PREFERRED>
	//   19   41:getstatic       #170 <Field PdfName PdfName.ON>
	//   20   44:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.LANGUAGE, ((PdfObject) (pdfdictionary1)));
	//   21   47:aload_3         
	//   22   48:getstatic       #187 <Field PdfName PdfName.LANGUAGE>
	//   23   51:aload           4
	//   24   53:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   25   56:return          
	}

	public void setName(String s)
	{
		put(PdfName.NAME, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #110 <Field PdfName PdfName.NAME>
	//    2    4:new             #116 <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #152 <String "UnicodeBig">
	//    6   11:invokespecial   #154 <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #99  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	public void setOn(boolean flag)
	{
		on = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field boolean on>
	//    3    5:return          
	}

	public void setOnPanel(boolean flag)
	{
		onPanel = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field boolean onPanel>
	//    3    5:return          
	}

	public void setPageElement(String s)
	{
		PdfDictionary pdfdictionary = getUsage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method PdfDictionary getUsage()>
	//    2    4:astore_2        
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    3    5:new             #4   <Class PdfDictionary>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void PdfDictionary()>
	//    6   12:astore_3        
		pdfdictionary1.put(PdfName.SUBTYPE, ((PdfObject) (new PdfName(s))));
	//    7   13:aload_3         
	//    8   14:getstatic       #158 <Field PdfName PdfName.SUBTYPE>
	//    9   17:new             #35  <Class PdfName>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #159 <Method void PdfName(String)>
	//   13   25:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.PAGEELEMENT, ((PdfObject) (pdfdictionary1)));
	//   14   28:aload_2         
	//   15   29:getstatic       #193 <Field PdfName PdfName.PAGEELEMENT>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   18   36:return          
	}

	public void setPrint(String s, boolean flag)
	{
		PdfDictionary pdfdictionary = getUsage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method PdfDictionary getUsage()>
	//    2    4:astore_3        
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    3    5:new             #4   <Class PdfDictionary>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void PdfDictionary()>
	//    6   12:astore          4
		pdfdictionary1.put(PdfName.SUBTYPE, ((PdfObject) (new PdfName(s))));
	//    7   14:aload           4
	//    8   16:getstatic       #158 <Field PdfName PdfName.SUBTYPE>
	//    9   19:new             #35  <Class PdfName>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #159 <Method void PdfName(String)>
	//   13   27:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		PdfName pdfname = PdfName.PRINTSTATE;
	//   14   30:getstatic       #197 <Field PdfName PdfName.PRINTSTATE>
	//   15   33:astore          5
		if(flag)
	//*  16   35:iload_2         
	//*  17   36:ifeq            61
			s = ((String) (PdfName.ON));
	//   18   39:getstatic       #170 <Field PdfName PdfName.ON>
	//   19   42:astore_1        
		else
	//*  20   43:aload           4
	//*  21   45:aload           5
	//*  22   47:aload_1         
	//*  23   48:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  24   51:aload_3         
	//*  25   52:getstatic       #200 <Field PdfName PdfName.PRINT>
	//*  26   55:aload           4
	//*  27   57:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  28   60:return          
			s = ((String) (PdfName.OFF));
	//   29   61:getstatic       #176 <Field PdfName PdfName.OFF>
	//   30   64:astore_1        
		pdfdictionary1.put(pdfname, ((PdfObject) (s)));
		pdfdictionary.put(PdfName.PRINT, ((PdfObject) (pdfdictionary1)));
	//*  31   65:goto            43
	}

	void setRef(PdfIndirectReference pdfindirectreference)
	{
		ref = pdfindirectreference;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field PdfIndirectReference ref>
	//    3    5:return          
	}

	public transient void setUser(String s, String as[])
	{
		PdfDictionary pdfdictionary = getUsage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method PdfDictionary getUsage()>
	//    2    4:astore          5
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    3    6:new             #4   <Class PdfDictionary>
	//    4    9:dup             
	//    5   10:invokespecial   #23  <Method void PdfDictionary()>
	//    6   13:astore          6
		pdfdictionary1.put(PdfName.TYPE, ((PdfObject) (new PdfName(s))));
	//    7   15:aload           6
	//    8   17:getstatic       #207 <Field PdfName PdfName.TYPE>
	//    9   20:new             #35  <Class PdfName>
	//   10   23:dup             
	//   11   24:aload_1         
	//   12   25:invokespecial   #159 <Method void PdfName(String)>
	//   13   28:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		s = ((String) (new PdfArray()));
	//   14   31:new             #209 <Class PdfArray>
	//   15   34:dup             
	//   16   35:invokespecial   #210 <Method void PdfArray()>
	//   17   38:astore_1        
		int j = as.length;
	//   18   39:aload_2         
	//   19   40:arraylength     
	//   20   41:istore          4
		for(int i = 0; i < j; i++)
	//*  21   43:iconst_0        
	//*  22   44:istore_3        
	//*  23   45:iload_3         
	//*  24   46:iload           4
	//*  25   48:icmpge          75
			((PdfArray) (s)).add(((PdfObject) (new PdfString(as[i], "UnicodeBig"))));
	//   26   51:aload_1         
	//   27   52:new             #116 <Class PdfString>
	//   28   55:dup             
	//   29   56:aload_2         
	//   30   57:iload_3         
	//   31   58:aaload          
	//   32   59:ldc1            #152 <String "UnicodeBig">
	//   33   61:invokespecial   #154 <Method void PdfString(String, String)>
	//   34   64:invokevirtual   #213 <Method boolean PdfArray.add(PdfObject)>
	//   35   67:pop             

	//   36   68:iload_3         
	//   37   69:iconst_1        
	//   38   70:iadd            
	//   39   71:istore_3        
	//*  40   72:goto            45
		pdfdictionary.put(PdfName.NAME, ((PdfObject) (s)));
	//   41   75:aload           5
	//   42   77:getstatic       #110 <Field PdfName PdfName.NAME>
	//   43   80:aload_1         
	//   44   81:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.USER, ((PdfObject) (pdfdictionary1)));
	//   45   84:aload           5
	//   46   86:getstatic       #216 <Field PdfName PdfName.USER>
	//   47   89:aload           6
	//   48   91:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   49   94:return          
	}

	public void setView(boolean flag)
	{
		PdfDictionary pdfdictionary = getUsage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method PdfDictionary getUsage()>
	//    2    4:astore_3        
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//    3    5:new             #4   <Class PdfDictionary>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void PdfDictionary()>
	//    6   12:astore          4
		PdfName pdfname1 = PdfName.VIEWSTATE;
	//    7   14:getstatic       #220 <Field PdfName PdfName.VIEWSTATE>
	//    8   17:astore          5
		PdfName pdfname;
		if(flag)
	//*   9   19:iload_1         
	//*  10   20:ifeq            45
			pdfname = PdfName.ON;
	//   11   23:getstatic       #170 <Field PdfName PdfName.ON>
	//   12   26:astore_2        
		else
	//*  13   27:aload           4
	//*  14   29:aload           5
	//*  15   31:aload_2         
	//*  16   32:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  17   35:aload_3         
	//*  18   36:getstatic       #223 <Field PdfName PdfName.VIEW>
	//*  19   39:aload           4
	//*  20   41:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  21   44:return          
			pdfname = PdfName.OFF;
	//   22   45:getstatic       #176 <Field PdfName PdfName.OFF>
	//   23   48:astore_2        
		pdfdictionary1.put(pdfname1, ((PdfObject) (pdfname)));
		pdfdictionary.put(PdfName.VIEW, ((PdfObject) (pdfdictionary1)));
	//*  24   49:goto            27
	}

	public void setZoom(float f, float f1)
	{
		if(f <= 0.0F && f1 < 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifgt            13
	//*   4    6:fload_2         
	//*   5    7:fconst_0        
	//*   6    8:fcmpg           
	//*   7    9:ifge            13
			return;
	//    8   12:return          
		PdfDictionary pdfdictionary = getUsage();
	//    9   13:aload_0         
	//   10   14:invokespecial   #147 <Method PdfDictionary getUsage()>
	//   11   17:astore_3        
		PdfDictionary pdfdictionary1 = new PdfDictionary();
	//   12   18:new             #4   <Class PdfDictionary>
	//   13   21:dup             
	//   14   22:invokespecial   #23  <Method void PdfDictionary()>
	//   15   25:astore          4
		if(f > 0.0F)
	//*  16   27:fload_1         
	//*  17   28:fconst_0        
	//*  18   29:fcmpl           
	//*  19   30:ifle            49
			pdfdictionary1.put(PdfName.MIN_LOWER_CASE, ((PdfObject) (new PdfNumber(f))));
	//   20   33:aload           4
	//   21   35:getstatic       #228 <Field PdfName PdfName.MIN_LOWER_CASE>
	//   22   38:new             #230 <Class PdfNumber>
	//   23   41:dup             
	//   24   42:fload_1         
	//   25   43:invokespecial   #233 <Method void PdfNumber(float)>
	//   26   46:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(f1 >= 0.0F)
	//*  27   49:fload_2         
	//*  28   50:fconst_0        
	//*  29   51:fcmpl           
	//*  30   52:iflt            71
			pdfdictionary1.put(PdfName.MAX_LOWER_CASE, ((PdfObject) (new PdfNumber(f1))));
	//   31   55:aload           4
	//   32   57:getstatic       #236 <Field PdfName PdfName.MAX_LOWER_CASE>
	//   33   60:new             #230 <Class PdfNumber>
	//   34   63:dup             
	//   35   64:fload_2         
	//   36   65:invokespecial   #233 <Method void PdfNumber(float)>
	//   37   68:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.ZOOM, ((PdfObject) (pdfdictionary1)));
	//   38   71:aload_3         
	//   39   72:getstatic       #239 <Field PdfName PdfName.ZOOM>
	//   40   75:aload           4
	//   41   77:invokevirtual   #155 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//   42   80:return          
	}

	protected ArrayList children;
	private boolean on;
	private boolean onPanel;
	protected PdfLayer parent;
	protected PdfIndirectReference ref;
	protected String title;
}
