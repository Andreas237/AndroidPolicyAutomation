// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.utils;

import android.content.Context;
import android.content.res.Resources;

public class ResUtils
{

	private ResUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int getDrawableResourceId(Context context, String s)
	{
		return getDrawableResourceId(context, s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #14  <Method int getDrawableResourceId(Context, String, int)>
	//    4    6:ireturn         
	}

	public static int getDrawableResourceId(Context context, String s, int i)
	{
		int j;
		if(s == null || s.length() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #20  <Method int String.length()>
	//*   4    8:ifne            15
		{
			j = i;
	//    5   11:iload_2         
	//    6   12:istore_3        
		} else
	//*   7   13:iload_3         
	//*   8   14:ireturn         
		{
			int k = context.getResources().getIdentifier(s, "drawable", context.getPackageName());
	//    9   15:aload_0         
	//   10   16:invokevirtual   #26  <Method Resources Context.getResources()>
	//   11   19:aload_1         
	//   12   20:ldc1            #28  <String "drawable">
	//   13   22:aload_0         
	//   14   23:invokevirtual   #32  <Method String Context.getPackageName()>
	//   15   26:invokevirtual   #38  <Method int Resources.getIdentifier(String, String, String)>
	//   16   29:istore          4
			j = k;
	//   17   31:iload           4
	//   18   33:istore_3        
			if(k == 0)
	//*  19   34:iload           4
	//*  20   36:ifne            13
				return i;
	//   21   39:iload_2         
	//   22   40:ireturn         
		}
		return j;
	}

	public static String getExternalSDAppFolder()
	{
		return "demo_researchstack";
	//    0    0:ldc1            #42  <String "demo_researchstack">
	//    1    2:areturn         
	}

	public static String getHTMLFilePath(String s)
	{
		return getRawFilePath(s, "html");
	//    0    0:aload_0         
	//    1    1:ldc1            #47  <String "html">
	//    2    3:invokestatic    #51  <Method String getRawFilePath(String, String)>
	//    3    6:areturn         
	}

	public static String getPDFFilePath(String s)
	{
		return getRawFilePath(s, "pdf");
	//    0    0:aload_0         
	//    1    1:ldc1            #54  <String "pdf">
	//    2    3:invokestatic    #51  <Method String getRawFilePath(String, String)>
	//    3    6:areturn         
	}

	public static String getRawFilePath(String s, String s1)
	{
		return (new StringBuilder()).append("file:///android_res/raw/").append(s).append(".").append(s1).toString();
	//    0    0:new             #56  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void StringBuilder()>
	//    3    7:ldc1            #59  <String "file:///android_res/raw/">
	//    4    9:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:ldc1            #65  <String ".">
	//    8   18:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   12   28:areturn         
	}

	public static int getRawResourceId(Context context, String s)
	{
		return context.getResources().getIdentifier(s, "raw", context.getPackageName());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Resources Context.getResources()>
	//    2    4:aload_1         
	//    3    5:ldc1            #71  <String "raw">
	//    4    7:aload_0         
	//    5    8:invokevirtual   #32  <Method String Context.getPackageName()>
	//    6   11:invokevirtual   #38  <Method int Resources.getIdentifier(String, String, String)>
	//    7   14:ireturn         
	}
}
