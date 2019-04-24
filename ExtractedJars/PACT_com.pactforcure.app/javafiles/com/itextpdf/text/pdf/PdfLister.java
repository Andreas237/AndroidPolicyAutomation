// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfObject, PdfArray, PdfDictionary, PdfName, 
//			PdfImportedPage, PdfReaderInstance, PdfReader, PRStream

public class PdfLister
{

	public PdfLister(PrintStream printstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		out = printstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field PrintStream out>
	//    5    9:return          
	}

	public void listAnyObject(PdfObject pdfobject)
	{
		switch(pdfobject.type())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #22  <Method int PdfObject.type()>
		{
	//*   2    4:tableswitch     3 6: default 36
	//	               3 66
	//	               4 36
	//	               5 48
	//	               6 57
		case 4: // '\004'
		default:
			out.println(pdfobject.toString());
	//    3   36:aload_0         
	//    4   37:getfield        #13  <Field PrintStream out>
	//    5   40:aload_1         
	//    6   41:invokevirtual   #26  <Method String PdfObject.toString()>
	//    7   44:invokevirtual   #32  <Method void PrintStream.println(String)>
			return;
	//    8   47:return          

		case 5: // '\005'
			listArray((PdfArray)pdfobject);
	//    9   48:aload_0         
	//   10   49:aload_1         
	//   11   50:checkcast       #34  <Class PdfArray>
	//   12   53:invokevirtual   #38  <Method void listArray(PdfArray)>
			return;
	//   13   56:return          

		case 6: // '\006'
			listDict((PdfDictionary)pdfobject);
	//   14   57:aload_0         
	//   15   58:aload_1         
	//   16   59:checkcast       #40  <Class PdfDictionary>
	//   17   62:invokevirtual   #44  <Method void listDict(PdfDictionary)>
			return;
	//   18   65:return          

		case 3: // '\003'
			out.println((new StringBuilder()).append("(").append(pdfobject.toString()).append(")").toString());
	//   19   66:aload_0         
	//   20   67:getfield        #13  <Field PrintStream out>
	//   21   70:new             #46  <Class StringBuilder>
	//   22   73:dup             
	//   23   74:invokespecial   #47  <Method void StringBuilder()>
	//   24   77:ldc1            #49  <String "(">
	//   25   79:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   26   82:aload_1         
	//   27   83:invokevirtual   #26  <Method String PdfObject.toString()>
	//   28   86:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   29   89:ldc1            #55  <String ")">
	//   30   91:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   31   94:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   32   97:invokevirtual   #32  <Method void PrintStream.println(String)>
			return;
	//   33  100:return          
		}
	}

	public void listArray(PdfArray pdfarray)
	{
		out.println('[');
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field PrintStream out>
	//    2    4:bipush          91
	//    3    6:invokevirtual   #59  <Method void PrintStream.println(char)>
		for(pdfarray = ((PdfArray) (pdfarray.listIterator())); ((Iterator) (pdfarray)).hasNext(); listAnyObject((PdfObject)((Iterator) (pdfarray)).next()));
	//    4    9:aload_1         
	//    5   10:invokevirtual   #63  <Method java.util.ListIterator PdfArray.listIterator()>
	//    6   13:astore_1        
	//    7   14:aload_1         
	//    8   15:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//    9   20:ifeq            39
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:invokeinterface #73  <Method Object Iterator.next()>
	//   13   30:checkcast       #18  <Class PdfObject>
	//   14   33:invokevirtual   #75  <Method void listAnyObject(PdfObject)>
	//*  15   36:goto            14
		out.println(']');
	//   16   39:aload_0         
	//   17   40:getfield        #13  <Field PrintStream out>
	//   18   43:bipush          93
	//   19   45:invokevirtual   #59  <Method void PrintStream.println(char)>
	//   20   48:return          
	}

	public void listDict(PdfDictionary pdfdictionary)
	{
		out.println("<<");
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field PrintStream out>
	//    2    4:ldc1            #77  <String "<<">
	//    3    6:invokevirtual   #32  <Method void PrintStream.println(String)>
		PdfObject pdfobject;
		for(Iterator iterator = pdfdictionary.getKeys().iterator(); iterator.hasNext(); listAnyObject(pdfobject))
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #81  <Method Set PdfDictionary.getKeys()>
	//*   6   13:invokeinterface #87  <Method Iterator Set.iterator()>
	//*   7   18:astore_2        
	//*   8   19:aload_2         
	//*   9   20:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//*  10   25:ifeq            74
		{
			PdfName pdfname = (PdfName)iterator.next();
	//   11   28:aload_2         
	//   12   29:invokeinterface #73  <Method Object Iterator.next()>
	//   13   34:checkcast       #89  <Class PdfName>
	//   14   37:astore_3        
			pdfobject = pdfdictionary.get(pdfname);
	//   15   38:aload_1         
	//   16   39:aload_3         
	//   17   40:invokevirtual   #93  <Method PdfObject PdfDictionary.get(PdfName)>
	//   18   43:astore          4
			out.print(pdfname.toString());
	//   19   45:aload_0         
	//   20   46:getfield        #13  <Field PrintStream out>
	//   21   49:aload_3         
	//   22   50:invokevirtual   #94  <Method String PdfName.toString()>
	//   23   53:invokevirtual   #97  <Method void PrintStream.print(String)>
			out.print(' ');
	//   24   56:aload_0         
	//   25   57:getfield        #13  <Field PrintStream out>
	//   26   60:bipush          32
	//   27   62:invokevirtual   #99  <Method void PrintStream.print(char)>
		}

	//   28   65:aload_0         
	//   29   66:aload           4
	//   30   68:invokevirtual   #75  <Method void listAnyObject(PdfObject)>
	//*  31   71:goto            19
		out.println(">>");
	//   32   74:aload_0         
	//   33   75:getfield        #13  <Field PrintStream out>
	//   34   78:ldc1            #101 <String ">>">
	//   35   80:invokevirtual   #32  <Method void PrintStream.println(String)>
	//   36   83:return          
	}

	public void listPage(PdfImportedPage pdfimportedpage)
	{
		Object obj;
		int i = pdfimportedpage.getPageNumber();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #108 <Method int PdfImportedPage.getPageNumber()>
	//    2    4:istore_2        
		pdfimportedpage = ((PdfImportedPage) (pdfimportedpage.getPdfReaderInstance()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #112 <Method PdfReaderInstance PdfImportedPage.getPdfReaderInstance()>
	//    5    9:astore_1        
		obj = ((Object) (((PdfReaderInstance) (pdfimportedpage)).getReader().getPageN(i)));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #118 <Method PdfReader PdfReaderInstance.getReader()>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #124 <Method PdfDictionary PdfReader.getPageN(int)>
	//   10   18:astore_3        
		listDict(((PdfDictionary) (obj)));
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:invokevirtual   #44  <Method void listDict(PdfDictionary)>
		obj = ((Object) (PdfReader.getPdfObject(((PdfDictionary) (obj)).get(PdfName.CONTENTS))));
	//   14   24:aload_3         
	//   15   25:getstatic       #128 <Field PdfName PdfName.CONTENTS>
	//   16   28:invokevirtual   #93  <Method PdfObject PdfDictionary.get(PdfName)>
	//   17   31:invokestatic    #132 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   18   34:astore_3        
		if(obj != null) goto _L2; else goto _L1
	//   19   35:aload_3         
	//   20   36:ifnonnull       40
_L1:
		return;
	//   21   39:return          
_L2:
		switch(((PdfObject) (obj)).type)
	//*  22   40:aload_3         
	//*  23   41:getfield        #135 <Field int PdfObject.type>
		{
	//*  24   44:tableswitch     5 7: default 72
	//	               5 73
	//	               6 72
	//	               7 122
		case 6: // '\006'
		default:
			return;
	//   25   72:return          

		case 5: // '\005'
			obj = ((Object) (((PdfArray)obj).listIterator()));
	//   26   73:aload_3         
	//   27   74:checkcast       #34  <Class PdfArray>
	//   28   77:invokevirtual   #63  <Method java.util.ListIterator PdfArray.listIterator()>
	//   29   80:astore_3        
			while(((Iterator) (obj)).hasNext()) 
	//*  30   81:aload_3         
	//*  31   82:invokeinterface #69  <Method boolean Iterator.hasNext()>
	//*  32   87:ifeq            39
			{
				listStream((PRStream)PdfReader.getPdfObject((PdfObject)((Iterator) (obj)).next()), ((PdfReaderInstance) (pdfimportedpage)));
	//   33   90:aload_0         
	//   34   91:aload_3         
	//   35   92:invokeinterface #73  <Method Object Iterator.next()>
	//   36   97:checkcast       #18  <Class PdfObject>
	//   37  100:invokestatic    #132 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//   38  103:checkcast       #137 <Class PRStream>
	//   39  106:aload_1         
	//   40  107:invokevirtual   #141 <Method void listStream(PRStream, PdfReaderInstance)>
				out.println("-----------");
	//   41  110:aload_0         
	//   42  111:getfield        #13  <Field PrintStream out>
	//   43  114:ldc1            #143 <String "-----------">
	//   44  116:invokevirtual   #32  <Method void PrintStream.println(String)>
			}
			break;

	//*  45  119:goto            81
		case 7: // '\007'
			listStream((PRStream)obj, ((PdfReaderInstance) (pdfimportedpage)));
	//   46  122:aload_0         
	//   47  123:aload_3         
	//   48  124:checkcast       #137 <Class PRStream>
	//   49  127:aload_1         
	//   50  128:invokevirtual   #141 <Method void listStream(PRStream, PdfReaderInstance)>
			return;
	//   51  131:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
	}

	public void listStream(PRStream prstream, PdfReaderInstance pdfreaderinstance)
	{
		int j;
		listDict(((PdfDictionary) (prstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #44  <Method void listDict(PdfDictionary)>
		out.println("startstream");
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field PrintStream out>
	//    5    9:ldc1            #147 <String "startstream">
	//    6   11:invokevirtual   #32  <Method void PrintStream.println(String)>
		prstream = ((PRStream) (PdfReader.getStreamBytes(prstream)));
	//    7   14:aload_1         
	//    8   15:invokestatic    #151 <Method byte[] PdfReader.getStreamBytes(PRStream)>
	//    9   18:astore_1        
		j = prstream.length;
	//   10   19:aload_1         
	//   11   20:arraylength     
	//   12   21:istore          4
		int i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_3        
	//*  15   25:goto            80
		do
		{
			while(i >= j - 1) 
			{
				try
				{
					out.println(new String(((byte []) (prstream))));
	//   16   28:aload_0         
	//   17   29:getfield        #13  <Field PrintStream out>
	//   18   32:new             #153 <Class String>
	//   19   35:dup             
	//   20   36:aload_1         
	//   21   37:invokespecial   #156 <Method void String(byte[])>
	//   22   40:invokevirtual   #32  <Method void PrintStream.println(String)>
					out.println("endstream");
	//   23   43:aload_0         
	//   24   44:getfield        #13  <Field PrintStream out>
	//   25   47:ldc1            #158 <String "endstream">
	//   26   49:invokevirtual   #32  <Method void PrintStream.println(String)>
					return;
	//   27   52:return          
				}
				// Misplaced declaration of an exception variable
				catch(PRStream prstream)
	//*  28   53:astore_1        
				{
					System.err.println((new StringBuilder()).append("I/O exception: ").append(((Object) (prstream))).toString());
	//   29   54:getstatic       #163 <Field PrintStream System.err>
	//   30   57:new             #46  <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #47  <Method void StringBuilder()>
	//   33   64:ldc1            #165 <String "I/O exception: ">
	//   34   66:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #168 <Method StringBuilder StringBuilder.append(Object)>
	//   37   73:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   38   76:invokevirtual   #32  <Method void PrintStream.println(String)>
				}
				return;
	//   39   79:return          
			}
	//   40   80:iload_3         
	//   41   81:iload           4
	//   42   83:iconst_1        
	//   43   84:isub            
	//   44   85:icmpge          28
			if(prstream[i] == 13 && prstream[i + 1] != 10)
	//*  45   88:aload_1         
	//*  46   89:iload_3         
	//*  47   90:baload          
	//*  48   91:bipush          13
	//*  49   93:icmpne          111
	//*  50   96:aload_1         
	//*  51   97:iload_3         
	//*  52   98:iconst_1        
	//*  53   99:iadd            
	//*  54  100:baload          
	//*  55  101:bipush          10
	//*  56  103:icmpeq          111
				prstream[i] = 10;
	//   57  106:aload_1         
	//   58  107:iload_3         
	//   59  108:bipush          10
	//   60  110:bastore         
			i++;
	//   61  111:iload_3         
	//   62  112:iconst_1        
	//   63  113:iadd            
	//   64  114:istore_3        
		} while(true);
	//   65  115:goto            80
	}

	PrintStream out;
}
