// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

public final class ya
{

	public ya()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field boolean a>
		b = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #17  <Field float b>
	//    8   14:return          
	}

	public static float a(Context context)
	{
		context = ((Context) ((AudioManager)context.getSystemService("audio")));
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "audio">
	//    2    3:invokevirtual   #27  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #29  <Class AudioManager>
	//    4    9:astore_0        
		if(context == null)
	//*   5   10:aload_0         
	//*   6   11:ifnonnull       16
			return 0.0F;
	//    7   14:fconst_0        
	//    8   15:freturn         
		int i = ((AudioManager) (context)).getStreamMaxVolume(3);
	//    9   16:aload_0         
	//   10   17:iconst_3        
	//   11   18:invokevirtual   #33  <Method int AudioManager.getStreamMaxVolume(int)>
	//   12   21:istore_1        
		int j = ((AudioManager) (context)).getStreamVolume(3);
	//   13   22:aload_0         
	//   14   23:iconst_3        
	//   15   24:invokevirtual   #36  <Method int AudioManager.getStreamVolume(int)>
	//   16   27:istore_2        
		if(i == 0)
	//*  17   28:iload_1         
	//*  18   29:ifne            34
			return 0.0F;
	//   19   32:fconst_0        
	//   20   33:freturn         
		else
			return (float)j / (float)i;
	//   21   34:iload_2         
	//   22   35:i2f             
	//   23   36:iload_1         
	//   24   37:i2f             
	//   25   38:fdiv            
	//   26   39:freturn         
	}

	private final boolean c()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		float f = b;
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field float b>
	//    4    6:fstore_1        
		boolean flag;
		if(f >= 0.0F)
	//*   5    7:fload_1         
	//*   6    8:fconst_0        
	//*   7    9:fcmpl           
	//*   8   10:iflt            19
			flag = true;
	//    9   13:iconst_1        
	//   10   14:istore_2        
		else
	//*  11   15:aload_0         
	//*  12   16:monitorexit     
	//*  13   17:iload_2         
	//*  14   18:ireturn         
			flag = false;
	//   15   19:iconst_0        
	//   16   20:istore_2        
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  17   21:goto            15
		Exception exception;
		exception;
	//   18   24:astore_3        
	//*  19   25:aload_0         
		throw exception;
	//   20   26:monitorexit     
	//   21   27:aload_3         
	//   22   28:athrow          
	}

	public final float a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		float f;
		if(!c())
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:invokespecial   #41  <Method boolean c()>
	//    4    6:ifeq            18
		f = b;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field float b>
	//    7   13:fstore_1        
	//*   8   14:aload_0         
	//*   9   15:monitorexit     
		return f;
	//   10   16:fload_1         
	//   11   17:freturn         
		this;
	//   12   18:aload_0         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		return 1.0F;
	//   14   20:fconst_1        
	//   15   21:freturn         
		Exception exception;
		exception;
	//   16   22:astore_2        
	//*  17   23:aload_0         
		throw exception;
	//   18   24:monitorexit     
	//   19   25:aload_2         
	//   20   26:athrow          
	}

	public final void a(float f)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		b = f;
	//    2    2:aload_0         
	//    3    3:fload_1         
	//    4    4:putfield        #17  <Field float b>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_2        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_2         
	//   12   14:athrow          
	}

	public final void a(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		a = flag;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #15  <Field boolean a>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_2        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_2         
	//   12   14:athrow          
	}

	public final boolean b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = a;
	//    2    2:aload_0         
	//    3    3:getfield        #15  <Field boolean a>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	private boolean a;
	private float b;
}
