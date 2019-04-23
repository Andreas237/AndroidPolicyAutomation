// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

public final class CookieUtil
{

	private CookieUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getCookieUrl(String s, Boolean boolean1)
	{
		Preconditions.checkNotEmpty(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method String Preconditions.checkNotEmpty(String)>
	//    2    4:pop             
		if(zza(boolean1))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #21  <Method boolean zza(Boolean)>
	//*   5    9:ifeq            18
			boolean1 = "https";
	//    6   12:ldc1            #23  <String "https">
	//    7   14:astore_1        
		else
	//*   8   15:goto            21
			boolean1 = "http";
	//    9   18:ldc1            #25  <String "http">
	//   10   20:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (boolean1))).length() + 3 + String.valueOf(((Object) (s))).length());
	//   11   21:new             #27  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokestatic    #33  <Method String String.valueOf(Object)>
	//   15   29:invokevirtual   #37  <Method int String.length()>
	//   16   32:iconst_3        
	//   17   33:iadd            
	//   18   34:aload_0         
	//   19   35:invokestatic    #33  <Method String String.valueOf(Object)>
	//   20   38:invokevirtual   #37  <Method int String.length()>
	//   21   41:iadd            
	//   22   42:invokespecial   #40  <Method void StringBuilder(int)>
	//   23   45:astore_2        
		stringbuilder.append(((String) (boolean1)));
	//   24   46:aload_2         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		stringbuilder.append("://");
	//   28   52:aload_2         
	//   29   53:ldc1            #46  <String "://">
	//   30   55:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
		stringbuilder.append(s);
	//   32   59:aload_2         
	//   33   60:aload_0         
	//   34   61:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		return stringbuilder.toString();
	//   36   65:aload_2         
	//   37   66:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   38   69:areturn         
	}

	public static String getCookieValue(String s, String s1, String s2, String s3, Boolean boolean1, Boolean boolean2, Long long1)
	{
		s = ((String) (new StringBuilder(s)));
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #55  <Method void StringBuilder(String)>
	//    4    8:astore_0        
		((StringBuilder) (s)).append('=');
	//    5    9:aload_0         
	//    6   10:bipush          61
	//    7   12:invokevirtual   #58  <Method StringBuilder StringBuilder.append(char)>
	//    8   15:pop             
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*   9   16:aload_1         
	//*  10   17:invokestatic    #64  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   20:ifne            29
			((StringBuilder) (s)).append(s1);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		if(zza(boolean1))
	//*  16   29:aload           4
	//*  17   31:invokestatic    #21  <Method boolean zza(Boolean)>
	//*  18   34:ifeq            44
			((StringBuilder) (s)).append(";HttpOnly");
	//   19   37:aload_0         
	//   20   38:ldc1            #66  <String ";HttpOnly">
	//   21   40:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
		if(zza(boolean2))
	//*  23   44:aload           5
	//*  24   46:invokestatic    #21  <Method boolean zza(Boolean)>
	//*  25   49:ifeq            59
			((StringBuilder) (s)).append(";Secure");
	//   26   52:aload_0         
	//   27   53:ldc1            #68  <String ";Secure">
	//   28   55:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		if(!TextUtils.isEmpty(((CharSequence) (s2))))
	//*  30   59:aload_2         
	//*  31   60:invokestatic    #64  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   63:ifne            79
		{
			((StringBuilder) (s)).append(";Domain=");
	//   33   66:aload_0         
	//   34   67:ldc1            #70  <String ";Domain=">
	//   35   69:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
			((StringBuilder) (s)).append(s2);
	//   37   73:aload_0         
	//   38   74:aload_2         
	//   39   75:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   40   78:pop             
		}
		if(!TextUtils.isEmpty(((CharSequence) (s3))))
	//*  41   79:aload_3         
	//*  42   80:invokestatic    #64  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  43   83:ifne            99
		{
			((StringBuilder) (s)).append(";Path=");
	//   44   86:aload_0         
	//   45   87:ldc1            #72  <String ";Path=">
	//   46   89:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
			((StringBuilder) (s)).append(s3);
	//   48   93:aload_0         
	//   49   94:aload_3         
	//   50   95:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   51   98:pop             
		}
		if(long1 != null && long1.longValue() > 0L)
	//*  52   99:aload           6
	//*  53  101:ifnull          128
	//*  54  104:aload           6
	//*  55  106:invokevirtual   #78  <Method long Long.longValue()>
	//*  56  109:lconst_0        
	//*  57  110:lcmp            
	//*  58  111:ifle            128
		{
			((StringBuilder) (s)).append(";Max-Age=");
	//   59  114:aload_0         
	//   60  115:ldc1            #80  <String ";Max-Age=">
	//   61  117:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   62  120:pop             
			((StringBuilder) (s)).append(((Object) (long1)));
	//   63  121:aload_0         
	//   64  122:aload           6
	//   65  124:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   66  127:pop             
		}
		return ((StringBuilder) (s)).toString();
	//   67  128:aload_0         
	//   68  129:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   69  132:areturn         
	}

	private static boolean zza(Boolean boolean1)
	{
		return boolean1 != null && boolean1.booleanValue();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokevirtual   #89  <Method boolean Boolean.booleanValue()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}
}
