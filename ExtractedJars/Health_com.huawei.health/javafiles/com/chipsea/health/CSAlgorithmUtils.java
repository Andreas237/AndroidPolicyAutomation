// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.chipsea.health;


public class CSAlgorithmUtils
{

	public CSAlgorithmUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public native float getBFR(float f, byte byte0, float f1, int i, int j, int k);

	public native float getBMR(float f, byte byte0, float f1, int i, int j, int k);

	public native int getBodyAge(float f, byte byte0, float f1, int i, int j, int k);

	public native float getMSW(float f, byte byte0, float f1, int i, int j, int k);

	public native float getPM(float f, byte byte0, float f1, int i, int j, int k);

	public native int getResistance(float f, byte byte0, float f1, int i, float f2);

	public native float getSLM(float f, byte byte0, float f1, int i, int j, int k);

	public native float getSMM(float f, byte byte0, float f1, int i, int j, int k);

	public native int getScore(float f, byte byte0, float f1, int i, int j, int k);

	public native float getTFR(float f, byte byte0, float f1, int i, int j, int k);

	public native float getVFR(float f, byte byte0, float f1, int i, int j, int k);

	static 
	{
		System.loadLibrary("csalgorithm");
	//    0    0:ldc1            #8   <String "csalgorithm">
	//    1    2:invokestatic    #14  <Method void System.loadLibrary(String)>
	//*   2    5:return          
	}
}
