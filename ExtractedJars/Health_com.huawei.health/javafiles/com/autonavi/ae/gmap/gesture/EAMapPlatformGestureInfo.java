// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gesture;


public class EAMapPlatformGestureInfo
{

	public EAMapPlatformGestureInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mGestureState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int mGestureState>
		mGestureType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field int mGestureType>
	//    8   14:return          
	}

	public int mGestureState;
	public int mGestureType;
	public float mLocation[];
	public float mRotation;
	public float mScale;
	public float mVeLocityFloat;
	public float mVelocityPoint[];
}
