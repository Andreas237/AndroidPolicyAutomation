// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IglModel;

// Referenced classes of package com.amap.api.maps.model:
//			BasePointOverlay, LatLng

public class GL3DModel extends BasePointOverlay
{

	public GL3DModel(IglModel iglmodel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BasePointOverlay()>
		a = iglmodel;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field IglModel a>
	//    5    9:return          
	}

	public void destroy()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IglModel a>
	//*   2    4:ifnull          16
			a.destroy();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IglModel a>
	//    5   11:invokeinterface #19  <Method void IglModel.destroy()>
	//    6   16:return          
	}

	public float getAngle()
	{
		float f;
		try
		{
			f = a.getRotateAngle();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #26  <Method float IglModel.getRotateAngle()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(Exception exception)
	//*   6   12:astore_2        
		{
			exception.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #29  <Method void Exception.printStackTrace()>
			return 0.0F;
	//    9   17:fconst_0        
	//   10   18:freturn         
		}
		return f;
	}

	public String getId()
	{
		String s;
		try
		{
			s = a.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #33  <Method String IglModel.getId()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Exception exception)
	//*   6   12:astore_1        
		{
			exception.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #29  <Method void Exception.printStackTrace()>
			return "";
	//    9   17:ldc1            #35  <String "">
	//   10   19:areturn         
		}
		return s;
	}

	public Object getObject()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IglModel a>
	//*   2    4:ifnull          17
			return a.getObject();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IglModel a>
	//    5   11:invokeinterface #39  <Method Object IglModel.getObject()>
	//    6   16:areturn         
		else
			return ((Object) (null));
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public LatLng getPosition()
	{
		LatLng latlng;
		try
		{
			latlng = a.getPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #43  <Method LatLng IglModel.getPosition()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Exception exception)
	//*   6   12:astore_1        
		{
			exception.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #29  <Method void Exception.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return latlng;
	}

	public float getRotateAngle()
	{
		float f;
		try
		{
			f = a.getRotateAngle();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #26  <Method float IglModel.getRotateAngle()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(Exception exception)
	//*   6   12:astore_2        
		{
			exception.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #29  <Method void Exception.printStackTrace()>
			return 0.0F;
	//    9   17:fconst_0        
	//   10   18:freturn         
		}
		return f;
	}

	public String getSnippet()
	{
		String s;
		try
		{
			s = a.getSnippet();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #46  <Method String IglModel.getSnippet()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Exception exception)
	//*   6   12:astore_1        
		{
			exception.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #29  <Method void Exception.printStackTrace()>
			return "";
	//    9   17:ldc1            #35  <String "">
	//   10   19:areturn         
		}
		return s;
	}

	public String getTitle()
	{
		String s;
		try
		{
			s = a.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #49  <Method String IglModel.getTitle()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Exception exception)
	//*   6   12:astore_1        
		{
			exception.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #29  <Method void Exception.printStackTrace()>
			return "";
	//    9   17:ldc1            #35  <String "">
	//   10   19:areturn         
		}
		return s;
	}

	public boolean isVisible()
	{
		boolean flag;
		try
		{
			flag = a.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #53  <Method boolean IglModel.isVisible()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Exception exception)
	//*   6   12:astore_2        
		{
			exception.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #29  <Method void Exception.printStackTrace()>
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return flag;
	}

	public void remove()
	{
		try
		{
			a.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #56  <Method boolean IglModel.remove()>
	//    3    9:pop             
			return;
	//    4   10:return          
		}
		catch(Exception exception)
	//*   5   11:astore_1        
		{
			exception.printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #29  <Method void Exception.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setAngle(float f)
	{
		try
		{
			a.setRotateAngle(f);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #61  <Method void IglModel.setRotateAngle(float)>
			return;
	//    4   10:return          
		}
		catch(Exception exception)
	//*   5   11:astore_2        
		{
			exception.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #29  <Method void Exception.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setAnimation(Animation animation)
	{
		try
		{
			a.setAnimation(animation);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #67  <Method void IglModel.setAnimation(Animation)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Animation animation)
	//*   5   11:astore_1        
		{
			((Throwable) (animation)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #68  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setGeoPoint(IPoint ipoint)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IglModel a>
	//*   2    4:ifnull          17
			a.setGeoPoint(ipoint);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IglModel a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #72  <Method void IglModel.setGeoPoint(IPoint)>
	//    7   17:return          
	}

	public void setModelFixedLength(int i)
	{
		try
		{
			a.setModelFixedLength(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #76  <Method void IglModel.setModelFixedLength(int)>
			return;
	//    4   10:return          
		}
		catch(Exception exception)
	//*   5   11:astore_2        
		{
			exception.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #29  <Method void Exception.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setObject(Object obj)
	{
		try
		{
			a.setObject(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #80  <Method void IglModel.setObject(Object)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   5   11:astore_1        
		{
			((Exception) (obj)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #29  <Method void Exception.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setPosition(LatLng latlng)
	{
		try
		{
			a.setPosition(latlng);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #84  <Method void IglModel.setPosition(LatLng)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   5   11:astore_1        
		{
			((Exception) (latlng)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #29  <Method void Exception.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setRotateAngle(float f)
	{
		try
		{
			a.setRotateAngle(f);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #61  <Method void IglModel.setRotateAngle(float)>
			return;
	//    4   10:return          
		}
		catch(Exception exception)
	//*   5   11:astore_2        
		{
			exception.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #29  <Method void Exception.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setSnippet(String s)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IglModel a>
	//*   2    4:ifnull          17
			a.setSnippet(s);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IglModel a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #88  <Method void IglModel.setSnippet(String)>
	//    7   17:return          
	}

	public void setTitle(String s)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IglModel a>
	//*   2    4:ifnull          17
			a.setTitle(s);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IglModel a>
	//    5   11:aload_1         
	//    6   12:invokeinterface #91  <Method void IglModel.setTitle(String)>
	//    7   17:return          
	}

	public void setVisible(boolean flag)
	{
		try
		{
			a.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #95  <Method void IglModel.setVisible(boolean)>
			return;
	//    4   10:return          
		}
		catch(Exception exception)
	//*   5   11:astore_2        
		{
			exception.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #29  <Method void Exception.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setZoomLimit(float f)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field IglModel a>
	//*   2    4:ifnull          17
			a.setZoomLimit(f);
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field IglModel a>
	//    5   11:fload_1         
	//    6   12:invokeinterface #98  <Method void IglModel.setZoomLimit(float)>
	//    7   17:return          
	}

	public void showInfoWindow()
	{
		try
		{
			a.showInfoWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #101 <Method void IglModel.showInfoWindow()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #68  <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public boolean startAnimation()
	{
		boolean flag;
		try
		{
			flag = a.startAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IglModel a>
	//    2    4:invokeinterface #104 <Method boolean IglModel.startAnimation()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Exception exception)
	//*   6   12:astore_2        
		{
			exception.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #29  <Method void Exception.printStackTrace()>
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return flag;
	}

	private final IglModel a;
}
