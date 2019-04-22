// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser
{
	public static final class ImageType extends Enum
	{

		public static ImageType valueOf(String s)
		{
			return (ImageType)Enum.valueOf(com/bumptech/glide/load/ImageHeaderParser$ImageType, s);
		//    0    0:ldc1            #2   <Class ImageHeaderParser$ImageType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ImageHeaderParser$ImageType>
		//    4    9:areturn         
		}

		public static ImageType[] values()
		{
			return (ImageType[])((ImageType []) ($VALUES)).clone();
		//    0    0:getstatic       #53  <Field ImageHeaderParser$ImageType[] $VALUES>
		//    1    3:invokevirtual   #73  <Method Object _5B_Lcom.bumptech.glide.load.ImageHeaderParser$ImageType_3B_.clone()>
		//    2    6:checkcast       #69  <Class ImageHeaderParser$ImageType[]>
		//    3    9:areturn         
		}

		public boolean hasAlpha()
		{
			return hasAlpha;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field boolean hasAlpha>
		//    2    4:ireturn         
		}

		private static final ImageType $VALUES[];
		public static final ImageType GIF;
		public static final ImageType JPEG;
		public static final ImageType PNG;
		public static final ImageType PNG_A;
		public static final ImageType RAW;
		public static final ImageType UNKNOWN;
		public static final ImageType WEBP;
		public static final ImageType WEBP_A;
		private final boolean hasAlpha;

		static 
		{
			GIF = new ImageType("GIF", 0, true);
		//    0    0:new             #2   <Class ImageHeaderParser$ImageType>
		//    1    3:dup             
		//    2    4:ldc1            #24  <String "GIF">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #28  <Method void ImageHeaderParser$ImageType(String, int, boolean)>
		//    6   11:putstatic       #30  <Field ImageHeaderParser$ImageType GIF>
			JPEG = new ImageType("JPEG", 1, false);
		//    7   14:new             #2   <Class ImageHeaderParser$ImageType>
		//    8   17:dup             
		//    9   18:ldc1            #31  <String "JPEG">
		//   10   20:iconst_1        
		//   11   21:iconst_0        
		//   12   22:invokespecial   #28  <Method void ImageHeaderParser$ImageType(String, int, boolean)>
		//   13   25:putstatic       #33  <Field ImageHeaderParser$ImageType JPEG>
			RAW = new ImageType("RAW", 2, false);
		//   14   28:new             #2   <Class ImageHeaderParser$ImageType>
		//   15   31:dup             
		//   16   32:ldc1            #34  <String "RAW">
		//   17   34:iconst_2        
		//   18   35:iconst_0        
		//   19   36:invokespecial   #28  <Method void ImageHeaderParser$ImageType(String, int, boolean)>
		//   20   39:putstatic       #36  <Field ImageHeaderParser$ImageType RAW>
			PNG_A = new ImageType("PNG_A", 3, true);
		//   21   42:new             #2   <Class ImageHeaderParser$ImageType>
		//   22   45:dup             
		//   23   46:ldc1            #37  <String "PNG_A">
		//   24   48:iconst_3        
		//   25   49:iconst_1        
		//   26   50:invokespecial   #28  <Method void ImageHeaderParser$ImageType(String, int, boolean)>
		//   27   53:putstatic       #39  <Field ImageHeaderParser$ImageType PNG_A>
			PNG = new ImageType("PNG", 4, false);
		//   28   56:new             #2   <Class ImageHeaderParser$ImageType>
		//   29   59:dup             
		//   30   60:ldc1            #40  <String "PNG">
		//   31   62:iconst_4        
		//   32   63:iconst_0        
		//   33   64:invokespecial   #28  <Method void ImageHeaderParser$ImageType(String, int, boolean)>
		//   34   67:putstatic       #42  <Field ImageHeaderParser$ImageType PNG>
			WEBP_A = new ImageType("WEBP_A", 5, true);
		//   35   70:new             #2   <Class ImageHeaderParser$ImageType>
		//   36   73:dup             
		//   37   74:ldc1            #43  <String "WEBP_A">
		//   38   76:iconst_5        
		//   39   77:iconst_1        
		//   40   78:invokespecial   #28  <Method void ImageHeaderParser$ImageType(String, int, boolean)>
		//   41   81:putstatic       #45  <Field ImageHeaderParser$ImageType WEBP_A>
			WEBP = new ImageType("WEBP", 6, false);
		//   42   84:new             #2   <Class ImageHeaderParser$ImageType>
		//   43   87:dup             
		//   44   88:ldc1            #46  <String "WEBP">
		//   45   90:bipush          6
		//   46   92:iconst_0        
		//   47   93:invokespecial   #28  <Method void ImageHeaderParser$ImageType(String, int, boolean)>
		//   48   96:putstatic       #48  <Field ImageHeaderParser$ImageType WEBP>
			UNKNOWN = new ImageType("UNKNOWN", 7, false);
		//   49   99:new             #2   <Class ImageHeaderParser$ImageType>
		//   50  102:dup             
		//   51  103:ldc1            #49  <String "UNKNOWN">
		//   52  105:bipush          7
		//   53  107:iconst_0        
		//   54  108:invokespecial   #28  <Method void ImageHeaderParser$ImageType(String, int, boolean)>
		//   55  111:putstatic       #51  <Field ImageHeaderParser$ImageType UNKNOWN>
			$VALUES = (new ImageType[] {
				GIF, JPEG, RAW, PNG_A, PNG, WEBP_A, WEBP, UNKNOWN
			});
		//   56  114:bipush          8
		//   57  116:anewarray       ImageType[]
		//   58  119:dup             
		//   59  120:iconst_0        
		//   60  121:getstatic       #30  <Field ImageHeaderParser$ImageType GIF>
		//   61  124:aastore         
		//   62  125:dup             
		//   63  126:iconst_1        
		//   64  127:getstatic       #33  <Field ImageHeaderParser$ImageType JPEG>
		//   65  130:aastore         
		//   66  131:dup             
		//   67  132:iconst_2        
		//   68  133:getstatic       #36  <Field ImageHeaderParser$ImageType RAW>
		//   69  136:aastore         
		//   70  137:dup             
		//   71  138:iconst_3        
		//   72  139:getstatic       #39  <Field ImageHeaderParser$ImageType PNG_A>
		//   73  142:aastore         
		//   74  143:dup             
		//   75  144:iconst_4        
		//   76  145:getstatic       #42  <Field ImageHeaderParser$ImageType PNG>
		//   77  148:aastore         
		//   78  149:dup             
		//   79  150:iconst_5        
		//   80  151:getstatic       #45  <Field ImageHeaderParser$ImageType WEBP_A>
		//   81  154:aastore         
		//   82  155:dup             
		//   83  156:bipush          6
		//   84  158:getstatic       #48  <Field ImageHeaderParser$ImageType WEBP>
		//   85  161:aastore         
		//   86  162:dup             
		//   87  163:bipush          7
		//   88  165:getstatic       #51  <Field ImageHeaderParser$ImageType UNKNOWN>
		//   89  168:aastore         
		//   90  169:putstatic       #53  <Field ImageHeaderParser$ImageType[] $VALUES>
		//*  91  172:return          
		}

		private ImageType(String s, int i, boolean flag)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #57  <Method void Enum(String, int)>
			hasAlpha = flag;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #59  <Field boolean hasAlpha>
		//    7   11:return          
		}
	}


	public abstract int getOrientation(InputStream inputstream, ArrayPool arraypool)
		throws IOException;

	public abstract int getOrientation(ByteBuffer bytebuffer, ArrayPool arraypool)
		throws IOException;

	public abstract ImageType getType(InputStream inputstream)
		throws IOException;

	public abstract ImageType getType(ByteBuffer bytebuffer)
		throws IOException;
}
