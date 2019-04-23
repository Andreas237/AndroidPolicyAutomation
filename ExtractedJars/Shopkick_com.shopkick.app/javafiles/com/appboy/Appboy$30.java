// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.*;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import com.appboy.support.ValidationUtils;
import java.math.BigDecimal;
import java.util.Locale;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$30
	implements Runnable
{

	public void run()
	{
		String s;
		String s1;
		Object obj;
		s1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String a>
	//    2    4:astore_2        
		obj = ((Object) (b));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field String b>
	//    5    9:astore_3        
		if(obj != null)
			break MISSING_BLOCK_LABEL_75;
	//    6   10:aload_3         
	//    7   11:ifnonnull       75
		s = s1;
	//    8   14:aload_2         
	//    9   15:astore_1        
		obj = ((Object) (Appboy.b()));
	//   10   16:invokestatic    #46  <Method String Appboy.b()>
	//   11   19:astore_3        
		s = s1;
	//   12   20:aload_2         
	//   13   21:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   14   22:new             #48  <Class StringBuilder>
	//   15   25:dup             
	//   16   26:invokespecial   #49  <Method void StringBuilder()>
	//   17   29:astore          4
		s = s1;
	//   18   31:aload_2         
	//   19   32:astore_1        
		stringbuilder.append("The currencyCode is null. Expected one of ");
	//   20   33:aload           4
	//   21   35:ldc1            #51  <String "The currencyCode is null. Expected one of ">
	//   22   37:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		s = s1;
	//   24   41:aload_2         
	//   25   42:astore_1        
		stringbuilder.append(((Object) (Appboy.e())));
	//   26   43:aload           4
	//   27   45:invokestatic    #58  <Method java.util.Set Appboy.e()>
	//   28   48:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   29   51:pop             
		s = s1;
	//   30   52:aload_2         
	//   31   53:astore_1        
		stringbuilder.append(". Not logging in-app purchase to Appboy.");
	//   32   54:aload           4
	//   33   56:ldc1            #63  <String ". Not logging in-app purchase to Appboy.">
	//   34   58:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   35   61:pop             
		s = s1;
	//   36   62:aload_2         
	//   37   63:astore_1        
		try
		{
			AppboyLogger.w(((String) (obj)), stringbuilder.toString());
	//   38   64:aload_3         
	//   39   65:aload           4
	//   40   67:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   41   70:invokestatic    #72  <Method int AppboyLogger.w(String, String)>
	//   42   73:pop             
			return;
	//   43   74:return          
		}
	//*  44   75:aload_2         
	//*  45   76:astore_1        
	//*  46   77:aload_3         
	//*  47   78:invokevirtual   #77  <Method String String.trim()>
	//*  48   81:getstatic       #83  <Field Locale Locale.US>
	//*  49   84:invokevirtual   #87  <Method String String.toUpperCase(Locale)>
	//*  50   87:astore_3        
	//*  51   88:aload_2         
	//*  52   89:astore_1        
	//*  53   90:aload_2         
	//*  54   91:aload_3         
	//*  55   92:aload_0         
	//*  56   93:getfield        #32  <Field BigDecimal c>
	//*  57   96:aload_0         
	//*  58   97:getfield        #34  <Field int d>
	//*  59  100:aload_0         
	//*  60  101:getfield        #26  <Field Appboy f>
	//*  61  104:getfield        #90  <Field bo.app.dh Appboy.f>
	//*  62  107:invokestatic    #58  <Method java.util.Set Appboy.e()>
	//*  63  110:invokestatic    #96  <Method boolean ValidationUtils.isValidLogPurchaseInput(String, String, BigDecimal, int, bo.app.dh, java.util.Set)>
	//*  64  113:ifne            128
	//*  65  116:aload_2         
	//*  66  117:astore_1        
	//*  67  118:invokestatic    #46  <Method String Appboy.b()>
	//*  68  121:ldc1            #98  <String "Log purchase input was invalid. Not logging in-app purchase to Appboy.">
	//*  69  123:invokestatic    #72  <Method int AppboyLogger.w(String, String)>
	//*  70  126:pop             
	//*  71  127:return          
	//*  72  128:aload_2         
	//*  73  129:astore_1        
	//*  74  130:aload_2         
	//*  75  131:invokestatic    #102 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//*  76  134:astore_2        
	//*  77  135:aload_2         
	//*  78  136:astore_1        
	//*  79  137:aload_2         
	//*  80  138:aload_3         
	//*  81  139:aload_0         
	//*  82  140:getfield        #32  <Field BigDecimal c>
	//*  83  143:aload_0         
	//*  84  144:getfield        #34  <Field int d>
	//*  85  147:aload_0         
	//*  86  148:getfield        #36  <Field AppboyProperties e>
	//*  87  151:invokestatic    #107 <Method cc cc.a(String, String, BigDecimal, int, AppboyProperties)>
	//*  88  154:astore_3        
	//*  89  155:aload_2         
	//*  90  156:astore_1        
	//*  91  157:aload_0         
	//*  92  158:getfield        #26  <Field Appboy f>
	//*  93  161:getfield        #111 <Field bf Appboy.g>
	//*  94  164:aload_3         
	//*  95  165:invokevirtual   #116 <Method boolean bf.a(bo.app.bu)>
	//*  96  168:ifeq            245
	//*  97  171:aload_2         
	//*  98  172:astore_1        
	//*  99  173:aload_0         
	//* 100  174:getfield        #26  <Field Appboy f>
	//* 101  177:getfield        #119 <Field fp Appboy.d>
	//* 102  180:new             #121 <Class ff>
	//* 103  183:dup             
	//* 104  184:aload_2         
	//* 105  185:aload_0         
	//* 106  186:getfield        #36  <Field AppboyProperties e>
	//* 107  189:aload_3         
	//* 108  190:invokespecial   #124 <Method void ff(String, AppboyProperties, bo.app.bu)>
	//* 109  193:invokevirtual   #129 <Method void fp.a(bo.app.fb)>
	//* 110  196:return          
		catch(Exception exception)
	//* 111  197:astore_2        
		{
			String s2 = Appboy.b();
	//  112  198:invokestatic    #46  <Method String Appboy.b()>
	//  113  201:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//  114  202:new             #48  <Class StringBuilder>
	//  115  205:dup             
	//  116  206:invokespecial   #49  <Method void StringBuilder()>
	//  117  209:astore          4
			stringbuilder1.append("Failed to log purchase event of ");
	//  118  211:aload           4
	//  119  213:ldc1            #131 <String "Failed to log purchase event of ">
	//  120  215:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  121  218:pop             
			stringbuilder1.append(s);
	//  122  219:aload           4
	//  123  221:aload_1         
	//  124  222:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//  125  225:pop             
			AppboyLogger.w(s2, stringbuilder1.toString(), ((Throwable) (exception)));
	//  126  226:aload_3         
	//  127  227:aload           4
	//  128  229:invokevirtual   #66  <Method String StringBuilder.toString()>
	//  129  232:aload_2         
	//  130  233:invokestatic    #134 <Method int AppboyLogger.w(String, String, Throwable)>
	//  131  236:pop             
			Appboy.a(f, ((Throwable) (exception)));
	//  132  237:aload_0         
	//  133  238:getfield        #26  <Field Appboy f>
	//  134  241:aload_2         
	//  135  242:invokestatic    #137 <Method void Appboy.a(Appboy, Throwable)>
		}
		break MISSING_BLOCK_LABEL_245;
		s = s1;
		obj = ((Object) (((String) (obj)).trim().toUpperCase(Locale.US)));
		s = s1;
		if(ValidationUtils.isValidLogPurchaseInput(s1, ((String) (obj)), c, d, f.f, Appboy.e()))
			break MISSING_BLOCK_LABEL_128;
		s = s1;
		AppboyLogger.w(Appboy.b(), "Log purchase input was invalid. Not logging in-app purchase to Appboy.");
		return;
		s = s1;
		s1 = ValidationUtils.ensureAppboyFieldLength(s1);
		s = s1;
		obj = ((Object) (cc.a(s1, ((String) (obj)), c, d, e)));
		s = s1;
		if(!f.g.a(((bo.app.bu) (obj))))
			break MISSING_BLOCK_LABEL_245;
		s = s1;
		f.d.a(((bo.app.fb) (new ff(s1, e, ((bo.app.bu) (obj))))));
		return;
	//  136  245:return          
	}

	final String a;
	final String b;
	final BigDecimal c;
	final int d;
	final AppboyProperties e;
	final Appboy f;

	Appboy$30(Appboy appboy, String s, String s1, BigDecimal bigdecimal, int i, AppboyProperties appboyproperties)
	{
		f = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Appboy f>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field String b>
		c = bigdecimal;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field BigDecimal c>
		d = i;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #34  <Field int d>
		e = appboyproperties;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #36  <Field AppboyProperties e>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #39  <Method void Object()>
	//   20   37:return          
	}
}
