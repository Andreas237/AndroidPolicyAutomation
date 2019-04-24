// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzcz, zzcc, zzba

public abstract class zzei
	implements Callable
{

	public zzei(zzcz zzcz1, String s, String s1, zzba zzba, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #28  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #34  <Method String Class.getSimpleName()>
	//    6   12:putfield        #36  <Field String TAG>
		zzps = zzcz1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #38  <Field zzcz zzps>
		className = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #40  <Field String className>
		zztx = s1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #42  <Field String zztx>
		zztq = zzba;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #44  <Field zzba zztq>
		zzud = i;
	//   19   36:aload_0         
	//   20   37:iload           5
	//   21   39:putfield        #46  <Field int zzud>
		zzue = j;
	//   22   42:aload_0         
	//   23   43:iload           6
	//   24   45:putfield        #48  <Field int zzue>
	//   25   48:return          
	}

	public Object call()
		throws Exception
	{
		return ((Object) (zzat()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method Void zzat()>
	//    2    4:areturn         
	}

	protected abstract void zzar()
		throws IllegalAccessException, InvocationTargetException;

	public Void zzat()
		throws Exception
	{
		long l;
		l = System.nanoTime();
	//    0    0:invokestatic    #69  <Method long System.nanoTime()>
	//    1    3:lstore_1        
		zztz = zzps.zza(className, zztx);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field zzcz zzps>
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field String className>
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field String zztx>
	//    9   17:invokevirtual   #75  <Method Method zzcz.zza(String, String)>
	//   10   20:putfield        #77  <Field Method zztz>
		if(zztz == null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #77  <Field Method zztz>
	//*  13   27:ifnonnull       32
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
		zzcc zzcc1;
		try
		{
			zzar();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #79  <Method void zzar()>
			zzcc1 = zzps.zzag();
	//   18   36:aload_0         
	//   19   37:getfield        #38  <Field zzcz zzps>
	//   20   40:invokevirtual   #83  <Method zzcc zzcz.zzag()>
	//   21   43:astore_3        
		}
	//*  22   44:aload_3         
	//*  23   45:ifnull          78
	//*  24   48:aload_0         
	//*  25   49:getfield        #46  <Field int zzud>
	//*  26   52:ldc1            #84  <Int 0x80000000>
	//*  27   54:icmpeq          78
	//*  28   57:aload_3         
	//*  29   58:aload_0         
	//*  30   59:getfield        #48  <Field int zzue>
	//*  31   62:aload_0         
	//*  32   63:getfield        #46  <Field int zzud>
	//*  33   66:invokestatic    #69  <Method long System.nanoTime()>
	//*  34   69:lload_1         
	//*  35   70:lsub            
	//*  36   71:ldc2w           #85  <Long 1000L>
	//*  37   74:ldiv            
	//*  38   75:invokevirtual   #91  <Method void zzcc.zza(int, int, long)>
	//*  39   78:aconst_null     
	//*  40   79:areturn         
		catch(Object obj)
	//*  41   80:astore_3        
		{
			return null;
	//   42   81:aconst_null     
	//   43   82:areturn         
		}
		if(zzcc1 == null)
			break MISSING_BLOCK_LABEL_78;
		if(zzud != 0x80000000)
			zzcc1.zza(zzue, zzud, (System.nanoTime() - l) / 1000L);
		return null;
	}

	private final String TAG = ((Object)this).getClass().getSimpleName();
	private final String className;
	protected final zzcz zzps;
	protected final zzba zztq;
	private final String zztx;
	protected Method zztz;
	private final int zzud;
	private final int zzue;
}
