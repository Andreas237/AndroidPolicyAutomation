// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.codec.TIFFFaxDecoder;
import java.net.URL;

// Referenced classes of package com.itextpdf.text:
//			Image, BadElementException

public class ImgCCITT extends Image
{

	public ImgCCITT(int i, int j, boolean flag, int k, int l, byte abyte0[])
		throws BadElementException
	{
		super((URL)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #10  <Class URL>
	//    3    5:invokespecial   #13  <Method void Image(URL)>
		if(k != 256 && k != 257 && k != 258)
	//*   4    8:iload           4
	//*   5   10:sipush          256
	//*   6   13:icmpeq          49
	//*   7   16:iload           4
	//*   8   18:sipush          257
	//*   9   21:icmpeq          49
	//*  10   24:iload           4
	//*  11   26:sipush          258
	//*  12   29:icmpeq          49
			throw new BadElementException(MessageLocalization.getComposedMessage("the.ccitt.compression.type.must.be.ccittg4.ccittg3.1d.or.ccittg3.2d", new Object[0]));
	//   13   32:new             #8   <Class BadElementException>
	//   14   35:dup             
	//   15   36:ldc1            #15  <String "the.ccitt.compression.type.must.be.ccittg4.ccittg3.1d.or.ccittg3.2d">
	//   16   38:iconst_0        
	//   17   39:anewarray       Object[]
	//   18   42:invokestatic    #23  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   19   45:invokespecial   #26  <Method void BadElementException(String)>
	//   20   48:athrow          
		if(flag)
	//*  21   49:iload_3         
	//*  22   50:ifeq            58
			TIFFFaxDecoder.reverseBits(abyte0);
	//   23   53:aload           6
	//   24   55:invokestatic    #32  <Method void TIFFFaxDecoder.reverseBits(byte[])>
		type = 34;
	//   25   58:aload_0         
	//   26   59:bipush          34
	//   27   61:putfield        #36  <Field int type>
		scaledHeight = j;
	//   28   64:aload_0         
	//   29   65:iload_2         
	//   30   66:i2f             
	//   31   67:putfield        #40  <Field float scaledHeight>
		setTop(scaledHeight);
	//   32   70:aload_0         
	//   33   71:aload_0         
	//   34   72:getfield        #40  <Field float scaledHeight>
	//   35   75:invokevirtual   #44  <Method void setTop(float)>
		scaledWidth = i;
	//   36   78:aload_0         
	//   37   79:iload_1         
	//   38   80:i2f             
	//   39   81:putfield        #47  <Field float scaledWidth>
		setRight(scaledWidth);
	//   40   84:aload_0         
	//   41   85:aload_0         
	//   42   86:getfield        #47  <Field float scaledWidth>
	//   43   89:invokevirtual   #50  <Method void setRight(float)>
		colorspace = l;
	//   44   92:aload_0         
	//   45   93:iload           5
	//   46   95:putfield        #53  <Field int colorspace>
		bpc = k;
	//   47   98:aload_0         
	//   48   99:iload           4
	//   49  101:putfield        #56  <Field int bpc>
		rawData = abyte0;
	//   50  104:aload_0         
	//   51  105:aload           6
	//   52  107:putfield        #60  <Field byte[] rawData>
		plainWidth = getWidth();
	//   53  110:aload_0         
	//   54  111:aload_0         
	//   55  112:invokevirtual   #64  <Method float getWidth()>
	//   56  115:putfield        #67  <Field float plainWidth>
		plainHeight = getHeight();
	//   57  118:aload_0         
	//   58  119:aload_0         
	//   59  120:invokevirtual   #70  <Method float getHeight()>
	//   60  123:putfield        #73  <Field float plainHeight>
	//   61  126:return          
	}

	ImgCCITT(Image image)
	{
		super(image);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method void Image(Image)>
	//    3    5:return          
	}
}
