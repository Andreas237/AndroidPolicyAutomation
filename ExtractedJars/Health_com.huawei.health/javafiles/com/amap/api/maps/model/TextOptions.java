// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Typeface;
import android.os.*;

// Referenced classes of package com.amap.api.maps.model:
//			TextOptionsCreator, LatLng

public final class TextOptions
	implements Parcelable
{

	public TextOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		d = Typeface.DEFAULT;
	//    2    4:aload_0         
	//    3    5:getstatic       #44  <Field Typeface Typeface.DEFAULT>
	//    4    8:putfield        #46  <Field Typeface d>
		f = 4;
	//    5   11:aload_0         
	//    6   12:iconst_4        
	//    7   13:putfield        #48  <Field int f>
		g = 32;
	//    8   16:aload_0         
	//    9   17:bipush          32
	//   10   19:putfield        #50  <Field int g>
		h = -1;
	//   11   22:aload_0         
	//   12   23:iconst_m1       
	//   13   24:putfield        #52  <Field int h>
		i = 0xff000000;
	//   14   27:aload_0         
	//   15   28:ldc1            #53  <Int 0xff000000>
	//   16   30:putfield        #55  <Field int i>
		k = 20;
	//   17   33:aload_0         
	//   18   34:bipush          20
	//   19   36:putfield        #57  <Field int k>
		l = 0.0F;
	//   20   39:aload_0         
	//   21   40:fconst_0        
	//   22   41:putfield        #59  <Field float l>
		m = true;
	//   23   44:aload_0         
	//   24   45:iconst_1        
	//   25   46:putfield        #61  <Field boolean m>
	//   26   49:return          
	}

	public TextOptions align(int i1, int j1)
	{
		f = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int f>
		g = j1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #50  <Field int g>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public TextOptions backgroundColor(int i1)
	{
		h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field int h>
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

	public TextOptions fontColor(int i1)
	{
		i = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int i>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TextOptions fontSize(int i1)
	{
		k = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int k>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public int getAlignX()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int f>
	//    2    4:ireturn         
	}

	public int getAlignY()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int g>
	//    2    4:ireturn         
	}

	public int getBackgroundColor()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int h>
	//    2    4:ireturn         
	}

	public int getFontColor()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int i>
	//    2    4:ireturn         
	}

	public int getFontSize()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int k>
	//    2    4:ireturn         
	}

	public Object getObject()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Object j>
	//    2    4:areturn         
	}

	public LatLng getPosition()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field LatLng b>
	//    2    4:areturn         
	}

	public float getRotate()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field float e>
	//    2    4:freturn         
	}

	public String getText()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field String c>
	//    2    4:areturn         
	}

	public Typeface getTypeface()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Typeface d>
	//    2    4:areturn         
	}

	public float getZIndex()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field float l>
	//    2    4:freturn         
	}

	public boolean isVisible()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean m>
	//    2    4:ireturn         
	}

	public TextOptions position(LatLng latlng)
	{
		b = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field LatLng b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TextOptions rotate(float f1)
	{
		e = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #86  <Field float e>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TextOptions setObject(Object obj)
	{
		j = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field Object j>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TextOptions text(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field String c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TextOptions typeface(Typeface typeface1)
	{
		if(typeface1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			d = typeface1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #46  <Field Typeface d>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public TextOptions visible(boolean flag)
	{
		m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field boolean m>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #111 <Field String a>
	//    3    5:invokevirtual   #117 <Method void Parcel.writeString(String)>
		Bundle bundle = new Bundle();
	//    4    8:new             #119 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #120 <Method void Bundle()>
	//    7   15:astore_3        
		if(b != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #82  <Field LatLng b>
	//*  10   20:ifnull          49
		{
			bundle.putDouble("lat", b.latitude);
	//   11   23:aload_3         
	//   12   24:ldc1            #122 <String "lat">
	//   13   26:aload_0         
	//   14   27:getfield        #82  <Field LatLng b>
	//   15   30:getfield        #128 <Field double LatLng.latitude>
	//   16   33:invokevirtual   #132 <Method void Bundle.putDouble(String, double)>
			bundle.putDouble("lng", b.longitude);
	//   17   36:aload_3         
	//   18   37:ldc1            #134 <String "lng">
	//   19   39:aload_0         
	//   20   40:getfield        #82  <Field LatLng b>
	//   21   43:getfield        #137 <Field double LatLng.longitude>
	//   22   46:invokevirtual   #132 <Method void Bundle.putDouble(String, double)>
		}
		parcel.writeBundle(bundle);
	//   23   49:aload_1         
	//   24   50:aload_3         
	//   25   51:invokevirtual   #141 <Method void Parcel.writeBundle(Bundle)>
		parcel.writeString(c);
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:getfield        #90  <Field String c>
	//   29   59:invokevirtual   #117 <Method void Parcel.writeString(String)>
		parcel.writeInt(d.getStyle());
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:getfield        #46  <Field Typeface d>
	//   33   67:invokevirtual   #144 <Method int Typeface.getStyle()>
	//   34   70:invokevirtual   #148 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(e);
	//   35   73:aload_1         
	//   36   74:aload_0         
	//   37   75:getfield        #86  <Field float e>
	//   38   78:invokevirtual   #152 <Method void Parcel.writeFloat(float)>
		parcel.writeInt(f);
	//   39   81:aload_1         
	//   40   82:aload_0         
	//   41   83:getfield        #48  <Field int f>
	//   42   86:invokevirtual   #148 <Method void Parcel.writeInt(int)>
		parcel.writeInt(g);
	//   43   89:aload_1         
	//   44   90:aload_0         
	//   45   91:getfield        #50  <Field int g>
	//   46   94:invokevirtual   #148 <Method void Parcel.writeInt(int)>
		parcel.writeInt(h);
	//   47   97:aload_1         
	//   48   98:aload_0         
	//   49   99:getfield        #52  <Field int h>
	//   50  102:invokevirtual   #148 <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   51  105:aload_1         
	//   52  106:aload_0         
	//   53  107:getfield        #55  <Field int i>
	//   54  110:invokevirtual   #148 <Method void Parcel.writeInt(int)>
		parcel.writeInt(k);
	//   55  113:aload_1         
	//   56  114:aload_0         
	//   57  115:getfield        #57  <Field int k>
	//   58  118:invokevirtual   #148 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(l);
	//   59  121:aload_1         
	//   60  122:aload_0         
	//   61  123:getfield        #59  <Field float l>
	//   62  126:invokevirtual   #152 <Method void Parcel.writeFloat(float)>
		if(m)
	//*  63  129:aload_0         
	//*  64  130:getfield        #61  <Field boolean m>
	//*  65  133:ifeq            141
			i1 = 1;
	//   66  136:iconst_1        
	//   67  137:istore_2        
		else
	//*  68  138:goto            143
			i1 = 0;
	//   69  141:iconst_0        
	//   70  142:istore_2        
		parcel.writeByte((byte)i1);
	//   71  143:aload_1         
	//   72  144:iload_2         
	//   73  145:int2byte        
	//   74  146:invokevirtual   #156 <Method void Parcel.writeByte(byte)>
		if(j instanceof Parcelable)
	//*  75  149:aload_0         
	//*  76  150:getfield        #78  <Field Object j>
	//*  77  153:instanceof      #6   <Class Parcelable>
	//*  78  156:ifeq            185
		{
			Bundle bundle1 = new Bundle();
	//   79  159:new             #119 <Class Bundle>
	//   80  162:dup             
	//   81  163:invokespecial   #120 <Method void Bundle()>
	//   82  166:astore_3        
			bundle1.putParcelable("obj", (Parcelable)j);
	//   83  167:aload_3         
	//   84  168:ldc1            #158 <String "obj">
	//   85  170:aload_0         
	//   86  171:getfield        #78  <Field Object j>
	//   87  174:checkcast       #6   <Class Parcelable>
	//   88  177:invokevirtual   #162 <Method void Bundle.putParcelable(String, Parcelable)>
			parcel.writeBundle(bundle1);
	//   89  180:aload_1         
	//   90  181:aload_3         
	//   91  182:invokevirtual   #141 <Method void Parcel.writeBundle(Bundle)>
		}
	//   92  185:return          
	}

	public TextOptions zIndex(float f1)
	{
		l = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #59  <Field float l>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final TextOptionsCreator CREATOR = new TextOptionsCreator();
	String a;
	private LatLng b;
	private String c;
	private Typeface d;
	private float e;
	private int f;
	private int g;
	private int h;
	private int i;
	private Object j;
	private int k;
	private float l;
	private boolean m;

	static 
	{
	//    0    0:new             #32  <Class TextOptionsCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void TextOptionsCreator()>
	//    3    7:putstatic       #37  <Field TextOptionsCreator CREATOR>
	//*   4   10:return          
	}
}
