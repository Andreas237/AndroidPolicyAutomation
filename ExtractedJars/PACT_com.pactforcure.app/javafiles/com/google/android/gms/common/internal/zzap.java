// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.*;

public class zzap
{

	public static String zza(String s, String s1, Context context, AttributeSet attributeset, boolean flag, boolean flag1, String s2)
	{
		if(attributeset == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       177
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_0        
		else
	//*   4    6:aload_0         
	//*   5    7:astore_3        
	//*   6    8:aload_0         
	//*   7    9:ifnull          126
	//*   8   12:aload_0         
	//*   9   13:astore_3        
	//*  10   14:aload_0         
	//*  11   15:ldc1            #10  <String "@string/">
	//*  12   17:invokevirtual   #16  <Method boolean String.startsWith(String)>
	//*  13   20:ifeq            126
	//*  14   23:aload_0         
	//*  15   24:astore_3        
	//*  16   25:iload           4
	//*  17   27:ifeq            126
	//*  18   30:aload_0         
	//*  19   31:ldc1            #10  <String "@string/">
	//*  20   33:invokevirtual   #20  <Method int String.length()>
	//*  21   36:invokevirtual   #24  <Method String String.substring(int)>
	//*  22   39:astore          7
	//*  23   41:aload_2         
	//*  24   42:invokevirtual   #30  <Method String Context.getPackageName()>
	//*  25   45:astore          8
	//*  26   47:new             #32  <Class TypedValue>
	//*  27   50:dup             
	//*  28   51:invokespecial   #36  <Method void TypedValue()>
	//*  29   54:astore_3        
	//*  30   55:aload_2         
	//*  31   56:invokevirtual   #40  <Method Resources Context.getResources()>
	//*  32   59:new             #42  <Class StringBuilder>
	//*  33   62:dup             
	//*  34   63:aload           8
	//*  35   65:invokestatic    #46  <Method String String.valueOf(Object)>
	//*  36   68:invokevirtual   #20  <Method int String.length()>
	//*  37   71:bipush          8
	//*  38   73:iadd            
	//*  39   74:aload           7
	//*  40   76:invokestatic    #46  <Method String String.valueOf(Object)>
	//*  41   79:invokevirtual   #20  <Method int String.length()>
	//*  42   82:iadd            
	//*  43   83:invokespecial   #49  <Method void StringBuilder(int)>
	//*  44   86:aload           8
	//*  45   88:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//*  46   91:ldc1            #55  <String ":string/">
	//*  47   93:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//*  48   96:aload           7
	//*  49   98:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//*  50  101:invokevirtual   #58  <Method String StringBuilder.toString()>
	//*  51  104:aload_3         
	//*  52  105:iconst_1        
	//*  53  106:invokevirtual   #64  <Method void Resources.getValue(String, TypedValue, boolean)>
	//*  54  109:aload_3         
	//*  55  110:getfield        #68  <Field CharSequence TypedValue.string>
	//*  56  113:ifnull          245
	//*  57  116:aload_3         
	//*  58  117:getfield        #68  <Field CharSequence TypedValue.string>
	//*  59  120:invokeinterface #71  <Method String CharSequence.toString()>
	//*  60  125:astore_3        
	//*  61  126:iload           5
	//*  62  128:ifeq            175
	//*  63  131:aload_3         
	//*  64  132:ifnonnull       175
	//*  65  135:aload           6
	//*  66  137:new             #42  <Class StringBuilder>
	//*  67  140:dup             
	//*  68  141:aload_1         
	//*  69  142:invokestatic    #46  <Method String String.valueOf(Object)>
	//*  70  145:invokevirtual   #20  <Method int String.length()>
	//*  71  148:bipush          33
	//*  72  150:iadd            
	//*  73  151:invokespecial   #49  <Method void StringBuilder(int)>
	//*  74  154:ldc1            #73  <String "Required XML attribute \"">
	//*  75  156:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//*  76  159:aload_1         
	//*  77  160:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//*  78  163:ldc1            #75  <String "\" missing">
	//*  79  165:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//*  80  168:invokevirtual   #58  <Method String StringBuilder.toString()>
	//*  81  171:invokestatic    #81  <Method int Log.w(String, String)>
	//*  82  174:pop             
	//*  83  175:aload_3         
	//*  84  176:areturn         
			s = attributeset.getAttributeValue(s, s1);
	//   85  177:aload_3         
	//   86  178:aload_0         
	//   87  179:aload_1         
	//   88  180:invokeinterface #87  <Method String AttributeSet.getAttributeValue(String, String)>
	//   89  185:astore_0        
		attributeset = ((AttributeSet) (s));
		if(s != null)
		{
			attributeset = ((AttributeSet) (s));
			if(s.startsWith("@string/"))
			{
				attributeset = ((AttributeSet) (s));
				if(flag)
				{
					String s3 = s.substring("@string/".length());
					String s4 = context.getPackageName();
					attributeset = ((AttributeSet) (new TypedValue()));
					try
					{
						context.getResources().getValue((new StringBuilder(String.valueOf(((Object) (s4))).length() + 8 + String.valueOf(((Object) (s3))).length())).append(s4).append(":string/").append(s3).toString(), ((TypedValue) (attributeset)), true);
					}
	//*  90  186:goto            6
					// Misplaced declaration of an exception variable
					catch(Context context)
	//*  91  189:astore_2        
					{
						Log.w(s2, (new StringBuilder(String.valueOf(((Object) (s1))).length() + 30 + String.valueOf(((Object) (s))).length())).append("Could not find resource for ").append(s1).append(": ").append(s).toString());
	//   92  190:aload           6
	//   93  192:new             #42  <Class StringBuilder>
	//   94  195:dup             
	//   95  196:aload_1         
	//   96  197:invokestatic    #46  <Method String String.valueOf(Object)>
	//   97  200:invokevirtual   #20  <Method int String.length()>
	//   98  203:bipush          30
	//   99  205:iadd            
	//  100  206:aload_0         
	//  101  207:invokestatic    #46  <Method String String.valueOf(Object)>
	//  102  210:invokevirtual   #20  <Method int String.length()>
	//  103  213:iadd            
	//  104  214:invokespecial   #49  <Method void StringBuilder(int)>
	//  105  217:ldc1            #89  <String "Could not find resource for ">
	//  106  219:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  107  222:aload_1         
	//  108  223:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  109  226:ldc1            #91  <String ": ">
	//  110  228:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  111  231:aload_0         
	//  112  232:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  113  235:invokevirtual   #58  <Method String StringBuilder.toString()>
	//  114  238:invokestatic    #81  <Method int Log.w(String, String)>
	//  115  241:pop             
					}
					if(((TypedValue) (attributeset)).string != null)
					{
						attributeset = ((AttributeSet) (((TypedValue) (attributeset)).string.toString()));
					} else
	//* 116  242:goto            109
					{
						context = ((Context) (String.valueOf(((Object) (attributeset)))));
	//  117  245:aload_3         
	//  118  246:invokestatic    #46  <Method String String.valueOf(Object)>
	//  119  249:astore_2        
						Log.w(s2, (new StringBuilder(String.valueOf(((Object) (s1))).length() + 28 + String.valueOf(((Object) (context))).length())).append("Resource ").append(s1).append(" was not a string: ").append(((String) (context))).toString());
	//  120  250:aload           6
	//  121  252:new             #42  <Class StringBuilder>
	//  122  255:dup             
	//  123  256:aload_1         
	//  124  257:invokestatic    #46  <Method String String.valueOf(Object)>
	//  125  260:invokevirtual   #20  <Method int String.length()>
	//  126  263:bipush          28
	//  127  265:iadd            
	//  128  266:aload_2         
	//  129  267:invokestatic    #46  <Method String String.valueOf(Object)>
	//  130  270:invokevirtual   #20  <Method int String.length()>
	//  131  273:iadd            
	//  132  274:invokespecial   #49  <Method void StringBuilder(int)>
	//  133  277:ldc1            #93  <String "Resource ">
	//  134  279:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  135  282:aload_1         
	//  136  283:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  137  286:ldc1            #95  <String " was not a string: ">
	//  138  288:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  139  291:aload_2         
	//  140  292:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  141  295:invokevirtual   #58  <Method String StringBuilder.toString()>
	//  142  298:invokestatic    #81  <Method int Log.w(String, String)>
	//  143  301:pop             
						attributeset = ((AttributeSet) (s));
	//  144  302:aload_0         
	//  145  303:astore_3        
					}
				}
			}
		}
		if(flag1 && attributeset == null)
			Log.w(s2, (new StringBuilder(String.valueOf(((Object) (s1))).length() + 33)).append("Required XML attribute \"").append(s1).append("\" missing").toString());
		return ((String) (attributeset));
	//* 146  304:goto            126
	}
}
