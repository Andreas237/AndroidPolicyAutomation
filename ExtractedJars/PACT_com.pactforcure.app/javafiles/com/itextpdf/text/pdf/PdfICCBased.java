// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfStream, ICC_Profile, PdfException, PdfName, 
//			PdfNumber

public class PdfICCBased extends PdfStream
{

	public PdfICCBased(ICC_Profile icc_profile)
	{
		this(icc_profile, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokespecial   #9   <Method void PdfICCBased(ICC_Profile, int)>
	//    4    6:return          
	}

	public PdfICCBased(ICC_Profile icc_profile, int i)
	{
		int j;
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void PdfStream()>
		try
		{
			j = icc_profile.getNumComponents();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #21  <Method int ICC_Profile.getNumComponents()>
	//    4    8:istore_3        
		}
	//*   5    9:iload_3         
	//*   6   10:tableswitch     1 4: default 148
	//	               1 64
	//	               2 40
	//	               3 122
	//	               4 135
	//*   7   40:new             #23  <Class PdfException>
	//*   8   43:dup             
	//*   9   44:ldc1            #25  <String "1.component.s.is.not.supported">
	//*  10   46:iload_3         
	//*  11   47:invokestatic    #31  <Method String MessageLocalization.getComposedMessage(String, int)>
	//*  12   50:invokespecial   #34  <Method void PdfException(String)>
	//*  13   53:athrow          
		// Misplaced declaration of an exception variable
		catch(ICC_Profile icc_profile)
	//*  14   54:astore_1        
		{
			throw new ExceptionConverter(((Exception) (icc_profile)));
	//   15   55:new             #36  <Class ExceptionConverter>
	//   16   58:dup             
	//   17   59:aload_1         
	//   18   60:invokespecial   #39  <Method void ExceptionConverter(Exception)>
	//   19   63:athrow          
		}
		j;
		JVM INSTR tableswitch 1 4: default 148
	//	               1 64
	//	               2 40
	//	               3 122
	//	               4 135;
		   goto _L1 _L2 _L1 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_135;
_L1:
		throw new PdfException(MessageLocalization.getComposedMessage("1.component.s.is.not.supported", j));
_L2:
		put(PdfName.ALTERNATE, ((PdfObject) (PdfName.DEVICEGRAY)));
	//   20   64:aload_0         
	//   21   65:getstatic       #45  <Field PdfName PdfName.ALTERNATE>
	//   22   68:getstatic       #48  <Field PdfName PdfName.DEVICEGRAY>
	//   23   71:invokevirtual   #52  <Method void put(PdfName, PdfObject)>
_L5:
		put(PdfName.N, ((PdfObject) (new PdfNumber(j))));
	//   24   74:aload_0         
	//   25   75:getstatic       #55  <Field PdfName PdfName.N>
	//   26   78:new             #57  <Class PdfNumber>
	//   27   81:dup             
	//   28   82:iload_3         
	//   29   83:invokespecial   #60  <Method void PdfNumber(int)>
	//   30   86:invokevirtual   #52  <Method void put(PdfName, PdfObject)>
		bytes = icc_profile.getData();
	//   31   89:aload_0         
	//   32   90:aload_1         
	//   33   91:invokevirtual   #64  <Method byte[] ICC_Profile.getData()>
	//   34   94:putfield        #68  <Field byte[] bytes>
		put(PdfName.LENGTH, ((PdfObject) (new PdfNumber(bytes.length))));
	//   35   97:aload_0         
	//   36   98:getstatic       #71  <Field PdfName PdfName.LENGTH>
	//   37  101:new             #57  <Class PdfNumber>
	//   38  104:dup             
	//   39  105:aload_0         
	//   40  106:getfield        #68  <Field byte[] bytes>
	//   41  109:arraylength     
	//   42  110:invokespecial   #60  <Method void PdfNumber(int)>
	//   43  113:invokevirtual   #52  <Method void put(PdfName, PdfObject)>
		flateCompress(i);
	//   44  116:aload_0         
	//   45  117:iload_2         
	//   46  118:invokevirtual   #74  <Method void flateCompress(int)>
		return;
	//   47  121:return          
_L3:
		put(PdfName.ALTERNATE, ((PdfObject) (PdfName.DEVICERGB)));
	//   48  122:aload_0         
	//   49  123:getstatic       #45  <Field PdfName PdfName.ALTERNATE>
	//   50  126:getstatic       #77  <Field PdfName PdfName.DEVICERGB>
	//   51  129:invokevirtual   #52  <Method void put(PdfName, PdfObject)>
		  goto _L5
	//*  52  132:goto            74
		put(PdfName.ALTERNATE, ((PdfObject) (PdfName.DEVICECMYK)));
	//   53  135:aload_0         
	//   54  136:getstatic       #45  <Field PdfName PdfName.ALTERNATE>
	//   55  139:getstatic       #80  <Field PdfName PdfName.DEVICECMYK>
	//   56  142:invokevirtual   #52  <Method void put(PdfName, PdfObject)>
		  goto _L5
	//*  57  145:goto            74
	//*  58  148:goto            40
	}
}
