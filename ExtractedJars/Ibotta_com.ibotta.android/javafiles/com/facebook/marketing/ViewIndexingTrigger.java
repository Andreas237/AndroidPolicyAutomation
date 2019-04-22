// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing;

import android.hardware.*;

public class ViewIndexingTrigger
	implements SensorEventListener
{
	public static interface OnShakeListener
	{

		public abstract void onShake(int i);
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
	//*   2    4:ifnull          149
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
			if(Math.sqrt(d * d + d1 * d1 + d2 * d2) > 2.7000000476837158D)
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
	//*  45   72:ldc2w           #40  <Double 2.7000000476837158D>
	//*  46   75:dcmpl           
	//*  47   76:ifle            149
			{
				long l = System.currentTimeMillis();
	//   48   79:invokestatic    #47  <Method long System.currentTimeMillis()>
	//   49   82:lstore          11
				long l1 = mShakeTimestamp;
	//   50   84:aload_0         
	//   51   85:getfield        #49  <Field long mShakeTimestamp>
	//   52   88:lstore          13
				if(500L + l1 > l)
	//*  53   90:ldc2w           #50  <Long 500L>
	//*  54   93:lload           13
	//*  55   95:ladd            
	//*  56   96:lload           11
	//*  57   98:lcmp            
	//*  58   99:ifle            103
					return;
	//   59  102:return          
				if(l1 + 3000L < l)
	//*  60  103:lload           13
	//*  61  105:ldc2w           #52  <Long 3000L>
	//*  62  108:ladd            
	//*  63  109:lload           11
	//*  64  111:lcmp            
	//*  65  112:ifge            120
					mShakeCount = 0;
	//   66  115:aload_0         
	//   67  116:iconst_0        
	//   68  117:putfield        #55  <Field int mShakeCount>
				mShakeTimestamp = l;
	//   69  120:aload_0         
	//   70  121:lload           11
	//   71  123:putfield        #49  <Field long mShakeTimestamp>
				mShakeCount = mShakeCount + 1;
	//   72  126:aload_0         
	//   73  127:aload_0         
	//   74  128:getfield        #55  <Field int mShakeCount>
	//   75  131:iconst_1        
	//   76  132:iadd            
	//   77  133:putfield        #55  <Field int mShakeCount>
				mListener.onShake(mShakeCount);
	//   78  136:aload_0         
	//   79  137:getfield        #26  <Field ViewIndexingTrigger$OnShakeListener mListener>
	//   80  140:aload_0         
	//   81  141:getfield        #55  <Field int mShakeCount>
	//   82  144:invokeinterface #59  <Method void ViewIndexingTrigger$OnShakeListener.onShake(int)>
			}
		}
	//   83  149:return          
	}

	public void resetCount()
	{
		mShakeCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #55  <Field int mShakeCount>
	//    3    5:return          
	}

	public void setOnShakeListener(OnShakeListener onshakelistener)
	{
		mListener = onshakelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field ViewIndexingTrigger$OnShakeListener mListener>
	//    3    5:return          
	}

	private OnShakeListener mListener;
	private int mShakeCount;
	private long mShakeTimestamp;
}
