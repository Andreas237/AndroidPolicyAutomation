// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import com.irobot.home.model.rest.*;
import org.androidannotations.a.a.a.a;

public interface RegistrationRestClient
	extends a
{

	public abstract RegisterCustomerInfo registerCustomer(RegisterCustomer registercustomer);

	public abstract RegisterRobotInfo registerRobot(RegisterRobot registerrobot);

	public abstract void setRootUrl(String s);
}
