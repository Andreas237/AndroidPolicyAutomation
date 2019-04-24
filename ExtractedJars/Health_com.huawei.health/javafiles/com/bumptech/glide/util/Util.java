// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.*;

public final class Util
{

	private Util()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static void assertBackgroundThread()
	{
		if(!isOnBackgroundThread())
	//*   0    0:invokestatic    #37  <Method boolean isOnBackgroundThread()>
	//*   1    3:ifne            16
			throw new IllegalArgumentException("You must call this method on a background thread");
	//    2    6:new             #39  <Class IllegalArgumentException>
	//    3    9:dup             
	//    4   10:ldc1            #41  <String "You must call this method on a background thread">
	//    5   12:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//    6   15:athrow          
		else
			return;
	//    7   16:return          
	}

	public static void assertMainThread()
	{
		if(!isOnMainThread())
	//*   0    0:invokestatic    #48  <Method boolean isOnMainThread()>
	//*   1    3:ifne            16
			throw new IllegalArgumentException("You must call this method on the main thread");
	//    2    6:new             #39  <Class IllegalArgumentException>
	//    3    9:dup             
	//    4   10:ldc1            #50  <String "You must call this method on the main thread">
	//    5   12:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//    6   15:athrow          
		else
			return;
	//    7   16:return          
	}

	public static boolean bothNullOrEqual(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return obj1 == null;
	//    2    4:aload_1         
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
		else
			return obj.equals(obj1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #56  <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	private static String bytesToHex(byte abyte0[], char ac[])
	{
		for(int i = 0; i < abyte0.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpge          50
		{
			int j = abyte0[i] & 0xff;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:baload          
	//    9   11:sipush          255
	//   10   14:iand            
	//   11   15:istore_3        
			ac[i * 2] = HEX_CHAR_ARRAY[j >>> 4];
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:iconst_2        
	//   15   19:imul            
	//   16   20:getstatic       #26  <Field char[] HEX_CHAR_ARRAY>
	//   17   23:iload_3         
	//   18   24:iconst_4        
	//   19   25:iushr           
	//   20   26:caload          
	//   21   27:castore         
			ac[i * 2 + 1] = HEX_CHAR_ARRAY[j & 0xf];
	//   22   28:aload_1         
	//   23   29:iload_2         
	//   24   30:iconst_2        
	//   25   31:imul            
	//   26   32:iconst_1        
	//   27   33:iadd            
	//   28   34:getstatic       #26  <Field char[] HEX_CHAR_ARRAY>
	//   29   37:iload_3         
	//   30   38:bipush          15
	//   31   40:iand            
	//   32   41:caload          
	//   33   42:castore         
		}

	//   34   43:iload_2         
	//   35   44:iconst_1        
	//   36   45:iadd            
	//   37   46:istore_2        
	//*  38   47:goto            2
		return new String(ac);
	//   39   50:new             #20  <Class String>
	//   40   53:dup             
	//   41   54:aload_1         
	//   42   55:invokespecial   #61  <Method void String(char[])>
	//   43   58:areturn         
	}

	public static Queue createQueue(int i)
	{
		return ((Queue) (new ArrayDeque(i)));
	//    0    0:new             #65  <Class ArrayDeque>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #68  <Method void ArrayDeque(int)>
	//    4    8:areturn         
	}

	public static int getBitmapByteSize(int i, int j, android.graphics.Bitmap.Config config)
	{
		return i * j * getBytesPerPixel(config);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:imul            
	//    3    3:aload_2         
	//    4    4:invokestatic    #76  <Method int getBytesPerPixel(android.graphics.Bitmap$Config)>
	//    5    7:imul            
	//    6    8:ireturn         
	}

	public static int getBitmapByteSize(Bitmap bitmap)
	{
		if(bitmap.isRecycled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #87  <Method boolean Bitmap.isRecycled()>
	//*   2    4:ifeq            70
			throw new IllegalStateException((new StringBuilder()).append("Cannot obtain size for recycled Bitmap: ").append(((Object) (bitmap))).append("[").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).append("] ").append(((Object) (bitmap.getConfig()))).toString());
	//    3    7:new             #89  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #91  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #92  <Method void StringBuilder()>
	//    8   18:ldc1            #94  <String "Cannot obtain size for recycled Bitmap: ">
	//    9   20:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   12   27:ldc1            #103 <String "[">
	//   13   29:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #107 <Method int Bitmap.getWidth()>
	//   16   36:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:ldc1            #112 <String "x">
	//   18   41:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   19   44:aload_0         
	//   20   45:invokevirtual   #115 <Method int Bitmap.getHeight()>
	//   21   48:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
	//   22   51:ldc1            #117 <String "] ">
	//   23   53:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   24   56:aload_0         
	//   25   57:invokevirtual   #121 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   26   60:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   27   63:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   28   66:invokespecial   #126 <Method void IllegalStateException(String)>
	//   29   69:athrow          
		if(android.os.Build.VERSION.SDK_INT < 19)
			break MISSING_BLOCK_LABEL_86;
	//   30   70:getstatic       #131 <Field int android.os.Build$VERSION.SDK_INT>
	//   31   73:bipush          19
	//   32   75:icmplt          86
		int i = bitmap.getAllocationByteCount();
	//   33   78:aload_0         
	//   34   79:invokevirtual   #134 <Method int Bitmap.getAllocationByteCount()>
	//   35   82:istore_1        
		return i;
	//   36   83:iload_1         
	//   37   84:ireturn         
		NullPointerException nullpointerexception;
		nullpointerexception;
	//   38   85:astore_2        
		return bitmap.getHeight() * bitmap.getRowBytes();
	//   39   86:aload_0         
	//   40   87:invokevirtual   #115 <Method int Bitmap.getHeight()>
	//   41   90:aload_0         
	//   42   91:invokevirtual   #137 <Method int Bitmap.getRowBytes()>
	//   43   94:imul            
	//   44   95:ireturn         
	}

	private static int getBytesPerPixel(android.graphics.Bitmap.Config config)
	{
		android.graphics.Bitmap.Config config1 = config;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(config == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       10
			config1 = android.graphics.Bitmap.Config.ARGB_8888;
	//    4    6:getstatic       #144 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    5    9:astore_1        
		static class _cls1
		{

			static final int $SwitchMap$android$graphics$Bitmap$Config[];

			static 
			{
				$SwitchMap$android$graphics$Bitmap$Config = new int[android.graphics.Bitmap.Config.values().length];
			//    0    0:invokestatic    #18  <Method android.graphics.Bitmap$Config[] android.graphics.Bitmap$Config.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//    5   12:getstatic       #24  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ALPHA_8>
			//    6   15:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
			//   11   24:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//   12   27:getstatic       #31  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
			//   13   30:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
			//   18   39:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//   19   42:getstatic       #34  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
			//   20   45:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//   21   48:iconst_3        
			//   22   49:iastore         
				}
			//*  23   50:goto            54
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   53:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 4;
			//   25   54:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
			//   26   57:getstatic       #37  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
			//   27   60:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
			//   28   63:iconst_4        
			//   29   64:iastore         
			//   30   65:return          
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1..SwitchMap.android.graphics.Bitmap.Config[config1.ordinal()])
	//*   6   10:getstatic       #148 <Field int[] Util$1.$SwitchMap$android$graphics$Bitmap$Config>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #151 <Method int android.graphics.Bitmap$Config.ordinal()>
	//*   9   17:iaload          
		{
	//*  10   18:tableswitch     1 4: default 48
	//	               1 51
	//	               2 53
	//	               3 53
	//	               4 55
	//*  11   48:goto            55
		case 1: // '\001'
			return 1;
	//   12   51:iconst_1        
	//   13   52:ireturn         

		case 2: // '\002'
		case 3: // '\003'
			return 2;
	//   14   53:iconst_2        
	//   15   54:ireturn         
		}
		return 4;
	//   16   55:iconst_4        
	//   17   56:ireturn         
	}

	public static int getSize(Bitmap bitmap)
	{
		return getBitmapByteSize(bitmap);
	//    0    0:aload_0         
	//    1    1:invokestatic    #155 <Method int getBitmapByteSize(Bitmap)>
	//    2    4:ireturn         
	}

	public static List getSnapshot(Collection collection)
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #160 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #165 <Method int Collection.size()>
	//    4   10:invokespecial   #166 <Method void ArrayList(int)>
	//    5   13:astore_1        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((List) (arraylist)).add(((Iterator) (collection)).next()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #170 <Method Iterator Collection.iterator()>
	//    8   20:astore_0        
	//    9   21:aload_0         
	//   10   22:invokeinterface #175 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            46
	//   12   30:aload_1         
	//   13   31:aload_0         
	//   14   32:invokeinterface #179 <Method Object Iterator.next()>
	//   15   37:invokeinterface #184 <Method boolean List.add(Object)>
	//   16   42:pop             
	//*  17   43:goto            21
		return ((List) (arraylist));
	//   18   46:aload_1         
	//   19   47:areturn         
	}

	public static int hashCode(float f)
	{
		return hashCode(f, 17);
	//    0    0:fload_0         
	//    1    1:bipush          17
	//    2    3:invokestatic    #190 <Method int hashCode(float, int)>
	//    3    6:ireturn         
	}

	public static int hashCode(float f, int i)
	{
		return hashCode(Float.floatToIntBits(f), i);
	//    0    0:fload_0         
	//    1    1:invokestatic    #195 <Method int Float.floatToIntBits(float)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #198 <Method int hashCode(int, int)>
	//    4    8:ireturn         
	}

	public static int hashCode(int i)
	{
		return hashCode(i, 17);
	//    0    0:iload_0         
	//    1    1:bipush          17
	//    2    3:invokestatic    #198 <Method int hashCode(int, int)>
	//    3    6:ireturn         
	}

	public static int hashCode(int i, int j)
	{
		return j * 31 + i;
	//    0    0:iload_1         
	//    1    1:bipush          31
	//    2    3:imul            
	//    3    4:iload_0         
	//    4    5:iadd            
	//    5    6:ireturn         
	}

	public static int hashCode(Object obj, int i)
	{
		int j;
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
			j = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		else
	//*   4    6:goto            14
			j = obj.hashCode();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #202 <Method int Object.hashCode()>
	//    7   13:istore_2        
		return hashCode(j, i);
	//    8   14:iload_2         
	//    9   15:iload_1         
	//   10   16:invokestatic    #198 <Method int hashCode(int, int)>
	//   11   19:ireturn         
	}

	public static int hashCode(boolean flag)
	{
		return hashCode(flag, 17);
	//    0    0:iload_0         
	//    1    1:bipush          17
	//    2    3:invokestatic    #206 <Method int hashCode(boolean, int)>
	//    3    6:ireturn         
	}

	public static int hashCode(boolean flag, int i)
	{
		int j;
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            9
			j = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		return hashCode(j, i);
	//    7   11:iload_2         
	//    8   12:iload_1         
	//    9   13:invokestatic    #198 <Method int hashCode(int, int)>
	//   10   16:ireturn         
	}

	public static boolean isOnBackgroundThread()
	{
		return !isOnMainThread();
	//    0    0:invokestatic    #48  <Method boolean isOnMainThread()>
	//    1    3:ifne            8
	//    2    6:iconst_1        
	//    3    7:ireturn         
	//    4    8:iconst_0        
	//    5    9:ireturn         
	}

	public static boolean isOnMainThread()
	{
		return Looper.myLooper() == Looper.getMainLooper();
	//    0    0:invokestatic    #212 <Method Looper Looper.myLooper()>
	//    1    3:invokestatic    #215 <Method Looper Looper.getMainLooper()>
	//    2    6:if_acmpne       11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	private static boolean isValidDimension(int i)
	{
		return i > 0 || i == 0x80000000;
	//    0    0:iload_0         
	//    1    1:ifgt            10
	//    2    4:iload_0         
	//    3    5:ldc1            #218 <Int 0x80000000>
	//    4    7:icmpne          12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public static boolean isValidDimensions(int i, int j)
	{
		return isValidDimension(i) && isValidDimension(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #222 <Method boolean isValidDimension(int)>
	//    2    4:ifeq            16
	//    3    7:iload_1         
	//    4    8:invokestatic    #222 <Method boolean isValidDimension(int)>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static String sha256BytesToHex(byte abyte0[])
	{
		char ac[] = SHA_256_CHARS;
	//    0    0:getstatic       #28  <Field char[] SHA_256_CHARS>
	//    1    3:astore_1        
		ac;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		abyte0 = ((byte []) (bytesToHex(abyte0, SHA_256_CHARS)));
	//    4    6:aload_0         
	//    5    7:getstatic       #28  <Field char[] SHA_256_CHARS>
	//    6   10:invokestatic    #226 <Method String bytesToHex(byte[], char[])>
	//    7   13:astore_0        
		ac;
	//    8   14:aload_1         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return ((String) (abyte0));
	//   10   16:aload_0         
	//   11   17:areturn         
		abyte0;
	//   12   18:astore_0        
	//*  13   19:aload_1         
		throw abyte0;
	//   14   20:monitorexit     
	//   15   21:aload_0         
	//   16   22:athrow          
	}

	private static final int HASH_ACCUMULATOR = 17;
	private static final int HASH_MULTIPLIER = 31;
	private static final char HEX_CHAR_ARRAY[] = "0123456789abcdef".toCharArray();
	private static final char SHA_256_CHARS[] = new char[64];

	static 
	{
	//    0    0:ldc1            #18  <String "0123456789abcdef">
	//    1    2:invokevirtual   #24  <Method char[] String.toCharArray()>
	//    2    5:putstatic       #26  <Field char[] HEX_CHAR_ARRAY>
	//    3    8:bipush          64
	//    4   10:newarray        char[]
	//    5   12:putstatic       #28  <Field char[] SHA_256_CHARS>
	//*   6   15:return          
	}
}
