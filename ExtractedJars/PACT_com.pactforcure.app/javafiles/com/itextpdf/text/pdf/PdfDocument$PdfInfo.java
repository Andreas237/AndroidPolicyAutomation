// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.Version;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfDocument, PdfName, PdfString, 
//			PdfDate

public static class PdfDocument$PdfInfo extends PdfDictionary
{

	void addAuthor(String s)
	{
		put(PdfName.AUTHOR, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #36  <Field PdfName PdfName.AUTHOR>
	//    2    4:new             #38  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "UnicodeBig">
	//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	void addCreationDate()
	{
		PdfDate pdfdate = new PdfDate();
	//    0    0:new             #49  <Class PdfDate>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void PdfDate()>
	//    3    7:astore_1        
		put(PdfName.CREATIONDATE, ((PdfObject) (pdfdate)));
	//    4    8:aload_0         
	//    5    9:getstatic       #53  <Field PdfName PdfName.CREATIONDATE>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
		put(PdfName.MODDATE, ((PdfObject) (pdfdate)));
	//    8   16:aload_0         
	//    9   17:getstatic       #56  <Field PdfName PdfName.MODDATE>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//   12   24:return          
	}

	void addCreator(String s)
	{
		put(PdfName.CREATOR, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #60  <Field PdfName PdfName.CREATOR>
	//    2    4:new             #38  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "UnicodeBig">
	//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	void addKeywords(String s)
	{
		put(PdfName.KEYWORDS, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #64  <Field PdfName PdfName.KEYWORDS>
	//    2    4:new             #38  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "UnicodeBig">
	//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	void addProducer()
	{
		put(PdfName.PRODUCER, ((PdfObject) (new PdfString(Version.getInstance().getVersion()))));
	//    0    0:aload_0         
	//    1    1:getstatic       #67  <Field PdfName PdfName.PRODUCER>
	//    2    4:new             #38  <Class PdfString>
	//    3    7:dup             
	//    4    8:invokestatic    #73  <Method Version Version.getInstance()>
	//    5   11:invokevirtual   #77  <Method String Version.getVersion()>
	//    6   14:invokespecial   #79  <Method void PdfString(String)>
	//    7   17:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//    8   20:return          
	}

	void addSubject(String s)
	{
		put(PdfName.SUBJECT, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #82  <Field PdfName PdfName.SUBJECT>
	//    2    4:new             #38  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "UnicodeBig">
	//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	void addTitle(String s)
	{
		put(PdfName.TITLE, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #85  <Field PdfName PdfName.TITLE>
	//    2    4:new             #38  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #40  <String "UnicodeBig">
	//    6   11:invokespecial   #43  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	void addkey(String s, String s1)
	{
		if(s.equals("Producer") || s.equals("CreationDate"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #88  <String "Producer">
	//*   2    3:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*   3    6:ifne            18
	//*   4    9:aload_1         
	//*   5   10:ldc1            #96  <String "CreationDate">
	//*   6   12:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*   7   15:ifeq            19
		{
			return;
	//    8   18:return          
		} else
		{
			put(new PdfName(s), ((PdfObject) (new PdfString(s1, "UnicodeBig"))));
	//    9   19:aload_0         
	//   10   20:new             #32  <Class PdfName>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #97  <Method void PdfName(String)>
	//   14   28:new             #38  <Class PdfString>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:ldc1            #40  <String "UnicodeBig">
	//   18   35:invokespecial   #43  <Method void PdfString(String, String)>
	//   19   38:invokevirtual   #47  <Method void put(PdfName, PdfObject)>
			return;
	//   20   41:return          
		}
	}

	PdfDocument$PdfInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PdfDictionary()>
		addProducer();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #14  <Method void addProducer()>
		addCreationDate();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #17  <Method void addCreationDate()>
	//    6   12:return          
	}

	PdfDocument$PdfInfo(String s, String s1, String s2)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void PdfDocument$PdfInfo()>
		addTitle(s1);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #24  <Method void addTitle(String)>
		addSubject(s2);
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #27  <Method void addSubject(String)>
		addAuthor(s);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #30  <Method void addAuthor(String)>
	//   11   19:return          
	}
}
