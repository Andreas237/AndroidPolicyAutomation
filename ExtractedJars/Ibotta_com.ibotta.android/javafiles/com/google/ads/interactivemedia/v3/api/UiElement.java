// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.impl.data.m;

public interface UiElement
{

	public abstract String getName();

	public static final UiElement AD_ATTRIBUTION = new m("adAttribution");
	public static final UiElement COUNTDOWN = new m("countdown");

	/* static  */
	/* { */
	//    0    0:new             #11  <Class m>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "adAttribution">
	//    3    6:invokespecial   #17  <Method void m(String)>
	//    4    9:putstatic       #19  <Field UiElement AD_ATTRIBUTION>
	//    5   12:new             #11  <Class m>
	//    6   15:dup             
	//    7   16:ldc1            #21  <String "countdown">
	//    8   18:invokespecial   #17  <Method void m(String)>
	//    9   21:putstatic       #23  <Field UiElement COUNTDOWN>
	//*  10   24:return          
	/* } */
}
