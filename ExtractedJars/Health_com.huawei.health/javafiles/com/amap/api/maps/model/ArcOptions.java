// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.*;

// Referenced classes of package com.amap.api.maps.model:
//			ArcOptionsCreator, LatLng

public final class ArcOptions
	implements Parcelable
{

	public ArcOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		e = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <Float 10F>
	//    4    7:putfield        #35  <Field float e>
		f = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #36  <Int 0xff000000>
	//    7   13:putfield        #38  <Field int f>
		g = 0.0F;
	//    8   16:aload_0         
	//    9   17:fconst_0        
	//   10   18:putfield        #40  <Field float g>
		h = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #42  <Field boolean h>
	//   14   26:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public LatLng getEnd()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field LatLng d>
	//    2    4:areturn         
	}

	public LatLng getPassed()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field LatLng c>
	//    2    4:areturn         
	}

	public LatLng getStart()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field LatLng b>
	//    2    4:areturn         
	}

	public int getStrokeColor()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int f>
	//    2    4:ireturn         
	}

	public float getStrokeWidth()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field float e>
	//    2    4:freturn         
	}

	public float getZIndex()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float g>
	//    2    4:freturn         
	}

	public boolean isVisible()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field boolean h>
	//    2    4:ireturn         
	}

	public ArcOptions point(LatLng latlng, LatLng latlng1, LatLng latlng2)
	{
		b = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field LatLng b>
		c = latlng1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #51  <Field LatLng c>
		d = latlng2;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #48  <Field LatLng d>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public ArcOptions strokeColor(int i)
	{
		f = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int f>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ArcOptions strokeWidth(float f1)
	{
		e = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #35  <Field float e>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ArcOptions visible(boolean flag)
	{
		h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field boolean h>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #72  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void Bundle()>
	//    3    7:astore_3        
		if(b != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #54  <Field LatLng b>
	//*   6   12:ifnull          41
		{
			bundle.putDouble("startlat", b.latitude);
	//    7   15:aload_3         
	//    8   16:ldc1            #75  <String "startlat">
	//    9   18:aload_0         
	//   10   19:getfield        #54  <Field LatLng b>
	//   11   22:getfield        #81  <Field double LatLng.latitude>
	//   12   25:invokevirtual   #85  <Method void Bundle.putDouble(String, double)>
			bundle.putDouble("startlng", b.longitude);
	//   13   28:aload_3         
	//   14   29:ldc1            #87  <String "startlng">
	//   15   31:aload_0         
	//   16   32:getfield        #54  <Field LatLng b>
	//   17   35:getfield        #90  <Field double LatLng.longitude>
	//   18   38:invokevirtual   #85  <Method void Bundle.putDouble(String, double)>
		}
		if(c != null)
	//*  19   41:aload_0         
	//*  20   42:getfield        #51  <Field LatLng c>
	//*  21   45:ifnull          74
		{
			bundle.putDouble("passedlat", c.latitude);
	//   22   48:aload_3         
	//   23   49:ldc1            #92  <String "passedlat">
	//   24   51:aload_0         
	//   25   52:getfield        #51  <Field LatLng c>
	//   26   55:getfield        #81  <Field double LatLng.latitude>
	//   27   58:invokevirtual   #85  <Method void Bundle.putDouble(String, double)>
			bundle.putDouble("passedlng", c.longitude);
	//   28   61:aload_3         
	//   29   62:ldc1            #94  <String "passedlng">
	//   30   64:aload_0         
	//   31   65:getfield        #51  <Field LatLng c>
	//   32   68:getfield        #90  <Field double LatLng.longitude>
	//   33   71:invokevirtual   #85  <Method void Bundle.putDouble(String, double)>
		}
		if(d != null)
	//*  34   74:aload_0         
	//*  35   75:getfield        #48  <Field LatLng d>
	//*  36   78:ifnull          107
		{
			bundle.putDouble("endlat", d.latitude);
	//   37   81:aload_3         
	//   38   82:ldc1            #96  <String "endlat">
	//   39   84:aload_0         
	//   40   85:getfield        #48  <Field LatLng d>
	//   41   88:getfield        #81  <Field double LatLng.latitude>
	//   42   91:invokevirtual   #85  <Method void Bundle.putDouble(String, double)>
			bundle.putDouble("endlng", d.longitude);
	//   43   94:aload_3         
	//   44   95:ldc1            #98  <String "endlng">
	//   45   97:aload_0         
	//   46   98:getfield        #48  <Field LatLng d>
	//   47  101:getfield        #90  <Field double LatLng.longitude>
	//   48  104:invokevirtual   #85  <Method void Bundle.putDouble(String, double)>
		}
		parcel.writeBundle(bundle);
	//   49  107:aload_1         
	//   50  108:aload_3         
	//   51  109:invokevirtual   #104 <Method void Parcel.writeBundle(Bundle)>
		parcel.writeFloat(e);
	//   52  112:aload_1         
	//   53  113:aload_0         
	//   54  114:getfield        #35  <Field float e>
	//   55  117:invokevirtual   #108 <Method void Parcel.writeFloat(float)>
		parcel.writeInt(f);
	//   56  120:aload_1         
	//   57  121:aload_0         
	//   58  122:getfield        #38  <Field int f>
	//   59  125:invokevirtual   #112 <Method void Parcel.writeInt(int)>
		parcel.writeFloat(g);
	//   60  128:aload_1         
	//   61  129:aload_0         
	//   62  130:getfield        #40  <Field float g>
	//   63  133:invokevirtual   #108 <Method void Parcel.writeFloat(float)>
		if(h)
	//*  64  136:aload_0         
	//*  65  137:getfield        #42  <Field boolean h>
	//*  66  140:ifeq            148
			i = 1;
	//   67  143:iconst_1        
	//   68  144:istore_2        
		else
	//*  69  145:goto            150
			i = 0;
	//   70  148:iconst_0        
	//   71  149:istore_2        
		parcel.writeByte((byte)i);
	//   72  150:aload_1         
	//   73  151:iload_2         
	//   74  152:int2byte        
	//   75  153:invokevirtual   #116 <Method void Parcel.writeByte(byte)>
		parcel.writeString(a);
	//   76  156:aload_1         
	//   77  157:aload_0         
	//   78  158:getfield        #118 <Field String a>
	//   79  161:invokevirtual   #122 <Method void Parcel.writeString(String)>
	//   80  164:return          
	}

	public ArcOptions zIndex(float f1)
	{
		g = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #40  <Field float g>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final ArcOptionsCreator CREATOR = new ArcOptionsCreator();
	String a;
	private LatLng b;
	private LatLng c;
	private LatLng d;
	private float e;
	private int f;
	private float g;
	private boolean h;

	static 
	{
	//    0    0:new             #25  <Class ArcOptionsCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void ArcOptionsCreator()>
	//    3    7:putstatic       #30  <Field ArcOptionsCreator CREATOR>
	//*   4   10:return          
	}
}
