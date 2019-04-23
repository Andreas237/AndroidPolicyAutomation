// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.craftar:
//			ImplCraftARCamera, CLog, CameraThread, ConfCamera

class ImplCraftARCamera$1
	implements aramsTask
{

	public void onDone()
	{
		if(ImplCraftARCamera.access$200(ImplCraftARCamera.this) && !val$requestedFocus[0].equals("continuous-picture") && !val$requestedFocus[0].equals("continuous-video"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ImplCraftARCamera this$0>
	//*   2    4:invokestatic    #29  <Method boolean ImplCraftARCamera.access$200(ImplCraftARCamera)>
	//*   3    7:ifeq            64
	//*   4   10:aload_0         
	//*   5   11:getfield        #21  <Field String[] val$requestedFocus>
	//*   6   14:iconst_0        
	//*   7   15:aaload          
	//*   8   16:ldc1            #31  <String "continuous-picture">
	//*   9   18:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  10   21:ifne            64
	//*  11   24:aload_0         
	//*  12   25:getfield        #21  <Field String[] val$requestedFocus>
	//*  13   28:iconst_0        
	//*  14   29:aaload          
	//*  15   30:ldc1            #39  <String "continuous-video">
	//*  16   32:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*  17   35:ifne            64
		{
			CLog.d("startFocusing");
	//   18   38:ldc1            #41  <String "startFocusing">
	//   19   40:invokestatic    #47  <Method void CLog.d(String)>
			ImplCraftARCamera.access$300(ImplCraftARCamera.this).setAutoFocus(true, 3000);
	//   20   43:aload_0         
	//   21   44:getfield        #19  <Field ImplCraftARCamera this$0>
	//   22   47:invokestatic    #51  <Method CameraThread ImplCraftARCamera.access$300(ImplCraftARCamera)>
	//   23   50:iconst_1        
	//   24   51:sipush          3000
	//   25   54:invokevirtual   #57  <Method void CameraThread.setAutoFocus(boolean, int)>
			triggerAutoFocus();
	//   26   57:aload_0         
	//   27   58:getfield        #19  <Field ImplCraftARCamera this$0>
	//   28   61:invokevirtual   #60  <Method void ImplCraftARCamera.triggerAutoFocus()>
		}
	//   29   64:return          
	}

	public void updateCameraParams(android.hardware.Camera.Parameters parameters)
	{
		if(mSupportedFlashModes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ImplCraftARCamera this$0>
	//*   2    4:getfield        #68  <Field List ImplCraftARCamera.mSupportedFlashModes>
	//*   3    7:ifnonnull       21
			mSupportedFlashModes = parameters.getSupportedFlashModes();
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field ImplCraftARCamera this$0>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #74  <Method List android.hardware.Camera$Parameters.getSupportedFlashModes()>
	//    8   18:putfield        #68  <Field List ImplCraftARCamera.mSupportedFlashModes>
		ImplCraftARCamera.access$002(ImplCraftARCamera.this, parameters.getSupportedPictureSizes());
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field ImplCraftARCamera this$0>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #77  <Method List android.hardware.Camera$Parameters.getSupportedPictureSizes()>
	//   13   29:invokestatic    #81  <Method List ImplCraftARCamera.access$002(ImplCraftARCamera, List)>
	//   14   32:pop             
		android.hardware.Camera.Size size = (android.hardware.Camera.Size)ImplCraftARCamera.access$000(ImplCraftARCamera.this).get(0);
	//   15   33:aload_0         
	//   16   34:getfield        #19  <Field ImplCraftARCamera this$0>
	//   17   37:invokestatic    #85  <Method List ImplCraftARCamera.access$000(ImplCraftARCamera)>
	//   18   40:iconst_0        
	//   19   41:invokeinterface #91  <Method Object List.get(int)>
	//   20   46:checkcast       #93  <Class android.hardware.Camera$Size>
	//   21   49:astore_3        
		Iterator iterator = ImplCraftARCamera.access$000(ImplCraftARCamera.this).iterator();
	//   22   50:aload_0         
	//   23   51:getfield        #19  <Field ImplCraftARCamera this$0>
	//   24   54:invokestatic    #85  <Method List ImplCraftARCamera.access$000(ImplCraftARCamera)>
	//   25   57:invokeinterface #97  <Method Iterator List.iterator()>
	//   26   62:astore          5
		android.hardware.Camera.Size size1;
		do
		{
			size1 = size;
	//   27   64:aload_3         
	//   28   65:astore          4
			if(!iterator.hasNext())
				break;
	//   29   67:aload           5
	//   30   69:invokeinterface #103 <Method boolean Iterator.hasNext()>
	//   31   74:ifeq            126
			size1 = (android.hardware.Camera.Size)iterator.next();
	//   32   77:aload           5
	//   33   79:invokeinterface #107 <Method Object Iterator.next()>
	//   34   84:checkcast       #93  <Class android.hardware.Camera$Size>
	//   35   87:astore          4
			if(size1.width == 320)
	//*  36   89:aload           4
	//*  37   91:getfield        #111 <Field int android.hardware.Camera$Size.width>
	//*  38   94:sipush          320
	//*  39   97:icmpne          103
				break;
	//   40  100:goto            126
			if(size1.width < 320)
	//*  41  103:aload           4
	//*  42  105:getfield        #111 <Field int android.hardware.Camera$Size.width>
	//*  43  108:sipush          320
	//*  44  111:icmpge          120
			{
				size1 = size;
	//   45  114:aload_3         
	//   46  115:astore          4
				break;
	//   47  117:goto            126
			}
			size = size1;
	//   48  120:aload           4
	//   49  122:astore_3        
		} while(true);
	//   50  123:goto            64
		if(size1.width == 320)
	//*  51  126:aload           4
	//*  52  128:getfield        #111 <Field int android.hardware.Camera$Size.width>
	//*  53  131:sipush          320
	//*  54  134:icmpne          146
			parameters.setJpegQuality(75);
	//   55  137:aload_1         
	//   56  138:bipush          75
	//   57  140:invokevirtual   #115 <Method void android.hardware.Camera$Parameters.setJpegQuality(int)>
		else
	//*  58  143:goto            152
			parameters.setJpegQuality(95);
	//   59  146:aload_1         
	//   60  147:bipush          95
	//   61  149:invokevirtual   #115 <Method void android.hardware.Camera$Parameters.setJpegQuality(int)>
		parameters.setPictureSize(size1.width, size1.height);
	//   62  152:aload_1         
	//   63  153:aload           4
	//   64  155:getfield        #111 <Field int android.hardware.Camera$Size.width>
	//   65  158:aload           4
	//   66  160:getfield        #118 <Field int android.hardware.Camera$Size.height>
	//   67  163:invokevirtual   #122 <Method void android.hardware.Camera$Parameters.setPictureSize(int, int)>
		if(Build.MODEL.matches("Nexus 5"))
	//*  68  166:getstatic       #128 <Field String Build.MODEL>
	//*  69  169:ldc1            #130 <String "Nexus 5">
	//*  70  171:invokevirtual   #134 <Method boolean String.matches(String)>
	//*  71  174:ifeq            183
		{
			CLog.d("Ignoring set autofocus mode for this model.");
	//   72  177:ldc1            #136 <String "Ignoring set autofocus mode for this model.">
	//   73  179:invokestatic    #47  <Method void CLog.d(String)>
			return;
	//   74  182:return          
		}
		if(Build.MANUFACTURER.matches("LGE") && (Build.MODEL.matches("Nexus 5X") || Build.MODEL.matches("Nexus 6P")))
	//*  75  183:getstatic       #139 <Field String Build.MANUFACTURER>
	//*  76  186:ldc1            #141 <String "LGE">
	//*  77  188:invokevirtual   #134 <Method boolean String.matches(String)>
	//*  78  191:ifeq            253
	//*  79  194:getstatic       #128 <Field String Build.MODEL>
	//*  80  197:ldc1            #143 <String "Nexus 5X">
	//*  81  199:invokevirtual   #134 <Method boolean String.matches(String)>
	//*  82  202:ifne            216
	//*  83  205:getstatic       #128 <Field String Build.MODEL>
	//*  84  208:ldc1            #145 <String "Nexus 6P">
	//*  85  210:invokevirtual   #134 <Method boolean String.matches(String)>
	//*  86  213:ifeq            253
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   87  216:new             #147 <Class StringBuilder>
	//   88  219:dup             
	//   89  220:invokespecial   #148 <Method void StringBuilder()>
	//   90  223:astore_3        
			stringbuilder.append("Using FOCUS_MODE_AUTO for ");
	//   91  224:aload_3         
	//   92  225:ldc1            #150 <String "Using FOCUS_MODE_AUTO for ">
	//   93  227:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   94  230:pop             
			stringbuilder.append(Build.MODEL);
	//   95  231:aload_3         
	//   96  232:getstatic       #128 <Field String Build.MODEL>
	//   97  235:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   98  238:pop             
			CLog.d(stringbuilder.toString());
	//   99  239:aload_3         
	//  100  240:invokevirtual   #158 <Method String StringBuilder.toString()>
	//  101  243:invokestatic    #47  <Method void CLog.d(String)>
			parameters.setFocusMode("auto");
	//  102  246:aload_1         
	//  103  247:ldc1            #160 <String "auto">
	//  104  249:invokevirtual   #163 <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
			return;
	//  105  252:return          
		}
		parameters.setFocusMode("fixed");
	//  106  253:aload_1         
	//  107  254:ldc1            #165 <String "fixed">
	//  108  256:invokevirtual   #163 <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
		if(ImplCraftARCamera.access$100(ImplCraftARCamera.this).getPackageManager().hasSystemFeature("android.hardware.camera.autofocus"))
	//* 109  259:aload_0         
	//* 110  260:getfield        #19  <Field ImplCraftARCamera this$0>
	//* 111  263:invokestatic    #169 <Method Context ImplCraftARCamera.access$100(ImplCraftARCamera)>
	//* 112  266:invokevirtual   #175 <Method PackageManager Context.getPackageManager()>
	//* 113  269:ldc1            #177 <String "android.hardware.camera.autofocus">
	//* 114  271:invokevirtual   #182 <Method boolean PackageManager.hasSystemFeature(String)>
	//* 115  274:ifeq            386
		{
			List list = parameters.getSupportedFocusModes();
	//  116  277:aload_1         
	//  117  278:invokevirtual   #185 <Method List android.hardware.Camera$Parameters.getSupportedFocusModes()>
	//  118  281:astore          5
			Object obj1 = null;
	//  119  283:aconst_null     
	//  120  284:astore          4
			int i = 0;
	//  121  286:iconst_0        
	//  122  287:istore_2        
			Object obj;
			do
			{
				obj = ((Object) (obj1));
	//  123  288:aload           4
	//  124  290:astore_3        
				if(i >= ConfCamera.autoFocusModes.length)
					break;
	//  125  291:iload_2         
	//  126  292:getstatic       #190 <Field String[] ConfCamera.autoFocusModes>
	//  127  295:arraylength     
	//  128  296:icmpge          330
				if(list.contains(((Object) (ConfCamera.autoFocusModes[i]))))
	//* 129  299:aload           5
	//* 130  301:getstatic       #190 <Field String[] ConfCamera.autoFocusModes>
	//* 131  304:iload_2         
	//* 132  305:aaload          
	//* 133  306:invokeinterface #193 <Method boolean List.contains(Object)>
	//* 134  311:ifeq            323
				{
					obj = ((Object) (ConfCamera.autoFocusModes[i]));
	//  135  314:getstatic       #190 <Field String[] ConfCamera.autoFocusModes>
	//  136  317:iload_2         
	//  137  318:aaload          
	//  138  319:astore_3        
					break;
	//  139  320:goto            330
				}
				i++;
	//  140  323:iload_2         
	//  141  324:iconst_1        
	//  142  325:iadd            
	//  143  326:istore_2        
			} while(true);
	//  144  327:goto            288
			if(obj != null)
	//* 145  330:aload_3         
	//* 146  331:ifnull          386
			{
				try
				{
					parameters.setFocusMode(((String) (obj)));
	//  147  334:aload_1         
	//  148  335:aload_3         
	//  149  336:invokevirtual   #163 <Method void android.hardware.Camera$Parameters.setFocusMode(String)>
					val$requestedFocus[0] = parameters.getFocusMode();
	//  150  339:aload_0         
	//  151  340:getfield        #21  <Field String[] val$requestedFocus>
	//  152  343:iconst_0        
	//  153  344:aload_1         
	//  154  345:invokevirtual   #196 <Method String android.hardware.Camera$Parameters.getFocusMode()>
	//  155  348:aastore         
					return;
	//  156  349:return          
				}
				// Misplaced declaration of an exception variable
				catch(android.hardware.Camera.Parameters parameters)
	//* 157  350:astore_1        
				{
					obj = ((Object) (new StringBuilder()));
	//  158  351:new             #147 <Class StringBuilder>
	//  159  354:dup             
	//  160  355:invokespecial   #148 <Method void StringBuilder()>
	//  161  358:astore_3        
				}
				((StringBuilder) (obj)).append("Exception ocurred changing focus mode:");
	//  162  359:aload_3         
	//  163  360:ldc1            #198 <String "Exception ocurred changing focus mode:">
	//  164  362:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  165  365:pop             
				((StringBuilder) (obj)).append(((Exception) (parameters)).getMessage());
	//  166  366:aload_3         
	//  167  367:aload_1         
	//  168  368:invokevirtual   #201 <Method String Exception.getMessage()>
	//  169  371:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//  170  374:pop             
				CLog.e(((StringBuilder) (obj)).toString());
	//  171  375:aload_3         
	//  172  376:invokevirtual   #158 <Method String StringBuilder.toString()>
	//  173  379:invokestatic    #204 <Method void CLog.e(String)>
				((Exception) (parameters)).printStackTrace();
	//  174  382:aload_1         
	//  175  383:invokevirtual   #207 <Method void Exception.printStackTrace()>
			}
		}
	//  176  386:return          
	}

	final ImplCraftARCamera this$0;
	final String val$requestedFocus[];

	ImplCraftARCamera$1()
	{
		this$0 = final_implcraftarcamera;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ImplCraftARCamera this$0>
		val$requestedFocus = _5B_Ljava.lang.String_3B_.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String[] val$requestedFocus>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
