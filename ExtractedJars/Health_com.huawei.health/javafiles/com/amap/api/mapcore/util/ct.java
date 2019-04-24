// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.RemoteException;
import com.amap.api.maps.model.BuildingOverlayOptions;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.AMapNativeBuildingRenderer;
import com.autonavi.amap.mapcore.MapConfig;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			cy, dd, q

public class ct
	implements cy, dd
{

	public ct(q q1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		a = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #33  <Long -1L>
	//    4    8:putfield        #36  <Field long a>
		d = ((List) (new ArrayList()));
	//    5   11:aload_0         
	//    6   12:new             #38  <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #39  <Method void ArrayList()>
	//    9   19:putfield        #41  <Field List d>
		f = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #43  <Field boolean f>
		try
		{
			b = q1;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #45  <Field q b>
			if(c == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #47  <Field BuildingOverlayOptions c>
	//*  18   36:ifnonnull       210
			{
				c = new BuildingOverlayOptions();
	//   19   39:aload_0         
	//   20   40:new             #49  <Class BuildingOverlayOptions>
	//   21   43:dup             
	//   22   44:invokespecial   #50  <Method void BuildingOverlayOptions()>
	//   23   47:putfield        #47  <Field BuildingOverlayOptions c>
				c.setVisible(true);
	//   24   50:aload_0         
	//   25   51:getfield        #47  <Field BuildingOverlayOptions c>
	//   26   54:iconst_1        
	//   27   55:invokevirtual   #54  <Method void BuildingOverlayOptions.setVisible(boolean)>
				q1 = ((q) (new ArrayList()));
	//   28   58:new             #38  <Class ArrayList>
	//   29   61:dup             
	//   30   62:invokespecial   #39  <Method void ArrayList()>
	//   31   65:astore_1        
				((List) (q1)).add(((Object) (new LatLng(84.900000000000006D, -179.90000000000001D))));
	//   32   66:aload_1         
	//   33   67:new             #56  <Class LatLng>
	//   34   70:dup             
	//   35   71:ldc2w           #57  <Double 84.900000000000006D>
	//   36   74:ldc2w           #59  <Double -179.90000000000001D>
	//   37   77:invokespecial   #63  <Method void LatLng(double, double)>
	//   38   80:invokeinterface #69  <Method boolean List.add(Object)>
	//   39   85:pop             
				((List) (q1)).add(((Object) (new LatLng(84.900000000000006D, 179.90000000000001D))));
	//   40   86:aload_1         
	//   41   87:new             #56  <Class LatLng>
	//   42   90:dup             
	//   43   91:ldc2w           #57  <Double 84.900000000000006D>
	//   44   94:ldc2w           #70  <Double 179.90000000000001D>
	//   45   97:invokespecial   #63  <Method void LatLng(double, double)>
	//   46  100:invokeinterface #69  <Method boolean List.add(Object)>
	//   47  105:pop             
				((List) (q1)).add(((Object) (new LatLng(-84.900000000000006D, 179.90000000000001D))));
	//   48  106:aload_1         
	//   49  107:new             #56  <Class LatLng>
	//   50  110:dup             
	//   51  111:ldc2w           #72  <Double -84.900000000000006D>
	//   52  114:ldc2w           #70  <Double 179.90000000000001D>
	//   53  117:invokespecial   #63  <Method void LatLng(double, double)>
	//   54  120:invokeinterface #69  <Method boolean List.add(Object)>
	//   55  125:pop             
				((List) (q1)).add(((Object) (new LatLng(-84.900000000000006D, -179.90000000000001D))));
	//   56  126:aload_1         
	//   57  127:new             #56  <Class LatLng>
	//   58  130:dup             
	//   59  131:ldc2w           #72  <Double -84.900000000000006D>
	//   60  134:ldc2w           #59  <Double -179.90000000000001D>
	//   61  137:invokespecial   #63  <Method void LatLng(double, double)>
	//   62  140:invokeinterface #69  <Method boolean List.add(Object)>
	//   63  145:pop             
				c.setBuildingLatlngs(((List) (q1)));
	//   64  146:aload_0         
	//   65  147:getfield        #47  <Field BuildingOverlayOptions c>
	//   66  150:aload_1         
	//   67  151:invokevirtual   #77  <Method BuildingOverlayOptions BuildingOverlayOptions.setBuildingLatlngs(List)>
	//   68  154:pop             
				c.setBuildingTopColor(0xffff0000);
	//   69  155:aload_0         
	//   70  156:getfield        #47  <Field BuildingOverlayOptions c>
	//   71  159:ldc1            #78  <Int 0xffff0000>
	//   72  161:invokevirtual   #82  <Method BuildingOverlayOptions BuildingOverlayOptions.setBuildingTopColor(int)>
	//   73  164:pop             
				c.setBuildingSideColor(0xff444444);
	//   74  165:aload_0         
	//   75  166:getfield        #47  <Field BuildingOverlayOptions c>
	//   76  169:ldc1            #83  <Int 0xff444444>
	//   77  171:invokevirtual   #86  <Method BuildingOverlayOptions BuildingOverlayOptions.setBuildingSideColor(int)>
	//   78  174:pop             
				c.setVisible(true);
	//   79  175:aload_0         
	//   80  176:getfield        #47  <Field BuildingOverlayOptions c>
	//   81  179:iconst_1        
	//   82  180:invokevirtual   #54  <Method void BuildingOverlayOptions.setVisible(boolean)>
				c.setZIndex(1.0F);
	//   83  183:aload_0         
	//   84  184:getfield        #47  <Field BuildingOverlayOptions c>
	//   85  187:fconst_1        
	//   86  188:invokevirtual   #90  <Method void BuildingOverlayOptions.setZIndex(float)>
				d.add(((Object) (c)));
	//   87  191:aload_0         
	//   88  192:getfield        #41  <Field List d>
	//   89  195:aload_0         
	//   90  196:getfield        #47  <Field BuildingOverlayOptions c>
	//   91  199:invokeinterface #69  <Method boolean List.add(Object)>
	//   92  204:pop             
				a(true);
	//   93  205:aload_0         
	//   94  206:iconst_1        
	//   95  207:invokespecial   #92  <Method void a(boolean)>
			}
			return;
	//   96  210:return          
		}
		// Misplaced declaration of an exception variable
		catch(q q1)
	//*  97  211:astore_1        
		{
			((Exception) (q1)).printStackTrace();
	//   98  212:aload_1         
	//   99  213:invokevirtual   #95  <Method void Exception.printStackTrace()>
		}
	//  100  216:return          
	}

	private void a(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!flag)
			break MISSING_BLOCK_LABEL_24;
	//    2    2:iload_1         
	//    3    3:ifeq            24
		d.set(0, ((Object) (c)));
	//    4    6:aload_0         
	//    5    7:getfield        #41  <Field List d>
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:getfield        #47  <Field BuildingOverlayOptions c>
	//    9   15:invokeinterface #100 <Method Object List.set(int, Object)>
	//   10   20:pop             
		break MISSING_BLOCK_LABEL_67;
	//   11   21:goto            67
		d.removeAll(((java.util.Collection) (e)));
	//   12   24:aload_0         
	//   13   25:getfield        #41  <Field List d>
	//   14   28:aload_0         
	//   15   29:getfield        #102 <Field List e>
	//   16   32:invokeinterface #106 <Method boolean List.removeAll(java.util.Collection)>
	//   17   37:pop             
		d.set(0, ((Object) (c)));
	//   18   38:aload_0         
	//   19   39:getfield        #41  <Field List d>
	//   20   42:iconst_0        
	//   21   43:aload_0         
	//   22   44:getfield        #47  <Field BuildingOverlayOptions c>
	//   23   47:invokeinterface #100 <Method Object List.set(int, Object)>
	//   24   52:pop             
		d.addAll(((java.util.Collection) (e)));
	//   25   53:aload_0         
	//   26   54:getfield        #41  <Field List d>
	//   27   57:aload_0         
	//   28   58:getfield        #102 <Field List e>
	//   29   61:invokeinterface #109 <Method boolean List.addAll(java.util.Collection)>
	//   30   66:pop             
		i = true;
	//   31   67:aload_0         
	//   32   68:iconst_1        
	//   33   69:putfield        #111 <Field boolean i>
		this;
	//   34   72:aload_0         
		JVM INSTR monitorexit ;
	//   35   73:monitorexit     
		  goto _L1
	//*  36   74:goto            82
		Object obj;
		obj;
	//   37   77:astore_2        
	//*  38   78:aload_0         
		throw obj;
	//   39   79:monitorexit     
	//   40   80:aload_2         
	//   41   81:athrow          
_L1:
		return;
	//   42   82:return          
		obj;
	//   43   83:astore_2        
		((Exception) (obj)).printStackTrace();
	//   44   84:aload_2         
	//   45   85:invokevirtual   #95  <Method void Exception.printStackTrace()>
		return;
	//   46   88:return          
	}

	public void a(BuildingOverlayOptions buildingoverlayoptions)
	{
		if(buildingoverlayoptions == null)
			break MISSING_BLOCK_LABEL_26;
	//    0    0:aload_1         
	//    1    1:ifnull          26
		this;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		c = buildingoverlayoptions;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #47  <Field BuildingOverlayOptions c>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		  goto _L1
	//*   9   13:goto            21
		buildingoverlayoptions;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw buildingoverlayoptions;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
_L1:
		a(true);
	//   15   21:aload_0         
	//   16   22:iconst_1        
	//   17   23:invokespecial   #92  <Method void a(boolean)>
	//   18   26:return          
	}

	public void a(MapConfig mapconfig)
		throws RemoteException
	{
		if(mapconfig == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(a == -1L) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field long a>
	//    5    9:ldc2w           #33  <Long -1L>
	//    6   12:lcmp            
	//    7   13:ifeq            133
_L1:
		this;
	//    8   16:aload_0         
		JVM INSTR monitorenter ;
	//    9   17:monitorenter    
		if(a == -1L)
			break MISSING_BLOCK_LABEL_123;
	//   10   18:aload_0         
	//   11   19:getfield        #36  <Field long a>
	//   12   22:ldc2w           #33  <Long -1L>
	//   13   25:lcmp            
	//   14   26:ifeq            123
		if(!i)
			break MISSING_BLOCK_LABEL_92;
	//   15   29:aload_0         
	//   16   30:getfield        #111 <Field boolean i>
	//   17   33:ifeq            92
		AMapNativeBuildingRenderer.nativeClearBuildingOptions(a);
	//   18   36:aload_0         
	//   19   37:getfield        #36  <Field long a>
	//   20   40:invokestatic    #121 <Method void AMapNativeBuildingRenderer.nativeClearBuildingOptions(long)>
		int j = 0;
	//   21   43:iconst_0        
	//   22   44:istore_2        
_L4:
		if(j >= d.size())
			break; /* Loop/switch isn't completed */
	//   23   45:iload_2         
	//   24   46:aload_0         
	//   25   47:getfield        #41  <Field List d>
	//   26   50:invokeinterface #125 <Method int List.size()>
	//   27   55:icmpge          87
		BuildingOverlayOptions buildingoverlayoptions = (BuildingOverlayOptions)d.get(j);
	//   28   58:aload_0         
	//   29   59:getfield        #41  <Field List d>
	//   30   62:iload_2         
	//   31   63:invokeinterface #129 <Method Object List.get(int)>
	//   32   68:checkcast       #49  <Class BuildingOverlayOptions>
	//   33   71:astore_3        
		AMapNativeBuildingRenderer.addBuildingOptions(a, buildingoverlayoptions);
	//   34   72:aload_0         
	//   35   73:getfield        #36  <Field long a>
	//   36   76:aload_3         
	//   37   77:invokestatic    #133 <Method void AMapNativeBuildingRenderer.addBuildingOptions(long, BuildingOverlayOptions)>
		j++;
	//   38   80:iload_2         
	//   39   81:iconst_1        
	//   40   82:iadd            
	//   41   83:istore_2        
		if(true) goto _L4; else goto _L3
	//   42   84:goto            45
_L3:
		i = false;
	//   43   87:aload_0         
	//   44   88:iconst_0        
	//   45   89:putfield        #111 <Field boolean i>
		AMapNativeBuildingRenderer.render(a, mapconfig.getViewMatrix(), mapconfig.getProjectionMatrix(), mapconfig.getSX(), mapconfig.getSY(), mapconfig.getSZ(), mapconfig.getCurTileIds());
	//   46   92:aload_0         
	//   47   93:getfield        #36  <Field long a>
	//   48   96:aload_1         
	//   49   97:invokevirtual   #139 <Method float[] MapConfig.getViewMatrix()>
	//   50  100:aload_1         
	//   51  101:invokevirtual   #142 <Method float[] MapConfig.getProjectionMatrix()>
	//   52  104:aload_1         
	//   53  105:invokevirtual   #145 <Method int MapConfig.getSX()>
	//   54  108:aload_1         
	//   55  109:invokevirtual   #148 <Method int MapConfig.getSY()>
	//   56  112:aload_1         
	//   57  113:invokevirtual   #152 <Method float MapConfig.getSZ()>
	//   58  116:aload_1         
	//   59  117:invokevirtual   #156 <Method int[] MapConfig.getCurTileIds()>
	//   60  120:invokestatic    #160 <Method void AMapNativeBuildingRenderer.render(long, float[], float[], int, int, float, int[])>
		this;
	//   61  123:aload_0         
		JVM INSTR monitorexit ;
	//   62  124:monitorexit     
		  goto _L5
	//*  63  125:goto            147
		mapconfig;
	//   64  128:astore_1        
	//*  65  129:aload_0         
		throw mapconfig;
	//   66  130:monitorexit     
	//   67  131:aload_1         
	//   68  132:athrow          
_L2:
		a = AMapNativeBuildingRenderer.nativeCreate();
	//   69  133:aload_0         
	//   70  134:invokestatic    #164 <Method long AMapNativeBuildingRenderer.nativeCreate()>
	//   71  137:putfield        #36  <Field long a>
		return;
	//   72  140:return          
		mapconfig;
	//   73  141:astore_1        
		((Exception) (mapconfig)).printStackTrace();
	//   74  142:aload_1         
	//   75  143:invokevirtual   #95  <Method void Exception.printStackTrace()>
		return;
	//   76  146:return          
_L5:
	//   77  147:return          
	}

	public void a(List list)
	{
		if(list == null || list.size() <= 0)
			break MISSING_BLOCK_LABEL_35;
	//    0    0:aload_1         
	//    1    1:ifnull          35
	//    2    4:aload_1         
	//    3    5:invokeinterface #125 <Method int List.size()>
	//    4   10:ifle            35
		this;
	//    5   13:aload_0         
		JVM INSTR monitorenter ;
	//    6   14:monitorenter    
		e = list;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #102 <Field List e>
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		  goto _L1
	//*  12   22:goto            30
		list;
	//   13   25:astore_1        
	//*  14   26:aload_0         
		throw list;
	//   15   27:monitorexit     
	//   16   28:aload_1         
	//   17   29:athrow          
_L1:
		a(false);
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:invokespecial   #92  <Method void a(boolean)>
	//   21   35:return          
	}

	public boolean a()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public List b()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field List e>
	//    2    4:areturn         
	}

	public boolean c()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public BuildingOverlayOptions d()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		BuildingOverlayOptions buildingoverlayoptions = c;
	//    2    2:aload_0         
	//    3    3:getfield        #47  <Field BuildingOverlayOptions c>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return buildingoverlayoptions;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public void destroy()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(a != -1L)
	//*   2    2:aload_0         
	//*   3    3:getfield        #36  <Field long a>
	//*   4    6:ldc2w           #33  <Long -1L>
	//*   5    9:lcmp            
	//*   6   10:ifeq            53
		{
			AMapNativeBuildingRenderer.nativeDestory(a);
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field long a>
	//    9   17:invokestatic    #176 <Method void AMapNativeBuildingRenderer.nativeDestory(long)>
			if(d != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #41  <Field List d>
	//*  12   24:ifnull          36
				d.clear();
	//   13   27:aload_0         
	//   14   28:getfield        #41  <Field List d>
	//   15   31:invokeinterface #179 <Method void List.clear()>
			e = null;
	//   16   36:aload_0         
	//   17   37:aconst_null     
	//   18   38:putfield        #102 <Field List e>
			c = null;
	//   19   41:aload_0         
	//   20   42:aconst_null     
	//   21   43:putfield        #47  <Field BuildingOverlayOptions c>
			a = -1L;
	//   22   46:aload_0         
	//   23   47:ldc2w           #33  <Long -1L>
	//   24   50:putfield        #36  <Field long a>
		}
		this;
	//   25   53:aload_0         
		JVM INSTR monitorexit ;
	//   26   54:monitorexit     
		return;
	//   27   55:return          
		Exception exception;
		exception;
	//   28   56:astore_1        
	//*  29   57:aload_0         
		throw exception;
	//   30   58:monitorexit     
	//   31   59:aload_1         
	//   32   60:athrow          
	}

	public boolean equalsRemote(IOverlay ioverlay)
		throws RemoteException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getId()
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #185 <Field String g>
	//*   2    4:ifnonnull       20
			g = b.a("Building");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field q b>
	//    6   12:ldc1            #187 <String "Building">
	//    7   14:invokevirtual   #192 <Method String q.a(String)>
	//    8   17:putfield        #185 <Field String g>
		return g;
	//    9   20:aload_0         
	//   10   21:getfield        #185 <Field String g>
	//   11   24:areturn         
	}

	public float getZIndex()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field float h>
	//    2    4:freturn         
	}

	public int hashCodeRemote()
		throws RemoteException
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isAboveMaskLayer()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVisible()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean f>
	//    2    4:ireturn         
	}

	public void remove()
		throws RemoteException
	{
	//    0    0:return          
	}

	public void setAboveMaskLayer(boolean flag)
	{
	//    0    0:return          
	}

	public void setVisible(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean f>
	//    3    5:return          
	}

	public void setZIndex(float f1)
	{
		h = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #195 <Field float h>
		b.d();
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field q b>
	//    5    9:invokevirtual   #202 <Method void q.d()>
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		c.setZIndex(h);
	//    8   14:aload_0         
	//    9   15:getfield        #47  <Field BuildingOverlayOptions c>
	//   10   18:aload_0         
	//   11   19:getfield        #195 <Field float h>
	//   12   22:invokevirtual   #90  <Method void BuildingOverlayOptions.setZIndex(float)>
		this;
	//   13   25:aload_0         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		  goto _L1
	//*  15   27:goto            35
		Object obj;
		obj;
	//   16   30:astore_2        
	//*  17   31:aload_0         
		throw obj;
	//   18   32:monitorexit     
	//   19   33:aload_2         
	//   20   34:athrow          
_L1:
		a(true);
	//   21   35:aload_0         
	//   22   36:iconst_1        
	//   23   37:invokespecial   #92  <Method void a(boolean)>
		return;
	//   24   40:return          
		obj;
	//   25   41:astore_2        
		((Exception) (obj)).printStackTrace();
	//   26   42:aload_2         
	//   27   43:invokevirtual   #95  <Method void Exception.printStackTrace()>
		return;
	//   28   46:return          
	}

	long a;
	private q b;
	private BuildingOverlayOptions c;
	private List d;
	private List e;
	private boolean f;
	private String g;
	private float h;
	private boolean i;
}
