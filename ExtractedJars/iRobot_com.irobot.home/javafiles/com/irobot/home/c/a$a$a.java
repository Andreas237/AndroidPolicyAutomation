// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.c;

import android.support.v4.f.j;
import com.irobot.a.g;
import com.irobot.a.k;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.DiscoveredBluetoothAsset;
import com.irobot.core.DiscoveryType;
import com.irobot.home.IRobotApplication;
import com.irobot.home.h.b;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.d;
import com.irobot.home.util.o;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Queue;

// Referenced classes of package com.irobot.home.c:
//			a

private class a$a$a
	implements com.irobot.a.g.g
{

	public void o(g g1, com.irobot.a.d d1)
	{
		com.irobot.home.util.o.c("AltDiscScan", "Connected, identifying robot.");
	//    0    0:ldc1            #27  <String "AltDiscScan">
	//    1    2:ldc1            #29  <String "Connected, identifying robot.">
	//    2    4:invokestatic    #35  <Method void o.c(String, String)>
		g1.l();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #40  <Method void g.l()>
	//    5   11:return          
	}

	public void p(g g1, com.irobot.a.d d1)
	{
		if(com.irobot.home.c.a.a.a(a).booleanValue() && d1 == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field a$a a>
	//*   2    4:invokestatic    #44  <Method Boolean a$a.a(a$a)>
	//*   3    7:invokevirtual   #50  <Method boolean Boolean.booleanValue()>
	//*   4   10:ifeq            299
	//*   5   13:aload_2         
	//*   6   14:ifnonnull       299
		{
			if(g1 != null && g1.i() != null && g1.a() != null)
	//*   7   17:aload_1         
	//*   8   18:ifnull          255
	//*   9   21:aload_1         
	//*  10   22:invokevirtual   #54  <Method String g.i()>
	//*  11   25:ifnull          255
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #56  <Method String g.a()>
	//*  14   32:ifnull          255
			{
				d1 = ((com.irobot.a.d) (AssetId.assetIdForString(g1.i())));
	//   15   35:aload_1         
	//   16   36:invokevirtual   #54  <Method String g.i()>
	//   17   39:invokestatic    #62  <Method AssetId AssetId.assetIdForString(String)>
	//   18   42:astore_2        
				AssetInfo assetinfo = AssetInfo.create(((AssetId) (d1)), com.irobot.home.c.a.a(a.b, g1.d()), com.irobot.home.c.a.a(a.b, g1), g1.a(), "", "");
	//   19   43:aload_2         
	//   20   44:aload_0         
	//   21   45:getfield        #16  <Field a$a a>
	//   22   48:getfield        #66  <Field a com.irobot.home.c.a$a.b>
	//   23   51:aload_1         
	//   24   52:invokevirtual   #69  <Method String g.d()>
	//   25   55:invokestatic    #72  <Method String a.a(a, String)>
	//   26   58:aload_0         
	//   27   59:getfield        #16  <Field a$a a>
	//   28   62:getfield        #66  <Field a com.irobot.home.c.a$a.b>
	//   29   65:aload_1         
	//   30   66:invokestatic    #75  <Method String a.a(a, g)>
	//   31   69:aload_1         
	//   32   70:invokevirtual   #56  <Method String g.a()>
	//   33   73:ldc1            #77  <String "">
	//   34   75:ldc1            #77  <String "">
	//   35   77:invokestatic    #83  <Method AssetInfo AssetInfo.create(AssetId, String, String, String, String, String)>
	//   36   80:astore_3        
				a.b.a.put(((Object) (((AssetId) (d1)).getId())), ((Object) (g1)));
	//   37   81:aload_0         
	//   38   82:getfield        #16  <Field a$a a>
	//   39   85:getfield        #66  <Field a com.irobot.home.c.a$a.b>
	//   40   88:getfield        #86  <Field Map a.a>
	//   41   91:aload_2         
	//   42   92:invokevirtual   #89  <Method String AssetId.getId()>
	//   43   95:aload_1         
	//   44   96:invokeinterface #95  <Method Object Map.put(Object, Object)>
	//   45  101:pop             
				g1 = ((g) (new StringBuilder()));
	//   46  102:new             #97  <Class StringBuilder>
	//   47  105:dup             
	//   48  106:invokespecial   #98  <Method void StringBuilder()>
	//   49  109:astore_1        
				((StringBuilder) (g1)).append("Discovered robot with asset id ");
	//   50  110:aload_1         
	//   51  111:ldc1            #100 <String "Discovered robot with asset id ">
	//   52  113:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   53  116:pop             
				((StringBuilder) (g1)).append(((AssetId) (d1)).getId());
	//   54  117:aload_1         
	//   55  118:aload_2         
	//   56  119:invokevirtual   #89  <Method String AssetId.getId()>
	//   57  122:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
	//   58  125:pop             
				com.irobot.home.util.o.c("AltDiscScan", ((StringBuilder) (g1)).toString());
	//   59  126:ldc1            #27  <String "AltDiscScan">
	//   60  128:aload_1         
	//   61  129:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   62  132:invokestatic    #35  <Method void o.c(String, String)>
				g1 = ((g) ((IRobotApplication)com.irobot.home.c.a.a(a.b).get()));
	//   63  135:aload_0         
	//   64  136:getfield        #16  <Field a$a a>
	//   65  139:getfield        #66  <Field a com.irobot.home.c.a$a.b>
	//   66  142:invokestatic    #110 <Method WeakReference a.a(a)>
	//   67  145:invokevirtual   #116 <Method Object WeakReference.get()>
	//   68  148:checkcast       #118 <Class IRobotApplication>
	//   69  151:astore_1        
				if(g1 != null)
	//*  70  152:aload_1         
	//*  71  153:ifnull          201
				{
					d d2 = new d(assetinfo);
	//   72  156:new             #120 <Class d>
	//   73  159:dup             
	//   74  160:aload_3         
	//   75  161:invokespecial   #123 <Method void d(AssetInfo)>
	//   76  164:astore          4
					if(((IRobotApplication) (g1)).h().b(((AssetId) (d1)).getId()))
	//*  77  166:aload_1         
	//*  78  167:invokevirtual   #127 <Method IRobotModel IRobotApplication.h()>
	//*  79  170:aload_2         
	//*  80  171:invokevirtual   #89  <Method String AssetId.getId()>
	//*  81  174:invokevirtual   #132 <Method boolean IRobotModel.b(String)>
	//*  82  177:ifeq            192
						((IRobotApplication) (g1)).h().d(((com.irobot.home.model.a) (d2)));
	//   83  180:aload_1         
	//   84  181:invokevirtual   #127 <Method IRobotModel IRobotApplication.h()>
	//   85  184:aload           4
	//   86  186:invokevirtual   #135 <Method void IRobotModel.d(com.irobot.home.model.a)>
					else
	//*  87  189:goto            201
						((IRobotApplication) (g1)).h().a(((com.irobot.home.model.a) (d2)));
	//   88  192:aload_1         
	//   89  193:invokevirtual   #127 <Method IRobotModel IRobotApplication.h()>
	//   90  196:aload           4
	//   91  198:invokevirtual   #137 <Method void IRobotModel.a(com.irobot.home.model.a)>
				}
				if(com.irobot.home.c.a.a.b(a).peek() != null)
	//*  92  201:aload_0         
	//*  93  202:getfield        #16  <Field a$a a>
	//*  94  205:invokestatic    #140 <Method Queue com.irobot.home.c.a$a.b(a$a)>
	//*  95  208:invokeinterface #145 <Method Object Queue.peek()>
	//*  96  213:ifnull          255
				{
					g1 = ((g) (DiscoveredBluetoothAsset.create(assetinfo)));
	//   97  216:aload_3         
	//   98  217:invokestatic    #150 <Method DiscoveredBluetoothAsset DiscoveredBluetoothAsset.create(AssetInfo)>
	//   99  220:astore_1        
					if(g1 != null)
	//* 100  221:aload_1         
	//* 101  222:ifnull          255
						((b)((j)com.irobot.home.c.a.a.b(a).peek()).b).a(DiscoveryType.Altadena, ((com.irobot.core.DiscoveredAsset) (g1)));
	//  102  225:aload_0         
	//  103  226:getfield        #16  <Field a$a a>
	//  104  229:invokestatic    #140 <Method Queue com.irobot.home.c.a$a.b(a$a)>
	//  105  232:invokeinterface #145 <Method Object Queue.peek()>
	//  106  237:checkcast       #152 <Class j>
	//  107  240:getfield        #155 <Field Object j.b>
	//  108  243:checkcast       #157 <Class b>
	//  109  246:getstatic       #163 <Field DiscoveryType DiscoveryType.Altadena>
	//  110  249:aload_1         
	//  111  250:invokeinterface #166 <Method void b.a(DiscoveryType, com.irobot.core.DiscoveredAsset)>
				}
			}
			com.irobot.home.util.o.c("AltDiscScan", "Disconnected, starting next scan");
	//  112  255:ldc1            #27  <String "AltDiscScan">
	//  113  257:ldc1            #168 <String "Disconnected, starting next scan">
	//  114  259:invokestatic    #35  <Method void o.c(String, String)>
			synchronized(com.irobot.home.c.a.a.c(a))
	//* 115  262:aload_0         
	//* 116  263:getfield        #16  <Field a$a a>
	//* 117  266:invokestatic    #171 <Method Object a$a.c(a$a)>
	//* 118  269:astore_1        
	//* 119  270:aload_1         
	//* 120  271:monitorenter    
			{
				com.irobot.home.c.a.a.a(a, Boolean.valueOf(false));
	//  121  272:aload_0         
	//  122  273:getfield        #16  <Field a$a a>
	//  123  276:iconst_0        
	//  124  277:invokestatic    #175 <Method Boolean Boolean.valueOf(boolean)>
	//  125  280:invokestatic    #178 <Method Boolean a$a.a(a$a, Boolean)>
	//  126  283:pop             
			}
	//  127  284:aload_1         
	//  128  285:monitorexit     
			com.irobot.home.c.a.a.d(a);
	//  129  286:aload_0         
	//  130  287:getfield        #16  <Field a$a a>
	//  131  290:invokestatic    #180 <Method void com.irobot.home.c.a$a.d(a$a)>
			return;
	//  132  293:return          
		} else
	//* 133  294:astore_2        
	//* 134  295:aload_1         
	//* 135  296:monitorexit     
	//* 136  297:aload_2         
	//* 137  298:athrow          
		{
			return;
	//  138  299:return          
		}
		d1;
		g1;
		JVM INSTR monitorexit ;
		throw d1;
	}

	public void q(g g1, com.irobot.a.d d1)
	{
		com.irobot.home.util.o.e("AltDiscScan", "Bluetooth error while doing deep discovery.");
	//    0    0:ldc1            #27  <String "AltDiscScan">
	//    1    2:ldc1            #183 <String "Bluetooth error while doing deep discovery.">
	//    2    4:invokestatic    #186 <Method void o.e(String, String)>
		if(com.irobot.home.c.a.a.a(a).booleanValue())
	//*   3    7:aload_0         
	//*   4    8:getfield        #16  <Field a$a a>
	//*   5   11:invokestatic    #44  <Method Boolean a$a.a(a$a)>
	//*   6   14:invokevirtual   #50  <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            77
		{
			com.irobot.home.c.a.a.a(a, true);
	//    8   20:aload_0         
	//    9   21:getfield        #16  <Field a$a a>
	//   10   24:iconst_1        
	//   11   25:invokestatic    #189 <Method boolean a$a.a(a$a, boolean)>
	//   12   28:pop             
			synchronized(com.irobot.home.c.a.a.c(a))
	//*  13   29:aload_0         
	//*  14   30:getfield        #16  <Field a$a a>
	//*  15   33:invokestatic    #171 <Method Object a$a.c(a$a)>
	//*  16   36:astore_1        
	//*  17   37:aload_1         
	//*  18   38:monitorenter    
			{
				com.irobot.home.c.a.a.a(a, Boolean.valueOf(false));
	//   19   39:aload_0         
	//   20   40:getfield        #16  <Field a$a a>
	//   21   43:iconst_0        
	//   22   44:invokestatic    #175 <Method Boolean Boolean.valueOf(boolean)>
	//   23   47:invokestatic    #178 <Method Boolean a$a.a(a$a, Boolean)>
	//   24   50:pop             
			}
	//   25   51:aload_1         
	//   26   52:monitorexit     
			com.irobot.home.c.a.a.e(a).d();
	//   27   53:aload_0         
	//   28   54:getfield        #16  <Field a$a a>
	//   29   57:invokestatic    #192 <Method k a$a.e(a$a)>
	//   30   60:invokevirtual   #196 <Method void k.d()>
			com.irobot.home.c.a.a.f(a);
	//   31   63:aload_0         
	//   32   64:getfield        #16  <Field a$a a>
	//   33   67:invokestatic    #200 <Method boolean a$a.f(a$a)>
	//   34   70:pop             
			return;
	//   35   71:return          
		} else
	//*  36   72:astore_2        
	//*  37   73:aload_1         
	//*  38   74:monitorexit     
	//*  39   75:aload_2         
	//*  40   76:athrow          
		{
			return;
	//   41   77:return          
		}
		d1;
		g1;
		JVM INSTR monitorexit ;
		throw d1;
	}

	public void r(g g1, com.irobot.a.d d1)
	{
		g1.k();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #204 <Method void g.k()>
	//    2    4:return          
	}

	final a.a a;

	private a$a$a(a.a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field a$a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	a$a$a(a.a a1, a._cls1 _pcls1)
	{
		this(a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void a$a$a(a$a)>
	//    3    5:return          
	}
}
