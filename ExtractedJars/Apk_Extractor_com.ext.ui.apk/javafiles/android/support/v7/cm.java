// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.content.Context;
import android.content.res.Resources;
import android.os.Environment;
import com.ext.ui.ExtractorApplication;

// Referenced classes of package android.support.v7:
//			cj, ci

public class cm
{

	public cm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	public static void a(String s)
	{
		cj.a().a(cj.c, s);
	//    0    0:invokestatic    #41  <Method cj cj.a()>
	//    1    3:getstatic       #43  <Field String cj.c>
	//    2    6:aload_0         
	//    3    7:invokevirtual   #46  <Method boolean cj.a(String, String)>
	//    4   10:pop             
	//    5   11:return          
	}

	public static void a(boolean flag)
	{
		cj.a().a(cj.d, flag);
	//    0    0:invokestatic    #41  <Method cj cj.a()>
	//    1    3:getstatic       #50  <Field String cj.d>
	//    2    6:iload_0         
	//    3    7:invokevirtual   #53  <Method boolean cj.a(String, boolean)>
	//    4   10:pop             
	//    5   11:return          
	}

	public static boolean a()
	{
		String s = Environment.getExternalStorageState();
	//    0    0:invokestatic    #59  <Method String Environment.getExternalStorageState()>
	//    1    3:astore_0        
		if(s.equals("mounted") || c())
	//*   2    4:aload_0         
	//*   3    5:ldc1            #61  <String "mounted">
	//*   4    7:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*   5   10:ifne            19
	//*   6   13:invokestatic    #69  <Method boolean c()>
	//*   7   16:ifeq            76
			c = true;
	//    8   19:iconst_1        
	//    9   20:putstatic       #71  <Field boolean c>
		else
	//*  10   23:getstatic       #33  <Field String a>
	//*  11   26:new             #13  <Class StringBuilder>
	//*  12   29:dup             
	//*  13   30:invokespecial   #16  <Method void StringBuilder()>
	//*  14   33:ldc1            #73  <String "SD card status :">
	//*  15   35:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//*  16   38:getstatic       #71  <Field boolean c>
	//*  17   41:invokevirtual   #76  <Method StringBuilder StringBuilder.append(boolean)>
	//*  18   44:ldc1            #78  <String " error msg :">
	//*  19   46:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//*  20   49:getstatic       #80  <Field String b>
	//*  21   52:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//*  22   55:ldc1            #82  <String " private path :">
	//*  23   57:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//*  24   60:invokestatic    #69  <Method boolean c()>
	//*  25   63:invokevirtual   #76  <Method StringBuilder StringBuilder.append(boolean)>
	//*  26   66:invokevirtual   #31  <Method String StringBuilder.toString()>
	//*  27   69:invokestatic    #87  <Method void ci.a(String, String)>
	//*  28   72:getstatic       #71  <Field boolean c>
	//*  29   75:ireturn         
		if(s.equals("mounted_ro"))
	//*  30   76:aload_0         
	//*  31   77:ldc1            #89  <String "mounted_ro">
	//*  32   79:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  33   82:ifeq            106
		{
			b = ExtractorApplication.a.getResources().getString(0x7f0d0002);
	//   34   85:getstatic       #94  <Field Context ExtractorApplication.a>
	//   35   88:invokevirtual   #100 <Method Resources Context.getResources()>
	//   36   91:ldc1            #101 <Int 0x7f0d0002>
	//   37   93:invokevirtual   #107 <Method String Resources.getString(int)>
	//   38   96:putstatic       #80  <Field String b>
			c = false;
	//   39   99:iconst_0        
	//   40  100:putstatic       #71  <Field boolean c>
		} else
	//*  41  103:goto            23
		if(s.equals("checking"))
	//*  42  106:aload_0         
	//*  43  107:ldc1            #109 <String "checking">
	//*  44  109:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  45  112:ifeq            136
		{
			b = ExtractorApplication.a.getResources().getString(0x7f0d0001);
	//   46  115:getstatic       #94  <Field Context ExtractorApplication.a>
	//   47  118:invokevirtual   #100 <Method Resources Context.getResources()>
	//   48  121:ldc1            #110 <Int 0x7f0d0001>
	//   49  123:invokevirtual   #107 <Method String Resources.getString(int)>
	//   50  126:putstatic       #80  <Field String b>
			c = false;
	//   51  129:iconst_0        
	//   52  130:putstatic       #71  <Field boolean c>
		} else
	//*  53  133:goto            23
		if(s.equals("nofs"))
	//*  54  136:aload_0         
	//*  55  137:ldc1            #112 <String "nofs">
	//*  56  139:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  57  142:ifeq            166
		{
			b = ExtractorApplication.a.getResources().getString(0x7f0d0003);
	//   58  145:getstatic       #94  <Field Context ExtractorApplication.a>
	//   59  148:invokevirtual   #100 <Method Resources Context.getResources()>
	//   60  151:ldc1            #113 <Int 0x7f0d0003>
	//   61  153:invokevirtual   #107 <Method String Resources.getString(int)>
	//   62  156:putstatic       #80  <Field String b>
			c = false;
	//   63  159:iconst_0        
	//   64  160:putstatic       #71  <Field boolean c>
		} else
	//*  65  163:goto            23
		if(s.equals("shared"))
	//*  66  166:aload_0         
	//*  67  167:ldc1            #115 <String "shared">
	//*  68  169:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  69  172:ifeq            196
		{
			b = ExtractorApplication.a.getResources().getString(0x7f0d0005);
	//   70  175:getstatic       #94  <Field Context ExtractorApplication.a>
	//   71  178:invokevirtual   #100 <Method Resources Context.getResources()>
	//   72  181:ldc1            #116 <Int 0x7f0d0005>
	//   73  183:invokevirtual   #107 <Method String Resources.getString(int)>
	//   74  186:putstatic       #80  <Field String b>
			c = false;
	//   75  189:iconst_0        
	//   76  190:putstatic       #71  <Field boolean c>
		} else
	//*  77  193:goto            23
		if(s.equals("removed"))
	//*  78  196:aload_0         
	//*  79  197:ldc1            #118 <String "removed">
	//*  80  199:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  81  202:ifeq            226
		{
			b = ExtractorApplication.a.getResources().getString(0x7f0d0004);
	//   82  205:getstatic       #94  <Field Context ExtractorApplication.a>
	//   83  208:invokevirtual   #100 <Method Resources Context.getResources()>
	//   84  211:ldc1            #119 <Int 0x7f0d0004>
	//   85  213:invokevirtual   #107 <Method String Resources.getString(int)>
	//   86  216:putstatic       #80  <Field String b>
			c = false;
	//   87  219:iconst_0        
	//   88  220:putstatic       #71  <Field boolean c>
		} else
	//*  89  223:goto            23
		if(s.equals("bad_removal"))
	//*  90  226:aload_0         
	//*  91  227:ldc1            #121 <String "bad_removal">
	//*  92  229:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*  93  232:ifeq            256
		{
			b = ExtractorApplication.a.getResources().getString(0x7f0d0000);
	//   94  235:getstatic       #94  <Field Context ExtractorApplication.a>
	//   95  238:invokevirtual   #100 <Method Resources Context.getResources()>
	//   96  241:ldc1            #122 <Int 0x7f0d0000>
	//   97  243:invokevirtual   #107 <Method String Resources.getString(int)>
	//   98  246:putstatic       #80  <Field String b>
			c = false;
	//   99  249:iconst_0        
	//  100  250:putstatic       #71  <Field boolean c>
		} else
	//* 101  253:goto            23
		if(s.equals("unmountable"))
	//* 102  256:aload_0         
	//* 103  257:ldc1            #124 <String "unmountable">
	//* 104  259:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 105  262:ifeq            286
		{
			b = ExtractorApplication.a.getResources().getString(0x7f0d0007);
	//  106  265:getstatic       #94  <Field Context ExtractorApplication.a>
	//  107  268:invokevirtual   #100 <Method Resources Context.getResources()>
	//  108  271:ldc1            #125 <Int 0x7f0d0007>
	//  109  273:invokevirtual   #107 <Method String Resources.getString(int)>
	//  110  276:putstatic       #80  <Field String b>
			c = false;
	//  111  279:iconst_0        
	//  112  280:putstatic       #71  <Field boolean c>
		} else
	//* 113  283:goto            23
		if(s.equals("unmounted"))
	//* 114  286:aload_0         
	//* 115  287:ldc1            #127 <String "unmounted">
	//* 116  289:invokevirtual   #67  <Method boolean String.equals(Object)>
	//* 117  292:ifeq            316
		{
			b = ExtractorApplication.a.getResources().getString(0x7f0d0008);
	//  118  295:getstatic       #94  <Field Context ExtractorApplication.a>
	//  119  298:invokevirtual   #100 <Method Resources Context.getResources()>
	//  120  301:ldc1            #128 <Int 0x7f0d0008>
	//  121  303:invokevirtual   #107 <Method String Resources.getString(int)>
	//  122  306:putstatic       #80  <Field String b>
			c = false;
	//  123  309:iconst_0        
	//  124  310:putstatic       #71  <Field boolean c>
		} else
	//* 125  313:goto            23
		{
			b = ExtractorApplication.a.getResources().getString(0x7f0d0006);
	//  126  316:getstatic       #94  <Field Context ExtractorApplication.a>
	//  127  319:invokevirtual   #100 <Method Resources Context.getResources()>
	//  128  322:ldc1            #129 <Int 0x7f0d0006>
	//  129  324:invokevirtual   #107 <Method String Resources.getString(int)>
	//  130  327:putstatic       #80  <Field String b>
			c = false;
	//  131  330:iconst_0        
	//  132  331:putstatic       #71  <Field boolean c>
		}
		ci.a(a, (new StringBuilder()).append("SD card status :").append(c).append(" error msg :").append(b).append(" private path :").append(c()).toString());
		return c;
	//* 133  334:goto            23
	}

	public static String b()
	{
		return b;
	//    0    0:getstatic       #80  <Field String b>
	//    1    3:areturn         
	}

	public static boolean c()
	{
		return cj.a().b(cj.d, false);
	//    0    0:invokestatic    #41  <Method cj cj.a()>
	//    1    3:getstatic       #50  <Field String cj.d>
	//    2    6:iconst_0        
	//    3    7:invokevirtual   #131 <Method boolean cj.b(String, boolean)>
	//    4   10:ireturn         
	}

	public static String d()
	{
		return cj.a().b(cj.c, cj.h);
	//    0    0:invokestatic    #41  <Method cj cj.a()>
	//    1    3:getstatic       #43  <Field String cj.c>
	//    2    6:getstatic       #134 <Field String cj.h>
	//    3    9:invokevirtual   #137 <Method String cj.b(String, String)>
	//    4   12:areturn         
	}

	private static final String a = (new StringBuilder()).append("").append(((Class) (android/support/v7/cm)).getSimpleName()).toString();
	private static String b;
	private static boolean c;

	static 
	{
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void StringBuilder()>
	//    3    7:ldc1            #18  <String "">
	//    4    9:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:ldc1            #2   <Class cm>
	//    6   14:invokevirtual   #28  <Method String Class.getSimpleName()>
	//    7   17:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:invokevirtual   #31  <Method String StringBuilder.toString()>
	//    9   23:putstatic       #33  <Field String a>
	//*  10   26:return          
	}
}
