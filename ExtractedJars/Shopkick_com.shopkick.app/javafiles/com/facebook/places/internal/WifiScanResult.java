// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.internal;


public class WifiScanResult
{

	public WifiScanResult()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public WifiScanResult(String s, String s1, int i, int j, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		ssid = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String ssid>
		bssid = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String bssid>
		rssi = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #24  <Field int rssi>
		frequency = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #26  <Field int frequency>
		timestampMs = l;
	//   14   25:aload_0         
	//   15   26:lload           5
	//   16   28:putfield        #28  <Field long timestampMs>
	//   17   31:return          
	}

	public String bssid;
	public int frequency;
	public int rssi;
	public String ssid;
	public long timestampMs;
}
