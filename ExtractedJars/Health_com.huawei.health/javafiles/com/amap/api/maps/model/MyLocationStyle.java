// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.amap.api.maps.model:
//			MyLocationStyleCreator, BitmapDescriptor

public class MyLocationStyle
	implements Parcelable
{

	public MyLocationStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		b = 0.5F;
	//    2    4:aload_0         
	//    3    5:ldc1            #60  <Float 0.5F>
	//    4    7:putfield        #62  <Field float b>
		c = 0.5F;
	//    5   10:aload_0         
	//    6   11:ldc1            #60  <Float 0.5F>
	//    7   13:putfield        #64  <Field float c>
		d = Color.argb(100, 0, 0, 180);
	//    8   16:aload_0         
	//    9   17:bipush          100
	//   10   19:iconst_0        
	//   11   20:iconst_0        
	//   12   21:sipush          180
	//   13   24:invokestatic    #70  <Method int Color.argb(int, int, int, int)>
	//   14   27:putfield        #72  <Field int d>
		e = Color.argb(255, 0, 0, 220);
	//   15   30:aload_0         
	//   16   31:sipush          255
	//   17   34:iconst_0        
	//   18   35:iconst_0        
	//   19   36:sipush          220
	//   20   39:invokestatic    #70  <Method int Color.argb(int, int, int, int)>
	//   21   42:putfield        #74  <Field int e>
		f = 1.0F;
	//   22   45:aload_0         
	//   23   46:fconst_1        
	//   24   47:putfield        #76  <Field float f>
		g = 4;
	//   25   50:aload_0         
	//   26   51:iconst_4        
	//   27   52:putfield        #78  <Field int g>
		h = 2000L;
	//   28   55:aload_0         
	//   29   56:ldc2w           #79  <Long 2000L>
	//   30   59:putfield        #82  <Field long h>
		i = true;
	//   31   62:aload_0         
	//   32   63:iconst_1        
	//   33   64:putfield        #84  <Field boolean i>
	//   34   67:return          
	}

	public MyLocationStyle anchor(float f1, float f2)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #62  <Field float b>
		c = f2;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #64  <Field float c>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public float getAnchorU()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field float b>
	//    2    4:freturn         
	}

	public float getAnchorV()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field float c>
	//    2    4:freturn         
	}

	public long getInterval()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field long h>
	//    2    4:lreturn         
	}

	public BitmapDescriptor getMyLocationIcon()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field BitmapDescriptor a>
	//    2    4:areturn         
	}

	public int getMyLocationType()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int g>
	//    2    4:ireturn         
	}

	public int getRadiusFillColor()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int d>
	//    2    4:ireturn         
	}

	public int getStrokeColor()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int e>
	//    2    4:ireturn         
	}

	public float getStrokeWidth()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field float f>
	//    2    4:freturn         
	}

	public MyLocationStyle interval(long l)
	{
		h = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #82  <Field long h>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public boolean isMyLocationShowing()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean i>
	//    2    4:ireturn         
	}

	public MyLocationStyle myLocationIcon(BitmapDescriptor bitmapdescriptor)
	{
		a = bitmapdescriptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field BitmapDescriptor a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MyLocationStyle myLocationType(int j)
	{
		g = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field int g>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MyLocationStyle radiusFillColor(int j)
	{
		d = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field int d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MyLocationStyle showMyLocation(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean i>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MyLocationStyle strokeColor(int j)
	{
		e = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field int e>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public MyLocationStyle strokeWidth(float f1)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #76  <Field float f>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int j)
	{
		parcel.writeParcelable(((Parcelable) (a)), j);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #97  <Field BitmapDescriptor a>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #123 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeFloat(b);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #62  <Field float b>
	//    8   14:invokevirtual   #127 <Method void Parcel.writeFloat(float)>
		parcel.writeFloat(c);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #64  <Field float c>
	//   12   22:invokevirtual   #127 <Method void Parcel.writeFloat(float)>
		parcel.writeInt(d);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #72  <Field int d>
	//   16   30:invokevirtual   #131 <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #74  <Field int e>
	//   20   38:invokevirtual   #131 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(f);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #76  <Field float f>
	//   24   46:invokevirtual   #127 <Method void Parcel.writeFloat(float)>
		parcel.writeInt(g);
	//   25   49:aload_1         
	//   26   50:aload_0         
	//   27   51:getfield        #78  <Field int g>
	//   28   54:invokevirtual   #131 <Method void Parcel.writeInt(int)>
		parcel.writeLong(h);
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:getfield        #82  <Field long h>
	//   32   62:invokevirtual   #135 <Method void Parcel.writeLong(long)>
		parcel.writeBooleanArray(new boolean[] {
			i
		});
	//   33   65:aload_1         
	//   34   66:iconst_1        
	//   35   67:newarray        boolean[]
	//   36   69:dup             
	//   37   70:iconst_0        
	//   38   71:aload_0         
	//   39   72:getfield        #84  <Field boolean i>
	//   40   75:bastore         
	//   41   76:invokevirtual   #139 <Method void Parcel.writeBooleanArray(boolean[])>
	//   42   79:return          
	}

	public static final MyLocationStyleCreator CREATOR = new MyLocationStyleCreator();
	public static final String ERROR_CODE = "errorCode";
	public static final String ERROR_INFO = "errorInfo";
	public static final String LOCATION_TYPE = "locationType";
	public static final int LOCATION_TYPE_FOLLOW = 2;
	public static final int LOCATION_TYPE_FOLLOW_NO_CENTER = 6;
	public static final int LOCATION_TYPE_LOCATE = 1;
	public static final int LOCATION_TYPE_LOCATION_ROTATE = 4;
	public static final int LOCATION_TYPE_LOCATION_ROTATE_NO_CENTER = 5;
	public static final int LOCATION_TYPE_MAP_ROTATE = 3;
	public static final int LOCATION_TYPE_MAP_ROTATE_NO_CENTER = 7;
	public static final int LOCATION_TYPE_SHOW = 0;
	private BitmapDescriptor a;
	private float b;
	private float c;
	private int d;
	private int e;
	private float f;
	private int g;
	private long h;
	private boolean i;

	static 
	{
	//    0    0:new             #52  <Class MyLocationStyleCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void MyLocationStyleCreator()>
	//    3    7:putstatic       #57  <Field MyLocationStyleCreator CREATOR>
	//*   4   10:return          
	}
}
