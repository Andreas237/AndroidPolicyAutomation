// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.pdf;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.codec.Base64;
import com.itextpdf.tool.xml.pipeline.html.AbstractImageProvider;
import java.io.IOException;

// Referenced classes of package com.pactforcure.app.pdf:
//			PdfGenerator

static class PdfGenerator$Base64ImageProvider extends AbstractImageProvider
{

	public String getImageRootPath()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Image retrieve(String s)
	{
		int i = s.indexOf("base64,");
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "base64,">
	//    2    3:invokevirtual   #28  <Method int String.indexOf(String)>
	//    3    6:istore_2        
		if(s.startsWith("data") && i > 0)
	//*   4    7:aload_1         
	//*   5    8:ldc1            #30  <String "data">
	//*   6   10:invokevirtual   #34  <Method boolean String.startsWith(String)>
	//*   7   13:ifeq            43
	//*   8   16:iload_2         
	//*   9   17:ifle            43
		{
			try
			{
				s = ((String) (Image.getInstance(Base64.decode(s.substring(i + 7)))));
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:bipush          7
	//   13   24:iadd            
	//   14   25:invokevirtual   #38  <Method String String.substring(int)>
	//   15   28:invokestatic    #44  <Method byte[] Base64.decode(String)>
	//   16   31:invokestatic    #50  <Method Image Image.getInstance(byte[])>
	//   17   34:astore_1        
				((Image) (s)).scalePercent(50F);
	//   18   35:aload_1         
	//   19   36:ldc1            #51  <Float 50F>
	//   20   38:invokevirtual   #55  <Method void Image.scalePercent(float)>
			}
	//*  21   41:aload_1         
	//*  22   42:areturn         
	//*  23   43:aload_1         
	//*  24   44:invokestatic    #57  <Method Image Image.getInstance(String)>
	//*  25   47:astore_1        
	//*  26   48:aload_1         
	//*  27   49:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  28   50:astore_1        
			{
				return null;
	//   29   51:aconst_null     
	//   30   52:areturn         
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  31   53:astore_1        
			{
				return null;
	//   32   54:aconst_null     
	//   33   55:areturn         
			}
			return ((Image) (s));
		}
		s = ((String) (Image.getInstance(s)));
		return ((Image) (s));
	}

	PdfGenerator$Base64ImageProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractImageProvider()>
	//    2    4:return          
	}
}
