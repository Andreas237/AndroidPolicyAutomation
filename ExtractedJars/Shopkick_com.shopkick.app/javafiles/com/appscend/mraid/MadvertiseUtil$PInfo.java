// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseUtil

static class MadvertiseUtil$PInfo
{

	private void prettyPrint()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(appname);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String appname>
	//    7   13:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("\t ");
	//    9   17:aload_1         
	//   10   18:ldc1            #54  <String "\t ">
	//   11   20:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(pname);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #25  <Field String pname>
	//   16   29:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append("\t ");
	//   18   33:aload_1         
	//   19   34:ldc1            #54  <String "\t ">
	//   20   36:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(versionName);
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #27  <Field String versionName>
	//   25   45:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append("\t ");
	//   27   49:aload_1         
	//   28   50:ldc1            #54  <String "\t ">
	//   29   52:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(versionCode);
	//   31   56:aload_1         
	//   32   57:aload_0         
	//   33   58:getfield        #29  <Field int versionCode>
	//   34   61:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   35   64:pop             
		MadvertiseUtil.logMessage(((String) (null)), 3, stringbuilder.toString());
	//   36   65:aconst_null     
	//   37   66:iconst_3        
	//   38   67:aload_1         
	//   39   68:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   40   71:invokestatic    #65  <Method void MadvertiseUtil.logMessage(String, int, String)>
	//   41   74:return          
	}

	private String appname;
	private Drawable icon;
	private String pname;
	private int versionCode;
	private String versionName;


/*
	static void access$200(MadvertiseUtil$PInfo madvertiseutil$pinfo)
	{
		madvertiseutil$pinfo.prettyPrint();
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void prettyPrint()>
		return;
	//    2    4:return          
	}

*/


/*
	static String access$302(MadvertiseUtil$PInfo madvertiseutil$pinfo, String s)
	{
		madvertiseutil$pinfo.appname = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field String appname>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static String access$402(MadvertiseUtil$PInfo madvertiseutil$pinfo, String s)
	{
		madvertiseutil$pinfo.pname = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String pname>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static String access$502(MadvertiseUtil$PInfo madvertiseutil$pinfo, String s)
	{
		madvertiseutil$pinfo.versionName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String versionName>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$602(MadvertiseUtil$PInfo madvertiseutil$pinfo, int i)
	{
		madvertiseutil$pinfo.versionCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int versionCode>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Drawable access$702(MadvertiseUtil$PInfo madvertiseutil$pinfo, Drawable drawable)
	{
		madvertiseutil$pinfo.icon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field Drawable icon>
		return drawable;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

	MadvertiseUtil$PInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		appname = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #21  <String "">
	//    4    7:putfield        #23  <Field String appname>
		pname = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #21  <String "">
	//    7   13:putfield        #25  <Field String pname>
		versionName = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #21  <String "">
	//   10   19:putfield        #27  <Field String versionName>
		versionCode = 0;
	//   11   22:aload_0         
	//   12   23:iconst_0        
	//   13   24:putfield        #29  <Field int versionCode>
	//   14   27:return          
	}
}
