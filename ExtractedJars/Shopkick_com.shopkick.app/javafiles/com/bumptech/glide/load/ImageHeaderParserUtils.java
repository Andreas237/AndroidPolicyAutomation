// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load:
//			ImageHeaderParser

public final class ImageHeaderParserUtils
{

	private ImageHeaderParserUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static int getOrientation(List list, InputStream inputstream, ArrayPool arraypool)
		throws IOException
	{
		int i;
		int j;
		Object obj;
		if(inputstream == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		obj = ((Object) (inputstream));
	//    4    6:aload_1         
	//    5    7:astore          6
		if(!inputstream.markSupported())
	//*   6    9:aload_1         
	//*   7   10:invokevirtual   #24  <Method boolean InputStream.markSupported()>
	//*   8   13:ifne            27
			obj = ((Object) (new RecyclableBufferedInputStream(inputstream, arraypool)));
	//    9   16:new             #26  <Class RecyclableBufferedInputStream>
	//   10   19:dup             
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:invokespecial   #29  <Method void RecyclableBufferedInputStream(InputStream, ArrayPool)>
	//   14   25:astore          6
		((InputStream) (obj)).mark(0x500000);
	//   15   27:aload           6
	//   16   29:ldc1            #7   <Int 0x500000>
	//   17   31:invokevirtual   #33  <Method void InputStream.mark(int)>
		i = 0;
	//   18   34:iconst_0        
	//   19   35:istore_3        
		j = list.size();
	//   20   36:aload_0         
	//   21   37:invokeinterface #39  <Method int List.size()>
	//   22   42:istore          4
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   23   44:iload_3         
	//   24   45:iload           4
	//   25   47:icmpge          106
		inputstream = ((InputStream) ((ImageHeaderParser)list.get(i)));
	//   26   50:aload_0         
	//   27   51:iload_3         
	//   28   52:invokeinterface #43  <Method Object List.get(int)>
	//   29   57:checkcast       #45  <Class ImageHeaderParser>
	//   30   60:astore_1        
		int k = ((ImageHeaderParser) (inputstream)).getOrientation(((InputStream) (obj)), arraypool);
	//   31   61:aload_1         
	//   32   62:aload           6
	//   33   64:aload_2         
	//   34   65:invokeinterface #48  <Method int ImageHeaderParser.getOrientation(InputStream, ArrayPool)>
	//   35   70:istore          5
		if(k != -1)
	//*  36   72:iload           5
	//*  37   74:iconst_m1       
	//*  38   75:icmpeq          86
		{
			((InputStream) (obj)).reset();
	//   39   78:aload           6
	//   40   80:invokevirtual   #51  <Method void InputStream.reset()>
			return k;
	//   41   83:iload           5
	//   42   85:ireturn         
		}
		((InputStream) (obj)).reset();
	//   43   86:aload           6
	//   44   88:invokevirtual   #51  <Method void InputStream.reset()>
		i++;
	//   45   91:iload_3         
	//   46   92:iconst_1        
	//   47   93:iadd            
	//   48   94:istore_3        
		if(true) goto _L2; else goto _L1
	//   49   95:goto            44
		list;
	//   50   98:astore_0        
		((InputStream) (obj)).reset();
	//   51   99:aload           6
	//   52  101:invokevirtual   #51  <Method void InputStream.reset()>
		throw list;
	//   53  104:aload_0         
	//   54  105:athrow          
_L1:
		return -1;
	//   55  106:iconst_m1       
	//   56  107:ireturn         
	}

	public static ImageHeaderParser.ImageType getType(List list, InputStream inputstream, ArrayPool arraypool)
		throws IOException
	{
		int i;
		int j;
		Object obj;
		if(inputstream == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return ImageHeaderParser.ImageType.UNKNOWN;
	//    2    4:getstatic       #63  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//    3    7:areturn         
		obj = ((Object) (inputstream));
	//    4    8:aload_1         
	//    5    9:astore          5
		if(!inputstream.markSupported())
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #24  <Method boolean InputStream.markSupported()>
	//*   8   15:ifne            29
			obj = ((Object) (new RecyclableBufferedInputStream(inputstream, arraypool)));
	//    9   18:new             #26  <Class RecyclableBufferedInputStream>
	//   10   21:dup             
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokespecial   #29  <Method void RecyclableBufferedInputStream(InputStream, ArrayPool)>
	//   14   27:astore          5
		((InputStream) (obj)).mark(0x500000);
	//   15   29:aload           5
	//   16   31:ldc1            #7   <Int 0x500000>
	//   17   33:invokevirtual   #33  <Method void InputStream.mark(int)>
		i = 0;
	//   18   36:iconst_0        
	//   19   37:istore_3        
		j = list.size();
	//   20   38:aload_0         
	//   21   39:invokeinterface #39  <Method int List.size()>
	//   22   44:istore          4
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   23   46:iload_3         
	//   24   47:iload           4
	//   25   49:icmpge          108
		inputstream = ((InputStream) ((ImageHeaderParser)list.get(i)));
	//   26   52:aload_0         
	//   27   53:iload_3         
	//   28   54:invokeinterface #43  <Method Object List.get(int)>
	//   29   59:checkcast       #45  <Class ImageHeaderParser>
	//   30   62:astore_1        
		inputstream = ((InputStream) (((ImageHeaderParser) (inputstream)).getType(((InputStream) (obj)))));
	//   31   63:aload_1         
	//   32   64:aload           5
	//   33   66:invokeinterface #66  <Method ImageHeaderParser$ImageType ImageHeaderParser.getType(InputStream)>
	//   34   71:astore_1        
		arraypool = ((ArrayPool) (ImageHeaderParser.ImageType.UNKNOWN));
	//   35   72:getstatic       #63  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//   36   75:astore_2        
		if(inputstream != arraypool)
	//*  37   76:aload_1         
	//*  38   77:aload_2         
	//*  39   78:if_acmpeq       88
		{
			((InputStream) (obj)).reset();
	//   40   81:aload           5
	//   41   83:invokevirtual   #51  <Method void InputStream.reset()>
			return ((ImageHeaderParser.ImageType) (inputstream));
	//   42   86:aload_1         
	//   43   87:areturn         
		}
		((InputStream) (obj)).reset();
	//   44   88:aload           5
	//   45   90:invokevirtual   #51  <Method void InputStream.reset()>
		i++;
	//   46   93:iload_3         
	//   47   94:iconst_1        
	//   48   95:iadd            
	//   49   96:istore_3        
		if(true) goto _L2; else goto _L1
	//   50   97:goto            46
		list;
	//   51  100:astore_0        
		((InputStream) (obj)).reset();
	//   52  101:aload           5
	//   53  103:invokevirtual   #51  <Method void InputStream.reset()>
		throw list;
	//   54  106:aload_0         
	//   55  107:athrow          
_L1:
		return ImageHeaderParser.ImageType.UNKNOWN;
	//   56  108:getstatic       #63  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//   57  111:areturn         
	}

	public static ImageHeaderParser.ImageType getType(List list, ByteBuffer bytebuffer)
		throws IOException
	{
		if(bytebuffer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return ImageHeaderParser.ImageType.UNKNOWN;
	//    2    4:getstatic       #63  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//    3    7:areturn         
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		for(int j = list.size(); i < j; i++)
	//*   6   10:aload_0         
	//*   7   11:invokeinterface #39  <Method int List.size()>
	//*   8   16:istore_3        
	//*   9   17:iload_2         
	//*  10   18:iload_3         
	//*  11   19:icmpge          58
		{
			ImageHeaderParser.ImageType imagetype = ((ImageHeaderParser)list.get(i)).getType(bytebuffer);
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:invokeinterface #43  <Method Object List.get(int)>
	//   15   29:checkcast       #45  <Class ImageHeaderParser>
	//   16   32:aload_1         
	//   17   33:invokeinterface #72  <Method ImageHeaderParser$ImageType ImageHeaderParser.getType(ByteBuffer)>
	//   18   38:astore          4
			if(imagetype != ImageHeaderParser.ImageType.UNKNOWN)
	//*  19   40:aload           4
	//*  20   42:getstatic       #63  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//*  21   45:if_acmpeq       51
				return imagetype;
	//   22   48:aload           4
	//   23   50:areturn         
		}

	//   24   51:iload_2         
	//   25   52:iconst_1        
	//   26   53:iadd            
	//   27   54:istore_2        
	//*  28   55:goto            17
		return ImageHeaderParser.ImageType.UNKNOWN;
	//   29   58:getstatic       #63  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//   30   61:areturn         
	}

	private static final int MARK_POSITION = 0x500000;
}
