// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.interfaces.IArc;

public final class Arc
{

	public Arc(IArc iarc)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = iarc;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field IArc a>
	//    5    9:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == null || !(obj instanceof Arc))
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class Arc>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		boolean flag;
		try
		{
			flag = a.equalsRemote(((com.autonavi.amap.mapcore.interfaces.IOverlay) (((Arc)obj).a)));
	//    7   13:aload_0         
	//    8   14:getfield        #13  <Field IArc a>
	//    9   17:aload_1         
	//   10   18:checkcast       #2   <Class Arc>
	//   11   21:getfield        #13  <Field IArc a>
	//   12   24:invokeinterface #24  <Method boolean IArc.equalsRemote(com.autonavi.amap.mapcore.interfaces.IOverlay)>
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
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:invokeinterface #31  <Method String IArc.getId()>
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

	public int getStrokeColor()
	{
		int i;
		try
		{
			i = a.getStrokeColor();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:invokeinterface #35  <Method int IArc.getStrokeColor()>
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

	public float getStrokeWidth()
	{
		float f;
		try
		{
			f = a.getStrokeWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:invokeinterface #39  <Method float IArc.getStrokeWidth()>
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
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:invokeinterface #42  <Method float IArc.getZIndex()>
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
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:invokeinterface #46  <Method int IArc.hashCodeRemote()>
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
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:invokeinterface #50  <Method boolean IArc.isVisible()>
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
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:invokeinterface #53  <Method void IArc.remove()>
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

	public void setStrokeColor(int i)
	{
		try
		{
			a.setStrokeColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #57  <Method void IArc.setStrokeColor(int)>
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

	public void setStrokeWidth(float f)
	{
		try
		{
			a.setStrokeWidth(f);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #61  <Method void IArc.setStrokeWidth(float)>
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
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #65  <Method void IArc.setVisible(boolean)>
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
	//    1    1:getfield        #13  <Field IArc a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #68  <Method void IArc.setZIndex(float)>
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

	private final IArc a;
}
