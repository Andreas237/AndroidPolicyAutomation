// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.net.URL;
import java.security.MessageDigest;

// Referenced classes of package com.itextpdf.text:
//			Image

public class ImgJBIG2 extends Image
{

	public ImgJBIG2()
	{
		super((Image)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #4   <Class Image>
	//    3    5:invokespecial   #12  <Method void Image(Image)>
	//    4    8:return          
	}

	public ImgJBIG2(int i, int j, byte abyte0[], byte abyte1[])
	{
		super((URL)null);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:checkcast       #18  <Class URL>
	//    3    5:invokespecial   #21  <Method void Image(URL)>
		type = 36;
	//    4    8:aload_0         
	//    5    9:bipush          36
	//    6   11:putfield        #25  <Field int type>
		originalType = 9;
	//    7   14:aload_0         
	//    8   15:bipush          9
	//    9   17:putfield        #28  <Field int originalType>
		scaledHeight = j;
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:i2f             
	//   13   23:putfield        #32  <Field float scaledHeight>
		setTop(scaledHeight);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #32  <Field float scaledHeight>
	//   17   31:invokevirtual   #36  <Method void setTop(float)>
		scaledWidth = i;
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:i2f             
	//   21   37:putfield        #39  <Field float scaledWidth>
		setRight(scaledWidth);
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #39  <Field float scaledWidth>
	//   25   45:invokevirtual   #42  <Method void setRight(float)>
		bpc = 1;
	//   26   48:aload_0         
	//   27   49:iconst_1        
	//   28   50:putfield        #45  <Field int bpc>
		colorspace = 1;
	//   29   53:aload_0         
	//   30   54:iconst_1        
	//   31   55:putfield        #48  <Field int colorspace>
		rawData = abyte0;
	//   32   58:aload_0         
	//   33   59:aload_3         
	//   34   60:putfield        #51  <Field byte[] rawData>
		plainWidth = getWidth();
	//   35   63:aload_0         
	//   36   64:aload_0         
	//   37   65:invokevirtual   #55  <Method float getWidth()>
	//   38   68:putfield        #58  <Field float plainWidth>
		plainHeight = getHeight();
	//   39   71:aload_0         
	//   40   72:aload_0         
	//   41   73:invokevirtual   #61  <Method float getHeight()>
	//   42   76:putfield        #64  <Field float plainHeight>
		if(abyte1 == null)
			break MISSING_BLOCK_LABEL_112;
	//   43   79:aload           4
	//   44   81:ifnull          112
		global = abyte1;
	//   45   84:aload_0         
	//   46   85:aload           4
	//   47   87:putfield        #66  <Field byte[] global>
		abyte0 = ((byte []) (MessageDigest.getInstance("MD5")));
	//   48   90:ldc1            #68  <String "MD5">
	//   49   92:invokestatic    #74  <Method MessageDigest MessageDigest.getInstance(String)>
	//   50   95:astore_3        
		((MessageDigest) (abyte0)).update(global);
	//   51   96:aload_3         
	//   52   97:aload_0         
	//   53   98:getfield        #66  <Field byte[] global>
	//   54  101:invokevirtual   #78  <Method void MessageDigest.update(byte[])>
		globalHash = ((MessageDigest) (abyte0)).digest();
	//   55  104:aload_0         
	//   56  105:aload_3         
	//   57  106:invokevirtual   #82  <Method byte[] MessageDigest.digest()>
	//   58  109:putfield        #84  <Field byte[] globalHash>
		return;
	//   59  112:return          
		abyte0;
	//   60  113:astore_3        
	//   61  114:return          
	}

	ImgJBIG2(Image image)
	{
		super(image);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void Image(Image)>
	//    3    5:return          
	}

	public byte[] getGlobalBytes()
	{
		return global;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field byte[] global>
	//    2    4:areturn         
	}

	public byte[] getGlobalHash()
	{
		return globalHash;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field byte[] globalHash>
	//    2    4:areturn         
	}

	private byte global[];
	private byte globalHash[];
}
