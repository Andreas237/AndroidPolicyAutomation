// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnicodeUtils
{

	public UnicodeUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static String unescape(String s)
	{
		Object obj = ((Object) (s));
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #31  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    6:ifne            91
		{
			Matcher matcher = zzaal.matcher(((CharSequence) (s)));
	//    5    9:getstatic       #19  <Field Pattern zzaal>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #35  <Method Matcher Pattern.matcher(CharSequence)>
	//    8   16:astore_3        
			Object obj1;
			for(obj = null; matcher.find(); obj = obj1)
	//*   9   17:aconst_null     
	//*  10   18:astore_1        
	//*  11   19:aload_3         
	//*  12   20:invokevirtual   #41  <Method boolean Matcher.find()>
	//*  13   23:ifeq            74
			{
				obj1 = obj;
	//   14   26:aload_1         
	//   15   27:astore_2        
				if(obj == null)
	//*  16   28:aload_1         
	//*  17   29:ifnonnull       40
					obj1 = ((Object) (new StringBuffer()));
	//   18   32:new             #43  <Class StringBuffer>
	//   19   35:dup             
	//   20   36:invokespecial   #44  <Method void StringBuffer()>
	//   21   39:astore_2        
				matcher.appendReplacement(((StringBuffer) (obj1)), new String(Character.toChars(Integer.parseInt(matcher.group().substring(2), 16))));
	//   22   40:aload_3         
	//   23   41:aload_2         
	//   24   42:new             #46  <Class String>
	//   25   45:dup             
	//   26   46:aload_3         
	//   27   47:invokevirtual   #50  <Method String Matcher.group()>
	//   28   50:iconst_2        
	//   29   51:invokevirtual   #54  <Method String String.substring(int)>
	//   30   54:bipush          16
	//   31   56:invokestatic    #60  <Method int Integer.parseInt(String, int)>
	//   32   59:invokestatic    #66  <Method char[] Character.toChars(int)>
	//   33   62:invokespecial   #69  <Method void String(char[])>
	//   34   65:invokevirtual   #73  <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//   35   68:pop             
			}

	//   36   69:aload_2         
	//   37   70:astore_1        
	//*  38   71:goto            19
			if(obj == null)
	//*  39   74:aload_1         
	//*  40   75:ifnonnull       80
				return s;
	//   41   78:aload_0         
	//   42   79:areturn         
			matcher.appendTail(((StringBuffer) (obj)));
	//   43   80:aload_3         
	//   44   81:aload_1         
	//   45   82:invokevirtual   #77  <Method StringBuffer Matcher.appendTail(StringBuffer)>
	//   46   85:pop             
			obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   47   86:aload_1         
	//   48   87:invokevirtual   #80  <Method String StringBuffer.toString()>
	//   49   90:astore_1        
		}
		return ((String) (obj));
	//   50   91:aload_1         
	//   51   92:areturn         
	}

	private static final Pattern zzaal = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

	static 
	{
	//    0    0:ldc1            #11  <String "\\\\u[0-9a-fA-F]{4}">
	//    1    2:invokestatic    #17  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #19  <Field Pattern zzaal>
	//*   3    8:return          
	}
}
