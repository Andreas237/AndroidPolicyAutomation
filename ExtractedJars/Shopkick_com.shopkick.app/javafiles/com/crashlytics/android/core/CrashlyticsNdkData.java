// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.TreeSet;

public class CrashlyticsNdkData
{

	public CrashlyticsNdkData(TreeSet treeset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		timestampedDirectories = treeset;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field TreeSet timestampedDirectories>
	//    5    9:return          
	}

	public final TreeSet timestampedDirectories;
}
