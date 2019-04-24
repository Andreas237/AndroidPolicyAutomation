// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android.util;

import com.sec.android.service.health.util.LOG;

public class SensorSpo2ZeroCal
{

	public SensorSpo2ZeroCal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static float spo2cal(float f)
	{
		if(f != 0.0F) goto _L2; else goto _L1
	//    0    0:fload_0         
	//    1    1:fconst_0        
	//    2    2:fcmpl           
	//    3    3:ifne            44
_L1:
		float f1 = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore_1        
_L4:
		LOG.d(TAG, (new StringBuilder()).append("R_value+ ").append(f).append(" Spo2 = ").append(f1).toString());
	//    6    8:getstatic       #13  <Field Class TAG>
	//    7   11:new             #26  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #27  <Method void StringBuilder()>
	//   10   18:ldc1            #29  <String "R_value+ ">
	//   11   20:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:fload_0         
	//   13   24:invokevirtual   #36  <Method StringBuilder StringBuilder.append(float)>
	//   14   27:ldc1            #38  <String " Spo2 = ">
	//   15   29:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:fload_1         
	//   17   33:invokevirtual   #36  <Method StringBuilder StringBuilder.append(float)>
	//   18   36:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   19   39:invokestatic    #48  <Method void LOG.d(Class, String)>
		return f1;
	//   20   42:fload_1         
	//   21   43:freturn         
_L2:
		if(f > 69F)
	//*  22   44:fload_0         
	//*  23   45:ldc1            #49  <Float 69F>
	//*  24   47:fcmpl           
	//*  25   48:ifle            69
		{
			if(f > 100F)
	//*  26   51:fload_0         
	//*  27   52:ldc1            #50  <Float 100F>
	//*  28   54:fcmpl           
	//*  29   55:ifle            64
				f1 = 100F;
	//   30   58:ldc1            #50  <Float 100F>
	//   31   60:fstore_1        
			else
	//*  32   61:goto            8
				f1 = f;
	//   33   64:fload_0         
	//   34   65:fstore_1        
		} else
	//*  35   66:goto            8
		{
			float f2 = Math.round(spo2_coef[0] * f * f + spo2_coef[1] * f + spo2_coef[2]);
	//   36   69:getstatic       #18  <Field float[] spo2_coef>
	//   37   72:iconst_0        
	//   38   73:faload          
	//   39   74:fload_0         
	//   40   75:fmul            
	//   41   76:fload_0         
	//   42   77:fmul            
	//   43   78:getstatic       #18  <Field float[] spo2_coef>
	//   44   81:iconst_1        
	//   45   82:faload          
	//   46   83:fload_0         
	//   47   84:fmul            
	//   48   85:fadd            
	//   49   86:getstatic       #18  <Field float[] spo2_coef>
	//   50   89:iconst_2        
	//   51   90:faload          
	//   52   91:fadd            
	//   53   92:invokestatic    #56  <Method int Math.round(float)>
	//   54   95:i2f             
	//   55   96:fstore_2        
			if(f2 < 70F)
	//*  56   97:fload_2         
	//*  57   98:ldc1            #57  <Float 70F>
	//*  58  100:fcmpg           
	//*  59  101:ifge            110
			{
				f1 = 70F;
	//   60  104:ldc1            #57  <Float 70F>
	//   61  106:fstore_1        
			} else
	//*  62  107:goto            8
			{
				f1 = f2;
	//   63  110:fload_2         
	//   64  111:fstore_1        
				if(f2 > 100F)
	//*  65  112:fload_2         
	//*  66  113:ldc1            #50  <Float 100F>
	//*  67  115:fcmpl           
	//*  68  116:ifle            8
					f1 = 100F;
	//   69  119:ldc1            #50  <Float 100F>
	//   70  121:fstore_1        
			}
		}
		if(true) goto _L4; else goto _L3
	//   71  122:goto            8
_L3:
	}

	private static final Class TAG = com/sec/android/sensor/framework/device/android/util/SensorSpo2ZeroCal;
	private static final float spo2_coef[] = {
		0.4717154F, -31.00346F, 112.5735F
	};

	static 
	{
	//    0    0:ldc1            #2   <Class SensorSpo2ZeroCal>
	//    1    2:putstatic       #13  <Field Class TAG>
	//    2    5:iconst_3        
	//    3    6:newarray        float[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #14  <Float 0.4717154F>
	//    7   12:fastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #15  <Float -31.00346F>
	//   11   17:fastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #16  <Float 112.5735F>
	//   15   22:fastore         
	//   16   23:putstatic       #18  <Field float[] spo2_coef>
	//*  17   26:return          
	}
}
