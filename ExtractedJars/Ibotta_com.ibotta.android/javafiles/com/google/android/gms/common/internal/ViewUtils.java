// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.*;

public class ViewUtils
{

	private ViewUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getXmlAttributeString(String s, String s1, Context context, AttributeSet attributeset, boolean flag, boolean flag1, String s2)
	{
		if(attributeset == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       9
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_0        
		else
	//*   4    6:goto            18
			s = attributeset.getAttributeValue(s, s1);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #19  <Method String AttributeSet.getAttributeValue(String, String)>
	//    9   17:astore_0        
		attributeset = ((AttributeSet) (s));
	//   10   18:aload_0         
	//   11   19:astore_3        
		if(s != null)
	//*  12   20:aload_0         
	//*  13   21:ifnull          287
		{
			attributeset = ((AttributeSet) (s));
	//   14   24:aload_0         
	//   15   25:astore_3        
			if(s.startsWith("@string/"))
	//*  16   26:aload_0         
	//*  17   27:ldc1            #21  <String "@string/">
	//*  18   29:invokevirtual   #27  <Method boolean String.startsWith(String)>
	//*  19   32:ifeq            287
			{
				attributeset = ((AttributeSet) (s));
	//   20   35:aload_0         
	//   21   36:astore_3        
				if(flag)
	//*  22   37:iload           4
	//*  23   39:ifeq            287
				{
					String s3 = s.substring(8);
	//   24   42:aload_0         
	//   25   43:bipush          8
	//   26   45:invokevirtual   #31  <Method String String.substring(int)>
	//   27   48:astore          7
					String s4 = context.getPackageName();
	//   28   50:aload_2         
	//   29   51:invokevirtual   #37  <Method String Context.getPackageName()>
	//   30   54:astore          8
					attributeset = ((AttributeSet) (new TypedValue()));
	//   31   56:new             #39  <Class TypedValue>
	//   32   59:dup             
	//   33   60:invokespecial   #40  <Method void TypedValue()>
	//   34   63:astore_3        
					try
					{
						context = ((Context) (context.getResources()));
	//   35   64:aload_2         
	//   36   65:invokevirtual   #44  <Method Resources Context.getResources()>
	//   37   68:astore_2        
						StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s4))).length() + 8 + String.valueOf(((Object) (s3))).length());
	//   38   69:new             #46  <Class StringBuilder>
	//   39   72:dup             
	//   40   73:aload           8
	//   41   75:invokestatic    #50  <Method String String.valueOf(Object)>
	//   42   78:invokevirtual   #54  <Method int String.length()>
	//   43   81:bipush          8
	//   44   83:iadd            
	//   45   84:aload           7
	//   46   86:invokestatic    #50  <Method String String.valueOf(Object)>
	//   47   89:invokevirtual   #54  <Method int String.length()>
	//   48   92:iadd            
	//   49   93:invokespecial   #57  <Method void StringBuilder(int)>
	//   50   96:astore          9
						stringbuilder.append(s4);
	//   51   98:aload           9
	//   52  100:aload           8
	//   53  102:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   54  105:pop             
						stringbuilder.append(":string/");
	//   55  106:aload           9
	//   56  108:ldc1            #63  <String ":string/">
	//   57  110:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   58  113:pop             
						stringbuilder.append(s3);
	//   59  114:aload           9
	//   60  116:aload           7
	//   61  118:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   62  121:pop             
						((Resources) (context)).getValue(stringbuilder.toString(), ((TypedValue) (attributeset)), true);
	//   63  122:aload_2         
	//   64  123:aload           9
	//   65  125:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   66  128:aload_3         
	//   67  129:iconst_1        
	//   68  130:invokevirtual   #72  <Method void Resources.getValue(String, TypedValue, boolean)>
					}
	//*  69  133:goto            198
	//*  70  136:new             #46  <Class StringBuilder>
	//*  71  139:dup             
	//*  72  140:aload_1         
	//*  73  141:invokestatic    #50  <Method String String.valueOf(Object)>
	//*  74  144:invokevirtual   #54  <Method int String.length()>
	//*  75  147:bipush          30
	//*  76  149:iadd            
	//*  77  150:aload_0         
	//*  78  151:invokestatic    #50  <Method String String.valueOf(Object)>
	//*  79  154:invokevirtual   #54  <Method int String.length()>
	//*  80  157:iadd            
	//*  81  158:invokespecial   #57  <Method void StringBuilder(int)>
	//*  82  161:astore_2        
	//*  83  162:aload_2         
	//*  84  163:ldc1            #74  <String "Could not find resource for ">
	//*  85  165:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//*  86  168:pop             
	//*  87  169:aload_2         
	//*  88  170:aload_1         
	//*  89  171:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//*  90  174:pop             
	//*  91  175:aload_2         
	//*  92  176:ldc1            #76  <String ": ">
	//*  93  178:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//*  94  181:pop             
	//*  95  182:aload_2         
	//*  96  183:aload_0         
	//*  97  184:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//*  98  187:pop             
	//*  99  188:aload           6
	//* 100  190:aload_2         
	//* 101  191:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 102  194:invokestatic    #82  <Method int Log.w(String, String)>
	//* 103  197:pop             
	//* 104  198:aload_3         
	//* 105  199:getfield        #86  <Field CharSequence TypedValue.string>
	//* 106  202:ifnull          218
	//* 107  205:aload_3         
	//* 108  206:getfield        #86  <Field CharSequence TypedValue.string>
	//* 109  209:invokeinterface #89  <Method String CharSequence.toString()>
	//* 110  214:astore_3        
	//* 111  215:goto            287
	//* 112  218:aload_3         
	//* 113  219:invokestatic    #50  <Method String String.valueOf(Object)>
	//* 114  222:astore_2        
	//* 115  223:new             #46  <Class StringBuilder>
	//* 116  226:dup             
	//* 117  227:aload_1         
	//* 118  228:invokestatic    #50  <Method String String.valueOf(Object)>
	//* 119  231:invokevirtual   #54  <Method int String.length()>
	//* 120  234:bipush          28
	//* 121  236:iadd            
	//* 122  237:aload_2         
	//* 123  238:invokestatic    #50  <Method String String.valueOf(Object)>
	//* 124  241:invokevirtual   #54  <Method int String.length()>
	//* 125  244:iadd            
	//* 126  245:invokespecial   #57  <Method void StringBuilder(int)>
	//* 127  248:astore_3        
	//* 128  249:aload_3         
	//* 129  250:ldc1            #91  <String "Resource ">
	//* 130  252:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 131  255:pop             
	//* 132  256:aload_3         
	//* 133  257:aload_1         
	//* 134  258:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 135  261:pop             
	//* 136  262:aload_3         
	//* 137  263:ldc1            #93  <String " was not a string: ">
	//* 138  265:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 139  268:pop             
	//* 140  269:aload_3         
	//* 141  270:aload_2         
	//* 142  271:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 143  274:pop             
	//* 144  275:aload           6
	//* 145  277:aload_3         
	//* 146  278:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 147  281:invokestatic    #82  <Method int Log.w(String, String)>
	//* 148  284:pop             
	//* 149  285:aload_0         
	//* 150  286:astore_3        
	//* 151  287:iload           5
	//* 152  289:ifeq            344
	//* 153  292:aload_3         
	//* 154  293:ifnonnull       344
	//* 155  296:new             #46  <Class StringBuilder>
	//* 156  299:dup             
	//* 157  300:aload_1         
	//* 158  301:invokestatic    #50  <Method String String.valueOf(Object)>
	//* 159  304:invokevirtual   #54  <Method int String.length()>
	//* 160  307:bipush          33
	//* 161  309:iadd            
	//* 162  310:invokespecial   #57  <Method void StringBuilder(int)>
	//* 163  313:astore_0        
	//* 164  314:aload_0         
	//* 165  315:ldc1            #95  <String "Required XML attribute \"">
	//* 166  317:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 167  320:pop             
	//* 168  321:aload_0         
	//* 169  322:aload_1         
	//* 170  323:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 171  326:pop             
	//* 172  327:aload_0         
	//* 173  328:ldc1            #97  <String "\" missing">
	//* 174  330:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 175  333:pop             
	//* 176  334:aload           6
	//* 177  336:aload_0         
	//* 178  337:invokevirtual   #66  <Method String StringBuilder.toString()>
	//* 179  340:invokestatic    #82  <Method int Log.w(String, String)>
	//* 180  343:pop             
	//* 181  344:aload_3         
	//* 182  345:areturn         
					// Misplaced declaration of an exception variable
					catch(Context context)
					{
						context = ((Context) (new StringBuilder(String.valueOf(((Object) (s1))).length() + 30 + String.valueOf(((Object) (s))).length())));
						((StringBuilder) (context)).append("Could not find resource for ");
						((StringBuilder) (context)).append(s1);
						((StringBuilder) (context)).append(": ");
						((StringBuilder) (context)).append(s);
						Log.w(s2, ((StringBuilder) (context)).toString());
					}
					if(((TypedValue) (attributeset)).string != null)
					{
						attributeset = ((AttributeSet) (((TypedValue) (attributeset)).string.toString()));
					} else
					{
						context = ((Context) (String.valueOf(((Object) (attributeset)))));
						attributeset = ((AttributeSet) (new StringBuilder(String.valueOf(((Object) (s1))).length() + 28 + String.valueOf(((Object) (context))).length())));
						((StringBuilder) (attributeset)).append("Resource ");
						((StringBuilder) (attributeset)).append(s1);
						((StringBuilder) (attributeset)).append(" was not a string: ");
						((StringBuilder) (attributeset)).append(((String) (context)));
						Log.w(s2, ((StringBuilder) (attributeset)).toString());
						attributeset = ((AttributeSet) (s));
					}
				}
			}
		}
		if(flag1 && attributeset == null)
		{
			s = ((String) (new StringBuilder(String.valueOf(((Object) (s1))).length() + 33)));
			((StringBuilder) (s)).append("Required XML attribute \"");
			((StringBuilder) (s)).append(s1);
			((StringBuilder) (s)).append("\" missing");
			Log.w(s2, ((StringBuilder) (s)).toString());
		}
		return ((String) (attributeset));
	//* 183  346:astore_2        
	//* 184  347:goto            136
	}
}
