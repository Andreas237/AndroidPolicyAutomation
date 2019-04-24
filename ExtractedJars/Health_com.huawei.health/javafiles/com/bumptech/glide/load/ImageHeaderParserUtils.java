// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
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
		Object obj;
		if(inputstream == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		obj = ((Object) (inputstream));
	//    4    6:aload_1         
	//    5    7:astore          4
		if(!inputstream.markSupported())
	//*   6    9:aload_1         
	//*   7   10:invokevirtual   #23  <Method boolean InputStream.markSupported()>
	//*   8   13:ifne            27
			obj = ((Object) (new RecyclableBufferedInputStream(inputstream, arraypool)));
	//    9   16:new             #25  <Class RecyclableBufferedInputStream>
	//   10   19:dup             
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:invokespecial   #28  <Method void RecyclableBufferedInputStream(InputStream, ArrayPool)>
	//   14   25:astore          4
		((InputStream) (obj)).mark(0x500000);
	//   15   27:aload           4
	//   16   29:ldc1            #7   <Int 0x500000>
	//   17   31:invokevirtual   #32  <Method void InputStream.mark(int)>
		list = ((List) (list.iterator()));
	//   18   34:aload_0         
	//   19   35:invokeinterface #38  <Method Iterator List.iterator()>
	//   20   40:astore_0        
_L2:
		if(!((Iterator) (list)).hasNext())
			break; /* Loop/switch isn't completed */
	//   21   41:aload_0         
	//   22   42:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//   23   47:ifeq            101
		inputstream = ((InputStream) ((ImageHeaderParser)((Iterator) (list)).next()));
	//   24   50:aload_0         
	//   25   51:invokeinterface #47  <Method Object Iterator.next()>
	//   26   56:checkcast       #49  <Class ImageHeaderParser>
	//   27   59:astore_1        
		int i = ((ImageHeaderParser) (inputstream)).getOrientation(((InputStream) (obj)), arraypool);
	//   28   60:aload_1         
	//   29   61:aload           4
	//   30   63:aload_2         
	//   31   64:invokeinterface #52  <Method int ImageHeaderParser.getOrientation(InputStream, ArrayPool)>
	//   32   69:istore_3        
		if(i != -1)
	//*  33   70:iload_3         
	//*  34   71:iconst_m1       
	//*  35   72:icmpeq          82
		{
			((InputStream) (obj)).reset();
	//   36   75:aload           4
	//   37   77:invokevirtual   #55  <Method void InputStream.reset()>
			return i;
	//   38   80:iload_3         
	//   39   81:ireturn         
		}
		((InputStream) (obj)).reset();
	//   40   82:aload           4
	//   41   84:invokevirtual   #55  <Method void InputStream.reset()>
		if(true) goto _L2; else goto _L1
	//   42   87:goto            98
		list;
	//   43   90:astore_0        
		((InputStream) (obj)).reset();
	//   44   91:aload           4
	//   45   93:invokevirtual   #55  <Method void InputStream.reset()>
		throw list;
	//   46   96:aload_0         
	//   47   97:athrow          
	//*  48   98:goto            41
_L1:
		return -1;
	//   49  101:iconst_m1       
	//   50  102:ireturn         
	}

	public static ImageHeaderParser.ImageType getType(List list, InputStream inputstream, ArrayPool arraypool)
		throws IOException
	{
		Object obj;
		if(inputstream == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return ImageHeaderParser.ImageType.UNKNOWN;
	//    2    4:getstatic       #67  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//    3    7:areturn         
		obj = ((Object) (inputstream));
	//    4    8:aload_1         
	//    5    9:astore_3        
		if(!inputstream.markSupported())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #23  <Method boolean InputStream.markSupported()>
	//*   8   14:ifne            27
			obj = ((Object) (new RecyclableBufferedInputStream(inputstream, arraypool)));
	//    9   17:new             #25  <Class RecyclableBufferedInputStream>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokespecial   #28  <Method void RecyclableBufferedInputStream(InputStream, ArrayPool)>
	//   14   26:astore_3        
		((InputStream) (obj)).mark(0x500000);
	//   15   27:aload_3         
	//   16   28:ldc1            #7   <Int 0x500000>
	//   17   30:invokevirtual   #32  <Method void InputStream.mark(int)>
		list = ((List) (list.iterator()));
	//   18   33:aload_0         
	//   19   34:invokeinterface #38  <Method Iterator List.iterator()>
	//   20   39:astore_0        
_L2:
		if(!((Iterator) (list)).hasNext())
			break; /* Loop/switch isn't completed */
	//   21   40:aload_0         
	//   22   41:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//   23   46:ifeq            99
		inputstream = ((InputStream) ((ImageHeaderParser)((Iterator) (list)).next()));
	//   24   49:aload_0         
	//   25   50:invokeinterface #47  <Method Object Iterator.next()>
	//   26   55:checkcast       #49  <Class ImageHeaderParser>
	//   27   58:astore_1        
		inputstream = ((InputStream) (((ImageHeaderParser) (inputstream)).getType(((InputStream) (obj)))));
	//   28   59:aload_1         
	//   29   60:aload_3         
	//   30   61:invokeinterface #70  <Method ImageHeaderParser$ImageType ImageHeaderParser.getType(InputStream)>
	//   31   66:astore_1        
		arraypool = ((ArrayPool) (ImageHeaderParser.ImageType.UNKNOWN));
	//   32   67:getstatic       #67  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//   33   70:astore_2        
		if(inputstream != arraypool)
	//*  34   71:aload_1         
	//*  35   72:aload_2         
	//*  36   73:if_acmpeq       82
		{
			((InputStream) (obj)).reset();
	//   37   76:aload_3         
	//   38   77:invokevirtual   #55  <Method void InputStream.reset()>
			return ((ImageHeaderParser.ImageType) (inputstream));
	//   39   80:aload_1         
	//   40   81:areturn         
		}
		((InputStream) (obj)).reset();
	//   41   82:aload_3         
	//   42   83:invokevirtual   #55  <Method void InputStream.reset()>
		if(true) goto _L2; else goto _L1
	//   43   86:goto            96
		list;
	//   44   89:astore_0        
		((InputStream) (obj)).reset();
	//   45   90:aload_3         
	//   46   91:invokevirtual   #55  <Method void InputStream.reset()>
		throw list;
	//   47   94:aload_0         
	//   48   95:athrow          
	//*  49   96:goto            40
_L1:
		return ImageHeaderParser.ImageType.UNKNOWN;
	//   50   99:getstatic       #67  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//   51  102:areturn         
	}

	public static ImageHeaderParser.ImageType getType(List list, ByteBuffer bytebuffer)
		throws IOException
	{
		if(bytebuffer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return ImageHeaderParser.ImageType.UNKNOWN;
	//    2    4:getstatic       #67  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//    3    7:areturn         
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #38  <Method Iterator List.iterator()>
	//*   6   14:astore_0        
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #43  <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            52
		{
			ImageHeaderParser.ImageType imagetype = ((ImageHeaderParser)((Iterator) (list)).next()).getType(bytebuffer);
	//   10   24:aload_0         
	//   11   25:invokeinterface #47  <Method Object Iterator.next()>
	//   12   30:checkcast       #49  <Class ImageHeaderParser>
	//   13   33:aload_1         
	//   14   34:invokeinterface #75  <Method ImageHeaderParser$ImageType ImageHeaderParser.getType(ByteBuffer)>
	//   15   39:astore_2        
			if(imagetype != ImageHeaderParser.ImageType.UNKNOWN)
	//*  16   40:aload_2         
	//*  17   41:getstatic       #67  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//*  18   44:if_acmpeq       49
				return imagetype;
	//   19   47:aload_2         
	//   20   48:areturn         
		}

	//*  21   49:goto            15
		return ImageHeaderParser.ImageType.UNKNOWN;
	//   22   52:getstatic       #67  <Field ImageHeaderParser$ImageType ImageHeaderParser$ImageType.UNKNOWN>
	//   23   55:areturn         
	}

	private static final int MARK_POSITION = 0x500000;
}
