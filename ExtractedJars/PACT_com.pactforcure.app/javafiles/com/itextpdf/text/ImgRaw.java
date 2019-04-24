// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.net.URL;

// Referenced classes of package com.itextpdf.text:
//			Image, BadElementException

public class ImgRaw extends Image
{

	public ImgRaw(int i, int j, int k, int l, byte abyte0[])
		throws BadElementException
	{
		super((URL)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #10  <Class URL>
	//    3    5:invokespecial   #13  <Method void Image(URL)>
		type = 34;
	//    4    8:aload_0         
	//    5    9:bipush          34
	//    6   11:putfield        #17  <Field int type>
		scaledHeight = j;
	//    7   14:aload_0         
	//    8   15:iload_2         
	//    9   16:i2f             
	//   10   17:putfield        #21  <Field float scaledHeight>
		setTop(scaledHeight);
	//   11   20:aload_0         
	//   12   21:aload_0         
	//   13   22:getfield        #21  <Field float scaledHeight>
	//   14   25:invokevirtual   #25  <Method void setTop(float)>
		scaledWidth = i;
	//   15   28:aload_0         
	//   16   29:iload_1         
	//   17   30:i2f             
	//   18   31:putfield        #28  <Field float scaledWidth>
		setRight(scaledWidth);
	//   19   34:aload_0         
	//   20   35:aload_0         
	//   21   36:getfield        #28  <Field float scaledWidth>
	//   22   39:invokevirtual   #31  <Method void setRight(float)>
		if(k != 1 && k != 3 && k != 4)
	//*  23   42:iload_3         
	//*  24   43:iconst_1        
	//*  25   44:icmpeq          74
	//*  26   47:iload_3         
	//*  27   48:iconst_3        
	//*  28   49:icmpeq          74
	//*  29   52:iload_3         
	//*  30   53:iconst_4        
	//*  31   54:icmpeq          74
			throw new BadElementException(MessageLocalization.getComposedMessage("components.must.be.1.3.or.4", new Object[0]));
	//   32   57:new             #8   <Class BadElementException>
	//   33   60:dup             
	//   34   61:ldc1            #33  <String "components.must.be.1.3.or.4">
	//   35   63:iconst_0        
	//   36   64:anewarray       Object[]
	//   37   67:invokestatic    #41  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   38   70:invokespecial   #44  <Method void BadElementException(String)>
	//   39   73:athrow          
		if(l != 1 && l != 2 && l != 4 && l != 8)
	//*  40   74:iload           4
	//*  41   76:iconst_1        
	//*  42   77:icmpeq          116
	//*  43   80:iload           4
	//*  44   82:iconst_2        
	//*  45   83:icmpeq          116
	//*  46   86:iload           4
	//*  47   88:iconst_4        
	//*  48   89:icmpeq          116
	//*  49   92:iload           4
	//*  50   94:bipush          8
	//*  51   96:icmpeq          116
		{
			throw new BadElementException(MessageLocalization.getComposedMessage("bits.per.component.must.be.1.2.4.or.8", new Object[0]));
	//   52   99:new             #8   <Class BadElementException>
	//   53  102:dup             
	//   54  103:ldc1            #46  <String "bits.per.component.must.be.1.2.4.or.8">
	//   55  105:iconst_0        
	//   56  106:anewarray       Object[]
	//   57  109:invokestatic    #41  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   58  112:invokespecial   #44  <Method void BadElementException(String)>
	//   59  115:athrow          
		} else
		{
			colorspace = k;
	//   60  116:aload_0         
	//   61  117:iload_3         
	//   62  118:putfield        #49  <Field int colorspace>
			bpc = l;
	//   63  121:aload_0         
	//   64  122:iload           4
	//   65  124:putfield        #52  <Field int bpc>
			rawData = abyte0;
	//   66  127:aload_0         
	//   67  128:aload           5
	//   68  130:putfield        #56  <Field byte[] rawData>
			plainWidth = getWidth();
	//   69  133:aload_0         
	//   70  134:aload_0         
	//   71  135:invokevirtual   #60  <Method float getWidth()>
	//   72  138:putfield        #63  <Field float plainWidth>
			plainHeight = getHeight();
	//   73  141:aload_0         
	//   74  142:aload_0         
	//   75  143:invokevirtual   #66  <Method float getHeight()>
	//   76  146:putfield        #69  <Field float plainHeight>
			return;
	//   77  149:return          
		}
	}

	ImgRaw(Image image)
	{
		super(image);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method void Image(Image)>
	//    3    5:return          
	}
}
