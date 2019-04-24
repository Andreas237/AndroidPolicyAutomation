// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.sensor.framework.device.android.util;

import com.sec.android.service.health.util.LOG;

public class SensorSpo2Cal
{

	public SensorSpo2Cal()
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
	//*  25   48:ifle            56
		{
			f1 = f;
	//   26   51:fload_0         
	//   27   52:fstore_1        
		} else
	//*  28   53:goto            8
		{
			float f2 = Math.round(spo2_coef[0] * f * f + spo2_coef[1] * f + spo2_coef[2]);
	//   29   56:getstatic       #18  <Field float[] spo2_coef>
	//   30   59:iconst_0        
	//   31   60:faload          
	//   32   61:fload_0         
	//   33   62:fmul            
	//   34   63:fload_0         
	//   35   64:fmul            
	//   36   65:getstatic       #18  <Field float[] spo2_coef>
	//   37   68:iconst_1        
	//   38   69:faload          
	//   39   70:fload_0         
	//   40   71:fmul            
	//   41   72:fadd            
	//   42   73:getstatic       #18  <Field float[] spo2_coef>
	//   43   76:iconst_2        
	//   44   77:faload          
	//   45   78:fadd            
	//   46   79:invokestatic    #55  <Method int Math.round(float)>
	//   47   82:i2f             
	//   48   83:fstore_2        
			if(f2 < 70F)
	//*  49   84:fload_2         
	//*  50   85:ldc1            #56  <Float 70F>
	//*  51   87:fcmpg           
	//*  52   88:ifge            97
			{
				f1 = 70F;
	//   53   91:ldc1            #56  <Float 70F>
	//   54   93:fstore_1        
			} else
	//*  55   94:goto            8
			{
				f1 = f2;
	//   56   97:fload_2         
	//   57   98:fstore_1        
				if(f2 > 100F)
	//*  58   99:fload_2         
	//*  59  100:ldc1            #57  <Float 100F>
	//*  60  102:fcmpl           
	//*  61  103:ifle            8
					f1 = 100F;
	//   62  106:ldc1            #57  <Float 100F>
	//   63  108:fstore_1        
			}
		}
		if(true) goto _L4; else goto _L3
	//   64  109:goto            8
_L3:
	}

	private static final Class TAG = com/sec/android/sensor/framework/device/android/util/SensorSpo2Cal;
	private static final float spo2_coef[] = {
		6.769142F, -51.2388F, 115.4634F
	};

	static 
	{
	//    0    0:ldc1            #2   <Class SensorSpo2Cal>
	//    1    2:putstatic       #13  <Field Class TAG>
	//    2    5:iconst_3        
	//    3    6:newarray        float[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #14  <Float 6.769142F>
	//    7   12:fastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #15  <Float -51.2388F>
	//   11   17:fastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #16  <Float 115.4634F>
	//   15   22:fastore         
	//   16   23:putstatic       #18  <Field float[] spo2_coef>
	//*  17   26:return          
	}
}
