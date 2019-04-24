// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.IPoint;

// Referenced classes of package com.amap.api.maps.model:
//			LatLng

public class MultiPointItem
{

	public MultiPointItem(LatLng latlng)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		d = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field String d>
		a = latlng;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field LatLng a>
	//    8   14:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(obj instanceof MultiPointItem)
	//*   4    6:aload_1         
	//*   5    7:instanceof      #2   <Class MultiPointItem>
	//*   6   10:ifeq            51
		{
			if(d != null && ((MultiPointItem)obj).getCustomerId() != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #21  <Field String d>
	//*   9   17:ifnull          45
	//*  10   20:aload_1         
	//*  11   21:checkcast       #2   <Class MultiPointItem>
	//*  12   24:invokevirtual   #30  <Method String getCustomerId()>
	//*  13   27:ifnull          45
				return d.equals(((Object) (((MultiPointItem)obj).getCustomerId())));
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field String d>
	//   16   34:aload_1         
	//   17   35:checkcast       #2   <Class MultiPointItem>
	//   18   38:invokevirtual   #30  <Method String getCustomerId()>
	//   19   41:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   20   44:ireturn         
			else
				return super.equals(obj);
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokespecial   #35  <Method boolean Object.equals(Object)>
	//   24   50:ireturn         
		} else
		{
			return false;
	//   25   51:iconst_0        
	//   26   52:ireturn         
		}
	}

	public String getCustomerId()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String d>
	//    2    4:areturn         
	}

	public IPoint getIPoint()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field IPoint b>
	//    2    4:areturn         
	}

	public LatLng getLatLng()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field LatLng a>
	//    2    4:areturn         
	}

	public Object getObject()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object c>
	//    2    4:areturn         
	}

	public String getSnippet()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String f>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String e>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public void setCustomerId(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String d>
	//    3    5:return          
	}

	public void setIPoint(IPoint ipoint)
	{
		b = ipoint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field IPoint b>
	//    3    5:return          
	}

	public void setLatLng(LatLng latlng)
	{
		a = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field LatLng a>
	//    3    5:return          
	}

	public void setObject(Object obj)
	{
		c = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field Object c>
	//    3    5:return          
	}

	public void setSnippet(String s)
	{
		f = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field String f>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field String e>
	//    3    5:return          
	}

	private LatLng a;
	private IPoint b;
	private Object c;
	private String d;
	private String e;
	private String f;
}
