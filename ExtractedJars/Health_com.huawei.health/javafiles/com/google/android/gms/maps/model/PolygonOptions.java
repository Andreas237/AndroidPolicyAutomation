// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzk, LatLng

public final class PolygonOptions extends zza
{

	public PolygonOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void zza()>
		mStrokeWidth = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #38  <Float 10F>
	//    4    7:putfield        #40  <Field float mStrokeWidth>
		mStrokeColor = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #41  <Int 0xff000000>
	//    7   13:putfield        #43  <Field int mStrokeColor>
		mFillColor = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #45  <Field int mFillColor>
		zzbpi = 0.0F;
	//   11   21:aload_0         
	//   12   22:fconst_0        
	//   13   23:putfield        #47  <Field float zzbpi>
		zzbpj = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #49  <Field boolean zzbpj>
		zzbpN = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #51  <Field boolean zzbpN>
		zzbpk = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #53  <Field boolean zzbpk>
		zzbpO = 0;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #55  <Field int zzbpO>
		zzbpl = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #57  <Field List zzbpl>
		zzbpL = ((List) (new ArrayList()));
	//   29   51:aload_0         
	//   30   52:new             #59  <Class ArrayList>
	//   31   55:dup             
	//   32   56:invokespecial   #60  <Method void ArrayList()>
	//   33   59:putfield        #62  <Field List zzbpL>
		zzbpM = ((List) (new ArrayList()));
	//   34   62:aload_0         
	//   35   63:new             #59  <Class ArrayList>
	//   36   66:dup             
	//   37   67:invokespecial   #60  <Method void ArrayList()>
	//   38   70:putfield        #64  <Field List zzbpM>
	//   39   73:return          
	}

	PolygonOptions(List list, List list1, float f, int i, int j, float f1, boolean flag, 
			boolean flag1, boolean flag2, int k, List list2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void zza()>
		mStrokeWidth = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #38  <Float 10F>
	//    4    7:putfield        #40  <Field float mStrokeWidth>
		mStrokeColor = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #41  <Int 0xff000000>
	//    7   13:putfield        #43  <Field int mStrokeColor>
		mFillColor = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #45  <Field int mFillColor>
		zzbpi = 0.0F;
	//   11   21:aload_0         
	//   12   22:fconst_0        
	//   13   23:putfield        #47  <Field float zzbpi>
		zzbpj = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #49  <Field boolean zzbpj>
		zzbpN = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #51  <Field boolean zzbpN>
		zzbpk = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #53  <Field boolean zzbpk>
		zzbpO = 0;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #55  <Field int zzbpO>
		zzbpl = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #57  <Field List zzbpl>
		zzbpL = list;
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:putfield        #62  <Field List zzbpL>
		zzbpM = list1;
	//   32   56:aload_0         
	//   33   57:aload_2         
	//   34   58:putfield        #64  <Field List zzbpM>
		mStrokeWidth = f;
	//   35   61:aload_0         
	//   36   62:fload_3         
	//   37   63:putfield        #40  <Field float mStrokeWidth>
		mStrokeColor = i;
	//   38   66:aload_0         
	//   39   67:iload           4
	//   40   69:putfield        #43  <Field int mStrokeColor>
		mFillColor = j;
	//   41   72:aload_0         
	//   42   73:iload           5
	//   43   75:putfield        #45  <Field int mFillColor>
		zzbpi = f1;
	//   44   78:aload_0         
	//   45   79:fload           6
	//   46   81:putfield        #47  <Field float zzbpi>
		zzbpj = flag;
	//   47   84:aload_0         
	//   48   85:iload           7
	//   49   87:putfield        #49  <Field boolean zzbpj>
		zzbpN = flag1;
	//   50   90:aload_0         
	//   51   91:iload           8
	//   52   93:putfield        #51  <Field boolean zzbpN>
		zzbpk = flag2;
	//   53   96:aload_0         
	//   54   97:iload           9
	//   55   99:putfield        #53  <Field boolean zzbpk>
		zzbpO = k;
	//   56  102:aload_0         
	//   57  103:iload           10
	//   58  105:putfield        #55  <Field int zzbpO>
		zzbpl = list2;
	//   59  108:aload_0         
	//   60  109:aload           11
	//   61  111:putfield        #57  <Field List zzbpl>
	//   62  114:return          
	}

	public PolygonOptions add(LatLng latlng)
	{
		zzbpL.add(((Object) (latlng)));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List zzbpL>
	//    2    4:aload_1         
	//    3    5:invokeinterface #75  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public transient PolygonOptions add(LatLng alatlng[])
	{
		zzbpL.addAll(((java.util.Collection) (Arrays.asList(((Object []) (alatlng))))));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List zzbpL>
	//    2    4:aload_1         
	//    3    5:invokestatic    #82  <Method List Arrays.asList(Object[])>
	//    4    8:invokeinterface #86  <Method boolean List.addAll(java.util.Collection)>
	//    5   13:pop             
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public PolygonOptions addAll(Iterable iterable)
	{
		LatLng latlng;
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); zzbpL.add(((Object) (latlng))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #93  <Method Iterator Iterable.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            40
			latlng = (LatLng)((Iterator) (iterable)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #103 <Method Object Iterator.next()>
	//    8   22:checkcast       #105 <Class LatLng>
	//    9   25:astore_2        

	//   10   26:aload_0         
	//   11   27:getfield        #62  <Field List zzbpL>
	//   12   30:aload_2         
	//   13   31:invokeinterface #75  <Method boolean List.add(Object)>
	//   14   36:pop             
	//*  15   37:goto            7
		return this;
	//   16   40:aload_0         
	//   17   41:areturn         
	}

	public PolygonOptions addHole(Iterable iterable)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #59  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void ArrayList()>
	//    3    7:astore_2        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); arraylist.add(((Object) ((LatLng)((Iterator) (iterable)).next()))));
	//    4    8:aload_1         
	//    5    9:invokeinterface #93  <Method Iterator Iterable.iterator()>
	//    6   14:astore_1        
	//    7   15:aload_1         
	//    8   16:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            41
	//   10   24:aload_2         
	//   11   25:aload_1         
	//   12   26:invokeinterface #103 <Method Object Iterator.next()>
	//   13   31:checkcast       #105 <Class LatLng>
	//   14   34:invokevirtual   #108 <Method boolean ArrayList.add(Object)>
	//   15   37:pop             
	//*  16   38:goto            15
		zzbpM.add(((Object) (arraylist)));
	//   17   41:aload_0         
	//   18   42:getfield        #64  <Field List zzbpM>
	//   19   45:aload_2         
	//   20   46:invokeinterface #75  <Method boolean List.add(Object)>
	//   21   51:pop             
		return this;
	//   22   52:aload_0         
	//   23   53:areturn         
	}

	public PolygonOptions clickable(boolean flag)
	{
		zzbpk = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean zzbpk>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolygonOptions fillColor(int i)
	{
		mFillColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int mFillColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolygonOptions geodesic(boolean flag)
	{
		zzbpN = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field boolean zzbpN>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public int getFillColor()
	{
		return mFillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mFillColor>
	//    2    4:ireturn         
	}

	public List getHoles()
	{
		return zzbpM;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List zzbpM>
	//    2    4:areturn         
	}

	public List getPoints()
	{
		return zzbpL;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field List zzbpL>
	//    2    4:areturn         
	}

	public int getStrokeColor()
	{
		return mStrokeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mStrokeColor>
	//    2    4:ireturn         
	}

	public int getStrokeJointType()
	{
		return zzbpO;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int zzbpO>
	//    2    4:ireturn         
	}

	public List getStrokePattern()
	{
		return zzbpl;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field List zzbpl>
	//    2    4:areturn         
	}

	public float getStrokeWidth()
	{
		return mStrokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float mStrokeWidth>
	//    2    4:freturn         
	}

	public float getZIndex()
	{
		return zzbpi;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float zzbpi>
	//    2    4:freturn         
	}

	public boolean isClickable()
	{
		return zzbpk;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean zzbpk>
	//    2    4:ireturn         
	}

	public boolean isGeodesic()
	{
		return zzbpN;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean zzbpN>
	//    2    4:ireturn         
	}

	public boolean isVisible()
	{
		return zzbpj;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean zzbpj>
	//    2    4:ireturn         
	}

	public PolygonOptions strokeColor(int i)
	{
		mStrokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int mStrokeColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolygonOptions strokeJointType(int i)
	{
		zzbpO = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int zzbpO>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolygonOptions strokePattern(List list)
	{
		zzbpl = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field List zzbpl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolygonOptions strokeWidth(float f)
	{
		mStrokeWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #40  <Field float mStrokeWidth>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PolygonOptions visible(boolean flag)
	{
		zzbpj = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean zzbpj>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzk.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #145 <Method void com.google.android.gms.maps.model.zzk.zza(PolygonOptions, Parcel, int)>
	//    4    6:return          
	}

	public PolygonOptions zIndex(float f)
	{
		zzbpi = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #47  <Field float zzbpi>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	List zzJP()
	{
		return zzbpM;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field List zzbpM>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzk();
	private int mFillColor;
	private int mStrokeColor;
	private float mStrokeWidth;
	private final List zzbpL;
	private final List zzbpM;
	private boolean zzbpN;
	private int zzbpO;
	private float zzbpi;
	private boolean zzbpj;
	private boolean zzbpk;
	private List zzbpl;

	static 
	{
	//    0    0:new             #30  <Class zzk>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zzk()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
