// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core.internal.models;


// Referenced classes of package com.crashlytics.android.core.internal.models:
//			BinaryImageData, CustomAttributeData, DeviceData, SignalData, 
//			ThreadData

public class SessionEventData
{

	public SessionEventData(long l, SignalData signaldata, ThreadData athreaddata[], BinaryImageData abinaryimagedata[], CustomAttributeData acustomattributedata[], DeviceData devicedata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		timestamp = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #23  <Field long timestamp>
		signal = signaldata;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #25  <Field SignalData signal>
		threads = athreaddata;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #27  <Field ThreadData[] threads>
		binaryImages = abinaryimagedata;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #29  <Field BinaryImageData[] binaryImages>
		customAttributes = acustomattributedata;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #31  <Field CustomAttributeData[] customAttributes>
		deviceData = devicedata;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #33  <Field DeviceData deviceData>
	//   20   38:return          
	}

	public final BinaryImageData binaryImages[];
	public final CustomAttributeData customAttributes[];
	public final DeviceData deviceData;
	public final SignalData signal;
	public final ThreadData threads[];
	public final long timestamp;
}
