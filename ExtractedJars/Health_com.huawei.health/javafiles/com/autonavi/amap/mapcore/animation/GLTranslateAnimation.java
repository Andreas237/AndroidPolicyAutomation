// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.animation;

import com.amap.api.maps.model.LatLng;

// Referenced classes of package com.autonavi.amap.mapcore.animation:
//			GLAnimation, GLTransformation

public class GLTranslateAnimation extends GLAnimation
{

	public GLTranslateAnimation(LatLng latlng)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void GLAnimation()>
		mFromXDelta = 0.0D;
	//    2    4:aload_0         
	//    3    5:dconst_0        
	//    4    6:putfield        #18  <Field double mFromXDelta>
		mFromYDelta = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #20  <Field double mFromYDelta>
		mToXDelta = 0.0D;
	//    8   14:aload_0         
	//    9   15:dconst_0        
	//   10   16:putfield        #22  <Field double mToXDelta>
		mToYDelta = 0.0D;
	//   11   19:aload_0         
	//   12   20:dconst_0        
	//   13   21:putfield        #24  <Field double mToYDelta>
		mCurXDelta = 0.0D;
	//   14   24:aload_0         
	//   15   25:dconst_0        
	//   16   26:putfield        #26  <Field double mCurXDelta>
		mCurYDelta = 0.0D;
	//   17   29:aload_0         
	//   18   30:dconst_0        
	//   19   31:putfield        #28  <Field double mCurYDelta>
		mToXDelta = latlng.longitude;
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:getfield        #33  <Field double LatLng.longitude>
	//   23   39:putfield        #22  <Field double mToXDelta>
		mToYDelta = latlng.latitude;
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:getfield        #36  <Field double LatLng.latitude>
	//   27   47:putfield        #24  <Field double mToYDelta>
	//   28   50:return          
	}

	protected void applyTransformation(float f, GLTransformation gltransformation)
	{
		mCurXDelta = mFromXDelta;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field double mFromXDelta>
	//    3    5:putfield        #26  <Field double mCurXDelta>
		mCurYDelta = mFromYDelta;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field double mFromYDelta>
	//    7   13:putfield        #28  <Field double mCurYDelta>
		if(mFromXDelta != mToXDelta)
	//*   8   16:aload_0         
	//*   9   17:getfield        #18  <Field double mFromXDelta>
	//*  10   20:aload_0         
	//*  11   21:getfield        #22  <Field double mToXDelta>
	//*  12   24:dcmpl           
	//*  13   25:ifeq            49
			mCurXDelta = mFromXDelta + (mToXDelta - mFromXDelta) * (double)f;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #18  <Field double mFromXDelta>
	//   17   33:aload_0         
	//   18   34:getfield        #22  <Field double mToXDelta>
	//   19   37:aload_0         
	//   20   38:getfield        #18  <Field double mFromXDelta>
	//   21   41:dsub            
	//   22   42:fload_1         
	//   23   43:f2d             
	//   24   44:dmul            
	//   25   45:dadd            
	//   26   46:putfield        #26  <Field double mCurXDelta>
		if(mFromYDelta != mToYDelta)
	//*  27   49:aload_0         
	//*  28   50:getfield        #20  <Field double mFromYDelta>
	//*  29   53:aload_0         
	//*  30   54:getfield        #24  <Field double mToYDelta>
	//*  31   57:dcmpl           
	//*  32   58:ifeq            82
			mCurYDelta = mFromYDelta + (mToYDelta - mFromYDelta) * (double)f;
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #20  <Field double mFromYDelta>
	//   36   66:aload_0         
	//   37   67:getfield        #24  <Field double mToYDelta>
	//   38   70:aload_0         
	//   39   71:getfield        #20  <Field double mFromYDelta>
	//   40   74:dsub            
	//   41   75:fload_1         
	//   42   76:f2d             
	//   43   77:dmul            
	//   44   78:dadd            
	//   45   79:putfield        #28  <Field double mCurYDelta>
		gltransformation.x = mCurXDelta;
	//   46   82:aload_2         
	//   47   83:aload_0         
	//   48   84:getfield        #26  <Field double mCurXDelta>
	//   49   87:putfield        #44  <Field double GLTransformation.x>
		gltransformation.y = mCurYDelta;
	//   50   90:aload_2         
	//   51   91:aload_0         
	//   52   92:getfield        #28  <Field double mCurYDelta>
	//   53   95:putfield        #47  <Field double GLTransformation.y>
	//   54   98:return          
	}

	public void setFromPoint(LatLng latlng)
	{
		mFromXDelta = latlng.longitude;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #33  <Field double LatLng.longitude>
	//    3    5:putfield        #18  <Field double mFromXDelta>
		mFromYDelta = latlng.latitude;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #36  <Field double LatLng.latitude>
	//    7   13:putfield        #20  <Field double mFromYDelta>
	//    8   16:return          
	}

	public double mCurXDelta;
	public double mCurYDelta;
	public double mFromXDelta;
	public double mFromYDelta;
	public double mToXDelta;
	public double mToYDelta;
}
