// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import java.io.File;

final class HardwareConfigState
{

	private HardwareConfigState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		isHardwareConfigAllowed = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #35  <Field boolean isHardwareConfigAllowed>
	//    5    9:return          
	}

	static HardwareConfigState getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #39  <Field HardwareConfigState instance>
	//    1    3:ifnonnull       37
		com/bumptech/glide/load/resource/bitmap/HardwareConfigState;
	//    2    6:ldc1            #2   <Class HardwareConfigState>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #39  <Field HardwareConfigState instance>
	//*   5   12:ifnonnull       25
			instance = new HardwareConfigState();
	//    6   15:new             #2   <Class HardwareConfigState>
	//    7   18:dup             
	//    8   19:invokespecial   #40  <Method void HardwareConfigState()>
	//    9   22:putstatic       #39  <Field HardwareConfigState instance>
		com/bumptech/glide/load/resource/bitmap/HardwareConfigState;
	//   10   25:ldc1            #2   <Class HardwareConfigState>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
	//*  14   32:ldc1            #2   <Class HardwareConfigState>
		throw exception;
	//   15   34:monitorexit     
	//   16   35:aload_0         
	//   17   36:athrow          
		return instance;
	//   18   37:getstatic       #39  <Field HardwareConfigState instance>
	//   19   40:areturn         
	}

	private boolean isFdSizeBelowHardwareLimit()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		i = decodesSinceLastFdCheck + 1;
	//    2    2:aload_0         
	//    3    3:getfield        #44  <Field int decodesSinceLastFdCheck>
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:istore_1        
		decodesSinceLastFdCheck = i;
	//    7    9:aload_0         
	//    8   10:iload_1         
	//    9   11:putfield        #44  <Field int decodesSinceLastFdCheck>
		if(i < 50)
			break MISSING_BLOCK_LABEL_102;
	//   10   14:iload_1         
	//   11   15:bipush          50
	//   12   17:icmplt          102
		decodesSinceLastFdCheck = 0;
	//   13   20:aload_0         
	//   14   21:iconst_0        
	//   15   22:putfield        #44  <Field int decodesSinceLastFdCheck>
		i = FD_SIZE_LIST.list().length;
	//   16   25:getstatic       #30  <Field File FD_SIZE_LIST>
	//   17   28:invokevirtual   #48  <Method String[] File.list()>
	//   18   31:arraylength     
	//   19   32:istore_1        
		boolean flag;
		Exception exception;
		if(i < 700)
	//*  20   33:iload_1         
	//*  21   34:sipush          700
	//*  22   37:icmpge          116
			flag = true;
	//   23   40:iconst_1        
	//   24   41:istore_2        
		else
	//*  25   42:goto            45
	//*  26   45:aload_0         
	//*  27   46:iload_2         
	//*  28   47:putfield        #35  <Field boolean isHardwareConfigAllowed>
	//*  29   50:aload_0         
	//*  30   51:getfield        #35  <Field boolean isHardwareConfigAllowed>
	//*  31   54:ifne            102
	//*  32   57:ldc1            #50  <String "Downsampler">
	//*  33   59:iconst_5        
	//*  34   60:invokestatic    #56  <Method boolean Log.isLoggable(String, int)>
	//*  35   63:ifeq            102
	//*  36   66:ldc1            #50  <String "Downsampler">
	//*  37   68:new             #58  <Class StringBuilder>
	//*  38   71:dup             
	//*  39   72:invokespecial   #59  <Method void StringBuilder()>
	//*  40   75:ldc1            #61  <String "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ">
	//*  41   77:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  42   80:iload_1         
	//*  43   81:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//*  44   84:ldc1            #70  <String ", limit ">
	//*  45   86:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  46   89:sipush          700
	//*  47   92:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//*  48   95:invokevirtual   #74  <Method String StringBuilder.toString()>
	//*  49   98:invokestatic    #78  <Method int Log.w(String, String)>
	//*  50  101:pop             
	//*  51  102:aload_0         
	//*  52  103:getfield        #35  <Field boolean isHardwareConfigAllowed>
	//*  53  106:istore_2        
	//*  54  107:aload_0         
	//*  55  108:monitorexit     
	//*  56  109:iload_2         
	//*  57  110:ireturn         
	//*  58  111:astore_3        
	//*  59  112:aload_0         
	//*  60  113:monitorexit     
	//*  61  114:aload_3         
	//*  62  115:athrow          
			flag = false;
	//   63  116:iconst_0        
	//   64  117:istore_2        
		isHardwareConfigAllowed = flag;
		if(!isHardwareConfigAllowed && Log.isLoggable("Downsampler", 5))
			Log.w("Downsampler", (new StringBuilder()).append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ").append(i).append(", limit ").append(700).toString());
		flag = isHardwareConfigAllowed;
		this;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		throw exception;
	//*  65  118:goto            45
	}

	boolean setHardwareConfigIfAllowed(int i, int j, android.graphics.BitmapFactory.Options options, DecodeFormat decodeformat, boolean flag, boolean flag1)
	{
		if(!flag || android.os.Build.VERSION.SDK_INT < 26 || decodeformat == DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE || flag1)
	//*   0    0:iload           5
	//*   1    2:ifeq            26
	//*   2    5:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    8:bipush          26
	//*   4   10:icmplt          26
	//*   5   13:aload           4
	//*   6   15:getstatic       #94  <Field DecodeFormat DecodeFormat.PREFER_ARGB_8888_DISALLOW_HARDWARE>
	//*   7   18:if_acmpeq       26
	//*   8   21:iload           6
	//*   9   23:ifeq            28
			return false;
	//   10   26:iconst_0        
	//   11   27:ireturn         
		if(i >= 128 && j >= 128 && isFdSizeBelowHardwareLimit())
	//*  12   28:iload_1         
	//*  13   29:sipush          128
	//*  14   32:icmplt          55
	//*  15   35:iload_2         
	//*  16   36:sipush          128
	//*  17   39:icmplt          55
	//*  18   42:aload_0         
	//*  19   43:invokespecial   #96  <Method boolean isFdSizeBelowHardwareLimit()>
	//*  20   46:ifeq            55
			flag = true;
	//   21   49:iconst_1        
	//   22   50:istore          5
		else
	//*  23   52:goto            58
			flag = false;
	//   24   55:iconst_0        
	//   25   56:istore          5
		if(flag)
	//*  26   58:iload           5
	//*  27   60:ifeq            75
		{
			options.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
	//   28   63:aload_3         
	//   29   64:getstatic       #102 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.HARDWARE>
	//   30   67:putfield        #107 <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
			options.inMutable = false;
	//   31   70:aload_3         
	//   32   71:iconst_0        
	//   33   72:putfield        #110 <Field boolean android.graphics.BitmapFactory$Options.inMutable>
		}
		return flag;
	//   34   75:iload           5
	//   35   77:ireturn         
	}

	private static final File FD_SIZE_LIST = new File("/proc/self/fd");
	private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS = 700;
	private static final int MINIMUM_DECODES_BETWEEN_FD_CHECKS = 50;
	private static final int MIN_HARDWARE_DIMENSION = 128;
	private static volatile HardwareConfigState instance;
	private volatile int decodesSinceLastFdCheck;
	private volatile boolean isHardwareConfigAllowed;

	static 
	{
	//    0    0:new             #22  <Class File>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "/proc/self/fd">
	//    3    6:invokespecial   #28  <Method void File(String)>
	//    4    9:putstatic       #30  <Field File FD_SIZE_LIST>
	//*   5   12:return          
	}
}
