// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Typeface;
import com.autonavi.amap.mapcore.interfaces.IText;

// Referenced classes of package com.amap.api.maps.model:
//			LatLng

public final class Text
{

	public Text(IText itext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = itext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field IText a>
	//    5    9:return          
	}

	public void destroy()
	{
		try
		{
			if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field IText a>
	//*   2    4:ifnull          17
				a.destroy(true);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field IText a>
	//    5   11:iconst_1        
	//    6   12:invokeinterface #35  <Method void IText.destroy(boolean)>
			return;
	//    7   17:return          
		}
		catch(Throwable throwable)
	//*   8   18:astore_1        
		{
			throwable.printStackTrace();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//   11   23:return          
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Text))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Text>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag;
		try
		{
			flag = a.equalsRemote(((com.autonavi.amap.mapcore.interfaces.IOverlayImage) (((Text)obj).a)));
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field IText a>
	//    7   13:aload_1         
	//    8   14:checkcast       #2   <Class Text>
	//    9   17:getfield        #26  <Field IText a>
	//   10   20:invokeinterface #44  <Method boolean IText.equalsRemote(com.autonavi.amap.mapcore.interfaces.IOverlayImage)>
	//   11   25:istore_2        
		}
	//*  12   26:iload_2         
	//*  13   27:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  14   28:astore_1        
		{
			((Throwable) (obj)).printStackTrace();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return false;
	//   17   33:iconst_0        
	//   18   34:ireturn         
		}
		return flag;
	}

	public int getAlignX()
	{
		int i;
		try
		{
			i = a.getAlignX();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #48  <Method int IText.getAlignX()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return i;
	}

	public int getAlignY()
	{
		int i;
		try
		{
			i = a.getAlignY();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #51  <Method int IText.getAlignY()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return i;
	}

	public int getBackgroundColor()
	{
		int i;
		try
		{
			i = a.getBackgroundColor();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #54  <Method int IText.getBackgroundColor()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return i;
	}

	public int getFontColor()
	{
		int i;
		try
		{
			i = a.getFontColor();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #57  <Method int IText.getFontColor()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return i;
	}

	public int getFontSize()
	{
		int i;
		try
		{
			i = a.getFontSize();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #60  <Method int IText.getFontSize()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		return i;
	}

	public String getId()
	{
		String s;
		try
		{
			s = a.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #64  <Method String IText.getId()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return s;
	}

	public Object getObject()
	{
		return a.getObject();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #68  <Method Object IText.getObject()>
	//    3    9:areturn         
	}

	public LatLng getPosition()
	{
		LatLng latlng;
		try
		{
			latlng = a.getPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #72  <Method LatLng IText.getPosition()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return latlng;
	}

	public float getRotate()
	{
		return a.getRotateAngle();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #77  <Method float IText.getRotateAngle()>
	//    3    9:freturn         
	}

	public String getText()
	{
		String s;
		try
		{
			s = a.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #80  <Method String IText.getText()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return s;
	}

	public Typeface getTypeface()
	{
		Typeface typeface;
		try
		{
			typeface = a.getTypeface();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #84  <Method Typeface IText.getTypeface()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			throwable.printStackTrace();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		}
		return typeface;
	}

	public float getZIndex()
	{
		return a.getZIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #87  <Method float IText.getZIndex()>
	//    3    9:freturn         
	}

	public int hashCode()
	{
		return a.hashCodeRemote();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #91  <Method int IText.hashCodeRemote()>
	//    3    9:ireturn         
	}

	public boolean isVisible()
	{
		boolean flag;
		try
		{
			flag = a.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #95  <Method boolean IText.isVisible()>
	//    3    9:istore_1        
		}
	//*   4   10:iload_1         
	//*   5   11:ireturn         
		catch(Throwable throwable)
	//*   6   12:astore_2        
		{
			throwable.printStackTrace();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
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
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:invokeinterface #98  <Method boolean IText.remove()>
	//    3    9:pop             
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_1        
		{
			throwable.printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setAlign(int i, int j)
	{
		try
		{
			a.setAlign(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #102 <Method void IText.setAlign(int, int)>
			return;
	//    5   11:return          
		}
		catch(Throwable throwable)
	//*   6   12:astore_3        
		{
			throwable.printStackTrace();
	//    7   13:aload_3         
	//    8   14:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    9   17:return          
	}

	public void setBackgroundColor(int i)
	{
		try
		{
			a.setBackgroundColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #106 <Method void IText.setBackgroundColor(int)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setFontColor(int i)
	{
		try
		{
			a.setFontColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #109 <Method void IText.setFontColor(int)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setFontSize(int i)
	{
		try
		{
			a.setFontSize(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #112 <Method void IText.setFontSize(int)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setObject(Object obj)
	{
		a.setObject(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #116 <Method void IText.setObject(Object)>
	//    4   10:return          
	}

	public void setPosition(LatLng latlng)
	{
		try
		{
			a.setPosition(latlng);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #120 <Method void IText.setPosition(LatLng)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*   5   11:astore_1        
		{
			((Throwable) (latlng)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setRotate(float f)
	{
		try
		{
			a.setRotateAngle(f);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #125 <Method void IText.setRotateAngle(float)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setText(String s)
	{
		try
		{
			a.setText(s);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #129 <Method void IText.setText(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			((Throwable) (s)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setTypeface(Typeface typeface)
	{
		try
		{
			a.setTypeface(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #133 <Method void IText.setTypeface(Typeface)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Typeface typeface)
	//*   5   11:astore_1        
		{
			((Throwable) (typeface)).printStackTrace();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setVisible(boolean flag)
	{
		try
		{
			a.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #136 <Method void IText.setVisible(boolean)>
			return;
	//    4   10:return          
		}
		catch(Throwable throwable)
	//*   5   11:astore_2        
		{
			throwable.printStackTrace();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #38  <Method void Throwable.printStackTrace()>
		}
	//    8   16:return          
	}

	public void setZIndex(float f)
	{
		a.setZIndex(f);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IText a>
	//    2    4:fload_1         
	//    3    5:invokeinterface #139 <Method void IText.setZIndex(float)>
	//    4   10:return          
	}

	public static final int ALIGN_BOTTOM = 16;
	public static final int ALIGN_CENTER_HORIZONTAL = 4;
	public static final int ALIGN_CENTER_VERTICAL = 32;
	public static final int ALIGN_LEFT = 1;
	public static final int ALIGN_RIGHT = 2;
	public static final int ALIGN_TOP = 8;
	private IText a;
}
