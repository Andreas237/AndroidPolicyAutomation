// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.config;


public class AppboyInAppMessageParams
{

	public AppboyInAppMessageParams()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static double getGraphicModalMaxHeightDp()
	{
		return sGraphicModalMaxHeightDp;
	//    0    0:getstatic       #25  <Field double sGraphicModalMaxHeightDp>
	//    1    3:dreturn         
	}

	public static double getGraphicModalMaxWidthDp()
	{
		return sGraphicModalMaxWidthDp;
	//    0    0:getstatic       #28  <Field double sGraphicModalMaxWidthDp>
	//    1    3:dreturn         
	}

	public static double getModalizedImageRadiusDp()
	{
		return sModalizedImageRadiusDp;
	//    0    0:getstatic       #31  <Field double sModalizedImageRadiusDp>
	//    1    3:dreturn         
	}

	public static void setGraphicModalMaxHeightDp(double d)
	{
		sGraphicModalMaxHeightDp = d;
	//    0    0:dload_0         
	//    1    1:putstatic       #25  <Field double sGraphicModalMaxHeightDp>
	//    2    4:return          
	}

	public static void setGraphicModalMaxWidthDp(double d)
	{
		sGraphicModalMaxWidthDp = d;
	//    0    0:dload_0         
	//    1    1:putstatic       #28  <Field double sGraphicModalMaxWidthDp>
	//    2    4:return          
	}

	public static void setModalizedImageRadiusDp(double d)
	{
		sModalizedImageRadiusDp = d;
	//    0    0:dload_0         
	//    1    1:putstatic       #31  <Field double sModalizedImageRadiusDp>
	//    2    4:return          
	}

	public static final double GRAPHIC_MODAL_MAX_HEIGHT_DP = 290D;
	public static final double GRAPHIC_MODAL_MAX_WIDTH_DP = 290D;
	public static final double MODALIZED_IMAGE_RADIUS_DP = 9D;
	private static double sGraphicModalMaxHeightDp = 290D;
	private static double sGraphicModalMaxWidthDp = 290D;
	private static double sModalizedImageRadiusDp = 9D;

	static 
	{
	//    0    0:return          
	}
}
