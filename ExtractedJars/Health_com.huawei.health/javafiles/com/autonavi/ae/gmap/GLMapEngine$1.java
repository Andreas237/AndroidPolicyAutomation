// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap;

import com.amap.api.mapcore.util.hm;
import com.autonavi.amap.mapcore.maploader.AMapLoader;

// Referenced classes of package com.autonavi.ae.gmap:
//			GLMapEngine

class GLMapEngine$1
	implements Runnable
{

	public void run()
	{
		boolean flag = mRequestDestroy;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GLMapEngine this$0>
	//    2    4:getfield        #32  <Field boolean GLMapEngine.mRequestDestroy>
	//    3    7:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_70;
	//    4    8:iload_1         
	//    5    9:ifeq            70
		if(val$mapLoader == null || val$mapLoader.isFinish)
			break MISSING_BLOCK_LABEL_69;
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field AMapLoader val$mapLoader>
	//    8   16:ifnull          69
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field AMapLoader val$mapLoader>
	//   11   23:getfield        #37  <Field boolean AMapLoader.isFinish>
	//   12   26:ifne            69
		AMapLoader amaploader = val$mapLoader;
	//   13   29:aload_0         
	//   14   30:getfield        #21  <Field AMapLoader val$mapLoader>
	//   15   33:astore_2        
		amaploader;
	//   16   34:aload_2         
		JVM INSTR monitorenter ;
	//   17   35:monitorenter    
		if(!val$mapLoader.isFinish)
	//*  18   36:aload_0         
	//*  19   37:getfield        #21  <Field AMapLoader val$mapLoader>
	//*  20   40:getfield        #37  <Field boolean AMapLoader.isFinish>
	//*  21   43:ifne            61
		{
			((Object) (val$mapLoader)).notify();
	//   22   46:aload_0         
	//   23   47:getfield        #21  <Field AMapLoader val$mapLoader>
	//   24   50:invokevirtual   #40  <Method void Object.notify()>
			val$mapLoader.isFinish = true;
	//   25   53:aload_0         
	//   26   54:getfield        #21  <Field AMapLoader val$mapLoader>
	//   27   57:iconst_1        
	//   28   58:putfield        #37  <Field boolean AMapLoader.isFinish>
		}
		amaploader;
	//   29   61:aload_2         
		JVM INSTR monitorexit ;
	//   30   62:monitorexit     
		return;
	//   31   63:return          
		Exception exception;
		exception;
	//   32   64:astore_3        
	//*  33   65:aload_2         
		throw exception;
	//   34   66:monitorexit     
	//   35   67:aload_3         
	//   36   68:athrow          
		return;
	//   37   69:return          
		amaploader = val$mapLoader;
	//   38   70:aload_0         
	//   39   71:getfield        #21  <Field AMapLoader val$mapLoader>
	//   40   74:astore_2        
		if(amaploader != null)
			break MISSING_BLOCK_LABEL_137;
	//   41   75:aload_2         
	//   42   76:ifnonnull       137
		if(val$mapLoader == null || val$mapLoader.isFinish)
			break MISSING_BLOCK_LABEL_136;
	//   43   79:aload_0         
	//   44   80:getfield        #21  <Field AMapLoader val$mapLoader>
	//   45   83:ifnull          136
	//   46   86:aload_0         
	//   47   87:getfield        #21  <Field AMapLoader val$mapLoader>
	//   48   90:getfield        #37  <Field boolean AMapLoader.isFinish>
	//   49   93:ifne            136
		amaploader = val$mapLoader;
	//   50   96:aload_0         
	//   51   97:getfield        #21  <Field AMapLoader val$mapLoader>
	//   52  100:astore_2        
		amaploader;
	//   53  101:aload_2         
		JVM INSTR monitorenter ;
	//   54  102:monitorenter    
		if(!val$mapLoader.isFinish)
	//*  55  103:aload_0         
	//*  56  104:getfield        #21  <Field AMapLoader val$mapLoader>
	//*  57  107:getfield        #37  <Field boolean AMapLoader.isFinish>
	//*  58  110:ifne            128
		{
			((Object) (val$mapLoader)).notify();
	//   59  113:aload_0         
	//   60  114:getfield        #21  <Field AMapLoader val$mapLoader>
	//   61  117:invokevirtual   #40  <Method void Object.notify()>
			val$mapLoader.isFinish = true;
	//   62  120:aload_0         
	//   63  121:getfield        #21  <Field AMapLoader val$mapLoader>
	//   64  124:iconst_1        
	//   65  125:putfield        #37  <Field boolean AMapLoader.isFinish>
		}
		amaploader;
	//   66  128:aload_2         
		JVM INSTR monitorexit ;
	//   67  129:monitorexit     
		return;
	//   68  130:return          
		exception;
	//   69  131:astore_3        
	//*  70  132:aload_2         
		throw exception;
	//   71  133:monitorexit     
	//   72  134:aload_3         
	//   73  135:athrow          
		return;
	//   74  136:return          
		val$mapLoader.doRequest();
	//   75  137:aload_0         
	//   76  138:getfield        #21  <Field AMapLoader val$mapLoader>
	//   77  141:invokevirtual   #43  <Method void AMapLoader.doRequest()>
		if(val$mapLoader == null || val$mapLoader.isFinish)
			break MISSING_BLOCK_LABEL_335;
	//   78  144:aload_0         
	//   79  145:getfield        #21  <Field AMapLoader val$mapLoader>
	//   80  148:ifnull          335
	//   81  151:aload_0         
	//   82  152:getfield        #21  <Field AMapLoader val$mapLoader>
	//   83  155:getfield        #37  <Field boolean AMapLoader.isFinish>
	//   84  158:ifne            335
		amaploader = val$mapLoader;
	//   85  161:aload_0         
	//   86  162:getfield        #21  <Field AMapLoader val$mapLoader>
	//   87  165:astore_2        
		amaploader;
	//   88  166:aload_2         
		JVM INSTR monitorenter ;
	//   89  167:monitorenter    
		if(!val$mapLoader.isFinish)
	//*  90  168:aload_0         
	//*  91  169:getfield        #21  <Field AMapLoader val$mapLoader>
	//*  92  172:getfield        #37  <Field boolean AMapLoader.isFinish>
	//*  93  175:ifne            193
		{
			((Object) (val$mapLoader)).notify();
	//   94  178:aload_0         
	//   95  179:getfield        #21  <Field AMapLoader val$mapLoader>
	//   96  182:invokevirtual   #40  <Method void Object.notify()>
			val$mapLoader.isFinish = true;
	//   97  185:aload_0         
	//   98  186:getfield        #21  <Field AMapLoader val$mapLoader>
	//   99  189:iconst_1        
	//  100  190:putfield        #37  <Field boolean AMapLoader.isFinish>
		}
		amaploader;
	//  101  193:aload_2         
		JVM INSTR monitorexit ;
	//  102  194:monitorexit     
		  goto _L1
	//* 103  195:goto            203
		exception;
	//  104  198:astore_3        
	//* 105  199:aload_2         
		throw exception;
	//  106  200:monitorexit     
	//  107  201:aload_3         
	//  108  202:athrow          
_L1:
		return;
	//  109  203:return          
		Throwable throwable;
		throwable;
	//  110  204:astore_2        
		hm.c(throwable, "download Thread", "AMapLoader doRequest");
	//  111  205:aload_2         
	//  112  206:ldc1            #45  <String "download Thread">
	//  113  208:ldc1            #47  <String "AMapLoader doRequest">
	//  114  210:invokestatic    #53  <Method void hm.c(Throwable, String, String)>
		if(val$mapLoader == null || val$mapLoader.isFinish)
			break MISSING_BLOCK_LABEL_335;
	//  115  213:aload_0         
	//  116  214:getfield        #21  <Field AMapLoader val$mapLoader>
	//  117  217:ifnull          335
	//  118  220:aload_0         
	//  119  221:getfield        #21  <Field AMapLoader val$mapLoader>
	//  120  224:getfield        #37  <Field boolean AMapLoader.isFinish>
	//  121  227:ifne            335
		throwable = ((Throwable) (val$mapLoader));
	//  122  230:aload_0         
	//  123  231:getfield        #21  <Field AMapLoader val$mapLoader>
	//  124  234:astore_2        
		throwable;
	//  125  235:aload_2         
		JVM INSTR monitorenter ;
	//  126  236:monitorenter    
		if(!val$mapLoader.isFinish)
	//* 127  237:aload_0         
	//* 128  238:getfield        #21  <Field AMapLoader val$mapLoader>
	//* 129  241:getfield        #37  <Field boolean AMapLoader.isFinish>
	//* 130  244:ifne            262
		{
			((Object) (val$mapLoader)).notify();
	//  131  247:aload_0         
	//  132  248:getfield        #21  <Field AMapLoader val$mapLoader>
	//  133  251:invokevirtual   #40  <Method void Object.notify()>
			val$mapLoader.isFinish = true;
	//  134  254:aload_0         
	//  135  255:getfield        #21  <Field AMapLoader val$mapLoader>
	//  136  258:iconst_1        
	//  137  259:putfield        #37  <Field boolean AMapLoader.isFinish>
		}
		throwable;
	//  138  262:aload_2         
		JVM INSTR monitorexit ;
	//  139  263:monitorexit     
		  goto _L2
	//* 140  264:goto            272
		exception;
	//  141  267:astore_3        
	//* 142  268:aload_2         
		throw exception;
	//  143  269:monitorexit     
	//  144  270:aload_3         
	//  145  271:athrow          
_L2:
		return;
	//  146  272:return          
		exception;
	//  147  273:astore_3        
		if(val$mapLoader == null || val$mapLoader.isFinish)
			break MISSING_BLOCK_LABEL_333;
	//  148  274:aload_0         
	//  149  275:getfield        #21  <Field AMapLoader val$mapLoader>
	//  150  278:ifnull          333
	//  151  281:aload_0         
	//  152  282:getfield        #21  <Field AMapLoader val$mapLoader>
	//  153  285:getfield        #37  <Field boolean AMapLoader.isFinish>
	//  154  288:ifne            333
		throwable = ((Throwable) (val$mapLoader));
	//  155  291:aload_0         
	//  156  292:getfield        #21  <Field AMapLoader val$mapLoader>
	//  157  295:astore_2        
		throwable;
	//  158  296:aload_2         
		JVM INSTR monitorenter ;
	//  159  297:monitorenter    
		if(!val$mapLoader.isFinish)
	//* 160  298:aload_0         
	//* 161  299:getfield        #21  <Field AMapLoader val$mapLoader>
	//* 162  302:getfield        #37  <Field boolean AMapLoader.isFinish>
	//* 163  305:ifne            323
		{
			((Object) (val$mapLoader)).notify();
	//  164  308:aload_0         
	//  165  309:getfield        #21  <Field AMapLoader val$mapLoader>
	//  166  312:invokevirtual   #40  <Method void Object.notify()>
			val$mapLoader.isFinish = true;
	//  167  315:aload_0         
	//  168  316:getfield        #21  <Field AMapLoader val$mapLoader>
	//  169  319:iconst_1        
	//  170  320:putfield        #37  <Field boolean AMapLoader.isFinish>
		}
		throwable;
	//  171  323:aload_2         
		JVM INSTR monitorexit ;
	//  172  324:monitorexit     
		break MISSING_BLOCK_LABEL_333;
	//  173  325:goto            333
		exception;
	//  174  328:astore_3        
	//* 175  329:aload_2         
		throw exception;
	//  176  330:monitorexit     
	//  177  331:aload_3         
	//  178  332:athrow          
		throw exception;
	//  179  333:aload_3         
	//  180  334:athrow          
	//  181  335:return          
	}

	final GLMapEngine this$0;
	final AMapLoader val$mapLoader;

	GLMapEngine$1()
	{
		this$0 = final_glmapengine;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GLMapEngine this$0>
		val$mapLoader = AMapLoader.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AMapLoader val$mapLoader>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
