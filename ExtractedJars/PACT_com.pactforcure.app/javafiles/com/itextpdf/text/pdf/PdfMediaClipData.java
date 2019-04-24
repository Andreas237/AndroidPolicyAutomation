// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfString, PdfFileSpecification

public class PdfMediaClipData extends PdfDictionary
{

	PdfMediaClipData(String s, PdfFileSpecification pdffilespecification, String s1)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PdfDictionary()>
		put(PdfName.TYPE, ((PdfObject) (new PdfName("MediaClip"))));
	//    2    4:aload_0         
	//    3    5:getstatic       #17  <Field PdfName PdfName.TYPE>
	//    4    8:new             #13  <Class PdfName>
	//    5   11:dup             
	//    6   12:ldc1            #19  <String "MediaClip">
	//    7   14:invokespecial   #22  <Method void PdfName(String)>
	//    8   17:invokevirtual   #26  <Method void put(PdfName, PdfObject)>
		put(PdfName.S, ((PdfObject) (new PdfName("MCD"))));
	//    9   20:aload_0         
	//   10   21:getstatic       #29  <Field PdfName PdfName.S>
	//   11   24:new             #13  <Class PdfName>
	//   12   27:dup             
	//   13   28:ldc1            #31  <String "MCD">
	//   14   30:invokespecial   #22  <Method void PdfName(String)>
	//   15   33:invokevirtual   #26  <Method void put(PdfName, PdfObject)>
		put(PdfName.N, ((PdfObject) (new PdfString((new StringBuilder()).append("Media clip for ").append(s).toString()))));
	//   16   36:aload_0         
	//   17   37:getstatic       #34  <Field PdfName PdfName.N>
	//   18   40:new             #36  <Class PdfString>
	//   19   43:dup             
	//   20   44:new             #38  <Class StringBuilder>
	//   21   47:dup             
	//   22   48:invokespecial   #39  <Method void StringBuilder()>
	//   23   51:ldc1            #41  <String "Media clip for ">
	//   24   53:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:aload_1         
	//   26   57:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   27   60:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   28   63:invokespecial   #50  <Method void PdfString(String)>
	//   29   66:invokevirtual   #26  <Method void put(PdfName, PdfObject)>
		put(new PdfName("CT"), ((PdfObject) (new PdfString(s1))));
	//   30   69:aload_0         
	//   31   70:new             #13  <Class PdfName>
	//   32   73:dup             
	//   33   74:ldc1            #52  <String "CT">
	//   34   76:invokespecial   #22  <Method void PdfName(String)>
	//   35   79:new             #36  <Class PdfString>
	//   36   82:dup             
	//   37   83:aload_3         
	//   38   84:invokespecial   #50  <Method void PdfString(String)>
	//   39   87:invokevirtual   #26  <Method void put(PdfName, PdfObject)>
		s = ((String) (new PdfDictionary()));
	//   40   90:new             #4   <Class PdfDictionary>
	//   41   93:dup             
	//   42   94:invokespecial   #11  <Method void PdfDictionary()>
	//   43   97:astore_1        
		((PdfDictionary) (s)).put(new PdfName("TF"), ((PdfObject) (new PdfString("TEMPACCESS"))));
	//   44   98:aload_1         
	//   45   99:new             #13  <Class PdfName>
	//   46  102:dup             
	//   47  103:ldc1            #54  <String "TF">
	//   48  105:invokespecial   #22  <Method void PdfName(String)>
	//   49  108:new             #36  <Class PdfString>
	//   50  111:dup             
	//   51  112:ldc1            #56  <String "TEMPACCESS">
	//   52  114:invokespecial   #50  <Method void PdfString(String)>
	//   53  117:invokevirtual   #57  <Method void PdfDictionary.put(PdfName, PdfObject)>
		put(new PdfName("P"), ((PdfObject) (s)));
	//   54  120:aload_0         
	//   55  121:new             #13  <Class PdfName>
	//   56  124:dup             
	//   57  125:ldc1            #59  <String "P">
	//   58  127:invokespecial   #22  <Method void PdfName(String)>
	//   59  130:aload_1         
	//   60  131:invokevirtual   #26  <Method void put(PdfName, PdfObject)>
		put(PdfName.D, ((PdfObject) (pdffilespecification.getReference())));
	//   61  134:aload_0         
	//   62  135:getstatic       #62  <Field PdfName PdfName.D>
	//   63  138:aload_2         
	//   64  139:invokevirtual   #68  <Method PdfIndirectReference PdfFileSpecification.getReference()>
	//   65  142:invokevirtual   #26  <Method void put(PdfName, PdfObject)>
	//   66  145:return          
	}
}
