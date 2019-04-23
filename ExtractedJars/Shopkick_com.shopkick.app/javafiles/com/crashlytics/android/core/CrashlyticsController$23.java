// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.os.Build;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController, SessionProtobufHelper, CodedOutputStream

class CrashlyticsController$23
	implements edOutputStreamWriteAction
{

	public void writeTo(CodedOutputStream codedoutputstream)
		throws Exception
	{
		SessionProtobufHelper.writeSessionDevice(codedoutputstream, val$arch, Build.MODEL, val$availableProcessors, val$totalRam, val$diskSpace, val$isEmulator, val$ids, val$state, Build.MANUFACTURER, Build.PRODUCT);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field int val$arch>
	//    3    5:getstatic       #56  <Field String Build.MODEL>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field int val$availableProcessors>
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field long val$totalRam>
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field long val$diskSpace>
	//   10   20:aload_0         
	//   11   21:getfield        #38  <Field boolean val$isEmulator>
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field Map val$ids>
	//   14   28:aload_0         
	//   15   29:getfield        #42  <Field int val$state>
	//   16   32:getstatic       #59  <Field String Build.MANUFACTURER>
	//   17   35:getstatic       #62  <Field String Build.PRODUCT>
	//   18   38:invokestatic    #67  <Method void SessionProtobufHelper.writeSessionDevice(CodedOutputStream, int, String, int, long, long, boolean, Map, int, String, String)>
	//   19   41:return          
	}

	final CrashlyticsController this$0;
	final int val$arch;
	final int val$availableProcessors;
	final long val$diskSpace;
	final Map val$ids;
	final boolean val$isEmulator;
	final int val$state;
	final long val$totalRam;

	CrashlyticsController$23()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field CrashlyticsController this$0>
		val$arch = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #30  <Field int val$arch>
		val$availableProcessors = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #32  <Field int val$availableProcessors>
		val$totalRam = l;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #34  <Field long val$totalRam>
		val$diskSpace = l1;
	//   12   21:aload_0         
	//   13   22:lload           6
	//   14   24:putfield        #36  <Field long val$diskSpace>
		val$isEmulator = flag;
	//   15   27:aload_0         
	//   16   28:iload           8
	//   17   30:putfield        #38  <Field boolean val$isEmulator>
		val$ids = map;
	//   18   33:aload_0         
	//   19   34:aload           9
	//   20   36:putfield        #40  <Field Map val$ids>
		val$state = I.this;
	//   21   39:aload_0         
	//   22   40:iload           10
	//   23   42:putfield        #42  <Field int val$state>
		super();
	//   24   45:aload_0         
	//   25   46:invokespecial   #45  <Method void Object()>
	//   26   49:return          
	}
}
