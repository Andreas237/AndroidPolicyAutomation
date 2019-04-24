// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.pdf.security.PdfSignatureBuildProperties;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfDictionary, PdfName, PdfArray, PdfNumber, 
//			PdfString, PdfDate

public class PdfSignature extends PdfDictionary
{

	public PdfSignature(PdfName pdfname, PdfName pdfname1)
	{
		super(PdfName.SIG);
	//    0    0:aload_0         
	//    1    1:getstatic       #12  <Field PdfName PdfName.SIG>
	//    2    4:invokespecial   #15  <Method void PdfDictionary(PdfName)>
		put(PdfName.FILTER, ((PdfObject) (pdfname)));
	//    3    7:aload_0         
	//    4    8:getstatic       #18  <Field PdfName PdfName.FILTER>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
		put(PdfName.SUBFILTER, ((PdfObject) (pdfname1)));
	//    7   15:aload_0         
	//    8   16:getstatic       #25  <Field PdfName PdfName.SUBFILTER>
	//    9   19:aload_2         
	//   10   20:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
	//   11   23:return          
	}

	PdfSignatureBuildProperties getPdfSignatureBuildProperties()
	{
		PdfSignatureBuildProperties pdfsignaturebuildproperties1 = (PdfSignatureBuildProperties)getAsDict(PdfName.PROP_BUILD);
	//    0    0:aload_0         
	//    1    1:getstatic       #31  <Field PdfName PdfName.PROP_BUILD>
	//    2    4:invokevirtual   #35  <Method PdfDictionary getAsDict(PdfName)>
	//    3    7:checkcast       #37  <Class PdfSignatureBuildProperties>
	//    4   10:astore_2        
		PdfSignatureBuildProperties pdfsignaturebuildproperties = pdfsignaturebuildproperties1;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(pdfsignaturebuildproperties1 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       33
		{
			pdfsignaturebuildproperties = new PdfSignatureBuildProperties();
	//    9   17:new             #37  <Class PdfSignatureBuildProperties>
	//   10   20:dup             
	//   11   21:invokespecial   #40  <Method void PdfSignatureBuildProperties()>
	//   12   24:astore_1        
			put(PdfName.PROP_BUILD, ((PdfObject) (pdfsignaturebuildproperties)));
	//   13   25:aload_0         
	//   14   26:getstatic       #31  <Field PdfName PdfName.PROP_BUILD>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
		}
		return pdfsignaturebuildproperties;
	//   17   33:aload_1         
	//   18   34:areturn         
	}

	public void setByteRange(int ai[])
	{
		PdfArray pdfarray = new PdfArray();
	//    0    0:new             #44  <Class PdfArray>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void PdfArray()>
	//    3    7:astore_3        
		for(int i = 0; i < ai.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_1         
	//*   8   12:arraylength     
	//*   9   13:icmpge          38
			pdfarray.add(((PdfObject) (new PdfNumber(ai[i]))));
	//   10   16:aload_3         
	//   11   17:new             #47  <Class PdfNumber>
	//   12   20:dup             
	//   13   21:aload_1         
	//   14   22:iload_2         
	//   15   23:iaload          
	//   16   24:invokespecial   #50  <Method void PdfNumber(int)>
	//   17   27:invokevirtual   #54  <Method boolean PdfArray.add(PdfObject)>
	//   18   30:pop             

	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_2        
	//*  23   35:goto            10
		put(PdfName.BYTERANGE, ((PdfObject) (pdfarray)));
	//   24   38:aload_0         
	//   25   39:getstatic       #57  <Field PdfName PdfName.BYTERANGE>
	//   26   42:aload_3         
	//   27   43:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
	//   28   46:return          
	}

	public void setCert(byte abyte0[])
	{
		put(PdfName.CERT, ((PdfObject) (new PdfString(abyte0))));
	//    0    0:aload_0         
	//    1    1:getstatic       #62  <Field PdfName PdfName.CERT>
	//    2    4:new             #64  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #66  <Method void PdfString(byte[])>
	//    6   12:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
	//    7   15:return          
	}

	public void setContact(String s)
	{
		put(PdfName.CONTACTINFO, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #71  <Field PdfName PdfName.CONTACTINFO>
	//    2    4:new             #64  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #73  <String "UnicodeBig">
	//    6   11:invokespecial   #76  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	public void setContents(byte abyte0[])
	{
		put(PdfName.CONTENTS, ((PdfObject) ((new PdfString(abyte0)).setHexWriting(true))));
	//    0    0:aload_0         
	//    1    1:getstatic       #80  <Field PdfName PdfName.CONTENTS>
	//    2    4:new             #64  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #66  <Method void PdfString(byte[])>
	//    6   12:iconst_1        
	//    7   13:invokevirtual   #84  <Method PdfString PdfString.setHexWriting(boolean)>
	//    8   16:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
	//    9   19:return          
	}

	public void setDate(PdfDate pdfdate)
	{
		put(PdfName.M, ((PdfObject) (pdfdate)));
	//    0    0:aload_0         
	//    1    1:getstatic       #89  <Field PdfName PdfName.M>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
	//    4    8:return          
	}

	public void setLocation(String s)
	{
		put(PdfName.LOCATION, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #93  <Field PdfName PdfName.LOCATION>
	//    2    4:new             #64  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #73  <String "UnicodeBig">
	//    6   11:invokespecial   #76  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	public void setName(String s)
	{
		put(PdfName.NAME, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #97  <Field PdfName PdfName.NAME>
	//    2    4:new             #64  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #73  <String "UnicodeBig">
	//    6   11:invokespecial   #76  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	public void setReason(String s)
	{
		put(PdfName.REASON, ((PdfObject) (new PdfString(s, "UnicodeBig"))));
	//    0    0:aload_0         
	//    1    1:getstatic       #101 <Field PdfName PdfName.REASON>
	//    2    4:new             #64  <Class PdfString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:ldc1            #73  <String "UnicodeBig">
	//    6   11:invokespecial   #76  <Method void PdfString(String, String)>
	//    7   14:invokevirtual   #22  <Method void put(PdfName, PdfObject)>
	//    8   17:return          
	}

	public void setSignatureCreator(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			getPdfSignatureBuildProperties().setSignatureCreator(s);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #104 <Method PdfSignatureBuildProperties getPdfSignatureBuildProperties()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #106 <Method void PdfSignatureBuildProperties.setSignatureCreator(String)>
	//    6   12:return          
	}
}
