// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.*;

// Referenced classes of package com.amap.api.maps.model:
//			NavigateArrowOptionsCreator, LatLng

public final class NavigateArrowOptions
	implements Parcelable
{

	public NavigateArrowOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		c = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <Float 10F>
	//    4    7:putfield        #35  <Field float c>
		d = Color.argb(221, 87, 235, 204);
	//    5   10:aload_0         
	//    6   11:sipush          221
	//    7   14:bipush          87
	//    8   16:sipush          235
	//    9   19:sipush          204
	//   10   22:invokestatic    #41  <Method int Color.argb(int, int, int, int)>
	//   11   25:putfield        #43  <Field int d>
		e = Color.argb(170, 0, 172, 146);
	//   12   28:aload_0         
	//   13   29:sipush          170
	//   14   32:iconst_0        
	//   15   33:sipush          172
	//   16   36:sipush          146
	//   17   39:invokestatic    #41  <Method int Color.argb(int, int, int, int)>
	//   18   42:putfield        #45  <Field int e>
		f = 0.0F;
	//   19   45:aload_0         
	//   20   46:fconst_0        
	//   21   47:putfield        #47  <Field float f>
		g = true;
	//   22   50:aload_0         
	//   23   51:iconst_1        
	//   24   52:putfield        #49  <Field boolean g>
	//   25   55:aload_0         
	//   26   56:new             #51  <Class ArrayList>
	//   27   59:dup             
	//   28   60:invokespecial   #52  <Method void ArrayList()>
	//   29   63:putfield        #54  <Field List b>
	//   30   66:return          
	}

	public NavigateArrowOptions add(LatLng latlng)
	{
		b.add(((Object) (latlng)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #61  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public transient NavigateArrowOptions add(LatLng alatlng[])
	{
		b.addAll(((java.util.Collection) (Arrays.asList(((Object []) (alatlng))))));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List b>
	//    2    4:aload_1         
	//    3    5:invokestatic    #68  <Method List Arrays.asList(Object[])>
	//    4    8:invokeinterface #72  <Method boolean List.addAll(java.util.Collection)>
	//    5   13:pop             
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public NavigateArrowOptions addAll(Iterable iterable)
	{
		LatLng latlng;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); b.add(((Object) (latlng))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #79  <Method Iterator Iterable.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            40
			latlng = (LatLng)((Iterator) (iterable)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #89  <Method Object Iterator.next()>
	//    8   22:checkcast       #91  <Class LatLng>
	//    9   25:astore_2        

	//   10   26:aload_0         
	//   11   27:getfield        #54  <Field List b>
	//   12   30:aload_2         
	//   13   31:invokeinterface #61  <Method boolean List.add(Object)>
	//   14   36:pop             
	//*  15   37:goto            7
		return this;
	//   16   40:aload_0         
	//   17   41:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public List getPoints()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List b>
	//    2    4:areturn         
	}

	public int getSideColor()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int e>
	//    2    4:ireturn         
	}

	public int getTopColor()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int d>
	//    2    4:ireturn         
	}

	public float getWidth()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float c>
	//    2    4:freturn         
	}

	public float getZIndex()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float f>
	//    2    4:freturn         
	}

	public boolean isVisible()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean g>
	//    2    4:ireturn         
	}

	public NavigateArrowOptions sideColor(int i)
	{
		e = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int e>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NavigateArrowOptions topColor(int i)
	{
		d = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NavigateArrowOptions visible(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean g>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NavigateArrowOptions width(float f1)
	{
		c = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #35  <Field float c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeTypedList(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field List b>
	//    3    5:invokevirtual   #121 <Method void Parcel.writeTypedList(List)>
		parcel.writeFloat(c);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field float c>
	//    7   13:invokevirtual   #125 <Method void Parcel.writeFloat(float)>
		parcel.writeInt(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field int d>
	//   11   21:invokevirtual   #129 <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #45  <Field int e>
	//   15   29:invokevirtual   #129 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(f);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #47  <Field float f>
	//   19   37:invokevirtual   #125 <Method void Parcel.writeFloat(float)>
		if(g)
	//*  20   40:aload_0         
	//*  21   41:getfield        #49  <Field boolean g>
	//*  22   44:ifeq            52
			i = 1;
	//   23   47:iconst_1        
	//   24   48:istore_2        
		else
	//*  25   49:goto            54
			i = 0;
	//   26   52:iconst_0        
	//   27   53:istore_2        
		parcel.writeByte((byte)i);
	//   28   54:aload_1         
	//   29   55:iload_2         
	//   30   56:int2byte        
	//   31   57:invokevirtual   #133 <Method void Parcel.writeByte(byte)>
		parcel.writeString(a);
	//   32   60:aload_1         
	//   33   61:aload_0         
	//   34   62:getfield        #135 <Field String a>
	//   35   65:invokevirtual   #139 <Method void Parcel.writeString(String)>
	//   36   68:return          
	}

	public NavigateArrowOptions zIndex(float f1)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #47  <Field float f>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final NavigateArrowOptionsCreator CREATOR = new NavigateArrowOptionsCreator();
	String a;
	private final List b = new ArrayList();
	private float c;
	private int d;
	private int e;
	private float f;
	private boolean g;

	static 
	{
	//    0    0:new             #25  <Class NavigateArrowOptionsCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void NavigateArrowOptionsCreator()>
	//    3    7:putstatic       #30  <Field NavigateArrowOptionsCreator CREATOR>
	//*   4   10:return          
	}
}
