// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package butterknife:
//			Unbinder, Action, Setter

public final class ButterKnife
{
	public static interface Action
		extends butterknife.Action
	{
	}

	public static interface Setter
		extends butterknife.Setter
	{
	}


	private ButterKnife()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #30  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #32  <String "No instances.">
	//    5   10:invokespecial   #35  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static Unbinder bind(Activity activity)
	{
		return bind(((Object) (activity)), activity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #45  <Method Window Activity.getWindow()>
	//    3    5:invokevirtual   #51  <Method View Window.getDecorView()>
	//    4    8:invokestatic    #54  <Method Unbinder bind(Object, View)>
	//    5   11:areturn         
	}

	public static Unbinder bind(Dialog dialog)
	{
		return bind(((Object) (dialog)), dialog.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #60  <Method Window Dialog.getWindow()>
	//    3    5:invokevirtual   #51  <Method View Window.getDecorView()>
	//    4    8:invokestatic    #54  <Method Unbinder bind(Object, View)>
	//    5   11:areturn         
	}

	public static Unbinder bind(View view)
	{
		return bind(((Object) (view)), view);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #54  <Method Unbinder bind(Object, View)>
	//    3    5:areturn         
	}

	public static Unbinder bind(Object obj, View view)
	{
		Object obj1 = ((Object) (obj.getClass()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Class Object.getClass()>
	//    2    4:astore_2        
		if(debug)
	//*   3    5:getstatic       #73  <Field boolean debug>
	//*   4    8:ifeq            45
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #75  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #76  <Method void StringBuilder()>
	//    8   18:astore_3        
			stringbuilder.append("Looking up binding for ");
	//    9   19:aload_3         
	//   10   20:ldc1            #78  <String "Looking up binding for ">
	//   11   22:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
			stringbuilder.append(((Class) (obj1)).getName());
	//   13   26:aload_3         
	//   14   27:aload_2         
	//   15   28:invokevirtual   #88  <Method String Class.getName()>
	//   16   31:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			Log.d("ButterKnife", stringbuilder.toString());
	//   18   35:ldc1            #90  <String "ButterKnife">
	//   19   37:aload_3         
	//   20   38:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   21   41:invokestatic    #99  <Method int Log.d(String, String)>
	//   22   44:pop             
		}
		obj1 = ((Object) (findBindingConstructorForClass(((Class) (obj1)))));
	//   23   45:aload_2         
	//   24   46:invokestatic    #103 <Method Constructor findBindingConstructorForClass(Class)>
	//   25   49:astore_2        
		if(obj1 == null)
	//*  26   50:aload_2         
	//*  27   51:ifnonnull       58
			return Unbinder.EMPTY;
	//   28   54:getstatic       #109 <Field Unbinder Unbinder.EMPTY>
	//   29   57:areturn         
		try
		{
			obj = ((Object) ((Unbinder)((Constructor) (obj1)).newInstance(new Object[] {
				obj, view
			})));
	//   30   58:aload_2         
	//   31   59:iconst_2        
	//   32   60:anewarray       Object[]
	//   33   63:dup             
	//   34   64:iconst_0        
	//   35   65:aload_0         
	//   36   66:aastore         
	//   37   67:dup             
	//   38   68:iconst_1        
	//   39   69:aload_1         
	//   40   70:aastore         
	//   41   71:invokevirtual   #115 <Method Object Constructor.newInstance(Object[])>
	//   42   74:checkcast       #105 <Class Unbinder>
	//   43   77:astore_0        
		}
	//*  44   78:aload_0         
	//*  45   79:areturn         
	//*  46   80:astore_0        
	//*  47   81:aload_0         
	//*  48   82:invokevirtual   #119 <Method Throwable InvocationTargetException.getCause()>
	//*  49   85:astore_0        
	//*  50   86:aload_0         
	//*  51   87:instanceof      #121 <Class RuntimeException>
	//*  52   90:ifne            116
	//*  53   93:aload_0         
	//*  54   94:instanceof      #123 <Class Error>
	//*  55   97:ifeq            105
	//*  56  100:aload_0         
	//*  57  101:checkcast       #123 <Class Error>
	//*  58  104:athrow          
	//*  59  105:new             #121 <Class RuntimeException>
	//*  60  108:dup             
	//*  61  109:ldc1            #125 <String "Unable to create binding instance.">
	//*  62  111:aload_0         
	//*  63  112:invokespecial   #128 <Method void RuntimeException(String, Throwable)>
	//*  64  115:athrow          
	//*  65  116:aload_0         
	//*  66  117:checkcast       #121 <Class RuntimeException>
	//*  67  120:athrow          
	//*  68  121:astore_0        
	//*  69  122:new             #75  <Class StringBuilder>
	//*  70  125:dup             
	//*  71  126:invokespecial   #76  <Method void StringBuilder()>
	//*  72  129:astore_1        
	//*  73  130:aload_1         
	//*  74  131:ldc1            #130 <String "Unable to invoke ">
	//*  75  133:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//*  76  136:pop             
	//*  77  137:aload_1         
	//*  78  138:aload_2         
	//*  79  139:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//*  80  142:pop             
	//*  81  143:new             #121 <Class RuntimeException>
	//*  82  146:dup             
	//*  83  147:aload_1         
	//*  84  148:invokevirtual   #93  <Method String StringBuilder.toString()>
	//*  85  151:aload_0         
	//*  86  152:invokespecial   #128 <Method void RuntimeException(String, Throwable)>
	//*  87  155:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  88  156:astore_0        
		{
			view = ((View) (new StringBuilder()));
	//   89  157:new             #75  <Class StringBuilder>
	//   90  160:dup             
	//   91  161:invokespecial   #76  <Method void StringBuilder()>
	//   92  164:astore_1        
			((StringBuilder) (view)).append("Unable to invoke ");
	//   93  165:aload_1         
	//   94  166:ldc1            #130 <String "Unable to invoke ">
	//   95  168:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   96  171:pop             
			((StringBuilder) (view)).append(obj1);
	//   97  172:aload_1         
	//   98  173:aload_2         
	//   99  174:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//  100  177:pop             
			throw new RuntimeException(((StringBuilder) (view)).toString(), ((Throwable) (obj)));
	//  101  178:new             #121 <Class RuntimeException>
	//  102  181:dup             
	//  103  182:aload_1         
	//  104  183:invokevirtual   #93  <Method String StringBuilder.toString()>
	//  105  186:aload_0         
	//  106  187:invokespecial   #128 <Method void RuntimeException(String, Throwable)>
	//  107  190:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			view = ((View) (new StringBuilder()));
			((StringBuilder) (view)).append("Unable to invoke ");
			((StringBuilder) (view)).append(obj1);
			throw new RuntimeException(((StringBuilder) (view)).toString(), ((Throwable) (obj)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			obj = ((Object) (((InvocationTargetException) (obj)).getCause()));
			if(!(obj instanceof RuntimeException))
			{
				if(obj instanceof Error)
					throw (Error)obj;
				else
					throw new RuntimeException("Unable to create binding instance.", ((Throwable) (obj)));
			} else
			{
				throw (RuntimeException)obj;
			}
		}
		return ((Unbinder) (obj));
	}

	private static Constructor findBindingConstructorForClass(Class class1)
	{
		Object obj = ((Object) ((Constructor)BINDINGS.get(((Object) (class1)))));
	//    0    0:getstatic       #26  <Field Map BINDINGS>
	//    1    3:aload_0         
	//    2    4:invokeinterface #145 <Method Object Map.get(Object)>
	//    3    9:checkcast       #111 <Class Constructor>
	//    4   12:astore_1        
		if(obj == null && !BINDINGS.containsKey(((Object) (class1)))) goto _L2; else goto _L1
	//    5   13:aload_1         
	//    6   14:ifnonnull       254
	//    7   17:getstatic       #26  <Field Map BINDINGS>
	//    8   20:aload_0         
	//    9   21:invokeinterface #149 <Method boolean Map.containsKey(Object)>
	//   10   26:ifeq            32
	//*  11   29:goto            254
_L2:
		String s = class1.getName();
	//   12   32:aload_0         
	//   13   33:invokevirtual   #88  <Method String Class.getName()>
	//   14   36:astore_3        
		if(!s.startsWith("android.") && !s.startsWith("java.") && !s.startsWith("androidx.")) goto _L4; else goto _L3
	//   15   37:aload_3         
	//   16   38:ldc1            #151 <String "android.">
	//   17   40:invokevirtual   #157 <Method boolean String.startsWith(String)>
	//   18   43:ifne            238
	//   19   46:aload_3         
	//   20   47:ldc1            #159 <String "java.">
	//   21   49:invokevirtual   #157 <Method boolean String.startsWith(String)>
	//   22   52:ifne            238
	//   23   55:aload_3         
	//   24   56:ldc1            #161 <String "androidx.">
	//   25   58:invokevirtual   #157 <Method boolean String.startsWith(String)>
	//   26   61:ifeq            67
	//*  27   64:goto            238
_L4:
		Object obj1;
		obj = ((Object) (class1.getClassLoader()));
	//   28   67:aload_0         
	//   29   68:invokevirtual   #165 <Method ClassLoader Class.getClassLoader()>
	//   30   71:astore_1        
		obj1 = ((Object) (new StringBuilder()));
	//   31   72:new             #75  <Class StringBuilder>
	//   32   75:dup             
	//   33   76:invokespecial   #76  <Method void StringBuilder()>
	//   34   79:astore_2        
		((StringBuilder) (obj1)).append(s);
	//   35   80:aload_2         
	//   36   81:aload_3         
	//   37   82:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   38   85:pop             
		((StringBuilder) (obj1)).append("_ViewBinding");
	//   39   86:aload_2         
	//   40   87:ldc1            #167 <String "_ViewBinding">
	//   41   89:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
		obj1 = ((Object) (((ClassLoader) (obj)).loadClass(((StringBuilder) (obj1)).toString()).getConstructor(new Class[] {
			class1, android/view/View
		})));
	//   43   93:aload_1         
	//   44   94:aload_2         
	//   45   95:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   46   98:invokevirtual   #173 <Method Class ClassLoader.loadClass(String)>
	//   47  101:iconst_2        
	//   48  102:anewarray       Class[]
	//   49  105:dup             
	//   50  106:iconst_0        
	//   51  107:aload_0         
	//   52  108:aastore         
	//   53  109:dup             
	//   54  110:iconst_1        
	//   55  111:ldc1            #175 <Class View>
	//   56  113:aastore         
	//   57  114:invokevirtual   #179 <Method Constructor Class.getConstructor(Class[])>
	//   58  117:astore_2        
		obj = obj1;
	//   59  118:aload_2         
	//   60  119:astore_1        
		if(!debug) goto _L6; else goto _L5
	//   61  120:getstatic       #73  <Field boolean debug>
	//   62  123:ifeq            225
_L5:
		Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
	//   63  126:ldc1            #90  <String "ButterKnife">
	//   64  128:ldc1            #181 <String "HIT: Loaded binding class and constructor.">
	//   65  130:invokestatic    #99  <Method int Log.d(String, String)>
	//   66  133:pop             
		obj = obj1;
	//   67  134:aload_2         
	//   68  135:astore_1        
		  goto _L6
	//*  69  136:goto            225
		class1;
	//   70  139:astore_0        
		obj = ((Object) (new StringBuilder()));
	//   71  140:new             #75  <Class StringBuilder>
	//   72  143:dup             
	//   73  144:invokespecial   #76  <Method void StringBuilder()>
	//   74  147:astore_1        
		((StringBuilder) (obj)).append("Unable to find binding constructor for ");
	//   75  148:aload_1         
	//   76  149:ldc1            #183 <String "Unable to find binding constructor for ">
	//   77  151:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   78  154:pop             
		((StringBuilder) (obj)).append(s);
	//   79  155:aload_1         
	//   80  156:aload_3         
	//   81  157:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   82  160:pop             
		throw new RuntimeException(((StringBuilder) (obj)).toString(), ((Throwable) (class1)));
	//   83  161:new             #121 <Class RuntimeException>
	//   84  164:dup             
	//   85  165:aload_1         
	//   86  166:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   87  169:aload_0         
	//   88  170:invokespecial   #128 <Method void RuntimeException(String, Throwable)>
	//   89  173:athrow          
_L8:
		if(debug)
	//*  90  174:getstatic       #73  <Field boolean debug>
	//*  91  177:ifeq            217
		{
			obj = ((Object) (new StringBuilder()));
	//   92  180:new             #75  <Class StringBuilder>
	//   93  183:dup             
	//   94  184:invokespecial   #76  <Method void StringBuilder()>
	//   95  187:astore_1        
			((StringBuilder) (obj)).append("Not found. Trying superclass ");
	//   96  188:aload_1         
	//   97  189:ldc1            #185 <String "Not found. Trying superclass ">
	//   98  191:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   99  194:pop             
			((StringBuilder) (obj)).append(class1.getSuperclass().getName());
	//  100  195:aload_1         
	//  101  196:aload_0         
	//  102  197:invokevirtual   #188 <Method Class Class.getSuperclass()>
	//  103  200:invokevirtual   #88  <Method String Class.getName()>
	//  104  203:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  105  206:pop             
			Log.d("ButterKnife", ((StringBuilder) (obj)).toString());
	//  106  207:ldc1            #90  <String "ButterKnife">
	//  107  209:aload_1         
	//  108  210:invokevirtual   #93  <Method String StringBuilder.toString()>
	//  109  213:invokestatic    #99  <Method int Log.d(String, String)>
	//  110  216:pop             
		}
		obj = ((Object) (findBindingConstructorForClass(class1.getSuperclass())));
	//  111  217:aload_0         
	//  112  218:invokevirtual   #188 <Method Class Class.getSuperclass()>
	//  113  221:invokestatic    #103 <Method Constructor findBindingConstructorForClass(Class)>
	//  114  224:astore_1        
_L6:
		BINDINGS.put(((Object) (class1)), obj);
	//  115  225:getstatic       #26  <Field Map BINDINGS>
	//  116  228:aload_0         
	//  117  229:aload_1         
	//  118  230:invokeinterface #192 <Method Object Map.put(Object, Object)>
	//  119  235:pop             
		return ((Constructor) (obj));
	//  120  236:aload_1         
	//  121  237:areturn         
_L3:
		if(debug)
	//* 122  238:getstatic       #73  <Field boolean debug>
	//* 123  241:ifeq            252
			Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
	//  124  244:ldc1            #90  <String "ButterKnife">
	//  125  246:ldc1            #194 <String "MISS: Reached framework class. Abandoning search.">
	//  126  248:invokestatic    #99  <Method int Log.d(String, String)>
	//  127  251:pop             
		return null;
	//  128  252:aconst_null     
	//  129  253:areturn         
_L1:
		if(debug)
	//* 130  254:getstatic       #73  <Field boolean debug>
	//* 131  257:ifeq            268
			Log.d("ButterKnife", "HIT: Cached in binding map.");
	//  132  260:ldc1            #90  <String "ButterKnife">
	//  133  262:ldc1            #196 <String "HIT: Cached in binding map.">
	//  134  264:invokestatic    #99  <Method int Log.d(String, String)>
	//  135  267:pop             
		return ((Constructor) (obj));
	//  136  268:aload_1         
	//  137  269:areturn         
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//  138  270:astore_1        
		if(true) goto _L8; else goto _L7
_L7:
	//* 139  271:goto            174
	}

	static final Map BINDINGS = new LinkedHashMap();
	private static boolean debug = false;

	static 
	{
	//    0    0:new             #21  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void LinkedHashMap()>
	//    3    7:putstatic       #26  <Field Map BINDINGS>
	//*   4   10:return          
	}
}
