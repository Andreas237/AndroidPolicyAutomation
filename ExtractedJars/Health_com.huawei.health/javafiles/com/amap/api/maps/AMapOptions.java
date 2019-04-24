// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps.model.CameraPosition;

// Referenced classes of package com.amap.api.maps:
//			AMapOptionsCreator

public class AMapOptions
	implements Parcelable
{

	public AMapOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		a = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #46  <Field int a>
		b = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #48  <Field boolean b>
		c = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #50  <Field boolean c>
		d = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #52  <Field boolean d>
		e = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #54  <Field boolean e>
		f = true;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #56  <Field boolean f>
		g = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #58  <Field boolean g>
		i = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #60  <Field boolean i>
		j = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #62  <Field boolean j>
		k = 0;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #64  <Field int k>
	//   32   54:return          
	}

	public AMapOptions camera(CameraPosition cameraposition)
	{
		h = cameraposition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field CameraPosition h>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AMapOptions compassEnabled(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean i>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CameraPosition getCamera()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field CameraPosition h>
	//    2    4:areturn         
	}

	public boolean getCompassEnabled()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean i>
	//    2    4:ireturn         
	}

	public int getLogoPosition()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int k>
	//    2    4:ireturn         
	}

	public int getMapType()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int a>
	//    2    4:ireturn         
	}

	public boolean getRotateGesturesEnabled()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean b>
	//    2    4:ireturn         
	}

	public boolean getScaleControlsEnabled()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean j>
	//    2    4:ireturn         
	}

	public boolean getScrollGesturesEnabled()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean c>
	//    2    4:ireturn         
	}

	public boolean getTiltGesturesEnabled()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean d>
	//    2    4:ireturn         
	}

	public boolean getZOrderOnTop()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean g>
	//    2    4:ireturn         
	}

	public boolean getZoomControlsEnabled()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean f>
	//    2    4:ireturn         
	}

	public boolean getZoomGesturesEnabled()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean e>
	//    2    4:ireturn         
	}

	public AMapOptions logoPosition(int l)
	{
		k = l;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field int k>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AMapOptions mapType(int l)
	{
		a = l;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field int a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AMapOptions rotateGesturesEnabled(boolean flag)
	{
		b = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field boolean b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AMapOptions scaleControlsEnabled(boolean flag)
	{
		j = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean j>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AMapOptions scrollGesturesEnabled(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AMapOptions tiltGesturesEnabled(boolean flag)
	{
		d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int l)
	{
		parcel.writeParcelable(((Parcelable) (h)), l);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #68  <Field CameraPosition h>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #100 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeInt(a);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #46  <Field int a>
	//    8   14:invokevirtual   #104 <Method void Parcel.writeInt(int)>
		parcel.writeBooleanArray(new boolean[] {
			b, c, d, e, f, g, i, j
		});
	//    9   17:aload_1         
	//   10   18:bipush          8
	//   11   20:newarray        boolean[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:aload_0         
	//   15   25:getfield        #48  <Field boolean b>
	//   16   28:bastore         
	//   17   29:dup             
	//   18   30:iconst_1        
	//   19   31:aload_0         
	//   20   32:getfield        #50  <Field boolean c>
	//   21   35:bastore         
	//   22   36:dup             
	//   23   37:iconst_2        
	//   24   38:aload_0         
	//   25   39:getfield        #52  <Field boolean d>
	//   26   42:bastore         
	//   27   43:dup             
	//   28   44:iconst_3        
	//   29   45:aload_0         
	//   30   46:getfield        #54  <Field boolean e>
	//   31   49:bastore         
	//   32   50:dup             
	//   33   51:iconst_4        
	//   34   52:aload_0         
	//   35   53:getfield        #56  <Field boolean f>
	//   36   56:bastore         
	//   37   57:dup             
	//   38   58:iconst_5        
	//   39   59:aload_0         
	//   40   60:getfield        #58  <Field boolean g>
	//   41   63:bastore         
	//   42   64:dup             
	//   43   65:bipush          6
	//   44   67:aload_0         
	//   45   68:getfield        #60  <Field boolean i>
	//   46   71:bastore         
	//   47   72:dup             
	//   48   73:bipush          7
	//   49   75:aload_0         
	//   50   76:getfield        #62  <Field boolean j>
	//   51   79:bastore         
	//   52   80:invokevirtual   #108 <Method void Parcel.writeBooleanArray(boolean[])>
	//   53   83:return          
	}

	public AMapOptions zOrderOnTop(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean g>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AMapOptions zoomControlsEnabled(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field boolean f>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AMapOptions zoomGesturesEnabled(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field boolean e>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final AMapOptionsCreator CREATOR = new AMapOptionsCreator();
	public static final int LOGO_MARGIN_BOTTOM = 2;
	public static final int LOGO_MARGIN_LEFT = 0;
	public static final int LOGO_MARGIN_RIGHT = 1;
	public static final int LOGO_POSITION_BOTTOM_CENTER = 1;
	public static final int LOGO_POSITION_BOTTOM_LEFT = 0;
	public static final int LOGO_POSITION_BOTTOM_RIGHT = 2;
	public static final int ZOOM_POSITION_RIGHT_BUTTOM = 2;
	public static final int ZOOM_POSITION_RIGHT_CENTER = 1;
	private int a;
	private boolean b;
	private boolean c;
	private boolean d;
	private boolean e;
	private boolean f;
	private boolean g;
	private CameraPosition h;
	private boolean i;
	private boolean j;
	private int k;

	static 
	{
	//    0    0:new             #37  <Class AMapOptionsCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void AMapOptionsCreator()>
	//    3    7:putstatic       #42  <Field AMapOptionsCreator CREATOR>
	//*   4   10:return          
	}
}
