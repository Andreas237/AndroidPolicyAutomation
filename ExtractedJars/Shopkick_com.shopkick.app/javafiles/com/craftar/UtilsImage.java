// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.graphics.*;
import android.util.Pair;
import java.io.*;
import java.util.ArrayList;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.jpeg.exifRewrite.ExifRewriter;

// Referenced classes of package com.craftar:
//			AppEventListener, AppEventForwarder, CLog, NV21, 
//			FileUtil

class UtilsImage
	implements AppEventListener
{
	private static final class Config
	{

		private static final int PICTURE_COMPRESSION_QUALITY = 75;
		private static final int PICTURE_MIN_SIZE = 240;

		private Config()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	private UtilsImage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		exifWriter = new ExifRewriter();
	//    2    4:aload_0         
	//    3    5:new             #57  <Class ExifRewriter>
	//    4    8:dup             
	//    5    9:invokespecial   #58  <Method void ExifRewriter()>
	//    6   12:putfield        #60  <Field ExifRewriter exifWriter>
		libyuv_ellapsed = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #62  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #63  <Method void ArrayList()>
	//   11   23:putfield        #65  <Field ArrayList libyuv_ellapsed>
		AppEventForwarder.addAppEventListener(((AppEventListener) (this)));
	//   12   26:aload_0         
	//   13   27:invokestatic    #71  <Method void AppEventForwarder.addAppEventListener(AppEventListener)>
		isInited = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #73  <Field boolean isInited>
	//   17   35:return          
	}

	static UtilsImage Instance()
	{
		if(self == null)
	//*   0    0:getstatic       #77  <Field UtilsImage self>
	//*   1    3:ifnonnull       16
			self = new UtilsImage();
	//    2    6:new             #2   <Class UtilsImage>
	//    3    9:dup             
	//    4   10:invokespecial   #78  <Method void UtilsImage()>
	//    5   13:putstatic       #77  <Field UtilsImage self>
		return self;
	//    6   16:getstatic       #77  <Field UtilsImage self>
	//    7   19:areturn         
	}

	static void argb2gray(int ai[], byte abyte0[])
	{
		nativeARGB2GRAY(ai, abyte0, ai.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #84  <Method void nativeARGB2GRAY(int[], byte[], int)>
	//    5    7:return          
	}

	private static Pair compInitSize(int k, int l, int i1, int j1)
	{
		int i3 = Math.min(k, l);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #92  <Method int Math.min(int, int)>
	//    3    5:istore          12
		int i2 = 0;
	//    4    7:iconst_0        
	//    5    8:istore          8
		int l1 = -1;
	//    6   10:iconst_m1       
	//    7   11:istore          7
		int j2 = 0xf4240;
	//    8   13:ldc1            #93  <Int 0xf4240>
	//    9   15:istore          9
		for(int k1 = i1; i2 < j1 && k1 < i3;)
	//*  10   17:iload_2         
	//*  11   18:istore          6
	//*  12   20:iload           8
	//*  13   22:iload_3         
	//*  14   23:icmpge          78
	//*  15   26:iload           6
	//*  16   28:iload           12
	//*  17   30:icmpge          78
		{
			int l2 = i3 - k1;
	//   18   33:iload           12
	//   19   35:iload           6
	//   20   37:isub            
	//   21   38:istore          11
			int k2 = j2;
	//   22   40:iload           9
	//   23   42:istore          10
			if(l2 < j2)
	//*  24   44:iload           11
	//*  25   46:iload           9
	//*  26   48:icmpge          59
			{
				l1 = k1;
	//   27   51:iload           6
	//   28   53:istore          7
				k2 = l2;
	//   29   55:iload           11
	//   30   57:istore          10
			}
			k1 *= 2;
	//   31   59:iload           6
	//   32   61:iconst_2        
	//   33   62:imul            
	//   34   63:istore          6
			i2++;
	//   35   65:iload           8
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore          8
			j2 = k2;
	//   39   71:iload           10
	//   40   73:istore          9
		}

	//*  41   75:goto            20
		if(l1 != -1)
	//*  42   78:iload           7
	//*  43   80:iconst_m1       
	//*  44   81:icmpne          87
	//*  45   84:goto            90
			i1 = l1;
	//   46   87:iload           7
	//   47   89:istore_2        
		if(k > l)
	//*  48   90:iload_0         
	//*  49   91:iload_1         
	//*  50   92:icmple          117
		{
			double d = (double)i1 / (double)l;
	//   51   95:iload_2         
	//   52   96:i2d             
	//   53   97:iload_1         
	//   54   98:i2d             
	//   55   99:ddiv            
	//   56  100:dstore          4
			k = (int)Math.floor((double)k * d);
	//   57  102:iload_0         
	//   58  103:i2d             
	//   59  104:dload           4
	//   60  106:dmul            
	//   61  107:invokestatic    #97  <Method double Math.floor(double)>
	//   62  110:d2i             
	//   63  111:istore_0        
			l = i1;
	//   64  112:iload_2         
	//   65  113:istore_1        
		} else
	//*  66  114:goto            136
		{
			double d1 = (double)i1 / (double)k;
	//   67  117:iload_2         
	//   68  118:i2d             
	//   69  119:iload_0         
	//   70  120:i2d             
	//   71  121:ddiv            
	//   72  122:dstore          4
			l = (int)Math.floor((double)l * d1);
	//   73  124:iload_1         
	//   74  125:i2d             
	//   75  126:dload           4
	//   76  128:dmul            
	//   77  129:invokestatic    #97  <Method double Math.floor(double)>
	//   78  132:d2i             
	//   79  133:istore_1        
			k = i1;
	//   80  134:iload_2         
	//   81  135:istore_0        
		}
		return new Pair(((Object) (Integer.valueOf(k))), ((Object) (Integer.valueOf(l))));
	//   82  136:new             #99  <Class Pair>
	//   83  139:dup             
	//   84  140:iload_0         
	//   85  141:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   86  144:iload_1         
	//   87  145:invokestatic    #105 <Method Integer Integer.valueOf(int)>
	//   88  148:invokespecial   #108 <Method void Pair(Object, Object)>
	//   89  151:areturn         
	}

	private native void copyRGBAFrameNativeTo(long l);

	private void init(int k, int l, int i1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #116 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("Init with ");
	//    4    9:aload           4
	//    5   11:ldc1            #119 <String "Init with ">
	//    6   13:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(k);
	//    8   17:aload           4
	//    9   19:iload_1         
	//   10   20:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		stringbuilder.append(", ");
	//   12   24:aload           4
	//   13   26:ldc1            #128 <String ", ">
	//   14   28:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(l);
	//   16   32:aload           4
	//   17   34:iload_2         
	//   18   35:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   19   38:pop             
		stringbuilder.append(",");
	//   20   39:aload           4
	//   21   41:ldc1            #130 <String ",">
	//   22   43:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(i1);
	//   24   47:aload           4
	//   25   49:iload_3         
	//   26   50:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   27   53:pop             
		CLog.d(stringbuilder.toString());
	//   28   54:aload           4
	//   29   56:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   30   59:invokestatic    #139 <Method void CLog.d(String)>
		nativeInit(l, i1);
	//   31   62:aload_0         
	//   32   63:iload_2         
	//   33   64:iload_3         
	//   34   65:invokespecial   #143 <Method void nativeInit(int, int)>
	//   35   68:return          
	}

	public static Bitmap iterativeRescaling(Bitmap bitmap, int k, boolean flag)
	{
		Pair pair = compInitSize(bitmap.getWidth(), bitmap.getHeight(), k, 3);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #151 <Method int Bitmap.getWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #154 <Method int Bitmap.getHeight()>
	//    4    8:iload_1         
	//    5    9:iconst_3        
	//    6   10:invokestatic    #156 <Method Pair compInitSize(int, int, int, int)>
	//    7   13:astore          8
		int l1 = ((Integer)pair.first).intValue();
	//    8   15:aload           8
	//    9   17:getfield        #160 <Field Object Pair.first>
	//   10   20:checkcast       #101 <Class Integer>
	//   11   23:invokevirtual   #163 <Method int Integer.intValue()>
	//   12   26:istore          7
		int k1 = ((Integer)pair.second).intValue();
	//   13   28:aload           8
	//   14   30:getfield        #166 <Field Object Pair.second>
	//   15   33:checkcast       #101 <Class Integer>
	//   16   36:invokevirtual   #163 <Method int Integer.intValue()>
	//   17   39:istore          6
		bitmap = Bitmap.createScaledBitmap(bitmap, l1, k1, true);
	//   18   41:aload_0         
	//   19   42:iload           7
	//   20   44:iload           6
	//   21   46:iconst_1        
	//   22   47:invokestatic    #170 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   23   50:astore_0        
		int i1 = l1 / 2;
	//   24   51:iload           7
	//   25   53:iconst_2        
	//   26   54:idiv            
	//   27   55:istore          4
		int l = k1 / 2;
	//   28   57:iload           6
	//   29   59:iconst_2        
	//   30   60:idiv            
	//   31   61:istore_3        
		while(l1 > k && k1 > k) 
	//*  32   62:iload           7
	//*  33   64:iload_1         
	//*  34   65:icmple          111
	//*  35   68:iload           6
	//*  36   70:iload_1         
	//*  37   71:icmple          111
		{
			bitmap = Bitmap.createScaledBitmap(bitmap, i1, l, flag);
	//   38   74:aload_0         
	//   39   75:iload           4
	//   40   77:iload_3         
	//   41   78:iload_2         
	//   42   79:invokestatic    #170 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   43   82:astore_0        
			int j1 = i1 / 2;
	//   44   83:iload           4
	//   45   85:iconst_2        
	//   46   86:idiv            
	//   47   87:istore          5
			l1 = l / 2;
	//   48   89:iload_3         
	//   49   90:iconst_2        
	//   50   91:idiv            
	//   51   92:istore          7
			k1 = l;
	//   52   94:iload_3         
	//   53   95:istore          6
			l = l1;
	//   54   97:iload           7
	//   55   99:istore_3        
			l1 = i1;
	//   56  100:iload           4
	//   57  102:istore          7
			i1 = j1;
	//   58  104:iload           5
	//   59  106:istore          4
		}
	//*  60  108:goto            62
		return bitmap;
	//   61  111:aload_0         
	//   62  112:areturn         
	}

	static native void nativeARGB2GRAY(int ai[], byte abyte0[], int k);

	private native void nativeInit(int k, int l);

	static native void nativeYUV420SPtoRGBA(byte abyte0[], byte abyte1[]);

	static native void nativeYUV420SPtoRGBAUnity(byte abyte0[]);

	static native void nativeYUV420SPtoRGBAint(byte abyte0[], int ai[]);

	private int resolveSampleSize(int k, int l)
	{
		int i1 = Math.min(k, l);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #92  <Method int Math.min(int, int)>
	//    3    5:istore_3        
		k = 0;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		do
		{
			l = k + 2;
	//    6    8:iload_1         
	//    7    9:iconst_2        
	//    8   10:iadd            
	//    9   11:istore_2        
			k = l;
	//   10   12:iload_2         
	//   11   13:istore_1        
		} while(i1 / (l + 2) > 240);
	//   12   14:iload_3         
	//   13   15:iload_2         
	//   14   16:iconst_2        
	//   15   17:iadd            
	//   16   18:idiv            
	//   17   19:sipush          240
	//   18   22:icmpgt          8
		return l;
	//   19   25:iload_2         
	//   20   26:ireturn         
	}

	int[] convert(byte abyte0[])
	{
		int ai[] = new int[abyte0.length / 4];
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:iconst_4        
	//    3    3:idiv            
	//    4    4:newarray        int[]
	//    5    6:astore          4
		int k = 0;
	//    6    8:iconst_0        
	//    7    9:istore_2        
		int l = 0;
	//    8   10:iconst_0        
	//    9   11:istore_3        
		for(; k < ai.length; k++)
	//*  10   12:iload_2         
	//*  11   13:aload           4
	//*  12   15:arraylength     
	//*  13   16:icmpge          82
		{
			ai[k] = abyte0[l + 3] & 0xff | (abyte0[l + 2] & 0xff) << 8 | (abyte0[l + 1] & 0xff) << 16 | (abyte0[l + 0] & 0xff) << 24;
	//   14   19:aload           4
	//   15   21:iload_2         
	//   16   22:aload_1         
	//   17   23:iload_3         
	//   18   24:iconst_3        
	//   19   25:iadd            
	//   20   26:baload          
	//   21   27:sipush          255
	//   22   30:iand            
	//   23   31:aload_1         
	//   24   32:iload_3         
	//   25   33:iconst_2        
	//   26   34:iadd            
	//   27   35:baload          
	//   28   36:sipush          255
	//   29   39:iand            
	//   30   40:bipush          8
	//   31   42:ishl            
	//   32   43:ior             
	//   33   44:aload_1         
	//   34   45:iload_3         
	//   35   46:iconst_1        
	//   36   47:iadd            
	//   37   48:baload          
	//   38   49:sipush          255
	//   39   52:iand            
	//   40   53:bipush          16
	//   41   55:ishl            
	//   42   56:ior             
	//   43   57:aload_1         
	//   44   58:iload_3         
	//   45   59:iconst_0        
	//   46   60:iadd            
	//   47   61:baload          
	//   48   62:sipush          255
	//   49   65:iand            
	//   50   66:bipush          24
	//   51   68:ishl            
	//   52   69:ior             
	//   53   70:iastore         
			l += 4;
	//   54   71:iload_3         
	//   55   72:iconst_4        
	//   56   73:iadd            
	//   57   74:istore_3        
		}

	//   58   75:iload_2         
	//   59   76:iconst_1        
	//   60   77:iadd            
	//   61   78:istore_2        
	//*  62   79:goto            12
		return ai;
	//   63   82:aload           4
	//   64   84:areturn         
	}

	int[] convert3(byte abyte0[])
	{
		int ai[] = new int[abyte0.length / 3];
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:iconst_3        
	//    3    3:idiv            
	//    4    4:newarray        int[]
	//    5    6:astore          4
		int k = 0;
	//    6    8:iconst_0        
	//    7    9:istore_2        
		int l = 0;
	//    8   10:iconst_0        
	//    9   11:istore_3        
		for(; k < ai.length; k++)
	//*  10   12:iload_2         
	//*  11   13:aload           4
	//*  12   15:arraylength     
	//*  13   16:icmpge          69
		{
			ai[k] = abyte0[l + 2] & 0xff | (abyte0[l + 1] & 0xff) << 8 | (abyte0[l + 0] & 0xff) << 16;
	//   14   19:aload           4
	//   15   21:iload_2         
	//   16   22:aload_1         
	//   17   23:iload_3         
	//   18   24:iconst_2        
	//   19   25:iadd            
	//   20   26:baload          
	//   21   27:sipush          255
	//   22   30:iand            
	//   23   31:aload_1         
	//   24   32:iload_3         
	//   25   33:iconst_1        
	//   26   34:iadd            
	//   27   35:baload          
	//   28   36:sipush          255
	//   29   39:iand            
	//   30   40:bipush          8
	//   31   42:ishl            
	//   32   43:ior             
	//   33   44:aload_1         
	//   34   45:iload_3         
	//   35   46:iconst_0        
	//   36   47:iadd            
	//   37   48:baload          
	//   38   49:sipush          255
	//   39   52:iand            
	//   40   53:bipush          16
	//   41   55:ishl            
	//   42   56:ior             
	//   43   57:iastore         
			l += 3;
	//   44   58:iload_3         
	//   45   59:iconst_3        
	//   46   60:iadd            
	//   47   61:istore_3        
		}

	//   48   62:iload_2         
	//   49   63:iconst_1        
	//   50   64:iadd            
	//   51   65:istore_2        
	//*  52   66:goto            12
		return ai;
	//   53   69:aload           4
	//   54   71:areturn         
	}

	void copyRGBAFrameTo(long l)
	{
		copyRGBAFrameNativeTo(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #183 <Method void copyRGBAFrameNativeTo(long)>
	//    3    5:return          
	}

	void decodeYUV420SPtoRGBA(byte abyte0[], int k, int l, int ai[])
	{
		if(!isContextSet())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #189 <Method boolean isContextSet()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!isInited)
	//*   4    8:aload_0         
	//*   5    9:getfield        #73  <Field boolean isInited>
	//*   6   12:ifne            28
		{
			init(abyte0.length, k, l);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:arraylength     
	//   10   18:iload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #191 <Method void init(int, int, int)>
			isInited = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #73  <Field boolean isInited>
		}
		nativeYUV420SPtoRGBAint(abyte0, ai);
	//   16   28:aload_1         
	//   17   29:aload           4
	//   18   31:invokestatic    #193 <Method void nativeYUV420SPtoRGBAint(byte[], int[])>
	//   19   34:return          
	}

	boolean decodeYUV420SPtoRGBA(byte abyte0[], int k, int l, byte abyte1[])
	{
		if(!isContextSet())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #189 <Method boolean isContextSet()>
	//*   2    4:ifne            14
		{
			CLog.e("Context NOT set, NOT CONVERTING FRAME!");
	//    3    7:ldc1            #196 <String "Context NOT set, NOT CONVERTING FRAME!">
	//    4    9:invokestatic    #199 <Method void CLog.e(String)>
			return false;
	//    5   12:iconst_0        
	//    6   13:ireturn         
		}
		if(isInited)
			break MISSING_BLOCK_LABEL_34;
	//    7   14:aload_0         
	//    8   15:getfield        #73  <Field boolean isInited>
	//    9   18:ifne            34
		init(abyte0.length, k, l);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:arraylength     
	//   13   24:iload_2         
	//   14   25:iload_3         
	//   15   26:invokespecial   #191 <Method void init(int, int, int)>
		isInited = true;
	//   16   29:aload_0         
	//   17   30:iconst_1        
	//   18   31:putfield        #73  <Field boolean isInited>
		this;
	//   19   34:aload_0         
		JVM INSTR monitorenter ;
	//   20   35:monitorenter    
		decodeYUV420SPtoRGBAbyte(abyte0, k, l, abyte1);
	//   21   36:aload_0         
	//   22   37:aload_1         
	//   23   38:iload_2         
	//   24   39:iload_3         
	//   25   40:aload           4
	//   26   42:invokevirtual   #203 <Method void decodeYUV420SPtoRGBAbyte(byte[], int, int, byte[])>
		this;
	//   27   45:aload_0         
		JVM INSTR monitorexit ;
	//   28   46:monitorexit     
		lastRGBAbuffer = abyte1;
	//   29   47:aload_0         
	//   30   48:aload           4
	//   31   50:putfield        #205 <Field byte[] lastRGBAbuffer>
		return true;
	//   32   53:iconst_1        
	//   33   54:ireturn         
		abyte0;
	//   34   55:astore_1        
		this;
	//   35   56:aload_0         
		JVM INSTR monitorexit ;
	//   36   57:monitorexit     
		throw abyte0;
	//   37   58:aload_1         
	//   38   59:athrow          
	}

	boolean decodeYUV420SPtoRGBAUnity(byte abyte0[], int k, int l)
	{
		if(!isContextSet())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #189 <Method boolean isContextSet()>
	//*   2    4:ifne            14
		{
			CLog.e("Context NOT set, NOT CONVERTING FRAME!");
	//    3    7:ldc1            #196 <String "Context NOT set, NOT CONVERTING FRAME!">
	//    4    9:invokestatic    #199 <Method void CLog.e(String)>
			return false;
	//    5   12:iconst_0        
	//    6   13:ireturn         
		}
		if(isInited)
			break MISSING_BLOCK_LABEL_34;
	//    7   14:aload_0         
	//    8   15:getfield        #73  <Field boolean isInited>
	//    9   18:ifne            34
		init(abyte0.length, k, l);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:arraylength     
	//   13   24:iload_2         
	//   14   25:iload_3         
	//   15   26:invokespecial   #191 <Method void init(int, int, int)>
		isInited = true;
	//   16   29:aload_0         
	//   17   30:iconst_1        
	//   18   31:putfield        #73  <Field boolean isInited>
		this;
	//   19   34:aload_0         
		JVM INSTR monitorenter ;
	//   20   35:monitorenter    
		decodeYUV420SPtoRGBAbyteUnity(abyte0, k, l);
	//   21   36:aload_0         
	//   22   37:aload_1         
	//   23   38:iload_2         
	//   24   39:iload_3         
	//   25   40:invokevirtual   #211 <Method void decodeYUV420SPtoRGBAbyteUnity(byte[], int, int)>
		this;
	//   26   43:aload_0         
		JVM INSTR monitorexit ;
	//   27   44:monitorexit     
		return true;
	//   28   45:iconst_1        
	//   29   46:ireturn         
		abyte0;
	//   30   47:astore_1        
		this;
	//   31   48:aload_0         
		JVM INSTR monitorexit ;
	//   32   49:monitorexit     
		throw abyte0;
	//   33   50:aload_1         
	//   34   51:athrow          
	}

	void decodeYUV420SPtoRGBAbyte(byte abyte0[], int k, int l, byte abyte1[])
	{
		if(!isContextSet())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #189 <Method boolean isContextSet()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!isInited)
	//*   4    8:aload_0         
	//*   5    9:getfield        #73  <Field boolean isInited>
	//*   6   12:ifne            28
		{
			init(abyte0.length, k, l);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:arraylength     
	//   10   18:iload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #191 <Method void init(int, int, int)>
			isInited = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #73  <Field boolean isInited>
		}
		nativeYUV420SPtoRGBA(abyte0, abyte1);
	//   16   28:aload_1         
	//   17   29:aload           4
	//   18   31:invokestatic    #213 <Method void nativeYUV420SPtoRGBA(byte[], byte[])>
	//   19   34:return          
	}

	void decodeYUV420SPtoRGBAbyteUnity(byte abyte0[], int k, int l)
	{
		if(!isContextSet())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #189 <Method boolean isContextSet()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!isInited)
	//*   4    8:aload_0         
	//*   5    9:getfield        #73  <Field boolean isInited>
	//*   6   12:ifne            28
		{
			init(abyte0.length, k, l);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:arraylength     
	//   10   18:iload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #191 <Method void init(int, int, int)>
			isInited = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #73  <Field boolean isInited>
		}
		nativeYUV420SPtoRGBAUnity(abyte0);
	//   16   28:aload_1         
	//   17   29:invokestatic    #215 <Method void nativeYUV420SPtoRGBAUnity(byte[])>
	//   18   32:return          
	}

	boolean isContextSet()
	{
		return mContext != null;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field Context mContext>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void onAppFinish()
	{
		AppEventForwarder.removeAppEventListener(((AppEventListener) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #224 <Method void AppEventForwarder.removeAppEventListener(AppEventListener)>
		this;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		isInited = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #73  <Field boolean isInited>
		mContext = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #217 <Field Context mContext>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		Exception exception;
		exception;
	//   13   19:astore_1        
		this;
	//   14   20:aload_0         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw exception;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public void onAppPause()
	{
	//    0    0:return          
	}

	public void onAppResume()
	{
	//    0    0:return          
	}

	ByteArrayOutputStream processPicture(Bitmap bitmap)
	{
		ByteArrayOutputStream bytearrayoutputstream;
		bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #235 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #236 <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		iterativeRescaling(bitmap, 240, true).compress(android.graphics.Bitmap.CompressFormat.JPEG, 75, ((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_1         
	//    5    9:sipush          240
	//    6   12:iconst_1        
	//    7   13:invokestatic    #238 <Method Bitmap iterativeRescaling(Bitmap, int, boolean)>
	//    8   16:getstatic       #244 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//    9   19:bipush          75
	//   10   21:aload_2         
	//   11   22:invokevirtual   #248 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   12   25:pop             
		bytearrayoutputstream.close();
	//   13   26:aload_2         
	//   14   27:invokevirtual   #251 <Method void ByteArrayOutputStream.close()>
		return bytearrayoutputstream;
	//   15   30:aload_2         
	//   16   31:areturn         
		bitmap;
	//   17   32:astore_1        
		((Exception) (bitmap)).printStackTrace();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #254 <Method void Exception.printStackTrace()>
		break MISSING_BLOCK_LABEL_45;
	//   20   37:goto            45
		bitmap;
	//   21   40:astore_1        
		((IOException) (bitmap)).printStackTrace();
	//   22   41:aload_1         
	//   23   42:invokevirtual   #255 <Method void IOException.printStackTrace()>
		return null;
	//   24   45:aconst_null     
	//   25   46:areturn         
	}

	ByteArrayOutputStream processPicture(NV21 nv21)
	{
		try
		{
			int k = nv21.width;
	//    0    0:aload_1         
	//    1    1:getfield        #261 <Field int NV21.width>
	//    2    4:istore_2        
			int l = nv21.height;
	//    3    5:aload_1         
	//    4    6:getfield        #264 <Field int NV21.height>
	//    5    9:istore_3        
			if(mFrameARGB == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #266 <Field int[] mFrameARGB>
	//*   8   14:ifnonnull       26
				mFrameARGB = new int[k * l];
	//    9   17:aload_0         
	//   10   18:iload_2         
	//   11   19:iload_3         
	//   12   20:imul            
	//   13   21:newarray        int[]
	//   14   23:putfield        #266 <Field int[] mFrameARGB>
			decodeYUV420SPtoRGBA(nv21.data, k, l, mFrameARGB);
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:getfield        #269 <Field byte[] NV21.data>
	//   18   31:iload_2         
	//   19   32:iload_3         
	//   20   33:aload_0         
	//   21   34:getfield        #266 <Field int[] mFrameARGB>
	//   22   37:invokevirtual   #271 <Method void decodeYUV420SPtoRGBA(byte[], int, int, int[])>
			nv21 = ((NV21) (processPicture(Bitmap.createBitmap(mFrameARGB, k, l, android.graphics.Bitmap.Config.ARGB_8888))));
	//   23   40:aload_0         
	//   24   41:aload_0         
	//   25   42:getfield        #266 <Field int[] mFrameARGB>
	//   26   45:iload_2         
	//   27   46:iload_3         
	//   28   47:getstatic       #277 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   29   50:invokestatic    #281 <Method Bitmap Bitmap.createBitmap(int[], int, int, android.graphics.Bitmap$Config)>
	//   30   53:invokevirtual   #283 <Method ByteArrayOutputStream processPicture(Bitmap)>
	//   31   56:astore_1        
		}
	//*  32   57:aload_1         
	//*  33   58:areturn         
	//*  34   59:aconst_null     
	//*  35   60:areturn         
		// Misplaced declaration of an exception variable
		catch(NV21 nv21)
		{
			return null;
		}
		return ((ByteArrayOutputStream) (nv21));
	//*  36   61:astore_1        
	//*  37   62:goto            59
	}

	ByteArrayOutputStream processPicture(String s)
	{
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//    0    0:new             #286 <Class android.graphics.BitmapFactory$Options>
	//    1    3:dup             
	//    2    4:invokespecial   #287 <Method void android.graphics.BitmapFactory$Options()>
	//    3    7:astore_3        
		options.inJustDecodeBounds = true;
	//    4    8:aload_3         
	//    5    9:iconst_1        
	//    6   10:putfield        #290 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		BitmapFactory.decodeFile(s, options);
	//    7   13:aload_1         
	//    8   14:aload_3         
	//    9   15:invokestatic    #296 <Method Bitmap BitmapFactory.decodeFile(String, android.graphics.BitmapFactory$Options)>
	//   10   18:pop             
		int k = resolveSampleSize(options.outWidth, options.outHeight);
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:getfield        #299 <Field int android.graphics.BitmapFactory$Options.outWidth>
	//   14   24:aload_3         
	//   15   25:getfield        #302 <Field int android.graphics.BitmapFactory$Options.outHeight>
	//   16   28:invokespecial   #304 <Method int resolveSampleSize(int, int)>
	//   17   31:istore_2        
		options.inJustDecodeBounds = false;
	//   18   32:aload_3         
	//   19   33:iconst_0        
	//   20   34:putfield        #290 <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		options.inSampleSize = k;
	//   21   37:aload_3         
	//   22   38:iload_2         
	//   23   39:putfield        #307 <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		return processPicture(BitmapFactory.decodeFile(s, options));
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:aload_3         
	//   27   45:invokestatic    #296 <Method Bitmap BitmapFactory.decodeFile(String, android.graphics.BitmapFactory$Options)>
	//   28   48:invokevirtual   #283 <Method ByteArrayOutputStream processPicture(Bitmap)>
	//   29   51:areturn         
	}

	ByteArrayOutputStream removeEXIFfromJpegByteArray(byte abyte0[])
	{
		os = new ByteArrayOutputStream();
	//    0    0:aload_0         
	//    1    1:new             #235 <Class ByteArrayOutputStream>
	//    2    4:dup             
	//    3    5:invokespecial   #236 <Method void ByteArrayOutputStream()>
	//    4    8:putfield        #315 <Field ByteArrayOutputStream os>
		exifWriter.removeExifMetadata(abyte0, ((java.io.OutputStream) (os)));
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field ExifRewriter exifWriter>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #315 <Field ByteArrayOutputStream os>
	//   10   20:invokevirtual   #319 <Method void ExifRewriter.removeExifMetadata(byte[], java.io.OutputStream)>
		abyte0 = ((byte []) (os));
	//   11   23:aload_0         
	//   12   24:getfield        #315 <Field ByteArrayOutputStream os>
	//   13   27:astore_1        
		return ((ByteArrayOutputStream) (abyte0));
	//   14   28:aload_1         
	//   15   29:areturn         
		abyte0;
	//   16   30:astore_1        
		((IOException) (abyte0)).printStackTrace();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #255 <Method void IOException.printStackTrace()>
		break MISSING_BLOCK_LABEL_51;
	//   19   35:goto            51
		abyte0;
	//   20   38:astore_1        
		((ImageWriteException) (abyte0)).printStackTrace();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #320 <Method void ImageWriteException.printStackTrace()>
		break MISSING_BLOCK_LABEL_51;
	//   23   43:goto            51
		abyte0;
	//   24   46:astore_1        
		((ImageReadException) (abyte0)).printStackTrace();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #321 <Method void ImageReadException.printStackTrace()>
		return null;
	//   27   51:aconst_null     
	//   28   52:areturn         
	}

	void saveRawGrayToPGM(byte abyte0[], int k, int l, String s)
		throws FileNotFoundException, IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #116 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #117 <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("P5\n");
	//    4    9:aload           5
	//    5   11:ldc2            #327 <String "P5\n">
	//    6   14:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(k);
	//    8   18:aload           5
	//    9   20:iload_2         
	//   10   21:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   11   24:pop             
		stringbuilder.append(" ");
	//   12   25:aload           5
	//   13   27:ldc2            #329 <String " ">
	//   14   30:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
		stringbuilder.append(l);
	//   16   34:aload           5
	//   17   36:iload_3         
	//   18   37:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   19   40:pop             
		stringbuilder.append("\n255\n");
	//   20   41:aload           5
	//   21   43:ldc2            #331 <String "\n255\n">
	//   22   46:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
		byte abyte1[] = stringbuilder.toString().getBytes();
	//   24   50:aload           5
	//   25   52:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   26   55:invokevirtual   #337 <Method byte[] String.getBytes()>
	//   27   58:astore          5
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(abyte1.length + abyte0.length);
	//   28   60:new             #235 <Class ByteArrayOutputStream>
	//   29   63:dup             
	//   30   64:aload           5
	//   31   66:arraylength     
	//   32   67:aload_1         
	//   33   68:arraylength     
	//   34   69:iadd            
	//   35   70:invokespecial   #340 <Method void ByteArrayOutputStream(int)>
	//   36   73:astore          6
		bytearrayoutputstream.write(abyte1);
	//   37   75:aload           6
	//   38   77:aload           5
	//   39   79:invokevirtual   #343 <Method void ByteArrayOutputStream.write(byte[])>
		bytearrayoutputstream.write(abyte0);
	//   40   82:aload           6
	//   41   84:aload_1         
	//   42   85:invokevirtual   #343 <Method void ByteArrayOutputStream.write(byte[])>
		FileUtil.writeToFile(bytearrayoutputstream.toByteArray(), s);
	//   43   88:aload           6
	//   44   90:invokevirtual   #346 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   45   93:aload           4
	//   46   95:invokestatic    #352 <Method void FileUtil.writeToFile(byte[], String)>
	//   47   98:return          
	}

	void setContext(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mContext = context;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #217 <Field Context mContext>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		context;
	//    8   10:astore_1        
		this;
	//    9   11:aload_0         
		JVM INSTR monitorexit ;
	//   10   12:monitorexit     
		throw context;
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	Bitmap toGrayscale(Bitmap bitmap)
	{
		int k = bitmap.getHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #154 <Method int Bitmap.getHeight()>
	//    2    4:istore_2        
		Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), k, android.graphics.Bitmap.Config.RGB_565);
	//    3    5:aload_1         
	//    4    6:invokevirtual   #151 <Method int Bitmap.getWidth()>
	//    5    9:iload_2         
	//    6   10:getstatic       #360 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//    7   13:invokestatic    #363 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//    8   16:astore_3        
		Canvas canvas = new Canvas(bitmap1);
	//    9   17:new             #365 <Class Canvas>
	//   10   20:dup             
	//   11   21:aload_3         
	//   12   22:invokespecial   #368 <Method void Canvas(Bitmap)>
	//   13   25:astore          4
		Paint paint = new Paint();
	//   14   27:new             #370 <Class Paint>
	//   15   30:dup             
	//   16   31:invokespecial   #371 <Method void Paint()>
	//   17   34:astore          5
		ColorMatrix colormatrix = new ColorMatrix();
	//   18   36:new             #373 <Class ColorMatrix>
	//   19   39:dup             
	//   20   40:invokespecial   #374 <Method void ColorMatrix()>
	//   21   43:astore          6
		colormatrix.setSaturation(0.0F);
	//   22   45:aload           6
	//   23   47:fconst_0        
	//   24   48:invokevirtual   #378 <Method void ColorMatrix.setSaturation(float)>
		paint.setColorFilter(((android.graphics.ColorFilter) (new ColorMatrixColorFilter(colormatrix))));
	//   25   51:aload           5
	//   26   53:new             #380 <Class ColorMatrixColorFilter>
	//   27   56:dup             
	//   28   57:aload           6
	//   29   59:invokespecial   #383 <Method void ColorMatrixColorFilter(ColorMatrix)>
	//   30   62:invokevirtual   #387 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   31   65:pop             
		canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
	//   32   66:aload           4
	//   33   68:aload_1         
	//   34   69:fconst_0        
	//   35   70:fconst_0        
	//   36   71:aload           5
	//   37   73:invokevirtual   #391 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
		return bitmap1;
	//   38   76:aload_3         
	//   39   77:areturn         
	}

	static UtilsImage self;
	int b;
	ExifRewriter exifWriter;
	int frameSize;
	int g;
	int i;
	boolean isInited;
	int j;
	byte lastRGBAbuffer[];
	private ArrayList libyuv_ellapsed;
	Context mContext;
	int mFrameARGB[];
	int mHeight;
	int mWidth;
	ByteArrayOutputStream os;
	int r;
	int u;
	int uvp;
	int v;
	int y;
	int y1192;
	int yp;

	static 
	{
		System.loadLibrary("imageutils");
	//    0    0:ldc1            #45  <String "imageutils">
	//    1    2:invokestatic    #51  <Method void System.loadLibrary(String)>
	//*   2    5:return          
	}
}
