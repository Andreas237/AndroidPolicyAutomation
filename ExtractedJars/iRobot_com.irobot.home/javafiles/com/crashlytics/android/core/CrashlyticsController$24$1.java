// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.os.Build;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$24$1 extends HashMap
{

	final CrashlyticsController._cls24 this$1;

	CrashlyticsController$24$1()
	{
		this$1 = CrashlyticsController._cls24.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CrashlyticsController$24 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void HashMap()>
		put("arch", ((Object) (Integer.valueOf(val$arch))));
	//    5    9:aload_0         
	//    6   10:ldc1            #21  <String "arch">
	//    7   12:aload_0         
	//    8   13:getfield        #16  <Field CrashlyticsController$24 this$1>
	//    9   16:getfield        #25  <Field int CrashlyticsController$24.val$arch>
	//   10   19:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//   11   22:invokevirtual   #35  <Method Object put(Object, Object)>
	//   12   25:pop             
		put("build_model", ((Object) (Build.MODEL)));
	//   13   26:aload_0         
	//   14   27:ldc1            #37  <String "build_model">
	//   15   29:getstatic       #43  <Field String Build.MODEL>
	//   16   32:invokevirtual   #35  <Method Object put(Object, Object)>
	//   17   35:pop             
		put("available_processors", ((Object) (Integer.valueOf(val$availableProcessors))));
	//   18   36:aload_0         
	//   19   37:ldc1            #45  <String "available_processors">
	//   20   39:aload_0         
	//   21   40:getfield        #16  <Field CrashlyticsController$24 this$1>
	//   22   43:getfield        #48  <Field int CrashlyticsController$24.val$availableProcessors>
	//   23   46:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//   24   49:invokevirtual   #35  <Method Object put(Object, Object)>
	//   25   52:pop             
		put("total_ram", ((Object) (Long.valueOf(val$totalRam))));
	//   26   53:aload_0         
	//   27   54:ldc1            #50  <String "total_ram">
	//   28   56:aload_0         
	//   29   57:getfield        #16  <Field CrashlyticsController$24 this$1>
	//   30   60:getfield        #54  <Field long CrashlyticsController$24.val$totalRam>
	//   31   63:invokestatic    #59  <Method Long Long.valueOf(long)>
	//   32   66:invokevirtual   #35  <Method Object put(Object, Object)>
	//   33   69:pop             
		put("disk_space", ((Object) (Long.valueOf(val$diskSpace))));
	//   34   70:aload_0         
	//   35   71:ldc1            #61  <String "disk_space">
	//   36   73:aload_0         
	//   37   74:getfield        #16  <Field CrashlyticsController$24 this$1>
	//   38   77:getfield        #64  <Field long CrashlyticsController$24.val$diskSpace>
	//   39   80:invokestatic    #59  <Method Long Long.valueOf(long)>
	//   40   83:invokevirtual   #35  <Method Object put(Object, Object)>
	//   41   86:pop             
		put("is_emulator", ((Object) (Boolean.valueOf(val$isEmulator))));
	//   42   87:aload_0         
	//   43   88:ldc1            #66  <String "is_emulator">
	//   44   90:aload_0         
	//   45   91:getfield        #16  <Field CrashlyticsController$24 this$1>
	//   46   94:getfield        #70  <Field boolean CrashlyticsController$24.val$isEmulator>
	//   47   97:invokestatic    #75  <Method Boolean Boolean.valueOf(boolean)>
	//   48  100:invokevirtual   #35  <Method Object put(Object, Object)>
	//   49  103:pop             
		put("ids", ((Object) (val$ids)));
	//   50  104:aload_0         
	//   51  105:ldc1            #77  <String "ids">
	//   52  107:aload_0         
	//   53  108:getfield        #16  <Field CrashlyticsController$24 this$1>
	//   54  111:getfield        #81  <Field Map CrashlyticsController$24.val$ids>
	//   55  114:invokevirtual   #35  <Method Object put(Object, Object)>
	//   56  117:pop             
		put("state", ((Object) (Integer.valueOf(val$state))));
	//   57  118:aload_0         
	//   58  119:ldc1            #83  <String "state">
	//   59  121:aload_0         
	//   60  122:getfield        #16  <Field CrashlyticsController$24 this$1>
	//   61  125:getfield        #86  <Field int CrashlyticsController$24.val$state>
	//   62  128:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//   63  131:invokevirtual   #35  <Method Object put(Object, Object)>
	//   64  134:pop             
		put("build_manufacturer", ((Object) (Build.MANUFACTURER)));
	//   65  135:aload_0         
	//   66  136:ldc1            #88  <String "build_manufacturer">
	//   67  138:getstatic       #91  <Field String Build.MANUFACTURER>
	//   68  141:invokevirtual   #35  <Method Object put(Object, Object)>
	//   69  144:pop             
		put("build_product", ((Object) (Build.PRODUCT)));
	//   70  145:aload_0         
	//   71  146:ldc1            #93  <String "build_product">
	//   72  148:getstatic       #96  <Field String Build.PRODUCT>
	//   73  151:invokevirtual   #35  <Method Object put(Object, Object)>
	//   74  154:pop             
	//   75  155:return          
	}

	// Unreferenced inner class com/crashlytics/android/core/CrashlyticsController$24

/* anonymous class */
	class CrashlyticsController._cls24
		implements CrashlyticsController.FileOutputStreamWriteAction
	{

		public void writeTo(FileOutputStream fileoutputstream)
		{
			fileoutputstream.write((new JSONObject(((Map) (new CrashlyticsController._cls24._cls1())))).toString().getBytes());
		//    0    0:aload_1         
		//    1    1:new             #52  <Class JSONObject>
		//    2    4:dup             
		//    3    5:new             #13  <Class CrashlyticsController$24$1>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #55  <Method void CrashlyticsController$24$1(CrashlyticsController$24)>
		//    7   13:invokespecial   #58  <Method void JSONObject(Map)>
		//    8   16:invokevirtual   #62  <Method String JSONObject.toString()>
		//    9   19:invokevirtual   #68  <Method byte[] String.getBytes()>
		//   10   22:invokevirtual   #74  <Method void FileOutputStream.write(byte[])>
		//   11   25:return          
		}

		final CrashlyticsController this$0;
		final int val$arch;
		final int val$availableProcessors;
		final long val$diskSpace;
		final Map val$ids;
		final boolean val$isEmulator;
		final int val$state;
		final long val$totalRam;

			
			{
				this$0 = final_crashlyticscontroller;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #30  <Field CrashlyticsController this$0>
				arch = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #32  <Field int val$arch>
				availableProcessors = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #34  <Field int val$availableProcessors>
				totalRam = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #36  <Field long val$totalRam>
				diskSpace = l1;
			//   12   21:aload_0         
			//   13   22:lload           6
			//   14   24:putfield        #38  <Field long val$diskSpace>
				isEmulator = flag;
			//   15   27:aload_0         
			//   16   28:iload           8
			//   17   30:putfield        #40  <Field boolean val$isEmulator>
				ids = map;
			//   18   33:aload_0         
			//   19   34:aload           9
			//   20   36:putfield        #42  <Field Map val$ids>
				state = I.this;
			//   21   39:aload_0         
			//   22   40:iload           10
			//   23   42:putfield        #44  <Field int val$state>
				super();
			//   24   45:aload_0         
			//   25   46:invokespecial   #47  <Method void Object()>
			//   26   49:return          
			}
	}

}
