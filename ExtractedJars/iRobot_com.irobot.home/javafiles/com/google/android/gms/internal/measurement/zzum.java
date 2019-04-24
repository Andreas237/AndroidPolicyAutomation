// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztv, zzub

abstract class zzum
{

	zzum()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	static zzub zzd(Class class1)
	{
		Object obj;
		Object obj2;
		obj2 = ((Object) (((Class) (com/google/android/gms/internal/measurement/zzum)).getClassLoader()));
	//    0    0:ldc1            #2   <Class zzum>
	//    1    2:invokevirtual   #51  <Method ClassLoader Class.getClassLoader()>
	//    2    5:astore_2        
		if(((Object) (class1)).equals(com/google/android/gms/internal/measurement/zzub))
	//*   3    6:aload_0         
	//*   4    7:ldc1            #53  <Class zzub>
	//*   5    9:invokevirtual   #57  <Method boolean Object.equals(Object)>
	//*   6   12:ifeq            22
		{
			obj = ((Object) (zzbyd));
	//    7   15:getstatic       #59  <Field String zzbyd>
	//    8   18:astore_1        
		} else
	//*   9   19:goto            76
		{
			if(!((Object) (class1.getPackage())).equals(((Object) (((Class) (com/google/android/gms/internal/measurement/zzum)).getPackage()))))
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #63  <Method Package Class.getPackage()>
	//*  12   26:ldc1            #2   <Class zzum>
	//*  13   28:invokevirtual   #63  <Method Package Class.getPackage()>
	//*  14   31:invokevirtual   #57  <Method boolean Object.equals(Object)>
	//*  15   34:ifne            49
				throw new IllegalArgumentException(class1.getName());
	//   16   37:new             #65  <Class IllegalArgumentException>
	//   17   40:dup             
	//   18   41:aload_0         
	//   19   42:invokevirtual   #21  <Method String Class.getName()>
	//   20   45:invokespecial   #68  <Method void IllegalArgumentException(String)>
	//   21   48:athrow          
			obj = ((Object) (String.format("%s.BlazeGenerated%sLoader", new Object[] {
				class1.getPackage().getName(), class1.getSimpleName()
			})));
	//   22   49:ldc1            #70  <String "%s.BlazeGenerated%sLoader">
	//   23   51:iconst_2        
	//   24   52:anewarray       Object[]
	//   25   55:dup             
	//   26   56:iconst_0        
	//   27   57:aload_0         
	//   28   58:invokevirtual   #63  <Method Package Class.getPackage()>
	//   29   61:invokevirtual   #73  <Method String Package.getName()>
	//   30   64:aastore         
	//   31   65:dup             
	//   32   66:iconst_1        
	//   33   67:aload_0         
	//   34   68:invokevirtual   #76  <Method String Class.getSimpleName()>
	//   35   71:aastore         
	//   36   72:invokestatic    #82  <Method String String.format(String, Object[])>
	//   37   75:astore_1        
		}
		obj = ((Object) (Class.forName(((String) (obj)), true, ((ClassLoader) (obj2)))));
	//   38   76:aload_1         
	//   39   77:iconst_1        
	//   40   78:aload_2         
	//   41   79:invokestatic    #86  <Method Class Class.forName(String, boolean, ClassLoader)>
	//   42   82:astore_1        
		obj = ((Object) ((zzum)((Class) (obj)).getConstructor(new Class[0]).newInstance(new Object[0])));
	//   43   83:aload_1         
	//   44   84:iconst_0        
	//   45   85:anewarray       Class[]
	//   46   88:invokevirtual   #90  <Method Constructor Class.getConstructor(Class[])>
	//   47   91:iconst_0        
	//   48   92:anewarray       Object[]
	//   49   95:invokevirtual   #96  <Method Object Constructor.newInstance(Object[])>
	//   50   98:checkcast       #2   <Class zzum>
	//   51  101:astore_1        
		return (zzub)class1.cast(((Object) (((zzum) (obj)).zzwd())));
	//   52  102:aload_0         
	//   53  103:aload_1         
	//   54  104:invokevirtual   #100 <Method zzub zzwd()>
	//   55  107:invokevirtual   #104 <Method Object Class.cast(Object)>
	//   56  110:checkcast       #53  <Class zzub>
	//   57  113:areturn         
		Object obj1;
		obj1;
	//   58  114:astore_1        
		try
		{
			throw new IllegalStateException(((Throwable) (obj1)));
	//   59  115:new             #106 <Class IllegalStateException>
	//   60  118:dup             
	//   61  119:aload_1         
	//   62  120:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//   63  123:athrow          
		}
	//*  64  124:astore_1        
	//*  65  125:new             #106 <Class IllegalStateException>
	//*  66  128:dup             
	//*  67  129:aload_1         
	//*  68  130:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//*  69  133:athrow          
	//*  70  134:astore_1        
	//*  71  135:new             #106 <Class IllegalStateException>
	//*  72  138:dup             
	//*  73  139:aload_1         
	//*  74  140:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//*  75  143:athrow          
	//*  76  144:astore_1        
	//*  77  145:new             #106 <Class IllegalStateException>
	//*  78  148:dup             
	//*  79  149:aload_1         
	//*  80  150:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//*  81  153:athrow          
	//*  82  154:ldc1            #2   <Class zzum>
	//*  83  156:aload_2         
	//*  84  157:invokestatic    #115 <Method ServiceLoader ServiceLoader.load(Class, ClassLoader)>
	//*  85  160:invokevirtual   #119 <Method Iterator ServiceLoader.iterator()>
	//*  86  163:astore_2        
	//*  87  164:new             #121 <Class ArrayList>
	//*  88  167:dup             
	//*  89  168:invokespecial   #122 <Method void ArrayList()>
	//*  90  171:astore_3        
	//*  91  172:aload_2         
	//*  92  173:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//*  93  178:ifeq            272
	//*  94  181:aload_3         
	//*  95  182:aload_0         
	//*  96  183:aload_2         
	//*  97  184:invokeinterface #132 <Method Object Iterator.next()>
	//*  98  189:checkcast       #2   <Class zzum>
	//*  99  192:invokevirtual   #100 <Method zzub zzwd()>
	//* 100  195:invokevirtual   #104 <Method Object Class.cast(Object)>
	//* 101  198:checkcast       #53  <Class zzub>
	//* 102  201:invokevirtual   #135 <Method boolean ArrayList.add(Object)>
	//* 103  204:pop             
	//* 104  205:goto            172
	//* 105  208:astore          4
	//* 106  210:getstatic       #29  <Field Logger logger>
	//* 107  213:astore          5
	//* 108  215:getstatic       #141 <Field Level Level.SEVERE>
	//* 109  218:astore          6
	//* 110  220:aload_0         
	//* 111  221:invokevirtual   #76  <Method String Class.getSimpleName()>
	//* 112  224:invokestatic    #145 <Method String String.valueOf(Object)>
	//* 113  227:astore_1        
	//* 114  228:aload_1         
	//* 115  229:invokevirtual   #149 <Method int String.length()>
	//* 116  232:ifeq            245
	//* 117  235:ldc1            #151 <String "Unable to load ">
	//* 118  237:aload_1         
	//* 119  238:invokevirtual   #155 <Method String String.concat(String)>
	//* 120  241:astore_1        
	//* 121  242:goto            255
	//* 122  245:new             #78  <Class String>
	//* 123  248:dup             
	//* 124  249:ldc1            #151 <String "Unable to load ">
	//* 125  251:invokespecial   #156 <Method void String(String)>
	//* 126  254:astore_1        
	//* 127  255:aload           5
	//* 128  257:aload           6
	//* 129  259:ldc1            #158 <String "com.google.protobuf.GeneratedExtensionRegistryLoader">
	//* 130  261:ldc1            #159 <String "load">
	//* 131  263:aload_1         
	//* 132  264:aload           4
	//* 133  266:invokevirtual   #163 <Method void Logger.logp(Level, String, String, String, Throwable)>
	//* 134  269:goto            172
	//* 135  272:aload_3         
	//* 136  273:invokevirtual   #166 <Method int ArrayList.size()>
	//* 137  276:iconst_1        
	//* 138  277:icmpne          289
	//* 139  280:aload_3         
	//* 140  281:iconst_0        
	//* 141  282:invokevirtual   #170 <Method Object ArrayList.get(int)>
	//* 142  285:checkcast       #53  <Class zzub>
	//* 143  288:areturn         
	//* 144  289:aload_3         
	//* 145  290:invokevirtual   #166 <Method int ArrayList.size()>
	//* 146  293:ifne            298
	//* 147  296:aconst_null     
	//* 148  297:areturn         
	//* 149  298:aload_0         
	//* 150  299:ldc1            #172 <String "combine">
	//* 151  301:iconst_1        
	//* 152  302:anewarray       Class[]
	//* 153  305:dup             
	//* 154  306:iconst_0        
	//* 155  307:ldc1            #174 <Class Collection>
	//* 156  309:aastore         
	//* 157  310:invokevirtual   #178 <Method Method Class.getMethod(String, Class[])>
	//* 158  313:aconst_null     
	//* 159  314:iconst_1        
	//* 160  315:anewarray       Object[]
	//* 161  318:dup             
	//* 162  319:iconst_0        
	//* 163  320:aload_3         
	//* 164  321:aastore         
	//* 165  322:invokevirtual   #184 <Method Object Method.invoke(Object, Object[])>
	//* 166  325:checkcast       #53  <Class zzub>
	//* 167  328:astore_0        
	//* 168  329:aload_0         
	//* 169  330:areturn         
	//* 170  331:astore_0        
	//* 171  332:new             #106 <Class IllegalStateException>
	//* 172  335:dup             
	//* 173  336:aload_0         
	//* 174  337:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//* 175  340:athrow          
	//* 176  341:astore_0        
	//* 177  342:new             #106 <Class IllegalStateException>
	//* 178  345:dup             
	//* 179  346:aload_0         
	//* 180  347:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//* 181  350:athrow          
	//* 182  351:astore_0        
	//* 183  352:new             #106 <Class IllegalStateException>
	//* 184  355:dup             
	//* 185  356:aload_0         
	//* 186  357:invokespecial   #109 <Method void IllegalStateException(Throwable)>
	//* 187  360:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			obj2 = ((Object) (ServiceLoader.load(com/google/android/gms/internal/measurement/zzum, ((ClassLoader) (obj2))).iterator()));
		}
		break MISSING_BLOCK_LABEL_164;
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
				arraylist.add(((Object) ((zzub)class1.cast(((Object) (((zzum)((Iterator) (obj2)).next()).zzwd()))))));
			}
			catch(ServiceConfigurationError serviceconfigurationerror)
			{
				Logger logger1 = logger;
				Level level = Level.SEVERE;
				String s = String.valueOf(((Object) (class1.getSimpleName())));
				if(s.length() != 0)
					s = "Unable to load ".concat(s);
				else
					s = new String("Unable to load ");
				logger1.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", s, ((Throwable) (serviceconfigurationerror)));
			}
		if(arraylist.size() == 1)
			return (zzub)arraylist.get(0);
		if(arraylist.size() == 0)
			return null;
		try
		{
			class1 = ((Class) ((zzub)class1.getMethod("combine", new Class[] {
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
		return ((zzub) (class1));
	//* 188  361:astore_1        
	//* 189  362:goto            154
	}

	protected abstract zzub zzwd();

	private static final Logger logger = Logger.getLogger(((Class) (com/google/android/gms/internal/measurement/zztv)).getName());
	private static String zzbyd = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

	static 
	{
	//    0    0:ldc1            #15  <Class zztv>
	//    1    2:invokevirtual   #21  <Method String Class.getName()>
	//    2    5:invokestatic    #27  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #29  <Field Logger logger>
	//*   4   11:return          
	}
}
