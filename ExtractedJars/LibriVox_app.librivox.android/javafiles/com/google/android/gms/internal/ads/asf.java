// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			arh, ars

abstract class asf
{

	asf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	static ars a(Class class1)
	{
		Object obj;
		Object obj2;
		obj2 = ((Object) (((Class) (com/google/android/gms/internal/ads/asf)).getClassLoader()));
	//    0    0:ldc1            #2   <Class asf>
	//    1    2:invokevirtual   #51  <Method ClassLoader Class.getClassLoader()>
	//    2    5:astore_2        
		if(((Object) (class1)).equals(com/google/android/gms/internal/ads/ars))
	//*   3    6:aload_0         
	//*   4    7:ldc1            #53  <Class ars>
	//*   5    9:invokevirtual   #57  <Method boolean Object.equals(Object)>
	//*   6   12:ifeq            22
		{
			obj = ((Object) (b));
	//    7   15:getstatic       #30  <Field String b>
	//    8   18:astore_1        
		} else
	//*   9   19:goto            64
		{
			if(!((Object) (class1.getPackage())).equals(((Object) (((Class) (com/google/android/gms/internal/ads/asf)).getPackage()))))
				break MISSING_BLOCK_LABEL_349;
	//   10   22:aload_0         
	//   11   23:invokevirtual   #61  <Method Package Class.getPackage()>
	//   12   26:ldc1            #2   <Class asf>
	//   13   28:invokevirtual   #61  <Method Package Class.getPackage()>
	//   14   31:invokevirtual   #57  <Method boolean Object.equals(Object)>
	//   15   34:ifeq            349
			obj = ((Object) (String.format("%s.BlazeGenerated%sLoader", new Object[] {
				class1.getPackage().getName(), class1.getSimpleName()
			})));
	//   16   37:ldc1            #63  <String "%s.BlazeGenerated%sLoader">
	//   17   39:iconst_2        
	//   18   40:anewarray       Object[]
	//   19   43:dup             
	//   20   44:iconst_0        
	//   21   45:aload_0         
	//   22   46:invokevirtual   #61  <Method Package Class.getPackage()>
	//   23   49:invokevirtual   #66  <Method String Package.getName()>
	//   24   52:aastore         
	//   25   53:dup             
	//   26   54:iconst_1        
	//   27   55:aload_0         
	//   28   56:invokevirtual   #69  <Method String Class.getSimpleName()>
	//   29   59:aastore         
	//   30   60:invokestatic    #75  <Method String String.format(String, Object[])>
	//   31   63:astore_1        
		}
		obj = ((Object) (Class.forName(((String) (obj)), true, ((ClassLoader) (obj2)))));
	//   32   64:aload_1         
	//   33   65:iconst_1        
	//   34   66:aload_2         
	//   35   67:invokestatic    #79  <Method Class Class.forName(String, boolean, ClassLoader)>
	//   36   70:astore_1        
		obj = ((Object) ((asf)((Class) (obj)).getConstructor(new Class[0]).newInstance(new Object[0])));
	//   37   71:aload_1         
	//   38   72:iconst_0        
	//   39   73:anewarray       Class[]
	//   40   76:invokevirtual   #83  <Method Constructor Class.getConstructor(Class[])>
	//   41   79:iconst_0        
	//   42   80:anewarray       Object[]
	//   43   83:invokevirtual   #89  <Method Object Constructor.newInstance(Object[])>
	//   44   86:checkcast       #2   <Class asf>
	//   45   89:astore_1        
		return (ars)class1.cast(((Object) (((asf) (obj)).a())));
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:invokevirtual   #92  <Method ars a()>
	//   49   95:invokevirtual   #96  <Method Object Class.cast(Object)>
	//   50   98:checkcast       #53  <Class ars>
	//   51  101:areturn         
		Object obj1;
		obj1;
	//   52  102:astore_1        
		try
		{
			throw new IllegalStateException(((Throwable) (obj1)));
	//   53  103:new             #98  <Class IllegalStateException>
	//   54  106:dup             
	//   55  107:aload_1         
	//   56  108:invokespecial   #101 <Method void IllegalStateException(Throwable)>
	//   57  111:athrow          
		}
	//*  58  112:astore_1        
	//*  59  113:new             #98  <Class IllegalStateException>
	//*  60  116:dup             
	//*  61  117:aload_1         
	//*  62  118:invokespecial   #101 <Method void IllegalStateException(Throwable)>
	//*  63  121:athrow          
	//*  64  122:astore_1        
	//*  65  123:new             #98  <Class IllegalStateException>
	//*  66  126:dup             
	//*  67  127:aload_1         
	//*  68  128:invokespecial   #101 <Method void IllegalStateException(Throwable)>
	//*  69  131:athrow          
	//*  70  132:astore_1        
	//*  71  133:new             #98  <Class IllegalStateException>
	//*  72  136:dup             
	//*  73  137:aload_1         
	//*  74  138:invokespecial   #101 <Method void IllegalStateException(Throwable)>
	//*  75  141:athrow          
	//*  76  142:ldc1            #2   <Class asf>
	//*  77  144:aload_2         
	//*  78  145:invokestatic    #107 <Method ServiceLoader ServiceLoader.load(Class, ClassLoader)>
	//*  79  148:invokevirtual   #111 <Method Iterator ServiceLoader.iterator()>
	//*  80  151:astore_2        
	//*  81  152:new             #113 <Class ArrayList>
	//*  82  155:dup             
	//*  83  156:invokespecial   #114 <Method void ArrayList()>
	//*  84  159:astore_3        
	//*  85  160:aload_2         
	//*  86  161:invokeinterface #120 <Method boolean Iterator.hasNext()>
	//*  87  166:ifeq            260
	//*  88  169:aload_3         
	//*  89  170:aload_0         
	//*  90  171:aload_2         
	//*  91  172:invokeinterface #124 <Method Object Iterator.next()>
	//*  92  177:checkcast       #2   <Class asf>
	//*  93  180:invokevirtual   #92  <Method ars a()>
	//*  94  183:invokevirtual   #96  <Method Object Class.cast(Object)>
	//*  95  186:checkcast       #53  <Class ars>
	//*  96  189:invokevirtual   #127 <Method boolean ArrayList.add(Object)>
	//*  97  192:pop             
	//*  98  193:goto            160
	//*  99  196:astore          4
	//* 100  198:getstatic       #26  <Field Logger a>
	//* 101  201:astore          5
	//* 102  203:getstatic       #133 <Field Level Level.SEVERE>
	//* 103  206:astore          6
	//* 104  208:aload_0         
	//* 105  209:invokevirtual   #69  <Method String Class.getSimpleName()>
	//* 106  212:invokestatic    #137 <Method String String.valueOf(Object)>
	//* 107  215:astore_1        
	//* 108  216:aload_1         
	//* 109  217:invokevirtual   #141 <Method int String.length()>
	//* 110  220:ifeq            233
	//* 111  223:ldc1            #143 <String "Unable to load ">
	//* 112  225:aload_1         
	//* 113  226:invokevirtual   #147 <Method String String.concat(String)>
	//* 114  229:astore_1        
	//* 115  230:goto            243
	//* 116  233:new             #71  <Class String>
	//* 117  236:dup             
	//* 118  237:ldc1            #143 <String "Unable to load ">
	//* 119  239:invokespecial   #150 <Method void String(String)>
	//* 120  242:astore_1        
	//* 121  243:aload           5
	//* 122  245:aload           6
	//* 123  247:ldc1            #152 <String "com.google.protobuf.GeneratedExtensionRegistryLoader">
	//* 124  249:ldc1            #153 <String "load">
	//* 125  251:aload_1         
	//* 126  252:aload           4
	//* 127  254:invokevirtual   #157 <Method void Logger.logp(Level, String, String, String, Throwable)>
	//* 128  257:goto            160
	//* 129  260:aload_3         
	//* 130  261:invokevirtual   #160 <Method int ArrayList.size()>
	//* 131  264:iconst_1        
	//* 132  265:icmpne          277
	//* 133  268:aload_3         
	//* 134  269:iconst_0        
	//* 135  270:invokevirtual   #164 <Method Object ArrayList.get(int)>
	//* 136  273:checkcast       #53  <Class ars>
	//* 137  276:areturn         
	//* 138  277:aload_3         
	//* 139  278:invokevirtual   #160 <Method int ArrayList.size()>
	//* 140  281:ifne            286
	//* 141  284:aconst_null     
	//* 142  285:areturn         
	//* 143  286:aload_0         
	//* 144  287:ldc1            #166 <String "combine">
	//* 145  289:iconst_1        
	//* 146  290:anewarray       Class[]
	//* 147  293:dup             
	//* 148  294:iconst_0        
	//* 149  295:ldc1            #168 <Class Collection>
	//* 150  297:aastore         
	//* 151  298:invokevirtual   #172 <Method Method Class.getMethod(String, Class[])>
	//* 152  301:aconst_null     
	//* 153  302:iconst_1        
	//* 154  303:anewarray       Object[]
	//* 155  306:dup             
	//* 156  307:iconst_0        
	//* 157  308:aload_3         
	//* 158  309:aastore         
	//* 159  310:invokevirtual   #178 <Method Object Method.invoke(Object, Object[])>
	//* 160  313:checkcast       #53  <Class ars>
	//* 161  316:astore_0        
	//* 162  317:aload_0         
	//* 163  318:areturn         
	//* 164  319:astore_0        
	//* 165  320:new             #98  <Class IllegalStateException>
	//* 166  323:dup             
	//* 167  324:aload_0         
	//* 168  325:invokespecial   #101 <Method void IllegalStateException(Throwable)>
	//* 169  328:athrow          
	//* 170  329:astore_0        
	//* 171  330:new             #98  <Class IllegalStateException>
	//* 172  333:dup             
	//* 173  334:aload_0         
	//* 174  335:invokespecial   #101 <Method void IllegalStateException(Throwable)>
	//* 175  338:athrow          
	//* 176  339:astore_0        
	//* 177  340:new             #98  <Class IllegalStateException>
	//* 178  343:dup             
	//* 179  344:aload_0         
	//* 180  345:invokespecial   #101 <Method void IllegalStateException(Throwable)>
	//* 181  348:athrow          
	//* 182  349:new             #180 <Class IllegalArgumentException>
	//* 183  352:dup             
	//* 184  353:aload_0         
	//* 185  354:invokevirtual   #18  <Method String Class.getName()>
	//* 186  357:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//* 187  360:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			obj2 = ((Object) (ServiceLoader.load(com/google/android/gms/internal/ads/asf, ((ClassLoader) (obj2))).iterator()));
		}
		break MISSING_BLOCK_LABEL_152;
		obj1;
		throw new IllegalStateException(((Throwable) (obj1)));
		obj1;
		throw new IllegalStateException(((Throwable) (obj1)));
		obj1;
		throw new IllegalStateException(((Throwable) (obj1)));
		ArrayList arraylist = new ArrayList();
		while(((Iterator) (obj2)).hasNext()) 
			try
			{
				arraylist.add(((Object) ((ars)class1.cast(((Object) (((asf)((Iterator) (obj2)).next()).a()))))));
			}
			catch(ServiceConfigurationError serviceconfigurationerror)
			{
				Logger logger = a;
				Level level = Level.SEVERE;
				String s = String.valueOf(((Object) (class1.getSimpleName())));
				if(s.length() != 0)
					s = "Unable to load ".concat(s);
				else
					s = new String("Unable to load ");
				logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", s, ((Throwable) (serviceconfigurationerror)));
			}
		if(arraylist.size() == 1)
			return (ars)arraylist.get(0);
		if(arraylist.size() == 0)
			return null;
		try
		{
			class1 = ((Class) ((ars)class1.getMethod("combine", new Class[] {
				java/util/Collection
			}).invoke(((Object) (null)), new Object[] {
				arraylist
			})));
		}
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			throw new IllegalStateException(((Throwable) (class1)));
		}
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			throw new IllegalStateException(((Throwable) (class1)));
		}
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			throw new IllegalStateException(((Throwable) (class1)));
		}
		return ((ars) (class1));
		throw new IllegalArgumentException(class1.getName());
	//* 188  361:astore_1        
	//* 189  362:goto            142
	}

	protected abstract ars a();

	private static final Logger a = Logger.getLogger(((Class) (com/google/android/gms/internal/ads/arh)).getName());
	private static String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

	static 
	{
	//    0    0:ldc1            #12  <Class arh>
	//    1    2:invokevirtual   #18  <Method String Class.getName()>
	//    2    5:invokestatic    #24  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #26  <Field Logger a>
	//    4   11:ldc1            #28  <String "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader">
	//    5   13:putstatic       #30  <Field String b>
	//*   6   16:return          
	}
}
