// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;


// Referenced classes of package com.appsflyer:
//			r

static final class r$c extends Enum
{

	public static r$c valueOf(String s)
	{
		return (r$c)Enum.valueOf(com/appsflyer/r$c, s);
	//    0    0:ldc1            #2   <Class r$c>
	//    1    2:aload_0         
	//    2    3:invokestatic    #89  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class r$c>
	//    4    9:areturn         
	}

	public static r$c[] values()
	{
		return (r$c[])((r$c []) (_fld02BB)).clone();
	//    0    0:getstatic       #74  <Field r$c[] _fld02BB>
	//    1    3:invokevirtual   #96  <Method Object _5B_Lcom.appsflyer.r$c_3B_.clone()>
	//    2    6:checkcast       #92  <Class r$c[]>
	//    3    9:areturn         
	}

	static String _mth02CF(r$c r$c1)
	{
		return r$c1._fld09710971;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field String _fld09710971>
	//    2    4:areturn         
	}

	static String _mth0971(r$c r$c1)
	{
		return r$c1._fld02BD;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String _fld02BD>
	//    2    4:areturn         
	}

	private static final r$c _fld02BB[];
	private static r$c _fld02CA;
	private static r$c _fld02CB;
	private static r$c _fld02CE;
	private static r$c _fld02CF;
	public static final r$c _fld0971;
	private static r$c _fld141D;
	private String _fld02BD;
	private String _fld09710971;

	static 
	{
		_fld02CA = new r$c("UNITY", 0, "android_unity", "com.unity3d.player.UnityPlayer");
	//    0    0:new             #2   <Class r$c>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "UNITY">
	//    3    6:iconst_0        
	//    4    7:ldc1            #26  <String "android_unity">
	//    5    9:ldc1            #28  <String "com.unity3d.player.UnityPlayer">
	//    6   11:invokespecial   #32  <Method void r$c(String, int, String, String)>
	//    7   14:putstatic       #34  <Field r$c _fld02CA>
		_fld02CE = new r$c("REACT_NATIVE", 1, "android_reactNative", "com.facebook.react.ReactApplication");
	//    8   17:new             #2   <Class r$c>
	//    9   20:dup             
	//   10   21:ldc1            #36  <String "REACT_NATIVE">
	//   11   23:iconst_1        
	//   12   24:ldc1            #38  <String "android_reactNative">
	//   13   26:ldc1            #40  <String "com.facebook.react.ReactApplication">
	//   14   28:invokespecial   #32  <Method void r$c(String, int, String, String)>
	//   15   31:putstatic       #42  <Field r$c _fld02CE>
		_fld02CB = new r$c("CORDOVA", 2, "android_cordova", "org.apache.cordova.CordovaActivity");
	//   16   34:new             #2   <Class r$c>
	//   17   37:dup             
	//   18   38:ldc1            #44  <String "CORDOVA">
	//   19   40:iconst_2        
	//   20   41:ldc1            #46  <String "android_cordova">
	//   21   43:ldc1            #48  <String "org.apache.cordova.CordovaActivity">
	//   22   45:invokespecial   #32  <Method void r$c(String, int, String, String)>
	//   23   48:putstatic       #50  <Field r$c _fld02CB>
		_fld02CF = new r$c("SEGMENT", 3, "android_segment", "com.segment.analytics.integrations.Integration");
	//   24   51:new             #2   <Class r$c>
	//   25   54:dup             
	//   26   55:ldc1            #52  <String "SEGMENT">
	//   27   57:iconst_3        
	//   28   58:ldc1            #54  <String "android_segment">
	//   29   60:ldc1            #56  <String "com.segment.analytics.integrations.Integration">
	//   30   62:invokespecial   #32  <Method void r$c(String, int, String, String)>
	//   31   65:putstatic       #58  <Field r$c _fld02CF>
		_fld141D = new r$c("COCOS2DX", 4, "android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity");
	//   32   68:new             #2   <Class r$c>
	//   33   71:dup             
	//   34   72:ldc1            #60  <String "COCOS2DX">
	//   35   74:iconst_4        
	//   36   75:ldc1            #62  <String "android_cocos2dx">
	//   37   77:ldc1            #64  <String "org.cocos2dx.lib.Cocos2dxActivity">
	//   38   79:invokespecial   #32  <Method void r$c(String, int, String, String)>
	//   39   82:putstatic       #66  <Field r$c _fld141D>
		_fld0971 = new r$c("DEFAULT", 5, "android_native", "android_native");
	//   40   85:new             #2   <Class r$c>
	//   41   88:dup             
	//   42   89:ldc1            #68  <String "DEFAULT">
	//   43   91:iconst_5        
	//   44   92:ldc1            #70  <String "android_native">
	//   45   94:ldc1            #70  <String "android_native">
	//   46   96:invokespecial   #32  <Method void r$c(String, int, String, String)>
	//   47   99:putstatic       #72  <Field r$c _fld0971>
		_fld02BB = (new r$c[] {
			_fld02CA, _fld02CE, _fld02CB, _fld02CF, _fld141D, _fld0971
		});
	//   48  102:bipush          6
	//   49  104:anewarray       r$c[]
	//   50  107:dup             
	//   51  108:iconst_0        
	//   52  109:getstatic       #34  <Field r$c _fld02CA>
	//   53  112:aastore         
	//   54  113:dup             
	//   55  114:iconst_1        
	//   56  115:getstatic       #42  <Field r$c _fld02CE>
	//   57  118:aastore         
	//   58  119:dup             
	//   59  120:iconst_2        
	//   60  121:getstatic       #50  <Field r$c _fld02CB>
	//   61  124:aastore         
	//   62  125:dup             
	//   63  126:iconst_3        
	//   64  127:getstatic       #58  <Field r$c _fld02CF>
	//   65  130:aastore         
	//   66  131:dup             
	//   67  132:iconst_4        
	//   68  133:getstatic       #66  <Field r$c _fld141D>
	//   69  136:aastore         
	//   70  137:dup             
	//   71  138:iconst_5        
	//   72  139:getstatic       #72  <Field r$c _fld0971>
	//   73  142:aastore         
	//   74  143:putstatic       #74  <Field r$c[] _fld02BB>
	//*  75  146:return          
	}

	private r$c(String s, int i, String s1, String s2)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #78  <Method void Enum(String, int)>
		_fld09710971 = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #80  <Field String _fld09710971>
		_fld02BD = s2;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #82  <Field String _fld02BD>
	//   10   17:return          
	}
}
