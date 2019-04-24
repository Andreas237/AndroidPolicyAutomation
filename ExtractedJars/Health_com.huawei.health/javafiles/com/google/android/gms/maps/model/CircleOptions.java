// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzc, LatLng

public final class CircleOptions extends zza
{

	public CircleOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		zzbpg = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #37  <Field LatLng zzbpg>
		zzbph = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #39  <Field double zzbph>
		mStrokeWidth = 10F;
	//    8   14:aload_0         
	//    9   15:ldc1            #40  <Float 10F>
	//   10   17:putfield        #42  <Field float mStrokeWidth>
		mStrokeColor = 0xff000000;
	//   11   20:aload_0         
	//   12   21:ldc1            #43  <Int 0xff000000>
	//   13   23:putfield        #45  <Field int mStrokeColor>
		mFillColor = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #47  <Field int mFillColor>
		zzbpi = 0.0F;
	//   17   31:aload_0         
	//   18   32:fconst_0        
	//   19   33:putfield        #49  <Field float zzbpi>
		zzbpj = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #51  <Field boolean zzbpj>
		zzbpk = false;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #53  <Field boolean zzbpk>
		zzbpl = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #55  <Field List zzbpl>
	//   29   51:return          
	}

	CircleOptions(LatLng latlng, double d, float f, int i, int j, float f1, 
			boolean flag, boolean flag1, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void zza()>
		zzbpg = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #37  <Field LatLng zzbpg>
		zzbph = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #39  <Field double zzbph>
		mStrokeWidth = 10F;
	//    8   14:aload_0         
	//    9   15:ldc1            #40  <Float 10F>
	//   10   17:putfield        #42  <Field float mStrokeWidth>
		mStrokeColor = 0xff000000;
	//   11   20:aload_0         
	//   12   21:ldc1            #43  <Int 0xff000000>
	//   13   23:putfield        #45  <Field int mStrokeColor>
		mFillColor = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #47  <Field int mFillColor>
		zzbpi = 0.0F;
	//   17   31:aload_0         
	//   18   32:fconst_0        
	//   19   33:putfield        #49  <Field float zzbpi>
		zzbpj = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #51  <Field boolean zzbpj>
		zzbpk = false;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #53  <Field boolean zzbpk>
		zzbpl = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #55  <Field List zzbpl>
		zzbpg = latlng;
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:putfield        #37  <Field LatLng zzbpg>
		zzbph = d;
	//   32   56:aload_0         
	//   33   57:dload_2         
	//   34   58:putfield        #39  <Field double zzbph>
		mStrokeWidth = f;
	//   35   61:aload_0         
	//   36   62:fload           4
	//   37   64:putfield        #42  <Field float mStrokeWidth>
		mStrokeColor = i;
	//   38   67:aload_0         
	//   39   68:iload           5
	//   40   70:putfield        #45  <Field int mStrokeColor>
		mFillColor = j;
	//   41   73:aload_0         
	//   42   74:iload           6
	//   43   76:putfield        #47  <Field int mFillColor>
		zzbpi = f1;
	//   44   79:aload_0         
	//   45   80:fload           7
	//   46   82:putfield        #49  <Field float zzbpi>
		zzbpj = flag;
	//   47   85:aload_0         
	//   48   86:iload           8
	//   49   88:putfield        #51  <Field boolean zzbpj>
		zzbpk = flag1;
	//   50   91:aload_0         
	//   51   92:iload           9
	//   52   94:putfield        #53  <Field boolean zzbpk>
		zzbpl = list;
	//   53   97:aload_0         
	//   54   98:aload           10
	//   55  100:putfield        #55  <Field List zzbpl>
	//   56  103:return          
	}

	public CircleOptions center(LatLng latlng)
	{
		zzbpg = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field LatLng zzbpg>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CircleOptions clickable(boolean flag)
	{
		zzbpk = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean zzbpk>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CircleOptions fillColor(int i)
	{
		mFillColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int mFillColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public LatLng getCenter()
	{
		return zzbpg;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field LatLng zzbpg>
	//    2    4:areturn         
	}

	public int getFillColor()
	{
		return mFillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mFillColor>
	//    2    4:ireturn         
	}

	public double getRadius()
	{
		return zzbph;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field double zzbph>
	//    2    4:dreturn         
	}

	public int getStrokeColor()
	{
		return mStrokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mStrokeColor>
	//    2    4:ireturn         
	}

	public List getStrokePattern()
	{
		return zzbpl;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List zzbpl>
	//    2    4:areturn         
	}

	public float getStrokeWidth()
	{
		return mStrokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float mStrokeWidth>
	//    2    4:freturn         
	}

	public float getZIndex()
	{
		return zzbpi;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field float zzbpi>
	//    2    4:freturn         
	}

	public boolean isClickable()
	{
		return zzbpk;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean zzbpk>
	//    2    4:ireturn         
	}

	public boolean isVisible()
	{
		return zzbpj;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean zzbpj>
	//    2    4:ireturn         
	}

	public CircleOptions radius(double d)
	{
		zzbph = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #39  <Field double zzbph>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CircleOptions strokeColor(int i)
	{
		mStrokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int mStrokeColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CircleOptions strokePattern(List list)
	{
		zzbpl = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field List zzbpl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CircleOptions strokeWidth(float f)
	{
		mStrokeWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #42  <Field float mStrokeWidth>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CircleOptions visible(boolean flag)
	{
		zzbpj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field boolean zzbpj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzc.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #97  <Method void com.google.android.gms.maps.model.zzc.zza(CircleOptions, Parcel, int)>
	//    4    6:return          
	}

	public CircleOptions zIndex(float f)
	{
		zzbpi = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #49  <Field float zzbpi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzc();
	private int mFillColor;
	private int mStrokeColor;
	private float mStrokeWidth;
	private LatLng zzbpg;
	private double zzbph;
	private float zzbpi;
	private boolean zzbpj;
	private boolean zzbpk;
	private List zzbpl;

	static 
	{
	//    0    0:new             #28  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzc()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
