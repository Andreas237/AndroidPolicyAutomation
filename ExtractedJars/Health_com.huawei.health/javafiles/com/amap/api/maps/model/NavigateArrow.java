// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.interfaces.INavigateArrow;
import java.util.List;

public class NavigateArrow
{

	public NavigateArrow(INavigateArrow inavigatearrow)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = inavigatearrow;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field INavigateArrow a>
	//    5    9:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == null || !(obj instanceof NavigateArrow))
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class NavigateArrow>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		boolean flag;
		try
		{
			flag = a.equalsRemote(((com.autonavi.amap.mapcore.interfaces.IOverlay) (((NavigateArrow)obj).a)));
	//    7   13:aload_0         
	//    8   14:getfield        #13  <Field INavigateArrow a>
	//    9   17:aload_1         
	//   10   18:checkcast       #2   <Class NavigateArrow>
	//   11   21:getfield        #13  <Field INavigateArrow a>
	//   12   24:invokeinterface #24  <Method boolean INavigateArrow.equalsRemote(com.autonavi.amap.mapcore.interfaces.IOverlay)>
	//   13   29:istore_2        
		}
	//*  14   30:iload_2         
	//*  15   31:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  16   32:astore_1        
		{
			((Throwable) (obj)).printStackTrace();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			return false;
	//   19   37:iconst_0        
	//   20   38:ireturn         
		}
		return flag;
	}

	public String getId()
	{
		String s;
		try
		{
			s = a.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:invokeinterface #31  <Method String INavigateArrow.getId()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return s;
	}

	public List getPoints()
	{
		List list;
		try
		{
			list = a.getPoints();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:invokeinterface #35  <Method List INavigateArrow.getPoints()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return list;
	}

	public int getSideColor()
	{
		int i;
		try
		{
			i = a.getSideColor();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:invokeinterface #42  <Method int INavigateArrow.getSideColor()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return i;
	}

	public int getTopColor()
	{
		int i;
		try
		{
			i = a.getTopColor();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:invokeinterface #46  <Method int INavigateArrow.getTopColor()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return i;
	}

	public float getWidth()
	{
		float f;
		try
		{
			f = a.getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:invokeinterface #50  <Method float INavigateArrow.getWidth()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			return 0.0F;
	//    9   17:fconst_0        
	//   10   18:freturn         
		}
		return f;
	}

	public float getZIndex()
	{
		float f;
		try
		{
			f = a.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:invokeinterface #53  <Method float INavigateArrow.getZIndex()>
	//    3    9:fstore_1        
		}
	//*   4   10:fload_1         
	//*   5   11:freturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			return 0.0F;
	//    9   17:fconst_0        
	//   10   18:freturn         
		}
		return f;
	}

	public int hashCode()
	{
		int i;
		try
		{
			i = a.hashCodeRemote();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:invokeinterface #57  <Method int INavigateArrow.hashCodeRemote()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return i;
	}

	public boolean isVisible()
	{
		boolean flag;
		try
		{
			flag = a.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:invokeinterface #61  <Method boolean INavigateArrow.isVisible()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #27  <Method void Throwable.printStackTrace()>
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
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:invokeinterface #64  <Method void INavigateArrow.remove()>
			return;
	//    3    9:return          
		}
		catch(Throwable throwable)
	//*   4   10:astore_1        
		{
			throwable.printStackTrace();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #27  <Method void Throwable.printStackTrace()>
		}
	//    7   15:return          
	}

	public void setPoints(List list)
	{
		try
		{
			a.setPoints(list);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #68  <Method void INavigateArrow.setPoints(List)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*   5   11:astore_1        
		{
			((Throwable) (list)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #27  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setSideColor(int i)
	{
		try
		{
			a.setSideColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #73  <Method void INavigateArrow.setSideColor(int)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #27  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setTopColor(int i)
	{
		try
		{
			a.setTopColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #76  <Method void INavigateArrow.setTopColor(int)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #27  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setVisible(boolean flag)
	{
		try
		{
			a.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #80  <Method void INavigateArrow.setVisible(boolean)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #27  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setWidth(float f)
	{
		try
		{
			a.setWidth(f);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #84  <Method void INavigateArrow.setWidth(float)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #27  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setZIndex(float f)
	{
		try
		{
			a.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field INavigateArrow a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #87  <Method void INavigateArrow.setZIndex(float)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #27  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	private final INavigateArrow a;
}
