// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core.internal.models;


public class DeviceData
{

	public DeviceData(int i, long l, long l1, long l2, 
			long l3, int j, int k, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		orientation = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field int orientation>
		totalPhysicalMemory = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #24  <Field long totalPhysicalMemory>
		totalInternalStorage = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #26  <Field long totalInternalStorage>
		availablePhysicalMemory = l2;
	//   11   20:aload_0         
	//   12   21:lload           6
	//   13   23:putfield        #28  <Field long availablePhysicalMemory>
		availableInternalStorage = l3;
	//   14   26:aload_0         
	//   15   27:lload           8
	//   16   29:putfield        #30  <Field long availableInternalStorage>
		batteryCapacity = j;
	//   17   32:aload_0         
	//   18   33:iload           10
	//   19   35:putfield        #32  <Field int batteryCapacity>
		batteryVelocity = k;
	//   20   38:aload_0         
	//   21   39:iload           11
	//   22   41:putfield        #34  <Field int batteryVelocity>
		proximity = flag;
	//   23   44:aload_0         
	//   24   45:iload           12
	//   25   47:putfield        #36  <Field boolean proximity>
	//   26   50:return          
	}

	public final long availableInternalStorage;
	public final long availablePhysicalMemory;
	public final int batteryCapacity;
	public final int batteryVelocity;
	public final int orientation;
	public final boolean proximity;
	public final long totalInternalStorage;
	public final long totalPhysicalMemory;
}
