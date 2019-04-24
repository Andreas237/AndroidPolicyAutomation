// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Point;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.amap.api.maps.model:
//			LatLng

public class BuildingOverlayOptions
{

	public BuildingOverlayOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #22  <Field int a>
		b = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #24  <Field int b>
		c = 0xff888888;
	//    8   14:aload_0         
	//    9   15:ldc1            #25  <Int 0xff888888>
	//   10   17:putfield        #27  <Field int c>
		d = 0xff888888;
	//   11   20:aload_0         
	//   12   21:ldc1            #25  <Int 0xff888888>
	//   13   23:putfield        #29  <Field int d>
		e = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #31  <Field boolean e>
		g = ((List) (new ArrayList()));
	//   17   31:aload_0         
	//   18   32:new             #33  <Class ArrayList>
	//   19   35:dup             
	//   20   36:invokespecial   #34  <Method void ArrayList()>
	//   21   39:putfield        #36  <Field List g>
	//   22   42:return          
	}

	public int getBuildingHeight()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int a>
	//    2    4:ireturn         
	}

	public int getBuildingHeightScale()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int b>
	//    2    4:ireturn         
	}

	public List getBuildingLatlngs()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List g>
	//    2    4:areturn         
	}

	public int getBuildingSideColor()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int d>
	//    2    4:ireturn         
	}

	public int getBuildingTopColor()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int c>
	//    2    4:ireturn         
	}

	public int[] getPoints()
	{
		if(g != null && g.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field List g>
	//*   2    4:ifnull          119
	//*   3    7:aload_0         
	//*   4    8:getfield        #36  <Field List g>
	//*   5   11:invokeinterface #53  <Method int List.size()>
	//*   6   16:ifle            119
		{
			int ai[] = new int[g.size() * 2];
	//    7   19:aload_0         
	//    8   20:getfield        #36  <Field List g>
	//    9   23:invokeinterface #53  <Method int List.size()>
	//   10   28:iconst_2        
	//   11   29:imul            
	//   12   30:newarray        int[]
	//   13   32:astore          4
			int j = 0;
	//   14   34:iconst_0        
	//   15   35:istore_2        
			for(int i = 0; i < g.size(); i++)
	//*  16   36:iconst_0        
	//*  17   37:istore_1        
	//*  18   38:iload_1         
	//*  19   39:aload_0         
	//*  20   40:getfield        #36  <Field List g>
	//*  21   43:invokeinterface #53  <Method int List.size()>
	//*  22   48:icmpge          116
			{
				Object obj = ((Object) ((LatLng)g.get(i)));
	//   23   51:aload_0         
	//   24   52:getfield        #36  <Field List g>
	//   25   55:iload_1         
	//   26   56:invokeinterface #57  <Method Object List.get(int)>
	//   27   61:checkcast       #59  <Class LatLng>
	//   28   64:astore          5
				obj = ((Object) (VirtualEarthProjection.latLongToPixels(((LatLng) (obj)).latitude, ((LatLng) (obj)).longitude, 20)));
	//   29   66:aload           5
	//   30   68:getfield        #63  <Field double LatLng.latitude>
	//   31   71:aload           5
	//   32   73:getfield        #66  <Field double LatLng.longitude>
	//   33   76:bipush          20
	//   34   78:invokestatic    #72  <Method Point VirtualEarthProjection.latLongToPixels(double, double, int)>
	//   35   81:astore          5
				int k = j + 1;
	//   36   83:iload_2         
	//   37   84:iconst_1        
	//   38   85:iadd            
	//   39   86:istore_3        
				ai[j] = ((Point) (obj)).x;
	//   40   87:aload           4
	//   41   89:iload_2         
	//   42   90:aload           5
	//   43   92:getfield        #77  <Field int Point.x>
	//   44   95:iastore         
				j = k + 1;
	//   45   96:iload_3         
	//   46   97:iconst_1        
	//   47   98:iadd            
	//   48   99:istore_2        
				ai[k] = ((Point) (obj)).y;
	//   49  100:aload           4
	//   50  102:iload_3         
	//   51  103:aload           5
	//   52  105:getfield        #80  <Field int Point.y>
	//   53  108:iastore         
			}

	//   54  109:iload_1         
	//   55  110:iconst_1        
	//   56  111:iadd            
	//   57  112:istore_1        
	//*  58  113:goto            38
			return ai;
	//   59  116:aload           4
	//   60  118:areturn         
		} else
		{
			return new int[0];
	//   61  119:iconst_0        
	//   62  120:newarray        int[]
	//   63  122:areturn         
		}
	}

	public float getZIndex()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field float f>
	//    2    4:freturn         
	}

	public boolean isVisible()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean e>
	//    2    4:ireturn         
	}

	public BuildingOverlayOptions setBuildingHeight(int i)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public BuildingOverlayOptions setBuildingHeightScale(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public BuildingOverlayOptions setBuildingLatlngs(List list)
	{
		g = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field List g>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public BuildingOverlayOptions setBuildingSideColor(int i)
	{
		d = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int d>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public BuildingOverlayOptions setBuildingTopColor(int i)
	{
		c = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setVisible(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field boolean e>
	//    3    5:return          
	}

	public void setZIndex(float f1)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #84  <Field float f>
	//    3    5:return          
	}

	private int a;
	private int b;
	private int c;
	private int d;
	private boolean e;
	private float f;
	private List g;
}
