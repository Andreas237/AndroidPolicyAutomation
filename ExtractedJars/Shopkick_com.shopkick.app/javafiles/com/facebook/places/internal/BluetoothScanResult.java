// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;


public class BluetoothScanResult
{

	public BluetoothScanResult(String s, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		payload = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String payload>
		rssi = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int rssi>
		timestampNanos = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #21  <Field long timestampNanos>
	//   11   19:return          
	}

	public String payload;
	public int rssi;
	public long timestampNanos;
}
