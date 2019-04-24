// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.constants;


public class ScriptToolsConst
{
	public static interface A2Response4ApduExceFail
	{

		public static final byte NO_REPONSE = 1;
		public static final byte TIMEOUT = 2;
	}

	public static interface TagName
	{

		public static final byte CommandMultiple = -92;
		public static final byte CommandSingle = -96;
		public static final byte ResponseMultiple = -93;
		public static final byte ResponseSingle = -94;
		public static final byte ScriptDown = -95;
		public static final byte TagApdu = 57;
		public static final byte TagExpectationAndNext = 60;
		public static final byte TagSerial = 56;
	}


	public ScriptToolsConst()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
