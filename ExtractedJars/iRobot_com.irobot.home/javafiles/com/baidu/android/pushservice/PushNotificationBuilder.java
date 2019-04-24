// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.app.Notification;
import android.content.Context;
import java.io.Serializable;

public abstract class PushNotificationBuilder
	implements Serializable
{

	public PushNotificationBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public abstract Notification construct(Context context);

	public void setNotificationDefaults(int i)
	{
		mNotificationDefaults = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int mNotificationDefaults>
	//    3    5:return          
	}

	public void setNotificationFlags(int i)
	{
		mNotificationFlags = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int mNotificationFlags>
	//    3    5:return          
	}

	public void setNotificationSound(String s)
	{
		mNotificationsound = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String mNotificationsound>
	//    3    5:return          
	}

	public void setNotificationText(String s)
	{
		mNotificationText = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String mNotificationText>
	//    3    5:return          
	}

	public void setNotificationTitle(String s)
	{
		mNotificationTitle = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String mNotificationTitle>
	//    3    5:return          
	}

	public void setNotificationVibrate(long al[])
	{
		mVibratePattern = al;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field long[] mVibratePattern>
	//    3    5:return          
	}

	public void setStatusbarIcon(int i)
	{
		mStatusbarIcon = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int mStatusbarIcon>
	//    3    5:return          
	}

	protected int mNotificationDefaults;
	protected int mNotificationFlags;
	protected String mNotificationText;
	protected String mNotificationTitle;
	protected String mNotificationsound;
	protected int mStatusbarIcon;
	protected long mVibratePattern[];
}
