// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap;


public abstract class AbstractMapMessage
{

	public AbstractMapMessage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public abstract int getType();

	public static final int GESTURE_STATE_BEGIN = 100;
	public static final int GESTURE_STATE_CHANGE = 101;
	public static final int GESTURE_STATE_END = 102;
	public static final int MSGTYPE_NAVIOVERLAY_STATE = 13;
}
