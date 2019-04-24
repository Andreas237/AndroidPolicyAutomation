// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.banner3d;

import com.startapp.android.publish.ads.banner.BannerOptions;
import java.util.List;

// Referenced classes of package com.startapp.android.publish.ads.banner.banner3d:
//			Banner3D, Banner3DFace

class Banner3D$1
	implements Runnable
{

	public void run()
	{
		if(loaded && faces.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field Banner3D this$0>
	//*   2    4:getfield        #23  <Field boolean Banner3D.loaded>
	//*   3    7:ifeq            25
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field Banner3D this$0>
	//*   6   14:getfield        #27  <Field List Banner3D.faces>
	//*   7   17:invokeinterface #33  <Method int List.size()>
	//*   8   22:ifne            26
	//*   9   25:return          
		{
			if(visible && isShown() && Banner3D.access$000(Banner3D.this))
	//*  10   26:aload_0         
	//*  11   27:getfield        #14  <Field Banner3D this$0>
	//*  12   30:getfield        #36  <Field boolean Banner3D.visible>
	//*  13   33:ifeq            112
	//*  14   36:aload_0         
	//*  15   37:getfield        #14  <Field Banner3D this$0>
	//*  16   40:invokevirtual   #40  <Method boolean Banner3D.isShown()>
	//*  17   43:ifeq            112
	//*  18   46:aload_0         
	//*  19   47:getfield        #14  <Field Banner3D this$0>
	//*  20   50:invokestatic    #44  <Method boolean Banner3D.access$000(Banner3D)>
	//*  21   53:ifeq            112
			{
				Banner3DFace banner3dface = (Banner3DFace)faces.get(getCurrentBannerIndex());
	//   22   56:aload_0         
	//   23   57:getfield        #14  <Field Banner3D this$0>
	//   24   60:getfield        #27  <Field List Banner3D.faces>
	//   25   63:aload_0         
	//   26   64:getfield        #14  <Field Banner3D this$0>
	//   27   67:invokevirtual   #47  <Method int Banner3D.getCurrentBannerIndex()>
	//   28   70:invokeinterface #51  <Method Object List.get(int)>
	//   29   75:checkcast       #53  <Class Banner3DFace>
	//   30   78:astore_3        
				Banner3D.access$100(Banner3D.this, banner3dface);
	//   31   79:aload_0         
	//   32   80:getfield        #14  <Field Banner3D this$0>
	//   33   83:aload_3         
	//   34   84:invokestatic    #57  <Method void Banner3D.access$100(Banner3D, Banner3DFace)>
				if(!addedDisplayEvent)
	//*  35   87:aload_0         
	//*  36   88:getfield        #14  <Field Banner3D this$0>
	//*  37   91:getfield        #60  <Field boolean Banner3D.addedDisplayEvent>
	//*  38   94:ifne            112
				{
					addedDisplayEvent = true;
	//   39   97:aload_0         
	//   40   98:getfield        #14  <Field Banner3D this$0>
	//   41  101:iconst_1        
	//   42  102:putfield        #60  <Field boolean Banner3D.addedDisplayEvent>
					Banner3D.access$200(Banner3D.this);
	//   43  105:aload_0         
	//   44  106:getfield        #14  <Field Banner3D this$0>
	//   45  109:invokestatic    #63  <Method void Banner3D.access$200(Banner3D)>
				}
			}
			if(rotationEnabled)
	//*  46  112:aload_0         
	//*  47  113:getfield        #14  <Field Banner3D this$0>
	//*  48  116:getfield        #66  <Field boolean Banner3D.rotationEnabled>
	//*  49  119:ifeq            167
			{
				Banner3D banner3d = Banner3D.this;
	//   50  122:aload_0         
	//   51  123:getfield        #14  <Field Banner3D this$0>
	//   52  126:astore_3        
				int j = getBannerOptions().b();
	//   53  127:aload_0         
	//   54  128:getfield        #14  <Field Banner3D this$0>
	//   55  131:invokevirtual   #70  <Method BannerOptions Banner3D.getBannerOptions()>
	//   56  134:invokevirtual   #75  <Method int BannerOptions.b()>
	//   57  137:istore_2        
				int i;
				if(!firstRotationFinished)
	//*  58  138:aload_0         
	//*  59  139:getfield        #14  <Field Banner3D this$0>
	//*  60  142:getfield        #78  <Field boolean Banner3D.firstRotationFinished>
	//*  61  145:ifne            284
					i = options.p();
	//   62  148:aload_0         
	//   63  149:getfield        #14  <Field Banner3D this$0>
	//   64  152:getfield        #82  <Field BannerOptions Banner3D.options>
	//   65  155:invokevirtual   #85  <Method int BannerOptions.p()>
	//   66  158:istore_1        
				else
	//*  67  159:aload_3         
	//*  68  160:iload_1         
	//*  69  161:iload_2         
	//*  70  162:imul            
	//*  71  163:i2f             
	//*  72  164:invokevirtual   #89  <Method void Banner3D.rotate(float)>
	//*  73  167:aload_0         
	//*  74  168:getfield        #14  <Field Banner3D this$0>
	//*  75  171:getfield        #93  <Field float Banner3D.rotation>
	//*  76  174:bipush          90
	//*  77  176:aload_0         
	//*  78  177:getfield        #14  <Field Banner3D this$0>
	//*  79  180:invokevirtual   #70  <Method BannerOptions Banner3D.getBannerOptions()>
	//*  80  183:invokevirtual   #75  <Method int BannerOptions.b()>
	//*  81  186:isub            
	//*  82  187:i2f             
	//*  83  188:fcmpl           
	//*  84  189:ifle            289
	//*  85  192:aload_0         
	//*  86  193:getfield        #14  <Field Banner3D this$0>
	//*  87  196:getfield        #93  <Field float Banner3D.rotation>
	//*  88  199:aload_0         
	//*  89  200:getfield        #14  <Field Banner3D this$0>
	//*  90  203:invokevirtual   #70  <Method BannerOptions Banner3D.getBannerOptions()>
	//*  91  206:invokevirtual   #75  <Method int BannerOptions.b()>
	//*  92  209:bipush          90
	//*  93  211:iadd            
	//*  94  212:i2f             
	//*  95  213:fcmpg           
	//*  96  214:ifge            289
	//*  97  217:aload_0         
	//*  98  218:getfield        #14  <Field Banner3D this$0>
	//*  99  221:getfield        #96  <Field boolean Banner3D.firstRotation>
	//* 100  224:ifne            289
	//* 101  227:aload_0         
	//* 102  228:getfield        #14  <Field Banner3D this$0>
	//* 103  231:getfield        #99  <Field boolean Banner3D.attachedToWindow>
	//* 104  234:ifeq            257
	//* 105  237:aload_0         
	//* 106  238:getfield        #14  <Field Banner3D this$0>
	//* 107  241:aload_0         
	//* 108  242:aload_0         
	//* 109  243:getfield        #14  <Field Banner3D this$0>
	//* 110  246:invokevirtual   #70  <Method BannerOptions Banner3D.getBannerOptions()>
	//* 111  249:invokevirtual   #102 <Method int BannerOptions.c()>
	//* 112  252:i2l             
	//* 113  253:invokevirtual   #106 <Method boolean Banner3D.postDelayed(Runnable, long)>
	//* 114  256:pop             
	//* 115  257:aload_0         
	//* 116  258:getfield        #14  <Field Banner3D this$0>
	//* 117  261:iconst_0        
	//* 118  262:putfield        #109 <Field boolean Banner3D.rotating>
	//* 119  265:aload_0         
	//* 120  266:getfield        #14  <Field Banner3D this$0>
	//* 121  269:invokevirtual   #112 <Method int Banner3D.getNextBannerIndex()>
	//* 122  272:ifne            25
	//* 123  275:aload_0         
	//* 124  276:getfield        #14  <Field Banner3D this$0>
	//* 125  279:iconst_0        
	//* 126  280:putfield        #96  <Field boolean Banner3D.firstRotation>
	//* 127  283:return          
					i = 1;
	//  128  284:iconst_1        
	//  129  285:istore_1        
				banner3d.rotate(i * j);
			}
			if(rotation > (float)(90 - getBannerOptions().b()) && rotation < (float)(getBannerOptions().b() + 90) && !firstRotation)
			{
				if(attachedToWindow)
					postDelayed(((Runnable) (this)), getBannerOptions().c());
				rotating = false;
			} else
	//* 130  286:goto            159
			{
				postDelayed(((Runnable) (this)), getBannerOptions().a());
	//  131  289:aload_0         
	//  132  290:getfield        #14  <Field Banner3D this$0>
	//  133  293:aload_0         
	//  134  294:aload_0         
	//  135  295:getfield        #14  <Field Banner3D this$0>
	//  136  298:invokevirtual   #70  <Method BannerOptions Banner3D.getBannerOptions()>
	//  137  301:invokevirtual   #115 <Method int BannerOptions.a()>
	//  138  304:i2l             
	//  139  305:invokevirtual   #106 <Method boolean Banner3D.postDelayed(Runnable, long)>
	//  140  308:pop             
				rotating = true;
	//  141  309:aload_0         
	//  142  310:getfield        #14  <Field Banner3D this$0>
	//  143  313:iconst_1        
	//  144  314:putfield        #109 <Field boolean Banner3D.rotating>
			}
			if(getNextBannerIndex() == 0)
			{
				firstRotation = false;
				return;
			}
		}
	//* 145  317:goto            265
	}

	final Banner3D this$0;

	Banner3D$1()
	{
		this$0 = Banner3D.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Banner3D this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
