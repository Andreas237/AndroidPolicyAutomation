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
	//    1    1:invokespecial   #27  <Method void Object()>
		isHardwareConfigAllowed = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #29  <Field boolean isHardwareConfigAllowed>
	//    5    9:return          
	}

	static HardwareConfigState getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #33  <Field HardwareConfigState instance>
	//    1    3:ifnonnull       37
		com/bumptech/glide/load/resource/bitmap/HardwareConfigState;
	//    2    6:ldc1            #2   <Class HardwareConfigState>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #33  <Field HardwareConfigState instance>
	//*   5   12:ifnonnull       25
			instance = new HardwareConfigState();
	//    6   15:new             #2   <Class HardwareConfigState>
	//    7   18:dup             
	//    8   19:invokespecial   #34  <Method void HardwareConfigState()>
	//    9   22:putstatic       #33  <Field HardwareConfigState instance>
		com/bumptech/glide/load/resource/bitmap/HardwareConfigState;
	//   10   25:ldc1            #2   <Class HardwareConfigState>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/bumptech/glide/load/resource/bitmap/HardwareConfigState;
	//   14   32:ldc1            #2   <Class HardwareConfigState>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return instance;
	//   18   37:getstatic       #33  <Field HardwareConfigState instance>
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
	//    3    3:getfield        #38  <Field int decodesSinceLastFdCheck>
	//    4    6:iconst_1        
	//    5    7:iadd            
	//    6    8:istore_1        
		decodesSinceLastFdCheck = i;
	//    7    9:aload_0         
	//    8   10:iload_1         
	//    9   11:putfield        #38  <Field int decodesSinceLastFdCheck>
		boolean flag;
		if(i < 50)
			break MISSING_BLOCK_LABEL_111;
	//   10   14:iload_1         
	//   11   15:bipush          50
	//   12   17:icmplt          111
		flag = false;
	//   13   20:iconst_0        
	//   14   21:istore_2        
		decodesSinceLastFdCheck = 0;
	//   15   22:aload_0         
	//   16   23:iconst_0        
	//   17   24:putfield        #38  <Field int decodesSinceLastFdCheck>
		i = FD_SIZE_LIST.list().length;
	//   18   27:getstatic       #24  <Field File FD_SIZE_LIST>
	//   19   30:invokevirtual   #42  <Method String[] File.list()>
	//   20   33:arraylength     
	//   21   34:istore_1        
		if(i < 700)
	//*  22   35:iload_1         
	//*  23   36:sipush          700
	//*  24   39:icmpge          44
			flag = true;
	//   25   42:iconst_1        
	//   26   43:istore_2        
		isHardwareConfigAllowed = flag;
	//   27   44:aload_0         
	//   28   45:iload_2         
	//   29   46:putfield        #29  <Field boolean isHardwareConfigAllowed>
		if(!isHardwareConfigAllowed && Log.isLoggable("Downsampler", 5))
	//*  30   49:aload_0         
	//*  31   50:getfield        #29  <Field boolean isHardwareConfigAllowed>
	//*  32   53:ifne            111
	//*  33   56:ldc1            #44  <String "Downsampler">
	//*  34   58:iconst_5        
	//*  35   59:invokestatic    #50  <Method boolean Log.isLoggable(String, int)>
	//*  36   62:ifeq            111
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   37   65:new             #52  <Class StringBuilder>
	//   38   68:dup             
	//   39   69:invokespecial   #53  <Method void StringBuilder()>
	//   40   72:astore_3        
			stringbuilder.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
	//   41   73:aload_3         
	//   42   74:ldc1            #55  <String "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ">
	//   43   76:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   44   79:pop             
			stringbuilder.append(i);
	//   45   80:aload_3         
	//   46   81:iload_1         
	//   47   82:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   48   85:pop             
			stringbuilder.append(", limit ");
	//   49   86:aload_3         
	//   50   87:ldc1            #64  <String ", limit ">
	//   51   89:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   52   92:pop             
			stringbuilder.append(700);
	//   53   93:aload_3         
	//   54   94:sipush          700
	//   55   97:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   56  100:pop             
			Log.w("Downsampler", stringbuilder.toString());
	//   57  101:ldc1            #44  <String "Downsampler">
	//   58  103:aload_3         
	//   59  104:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   60  107:invokestatic    #72  <Method int Log.w(String, String)>
	//   61  110:pop             
		}
		flag = isHardwareConfigAllowed;
	//   62  111:aload_0         
	//   63  112:getfield        #29  <Field boolean isHardwareConfigAllowed>
	//   64  115:istore_2        
		this;
	//   65  116:aload_0         
		JVM INSTR monitorexit ;
	//   66  117:monitorexit     
		return flag;
	//   67  118:iload_2         
	//   68  119:ireturn         
		Exception exception;
		exception;
	//   69  120:astore_3        
	//*  70  121:aload_0         
		throw exception;
	//   71  122:monitorexit     
	//   72  123:aload_3         
	//   73  124:athrow          
	}

	boolean setHardwareConfigIfAllowed(int i, int j, android.graphics.BitmapFactory.Options options, DecodeFormat decodeformat, boolean flag, boolean flag1)
	{
		if(flag && android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:iload           5
	//*   1    2:ifeq            70
	//*   2    5:getstatic       #82  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    8:bipush          26
	//*   4   10:icmplt          70
		{
			if(flag1)
	//*   5   13:iload           6
	//*   6   15:ifeq            20
				return false;
	//    7   18:iconst_0        
	//    8   19:ireturn         
			if(i >= 128 && j >= 128 && isFdSizeBelowHardwareLimit())
	//*   9   20:iload_1         
	//*  10   21:sipush          128
	//*  11   24:icmplt          47
	//*  12   27:iload_2         
	//*  13   28:sipush          128
	//*  14   31:icmplt          47
	//*  15   34:aload_0         
	//*  16   35:invokespecial   #84  <Method boolean isFdSizeBelowHardwareLimit()>
	//*  17   38:ifeq            47
				flag = true;
	//   18   41:iconst_1        
	//   19   42:istore          5
			else
	//*  20   44:goto            50
				flag = false;
	//   21   47:iconst_0        
	//   22   48:istore          5
			if(flag)
	//*  23   50:iload           5
	//*  24   52:ifeq            67
			{
				options.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
	//   25   55:aload_3         
	//   26   56:getstatic       #90  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.HARDWARE>
	//   27   59:putfield        #95  <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
				options.inMutable = false;
	//   28   62:aload_3         
	//   29   63:iconst_0        
	//   30   64:putfield        #98  <Field boolean android.graphics.BitmapFactory$Options.inMutable>
			}
			return flag;
	//   31   67:iload           5
	//   32   69:ireturn         
		} else
		{
			return false;
	//   33   70:iconst_0        
	//   34   71:ireturn         
		}
	}

	private static final File FD_SIZE_LIST = new File("/proc/self/fd");
	private static volatile HardwareConfigState instance;
	private volatile int decodesSinceLastFdCheck;
	private volatile boolean isHardwareConfigAllowed;

	static 
	{
	//    0    0:new             #16  <Class File>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "/proc/self/fd">
	//    3    6:invokespecial   #22  <Method void File(String)>
	//    4    9:putstatic       #24  <Field File FD_SIZE_LIST>
	//*   5   12:return          
	}
}
