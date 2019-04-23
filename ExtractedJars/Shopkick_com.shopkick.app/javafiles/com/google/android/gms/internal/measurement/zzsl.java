// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsi, zzru, zzso

final class zzsl extends zzsi
{

	zzsl(zzso zzso, String s, Boolean boolean1)
	{
		super(zzso, s, ((Object) (boolean1)), ((zzsj) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #10  <Method void zzsi(zzso, String, Object, zzsj)>
	//    6    8:return          
	}

	final Object zzs(Object obj)
	{
		if(obj instanceof Boolean)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #15  <Class Boolean>
	//*   2    4:ifeq            12
			return ((Object) ((Boolean)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #15  <Class Boolean>
	//    5   11:areturn         
		if(obj instanceof String)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #17  <Class String>
	//*   8   16:ifeq            60
		{
			String s = (String)obj;
	//    9   19:aload_1         
	//   10   20:checkcast       #17  <Class String>
	//   11   23:astore_2        
			if(zzru.zzbqo.matcher(((CharSequence) (s))).matches())
	//*  12   24:getstatic       #23  <Field Pattern zzru.zzbqo>
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #29  <Method Matcher Pattern.matcher(CharSequence)>
	//*  15   31:invokevirtual   #35  <Method boolean Matcher.matches()>
	//*  16   34:ifeq            42
				return ((Object) (Boolean.valueOf(true)));
	//   17   37:iconst_1        
	//   18   38:invokestatic    #39  <Method Boolean Boolean.valueOf(boolean)>
	//   19   41:areturn         
			if(zzru.zzbqp.matcher(((CharSequence) (s))).matches())
	//*  20   42:getstatic       #42  <Field Pattern zzru.zzbqp>
	//*  21   45:aload_2         
	//*  22   46:invokevirtual   #29  <Method Matcher Pattern.matcher(CharSequence)>
	//*  23   49:invokevirtual   #35  <Method boolean Matcher.matches()>
	//*  24   52:ifeq            60
				return ((Object) (Boolean.valueOf(false)));
	//   25   55:iconst_0        
	//   26   56:invokestatic    #39  <Method Boolean Boolean.valueOf(boolean)>
	//   27   59:areturn         
		}
		String s1 = super.zztr();
	//   28   60:aload_0         
	//   29   61:invokespecial   #46  <Method String zzsi.zztr()>
	//   30   64:astore_2        
		obj = ((Object) (String.valueOf(obj)));
	//   31   65:aload_1         
	//   32   66:invokestatic    #49  <Method String String.valueOf(Object)>
	//   33   69:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 28 + String.valueOf(obj).length());
	//   34   70:new             #51  <Class StringBuilder>
	//   35   73:dup             
	//   36   74:aload_2         
	//   37   75:invokestatic    #49  <Method String String.valueOf(Object)>
	//   38   78:invokevirtual   #55  <Method int String.length()>
	//   39   81:bipush          28
	//   40   83:iadd            
	//   41   84:aload_1         
	//   42   85:invokestatic    #49  <Method String String.valueOf(Object)>
	//   43   88:invokevirtual   #55  <Method int String.length()>
	//   44   91:iadd            
	//   45   92:invokespecial   #58  <Method void StringBuilder(int)>
	//   46   95:astore_3        
		stringbuilder.append("Invalid boolean value for ");
	//   47   96:aload_3         
	//   48   97:ldc1            #60  <String "Invalid boolean value for ">
	//   49   99:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
		stringbuilder.append(s1);
	//   51  103:aload_3         
	//   52  104:aload_2         
	//   53  105:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   54  108:pop             
		stringbuilder.append(": ");
	//   55  109:aload_3         
	//   56  110:ldc1            #66  <String ": ">
	//   57  112:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   58  115:pop             
		stringbuilder.append(((String) (obj)));
	//   59  116:aload_3         
	//   60  117:aload_1         
	//   61  118:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   62  121:pop             
		Log.e("PhenotypeFlag", stringbuilder.toString());
	//   63  122:ldc1            #68  <String "PhenotypeFlag">
	//   64  124:aload_3         
	//   65  125:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   66  128:invokestatic    #77  <Method int Log.e(String, String)>
	//   67  131:pop             
		return ((Object) (null));
	//   68  132:aconst_null     
	//   69  133:areturn         
	}
}
