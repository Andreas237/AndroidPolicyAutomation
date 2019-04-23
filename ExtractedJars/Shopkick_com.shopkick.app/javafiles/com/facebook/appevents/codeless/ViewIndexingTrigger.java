// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import android.hardware.*;

public class ViewIndexingTrigger
	implements SensorEventListener
{
	public static interface OnShakeListener
	{

		public abstract void onShake();
	}


	public ViewIndexingTrigger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public void onAccuracyChanged(Sensor sensor, int i)
	{
	//    0    0:return          
	}

	public void onSensorChanged(SensorEvent sensorevent)
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field ViewIndexingTrigger$OnShakeListener mListener>
	//*   2    4:ifnull          88
		{
			float f = sensorevent.values[0];
	//    3    7:aload_1         
	//    4    8:getfield        #32  <Field float[] SensorEvent.values>
	//    5   11:iconst_0        
	//    6   12:faload          
	//    7   13:fstore          8
			float f1 = sensorevent.values[1];
	//    8   15:aload_1         
	//    9   16:getfield        #32  <Field float[] SensorEvent.values>
	//   10   19:iconst_1        
	//   11   20:faload          
	//   12   21:fstore          9
			float f2 = sensorevent.values[2];
	//   13   23:aload_1         
	//   14   24:getfield        #32  <Field float[] SensorEvent.values>
	//   15   27:iconst_2        
	//   16   28:faload          
	//   17   29:fstore          10
			double d = f / 9.80665F;
	//   18   31:fload           8
	//   19   33:ldc1            #33  <Float 9.80665F>
	//   20   35:fdiv            
	//   21   36:f2d             
	//   22   37:dstore_2        
			double d1 = f1 / 9.80665F;
	//   23   38:fload           9
	//   24   40:ldc1            #33  <Float 9.80665F>
	//   25   42:fdiv            
	//   26   43:f2d             
	//   27   44:dstore          4
			double d2 = f2 / 9.80665F;
	//   28   46:fload           10
	//   29   48:ldc1            #33  <Float 9.80665F>
	//   30   50:fdiv            
	//   31   51:f2d             
	//   32   52:dstore          6
			if(Math.sqrt(d * d + d1 * d1 + d2 * d2) > 2.2999999523162842D)
	//*  33   54:dload_2         
	//*  34   55:dload_2         
	//*  35   56:dmul            
	//*  36   57:dload           4
	//*  37   59:dload           4
	//*  38   61:dmul            
	//*  39   62:dadd            
	//*  40   63:dload           6
	//*  41   65:dload           6
	//*  42   67:dmul            
	//*  43   68:dadd            
	//*  44   69:invokestatic    #39  <Method double Math.sqrt(double)>
	//*  45   72:ldc2w           #12  <Double 2.2999999523162842D>
	//*  46   75:dcmpl           
	//*  47   76:ifle            88
				mListener.onShake();
	//   48   79:aload_0         
	//   49   80:getfield        #26  <Field ViewIndexingTrigger$OnShakeListener mListener>
	//   50   83:invokeinterface #42  <Method void ViewIndexingTrigger$OnShakeListener.onShake()>
		}
	//   51   88:return          
	}

	public void setOnShakeListener(OnShakeListener onshakelistener)
	{
		mListener = onshakelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field ViewIndexingTrigger$OnShakeListener mListener>
	//    3    5:return          
	}

	private static final double SHAKE_THRESHOLD_GRAVITY = 2.2999999523162842D;
	private OnShakeListener mListener;
}
