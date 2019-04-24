// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.collection.PdfTargetDictionary;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfString, PdfLiteral, 
//			PdfBoolean, PdfArray, PdfAnnotation, PdfNumber, 
//			PdfWriter, PdfDestination, PdfStream, PdfEncodings, 
//			PdfIndirectObject, PdfRendition, PdfIndirectReference, PdfLayer, 
//			PdfObject, PdfFileSpecification

public class PdfAction extends PdfDictionary
{

	public PdfAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void PdfDictionary()>
	//    2    4:return          
	}

	public PdfAction(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void PdfDictionary()>
		put(PdfName.S, ((PdfObject) (PdfName.NAMED)));
	//    2    4:aload_0         
	//    3    5:getstatic       #51  <Field PdfName PdfName.S>
	//    4    8:getstatic       #54  <Field PdfName PdfName.NAMED>
	//    5   11:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		switch(i)
	//*   6   14:iload_1         
		{
	//*   7   15:tableswitch     1 5: default 48
	//	               1 65
	//	               2 98
	//	               3 87
	//	               4 76
	//	               5 109
		default:
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.named.action", new Object[0]));
	//    8   48:new             #60  <Class RuntimeException>
	//    9   51:dup             
	//   10   52:ldc1            #62  <String "invalid.named.action">
	//   11   54:iconst_0        
	//   12   55:anewarray       Object[]
	//   13   58:invokestatic    #70  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   61:invokespecial   #73  <Method void RuntimeException(String)>
	//   15   64:athrow          

		case 1: // '\001'
			put(PdfName.N, ((PdfObject) (PdfName.FIRSTPAGE)));
	//   16   65:aload_0         
	//   17   66:getstatic       #76  <Field PdfName PdfName.N>
	//   18   69:getstatic       #78  <Field PdfName PdfName.FIRSTPAGE>
	//   19   72:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return;
	//   20   75:return          

		case 4: // '\004'
			put(PdfName.N, ((PdfObject) (PdfName.LASTPAGE)));
	//   21   76:aload_0         
	//   22   77:getstatic       #76  <Field PdfName PdfName.N>
	//   23   80:getstatic       #80  <Field PdfName PdfName.LASTPAGE>
	//   24   83:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return;
	//   25   86:return          

		case 3: // '\003'
			put(PdfName.N, ((PdfObject) (PdfName.NEXTPAGE)));
	//   26   87:aload_0         
	//   27   88:getstatic       #76  <Field PdfName PdfName.N>
	//   28   91:getstatic       #82  <Field PdfName PdfName.NEXTPAGE>
	//   29   94:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return;
	//   30   97:return          

		case 2: // '\002'
			put(PdfName.N, ((PdfObject) (PdfName.PREVPAGE)));
	//   31   98:aload_0         
	//   32   99:getstatic       #76  <Field PdfName PdfName.N>
	//   33  102:getstatic       #84  <Field PdfName PdfName.PREVPAGE>
	//   34  105:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return;
	//   35  108:return          

		case 5: // '\005'
			put(PdfName.S, ((PdfObject) (PdfName.JAVASCRIPT)));
	//   36  109:aload_0         
	//   37  110:getstatic       #51  <Field PdfName PdfName.S>
	//   38  113:getstatic       #87  <Field PdfName PdfName.JAVASCRIPT>
	//   39  116:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			break;
		}
		put(PdfName.JS, ((PdfObject) (new PdfString("this.print(true);\r"))));
	//   40  119:aload_0         
	//   41  120:getstatic       #90  <Field PdfName PdfName.JS>
	//   42  123:new             #92  <Class PdfString>
	//   43  126:dup             
	//   44  127:ldc1            #94  <String "this.print(true);\r">
	//   45  129:invokespecial   #95  <Method void PdfString(String)>
	//   46  132:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
	//   47  135:return          
	}

	PdfAction(PdfIndirectReference pdfindirectreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void PdfDictionary()>
		put(PdfName.S, ((PdfObject) (PdfName.GOTO)));
	//    2    4:aload_0         
	//    3    5:getstatic       #51  <Field PdfName PdfName.S>
	//    4    8:getstatic       #99  <Field PdfName PdfName.GOTO>
	//    5   11:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		put(PdfName.D, ((PdfObject) (pdfindirectreference)));
	//    6   14:aload_0         
	//    7   15:getstatic       #102 <Field PdfName PdfName.D>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
	//   10   22:return          
	}

	public PdfAction(String s)
	{
		this(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #105 <Method void PdfAction(String, boolean)>
	//    4    6:return          
	}

	public PdfAction(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void PdfDictionary()>
		put(PdfName.S, ((PdfObject) (PdfName.GOTOR)));
	//    2    4:aload_0         
	//    3    5:getstatic       #51  <Field PdfName PdfName.S>
	//    4    8:getstatic       #109 <Field PdfName PdfName.GOTOR>
	//    5   11:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//    6   14:aload_0         
	//    7   15:getstatic       #112 <Field PdfName PdfName.F>
	//    8   18:new             #92  <Class PdfString>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:invokespecial   #95  <Method void PdfString(String)>
	//   12   26:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		put(PdfName.D, ((PdfObject) (new PdfLiteral((new StringBuilder()).append("[").append(i - 1).append(" /FitH 10000]").toString()))));
	//   13   29:aload_0         
	//   14   30:getstatic       #102 <Field PdfName PdfName.D>
	//   15   33:new             #114 <Class PdfLiteral>
	//   16   36:dup             
	//   17   37:new             #116 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #117 <Method void StringBuilder()>
	//   20   44:ldc1            #119 <String "[">
	//   21   46:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:iload_2         
	//   23   50:iconst_1        
	//   24   51:isub            
	//   25   52:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   26   55:ldc1            #128 <String " /FitH 10000]">
	//   27   57:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   29   63:invokespecial   #133 <Method void PdfLiteral(String)>
	//   30   66:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
	//   31   69:return          
	}

	public PdfAction(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void PdfDictionary()>
		put(PdfName.S, ((PdfObject) (PdfName.GOTOR)));
	//    2    4:aload_0         
	//    3    5:getstatic       #51  <Field PdfName PdfName.S>
	//    4    8:getstatic       #109 <Field PdfName PdfName.GOTOR>
	//    5   11:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//    6   14:aload_0         
	//    7   15:getstatic       #112 <Field PdfName PdfName.F>
	//    8   18:new             #92  <Class PdfString>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:invokespecial   #95  <Method void PdfString(String)>
	//   12   26:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		put(PdfName.D, ((PdfObject) (new PdfString(s1))));
	//   13   29:aload_0         
	//   14   30:getstatic       #102 <Field PdfName PdfName.D>
	//   15   33:new             #92  <Class PdfString>
	//   16   36:dup             
	//   17   37:aload_2         
	//   18   38:invokespecial   #95  <Method void PdfString(String)>
	//   19   41:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
	//   20   44:return          
	}

	public PdfAction(String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void PdfDictionary()>
		put(PdfName.S, ((PdfObject) (PdfName.LAUNCH)));
	//    2    4:aload_0         
	//    3    5:getstatic       #51  <Field PdfName PdfName.S>
	//    4    8:getstatic       #138 <Field PdfName PdfName.LAUNCH>
	//    5   11:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(s1 == null && s2 == null && s3 == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       43
	//*   8   18:aload_3         
	//*   9   19:ifnonnull       43
	//*  10   22:aload           4
	//*  11   24:ifnonnull       43
		{
			put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//   12   27:aload_0         
	//   13   28:getstatic       #112 <Field PdfName PdfName.F>
	//   14   31:new             #92  <Class PdfString>
	//   15   34:dup             
	//   16   35:aload_1         
	//   17   36:invokespecial   #95  <Method void PdfString(String)>
	//   18   39:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return;
	//   19   42:return          
		}
		PdfDictionary pdfdictionary = new PdfDictionary();
	//   20   43:new             #4   <Class PdfDictionary>
	//   21   46:dup             
	//   22   47:invokespecial   #43  <Method void PdfDictionary()>
	//   23   50:astore          5
		pdfdictionary.put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//   24   52:aload           5
	//   25   54:getstatic       #112 <Field PdfName PdfName.F>
	//   26   57:new             #92  <Class PdfString>
	//   27   60:dup             
	//   28   61:aload_1         
	//   29   62:invokespecial   #95  <Method void PdfString(String)>
	//   30   65:invokevirtual   #139 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(s1 != null)
	//*  31   68:aload_2         
	//*  32   69:ifnull          88
			pdfdictionary.put(PdfName.P, ((PdfObject) (new PdfString(s1))));
	//   33   72:aload           5
	//   34   74:getstatic       #142 <Field PdfName PdfName.P>
	//   35   77:new             #92  <Class PdfString>
	//   36   80:dup             
	//   37   81:aload_2         
	//   38   82:invokespecial   #95  <Method void PdfString(String)>
	//   39   85:invokevirtual   #139 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(s2 != null)
	//*  40   88:aload_3         
	//*  41   89:ifnull          108
			pdfdictionary.put(PdfName.O, ((PdfObject) (new PdfString(s2))));
	//   42   92:aload           5
	//   43   94:getstatic       #145 <Field PdfName PdfName.O>
	//   44   97:new             #92  <Class PdfString>
	//   45  100:dup             
	//   46  101:aload_3         
	//   47  102:invokespecial   #95  <Method void PdfString(String)>
	//   48  105:invokevirtual   #139 <Method void PdfDictionary.put(PdfName, PdfObject)>
		if(s3 != null)
	//*  49  108:aload           4
	//*  50  110:ifnull          130
			pdfdictionary.put(PdfName.D, ((PdfObject) (new PdfString(s3))));
	//   51  113:aload           5
	//   52  115:getstatic       #102 <Field PdfName PdfName.D>
	//   53  118:new             #92  <Class PdfString>
	//   54  121:dup             
	//   55  122:aload           4
	//   56  124:invokespecial   #95  <Method void PdfString(String)>
	//   57  127:invokevirtual   #139 <Method void PdfDictionary.put(PdfName, PdfObject)>
		put(PdfName.WIN, ((PdfObject) (pdfdictionary)));
	//   58  130:aload_0         
	//   59  131:getstatic       #148 <Field PdfName PdfName.WIN>
	//   60  134:aload           5
	//   61  136:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
	//   62  139:return          
	}

	public PdfAction(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void PdfDictionary()>
		put(PdfName.S, ((PdfObject) (PdfName.URI)));
	//    2    4:aload_0         
	//    3    5:getstatic       #51  <Field PdfName PdfName.S>
	//    4    8:getstatic       #151 <Field PdfName PdfName.URI>
	//    5   11:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		put(PdfName.URI, ((PdfObject) (new PdfString(s))));
	//    6   14:aload_0         
	//    7   15:getstatic       #151 <Field PdfName PdfName.URI>
	//    8   18:new             #92  <Class PdfString>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:invokespecial   #95  <Method void PdfString(String)>
	//   12   26:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(flag)
	//*  13   29:iload_2         
	//*  14   30:ifeq            43
			put(PdfName.ISMAP, ((PdfObject) (PdfBoolean.PDFTRUE)));
	//   15   33:aload_0         
	//   16   34:getstatic       #154 <Field PdfName PdfName.ISMAP>
	//   17   37:getstatic       #160 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//   18   40:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
	//   19   43:return          
	}

	public PdfAction(URL url)
	{
		this(url.toExternalForm());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #166 <Method String URL.toExternalForm()>
	//    3    5:invokespecial   #167 <Method void PdfAction(String)>
	//    4    8:return          
	}

	public PdfAction(URL url, boolean flag)
	{
		this(url.toExternalForm(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #166 <Method String URL.toExternalForm()>
	//    3    5:iload_2         
	//    4    6:invokespecial   #105 <Method void PdfAction(String, boolean)>
	//    5    9:return          
	}

	static PdfArray buildArray(Object aobj[])
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #172 <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #173 <Method void PdfArray()>
	//    3    7:astore_2        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		while(i < aobj.length) 
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          89
		{
			Object obj = aobj[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:aaload          
	//   13   19:astore_3        
			if(obj instanceof String)
	//*  14   20:aload_3         
	//*  15   21:instanceof      #175 <Class String>
	//*  16   24:ifeq            50
				pdfarray.add(((PdfObject) (new PdfString((String)obj))));
	//   17   27:aload_2         
	//   18   28:new             #92  <Class PdfString>
	//   19   31:dup             
	//   20   32:aload_3         
	//   21   33:checkcast       #175 <Class String>
	//   22   36:invokespecial   #95  <Method void PdfString(String)>
	//   23   39:invokevirtual   #179 <Method boolean PdfArray.add(PdfObject)>
	//   24   42:pop             
			else
	//*  25   43:iload_1         
	//*  26   44:iconst_1        
	//*  27   45:iadd            
	//*  28   46:istore_1        
	//*  29   47:goto            10
			if(obj instanceof PdfAnnotation)
	//*  30   50:aload_3         
	//*  31   51:instanceof      #181 <Class PdfAnnotation>
	//*  32   54:ifeq            72
				pdfarray.add(((PdfObject) (((PdfAnnotation)obj).getIndirectReference())));
	//   33   57:aload_2         
	//   34   58:aload_3         
	//   35   59:checkcast       #181 <Class PdfAnnotation>
	//   36   62:invokevirtual   #185 <Method PdfIndirectReference PdfAnnotation.getIndirectReference()>
	//   37   65:invokevirtual   #179 <Method boolean PdfArray.add(PdfObject)>
	//   38   68:pop             
			else
	//*  39   69:goto            43
				throw new RuntimeException(MessageLocalization.getComposedMessage("the.array.must.contain.string.or.pdfannotation", new Object[0]));
	//   40   72:new             #60  <Class RuntimeException>
	//   41   75:dup             
	//   42   76:ldc1            #187 <String "the.array.must.contain.string.or.pdfannotation">
	//   43   78:iconst_0        
	//   44   79:anewarray       Object[]
	//   45   82:invokestatic    #70  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   46   85:invokespecial   #73  <Method void RuntimeException(String)>
	//   47   88:athrow          
			i++;
		}
		return pdfarray;
	//   48   89:aload_2         
	//   49   90:areturn         
	}

	public static PdfAction createHide(PdfAnnotation pdfannotation, boolean flag)
	{
		return createHide(((PdfObject) (pdfannotation.getIndirectReference())), flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method PdfIndirectReference PdfAnnotation.getIndirectReference()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #192 <Method PdfAction createHide(PdfObject, boolean)>
	//    4    8:areturn         
	}

	static PdfAction createHide(PdfObject pdfobject, boolean flag)
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore_2        
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.HIDE)));
	//    4    8:aload_2         
	//    5    9:getstatic       #51  <Field PdfName PdfName.S>
	//    6   12:getstatic       #196 <Field PdfName PdfName.HIDE>
	//    7   15:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(PdfName.T, pdfobject);
	//    8   18:aload_2         
	//    9   19:getstatic       #199 <Field PdfName PdfName.T>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(!flag)
	//*  12   26:iload_1         
	//*  13   27:ifne            40
			pdfaction.put(PdfName.H, ((PdfObject) (PdfBoolean.PDFFALSE)));
	//   14   30:aload_2         
	//   15   31:getstatic       #202 <Field PdfName PdfName.H>
	//   16   34:getstatic       #205 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//   17   37:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		return pdfaction;
	//   18   40:aload_2         
	//   19   41:areturn         
	}

	public static PdfAction createHide(String s, boolean flag)
	{
		return createHide(((PdfObject) (new PdfString(s))), flag);
	//    0    0:new             #92  <Class PdfString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #95  <Method void PdfString(String)>
	//    4    8:iload_1         
	//    5    9:invokestatic    #192 <Method PdfAction createHide(PdfObject, boolean)>
	//    6   12:areturn         
	}

	public static PdfAction createHide(Object aobj[], boolean flag)
	{
		return createHide(((PdfObject) (buildArray(aobj))), flag);
	//    0    0:aload_0         
	//    1    1:invokestatic    #209 <Method PdfArray buildArray(Object[])>
	//    2    4:iload_1         
	//    3    5:invokestatic    #192 <Method PdfAction createHide(PdfObject, boolean)>
	//    4    8:areturn         
	}

	public static PdfAction createImportData(String s)
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore_1        
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.IMPORTDATA)));
	//    4    8:aload_1         
	//    5    9:getstatic       #51  <Field PdfName PdfName.S>
	//    6   12:getstatic       #214 <Field PdfName PdfName.IMPORTDATA>
	//    7   15:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//    8   18:aload_1         
	//    9   19:getstatic       #112 <Field PdfName PdfName.F>
	//   10   22:new             #92  <Class PdfString>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokespecial   #95  <Method void PdfString(String)>
	//   14   30:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		return pdfaction;
	//   15   33:aload_1         
	//   16   34:areturn         
	}

	public static PdfAction createLaunch(String s, String s1, String s2, String s3)
	{
		return new PdfAction(s, s1, s2, s3);
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #218 <Method void PdfAction(String, String, String, String)>
	//    7   11:areturn         
	}

	public static PdfAction createResetForm(Object aobj[], int i)
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore_2        
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.RESETFORM)));
	//    4    8:aload_2         
	//    5    9:getstatic       #51  <Field PdfName PdfName.S>
	//    6   12:getstatic       #223 <Field PdfName PdfName.RESETFORM>
	//    7   15:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(aobj != null)
	//*   8   18:aload_0         
	//*   9   19:ifnull          33
			pdfaction.put(PdfName.FIELDS, ((PdfObject) (buildArray(aobj))));
	//   10   22:aload_2         
	//   11   23:getstatic       #226 <Field PdfName PdfName.FIELDS>
	//   12   26:aload_0         
	//   13   27:invokestatic    #209 <Method PdfArray buildArray(Object[])>
	//   14   30:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(PdfName.FLAGS, ((PdfObject) (new PdfNumber(i))));
	//   15   33:aload_2         
	//   16   34:getstatic       #229 <Field PdfName PdfName.FLAGS>
	//   17   37:new             #231 <Class PdfNumber>
	//   18   40:dup             
	//   19   41:iload_1         
	//   20   42:invokespecial   #233 <Method void PdfNumber(int)>
	//   21   45:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		return pdfaction;
	//   22   48:aload_2         
	//   23   49:areturn         
	}

	public static PdfAction createSubmitForm(String s, Object aobj[], int i)
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore_3        
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.SUBMITFORM)));
	//    4    8:aload_3         
	//    5    9:getstatic       #51  <Field PdfName PdfName.S>
	//    6   12:getstatic       #238 <Field PdfName PdfName.SUBMITFORM>
	//    7   15:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		PdfDictionary pdfdictionary = new PdfDictionary();
	//    8   18:new             #4   <Class PdfDictionary>
	//    9   21:dup             
	//   10   22:invokespecial   #43  <Method void PdfDictionary()>
	//   11   25:astore          4
		pdfdictionary.put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//   12   27:aload           4
	//   13   29:getstatic       #112 <Field PdfName PdfName.F>
	//   14   32:new             #92  <Class PdfString>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:invokespecial   #95  <Method void PdfString(String)>
	//   18   40:invokevirtual   #139 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfdictionary.put(PdfName.FS, ((PdfObject) (com.itextpdf.text.pdf.PdfName.URL)));
	//   19   43:aload           4
	//   20   45:getstatic       #241 <Field PdfName PdfName.FS>
	//   21   48:getstatic       #244 <Field PdfName com.itextpdf.text.pdf.PdfName.URL>
	//   22   51:invokevirtual   #139 <Method void PdfDictionary.put(PdfName, PdfObject)>
		pdfaction.put(PdfName.F, ((PdfObject) (pdfdictionary)));
	//   23   54:aload_3         
	//   24   55:getstatic       #112 <Field PdfName PdfName.F>
	//   25   58:aload           4
	//   26   60:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(aobj != null)
	//*  27   63:aload_1         
	//*  28   64:ifnull          78
			pdfaction.put(PdfName.FIELDS, ((PdfObject) (buildArray(aobj))));
	//   29   67:aload_3         
	//   30   68:getstatic       #226 <Field PdfName PdfName.FIELDS>
	//   31   71:aload_1         
	//   32   72:invokestatic    #209 <Method PdfArray buildArray(Object[])>
	//   33   75:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(PdfName.FLAGS, ((PdfObject) (new PdfNumber(i))));
	//   34   78:aload_3         
	//   35   79:getstatic       #229 <Field PdfName PdfName.FLAGS>
	//   36   82:new             #231 <Class PdfNumber>
	//   37   85:dup             
	//   38   86:iload_2         
	//   39   87:invokespecial   #233 <Method void PdfNumber(int)>
	//   40   90:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		return pdfaction;
	//   41   93:aload_3         
	//   42   94:areturn         
	}

	public static PdfAction gotoEmbedded(String s, PdfTargetDictionary pdftargetdictionary, PdfObject pdfobject, boolean flag)
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore          4
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.GOTOE)));
	//    4    9:aload           4
	//    5   11:getstatic       #51  <Field PdfName PdfName.S>
	//    6   14:getstatic       #249 <Field PdfName PdfName.GOTOE>
	//    7   17:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(PdfName.T, ((PdfObject) (pdftargetdictionary)));
	//    8   20:aload           4
	//    9   22:getstatic       #199 <Field PdfName PdfName.T>
	//   10   25:aload_1         
	//   11   26:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(PdfName.D, pdfobject);
	//   12   29:aload           4
	//   13   31:getstatic       #102 <Field PdfName PdfName.D>
	//   14   34:aload_2         
	//   15   35:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(PdfName.NEWWINDOW, ((PdfObject) (new PdfBoolean(flag))));
	//   16   38:aload           4
	//   17   40:getstatic       #252 <Field PdfName PdfName.NEWWINDOW>
	//   18   43:new             #156 <Class PdfBoolean>
	//   19   46:dup             
	//   20   47:iload_3         
	//   21   48:invokespecial   #255 <Method void PdfBoolean(boolean)>
	//   22   51:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(s != null)
	//*  23   54:aload_0         
	//*  24   55:ifnull          74
			pdfaction.put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//   25   58:aload           4
	//   26   60:getstatic       #112 <Field PdfName PdfName.F>
	//   27   63:new             #92  <Class PdfString>
	//   28   66:dup             
	//   29   67:aload_0         
	//   30   68:invokespecial   #95  <Method void PdfString(String)>
	//   31   71:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		return pdfaction;
	//   32   74:aload           4
	//   33   76:areturn         
	}

	public static PdfAction gotoEmbedded(String s, PdfTargetDictionary pdftargetdictionary, String s1, boolean flag, boolean flag1)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            20
			return gotoEmbedded(s, pdftargetdictionary, ((PdfObject) (new PdfName(s1))), flag1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:new             #47  <Class PdfName>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #257 <Method void PdfName(String)>
	//    8   14:iload           4
	//    9   16:invokestatic    #259 <Method PdfAction gotoEmbedded(String, PdfTargetDictionary, PdfObject, boolean)>
	//   10   19:areturn         
		else
			return gotoEmbedded(s, pdftargetdictionary, ((PdfObject) (new PdfString(s1, "UnicodeBig"))), flag1);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:new             #92  <Class PdfString>
	//   14   25:dup             
	//   15   26:aload_2         
	//   16   27:ldc2            #261 <String "UnicodeBig">
	//   17   30:invokespecial   #263 <Method void PdfString(String, String)>
	//   18   33:iload           4
	//   19   35:invokestatic    #259 <Method PdfAction gotoEmbedded(String, PdfTargetDictionary, PdfObject, boolean)>
	//   20   38:areturn         
	}

	public static PdfAction gotoLocalPage(int i, PdfDestination pdfdestination, PdfWriter pdfwriter)
	{
		pdfwriter = ((PdfWriter) (pdfwriter.getPageReference(i)));
	//    0    0:aload_2         
	//    1    1:iload_0         
	//    2    2:invokevirtual   #271 <Method PdfIndirectReference PdfWriter.getPageReference(int)>
	//    3    5:astore_2        
		pdfdestination = new PdfDestination(pdfdestination);
	//    4    6:new             #273 <Class PdfDestination>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #276 <Method void PdfDestination(PdfDestination)>
	//    8   14:astore_1        
		pdfdestination.addPage(((PdfIndirectReference) (pdfwriter)));
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #280 <Method boolean PdfDestination.addPage(PdfIndirectReference)>
	//   12   20:pop             
		pdfwriter = ((PdfWriter) (new PdfAction()));
	//   13   21:new             #2   <Class PdfAction>
	//   14   24:dup             
	//   15   25:invokespecial   #193 <Method void PdfAction()>
	//   16   28:astore_2        
		((PdfAction) (pdfwriter)).put(PdfName.S, ((PdfObject) (PdfName.GOTO)));
	//   17   29:aload_2         
	//   18   30:getstatic       #51  <Field PdfName PdfName.S>
	//   19   33:getstatic       #99  <Field PdfName PdfName.GOTO>
	//   20   36:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		((PdfAction) (pdfwriter)).put(PdfName.D, ((PdfObject) (pdfdestination)));
	//   21   39:aload_2         
	//   22   40:getstatic       #102 <Field PdfName PdfName.D>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		return ((PdfAction) (pdfwriter));
	//   25   47:aload_2         
	//   26   48:areturn         
	}

	public static PdfAction gotoLocalPage(String s, boolean flag)
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore_2        
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.GOTO)));
	//    4    8:aload_2         
	//    5    9:getstatic       #51  <Field PdfName PdfName.S>
	//    6   12:getstatic       #99  <Field PdfName PdfName.GOTO>
	//    7   15:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(flag)
	//*   8   18:iload_1         
	//*   9   19:ifeq            39
		{
			pdfaction.put(PdfName.D, ((PdfObject) (new PdfName(s))));
	//   10   22:aload_2         
	//   11   23:getstatic       #102 <Field PdfName PdfName.D>
	//   12   26:new             #47  <Class PdfName>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #257 <Method void PdfName(String)>
	//   16   34:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return pdfaction;
	//   17   37:aload_2         
	//   18   38:areturn         
		} else
		{
			pdfaction.put(PdfName.D, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//   19   39:aload_2         
	//   20   40:getstatic       #102 <Field PdfName PdfName.D>
	//   21   43:new             #92  <Class PdfString>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:ldc2            #261 <String "UnicodeBig">
	//   25   51:invokespecial   #263 <Method void PdfString(String, String)>
	//   26   54:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return pdfaction;
	//   27   57:aload_2         
	//   28   58:areturn         
		}
	}

	public static PdfAction gotoRemotePage(String s, String s1, boolean flag, boolean flag1)
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore          4
		pdfaction.put(PdfName.F, ((PdfObject) (new PdfString(s))));
	//    4    9:aload           4
	//    5   11:getstatic       #112 <Field PdfName PdfName.F>
	//    6   14:new             #92  <Class PdfString>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokespecial   #95  <Method void PdfString(String)>
	//   10   22:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.GOTOR)));
	//   11   25:aload           4
	//   12   27:getstatic       #51  <Field PdfName PdfName.S>
	//   13   30:getstatic       #109 <Field PdfName PdfName.GOTOR>
	//   14   33:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(flag)
	//*  15   36:iload_2         
	//*  16   37:ifeq            74
			pdfaction.put(PdfName.D, ((PdfObject) (new PdfName(s1))));
	//   17   40:aload           4
	//   18   42:getstatic       #102 <Field PdfName PdfName.D>
	//   19   45:new             #47  <Class PdfName>
	//   20   48:dup             
	//   21   49:aload_1         
	//   22   50:invokespecial   #257 <Method void PdfName(String)>
	//   23   53:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		else
	//*  24   56:iload_3         
	//*  25   57:ifeq            71
	//*  26   60:aload           4
	//*  27   62:getstatic       #252 <Field PdfName PdfName.NEWWINDOW>
	//*  28   65:getstatic       #160 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//*  29   68:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
	//*  30   71:aload           4
	//*  31   73:areturn         
			pdfaction.put(PdfName.D, ((PdfObject) (new PdfString(s1, "UnicodeBig"))));
	//   32   74:aload           4
	//   33   76:getstatic       #102 <Field PdfName PdfName.D>
	//   34   79:new             #92  <Class PdfString>
	//   35   82:dup             
	//   36   83:aload_1         
	//   37   84:ldc2            #261 <String "UnicodeBig">
	//   38   87:invokespecial   #263 <Method void PdfString(String, String)>
	//   39   90:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(flag1)
			pdfaction.put(PdfName.NEWWINDOW, ((PdfObject) (PdfBoolean.PDFTRUE)));
		return pdfaction;
	//*  40   93:goto            56
	}

	public static PdfAction javaScript(String s, PdfWriter pdfwriter)
	{
		return javaScript(s, pdfwriter, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #287 <Method PdfAction javaScript(String, PdfWriter, boolean)>
	//    4    6:areturn         
	}

	public static PdfAction javaScript(String s, PdfWriter pdfwriter, boolean flag)
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore          4
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.JAVASCRIPT)));
	//    4    9:aload           4
	//    5   11:getstatic       #51  <Field PdfName PdfName.S>
	//    6   14:getstatic       #87  <Field PdfName PdfName.JAVASCRIPT>
	//    7   17:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(flag && s.length() < 50)
	//*   8   20:iload_2         
	//*   9   21:ifeq            55
	//*  10   24:aload_0         
	//*  11   25:invokevirtual   #293 <Method int String.length()>
	//*  12   28:bipush          50
	//*  13   30:icmpge          55
		{
			pdfaction.put(PdfName.JS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//   14   33:aload           4
	//   15   35:getstatic       #90  <Field PdfName PdfName.JS>
	//   16   38:new             #92  <Class PdfString>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:ldc2            #261 <String "UnicodeBig">
	//   20   46:invokespecial   #263 <Method void PdfString(String, String)>
	//   21   49:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return pdfaction;
	//   22   52:aload           4
	//   23   54:areturn         
		}
		if(!flag && s.length() < 100)
	//*  24   55:iload_2         
	//*  25   56:ifne            87
	//*  26   59:aload_0         
	//*  27   60:invokevirtual   #293 <Method int String.length()>
	//*  28   63:bipush          100
	//*  29   65:icmpge          87
		{
			pdfaction.put(PdfName.JS, ((PdfObject) (new PdfString(s))));
	//   30   68:aload           4
	//   31   70:getstatic       #90  <Field PdfName PdfName.JS>
	//   32   73:new             #92  <Class PdfString>
	//   33   76:dup             
	//   34   77:aload_0         
	//   35   78:invokespecial   #95  <Method void PdfString(String)>
	//   36   81:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return pdfaction;
	//   37   84:aload           4
	//   38   86:areturn         
		}
		Object obj;
		if(flag)
	//*  39   87:iload_2         
	//*  40   88:ifeq            155
			obj = "UnicodeBig";
	//   41   91:ldc2            #261 <String "UnicodeBig">
	//   42   94:astore_3        
		else
	//*  43   95:new             #295 <Class PdfStream>
	//*  44   98:dup             
	//*  45   99:aload_0         
	//*  46  100:aload_3         
	//*  47  101:invokestatic    #301 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//*  48  104:invokespecial   #304 <Method void PdfStream(byte[])>
	//*  49  107:astore_3        
	//*  50  108:aload_3         
	//*  51  109:aload_1         
	//*  52  110:invokevirtual   #307 <Method int PdfWriter.getCompressionLevel()>
	//*  53  113:invokevirtual   #310 <Method void PdfStream.flateCompress(int)>
	//*  54  116:aload           4
	//*  55  118:getstatic       #90  <Field PdfName PdfName.JS>
	//*  56  121:aload_1         
	//*  57  122:aload_3         
	//*  58  123:invokevirtual   #314 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject)>
	//*  59  126:invokevirtual   #317 <Method PdfIndirectReference PdfIndirectObject.getIndirectReference()>
	//*  60  129:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
	//*  61  132:aload           4
	//*  62  134:areturn         
	//*  63  135:astore_1        
	//*  64  136:aload           4
	//*  65  138:getstatic       #90  <Field PdfName PdfName.JS>
	//*  66  141:new             #92  <Class PdfString>
	//*  67  144:dup             
	//*  68  145:aload_0         
	//*  69  146:invokespecial   #95  <Method void PdfString(String)>
	//*  70  149:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
	//*  71  152:aload           4
	//*  72  154:areturn         
			obj = "PDF";
	//   73  155:ldc2            #319 <String "PDF">
	//   74  158:astore_3        
		try
		{
			obj = ((Object) (new PdfStream(PdfEncodings.convertToBytes(s, ((String) (obj))))));
			((PdfStream) (obj)).flateCompress(pdfwriter.getCompressionLevel());
			pdfaction.put(PdfName.JS, ((PdfObject) (pdfwriter.addToBody(((PdfObject) (obj))).getIndirectReference())));
		}
		// Misplaced declaration of an exception variable
		catch(PdfWriter pdfwriter)
		{
			pdfaction.put(PdfName.JS, ((PdfObject) (new PdfString(s))));
			return pdfaction;
		}
		return pdfaction;
	//*  75  159:goto            95
	}

	public static PdfAction rendition(String s, PdfFileSpecification pdffilespecification, String s1, PdfIndirectReference pdfindirectreference)
		throws IOException
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore          4
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.RENDITION)));
	//    4    9:aload           4
	//    5   11:getstatic       #51  <Field PdfName PdfName.S>
	//    6   14:getstatic       #326 <Field PdfName PdfName.RENDITION>
	//    7   17:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(PdfName.R, ((PdfObject) (new PdfRendition(s, pdffilespecification, s1))));
	//    8   20:aload           4
	//    9   22:getstatic       #329 <Field PdfName PdfName.R>
	//   10   25:new             #331 <Class PdfRendition>
	//   11   28:dup             
	//   12   29:aload_0         
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:invokespecial   #334 <Method void PdfRendition(String, PdfFileSpecification, String)>
	//   16   35:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(new PdfName("OP"), ((PdfObject) (new PdfNumber(0))));
	//   17   38:aload           4
	//   18   40:new             #47  <Class PdfName>
	//   19   43:dup             
	//   20   44:ldc2            #336 <String "OP">
	//   21   47:invokespecial   #257 <Method void PdfName(String)>
	//   22   50:new             #231 <Class PdfNumber>
	//   23   53:dup             
	//   24   54:iconst_0        
	//   25   55:invokespecial   #233 <Method void PdfNumber(int)>
	//   26   58:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		pdfaction.put(new PdfName("AN"), ((PdfObject) (pdfindirectreference)));
	//   27   61:aload           4
	//   28   63:new             #47  <Class PdfName>
	//   29   66:dup             
	//   30   67:ldc2            #338 <String "AN">
	//   31   70:invokespecial   #257 <Method void PdfName(String)>
	//   32   73:aload_3         
	//   33   74:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		return pdfaction;
	//   34   77:aload           4
	//   35   79:areturn         
	}

	public static PdfAction setOCGstate(ArrayList arraylist, boolean flag)
	{
		PdfAction pdfaction = new PdfAction();
	//    0    0:new             #2   <Class PdfAction>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void PdfAction()>
	//    3    7:astore          4
		pdfaction.put(PdfName.S, ((PdfObject) (PdfName.SETOCGSTATE)));
	//    4    9:aload           4
	//    5   11:getstatic       #51  <Field PdfName PdfName.S>
	//    6   14:getstatic       #344 <Field PdfName PdfName.SETOCGSTATE>
	//    7   17:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		PdfArray pdfarray = new PdfArray();
	//    8   20:new             #172 <Class PdfArray>
	//    9   23:dup             
	//   10   24:invokespecial   #173 <Method void PdfArray()>
	//   11   27:astore          5
		int i = 0;
	//   12   29:iconst_0        
	//   13   30:istore_2        
		while(i < arraylist.size()) 
	//*  14   31:iload_2         
	//*  15   32:aload_0         
	//*  16   33:invokevirtual   #349 <Method int ArrayList.size()>
	//*  17   36:icmpge          239
		{
			Object obj = arraylist.get(i);
	//   18   39:aload_0         
	//   19   40:iload_2         
	//   20   41:invokevirtual   #353 <Method Object ArrayList.get(int)>
	//   21   44:astore_3        
			if(obj != null)
	//*  22   45:aload_3         
	//*  23   46:ifnonnull       56
	//*  24   49:iload_2         
	//*  25   50:iconst_1        
	//*  26   51:iadd            
	//*  27   52:istore_2        
	//*  28   53:goto            31
				if(obj instanceof PdfIndirectReference)
	//*  29   56:aload_3         
	//*  30   57:instanceof      #355 <Class PdfIndirectReference>
	//*  31   60:ifeq            76
					pdfarray.add(((PdfObject) ((PdfIndirectReference)obj)));
	//   32   63:aload           5
	//   33   65:aload_3         
	//   34   66:checkcast       #355 <Class PdfIndirectReference>
	//   35   69:invokevirtual   #179 <Method boolean PdfArray.add(PdfObject)>
	//   36   72:pop             
				else
	//*  37   73:goto            49
				if(obj instanceof PdfLayer)
	//*  38   76:aload_3         
	//*  39   77:instanceof      #357 <Class PdfLayer>
	//*  40   80:ifeq            99
					pdfarray.add(((PdfObject) (((PdfLayer)obj).getRef())));
	//   41   83:aload           5
	//   42   85:aload_3         
	//   43   86:checkcast       #357 <Class PdfLayer>
	//   44   89:invokevirtual   #360 <Method PdfIndirectReference PdfLayer.getRef()>
	//   45   92:invokevirtual   #179 <Method boolean PdfArray.add(PdfObject)>
	//   46   95:pop             
				else
	//*  47   96:goto            49
				if(obj instanceof PdfName)
	//*  48   99:aload_3         
	//*  49  100:instanceof      #47  <Class PdfName>
	//*  50  103:ifeq            119
					pdfarray.add(((PdfObject) ((PdfName)obj)));
	//   51  106:aload           5
	//   52  108:aload_3         
	//   53  109:checkcast       #47  <Class PdfName>
	//   54  112:invokevirtual   #179 <Method boolean PdfArray.add(PdfObject)>
	//   55  115:pop             
				else
	//*  56  116:goto            49
				if(obj instanceof String)
	//*  57  119:aload_3         
	//*  58  120:instanceof      #175 <Class String>
	//*  59  123:ifeq            211
				{
					obj = ((Object) ((String)obj));
	//   60  126:aload_3         
	//   61  127:checkcast       #175 <Class String>
	//   62  130:astore_3        
					if(((String) (obj)).equalsIgnoreCase("on"))
	//*  63  131:aload_3         
	//*  64  132:ldc2            #362 <String "on">
	//*  65  135:invokevirtual   #366 <Method boolean String.equalsIgnoreCase(String)>
	//*  66  138:ifeq            155
						obj = ((Object) (PdfName.ON));
	//   67  141:getstatic       #369 <Field PdfName PdfName.ON>
	//   68  144:astore_3        
					else
	//*  69  145:aload           5
	//*  70  147:aload_3         
	//*  71  148:invokevirtual   #179 <Method boolean PdfArray.add(PdfObject)>
	//*  72  151:pop             
	//*  73  152:goto            49
					if(((String) (obj)).equalsIgnoreCase("off"))
	//*  74  155:aload_3         
	//*  75  156:ldc2            #371 <String "off">
	//*  76  159:invokevirtual   #366 <Method boolean String.equalsIgnoreCase(String)>
	//*  77  162:ifeq            172
						obj = ((Object) (PdfName.OFF));
	//   78  165:getstatic       #374 <Field PdfName PdfName.OFF>
	//   79  168:astore_3        
					else
	//*  80  169:goto            145
					if(((String) (obj)).equalsIgnoreCase("toggle"))
	//*  81  172:aload_3         
	//*  82  173:ldc2            #376 <String "toggle">
	//*  83  176:invokevirtual   #366 <Method boolean String.equalsIgnoreCase(String)>
	//*  84  179:ifeq            189
						obj = ((Object) (PdfName.TOGGLE));
	//   85  182:getstatic       #379 <Field PdfName PdfName.TOGGLE>
	//   86  185:astore_3        
					else
	//*  87  186:goto            145
						throw new IllegalArgumentException(MessageLocalization.getComposedMessage("a.string.1.was.passed.in.state.only.on.off.and.toggle.are.allowed", new Object[] {
							obj
						}));
	//   88  189:new             #381 <Class IllegalArgumentException>
	//   89  192:dup             
	//   90  193:ldc2            #383 <String "a.string.1.was.passed.in.state.only.on.off.and.toggle.are.allowed">
	//   91  196:iconst_1        
	//   92  197:anewarray       Object[]
	//   93  200:dup             
	//   94  201:iconst_0        
	//   95  202:aload_3         
	//   96  203:aastore         
	//   97  204:invokestatic    #70  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   98  207:invokespecial   #384 <Method void IllegalArgumentException(String)>
	//   99  210:athrow          
					pdfarray.add(((PdfObject) (obj)));
				} else
				{
					throw new IllegalArgumentException(MessageLocalization.getComposedMessage("invalid.type.was.passed.in.state.1", new Object[] {
						obj.getClass().getName()
					}));
	//  100  211:new             #381 <Class IllegalArgumentException>
	//  101  214:dup             
	//  102  215:ldc2            #386 <String "invalid.type.was.passed.in.state.1">
	//  103  218:iconst_1        
	//  104  219:anewarray       Object[]
	//  105  222:dup             
	//  106  223:iconst_0        
	//  107  224:aload_3         
	//  108  225:invokevirtual   #390 <Method Class Object.getClass()>
	//  109  228:invokevirtual   #395 <Method String Class.getName()>
	//  110  231:aastore         
	//  111  232:invokestatic    #70  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  112  235:invokespecial   #384 <Method void IllegalArgumentException(String)>
	//  113  238:athrow          
				}
			i++;
		}
		pdfaction.put(PdfName.STATE, ((PdfObject) (pdfarray)));
	//  114  239:aload           4
	//  115  241:getstatic       #398 <Field PdfName PdfName.STATE>
	//  116  244:aload           5
	//  117  246:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		if(!flag)
	//* 118  249:iload_1         
	//* 119  250:ifne            264
			pdfaction.put(PdfName.PRESERVERB, ((PdfObject) (PdfBoolean.PDFFALSE)));
	//  120  253:aload           4
	//  121  255:getstatic       #401 <Field PdfName PdfName.PRESERVERB>
	//  122  258:getstatic       #205 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//  123  261:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
		return pdfaction;
	//  124  264:aload           4
	//  125  266:areturn         
	}

	public void next(PdfAction pdfaction)
	{
		Object obj = ((Object) (get(PdfName.NEXT)));
	//    0    0:aload_0         
	//    1    1:getstatic       #408 <Field PdfName PdfName.NEXT>
	//    2    4:invokevirtual   #411 <Method PdfObject get(PdfName)>
	//    3    7:astore_2        
		if(obj == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       21
		{
			put(PdfName.NEXT, ((PdfObject) (pdfaction)));
	//    6   12:aload_0         
	//    7   13:getstatic       #408 <Field PdfName PdfName.NEXT>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return;
	//   10   20:return          
		}
		if(((PdfObject) (obj)).isDictionary())
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #417 <Method boolean PdfObject.isDictionary()>
	//*  13   25:ifeq            52
		{
			obj = ((Object) (new PdfArray(((PdfObject) (obj)))));
	//   14   28:new             #172 <Class PdfArray>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:invokespecial   #420 <Method void PdfArray(PdfObject)>
	//   18   36:astore_2        
			((PdfArray) (obj)).add(((PdfObject) (pdfaction)));
	//   19   37:aload_2         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #179 <Method boolean PdfArray.add(PdfObject)>
	//   22   42:pop             
			put(PdfName.NEXT, ((PdfObject) (obj)));
	//   23   43:aload_0         
	//   24   44:getstatic       #408 <Field PdfName PdfName.NEXT>
	//   25   47:aload_2         
	//   26   48:invokevirtual   #58  <Method void put(PdfName, PdfObject)>
			return;
	//   27   51:return          
		} else
		{
			((PdfArray)obj).add(((PdfObject) (pdfaction)));
	//   28   52:aload_2         
	//   29   53:checkcast       #172 <Class PdfArray>
	//   30   56:aload_1         
	//   31   57:invokevirtual   #179 <Method boolean PdfArray.add(PdfObject)>
	//   32   60:pop             
			return;
	//   33   61:return          
		}
	}

	public void toPdf(PdfWriter pdfwriter, OutputStream outputstream)
		throws IOException
	{
		PdfWriter.checkPdfIsoConformance(pdfwriter, 14, ((Object) (this)));
	//    0    0:aload_1         
	//    1    1:bipush          14
	//    2    3:aload_0         
	//    3    4:invokestatic    #426 <Method void PdfWriter.checkPdfIsoConformance(PdfWriter, int, Object)>
		super.toPdf(pdfwriter, outputstream);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #428 <Method void PdfDictionary.toPdf(PdfWriter, OutputStream)>
	//    8   13:return          
	}

	public static final int FIRSTPAGE = 1;
	public static final int LASTPAGE = 4;
	public static final int NEXTPAGE = 3;
	public static final int PREVPAGE = 2;
	public static final int PRINTDIALOG = 5;
	public static final int RESET_EXCLUDE = 1;
	public static final int SUBMIT_CANONICAL_FORMAT = 512;
	public static final int SUBMIT_COORDINATES = 16;
	public static final int SUBMIT_EMBED_FORM = 8196;
	public static final int SUBMIT_EXCLUDE = 1;
	public static final int SUBMIT_EXCL_F_KEY = 2048;
	public static final int SUBMIT_EXCL_NON_USER_ANNOTS = 1024;
	public static final int SUBMIT_HTML_FORMAT = 4;
	public static final int SUBMIT_HTML_GET = 8;
	public static final int SUBMIT_INCLUDE_ANNOTATIONS = 128;
	public static final int SUBMIT_INCLUDE_APPEND_SAVES = 64;
	public static final int SUBMIT_INCLUDE_NO_VALUE_FIELDS = 2;
	public static final int SUBMIT_PDF = 256;
	public static final int SUBMIT_XFDF = 32;
}
